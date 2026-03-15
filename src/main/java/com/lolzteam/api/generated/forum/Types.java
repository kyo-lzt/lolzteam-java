// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

public final class Types {

	private Types() {
	}

	// ─── Component Schemas ────────────────────────────────────────

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_NotificationModel(
			@JsonProperty("notification_id") long notificationId,
			@JsonProperty("notification_create_date") long notificationCreateDate,
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
			@JsonProperty("content_action") String contentAction,
			@JsonProperty("notification_is_unread") boolean notificationIsUnread,
			@JsonProperty("creator_user_id") long creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("notification_type") String notificationType,
			JsonNode links,
			@JsonProperty("notification_html") String notificationHtml
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModel(
			@JsonProperty("link_id") long linkId,
			@JsonProperty("link_title") String linkTitle,
			@JsonProperty("link_description") String linkDescription,
			JsonNode links,
			JsonNode permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModel(
			@JsonProperty("can_report") boolean canReport,
			long date,
			@JsonProperty("is_deleted") boolean isDeleted,
			String message,
			@JsonProperty("message_id") long messageId,
			String messageJson,
			String messageRaw,
			JsonNode room,
			JsonNode user
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModel(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("user_message_count") long userMessageCount,
			@JsonProperty("user_register_date") long userRegisterDate,
			@JsonProperty("user_like_count") long userLikeCount,
			@JsonProperty("user_like2_count") long userLike2Count,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("trophy_count") long trophyCount,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			String balance,
			String hold,
			String currency,
			@JsonProperty("user_email") String userEmail,
			@JsonProperty("user_unread_notification_count") long userUnreadNotificationCount,
			@JsonProperty("user_unread_conversation_count") long userUnreadConversationCount,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_deposit") long userDeposit,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") long userLastSeenDate,
			JsonNode links,
			JsonNode permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("curator_titles") List<String> curatorTitles,
			@JsonProperty("user_groups") List<JsonNode> userGroups,
			List<JsonNode> fields,
			@JsonProperty("user_timezone_offset") long userTimezoneOffset,
			@JsonProperty("user_external_authentications") List<JsonNode> userExternalAuthentications,
			@JsonProperty("self_permissions") JsonNode selfPermissions,
			@JsonProperty("edit_permissions") JsonNode editPermissions,
			JsonNode birthday,
			@JsonProperty("secret_answer_rendered") String secretAnswerRendered,
			@JsonProperty("secret_answer_first_letter") String secretAnswerFirstLetter,
			@JsonProperty("user_following") JsonNode userFollowing,
			@JsonProperty("user_followers") JsonNode userFollowers,
			String banner
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModel(
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("thread_title") String threadTitle,
			@JsonProperty("thread_view_count") long threadViewCount,
			@JsonProperty("creator_user_id") long creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("thread_create_date") long threadCreateDate,
			@JsonProperty("thread_update_date") long threadUpdateDate,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("thread_post_count") long threadPostCount,
			@JsonProperty("thread_is_published") boolean threadIsPublished,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted,
			@JsonProperty("thread_is_sticky") boolean threadIsSticky,
			@JsonProperty("thread_is_closed") boolean threadIsClosed,
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("thread_is_starred") boolean threadIsStarred,
			@JsonProperty("first_post") JsonNode firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") JsonNode threadTags,
			JsonNode links,
			JsonNode permissions,
			@JsonProperty("node_title") String nodeTitle,
			JsonNode restrictions,
			@JsonProperty("last_post") JsonNode lastPost,
			JsonNode contest
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModel(
			@JsonProperty("post_id") long postId,
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			String signature,
			@JsonProperty("signature_html") String signatureHtml,
			@JsonProperty("signature_plain_text") String signaturePlainText,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			JsonNode links,
			JsonNode permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModel(
			@JsonProperty("post_comment_id") long postCommentId,
			@JsonProperty("post_id") long postId,
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_create_date") long postCommentCreateDate,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") long postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") long postCommentUpdateDate,
			JsonNode links,
			JsonNode permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModel(
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("timeline_user_id") long timelineUserId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_comment_count") long postCommentCount,
			@JsonProperty("post_comments_is_disabled") long postCommentsIsDisabled,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_is_liked") boolean postIsLiked,
			@JsonProperty("post_is_sticked") boolean postIsSticked,
			JsonNode links,
			JsonNode permissions,
			@JsonProperty("timeline_user") Resp_UserModel timelineUser
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModel(
			@JsonProperty("comment_id") long commentId,
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("comment_user_id") long commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") long commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("comment_body_html") String commentBodyHtml,
			@JsonProperty("comment_body_plain_text") String commentBodyPlainText,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") long timelineUserId,
			JsonNode links,
			JsonNode permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModel(
			@JsonProperty("conversation_id") long conversationId,
			@JsonProperty("conversation_title") String conversationTitle,
			@JsonProperty("creator_user_id") long creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("conversation_create_date") long conversationCreateDate,
			@JsonProperty("conversation_update_date") long conversationUpdateDate,
			@JsonProperty("conversation_last_read_date") long conversationLastReadDate,
			@JsonProperty("conversation_online_count") long conversationOnlineCount,
			@JsonProperty("is_starred") long isStarred,
			@JsonProperty("is_group") long isGroup,
			@JsonProperty("is_unread") long isUnread,
			long alerts,
			JsonNode permissions,
			@JsonProperty("conversation_message_count") long conversationMessageCount,
			@JsonProperty("conversation_is_new") boolean conversationIsNew,
			@JsonProperty("creator_is_ignored") boolean creatorIsIgnored,
			@JsonProperty("conversation_is_open") boolean conversationIsOpen,
			@JsonProperty("conversation_is_deleted") boolean conversationIsDeleted,
			JsonNode recipient,
			List<JsonNode> recipients,
			JsonNode links
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModel(
			@JsonProperty("message_id") long messageId,
			@JsonProperty("conversation_id") long conversationId,
			@JsonProperty("creator_user_id") long creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("message_create_date") long messageCreateDate,
			@JsonProperty("message_is_unread") long messageIsUnread,
			@JsonProperty("message_need_translate") boolean messageNeedTranslate,
			@JsonProperty("message_is_system") boolean messageIsSystem,
			@JsonProperty("message_edit_date") long messageEditDate,
			@JsonProperty("message_body") String messageBody,
			@JsonProperty("message_body_html") String messageBodyHtml,
			@JsonProperty("message_body_plain_text") String messageBodyPlainText,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			JsonNode links,
			JsonNode permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_SystemInfo(
			@JsonProperty("visitor_id") long visitorId,
			long time
		) {}

	// ─── OAuthApi Types ────────────────────────────────────────

	public static final class OAuthApiTypes {

		private OAuthApiTypes() {
		}

		public record OAuthTokenBody(
			@JsonProperty("grant_type") String grantType,
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret,
			JsonNode scope,
			String code,
			@JsonProperty("redirect_uri") String redirectUri,
			@JsonProperty("refresh_token") String refreshToken,
			String username,
			String password
		) {
			public OAuthTokenBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record OAuthTokenResponse(
			@JsonProperty("access_token") String accessToken,
			@JsonProperty("token_type") String tokenType,
			@JsonProperty("expires_in") long expiresIn,
			@JsonProperty("refresh_token") String refreshToken,
			String scope
		) {}

	}

	// ─── AssetsApi Types ────────────────────────────────────────

	public static final class AssetsApiTypes {

		private AssetsApiTypes() {
		}

		public record AssetsCssParams(
			List<String> css
		) {
			public AssetsCssParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AssetsCssResponse(
			String contents,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── CategoriesApi Types ────────────────────────────────────────

	public static final class CategoriesApiTypes {

		private CategoriesApiTypes() {
		}

		public record CategoriesListParams(
			@JsonProperty("parent_category_id") Integer parentCategoryId,
			@JsonProperty("parent_forum_id") Integer parentForumId,
			String order
		) {
			public CategoriesListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponse(
			List<JsonNode> categories,
			@JsonProperty("categories_total") long categoriesTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponse(
			JsonNode category,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ForumsApi Types ────────────────────────────────────────

	public static final class ForumsApiTypes {

		private ForumsApiTypes() {
		}

		public record ForumsListParams(
			@JsonProperty("parent_category_id") Integer parentCategoryId,
			@JsonProperty("parent_forum_id") Integer parentForumId,
			String order
		) {
			public ForumsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponse(
			List<JsonNode> forums,
			@JsonProperty("forums_total") long forumsTotal,
			List<JsonNode> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponse(
			JsonNode data,
			List<JsonNode> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponse(
			JsonNode forum,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ForumsFollowBody(
			Boolean post,
			Boolean alert,
			Boolean email,
			@JsonProperty("prefix_ids") List<Integer> prefixIds,
			@JsonProperty("minimal_contest_amount") Integer minimalContestAmount
		) {
			public ForumsFollowBody() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsUnfollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ForumsFollowedParams(
			Boolean total
		) {
			public ForumsFollowedParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponse(
			List<JsonNode> forums,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponse(
			List<JsonNode> forums,
			@JsonProperty("excluded_forums_ids") List<Long> excludedForumsIds,
			@JsonProperty("default_excluded_forums_ids") List<Long> defaultExcludedForumsIds,
			String keywords,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ForumsEditFeedOptionsBody(
			@JsonProperty("node_ids") List<Integer> nodeIds,
			List<String> keywords
		) {
			public ForumsEditFeedOptionsBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsEditFeedOptionsResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── LinksApi Types ────────────────────────────────────────

	public static final class LinksApiTypes {

		private LinksApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record LinksListResponse(
			@JsonProperty("link-forums") List<Resp_LinkModel> linkForums,
			@JsonProperty("link-forums_total") long linkForumsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record LinksGetResponse(
			@JsonProperty("link-forum") Resp_LinkModel linkForum,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PagesApi Types ────────────────────────────────────────

	public static final class PagesApiTypes {

		private PagesApiTypes() {
		}

		public record PagesListParams(
			@JsonProperty("parent_page_id") Integer parentPageId,
			String order
		) {
			public PagesListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponse(
			List<JsonNode> pages,
			@JsonProperty("pages_total") long pagesTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponse(
			JsonNode page,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── NavigationApi Types ────────────────────────────────────────

	public static final class NavigationApiTypes {

		private NavigationApiTypes() {
		}

		public record NavigationListParams(
			Integer parent
		) {
			public NavigationListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponse(
			List<JsonNode> elements,
			@JsonProperty("elements_count") long elementsCount,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ThreadsApi Types ────────────────────────────────────────

	public static final class ThreadsApiTypes {

		private ThreadsApiTypes() {
		}

		public record ThreadsListParams(
			@JsonProperty("forum_id") Integer forumId,
			String tab,
			String state,
			String period,
			String title,
			@JsonProperty("title_only") Boolean titleOnly,
			@JsonProperty("creator_user_id") Integer creatorUserId,
			Boolean sticky,
			@JsonProperty("prefix_ids[]") List<Integer> prefixIds,
			@JsonProperty("prefix_ids_not[]") List<Integer> prefixIdsNot,
			@JsonProperty("thread_tag_id") Integer threadTagId,
			Integer page,
			Integer limit,
			String order,
			String direction,
			@JsonProperty("thread_create_date") Integer threadCreateDate,
			@JsonProperty("thread_update_date") Integer threadUpdateDate,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsListParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponse(
			List<Resp_ThreadModel> threads,
			JsonNode forum,
			@JsonProperty("threads_total") long threadsTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("forum_id") Integer forumId,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail
		) {
			public ThreadsCreateBody(String postBody, Integer forumId) {
				this(postBody, forumId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsCreateResponse(
			Resp_ThreadModel thread,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsCreateContestBody(
			@JsonProperty("post_body") String postBody,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("contest_type") String contestType,
			@JsonProperty("length_value") Integer lengthValue,
			@JsonProperty("length_option") String lengthOption,
			@JsonProperty("prize_type") String prizeType,
			@JsonProperty("count_winners") Integer countWinners,
			@JsonProperty("prize_data_money") Double prizeDataMoney,
			@JsonProperty("is_money_places") Boolean isMoneyPlaces,
			@JsonProperty("prize_data_places") List<Double> prizeDataPlaces,
			@JsonProperty("prize_data_upgrade") JsonNode prizeDataUpgrade,
			@JsonProperty("require_like_count") Integer requireLikeCount,
			@JsonProperty("require_total_like_count") Integer requireTotalLikeCount,
			@JsonProperty("secret_answer") String secretAnswer,
			List<String> tags,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail
		) {
			public ThreadsCreateContestBody(String postBody, String contestType, String prizeType, Integer requireLikeCount, Integer requireTotalLikeCount) {
				this(postBody, null, null, contestType, null, null, prizeType, null, null, null, null, null, requireLikeCount, requireTotalLikeCount, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsCreateContestResponse(
			Resp_ThreadModel thread,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsClaimBody(
			@JsonProperty("as_responder") String asResponder,
			@JsonProperty("as_is_market_deal") Boolean asIsMarketDeal,
			@JsonProperty("as_market_item_id") Integer asMarketItemId,
			@JsonProperty("as_data") String asData,
			@JsonProperty("as_amount") Double asAmount,
			String currency,
			@JsonProperty("transfer_type") String transferType,
			@JsonProperty("pay_claim") String payClaim,
			@JsonProperty("as_funds_receipt") String asFundsReceipt,
			@JsonProperty("as_tg_login_screenshot") String asTgLoginScreenshot,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail,
			@JsonProperty("post_body") String postBody
		) {
			public ThreadsClaimBody(String asResponder, Boolean asIsMarketDeal, Double asAmount, String transferType, String postBody) {
				this(asResponder, asIsMarketDeal, null, null, asAmount, null, transferType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, postBody);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsClaimResponse(
			Resp_ThreadModel thread,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsGetParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsGetResponse(
			Resp_ThreadModel thread,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsEditBody(
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			List<String> tags,
			@JsonProperty("discussion_open") Boolean discussionOpen,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup
		) {
			public ThreadsEditBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsEditResponse(
			Resp_ThreadModel thread,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsDeleteBody(
			String reason
		) {
			public ThreadsDeleteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsMoveBody(
			@JsonProperty("node_id") String nodeId,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			@JsonProperty("apply_thread_prefix") Boolean applyThreadPrefix,
			@JsonProperty("send_alert") Boolean sendAlert
		) {
			public ThreadsMoveBody(String nodeId) {
				this(nodeId, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsMoveResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsBumpResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsHideResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsStarResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnstarResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsFollowBody(
			Boolean email
		) {
			public ThreadsFollowBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnfollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsFollowedParams(
			Boolean total,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsFollowedParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponse(
			List<JsonNode> threads,
			@JsonProperty("threads_total") long threadsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponse(
			List<JsonNode> elements,
			@JsonProperty("elements_count") long elementsCount,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponse(
			JsonNode poll,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsPollVoteBody(
			@JsonProperty("response_id") Integer responseId,
			@JsonProperty("response_ids") List<Integer> responseIds
		) {
			public ThreadsPollVoteBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollVoteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsUnreadParams(
			Integer limit,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public ThreadsUnreadParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponse(
			List<Resp_ThreadModel> threads,
			List<JsonNode> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ThreadsRecentParams(
			Integer days,
			Integer limit,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public ThreadsRecentParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponse(
			List<Resp_ThreadModel> threads,
			List<JsonNode> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFinishResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PostsApi Types ────────────────────────────────────────

	public static final class PostsApiTypes {

		private PostsApiTypes() {
		}

		public record PostsListParams(
			@JsonProperty("thread_id") Integer threadId,
			@JsonProperty("page_of_post_id") Integer pageOfPostId,
			Integer page,
			Integer limit,
			String order
		) {
			public PostsListParams() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsListResponse(
			List<Resp_ThreadModel> posts,
			Resp_ThreadModel thread,
			@JsonProperty("posts_total") long postsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("thread_id") Integer threadId,
			@JsonProperty("quote_post_id") Integer quotePostId
		) {
			public PostsCreateBody(String postBody) {
				this(postBody, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCreateResponse(
			Resp_PostModel post,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsGetResponse(
			Resp_PostModel post,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsEditBody(
			@JsonProperty("post_body") String postBody
		) {
			public PostsEditBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsEditResponse(
			Resp_PostModel post,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsDeleteBody(
			String reason
		) {
			public PostsDeleteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsLikesParams(
			Integer page,
			Integer limit
		) {
			public PostsLikesParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikesResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikeResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsUnlikeResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsReportBody(
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsReportResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsGetParams(
			@JsonProperty("post_id") Integer postId,
			Integer before,
			@JsonProperty("before_comment") Integer beforeComment
		) {
			public PostsCommentsGetParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsGetResponse(
			List<Resp_PostCommentModel> comments,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsCreateBody(
			@JsonProperty("post_id") Integer postId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponse(
			JsonNode comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsEditBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponse(
			JsonNode comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsDeleteBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String reason
		) {
			public PostsCommentsDeleteBody(Integer postCommentId) {
				this(postCommentId, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsReportBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsReportResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── UsersApi Types ────────────────────────────────────────

	public static final class UsersApiTypes {

		private UsersApiTypes() {
		}

		public record UsersListParams(
			Integer page,
			Integer limit,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersListResponse(
			List<Resp_UserModel> users,
			@JsonProperty("users_total") long usersTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFieldsResponse(
			List<JsonNode> fields,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersFindParams(
			String username,
			@JsonProperty("custom_fields") JsonNode customFields,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersFindParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFindResponse(
			List<Resp_UserModel> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersGetParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersGetResponse(
			Resp_UserModel user,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersEditBody(
			String username,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("display_group_id") Integer displayGroupId,
			@JsonProperty("display_icon_group_id") Integer displayIconGroupId,
			@JsonProperty("display_banner_id") Integer displayBannerId,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			@JsonProperty("user_dob_day") Integer userDobDay,
			@JsonProperty("user_dob_month") Integer userDobMonth,
			@JsonProperty("user_dob_year") Integer userDobYear,
			@JsonProperty("secret_answer") String secretAnswer,
			@JsonProperty("secret_answer_type") Integer secretAnswerType,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("language_id") JsonNode languageId,
			String gender,
			String timezone,
			@JsonProperty("receive_admin_email") Boolean receiveAdminEmail,
			@JsonProperty("activity_visible") Boolean activityVisible,
			@JsonProperty("show_dob_date") Boolean showDobDate,
			@JsonProperty("show_dob_year") Boolean showDobYear,
			@JsonProperty("hide_username_change_logs") Boolean hideUsernameChangeLogs,
			@JsonProperty("allow_view_profile") String allowViewProfile,
			@JsonProperty("allow_post_profile") String allowPostProfile,
			@JsonProperty("allow_send_personal_conversation") String allowSendPersonalConversation,
			@JsonProperty("allow_invite_group") String allowInviteGroup,
			@JsonProperty("allow_receive_news_feed") String allowReceiveNewsFeed,
			JsonNode alert,
			JsonNode fields
		) {
			public UsersEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersEditResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersClaimsParams(
			String type,
			@JsonProperty("claim_state") String claimState
		) {
			public UsersClaimsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponse(
			List<JsonNode> claims,
			JsonNode stats,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersAvatarUploadBody(
			byte[] avatar,
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersAvatarUploadBody(byte[] avatar) {
				this(avatar, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersAvatarUploadResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersAvatarDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersAvatarCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersAvatarCropBody() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersAvatarCropResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersBackgroundUploadBody(
			byte[] background,
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersBackgroundUploadBody(byte[] background) {
				this(background, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersBackgroundUploadResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersBackgroundDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersBackgroundCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersBackgroundCropBody() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersBackgroundCropResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersFollowersParams(
			String order,
			Integer page,
			Integer limit
		) {
			public UsersFollowersParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponse(
			List<JsonNode> users,
			@JsonProperty("users_total") long usersTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnfollowResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersFollowingsParams(
			String order,
			Integer page,
			Integer limit
		) {
			public UsersFollowingsParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponse(
			List<JsonNode> users,
			@JsonProperty("users_total") long usersTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersLikesParams(
			@JsonProperty("node_id") Integer nodeId,
			@JsonProperty("like_type") String likeType,
			String type,
			Integer page,
			@JsonProperty("content_type") String contentType,
			@JsonProperty("search_user_id") Integer searchUserId,
			Boolean stats
		) {
			public UsersLikesParams() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersLikesResponse(
			long page,
			long perPage,
			String contentType,
			long totalLikes,
			JsonNode likes,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersIgnoredParams(
			Boolean total
		) {
			public UsersIgnoredParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoreResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersIgnoreEditParams(
			@JsonProperty("ignore_conversations") Boolean ignoreConversations,
			@JsonProperty("ignore_content") Boolean ignoreContent,
			@JsonProperty("restrict_view_profile") Boolean restrictViewProfile
		) {
			public UsersIgnoreEditParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoreEditResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnignoreResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersContentsParams(
			Integer page,
			Integer limit
		) {
			public UsersContentsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			Resp_UserModel user,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponse(
			List<JsonNode> trophies,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSecretAnswerTypesResponse(
			List<JsonNode> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSaResetResponse(
			boolean success,
			@JsonProperty("waiting_time") String waitingTime,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSaCancelResetResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ProfilePostsApi Types ────────────────────────────────────────

	public static final class ProfilePostsApiTypes {

		private ProfilePostsApiTypes() {
		}

		public record ProfilePostsListParams(
			@JsonProperty("posts_user_id") Integer postsUserId,
			Integer page,
			Integer limit,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ProfilePostsListParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsListResponse(
			@JsonProperty("profile_posts") List<Resp_ProfilePostModel> profilePosts,
			long totalProfilePosts,
			boolean canPostOnProfile,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsGetResponse(
			@JsonProperty("profile_post") Resp_ProfilePostModel profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsEditBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("disable_comments") Boolean disableComments
		) {
			public ProfilePostsEditBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponse(
			@JsonProperty("profile_post") JsonNode profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsDeleteParams(
			String reason
		) {
			public ProfilePostsDeleteParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsReportBody(
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsReportResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCreateBody(
			@JsonProperty("user_id") JsonNode userId,
			@JsonProperty("post_body") String postBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponse(
			@JsonProperty("profile_post") JsonNode profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsStickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnstickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikeResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnlikeResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsListParams(
			@JsonProperty("profile_post_id") Integer profilePostId,
			Integer before,
			Integer limit
		) {
			public ProfilePostsCommentsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponse(
			List<Resp_ProfilePostCommentModel> comments,
			@JsonProperty("comments_total") long commentsTotal,
			@JsonProperty("profile_post") JsonNode profilePost,
			@JsonProperty("timeline_user") Resp_UserModel timelineUser,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsCreateBody(
			@JsonProperty("profile_post_id") Integer profilePostId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponse(
			JsonNode comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsEditBody(
			@JsonProperty("comment_id") Integer commentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponse(
			JsonNode comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsDeleteBody(
			@JsonProperty("comment_id") Integer commentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsGetResponse(
			Resp_ProfilePostCommentModel comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsReportBody(
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsReportResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ConversationsApi Types ────────────────────────────────────────

	public static final class ConversationsApiTypes {

		private ConversationsApiTypes() {
		}

		public record ConversationsListParams(
			String folder,
			Integer page,
			Integer limit
		) {
			public ConversationsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponse(
			List<Resp_ConversationModel> conversations,
			@JsonProperty("can_start") boolean canStart,
			List<JsonNode> folders,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsCreateBody(
			@JsonProperty("recipient_id") Integer recipientId,
			List<String> recipients,
			@JsonProperty("is_group") Boolean isGroup,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsCreateBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsCreateResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsUpdateBody(
			@JsonProperty("conversation_id") Integer conversationId,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("history_open") Boolean historyOpen,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages
		) {
			public ConversationsUpdateBody(Integer conversationId) {
				this(conversationId, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsUpdateResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsDeleteBody(
			@JsonProperty("conversation_id") Integer conversationId,
			@JsonProperty("delete_type") String deleteType
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsStartBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsStartResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsSaveBody(
			String link
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsSaveResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsGetResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsMessagesListParams(
			Integer page,
			Integer limit,
			String order,
			Integer before,
			Integer after
		) {
			public ConversationsMessagesListParams() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponse(
			List<Resp_ConversationMessageModel> messages,
			@JsonProperty("messages_total") long messagesTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsMessagesCreateBody(
			@JsonProperty("reply_message_id") Integer replyMessageId,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsMessagesCreateBody(String messageBody) {
				this(null, messageBody);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesCreateResponse(
			Resp_ConversationMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsSearchBody(
			String q,
			@JsonProperty("conversation_id") Integer conversationId,
			@JsonProperty("search_recipients") Boolean searchRecipients
		) {
			public ConversationsSearchBody() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsSearchResponse(
			List<Resp_ConversationModel> conversations,
			boolean recipients,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesGetResponse(
			Resp_ConversationModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsMessagesEditBody(
			@JsonProperty("message_body") String messageBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesEditResponse(
			Resp_ConversationModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsInviteBody(
			List<String> recipients
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsInviteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsKickBody(
			@JsonProperty("user_id") Integer userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsKickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadAllResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesStickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesUnstickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsStarResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsUnstarResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsAlertsEnableResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsAlertsDisableResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── NotificationsApi Types ────────────────────────────────────────

	public static final class NotificationsApiTypes {

		private NotificationsApiTypes() {
		}

		public record NotificationsListParams(
			String type,
			Integer page,
			Integer limit
		) {
			public NotificationsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponse(
			List<Resp_NotificationModel> notifications,
			@JsonProperty("notifications_total") long notificationsTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsGetResponse(
			@JsonProperty("notification_id") long notificationId,
			Resp_NotificationModel notification,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record NotificationsReadBody(
			@JsonProperty("notification_id") Integer notificationId
		) {
			public NotificationsReadBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsReadResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── TagsApi Types ────────────────────────────────────────

	public static final class TagsApiTypes {

		private TagsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsPopularResponse(
			JsonNode tags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record TagsListParams(
			Integer page,
			Integer limit
		) {
			public TagsListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponse(
			JsonNode tags,
			@JsonProperty("tags_total") long tagsTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record TagsGetParams(
			Integer page,
			Integer limit
		) {
			public TagsGetParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponse(
			JsonNode tag,
			List<JsonNode> tagged,
			@JsonProperty("tagged_total") long taggedTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record TagsFindParams(
			String tag
		) {
			public TagsFindParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsFindResponse(
			List<String> tags,
			List<Long> ids,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── SearchApi Types ────────────────────────────────────────

	public static final class SearchApiTypes {

		private SearchApiTypes() {
		}

		public record SearchAllBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit
		) {
			public SearchAllBody() {
				this(null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			List<Resp_UserModel> users,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchThreadsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public SearchThreadsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchPostsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public SearchPostsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchUsersBody(
			String q
		) {
			public SearchUsersBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchUsersResponse(
			List<Resp_UserModel> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchProfilePostsBody(
			String q,
			@JsonProperty("user_id") Integer userId,
			Integer page,
			Integer limit
		) {
			public SearchProfilePostsBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			JsonNode links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchTaggedBody(
			String tag,
			List<String> tags,
			Integer page,
			Integer limit
		) {
			public SearchTaggedBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			@JsonProperty("search_tags") JsonNode searchTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchResultsParams(
			Integer page,
			Integer limit
		) {
			public SearchResultsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponse(
			List<JsonNode> data,
			@JsonProperty("data_total") long dataTotal,
			@JsonProperty("search_tags") JsonNode searchTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchExecuteResponse(
			JsonNode jobs
		) {}

	}

	// ─── ChatboxApi Types ────────────────────────────────────────

	public static final class ChatboxApiTypes {

		private ChatboxApiTypes() {
		}

		public record ChatboxIndexParams(
			@JsonProperty("room_id") JsonNode roomId
		) {
			public ChatboxIndexParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponse(
			List<JsonNode> rooms,
			JsonNode ban,
			List<JsonNode> ignore,
			JsonNode permissions,
			List<String> commands,
			JsonNode roomsOnline,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxGetMessagesParams(
			@JsonProperty("room_id") JsonNode roomId,
			@JsonProperty("before_message_id") Integer beforeMessageId
		) {
			public ChatboxGetMessagesParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetMessagesResponse(
			List<Resp_ChatboxMessageModel> messages,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxPostMessageBody(
			@JsonProperty("room_id") JsonNode roomId,
			@JsonProperty("reply_message_id") Integer replyMessageId,
			String message
		) {
			public ChatboxPostMessageBody(JsonNode roomId, String message) {
				this(roomId, null, message);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostMessageResponse(
			Resp_ChatboxMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxEditMessageBody(
			@JsonProperty("message_id") Integer messageId,
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxEditMessageResponse(
			Resp_ChatboxMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteMessageBody(
			@JsonProperty("message_id") Integer messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteMessageResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxOnlineParams(
			@JsonProperty("room_id") JsonNode roomId
		) {
			public ChatboxOnlineParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponse(
			List<JsonNode> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxReportReasonsParams(
			@JsonProperty("message_id") Integer messageId
		) {
			public ChatboxReportReasonsParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxReportBody(
			@JsonProperty("message_id") Integer messageId,
			String reason
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxGetLeaderboardParams(
			String duration
		) {
			public ChatboxGetLeaderboardParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponse(
			List<JsonNode> leaderboard,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponse(
			List<JsonNode> ignored,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostIgnoreResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteIgnoreResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── FormsApi Types ────────────────────────────────────────

	public static final class FormsApiTypes {

		private FormsApiTypes() {
		}

		public record FormsListParams(
			Integer page
		) {
			public FormsListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponse(
			List<JsonNode> forms,
			long formsPerPage,
			long page,
			long totalForms,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record FormsCreateBody(
			@JsonProperty("form_id") String formId,
			JsonNode fields
		) {
			public FormsCreateBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponse(
			String message,
			JsonNode content,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

}
