// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.market;

import com.fasterxml.jackson.databind.JsonNode;
import com.lolzteam.api.runtime.ClientConfig;
import com.lolzteam.api.runtime.LolzteamHttpClient;
import com.lolzteam.api.runtime.RateLimitConfig;
import com.lolzteam.api.runtime.RequestOptions;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class CategoryApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	CategoryApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.CategoryApiTypes.CategoryAllResponse all(Types.CategoryApiTypes.CategoryAllParams params) {
		return new Types.CategoryApiTypes.CategoryAllResponse(http.request(new RequestOptions(
			"GET",
			"/",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryAllResponse all() {
		return all(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryAllResponse> allAsync(Types.CategoryApiTypes.CategoryAllParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryAllResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryAllResponse> allAsync() {
		return allAsync(null);
	}

	public Types.CategoryApiTypes.CategorySteamResponse steam(Types.CategoryApiTypes.CategorySteamParams params) {
		return new Types.CategoryApiTypes.CategorySteamResponse(http.request(new RequestOptions(
			"GET",
			"/steam",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategorySteamResponse steam() {
		return steam(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySteamResponse> steamAsync(Types.CategoryApiTypes.CategorySteamParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/steam",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategorySteamResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySteamResponse> steamAsync() {
		return steamAsync(null);
	}

	public Types.CategoryApiTypes.CategoryFortniteResponse fortnite(Types.CategoryApiTypes.CategoryFortniteParams params) {
		return new Types.CategoryApiTypes.CategoryFortniteResponse(http.request(new RequestOptions(
			"GET",
			"/fortnite",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryFortniteResponse fortnite() {
		return fortnite(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryFortniteResponse> fortniteAsync(Types.CategoryApiTypes.CategoryFortniteParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/fortnite",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryFortniteResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryFortniteResponse> fortniteAsync() {
		return fortniteAsync(null);
	}

	public Types.CategoryApiTypes.CategoryMihoyoResponse mihoyo(Types.CategoryApiTypes.CategoryMihoyoParams params) {
		return new Types.CategoryApiTypes.CategoryMihoyoResponse(http.request(new RequestOptions(
			"GET",
			"/mihoyo",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryMihoyoResponse mihoyo() {
		return mihoyo(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryMihoyoResponse> mihoyoAsync(Types.CategoryApiTypes.CategoryMihoyoParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/mihoyo",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryMihoyoResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryMihoyoResponse> mihoyoAsync() {
		return mihoyoAsync(null);
	}

	public Types.CategoryApiTypes.CategoryRiotResponse riot(Types.CategoryApiTypes.CategoryRiotParams params) {
		return new Types.CategoryApiTypes.CategoryRiotResponse(http.request(new RequestOptions(
			"GET",
			"/riot",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryRiotResponse riot() {
		return riot(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryRiotResponse> riotAsync(Types.CategoryApiTypes.CategoryRiotParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/riot",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryRiotResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryRiotResponse> riotAsync() {
		return riotAsync(null);
	}

	public Types.CategoryApiTypes.CategoryTelegramResponse telegram(Types.CategoryApiTypes.CategoryTelegramParams params) {
		return new Types.CategoryApiTypes.CategoryTelegramResponse(http.request(new RequestOptions(
			"GET",
			"/telegram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryTelegramResponse telegram() {
		return telegram(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryTelegramResponse> telegramAsync(Types.CategoryApiTypes.CategoryTelegramParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/telegram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryTelegramResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryTelegramResponse> telegramAsync() {
		return telegramAsync(null);
	}

	public Types.CategoryApiTypes.CategorySupercellResponse supercell(Types.CategoryApiTypes.CategorySupercellParams params) {
		return new Types.CategoryApiTypes.CategorySupercellResponse(http.request(new RequestOptions(
			"GET",
			"/supercell",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategorySupercellResponse supercell() {
		return supercell(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySupercellResponse> supercellAsync(Types.CategoryApiTypes.CategorySupercellParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/supercell",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategorySupercellResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySupercellResponse> supercellAsync() {
		return supercellAsync(null);
	}

	public Types.CategoryApiTypes.CategoryEaResponse ea(Types.CategoryApiTypes.CategoryEaParams params) {
		return new Types.CategoryApiTypes.CategoryEaResponse(http.request(new RequestOptions(
			"GET",
			"/ea",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryEaResponse ea() {
		return ea(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEaResponse> eaAsync(Types.CategoryApiTypes.CategoryEaParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/ea",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryEaResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEaResponse> eaAsync() {
		return eaAsync(null);
	}

	public Types.CategoryApiTypes.CategoryWotResponse wot(Types.CategoryApiTypes.CategoryWotParams params) {
		return new Types.CategoryApiTypes.CategoryWotResponse(http.request(new RequestOptions(
			"GET",
			"/world-of-tanks",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryWotResponse wot() {
		return wot(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWotResponse> wotAsync(Types.CategoryApiTypes.CategoryWotParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/world-of-tanks",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryWotResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWotResponse> wotAsync() {
		return wotAsync(null);
	}

	public Types.CategoryApiTypes.CategoryWotBlitzResponse wotBlitz(Types.CategoryApiTypes.CategoryWotBlitzParams params) {
		return new Types.CategoryApiTypes.CategoryWotBlitzResponse(http.request(new RequestOptions(
			"GET",
			"/wot-blitz",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryWotBlitzResponse wotBlitz() {
		return wotBlitz(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWotBlitzResponse> wotBlitzAsync(Types.CategoryApiTypes.CategoryWotBlitzParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/wot-blitz",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryWotBlitzResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWotBlitzResponse> wotBlitzAsync() {
		return wotBlitzAsync(null);
	}

	public Types.CategoryApiTypes.CategoryGiftsResponse gifts(Types.CategoryApiTypes.CategoryGiftsParams params) {
		return new Types.CategoryApiTypes.CategoryGiftsResponse(http.request(new RequestOptions(
			"GET",
			"/gifts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryGiftsResponse gifts() {
		return gifts(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryGiftsResponse> giftsAsync(Types.CategoryApiTypes.CategoryGiftsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/gifts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryGiftsResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryGiftsResponse> giftsAsync() {
		return giftsAsync(null);
	}

	public Types.CategoryApiTypes.CategoryEpicGamesResponse epicGames(Types.CategoryApiTypes.CategoryEpicGamesParams params) {
		return new Types.CategoryApiTypes.CategoryEpicGamesResponse(http.request(new RequestOptions(
			"GET",
			"/epicgames",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryEpicGamesResponse epicGames() {
		return epicGames(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEpicGamesResponse> epicGamesAsync(Types.CategoryApiTypes.CategoryEpicGamesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/epicgames",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryEpicGamesResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEpicGamesResponse> epicGamesAsync() {
		return epicGamesAsync(null);
	}

	public Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse escapeFromTarkov(Types.CategoryApiTypes.CategoryEscapeFromTarkovParams params) {
		return new Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse(http.request(new RequestOptions(
			"GET",
			"/escape-from-tarkov",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse escapeFromTarkov() {
		return escapeFromTarkov(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse> escapeFromTarkovAsync(Types.CategoryApiTypes.CategoryEscapeFromTarkovParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/escape-from-tarkov",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse> escapeFromTarkovAsync() {
		return escapeFromTarkovAsync(null);
	}

	public Types.CategoryApiTypes.CategorySocialClubResponse socialClub(Types.CategoryApiTypes.CategorySocialClubParams params) {
		return new Types.CategoryApiTypes.CategorySocialClubResponse(http.request(new RequestOptions(
			"GET",
			"/socialclub",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategorySocialClubResponse socialClub() {
		return socialClub(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySocialClubResponse> socialClubAsync(Types.CategoryApiTypes.CategorySocialClubParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/socialclub",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategorySocialClubResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategorySocialClubResponse> socialClubAsync() {
		return socialClubAsync(null);
	}

	public Types.CategoryApiTypes.CategoryUplayResponse uplay(Types.CategoryApiTypes.CategoryUplayParams params) {
		return new Types.CategoryApiTypes.CategoryUplayResponse(http.request(new RequestOptions(
			"GET",
			"/uplay",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryUplayResponse uplay() {
		return uplay(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryUplayResponse> uplayAsync(Types.CategoryApiTypes.CategoryUplayParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/uplay",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryUplayResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryUplayResponse> uplayAsync() {
		return uplayAsync(null);
	}

	public Types.CategoryApiTypes.CategoryDiscordResponse discord(Types.CategoryApiTypes.CategoryDiscordParams params) {
		return new Types.CategoryApiTypes.CategoryDiscordResponse(http.request(new RequestOptions(
			"GET",
			"/discord",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryDiscordResponse discord() {
		return discord(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryDiscordResponse> discordAsync(Types.CategoryApiTypes.CategoryDiscordParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/discord",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryDiscordResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryDiscordResponse> discordAsync() {
		return discordAsync(null);
	}

	public Types.CategoryApiTypes.CategoryTikTokResponse tikTok(Types.CategoryApiTypes.CategoryTikTokParams params) {
		return new Types.CategoryApiTypes.CategoryTikTokResponse(http.request(new RequestOptions(
			"GET",
			"/tiktok",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryTikTokResponse tikTok() {
		return tikTok(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryTikTokResponse> tikTokAsync(Types.CategoryApiTypes.CategoryTikTokParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tiktok",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryTikTokResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryTikTokResponse> tikTokAsync() {
		return tikTokAsync(null);
	}

	public Types.CategoryApiTypes.CategoryInstagramResponse instagram(Types.CategoryApiTypes.CategoryInstagramParams params) {
		return new Types.CategoryApiTypes.CategoryInstagramResponse(http.request(new RequestOptions(
			"GET",
			"/instagram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryInstagramResponse instagram() {
		return instagram(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryInstagramResponse> instagramAsync(Types.CategoryApiTypes.CategoryInstagramParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/instagram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryInstagramResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryInstagramResponse> instagramAsync() {
		return instagramAsync(null);
	}

	public Types.CategoryApiTypes.CategoryBattleNetResponse battleNet(Types.CategoryApiTypes.CategoryBattleNetParams params) {
		return new Types.CategoryApiTypes.CategoryBattleNetResponse(http.request(new RequestOptions(
			"GET",
			"/battlenet",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryBattleNetResponse battleNet() {
		return battleNet(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryBattleNetResponse> battleNetAsync(Types.CategoryApiTypes.CategoryBattleNetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/battlenet",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryBattleNetResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryBattleNetResponse> battleNetAsync() {
		return battleNetAsync(null);
	}

	public Types.CategoryApiTypes.CategoryChatGPTResponse chatGPT(Types.CategoryApiTypes.CategoryChatGPTParams params) {
		return new Types.CategoryApiTypes.CategoryChatGPTResponse(http.request(new RequestOptions(
			"GET",
			"/chatgpt",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryChatGPTResponse chatGPT() {
		return chatGPT(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryChatGPTResponse> chatGPTAsync(Types.CategoryApiTypes.CategoryChatGPTParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatgpt",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryChatGPTResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryChatGPTResponse> chatGPTAsync() {
		return chatGPTAsync(null);
	}

	public Types.CategoryApiTypes.CategoryVpnResponse vpn(Types.CategoryApiTypes.CategoryVpnParams params) {
		return new Types.CategoryApiTypes.CategoryVpnResponse(http.request(new RequestOptions(
			"GET",
			"/vpn",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryVpnResponse vpn() {
		return vpn(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryVpnResponse> vpnAsync(Types.CategoryApiTypes.CategoryVpnParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/vpn",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryVpnResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryVpnResponse> vpnAsync() {
		return vpnAsync(null);
	}

	public Types.CategoryApiTypes.CategoryRobloxResponse roblox(Types.CategoryApiTypes.CategoryRobloxParams params) {
		return new Types.CategoryApiTypes.CategoryRobloxResponse(http.request(new RequestOptions(
			"GET",
			"/roblox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryRobloxResponse roblox() {
		return roblox(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryRobloxResponse> robloxAsync(Types.CategoryApiTypes.CategoryRobloxParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/roblox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryRobloxResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryRobloxResponse> robloxAsync() {
		return robloxAsync(null);
	}

	public Types.CategoryApiTypes.CategoryWarfaceResponse warface(Types.CategoryApiTypes.CategoryWarfaceParams params) {
		return new Types.CategoryApiTypes.CategoryWarfaceResponse(http.request(new RequestOptions(
			"GET",
			"/warface",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryWarfaceResponse warface() {
		return warface(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWarfaceResponse> warfaceAsync(Types.CategoryApiTypes.CategoryWarfaceParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/warface",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryWarfaceResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryWarfaceResponse> warfaceAsync() {
		return warfaceAsync(null);
	}

	public Types.CategoryApiTypes.CategoryMinecraftResponse minecraft(Types.CategoryApiTypes.CategoryMinecraftParams params) {
		return new Types.CategoryApiTypes.CategoryMinecraftResponse(http.request(new RequestOptions(
			"GET",
			"/minecraft",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryMinecraftResponse minecraft() {
		return minecraft(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryMinecraftResponse> minecraftAsync(Types.CategoryApiTypes.CategoryMinecraftParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/minecraft",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryMinecraftResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryMinecraftResponse> minecraftAsync() {
		return minecraftAsync(null);
	}

	public Types.CategoryApiTypes.CategoryHytaleResponse hytale(Types.CategoryApiTypes.CategoryHytaleParams params) {
		return new Types.CategoryApiTypes.CategoryHytaleResponse(http.request(new RequestOptions(
			"GET",
			"/hytale",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryHytaleResponse hytale() {
		return hytale(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryHytaleResponse> hytaleAsync(Types.CategoryApiTypes.CategoryHytaleParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/hytale",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryHytaleResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryHytaleResponse> hytaleAsync() {
		return hytaleAsync(null);
	}

	public Types.CategoryApiTypes.CategoryListResponse list(Types.CategoryApiTypes.CategoryListParams params) {
		return new Types.CategoryApiTypes.CategoryListResponse(http.request(new RequestOptions(
			"GET",
			"/category",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public Types.CategoryApiTypes.CategoryListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryListResponse> listAsync(Types.CategoryApiTypes.CategoryListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/category",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryListResponse::new);
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.CategoryApiTypes.CategoryParamsResponse params(String categoryName) {
		return new Types.CategoryApiTypes.CategoryParamsResponse(http.request(new RequestOptions(
			"GET",
			"/" + categoryName + "/params",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryParamsResponse> paramsAsync(String categoryName) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + categoryName + "/params",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryParamsResponse::new);
	}

	public Types.CategoryApiTypes.CategoryGamesResponse games(String categoryName) {
		return new Types.CategoryApiTypes.CategoryGamesResponse(http.request(new RequestOptions(
			"GET",
			"/" + categoryName + "/games",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)));
	}

	public CompletableFuture<Types.CategoryApiTypes.CategoryGamesResponse> gamesAsync(String categoryName) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + categoryName + "/games",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ true
		)).thenApply(Types.CategoryApiTypes.CategoryGamesResponse::new);
	}
}

class ListApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ListApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ListApiTypes.ListUserResponse user(Types.ListApiTypes.ListUserParams params) {
		return new Types.ListApiTypes.ListUserResponse(http.request(new RequestOptions(
			"GET",
			"/user/items",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListUserResponse user() {
		return user(null);
	}

	public CompletableFuture<Types.ListApiTypes.ListUserResponse> userAsync(Types.ListApiTypes.ListUserParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/items",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListUserResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListUserResponse> userAsync() {
		return userAsync(null);
	}

	public Types.ListApiTypes.ListOrdersResponse orders(Types.ListApiTypes.ListOrdersParams params) {
		return new Types.ListApiTypes.ListOrdersResponse(http.request(new RequestOptions(
			"GET",
			"/user/orders",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListOrdersResponse orders() {
		return orders(null);
	}

	public CompletableFuture<Types.ListApiTypes.ListOrdersResponse> ordersAsync(Types.ListApiTypes.ListOrdersParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/orders",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListOrdersResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListOrdersResponse> ordersAsync() {
		return ordersAsync(null);
	}

	public Types.ListApiTypes.ListStatesResponse states(Types.ListApiTypes.ListStatesParams params) {
		return new Types.ListApiTypes.ListStatesResponse(http.request(new RequestOptions(
			"GET",
			"/user/item-states",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListStatesResponse states() {
		return states(null);
	}

	public CompletableFuture<Types.ListApiTypes.ListStatesResponse> statesAsync(Types.ListApiTypes.ListStatesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/item-states",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListStatesResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListStatesResponse> statesAsync() {
		return statesAsync(null);
	}

	public Types.ListApiTypes.ListDownloadResponse download(String type, Types.ListApiTypes.ListDownloadParams params) {
		return new Types.ListApiTypes.ListDownloadResponse(http.request(new RequestOptions(
			"GET",
			"/user/" + type + "/download",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListDownloadResponse download(String type) {
		return download(type, null);
	}

	public CompletableFuture<Types.ListApiTypes.ListDownloadResponse> downloadAsync(String type, Types.ListApiTypes.ListDownloadParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/" + type + "/download",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListDownloadResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListDownloadResponse> downloadAsync(String type) {
		return downloadAsync(type, null);
	}

	public Types.ListApiTypes.ListFavoritesResponse favorites(Types.ListApiTypes.ListFavoritesParams params) {
		return new Types.ListApiTypes.ListFavoritesResponse(http.request(new RequestOptions(
			"GET",
			"/fave",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListFavoritesResponse favorites() {
		return favorites(null);
	}

	public CompletableFuture<Types.ListApiTypes.ListFavoritesResponse> favoritesAsync(Types.ListApiTypes.ListFavoritesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/fave",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListFavoritesResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListFavoritesResponse> favoritesAsync() {
		return favoritesAsync(null);
	}

	public Types.ListApiTypes.ListViewedResponse viewed(Types.ListApiTypes.ListViewedParams params) {
		return new Types.ListApiTypes.ListViewedResponse(http.request(new RequestOptions(
			"GET",
			"/viewed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ListApiTypes.ListViewedResponse viewed() {
		return viewed(null);
	}

	public CompletableFuture<Types.ListApiTypes.ListViewedResponse> viewedAsync(Types.ListApiTypes.ListViewedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/viewed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ListApiTypes.ListViewedResponse::new);
	}

	public CompletableFuture<Types.ListApiTypes.ListViewedResponse> viewedAsync() {
		return viewedAsync(null);
	}
}

class ManagingApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ManagingApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ManagingApiTypes.ManagingGetResponse get(Integer itemId, Types.ManagingApiTypes.ManagingGetParams params) {
		return new Types.ManagingApiTypes.ManagingGetResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingGetResponse get(Integer itemId) {
		return get(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingGetResponse> getAsync(Integer itemId, Types.ManagingApiTypes.ManagingGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingGetResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingGetResponse> getAsync(Integer itemId) {
		return getAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingDeleteResponse delete(Integer itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
		return new Types.ManagingApiTypes.ManagingDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingDeleteResponse delete(Integer itemId) {
		return delete(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingDeleteResponse> deleteAsync(Integer itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingDeleteResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingDeleteResponse> deleteAsync(Integer itemId) {
		return deleteAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingCreateClaimResponse createClaim(Types.ManagingApiTypes.ManagingCreateClaimBody body) {
		return new Types.ManagingApiTypes.ManagingCreateClaimResponse(http.request(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingCreateClaimResponse createClaim() {
		return createClaim(null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingCreateClaimResponse> createClaimAsync(Types.ManagingApiTypes.ManagingCreateClaimBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingCreateClaimResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingCreateClaimResponse> createClaimAsync() {
		return createClaimAsync(null);
	}

	public Types.ManagingApiTypes.ManagingBulkGetResponse bulkGet(Types.ManagingApiTypes.ManagingBulkGetBody body) {
		return new Types.ManagingApiTypes.ManagingBulkGetResponse(http.request(new RequestOptions(
			"POST",
			"/bulk/items",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingBulkGetResponse> bulkGetAsync(Types.ManagingApiTypes.ManagingBulkGetBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/bulk/items",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingBulkGetResponse::new);
	}

	public Types.ManagingApiTypes.ManagingSteamInventoryValueResponse steamInventoryValue(Integer itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
		return new Types.ManagingApiTypes.ManagingSteamInventoryValueResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/inventory-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingSteamInventoryValueResponse steamInventoryValue(Integer itemId) {
		return steamInventoryValue(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamInventoryValueResponse> steamInventoryValueAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/inventory-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamInventoryValueResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamInventoryValueResponse> steamInventoryValueAsync(Integer itemId) {
		return steamInventoryValueAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingSteamValueResponse steamValue(Types.ManagingApiTypes.ManagingSteamValueParams params) {
		return new Types.ManagingApiTypes.ManagingSteamValueResponse(http.request(new RequestOptions(
			"GET",
			"/steam-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingSteamValueResponse steamValue() {
		return steamValue(null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamValueResponse> steamValueAsync(Types.ManagingApiTypes.ManagingSteamValueParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/steam-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamValueResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamValueResponse> steamValueAsync() {
		return steamValueAsync(null);
	}

	public Types.ManagingApiTypes.ManagingSteamPreviewResponse steamPreview(Integer itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
		return new Types.ManagingApiTypes.ManagingSteamPreviewResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/steam-preview",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingSteamPreviewResponse steamPreview(Integer itemId) {
		return steamPreview(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamPreviewResponse> steamPreviewAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/steam-preview",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamPreviewResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamPreviewResponse> steamPreviewAsync(Integer itemId) {
		return steamPreviewAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingEditResponse edit(Integer itemId, Types.ManagingApiTypes.ManagingEditBody body) {
		return new Types.ManagingApiTypes.ManagingEditResponse(http.request(new RequestOptions(
			"PUT",
			"/" + itemId + "/edit",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingEditResponse edit(Integer itemId) {
		return edit(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingEditResponse> editAsync(Integer itemId, Types.ManagingApiTypes.ManagingEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/" + itemId + "/edit",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingEditResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingEditResponse> editAsync(Integer itemId) {
		return editAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingAIPriceResponse aIPrice(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingAIPriceResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/ai-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingAIPriceResponse> aIPriceAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/ai-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingAIPriceResponse::new);
	}

	public Types.ManagingApiTypes.ManagingAutoBuyPriceResponse autoBuyPrice(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingAutoBuyPriceResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/auto-buy-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBuyPriceResponse> autoBuyPriceAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/auto-buy-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingAutoBuyPriceResponse::new);
	}

	public Types.ManagingApiTypes.ManagingNoteResponse note(Integer itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
		return new Types.ManagingApiTypes.ManagingNoteResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/note-save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingNoteResponse note(Integer itemId) {
		return note(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingNoteResponse> noteAsync(Integer itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/note-save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingNoteResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingNoteResponse> noteAsync(Integer itemId) {
		return noteAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingSteamUpdateValueResponse steamUpdateValue(Integer itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
		return new Types.ManagingApiTypes.ManagingSteamUpdateValueResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/update-inventory",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingSteamUpdateValueResponse steamUpdateValue(Integer itemId) {
		return steamUpdateValue(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamUpdateValueResponse> steamUpdateValueAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/update-inventory",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamUpdateValueResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamUpdateValueResponse> steamUpdateValueAsync(Integer itemId) {
		return steamUpdateValueAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingBumpResponse bump(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingBumpResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingBumpResponse> bumpAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingBumpResponse::new);
	}

	public Types.ManagingApiTypes.ManagingAutoBumpResponse autoBump(Integer itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
		return new Types.ManagingApiTypes.ManagingAutoBumpResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/auto-bump",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingAutoBumpResponse autoBump(Integer itemId) {
		return autoBump(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpResponse> autoBumpAsync(Integer itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/auto-bump",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingAutoBumpResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpResponse> autoBumpAsync(Integer itemId) {
		return autoBumpAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingAutoBumpDisableResponse autoBumpDisable(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingAutoBumpDisableResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/auto-bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpDisableResponse> autoBumpDisableAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/auto-bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingAutoBumpDisableResponse::new);
	}

	public Types.ManagingApiTypes.ManagingOpenResponse open(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingOpenResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/open",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingOpenResponse> openAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/open",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingOpenResponse::new);
	}

	public Types.ManagingApiTypes.ManagingCloseResponse close(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingCloseResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/close",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingCloseResponse> closeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/close",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingCloseResponse::new);
	}

	public Types.ManagingApiTypes.ManagingImageResponse image(Integer itemId, Types.ManagingApiTypes.ManagingImageParams params) {
		return new Types.ManagingApiTypes.ManagingImageResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/image",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingImageResponse image(Integer itemId) {
		return image(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingImageResponse> imageAsync(Integer itemId, Types.ManagingApiTypes.ManagingImageParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/image",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingImageResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingImageResponse> imageAsync(Integer itemId) {
		return imageAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingEmailCodeResponse emailCode(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingEmailCodeResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/email-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingEmailCodeResponse> emailCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/email-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingEmailCodeResponse::new);
	}

	public Types.ManagingApiTypes.ManagingGetLetters2Response getLetters2(Types.ManagingApiTypes.ManagingGetLetters2Params params) {
		return new Types.ManagingApiTypes.ManagingGetLetters2Response(http.request(new RequestOptions(
			"GET",
			"/letters2",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingGetLetters2Response getLetters2() {
		return getLetters2(null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingGetLetters2Response> getLetters2Async(Types.ManagingApiTypes.ManagingGetLetters2Params params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/letters2",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingGetLetters2Response::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingGetLetters2Response> getLetters2Async() {
		return getLetters2Async(null);
	}

	public Types.ManagingApiTypes.ManagingSteamGetMafileResponse steamGetMafile(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingSteamGetMafileResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamGetMafileResponse> steamGetMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamGetMafileResponse::new);
	}

	public Types.ManagingApiTypes.ManagingSteamAddMafileResponse steamAddMafile(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingSteamAddMafileResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamAddMafileResponse> steamAddMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamAddMafileResponse::new);
	}

	public Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse steamRemoveMafile(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse> steamRemoveMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse::new);
	}

	public Types.ManagingApiTypes.ManagingSteamMafileCodeResponse steamMafileCode(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingSteamMafileCodeResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/guard-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamMafileCodeResponse> steamMafileCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/guard-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamMafileCodeResponse::new);
	}

	public Types.ManagingApiTypes.ManagingSteamSDAResponse steamSDA(Integer itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
		return new Types.ManagingApiTypes.ManagingSteamSDAResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-sda",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingSteamSDAResponse steamSDA(Integer itemId) {
		return steamSDA(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamSDAResponse> steamSDAAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-sda",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingSteamSDAResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingSteamSDAResponse> steamSDAAsync(Integer itemId) {
		return steamSDAAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingTelegramCodeResponse telegramCode(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingTelegramCodeResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/telegram-login-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTelegramCodeResponse> telegramCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/telegram-login-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingTelegramCodeResponse::new);
	}

	public Types.ManagingApiTypes.ManagingTelegramResetAuthResponse telegramResetAuth(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingTelegramResetAuthResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/telegram-reset-authorizations",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTelegramResetAuthResponse> telegramResetAuthAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/telegram-reset-authorizations",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingTelegramResetAuthResponse::new);
	}

	public Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse refuseGuarantee(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/refuse-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse> refuseGuaranteeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/refuse-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse::new);
	}

	public Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse declineVideoRecording(Integer itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
		return new Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/decline-video-recording",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse declineVideoRecording(Integer itemId) {
		return declineVideoRecording(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse> declineVideoRecordingAsync(Integer itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/decline-video-recording",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse> declineVideoRecordingAsync(Integer itemId) {
		return declineVideoRecordingAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingCheckGuaranteeResponse checkGuarantee(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingCheckGuaranteeResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/check-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingCheckGuaranteeResponse> checkGuaranteeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/check-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingCheckGuaranteeResponse::new);
	}

	public Types.ManagingApiTypes.ManagingChangePasswordResponse changePassword(Integer itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
		return new Types.ManagingApiTypes.ManagingChangePasswordResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/change-password",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingChangePasswordResponse changePassword(Integer itemId) {
		return changePassword(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingChangePasswordResponse> changePasswordAsync(Integer itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/change-password",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingChangePasswordResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingChangePasswordResponse> changePasswordAsync(Integer itemId) {
		return changePasswordAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingTempEmailPasswordResponse tempEmailPassword(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingTempEmailPasswordResponse(http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/temp-email-password",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTempEmailPasswordResponse> tempEmailPasswordAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/temp-email-password",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingTempEmailPasswordResponse::new);
	}

	public Types.ManagingApiTypes.ManagingTagResponse tag(Integer itemId, Types.ManagingApiTypes.ManagingTagBody body) {
		return new Types.ManagingApiTypes.ManagingTagResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingTagResponse tag(Integer itemId) {
		return tag(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTagResponse> tagAsync(Integer itemId, Types.ManagingApiTypes.ManagingTagBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingTagResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTagResponse> tagAsync(Integer itemId) {
		return tagAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingUntagResponse untag(Integer itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
		return new Types.ManagingApiTypes.ManagingUntagResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingUntagResponse untag(Integer itemId) {
		return untag(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingUntagResponse> untagAsync(Integer itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingUntagResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingUntagResponse> untagAsync(Integer itemId) {
		return untagAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingPublicTagResponse publicTag(Integer itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
		return new Types.ManagingApiTypes.ManagingPublicTagResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingPublicTagResponse publicTag(Integer itemId) {
		return publicTag(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingPublicTagResponse> publicTagAsync(Integer itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingPublicTagResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingPublicTagResponse> publicTagAsync(Integer itemId) {
		return publicTagAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingPublicUntagResponse publicUntag(Integer itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
		return new Types.ManagingApiTypes.ManagingPublicUntagResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingPublicUntagResponse publicUntag(Integer itemId) {
		return publicUntag(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingPublicUntagResponse> publicUntagAsync(Integer itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingPublicUntagResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingPublicUntagResponse> publicUntagAsync(Integer itemId) {
		return publicUntagAsync(itemId, null);
	}

	public Types.ManagingApiTypes.ManagingFavoriteResponse favorite(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingFavoriteResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingFavoriteResponse> favoriteAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingFavoriteResponse::new);
	}

	public Types.ManagingApiTypes.ManagingUnfavoriteResponse unfavorite(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingUnfavoriteResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingUnfavoriteResponse> unfavoriteAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingUnfavoriteResponse::new);
	}

	public Types.ManagingApiTypes.ManagingStickResponse stick(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingStickResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingStickResponse> stickAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingStickResponse::new);
	}

	public Types.ManagingApiTypes.ManagingUnstickResponse unstick(Integer itemId) {
		return new Types.ManagingApiTypes.ManagingUnstickResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingUnstickResponse> unstickAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingUnstickResponse::new);
	}

	public Types.ManagingApiTypes.ManagingTransferResponse transfer(Integer itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
		return new Types.ManagingApiTypes.ManagingTransferResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/change-owner",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ManagingApiTypes.ManagingTransferResponse transfer(Integer itemId) {
		return transfer(itemId, null);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTransferResponse> transferAsync(Integer itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/change-owner",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ManagingApiTypes.ManagingTransferResponse::new);
	}

	public CompletableFuture<Types.ManagingApiTypes.ManagingTransferResponse> transferAsync(Integer itemId) {
		return transferAsync(itemId, null);
	}
}

class ProfileApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ProfileApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ProfileApiTypes.ProfileClaimsResponse claims(Types.ProfileApiTypes.ProfileClaimsParams params) {
		return new Types.ProfileApiTypes.ProfileClaimsResponse(http.request(new RequestOptions(
			"GET",
			"/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfileApiTypes.ProfileClaimsResponse claims() {
		return claims(null);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileClaimsResponse> claimsAsync(Types.ProfileApiTypes.ProfileClaimsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfileApiTypes.ProfileClaimsResponse::new);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileClaimsResponse> claimsAsync() {
		return claimsAsync(null);
	}

	public Types.ProfileApiTypes.ProfileGetResponse get(Types.ProfileApiTypes.ProfileGetParams params) {
		return new Types.ProfileApiTypes.ProfileGetResponse(http.request(new RequestOptions(
			"GET",
			"/me",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfileApiTypes.ProfileGetResponse get() {
		return get(null);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileGetResponse> getAsync(Types.ProfileApiTypes.ProfileGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/me",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfileApiTypes.ProfileGetResponse::new);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileGetResponse> getAsync() {
		return getAsync(null);
	}

	public Types.ProfileApiTypes.ProfileEditResponse edit(Types.ProfileApiTypes.ProfileEditBody body) {
		return new Types.ProfileApiTypes.ProfileEditResponse(http.request(new RequestOptions(
			"PUT",
			"/me",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfileApiTypes.ProfileEditResponse edit() {
		return edit(null);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileEditResponse> editAsync(Types.ProfileApiTypes.ProfileEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/me",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfileApiTypes.ProfileEditResponse::new);
	}

	public CompletableFuture<Types.ProfileApiTypes.ProfileEditResponse> editAsync() {
		return editAsync(null);
	}
}

class CartApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	CartApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.CartApiTypes.CartGetResponse get(Types.CartApiTypes.CartGetParams params) {
		return new Types.CartApiTypes.CartGetResponse(http.request(new RequestOptions(
			"GET",
			"/cart",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CartApiTypes.CartGetResponse get() {
		return get(null);
	}

	public CompletableFuture<Types.CartApiTypes.CartGetResponse> getAsync(Types.CartApiTypes.CartGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/cart",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CartApiTypes.CartGetResponse::new);
	}

	public CompletableFuture<Types.CartApiTypes.CartGetResponse> getAsync() {
		return getAsync(null);
	}

	public Types.CartApiTypes.CartAddResponse add(Types.CartApiTypes.CartAddBody body) {
		return new Types.CartApiTypes.CartAddResponse(http.request(new RequestOptions(
			"POST",
			"/cart",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.CartApiTypes.CartAddResponse> addAsync(Types.CartApiTypes.CartAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/cart",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CartApiTypes.CartAddResponse::new);
	}

	public Types.CartApiTypes.CartDeleteResponse delete(Types.CartApiTypes.CartDeleteBody body) {
		return new Types.CartApiTypes.CartDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/cart",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CartApiTypes.CartDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.CartApiTypes.CartDeleteResponse> deleteAsync(Types.CartApiTypes.CartDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/cart",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CartApiTypes.CartDeleteResponse::new);
	}

	public CompletableFuture<Types.CartApiTypes.CartDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}
}

class PurchasingApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PurchasingApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.PurchasingApiTypes.PurchasingFastBuyResponse fastBuy(Integer itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
		return new Types.PurchasingApiTypes.PurchasingFastBuyResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/fast-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PurchasingApiTypes.PurchasingFastBuyResponse fastBuy(Integer itemId) {
		return fastBuy(itemId, null);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingFastBuyResponse> fastBuyAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/fast-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PurchasingApiTypes.PurchasingFastBuyResponse::new);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingFastBuyResponse> fastBuyAsync(Integer itemId) {
		return fastBuyAsync(itemId, null);
	}

	public Types.PurchasingApiTypes.PurchasingCheckResponse check(Integer itemId) {
		return new Types.PurchasingApiTypes.PurchasingCheckResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/check-account",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingCheckResponse> checkAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/check-account",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PurchasingApiTypes.PurchasingCheckResponse::new);
	}

	public Types.PurchasingApiTypes.PurchasingConfirmResponse confirm(Integer itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
		return new Types.PurchasingApiTypes.PurchasingConfirmResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PurchasingApiTypes.PurchasingConfirmResponse confirm(Integer itemId) {
		return confirm(itemId, null);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingConfirmResponse> confirmAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PurchasingApiTypes.PurchasingConfirmResponse::new);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingConfirmResponse> confirmAsync(Integer itemId) {
		return confirmAsync(itemId, null);
	}

	public Types.PurchasingApiTypes.PurchasingDiscountRequestResponse discountRequest(Integer itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
		return new Types.PurchasingApiTypes.PurchasingDiscountRequestResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/discount",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PurchasingApiTypes.PurchasingDiscountRequestResponse discountRequest(Integer itemId) {
		return discountRequest(itemId, null);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountRequestResponse> discountRequestAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/discount",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PurchasingApiTypes.PurchasingDiscountRequestResponse::new);
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountRequestResponse> discountRequestAsync(Integer itemId) {
		return discountRequestAsync(itemId, null);
	}

	public Types.PurchasingApiTypes.PurchasingDiscountCancelResponse discountCancel(Integer itemId) {
		return new Types.PurchasingApiTypes.PurchasingDiscountCancelResponse(http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/discount",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountCancelResponse> discountCancelAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/discount",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PurchasingApiTypes.PurchasingDiscountCancelResponse::new);
	}
}

class CustomDiscountsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	CustomDiscountsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse get() {
		return new Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse(http.request(new RequestOptions(
			"GET",
			"/custom-discounts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse> getAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/custom-discounts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse::new);
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse create(Types.CustomDiscountsApiTypes.CustomDiscountsCreateBody body) {
		return new Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse> createAsync(Types.CustomDiscountsApiTypes.CustomDiscountsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse::new);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse edit(Types.CustomDiscountsApiTypes.CustomDiscountsEditBody body) {
		return new Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse edit() {
		return edit(null);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse> editAsync(Types.CustomDiscountsApiTypes.CustomDiscountsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse::new);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse> editAsync() {
		return editAsync(null);
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse delete(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteBody body) {
		return new Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse> deleteAsync(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse::new);
	}

	public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}
}

class PublishingApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PublishingApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.PublishingApiTypes.PublishingFastSellResponse fastSell(Types.PublishingApiTypes.PublishingFastSellBody body) {
		return new Types.PublishingApiTypes.PublishingFastSellResponse(http.request(new RequestOptions(
			"POST",
			"/item/fast-sell",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PublishingApiTypes.PublishingFastSellResponse fastSell() {
		return fastSell(null);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingFastSellResponse> fastSellAsync(Types.PublishingApiTypes.PublishingFastSellBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/item/fast-sell",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PublishingApiTypes.PublishingFastSellResponse::new);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingFastSellResponse> fastSellAsync() {
		return fastSellAsync(null);
	}

	public Types.PublishingApiTypes.PublishingAddResponse add(Types.PublishingApiTypes.PublishingAddBody body) {
		return new Types.PublishingApiTypes.PublishingAddResponse(http.request(new RequestOptions(
			"POST",
			"/item/add",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PublishingApiTypes.PublishingAddResponse add() {
		return add(null);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingAddResponse> addAsync(Types.PublishingApiTypes.PublishingAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/item/add",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PublishingApiTypes.PublishingAddResponse::new);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingAddResponse> addAsync() {
		return addAsync(null);
	}

	public Types.PublishingApiTypes.PublishingCheckResponse check(Integer itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
		return new Types.PublishingApiTypes.PublishingCheckResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/goods/check",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PublishingApiTypes.PublishingCheckResponse check(Integer itemId) {
		return check(itemId, null);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingCheckResponse> checkAsync(Integer itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/goods/check",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PublishingApiTypes.PublishingCheckResponse::new);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingCheckResponse> checkAsync(Integer itemId) {
		return checkAsync(itemId, null);
	}

	public Types.PublishingApiTypes.PublishingExternalResponse external(Integer itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
		return new Types.PublishingApiTypes.PublishingExternalResponse(http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/external-account",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PublishingApiTypes.PublishingExternalResponse external(Integer itemId) {
		return external(itemId, null);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingExternalResponse> externalAsync(Integer itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/external-account",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PublishingApiTypes.PublishingExternalResponse::new);
	}

	public CompletableFuture<Types.PublishingApiTypes.PublishingExternalResponse> externalAsync(Integer itemId) {
		return externalAsync(itemId, null);
	}
}

class PaymentsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PaymentsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceGetResponse invoiceGet(Types.PaymentsApiTypes.PaymentsInvoiceGetParams params) {
		return new Types.PaymentsApiTypes.PaymentsInvoiceGetResponse(http.request(new RequestOptions(
			"GET",
			"/invoice",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceGetResponse invoiceGet() {
		return invoiceGet(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceGetResponse> invoiceGetAsync(Types.PaymentsApiTypes.PaymentsInvoiceGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/invoice",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsInvoiceGetResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceGetResponse> invoiceGetAsync() {
		return invoiceGetAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse invoiceCreate(Types.PaymentsApiTypes.PaymentsInvoiceCreateBody body) {
		return new Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse(http.request(new RequestOptions(
			"POST",
			"/invoice",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse invoiceCreate() {
		return invoiceCreate(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse> invoiceCreateAsync(Types.PaymentsApiTypes.PaymentsInvoiceCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/invoice",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse> invoiceCreateAsync() {
		return invoiceCreateAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceListResponse invoiceList(Types.PaymentsApiTypes.PaymentsInvoiceListParams params) {
		return new Types.PaymentsApiTypes.PaymentsInvoiceListResponse(http.request(new RequestOptions(
			"GET",
			"/invoice/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsInvoiceListResponse invoiceList() {
		return invoiceList(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceListResponse> invoiceListAsync(Types.PaymentsApiTypes.PaymentsInvoiceListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/invoice/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsInvoiceListResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceListResponse> invoiceListAsync() {
		return invoiceListAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsCurrencyResponse currency() {
		return new Types.PaymentsApiTypes.PaymentsCurrencyResponse(http.request(new RequestOptions(
			"GET",
			"/currency",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsCurrencyResponse> currencyAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/currency",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsCurrencyResponse::new);
	}

	public Types.PaymentsApiTypes.PaymentsBalanceListResponse balanceList() {
		return new Types.PaymentsApiTypes.PaymentsBalanceListResponse(http.request(new RequestOptions(
			"GET",
			"/balance/exchange",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsBalanceListResponse> balanceListAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/exchange",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsBalanceListResponse::new);
	}

	public Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse balanceExchange(Types.PaymentsApiTypes.PaymentsBalanceExchangeBody body) {
		return new Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse(http.request(new RequestOptions(
			"POST",
			"/balance/exchange",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse balanceExchange() {
		return balanceExchange(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse> balanceExchangeAsync(Types.PaymentsApiTypes.PaymentsBalanceExchangeBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/exchange",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse> balanceExchangeAsync() {
		return balanceExchangeAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsTransferResponse transfer(Types.PaymentsApiTypes.PaymentsTransferBody body) {
		return new Types.PaymentsApiTypes.PaymentsTransferResponse(http.request(new RequestOptions(
			"POST",
			"/balance/transfer",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsTransferResponse transfer() {
		return transfer(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsTransferResponse> transferAsync(Types.PaymentsApiTypes.PaymentsTransferBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/transfer",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsTransferResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsTransferResponse> transferAsync() {
		return transferAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsFeeResponse fee(Types.PaymentsApiTypes.PaymentsFeeParams params) {
		return new Types.PaymentsApiTypes.PaymentsFeeResponse(http.request(new RequestOptions(
			"GET",
			"/balance/transfer/fee",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsFeeResponse fee() {
		return fee(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsFeeResponse> feeAsync(Types.PaymentsApiTypes.PaymentsFeeParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/transfer/fee",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsFeeResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsFeeResponse> feeAsync() {
		return feeAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsCancelResponse cancel(Types.PaymentsApiTypes.PaymentsCancelBody body) {
		return new Types.PaymentsApiTypes.PaymentsCancelResponse(http.request(new RequestOptions(
			"POST",
			"/balance/transfer/cancel",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsCancelResponse cancel() {
		return cancel(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsCancelResponse> cancelAsync(Types.PaymentsApiTypes.PaymentsCancelBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/transfer/cancel",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsCancelResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsCancelResponse> cancelAsync() {
		return cancelAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsHistoryResponse history(Types.PaymentsApiTypes.PaymentsHistoryParams params) {
		return new Types.PaymentsApiTypes.PaymentsHistoryResponse(http.request(new RequestOptions(
			"GET",
			"/user/payments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsHistoryResponse history() {
		return history(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsHistoryResponse> historyAsync(Types.PaymentsApiTypes.PaymentsHistoryParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/payments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsHistoryResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsHistoryResponse> historyAsync() {
		return historyAsync(null);
	}

	public Types.PaymentsApiTypes.PaymentsPayoutServicesResponse payoutServices() {
		return new Types.PaymentsApiTypes.PaymentsPayoutServicesResponse(http.request(new RequestOptions(
			"GET",
			"/balance/payout/services",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsPayoutServicesResponse> payoutServicesAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/payout/services",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsPayoutServicesResponse::new);
	}

	public Types.PaymentsApiTypes.PaymentsPayoutResponse payout(Types.PaymentsApiTypes.PaymentsPayoutBody body) {
		return new Types.PaymentsApiTypes.PaymentsPayoutResponse(http.request(new RequestOptions(
			"POST",
			"/balance/payout",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PaymentsApiTypes.PaymentsPayoutResponse payout() {
		return payout(null);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsPayoutResponse> payoutAsync(Types.PaymentsApiTypes.PaymentsPayoutBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/payout",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PaymentsApiTypes.PaymentsPayoutResponse::new);
	}

	public CompletableFuture<Types.PaymentsApiTypes.PaymentsPayoutResponse> payoutAsync() {
		return payoutAsync(null);
	}
}

class AutoPaymentsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	AutoPaymentsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.AutoPaymentsApiTypes.AutoPaymentsListResponse list() {
		return new Types.AutoPaymentsApiTypes.AutoPaymentsListResponse(http.request(new RequestOptions(
			"GET",
			"/auto-payments",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsListResponse> listAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/auto-payments",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.AutoPaymentsApiTypes.AutoPaymentsListResponse::new);
	}

	public Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse create(Types.AutoPaymentsApiTypes.AutoPaymentsCreateBody body) {
		return new Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse> createAsync(Types.AutoPaymentsApiTypes.AutoPaymentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse::new);
	}

	public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse delete(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteBody body) {
		return new Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse> deleteAsync(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse::new);
	}

	public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}
}

class ProxyApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ProxyApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ProxyApiTypes.ProxyGetResponse get() {
		return new Types.ProxyApiTypes.ProxyGetResponse(http.request(new RequestOptions(
			"GET",
			"/proxy",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProxyApiTypes.ProxyGetResponse> getAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/proxy",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProxyApiTypes.ProxyGetResponse::new);
	}

	public Types.ProxyApiTypes.ProxyAddResponse add(Types.ProxyApiTypes.ProxyAddBody body) {
		return new Types.ProxyApiTypes.ProxyAddResponse(http.request(new RequestOptions(
			"POST",
			"/proxy",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProxyApiTypes.ProxyAddResponse> addAsync(Types.ProxyApiTypes.ProxyAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/proxy",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProxyApiTypes.ProxyAddResponse::new);
	}

	public Types.ProxyApiTypes.ProxyDeleteResponse delete(Types.ProxyApiTypes.ProxyDeleteBody body) {
		return new Types.ProxyApiTypes.ProxyDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/proxy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProxyApiTypes.ProxyDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.ProxyApiTypes.ProxyDeleteResponse> deleteAsync(Types.ProxyApiTypes.ProxyDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/proxy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProxyApiTypes.ProxyDeleteResponse::new);
	}

	public CompletableFuture<Types.ProxyApiTypes.ProxyDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}
}

class ImapApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ImapApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ImapApiTypes.ImapCreateResponse create(Types.ImapApiTypes.ImapCreateBody body) {
		return new Types.ImapApiTypes.ImapCreateResponse(http.request(new RequestOptions(
			"POST",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ImapApiTypes.ImapCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.ImapApiTypes.ImapCreateResponse> createAsync(Types.ImapApiTypes.ImapCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ImapApiTypes.ImapCreateResponse::new);
	}

	public CompletableFuture<Types.ImapApiTypes.ImapCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.ImapApiTypes.ImapDeleteResponse delete(Types.ImapApiTypes.ImapDeleteBody body) {
		return new Types.ImapApiTypes.ImapDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ImapApiTypes.ImapDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.ImapApiTypes.ImapDeleteResponse> deleteAsync(Types.ImapApiTypes.ImapDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ImapApiTypes.ImapDeleteResponse::new);
	}

	public CompletableFuture<Types.ImapApiTypes.ImapDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}
}

class BatchApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	BatchApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.BatchApiTypes.BatchBatchResponse batch(List<JsonNode> body) {
		return new Types.BatchApiTypes.BatchBatchResponse(http.request(new RequestOptions(
			"POST",
			"/batch",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.BatchApiTypes.BatchBatchResponse> batchAsync(List<JsonNode> body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/batch",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.BatchApiTypes.BatchBatchResponse::new);
	}
}

public class MarketClient implements Closeable {

	private final CategoryApi category;
	private final ListApi list;
	private final ManagingApi managing;
	private final ProfileApi profile;
	private final CartApi cart;
	private final PurchasingApi purchasing;
	private final CustomDiscountsApi customDiscounts;
	private final PublishingApi publishing;
	private final PaymentsApi payments;
	private final AutoPaymentsApi autoPayments;
	private final ProxyApi proxy;
	private final ImapApi imap;
	private final BatchApi batch;

	private final LolzteamHttpClient http;

	public MarketClient(ClientConfig config) {
		var resolvedConfig = config.withBaseUrl(
			config.baseUrl() != null ? config.baseUrl() : "https://prod-api.lzt.market"
		).withRateLimit(
			config.rateLimit() != null ? config.rateLimit() : new RateLimitConfig(120)
		);
		resolvedConfig = resolvedConfig.withSearchRateLimit(
			config.searchRateLimit() != null ? config.searchRateLimit() : new RateLimitConfig(20)
		);
		this.http = new LolzteamHttpClient(resolvedConfig);

		this.category = new CategoryApi(http);
		this.list = new ListApi(http);
		this.managing = new ManagingApi(http);
		this.profile = new ProfileApi(http);
		this.cart = new CartApi(http);
		this.purchasing = new PurchasingApi(http);
		this.customDiscounts = new CustomDiscountsApi(http);
		this.publishing = new PublishingApi(http);
		this.payments = new PaymentsApi(http);
		this.autoPayments = new AutoPaymentsApi(http);
		this.proxy = new ProxyApi(http);
		this.imap = new ImapApi(http);
		this.batch = new BatchApi(http);
	}

	public CategoryApi category() {
		return category;
	}

	public ListApi list() {
		return list;
	}

	public ManagingApi managing() {
		return managing;
	}

	public ProfileApi profile() {
		return profile;
	}

	public CartApi cart() {
		return cart;
	}

	public PurchasingApi purchasing() {
		return purchasing;
	}

	public CustomDiscountsApi customDiscounts() {
		return customDiscounts;
	}

	public PublishingApi publishing() {
		return publishing;
	}

	public PaymentsApi payments() {
		return payments;
	}

	public AutoPaymentsApi autoPayments() {
		return autoPayments;
	}

	public ProxyApi proxy() {
		return proxy;
	}

	public ImapApi imap() {
		return imap;
	}

	public BatchApi batch() {
		return batch;
	}

	@Override
	public void close() {
		http.close();
	}
}
