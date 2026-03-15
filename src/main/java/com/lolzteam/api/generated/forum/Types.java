// Auto-generated. Do not edit manually.

package com.lolzteam.api.generated.forum;

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

		public record ForumsFollowedParams(
			Boolean total
		) {
			public ForumsFollowedParams() {
				this(null);
			}
		}

		public record ForumsEditFeedOptionsBody(
			@JsonProperty("node_ids") List<Integer> nodeIds,
			List<String> keywords
		) {
			public ForumsEditFeedOptionsBody() {
				this(null, null);
			}
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

		public record ThreadsGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsGetParams() {
				this(null);
			}
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

		public record ThreadsDeleteBody(
			String reason
		) {
			public ThreadsDeleteBody() {
				this(null);
			}
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

		public record ThreadsFollowBody(
			Boolean email
		) {
			public ThreadsFollowBody() {
				this(null);
			}
		}

		public record ThreadsFollowedParams(
			Boolean total,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public ThreadsFollowedParams() {
				this(null, null);
			}
		}

		public record ThreadsPollVoteBody(
			@JsonProperty("response_id") Integer responseId,
			@JsonProperty("response_ids") List<Integer> responseIds
		) {
			public ThreadsPollVoteBody() {
				this(null, null);
			}
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

		public record PostsCreateBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("thread_id") Integer threadId,
			@JsonProperty("quote_post_id") Integer quotePostId
		) {
			public PostsCreateBody(String postBody) {
				this(postBody, null, null);
			}
		}

		public record PostsEditBody(
			@JsonProperty("post_body") String postBody
		) {
			public PostsEditBody() {
				this(null);
			}
		}

		public record PostsDeleteBody(
			String reason
		) {
			public PostsDeleteBody() {
				this(null);
			}
		}

		public record PostsLikesParams(
			Integer page,
			Integer limit
		) {
			public PostsLikesParams() {
				this(null, null);
			}
		}

		public record PostsReportBody(
			String message
		) {
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

		public record PostsCommentsCreateBody(
			@JsonProperty("post_id") Integer postId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record PostsCommentsEditBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record PostsCommentsDeleteBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String reason
		) {
			public PostsCommentsDeleteBody(Integer postCommentId) {
				this(postCommentId, null);
			}
		}

		public record PostsCommentsReportBody(
			@JsonProperty("post_comment_id") Integer postCommentId,
			String message
		) {
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

		public record UsersFindParams(
			String username,
			@JsonProperty("custom_fields") JsonNode customFields,
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersFindParams() {
				this(null, null, null);
			}
		}

		public record UsersGetParams(
			@JsonProperty("fields_include") JsonNode fieldsInclude
		) {
			public UsersGetParams() {
				this(null);
			}
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

		public record UsersClaimsParams(
			String type,
			@JsonProperty("claim_state") String claimState
		) {
			public UsersClaimsParams() {
				this(null, null);
			}
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

		public record UsersAvatarCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersAvatarCropBody() {
				this(null, null, null);
			}
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

		public record UsersBackgroundCropBody(
			Integer x,
			Integer y,
			Integer crop
		) {
			public UsersBackgroundCropBody() {
				this(null, null, null);
			}
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

		public record UsersFollowingsParams(
			String order,
			Integer page,
			Integer limit
		) {
			public UsersFollowingsParams() {
				this(null, null, null);
			}
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

		public record UsersIgnoredParams(
			Boolean total
		) {
			public UsersIgnoredParams() {
				this(null);
			}
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

		public record UsersContentsParams(
			Integer page,
			Integer limit
		) {
			public UsersContentsParams() {
				this(null, null);
			}
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

		public record ProfilePostsEditBody(
			@JsonProperty("post_body") String postBody,
			@JsonProperty("disable_comments") Boolean disableComments
		) {
			public ProfilePostsEditBody() {
				this(null, null);
			}
		}

		public record ProfilePostsDeleteParams(
			String reason
		) {
			public ProfilePostsDeleteParams() {
				this(null);
			}
		}

		public record ProfilePostsReportBody(
			String message
		) {
		}

		public record ProfilePostsCreateBody(
			@JsonProperty("user_id") JsonNode userId,
			@JsonProperty("post_body") String postBody
		) {
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

		public record ProfilePostsCommentsCreateBody(
			@JsonProperty("profile_post_id") Integer profilePostId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record ProfilePostsCommentsEditBody(
			@JsonProperty("comment_id") Integer commentId,
			@JsonProperty("comment_body") String commentBody
		) {
		}

		public record ProfilePostsCommentsDeleteBody(
			@JsonProperty("comment_id") Integer commentId
		) {
		}

		public record ProfilePostsCommentsReportBody(
			String message
		) {
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

		public record ConversationsDeleteBody(
			@JsonProperty("conversation_id") Integer conversationId,
			@JsonProperty("delete_type") String deleteType
		) {
		}

		public record ConversationsStartBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		public record ConversationsSaveBody(
			String link
		) {
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

		public record ConversationsMessagesCreateBody(
			@JsonProperty("reply_message_id") Integer replyMessageId,
			@JsonProperty("message_body") String messageBody
		) {
			public ConversationsMessagesCreateBody(String messageBody) {
				this(null, messageBody);
			}
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

		public record ConversationsMessagesEditBody(
			@JsonProperty("message_body") String messageBody
		) {
		}

		public record ConversationsInviteBody(
			List<String> recipients
		) {
		}

		public record ConversationsKickBody(
			@JsonProperty("user_id") Integer userId
		) {
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

		public record NotificationsReadBody(
			@JsonProperty("notification_id") Integer notificationId
		) {
			public NotificationsReadBody() {
				this(null);
			}
		}

	}

	// ─── TagsApi Types ────────────────────────────────────────

	public static final class TagsApiTypes {

		private TagsApiTypes() {
		}

		public record TagsListParams(
			Integer page,
			Integer limit
		) {
			public TagsListParams() {
				this(null, null);
			}
		}

		public record TagsGetParams(
			Integer page,
			Integer limit
		) {
			public TagsGetParams() {
				this(null, null);
			}
		}

		public record TagsFindParams(
			String tag
		) {
			public TagsFindParams() {
				this(null);
			}
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

		public record SearchUsersBody(
			String q
		) {
			public SearchUsersBody() {
				this(null);
			}
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

		public record SearchResultsParams(
			Integer page,
			Integer limit
		) {
			public SearchResultsParams() {
				this(null, null);
			}
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

		public record ChatboxGetMessagesParams(
			@JsonProperty("room_id") JsonNode roomId,
			@JsonProperty("before_message_id") Integer beforeMessageId
		) {
			public ChatboxGetMessagesParams() {
				this(null, null);
			}
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

		public record ChatboxEditMessageBody(
			@JsonProperty("message_id") Integer messageId,
			String message
		) {
		}

		public record ChatboxDeleteMessageBody(
			@JsonProperty("message_id") Integer messageId
		) {
		}

		public record ChatboxOnlineParams(
			@JsonProperty("room_id") JsonNode roomId
		) {
			public ChatboxOnlineParams() {
				this(null);
			}
		}

		public record ChatboxReportReasonsParams(
			@JsonProperty("message_id") Integer messageId
		) {
			public ChatboxReportReasonsParams() {
				this(null);
			}
		}

		public record ChatboxReportBody(
			@JsonProperty("message_id") Integer messageId,
			String reason
		) {
		}

		public record ChatboxGetLeaderboardParams(
			String duration
		) {
			public ChatboxGetLeaderboardParams() {
				this(null);
			}
		}

		public record ChatboxPostIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
		}

		public record ChatboxDeleteIgnoreBody(
			@JsonProperty("user_id") JsonNode userId
		) {
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

		public record FormsCreateBody(
			@JsonProperty("form_id") String formId,
			JsonNode fields
		) {
			public FormsCreateBody() {
				this(null, null);
			}
		}

	}

}
