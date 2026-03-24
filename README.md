# lolzteam-java

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![CI](https://github.com/kyo-lzt/lolzteam-java/actions/workflows/ci.yml/badge.svg)](https://github.com/kyo-lzt/lolzteam-java/actions)

Java SDK для [Lolzteam](https://lolz.live) Forum и Market API. **266 эндпоинтов** (151 Forum + 115 Market), автоматически сгенерированные из OpenAPI спецификаций. Синхронный и асинхронный (`CompletableFuture`) режимы.

---

## Содержание / Table of Contents

- [Быстрый старт / Quick Start](#быстрый-старт--quick-start)
- [Опции клиента / Client Options](#опции-клиента--client-options)
- [Прокси / Proxy](#прокси--proxy)
- [Авто-retry / Auto-retry](#авто-retry--auto-retry)
- [Обработка ошибок / Error Handling](#обработка-ошибок--error-handling)
- [Rate Limits](#rate-limits)
- [Forum API](#forum-api)
- [Market API](#market-api)
- [Генерация кода / Code Generation](#генерация-кода--code-generation)
- [Сборка и тесты / Build & Test](#сборка-и-тесты--build--test)
- [Структура проекта / Project Structure](#структура-проекта--project-structure)
- [Лицензия / License](#лицензия--license)

---

## Быстрый старт / Quick Start

Требуется **Java 17+**.

```sh
git clone https://github.com/kyo-lzt/lolzteam-java.git
cd lolzteam-java
./gradlew build
```

```java
import com.lolzteam.api.generated.forum.ForumClient;
import com.lolzteam.api.generated.market.MarketClient;

// Быстрый старт — достаточно передать токен
var forum = ForumClient.create("your_token");
var market = MarketClient.create("your_token");

// Синхронный вызов
var threads = forum.threads().list();
var items = market.category().all();

forum.close();
market.close();
```

Каждый метод имеет асинхронный вариант с суффиксом `Async`, возвращающий `CompletableFuture`.

---

## Опции клиента / Client Options

```java
var config = ClientConfig.builder("your_token")
    .baseUrl("https://prod-api.lolz.live")
    .proxy(new ProxyConfig("http://user:pass@127.0.0.1:8080"))
    .retry(new RetryConfig(5, Duration.ofSeconds(1), Duration.ofSeconds(30)))
    .rateLimit(new RateLimitConfig(200))
    .searchRateLimit(new RateLimitConfig(30))
    .timeout(Duration.ofSeconds(15))
    .onRetry(info -> System.out.printf("Retry #%d: %s %s%n", info.attempt(), info.method(), info.path()))
    .build();
```

| Параметр | Тип | По умолчанию | Описание |
|----------|-----|-------------|----------|
| `token` | `String` | *обязательный* | API токен доступа |
| `baseUrl` | `String` | per-client | Переопределение базового URL |
| `proxy` | `ProxyConfig` | `null` | HTTP прокси |
| `retry` | `RetryConfig` | 3 retries, 1s base, 30s max | Настройки повторных запросов |
| `rateLimit` | `RateLimitConfig` | Forum: 300/min, Market: 120/min | Лимит запросов в минуту |
| `searchRateLimit` | `RateLimitConfig` | Market: 20/min | Лимит поисковых запросов |
| `timeout` | `Duration` | `30s` | Таймаут запроса |
| `onRetry` | `Consumer<RetryInfo>` | `null` | Callback при каждом повторе |

---

## Прокси / Proxy

Маршрутизация запросов через HTTP прокси:

```java
// HTTP прокси
var config = ClientConfig.builder("your_token")
    .proxy(new ProxyConfig("http://127.0.0.1:8080"))
    .build();

// С аутентификацией
var config = ClientConfig.builder("your_token")
    .proxy(new ProxyConfig("http://user:pass@127.0.0.1:8080"))
    .build();
```

---

## Авто-retry / Auto-retry

Неуспешные запросы автоматически повторяются при транзиентных ошибках. Задержка использует экспоненциальный backoff с jitter. Заголовок `Retry-After` на 429 ответах учитывается.

| Статус | Повтор | Поведение |
|--------|--------|-----------|
| 429 | Да | Использует `Retry-After` заголовок |
| 502, 503, 504 | Да | Экспоненциальный backoff с jitter |
| Сетевые ошибки | Да | Таймаут и ошибки соединения |
| 401, 403 | Нет | Выбрасывается немедленно |
| 404 | Нет | Выбрасывается немедленно |

Формула задержки: `min(baseDelay * 2^attempt + random(0, baseDelay), maxDelay)`

```java
// Отключить retry
var config = ClientConfig.builder("your_token")
    .retry(null)
    .build();

// Callback при повторе
var config = ClientConfig.builder("your_token")
    .onRetry(info -> System.out.printf("Retry #%d%n", info.attempt()))
    .build();
```

---

## Обработка ошибок / Error Handling

Все исключения наследуют sealed-класс `LolzteamException`:

```
LolzteamException (sealed)
├── HttpException
│   ├── RateLimitException    (429)
│   ├── AuthException         (401, 403)
│   ├── NotFoundException     (404)
│   └── ServerException       (500, 502, 503)
├── NetworkException
├── ConfigException
└── RetryExhaustedException
```

```java
try {
    var result = forum.threads().list();
} catch (RateLimitException e) {
    System.err.println("Превышен лимит запросов, повтор через: " + e.retryAfter());
} catch (AuthException e) {
    System.err.println("Невалидный или истёкший токен");
} catch (NotFoundException e) {
    System.err.println("Ресурс не найден");
} catch (ServerException e) {
    System.err.println("Ошибка сервера: " + e.statusCode());
} catch (HttpException e) {
    System.err.println("HTTP " + e.statusCode() + ": " + e.responseBody());
} catch (NetworkException e) {
    System.err.println("Сетевая ошибка: " + e.getMessage());
}
```

---

## Rate Limits

Встроенный rate limiter использует алгоритм token bucket. Потокобезопасен, работает как с синхронными, так и с асинхронными вызовами. При пустом бакете синхронные вызовы блокируются, асинхронные ожидают -- запросы не отбрасываются.

| Клиент | Лимит по умолчанию |
|--------|--------------------|
| Forum  | 300 req/min |
| Market | 120 req/min |
| Market (search) | 20 req/min |

```java
var config = ClientConfig.builder("your_token")
    .rateLimit(new RateLimitConfig(200))
    .searchRateLimit(new RateLimitConfig(30))
    .build();
```

---

## Forum API

### OAuth

```java
// Получить OAuth токен (POST /oauth/token)
var token = forum.oAuth().token(new OAuthTokenBody().clientId("id").clientSecret("secret"));
```

### Ассеты / Assets

```java
// Получить CSS ассеты (GET /assets/css)
var css = forum.assets().css();
var css = forum.assets().css(new AssetsCssParams().prefix("xf"));
```

### Категории / Categories

```java
// Получить список категорий (GET /categories)
var categories = forum.categories().list();
var categories = forum.categories().list(new CategoriesListParams().parentCategoryId(1L));

// Получить категорию по ID (GET /categories/:categoryId)
var category = forum.categories().get(1);
```

### Форумы / Forums

```java
// Получить список форумов (GET /forums)
var forums = forum.forums().list();
var forums = forum.forums().list(new ForumsListParams().parentForumId(1L));

// Получить форумы с группировкой (GET /forums/grouped)
var grouped = forum.forums().grouped();

// Получить форум по ID (GET /forums/:forumId)
var f = forum.forums().get(876);

// Получить подписчиков форума (GET /forums/:forumId/followers)
var followers = forum.forums().followers(876);

// Подписаться на форум (POST /forums/:forumId/followers)
var follow = forum.forums().follow(876);
var follow = forum.forums().follow(876, new ForumsFollowBody().email(true));

// Отписаться от форума (DELETE /forums/:forumId/followers)
var unfollow = forum.forums().unfollow(876);

// Получить отслеживаемые форумы (GET /forums/followed)
var followed = forum.forums().followed();
var followed = forum.forums().followed(new ForumsFollowedParams().total(true));

// Получить опции ленты (GET /forums/feed-options)
var feedOptions = forum.forums().getFeedOptions();

// Изменить опции ленты (PUT /forums/feed-options)
var edit = forum.forums().editFeedOptions();
var edit = forum.forums().editFeedOptions(new ForumsEditFeedOptionsBody().forumId(876L));
```

### Ссылки / Links

```java
// Получить список ссылок (GET /links)
var links = forum.links().list();

// Получить ссылку по ID (GET /links/:linkId)
var link = forum.links().get(1);
```

### Страницы / Pages

```java
// Получить список страниц (GET /pages)
var pages = forum.pages().list();
var pages = forum.pages().list(new PagesListParams().parentPageId(1L));

// Получить страницу по ID (GET /pages/:pageId)
var page = forum.pages().get(1);
```

### Навигация / Navigation

```java
// Получить элементы навигации (GET /navigation)
var nav = forum.navigation().list();
var nav = forum.navigation().list(new NavigationListParams().parent(1L));
```

### Темы / Threads

```java
// Получить список тем (GET /threads)
var threads = forum.threads().list();
var threads = forum.threads().list(new ThreadsListParams().forumId(876L));

// Создать тему (POST /threads)
var thread = forum.threads().create(new ThreadsCreateBody().forumId(876L).postBody("Текст").title("Заголовок"));

// Создать конкурс (POST /threads/contest)
var contest = forum.threads().createContest(new ThreadsCreateContestBody().forumId(876L).title("Конкурс"));

// Создать заявку на тему (POST /threads/claim)
var claim = forum.threads().claim();
var claim = forum.threads().claim(new ThreadsClaimBody().forumId(876L));

// Получить тему по ID (GET /threads/:threadId)
var t = forum.threads().get(123);
var t = forum.threads().get(123, new ThreadsGetParams().withPosts(true));

// Редактировать тему (PUT /threads/:threadId)
var edit = forum.threads().edit(123, new ThreadsEditBody().title("Новый заголовок"));

// Удалить тему (DELETE /threads/:threadId)
var del = forum.threads().delete(123);
var del = forum.threads().delete(123, new ThreadsDeleteBody().reason("причина"));

// Переместить тему (POST /threads/:threadId/move)
var move = forum.threads().move(123, new ThreadsMoveBody().forumId(876L));

// Поднять тему (POST /threads/:threadId/bump)
var bump = forum.threads().bump(123);

// Скрыть тему (POST /threads/:threadId/hide)
var hide = forum.threads().hide(123);

// Добавить в избранное (POST /threads/:threadId/star)
var star = forum.threads().star(123);

// Убрать из избранного (DELETE /threads/:threadId/star)
var unstar = forum.threads().unstar(123);

// Получить подписчиков темы (GET /threads/:threadId/followers)
var followers = forum.threads().followers(123);

// Подписаться на тему (POST /threads/:threadId/followers)
var follow = forum.threads().follow(123);
var follow = forum.threads().follow(123, new ThreadsFollowBody().email(true));

// Отписаться от темы (DELETE /threads/:threadId/followers)
var unfollow = forum.threads().unfollow(123);

// Получить отслеживаемые темы (GET /threads/followed)
var followed = forum.threads().followed();
var followed = forum.threads().followed(new ThreadsFollowedParams().total(true));

// Получить навигацию темы (GET /threads/:threadId/navigation)
var nav = forum.threads().navigation(123);

// Получить опрос темы (GET /threads/:threadId/poll)
var poll = forum.threads().pollGet(123);

// Голосовать в опросе (POST /threads/:threadId/poll/votes)
var vote = forum.threads().pollVote(123);
var vote = forum.threads().pollVote(123, new ThreadsPollVoteBody().responseId(1L));

// Получить непрочитанные темы (GET /threads/unread)
var unread = forum.threads().unread();
var unread = forum.threads().unread(new ThreadsUnreadParams().forumId(876L));

// Получить последние темы (GET /threads/recent)
var recent = forum.threads().recent();
var recent = forum.threads().recent(new ThreadsRecentParams().forumId(876L));

// Завершить тему (POST /threads/:threadId/finish)
var finish = forum.threads().finish(123);
```

### Посты / Posts

```java
// Получить список постов (GET /posts)
var posts = forum.posts().list();
var posts = forum.posts().list(new PostsListParams().threadId(123L));

// Создать пост (POST /posts)
var post = forum.posts().create(new PostsCreateBody().threadId(123L).postBody("Текст"));

// Получить пост по ID (GET /posts/:postId)
var p = forum.posts().get(456);

// Редактировать пост (PUT /posts/:postId)
var edit = forum.posts().edit(456, new PostsEditBody().postBody("Новый текст"));

// Удалить пост (DELETE /posts/:postId)
var del = forum.posts().delete(456);
var del = forum.posts().delete(456, new PostsDeleteBody().reason("причина"));

// Получить лайки поста (GET /posts/:postId/likes)
var likes = forum.posts().likes(456);
var likes = forum.posts().likes(456, new PostsLikesParams().page(1));

// Лайкнуть пост (POST /posts/:postId/likes)
var like = forum.posts().like(456);

// Убрать лайк (DELETE /posts/:postId/likes)
var unlike = forum.posts().unlike(456);

// Получить причины жалобы (GET /posts/:postId/report/reasons)
var reasons = forum.posts().reportReasons(456);

// Пожаловаться на пост (POST /posts/:postId/report)
var report = forum.posts().report(456);
var report = forum.posts().report(456, new PostsReportBody().message("причина"));

// Получить комментарии (GET /posts/comments)
var comments = forum.posts().commentsGet();
var comments = forum.posts().commentsGet(new PostsCommentsGetParams().postId(456L));

// Создать комментарий (POST /posts/comments)
var comment = forum.posts().commentsCreate(new PostsCommentsCreateBody().postId(456L).commentBody("Текст"));

// Редактировать комментарий (PUT /posts/comments)
var edit = forum.posts().commentsEdit(new PostsCommentsEditBody().commentId(789L).commentBody("Новый текст"));

// Удалить комментарий (DELETE /posts/comments)
var del = forum.posts().commentsDelete(new PostsCommentsDeleteBody().commentId(789L));

// Пожаловаться на комментарий (POST /posts/comments/report)
var report = forum.posts().commentsReport(new PostsCommentsReportBody().commentId(789L));
```

### Пользователи / Users

```java
// Получить список пользователей (GET /users)
var users = forum.users().list();
var users = forum.users().list(new UsersListParams().page(1));

// Получить поля пользователей (GET /users/fields)
var fields = forum.users().fields();

// Найти пользователя (GET /users/find)
var found = forum.users().find(new UsersFindParams().username("test"));

// Получить пользователя по ID (GET /users/:userId)
var user = forum.users().get(StringOrInt.of(1));
var user = forum.users().get(StringOrInt.of(1), new UsersGetParams().withFollowData(true));

// Редактировать пользователя (PUT /users/:userId)
var edit = forum.users().edit(StringOrInt.of(1), new UsersEditBody().customTitle("Титул"));

// Получить жалобы пользователя (GET /users/:userId/claims)
var claims = forum.users().claims(StringOrInt.of(1));
var claims = forum.users().claims(StringOrInt.of(1), new UsersClaimsParams().page(1));

// Загрузить аватар (POST /users/:userId/avatar)
var avatar = forum.users().avatarUpload(StringOrInt.of(1));
var avatar = forum.users().avatarUpload(StringOrInt.of(1), new UsersAvatarUploadBody().avatar("url"));

// Удалить аватар (DELETE /users/:userId/avatar)
var del = forum.users().avatarDelete(StringOrInt.of(1));

// Обрезать аватар (POST /users/:userId/avatar-crop)
var crop = forum.users().avatarCrop(StringOrInt.of(1));
var crop = forum.users().avatarCrop(StringOrInt.of(1), new UsersAvatarCropBody().x(0).y(0));

// Загрузить фон профиля (POST /users/:userId/background)
var bg = forum.users().backgroundUpload(StringOrInt.of(1));

// Удалить фон профиля (DELETE /users/:userId/background)
var del = forum.users().backgroundDelete(StringOrInt.of(1));

// Обрезать фон профиля (POST /users/:userId/background-crop)
var crop = forum.users().backgroundCrop(StringOrInt.of(1), new UsersBackgroundCropBody().x(0).y(0));

// Получить подписчиков (GET /users/:userId/followers)
var followers = forum.users().followers(StringOrInt.of(1));
var followers = forum.users().followers(StringOrInt.of(1), new UsersFollowersParams().page(1));

// Подписаться (POST /users/:userId/followers)
var follow = forum.users().follow(StringOrInt.of(1));

// Отписаться (DELETE /users/:userId/followers)
var unfollow = forum.users().unfollow(StringOrInt.of(1));

// Получить подписки (GET /users/:userId/followings)
var followings = forum.users().followings(StringOrInt.of(1));
var followings = forum.users().followings(StringOrInt.of(1), new UsersFollowingsParams().page(1));

// Получить лайки (GET /users/:userId/likes)
var likes = forum.users().likes(StringOrInt.of(1));
var likes = forum.users().likes(StringOrInt.of(1), new UsersLikesParams().page(1));

// Получить игнорируемых (GET /users/ignored)
var ignored = forum.users().ignored();
var ignored = forum.users().ignored(new UsersIgnoredParams().total(true));

// Игнорировать пользователя (POST /users/:userId/ignore)
var ignore = forum.users().ignore(StringOrInt.of(1));

// Редактировать игнорирование (PUT /users/:userId/ignore)
var edit = forum.users().ignoreEdit(StringOrInt.of(1));
var edit = forum.users().ignoreEdit(StringOrInt.of(1), new UsersIgnoreEditParams().type("content"));

// Снять игнорирование (DELETE /users/:userId/ignore)
var unignore = forum.users().unignore(StringOrInt.of(1));

// Получить контент пользователя (GET /users/:userId/contents)
var contents = forum.users().contents(StringOrInt.of(1));
var contents = forum.users().contents(StringOrInt.of(1), new UsersContentsParams().page(1));

// Получить трофеи (GET /users/:userId/trophies)
var trophies = forum.users().trophies(StringOrInt.of(1));

// Получить типы секретных ответов (GET /users/secret-answer-types)
var types = forum.users().secretAnswerTypes();

// Сбросить секретный ответ (POST /users/sa/reset)
var reset = forum.users().saReset();

// Отменить сброс секретного ответа (POST /users/sa/cancel-reset)
var cancel = forum.users().saCancelReset();
```

### Посты профиля / Profile Posts

```java
// Получить посты профиля пользователя (GET /users/:userId/profile-posts)
var posts = forum.profilePosts().list(StringOrInt.of(1));
var posts = forum.profilePosts().list(StringOrInt.of(1), new ProfilePostsListParams().page(1));

// Получить пост профиля по ID (GET /profile-posts/:profilePostId)
var post = forum.profilePosts().get(123);

// Редактировать пост профиля (PUT /profile-posts/:profilePostId)
var edit = forum.profilePosts().edit(123, new ProfilePostsEditBody().postBody("Новый текст"));

// Удалить пост профиля (DELETE /profile-posts/:profilePostId)
var del = forum.profilePosts().delete(123);
var del = forum.profilePosts().delete(123, new ProfilePostsDeleteParams().reason("причина"));

// Получить причины жалобы (GET /profile-posts/:profilePostId/report/reasons)
var reasons = forum.profilePosts().reportReasons(123);

// Пожаловаться на пост профиля (POST /profile-posts/:profilePostId/report)
var report = forum.profilePosts().report(123);
var report = forum.profilePosts().report(123, new ProfilePostsReportBody().message("причина"));

// Создать пост профиля (POST /profile-posts)
var post = forum.profilePosts().create(new ProfilePostsCreateBody().postBody("Текст"));

// Закрепить пост профиля (POST /profile-posts/:profilePostId/stick)
var stick = forum.profilePosts().stick(123);

// Открепить пост профиля (DELETE /profile-posts/:profilePostId/stick)
var unstick = forum.profilePosts().unstick(123);

// Получить лайки поста профиля (GET /profile-posts/:profilePostId/likes)
var likes = forum.profilePosts().likes(123);

// Лайкнуть пост профиля (POST /profile-posts/:profilePostId/likes)
var like = forum.profilePosts().like(123);

// Убрать лайк (DELETE /profile-posts/:profilePostId/likes)
var unlike = forum.profilePosts().unlike(123);

// Получить комментарии к посту профиля (GET /profile-posts/comments)
var comments = forum.profilePosts().commentsList();
var comments = forum.profilePosts().commentsList(new ProfilePostsCommentsListParams().profilePostId(123L));

// Создать комментарий (POST /profile-posts/comments)
var comment = forum.profilePosts().commentsCreate(new ProfilePostsCommentsCreateBody().profilePostId(123L).commentBody("Текст"));

// Редактировать комментарий (PUT /profile-posts/comments)
var edit = forum.profilePosts().commentsEdit(new ProfilePostsCommentsEditBody().commentId(456L).commentBody("Новый текст"));

// Удалить комментарий (DELETE /profile-posts/comments)
var del = forum.profilePosts().commentsDelete(new ProfilePostsCommentsDeleteBody().commentId(456L));

// Получить комментарий (GET /profile-posts/:profilePostId/comments/:commentId)
var comment = forum.profilePosts().commentsGet(123, 456);

// Пожаловаться на комментарий (POST /profile-posts/comments/:commentId/report)
var report = forum.profilePosts().commentsReport(456);
var report = forum.profilePosts().commentsReport(456, new ProfilePostsCommentsReportBody().message("причина"));
```

### Личные сообщения / Conversations

```java
// Получить список диалогов (GET /conversations)
var convos = forum.conversations().list();
var convos = forum.conversations().list(new ConversationsListParams().page(1));

// Создать диалог (POST /conversations)
var convo = forum.conversations().create(new ConversationsCreateBody().recipientId(1L).title("Привет"));

// Обновить диалог (PUT /conversations)
var update = forum.conversations().update(new ConversationsUpdateBody().conversationId(123L));

// Удалить диалог (DELETE /conversations)
var del = forum.conversations().delete(new ConversationsDeleteBody().conversationId(123L));

// Начать диалог (POST /conversations/start)
var start = forum.conversations().start(new ConversationsStartBody().recipientId(1L));

// Сохранить диалог (POST /conversations/save)
var save = forum.conversations().save(new ConversationsSaveBody().conversationId(123L));

// Получить диалог по ID (GET /conversations/:conversationId)
var convo = forum.conversations().get(123);

// Получить сообщения диалога (GET /conversations/:conversationId/messages)
var messages = forum.conversations().messagesList(123);
var messages = forum.conversations().messagesList(123, new ConversationsMessagesListParams().page(1));

// Создать сообщение (POST /conversations/:conversationId/messages)
var msg = forum.conversations().messagesCreate(123, new ConversationsMessagesCreateBody().messageBody("Текст"));

// Поиск по диалогам (POST /conversations/search)
var search = forum.conversations().search(new ConversationsSearchBody().keyword("текст"));

// Получить сообщение по ID (GET /conversations/messages/:messageId)
var msg = forum.conversations().messagesGet(456);

// Редактировать сообщение (PUT /conversations/:conversationId/messages/:messageId)
var edit = forum.conversations().messagesEdit(123, 456, new ConversationsMessagesEditBody().messageBody("Новый текст"));

// Удалить сообщение (DELETE /conversations/:conversationId/messages/:messageId)
var del = forum.conversations().messagesDelete(123, 456);

// Пригласить в диалог (POST /conversations/:conversationId/invite)
var invite = forum.conversations().invite(123, new ConversationsInviteBody().recipientId(1L));

// Исключить из диалога (POST /conversations/:conversationId/kick)
var kick = forum.conversations().kick(123, new ConversationsKickBody().userId(1L));

// Прочитать диалог (POST /conversations/:conversationId/read)
var read = forum.conversations().read(123);

// Прочитать все диалоги (POST /conversations/read-all)
var readAll = forum.conversations().readAll();

// Закрепить сообщение (POST /conversations/:conversationId/messages/:messageId/stick)
var stick = forum.conversations().messagesStick(123, 456);

// Открепить сообщение (DELETE /conversations/:conversationId/messages/:messageId/stick)
var unstick = forum.conversations().messagesUnstick(123, 456);

// Добавить диалог в избранное (POST /conversations/:conversationId/star)
var star = forum.conversations().star(123);

// Убрать из избранного (DELETE /conversations/:conversationId/star)
var unstar = forum.conversations().unstar(123);

// Включить уведомления (POST /conversations/:conversationId/alerts/enable)
var enable = forum.conversations().alertsEnable(123);

// Отключить уведомления (POST /conversations/:conversationId/alerts/disable)
var disable = forum.conversations().alertsDisable(123);
```

### Уведомления / Notifications

```java
// Получить список уведомлений (GET /notifications)
var notifications = forum.notifications().list();
var notifications = forum.notifications().list(new NotificationsListParams().page(1));

// Получить уведомление по ID (GET /notifications/:notificationId)
var n = forum.notifications().get(123);

// Прочитать уведомления (POST /notifications/read)
var read = forum.notifications().read();
var read = forum.notifications().read(new NotificationsReadBody().notificationId(123L));
```

### Теги / Tags

```java
// Получить популярные теги (GET /tags/popular)
var popular = forum.tags().popular();

// Получить список тегов (GET /tags)
var tags = forum.tags().list();
var tags = forum.tags().list(new TagsListParams().page(1));

// Получить тег по ID (GET /tags/:tagId)
var tag = forum.tags().get(1);
var tag = forum.tags().get(1, new TagsGetParams().page(1));

// Найти тег (GET /tags/find)
var found = forum.tags().find(new TagsFindParams().tag("test"));
```

### Поиск / Search

```java
// Поиск по всему (POST /search/all)
var all = forum.search().all(new SearchAllBody().keyword("текст"));

// Поиск по темам (POST /search/threads)
var threads = forum.search().threads(new SearchThreadsBody().keyword("текст"));

// Поиск по постам (POST /search/posts)
var posts = forum.search().posts(new SearchPostsBody().keyword("текст"));

// Поиск по пользователям (POST /search/users)
var users = forum.search().users(new SearchUsersBody().keyword("текст"));

// Поиск по постам профиля (POST /search/profile-posts)
var profilePosts = forum.search().profilePosts(new SearchProfilePostsBody().keyword("текст"));

// Поиск по тегу (POST /search/tagged)
var tagged = forum.search().tagged(new SearchTaggedBody().tag("test"));

// Получить результаты поиска (GET /search/results/:searchId)
var results = forum.search().results(StringOrInt.of("abc123"));
var results = forum.search().results(StringOrInt.of("abc123"), new SearchResultsParams().page(1));
```

### Batch

```java
// Выполнить пакетный запрос (POST /batch)
var result = forum.batch().execute();
```

### Чатбокс / Chatbox

```java
// Получить индекс чатбокса (GET /chatbox)
var index = forum.chatbox().index();
var index = forum.chatbox().index(new ChatboxIndexParams().page(1));

// Получить сообщения чатбокса (GET /chatbox/messages)
var messages = forum.chatbox().getMessages();
var messages = forum.chatbox().getMessages(new ChatboxGetMessagesParams().page(1));

// Отправить сообщение в чатбокс (POST /chatbox/messages)
var msg = forum.chatbox().postMessage(new ChatboxPostMessageBody().messageBody("Текст"));

// Редактировать сообщение чатбокса (PUT /chatbox/messages)
var edit = forum.chatbox().editMessage(new ChatboxEditMessageBody().messageId(123L).messageBody("Новый текст"));

// Удалить сообщение чатбокса (DELETE /chatbox/messages)
var del = forum.chatbox().deleteMessage(new ChatboxDeleteMessageBody().messageId(123L));

// Получить онлайн пользователей (GET /chatbox/online)
var online = forum.chatbox().online();
var online = forum.chatbox().online(new ChatboxOnlineParams().page(1));

// Получить причины жалобы (GET /chatbox/report/reasons)
var reasons = forum.chatbox().reportReasons();

// Пожаловаться на сообщение (POST /chatbox/report)
var report = forum.chatbox().report(new ChatboxReportBody().messageId(123L));

// Получить таблицу лидеров (GET /chatbox/leaderboard)
var leaderboard = forum.chatbox().getLeaderboard();
var leaderboard = forum.chatbox().getLeaderboard(new ChatboxGetLeaderboardParams().page(1));

// Получить список игнорируемых (GET /chatbox/ignore)
var ignore = forum.chatbox().getIgnore();

// Добавить в игнорируемые (POST /chatbox/ignore)
var add = forum.chatbox().postIgnore(new ChatboxPostIgnoreBody().userId(1L));

// Удалить из игнорируемых (DELETE /chatbox/ignore)
var del = forum.chatbox().deleteIgnore(new ChatboxDeleteIgnoreBody().userId(1L));
```

### Формы / Forms

```java
// Получить список форм (GET /forms)
var forms = forum.forms().list();
var forms = forum.forms().list(new FormsListParams().page(1));

// Создать форму (POST /forms/save)
var form = forum.forms().create(new FormsCreateBody().title("Форма"));
```

---

## Market API

### Категории / Category

```java
// Все аккаунты (GET /market/all)
var all = market.category().all();
var all = market.category().all(new CategoryAllParams().page(1));

// Steam аккаунты (GET /market/steam)
var steam = market.category().steam();
var steam = market.category().steam(new CategorySteamParams().page(1));

// Fortnite аккаунты (GET /market/fortnite)
var fortnite = market.category().fortnite();

// Mihoyo аккаунты (GET /market/mihoyo)
var mihoyo = market.category().mihoyo();

// Riot аккаунты (GET /market/riot)
var riot = market.category().riot();

// Telegram аккаунты (GET /market/telegram)
var telegram = market.category().telegram();

// Supercell аккаунты (GET /market/supercell)
var supercell = market.category().supercell();

// EA аккаунты (GET /market/ea)
var ea = market.category().ea();

// WoT аккаунты (GET /market/wot)
var wot = market.category().wot();

// WoT Blitz аккаунты (GET /market/wot-blitz)
var wotBlitz = market.category().wotBlitz();

// Подарочные карты (GET /market/gifts)
var gifts = market.category().gifts();

// Epic Games аккаунты (GET /market/epic-games)
var epic = market.category().epicGames();

// Escape from Tarkov аккаунты (GET /market/escape-from-tarkov)
var eft = market.category().escapeFromTarkov();

// Social Club аккаунты (GET /market/social-club)
var sc = market.category().socialClub();

// Uplay аккаунты (GET /market/uplay)
var uplay = market.category().uplay();

// Discord аккаунты (GET /market/discord)
var discord = market.category().discord();

// TikTok аккаунты (GET /market/tiktok)
var tiktok = market.category().tikTok();

// Instagram аккаунты (GET /market/instagram)
var instagram = market.category().instagram();

// Battle.net аккаунты (GET /market/battlenet)
var battleNet = market.category().battleNet();

// ChatGPT аккаунты (GET /market/chatgpt)
var chatGPT = market.category().chatGPT();

// VPN аккаунты (GET /market/vpn)
var vpn = market.category().vpn();

// Roblox аккаунты (GET /market/roblox)
var roblox = market.category().roblox();

// Warface аккаунты (GET /market/warface)
var warface = market.category().warface();

// Minecraft аккаунты (GET /market/minecraft)
var minecraft = market.category().minecraft();

// Hytale аккаунты (GET /market/hytale)
var hytale = market.category().hytale();

// Список категорий (GET /market/category)
var list = market.category().list();
var list = market.category().list(new CategoryListParams().page(1));

// Параметры категории (GET /market/category/:categoryName/params)
var params = market.category().params("steam");

// Игры категории (GET /market/category/:categoryName/games)
var games = market.category().games("steam");
```

### Список / List

```java
// Аккаунты пользователя (GET /market/user)
var user = market.list().user();
var user = market.list().user(new ListUserParams().page(1));

// Заказы (GET /market/user/orders)
var orders = market.list().orders();
var orders = market.list().orders(new ListOrdersParams().page(1));

// Состояния аккаунтов (GET /market/user/states)
var states = market.list().states();
var states = market.list().states(new ListStatesParams().page(1));

// Скачать данные аккаунта (GET /market/download/:type)
var download = market.list().download("txt");
var download = market.list().download("txt", new ListDownloadParams().itemId(123L));

// Избранные аккаунты (GET /market/user/favorites)
var favorites = market.list().favorites();
var favorites = market.list().favorites(new ListFavoritesParams().page(1));

// Просмотренные аккаунты (GET /market/user/viewed)
var viewed = market.list().viewed();
var viewed = market.list().viewed(new ListViewedParams().page(1));
```

### Управление / Managing

```java
// Получить аккаунт (GET /market/:itemId)
var item = market.managing().get(123);
var item = market.managing().get(123, new ManagingGetParams().withEmailLogin(true));

// Удалить аккаунт (DELETE /market/:itemId)
var del = market.managing().delete(123);
var del = market.managing().delete(123, new ManagingDeleteBody().reason("причина"));

// Создать жалобу (POST /market/claims)
var claim = market.managing().createClaim(new ManagingCreateClaimBody().itemId(123L));

// Массовое получение аккаунтов (POST /market/bulk-get)
var bulk = market.managing().bulkGet(new ManagingBulkGetBody().itemIds(List.of(1L, 2L)));

// Стоимость инвентаря Steam (GET /market/:itemId/steam-inventory-value)
var value = market.managing().steamInventoryValue(123);

// Стоимость Steam аккаунта (GET /market/steam-value)
var steamValue = market.managing().steamValue();

// Превью Steam профиля (GET /market/:itemId/steam-preview)
var preview = market.managing().steamPreview(123);

// Редактировать аккаунт (PUT /market/:itemId)
var edit = market.managing().edit(123, new ManagingEditBody().price(100L));

// ИИ-оценка цены (GET /market/:itemId/ai-price)
var aiPrice = market.managing().aIPrice(123);

// Цена автовыкупа (GET /market/:itemId/auto-buy-price)
var autoBuyPrice = market.managing().autoBuyPrice(123);

// Заметка к аккаунту (PUT /market/:itemId/note)
var note = market.managing().note(123, new ManagingNoteBody().note("заметка"));

// Обновить стоимость Steam (PUT /market/:itemId/steam-update-value)
var update = market.managing().steamUpdateValue(123);

// Поднять аккаунт (POST /market/:itemId/bump)
var bump = market.managing().bump(123);

// Автоподнятие (POST /market/:itemId/auto-bump)
var autoBump = market.managing().autoBump(123);
var autoBump = market.managing().autoBump(123, new ManagingAutoBumpBody().interval(3600L));

// Отключить автоподнятие (DELETE /market/:itemId/auto-bump)
var disable = market.managing().autoBumpDisable(123);

// Открыть аккаунт (POST /market/:itemId/open)
var open = market.managing().open(123);

// Закрыть аккаунт (POST /market/:itemId/close)
var close = market.managing().close(123);

// Получить изображение (GET /market/:itemId/image)
var image = market.managing().image(123);

// Получить email-код (GET /market/:itemId/email-code)
var code = market.managing().emailCode(123);

// Получить письма v2 (GET /market/letters2)
var letters = market.managing().getLetters2();

// Получить mafile Steam (GET /market/:itemId/steam-get-mafile)
var mafile = market.managing().steamGetMafile(123);

// Добавить mafile Steam (POST /market/:itemId/steam-add-mafile)
var add = market.managing().steamAddMafile(123);

// Удалить mafile Steam (DELETE /market/:itemId/steam-remove-mafile)
var remove = market.managing().steamRemoveMafile(123);

// Получить код mafile Steam (GET /market/:itemId/steam-mafile-code)
var code = market.managing().steamMafileCode(123);

// Steam Desktop Auth (POST /market/:itemId/steam-sda)
var sda = market.managing().steamSDA(123);

// Получить Telegram код (GET /market/:itemId/telegram-code)
var tgCode = market.managing().telegramCode(123);

// Сбросить авторизацию Telegram (POST /market/:itemId/telegram-reset-auth)
var reset = market.managing().telegramResetAuth(123);

// Отказаться от гарантии (POST /market/:itemId/refuse-guarantee)
var refuse = market.managing().refuseGuarantee(123);

// Отклонить видеозапись (POST /market/:itemId/decline-video-recording)
var decline = market.managing().declineVideoRecording(123);

// Проверить гарантию (GET /market/:itemId/check-guarantee)
var check = market.managing().checkGuarantee(123);

// Сменить пароль (POST /market/:itemId/change-password)
var change = market.managing().changePassword(123);

// Временный email пароль (GET /market/:itemId/temp-email-password)
var tempPass = market.managing().tempEmailPassword(123);

// Добавить тег (POST /market/:itemId/tag)
var tag = market.managing().tag(123, new ManagingTagBody().tagId(1L));

// Удалить тег (DELETE /market/:itemId/tag)
var untag = market.managing().untag(123, new ManagingUntagBody().tagId(1L));

// Добавить публичный тег (POST /market/:itemId/public-tag)
var publicTag = market.managing().publicTag(123, new ManagingPublicTagBody().tagId(1L));

// Удалить публичный тег (DELETE /market/:itemId/public-tag)
var publicUntag = market.managing().publicUntag(123, new ManagingPublicUntagBody().tagId(1L));

// Добавить в избранное (POST /market/:itemId/favorite)
var fav = market.managing().favorite(123);

// Убрать из избранного (DELETE /market/:itemId/favorite)
var unfav = market.managing().unfavorite(123);

// Закрепить аккаунт (POST /market/:itemId/stick)
var stick = market.managing().stick(123);

// Открепить аккаунт (DELETE /market/:itemId/stick)
var unstick = market.managing().unstick(123);

// Передать аккаунт (POST /market/:itemId/transfer)
var transfer = market.managing().transfer(123, new ManagingTransferBody().userId(1L));
```

### Профиль / Profile

```java
// Получить жалобы профиля (GET /market/profile/claims)
var claims = market.profile().claims();
var claims = market.profile().claims(new ProfileClaimsParams().page(1));

// Получить профиль (GET /market/profile)
var profile = market.profile().get();
var profile = market.profile().get(new ProfileGetParams().userId(1L));

// Редактировать профиль (PUT /market/profile)
var edit = market.profile().edit(new ProfileEditBody().about("Описание"));
```

### Корзина / Cart

```java
// Получить корзину (GET /market/cart)
var cart = market.cart().get();
var cart = market.cart().get(new CartGetParams().page(1));

// Добавить в корзину (POST /market/cart)
var add = market.cart().add(new CartAddBody().itemId(123L));

// Удалить из корзины (DELETE /market/cart)
var del = market.cart().delete();
var del = market.cart().delete(new CartDeleteBody().itemId(123L));
```

### Покупка / Purchasing

```java
// Быстрая покупка (POST /market/:itemId/fast-buy)
var buy = market.purchasing().fastBuy(123);
var buy = market.purchasing().fastBuy(123, new PurchasingFastBuyBody().price(100L));

// Проверка перед покупкой (GET /market/:itemId/check)
var check = market.purchasing().check(123);

// Подтверждение покупки (POST /market/:itemId/confirm)
var confirm = market.purchasing().confirm(123);
var confirm = market.purchasing().confirm(123, new PurchasingConfirmBody().buyWithoutValidation(true));

// Запрос скидки (POST /market/:itemId/discount-request)
var discount = market.purchasing().discountRequest(123, new PurchasingDiscountRequestBody().price(90L));

// Отмена запроса скидки (DELETE /market/:itemId/discount-request)
var cancel = market.purchasing().discountCancel(123);
```

### Кастомные скидки / Custom Discounts

```java
// Получить кастомные скидки (GET /market/custom-discounts)
var discounts = market.customDiscounts().get();

// Создать кастомную скидку (POST /market/custom-discounts)
var create = market.customDiscounts().create(new CustomDiscountsCreateBody().categoryId(1L));

// Редактировать кастомную скидку (PUT /market/custom-discounts)
var edit = market.customDiscounts().edit(new CustomDiscountsEditBody().discountId(1L));

// Удалить кастомную скидку (DELETE /market/custom-discounts)
var del = market.customDiscounts().delete(new CustomDiscountsDeleteBody().discountId(1L));
```

### Публикация / Publishing

```java
// Быстрая продажа (POST /market/fast-sell)
var sell = market.publishing().fastSell(new PublishingFastSellBody().categoryId(1L));

// Добавить аккаунт (POST /market/add)
var add = market.publishing().add(new PublishingAddBody().categoryId(1L));

// Проверка аккаунта (POST /market/:itemId/check)
var check = market.publishing().check(123);
var check = market.publishing().check(123, new PublishingCheckBody().login("user"));

// Внешний аккаунт (POST /market/:itemId/external)
var ext = market.publishing().external(123);
var ext = market.publishing().external(123, new PublishingExternalBody().login("user"));
```

### Платежи / Payments

```java
// Получить инвойс (GET /market/payments/invoice)
var invoice = market.payments().invoiceGet();
var invoice = market.payments().invoiceGet(new PaymentsInvoiceGetParams().invoiceId(1L));

// Создать инвойс (POST /market/payments/invoice)
var create = market.payments().invoiceCreate(new PaymentsInvoiceCreateBody().amount(100L));

// Список инвойсов (GET /market/payments/invoices)
var list = market.payments().invoiceList();
var list = market.payments().invoiceList(new PaymentsInvoiceListParams().page(1));

// Получить валюты (GET /market/payments/currency)
var currency = market.payments().currency();

// Список балансов (GET /market/payments/balances)
var balances = market.payments().balanceList();

// Обмен валюты (POST /market/payments/balance-exchange)
var exchange = market.payments().balanceExchange(new PaymentsBalanceExchangeBody().amount(100L));

// Перевод средств (POST /market/payments/transfer)
var transfer = market.payments().transfer(new PaymentsTransferBody().userId(1L).amount(100L));

// Рассчитать комиссию (GET /market/payments/fee)
var fee = market.payments().fee(new PaymentsFeeParams().amount(100L));

// Отменить платёж (POST /market/payments/cancel)
var cancel = market.payments().cancel(new PaymentsCancelBody().paymentId(1L));

// История платежей (GET /market/payments/history)
var history = market.payments().history();
var history = market.payments().history(new PaymentsHistoryParams().page(1));

// Сервисы выплат (GET /market/payments/payout-services)
var services = market.payments().payoutServices();

// Выплата (POST /market/payments/payout)
var payout = market.payments().payout(new PaymentsPayoutBody().amount(100L));
```

### Автоплатежи / Auto Payments

```java
// Список автоплатежей (GET /market/auto-payments)
var list = market.autoPayments().list();

// Создать автоплатёж (POST /market/auto-payments)
var create = market.autoPayments().create(new AutoPaymentsCreateBody().userId(1L));

// Удалить автоплатёж (DELETE /market/auto-payments)
var del = market.autoPayments().delete(new AutoPaymentsDeleteBody().paymentId(1L));
```

### Прокси / Proxy

```java
// Получить прокси (GET /market/proxy)
var proxy = market.proxy().get();

// Добавить прокси (POST /market/proxy)
var add = market.proxy().add(new ProxyAddBody().proxyUrl("http://127.0.0.1:8080"));

// Удалить прокси (DELETE /market/proxy)
var del = market.proxy().delete(new ProxyDeleteBody().proxyId(1L));
```

### IMAP

```java
// Создать IMAP подключение (POST /market/imap)
var create = market.imap().create(new ImapCreateBody().host("imap.mail.com"));

// Удалить IMAP подключение (DELETE /market/imap)
var del = market.imap().delete(new ImapDeleteBody().imapId(1L));
```

### Batch

```java
// Выполнить пакетный запрос (POST /batch)
var result = market.batch().batch(List.of(/* запросы */));
```

---

## Генерация кода / Code Generation

Клиенты и типы автоматически генерируются из OpenAPI 3.1.0 спецификаций:

```sh
./gradlew :codegen:run
```

| Вход | Выход |
|------|-------|
| `schemas/forum.json` | `generated/forum/ForumClient.java`, `Types.java` |
| `schemas/market.json` | `generated/market/MarketClient.java`, `Types.java` |

Исходный код генератора находится в `codegen/`.

---

## Сборка и тесты / Build & Test

```sh
./gradlew build           # Собрать проект
./gradlew test            # Запустить тесты
./gradlew assemble        # Собрать без тестов
./gradlew :codegen:run    # Сгенерировать клиенты из OpenAPI спецификаций
```

---

## Структура проекта / Project Structure

```
schemas/                        OpenAPI 3.1.0 спецификации
codegen/                        Генератор кода (Gradle подпроект)
src/
  main/java/com/lolzteam/api/
    runtime/                    HTTP клиент, конфигурация, retry, rate limiter, исключения
    generated/
      forum/                    ForumClient + типы (авто-генерация)
      market/                   MarketClient + типы (авто-генерация)
  test/                         JUnit 5 тесты
build.gradle.kts
```

---

## Лицензия / License

[MIT](LICENSE)
