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
import com.lolzteam.api.runtime.Nullable;
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
			@JsonProperty("notification_id") double notificationId,
			@JsonProperty("notification_create_date") double notificationCreateDate,
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") double contentId,
			@JsonProperty("content_action") String contentAction,
			@JsonProperty("notification_is_unread") boolean notificationIsUnread,
			@JsonProperty("creator_user_id") double creatorUserId,
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
			@JsonProperty("link_id") double linkId,
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
			double date,
			@JsonProperty("is_deleted") boolean isDeleted,
			String message,
			@JsonProperty("message_id") double messageId,
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
			@JsonProperty("room_id") double roomId,
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
			@JsonProperty("avatar_date") double avatarDate,
			@JsonProperty("background_date") double backgroundDate,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			Resp_ChatboxMessageModelUserRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
			@JsonProperty("uniq_banner") Resp_ChatboxMessageModelUserUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") double userId,
			String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModel(
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("user_message_count") double userMessageCount,
			@JsonProperty("user_register_date") double userRegisterDate,
			@JsonProperty("user_like_count") double userLikeCount,
			@JsonProperty("user_like2_count") double userLike2Count,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("trophy_count") double trophyCount,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("is_banned") double isBanned,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			String balance,
			String hold,
			String currency,
			@JsonProperty("user_email") String userEmail,
			@JsonProperty("user_unread_notification_count") double userUnreadNotificationCount,
			@JsonProperty("user_unread_conversation_count") double userUnreadConversationCount,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_deposit") double userDeposit,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") double userLastSeenDate,
			Resp_UserModelLinks links,
			Resp_UserModelPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") double userGroupId,
			@JsonProperty("curator_titles") List<String> curatorTitles,
			@JsonProperty("user_groups") List<Resp_UserModelUserGroups> userGroups,
			List<Resp_UserModelFields> fields,
			@JsonProperty("user_timezone_offset") double userTimezoneOffset,
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
			@JsonProperty("user_group_id") double userGroupId,
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
			@Nullable String value,
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
			@JsonProperty("timezone_type") double timezoneType,
			String timezone
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelBirthday(
			double age,
			Resp_UserModelBirthdayTimeStamp timeStamp,
			String format
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowingUsers(
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowing(
			List<Resp_UserModelUserFollowingUsers> users,
			double count
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowersUsers(
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowers(
			List<Resp_UserModelUserFollowersUsers> users,
			double count
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModel(
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("forum_id") double forumId,
			@JsonProperty("thread_title") String threadTitle,
			@JsonProperty("thread_view_count") double threadViewCount,
			@JsonProperty("creator_user_id") double creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("thread_create_date") double threadCreateDate,
			@JsonProperty("thread_update_date") double threadUpdateDate,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("thread_post_count") double threadPostCount,
			@JsonProperty("thread_is_published") boolean threadIsPublished,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted,
			@JsonProperty("thread_is_sticky") boolean threadIsSticky,
			@JsonProperty("thread_is_closed") boolean threadIsClosed,
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("thread_is_starred") boolean threadIsStarred,
			@JsonProperty("first_post") Resp_ThreadModelFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<Resp_ThreadModelThreadPrefixes> threadPrefixes,
			@JsonProperty("thread_tags") JsonNode threadTags,
			Resp_ThreadModelLinks links,
			Resp_ThreadModelPermissions permissions,
			@JsonProperty("node_title") String nodeTitle,
			@Nullable Resp_ForumModel forum,
			@Nullable Resp_ThreadModelRestrictions restrictions,
			@Nullable Resp_ThreadModelContest contest
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
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			String signature,
			@JsonProperty("signature_html") String signatureHtml,
			@JsonProperty("signature_plain_text") String signaturePlainText,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") double postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			@JsonProperty("post_is_liked") boolean postIsLiked,
			Resp_ThreadModelFirstPostLinks links,
			Resp_ThreadModelFirstPostPermissions permissions,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelThreadPrefixes(
			@JsonProperty("prefix_id") double prefixId,
			@JsonProperty("prefix_title") String prefixTitle
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
			@JsonProperty("available_count") double availableCount,
			String error,
			@JsonProperty("next_available_time") double nextAvailableTime
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
			@JsonProperty("reply_delay") double replyDelay,
			@JsonProperty("max_reply_count") double maxReplyCount
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
			@JsonProperty("finish_date") double finishDate,
			@JsonProperty("now_count_members") double nowCountMembers,
			@JsonProperty("needed_members") double neededMembers,
			@JsonProperty("is_finished") double isFinished,
			@JsonProperty("count_winners") double countWinners,
			@JsonProperty("require_like_count") double requireLikeCount,
			@JsonProperty("require_total_like_count") double requireTotalLikeCount,
			@JsonProperty("prize_type") String prizeType,
			@JsonProperty("prize_type_phrase") String prizeTypePhrase,
			@JsonProperty("prize_data") double prizeData,
			@JsonProperty("is_money_places") double isMoneyPlaces,
			@JsonProperty("chance_to_win") double chanceToWin,
			@Nullable List<Double> winners,
			@JsonProperty("already_participate") boolean alreadyParticipate,
			Resp_ThreadModelContestPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModel(
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			String signature,
			@JsonProperty("signature_html") String signatureHtml,
			@JsonProperty("signature_plain_text") String signaturePlainText,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") double postUpdateDate,
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
			@JsonProperty("post_comment_id") double postCommentId,
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_create_date") double postCommentCreateDate,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") double postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") double postCommentUpdateDate,
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
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("timeline_user_id") double timelineUserId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_comment_count") double postCommentCount,
			@JsonProperty("post_comments_is_disabled") double postCommentsIsDisabled,
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
			@JsonProperty("comment_id") double commentId,
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("comment_user_id") double commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") double commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("comment_body_html") String commentBodyHtml,
			@JsonProperty("comment_body_plain_text") String commentBodyPlainText,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") double timelineUserId,
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
			@JsonProperty("conversation_id") double conversationId,
			@JsonProperty("conversation_title") String conversationTitle,
			@JsonProperty("creator_user_id") double creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("conversation_create_date") double conversationCreateDate,
			@JsonProperty("conversation_update_date") double conversationUpdateDate,
			@JsonProperty("conversation_last_read_date") double conversationLastReadDate,
			@JsonProperty("conversation_online_count") double conversationOnlineCount,
			@JsonProperty("is_starred") double isStarred,
			@JsonProperty("is_group") double isGroup,
			@JsonProperty("is_unread") double isUnread,
			double alerts,
			Resp_ConversationModelPermissions permissions,
			@JsonProperty("conversation_message_count") double conversationMessageCount,
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
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("is_online") boolean isOnline,
			@JsonProperty("contacts_changed") boolean contactsChanged,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelRecipients(
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("last_activity") double lastActivity,
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
			@JsonProperty("message_id") double messageId,
			@JsonProperty("conversation_id") double conversationId,
			@JsonProperty("creator_user_id") double creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("creator_username_html") String creatorUsernameHtml,
			@JsonProperty("message_create_date") double messageCreateDate,
			@JsonProperty("message_is_unread") double messageIsUnread,
			@JsonProperty("message_need_translate") boolean messageNeedTranslate,
			@JsonProperty("message_is_system") boolean messageIsSystem,
			@JsonProperty("message_edit_date") double messageEditDate,
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
		public record Resp_ForumModel(
			@JsonProperty("forum_id") double forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") double forumThreadCount,
			@JsonProperty("forum_post_count") double forumPostCount,
			@JsonProperty("parent_node_id") double parentNodeId,
			@JsonProperty("node_type_id") String nodeTypeId,
			@JsonProperty("icon_content") String iconContent,
			@JsonProperty("active_icon_content") String activeIconContent,
			@JsonProperty("forum_rules_thread_id") double forumRulesThreadId,
			@JsonProperty("forum_prefixes") List<Resp_ForumModelForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			Resp_ForumModelLinks links,
			Resp_ForumModelPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ForumModelForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") double prefixId,
			@JsonProperty("css_class") String cssClass,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ForumModelForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<Resp_ForumModelForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ForumModelLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ForumModelPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_SystemInfo(
			@JsonProperty("visitor_id") double visitorId,
			double time
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
			/** Client ID. */
			@JsonProperty("client_id") String clientId,
			/** Client secret. */
			@JsonProperty("client_secret") String clientSecret,
			/** Scope. */
			JsonNode scope
		) implements OAuthTokenBody {
		}
		@JsonTypeName("authorization_code")
		public record OAuthTokenBodyAuthorizationCode(
			/** Authorization code. */
			String code,
			/** Client ID. */
			@JsonProperty("client_id") String clientId,
			/** Client secret. */
			@JsonProperty("client_secret") String clientSecret,
			/** Redirect URI. */
			@JsonProperty("redirect_uri") String redirectUri,
			/** Scope. */
			JsonNode scope
		) implements OAuthTokenBody {
		}
		@JsonTypeName("refresh_token")
		public record OAuthTokenBodyRefreshToken(
			/** Refresh token. */
			@JsonProperty("refresh_token") String refreshToken,
			/** Client ID. */
			@JsonProperty("client_id") String clientId,
			/** Client secret. */
			@JsonProperty("client_secret") String clientSecret
		) implements OAuthTokenBody {
		}
		@JsonTypeName("password")
		public record OAuthTokenBodyPassword(
			/** Account username/email. */
			String username,
			/** Account password. */
			String password,
			/** Client ID. */
			@JsonProperty("client_id") String clientId,
			/** Client secret. */
			@JsonProperty("client_secret") String clientSecret,
			/** Scope. */
			JsonNode scope
		) implements OAuthTokenBody {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record OAuthTokenResponse(
			@JsonProperty("access_token") String accessToken,
			@JsonProperty("token_type") String tokenType,
			@JsonProperty("expires_in") double expiresIn,
			@JsonProperty("refresh_token") @Nullable String refreshToken,
			@Nullable String scope
		) {}

	}

	// ─── AssetsApi Types ────────────────────────────────────────

	public static final class AssetsApiTypes {

		private AssetsApiTypes() {
		}

		public record AssetsCssParams(
			/** The names or identifiers of the CSS selectors to retrieve. */
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
			/** Id of parent category. If exists, filter categories that are direct children of that category. */
			@JsonProperty("parent_category_id") Long parentCategoryId,
			/** Id of parent forum. If exists, filter categories that are direct children of that forum. */
			@JsonProperty("parent_forum_id") Long parentForumId,
			/** Ordering of categories. */
			CategoriesOrder order
		) {
			public CategoriesListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponse(
			List<CategoriesListResponseCategories> categories,
			@JsonProperty("categories_total") double categoriesTotal,
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
			@JsonProperty("category_id") double categoryId,
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
			@JsonProperty("category_id") double categoryId,
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
			/** Id of parent category. If exists, filter forums that are direct children of that category. */
			@JsonProperty("parent_category_id") Long parentCategoryId,
			/** Id of parent forum. If exists, filter forums that are direct children of that forum. */
			@JsonProperty("parent_forum_id") Long parentForumId,
			/** Ordering of forums. */
			CategoriesOrder order
		) {
			public ForumsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponse(
			List<Resp_ForumModel> forums,
			@JsonProperty("forums_total") double forumsTotal,
			List<ForumsListResponseTabs> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
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
			List<List<Resp_ForumModel>> data,
			List<ForumsGroupedResponseTabs> tabs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseTabs(
			@JsonProperty("node_ids") String nodeIds,
			String title,
			@JsonProperty("link_title") String linkTitle,
			boolean isExtendedTab,
			List<JsonNode> prefixes,
			@JsonProperty("prefixes_not") List<JsonNode> prefixesNot,
			String order,
			String direction,
			String period,
			String state,
			String q,
			String tabLink
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponse(
			Resp_ForumModel forum,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
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
			@JsonProperty("user_id") double userId,
			String username,
			ForumsFollowersResponseUsersFollow follow
		) {}

		public record ForumsFollowBody(
			/** Whether to receive notification for post. */
			Boolean post,
			/** Whether to receive notification as alert. */
			Boolean alert,
			/** Whether to receive notification as email. */
			Boolean email,
			/** Prefix ids. */
			@JsonProperty("prefix_ids") List<Long> prefixIds,
			/** Minimal contest amount. (Only for 766 forumId) */
			@JsonProperty("minimal_contest_amount") Long minimalContestAmount
		) {
			public ForumsFollowBody() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ForumsFollowedParams(
			/** If included in the request, only the forum count is returned as **forums_total**. */
			Boolean total
		) {
			public ForumsFollowedParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponse(
			List<Resp_ForumModel> forums,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponse(
			List<Resp_ForumModel> forums,
			@JsonProperty("excluded_forums_ids") List<Double> excludedForumsIds,
			@JsonProperty("default_excluded_forums_ids") List<Double> defaultExcludedForumsIds,
			String keywords,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ForumsEditFeedOptionsBody(
			/** Array of forum ids to exclude from the feed. */
			@JsonProperty("node_ids") List<Long> nodeIds,
			/** List of keywords to exclude specific threads from the feed. */
			List<String> keywords
		) {
			public ForumsEditFeedOptionsBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsEditFeedOptionsResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── LinksApi Types ────────────────────────────────────────

	public static final class LinksApiTypes {

		private LinksApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record LinksListResponse(
			@JsonProperty("link-forums") List<Resp_LinkModel> linkForums,
			@JsonProperty("link-forums_total") double linkForumsTotal,
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
			/** Id of parent page. If exists, filter pages that are direct children of that page. */
			@JsonProperty("parent_page_id") Long parentPageId,
			/** Ordering of pages. */
			CategoriesOrder order
		) {
			public PagesListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponse(
			List<PagesListResponsePages> pages,
			@JsonProperty("pages_total") double pagesTotal,
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
			@JsonProperty("page_id") double pageId,
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
			@JsonProperty("page_id") double pageId,
			@JsonProperty("page_title") String pageTitle,
			@JsonProperty("page_description") String pageDescription,
			@JsonProperty("page_view_count") double pageViewCount,
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
			/** Id of parent element. If exists, filter elements that are direct children of that element. */
			Long parent
		) {
			public NavigationListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponse(
			List<NavigationListResponseElements> elements,
			@JsonProperty("elements_count") double elementsCount,
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
			@JsonProperty("category_id") double categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			NavigationListResponseElementsLinks links,
			NavigationListResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") String navigationType,
			@JsonProperty("navigation_id") double navigationId,
			@JsonProperty("navigation_parent_id") double navigationParentId,
			@JsonProperty("has_sub_elements") boolean hasSubElements
		) {}

	}

	// ─── ThreadsApi Types ────────────────────────────────────────

	public static final class ThreadsApiTypes {

		private ThreadsApiTypes() {
		}

		public record ThreadsListParams(
			/** Id of the containing forum. */
			@JsonProperty("forum_id") Long forumId,
			/** Tab to get threads from. */
			String tab,
			/** Thread state. Works only if **forum_id** is set. */
			State state,
			/** Filter to get only threads created within the selected period. Works only if **forum_id** is set. */
			Period period,
			/** Thread title. */
			String title,
			/** Search only in titles. */
			@JsonProperty("title_only") Boolean titleOnly,
			/** Filter to get only threads created by the specified user. */
			@JsonProperty("creator_user_id") Long creatorUserId,
			/** Filter to get only sticky or non-sticky threads. By default, all threads will be included and sticky ones will be at the top of the result on the first page. In mixed mode, sticky threads are not counted towards **threads_total** and does not affect pagination. */
			Boolean sticky,
			/** Filter to get only threads with the specified prefix. */
			@JsonProperty("prefix_ids[]") List<Long> prefixIds,
			/** Filter to get only threads without the specified prefix. */
			@JsonProperty("prefix_ids_not[]") List<Long> prefixIdsNot,
			/** Filter to get only threads with the specified tag. */
			@JsonProperty("thread_tag_id") Long threadTagId,
			/** Page number of threads. */
			Long page,
			/** Number of threads in a page. */
			Long limit,
			/** Ordering of threads. */
			ThreadsOrder order,
			/** Direction of threads ordering. */
			Direction direction,
			/** Filter threads by creation date. Only works with 'thread_create_date' and 'thread_create_date_reverse' ordering. */
			@JsonProperty("thread_create_date") Long threadCreateDate,
			/** Filter threads by update date. Only works with 'thread_update_date' and 'thread_update_date_reverse' ordering. */
			@JsonProperty("thread_update_date") Long threadUpdateDate,
			/** List of fields to include. */
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
			@JsonProperty("threads_total") double threadsTotal,
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
			@JsonProperty("forum_id") double forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") double forumThreadCount,
			@JsonProperty("forum_post_count") double forumPostCount,
			@JsonProperty("forum_prefixes") List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ThreadsListResponseForumLinks links,
			ThreadsListResponseForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record ThreadsCreateBody(
			/** Content of the new thread. */
			@JsonProperty("post_body") String postBody,
			/** Id of the target forum. */
			@JsonProperty("forum_id") Long forumId,
			/** Thread title. Can be skipped if **title_en** set. */
			String title,
			/** Thread english title. Can be skipped if **title** set. */
			@JsonProperty("title_en") String titleEn,
			/** Prefix ids. */
			@JsonProperty("prefix_id") List<Long> prefixId,
			/** Thread tags. */
			List<String> tags,
			/** Hide contacts. */
			@JsonProperty("hide_contacts") Boolean hideContacts,
			/** Allow ask hidden content. */
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Allow to reply only users with chosen or higher group. Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			/** Allow commenting if user can't post in thread. */
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			/** Don't alert followers about thread creation. */
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			/** Date to schedule thread creation (format: `DD-MM-YYYY`). */
			@JsonProperty("schedule_date") String scheduleDate,
			/** Time to schedule thread creation (format: `HH:MM`). */
			@JsonProperty("schedule_time") String scheduleTime,
			/** Watch thread state. */
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			/** Receive forum notifications of new posts in this thread. */
			@JsonProperty("watch_thread") Boolean watchThread,
			/** Receive email notifications of new posts in this thread. */
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
			/** Content of the new contest. */
			@JsonProperty("post_body") String postBody,
			/** Thread title. Can be skipped if **title_en** set. */
			String title,
			/** Thread english title. Can be skipped if **title** set. */
			@JsonProperty("title_en") String titleEn,
			/** Contest type. Default: by_finish_date */
			@JsonProperty("contest_type") ContestType contestType,
			/** Giveaway duration value. The maximum duration is 3 days. Required if **contest_type** is **by_finish_date**. */
			@JsonProperty("length_value") Long lengthValue,
			/** Giveaway duration type. The maximum duration is 3 days. Required if **contest_type** is **by_finish_date**. */
			@JsonProperty("length_option") LengthOption lengthOption,
			/** Prize type. */
			@JsonProperty("prize_type") PrizeType prizeType,
			/** Winner count (prize count). Optional if **prize_type** is **money**. */
			@JsonProperty("count_winners") Long countWinners,
			/** How much money will each winner receive. Optional if **prize_type** is **money**. */
			@JsonProperty("prize_data_money") Double prizeDataMoney,
			/** Enable the distribution of money prizes by places. Optional if **prize_type** is **money**. */
			@JsonProperty("is_money_places") Boolean isMoneyPlaces,
			/** How much money will receive each place. Required if **is_money_places** is **1**. */
			@JsonProperty("prize_data_places") List<Double> prizeDataPlaces,
			/** Which upgrade will each winner receive. Required if **prize_type** is **upgrades**. */
			@JsonProperty("prize_data_upgrade") PrizeDataUpgrade prizeDataUpgrade,
			/** Sympathies for this week. */
			@JsonProperty("require_like_count") Long requireLikeCount,
			/** Sympathies for all time. */
			@JsonProperty("require_total_like_count") Long requireTotalLikeCount,
			/** Secret answer of your account. */
			@JsonProperty("secret_answer") String secretAnswer,
			/** Thread tags. */
			List<String> tags,
			/** Allow to reply only users with chosen or higher group. Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			/** Allow commenting if user can't post in thread. */
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			/** Don't alert followers about thread creation. */
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			/** Hide contacts. */
			@JsonProperty("hide_contacts") Boolean hideContacts,
			/** Allow ask hidden content. */
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Date to schedule thread creation (format: `DD-MM-YYYY`). */
			@JsonProperty("schedule_date") String scheduleDate,
			/** Time to schedule thread creation (format: `HH:MM`). */
			@JsonProperty("schedule_time") String scheduleTime,
			/** Watch thread state. */
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			/** Receive forum notifications of new posts in this thread. */
			@JsonProperty("watch_thread") Boolean watchThread,
			/** Receive email notifications of new posts in this thread. */
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
			/** To whom the complaint is filed. Specify a nickname or a link to the profile. */
			@JsonProperty("as_responder") String asResponder,
			/** Did you buy account on the market? */
			@JsonProperty("as_is_market_deal") Boolean asIsMarketDeal,
			/** Market item id. Required if **as_is_market_deal** is 1. */
			@JsonProperty("as_market_item_id") Long asMarketItemId,
			/** Contacts and wallets of the responder. Specify the known data about the responder, if any. Optional if **as_is_market_deal** is 0. */
			@JsonProperty("as_data") String asData,
			/** Indicate the amount by which the responder deceived you. */
			@JsonProperty("as_amount") Double asAmount,
			/** Currency of Claim. */
			Currency currency,
			/** The transaction took place through a guarantor or there was a transfer to the market with a hold? Required if **as_is_market_deal** is 0. */
			@JsonProperty("transfer_type") TransferType transferType,
			/** Pay claim fee now or later. (Only for **transfer_type** = **notsafe**) */
			@JsonProperty("pay_claim") PayClaim payClaim,
			/** Funds transfer receipt. Upload a receipt for the transfer of funds, use the "View receipt" button in your wallet. May be uploaded to [Imgur](https://imgur.com/upload). Write "no" if you have not paid. Required if **as_is_market_deal** is 0. */
			@JsonProperty("as_funds_receipt") String asFundsReceipt,
			/** Screenshot showing the respondent's Telegram login. If the correspondence was conducted in Telegram, upload a screenshot that will display the respondent's Telegram login against the background of your dialogue. The screenshot may be uploaded to [Imgur](https://imgur.com/upload). If the correspondence was conducted elsewhere, write "no". */
			@JsonProperty("as_tg_login_screenshot") String asTgLoginScreenshot,
			/** Thread tags. */
			List<String> tags,
			/** Hide contacts. */
			@JsonProperty("hide_contacts") Boolean hideContacts,
			/** Allow ask hidden content. */
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Allow to reply only users with chosen or higher group. Default: 2 */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			/** Allow commenting if user can't post in thread. */
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			/** Don't alert followers about thread creation. */
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			/** Date to schedule thread creation (format: `DD-MM-YYYY`). */
			@JsonProperty("schedule_date") String scheduleDate,
			/** Time to schedule thread creation (format: `HH:MM`). */
			@JsonProperty("schedule_time") String scheduleTime,
			/** Watch thread state. */
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			/** Receive forum notifications of new posts in this thread. */
			@JsonProperty("watch_thread") Boolean watchThread,
			/** Receive email notifications of new posts in this thread. */
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail,
			/** You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You may upload to the site [Imgur](https://imgur.com/upload) - for convenience, use Ctrl + V when uploading screenshots to the album. - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible. */
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
			/** List of fields to include. */
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
			/** Thread title. */
			String title,
			/** Thread title english. */
			@JsonProperty("title_en") String titleEn,
			/** Prefix ids. Set "0" to remove all thread prefixes. */
			@JsonProperty("prefix_id") List<Long> prefixId,
			/** Thread tags. */
			List<String> tags,
			/** Discussion state. */
			@JsonProperty("discussion_open") Boolean discussionOpen,
			/** Hide contacts. */
			@JsonProperty("hide_contacts") Boolean hideContacts,
			/** Allow ask hidden content. */
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			/** Allow to reply only users with chosen or higher group. */
			@JsonProperty("reply_group") ReplyGroup replyGroup,
			/** Allow commenting if user can't post in thread. */
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
			/** Reason of the thread removal. */
			String reason
		) {
			public ThreadsDeleteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ThreadsMoveBody(
			/** Forum id. */
			@JsonProperty("node_id") String nodeId,
			/** Thread title. */
			String title,
			/** Thread title english. */
			@JsonProperty("title_en") String titleEn,
			/** Prefix ids. Set "0" to remove all thread prefixes. */
			@JsonProperty("prefix_id") List<Long> prefixId,
			/** Apply thread prefix. */
			@JsonProperty("apply_thread_prefix") Boolean applyThreadPrefix,
			/** Send a notification to users who are followed to target node. */
			@JsonProperty("send_alert") Boolean sendAlert
		) {
			public ThreadsMoveBody(String nodeId) {
				this(nodeId, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsMoveResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnstarResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			@JsonProperty("user_id") double userId,
			String username,
			ThreadsFollowersResponseUsersFollow follow
		) {}

		public record ThreadsFollowBody(
			/** Whether to receive notification as email. */
			Boolean email
		) {
			public ThreadsFollowBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ThreadsFollowedParams(
			/** If included in the request, only the thread count is returned as **threads_total**. */
			Boolean total,
			/** List of fields to include. */
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsFollowedParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponse(
			List<Resp_ThreadModel> threads,
			@JsonProperty("threads_total") double threadsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponse(
			List<ThreadsNavigationResponseElements> elements,
			@JsonProperty("elements_count") double elementsCount,
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
			@JsonProperty("category_id") double categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			ThreadsNavigationResponseElementsLinks links,
			ThreadsNavigationResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") String navigationType,
			@JsonProperty("navigation_id") double navigationId,
			@JsonProperty("navigation_depth") double navigationDepth,
			@JsonProperty("navigation_parent_id") double navigationParentId,
			@JsonProperty("has_sub_elements") boolean hasSubElements
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponse(
			ThreadsPollGetResponsePoll poll,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollResponses(
			@JsonProperty("response_id") double responseId,
			@JsonProperty("response_answer") String responseAnswer,
			@JsonProperty("response_vote_count") double responseVoteCount
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
			@JsonProperty("poll_id") double pollId,
			@JsonProperty("poll_question") String pollQuestion,
			@JsonProperty("poll_vote_count") double pollVoteCount,
			@JsonProperty("poll_max_votes") double pollMaxVotes,
			@JsonProperty("poll_is_open") boolean pollIsOpen,
			@JsonProperty("poll_is_voted") boolean pollIsVoted,
			List<ThreadsPollGetResponsePollResponses> responses,
			ThreadsPollGetResponsePollPermissions permissions,
			ThreadsPollGetResponsePollLinks links
		) {}

		public record ThreadsPollVoteBody(
			/** The id of the response to vote for. Can be skipped if **response_ids** set. */
			@JsonProperty("response_id") Long responseId,
			/** An array of ids of responses (if the poll allows multiple choices). */
			@JsonProperty("response_ids") List<Long> responseIds
		) {
			public ThreadsPollVoteBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollVoteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ThreadsUnreadParams(
			/** Maximum number of result threads. The limit may get decreased if the value is too large (depending on the system configuration). */
			Long limit,
			/** Id of the container forum to search for threads. Child forums of the specified forum will be included in the search. */
			@JsonProperty("forum_id") Long forumId,
			/** Number of thread data to be returned. Default value is 20. */
			@JsonProperty("data_limit") Long dataLimit
		) {
			public ThreadsUnreadParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponse(
			List<ThreadsUnreadResponseThreads> threads,
			List<Resp_ThreadModel> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseThreads(
			@JsonProperty("thread_id") double threadId
		) {}

		public record ThreadsRecentParams(
			/** Maximum number of days to search for threads. */
			Long days,
			/** Maximum number of result threads. The limit may get decreased if the value is too large. */
			Long limit,
			/** Id of the container forum to search for threads. Child forums of the specified forum will be included in the search. */
			@JsonProperty("forum_id") Long forumId,
			/** Number of thread data to be returned. Default value is 20. */
			@JsonProperty("data_limit") Long dataLimit
		) {
			public ThreadsRecentParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponse(
			List<ThreadsRecentResponseThreads> threads,
			List<Resp_ThreadModel> data,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseThreads(
			@JsonProperty("thread_id") double threadId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFinishResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PostsApi Types ────────────────────────────────────────

	public static final class PostsApiTypes {

		private PostsApiTypes() {
		}

		public record PostsListParams(
			/** Id of the containing thread. */
			@JsonProperty("thread_id") Long threadId,
			/** Id of a post, posts that are in the same page with the specified post will be returned. **thread_id** may be skipped. */
			@JsonProperty("page_of_post_id") Long pageOfPostId,
			/** Page number of posts. */
			Long page,
			/** Number of posts in a page. */
			Long limit,
			/** Ordering of posts. */
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
			@JsonProperty("posts_total") double postsTotal,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsCreateBody(
			/** Content of the new post. */
			@JsonProperty("post_body") String postBody,
			/** Id of the target thread. **quote_post_id** can be skipped if this parameter is provided. */
			@JsonProperty("thread_id") Long threadId,
			/** Id of the quote post. **thread_id** can be skipped if this parameter is provided. */
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
			/** Content of the post. */
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
			/** Reason of the post removal. */
			String reason
		) {
			public PostsDeleteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record PostsLikesParams(
			/** Page number of users. */
			Long page,
			/** Number of users in a page. */
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
			@JsonProperty("user_id") double userId,
			String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsUnlikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PostsReportBody(
			/** Reason of the report. */
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsReportResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsGetParams(
			/** Id of post. */
			@JsonProperty("post_id") Long postId,
			/** The time in milliseconds (e.g. 1652177794083) before last comment date. */
			Long before,
			/** Comment id to get older comments. */
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
			/** Id of post. */
			@JsonProperty("post_id") Long postId,
			/** Content of the a post comment. */
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
			@JsonProperty("post_comment_id") double postCommentId,
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") double postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") double postCommentUpdateDate,
			PostsCommentsCreateResponseCommentLinks links,
			PostsCommentsCreateResponseCommentPermissions permissions
		) {}

		public record PostsCommentsEditBody(
			/** Id of post. */
			@JsonProperty("post_comment_id") Long postCommentId,
			/** Content of the new post comment. */
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
			@JsonProperty("post_comment_id") double postCommentId,
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_comment_body") String postCommentBody,
			@JsonProperty("post_comment_body_html") String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") double postCommentLikeCount,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_comment_is_published") boolean postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") boolean postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") double postCommentUpdateDate,
			PostsCommentsEditResponseCommentLinks links,
			PostsCommentsEditResponseCommentPermissions permissions
		) {}

		public record PostsCommentsDeleteBody(
			/** Id of post comment. */
			@JsonProperty("post_comment_id") Long postCommentId,
			/** Reason of a post comment removal. */
			String reason
		) {
			public PostsCommentsDeleteBody(Long postCommentId) {
				this(postCommentId, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record PostsCommentsReportBody(
			/** Id of post comment. */
			@JsonProperty("post_comment_id") Long postCommentId,
			/** Reason of the report. */
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsReportResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── UsersApi Types ────────────────────────────────────────

	public static final class UsersApiTypes {

		private UsersApiTypes() {
		}

		public record UsersListParams(
			/** Page number of users. */
			Long page,
			/** Number of users in a page. */
			Long limit,
			/** List of fields to include. */
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersListResponse(
			List<Resp_UserModel> users,
			@JsonProperty("users_total") double usersTotal,
			UsersListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersListResponseLinks(
			double pages,
			double page,
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
			/** Username to filter. Usernames start with the query will be returned. */
			String username,
			/** Custom fields to filter. Example: **custom_fields[telegram]=telegramLogin**. */
			@JsonProperty("custom_fields") Map<String, String> customFields,
			/** List of fields to include. */
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
			/** List of fields to include. */
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
			/** New username. */
			String username,
			/** New custom title of the user. */
			@JsonProperty("user_title") String userTitle,
			/** Id of the group you want to display. */
			@JsonProperty("display_group_id") Long displayGroupId,
			/** Id of the icon group you want to display. */
			@JsonProperty("display_icon_group_id") Long displayIconGroupId,
			/** Id of the banner you want to display. */
			@JsonProperty("display_banner_id") Long displayBannerId,
			/** This message is shown when someone wants to write to you. */
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			/** Your date of birth (day). */
			@JsonProperty("user_dob_day") Long userDobDay,
			/** Your date of birth (month). */
			@JsonProperty("user_dob_month") Long userDobMonth,
			/** Your date of birth (year). */
			@JsonProperty("user_dob_year") Long userDobYear,
			/** Secret answer. */
			@JsonProperty("secret_answer") String secretAnswer,
			/** Secret answer type. */
			@JsonProperty("secret_answer_type") Long secretAnswerType,
			/** Profile short link. */
			@JsonProperty("short_link") String shortLink,
			/** User interface language ID. */
			@JsonProperty("language_id") LanguageId languageId,
			/** User gender. */
			Gender gender,
			/** User timezone. */
			Timezone timezone,
			/** Whether to receive admin emails. */
			@JsonProperty("receive_admin_email") Boolean receiveAdminEmail,
			/** Whether user activity is visible. */
			@JsonProperty("activity_visible") Boolean activityVisible,
			/** Show date of birth (day and month). */
			@JsonProperty("show_dob_date") Boolean showDobDate,
			/** Show year of birth. */
			@JsonProperty("show_dob_year") Boolean showDobYear,
			/** Hide username change logs. */
			@JsonProperty("hide_username_change_logs") Boolean hideUsernameChangeLogs,
			/** Who can view your profile. */
			@JsonProperty("allow_view_profile") AllowViewProfile allowViewProfile,
			/** Who can post on your profile. */
			@JsonProperty("allow_post_profile") AllowPostProfile allowPostProfile,
			/** Who can send you personal conversations. */
			@JsonProperty("allow_send_personal_conversation") AllowSendPersonalConversation allowSendPersonalConversation,
			/** Who can invite you to groups. */
			@JsonProperty("allow_invite_group") AllowInviteGroup allowInviteGroup,
			/** Who can see your news feed. */
			@JsonProperty("allow_receive_news_feed") AllowReceiveNewsFeed allowReceiveNewsFeed,
			/** Alert settings. */
			Map<String, Boolean> alert,
			/** Custom user profile fields. */
			JsonNode fields
		) {
			public UsersEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersEditResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersClaimsParams(
			/** Filter claims by their type. */
			UsersType type,
			/** Filter claims by their state. */
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
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("claim_date") double claimDate,
			@JsonProperty("claim_state") String claimState,
			@JsonProperty("message_body") String messageBody,
			@JsonProperty("message_body_html") String messageBodyHtml,
			@JsonProperty("message_body_plain_text") String messageBodyPlainText,
			double amount,
			@JsonProperty("amount_formatted") String amountFormatted,
			Resp_UserModel author
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsMarket(
			double total,
			double solved,
			double settled,
			double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsNoMarket(
			double total,
			double solved,
			double settled,
			double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStats(
			UsersClaimsResponseStatsMarket market,
			UsersClaimsResponseStatsNoMarket noMarket
		) {}

		public record UsersAvatarUploadBody(
			/** Binary data of the avatar. */
			byte[] avatar,
			/** The starting point of the selection by width. Default value - 0 */
			Long x,
			/** The starting point of the selection by height. Default value - 0 */
			Long y,
			/** Selection size. */
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersAvatarCropBody(
			/** The starting point of the selection by width. Default value - 0 */
			Long x,
			/** The starting point of the selection by height. Default value - 0 */
			Long y,
			/** Selection size. */
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
			/** Binary data of the background. Background image must be 1920x1080 pixels */
			byte[] background,
			/** The starting point of the selection by width. Default value - 0 */
			Long x,
			/** The starting point of the selection by height. Default value - 0 */
			Long y,
			/** Selection size. */
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersBackgroundCropBody(
			/** The starting point of the selection by width. Default value - 0 */
			Long x,
			/** The starting point of the selection by height. Default value - 0 */
			Long y,
			/** Selection size. */
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
			/** Ordering of followers. */
			UsersOrder order,
			/** Page number of followers. */
			Long page,
			/** Number of followers in a page. */
			Long limit
		) {
			public UsersFollowersParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponse(
			List<UsersFollowersResponseUsers> users,
			@JsonProperty("users_total") double usersTotal,
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
			@JsonProperty("content_id") double contentId,
			@JsonProperty("follow_date") double followDate,
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("user_message_count") double userMessageCount,
			@JsonProperty("user_register_date") double userRegisterDate,
			@JsonProperty("user_like_count") double userLikeCount,
			@JsonProperty("user_like2_count") double userLike2Count,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("trophy_count") double trophyCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("is_banned") double isBanned,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") double userLastSeenDate,
			@JsonProperty("user_following_count") double userFollowingCount,
			@JsonProperty("user_followers_count") double userFollowersCount,
			UsersFollowersResponseUsersLinks links,
			UsersFollowersResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") double userGroupId,
			@JsonProperty("custom_fields") UsersFollowersResponseUsersCustomFields customFields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseLinks(
			double pages,
			double page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersFollowingsParams(
			/** Ordering of users. */
			UsersOrder order,
			/** Page number of users. */
			Long page,
			/** Number of users in a page. */
			Long limit
		) {
			public UsersFollowingsParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponse(
			List<UsersFollowingsResponseUsers> users,
			@JsonProperty("users_total") double usersTotal,
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
			@JsonProperty("content_id") double contentId,
			@JsonProperty("follow_date") double followDate,
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("username_html") String usernameHtml,
			@JsonProperty("user_message_count") double userMessageCount,
			@JsonProperty("user_register_date") double userRegisterDate,
			@JsonProperty("user_like_count") double userLikeCount,
			@JsonProperty("user_like2_count") double userLike2Count,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("trophy_count") double trophyCount,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("is_banned") double isBanned,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("user_is_valid") boolean userIsValid,
			@JsonProperty("user_is_verified") boolean userIsVerified,
			@JsonProperty("user_is_followed") boolean userIsFollowed,
			@JsonProperty("user_last_seen_date") double userLastSeenDate,
			@JsonProperty("user_following_count") double userFollowingCount,
			@JsonProperty("user_followers_count") double userFollowersCount,
			UsersFollowingsResponseUsersLinks links,
			UsersFollowingsResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") double userGroupId,
			@JsonProperty("custom_fields") UsersFollowingsResponseUsersCustomFields customFields
		) {}

		public record UsersLikesParams(
			/** Filter by forum section. */
			@JsonProperty("node_id") Long nodeId,
			/** Like type. */
			@JsonProperty("like_type") LikeType likeType,
			/** Likes type. Default: gotten */
			UsersTypeLikes type,
			/** Page number. */
			Long page,
			/** Content type. Default: post */
			@JsonProperty("content_type") ContentType contentType,
			/** Get only likes from specified user. */
			@JsonProperty("search_user_id") Long searchUserId,
			/** Show weekly statistics. */
			Boolean stats
		) {
			public UsersLikesParams() {
				this(null, null, UsersTypeLikes.GOTTEN, null, ContentType.POST, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersLikesResponse(
			double page,
			double perPage,
			String contentType,
			double totalLikes,
			JsonNode likes,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record UsersIgnoredParams(
			/** If included in the request, only the user count is returned as **users_total**. */
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
			@JsonProperty("ignore_content") double ignoreContent,
			@JsonProperty("ignore_conversations") double ignoreConversations,
			@JsonProperty("restrict_view_profile") double restrictViewProfile
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
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			double convertedDeposit,
			@JsonProperty("custom_fields") UsersIgnoredResponseUsersCustomFields customFields,
			double deposit,
			String homepage,
			@JsonProperty("ignored_info") UsersIgnoredResponseUsersIgnoredInfo ignoredInfo,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_followed") boolean isFollowed,
			@JsonProperty("is_ignored") boolean isIgnored,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			String location,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			UsersIgnoredResponseUsersRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
			@JsonProperty("user_id") double userId,
			@JsonProperty("user_title") String userTitle,
			String username,
			@JsonProperty("view_url") String viewUrl,
			@JsonProperty("warning_points") double warningPoints
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersIgnoreEditParams(
			/** Ignore user's conversations. */
			@JsonProperty("ignore_conversations") Boolean ignoreConversations,
			/** Ignore user's content. */
			@JsonProperty("ignore_content") Boolean ignoreContent,
			/** Restrict user from viewing your profile. */
			@JsonProperty("restrict_view_profile") Boolean restrictViewProfile
		) {
			public UsersIgnoreEditParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoreEditResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnignoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record UsersContentsParams(
			/** Page number of contents. */
			Long page,
			/** Number of contents in a page. */
			Long limit
		) {
			public UsersContentsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponse(
			List<UsersContentsResponseData> data,
			@JsonProperty("data_total") double dataTotal,
			Resp_UserModel user,
			UsersContentsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataLikeUsers(
			@JsonProperty("user_id") double userId,
			String username,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_banned") double isBanned,
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
		public record UsersContentsResponseData(
			@JsonProperty("content_type") String contentType,
			@JsonProperty("content_id") double contentId,
			@JsonProperty("post_id") double postId,
			@JsonProperty("thread_id") double threadId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			String signature,
			@JsonProperty("signature_html") String signatureHtml,
			@JsonProperty("signature_plain_text") String signaturePlainText,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_attachment_count") double postAttachmentCount,
			@JsonProperty("like_users") List<UsersContentsResponseDataLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") double postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			UsersContentsResponseDataLinks links,
			UsersContentsResponseDataPermissions permissions,
			Resp_ThreadModel thread
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseLinks(
			double pages,
			double page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponse(
			List<UsersTrophiesResponseTrophies> trophies,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponseTrophies(
			@JsonProperty("trophy_id") double trophyId,
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
			@JsonProperty("sa_id") double saId,
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ProfilePostsApi Types ────────────────────────────────────────

	public static final class ProfilePostsApiTypes {

		private ProfilePostsApiTypes() {
		}

		public record ProfilePostsListParams(
			/** Filter to get only posts from the specified user. */
			@JsonProperty("posts_user_id") Long postsUserId,
			/** Page number of contents. */
			Long page,
			/** Number of contents in a page. */
			Long limit,
			/** List of fields to include. */
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ProfilePostsListParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsListResponse(
			@JsonProperty("profile_posts") List<Resp_ProfilePostModel> profilePosts,
			double totalProfilePosts,
			boolean canPostOnProfile,
			ProfilePostsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsListResponseLinks(
			double pages,
			double page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsGetResponse(
			@JsonProperty("profile_post") Resp_ProfilePostModel profilePost,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsEditBody(
			/** New content of the profile post. */
			@JsonProperty("post_body") String postBody,
			/** Disable comments. */
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
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("timeline_user_id") double timelineUserId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_comment_count") double postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsEditResponseProfilePostLinks links,
			ProfilePostsEditResponseProfilePostPermissions permissions
		) {}

		public record ProfilePostsDeleteParams(
			/** Reason of the profile post removal. */
			String reason
		) {
			public ProfilePostsDeleteParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsReportBody(
			/** Reason of the report. */
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsReportResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCreateBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			/** Content of a profile post. */
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
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("timeline_user_id") double timelineUserId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_comment_count") double postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsCreateResponseProfilePostLinks links,
			ProfilePostsCreateResponseProfilePostPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponse(
			List<ProfilePostsLikesResponseUsers> users,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponseUsers(
			@JsonProperty("user_id") double userId,
			String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnlikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsListParams(
			/** Id of profile post. */
			@JsonProperty("profile_post_id") Long profilePostId,
			/** Date to get older comments. Please note that this entry point does not support the page parameter but it still does support **limit**. */
			Long before,
			/** Number of profile posts in a page. */
			Long limit
		) {
			public ProfilePostsCommentsListParams(Long profilePostId) {
				this(profilePostId, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponse(
			List<Resp_ProfilePostCommentModel> comments,
			@JsonProperty("comments_total") double commentsTotal,
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
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("timeline_user_id") double timelineUserId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_comment_count") double postCommentCount,
			@JsonProperty("timeline_username") String timelineUsername,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			ProfilePostsCommentsListResponseProfilePostLinks links,
			ProfilePostsCommentsListResponseProfilePostPermissions permissions
		) {}

		public record ProfilePostsCommentsCreateBody(
			/** Id of profile post. */
			@JsonProperty("profile_post_id") Long profilePostId,
			/** Content of the new profile post comment. */
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
			@JsonProperty("comment_id") double commentId,
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("comment_user_id") double commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") double commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") double timelineUserId,
			ProfilePostsCommentsCreateResponseCommentLinks links,
			ProfilePostsCommentsCreateResponseCommentPermissions permissions
		) {}

		public record ProfilePostsCommentsEditBody(
			/** Id of profile post comment. */
			@JsonProperty("comment_id") Long commentId,
			/** New content for the profile post comment. */
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
			@JsonProperty("comment_id") double commentId,
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("comment_user_id") double commentUserId,
			@JsonProperty("comment_username") String commentUsername,
			@JsonProperty("comment_username_html") String commentUsernameHtml,
			@JsonProperty("comment_create_date") double commentCreateDate,
			@JsonProperty("comment_body") String commentBody,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("timeline_user_id") double timelineUserId,
			ProfilePostsCommentsEditResponseCommentLinks links,
			ProfilePostsCommentsEditResponseCommentPermissions permissions
		) {}

		public record ProfilePostsCommentsDeleteBody(
			/** Id of profile post comment. */
			@JsonProperty("comment_id") Long commentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsGetResponse(
			Resp_ProfilePostCommentModel comment,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfilePostsCommentsReportBody(
			/** Reason of the report. */
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsReportResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ConversationsApi Types ────────────────────────────────────────

	public static final class ConversationsApiTypes {

		private ConversationsApiTypes() {
		}

		public record ConversationsListParams(
			/** Filter conversations by folder. */
			Folder folder,
			/** Page number of conversations. */
			Long page,
			/** Number of conversations in a page. */
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
			double pages,
			double page,
			String next
		) {}

		public record ConversationsCreateBody(
			/** Id of recipient. Required if **is_group=false**. */
			@JsonProperty("recipient_id") Long recipientId,
			/** List of recipients username's. Max recipients count is 10. Required if **is_group=true**. */
			List<String> recipients,
			/** Is group. Set **false** if personal conversation, or set **true** if group. Default: false */
			@JsonProperty("is_group") Boolean isGroup,
			/** The title of new conversation. Required if **is_group=1**. */
			String title,
			/** Open invite. */
			@JsonProperty("open_invite") Boolean openInvite,
			/** Allow edit messages. */
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			/** Allow members to stick messages. */
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			/** Allow members to delete their own messages. */
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages,
			/** First message. Required if **is_group**=false */
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
			/** Id of conversation. */
			@JsonProperty("conversation_id") Long conversationId,
			/** New conversation title. */
			String title,
			/** Allow members to invite others. */
			@JsonProperty("open_invite") Boolean openInvite,
			/** Make conversation history visible to new members. */
			@JsonProperty("history_open") Boolean historyOpen,
			/** Allow members to edit their own messages. */
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			/** Allow members to stick messages. */
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			/** Allow members to delete their own messages. */
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
			/** Id of conversation. */
			@JsonProperty("conversation_id") Long conversationId,
			/** Deletion type. */
			@JsonProperty("delete_type") DeleteType deleteType
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			/** Content url. */
			String link
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsSaveResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsGetResponse(
			Resp_ConversationModel conversation,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ConversationsMessagesListParams(
			/** Page number of messages. */
			Long page,
			/** Number of messages in a page. */
			Long limit,
			/** Ordering of messages. */
			ConversationsOrder order,
			/** Date to get older messages. */
			Long before,
			/** Date to get newer messages. */
			Long after
		) {
			public ConversationsMessagesListParams() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponse(
			List<Resp_ConversationMessageModel> messages,
			@JsonProperty("messages_total") double messagesTotal,
			ConversationsMessagesListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record ConversationsMessagesCreateBody(
			/** ID of the message being replied to. */
			@JsonProperty("reply_message_id") Long replyMessageId,
			/** Content of the new message. */
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
			/** Search query string. */
			String q,
			/** Id of conversation. */
			@JsonProperty("conversation_id") Long conversationId,
			/** Search for recipients. */
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
			/** New content of the message. */
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ConversationsInviteBody(
			/** List of recipients username's. */
			List<String> recipients
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsInviteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ConversationsKickBody(
			/** Id of user to kick from conversation. */
			@JsonProperty("user_id") Long userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsKickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadAllResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			/** Filter notifications by their type. */
			UsersType type,
			/** Page number of notifications. */
			Long page,
			/** Number of notifications in a page. */
			Long limit
		) {
			public NotificationsListParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponse(
			List<Resp_NotificationModel> notifications,
			@JsonProperty("notifications_total") double notificationsTotal,
			NotificationsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponseLinks(
			String read,
			double pages,
			double page,
			String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsGetResponse(
			@JsonProperty("notification_id") double notificationId,
			Resp_NotificationModel notification,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record NotificationsReadBody(
			/** If notification_id is omitted, it's mark all existing notifications as read. */
			@JsonProperty("notification_id") Long notificationId
		) {
			public NotificationsReadBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsReadResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			/** Page number of tags list. */
			Long page,
			/** Number of results in a page. */
			Long limit
		) {
			public TagsListParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponse(
			JsonNode tags,
			@JsonProperty("tags_total") double tagsTotal,
			TagsListResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record TagsGetParams(
			/** Page number of tagged contents. */
			Long page,
			/** Number of tagged contents in a page. */
			Long limit
		) {
			public TagsGetParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponse(
			TagsGetResponseTag tag,
			List<Resp_ThreadModel> tagged,
			@JsonProperty("tagged_total") double taggedTotal,
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
			@JsonProperty("tag_id") double tagId,
			@JsonProperty("tag_text") String tagText,
			@JsonProperty("tag_use_count") double tagUseCount,
			TagsGetResponseTagLinks links
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record TagsFindParams(
			/** tag to filter. Tags start with the query will be returned. */
			String tag
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsFindResponse(
			List<String> tags,
			List<Double> ids,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── SearchApi Types ────────────────────────────────────────

	public static final class SearchApiTypes {

		private SearchApiTypes() {
		}

		public record SearchAllBody(
			/** Search query. Can be skipped if **user_id** is set. */
			String q,
			/** Tag to search for tagged contents. */
			String tag,
			/** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit,
			/** The time in milliseconds (e.g. 1767214800) before last content date. */
			Long before
		) {
			public SearchAllBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponse(
			List<Resp_ForumModel> data,
			@JsonProperty("data_total") double dataTotal,
			List<Resp_UserModel> users,
			SearchAllResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record SearchThreadsBody(
			/** Search query. Can be skipped if **user_id** is set. */
			String q,
			/** Tag to search for tagged contents. */
			String tag,
			/** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit,
			/** Number of thread data to be returned. */
			@JsonProperty("data_limit") Long dataLimit,
			/** The time in milliseconds (e.g. 1767214800) before last content date. */
			Long before
		) {
			public SearchThreadsBody() {
				this(null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponse(
			List<Resp_ForumModel> data,
			@JsonProperty("data_total") double dataTotal,
			SearchThreadsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record SearchPostsBody(
			/** Search query. Can be skipped if **user_id** is set. */
			String q,
			/** Tag to search for tagged contents. */
			String tag,
			/** Id of the container forum to search for contents. Child forums of the specified forum will be included in the search. */
			@JsonProperty("forum_id") Long forumId,
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit,
			/** Number of post data to be returned. */
			@JsonProperty("data_limit") Long dataLimit,
			/** The time in milliseconds (e.g. 1767214800) before last content date. */
			Long before
		) {
			public SearchPostsBody() {
				this(null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponse(
			List<Resp_PostModel> data,
			@JsonProperty("data_total") double dataTotal,
			SearchPostsResponseLinks links,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseLinks(
			double pages,
			double page,
			String next
		) {}

		public record SearchUsersBody(
			/** Search query. */
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
			/** Search query. Can be skipped if **user_id** is set. */
			String q,
			/** User ID to filter profile posts. */
			@JsonProperty("user_id") Long userId,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit,
			/** The time in milliseconds (e.g. 1767214800) before last content date. */
			Long before
		) {
			public SearchProfilePostsBody() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponse(
			List<SearchProfilePostsResponseData> data,
			@JsonProperty("data_total") double dataTotal,
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
			@JsonProperty("content_id") double contentId,
			@JsonProperty("profile_post_id") double profilePostId,
			@JsonProperty("timeline_user_id") double timelineUserId,
			@JsonProperty("poster_user_id") double posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("poster_username_html") String posterUsernameHtml,
			@JsonProperty("post_create_date") double postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_like_count") double postLikeCount,
			@JsonProperty("post_comment_count") double postCommentCount,
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
			double pages,
			double page,
			String next
		) {}

		public record SearchTaggedBody(
			/** Tag to search for tagged contents. */
			String tag,
			/** Array of tags to search for tagged contents. */
			List<String> tags,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit
		) {
			public SearchTaggedBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponse(
			List<Resp_ThreadModel> data,
			@JsonProperty("data_total") double dataTotal,
			@JsonProperty("search_tags") JsonNode searchTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record SearchResultsParams(
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit
		) {
			public SearchResultsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponse(
			List<Resp_ThreadModel> data,
			@JsonProperty("data_total") double dataTotal,
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
			/** Room id. */
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
			@JsonProperty("room_id") double roomId,
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
			@JsonProperty("avatar_date") double avatarDate,
			@JsonProperty("background_date") double backgroundDate,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			ChatboxIndexResponseIgnoreRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
			@JsonProperty("uniq_banner") JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") double userId,
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
			@JsonProperty("chat:0") double chat_0
		) {}

		public record ChatboxGetMessagesParams(
			/** Room id. */
			@JsonProperty("room_id") RoomId roomId,
			/** Message id to get older chat messages. */
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
			/** Room ID. */
			@JsonProperty("room_id") RoomId roomId,
			/** ID of the message being replied to. */
			@JsonProperty("reply_message_id") Long replyMessageId,
			/** Content of the chat message. */
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
			/** Message id. */
			@JsonProperty("message_id") Long messageId,
			/** New content of the chat message. */
			String message
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxEditMessageResponse(
			Resp_ChatboxMessageModel message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteMessageBody(
			/** Message id. */
			@JsonProperty("message_id") Long messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteMessageResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ChatboxOnlineParams(
			/** Room id. */
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
			@JsonProperty("avatar_date") double avatarDate,
			@JsonProperty("background_date") double backgroundDate,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			ChatboxOnlineResponseUsersRendered rendered,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
			@JsonProperty("uniq_banner") ChatboxOnlineResponseUsersUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") double userId,
			String username
		) {}

		public record ChatboxReportReasonsParams(
			/** Message id. */
			@JsonProperty("message_id") Long messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportReasonsResponse(
			List<String> reasons,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ChatboxReportBody(
			/** Message id. */
			@JsonProperty("message_id") Long messageId,
			/** Report reason. */
			String reason
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ChatboxGetLeaderboardParams(
			/** Duration. */
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
			double count,
			@JsonProperty("user_id") double userId,
			@JsonProperty("avatar_date") double avatarDate,
			@JsonProperty("background_date") double backgroundDate,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			ChatboxGetLeaderboardResponseLeaderboardRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
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
			@JsonProperty("avatar_date") double avatarDate,
			@JsonProperty("background_date") double backgroundDate,
			@JsonProperty("contest_count") double contestCount,
			@JsonProperty("custom_title") String customTitle,
			@JsonProperty("display_banner_id") double displayBannerId,
			@JsonProperty("display_icon_group_id") double displayIconGroupId,
			@JsonProperty("display_style_group_id") double displayStyleGroupId,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("last_activity") double lastActivity,
			@JsonProperty("like2_count") double like2Count,
			@JsonProperty("like_count") double likeCount,
			@JsonProperty("message_count") double messageCount,
			@JsonProperty("register_date") double registerDate,
			ChatboxGetIgnoreResponseIgnoredRendered rendered,
			@JsonProperty("short_link") JsonNode shortLink,
			@JsonProperty("trophy_points") double trophyPoints,
			@JsonProperty("uniq_banner") JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_id") double userId,
			String username
		) {}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── FormsApi Types ────────────────────────────────────────

	public static final class FormsApiTypes {

		private FormsApiTypes() {
		}

		public record FormsListParams(
			/** Page number of forms. */
			Long page
		) {
			public FormsListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponse(
			List<FormsListResponseForms> forms,
			double formsPerPage,
			double page,
			double totalForms,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFieldsFieldChoices(
			String buy,
			String sell
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFields(
			@JsonProperty("field_id") double fieldId,
			String title,
			FormsListResponseFormsFieldsFieldChoices fieldChoices,
			double required,
			@JsonProperty("max_length") double maxLength,
			@JsonProperty("default_value") String defaultValue
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseForms(
			@JsonProperty("form_id") double formId,
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
			Resp_ThreadModel content,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

}
