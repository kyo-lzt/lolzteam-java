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

	public JsonNode all(Types.CategoryApiTypes.CategoryAllParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode all() {
		return all(null);
	}

	public CompletableFuture<JsonNode> allAsync(Types.CategoryApiTypes.CategoryAllParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> allAsync() {
		return allAsync(null);
	}

	public JsonNode steam(Types.CategoryApiTypes.CategorySteamParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/steam",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode steam() {
		return steam(null);
	}

	public CompletableFuture<JsonNode> steamAsync(Types.CategoryApiTypes.CategorySteamParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/steam",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> steamAsync() {
		return steamAsync(null);
	}

	public JsonNode fortnite(Types.CategoryApiTypes.CategoryFortniteParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/fortnite",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode fortnite() {
		return fortnite(null);
	}

	public CompletableFuture<JsonNode> fortniteAsync(Types.CategoryApiTypes.CategoryFortniteParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/fortnite",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> fortniteAsync() {
		return fortniteAsync(null);
	}

	public JsonNode mihoyo(Types.CategoryApiTypes.CategoryMihoyoParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/mihoyo",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode mihoyo() {
		return mihoyo(null);
	}

	public CompletableFuture<JsonNode> mihoyoAsync(Types.CategoryApiTypes.CategoryMihoyoParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/mihoyo",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> mihoyoAsync() {
		return mihoyoAsync(null);
	}

	public JsonNode riot(Types.CategoryApiTypes.CategoryRiotParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/riot",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode riot() {
		return riot(null);
	}

	public CompletableFuture<JsonNode> riotAsync(Types.CategoryApiTypes.CategoryRiotParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/riot",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> riotAsync() {
		return riotAsync(null);
	}

	public JsonNode telegram(Types.CategoryApiTypes.CategoryTelegramParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/telegram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode telegram() {
		return telegram(null);
	}

	public CompletableFuture<JsonNode> telegramAsync(Types.CategoryApiTypes.CategoryTelegramParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/telegram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> telegramAsync() {
		return telegramAsync(null);
	}

	public JsonNode supercell(Types.CategoryApiTypes.CategorySupercellParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/supercell",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode supercell() {
		return supercell(null);
	}

	public CompletableFuture<JsonNode> supercellAsync(Types.CategoryApiTypes.CategorySupercellParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/supercell",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> supercellAsync() {
		return supercellAsync(null);
	}

	public JsonNode ea(Types.CategoryApiTypes.CategoryEaParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/ea",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode ea() {
		return ea(null);
	}

	public CompletableFuture<JsonNode> eaAsync(Types.CategoryApiTypes.CategoryEaParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/ea",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> eaAsync() {
		return eaAsync(null);
	}

	public JsonNode wot(Types.CategoryApiTypes.CategoryWotParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/world-of-tanks",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode wot() {
		return wot(null);
	}

	public CompletableFuture<JsonNode> wotAsync(Types.CategoryApiTypes.CategoryWotParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/world-of-tanks",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> wotAsync() {
		return wotAsync(null);
	}

	public JsonNode wotBlitz(Types.CategoryApiTypes.CategoryWotBlitzParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/wot-blitz",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode wotBlitz() {
		return wotBlitz(null);
	}

	public CompletableFuture<JsonNode> wotBlitzAsync(Types.CategoryApiTypes.CategoryWotBlitzParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/wot-blitz",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> wotBlitzAsync() {
		return wotBlitzAsync(null);
	}

	public JsonNode gifts(Types.CategoryApiTypes.CategoryGiftsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/gifts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode gifts() {
		return gifts(null);
	}

	public CompletableFuture<JsonNode> giftsAsync(Types.CategoryApiTypes.CategoryGiftsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/gifts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> giftsAsync() {
		return giftsAsync(null);
	}

	public JsonNode epicGames(Types.CategoryApiTypes.CategoryEpicGamesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/epicgames",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode epicGames() {
		return epicGames(null);
	}

	public CompletableFuture<JsonNode> epicGamesAsync(Types.CategoryApiTypes.CategoryEpicGamesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/epicgames",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> epicGamesAsync() {
		return epicGamesAsync(null);
	}

	public JsonNode escapeFromTarkov(Types.CategoryApiTypes.CategoryEscapeFromTarkovParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/escape-from-tarkov",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode escapeFromTarkov() {
		return escapeFromTarkov(null);
	}

	public CompletableFuture<JsonNode> escapeFromTarkovAsync(Types.CategoryApiTypes.CategoryEscapeFromTarkovParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/escape-from-tarkov",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> escapeFromTarkovAsync() {
		return escapeFromTarkovAsync(null);
	}

	public JsonNode socialClub(Types.CategoryApiTypes.CategorySocialClubParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/socialclub",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode socialClub() {
		return socialClub(null);
	}

	public CompletableFuture<JsonNode> socialClubAsync(Types.CategoryApiTypes.CategorySocialClubParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/socialclub",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> socialClubAsync() {
		return socialClubAsync(null);
	}

	public JsonNode uplay(Types.CategoryApiTypes.CategoryUplayParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/uplay",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode uplay() {
		return uplay(null);
	}

	public CompletableFuture<JsonNode> uplayAsync(Types.CategoryApiTypes.CategoryUplayParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/uplay",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> uplayAsync() {
		return uplayAsync(null);
	}

	public JsonNode discord(Types.CategoryApiTypes.CategoryDiscordParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/discord",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode discord() {
		return discord(null);
	}

	public CompletableFuture<JsonNode> discordAsync(Types.CategoryApiTypes.CategoryDiscordParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/discord",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> discordAsync() {
		return discordAsync(null);
	}

	public JsonNode tikTok(Types.CategoryApiTypes.CategoryTikTokParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/tiktok",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode tikTok() {
		return tikTok(null);
	}

	public CompletableFuture<JsonNode> tikTokAsync(Types.CategoryApiTypes.CategoryTikTokParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tiktok",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> tikTokAsync() {
		return tikTokAsync(null);
	}

	public JsonNode instagram(Types.CategoryApiTypes.CategoryInstagramParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/instagram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode instagram() {
		return instagram(null);
	}

	public CompletableFuture<JsonNode> instagramAsync(Types.CategoryApiTypes.CategoryInstagramParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/instagram",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> instagramAsync() {
		return instagramAsync(null);
	}

	public JsonNode battleNet(Types.CategoryApiTypes.CategoryBattleNetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/battlenet",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode battleNet() {
		return battleNet(null);
	}

	public CompletableFuture<JsonNode> battleNetAsync(Types.CategoryApiTypes.CategoryBattleNetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/battlenet",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> battleNetAsync() {
		return battleNetAsync(null);
	}

	public JsonNode chatGPT(Types.CategoryApiTypes.CategoryChatGPTParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatgpt",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode chatGPT() {
		return chatGPT(null);
	}

	public CompletableFuture<JsonNode> chatGPTAsync(Types.CategoryApiTypes.CategoryChatGPTParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatgpt",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> chatGPTAsync() {
		return chatGPTAsync(null);
	}

	public JsonNode vpn(Types.CategoryApiTypes.CategoryVpnParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/vpn",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode vpn() {
		return vpn(null);
	}

	public CompletableFuture<JsonNode> vpnAsync(Types.CategoryApiTypes.CategoryVpnParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/vpn",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> vpnAsync() {
		return vpnAsync(null);
	}

	public JsonNode roblox(Types.CategoryApiTypes.CategoryRobloxParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/roblox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode roblox() {
		return roblox(null);
	}

	public CompletableFuture<JsonNode> robloxAsync(Types.CategoryApiTypes.CategoryRobloxParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/roblox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> robloxAsync() {
		return robloxAsync(null);
	}

	public JsonNode warface(Types.CategoryApiTypes.CategoryWarfaceParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/warface",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode warface() {
		return warface(null);
	}

	public CompletableFuture<JsonNode> warfaceAsync(Types.CategoryApiTypes.CategoryWarfaceParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/warface",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> warfaceAsync() {
		return warfaceAsync(null);
	}

	public JsonNode minecraft(Types.CategoryApiTypes.CategoryMinecraftParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/minecraft",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode minecraft() {
		return minecraft(null);
	}

	public CompletableFuture<JsonNode> minecraftAsync(Types.CategoryApiTypes.CategoryMinecraftParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/minecraft",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> minecraftAsync() {
		return minecraftAsync(null);
	}

	public JsonNode hytale(Types.CategoryApiTypes.CategoryHytaleParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/hytale",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode hytale() {
		return hytale(null);
	}

	public CompletableFuture<JsonNode> hytaleAsync(Types.CategoryApiTypes.CategoryHytaleParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/hytale",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> hytaleAsync() {
		return hytaleAsync(null);
	}

	public JsonNode list(Types.CategoryApiTypes.CategoryListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/category",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.CategoryApiTypes.CategoryListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/category",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode params(String categoryName) {
		return http.request(new RequestOptions(
			"GET",
			"/" + categoryName + "/params",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> paramsAsync(String categoryName) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + categoryName + "/params",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public JsonNode games(String categoryName) {
		return http.request(new RequestOptions(
			"GET",
			"/" + categoryName + "/games",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}

	public CompletableFuture<JsonNode> gamesAsync(String categoryName) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + categoryName + "/games",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			true
		));
	}
}

class ListApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ListApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode user(Types.ListApiTypes.ListUserParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/user/items",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode user() {
		return user(null);
	}

	public CompletableFuture<JsonNode> userAsync(Types.ListApiTypes.ListUserParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/items",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> userAsync() {
		return userAsync(null);
	}

	public JsonNode orders(Types.ListApiTypes.ListOrdersParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/user/orders",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode orders() {
		return orders(null);
	}

	public CompletableFuture<JsonNode> ordersAsync(Types.ListApiTypes.ListOrdersParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/orders",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> ordersAsync() {
		return ordersAsync(null);
	}

	public JsonNode states(Types.ListApiTypes.ListStatesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/user/item-states",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode states() {
		return states(null);
	}

	public CompletableFuture<JsonNode> statesAsync(Types.ListApiTypes.ListStatesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/item-states",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> statesAsync() {
		return statesAsync(null);
	}

	public JsonNode download(String type, Types.ListApiTypes.ListDownloadParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/user/" + type + "/download",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode download(String type) {
		return download(type, null);
	}

	public CompletableFuture<JsonNode> downloadAsync(String type, Types.ListApiTypes.ListDownloadParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/" + type + "/download",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> downloadAsync(String type) {
		return downloadAsync(type, null);
	}

	public JsonNode favorites(Types.ListApiTypes.ListFavoritesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/fave",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode favorites() {
		return favorites(null);
	}

	public CompletableFuture<JsonNode> favoritesAsync(Types.ListApiTypes.ListFavoritesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/fave",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> favoritesAsync() {
		return favoritesAsync(null);
	}

	public JsonNode viewed(Types.ListApiTypes.ListViewedParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/viewed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode viewed() {
		return viewed(null);
	}

	public CompletableFuture<JsonNode> viewedAsync(Types.ListApiTypes.ListViewedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/viewed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> viewedAsync() {
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

	public JsonNode get(Integer itemId, Types.ManagingApiTypes.ManagingGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(Integer itemId) {
		return get(itemId, null);
	}

	public CompletableFuture<JsonNode> getAsync(Integer itemId, Types.ManagingApiTypes.ManagingGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer itemId) {
		return getAsync(itemId, null);
	}

	public JsonNode delete(Integer itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Integer itemId) {
		return delete(itemId, null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer itemId) {
		return deleteAsync(itemId, null);
	}

	public JsonNode createClaim(Types.ManagingApiTypes.ManagingCreateClaimBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode createClaim() {
		return createClaim(null);
	}

	public CompletableFuture<JsonNode> createClaimAsync(Types.ManagingApiTypes.ManagingCreateClaimBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> createClaimAsync() {
		return createClaimAsync(null);
	}

	public JsonNode bulkGet(Types.ManagingApiTypes.ManagingBulkGetBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/bulk/items",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> bulkGetAsync(Types.ManagingApiTypes.ManagingBulkGetBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/bulk/items",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamInventoryValue(Integer itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/inventory-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamInventoryValue(Integer itemId) {
		return steamInventoryValue(itemId, null);
	}

	public CompletableFuture<JsonNode> steamInventoryValueAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/inventory-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamInventoryValueAsync(Integer itemId) {
		return steamInventoryValueAsync(itemId, null);
	}

	public JsonNode steamValue(Types.ManagingApiTypes.ManagingSteamValueParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/steam-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamValue() {
		return steamValue(null);
	}

	public CompletableFuture<JsonNode> steamValueAsync(Types.ManagingApiTypes.ManagingSteamValueParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/steam-value",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamValueAsync() {
		return steamValueAsync(null);
	}

	public JsonNode steamPreview(Integer itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/steam-preview",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamPreview(Integer itemId) {
		return steamPreview(itemId, null);
	}

	public CompletableFuture<JsonNode> steamPreviewAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/steam-preview",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamPreviewAsync(Integer itemId) {
		return steamPreviewAsync(itemId, null);
	}

	public JsonNode edit(Integer itemId, Types.ManagingApiTypes.ManagingEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/" + itemId + "/edit",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer itemId) {
		return edit(itemId, null);
	}

	public CompletableFuture<JsonNode> editAsync(Integer itemId, Types.ManagingApiTypes.ManagingEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/" + itemId + "/edit",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync(Integer itemId) {
		return editAsync(itemId, null);
	}

	public JsonNode aIPrice(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/ai-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> aIPriceAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/ai-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode autoBuyPrice(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/auto-buy-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> autoBuyPriceAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/auto-buy-price",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode note(Integer itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/note-save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode note(Integer itemId) {
		return note(itemId, null);
	}

	public CompletableFuture<JsonNode> noteAsync(Integer itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/note-save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> noteAsync(Integer itemId) {
		return noteAsync(itemId, null);
	}

	public JsonNode steamUpdateValue(Integer itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/update-inventory",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamUpdateValue(Integer itemId) {
		return steamUpdateValue(itemId, null);
	}

	public CompletableFuture<JsonNode> steamUpdateValueAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/update-inventory",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamUpdateValueAsync(Integer itemId) {
		return steamUpdateValueAsync(itemId, null);
	}

	public JsonNode bump(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> bumpAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode autoBump(Integer itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/auto-bump",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode autoBump(Integer itemId) {
		return autoBump(itemId, null);
	}

	public CompletableFuture<JsonNode> autoBumpAsync(Integer itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/auto-bump",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> autoBumpAsync(Integer itemId) {
		return autoBumpAsync(itemId, null);
	}

	public JsonNode autoBumpDisable(Integer itemId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/auto-bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> autoBumpDisableAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/auto-bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode open(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/open",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> openAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/open",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode close(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/close",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> closeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/close",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode image(Integer itemId, Types.ManagingApiTypes.ManagingImageParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/image",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode image(Integer itemId) {
		return image(itemId, null);
	}

	public CompletableFuture<JsonNode> imageAsync(Integer itemId, Types.ManagingApiTypes.ManagingImageParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/image",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> imageAsync(Integer itemId) {
		return imageAsync(itemId, null);
	}

	public JsonNode emailCode(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/email-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> emailCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/email-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode getLetters2(Types.ManagingApiTypes.ManagingGetLetters2Params params) {
		return http.request(new RequestOptions(
			"GET",
			"/letters2",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode getLetters2() {
		return getLetters2(null);
	}

	public CompletableFuture<JsonNode> getLetters2Async(Types.ManagingApiTypes.ManagingGetLetters2Params params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/letters2",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getLetters2Async() {
		return getLetters2Async(null);
	}

	public JsonNode steamGetMafile(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamGetMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamAddMafile(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamAddMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamRemoveMafile(Integer itemId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamRemoveMafileAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/mafile",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamMafileCode(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/guard-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamMafileCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/guard-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamSDA(Integer itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-sda",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode steamSDA(Integer itemId) {
		return steamSDA(itemId, null);
	}

	public CompletableFuture<JsonNode> steamSDAAsync(Integer itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-sda",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> steamSDAAsync(Integer itemId) {
		return steamSDAAsync(itemId, null);
	}

	public JsonNode telegramCode(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/telegram-login-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> telegramCodeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/telegram-login-code",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode telegramResetAuth(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/telegram-reset-authorizations",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> telegramResetAuthAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/telegram-reset-authorizations",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode refuseGuarantee(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/refuse-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> refuseGuaranteeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/refuse-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode declineVideoRecording(Integer itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/decline-video-recording",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode declineVideoRecording(Integer itemId) {
		return declineVideoRecording(itemId, null);
	}

	public CompletableFuture<JsonNode> declineVideoRecordingAsync(Integer itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/decline-video-recording",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> declineVideoRecordingAsync(Integer itemId) {
		return declineVideoRecordingAsync(itemId, null);
	}

	public JsonNode checkGuarantee(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/check-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> checkGuaranteeAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/check-guarantee",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode changePassword(Integer itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/change-password",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode changePassword(Integer itemId) {
		return changePassword(itemId, null);
	}

	public CompletableFuture<JsonNode> changePasswordAsync(Integer itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/change-password",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> changePasswordAsync(Integer itemId) {
		return changePasswordAsync(itemId, null);
	}

	public JsonNode tempEmailPassword(Integer itemId) {
		return http.request(new RequestOptions(
			"GET",
			"/" + itemId + "/temp-email-password",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> tempEmailPasswordAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/" + itemId + "/temp-email-password",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode tag(Integer itemId, Types.ManagingApiTypes.ManagingTagBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode tag(Integer itemId) {
		return tag(itemId, null);
	}

	public CompletableFuture<JsonNode> tagAsync(Integer itemId, Types.ManagingApiTypes.ManagingTagBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> tagAsync(Integer itemId) {
		return tagAsync(itemId, null);
	}

	public JsonNode untag(Integer itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode untag(Integer itemId) {
		return untag(itemId, null);
	}

	public CompletableFuture<JsonNode> untagAsync(Integer itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> untagAsync(Integer itemId) {
		return untagAsync(itemId, null);
	}

	public JsonNode publicTag(Integer itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode publicTag(Integer itemId) {
		return publicTag(itemId, null);
	}

	public CompletableFuture<JsonNode> publicTagAsync(Integer itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> publicTagAsync(Integer itemId) {
		return publicTagAsync(itemId, null);
	}

	public JsonNode publicUntag(Integer itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode publicUntag(Integer itemId) {
		return publicUntag(itemId, null);
	}

	public CompletableFuture<JsonNode> publicUntagAsync(Integer itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/public-tag",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> publicUntagAsync(Integer itemId) {
		return publicUntagAsync(itemId, null);
	}

	public JsonNode favorite(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> favoriteAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unfavorite(Integer itemId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unfavoriteAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode stick(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> stickAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unstick(Integer itemId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unstickAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode transfer(Integer itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/change-owner",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode transfer(Integer itemId) {
		return transfer(itemId, null);
	}

	public CompletableFuture<JsonNode> transferAsync(Integer itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/change-owner",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> transferAsync(Integer itemId) {
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

	public JsonNode claims(Types.ProfileApiTypes.ProfileClaimsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode claims() {
		return claims(null);
	}

	public CompletableFuture<JsonNode> claimsAsync(Types.ProfileApiTypes.ProfileClaimsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> claimsAsync() {
		return claimsAsync(null);
	}

	public JsonNode get(Types.ProfileApiTypes.ProfileGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/me",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get() {
		return get(null);
	}

	public CompletableFuture<JsonNode> getAsync(Types.ProfileApiTypes.ProfileGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/me",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync() {
		return getAsync(null);
	}

	public JsonNode edit(Types.ProfileApiTypes.ProfileEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/me",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit() {
		return edit(null);
	}

	public CompletableFuture<JsonNode> editAsync(Types.ProfileApiTypes.ProfileEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/me",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync() {
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

	public JsonNode get(Types.CartApiTypes.CartGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/cart",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get() {
		return get(null);
	}

	public CompletableFuture<JsonNode> getAsync(Types.CartApiTypes.CartGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/cart",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync() {
		return getAsync(null);
	}

	public JsonNode add(Types.CartApiTypes.CartAddBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/cart",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> addAsync(Types.CartApiTypes.CartAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/cart",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Types.CartApiTypes.CartDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/cart",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete() {
		return delete(null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Types.CartApiTypes.CartDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/cart",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync() {
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

	public JsonNode fastBuy(Integer itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/fast-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode fastBuy(Integer itemId) {
		return fastBuy(itemId, null);
	}

	public CompletableFuture<JsonNode> fastBuyAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/fast-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> fastBuyAsync(Integer itemId) {
		return fastBuyAsync(itemId, null);
	}

	public JsonNode check(Integer itemId) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/check-account",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> checkAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/check-account",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode confirm(Integer itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode confirm(Integer itemId) {
		return confirm(itemId, null);
	}

	public CompletableFuture<JsonNode> confirmAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/confirm-buy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> confirmAsync(Integer itemId) {
		return confirmAsync(itemId, null);
	}

	public JsonNode discountRequest(Integer itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/discount",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode discountRequest(Integer itemId) {
		return discountRequest(itemId, null);
	}

	public CompletableFuture<JsonNode> discountRequestAsync(Integer itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/discount",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> discountRequestAsync(Integer itemId) {
		return discountRequestAsync(itemId, null);
	}

	public JsonNode discountCancel(Integer itemId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/" + itemId + "/discount",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> discountCancelAsync(Integer itemId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/" + itemId + "/discount",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class CustomDiscountsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	CustomDiscountsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode get() {
		return http.request(new RequestOptions(
			"GET",
			"/custom-discounts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/custom-discounts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode create(Types.CustomDiscountsApiTypes.CustomDiscountsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode create() {
		return create(null);
	}

	public CompletableFuture<JsonNode> createAsync(Types.CustomDiscountsApiTypes.CustomDiscountsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> createAsync() {
		return createAsync(null);
	}

	public JsonNode edit(Types.CustomDiscountsApiTypes.CustomDiscountsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit() {
		return edit(null);
	}

	public CompletableFuture<JsonNode> editAsync(Types.CustomDiscountsApiTypes.CustomDiscountsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync() {
		return editAsync(null);
	}

	public JsonNode delete(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete() {
		return delete(null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/custom-discounts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync() {
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

	public JsonNode fastSell(Types.PublishingApiTypes.PublishingFastSellBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/item/fast-sell",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode fastSell() {
		return fastSell(null);
	}

	public CompletableFuture<JsonNode> fastSellAsync(Types.PublishingApiTypes.PublishingFastSellBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/item/fast-sell",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> fastSellAsync() {
		return fastSellAsync(null);
	}

	public JsonNode add(Types.PublishingApiTypes.PublishingAddBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/item/add",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode add() {
		return add(null);
	}

	public CompletableFuture<JsonNode> addAsync(Types.PublishingApiTypes.PublishingAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/item/add",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> addAsync() {
		return addAsync(null);
	}

	public JsonNode check(Integer itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/goods/check",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode check(Integer itemId) {
		return check(itemId, null);
	}

	public CompletableFuture<JsonNode> checkAsync(Integer itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/goods/check",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> checkAsync(Integer itemId) {
		return checkAsync(itemId, null);
	}

	public JsonNode external(Integer itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/" + itemId + "/external-account",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode external(Integer itemId) {
		return external(itemId, null);
	}

	public CompletableFuture<JsonNode> externalAsync(Integer itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/" + itemId + "/external-account",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> externalAsync(Integer itemId) {
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

	public JsonNode invoiceGet(Types.PaymentsApiTypes.PaymentsInvoiceGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/invoice",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode invoiceGet() {
		return invoiceGet(null);
	}

	public CompletableFuture<JsonNode> invoiceGetAsync(Types.PaymentsApiTypes.PaymentsInvoiceGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/invoice",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> invoiceGetAsync() {
		return invoiceGetAsync(null);
	}

	public JsonNode invoiceCreate(Types.PaymentsApiTypes.PaymentsInvoiceCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/invoice",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode invoiceCreate() {
		return invoiceCreate(null);
	}

	public CompletableFuture<JsonNode> invoiceCreateAsync(Types.PaymentsApiTypes.PaymentsInvoiceCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/invoice",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> invoiceCreateAsync() {
		return invoiceCreateAsync(null);
	}

	public JsonNode invoiceList(Types.PaymentsApiTypes.PaymentsInvoiceListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/invoice/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode invoiceList() {
		return invoiceList(null);
	}

	public CompletableFuture<JsonNode> invoiceListAsync(Types.PaymentsApiTypes.PaymentsInvoiceListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/invoice/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> invoiceListAsync() {
		return invoiceListAsync(null);
	}

	public JsonNode currency() {
		return http.request(new RequestOptions(
			"GET",
			"/currency",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> currencyAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/currency",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode balanceList() {
		return http.request(new RequestOptions(
			"GET",
			"/balance/exchange",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> balanceListAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/exchange",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode balanceExchange(Types.PaymentsApiTypes.PaymentsBalanceExchangeBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/balance/exchange",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode balanceExchange() {
		return balanceExchange(null);
	}

	public CompletableFuture<JsonNode> balanceExchangeAsync(Types.PaymentsApiTypes.PaymentsBalanceExchangeBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/exchange",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> balanceExchangeAsync() {
		return balanceExchangeAsync(null);
	}

	public JsonNode transfer(Types.PaymentsApiTypes.PaymentsTransferBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/balance/transfer",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode transfer() {
		return transfer(null);
	}

	public CompletableFuture<JsonNode> transferAsync(Types.PaymentsApiTypes.PaymentsTransferBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/transfer",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> transferAsync() {
		return transferAsync(null);
	}

	public JsonNode fee(Types.PaymentsApiTypes.PaymentsFeeParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/balance/transfer/fee",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode fee() {
		return fee(null);
	}

	public CompletableFuture<JsonNode> feeAsync(Types.PaymentsApiTypes.PaymentsFeeParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/transfer/fee",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> feeAsync() {
		return feeAsync(null);
	}

	public JsonNode cancel(Types.PaymentsApiTypes.PaymentsCancelBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/balance/transfer/cancel",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode cancel() {
		return cancel(null);
	}

	public CompletableFuture<JsonNode> cancelAsync(Types.PaymentsApiTypes.PaymentsCancelBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/transfer/cancel",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> cancelAsync() {
		return cancelAsync(null);
	}

	public JsonNode history(Types.PaymentsApiTypes.PaymentsHistoryParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/user/payments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode history() {
		return history(null);
	}

	public CompletableFuture<JsonNode> historyAsync(Types.PaymentsApiTypes.PaymentsHistoryParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/user/payments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> historyAsync() {
		return historyAsync(null);
	}

	public JsonNode payoutServices() {
		return http.request(new RequestOptions(
			"GET",
			"/balance/payout/services",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> payoutServicesAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/balance/payout/services",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode payout(Types.PaymentsApiTypes.PaymentsPayoutBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/balance/payout",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode payout() {
		return payout(null);
	}

	public CompletableFuture<JsonNode> payoutAsync(Types.PaymentsApiTypes.PaymentsPayoutBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/balance/payout",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> payoutAsync() {
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

	public JsonNode list() {
		return http.request(new RequestOptions(
			"GET",
			"/auto-payments",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/auto-payments",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode create(Types.AutoPaymentsApiTypes.AutoPaymentsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode create() {
		return create(null);
	}

	public CompletableFuture<JsonNode> createAsync(Types.AutoPaymentsApiTypes.AutoPaymentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> createAsync() {
		return createAsync(null);
	}

	public JsonNode delete(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete() {
		return delete(null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/auto-payment",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync() {
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

	public JsonNode get() {
		return http.request(new RequestOptions(
			"GET",
			"/proxy",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/proxy",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode add(Types.ProxyApiTypes.ProxyAddBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/proxy",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> addAsync(Types.ProxyApiTypes.ProxyAddBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/proxy",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Types.ProxyApiTypes.ProxyDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/proxy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete() {
		return delete(null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Types.ProxyApiTypes.ProxyDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/proxy",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync() {
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

	public JsonNode create(Types.ImapApiTypes.ImapCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode create() {
		return create(null);
	}

	public CompletableFuture<JsonNode> createAsync(Types.ImapApiTypes.ImapCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> createAsync() {
		return createAsync(null);
	}

	public JsonNode delete(Types.ImapApiTypes.ImapDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete() {
		return delete(null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Types.ImapApiTypes.ImapDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/imap",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync() {
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

	public JsonNode batch(List<JsonNode> body) {
		return http.request(new RequestOptions(
			"POST",
			"/batch",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> batchAsync(List<JsonNode> body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/batch",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
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
