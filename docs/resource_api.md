# ResourceService — 词典与资源服务

> 逆向来源：`com/baicizhan/online/resource_api/ResourceService.java`（APK 7.8.14）

---

## 一、服务概览

| 项目 | 说明 |
|------|------|
| **服务名** | `resource_api` |
| **主端点** | `https://resource.baicizhan.com/rpc/resource_api` |
| **备用端点** | `https://resource.bczeducation.cn/rpc/resource_api` |
| **协议** | Apache Thrift TCompactProtocol + TFramedTransport over HTTPS |
| **HTTP 方法** | POST |
| **URL 格式** | `{endpoint}/{method_name}/{timestamp_ms}` |
| **认证** | Cookie（不强制登录，部分接口可匿名访问） |

---

## 二、方法一览

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `get_topic_resource_v2` | `key: TopicKey, channel: GetTopicResourceChannel, with_zpk: boolean, with_dict: boolean, with_dict_wiki: boolean, with_media: boolean, with_similal_words: boolean` | `TopicResourceV2` | 获取单词资源（v2，最常用） |
| `get_topic_resource_v3` | `topicId: int` | `String` | 获取单词资源 v3（JSON字符串） |
| `get_word_list_word_meta_v2` | `keys: List<TopicKey>` | `List<WordListWordMetaV2>` | 批量获取词表单词元数据 v2 |
| `get_word_list_word_meta_v3` | `book_id: int` | `List<WordListWordMetaV2>` | 获取词书所有单词元数据 v3 |
| `get_dict_by_word_v2` | `word: String` | `WordDictV2` | 按单词查询词典（v2） |
| `get_dict_wiki_by_word` | `word: String` | `DictWiki` | 获取单词 Wiki 详情 |
| `search_word_v2` | `query_str: String` | `List<SearchWordResultV2>` | 搜索单词 v2 |
| `translate_v2` | `source: String` | `TransResultV2` | 翻译文本 v2 |
| `submit_translate_bug` | `source: String, trans: String, provider: int` | `void` | 提交翻译错误反馈 |
| `word_bug_report` | `key: TopicKey, types: List<WordBugType>` | `void` | 提交单词错误反馈 |
| `get_media_by_topic_ids` | `topic_ids: List<Integer>` | `List<WordMedia>` | 批量获取单词音媒体 |
| `get_zpk_infos` | `keys: List<TopicKey>` | `List<ZpkInfo>` | 批量获取单词 ZPK 信息 |
| `get_zpk_md5s` | `keys: List<TopicKey>` | `List<ZpkMd5>` | 批量获取单词 ZPK MD5 |
| `get_word_root` | `topic_id: int` | `WordRootRes` | 获取单词词根信息 |
| `get_book_resource_update_info` | `word_level_id: int` | `BookResourceUpdateInfo` | 获取词书资源更新信息 |
| `get_word_media_update_info` | `book_id: int` | `List<WordMediaUpdateInfo>` | 获取单词媒体更新信息 |
| `get_game_word_list` | `req: GameWordReq` | `List<GameWordItem>` | 获取游戏单词列表 |
| `get_game_word_update_info` | `book_id: int` | `List<GameWordItemUpdateInfo>` | 获取游戏单词更新信息 |

---

## 三、核心接口详解

### `get_topic_resource_v2` — 获取单词资源

最常用的单词详情接口，支持按需获取各类资源。

```
POST https://resource.baicizhan.com/rpc/resource_api/get_topic_resource_v2/{timestamp_ms}
```

**参数说明：**

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `key` | TopicKey | 单词 key（包含 topic_id 和 word_level_id） |
| `channel` | GetTopicResourceChannel | 获取渠道枚举 |
| `with_zpk` | boolean | 是否包含 ZPK（音标/音频标识） |
| `with_dict` | boolean | 是否包含词典释义 |
| `with_dict_wiki` | boolean | 是否包含 Wiki 详情 |
| `with_media` | boolean | 是否包含音频/图片媒体 |
| `with_similal_words` | boolean | 是否包含近义词/形近词 |

**TopicKey 结构：**

| 字段 | 类型 | 说明 |
|------|------|------|
| `topic_id` | int | 单词 topic ID |
| `word_level_id` | int | 词书级别 ID |

**返回：** `TopicResourceV2`（包含单词、释义、例句、音频、图片等完整资源）

---

### `search_word_v2` — 搜索单词

```
POST https://resource.baicizhan.com/rpc/resource_api/search_word_v2/{timestamp_ms}
```

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `query_str` | String | 搜索关键词（英文单词或中文意思） |

**返回：** `List<SearchWordResultV2>`（搜索结果列表）

---

### `translate_v2` — 文本翻译

```
POST https://resource.baicizhan.com/rpc/resource_api/translate_v2/{timestamp_ms}
```

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `source` | String | 待翻译文本 |

**返回：** `TransResultV2`（翻译结果，含翻译文本和提供商信息）

---

### `get_dict_by_word_v2` — 词典查询

```
POST https://resource.baicizhan.com/rpc/resource_api/get_dict_by_word_v2/{timestamp_ms}
```

| 参数名 | 类型 | 说明 |
|--------|------|------|
| `word` | String | 英文单词 |

**返回：** `WordDictV2`（词典信息，含音标、词性、中英文释义等）

---

## 四、异常说明

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误 |
| `LogicException` | 业务逻辑错误 |
| `TException` | Thrift 传输/协议错误 |
