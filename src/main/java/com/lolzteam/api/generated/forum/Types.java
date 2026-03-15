// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

public final class Types {

	private Types() {
	}

	// ─── OAuthApi Types ────────────────────────────────────────

	public static final class OAuthApiTypes {

		private OAuthApiTypes() {
		}

		public record OAuthTokenBody(
			@JsonProperty("grant_type") String grantType,
			@JsonProperty("client_id") String clientId,
			@JsonProperty("client_secret") String clientSecret,
			JsonNode scope,
			String code,
			@JsonProperty("redirect_uri") String redirectUri,
			@JsonProperty("refresh_token") String refreshToken,
			String username,
			String password
		) {
			public OAuthTokenBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		public record OAuthTokenResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public OAuthTokenResponse {}
		}

	}

	// ─── AssetsApi Types ────────────────────────────────────────

	public static final class AssetsApiTypes {

		private AssetsApiTypes() {
		}

		public record AssetsCssParams(
			List<String> css
		) {
			public AssetsCssParams() {
				this(null);
			}
		}

		public record AssetsCssResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public AssetsCssResponse {}
		}

	}

	// ─── CategoriesApi Types ────────────────────────────────────────

	public static final class CategoriesApiTypes {

		private CategoriesApiTypes() {
		}

		public record CategoriesListParams(
			@JsonProperty("parent_category_id") Integer parentCategoryId,
			@JsonProperty("parent_forum_id") Integer parentForumId,
			String order
		) {
			public CategoriesListParams() {
				this(null, null, null);
			}
		}

		public record CategoriesListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoriesListResponse {}
		}

		public record CategoriesGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public CategoriesGetResponse {}
		}

	}

	// ─── ForumsApi Types ────────────────────────────────────────

	public static final class ForumsApiTypes {

		private ForumsApiTypes() {
		}

		public record ForumsListParams(
			@JsonProperty("parent_category_id") Integer parentCategoryId,
			@JsonProperty("parent_forum_id") Integer parentForumId,
			String order
		) {
			public ForumsListParams() {
				this(null, null, null);
			}
		}

		public record ForumsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsListResponse {}
		}

		public record ForumsGroupedResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsGroupedResponse {}
		}

		public record ForumsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsGetResponse {}
		}

		public record ForumsFollowersResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsFollowersResponse {}
		}

		public record ForumsFollowBody(
			Boolean post,
			Boolean alert,
			Boolean email,
			@JsonProperty("prefix_ids") List<Integer> prefixIds,
			@JsonProperty("minimal_contest_amount") Integer minimalContestAmount
		) {
			public ForumsFollowBody() {
				this(null, null, null, null, null);
			}
		}

		public record ForumsFollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsFollowResponse {}
		}

		public record ForumsUnfollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsUnfollowResponse {}
		}

		public record ForumsFollowedParams(
			Boolean total
		) {
			public ForumsFollowedParams() {
				this(null);
			}
		}

		public record ForumsFollowedResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsFollowedResponse {}
		}

		public record ForumsGetFeedOptionsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsGetFeedOptionsResponse {}
		}

		public record ForumsEditFeedOptionsBody(
			@JsonProperty("node_ids") List<Integer> nodeIds,
			List<String> keywords
		) {
			public ForumsEditFeedOptionsBody() {
				this(null, null);
			}
		}

		public record ForumsEditFeedOptionsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ForumsEditFeedOptionsResponse {}
		}

	}

	// ─── LinksApi Types ────────────────────────────────────────

	public static final class LinksApiTypes {

		private LinksApiTypes() {
		}

		public record LinksListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public LinksListResponse {}
		}

		public record LinksGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public LinksGetResponse {}
		}

	}

	// ─── PagesApi Types ────────────────────────────────────────

	public static final class PagesApiTypes {

		private PagesApiTypes() {
		}

		public record PagesListParams(
			@JsonProperty("parent_page_id") Integer parentPageId,
			String order
		) {
			public PagesListParams() {
				this(null, null);
			}
		}

		public record PagesListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PagesListResponse {}
		}

		public record PagesGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PagesGetResponse {}
		}

	}

	// ─── NavigationApi Types ────────────────────────────────────────

	public static final class NavigationApiTypes {

		private NavigationApiTypes() {
		}

		public record NavigationListParams(
			Integer parent
		) {
			public NavigationListParams() {
				this(null);
			}
		}

		public record NavigationListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public NavigationListResponse {}
		}

	}

	// ─── ThreadsApi Types ────────────────────────────────────────

	public static final class ThreadsApiTypes {

		private ThreadsApiTypes() {
		}

		public record ThreadsListParams(
			@JsonProperty("forum_id") Integer forumId,
			String tab,
			String state,
			String period,
			String title,
			@JsonProperty("title_only") Boolean titleOnly,
			@JsonProperty("creator_user_id") Integer creatorUserId,
			Boolean sticky,
			@JsonProperty("prefix_ids[]") List<Integer> prefixIds,
			@JsonProperty("prefix_ids_not[]") List<Integer> prefixIdsNot,
			@JsonProperty("thread_tag_id") Integer threadTagId,
			Integer page,
			Integer limit,
			String order,
			String direction,
			@JsonProperty("thread_create_date") Integer threadCreateDate,
			@JsonProperty("thread_update_date") Integer threadUpdateDate,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsListParams() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		public record ThreadsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsListResponse {}
		}

		public record ThreadsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("forum_id") Integer forumId,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail
		) {
			public ThreadsCreateBody(String postBody, Integer forumId) {
				this(postBody, forumId, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		public record ThreadsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsCreateResponse {}
		}

		public record ThreadsCreateContestBody(
			@JsonProperty("post_body") String postBody,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("contest_type") String contestType,
			@JsonProperty("length_value") Integer lengthValue,
			@JsonProperty("length_option") String lengthOption,
			@JsonProperty("prize_type") String prizeType,
			@JsonProperty("count_winners") Integer countWinners,
			@JsonProperty("prize_data_money") Double prizeDataMoney,
			@JsonProperty("is_money_places") Boolean isMoneyPlaces,
			@JsonProperty("prize_data_places") List<Double> prizeDataPlaces,
			@JsonProperty("prize_data_upgrade") JsonNode prizeDataUpgrade,
			@JsonProperty("require_like_count") Integer requireLikeCount,
			@JsonProperty("require_total_like_count") Integer requireTotalLikeCount,
			@JsonProperty("secret_answer") String secretAnswer,
			List<String> tags,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail
		) {
			public ThreadsCreateContestBody(String postBody, String contestType, String prizeType, Integer requireLikeCount, Integer requireTotalLikeCount) {
				this(postBody, null, null, contestType, null, null, prizeType, null, null, null, null, null, requireLikeCount, requireTotalLikeCount, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		public record ThreadsCreateContestResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsCreateContestResponse {}
		}

		public record ThreadsClaimBody(
			@JsonProperty("as_responder") String asResponder,
			@JsonProperty("as_is_market_deal") Boolean asIsMarketDeal,
			@JsonProperty("as_market_item_id") Integer asMarketItemId,
			@JsonProperty("as_data") String asData,
			@JsonProperty("as_amount") Double asAmount,
			String currency,
			@JsonProperty("transfer_type") String transferType,
			@JsonProperty("pay_claim") String payClaim,
			@JsonProperty("as_funds_receipt") String asFundsReceipt,
			@JsonProperty("as_tg_login_screenshot") String asTgLoginScreenshot,
			List<String> tags,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup,
			@JsonProperty("dont_alert_followers") Boolean dontAlertFollowers,
			@JsonProperty("schedule_date") String scheduleDate,
			@JsonProperty("schedule_time") String scheduleTime,
			@JsonProperty("watch_thread_state") Boolean watchThreadState,
			@JsonProperty("watch_thread") Boolean watchThread,
			@JsonProperty("watch_thread_email") Boolean watchThreadEmail,
			@JsonProperty("post_body") String postBody
		) {
			public ThreadsClaimBody(String asResponder, Boolean asIsMarketDeal, Double asAmount, String transferType, String postBody) {
				this(asResponder, asIsMarketDeal, null, null, asAmount, null, transferType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, postBody);
			}
		}

		public record ThreadsClaimResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsClaimResponse {}
		}

		public record ThreadsGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsGetParams() {
				this(null);
			}
		}

		public record ThreadsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsGetResponse {}
		}

		public record ThreadsEditBody(
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			List<String> tags,
			@JsonProperty("discussion_open") Boolean discussionOpen,
			@JsonProperty("hide_contacts") Boolean hideContacts,
			@JsonProperty("allow_ask_hidden_content") Boolean allowAskHiddenContent,
			@JsonProperty("reply_group") JsonNode replyGroup,
			@JsonProperty("comment_ignore_group") Boolean commentIgnoreGroup
		) {
			public ThreadsEditBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		public record ThreadsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsEditResponse {}
		}

		public record ThreadsDeleteBody(
			String reason
		) {
			public ThreadsDeleteBody() {
				this(null);
			}
		}

		public record ThreadsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsDeleteResponse {}
		}

		public record ThreadsMoveBody(
			@JsonProperty("node_id") String nodeId,
			String title,
			@JsonProperty("title_en") String titleEn,
			@JsonProperty("prefix_id") List<Integer> prefixId,
			@JsonProperty("apply_thread_prefix") Boolean applyThreadPrefix,
			@JsonProperty("send_alert") Boolean sendAlert
		) {
			public ThreadsMoveBody(String nodeId) {
				this(nodeId, null, null, null, null, null);
			}
		}

		public record ThreadsMoveResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsMoveResponse {}
		}

		public record ThreadsBumpResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsBumpResponse {}
		}

		public record ThreadsHideResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsHideResponse {}
		}

		public record ThreadsStarResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsStarResponse {}
		}

		public record ThreadsUnstarResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsUnstarResponse {}
		}

		public record ThreadsFollowersResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsFollowersResponse {}
		}

		public record ThreadsFollowBody(
			Boolean email
		) {
			public ThreadsFollowBody() {
				this(null);
			}
		}

		public record ThreadsFollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsFollowResponse {}
		}

		public record ThreadsUnfollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsUnfollowResponse {}
		}

		public record ThreadsFollowedParams(
			Boolean total,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsFollowedParams() {
				this(null, null);
			}
		}

		public record ThreadsFollowedResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsFollowedResponse {}
		}

		public record ThreadsNavigationResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsNavigationResponse {}
		}

		public record ThreadsPollGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsPollGetResponse {}
		}

		public record ThreadsPollVoteBody(
			@JsonProperty("response_id") Integer responseId,
			@JsonProperty("response_ids") List<Integer> responseIds
		) {
			public ThreadsPollVoteBody() {
				this(null, null);
			}
		}

		public record ThreadsPollVoteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsPollVoteResponse {}
		}

		public record ThreadsUnreadParams(
			Integer limit,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public ThreadsUnreadParams() {
				this(null, null, null);
			}
		}

		public record ThreadsUnreadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsUnreadResponse {}
		}

		public record ThreadsRecentParams(
			Integer days,
			Integer limit,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public ThreadsRecentParams() {
				this(null, null, null, null);
			}
		}

		public record ThreadsRecentResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsRecentResponse {}
		}

		public record ThreadsFinishResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ThreadsFinishResponse {}
		}

	}

	// ─── PostsApi Types ────────────────────────────────────────

	public static final class PostsApiTypes {

		private PostsApiTypes() {
		}

		public record PostsListParams(
			@JsonProperty("thread_id") Integer threadId,
			@JsonProperty("page_of_post_id") Integer pageOfPostId,
			Integer page,
			Integer limit,
			String order
		) {
			public PostsListParams() {
				this(null, null, null, null, null);
			}
		}

		public record PostsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsListResponse {}
		}

		public record PostsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("thread_id") Integer threadId,
			@JsonProperty("quote_post_id") Integer quotePostId
		) {
			public PostsCreateBody(String postBody) {
				this(postBody, null, null);
			}
		}

		public record PostsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCreateResponse {}
		}

		public record PostsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsGetResponse {}
		}

		public record PostsEditBody(
			@JsonProperty("post_body") String postBody
		) {
			public PostsEditBody() {
				this(null);
			}
		}

		public record PostsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsEditResponse {}
		}

		public record PostsDeleteBody(
			String reason
		) {
			public PostsDeleteBody() {
				this(null);
			}
		}

		public record PostsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsDeleteResponse {}
		}

		public record PostsLikesParams(
			Integer page,
			Integer limit
		) {
			public PostsLikesParams() {
				this(null, null);
			}
		}

		public record PostsLikesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsLikesResponse {}
		}

		public record PostsLikeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsLikeResponse {}
		}

		public record PostsUnlikeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsUnlikeResponse {}
		}

		public record PostsReportReasonsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsReportReasonsResponse {}
		}

		public record PostsReportBody(
			String message
		) {
		}

		public record PostsReportResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsReportResponse {}
		}

		public record PostsCommentsGetParams(
			@JsonProperty("post_id") Integer postId,
			Integer before,
			@JsonProperty("before_comment") Integer beforeComment
		) {
			public PostsCommentsGetParams() {
				this(null, null, null);
			}
		}

		public record PostsCommentsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCommentsGetResponse {}
		}

		public record PostsCommentsCreateBody(
			@JsonProperty("post_id") Integer postId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record PostsCommentsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCommentsCreateResponse {}
		}

		public record PostsCommentsEditBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record PostsCommentsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCommentsEditResponse {}
		}

		public record PostsCommentsDeleteBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String reason
		) {
			public PostsCommentsDeleteBody(Integer postCommentId) {
				this(postCommentId, null);
			}
		}

		public record PostsCommentsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCommentsDeleteResponse {}
		}

		public record PostsCommentsReportBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String message
		) {
		}

		public record PostsCommentsReportResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public PostsCommentsReportResponse {}
		}

	}

	// ─── UsersApi Types ────────────────────────────────────────

	public static final class UsersApiTypes {

		private UsersApiTypes() {
		}

		public record UsersListParams(
			Integer page,
			Integer limit,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersListParams() {
				this(null, null, null);
			}
		}

		public record UsersListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersListResponse {}
		}

		public record UsersFieldsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersFieldsResponse {}
		}

		public record UsersFindParams(
			String username,
			@JsonProperty("custom_fields") JsonNode customFields,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersFindParams() {
				this(null, null, null);
			}
		}

		public record UsersFindResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersFindResponse {}
		}

		public record UsersGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersGetParams() {
				this(null);
			}
		}

		public record UsersGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersGetResponse {}
		}

		public record UsersEditBody(
			String username,
			@JsonProperty("user_title") String userTitle,
			@JsonProperty("display_group_id") Integer displayGroupId,
			@JsonProperty("display_icon_group_id") Integer displayIconGroupId,
			@JsonProperty("display_banner_id") Integer displayBannerId,
			@JsonProperty("conv_welcome_message") String convWelcomeMessage,
			@JsonProperty("user_dob_day") Integer userDobDay,
			@JsonProperty("user_dob_month") Integer userDobMonth,
			@JsonProperty("user_dob_year") Integer userDobYear,
			@JsonProperty("secret_answer") String secretAnswer,
			@JsonProperty("secret_answer_type") Integer secretAnswerType,
			@JsonProperty("short_link") String shortLink,
			@JsonProperty("language_id") JsonNode languageId,
			String gender,
			String timezone,
			@JsonProperty("receive_admin_email") Boolean receiveAdminEmail,
			@JsonProperty("activity_visible") Boolean activityVisible,
			@JsonProperty("show_dob_date") Boolean showDobDate,
			@JsonProperty("show_dob_year") Boolean showDobYear,
			@JsonProperty("hide_username_change_logs") Boolean hideUsernameChangeLogs,
			@JsonProperty("allow_view_profile") String allowViewProfile,
			@JsonProperty("allow_post_profile") String allowPostProfile,
			@JsonProperty("allow_send_personal_conversation") String allowSendPersonalConversation,
			@JsonProperty("allow_invite_group") String allowInviteGroup,
			@JsonProperty("allow_receive_news_feed") String allowReceiveNewsFeed,
			JsonNode alert,
			JsonNode fields
		) {
			public UsersEditBody() {
				this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}
		}

		public record UsersEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersEditResponse {}
		}

		public record UsersClaimsParams(
			String type,
			@JsonProperty("claim_state") String claimState
		) {
			public UsersClaimsParams() {
				this(null, null);
			}
		}

		public record UsersClaimsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersClaimsResponse {}
		}

		public record UsersAvatarUploadBody(
			byte[] avatar,
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersAvatarUploadBody(byte[] avatar) {
				this(avatar, null, null, null);
			}
		}

		public record UsersAvatarUploadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersAvatarUploadResponse {}
		}

		public record UsersAvatarDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersAvatarDeleteResponse {}
		}

		public record UsersAvatarCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersAvatarCropBody() {
				this(null, null, null);
			}
		}

		public record UsersAvatarCropResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersAvatarCropResponse {}
		}

		public record UsersBackgroundUploadBody(
			byte[] background,
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersBackgroundUploadBody(byte[] background) {
				this(background, null, null, null);
			}
		}

		public record UsersBackgroundUploadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersBackgroundUploadResponse {}
		}

		public record UsersBackgroundDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersBackgroundDeleteResponse {}
		}

		public record UsersBackgroundCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersBackgroundCropBody() {
				this(null, null, null);
			}
		}

		public record UsersBackgroundCropResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersBackgroundCropResponse {}
		}

		public record UsersFollowersParams(
			String order,
			Integer page,
			Integer limit
		) {
			public UsersFollowersParams() {
				this(null, null, null);
			}
		}

		public record UsersFollowersResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersFollowersResponse {}
		}

		public record UsersFollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersFollowResponse {}
		}

		public record UsersUnfollowResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersUnfollowResponse {}
		}

		public record UsersFollowingsParams(
			String order,
			Integer page,
			Integer limit
		) {
			public UsersFollowingsParams() {
				this(null, null, null);
			}
		}

		public record UsersFollowingsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersFollowingsResponse {}
		}

		public record UsersLikesParams(
			@JsonProperty("node_id") Integer nodeId,
			@JsonProperty("like_type") String likeType,
			String type,
			Integer page,
			@JsonProperty("content_type") String contentType,
			@JsonProperty("search_user_id") Integer searchUserId,
			Boolean stats
		) {
			public UsersLikesParams() {
				this(null, null, null, null, null, null, null);
			}
		}

		public record UsersLikesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersLikesResponse {}
		}

		public record UsersIgnoredParams(
			Boolean total
		) {
			public UsersIgnoredParams() {
				this(null);
			}
		}

		public record UsersIgnoredResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersIgnoredResponse {}
		}

		public record UsersIgnoreResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersIgnoreResponse {}
		}

		public record UsersIgnoreEditParams(
			@JsonProperty("ignore_conversations") Boolean ignoreConversations,
			@JsonProperty("ignore_content") Boolean ignoreContent,
			@JsonProperty("restrict_view_profile") Boolean restrictViewProfile
		) {
			public UsersIgnoreEditParams() {
				this(null, null, null);
			}
		}

		public record UsersIgnoreEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersIgnoreEditResponse {}
		}

		public record UsersUnignoreResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersUnignoreResponse {}
		}

		public record UsersContentsParams(
			Integer page,
			Integer limit
		) {
			public UsersContentsParams() {
				this(null, null);
			}
		}

		public record UsersContentsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersContentsResponse {}
		}

		public record UsersTrophiesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersTrophiesResponse {}
		}

		public record UsersSecretAnswerTypesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersSecretAnswerTypesResponse {}
		}

		public record UsersSaResetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersSaResetResponse {}
		}

		public record UsersSaCancelResetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public UsersSaCancelResetResponse {}
		}

	}

	// ─── ProfilePostsApi Types ────────────────────────────────────────

	public static final class ProfilePostsApiTypes {

		private ProfilePostsApiTypes() {
		}

		public record ProfilePostsListParams(
			@JsonProperty("posts_user_id") Integer postsUserId,
			Integer page,
			Integer limit,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ProfilePostsListParams() {
				this(null, null, null, null);
			}
		}

		public record ProfilePostsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsListResponse {}
		}

		public record ProfilePostsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsGetResponse {}
		}

		public record ProfilePostsEditBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("disable_comments") Boolean disableComments
		) {
			public ProfilePostsEditBody() {
				this(null, null);
			}
		}

		public record ProfilePostsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsEditResponse {}
		}

		public record ProfilePostsDeleteParams(
			String reason
		) {
			public ProfilePostsDeleteParams() {
				this(null);
			}
		}

		public record ProfilePostsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsDeleteResponse {}
		}

		public record ProfilePostsReportReasonsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsReportReasonsResponse {}
		}

		public record ProfilePostsReportBody(
			String message
		) {
		}

		public record ProfilePostsReportResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsReportResponse {}
		}

		public record ProfilePostsCreateBody(
			@JsonProperty("user_id") JsonNode userId,
			@JsonProperty("post_body") String postBody
		) {
		}

		public record ProfilePostsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCreateResponse {}
		}

		public record ProfilePostsStickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsStickResponse {}
		}

		public record ProfilePostsUnstickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsUnstickResponse {}
		}

		public record ProfilePostsLikesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsLikesResponse {}
		}

		public record ProfilePostsLikeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsLikeResponse {}
		}

		public record ProfilePostsUnlikeResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsUnlikeResponse {}
		}

		public record ProfilePostsCommentsListParams(
			@JsonProperty("profile_post_id") Integer profilePostId,
			Integer before,
			Integer limit
		) {
			public ProfilePostsCommentsListParams() {
				this(null, null, null);
			}
		}

		public record ProfilePostsCommentsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsListResponse {}
		}

		public record ProfilePostsCommentsCreateBody(
			@JsonProperty("profile_post_id") Integer profilePostId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record ProfilePostsCommentsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsCreateResponse {}
		}

		public record ProfilePostsCommentsEditBody(
			@JsonProperty("comment_id") Integer commentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record ProfilePostsCommentsEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsEditResponse {}
		}

		public record ProfilePostsCommentsDeleteBody(
			@JsonProperty("comment_id") Integer commentId
		) {
		}

		public record ProfilePostsCommentsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsDeleteResponse {}
		}

		public record ProfilePostsCommentsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsGetResponse {}
		}

		public record ProfilePostsCommentsReportBody(
			String message
		) {
		}

		public record ProfilePostsCommentsReportResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ProfilePostsCommentsReportResponse {}
		}

	}

	// ─── ConversationsApi Types ────────────────────────────────────────

	public static final class ConversationsApiTypes {

		private ConversationsApiTypes() {
		}

		public record ConversationsListParams(
			String folder,
			Integer page,
			Integer limit
		) {
			public ConversationsListParams() {
				this(null, null, null);
			}
		}

		public record ConversationsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsListResponse {}
		}

		public record ConversationsCreateBody(
			@JsonProperty("recipient_id") Integer recipientId,
			List<String> recipients,
			@JsonProperty("is_group") Boolean isGroup,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsCreateBody() {
				this(null, null, null, null, null, null, null, null, null);
			}
		}

		public record ConversationsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsCreateResponse {}
		}

		public record ConversationsUpdateBody(
			@JsonProperty("conversation_id") Integer conversationId,
			String title,
			@JsonProperty("open_invite") Boolean openInvite,
			@JsonProperty("history_open") Boolean historyOpen,
			@JsonProperty("allow_edit_messages") Boolean allowEditMessages,
			@JsonProperty("allow_sticky_messages") Boolean allowStickyMessages,
			@JsonProperty("allow_delete_own_messages") Boolean allowDeleteOwnMessages
		) {
			public ConversationsUpdateBody(Integer conversationId) {
				this(conversationId, null, null, null, null, null, null);
			}
		}

		public record ConversationsUpdateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsUpdateResponse {}
		}

		public record ConversationsDeleteBody(
			@JsonProperty("conversation_id") Integer conversationId,
			@JsonProperty("delete_type") String deleteType
		) {
		}

		public record ConversationsDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsDeleteResponse {}
		}

		public record ConversationsStartBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		public record ConversationsStartResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsStartResponse {}
		}

		public record ConversationsSaveBody(
			String link
		) {
		}

		public record ConversationsSaveResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsSaveResponse {}
		}

		public record ConversationsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsGetResponse {}
		}

		public record ConversationsMessagesListParams(
			Integer page,
			Integer limit,
			String order,
			Integer before,
			Integer after
		) {
			public ConversationsMessagesListParams() {
				this(null, null, null, null, null);
			}
		}

		public record ConversationsMessagesListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesListResponse {}
		}

		public record ConversationsMessagesCreateBody(
			@JsonProperty("reply_message_id") Integer replyMessageId,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsMessagesCreateBody(String messageBody) {
				this(null, messageBody);
			}
		}

		public record ConversationsMessagesCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesCreateResponse {}
		}

		public record ConversationsSearchBody(
			String q,
			@JsonProperty("conversation_id") Integer conversationId,
			@JsonProperty("search_recipients") Boolean searchRecipients
		) {
			public ConversationsSearchBody() {
				this(null, null, null);
			}
		}

		public record ConversationsSearchResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsSearchResponse {}
		}

		public record ConversationsMessagesGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesGetResponse {}
		}

		public record ConversationsMessagesEditBody(
			@JsonProperty("message_body") String messageBody
		) {
		}

		public record ConversationsMessagesEditResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesEditResponse {}
		}

		public record ConversationsMessagesDeleteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesDeleteResponse {}
		}

		public record ConversationsInviteBody(
			List<String> recipients
		) {
		}

		public record ConversationsInviteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsInviteResponse {}
		}

		public record ConversationsKickBody(
			@JsonProperty("user_id") Integer userId
		) {
		}

		public record ConversationsKickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsKickResponse {}
		}

		public record ConversationsReadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsReadResponse {}
		}

		public record ConversationsReadAllResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsReadAllResponse {}
		}

		public record ConversationsMessagesStickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesStickResponse {}
		}

		public record ConversationsMessagesUnstickResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsMessagesUnstickResponse {}
		}

		public record ConversationsStarResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsStarResponse {}
		}

		public record ConversationsUnstarResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsUnstarResponse {}
		}

		public record ConversationsAlertsEnableResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsAlertsEnableResponse {}
		}

		public record ConversationsAlertsDisableResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ConversationsAlertsDisableResponse {}
		}

	}

	// ─── NotificationsApi Types ────────────────────────────────────────

	public static final class NotificationsApiTypes {

		private NotificationsApiTypes() {
		}

		public record NotificationsListParams(
			String type,
			Integer page,
			Integer limit
		) {
			public NotificationsListParams() {
				this(null, null, null);
			}
		}

		public record NotificationsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public NotificationsListResponse {}
		}

		public record NotificationsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public NotificationsGetResponse {}
		}

		public record NotificationsReadBody(
			@JsonProperty("notification_id") Integer notificationId
		) {
			public NotificationsReadBody() {
				this(null);
			}
		}

		public record NotificationsReadResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public NotificationsReadResponse {}
		}

	}

	// ─── TagsApi Types ────────────────────────────────────────

	public static final class TagsApiTypes {

		private TagsApiTypes() {
		}

		public record TagsPopularResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public TagsPopularResponse {}
		}

		public record TagsListParams(
			Integer page,
			Integer limit
		) {
			public TagsListParams() {
				this(null, null);
			}
		}

		public record TagsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public TagsListResponse {}
		}

		public record TagsGetParams(
			Integer page,
			Integer limit
		) {
			public TagsGetParams() {
				this(null, null);
			}
		}

		public record TagsGetResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public TagsGetResponse {}
		}

		public record TagsFindParams(
			String tag
		) {
			public TagsFindParams() {
				this(null);
			}
		}

		public record TagsFindResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public TagsFindResponse {}
		}

	}

	// ─── SearchApi Types ────────────────────────────────────────

	public static final class SearchApiTypes {

		private SearchApiTypes() {
		}

		public record SearchAllBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit
		) {
			public SearchAllBody() {
				this(null, null, null, null, null, null);
			}
		}

		public record SearchAllResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchAllResponse {}
		}

		public record SearchThreadsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public SearchThreadsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		public record SearchThreadsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchThreadsResponse {}
		}

		public record SearchPostsBody(
			String q,
			String tag,
			@JsonProperty("forum_id") Integer forumId,
			@JsonProperty("user_id") JsonNode userId,
			Integer page,
			Integer limit,
			@JsonProperty("data_limit") Integer dataLimit
		) {
			public SearchPostsBody() {
				this(null, null, null, null, null, null, null);
			}
		}

		public record SearchPostsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchPostsResponse {}
		}

		public record SearchUsersBody(
			String q
		) {
			public SearchUsersBody() {
				this(null);
			}
		}

		public record SearchUsersResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchUsersResponse {}
		}

		public record SearchProfilePostsBody(
			String q,
			@JsonProperty("user_id") Integer userId,
			Integer page,
			Integer limit
		) {
			public SearchProfilePostsBody() {
				this(null, null, null, null);
			}
		}

		public record SearchProfilePostsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchProfilePostsResponse {}
		}

		public record SearchTaggedBody(
			String tag,
			List<String> tags,
			Integer page,
			Integer limit
		) {
			public SearchTaggedBody() {
				this(null, null, null, null);
			}
		}

		public record SearchTaggedResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchTaggedResponse {}
		}

		public record SearchResultsParams(
			Integer page,
			Integer limit
		) {
			public SearchResultsParams() {
				this(null, null);
			}
		}

		public record SearchResultsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public SearchResultsResponse {}
		}

	}

	// ─── BatchApi Types ────────────────────────────────────────

	public static final class BatchApiTypes {

		private BatchApiTypes() {
		}

		public record BatchExecuteResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public BatchExecuteResponse {}
		}

	}

	// ─── ChatboxApi Types ────────────────────────────────────────

	public static final class ChatboxApiTypes {

		private ChatboxApiTypes() {
		}

		public record ChatboxIndexParams(
			@JsonProperty("room_id") JsonNode roomId
		) {
			public ChatboxIndexParams() {
				this(null);
			}
		}

		public record ChatboxIndexResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxIndexResponse {}
		}

		public record ChatboxGetMessagesParams(
			@JsonProperty("room_id") JsonNode roomId,
			@JsonProperty("before_message_id") Integer beforeMessageId
		) {
			public ChatboxGetMessagesParams() {
				this(null, null);
			}
		}

		public record ChatboxGetMessagesResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxGetMessagesResponse {}
		}

		public record ChatboxPostMessageBody(
			@JsonProperty("room_id") JsonNode roomId,
			@JsonProperty("reply_message_id") Integer replyMessageId,
			String message
		) {
			public ChatboxPostMessageBody(JsonNode roomId, String message) {
				this(roomId, null, message);
			}
		}

		public record ChatboxPostMessageResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxPostMessageResponse {}
		}

		public record ChatboxEditMessageBody(
			@JsonProperty("message_id") Integer messageId,
			String message
		) {
		}

		public record ChatboxEditMessageResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxEditMessageResponse {}
		}

		public record ChatboxDeleteMessageBody(
			@JsonProperty("message_id") Integer messageId
		) {
		}

		public record ChatboxDeleteMessageResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxDeleteMessageResponse {}
		}

		public record ChatboxOnlineParams(
			@JsonProperty("room_id") JsonNode roomId
		) {
			public ChatboxOnlineParams() {
				this(null);
			}
		}

		public record ChatboxOnlineResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxOnlineResponse {}
		}

		public record ChatboxReportReasonsParams(
			@JsonProperty("message_id") Integer messageId
		) {
			public ChatboxReportReasonsParams() {
				this(null);
			}
		}

		public record ChatboxReportReasonsResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxReportReasonsResponse {}
		}

		public record ChatboxReportBody(
			@JsonProperty("message_id") Integer messageId,
			String reason
		) {
		}

		public record ChatboxReportResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxReportResponse {}
		}

		public record ChatboxGetLeaderboardParams(
			String duration
		) {
			public ChatboxGetLeaderboardParams() {
				this(null);
			}
		}

		public record ChatboxGetLeaderboardResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxGetLeaderboardResponse {}
		}

		public record ChatboxGetIgnoreResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxGetIgnoreResponse {}
		}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		public record ChatboxPostIgnoreResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxPostIgnoreResponse {}
		}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		public record ChatboxDeleteIgnoreResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public ChatboxDeleteIgnoreResponse {}
		}

	}

	// ─── FormsApi Types ────────────────────────────────────────

	public static final class FormsApiTypes {

		private FormsApiTypes() {
		}

		public record FormsListParams(
			Integer page
		) {
			public FormsListParams() {
				this(null);
			}
		}

		public record FormsListResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public FormsListResponse {}
		}

		public record FormsCreateBody(
			@JsonProperty("form_id") String formId,
			JsonNode fields
		) {
			public FormsCreateBody() {
				this(null, null);
			}
		}

		public record FormsCreateResponse(JsonNode data) {
			@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
			public FormsCreateResponse {}
		}

	}

}
