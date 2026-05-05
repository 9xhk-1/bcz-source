# 其他服务 API 文档

> 逆向来源：APK 7.8.14 逆向分析，仅供网络安全研究目的。

> **说明：** 部分服务已拆分至独立文档：
> - UserBookService → [docs/user_book.md](user_book.md)
> - AdvertiseApiService → [docs/advertise_api.md](advertise_api.md)
> - MallProxyService / AvatarApiService / PkApiService → [docs/mall_avatar_pk.md](mall_avatar_pk.md)
> - UserAssistantApiService / UserActivityApiService → [docs/user_assistant_activity.md](user_assistant_activity.md)
>
> 本文件保留 CourseApiService 及系统类服务的完整文档。

---

## CourseApiService

**端点：** `https://learn.baicizhan.com/rpc/course`  
**备用：** `https://learn.bczeducation.cn/rpc/course`

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_vocab_live_info` | `course_id: int, article_id: int` | `VocabLiveInfo` | 获取词汇直播信息 |
| `polling_info` | `course_id: int, article_id: int` | `Message` | 轮询课程直播状态 |
| `livedone` | `course_id: int, article_id: int` | `void` | 标记直播已完成 |
| `get_mark_book_list` | `paper_id: int` | `List<MarkTopicInfo>` | 获取标记词书列表 |
| `delete_mark_word` | `topic_id: int, paper_id: int` | `void` | 删除标记单词 |
| `get_improve_video_info` | `chapter_id: long` | `ImproveVideoInfo` | 获取提升视频信息 |
| `submit_improve_chapter_done` | `chapter_done_info: ImproveChapterDoneReq` | `void` | 提交提升章节完成状态 |
| `feedback` | `req: FeedBackReq` | `void` | 提交课程反馈 |
| `submitugc` | `req: CommentReq` | `void` | 提交用户评论 |

---

## UserBookService

**端点：** `https://booklist.baicizhan.com/rpc/user_book`  
**备用：** `https://booklist.bczeducation.cn/rpc/user_book`

词书管理和设备绑定服务。

### 词书管理

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_user_books` | — | `UserBookInfo` | 获取用户自建词书列表 |
| `add_user_book` | `book_name: String` | `UserBookItem` | 创建自建词书 |
| `add_user_book_v2` | `req: AddBookReq` | `UserBookItem` | 创建自建词书 v2 |
| `add_user_book_by_code` | `share_code: String` | `UserBookItem` | 通过分享码添加词书 |
| `delete_user_book` | `user_book_id: long` | `long` | 删除自建词书 |
| `update_user_book_name` | `book_name: String, user_book_id: long` | `UserBookItem` | 重命名词书 |
| `update_user_book_info` | `req: UpdateBookReq` | `UserBookItem` | 更新词书信息 |
| `get_user_book_words` | `user_book_id: long` | `List<UserBookWordDetail>` | 获取词书中的单词 |
| `add_word_to_books` | `word: UserBookWord, user_book_ids: List<Long>` | `AddSingleWordRsp` | 向多个词书添加单词 |
| `add_words_to_book` | `user_book_id: long, words: List<UserBookWord>` | `AddWordsRsp` | 向词书批量添加单词 |
| `add_words_to_books` | `user_book_ids: List<Long>, words: List<UserBookWord>` | `AddWordsToBooksRsp` | 批量向多个词书添加单词 |
| `delete_user_book_words` | `user_book_id: long, topic_ids: List<Integer>` | `UserBookItem` | 从词书删除单词 |
| `get_user_book_share_code` | `user_book_id: long` | `String` | 获取词书分享码 |
| `get_share_code_info` | `share_code: String` | `ShareBookInfo` | 获取分享码对应词书信息 |

### 单词匹配

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `match_words` | `content: String` | `List<UserBookWord>` | 从文本中匹配单词 |
| `match_words_v2` | `req: MatchWordReq` | `List<UserBookWord>` | 从文本匹配单词 v2 |
| `match_words_ocr` | `img: ByteBuffer` | `List<UserBookWord>` | OCR 识别图片中的单词 |
| `match_words_ocr_draw` | `img: ByteBuffer` | `List<UserBookWord>` | OCR 识别并标注图片中的单词 |

### 设备绑定（多端同步）

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_user_machine_infos` | — | `List<UserMachineInfo>` | 获取绑定设备列表 |
| `get_user_machine_infos_v2` | — | `List<UserMachineInfo>` | 获取绑定设备列表 v2 |
| `get_user_plan_book` | `device_id: long` | `UserSelectedBookInfo` | 获取指定设备的选书计划 |
| `select_user_book` | `device_id: long, user_book_id: long, daily_plan_count: int` | `void` | 为设备设置学习词书 |
| `remove_bind_machine` | `device_id: long` | `void` | 解绑设备 |
| `remove_bind_machine_v2` | `device_id: long, device_type: int` | `void` | 解绑设备 v2 |
| `rename_machine` | `device_id: long, device_name: String` | `void` | 重命名设备 |
| `rename_machine_v2` | `device_id: long, device_name: String, device_type: int` | `void` | 重命名设备 v2 |
| `get_machine_bind_hint` | — | `List<MachineBindHint>` | 获取设备绑定提示 |
| `get_device_sku_info` | — | `List<DeviceAdvInfo>` | 获取设备 SKU 广告信息 |

---

## BczSystemApiService

**端点：** `https://system.baicizhan.com/rpc/bcz_system`  
**备用：** `https://system.bczeducation.cn/rpc/bcz_system`

系统配置与版本检查服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `check_new_version` | `app_info: BczAppInfo` | `BczVersionInfo` | 检查 App 新版本 |
| `check_dict_new_version` | `app_info: BczAppInfo` | `BczVersionInfo` | 检查词典包新版本 |
| `check_ireading_new_version` | `app_info: BczAppInfo` | `BczVersionInfo` | 检查 iReading 新版本 |
| `get_app_new_version_info` | `request: AppBetaUpdateRequest` | `AppNewVersionResult` | 获取新版本详情 |
| `get_app_beta_update_info` | `request: AppBetaUpdateRequest` | `AppBetaUpdateResult` | 获取 Beta 版更新信息 |
| `check_infos` | — | `BczSystemInfos` | 批量检查系统信息 |
| `check_nav_tabs` | — | `BczNavTabs` | 检查导航栏标签配置 |
| `get_switches` | — | `BczAppSwitch` | 获取功能开关配置 |
| `get_test_flags` | — | `Map<String, Integer>` | 获取 A/B 测试标志 |
| `get_static_config` | — | `List<StaticConfig>` | 获取静态配置列表 |
| `get_guide_for_new_strategy` | — | `GuideForNewStrategy` | 获取新策略引导 |
| `get_privacy_agreement_version` | — | `PrivacyAgreementInfo` | 获取隐私协议版本 |
| `get_domain_whitelist` | — | `List<String>` | 获取域名白名单 |
| `get_domain_blacklist` | — | `List<String>` | 获取域名黑名单 |
| `get_app_feedback_info` | — | `Map<String, String>` | 获取应用反馈信息 |
| `qrcode_scan` | `qrcode: String` | `QRCodeResp` | 处理二维码扫描结果 |
| `report_event` | `jsons: List<String>` | `void` | 上报系统事件（需登录） |
| `report_event_without_login` | `jsons: List<String>` | `void` | 上报系统事件（无需登录） |

**BczAppInfo 字段：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `version_code` | int | App versionCode |
| `channel` | String | 渠道号 |
| `platform` | String | 平台（`android`） |

---

## AdvertiseApiService

**端点：** `https://advertise.baicizhan.com/rpc/advertise`  
**备用：** `https://advertise.bczeducation.cn/rpc/advertise`

广告与推广内容服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_launch_ad` | — | `BczLaunchAd` | 获取启动页广告 |
| `get_startup_ad` | `request: StartupAdRequest` | `List<StartupAd>` | 获取开屏广告列表 |
| `get_startup_ad_v2` | `request: StartupAdRequest, device_info: AdDeviceInfo` | `List<StartupAd>` | 获取开屏广告 v2（含设备信息） |
| `report_launch_ad` | `rp2: BczLaunchAdReport` | `void` | 上报启动广告展示事件 |
| `report_startup_ad_event` | `events: List<AdEvent>` | `void` | 上报开屏广告事件 |
| `get_loading_ad_info` | — | `List<AdvertiseLoadingInfo>` | 获取加载广告信息 |
| `get_loading_ad_items` | — | `List<AdvertiseLoadingItem>` | 获取加载广告条目 |
| `get_loading_imgs` | — | `List<LoadingImgInfo>` | 获取加载图片列表 |
| `get_books_ad` | — | `List<BookAd>` | 获取词书广告 |
| `get_books_ad_v2` | — | `BookAdV2` | 获取词书广告 v2 |
| `get_shopping_ad` | — | `ShoppingAd` | 获取购物广告 |
| `get_shopping_imgs` | — | `List<ShoppingImgInfo>` | 获取购物图片 |
| `get_main_view_top_banner_advs` | — | `List<MainViewTopBannerAdv>` | 获取首页顶部横幅广告 |
| `get_main_view_bottom_advs` | — | `List<MainViewBottomAdv>` | 获取首页底部广告 |
| `get_main_view_bottom_advs_v2` | — | `BottomAdvInfos` | 获取首页底部广告 v2 |
| `get_main_view_bottom_advs_v3` | `device_info: AdDeviceInfo` | `BottomAdvInfos` | 获取首页底部广告 v3 |
| `get_main_game_top_banner` | — | `MainViewGameTopAdv` | 获取游戏首页顶部横幅 |
| `get_practice_banner_adv` | — | `PracticeBannerAdv` | 获取练习横幅广告 |
| `get_practice_popup_adv` | — | `PracticePopupAdv` | 获取练习弹窗广告 |
| `get_explore_popup_adv` | — | `ExplorePopupAdv` | 获取探索弹窗广告 |
| `get_live_streaming_info` | — | `LiveStreamingInfo` | 获取直播信息 |
| `get_promotion_info` | — | `AdvertisePromotionInfo` | 获取促销信息 |
| `get_mall_tab_icon_info` | — | `MallTabInfo` | 获取商城Tab图标信息 |
| `get_third_ad` | — | `ThirdAd` | 获取第三方广告 |
| `get_custom_ads_config` | — | `int` | 获取自定义广告配置状态 |
| `set_custom_ads_config` | `state: int` | `void` | 设置自定义广告配置 |

---

## NotifyService

**端点：** `https://notify.baicizhan.com/rpc/notify`  
**备用：** `https://notify.bczeducation.cn/rpc/notify`

消息推送与提醒服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_latest_notify` | — | `NotifyResult` | 获取最新通知 |
| `get_latest_notify_v2` | `device_info: AdDeviceInfo` | `NotifyResult` | 获取最新通知 v2（含设备信息） |
| `get_remind_info` | — | `UserRemindInfo` | 获取提醒设置信息 |
| `set_remind_info` | `remind: UserRemindInfo` | `void` | 设置提醒信息 |
| `get_remind_msgs` | — | `List<UserRemindMsg>` | 获取提醒消息列表 |
| `push_confirm` | `params: PushConfirmParams` | `void` | 确认推送消息已读 |

---

## StrategyApiService

**端点：** `https://strategy.baicizhan.com/rpc/strategy`  
**备用：** 无

会员策略与权益服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_user_member_info` | — | `UserEntitlement` | 获取用户会员信息 |
| `get_user_entitlement_infos` | — | `UserEntitlementInfos` | 获取用户权益信息 |
| `get_user_entitlement_sale_info` | `source: int` | `UserEntitlementSaleInfo` | 获取权益销售信息 |
| `get_member_popup_sale_info` | — | `MemberPopupSaleInfo` | 获取会员弹窗销售信息 |
| `get_app_home_page_member_stage_info` | — | `AppHomePageMemberStageInfo` | 获取首页会员阶段信息 |
| `get_free_member` | `member_type: int` | `UserEntitlement` | 获取免费会员信息 |
| `get_user_word_energy_info` | — | `UserEntitlement` | 获取单词能量信息 |
| `get_user_sentence_energy_info` | — | `UserEntitlement` | 获取句子能量信息 |

---

## UserAssistantApiService

**端点：** `https://assistant.baicizhan.com/rpc/assistant`  
**备用：** `https://assistant.bczeducation.cn/rpc/assistant`

用户助手与辅助功能服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_exploration_items` | — | `List<ExplorationItem>` | 获取探索页面内容 |
| `analyze_clipboard` | `code: String` | `ClipboardResp` | 分析剪贴板内容（识别单词/句子） |
| `get_beta_user_types` | — | `List<Integer>` | 获取 Beta 用户类型列表 |
| `get_beta_user_types_v2` | — | `UserBetaInfo` | 获取 Beta 用户信息 v2 |
| `get_activity_updated_time` | — | `int` | 获取活动更新时间 |
| `check_feedback_msg` | `device_id: String` | `int` | 检查反馈消息状态 |
| `done_word_stat` | `book_id: int, stat_logs: List<DoneWordStatLog>` | `int` | 上报单词学习统计 |
| `get_credit` | — | `int` | 获取积分数量 |
| `huawei_pay` | `pay_info: HuaweiPayInfo` | `PayResp` | 华为支付 |

---

## MallProxyService

**端点：** `https://learn.baicizhan.com/rpc/mall/proxy`  
**备用：** 无

商城地址代理服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_user_address` | `status: int` | `List<UserAddress>` | 获取用户收货地址列表 |
| `create_user_address` | `user_address_req: UserAddressReq` | `UserAddress` | 创建收货地址 |
| `update_user_address` | `user_address_req: UserAddressReq` | `UserAddress` | 更新收货地址 |
| `delete_user_address` | `address_id: int` | `void` | 删除收货地址 |
| `choice_address` | `address_id: int` | `void` | 选择默认收货地址 |
| `get_child_address` | `parent_id: int` | `List<ChildAddress>` | 获取子地区列表 |
| `match_address` | `req: AddressMatchReq` | `AddressMatchResp` | 匹配地址 |

---

## AvatarApiService

**端点：** `https://ip-avatar.baicizhan.com/rpc/avatar`  
**备用：** 无

IP 形象与头像服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_ip` | — | `AvatarBasicInfo` | 获取 IP 形象基本信息 |
| `get_app_home_page_info` | — | `AvatarAppHomePageInfo` | 获取首页 IP 形象信息 |
| `get_gift` | — | `TravelRewardInfo` | 获取旅行奖励礼物 |
| `travel` | — | `AvatarAppHomePageInfo` | 旅行（触发 IP 形象动作） |

---

## PkApiService

**端点：** `https://pk.baicizhan.com/rpc/pk`  
**备用：** `https://pk.bczeducation.cn/rpc/pk`

PK 对战服务（获取 PK 服务器地址）。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_pk_address` | — | `String` | 获取 PK 服务器 WebSocket 地址 |
| `get_rank_pk_address` | — | `RankPkEntry` | 获取排行 PK 服务器信息 |

---

## UserActivityApiService

**端点：** `https://activity.baicizhan.com/rpc/activity`  
**备用：** `https://activity.bczeducation.cn/rpc/activity`

用户活动与导出服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_export_activity_info` | — | `ExportActivityInfo` | 获取单词导出活动信息 |
| `buy_export_quota` | — | `ExportQuota` | 购买单词导出配额 |
| `export_words` | `param: ExportParam` | `void` | 导出单词 |

---

## BczReportApiService

**端点：** `https://events.baicizhan.com/rpc/bcz_report`  
**备用：** `https://events.bczeducation.cn/rpc/bcz_report`

埋点事件上报服务。

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `report_event` | `jsons: List<String>` | `void` | 批量上报事件（需登录） |
| `report_event_without_login` | `jsons: List<String>` | `void` | 批量上报事件（无需登录） |

**说明：** 事件数据为 JSON 字符串列表，每个字符串为一个事件对象的序列化结果。

---

## 异常说明（通用）

所有服务的所有方法均可能抛出：

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误（来自 `com/baicizhan/online/thrift/basic/SystemException.java`） |
| `LogicException` | 业务逻辑错误（来自 `com/baicizhan/online/thrift/basic/LogicException.java`） |
| `TException` | Thrift 传输/协议错误 |
