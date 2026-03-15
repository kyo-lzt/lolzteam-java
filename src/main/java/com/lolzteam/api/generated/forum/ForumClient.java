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

	public JsonNode token(Types.OAuthApiTypes.OAuthTokenBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/oauth/token",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> tokenAsync(Types.OAuthApiTypes.OAuthTokenBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/oauth/token",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
			java.util.Map.of(),
			false
		));
	}
}

class AssetsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	AssetsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode css(Types.AssetsApiTypes.AssetsCssParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/css",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode css() {
		return css(null);
	}

	public CompletableFuture<JsonNode> cssAsync(Types.AssetsApiTypes.AssetsCssParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/css",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> cssAsync() {
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

	public JsonNode list(Types.CategoriesApiTypes.CategoriesListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/categories",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.CategoriesApiTypes.CategoriesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/categories",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode get(Integer categoryId) {
		return http.request(new RequestOptions(
			"GET",
			"/categories/" + categoryId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer categoryId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/categories/" + categoryId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class ForumsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ForumsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(Types.ForumsApiTypes.ForumsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/forums",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.ForumsApiTypes.ForumsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode grouped() {
		return http.request(new RequestOptions(
			"GET",
			"/forums/grouped",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> groupedAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/grouped",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(Integer forumId) {
		return http.request(new RequestOptions(
			"GET",
			"/forums/" + forumId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/" + forumId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followers(Integer forumId) {
		return http.request(new RequestOptions(
			"GET",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followersAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode follow(Integer forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/forums/" + forumId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode follow(Integer forumId) {
		return follow(forumId, null);
	}

	public CompletableFuture<JsonNode> followAsync(Integer forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/forums/" + forumId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followAsync(Integer forumId) {
		return followAsync(forumId, null);
	}

	public JsonNode unfollow(Integer forumId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unfollowAsync(Integer forumId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/forums/" + forumId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followed(Types.ForumsApiTypes.ForumsFollowedParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/forums/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followed() {
		return followed(null);
	}

	public CompletableFuture<JsonNode> followedAsync(Types.ForumsApiTypes.ForumsFollowedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followedAsync() {
		return followedAsync(null);
	}

	public JsonNode getFeedOptions() {
		return http.request(new RequestOptions(
			"GET",
			"/forums/feed/options",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getFeedOptionsAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forums/feed/options",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode editFeedOptions(Types.ForumsApiTypes.ForumsEditFeedOptionsBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/forums/feed/options",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode editFeedOptions() {
		return editFeedOptions(null);
	}

	public CompletableFuture<JsonNode> editFeedOptionsAsync(Types.ForumsApiTypes.ForumsEditFeedOptionsBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/forums/feed/options",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editFeedOptionsAsync() {
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

	public JsonNode list() {
		return http.request(new RequestOptions(
			"GET",
			"/link-forums",
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
			"/link-forums",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(Integer linkId) {
		return http.request(new RequestOptions(
			"GET",
			"/link-forums/" + linkId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer linkId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/link-forums/" + linkId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class PagesApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PagesApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(Types.PagesApiTypes.PagesListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/pages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.PagesApiTypes.PagesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/pages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode get(Integer pageId) {
		return http.request(new RequestOptions(
			"GET",
			"/pages/" + pageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer pageId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/pages/" + pageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class NavigationApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	NavigationApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(Types.NavigationApiTypes.NavigationListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/navigation",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.NavigationApiTypes.NavigationListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/navigation",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
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

	public JsonNode list(Types.ThreadsApiTypes.ThreadsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/threads",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.ThreadsApiTypes.ThreadsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode create(Types.ThreadsApiTypes.ThreadsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/threads",
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

	public CompletableFuture<JsonNode> createAsync(Types.ThreadsApiTypes.ThreadsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads",
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

	public JsonNode createContest(Types.ThreadsApiTypes.ThreadsCreateContestBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/contests",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> createContestAsync(Types.ThreadsApiTypes.ThreadsCreateContestBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/contests",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode claim(Types.ThreadsApiTypes.ThreadsClaimBody body) {
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

	public JsonNode claim() {
		return claim(null);
	}

	public CompletableFuture<JsonNode> claimAsync(Types.ThreadsApiTypes.ThreadsClaimBody body) {
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

	public CompletableFuture<JsonNode> claimAsync() {
		return claimAsync(null);
	}

	public JsonNode get(Integer threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(Integer threadId) {
		return get(threadId, null);
	}

	public CompletableFuture<JsonNode> getAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer threadId) {
		return getAsync(threadId, null);
	}

	public JsonNode edit(Integer threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer threadId) {
		return edit(threadId, null);
	}

	public CompletableFuture<JsonNode> editAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync(Integer threadId) {
		return editAsync(threadId, null);
	}

	public JsonNode delete(Integer threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Integer threadId) {
		return delete(threadId, null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer threadId) {
		return deleteAsync(threadId, null);
	}

	public JsonNode move(Integer threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/move",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode move(Integer threadId) {
		return move(threadId, null);
	}

	public CompletableFuture<JsonNode> moveAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/move",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> moveAsync(Integer threadId) {
		return moveAsync(threadId, null);
	}

	public JsonNode bump(Integer threadId) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> bumpAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/bump",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode hide(Integer threadId) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/hide",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> hideAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/hide",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode star(Integer threadId) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> starAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unstar(Integer threadId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unstarAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followers(Integer threadId) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followersAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode follow(Integer threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode follow(Integer threadId) {
		return follow(threadId, null);
	}

	public CompletableFuture<JsonNode> followAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/followers",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followAsync(Integer threadId) {
		return followAsync(threadId, null);
	}

	public JsonNode unfollow(Integer threadId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unfollowAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/threads/" + threadId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followed(Types.ThreadsApiTypes.ThreadsFollowedParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followed() {
		return followed(null);
	}

	public CompletableFuture<JsonNode> followedAsync(Types.ThreadsApiTypes.ThreadsFollowedParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/followed",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followedAsync() {
		return followedAsync(null);
	}

	public JsonNode navigation(Integer threadId) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/navigation",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> navigationAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/navigation",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode pollGet(Integer threadId) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/poll",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> pollGetAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/" + threadId + "/poll",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode pollVote(Integer threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/poll/votes",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode pollVote(Integer threadId) {
		return pollVote(threadId, null);
	}

	public CompletableFuture<JsonNode> pollVoteAsync(Integer threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/threads/" + threadId + "/poll/votes",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> pollVoteAsync(Integer threadId) {
		return pollVoteAsync(threadId, null);
	}

	public JsonNode unread(Types.ThreadsApiTypes.ThreadsUnreadParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/new",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unread() {
		return unread(null);
	}

	public CompletableFuture<JsonNode> unreadAsync(Types.ThreadsApiTypes.ThreadsUnreadParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/new",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unreadAsync() {
		return unreadAsync(null);
	}

	public JsonNode recent(Types.ThreadsApiTypes.ThreadsRecentParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/threads/recent",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode recent() {
		return recent(null);
	}

	public CompletableFuture<JsonNode> recentAsync(Types.ThreadsApiTypes.ThreadsRecentParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/threads/recent",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> recentAsync() {
		return recentAsync(null);
	}

	public JsonNode finish(Integer threadId) {
		return http.request(new RequestOptions(
			"POST",
			"/contests/" + threadId + "/finish",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> finishAsync(Integer threadId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/contests/" + threadId + "/finish",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class PostsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	PostsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(Types.PostsApiTypes.PostsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.PostsApiTypes.PostsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode create(Types.PostsApiTypes.PostsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/posts",
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

	public CompletableFuture<JsonNode> createAsync(Types.PostsApiTypes.PostsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts",
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

	public JsonNode get(Integer postId) {
		return http.request(new RequestOptions(
			"GET",
			"/posts/" + postId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer postId, Types.PostsApiTypes.PostsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer postId) {
		return edit(postId, null);
	}

	public CompletableFuture<JsonNode> editAsync(Integer postId, Types.PostsApiTypes.PostsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync(Integer postId) {
		return editAsync(postId, null);
	}

	public JsonNode delete(Integer postId, Types.PostsApiTypes.PostsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Integer postId) {
		return delete(postId, null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer postId, Types.PostsApiTypes.PostsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/" + postId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer postId) {
		return deleteAsync(postId, null);
	}

	public JsonNode likes(Integer postId, Types.PostsApiTypes.PostsLikesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/posts/" + postId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode likes(Integer postId) {
		return likes(postId, null);
	}

	public CompletableFuture<JsonNode> likesAsync(Integer postId, Types.PostsApiTypes.PostsLikesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> likesAsync(Integer postId) {
		return likesAsync(postId, null);
	}

	public JsonNode like(Integer postId) {
		return http.request(new RequestOptions(
			"POST",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> likeAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unlike(Integer postId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unlikeAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/" + postId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode reportReasons(Integer postId) {
		return http.request(new RequestOptions(
			"GET",
			"/posts/" + postId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportReasonsAsync(Integer postId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/" + postId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode report(Integer postId, Types.PostsApiTypes.PostsReportBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/posts/" + postId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode report(Integer postId) {
		return report(postId, null);
	}

	public CompletableFuture<JsonNode> reportAsync(Integer postId, Types.PostsApiTypes.PostsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/" + postId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportAsync(Integer postId) {
		return reportAsync(postId, null);
	}

	public JsonNode commentsGet(Types.PostsApiTypes.PostsCommentsGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsGet() {
		return commentsGet(null);
	}

	public CompletableFuture<JsonNode> commentsGetAsync(Types.PostsApiTypes.PostsCommentsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsGetAsync() {
		return commentsGetAsync(null);
	}

	public JsonNode commentsCreate(Types.PostsApiTypes.PostsCommentsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsCreate() {
		return commentsCreate(null);
	}

	public CompletableFuture<JsonNode> commentsCreateAsync(Types.PostsApiTypes.PostsCommentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsCreateAsync() {
		return commentsCreateAsync(null);
	}

	public JsonNode commentsEdit(Types.PostsApiTypes.PostsCommentsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsEdit() {
		return commentsEdit(null);
	}

	public CompletableFuture<JsonNode> commentsEditAsync(Types.PostsApiTypes.PostsCommentsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsEditAsync() {
		return commentsEditAsync(null);
	}

	public JsonNode commentsDelete(Types.PostsApiTypes.PostsCommentsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsDelete() {
		return commentsDelete(null);
	}

	public CompletableFuture<JsonNode> commentsDeleteAsync(Types.PostsApiTypes.PostsCommentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsDeleteAsync() {
		return commentsDeleteAsync(null);
	}

	public JsonNode commentsReport(Types.PostsApiTypes.PostsCommentsReportBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/posts/comments/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsReport() {
		return commentsReport(null);
	}

	public CompletableFuture<JsonNode> commentsReportAsync(Types.PostsApiTypes.PostsCommentsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/posts/comments/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsReportAsync() {
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

	public JsonNode list(Types.UsersApiTypes.UsersListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.UsersApiTypes.UsersListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode fields() {
		return http.request(new RequestOptions(
			"GET",
			"/users/fields",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> fieldsAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/fields",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode find(Types.UsersApiTypes.UsersFindParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode find() {
		return find(null);
	}

	public CompletableFuture<JsonNode> findAsync(Types.UsersApiTypes.UsersFindParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> findAsync() {
		return findAsync(null);
	}

	public JsonNode get(JsonNode userId, Types.UsersApiTypes.UsersGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(JsonNode userId) {
		return get(userId, null);
	}

	public CompletableFuture<JsonNode> getAsync(JsonNode userId, Types.UsersApiTypes.UsersGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(JsonNode userId) {
		return getAsync(userId, null);
	}

	public JsonNode edit(JsonNode userId, Types.UsersApiTypes.UsersEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/users/" + userId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(JsonNode userId) {
		return edit(userId, null);
	}

	public CompletableFuture<JsonNode> editAsync(JsonNode userId, Types.UsersApiTypes.UsersEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/users/" + userId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync(JsonNode userId) {
		return editAsync(userId, null);
	}

	public JsonNode claims(JsonNode userId, Types.UsersApiTypes.UsersClaimsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode claims(JsonNode userId) {
		return claims(userId, null);
	}

	public CompletableFuture<JsonNode> claimsAsync(JsonNode userId, Types.UsersApiTypes.UsersClaimsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/claims",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> claimsAsync(JsonNode userId) {
		return claimsAsync(userId, null);
	}

	public JsonNode avatarUpload(JsonNode userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("avatar", body.avatar());
			return http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				false
			));
		} else {
			return http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				false
			));
		}
	}

	public JsonNode avatarUpload(JsonNode userId) {
		return avatarUpload(userId, null);
	}

	public CompletableFuture<JsonNode> avatarUploadAsync(JsonNode userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
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
				false
			));
		} else {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				false
			));
		}
	}

	public CompletableFuture<JsonNode> avatarUploadAsync(JsonNode userId) {
		return avatarUploadAsync(userId, null);
	}

	public JsonNode avatarDelete(JsonNode userId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/avatar",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> avatarDeleteAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/avatar",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode avatarCrop(JsonNode userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/avatar/crop",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode avatarCrop(JsonNode userId) {
		return avatarCrop(userId, null);
	}

	public CompletableFuture<JsonNode> avatarCropAsync(JsonNode userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/avatar/crop",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> avatarCropAsync(JsonNode userId) {
		return avatarCropAsync(userId, null);
	}

	public JsonNode backgroundUpload(JsonNode userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
		if (body != null) {
			var jsonBody = mapper.createObjectNode();
			if (body.x() != null) jsonBody.putPOJO("x", body.x());
			if (body.y() != null) jsonBody.putPOJO("y", body.y());
			if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
			var byteFields = new java.util.HashMap<String, byte[]>();
			byteFields.put("background", body.background());
			return http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				jsonBody,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				byteFields,
				false
			));
		} else {
			return http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				false
			));
		}
	}

	public JsonNode backgroundUpload(JsonNode userId) {
		return backgroundUpload(userId, null);
	}

	public CompletableFuture<JsonNode> backgroundUploadAsync(JsonNode userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
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
				false
			));
		} else {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				false
			));
		}
	}

	public CompletableFuture<JsonNode> backgroundUploadAsync(JsonNode userId) {
		return backgroundUploadAsync(userId, null);
	}

	public JsonNode backgroundDelete(JsonNode userId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/background",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> backgroundDeleteAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/background",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode backgroundCrop(JsonNode userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/background/crop",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> backgroundCropAsync(JsonNode userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/background/crop",
			null,
			mapper.valueToTree(body),
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followers(JsonNode userId, Types.UsersApiTypes.UsersFollowersParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/followers",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followers(JsonNode userId) {
		return followers(userId, null);
	}

	public CompletableFuture<JsonNode> followersAsync(JsonNode userId, Types.UsersApiTypes.UsersFollowersParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/followers",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followersAsync(JsonNode userId) {
		return followersAsync(userId, null);
	}

	public JsonNode follow(JsonNode userId) {
		return http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unfollow(JsonNode userId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unfollowAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/followers",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followings(JsonNode userId, Types.UsersApiTypes.UsersFollowingsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/followings",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode followings(JsonNode userId) {
		return followings(userId, null);
	}

	public CompletableFuture<JsonNode> followingsAsync(JsonNode userId, Types.UsersApiTypes.UsersFollowingsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/followings",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> followingsAsync(JsonNode userId) {
		return followingsAsync(userId, null);
	}

	public JsonNode likes(JsonNode userId, Types.UsersApiTypes.UsersLikesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode likes(JsonNode userId) {
		return likes(userId, null);
	}

	public CompletableFuture<JsonNode> likesAsync(JsonNode userId, Types.UsersApiTypes.UsersLikesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/likes",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> likesAsync(JsonNode userId) {
		return likesAsync(userId, null);
	}

	public JsonNode ignored(Types.UsersApiTypes.UsersIgnoredParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/ignored",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode ignored() {
		return ignored(null);
	}

	public CompletableFuture<JsonNode> ignoredAsync(Types.UsersApiTypes.UsersIgnoredParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/ignored",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> ignoredAsync() {
		return ignoredAsync(null);
	}

	public JsonNode ignore(JsonNode userId) {
		return http.request(new RequestOptions(
			"POST",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> ignoreAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode ignoreEdit(JsonNode userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
		return http.request(new RequestOptions(
			"PUT",
			"/users/" + userId + "/ignore",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode ignoreEdit(JsonNode userId) {
		return ignoreEdit(userId, null);
	}

	public CompletableFuture<JsonNode> ignoreEditAsync(JsonNode userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/users/" + userId + "/ignore",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> ignoreEditAsync(JsonNode userId) {
		return ignoreEditAsync(userId, null);
	}

	public JsonNode unignore(JsonNode userId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unignoreAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/users/" + userId + "/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode contents(JsonNode userId, Types.UsersApiTypes.UsersContentsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/timeline",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode contents(JsonNode userId) {
		return contents(userId, null);
	}

	public CompletableFuture<JsonNode> contentsAsync(JsonNode userId, Types.UsersApiTypes.UsersContentsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/timeline",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> contentsAsync(JsonNode userId) {
		return contentsAsync(userId, null);
	}

	public JsonNode trophies(JsonNode userId) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/trophies",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> trophiesAsync(JsonNode userId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/trophies",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode secretAnswerTypes() {
		return http.request(new RequestOptions(
			"GET",
			"/users/secret-answer/types",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> secretAnswerTypesAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/secret-answer/types",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode saReset() {
		return http.request(new RequestOptions(
			"POST",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> saResetAsync() {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode saCancelReset() {
		return http.request(new RequestOptions(
			"DELETE",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> saCancelResetAsync() {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/account/secret-answer/reset",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class ProfilePostsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	ProfilePostsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(JsonNode userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/users/" + userId + "/profile-posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list(JsonNode userId) {
		return list(userId, null);
	}

	public CompletableFuture<JsonNode> listAsync(JsonNode userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/users/" + userId + "/profile-posts",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync(JsonNode userId) {
		return listAsync(userId, null);
	}

	public JsonNode get(Integer profilePostId) {
		return http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/profile-posts/" + profilePostId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode edit(Integer profilePostId) {
		return edit(profilePostId, null);
	}

	public CompletableFuture<JsonNode> editAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/profile-posts/" + profilePostId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editAsync(Integer profilePostId) {
		return editAsync(profilePostId, null);
	}

	public JsonNode delete(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
		return http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode delete(Integer profilePostId) {
		return delete(profilePostId, null);
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteAsync(Integer profilePostId) {
		return deleteAsync(profilePostId, null);
	}

	public JsonNode reportReasons(Integer profilePostId) {
		return http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportReasonsAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/report",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode report(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode report(Integer profilePostId) {
		return report(profilePostId, null);
	}

	public CompletableFuture<JsonNode> reportAsync(Integer profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportAsync(Integer profilePostId) {
		return reportAsync(profilePostId, null);
	}

	public JsonNode create(Types.ProfilePostsApiTypes.ProfilePostsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts",
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

	public CompletableFuture<JsonNode> createAsync(Types.ProfilePostsApiTypes.ProfilePostsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts",
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

	public JsonNode stick(Integer profilePostId) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> stickAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unstick(Integer profilePostId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unstickAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode likes(Integer profilePostId) {
		return http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> likesAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode like(Integer profilePostId) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> likeAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unlike(Integer profilePostId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unlikeAsync(Integer profilePostId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/" + profilePostId + "/likes",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsList(Types.ProfilePostsApiTypes.ProfilePostsCommentsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/profile-posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsList() {
		return commentsList(null);
	}

	public CompletableFuture<JsonNode> commentsListAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/comments",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsListAsync() {
		return commentsListAsync(null);
	}

	public JsonNode commentsCreate(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsCreate() {
		return commentsCreate(null);
	}

	public CompletableFuture<JsonNode> commentsCreateAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsCreateAsync() {
		return commentsCreateAsync(null);
	}

	public JsonNode commentsEdit(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsEdit() {
		return commentsEdit(null);
	}

	public CompletableFuture<JsonNode> commentsEditAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsEditAsync() {
		return commentsEditAsync(null);
	}

	public JsonNode commentsDelete(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsDelete() {
		return commentsDelete(null);
	}

	public CompletableFuture<JsonNode> commentsDeleteAsync(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/profile-posts/comments",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsDeleteAsync() {
		return commentsDeleteAsync(null);
	}

	public JsonNode commentsGet(Integer profilePostId, Integer commentId) {
		return http.request(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/comments/" + commentId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsGetAsync(Integer profilePostId, Integer commentId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/profile-posts/" + profilePostId + "/comments/" + commentId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsReport(Integer commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/profile-posts/comments/" + commentId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode commentsReport(Integer commentId) {
		return commentsReport(commentId, null);
	}

	public CompletableFuture<JsonNode> commentsReportAsync(Integer commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/profile-posts/comments/" + commentId + "/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> commentsReportAsync(Integer commentId) {
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

	public JsonNode list(Types.ConversationsApiTypes.ConversationsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/conversations",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.ConversationsApiTypes.ConversationsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode create(Types.ConversationsApiTypes.ConversationsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations",
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

	public CompletableFuture<JsonNode> createAsync(Types.ConversationsApiTypes.ConversationsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations",
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

	public JsonNode update(Types.ConversationsApiTypes.ConversationsUpdateBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode update() {
		return update(null);
	}

	public CompletableFuture<JsonNode> updateAsync(Types.ConversationsApiTypes.ConversationsUpdateBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/conversations",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> updateAsync() {
		return updateAsync(null);
	}

	public JsonNode delete(Types.ConversationsApiTypes.ConversationsDeleteBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/conversations",
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

	public CompletableFuture<JsonNode> deleteAsync(Types.ConversationsApiTypes.ConversationsDeleteBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations",
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

	public JsonNode start(Types.ConversationsApiTypes.ConversationsStartBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/start",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode start() {
		return start(null);
	}

	public CompletableFuture<JsonNode> startAsync(Types.ConversationsApiTypes.ConversationsStartBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/start",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> startAsync() {
		return startAsync(null);
	}

	public JsonNode save(Types.ConversationsApiTypes.ConversationsSaveBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode save() {
		return save(null);
	}

	public CompletableFuture<JsonNode> saveAsync(Types.ConversationsApiTypes.ConversationsSaveBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/save",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> saveAsync() {
		return saveAsync(null);
	}

	public JsonNode get(Integer conversationId) {
		return http.request(new RequestOptions(
			"GET",
			"/conversations/" + conversationId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/" + conversationId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesList(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/conversations/" + conversationId + "/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesList(Integer conversationId) {
		return messagesList(conversationId, null);
	}

	public CompletableFuture<JsonNode> messagesListAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/" + conversationId + "/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesListAsync(Integer conversationId) {
		return messagesListAsync(conversationId, null);
	}

	public JsonNode messagesCreate(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesCreate(Integer conversationId) {
		return messagesCreate(conversationId, null);
	}

	public CompletableFuture<JsonNode> messagesCreateAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesCreateAsync(Integer conversationId) {
		return messagesCreateAsync(conversationId, null);
	}

	public JsonNode search(Types.ConversationsApiTypes.ConversationsSearchBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode search() {
		return search(null);
	}

	public CompletableFuture<JsonNode> searchAsync(Types.ConversationsApiTypes.ConversationsSearchBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> searchAsync() {
		return searchAsync(null);
	}

	public JsonNode messagesGet(Integer messageId) {
		return http.request(new RequestOptions(
			"GET",
			"/conversations/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesGetAsync(Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/conversations/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesEdit(Integer conversationId, Integer messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesEdit(Integer conversationId, Integer messageId) {
		return messagesEdit(conversationId, messageId, null);
	}

	public CompletableFuture<JsonNode> messagesEditAsync(Integer conversationId, Integer messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesEditAsync(Integer conversationId, Integer messageId) {
		return messagesEditAsync(conversationId, messageId, null);
	}

	public JsonNode messagesDelete(Integer conversationId, Integer messageId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesDeleteAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId,
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode invite(Integer conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/invite",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode invite(Integer conversationId) {
		return invite(conversationId, null);
	}

	public CompletableFuture<JsonNode> inviteAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/invite",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> inviteAsync(Integer conversationId) {
		return inviteAsync(conversationId, null);
	}

	public JsonNode kick(Integer conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/kick",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode kick(Integer conversationId) {
		return kick(conversationId, null);
	}

	public CompletableFuture<JsonNode> kickAsync(Integer conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/kick",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> kickAsync(Integer conversationId) {
		return kickAsync(conversationId, null);
	}

	public JsonNode read(Integer conversationId) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/read",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> readAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/read",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode readAll() {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/read-all",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> readAllAsync() {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/read-all",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesStick(Integer conversationId, Integer messageId) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesStickAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode messagesUnstick(Integer conversationId, Integer messageId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> messagesUnstickAsync(Integer conversationId, Integer messageId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode star(Integer conversationId) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> starAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode unstar(Integer conversationId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> unstarAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/star",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode alertsEnable(Integer conversationId) {
		return http.request(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> alertsEnableAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode alertsDisable(Integer conversationId) {
		return http.request(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> alertsDisableAsync(Integer conversationId) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/conversations/" + conversationId + "/alerts",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}
}

class NotificationsApi {

	private final LolzteamHttpClient http;
	private final com.fasterxml.jackson.databind.ObjectMapper mapper;

	NotificationsApi(LolzteamHttpClient http) {
		this.http = http;
		this.mapper = http.objectMapper();
	}

	public JsonNode list(Types.NotificationsApiTypes.NotificationsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/notifications",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.NotificationsApiTypes.NotificationsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/notifications",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode get(Integer notificationId) {
		return http.request(new RequestOptions(
			"GET",
			"/notifications/" + notificationId + "/content",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer notificationId) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/notifications/" + notificationId + "/content",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode read(Types.NotificationsApiTypes.NotificationsReadBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/notifications/read",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode read() {
		return read(null);
	}

	public CompletableFuture<JsonNode> readAsync(Types.NotificationsApiTypes.NotificationsReadBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/notifications/read",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> readAsync() {
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

	public JsonNode popular() {
		return http.request(new RequestOptions(
			"GET",
			"/tags",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> popularAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list(Types.TagsApiTypes.TagsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/tags/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.TagsApiTypes.TagsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/list",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode get(Integer tagId, Types.TagsApiTypes.TagsGetParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/tags/" + tagId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode get(Integer tagId) {
		return get(tagId, null);
	}

	public CompletableFuture<JsonNode> getAsync(Integer tagId, Types.TagsApiTypes.TagsGetParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/" + tagId,
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getAsync(Integer tagId) {
		return getAsync(tagId, null);
	}

	public JsonNode find(Types.TagsApiTypes.TagsFindParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/tags/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode find() {
		return find(null);
	}

	public CompletableFuture<JsonNode> findAsync(Types.TagsApiTypes.TagsFindParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/tags/find",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> findAsync() {
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

	public JsonNode all(Types.SearchApiTypes.SearchAllBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode all() {
		return all(null);
	}

	public CompletableFuture<JsonNode> allAsync(Types.SearchApiTypes.SearchAllBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> allAsync() {
		return allAsync(null);
	}

	public JsonNode threads(Types.SearchApiTypes.SearchThreadsBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode threads() {
		return threads(null);
	}

	public CompletableFuture<JsonNode> threadsAsync(Types.SearchApiTypes.SearchThreadsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/threads",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> threadsAsync() {
		return threadsAsync(null);
	}

	public JsonNode posts(Types.SearchApiTypes.SearchPostsBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode posts() {
		return posts(null);
	}

	public CompletableFuture<JsonNode> postsAsync(Types.SearchApiTypes.SearchPostsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> postsAsync() {
		return postsAsync(null);
	}

	public JsonNode users(Types.SearchApiTypes.SearchUsersBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search/users",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode users() {
		return users(null);
	}

	public CompletableFuture<JsonNode> usersAsync(Types.SearchApiTypes.SearchUsersBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/users",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> usersAsync() {
		return usersAsync(null);
	}

	public JsonNode profilePosts(Types.SearchApiTypes.SearchProfilePostsBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode profilePosts() {
		return profilePosts(null);
	}

	public CompletableFuture<JsonNode> profilePostsAsync(Types.SearchApiTypes.SearchProfilePostsBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/profile-posts",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> profilePostsAsync() {
		return profilePostsAsync(null);
	}

	public JsonNode tagged(Types.SearchApiTypes.SearchTaggedBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/search/tagged",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode tagged() {
		return tagged(null);
	}

	public CompletableFuture<JsonNode> taggedAsync(Types.SearchApiTypes.SearchTaggedBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/search/tagged",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> taggedAsync() {
		return taggedAsync(null);
	}

	public JsonNode results(JsonNode searchId, Types.SearchApiTypes.SearchResultsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/search/" + searchId + "/results",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode results(JsonNode searchId) {
		return results(searchId, null);
	}

	public CompletableFuture<JsonNode> resultsAsync(JsonNode searchId, Types.SearchApiTypes.SearchResultsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/search/" + searchId + "/results",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> resultsAsync(JsonNode searchId) {
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

	public JsonNode execute(List<JsonNode> body) {
		return http.request(new RequestOptions(
			"POST",
			"/batch",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode execute() {
		return execute(null);
	}

	public CompletableFuture<JsonNode> executeAsync(List<JsonNode> body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/batch",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> executeAsync() {
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

	public JsonNode index(Types.ChatboxApiTypes.ChatboxIndexParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode index() {
		return index(null);
	}

	public CompletableFuture<JsonNode> indexAsync(Types.ChatboxApiTypes.ChatboxIndexParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> indexAsync() {
		return indexAsync(null);
	}

	public JsonNode getMessages(Types.ChatboxApiTypes.ChatboxGetMessagesParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode getMessages() {
		return getMessages(null);
	}

	public CompletableFuture<JsonNode> getMessagesAsync(Types.ChatboxApiTypes.ChatboxGetMessagesParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getMessagesAsync() {
		return getMessagesAsync(null);
	}

	public JsonNode postMessage(Types.ChatboxApiTypes.ChatboxPostMessageBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode postMessage() {
		return postMessage(null);
	}

	public CompletableFuture<JsonNode> postMessageAsync(Types.ChatboxApiTypes.ChatboxPostMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> postMessageAsync() {
		return postMessageAsync(null);
	}

	public JsonNode editMessage(Types.ChatboxApiTypes.ChatboxEditMessageBody body) {
		return http.request(new RequestOptions(
			"PUT",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode editMessage() {
		return editMessage(null);
	}

	public CompletableFuture<JsonNode> editMessageAsync(Types.ChatboxApiTypes.ChatboxEditMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"PUT",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> editMessageAsync() {
		return editMessageAsync(null);
	}

	public JsonNode deleteMessage(Types.ChatboxApiTypes.ChatboxDeleteMessageBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode deleteMessage() {
		return deleteMessage(null);
	}

	public CompletableFuture<JsonNode> deleteMessageAsync(Types.ChatboxApiTypes.ChatboxDeleteMessageBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/chatbox/messages",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteMessageAsync() {
		return deleteMessageAsync(null);
	}

	public JsonNode online(Types.ChatboxApiTypes.ChatboxOnlineParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/online",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode online() {
		return online(null);
	}

	public CompletableFuture<JsonNode> onlineAsync(Types.ChatboxApiTypes.ChatboxOnlineParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/online",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> onlineAsync() {
		return onlineAsync(null);
	}

	public JsonNode reportReasons(Types.ChatboxApiTypes.ChatboxReportReasonsParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/report",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode reportReasons() {
		return reportReasons(null);
	}

	public CompletableFuture<JsonNode> reportReasonsAsync(Types.ChatboxApiTypes.ChatboxReportReasonsParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/report",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportReasonsAsync() {
		return reportReasonsAsync(null);
	}

	public JsonNode report(Types.ChatboxApiTypes.ChatboxReportBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/chatbox/messages/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode report() {
		return report(null);
	}

	public CompletableFuture<JsonNode> reportAsync(Types.ChatboxApiTypes.ChatboxReportBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/messages/report",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> reportAsync() {
		return reportAsync(null);
	}

	public JsonNode getLeaderboard(Types.ChatboxApiTypes.ChatboxGetLeaderboardParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox/messages/leaderboard",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode getLeaderboard() {
		return getLeaderboard(null);
	}

	public CompletableFuture<JsonNode> getLeaderboardAsync(Types.ChatboxApiTypes.ChatboxGetLeaderboardParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/messages/leaderboard",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getLeaderboardAsync() {
		return getLeaderboardAsync(null);
	}

	public JsonNode getIgnore() {
		return http.request(new RequestOptions(
			"GET",
			"/chatbox/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> getIgnoreAsync() {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/chatbox/ignore",
			null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode postIgnore(Types.ChatboxApiTypes.ChatboxPostIgnoreBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode postIgnore() {
		return postIgnore(null);
	}

	public CompletableFuture<JsonNode> postIgnoreAsync(Types.ChatboxApiTypes.ChatboxPostIgnoreBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> postIgnoreAsync() {
		return postIgnoreAsync(null);
	}

	public JsonNode deleteIgnore(Types.ChatboxApiTypes.ChatboxDeleteIgnoreBody body) {
		return http.request(new RequestOptions(
			"DELETE",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode deleteIgnore() {
		return deleteIgnore(null);
	}

	public CompletableFuture<JsonNode> deleteIgnoreAsync(Types.ChatboxApiTypes.ChatboxDeleteIgnoreBody body) {
		return http.requestAsync(new RequestOptions(
			"DELETE",
			"/chatbox/ignore",
			null,
			body != null ? mapper.valueToTree(body) : null,
			com.lolzteam.api.runtime.BodyEncoding.JSON,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> deleteIgnoreAsync() {
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

	public JsonNode list(Types.FormsApiTypes.FormsListParams params) {
		return http.request(new RequestOptions(
			"GET",
			"/forms",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public JsonNode list() {
		return list(null);
	}

	public CompletableFuture<JsonNode> listAsync(Types.FormsApiTypes.FormsListParams params) {
		return http.requestAsync(new RequestOptions(
			"GET",
			"/forms",
			params != null ? mapper.valueToTree(params) : null,
			null,
			com.lolzteam.api.runtime.BodyEncoding.FORM,
			java.util.Map.of(),
			false
		));
	}

	public CompletableFuture<JsonNode> listAsync() {
		return listAsync(null);
	}

	public JsonNode create(Types.FormsApiTypes.FormsCreateBody body) {
		return http.request(new RequestOptions(
			"POST",
			"/forms/save",
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

	public CompletableFuture<JsonNode> createAsync(Types.FormsApiTypes.FormsCreateBody body) {
		return http.requestAsync(new RequestOptions(
			"POST",
			"/forms/save",
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
