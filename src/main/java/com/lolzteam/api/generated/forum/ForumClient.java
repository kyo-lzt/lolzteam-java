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

public class ForumClient implements Closeable {

	public static class OAuthApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public OAuthApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.OAuthApiTypes.OAuthTokenResponse token(Types.OAuthApiTypes.OAuthTokenBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/oauth/token",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.OAuthApiTypes.OAuthTokenResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.OAuthApiTypes.OAuthTokenResponse.class));
		}
	}

	public static class AssetsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public AssetsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.AssetsApiTypes.AssetsCssResponse css(Types.AssetsApiTypes.AssetsCssParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/css",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.AssetsApiTypes.AssetsCssResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.AssetsApiTypes.AssetsCssResponse.class));
		}
	
		public CompletableFuture<Types.AssetsApiTypes.AssetsCssResponse> cssAsync() {
			return cssAsync(null);
		}
	}

	public static class CategoriesApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public CategoriesApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.CategoriesApiTypes.CategoriesListResponse list(Types.CategoriesApiTypes.CategoriesListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/categories",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CategoriesApiTypes.CategoriesListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.CategoriesApiTypes.CategoriesListResponse.class));
		}
	
		public CompletableFuture<Types.CategoriesApiTypes.CategoriesListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.CategoriesApiTypes.CategoriesGetResponse get(long categoryId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/categories/" + categoryId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.CategoriesApiTypes.CategoriesGetResponse.class);
		}
	
		public CompletableFuture<Types.CategoriesApiTypes.CategoriesGetResponse> getAsync(long categoryId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/categories/" + categoryId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.CategoriesApiTypes.CategoriesGetResponse.class));
		}
	}

	public static class ForumsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ForumsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ForumsApiTypes.ForumsListResponse list(Types.ForumsApiTypes.ForumsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsListResponse.class));
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.ForumsApiTypes.ForumsGroupedResponse grouped() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums/grouped",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsGroupedResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsGroupedResponse.class));
		}
	
		public Types.ForumsApiTypes.ForumsGetResponse get(long forumId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums/" + forumId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsGetResponse.class);
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsGetResponse> getAsync(long forumId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/forums/" + forumId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsGetResponse.class));
		}
	
		public Types.ForumsApiTypes.ForumsFollowersResponse followers(long forumId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums/" + forumId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsFollowersResponse.class);
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsFollowersResponse> followersAsync(long forumId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/forums/" + forumId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsFollowersResponse.class));
		}
	
		public Types.ForumsApiTypes.ForumsFollowResponse follow(long forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/forums/" + forumId + "/followers",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsFollowResponse.class);
		}
	
		public Types.ForumsApiTypes.ForumsFollowResponse follow(long forumId) {
			return follow(forumId, null);
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsFollowResponse> followAsync(long forumId, Types.ForumsApiTypes.ForumsFollowBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/forums/" + forumId + "/followers",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsFollowResponse.class));
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsFollowResponse> followAsync(long forumId) {
			return followAsync(forumId, null);
		}
	
		public Types.ForumsApiTypes.ForumsUnfollowResponse unfollow(long forumId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/forums/" + forumId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsUnfollowResponse.class);
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsUnfollowResponse> unfollowAsync(long forumId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/forums/" + forumId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsUnfollowResponse.class));
		}
	
		public Types.ForumsApiTypes.ForumsFollowedResponse followed(Types.ForumsApiTypes.ForumsFollowedParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums/followed",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsFollowedResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsFollowedResponse.class));
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsFollowedResponse> followedAsync() {
			return followedAsync(null);
		}
	
		public Types.ForumsApiTypes.ForumsGetFeedOptionsResponse getFeedOptions() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forums/feed/options",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsGetFeedOptionsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsGetFeedOptionsResponse.class));
		}
	
		public Types.ForumsApiTypes.ForumsEditFeedOptionsResponse editFeedOptions(Types.ForumsApiTypes.ForumsEditFeedOptionsBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/forums/feed/options",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ForumsApiTypes.ForumsEditFeedOptionsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ForumsApiTypes.ForumsEditFeedOptionsResponse.class));
		}
	
		public CompletableFuture<Types.ForumsApiTypes.ForumsEditFeedOptionsResponse> editFeedOptionsAsync() {
			return editFeedOptionsAsync(null);
		}
	}

	public static class LinksApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public LinksApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.LinksApiTypes.LinksListResponse list() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/link-forums",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.LinksApiTypes.LinksListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.LinksApiTypes.LinksListResponse.class));
		}
	
		public Types.LinksApiTypes.LinksGetResponse get(long linkId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/link-forums/" + linkId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.LinksApiTypes.LinksGetResponse.class);
		}
	
		public CompletableFuture<Types.LinksApiTypes.LinksGetResponse> getAsync(long linkId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/link-forums/" + linkId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.LinksApiTypes.LinksGetResponse.class));
		}
	}

	public static class PagesApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public PagesApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.PagesApiTypes.PagesListResponse list(Types.PagesApiTypes.PagesListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/pages",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PagesApiTypes.PagesListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PagesApiTypes.PagesListResponse.class));
		}
	
		public CompletableFuture<Types.PagesApiTypes.PagesListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.PagesApiTypes.PagesGetResponse get(long pageId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/pages/" + pageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PagesApiTypes.PagesGetResponse.class);
		}
	
		public CompletableFuture<Types.PagesApiTypes.PagesGetResponse> getAsync(long pageId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/pages/" + pageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PagesApiTypes.PagesGetResponse.class));
		}
	}

	public static class NavigationApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public NavigationApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.NavigationApiTypes.NavigationListResponse list(Types.NavigationApiTypes.NavigationListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/navigation",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.NavigationApiTypes.NavigationListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.NavigationApiTypes.NavigationListResponse.class));
		}
	
		public CompletableFuture<Types.NavigationApiTypes.NavigationListResponse> listAsync() {
			return listAsync(null);
		}
	}

	public static class ThreadsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ThreadsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ThreadsApiTypes.ThreadsListResponse list(Types.ThreadsApiTypes.ThreadsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsListResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsCreateResponse create(Types.ThreadsApiTypes.ThreadsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsCreateResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsCreateContestResponse createContest(Types.ThreadsApiTypes.ThreadsCreateContestBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/contests",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsCreateContestResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsCreateContestResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsClaimResponse claim(Types.ThreadsApiTypes.ThreadsClaimBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/claims",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsClaimResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsClaimResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsClaimResponse> claimAsync() {
			return claimAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsGetResponse get(long threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/" + threadId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsGetResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsGetResponse get(long threadId) {
			return get(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsGetResponse> getAsync(long threadId, Types.ThreadsApiTypes.ThreadsGetParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/threads/" + threadId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsGetResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsGetResponse> getAsync(long threadId) {
			return getAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsEditResponse edit(long threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/threads/" + threadId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsEditResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsEditResponse edit(long threadId) {
			return edit(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsEditResponse> editAsync(long threadId, Types.ThreadsApiTypes.ThreadsEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/threads/" + threadId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsEditResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsEditResponse> editAsync(long threadId) {
			return editAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsDeleteResponse delete(long threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/threads/" + threadId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsDeleteResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsDeleteResponse delete(long threadId) {
			return delete(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsDeleteResponse> deleteAsync(long threadId, Types.ThreadsApiTypes.ThreadsDeleteBody body) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/threads/" + threadId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsDeleteResponse> deleteAsync(long threadId) {
			return deleteAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsMoveResponse move(long threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/move",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsMoveResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsMoveResponse move(long threadId) {
			return move(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsMoveResponse> moveAsync(long threadId, Types.ThreadsApiTypes.ThreadsMoveBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/move",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsMoveResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsMoveResponse> moveAsync(long threadId) {
			return moveAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsBumpResponse bump(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsBumpResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsBumpResponse> bumpAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/bump",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsBumpResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsHideResponse hide(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/hide",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsHideResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsHideResponse> hideAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/hide",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsHideResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsStarResponse star(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsStarResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsStarResponse> starAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsStarResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsUnstarResponse unstar(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/threads/" + threadId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsUnstarResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnstarResponse> unstarAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/threads/" + threadId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsUnstarResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsFollowersResponse followers(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsFollowersResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowersResponse> followersAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsFollowersResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsFollowResponse follow(long threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/followers",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsFollowResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsFollowResponse follow(long threadId) {
			return follow(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowResponse> followAsync(long threadId, Types.ThreadsApiTypes.ThreadsFollowBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/followers",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsFollowResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowResponse> followAsync(long threadId) {
			return followAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsUnfollowResponse unfollow(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/threads/" + threadId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsUnfollowResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnfollowResponse> unfollowAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/threads/" + threadId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsUnfollowResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsFollowedResponse followed(Types.ThreadsApiTypes.ThreadsFollowedParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/followed",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsFollowedResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsFollowedResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsFollowedResponse> followedAsync() {
			return followedAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsNavigationResponse navigation(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/navigation",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsNavigationResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsNavigationResponse> navigationAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/navigation",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsNavigationResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsPollGetResponse pollGet(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/poll",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsPollGetResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollGetResponse> pollGetAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/threads/" + threadId + "/poll",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsPollGetResponse.class));
		}
	
		public Types.ThreadsApiTypes.ThreadsPollVoteResponse pollVote(long threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/poll/votes",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsPollVoteResponse.class);
		}
	
		public Types.ThreadsApiTypes.ThreadsPollVoteResponse pollVote(long threadId) {
			return pollVote(threadId, null);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollVoteResponse> pollVoteAsync(long threadId, Types.ThreadsApiTypes.ThreadsPollVoteBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/threads/" + threadId + "/poll/votes",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsPollVoteResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsPollVoteResponse> pollVoteAsync(long threadId) {
			return pollVoteAsync(threadId, null);
		}
	
		public Types.ThreadsApiTypes.ThreadsUnreadResponse unread(Types.ThreadsApiTypes.ThreadsUnreadParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/new",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsUnreadResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsUnreadResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsUnreadResponse> unreadAsync() {
			return unreadAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsRecentResponse recent(Types.ThreadsApiTypes.ThreadsRecentParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/threads/recent",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsRecentResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsRecentResponse.class));
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsRecentResponse> recentAsync() {
			return recentAsync(null);
		}
	
		public Types.ThreadsApiTypes.ThreadsFinishResponse finish(long threadId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/contests/" + threadId + "/finish",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ThreadsApiTypes.ThreadsFinishResponse.class);
		}
	
		public CompletableFuture<Types.ThreadsApiTypes.ThreadsFinishResponse> finishAsync(long threadId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/contests/" + threadId + "/finish",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ThreadsApiTypes.ThreadsFinishResponse.class));
		}
	}

	public static class PostsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public PostsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.PostsApiTypes.PostsListResponse list(Types.PostsApiTypes.PostsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/posts",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsListResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.PostsApiTypes.PostsCreateResponse create(Types.PostsApiTypes.PostsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/posts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCreateResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.PostsApiTypes.PostsGetResponse get(long postId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/posts/" + postId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsGetResponse.class);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsGetResponse> getAsync(long postId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/posts/" + postId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsGetResponse.class));
		}
	
		public Types.PostsApiTypes.PostsEditResponse edit(long postId, Types.PostsApiTypes.PostsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/posts/" + postId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsEditResponse.class);
		}
	
		public Types.PostsApiTypes.PostsEditResponse edit(long postId) {
			return edit(postId, null);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsEditResponse> editAsync(long postId, Types.PostsApiTypes.PostsEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/posts/" + postId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsEditResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsEditResponse> editAsync(long postId) {
			return editAsync(postId, null);
		}
	
		public Types.PostsApiTypes.PostsDeleteResponse delete(long postId, Types.PostsApiTypes.PostsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/posts/" + postId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsDeleteResponse.class);
		}
	
		public Types.PostsApiTypes.PostsDeleteResponse delete(long postId) {
			return delete(postId, null);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsDeleteResponse> deleteAsync(long postId, Types.PostsApiTypes.PostsDeleteBody body) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/posts/" + postId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsDeleteResponse> deleteAsync(long postId) {
			return deleteAsync(postId, null);
		}
	
		public Types.PostsApiTypes.PostsLikesResponse likes(long postId, Types.PostsApiTypes.PostsLikesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/posts/" + postId + "/likes",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsLikesResponse.class);
		}
	
		public Types.PostsApiTypes.PostsLikesResponse likes(long postId) {
			return likes(postId, null);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsLikesResponse> likesAsync(long postId, Types.PostsApiTypes.PostsLikesParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/posts/" + postId + "/likes",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsLikesResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsLikesResponse> likesAsync(long postId) {
			return likesAsync(postId, null);
		}
	
		public Types.PostsApiTypes.PostsLikeResponse like(long postId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/posts/" + postId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsLikeResponse.class);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsLikeResponse> likeAsync(long postId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/posts/" + postId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsLikeResponse.class));
		}
	
		public Types.PostsApiTypes.PostsUnlikeResponse unlike(long postId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/posts/" + postId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsUnlikeResponse.class);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsUnlikeResponse> unlikeAsync(long postId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/posts/" + postId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsUnlikeResponse.class));
		}
	
		public Types.PostsApiTypes.PostsReportReasonsResponse reportReasons(long postId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/posts/" + postId + "/report",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsReportReasonsResponse.class);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsReportReasonsResponse> reportReasonsAsync(long postId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/posts/" + postId + "/report",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsReportReasonsResponse.class));
		}
	
		public Types.PostsApiTypes.PostsReportResponse report(long postId, Types.PostsApiTypes.PostsReportBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/posts/" + postId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsReportResponse.class);
		}
	
		public Types.PostsApiTypes.PostsReportResponse report(long postId) {
			return report(postId, null);
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsReportResponse> reportAsync(long postId, Types.PostsApiTypes.PostsReportBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/posts/" + postId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsReportResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsReportResponse> reportAsync(long postId) {
			return reportAsync(postId, null);
		}
	
		public Types.PostsApiTypes.PostsCommentsGetResponse commentsGet(Types.PostsApiTypes.PostsCommentsGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/posts/comments",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCommentsGetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCommentsGetResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCommentsGetResponse> commentsGetAsync() {
			return commentsGetAsync(null);
		}
	
		public Types.PostsApiTypes.PostsCommentsCreateResponse commentsCreate(Types.PostsApiTypes.PostsCommentsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCommentsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCommentsCreateResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCommentsCreateResponse> commentsCreateAsync() {
			return commentsCreateAsync(null);
		}
	
		public Types.PostsApiTypes.PostsCommentsEditResponse commentsEdit(Types.PostsApiTypes.PostsCommentsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCommentsEditResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCommentsEditResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCommentsEditResponse> commentsEditAsync() {
			return commentsEditAsync(null);
		}
	
		public Types.PostsApiTypes.PostsCommentsDeleteResponse commentsDelete(Types.PostsApiTypes.PostsCommentsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCommentsDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCommentsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCommentsDeleteResponse> commentsDeleteAsync() {
			return commentsDeleteAsync(null);
		}
	
		public Types.PostsApiTypes.PostsCommentsReportResponse commentsReport(Types.PostsApiTypes.PostsCommentsReportBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/posts/comments/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.PostsApiTypes.PostsCommentsReportResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.PostsApiTypes.PostsCommentsReportResponse.class));
		}
	
		public CompletableFuture<Types.PostsApiTypes.PostsCommentsReportResponse> commentsReportAsync() {
			return commentsReportAsync(null);
		}
	}

	public static class UsersApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public UsersApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.UsersApiTypes.UsersListResponse list(Types.UsersApiTypes.UsersListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersListResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.UsersApiTypes.UsersFieldsResponse fields() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/fields",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersFieldsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersFieldsResponse.class));
		}
	
		public Types.UsersApiTypes.UsersFindResponse find(Types.UsersApiTypes.UsersFindParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/find",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersFindResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersFindResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFindResponse> findAsync() {
			return findAsync(null);
		}
	
		public Types.UsersApiTypes.UsersGetResponse get(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersGetResponse.class);
		}
	
		public Types.UsersApiTypes.UsersGetResponse get(com.lolzteam.api.runtime.StringOrInt userId) {
			return get(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersGetResponse> getAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersGetParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersGetResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersGetResponse> getAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return getAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersEditResponse edit(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/users/" + userId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersEditResponse.class);
		}
	
		public Types.UsersApiTypes.UsersEditResponse edit(com.lolzteam.api.runtime.StringOrInt userId) {
			return edit(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersEditResponse> editAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/users/" + userId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersEditResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersEditResponse> editAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return editAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersClaimsResponse claims(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersClaimsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/claims",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersClaimsResponse.class);
		}
	
		public Types.UsersApiTypes.UsersClaimsResponse claims(com.lolzteam.api.runtime.StringOrInt userId) {
			return claims(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersClaimsResponse> claimsAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersClaimsParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/claims",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersClaimsResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersClaimsResponse> claimsAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return claimsAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersAvatarUploadResponse avatarUpload(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
			if (body != null) {
				var jsonBody = mapper.createObjectNode();
				if (body.x() != null) jsonBody.putPOJO("x", body.x());
				if (body.y() != null) jsonBody.putPOJO("y", body.y());
				if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
				var byteFields = new java.util.LinkedHashMap<String, byte[]>();
				byteFields.put("avatar", body.avatar());
				return mapper.convertValue(http.request(new RequestOptions(
					"POST",
					"/users/" + userId + "/avatar",
					null,
					jsonBody,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					byteFields,
					/* isSearch */ false
				)), Types.UsersApiTypes.UsersAvatarUploadResponse.class);
			} else {
				return mapper.convertValue(http.request(new RequestOptions(
					"POST",
					"/users/" + userId + "/avatar",
					null,
					null,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					java.util.Map.of(),
					/* isSearch */ false
				)), Types.UsersApiTypes.UsersAvatarUploadResponse.class);
			}
		}
	
		public Types.UsersApiTypes.UsersAvatarUploadResponse avatarUpload(com.lolzteam.api.runtime.StringOrInt userId) {
			return avatarUpload(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersAvatarUploadResponse> avatarUploadAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersAvatarUploadBody body) {
			if (body != null) {
				var jsonBody = mapper.createObjectNode();
				if (body.x() != null) jsonBody.putPOJO("x", body.x());
				if (body.y() != null) jsonBody.putPOJO("y", body.y());
				if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
				var byteFields = new java.util.LinkedHashMap<String, byte[]>();
				byteFields.put("avatar", body.avatar());
				return http.requestAsync(new RequestOptions(
					"POST",
					"/users/" + userId + "/avatar",
					null,
					jsonBody,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					byteFields,
					/* isSearch */ false
				)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersAvatarUploadResponse.class));
			} else {
				return http.requestAsync(new RequestOptions(
					"POST",
					"/users/" + userId + "/avatar",
					null,
					null,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					java.util.Map.of(),
					/* isSearch */ false
				)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersAvatarUploadResponse.class));
			}
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersAvatarUploadResponse> avatarUploadAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return avatarUploadAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersAvatarDeleteResponse avatarDelete(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersAvatarDeleteResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersAvatarDeleteResponse> avatarDeleteAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/avatar",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersAvatarDeleteResponse.class));
		}
	
		public Types.UsersApiTypes.UsersAvatarCropResponse avatarCrop(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar/crop",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersAvatarCropResponse.class);
		}
	
		public Types.UsersApiTypes.UsersAvatarCropResponse avatarCrop(com.lolzteam.api.runtime.StringOrInt userId) {
			return avatarCrop(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersAvatarCropResponse> avatarCropAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersAvatarCropBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/avatar/crop",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersAvatarCropResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersAvatarCropResponse> avatarCropAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return avatarCropAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersBackgroundUploadResponse backgroundUpload(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
			if (body != null) {
				var jsonBody = mapper.createObjectNode();
				if (body.x() != null) jsonBody.putPOJO("x", body.x());
				if (body.y() != null) jsonBody.putPOJO("y", body.y());
				if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
				var byteFields = new java.util.LinkedHashMap<String, byte[]>();
				byteFields.put("background", body.background());
				return mapper.convertValue(http.request(new RequestOptions(
					"POST",
					"/users/" + userId + "/background",
					null,
					jsonBody,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					byteFields,
					/* isSearch */ false
				)), Types.UsersApiTypes.UsersBackgroundUploadResponse.class);
			} else {
				return mapper.convertValue(http.request(new RequestOptions(
					"POST",
					"/users/" + userId + "/background",
					null,
					null,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					java.util.Map.of(),
					/* isSearch */ false
				)), Types.UsersApiTypes.UsersBackgroundUploadResponse.class);
			}
		}
	
		public Types.UsersApiTypes.UsersBackgroundUploadResponse backgroundUpload(com.lolzteam.api.runtime.StringOrInt userId) {
			return backgroundUpload(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersBackgroundUploadResponse> backgroundUploadAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersBackgroundUploadBody body) {
			if (body != null) {
				var jsonBody = mapper.createObjectNode();
				if (body.x() != null) jsonBody.putPOJO("x", body.x());
				if (body.y() != null) jsonBody.putPOJO("y", body.y());
				if (body.crop() != null) jsonBody.putPOJO("crop", body.crop());
				var byteFields = new java.util.LinkedHashMap<String, byte[]>();
				byteFields.put("background", body.background());
				return http.requestAsync(new RequestOptions(
					"POST",
					"/users/" + userId + "/background",
					null,
					jsonBody,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					byteFields,
					/* isSearch */ false
				)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersBackgroundUploadResponse.class));
			} else {
				return http.requestAsync(new RequestOptions(
					"POST",
					"/users/" + userId + "/background",
					null,
					null,
					com.lolzteam.api.runtime.BodyEncoding.MULTIPART,
					java.util.Map.of(),
					/* isSearch */ false
				)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersBackgroundUploadResponse.class));
			}
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersBackgroundUploadResponse> backgroundUploadAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return backgroundUploadAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersBackgroundDeleteResponse backgroundDelete(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersBackgroundDeleteResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersBackgroundDeleteResponse> backgroundDeleteAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/background",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersBackgroundDeleteResponse.class));
		}
	
		public Types.UsersApiTypes.UsersBackgroundCropResponse backgroundCrop(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/background/crop",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersBackgroundCropResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersBackgroundCropResponse> backgroundCropAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersBackgroundCropBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/background/crop",
				null,
				mapper.valueToTree(body),
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersBackgroundCropResponse.class));
		}
	
		public Types.UsersApiTypes.UsersFollowersResponse followers(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersFollowersParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/followers",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersFollowersResponse.class);
		}
	
		public Types.UsersApiTypes.UsersFollowersResponse followers(com.lolzteam.api.runtime.StringOrInt userId) {
			return followers(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFollowersResponse> followersAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersFollowersParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/followers",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersFollowersResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFollowersResponse> followersAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return followersAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersFollowResponse follow(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersFollowResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFollowResponse> followAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersFollowResponse.class));
		}
	
		public Types.UsersApiTypes.UsersUnfollowResponse unfollow(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersUnfollowResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersUnfollowResponse> unfollowAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/followers",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersUnfollowResponse.class));
		}
	
		public Types.UsersApiTypes.UsersFollowingsResponse followings(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersFollowingsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/followings",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersFollowingsResponse.class);
		}
	
		public Types.UsersApiTypes.UsersFollowingsResponse followings(com.lolzteam.api.runtime.StringOrInt userId) {
			return followings(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFollowingsResponse> followingsAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersFollowingsParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/followings",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersFollowingsResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersFollowingsResponse> followingsAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return followingsAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersLikesResponse likes(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersLikesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/likes",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersLikesResponse.class);
		}
	
		public Types.UsersApiTypes.UsersLikesResponse likes(com.lolzteam.api.runtime.StringOrInt userId) {
			return likes(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersLikesResponse> likesAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersLikesParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/likes",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersLikesResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersLikesResponse> likesAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return likesAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersIgnoredResponse ignored(Types.UsersApiTypes.UsersIgnoredParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/ignored",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersIgnoredResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersIgnoredResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersIgnoredResponse> ignoredAsync() {
			return ignoredAsync(null);
		}
	
		public Types.UsersApiTypes.UsersIgnoreResponse ignore(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/users/" + userId + "/ignore",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersIgnoreResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersIgnoreResponse> ignoreAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/users/" + userId + "/ignore",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersIgnoreResponse.class));
		}
	
		public Types.UsersApiTypes.UsersIgnoreEditResponse ignoreEdit(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/users/" + userId + "/ignore",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersIgnoreEditResponse.class);
		}
	
		public Types.UsersApiTypes.UsersIgnoreEditResponse ignoreEdit(com.lolzteam.api.runtime.StringOrInt userId) {
			return ignoreEdit(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersIgnoreEditResponse> ignoreEditAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersIgnoreEditParams params) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/users/" + userId + "/ignore",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersIgnoreEditResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersIgnoreEditResponse> ignoreEditAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return ignoreEditAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersUnignoreResponse unignore(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/ignore",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersUnignoreResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersUnignoreResponse> unignoreAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/users/" + userId + "/ignore",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersUnignoreResponse.class));
		}
	
		public Types.UsersApiTypes.UsersContentsResponse contents(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersContentsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/timeline",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersContentsResponse.class);
		}
	
		public Types.UsersApiTypes.UsersContentsResponse contents(com.lolzteam.api.runtime.StringOrInt userId) {
			return contents(userId, null);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersContentsResponse> contentsAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.UsersApiTypes.UsersContentsParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/timeline",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersContentsResponse.class));
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersContentsResponse> contentsAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return contentsAsync(userId, null);
		}
	
		public Types.UsersApiTypes.UsersTrophiesResponse trophies(com.lolzteam.api.runtime.StringOrInt userId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/trophies",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersTrophiesResponse.class);
		}
	
		public CompletableFuture<Types.UsersApiTypes.UsersTrophiesResponse> trophiesAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/trophies",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersTrophiesResponse.class));
		}
	
		public Types.UsersApiTypes.UsersSecretAnswerTypesResponse secretAnswerTypes() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/secret-answer/types",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersSecretAnswerTypesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersSecretAnswerTypesResponse.class));
		}
	
		public Types.UsersApiTypes.UsersSaResetResponse saReset() {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/account/secret-answer/reset",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersSaResetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersSaResetResponse.class));
		}
	
		public Types.UsersApiTypes.UsersSaCancelResetResponse saCancelReset() {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/account/secret-answer/reset",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.UsersApiTypes.UsersSaCancelResetResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.UsersApiTypes.UsersSaCancelResetResponse.class));
		}
	}

	public static class ProfilePostsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ProfilePostsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsListResponse list(com.lolzteam.api.runtime.StringOrInt userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/users/" + userId + "/profile-posts",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsListResponse.class);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsListResponse list(com.lolzteam.api.runtime.StringOrInt userId) {
			return list(userId, null);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsListResponse> listAsync(com.lolzteam.api.runtime.StringOrInt userId, Types.ProfilePostsApiTypes.ProfilePostsListParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/users/" + userId + "/profile-posts",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsListResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsListResponse> listAsync(com.lolzteam.api.runtime.StringOrInt userId) {
			return listAsync(userId, null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsGetResponse get(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsGetResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsGetResponse> getAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsGetResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsEditResponse edit(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/profile-posts/" + profilePostId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsEditResponse.class);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsEditResponse edit(long profilePostId) {
			return edit(profilePostId, null);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsEditResponse> editAsync(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/profile-posts/" + profilePostId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsEditResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsEditResponse> editAsync(long profilePostId) {
			return editAsync(profilePostId, null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse delete(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse.class);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse delete(long profilePostId) {
			return delete(profilePostId, null);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse> deleteAsync(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsDeleteParams params) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsDeleteResponse> deleteAsync(long profilePostId) {
			return deleteAsync(profilePostId, null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse reportReasons(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/report",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse> reportReasonsAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/report",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsReportReasonsResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsReportResponse report(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsReportResponse.class);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsReportResponse report(long profilePostId) {
			return report(profilePostId, null);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportResponse> reportAsync(long profilePostId, Types.ProfilePostsApiTypes.ProfilePostsReportBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsReportResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsReportResponse> reportAsync(long profilePostId) {
			return reportAsync(profilePostId, null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCreateResponse create(Types.ProfilePostsApiTypes.ProfilePostsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCreateResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsStickResponse stick(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsStickResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsStickResponse> stickAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsStickResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse unstick(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse> unstickAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsUnstickResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsLikesResponse likes(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsLikesResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsLikesResponse> likesAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsLikesResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsLikeResponse like(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsLikeResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsLikeResponse> likeAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsLikeResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse unlike(long profilePostId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse> unlikeAsync(long profilePostId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/profile-posts/" + profilePostId + "/likes",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsUnlikeResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse commentsList(Types.ProfilePostsApiTypes.ProfilePostsCommentsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/profile-posts/comments",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsListResponse> commentsListAsync() {
			return commentsListAsync(null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse commentsCreate(Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsCreateResponse> commentsCreateAsync() {
			return commentsCreateAsync(null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse commentsEdit(Types.ProfilePostsApiTypes.ProfilePostsCommentsEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/profile-posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsEditResponse> commentsEditAsync() {
			return commentsEditAsync(null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse commentsDelete(Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/profile-posts/comments",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsDeleteResponse> commentsDeleteAsync() {
			return commentsDeleteAsync(null);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse commentsGet(long profilePostId, long commentId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/comments/" + commentId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse.class);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse> commentsGetAsync(long profilePostId, long commentId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/profile-posts/" + profilePostId + "/comments/" + commentId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsGetResponse.class));
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse commentsReport(long commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/profile-posts/comments/" + commentId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse.class);
		}
	
		public Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse commentsReport(long commentId) {
			return commentsReport(commentId, null);
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse> commentsReportAsync(long commentId, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/profile-posts/comments/" + commentId + "/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse.class));
		}
	
		public CompletableFuture<Types.ProfilePostsApiTypes.ProfilePostsCommentsReportResponse> commentsReportAsync(long commentId) {
			return commentsReportAsync(commentId, null);
		}
	}

	public static class ConversationsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ConversationsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ConversationsApiTypes.ConversationsListResponse list(Types.ConversationsApiTypes.ConversationsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/conversations",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsListResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsCreateResponse create(Types.ConversationsApiTypes.ConversationsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsCreateResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsCreateResponse> createAsync() {
			return createAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsUpdateResponse update(Types.ConversationsApiTypes.ConversationsUpdateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/conversations",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsUpdateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsUpdateResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsUpdateResponse> updateAsync() {
			return updateAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsDeleteResponse delete(Types.ConversationsApiTypes.ConversationsDeleteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/conversations",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsDeleteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsDeleteResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsDeleteResponse> deleteAsync() {
			return deleteAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsStartResponse start(Types.ConversationsApiTypes.ConversationsStartBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/start",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsStartResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsStartResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsStartResponse> startAsync() {
			return startAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsSaveResponse save(Types.ConversationsApiTypes.ConversationsSaveBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/save",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsSaveResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsSaveResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsSaveResponse> saveAsync() {
			return saveAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsGetResponse get(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/conversations/" + conversationId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsGetResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsGetResponse> getAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/conversations/" + conversationId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsGetResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesListResponse messagesList(long conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/conversations/" + conversationId + "/messages",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesListResponse.class);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesListResponse messagesList(long conversationId) {
			return messagesList(conversationId, null);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesListResponse> messagesListAsync(long conversationId, Types.ConversationsApiTypes.ConversationsMessagesListParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/conversations/" + conversationId + "/messages",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesListResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesListResponse> messagesListAsync(long conversationId) {
			return messagesListAsync(conversationId, null);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesCreateResponse messagesCreate(long conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/messages",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesCreateResponse.class);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesCreateResponse messagesCreate(long conversationId) {
			return messagesCreate(conversationId, null);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesCreateResponse> messagesCreateAsync(long conversationId, Types.ConversationsApiTypes.ConversationsMessagesCreateBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/messages",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesCreateResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesCreateResponse> messagesCreateAsync(long conversationId) {
			return messagesCreateAsync(conversationId, null);
		}
	
		public Types.ConversationsApiTypes.ConversationsSearchResponse search(Types.ConversationsApiTypes.ConversationsSearchBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/search",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsSearchResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsSearchResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsSearchResponse> searchAsync() {
			return searchAsync(null);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesGetResponse messagesGet(long messageId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/conversations/messages/" + messageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesGetResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesGetResponse> messagesGetAsync(long messageId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/conversations/messages/" + messageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesGetResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesEditResponse messagesEdit(long conversationId, long messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/conversations/" + conversationId + "/messages/" + messageId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesEditResponse.class);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesEditResponse messagesEdit(long conversationId, long messageId) {
			return messagesEdit(conversationId, messageId, null);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesEditResponse> messagesEditAsync(long conversationId, long messageId, Types.ConversationsApiTypes.ConversationsMessagesEditBody body) {
			return http.requestAsync(new RequestOptions(
				"PUT",
				"/conversations/" + conversationId + "/messages/" + messageId,
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesEditResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesEditResponse> messagesEditAsync(long conversationId, long messageId) {
			return messagesEditAsync(conversationId, messageId, null);
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse messagesDelete(long conversationId, long messageId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/messages/" + messageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse> messagesDeleteAsync(long conversationId, long messageId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/messages/" + messageId,
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesDeleteResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsInviteResponse invite(long conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/invite",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsInviteResponse.class);
		}
	
		public Types.ConversationsApiTypes.ConversationsInviteResponse invite(long conversationId) {
			return invite(conversationId, null);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsInviteResponse> inviteAsync(long conversationId, Types.ConversationsApiTypes.ConversationsInviteBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/invite",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsInviteResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsInviteResponse> inviteAsync(long conversationId) {
			return inviteAsync(conversationId, null);
		}
	
		public Types.ConversationsApiTypes.ConversationsKickResponse kick(long conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/kick",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsKickResponse.class);
		}
	
		public Types.ConversationsApiTypes.ConversationsKickResponse kick(long conversationId) {
			return kick(conversationId, null);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsKickResponse> kickAsync(long conversationId, Types.ConversationsApiTypes.ConversationsKickBody body) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/kick",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsKickResponse.class));
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsKickResponse> kickAsync(long conversationId) {
			return kickAsync(conversationId, null);
		}
	
		public Types.ConversationsApiTypes.ConversationsReadResponse read(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/read",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsReadResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsReadResponse> readAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/read",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsReadResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsReadAllResponse readAll() {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/read-all",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsReadAllResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsReadAllResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesStickResponse messagesStick(long conversationId, long messageId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesStickResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesStickResponse> messagesStickAsync(long conversationId, long messageId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesStickResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse messagesUnstick(long conversationId, long messageId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse> messagesUnstickAsync(long conversationId, long messageId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/messages/" + messageId + "/stick",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsMessagesUnstickResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsStarResponse star(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsStarResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsStarResponse> starAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsStarResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsUnstarResponse unstar(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsUnstarResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsUnstarResponse> unstarAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/star",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsUnstarResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsAlertsEnableResponse alertsEnable(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/alerts",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsAlertsEnableResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsAlertsEnableResponse> alertsEnableAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"POST",
				"/conversations/" + conversationId + "/alerts",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsAlertsEnableResponse.class));
		}
	
		public Types.ConversationsApiTypes.ConversationsAlertsDisableResponse alertsDisable(long conversationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/alerts",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ConversationsApiTypes.ConversationsAlertsDisableResponse.class);
		}
	
		public CompletableFuture<Types.ConversationsApiTypes.ConversationsAlertsDisableResponse> alertsDisableAsync(long conversationId) {
			return http.requestAsync(new RequestOptions(
				"DELETE",
				"/conversations/" + conversationId + "/alerts",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.ConversationsApiTypes.ConversationsAlertsDisableResponse.class));
		}
	}

	public static class NotificationsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public NotificationsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.NotificationsApiTypes.NotificationsListResponse list(Types.NotificationsApiTypes.NotificationsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/notifications",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.NotificationsApiTypes.NotificationsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.NotificationsApiTypes.NotificationsListResponse.class));
		}
	
		public CompletableFuture<Types.NotificationsApiTypes.NotificationsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.NotificationsApiTypes.NotificationsGetResponse get(long notificationId) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/notifications/" + notificationId + "/content",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.NotificationsApiTypes.NotificationsGetResponse.class);
		}
	
		public CompletableFuture<Types.NotificationsApiTypes.NotificationsGetResponse> getAsync(long notificationId) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/notifications/" + notificationId + "/content",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.NotificationsApiTypes.NotificationsGetResponse.class));
		}
	
		public Types.NotificationsApiTypes.NotificationsReadResponse read(Types.NotificationsApiTypes.NotificationsReadBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/notifications/read",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.NotificationsApiTypes.NotificationsReadResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.NotificationsApiTypes.NotificationsReadResponse.class));
		}
	
		public CompletableFuture<Types.NotificationsApiTypes.NotificationsReadResponse> readAsync() {
			return readAsync(null);
		}
	}

	public static class TagsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public TagsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.TagsApiTypes.TagsPopularResponse popular() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/tags",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.TagsApiTypes.TagsPopularResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.TagsApiTypes.TagsPopularResponse.class));
		}
	
		public Types.TagsApiTypes.TagsListResponse list(Types.TagsApiTypes.TagsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/tags/list",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.TagsApiTypes.TagsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.TagsApiTypes.TagsListResponse.class));
		}
	
		public CompletableFuture<Types.TagsApiTypes.TagsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.TagsApiTypes.TagsGetResponse get(long tagId, Types.TagsApiTypes.TagsGetParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/tags/" + tagId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.TagsApiTypes.TagsGetResponse.class);
		}
	
		public Types.TagsApiTypes.TagsGetResponse get(long tagId) {
			return get(tagId, null);
		}
	
		public CompletableFuture<Types.TagsApiTypes.TagsGetResponse> getAsync(long tagId, Types.TagsApiTypes.TagsGetParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/tags/" + tagId,
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.TagsApiTypes.TagsGetResponse.class));
		}
	
		public CompletableFuture<Types.TagsApiTypes.TagsGetResponse> getAsync(long tagId) {
			return getAsync(tagId, null);
		}
	
		public Types.TagsApiTypes.TagsFindResponse find(Types.TagsApiTypes.TagsFindParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/tags/find",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.TagsApiTypes.TagsFindResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.TagsApiTypes.TagsFindResponse.class));
		}
	
		public CompletableFuture<Types.TagsApiTypes.TagsFindResponse> findAsync() {
			return findAsync(null);
		}
	}

	public static class SearchApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public SearchApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.SearchApiTypes.SearchAllResponse all(Types.SearchApiTypes.SearchAllBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchAllResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchAllResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchAllResponse> allAsync() {
			return allAsync(null);
		}
	
		public Types.SearchApiTypes.SearchThreadsResponse threads(Types.SearchApiTypes.SearchThreadsBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search/threads",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchThreadsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchThreadsResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchThreadsResponse> threadsAsync() {
			return threadsAsync(null);
		}
	
		public Types.SearchApiTypes.SearchPostsResponse posts(Types.SearchApiTypes.SearchPostsBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search/posts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchPostsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchPostsResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchPostsResponse> postsAsync() {
			return postsAsync(null);
		}
	
		public Types.SearchApiTypes.SearchUsersResponse users(Types.SearchApiTypes.SearchUsersBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search/users",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchUsersResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchUsersResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchUsersResponse> usersAsync() {
			return usersAsync(null);
		}
	
		public Types.SearchApiTypes.SearchProfilePostsResponse profilePosts(Types.SearchApiTypes.SearchProfilePostsBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search/profile-posts",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchProfilePostsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchProfilePostsResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchProfilePostsResponse> profilePostsAsync() {
			return profilePostsAsync(null);
		}
	
		public Types.SearchApiTypes.SearchTaggedResponse tagged(Types.SearchApiTypes.SearchTaggedBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/search/tagged",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchTaggedResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchTaggedResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchTaggedResponse> taggedAsync() {
			return taggedAsync(null);
		}
	
		public Types.SearchApiTypes.SearchResultsResponse results(com.lolzteam.api.runtime.StringOrInt searchId, Types.SearchApiTypes.SearchResultsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/search/" + searchId + "/results",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.SearchApiTypes.SearchResultsResponse.class);
		}
	
		public Types.SearchApiTypes.SearchResultsResponse results(com.lolzteam.api.runtime.StringOrInt searchId) {
			return results(searchId, null);
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchResultsResponse> resultsAsync(com.lolzteam.api.runtime.StringOrInt searchId, Types.SearchApiTypes.SearchResultsParams params) {
			return http.requestAsync(new RequestOptions(
				"GET",
				"/search/" + searchId + "/results",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)).thenApply(node -> mapper.convertValue(node, Types.SearchApiTypes.SearchResultsResponse.class));
		}
	
		public CompletableFuture<Types.SearchApiTypes.SearchResultsResponse> resultsAsync(com.lolzteam.api.runtime.StringOrInt searchId) {
			return resultsAsync(searchId, null);
		}
	}

	public static class BatchApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public BatchApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.BatchApiTypes.BatchExecuteResponse execute(List<JsonNode> body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/batch",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.BatchApiTypes.BatchExecuteResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.BatchApiTypes.BatchExecuteResponse.class));
		}
	
		public CompletableFuture<Types.BatchApiTypes.BatchExecuteResponse> executeAsync() {
			return executeAsync(null);
		}
	}

	public static class ChatboxApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public ChatboxApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.ChatboxApiTypes.ChatboxIndexResponse index(Types.ChatboxApiTypes.ChatboxIndexParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxIndexResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxIndexResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxIndexResponse> indexAsync() {
			return indexAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxGetMessagesResponse getMessages(Types.ChatboxApiTypes.ChatboxGetMessagesParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox/messages",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxGetMessagesResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxGetMessagesResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetMessagesResponse> getMessagesAsync() {
			return getMessagesAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxPostMessageResponse postMessage(Types.ChatboxApiTypes.ChatboxPostMessageBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/chatbox/messages",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxPostMessageResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxPostMessageResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostMessageResponse> postMessageAsync() {
			return postMessageAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxEditMessageResponse editMessage(Types.ChatboxApiTypes.ChatboxEditMessageBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"PUT",
				"/chatbox/messages",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxEditMessageResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxEditMessageResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxEditMessageResponse> editMessageAsync() {
			return editMessageAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxDeleteMessageResponse deleteMessage(Types.ChatboxApiTypes.ChatboxDeleteMessageBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/chatbox/messages",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxDeleteMessageResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxDeleteMessageResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteMessageResponse> deleteMessageAsync() {
			return deleteMessageAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxOnlineResponse online(Types.ChatboxApiTypes.ChatboxOnlineParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox/messages/online",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxOnlineResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxOnlineResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxOnlineResponse> onlineAsync() {
			return onlineAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxReportReasonsResponse reportReasons(Types.ChatboxApiTypes.ChatboxReportReasonsParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox/messages/report",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxReportReasonsResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxReportReasonsResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportReasonsResponse> reportReasonsAsync() {
			return reportReasonsAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxReportResponse report(Types.ChatboxApiTypes.ChatboxReportBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/chatbox/messages/report",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxReportResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxReportResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxReportResponse> reportAsync() {
			return reportAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse getLeaderboard(Types.ChatboxApiTypes.ChatboxGetLeaderboardParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox/messages/leaderboard",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxGetLeaderboardResponse> getLeaderboardAsync() {
			return getLeaderboardAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxGetIgnoreResponse getIgnore() {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/chatbox/ignore",
				null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxGetIgnoreResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxGetIgnoreResponse.class));
		}
	
		public Types.ChatboxApiTypes.ChatboxPostIgnoreResponse postIgnore(Types.ChatboxApiTypes.ChatboxPostIgnoreBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/chatbox/ignore",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxPostIgnoreResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxPostIgnoreResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxPostIgnoreResponse> postIgnoreAsync() {
			return postIgnoreAsync(null);
		}
	
		public Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse deleteIgnore(Types.ChatboxApiTypes.ChatboxDeleteIgnoreBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"DELETE",
				"/chatbox/ignore",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse.class));
		}
	
		public CompletableFuture<Types.ChatboxApiTypes.ChatboxDeleteIgnoreResponse> deleteIgnoreAsync() {
			return deleteIgnoreAsync(null);
		}
	}

	public static class FormsApi {
	
		private final LolzteamHttpClient http;
		private final com.fasterxml.jackson.databind.ObjectMapper mapper;
	
		public FormsApi(LolzteamHttpClient http) {
			this.http = http;
			this.mapper = http.objectMapper();
		}
	
		public Types.FormsApiTypes.FormsListResponse list(Types.FormsApiTypes.FormsListParams params) {
			return mapper.convertValue(http.request(new RequestOptions(
				"GET",
				"/forms",
				params != null ? mapper.valueToTree(params) : null,
				null,
				com.lolzteam.api.runtime.BodyEncoding.FORM,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.FormsApiTypes.FormsListResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.FormsApiTypes.FormsListResponse.class));
		}
	
		public CompletableFuture<Types.FormsApiTypes.FormsListResponse> listAsync() {
			return listAsync(null);
		}
	
		public Types.FormsApiTypes.FormsCreateResponse create(Types.FormsApiTypes.FormsCreateBody body) {
			return mapper.convertValue(http.request(new RequestOptions(
				"POST",
				"/forms/save",
				null,
				body != null ? mapper.valueToTree(body) : null,
				com.lolzteam.api.runtime.BodyEncoding.JSON,
				java.util.Map.of(),
				/* isSearch */ false
			)), Types.FormsApiTypes.FormsCreateResponse.class);
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
			)).thenApply(node -> mapper.convertValue(node, Types.FormsApiTypes.FormsCreateResponse.class));
		}
	
		public CompletableFuture<Types.FormsApiTypes.FormsCreateResponse> createAsync() {
			return createAsync(null);
		}
	}

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

	public static ForumClient create(String token) {
		return new ForumClient(ClientConfig.builder(token).build());
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
