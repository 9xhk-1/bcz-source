"""
Thrift struct field maps — all services.

All mapping tables for every struct type used in BCZ API responses.
Schema format:
  - {field_id: "field_name"}  — simple rename, value passed as-is
  - {field_id: ("field_name", NESTED_SCHEMA)}  — rename + recursively map struct
  - {field_id: ("field_name", [ITEM_SCHEMA])}  — rename + map each list element
"""

from __future__ import annotations

# ============================================================
# game_api — leaf (non-nested) structs
# ============================================================

# game_api.EnergyInfo
ENERGY_INFO = {1: "energy_cost", 2: "energy_count"}

# game_api.VipInfo
VIP_INFO = {1: "level", 2: "expire_time"}

# game_api.BookInfo
BOOK_INFO = {
    1: "book_id",
    2: "book_name",
    3: "total_count",
    4: "learned",
    5: "mastered",
    6: "cover",
    7: "status",
    8: "remain_day",
}

# game_api.TodayLearnInfo
TODAY_LEARN_INFO = {
    1: "learned",
    2: "reviewed",
    3: "first_learn_tip",
    4: "learn_more_tip",
    5: "review_more_tip",
    6: "review_no_tip",
    7: "group_plan",
    8: "finish_group",
}

# game_api.MascotInfo  (field 1 name is obfuscated in source → "background")
MASCOT_INFO = {1: "background", 2: "images"}

# game_api.CompassInfo
COMPASS_INFO = {1: "balance", 2: "cost"}

# game_api.GameUserBasicInfo
GAME_USER_BASIC_INFO = {1: "nickname", 2: "avatar"}

# game_api.RoundInfo
ROUND_INFO = {
    1: "round_id",
    2: "round_cate",
    3: "life_count",
    4: "words",
    5: "round_type",
    6: "round_time",
}

# game_api.LavaQuest  (field 3 name obfuscated → "total")
LAVA_QUEST = {
    1: "status",
    2: "current",
    3: "total",
    4: "props_remain_count",
    5: "revival_coin_cost",
    6: "end_time",
    7: "icon_img",
    8: "background_color",
    9: "border_color",
}

# game_api.SentenceBuildingProgress
SENTENCE_BUILDING_PROGRESS = {
    1: "building_id",
    2: "building_level_id",
    3: "hammer_remain",
    4: "hammer_used",
}

# game_api.SentenceLessonInfo
SENTENCE_LESSON_INFO = {1: "unit_no", 2: "lesson_no", 3: "lesson_type"}

# game_api.SentenceUserBuildingLevels
SENTENCE_USER_BUILDING_LEVELS = {1: "buildingId", 2: "currentBuildingLevel"}

# game_api.CakeModule
CAKE_MODULE = {1: "topicSize", 2: "name"}

# game_api.IsLandItem  (field 1 name obfuscated → "word_count")
IS_LAND_ITEM = {1: "word_count", 2: "island_index"}

# game_api.PropsItem
PROPS_ITEM = {1: "props_type", 2: "count"}

# game_api.StudyRecordItem
STUDY_RECORD_ITEM = {
    1: "topic_id",
    2: "stage",
    3: "is_killed",
    4: "half_time",
    5: "next_review_time",
    6: "learn_time",
    7: "last_modify_time",
    8: "correct_times",
    9: "attempt_times",
    10: "usage_time",
}

# game_api.BuildingLevelInfo
BUILDING_LEVEL_INFO = {1: "level", 2: "cost"}

# game_api.SentenceChapter
SENTENCE_CHAPTER = {
    1: "chapterId",
    2: "name",
    3: "parentId",
    4: "seqNo",
    5: "buildingId",
}

# game_api.SentenceLesson
SENTENCE_LESSON = {
    1: "lessonId",
    2: "name",
    3: "chapterId",
    4: "lessonType",
    5: "globalSeqNo",
    6: "seqNo",
}

# game_api.UserWorth
USER_WORTH = {
    1: "win_streak_days",
    2: "total_daka_days",
    3: "word_done_count",
    4: "listen_count",
    5: "reading_count",
}

# game_api.PurchaseRsp
PURCHASE_RSP = {1: "copper_before", 2: "copper_after"}

# ============================================================
# game_api — nested schemas (reference leaf schemas above)
# ============================================================

# game_api.PlanProgressInfo
PLAN_PROGRESS_INFO = {
    1: "target_round",
    2: "finish_round",
    3: ("compass_info", COMPASS_INFO),
    4: "rounds",
}

# game_api.UserDataInfo
USER_DATA_INFO = {
    1: ("vip_info", VIP_INFO),
    2: ("energy_info", ENERGY_INFO),
    3: "copper",
}

# game_api.UserPlanInfo
USER_PLAN_INFO = {
    1: ("book_info", BOOK_INFO),
    2: ("plan_progress", PLAN_PROGRESS_INFO),
    3: "plan_version",
}

# game_api.StudyHomeInfo
STUDY_HOME_INFO = {
    1: ("book", BOOK_INFO),
    2: ("learn_info", TODAY_LEARN_INFO),
    3: ("mascot", MASCOT_INFO),
}

# game_api.GameHomeInfo
GAME_HOME_INFO = {
    1: ("user_data_info", USER_DATA_INFO),
    2: ("plan_info", USER_PLAN_INFO),
    3: ("basic_info", GAME_USER_BASIC_INFO),
}

# game_api.AwardBox  (awards list items are complex/varied, not mapped further)
AWARD_BOX = {1: "awards"}

# game_api.RoundRsp
ROUND_RSP = {
    1: ("round_info", ROUND_INFO),
    2: "plan_version",
    3: "round_contiue",
    4: ("energy_info", ENERGY_INFO),
}

# game_api.FinishRoundRsp  (field 1 is deprecated "award", starts at 2)
FINISH_ROUND_RSP = {
    2: ("award_box", AWARD_BOX),
    3: "study_record_versin",
    4: "plan_version",
    5: ("user_data_info", USER_DATA_INFO),
    6: ("plan_info", USER_PLAN_INFO),
    7: ("lava_quest", LAVA_QUEST),
}

# game_api.SyncInfo
SYNC_INFO = {
    1: "island_version",
    2: "roadmap_version",
    3: "study_record_version",
    4: "plan_version",
    5: "server_time",
    6: "current_book_id",
    7: ("user_data_info", USER_DATA_INFO),
    8: "sentenceSkuId",
    9: "resource_version",
}

# game_api.StudyRecrodRsp  (IDL typo preserved)
STUDY_RECORD_RSP = {
    1: ("study_records", [STUDY_RECORD_ITEM]),
    2: "ability",
    4: "version",
}

# game_api.CostCompassRsp
COST_COMPASS_RSP = {
    1: "plan_version",
    2: ("compass_info", COMPASS_INFO),
}

# game_api.SentenceBuildingStatus
SENTENCE_BUILDING_STATUS = {
    1: "totalCoin",
    2: "spentCoin",
    3: ("userBuildingLevels", [SENTENCE_USER_BUILDING_LEVELS]),
}

# game_api.SentenceGameHome
SENTENCE_GAME_HOME = {
    1: ("energy_info", ENERGY_INFO),
    2: ("building_progress", SENTENCE_BUILDING_PROGRESS),
    3: ("lesson_info", SENTENCE_LESSON_INFO),
}

# game_api.SentenceSkuInfo
SENTENCE_SKU_INFO = {
    1: "skuId",
    2: ("chapters", [SENTENCE_CHAPTER]),
    3: ("lessons", [SENTENCE_LESSON]),
    4: "version",
    5: "languageType",
}

# game_api.SentenceCurrentInfo
SENTENCE_CURRENT_INFO = {
    1: "skuId",
    2: ("buildingStatus", SENTENCE_BUILDING_STATUS),
    3: "latestContentVersion",
    4: ("energy_info", ENERGY_INFO),
    5: "finishedLessonIds",
    6: "hideLessonIds",
}

# game_api.BuildingInfo
BUILDING_INFO = {
    1: "buildingId",
    2: ("levels", [BUILDING_LEVEL_INFO]),
}

# game_api.BuildingMap
BUILDING_MAP = {
    1: "skuId",
    2: ("buildings", [BUILDING_INFO]),
}

# game_api.RoadmapInfo
ROADMAP_INFO = {
    1: "topic_ids",
    2: "version",
    3: ("cake_modules", [CAKE_MODULE]),
}

# game_api.IslandInfo
ISLAND_INFO = {
    1: ("islands", [IS_LAND_ITEM]),
    2: "version",
}

# game_api.ComboInfo
COMBO_INFO = {
    1: "current_combo",
    2: "updateAt",
    3: ("props", [PROPS_ITEM]),
    4: "max_combo",
}

# ============================================================
# user_study_api
# ============================================================

# user_study_api.StudyHomeProgress
STUDY_HOME_PROGRESS = {1: "mastered", 2: "learned", 3: "total"}

# user_study_api.StudyHomeToday
STUDY_HOME_TODAY = {
    1: "learned",
    2: "learning_plan",
    3: "reviewed",
    4: "review_plan",
    5: "finished",
    6: "book_finished",
    7: "learning_finished_today",
    8: "learning_finished",
}

# user_study_api.HomeButton
HOME_BUTTON = {1: "type", 2: "link", 3: "msg"}

# user_study_api.StudyHome
STUDY_HOME = {
    1: ("progress", STUDY_HOME_PROGRESS),
    2: ("today_progresss", STUDY_HOME_TODAY),  # IDL typo preserved
    3: ("learning_button", HOME_BUTTON),
    4: ("review_button", HOME_BUTTON),
}

# ============================================================
# unified_user_service
# ============================================================

# unified_user_service.UserLoginResult
USER_LOGIN_RESULT = {
    1: "access_token",
    2: "is_new_user",
    3: "email",
    5: "last_device",
    6: "unique_id",
    7: "phone",
    8: "force_bind_phone",
    9: "role_new",
    10: "role",
    11: "game_mode",
}

# unified_user_service.UserProfile
USER_PROFILE = {
    1: "nickname",
    2: "gender_id",
    4: "unique_id",
}

# unified_user_service.UserTryResult
USER_TRY_RESULT = {1: "email"}

# unified_user_service.UserTryResultForWatch
USER_TRY_RESULT_WATCH = {1: "token"}

# ============================================================
# resource_api — leaf structs
# ============================================================

# resource_api.TopicKey
TOPIC_KEY = {1: "topic_id", 2: "word_level_id", 3: "tag_id"}

# resource_api.WordBasicInfo
WORD_BASIC_INFO = {
    1: "topic_id",
    2: "word",
    3: "accent_usa",
    4: "accent_uk",
    5: "accent_usa_audio_uri",
    6: "accent_uk_audio_uri",
    7: "deformation_img_uri",
    8: "etyma",
}

# resource_api.VariantInfo  (field 4 "third" obfuscated in source)
VARIANT_INFO = {
    1: "topic_id",
    2: "pl",
    3: "pl_topic_id",
    4: "third",
    5: "third_topic_id",
    6: "past",
    7: "past_topic_id",
    8: "done",
    9: "done_topic_id",
    10: "ing",
    11: "ing_topic_id",
    12: "er",
    13: "er_topic_id",
    14: "est",
    15: "est_topic_id",
    16: "prep",
    17: "prep_topic_id",
    18: "adv",
    19: "adv_topic_id",
    20: "verb",
    21: "verb_topic_id",
    22: "noun",
    23: "noun_topic_id",
    24: "adj",
    25: "adj_topic_id",
    26: "conn",
    27: "conn_topic_id",
}

# resource_api.BookResourceUpdateInfo
BOOK_RESOURCE_UPDATE_INFO = {
    1: "book_id",
    2: "zpk_updated_at",
    3: "word_fm_updated_at",
    4: "poster_updated_at",
    5: "roadmap_version",
    6: "tv_topic_updated_at",
}

# resource_api.TransResultV2
TRANS_RESULT_V2 = {1: "type", 2: "trans", 4: "trans_provider"}

# resource_api.SearchWordResultV2
SEARCH_WORD_RESULT_V2 = {1: "word", 2: "topic_id", 3: "mean_cn", 4: "accent"}

# resource_api.WordRootRes
WORD_ROOT_RES = {1: "roots", 4: "word_pack_list"}

# ============================================================
# resource_api — nested schemas
# ============================================================

# resource_api.ZpkInfo
ZPK_INFO = {
    1: ("topic_key", TOPIC_KEY),
    2: "zpk_uri",
    3: "zpk_md5",
    4: "zpk_size",
    5: "zpk_version",
}

# resource_api.WordDictV2
WORD_DICT_V2 = {
    1: ("word_basic_info", WORD_BASIC_INFO),
    2: "chn_means",
    3: "en_means",
    4: "sentences",
    5: "short_phrases",
    6: "antonyms",
    7: "synonyms",
    8: ("variant_info", VARIANT_INFO),
    9: "exams",
}

# resource_api.DictWiki
DICT_WIKI = {
    1: ("dict", WORD_DICT_V2),
    2: "origin_word",
    3: "variant_type",
}

# resource_api.TopicResourceV2
TOPIC_RESOURCE_V2 = {
    1: ("zpk_info", ZPK_INFO),
    2: ("dict", WORD_DICT_V2),
    3: ("dict_wiki", DICT_WIKI),
    5: "similar_words",
}

# ============================================================
# bcz_system_api
# ============================================================

BCZ_VERSION_INFO = {
    1: "has_new_version",
    2: "new_version",
    3: "version_url",
    4: "version_md5",
    5: "version_description",
}

APP_NEW_VERSION_RESULT = {
    1: "type",
    2: "version_description",
    3: "new_version",
}

APP_BETA_UPDATE_RESULT = {
    1: "type",
    2: "version_description",
    3: "version_url",
    4: "version_apk_md5",
    5: "new_version",
    6: "action_type",
    8: "image_index",
}

BCZ_SYSTEM_INFOS = {
    1: "res_dns",
    2: "data_dns",
    3: "other_dns",
    4: "tls_dns",
}

BCZ_NAV_TABS = {1: "tabs"}

BCZ_APP_SWITCH = {1: "allow_try_user", 2: "allow_fast_login"}

PRIVACY_AGREEMENT_INFO = {
    1: "content",
    2: "privacy_version",
    3: "privacy_urls",
}

GUIDE_FOR_NEW_STRATEGY = {
    1: "user_group",
    2: "actionSequence",
    3: "role_strategy",
    4: "action_urls",
}

QRCODE_RESP = {1: "action", 2: "message", 3: "redirect_info"}

# ============================================================
# notify
# ============================================================

USER_REMIND_INFO = {
    2: "hour",
    4: "wx_enable",
    5: "task_enable",
    6: "social_enable",
    7: "sentence_enable",
}

# ============================================================
# strategy_api — leaf structs
# ============================================================

# strategy_api.UserEntitlement
USER_ENTITLEMENT = {
    1: "entitlement_key",
    3: "max_value",
    4: "current_value",
    5: "next_recovery_time",
    6: "next_recovery_amount",
    7: "recovery_interval",
    8: "member_type",
}

# strategy_api.EntitlementMallGoodsInfo
ENTITLEMENT_MALL_GOODS_INFO = {
    1: "item_id",
    2: "sub_item_id",
    3: "app_store_id",
}

# strategy_api.EnergyAdInfo
ENERGY_AD_INFO = {1: "add_energy", 2: "remain_count"}

# strategy_api.RedHeartSaleInfo
RED_HEART_SALE_INFO = {1: "need_credit"}

# ============================================================
# strategy_api — nested schemas
# ============================================================

# strategy_api.EnergySaleInfo
ENERGY_SALE_INFO = {
    1: "buy_energy",
    2: "price",
    3: ("energy_goods_info", ENTITLEMENT_MALL_GOODS_INFO),
}

# strategy_api.MemberSaleInfo
MEMBER_SALE_INFO = {
    1: "member_type",
    2: "price",
    3: "origin_price",
    4: ("mall_goods_info", ENTITLEMENT_MALL_GOODS_INFO),
    5: "tag",
}

# strategy_api.UserEntitlementSaleInfo
USER_ENTITLEMENT_SALE_INFO = {
    1: ("member_sale_info", MEMBER_SALE_INFO),
    2: ("word_energy_sale_info", ENERGY_SALE_INFO),
    3: ("word_energy_ad_info", ENERGY_AD_INFO),
    4: ("red_heart_sale_info", RED_HEART_SALE_INFO),
    5: ("sentence_energy_sale_info", ENERGY_SALE_INFO),
    6: ("sentence_energy_ad_info", ENERGY_AD_INFO),
    7: ("member_sale_info_list", [MEMBER_SALE_INFO]),
}

# strategy_api.MemberPopupSaleInfo
MEMBER_POPUP_SALE_INFO = {
    1: "member_sale_stage",
    2: "stage_end_time",
    3: ("member_sale_info", MEMBER_SALE_INFO),
}

# strategy_api.AppHomePageMemberStageInfo
APP_HOME_PAGE_MEMBER_STAGE_INFO = {
    1: ("activity_icon_member_sale_info", MEMBER_SALE_INFO),
    2: ("popup_member_sale_info", MEMBER_POPUP_SALE_INFO),
}

# ============================================================
# advertise_api
# ============================================================

BCZ_LAUNCH_AD = {1: "own_ad", 2: "third_ad"}
BOTTOM_ADV_INFOS = {1: "carousel_banner", 2: "horizontal_banner", 3: "grid_ad"}
MAIN_VIEW_GAME_TOP_ADV = {1: "top_ad"}
PRACTICE_BANNER_ADV = {1: "id"}
PRACTICE_POPUP_ADV = {1: "id"}
EXPLORE_POPUP_ADV = {1: "id"}
BOOK_AD_V2 = {1: "homepage", 2: "wordlist"}
MALL_TAB_INFO = {1: "recommendType"}
ADVERTISE_PROMOTION_INFO = {
    1: "start_time",
    2: "end_time",
    4: "redirect_info",
    5: "btn_x",
    6: "btn_y",
    7: "btn_w",
    8: "btn_h",
}
LIVE_STREAMING_INFO = {
    1: "current_timestamp",
    2: "start_timestamp",
    3: "end_timestamp",
}
THIRD_AD = {1: "showTimes"}

# ============================================================
# mall_proxy
# ============================================================

USER_ADDRESS = {
    1: "id",
    2: "name",
    3: "mobile",
    4: "province",
    5: "city",
    6: "district",
    7: "detail",
    8: "status",
}

ADDRESS_MATCH_RESP = {
    1: "province",
    2: "city",
    3: "district",
    4: "street",
}

# ============================================================
# avatar_api — leaf structs
# ============================================================

AVATAR_BASIC_INFO = {1: "ip_type", 2: "ip_cn", 3: "ip_en", 4: "ip_tag"}

USER_CURRENT_AVATAR_INFO = {
    1: "ip_type",
    2: "ip_status",
    3: "energy",
    4: "travel_energy",
    5: "travel_area_id",
    6: "travel_return_time",
}

USER_AVATAR_RECORD_INFO = {1: "ip_type", 2: "ip_level", 3: "ip_exp"}

AVATAR_GIFT_INFO = {
    1: "gift_id",
    2: "gift_type",
    3: "gift_cn",
    4: "gift_pic",
    5: "gift_cn_pic",
    6: "gift_en_pic",
}

AVATAR_SKILL_INFO = {
    1: "skill_id",
    2: "skill_name",
    3: "skill_upgrade_text",
    4: "skill_icon",
    5: "skill_desc",
}

# avatar_api.AvatarActionInfo  (field 7 name obfuscated → "sound_effect")
AVATAR_ACTION_INFO = {
    1: "action_id",
    2: "action_type",
    3: "action_name",
    4: "action_upgrade_text",
    5: "action_icon",
    6: "action_desc",
    7: "sound_effect",
}

AVATAR_AREA_INFO = {
    1: "area_id",
    2: "area_cn",
    3: "area_en",
    4: "area_upgrade_text",
    5: "area_icon",
    6: "area_desc",
    7: "area_bg_pic",
}

AVATAR_LEVEL_INFO = {
    1: "level",
    2: "level_up_exp",
    3: "level_cookie_cost",
    4: "level_travel_time",
    5: "level_gift_prob",
    6: "unlock_skill_list",
    7: "unlock_area_list",
    8: "unlock_action_list",
}

# ============================================================
# avatar_api — nested schemas
# ============================================================

# avatar_api.AvatarAppHomePageInfo
AVATAR_APP_HOME_PAGE_INFO = {
    1: ("cur_ip_info", USER_CURRENT_AVATAR_INFO),
    2: ("ip_record_info", USER_AVATAR_RECORD_INFO),
    3: "travel_is_max",
    4: "ip_has",
    5: ("unlock_skill_list", [AVATAR_SKILL_INFO]),
    6: ("unlock_action_list", [AVATAR_ACTION_INFO]),
    7: ("cur_travel_area_info", AVATAR_AREA_INFO),
}

# avatar_api.TravelRewardInfo
TRAVEL_REWARD_INFO = {
    1: ("gift_list", [AVATAR_GIFT_INFO]),
    3: "credit",
    4: ("level_info", AVATAR_LEVEL_INFO),
}

# ============================================================
# pk_api
# ============================================================

RANK_PK_ENTRY = {1: "url", 2: "beginTime", 3: "endTime"}

# ============================================================
# assistant_api / activity_api
# ============================================================

CLIPBOARD_RESP = {1: "style", 2: "json"}
USER_BETA_INFO = {1: "beta_types", 2: "high_level_book_ids", 3: "daka_poster_book_ids"}
PAY_RESP = {
    1: "order_id",
    2: "step_pay_order_id",
    3: "no_need_pay",
    4: "pay_id",
    5: "pay_url",
    6: "pay_json",
    7: "pay_type",
}
EXPORT_ACTIVITY_INFO = {1: "template_infos", 2: "balance", 4: "banner"}
EXPORT_QUOTA = {1: "balance"}

# ============================================================
# course_api
# ============================================================

VOCAB_LIVE_INFO = {
    1: "nickname",
    2: "line_infos",
    3: "duration",
    4: "title",
    5: "discountcoupon",
    6: "answers",
    7: "emojis",
    8: "sents",
    9: "qs",
    10: "study_done",
}
MESSAGE = {1: "heart_beat", 2: "pro_contents", 3: "user_contents"}
IMPROVE_VIDEO_INFO = {
    1: "video_url",
    2: "duration",
    3: "questions",
    4: "next_url",
    5: "video_status",
}
