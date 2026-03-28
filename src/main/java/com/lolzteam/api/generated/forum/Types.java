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
			@JsonProperty("notification_id") Double notificationId,
			@JsonProperty("notification_create_date") Double notificationCreateDate,
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("content_action") @Nullable String contentAction,
			@JsonProperty("notification_is_unread") @Nullable JsonNode notificationIsUnread,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("notification_type") @Nullable String notificationType,
			@Nullable Resp_NotificationModelLinks links,
			@JsonProperty("notification_html") @Nullable String notificationHtml
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_NotificationModelLinks(
			@Nullable String content,
			@JsonProperty("creator_avatar") @Nullable String creatorAvatar
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModel(
			@JsonProperty("link_id") Double linkId,
			@JsonProperty("link_title") @Nullable String linkTitle,
			@JsonProperty("link_description") @Nullable String linkDescription,
			@Nullable Resp_LinkModelLinks links,
			@Nullable Resp_LinkModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModelLinks(
			@Nullable String target,
			@Nullable String detail
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_LinkModelPermissions(
			@Nullable JsonNode view
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModel(
			@JsonProperty("can_report") @Nullable JsonNode canReport,
			Double date,
			@JsonProperty("is_deleted") @Nullable JsonNode isDeleted,
			@Nullable String message,
			@JsonProperty("message_id") Double messageId,
			@Nullable String messageJson,
			@Nullable String messageRaw,
			@Nullable Resp_ChatboxMessageModelRoom room,
			@Nullable Resp_ChatboxMessageModelUser user
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelRoom(
			@JsonProperty("can_report") @Nullable JsonNode canReport,
			@Nullable JsonNode eng,
			@Nullable JsonNode market,
			@JsonProperty("room_id") Double roomId,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserRendered(
			@Nullable String username,
			@Nullable Resp_ChatboxMessageModelUserRenderedAvatars avatars,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUserUniqBanner(
			@JsonProperty("banner_css") @Nullable String bannerCss,
			@JsonProperty("banner_text") @Nullable String bannerText,
			@JsonProperty("banner_icon") @Nullable String bannerIcon,
			@JsonProperty("username_icon") @Nullable String usernameIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ChatboxMessageModelUser(
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("background_date") Double backgroundDate,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_admin") @Nullable JsonNode isAdmin,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("is_moderator") @Nullable JsonNode isModerator,
			@JsonProperty("is_staff") @Nullable JsonNode isStaff,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable Resp_ChatboxMessageModelUserRendered rendered,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("uniq_banner") @Nullable Resp_ChatboxMessageModelUserUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModel(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@JsonProperty("user_message_count") Double userMessageCount,
			@JsonProperty("user_register_date") Double userRegisterDate,
			@JsonProperty("user_like_count") Double userLikeCount,
			@JsonProperty("user_like2_count") Double userLike2Count,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("trophy_count") Double trophyCount,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@Nullable String balance,
			@Nullable String hold,
			@Nullable String currency,
			@JsonProperty("user_email") @Nullable String userEmail,
			@JsonProperty("user_unread_notification_count") Double userUnreadNotificationCount,
			@JsonProperty("user_unread_conversation_count") Double userUnreadConversationCount,
			@JsonProperty("conv_welcome_message") @Nullable String convWelcomeMessage,
			@JsonProperty("user_title") @Nullable String userTitle,
			@JsonProperty("user_deposit") Double userDeposit,
			@JsonProperty("user_is_valid") @Nullable JsonNode userIsValid,
			@JsonProperty("user_is_verified") @Nullable JsonNode userIsVerified,
			@JsonProperty("user_is_followed") @Nullable JsonNode userIsFollowed,
			@JsonProperty("user_last_seen_date") Double userLastSeenDate,
			@Nullable Resp_UserModelLinks links,
			@Nullable Resp_UserModelPermissions permissions,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("user_is_visitor") @Nullable JsonNode userIsVisitor,
			@JsonProperty("user_group_id") Double userGroupId,
			@JsonProperty("curator_titles") @Nullable List<String> curatorTitles,
			@JsonProperty("user_groups") @Nullable List<Resp_UserModelUserGroups> userGroups,
			@Nullable List<Resp_UserModelFields> fields,
			@JsonProperty("user_timezone_offset") Double userTimezoneOffset,
			@JsonProperty("user_external_authentications") @Nullable List<Resp_UserModelUserExternalAuthentications> userExternalAuthentications,
			@JsonProperty("self_permissions") @Nullable Resp_UserModelSelfPermissions selfPermissions,
			@JsonProperty("edit_permissions") @Nullable Resp_UserModelEditPermissions editPermissions,
			@Nullable Resp_UserModelBirthday birthday,
			@JsonProperty("secret_answer_rendered") @Nullable String secretAnswerRendered,
			@JsonProperty("secret_answer_first_letter") @Nullable String secretAnswerFirstLetter,
			@JsonProperty("user_following") @Nullable Resp_UserModelUserFollowing userFollowing,
			@JsonProperty("user_followers") @Nullable Resp_UserModelUserFollowers userFollowers,
			@Nullable String banner
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String avatar,
			@JsonProperty("avatar_big") @Nullable String avatarBig,
			@JsonProperty("avatar_small") @Nullable String avatarSmall,
			@Nullable String followers,
			@Nullable String followings,
			@Nullable String ignore,
			@JsonProperty("background_l") @Nullable String backgroundL,
			@JsonProperty("background_m") @Nullable String backgroundM,
			@Nullable String status,
			@Nullable String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelPermissions(
			@Nullable JsonNode edit,
			@Nullable JsonNode follow,
			@Nullable JsonNode ignore,
			@JsonProperty("profile_post") @Nullable JsonNode profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserGroups(
			@JsonProperty("user_group_id") Double userGroupId,
			@JsonProperty("user_group_title") @Nullable String userGroupTitle,
			@JsonProperty("user_group_title_en") @Nullable String userGroupTitleEn,
			@JsonProperty("user_group_banner_css_class") @Nullable String userGroupBannerCssClass,
			@JsonProperty("user_group_banner_text") @Nullable String userGroupBannerText,
			@JsonProperty("user_group_banner_text_en") @Nullable String userGroupBannerTextEn,
			@JsonProperty("display_group_selectable") @Nullable JsonNode displayGroupSelectable,
			@JsonProperty("display_banner_selectable") @Nullable JsonNode displayBannerSelectable,
			@JsonProperty("display_icon_selectable") @Nullable JsonNode displayIconSelectable,
			@JsonProperty("is_primary_group") @Nullable JsonNode isPrimaryGroup,
			@JsonProperty("user_group_icon_class") @Nullable String userGroupIconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelFieldsChoices(
			@Nullable String key,
			@Nullable String value
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelFields(
			@Nullable String id,
			@Nullable String title,
			@Nullable String description,
			@Nullable String position,
			@JsonProperty("is_required") @Nullable JsonNode isRequired,
			@Nullable String value,
			@JsonProperty("is_multi_choice") @Nullable JsonNode isMultiChoice,
			@Nullable List<Resp_UserModelFieldsChoices> choices,
			@Nullable List<JsonNode> values
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserExternalAuthentications(
			@Nullable String provider,
			@JsonProperty("provider_key") @Nullable String providerKey
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelSelfPermissions(
			@JsonProperty("create_conversation") @Nullable JsonNode createConversation
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelEditPermissions(
			@Nullable JsonNode password,
			@JsonProperty("user_email") @Nullable JsonNode userEmail,
			@Nullable JsonNode username,
			@JsonProperty("user_title") @Nullable JsonNode userTitle,
			@JsonProperty("short_link") @Nullable JsonNode shortLink,
			@JsonProperty("hide_username_logs") @Nullable JsonNode hideUsernameLogs,
			@JsonProperty("primary_group_id") @Nullable JsonNode primaryGroupId,
			@JsonProperty("secondary_group_ids") @Nullable JsonNode secondaryGroupIds,
			@JsonProperty("user_dob_day") @Nullable JsonNode userDobDay,
			@JsonProperty("user_dob_month") @Nullable JsonNode userDobMonth,
			@JsonProperty("user_dob_year") @Nullable JsonNode userDobYear,
			@Nullable JsonNode fields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelBirthdayTimeStamp(
			@Nullable String date,
			@JsonProperty("timezone_type") Double timezoneType,
			@Nullable String timezone
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelBirthday(
			Double age,
			@Nullable Resp_UserModelBirthdayTimeStamp timeStamp,
			@Nullable String format
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowingUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@Nullable String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowing(
			@Nullable List<Resp_UserModelUserFollowingUsers> users,
			Double count
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowersUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@Nullable String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_UserModelUserFollowers(
			@Nullable List<Resp_UserModelUserFollowersUsers> users,
			Double count
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModel(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_closed") @Nullable JsonNode threadIsClosed,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("thread_is_starred") @Nullable JsonNode threadIsStarred,
			@JsonProperty("first_post") @Nullable Resp_ThreadModelFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable JsonNode threadTags,
			@Nullable Resp_ThreadModelLinks links,
			@Nullable Resp_ThreadModelPermissions permissions,
			@JsonProperty("node_title") @Nullable String nodeTitle,
			@Nullable Resp_ThreadModelRestrictions restrictions,
			@JsonProperty("last_post") @Nullable Resp_ThreadModelLastPost lastPost,
			@Nullable Resp_ThreadModelContest contest
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@JsonProperty("post_is_liked") @Nullable JsonNode postIsLiked,
			@Nullable Resp_ThreadModelFirstPostLinks links,
			@Nullable Resp_ThreadModelFirstPostPermissions permissions,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelPermissionsBump(
			@Nullable JsonNode can,
			@JsonProperty("available_count") Double availableCount,
			@Nullable JsonNode error,
			@JsonProperty("next_available_time") @Nullable JsonNode nextAvailableTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@Nullable JsonNode edit,
			@JsonProperty("edit_title") @Nullable JsonNode editTitle,
			@JsonProperty("edit_tags") @Nullable JsonNode editTags,
			@Nullable Resp_ThreadModelPermissionsBump bump
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelRestrictions(
			@JsonProperty("reply_delay") Double replyDelay,
			@JsonProperty("max_reply_count") Double maxReplyCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelLastPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@JsonProperty("post_is_liked") @Nullable JsonNode postIsLiked,
			@Nullable Resp_ThreadModelLastPostLinks links,
			@Nullable Resp_ThreadModelLastPostPermissions permissions,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelContestPermissions(
			@JsonProperty("can_finish") @Nullable JsonNode canFinish,
			@JsonProperty("can_participate") @Nullable JsonNode canParticipate,
			@JsonProperty("can_participate_error") @Nullable String canParticipateError,
			@JsonProperty("can_view_user_list") @Nullable JsonNode canViewUserList
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ThreadModelContest(
			@Nullable String type,
			@JsonProperty("finish_date") Double finishDate,
			@JsonProperty("now_count_members") Double nowCountMembers,
			@JsonProperty("needed_members") Double neededMembers,
			@JsonProperty("is_finished") Double isFinished,
			@JsonProperty("count_winners") Double countWinners,
			@JsonProperty("require_like_count") Double requireLikeCount,
			@JsonProperty("require_total_like_count") Double requireTotalLikeCount,
			@JsonProperty("prize_type") @Nullable String prizeType,
			@JsonProperty("prize_type_phrase") @Nullable String prizeTypePhrase,
			@JsonProperty("prize_data") Double prizeData,
			@JsonProperty("is_money_places") Double isMoneyPlaces,
			@JsonProperty("chance_to_win") Double chanceToWin,
			@Nullable List<Double> winners,
			@JsonProperty("already_participate") @Nullable JsonNode alreadyParticipate,
			@Nullable Resp_ThreadModelContestPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModel(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable Resp_PostModelLinks links,
			@Nullable Resp_PostModelPermissions permissions,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModel(
			@JsonProperty("post_comment_id") Double postCommentId,
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_comment_create_date") Double postCommentCreateDate,
			@JsonProperty("post_comment_body") @Nullable String postCommentBody,
			@JsonProperty("post_comment_body_html") @Nullable String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") @Nullable String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") Double postCommentLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_comment_is_published") @Nullable JsonNode postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") @Nullable JsonNode postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") Double postCommentUpdateDate,
			@Nullable Resp_PostCommentModelLinks links,
			@Nullable Resp_PostCommentModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String post,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_PostCommentModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModel(
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_comment_count") Double postCommentCount,
			@JsonProperty("post_comments_is_disabled") Double postCommentsIsDisabled,
			@JsonProperty("timeline_username") @Nullable String timelineUsername,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_is_liked") @Nullable JsonNode postIsLiked,
			@JsonProperty("post_is_sticked") @Nullable JsonNode postIsSticked,
			@Nullable Resp_ProfilePostModelLinks links,
			@Nullable Resp_ProfilePostModelPermissions permissions,
			@JsonProperty("timeline_user") @Nullable JsonNode timelineUser
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String comments,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode like,
			@Nullable JsonNode comment,
			@Nullable JsonNode report,
			@Nullable JsonNode stick
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModel(
			@JsonProperty("comment_id") Double commentId,
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("comment_user_id") Double commentUserId,
			@JsonProperty("comment_username") @Nullable String commentUsername,
			@JsonProperty("comment_username_html") @Nullable String commentUsernameHtml,
			@JsonProperty("comment_create_date") Double commentCreateDate,
			@JsonProperty("comment_body") @Nullable String commentBody,
			@JsonProperty("comment_body_html") @Nullable String commentBodyHtml,
			@JsonProperty("comment_body_plain_text") @Nullable String commentBodyPlainText,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@Nullable Resp_ProfilePostCommentModelLinks links,
			@Nullable Resp_ProfilePostCommentModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModelLinks(
			@Nullable String detail,
			@JsonProperty("profile_post") @Nullable String profilePost,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ProfilePostCommentModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModel(
			@JsonProperty("conversation_id") Double conversationId,
			@JsonProperty("conversation_title") @Nullable String conversationTitle,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("conversation_create_date") Double conversationCreateDate,
			@JsonProperty("conversation_update_date") Double conversationUpdateDate,
			@JsonProperty("conversation_last_read_date") Double conversationLastReadDate,
			@JsonProperty("conversation_online_count") Double conversationOnlineCount,
			@JsonProperty("is_starred") Double isStarred,
			@JsonProperty("is_group") Double isGroup,
			@JsonProperty("is_unread") Double isUnread,
			Double alerts,
			@Nullable Resp_ConversationModelPermissions permissions,
			@JsonProperty("conversation_message_count") Double conversationMessageCount,
			@JsonProperty("conversation_is_new") @Nullable JsonNode conversationIsNew,
			@JsonProperty("creator_is_ignored") @Nullable JsonNode creatorIsIgnored,
			@JsonProperty("conversation_is_open") @Nullable JsonNode conversationIsOpen,
			@JsonProperty("conversation_is_deleted") @Nullable JsonNode conversationIsDeleted,
			@Nullable Resp_ConversationModelRecipient recipient,
			@Nullable List<Resp_ConversationModelRecipients> recipients,
			@Nullable Resp_ConversationModelLinks links
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode reply,
			@Nullable JsonNode invite,
			@JsonProperty("manage_invite_links") @Nullable JsonNode manageInviteLinks,
			@Nullable JsonNode kick,
			@JsonProperty("upload_avatar") @Nullable JsonNode uploadAvatar,
			@Nullable JsonNode editOwnPost,
			@Nullable JsonNode stickyMessages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelRecipient(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("is_online") @Nullable JsonNode isOnline,
			@JsonProperty("contacts_changed") @Nullable JsonNode contactsChanged,
			@Nullable String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelRecipients(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("is_online") @Nullable JsonNode isOnline,
			@JsonProperty("contacts_changed") @Nullable JsonNode contactsChanged,
			@Nullable String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationModelLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String messages,
			@Nullable String avatar
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModel(
			@JsonProperty("message_id") Double messageId,
			@JsonProperty("conversation_id") Double conversationId,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("message_create_date") Double messageCreateDate,
			@JsonProperty("message_is_unread") Double messageIsUnread,
			@JsonProperty("message_need_translate") @Nullable JsonNode messageNeedTranslate,
			@JsonProperty("message_is_system") @Nullable JsonNode messageIsSystem,
			@JsonProperty("message_edit_date") Double messageEditDate,
			@JsonProperty("message_body") @Nullable String messageBody,
			@JsonProperty("message_body_html") @Nullable String messageBodyHtml,
			@JsonProperty("message_body_plain_text") @Nullable String messageBodyPlainText,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@Nullable Resp_ConversationMessageModelLinks links,
			@Nullable Resp_ConversationMessageModelPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModelLinks(
			@Nullable String detail,
			@Nullable String conversation,
			@Nullable String creator,
			@JsonProperty("creator_avatar") @Nullable String creatorAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_ConversationMessageModelPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("stick-unstick") @Nullable JsonNode stickUnstick
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_SystemInfo(
			@JsonProperty("visitor_id") Double visitorId,
			Double time
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
			@JsonProperty("access_token") @Nullable String accessToken,
			@JsonProperty("token_type") @Nullable String tokenType,
			@JsonProperty("expires_in") Double expiresIn,
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
			@Nullable String contents,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<CategoriesListResponseCategories> categories,
			@JsonProperty("categories_total") Double categoriesTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategoriesLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategoriesPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesListResponseCategories(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_description") @Nullable String categoryDescription,
			@Nullable CategoriesListResponseCategoriesLinks links,
			@Nullable CategoriesListResponseCategoriesPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponse(
			@Nullable CategoriesGetResponseCategory category,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategoryLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategoryPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoriesGetResponseCategory(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_description") @Nullable String categoryDescription,
			@Nullable CategoriesGetResponseCategoryLinks links,
			@Nullable CategoriesGetResponseCategoryPermissions permissions
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
			@Nullable List<ForumsListResponseForums> forums,
			@JsonProperty("forums_total") Double forumsTotal,
			@Nullable List<ForumsListResponseTabs> tabs,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<ForumsListResponseForumsForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForumsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseForums(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<ForumsListResponseForumsForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ForumsListResponseForumsLinks links,
			@Nullable ForumsListResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsListResponseTabs(
			@JsonProperty("link_title") @Nullable String linkTitle,
			@Nullable JsonNode isDefault,
			@Nullable String title,
			@Nullable JsonNode isHidden
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponse(
			@Nullable JsonNode data,
			@Nullable List<ForumsGroupedResponseTabs> tabs,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGroupedResponseTabs(
			@JsonProperty("link_title") @Nullable String linkTitle,
			@Nullable JsonNode isDefault,
			@Nullable String title,
			@Nullable JsonNode isHidden
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponse(
			@Nullable ForumsGetResponseForum forum,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<ForumsGetResponseForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetResponseForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<ForumsGetResponseForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ForumsGetResponseForumLinks links,
			@Nullable ForumsGetResponseForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponse(
			@Nullable List<ForumsFollowersResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponseUsersFollow(
			@Nullable JsonNode post,
			@Nullable JsonNode alert,
			@Nullable JsonNode email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowersResponseUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@Nullable ForumsFollowersResponseUsersFollow follow
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<ForumsFollowedResponseForums> forums,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<ForumsFollowedResponseForumsForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForumsFollow(
			@Nullable JsonNode post,
			@Nullable JsonNode alert,
			@Nullable JsonNode email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsFollowedResponseForums(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<ForumsFollowedResponseForumsForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ForumsFollowedResponseForumsLinks links,
			@Nullable ForumsFollowedResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed,
			@Nullable ForumsFollowedResponseForumsFollow follow
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponse(
			@Nullable List<ForumsGetFeedOptionsResponseForums> forums,
			@JsonProperty("excluded_forums_ids") @Nullable List<Double> excludedForumsIds,
			@JsonProperty("default_excluded_forums_ids") @Nullable List<Double> defaultExcludedForumsIds,
			@Nullable String keywords,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForumsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForumsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ForumsGetFeedOptionsResponseForums(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("parent_node_id") Double parentNodeId,
			@Nullable ForumsGetFeedOptionsResponseForumsLinks links,
			@Nullable ForumsGetFeedOptionsResponseForumsPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed,
			@JsonProperty("has_children") @Nullable JsonNode hasChildren
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── LinksApi Types ────────────────────────────────────────

	public static final class LinksApiTypes {

		private LinksApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record LinksListResponse(
			@JsonProperty("link-forums") @Nullable List<JsonNode> linkForums,
			@JsonProperty("link-forums_total") Double linkForumsTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record LinksGetResponse(
			@JsonProperty("link-forum") @Nullable JsonNode linkForum,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<PagesListResponsePages> pages,
			@JsonProperty("pages_total") Double pagesTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePagesLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-pages") @Nullable String subPages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePagesPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesListResponsePages(
			@JsonProperty("page_id") Double pageId,
			@JsonProperty("page_title") @Nullable String pageTitle,
			@JsonProperty("page_description") @Nullable String pageDescription,
			@Nullable PagesListResponsePagesLinks links,
			@Nullable PagesListResponsePagesPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponse(
			@Nullable PagesGetResponsePage page,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePageLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-pages") @Nullable String subPages
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePagePermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PagesGetResponsePage(
			@JsonProperty("page_id") Double pageId,
			@JsonProperty("page_title") @Nullable String pageTitle,
			@JsonProperty("page_description") @Nullable String pageDescription,
			@JsonProperty("page_view_count") Double pageViewCount,
			@Nullable PagesGetResponsePageLinks links,
			@Nullable PagesGetResponsePagePermissions permissions,
			@JsonProperty("page_html") @Nullable String pageHtml
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
			@Nullable List<NavigationListResponseElements> elements,
			@JsonProperty("elements_count") Double elementsCount,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElementsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@JsonProperty("sub-elements") @Nullable String subElements
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElementsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NavigationListResponseElements(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_description") @Nullable String categoryDescription,
			@Nullable NavigationListResponseElementsLinks links,
			@Nullable NavigationListResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") @Nullable String navigationType,
			@JsonProperty("navigation_id") Double navigationId,
			@JsonProperty("navigation_parent_id") Double navigationParentId,
			@JsonProperty("has_sub_elements") @Nullable JsonNode hasSubElements
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
			@Nullable List<JsonNode> threads,
			@Nullable ThreadsListResponseForum forum,
			@JsonProperty("threads_total") Double threadsTotal,
			@Nullable ThreadsListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ThreadsListResponseForumLinks links,
			@Nullable ThreadsListResponseForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable JsonNode thread,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode thread,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode thread,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode thread,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode thread,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsBumpResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsHideResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsStarResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnstarResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponse(
			@Nullable List<ThreadsFollowersResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponseUsersFollow(
			@Nullable JsonNode alert,
			@Nullable JsonNode email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowersResponseUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@Nullable ThreadsFollowersResponseUsersFollow follow
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<ThreadsFollowedResponseThreads> threads,
			@JsonProperty("threads_total") Double threadsTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostLikeUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("like_users") @Nullable List<ThreadsFollowedResponseThreadsFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable ThreadsFollowedResponseThreadsFirstPostLinks links,
			@Nullable ThreadsFollowedResponseThreadsFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit,
			@JsonProperty("edit_title") @Nullable JsonNode editTitle,
			@JsonProperty("edit_tags") @Nullable JsonNode editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ThreadsFollowedResponseThreadsForumLinks links,
			@Nullable ThreadsFollowedResponseThreadsForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreadsFollow(
			@Nullable JsonNode alert,
			@Nullable JsonNode email
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFollowedResponseThreads(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable ThreadsFollowedResponseThreadsFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable JsonNode threadTags,
			@Nullable ThreadsFollowedResponseThreadsLinks links,
			@Nullable ThreadsFollowedResponseThreadsPermissions permissions,
			@Nullable ThreadsFollowedResponseThreadsForum forum,
			@Nullable ThreadsFollowedResponseThreadsFollow follow
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponse(
			@Nullable List<ThreadsNavigationResponseElements> elements,
			@JsonProperty("elements_count") Double elementsCount,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElementsLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@JsonProperty("sub-elements") @Nullable String subElements
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElementsPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsNavigationResponseElements(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_description") @Nullable String categoryDescription,
			@Nullable ThreadsNavigationResponseElementsLinks links,
			@Nullable ThreadsNavigationResponseElementsPermissions permissions,
			@JsonProperty("navigation_type") @Nullable String navigationType,
			@JsonProperty("navigation_id") Double navigationId,
			@JsonProperty("navigation_depth") Double navigationDepth,
			@JsonProperty("navigation_parent_id") Double navigationParentId,
			@JsonProperty("has_sub_elements") @Nullable JsonNode hasSubElements
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponse(
			@Nullable ThreadsPollGetResponsePoll poll,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollResponses(
			@JsonProperty("response_id") Double responseId,
			@JsonProperty("response_answer") @Nullable String responseAnswer,
			@JsonProperty("response_vote_count") Double responseVoteCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollPermissions(
			@Nullable JsonNode vote,
			@Nullable JsonNode result
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePollLinks(
			@Nullable String vote
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsPollGetResponsePoll(
			@JsonProperty("poll_id") Double pollId,
			@JsonProperty("poll_question") @Nullable String pollQuestion,
			@JsonProperty("poll_vote_count") Double pollVoteCount,
			@JsonProperty("poll_max_votes") Double pollMaxVotes,
			@JsonProperty("poll_is_open") @Nullable JsonNode pollIsOpen,
			@JsonProperty("poll_is_voted") @Nullable JsonNode pollIsVoted,
			@Nullable List<ThreadsPollGetResponsePollResponses> responses,
			@Nullable ThreadsPollGetResponsePollPermissions permissions,
			@Nullable ThreadsPollGetResponsePollLinks links
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> threads,
			@Nullable List<ThreadsUnreadResponseData> data,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostLikeUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("like_users") @Nullable List<ThreadsUnreadResponseDataFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable ThreadsUnreadResponseDataFirstPostLinks links,
			@Nullable ThreadsUnreadResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_poster") @Nullable String lastPoster,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ThreadsUnreadResponseDataForumLinks links,
			@Nullable ThreadsUnreadResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsUnreadResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable ThreadsUnreadResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable ThreadsUnreadResponseDataLinks links,
			@Nullable ThreadsUnreadResponseDataPermissions permissions,
			@Nullable ThreadsUnreadResponseDataForum forum
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
			@Nullable List<JsonNode> threads,
			@Nullable List<ThreadsRecentResponseData> data,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable ThreadsRecentResponseDataFirstPostLinks links,
			@Nullable ThreadsRecentResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_poster") @Nullable String lastPoster,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ThreadsRecentResponseDataForumLinks links,
			@Nullable ThreadsRecentResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsRecentResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable ThreadsRecentResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable ThreadsRecentResponseDataLinks links,
			@Nullable ThreadsRecentResponseDataPermissions permissions,
			@Nullable ThreadsRecentResponseDataForum forum
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ThreadsFinishResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> posts,
			@Nullable JsonNode thread,
			@JsonProperty("posts_total") Double postsTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode post,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsGetResponse(
			@Nullable JsonNode post,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode post,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<PostsLikesResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikesResponseUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsLikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsUnlikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsReportReasonsResponse(
			@Nullable List<String> reasons,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> comments,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable PostsCommentsCreateResponseComment comment,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseCommentLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String post,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseCommentPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsCreateResponseComment(
			@JsonProperty("post_comment_id") Double postCommentId,
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_comment_body") @Nullable String postCommentBody,
			@JsonProperty("post_comment_body_html") @Nullable String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") @Nullable String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") Double postCommentLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_comment_is_published") @Nullable JsonNode postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") @Nullable JsonNode postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") Double postCommentUpdateDate,
			@Nullable PostsCommentsCreateResponseCommentLinks links,
			@Nullable PostsCommentsCreateResponseCommentPermissions permissions
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
			@Nullable PostsCommentsEditResponseComment comment,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseCommentLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String post,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseCommentPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PostsCommentsEditResponseComment(
			@JsonProperty("post_comment_id") Double postCommentId,
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_comment_body") @Nullable String postCommentBody,
			@JsonProperty("post_comment_body_html") @Nullable String postCommentBodyHtml,
			@JsonProperty("post_comment_body_plain_text") @Nullable String postCommentBodyPlainText,
			@JsonProperty("post_comment_like_count") Double postCommentLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_comment_is_published") @Nullable JsonNode postCommentIsPublished,
			@JsonProperty("post_comment_is_deleted") @Nullable JsonNode postCommentIsDeleted,
			@JsonProperty("post_comment_update_date") Double postCommentUpdateDate,
			@Nullable PostsCommentsEditResponseCommentLinks links,
			@Nullable PostsCommentsEditResponseCommentPermissions permissions
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> users,
			@JsonProperty("users_total") Double usersTotal,
			@Nullable UsersListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFieldsResponse(
			@Nullable List<UsersFieldsResponseFields> fields,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFieldsResponseFields(
			@Nullable String id,
			@Nullable String title,
			@Nullable String description,
			@Nullable String position,
			@JsonProperty("is_required") @Nullable JsonNode isRequired
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
			@Nullable List<JsonNode> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode user,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<UsersClaimsResponseClaims> claims,
			@Nullable UsersClaimsResponseStats stats,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseClaims(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("claim_date") Double claimDate,
			@JsonProperty("claim_state") @Nullable String claimState,
			@JsonProperty("message_body") @Nullable String messageBody,
			@JsonProperty("message_body_html") @Nullable String messageBodyHtml,
			@JsonProperty("message_body_plain_text") @Nullable String messageBodyPlainText,
			Double amount,
			@JsonProperty("amount_formatted") @Nullable String amountFormatted,
			@Nullable JsonNode author
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsMarket(
			Double total,
			Double solved,
			Double settled,
			Double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStatsNoMarket(
			Double total,
			Double solved,
			Double settled,
			Double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersClaimsResponseStats(
			@Nullable UsersClaimsResponseStatsMarket market,
			@Nullable UsersClaimsResponseStatsNoMarket noMarket
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersAvatarDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersBackgroundDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<UsersFollowersResponseUsers> users,
			@JsonProperty("users_total") Double usersTotal,
			@Nullable UsersFollowersResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String avatar,
			@JsonProperty("avatar_big") @Nullable String avatarBig,
			@JsonProperty("avatar_small") @Nullable String avatarSmall,
			@Nullable String followers,
			@Nullable String followings,
			@Nullable String ignore,
			@Nullable String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersPermissions(
			@Nullable JsonNode edit,
			@Nullable JsonNode follow,
			@Nullable JsonNode ignore,
			@JsonProperty("profile_post") @Nullable JsonNode profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsersCustomFields(
			@Nullable String _4,
			@Nullable String lztInnovation20Link,
			@Nullable String lztInnovation30Link,
			@Nullable String lztInnovationLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseUsers(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("follow_date") Double followDate,
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@JsonProperty("user_message_count") Double userMessageCount,
			@JsonProperty("user_register_date") Double userRegisterDate,
			@JsonProperty("user_like_count") Double userLikeCount,
			@JsonProperty("user_like2_count") Double userLike2Count,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("trophy_count") Double trophyCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("user_title") @Nullable String userTitle,
			@JsonProperty("user_is_valid") @Nullable JsonNode userIsValid,
			@JsonProperty("user_is_verified") @Nullable JsonNode userIsVerified,
			@JsonProperty("user_is_followed") @Nullable JsonNode userIsFollowed,
			@JsonProperty("user_last_seen_date") Double userLastSeenDate,
			@JsonProperty("user_following_count") Double userFollowingCount,
			@JsonProperty("user_followers_count") Double userFollowersCount,
			@Nullable UsersFollowersResponseUsersLinks links,
			@Nullable UsersFollowersResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("user_is_visitor") @Nullable JsonNode userIsVisitor,
			@JsonProperty("user_group_id") Double userGroupId,
			@JsonProperty("custom_fields") @Nullable UsersFollowersResponseUsersCustomFields customFields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowersResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnfollowResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<UsersFollowingsResponseUsers> users,
			@JsonProperty("users_total") Double usersTotal,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String avatar,
			@JsonProperty("avatar_big") @Nullable String avatarBig,
			@JsonProperty("avatar_small") @Nullable String avatarSmall,
			@Nullable String followers,
			@Nullable String followings,
			@Nullable String ignore,
			@Nullable String timeline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersPermissions(
			@Nullable JsonNode edit,
			@Nullable JsonNode follow,
			@Nullable JsonNode ignore,
			@JsonProperty("profile_post") @Nullable JsonNode profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsersCustomFields(
			@Nullable String _4,
			@Nullable List<JsonNode> allowSelfUnban,
			@Nullable String discord,
			@Nullable String github,
			@Nullable String jabber,
			@Nullable String lztAwardUserTrophy,
			@Nullable String lztCuratorNodeTitle,
			@Nullable String lztCuratorNodeTitleEn,
			@Nullable String lztDeposit,
			@Nullable String lztInnovation20Link,
			@Nullable String lztInnovation30Link,
			@Nullable String lztInnovationLink,
			@Nullable String lztLikesIncreasing,
			@Nullable String lztLikesZeroing,
			@Nullable String lztSympathyIncreasing,
			@Nullable String lztSympathyZeroing,
			@Nullable String maecenasValue,
			@Nullable String scamURL,
			@Nullable String steam,
			@Nullable String telegram,
			@Nullable String vk
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersFollowingsResponseUsers(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("follow_date") Double followDate,
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("username_html") @Nullable String usernameHtml,
			@JsonProperty("user_message_count") Double userMessageCount,
			@JsonProperty("user_register_date") Double userRegisterDate,
			@JsonProperty("user_like_count") Double userLikeCount,
			@JsonProperty("user_like2_count") Double userLike2Count,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("trophy_count") Double trophyCount,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("user_title") @Nullable String userTitle,
			@JsonProperty("user_is_valid") @Nullable JsonNode userIsValid,
			@JsonProperty("user_is_verified") @Nullable JsonNode userIsVerified,
			@JsonProperty("user_is_followed") @Nullable JsonNode userIsFollowed,
			@JsonProperty("user_last_seen_date") Double userLastSeenDate,
			@JsonProperty("user_following_count") Double userFollowingCount,
			@JsonProperty("user_followers_count") Double userFollowersCount,
			@Nullable UsersFollowingsResponseUsersLinks links,
			@Nullable UsersFollowingsResponseUsersPermissions permissions,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("user_is_visitor") @Nullable JsonNode userIsVisitor,
			@JsonProperty("user_group_id") Double userGroupId,
			@JsonProperty("custom_fields") @Nullable UsersFollowingsResponseUsersCustomFields customFields
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
			Double page,
			Double perPage,
			@Nullable String contentType,
			Double totalLikes,
			@Nullable JsonNode likes,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<UsersIgnoredResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersCustomFields(
			@Nullable String _4,
			@Nullable JsonNode scamURL,
			@Nullable JsonNode lztLikesZeroing,
			@Nullable JsonNode lztLikesIncreasing,
			@Nullable JsonNode lztSympathyZeroing,
			@Nullable JsonNode lztSympathyIncreasing,
			@Nullable JsonNode telegram,
			@Nullable String vk,
			@Nullable String discord,
			@Nullable String steam,
			@Nullable JsonNode matrix,
			@Nullable String jabber,
			@Nullable String github
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersIgnoredInfo(
			@JsonProperty("ignore_content") Double ignoreContent,
			@JsonProperty("ignore_conversations") Double ignoreConversations,
			@JsonProperty("restrict_view_profile") Double restrictViewProfile
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsersRendered(
			@Nullable String username,
			@Nullable UsersIgnoredResponseUsersRenderedAvatars avatars,
			@Nullable List<JsonNode> backgrounds,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoredResponseUsers(
			@JsonProperty("can_edit") @Nullable JsonNode canEdit,
			@JsonProperty("can_follow") @Nullable JsonNode canFollow,
			@JsonProperty("can_ignore") @Nullable JsonNode canIgnore,
			@JsonProperty("can_post_profile") @Nullable JsonNode canPostProfile,
			@JsonProperty("can_view_profile") @Nullable JsonNode canViewProfile,
			@JsonProperty("can_view_profile_posts") @Nullable JsonNode canViewProfilePosts,
			@JsonProperty("can_warn") @Nullable JsonNode canWarn,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("conv_welcome_message") @Nullable String convWelcomeMessage,
			Double convertedDeposit,
			@JsonProperty("custom_fields") @Nullable UsersIgnoredResponseUsersCustomFields customFields,
			Double deposit,
			@Nullable String homepage,
			@JsonProperty("ignored_info") @Nullable UsersIgnoredResponseUsersIgnoredInfo ignoredInfo,
			@JsonProperty("is_admin") @Nullable JsonNode isAdmin,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("is_followed") @Nullable JsonNode isFollowed,
			@JsonProperty("is_ignored") @Nullable JsonNode isIgnored,
			@JsonProperty("is_moderator") @Nullable JsonNode isModerator,
			@JsonProperty("is_staff") @Nullable JsonNode isStaff,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@Nullable String location,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable UsersIgnoredResponseUsersRendered rendered,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("user_id") Double userId,
			@JsonProperty("user_title") @Nullable String userTitle,
			@Nullable String username,
			@JsonProperty("view_url") @Nullable String viewUrl,
			@JsonProperty("warning_points") Double warningPoints
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersUnignoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<UsersContentsResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@Nullable JsonNode user,
			@Nullable UsersContentsResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataLikeUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThreadLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_poster") @Nullable String lastPoster,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThreadPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseDataThread(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable UsersContentsResponseDataThreadLinks links,
			@Nullable UsersContentsResponseDataThreadPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("like_users") @Nullable List<UsersContentsResponseDataLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable UsersContentsResponseDataLinks links,
			@Nullable UsersContentsResponseDataPermissions permissions,
			@Nullable UsersContentsResponseDataThread thread
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersContentsResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponse(
			@Nullable List<UsersTrophiesResponseTrophies> trophies,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersTrophiesResponseTrophies(
			@JsonProperty("trophy_id") Double trophyId,
			@Nullable String title,
			@Nullable String description,
			@JsonProperty("trophy_url") @Nullable String trophyUrl
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSecretAnswerTypesResponse(
			@Nullable List<UsersSecretAnswerTypesResponseData> data,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSecretAnswerTypesResponseData(
			@JsonProperty("sa_id") Double saId,
			@Nullable String renderedPhrase
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSaResetResponse(
			@Nullable JsonNode success,
			@JsonProperty("waiting_time") @Nullable String waitingTime,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UsersSaCancelResetResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("profile_posts") @Nullable List<JsonNode> profilePosts,
			Double totalProfilePosts,
			@Nullable JsonNode canPostOnProfile,
			@Nullable ProfilePostsListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsGetResponse(
			@JsonProperty("profile_post") @Nullable JsonNode profilePost,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("profile_post") @Nullable ProfilePostsEditResponseProfilePost profilePost,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String comments,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode like,
			@Nullable JsonNode comment,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsEditResponseProfilePost(
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_comment_count") Double postCommentCount,
			@JsonProperty("timeline_username") @Nullable String timelineUsername,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@Nullable ProfilePostsEditResponseProfilePostLinks links,
			@Nullable ProfilePostsEditResponseProfilePostPermissions permissions
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsReportReasonsResponse(
			@Nullable List<String> reasons,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ProfilePostsCreateBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId,
			/** Content of a profile post. */
			@JsonProperty("post_body") String postBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponse(
			@JsonProperty("profile_post") @Nullable ProfilePostsCreateResponseProfilePost profilePost,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String comments,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode like,
			@Nullable JsonNode comment,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCreateResponseProfilePost(
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_comment_count") Double postCommentCount,
			@JsonProperty("timeline_username") @Nullable String timelineUsername,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@Nullable ProfilePostsCreateResponseProfilePostLinks links,
			@Nullable ProfilePostsCreateResponseProfilePostPermissions permissions
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponse(
			@Nullable List<ProfilePostsLikesResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikesResponseUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsLikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsUnlikeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> comments,
			@JsonProperty("comments_total") Double commentsTotal,
			@JsonProperty("profile_post") @Nullable ProfilePostsCommentsListResponseProfilePost profilePost,
			@JsonProperty("timeline_user") @Nullable JsonNode timelineUser,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String comments,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode like,
			@Nullable JsonNode comment,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsListResponseProfilePost(
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_comment_count") Double postCommentCount,
			@JsonProperty("timeline_username") @Nullable String timelineUsername,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@Nullable ProfilePostsCommentsListResponseProfilePostLinks links,
			@Nullable ProfilePostsCommentsListResponseProfilePostPermissions permissions
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
			@Nullable ProfilePostsCommentsCreateResponseComment comment,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseCommentLinks(
			@Nullable String detail,
			@JsonProperty("profile_post") @Nullable String profilePost,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseCommentPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsCreateResponseComment(
			@JsonProperty("comment_id") Double commentId,
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("comment_user_id") Double commentUserId,
			@JsonProperty("comment_username") @Nullable String commentUsername,
			@JsonProperty("comment_username_html") @Nullable String commentUsernameHtml,
			@JsonProperty("comment_create_date") Double commentCreateDate,
			@JsonProperty("comment_body") @Nullable String commentBody,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@Nullable ProfilePostsCommentsCreateResponseCommentLinks links,
			@Nullable ProfilePostsCommentsCreateResponseCommentPermissions permissions
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
			@Nullable ProfilePostsCommentsEditResponseComment comment,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseCommentLinks(
			@Nullable String detail,
			@JsonProperty("profile_post") @Nullable String profilePost,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseCommentPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsEditResponseComment(
			@JsonProperty("comment_id") Double commentId,
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("comment_user_id") Double commentUserId,
			@JsonProperty("comment_username") @Nullable String commentUsername,
			@JsonProperty("comment_username_html") @Nullable String commentUsernameHtml,
			@JsonProperty("comment_create_date") Double commentCreateDate,
			@JsonProperty("comment_body") @Nullable String commentBody,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@Nullable ProfilePostsCommentsEditResponseCommentLinks links,
			@Nullable ProfilePostsCommentsEditResponseCommentPermissions permissions
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfilePostsCommentsGetResponse(
			@Nullable JsonNode comment,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> conversations,
			@JsonProperty("can_start") @Nullable JsonNode canStart,
			@Nullable List<ConversationsListResponseFolders> folders,
			@Nullable ConversationsListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponseFolders(
			@Nullable String id,
			@Nullable String title,
			@Nullable String name
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable JsonNode conversation,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode conversation,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ConversationsStartBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsStartResponse(
			@Nullable JsonNode conversation,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsGetResponse(
			@Nullable JsonNode conversation,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> messages,
			@JsonProperty("messages_total") Double messagesTotal,
			@Nullable ConversationsMessagesListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable JsonNode message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> conversations,
			@Nullable JsonNode recipients,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesGetResponse(
			@Nullable JsonNode message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ConversationsMessagesEditBody(
			/** New content of the message. */
			@JsonProperty("message_body") String messageBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesEditResponse(
			@Nullable JsonNode message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsReadAllResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsMessagesUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsStarResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsUnstarResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsAlertsEnableResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConversationsAlertsDisableResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> notifications,
			@JsonProperty("notifications_total") Double notificationsTotal,
			@Nullable NotificationsListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsListResponseLinks(
			@Nullable String read,
			Double pages,
			Double page,
			@Nullable String next
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record NotificationsGetResponse(
			@JsonProperty("notification_id") Double notificationId,
			@Nullable JsonNode notification,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── TagsApi Types ────────────────────────────────────────

	public static final class TagsApiTypes {

		private TagsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsPopularResponse(
			@Nullable JsonNode tags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode tags,
			@JsonProperty("tags_total") Double tagsTotal,
			@Nullable TagsListResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsListResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable TagsGetResponseTag tag,
			@Nullable List<TagsGetResponseTagged> tagged,
			@JsonProperty("tagged_total") Double taggedTotal,
			@Nullable TagsGetResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTagLinks(
			@Nullable String permalink,
			@Nullable String detail
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTag(
			@JsonProperty("tag_id") Double tagId,
			@JsonProperty("tag_text") @Nullable String tagText,
			@JsonProperty("tag_use_count") Double tagUseCount,
			@Nullable TagsGetResponseTagLinks links
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable TagsGetResponseTaggedFirstPostLinks links,
			@Nullable TagsGetResponseTaggedFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedThreadPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_poster") @Nullable String lastPoster,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<TagsGetResponseTaggedForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTaggedForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<TagsGetResponseTaggedForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable TagsGetResponseTaggedForumLinks links,
			@Nullable TagsGetResponseTaggedForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseTagged(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable TagsGetResponseTaggedFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<TagsGetResponseTaggedThreadPrefixes> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable JsonNode threadTags,
			@Nullable TagsGetResponseTaggedLinks links,
			@Nullable TagsGetResponseTaggedPermissions permissions,
			@Nullable TagsGetResponseTaggedForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsGetResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
		) {}

		public record TagsFindParams(
			/** tag to filter. Tags start with the query will be returned. */
			String tag
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record TagsFindResponse(
			@Nullable List<String> tags,
			@Nullable List<Double> ids,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			Long limit
		) {
			public SearchAllBody() {
				this(null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponse(
			@Nullable List<SearchAllResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@Nullable List<JsonNode> users,
			@Nullable SearchAllResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@JsonProperty("post_is_liked") @Nullable JsonNode postIsLiked,
			@Nullable SearchAllResponseDataFirstPostLinks links,
			@Nullable SearchAllResponseDataFirstPostPermissions permissions,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_poster") @Nullable String lastPoster,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataPermissionsBump(
			@Nullable JsonNode can,
			@JsonProperty("available_count") Double availableCount,
			@Nullable JsonNode error,
			@JsonProperty("next_available_time") @Nullable JsonNode nextAvailableTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@Nullable JsonNode edit,
			@Nullable SearchAllResponseDataPermissionsBump bump
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("parent_node_id") Double parentNodeId,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable SearchAllResponseDataForumLinks links,
			@Nullable SearchAllResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseDataLastPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@JsonProperty("post_is_liked") @Nullable JsonNode postIsLiked,
			@Nullable SearchAllResponseDataLastPostLinks links,
			@Nullable SearchAllResponseDataLastPostPermissions permissions,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") @Nullable String contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_closed") @Nullable JsonNode threadIsClosed,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("thread_is_starred") @Nullable JsonNode threadIsStarred,
			@JsonProperty("first_post") @Nullable SearchAllResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable SearchAllResponseDataLinks links,
			@Nullable SearchAllResponseDataPermissions permissions,
			@JsonProperty("node_title") @Nullable String nodeTitle,
			@Nullable SearchAllResponseDataForum forum,
			@JsonProperty("last_post") @Nullable SearchAllResponseDataLastPost lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchAllResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@JsonProperty("data_limit") Long dataLimit
		) {
			public SearchThreadsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponse(
			@Nullable List<SearchThreadsResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@Nullable SearchThreadsResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable SearchThreadsResponseDataFirstPostLinks links,
			@Nullable SearchThreadsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable SearchThreadsResponseDataForumLinks links,
			@Nullable SearchThreadsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable SearchThreadsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable SearchThreadsResponseDataLinks links,
			@Nullable SearchThreadsResponseDataPermissions permissions,
			@Nullable SearchThreadsResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchThreadsResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@JsonProperty("data_limit") Long dataLimit
		) {
			public SearchPostsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponse(
			@Nullable List<SearchPostsResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@Nullable SearchPostsResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable SearchPostsResponseDataFirstPostLinks links,
			@Nullable SearchPostsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<JsonNode> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable SearchPostsResponseDataForumLinks links,
			@Nullable SearchPostsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable SearchPostsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable SearchPostsResponseDataLinks links,
			@Nullable SearchPostsResponseDataPermissions permissions,
			@Nullable SearchPostsResponseDataForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchPostsResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable List<JsonNode> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record SearchProfilePostsBody(
			/** Search query. Can be skipped if **user_id** is set. */
			String q,
			/** User ID to filter profile posts. */
			@JsonProperty("user_id") Long userId,
			/** Page number of results. */
			Long page,
			/** Number of results in a page. */
			Long limit
		) {
			public SearchProfilePostsBody() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponse(
			@Nullable List<SearchProfilePostsResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@Nullable SearchProfilePostsResponseLinks links,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String timeline,
			@JsonProperty("timeline_user") @Nullable String timelineUser,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String comments,
			@Nullable String report,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode like,
			@Nullable JsonNode comment,
			@Nullable JsonNode report
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("profile_post_id") Double profilePostId,
			@JsonProperty("timeline_user_id") Double timelineUserId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_comment_count") Double postCommentCount,
			@JsonProperty("timeline_username") @Nullable String timelineUsername,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@Nullable SearchProfilePostsResponseDataLinks links,
			@Nullable SearchProfilePostsResponseDataPermissions permissions,
			@JsonProperty("timeline_user") @Nullable JsonNode timelineUser
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchProfilePostsResponseLinks(
			Double pages,
			Double page,
			@Nullable String next
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
			@Nullable List<SearchTaggedResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@JsonProperty("search_tags") @Nullable JsonNode searchTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable SearchTaggedResponseDataFirstPostLinks links,
			@Nullable SearchTaggedResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit,
			@JsonProperty("edit_title") @Nullable JsonNode editTitle,
			@JsonProperty("edit_tags") @Nullable JsonNode editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<SearchTaggedResponseDataForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<SearchTaggedResponseDataForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable SearchTaggedResponseDataForumLinks links,
			@Nullable SearchTaggedResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchTaggedResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable SearchTaggedResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable JsonNode threadTags,
			@Nullable SearchTaggedResponseDataLinks links,
			@Nullable SearchTaggedResponseDataPermissions permissions,
			@Nullable SearchTaggedResponseDataForum forum
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
			@Nullable List<SearchResultsResponseData> data,
			@JsonProperty("data_total") Double dataTotal,
			@JsonProperty("search_tags") @Nullable JsonNode searchTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPostLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String thread,
			@Nullable String poster,
			@Nullable String likes,
			@Nullable String report,
			@Nullable String attachments,
			@JsonProperty("poster_avatar") @Nullable String posterAvatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("poster_username_html") @Nullable String posterUsernameHtml,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable SearchResultsResponseDataFirstPostLinks links,
			@Nullable SearchResultsResponseDataFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost,
			@JsonProperty("last_post") @Nullable String lastPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit,
			@JsonProperty("edit_title") @Nullable JsonNode editTitle,
			@JsonProperty("edit_tags") @Nullable JsonNode editTags
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<SearchResultsResponseDataForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseDataForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<SearchResultsResponseDataForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable SearchResultsResponseDataForumLinks links,
			@Nullable SearchResultsResponseDataForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record SearchResultsResponseData(
			@JsonProperty("content_type") @Nullable String contentType,
			@JsonProperty("content_id") Double contentId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable SearchResultsResponseDataFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable JsonNode threadTags,
			@Nullable SearchResultsResponseDataLinks links,
			@Nullable SearchResultsResponseDataPermissions permissions,
			@Nullable SearchResultsResponseDataForum forum
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchExecuteResponse(
			@Nullable BatchExecuteResponseJobs jobs
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchExecuteResponseJobs(
			@JsonProperty("job_id") @Nullable JsonNode jobId
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
			@Nullable List<ChatboxIndexResponseRooms> rooms,
			@Nullable JsonNode ban,
			@Nullable List<ChatboxIndexResponseIgnore> ignore,
			@Nullable ChatboxIndexResponsePermissions permissions,
			@Nullable List<String> commands,
			@Nullable ChatboxIndexResponseRoomsOnline roomsOnline,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseRooms(
			@JsonProperty("can_report") @Nullable JsonNode canReport,
			@Nullable JsonNode eng,
			@Nullable JsonNode market,
			@JsonProperty("room_id") Double roomId,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnoreRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnoreRendered(
			@Nullable String username,
			@Nullable ChatboxIndexResponseIgnoreRenderedAvatars avatars,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseIgnore(
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("background_date") Double backgroundDate,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_admin") @Nullable JsonNode isAdmin,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("is_moderator") @Nullable JsonNode isModerator,
			@JsonProperty("is_staff") @Nullable JsonNode isStaff,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable ChatboxIndexResponseIgnoreRendered rendered,
			@JsonProperty("short_link") @Nullable JsonNode shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("uniq_banner") @Nullable JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponsePermissions(
			@Nullable JsonNode deleteAnyMessage,
			@Nullable JsonNode editAnyMessage,
			@Nullable JsonNode viewAnyMessage,
			@Nullable JsonNode viewMessages,
			@Nullable JsonNode postMessage,
			@Nullable JsonNode ban
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxIndexResponseRoomsOnline(
			@JsonProperty("chat:0") Double chat_0
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
			@Nullable List<JsonNode> messages,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ChatboxOnlineParams(
			/** Room id. */
			@JsonProperty("room_id") RoomId roomId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponse(
			@Nullable List<ChatboxOnlineResponseUsers> users,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersRendered(
			@Nullable String username,
			@Nullable ChatboxOnlineResponseUsersRenderedAvatars avatars,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsersUniqBanner(
			@JsonProperty("banner_css") @Nullable String bannerCss,
			@JsonProperty("banner_text") @Nullable String bannerText,
			@JsonProperty("banner_icon") @Nullable String bannerIcon,
			@JsonProperty("username_icon") @Nullable String usernameIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxOnlineResponseUsers(
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("background_date") Double backgroundDate,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_admin") @Nullable JsonNode isAdmin,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("is_moderator") @Nullable JsonNode isModerator,
			@JsonProperty("is_staff") @Nullable JsonNode isStaff,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable ChatboxOnlineResponseUsersRendered rendered,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("uniq_banner") @Nullable ChatboxOnlineResponseUsersUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}

		public record ChatboxReportReasonsParams(
			/** Message id. */
			@JsonProperty("message_id") Long messageId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxReportReasonsResponse(
			@Nullable List<String> reasons,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<ChatboxGetLeaderboardResponseLeaderboard> leaderboard,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardRendered(
			@Nullable String username,
			@Nullable ChatboxGetLeaderboardResponseLeaderboardRenderedAvatars avatars,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboardUniqBanner(
			@JsonProperty("banner_css") @Nullable String bannerCss,
			@JsonProperty("banner_text") @Nullable String bannerText,
			@JsonProperty("banner_icon") @Nullable String bannerIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetLeaderboardResponseLeaderboard(
			Double count,
			@JsonProperty("user_id") Double userId,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("background_date") Double backgroundDate,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable ChatboxGetLeaderboardResponseLeaderboardRendered rendered,
			@JsonProperty("short_link") @Nullable JsonNode shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("uniq_banner") @Nullable ChatboxGetLeaderboardResponseLeaderboardUniqBanner uniqBanner,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@Nullable String username
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponse(
			@Nullable List<ChatboxGetIgnoreResponseIgnored> ignored,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnoredRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnoredRendered(
			@Nullable String username,
			@Nullable ChatboxGetIgnoreResponseIgnoredRenderedAvatars avatars,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxGetIgnoreResponseIgnored(
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("background_date") Double backgroundDate,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("custom_title") @Nullable String customTitle,
			@JsonProperty("display_banner_id") Double displayBannerId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("register_date") Double registerDate,
			@Nullable ChatboxGetIgnoreResponseIgnoredRendered rendered,
			@JsonProperty("short_link") @Nullable JsonNode shortLink,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("uniq_banner") @Nullable JsonNode uniqBanner,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_id") Double userId,
			@Nullable String username
		) {}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxPostIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ChatboxDeleteIgnoreResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<FormsListResponseForms> forms,
			Double formsPerPage,
			Double page,
			Double totalForms,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFieldsFieldChoices(
			@Nullable String buy,
			@Nullable String sell
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseFormsFields(
			@JsonProperty("field_id") Double fieldId,
			@Nullable String title,
			@Nullable FormsListResponseFormsFieldsFieldChoices fieldChoices,
			Double required,
			@JsonProperty("max_length") Double maxLength,
			@JsonProperty("default_value") @Nullable String defaultValue
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsListResponseForms(
			@JsonProperty("form_id") Double formId,
			@Nullable String title,
			@Nullable String description,
			@Nullable List<FormsListResponseFormsFields> fields
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
			@Nullable String message,
			@Nullable FormsCreateResponseContent content,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContentLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@Nullable String followers,
			@Nullable String forum,
			@Nullable String posts,
			@JsonProperty("first_poster") @Nullable String firstPoster,
			@JsonProperty("first_poster_avatar") @Nullable String firstPosterAvatar,
			@JsonProperty("first_post") @Nullable String firstPost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContentPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record FormsCreateResponseContent(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("creator_username_html") @Nullable String creatorUsernameHtml,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_closed") @Nullable JsonNode threadIsClosed,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable FormsCreateResponseContentLinks links,
			@Nullable FormsCreateResponseContentPermissions permissions,
			@JsonProperty("node_title") @Nullable String nodeTitle
		) {}

	}

}
