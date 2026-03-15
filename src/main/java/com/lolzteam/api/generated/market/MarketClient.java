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

public class MarketClient implements Closeable {

	public static class CategoryApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public CategoryApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.CategoryApiTypes.CategoryAllResponse all(Types.CategoryApiTypes.CategoryAllParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryAllResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryAllResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryAllResponse> allAsync() {
			return allAsync(null);
		}
	
		public Types.CategoryApiTypes.CategorySteamResponse steam(Types.CategoryApiTypes.CategorySteamParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/steam",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategorySteamResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategorySteamResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategorySteamResponse> steamAsync() {
			return steamAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryFortniteResponse fortnite(Types.CategoryApiTypes.CategoryFortniteParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/fortnite",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryFortniteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryFortniteResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryFortniteResponse> fortniteAsync() {
			return fortniteAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryMihoyoResponse mihoyo(Types.CategoryApiTypes.CategoryMihoyoParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/mihoyo",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryMihoyoResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryMihoyoResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryMihoyoResponse> mihoyoAsync() {
			return mihoyoAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryRiotResponse riot(Types.CategoryApiTypes.CategoryRiotParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/riot",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryRiotResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryRiotResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryRiotResponse> riotAsync() {
			return riotAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryTelegramResponse telegram(Types.CategoryApiTypes.CategoryTelegramParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/telegram",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryTelegramResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryTelegramResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryTelegramResponse> telegramAsync() {
			return telegramAsync(null);
		}
	
		public Types.CategoryApiTypes.CategorySupercellResponse supercell(Types.CategoryApiTypes.CategorySupercellParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/supercell",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategorySupercellResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategorySupercellResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategorySupercellResponse> supercellAsync() {
			return supercellAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryEaResponse ea(Types.CategoryApiTypes.CategoryEaParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/ea",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryEaResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryEaResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryEaResponse> eaAsync() {
			return eaAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryWotResponse wot(Types.CategoryApiTypes.CategoryWotParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/world-of-tanks",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryWotResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryWotResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryWotResponse> wotAsync() {
			return wotAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryWotBlitzResponse wotBlitz(Types.CategoryApiTypes.CategoryWotBlitzParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/wot-blitz",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryWotBlitzResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryWotBlitzResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryWotBlitzResponse> wotBlitzAsync() {
			return wotBlitzAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryGiftsResponse gifts(Types.CategoryApiTypes.CategoryGiftsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/gifts",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryGiftsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryGiftsResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryGiftsResponse> giftsAsync() {
			return giftsAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryEpicGamesResponse epicGames(Types.CategoryApiTypes.CategoryEpicGamesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/epicgames",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryEpicGamesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryEpicGamesResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryEpicGamesResponse> epicGamesAsync() {
			return epicGamesAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse escapeFromTarkov(Types.CategoryApiTypes.CategoryEscapeFromTarkovParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/escape-from-tarkov",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryEscapeFromTarkovResponse> escapeFromTarkovAsync() {
			return escapeFromTarkovAsync(null);
		}
	
		public Types.CategoryApiTypes.CategorySocialClubResponse socialClub(Types.CategoryApiTypes.CategorySocialClubParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/socialclub",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategorySocialClubResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategorySocialClubResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategorySocialClubResponse> socialClubAsync() {
			return socialClubAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryUplayResponse uplay(Types.CategoryApiTypes.CategoryUplayParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/uplay",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryUplayResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryUplayResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryUplayResponse> uplayAsync() {
			return uplayAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryDiscordResponse discord(Types.CategoryApiTypes.CategoryDiscordParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/discord",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryDiscordResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryDiscordResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryDiscordResponse> discordAsync() {
			return discordAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryTikTokResponse tikTok(Types.CategoryApiTypes.CategoryTikTokParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/tiktok",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryTikTokResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryTikTokResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryTikTokResponse> tikTokAsync() {
			return tikTokAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryInstagramResponse instagram(Types.CategoryApiTypes.CategoryInstagramParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/instagram",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryInstagramResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryInstagramResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryInstagramResponse> instagramAsync() {
			return instagramAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryBattleNetResponse battleNet(Types.CategoryApiTypes.CategoryBattleNetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/battlenet",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryBattleNetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryBattleNetResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryBattleNetResponse> battleNetAsync() {
			return battleNetAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryChatGPTResponse chatGPT(Types.CategoryApiTypes.CategoryChatGPTParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatgpt",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryChatGPTResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryChatGPTResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryChatGPTResponse> chatGPTAsync() {
			return chatGPTAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryVpnResponse vpn(Types.CategoryApiTypes.CategoryVpnParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/vpn",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryVpnResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryVpnResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryVpnResponse> vpnAsync() {
			return vpnAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryRobloxResponse roblox(Types.CategoryApiTypes.CategoryRobloxParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/roblox",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryRobloxResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryRobloxResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryRobloxResponse> robloxAsync() {
			return robloxAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryWarfaceResponse warface(Types.CategoryApiTypes.CategoryWarfaceParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/warface",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryWarfaceResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryWarfaceResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryWarfaceResponse> warfaceAsync() {
			return warfaceAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryMinecraftResponse minecraft(Types.CategoryApiTypes.CategoryMinecraftParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/minecraft",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryMinecraftResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryMinecraftResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryMinecraftResponse> minecraftAsync() {
			return minecraftAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryHytaleResponse hytale(Types.CategoryApiTypes.CategoryHytaleParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/hytale",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryHytaleResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryHytaleResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryHytaleResponse> hytaleAsync() {
			return hytaleAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryListResponse list(Types.CategoryApiTypes.CategoryListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/category",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryListResponse.class));
		}
	
		public CompletableFuture<Types.CategoryApiTypes.CategoryListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.CategoryApiTypes.CategoryParamsResponse params(String categoryName) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + categoryName + "/params",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryParamsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryParamsResponse.class));
		}
	
		public Types.CategoryApiTypes.CategoryGamesResponse games(String categoryName) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + categoryName + "/games",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ true
			)), Types.CategoryApiTypes.CategoryGamesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoryApiTypes.CategoryGamesResponse.class));
		}
	}

	public static class ListApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ListApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ListApiTypes.ListUserResponse user(Types.ListApiTypes.ListUserParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/user/items",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ListApiTypes.ListUserResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ListApiTypes.ListUserResponse.class));
		}
	
		public CompletableFuture<Types.ListApiTypes.ListUserResponse> userAsync() {
			return userAsync(null);
		}
	
		public Types.ListApiTypes.ListOrdersResponse orders(Types.ListApiTypes.ListOrdersParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/user/orders",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ListApiTypes.ListOrdersResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ListApiTypes.ListOrdersResponse.class));
		}
	
		public CompletableFuture<Types.ListApiTypes.ListOrdersResponse> ordersAsync() {
			return ordersAsync(null);
		}
	
		public Types.ListApiTypes.ListStatesResponse states(Types.ListApiTypes.ListStatesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/user/item-states",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ListApiTypes.ListStatesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ListApiTypes.ListStatesResponse.class));
		}
	
		public CompletableFuture<Types.ListApiTypes.ListStatesResponse> statesAsync() {
			return statesAsync(null);
		}
	
		public String download(String type, Types.ListApiTypes.ListDownloadParams params) {
			return http.requestRaw(new RequestOptions(
				"GET",
				"/user/" + type + "/download",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			));
		}
	
		public String download(String type) {
			return download(type, null);
		}
	
		public CompletableFuture<String> downloadAsync(String type, Types.ListApiTypes.ListDownloadParams params) {
			return http.requestRawAsync(new RequestOptions(
				"GET",
				"/user/" + type + "/download",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			));
		}
	
		public CompletableFuture<String> downloadAsync(String type) {
			return downloadAsync(type, null);
		}
	
		public Types.ListApiTypes.ListFavoritesResponse favorites(Types.ListApiTypes.ListFavoritesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/fave",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ListApiTypes.ListFavoritesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ListApiTypes.ListFavoritesResponse.class));
		}
	
		public CompletableFuture<Types.ListApiTypes.ListFavoritesResponse> favoritesAsync() {
			return favoritesAsync(null);
		}
	
		public Types.ListApiTypes.ListViewedResponse viewed(Types.ListApiTypes.ListViewedParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/viewed",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ListApiTypes.ListViewedResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ListApiTypes.ListViewedResponse.class));
		}
	
		public CompletableFuture<Types.ListApiTypes.ListViewedResponse> viewedAsync() {
			return viewedAsync(null);
		}
	}

	public static class ManagingApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ManagingApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ManagingApiTypes.ManagingGetResponse get(long itemId, Types.ManagingApiTypes.ManagingGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingGetResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingGetResponse get(long itemId) {
			return get(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingGetResponse> getAsync(long itemId, Types.ManagingApiTypes.ManagingGetParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingGetResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingGetResponse> getAsync(long itemId) {
			return getAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingDeleteResponse delete(long itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingDeleteResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingDeleteResponse delete(long itemId) {
			return delete(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingDeleteResponse> deleteAsync(long itemId, Types.ManagingApiTypes.ManagingDeleteBody body) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingDeleteResponse> deleteAsync(long itemId) {
			return deleteAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingCreateClaimResponse createClaim(Types.ManagingApiTypes.ManagingCreateClaimBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/claims",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingCreateClaimResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingCreateClaimResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingCreateClaimResponse> createClaimAsync() {
			return createClaimAsync(null);
		}
	
		public Types.ManagingApiTypes.ManagingBulkGetResponse bulkGet(Types.ManagingApiTypes.ManagingBulkGetBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/bulk/items",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingBulkGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingBulkGetResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingSteamInventoryValueResponse steamInventoryValue(long itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/inventory-value",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamInventoryValueResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingSteamInventoryValueResponse steamInventoryValue(long itemId) {
			return steamInventoryValue(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamInventoryValueResponse> steamInventoryValueAsync(long itemId, Types.ManagingApiTypes.ManagingSteamInventoryValueParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/inventory-value",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamInventoryValueResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamInventoryValueResponse> steamInventoryValueAsync(long itemId) {
			return steamInventoryValueAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingSteamValueResponse steamValue(Types.ManagingApiTypes.ManagingSteamValueParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/steam-value",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamValueResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamValueResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamValueResponse> steamValueAsync() {
			return steamValueAsync(null);
		}
	
		public String steamPreview(long itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
			return http.requestRaw(new RequestOptions(
				"GET",
				"/" + itemId + "/steam-preview",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			));
		}
	
		public String steamPreview(long itemId) {
			return steamPreview(itemId, null);
		}
	
		public CompletableFuture<String> steamPreviewAsync(long itemId, Types.ManagingApiTypes.ManagingSteamPreviewParams params) {
			return http.requestRawAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/steam-preview",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			));
		}
	
		public CompletableFuture<String> steamPreviewAsync(long itemId) {
			return steamPreviewAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingEditResponse edit(long itemId, Types.ManagingApiTypes.ManagingEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/" + itemId + "/edit",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingEditResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingEditResponse edit(long itemId) {
			return edit(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingEditResponse> editAsync(long itemId, Types.ManagingApiTypes.ManagingEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/" + itemId + "/edit",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingEditResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingEditResponse> editAsync(long itemId) {
			return editAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingAIPriceResponse aIPrice(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/ai-price",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingAIPriceResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingAIPriceResponse> aIPriceAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/ai-price",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingAIPriceResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingAutoBuyPriceResponse autoBuyPrice(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/auto-buy-price",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingAutoBuyPriceResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBuyPriceResponse> autoBuyPriceAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/auto-buy-price",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingAutoBuyPriceResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingNoteResponse note(long itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/note-save",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingNoteResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingNoteResponse note(long itemId) {
			return note(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingNoteResponse> noteAsync(long itemId, Types.ManagingApiTypes.ManagingNoteBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/note-save",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingNoteResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingNoteResponse> noteAsync(long itemId) {
			return noteAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingSteamUpdateValueResponse steamUpdateValue(long itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/update-inventory",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamUpdateValueResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingSteamUpdateValueResponse steamUpdateValue(long itemId) {
			return steamUpdateValue(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamUpdateValueResponse> steamUpdateValueAsync(long itemId, Types.ManagingApiTypes.ManagingSteamUpdateValueBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/update-inventory",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamUpdateValueResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamUpdateValueResponse> steamUpdateValueAsync(long itemId) {
			return steamUpdateValueAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingBumpResponse bump(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingBumpResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingBumpResponse> bumpAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingBumpResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingAutoBumpResponse autoBump(long itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/auto-bump",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingAutoBumpResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingAutoBumpResponse autoBump(long itemId) {
			return autoBump(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpResponse> autoBumpAsync(long itemId, Types.ManagingApiTypes.ManagingAutoBumpBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/auto-bump",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingAutoBumpResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpResponse> autoBumpAsync(long itemId) {
			return autoBumpAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingAutoBumpDisableResponse autoBumpDisable(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/auto-bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingAutoBumpDisableResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingAutoBumpDisableResponse> autoBumpDisableAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/auto-bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingAutoBumpDisableResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingOpenResponse open(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/open",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingOpenResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingOpenResponse> openAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/open",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingOpenResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingCloseResponse close(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/close",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingCloseResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingCloseResponse> closeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/close",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingCloseResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingImageResponse image(long itemId, Types.ManagingApiTypes.ManagingImageParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/image",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingImageResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingImageResponse image(long itemId) {
			return image(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingImageResponse> imageAsync(long itemId, Types.ManagingApiTypes.ManagingImageParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/image",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingImageResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingImageResponse> imageAsync(long itemId) {
			return imageAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingEmailCodeResponse emailCode(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/email-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingEmailCodeResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingEmailCodeResponse> emailCodeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/email-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingEmailCodeResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingGetLetters2Response getLetters2(Types.ManagingApiTypes.ManagingGetLetters2Params params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/letters2",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingGetLetters2Response.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingGetLetters2Response.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingGetLetters2Response> getLetters2Async() {
			return getLetters2Async(null);
		}
	
		public Types.ManagingApiTypes.ManagingSteamGetMafileResponse steamGetMafile(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamGetMafileResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamGetMafileResponse> steamGetMafileAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamGetMafileResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingSteamAddMafileResponse steamAddMafile(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamAddMafileResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamAddMafileResponse> steamAddMafileAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamAddMafileResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse steamRemoveMafile(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse> steamRemoveMafileAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/mafile",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamRemoveMafileResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingSteamMafileCodeResponse steamMafileCode(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/guard-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamMafileCodeResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamMafileCodeResponse> steamMafileCodeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/guard-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamMafileCodeResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingSteamSDAResponse steamSDA(long itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/confirm-sda",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingSteamSDAResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingSteamSDAResponse steamSDA(long itemId) {
			return steamSDA(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamSDAResponse> steamSDAAsync(long itemId, Types.ManagingApiTypes.ManagingSteamSDABody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/confirm-sda",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingSteamSDAResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingSteamSDAResponse> steamSDAAsync(long itemId) {
			return steamSDAAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingTelegramCodeResponse telegramCode(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/telegram-login-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingTelegramCodeResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTelegramCodeResponse> telegramCodeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/telegram-login-code",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingTelegramCodeResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingTelegramResetAuthResponse telegramResetAuth(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/telegram-reset-authorizations",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingTelegramResetAuthResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTelegramResetAuthResponse> telegramResetAuthAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/telegram-reset-authorizations",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingTelegramResetAuthResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse refuseGuarantee(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/refuse-guarantee",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse> refuseGuaranteeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/refuse-guarantee",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingRefuseGuaranteeResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse declineVideoRecording(long itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/decline-video-recording",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse declineVideoRecording(long itemId) {
			return declineVideoRecording(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse> declineVideoRecordingAsync(long itemId, Types.ManagingApiTypes.ManagingDeclineVideoRecordingBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/decline-video-recording",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingDeclineVideoRecordingResponse> declineVideoRecordingAsync(long itemId) {
			return declineVideoRecordingAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingCheckGuaranteeResponse checkGuarantee(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/check-guarantee",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingCheckGuaranteeResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingCheckGuaranteeResponse> checkGuaranteeAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/check-guarantee",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingCheckGuaranteeResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingChangePasswordResponse changePassword(long itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/change-password",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingChangePasswordResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingChangePasswordResponse changePassword(long itemId) {
			return changePassword(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingChangePasswordResponse> changePasswordAsync(long itemId, Types.ManagingApiTypes.ManagingChangePasswordBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/change-password",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingChangePasswordResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingChangePasswordResponse> changePasswordAsync(long itemId) {
			return changePasswordAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingTempEmailPasswordResponse tempEmailPassword(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/" + itemId + "/temp-email-password",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingTempEmailPasswordResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTempEmailPasswordResponse> tempEmailPasswordAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/" + itemId + "/temp-email-password",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingTempEmailPasswordResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingTagResponse tag(long itemId, Types.ManagingApiTypes.ManagingTagBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingTagResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingTagResponse tag(long itemId) {
			return tag(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTagResponse> tagAsync(long itemId, Types.ManagingApiTypes.ManagingTagBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingTagResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTagResponse> tagAsync(long itemId) {
			return tagAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingUntagResponse untag(long itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingUntagResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingUntagResponse untag(long itemId) {
			return untag(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingUntagResponse> untagAsync(long itemId, Types.ManagingApiTypes.ManagingUntagBody body) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingUntagResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingUntagResponse> untagAsync(long itemId) {
			return untagAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingPublicTagResponse publicTag(long itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/public-tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingPublicTagResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingPublicTagResponse publicTag(long itemId) {
			return publicTag(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingPublicTagResponse> publicTagAsync(long itemId, Types.ManagingApiTypes.ManagingPublicTagBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/public-tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingPublicTagResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingPublicTagResponse> publicTagAsync(long itemId) {
			return publicTagAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingPublicUntagResponse publicUntag(long itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/public-tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingPublicUntagResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingPublicUntagResponse publicUntag(long itemId) {
			return publicUntag(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingPublicUntagResponse> publicUntagAsync(long itemId, Types.ManagingApiTypes.ManagingPublicUntagBody body) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/public-tag",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingPublicUntagResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingPublicUntagResponse> publicUntagAsync(long itemId) {
			return publicUntagAsync(itemId, null);
		}
	
		public Types.ManagingApiTypes.ManagingFavoriteResponse favorite(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingFavoriteResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingFavoriteResponse> favoriteAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingFavoriteResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingUnfavoriteResponse unfavorite(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingUnfavoriteResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingUnfavoriteResponse> unfavoriteAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingUnfavoriteResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingStickResponse stick(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingStickResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingStickResponse> stickAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingStickResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingUnstickResponse unstick(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingUnstickResponse.class);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingUnstickResponse> unstickAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingUnstickResponse.class));
		}
	
		public Types.ManagingApiTypes.ManagingTransferResponse transfer(long itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/change-owner",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ManagingApiTypes.ManagingTransferResponse.class);
		}
	
		public Types.ManagingApiTypes.ManagingTransferResponse transfer(long itemId) {
			return transfer(itemId, null);
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTransferResponse> transferAsync(long itemId, Types.ManagingApiTypes.ManagingTransferBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/change-owner",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ManagingApiTypes.ManagingTransferResponse.class));
		}
	
		public CompletableFuture<Types.ManagingApiTypes.ManagingTransferResponse> transferAsync(long itemId) {
			return transferAsync(itemId, null);
		}
	}

	public static class ProfileApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ProfileApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ProfileApiTypes.ProfileClaimsResponse claims(Types.ProfileApiTypes.ProfileClaimsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/claims",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfileApiTypes.ProfileClaimsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfileApiTypes.ProfileClaimsResponse.class));
		}
	
		public CompletableFuture<Types.ProfileApiTypes.ProfileClaimsResponse> claimsAsync() {
			return claimsAsync(null);
		}
	
		public Types.ProfileApiTypes.ProfileGetResponse get(Types.ProfileApiTypes.ProfileGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/me",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfileApiTypes.ProfileGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfileApiTypes.ProfileGetResponse.class));
		}
	
		public CompletableFuture<Types.ProfileApiTypes.ProfileGetResponse> getAsync() {
			return getAsync(null);
		}
	
		public Types.ProfileApiTypes.ProfileEditResponse edit(Types.ProfileApiTypes.ProfileEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/me",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfileApiTypes.ProfileEditResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfileApiTypes.ProfileEditResponse.class));
		}
	
		public CompletableFuture<Types.ProfileApiTypes.ProfileEditResponse> editAsync() {
			return editAsync(null);
		}
	}

	public static class CartApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public CartApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.CartApiTypes.CartGetResponse get(Types.CartApiTypes.CartGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/cart",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CartApiTypes.CartGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CartApiTypes.CartGetResponse.class));
		}
	
		public CompletableFuture<Types.CartApiTypes.CartGetResponse> getAsync() {
			return getAsync(null);
		}
	
		public Types.CartApiTypes.CartAddResponse add(Types.CartApiTypes.CartAddBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/cart",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CartApiTypes.CartAddResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CartApiTypes.CartAddResponse.class));
		}
	
		public Types.CartApiTypes.CartDeleteResponse delete(Types.CartApiTypes.CartDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/cart",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CartApiTypes.CartDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CartApiTypes.CartDeleteResponse.class));
		}
	
		public CompletableFuture<Types.CartApiTypes.CartDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	}

	public static class PurchasingApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public PurchasingApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.PurchasingApiTypes.PurchasingFastBuyResponse fastBuy(long itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/fast-buy",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PurchasingApiTypes.PurchasingFastBuyResponse.class);
		}
	
		public Types.PurchasingApiTypes.PurchasingFastBuyResponse fastBuy(long itemId) {
			return fastBuy(itemId, null);
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingFastBuyResponse> fastBuyAsync(long itemId, Types.PurchasingApiTypes.PurchasingFastBuyBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/fast-buy",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PurchasingApiTypes.PurchasingFastBuyResponse.class));
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingFastBuyResponse> fastBuyAsync(long itemId) {
			return fastBuyAsync(itemId, null);
		}
	
		public Types.PurchasingApiTypes.PurchasingCheckResponse check(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/check-account",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PurchasingApiTypes.PurchasingCheckResponse.class);
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingCheckResponse> checkAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/check-account",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PurchasingApiTypes.PurchasingCheckResponse.class));
		}
	
		public Types.PurchasingApiTypes.PurchasingConfirmResponse confirm(long itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/confirm-buy",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PurchasingApiTypes.PurchasingConfirmResponse.class);
		}
	
		public Types.PurchasingApiTypes.PurchasingConfirmResponse confirm(long itemId) {
			return confirm(itemId, null);
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingConfirmResponse> confirmAsync(long itemId, Types.PurchasingApiTypes.PurchasingConfirmBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/confirm-buy",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PurchasingApiTypes.PurchasingConfirmResponse.class));
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingConfirmResponse> confirmAsync(long itemId) {
			return confirmAsync(itemId, null);
		}
	
		public Types.PurchasingApiTypes.PurchasingDiscountRequestResponse discountRequest(long itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/discount",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PurchasingApiTypes.PurchasingDiscountRequestResponse.class);
		}
	
		public Types.PurchasingApiTypes.PurchasingDiscountRequestResponse discountRequest(long itemId) {
			return discountRequest(itemId, null);
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountRequestResponse> discountRequestAsync(long itemId, Types.PurchasingApiTypes.PurchasingDiscountRequestBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/discount",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PurchasingApiTypes.PurchasingDiscountRequestResponse.class));
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountRequestResponse> discountRequestAsync(long itemId) {
			return discountRequestAsync(itemId, null);
		}
	
		public Types.PurchasingApiTypes.PurchasingDiscountCancelResponse discountCancel(long itemId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/" + itemId + "/discount",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PurchasingApiTypes.PurchasingDiscountCancelResponse.class);
		}
	
		public CompletableFuture<Types.PurchasingApiTypes.PurchasingDiscountCancelResponse> discountCancelAsync(long itemId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/" + itemId + "/discount",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PurchasingApiTypes.PurchasingDiscountCancelResponse.class));
		}
	}

	public static class CustomDiscountsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public CustomDiscountsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse get() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/custom-discounts",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CustomDiscountsApiTypes.CustomDiscountsGetResponse.class));
		}
	
		public Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse create(Types.CustomDiscountsApiTypes.CustomDiscountsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/custom-discounts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse.class));
		}
	
		public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse edit(Types.CustomDiscountsApiTypes.CustomDiscountsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/custom-discounts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse.class));
		}
	
		public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsEditResponse> editAsync() {
			return editAsync(null);
		}
	
		public Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse delete(Types.CustomDiscountsApiTypes.CustomDiscountsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/custom-discounts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.CustomDiscountsApiTypes.CustomDiscountsDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	}

	public static class PublishingApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public PublishingApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.PublishingApiTypes.PublishingFastSellResponse fastSell(Types.PublishingApiTypes.PublishingFastSellBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/item/fast-sell",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PublishingApiTypes.PublishingFastSellResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PublishingApiTypes.PublishingFastSellResponse.class));
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingFastSellResponse> fastSellAsync() {
			return fastSellAsync(null);
		}
	
		public Types.PublishingApiTypes.PublishingAddResponse add(Types.PublishingApiTypes.PublishingAddBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/item/add",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PublishingApiTypes.PublishingAddResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PublishingApiTypes.PublishingAddResponse.class));
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingAddResponse> addAsync() {
			return addAsync(null);
		}
	
		public Types.PublishingApiTypes.PublishingCheckResponse check(long itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/goods/check",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PublishingApiTypes.PublishingCheckResponse.class);
		}
	
		public Types.PublishingApiTypes.PublishingCheckResponse check(long itemId) {
			return check(itemId, null);
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingCheckResponse> checkAsync(long itemId, Types.PublishingApiTypes.PublishingCheckBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/goods/check",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PublishingApiTypes.PublishingCheckResponse.class));
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingCheckResponse> checkAsync(long itemId) {
			return checkAsync(itemId, null);
		}
	
		public Types.PublishingApiTypes.PublishingExternalResponse external(long itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/" + itemId + "/external-account",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PublishingApiTypes.PublishingExternalResponse.class);
		}
	
		public Types.PublishingApiTypes.PublishingExternalResponse external(long itemId) {
			return external(itemId, null);
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingExternalResponse> externalAsync(long itemId, Types.PublishingApiTypes.PublishingExternalBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/" + itemId + "/external-account",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PublishingApiTypes.PublishingExternalResponse.class));
		}
	
		public CompletableFuture<Types.PublishingApiTypes.PublishingExternalResponse> externalAsync(long itemId) {
			return externalAsync(itemId, null);
		}
	}

	public static class PaymentsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public PaymentsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.PaymentsApiTypes.PaymentsInvoiceGetResponse invoiceGet(Types.PaymentsApiTypes.PaymentsInvoiceGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/invoice",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsInvoiceGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsInvoiceGetResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceGetResponse> invoiceGetAsync() {
			return invoiceGetAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse invoiceCreate(Types.PaymentsApiTypes.PaymentsInvoiceCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/invoice",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceCreateResponse> invoiceCreateAsync() {
			return invoiceCreateAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsInvoiceListResponse invoiceList(Types.PaymentsApiTypes.PaymentsInvoiceListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/invoice/list",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsInvoiceListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsInvoiceListResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsInvoiceListResponse> invoiceListAsync() {
			return invoiceListAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsCurrencyResponse currency() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/currency",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsCurrencyResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsCurrencyResponse.class));
		}
	
		public Types.PaymentsApiTypes.PaymentsBalanceListResponse balanceList() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/balance/exchange",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsBalanceListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsBalanceListResponse.class));
		}
	
		public Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse balanceExchange(Types.PaymentsApiTypes.PaymentsBalanceExchangeBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/balance/exchange",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsBalanceExchangeResponse> balanceExchangeAsync() {
			return balanceExchangeAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsTransferResponse transfer(Types.PaymentsApiTypes.PaymentsTransferBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/balance/transfer",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsTransferResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsTransferResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsTransferResponse> transferAsync() {
			return transferAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsFeeResponse fee(Types.PaymentsApiTypes.PaymentsFeeParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/balance/transfer/fee",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsFeeResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsFeeResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsFeeResponse> feeAsync() {
			return feeAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsCancelResponse cancel(Types.PaymentsApiTypes.PaymentsCancelBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/balance/transfer/cancel",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsCancelResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsCancelResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsCancelResponse> cancelAsync() {
			return cancelAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsHistoryResponse history(Types.PaymentsApiTypes.PaymentsHistoryParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/user/payments",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsHistoryResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsHistoryResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsHistoryResponse> historyAsync() {
			return historyAsync(null);
		}
	
		public Types.PaymentsApiTypes.PaymentsPayoutServicesResponse payoutServices() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/balance/payout/services",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsPayoutServicesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsPayoutServicesResponse.class));
		}
	
		public Types.PaymentsApiTypes.PaymentsPayoutResponse payout(Types.PaymentsApiTypes.PaymentsPayoutBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/balance/payout",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PaymentsApiTypes.PaymentsPayoutResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PaymentsApiTypes.PaymentsPayoutResponse.class));
		}
	
		public CompletableFuture<Types.PaymentsApiTypes.PaymentsPayoutResponse> payoutAsync() {
			return payoutAsync(null);
		}
	}

	public static class AutoPaymentsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public AutoPaymentsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.AutoPaymentsApiTypes.AutoPaymentsListResponse list() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/auto-payments",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.AutoPaymentsApiTypes.AutoPaymentsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.AutoPaymentsApiTypes.AutoPaymentsListResponse.class));
		}
	
		public Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse create(Types.AutoPaymentsApiTypes.AutoPaymentsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/auto-payment",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse.class));
		}
	
		public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse delete(Types.AutoPaymentsApiTypes.AutoPaymentsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/auto-payment",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.AutoPaymentsApiTypes.AutoPaymentsDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	}

	public static class ProxyApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ProxyApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ProxyApiTypes.ProxyGetResponse get() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/proxy",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProxyApiTypes.ProxyGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProxyApiTypes.ProxyGetResponse.class));
		}
	
		public Types.ProxyApiTypes.ProxyAddResponse add(Types.ProxyApiTypes.ProxyAddBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/proxy",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProxyApiTypes.ProxyAddResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProxyApiTypes.ProxyAddResponse.class));
		}
	
		public Types.ProxyApiTypes.ProxyDeleteResponse delete(Types.ProxyApiTypes.ProxyDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/proxy",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProxyApiTypes.ProxyDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProxyApiTypes.ProxyDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ProxyApiTypes.ProxyDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	}

	public static class ImapApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ImapApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ImapApiTypes.ImapCreateResponse create(Types.ImapApiTypes.ImapCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/imap",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ImapApiTypes.ImapCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ImapApiTypes.ImapCreateResponse.class));
		}
	
		public CompletableFuture<Types.ImapApiTypes.ImapCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.ImapApiTypes.ImapDeleteResponse delete(Types.ImapApiTypes.ImapDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/imap",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ImapApiTypes.ImapDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ImapApiTypes.ImapDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ImapApiTypes.ImapDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	}

	public static class BatchApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public BatchApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.BatchApiTypes.BatchBatchResponse batch(List<JsonNode> body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/batch",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.BatchApiTypes.BatchBatchResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.BatchApiTypes.BatchBatchResponse.class));
		}
	}

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
