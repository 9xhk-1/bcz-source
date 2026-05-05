# GameApiService — 游戏服务

> 逆向来源：`com/baicizhan/online/game_api/GameApiService.java`（APK 7.8.14）

---

## 一、服务概览

| 项目 | 说明 |
|------|------|
| **服务名** | `game` |
| **主端点** | `https://game.baicizhan.com/rpc/game` |
| **备用端点** | 无 |
| **协议** | Apache Thrift TCompactProtocol + TFramedTransport over HTTPS |
| **HTTP 方法** | POST |
| **URL 格式** | `{endpoint}/{method_name}/{timestamp_ms}` |
| **认证** | Cookie（需携带 `access_token`） |

---

## 二、方法一览

### 2.1 单词岛游戏（主玩法）

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `home` | — | `StudyHomeInfo` | 获取游戏首页信息 |
| `game_home` | `book_id: int` | `GameHomeInfo` | 获取指定词书的游戏首页 |
| `select_game_book` | `book_id: int, group_count: int` | `UserPlanInfo` | 选择游戏词书 |
| `switch_game_mode` | `mode: int` | `int` | 切换游戏模式，返回当前模式值 |
| `get_roadmap` | `book_id: int` | `RoadmapInfo` | 获取词书进度路线图 |
| `get_island_roadmap` | `book_id: int` | `IslandInfo` | 获取岛屿路线图 |
| `sync_info` | `book_id: int` | `SyncInfo` | 同步游戏信息 |
| `get_equipments` | — | `EquipmentInfo` | 获取装备信息 |
| `get_worth` | — | `UserWorth` | 获取用户资产信息 |
| `get_game_config` | — | `Map<String, String>` | 获取游戏配置 |

### 2.2 游戏对局

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `start_round` | `req: RoundReq` | `RoundRsp` | 开始一局游戏 |
| `finish_round` | `req: FinishRoundReq` | `FinishRoundRsp` | 完成一局游戏 |
| `discard_round` | `round_id: String` | `long` | 放弃一局游戏 |
| `sync_combo` | `comboReq: ComboReq` | `ComboInfo` | 同步连击信息 |
| `buy_life` | `req: LifeReq` | `void` | 购买生命值 |
| `cost_compass` | `count: int` | `CostCompassRsp` | 消耗指南针 |
| `purchase` | `req: PurchaseReq` | `PurchaseRsp` | 购买游戏道具 |

### 2.3 学习记录

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `submit_study_record` | `req: SubmitRecordReq` | `long` | 提交学习记录 |
| `submit_ability_record` | `req: SubmitAbilityReq` | `void` | 提交能力值记录 |
| `get_study_record` | `req: StudyRecordReq` | `StudyRecrodRsp` | 获取学习记录 |

### 2.4 建筑/城市系统

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_building_map` | `sku_id: int` | `BuildingMap` | 获取建筑地图 |

### 2.5 句子游戏

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `sentence_home` | — | `SentenceGameHome` | 获取句子游戏首页 |
| `sentence_sku_info` | `skuId: int` | `SentenceSkuInfo` | 获取句子SKU信息 |
| `sentence_current_info` | `skuId: int` | `SentenceCurrentInfo` | 获取当前句子进度 |
| `sentence_start` | — | `EnergyInfo` | 开始句子游戏 |
| `select_sentence_sku` | `sku_id: int` | `void` | 选择句子SKU |
| `upgrade_sentence_building` | `building_id: int, building_level_id: int` | `SentenceBuildingProgress` | 升级句子建筑 |
| `upgrade_sentence_building_v2` | `sku_id: int, target_building_id: int, target_level: int` | `SentenceBuildingStatus` | 升级句子建筑 v2 |

---

## 三、核心接口详解

### `start_round` — 开始游戏

```
POST https://game.baicizhan.com/rpc/game/start_round/{timestamp_ms}
```

**RoundReq 字段：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `book_id` | int | 词书 ID |
| `round_type` | int | 对局类型 |

**返回：** `RoundRsp`（包含 `round_id` 和本局单词列表）

---

### `finish_round` — 完成游戏

```
POST https://game.baicizhan.com/rpc/game/finish_round/{timestamp_ms}
```

**FinishRoundReq 字段：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `round_id` | String | 对局 ID（由 start_round 返回） |
| `score` | int | 得分 |
| `combo_count` | int | 最大连击数 |
| `records` | List\<...> | 答题记录 |

**返回：** `FinishRoundRsp`（包含奖励信息、经验值等）

---

## 四、异常说明

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误 |
| `LogicException` | 业务逻辑错误（如生命值不足） |
| `TException` | Thrift 传输/协议错误 |
