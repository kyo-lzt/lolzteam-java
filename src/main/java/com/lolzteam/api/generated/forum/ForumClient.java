// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum;

import com.fasterxml.jackson.databind.JsonNode;
import com.lolzteam.api.runtime.ClientConfig;
import com.lolzteam.api.runtime.LolzteamHttpClient;
import com.lolzteam.api.runtime.RateLimitConfig;
import com.lolzteam.api.runtime.RequestOptions;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class OAuthApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	OAuthApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.OAuthApiTypes.OAuthTokenResponse token(Types.OAuthApiTypes.OAuthTokenBody body) {
		return new Types.OAuthApiTypes.OAuthTokenResponse(http.request(new RequestOptions(
			"POST",
			"/oauth/token",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.OAuthApiTypes.OAuthTokenResponse> tokenAsync(Types.OAuthApiTypes.OAuthTokenBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/oauth/token",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.OAuthApiTypes.OAuthTokenResponse::new);
	}
}

class AssetsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	AssetsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.AssetsApiTypes.AssetsCssResponse css(Types.AssetsApiTypes.AssetsCssParams params) {
		return new Types.AssetsApiTypes.AssetsCssResponse(http.request(new RequestOptions(
			"GET",
			"/css",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.AssetsApiTypes.AssetsCssResponse css() {
		return css(null);
	}

	public CompletableFuture<Types.AssetsApiTypes.AssetsCssResponse> cssAsync(Types.AssetsApiTypes.AssetsCssParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/css",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.AssetsApiTypes.AssetsCssResponse::new);
	}

	public CompletableFuture<Types.AssetsApiTypes.AssetsCssResponse> cssAsync() {
		return cssAsync(null);
	}
}

class CategoriesApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	CategoriesApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.CategoriesApiTypes.CategoriesListResponse list(Types.CategoriesApiTypes.CategoriesListParams params) {
		return new Types.CategoriesApiTypes.CategoriesListResponse(http.request(new RequestOptions(
			"GET",
			"/categories",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.CategoriesApiTypes.CategoriesListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.CategoriesApiTypes.CategoriesListResponse> listAsync(Types.CategoriesApiTypes.CategoriesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/categories",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CategoriesApiTypes.CategoriesListResponse::new);
	}

	public CompletableFuture<Types.CategoriesApiTypes.CategoriesListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.CategoriesApiTypes.CategoriesGetResponse get(Integer categoryId) {
		return new Types.CategoriesApiTypes.CategoriesGetResponse(http.request(new RequestOptions(
			"GET",
			"/categories/" + categoryId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.CategoriesApiTypes.CategoriesGetResponse> getAsync(Integer categoryId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/categories/" + categoryId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.CategoriesApiTypes.CategoriesGetResponse::new);
	}
}

class ForumsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ForumsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ForumsApiTypes.ForumsListResponse list(Types.ForumsApiTypes.ForumsListParams params) {
		return new Types.ForumsApiTypes.ForumsListResponse(http.request(new RequestOptions(
			"GET",
			"/forums",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ForumsApiTypes.ForumsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsListResponse> listAsync(Types.ForumsApiTypes.ForumsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsListResponse::new);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.ForumsApiTypes.ForumsGroupedResponse grouped() {
		return new Types.ForumsApiTypes.ForumsGroupedResponse(http.request(new RequestOptions(
			"GET",
			"/forums/grouped",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsGroupedResponse> groupedAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/grouped",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsGroupedResponse::new);
	}

	public Types.ForumsApiTypes.ForumsGetResponse get(Integer forumId) {
		return new Types.ForumsApiTypes.ForumsGetResponse(http.request(new RequestOptions(
			"GET",
			"/forums/" + forumId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsGetResponse> getAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/" + forumId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsGetResponse::new);
	}

	public Types.ForumsApiTypes.ForumsFollowersResponse followers(Integer forumId) {
		return new Types.ForumsApiTypes.ForumsFollowersResponse(http.request(new RequestOptions(
			"GET",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsFollowersResponse> followersAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsFollowersResponse::new);
	}

	public Types.ForumsApiTypes.ForumsFollowResponse follow(Integer forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
		return new Types.ForumsApiTypes.ForumsFollowResponse(http.request(new RequestOptions(
			"POST",
			"/forums/" + forumId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ForumsApiTypes.ForumsFollowResponse follow(Integer forumId) {
		return follow(forumId, null);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsFollowResponse> followAsync(Integer forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/forums/" + forumId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsFollowResponse::new);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsFollowResponse> followAsync(Integer forumId) {
		return followAsync(forumId, null);
	}

	public Types.ForumsApiTypes.ForumsUnfollowResponse unfollow(Integer forumId) {
		return new Types.ForumsApiTypes.ForumsUnfollowResponse(http.request(new RequestOptions(
			"DELETE",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsUnfollowResponse> unfollowAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsUnfollowResponse::new);
	}

	public Types.ForumsApiTypes.ForumsFollowedResponse followed(Types.ForumsApiTypes.ForumsFollowedParams params) {
		return new Types.ForumsApiTypes.ForumsFollowedResponse(http.request(new RequestOptions(
			"GET",
			"/forums/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ForumsApiTypes.ForumsFollowedResponse followed() {
		return followed(null);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsFollowedResponse> followedAsync(Types.ForumsApiTypes.ForumsFollowedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsFollowedResponse::new);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsFollowedResponse> followedAsync() {
		return followedAsync(null);
	}

	public Types.ForumsApiTypes.ForumsGetFeedOptionsResponse getFeedOptions() {
		return new Types.ForumsApiTypes.ForumsGetFeedOptionsResponse(http.request(new RequestOptions(
			"GET",
			"/forums/feed/options",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsGetFeedOptionsResponse> getFeedOptionsAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/feed/options",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsGetFeedOptionsResponse::new);
	}

	public Types.ForumsApiTypes.ForumsEditFeedOptionsResponse editFeedOptions(Types.ForumsApiTypes.ForumsEditFeedOptionsBody body) {
		return new Types.ForumsApiTypes.ForumsEditFeedOptionsResponse(http.request(new RequestOptions(
			"PUT",
			"/forums/feed/options",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ForumsApiTypes.ForumsEditFeedOptionsResponse editFeedOptions() {
		return editFeedOptions(null);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsEditFeedOptionsResponse> editFeedOptionsAsync(Types.ForumsApiTypes.ForumsEditFeedOptionsBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/forums/feed/options",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ForumsApiTypes.ForumsEditFeedOptionsResponse::new);
	}

	public CompletableFuture<Types.ForumsApiTypes.ForumsEditFeedOptionsResponse> editFeedOptionsAsync() {
		return editFeedOptionsAsync(null);
	}
}

class LinksApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	LinksApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.LinksApiTypes.LinksListResponse list() {
		return new Types.LinksApiTypes.LinksListResponse(http.request(new RequestOptions(
			"GET",
			"/link-forums",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.LinksApiTypes.LinksListResponse> listAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/link-forums",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.LinksApiTypes.LinksListResponse::new);
	}

	public Types.LinksApiTypes.LinksGetResponse get(Integer linkId) {
		return new Types.LinksApiTypes.LinksGetResponse(http.request(new RequestOptions(
			"GET",
			"/link-forums/" + linkId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.LinksApiTypes.LinksGetResponse> getAsync(Integer linkId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/link-forums/" + linkId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.LinksApiTypes.LinksGetResponse::new);
	}
}

class PagesApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PagesApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.PagesApiTypes.PagesListResponse list(Types.PagesApiTypes.PagesListParams params) {
		return new Types.PagesApiTypes.PagesListResponse(http.request(new RequestOptions(
			"GET",
			"/pages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PagesApiTypes.PagesListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.PagesApiTypes.PagesListResponse> listAsync(Types.PagesApiTypes.PagesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/pages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PagesApiTypes.PagesListResponse::new);
	}

	public CompletableFuture<Types.PagesApiTypes.PagesListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.PagesApiTypes.PagesGetResponse get(Integer pageId) {
		return new Types.PagesApiTypes.PagesGetResponse(http.request(new RequestOptions(
			"GET",
			"/pages/" + pageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PagesApiTypes.PagesGetResponse> getAsync(Integer pageId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/pages/" + pageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PagesApiTypes.PagesGetResponse::new);
	}
}

class NavigationApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	NavigationApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.NavigationApiTypes.NavigationListResponse list(Types.NavigationApiTypes.NavigationListParams params) {
		return new Types.NavigationApiTypes.NavigationListResponse(http.request(new RequestOptions(
			"GET",
			"/navigation",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.NavigationApiTypes.NavigationListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.NavigationApiTypes.NavigationListResponse> listAsync(Types.NavigationApiTypes.NavigationListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/navigation",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.NavigationApiTypes.NavigationListResponse::new);
	}

	public CompletableFuture<Types.NavigationApiTypes.NavigationListResponse> listAsync() {
		return listAsync(null);
	}
}

class ThreadsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ThreadsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ThreadsApiTypes.ThreadsListResponse list(Types.ThreadsApiTypes.ThreadsListParams params) {
		return new Types.ThreadsApiTypes.ThreadsListResponse(http.request(new RequestOptions(
			"GET",
			"/threads",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsListResponse> listAsync(Types.ThreadsApiTypes.ThreadsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsListResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsCreateResponse create(Types.ThreadsApiTypes.ThreadsCreateBody body) {
		return new Types.ThreadsApiTypes.ThreadsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsCreateResponse> createAsync(Types.ThreadsApiTypes.ThreadsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsCreateResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsCreateContestResponse createContest(Types.ThreadsApiTypes.ThreadsCreateContestBody body) {
		return new Types.ThreadsApiTypes.ThreadsCreateContestResponse(http.request(new RequestOptions(
			"POST",
			"/contests",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsCreateContestResponse> createContestAsync(Types.ThreadsApiTypes.ThreadsCreateContestBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/contests",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsCreateContestResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsClaimResponse claim(Types.ThreadsApiTypes.ThreadsClaimBody body) {
		return new Types.ThreadsApiTypes.ThreadsClaimResponse(http.request(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsClaimResponse claim() {
		return claim(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsClaimResponse> claimAsync(Types.ThreadsApiTypes.ThreadsClaimBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/claims",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsClaimResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsClaimResponse> claimAsync() {
		return claimAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsGetResponse get(Integer threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
		return new Types.ThreadsApiTypes.ThreadsGetResponse(http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsGetResponse get(Integer threadId) {
		return get(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsGetResponse> getAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsGetResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsGetResponse> getAsync(Integer threadId) {
		return getAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsEditResponse edit(Integer threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
		return new Types.ThreadsApiTypes.ThreadsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsEditResponse edit(Integer threadId) {
		return edit(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsEditResponse> editAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsEditResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsEditResponse> editAsync(Integer threadId) {
		return editAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsDeleteResponse delete(Integer threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
		return new Types.ThreadsApiTypes.ThreadsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsDeleteResponse delete(Integer threadId) {
		return delete(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsDeleteResponse> deleteAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsDeleteResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsDeleteResponse> deleteAsync(Integer threadId) {
		return deleteAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsMoveResponse move(Integer threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
		return new Types.ThreadsApiTypes.ThreadsMoveResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/move",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsMoveResponse move(Integer threadId) {
		return move(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsMoveResponse> moveAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/move",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsMoveResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsMoveResponse> moveAsync(Integer threadId) {
		return moveAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsBumpResponse bump(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsBumpResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsBumpResponse> bumpAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsBumpResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsHideResponse hide(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsHideResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/hide",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsHideResponse> hideAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/hide",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsHideResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsStarResponse star(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsStarResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsStarResponse> starAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsStarResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsUnstarResponse unstar(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsUnstarResponse(http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnstarResponse> unstarAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsUnstarResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsFollowersResponse followers(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsFollowersResponse(http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowersResponse> followersAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsFollowersResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsFollowResponse follow(Integer threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
		return new Types.ThreadsApiTypes.ThreadsFollowResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsFollowResponse follow(Integer threadId) {
		return follow(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowResponse> followAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsFollowResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowResponse> followAsync(Integer threadId) {
		return followAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsUnfollowResponse unfollow(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsUnfollowResponse(http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnfollowResponse> unfollowAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsUnfollowResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsFollowedResponse followed(Types.ThreadsApiTypes.ThreadsFollowedParams params) {
		return new Types.ThreadsApiTypes.ThreadsFollowedResponse(http.request(new RequestOptions(
			"GET",
			"/threads/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsFollowedResponse followed() {
		return followed(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowedResponse> followedAsync(Types.ThreadsApiTypes.ThreadsFollowedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsFollowedResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowedResponse> followedAsync() {
		return followedAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsNavigationResponse navigation(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsNavigationResponse(http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/navigation",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsNavigationResponse> navigationAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/navigation",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsNavigationResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsPollGetResponse pollGet(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsPollGetResponse(http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/poll",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollGetResponse> pollGetAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/poll",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsPollGetResponse::new);
	}

	public Types.ThreadsApiTypes.ThreadsPollVoteResponse pollVote(Integer threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
		return new Types.ThreadsApiTypes.ThreadsPollVoteResponse(http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/poll/votes",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsPollVoteResponse pollVote(Integer threadId) {
		return pollVote(threadId, null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollVoteResponse> pollVoteAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/poll/votes",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsPollVoteResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollVoteResponse> pollVoteAsync(Integer threadId) {
		return pollVoteAsync(threadId, null);
	}

	public Types.ThreadsApiTypes.ThreadsUnreadResponse unread(Types.ThreadsApiTypes.ThreadsUnreadParams params) {
		return new Types.ThreadsApiTypes.ThreadsUnreadResponse(http.request(new RequestOptions(
			"GET",
			"/threads/new",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsUnreadResponse unread() {
		return unread(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnreadResponse> unreadAsync(Types.ThreadsApiTypes.ThreadsUnreadParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/new",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsUnreadResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnreadResponse> unreadAsync() {
		return unreadAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsRecentResponse recent(Types.ThreadsApiTypes.ThreadsRecentParams params) {
		return new Types.ThreadsApiTypes.ThreadsRecentResponse(http.request(new RequestOptions(
			"GET",
			"/threads/recent",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ThreadsApiTypes.ThreadsRecentResponse recent() {
		return recent(null);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsRecentResponse> recentAsync(Types.ThreadsApiTypes.ThreadsRecentParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/recent",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsRecentResponse::new);
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsRecentResponse> recentAsync() {
		return recentAsync(null);
	}

	public Types.ThreadsApiTypes.ThreadsFinishResponse finish(Integer threadId) {
		return new Types.ThreadsApiTypes.ThreadsFinishResponse(http.request(new RequestOptions(
			"POST",
			"/contests/" + threadId + "/finish",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ThreadsApiTypes.ThreadsFinishResponse> finishAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/contests/" + threadId + "/finish",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ThreadsApiTypes.ThreadsFinishResponse::new);
	}
}

class PostsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PostsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.PostsApiTypes.PostsListResponse list(Types.PostsApiTypes.PostsListParams params) {
		return new Types.PostsApiTypes.PostsListResponse(http.request(new RequestOptions(
			"GET",
			"/posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsListResponse> listAsync(Types.PostsApiTypes.PostsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsListResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.PostsApiTypes.PostsCreateResponse create(Types.PostsApiTypes.PostsCreateBody body) {
		return new Types.PostsApiTypes.PostsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCreateResponse> createAsync(Types.PostsApiTypes.PostsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCreateResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.PostsApiTypes.PostsGetResponse get(Integer postId) {
		return new Types.PostsApiTypes.PostsGetResponse(http.request(new RequestOptions(
			"GET",
			"/posts/" + postId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PostsApiTypes.PostsGetResponse> getAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsGetResponse::new);
	}

	public Types.PostsApiTypes.PostsEditResponse edit(Integer postId, Types.PostsApiTypes.PostsEditBody body) {
		return new Types.PostsApiTypes.PostsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsEditResponse edit(Integer postId) {
		return edit(postId, null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsEditResponse> editAsync(Integer postId, Types.PostsApiTypes.PostsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsEditResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsEditResponse> editAsync(Integer postId) {
		return editAsync(postId, null);
	}

	public Types.PostsApiTypes.PostsDeleteResponse delete(Integer postId, Types.PostsApiTypes.PostsDeleteBody body) {
		return new Types.PostsApiTypes.PostsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsDeleteResponse delete(Integer postId) {
		return delete(postId, null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsDeleteResponse> deleteAsync(Integer postId, Types.PostsApiTypes.PostsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsDeleteResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsDeleteResponse> deleteAsync(Integer postId) {
		return deleteAsync(postId, null);
	}

	public Types.PostsApiTypes.PostsLikesResponse likes(Integer postId, Types.PostsApiTypes.PostsLikesParams params) {
		return new Types.PostsApiTypes.PostsLikesResponse(http.request(new RequestOptions(
			"GET",
			"/posts/" + postId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsLikesResponse likes(Integer postId) {
		return likes(postId, null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsLikesResponse> likesAsync(Integer postId, Types.PostsApiTypes.PostsLikesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsLikesResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsLikesResponse> likesAsync(Integer postId) {
		return likesAsync(postId, null);
	}

	public Types.PostsApiTypes.PostsLikeResponse like(Integer postId) {
		return new Types.PostsApiTypes.PostsLikeResponse(http.request(new RequestOptions(
			"POST",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PostsApiTypes.PostsLikeResponse> likeAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsLikeResponse::new);
	}

	public Types.PostsApiTypes.PostsUnlikeResponse unlike(Integer postId) {
		return new Types.PostsApiTypes.PostsUnlikeResponse(http.request(new RequestOptions(
			"DELETE",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PostsApiTypes.PostsUnlikeResponse> unlikeAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsUnlikeResponse::new);
	}

	public Types.PostsApiTypes.PostsReportReasonsResponse reportReasons(Integer postId) {
		return new Types.PostsApiTypes.PostsReportReasonsResponse(http.request(new RequestOptions(
			"GET",
			"/posts/" + postId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.PostsApiTypes.PostsReportReasonsResponse> reportReasonsAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsReportReasonsResponse::new);
	}

	public Types.PostsApiTypes.PostsReportResponse report(Integer postId, Types.PostsApiTypes.PostsReportBody body) {
		return new Types.PostsApiTypes.PostsReportResponse(http.request(new RequestOptions(
			"POST",
			"/posts/" + postId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsReportResponse report(Integer postId) {
		return report(postId, null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsReportResponse> reportAsync(Integer postId, Types.PostsApiTypes.PostsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/" + postId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsReportResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsReportResponse> reportAsync(Integer postId) {
		return reportAsync(postId, null);
	}

	public Types.PostsApiTypes.PostsCommentsGetResponse commentsGet(Types.PostsApiTypes.PostsCommentsGetParams params) {
		return new Types.PostsApiTypes.PostsCommentsGetResponse(http.request(new RequestOptions(
			"GET",
			"/posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCommentsGetResponse commentsGet() {
		return commentsGet(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsGetResponse> commentsGetAsync(Types.PostsApiTypes.PostsCommentsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCommentsGetResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsGetResponse> commentsGetAsync() {
		return commentsGetAsync(null);
	}

	public Types.PostsApiTypes.PostsCommentsCreateResponse commentsCreate(Types.PostsApiTypes.PostsCommentsCreateBody body) {
		return new Types.PostsApiTypes.PostsCommentsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCommentsCreateResponse commentsCreate() {
		return commentsCreate(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsCreateResponse> commentsCreateAsync(Types.PostsApiTypes.PostsCommentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCommentsCreateResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsCreateResponse> commentsCreateAsync() {
		return commentsCreateAsync(null);
	}

	public Types.PostsApiTypes.PostsCommentsEditResponse commentsEdit(Types.PostsApiTypes.PostsCommentsEditBody body) {
		return new Types.PostsApiTypes.PostsCommentsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCommentsEditResponse commentsEdit() {
		return commentsEdit(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsEditResponse> commentsEditAsync(Types.PostsApiTypes.PostsCommentsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCommentsEditResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsEditResponse> commentsEditAsync() {
		return commentsEditAsync(null);
	}

	public Types.PostsApiTypes.PostsCommentsDeleteResponse commentsDelete(Types.PostsApiTypes.PostsCommentsDeleteBody body) {
		return new Types.PostsApiTypes.PostsCommentsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCommentsDeleteResponse commentsDelete() {
		return commentsDelete(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsDeleteResponse> commentsDeleteAsync(Types.PostsApiTypes.PostsCommentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCommentsDeleteResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsDeleteResponse> commentsDeleteAsync() {
		return commentsDeleteAsync(null);
	}

	public Types.PostsApiTypes.PostsCommentsReportResponse commentsReport(Types.PostsApiTypes.PostsCommentsReportBody body) {
		return new Types.PostsApiTypes.PostsCommentsReportResponse(http.request(new RequestOptions(
			"POST",
			"/posts/comments/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.PostsApiTypes.PostsCommentsReportResponse commentsReport() {
		return commentsReport(null);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsReportResponse> commentsReportAsync(Types.PostsApiTypes.PostsCommentsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/comments/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.PostsApiTypes.PostsCommentsReportResponse::new);
	}

	public CompletableFuture<Types.PostsApiTypes.PostsCommentsReportResponse> commentsReportAsync() {
		return commentsReportAsync(null);
	}
}

class UsersApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	UsersApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.UsersApiTypes.UsersListResponse list(Types.UsersApiTypes.UsersListParams params) {
		return new Types.UsersApiTypes.UsersListResponse(http.request(new RequestOptions(
			"GET",
			"/users",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersListResponse> listAsync(Types.UsersApiTypes.UsersListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersListResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.UsersApiTypes.UsersFieldsResponse fields() {
		return new Types.UsersApiTypes.UsersFieldsResponse(http.request(new RequestOptions(
			"GET",
			"/users/fields",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFieldsResponse> fieldsAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/fields",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersFieldsResponse::new);
	}

	public Types.UsersApiTypes.UsersFindResponse find(Types.UsersApiTypes.UsersFindParams params) {
		return new Types.UsersApiTypes.UsersFindResponse(http.request(new RequestOptions(
			"GET",
			"/users/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersFindResponse find() {
		return find(null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFindResponse> findAsync(Types.UsersApiTypes.UsersFindParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersFindResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFindResponse> findAsync() {
		return findAsync(null);
	}

	public Types.UsersApiTypes.UsersGetResponse get(JsonNode userId, Types.UsersApiTypes.UsersGetParams params) {
		return new Types.UsersApiTypes.UsersGetResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersGetResponse get(JsonNode userId) {
		return get(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersGetResponse> getAsync(JsonNode userId, Types.UsersApiTypes.UsersGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersGetResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersGetResponse> getAsync(JsonNode userId) {
		return getAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersEditResponse edit(JsonNode userId, Types.UsersApiTypes.UsersEditBody body) {
		return new Types.UsersApiTypes.UsersEditResponse(http.request(new RequestOptions(
			"PUT",
			"/users/" + userId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersEditResponse edit(JsonNode userId) {
		return edit(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersEditResponse> editAsync(JsonNode userId, Types.UsersApiTypes.UsersEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/users/" + userId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersEditResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersEditResponse> editAsync(JsonNode userId) {
		return editAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersClaimsResponse claims(JsonNode userId, Types.UsersApiTypes.UsersClaimsParams params) {
		return new Types.UsersApiTypes.UsersClaimsResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersClaimsResponse claims(JsonNode userId) {
		return claims(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersClaimsResponse> claimsAsync(JsonNode userId, Types.UsersApiTypes.UsersClaimsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersClaimsResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersClaimsResponse> claimsAsync(JsonNode userId) {
		return claimsAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersAvatarUploadResponse avatarUpload(JsonNode userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("avatar", body.avatar());
			return new Types.UsersApiTypes.UsersAvatarUploadResponse(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				/* isSearch */ false
			)));
		} else {
			return new Types.UsersApiTypes.UsersAvatarUploadResponse(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				/* isSearch */ false
			)));
		}
	}

	public Types.UsersApiTypes.UsersAvatarUploadResponse avatarUpload(JsonNode userId) {
		return avatarUpload(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersAvatarUploadResponse> avatarUploadAsync(JsonNode userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("avatar", body.avatar());
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				/* isSearch */ false
			)).thenApply(Types.UsersApiTypes.UsersAvatarUploadResponse::new);
		} else {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(Types.UsersApiTypes.UsersAvatarUploadResponse::new);
		}
	}

	public CompletableFuture<Types.UsersApiTypes.UsersAvatarUploadResponse> avatarUploadAsync(JsonNode userId) {
		return avatarUploadAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersAvatarDeleteResponse avatarDelete(JsonNode userId) {
		return new Types.UsersApiTypes.UsersAvatarDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/avatar",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersAvatarDeleteResponse> avatarDeleteAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/avatar",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersAvatarDeleteResponse::new);
	}

	public Types.UsersApiTypes.UsersAvatarCropResponse avatarCrop(JsonNode userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
		return new Types.UsersApiTypes.UsersAvatarCropResponse(http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/avatar/crop",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersAvatarCropResponse avatarCrop(JsonNode userId) {
		return avatarCrop(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersAvatarCropResponse> avatarCropAsync(JsonNode userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/avatar/crop",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersAvatarCropResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersAvatarCropResponse> avatarCropAsync(JsonNode userId) {
		return avatarCropAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersBackgroundUploadResponse backgroundUpload(JsonNode userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("background", body.background());
			return new Types.UsersApiTypes.UsersBackgroundUploadResponse(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				/* isSearch */ false
			)));
		} else {
			return new Types.UsersApiTypes.UsersBackgroundUploadResponse(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				/* isSearch */ false
			)));
		}
	}

	public Types.UsersApiTypes.UsersBackgroundUploadResponse backgroundUpload(JsonNode userId) {
		return backgroundUpload(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersBackgroundUploadResponse> backgroundUploadAsync(JsonNode userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("background", body.background());
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				/* isSearch */ false
			)).thenApply(Types.UsersApiTypes.UsersBackgroundUploadResponse::new);
		} else {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(Types.UsersApiTypes.UsersBackgroundUploadResponse::new);
		}
	}

	public CompletableFuture<Types.UsersApiTypes.UsersBackgroundUploadResponse> backgroundUploadAsync(JsonNode userId) {
		return backgroundUploadAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersBackgroundDeleteResponse backgroundDelete(JsonNode userId) {
		return new Types.UsersApiTypes.UsersBackgroundDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/background",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersBackgroundDeleteResponse> backgroundDeleteAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/background",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersBackgroundDeleteResponse::new);
	}

	public Types.UsersApiTypes.UsersBackgroundCropResponse backgroundCrop(JsonNode userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
		return new Types.UsersApiTypes.UsersBackgroundCropResponse(http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/background/crop",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersBackgroundCropResponse> backgroundCropAsync(JsonNode userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/background/crop",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersBackgroundCropResponse::new);
	}

	public Types.UsersApiTypes.UsersFollowersResponse followers(JsonNode userId, Types.UsersApiTypes.UsersFollowersParams params) {
		return new Types.UsersApiTypes.UsersFollowersResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/followers",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersFollowersResponse followers(JsonNode userId) {
		return followers(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFollowersResponse> followersAsync(JsonNode userId, Types.UsersApiTypes.UsersFollowersParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/followers",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersFollowersResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFollowersResponse> followersAsync(JsonNode userId) {
		return followersAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersFollowResponse follow(JsonNode userId) {
		return new Types.UsersApiTypes.UsersFollowResponse(http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFollowResponse> followAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersFollowResponse::new);
	}

	public Types.UsersApiTypes.UsersUnfollowResponse unfollow(JsonNode userId) {
		return new Types.UsersApiTypes.UsersUnfollowResponse(http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersUnfollowResponse> unfollowAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersUnfollowResponse::new);
	}

	public Types.UsersApiTypes.UsersFollowingsResponse followings(JsonNode userId, Types.UsersApiTypes.UsersFollowingsParams params) {
		return new Types.UsersApiTypes.UsersFollowingsResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/followings",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersFollowingsResponse followings(JsonNode userId) {
		return followings(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFollowingsResponse> followingsAsync(JsonNode userId, Types.UsersApiTypes.UsersFollowingsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/followings",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersFollowingsResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersFollowingsResponse> followingsAsync(JsonNode userId) {
		return followingsAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersLikesResponse likes(JsonNode userId, Types.UsersApiTypes.UsersLikesParams params) {
		return new Types.UsersApiTypes.UsersLikesResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersLikesResponse likes(JsonNode userId) {
		return likes(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersLikesResponse> likesAsync(JsonNode userId, Types.UsersApiTypes.UsersLikesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersLikesResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersLikesResponse> likesAsync(JsonNode userId) {
		return likesAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersIgnoredResponse ignored(Types.UsersApiTypes.UsersIgnoredParams params) {
		return new Types.UsersApiTypes.UsersIgnoredResponse(http.request(new RequestOptions(
			"GET",
			"/users/ignored",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersIgnoredResponse ignored() {
		return ignored(null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersIgnoredResponse> ignoredAsync(Types.UsersApiTypes.UsersIgnoredParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/ignored",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersIgnoredResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersIgnoredResponse> ignoredAsync() {
		return ignoredAsync(null);
	}

	public Types.UsersApiTypes.UsersIgnoreResponse ignore(JsonNode userId) {
		return new Types.UsersApiTypes.UsersIgnoreResponse(http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersIgnoreResponse> ignoreAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersIgnoreResponse::new);
	}

	public Types.UsersApiTypes.UsersIgnoreEditResponse ignoreEdit(JsonNode userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
		return new Types.UsersApiTypes.UsersIgnoreEditResponse(http.request(new RequestOptions(
			"PUT",
			"/users/" + userId + "/ignore",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersIgnoreEditResponse ignoreEdit(JsonNode userId) {
		return ignoreEdit(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersIgnoreEditResponse> ignoreEditAsync(JsonNode userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/users/" + userId + "/ignore",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersIgnoreEditResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersIgnoreEditResponse> ignoreEditAsync(JsonNode userId) {
		return ignoreEditAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersUnignoreResponse unignore(JsonNode userId) {
		return new Types.UsersApiTypes.UsersUnignoreResponse(http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersUnignoreResponse> unignoreAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersUnignoreResponse::new);
	}

	public Types.UsersApiTypes.UsersContentsResponse contents(JsonNode userId, Types.UsersApiTypes.UsersContentsParams params) {
		return new Types.UsersApiTypes.UsersContentsResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/timeline",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.UsersApiTypes.UsersContentsResponse contents(JsonNode userId) {
		return contents(userId, null);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersContentsResponse> contentsAsync(JsonNode userId, Types.UsersApiTypes.UsersContentsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/timeline",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersContentsResponse::new);
	}

	public CompletableFuture<Types.UsersApiTypes.UsersContentsResponse> contentsAsync(JsonNode userId) {
		return contentsAsync(userId, null);
	}

	public Types.UsersApiTypes.UsersTrophiesResponse trophies(JsonNode userId) {
		return new Types.UsersApiTypes.UsersTrophiesResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/trophies",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersTrophiesResponse> trophiesAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/trophies",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersTrophiesResponse::new);
	}

	public Types.UsersApiTypes.UsersSecretAnswerTypesResponse secretAnswerTypes() {
		return new Types.UsersApiTypes.UsersSecretAnswerTypesResponse(http.request(new RequestOptions(
			"GET",
			"/users/secret-answer/types",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersSecretAnswerTypesResponse> secretAnswerTypesAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/secret-answer/types",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersSecretAnswerTypesResponse::new);
	}

	public Types.UsersApiTypes.UsersSaResetResponse saReset() {
		return new Types.UsersApiTypes.UsersSaResetResponse(http.request(new RequestOptions(
			"POST",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersSaResetResponse> saResetAsync() {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersSaResetResponse::new);
	}

	public Types.UsersApiTypes.UsersSaCancelResetResponse saCancelReset() {
		return new Types.UsersApiTypes.UsersSaCancelResetResponse(http.request(new RequestOptions(
			"DELETE",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.UsersApiTypes.UsersSaCancelResetResponse> saCancelResetAsync() {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.UsersApiTypes.UsersSaCancelResetResponse::new);
	}
}

class ProfilePostsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ProfilePostsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ProfilePostsApiTypes.ProfilePostsListResponse list(JsonNode userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
		return new Types.ProfilePostsApiTypes.ProfilePostsListResponse(http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/profile-posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsListResponse list(JsonNode userId) {
		return list(userId, null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsListResponse> listAsync(JsonNode userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/profile-posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsListResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsListResponse> listAsync(JsonNode userId) {
		return listAsync(userId, null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsGetResponse get(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsGetResponse(http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsGetResponse> getAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsGetResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsEditResponse edit(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/profile-posts/" + profilePostId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsEditResponse edit(Integer profilePostId) {
		return edit(profilePostId, null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsEditResponse> editAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/profile-posts/" + profilePostId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsEditResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsEditResponse> editAsync(Integer profilePostId) {
		return editAsync(profilePostId, null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse delete(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
		return new Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse delete(Integer profilePostId) {
		return delete(profilePostId, null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse> deleteAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse> deleteAsync(Integer profilePostId) {
		return deleteAsync(profilePostId, null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse reportReasons(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse(http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse> reportReasonsAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsReportResponse report(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsReportResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsReportResponse report(Integer profilePostId) {
		return report(profilePostId, null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportResponse> reportAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsReportResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportResponse> reportAsync(Integer profilePostId) {
		return reportAsync(profilePostId, null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCreateResponse create(Types.ProfilePostsApiTypes.ProfilePostsCreateBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCreateResponse> createAsync(Types.ProfilePostsApiTypes.ProfilePostsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCreateResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsStickResponse stick(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsStickResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsStickResponse> stickAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsStickResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse unstick(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse(http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse> unstickAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsLikesResponse likes(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsLikesResponse(http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsLikesResponse> likesAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsLikesResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsLikeResponse like(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsLikeResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsLikeResponse> likeAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsLikeResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse unlike(Integer profilePostId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse(http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse> unlikeAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse commentsList(Types.ProfilePostsApiTypes.ProfilePostsCommentsListParams params) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse(http.request(new RequestOptions(
			"GET",
			"/profile-posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse commentsList() {
		return commentsList(null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse> commentsListAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse> commentsListAsync() {
		return commentsListAsync(null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse commentsCreate(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse commentsCreate() {
		return commentsCreate(null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse> commentsCreateAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse> commentsCreateAsync() {
		return commentsCreateAsync(null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse commentsEdit(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse(http.request(new RequestOptions(
			"PUT",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse commentsEdit() {
		return commentsEdit(null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse> commentsEditAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse> commentsEditAsync() {
		return commentsEditAsync(null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse commentsDelete(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse commentsDelete() {
		return commentsDelete(null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse> commentsDeleteAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse> commentsDeleteAsync() {
		return commentsDeleteAsync(null);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse commentsGet(Integer profilePostId, Integer commentId) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse(http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/comments/" + commentId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse> commentsGetAsync(Integer profilePostId, Integer commentId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/comments/" + commentId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse::new);
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse commentsReport(Integer commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
		return new Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse(http.request(new RequestOptions(
			"POST",
			"/profile-posts/comments/" + commentId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse commentsReport(Integer commentId) {
		return commentsReport(commentId, null);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse> commentsReportAsync(Integer commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/comments/" + commentId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse::new);
	}

	public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse> commentsReportAsync(Integer commentId) {
		return commentsReportAsync(commentId, null);
	}
}

class ConversationsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ConversationsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ConversationsApiTypes.ConversationsListResponse list(Types.ConversationsApiTypes.ConversationsListParams params) {
		return new Types.ConversationsApiTypes.ConversationsListResponse(http.request(new RequestOptions(
			"GET",
			"/conversations",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsListResponse> listAsync(Types.ConversationsApiTypes.ConversationsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsListResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsCreateResponse create(Types.ConversationsApiTypes.ConversationsCreateBody body) {
		return new Types.ConversationsApiTypes.ConversationsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsCreateResponse> createAsync(Types.ConversationsApiTypes.ConversationsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsCreateResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsCreateResponse> createAsync() {
		return createAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsUpdateResponse update(Types.ConversationsApiTypes.ConversationsUpdateBody body) {
		return new Types.ConversationsApiTypes.ConversationsUpdateResponse(http.request(new RequestOptions(
			"PUT",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsUpdateResponse update() {
		return update(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsUpdateResponse> updateAsync(Types.ConversationsApiTypes.ConversationsUpdateBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsUpdateResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsUpdateResponse> updateAsync() {
		return updateAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsDeleteResponse delete(Types.ConversationsApiTypes.ConversationsDeleteBody body) {
		return new Types.ConversationsApiTypes.ConversationsDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsDeleteResponse delete() {
		return delete(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsDeleteResponse> deleteAsync(Types.ConversationsApiTypes.ConversationsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsDeleteResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsDeleteResponse> deleteAsync() {
		return deleteAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsStartResponse start(Types.ConversationsApiTypes.ConversationsStartBody body) {
		return new Types.ConversationsApiTypes.ConversationsStartResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/start",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsStartResponse start() {
		return start(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsStartResponse> startAsync(Types.ConversationsApiTypes.ConversationsStartBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/start",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsStartResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsStartResponse> startAsync() {
		return startAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsSaveResponse save(Types.ConversationsApiTypes.ConversationsSaveBody body) {
		return new Types.ConversationsApiTypes.ConversationsSaveResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsSaveResponse save() {
		return save(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsSaveResponse> saveAsync(Types.ConversationsApiTypes.ConversationsSaveBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsSaveResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsSaveResponse> saveAsync() {
		return saveAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsGetResponse get(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsGetResponse(http.request(new RequestOptions(
			"GET",
			"/conversations/" + conversationId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsGetResponse> getAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/" + conversationId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsGetResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesListResponse messagesList(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
		return new Types.ConversationsApiTypes.ConversationsMessagesListResponse(http.request(new RequestOptions(
			"GET",
			"/conversations/" + conversationId + "/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsMessagesListResponse messagesList(Integer conversationId) {
		return messagesList(conversationId, null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesListResponse> messagesListAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/" + conversationId + "/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesListResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesListResponse> messagesListAsync(Integer conversationId) {
		return messagesListAsync(conversationId, null);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesCreateResponse messagesCreate(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
		return new Types.ConversationsApiTypes.ConversationsMessagesCreateResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsMessagesCreateResponse messagesCreate(Integer conversationId) {
		return messagesCreate(conversationId, null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesCreateResponse> messagesCreateAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesCreateResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesCreateResponse> messagesCreateAsync(Integer conversationId) {
		return messagesCreateAsync(conversationId, null);
	}

	public Types.ConversationsApiTypes.ConversationsSearchResponse search(Types.ConversationsApiTypes.ConversationsSearchBody body) {
		return new Types.ConversationsApiTypes.ConversationsSearchResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsSearchResponse search() {
		return search(null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsSearchResponse> searchAsync(Types.ConversationsApiTypes.ConversationsSearchBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsSearchResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsSearchResponse> searchAsync() {
		return searchAsync(null);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesGetResponse messagesGet(Integer messageId) {
		return new Types.ConversationsApiTypes.ConversationsMessagesGetResponse(http.request(new RequestOptions(
			"GET",
			"/conversations/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesGetResponse> messagesGetAsync(Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesGetResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesEditResponse messagesEdit(Integer conversationId, Integer messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
		return new Types.ConversationsApiTypes.ConversationsMessagesEditResponse(http.request(new RequestOptions(
			"PUT",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsMessagesEditResponse messagesEdit(Integer conversationId, Integer messageId) {
		return messagesEdit(conversationId, messageId, null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesEditResponse> messagesEditAsync(Integer conversationId, Integer messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesEditResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesEditResponse> messagesEditAsync(Integer conversationId, Integer messageId) {
		return messagesEditAsync(conversationId, messageId, null);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse messagesDelete(Integer conversationId, Integer messageId) {
		return new Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse(http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse> messagesDeleteAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsInviteResponse invite(Integer conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
		return new Types.ConversationsApiTypes.ConversationsInviteResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/invite",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsInviteResponse invite(Integer conversationId) {
		return invite(conversationId, null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsInviteResponse> inviteAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/invite",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsInviteResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsInviteResponse> inviteAsync(Integer conversationId) {
		return inviteAsync(conversationId, null);
	}

	public Types.ConversationsApiTypes.ConversationsKickResponse kick(Integer conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
		return new Types.ConversationsApiTypes.ConversationsKickResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/kick",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ConversationsApiTypes.ConversationsKickResponse kick(Integer conversationId) {
		return kick(conversationId, null);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsKickResponse> kickAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/kick",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsKickResponse::new);
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsKickResponse> kickAsync(Integer conversationId) {
		return kickAsync(conversationId, null);
	}

	public Types.ConversationsApiTypes.ConversationsReadResponse read(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsReadResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/read",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsReadResponse> readAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/read",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsReadResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsReadAllResponse readAll() {
		return new Types.ConversationsApiTypes.ConversationsReadAllResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/read-all",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsReadAllResponse> readAllAsync() {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/read-all",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsReadAllResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesStickResponse messagesStick(Integer conversationId, Integer messageId) {
		return new Types.ConversationsApiTypes.ConversationsMessagesStickResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesStickResponse> messagesStickAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesStickResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse messagesUnstick(Integer conversationId, Integer messageId) {
		return new Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse(http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse> messagesUnstickAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsStarResponse star(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsStarResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsStarResponse> starAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsStarResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsUnstarResponse unstar(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsUnstarResponse(http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsUnstarResponse> unstarAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsUnstarResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsAlertsEnableResponse alertsEnable(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsAlertsEnableResponse(http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsAlertsEnableResponse> alertsEnableAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsAlertsEnableResponse::new);
	}

	public Types.ConversationsApiTypes.ConversationsAlertsDisableResponse alertsDisable(Integer conversationId) {
		return new Types.ConversationsApiTypes.ConversationsAlertsDisableResponse(http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ConversationsApiTypes.ConversationsAlertsDisableResponse> alertsDisableAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ConversationsApiTypes.ConversationsAlertsDisableResponse::new);
	}
}

class NotificationsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	NotificationsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.NotificationsApiTypes.NotificationsListResponse list(Types.NotificationsApiTypes.NotificationsListParams params) {
		return new Types.NotificationsApiTypes.NotificationsListResponse(http.request(new RequestOptions(
			"GET",
			"/notifications",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.NotificationsApiTypes.NotificationsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.NotificationsApiTypes.NotificationsListResponse> listAsync(Types.NotificationsApiTypes.NotificationsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/notifications",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.NotificationsApiTypes.NotificationsListResponse::new);
	}

	public CompletableFuture<Types.NotificationsApiTypes.NotificationsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.NotificationsApiTypes.NotificationsGetResponse get(Integer notificationId) {
		return new Types.NotificationsApiTypes.NotificationsGetResponse(http.request(new RequestOptions(
			"GET",
			"/notifications/" + notificationId + "/content",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.NotificationsApiTypes.NotificationsGetResponse> getAsync(Integer notificationId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/notifications/" + notificationId + "/content",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.NotificationsApiTypes.NotificationsGetResponse::new);
	}

	public Types.NotificationsApiTypes.NotificationsReadResponse read(Types.NotificationsApiTypes.NotificationsReadBody body) {
		return new Types.NotificationsApiTypes.NotificationsReadResponse(http.request(new RequestOptions(
			"POST",
			"/notifications/read",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.NotificationsApiTypes.NotificationsReadResponse read() {
		return read(null);
	}

	public CompletableFuture<Types.NotificationsApiTypes.NotificationsReadResponse> readAsync(Types.NotificationsApiTypes.NotificationsReadBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/notifications/read",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.NotificationsApiTypes.NotificationsReadResponse::new);
	}

	public CompletableFuture<Types.NotificationsApiTypes.NotificationsReadResponse> readAsync() {
		return readAsync(null);
	}
}

class TagsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	TagsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.TagsApiTypes.TagsPopularResponse popular() {
		return new Types.TagsApiTypes.TagsPopularResponse(http.request(new RequestOptions(
			"GET",
			"/tags",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.TagsApiTypes.TagsPopularResponse> popularAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.TagsApiTypes.TagsPopularResponse::new);
	}

	public Types.TagsApiTypes.TagsListResponse list(Types.TagsApiTypes.TagsListParams params) {
		return new Types.TagsApiTypes.TagsListResponse(http.request(new RequestOptions(
			"GET",
			"/tags/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.TagsApiTypes.TagsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsListResponse> listAsync(Types.TagsApiTypes.TagsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.TagsApiTypes.TagsListResponse::new);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.TagsApiTypes.TagsGetResponse get(Integer tagId, Types.TagsApiTypes.TagsGetParams params) {
		return new Types.TagsApiTypes.TagsGetResponse(http.request(new RequestOptions(
			"GET",
			"/tags/" + tagId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.TagsApiTypes.TagsGetResponse get(Integer tagId) {
		return get(tagId, null);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsGetResponse> getAsync(Integer tagId, Types.TagsApiTypes.TagsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/" + tagId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.TagsApiTypes.TagsGetResponse::new);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsGetResponse> getAsync(Integer tagId) {
		return getAsync(tagId, null);
	}

	public Types.TagsApiTypes.TagsFindResponse find(Types.TagsApiTypes.TagsFindParams params) {
		return new Types.TagsApiTypes.TagsFindResponse(http.request(new RequestOptions(
			"GET",
			"/tags/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.TagsApiTypes.TagsFindResponse find() {
		return find(null);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsFindResponse> findAsync(Types.TagsApiTypes.TagsFindParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.TagsApiTypes.TagsFindResponse::new);
	}

	public CompletableFuture<Types.TagsApiTypes.TagsFindResponse> findAsync() {
		return findAsync(null);
	}
}

class SearchApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	SearchApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.SearchApiTypes.SearchAllResponse all(Types.SearchApiTypes.SearchAllBody body) {
		return new Types.SearchApiTypes.SearchAllResponse(http.request(new RequestOptions(
			"POST",
			"/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchAllResponse all() {
		return all(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchAllResponse> allAsync(Types.SearchApiTypes.SearchAllBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchAllResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchAllResponse> allAsync() {
		return allAsync(null);
	}

	public Types.SearchApiTypes.SearchThreadsResponse threads(Types.SearchApiTypes.SearchThreadsBody body) {
		return new Types.SearchApiTypes.SearchThreadsResponse(http.request(new RequestOptions(
			"POST",
			"/search/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchThreadsResponse threads() {
		return threads(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchThreadsResponse> threadsAsync(Types.SearchApiTypes.SearchThreadsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchThreadsResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchThreadsResponse> threadsAsync() {
		return threadsAsync(null);
	}

	public Types.SearchApiTypes.SearchPostsResponse posts(Types.SearchApiTypes.SearchPostsBody body) {
		return new Types.SearchApiTypes.SearchPostsResponse(http.request(new RequestOptions(
			"POST",
			"/search/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchPostsResponse posts() {
		return posts(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchPostsResponse> postsAsync(Types.SearchApiTypes.SearchPostsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchPostsResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchPostsResponse> postsAsync() {
		return postsAsync(null);
	}

	public Types.SearchApiTypes.SearchUsersResponse users(Types.SearchApiTypes.SearchUsersBody body) {
		return new Types.SearchApiTypes.SearchUsersResponse(http.request(new RequestOptions(
			"POST",
			"/search/users",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchUsersResponse users() {
		return users(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchUsersResponse> usersAsync(Types.SearchApiTypes.SearchUsersBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/users",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchUsersResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchUsersResponse> usersAsync() {
		return usersAsync(null);
	}

	public Types.SearchApiTypes.SearchProfilePostsResponse profilePosts(Types.SearchApiTypes.SearchProfilePostsBody body) {
		return new Types.SearchApiTypes.SearchProfilePostsResponse(http.request(new RequestOptions(
			"POST",
			"/search/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchProfilePostsResponse profilePosts() {
		return profilePosts(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchProfilePostsResponse> profilePostsAsync(Types.SearchApiTypes.SearchProfilePostsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchProfilePostsResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchProfilePostsResponse> profilePostsAsync() {
		return profilePostsAsync(null);
	}

	public Types.SearchApiTypes.SearchTaggedResponse tagged(Types.SearchApiTypes.SearchTaggedBody body) {
		return new Types.SearchApiTypes.SearchTaggedResponse(http.request(new RequestOptions(
			"POST",
			"/search/tagged",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchTaggedResponse tagged() {
		return tagged(null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchTaggedResponse> taggedAsync(Types.SearchApiTypes.SearchTaggedBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/tagged",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchTaggedResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchTaggedResponse> taggedAsync() {
		return taggedAsync(null);
	}

	public Types.SearchApiTypes.SearchResultsResponse results(JsonNode searchId, Types.SearchApiTypes.SearchResultsParams params) {
		return new Types.SearchApiTypes.SearchResultsResponse(http.request(new RequestOptions(
			"GET",
			"/search/" + searchId + "/results",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.SearchApiTypes.SearchResultsResponse results(JsonNode searchId) {
		return results(searchId, null);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchResultsResponse> resultsAsync(JsonNode searchId, Types.SearchApiTypes.SearchResultsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/search/" + searchId + "/results",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.SearchApiTypes.SearchResultsResponse::new);
	}

	public CompletableFuture<Types.SearchApiTypes.SearchResultsResponse> resultsAsync(JsonNode searchId) {
		return resultsAsync(searchId, null);
	}
}

class BatchApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	BatchApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.BatchApiTypes.BatchExecuteResponse execute(List<JsonNode> body) {
		return new Types.BatchApiTypes.BatchExecuteResponse(http.request(new RequestOptions(
			"POST",
			"/batch",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.BatchApiTypes.BatchExecuteResponse execute() {
		return execute(null);
	}

	public CompletableFuture<Types.BatchApiTypes.BatchExecuteResponse> executeAsync(List<JsonNode> body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/batch",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.BatchApiTypes.BatchExecuteResponse::new);
	}

	public CompletableFuture<Types.BatchApiTypes.BatchExecuteResponse> executeAsync() {
		return executeAsync(null);
	}
}

class ChatboxApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ChatboxApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.ChatboxApiTypes.ChatboxIndexResponse index(Types.ChatboxApiTypes.ChatboxIndexParams params) {
		return new Types.ChatboxApiTypes.ChatboxIndexResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxIndexResponse index() {
		return index(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxIndexResponse> indexAsync(Types.ChatboxApiTypes.ChatboxIndexParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxIndexResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxIndexResponse> indexAsync() {
		return indexAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxGetMessagesResponse getMessages(Types.ChatboxApiTypes.ChatboxGetMessagesParams params) {
		return new Types.ChatboxApiTypes.ChatboxGetMessagesResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxGetMessagesResponse getMessages() {
		return getMessages(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetMessagesResponse> getMessagesAsync(Types.ChatboxApiTypes.ChatboxGetMessagesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxGetMessagesResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetMessagesResponse> getMessagesAsync() {
		return getMessagesAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxPostMessageResponse postMessage(Types.ChatboxApiTypes.ChatboxPostMessageBody body) {
		return new Types.ChatboxApiTypes.ChatboxPostMessageResponse(http.request(new RequestOptions(
			"POST",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxPostMessageResponse postMessage() {
		return postMessage(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostMessageResponse> postMessageAsync(Types.ChatboxApiTypes.ChatboxPostMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxPostMessageResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostMessageResponse> postMessageAsync() {
		return postMessageAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxEditMessageResponse editMessage(Types.ChatboxApiTypes.ChatboxEditMessageBody body) {
		return new Types.ChatboxApiTypes.ChatboxEditMessageResponse(http.request(new RequestOptions(
			"PUT",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxEditMessageResponse editMessage() {
		return editMessage(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxEditMessageResponse> editMessageAsync(Types.ChatboxApiTypes.ChatboxEditMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxEditMessageResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxEditMessageResponse> editMessageAsync() {
		return editMessageAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxDeleteMessageResponse deleteMessage(Types.ChatboxApiTypes.ChatboxDeleteMessageBody body) {
		return new Types.ChatboxApiTypes.ChatboxDeleteMessageResponse(http.request(new RequestOptions(
			"DELETE",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxDeleteMessageResponse deleteMessage() {
		return deleteMessage(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteMessageResponse> deleteMessageAsync(Types.ChatboxApiTypes.ChatboxDeleteMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxDeleteMessageResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteMessageResponse> deleteMessageAsync() {
		return deleteMessageAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxOnlineResponse online(Types.ChatboxApiTypes.ChatboxOnlineParams params) {
		return new Types.ChatboxApiTypes.ChatboxOnlineResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/online",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxOnlineResponse online() {
		return online(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxOnlineResponse> onlineAsync(Types.ChatboxApiTypes.ChatboxOnlineParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/online",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxOnlineResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxOnlineResponse> onlineAsync() {
		return onlineAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxReportReasonsResponse reportReasons(Types.ChatboxApiTypes.ChatboxReportReasonsParams params) {
		return new Types.ChatboxApiTypes.ChatboxReportReasonsResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/report",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxReportReasonsResponse reportReasons() {
		return reportReasons(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportReasonsResponse> reportReasonsAsync(Types.ChatboxApiTypes.ChatboxReportReasonsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/report",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxReportReasonsResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportReasonsResponse> reportReasonsAsync() {
		return reportReasonsAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxReportResponse report(Types.ChatboxApiTypes.ChatboxReportBody body) {
		return new Types.ChatboxApiTypes.ChatboxReportResponse(http.request(new RequestOptions(
			"POST",
			"/chatbox/messages/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxReportResponse report() {
		return report(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportResponse> reportAsync(Types.ChatboxApiTypes.ChatboxReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/messages/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxReportResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportResponse> reportAsync() {
		return reportAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse getLeaderboard(Types.ChatboxApiTypes.ChatboxGetLeaderboardParams params) {
		return new Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/leaderboard",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse getLeaderboard() {
		return getLeaderboard(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse> getLeaderboardAsync(Types.ChatboxApiTypes.ChatboxGetLeaderboardParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/leaderboard",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse> getLeaderboardAsync() {
		return getLeaderboardAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxGetIgnoreResponse getIgnore() {
		return new Types.ChatboxApiTypes.ChatboxGetIgnoreResponse(http.request(new RequestOptions(
			"GET",
			"/chatbox/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetIgnoreResponse> getIgnoreAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxGetIgnoreResponse::new);
	}

	public Types.ChatboxApiTypes.ChatboxPostIgnoreResponse postIgnore(Types.ChatboxApiTypes.ChatboxPostIgnoreBody body) {
		return new Types.ChatboxApiTypes.ChatboxPostIgnoreResponse(http.request(new RequestOptions(
			"POST",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxPostIgnoreResponse postIgnore() {
		return postIgnore(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostIgnoreResponse> postIgnoreAsync(Types.ChatboxApiTypes.ChatboxPostIgnoreBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxPostIgnoreResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostIgnoreResponse> postIgnoreAsync() {
		return postIgnoreAsync(null);
	}

	public Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse deleteIgnore(Types.ChatboxApiTypes.ChatboxDeleteIgnoreBody body) {
		return new Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse(http.request(new RequestOptions(
			"DELETE",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse deleteIgnore() {
		return deleteIgnore(null);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse> deleteIgnoreAsync(Types.ChatboxApiTypes.ChatboxDeleteIgnoreBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse::new);
	}

	public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse> deleteIgnoreAsync() {
		return deleteIgnoreAsync(null);
	}
}

class FormsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	FormsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public Types.FormsApiTypes.FormsListResponse list(Types.FormsApiTypes.FormsListParams params) {
		return new Types.FormsApiTypes.FormsListResponse(http.request(new RequestOptions(
			"GET",
			"/forms",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.FormsApiTypes.FormsListResponse list() {
		return list(null);
	}

	public CompletableFuture<Types.FormsApiTypes.FormsListResponse> listAsync(Types.FormsApiTypes.FormsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forms",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.FormsApiTypes.FormsListResponse::new);
	}

	public CompletableFuture<Types.FormsApiTypes.FormsListResponse> listAsync() {
		return listAsync(null);
	}

	public Types.FormsApiTypes.FormsCreateResponse create(Types.FormsApiTypes.FormsCreateBody body) {
		return new Types.FormsApiTypes.FormsCreateResponse(http.request(new RequestOptions(
			"POST",
			"/forms/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)));
	}

	public Types.FormsApiTypes.FormsCreateResponse create() {
		return create(null);
	}

	public CompletableFuture<Types.FormsApiTypes.FormsCreateResponse> createAsync(Types.FormsApiTypes.FormsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/forms/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			/* isSearch */ false
		)).thenApply(Types.FormsApiTypes.FormsCreateResponse::new);
	}

	public CompletableFuture<Types.FormsApiTypes.FormsCreateResponse> createAsync() {
		return createAsync(null);
	}
}

public class ForumClient implements Closeable {

	private final OAuthApi oAuth;
	private final AssetsApi assets;
	private final CategoriesApi categories;
	private final ForumsApi forums;
	private final LinksApi links;
	private final PagesApi pages;
	private final NavigationApi navigation;
	private final ThreadsApi threads;
	private final PostsApi posts;
	private final UsersApi users;
	private final ProfilePostsApi profilePosts;
	private final ConversationsApi conversations;
	private final NotificationsApi notifications;
	private final TagsApi tags;
	private final SearchApi search;
	private final BatchApi batch;
	private final ChatboxApi chatbox;
	private final FormsApi forms;

	private final LolzteamHttpClient http;

	public ForumClient(ClientConfig config) {
		var resolvedConfig = config.withBaseUrl(
			config.baseUrl() != null ? config.baseUrl() : "https://prod-api.lolz.live"
		).withRateLimit(
			config.rateLimit() != null ? config.rateLimit() : new RateLimitConfig(300)
		);
		this.http = new LolzteamHttpClient(resolvedConfig);

		this.oAuth = new OAuthApi(http);
		this.assets = new AssetsApi(http);
		this.categories = new CategoriesApi(http);
		this.forums = new ForumsApi(http);
		this.links = new LinksApi(http);
		this.pages = new PagesApi(http);
		this.navigation = new NavigationApi(http);
		this.threads = new ThreadsApi(http);
		this.posts = new PostsApi(http);
		this.users = new UsersApi(http);
		this.profilePosts = new ProfilePostsApi(http);
		this.conversations = new ConversationsApi(http);
		this.notifications = new NotificationsApi(http);
		this.tags = new TagsApi(http);
		this.search = new SearchApi(http);
		this.batch = new BatchApi(http);
		this.chatbox = new ChatboxApi(http);
		this.forms = new FormsApi(http);
	}

	public OAuthApi oAuth() {
		return oAuth;
	}

	public AssetsApi assets() {
		return assets;
	}

	public CategoriesApi categories() {
		return categories;
	}

	public ForumsApi forums() {
		return forums;
	}

	public LinksApi links() {
		return links;
	}

	public PagesApi pages() {
		return pages;
	}

	public NavigationApi navigation() {
		return navigation;
	}

	public ThreadsApi threads() {
		return threads;
	}

	public PostsApi posts() {
		return posts;
	}

	public UsersApi users() {
		return users;
	}

	public ProfilePostsApi profilePosts() {
		return profilePosts;
	}

	public ConversationsApi conversations() {
		return conversations;
	}

	public NotificationsApi notifications() {
		return notifications;
	}

	public TagsApi tags() {
		return tags;
	}

	public SearchApi search() {
		return search;
	}

	public BatchApi batch() {
		return batch;
	}

	public ChatboxApi chatbox() {
		return chatbox;
	}

	public FormsApi forms() {
		return forms;
	}

	@Override
	public void close() {
		http.close();
	}
}
