// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market;

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
		public record DiscountModel(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("discount_id") long discountId,
			@JsonProperty("discount_percent") long discountPercent,
			@JsonProperty("discount_user_id") long discountUserId,
			@JsonProperty("max_price") long maxPrice,
			@JsonProperty("min_price") long minPrice,
			@JsonProperty("user_id") long userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModel(
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("activity_visible") boolean activityVisible,
			long age,
			String balance,
			List<JsonNode> balances,
			@JsonProperty("bump_item_period") long bumpItemPeriod,
			@JsonProperty("can_edit") boolean canEdit,
			@JsonProperty("can_follow") boolean canFollow,
			@JsonProperty("can_ignore") boolean canIgnore,
			@JsonProperty("can_post_profile") boolean canPostProfile,
			@JsonProperty("can_view_profile") boolean canViewProfile,
			@JsonProperty("can_view_profile_posts") boolean canViewProfilePosts,
			@JsonProperty("can_warn") boolean canWarn,
			@JsonProperty("contest_count") long contestCount,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			long convertedBalance,
			long convertedDeposit,
			long convertedHold,
			String currency,
			String currencyPhrase,
			@JsonProperty("custom_account_download_format") String customAccountDownloadFormat,
			@JsonProperty("custom_fields") JsonNode customFields,
			@JsonProperty("custom_title") String customTitle,
			long deposit,
			JsonNode dob,
			@JsonProperty("feedback_data") JsonNode feedbackData,
			String hold,
			String homepage,
			@JsonProperty("imap_data") JsonNode imapData,
			@JsonProperty("is_admin") boolean isAdmin,
			@JsonProperty("is_banned") boolean isBanned,
			@JsonProperty("is_followed") boolean isFollowed,
			@JsonProperty("is_ignored") boolean isIgnored,
			@JsonProperty("is_moderator") boolean isModerator,
			@JsonProperty("is_staff") boolean isStaff,
			@JsonProperty("is_super_admin") boolean isSuperAdmin,
			@JsonProperty("joined_date") long joinedDate,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("like2_count") long like2Count,
			@JsonProperty("like_count") long likeCount,
			String location,
			@JsonProperty("market_custom_title") String marketCustomTitle,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			@JsonProperty("message_count") long messageCount,
			@JsonProperty("paid_mail_left") long paidMailLeft,
			@JsonProperty("public_tags") List<JsonNode> publicTags,
			@JsonProperty("register_date") long registerDate,
			JsonNode rendered,
			@JsonProperty("restore_count") long restoreCount,
			@JsonProperty("restore_data") JsonNode restoreData,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("sold_items_count") long soldItemsCount,
			List<JsonNode> tags,
			@JsonProperty("telegram_client") JsonNode telegramClient,
			@JsonProperty("trophy_points") long trophyPoints,
			@JsonProperty("user_allow_ask_discount") boolean userAllowAskDiscount,
			@JsonProperty("user_id") long userId,
			@JsonProperty("user_title") String userTitle,
			String username,
			@JsonProperty("view_url") String viewUrl,
			boolean visible,
			@JsonProperty("warning_points") long warningPoints
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BalanceModel(
			String balance,
			@JsonProperty("balance_id") long balanceId,
			@JsonProperty("custom_title") JsonNode customTitle,
			String fullTitle,
			@JsonProperty("merchant_id") long merchantId,
			String title,
			String type,
			@JsonProperty("user_id") long userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ExtraModel(
			String proxy,
			@JsonProperty("close_item") Boolean closeItem,
			String region,
			String service,
			String system,
			String confirmationCode,
			String cookies,
			@JsonProperty("login_without_cookies") Boolean loginWithoutCookies,
			@JsonProperty("cookie_login") Boolean cookieLogin,
			@JsonProperty("mfa_file") String mfaFile,
			@JsonProperty("dota2_mmr") Long dota2Mmr,
			@JsonProperty("ea_games") Boolean eaGames,
			@JsonProperty("uplay_games") Boolean uplayGames,
			@JsonProperty("the_quarry") Boolean theQuarry,
			Boolean warframe,
			Boolean ark,
			@JsonProperty("ark_ascended") Boolean arkAscended,
			@JsonProperty("genshin_currency") Long genshinCurrency,
			@JsonProperty("honkai_currency") Long honkaiCurrency,
			@JsonProperty("zenless_currency") Long zenlessCurrency,
			String password,
			String telegramClient,
			String telegramJson,
			Boolean checkChannels,
			Boolean checkSpam,
			Boolean checkHypixelBan
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConfirmationCodeModel(
			ItemModel item,
			JsonNode codeData
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemListModel(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModel(
			@JsonProperty("item_id") Long itemId,
			@JsonProperty("item_state") String itemState,
			@JsonProperty("category_id") Long categoryId,
			@JsonProperty("published_date") Long publishedDate,
			String title,
			String description,
			Long price,
			@JsonProperty("update_stat_date") Long updateStatDate,
			@JsonProperty("refreshed_date") Long refreshedDate,
			@JsonProperty("view_count") Long viewCount,
			@JsonProperty("is_sticky") Long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") Long extendedGuarantee,
			Long nsb,
			@JsonProperty("allow_ask_discount") Long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			Long isIgnored,
			Boolean guarantee,
			Boolean canViewLoginData,
			Boolean canUpdateItemStats,
			Boolean canViewEmailLoginData,
			Boolean showGetEmailCodeButton,
			Boolean canOpenItem,
			Boolean canCloseItem,
			Boolean canEditItem,
			Boolean canDeleteItem,
			Boolean canStickItem,
			Boolean canUnstickItem,
			JsonNode bumpSettings,
			Boolean canBumpItem,
			Boolean canBuyItem,
			@JsonProperty("rub_price") Long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			Boolean canValidateAccount,
			Boolean canResellItemAfterPurchase,
			Boolean canViewAccountLink,
			String itemOriginPhrase,
			List<String> tags,
			@JsonProperty("note_text") String noteText,
			@JsonProperty("description_html") String descriptionHtml,
			@JsonProperty("description_html_en") String descriptionHtmlEn,
			JsonNode seller
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModel(
			@JsonProperty("item_id") long itemId,
			@JsonProperty("item_state") String itemState,
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("published_date") long publishedDate,
			String title,
			String description,
			long price,
			@JsonProperty("update_stat_date") long updateStatDate,
			@JsonProperty("refreshed_date") long refreshedDate,
			@JsonProperty("edit_date") long editDate,
			@JsonProperty("pending_deletion_date") long pendingDeletionDate,
			String login,
			@JsonProperty("temp_email") String tempEmail,
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			String information,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("information_en") String informationEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("note_text") String noteText,
			@JsonProperty("content_type") JsonNode contentType,
			@JsonProperty("content_id") JsonNode contentId,
			@JsonProperty("delete_date") long deleteDate,
			@JsonProperty("delete_user_id") long deleteUserId,
			@JsonProperty("delete_username") String deleteUsername,
			@JsonProperty("delete_reason") String deleteReason,
			@JsonProperty("user_allow_ask_discount") long userAllowAskDiscount,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			@JsonProperty("market_custom_title") String marketCustomTitle,
			@JsonProperty("feedback_data") String feedbackData,
			@JsonProperty("buyer_display_icon_group_id") long buyerDisplayIconGroupId,
			@JsonProperty("buyer_uniq_banner") String buyerUniqBanner,
			@JsonProperty("buyer_avatar_date") long buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") long buyerUserGroupId,
			@JsonProperty("is_fave") JsonNode isFave,
			@JsonProperty("in_cart") JsonNode inCart,
			@JsonProperty("cart_price") JsonNode cartPrice,
			boolean canResellItem,
			double priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewItemViews,
			JsonNode loginData,
			boolean canViewEmailLoginData,
			JsonNode copyFormatData,
			boolean showGetEmailCodeButton,
			JsonNode getEmailCodeDisplayLogin,
			JsonNode buyer,
			boolean isPersonalAccount,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			String priceWithSellerFeeLabel,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			String accountLink,
			List<String> imagePreviewLinks,
			boolean canChangePassword,
			boolean canChangeEmailPassword,
			boolean uniqueKeyExists,
			String itemOriginPhrase,
			boolean visitorIsAuthor,
			boolean canAskDiscount,
			JsonNode tags,
			JsonNode customFields,
			List<JsonNode> externalAuth,
			boolean isTrusted,
			boolean isBirthdayToday,
			boolean isIgnored,
			long deposit,
			List<JsonNode> extraPrices,
			boolean canViewAccountLoginAndTempEmail,
			JsonNode bumpSettings,
			boolean canCheckGuarantee,
			boolean canShareItem,
			boolean canCheckAiPrice,
			long aiPrice,
			long aiPriceCheckDate,
			boolean needToRequireVideoToViewLoginData,
			boolean canCheckAutoBuyPrice,
			long autoBuyPrice,
			long autoBuyPriceCheckDate,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			JsonNode seller
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record InvoiceModel(
			@JsonProperty("additional_data") String additionalData,
			long amount,
			String comment,
			@JsonProperty("expires_at") long expiresAt,
			@JsonProperty("invoice_date") long invoiceDate,
			@JsonProperty("invoice_id") long invoiceId,
			@JsonProperty("is_test") boolean isTest,
			@JsonProperty("merchant_id") long merchantId,
			@JsonProperty("paid_date") long paidDate,
			@JsonProperty("payer_user_id") long payerUserId,
			@JsonProperty("payment_id") String paymentId,
			@JsonProperty("resend_attempts") long resendAttempts,
			String status,
			String url,
			@JsonProperty("url_callback") String urlCallback,
			@JsonProperty("url_success") String urlSuccess,
			@JsonProperty("user_id") long userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_SystemInfo(
			@JsonProperty("visitor_id") long visitorId,
			long time,
			@JsonProperty("log_id") long logId
		) {}

	// ─── CategoryApi Types ────────────────────────────────────────

	public static final class CategoryApiTypes {

		private CategoryApiTypes() {
		}

		public record CategoryAllParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public CategoryAllParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryAllResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategorySteamParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<Integer> game,
			@JsonProperty("hours_played") JsonNode hoursPlayed,
			@JsonProperty("hours_played_max") JsonNode hoursPlayedMax,
			JsonNode eg,
			@JsonProperty("vac[]") List<Integer> vac,
			@JsonProperty("vac_skip_game_check") Boolean vacSkipGameCheck,
			String rt,
			@JsonProperty("trade_ban") String tradeBan,
			@JsonProperty("trade_limit") String tradeLimit,
			Integer daybreak,
			String limit,
			String mafile,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			Integer lmin,
			Integer lmax,
			Integer rmin,
			Integer rmax,
			@JsonProperty("wingman_rmin") Integer wingmanRmin,
			@JsonProperty("wingman_rmax") Integer wingmanRmax,
			@JsonProperty("no_vac") Boolean noVac,
			@JsonProperty("mm_ban") String mmBan,
			@JsonProperty("balance_min") Integer balanceMin,
			@JsonProperty("balance_max") Integer balanceMax,
			@JsonProperty("inv_game") Integer invGame,
			@JsonProperty("inv_min") Double invMin,
			@JsonProperty("inv_max") Double invMax,
			@JsonProperty("friends_min") Integer friendsMin,
			@JsonProperty("friends_max") Integer friendsMax,
			Integer gmin,
			Integer gmax,
			@JsonProperty("win_count_min") Integer winCountMin,
			@JsonProperty("win_count_max") Integer winCountMax,
			@JsonProperty("medal_id[]") JsonNode medalId,
			@JsonProperty("medal_operator_or") Boolean medalOperatorOr,
			@JsonProperty("medal_min") Integer medalMin,
			@JsonProperty("medal_max") Integer medalMax,
			@JsonProperty("gift[]") JsonNode gift,
			@JsonProperty("gift_min") Integer giftMin,
			@JsonProperty("gift_max") Integer giftMax,
			@JsonProperty("recently_hours_min") Integer recentlyHoursMin,
			@JsonProperty("recently_hours_max") Integer recentlyHoursMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("cs2_profile_rank_min") Integer cs2ProfileRankMin,
			@JsonProperty("cs2_profile_rank_max") Integer cs2ProfileRankMax,
			@JsonProperty("solommr_min") Integer solommrMin,
			@JsonProperty("solommr_max") Integer solommrMax,
			@JsonProperty("d2_game_count_min") Integer d2GameCountMin,
			@JsonProperty("d2_game_count_max") Integer d2GameCountMax,
			@JsonProperty("d2_win_count_min") Integer d2WinCountMin,
			@JsonProperty("d2_win_count_max") Integer d2WinCountMax,
			@JsonProperty("d2_behavior_min") Integer d2BehaviorMin,
			@JsonProperty("d2_behavior_max") Integer d2BehaviorMax,
			@JsonProperty("faceit_lvl_min") Integer faceitLvlMin,
			@JsonProperty("faceit_lvl_max") Integer faceitLvlMax,
			@JsonProperty("points_min") Integer pointsMin,
			@JsonProperty("points_max") Integer pointsMax,
			@JsonProperty("relevant_gmin") Integer relevantGmin,
			@JsonProperty("relevant_gmax") Integer relevantGmax,
			@JsonProperty("last_trans_date") Integer lastTransDate,
			@JsonProperty("last_trans_date_period") String lastTransDatePeriod,
			@JsonProperty("last_trans_date_later") Integer lastTransDateLater,
			@JsonProperty("last_trans_date_period_later") String lastTransDatePeriodLater,
			@JsonProperty("no_trans") Boolean noTrans,
			Boolean trans,
			@JsonProperty("gifts_purchase_min") Double giftsPurchaseMin,
			@JsonProperty("gifts_purchase_max") Double giftsPurchaseMax,
			@JsonProperty("refunds_purchase_min") Double refundsPurchaseMin,
			@JsonProperty("refunds_purchase_max") Double refundsPurchaseMax,
			@JsonProperty("ingame_purchase_min") Double ingamePurchaseMin,
			@JsonProperty("ingame_purchase_max") Double ingamePurchaseMax,
			@JsonProperty("games_purchase_min") Double gamesPurchaseMin,
			@JsonProperty("games_purchase_max") Double gamesPurchaseMax,
			@JsonProperty("purchase_min") Double purchaseMin,
			@JsonProperty("purchase_max") Double purchaseMax,
			@JsonProperty("has_activated_keys") String hasActivatedKeys,
			@JsonProperty("elo_min") Integer eloMin,
			@JsonProperty("elo_max") Integer eloMax,
			@JsonProperty("cs2_map_rank") JsonNode cs2MapRank,
			@JsonProperty("cs2_map_rmin") Integer cs2MapRmin,
			@JsonProperty("cs2_map_rmax") Integer cs2MapRmax,
			@JsonProperty("has_faceit") String hasFaceit,
			@JsonProperty("faceit_csgo_lvl_min") Integer faceitCsgoLvlMin,
			@JsonProperty("faceit_csgo_lvl_max") Integer faceitCsgoLvlMax,
			@JsonProperty("rust_deaths_min") Integer rustDeathsMin,
			@JsonProperty("rust_deaths_max") Integer rustDeathsMax,
			@JsonProperty("rust_kills_min") Integer rustKillsMin,
			@JsonProperty("rust_kills_max") Integer rustKillsMax,
			@JsonProperty("d2_last_match_date") Integer d2LastMatchDate,
			@JsonProperty("d2_last_match_date_period") String d2LastMatchDatePeriod,
			@JsonProperty("cards_min") Integer cardsMin,
			@JsonProperty("cards_max") Integer cardsMax,
			@JsonProperty("cards_games_min") Integer cardsGamesMin,
			@JsonProperty("cards_games_max") Integer cardsGamesMax,
			@JsonProperty("skip_vac_inv") Boolean skipVacInv
		) {
			public CategorySteamParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryFortniteParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("temp_email") String tempEmail,
			@JsonProperty("item_domain") String itemDomain,
			JsonNode eg,
			Integer smin,
			Integer smax,
			Integer vbmin,
			Integer vbmax,
			@JsonProperty("skin[]") JsonNode skin,
			@JsonProperty("pickaxe[]") JsonNode pickaxe,
			@JsonProperty("glider[]") JsonNode glider,
			@JsonProperty("dance[]") JsonNode dance,
			@JsonProperty("change_email") String changeEmail,
			@JsonProperty("platform[]") JsonNode platform,
			@JsonProperty("skins_shop_min") Integer skinsShopMin,
			@JsonProperty("skins_shop_max") Integer skinsShopMax,
			@JsonProperty("pickaxes_shop_min") Integer pickaxesShopMin,
			@JsonProperty("pickaxes_shop_max") Integer pickaxesShopMax,
			@JsonProperty("dances_shop_min") Integer dancesShopMin,
			@JsonProperty("dances_shop_max") Integer dancesShopMax,
			@JsonProperty("gliders_shop_min") Integer glidersShopMin,
			@JsonProperty("gliders_shop_max") Integer glidersShopMax,
			@JsonProperty("skins_shop_vbmin") Integer skinsShopVbmin,
			@JsonProperty("skins_shop_vbmax") Integer skinsShopVbmax,
			@JsonProperty("pickaxes_shop_vbmin") Integer pickaxesShopVbmin,
			@JsonProperty("pickaxes_shop_vbmax") Integer pickaxesShopVbmax,
			@JsonProperty("dances_shop_vbmin") Integer dancesShopVbmin,
			@JsonProperty("dances_shop_vbmax") Integer dancesShopVbmax,
			@JsonProperty("gliders_shop_vbmin") Integer glidersShopVbmin,
			@JsonProperty("gliders_shop_vbmax") Integer glidersShopVbmax,
			String bp,
			Integer lmin,
			Integer lmax,
			@JsonProperty("bp_lmin") Integer bpLmin,
			@JsonProperty("bp_lmax") Integer bpLmax,
			@JsonProperty("last_trans_date") Integer lastTransDate,
			@JsonProperty("last_trans_date_period") String lastTransDatePeriod,
			@JsonProperty("no_trans") Boolean noTrans,
			@JsonProperty("xbox_linkable") String xboxLinkable,
			@JsonProperty("psn_linkable") String psnLinkable,
			Integer daybreak,
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("refund_credits_min") Integer refundCreditsMin,
			@JsonProperty("refund_credits_max") Integer refundCreditsMax,
			@JsonProperty("pickaxe_min") Integer pickaxeMin,
			@JsonProperty("pickaxe_max") Integer pickaxeMax,
			Integer dmin,
			Integer dmax,
			Integer gmin,
			Integer gmax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryFortniteParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryMihoyoParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("item_domain") String itemDomain,
			String email,
			String ea,
			JsonNode region,
			@JsonProperty("not_region") JsonNode notRegion,
			@JsonProperty("genshin_character[]") JsonNode genshinCharacter,
			@JsonProperty("genshin_character_constellations") JsonNode genshinCharacterConstellations,
			@JsonProperty("genshin_character_constellations_max") JsonNode genshinCharacterConstellationsMax,
			@JsonProperty("genshin_weapon[]") JsonNode genshinWeapon,
			@JsonProperty("genshin_char_min") Integer genshinCharMin,
			@JsonProperty("genshin_char_max") Integer genshinCharMax,
			@JsonProperty("genshin_legendary_min") Integer genshinLegendaryMin,
			@JsonProperty("genshin_legendary_max") Integer genshinLegendaryMax,
			@JsonProperty("genshin_level_min") Integer genshinLevelMin,
			@JsonProperty("genshin_level_max") Integer genshinLevelMax,
			@JsonProperty("genshin_legendary_weapon_min") Integer genshinLegendaryWeaponMin,
			@JsonProperty("genshin_legendary_weapon_max") Integer genshinLegendaryWeaponMax,
			@JsonProperty("constellations_min") Integer constellationsMin,
			@JsonProperty("constellations_max") Integer constellationsMax,
			@JsonProperty("genshin_achievement_min") Integer genshinAchievementMin,
			@JsonProperty("genshin_achievement_max") Integer genshinAchievementMax,
			@JsonProperty("genshin_currency_min") Integer genshinCurrencyMin,
			@JsonProperty("genshin_currency_max") Integer genshinCurrencyMax,
			@JsonProperty("honkai_character[]") JsonNode honkaiCharacter,
			@JsonProperty("honkai_character_eidolons") JsonNode honkaiCharacterEidolons,
			@JsonProperty("honkai_character_eidolons_max") JsonNode honkaiCharacterEidolonsMax,
			@JsonProperty("honkai_weapon[]") JsonNode honkaiWeapon,
			@JsonProperty("honkai_char_min") Integer honkaiCharMin,
			@JsonProperty("honkai_char_max") Integer honkaiCharMax,
			@JsonProperty("honkai_legendary_min") Integer honkaiLegendaryMin,
			@JsonProperty("honkai_legendary_max") Integer honkaiLegendaryMax,
			@JsonProperty("honkai_level_min") Integer honkaiLevelMin,
			@JsonProperty("honkai_level_max") Integer honkaiLevelMax,
			@JsonProperty("honkai_legendary_weapon_min") Integer honkaiLegendaryWeaponMin,
			@JsonProperty("honkai_legendary_weapon_max") Integer honkaiLegendaryWeaponMax,
			@JsonProperty("eidolons_min") Integer eidolonsMin,
			@JsonProperty("eidolons_max") Integer eidolonsMax,
			@JsonProperty("honkai_achievement_min") Integer honkaiAchievementMin,
			@JsonProperty("honkai_achievement_max") Integer honkaiAchievementMax,
			@JsonProperty("honkai_currency_min") Integer honkaiCurrencyMin,
			@JsonProperty("honkai_currency_max") Integer honkaiCurrencyMax,
			@JsonProperty("zenless_character[]") JsonNode zenlessCharacter,
			@JsonProperty("zenless_character_cinemas") JsonNode zenlessCharacterCinemas,
			@JsonProperty("zenless_character_cinemas_max") JsonNode zenlessCharacterCinemasMax,
			@JsonProperty("zenless_weapon[]") JsonNode zenlessWeapon,
			@JsonProperty("zenless_legendary_min") Integer zenlessLegendaryMin,
			@JsonProperty("zenless_legendary_max") Integer zenlessLegendaryMax,
			@JsonProperty("cinemas_min") Integer cinemasMin,
			@JsonProperty("cinemas_max") Integer cinemasMax,
			@JsonProperty("zenless_legendary_weapon_min") Integer zenlessLegendaryWeaponMin,
			@JsonProperty("zenless_legendary_weapon_max") Integer zenlessLegendaryWeaponMax,
			@JsonProperty("zenless_char_min") Integer zenlessCharMin,
			@JsonProperty("zenless_char_max") Integer zenlessCharMax,
			@JsonProperty("zenless_level_min") Integer zenlessLevelMin,
			@JsonProperty("zenless_level_max") Integer zenlessLevelMax,
			@JsonProperty("zenless_achievement_min") Integer zenlessAchievementMin,
			@JsonProperty("zenless_achievement_max") Integer zenlessAchievementMax,
			@JsonProperty("zenless_currency_min") Integer zenlessCurrencyMin,
			@JsonProperty("zenless_currency_max") Integer zenlessCurrencyMax,
			Integer daybreak
		) {
			public CategoryMihoyoParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryRiotParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Integer rmin,
			Integer rmax,
			@JsonProperty("last_rmin") Integer lastRmin,
			@JsonProperty("last_rmax") Integer lastRmax,
			@JsonProperty("previous_rmin") Integer previousRmin,
			@JsonProperty("previous_rmax") Integer previousRmax,
			@JsonProperty("weaponSkin[]") List<String> weaponSkin,
			@JsonProperty("buddy[]") List<String> buddy,
			@JsonProperty("agent[]") List<String> agent,
			@JsonProperty("champion[]") List<String> champion,
			@JsonProperty("skin[]") List<String> skin,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Integer daybreak,
			@JsonProperty("valorant_level_min") Integer valorantLevelMin,
			@JsonProperty("valorant_level_max") Integer valorantLevelMax,
			@JsonProperty("lol_level_min") Integer lolLevelMin,
			@JsonProperty("lol_level_max") Integer lolLevelMax,
			@JsonProperty("inv_min") Integer invMin,
			@JsonProperty("inv_max") Integer invMax,
			@JsonProperty("vp_min") Integer vpMin,
			@JsonProperty("vp_max") Integer vpMax,
			@JsonProperty("valorant_smin") Integer valorantSmin,
			@JsonProperty("valorant_smax") Integer valorantSmax,
			@JsonProperty("valorant_rank_type[]") JsonNode valorantRankType,
			Integer amin,
			Integer amax,
			@JsonProperty("valorant_region[]") List<String> valorantRegion,
			@JsonProperty("valorant_not_region[]") List<String> valorantNotRegion,
			@JsonProperty("lol_region[]") List<String> lolRegion,
			@JsonProperty("lol_not_region[]") List<String> lolNotRegion,
			Boolean knife,
			@JsonProperty("lol_smin") Integer lolSmin,
			@JsonProperty("lol_smax") Integer lolSmax,
			@JsonProperty("champion_min") Integer championMin,
			@JsonProperty("champion_max") Integer championMax,
			@JsonProperty("win_rate_min") Integer winRateMin,
			@JsonProperty("win_rate_max") Integer winRateMax,
			@JsonProperty("blue_min") Integer blueMin,
			@JsonProperty("blue_max") Integer blueMax,
			@JsonProperty("orange_min") Integer orangeMin,
			@JsonProperty("orange_max") Integer orangeMax,
			@JsonProperty("mythic_min") Integer mythicMin,
			@JsonProperty("mythic_max") Integer mythicMax,
			@JsonProperty("riot_min") Integer riotMin,
			@JsonProperty("riot_max") Integer riotMax,
			String email,
			String tel,
			@JsonProperty("valorant_knife_min") Integer valorantKnifeMin,
			@JsonProperty("valorant_knife_max") Integer valorantKnifeMax,
			@JsonProperty("rp_min") Integer rpMin,
			@JsonProperty("rp_max") Integer rpMax,
			@JsonProperty("fa_min") Integer faMin,
			@JsonProperty("fa_max") Integer faMax,
			@JsonProperty("lol_rank[]") JsonNode lolRank
		) {
			public CategoryRiotParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryTelegramParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			String spam,
			String password,
			String premium,
			@JsonProperty("premium_expiration") Integer premiumExpiration,
			@JsonProperty("premium_expiration_period") String premiumExpirationPeriod,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Integer daybreak,
			@JsonProperty("min_channels") Integer minChannels,
			@JsonProperty("max_channels") Integer maxChannels,
			@JsonProperty("min_chats") Integer minChats,
			@JsonProperty("max_chats") Integer maxChats,
			@JsonProperty("min_conversations") Integer minConversations,
			@JsonProperty("max_conversations") Integer maxConversations,
			@JsonProperty("min_admin") Integer minAdmin,
			@JsonProperty("max_admin") Integer maxAdmin,
			@JsonProperty("min_admin_sub") Integer minAdminSub,
			@JsonProperty("max_admin_sub") Integer maxAdminSub,
			@JsonProperty("dig_min") Integer digMin,
			@JsonProperty("dig_max") Integer digMax,
			@JsonProperty("min_contacts") Integer minContacts,
			@JsonProperty("max_contacts") Integer maxContacts,
			@JsonProperty("min_stars") Integer minStars,
			@JsonProperty("max_stars") Integer maxStars,
			Integer birthday,
			@JsonProperty("birthday_period") String birthdayPeriod,
			@JsonProperty("birthday_after") Integer birthdayAfter,
			@JsonProperty("birthday_after_period") String birthdayAfterPeriod,
			@JsonProperty("min_id") Integer minId,
			@JsonProperty("max_id") Integer maxId,
			@JsonProperty("allow_geo_spamblock") Boolean allowGeoSpamblock,
			@JsonProperty("min_gifts") Integer minGifts,
			@JsonProperty("max_gifts") Integer maxGifts,
			@JsonProperty("min_nft_gifts") Integer minNftGifts,
			@JsonProperty("max_nft_gifts") Integer maxNftGifts,
			@JsonProperty("min_gifts_stars") Integer minGiftsStars,
			@JsonProperty("max_gifts_stars") Integer maxGiftsStars,
			@JsonProperty("min_gifts_convert_stars") Integer minGiftsConvertStars,
			@JsonProperty("max_gifts_convert_stars") Integer maxGiftsConvertStars,
			@JsonProperty("dc_id[]") List<Integer> dcId,
			@JsonProperty("not_dc_id[]") List<Integer> notDcId,
			String email,
			@JsonProperty("min_bots") Integer minBots,
			@JsonProperty("max_bots") Integer maxBots,
			@JsonProperty("min_bot_active_users") Integer minBotActiveUsers,
			@JsonProperty("max_bot_active_users") Integer maxBotActiveUsers
		) {
			public CategoryTelegramParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategorySupercellParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Integer daybreak,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			JsonNode eg,
			String tel,
			@JsonProperty("brawl_level_min") Integer brawlLevelMin,
			@JsonProperty("brawl_level_max") Integer brawlLevelMax,
			@JsonProperty("brawl_cup_min") Integer brawlCupMin,
			@JsonProperty("brawl_cup_max") Integer brawlCupMax,
			@JsonProperty("brawl_wins_min") Integer brawlWinsMin,
			@JsonProperty("brawl_wins_max") Integer brawlWinsMax,
			@JsonProperty("brawl_pass") String brawlPass,
			@JsonProperty("brawler[]") JsonNode brawler,
			@JsonProperty("brawlers_min") Integer brawlersMin,
			@JsonProperty("brawlers_max") Integer brawlersMax,
			@JsonProperty("legendary_brawlers_min") Integer legendaryBrawlersMin,
			@JsonProperty("legendary_brawlers_max") Integer legendaryBrawlersMax,
			@JsonProperty("royale_level_min") Integer royaleLevelMin,
			@JsonProperty("royale_level_max") Integer royaleLevelMax,
			@JsonProperty("royale_cup_min") Integer royaleCupMin,
			@JsonProperty("royale_cup_max") Integer royaleCupMax,
			@JsonProperty("royale_wins_min") Integer royaleWinsMin,
			@JsonProperty("royale_wins_max") Integer royaleWinsMax,
			@JsonProperty("king_level_min") Integer kingLevelMin,
			@JsonProperty("king_level_max") Integer kingLevelMax,
			@JsonProperty("royale_pass") String royalePass,
			@JsonProperty("clash_level_min") Integer clashLevelMin,
			@JsonProperty("clash_level_max") Integer clashLevelMax,
			@JsonProperty("clash_cup_min") Integer clashCupMin,
			@JsonProperty("clash_cup_max") Integer clashCupMax,
			@JsonProperty("clash_wins_min") Integer clashWinsMin,
			@JsonProperty("clash_wins_max") Integer clashWinsMax,
			@JsonProperty("clash_pass") String clashPass,
			@JsonProperty("total_heroes_level_min") Integer totalHeroesLevelMin,
			@JsonProperty("total_heroes_level_max") Integer totalHeroesLevelMax,
			@JsonProperty("total_troops_level_min") Integer totalTroopsLevelMin,
			@JsonProperty("total_troops_level_max") Integer totalTroopsLevelMax,
			@JsonProperty("total_spells_level_min") Integer totalSpellsLevelMin,
			@JsonProperty("total_spells_level_max") Integer totalSpellsLevelMax,
			@JsonProperty("total_builder_heroes_level_min") Integer totalBuilderHeroesLevelMin,
			@JsonProperty("total_builder_heroes_level_max") Integer totalBuilderHeroesLevelMax,
			@JsonProperty("total_builder_troops_level_min") Integer totalBuilderTroopsLevelMin,
			@JsonProperty("total_builder_troops_level_max") Integer totalBuilderTroopsLevelMax,
			@JsonProperty("town_hall_level_min") Integer townHallLevelMin,
			@JsonProperty("town_hall_level_max") Integer townHallLevelMax,
			@JsonProperty("builder_hall_level_min") Integer builderHallLevelMin,
			@JsonProperty("builder_hall_level_max") Integer builderHallLevelMax,
			@JsonProperty("builder_hall_cup_min") Integer builderHallCupMin,
			@JsonProperty("builder_hall_cup_max") Integer builderHallCupMax,
			@JsonProperty("creation_year_min") Integer creationYearMin,
			@JsonProperty("creation_year_max") Integer creationYearMax
		) {
			public CategorySupercellParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryEaParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Integer gmin,
			Integer gmax,
			@JsonProperty("al_rank_min") Integer alRankMin,
			@JsonProperty("al_rank_max") Integer alRankMax,
			@JsonProperty("al_level_min") Integer alLevelMin,
			@JsonProperty("al_level_max") Integer alLevelMax,
			@JsonProperty("has_ban") String hasBan,
			@JsonProperty("xbox_connected") String xboxConnected,
			@JsonProperty("steam_connected") String steamConnected,
			@JsonProperty("psn_connected") String psnConnected,
			String subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			@JsonProperty("hours_played") JsonNode hoursPlayed,
			@JsonProperty("hours_played_max") JsonNode hoursPlayedMax,
			String transactions
		) {
			public CategoryEaParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryWotParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String tel,
			Integer daybreak,
			@JsonProperty("battles_min") Integer battlesMin,
			@JsonProperty("battles_max") Integer battlesMax,
			@JsonProperty("gold_min") Integer goldMin,
			@JsonProperty("gold_max") Integer goldMax,
			@JsonProperty("silver_min") Integer silverMin,
			@JsonProperty("silver_max") Integer silverMax,
			@JsonProperty("top_min") Integer topMin,
			@JsonProperty("top_max") Integer topMax,
			@JsonProperty("prem_min") Integer premMin,
			@JsonProperty("prem_max") Integer premMax,
			@JsonProperty("top_prem_min") Integer topPremMin,
			@JsonProperty("top_prem_max") Integer topPremMax,
			@JsonProperty("win_pmin") Integer winPmin,
			@JsonProperty("win_pmax") Integer winPmax,
			@JsonProperty("tank[]") List<Integer> tank,
			@JsonProperty("region[]") JsonNode region,
			@JsonProperty("not_region[]") JsonNode notRegion,
			String premium,
			@JsonProperty("premium_expiration") Integer premiumExpiration,
			@JsonProperty("premium_expiration_period") String premiumExpirationPeriod,
			String clan,
			@JsonProperty("clan_role[]") JsonNode clanRole,
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			@JsonProperty("clan_gold_min") Integer clanGoldMin,
			@JsonProperty("clan_gold_max") Integer clanGoldMax,
			@JsonProperty("clan_credits_min") Integer clanCreditsMin,
			@JsonProperty("clan_credits_max") Integer clanCreditsMax,
			@JsonProperty("clan_crystal_min") Integer clanCrystalMin,
			@JsonProperty("clan_crystal_max") Integer clanCrystalMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryWotParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryWotBlitzParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String tel,
			Integer daybreak,
			@JsonProperty("battles_min") Integer battlesMin,
			@JsonProperty("battles_max") Integer battlesMax,
			@JsonProperty("gold_min") Integer goldMin,
			@JsonProperty("gold_max") Integer goldMax,
			@JsonProperty("silver_min") Integer silverMin,
			@JsonProperty("silver_max") Integer silverMax,
			@JsonProperty("top_min") Integer topMin,
			@JsonProperty("top_max") Integer topMax,
			@JsonProperty("prem_min") Integer premMin,
			@JsonProperty("prem_max") Integer premMax,
			@JsonProperty("top_prem_min") Integer topPremMin,
			@JsonProperty("top_prem_max") Integer topPremMax,
			@JsonProperty("win_pmin") Integer winPmin,
			@JsonProperty("win_pmax") Integer winPmax,
			@JsonProperty("tank[]") List<Integer> tank,
			@JsonProperty("region[]") JsonNode region,
			@JsonProperty("not_region[]") JsonNode notRegion,
			String premium,
			@JsonProperty("premium_expiration") Integer premiumExpiration,
			@JsonProperty("premium_expiration_period") String premiumExpirationPeriod,
			String clan,
			@JsonProperty("clan_role[]") JsonNode clanRole,
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			@JsonProperty("clan_gold_min") Integer clanGoldMin,
			@JsonProperty("clan_gold_max") Integer clanGoldMax,
			@JsonProperty("clan_credits_min") Integer clanCreditsMin,
			@JsonProperty("clan_credits_max") Integer clanCreditsMax,
			@JsonProperty("clan_crystal_min") Integer clanCrystalMin,
			@JsonProperty("clan_crystal_max") Integer clanCrystalMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryWotBlitzParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryGiftsParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			String subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod
		) {
			public CategoryGiftsParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryEpicGamesParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			JsonNode eg,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("change_email") String changeEmail,
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			@JsonProperty("balance_min") Double balanceMin,
			@JsonProperty("balance_max") Double balanceMax,
			@JsonProperty("rewards_balance_min") Double rewardsBalanceMin,
			@JsonProperty("rewards_balance_max") Double rewardsBalanceMax,
			Integer gmin,
			Integer gmax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Integer daybreak,
			@JsonProperty("hours_played") JsonNode hoursPlayed,
			@JsonProperty("hours_played_max") JsonNode hoursPlayedMax
		) {
			public CategoryEpicGamesParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryEscapeFromTarkovParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String region,
			@JsonProperty("version[]") JsonNode version,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("level_min") Integer levelMin,
			@JsonProperty("level_max") Integer levelMax,
			String pve,
			String side
		) {
			public CategoryEscapeFromTarkovParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategorySocialClubParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Integer daybreak,
			@JsonProperty("level_min") Integer levelMin,
			@JsonProperty("level_max") Integer levelMax,
			@JsonProperty("cash_min") Integer cashMin,
			@JsonProperty("cash_max") Integer cashMax,
			@JsonProperty("bank_cash_min") Integer bankCashMin,
			@JsonProperty("bank_cash_max") Integer bankCashMax,
			@JsonProperty("game[]") List<String> game
		) {
			public CategorySocialClubParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryUplayParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Integer daybreak,
			Integer gmin,
			Integer gmax,
			String subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			@JsonProperty("r6_level_min") Integer r6LevelMin,
			@JsonProperty("r6_level_max") Integer r6LevelMax,
			@JsonProperty("r6_rank_min") Integer r6RankMin,
			@JsonProperty("r6_rank_max") Integer r6RankMax,
			@JsonProperty("r6_operators_min") Integer r6OperatorsMin,
			@JsonProperty("r6_operators_max") Integer r6OperatorsMax,
			@JsonProperty("r6_ban") String r6Ban,
			@JsonProperty("r6_smin") Integer r6Smin,
			@JsonProperty("r6_smax") Integer r6Smax,
			@JsonProperty("r6_skin[]") List<String> r6Skin,
			@JsonProperty("r6_operator[]") List<String> r6Operator,
			@JsonProperty("xbox_connected") String xboxConnected,
			@JsonProperty("psn_connected") String psnConnected,
			@JsonProperty("steam_connected") String steamConnected,
			@JsonProperty("balance_min") Double balanceMin,
			@JsonProperty("balance_max") Double balanceMax,
			String transactions,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod
		) {
			public CategoryUplayParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryDiscordParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String tel,
			String nitro,
			@JsonProperty("nitro_type[]") JsonNode nitroType,
			@JsonProperty("nitro_length") Integer nitroLength,
			@JsonProperty("nitro_period") String nitroPeriod,
			@JsonProperty("boosts_min") Integer boostsMin,
			@JsonProperty("boosts_max") Integer boostsMax,
			String billing,
			String gifts,
			String transactions,
			@JsonProperty("badge[]") JsonNode badge,
			@JsonProperty("condition[]") JsonNode condition,
			@JsonProperty("chat_min") Integer chatMin,
			@JsonProperty("chat_max") Integer chatMax,
			@JsonProperty("min_admin_members") Integer minAdminMembers,
			@JsonProperty("max_admin_members") Integer maxAdminMembers,
			@JsonProperty("min_admin") Integer minAdmin,
			@JsonProperty("max_admin") Integer maxAdmin,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("language[]") List<String> language,
			@JsonProperty("not_language[]") List<String> notLanguage,
			String clans,
			@JsonProperty("min_admin_clans") Integer minAdminClans,
			@JsonProperty("max_admin_clans") Integer maxAdminClans,
			@JsonProperty("min_owner_clans") Integer minOwnerClans,
			@JsonProperty("max_owner_clans") Integer maxOwnerClans,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("min_servers") Integer minServers,
			@JsonProperty("max_servers") Integer maxServers,
			@JsonProperty("2fa") String _2fa,
			@JsonProperty("min_full_credits") Integer minFullCredits,
			@JsonProperty("max_full_credits") Integer maxFullCredits,
			@JsonProperty("min_basic_credits") Integer minBasicCredits,
			@JsonProperty("max_basic_credits") Integer maxBasicCredits,
			@JsonProperty("min_orbs") Integer minOrbs,
			@JsonProperty("max_orbs") Integer maxOrbs
		) {
			public CategoryDiscordParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryTikTokParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String tel,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("followers_min") Integer followersMin,
			@JsonProperty("followers_max") Integer followersMax,
			@JsonProperty("post_min") Integer postMin,
			@JsonProperty("post_max") Integer postMax,
			@JsonProperty("like_min") Integer likeMin,
			@JsonProperty("like_max") Integer likeMax,
			@JsonProperty("coins_min") Integer coinsMin,
			@JsonProperty("coins_max") Integer coinsMax,
			@JsonProperty("cookie_login") String cookieLogin,
			String verified,
			String email
		) {
			public CategoryTikTokParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryInstagramParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			String tel,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			String cookies,
			@JsonProperty("login_without_cookies") String loginWithoutCookies,
			@JsonProperty("followers_min") Integer followersMin,
			@JsonProperty("followers_max") Integer followersMax,
			@JsonProperty("post_min") Integer postMin,
			@JsonProperty("post_max") Integer postMax,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod
		) {
			public CategoryInstagramParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryBattleNetParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			JsonNode eg,
			@JsonProperty("game[]") List<Integer> game,
			Integer daybreak,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			String tel,
			@JsonProperty("edit_btag") String editBtag,
			@JsonProperty("changeable_fn") String changeableFn,
			@JsonProperty("real_id") String realId,
			@JsonProperty("parent_control") String parentControl,
			@JsonProperty("no_bans") String noBans,
			@JsonProperty("balance_min") Integer balanceMin,
			@JsonProperty("balance_max") Integer balanceMax
		) {
			public CategoryBattleNetParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryChatGPTParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("subscription[]") JsonNode subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			String autorenewal,
			String tel,
			String transactions,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("openai_tier[]") JsonNode openaiTier,
			@JsonProperty("openai_balance_min") Integer openaiBalanceMin,
			@JsonProperty("openai_balance_max") Integer openaiBalanceMax
		) {
			public CategoryChatGPTParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryVpnParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("service[]") JsonNode service,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			String autorenewal
		) {
			public CategoryVpnParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryRobloxParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			String email,
			@JsonProperty("robux_min") Integer robuxMin,
			@JsonProperty("robux_max") Integer robuxMax,
			@JsonProperty("friends_min") Integer friendsMin,
			@JsonProperty("friends_max") Integer friendsMax,
			@JsonProperty("followers_min") Integer followersMin,
			@JsonProperty("followers_max") Integer followersMax,
			List<String> country,
			@JsonProperty("not_country") List<String> notCountry,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			String subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			String autorenewal,
			@JsonProperty("xbox_connected") String xboxConnected,
			@JsonProperty("psn_connected") String psnConnected,
			String verified,
			@JsonProperty("age_verified") String ageVerified,
			@JsonProperty("incoming_robux_total_min") Integer incomingRobuxTotalMin,
			@JsonProperty("incoming_robux_total_max") Integer incomingRobuxTotalMax,
			@JsonProperty("limited_price_min") Integer limitedPriceMin,
			@JsonProperty("limited_price_max") Integer limitedPriceMax,
			@JsonProperty("gamepass_min") Integer gamepassMin,
			@JsonProperty("gamepass_max") Integer gamepassMax,
			@JsonProperty("game_donations") String gameDonations,
			@JsonProperty("inv_min") Integer invMin,
			@JsonProperty("inv_max") Integer invMax,
			@JsonProperty("ugc_limited_price_min") Integer ugcLimitedPriceMin,
			@JsonProperty("ugc_limited_price_max") Integer ugcLimitedPriceMax,
			@JsonProperty("credit_balance_min") Integer creditBalanceMin,
			@JsonProperty("credit_balance_max") Integer creditBalanceMax,
			@JsonProperty("offsale_min") Integer offsaleMin,
			@JsonProperty("offsale_max") Integer offsaleMax,
			String voice,
			@JsonProperty("age_group[]") List<String> ageGroup,
			@JsonProperty("not_age_group[]") List<String> notAgeGroup
		) {
			public CategoryRobloxParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryWarfaceParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("rank_min") Integer rankMin,
			@JsonProperty("rank_max") Integer rankMax,
			@JsonProperty("bonus_rank_min") Integer bonusRankMin,
			@JsonProperty("bonus_rank_max") Integer bonusRankMax,
			String tel,
			Integer daybreak,
			@JsonProperty("kredits_min") Integer kreditsMin,
			@JsonProperty("kredits_max") Integer kreditsMax,
			@JsonProperty("total_kredits_min") Integer totalKreditsMin,
			@JsonProperty("total_kredits_max") Integer totalKreditsMax
		) {
			public CategoryWarfaceParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryMinecraftParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			String subscription,
			@JsonProperty("subscription_length") Integer subscriptionLength,
			@JsonProperty("subscription_period") String subscriptionPeriod,
			String autorenewal,
			String java,
			String bedrock,
			String dungeons,
			String legends,
			@JsonProperty("change_nickname") String changeNickname,
			@JsonProperty("capes[]") List<String> capes,
			@JsonProperty("capes_min") Integer capesMin,
			@JsonProperty("capes_max") Integer capesMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("hypixel_ban") String hypixelBan,
			@JsonProperty("hypixel_skyblock_api_enabled") String hypixelSkyblockApiEnabled,
			@JsonProperty("rank_hypixel[]") JsonNode rankHypixel,
			@JsonProperty("level_hypixel_min") Integer levelHypixelMin,
			@JsonProperty("level_hypixel_max") Integer levelHypixelMax,
			@JsonProperty("achievement_hypixel_min") Integer achievementHypixelMin,
			@JsonProperty("achievement_hypixel_max") Integer achievementHypixelMax,
			@JsonProperty("level_hypixel_skyblock_min") Integer levelHypixelSkyblockMin,
			@JsonProperty("level_hypixel_skyblock_max") Integer levelHypixelSkyblockMax,
			@JsonProperty("net_worth_hypixel_skyblock_min") Integer netWorthHypixelSkyblockMin,
			@JsonProperty("net_worth_hypixel_skyblock_max") Integer netWorthHypixelSkyblockMax,
			Integer reg,
			@JsonProperty("reg_period") String regPeriod,
			@JsonProperty("last_login_hypixel") Integer lastLoginHypixel,
			@JsonProperty("last_login_hypixel_period") String lastLoginHypixelPeriod,
			@JsonProperty("can_change_details") String canChangeDetails,
			@JsonProperty("nickname_length_min") Integer nicknameLengthMin,
			@JsonProperty("nickname_length_max") Integer nicknameLengthMax,
			@JsonProperty("hypixel_ban_parsed") String hypixelBanParsed,
			@JsonProperty("minecoins_min") Integer minecoinsMin,
			@JsonProperty("minecoins_max") Integer minecoinsMax
		) {
			public CategoryMinecraftParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryHytaleParams(
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("edition[]") JsonNode edition,
			@JsonProperty("profiles_min") Integer profilesMin,
			@JsonProperty("profiles_max") Integer profilesMax
		) {
			public CategoryHytaleParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponse(
			List<JsonNode> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			boolean wasCached,
			long cacheTTL,
			long lastModified,
			long serverTime,
			String searchUrl,
			List<JsonNode> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CategoryListParams(
			@JsonProperty("top_queries") Boolean topQueries
		) {
			public CategoryListParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryListResponse(
			JsonNode category,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponse(
			JsonNode category,
			List<JsonNode> params,
			@JsonProperty("base_params") JsonNode baseParams,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGamesResponse(
			List<JsonNode> games,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ListApi Types ────────────────────────────────────────

	public static final class ListApiTypes {

		private ListApiTypes() {
		}

		public record ListUserParams(
			@JsonProperty("user_id") Integer userId,
			@JsonProperty("category_id") JsonNode categoryId,
			Integer page,
			String show,
			@JsonProperty("delete_reason") String deleteReason,
			String title,
			Integer pmin,
			Integer pmax,
			String login,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") String orderBy,
			Boolean sb,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Boolean nsb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			String username,
			@JsonProperty("published_startDate") String publishedStartDate,
			@JsonProperty("published_endDate") String publishedEndDate,
			@JsonProperty("filter_by_published_date") Boolean filterByPublishedDate,
			@JsonProperty("paid_startDate") String paidStartDate,
			@JsonProperty("paid_endDate") String paidEndDate,
			@JsonProperty("filter_by_buyer_operation_date") Boolean filterByBuyerOperationDate,
			@JsonProperty("delete_startDate") String deleteStartDate,
			@JsonProperty("delete_endDate") String deleteEndDate,
			@JsonProperty("filter_by_delete_date") Boolean filterByDeleteDate
		) {
			public ListUserParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListUserResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ListOrdersParams(
			@JsonProperty("user_id") Integer userId,
			@JsonProperty("category_id") JsonNode categoryId,
			Integer page,
			String show,
			String title,
			Integer pmin,
			Integer pmax,
			String login,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") String orderBy,
			Boolean sb,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Boolean nsb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe
		) {
			public ListOrdersParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListOrdersResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ListStatesParams(
			@JsonProperty("user_id") JsonNode userId
		) {
			public ListStatesParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponse(
			JsonNode userItemStates,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ListDownloadParams(
			String format,
			@JsonProperty("custom_format") String customFormat,
			@JsonProperty("category_id") JsonNode categoryId,
			Integer page,
			String show,
			@JsonProperty("delete_reason") String deleteReason,
			String title,
			Integer pmin,
			Integer pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") String orderBy,
			Boolean sb,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Boolean nsb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			String username,
			@JsonProperty("published_startDate") String publishedStartDate,
			@JsonProperty("published_endDate") String publishedEndDate,
			@JsonProperty("filter_by_published_date") Boolean filterByPublishedDate,
			@JsonProperty("paid_startDate") String paidStartDate,
			@JsonProperty("paid_endDate") String paidEndDate,
			@JsonProperty("filter_by_buyer_operation_date") Boolean filterByBuyerOperationDate,
			@JsonProperty("delete_startDate") String deleteStartDate,
			@JsonProperty("delete_endDate") String deleteEndDate,
			@JsonProperty("filter_by_delete_date") Boolean filterByDeleteDate
		) {
			public ListDownloadParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListDownloadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListDownloadResponse {}
		}

		public record ListFavoritesParams(
			Integer page,
			String show,
			String title,
			Integer pmin,
			Integer pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") String orderBy,
			Boolean sb,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Boolean nsb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe
		) {
			public ListFavoritesParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListFavoritesResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ListViewedParams(
			Integer page,
			String show,
			String title,
			Integer pmin,
			Integer pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") String orderBy,
			Boolean sb,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Boolean nsb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe
		) {
			public ListViewedParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListViewedResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ManagingApi Types ────────────────────────────────────────

	public static final class ManagingApiTypes {

		private ManagingApiTypes() {
		}

		public record ManagingGetParams(
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public ManagingGetParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingGetResponse(
			ItemModel item,
			boolean canStickItem,
			boolean canUnstickItem,
			boolean canBuyItem,
			String cannotBuyItemError,
			boolean canCloseItem,
			boolean canOpenItem,
			boolean canReportItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canCancelConfirmedBuy,
			boolean canViewItemHistory,
			boolean faveCount,
			boolean isVisibleItem,
			boolean canViewLoginData,
			boolean showToFavouritesButton,
			String itemLink,
			boolean canChangeOwner,
			List<Long> sameItemsIds,
			long sameItemsCount,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingDeleteBody(
			String reason
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingCreateClaimBody(
			@JsonProperty("item_id") Integer itemId,
			@JsonProperty("post_body") String postBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponse(
			JsonNode thread,
			@JsonProperty("system_info") JsonNode systemInfo
		) {}

		public record ManagingBulkGetBody(
			@JsonProperty("item_id") List<Integer> itemId,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public ManagingBulkGetBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingBulkGetResponse(
			List<JsonNode> items,
			@JsonProperty("left_item_id") List<Long> leftItemId,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingSteamInventoryValueParams(
			@JsonProperty("app_id") JsonNode appId,
			String currency,
			@JsonProperty("ignore_cache") Boolean ignoreCache
		) {
			public ManagingSteamInventoryValueParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponse(
			String query,
			JsonNode data,
			Long appId,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingSteamValueParams(
			String link,
			@JsonProperty("app_id") JsonNode appId,
			String currency,
			@JsonProperty("ignore_cache") Boolean ignoreCache
		) {
			public ManagingSteamValueParams() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponse(
			String query,
			JsonNode data,
			Long appId,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingSteamPreviewParams(
			String type
		) {
			public ManagingSteamPreviewParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamPreviewResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamPreviewResponse {}
		}

		public record ManagingEditBody(
			String title,
			@JsonProperty("title_en") String titleEn,
			Integer price,
			String currency,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Integer proxyId,
			String description,
			String information
		) {
			public ManagingEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEditResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAIPriceResponse(
			long price,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBuyPriceResponse(
			long price,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingNoteBody(
			String text
		) {
			public ManagingNoteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingNoteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingSteamUpdateValueBody(
			Boolean all,
			@JsonProperty("app_id") JsonNode appId,
			Boolean authorize
		) {
			public ManagingSteamUpdateValueBody() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamUpdateValueResponse(
			String status,
			ItemModel item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingBumpResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingAutoBumpBody(
			Integer hour
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBumpResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBumpDisableResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingOpenResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCloseResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingImageParams(
			String type
		) {
			public ManagingImageParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingImageResponse(
			String base64,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEmailCodeResponse(
			ItemModel item,
			JsonNode codeData
		) {}

		public record ManagingGetLetters2Params(
			@JsonProperty("email_password") String emailPassword,
			String email,
			String password,
			Integer limit
		) {
			public ManagingGetLetters2Params() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingGetLetters2Response(
			String email,
			List<JsonNode> letters,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponse(
			JsonNode maFile,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamAddMafileResponse(
			String status,
			String message,
			ItemModel item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamRemoveMafileResponse(
			String status,
			String message,
			ItemModel item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamMafileCodeResponse(
			ItemModel item,
			JsonNode codeData
		) {}

		public record ManagingSteamSDABody(
			Integer id,
			Integer nonce
		) {
			public ManagingSteamSDABody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamSDAResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramCodeResponse(
			ItemModel item,
			JsonNode codes
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramResetAuthResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingRefuseGuaranteeResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingDeclineVideoRecordingBody(
			@JsonProperty("i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item") Boolean iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingDeclineVideoRecordingResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCheckGuaranteeResponse(
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingChangePasswordBody(
			@JsonProperty("_cancel") String Cancel
		) {
			public ManagingChangePasswordBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingChangePasswordResponse(
			String status,
			String message,
			@JsonProperty("new_password") String newPassword
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTempEmailPasswordResponse(
			JsonNode item
		) {}

		public record ManagingTagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTagResponse(
			long itemId,
			JsonNode tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingUntagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUntagResponse(
			long itemId,
			JsonNode tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingPublicTagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicTagResponse(
			long itemId,
			JsonNode tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingPublicUntagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicUntagResponse(
			long itemId,
			JsonNode tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingFavoriteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnfavoriteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingStickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnstickResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingTransferBody(
			String username,
			@JsonProperty("secret_answer") String secretAnswer
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTransferResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ProfileApi Types ────────────────────────────────────────

	public static final class ProfileApiTypes {

		private ProfileApiTypes() {
		}

		public record ProfileClaimsParams(
			String type,
			@JsonProperty("claim_state") String claimState
		) {
			public ProfileClaimsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponse(
			List<JsonNode> claims,
			JsonNode stats,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfileGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ProfileGetParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileGetResponse(
			UserModel user,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProfileEditBody(
			JsonNode user,
			JsonNode option,
			@JsonProperty("allow_accept_accounts") List<String> allowAcceptAccounts,
			@JsonProperty("telegram_api_id") String telegramApiId,
			@JsonProperty("telegram_api_hash") String telegramApiHash,
			@JsonProperty("telegram_device_model") String telegramDeviceModel,
			@JsonProperty("telegram_system_version") String telegramSystemVersion,
			@JsonProperty("telegram_app_version") String telegramAppVersion,
			@JsonProperty("telegram_lang_pack") String telegramLangPack,
			@JsonProperty("telegram_lang_code") String telegramLangCode,
			@JsonProperty("telegram_system_lang_code") String telegramSystemLangCode,
			@JsonProperty("clear_telegram_client") Boolean clearTelegramClient
		) {
			public ProfileEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileEditResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── CartApi Types ────────────────────────────────────────

	public static final class CartApiTypes {

		private CartApiTypes() {
		}

		public record CartGetParams(
			@JsonProperty("category_id") JsonNode categoryId,
			Integer page,
			Integer pmin,
			Integer pmax,
			String title,
			@JsonProperty("order_by") String orderBy,
			@JsonProperty("tag_id[]") List<Integer> tagId,
			@JsonProperty("not_tag_id[]") List<Integer> notTagId,
			@JsonProperty("public_tag_id[]") List<Integer> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Integer> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Integer userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			String currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") String notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public CartGetParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartGetResponse(
			List<ItemFromListModel> items,
			long totalItems,
			JsonNode totalItemsPrice,
			boolean hasNextPage,
			long perPage,
			long page,
			String searchUrl,
			List<ItemFromListModel> stickyItems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CartAddBody(
			@JsonProperty("item_id") Integer itemId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartAddResponse(
			boolean success,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CartDeleteBody(
			@JsonProperty("item_id") Integer itemId
		) {
			public CartDeleteBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartDeleteResponse(
			boolean success,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PurchasingApi Types ────────────────────────────────────────

	public static final class PurchasingApiTypes {

		private PurchasingApiTypes() {
		}

		public record PurchasingFastBuyBody(
			Double price,
			@JsonProperty("balance_id") Integer balanceId
		) {
			public PurchasingFastBuyBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponse(
			String status,
			JsonNode item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponse(
			String status,
			JsonNode item,
			boolean requireVideoRecording,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PurchasingConfirmBody(
			Integer price,
			@JsonProperty("balance_id") Integer balanceId
		) {
			public PurchasingConfirmBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponse(
			String status,
			JsonNode item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PurchasingDiscountRequestBody(
			@JsonProperty("discount_price") Double discountPrice,
			String message
		) {
			public PurchasingDiscountRequestBody(Double discountPrice) {
				this(discountPrice, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingDiscountRequestResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingDiscountCancelResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── CustomDiscountsApi Types ────────────────────────────────────────

	public static final class CustomDiscountsApiTypes {

		private CustomDiscountsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsGetResponse(
			List<DiscountModel> discounts,
			long total,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CustomDiscountsCreateBody(
			@JsonProperty("user_id") Integer userId,
			@JsonProperty("category_id") JsonNode categoryId,
			@JsonProperty("discount_percent") Double discountPercent,
			@JsonProperty("min_price") Double minPrice,
			@JsonProperty("max_price") Double maxPrice,
			String currency
		) {
			public CustomDiscountsCreateBody(Integer userId, JsonNode categoryId, Double discountPercent, Double minPrice) {
				this(userId, categoryId, discountPercent, minPrice, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsCreateResponse(
			DiscountModel discount,
			long total,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CustomDiscountsEditBody(
			@JsonProperty("discount_id") Integer discountId,
			@JsonProperty("discount_percent") Double discountPercent,
			@JsonProperty("min_price") Double minPrice,
			@JsonProperty("max_price") Double maxPrice
		) {
			public CustomDiscountsEditBody(Integer discountId) {
				this(discountId, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsEditResponse(
			List<DiscountModel> discounts,
			long total,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CustomDiscountsDeleteBody(
			@JsonProperty("discount_id") Integer discountId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PublishingApi Types ────────────────────────────────────────

	public static final class PublishingApiTypes {

		private PublishingApiTypes() {
		}

		public record PublishingFastSellBody(
			String title,
			@JsonProperty("title_en") String titleEn,
			Double price,
			@JsonProperty("category_id") JsonNode categoryId,
			String currency,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") JsonNode extendedGuarantee,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Integer proxyId,
			@JsonProperty("random_proxy") Boolean randomProxy,
			String description,
			String information,
			String login,
			String password,
			@JsonProperty("login_password") String loginPassword,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") String emailType,
			JsonNode extra
		) {
			public PublishingFastSellBody(Double price, JsonNode categoryId, String currency, String itemOrigin) {
				this(null, null, price, categoryId, currency, itemOrigin, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingFastSellResponse(
			ItemModel item,
			String itemLink,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PublishingAddBody(
			String title,
			@JsonProperty("title_en") String titleEn,
			Double price,
			@JsonProperty("category_id") JsonNode categoryId,
			String currency,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") JsonNode extendedGuarantee,
			String description,
			String information,
			Boolean forceTempEmail,
			@JsonProperty("resell_item_id") Integer resellItemId,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Integer proxyId,
			@JsonProperty("random_proxy") Boolean randomProxy
		) {
			public PublishingAddBody(Double price, JsonNode categoryId, String currency, String itemOrigin) {
				this(null, null, price, categoryId, currency, itemOrigin, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingAddResponse(
			String status,
			ItemModel item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PublishingCheckBody(
			@JsonProperty("resell_item_id") Integer resellItemId,
			@JsonProperty("random_proxy") Boolean randomProxy,
			String login,
			String password,
			@JsonProperty("login_password") String loginPassword,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") String emailType,
			JsonNode extra
		) {
			public PublishingCheckBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponse(
			String status,
			JsonNode item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PublishingExternalBody(
			String type,
			String login,
			@JsonProperty("email_login_data") String emailLoginData,
			String cookies
		) {
			public PublishingExternalBody(String type) {
				this(type, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingExternalResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PaymentsApi Types ────────────────────────────────────────

	public static final class PaymentsApiTypes {

		private PaymentsApiTypes() {
		}

		public record PaymentsInvoiceGetParams(
			@JsonProperty("invoice_id") Integer invoiceId,
			@JsonProperty("payment_id") String paymentId
		) {
			public PaymentsInvoiceGetParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsInvoiceGetResponse(
			InvoiceModel invoice,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsInvoiceCreateBody(
			String currency,
			Double amount,
			@JsonProperty("payment_id") String paymentId,
			String comment,
			@JsonProperty("url_success") String urlSuccess,
			@JsonProperty("url_callback") String urlCallback,
			@JsonProperty("merchant_id") Integer merchantId,
			@JsonProperty("required_telegram_id") Integer requiredTelegramId,
			@JsonProperty("required_telegram_username") String requiredTelegramUsername,
			Double lifetime,
			@JsonProperty("additional_data") String additionalData,
			@JsonProperty("is_test") Boolean isTest
		) {
			public PaymentsInvoiceCreateBody(String currency, Double amount, String paymentId, String comment, String urlSuccess, Integer merchantId) {
				this(currency, amount, paymentId, comment, urlSuccess, null, merchantId, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsInvoiceCreateResponse(
			InvoiceModel invoice,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsInvoiceListParams(
			Integer page,
			String currency,
			String status,
			Double amount,
			@JsonProperty("merchant_id") Integer merchantId
		) {
			public PaymentsInvoiceListParams() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsInvoiceListResponse(
			List<InvoiceModel> invoices,
			long count,
			long page,
			long perPage,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponse(
			JsonNode currencyList,
			long lastUpdate,
			String visitorCurrency,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponse(
			JsonNode from,
			JsonNode to,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsBalanceExchangeBody(
			@JsonProperty("from_balance") String fromBalance,
			@JsonProperty("to_balance") String toBalance,
			Integer amount
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponse(
			JsonNode from,
			JsonNode to,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsTransferBody(
			@JsonProperty("user_id") Integer userId,
			String username,
			Integer amount,
			String currency,
			String comment,
			@JsonProperty("telegram_deal") Boolean telegramDeal,
			@JsonProperty("telegram_username") String telegramUsername,
			@JsonProperty("transfer_hold") Boolean transferHold,
			@JsonProperty("hold_length_value") Integer holdLengthValue,
			@JsonProperty("hold_length_option") String holdLengthOption
		) {
			public PaymentsTransferBody(Integer amount, String currency) {
				this(null, null, amount, currency, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsTransferResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsFeeParams(
			Double amount
		) {
			public PaymentsFeeParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsFeeResponse(
			@JsonProperty("commission_percentage") long commissionPercentage,
			long spentCurrentMonth,
			JsonNode calculator,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsCancelBody(
			@JsonProperty("payment_id") Integer paymentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCancelResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsHistoryParams(
			String type,
			Integer pmin,
			Integer pmax,
			String currency,
			Integer page,
			@JsonProperty("operation_id_lt") Integer operationIdLt,
			String receiver,
			String sender,
			@JsonProperty("is_api") Boolean isApi,
			String startDate,
			String endDate,
			String wallet,
			String comment,
			@JsonProperty("is_hold") Boolean isHold,
			@JsonProperty("show_payment_stats") Boolean showPaymentStats
		) {
			public PaymentsHistoryParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponse(
			JsonNode payments,
			String perPage,
			long page,
			String pageNavLink,
			JsonNode pageNavParams,
			String periodLabel,
			String periodLabelPhrase,
			boolean filterDatesDefault,
			JsonNode input,
			JsonNode paymentStats,
			boolean hasNextPage,
			long lastOperationId,
			String nextPageHref,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponse(
			List<JsonNode> systems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsPayoutBody(
			@JsonProperty("payment_system") String paymentSystem,
			String wallet,
			Double amount,
			String currency,
			@JsonProperty("include_fee") Boolean includeFee,
			JsonNode extra
		) {
			public PaymentsPayoutBody(String paymentSystem, String wallet, Double amount, String currency) {
				this(paymentSystem, wallet, amount, currency, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── AutoPaymentsApi Types ────────────────────────────────────────

	public static final class AutoPaymentsApiTypes {

		private AutoPaymentsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponse(
			JsonNode payments,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record AutoPaymentsCreateBody(
			@JsonProperty("secret_answer") String secretAnswer,
			@JsonProperty("username_receiver") String usernameReceiver,
			JsonNode day,
			Double amount,
			String currency,
			String description
		) {
			public AutoPaymentsCreateBody(String usernameReceiver, JsonNode day, Double amount) {
				this(null, usernameReceiver, day, amount, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsCreateResponse(
			String status,
			String message,
			@JsonProperty("auto_payment_id") long autoPaymentId,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record AutoPaymentsDeleteBody(
			@JsonProperty("auto_payment_id") Integer autoPaymentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ProxyApi Types ────────────────────────────────────────

	public static final class ProxyApiTypes {

		private ProxyApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponse(
			List<JsonNode> proxies,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProxyAddBody(
			@JsonProperty("proxy_ip") String proxyIp,
			@JsonProperty("proxy_port") Integer proxyPort,
			@JsonProperty("proxy_user") String proxyUser,
			@JsonProperty("proxy_pass") String proxyPass,
			@JsonProperty("proxy_row") String proxyRow
		) {
			public ProxyAddBody() {
				this(null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyAddResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ProxyDeleteBody(
			@JsonProperty("proxy_id") Integer proxyId,
			@JsonProperty("delete_all") Boolean deleteAll
		) {
			public ProxyDeleteBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ImapApi Types ────────────────────────────────────────

	public static final class ImapApiTypes {

		private ImapApiTypes() {
		}

		public record ImapCreateBody(
			String domain,
			@JsonProperty("imap_server") String imapServer,
			Integer port,
			Boolean secure
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ImapCreateResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ImapDeleteBody(
			String domain
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ImapDeleteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponse(
			JsonNode jobs,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

	}

}
