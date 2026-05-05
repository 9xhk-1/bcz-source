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

相关文档：[登录与认证](login.md) · [用户学习 API](user_study_api.md) · [游戏 API](game_api.md) · [Thrift 客户端](thrift_client.md)

---

## 二、方法一览

| 方法名 | 参数摘要 | 返回类型 | 说明 |
|--------|----------|----------|------|
| `get_topic_resource_v2` | `TopicKey, channel, bool×5` | `TopicResourceV2` | 获取单词完整资源（最常用） |
| `get_topic_resource_v3` | `topicId: i32` | `String` | 获取单词资源 v3（JSON） |
| `get_word_list_word_meta_v2` | `List<TopicKey>` | `List<WordListWordMetaV2>` | 批量获取词表元数据 |
| `get_word_list_word_meta_v3` | `book_id: i32` | `List<WordListWordMetaV2>` | 获取整本词书元数据 |
| `get_dict_by_word_v2` | `word: String` | `WordDictV2` | 词典查询 |
| `get_dict_wiki_by_word` | `word: String` | `DictWiki` | 获取单词 Wiki 详情 |
| `search_word_v2` | `query_str: String` | `List<SearchWordResultV2>` | 搜索单词 |
| `translate_v2` | `source: String` | `TransResultV2` | 文本翻译 |
| `submit_translate_bug` | `source, trans, provider` | `void` | 提交翻译反馈 |
| `word_bug_report` | `TopicKey, List<WordBugType>` | `void` | 提交单词错误反馈 |
| `get_media_by_topic_ids` | `List<Integer>` | `List<WordMedia>` | 批量获取媒体资源 |
| `get_zpk_infos` | `List<TopicKey>` | `List<ZpkInfo>` | 批量获取 ZPK 信息 |
| `get_zpk_md5s` | `List<TopicKey>` | `List<ZpkMd5>` | 批量获取 ZPK MD5 |
| `get_word_root` | `topic_id: i32` | `WordRootRes` | 获取词根信息 |
| `get_book_resource_update_info` | `word_level_id: i32` | `BookResourceUpdateInfo` | 词书资源更新信息 |
| `get_word_media_update_info` | `book_id: i32` | `List<WordMediaUpdateInfo>` | 单词媒体更新信息 |
| `get_game_word_list` | `GameWordReq` | `List<GameWordItem>` | 获取游戏单词列表 |
| `get_game_word_update_info` | `book_id: i32` | `List<GameWordItemUpdateInfo>` | 游戏单词更新信息 |

---

## 三、快速开始

### TCompact 类型常量

| 常量名 | 值 | 说明 |
|--------|----|------|
| `BOOL_TRUE` | 1 | 布尔真（编码在字段头 type nibble 中） |
| `BOOL_FALSE` | 2 | 布尔假 |
| `BYTE` | 3 | 单字节整数 |
| `I16` | 4 | 16 位整数 |
| `I32` | 5 | 32 位整数（ZigZag 编码） |
| `I64` | 6 | 64 位整数（ZigZag 编码） |
| `DOUBLE` | 7 | 双精度浮点 |
| `BINARY` / `STRING` | 8 | 字节串 / UTF-8 字符串 |
| `LIST` | 9 | 列表 |
| `SET` | 10 | 集合 |
| `MAP` | 11 | 映射 |
| `STRUCT` | 12 | 嵌套结构体 |

**字段头编码规则：**
- 若 `delta = fid - prev_fid` 在 1–15 之间：`bytes([(delta << 4) | ftype])`
- 否则：`bytes([ftype]) + struct.pack('<h', fid)`

**列表头编码规则：**
- 若 `size < 15`：`bytes([(size << 4) | elem_type])`
- 否则：`bytes([0xf0 | elem_type]) + varint(size)`

### Python 辅助代码

```python
import struct, time, requests

def make_cookie(device_id="aabbccdd1234abcd", access_token=None):
    ts = int(time.time())
    serial = device_id[:5] + device_id[-5:] + time.strftime("%d%H%M%S")
    parts = [
        f"device_name=android%2FPixel6-Google",
        f"version=14", f"app_name=7081400", f"channel=official",
        f"client_time={ts}", f"device_id={device_id}",
        f"serial={serial}", f"time_zone=Asia%2FShanghai",
    ]
    if access_token:
        parts.append(f"access_token={access_token}")
    return "; ".join(parts)

def varint(n):
    buf = b''
    while True:
        if n & ~0x7f == 0:
            buf += bytes([n]); break
        buf += bytes([(n & 0x7f) | 0x80]); n >>= 7
    return buf

def zigzag32(n): return (n << 1) ^ (n >> 31)
def zigzag64(n): return (n << 1) ^ (n >> 63)
def encode_i32(n): return varint(zigzag32(n))
def encode_i64(n): return varint(zigzag64(n))
def encode_string(s):
    b = s.encode('utf-8'); return varint(len(b)) + b
def stop(): return b'\x00'

def field_header(prev_fid, fid, ftype):
    delta = fid - prev_fid
    if 1 <= delta <= 15:
        return bytes([(delta << 4) | ftype])
    else:
        return bytes([ftype]) + struct.pack('<h', fid)

def build_call(method, args_bytes, seq=0):
    hdr = b'\x82\x21' + varint(seq) + encode_string(method)
    body = hdr + args_bytes + stop()
    return struct.pack('>I', len(body)) + body

def call_api(base_url, method, args_bytes, cookie):
    url = f"{base_url}/{method}/{int(time.time()*1000)}"
    r = requests.post(url, data=build_call(method, args_bytes),
                      headers={'Content-Type':'application/x-thrift','Cookie':cookie})
    return r.content[4:]

def read_varint(data, pos):
    result, shift = 0, 0
    while True:
        b = data[pos]; pos += 1
        result |= (b & 0x7f) << shift
        if not (b & 0x80): break
        shift += 7
    return result, pos

def unzigzag32(n): return (n >> 1) ^ -(n & 1)
def unzigzag64(n): return (n >> 1) ^ -(n & 1)
def read_i32(data, pos):
    v, pos = read_varint(data, pos); return unzigzag32(v), pos
def read_i64(data, pos):
    v, pos = read_varint(data, pos); return unzigzag64(v), pos
def read_string(data, pos):
    length, pos = read_varint(data, pos)
    return data[pos:pos+length].decode('utf-8'), pos+length

BASE_URL = "https://resource.baicizhan.com/rpc/resource_api"
```

---

## 四、接口详解

---

## get_topic_resource_v2

> `https://resource.baicizhan.com/rpc/resource_api/get_topic_resource_v2/{timestamp_ms}`

*请求方式：POST*

获取单词完整资源的核心接口（v2）。支持按需开关各类子资源，是应用中调用最频繁的接口。

**认证方式**

Cookie 认证，匿名访问即可（无需 `access_token`）。部分资源（如个性化内容）可能需要登录态。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `key` | struct TopicKey | 单词标识 | 必要 | 包含 topic_id 与 word_level_id |
| `channel` | enum GetTopicResourceChannel | 获取渠道 | 必要 | APP=0, BOOK=1, STUDY=2, GAME=3 |
| `with_zpk` | bool | 是否返回 ZPK | 非必要 | 默认 false，ZPK 为音频标识符 |
| `with_dict` | bool | 是否返回词典 | 非必要 | 默认 false |
| `with_dict_wiki` | bool | 是否返回 Wiki | 非必要 | 默认 false，数据量较大 |
| `with_media` | bool | 是否返回媒体 | 非必要 | 默认 false，含音频与图片 URL |
| `with_similal_words` | bool | 是否返回相似词 | 非必要 | 默认 false，注意原始拼写为 similal |

**TopicKey 结构体字段**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `topic_id` | i32（字段 1） | 单词 topic ID | 必要 | 全局唯一单词标识 |
| `word_level_id` | i32（字段 2） | 词书级别 ID | 必要 | 指定单词所属词书等级 |

**响应字段 TopicResourceV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic` | struct | 单词基础信息 | 含 word、meaning、phonetic 等 |
| `zpk` | string | ZPK 音频标识 | 需 with_zpk=true |
| `dict` | struct | 词典条目 | 需 with_dict=true，含词性与释义 |
| `dict_wiki` | struct | Wiki 扩展信息 | 需 with_dict_wiki=true |
| `media` | struct | 媒体资源 | 需 with_media=true，含音频与图片 URL |
| `similar_words` | struct | 相似词 | 需 with_similal_words=true，含近义词与形近词 |

**Python 示例**

```python
def encode_topic_key(topic_id, word_level_id):
    # TopicKey struct: field 1 = topic_id (I32=5), field 2 = word_level_id (I32=5)
    body = b''
    body += field_header(0, 1, 5) + encode_i32(topic_id)
    body += field_header(1, 2, 5) + encode_i32(word_level_id)
    body += stop()
    return body

def encode_get_topic_resource_v2(topic_id, word_level_id, channel=2,
                                   with_zpk=True, with_dict=True,
                                   with_dict_wiki=False, with_media=True,
                                   with_similal_words=False):
    # Args struct:
    # field 1: key (STRUCT=12)
    # field 2: channel (I32=5)
    # field 3: with_zpk (BOOL, 1=TRUE 2=FALSE in type nibble)
    # field 4: with_dict (BOOL)
    # field 5: with_dict_wiki (BOOL)
    # field 6: with_media (BOOL)
    # field 7: with_similal_words (BOOL)
    args = b''
    prev = 0
    key_bytes = encode_topic_key(topic_id, word_level_id)
    args += field_header(prev, 1, 12) + key_bytes; prev = 1
    args += field_header(prev, 2, 5) + encode_i32(channel); prev = 2
    args += bytes([(3 << 4) | (1 if with_zpk else 2)]); prev = 3
    args += bytes([(1 << 4) | (1 if with_dict else 2)]); prev = 4
    args += bytes([(1 << 4) | (1 if with_dict_wiki else 2)]); prev = 5
    args += bytes([(1 << 4) | (1 if with_media else 2)]); prev = 6
    args += bytes([(1 << 4) | (1 if with_similal_words else 2)]); prev = 7
    return args

cookie = make_cookie()  # 无需登录

args = encode_get_topic_resource_v2(
    topic_id=1, word_level_id=1001, channel=2,
    with_zpk=True, with_dict=True, with_media=True
)
resp = call_api(BASE_URL, "get_topic_resource_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "topic": {
    "topic_id": 1,
    "word": "abandon",
    "meaning": "放弃；遗弃",
    "phonetic": "/əˈbændən/",
    "word_level_id": 1001
  },
  "zpk": "abandon_us_001",
  "dict": {
    "word": "abandon",
    "phonetic_us": "/əˈbændən/",
    "phonetic_uk": "/əˈbændən/",
    "definitions": [
      { "part_of_speech": "v.", "meaning": "放弃；抛弃；遗弃" },
      { "part_of_speech": "n.", "meaning": "放任；狂热" }
    ],
    "examples": [
      { "en": "He abandoned his car on the motorway.", "zh": "他把车遗弃在高速公路上。" }
    ]
  },
  "media": {
    "audio_us": "https://cdn.baicizhan.com/audio/us/abandon.mp3",
    "audio_uk": "https://cdn.baicizhan.com/audio/uk/abandon.mp3",
    "image": "https://cdn.baicizhan.com/images/abandon.jpg"
  },
  "similar_words": {
    "synonyms": ["desert", "forsake", "relinquish"],
    "similar_spelling": ["bandana", "abundant"]
  }
}
```

</details>

---

## get_topic_resource_v3

> `https://resource.baicizhan.com/rpc/resource_api/get_topic_resource_v3/{timestamp_ms}`

*请求方式：POST*

获取单词完整资源的 v3 版本，直接返回 JSON 字符串，适合无需 Thrift 解析的场景。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `topicId` | i32 | 单词 topic ID | 必要 | 全局唯一单词标识 |

**响应字段**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| 返回值 | string | JSON 格式单词资源 | 需自行解析 JSON |

**Python 示例**

```python
def encode_get_topic_resource_v3(topic_id):
    # field 1: topicId (I32=5)
    return field_header(0, 1, 5) + encode_i32(topic_id)

args = encode_get_topic_resource_v3(topic_id=1)
resp = call_api(BASE_URL, "get_topic_resource_v3", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
"{\"topic_id\":1,\"word\":\"abandon\",\"meaning\":\"放弃；遗弃\",\"phonetic\":\"/əˈbændən/\",\"audio_us\":\"https://cdn.baicizhan.com/audio/us/abandon.mp3\"}"
```

</details>

---

## get_word_list_word_meta_v2

> `https://resource.baicizhan.com/rpc/resource_api/get_word_list_word_meta_v2/{timestamp_ms}`

*请求方式：POST*

批量获取多个单词的元数据（v2），通过 `List<TopicKey>` 指定目标单词集合。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `keys` | List\<TopicKey\> | 单词键列表 | 必要 | 每项包含 topic_id 和 word_level_id |

**TopicKey 结构体字段**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `topic_id` | i32（字段 1） | 单词 topic ID | 必要 | — |
| `word_level_id` | i32（字段 2） | 词书级别 ID | 必要 | — |

**响应字段 WordListWordMetaV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `word` | string | 英文单词 | — |
| `meaning` | string | 中文释义 | — |
| `word_level_id` | i32 | 词书级别 ID | — |

**Python 示例**

```python
def encode_topic_key_item(topic_id, word_level_id):
    body = b''
    body += field_header(0, 1, 5) + encode_i32(topic_id)
    body += field_header(1, 2, 5) + encode_i32(word_level_id)
    body += stop()
    return body

def encode_get_word_list_word_meta_v2(keys):
    # field 1: keys (LIST=9 of STRUCT=12)
    n = len(keys)
    if n < 15:
        list_hdr = bytes([(n << 4) | 12])
    else:
        list_hdr = bytes([0xf0 | 12]) + varint(n)
    items = b''.join(encode_topic_key_item(tid, wlid) for tid, wlid in keys)
    return field_header(0, 1, 9) + list_hdr + items

keys = [(1, 1001), (2, 1001), (3, 1001)]
args = encode_get_word_list_word_meta_v2(keys)
resp = call_api(BASE_URL, "get_word_list_word_meta_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1, "word": "abandon", "meaning": "放弃；遗弃", "word_level_id": 1001 },
  { "topic_id": 2, "word": "ability", "meaning": "能力；才能", "word_level_id": 1001 },
  { "topic_id": 3, "word": "abroad",  "meaning": "在国外；到国外", "word_level_id": 1001 }
]
```

</details>

---

## get_word_list_word_meta_v3

> `https://resource.baicizhan.com/rpc/resource_api/get_word_list_word_meta_v3/{timestamp_ms}`

*请求方式：POST*

一次性获取整本词书所有单词的元数据（v3）。适合本地缓存词书全量单词列表。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必要 | 对应词书的唯一标识 |

**响应字段 WordListWordMetaV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `word` | string | 英文单词 | — |
| `meaning` | string | 中文释义 | — |
| `word_level_id` | i32 | 词书级别 ID | — |

**Python 示例**

```python
def encode_get_word_list_word_meta_v3(book_id):
    # field 1: book_id (I32=5)
    return field_header(0, 1, 5) + encode_i32(book_id)

args = encode_get_word_list_word_meta_v3(book_id=1234)
resp = call_api(BASE_URL, "get_word_list_word_meta_v3", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1,    "word": "abandon",    "meaning": "放弃；遗弃",   "word_level_id": 1234 },
  { "topic_id": 2,    "word": "ability",    "meaning": "能力；才能",   "word_level_id": 1234 },
  { "topic_id": 3,    "word": "abroad",     "meaning": "在国外",       "word_level_id": 1234 }
]
```

</details>

---

## get_dict_by_word_v2

> `https://resource.baicizhan.com/rpc/resource_api/get_dict_by_word_v2/{timestamp_ms}`

*请求方式：POST*

按英文单词字符串查询词典，返回音标、词性、中英文释义及例句。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `word` | string | 英文单词 | 必要 | 大小写不敏感 |

**响应字段 WordDictV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `word` | string | 单词原形 | — |
| `phonetic_us` | string | 美式音标 | IPA 格式 |
| `phonetic_uk` | string | 英式音标 | IPA 格式 |
| `definitions` | list | 词义列表 | 每项含 part_of_speech 和 meaning |
| `examples` | list | 例句列表 | 每项含英文原句和中文译文 |

**Python 示例**

```python
def encode_get_dict_by_word_v2(word):
    # field 1: word (BINARY=8)
    return field_header(0, 1, 8) + encode_string(word)

args = encode_get_dict_by_word_v2("abandon")
resp = call_api(BASE_URL, "get_dict_by_word_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "word": "abandon",
  "phonetic_us": "/əˈbændən/",
  "phonetic_uk": "/əˈbændən/",
  "definitions": [
    { "part_of_speech": "v.", "meaning": "放弃；抛弃；遗弃" },
    { "part_of_speech": "n.", "meaning": "放任；狂热" }
  ],
  "examples": [
    {
      "en": "He abandoned his car on the motorway.",
      "zh": "他把车遗弃在高速公路上。"
    },
    {
      "en": "She abandoned herself to grief.",
      "zh": "她沉浸在悲伤中。"
    }
  ]
}
```

</details>

---

## get_dict_wiki_by_word

> `https://resource.baicizhan.com/rpc/resource_api/get_dict_wiki_by_word/{timestamp_ms}`

*请求方式：POST*

获取单词的 Wiki 扩展信息，包括词源、助记方法、词根词缀等深度内容。数据量比 `get_dict_by_word_v2` 更大。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `word` | string | 英文单词 | 必要 | — |

**响应字段 DictWiki**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `word` | string | 单词原形 | — |
| `etymology` | string | 词源说明 | 可能为空 |
| `memory_method` | string | 助记方法 | 百词斩特色记忆法 |
| `root_info` | struct | 词根词缀信息 | 可能为空 |
| `extended` | string | 扩展内容 | JSON 格式的额外信息 |

**Python 示例**

```python
def encode_get_dict_wiki_by_word(word):
    # field 1: word (BINARY=8)
    return field_header(0, 1, 8) + encode_string(word)

args = encode_get_dict_wiki_by_word("abandon")
resp = call_api(BASE_URL, "get_dict_wiki_by_word", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "word": "abandon",
  "etymology": "来自古法语 abandoner，意为"置于他人权力之下"，由 a-（表方向）+ bandon（权力、控制）构成。",
  "memory_method": "a（一个）+ band（乐队）+ on（上）→ 一个乐队上演出 → 自由放任 → 放弃",
  "root_info": {
    "roots": ["band（束缚、联结）"],
    "affixes": ["a-（加强语气）", "-on（名词后缀）"]
  }
}
```

</details>

---

## search_word_v2

> `https://resource.baicizhan.com/rpc/resource_api/search_word_v2/{timestamp_ms}`

*请求方式：POST*

搜索单词，支持英文单词或中文关键词。返回匹配的单词列表，含所属词书信息。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `query_str` | string | 搜索关键词 | 必要 | 支持英文单词或中文释义关键词 |

**响应字段 SearchWordResultV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `word` | string | 英文单词 | — |
| `meaning` | string | 中文释义 | — |
| `word_level_id` | i32 | 词书级别 ID | — |
| `book_name` | string | 所属词书名称 | — |

**Python 示例**

```python
def encode_search_word_v2(query_str):
    # field 1: query_str (BINARY=8)
    return field_header(0, 1, 8) + encode_string(query_str)

args = encode_search_word_v2("apple")
resp = call_api(BASE_URL, "search_word_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "topic_id": 512,
    "word": "apple",
    "meaning": "苹果",
    "word_level_id": 1001,
    "book_name": "小学英语词汇"
  },
  {
    "topic_id": 8043,
    "word": "apple",
    "meaning": "苹果；苹果公司",
    "word_level_id": 2005,
    "book_name": "四级核心词汇"
  }
]
```

</details>

---

## translate_v2

> `https://resource.baicizhan.com/rpc/resource_api/translate_v2/{timestamp_ms}`

*请求方式：POST*

翻译文本，支持中译英或英译中，由服务端自动判断语言方向。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `source` | string | 待翻译文本 | 必要 | 自动识别语言，支持中文/英文 |

**响应字段 TransResultV2**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `result` | string | 翻译结果 | — |
| `provider` | i32 | 翻译提供方 ID | 不同值对应不同翻译引擎 |

**Python 示例**

```python
def encode_translate_v2(source):
    # field 1: source (BINARY=8)
    return field_header(0, 1, 8) + encode_string(source)

args = encode_translate_v2("I love learning English")
resp = call_api(BASE_URL, "translate_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "result": "我热爱学习英语",
  "provider": 1
}
```

</details>

---

## submit_translate_bug

> `https://resource.baicizhan.com/rpc/resource_api/submit_translate_bug/{timestamp_ms}`

*请求方式：POST*

提交翻译错误反馈，帮助改善翻译质量。返回 void，无响应体内容。

**认证方式**

Cookie 认证，建议登录后使用。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `source` | string | 原始文本 | 必要 | 有问题的翻译源文本 |
| `trans` | string | 错误翻译 | 必要 | 当前显示的错误翻译结果 |
| `provider` | i32 | 翻译提供方 | 必要 | 与 translate_v2 返回的 provider 对应 |

**Python 示例**

```python
def encode_submit_translate_bug(source, trans, provider):
    # field 1: source (BINARY=8)
    # field 2: trans (BINARY=8)
    # field 3: provider (I32=5)
    args = field_header(0, 1, 8) + encode_string(source)
    args += field_header(1, 2, 8) + encode_string(trans)
    args += field_header(2, 3, 5) + encode_i32(provider)
    return args

args = encode_submit_translate_bug(
    source="I love learning English",
    trans="我爱学习英文",
    provider=1
)
resp = call_api(BASE_URL, "submit_translate_bug", args, cookie)
```

---

## word_bug_report

> `https://resource.baicizhan.com/rpc/resource_api/word_bug_report/{timestamp_ms}`

*请求方式：POST*

提交单词内容错误反馈，支持同时提交多种错误类型。返回 void。

**认证方式**

Cookie 认证，建议登录后使用（便于追踪反馈）。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `key` | struct TopicKey | 单词标识 | 必要 | 包含 topic_id 和 word_level_id |
| `types` | List\<WordBugType\> | 错误类型列表 | 必要 | WordBugType 为枚举值 |

**Python 示例**

```python
def encode_word_bug_report(topic_id, word_level_id, bug_types):
    # field 1: key (STRUCT=12)
    # field 2: types (LIST=9 of I32=5)
    key_bytes = encode_topic_key_item(topic_id, word_level_id)
    args = field_header(0, 1, 12) + key_bytes
    n = len(bug_types)
    list_hdr = bytes([(n << 4) | 5]) if n < 15 else bytes([0xf0 | 5]) + varint(n)
    items = b''.join(encode_i32(t) for t in bug_types)
    args += field_header(1, 2, 9) + list_hdr + items
    return args

# 示例：提交释义错误（假设 type=1 代表释义有误）
args = encode_word_bug_report(topic_id=1, word_level_id=1001, bug_types=[1])
resp = call_api(BASE_URL, "word_bug_report", args, cookie)
```

---

## get_media_by_topic_ids

> `https://resource.baicizhan.com/rpc/resource_api/get_media_by_topic_ids/{timestamp_ms}`

*请求方式：POST*

根据 topic_id 列表批量获取单词的音频和图片媒体资源 URL。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `topic_ids` | List\<i32\> | 单词 ID 列表 | 必要 | 支持批量查询 |

**响应字段 WordMedia**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `audio_us` | string | 美式发音 URL | — |
| `audio_uk` | string | 英式发音 URL | — |
| `image` | string | 配图 URL | 可能为空 |

**Python 示例**

```python
def encode_get_media_by_topic_ids(topic_ids):
    # field 1: topic_ids (LIST=9 of I32=5)
    n = len(topic_ids)
    list_hdr = bytes([(n << 4) | 5]) if n < 15 else bytes([0xf0 | 5]) + varint(n)
    items = b''.join(encode_i32(tid) for tid in topic_ids)
    return field_header(0, 1, 9) + list_hdr + items

args = encode_get_media_by_topic_ids([1, 2, 3])
resp = call_api(BASE_URL, "get_media_by_topic_ids", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "topic_id": 1,
    "audio_us": "https://cdn.baicizhan.com/audio/us/abandon.mp3",
    "audio_uk": "https://cdn.baicizhan.com/audio/uk/abandon.mp3",
    "image": "https://cdn.baicizhan.com/images/abandon.jpg"
  },
  {
    "topic_id": 2,
    "audio_us": "https://cdn.baicizhan.com/audio/us/ability.mp3",
    "audio_uk": "https://cdn.baicizhan.com/audio/uk/ability.mp3",
    "image": ""
  }
]
```

</details>

---

## get_zpk_infos

> `https://resource.baicizhan.com/rpc/resource_api/get_zpk_infos/{timestamp_ms}`

*请求方式：POST*

批量获取单词的 ZPK（Zero Pronunciation Key）音频标识信息，用于定位发音资源文件。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `keys` | List\<TopicKey\> | 单词键列表 | 必要 | 每项含 topic_id 和 word_level_id |

**响应字段 ZpkInfo**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `zpk` | string | ZPK 标识符 | 用于拼接音频资源路径 |
| `version` | i32 | 资源版本号 | 用于增量更新判断 |

**Python 示例**

```python
def encode_get_zpk_infos(keys):
    # field 1: keys (LIST=9 of STRUCT=12)
    n = len(keys)
    list_hdr = bytes([(n << 4) | 12]) if n < 15 else bytes([0xf0 | 12]) + varint(n)
    items = b''.join(encode_topic_key_item(tid, wlid) for tid, wlid in keys)
    return field_header(0, 1, 9) + list_hdr + items

args = encode_get_zpk_infos([(1, 1001), (2, 1001)])
resp = call_api(BASE_URL, "get_zpk_infos", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1, "zpk": "abandon_us_001", "version": 3 },
  { "topic_id": 2, "zpk": "ability_us_001", "version": 2 }
]
```

</details>

---

## get_zpk_md5s

> `https://resource.baicizhan.com/rpc/resource_api/get_zpk_md5s/{timestamp_ms}`

*请求方式：POST*

批量获取单词 ZPK 音频文件的 MD5 哈希，用于客户端本地缓存有效性校验。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `keys` | List\<TopicKey\> | 单词键列表 | 必要 | 每项含 topic_id 和 word_level_id |

**响应字段 ZpkMd5**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `zpk` | string | ZPK 标识符 | — |
| `md5` | string | 文件 MD5 | 32 位十六进制字符串 |

**Python 示例**

```python
def encode_get_zpk_md5s(keys):
    # field 1: keys (LIST=9 of STRUCT=12)
    n = len(keys)
    list_hdr = bytes([(n << 4) | 12]) if n < 15 else bytes([0xf0 | 12]) + varint(n)
    items = b''.join(encode_topic_key_item(tid, wlid) for tid, wlid in keys)
    return field_header(0, 1, 9) + list_hdr + items

args = encode_get_zpk_md5s([(1, 1001), (2, 1001)])
resp = call_api(BASE_URL, "get_zpk_md5s", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1, "zpk": "abandon_us_001", "md5": "d41d8cd98f00b204e9800998ecf8427e" },
  { "topic_id": 2, "zpk": "ability_us_001", "md5": "7215ee9c7d9dc229d2921a40e899ec5f" }
]
```

</details>

---

## get_word_root

> `https://resource.baicizhan.com/rpc/resource_api/get_word_root/{timestamp_ms}`

*请求方式：POST*

获取指定单词的词根词缀分析信息，帮助用户理解单词构词规律。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `topic_id` | i32 | 单词 topic ID | 必要 | — |

**响应字段 WordRootRes**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `roots` | List\<string\> | 词根列表 | 每项为一个词根及其含义 |
| `affixes` | List\<string\> | 词缀列表 | 前缀/后缀及含义 |
| `analysis` | string | 构词分析 | 完整的词根词缀拆解说明 |

**Python 示例**

```python
def encode_get_word_root(topic_id):
    # field 1: topic_id (I32=5)
    return field_header(0, 1, 5) + encode_i32(topic_id)

args = encode_get_word_root(topic_id=1)
resp = call_api(BASE_URL, "get_word_root", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "topic_id": 1,
  "roots": ["band（束缚、联结）"],
  "affixes": ["a-（加强语气，表方向）", "-on（名词后缀）"],
  "analysis": "a + band + on → 置于束缚之中 → 放弃控制权 → 遗弃"
}
```

</details>

---

## get_book_resource_update_info

> `https://resource.baicizhan.com/rpc/resource_api/get_book_resource_update_info/{timestamp_ms}`

*请求方式：POST*

查询指定词书的资源更新信息，客户端据此判断是否需要下载更新。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `word_level_id` | i32 | 词书级别 ID | 必要 | — |

**响应字段 BookResourceUpdateInfo**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `word_level_id` | i32 | 词书级别 ID | — |
| `version` | i32 | 资源版本号 | 与本地版本比较 |
| `update_time` | i64 | 更新时间戳 | Unix 毫秒时间戳 |
| `download_url` | string | 资源包下载地址 | 若有更新则返回 |
| `size` | i64 | 资源包大小（字节） | — |

**Python 示例**

```python
def encode_get_book_resource_update_info(word_level_id):
    # field 1: word_level_id (I32=5)
    return field_header(0, 1, 5) + encode_i32(word_level_id)

args = encode_get_book_resource_update_info(word_level_id=1001)
resp = call_api(BASE_URL, "get_book_resource_update_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "word_level_id": 1001,
  "version": 42,
  "update_time": 1700000000000,
  "download_url": "https://cdn.baicizhan.com/books/1001/resources_v42.zip",
  "size": 5242880
}
```

</details>

---

## get_word_media_update_info

> `https://resource.baicizhan.com/rpc/resource_api/get_word_media_update_info/{timestamp_ms}`

*请求方式：POST*

获取词书内各单词媒体资源的更新信息列表，用于增量同步。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必要 | — |

**响应字段 WordMediaUpdateInfo**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `version` | i32 | 媒体版本号 | — |
| `update_time` | i64 | 更新时间戳 | Unix 毫秒时间戳 |

**Python 示例**

```python
def encode_get_word_media_update_info(book_id):
    # field 1: book_id (I32=5)
    return field_header(0, 1, 5) + encode_i32(book_id)

args = encode_get_word_media_update_info(book_id=1234)
resp = call_api(BASE_URL, "get_word_media_update_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1, "version": 5,  "update_time": 1700000000000 },
  { "topic_id": 2, "version": 3,  "update_time": 1699000000000 },
  { "topic_id": 3, "version": 7,  "update_time": 1701000000000 }
]
```

</details>

---

## get_game_word_list

> `https://resource.baicizhan.com/rpc/resource_api/get_game_word_list/{timestamp_ms}`

*请求方式：POST*

获取游戏模式使用的单词列表，由 `GameWordReq` 指定查询条件。相关接口：[游戏 API](game_api.md)。

**认证方式**

Cookie 认证，建议登录后使用。

**请求参数 GameWordReq 结构体**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32（字段 1） | 词书 ID | 必要 | — |
| `game_type` | i32（字段 2） | 游戏类型 | 必要 | 不同游戏模式对应不同值 |
| `page` | i32（字段 3） | 页码 | 非必要 | 默认第 1 页 |
| `page_size` | i32（字段 4） | 每页数量 | 非必要 | 默认 20 |

**响应字段 GameWordItem**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `word` | string | 英文单词 | — |
| `meaning` | string | 中文释义 | — |
| `options` | List\<string\> | 干扰选项 | 用于选择题游戏 |
| `audio_url` | string | 音频 URL | — |

**Python 示例**

```python
def encode_game_word_req(book_id, game_type, page=1, page_size=20):
    # GameWordReq struct:
    # field 1: book_id (I32=5)
    # field 2: game_type (I32=5)
    # field 3: page (I32=5)
    # field 4: page_size (I32=5)
    body = b''
    body += field_header(0, 1, 5) + encode_i32(book_id)
    body += field_header(1, 2, 5) + encode_i32(game_type)
    body += field_header(2, 3, 5) + encode_i32(page)
    body += field_header(3, 4, 5) + encode_i32(page_size)
    body += stop()
    return body

def encode_get_game_word_list(book_id, game_type, page=1, page_size=20):
    # field 1: req (STRUCT=12)
    req_bytes = encode_game_word_req(book_id, game_type, page, page_size)
    return field_header(0, 1, 12) + req_bytes

args = encode_get_game_word_list(book_id=1234, game_type=1)
resp = call_api(BASE_URL, "get_game_word_list", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "topic_id": 1,
    "word": "abandon",
    "meaning": "放弃；遗弃",
    "options": ["获得", "保留", "坚持"],
    "audio_url": "https://cdn.baicizhan.com/audio/us/abandon.mp3"
  },
  {
    "topic_id": 2,
    "word": "ability",
    "meaning": "能力；才能",
    "options": ["弱点", "缺陷", "障碍"],
    "audio_url": "https://cdn.baicizhan.com/audio/us/ability.mp3"
  }
]
```

</details>

---

## get_game_word_update_info

> `https://resource.baicizhan.com/rpc/resource_api/get_game_word_update_info/{timestamp_ms}`

*请求方式：POST*

获取游戏单词数据的更新信息，客户端据此进行增量同步。相关接口：[游戏 API](game_api.md)。

**认证方式**

Cookie 认证，匿名访问即可。

**请求参数**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必要 | — |

**响应字段 GameWordItemUpdateInfo**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | i32 | 单词 ID | — |
| `version` | i32 | 数据版本号 | — |
| `update_time` | i64 | 更新时间戳 | Unix 毫秒时间戳 |

**Python 示例**

```python
def encode_get_game_word_update_info(book_id):
    # field 1: book_id (I32=5)
    return field_header(0, 1, 5) + encode_i32(book_id)

args = encode_get_game_word_update_info(book_id=1234)
resp = call_api(BASE_URL, "get_game_word_update_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 1, "version": 4,  "update_time": 1700000000000 },
  { "topic_id": 2, "version": 2,  "update_time": 1698000000000 }
]
```

</details>

---

## 五、异常说明

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误（服务不可用、内部错误等） |
| `LogicException` | 业务逻辑错误（参数非法、资源不存在等） |
| `TException` | Thrift 传输或协议层错误 |

所有异常均通过 Thrift 异常机制返回，解析时需检查响应帧中的消息类型字节（`EXCEPTION = 3`）。

---

## 六、相关文档

- [登录与认证](login.md) — Cookie 构造与 access_token 获取
- [用户学习 API](user_study_api.md) — 学习记录、背词进度
- [游戏 API](game_api.md) — 游戏模式相关接口
- [Thrift 客户端](thrift_client.md) — TCompactProtocol 完整编解码参考
- [其他服务](other_services.md) — 其余 RPC 服务概览
- [统一用户服务](unified_user_service.md) — 账号体系相关接口
