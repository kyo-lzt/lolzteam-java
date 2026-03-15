// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

public final class Types {

	private Types() {
	}

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

		public record CategoryAllResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryAllResponse {}
		}

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

		public record CategorySteamResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategorySteamResponse {}
		}

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

		public record CategoryFortniteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryFortniteResponse {}
		}

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

		public record CategoryMihoyoResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryMihoyoResponse {}
		}

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

		public record CategoryRiotResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryRiotResponse {}
		}

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

		public record CategoryTelegramResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryTelegramResponse {}
		}

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

		public record CategorySupercellResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategorySupercellResponse {}
		}

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

		public record CategoryEaResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryEaResponse {}
		}

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

		public record CategoryWotResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryWotResponse {}
		}

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

		public record CategoryWotBlitzResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryWotBlitzResponse {}
		}

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

		public record CategoryGiftsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryGiftsResponse {}
		}

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

		public record CategoryEpicGamesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryEpicGamesResponse {}
		}

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

		public record CategoryEscapeFromTarkovResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryEscapeFromTarkovResponse {}
		}

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

		public record CategorySocialClubResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategorySocialClubResponse {}
		}

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

		public record CategoryUplayResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryUplayResponse {}
		}

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

		public record CategoryDiscordResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryDiscordResponse {}
		}

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

		public record CategoryTikTokResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryTikTokResponse {}
		}

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

		public record CategoryInstagramResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryInstagramResponse {}
		}

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

		public record CategoryBattleNetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryBattleNetResponse {}
		}

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

		public record CategoryChatGPTResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryChatGPTResponse {}
		}

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

		public record CategoryVpnResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryVpnResponse {}
		}

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

		public record CategoryRobloxResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryRobloxResponse {}
		}

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

		public record CategoryWarfaceResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryWarfaceResponse {}
		}

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

		public record CategoryMinecraftResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryMinecraftResponse {}
		}

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

		public record CategoryHytaleResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryHytaleResponse {}
		}

		public record CategoryListParams(
			@JsonProperty("top_queries") Boolean topQueries
		) {
			public CategoryListParams() {
				this(null);
			}
		}

		public record CategoryListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryListResponse {}
		}

		public record CategoryParamsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryParamsResponse {}
		}

		public record CategoryGamesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoryGamesResponse {}
		}

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

		public record ListUserResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListUserResponse {}
		}

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

		public record ListOrdersResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListOrdersResponse {}
		}

		public record ListStatesParams(
			@JsonProperty("user_id") JsonNode userId
		) {
			public ListStatesParams() {
				this(null);
			}
		}

		public record ListStatesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListStatesResponse {}
		}

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

		public record ListFavoritesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListFavoritesResponse {}
		}

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

		public record ListViewedResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ListViewedResponse {}
		}

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

		public record ManagingGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingGetResponse {}
		}

		public record ManagingDeleteBody(
			String reason
		) {
		}

		public record ManagingDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingDeleteResponse {}
		}

		public record ManagingCreateClaimBody(
			@JsonProperty("item_id") Integer itemId,
			@JsonProperty("post_body") String postBody
		) {
		}

		public record ManagingCreateClaimResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingCreateClaimResponse {}
		}

		public record ManagingBulkGetBody(
			@JsonProperty("item_id") List<Integer> itemId,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public ManagingBulkGetBody() {
				this(null, null);
			}
		}

		public record ManagingBulkGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingBulkGetResponse {}
		}

		public record ManagingSteamInventoryValueParams(
			@JsonProperty("app_id") JsonNode appId,
			String currency,
			@JsonProperty("ignore_cache") Boolean ignoreCache
		) {
			public ManagingSteamInventoryValueParams() {
				this(null, null, null);
			}
		}

		public record ManagingSteamInventoryValueResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamInventoryValueResponse {}
		}

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

		public record ManagingSteamValueResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamValueResponse {}
		}

		public record ManagingSteamPreviewParams(
			String type
		) {
			public ManagingSteamPreviewParams() {
				this(null);
			}
		}

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

		public record ManagingEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingEditResponse {}
		}

		public record ManagingAIPriceResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingAIPriceResponse {}
		}

		public record ManagingAutoBuyPriceResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingAutoBuyPriceResponse {}
		}

		public record ManagingNoteBody(
			String text
		) {
			public ManagingNoteBody() {
				this(null);
			}
		}

		public record ManagingNoteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingNoteResponse {}
		}

		public record ManagingSteamUpdateValueBody(
			Boolean all,
			@JsonProperty("app_id") JsonNode appId,
			Boolean authorize
		) {
			public ManagingSteamUpdateValueBody() {
				this(null, null, null);
			}
		}

		public record ManagingSteamUpdateValueResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamUpdateValueResponse {}
		}

		public record ManagingBumpResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingBumpResponse {}
		}

		public record ManagingAutoBumpBody(
			Integer hour
		) {
		}

		public record ManagingAutoBumpResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingAutoBumpResponse {}
		}

		public record ManagingAutoBumpDisableResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingAutoBumpDisableResponse {}
		}

		public record ManagingOpenResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingOpenResponse {}
		}

		public record ManagingCloseResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingCloseResponse {}
		}

		public record ManagingImageParams(
			String type
		) {
			public ManagingImageParams() {
				this(null);
			}
		}

		public record ManagingImageResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingImageResponse {}
		}

		public record ManagingEmailCodeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingEmailCodeResponse {}
		}

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

		public record ManagingGetLetters2Response(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingGetLetters2Response {}
		}

		public record ManagingSteamGetMafileResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamGetMafileResponse {}
		}

		public record ManagingSteamAddMafileResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamAddMafileResponse {}
		}

		public record ManagingSteamRemoveMafileResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamRemoveMafileResponse {}
		}

		public record ManagingSteamMafileCodeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamMafileCodeResponse {}
		}

		public record ManagingSteamSDABody(
			Integer id,
			Integer nonce
		) {
			public ManagingSteamSDABody() {
				this(null, null);
			}
		}

		public record ManagingSteamSDAResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingSteamSDAResponse {}
		}

		public record ManagingTelegramCodeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingTelegramCodeResponse {}
		}

		public record ManagingTelegramResetAuthResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingTelegramResetAuthResponse {}
		}

		public record ManagingRefuseGuaranteeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingRefuseGuaranteeResponse {}
		}

		public record ManagingDeclineVideoRecordingBody(
			@JsonProperty("i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item") Boolean iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem
		) {
		}

		public record ManagingDeclineVideoRecordingResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingDeclineVideoRecordingResponse {}
		}

		public record ManagingCheckGuaranteeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingCheckGuaranteeResponse {}
		}

		public record ManagingChangePasswordBody(
			@JsonProperty("_cancel") String Cancel
		) {
			public ManagingChangePasswordBody() {
				this(null);
			}
		}

		public record ManagingChangePasswordResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingChangePasswordResponse {}
		}

		public record ManagingTempEmailPasswordResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingTempEmailPasswordResponse {}
		}

		public record ManagingTagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		public record ManagingTagResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingTagResponse {}
		}

		public record ManagingUntagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		public record ManagingUntagResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingUntagResponse {}
		}

		public record ManagingPublicTagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		public record ManagingPublicTagResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingPublicTagResponse {}
		}

		public record ManagingPublicUntagBody(
			@JsonProperty("tag_id") Integer tagId
		) {
		}

		public record ManagingPublicUntagResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingPublicUntagResponse {}
		}

		public record ManagingFavoriteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingFavoriteResponse {}
		}

		public record ManagingUnfavoriteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingUnfavoriteResponse {}
		}

		public record ManagingStickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingStickResponse {}
		}

		public record ManagingUnstickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingUnstickResponse {}
		}

		public record ManagingTransferBody(
			String username,
			@JsonProperty("secret_answer") String secretAnswer
		) {
		}

		public record ManagingTransferResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ManagingTransferResponse {}
		}

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

		public record ProfileClaimsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfileClaimsResponse {}
		}

		public record ProfileGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ProfileGetParams() {
				this(null);
			}
		}

		public record ProfileGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfileGetResponse {}
		}

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

		public record ProfileEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfileEditResponse {}
		}

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

		public record CartGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CartGetResponse {}
		}

		public record CartAddBody(
			@JsonProperty("item_id") Integer itemId
		) {
		}

		public record CartAddResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CartAddResponse {}
		}

		public record CartDeleteBody(
			@JsonProperty("item_id") Integer itemId
		) {
			public CartDeleteBody() {
				this(null);
			}
		}

		public record CartDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CartDeleteResponse {}
		}

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

		public record PurchasingFastBuyResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PurchasingFastBuyResponse {}
		}

		public record PurchasingCheckResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PurchasingCheckResponse {}
		}

		public record PurchasingConfirmBody(
			Integer price,
			@JsonProperty("balance_id") Integer balanceId
		) {
			public PurchasingConfirmBody() {
				this(null, null);
			}
		}

		public record PurchasingConfirmResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PurchasingConfirmResponse {}
		}

		public record PurchasingDiscountRequestBody(
			@JsonProperty("discount_price") Double discountPrice,
			String message
		) {
			public PurchasingDiscountRequestBody(Double discountPrice) {
				this(discountPrice, null);
			}
		}

		public record PurchasingDiscountRequestResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PurchasingDiscountRequestResponse {}
		}

		public record PurchasingDiscountCancelResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PurchasingDiscountCancelResponse {}
		}

	}

	// ─── CustomDiscountsApi Types ────────────────────────────────────────

	public static final class CustomDiscountsApiTypes {

		private CustomDiscountsApiTypes() {
		}

		public record CustomDiscountsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CustomDiscountsGetResponse {}
		}

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

		public record CustomDiscountsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CustomDiscountsCreateResponse {}
		}

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

		public record CustomDiscountsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CustomDiscountsEditResponse {}
		}

		public record CustomDiscountsDeleteBody(
			@JsonProperty("discount_id") Integer discountId
		) {
		}

		public record CustomDiscountsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CustomDiscountsDeleteResponse {}
		}

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

		public record PublishingFastSellResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PublishingFastSellResponse {}
		}

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

		public record PublishingAddResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PublishingAddResponse {}
		}

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

		public record PublishingCheckResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PublishingCheckResponse {}
		}

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

		public record PublishingExternalResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PublishingExternalResponse {}
		}

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

		public record PaymentsInvoiceGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsInvoiceGetResponse {}
		}

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

		public record PaymentsInvoiceCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsInvoiceCreateResponse {}
		}

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

		public record PaymentsInvoiceListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsInvoiceListResponse {}
		}

		public record PaymentsCurrencyResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsCurrencyResponse {}
		}

		public record PaymentsBalanceListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsBalanceListResponse {}
		}

		public record PaymentsBalanceExchangeBody(
			@JsonProperty("from_balance") String fromBalance,
			@JsonProperty("to_balance") String toBalance,
			Integer amount
		) {
		}

		public record PaymentsBalanceExchangeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsBalanceExchangeResponse {}
		}

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

		public record PaymentsTransferResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsTransferResponse {}
		}

		public record PaymentsFeeParams(
			Double amount
		) {
			public PaymentsFeeParams() {
				this(null);
			}
		}

		public record PaymentsFeeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsFeeResponse {}
		}

		public record PaymentsCancelBody(
			@JsonProperty("payment_id") Integer paymentId
		) {
		}

		public record PaymentsCancelResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsCancelResponse {}
		}

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

		public record PaymentsHistoryResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsHistoryResponse {}
		}

		public record PaymentsPayoutServicesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsPayoutServicesResponse {}
		}

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

		public record PaymentsPayoutResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PaymentsPayoutResponse {}
		}

	}

	// ─── AutoPaymentsApi Types ────────────────────────────────────────

	public static final class AutoPaymentsApiTypes {

		private AutoPaymentsApiTypes() {
		}

		public record AutoPaymentsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public AutoPaymentsListResponse {}
		}

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

		public record AutoPaymentsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public AutoPaymentsCreateResponse {}
		}

		public record AutoPaymentsDeleteBody(
			@JsonProperty("auto_payment_id") Integer autoPaymentId
		) {
		}

		public record AutoPaymentsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public AutoPaymentsDeleteResponse {}
		}

	}

	// ─── ProxyApi Types ────────────────────────────────────────

	public static final class ProxyApiTypes {

		private ProxyApiTypes() {
		}

		public record ProxyGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProxyGetResponse {}
		}

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

		public record ProxyAddResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProxyAddResponse {}
		}

		public record ProxyDeleteBody(
			@JsonProperty("proxy_id") Integer proxyId,
			@JsonProperty("delete_all") Boolean deleteAll
		) {
			public ProxyDeleteBody() {
				this(null, null);
			}
		}

		public record ProxyDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProxyDeleteResponse {}
		}

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

		public record ImapCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ImapCreateResponse {}
		}

		public record ImapDeleteBody(
			String domain
		) {
		}

		public record ImapDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ImapDeleteResponse {}
		}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		public record BatchBatchResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public BatchBatchResponse {}
		}

	}

}
