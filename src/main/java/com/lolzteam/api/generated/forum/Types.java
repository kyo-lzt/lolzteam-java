// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import java.util.Map;

public final class Types {

	private Types() {
	}

	// ─── Enums ───────────────────────────────────────────────────

	public enum GrantType {
		PASSWORD("password");

		private final String value;

		GrantType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategoriesOrder {
		NATURAL("natural"),
		LIST("list");

		private final String value;

		CategoriesOrder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ThreadsOrder {
		POST_DATE("post_date"),
		LAST_POST_DATE("last_post_date"),
		REPLY_COUNT("reply_count"),
		REPLY_COUNT_ASC("reply_count_asc"),
		FIRST_POST_LIKES("first_post_likes"),
		VOTE_COUNT("vote_count");

		private final String value;

		ThreadsOrder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PostsOrder {
		NATURAL("natural"),
		NATURAL_REVERSE("natural_reverse"),
		POST_LIKES("post_likes"),
		POST_LIKES_REVERSE("post_likes_reverse");

		private final String value;

		PostsOrder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum UsersOrder {
		NATURAL("natural"),
		FOLLOW_DATE("follow_date"),
		FOLLOW_DATE_REVERSE("follow_date_reverse");

		private final String value;

		UsersOrder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ConversationsOrder {
		NATURAL("natural"),
		NATURAL_REVERSE("natural_reverse");

		private final String value;

		ConversationsOrder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum State {
		ACTIVE("active"),
		CLOSED("closed");

		private final String value;

		State(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Period {
		DAY("day"),
		WEEK("week"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		Period(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Direction {
		ASC("asc"),
		DESC("desc");

		private final String value;

		Direction(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ReplyGroup {
		V0(0L),
		V2(2L),
		V21(21L),
		V22(22L),
		V23(23L),
		V60(60L),
		V351(351L);

		private final long value;

		ReplyGroup(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum ContestType {
		BY_FINISH_DATE("by_finish_date");

		private final String value;

		ContestType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LengthOption {
		MINUTES("minutes"),
		HOURS("hours"),
		DAYS("days");

		private final String value;

		LengthOption(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PrizeType {
		MONEY("money"),
		UPGRADES("upgrades");

		private final String value;

		PrizeType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PrizeDataUpgrade {
		V1(1L),
		V6(6L),
		V12(12L),
		V14(14L),
		V17(17L),
		V19(19L),
		V20(20L),
		V21(21L),
		V22(22L);

		private final long value;

		PrizeDataUpgrade(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Currency {
		RUB("rub"),
		UAH("uah"),
		KZT("kzt"),
		BYN("byn"),
		USD("usd"),
		EUR("eur"),
		GBP("gbp"),
		CNY("cny"),
		TRY("try");

		private final String value;

		Currency(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum TransferType {
		GUARANTOR("guarantor"),
		SAFE("safe"),
		NOTSAFE("notsafe");

		private final String value;

		TransferType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PayClaim {
		NOW("now"),
		LATER("later");

		private final String value;

		PayClaim(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LanguageId {
		V1(1L),
		V2(2L);

		private final long value;

		LanguageId(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Gender {
		EMPTY(""),
		MALE("male"),
		FEMALE("female");

		private final String value;

		Gender(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Timezone {
		PACIFIC_MIDWAY("Pacific/Midway"),
		PACIFIC_HONOLULU("Pacific/Honolulu"),
		PACIFIC_MARQUESAS("Pacific/Marquesas"),
		AMERICA_ANCHORAGE("America/Anchorage"),
		AMERICA_LOS_ANGELES("America/Los_Angeles"),
		AMERICA_SANTA_ISABEL("America/Santa_Isabel"),
		AMERICA_TIJUANA("America/Tijuana"),
		AMERICA_DENVER("America/Denver"),
		AMERICA_CHIHUAHUA("America/Chihuahua"),
		AMERICA_PHOENIX("America/Phoenix"),
		AMERICA_CHICAGO("America/Chicago"),
		AMERICA_BELIZE("America/Belize"),
		AMERICA_MEXICO_CITY("America/Mexico_City"),
		PACIFIC_EASTER("Pacific/Easter"),
		AMERICA_NEW_YORK("America/New_York"),
		AMERICA_HAVANA("America/Havana"),
		AMERICA_BOGOTA("America/Bogota"),
		AMERICA_CARACAS("America/Caracas"),
		AMERICA_HALIFAX("America/Halifax"),
		AMERICA_GOOSE_BAY("America/Goose_Bay"),
		AMERICA_ASUNCION("America/Asuncion"),
		AMERICA_SANTIAGO("America/Santiago"),
		AMERICA_CUIABA("America/Cuiaba"),
		AMERICA_LA_PAZ("America/La_Paz"),
		AMERICA_ST_JOHNS("America/St_Johns"),
		AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),
		AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),
		AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),
		ATLANTIC_STANLEY("Atlantic/Stanley"),
		AMERICA_GODTHAB("America/Godthab"),
		AMERICA_MONTEVIDEO("America/Montevideo"),
		AMERICA_SAO_PAULO("America/Sao_Paulo"),
		AMERICA_MIQUELON("America/Miquelon"),
		AMERICA_NORONHA("America/Noronha"),
		ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),
		ATLANTIC_AZORES("Atlantic/Azores"),
		EUROPE_LONDON("Europe/London"),
		AFRICA_CASABLANCA("Africa/Casablanca"),
		ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),
		EUROPE_AMSTERDAM("Europe/Amsterdam"),
		AFRICA_ALGIERS("Africa/Algiers"),
		AFRICA_WINDHOEK("Africa/Windhoek"),
		AFRICA_TUNIS("Africa/Tunis"),
		EUROPE_ATHENS("Europe/Athens"),
		AFRICA_JOHANNESBURG("Africa/Johannesburg"),
		EUROPE_KALININGRAD("Europe/Kaliningrad"),
		ASIA_AMMAN("Asia/Amman"),
		ASIA_BEIRUT("Asia/Beirut"),
		AFRICA_CAIRO("Africa/Cairo"),
		ASIA_JERUSALEM("Asia/Jerusalem"),
		ASIA_GAZA("Asia/Gaza"),
		ASIA_DAMASCUS("Asia/Damascus"),
		EUROPE_MOSCOW("Europe/Moscow"),
		EUROPE_MINSK("Europe/Minsk"),
		AFRICA_NAIROBI("Africa/Nairobi"),
		ASIA_TEHRAN("Asia/Tehran"),
		ASIA_DUBAI("Asia/Dubai"),
		ASIA_YEREVAN("Asia/Yerevan"),
		ASIA_BAKU("Asia/Baku"),
		INDIAN_MAURITIUS("Indian/Mauritius"),
		ASIA_KABUL("Asia/Kabul"),
		ASIA_YEKATERINBURG("Asia/Yekaterinburg"),
		ASIA_TASHKENT("Asia/Tashkent"),
		ASIA_KOLKATA("Asia/Kolkata"),
		ASIA_KATHMANDU("Asia/Kathmandu"),
		ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),
		ASIA_DHAKA("Asia/Dhaka"),
		ASIA_ALMATY("Asia/Almaty"),
		ASIA_RANGOON("Asia/Rangoon"),
		ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),
		ASIA_BANGKOK("Asia/Bangkok"),
		ASIA_IRKUTSK("Asia/Irkutsk"),
		ASIA_HONG_KONG("Asia/Hong_Kong"),
		ASIA_SINGAPORE("Asia/Singapore"),
		AUSTRALIA_PERTH("Australia/Perth"),
		ASIA_YAKUTSK("Asia/Yakutsk"),
		ASIA_TOKYO("Asia/Tokyo"),
		ASIA_SEOUL("Asia/Seoul"),
		AUSTRALIA_ADELAIDE("Australia/Adelaide"),
		AUSTRALIA_DARWIN("Australia/Darwin"),
		ASIA_VLADIVOSTOK("Asia/Vladivostok"),
		ASIA_MAGADAN("Asia/Magadan"),
		AUSTRALIA_BRISBANE("Australia/Brisbane"),
		AUSTRALIA_SYDNEY("Australia/Sydney"),
		PACIFIC_NOUMEA("Pacific/Noumea"),
		PACIFIC_NORFOLK("Pacific/Norfolk"),
		ASIA_ANADYR("Asia/Anadyr"),
		PACIFIC_AUCKLAND("Pacific/Auckland"),
		PACIFIC_FIJI("Pacific/Fiji"),
		PACIFIC_CHATHAM("Pacific/Chatham"),
		PACIFIC_TONGATAPU("Pacific/Tongatapu"),
		PACIFIC_APIA("Pacific/Apia"),
		PACIFIC_KIRITIMATI("Pacific/Kiritimati");

		private final String value;

		Timezone(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AllowViewProfile {
		NONE("none"),
		MEMBERS("members"),
		FOLLOWED("followed");

		private final String value;

		AllowViewProfile(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AllowPostProfile {
		NONE("none"),
		MEMBERS("members"),
		FOLLOWED("followed");

		private final String value;

		AllowPostProfile(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AllowSendPersonalConversation {
		NONE("none"),
		MEMBERS("members"),
		FOLLOWED("followed");

		private final String value;

		AllowSendPersonalConversation(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AllowInviteGroup {
		NONE("none"),
		MEMBERS("members"),
		FOLLOWED("followed");

		private final String value;

		AllowInviteGroup(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AllowReceiveNewsFeed {
		NONE("none"),
		MEMBERS("members"),
		FOLLOWED("followed");

		private final String value;

		AllowReceiveNewsFeed(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum UsersType {
		MARKET("market"),
		NOMARKET("nomarket");

		private final String value;

		UsersType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum UsersTypeLikes {
		GOTTEN("gotten"),
		GIVEN("given");

		private final String value;

		UsersTypeLikes(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ClaimState {
		ACTIVE("active"),
		SOLVED("solved"),
		REJECTED("rejected"),
		SETTLED("settled");

		private final String value;

		ClaimState(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LikeType {
		LIKE("like"),
		LIKE2("like2");

		private final String value;

		LikeType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ContentType {
		POST("post"),
		POST_COMMENT("post_comment"),
		PROFILE_POST("profile_post"),
		PROFILE_POST_COMMENT("profile_post_comment");

		private final String value;

		ContentType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Folder {
		ALL("all"),
		UNREAD("unread"),
		GROUPS("groups"),
		MARKET("market"),
		MARKET_REPLACEMENTS("market_replacements"),
		STAFF("staff"),
		GIVEAWAYS("giveaways"),
		P2P("p2p");

		private final String value;

		Folder(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum DeleteType {
		DELETE("delete"),
		DELETE_IGNORE("delete_ignore");

		private final String value;

		DeleteType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum RoomId {
		V1(1L),
		V2(2L),
		V3(3L),
		V4(4L),
		V13(13L);

		private final long value;

		RoomId(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Duration {
		DAY("day"),
		WEEK("week"),
		MONTH("month");

		private final String value;

		Duration(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum FormId {
		V3(3L);

		private final long value;

		FormId(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
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
			Resp_NotificationModelLinks links,
			@JsonProperty("notification_html") String notificationHtml
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_NotificationModelLinks(
			String content,
			@JsonProperty("creator_avatar") String creatorAvatar
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModel(
			@JsonProperty("link_id") long linkId,
			@JsonProperty("link_title") String linkTitle,
			@JsonProperty("link_description") String linkDescription,
			Resp_LinkModelLinks links,
			Resp_LinkModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModelLinks(
			String target,
			String detail
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModelPermissions(
			boolean view
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
			Resp_ChatboxMessageModelRoom room,
			Resp_ChatboxMessageModelUser user
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelRoom(
			@JsonProperty("can_report") boolean canReport,
			boolean eng,
			boolean market,
			@JsonProperty("room_id") long roomId,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserRendered(
			String username,
			Resp_ChatboxMessageModelUserRenderedAvatars avatars,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserUniqBanner(
			@JsonProperty("banner_css") String bannerCss,
			@JsonProperty("banner_text") String bannerText,
			@JsonProperty("banner_icon") String bannerIcon,
			@JsonProperty("username_icon") String usernameIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUser(
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("background_date") long backgroundDate,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			Resp_ChatboxMessageModelUserRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("uniq_banner") Resp_ChatboxMessageModelUserUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") long userId,
			String username
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
			Resp_UserModelLinks links,
			Resp_UserModelPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("curator_titles") List<String> curatorTitles,
			@JsonProperty("user_groups") List<Resp_UserModelUserGroups> userGroups,
			List<Resp_UserModelFields> fields,
			@JsonProperty("user_timezone_offset") long userTimezoneOffset,
			@JsonProperty("user_external_authentications") List<Resp_UserModelUserExternalAuthentications> userExternalAuthentications,
			@JsonProperty("self_permissions") Resp_UserModelSelfPermissions selfPermissions,
			@JsonProperty("edit_permissions") Resp_UserModelEditPermissions editPermissions,
			Resp_UserModelBirthday birthday,
			@JsonProperty("secret_answer_rendered") String secretAnswerRendered,
			@JsonProperty("secret_answer_first_letter") String secretAnswerFirstLetter,
			@JsonProperty("user_following") Resp_UserModelUserFollowing userFollowing,
			@JsonProperty("user_followers") Resp_UserModelUserFollowers userFollowers,
			String banner
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelLinks(
			String permalink,
			String detail,
			String avatar,
			@JsonProperty("avatar_big") String avatarBig,
			@JsonProperty("avatar_small") String avatarSmall,
			String followers,
			String followings,
			String ignore,
			@JsonProperty("background_l") String backgroundL,
			@JsonProperty("background_m") String backgroundM,
			String status,
			String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelPermissions(
			boolean edit,
			boolean follow,
			boolean ignore,
			@JsonProperty("profile_post") boolean profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserGroups(
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("user_group_title") String userGroupTitle,
			@JsonProperty("user_group_title_en") String userGroupTitleEn,
			@JsonProperty("user_group_banner_css_class") String userGroupBannerCssClass,
			@JsonProperty("user_group_banner_text") String userGroupBannerText,
			@JsonProperty("user_group_banner_text_en") String userGroupBannerTextEn,
			@JsonProperty("display_group_selectable") boolean displayGroupSelectable,
			@JsonProperty("display_banner_selectable") boolean displayBannerSelectable,
			@JsonProperty("display_icon_selectable") boolean displayIconSelectable,
			@JsonProperty("is_primary_group") boolean isPrimaryGroup,
			@JsonProperty("user_group_icon_class") String userGroupIconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelFieldsChoices(
			String key,
			String value
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelFields(
			String id,
			String title,
			String description,
			String position,
			@JsonProperty("is_required") boolean isRequired,
			String value,
			@JsonProperty("is_multi_choice") boolean isMultiChoice,
			List<Resp_UserModelFieldsChoices> choices,
			List<JsonNode> values
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserExternalAuthentications(
			String provider,
			@JsonProperty("provider_key") String providerKey
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelSelfPermissions(
			@JsonProperty("create_conversation") boolean createConversation
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelEditPermissions(
			boolean password,
			@JsonProperty("user_email") boolean userEmail,
			boolean username,
			@JsonProperty("user_title") boolean userTitle,
			@JsonProperty("short_link") boolean shortLink,
			@JsonProperty("hide_username_logs") boolean hideUsernameLogs,
			@JsonProperty("primary_group_id") boolean primaryGroupId,
			@JsonProperty("secondary_group_ids") boolean secondaryGroupIds,
			@JsonProperty("user_dob_day") boolean userDobDay,
			@JsonProperty("user_dob_month") boolean userDobMonth,
			@JsonProperty("user_dob_year") boolean userDobYear,
			boolean fields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelBirthdayTimeStamp(
			String date,
			@JsonProperty("timezone_type") long timezoneType,
			String timezone
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelBirthday(
			long age,
			Resp_UserModelBirthdayTimeStamp timeStamp,
			String format
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowingUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowing(
			List<Resp_UserModelUserFollowingUsers> users,
			long count
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowersUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowers(
			List<Resp_UserModelUserFollowersUsers> users,
			long count
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
			@JsonProperty("first_post") Resp_ThreadModelFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") Resp_ThreadModelThreadTags threadTags,
			Resp_ThreadModelLinks links,
			Resp_ThreadModelPermissions permissions,
			@JsonProperty("node_title") String nodeTitle,
			Resp_ThreadModelRestrictions restrictions,
			@JsonProperty("last_post") Resp_ThreadModelLastPost lastPost,
			Resp_ThreadModelContest contest
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPost(
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
			@JsonProperty("post_is_liked") boolean postIsLiked,
			Resp_ThreadModelFirstPostLinks links,
			Resp_ThreadModelFirstPostPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelThreadTags(
			@JsonProperty("97491") String _97491,
			@JsonProperty("193431") String _193431,
			@JsonProperty("206") String _206
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelPermissionsBump(
			boolean can,
			@JsonProperty("available_count") long availableCount,
			JsonNode error,
			@JsonProperty("next_available_time") JsonNode nextAvailableTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			boolean edit,
			@JsonProperty("edit_title") boolean editTitle,
			@JsonProperty("edit_tags") boolean editTags,
			Resp_ThreadModelPermissionsBump bump
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelRestrictions(
			@JsonProperty("reply_delay") long replyDelay,
			@JsonProperty("max_reply_count") long maxReplyCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPost(
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
			@JsonProperty("post_is_liked") boolean postIsLiked,
			Resp_ThreadModelLastPostLinks links,
			Resp_ThreadModelLastPostPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelContestPermissions(
			@JsonProperty("can_finish") boolean canFinish,
			@JsonProperty("can_participate") boolean canParticipate,
			@JsonProperty("can_participate_error") String canParticipateError,
			@JsonProperty("can_view_user_list") boolean canViewUserList
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelContest(
			String type,
			@JsonProperty("finish_date") long finishDate,
			@JsonProperty("now_count_members") long nowCountMembers,
			@JsonProperty("needed_members") long neededMembers,
			@JsonProperty("is_finished") long isFinished,
			@JsonProperty("count_winners") long countWinners,
			@JsonProperty("require_like_count") long requireLikeCount,
			@JsonProperty("require_total_like_count") long requireTotalLikeCount,
			@JsonProperty("prize_type") String prizeType,
			@JsonProperty("prize_type_phrase") String prizeTypePhrase,
			@JsonProperty("prize_data") long prizeData,
			@JsonProperty("is_money_places") long isMoneyPlaces,
			@JsonProperty("chance_to_win") double chanceToWin,
			List<Long> winners,
			@JsonProperty("already_participate") boolean alreadyParticipate,
			Resp_ThreadModelContestPermissions permissions
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
			Resp_PostModelLinks links,
			Resp_PostModelPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModelLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModelPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
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
			Resp_PostCommentModelLinks links,
			Resp_PostCommentModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModelLinks(
			String permalink,
			String detail,
			String post,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModelPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
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
			Resp_ProfilePostModelLinks links,
			Resp_ProfilePostModelPermissions permissions,
			@JsonProperty("timeline_user") Resp_UserModel timelineUser
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModelLinks(
			String permalink,
			String detail,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			String likes,
			String comments,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModelPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean like,
			boolean comment,
			boolean report,
			boolean stick
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
			Resp_ProfilePostCommentModelLinks links,
			Resp_ProfilePostCommentModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModelLinks(
			String detail,
			@JsonProperty("profile_post") String profilePost,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModelPermissions(
			boolean view,
			boolean delete
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
			Resp_ConversationModelPermissions permissions,
			@JsonProperty("conversation_message_count") long conversationMessageCount,
			@JsonProperty("conversation_is_new") boolean conversationIsNew,
			@JsonProperty("creator_is_ignored") boolean creatorIsIgnored,
			@JsonProperty("conversation_is_open") boolean conversationIsOpen,
			@JsonProperty("conversation_is_deleted") boolean conversationIsDeleted,
			Resp_ConversationModelRecipient recipient,
			List<Resp_ConversationModelRecipients> recipients,
			Resp_ConversationModelLinks links
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelPermissions(
			boolean view,
			boolean reply,
			boolean invite,
			@JsonProperty("manage_invite_links") boolean manageInviteLinks,
			boolean kick,
			@JsonProperty("upload_avatar") boolean uploadAvatar,
			boolean editOwnPost,
			boolean stickyMessages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelRecipient(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("is_online") boolean isOnline,
			@JsonProperty("contacts_changed") boolean contactsChanged,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelRecipients(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("is_online") boolean isOnline,
			@JsonProperty("contacts_changed") boolean contactsChanged,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelLinks(
			String permalink,
			String detail,
			String messages,
			String avatar
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
			Resp_ConversationMessageModelLinks links,
			Resp_ConversationMessageModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModelLinks(
			String detail,
			String conversation,
			String creator,
			@JsonProperty("creator_avatar") String creatorAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModelPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("stick-unstick") boolean stickUnstick
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

		@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "grant_type")
		@JsonSubTypes({
			@JsonSubTypes.Type(value = OAuthTokenBodyClientCredentials.class, name = "client_credentials"),
			@JsonSubTypes.Type(value = OAuthTokenBodyAuthorizationCode.class, name = "authorization_code"),
			@JsonSubTypes.Type(value = OAuthTokenBodyRefreshToken.class, name = "refresh_token"),
			@JsonSubTypes.Type(value = OAuthTokenBodyPassword.class, name = "password")
		})
		public sealed interface OAuthTokenBody permits
			OAuthTokenBodyClientCredentials, OAuthTokenBodyAuthorizationCode, OAuthTokenBodyRefreshToken, OAuthTokenBodyPassword {
		}
	
		@JsonTypeName("client_credentials")
		public record OAuthTokenBodyClientCredentials(
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret,
			JsonNode scope
		) implements OAuthTokenBody {
		}
		@JsonTypeName("authorization_code")
		public record OAuthTokenBodyAuthorizationCode(
			String code,
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret,
			@JsonProperty("redirect_uri") String redirectUri,
			JsonNode scope
		) implements OAuthTokenBody {
		}
		@JsonTypeName("refresh_token")
		public record OAuthTokenBodyRefreshToken(
			@JsonProperty("refresh_token") String refreshToken,
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret
		) implements OAuthTokenBody {
		}
		@JsonTypeName("password")
		public record OAuthTokenBodyPassword(
			String username,
			String password,
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret,
			JsonNode scope
		) implements OAuthTokenBody {
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
			@JsonProperty("parent_category_id") Long parentCategoryId,
			@JsonProperty("parent_forum_id") Long parentForumId,
			CategoriesOrder order
		) {
			public CategoriesListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponse(
			List<CategoriesListResponseCategories> categories,
			@JsonProperty("categories_total") long categoriesTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategoriesLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategoriesPermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategories(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			CategoriesListResponseCategoriesLinks links,
			CategoriesListResponseCategoriesPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponse(
			CategoriesGetResponseCategory category,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategoryLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategoryPermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategory(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			CategoriesGetResponseCategoryLinks links,
			CategoriesGetResponseCategoryPermissions permissions
		) {}

	}

	// ─── ForumsApi Types ────────────────────────────────────────

	public static final class ForumsApiTypes {

		private ForumsApiTypes() {
		}

		public record ForumsListParams(
			@JsonProperty("parent_category_id") Long parentCategoryId,
			@JsonProperty("parent_forum_id") Long parentForumId,
			CategoriesOrder order
		) {
			public ForumsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponse(
			List<ForumsListResponseForums> forums,
			@JsonProperty("forums_total") long forumsTotal,
			List<ForumsListResponseTabs> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<ForumsListResponseForumsForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForums(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<ForumsListResponseForumsForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ForumsListResponseForumsLinks links,
			ForumsListResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseTabs(
			@JsonProperty("link_title") String linkTitle,
			boolean isDefault,
			String title,
			boolean isHidden
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponse(
			ForumsGroupedResponseData data,
			List<ForumsGroupedResponseTabs> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseData00Links(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseData00Permissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseData00(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("parent_node_id") long parentNodeId,
			ForumsGroupedResponseData00Links links,
			ForumsGroupedResponseData00Permissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseData0(
			@JsonProperty("0") ForumsGroupedResponseData00 _0
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseData(
			@JsonProperty("0") ForumsGroupedResponseData0 _0
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseTabs(
			@JsonProperty("link_title") String linkTitle,
			boolean isDefault,
			String title,
			boolean isHidden
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponse(
			ForumsGetResponseForum forum,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<ForumsGetResponseForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<ForumsGetResponseForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ForumsGetResponseForumLinks links,
			ForumsGetResponseForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponse(
			List<ForumsFollowersResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponseUsersFollow(
			boolean post,
			boolean alert,
			boolean email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponseUsers(
			@JsonProperty("user_id") long userId,
			String username,
			ForumsFollowersResponseUsersFollow follow
		) {}

		public record ForumsFollowBody(
			Boolean post,
			Boolean alert,
			Boolean email,
			@JsonProperty("prefix_ids") List<Long> prefixIds,
			@JsonProperty("minimal_contest_amount") Long minimalContestAmount
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
			List<ForumsFollowedResponseForums> forums,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<ForumsFollowedResponseForumsForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsFollow(
			boolean post,
			boolean alert,
			boolean email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForums(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<ForumsFollowedResponseForumsForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ForumsFollowedResponseForumsLinks links,
			ForumsFollowedResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed,
			ForumsFollowedResponseForumsFollow follow
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponse(
			List<ForumsGetFeedOptionsResponseForums> forums,
			@JsonProperty("excluded_forums_ids") List<Long> excludedForumsIds,
			@JsonProperty("default_excluded_forums_ids") List<Long> defaultExcludedForumsIds,
			String keywords,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForumsLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForumsPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForums(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("parent_node_id") long parentNodeId,
			ForumsGetFeedOptionsResponseForumsLinks links,
			ForumsGetFeedOptionsResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed,
			@JsonProperty("has_children") boolean hasChildren
		) {}

		public record ForumsEditFeedOptionsBody(
			@JsonProperty("node_ids") List<Long> nodeIds,
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
			@JsonProperty("parent_page_id") Long parentPageId,
			CategoriesOrder order
		) {
			public PagesListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponse(
			List<PagesListResponsePages> pages,
			@JsonProperty("pages_total") long pagesTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePagesLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-pages") String subPages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePagesPermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePages(
			@JsonProperty("page_id") long pageId,
			@JsonProperty("page_title") String pageTitle,
			@JsonProperty("page_description") String pageDescription,
			PagesListResponsePagesLinks links,
			PagesListResponsePagesPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponse(
			PagesGetResponsePage page,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePageLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-pages") String subPages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePagePermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePage(
			@JsonProperty("page_id") long pageId,
			@JsonProperty("page_title") String pageTitle,
			@JsonProperty("page_description") String pageDescription,
			@JsonProperty("page_view_count") long pageViewCount,
			PagesGetResponsePageLinks links,
			PagesGetResponsePagePermissions permissions,
			@JsonProperty("page_html") String pageHtml
		) {}

	}

	// ─── NavigationApi Types ────────────────────────────────────────

	public static final class NavigationApiTypes {

		private NavigationApiTypes() {
		}

		public record NavigationListParams(
			Long parent
		) {
			public NavigationListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponse(
			List<NavigationListResponseElements> elements,
			@JsonProperty("elements_count") long elementsCount,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElementsLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			@JsonProperty("sub-elements") String subElements
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElementsPermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElements(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			NavigationListResponseElementsLinks links,
			NavigationListResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") String navigationType,
			@JsonProperty("navigation_id") long navigationId,
			@JsonProperty("navigation_parent_id") long navigationParentId,
			@JsonProperty("has_sub_elements") boolean hasSubElements
		) {}

	}

	// ─── ThreadsApi Types ────────────────────────────────────────

	public static final class ThreadsApiTypes {

		private ThreadsApiTypes() {
		}

		public record ThreadsListParams(
			@JsonProperty("forum_id") Long forumId,
			String tab,
			State state,
			Period period,
			String title,
			@JsonProperty("title_only") Boolean titleOnly,
			@JsonProperty("creator_user_id") Long creatorUserId,
			Boolean sticky,
			@JsonProperty("prefix_ids[]") List<Long> prefixIds,
			@JsonProperty("prefix_ids_not[]") List<Long> prefixIdsNot,
			@JsonProperty("thread_tag_id") Long threadTagId,
			Long page,
			Long limit,
			ThreadsOrder order,
			Direction direction,
			@JsonProperty("thread_create_date") Long threadCreateDate,
			@JsonProperty("thread_update_date") Long threadUpdateDate,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsListParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponse(
			List<Resp_ThreadModel> threads,
			ThreadsListResponseForum forum,
			@JsonProperty("threads_total") long threadsTotal,
			ThreadsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ThreadsListResponseForumLinks links,
			ThreadsListResponseForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record ThreadsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("forum_id") Long forumId,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Long> prefixId,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail
		) {
			public ThreadsCreateBody(String postBody, Long forumId) {
				this(postBody, forumId, null, null, null, null, null, null, ReplyGroup.V2, null, null, null, null, null, null, null);
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
			/** Default: by_finish_date */
			@JsonProperty("contest_type") ContestType contestType,
			@JsonProperty("length_value") Long lengthValue,
			@JsonProperty("length_option") LengthOption lengthOption,
			@JsonProperty("prize_type") PrizeType prizeType,
			@JsonProperty("count_winners") Long countWinners,
			@JsonProperty("prize_data_money") Double prizeDataMoney,
			@JsonProperty("is_money_places") Boolean isMoneyPlaces,
			@JsonProperty("prize_data_places") List<Double> prizeDataPlaces,
			@JsonProperty("prize_data_upgrade") PrizeDataUpgrade prizeDataUpgrade,
			@JsonProperty("require_like_count") Long requireLikeCount,
			@JsonProperty("require_total_like_count") Long requireTotalLikeCount,
			@JsonProperty("secret_answer") String secretAnswer,
			List<String> tags,
			/** Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
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
			public ThreadsCreateContestBody(String postBody, ContestType contestType, PrizeType prizeType, Long requireLikeCount, Long requireTotalLikeCount) {
				this(postBody, null, null, contestType, null, null, prizeType, null, null, null, null, null, requireLikeCount, requireTotalLikeCount, null, null, ReplyGroup.V2, null, null, null, null, null, null, null, null, null);
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
			@JsonProperty("as_market_item_id") Long asMarketItemId,
			@JsonProperty("as_data") String asData,
			@JsonProperty("as_amount") Double asAmount,
			Currency currency,
			@JsonProperty("transfer_type") TransferType transferType,
			@JsonProperty("pay_claim") PayClaim payClaim,
			@JsonProperty("as_funds_receipt") String asFundsReceipt,
			@JsonProperty("as_tg_login_screenshot") String asTgLoginScreenshot,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail,
			@JsonProperty("post_body") String postBody
		) {
			public ThreadsClaimBody(String asResponder, Boolean asIsMarketDeal, Double asAmount, TransferType transferType, String postBody) {
				this(asResponder, asIsMarketDeal, null, null, asAmount, null, transferType, null, null, null, null, null, null, ReplyGroup.V2, null, null, null, null, null, null, null, postBody);
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
			@JsonProperty("prefix_id") List<Long> prefixId,
			List<String> tags,
			@JsonProperty("discussion_open") Boolean discussionOpen,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") ReplyGroup replyGroup,
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
			@JsonProperty("prefix_id") List<Long> prefixId,
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
			List<ThreadsFollowersResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponseUsersFollow(
			boolean alert,
			boolean email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponseUsers(
			@JsonProperty("user_id") long userId,
			String username,
			ThreadsFollowersResponseUsersFollow follow
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
			List<ThreadsFollowedResponseThreads> threads,
			@JsonProperty("threads_total") long threadsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostLikeUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("uniq_username_css") String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("like_users") List<ThreadsFollowedResponseThreadsFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			ThreadsFollowedResponseThreadsFirstPostLinks links,
			ThreadsFollowedResponseThreadsFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsThreadTags(
			@JsonProperty("1403") String _1403,
			@JsonProperty("8176") String _8176,
			@JsonProperty("38") String _38,
			@JsonProperty("1953") String _1953,
			@JsonProperty("523") String _523
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit,
			@JsonProperty("edit_title") boolean editTitle,
			@JsonProperty("edit_tags") boolean editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ThreadsFollowedResponseThreadsForumLinks links,
			ThreadsFollowedResponseThreadsForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFollow(
			boolean alert,
			boolean email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreads(
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") ThreadsFollowedResponseThreadsFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") ThreadsFollowedResponseThreadsThreadTags threadTags,
			ThreadsFollowedResponseThreadsLinks links,
			ThreadsFollowedResponseThreadsPermissions permissions,
			ThreadsFollowedResponseThreadsForum forum,
			ThreadsFollowedResponseThreadsFollow follow
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponse(
			List<ThreadsNavigationResponseElements> elements,
			@JsonProperty("elements_count") long elementsCount,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElementsLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			@JsonProperty("sub-elements") String subElements
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElementsPermissions(
			boolean view,
			boolean edit,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElements(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			ThreadsNavigationResponseElementsLinks links,
			ThreadsNavigationResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") String navigationType,
			@JsonProperty("navigation_id") long navigationId,
			@JsonProperty("navigation_depth") long navigationDepth,
			@JsonProperty("navigation_parent_id") long navigationParentId,
			@JsonProperty("has_sub_elements") boolean hasSubElements
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponse(
			ThreadsPollGetResponsePoll poll,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollResponses(
			@JsonProperty("response_id") long responseId,
			@JsonProperty("response_answer") String responseAnswer,
			@JsonProperty("response_vote_count") long responseVoteCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollPermissions(
			boolean vote,
			boolean result
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollLinks(
			String vote
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePoll(
			@JsonProperty("poll_id") long pollId,
			@JsonProperty("poll_question") String pollQuestion,
			@JsonProperty("poll_vote_count") long pollVoteCount,
			@JsonProperty("poll_max_votes") long pollMaxVotes,
			@JsonProperty("poll_is_open") boolean pollIsOpen,
			@JsonProperty("poll_is_voted") boolean pollIsVoted,
			List<ThreadsPollGetResponsePollResponses> responses,
			ThreadsPollGetResponsePollPermissions permissions,
			ThreadsPollGetResponsePollLinks links
		) {}

		public record ThreadsPollVoteBody(
			@JsonProperty("response_id") Long responseId,
			@JsonProperty("response_ids") List<Long> responseIds
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
			Long limit,
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("data_limit") Long dataLimit
		) {
			public ThreadsUnreadParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponse(
			List<Resp_ThreadModel> threads,
			List<ThreadsUnreadResponseData> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostLikeUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("uniq_username_css") String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("like_users") List<ThreadsUnreadResponseDataFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			ThreadsUnreadResponseDataFirstPostLinks links,
			ThreadsUnreadResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_poster") String lastPoster,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ThreadsUnreadResponseDataForumLinks links,
			ThreadsUnreadResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") ThreadsUnreadResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			ThreadsUnreadResponseDataLinks links,
			ThreadsUnreadResponseDataPermissions permissions,
			ThreadsUnreadResponseDataForum forum
		) {}

		public record ThreadsRecentParams(
			Long days,
			Long limit,
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("data_limit") Long dataLimit
		) {
			public ThreadsRecentParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponse(
			List<Resp_ThreadModel> threads,
			List<ThreadsRecentResponseData> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			ThreadsRecentResponseDataFirstPostLinks links,
			ThreadsRecentResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_poster") String lastPoster,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ThreadsRecentResponseDataForumLinks links,
			ThreadsRecentResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") ThreadsRecentResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			ThreadsRecentResponseDataLinks links,
			ThreadsRecentResponseDataPermissions permissions,
			ThreadsRecentResponseDataForum forum
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
			@JsonProperty("thread_id") Long threadId,
			@JsonProperty("page_of_post_id") Long pageOfPostId,
			Long page,
			Long limit,
			PostsOrder order
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
			@JsonProperty("thread_id") Long threadId,
			@JsonProperty("quote_post_id") Long quotePostId
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
			Long page,
			Long limit
		) {
			public PostsLikesParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikesResponse(
			List<PostsLikesResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikesResponseUsers(
			@JsonProperty("user_id") long userId,
			String username
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
			@JsonProperty("post_id") Long postId,
			Long before,
			@JsonProperty("before_comment") Long beforeComment
		) {
			public PostsCommentsGetParams(Long postId) {
				this(postId, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsGetResponse(
			List<Resp_PostCommentModel> comments,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsCreateBody(
			@JsonProperty("post_id") Long postId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponse(
			PostsCommentsCreateResponseComment comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseCommentLinks(
			String permalink,
			String detail,
			String post,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseCommentPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseComment(
			@JsonProperty("post_comment_id") long postCommentId,
			@JsonProperty("post_id") long postId,
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") long postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") long postCommentUpdateDate,
			PostsCommentsCreateResponseCommentLinks links,
			PostsCommentsCreateResponseCommentPermissions permissions
		) {}

		public record PostsCommentsEditBody(
			@JsonProperty("post_comment_id") Long postCommentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponse(
			PostsCommentsEditResponseComment comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseCommentLinks(
			String permalink,
			String detail,
			String post,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseCommentPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseComment(
			@JsonProperty("post_comment_id") long postCommentId,
			@JsonProperty("post_id") long postId,
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") long postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") long postCommentUpdateDate,
			PostsCommentsEditResponseCommentLinks links,
			PostsCommentsEditResponseCommentPermissions permissions
		) {}

		public record PostsCommentsDeleteBody(
			@JsonProperty("post_comment_id") Long postCommentId,
			String reason
		) {
			public PostsCommentsDeleteBody(Long postCommentId) {
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
			@JsonProperty("post_comment_id") Long postCommentId,
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
			Long page,
			Long limit,
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
			UsersListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersListResponseLinks(
			long pages,
			long page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFieldsResponse(
			List<UsersFieldsResponseFields> fields,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFieldsResponseFields(
			String id,
			String title,
			String description,
			String position,
			@JsonProperty("is_required") boolean isRequired
		) {}

		public record UsersFindParams(
			String username,
			@JsonProperty("custom_fields") Map<String, String> customFields,
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
			@JsonProperty("display_group_id") Long displayGroupId,
			@JsonProperty("display_icon_group_id") Long displayIconGroupId,
			@JsonProperty("display_banner_id") Long displayBannerId,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			@JsonProperty("user_dob_day") Long userDobDay,
			@JsonProperty("user_dob_month") Long userDobMonth,
			@JsonProperty("user_dob_year") Long userDobYear,
			@JsonProperty("secret_answer") String secretAnswer,
			@JsonProperty("secret_answer_type") Long secretAnswerType,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("language_id") LanguageId languageId,
			Gender gender,
			Timezone timezone,
			@JsonProperty("receive_admin_email") Boolean receiveAdminEmail,
			@JsonProperty("activity_visible") Boolean activityVisible,
			@JsonProperty("show_dob_date") Boolean showDobDate,
			@JsonProperty("show_dob_year") Boolean showDobYear,
			@JsonProperty("hide_username_change_logs") Boolean hideUsernameChangeLogs,
			@JsonProperty("allow_view_profile") AllowViewProfile allowViewProfile,
			@JsonProperty("allow_post_profile") AllowPostProfile allowPostProfile,
			@JsonProperty("allow_send_personal_conversation") AllowSendPersonalConversation allowSendPersonalConversation,
			@JsonProperty("allow_invite_group") AllowInviteGroup allowInviteGroup,
			@JsonProperty("allow_receive_news_feed") AllowReceiveNewsFeed allowReceiveNewsFeed,
			Map<String, Boolean> alert,
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
			UsersType type,
			@JsonProperty("claim_state") ClaimState claimState
		) {
			public UsersClaimsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponse(
			List<UsersClaimsResponseClaims> claims,
			UsersClaimsResponseStats stats,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseClaims(
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("claim_date") long claimDate,
			@JsonProperty("claim_state") String claimState,
			@JsonProperty("message_body") String messageBody,
			@JsonProperty("message_body_html") String messageBodyHtml,
			@JsonProperty("message_body_plain_text") String messageBodyPlainText,
			long amount,
			@JsonProperty("amount_formatted") String amountFormatted,
			Resp_UserModel author
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsMarket(
			long total,
			long solved,
			long settled,
			long rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsNoMarket(
			long total,
			long solved,
			long settled,
			long rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStats(
			UsersClaimsResponseStatsMarket market,
			UsersClaimsResponseStatsNoMarket noMarket
		) {}

		public record UsersAvatarUploadBody(
			byte[] avatar,
			Long x,
			Long y,
			Long crop
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
			Long x,
			Long y,
			Long crop
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
			Long x,
			Long y,
			Long crop
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
			Long x,
			Long y,
			Long crop
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
			UsersOrder order,
			Long page,
			Long limit
		) {
			public UsersFollowersParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponse(
			List<UsersFollowersResponseUsers> users,
			@JsonProperty("users_total") long usersTotal,
			UsersFollowersResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersLinks(
			String permalink,
			String detail,
			String avatar,
			@JsonProperty("avatar_big") String avatarBig,
			@JsonProperty("avatar_small") String avatarSmall,
			String followers,
			String followings,
			String ignore,
			String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersPermissions(
			boolean edit,
			boolean follow,
			boolean ignore,
			@JsonProperty("profile_post") boolean profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersCustomFields(
			String _4,
			String lztInnovation20Link,
			String lztInnovation30Link,
			String lztInnovationLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsers(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
			@JsonProperty("follow_date") long followDate,
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("user_message_count") long userMessageCount,
			@JsonProperty("user_register_date") long userRegisterDate,
			@JsonProperty("user_like_count") long userLikeCount,
			@JsonProperty("user_like2_count") long userLike2Count,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("trophy_count") long trophyCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") long userLastSeenDate,
			@JsonProperty("user_following_count") long userFollowingCount,
			@JsonProperty("user_followers_count") long userFollowersCount,
			UsersFollowersResponseUsersLinks links,
			UsersFollowersResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("custom_fields") UsersFollowersResponseUsersCustomFields customFields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseLinks(
			long pages,
			long page,
			String next
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
			UsersOrder order,
			Long page,
			Long limit
		) {
			public UsersFollowingsParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponse(
			List<UsersFollowingsResponseUsers> users,
			@JsonProperty("users_total") long usersTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersLinks(
			String permalink,
			String detail,
			String avatar,
			@JsonProperty("avatar_big") String avatarBig,
			@JsonProperty("avatar_small") String avatarSmall,
			String followers,
			String followings,
			String ignore,
			String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersPermissions(
			boolean edit,
			boolean follow,
			boolean ignore,
			@JsonProperty("profile_post") boolean profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersCustomFields(
			String _4,
			List<JsonNode> allowSelfUnban,
			String discord,
			String github,
			String jabber,
			String lztAwardUserTrophy,
			String lztCuratorNodeTitle,
			String lztCuratorNodeTitleEn,
			String lztDeposit,
			String lztInnovation20Link,
			String lztInnovation30Link,
			String lztInnovationLink,
			String lztLikesIncreasing,
			String lztLikesZeroing,
			String lztSympathyIncreasing,
			String lztSympathyZeroing,
			String maecenasValue,
			String scamURL,
			String steam,
			String telegram,
			String vk
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsers(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
			@JsonProperty("follow_date") long followDate,
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
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") long userLastSeenDate,
			@JsonProperty("user_following_count") long userFollowingCount,
			@JsonProperty("user_followers_count") long userFollowersCount,
			UsersFollowingsResponseUsersLinks links,
			UsersFollowingsResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("custom_fields") UsersFollowingsResponseUsersCustomFields customFields
		) {}

		public record UsersLikesParams(
			@JsonProperty("node_id") Long nodeId,
			@JsonProperty("like_type") LikeType likeType,
			/** Default: gotten */
			UsersTypeLikes type,
			Long page,
			/** Default: post */
			@JsonProperty("content_type") ContentType contentType,
			@JsonProperty("search_user_id") Long searchUserId,
			Boolean stats
		) {
			public UsersLikesParams() {
				this(null, null, UsersTypeLikes.GOTTEN, null, ContentType.POST, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersLikesResponse(
			long page,
			long perPage,
			String contentType,
			long totalLikes,
			UsersLikesResponseLikes likes,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersLikesResponseLikes1234567890(
			@JsonProperty("like_id") long likeId,
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
			@JsonProperty("like_user_id") long likeUserId,
			@JsonProperty("like_date") long likeDate,
			@JsonProperty("content_user_id") long contentUserId,
			@JsonProperty("content_state") String contentState,
			Resp_UserModel user,
			Resp_UserModel actionUser,
			String messageHtml,
			@JsonProperty("post_date") long postDate
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersLikesResponseLikes(
			@JsonProperty("1234567890") UsersLikesResponseLikes1234567890 _1234567890
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
			List<UsersIgnoredResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersCustomFields(
			String _4,
			JsonNode scamURL,
			JsonNode lztLikesZeroing,
			JsonNode lztLikesIncreasing,
			JsonNode lztSympathyZeroing,
			JsonNode lztSympathyIncreasing,
			JsonNode telegram,
			String vk,
			String discord,
			String steam,
			JsonNode matrix,
			String jabber,
			String github
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersIgnoredInfo(
			@JsonProperty("ignore_content") long ignoreContent,
			@JsonProperty("ignore_conversations") long ignoreConversations,
			@JsonProperty("restrict_view_profile") long restrictViewProfile
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersRendered(
			String username,
			UsersIgnoredResponseUsersRenderedAvatars avatars,
			List<JsonNode> backgrounds,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsers(
			@JsonProperty("can_edit") boolean canEdit,
			@JsonProperty("can_follow") boolean canFollow,
			@JsonProperty("can_ignore") boolean canIgnore,
			@JsonProperty("can_post_profile") boolean canPostProfile,
			@JsonProperty("can_view_profile") boolean canViewProfile,
			@JsonProperty("can_view_profile_posts") boolean canViewProfilePosts,
			@JsonProperty("can_warn") boolean canWarn,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			long convertedDeposit,
			@JsonProperty("custom_fields") UsersIgnoredResponseUsersCustomFields customFields,
			long deposit,
			String homepage,
			@JsonProperty("ignored_info") UsersIgnoredResponseUsersIgnoredInfo ignoredInfo,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_followed") boolean isFollowed,
			@JsonProperty("is_ignored") boolean isIgnored,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			String location,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			UsersIgnoredResponseUsersRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("user_id") long userId,
			@JsonProperty("user_title") String userTitle,
			String username,
			@JsonProperty("view_url") String viewUrl,
			@JsonProperty("warning_points") long warningPoints
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
			Long page,
			Long limit
		) {
			public UsersContentsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponse(
			List<UsersContentsResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			Resp_UserModel user,
			UsersContentsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataLikeUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("uniq_username_css") String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThreadLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_poster") String lastPoster,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThreadPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThread(
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			UsersContentsResponseDataThreadLinks links,
			UsersContentsResponseDataThreadPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("like_users") List<UsersContentsResponseDataLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			UsersContentsResponseDataLinks links,
			UsersContentsResponseDataPermissions permissions,
			UsersContentsResponseDataThread thread
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseLinks(
			long pages,
			long page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponse(
			List<UsersTrophiesResponseTrophies> trophies,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponseTrophies(
			@JsonProperty("trophy_id") long trophyId,
			String title,
			String description,
			@JsonProperty("trophy_url") String trophyUrl
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSecretAnswerTypesResponse(
			List<UsersSecretAnswerTypesResponseData> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSecretAnswerTypesResponseData(
			@JsonProperty("sa_id") long saId,
			String renderedPhrase
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
			@JsonProperty("posts_user_id") Long postsUserId,
			Long page,
			Long limit,
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
			ProfilePostsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsListResponseLinks(
			long pages,
			long page,
			String next
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
			@JsonProperty("profile_post") ProfilePostsEditResponseProfilePost profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePostLinks(
			String permalink,
			String detail,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			String likes,
			String comments,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean like,
			boolean comment,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePost(
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("timeline_user_id") long timelineUserId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_comment_count") long postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsEditResponseProfilePostLinks links,
			ProfilePostsEditResponseProfilePostPermissions permissions
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
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			@JsonProperty("post_body") String postBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponse(
			@JsonProperty("profile_post") ProfilePostsCreateResponseProfilePost profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePostLinks(
			String permalink,
			String detail,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			String likes,
			String comments,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean like,
			boolean comment,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePost(
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("timeline_user_id") long timelineUserId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_comment_count") long postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsCreateResponseProfilePostLinks links,
			ProfilePostsCreateResponseProfilePostPermissions permissions
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
			List<ProfilePostsLikesResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponseUsers(
			@JsonProperty("user_id") long userId,
			String username
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
			@JsonProperty("profile_post_id") Long profilePostId,
			Long before,
			Long limit
		) {
			public ProfilePostsCommentsListParams(Long profilePostId) {
				this(profilePostId, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponse(
			List<Resp_ProfilePostCommentModel> comments,
			@JsonProperty("comments_total") long commentsTotal,
			@JsonProperty("profile_post") ProfilePostsCommentsListResponseProfilePost profilePost,
			@JsonProperty("timeline_user") Resp_UserModel timelineUser,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePostLinks(
			String permalink,
			String detail,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			String likes,
			String comments,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean like,
			boolean comment,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePost(
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("timeline_user_id") long timelineUserId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_comment_count") long postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsCommentsListResponseProfilePostLinks links,
			ProfilePostsCommentsListResponseProfilePostPermissions permissions
		) {}

		public record ProfilePostsCommentsCreateBody(
			@JsonProperty("profile_post_id") Long profilePostId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponse(
			ProfilePostsCommentsCreateResponseComment comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseCommentLinks(
			String detail,
			@JsonProperty("profile_post") String profilePost,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseCommentPermissions(
			boolean view,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseComment(
			@JsonProperty("comment_id") long commentId,
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("comment_user_id") long commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") long commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") long timelineUserId,
			ProfilePostsCommentsCreateResponseCommentLinks links,
			ProfilePostsCommentsCreateResponseCommentPermissions permissions
		) {}

		public record ProfilePostsCommentsEditBody(
			@JsonProperty("comment_id") Long commentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponse(
			ProfilePostsCommentsEditResponseComment comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseCommentLinks(
			String detail,
			@JsonProperty("profile_post") String profilePost,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseCommentPermissions(
			boolean view,
			boolean delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseComment(
			@JsonProperty("comment_id") long commentId,
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("comment_user_id") long commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") long commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") long timelineUserId,
			ProfilePostsCommentsEditResponseCommentLinks links,
			ProfilePostsCommentsEditResponseCommentPermissions permissions
		) {}

		public record ProfilePostsCommentsDeleteBody(
			@JsonProperty("comment_id") Long commentId
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
			Folder folder,
			Long page,
			Long limit
		) {
			public ConversationsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponse(
			List<Resp_ConversationModel> conversations,
			@JsonProperty("can_start") boolean canStart,
			List<ConversationsListResponseFolders> folders,
			ConversationsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponseFolders(
			String id,
			String title,
			String name
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record ConversationsCreateBody(
			@JsonProperty("recipient_id") Long recipientId,
			List<String> recipients,
			/** Default: false */
			@JsonProperty("is_group") Boolean isGroup,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsCreateBody() {
				this(null, null, false, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsCreateResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsUpdateBody(
			@JsonProperty("conversation_id") Long conversationId,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("history_open") Boolean historyOpen,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages
		) {
			public ConversationsUpdateBody(Long conversationId) {
				this(conversationId, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsUpdateResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsDeleteBody(
			@JsonProperty("conversation_id") Long conversationId,
			@JsonProperty("delete_type") DeleteType deleteType
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsStartBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
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
			Long page,
			Long limit,
			ConversationsOrder order,
			Long before,
			Long after
		) {
			public ConversationsMessagesListParams() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponse(
			List<Resp_ConversationMessageModel> messages,
			@JsonProperty("messages_total") long messagesTotal,
			ConversationsMessagesListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record ConversationsMessagesCreateBody(
			@JsonProperty("reply_message_id") Long replyMessageId,
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
			@JsonProperty("conversation_id") Long conversationId,
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
			@JsonProperty("user_id") Long userId
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
			UsersType type,
			Long page,
			Long limit
		) {
			public NotificationsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponse(
			List<Resp_NotificationModel> notifications,
			@JsonProperty("notifications_total") long notificationsTotal,
			NotificationsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponseLinks(
			String read,
			long pages,
			long page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsGetResponse(
			@JsonProperty("notification_id") long notificationId,
			Resp_NotificationModel notification,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record NotificationsReadBody(
			@JsonProperty("notification_id") Long notificationId
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
			TagsPopularResponseTags tags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsPopularResponseTags(
			@JsonProperty("000") String _000
		) {}

		public record TagsListParams(
			Long page,
			Long limit
		) {
			public TagsListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponse(
			TagsListResponseTags tags,
			@JsonProperty("tags_total") long tagsTotal,
			TagsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponseTags(
			@JsonProperty("1") String _1,
			@JsonProperty("2") String _2,
			@JsonProperty("3") String _3,
			@JsonProperty("4") String _4,
			@JsonProperty("5") String _5,
			@JsonProperty("6") String _6,
			@JsonProperty("7") String _7,
			@JsonProperty("8") String _8,
			@JsonProperty("9") String _9,
			@JsonProperty("10") String _10,
			@JsonProperty("11") String _11,
			@JsonProperty("12") String _12,
			@JsonProperty("14") String _14,
			@JsonProperty("15") String _15,
			@JsonProperty("16") String _16,
			@JsonProperty("17") String _17,
			@JsonProperty("18") String _18,
			@JsonProperty("19") String _19,
			@JsonProperty("20") String _20
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record TagsGetParams(
			Long page,
			Long limit
		) {
			public TagsGetParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponse(
			TagsGetResponseTag tag,
			List<TagsGetResponseTagged> tagged,
			@JsonProperty("tagged_total") long taggedTotal,
			TagsGetResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTagLinks(
			String permalink,
			String detail
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTag(
			@JsonProperty("tag_id") long tagId,
			@JsonProperty("tag_text") String tagText,
			@JsonProperty("tag_use_count") long tagUseCount,
			TagsGetResponseTagLinks links
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			TagsGetResponseTaggedFirstPostLinks links,
			TagsGetResponseTaggedFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedThreadPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedThreadTags(
			@JsonProperty("1") String _1,
			@JsonProperty("654") String _654
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_poster") String lastPoster,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<TagsGetResponseTaggedForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<TagsGetResponseTaggedForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			TagsGetResponseTaggedForumLinks links,
			TagsGetResponseTaggedForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTagged(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") TagsGetResponseTaggedFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<TagsGetResponseTaggedThreadPrefixes> threadPrefixes,
			@JsonProperty("thread_tags") TagsGetResponseTaggedThreadTags threadTags,
			TagsGetResponseTaggedLinks links,
			TagsGetResponseTaggedPermissions permissions,
			TagsGetResponseTaggedForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record TagsFindParams(
			String tag
		) {
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
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			Long page,
			Long limit
		) {
			public SearchAllBody() {
				this(null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponse(
			List<SearchAllResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			List<Resp_UserModel> users,
			SearchAllResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPost(
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
			@JsonProperty("post_is_liked") boolean postIsLiked,
			SearchAllResponseDataFirstPostLinks links,
			SearchAllResponseDataFirstPostPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_poster") String lastPoster,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataPermissionsBump(
			boolean can,
			@JsonProperty("available_count") long availableCount,
			JsonNode error,
			@JsonProperty("next_available_time") JsonNode nextAvailableTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			boolean edit,
			SearchAllResponseDataPermissionsBump bump
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("parent_node_id") long parentNodeId,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			SearchAllResponseDataForumLinks links,
			SearchAllResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPost(
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
			@JsonProperty("post_is_liked") boolean postIsLiked,
			SearchAllResponseDataLastPostLinks links,
			SearchAllResponseDataLastPostPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") String contentId,
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
			@JsonProperty("first_post") SearchAllResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			SearchAllResponseDataLinks links,
			SearchAllResponseDataPermissions permissions,
			@JsonProperty("node_title") String nodeTitle,
			SearchAllResponseDataForum forum,
			@JsonProperty("last_post") SearchAllResponseDataLastPost lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record SearchThreadsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			Long page,
			Long limit,
			@JsonProperty("data_limit") Long dataLimit
		) {
			public SearchThreadsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponse(
			List<SearchThreadsResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			SearchThreadsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			SearchThreadsResponseDataFirstPostLinks links,
			SearchThreadsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			SearchThreadsResponseDataForumLinks links,
			SearchThreadsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") SearchThreadsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			SearchThreadsResponseDataLinks links,
			SearchThreadsResponseDataPermissions permissions,
			SearchThreadsResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record SearchPostsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			Long page,
			Long limit,
			@JsonProperty("data_limit") Long dataLimit
		) {
			public SearchPostsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponse(
			List<SearchPostsResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			SearchPostsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			SearchPostsResponseDataFirstPostLinks links,
			SearchPostsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			SearchPostsResponseDataForumLinks links,
			SearchPostsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") SearchPostsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			SearchPostsResponseDataLinks links,
			SearchPostsResponseDataPermissions permissions,
			SearchPostsResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseLinks(
			long pages,
			long page,
			String next
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
			@JsonProperty("user_id") Long userId,
			Long page,
			Long limit
		) {
			public SearchProfilePostsBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponse(
			List<SearchProfilePostsResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			SearchProfilePostsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseDataLinks(
			String permalink,
			String detail,
			String timeline,
			@JsonProperty("timeline_user") String timelineUser,
			String poster,
			String likes,
			String comments,
			String report,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseDataPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean like,
			boolean comment,
			boolean report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
			@JsonProperty("profile_post_id") long profilePostId,
			@JsonProperty("timeline_user_id") long timelineUserId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_comment_count") long postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			SearchProfilePostsResponseDataLinks links,
			SearchProfilePostsResponseDataPermissions permissions,
			@JsonProperty("timeline_user") Resp_UserModel timelineUser
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseLinks(
			long pages,
			long page,
			String next
		) {}

		public record SearchTaggedBody(
			String tag,
			List<String> tags,
			Long page,
			Long limit
		) {
			public SearchTaggedBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponse(
			List<SearchTaggedResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			@JsonProperty("search_tags") SearchTaggedResponseSearchTags searchTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			SearchTaggedResponseDataFirstPostLinks links,
			SearchTaggedResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataThreadTags(
			@JsonProperty("160179") String _160179
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit,
			@JsonProperty("edit_title") boolean editTitle,
			@JsonProperty("edit_tags") boolean editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<SearchTaggedResponseDataForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<SearchTaggedResponseDataForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			SearchTaggedResponseDataForumLinks links,
			SearchTaggedResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") SearchTaggedResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") SearchTaggedResponseDataThreadTags threadTags,
			SearchTaggedResponseDataLinks links,
			SearchTaggedResponseDataPermissions permissions,
			SearchTaggedResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseSearchTags(
			@JsonProperty("160179") String _160179
		) {}

		public record SearchResultsParams(
			Long page,
			Long limit
		) {
			public SearchResultsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponse(
			List<SearchResultsResponseData> data,
			@JsonProperty("data_total") long dataTotal,
			@JsonProperty("search_tags") SearchResultsResponseSearchTags searchTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPostLinks(
			String permalink,
			String detail,
			String thread,
			String poster,
			String likes,
			String report,
			String attachments,
			@JsonProperty("poster_avatar") String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPost(
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
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			SearchResultsResponseDataFirstPostLinks links,
			SearchResultsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataThreadTags(
			@JsonProperty("160179") String _160179
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost,
			@JsonProperty("last_post") String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit,
			@JsonProperty("edit_title") boolean editTitle,
			@JsonProperty("edit_tags") boolean editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<SearchResultsResponseDataForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<SearchResultsResponseDataForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			SearchResultsResponseDataForumLinks links,
			SearchResultsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") long contentId,
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
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") SearchResultsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") SearchResultsResponseDataThreadTags threadTags,
			SearchResultsResponseDataLinks links,
			SearchResultsResponseDataPermissions permissions,
			SearchResultsResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseSearchTags(
			@JsonProperty("160179") String _160179
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchExecuteResponse(
			BatchExecuteResponseJobs jobs
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchExecuteResponseJobs(
			@JsonProperty("job_id") JsonNode jobId
		) {}

	}

	// ─── ChatboxApi Types ────────────────────────────────────────

	public static final class ChatboxApiTypes {

		private ChatboxApiTypes() {
		}

		public record ChatboxIndexParams(
			@JsonProperty("room_id") RoomId roomId
		) {
			public ChatboxIndexParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponse(
			List<ChatboxIndexResponseRooms> rooms,
			JsonNode ban,
			List<ChatboxIndexResponseIgnore> ignore,
			ChatboxIndexResponsePermissions permissions,
			List<String> commands,
			ChatboxIndexResponseRoomsOnline roomsOnline,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseRooms(
			@JsonProperty("can_report") boolean canReport,
			boolean eng,
			boolean market,
			@JsonProperty("room_id") long roomId,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnoreRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnoreRendered(
			String username,
			ChatboxIndexResponseIgnoreRenderedAvatars avatars,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnore(
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("background_date") long backgroundDate,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			ChatboxIndexResponseIgnoreRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("uniq_banner") JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") long userId,
			String username
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponsePermissions(
			boolean deleteAnyMessage,
			boolean editAnyMessage,
			boolean viewAnyMessage,
			boolean viewMessages,
			boolean postMessage,
			boolean ban
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseRoomsOnline(
			@JsonProperty("chat:0") long chat_0
		) {}

		public record ChatboxGetMessagesParams(
			@JsonProperty("room_id") RoomId roomId,
			@JsonProperty("before_message_id") Long beforeMessageId
		) {
			public ChatboxGetMessagesParams(RoomId roomId) {
				this(roomId, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetMessagesResponse(
			List<Resp_ChatboxMessageModel> messages,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxPostMessageBody(
			@JsonProperty("room_id") RoomId roomId,
			@JsonProperty("reply_message_id") Long replyMessageId,
			String message
		) {
			public ChatboxPostMessageBody(RoomId roomId, String message) {
				this(roomId, null, message);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostMessageResponse(
			Resp_ChatboxMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxEditMessageBody(
			@JsonProperty("message_id") Long messageId,
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxEditMessageResponse(
			Resp_ChatboxMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteMessageBody(
			@JsonProperty("message_id") Long messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteMessageResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxOnlineParams(
			@JsonProperty("room_id") RoomId roomId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponse(
			List<ChatboxOnlineResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersRendered(
			String username,
			ChatboxOnlineResponseUsersRenderedAvatars avatars,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersUniqBanner(
			@JsonProperty("banner_css") String bannerCss,
			@JsonProperty("banner_text") String bannerText,
			@JsonProperty("banner_icon") String bannerIcon,
			@JsonProperty("username_icon") String usernameIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsers(
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("background_date") long backgroundDate,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			ChatboxOnlineResponseUsersRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("uniq_banner") ChatboxOnlineResponseUsersUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") long userId,
			String username
		) {}

		public record ChatboxReportReasonsParams(
			@JsonProperty("message_id") Long messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxReportBody(
			@JsonProperty("message_id") Long messageId,
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
			Duration duration
		) {
			public ChatboxGetLeaderboardParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponse(
			List<ChatboxGetLeaderboardResponseLeaderboard> leaderboard,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardRendered(
			String username,
			ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars avatars,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardUniqBanner(
			@JsonProperty("banner_css") String bannerCss,
			@JsonProperty("banner_text") String bannerText,
			@JsonProperty("banner_icon") String bannerIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboard(
			long count,
			@JsonProperty("user_id") long userId,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("background_date") long backgroundDate,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			ChatboxGetLeaderboardResponseLeaderboardRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("uniq_banner") ChatboxGetLeaderboardResponseLeaderboardUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponse(
			List<ChatboxGetIgnoreResponseIgnored> ignored,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnoredRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnoredRendered(
			String username,
			ChatboxGetIgnoreResponseIgnoredRenderedAvatars avatars,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnored(
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("background_date") long backgroundDate,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") long displayBannerId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("register_date") long registerDate,
			ChatboxGetIgnoreResponseIgnoredRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("uniq_banner") JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") long userId,
			String username
		) {}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostIgnoreResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
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
			Long page
		) {
			public FormsListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponse(
			List<FormsListResponseForms> forms,
			long formsPerPage,
			long page,
			long totalForms,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFieldsFieldChoices(
			String buy,
			String sell
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFields(
			@JsonProperty("field_id") long fieldId,
			String title,
			FormsListResponseFormsFieldsFieldChoices fieldChoices,
			long required,
			@JsonProperty("max_length") long maxLength,
			@JsonProperty("default_value") String defaultValue
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseForms(
			@JsonProperty("form_id") long formId,
			String title,
			String description,
			List<FormsListResponseFormsFields> fields
		) {}

		@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "form_id")
		@JsonSubTypes({
			@JsonSubTypes.Type(value = FormsCreateBodyV1.class, name = "1"),
			@JsonSubTypes.Type(value = FormsCreateBodyV3.class, name = "3")
		})
		public sealed interface FormsCreateBody permits
			FormsCreateBodyV1, FormsCreateBodyV3 {
		}
	
		@JsonTypeName("1")
		public record FormsCreateBodyV1(
			JsonNode fields
		) implements FormsCreateBody {
		}
		@JsonTypeName("3")
		public record FormsCreateBodyV3(
			JsonNode fields
		) implements FormsCreateBody {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponse(
			String message,
			FormsCreateResponseContent content,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContentLinks(
			String permalink,
			String detail,
			String followers,
			String forum,
			String posts,
			@JsonProperty("first_poster") String firstPoster,
			@JsonProperty("first_poster_avatar") String firstPosterAvatar,
			@JsonProperty("first_post") String firstPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContentPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContent(
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
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			FormsCreateResponseContentLinks links,
			FormsCreateResponseContentPermissions permissions,
			@JsonProperty("node_title") String nodeTitle
		) {}

	}

}
