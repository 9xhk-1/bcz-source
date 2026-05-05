# UserStudyApiService — 学习核心服务

> 逆向来源：`com/baicizhan/online/user_study_api/UserStudyApiService.java`（APK 7.8.14）

---

## 一、服务概览

| 项目 | 说明 |
|------|------|
| **服务名** | `user_study` |
| **主端点** | `https://learn.baicizhan.com/rpc/user_study` |
| **备用端点** | `https://learn.bczeducation.cn/rpc/user_study` |
| **协议** | Apache Thrift TCompactProtocol + TFramedTransport over HTTPS |
| **HTTP 方法** | POST |
| **URL 格式** | `{endpoint}/{method_name}/{timestamp_ms}` |
| **认证** | Cookie（需携带 `access_token`） |

---

## 二、方法一览

### 2.1 用户基本信息

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `user_basic_info` | — | `UserBasicInfoPlus` | 获取用户基本信息（含学习数据） |
| `user_basic_info_v2` | — | `UserBasicInfoPlusV2` | 获取用户基本信息 v2 |
| `user_limit_info` | — | `UserLimitInfo` | 获取用户限制信息 |
| `user_limit_info_v2` | — | `UserLimitInfoV2` | 获取用户限制信息 v2 |
| `get_achievement` | — | `UserAchievement` | 获取用户成就 |

### 2.2 词书相关

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `select_book` | `book_id: int, daily_plan_count: int, review_plan_count: int, mode: int, group_count: int` | `UserSelectedBookInfo` | 选择词书/设置学习计划 |
| `get_all_books_basic_info` | — | `UserBookListInfo` | 获取所有词书基本信息 |
| `get_all_books_basic_info_v2` | — | `UserBookListInfo` | 获取所有词书基本信息 v2 |
| `get_all_books_basic_info_v3` | — | `UserBookListInfo` | 获取所有词书基本信息 v3 |
| `get_book_description` | `book_id: int` | `String` | 获取词书描述 |
| `get_book_mode` | `book_id: int` | `int` | 获取词书学习模式 |
| `book_mode_list` | — | `List<ModeDetail>` | 获取词书模式列表 |
| `get_books_replace_info` | — | `List<BookReplaceInfo>` | 获取词书替换信息 |
| `get_books_japan` | — | `UserBookInfoJapan` | 获取日语词书信息 |
| `get_all_selected_book_plan_info` | — | `List<SelectBookPlanInfo>` | 获取所有已选词书计划 |
| `get_payed_books` | — | `List<Integer>` | 获取已购词书列表 |
| `get_books_replace_info` | — | `List<BookReplaceInfo>` | 获取词书替换信息 |
| `get_word_list_status` | `book_id: int` | `List<WordListItem>` | 获取词表状态 |
| `cut_word_list` | `book_id: int, topic_ids: List<Integer>` | `List<WordListItem>` | 裁剪词表（标记已知单词） |
| `cancel_cut_word_list` | `book_id: int, topic_ids: List<Integer>` | `List<WordListItem>` | 取消裁剪词表 |
| `get_learned_words_list` | `book_id: int` | `List<UserLearnedWordInfo>` | 获取已学单词列表 |
| `relearn_word_list` | `book_id: int, topic_ids: List<Integer>` | `List<WordListItem>` | 重学指定词列表 |
| `roadmap_by_word_level_v2` | `book_id: int` | `List<UserRoadMapElementV2>` | 获取词书学习路线图 v2 |
| `merge_already_learned_words` | `book_id: int` | `int` | 合并已学单词 |
| `merge_already_learned_words_async` | `book_id: int, old_book_ids: List<Integer>` | `String` | 异步合并已学单词 |
| `get_merge_state` | `id2: String` | `MergeState` | 查询合并状态 |
| `upgrade_4in1` | `book_id: int` | `void` | 升级四合一模式 |
| `report_finish_book` | `book_id: int` | `void` | 上报词书完成 |
| `user_finish_book_faunt` | `word_level_id: int, review_round: int` | `UserFinishBookFlauntInfo` | 完书炫耀信息 |
| `get_primary_school_mode_config` | — | `PrimarySchoolModeConfig` | 获取小学模式配置 |
| `set_primary_school_mode_config` | `state: int` | `void` | 设置小学模式配置 |

### 2.3 学习进度与数据

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `update_done_data` | `last_sync_at: long, arr_done_records: List<UserDoneWordRecord>, current_word_level_id: int, is_today_completed: boolean` | `int` | 上报学习完成数据（核心同步接口） |
| `get_study_home` | — | `StudyHome` | 获取学习首页数据 |
| `get_study_home_v2` | `book_id: int` | `StudyHomeV2` | 获取学习首页数据 v2 |
| `get_recommendation` | — | `Recommendation` | 获取推荐内容 |
| `get_user_study_config` | — | `UserStudyConfig` | 获取学习配置 |
| `get_user_study_mode` | — | `UserStudyMode` | 获取学习模式 |
| `set_study_spell_mode` | `spell_mode: int` | `int` | 设置拼写模式 |
| `set_study_fast_mode` | `fast_mode: int` | `int` | 设置快速模式 |
| `set_study_listening_mode` | `listening_mode: int` | `int` | 设置听力模式 |
| `set_study_chn_mode` | `chn_mode: int` | `int` | 设置中文模式 |
| `set_study_extra_config` | `extra_config: String` | `int` | 设置额外学习配置（JSON字符串） |
| `study_addition` | `add_count: int, add_type: int` | `void` | 增加今日学习量 |
| `exam_change_mode` | `mode: int` | `void` | 切换考试模式 |
| `delete_done_score_data` | `book_id: int` | `int` | 删除完成分数数据 |
| `reset_done_score_data` | `book_id: int` | `int` | 重置完成分数数据 |
| `submit_experience_record` | `records: List<StudyExperienceRecord>` | `void` | 提交经验值记录 |
| `get_rank_info` | — | `ExperienceRankInfo` | 获取经验值排行榜信息 |
| `get_rank_detail` | — | `ExperienceRankDetail` | 获取排行榜详情 |
| `get_first_day_test_task_result` | — | `FirstDayTestTaskResult` | 获取首日测试结果 |
| `upload_task_action` | `req: List<TaskUploadReq>` | `void` | 上传任务行为记录 |
| `get_daily_task` | — | `DailyTask` | 获取每日任务 |
| `receive_task_award` | `task_id: int` | `String` | 领取任务奖励 |
| `credit_task_center` | — | `CreditCenter` | 获取积分任务中心 |
| `show_color_egg` | `what: int` | `int` | 触发彩蛋 |
| `submit_win_streak_records` | `client_date: int, win_streak_dates: List<Integer>` | `void` | 提交连胜记录 |
| `win_streak_status` | `client_date: int` | `WinStreakStatus` | 获取连胜状态 |
| `get_main_page_js` | — | `MainPageJS` | 获取首页 JS 配置 |
| `get_train_page_resource` | — | `TrainPageResources` | 获取训练页面资源 |
| `get_search_page_resource` | `search_modules: List<Integer>` | `List<SearchPageResources>` | 获取搜索页面资源 |
| `submit_topic_correction` | `req: TopicCorrectionReq` | `void` | 提交单词纠错 |

### 2.4 打卡（Daka）

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `user_daka_v2` | `daka_request: UserDakaRequest` | `UserDakaShareInfo` | 用户打卡 v2 |
| `get_daka_base_info` | `begin_date: UserDakaDate, end_date: UserDakaDate` | `UserDakaBaseInfo` | 获取打卡基本信息 |
| `daka_rescue` | `timestamp: long, minute_timezone: long` | `DakaRescueInfo` | 打卡补救 |
| `daka_rescue_by_str` | `yyyyMMdd: String, minute_timezone: long` | `DakaRescueInfo` | 打卡补救（按日期字符串） |
| `get_daka_background_datas` | `topic_ids: List<Integer>` | `DakaBackgroundData` | 获取打卡背景图数据 |
| `share_bonus` | `client_timestamp_ms: long` | `DakaShareBonusResult` | 分享打卡奖励 |
| `share_bonus_v2` | `req: DakaShareBonusReq` | `DakaShareBonusResult` | 分享打卡奖励 v2 |

### 2.5 日历

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_calendar_daily_info` | `date: int, page_offset: int, page_size: int` | `CalendarDailyInfo` | 获取日历每日信息 |
| `get_calendar_resign_info` | — | `CalendarResignInfo` | 获取日历补签信息 |

### 2.6 收藏单词

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `add_collect_words` | `words: List<UserCollectWord>, last_updated_at: long` | `int` | 添加收藏单词 |
| `delete_collect_words` | `words: List<UserCollectWord>, last_updated_at: long` | `int` | 删除收藏单词 |
| `get_all_collect_words_v2` | — | `List<UserCollectWordV2>` | 获取所有收藏单词 v2 |
| `get_collect_words_updated_at` | — | `long` | 获取收藏单词最后更新时间 |

### 2.7 单词笔记

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_word_note` | `topic_ids: List<Integer>` | `List<WordNote>` | 获取单词笔记 |
| `get_word_note_version` | `topic_ids: List<Integer>` | `Map<Integer, Integer>` | 获取笔记版本号 |
| `update_word_note` | `note: WordNote` | `void` | 更新单词笔记 |
| `delete_word_note` | `topic_id: int` | `void` | 删除单词笔记 |

### 2.8 积分与宝箱

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `can_open_box` | `client_timestamp_ms: long` | `boolean` | 检查是否可以开宝箱 |
| `open_box` | `client_timestamp_ms: long` | `OpenBoxResult` | 开宝箱 |
| `copper_exchange` | `req: CopperExchangeReq` | `CopperExchangeRsp` | 铜币兑换 |
| `get_copper_exchange_info` | `type: int` | `CopperExchangeInfo` | 获取铜币兑换信息 |

### 2.9 图片上传

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `upload_img` | `img: ByteBuffer` | `String` | 上传图片，返回图片 URL |

---

## 三、核心接口详解

### `update_done_data` — 上报学习完成数据

这是学习流程的核心同步接口，在完成每组学习后调用。

```
POST https://learn.baicizhan.com/rpc/user_study/update_done_data/{timestamp_ms}
```

**参数说明：**

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `last_sync_at` | long | 上次同步时间戳（毫秒） |
| `arr_done_records` | List\<UserDoneWordRecord\> | 学习完成的单词记录列表 |
| `current_word_level_id` | int | 当前词书 ID |
| `is_today_completed` | boolean | 今日学习是否完成 |

**UserDoneWordRecord 结构：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `topic_id` | int | 单词 ID |
| `done_at` | long | 完成时间戳 |
| `score` | int | 得分 |

**返回值：** `int`（同步状态码）

---

### `select_book` — 选择词书

```
POST https://learn.baicizhan.com/rpc/user_study/select_book/{timestamp_ms}
```

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `book_id` | int | 词书 ID |
| `daily_plan_count` | int | 每日新学单词数 |
| `review_plan_count` | int | 每日复习单词数 |
| `mode` | int | 学习模式（0=标准，1=快速等） |
| `group_count` | int | 每组单词数 |

**返回：** `UserSelectedBookInfo`（选择结果）

---

### `user_daka_v2` — 用户打卡

```
POST https://learn.baicizhan.com/rpc/user_study/user_daka_v2/{timestamp_ms}
```

**UserDakaRequest 字段：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `book_id` | int | 词书 ID |
| `daka_date` | UserDakaDate | 打卡日期 |
| `word_count` | int | 学习单词数 |
| `share_info` | ... | 分享信息（可选） |

**返回：** `UserDakaShareInfo`（打卡分享信息）

---

## 四、异常说明

所有方法均可能抛出：

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误 |
| `LogicException` | 业务逻辑错误 |
| `TException` | Thrift 传输/协议错误 |
