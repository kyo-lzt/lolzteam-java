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
	
		/**
		 * Get Last Accounts
		 *
		 * <p>Displays a list of latest accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Last Accounts
		 *
		 * <p>Displays a list of latest accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Steam
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Steam
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Fortnite
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Fortnite
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * miHoYo
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * miHoYo
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Riot
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Riot
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Telegram
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Telegram
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Supercell
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Supercell
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * EA (Origin)
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * EA (Origin)
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * World of Tanks
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * World of Tanks
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * WoT Blitz
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * WoT Blitz
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Gifts
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Gifts
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Epic Games
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Epic Games
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Escape from Tarkov
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Escape from Tarkov
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Social Club
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Social Club
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Uplay
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Uplay
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Discord
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Discord
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * TikTok
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * TikTok
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Instagram
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Instagram
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * BattleNet
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * BattleNet
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * ChatGPT
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * ChatGPT
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * VPN
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * VPN
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Roblox
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Roblox
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Warface
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Warface
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Minecraft
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Minecraft
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Hytale
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Hytale
		 *
		 * <p>Displays a list of accounts in a specific category according to your parameters.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Categories
		 *
		 * <p>Display category list.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Categories
		 *
		 * <p>Display category list.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Category Search Params
		 *
		 * <p>Displays search parameters for a category.</p>
		 * @param categoryName Category name.
		 */
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
	
		/**
		 * Get Category Search Params
		 *
		 * <p>Displays search parameters for a category.</p>
		 * @param categoryName Category name.
		 */
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
	
		/**
		 * Get Category Games
		 *
		 * <p>Displays a list of games in the category.</p>
		 * @param categoryName Category name.
		 */
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
	
		/**
		 * Get Category Games
		 *
		 * <p>Displays a list of games in the category.</p>
		 * @param categoryName Category name.
		 */
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
	
		/**
		 * Get All User Accounts
		 *
		 * <p>Displays a list of user accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All User Accounts
		 *
		 * <p>Displays a list of user accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Purchased Accounts
		 *
		 * <p>Displays a list of purchased accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Purchased Accounts
		 *
		 * <p>Displays a list of purchased accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get User Items States
		 *
		 * <p>Returns the states of user items.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get User Items States
		 *
		 * <p>Returns the states of user items.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Download Accounts Data
		 *
		 * <p>Download accounts data in the specified format.</p>
		 * @param type The type of account list to download.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Download Accounts Data
		 *
		 * <p>Download accounts data in the specified format.</p>
		 * @param type The type of account list to download.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Favourites Accounts
		 *
		 * <p>Displays a list of favourites accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Favourites Accounts
		 *
		 * <p>Displays a list of favourites accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Viewed Accounts
		 *
		 * <p>Displays a list of viewed accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get All Viewed Accounts
		 *
		 * <p>Displays a list of viewed accounts.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Account
		 *
		 * <p>Displays account information.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Account
		 *
		 * <p>Displays account information.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Delete Account
		 *
		 * <p>Deletes your account from public search. Deletion type is soft. You can restore account after deletion if you want.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Account
		 *
		 * <p>Deletes your account from public search. Deletion type is soft. You can restore account after deletion if you want.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Claim
		 *
		 * <p>Create a claim.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Claim
		 *
		 * <p>Create a claim.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Bulk Get Accounts
		 *
		 * <p>Bulk get up to 250 accounts.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Bulk Get Accounts
		 *
		 * <p>Bulk get up to 250 accounts.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Account Steam Inventory Value
		 *
		 * <p>Gets Account steam inventory value.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Account Steam Inventory Value
		 *
		 * <p>Gets Account steam inventory value.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Steam Inventory Value
		 *
		 * <p>Gets steam inventory value.
		 * &gt; 📘 This method is rate limited. You can send 20 requests per minute (3s delay between requests)</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Steam Inventory Value
		 *
		 * <p>Gets steam inventory value.
		 * &gt; 📘 This method is rate limited. You can send 20 requests per minute (3s delay between requests)</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Steam HTML
		 *
		 * <p>Returns Steam account profile/games preview.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Steam HTML
		 *
		 * <p>Returns Steam account profile/games preview.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Edit Account
		 *
		 * <p>Edits any details of account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Edit Account
		 *
		 * <p>Edits any details of account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Get AI Price
		 *
		 * <p>Get AI-suggested price for the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get AI Price
		 *
		 * <p>Get AI-suggested price for the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Auto Buy Price
		 *
		 * <p>Get auto buy price for the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Auto Buy Price
		 *
		 * <p>Get auto buy price for the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Edit Note
		 *
		 * <p>Edits a note for the account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Edit Note
		 *
		 * <p>Edits a note for the account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Update Inventory Value
		 *
		 * <p>Update inventory value.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Update Inventory Value
		 *
		 * <p>Update inventory value.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Bump Account
		 *
		 * <p>Bumps account in the search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Bump Account
		 *
		 * <p>Bumps account in the search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Auto Bump
		 *
		 * <p>Enables/edits automatic bumping for the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Auto Bump
		 *
		 * <p>Enables/edits automatic bumping for the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Disable Auto Bump
		 *
		 * <p>Disables automatic bumping for the specified account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Disable Auto Bump
		 *
		 * <p>Disables automatic bumping for the specified account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Open Account
		 *
		 * <p>Opens account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Open Account
		 *
		 * <p>Opens account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Close Account
		 *
		 * <p>Closes account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Close Account
		 *
		 * <p>Closes account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Account Image
		 *
		 * <p>Get account image.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Account Image
		 *
		 * <p>Get account image.</p>
		 * @param itemId Item id.
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Email Confirmation Code
		 *
		 * <p>Gets confirmation code or link.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Email Confirmation Code
		 *
		 * <p>Gets confirmation code or link.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Email Letters
		 *
		 * <p>Returns account letters.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Email Letters
		 *
		 * <p>Returns account letters.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Mafile
		 *
		 * <p>Returns steam mafile.
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Mafile
		 *
		 * <p>Returns steam mafile.
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Add Mafile
		 *
		 * <p>Add a new Steam mafile to the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Add Mafile
		 *
		 * <p>Add a new Steam mafile to the account.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Remove Mafile
		 *
		 * <p>Remove steam mafile.
		 * &gt; ❗️ This will unlink the authenticator from the account and remove mafile from the item</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Remove Mafile
		 *
		 * <p>Remove steam mafile.
		 * &gt; ❗️ This will unlink the authenticator from the account and remove mafile from the item</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Mafile Confirmation Code
		 *
		 * <p>Gets confirmation code from MaFile (Only for Steam accounts).</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Mafile Confirmation Code
		 *
		 * <p>Gets confirmation code from MaFile (Only for Steam accounts).</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Confirm SDA
		 *
		 * <p>Confirm steam action. 
		 * 
		 *  Don't set **id** and **nonce** parameters to get list of available confirmation requests. 
		 * 
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Confirm SDA
		 *
		 * <p>Confirm steam action. 
		 * 
		 *  Don't set **id** and **nonce** parameters to get list of available confirmation requests. 
		 * 
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Telegram Confirmation Code
		 *
		 * <p>Gets confirmation code from Telegram.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Telegram Confirmation Code
		 *
		 * <p>Gets confirmation code from Telegram.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Telegram Reset Auth
		 *
		 * <p>Resets Telegram authorizations.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Telegram Reset Auth
		 *
		 * <p>Resets Telegram authorizations.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Cancel Guarantee
		 *
		 * <p>Cancel guarantee of account. It can be useful for account reselling.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Cancel Guarantee
		 *
		 * <p>Cancel guarantee of account. It can be useful for account reselling.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Decline Video Recording Request
		 *
		 * <p>Waiver of the requirement to record a video and any claims regarding this account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Decline Video Recording Request
		 *
		 * <p>Waiver of the requirement to record a video and any claims regarding this account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Check Guarantee
		 *
		 * <p>Checks the guarantee and cancels it if there are reasons to cancel it.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Check Guarantee
		 *
		 * <p>Checks the guarantee and cancels it if there are reasons to cancel it.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Change Password
		 *
		 * <p>Changes password of account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Change Password
		 *
		 * <p>Changes password of account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Temp Email Password
		 *
		 * <p>Gets password from temp email of account. After calling of this method, the guarantee will be cancelled and you cannot automatically resell account.
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Temp Email Password
		 *
		 * <p>Gets password from temp email of account. After calling of this method, the guarantee will be cancelled and you cannot automatically resell account.
		 * &gt; ❗️ This action is cancelling active account guarantee</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Add a Tag
		 *
		 * <p>Adds a tag to the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Add a Tag
		 *
		 * <p>Adds a tag to the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Remove a Tag
		 *
		 * <p>Removes a tag from from the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Remove a Tag
		 *
		 * <p>Removes a tag from from the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Add a Public Tag
		 *
		 * <p>Adds a public tag to the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Add a Public Tag
		 *
		 * <p>Adds a public tag to the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Remove a Public Tag
		 *
		 * <p>Removes a public tag from the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Remove a Public Tag
		 *
		 * <p>Removes a public tag from the specified account.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Favorite
		 *
		 * <p>Adds account to favorites.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Favorite
		 *
		 * <p>Adds account to favorites.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Unfavorite
		 *
		 * <p>Delete account from favorites.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Unfavorite
		 *
		 * <p>Delete account from favorites.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Stick Account
		 *
		 * <p>Stick account in the top of search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Stick Account
		 *
		 * <p>Stick account in the top of search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Unstick Account
		 *
		 * <p>Unstick account from the top of search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Unstick Account
		 *
		 * <p>Unstick account from the top of search.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Change Account Owner
		 *
		 * <p>Transfer account to another user.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Change Account Owner
		 *
		 * <p>Transfer account to another user.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Claims
		 *
		 * <p>Returns a list of claims filed against you.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Claims
		 *
		 * <p>Returns a list of claims filed against you.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Profile
		 *
		 * <p>Displays info about your profile.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Profile
		 *
		 * <p>Displays info about your profile.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Edit Market Settings
		 *
		 * <p>Change settings about your profile on the market.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Edit Market Settings
		 *
		 * <p>Change settings about your profile on the market.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Cart Items
		 *
		 * <p>Returns the list of items currently in your cart.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Cart Items
		 *
		 * <p>Returns the list of items currently in your cart.</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Add Item to Cart
		 *
		 * <p>Adds item to your cart.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Add Item to Cart
		 *
		 * <p>Adds item to your cart.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Item From Cart
		 *
		 * <p>Deletes an item from the cart.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Item From Cart
		 *
		 * <p>Deletes an item from the cart.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Fast Buy Account
		 *
		 * <p>Check and buy account.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Fast Buy Account
		 *
		 * <p>Check and buy account.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Check Account
		 *
		 * <p>Checking account for validity.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Check Account
		 *
		 * <p>Checking account for validity.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Confirm Buy
		 *
		 * <p>Confirm buy.
		 * 
		 * &gt; ❗️ This method doesn't check account for validity. If you want to confirm validity before buying, you should use [FastBuy](https://lzt-market.readme.io/reference/purchasingfastbuy) method</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Confirm Buy
		 *
		 * <p>Confirm buy.
		 * 
		 * &gt; ❗️ This method doesn't check account for validity. If you want to confirm validity before buying, you should use [FastBuy](https://lzt-market.readme.io/reference/purchasingfastbuy) method</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Discount Request
		 *
		 * <p>Request a discount for the specified item.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Discount Request
		 *
		 * <p>Request a discount for the specified item.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Cancel Discount Request
		 *
		 * <p>Cancel a requested discount for the specified item.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Cancel Discount Request
		 *
		 * <p>Cancel a requested discount for the specified item.</p>
		 * @param itemId Item id.
		 */
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
	
		/**
		 * Get Custom Discounts
		 *
		 * <p>Get a list of custom discounts.</p>
		 */
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
	
		/**
		 * Get Custom Discounts
		 *
		 * <p>Get a list of custom discounts.</p>
		 */
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
	
		/**
		 * Create Custom Discount
		 *
		 * <p>Creates a new custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Custom Discount
		 *
		 * <p>Creates a new custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Edit Custom Discount
		 *
		 * <p>Edit an existing custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Edit Custom Discount
		 *
		 * <p>Edit an existing custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Custom Discount
		 *
		 * <p>Delete an existing custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Custom Discount
		 *
		 * <p>Delete an existing custom discount.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Fast Account Upload
		 *
		 * <p>Adds and checks the account for validity.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Fast Account Upload
		 *
		 * <p>Adds and checks the account for validity.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Add Account
		 *
		 * <p>Adds account on the market.
		 * 
		 * Required email login data categories:
		 * + 9 - Fortnite
		 * + 12 - Epic games
		 * + 18 - Escape from Tarkov</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Add Account
		 *
		 * <p>Adds account on the market.
		 * 
		 * Required email login data categories:
		 * + 9 - Fortnite
		 * + 12 - Epic games
		 * + 18 - Escape from Tarkov</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Check Account Details
		 *
		 * <p>Check and put up to sale not published account OR update account information existing account.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Check Account Details
		 *
		 * <p>Check and put up to sale not published account OR update account information existing account.
		 * 
		 * &gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Add an External Account
		 *
		 * <p>Check and add an external account to your item.
		 * 
		 * &gt; ❗️ Please note that if you're linking a Social Club account to Steam, it will update the last activity on your account (This is a limitation of Steam). If Social Club Games does not have a linked account, do not enter any data.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Add an External Account
		 *
		 * <p>Check and add an external account to your item.
		 * 
		 * &gt; ❗️ Please note that if you're linking a Social Club account to Steam, it will update the last activity on your account (This is a limitation of Steam). If Social Club Games does not have a linked account, do not enter any data.</p>
		 * @param itemId Item id.
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Invoice
		 *
		 * <p>Get invoice.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Invoice
		 *
		 * <p>Get invoice.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Create Invoice
		 *
		 * <p>Create invoice.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Invoice
		 *
		 * <p>Create invoice.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Invoice List
		 *
		 * <p>Get invoice list.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Invoice List
		 *
		 * <p>Get invoice list.
		 * 
		 * Required scopes:
		 * + **invoice**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Currency
		 *
		 * <p>Get currency list.</p>
		 */
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
	
		/**
		 * Get Currency
		 *
		 * <p>Get currency list.</p>
		 */
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
	
		/**
		 * Get List Of Balances
		 *
		 * <p>Returns list of balances.</p>
		 */
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
	
		/**
		 * Get List Of Balances
		 *
		 * <p>Returns list of balances.</p>
		 */
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
	
		/**
		 * Exchange Balance
		 *
		 * <p>Transfer funds from one balance to another.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Exchange Balance
		 *
		 * <p>Transfer funds from one balance to another.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Transfer Money
		 *
		 * <p>Transfer money to any user.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Transfer Money
		 *
		 * <p>Transfer money to any user.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Check Transfer Fee
		 *
		 * <p>Get transfer limits and get fee amount for transfer.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Check Transfer Fee
		 *
		 * <p>Get transfer limits and get fee amount for transfer.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Cancel Transfer
		 *
		 * <p>Cancels a transfer with a hold that was sent to your account.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Cancel Transfer
		 *
		 * <p>Cancels a transfer with a hold that was sent to your account.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Payments History
		 *
		 * <p>Displays list of your payments.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Payments History
		 *
		 * <p>Displays list of your payments.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param params Query parameters.
		 */
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
	
		/**
		 * Get Payout Services
		 *
		 * <p>Get a list of available payout services.</p>
		 */
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
	
		/**
		 * Get Payout Services
		 *
		 * <p>Get a list of available payout services.</p>
		 */
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
	
		/**
		 * Create Payout
		 *
		 * <p>Creates a payout request.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Payout
		 *
		 * <p>Creates a payout request.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Auto Payments
		 *
		 * <p>Get auto payments list.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 */
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
	
		/**
		 * Get Auto Payments
		 *
		 * <p>Get auto payments list.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 */
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
	
		/**
		 * Create Auto Payment
		 *
		 * <p>Creates auto payment.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create Auto Payment
		 *
		 * <p>Creates auto payment.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Auto Payment
		 *
		 * <p>Deletes an auto payment.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Auto Payment
		 *
		 * <p>Deletes an auto payment.
		 * 
		 * Required scopes:
		 * + **payment**</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Get Proxy
		 *
		 * <p>Gets your proxy list.</p>
		 */
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
	
		/**
		 * Get Proxy
		 *
		 * <p>Gets your proxy list.</p>
		 */
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
	
		/**
		 * Add Proxy
		 *
		 * <p>Add single proxy or proxy list.
		 * 
		 * 
		 * To add single proxy use this parameters:
		 * 
		 * 
		 * + **proxy_ip** (required) - proxy ip or host
		 * + **proxy_port** (required) - proxy port
		 * + **proxy_user** (optional) - proxy username
		 * + **proxy_pass** (optional) - proxy password
		 * 
		 * To add proxy list use this parameters:
		 * 
		 * 
		 * + **proxy_row** (required) - proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \n separator)</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Add Proxy
		 *
		 * <p>Add single proxy or proxy list.
		 * 
		 * 
		 * To add single proxy use this parameters:
		 * 
		 * 
		 * + **proxy_ip** (required) - proxy ip or host
		 * + **proxy_port** (required) - proxy port
		 * + **proxy_user** (optional) - proxy username
		 * + **proxy_pass** (optional) - proxy password
		 * 
		 * To add proxy list use this parameters:
		 * 
		 * 
		 * + **proxy_row** (required) - proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \n separator)</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Proxy
		 *
		 * <p>Delete single or all proxies.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete Proxy
		 *
		 * <p>Delete single or all proxies.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create IMAP Configuration
		 *
		 * <p>Create an IMAP configuration for a domain.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Create IMAP Configuration
		 *
		 * <p>Create an IMAP configuration for a domain.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete IMAP Configuration
		 *
		 * <p>Delete an IMAP configuration for a domain.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Delete IMAP Configuration
		 *
		 * <p>Delete an IMAP configuration for a domain.</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Batch
		 *
		 * <p>Execute multiple API requests at once (separated by comma). Maximum batch jobs is 10.
		 * Following methods are unavailable in Batch:
		 * - GET /{item_id}/image
		 * - /item/fast-sell</p>
		 * @param body Request body.
		 */
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
	
		/**
		 * Batch
		 *
		 * <p>Execute multiple API requests at once (separated by comma). Maximum batch jobs is 10.
		 * Following methods are unavailable in Batch:
		 * - GET /{item_id}/image
		 * - /item/fast-sell</p>
		 * @param body Request body.
		 */
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

	public static MarketClient create(String token) {
		return new MarketClient(ClientConfig.builder(token).build());
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
