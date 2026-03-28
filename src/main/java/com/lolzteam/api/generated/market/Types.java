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
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("discount_id") Double discountId,
			@JsonProperty("discount_percent") Double discountPercent,
			@JsonProperty("discount_user_id") Double discountUserId,
			@JsonProperty("max_price") Double maxPrice,
			@JsonProperty("min_price") Double minPrice,
			@JsonProperty("user_id") Double userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModel(
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("activity_visible") @Nullable JsonNode activityVisible,
			Double age,
			@Nullable String balance,
			@Nullable List<UserModelBalances> balances,
			@JsonProperty("bump_item_period") Double bumpItemPeriod,
			@JsonProperty("can_edit") @Nullable JsonNode canEdit,
			@JsonProperty("can_follow") @Nullable JsonNode canFollow,
			@JsonProperty("can_ignore") @Nullable JsonNode canIgnore,
			@JsonProperty("can_post_profile") @Nullable JsonNode canPostProfile,
			@JsonProperty("can_view_profile") @Nullable JsonNode canViewProfile,
			@JsonProperty("can_view_profile_posts") @Nullable JsonNode canViewProfilePosts,
			@JsonProperty("can_warn") @Nullable JsonNode canWarn,
			@JsonProperty("contest_count") Double contestCount,
			@JsonProperty("conv_welcome_message") @Nullable String convWelcomeMessage,
			Double convertedBalance,
			Double convertedDeposit,
			Double convertedHold,
			@Nullable String currency,
			@Nullable String currencyPhrase,
			@JsonProperty("custom_account_download_format") @Nullable String customAccountDownloadFormat,
			@JsonProperty("custom_fields") @Nullable UserModelCustomFields customFields,
			@JsonProperty("custom_title") @Nullable String customTitle,
			Double deposit,
			@Nullable UserModelDob dob,
			@JsonProperty("feedback_data") @Nullable JsonNode feedbackData,
			@Nullable String hold,
			@Nullable String homepage,
			@JsonProperty("imap_data") @Nullable UserModelImapData imapData,
			@JsonProperty("is_admin") @Nullable JsonNode isAdmin,
			@JsonProperty("is_banned") @Nullable JsonNode isBanned,
			@JsonProperty("is_followed") @Nullable JsonNode isFollowed,
			@JsonProperty("is_ignored") @Nullable JsonNode isIgnored,
			@JsonProperty("is_moderator") @Nullable JsonNode isModerator,
			@JsonProperty("is_staff") @Nullable JsonNode isStaff,
			@JsonProperty("is_super_admin") @Nullable JsonNode isSuperAdmin,
			@JsonProperty("joined_date") Double joinedDate,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("like2_count") Double like2Count,
			@JsonProperty("like_count") Double likeCount,
			@Nullable String location,
			@JsonProperty("market_custom_title") @Nullable String marketCustomTitle,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@JsonProperty("message_count") Double messageCount,
			@JsonProperty("paid_mail_left") Double paidMailLeft,
			@JsonProperty("public_tags") @Nullable List<UserModelPublicTags> publicTags,
			@JsonProperty("register_date") Double registerDate,
			@Nullable UserModelRendered rendered,
			@JsonProperty("restore_count") Double restoreCount,
			@JsonProperty("restore_data") @Nullable JsonNode restoreData,
			@JsonProperty("short_link") @Nullable String shortLink,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@Nullable List<UserModelTags> tags,
			@JsonProperty("telegram_client") @Nullable UserModelTelegramClient telegramClient,
			@JsonProperty("trophy_points") Double trophyPoints,
			@JsonProperty("user_allow_ask_discount") @Nullable JsonNode userAllowAskDiscount,
			@JsonProperty("user_id") Double userId,
			@JsonProperty("user_title") @Nullable String userTitle,
			@Nullable String username,
			@JsonProperty("view_url") @Nullable String viewUrl,
			@Nullable JsonNode visible,
			@JsonProperty("warning_points") Double warningPoints
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelBalances(
			@Nullable String balance,
			@JsonProperty("balance_id") Double balanceId,
			Double convertedBalance,
			@JsonProperty("custom_title") @Nullable JsonNode customTitle,
			@Nullable String fullTitle,
			@JsonProperty("merchant_id") Double merchantId,
			@Nullable String title,
			@Nullable String type,
			@JsonProperty("user_id") Double userId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelCustomFields(
			@Nullable String _4,
			@Nullable List<JsonNode> allowSelfUnban,
			@JsonProperty("ban_reason") @Nullable String banReason,
			@Nullable String discord,
			@Nullable String github,
			@Nullable String jabber,
			@Nullable String lztAwardUserTrophy,
			@Nullable String lztLikesIncreasing,
			@Nullable String lztLikesZeroing,
			@Nullable String lztSympathyIncreasing,
			@Nullable String lztSympathyZeroing,
			@Nullable String lztUnbanAmount,
			@Nullable String maecenasValue,
			@Nullable String scamURL,
			@Nullable String steam,
			@Nullable String telegram,
			@Nullable String vk,
			@Nullable String favoritePorn,
			@Nullable String favoriteVape,
			@Nullable String favoriteAnime,
			@Nullable String matrix
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelDob(
			Double year,
			Double month,
			Double day
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelImapDataDomainZone(
			@Nullable String domain,
			@JsonProperty("imap_server") @Nullable String imapServer,
			Double port,
			@Nullable JsonNode secure
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelImapData(
			@JsonProperty("domain.zone") @Nullable UserModelImapDataDomainZone domainZone
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelPublicTags(
			@JsonProperty("background_color") @Nullable String backgroundColor,
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRenderedAvatars(
			@Nullable String l,
			@Nullable String m,
			@Nullable String s
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRenderedBackgrounds(
			@Nullable String l,
			@Nullable String m
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelRendered(
			@Nullable String username,
			@Nullable UserModelRenderedAvatars avatars,
			@Nullable UserModelRenderedBackgrounds backgrounds,
			@Nullable String link
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelTags(
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title,
			@Nullable JsonNode isDefault,
			@Nullable JsonNode forOwnedAccountsOnly,
			@Nullable String bc
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record UserModelTelegramClient(
			@JsonProperty("telegram_api_id") @Nullable String telegramApiId,
			@JsonProperty("telegram_api_hash") @Nullable String telegramApiHash,
			@JsonProperty("telegram_device_model") @Nullable String telegramDeviceModel,
			@JsonProperty("telegram_system_version") @Nullable String telegramSystemVersion,
			@JsonProperty("telegram_app_version") @Nullable String telegramAppVersion,
			@JsonProperty("telegram_system_lang_code") @Nullable String telegramSystemLangCode,
			@JsonProperty("telegram_lang_code") @Nullable String telegramLangCode,
			@JsonProperty("telegram_lang_pack") @Nullable String telegramLangPack
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BalanceModel(
			@Nullable String balance,
			@JsonProperty("balance_id") Double balanceId,
			@JsonProperty("custom_title") @Nullable JsonNode customTitle,
			@Nullable String fullTitle,
			@JsonProperty("merchant_id") Double merchantId,
			@Nullable String title,
			@Nullable String type,
			@JsonProperty("user_id") Double userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ExtraModel(
			@Nullable String proxy,
			@JsonProperty("close_item") @Nullable JsonNode closeItem,
			@Nullable String region,
			@Nullable String service,
			@Nullable String system,
			@Nullable String confirmationCode,
			@Nullable String cookies,
			@JsonProperty("login_without_cookies") @Nullable JsonNode loginWithoutCookies,
			@JsonProperty("cookie_login") @Nullable JsonNode cookieLogin,
			@JsonProperty("mfa_file") @Nullable String mfaFile,
			@JsonProperty("dota2_mmr") Double dota2Mmr,
			@JsonProperty("ea_games") @Nullable JsonNode eaGames,
			@JsonProperty("uplay_games") @Nullable JsonNode uplayGames,
			@JsonProperty("the_quarry") @Nullable JsonNode theQuarry,
			@Nullable JsonNode warframe,
			@Nullable JsonNode ark,
			@JsonProperty("ark_ascended") @Nullable JsonNode arkAscended,
			@JsonProperty("genshin_currency") Double genshinCurrency,
			@JsonProperty("honkai_currency") Double honkaiCurrency,
			@JsonProperty("zenless_currency") Double zenlessCurrency,
			@Nullable String password,
			@Nullable String telegramClient,
			@Nullable String telegramJson,
			@Nullable JsonNode checkChannels,
			@Nullable JsonNode checkSpam,
			@Nullable JsonNode checkHypixelBan
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConfirmationCodeModel(
			@Nullable JsonNode item,
			@Nullable ConfirmationCodeModelCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ConfirmationCodeModelCodeData(
			@Nullable String code,
			Double date,
			@Nullable String textPlain
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemListModel(
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModel(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			Double isIgnored,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable ItemFromListModelBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode canViewAccountLink,
			@Nullable String itemOriginPhrase,
			@Nullable List<String> tags,
			@JsonProperty("note_text") @Nullable String noteText,
			@JsonProperty("description_html") @Nullable String descriptionHtml,
			@JsonProperty("description_html_en") @Nullable String descriptionHtmlEn,
			@Nullable ItemFromListModelSeller seller
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModelBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable String shortErrorPhrase,
			@Nullable String errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemFromListModelSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_item_count") Double activeItemCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModel(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("pending_deletion_date") Double pendingDeletionDate,
			@Nullable String login,
			@JsonProperty("temp_email") @Nullable String tempEmail,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@Nullable String information,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("information_en") @Nullable String informationEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("note_text") @Nullable String noteText,
			@JsonProperty("content_type") @Nullable JsonNode contentType,
			@JsonProperty("content_id") @Nullable JsonNode contentId,
			@JsonProperty("delete_date") Double deleteDate,
			@JsonProperty("delete_user_id") Double deleteUserId,
			@JsonProperty("delete_username") @Nullable String deleteUsername,
			@JsonProperty("delete_reason") @Nullable String deleteReason,
			@JsonProperty("user_allow_ask_discount") Double userAllowAskDiscount,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@JsonProperty("market_custom_title") @Nullable String marketCustomTitle,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@JsonProperty("buyer_display_icon_group_id") Double buyerDisplayIconGroupId,
			@JsonProperty("buyer_uniq_banner") @Nullable String buyerUniqBanner,
			@JsonProperty("buyer_avatar_date") Double buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") Double buyerUserGroupId,
			@JsonProperty("is_fave") @Nullable JsonNode isFave,
			@JsonProperty("in_cart") @Nullable JsonNode inCart,
			@JsonProperty("cart_price") @Nullable JsonNode cartPrice,
			@Nullable JsonNode canResellItem,
			Double priceWithSellerFee,
			@Nullable ItemModelGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewItemViews,
			@Nullable ItemModelLoginData loginData,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable ItemModelCopyFormatData copyFormatData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode getEmailCodeDisplayLogin,
			@Nullable ItemModelBuyer buyer,
			@Nullable JsonNode isPersonalAccount,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable String priceWithSellerFeeLabel,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<ItemModelAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable List<String> imagePreviewLinks,
			@Nullable JsonNode canChangePassword,
			@Nullable JsonNode canChangeEmailPassword,
			@Nullable JsonNode uniqueKeyExists,
			@Nullable String itemOriginPhrase,
			@Nullable JsonNode visitorIsAuthor,
			@Nullable JsonNode canAskDiscount,
			@Nullable JsonNode tags,
			@Nullable ItemModelCustomFields customFields,
			@Nullable List<JsonNode> externalAuth,
			@Nullable JsonNode isTrusted,
			@Nullable JsonNode isBirthdayToday,
			@Nullable JsonNode isIgnored,
			Double deposit,
			@Nullable List<ItemModelExtraPrices> extraPrices,
			@Nullable JsonNode canViewAccountLoginAndTempEmail,
			@Nullable ItemModelBumpSettings bumpSettings,
			@Nullable JsonNode canCheckGuarantee,
			@Nullable JsonNode canShareItem,
			@Nullable JsonNode canCheckAiPrice,
			Double aiPrice,
			Double aiPriceCheckDate,
			@Nullable JsonNode needToRequireVideoToViewLoginData,
			@Nullable JsonNode canCheckAutoBuyPrice,
			Double autoBuyPrice,
			Double autoBuyPriceCheckDate,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable ItemModelSeller seller
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			Double endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			Double remainingTime,
			@Nullable String remainingTimePhrase,
			@Nullable String cancelledReason,
			@Nullable String cancelledReasonPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelCopyFormatData(
			@JsonProperty("title_link") @Nullable String titleLink,
			@JsonProperty("login_data") @Nullable String loginData,
			@Nullable String full
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelBuyer(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("operation_date") Double operationDate,
			@Nullable JsonNode visitorIsBuyer,
			@Nullable String username,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("display_icon_group_id") Double displayIconGroupId,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("uniq_banner") @Nullable String uniqBanner,
			@JsonProperty("user_group_id") Double userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelCustomFields(
			@Nullable String _4,
			@Nullable List<JsonNode> allowSelfUnban,
			@JsonProperty("ban_reason") @Nullable String banReason,
			@Nullable String discord,
			@Nullable String github,
			@Nullable String jabber,
			@Nullable String lztUnbanAmount,
			@Nullable String steam,
			@Nullable String telegram,
			@Nullable String vk
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelExtraPrices(
			@Nullable String currency,
			@Nullable String price,
			Double priceValue
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode nextAllowedBumpDate,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelSellerContacts(
			@JsonProperty("ban_reason") @Nullable String banReason,
			@Nullable String telegram
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ItemModelSeller(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("joined_date") Double joinedDate,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@JsonProperty("effective_last_activity") Double effectiveLastActivity,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents,
			@Nullable JsonNode isOnline,
			@Nullable ItemModelSellerContacts contacts
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record InvoiceModel(
			@JsonProperty("additional_data") @Nullable String additionalData,
			Double amount,
			@Nullable String comment,
			@JsonProperty("expires_at") Double expiresAt,
			@JsonProperty("invoice_date") Double invoiceDate,
			@JsonProperty("invoice_id") Double invoiceId,
			@JsonProperty("is_test") @Nullable JsonNode isTest,
			@JsonProperty("merchant_id") Double merchantId,
			@JsonProperty("paid_date") Double paidDate,
			@JsonProperty("payer_user_id") Double payerUserId,
			@JsonProperty("payment_id") @Nullable String paymentId,
			@JsonProperty("resend_attempts") Double resendAttempts,
			@Nullable String status,
			@Nullable String url,
			@JsonProperty("url_callback") @Nullable String urlCallback,
			@JsonProperty("url_success") @Nullable String urlSuccess,
			@JsonProperty("user_id") Double userId
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record Resp_SystemInfo(
			@JsonProperty("visitor_id") Double visitorId,
			Double time,
			@JsonProperty("log_id") Double logId
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategorySteamResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamFullGames(
			@Nullable JsonNode list,
			Double total
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			@Nullable JsonNode endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			@Nullable JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamData(
			@JsonProperty("steam_ban_type_id") @Nullable List<JsonNode> steamBanTypeId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSteamTransactions(
			@Nullable String date,
			@Nullable String product,
			@Nullable String type,
			@Nullable String source,
			@Nullable String amount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySteamResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("steam_item_id") Double steamItemId,
			@JsonProperty("steam_country") @Nullable String steamCountry,
			@JsonProperty("steam_register_date") Double steamRegisterDate,
			@JsonProperty("steam_last_activity") Double steamLastActivity,
			@JsonProperty("steam_full_games") @Nullable CategorySteamResponseItemsSteamFullGames steamFullGames,
			@JsonProperty("steam_community_ban") Double steamCommunityBan,
			@JsonProperty("steam_bans") @Nullable String steamBans,
			@JsonProperty("steam_cs2_profile_rank") Double steamCs2ProfileRank,
			@JsonProperty("steam_balance") @Nullable String steamBalance,
			@JsonProperty("steam_cs2_rank_id") Double steamCs2RankId,
			@JsonProperty("steam_is_limited") Double steamIsLimited,
			@JsonProperty("steam_level") Double steamLevel,
			@JsonProperty("steam_friend_count") Double steamFriendCount,
			@JsonProperty("steam_cs2_last_activity") Double steamCs2LastActivity,
			@JsonProperty("steam_dota2_solo_mmr") Double steamDota2SoloMmr,
			@JsonProperty("steam_cs2_ban_date") Double steamCs2BanDate,
			@JsonProperty("steam_converted_balance") Double steamConvertedBalance,
			@JsonProperty("steam_cards_count") Double steamCardsCount,
			@JsonProperty("steam_cards_games") Double steamCardsGames,
			@JsonProperty("steam_pubg_inv_value") Double steamPubgInvValue,
			@JsonProperty("steam_cs2_inv_value") Double steamCs2InvValue,
			@JsonProperty("steam_dota2_inv_value") Double steamDota2InvValue,
			@JsonProperty("steam_tf2_inv_value") Double steamTf2InvValue,
			@JsonProperty("steam_rust_inv_value") Double steamRustInvValue,
			@JsonProperty("steam_cs2_wingman_rank_id") Double steamCs2WingmanRankId,
			@JsonProperty("steam_game_count") Double steamGameCount,
			@JsonProperty("steam_steam_inv_value") Double steamSteamInvValue,
			@JsonProperty("steam_inv_value") Double steamInvValue,
			@JsonProperty("steam_cs2_win_count") Double steamCs2WinCount,
			@JsonProperty("steam_dota2_game_count") Double steamDota2GameCount,
			@JsonProperty("steam_dota2_lose_count") Double steamDota2LoseCount,
			@JsonProperty("steam_dota2_win_count") Double steamDota2WinCount,
			@JsonProperty("steam_hours_played_recently") @Nullable String steamHoursPlayedRecently,
			@JsonProperty("steam_faceit_level") Double steamFaceitLevel,
			@JsonProperty("steam_points") Double steamPoints,
			@JsonProperty("steam_last_transaction_date") Double steamLastTransactionDate,
			@JsonProperty("steam_relevant_game_count") Double steamRelevantGameCount,
			@JsonProperty("steam_gift_count") Double steamGiftCount,
			@JsonProperty("steam_limit_spent") @Nullable String steamLimitSpent,
			@JsonProperty("steam_dota2_behavior") Double steamDota2Behavior,
			@JsonProperty("steam_mfa") Double steamMfa,
			@JsonProperty("steam_market") Double steamMarket,
			@JsonProperty("steam_market_restrictions") Double steamMarketRestrictions,
			@JsonProperty("steam_market_ban_end_date") Double steamMarketBanEndDate,
			@JsonProperty("steam_unturned_inv_value") Double steamUnturnedInvValue,
			@JsonProperty("steam_cs2_last_launched") Double steamCs2LastLaunched,
			@JsonProperty("steam_kf2_inv_value") Double steamKf2InvValue,
			@JsonProperty("steam_dst_inv_value") Double steamDstInvValue,
			@JsonProperty("steam_cs2_premier_elo") Double steamCs2PremierElo,
			@JsonProperty("steam_has_activated_keys") Double steamHasActivatedKeys,
			@JsonProperty("steam_cs2_ban_type") Double steamCs2BanType,
			@JsonProperty("steam_rust_kill_player") Double steamRustKillPlayer,
			@JsonProperty("steam_rust_deaths") Double steamRustDeaths,
			@JsonProperty("steam_total_gifts_rub") Double steamTotalGiftsRub,
			@JsonProperty("steam_total_refunds_rub") Double steamTotalRefundsRub,
			@JsonProperty("steam_total_ingame_rub") Double steamTotalIngameRub,
			@JsonProperty("steam_total_games_rub") Double steamTotalGamesRub,
			@JsonProperty("steam_total_purchased_rub") Double steamTotalPurchasedRub,
			@JsonProperty("steam_dota2_last_match_date") Double steamDota2LastMatchDate,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable CategorySteamResponseItemsGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategorySteamResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable CategorySteamResponseItemsSteamData steamData,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode hasCs2,
			@Nullable JsonNode hasDota2,
			@Nullable JsonNode hasPubg,
			@Nullable JsonNode hasTf2,
			@Nullable JsonNode hasRust,
			@JsonProperty("steam_cs2_ban_date_active") @Nullable JsonNode steamCs2BanDateActive,
			@Nullable JsonNode dota2CalibrationWarning,
			@Nullable JsonNode displayConvertedBalance,
			@Nullable List<JsonNode> inventoryValue,
			@Nullable List<JsonNode> steamCs2Medals,
			@Nullable JsonNode cs2RankExpired,
			Double steamDota2WinRate,
			@Nullable List<CategorySteamResponseItemsSteamTransactions> steamTransactions,
			@Nullable JsonNode hasPossibleBanInDota2,
			@Nullable JsonNode chineseAccount,
			@Nullable List<JsonNode> cs2MapsRanks,
			@Nullable List<JsonNode> cs2PremierElo,
			@Nullable JsonNode steamLifetimeTradeBan,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategorySteamResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategorySteamResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryFortniteResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteSkins(
			@Nullable String id,
			@Nullable String title,
			@Nullable String rarity,
			@Nullable String type,
			@JsonProperty("from_shop") Double fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortnitePickaxe(
			@Nullable String id,
			@Nullable String title,
			@Nullable String rarity,
			@Nullable String type,
			@JsonProperty("from_shop") Double fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteDance(
			@Nullable String id,
			@Nullable String title,
			@Nullable String rarity,
			@Nullable String type,
			@JsonProperty("from_shop") Double fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteGliders(
			@Nullable String id,
			@Nullable String title,
			@Nullable String rarity,
			@Nullable String type,
			@JsonProperty("from_shop") Double fromShop
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortnitePastSeasons(
			Double numWins,
			Double seasonXp,
			@Nullable JsonNode purchasedVIP,
			Double survivorPrestige,
			Double seasonLevel,
			Double numLowBracket,
			Double bookLevel,
			Double numRoyalRoyales,
			Double seasonNumber,
			Double survivorTier,
			Double numHighBracket
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsFortniteTransactions(
			Double date,
			@Nullable String title,
			@Nullable String presentmentTotal,
			@Nullable String orderType
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsShopCounts(
			Double shopSkinsCount,
			Double shopPickaxesCount,
			Double shopDancesCount,
			Double shopGlidersCount
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryFortniteResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("fortnite_item_id") Double fortniteItemId,
			@JsonProperty("fortnite_platform") @Nullable String fortnitePlatform,
			@JsonProperty("fortnite_register_date") Double fortniteRegisterDate,
			@JsonProperty("fortnite_last_activity") Double fortniteLastActivity,
			@JsonProperty("fortnite_book_level") Double fortniteBookLevel,
			@JsonProperty("fortnite_lifetime_wins") Double fortniteLifetimeWins,
			@JsonProperty("fortnite_level") Double fortniteLevel,
			@JsonProperty("fortnite_season_num") Double fortniteSeasonNum,
			@JsonProperty("fortnite_books_purchased") Double fortniteBooksPurchased,
			@JsonProperty("fortnite_balance") Double fortniteBalance,
			@JsonProperty("fortnite_skin_count") Double fortniteSkinCount,
			@JsonProperty("fortnite_change_email") Double fortniteChangeEmail,
			@JsonProperty("fortnite_rl_purchases") Double fortniteRlPurchases,
			@JsonProperty("fortnite_next_change_email_date") Double fortniteNextChangeEmailDate,
			@JsonProperty("fortnite_last_trans_date") Double fortniteLastTransDate,
			@JsonProperty("fortnite_xbox_linkable") Double fortniteXboxLinkable,
			@JsonProperty("fortnite_psn_linkable") Double fortnitePsnLinkable,
			@JsonProperty("fortnite_shop_skins_count") Double fortniteShopSkinsCount,
			@JsonProperty("fortnite_shop_pickaxes_count") Double fortniteShopPickaxesCount,
			@JsonProperty("fortnite_shop_dances_count") Double fortniteShopDancesCount,
			@JsonProperty("fortnite_shop_gliders_count") Double fortniteShopGlidersCount,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryFortniteResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable List<CategoryFortniteResponseItemsFortniteSkins> fortniteSkins,
			@Nullable List<CategoryFortniteResponseItemsFortnitePickaxe> fortnitePickaxe,
			@Nullable List<CategoryFortniteResponseItemsFortniteDance> fortniteDance,
			@Nullable List<CategoryFortniteResponseItemsFortniteGliders> fortniteGliders,
			@JsonProperty("fortnite_pickaxe_count") Double fortnitePickaxeCount,
			@JsonProperty("fortnite_dance_count") Double fortniteDanceCount,
			@JsonProperty("fortnite_glider_count") Double fortniteGliderCount,
			@Nullable List<CategoryFortniteResponseItemsFortnitePastSeasons> fortnitePastSeasons,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable List<CategoryFortniteResponseItemsFortniteTransactions> fortniteTransactions,
			@Nullable String domain,
			@Nullable CategoryFortniteResponseItemsShopCounts shopCounts,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryFortniteResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryMihoyoResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsMihoyoLinkedAccounts(
			@Nullable List<String> links,
			@Nullable JsonNode legacy
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersEquip(
			Double id,
			Double level,
			Double rank,
			@Nullable String name,
			@Nullable String desc,
			@Nullable String icon,
			Double rarity
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty(
			@JsonProperty("property_type") Double propertyType,
			@Nullable String value,
			Double times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties(
			@JsonProperty("property_type") Double propertyType,
			@Nullable String value,
			Double times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersRelics(
			Double id,
			Double level,
			Double pos,
			@Nullable String name,
			@Nullable String desc,
			@Nullable String icon,
			Double rarity,
			@JsonProperty("main_property") @Nullable CategoryMihoyoResponseItemsHonkaiCharactersRelicsMainProperty mainProperty,
			@Nullable List<CategoryMihoyoResponseItemsHonkaiCharactersRelicsProperties> properties
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty(
			@JsonProperty("property_type") Double propertyType,
			@Nullable String value,
			Double times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties(
			@JsonProperty("property_type") Double propertyType,
			@Nullable String value,
			Double times
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharactersOrnaments(
			Double id,
			Double level,
			Double pos,
			@Nullable String name,
			@Nullable String desc,
			@Nullable String icon,
			Double rarity,
			@JsonProperty("main_property") @Nullable CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsMainProperty mainProperty,
			@Nullable List<CategoryMihoyoResponseItemsHonkaiCharactersOrnamentsProperties> properties
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsHonkaiCharacters(
			Double id,
			Double level,
			@Nullable String name,
			@Nullable String element,
			@Nullable String icon,
			Double rarity,
			Double rank,
			@Nullable String image,
			@Nullable CategoryMihoyoResponseItemsHonkaiCharactersEquip equip,
			@Nullable List<CategoryMihoyoResponseItemsHonkaiCharactersRelics> relics,
			@Nullable List<CategoryMihoyoResponseItemsHonkaiCharactersOrnaments> ornaments,
			@JsonProperty("base_type") Double baseType,
			@JsonProperty("figure_path") @Nullable String figurePath,
			@Nullable String elementImage
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharactersWeapon(
			Double id,
			@Nullable String name,
			@Nullable String icon,
			Double type,
			Double rarity,
			Double level,
			@JsonProperty("promote_level") Double promoteLevel,
			@JsonProperty("type_name") @Nullable String typeName,
			@Nullable String desc,
			@JsonProperty("affix_level") Double affixLevel
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharactersReliquaries(
			Double id,
			@Nullable String name,
			@Nullable String icon,
			Double pos,
			Double rarity,
			Double level,
			@JsonProperty("pos_name") @Nullable String posName
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsGenshinCharacters(
			Double id,
			@Nullable String image,
			@Nullable String icon,
			@Nullable String name,
			@Nullable String element,
			Double fetter,
			Double level,
			Double rarity,
			@Nullable CategoryMihoyoResponseItemsGenshinCharactersWeapon weapon,
			@Nullable List<CategoryMihoyoResponseItemsGenshinCharactersReliquaries> reliquaries,
			@JsonProperty("actived_constellation_num") Double activedConstellationNum,
			@Nullable List<JsonNode> costumes,
			@Nullable JsonNode external,
			@Nullable String background
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties(
			@JsonProperty("property_name") @Nullable String propertyName,
			@JsonProperty("property_id") Double propertyId,
			@Nullable String base
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties(
			@JsonProperty("property_name") @Nullable String propertyName,
			@JsonProperty("property_id") Double propertyId,
			@Nullable String base
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharactersWeapon(
			Double id,
			Double level,
			@Nullable String name,
			Double star,
			@Nullable String icon,
			Double rarity,
			@Nullable List<CategoryMihoyoResponseItemsZenlessCharactersWeaponProperties> properties,
			@JsonProperty("main_properties") @Nullable List<CategoryMihoyoResponseItemsZenlessCharactersWeaponMainProperties> mainProperties,
			@JsonProperty("talent_title") @Nullable String talentTitle,
			@JsonProperty("talent_content") @Nullable String talentContent,
			Double profession,
			@Nullable String starIcon,
			@Nullable String rarityIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsZenlessCharacters(
			Double id,
			Double level,
			@JsonProperty("name_mi18n") @Nullable String nameMi18n,
			@JsonProperty("full_name_mi18n") @Nullable String fullNameMi18n,
			@JsonProperty("element_type") Double elementType,
			@JsonProperty("camp_name_mi18n") @Nullable String campNameMi18n,
			@JsonProperty("avatar_profession") Double avatarProfession,
			Double rarity,
			@Nullable CategoryMihoyoResponseItemsZenlessCharactersWeapon weapon,
			Double rank,
			@Nullable String name,
			@Nullable String rarityIcon,
			@Nullable String elementIcon,
			@Nullable String professionIcon
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMihoyoResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("mihoyo_item_id") Double mihoyoItemId,
			@JsonProperty("mihoyo_id") Double mihoyoId,
			@JsonProperty("mihoyo_email") Double mihoyoEmail,
			@JsonProperty("mihoyo_has_linked_accounts") Double mihoyoHasLinkedAccounts,
			@JsonProperty("mihoyo_region") @Nullable String mihoyoRegion,
			@JsonProperty("mihoyo_last_activity") Double mihoyoLastActivity,
			@JsonProperty("mihoyo_genshin_level") Double mihoyoGenshinLevel,
			@JsonProperty("mihoyo_genshin_character_count") Double mihoyoGenshinCharacterCount,
			@JsonProperty("mihoyo_genshin_achievement_count") Double mihoyoGenshinAchievementCount,
			@JsonProperty("mihoyo_genshin_abyss_process") @Nullable String mihoyoGenshinAbyssProcess,
			@JsonProperty("mihoyo_genshin_legendary_characters_count") Double mihoyoGenshinLegendaryCharactersCount,
			@JsonProperty("mihoyo_genshin_constellations_count") Double mihoyoGenshinConstellationsCount,
			@JsonProperty("mihoyo_genshin_legendary_weapons_count") Double mihoyoGenshinLegendaryWeaponsCount,
			@JsonProperty("mihoyo_genshin_activity_days") Double mihoyoGenshinActivityDays,
			@JsonProperty("mihoyo_genshin_currency") Double mihoyoGenshinCurrency,
			@JsonProperty("mihoyo_honkai_level") Double mihoyoHonkaiLevel,
			@JsonProperty("mihoyo_honkai_character_count") Double mihoyoHonkaiCharacterCount,
			@JsonProperty("mihoyo_honkai_achievement_count") Double mihoyoHonkaiAchievementCount,
			@JsonProperty("mihoyo_honkai_abyss_process") @Nullable String mihoyoHonkaiAbyssProcess,
			@JsonProperty("mihoyo_honkai_legendary_characters_count") Double mihoyoHonkaiLegendaryCharactersCount,
			@JsonProperty("mihoyo_honkai_eidolons_count") Double mihoyoHonkaiEidolonsCount,
			@JsonProperty("mihoyo_honkai_legendary_weapons_count") Double mihoyoHonkaiLegendaryWeaponsCount,
			@JsonProperty("mihoyo_honkai_activity_days") Double mihoyoHonkaiActivityDays,
			@JsonProperty("mihoyo_honkai_currency") Double mihoyoHonkaiCurrency,
			@JsonProperty("mihoyo_zenless_level") Double mihoyoZenlessLevel,
			@JsonProperty("mihoyo_zenless_character_count") Double mihoyoZenlessCharacterCount,
			@JsonProperty("mihoyo_zenless_achievement_count") Double mihoyoZenlessAchievementCount,
			@JsonProperty("mihoyo_zenless_abyss_process") @Nullable String mihoyoZenlessAbyssProcess,
			@JsonProperty("mihoyo_zenless_legendary_characters_count") Double mihoyoZenlessLegendaryCharactersCount,
			@JsonProperty("mihoyo_zenless_cinemas_count") Double mihoyoZenlessCinemasCount,
			@JsonProperty("mihoyo_zenless_legendary_weapons_count") Double mihoyoZenlessLegendaryWeaponsCount,
			@JsonProperty("mihoyo_zenless_activity_days") Double mihoyoZenlessActivityDays,
			@JsonProperty("mihoyo_zenless_currency") Double mihoyoZenlessCurrency,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryMihoyoResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String mihoyoRegionPhrase,
			@Nullable CategoryMihoyoResponseItemsMihoyoLinkedAccounts mihoyoLinkedAccounts,
			@Nullable String mihoyoLinkedAccountsString,
			@Nullable List<CategoryMihoyoResponseItemsHonkaiCharacters> honkaiCharacters,
			@Nullable List<CategoryMihoyoResponseItemsGenshinCharacters> genshinCharacters,
			@Nullable List<CategoryMihoyoResponseItemsZenlessCharacters> zenlessCharacters,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryMihoyoResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryMihoyoResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryRiotResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsValorantInventory(
			@Nullable List<String> WeaponSkins,
			@Nullable List<String> Agent,
			@Nullable List<String> Buddy
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsLolInventory(
			@Nullable List<Double> Champion,
			@Nullable List<Double> Skin
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRiotResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("riot_item_id") Double riotItemId,
			@JsonProperty("riot_id") @Nullable String riotId,
			@JsonProperty("riot_account_verified") Double riotAccountVerified,
			@JsonProperty("riot_email_verified") Double riotEmailVerified,
			@JsonProperty("riot_country") @Nullable String riotCountry,
			@JsonProperty("riot_password_change") Double riotPasswordChange,
			@JsonProperty("riot_phone_verified") Double riotPhoneVerified,
			@JsonProperty("riot_last_activity") Double riotLastActivity,
			@JsonProperty("riot_valorant_wallet_vp") Double riotValorantWalletVp,
			@JsonProperty("riot_valorant_wallet_rp") Double riotValorantWalletRp,
			@JsonProperty("riot_valorant_wallet_fa") Double riotValorantWalletFa,
			@JsonProperty("riot_valorant_level") Double riotValorantLevel,
			@JsonProperty("riot_username") @Nullable String riotUsername,
			@JsonProperty("riot_valorant_rank") Double riotValorantRank,
			@JsonProperty("riot_valorant_region") @Nullable String riotValorantRegion,
			@JsonProperty("riot_valorant_skin_count") Double riotValorantSkinCount,
			@JsonProperty("riot_valorant_agent_count") Double riotValorantAgentCount,
			@JsonProperty("riot_valorant_previous_rank") Double riotValorantPreviousRank,
			@JsonProperty("riot_valorant_last_rank") Double riotValorantLastRank,
			@JsonProperty("riot_valorant_rank_type") @Nullable String riotValorantRankType,
			@JsonProperty("riot_valorant_inventory_value") Double riotValorantInventoryValue,
			@JsonProperty("riot_valorant_knife") Double riotValorantKnife,
			@JsonProperty("riot_lol_region") @Nullable String riotLolRegion,
			@JsonProperty("riot_lol_skin_count") Double riotLolSkinCount,
			@JsonProperty("riot_lol_champion_count") Double riotLolChampionCount,
			@JsonProperty("riot_lol_level") Double riotLolLevel,
			@JsonProperty("riot_lol_wallet_blue") Double riotLolWalletBlue,
			@JsonProperty("riot_lol_wallet_orange") Double riotLolWalletOrange,
			@JsonProperty("riot_lol_wallet_mythic") Double riotLolWalletMythic,
			@JsonProperty("riot_lol_wallet_riot") Double riotLolWalletRiot,
			@JsonProperty("riot_lol_rank") @Nullable String riotLolRank,
			@JsonProperty("riot_lol_rank_win_rate") Double riotLolRankWinRate,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryRiotResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String valorantRegionPhrase,
			@Nullable String valorantRankTitle,
			@Nullable String valorantRankImgPath,
			@Nullable String valorantPreviousRankTitle,
			@Nullable String valorantLastRankTitle,
			@Nullable String lolRegionPhrase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable CategoryRiotResponseItemsValorantInventory valorantInventory,
			@Nullable CategoryRiotResponseItemsLolInventory lolInventory,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryRiotResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryRiotResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryTelegramResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsTelegramGroupCounters(
			Double chats,
			Double channels,
			Double conversations,
			Double admin
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTelegramResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("telegram_item_id") Double telegramItemId,
			@JsonProperty("telegram_country") @Nullable String telegramCountry,
			@JsonProperty("telegram_last_seen") Double telegramLastSeen,
			@JsonProperty("telegram_premium") Double telegramPremium,
			@JsonProperty("telegram_stars_count") Double telegramStarsCount,
			@JsonProperty("telegram_birthday") Double telegramBirthday,
			@JsonProperty("telegram_password") Double telegramPassword,
			@JsonProperty("telegram_premium_expires") Double telegramPremiumExpires,
			@JsonProperty("telegram_spam_block") @Nullable JsonNode telegramSpamBlock,
			@JsonProperty("telegram_channels_count") Double telegramChannelsCount,
			@JsonProperty("telegram_chats_count") Double telegramChatsCount,
			@JsonProperty("telegram_admin_count") Double telegramAdminCount,
			@JsonProperty("telegram_admin_subs_count") Double telegramAdminSubsCount,
			@JsonProperty("telegram_conversations_count") Double telegramConversationsCount,
			@JsonProperty("telegram_id_count") Double telegramIdCount,
			@JsonProperty("telegram_contacts_count") Double telegramContactsCount,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryTelegramResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@JsonProperty("telegram_group_counters") @Nullable CategoryTelegramResponseItemsTelegramGroupCounters telegramGroupCounters,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryTelegramResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategorySupercellResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySupercellResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("supercell_item_id") Double supercellItemId,
			@JsonProperty("supercell_id") @Nullable String supercellId,
			@JsonProperty("supercell_arena") @Nullable String supercellArena,
			@JsonProperty("supercell_brawler_count") Double supercellBrawlerCount,
			@JsonProperty("supercell_last_activity") Double supercellLastActivity,
			@JsonProperty("supercell_legendary_brawler_count") Double supercellLegendaryBrawlerCount,
			@JsonProperty("supercell_town_hall_level") Double supercellTownHallLevel,
			@JsonProperty("supercell_builder_hall_level") Double supercellBuilderHallLevel,
			@JsonProperty("supercell_builder_hall_cup_count") Double supercellBuilderHallCupCount,
			@JsonProperty("supercell_phone") Double supercellPhone,
			@JsonProperty("supercell_laser_level") Double supercellLaserLevel,
			@JsonProperty("supercell_scroll_level") Double supercellScrollLevel,
			@JsonProperty("supercell_magic_level") Double supercellMagicLevel,
			@JsonProperty("supercell_laser_trophies") Double supercellLaserTrophies,
			@JsonProperty("supercell_scroll_trophies") Double supercellScrollTrophies,
			@JsonProperty("supercell_magic_trophies") Double supercellMagicTrophies,
			@JsonProperty("supercell_laser_victories") Double supercellLaserVictories,
			@JsonProperty("supercell_scroll_victories") Double supercellScrollVictories,
			@JsonProperty("supercell_magic_victories") Double supercellMagicVictories,
			@JsonProperty("supercell_laser_battle_pass") Double supercellLaserBattlePass,
			@JsonProperty("supercell_scroll_battle_pass") Double supercellScrollBattlePass,
			@JsonProperty("supercell_magic_battle_pass") Double supercellMagicBattlePass,
			@JsonProperty("supercell_systems") @Nullable String supercellSystems,
			@JsonProperty("supercell_king_level") Double supercellKingLevel,
			@JsonProperty("supercell_total_heroes_level") Double supercellTotalHeroesLevel,
			@JsonProperty("supercell_total_troops_level") Double supercellTotalTroopsLevel,
			@JsonProperty("supercell_total_spells_level") Double supercellTotalSpellsLevel,
			@JsonProperty("supercell_total_builder_heroes_level") Double supercellTotalBuilderHeroesLevel,
			@JsonProperty("supercell_total_builder_troops_level") Double supercellTotalBuilderTroopsLevel,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategorySupercellResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@Nullable List<JsonNode> supercellBrawlers,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategorySupercellResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategorySupercellResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryEaResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsEaGamesApexLegends(
			@JsonProperty("game_id") @Nullable String gameId,
			@Nullable String title,
			@JsonProperty("last_activity") Double lastActivity,
			@JsonProperty("total_played") Double totalPlayed,
			@Nullable String img
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsEaGames(
			@JsonProperty("apex-legends") @Nullable CategoryEaResponseItemsEaGamesApexLegends apexLegends
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEaResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("ea_item_id") Double eaItemId,
			@JsonProperty("ea_id") Double eaId,
			@JsonProperty("ea_country") @Nullable String eaCountry,
			@JsonProperty("ea_games") @Nullable CategoryEaResponseItemsEaGames eaGames,
			@JsonProperty("ea_game_count") Double eaGameCount,
			@JsonProperty("ea_last_activity") Double eaLastActivity,
			@JsonProperty("ea_al_level") Double eaAlLevel,
			@JsonProperty("ea_al_rank_score") Double eaAlRankScore,
			@JsonProperty("ea_subscription") @Nullable String eaSubscription,
			@JsonProperty("ea_subscription_end_date") Double eaSubscriptionEndDate,
			@JsonProperty("ea_username") @Nullable String eaUsername,
			@JsonProperty("ea_xbox_connected") Double eaXboxConnected,
			@JsonProperty("ea_steam_connected") Double eaSteamConnected,
			@JsonProperty("ea_psn_connected") Double eaPsnConnected,
			@JsonProperty("ea_bans") @Nullable List<JsonNode> eaBans,
			@JsonProperty("ea_has_ban") Double eaHasBan,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryEaResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryEaResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryEaResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryWotResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("wot_item_id") Double wotItemId,
			@JsonProperty("wot_last_activity") Double wotLastActivity,
			@JsonProperty("wot_register_date") Double wotRegisterDate,
			@JsonProperty("wot_mobile") Double wotMobile,
			@JsonProperty("wot_premium") Double wotPremium,
			@JsonProperty("wot_premium_expires") Double wotPremiumExpires,
			@JsonProperty("wot_gold") Double wotGold,
			@JsonProperty("wot_credits") Double wotCredits,
			@JsonProperty("wot_battle_count") Double wotBattleCount,
			@JsonProperty("wot_win_count") Double wotWinCount,
			@JsonProperty("wot_loss_count") Double wotLossCount,
			@JsonProperty("wot_win_count_percents") Double wotWinCountPercents,
			@JsonProperty("wot_top_tanks") Double wotTopTanks,
			@JsonProperty("wot_premium_tanks") Double wotPremiumTanks,
			@JsonProperty("wot_top_premium_tanks") Double wotTopPremiumTanks,
			@JsonProperty("wot_region") @Nullable String wotRegion,
			@JsonProperty("wot_blitz") Double wotBlitz,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryWotResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String wotRegionPhrase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode wotTanks,
			Double wotPremiumTankCount,
			Double wotTankCount,
			@Nullable String wotLauncherTitle,
			@JsonProperty("wot_has_clan") @Nullable JsonNode wotHasClan,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryWotResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryWotBlitzResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWotBlitzResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("wot_item_id") Double wotItemId,
			@JsonProperty("wot_last_activity") Double wotLastActivity,
			@JsonProperty("wot_register_date") Double wotRegisterDate,
			@JsonProperty("wot_mobile") Double wotMobile,
			@JsonProperty("wot_premium") Double wotPremium,
			@JsonProperty("wot_premium_expires") Double wotPremiumExpires,
			@JsonProperty("wot_gold") Double wotGold,
			@JsonProperty("wot_credits") Double wotCredits,
			@JsonProperty("wot_battle_count") Double wotBattleCount,
			@JsonProperty("wot_win_count") Double wotWinCount,
			@JsonProperty("wot_loss_count") Double wotLossCount,
			@JsonProperty("wot_win_count_percents") Double wotWinCountPercents,
			@JsonProperty("wot_top_tanks") Double wotTopTanks,
			@JsonProperty("wot_premium_tanks") Double wotPremiumTanks,
			@JsonProperty("wot_top_premium_tanks") Double wotTopPremiumTanks,
			@JsonProperty("wot_region") @Nullable String wotRegion,
			@JsonProperty("wot_blitz") Double wotBlitz,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryWotBlitzResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String wotRegionPhrase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode wotTanks,
			Double wotPremiumTankCount,
			Double wotTankCount,
			@Nullable String wotLauncherTitle,
			@JsonProperty("wot_has_clan") @Nullable JsonNode wotHasClan,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryWotBlitzResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryGiftsResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGiftsResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("gifts_item_id") Double giftsItemId,
			@JsonProperty("gifts_service") @Nullable String giftsService,
			@JsonProperty("gifts_duration") Double giftsDuration,
			@JsonProperty("gifts_type") @Nullable String giftsType,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryGiftsResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String giftsSubscriptionName,
			@Nullable String giftsServiceName,
			@Nullable JsonNode canViewAccountLink,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryGiftsResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryEpicGamesResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsEgTransactions(
			Double date,
			@Nullable String title,
			@Nullable String presentmentTotal,
			@Nullable String orderType
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEpicGamesResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("eg_item_id") Double egItemId,
			@JsonProperty("eg_country") @Nullable String egCountry,
			@JsonProperty("eg_code_redemption_history") @Nullable List<JsonNode> egCodeRedemptionHistory,
			@JsonProperty("eg_coupons") @Nullable List<JsonNode> egCoupons,
			@JsonProperty("eg_games") @Nullable JsonNode egGames,
			@JsonProperty("eg_change_email") Double egChangeEmail,
			@JsonProperty("eg_can_update_display_name") Double egCanUpdateDisplayName,
			@JsonProperty("eg_last_activity") Double egLastActivity,
			@JsonProperty("eg_payment_methods") @Nullable List<JsonNode> egPaymentMethods,
			@JsonProperty("eg_rl_purchases") Double egRlPurchases,
			@JsonProperty("eg_username") @Nullable String egUsername,
			@JsonProperty("eg_rewards_balance") Double egRewardsBalance,
			@JsonProperty("eg_rewards_expiration_date") Double egRewardsExpirationDate,
			@JsonProperty("eg_next_change_email_date") Double egNextChangeEmailDate,
			@JsonProperty("eg_game_count") Double egGameCount,
			@JsonProperty("eg_balance") Double egBalance,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryEpicGamesResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable List<CategoryEpicGamesResponseItemsEgTransactions> egTransactions,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryEpicGamesResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryEscapeFromTarkovResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryEscapeFromTarkovResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("tarkov_item_id") Double tarkovItemId,
			@JsonProperty("tarkov_game_version") @Nullable String tarkovGameVersion,
			@JsonProperty("tarkov_register_date") Double tarkovRegisterDate,
			@JsonProperty("tarkov_level") Double tarkovLevel,
			@JsonProperty("tarkov_exp") Double tarkovExp,
			@JsonProperty("tarkov_last_activity") Double tarkovLastActivity,
			@JsonProperty("tarkov_side") @Nullable String tarkovSide,
			@JsonProperty("tarkov_rubles") Double tarkovRubles,
			@JsonProperty("tarkov_secured_container") @Nullable String tarkovSecuredContainer,
			@JsonProperty("tarkov_euros") Double tarkovEuros,
			@JsonProperty("tarkov_dollars") Double tarkovDollars,
			@JsonProperty("tarkov_kd") Double tarkovKd,
			@JsonProperty("tarkov_deaths") Double tarkovDeaths,
			@JsonProperty("tarkov_kills") Double tarkovKills,
			@JsonProperty("tarkov_sessions") Double tarkovSessions,
			@JsonProperty("tarkov_region") @Nullable String tarkovRegion,
			@JsonProperty("tarkov_total_in_game") Double tarkovTotalInGame,
			@JsonProperty("tarkov_mail_forwarding") Double tarkovMailForwarding,
			@JsonProperty("tarkov_username") @Nullable String tarkovUsername,
			@JsonProperty("tarkov_purchase_date") Double tarkovPurchaseDate,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryEscapeFromTarkovResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String tarkovRegionPhrase,
			@Nullable String tarkovGameVersionPhrase,
			@Nullable String accountDomain,
			@Nullable JsonNode canViewAccountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryEscapeFromTarkovResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategorySocialClubResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsSocialclubGames(
			Double id,
			@Nullable String name,
			@Nullable String defaultPlatform,
			@Nullable String platform,
			@Nullable String lastSeen,
			@JsonProperty("internal_game_id") Double internalGameId,
			@JsonProperty("app_id") @Nullable String appId,
			@Nullable String title,
			@Nullable String abbr,
			@JsonProperty("category_id") Double categoryId,
			@Nullable String img,
			@Nullable String url,
			@Nullable JsonNode ru
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategorySocialClubResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("socialclub_item_id") Double socialclubItemId,
			@JsonProperty("socialclub_level") Double socialclubLevel,
			@JsonProperty("socialclub_cash") Double socialclubCash,
			@JsonProperty("socialclub_bank_cash") Double socialclubBankCash,
			@JsonProperty("socialclub_games") @Nullable List<CategorySocialClubResponseItemsSocialclubGames> socialclubGames,
			@JsonProperty("socialclub_last_activity") Double socialclubLastActivity,
			@JsonProperty("socialclub_has_gtav") Double socialclubHasGtav,
			@JsonProperty("socialclub_has_rdr2") Double socialclubHasRdr2,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategorySocialClubResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategorySocialClubResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryUplayResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff(
			@Nullable String title,
			@Nullable String img,
			Double pvpTimePlayed,
			Double pveTimePlayed,
			@Nullable String abbr,
			@Nullable String gameId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsUplayGames(
			@JsonProperty("ffffffff-ffff-ffff-ffff-ffffffffffff") @Nullable CategoryUplayResponseItemsUplayGamesFfffffffFfffFfffFfffFfffffffffff ffffffffFfffFfffFfffFfffffffffff
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsR6Operators(
			@Nullable String img,
			@Nullable String name,
			@Nullable String url
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryUplayResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("uplay_item_id") Double uplayItemId,
			@JsonProperty("uplay_last_activity") Double uplayLastActivity,
			@JsonProperty("uplay_country") @Nullable String uplayCountry,
			@JsonProperty("uplay_created_date") Double uplayCreatedDate,
			@JsonProperty("uplay_games") @Nullable CategoryUplayResponseItemsUplayGames uplayGames,
			@JsonProperty("uplay_game_count") Double uplayGameCount,
			@JsonProperty("uplay_r6_level") Double uplayR6Level,
			@JsonProperty("uplay_r6_ban") Double uplayR6Ban,
			@JsonProperty("uplay_r6_operators") @Nullable String uplayR6Operators,
			@JsonProperty("uplay_r6_operators_count") Double uplayR6OperatorsCount,
			@JsonProperty("uplay_r6_skins") @Nullable String uplayR6Skins,
			@JsonProperty("uplay_r6_skins_count") Double uplayR6SkinsCount,
			@JsonProperty("uplay_subscription") @Nullable String uplaySubscription,
			@JsonProperty("uplay_subscription_end_date") Double uplaySubscriptionEndDate,
			@JsonProperty("uplay_xbox_connected") Double uplayXboxConnected,
			@JsonProperty("uplay_psn_connected") Double uplayPsnConnected,
			@JsonProperty("uplay_steam_connected") Double uplaySteamConnected,
			@JsonProperty("uplay_r6_rank") Double uplayR6Rank,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryUplayResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String uplayLinkedAccounts,
			@JsonProperty("uplay_r6_steam_warning") @Nullable JsonNode uplayR6SteamWarning,
			@JsonProperty("uplay_r6_external_warning") @Nullable JsonNode uplayR6ExternalWarning,
			@JsonProperty("uplay_r6") @Nullable JsonNode uplayR6,
			@JsonProperty("uplay_r6_ban_active") @Nullable JsonNode uplayR6BanActive,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable List<JsonNode> r6Skins,
			@Nullable List<CategoryUplayResponseItemsR6Operators> r6Operators,
			@Nullable JsonNode canViewAccountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryUplayResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryDiscordResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryDiscordResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("discord_item_id") Double discordItemId,
			@JsonProperty("discord_chat_count") Double discordChatCount,
			@JsonProperty("discord_verified") Double discordVerified,
			@JsonProperty("discord_condition") @Nullable String discordCondition,
			@JsonProperty("discord_gifts") Double discordGifts,
			@JsonProperty("discord_billing") Double discordBilling,
			@JsonProperty("discord_register_date") Double discordRegisterDate,
			@JsonProperty("discord_locale") @Nullable String discordLocale,
			@JsonProperty("discord_nitro_end_date") Double discordNitroEndDate,
			@JsonProperty("discord_available_boosts") Double discordAvailableBoosts,
			@JsonProperty("discord_nitro_type") Double discordNitroType,
			@JsonProperty("discord_admin_members_count") Double discordAdminMembersCount,
			@JsonProperty("discord_admin_servers_count") Double discordAdminServersCount,
			@JsonProperty("discord_admin_servers") @Nullable String discordAdminServers,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryDiscordResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String discordAccountConditionLabel,
			@Nullable String discordLocaleTitle,
			@Nullable JsonNode canViewAccountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryDiscordResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryTikTokResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryTikTokResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("tt_item_id") Double ttItemId,
			@JsonProperty("tt_id") Double ttId,
			@JsonProperty("tt_permalink") @Nullable String ttPermalink,
			@JsonProperty("tt_uniqueId") @Nullable String ttUniqueId,
			@JsonProperty("tt_verified") Double ttVerified,
			@JsonProperty("tt_createTime") Double ttCreateTime,
			@JsonProperty("tt_privateAccount") Double ttPrivateAccount,
			@JsonProperty("tt_followers") Double ttFollowers,
			@JsonProperty("tt_following") Double ttFollowing,
			@JsonProperty("tt_likes") Double ttLikes,
			@JsonProperty("tt_videos") Double ttVideos,
			@JsonProperty("tt_screen_name") @Nullable String ttScreenName,
			@JsonProperty("tt_hasEmail") Double ttHasEmail,
			@JsonProperty("tt_hasMobile") Double ttHasMobile,
			@JsonProperty("tt_top_country") @Nullable String ttTopCountry,
			@JsonProperty("tt_countries") @Nullable String ttCountries,
			@JsonProperty("tt_coins") Double ttCoins,
			@JsonProperty("tt_hasLivePermission") Double ttHasLivePermission,
			@JsonProperty("tt_cookie_login") Double ttCookieLogin,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryTikTokResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryTikTokResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryTikTokResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryInstagramResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryInstagramResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("instagram_item_id") Double instagramItemId,
			@JsonProperty("instagram_id") @Nullable String instagramId,
			@JsonProperty("instagram_follower_count") Double instagramFollowerCount,
			@JsonProperty("instagram_follow_count") Double instagramFollowCount,
			@JsonProperty("instagram_post_count") Double instagramPostCount,
			@JsonProperty("instagram_country") @Nullable String instagramCountry,
			@JsonProperty("instagram_username") @Nullable String instagramUsername,
			@JsonProperty("instagram_mobile") Double instagramMobile,
			@JsonProperty("instagram_register_date") Double instagramRegisterDate,
			@JsonProperty("instagram_has_cookies") Double instagramHasCookies,
			@JsonProperty("instagram_login_without_cookies") Double instagramLoginWithoutCookies,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryInstagramResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryInstagramResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryInstagramResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryBattleNetResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			@Nullable JsonNode endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			@Nullable JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsBattlenetTransactions(
			Double date,
			@Nullable String productTitle,
			@Nullable String formattedTotal,
			@Nullable String total
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryBattleNetResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("battlenet_item_id") Double battlenetItemId,
			@JsonProperty("battlenet_balance") @Nullable String battlenetBalance,
			@JsonProperty("battlenet_country") @Nullable String battlenetCountry,
			@JsonProperty("battlenet_last_activity") Double battlenetLastActivity,
			@JsonProperty("battlenet_mobile") Double battlenetMobile,
			@JsonProperty("battlenet_bans") @Nullable String battlenetBans,
			@JsonProperty("battlenet_can_change_tag") Double battlenetCanChangeTag,
			@JsonProperty("battlenet_real_id_enabled") Double battlenetRealIdEnabled,
			@JsonProperty("battlenet_change_full_name") Double battlenetChangeFullName,
			@JsonProperty("battlenet_parent_control") Double battlenetParentControl,
			@JsonProperty("battlenet_converted_balance") Double battlenetConvertedBalance,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable CategoryBattleNetResponseItemsGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryBattleNetResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode battlenetGames,
			@Nullable JsonNode hasOverwatch,
			@Nullable List<CategoryBattleNetResponseItemsBattlenetTransactions> battlenetTransactions,
			@Nullable JsonNode displayConvertedBalance,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> accountLinks,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryBattleNetResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryChatGPTResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsCopyFormatData(
			@JsonProperty("title_link") @Nullable String titleLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryChatGPTResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("chatgpt_item_id") Double chatgptItemId,
			@JsonProperty("chatgpt_country") @Nullable String chatgptCountry,
			@JsonProperty("chatgpt_register_date") Double chatgptRegisterDate,
			@JsonProperty("chatgpt_phone") Double chatgptPhone,
			@JsonProperty("chatgpt_subscription") @Nullable String chatgptSubscription,
			@JsonProperty("chatgpt_subscription_ends") Double chatgptSubscriptionEnds,
			@JsonProperty("chatgpt_subscription_auto_renew") Double chatgptSubscriptionAutoRenew,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewItemViews,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable CategoryChatGPTResponseItemsCopyFormatData copyFormatData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryChatGPTResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode isPersonalAccount,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable String priceWithSellerFeeLabel,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String gptSubType,
			@Nullable JsonNode canViewAccountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable JsonNode canChangeEmailPassword,
			@Nullable JsonNode uniqueKeyExists,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryChatGPTResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryVpnResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryVpnResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("vpn_item_id") Double vpnItemId,
			@JsonProperty("vpn_service") @Nullable String vpnService,
			@JsonProperty("vpn_expire_date") Double vpnExpireDate,
			@JsonProperty("vpn_renewable") Double vpnRenewable,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryVpnResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String vpnProductTitle,
			@Nullable JsonNode canViewAccountLink,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryVpnResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryRobloxResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsRobloxGameDonationsDetails(
			@Nullable String product,
			Double amount,
			@Nullable String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryRobloxResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("roblox_item_id") Double robloxItemId,
			@JsonProperty("roblox_id") Double robloxId,
			@JsonProperty("roblox_email_verified") Double robloxEmailVerified,
			@JsonProperty("roblox_robux") Double robloxRobux,
			@JsonProperty("roblox_username") @Nullable String robloxUsername,
			@JsonProperty("roblox_country") @Nullable String robloxCountry,
			@JsonProperty("roblox_register_date") Double robloxRegisterDate,
			@JsonProperty("roblox_friends") Double robloxFriends,
			@JsonProperty("roblox_followers") Double robloxFollowers,
			@JsonProperty("roblox_subscription") @Nullable String robloxSubscription,
			@JsonProperty("roblox_subscription_end_date") Double robloxSubscriptionEndDate,
			@JsonProperty("roblox_xbox_connected") Double robloxXboxConnected,
			@JsonProperty("roblox_incoming_robux_total") Double robloxIncomingRobuxTotal,
			@JsonProperty("roblox_limited_price") Double robloxLimitedPrice,
			@JsonProperty("roblox_verified") Double robloxVerified,
			@JsonProperty("roblox_age_verified") Double robloxAgeVerified,
			@JsonProperty("roblox_psn_connected") Double robloxPsnConnected,
			@JsonProperty("roblox_subscription_auto_renew") Double robloxSubscriptionAutoRenew,
			@JsonProperty("roblox_game_pass_total_robux") Double robloxGamePassTotalRobux,
			@JsonProperty("roblox_game_donations") @Nullable String robloxGameDonations,
			@JsonProperty("roblox_inventory_price") Double robloxInventoryPrice,
			@JsonProperty("roblox_ugc_limited_price") Double robloxUgcLimitedPrice,
			@JsonProperty("roblox_credit_balance") Double robloxCreditBalance,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryRobloxResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable String robloxLinkedAccounts,
			@Nullable String creditBalance,
			@Nullable List<CategoryRobloxResponseItemsRobloxGameDonationsDetails> robloxGameDonationsDetails,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryRobloxResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryRobloxResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryWarfaceResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsWfServers(
			Double id,
			Double rank,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") Double restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryWarfaceResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable JsonNode emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("wf_item_id") Double wfItemId,
			@JsonProperty("wf_players") @Nullable JsonNode wfPlayers,
			@JsonProperty("wf_server_1") Double wfServer_1,
			@JsonProperty("wf_server_2") Double wfServer_2,
			@JsonProperty("wf_server_3") Double wfServer_3,
			@JsonProperty("wf_mobile") Double wfMobile,
			@JsonProperty("wf_bonus_rank") Double wfBonusRank,
			@JsonProperty("wf_mail_mobile") Double wfMailMobile,
			@JsonProperty("wf_last_game_date") Double wfLastGameDate,
			@JsonProperty("wf_loan") @Nullable JsonNode wfLoan,
			@JsonProperty("wf_active_loan") Double wfActiveLoan,
			@JsonProperty("wf_rank") Double wfRank,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryWarfaceResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@JsonProperty("wf_servers") @Nullable List<CategoryWarfaceResponseItemsWfServers> wfServers,
			@Nullable String domain,
			@Nullable JsonNode canViewAccountLink,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryWarfaceResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryMinecraftResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryMinecraftResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("minecraft_item_id") Double minecraftItemId,
			@JsonProperty("minecraft_id") @Nullable String minecraftId,
			@JsonProperty("minecraft_nickname") @Nullable String minecraftNickname,
			@JsonProperty("minecraft_country") @Nullable String minecraftCountry,
			@JsonProperty("minecraft_skin") @Nullable String minecraftSkin,
			@JsonProperty("minecraft_java") Double minecraftJava,
			@JsonProperty("minecraft_bedrock") Double minecraftBedrock,
			@JsonProperty("minecraft_can_change_nickname") Double minecraftCanChangeNickname,
			@JsonProperty("minecraft_created_at") Double minecraftCreatedAt,
			@JsonProperty("minecraft_hypixel_rank") @Nullable String minecraftHypixelRank,
			@JsonProperty("minecraft_hypixel_level") Double minecraftHypixelLevel,
			@JsonProperty("minecraft_hypixel_achievement") Double minecraftHypixelAchievement,
			@JsonProperty("minecraft_hypixel_last_login") Double minecraftHypixelLastLogin,
			@JsonProperty("minecraft_hypixel_ban") Double minecraftHypixelBan,
			@JsonProperty("minecraft_hypixel_ban_reason") @Nullable String minecraftHypixelBanReason,
			@JsonProperty("minecraft_hypixel_skyblock_level") Double minecraftHypixelSkyblockLevel,
			@JsonProperty("minecraft_hypixel_skyblock_net_worth") Double minecraftHypixelSkyblockNetWorth,
			@JsonProperty("minecraft_dungeons") Double minecraftDungeons,
			@JsonProperty("minecraft_legends") Double minecraftLegends,
			@JsonProperty("minecraft_capes_count") Double minecraftCapesCount,
			@JsonProperty("minecraft_capes") @Nullable List<JsonNode> minecraftCapes,
			@JsonProperty("minecraft_subscription_name") @Nullable String minecraftSubscriptionName,
			@JsonProperty("minecraft_subscription_ends") Double minecraftSubscriptionEnds,
			@JsonProperty("minecraft_subscription_auto_renew") Double minecraftSubscriptionAutoRenew,
			@JsonProperty("minecraft_email_reset_date") Double minecraftEmailResetDate,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable CategoryMinecraftResponseItemsBumpSettings bumpSettings,
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode minecraftHasPaidLicense,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<CategoryMinecraftResponseItemsAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryMinecraftResponseItemsSeller seller
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<CategoryHytaleResponseItems> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable JsonNode wasCached,
			Double cacheTTL,
			Double lastModified,
			Double serverTime,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsCategory(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_name") @Nullable String categoryName,
			@JsonProperty("category_url") @Nullable String categoryUrl
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsCopyFormatData(
			@JsonProperty("title_link") @Nullable String titleLink
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItemsSeller(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryHytaleResponseItems(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("pending_deletion_date") Double pendingDeletionDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("auto_bump_period") Double autoBumpPeriod,
			@JsonProperty("rub_price") Double rubPrice,
			@Nullable JsonNode discount,
			@JsonProperty("hytale_item_id") Double hytaleItemId,
			@JsonProperty("hytale_profiles") Double hytaleProfiles,
			@JsonProperty("hytale_edition") @Nullable String hytaleEdition,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@Nullable JsonNode isIgnored,
			Double priceWithSellerFee,
			@Nullable CategoryHytaleResponseItemsCategory category,
			@Nullable JsonNode guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canViewTempEmail,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewItemViews,
			@Nullable JsonNode canManagePublicTag,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable CategoryHytaleResponseItemsCopyFormatData copyFormatData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable JsonNode canBumpItem,
			@Nullable String canNotBumpItemReason,
			@Nullable JsonNode buyer,
			@Nullable JsonNode isPersonalAccount,
			@Nullable JsonNode canBuyItem,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable String priceWithSellerFeeLabel,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItem,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<JsonNode> imagePreviewLinks,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable JsonNode canChangeEmailPassword,
			@Nullable JsonNode uniqueKeyExists,
			@Nullable String itemOriginPhrase,
			@Nullable List<JsonNode> tags,
			@JsonProperty("public_tag") @Nullable JsonNode publicTag,
			@JsonProperty("note_text") @Nullable JsonNode noteText,
			@Nullable JsonNode hasPendingAutoBuy,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable CategoryHytaleResponseItemsSeller seller
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
			@Nullable CategoryListResponseCategory category,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryListResponseCategoryLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryListResponseCategory(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_description") @Nullable String categoryDescription,
			@Nullable CategoryListResponseCategoryLinks links
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponse(
			@Nullable CategoryParamsResponseCategory category,
			@Nullable List<CategoryParamsResponseParams> params,
			@JsonProperty("base_params") @Nullable JsonNode baseParams,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseCategory(
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("sub_category_id") Double subCategoryId,
			@JsonProperty("category_order") Double categoryOrder,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_name") @Nullable String categoryName,
			@JsonProperty("category_url") @Nullable String categoryUrl,
			@JsonProperty("category_description_html") @Nullable String categoryDescriptionHtml,
			@JsonProperty("category_login_url") @Nullable String categoryLoginUrl,
			@JsonProperty("add_item_available") Double addItemAvailable,
			@JsonProperty("mass_upload_item_available") Double massUploadItemAvailable,
			@JsonProperty("has_guarantee") Double hasGuarantee,
			@JsonProperty("has_account_link") Double hasAccountLink,
			@JsonProperty("require_temp_email") Double requireTempEmail,
			@JsonProperty("recovery_link") @Nullable String recoveryLink,
			@JsonProperty("check_button_enabled") Double checkButtonEnabled,
			@JsonProperty("checker_enabled") Double checkerEnabled,
			@JsonProperty("support_personal_proxy") Double supportPersonalProxy,
			@JsonProperty("support_email_login_data") Double supportEmailLoginData,
			@JsonProperty("require_email_login_data") Double requireEmailLoginData,
			@JsonProperty("display_in_list") Double displayInList,
			@JsonProperty("category_description_html_en") @Nullable String categoryDescriptionHtmlEn,
			@JsonProperty("category_h1_html_en") @Nullable String categoryH1HtmlEn,
			@JsonProperty("account_price_min") Double accountPriceMin,
			@JsonProperty("require_video_recording") Double requireVideoRecording,
			@JsonProperty("top_queries") @Nullable String topQueries,
			@JsonProperty("require_eld_for_native_accs") Double requireEldForNativeAccs,
			@JsonProperty("can_be_resold") Double canBeResold,
			@JsonProperty("support_temp_email") Double supportTempEmail,
			@Nullable String cookies,
			@JsonProperty("login_type") @Nullable String loginType,
			@JsonProperty("guest_hidden") Double guestHidden,
			@JsonProperty("available_temp_email") Double availableTempEmail,
			@JsonProperty("resale_duration_limit_days") Double resaleDurationLimitDays,
			@JsonProperty("buy_without_validation") Double buyWithoutValidation,
			@JsonProperty("max_invalid_upload_tries") Double maxInvalidUploadTries
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryParamsResponseParams(
			@Nullable String name,
			@Nullable String input,
			@Nullable String description,
			@Nullable List<String> values
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGamesResponse(
			@Nullable List<CategoryGamesResponseGames> games,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CategoryGamesResponseGames(
			@JsonProperty("app_id") @Nullable String appId,
			@Nullable String title,
			@Nullable String abbr,
			@JsonProperty("category_id") Double categoryId,
			@Nullable String img,
			@Nullable String url,
			@Nullable String ru
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable ListStatesResponseUserItemStates userItemStates,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesStickied(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title,
			Double stickyLimit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesDiscountRequest(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesInBuyersFavorites(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesActive(
			@JsonProperty("item_count") Double itemCount,
			@JsonProperty("item_state") @Nullable String itemState,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPaid(
			@JsonProperty("item_count") Double itemCount,
			@JsonProperty("item_state") @Nullable String itemState,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesClosed(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesDeleted(
			@JsonProperty("item_count") Double itemCount,
			@JsonProperty("item_state") @Nullable String itemState,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesAwaiting(
			@JsonProperty("item_count") Double itemCount,
			@JsonProperty("item_state") @Nullable String itemState,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPreActive(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPreUpload(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesPendingDeletion(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesClosedInactive(
			@JsonProperty("item_count") Double itemCount,
			@JsonProperty("item_state") @Nullable String itemState,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStatesAutoBump(
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("item_count") Double itemCount,
			@Nullable String title
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ListStatesResponseUserItemStates(
			@Nullable ListStatesResponseUserItemStatesStickied stickied,
			@JsonProperty("discount_request") @Nullable ListStatesResponseUserItemStatesDiscountRequest discountRequest,
			@JsonProperty("in_buyers_favorites") @Nullable ListStatesResponseUserItemStatesInBuyersFavorites inBuyersFavorites,
			@Nullable ListStatesResponseUserItemStatesActive active,
			@Nullable ListStatesResponseUserItemStatesPaid paid,
			@Nullable ListStatesResponseUserItemStatesClosed closed,
			@Nullable ListStatesResponseUserItemStatesDeleted deleted,
			@Nullable ListStatesResponseUserItemStatesAwaiting awaiting,
			@JsonProperty("pre_active") @Nullable ListStatesResponseUserItemStatesPreActive preActive,
			@JsonProperty("pre_upload") @Nullable ListStatesResponseUserItemStatesPreUpload preUpload,
			@JsonProperty("pending_deletion") @Nullable ListStatesResponseUserItemStatesPendingDeletion pendingDeletion,
			@JsonProperty("closed_inactive") @Nullable ListStatesResponseUserItemStatesClosedInactive closedInactive,
			@JsonProperty("auto_bump") @Nullable ListStatesResponseUserItemStatesAutoBump autoBump
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode item,
			@Nullable JsonNode canStickItem,
			@Nullable JsonNode canUnstickItem,
			@Nullable JsonNode canBuyItem,
			@Nullable String cannotBuyItemError,
			@Nullable JsonNode canCloseItem,
			@Nullable JsonNode canOpenItem,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canEditItem,
			@Nullable JsonNode canDeleteItem,
			@Nullable JsonNode canCancelConfirmedBuy,
			@Nullable JsonNode canViewItemHistory,
			@Nullable JsonNode faveCount,
			@Nullable JsonNode isVisibleItem,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode showToFavouritesButton,
			@Nullable String itemLink,
			@Nullable JsonNode canChangeOwner,
			@Nullable List<Double> sameItemsIds,
			Double sameItemsCount,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ManagingDeleteBody(
			/** Delete reason. */
			String reason
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable ManagingCreateClaimResponseThread thread,
			@JsonProperty("system_info") @Nullable ManagingCreateClaimResponseSystemInfo systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPostLikeUsers(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPostLinks(
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
		public record ManagingCreateClaimResponseThreadFirstPostPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@Nullable JsonNode reply,
			@Nullable JsonNode like,
			@Nullable JsonNode report,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadFirstPost(
			@JsonProperty("post_id") Double postId,
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("poster_user_id") Double posterUserId,
			@JsonProperty("poster_username") @Nullable String posterUsername,
			@JsonProperty("post_create_date") Double postCreateDate,
			@JsonProperty("post_body") @Nullable String postBody,
			@JsonProperty("post_body_html") @Nullable String postBodyHtml,
			@JsonProperty("post_body_plain_text") @Nullable String postBodyPlainText,
			@Nullable String signature,
			@JsonProperty("signature_html") @Nullable String signatureHtml,
			@JsonProperty("signature_plain_text") @Nullable String signaturePlainText,
			@JsonProperty("post_like_count") Double postLikeCount,
			@JsonProperty("post_attachment_count") Double postAttachmentCount,
			@JsonProperty("like_users") @Nullable List<ManagingCreateClaimResponseThreadFirstPostLikeUsers> likeUsers,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("post_is_published") @Nullable JsonNode postIsPublished,
			@JsonProperty("post_is_deleted") @Nullable JsonNode postIsDeleted,
			@JsonProperty("post_update_date") Double postUpdateDate,
			@JsonProperty("post_is_first_post") @Nullable JsonNode postIsFirstPost,
			@Nullable ManagingCreateClaimResponseThreadFirstPostLinks links,
			@Nullable ManagingCreateClaimResponseThreadFirstPostPermissions permissions
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadLinks(
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
		public record ManagingCreateClaimResponseThreadPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode delete,
			@Nullable JsonNode follow,
			@Nullable JsonNode post,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@Nullable JsonNode edit
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes(
			@JsonProperty("prefix_id") Double prefixId,
			@JsonProperty("prefix_title") @Nullable String prefixTitle
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumForumPrefixes(
			@JsonProperty("group_title") @Nullable String groupTitle,
			@JsonProperty("group_prefixes") @Nullable List<ManagingCreateClaimResponseThreadForumForumPrefixesGroupPrefixes> groupPrefixes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumLinks(
			@Nullable String permalink,
			@Nullable String detail,
			@JsonProperty("sub-categories") @Nullable String subCategories,
			@JsonProperty("sub-forums") @Nullable String subForums,
			@Nullable String threads,
			@Nullable String followers
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForumPermissions(
			@Nullable JsonNode view,
			@Nullable JsonNode edit,
			@Nullable JsonNode delete,
			@JsonProperty("create_thread") @Nullable JsonNode createThread,
			@JsonProperty("upload_attachment") @Nullable JsonNode uploadAttachment,
			@JsonProperty("tag_thread") @Nullable JsonNode tagThread,
			@Nullable JsonNode follow
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThreadForum(
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("forum_title") @Nullable String forumTitle,
			@JsonProperty("forum_description") @Nullable String forumDescription,
			@JsonProperty("forum_thread_count") Double forumThreadCount,
			@JsonProperty("forum_post_count") Double forumPostCount,
			@JsonProperty("forum_prefixes") @Nullable List<ManagingCreateClaimResponseThreadForumForumPrefixes> forumPrefixes,
			@JsonProperty("thread_default_prefix_id") Double threadDefaultPrefixId,
			@JsonProperty("thread_prefix_is_required") @Nullable JsonNode threadPrefixIsRequired,
			@Nullable ManagingCreateClaimResponseThreadForumLinks links,
			@Nullable ManagingCreateClaimResponseThreadForumPermissions permissions,
			@JsonProperty("forum_is_followed") @Nullable JsonNode forumIsFollowed
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseThread(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("forum_id") Double forumId,
			@JsonProperty("thread_title") @Nullable String threadTitle,
			@JsonProperty("thread_view_count") Double threadViewCount,
			@JsonProperty("creator_user_id") Double creatorUserId,
			@JsonProperty("creator_username") @Nullable String creatorUsername,
			@JsonProperty("thread_create_date") Double threadCreateDate,
			@JsonProperty("thread_update_date") Double threadUpdateDate,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("thread_post_count") Double threadPostCount,
			@JsonProperty("thread_is_published") @Nullable JsonNode threadIsPublished,
			@JsonProperty("thread_is_deleted") @Nullable JsonNode threadIsDeleted,
			@JsonProperty("thread_is_sticky") @Nullable JsonNode threadIsSticky,
			@JsonProperty("thread_is_followed") @Nullable JsonNode threadIsFollowed,
			@JsonProperty("first_post") @Nullable ManagingCreateClaimResponseThreadFirstPost firstPost,
			@JsonProperty("thread_prefixes") @Nullable List<JsonNode> threadPrefixes,
			@JsonProperty("thread_tags") @Nullable List<JsonNode> threadTags,
			@Nullable ManagingCreateClaimResponseThreadLinks links,
			@Nullable ManagingCreateClaimResponseThreadPermissions permissions,
			@Nullable ManagingCreateClaimResponseThreadForum forum
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCreateClaimResponseSystemInfo(
			@JsonProperty("visitor_id") Double visitorId,
			Double time
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
			@Nullable List<JsonNode> items,
			@JsonProperty("left_item_id") @Nullable List<Double> leftItemId,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			Double appId,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamInventoryValueResponseData(
			@Nullable JsonNode items,
			@JsonProperty("steam_id") @Nullable String steamId,
			Double appId,
			@Nullable String appTitle,
			Double totalValue,
			Double itemCount,
			Double marketableItemCount,
			@Nullable String currency,
			@Nullable String currencyIcon,
			@Nullable String language,
			Double time
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
			Double appId,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamValueResponseData(
			@Nullable JsonNode items,
			@JsonProperty("steam_id") @Nullable String steamId,
			Double appId,
			@Nullable String appTitle,
			Double totalValue,
			Double itemCount,
			Double marketableItemCount,
			@Nullable String currency,
			@Nullable String currencyIcon,
			@Nullable String language,
			Double time
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
			/** Account origin. Where did you get it from. */
			@JsonProperty("item_origin") ManagingItemOrigin itemOrigin,
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAIPriceResponse(
			Double price,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBuyPriceResponse(
			Double price,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable JsonNode item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingBumpResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ManagingAutoBumpBody(
			/** Interval in hours */
			Long hour
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBumpResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingAutoBumpDisableResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingOpenResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCloseResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record ManagingImageParams(
			/** Type of image. */
			ManagingTypeImage type
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingImageResponse(
			@Nullable String base64,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEmailCodeResponse(
			@Nullable JsonNode item,
			@Nullable ManagingEmailCodeResponseCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingEmailCodeResponseCodeData(
			@Nullable String code,
			Double date,
			@Nullable String textPlain
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
			@Nullable String email,
			@Nullable List<ManagingGetLetters2ResponseLetters> letters,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingGetLetters2ResponseLetters(
			@Nullable String textHtml,
			@Nullable String textPlain,
			@Nullable String from,
			Double date
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponse(
			@Nullable ManagingSteamGetMafileResponseMaFile maFile,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponseMaFileSession(
			@Nullable String SessionID,
			@Nullable String AccessToken,
			@Nullable String RefreshToken,
			@Nullable String SteamID,
			@Nullable String SteamLoginSecure
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamGetMafileResponseMaFile(
			@JsonProperty("shared_secret") @Nullable String sharedSecret,
			@JsonProperty("serial_number") Double serialNumber,
			@JsonProperty("revocation_code") @Nullable String revocationCode,
			@Nullable String uri,
			@JsonProperty("account_name") @Nullable String accountName,
			@JsonProperty("token_gid") @Nullable String tokenGid,
			@JsonProperty("identity_secret") @Nullable String identitySecret,
			@Nullable String secret_1,
			@JsonProperty("device_id") @Nullable String deviceId,
			@JsonProperty("fully_enrolled") @Nullable JsonNode fullyEnrolled,
			@Nullable ManagingSteamGetMafileResponseMaFileSession Session
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamAddMafileResponse(
			@Nullable String status,
			@Nullable String message,
			@Nullable JsonNode item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamRemoveMafileResponse(
			@Nullable String status,
			@Nullable String message,
			@Nullable JsonNode item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamMafileCodeResponse(
			@Nullable JsonNode item,
			@Nullable ManagingSteamMafileCodeResponseCodeData codeData
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingSteamMafileCodeResponseCodeData(
			@Nullable String code,
			Double date,
			@Nullable String textPlain
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramCodeResponse(
			@Nullable JsonNode item,
			@Nullable ManagingTelegramCodeResponseCodes codes
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramCodeResponseCodes(
			@Nullable String code,
			Double date
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTelegramResetAuthResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingRefuseGuaranteeResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingCheckGuaranteeResponse(
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("new_password") @Nullable String newPassword
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTempEmailPasswordResponse(
			@Nullable ManagingTempEmailPasswordResponseItem item
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTempEmailPasswordResponseItem(
			@Nullable String account
		) {}

		public record ManagingTagBody(
			/** Tag ID. */
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTagResponse(
			Double itemId,
			@Nullable ManagingTagResponseTag tag,
			Double addedTagId,
			@Nullable List<Double> deleteTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingTagResponseTag(
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title,
			@Nullable JsonNode isDefault,
			@Nullable JsonNode forOwnedAccountsOnly,
			@Nullable String bc
		) {}

		public record ManagingUntagBody(
			/** Tag ID. */
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUntagResponse(
			Double itemId,
			@Nullable ManagingUntagResponseTag tag,
			Double addedTagId,
			@Nullable List<Double> deleteTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUntagResponseTag(
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title,
			@Nullable JsonNode isDefault,
			@Nullable JsonNode forOwnedAccountsOnly,
			@Nullable String bc
		) {}

		public record ManagingPublicTagBody(
			/** Tag ID. */
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicTagResponse(
			Double itemId,
			@Nullable ManagingPublicTagResponseTag tag,
			Double addedTagId,
			@Nullable List<Double> deleteTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicTagResponseTag(
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title,
			@Nullable JsonNode isDefault,
			@Nullable JsonNode forOwnedAccountsOnly,
			@Nullable String bc
		) {}

		public record ManagingPublicUntagBody(
			/** Tag ID. */
			@JsonProperty("tag_id") Long tagId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicUntagResponse(
			Double itemId,
			@Nullable ManagingPublicUntagResponseTag tag,
			Double addedTagId,
			@Nullable List<Double> deleteTags,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingPublicUntagResponseTag(
			@JsonProperty("tag_id") Double tagId,
			@Nullable String title,
			@Nullable JsonNode isDefault,
			@Nullable JsonNode forOwnedAccountsOnly,
			@Nullable String bc
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingFavoriteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnfavoriteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingStickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ManagingUnstickResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<ProfileClaimsResponseClaims> claims,
			@Nullable ProfileClaimsResponseStats stats,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthorLinks(
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
		public record ProfileClaimsResponseClaimsAuthorPermissions(
			@Nullable JsonNode edit,
			@Nullable JsonNode follow,
			@Nullable JsonNode ignore
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthorFields(
			@Nullable String id,
			@Nullable String title,
			@Nullable String description,
			@Nullable String position,
			@JsonProperty("is_required") @Nullable JsonNode isRequired
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaimsAuthor(
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
			@Nullable ProfileClaimsResponseClaimsAuthorLinks links,
			@Nullable ProfileClaimsResponseClaimsAuthorPermissions permissions,
			@JsonProperty("user_is_ignored") @Nullable JsonNode userIsIgnored,
			@JsonProperty("user_is_visitor") @Nullable JsonNode userIsVisitor,
			@JsonProperty("user_group_id") Double userGroupId,
			@JsonProperty("ban_reason") @Nullable String banReason,
			@Nullable List<ProfileClaimsResponseClaimsAuthorFields> fields
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseClaims(
			@JsonProperty("thread_id") Double threadId,
			@JsonProperty("claim_date") Double claimDate,
			@JsonProperty("claim_state") @Nullable String claimState,
			@JsonProperty("message_body") @Nullable String messageBody,
			@JsonProperty("amount_formatted") @Nullable String amountFormatted,
			@Nullable ProfileClaimsResponseClaimsAuthor author
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStatsMarket(
			Double total,
			Double solved,
			Double settled,
			Double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStatsNoMarket(
			Double total,
			Double solved,
			Double settled,
			Double rejected
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProfileClaimsResponseStats(
			@Nullable ProfileClaimsResponseStatsMarket market,
			@Nullable ProfileClaimsResponseStatsNoMarket noMarket
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
			@Nullable JsonNode user,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("origin[]") JsonNode origin,
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
			@Nullable List<JsonNode> items,
			Double totalItems,
			@Nullable JsonNode totalItemsPrice,
			@Nullable JsonNode hasNextPage,
			Double perPage,
			Double page,
			@Nullable String searchUrl,
			@Nullable List<JsonNode> stickyItems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record CartAddBody(
			/** Item id. */
			@JsonProperty("item_id") Long itemId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CartAddResponse(
			@Nullable JsonNode success,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode success,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable PurchasingFastBuyResponseItem item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			Double endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			Double remainingTime,
			@Nullable String remainingTimePhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemEmailLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable String encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemBuyer(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("operation_date") Double operationDate,
			@Nullable JsonNode visitorIsBuyer,
			@Nullable String username,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_group_id") Double userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemExtraPrices(
			@Nullable String currency,
			@Nullable String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItemSeller(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("joined_date") Double joinedDate,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@JsonProperty("restore_percents") Double restorePercents,
			@Nullable JsonNode isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingFastBuyResponseItem(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@Nullable String login,
			@JsonProperty("temp_email") @Nullable String tempEmail,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@Nullable String information,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("information_en") @Nullable String informationEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("user_allow_ask_discount") Double userAllowAskDiscount,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@JsonProperty("market_custom_title") @Nullable String marketCustomTitle,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@JsonProperty("buyer_avatar_date") Double buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") Double buyerUserGroupId,
			Double priceWithSellerFee,
			@Nullable PurchasingFastBuyResponseItemGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable PurchasingFastBuyResponseItemLoginData loginData,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable PurchasingFastBuyResponseItemEmailLoginData emailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable String getEmailCodeDisplayLogin,
			@Nullable PurchasingFastBuyResponseItemBuyer buyer,
			@Nullable JsonNode isPersonalAccount,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode displayConvertedBalance,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<PurchasingFastBuyResponseItemAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable JsonNode visitorIsAuthor,
			@Nullable JsonNode canAskDiscount,
			@Nullable JsonNode tags,
			@Nullable List<JsonNode> customFields,
			@Nullable List<JsonNode> externalAuth,
			@Nullable JsonNode isTrusted,
			@Nullable JsonNode isBirthdayToday,
			@Nullable JsonNode isIgnored,
			Double deposit,
			@Nullable List<PurchasingFastBuyResponseItemExtraPrices> extraPrices,
			@Nullable JsonNode canViewAccountLoginAndTempEmail,
			@Nullable PurchasingFastBuyResponseItemBumpSettings bumpSettings,
			@Nullable JsonNode canCheckGuarantee,
			@Nullable JsonNode needToRequireVideoToViewLoginData,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable PurchasingFastBuyResponseItemSeller seller
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponse(
			@Nullable String status,
			@Nullable PurchasingCheckResponseItem item,
			@Nullable JsonNode requireVideoRecording,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			@Nullable JsonNode endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			@Nullable JsonNode remainingTime
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemExtraPrices(
			@Nullable String currency,
			@Nullable String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItemSeller(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("joined_date") Double joinedDate,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@JsonProperty("restore_percents") @Nullable JsonNode restorePercents,
			@Nullable JsonNode isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingCheckResponseItem(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("user_allow_ask_discount") Double userAllowAskDiscount,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@JsonProperty("market_custom_title") @Nullable String marketCustomTitle,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@JsonProperty("category_title") @Nullable String categoryTitle,
			@JsonProperty("category_url") @Nullable String categoryUrl,
			@JsonProperty("require_temp_email") Double requireTempEmail,
			@JsonProperty("available_temp_email") Double availableTempEmail,
			@JsonProperty("check_button_enabled") Double checkButtonEnabled,
			@JsonProperty("checker_enabled") Double checkerEnabled,
			@JsonProperty("buy_without_validation") Double buyWithoutValidation,
			@JsonProperty("has_guarantee") Double hasGuarantee,
			@JsonProperty("require_video_recording") Double requireVideoRecording,
			@JsonProperty("can_be_resold") Double canBeResold,
			@JsonProperty("login_type") @Nullable String loginType,
			@JsonProperty("require_email_login_data") Double requireEmailLoginData,
			@JsonProperty("category_prefix_id") Double categoryPrefixId,
			@JsonProperty("ask_user_id") @Nullable JsonNode askUserId,
			@JsonProperty("ask_item_id") @Nullable JsonNode askItemId,
			@JsonProperty("ask_date") @Nullable JsonNode askDate,
			@JsonProperty("discount_price") @Nullable JsonNode discountPrice,
			@JsonProperty("discount_accepted") @Nullable JsonNode discountAccepted,
			@JsonProperty("user_alerted") @Nullable JsonNode userAlerted,
			@Nullable JsonNode message,
			@JsonProperty("min_price") Double minPrice,
			Double priceWithSellerFee,
			@Nullable PurchasingCheckResponseItemGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable JsonNode isPersonalAccount,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@Nullable JsonNode isSmallExf,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<PurchasingCheckResponseItemAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable JsonNode visitorIsAuthor,
			@Nullable JsonNode canAskDiscount,
			@Nullable List<JsonNode> tags,
			@Nullable List<JsonNode> customFields,
			@Nullable List<JsonNode> externalAuth,
			@Nullable JsonNode isTrusted,
			@Nullable JsonNode isBirthdayToday,
			@Nullable JsonNode isIgnored,
			Double deposit,
			@Nullable List<PurchasingCheckResponseItemExtraPrices> extraPrices,
			@Nullable JsonNode canViewAccountLoginAndTempEmail,
			@Nullable PurchasingCheckResponseItemBumpSettings bumpSettings,
			@Nullable JsonNode canCheckGuarantee,
			@Nullable JsonNode needToRequireVideoToViewLoginData,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable PurchasingCheckResponseItemSeller seller
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
			@Nullable PurchasingConfirmResponseItem item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponseItemLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable String encodedOldPassword,
			@Nullable JsonNode adviceToChangePassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingConfirmResponseItem(
			@Nullable PurchasingConfirmResponseItemLoginData loginData
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PurchasingDiscountCancelResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── CustomDiscountsApi Types ────────────────────────────────────────

	public static final class CustomDiscountsApiTypes {

		private CustomDiscountsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record CustomDiscountsGetResponse(
			@Nullable List<JsonNode> discounts,
			Double total,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode discount,
			Double total,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> discounts,
			Double total,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			/** Account origin. Where did you get it from. */
			@JsonProperty("item_origin") PublishingItemOrigin itemOrigin,
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
			public PublishingFastSellBody(Double price, CategoryId categoryId, Currency currency, PublishingItemOrigin itemOrigin) {
				this(null, null, price, categoryId, currency, itemOrigin, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingFastSellResponse(
			@Nullable JsonNode item,
			@Nullable String itemLink,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			/** Account origin. Where did you get it from. */
			@JsonProperty("item_origin") PublishingItemOrigin itemOrigin,
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
			public PublishingAddBody(Double price, CategoryId categoryId, Currency currency, PublishingItemOrigin itemOrigin) {
				this(null, null, price, categoryId, currency, itemOrigin, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingAddResponse(
			@Nullable String status,
			@Nullable JsonNode item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable PublishingCheckResponseItem item,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemGuarantee(
			Double duration,
			@Nullable String class_,
			@Nullable String durationPhrase,
			Double endDate,
			@Nullable JsonNode active,
			@Nullable JsonNode cancelled,
			Double remainingTime,
			@Nullable String remainingTimePhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable JsonNode encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemEmailLoginData(
			@Nullable String raw,
			@Nullable String encodedRaw,
			@Nullable String login,
			@Nullable String password,
			@Nullable String encodedPassword,
			@Nullable String oldPassword,
			@Nullable String encodedOldPassword
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemBuyer(
			@JsonProperty("user_id") Double userId,
			@JsonProperty("operation_date") Double operationDate,
			@Nullable JsonNode visitorIsBuyer,
			@Nullable String username,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("uniq_username_css") @Nullable String uniqUsernameCss,
			@JsonProperty("user_group_id") Double userGroupId
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemAccountLinks(
			@Nullable String link,
			@Nullable String text,
			@Nullable String iconClass
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemExtraPrices(
			@Nullable String currency,
			@Nullable String price
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemBumpSettings(
			@Nullable JsonNode canBumpItem,
			@Nullable JsonNode canBumpItemGlobally,
			@Nullable JsonNode shortErrorPhrase,
			@Nullable JsonNode errorPhrase
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItemSeller(
			@JsonProperty("user_id") Double userId,
			@Nullable String username,
			@JsonProperty("avatar_date") Double avatarDate,
			@JsonProperty("is_banned") Double isBanned,
			@JsonProperty("display_style_group_id") Double displayStyleGroupId,
			@JsonProperty("joined_date") Double joinedDate,
			@JsonProperty("sold_items_count") Double soldItemsCount,
			@JsonProperty("active_items_count") Double activeItemsCount,
			@JsonProperty("restore_data") @Nullable String restoreData,
			@JsonProperty("restore_percents") Double restorePercents,
			@Nullable JsonNode isOnline
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PublishingCheckResponseItem(
			@JsonProperty("item_id") Double itemId,
			@JsonProperty("item_state") @Nullable String itemState,
			@JsonProperty("category_id") Double categoryId,
			@JsonProperty("published_date") Double publishedDate,
			@Nullable String title,
			@Nullable String description,
			Double price,
			@JsonProperty("update_stat_date") Double updateStatDate,
			@JsonProperty("refreshed_date") Double refreshedDate,
			@JsonProperty("edit_date") Double editDate,
			@Nullable String login,
			@JsonProperty("temp_email") @Nullable String tempEmail,
			@JsonProperty("view_count") Double viewCount,
			@JsonProperty("is_sticky") Double isSticky,
			@Nullable String information,
			@JsonProperty("item_origin") @Nullable String itemOrigin,
			@JsonProperty("extended_guarantee") Double extendedGuarantee,
			Double nsb,
			@JsonProperty("allow_ask_discount") Double allowAskDiscount,
			@JsonProperty("title_en") @Nullable String titleEn,
			@JsonProperty("description_en") @Nullable String descriptionEn,
			@JsonProperty("information_en") @Nullable String informationEn,
			@JsonProperty("email_type") @Nullable String emailType,
			@JsonProperty("email_provider") @Nullable String emailProvider,
			@JsonProperty("item_domain") @Nullable String itemDomain,
			@JsonProperty("resale_item_origin") @Nullable String resaleItemOrigin,
			@JsonProperty("user_allow_ask_discount") Double userAllowAskDiscount,
			@JsonProperty("max_discount_percent") Double maxDiscountPercent,
			@JsonProperty("market_custom_title") @Nullable String marketCustomTitle,
			@JsonProperty("feedback_data") @Nullable String feedbackData,
			@JsonProperty("buyer_avatar_date") Double buyerAvatarDate,
			@JsonProperty("buyer_user_group_id") Double buyerUserGroupId,
			Double priceWithSellerFee,
			@Nullable PublishingCheckResponseItemGuarantee guarantee,
			@Nullable JsonNode canViewLoginData,
			@Nullable JsonNode canUpdateItemStats,
			@Nullable JsonNode canReportItem,
			@Nullable PublishingCheckResponseItemLoginData loginData,
			@Nullable JsonNode canViewEmailLoginData,
			@Nullable PublishingCheckResponseItemEmailLoginData emailLoginData,
			@Nullable JsonNode showGetEmailCodeButton,
			@Nullable String getEmailCodeDisplayLogin,
			@Nullable PublishingCheckResponseItemBuyer buyer,
			@Nullable JsonNode isPersonalAccount,
			@JsonProperty("sold_items_category_count") Double soldItemsCategoryCount,
			@JsonProperty("restore_items_category_count") Double restoreItemsCategoryCount,
			@JsonProperty("rub_price") Double rubPrice,
			@JsonProperty("price_currency") @Nullable String priceCurrency,
			@Nullable JsonNode canValidateAccount,
			@Nullable JsonNode canResellItemAfterPurchase,
			@JsonProperty("account_last_activity") Double accountLastActivity,
			@Nullable JsonNode displayConvertedBalance,
			@Nullable JsonNode canViewAccountLink,
			@Nullable List<PublishingCheckResponseItemAccountLinks> accountLinks,
			@Nullable String accountLink,
			@Nullable String emailLoginUrl,
			@Nullable JsonNode canChangePassword,
			@Nullable String itemOriginPhrase,
			@Nullable JsonNode visitorIsAuthor,
			@Nullable JsonNode canAskDiscount,
			@Nullable JsonNode tags,
			@Nullable List<JsonNode> customFields,
			@Nullable List<JsonNode> externalAuth,
			@Nullable JsonNode isTrusted,
			@Nullable JsonNode isBirthdayToday,
			@Nullable JsonNode isIgnored,
			Double deposit,
			@Nullable List<PublishingCheckResponseItemExtraPrices> extraPrices,
			@Nullable JsonNode canViewAccountLoginAndTempEmail,
			@Nullable PublishingCheckResponseItemBumpSettings bumpSettings,
			@Nullable JsonNode canCheckGuarantee,
			@Nullable JsonNode needToRequireVideoToViewLoginData,
			@Nullable String descriptionHtml,
			@Nullable String descriptionEnHtml,
			@Nullable String descriptionPlain,
			@Nullable String descriptionEnPlain,
			@Nullable PublishingCheckResponseItemSeller seller
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode invoice,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode invoice,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable List<JsonNode> invoices,
			Double count,
			Double page,
			Double perPage,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponse(
			@Nullable PaymentsCurrencyResponseCurrencyList currencyList,
			Double lastUpdate,
			@Nullable String visitorCurrency,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBTC(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListETH(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBNB(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBCH(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListXMR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSOL(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListLTC(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDASH(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTON(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUSDT(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMATIC(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTRX(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDOGE(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKWD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListGBP(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCHF(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListEUR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUSD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSGD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCAD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListAUD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListNZD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBGN(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListGEL(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListILS(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListQAR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPEN(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListAED(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSAR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPLN(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMYR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRON(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListBRL(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListDKK(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCNY(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListHKD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListSEK(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListNOK(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListZAR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListMXN(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCZK(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTWD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTHB(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListTRY(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUAH(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListUYU(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListPHP(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListINR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRUB(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListRSD(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListJPY(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListHUF(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKZT(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCRC(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCLP(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListARS(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListKRW(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListCOP(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListIDR(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyListVND(
			@Nullable String title,
			Double rate,
			@Nullable String formattedRate,
			@Nullable String symbol
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCurrencyResponseCurrencyList(
			@Nullable PaymentsCurrencyResponseCurrencyListBTC BTC,
			@Nullable PaymentsCurrencyResponseCurrencyListETH ETH,
			@Nullable PaymentsCurrencyResponseCurrencyListBNB BNB,
			@Nullable PaymentsCurrencyResponseCurrencyListBCH BCH,
			@Nullable PaymentsCurrencyResponseCurrencyListXMR XMR,
			@Nullable PaymentsCurrencyResponseCurrencyListSOL SOL,
			@Nullable PaymentsCurrencyResponseCurrencyListLTC LTC,
			@Nullable PaymentsCurrencyResponseCurrencyListDASH DASH,
			@Nullable PaymentsCurrencyResponseCurrencyListTON TON,
			@Nullable PaymentsCurrencyResponseCurrencyListUSDT USDT,
			@Nullable PaymentsCurrencyResponseCurrencyListMATIC MATIC,
			@Nullable PaymentsCurrencyResponseCurrencyListTRX TRX,
			@Nullable PaymentsCurrencyResponseCurrencyListDOGE DOGE,
			@Nullable PaymentsCurrencyResponseCurrencyListKWD KWD,
			@Nullable PaymentsCurrencyResponseCurrencyListGBP GBP,
			@Nullable PaymentsCurrencyResponseCurrencyListCHF CHF,
			@Nullable PaymentsCurrencyResponseCurrencyListEUR EUR,
			@Nullable PaymentsCurrencyResponseCurrencyListUSD USD,
			@Nullable PaymentsCurrencyResponseCurrencyListSGD SGD,
			@Nullable PaymentsCurrencyResponseCurrencyListCAD CAD,
			@Nullable PaymentsCurrencyResponseCurrencyListAUD AUD,
			@Nullable PaymentsCurrencyResponseCurrencyListNZD NZD,
			@Nullable PaymentsCurrencyResponseCurrencyListBGN BGN,
			@Nullable PaymentsCurrencyResponseCurrencyListGEL GEL,
			@Nullable PaymentsCurrencyResponseCurrencyListILS ILS,
			@Nullable PaymentsCurrencyResponseCurrencyListQAR QAR,
			@Nullable PaymentsCurrencyResponseCurrencyListPEN PEN,
			@Nullable PaymentsCurrencyResponseCurrencyListAED AED,
			@Nullable PaymentsCurrencyResponseCurrencyListSAR SAR,
			@Nullable PaymentsCurrencyResponseCurrencyListPLN PLN,
			@Nullable PaymentsCurrencyResponseCurrencyListMYR MYR,
			@Nullable PaymentsCurrencyResponseCurrencyListRON RON,
			@Nullable PaymentsCurrencyResponseCurrencyListBRL BRL,
			@Nullable PaymentsCurrencyResponseCurrencyListDKK DKK,
			@Nullable PaymentsCurrencyResponseCurrencyListCNY CNY,
			@Nullable PaymentsCurrencyResponseCurrencyListHKD HKD,
			@Nullable PaymentsCurrencyResponseCurrencyListSEK SEK,
			@Nullable PaymentsCurrencyResponseCurrencyListNOK NOK,
			@Nullable PaymentsCurrencyResponseCurrencyListZAR ZAR,
			@Nullable PaymentsCurrencyResponseCurrencyListMXN MXN,
			@Nullable PaymentsCurrencyResponseCurrencyListCZK CZK,
			@Nullable PaymentsCurrencyResponseCurrencyListTWD TWD,
			@Nullable PaymentsCurrencyResponseCurrencyListTHB THB,
			@Nullable PaymentsCurrencyResponseCurrencyListTRY TRY,
			@Nullable PaymentsCurrencyResponseCurrencyListUAH UAH,
			@Nullable PaymentsCurrencyResponseCurrencyListUYU UYU,
			@Nullable PaymentsCurrencyResponseCurrencyListPHP PHP,
			@Nullable PaymentsCurrencyResponseCurrencyListINR INR,
			@Nullable PaymentsCurrencyResponseCurrencyListRUB RUB,
			@Nullable PaymentsCurrencyResponseCurrencyListRSD RSD,
			@Nullable PaymentsCurrencyResponseCurrencyListJPY JPY,
			@Nullable PaymentsCurrencyResponseCurrencyListHUF HUF,
			@Nullable PaymentsCurrencyResponseCurrencyListKZT KZT,
			@Nullable PaymentsCurrencyResponseCurrencyListCRC CRC,
			@Nullable PaymentsCurrencyResponseCurrencyListCLP CLP,
			@Nullable PaymentsCurrencyResponseCurrencyListARS ARS,
			@Nullable PaymentsCurrencyResponseCurrencyListKRW KRW,
			@Nullable PaymentsCurrencyResponseCurrencyListCOP COP,
			@Nullable PaymentsCurrencyResponseCurrencyListIDR IDR,
			@Nullable PaymentsCurrencyResponseCurrencyListVND VND
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponse(
			@Nullable PaymentsBalanceListResponseFrom from,
			@Nullable PaymentsBalanceListResponseTo to,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseFromBalance(
			@Nullable String balance,
			Double convertedBalance,
			@Nullable String fullTitle,
			@Nullable String title,
			@Nullable String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseFrom(
			@Nullable PaymentsBalanceListResponseFromBalance balance,
			@JsonProperty("12345") @Nullable JsonNode _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceListResponseTo(
			@Nullable JsonNode balance
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
			@Nullable PaymentsBalanceExchangeResponseFrom from,
			@Nullable PaymentsBalanceExchangeResponseTo to,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseFromBalance(
			@Nullable String balance,
			Double convertedBalance,
			@Nullable String fullTitle,
			@Nullable String title,
			@Nullable String type
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseFrom(
			@Nullable PaymentsBalanceExchangeResponseFromBalance balance,
			@JsonProperty("12345") @Nullable JsonNode _12345
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsBalanceExchangeResponseTo(
			@Nullable JsonNode balance
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("commission_percentage") Double commissionPercentage,
			Double spentCurrentMonth,
			@Nullable PaymentsFeeResponseCalculator calculator,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsFeeResponseCalculator(
			Double inputAmount,
			Double commissionAmount,
			Double totalOutputAmount
		) {}

		public record PaymentsCancelBody(
			/** Payment id. */
			@JsonProperty("payment_id") Long paymentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsCancelResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable JsonNode payments,
			@Nullable String perPage,
			Double page,
			@Nullable String pageNavLink,
			@Nullable PaymentsHistoryResponsePageNavParams pageNavParams,
			@Nullable String periodLabel,
			@Nullable String periodLabelPhrase,
			@Nullable JsonNode filterDatesDefault,
			@Nullable PaymentsHistoryResponseInput input,
			@Nullable JsonNode paymentStats,
			@Nullable JsonNode hasNextPage,
			Double lastOperationId,
			@Nullable String nextPageHref,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponsePageNavParams(
			@Nullable String type,
			@Nullable String startDate,
			@Nullable String endDate
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsHistoryResponseInput(
			@JsonProperty("user_id") Double userId,
			@Nullable String type,
			@Nullable String startDate,
			@Nullable String endDate,
			Double page,
			@JsonProperty("period_label") @Nullable String periodLabel,
			@Nullable String receiver,
			@Nullable String sender,
			@Nullable String comment,
			@Nullable String pmin,
			@Nullable String pmax,
			@JsonProperty("category_id") Double categoryId,
			@Nullable String wallet,
			@JsonProperty("is_hold") @Nullable JsonNode isHold,
			@Nullable String currency,
			@JsonProperty("operation_id_lt") Double operationIdLt
		) {}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponse(
			@Nullable List<PaymentsPayoutServicesResponseSystems> systems,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBEP20(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTRC20(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersERC20(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTRX(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBTC(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersTON(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersETH(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersLTC(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBNB(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersDASH(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersDOGE(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersXMR(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersSOL(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProvidersBCH(
			@Nullable String title,
			@Nullable JsonNode isUnavailable
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystemsProviders(
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersBEP20 BEP20,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersTRC20 TRC20,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersERC20 ERC20,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersTRX TRX,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersBTC BTC,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersTON TON,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersETH ETH,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersLTC LTC,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersBNB BNB,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersDASH DASH,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersDOGE DOGE,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersXMR XMR,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersSOL SOL,
			@Nullable PaymentsPayoutServicesResponseSystemsProvidersBCH BCH
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record PaymentsPayoutServicesResponseSystems(
			@Nullable String system,
			@Nullable String commission,
			Double min,
			Double max,
			@JsonProperty("instant_payout") @Nullable JsonNode instantPayout,
			@JsonProperty("problematic_payout") @Nullable JsonNode problematicPayout,
			@JsonProperty("is_unavailable") @Nullable JsonNode isUnavailable,
			@Nullable JsonNode p2p,
			@JsonProperty("has_wallet") @Nullable JsonNode hasWallet,
			@Nullable PaymentsPayoutServicesResponseSystemsProviders providers
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── AutoPaymentsApi Types ────────────────────────────────────────

	public static final class AutoPaymentsApiTypes {

		private AutoPaymentsApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsListResponse(
			@Nullable JsonNode payments,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("auto_payment_id") Double autoPaymentId,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

		public record AutoPaymentsDeleteBody(
			/** Auto payment ID. */
			@JsonProperty("auto_payment_id") Long autoPaymentId
		) {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record AutoPaymentsDeleteResponse(
			@Nullable String status,
			@Nullable String message,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── ProxyApi Types ────────────────────────────────────────

	public static final class ProxyApiTypes {

		private ProxyApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponse(
			@Nullable List<ProxyGetResponseProxies> proxies,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponseProxiesProxy(
			@JsonProperty("proxy_id") Double proxyId,
			@JsonProperty("user_id") Double userId,
			@JsonProperty("proxy_ip") @Nullable String proxyIp,
			@JsonProperty("proxy_port") Double proxyPort,
			@JsonProperty("proxy_user") @Nullable String proxyUser,
			@JsonProperty("proxy_pass") @Nullable String proxyPass,
			@Nullable String proxyString
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record ProxyGetResponseProxies(
			@Nullable ProxyGetResponseProxiesProxy proxy
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
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
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponse(
			@Nullable BatchBatchResponseJobs jobs,
			@JsonProperty("system_info") @Nullable JsonNode systemInfo
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponseJobsJobId(
			@JsonProperty("_job_result") @Nullable String JobResult,
			@JsonProperty("_job_error") @Nullable String JobError
		) {}
	
		@JsonIgnoreProperties(ignoreUnknown = true)
		public record BatchBatchResponseJobs(
			@JsonProperty("job_id") @Nullable BatchBatchResponseJobsJobId jobId
		) {}

	}

}
