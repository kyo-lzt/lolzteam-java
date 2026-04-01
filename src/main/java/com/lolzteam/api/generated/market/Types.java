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

	public enum Origin {
		BRUTE("brute"),
		PHISHING("phishing"),
		STEALER("stealer"),
		AUTOREG("autoreg"),
		PERSONAL("personal"),
		RESALE("resale"),
		DUMMY("dummy"),
		SELF_REGISTRATION("self_registration"),
		RETRIEVE_VIA_SUPPORT("retrieve_via_support");

		private final String value;

		Origin(String value) {
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

	public enum ItemOrigin {
		BRUTE("brute"),
		PHISHING("phishing"),
		STEALER("stealer"),
		AUTOREG("autoreg"),
		PERSONAL("personal"),
		RESALE("resale"),
		DUMMY("dummy"),
		SELF_REGISTRATION("self_registration"),
		RETRIEVE_VIA_SUPPORT("retrieve_via_support");

		private final String value;

		ItemOrigin(String value) {
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
			@JsonProperty("feedback_data") JsonNode feedbackData,
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
			@JsonProperty("restore_data") JsonNode restoreData,
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
			@Nullable JsonNode guarantee,
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
			JsonNode guarantee,
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
			JsonNode tags,
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** List of games. */
			@JsonProperty("game[]") List<Long> game,
			/** List of minimum hours played by game. */
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			/** List of maximum hours played by game. */
			@JsonProperty("hours_played_max") Map<String, Long> hoursPlayedMax,
			/** Guarantee type. */
			CategoryEg eg,
			/** List of VAC bans by game. */
			@JsonProperty("vac[]") List<Long> vac,
			/** Don't check game existence while checking for vac. */
			@JsonProperty("vac_skip_game_check") Boolean vacSkipGameCheck,
			/** Has community ban. Default: no */
			Rt rt,
			/** Has lifetime trade ban. */
			@JsonProperty("trade_ban") TradeBan tradeBan,
			/** Has temporary trade limit. */
			@JsonProperty("trade_limit") TradeLimit tradeLimit,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Has 5 $ limit. */
			Limit limit,
			/** Has .mafile (Steam Guard Authenticator). */
			Mafile mafile,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** Minimum level. */
			Long lmin,
			/** Maximum level. */
			Long lmax,
			/** Minimum rank in CS2 Matchmaking. */
			Long rmin,
			/** Maximum rank in CS2 Matchmaking. */
			Long rmax,
			/** Minimum rank in CS2 Wingman. */
			@JsonProperty("wingman_rmin") Long wingmanRmin,
			/** Maximum rank in CS2 Wingman. */
			@JsonProperty("wingman_rmax") Long wingmanRmax,
			/** Has no VAC ban. */
			@JsonProperty("no_vac") Boolean noVac,
			/** Has CS2 Matchmaking ban. */
			@JsonProperty("mm_ban") MmBan mmBan,
			/** Minimum balance. */
			@JsonProperty("balance_min") Long balanceMin,
			/** Maximum balance. */
			@JsonProperty("balance_max") Long balanceMax,
			/** Game ID to check inventory price. */
			@JsonProperty("inv_game") Long invGame,
			/** Minimum inventory price for game. */
			@JsonProperty("inv_min") Double invMin,
			/** Maximum inventory price for game. */
			@JsonProperty("inv_max") Double invMax,
			/** Minimum number of friends. */
			@JsonProperty("friends_min") Long friendsMin,
			/** Maximum number of friends. */
			@JsonProperty("friends_max") Long friendsMax,
			/** Minimum number of games. */
			Long gmin,
			/** Maximum number of games. */
			Long gmax,
			/** Minimum number of wins. */
			@JsonProperty("win_count_min") Long winCountMin,
			/** Maximum number of wins. */
			@JsonProperty("win_count_max") Long winCountMax,
			/** List of medal IDs. */
			@JsonProperty("medal_id[]") JsonNode medalId,
			/** Search for medals using "OR" instead of "AND". */
			@JsonProperty("medal_operator_or") Boolean medalOperatorOr,
			/** Minimum number of medals. */
			@JsonProperty("medal_min") Long medalMin,
			/** Maximum number of medals. */
			@JsonProperty("medal_max") Long medalMax,
			/** List of gifts. */
			@JsonProperty("gift[]") JsonNode gift,
			/** Minimum number of gifts. */
			@JsonProperty("gift_min") Long giftMin,
			/** Maximum number of gifts. */
			@JsonProperty("gift_max") Long giftMax,
			/** Minimum number of recently played hours. */
			@JsonProperty("recently_hours_min") Long recentlyHoursMin,
			/** Maximum number of recently played hours. */
			@JsonProperty("recently_hours_max") Long recentlyHoursMax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Minimum CS2 rank. */
			@JsonProperty("cs2_profile_rank_min") Long cs2ProfileRankMin,
			/** Maximum CS2 rank. */
			@JsonProperty("cs2_profile_rank_max") Long cs2ProfileRankMax,
			/** Minimum number of Dota 2 MMR. */
			@JsonProperty("solommr_min") Long solommrMin,
			/** Maximum number of Dota 2 MMR. */
			@JsonProperty("solommr_max") Long solommrMax,
			/** Minimum number of Dota 2 games. */
			@JsonProperty("d2_game_count_min") Long d2GameCountMin,
			/** Maximum number of Dota 2 games. */
			@JsonProperty("d2_game_count_max") Long d2GameCountMax,
			/** Minimum number of Dota 2 wins. */
			@JsonProperty("d2_win_count_min") Long d2WinCountMin,
			/** Maximum number of Dota 2 wins. */
			@JsonProperty("d2_win_count_max") Long d2WinCountMax,
			/** Minimum number of Dota 2 behavior. */
			@JsonProperty("d2_behavior_min") Long d2BehaviorMin,
			/** Maximum number of Dota 2 behavior. */
			@JsonProperty("d2_behavior_max") Long d2BehaviorMax,
			/** Minimum FACEIT level. */
			@JsonProperty("faceit_lvl_min") Long faceitLvlMin,
			/** Maximum FACEIT level. */
			@JsonProperty("faceit_lvl_max") Long faceitLvlMax,
			/** Minimum number of Steam points. */
			@JsonProperty("points_min") Long pointsMin,
			/** Maximum number of Steam points. */
			@JsonProperty("points_max") Long pointsMax,
			/** Minimum number of relevant games. */
			@JsonProperty("relevant_gmin") Long relevantGmin,
			/** Maximum number of relevant games. */
			@JsonProperty("relevant_gmax") Long relevantGmax,
			/** How old is last transaction. */
			@JsonProperty("last_trans_date") Long lastTransDate,
			/** In what notation is time measured. */
			@JsonProperty("last_trans_date_period") LastTransDatePeriod lastTransDatePeriod,
			/** How new is last transaction. */
			@JsonProperty("last_trans_date_later") Long lastTransDateLater,
			/** In what notation is time measured. */
			@JsonProperty("last_trans_date_period_later") LastTransDatePeriodLater lastTransDatePeriodLater,
			/** Has no transactions. */
			@JsonProperty("no_trans") Boolean noTrans,
			/** Has transactions. */
			Boolean trans,
			/** Minimum amount spent on gifts. */
			@JsonProperty("gifts_purchase_min") Double giftsPurchaseMin,
			/** Maximum amount spent on gifts. */
			@JsonProperty("gifts_purchase_max") Double giftsPurchaseMax,
			/** Minimum amount of refunds. */
			@JsonProperty("refunds_purchase_min") Double refundsPurchaseMin,
			/** Minimum amount of refunds. */
			@JsonProperty("refunds_purchase_max") Double refundsPurchaseMax,
			/** Minimum spend amount on in-game purchases. */
			@JsonProperty("ingame_purchase_min") Double ingamePurchaseMin,
			/** Maximum spend amount on in-game purchases. */
			@JsonProperty("ingame_purchase_max") Double ingamePurchaseMax,
			/** Minimum spend amount on all purchases. */
			@JsonProperty("games_purchase_min") Double gamesPurchaseMin,
			/** Maximum spend amount on all purchases. */
			@JsonProperty("games_purchase_max") Double gamesPurchaseMax,
			/** Minimum spend amount on all purchases. */
			@JsonProperty("purchase_min") Double purchaseMin,
			/** Maximum spend amount on all purchases. */
			@JsonProperty("purchase_max") Double purchaseMax,
			/** Has activated keys. */
			@JsonProperty("has_activated_keys") HasActivatedKeys hasActivatedKeys,
			/** Minimum Premier ELO in CS2. */
			@JsonProperty("elo_min") Long eloMin,
			/** Maximum Premier ELO in CS2. */
			@JsonProperty("elo_max") Long eloMax,
			/** Map for rank in CS2. */
			@JsonProperty("cs2_map_rank") Cs2MapRank cs2MapRank,
			/** Minimum rank in CS2 on a certain map. */
			@JsonProperty("cs2_map_rmin") Long cs2MapRmin,
			/** Maximum rank in CS2 on a certain map. */
			@JsonProperty("cs2_map_rmax") Long cs2MapRmax,
			/** Has FACEIT account. */
			@JsonProperty("has_faceit") HasFaceit hasFaceit,
			/** Minimum FACEIT level. */
			@JsonProperty("faceit_csgo_lvl_min") Long faceitCsgoLvlMin,
			/** Maximum FACEIT level. */
			@JsonProperty("faceit_csgo_lvl_max") Long faceitCsgoLvlMax,
			/** Minimum number of Rust deaths */
			@JsonProperty("rust_deaths_min") Long rustDeathsMin,
			/** Maximum number of Rust deaths */
			@JsonProperty("rust_deaths_max") Long rustDeathsMax,
			/** Minimum number of Rust kills */
			@JsonProperty("rust_kills_min") Long rustKillsMin,
			/** Maximum number of Rust kills */
			@JsonProperty("rust_kills_max") Long rustKillsMax,
			/** How old is last match of Dota 2. */
			@JsonProperty("d2_last_match_date") Long d2LastMatchDate,
			/** In what notation is time measured. */
			@JsonProperty("d2_last_match_date_period") D2LastMatchDatePeriod d2LastMatchDatePeriod,
			/** Minimum number of available to collect trading cards. */
			@JsonProperty("cards_min") Long cardsMin,
			/** Maximum number of available to collect trading cards. */
			@JsonProperty("cards_max") Long cardsMax,
			/** Minimum number of available games with available to collect trading cards. */
			@JsonProperty("cards_games_min") Long cardsGamesMin,
			/** Maximum number of available games with available to collect trading cards. */
			@JsonProperty("cards_games_max") Long cardsGamesMax,
			/** Ignore inventory value if game has VAC ban. */
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
		public record CategorySteamResponseItemsSteamFullGames(
			JsonNode list,
			long total
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Access to market temp mail. */
			@JsonProperty("temp_email") TempEmail tempEmail,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Guarantee type. */
			CategoryEgFortnite eg,
			/** Minimum number of skins. */
			Long smin,
			/** Maximum number of skins. */
			Long smax,
			/** Minimum number of V-Bucks. */
			Long vbmin,
			/** Maximum number of V-Bucks. */
			Long vbmax,
			/** Skins. */
			@JsonProperty("skin[]") JsonNode skin,
			/** Pickaxes. */
			@JsonProperty("pickaxe[]") JsonNode pickaxe,
			/** Gliders. */
			@JsonProperty("glider[]") JsonNode glider,
			/** Dances. */
			@JsonProperty("dance[]") JsonNode dance,
			/** Can change email. */
			@JsonProperty("change_email") ChangeEmail changeEmail,
			/** Platform. */
			@JsonProperty("platform[]") JsonNode platform,
			/** Minimum number of shop skins. */
			@JsonProperty("skins_shop_min") Long skinsShopMin,
			/** Maximum number of shop skins. */
			@JsonProperty("skins_shop_max") Long skinsShopMax,
			/** Minimum number of shop pickaxes. */
			@JsonProperty("pickaxes_shop_min") Long pickaxesShopMin,
			/** Maximum number of shop pickaxes. */
			@JsonProperty("pickaxes_shop_max") Long pickaxesShopMax,
			/** Minimum number of shop dances. */
			@JsonProperty("dances_shop_min") Long dancesShopMin,
			/** Maximum number of shop dances. */
			@JsonProperty("dances_shop_max") Long dancesShopMax,
			/** Minimum number of shop gliders. */
			@JsonProperty("gliders_shop_min") Long glidersShopMin,
			/** Maximum number of shop gliders. */
			@JsonProperty("gliders_shop_max") Long glidersShopMax,
			/** Minimum total cost of all skins in the shop in V-Bucks. */
			@JsonProperty("skins_shop_vbmin") Long skinsShopVbmin,
			/** Maximum total cost of all skins in the shop in V-Bucks. */
			@JsonProperty("skins_shop_vbmax") Long skinsShopVbmax,
			/** Minimum total cost of all pickaxes in the shop in V-Bucks. */
			@JsonProperty("pickaxes_shop_vbmin") Long pickaxesShopVbmin,
			/** Maximum total cost of all pickaxes in the shop in V-Bucks. */
			@JsonProperty("pickaxes_shop_vbmax") Long pickaxesShopVbmax,
			/** Minimum total cost of all dances in the shop in V-Bucks. */
			@JsonProperty("dances_shop_vbmin") Long dancesShopVbmin,
			/** Maximum total cost of all dances in the shop in V-Bucks. */
			@JsonProperty("dances_shop_vbmax") Long dancesShopVbmax,
			/** Minimum total cost of all gliders in the shop in V-Bucks. */
			@JsonProperty("gliders_shop_vbmin") Long glidersShopVbmin,
			/** Maximum total cost of all gliders in the shop in V-Bucks. */
			@JsonProperty("gliders_shop_vbmax") Long glidersShopVbmax,
			/** Has Battle Pass. */
			Bp bp,
			/** Minimum level. */
			Long lmin,
			/** Maximum level. */
			Long lmax,
			/** Minimum level of Battle Pass. */
			@JsonProperty("bp_lmin") Long bpLmin,
			/** Maximum level of Battle Pass. */
			@JsonProperty("bp_lmax") Long bpLmax,
			/** How old is last transaction. */
			@JsonProperty("last_trans_date") Long lastTransDate,
			/** In what notation is time measured. */
			@JsonProperty("last_trans_date_period") LastTransDatePeriod lastTransDatePeriod,
			/** Has no transactions. */
			@JsonProperty("no_trans") Boolean noTrans,
			/** Can be linked to Xbox. */
			@JsonProperty("xbox_linkable") XboxLinkable xboxLinkable,
			/** Can be linked to PSN. */
			@JsonProperty("psn_linkable") PsnLinkable psnLinkable,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Has Rocket League purchases. */
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** Minimum number of available refund credits. */
			@JsonProperty("refund_credits_min") Long refundCreditsMin,
			/** Maximum number of available refund credits. */
			@JsonProperty("refund_credits_max") Long refundCreditsMax,
			/** Minimum number of pickaxes. */
			@JsonProperty("pickaxe_min") Long pickaxeMin,
			/** Maximum number of pickaxes. */
			@JsonProperty("pickaxe_max") Long pickaxeMax,
			/** Minimum number of dances. */
			Long dmin,
			/** Maximum number of dances. */
			Long dmax,
			/** Minimum number of gliders. */
			Long gmin,
			/** Maximum number of gliders. */
			Long gmax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked email. */
			Email email,
			/** Has linked external accounts. */
			Ea ea,
			/** Region. */
			JsonNode region,
			/** List of disallowed regions. */
			@JsonProperty("not_region") JsonNode notRegion,
			/** List of characters. */
			@JsonProperty("genshin_character[]") JsonNode genshinCharacter,
			/** List of minimum constellations on characters. */
			@JsonProperty("genshin_character_constellations") Map<String, Long> genshinCharacterConstellations,
			/** List of maximum constellations on characters. */
			@JsonProperty("genshin_character_constellations_max") Map<String, Long> genshinCharacterConstellationsMax,
			/** List of weapons. */
			@JsonProperty("genshin_weapon[]") JsonNode genshinWeapon,
			/** Minimum number of characters. */
			@JsonProperty("genshin_char_min") Long genshinCharMin,
			/** Maximum number of characters. */
			@JsonProperty("genshin_char_max") Long genshinCharMax,
			/** Minimum number of legendary characters. */
			@JsonProperty("genshin_legendary_min") Long genshinLegendaryMin,
			/** Maximum number of legendary characters. */
			@JsonProperty("genshin_legendary_max") Long genshinLegendaryMax,
			/** Minimum level. */
			@JsonProperty("genshin_level_min") Long genshinLevelMin,
			/** Maximum level. */
			@JsonProperty("genshin_level_max") Long genshinLevelMax,
			/** Minimum number of legendary weapon characters. */
			@JsonProperty("genshin_legendary_weapon_min") Long genshinLegendaryWeaponMin,
			/** Maximum number of legendary weapon characters. */
			@JsonProperty("genshin_legendary_weapon_max") Long genshinLegendaryWeaponMax,
			/** Minimum number of constellations on legendary characters. */
			@JsonProperty("constellations_min") Long constellationsMin,
			/** Maximum number of constellations on legendary characters. */
			@JsonProperty("constellations_max") Long constellationsMax,
			/** Minimum number of achievements. */
			@JsonProperty("genshin_achievement_min") Long genshinAchievementMin,
			/** Maximum number of achievements. */
			@JsonProperty("genshin_achievement_max") Long genshinAchievementMax,
			/** Minimum number of primogems. */
			@JsonProperty("genshin_currency_min") Long genshinCurrencyMin,
			/** Maximum number of primogems. */
			@JsonProperty("genshin_currency_max") Long genshinCurrencyMax,
			/** List of characters. */
			@JsonProperty("honkai_character[]") JsonNode honkaiCharacter,
			/** List of minimum eidolons on characters. */
			@JsonProperty("honkai_character_eidolons") Map<String, Long> honkaiCharacterEidolons,
			/** List of maximum eidolons on characters. */
			@JsonProperty("honkai_character_eidolons_max") Map<String, Long> honkaiCharacterEidolonsMax,
			/** List of weapons. */
			@JsonProperty("honkai_weapon[]") JsonNode honkaiWeapon,
			/** Minimum number of characters. */
			@JsonProperty("honkai_char_min") Long honkaiCharMin,
			/** Maximum number of characters. */
			@JsonProperty("honkai_char_max") Long honkaiCharMax,
			/** Minimum number of legendary characters. */
			@JsonProperty("honkai_legendary_min") Long honkaiLegendaryMin,
			/** Maximum number of legendary characters. */
			@JsonProperty("honkai_legendary_max") Long honkaiLegendaryMax,
			/** Minimum level. */
			@JsonProperty("honkai_level_min") Long honkaiLevelMin,
			/** Maximum level. */
			@JsonProperty("honkai_level_max") Long honkaiLevelMax,
			/** Minimum number of legendary weapon characters. */
			@JsonProperty("honkai_legendary_weapon_min") Long honkaiLegendaryWeaponMin,
			/** Maximum number of legendary weapon characters. */
			@JsonProperty("honkai_legendary_weapon_max") Long honkaiLegendaryWeaponMax,
			/** Minimum number of constellations on Honkai: Star Rail legendary characters. */
			@JsonProperty("eidolons_min") Long eidolonsMin,
			/** Maximum number of legendary Honkai: Star Rail weapon characters. */
			@JsonProperty("eidolons_max") Long eidolonsMax,
			/** Minimum number of achievements. */
			@JsonProperty("honkai_achievement_min") Long honkaiAchievementMin,
			/** Maximum number of achievements. */
			@JsonProperty("honkai_achievement_max") Long honkaiAchievementMax,
			/** Minimum number of Stellar Jade. */
			@JsonProperty("honkai_currency_min") Long honkaiCurrencyMin,
			/** Maximum number of Stellar Jade. */
			@JsonProperty("honkai_currency_max") Long honkaiCurrencyMax,
			/** List of Zenless Zone Zero characters. */
			@JsonProperty("zenless_character[]") JsonNode zenlessCharacter,
			/** List of minimum cinemas on characters. */
			@JsonProperty("zenless_character_cinemas") Map<String, Long> zenlessCharacterCinemas,
			/** List of maximum cinemas on characters. */
			@JsonProperty("zenless_character_cinemas_max") Map<String, Long> zenlessCharacterCinemasMax,
			/** List of Zenless Zone Zero weapons. */
			@JsonProperty("zenless_weapon[]") JsonNode zenlessWeapon,
			/** Minimum number of Zenless Zone Zero legendary characters. */
			@JsonProperty("zenless_legendary_min") Long zenlessLegendaryMin,
			/** Maximum number of Zenless Zone Zero legendary characters. */
			@JsonProperty("zenless_legendary_max") Long zenlessLegendaryMax,
			/** Minimum number of cinemas on Zenless Zone Zero characters. */
			@JsonProperty("cinemas_min") Long cinemasMin,
			/** Maximum number of cinemas on Zenless Zone Zero characters. */
			@JsonProperty("cinemas_max") Long cinemasMax,
			/** Minimum number of legendary Zenless Zone Zero weapon characters. */
			@JsonProperty("zenless_legendary_weapon_min") Long zenlessLegendaryWeaponMin,
			/** Maximum number of legendary Zenless Zone Zero weapon characters. */
			@JsonProperty("zenless_legendary_weapon_max") Long zenlessLegendaryWeaponMax,
			/** Minimum number of Zenless Zone Zero characters. */
			@JsonProperty("zenless_char_min") Long zenlessCharMin,
			/** Maximum number of Zenless Zone Zero characters. */
			@JsonProperty("zenless_char_max") Long zenlessCharMax,
			/** Minimum Zenless Zone Zero level. */
			@JsonProperty("zenless_level_min") Long zenlessLevelMin,
			/** Maximum Zenless Zone Zero level. */
			@JsonProperty("zenless_level_max") Long zenlessLevelMax,
			/** Minimum count of Zenless Zone Zero achievements. */
			@JsonProperty("zenless_achievement_min") Long zenlessAchievementMin,
			/** Maximum count of Zenless Zone Zero achievements. */
			@JsonProperty("zenless_achievement_max") Long zenlessAchievementMax,
			/** Minimum count of Zenless Zone Zero polychrome. */
			@JsonProperty("zenless_currency_min") Long zenlessCurrencyMin,
			/** Maximum count of Zenless Zone Zero polychrome. */
			@JsonProperty("zenless_currency_max") Long zenlessCurrencyMax,
			/** Number of days the account has been offline. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Minimum valorant rank. */
			Long rmin,
			/** Maximum valorant rank. */
			Long rmax,
			/** Last minimum valorant rank. */
			@JsonProperty("last_rmin") Long lastRmin,
			/** Last maximum valorant rank. */
			@JsonProperty("last_rmax") Long lastRmax,
			/** Previous minimum rank. */
			@JsonProperty("previous_rmin") Long previousRmin,
			/** Previous maximum rank. */
			@JsonProperty("previous_rmax") Long previousRmax,
			/** List of weapon skins. */
			@JsonProperty("weaponSkin[]") List<String> weaponSkin,
			/** List of buddies. */
			@JsonProperty("buddy[]") List<String> buddy,
			/** List of agents. */
			@JsonProperty("agent[]") List<String> agent,
			/** List of champions. */
			@JsonProperty("champion[]") List<String> champion,
			/** List of LoL skins. */
			@JsonProperty("skin[]") List<String> skin,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum level in Valorant. */
			@JsonProperty("valorant_level_min") Long valorantLevelMin,
			/** Maximum level in Valorant. */
			@JsonProperty("valorant_level_max") Long valorantLevelMax,
			/** Minimum level in LoL. */
			@JsonProperty("lol_level_min") Long lolLevelMin,
			/** Maximum level in LoL. */
			@JsonProperty("lol_level_max") Long lolLevelMax,
			/** Minimum inventory value. */
			@JsonProperty("inv_min") Long invMin,
			/** Maximum inventory value. */
			@JsonProperty("inv_max") Long invMax,
			/** Minimum number of Valorant points. */
			@JsonProperty("vp_min") Long vpMin,
			/** Maximum number of Valorant points. */
			@JsonProperty("vp_max") Long vpMax,
			/** Minimum number of skins. */
			@JsonProperty("valorant_smin") Long valorantSmin,
			/** Maximum number of skins. */
			@JsonProperty("valorant_smax") Long valorantSmax,
			/** List of allowed rank types. */
			@JsonProperty("valorant_rank_type[]") JsonNode valorantRankType,
			/** Minimum amount of agents. */
			Long amin,
			/** Maximum amount of agents. */
			Long amax,
			/** List of allowed regions in Valorant. */
			@JsonProperty("valorant_region[]") List<String> valorantRegion,
			/** List of disallowed regions in Valorant. */
			@JsonProperty("valorant_not_region[]") List<String> valorantNotRegion,
			/** List of allowed regions in LoL. */
			@JsonProperty("lol_region[]") List<String> lolRegion,
			/** List of disallowed regions in LoL. */
			@JsonProperty("lol_not_region[]") List<String> lolNotRegion,
			/** Has any knife. */
			Boolean knife,
			/** Minimum number of skins in LoL. */
			@JsonProperty("lol_smin") Long lolSmin,
			/** Maximum number of skins in LoL. */
			@JsonProperty("lol_smax") Long lolSmax,
			/** Minimum number of champions. */
			@JsonProperty("champion_min") Long championMin,
			/** Maximum number of champions. */
			@JsonProperty("champion_max") Long championMax,
			/** Minimum win-rate. */
			@JsonProperty("win_rate_min") Long winRateMin,
			/** Maximum win-rate. */
			@JsonProperty("win_rate_max") Long winRateMax,
			/** Minimum wallet blue balance. */
			@JsonProperty("blue_min") Long blueMin,
			/** Maximum wallet blue balance. */
			@JsonProperty("blue_max") Long blueMax,
			/** Minimum wallet orange balance. */
			@JsonProperty("orange_min") Long orangeMin,
			/** Maximum wallet orange balance. */
			@JsonProperty("orange_max") Long orangeMax,
			/** Minimum wallet mythic balance. */
			@JsonProperty("mythic_min") Long mythicMin,
			/** Maximum wallet mythic balance. */
			@JsonProperty("mythic_max") Long mythicMax,
			/** Minimum wallet riot balance. */
			@JsonProperty("riot_min") Long riotMin,
			/** Maximum wallet riot balance. */
			@JsonProperty("riot_max") Long riotMax,
			/** Has linked email. */
			Email email,
			/** Has linked mobile. */
			Tel tel,
			/** Minimum knifes in Valorant. */
			@JsonProperty("valorant_knife_min") Long valorantKnifeMin,
			/** Maximum knifes in Valorant. */
			@JsonProperty("valorant_knife_max") Long valorantKnifeMax,
			/** Minimum number of Valorant Radiant Points. */
			@JsonProperty("rp_min") Long rpMin,
			/** Maximum number of Valorant Radiant Points. */
			@JsonProperty("rp_max") Long rpMax,
			/** Minimum number of Valorant free agents. */
			@JsonProperty("fa_min") Long faMin,
			/** Maximum number of Valorant free agents. */
			@JsonProperty("fa_max") Long faMax,
			/** List of allowed ranks in LoL. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Has a spam ban. */
			Spam spam,
			/** Has a cloud password. */
			Password password,
			/** Has a premium subscription. */
			Premium premium,
			/** When premium subscription will be active */
			@JsonProperty("premium_expiration") Long premiumExpiration,
			/** In what notation is time measured */
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum number of channels. */
			@JsonProperty("min_channels") Long minChannels,
			/** Maximum number of channels. */
			@JsonProperty("max_channels") Long maxChannels,
			/** Minimum number of chats. */
			@JsonProperty("min_chats") Long minChats,
			/** Maximum number of chats. */
			@JsonProperty("max_chats") Long maxChats,
			/** Minimum number of conversations. */
			@JsonProperty("min_conversations") Long minConversations,
			/** Maximum number of conversations. */
			@JsonProperty("max_conversations") Long maxConversations,
			/** Minimum number of channels, where account is administrator/owner. */
			@JsonProperty("min_admin") Long minAdmin,
			/** Maximum number of channels, where account is administrator/owner. */
			@JsonProperty("max_admin") Long maxAdmin,
			/** Minimum number of subscribers in channel, where account is administrator/owner. */
			@JsonProperty("min_admin_sub") Long minAdminSub,
			/** Maximum number of subscribers in channel, where account is administrator/owner. */
			@JsonProperty("max_admin_sub") Long maxAdminSub,
			/** Minimum number of digits in ID. */
			@JsonProperty("dig_min") Long digMin,
			/** Maximum number of digits in ID. */
			@JsonProperty("dig_max") Long digMax,
			/** Minimum number of contacts. */
			@JsonProperty("min_contacts") Long minContacts,
			/** Maximum number of contacts. */
			@JsonProperty("max_contacts") Long maxContacts,
			/** Minimum number of Telegram Stars. */
			@JsonProperty("min_stars") Long minStars,
			/** Maximum number of Telegram Stars. */
			@JsonProperty("max_stars") Long maxStars,
			/** Birthday was X time before. */
			Long birthday,
			/** In what notation is time measured. */
			@JsonProperty("birthday_period") BirthdayPeriod birthdayPeriod,
			/** Birthday was X time after. */
			@JsonProperty("birthday_after") Long birthdayAfter,
			/** In what notation is time measured. */
			@JsonProperty("birthday_after_period") BirthdayAfterPeriod birthdayAfterPeriod,
			/** Minimum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB. */
			@JsonProperty("min_id") Long minId,
			/** Maximum ID of account, will be rounded down till nearest 10k. Available if your balance is higher than 100000 RUB. */
			@JsonProperty("max_id") Long maxId,
			/** Allow geo spam block in search with spam=no. */
			@JsonProperty("allow_geo_spamblock") Boolean allowGeoSpamblock,
			/** Minimum number of Telegram gifts on account. */
			@JsonProperty("min_gifts") Long minGifts,
			/** Maximum number of Telegram gifts on account. */
			@JsonProperty("max_gifts") Long maxGifts,
			/** Minimum number of Telegram NFT gifts on account. */
			@JsonProperty("min_nft_gifts") Long minNftGifts,
			/** Maximum number of Telegram NFT gifts on account. */
			@JsonProperty("max_nft_gifts") Long maxNftGifts,
			/** Minimum value of all Stars gifts. */
			@JsonProperty("min_gifts_stars") Long minGiftsStars,
			/** Maximum value of all Stars gifts. */
			@JsonProperty("max_gifts_stars") Long maxGiftsStars,
			/** Minimum value of all Stars gifts after convert. */
			@JsonProperty("min_gifts_convert_stars") Long minGiftsConvertStars,
			/** Maximum value of all Stars gifts after convert. */
			@JsonProperty("max_gifts_convert_stars") Long maxGiftsConvertStars,
			/** List of allowed DC ID. */
			@JsonProperty("dc_id[]") List<Long> dcId,
			/** List of disallowed DC ID. */
			@JsonProperty("not_dc_id[]") List<Long> notDcId,
			/** Has linked email. */
			Email email,
			/** Minimum number of bots. */
			@JsonProperty("min_bots") Long minBots,
			/** Maximum number of bots. */
			@JsonProperty("max_bots") Long maxBots,
			/** Minimum active users in bot. */
			@JsonProperty("min_bot_active_users") Long minBotActiveUsers,
			/** Maximum active users in bot. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Guarantee type. */
			CategoryEgFortnite eg,
			/** Has linked mobile. */
			Tel tel,
			/** Minimum Brawl Stars level. */
			@JsonProperty("brawl_level_min") Long brawlLevelMin,
			/** Maximum Brawl Stars level. */
			@JsonProperty("brawl_level_max") Long brawlLevelMax,
			/** Minimum number of Brawl Stars trophies. */
			@JsonProperty("brawl_cup_min") Long brawlCupMin,
			/** Maximum number of Brawl Stars trophies. */
			@JsonProperty("brawl_cup_max") Long brawlCupMax,
			/** Minimum number of Brawl Stars wins. */
			@JsonProperty("brawl_wins_min") Long brawlWinsMin,
			/** Maximum number of Brawl Stars wins. */
			@JsonProperty("brawl_wins_max") Long brawlWinsMax,
			/** Has Brawl Pass. */
			@JsonProperty("brawl_pass") BrawlPass brawlPass,
			/** List of brawlers. */
			@JsonProperty("brawler[]") JsonNode brawler,
			/** Minimum number of brawlers. */
			@JsonProperty("brawlers_min") Long brawlersMin,
			/** Maximum number of brawlers. */
			@JsonProperty("brawlers_max") Long brawlersMax,
			/** Minimum number of legendary brawlers. */
			@JsonProperty("legendary_brawlers_min") Long legendaryBrawlersMin,
			/** Maximum number of legendary brawlers. */
			@JsonProperty("legendary_brawlers_max") Long legendaryBrawlersMax,
			/** Minimum Clash Royale level. */
			@JsonProperty("royale_level_min") Long royaleLevelMin,
			/** Maximum Clash Royale level. */
			@JsonProperty("royale_level_max") Long royaleLevelMax,
			/** Minimum number of Clash Royale trophies. */
			@JsonProperty("royale_cup_min") Long royaleCupMin,
			/** Maximum number of Clash Royale trophies. */
			@JsonProperty("royale_cup_max") Long royaleCupMax,
			/** Minimum number of Clash Royale wins. */
			@JsonProperty("royale_wins_min") Long royaleWinsMin,
			/** Maximum number of Clash Royale wins. */
			@JsonProperty("royale_wins_max") Long royaleWinsMax,
			/** Minimum King level in Clash Royale. */
			@JsonProperty("king_level_min") Long kingLevelMin,
			/** Maximum King level in Clash Royale. */
			@JsonProperty("king_level_max") Long kingLevelMax,
			/** Has Royale Pass. */
			@JsonProperty("royale_pass") RoyalePass royalePass,
			/** Minimum Clash of Clans level. */
			@JsonProperty("clash_level_min") Long clashLevelMin,
			/** Maximum Clash of Clans level. */
			@JsonProperty("clash_level_max") Long clashLevelMax,
			/** Minimum number of Clash of Clans trophies. */
			@JsonProperty("clash_cup_min") Long clashCupMin,
			/** Maximum number of Clash of Clans trophies. */
			@JsonProperty("clash_cup_max") Long clashCupMax,
			/** Minimum number of Clash of Clans wins. */
			@JsonProperty("clash_wins_min") Long clashWinsMin,
			/** Maximum number of Clash of Clans wins. */
			@JsonProperty("clash_wins_max") Long clashWinsMax,
			/** Has Battle Pass. */
			@JsonProperty("clash_pass") ClashPass clashPass,
			/** Minimum total heroes level count in Clash of Clans. */
			@JsonProperty("total_heroes_level_min") Long totalHeroesLevelMin,
			/** Maximum total heroes level count in Clash of Clans. */
			@JsonProperty("total_heroes_level_max") Long totalHeroesLevelMax,
			/** Minimum total troops level count in Clash of Clans. */
			@JsonProperty("total_troops_level_min") Long totalTroopsLevelMin,
			/** Maximum total troops level count in Clash of Clans. */
			@JsonProperty("total_troops_level_max") Long totalTroopsLevelMax,
			/** Minimum total spells level count in Clash of Clans. */
			@JsonProperty("total_spells_level_min") Long totalSpellsLevelMin,
			/** Maximum total spells level count in Clash of Clans. */
			@JsonProperty("total_spells_level_max") Long totalSpellsLevelMax,
			/** Minimum total builder village heroes level count in Clash of Clans. */
			@JsonProperty("total_builder_heroes_level_min") Long totalBuilderHeroesLevelMin,
			/** Maximum total builder village heroes level count in Clash of Clans. */
			@JsonProperty("total_builder_heroes_level_max") Long totalBuilderHeroesLevelMax,
			/** Minimum total builder village troops level count in Clash of Clans. */
			@JsonProperty("total_builder_troops_level_min") Long totalBuilderTroopsLevelMin,
			/** Maximum total builder village troops level count in Clash of Clans. */
			@JsonProperty("total_builder_troops_level_max") Long totalBuilderTroopsLevelMax,
			/** Minimum level of town hall. */
			@JsonProperty("town_hall_level_min") Long townHallLevelMin,
			/** Maximum level of town hall. */
			@JsonProperty("town_hall_level_max") Long townHallLevelMax,
			/** Minimum level of builder hall. */
			@JsonProperty("builder_hall_level_min") Long builderHallLevelMin,
			/** Maximum level of builder hall. */
			@JsonProperty("builder_hall_level_max") Long builderHallLevelMax,
			/** Minimum number of builder hall cups. */
			@JsonProperty("builder_hall_cup_min") Long builderHallCupMin,
			/** Maximum number of builder hall cups. */
			@JsonProperty("builder_hall_cup_max") Long builderHallCupMax,
			/** Minimum account creation year (e.g. 2023). */
			@JsonProperty("creation_year_min") Long creationYearMin,
			/** Maximum account creation year (e.g. 2024). */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** List of games. */
			@JsonProperty("game[]") List<String> game,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Minimum count of games. */
			Long gmin,
			/** Maximum count of games. */
			Long gmax,
			/** Minimum rank points in Apex Legends. */
			@JsonProperty("al_rank_min") Long alRankMin,
			/** Maximum rank points in Apex Legends. */
			@JsonProperty("al_rank_max") Long alRankMax,
			/** Minimum level in Apex Legends. */
			@JsonProperty("al_level_min") Long alLevelMin,
			/** Maximum level in Apex Legends. */
			@JsonProperty("al_level_max") Long alLevelMax,
			/** Has a ban in any game. */
			@JsonProperty("has_ban") HasBan hasBan,
			/** Xbox connected to account. */
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			/** Steam connected to account. */
			@JsonProperty("steam_connected") SteamConnected steamConnected,
			/** PSN connected to account. */
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			/** Name of subscription. */
			CategorySubscription subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** List of minimum hours played by game. */
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			/** List of maximum hours played by game. */
			@JsonProperty("hours_played_max") Map<String, Long> hoursPlayedMax,
			/** Has transactions. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked mobile. */
			Tel tel,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum number of battles. */
			@JsonProperty("battles_min") Long battlesMin,
			/** Maximum number of battles. */
			@JsonProperty("battles_max") Long battlesMax,
			/** Minimum number of gold. */
			@JsonProperty("gold_min") Long goldMin,
			/** Maximum number of gold. */
			@JsonProperty("gold_max") Long goldMax,
			/** Minimum number of silver. */
			@JsonProperty("silver_min") Long silverMin,
			/** Maximum number of silver. */
			@JsonProperty("silver_max") Long silverMax,
			/** Minimum number of top tanks. */
			@JsonProperty("top_min") Long topMin,
			/** Maximum number of top tanks. */
			@JsonProperty("top_max") Long topMax,
			/** Minimum number of premium tanks. */
			@JsonProperty("prem_min") Long premMin,
			/** Maximum number of premium tanks. */
			@JsonProperty("prem_max") Long premMax,
			/** Minimum number of top premium tanks. */
			@JsonProperty("top_prem_min") Long topPremMin,
			/** Maximum number of top premium tanks. */
			@JsonProperty("top_prem_max") Long topPremMax,
			/** Minimum number of wins. */
			@JsonProperty("win_pmin") Long winPmin,
			/** Maximum number of wins. */
			@JsonProperty("win_pmax") Long winPmax,
			/** List of tanks. */
			@JsonProperty("tank[]") List<Long> tank,
			/** Region. */
			@JsonProperty("region[]") JsonNode region,
			/** Exclude region. */
			@JsonProperty("not_region[]") JsonNode notRegion,
			/** Has a premium subscription. */
			Premium premium,
			/** When premium subscription will be active */
			@JsonProperty("premium_expiration") Long premiumExpiration,
			/** In what notation is time measured */
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			/** Has clan. */
			Clan clan,
			/** List of allowed clan role. */
			@JsonProperty("clan_role[]") JsonNode clanRole,
			/** List of disallowed clan role. */
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			/** Minimum number of gold in clan treasure. */
			@JsonProperty("clan_gold_min") Long clanGoldMin,
			/** Maximum number of gold in clan treasure. */
			@JsonProperty("clan_gold_max") Long clanGoldMax,
			/** Minimum number of credits in clan treasure. */
			@JsonProperty("clan_credits_min") Long clanCreditsMin,
			/** Maximum number of credits in clan treasure. */
			@JsonProperty("clan_credits_max") Long clanCreditsMax,
			/** Minimum number of crystal in clan treasure. */
			@JsonProperty("clan_crystal_min") Long clanCrystalMin,
			/** Maximum number of crystal in clan treasure. */
			@JsonProperty("clan_crystal_max") Long clanCrystalMax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
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
			JsonNode wotTanks,
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked mobile. */
			Tel tel,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum number of battles. */
			@JsonProperty("battles_min") Long battlesMin,
			/** Maximum number of battles. */
			@JsonProperty("battles_max") Long battlesMax,
			/** Minimum number of gold. */
			@JsonProperty("gold_min") Long goldMin,
			/** Maximum number of gold. */
			@JsonProperty("gold_max") Long goldMax,
			/** Minimum number of silver. */
			@JsonProperty("silver_min") Long silverMin,
			/** Maximum number of silver. */
			@JsonProperty("silver_max") Long silverMax,
			/** Minimum number of top tanks. */
			@JsonProperty("top_min") Long topMin,
			/** Maximum number of top tanks. */
			@JsonProperty("top_max") Long topMax,
			/** Minimum number of premium tanks. */
			@JsonProperty("prem_min") Long premMin,
			/** Maximum number of premium tanks. */
			@JsonProperty("prem_max") Long premMax,
			/** Minimum number of top premium tanks. */
			@JsonProperty("top_prem_min") Long topPremMin,
			/** Maximum number of top premium tanks. */
			@JsonProperty("top_prem_max") Long topPremMax,
			/** Minimum number of wins. */
			@JsonProperty("win_pmin") Long winPmin,
			/** Maximum number of wins. */
			@JsonProperty("win_pmax") Long winPmax,
			/** List of tanks. */
			@JsonProperty("tank[]") List<Long> tank,
			/** Region. */
			@JsonProperty("region[]") JsonNode region,
			/** Exclude region. */
			@JsonProperty("not_region[]") JsonNode notRegion,
			/** Has a premium subscription. */
			Premium premium,
			/** When premium subscription will be active */
			@JsonProperty("premium_expiration") Long premiumExpiration,
			/** In what notation is time measured */
			@JsonProperty("premium_expiration_period") PremiumExpirationPeriod premiumExpirationPeriod,
			/** Has clan. */
			Clan clan,
			/** List of allowed clan role. */
			@JsonProperty("clan_role[]") JsonNode clanRole,
			/** List of disallowed clan role. */
			@JsonProperty("not_clan_role[]") JsonNode notClanRole,
			/** Minimum number of gold in clan treasure. */
			@JsonProperty("clan_gold_min") Long clanGoldMin,
			/** Maximum number of gold in clan treasure. */
			@JsonProperty("clan_gold_max") Long clanGoldMax,
			/** Minimum number of credits in clan treasure. */
			@JsonProperty("clan_credits_min") Long clanCreditsMin,
			/** Maximum number of credits in clan treasure. */
			@JsonProperty("clan_credits_max") Long clanCreditsMax,
			/** Minimum number of crystal in clan treasure. */
			@JsonProperty("clan_crystal_min") Long clanCrystalMin,
			/** Maximum number of crystal in clan treasure. */
			@JsonProperty("clan_crystal_max") Long clanCrystalMax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
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
			JsonNode wotTanks,
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Name of subscription. */
			CategorySubscriptionGifts subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Guarantee type. */
			CategoryEgFortnite eg,
			/** List of games. */
			@JsonProperty("game[]") List<String> game,
			/** Can change email. */
			@JsonProperty("change_email") ChangeEmail changeEmail,
			/** Has Rocket League purchases. */
			@JsonProperty("rl_purchases") Boolean rlPurchases,
			/** Minimum epic wallet balance. */
			@JsonProperty("balance_min") Double balanceMin,
			/** Maximum epic wallet balance. */
			@JsonProperty("balance_max") Double balanceMax,
			/** Minimum rewards balance. */
			@JsonProperty("rewards_balance_min") Double rewardsBalanceMin,
			/** Maximum rewards balance. */
			@JsonProperty("rewards_balance_max") Double rewardsBalanceMax,
			/** Minimum number of games. */
			Long gmin,
			/** Maximum number of games. */
			Long gmax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** List of minimum hours played by game. */
			@JsonProperty("hours_played") Map<String, Long> hoursPlayed,
			/** List of maximum hours played by game. */
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
			@JsonProperty("eg_games") JsonNode egGames,
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Region. */
			Region region,
			/** List of versions. */
			@JsonProperty("version[]") JsonNode version,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** Minimum level. */
			@JsonProperty("level_min") Long levelMin,
			/** Maximum level. */
			@JsonProperty("level_max") Long levelMax,
			/** Access to pve. */
			Pve pve,
			/** Side in current wipe. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum number of Social Club level. */
			@JsonProperty("level_min") Long levelMin,
			/** Maximum number of Social Club level. */
			@JsonProperty("level_max") Long levelMax,
			/** Minimum number of GTA V cash */
			@JsonProperty("cash_min") Long cashMin,
			/** Maximum number of GTA V cash */
			@JsonProperty("cash_max") Long cashMax,
			/** Minimum number of GTA V bank cash */
			@JsonProperty("bank_cash_min") Long bankCashMin,
			/** Maximum number of GTA V bank cash */
			@JsonProperty("bank_cash_max") Long bankCashMax,
			/** List of games. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** List of games. */
			@JsonProperty("game[]") List<String> game,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum count of games. */
			Long gmin,
			/** Maximum count of games. */
			Long gmax,
			/** Name of subscription. */
			CategorySubscriptionUplay subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** Minimum level in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_level_min") Long r6LevelMin,
			/** Maximum level in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_level_max") Long r6LevelMax,
			/** Minimum rank points in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_rank_min") Long r6RankMin,
			/** Maximum rank points in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_rank_max") Long r6RankMax,
			/** Minimum count of operators in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_operators_min") Long r6OperatorsMin,
			/** Maximum count of operators in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_operators_max") Long r6OperatorsMax,
			/** Is account banned in Tom Clancy's Rainbow Six Siege */
			@JsonProperty("r6_ban") R6Ban r6Ban,
			/** Minimum number of skins in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_smin") Long r6Smin,
			/** Maximum number of skins in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_smax") Long r6Smax,
			/** List of weapon skins in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_skin[]") List<String> r6Skin,
			/** List of operators in Tom Clancy's Rainbow Six Siege. */
			@JsonProperty("r6_operator[]") List<String> r6Operator,
			/** Xbox connected to account. */
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			/** PSN connected to account. */
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			/** Steam connected to account. */
			@JsonProperty("steam_connected") SteamConnected steamConnected,
			/** Minimum balance. */
			@JsonProperty("balance_min") Double balanceMin,
			/** Maximum balance. */
			@JsonProperty("balance_max") Double balanceMax,
			/** Has transactions. */
			Transactions transactions,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked mobile. */
			Tel tel,
			/** Has nitro. */
			Nitro nitro,
			/** Nitro type. */
			@JsonProperty("nitro_type[]") JsonNode nitroType,
			/** Length of nitro. */
			@JsonProperty("nitro_length") Long nitroLength,
			/** In what notation is time measured. */
			@JsonProperty("nitro_period") NitroPeriod nitroPeriod,
			/** Minimum number of boosts. */
			@JsonProperty("boosts_min") Long boostsMin,
			/** Maximum number of boosts. */
			@JsonProperty("boosts_max") Long boostsMax,
			/** Has billing. */
			Billing billing,
			/** Has gifts. */
			Gifts gifts,
			/** Has transactions. */
			Transactions transactions,
			/** List of badges. */
			@JsonProperty("badge[]") JsonNode badge,
			/** List of account conditions. */
			@JsonProperty("condition[]") JsonNode condition,
			/** Minimum number of chats. */
			@JsonProperty("chat_min") Long chatMin,
			/** Maximum number of chats. */
			@JsonProperty("chat_max") Long chatMax,
			/** Minimum number of subscribers in server, where account is administrator/owner. */
			@JsonProperty("min_admin_members") Long minAdminMembers,
			/** Maximum number of subscribers in server, where account is administrator/owner. */
			@JsonProperty("max_admin_members") Long maxAdminMembers,
			/** Minimum number of servers, where account is administrator/owner. */
			@JsonProperty("min_admin") Long minAdmin,
			/** Maximum number of servers, where account is administrator/owner. */
			@JsonProperty("max_admin") Long maxAdmin,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** List of languages. */
			@JsonProperty("language[]") List<String> language,
			/** List of languages that won't be included. */
			@JsonProperty("not_language[]") List<String> notLanguage,
			/** Has clans. */
			Clans clans,
			/** Minimum number of clans, where account is administrator. */
			@JsonProperty("min_admin_clans") Long minAdminClans,
			/** Maximum number of clans, where account is administrator. */
			@JsonProperty("max_admin_clans") Long maxAdminClans,
			/** Minimum number of clans, where account is owner. */
			@JsonProperty("min_owner_clans") Long minOwnerClans,
			/** Maximum number of clans, where account is owner. */
			@JsonProperty("max_owner_clans") Long maxOwnerClans,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Minimum count of servers. */
			@JsonProperty("min_servers") Long minServers,
			/** Maximum count of servers. */
			@JsonProperty("max_servers") Long maxServers,
			/** Has two-factor authentication. */
			@JsonProperty("2fa") _2fa _2fa,
			/** Minimum number of Nitro full credits. */
			@JsonProperty("min_full_credits") Long minFullCredits,
			/** Maximum number of Nitro full credits. */
			@JsonProperty("max_full_credits") Long maxFullCredits,
			/** Minimum number of Nitro basic credits. */
			@JsonProperty("min_basic_credits") Long minBasicCredits,
			/** Maximum number of Nitro basic credits. */
			@JsonProperty("max_basic_credits") Long maxBasicCredits,
			/** Minimum number of Discord Orbs. */
			@JsonProperty("min_orbs") Long minOrbs,
			/** Maximum number of Discord Orbs. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked mobile. */
			Tel tel,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** Minimum number of followers. */
			@JsonProperty("followers_min") Long followersMin,
			/** Maximum number of followers. */
			@JsonProperty("followers_max") Long followersMax,
			/** Minimum number of posts. */
			@JsonProperty("post_min") Long postMin,
			/** Maximum number of posts. */
			@JsonProperty("post_max") Long postMax,
			/** Minimum number of likes. */
			@JsonProperty("like_min") Long likeMin,
			/** Maximum number of likes. */
			@JsonProperty("like_max") Long likeMax,
			/** Minimum number of coins. */
			@JsonProperty("coins_min") Long coinsMin,
			/** Maximum number of coins. */
			@JsonProperty("coins_max") Long coinsMax,
			/** Login by cookies. */
			@JsonProperty("cookie_login") CookieLogin cookieLogin,
			/** Has verified. */
			Verified verified,
			/** Has linked email. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Has linked mobile. */
			Tel tel,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Login by cookies. */
			Cookies cookies,
			/** Login without cookies. */
			@JsonProperty("login_without_cookies") LoginWithoutCookies loginWithoutCookies,
			/** Minimum number of followers. */
			@JsonProperty("followers_min") Long followersMin,
			/** Maximum number of followers. */
			@JsonProperty("followers_max") Long followersMax,
			/** Minimum number of posts. */
			@JsonProperty("post_min") Long postMin,
			/** Maximum number of posts. */
			@JsonProperty("post_max") Long postMax,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** Guarantee type. */
			CategoryEgBattleNet eg,
			/** List of games. */
			@JsonProperty("game[]") List<Long> game,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Has linked mobile. */
			Tel tel,
			/** Can edit BattleTag. */
			@JsonProperty("edit_btag") EditBtag editBtag,
			/** Can edit full name. */
			@JsonProperty("changeable_fn") ChangeableFn changeableFn,
			/** Real id. */
			@JsonProperty("real_id") RealId realId,
			/** Has disabled parent control. */
			@JsonProperty("parent_control") ParentControl parentControl,
			/** Has no bans. */
			@JsonProperty("no_bans") NoBans noBans,
			/** Minimum balance. */
			@JsonProperty("balance_min") Long balanceMin,
			/** Maximum balance. */
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
		public record CategoryBattleNetResponseItemsBumpSettings(
			boolean canBumpItem,
			boolean canBumpItemGlobally,
			JsonNode shortErrorPhrase,
			JsonNode errorPhrase
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
			CategoryBattleNetResponseItemsBumpSettings bumpSettings,
			boolean canBumpItem,
			boolean canBuyItem,
			@JsonProperty("rub_price") long rubPrice,
			@JsonProperty("price_currency") String priceCurrency,
			boolean canValidateAccount,
			boolean canResellItemAfterPurchase,
			boolean isSmallExf,
			@JsonProperty("account_last_activity") long accountLastActivity,
			JsonNode battlenetGames,
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Email type. */
			@JsonProperty("email_type[]") JsonNode emailType,
			/** Domain of native/autoreg email. */
			@JsonProperty("item_domain") String itemDomain,
			/** List of allowed subscriptions. */
			@JsonProperty("subscription[]") JsonNode subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** Is auto renewal enabled. */
			Autorenewal autorenewal,
			/** Has linked mobile. */
			Tel tel,
			/** Has transactions. */
			Transactions transactions,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** List of allowed tiers. */
			@JsonProperty("openai_tier[]") JsonNode openaiTier,
			/** Minimum OpenAI credit balance. */
			@JsonProperty("openai_balance_min") Long openaiBalanceMin,
			/** Maximum OpenAI credit balance. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** List of allowed VPN services. */
			@JsonProperty("service[]") JsonNode service,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** Is auto renewal enabled. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Has verified email. */
			Email email,
			/** Minimum robux. */
			@JsonProperty("robux_min") Long robuxMin,
			/** Maximum robux. */
			@JsonProperty("robux_max") Long robuxMax,
			/** Minimum friends. */
			@JsonProperty("friends_min") Long friendsMin,
			/** Maximum friends. */
			@JsonProperty("friends_max") Long friendsMax,
			/** Minimum number of followers. */
			@JsonProperty("followers_min") Long followersMin,
			/** Maximum number of followers. */
			@JsonProperty("followers_max") Long followersMax,
			/** List of allowed countries. */
			List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country") List<String> notCountry,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** Name of subscription. */
			CategorySubscriptionRoblox subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** Is auto renewal enabled. */
			Autorenewal autorenewal,
			/** Xbox connected to account. */
			@JsonProperty("xbox_connected") XboxConnected xboxConnected,
			/** PSN connected to account. */
			@JsonProperty("psn_connected") PsnConnected psnConnected,
			/** Has verified. */
			Verified verified,
			/** Account is age verified via documents. */
			@JsonProperty("age_verified") AgeVerified ageVerified,
			/** Minimum amount of incoming robux. */
			@JsonProperty("incoming_robux_total_min") Long incomingRobuxTotalMin,
			/** Maximum amount of incoming robux. */
			@JsonProperty("incoming_robux_total_max") Long incomingRobuxTotalMax,
			/** Minimum limited items value. */
			@JsonProperty("limited_price_min") Long limitedPriceMin,
			/** Maximum limited items value. */
			@JsonProperty("limited_price_max") Long limitedPriceMax,
			/** Minimum total Robux cost of all game passes in popular Roblox games.. */
			@JsonProperty("gamepass_min") Long gamepassMin,
			/** Maximum total Robux cost of all game passes in popular Roblox games.. */
			@JsonProperty("gamepass_max") Long gamepassMax,
			/** Has game donations. */
			@JsonProperty("game_donations") GameDonations gameDonations,
			/** Minimum inventory value. */
			@JsonProperty("inv_min") Long invMin,
			/** Maximum inventory value. */
			@JsonProperty("inv_max") Long invMax,
			/** Minimum UGC limited items value. */
			@JsonProperty("ugc_limited_price_min") Long ugcLimitedPriceMin,
			/** Maximum UGC limited items value. */
			@JsonProperty("ugc_limited_price_max") Long ugcLimitedPriceMax,
			/** Minimum credit balance. */
			@JsonProperty("credit_balance_min") Long creditBalanceMin,
			/** Maximum credit balance. */
			@JsonProperty("credit_balance_max") Long creditBalanceMax,
			/** Minimum offsale items count. */
			@JsonProperty("offsale_min") Long offsaleMin,
			/** Maximum offsale items count. */
			@JsonProperty("offsale_max") Long offsaleMax,
			/** Voice chat is available. */
			Voice voice,
			/** List of allowed age groups. */
			@JsonProperty("age_group[]") List<String> ageGroup,
			/** List of disallowed age groups. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Minimum rank. */
			@JsonProperty("rank_min") Long rankMin,
			/** Maximum rank. */
			@JsonProperty("rank_max") Long rankMax,
			/** Minimum bonus rank. */
			@JsonProperty("bonus_rank_min") Long bonusRankMin,
			/** Maximum bonus rank. */
			@JsonProperty("bonus_rank_max") Long bonusRankMax,
			/** Has linked mobile. */
			Tel tel,
			/** Number of days the account has been offline. */
			Long daybreak,
			/** Minimum amount of Kredits. */
			@JsonProperty("kredits_min") Long kreditsMin,
			/** Maximum amount of Kredits. */
			@JsonProperty("kredits_max") Long kreditsMax,
			/** Minimum total donated Kredits. */
			@JsonProperty("total_kredits_min") Long totalKreditsMin,
			/** Maximum total donated Kredits. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** Name of subscription. */
			CategorySubscriptionMinecraft subscription,
			/** Length of subscription. */
			@JsonProperty("subscription_length") Long subscriptionLength,
			/** In what notation is time measured. */
			@JsonProperty("subscription_period") SubscriptionPeriod subscriptionPeriod,
			/** Is auto renewal enabled. */
			Autorenewal autorenewal,
			/** Has java edition. */
			Java java,
			/** Has bedrock edition. */
			Bedrock bedrock,
			/** Has Minecraft Dungeons. */
			Dungeons dungeons,
			/** Has Minecraft Legends. */
			Legends legends,
			/** Can change nickname. */
			@JsonProperty("change_nickname") ChangeNickname changeNickname,
			/** List of capes. */
			@JsonProperty("capes[]") List<String> capes,
			/** Minimum number of capes. */
			@JsonProperty("capes_min") Long capesMin,
			/** Maximum number of capes. */
			@JsonProperty("capes_max") Long capesMax,
			/** List of allowed countries. */
			@JsonProperty("country[]") List<String> country,
			/** List of disallowed countries. */
			@JsonProperty("not_country[]") List<String> notCountry,
			/** Has active Hypixel ban. */
			@JsonProperty("hypixel_ban") HypixelBan hypixelBan,
			/** Is API enabled in Hypixel Skyblock. */
			@JsonProperty("hypixel_skyblock_api_enabled") HypixelSkyblockApiEnabled hypixelSkyblockApiEnabled,
			/** Rank on hypixel. */
			@JsonProperty("rank_hypixel[]") JsonNode rankHypixel,
			/** Minimum number of level hypixel. */
			@JsonProperty("level_hypixel_min") Long levelHypixelMin,
			/** Maximum number of level hypixel. */
			@JsonProperty("level_hypixel_max") Long levelHypixelMax,
			/** Minimum number of achievement hypixel. */
			@JsonProperty("achievement_hypixel_min") Long achievementHypixelMin,
			/** Maximum number of achievement hypixel. */
			@JsonProperty("achievement_hypixel_max") Long achievementHypixelMax,
			/** Minimum level on Hypixel SkyBlock. */
			@JsonProperty("level_hypixel_skyblock_min") Long levelHypixelSkyblockMin,
			/** Maximum level on Hypixel SkyBlock. */
			@JsonProperty("level_hypixel_skyblock_max") Long levelHypixelSkyblockMax,
			/** Minimum net worth on Hypixel SkyBlock. */
			@JsonProperty("net_worth_hypixel_skyblock_min") Long netWorthHypixelSkyblockMin,
			/** Maximum net worth on Hypixel SkyBlock. */
			@JsonProperty("net_worth_hypixel_skyblock_max") Long netWorthHypixelSkyblockMax,
			/** How old is the account. */
			Long reg,
			/** In what notation is time measured. */
			@JsonProperty("reg_period") RegPeriod regPeriod,
			/** How old is the last login account. */
			@JsonProperty("last_login_hypixel") Long lastLoginHypixel,
			/** In what notation is time measured. */
			@JsonProperty("last_login_hypixel_period") LastLoginHypixelPeriod lastLoginHypixelPeriod,
			/** Can change details. */
			@JsonProperty("can_change_details") CanChangeDetails canChangeDetails,
			/** Minimum number of characters in nickname. */
			@JsonProperty("nickname_length_min") Long nicknameLengthMin,
			/** Maximum number of characters in nickname. */
			@JsonProperty("nickname_length_max") Long nicknameLengthMax,
			/** Was Hypixel ban parsed by Market. */
			@JsonProperty("hypixel_ban_parsed") HypixelBanParsed hypixelBanParsed,
			/** Minimum number of Minecoins. */
			@JsonProperty("minecoins_min") Long minecoinsMin,
			/** Maximum number of Minecoins. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
			@JsonProperty("parse_same_item_ids") Boolean parseSameItemIds,
			/** List of allowed editions. */
			@JsonProperty("edition[]") JsonNode edition,
			/** Minimum number of profiles with game. */
			@JsonProperty("profiles_min") Long profilesMin,
			/** Maximum number of profiles with game. */
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
			/** Display top queries for per category. */
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
			@JsonProperty("base_params") @Nullable JsonNode baseParams,
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
			/** User id. */
			@JsonProperty("user_id") Long userId,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			/** The number of the page to display results from. */
			Long page,
			/** Account status. */
			Show show,
			/** Delete reason. (Only if **show** is set to **deleted**) */
			@JsonProperty("delete_reason") String deleteReason,
			/** The word or words contained in the account title. */
			String title,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** Login. */
			String login,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** Sold before. */
			Boolean sb,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Not sold before. */
			Boolean nsb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Username of buyer. (If **show** is **paid**) */
			String username,
			/** Start date for filtering by publication date. */
			@JsonProperty("published_startDate") String publishedStartDate,
			/** End date for filtering by publication date. */
			@JsonProperty("published_endDate") String publishedEndDate,
			/** Enable filtering by publication date. */
			@JsonProperty("filter_by_published_date") Boolean filterByPublishedDate,
			/** Start date for filtering by buyer operation date. */
			@JsonProperty("paid_startDate") String paidStartDate,
			/** End date for filtering by buyer operation date. */
			@JsonProperty("paid_endDate") String paidEndDate,
			/** Enable filtering by buyer operation date. */
			@JsonProperty("filter_by_buyer_operation_date") Boolean filterByBuyerOperationDate,
			/** Start date for filtering by deletion date. */
			@JsonProperty("delete_startDate") String deleteStartDate,
			/** End date for filtering by deletion date. */
			@JsonProperty("delete_endDate") String deleteEndDate,
			/** Enable filtering by deletion date. */
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
			/** User id. */
			@JsonProperty("user_id") Long userId,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			/** The number of the page to display results from. */
			Long page,
			/** Account status. */
			Show show,
			/** The word or words contained in the account title. */
			String title,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** Login. */
			String login,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** Sold before. */
			Boolean sb,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Not sold before. */
			Boolean nsb,
			/** Not sold by me before. */
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
			/** User ID. */
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
			/** Format of the downloaded accounts. */
			Format format,
			/** Custom format string for download. (Required if **format** is set to **custom**) */
			@JsonProperty("custom_format") String customFormat,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			/** The number of the page to display results from. */
			Long page,
			/** Account status. */
			Show show,
			/** Delete reason. (Only if **show** is set to **deleted**) */
			@JsonProperty("delete_reason") String deleteReason,
			/** The word or words contained in the account title. */
			String title,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** Sold before. */
			Boolean sb,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Not sold before. */
			Boolean nsb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Username of buyer. (If **show** is **paid**) */
			String username,
			/** Start date for filtering by publication date. */
			@JsonProperty("published_startDate") String publishedStartDate,
			/** End date for filtering by publication date. */
			@JsonProperty("published_endDate") String publishedEndDate,
			/** Enable filtering by publication date. */
			@JsonProperty("filter_by_published_date") Boolean filterByPublishedDate,
			/** Start date for filtering by buyer operation date. */
			@JsonProperty("paid_startDate") String paidStartDate,
			/** End date for filtering by buyer operation date. */
			@JsonProperty("paid_endDate") String paidEndDate,
			/** Enable filtering by buyer operation date. */
			@JsonProperty("filter_by_buyer_operation_date") Boolean filterByBuyerOperationDate,
			/** Start date for filtering by deletion date. */
			@JsonProperty("delete_startDate") String deleteStartDate,
			/** End date for filtering by deletion date. */
			@JsonProperty("delete_endDate") String deleteEndDate,
			/** Enable filtering by deletion date. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Account status. */
			Show show,
			/** The word or words contained in the account title. */
			String title,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** Sold before. */
			Boolean sb,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Not sold before. */
			Boolean nsb,
			/** Not sold by me before. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Account status. */
			Show show,
			/** The word or words contained in the account title. */
			String title,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** Sold before. */
			Boolean sb,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Not sold before. */
			Boolean nsb,
			/** Not sold by me before. */
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
			/** Parse same item ids. */
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
			/** Delete reason. */
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
			/** Item id. */
			@JsonProperty("item_id") Long itemId,
			/** You should describe what's happened. - describe the situation in a nutshell. If you wish, you can describe the situation in more detail using the "Spoiler" function. - attach screenshots of correspondence. You must upload to the site [Imgur](https://imgur.com/upload) - other evidence; - notify the respondent about the complaint you created, familiarize him with hidden content Describe the situation in as much detail as possible. */
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
			/** Item id. */
			@JsonProperty("item_id") List<Long> itemId,
			/** Parse same item ids. */
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
			/** Application id. */
			@JsonProperty("app_id") AppId appId,
			/** Currency in which the inventory value will be returned */
			Currency currency,
			/** Ignore cache. */
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
		public record ManagingSteamInventoryValueResponseData(
			JsonNode items,
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
			/** Link or id of account. Can be [**https://lzt.market/{item-id}/ **, **https://steamcommunity.com/id/{steam-name}**, **https://steamcommunity.com/profiles/{steam-id}**, **{steam-id}**]. */
			String link,
			/** Application id. */
			@JsonProperty("app_id") AppId appId,
			/** Currency in which the inventory value will be returned */
			Currency currency,
			/** Ignore cache. */
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
		public record ManagingSteamValueResponseData(
			JsonNode items,
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
			/** Type of page. */
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
			/** Title of account. If **title** specified and **title_en** is empty, **title_en** will be automatically translated to English language. */
			String title,
			/** English title of account. If **title_en** specified and **title** is empty, **title** will be automatically translated to Russian language. */
			@JsonProperty("title_en") String titleEn,
			/** Current price of account in your currency. */
			Long price,
			Currency currency,
			/** Account origin. */
			@JsonProperty("item_origin") ItemOrigin itemOrigin,
			/** Email login data (email:password format). */
			@JsonProperty("email_login_data") String emailLoginData,
			/** Email type. */
			@JsonProperty("email_type") EmailType emailType,
			/** Allow users to ask discount for this account. */
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			/** Using proxy id for account checking. See GET or POST /proxy to get or edit proxy list. */
			@JsonProperty("proxy_id") Long proxyId,
			/** Account public description. */
			String description,
			/** Account private information (visible only for buyer). */
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
			/** Text of note. */
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
			/** Update the entire Steam inventory. */
			Boolean all,
			/** Application id. */
			@JsonProperty("app_id") AppId appId,
			/** Parse inventory when authorized (Parse trade banned items). */
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
			/** Interval in hours */
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
			/** Type of image. */
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
			/** Email login data (email:password format). Required if both *email* and *password* are not provided. */
			@JsonProperty("email_password") String emailPassword,
			/** Email. Required if *email_password* is not provided. */
			String email,
			/** Password. Required if *email_password* is not provided. */
			String password,
			/** Number of letters to return. */
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
			/** Confirmation id. (Required along with **nonce** if you want to confirm action). */
			Long id,
			/** Confirmation nonce. (Required along with **id** if you want to confirm action). */
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
			/** You voluntarily and with full awareness of your actions waive any claims regarding this account. */
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
			/** Cancel change password recommendation. It will be helpful, if you don't want to change password and get login data. */
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
			/** Tag ID. */
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
			/** Tag ID. */
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
			/** Tag ID. */
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
			/** Tag ID. */
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
			/** The username of the new account owner. */
			String username,
			/** Secret answer of your account. */
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
			/** Filter claims by their type. */
			ProfileType type,
			/** Filter claims by their state. */
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
			/** List of hidden fields to include. */
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
			/** Usernames who can transfer market accounts to you. Separate values with a comma. */
			@JsonProperty("allow_accept_accounts") List<String> allowAcceptAccounts,
			/** Telegram api id. */
			@JsonProperty("telegram_api_id") String telegramApiId,
			/** Telegram api hash. */
			@JsonProperty("telegram_api_hash") String telegramApiHash,
			/** Telegram device model. */
			@JsonProperty("telegram_device_model") String telegramDeviceModel,
			/** Telegram system version. */
			@JsonProperty("telegram_system_version") String telegramSystemVersion,
			/** Telegram app version. */
			@JsonProperty("telegram_app_version") String telegramAppVersion,
			/** Telegram lang pack. */
			@JsonProperty("telegram_lang_pack") String telegramLangPack,
			/** Telegram lang code. */
			@JsonProperty("telegram_lang_code") String telegramLangCode,
			/** Telegram system lang code. */
			@JsonProperty("telegram_system_lang_code") String telegramSystemLangCode,
			/** Clear Telegram data. */
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
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			/** The number of the page to display results from. */
			Long page,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** The word or words contained in the account title. */
			String title,
			/** Order by. */
			@JsonProperty("order_by") OrderBy orderBy,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("tag_id[]") List<Long> tagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_tag_id[]") List<Long> notTagId,
			/** List of tag ids (Tag list is available via **GET /me**). */
			@JsonProperty("public_tag_id[]") List<Long> publicTagId,
			/** List of tag ids that won't be included (Tag list is available via **GET /me**). */
			@JsonProperty("not_public_tag_id[]") List<Long> notPublicTagId,
			/** List of account origins. */
			@JsonProperty("origin[]") Origin origin,
			/** List of account origins that won't be included. */
			@JsonProperty("not_origin[]") JsonNode notOrigin,
			/** Search accounts of user. */
			@JsonProperty("user_id") Long userId,
			/** Not sold before. */
			Boolean nsb,
			/** Sold before. */
			Boolean sb,
			/** Not sold by me before. */
			@JsonProperty("nsb_by_me") Boolean nsbByMe,
			/** Sold by me before. */
			@JsonProperty("sb_by_me") Boolean sbByMe,
			/** Currency in which the cost of the account will be searched. */
			Currency currency,
			/** Has email login data. */
			@JsonProperty("email_login_data") Boolean emailLoginData,
			/** Email provider. */
			@JsonProperty("email_provider[]") JsonNode emailProvider,
			/** Email provider. */
			@JsonProperty("not_email_provider[]") NotEmailProvider notEmailProvider,
			/** Parse same item ids. */
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
			/** Item id. */
			@JsonProperty("item_id") Long itemId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartAddResponse(
			boolean success,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record CartDeleteBody(
			/** Item id. */
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
			/** Current price of account in your currency. */
			Double price,
			/** Balance ID that will be used to purchase specified item. */
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
			JsonNode guarantee,
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
			JsonNode tags,
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
			JsonNode guarantee,
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
			/** Current price of account in your currency. */
			Long price,
			/** Balance ID that will be used to purchase specified item. */
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
			/** Requested discounted price. */
			@JsonProperty("discount_price") Double discountPrice,
			/** Message to the seller. */
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
			/** User ID. */
			@JsonProperty("user_id") Long userId,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			/** Discount percent to apply. */
			@JsonProperty("discount_percent") Double discountPercent,
			/** Minimum accounts price for which the discount applies. */
			@JsonProperty("min_price") Double minPrice,
			/** Maximum accounts price for which the discount applies. */
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
			/** ID of the discount to edit. */
			@JsonProperty("discount_id") Long discountId,
			/** Discount percent to apply. */
			@JsonProperty("discount_percent") Double discountPercent,
			/** Minimum price for which the discount applies. */
			@JsonProperty("min_price") Double minPrice,
			/** Maximum price for which the discount applies. */
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
			/** ID of the discount to delete. */
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
			/** Title of account. If **title** specified and **title_en** is empty, **title_en** will be automatically translated to English language. */
			String title,
			/** English title of account. If **title_en** specified and **title** is empty, **title** will be automatically translated to Russian language. */
			@JsonProperty("title_en") String titleEn,
			/** Current price of account in your currency. */
			Double price,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			Currency currency,
			/** Account origin. */
			@JsonProperty("item_origin") ItemOrigin itemOrigin,
			/** Guarantee type. */
			@JsonProperty("extended_guarantee") ExtendedGuarantee extendedGuarantee,
			/** Allow users to ask discount for this account. */
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			/** Proxy id that will be used to check account. */
			@JsonProperty("proxy_id") Long proxyId,
			/** Set this parameter to **true** so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to **false** or not set, the Market will take a specific proxy from its pool, which is predefined for each item. &gt; This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
			@JsonProperty("random_proxy") Boolean randomProxy,
			/** Account public description. */
			String description,
			/** Account private information (visible only for buyer). */
			String information,
			/** Account login (or email). */
			String login,
			/** Account password. */
			String password,
			/** Account login data (login:password format). */
			@JsonProperty("login_password") String loginPassword,
			/** Required if a **category** is one of list of Required email login data categories. */
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			/** Required if a **category** is one of list of Required email login data categories. Email login data (email:password format). */
			@JsonProperty("email_login_data") String emailLoginData,
			/** Email type. */
			@JsonProperty("email_type") EmailType emailType,
			JsonNode extra
		) {
			public PublishingFastSellBody(Double price, CategoryId categoryId, Currency currency, ItemOrigin itemOrigin) {
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
			/** Title of account. If **title** specified and **title_en** is empty, **title_en** will be automatically translated to English language. */
			String title,
			/** English title of account. If **title_en** specified and **title** is empty, **title** will be automatically translated to Russian language. */
			@JsonProperty("title_en") String titleEn,
			/** Current price of account in your currency. */
			Double price,
			/** Accounts category. */
			@JsonProperty("category_id") CategoryId categoryId,
			Currency currency,
			/** Account origin. */
			@JsonProperty("item_origin") ItemOrigin itemOrigin,
			/** Guarantee type. */
			@JsonProperty("extended_guarantee") ExtendedGuarantee extendedGuarantee,
			/** Account public description. */
			String description,
			/** Account private information (visible only for buyer). */
			String information,
			/** Get temporary email if not required by category. Available for Supercell, Fortnite and Epic Games categories. */
			Boolean forceTempEmail,
			/** Put item id, if you are trying to resell item. This is useful to pass temporary email from reselling item to new item. You will get same temporary email from reselling account. */
			@JsonProperty("resell_item_id") Long resellItemId,
			/** Required if a **category** is one of list of Required email login data categories. */
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			/** Required if a **category** is one of list of Required email login data categories. Email login data (email:password format). */
			@JsonProperty("email_login_data") String emailLoginData,
			/** Email type. */
			@JsonProperty("email_type") EmailType emailType,
			/** Allow users to ask discount for this account. */
			@JsonProperty("allow_ask_discount") Boolean allowAskDiscount,
			/** Proxy id that will be used to check account. */
			@JsonProperty("proxy_id") Long proxyId,
			/** Set this parameter to **true** so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to **false** or not set, the Market will take a specific proxy from its pool, which is predefined for each item. &gt; This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
			@JsonProperty("random_proxy") Boolean randomProxy
		) {
			public PublishingAddBody(Double price, CategoryId categoryId, Currency currency, ItemOrigin itemOrigin) {
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
			/** Put if you are trying to resell an account. */
			@JsonProperty("resell_item_id") Long resellItemId,
			/** Set this parameter to **true** so that the Market will take a random proxy from its pool for each of your requests. Otherwise, if this parameter is set to **false** or not set, the Market will take a specific proxy from its pool, which is predefined for each item. &gt; This parameter only works with proxies from the Market pool. If you want to use your own proxies, use the proxy_id or extra[proxy] parameter. */
			@JsonProperty("random_proxy") Boolean randomProxy,
			/** Account login (or email). */
			String login,
			/** Account password. */
			String password,
			/** Account login data (login:password format). */
			@JsonProperty("login_password") String loginPassword,
			/** Required if a **category** is one of list of Required email login data categories. */
			@JsonProperty("has_email_login_data") Boolean hasEmailLoginData,
			/** Required if a **category** is one of list of Required email login data categories. Email login data (email:password format). */
			@JsonProperty("email_login_data") String emailLoginData,
			/** Email type. */
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
			JsonNode guarantee,
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
			JsonNode tags,
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
			/** External account type. */
			PublishingType type,
			/** Account login data (login:password format). */
			String login,
			/** Email login data (email:password format). */
			@JsonProperty("email_login_data") String emailLoginData,
			/** Cookies. */
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
			/** Invoice ID. */
			@JsonProperty("invoice_id") Long invoiceId,
			/** Payment ID. */
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
			/** Invoice amount. */
			Double amount,
			/** Payment ID in your system (must be unique within the merchant / invoices). */
			@JsonProperty("payment_id") String paymentId,
			/** Comment to the invoice. */
			String comment,
			/** URL to redirect to after successful payment. */
			@JsonProperty("url_success") String urlSuccess,
			/** Callback url. */
			@JsonProperty("url_callback") String urlCallback,
			/** Merchant ID. */
			@JsonProperty("merchant_id") Long merchantId,
			/** Telegram User ID for which the invoice was created. */
			@JsonProperty("required_telegram_id") Long requiredTelegramId,
			/** Telegram Username (including @) for which the invoice was created (if any). */
			@JsonProperty("required_telegram_username") String requiredTelegramUsername,
			/** Invoice lifetime. Default: 3600 */
			Double lifetime,
			/** Additional information for you. */
			@JsonProperty("additional_data") String additionalData,
			/** Create a test invoice. */
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
			/** The number of the page to display results from. */
			Long page,
			/** Currency of the created invoice. */
			Currency currency,
			/** Status of the invoice. */
			Status status,
			/** Invoice amount. */
			Double amount,
			/** Merchant ID. */
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
			/** Source balance type */
			@JsonProperty("from_balance") String fromBalance,
			/** Target balance type */
			@JsonProperty("to_balance") String toBalance,
			/** Amount to exchange */
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
			/** User id of receiver. If **user_id** specified, **username** is not required. */
			@JsonProperty("user_id") Long userId,
			/** Username of receiver. If **username** specified, **user_id** is not required. */
			String username,
			/** Amount to send in your currency. */
			Long amount,
			Currency currency,
			/** Transfer comment. */
			String comment,
			/** Is the deal happening on Telegram?  */
			@JsonProperty("telegram_deal") Boolean telegramDeal,
			/** Telegram username of the user you are dialoguing with. */
			@JsonProperty("telegram_username") String telegramUsername,
			/** Hold transfer or not. */
			@JsonProperty("transfer_hold") Boolean transferHold,
			/** Hold length value. */
			@JsonProperty("hold_length_value") Long holdLengthValue,
			/** Hold length option. */
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
			/** Amount you want to send in your currency. */
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
			/** Payment id. */
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
			/** Type of operation. */
			PaymentsType type,
			/** Minimal price of account (Inclusive). */
			Long pmin,
			/** Maximum price of account (Inclusive). */
			Long pmax,
			/** Currency. */
			Currency currency,
			/** The number of the page to display results from. */
			Long page,
			/** Id of the operation from which the result begins. */
			@JsonProperty("operation_id_lt") Long operationIdLt,
			/** Username of user, which receive money from you. */
			String receiver,
			/** Username of user, which sent money to you. */
			String sender,
			/** Returns payments that are done via API. */
			@JsonProperty("is_api") Boolean isApi,
			/** Start date of operation (RFC 3339 date format). */
			String startDate,
			/** End date of operation (RFC 3339 date format). */
			String endDate,
			/** Wallet, which used for money payouts. */
			String wallet,
			/** Comment for money transfers. */
			String comment,
			/** Display hold operations. */
			@JsonProperty("is_hold") Boolean isHold,
			/** Display payment stats for selected period (outgoing value, incoming value). */
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
			JsonNode payments,
			@JsonProperty("system_info") Resp_SystemInfo systemInfo
		) {}

		public record AutoPaymentsCreateBody(
			/** Secret answer. */
			@JsonProperty("secret_answer") String secretAnswer,
			/** Username of the payment receiver. */
			@JsonProperty("username_receiver") String usernameReceiver,
			/** Day of the month for the payment. (Use "0" for the last day of the month) */
			Day day,
			/** Amount to be transferred. */
			Double amount,
			Currency currency,
			/** Payment description. */
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
			/** Auto payment ID. */
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
			/** Proxy ip or host. Required if **proxy_row** is not specified. */
			@JsonProperty("proxy_ip") String proxyIp,
			/** Proxy port. Required if **proxy_row** is not specified. */
			@JsonProperty("proxy_port") Long proxyPort,
			/** Proxy username. Required if **proxy_row** is not specified. */
			@JsonProperty("proxy_user") String proxyUser,
			/** Proxy password. Required if **proxy_row** is not specified. */
			@JsonProperty("proxy_pass") String proxyPass,
			/** Proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \r\n separator) */
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
			/** Id of an existing proxy. */
			@JsonProperty("proxy_id") Long proxyId,
			/** Delete all proxies. */
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
			/** Domain to delete IMAP configuration for. */
			String domain,
			/** IMAP server address. */
			@JsonProperty("imap_server") String imapServer,
			/** IMAP server port. */
			Long port,
			/** Whether to use a secure connection. */
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
			/** Domain to delete IMAP configuration for. */
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
