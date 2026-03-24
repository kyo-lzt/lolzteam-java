// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market;

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

	public enum OrderBy {
		PRICE_TO_UP("price_to_up"),
		PRICE_TO_DOWN("price_to_down"),
		PDATE_TO_DOWN("pdate_to_down"),
		PDATE_TO_UP("pdate_to_up"),
		PDATE_TO_DOWN_UPLOAD("pdate_to_down_upload"),
		PDATE_TO_UP_UPLOAD("pdate_to_up_upload"),
		EDATE_TO_UP("edate_to_up"),
		EDATE_TO_DOWN("edate_to_down"),
		DDATE_TO_UP("ddate_to_up"),
		DDATE_TO_DOWN("ddate_to_down");

		private final String value;

		OrderBy(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
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
		TRY("try"),
		JPY("jpy"),
		BRL("brl");

		private final String value;

		Currency(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum NotEmailProvider {
		OTHER("other"),
		RAMBLER("rambler"),
		OUTLOOK("outlook"),
		FIRSTMAIL("firstmail"),
		NOTLETTERS("notletters"),
		MAIL_RU("mail_ru");

		private final String value;

		NotEmailProvider(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategoryEg {
		V_1(-1L),
		V0(0L),
		V1(1L);

		private final long value;

		CategoryEg(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum CategoryEgFortnite {
		V_1(-1L),
		V0(0L),
		V1(1L),
		V2(2L);

		private final long value;

		CategoryEgFortnite(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum CategoryEgBattleNet {
		V0(0L),
		V1(1L);

		private final long value;

		CategoryEgBattleNet(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Rt {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Rt(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum TradeBan {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		TradeBan(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum TradeLimit {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		TradeLimit(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Limit {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Limit(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Mafile {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Mafile(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum RegPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		RegPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum MmBan {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		MmBan(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LastTransDatePeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		LastTransDatePeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LastTransDatePeriodLater {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		LastTransDatePeriodLater(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HasActivatedKeys {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HasActivatedKeys(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Cs2MapRank {
		V1(1L),
		V2(2L),
		V3(3L),
		V4(4L),
		V5(5L),
		V6(6L),
		V7(7L),
		V8(8L),
		V9(9L),
		V10(10L),
		V11(11L),
		V12(12L),
		V13(13L);

		private final long value;

		Cs2MapRank(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum HasFaceit {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HasFaceit(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum D2LastMatchDatePeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		D2LastMatchDatePeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum TempEmail {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		TempEmail(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ChangeEmail {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		ChangeEmail(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Bp {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Bp(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum XboxLinkable {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		XboxLinkable(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PsnLinkable {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		PsnLinkable(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Email {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Email(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Ea {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Ea(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Tel {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Tel(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Spam {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Spam(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Password {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Password(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Premium {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Premium(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PremiumExpirationPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		PremiumExpirationPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum BirthdayPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		BirthdayPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum BirthdayAfterPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		BirthdayAfterPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum BrawlPass {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		BrawlPass(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum RoyalePass {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		RoyalePass(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ClashPass {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		ClashPass(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HasBan {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HasBan(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum XboxConnected {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		XboxConnected(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum SteamConnected {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		SteamConnected(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PsnConnected {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		PsnConnected(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategorySubscription {
		EA_PLAY("EA Play"),
		EA_PLAY_PRO("EA Play Pro");

		private final String value;

		CategorySubscription(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategorySubscriptionGifts {
		DISCORD_NITRO("discord_nitro"),
		DISCORD_NITRO_BASIC("discord_nitro_basic"),
		DISCORD_NITRO_TRIAL("discord_nitro_trial"),
		TELEGRAM_PREMIUM("telegram_premium");

		private final String value;

		CategorySubscriptionGifts(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategorySubscriptionUplay {
		BASIC("basic"),
		PREMIUM("premium"),
		PREMIUM_ANYWHERE("premiumAnywhere");

		private final String value;

		CategorySubscriptionUplay(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategorySubscriptionRoblox {
		ROBLOX_PREMIUM1000("RobloxPremium1000"),
		ROBLOX_PREMIUM100012_MONTHS("RobloxPremium100012Months"),
		ROBLOX_PREMIUM1000_ONE_MONTH("RobloxPremium1000OneMonth"),
		ROBLOX_PREMIUM2200("RobloxPremium2200"),
		ROBLOX_PREMIUM2200_ONE_MONTH("RobloxPremium2200OneMonth"),
		ROBLOX_PREMIUM450("RobloxPremium450"),
		ROBLOX_PREMIUM450_ONE_MONTH("RobloxPremium450OneMonth");

		private final String value;

		CategorySubscriptionRoblox(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategorySubscriptionMinecraft {
		PC_GAME_PASS("PC Game Pass"),
		XBOX_GAME_PASS_ULTIMATE("Xbox Game Pass Ultimate");

		private final String value;

		CategorySubscriptionMinecraft(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum SubscriptionPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		SubscriptionPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Transactions {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Transactions(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Clan {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Clan(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Region {
		AF("af"),
		AS("as"),
		CIS("cis"),
		EU("eu"),
		ME("me"),
		OC("oc"),
		US("us");

		private final String value;

		Region(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Pve {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Pve(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Side {
		BEAR("Bear"),
		SAVAGE("Savage");

		private final String value;

		Side(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum R6Ban {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		R6Ban(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Nitro {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Nitro(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum NitroPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		NitroPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Billing {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Billing(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Gifts {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Gifts(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Clans {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Clans(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum _2fa {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		_2fa(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CookieLogin {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		CookieLogin(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Verified {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Verified(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Cookies {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Cookies(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LoginWithoutCookies {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		LoginWithoutCookies(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum EditBtag {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		EditBtag(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ChangeableFn {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		ChangeableFn(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum RealId {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		RealId(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ParentControl {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		ParentControl(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum NoBans {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		NoBans(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Autorenewal {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Autorenewal(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AgeVerified {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		AgeVerified(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum GameDonations {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		GameDonations(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Voice {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Voice(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Java {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Java(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Bedrock {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Bedrock(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Dungeons {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Dungeons(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Legends {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		Legends(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ChangeNickname {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		ChangeNickname(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HypixelBan {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HypixelBan(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HypixelSkyblockApiEnabled {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HypixelSkyblockApiEnabled(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum LastLoginHypixelPeriod {
		DAY("day"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		LastLoginHypixelPeriod(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CanChangeDetails {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		CanChangeDetails(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HypixelBanParsed {
		YES("yes"),
		NO("no"),
		NOMATTER("nomatter");

		private final String value;

		HypixelBanParsed(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum CategoryId {
		V1(1L),
		V3(3L),
		V4(4L),
		V5(5L),
		V6(6L),
		V7(7L),
		V8(8L),
		V9(9L),
		V10(10L),
		V11(11L),
		V12(12L),
		V13(13L),
		V14(14L),
		V15(15L),
		V16(16L),
		V17(17L),
		V18(18L),
		V19(19L),
		V20(20L),
		V22(22L),
		V24(24L),
		V28(28L),
		V30(30L),
		V31(31L);

		private final long value;

		CategoryId(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Show {
		ACTIVE("active"),
		PAID("paid"),
		DELETED("deleted"),
		AWAITING("awaiting"),
		CLOSED("closed"),
		DISCOUNT_REQUEST("discount_request"),
		STICKIED("stickied"),
		PRE_ACTIVE("pre_active");

		private final String value;

		Show(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Format {
		SHORT("short"),
		CUSTOM("custom"),
		MFA_FILE_STEAM_ID("mfa_file_steam_id"),
		MFA_FILE_LOGIN("mfa_file_login");

		private final String value;

		Format(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum AppId {
		V730(730L),
		V578080(578080L),
		V753(753L),
		V570(570L),
		V440(440L),
		V252490(252490L),
		V304930(304930L),
		V232090(232090L),
		V322330(322330L);

		private final long value;

		AppId(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum ManagingType {
		PROFILES("profiles"),
		GAMES("games");

		private final String value;

		ManagingType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ManagingTypeImage {
		SKINS("skins"),
		PICKAXES("pickaxes"),
		DANCES("dances"),
		GLIDERS("gliders"),
		WEAPONS("weapons"),
		AGENTS("agents"),
		BUDDIES("buddies");

		private final String value;

		ManagingTypeImage(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ProfileType {
		MARKET("market"),
		NOMARKET("nomarket");

		private final String value;

		ProfileType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PublishingType {
		SOCIALCLUB("socialclub");

		private final String value;

		PublishingType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PaymentsType {
		PAID_ITEM("paid_item"),
		SOLD_ITEM("sold_item"),
		WITHDRAWAL_BALANCE("withdrawal_balance"),
		REFILLED_BALANCE("refilled_balance"),
		INTERNAL_PURCHASE("internal_purchase"),
		MONEY_TRANSFER("money_transfer"),
		RECEIVING_MONEY("receiving_money"),
		CLAIM_HOLD("claim_hold"),
		INSURANCE_DEPOSIT("insurance_deposit"),
		PAID_MAIL("paid_mail"),
		CONTEST("contest"),
		INVOICE("invoice"),
		BALANCE_EXCHANGE("balance_exchange");

		private final String value;

		PaymentsType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum ManagingItemOrigin {
		BRUTE("brute"),
		PHISHING("phishing"),
		STEALER("stealer"),
		PERSONAL("personal"),
		RESALE("resale"),
		AUTOREG("autoreg"),
		DUMMY("dummy");

		private final String value;

		ManagingItemOrigin(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum PublishingItemOrigin {
		BRUTE("brute"),
		PHISHING("phishing"),
		STEALER("stealer"),
		PERSONAL("personal"),
		RESALE("resale"),
		AUTOREG("autoreg"),
		DUMMY("dummy"),
		SELF_REGISTRATION("self_registration");

		private final String value;

		PublishingItemOrigin(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum EmailType {
		NATIVE("native"),
		AUTOREG("autoreg");

		private final String value;

		EmailType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Cancel {
		V1(1L);

		private final long value;

		Cancel(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
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

	public enum ExtendedGuarantee {
		V_1(-1L),
		V0(0L),
		V1(1L);

		private final long value;

		ExtendedGuarantee(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
	}

	public enum Status {
		PAID("paid"),
		NOT_PAID("not_paid");

		private final String value;

		Status(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum HoldLengthOption {
		HOUR("hour"),
		DAY("day"),
		WEEK("week"),
		MONTH("month"),
		YEAR("year");

		private final String value;

		HoldLengthOption(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}

	public enum Day {
		V0(0L),
		V1(1L),
		V2(2L),
		V3(3L),
		V4(4L),
		V5(5L),
		V6(6L),
		V7(7L),
		V8(8L),
		V9(9L),
		V10(10L),
		V11(11L),
		V12(12L),
		V13(13L),
		V14(14L),
		V15(15L),
		V16(16L),
		V17(17L),
		V18(18L),
		V19(19L),
		V20(20L),
		V21(21L),
		V22(22L),
		V23(23L),
		V24(24L),
		V25(25L),
		V26(26L),
		V27(27L),
		V28(28L);

		private final long value;

		Day(long value) {
			this.value = value;
		}

		@JsonValue
		public long getValue() {
			return value;
		}
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
			List<UserModelBalances> balances,
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
			@JsonProperty("custom_fields") UserModelCustomFields customFields,
			@JsonProperty("custom_title") String customTitle,
			long deposit,
			UserModelDob dob,
			@JsonProperty("feedback_data") UserModelFeedbackData feedbackData,
			String hold,
			String homepage,
			@JsonProperty("imap_data") UserModelImapData imapData,
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
			@JsonProperty("public_tags") List<UserModelPublicTags> publicTags,
			@JsonProperty("register_date") long registerDate,
			UserModelRendered rendered,
			@JsonProperty("restore_count") long restoreCount,
			@JsonProperty("restore_data") UserModelRestoreData restoreData,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("sold_items_count") long soldItemsCount,
			List<UserModelTags> tags,
			@JsonProperty("telegram_client") UserModelTelegramClient telegramClient,
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
		public record UserModelBalances(
			String balance,
			@JsonProperty("balance_id") long balanceId,
			double convertedBalance,
			@JsonProperty("custom_title") JsonNode customTitle,
			String fullTitle,
			@JsonProperty("merchant_id") long merchantId,
			String title,
			String type,
			@JsonProperty("user_id") long userId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelCustomFields(
			String _4,
			List<JsonNode> allowSelfUnban,
			@JsonProperty("ban_reason") String banReason,
			String discord,
			String github,
			String jabber,
			String lztAwardUserTrophy,
			String lztLikesIncreasing,
			String lztLikesZeroing,
			String lztSympathyIncreasing,
			String lztSympathyZeroing,
			String lztUnbanAmount,
			String maecenasValue,
			String scamURL,
			String steam,
			String telegram,
			String vk,
			String favoritePorn,
			String favoriteVape,
			String favoriteAnime,
			String matrix
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelDob(
			long year,
			long month,
			long day
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelFeedbackData12345(
			long positive,
			long negative
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelFeedbackData(
			@JsonProperty("12345") UserModelFeedbackData12345 _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelImapDataDomainZone(
			String domain,
			@JsonProperty("imap_server") String imapServer,
			long port,
			boolean secure
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelImapData(
			@JsonProperty("domain.zone") UserModelImapDataDomainZone domainZone
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelPublicTags(
			@JsonProperty("background_color") String backgroundColor,
			@JsonProperty("tag_id") long tagId,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRenderedAvatars(
			String l,
			String m,
			String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRenderedBackgrounds(
			String l,
			String m
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRendered(
			String username,
			UserModelRenderedAvatars avatars,
			UserModelRenderedBackgrounds backgrounds,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRestoreData(
			@JsonProperty("12345") long _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelTags(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelTelegramClient(
			@JsonProperty("telegram_api_id") String telegramApiId,
			@JsonProperty("telegram_api_hash") String telegramApiHash,
			@JsonProperty("telegram_device_model") String telegramDeviceModel,
			@JsonProperty("telegram_system_version") String telegramSystemVersion,
			@JsonProperty("telegram_app_version") String telegramAppVersion,
			@JsonProperty("telegram_system_lang_code") String telegramSystemLangCode,
			@JsonProperty("telegram_lang_code") String telegramLangCode,
			@JsonProperty("telegram_lang_pack") String telegramLangPack
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
			@Nullable String proxy,
			@JsonProperty("close_item") Boolean closeItem,
			@Nullable String region,
			@Nullable String service,
			@Nullable String system,
			@Nullable String confirmationCode,
			@Nullable String cookies,
			@JsonProperty("login_without_cookies") Boolean loginWithoutCookies,
			@JsonProperty("cookie_login") Boolean cookieLogin,
			@JsonProperty("mfa_file") @Nullable String mfaFile,
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
			@Nullable String password,
			@Nullable String telegramClient,
			@Nullable String telegramJson,
			Boolean checkChannels,
			Boolean checkSpam,
			Boolean checkHypixelBan
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConfirmationCodeModel(
			ItemModel item,
			ConfirmationCodeModelCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConfirmationCodeModelCodeData(
			String code,
			long date,
			String textPlain
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
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Long categoryId,
			@JsonProperty("published_date") Long publishedDate,
			@Nullable String title,
			@Nullable String description,
			Long price,
			@JsonProperty("update_stat_date") Long updateStatDate,
			@JsonProperty("refreshed_date") Long refreshedDate,
			@JsonProperty("view_count") Long viewCount,
			@JsonProperty("is_sticky") Long isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Long extendedGuarantee,
			Long nsb,
			@JsonProperty("allow_ask_discount") Long allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
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
			@Nullable ItemFromListModelBumpSettings bumpSettings,
			Boolean canBumpItem,
			Boolean canBuyItem,
			@JsonProperty("rub_price") Long rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			Boolean canValidateAccount,
			Boolean canResellItemAfterPurchase,
			Boolean canViewAccountLink,
			@Nullable String itemOriginPhrase,
			@Nullable List<String> tags,
			@JsonProperty("note_text") @Nullable String noteText,
			@JsonProperty("description_html") @Nullable String descriptionHtml,
			@JsonProperty("description_html_en") @Nullable String descriptionHtmlEn,
			@Nullable ItemFromListModelSeller seller
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModelBumpSettings(
			Boolean canBumpItem,
			Boolean canBumpItemGlobally,
			@Nullable String shortErrorPhrase,
			@Nullable String errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModelSeller(
			@JsonProperty("user_id") Long userId,
			@JsonProperty("sold_items_count") Long soldItemsCount,
			@JsonProperty("active_item_count") Long activeItemCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Long avatarDate,
			@JsonProperty("is_banned") Long isBanned,
			@JsonProperty("display_style_group_id") Long displayStyleGroupId,
			@JsonProperty("restore_percents") Long restorePercents
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
			ItemModelGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewItemViews,
			ItemModelLoginData loginData,
			boolean canViewEmailLoginData,
			ItemModelCopyFormatData copyFormatData,
			boolean showGetEmailCodeButton,
			JsonNode getEmailCodeDisplayLogin,
			ItemModelBuyer buyer,
			boolean isPersonalAccount,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			String priceWithSellerFeeLabel,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean canViewAccountLink,
			List<ItemModelAccountLinks> accountLinks,
			String accountLink,
			List<String> imagePreviewLinks,
			boolean canChangePassword,
			boolean canChangeEmailPassword,
			boolean uniqueKeyExists,
			String itemOriginPhrase,
			boolean visitorIsAuthor,
			boolean canAskDiscount,
			ItemModelTags tags,
			ItemModelCustomFields customFields,
			List<JsonNode> externalAuth,
			boolean isTrusted,
			boolean isBirthdayToday,
			boolean isIgnored,
			long deposit,
			List<ItemModelExtraPrices> extraPrices,
			boolean canViewAccountLoginAndTempEmail,
			ItemModelBumpSettings bumpSettings,
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
			ItemModelSeller seller
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			long endDate,
			boolean active,
			boolean cancelled,
			long remainingTime,
			String remainingTimePhrase,
			String cancelledReason,
			String cancelledReasonPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelCopyFormatData(
			@JsonProperty("title_link") String titleLink,
			@JsonProperty("login_data") String loginData,
			String full
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelBuyer(
			@JsonProperty("user_id") long userId,
			@JsonProperty("operation_date") long operationDate,
			boolean visitorIsBuyer,
			String username,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("display_icon_group_id") long displayIconGroupId,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("uniq_banner") String uniqBanner,
			@JsonProperty("user_group_id") long userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelTags1234567890(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelTags(
			@JsonProperty("1234567890") ItemModelTags1234567890 _1234567890
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelCustomFields(
			String _4,
			List<JsonNode> allowSelfUnban,
			@JsonProperty("ban_reason") String banReason,
			String discord,
			String github,
			String jabber,
			String lztUnbanAmount,
			String steam,
			String telegram,
			String vk
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelExtraPrices(
			String currency,
			String price,
			double priceValue
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode nextAllowedBumpDate,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelSellerContacts(
			@JsonProperty("ban_reason") String banReason,
			String telegram
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelSeller(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("joined_date") long joinedDate,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			@JsonProperty("effective_last_activity") long effectiveLastActivity,
			@JsonProperty("restore_percents") JsonNode restorePercents,
			boolean isOnline,
			ItemModelSellerContacts contacts
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
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
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
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<Long> game,
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			@JsonProperty("hours_played_max") Map<String, Long> hoursPlayedMax,
			CategoryEg eg,
			@JsonProperty("vac[]") List<Long> vac,
			@JsonProperty("vac_skip_game_check") Boolean vacSkipGameCheck,
			/** Default: no */
			Rt rt,
			@JsonProperty("trade_ban") TradeBan tradeBan,
			@JsonProperty("trade_limit") TradeLimit tradeLimit,
			Long daybreak,
			Limit limit,
			Mafile mafile,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			Long lmin,
			Long lmax,
			Long rmin,
			Long rmax,
			@JsonProperty("wingman_rmin") Long wingmanRmin,
			@JsonProperty("wingman_rmax") Long wingmanRmax,
			@JsonProperty("no_vac") Boolean noVac,
			@JsonProperty("mm_ban") MmBan mmBan,
			@JsonProperty("balance_min") Long balanceMin,
			@JsonProperty("balance_max") Long balanceMax,
			@JsonProperty("inv_game") Long invGame,
			@JsonProperty("inv_min") Double invMin,
			@JsonProperty("inv_max") Double invMax,
			@JsonProperty("friends_min") Long friendsMin,
			@JsonProperty("friends_max") Long friendsMax,
			Long gmin,
			Long gmax,
			@JsonProperty("win_count_min") Long winCountMin,
			@JsonProperty("win_count_max") Long winCountMax,
			@JsonProperty("medal_id[]") JsonNode medalId,
			@JsonProperty("medal_operator_or") Boolean medalOperatorOr,
			@JsonProperty("medal_min") Long medalMin,
			@JsonProperty("medal_max") Long medalMax,
			@JsonProperty("gift[]") JsonNode gift,
			@JsonProperty("gift_min") Long giftMin,
			@JsonProperty("gift_max") Long giftMax,
			@JsonProperty("recently_hours_min") Long recentlyHoursMin,
			@JsonProperty("recently_hours_max") Long recentlyHoursMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("cs2_profile_rank_min") Long cs2ProfileRankMin,
			@JsonProperty("cs2_profile_rank_max") Long cs2ProfileRankMax,
			@JsonProperty("solommr_min") Long solommrMin,
			@JsonProperty("solommr_max") Long solommrMax,
			@JsonProperty("d2_game_count_min") Long d2GameCountMin,
			@JsonProperty("d2_game_count_max") Long d2GameCountMax,
			@JsonProperty("d2_win_count_min") Long d2WinCountMin,
			@JsonProperty("d2_win_count_max") Long d2WinCountMax,
			@JsonProperty("d2_behavior_min") Long d2BehaviorMin,
			@JsonProperty("d2_behavior_max") Long d2BehaviorMax,
			@JsonProperty("faceit_lvl_min") Long faceitLvlMin,
			@JsonProperty("faceit_lvl_max") Long faceitLvlMax,
			@JsonProperty("points_min") Long pointsMin,
			@JsonProperty("points_max") Long pointsMax,
			@JsonProperty("relevant_gmin") Long relevantGmin,
			@JsonProperty("relevant_gmax") Long relevantGmax,
			@JsonProperty("last_trans_date") Long lastTransDate,
			@JsonProperty("last_trans_date_period") LastTransDatePeriod lastTransDatePeriod,
			@JsonProperty("last_trans_date_later") Long lastTransDateLater,
			@JsonProperty("last_trans_date_period_later") LastTransDatePeriodLater lastTransDatePeriodLater,
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
			@JsonProperty("has_activated_keys") HasActivatedKeys hasActivatedKeys,
			@JsonProperty("elo_min") Long eloMin,
			@JsonProperty("elo_max") Long eloMax,
			@JsonProperty("cs2_map_rank") Cs2MapRank cs2MapRank,
			@JsonProperty("cs2_map_rmin") Long cs2MapRmin,
			@JsonProperty("cs2_map_rmax") Long cs2MapRmax,
			@JsonProperty("has_faceit") HasFaceit hasFaceit,
			@JsonProperty("faceit_csgo_lvl_min") Long faceitCsgoLvlMin,
			@JsonProperty("faceit_csgo_lvl_max") Long faceitCsgoLvlMax,
			@JsonProperty("rust_deaths_min") Long rustDeathsMin,
			@JsonProperty("rust_deaths_max") Long rustDeathsMax,
			@JsonProperty("rust_kills_min") Long rustKillsMin,
			@JsonProperty("rust_kills_max") Long rustKillsMax,
			@JsonProperty("d2_last_match_date") Long d2LastMatchDate,
			@JsonProperty("d2_last_match_date_period") D2LastMatchDatePeriod d2LastMatchDatePeriod,
			@JsonProperty("cards_min") Long cardsMin,
			@JsonProperty("cards_max") Long cardsMax,
			@JsonProperty("cards_games_min") Long cardsGamesMin,
			@JsonProperty("cards_games_max") Long cardsGamesMax,
			@JsonProperty("skip_vac_inv") Boolean skipVacInv
		) {
			public CategorySteamParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Rt.NO, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponse(
			List<CategorySteamResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamFullGamesList730(
			long appid,
			@JsonProperty("playtime_forever") double playtimeForever,
			@JsonProperty("internal_game_id") long internalGameId,
			String abbr,
			String title,
			long parentGameId,
			String img
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamFullGamesList(
			@JsonProperty("730") CategorySteamResponseItemsSteamFullGamesList730 _730
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamFullGames(
			CategorySteamResponseItemsSteamFullGamesList list,
			long total
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			JsonNode endDate,
			JsonNode active,
			JsonNode cancelled,
			JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamData(
			@JsonProperty("steam_ban_type_id") List<JsonNode> steamBanTypeId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamTransactions(
			String date,
			String product,
			String type,
			String source,
			String amount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("steam_item_id") long steamItemId,
			@JsonProperty("steam_country") String steamCountry,
			@JsonProperty("steam_register_date") long steamRegisterDate,
			@JsonProperty("steam_last_activity") long steamLastActivity,
			@JsonProperty("steam_full_games") CategorySteamResponseItemsSteamFullGames steamFullGames,
			@JsonProperty("steam_community_ban") long steamCommunityBan,
			@JsonProperty("steam_bans") String steamBans,
			@JsonProperty("steam_cs2_profile_rank") long steamCs2ProfileRank,
			@JsonProperty("steam_balance") String steamBalance,
			@JsonProperty("steam_cs2_rank_id") long steamCs2RankId,
			@JsonProperty("steam_is_limited") long steamIsLimited,
			@JsonProperty("steam_level") long steamLevel,
			@JsonProperty("steam_friend_count") long steamFriendCount,
			@JsonProperty("steam_cs2_last_activity") long steamCs2LastActivity,
			@JsonProperty("steam_dota2_solo_mmr") long steamDota2SoloMmr,
			@JsonProperty("steam_cs2_ban_date") long steamCs2BanDate,
			@JsonProperty("steam_converted_balance") long steamConvertedBalance,
			@JsonProperty("steam_cards_count") long steamCardsCount,
			@JsonProperty("steam_cards_games") long steamCardsGames,
			@JsonProperty("steam_pubg_inv_value") long steamPubgInvValue,
			@JsonProperty("steam_cs2_inv_value") long steamCs2InvValue,
			@JsonProperty("steam_dota2_inv_value") long steamDota2InvValue,
			@JsonProperty("steam_tf2_inv_value") long steamTf2InvValue,
			@JsonProperty("steam_rust_inv_value") long steamRustInvValue,
			@JsonProperty("steam_cs2_wingman_rank_id") long steamCs2WingmanRankId,
			@JsonProperty("steam_game_count") long steamGameCount,
			@JsonProperty("steam_steam_inv_value") long steamSteamInvValue,
			@JsonProperty("steam_inv_value") long steamInvValue,
			@JsonProperty("steam_cs2_win_count") long steamCs2WinCount,
			@JsonProperty("steam_dota2_game_count") long steamDota2GameCount,
			@JsonProperty("steam_dota2_lose_count") long steamDota2LoseCount,
			@JsonProperty("steam_dota2_win_count") long steamDota2WinCount,
			@JsonProperty("steam_hours_played_recently") String steamHoursPlayedRecently,
			@JsonProperty("steam_faceit_level") long steamFaceitLevel,
			@JsonProperty("steam_points") long steamPoints,
			@JsonProperty("steam_last_transaction_date") long steamLastTransactionDate,
			@JsonProperty("steam_relevant_game_count") long steamRelevantGameCount,
			@JsonProperty("steam_gift_count") long steamGiftCount,
			@JsonProperty("steam_limit_spent") String steamLimitSpent,
			@JsonProperty("steam_dota2_behavior") long steamDota2Behavior,
			@JsonProperty("steam_mfa") long steamMfa,
			@JsonProperty("steam_market") long steamMarket,
			@JsonProperty("steam_market_restrictions") long steamMarketRestrictions,
			@JsonProperty("steam_market_ban_end_date") long steamMarketBanEndDate,
			@JsonProperty("steam_unturned_inv_value") long steamUnturnedInvValue,
			@JsonProperty("steam_cs2_last_launched") long steamCs2LastLaunched,
			@JsonProperty("steam_kf2_inv_value") long steamKf2InvValue,
			@JsonProperty("steam_dst_inv_value") long steamDstInvValue,
			@JsonProperty("steam_cs2_premier_elo") long steamCs2PremierElo,
			@JsonProperty("steam_has_activated_keys") long steamHasActivatedKeys,
			@JsonProperty("steam_cs2_ban_type") long steamCs2BanType,
			@JsonProperty("steam_rust_kill_player") long steamRustKillPlayer,
			@JsonProperty("steam_rust_deaths") long steamRustDeaths,
			@JsonProperty("steam_total_gifts_rub") long steamTotalGiftsRub,
			@JsonProperty("steam_total_refunds_rub") long steamTotalRefundsRub,
			@JsonProperty("steam_total_ingame_rub") long steamTotalIngameRub,
			@JsonProperty("steam_total_games_rub") long steamTotalGamesRub,
			@JsonProperty("steam_total_purchased_rub") long steamTotalPurchasedRub,
			@JsonProperty("steam_dota2_last_match_date") long steamDota2LastMatchDate,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			CategorySteamResponseItemsGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategorySteamResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			CategorySteamResponseItemsSteamData steamData,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean hasCs2,
			boolean hasDota2,
			boolean hasPubg,
			boolean hasTf2,
			boolean hasRust,
			@JsonProperty("steam_cs2_ban_date_active") boolean steamCs2BanDateActive,
			boolean dota2CalibrationWarning,
			boolean displayConvertedBalance,
			List<JsonNode> inventoryValue,
			List<JsonNode> steamCs2Medals,
			boolean cs2RankExpired,
			long steamDota2WinRate,
			List<CategorySteamResponseItemsSteamTransactions> steamTransactions,
			boolean hasPossibleBanInDota2,
			boolean chineseAccount,
			List<JsonNode> cs2MapsRanks,
			List<JsonNode> cs2PremierElo,
			boolean steamLifetimeTradeBan,
			boolean canViewAccountLink,
			List<CategorySteamResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategorySteamResponseItemsSeller seller
		) {}

		public record CategoryFortniteParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("temp_email") TempEmail tempEmail,
			@JsonProperty("item_domain") String itemDomain,
			CategoryEgFortnite eg,
			Long smin,
			Long smax,
			Long vbmin,
			Long vbmax,
			@JsonProperty("skin[]") JsonNode skin,
			@JsonProperty("pickaxe[]") JsonNode pickaxe,
			@JsonProperty("glider[]") JsonNode glider,
			@JsonProperty("dance[]") JsonNode dance,
			@JsonProperty("change_email") ChangeEmail changeEmail,
			@JsonProperty("platform[]") JsonNode platform,
			@JsonProperty("skins_shop_min") Long skinsShopMin,
			@JsonProperty("skins_shop_max") Long skinsShopMax,
			@JsonProperty("pickaxes_shop_min") Long pickaxesShopMin,
			@JsonProperty("pickaxes_shop_max") Long pickaxesShopMax,
			@JsonProperty("dances_shop_min") Long dancesShopMin,
			@JsonProperty("dances_shop_max") Long dancesShopMax,
			@JsonProperty("gliders_shop_min") Long glidersShopMin,
			@JsonProperty("gliders_shop_max") Long glidersShopMax,
			@JsonProperty("skins_shop_vbmin") Long skinsShopVbmin,
			@JsonProperty("skins_shop_vbmax") Long skinsShopVbmax,
			@JsonProperty("pickaxes_shop_vbmin") Long pickaxesShopVbmin,
			@JsonProperty("pickaxes_shop_vbmax") Long pickaxesShopVbmax,
			@JsonProperty("dances_shop_vbmin") Long dancesShopVbmin,
			@JsonProperty("dances_shop_vbmax") Long dancesShopVbmax,
			@JsonProperty("gliders_shop_vbmin") Long glidersShopVbmin,
			@JsonProperty("gliders_shop_vbmax") Long glidersShopVbmax,
			Bp bp,
			Long lmin,
			Long lmax,
			@JsonProperty("bp_lmin") Long bpLmin,
			@JsonProperty("bp_lmax") Long bpLmax,
			@JsonProperty("last_trans_date") Long lastTransDate,
			@JsonProperty("last_trans_date_period") LastTransDatePeriod lastTransDatePeriod,
			@JsonProperty("no_trans") Boolean noTrans,
			@JsonProperty("xbox_linkable") XboxLinkable xboxLinkable,
			@JsonProperty("psn_linkable") PsnLinkable psnLinkable,
			Long daybreak,
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("refund_credits_min") Long refundCreditsMin,
			@JsonProperty("refund_credits_max") Long refundCreditsMax,
			@JsonProperty("pickaxe_min") Long pickaxeMin,
			@JsonProperty("pickaxe_max") Long pickaxeMax,
			Long dmin,
			Long dmax,
			Long gmin,
			Long gmax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryFortniteParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponse(
			List<CategoryFortniteResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteSkins(
			String id,
			String title,
			String rarity,
			String type,
			@JsonProperty("from_shop") long fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortnitePickaxe(
			String id,
			String title,
			String rarity,
			String type,
			@JsonProperty("from_shop") long fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteDance(
			String id,
			String title,
			String rarity,
			String type,
			@JsonProperty("from_shop") long fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteGliders(
			String id,
			String title,
			String rarity,
			String type,
			@JsonProperty("from_shop") long fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortnitePastSeasons(
			long numWins,
			long seasonXp,
			boolean purchasedVIP,
			long survivorPrestige,
			long seasonLevel,
			long numLowBracket,
			long bookLevel,
			long numRoyalRoyales,
			long seasonNumber,
			long survivorTier,
			long numHighBracket
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteTransactions(
			long date,
			String title,
			String presentmentTotal,
			String orderType
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsShopCounts(
			long shopSkinsCount,
			long shopPickaxesCount,
			long shopDancesCount,
			long shopGlidersCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("fortnite_item_id") long fortniteItemId,
			@JsonProperty("fortnite_platform") String fortnitePlatform,
			@JsonProperty("fortnite_register_date") long fortniteRegisterDate,
			@JsonProperty("fortnite_last_activity") long fortniteLastActivity,
			@JsonProperty("fortnite_book_level") long fortniteBookLevel,
			@JsonProperty("fortnite_lifetime_wins") long fortniteLifetimeWins,
			@JsonProperty("fortnite_level") long fortniteLevel,
			@JsonProperty("fortnite_season_num") long fortniteSeasonNum,
			@JsonProperty("fortnite_books_purchased") long fortniteBooksPurchased,
			@JsonProperty("fortnite_balance") long fortniteBalance,
			@JsonProperty("fortnite_skin_count") long fortniteSkinCount,
			@JsonProperty("fortnite_change_email") long fortniteChangeEmail,
			@JsonProperty("fortnite_rl_purchases") long fortniteRlPurchases,
			@JsonProperty("fortnite_next_change_email_date") long fortniteNextChangeEmailDate,
			@JsonProperty("fortnite_last_trans_date") long fortniteLastTransDate,
			@JsonProperty("fortnite_xbox_linkable") long fortniteXboxLinkable,
			@JsonProperty("fortnite_psn_linkable") long fortnitePsnLinkable,
			@JsonProperty("fortnite_shop_skins_count") long fortniteShopSkinsCount,
			@JsonProperty("fortnite_shop_pickaxes_count") long fortniteShopPickaxesCount,
			@JsonProperty("fortnite_shop_dances_count") long fortniteShopDancesCount,
			@JsonProperty("fortnite_shop_gliders_count") long fortniteShopGlidersCount,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryFortniteResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			List<CategoryFortniteResponseItemsFortniteSkins> fortniteSkins,
			List<CategoryFortniteResponseItemsFortnitePickaxe> fortnitePickaxe,
			List<CategoryFortniteResponseItemsFortniteDance> fortniteDance,
			List<CategoryFortniteResponseItemsFortniteGliders> fortniteGliders,
			@JsonProperty("fortnite_pickaxe_count") long fortnitePickaxeCount,
			@JsonProperty("fortnite_dance_count") long fortniteDanceCount,
			@JsonProperty("fortnite_glider_count") long fortniteGliderCount,
			List<CategoryFortniteResponseItemsFortnitePastSeasons> fortnitePastSeasons,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			List<CategoryFortniteResponseItemsFortniteTransactions> fortniteTransactions,
			String domain,
			CategoryFortniteResponseItemsShopCounts shopCounts,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryFortniteResponseItemsSeller seller
		) {}

		public record CategoryMihoyoParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("item_domain") String itemDomain,
			Email email,
			Ea ea,
			JsonNode region,
			@JsonProperty("not_region") JsonNode notRegion,
			@JsonProperty("genshin_character[]") JsonNode genshinCharacter,
			@JsonProperty("genshin_character_constellations") Map<String, Long> genshinCharacterConstellations,
			@JsonProperty("genshin_character_constellations_max") Map<String, Long> genshinCharacterConstellationsMax,
			@JsonProperty("genshin_weapon[]") JsonNode genshinWeapon,
			@JsonProperty("genshin_char_min") Long genshinCharMin,
			@JsonProperty("genshin_char_max") Long genshinCharMax,
			@JsonProperty("genshin_legendary_min") Long genshinLegendaryMin,
			@JsonProperty("genshin_legendary_max") Long genshinLegendaryMax,
			@JsonProperty("genshin_level_min") Long genshinLevelMin,
			@JsonProperty("genshin_level_max") Long genshinLevelMax,
			@JsonProperty("genshin_legendary_weapon_min") Long genshinLegendaryWeaponMin,
			@JsonProperty("genshin_legendary_weapon_max") Long genshinLegendaryWeaponMax,
			@JsonProperty("constellations_min") Long constellationsMin,
			@JsonProperty("constellations_max") Long constellationsMax,
			@JsonProperty("genshin_achievement_min") Long genshinAchievementMin,
			@JsonProperty("genshin_achievement_max") Long genshinAchievementMax,
			@JsonProperty("genshin_currency_min") Long genshinCurrencyMin,
			@JsonProperty("genshin_currency_max") Long genshinCurrencyMax,
			@JsonProperty("honkai_character[]") JsonNode honkaiCharacter,
			@JsonProperty("honkai_character_eidolons") Map<String, Long> honkaiCharacterEidolons,
			@JsonProperty("honkai_character_eidolons_max") Map<String, Long> honkaiCharacterEidolonsMax,
			@JsonProperty("honkai_weapon[]") JsonNode honkaiWeapon,
			@JsonProperty("honkai_char_min") Long honkaiCharMin,
			@JsonProperty("honkai_char_max") Long honkaiCharMax,
			@JsonProperty("honkai_legendary_min") Long honkaiLegendaryMin,
			@JsonProperty("honkai_legendary_max") Long honkaiLegendaryMax,
			@JsonProperty("honkai_level_min") Long honkaiLevelMin,
			@JsonProperty("honkai_level_max") Long honkaiLevelMax,
			@JsonProperty("honkai_legendary_weapon_min") Long honkaiLegendaryWeaponMin,
			@JsonProperty("honkai_legendary_weapon_max") Long honkaiLegendaryWeaponMax,
			@JsonProperty("eidolons_min") Long eidolonsMin,
			@JsonProperty("eidolons_max") Long eidolonsMax,
			@JsonProperty("honkai_achievement_min") Long honkaiAchievementMin,
			@JsonProperty("honkai_achievement_max") Long honkaiAchievementMax,
			@JsonProperty("honkai_currency_min") Long honkaiCurrencyMin,
			@JsonProperty("honkai_currency_max") Long honkaiCurrencyMax,
			@JsonProperty("zenless_character[]") JsonNode zenlessCharacter,
			@JsonProperty("zenless_character_cinemas") Map<String, Long> zenlessCharacterCinemas,
			@JsonProperty("zenless_character_cinemas_max") Map<String, Long> zenlessCharacterCinemasMax,
			@JsonProperty("zenless_weapon[]") JsonNode zenlessWeapon,
			@JsonProperty("zenless_legendary_min") Long zenlessLegendaryMin,
			@JsonProperty("zenless_legendary_max") Long zenlessLegendaryMax,
			@JsonProperty("cinemas_min") Long cinemasMin,
			@JsonProperty("cinemas_max") Long cinemasMax,
			@JsonProperty("zenless_legendary_weapon_min") Long zenlessLegendaryWeaponMin,
			@JsonProperty("zenless_legendary_weapon_max") Long zenlessLegendaryWeaponMax,
			@JsonProperty("zenless_char_min") Long zenlessCharMin,
			@JsonProperty("zenless_char_max") Long zenlessCharMax,
			@JsonProperty("zenless_level_min") Long zenlessLevelMin,
			@JsonProperty("zenless_level_max") Long zenlessLevelMax,
			@JsonProperty("zenless_achievement_min") Long zenlessAchievementMin,
			@JsonProperty("zenless_achievement_max") Long zenlessAchievementMax,
			@JsonProperty("zenless_currency_min") Long zenlessCurrencyMin,
			@JsonProperty("zenless_currency_max") Long zenlessCurrencyMax,
			Long daybreak
		) {
			public CategoryMihoyoParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponse(
			List<CategoryMihoyoResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsMihoyoLinkedAccounts(
			List<String> links,
			boolean legacy
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersEquip(
			long id,
			long level,
			long rank,
			String name,
			String desc,
			String icon,
			long rarity
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty(
			@JsonProperty("property_type") long propertyType,
			String value,
			long times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties(
			@JsonProperty("property_type") long propertyType,
			String value,
			long times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelics(
			long id,
			long level,
			long pos,
			String name,
			String desc,
			String icon,
			long rarity,
			@JsonProperty("main_property") CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty mainProperty,
			List<CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties> properties
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty(
			@JsonProperty("property_type") long propertyType,
			String value,
			long times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties(
			@JsonProperty("property_type") long propertyType,
			String value,
			long times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnaments(
			long id,
			long level,
			long pos,
			String name,
			String desc,
			String icon,
			long rarity,
			@JsonProperty("main_property") CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty mainProperty,
			List<CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties> properties
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharacters(
			long id,
			long level,
			String name,
			String element,
			String icon,
			long rarity,
			long rank,
			String image,
			CategoryMihoyoResponseItemsHonkaiCharactersEquip equip,
			List<CategoryMihoyoResponseItemsHonkaiCharactersRelics> relics,
			List<CategoryMihoyoResponseItemsHonkaiCharactersOrnaments> ornaments,
			@JsonProperty("base_type") long baseType,
			@JsonProperty("figure_path") String figurePath,
			String elementImage
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharactersWeapon(
			long id,
			String name,
			String icon,
			long type,
			long rarity,
			long level,
			@JsonProperty("promote_level") long promoteLevel,
			@JsonProperty("type_name") String typeName,
			String desc,
			@JsonProperty("affix_level") long affixLevel
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharactersReliquaries(
			long id,
			String name,
			String icon,
			long pos,
			long rarity,
			long level,
			@JsonProperty("pos_name") String posName
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharacters(
			long id,
			String image,
			String icon,
			String name,
			String element,
			long fetter,
			long level,
			long rarity,
			CategoryMihoyoResponseItemsGenshinCharactersWeapon weapon,
			List<CategoryMihoyoResponseItemsGenshinCharactersReliquaries> reliquaries,
			@JsonProperty("actived_constellation_num") long activedConstellationNum,
			List<JsonNode> costumes,
			JsonNode external,
			String background
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties(
			@JsonProperty("property_name") String propertyName,
			@JsonProperty("property_id") long propertyId,
			String base
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties(
			@JsonProperty("property_name") String propertyName,
			@JsonProperty("property_id") long propertyId,
			String base
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeapon(
			long id,
			long level,
			String name,
			long star,
			String icon,
			long rarity,
			List<CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties> properties,
			@JsonProperty("main_properties") List<CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties> mainProperties,
			@JsonProperty("talent_title") String talentTitle,
			@JsonProperty("talent_content") String talentContent,
			long profession,
			String starIcon,
			String rarityIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharacters(
			long id,
			long level,
			@JsonProperty("name_mi18n") String nameMi18n,
			@JsonProperty("full_name_mi18n") String fullNameMi18n,
			@JsonProperty("element_type") long elementType,
			@JsonProperty("camp_name_mi18n") String campNameMi18n,
			@JsonProperty("avatar_profession") long avatarProfession,
			long rarity,
			CategoryMihoyoResponseItemsZenlessCharactersWeapon weapon,
			long rank,
			String name,
			String rarityIcon,
			String elementIcon,
			String professionIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("mihoyo_item_id") long mihoyoItemId,
			@JsonProperty("mihoyo_id") long mihoyoId,
			@JsonProperty("mihoyo_email") long mihoyoEmail,
			@JsonProperty("mihoyo_has_linked_accounts") long mihoyoHasLinkedAccounts,
			@JsonProperty("mihoyo_region") String mihoyoRegion,
			@JsonProperty("mihoyo_last_activity") long mihoyoLastActivity,
			@JsonProperty("mihoyo_genshin_level") long mihoyoGenshinLevel,
			@JsonProperty("mihoyo_genshin_character_count") long mihoyoGenshinCharacterCount,
			@JsonProperty("mihoyo_genshin_achievement_count") long mihoyoGenshinAchievementCount,
			@JsonProperty("mihoyo_genshin_abyss_process") String mihoyoGenshinAbyssProcess,
			@JsonProperty("mihoyo_genshin_legendary_characters_count") long mihoyoGenshinLegendaryCharactersCount,
			@JsonProperty("mihoyo_genshin_constellations_count") long mihoyoGenshinConstellationsCount,
			@JsonProperty("mihoyo_genshin_legendary_weapons_count") long mihoyoGenshinLegendaryWeaponsCount,
			@JsonProperty("mihoyo_genshin_activity_days") long mihoyoGenshinActivityDays,
			@JsonProperty("mihoyo_genshin_currency") long mihoyoGenshinCurrency,
			@JsonProperty("mihoyo_honkai_level") long mihoyoHonkaiLevel,
			@JsonProperty("mihoyo_honkai_character_count") long mihoyoHonkaiCharacterCount,
			@JsonProperty("mihoyo_honkai_achievement_count") long mihoyoHonkaiAchievementCount,
			@JsonProperty("mihoyo_honkai_abyss_process") String mihoyoHonkaiAbyssProcess,
			@JsonProperty("mihoyo_honkai_legendary_characters_count") long mihoyoHonkaiLegendaryCharactersCount,
			@JsonProperty("mihoyo_honkai_eidolons_count") long mihoyoHonkaiEidolonsCount,
			@JsonProperty("mihoyo_honkai_legendary_weapons_count") long mihoyoHonkaiLegendaryWeaponsCount,
			@JsonProperty("mihoyo_honkai_activity_days") long mihoyoHonkaiActivityDays,
			@JsonProperty("mihoyo_honkai_currency") long mihoyoHonkaiCurrency,
			@JsonProperty("mihoyo_zenless_level") long mihoyoZenlessLevel,
			@JsonProperty("mihoyo_zenless_character_count") long mihoyoZenlessCharacterCount,
			@JsonProperty("mihoyo_zenless_achievement_count") long mihoyoZenlessAchievementCount,
			@JsonProperty("mihoyo_zenless_abyss_process") String mihoyoZenlessAbyssProcess,
			@JsonProperty("mihoyo_zenless_legendary_characters_count") long mihoyoZenlessLegendaryCharactersCount,
			@JsonProperty("mihoyo_zenless_cinemas_count") long mihoyoZenlessCinemasCount,
			@JsonProperty("mihoyo_zenless_legendary_weapons_count") long mihoyoZenlessLegendaryWeaponsCount,
			@JsonProperty("mihoyo_zenless_activity_days") long mihoyoZenlessActivityDays,
			@JsonProperty("mihoyo_zenless_currency") long mihoyoZenlessCurrency,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryMihoyoResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String mihoyoRegionPhrase,
			CategoryMihoyoResponseItemsMihoyoLinkedAccounts mihoyoLinkedAccounts,
			String mihoyoLinkedAccountsString,
			List<CategoryMihoyoResponseItemsHonkaiCharacters> honkaiCharacters,
			List<CategoryMihoyoResponseItemsGenshinCharacters> genshinCharacters,
			List<CategoryMihoyoResponseItemsZenlessCharacters> zenlessCharacters,
			boolean canViewAccountLink,
			List<CategoryMihoyoResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryMihoyoResponseItemsSeller seller
		) {}

		public record CategoryRiotParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Long rmin,
			Long rmax,
			@JsonProperty("last_rmin") Long lastRmin,
			@JsonProperty("last_rmax") Long lastRmax,
			@JsonProperty("previous_rmin") Long previousRmin,
			@JsonProperty("previous_rmax") Long previousRmax,
			@JsonProperty("weaponSkin[]") List<String> weaponSkin,
			@JsonProperty("buddy[]") List<String> buddy,
			@JsonProperty("agent[]") List<String> agent,
			@JsonProperty("champion[]") List<String> champion,
			@JsonProperty("skin[]") List<String> skin,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Long daybreak,
			@JsonProperty("valorant_level_min") Long valorantLevelMin,
			@JsonProperty("valorant_level_max") Long valorantLevelMax,
			@JsonProperty("lol_level_min") Long lolLevelMin,
			@JsonProperty("lol_level_max") Long lolLevelMax,
			@JsonProperty("inv_min") Long invMin,
			@JsonProperty("inv_max") Long invMax,
			@JsonProperty("vp_min") Long vpMin,
			@JsonProperty("vp_max") Long vpMax,
			@JsonProperty("valorant_smin") Long valorantSmin,
			@JsonProperty("valorant_smax") Long valorantSmax,
			@JsonProperty("valorant_rank_type[]") JsonNode valorantRankType,
			Long amin,
			Long amax,
			@JsonProperty("valorant_region[]") List<String> valorantRegion,
			@JsonProperty("valorant_not_region[]") List<String> valorantNotRegion,
			@JsonProperty("lol_region[]") List<String> lolRegion,
			@JsonProperty("lol_not_region[]") List<String> lolNotRegion,
			Boolean knife,
			@JsonProperty("lol_smin") Long lolSmin,
			@JsonProperty("lol_smax") Long lolSmax,
			@JsonProperty("champion_min") Long championMin,
			@JsonProperty("champion_max") Long championMax,
			@JsonProperty("win_rate_min") Long winRateMin,
			@JsonProperty("win_rate_max") Long winRateMax,
			@JsonProperty("blue_min") Long blueMin,
			@JsonProperty("blue_max") Long blueMax,
			@JsonProperty("orange_min") Long orangeMin,
			@JsonProperty("orange_max") Long orangeMax,
			@JsonProperty("mythic_min") Long mythicMin,
			@JsonProperty("mythic_max") Long mythicMax,
			@JsonProperty("riot_min") Long riotMin,
			@JsonProperty("riot_max") Long riotMax,
			Email email,
			Tel tel,
			@JsonProperty("valorant_knife_min") Long valorantKnifeMin,
			@JsonProperty("valorant_knife_max") Long valorantKnifeMax,
			@JsonProperty("rp_min") Long rpMin,
			@JsonProperty("rp_max") Long rpMax,
			@JsonProperty("fa_min") Long faMin,
			@JsonProperty("fa_max") Long faMax,
			@JsonProperty("lol_rank[]") JsonNode lolRank
		) {
			public CategoryRiotParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponse(
			List<CategoryRiotResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsValorantInventory(
			List<String> WeaponSkins,
			List<String> Agent,
			List<String> Buddy
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsLolInventory(
			List<Long> Champion,
			List<Long> Skin
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("riot_item_id") long riotItemId,
			@JsonProperty("riot_id") String riotId,
			@JsonProperty("riot_account_verified") long riotAccountVerified,
			@JsonProperty("riot_email_verified") long riotEmailVerified,
			@JsonProperty("riot_country") String riotCountry,
			@JsonProperty("riot_password_change") long riotPasswordChange,
			@JsonProperty("riot_phone_verified") long riotPhoneVerified,
			@JsonProperty("riot_last_activity") long riotLastActivity,
			@JsonProperty("riot_valorant_wallet_vp") long riotValorantWalletVp,
			@JsonProperty("riot_valorant_wallet_rp") long riotValorantWalletRp,
			@JsonProperty("riot_valorant_wallet_fa") long riotValorantWalletFa,
			@JsonProperty("riot_valorant_level") long riotValorantLevel,
			@JsonProperty("riot_username") String riotUsername,
			@JsonProperty("riot_valorant_rank") long riotValorantRank,
			@JsonProperty("riot_valorant_region") String riotValorantRegion,
			@JsonProperty("riot_valorant_skin_count") long riotValorantSkinCount,
			@JsonProperty("riot_valorant_agent_count") long riotValorantAgentCount,
			@JsonProperty("riot_valorant_previous_rank") long riotValorantPreviousRank,
			@JsonProperty("riot_valorant_last_rank") long riotValorantLastRank,
			@JsonProperty("riot_valorant_rank_type") String riotValorantRankType,
			@JsonProperty("riot_valorant_inventory_value") long riotValorantInventoryValue,
			@JsonProperty("riot_valorant_knife") long riotValorantKnife,
			@JsonProperty("riot_lol_region") String riotLolRegion,
			@JsonProperty("riot_lol_skin_count") long riotLolSkinCount,
			@JsonProperty("riot_lol_champion_count") long riotLolChampionCount,
			@JsonProperty("riot_lol_level") long riotLolLevel,
			@JsonProperty("riot_lol_wallet_blue") long riotLolWalletBlue,
			@JsonProperty("riot_lol_wallet_orange") long riotLolWalletOrange,
			@JsonProperty("riot_lol_wallet_mythic") long riotLolWalletMythic,
			@JsonProperty("riot_lol_wallet_riot") long riotLolWalletRiot,
			@JsonProperty("riot_lol_rank") String riotLolRank,
			@JsonProperty("riot_lol_rank_win_rate") long riotLolRankWinRate,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryRiotResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String valorantRegionPhrase,
			String valorantRankTitle,
			String valorantRankImgPath,
			String valorantPreviousRankTitle,
			String valorantLastRankTitle,
			String lolRegionPhrase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			CategoryRiotResponseItemsValorantInventory valorantInventory,
			CategoryRiotResponseItemsLolInventory lolInventory,
			boolean canViewAccountLink,
			List<CategoryRiotResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryRiotResponseItemsSeller seller
		) {}

		public record CategoryTelegramParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Spam spam,
			Password password,
			Premium premium,
			@JsonProperty("premium_expiration") Long premiumExpiration,
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Long daybreak,
			@JsonProperty("min_channels") Long minChannels,
			@JsonProperty("max_channels") Long maxChannels,
			@JsonProperty("min_chats") Long minChats,
			@JsonProperty("max_chats") Long maxChats,
			@JsonProperty("min_conversations") Long minConversations,
			@JsonProperty("max_conversations") Long maxConversations,
			@JsonProperty("min_admin") Long minAdmin,
			@JsonProperty("max_admin") Long maxAdmin,
			@JsonProperty("min_admin_sub") Long minAdminSub,
			@JsonProperty("max_admin_sub") Long maxAdminSub,
			@JsonProperty("dig_min") Long digMin,
			@JsonProperty("dig_max") Long digMax,
			@JsonProperty("min_contacts") Long minContacts,
			@JsonProperty("max_contacts") Long maxContacts,
			@JsonProperty("min_stars") Long minStars,
			@JsonProperty("max_stars") Long maxStars,
			Long birthday,
			@JsonProperty("birthday_period") BirthdayPeriod birthdayPeriod,
			@JsonProperty("birthday_after") Long birthdayAfter,
			@JsonProperty("birthday_after_period") BirthdayAfterPeriod birthdayAfterPeriod,
			@JsonProperty("min_id") Long minId,
			@JsonProperty("max_id") Long maxId,
			@JsonProperty("allow_geo_spamblock") Boolean allowGeoSpamblock,
			@JsonProperty("min_gifts") Long minGifts,
			@JsonProperty("max_gifts") Long maxGifts,
			@JsonProperty("min_nft_gifts") Long minNftGifts,
			@JsonProperty("max_nft_gifts") Long maxNftGifts,
			@JsonProperty("min_gifts_stars") Long minGiftsStars,
			@JsonProperty("max_gifts_stars") Long maxGiftsStars,
			@JsonProperty("min_gifts_convert_stars") Long minGiftsConvertStars,
			@JsonProperty("max_gifts_convert_stars") Long maxGiftsConvertStars,
			@JsonProperty("dc_id[]") List<Long> dcId,
			@JsonProperty("not_dc_id[]") List<Long> notDcId,
			Email email,
			@JsonProperty("min_bots") Long minBots,
			@JsonProperty("max_bots") Long maxBots,
			@JsonProperty("min_bot_active_users") Long minBotActiveUsers,
			@JsonProperty("max_bot_active_users") Long maxBotActiveUsers
		) {
			public CategoryTelegramParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponse(
			List<CategoryTelegramResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsTelegramGroupCounters(
			long chats,
			long channels,
			long conversations,
			long admin
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("telegram_item_id") long telegramItemId,
			@JsonProperty("telegram_country") String telegramCountry,
			@JsonProperty("telegram_last_seen") long telegramLastSeen,
			@JsonProperty("telegram_premium") long telegramPremium,
			@JsonProperty("telegram_stars_count") long telegramStarsCount,
			@JsonProperty("telegram_birthday") long telegramBirthday,
			@JsonProperty("telegram_password") long telegramPassword,
			@JsonProperty("telegram_premium_expires") long telegramPremiumExpires,
			@JsonProperty("telegram_spam_block") JsonNode telegramSpamBlock,
			@JsonProperty("telegram_channels_count") long telegramChannelsCount,
			@JsonProperty("telegram_chats_count") long telegramChatsCount,
			@JsonProperty("telegram_admin_count") long telegramAdminCount,
			@JsonProperty("telegram_admin_subs_count") long telegramAdminSubsCount,
			@JsonProperty("telegram_conversations_count") long telegramConversationsCount,
			@JsonProperty("telegram_id_count") long telegramIdCount,
			@JsonProperty("telegram_contacts_count") long telegramContactsCount,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryTelegramResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			@JsonProperty("telegram_group_counters") CategoryTelegramResponseItemsTelegramGroupCounters telegramGroupCounters,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryTelegramResponseItemsSeller seller
		) {}

		public record CategorySupercellParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Long daybreak,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			CategoryEgFortnite eg,
			Tel tel,
			@JsonProperty("brawl_level_min") Long brawlLevelMin,
			@JsonProperty("brawl_level_max") Long brawlLevelMax,
			@JsonProperty("brawl_cup_min") Long brawlCupMin,
			@JsonProperty("brawl_cup_max") Long brawlCupMax,
			@JsonProperty("brawl_wins_min") Long brawlWinsMin,
			@JsonProperty("brawl_wins_max") Long brawlWinsMax,
			@JsonProperty("brawl_pass") BrawlPass brawlPass,
			@JsonProperty("brawler[]") JsonNode brawler,
			@JsonProperty("brawlers_min") Long brawlersMin,
			@JsonProperty("brawlers_max") Long brawlersMax,
			@JsonProperty("legendary_brawlers_min") Long legendaryBrawlersMin,
			@JsonProperty("legendary_brawlers_max") Long legendaryBrawlersMax,
			@JsonProperty("royale_level_min") Long royaleLevelMin,
			@JsonProperty("royale_level_max") Long royaleLevelMax,
			@JsonProperty("royale_cup_min") Long royaleCupMin,
			@JsonProperty("royale_cup_max") Long royaleCupMax,
			@JsonProperty("royale_wins_min") Long royaleWinsMin,
			@JsonProperty("royale_wins_max") Long royaleWinsMax,
			@JsonProperty("king_level_min") Long kingLevelMin,
			@JsonProperty("king_level_max") Long kingLevelMax,
			@JsonProperty("royale_pass") RoyalePass royalePass,
			@JsonProperty("clash_level_min") Long clashLevelMin,
			@JsonProperty("clash_level_max") Long clashLevelMax,
			@JsonProperty("clash_cup_min") Long clashCupMin,
			@JsonProperty("clash_cup_max") Long clashCupMax,
			@JsonProperty("clash_wins_min") Long clashWinsMin,
			@JsonProperty("clash_wins_max") Long clashWinsMax,
			@JsonProperty("clash_pass") ClashPass clashPass,
			@JsonProperty("total_heroes_level_min") Long totalHeroesLevelMin,
			@JsonProperty("total_heroes_level_max") Long totalHeroesLevelMax,
			@JsonProperty("total_troops_level_min") Long totalTroopsLevelMin,
			@JsonProperty("total_troops_level_max") Long totalTroopsLevelMax,
			@JsonProperty("total_spells_level_min") Long totalSpellsLevelMin,
			@JsonProperty("total_spells_level_max") Long totalSpellsLevelMax,
			@JsonProperty("total_builder_heroes_level_min") Long totalBuilderHeroesLevelMin,
			@JsonProperty("total_builder_heroes_level_max") Long totalBuilderHeroesLevelMax,
			@JsonProperty("total_builder_troops_level_min") Long totalBuilderTroopsLevelMin,
			@JsonProperty("total_builder_troops_level_max") Long totalBuilderTroopsLevelMax,
			@JsonProperty("town_hall_level_min") Long townHallLevelMin,
			@JsonProperty("town_hall_level_max") Long townHallLevelMax,
			@JsonProperty("builder_hall_level_min") Long builderHallLevelMin,
			@JsonProperty("builder_hall_level_max") Long builderHallLevelMax,
			@JsonProperty("builder_hall_cup_min") Long builderHallCupMin,
			@JsonProperty("builder_hall_cup_max") Long builderHallCupMax,
			@JsonProperty("creation_year_min") Long creationYearMin,
			@JsonProperty("creation_year_max") Long creationYearMax
		) {
			public CategorySupercellParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponse(
			List<CategorySupercellResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("supercell_item_id") long supercellItemId,
			@JsonProperty("supercell_id") String supercellId,
			@JsonProperty("supercell_arena") String supercellArena,
			@JsonProperty("supercell_brawler_count") long supercellBrawlerCount,
			@JsonProperty("supercell_last_activity") long supercellLastActivity,
			@JsonProperty("supercell_legendary_brawler_count") long supercellLegendaryBrawlerCount,
			@JsonProperty("supercell_town_hall_level") long supercellTownHallLevel,
			@JsonProperty("supercell_builder_hall_level") long supercellBuilderHallLevel,
			@JsonProperty("supercell_builder_hall_cup_count") long supercellBuilderHallCupCount,
			@JsonProperty("supercell_phone") long supercellPhone,
			@JsonProperty("supercell_laser_level") long supercellLaserLevel,
			@JsonProperty("supercell_scroll_level") long supercellScrollLevel,
			@JsonProperty("supercell_magic_level") long supercellMagicLevel,
			@JsonProperty("supercell_laser_trophies") long supercellLaserTrophies,
			@JsonProperty("supercell_scroll_trophies") long supercellScrollTrophies,
			@JsonProperty("supercell_magic_trophies") long supercellMagicTrophies,
			@JsonProperty("supercell_laser_victories") long supercellLaserVictories,
			@JsonProperty("supercell_scroll_victories") long supercellScrollVictories,
			@JsonProperty("supercell_magic_victories") long supercellMagicVictories,
			@JsonProperty("supercell_laser_battle_pass") long supercellLaserBattlePass,
			@JsonProperty("supercell_scroll_battle_pass") long supercellScrollBattlePass,
			@JsonProperty("supercell_magic_battle_pass") long supercellMagicBattlePass,
			@JsonProperty("supercell_systems") String supercellSystems,
			@JsonProperty("supercell_king_level") long supercellKingLevel,
			@JsonProperty("supercell_total_heroes_level") long supercellTotalHeroesLevel,
			@JsonProperty("supercell_total_troops_level") long supercellTotalTroopsLevel,
			@JsonProperty("supercell_total_spells_level") long supercellTotalSpellsLevel,
			@JsonProperty("supercell_total_builder_heroes_level") long supercellTotalBuilderHeroesLevel,
			@JsonProperty("supercell_total_builder_troops_level") long supercellTotalBuilderTroopsLevel,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategorySupercellResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			List<JsonNode> supercellBrawlers,
			boolean canViewAccountLink,
			List<CategorySupercellResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategorySupercellResponseItemsSeller seller
		) {}

		public record CategoryEaParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Long gmin,
			Long gmax,
			@JsonProperty("al_rank_min") Long alRankMin,
			@JsonProperty("al_rank_max") Long alRankMax,
			@JsonProperty("al_level_min") Long alLevelMin,
			@JsonProperty("al_level_max") Long alLevelMax,
			@JsonProperty("has_ban") HasBan hasBan,
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			@JsonProperty("steam_connected") SteamConnected steamConnected,
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			CategorySubscription subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			@JsonProperty("hours_played_max") Map<String, Long> hoursPlayedMax,
			Transactions transactions
		) {
			public CategoryEaParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponse(
			List<CategoryEaResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsEaGamesApexLegends(
			@JsonProperty("game_id") String gameId,
			String title,
			@JsonProperty("last_activity") long lastActivity,
			@JsonProperty("total_played") long totalPlayed,
			String img
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsEaGames(
			@JsonProperty("apex-legends") CategoryEaResponseItemsEaGamesApexLegends apexLegends
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("ea_item_id") long eaItemId,
			@JsonProperty("ea_id") long eaId,
			@JsonProperty("ea_country") String eaCountry,
			@JsonProperty("ea_games") CategoryEaResponseItemsEaGames eaGames,
			@JsonProperty("ea_game_count") long eaGameCount,
			@JsonProperty("ea_last_activity") long eaLastActivity,
			@JsonProperty("ea_al_level") long eaAlLevel,
			@JsonProperty("ea_al_rank_score") long eaAlRankScore,
			@JsonProperty("ea_subscription") String eaSubscription,
			@JsonProperty("ea_subscription_end_date") long eaSubscriptionEndDate,
			@JsonProperty("ea_username") String eaUsername,
			@JsonProperty("ea_xbox_connected") long eaXboxConnected,
			@JsonProperty("ea_steam_connected") long eaSteamConnected,
			@JsonProperty("ea_psn_connected") long eaPsnConnected,
			@JsonProperty("ea_bans") List<JsonNode> eaBans,
			@JsonProperty("ea_has_ban") long eaHasBan,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryEaResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean canViewAccountLink,
			List<CategoryEaResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryEaResponseItemsSeller seller
		) {}

		public record CategoryWotParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Tel tel,
			Long daybreak,
			@JsonProperty("battles_min") Long battlesMin,
			@JsonProperty("battles_max") Long battlesMax,
			@JsonProperty("gold_min") Long goldMin,
			@JsonProperty("gold_max") Long goldMax,
			@JsonProperty("silver_min") Long silverMin,
			@JsonProperty("silver_max") Long silverMax,
			@JsonProperty("top_min") Long topMin,
			@JsonProperty("top_max") Long topMax,
			@JsonProperty("prem_min") Long premMin,
			@JsonProperty("prem_max") Long premMax,
			@JsonProperty("top_prem_min") Long topPremMin,
			@JsonProperty("top_prem_max") Long topPremMax,
			@JsonProperty("win_pmin") Long winPmin,
			@JsonProperty("win_pmax") Long winPmax,
			@JsonProperty("tank[]") List<Long> tank,
			@JsonProperty("region[]") JsonNode region,
			@JsonProperty("not_region[]") JsonNode notRegion,
			Premium premium,
			@JsonProperty("premium_expiration") Long premiumExpiration,
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			Clan clan,
			@JsonProperty("clan_role[]") JsonNode clanRole,
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			@JsonProperty("clan_gold_min") Long clanGoldMin,
			@JsonProperty("clan_gold_max") Long clanGoldMax,
			@JsonProperty("clan_credits_min") Long clanCreditsMin,
			@JsonProperty("clan_credits_max") Long clanCreditsMax,
			@JsonProperty("clan_crystal_min") Long clanCrystalMin,
			@JsonProperty("clan_crystal_max") Long clanCrystalMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryWotParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponse(
			List<CategoryWotResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsWotTanks00000(
			@JsonProperty("tank_id") Long tankId,
			@Nullable String name,
			@JsonProperty("is_premium") Long isPremium,
			@JsonProperty("image_url") @Nullable String imageUrl,
			@JsonProperty("short_name") @Nullable String shortName,
			Long tier
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsWotTanks(
			@JsonProperty("00000") CategoryWotResponseItemsWotTanks00000 _00000
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("wot_item_id") long wotItemId,
			@JsonProperty("wot_last_activity") long wotLastActivity,
			@JsonProperty("wot_register_date") long wotRegisterDate,
			@JsonProperty("wot_mobile") long wotMobile,
			@JsonProperty("wot_premium") long wotPremium,
			@JsonProperty("wot_premium_expires") long wotPremiumExpires,
			@JsonProperty("wot_gold") long wotGold,
			@JsonProperty("wot_credits") long wotCredits,
			@JsonProperty("wot_battle_count") long wotBattleCount,
			@JsonProperty("wot_win_count") long wotWinCount,
			@JsonProperty("wot_loss_count") long wotLossCount,
			@JsonProperty("wot_win_count_percents") long wotWinCountPercents,
			@JsonProperty("wot_top_tanks") long wotTopTanks,
			@JsonProperty("wot_premium_tanks") long wotPremiumTanks,
			@JsonProperty("wot_top_premium_tanks") long wotTopPremiumTanks,
			@JsonProperty("wot_region") String wotRegion,
			@JsonProperty("wot_blitz") long wotBlitz,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryWotResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String wotRegionPhrase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			CategoryWotResponseItemsWotTanks wotTanks,
			long wotPremiumTankCount,
			long wotTankCount,
			String wotLauncherTitle,
			@JsonProperty("wot_has_clan") boolean wotHasClan,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryWotResponseItemsSeller seller
		) {}

		public record CategoryWotBlitzParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Tel tel,
			Long daybreak,
			@JsonProperty("battles_min") Long battlesMin,
			@JsonProperty("battles_max") Long battlesMax,
			@JsonProperty("gold_min") Long goldMin,
			@JsonProperty("gold_max") Long goldMax,
			@JsonProperty("silver_min") Long silverMin,
			@JsonProperty("silver_max") Long silverMax,
			@JsonProperty("top_min") Long topMin,
			@JsonProperty("top_max") Long topMax,
			@JsonProperty("prem_min") Long premMin,
			@JsonProperty("prem_max") Long premMax,
			@JsonProperty("top_prem_min") Long topPremMin,
			@JsonProperty("top_prem_max") Long topPremMax,
			@JsonProperty("win_pmin") Long winPmin,
			@JsonProperty("win_pmax") Long winPmax,
			@JsonProperty("tank[]") List<Long> tank,
			@JsonProperty("region[]") JsonNode region,
			@JsonProperty("not_region[]") JsonNode notRegion,
			Premium premium,
			@JsonProperty("premium_expiration") Long premiumExpiration,
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			Clan clan,
			@JsonProperty("clan_role[]") JsonNode clanRole,
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			@JsonProperty("clan_gold_min") Long clanGoldMin,
			@JsonProperty("clan_gold_max") Long clanGoldMax,
			@JsonProperty("clan_credits_min") Long clanCreditsMin,
			@JsonProperty("clan_credits_max") Long clanCreditsMax,
			@JsonProperty("clan_crystal_min") Long clanCrystalMin,
			@JsonProperty("clan_crystal_max") Long clanCrystalMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry
		) {
			public CategoryWotBlitzParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponse(
			List<CategoryWotBlitzResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks12305(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6753(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18001(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6449(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks15697(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks4481(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks13185(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks14337(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks3681(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6145(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5425(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks3649(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7169(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7249(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7297(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19537(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5681(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6209(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks58641(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks16897(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10369(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks22817(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks9489(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks385(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19217(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks9297(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks13825(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5505(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks13089(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks12049(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks13569(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks4145(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks24321(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks23313(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20257(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks14609(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10289(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks14881(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks3937(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10785(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6929(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks16401(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks641(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20001(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks12545(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7953(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks25361(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20481(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks62737(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5137(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18753(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19025(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks13345(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks2945(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks16193(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18209(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19985(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19489(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20305(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20737(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks21329(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks53025(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18241(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10881(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks21265(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20513(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks12673(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks16705(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6785(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks58881(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18513(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks2849(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks9073(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks18769(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks15953(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6257(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6001(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks55297(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks23841(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks64529(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks21025(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks23057(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7281(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks23825(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks8753(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks59137(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10241(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks7793(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5745(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks11553(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks625(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks20817(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks23297(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks2625(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks19713(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks24849(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks56097(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks57105(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks54785(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks2609(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks57361(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks1409(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks55889(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5393(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks5489(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks53761(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks65377(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks54545(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks51473(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks10273(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks3121(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks4881(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks51729(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks4369(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks6993(
			@JsonProperty("tank_id") long tankId,
			String name,
			@JsonProperty("is_premium") long isPremium,
			@JsonProperty("image_url") String imageUrl,
			long tier,
			@JsonProperty("short_name") String shortName,
			@JsonProperty("is_collectible") long isCollectible
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsWotTanks(
			@JsonProperty("12305") CategoryWotBlitzResponseItemsWotTanks12305 _12305,
			@JsonProperty("6753") CategoryWotBlitzResponseItemsWotTanks6753 _6753,
			@JsonProperty("18001") CategoryWotBlitzResponseItemsWotTanks18001 _18001,
			@JsonProperty("6449") CategoryWotBlitzResponseItemsWotTanks6449 _6449,
			@JsonProperty("15697") CategoryWotBlitzResponseItemsWotTanks15697 _15697,
			@JsonProperty("4481") CategoryWotBlitzResponseItemsWotTanks4481 _4481,
			@JsonProperty("13185") CategoryWotBlitzResponseItemsWotTanks13185 _13185,
			@JsonProperty("14337") CategoryWotBlitzResponseItemsWotTanks14337 _14337,
			@JsonProperty("3681") CategoryWotBlitzResponseItemsWotTanks3681 _3681,
			@JsonProperty("6145") CategoryWotBlitzResponseItemsWotTanks6145 _6145,
			@JsonProperty("5425") CategoryWotBlitzResponseItemsWotTanks5425 _5425,
			@JsonProperty("3649") CategoryWotBlitzResponseItemsWotTanks3649 _3649,
			@JsonProperty("7169") CategoryWotBlitzResponseItemsWotTanks7169 _7169,
			@JsonProperty("7249") CategoryWotBlitzResponseItemsWotTanks7249 _7249,
			@JsonProperty("7297") CategoryWotBlitzResponseItemsWotTanks7297 _7297,
			@JsonProperty("19537") CategoryWotBlitzResponseItemsWotTanks19537 _19537,
			@JsonProperty("5681") CategoryWotBlitzResponseItemsWotTanks5681 _5681,
			@JsonProperty("6209") CategoryWotBlitzResponseItemsWotTanks6209 _6209,
			@JsonProperty("58641") CategoryWotBlitzResponseItemsWotTanks58641 _58641,
			@JsonProperty("16897") CategoryWotBlitzResponseItemsWotTanks16897 _16897,
			@JsonProperty("10369") CategoryWotBlitzResponseItemsWotTanks10369 _10369,
			@JsonProperty("22817") CategoryWotBlitzResponseItemsWotTanks22817 _22817,
			@JsonProperty("9489") CategoryWotBlitzResponseItemsWotTanks9489 _9489,
			@JsonProperty("385") CategoryWotBlitzResponseItemsWotTanks385 _385,
			@JsonProperty("19217") CategoryWotBlitzResponseItemsWotTanks19217 _19217,
			@JsonProperty("9297") CategoryWotBlitzResponseItemsWotTanks9297 _9297,
			@JsonProperty("13825") CategoryWotBlitzResponseItemsWotTanks13825 _13825,
			@JsonProperty("5505") CategoryWotBlitzResponseItemsWotTanks5505 _5505,
			@JsonProperty("13089") CategoryWotBlitzResponseItemsWotTanks13089 _13089,
			@JsonProperty("12049") CategoryWotBlitzResponseItemsWotTanks12049 _12049,
			@JsonProperty("13569") CategoryWotBlitzResponseItemsWotTanks13569 _13569,
			@JsonProperty("4145") CategoryWotBlitzResponseItemsWotTanks4145 _4145,
			@JsonProperty("24321") CategoryWotBlitzResponseItemsWotTanks24321 _24321,
			@JsonProperty("23313") CategoryWotBlitzResponseItemsWotTanks23313 _23313,
			@JsonProperty("20257") CategoryWotBlitzResponseItemsWotTanks20257 _20257,
			@JsonProperty("14609") CategoryWotBlitzResponseItemsWotTanks14609 _14609,
			@JsonProperty("10289") CategoryWotBlitzResponseItemsWotTanks10289 _10289,
			@JsonProperty("14881") CategoryWotBlitzResponseItemsWotTanks14881 _14881,
			@JsonProperty("3937") CategoryWotBlitzResponseItemsWotTanks3937 _3937,
			@JsonProperty("10785") CategoryWotBlitzResponseItemsWotTanks10785 _10785,
			@JsonProperty("6929") CategoryWotBlitzResponseItemsWotTanks6929 _6929,
			@JsonProperty("16401") CategoryWotBlitzResponseItemsWotTanks16401 _16401,
			@JsonProperty("641") CategoryWotBlitzResponseItemsWotTanks641 _641,
			@JsonProperty("20001") CategoryWotBlitzResponseItemsWotTanks20001 _20001,
			@JsonProperty("12545") CategoryWotBlitzResponseItemsWotTanks12545 _12545,
			@JsonProperty("7953") CategoryWotBlitzResponseItemsWotTanks7953 _7953,
			@JsonProperty("25361") CategoryWotBlitzResponseItemsWotTanks25361 _25361,
			@JsonProperty("20481") CategoryWotBlitzResponseItemsWotTanks20481 _20481,
			@JsonProperty("62737") CategoryWotBlitzResponseItemsWotTanks62737 _62737,
			@JsonProperty("5137") CategoryWotBlitzResponseItemsWotTanks5137 _5137,
			@JsonProperty("18753") CategoryWotBlitzResponseItemsWotTanks18753 _18753,
			@JsonProperty("19025") CategoryWotBlitzResponseItemsWotTanks19025 _19025,
			@JsonProperty("13345") CategoryWotBlitzResponseItemsWotTanks13345 _13345,
			@JsonProperty("2945") CategoryWotBlitzResponseItemsWotTanks2945 _2945,
			@JsonProperty("16193") CategoryWotBlitzResponseItemsWotTanks16193 _16193,
			@JsonProperty("18209") CategoryWotBlitzResponseItemsWotTanks18209 _18209,
			@JsonProperty("19985") CategoryWotBlitzResponseItemsWotTanks19985 _19985,
			@JsonProperty("19489") CategoryWotBlitzResponseItemsWotTanks19489 _19489,
			@JsonProperty("20305") CategoryWotBlitzResponseItemsWotTanks20305 _20305,
			@JsonProperty("20737") CategoryWotBlitzResponseItemsWotTanks20737 _20737,
			@JsonProperty("21329") CategoryWotBlitzResponseItemsWotTanks21329 _21329,
			@JsonProperty("53025") CategoryWotBlitzResponseItemsWotTanks53025 _53025,
			@JsonProperty("18241") CategoryWotBlitzResponseItemsWotTanks18241 _18241,
			@JsonProperty("10881") CategoryWotBlitzResponseItemsWotTanks10881 _10881,
			@JsonProperty("21265") CategoryWotBlitzResponseItemsWotTanks21265 _21265,
			@JsonProperty("20513") CategoryWotBlitzResponseItemsWotTanks20513 _20513,
			@JsonProperty("12673") CategoryWotBlitzResponseItemsWotTanks12673 _12673,
			@JsonProperty("16705") CategoryWotBlitzResponseItemsWotTanks16705 _16705,
			@JsonProperty("6785") CategoryWotBlitzResponseItemsWotTanks6785 _6785,
			@JsonProperty("58881") CategoryWotBlitzResponseItemsWotTanks58881 _58881,
			@JsonProperty("18513") CategoryWotBlitzResponseItemsWotTanks18513 _18513,
			@JsonProperty("2849") CategoryWotBlitzResponseItemsWotTanks2849 _2849,
			@JsonProperty("9073") CategoryWotBlitzResponseItemsWotTanks9073 _9073,
			@JsonProperty("18769") CategoryWotBlitzResponseItemsWotTanks18769 _18769,
			@JsonProperty("15953") CategoryWotBlitzResponseItemsWotTanks15953 _15953,
			@JsonProperty("6257") CategoryWotBlitzResponseItemsWotTanks6257 _6257,
			@JsonProperty("6001") CategoryWotBlitzResponseItemsWotTanks6001 _6001,
			@JsonProperty("55297") CategoryWotBlitzResponseItemsWotTanks55297 _55297,
			@JsonProperty("23841") CategoryWotBlitzResponseItemsWotTanks23841 _23841,
			@JsonProperty("64529") CategoryWotBlitzResponseItemsWotTanks64529 _64529,
			@JsonProperty("21025") CategoryWotBlitzResponseItemsWotTanks21025 _21025,
			@JsonProperty("23057") CategoryWotBlitzResponseItemsWotTanks23057 _23057,
			@JsonProperty("7281") CategoryWotBlitzResponseItemsWotTanks7281 _7281,
			@JsonProperty("23825") CategoryWotBlitzResponseItemsWotTanks23825 _23825,
			@JsonProperty("8753") CategoryWotBlitzResponseItemsWotTanks8753 _8753,
			@JsonProperty("59137") CategoryWotBlitzResponseItemsWotTanks59137 _59137,
			@JsonProperty("10241") CategoryWotBlitzResponseItemsWotTanks10241 _10241,
			@JsonProperty("7793") CategoryWotBlitzResponseItemsWotTanks7793 _7793,
			@JsonProperty("5745") CategoryWotBlitzResponseItemsWotTanks5745 _5745,
			@JsonProperty("11553") CategoryWotBlitzResponseItemsWotTanks11553 _11553,
			@JsonProperty("625") CategoryWotBlitzResponseItemsWotTanks625 _625,
			@JsonProperty("20817") CategoryWotBlitzResponseItemsWotTanks20817 _20817,
			@JsonProperty("23297") CategoryWotBlitzResponseItemsWotTanks23297 _23297,
			@JsonProperty("2625") CategoryWotBlitzResponseItemsWotTanks2625 _2625,
			@JsonProperty("19713") CategoryWotBlitzResponseItemsWotTanks19713 _19713,
			@JsonProperty("24849") CategoryWotBlitzResponseItemsWotTanks24849 _24849,
			@JsonProperty("56097") CategoryWotBlitzResponseItemsWotTanks56097 _56097,
			@JsonProperty("57105") CategoryWotBlitzResponseItemsWotTanks57105 _57105,
			@JsonProperty("54785") CategoryWotBlitzResponseItemsWotTanks54785 _54785,
			@JsonProperty("2609") CategoryWotBlitzResponseItemsWotTanks2609 _2609,
			@JsonProperty("57361") CategoryWotBlitzResponseItemsWotTanks57361 _57361,
			@JsonProperty("1409") CategoryWotBlitzResponseItemsWotTanks1409 _1409,
			@JsonProperty("55889") CategoryWotBlitzResponseItemsWotTanks55889 _55889,
			@JsonProperty("5393") CategoryWotBlitzResponseItemsWotTanks5393 _5393,
			@JsonProperty("5489") CategoryWotBlitzResponseItemsWotTanks5489 _5489,
			@JsonProperty("53761") CategoryWotBlitzResponseItemsWotTanks53761 _53761,
			@JsonProperty("65377") CategoryWotBlitzResponseItemsWotTanks65377 _65377,
			@JsonProperty("54545") CategoryWotBlitzResponseItemsWotTanks54545 _54545,
			@JsonProperty("51473") CategoryWotBlitzResponseItemsWotTanks51473 _51473,
			@JsonProperty("10273") CategoryWotBlitzResponseItemsWotTanks10273 _10273,
			@JsonProperty("3121") CategoryWotBlitzResponseItemsWotTanks3121 _3121,
			@JsonProperty("4881") CategoryWotBlitzResponseItemsWotTanks4881 _4881,
			@JsonProperty("51729") CategoryWotBlitzResponseItemsWotTanks51729 _51729,
			@JsonProperty("4369") CategoryWotBlitzResponseItemsWotTanks4369 _4369,
			@JsonProperty("6993") CategoryWotBlitzResponseItemsWotTanks6993 _6993
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("wot_item_id") long wotItemId,
			@JsonProperty("wot_last_activity") long wotLastActivity,
			@JsonProperty("wot_register_date") long wotRegisterDate,
			@JsonProperty("wot_mobile") long wotMobile,
			@JsonProperty("wot_premium") long wotPremium,
			@JsonProperty("wot_premium_expires") long wotPremiumExpires,
			@JsonProperty("wot_gold") long wotGold,
			@JsonProperty("wot_credits") long wotCredits,
			@JsonProperty("wot_battle_count") long wotBattleCount,
			@JsonProperty("wot_win_count") long wotWinCount,
			@JsonProperty("wot_loss_count") long wotLossCount,
			@JsonProperty("wot_win_count_percents") long wotWinCountPercents,
			@JsonProperty("wot_top_tanks") long wotTopTanks,
			@JsonProperty("wot_premium_tanks") long wotPremiumTanks,
			@JsonProperty("wot_top_premium_tanks") long wotTopPremiumTanks,
			@JsonProperty("wot_region") String wotRegion,
			@JsonProperty("wot_blitz") long wotBlitz,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryWotBlitzResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String wotRegionPhrase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			CategoryWotBlitzResponseItemsWotTanks wotTanks,
			long wotPremiumTankCount,
			long wotTankCount,
			String wotLauncherTitle,
			@JsonProperty("wot_has_clan") boolean wotHasClan,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryWotBlitzResponseItemsSeller seller
		) {}

		public record CategoryGiftsParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			CategorySubscriptionGifts subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod
		) {
			public CategoryGiftsParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponse(
			List<CategoryGiftsResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("gifts_item_id") long giftsItemId,
			@JsonProperty("gifts_service") String giftsService,
			@JsonProperty("gifts_duration") long giftsDuration,
			@JsonProperty("gifts_type") String giftsType,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryGiftsResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String giftsSubscriptionName,
			String giftsServiceName,
			boolean canViewAccountLink,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryGiftsResponseItemsSeller seller
		) {}

		public record CategoryEpicGamesParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			CategoryEgFortnite eg,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("change_email") ChangeEmail changeEmail,
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			@JsonProperty("balance_min") Double balanceMin,
			@JsonProperty("balance_max") Double balanceMax,
			@JsonProperty("rewards_balance_min") Double rewardsBalanceMin,
			@JsonProperty("rewards_balance_max") Double rewardsBalanceMax,
			Long gmin,
			Long gmax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Long daybreak,
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			@JsonProperty("hours_played_max") Map<String, Long> hoursPlayedMax
		) {
			public CategoryEpicGamesParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponse(
			List<CategoryEpicGamesResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsEgGames0(
			@JsonProperty("internal_game_id") long internalGameId,
			@JsonProperty("app_id") String appId,
			String title,
			String abbr,
			@JsonProperty("category_id") long categoryId,
			String img,
			String url,
			JsonNode ru,
			@JsonProperty("hits_count") long hitsCount,
			String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsEgGames(
			@JsonProperty("0") CategoryEpicGamesResponseItemsEgGames0 _0
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsEgTransactions(
			long date,
			String title,
			String presentmentTotal,
			String orderType
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("eg_item_id") long egItemId,
			@JsonProperty("eg_country") String egCountry,
			@JsonProperty("eg_code_redemption_history") List<JsonNode> egCodeRedemptionHistory,
			@JsonProperty("eg_coupons") List<JsonNode> egCoupons,
			@JsonProperty("eg_games") CategoryEpicGamesResponseItemsEgGames egGames,
			@JsonProperty("eg_change_email") long egChangeEmail,
			@JsonProperty("eg_can_update_display_name") long egCanUpdateDisplayName,
			@JsonProperty("eg_last_activity") long egLastActivity,
			@JsonProperty("eg_payment_methods") List<JsonNode> egPaymentMethods,
			@JsonProperty("eg_rl_purchases") long egRlPurchases,
			@JsonProperty("eg_username") String egUsername,
			@JsonProperty("eg_rewards_balance") long egRewardsBalance,
			@JsonProperty("eg_rewards_expiration_date") long egRewardsExpirationDate,
			@JsonProperty("eg_next_change_email_date") long egNextChangeEmailDate,
			@JsonProperty("eg_game_count") long egGameCount,
			@JsonProperty("eg_balance") long egBalance,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryEpicGamesResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			List<CategoryEpicGamesResponseItemsEgTransactions> egTransactions,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryEpicGamesResponseItemsSeller seller
		) {}

		public record CategoryEscapeFromTarkovParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Region region,
			@JsonProperty("version[]") JsonNode version,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("level_min") Long levelMin,
			@JsonProperty("level_max") Long levelMax,
			Pve pve,
			Side side
		) {
			public CategoryEscapeFromTarkovParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponse(
			List<CategoryEscapeFromTarkovResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("tarkov_item_id") long tarkovItemId,
			@JsonProperty("tarkov_game_version") String tarkovGameVersion,
			@JsonProperty("tarkov_register_date") long tarkovRegisterDate,
			@JsonProperty("tarkov_level") long tarkovLevel,
			@JsonProperty("tarkov_exp") long tarkovExp,
			@JsonProperty("tarkov_last_activity") long tarkovLastActivity,
			@JsonProperty("tarkov_side") String tarkovSide,
			@JsonProperty("tarkov_rubles") long tarkovRubles,
			@JsonProperty("tarkov_secured_container") String tarkovSecuredContainer,
			@JsonProperty("tarkov_euros") long tarkovEuros,
			@JsonProperty("tarkov_dollars") long tarkovDollars,
			@JsonProperty("tarkov_kd") long tarkovKd,
			@JsonProperty("tarkov_deaths") long tarkovDeaths,
			@JsonProperty("tarkov_kills") long tarkovKills,
			@JsonProperty("tarkov_sessions") long tarkovSessions,
			@JsonProperty("tarkov_region") String tarkovRegion,
			@JsonProperty("tarkov_total_in_game") long tarkovTotalInGame,
			@JsonProperty("tarkov_mail_forwarding") long tarkovMailForwarding,
			@JsonProperty("tarkov_username") String tarkovUsername,
			@JsonProperty("tarkov_purchase_date") long tarkovPurchaseDate,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryEscapeFromTarkovResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String tarkovRegionPhrase,
			String tarkovGameVersionPhrase,
			String accountDomain,
			boolean canViewAccountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryEscapeFromTarkovResponseItemsSeller seller
		) {}

		public record CategorySocialClubParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Long daybreak,
			@JsonProperty("level_min") Long levelMin,
			@JsonProperty("level_max") Long levelMax,
			@JsonProperty("cash_min") Long cashMin,
			@JsonProperty("cash_max") Long cashMax,
			@JsonProperty("bank_cash_min") Long bankCashMin,
			@JsonProperty("bank_cash_max") Long bankCashMax,
			@JsonProperty("game[]") List<String> game
		) {
			public CategorySocialClubParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponse(
			List<CategorySocialClubResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsSocialclubGames(
			long id,
			String name,
			String defaultPlatform,
			String platform,
			String lastSeen,
			@JsonProperty("internal_game_id") long internalGameId,
			@JsonProperty("app_id") String appId,
			String title,
			String abbr,
			@JsonProperty("category_id") long categoryId,
			String img,
			String url,
			JsonNode ru
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("socialclub_item_id") long socialclubItemId,
			@JsonProperty("socialclub_level") long socialclubLevel,
			@JsonProperty("socialclub_cash") long socialclubCash,
			@JsonProperty("socialclub_bank_cash") long socialclubBankCash,
			@JsonProperty("socialclub_games") List<CategorySocialClubResponseItemsSocialclubGames> socialclubGames,
			@JsonProperty("socialclub_last_activity") long socialclubLastActivity,
			@JsonProperty("socialclub_has_gtav") long socialclubHasGtav,
			@JsonProperty("socialclub_has_rdr2") long socialclubHasRdr2,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategorySocialClubResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategorySocialClubResponseItemsSeller seller
		) {}

		public record CategoryUplayParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("game[]") List<String> game,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Long daybreak,
			Long gmin,
			Long gmax,
			CategorySubscriptionUplay subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			@JsonProperty("r6_level_min") Long r6LevelMin,
			@JsonProperty("r6_level_max") Long r6LevelMax,
			@JsonProperty("r6_rank_min") Long r6RankMin,
			@JsonProperty("r6_rank_max") Long r6RankMax,
			@JsonProperty("r6_operators_min") Long r6OperatorsMin,
			@JsonProperty("r6_operators_max") Long r6OperatorsMax,
			@JsonProperty("r6_ban") R6Ban r6Ban,
			@JsonProperty("r6_smin") Long r6Smin,
			@JsonProperty("r6_smax") Long r6Smax,
			@JsonProperty("r6_skin[]") List<String> r6Skin,
			@JsonProperty("r6_operator[]") List<String> r6Operator,
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			@JsonProperty("steam_connected") SteamConnected steamConnected,
			@JsonProperty("balance_min") Double balanceMin,
			@JsonProperty("balance_max") Double balanceMax,
			Transactions transactions,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod
		) {
			public CategoryUplayParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponse(
			List<CategoryUplayResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff(
			String title,
			String img,
			long pvpTimePlayed,
			long pveTimePlayed,
			String abbr,
			String gameId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsUplayGames(
			@JsonProperty("ffffffff-ffff-ffff-ffff-ffffffffffff") CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff ffffffffFfffFfffFfffFfffffffffff
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsR6Operators(
			String img,
			String name,
			String url
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("uplay_item_id") long uplayItemId,
			@JsonProperty("uplay_last_activity") long uplayLastActivity,
			@JsonProperty("uplay_country") String uplayCountry,
			@JsonProperty("uplay_created_date") long uplayCreatedDate,
			@JsonProperty("uplay_games") CategoryUplayResponseItemsUplayGames uplayGames,
			@JsonProperty("uplay_game_count") long uplayGameCount,
			@JsonProperty("uplay_r6_level") long uplayR6Level,
			@JsonProperty("uplay_r6_ban") long uplayR6Ban,
			@JsonProperty("uplay_r6_operators") String uplayR6Operators,
			@JsonProperty("uplay_r6_operators_count") long uplayR6OperatorsCount,
			@JsonProperty("uplay_r6_skins") String uplayR6Skins,
			@JsonProperty("uplay_r6_skins_count") long uplayR6SkinsCount,
			@JsonProperty("uplay_subscription") String uplaySubscription,
			@JsonProperty("uplay_subscription_end_date") long uplaySubscriptionEndDate,
			@JsonProperty("uplay_xbox_connected") long uplayXboxConnected,
			@JsonProperty("uplay_psn_connected") long uplayPsnConnected,
			@JsonProperty("uplay_steam_connected") long uplaySteamConnected,
			@JsonProperty("uplay_r6_rank") long uplayR6Rank,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryUplayResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String uplayLinkedAccounts,
			@JsonProperty("uplay_r6_steam_warning") boolean uplayR6SteamWarning,
			@JsonProperty("uplay_r6_external_warning") boolean uplayR6ExternalWarning,
			@JsonProperty("uplay_r6") boolean uplayR6,
			@JsonProperty("uplay_r6_ban_active") boolean uplayR6BanActive,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			List<JsonNode> r6Skins,
			List<CategoryUplayResponseItemsR6Operators> r6Operators,
			boolean canViewAccountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryUplayResponseItemsSeller seller
		) {}

		public record CategoryDiscordParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Tel tel,
			Nitro nitro,
			@JsonProperty("nitro_type[]") JsonNode nitroType,
			@JsonProperty("nitro_length") Long nitroLength,
			@JsonProperty("nitro_period") NitroPeriod nitroPeriod,
			@JsonProperty("boosts_min") Long boostsMin,
			@JsonProperty("boosts_max") Long boostsMax,
			Billing billing,
			Gifts gifts,
			Transactions transactions,
			@JsonProperty("badge[]") JsonNode badge,
			@JsonProperty("condition[]") JsonNode condition,
			@JsonProperty("chat_min") Long chatMin,
			@JsonProperty("chat_max") Long chatMax,
			@JsonProperty("min_admin_members") Long minAdminMembers,
			@JsonProperty("max_admin_members") Long maxAdminMembers,
			@JsonProperty("min_admin") Long minAdmin,
			@JsonProperty("max_admin") Long maxAdmin,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("language[]") List<String> language,
			@JsonProperty("not_language[]") List<String> notLanguage,
			Clans clans,
			@JsonProperty("min_admin_clans") Long minAdminClans,
			@JsonProperty("max_admin_clans") Long maxAdminClans,
			@JsonProperty("min_owner_clans") Long minOwnerClans,
			@JsonProperty("max_owner_clans") Long maxOwnerClans,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("min_servers") Long minServers,
			@JsonProperty("max_servers") Long maxServers,
			@JsonProperty("2fa") _2fa _2fa,
			@JsonProperty("min_full_credits") Long minFullCredits,
			@JsonProperty("max_full_credits") Long maxFullCredits,
			@JsonProperty("min_basic_credits") Long minBasicCredits,
			@JsonProperty("max_basic_credits") Long maxBasicCredits,
			@JsonProperty("min_orbs") Long minOrbs,
			@JsonProperty("max_orbs") Long maxOrbs
		) {
			public CategoryDiscordParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponse(
			List<CategoryDiscordResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("discord_item_id") long discordItemId,
			@JsonProperty("discord_chat_count") long discordChatCount,
			@JsonProperty("discord_verified") long discordVerified,
			@JsonProperty("discord_condition") String discordCondition,
			@JsonProperty("discord_gifts") long discordGifts,
			@JsonProperty("discord_billing") long discordBilling,
			@JsonProperty("discord_register_date") long discordRegisterDate,
			@JsonProperty("discord_locale") String discordLocale,
			@JsonProperty("discord_nitro_end_date") long discordNitroEndDate,
			@JsonProperty("discord_available_boosts") long discordAvailableBoosts,
			@JsonProperty("discord_nitro_type") long discordNitroType,
			@JsonProperty("discord_admin_members_count") long discordAdminMembersCount,
			@JsonProperty("discord_admin_servers_count") long discordAdminServersCount,
			@JsonProperty("discord_admin_servers") String discordAdminServers,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryDiscordResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String discordAccountConditionLabel,
			String discordLocaleTitle,
			boolean canViewAccountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryDiscordResponseItemsSeller seller
		) {}

		public record CategoryTikTokParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Tel tel,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("followers_min") Long followersMin,
			@JsonProperty("followers_max") Long followersMax,
			@JsonProperty("post_min") Long postMin,
			@JsonProperty("post_max") Long postMax,
			@JsonProperty("like_min") Long likeMin,
			@JsonProperty("like_max") Long likeMax,
			@JsonProperty("coins_min") Long coinsMin,
			@JsonProperty("coins_max") Long coinsMax,
			@JsonProperty("cookie_login") CookieLogin cookieLogin,
			Verified verified,
			Email email
		) {
			public CategoryTikTokParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponse(
			List<CategoryTikTokResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("tt_item_id") long ttItemId,
			@JsonProperty("tt_id") long ttId,
			@JsonProperty("tt_permalink") String ttPermalink,
			@JsonProperty("tt_uniqueId") String ttUniqueId,
			@JsonProperty("tt_verified") long ttVerified,
			@JsonProperty("tt_createTime") long ttCreateTime,
			@JsonProperty("tt_privateAccount") long ttPrivateAccount,
			@JsonProperty("tt_followers") long ttFollowers,
			@JsonProperty("tt_following") long ttFollowing,
			@JsonProperty("tt_likes") long ttLikes,
			@JsonProperty("tt_videos") long ttVideos,
			@JsonProperty("tt_screen_name") String ttScreenName,
			@JsonProperty("tt_hasEmail") long ttHasEmail,
			@JsonProperty("tt_hasMobile") long ttHasMobile,
			@JsonProperty("tt_top_country") String ttTopCountry,
			@JsonProperty("tt_countries") String ttCountries,
			@JsonProperty("tt_coins") long ttCoins,
			@JsonProperty("tt_hasLivePermission") long ttHasLivePermission,
			@JsonProperty("tt_cookie_login") long ttCookieLogin,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryTikTokResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean canViewAccountLink,
			List<CategoryTikTokResponseItemsAccountLinks> accountLinks,
			String accountLink,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryTikTokResponseItemsSeller seller
		) {}

		public record CategoryInstagramParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			Tel tel,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Cookies cookies,
			@JsonProperty("login_without_cookies") LoginWithoutCookies loginWithoutCookies,
			@JsonProperty("followers_min") Long followersMin,
			@JsonProperty("followers_max") Long followersMax,
			@JsonProperty("post_min") Long postMin,
			@JsonProperty("post_max") Long postMax,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod
		) {
			public CategoryInstagramParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponse(
			List<CategoryInstagramResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("instagram_item_id") long instagramItemId,
			@JsonProperty("instagram_id") String instagramId,
			@JsonProperty("instagram_follower_count") long instagramFollowerCount,
			@JsonProperty("instagram_follow_count") long instagramFollowCount,
			@JsonProperty("instagram_post_count") long instagramPostCount,
			@JsonProperty("instagram_country") String instagramCountry,
			@JsonProperty("instagram_username") String instagramUsername,
			@JsonProperty("instagram_mobile") long instagramMobile,
			@JsonProperty("instagram_register_date") long instagramRegisterDate,
			@JsonProperty("instagram_has_cookies") long instagramHasCookies,
			@JsonProperty("instagram_login_without_cookies") long instagramLoginWithoutCookies,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryInstagramResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean canViewAccountLink,
			List<CategoryInstagramResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryInstagramResponseItemsSeller seller
		) {}

		public record CategoryBattleNetParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			CategoryEgBattleNet eg,
			@JsonProperty("game[]") List<Long> game,
			Long daybreak,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			Tel tel,
			@JsonProperty("edit_btag") EditBtag editBtag,
			@JsonProperty("changeable_fn") ChangeableFn changeableFn,
			@JsonProperty("real_id") RealId realId,
			@JsonProperty("parent_control") ParentControl parentControl,
			@JsonProperty("no_bans") NoBans noBans,
			@JsonProperty("balance_min") Long balanceMin,
			@JsonProperty("balance_max") Long balanceMax
		) {
			public CategoryBattleNetParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponse(
			List<CategoryBattleNetResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			JsonNode endDate,
			JsonNode active,
			JsonNode cancelled,
			JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBattlenetGames17459(
			@JsonProperty("internal_game_id") long internalGameId,
			@JsonProperty("app_id") String appId,
			String title,
			String abbr,
			@JsonProperty("category_id") long categoryId,
			String img,
			String url,
			JsonNode ru
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBattlenetGames(
			@JsonProperty("17459") CategoryBattleNetResponseItemsBattlenetGames17459 _17459
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBattlenetTransactions(
			long date,
			String productTitle,
			String formattedTotal,
			String total
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("battlenet_item_id") long battlenetItemId,
			@JsonProperty("battlenet_balance") String battlenetBalance,
			@JsonProperty("battlenet_country") String battlenetCountry,
			@JsonProperty("battlenet_last_activity") long battlenetLastActivity,
			@JsonProperty("battlenet_mobile") long battlenetMobile,
			@JsonProperty("battlenet_bans") String battlenetBans,
			@JsonProperty("battlenet_can_change_tag") long battlenetCanChangeTag,
			@JsonProperty("battlenet_real_id_enabled") long battlenetRealIdEnabled,
			@JsonProperty("battlenet_change_full_name") long battlenetChangeFullName,
			@JsonProperty("battlenet_parent_control") long battlenetParentControl,
			@JsonProperty("battlenet_converted_balance") long battlenetConvertedBalance,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			CategoryBattleNetResponseItemsGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryBattleNetResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			CategoryBattleNetResponseItemsBattlenetGames battlenetGames,
			boolean hasOverwatch,
			List<CategoryBattleNetResponseItemsBattlenetTransactions> battlenetTransactions,
			boolean displayConvertedBalance,
			boolean canViewAccountLink,
			List<JsonNode> accountLinks,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryBattleNetResponseItemsSeller seller
		) {}

		public record CategoryChatGPTParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("email_type[]") JsonNode emailType,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("subscription[]") JsonNode subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			Autorenewal autorenewal,
			Tel tel,
			Transactions transactions,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("openai_tier[]") JsonNode openaiTier,
			@JsonProperty("openai_balance_min") Long openaiBalanceMin,
			@JsonProperty("openai_balance_max") Long openaiBalanceMax
		) {
			public CategoryChatGPTParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponse(
			List<CategoryChatGPTResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsCopyFormatData(
			@JsonProperty("title_link") String titleLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("chatgpt_item_id") long chatgptItemId,
			@JsonProperty("chatgpt_country") String chatgptCountry,
			@JsonProperty("chatgpt_register_date") long chatgptRegisterDate,
			@JsonProperty("chatgpt_phone") long chatgptPhone,
			@JsonProperty("chatgpt_subscription") String chatgptSubscription,
			@JsonProperty("chatgpt_subscription_ends") long chatgptSubscriptionEnds,
			@JsonProperty("chatgpt_subscription_auto_renew") long chatgptSubscriptionAutoRenew,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			double priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewItemViews,
			boolean canViewEmailLoginData,
			CategoryChatGPTResponseItemsCopyFormatData copyFormatData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryChatGPTResponseItemsBumpSettings bumpSettings,
			boolean isPersonalAccount,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			String priceWithSellerFeeLabel,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String gptSubType,
			boolean canViewAccountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			boolean canChangeEmailPassword,
			boolean uniqueKeyExists,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryChatGPTResponseItemsSeller seller
		) {}

		public record CategoryVpnParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("service[]") JsonNode service,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			Autorenewal autorenewal
		) {
			public CategoryVpnParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponse(
			List<CategoryVpnResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("vpn_item_id") long vpnItemId,
			@JsonProperty("vpn_service") String vpnService,
			@JsonProperty("vpn_expire_date") long vpnExpireDate,
			@JsonProperty("vpn_renewable") long vpnRenewable,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryVpnResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String vpnProductTitle,
			boolean canViewAccountLink,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryVpnResponseItemsSeller seller
		) {}

		public record CategoryRobloxParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			Email email,
			@JsonProperty("robux_min") Long robuxMin,
			@JsonProperty("robux_max") Long robuxMax,
			@JsonProperty("friends_min") Long friendsMin,
			@JsonProperty("friends_max") Long friendsMax,
			@JsonProperty("followers_min") Long followersMin,
			@JsonProperty("followers_max") Long followersMax,
			List<String> country,
			@JsonProperty("not_country") List<String> notCountry,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			CategorySubscriptionRoblox subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			Autorenewal autorenewal,
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			Verified verified,
			@JsonProperty("age_verified") AgeVerified ageVerified,
			@JsonProperty("incoming_robux_total_min") Long incomingRobuxTotalMin,
			@JsonProperty("incoming_robux_total_max") Long incomingRobuxTotalMax,
			@JsonProperty("limited_price_min") Long limitedPriceMin,
			@JsonProperty("limited_price_max") Long limitedPriceMax,
			@JsonProperty("gamepass_min") Long gamepassMin,
			@JsonProperty("gamepass_max") Long gamepassMax,
			@JsonProperty("game_donations") GameDonations gameDonations,
			@JsonProperty("inv_min") Long invMin,
			@JsonProperty("inv_max") Long invMax,
			@JsonProperty("ugc_limited_price_min") Long ugcLimitedPriceMin,
			@JsonProperty("ugc_limited_price_max") Long ugcLimitedPriceMax,
			@JsonProperty("credit_balance_min") Long creditBalanceMin,
			@JsonProperty("credit_balance_max") Long creditBalanceMax,
			@JsonProperty("offsale_min") Long offsaleMin,
			@JsonProperty("offsale_max") Long offsaleMax,
			Voice voice,
			@JsonProperty("age_group[]") List<String> ageGroup,
			@JsonProperty("not_age_group[]") List<String> notAgeGroup
		) {
			public CategoryRobloxParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponse(
			List<CategoryRobloxResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsRobloxGameDonationsDetails(
			String product,
			long amount,
			String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("roblox_item_id") long robloxItemId,
			@JsonProperty("roblox_id") long robloxId,
			@JsonProperty("roblox_email_verified") long robloxEmailVerified,
			@JsonProperty("roblox_robux") long robloxRobux,
			@JsonProperty("roblox_username") String robloxUsername,
			@JsonProperty("roblox_country") String robloxCountry,
			@JsonProperty("roblox_register_date") long robloxRegisterDate,
			@JsonProperty("roblox_friends") long robloxFriends,
			@JsonProperty("roblox_followers") long robloxFollowers,
			@JsonProperty("roblox_subscription") String robloxSubscription,
			@JsonProperty("roblox_subscription_end_date") long robloxSubscriptionEndDate,
			@JsonProperty("roblox_xbox_connected") long robloxXboxConnected,
			@JsonProperty("roblox_incoming_robux_total") long robloxIncomingRobuxTotal,
			@JsonProperty("roblox_limited_price") long robloxLimitedPrice,
			@JsonProperty("roblox_verified") long robloxVerified,
			@JsonProperty("roblox_age_verified") long robloxAgeVerified,
			@JsonProperty("roblox_psn_connected") long robloxPsnConnected,
			@JsonProperty("roblox_subscription_auto_renew") long robloxSubscriptionAutoRenew,
			@JsonProperty("roblox_game_pass_total_robux") long robloxGamePassTotalRobux,
			@JsonProperty("roblox_game_donations") String robloxGameDonations,
			@JsonProperty("roblox_inventory_price") long robloxInventoryPrice,
			@JsonProperty("roblox_ugc_limited_price") long robloxUgcLimitedPrice,
			@JsonProperty("roblox_credit_balance") long robloxCreditBalance,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryRobloxResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			String robloxLinkedAccounts,
			String creditBalance,
			List<CategoryRobloxResponseItemsRobloxGameDonationsDetails> robloxGameDonationsDetails,
			boolean canViewAccountLink,
			List<CategoryRobloxResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryRobloxResponseItemsSeller seller
		) {}

		public record CategoryWarfaceParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("rank_min") Long rankMin,
			@JsonProperty("rank_max") Long rankMax,
			@JsonProperty("bonus_rank_min") Long bonusRankMin,
			@JsonProperty("bonus_rank_max") Long bonusRankMax,
			Tel tel,
			Long daybreak,
			@JsonProperty("kredits_min") Long kreditsMin,
			@JsonProperty("kredits_max") Long kreditsMax,
			@JsonProperty("total_kredits_min") Long totalKreditsMin,
			@JsonProperty("total_kredits_max") Long totalKreditsMax
		) {
			public CategoryWarfaceParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponse(
			List<CategoryWarfaceResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsWfServers(
			long id,
			long rank,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") long restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") JsonNode emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("wf_item_id") long wfItemId,
			@JsonProperty("wf_players") boolean wfPlayers,
			@JsonProperty("wf_server_1") long wfServer_1,
			@JsonProperty("wf_server_2") long wfServer_2,
			@JsonProperty("wf_server_3") long wfServer_3,
			@JsonProperty("wf_mobile") long wfMobile,
			@JsonProperty("wf_bonus_rank") long wfBonusRank,
			@JsonProperty("wf_mail_mobile") long wfMailMobile,
			@JsonProperty("wf_last_game_date") long wfLastGameDate,
			@JsonProperty("wf_loan") boolean wfLoan,
			@JsonProperty("wf_active_loan") long wfActiveLoan,
			@JsonProperty("wf_rank") long wfRank,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryWarfaceResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			@JsonProperty("wf_servers") List<CategoryWarfaceResponseItemsWfServers> wfServers,
			String domain,
			boolean canViewAccountLink,
			boolean canChangePassword,
			String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryWarfaceResponseItemsSeller seller
		) {}

		public record CategoryMinecraftParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			CategorySubscriptionMinecraft subscription,
			@JsonProperty("subscription_length") Long subscriptionLength,
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			Autorenewal autorenewal,
			Java java,
			Bedrock bedrock,
			Dungeons dungeons,
			Legends legends,
			@JsonProperty("change_nickname") ChangeNickname changeNickname,
			@JsonProperty("capes[]") List<String> capes,
			@JsonProperty("capes_min") Long capesMin,
			@JsonProperty("capes_max") Long capesMax,
			@JsonProperty("country[]") List<String> country,
			@JsonProperty("not_country[]") List<String> notCountry,
			@JsonProperty("hypixel_ban") HypixelBan hypixelBan,
			@JsonProperty("hypixel_skyblock_api_enabled") HypixelSkyblockApiEnabled hypixelSkyblockApiEnabled,
			@JsonProperty("rank_hypixel[]") JsonNode rankHypixel,
			@JsonProperty("level_hypixel_min") Long levelHypixelMin,
			@JsonProperty("level_hypixel_max") Long levelHypixelMax,
			@JsonProperty("achievement_hypixel_min") Long achievementHypixelMin,
			@JsonProperty("achievement_hypixel_max") Long achievementHypixelMax,
			@JsonProperty("level_hypixel_skyblock_min") Long levelHypixelSkyblockMin,
			@JsonProperty("level_hypixel_skyblock_max") Long levelHypixelSkyblockMax,
			@JsonProperty("net_worth_hypixel_skyblock_min") Long netWorthHypixelSkyblockMin,
			@JsonProperty("net_worth_hypixel_skyblock_max") Long netWorthHypixelSkyblockMax,
			Long reg,
			@JsonProperty("reg_period") RegPeriod regPeriod,
			@JsonProperty("last_login_hypixel") Long lastLoginHypixel,
			@JsonProperty("last_login_hypixel_period") LastLoginHypixelPeriod lastLoginHypixelPeriod,
			@JsonProperty("can_change_details") CanChangeDetails canChangeDetails,
			@JsonProperty("nickname_length_min") Long nicknameLengthMin,
			@JsonProperty("nickname_length_max") Long nicknameLengthMax,
			@JsonProperty("hypixel_ban_parsed") HypixelBanParsed hypixelBanParsed,
			@JsonProperty("minecoins_min") Long minecoinsMin,
			@JsonProperty("minecoins_max") Long minecoinsMax
		) {
			public CategoryMinecraftParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponse(
			List<CategoryMinecraftResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("minecraft_item_id") long minecraftItemId,
			@JsonProperty("minecraft_id") String minecraftId,
			@JsonProperty("minecraft_nickname") String minecraftNickname,
			@JsonProperty("minecraft_country") String minecraftCountry,
			@JsonProperty("minecraft_skin") String minecraftSkin,
			@JsonProperty("minecraft_java") long minecraftJava,
			@JsonProperty("minecraft_bedrock") long minecraftBedrock,
			@JsonProperty("minecraft_can_change_nickname") long minecraftCanChangeNickname,
			@JsonProperty("minecraft_created_at") long minecraftCreatedAt,
			@JsonProperty("minecraft_hypixel_rank") String minecraftHypixelRank,
			@JsonProperty("minecraft_hypixel_level") long minecraftHypixelLevel,
			@JsonProperty("minecraft_hypixel_achievement") long minecraftHypixelAchievement,
			@JsonProperty("minecraft_hypixel_last_login") long minecraftHypixelLastLogin,
			@JsonProperty("minecraft_hypixel_ban") long minecraftHypixelBan,
			@JsonProperty("minecraft_hypixel_ban_reason") String minecraftHypixelBanReason,
			@JsonProperty("minecraft_hypixel_skyblock_level") long minecraftHypixelSkyblockLevel,
			@JsonProperty("minecraft_hypixel_skyblock_net_worth") long minecraftHypixelSkyblockNetWorth,
			@JsonProperty("minecraft_dungeons") long minecraftDungeons,
			@JsonProperty("minecraft_legends") long minecraftLegends,
			@JsonProperty("minecraft_capes_count") long minecraftCapesCount,
			@JsonProperty("minecraft_capes") List<JsonNode> minecraftCapes,
			@JsonProperty("minecraft_subscription_name") String minecraftSubscriptionName,
			@JsonProperty("minecraft_subscription_ends") long minecraftSubscriptionEnds,
			@JsonProperty("minecraft_subscription_auto_renew") long minecraftSubscriptionAutoRenew,
			@JsonProperty("minecraft_email_reset_date") long minecraftEmailResetDate,
			@JsonProperty("feedback_data") String feedbackData,
			boolean isIgnored,
			long priceWithSellerFee,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			CategoryMinecraftResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean minecraftHasPaidLicense,
			boolean canViewAccountLink,
			List<CategoryMinecraftResponseItemsAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryMinecraftResponseItemsSeller seller
		) {}

		public record CategoryHytaleParams(
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			@JsonProperty("edition[]") JsonNode edition,
			@JsonProperty("profiles_min") Long profilesMin,
			@JsonProperty("profiles_max") Long profilesMax
		) {
			public CategoryHytaleParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponse(
			List<CategoryHytaleResponseItems> items,
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
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsCategory(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_name") String categoryName,
			@JsonProperty("category_url") String categoryUrl
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsCopyFormatData(
			@JsonProperty("title_link") String titleLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsSeller(
			@JsonProperty("user_id") long userId,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("restore_percents") JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItems(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("auto_bump_period") long autoBumpPeriod,
			@JsonProperty("rub_price") long rubPrice,
			boolean discount,
			@JsonProperty("hytale_item_id") long hytaleItemId,
			@JsonProperty("hytale_profiles") long hytaleProfiles,
			@JsonProperty("hytale_edition") String hytaleEdition,
			@JsonProperty("feedback_data") String feedbackData,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			boolean isIgnored,
			double priceWithSellerFee,
			CategoryHytaleResponseItemsCategory category,
			JsonNode guarantee,
			boolean canViewLoginData,
			boolean canViewTempEmail,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewItemViews,
			boolean canManagePublicTag,
			boolean canViewEmailLoginData,
			CategoryHytaleResponseItemsCopyFormatData copyFormatData,
			boolean showGetEmailCodeButton,
			boolean canOpenItem,
			boolean canCloseItem,
			boolean canEditItem,
			boolean canDeleteItem,
			boolean canStickItem,
			boolean canUnstickItem,
			boolean canBumpItem,
			String canNotBumpItemReason,
			JsonNode buyer,
			boolean isPersonalAccount,
			boolean canBuyItem,
			@JsonProperty("price_currency") String priceCurrency,
			String priceWithSellerFeeLabel,
			boolean canValidateAccount,
			boolean canResellItem,
			boolean canViewAccountLink,
			List<JsonNode> imagePreviewLinks,
			String emailLoginUrl,
			boolean canChangePassword,
			boolean canChangeEmailPassword,
			boolean uniqueKeyExists,
			String itemOriginPhrase,
			List<JsonNode> tags,
			@JsonProperty("public_tag") JsonNode publicTag,
			@JsonProperty("note_text") JsonNode noteText,
			boolean hasPendingAutoBuy,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			CategoryHytaleResponseItemsSeller seller
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
			CategoryListResponseCategory category,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryListResponseCategoryLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryListResponseCategory(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_description") String categoryDescription,
			CategoryListResponseCategoryLinks links
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponse(
			@Nullable CategoryParamsResponseCategory category,
			@Nullable List<CategoryParamsResponseParams> params,
			@JsonProperty("base_params") @Nullable CategoryParamsResponseBaseParams baseParams,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseCategory(
			@JsonProperty("category_id") long categoryId,
			@JsonProperty("sub_category_id") long subCategoryId,
			@JsonProperty("category_order") long categoryOrder,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_name") String categoryName,
			@JsonProperty("category_url") String categoryUrl,
			@JsonProperty("category_description_html") String categoryDescriptionHtml,
			@JsonProperty("category_login_url") String categoryLoginUrl,
			@JsonProperty("add_item_available") long addItemAvailable,
			@JsonProperty("mass_upload_item_available") long massUploadItemAvailable,
			@JsonProperty("has_guarantee") long hasGuarantee,
			@JsonProperty("has_account_link") long hasAccountLink,
			@JsonProperty("require_temp_email") long requireTempEmail,
			@JsonProperty("recovery_link") String recoveryLink,
			@JsonProperty("check_button_enabled") long checkButtonEnabled,
			@JsonProperty("checker_enabled") long checkerEnabled,
			@JsonProperty("support_personal_proxy") long supportPersonalProxy,
			@JsonProperty("support_email_login_data") long supportEmailLoginData,
			@JsonProperty("require_email_login_data") long requireEmailLoginData,
			@JsonProperty("display_in_list") long displayInList,
			@JsonProperty("category_description_html_en") String categoryDescriptionHtmlEn,
			@JsonProperty("category_h1_html_en") String categoryH1HtmlEn,
			@JsonProperty("account_price_min") long accountPriceMin,
			@JsonProperty("require_video_recording") long requireVideoRecording,
			@JsonProperty("top_queries") String topQueries,
			@JsonProperty("require_eld_for_native_accs") long requireEldForNativeAccs,
			@JsonProperty("can_be_resold") long canBeResold,
			@JsonProperty("support_temp_email") long supportTempEmail,
			String cookies,
			@JsonProperty("login_type") String loginType,
			@JsonProperty("guest_hidden") long guestHidden,
			@JsonProperty("available_temp_email") long availableTempEmail,
			@JsonProperty("resale_duration_limit_days") long resaleDurationLimitDays,
			@JsonProperty("buy_without_validation") long buyWithoutValidation,
			@JsonProperty("max_invalid_upload_tries") long maxInvalidUploadTries
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseParams(
			String name,
			String input,
			String description,
			List<String> values
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseBaseParams0(
			String name,
			String input,
			String description
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseBaseParams(
			@JsonProperty("0") CategoryParamsResponseBaseParams0 _0
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGamesResponse(
			@Nullable List<CategoryGamesResponseGames> games,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGamesResponseGames(
			@JsonProperty("app_id") String appId,
			String title,
			String abbr,
			@JsonProperty("category_id") long categoryId,
			String img,
			String url,
			String ru
		) {}

	}

	// ─── ListApi Types ────────────────────────────────────────

	public static final class ListApiTypes {

		private ListApiTypes() {
		}

		public record ListUserParams(
			@JsonProperty("user_id") Long userId,
			@JsonProperty("category_id") CategoryId categoryId,
			Long page,
			Show show,
			@JsonProperty("delete_reason") String deleteReason,
			String title,
			Long pmin,
			Long pmax,
			String login,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") OrderBy orderBy,
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
			@JsonProperty("user_id") Long userId,
			@JsonProperty("category_id") CategoryId categoryId,
			Long page,
			Show show,
			String title,
			Long pmin,
			Long pmax,
			String login,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") OrderBy orderBy,
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
			@JsonProperty("user_id") com.lolzteam.api.runtime.StringOrInt userId
		) {
			public ListStatesParams() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponse(
			ListStatesResponseUserItemStates userItemStates,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesStickied(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title,
			long stickyLimit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesDiscountRequest(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesInBuyersFavorites(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesActive(
			@JsonProperty("item_count") long itemCount,
			@JsonProperty("item_state") String itemState,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPaid(
			@JsonProperty("item_count") long itemCount,
			@JsonProperty("item_state") String itemState,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesClosed(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesDeleted(
			@JsonProperty("item_count") long itemCount,
			@JsonProperty("item_state") String itemState,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesAwaiting(
			@JsonProperty("item_count") long itemCount,
			@JsonProperty("item_state") String itemState,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPreActive(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPreUpload(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPendingDeletion(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesClosedInactive(
			@JsonProperty("item_count") long itemCount,
			@JsonProperty("item_state") String itemState,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesAutoBump(
			@JsonProperty("item_state") String itemState,
			@JsonProperty("item_count") long itemCount,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStates(
			ListStatesResponseUserItemStatesStickied stickied,
			@JsonProperty("discount_request") ListStatesResponseUserItemStatesDiscountRequest discountRequest,
			@JsonProperty("in_buyers_favorites") ListStatesResponseUserItemStatesInBuyersFavorites inBuyersFavorites,
			ListStatesResponseUserItemStatesActive active,
			ListStatesResponseUserItemStatesPaid paid,
			ListStatesResponseUserItemStatesClosed closed,
			ListStatesResponseUserItemStatesDeleted deleted,
			ListStatesResponseUserItemStatesAwaiting awaiting,
			@JsonProperty("pre_active") ListStatesResponseUserItemStatesPreActive preActive,
			@JsonProperty("pre_upload") ListStatesResponseUserItemStatesPreUpload preUpload,
			@JsonProperty("pending_deletion") ListStatesResponseUserItemStatesPendingDeletion pendingDeletion,
			@JsonProperty("closed_inactive") ListStatesResponseUserItemStatesClosedInactive closedInactive,
			@JsonProperty("auto_bump") ListStatesResponseUserItemStatesAutoBump autoBump
		) {}

		public record ListDownloadParams(
			Format format,
			@JsonProperty("custom_format") String customFormat,
			@JsonProperty("category_id") CategoryId categoryId,
			Long page,
			Show show,
			@JsonProperty("delete_reason") String deleteReason,
			String title,
			Long pmin,
			Long pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") OrderBy orderBy,
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
			Long page,
			Show show,
			String title,
			Long pmin,
			Long pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") OrderBy orderBy,
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
			Long page,
			Show show,
			String title,
			Long pmin,
			Long pmax,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("order_by") OrderBy orderBy,
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
			@JsonProperty("item_id") Long itemId,
			@JsonProperty("post_body") String postBody
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponse(
			ManagingCreateClaimResponseThread thread,
			@JsonProperty("system_info") ManagingCreateClaimResponseSystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPostLikeUsers(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("display_style_group_id") Long displayStyleGroupId,
			@JsonProperty("is_banned") Long isBanned,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPostLinks(
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
		public record ManagingCreateClaimResponseThreadFirstPostPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			boolean reply,
			boolean like,
			boolean report,
			@JsonProperty("upload_attachment") boolean uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPost(
			@JsonProperty("post_id") long postId,
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("poster_user_id") long posterUserId,
			@JsonProperty("poster_username") String posterUsername,
			@JsonProperty("post_create_date") long postCreateDate,
			@JsonProperty("post_body") String postBody,
			@JsonProperty("post_body_html") String postBodyHtml,
			@JsonProperty("post_body_plain_text") String postBodyPlainText,
			String signature,
			@JsonProperty("signature_html") String signatureHtml,
			@JsonProperty("signature_plain_text") String signaturePlainText,
			@JsonProperty("post_like_count") long postLikeCount,
			@JsonProperty("post_attachment_count") long postAttachmentCount,
			@JsonProperty("like_users") List<ManagingCreateClaimResponseThreadFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("post_is_published") boolean postIsPublished,
			@JsonProperty("post_is_deleted") boolean postIsDeleted,
			@JsonProperty("post_update_date") long postUpdateDate,
			@JsonProperty("post_is_first_post") boolean postIsFirstPost,
			ManagingCreateClaimResponseThreadFirstPostLinks links,
			ManagingCreateClaimResponseThreadFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadLinks(
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
		public record ManagingCreateClaimResponseThreadPermissions(
			boolean view,
			boolean delete,
			boolean follow,
			boolean post,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			boolean edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") long prefixId,
			@JsonProperty("prefix_title") String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumForumPrefixes(
			@JsonProperty("group_title") String groupTitle,
			@JsonProperty("group_prefixes") List<ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumLinks(
			String permalink,
			String detail,
			@JsonProperty("sub-categories") String subCategories,
			@JsonProperty("sub-forums") String subForums,
			String threads,
			String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumPermissions(
			boolean view,
			boolean edit,
			boolean delete,
			@JsonProperty("create_thread") boolean createThread,
			@JsonProperty("upload_attachment") boolean uploadAttachment,
			@JsonProperty("tag_thread") boolean tagThread,
			boolean follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForum(
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("forum_title") String forumTitle,
			@JsonProperty("forum_description") String forumDescription,
			@JsonProperty("forum_thread_count") long forumThreadCount,
			@JsonProperty("forum_post_count") long forumPostCount,
			@JsonProperty("forum_prefixes") List<ManagingCreateClaimResponseThreadForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") long threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") boolean threadPrefixIsRequired,
			ManagingCreateClaimResponseThreadForumLinks links,
			ManagingCreateClaimResponseThreadForumPermissions permissions,
			@JsonProperty("forum_is_followed") boolean forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThread(
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("forum_id") long forumId,
			@JsonProperty("thread_title") String threadTitle,
			@JsonProperty("thread_view_count") long threadViewCount,
			@JsonProperty("creator_user_id") long creatorUserId,
			@JsonProperty("creator_username") String creatorUsername,
			@JsonProperty("thread_create_date") long threadCreateDate,
			@JsonProperty("thread_update_date") long threadUpdateDate,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("thread_post_count") long threadPostCount,
			@JsonProperty("thread_is_published") boolean threadIsPublished,
			@JsonProperty("thread_is_deleted") boolean threadIsDeleted,
			@JsonProperty("thread_is_sticky") boolean threadIsSticky,
			@JsonProperty("thread_is_followed") boolean threadIsFollowed,
			@JsonProperty("first_post") ManagingCreateClaimResponseThreadFirstPost firstPost,
			@JsonProperty("thread_prefixes") List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") List<JsonNode> threadTags,
			ManagingCreateClaimResponseThreadLinks links,
			ManagingCreateClaimResponseThreadPermissions permissions,
			ManagingCreateClaimResponseThreadForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseSystemInfo(
			@JsonProperty("visitor_id") long visitorId,
			long time
		) {}

		public record ManagingBulkGetBody(
			@JsonProperty("item_id") List<Long> itemId,
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds
		) {
			public ManagingBulkGetBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingBulkGetResponse(
			List<ManagingBulkGetResponseItems> items,
			@JsonProperty("left_item_id") List<Long> leftItemId,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingBulkGetResponseItems(
			@JsonProperty("0") @Nullable ItemModel _0
		) {}

		public record ManagingSteamInventoryValueParams(
			@JsonProperty("app_id") AppId appId,
			Currency currency,
			@JsonProperty("ignore_cache") Boolean ignoreCache
		) {
			public ManagingSteamInventoryValueParams() {
				this(null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponse(
			@Nullable String query,
			@Nullable ManagingSteamInventoryValueResponseData data,
			Long appId,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponseDataItems0Stickers(
			long stickerCount,
			long count,
			List<String> images,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponseDataItems0(
			String classid,
			long tradable,
			long marketable,
			@JsonProperty("image_url") String imageUrl,
			String title,
			double price,
			long count,
			String type,
			@JsonProperty("market_hash_name") String marketHashName,
			JsonNode fraudwarnings,
			ManagingSteamInventoryValueResponseDataItems0Stickers stickers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponseDataItems(
			@JsonProperty("0") @Nullable ManagingSteamInventoryValueResponseDataItems0 _0
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponseData(
			ManagingSteamInventoryValueResponseDataItems items,
			@JsonProperty("steam_id") String steamId,
			long appId,
			String appTitle,
			double totalValue,
			long itemCount,
			long marketableItemCount,
			String currency,
			String currencyIcon,
			String language,
			long time
		) {}

		public record ManagingSteamValueParams(
			String link,
			@JsonProperty("app_id") AppId appId,
			Currency currency,
			@JsonProperty("ignore_cache") Boolean ignoreCache
		) {
			public ManagingSteamValueParams(String link) {
				this(link, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponse(
			@Nullable String query,
			@Nullable ManagingSteamValueResponseData data,
			Long appId,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponseDataItems0Stickers(
			long stickerCount,
			long count,
			List<String> images,
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponseDataItems0(
			String classid,
			long tradable,
			long marketable,
			@JsonProperty("image_url") String imageUrl,
			String title,
			double price,
			long count,
			String type,
			@JsonProperty("market_hash_name") String marketHashName,
			JsonNode fraudwarnings,
			ManagingSteamValueResponseDataItems0Stickers stickers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponseDataItems(
			@JsonProperty("0") @Nullable ManagingSteamValueResponseDataItems0 _0
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponseData(
			ManagingSteamValueResponseDataItems items,
			@JsonProperty("steam_id") String steamId,
			long appId,
			String appTitle,
			double totalValue,
			long itemCount,
			long marketableItemCount,
			String currency,
			String currencyIcon,
			String language,
			long time
		) {}

		public record ManagingSteamPreviewParams(
			ManagingType type
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
			Long price,
			Currency currency,
			@JsonProperty("item_origin") ManagingItemOrigin itemOrigin,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") EmailType emailType,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Long proxyId,
			String description,
			String information
		) {
			public ManagingEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEditResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			@JsonProperty("app_id") AppId appId,
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
			Long hour
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
			ManagingTypeImage type
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingImageResponse(
			String base64,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEmailCodeResponse(
			ItemModel item,
			ManagingEmailCodeResponseCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEmailCodeResponseCodeData(
			String code,
			long date,
			String textPlain
		) {}

		public record ManagingGetLetters2Params(
			@JsonProperty("email_password") String emailPassword,
			String email,
			String password,
			Long limit
		) {
			public ManagingGetLetters2Params() {
				this(null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingGetLetters2Response(
			String email,
			List<ManagingGetLetters2ResponseLetters> letters,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingGetLetters2ResponseLetters(
			String textHtml,
			String textPlain,
			String from,
			long date
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponse(
			ManagingSteamGetMafileResponseMaFile maFile,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponseMaFileSession(
			String SessionID,
			String AccessToken,
			String RefreshToken,
			String SteamID,
			String SteamLoginSecure
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponseMaFile(
			@JsonProperty("shared_secret") String sharedSecret,
			@JsonProperty("serial_number") long serialNumber,
			@JsonProperty("revocation_code") String revocationCode,
			String uri,
			@JsonProperty("account_name") String accountName,
			@JsonProperty("token_gid") String tokenGid,
			@JsonProperty("identity_secret") String identitySecret,
			String secret_1,
			@JsonProperty("device_id") String deviceId,
			@JsonProperty("fully_enrolled") boolean fullyEnrolled,
			ManagingSteamGetMafileResponseMaFileSession Session
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
			ManagingSteamMafileCodeResponseCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamMafileCodeResponseCodeData(
			String code,
			long date,
			String textPlain
		) {}

		public record ManagingSteamSDABody(
			Long id,
			Long nonce
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
			ManagingTelegramCodeResponseCodes codes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramCodeResponseCodes(
			@Nullable String code,
			Long date
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramResetAuthResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingRefuseGuaranteeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ManagingDeclineVideoRecordingBody(
			@JsonProperty("i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item") Boolean iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingDeclineVideoRecordingResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCheckGuaranteeResponse(
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record ManagingChangePasswordBody(
			@JsonProperty("_cancel") Cancel Cancel
		) {
			public ManagingChangePasswordBody() {
				this(null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingChangePasswordResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("new_password") String newPassword
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTempEmailPasswordResponse(
			ManagingTempEmailPasswordResponseItem item
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTempEmailPasswordResponseItem(
			String account
		) {}

		public record ManagingTagBody(
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTagResponse(
			long itemId,
			ManagingTagResponseTag tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTagResponseTag(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}

		public record ManagingUntagBody(
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUntagResponse(
			long itemId,
			ManagingUntagResponseTag tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUntagResponseTag(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}

		public record ManagingPublicTagBody(
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicTagResponse(
			long itemId,
			ManagingPublicTagResponseTag tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicTagResponseTag(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}

		public record ManagingPublicUntagBody(
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicUntagResponse(
			long itemId,
			ManagingPublicUntagResponseTag tag,
			long addedTagId,
			List<Long> deleteTags,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicUntagResponseTag(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingFavoriteResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnfavoriteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ManagingTransferBody(
			String username,
			@JsonProperty("secret_answer") String secretAnswer
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTransferResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ProfileApi Types ────────────────────────────────────────

	public static final class ProfileApiTypes {

		private ProfileApiTypes() {
		}

		public record ProfileClaimsParams(
			ProfileType type,
			@JsonProperty("claim_state") ClaimState claimState
		) {
			public ProfileClaimsParams() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponse(
			List<ProfileClaimsResponseClaims> claims,
			ProfileClaimsResponseStats stats,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthorLinks(
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
		public record ProfileClaimsResponseClaimsAuthorPermissions(
			boolean edit,
			boolean follow,
			boolean ignore
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthorFields(
			String id,
			String title,
			String description,
			String position,
			@JsonProperty("is_required") boolean isRequired
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthor(
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
			ProfileClaimsResponseClaimsAuthorLinks links,
			ProfileClaimsResponseClaimsAuthorPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("ban_reason") String banReason,
			List<ProfileClaimsResponseClaimsAuthorFields> fields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaims(
			@JsonProperty("thread_id") long threadId,
			@JsonProperty("claim_date") long claimDate,
			@JsonProperty("claim_state") String claimState,
			@JsonProperty("message_body") String messageBody,
			@JsonProperty("amount_formatted") String amountFormatted,
			ProfileClaimsResponseClaimsAuthor author
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStatsMarket(
			long total,
			long solved,
			long settled,
			long rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStatsNoMarket(
			long total,
			long solved,
			long settled,
			long rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStats(
			ProfileClaimsResponseStatsMarket market,
			ProfileClaimsResponseStatsNoMarket noMarket
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── CartApi Types ────────────────────────────────────────

	public static final class CartApiTypes {

		private CartApiTypes() {
		}

		public record CartGetParams(
			@JsonProperty("category_id") CategoryId categoryId,
			Long page,
			Long pmin,
			Long pmax,
			String title,
			@JsonProperty("order_by") OrderBy orderBy,
			@JsonProperty("tag_id[]") List<Long> tagId,
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			@JsonProperty("origin[]") JsonNode origin,
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			@JsonProperty("user_id") Long userId,
			Boolean nsb,
			Boolean sb,
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			@JsonProperty("sb_by_me") Boolean sbByMe,
			Currency currency,
			@JsonProperty("email_login_data") Boolean emailLoginData,
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
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
			@JsonProperty("item_id") Long itemId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartAddResponse(
			boolean success,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CartDeleteBody(
			@JsonProperty("item_id") Long itemId
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
			@JsonProperty("balance_id") Long balanceId
		) {
			public PurchasingFastBuyBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponse(
			String status,
			PurchasingFastBuyResponseItem item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			long endDate,
			boolean active,
			boolean cancelled,
			long remainingTime,
			String remainingTimePhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemEmailLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			String encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemBuyer(
			@JsonProperty("user_id") long userId,
			@JsonProperty("operation_date") long operationDate,
			boolean visitorIsBuyer,
			String username,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_group_id") long userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemTags1(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemTags(
			@JsonProperty("1") PurchasingFastBuyResponseItemTags1 _1
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemExtraPrices(
			String currency,
			String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemSeller(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("joined_date") long joinedDate,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			@JsonProperty("restore_percents") long restorePercents,
			boolean isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItem(
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
			@JsonProperty("user_allow_ask_discount") long userAllowAskDiscount,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			@JsonProperty("market_custom_title") String marketCustomTitle,
			@JsonProperty("feedback_data") String feedbackData,
			@JsonProperty("buyer_avatar_date") long buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") long buyerUserGroupId,
			long priceWithSellerFee,
			PurchasingFastBuyResponseItemGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			PurchasingFastBuyResponseItemLoginData loginData,
			boolean canViewEmailLoginData,
			PurchasingFastBuyResponseItemEmailLoginData emailLoginData,
			boolean showGetEmailCodeButton,
			String getEmailCodeDisplayLogin,
			PurchasingFastBuyResponseItemBuyer buyer,
			boolean isPersonalAccount,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean displayConvertedBalance,
			boolean canViewAccountLink,
			List<PurchasingFastBuyResponseItemAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			boolean visitorIsAuthor,
			boolean canAskDiscount,
			PurchasingFastBuyResponseItemTags tags,
			List<JsonNode> customFields,
			List<JsonNode> externalAuth,
			boolean isTrusted,
			boolean isBirthdayToday,
			boolean isIgnored,
			long deposit,
			List<PurchasingFastBuyResponseItemExtraPrices> extraPrices,
			boolean canViewAccountLoginAndTempEmail,
			PurchasingFastBuyResponseItemBumpSettings bumpSettings,
			boolean canCheckGuarantee,
			boolean needToRequireVideoToViewLoginData,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			PurchasingFastBuyResponseItemSeller seller
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponse(
			String status,
			PurchasingCheckResponseItem item,
			boolean requireVideoRecording,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			JsonNode endDate,
			JsonNode active,
			JsonNode cancelled,
			JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemExtraPrices(
			String currency,
			String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemSeller(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("joined_date") long joinedDate,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			@JsonProperty("restore_percents") JsonNode restorePercents,
			boolean isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItem(
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
			@JsonProperty("view_count") long viewCount,
			@JsonProperty("is_sticky") long isSticky,
			@JsonProperty("item_origin") String itemOrigin,
			@JsonProperty("extended_guarantee") long extendedGuarantee,
			long nsb,
			@JsonProperty("allow_ask_discount") long allowAskDiscount,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("description_en") String descriptionEn,
			@JsonProperty("email_type") String emailType,
			@JsonProperty("email_provider") String emailProvider,
			@JsonProperty("item_domain") String itemDomain,
			@JsonProperty("resale_item_origin") String resaleItemOrigin,
			@JsonProperty("user_allow_ask_discount") long userAllowAskDiscount,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			@JsonProperty("market_custom_title") String marketCustomTitle,
			@JsonProperty("feedback_data") String feedbackData,
			@JsonProperty("category_title") String categoryTitle,
			@JsonProperty("category_url") String categoryUrl,
			@JsonProperty("require_temp_email") long requireTempEmail,
			@JsonProperty("available_temp_email") long availableTempEmail,
			@JsonProperty("check_button_enabled") long checkButtonEnabled,
			@JsonProperty("checker_enabled") long checkerEnabled,
			@JsonProperty("buy_without_validation") long buyWithoutValidation,
			@JsonProperty("has_guarantee") long hasGuarantee,
			@JsonProperty("require_video_recording") long requireVideoRecording,
			@JsonProperty("can_be_resold") long canBeResold,
			@JsonProperty("login_type") String loginType,
			@JsonProperty("require_email_login_data") long requireEmailLoginData,
			@JsonProperty("category_prefix_id") long categoryPrefixId,
			@JsonProperty("ask_user_id") JsonNode askUserId,
			@JsonProperty("ask_item_id") JsonNode askItemId,
			@JsonProperty("ask_date") JsonNode askDate,
			@JsonProperty("discount_price") JsonNode discountPrice,
			@JsonProperty("discount_accepted") JsonNode discountAccepted,
			@JsonProperty("user_alerted") JsonNode userAlerted,
			JsonNode message,
			@JsonProperty("min_price") long minPrice,
			long priceWithSellerFee,
			PurchasingCheckResponseItemGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			boolean canViewEmailLoginData,
			boolean showGetEmailCodeButton,
			boolean isPersonalAccount,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean canViewAccountLink,
			List<PurchasingCheckResponseItemAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			boolean visitorIsAuthor,
			boolean canAskDiscount,
			List<JsonNode> tags,
			List<JsonNode> customFields,
			List<JsonNode> externalAuth,
			boolean isTrusted,
			boolean isBirthdayToday,
			boolean isIgnored,
			long deposit,
			List<PurchasingCheckResponseItemExtraPrices> extraPrices,
			boolean canViewAccountLoginAndTempEmail,
			PurchasingCheckResponseItemBumpSettings bumpSettings,
			boolean canCheckGuarantee,
			boolean needToRequireVideoToViewLoginData,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			PurchasingCheckResponseItemSeller seller
		) {}

		public record PurchasingConfirmBody(
			Long price,
			@JsonProperty("balance_id") Long balanceId
		) {
			public PurchasingConfirmBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponse(
			@Nullable String status,
			PurchasingConfirmResponseItem item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponseItemLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			String encodedOldPassword,
			boolean adviceToChangePassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponseItem(
			PurchasingConfirmResponseItemLoginData loginData
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingDiscountCancelResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			@JsonProperty("user_id") Long userId,
			@JsonProperty("category_id") CategoryId categoryId,
			@JsonProperty("discount_percent") Double discountPercent,
			@JsonProperty("min_price") Double minPrice,
			@JsonProperty("max_price") Double maxPrice,
			Currency currency
		) {
			public CustomDiscountsCreateBody(Long userId, CategoryId categoryId, Double discountPercent, Double minPrice) {
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
			@JsonProperty("discount_id") Long discountId,
			@JsonProperty("discount_percent") Double discountPercent,
			@JsonProperty("min_price") Double minPrice,
			@JsonProperty("max_price") Double maxPrice
		) {
			public CustomDiscountsEditBody(Long discountId) {
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
			@JsonProperty("discount_id") Long discountId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
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
			@JsonProperty("category_id") CategoryId categoryId,
			Currency currency,
			@JsonProperty("item_origin") PublishingItemOrigin itemOrigin,
			@JsonProperty("extended_guarantee") ExtendedGuarantee extendedGuarantee,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Long proxyId,
			@JsonProperty("random_proxy") Boolean randomProxy,
			String description,
			String information,
			String login,
			String password,
			@JsonProperty("login_password") String loginPassword,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") EmailType emailType,
			JsonNode extra
		) {
			public PublishingFastSellBody(Double price, CategoryId categoryId, Currency currency, PublishingItemOrigin itemOrigin) {
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
			@JsonProperty("category_id") CategoryId categoryId,
			Currency currency,
			@JsonProperty("item_origin") PublishingItemOrigin itemOrigin,
			@JsonProperty("extended_guarantee") ExtendedGuarantee extendedGuarantee,
			String description,
			String information,
			Boolean forceTempEmail,
			@JsonProperty("resell_item_id") Long resellItemId,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") EmailType emailType,
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			@JsonProperty("proxy_id") Long proxyId,
			@JsonProperty("random_proxy") Boolean randomProxy
		) {
			public PublishingAddBody(Double price, CategoryId categoryId, Currency currency, PublishingItemOrigin itemOrigin) {
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
			@JsonProperty("resell_item_id") Long resellItemId,
			@JsonProperty("random_proxy") Boolean randomProxy,
			String login,
			String password,
			@JsonProperty("login_password") String loginPassword,
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			@JsonProperty("email_login_data") String emailLoginData,
			@JsonProperty("email_type") EmailType emailType,
			JsonNode extra
		) {
			public PublishingCheckBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponse(
			String status,
			PublishingCheckResponseItem item,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemGuarantee(
			long duration,
			String class_,
			String durationPhrase,
			long endDate,
			boolean active,
			boolean cancelled,
			long remainingTime,
			String remainingTimePhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemEmailLoginData(
			String raw,
			String encodedRaw,
			String login,
			String password,
			String encodedPassword,
			String oldPassword,
			String encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemBuyer(
			@JsonProperty("user_id") long userId,
			@JsonProperty("operation_date") long operationDate,
			boolean visitorIsBuyer,
			String username,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("user_group_id") long userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemAccountLinks(
			String link,
			String text,
			String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemTags1(
			@JsonProperty("tag_id") long tagId,
			String title,
			boolean isDefault,
			boolean forOwnedAccountsOnly,
			String bc
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemTags(
			@JsonProperty("1") PublishingCheckResponseItemTags1 _1
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemExtraPrices(
			String currency,
			String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemSeller(
			@JsonProperty("user_id") long userId,
			String username,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("joined_date") long joinedDate,
			@JsonProperty("sold_items_count") long soldItemsCount,
			@JsonProperty("active_items_count") long activeItemsCount,
			@JsonProperty("restore_data") String restoreData,
			@JsonProperty("restore_percents") long restorePercents,
			boolean isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItem(
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
			@JsonProperty("user_allow_ask_discount") long userAllowAskDiscount,
			@JsonProperty("max_discount_percent") long maxDiscountPercent,
			@JsonProperty("market_custom_title") String marketCustomTitle,
			@JsonProperty("feedback_data") String feedbackData,
			@JsonProperty("buyer_avatar_date") long buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") long buyerUserGroupId,
			long priceWithSellerFee,
			PublishingCheckResponseItemGuarantee guarantee,
			boolean canViewLoginData,
			boolean canUpdateItemStats,
			boolean canReportItem,
			PublishingCheckResponseItemLoginData loginData,
			boolean canViewEmailLoginData,
			PublishingCheckResponseItemEmailLoginData emailLoginData,
			boolean showGetEmailCodeButton,
			String getEmailCodeDisplayLogin,
			PublishingCheckResponseItemBuyer buyer,
			boolean isPersonalAccount,
			@JsonProperty("sold_items_category_count") long soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") long restoreItemsCategoryCount,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			@JsonProperty("account_last_activity") long accountLastActivity,
			boolean displayConvertedBalance,
			boolean canViewAccountLink,
			List<PublishingCheckResponseItemAccountLinks> accountLinks,
			String accountLink,
			String emailLoginUrl,
			boolean canChangePassword,
			String itemOriginPhrase,
			boolean visitorIsAuthor,
			boolean canAskDiscount,
			PublishingCheckResponseItemTags tags,
			List<JsonNode> customFields,
			List<JsonNode> externalAuth,
			boolean isTrusted,
			boolean isBirthdayToday,
			boolean isIgnored,
			long deposit,
			List<PublishingCheckResponseItemExtraPrices> extraPrices,
			boolean canViewAccountLoginAndTempEmail,
			PublishingCheckResponseItemBumpSettings bumpSettings,
			boolean canCheckGuarantee,
			boolean needToRequireVideoToViewLoginData,
			String descriptionHtml,
			String descriptionEnHtml,
			String descriptionPlain,
			String descriptionEnPlain,
			PublishingCheckResponseItemSeller seller
		) {}

		public record PublishingExternalBody(
			PublishingType type,
			String login,
			@JsonProperty("email_login_data") String emailLoginData,
			String cookies
		) {
			public PublishingExternalBody(PublishingType type) {
				this(type, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingExternalResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── PaymentsApi Types ────────────────────────────────────────

	public static final class PaymentsApiTypes {

		private PaymentsApiTypes() {
		}

		public record PaymentsInvoiceGetParams(
			@JsonProperty("invoice_id") Long invoiceId,
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
			Currency currency,
			Double amount,
			@JsonProperty("payment_id") String paymentId,
			String comment,
			@JsonProperty("url_success") String urlSuccess,
			@JsonProperty("url_callback") String urlCallback,
			@JsonProperty("merchant_id") Long merchantId,
			@JsonProperty("required_telegram_id") Long requiredTelegramId,
			@JsonProperty("required_telegram_username") String requiredTelegramUsername,
			/** Default: 3600 */
			Double lifetime,
			@JsonProperty("additional_data") String additionalData,
			@JsonProperty("is_test") Boolean isTest
		) {
			public PaymentsInvoiceCreateBody(Currency currency, Double amount, String paymentId, String comment, String urlSuccess, Long merchantId) {
				this(currency, amount, paymentId, comment, urlSuccess, null, merchantId, null, null, 3600D, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsInvoiceCreateResponse(
			InvoiceModel invoice,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsInvoiceListParams(
			Long page,
			Currency currency,
			Status status,
			Double amount,
			@JsonProperty("merchant_id") Long merchantId
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
			PaymentsCurrencyResponseCurrencyList currencyList,
			long lastUpdate,
			String visitorCurrency,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBTC(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListETH(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBNB(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBCH(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListXMR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSOL(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListLTC(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDASH(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTON(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUSDT(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMATIC(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTRX(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDOGE(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKWD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListGBP(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCHF(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListEUR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUSD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSGD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCAD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListAUD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListNZD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBGN(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListGEL(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListILS(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListQAR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPEN(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListAED(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSAR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPLN(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMYR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRON(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBRL(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDKK(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCNY(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListHKD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSEK(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListNOK(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListZAR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMXN(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCZK(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTWD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTHB(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTRY(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUAH(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUYU(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPHP(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListINR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRUB(
			String title,
			long rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRSD(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListJPY(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListHUF(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKZT(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCRC(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCLP(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListARS(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKRW(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCOP(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListIDR(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListVND(
			String title,
			double rate,
			String formattedRate,
			String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyList(
			PaymentsCurrencyResponseCurrencyListBTC BTC,
			PaymentsCurrencyResponseCurrencyListETH ETH,
			PaymentsCurrencyResponseCurrencyListBNB BNB,
			PaymentsCurrencyResponseCurrencyListBCH BCH,
			PaymentsCurrencyResponseCurrencyListXMR XMR,
			PaymentsCurrencyResponseCurrencyListSOL SOL,
			PaymentsCurrencyResponseCurrencyListLTC LTC,
			PaymentsCurrencyResponseCurrencyListDASH DASH,
			PaymentsCurrencyResponseCurrencyListTON TON,
			PaymentsCurrencyResponseCurrencyListUSDT USDT,
			PaymentsCurrencyResponseCurrencyListMATIC MATIC,
			PaymentsCurrencyResponseCurrencyListTRX TRX,
			PaymentsCurrencyResponseCurrencyListDOGE DOGE,
			PaymentsCurrencyResponseCurrencyListKWD KWD,
			PaymentsCurrencyResponseCurrencyListGBP GBP,
			PaymentsCurrencyResponseCurrencyListCHF CHF,
			PaymentsCurrencyResponseCurrencyListEUR EUR,
			PaymentsCurrencyResponseCurrencyListUSD USD,
			PaymentsCurrencyResponseCurrencyListSGD SGD,
			PaymentsCurrencyResponseCurrencyListCAD CAD,
			PaymentsCurrencyResponseCurrencyListAUD AUD,
			PaymentsCurrencyResponseCurrencyListNZD NZD,
			PaymentsCurrencyResponseCurrencyListBGN BGN,
			PaymentsCurrencyResponseCurrencyListGEL GEL,
			PaymentsCurrencyResponseCurrencyListILS ILS,
			PaymentsCurrencyResponseCurrencyListQAR QAR,
			PaymentsCurrencyResponseCurrencyListPEN PEN,
			PaymentsCurrencyResponseCurrencyListAED AED,
			PaymentsCurrencyResponseCurrencyListSAR SAR,
			PaymentsCurrencyResponseCurrencyListPLN PLN,
			PaymentsCurrencyResponseCurrencyListMYR MYR,
			PaymentsCurrencyResponseCurrencyListRON RON,
			PaymentsCurrencyResponseCurrencyListBRL BRL,
			PaymentsCurrencyResponseCurrencyListDKK DKK,
			PaymentsCurrencyResponseCurrencyListCNY CNY,
			PaymentsCurrencyResponseCurrencyListHKD HKD,
			PaymentsCurrencyResponseCurrencyListSEK SEK,
			PaymentsCurrencyResponseCurrencyListNOK NOK,
			PaymentsCurrencyResponseCurrencyListZAR ZAR,
			PaymentsCurrencyResponseCurrencyListMXN MXN,
			PaymentsCurrencyResponseCurrencyListCZK CZK,
			PaymentsCurrencyResponseCurrencyListTWD TWD,
			PaymentsCurrencyResponseCurrencyListTHB THB,
			PaymentsCurrencyResponseCurrencyListTRY TRY,
			PaymentsCurrencyResponseCurrencyListUAH UAH,
			PaymentsCurrencyResponseCurrencyListUYU UYU,
			PaymentsCurrencyResponseCurrencyListPHP PHP,
			PaymentsCurrencyResponseCurrencyListINR INR,
			PaymentsCurrencyResponseCurrencyListRUB RUB,
			PaymentsCurrencyResponseCurrencyListRSD RSD,
			PaymentsCurrencyResponseCurrencyListJPY JPY,
			PaymentsCurrencyResponseCurrencyListHUF HUF,
			PaymentsCurrencyResponseCurrencyListKZT KZT,
			PaymentsCurrencyResponseCurrencyListCRC CRC,
			PaymentsCurrencyResponseCurrencyListCLP CLP,
			PaymentsCurrencyResponseCurrencyListARS ARS,
			PaymentsCurrencyResponseCurrencyListKRW KRW,
			PaymentsCurrencyResponseCurrencyListCOP COP,
			PaymentsCurrencyResponseCurrencyListIDR IDR,
			PaymentsCurrencyResponseCurrencyListVND VND
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponse(
			PaymentsBalanceListResponseFrom from,
			PaymentsBalanceListResponseTo to,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseFromBalance(
			String balance,
			long convertedBalance,
			String fullTitle,
			String title,
			String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseFrom(
			PaymentsBalanceListResponseFromBalance balance,
			@JsonProperty("12345") BalanceModel _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseTo(
			UserModel balance
		) {}

		public record PaymentsBalanceExchangeBody(
			@JsonProperty("from_balance") String fromBalance,
			@JsonProperty("to_balance") String toBalance,
			Long amount
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponse(
			PaymentsBalanceExchangeResponseFrom from,
			PaymentsBalanceExchangeResponseTo to,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseFromBalance(
			String balance,
			long convertedBalance,
			String fullTitle,
			String title,
			String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseFrom(
			PaymentsBalanceExchangeResponseFromBalance balance,
			@JsonProperty("12345") BalanceModel _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseTo(
			UserModel balance
		) {}

		public record PaymentsTransferBody(
			@JsonProperty("user_id") Long userId,
			String username,
			Long amount,
			Currency currency,
			String comment,
			@JsonProperty("telegram_deal") Boolean telegramDeal,
			@JsonProperty("telegram_username") String telegramUsername,
			@JsonProperty("transfer_hold") Boolean transferHold,
			@JsonProperty("hold_length_value") Long holdLengthValue,
			@JsonProperty("hold_length_option") HoldLengthOption holdLengthOption
		) {
			public PaymentsTransferBody(Long amount, Currency currency) {
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
			PaymentsFeeResponseCalculator calculator,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsFeeResponseCalculator(
			long inputAmount,
			long commissionAmount,
			long totalOutputAmount
		) {}

		public record PaymentsCancelBody(
			@JsonProperty("payment_id") Long paymentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCancelResponse(
			String status,
			String message,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record PaymentsHistoryParams(
			PaymentsType type,
			Long pmin,
			Long pmax,
			Currency currency,
			Long page,
			@JsonProperty("operation_id_lt") Long operationIdLt,
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
			PaymentsHistoryResponsePayments payments,
			String perPage,
			long page,
			String pageNavLink,
			PaymentsHistoryResponsePageNavParams pageNavParams,
			String periodLabel,
			String periodLabelPhrase,
			boolean filterDatesDefault,
			PaymentsHistoryResponseInput input,
			JsonNode paymentStats,
			boolean hasNextPage,
			long lastOperationId,
			String nextPageHref,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments1234567890Data(
			@JsonProperty("user_id") long userId,
			String username,
			String comment,
			long fee,
			@JsonProperty("invoice_id") long invoiceId,
			@JsonProperty("is_test") boolean isTest,
			@JsonProperty("payment_id") String paymentId,
			String commentPlain,
			@JsonProperty("is_banned") long isBanned,
			@JsonProperty("display_style_group_id") long displayStyleGroupId,
			@JsonProperty("uniq_username_css") String uniqUsernameCss,
			@JsonProperty("uniq_banner") String uniqBanner,
			@JsonProperty("avatar_date") long avatarDate,
			@JsonProperty("user_group_id") long userGroupId,
			@JsonProperty("username_html") String usernameHtml,
			String avatar
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments1234567890Label(
			String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments1234567890Merchant(
			@JsonProperty("merchant_id") long merchantId,
			String name,
			@JsonProperty("user_id") long userId,
			@JsonProperty("created_date") long createdDate,
			@JsonProperty("secret_key") String secretKey,
			@JsonProperty("avatar_data") String avatarData,
			String url
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments1234567890User(
			@JsonProperty("user_id") long userId,
			@JsonProperty("user_balance") String userBalance,
			@JsonProperty("user_hold") String userHold,
			@JsonProperty("user_balance_with_hold") double userBalanceWithHold
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments1234567890(
			@JsonProperty("operation_id") long operationId,
			@JsonProperty("operation_date") long operationDate,
			@JsonProperty("operation_type") String operationType,
			@JsonProperty("outgoing_sum") String outgoingSum,
			@JsonProperty("incoming_sum") String incomingSum,
			@JsonProperty("item_id") long itemId,
			String wallet,
			@JsonProperty("is_finished") long isFinished,
			@JsonProperty("is_hold") long isHold,
			@JsonProperty("payment_system") String paymentSystem,
			PaymentsHistoryResponsePayments1234567890Data data,
			@JsonProperty("hold_end_date") long holdEndDate,
			@JsonProperty("operation_end_date") long operationEndDate,
			long api,
			String sum,
			@JsonProperty("payment_status") String paymentStatus,
			JsonNode supportLink,
			List<JsonNode> paymentSystemIcons,
			boolean canCancelPaidMailPayment,
			boolean canCancelBalanceTransfer,
			boolean canCancelBalancePayout,
			boolean canCancelBalanceHold,
			boolean canFinishBalanceTransfer,
			boolean canFinishBalancePayout,
			boolean canFinishBalanceHold,
			PaymentsHistoryResponsePayments1234567890Label label,
			PaymentsHistoryResponsePayments1234567890Merchant merchant,
			PaymentsHistoryResponsePayments1234567890User user
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePayments(
			@JsonProperty("1234567890") PaymentsHistoryResponsePayments1234567890 _1234567890
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePageNavParams(
			String type,
			String startDate,
			String endDate
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponseInput(
			@JsonProperty("user_id") long userId,
			String type,
			String startDate,
			String endDate,
			long page,
			@JsonProperty("period_label") String periodLabel,
			String receiver,
			String sender,
			String comment,
			String pmin,
			String pmax,
			@JsonProperty("category_id") long categoryId,
			String wallet,
			@JsonProperty("is_hold") boolean isHold,
			String currency,
			@JsonProperty("operation_id_lt") long operationIdLt
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponse(
			List<PaymentsPayoutServicesResponseSystems> systems,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBEP20(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTRC20(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersERC20(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTRX(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBTC(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTON(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersETH(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersLTC(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBNB(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersDASH(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersDOGE(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersXMR(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersSOL(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBCH(
			String title,
			boolean isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProviders(
			PaymentsPayoutServicesResponseSystemsProvidersBEP20 BEP20,
			PaymentsPayoutServicesResponseSystemsProvidersTRC20 TRC20,
			PaymentsPayoutServicesResponseSystemsProvidersERC20 ERC20,
			PaymentsPayoutServicesResponseSystemsProvidersTRX TRX,
			PaymentsPayoutServicesResponseSystemsProvidersBTC BTC,
			PaymentsPayoutServicesResponseSystemsProvidersTON TON,
			PaymentsPayoutServicesResponseSystemsProvidersETH ETH,
			PaymentsPayoutServicesResponseSystemsProvidersLTC LTC,
			PaymentsPayoutServicesResponseSystemsProvidersBNB BNB,
			PaymentsPayoutServicesResponseSystemsProvidersDASH DASH,
			PaymentsPayoutServicesResponseSystemsProvidersDOGE DOGE,
			PaymentsPayoutServicesResponseSystemsProvidersXMR XMR,
			PaymentsPayoutServicesResponseSystemsProvidersSOL SOL,
			PaymentsPayoutServicesResponseSystemsProvidersBCH BCH
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystems(
			String system,
			String commission,
			long min,
			long max,
			@JsonProperty("instant_payout") boolean instantPayout,
			@JsonProperty("problematic_payout") boolean problematicPayout,
			@JsonProperty("is_unavailable") boolean isUnavailable,
			boolean p2p,
			@JsonProperty("has_wallet") boolean hasWallet,
			PaymentsPayoutServicesResponseSystemsProviders providers
		) {}

		public record PaymentsPayoutBody(
			@JsonProperty("payment_system") String paymentSystem,
			String wallet,
			Double amount,
			Currency currency,
			@JsonProperty("include_fee") Boolean includeFee,
			JsonNode extra
		) {
			public PaymentsPayoutBody(String paymentSystem, String wallet, Double amount, Currency currency) {
				this(paymentSystem, wallet, amount, currency, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── AutoPaymentsApi Types ────────────────────────────────────────

	public static final class AutoPaymentsApiTypes {

		private AutoPaymentsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponse(
			AutoPaymentsListResponsePayments payments,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponsePayments1234567890ReceiverLinks(
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
		public record AutoPaymentsListResponsePayments1234567890ReceiverPermissions(
			boolean edit,
			boolean follow,
			boolean ignore,
			@JsonProperty("profile_post") boolean profilePost
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponsePayments1234567890ReceiverFields(
			String id,
			String title,
			String description,
			String position,
			@JsonProperty("is_required") boolean isRequired,
			String value
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponsePayments1234567890Receiver(
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
			AutoPaymentsListResponsePayments1234567890ReceiverLinks links,
			AutoPaymentsListResponsePayments1234567890ReceiverPermissions permissions,
			@JsonProperty("user_is_ignored") boolean userIsIgnored,
			@JsonProperty("user_is_visitor") boolean userIsVisitor,
			@JsonProperty("user_group_id") long userGroupId,
			List<AutoPaymentsListResponsePayments1234567890ReceiverFields> fields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponsePayments1234567890(
			@JsonProperty("user_id") long userId,
			@JsonProperty("receiver_id") long receiverId,
			String amount,
			String description,
			@JsonProperty("next_payment") long nextPayment,
			@JsonProperty("next_alert_date") long nextAlertDate,
			@JsonProperty("auto_payment_id") long autoPaymentId,
			String day,
			AutoPaymentsListResponsePayments1234567890Receiver receiver
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponsePayments(
			@JsonProperty("1234567890") AutoPaymentsListResponsePayments1234567890 _1234567890
		) {}

		public record AutoPaymentsCreateBody(
			@JsonProperty("secret_answer") String secretAnswer,
			@JsonProperty("username_receiver") String usernameReceiver,
			Day day,
			Double amount,
			Currency currency,
			String description
		) {
			public AutoPaymentsCreateBody(String usernameReceiver, Day day, Double amount) {
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
			@JsonProperty("auto_payment_id") Long autoPaymentId
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
			List<ProxyGetResponseProxies> proxies,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponseProxiesProxy(
			@JsonProperty("proxy_id") long proxyId,
			@JsonProperty("user_id") long userId,
			@JsonProperty("proxy_ip") String proxyIp,
			@JsonProperty("proxy_port") long proxyPort,
			@JsonProperty("proxy_user") String proxyUser,
			@JsonProperty("proxy_pass") String proxyPass,
			String proxyString
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponseProxies(
			ProxyGetResponseProxiesProxy proxy
		) {}

		public record ProxyAddBody(
			@JsonProperty("proxy_ip") String proxyIp,
			@JsonProperty("proxy_port") Long proxyPort,
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ProxyDeleteBody(
			@JsonProperty("proxy_id") Long proxyId,
			@JsonProperty("delete_all") Boolean deleteAll
		) {
			public ProxyDeleteBody() {
				this(null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── ImapApi Types ────────────────────────────────────────

	public static final class ImapApiTypes {

		private ImapApiTypes() {
		}

		public record ImapCreateBody(
			String domain,
			@JsonProperty("imap_server") String imapServer,
			Long port,
			Boolean secure
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ImapCreateResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

		public record ImapDeleteBody(
			String domain
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ImapDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponse(
			BatchBatchResponseJobs jobs,
			@JsonProperty("system_info") @Nullable Resp_SystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponseJobsJobId(
			@JsonProperty("_job_result") @Nullable String JobResult,
			@JsonProperty("_job_error") @Nullable String JobError
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponseJobs(
			@JsonProperty("job_id") BatchBatchResponseJobsJobId jobId
		) {}

	}

}
