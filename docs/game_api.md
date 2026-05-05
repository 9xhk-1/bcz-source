# GameApiService API 文档

> **应用版本**: 百词斩 Android v7.8.14  
> **服务名**: `game`  
> **主端点**: `https://game.baicizhan.com/rpc/game`  
> **协议**: Apache Thrift TCompactProtocol + TFramedTransport over HTTPS  
> **HTTP 方法**: POST  
> **URL 格式**: `{endpoint}/{method_name}/{timestamp_ms}`  
> **认证方式**: Cookie（需携带 `access_token`）

**相关文档**：[登录认证](login.md) | [用户学习服务](user_study_api.md) | [资源接口](resource_api.md) | [其他服务](other_services.md) | [Thrift 客户端指南](thrift_client.md)

---

## 目录

- [Python 辅助代码](#python-辅助代码)
- [第一节：游戏主页与配置](#第一节游戏主页与配置)
  - [home](#home)
  - [game_home](#game_home)
  - [get_game_config](#get_game_config)
  - [get_worth](#get_worth)
  - [get_equipments](#get_equipments)
- [第二节：词书选择与地图](#第二节词书选择与地图)
  - [select_game_book](#select_game_book)
  - [switch_game_mode](#switch_game_mode)
  - [get_roadmap](#get_roadmap)
  - [get_island_roadmap](#get_island_roadmap)
  - [sync_info](#sync_info)
- [第三节：游戏对局](#第三节游戏对局)
  - [start_round](#start_round)
  - [finish_round](#finish_round)
  - [discard_round](#discard_round)
  - [sync_combo](#sync_combo)
- [第四节：道具与购买](#第四节道具与购买)
  - [buy_life](#buy_life)
  - [cost_compass](#cost_compass)
  - [purchase](#purchase)
- [第五节：学习记录](#第五节学习记录)
  - [submit_study_record](#submit_study_record)
  - [submit_ability_record](#submit_ability_record)
  - [get_study_record](#get_study_record)
- [第六节：建筑系统](#第六节建筑系统)
  - [get_building_map](#get_building_map)
- [第七节：句子游戏](#第七节句子游戏)
  - [sentence_home](#sentence_home)
  - [sentence_sku_info](#sentence_sku_info)
  - [sentence_current_info](#sentence_current_info)
  - [sentence_start](#sentence_start)
  - [select_sentence_sku](#select_sentence_sku)
  - [upgrade_sentence_building](#upgrade_sentence_building)
  - [upgrade_sentence_building_v2](#upgrade_sentence_building_v2)
- [游戏流程](#游戏流程)

---

## Python 辅助代码

以下辅助函数用于构造 Thrift TCompactProtocol 二进制帧并发送请求。所有示例代码均依赖此模块。

```python
import struct, time, requests

def make_cookie(device_id="aabbccdd1234abcd", access_token=None):
    """构造请求所需的 Cookie 字符串。"""
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
    """将无符号整数编码为 LEB128 变长字节序列。"""
    buf = b''
    while True:
        if n & ~0x7f == 0:
            buf += bytes([n]); break
        buf += bytes([(n & 0x7f) | 0x80]); n >>= 7
    return buf

def zigzag32(n):
    """对 32 位有符号整数做 ZigZag 编码（TCompactProtocol 规范）。"""
    return (n << 1) ^ (n >> 31)

def encode_i32(n):
    """编码 i32 字段值（ZigZag + varint）。"""
    return varint(zigzag32(n))

def encode_i64(n):
    """编码 i64 字段值（ZigZag + varint）。"""
    return varint((n << 1) ^ (n >> 63))

def encode_string(s):
    """编码 string/binary 字段值（长度前缀 + UTF-8 字节）。"""
    b = s.encode('utf-8'); return varint(len(b)) + b

def stop():
    """返回 Thrift struct 结束标志字节。"""
    return b'\x00'

def field_header(prev_fid, fid, ftype):
    """
    生成 TCompactProtocol 字段头。
    delta <= 15 时使用短格式（1 字节），否则使用长格式（3 字节）。
    常用 ftype 值：
      BOOLEAN_TRUE=1, BOOLEAN_FALSE=2, I16=3, I32=5, I64=6,
      DOUBLE=7, BINARY=8, LIST=9, SET=10, MAP=11, STRUCT=12
    """
    delta = fid - prev_fid
    if 1 <= delta <= 15:
        return bytes([(delta << 4) | ftype])
    else:
        return bytes([ftype]) + struct.pack('<h', fid)

def build_call(method, args_bytes, seq=0):
    """将方法名与参数字节组合为完整的 Thrift 调用帧（含 4 字节长度前缀）。"""
    hdr = b'\x82\x21' + varint(seq) + encode_string(method)
    body = hdr + args_bytes + stop()
    return struct.pack('>I', len(body)) + body

def call_api(base_url, method, args_bytes, cookie):
    """
    向 game 服务发送 Thrift 调用，返回去除 4 字节帧头后的响应字节。
    base_url 示例: "https://game.baicizhan.com/rpc/game"
    """
    url = f"{base_url}/{method}/{int(time.time()*1000)}"
    r = requests.post(url, data=build_call(method, args_bytes),
                      headers={'Content-Type': 'application/x-thrift', 'Cookie': cookie})
    return r.content[4:]

BASE_URL = "https://game.baicizhan.com/rpc/game"
```

> **提示**：`access_token` 可通过登录接口获取，详见 [登录认证文档](login.md)。

---

## 第一节：游戏主页与配置

---

## home

> `https://game.baicizhan.com/rpc/game/home/{timestamp_ms}`

*请求方式：POST*

获取游戏主页信息，包含当前词书、生命值、金币等基础资产信息。通常在进入游戏首页时调用。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段（StudyHomeInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 当前词书 ID | |
| life | i32 | 生命值 | |
| compass | i32 | 指南针数量 | 用于跳关 |
| gold | i64 | 金币数量 | |
| current_island | i32 | 当前岛屿 ID | |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "home", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "life": 5,
  "compass": 3,
  "gold": 12500,
  "current_island": 7
}
```

</details>

---

## game_home

> `https://game.baicizhan.com/rpc/game/game_home/{timestamp_ms}`

*请求方式：POST*

获取指定词书的游戏主页信息，包括当前进度、可用关卡等。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | |

### 响应字段（GameHomeInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书 ID | |
| group_id | i32 | 当前分组 ID | |
| group_count | i32 | 每组单词数 | |
| total_groups | i32 | 总分组数 | |
| unlocked_groups | i32 | 已解锁分组数 | |

### Python 示例

```python
def encode_game_home(book_id):
    args = field_header(0, 1, 5) + encode_i32(book_id)
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "game_home", encode_game_home(1234), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "group_id": 5,
  "group_count": 10,
  "total_groups": 80,
  "unlocked_groups": 12
}
```

</details>

---

## get_game_config

> `https://game.baicizhan.com/rpc/game/get_game_config/{timestamp_ms}`

*请求方式：POST*

获取游戏全局配置项，返回键值对形式的配置字典。可用于读取各类游戏参数（如生命值恢复时间、道具价格等）。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (root) | Map\<String, String\> | 配置键值对 | key 为配置名，value 为配置值字符串 |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_game_config", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "life_recover_interval": "1800",
  "life_max": "5",
  "compass_per_skip": "1",
  "gold_per_round": "50",
  "diamond_buy_life": "6"
}
```

</details>

---

## get_worth

> `https://game.baicizhan.com/rpc/game/get_worth/{timestamp_ms}`

*请求方式：POST*

获取当前用户的全部游戏资产，包括生命值、指南针、金币、钻石和能量。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段（UserWorth）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| life | i32 | 当前生命值 | |
| life_max | i32 | 生命值上限 | 默认 5 |
| compass | i32 | 指南针数量 | 用于跳过关卡 |
| gold | i64 | 金币数量 | |
| diamond | i32 | 钻石数量 | 付费货币 |
| energy | i32 | 能量值 | 句子游戏使用 |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_worth", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "life": 4,
  "life_max": 5,
  "compass": 2,
  "gold": 8800,
  "diamond": 30,
  "energy": 60
}
```

</details>

---

## get_equipments

> `https://game.baicizhan.com/rpc/game/get_equipments/{timestamp_ms}`

*请求方式：POST*

获取当前用户的装备信息，包括已装备道具及其属性加成。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段（EquipmentInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| equipments | list | 装备列表 | 每项包含 equipment_id、level、bonus 等字段 |
| total_bonus | i32 | 总属性加成 | |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_equipments", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "equipments": [
    {"equipment_id": 101, "level": 3, "bonus": 15},
    {"equipment_id": 205, "level": 1, "bonus": 5}
  ],
  "total_bonus": 20
}
```

</details>

---

## 第二节：词书选择与地图

---

## select_game_book

> `https://game.baicizhan.com/rpc/game/select_game_book/{timestamp_ms}`

*请求方式：POST*

选择要进行游戏的词书，并设定每组单词数量。调用后服务端会初始化对应的学习计划。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | |
| group_count | i32 | 每组单词数量 | 必须 | 常用值：10、20、40 |

### 响应字段（UserPlanInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书 ID | |
| group_id | i32 | 当前分组 ID | 从此分组开始游戏 |
| group_count | i32 | 每组单词数 | |

### Python 示例

```python
def encode_select_game_book(book_id, group_count):
    args = b''
    args += field_header(0, 1, 5) + encode_i32(book_id)
    args += field_header(1, 2, 5) + encode_i32(group_count)
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "select_game_book", encode_select_game_book(1234, 10), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "group_id": 1,
  "group_count": 10
}
```

</details>

---

## switch_game_mode

> `https://game.baicizhan.com/rpc/game/switch_game_mode/{timestamp_ms}`

*请求方式：POST*

切换游戏模式（如普通模式、挑战模式等）。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| mode | i32 | 目标游戏模式 | 必须 | 具体枚举值见服务端配置 |

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (root) | i32 | 切换结果状态码 | 0 表示成功 |

### Python 示例

```python
def encode_switch_game_mode(mode):
    return field_header(0, 1, 5) + encode_i32(mode)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "switch_game_mode", encode_switch_game_mode(1), cookie)
print(resp.hex())
```

---

## get_roadmap

> `https://game.baicizhan.com/rpc/game/get_roadmap/{timestamp_ms}`

*请求方式：POST*

获取指定词书的整体进度路线图，展示各关卡完成状态。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | |

### 响应字段（RoadmapInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书 ID | |
| nodes | list | 路线节点列表 | 每项包含 node_id、status、type 等字段 |
| current_node | i32 | 当前节点 ID | |

### Python 示例

```python
def encode_get_roadmap(book_id):
    return field_header(0, 1, 5) + encode_i32(book_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_roadmap", encode_get_roadmap(1234), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "nodes": [
    {"node_id": 1, "status": 2, "type": 1},
    {"node_id": 2, "status": 2, "type": 1},
    {"node_id": 3, "status": 1, "type": 2},
    {"node_id": 4, "status": 0, "type": 1}
  ],
  "current_node": 3
}
```

> **status 枚举**：0=未解锁，1=当前，2=已完成

</details>

---

## get_island_roadmap

> `https://game.baicizhan.com/rpc/game/get_island_roadmap/{timestamp_ms}`

*请求方式：POST*

获取指定词书的岛屿地图信息，包括各岛屿的解锁状态和建筑分布。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | |

### 响应字段（IslandInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书 ID | |
| islands | list | 岛屿列表 | 每项包含 island_id、name、status、buildings 等字段 |
| current_island | i32 | 当前岛屿 ID | |

### Python 示例

```python
def encode_get_island_roadmap(book_id):
    return field_header(0, 1, 5) + encode_i32(book_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_island_roadmap", encode_get_island_roadmap(1234), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "islands": [
    {"island_id": 1, "name": "新手岛", "status": 2, "buildings": [101, 102]},
    {"island_id": 2, "name": "探索岛", "status": 1, "buildings": [201]}
  ],
  "current_island": 2
}
```

</details>

---

## sync_info

> `https://game.baicizhan.com/rpc/game/sync_info/{timestamp_ms}`

*请求方式：POST*

同步指定词书的当前游戏进度，获取最新的分组 ID 和学习计数。在开始新对局前通常需要先调用此接口以确认当前进度。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | |

### 响应字段（SyncInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书 ID | |
| group_id | i32 | 当前分组 ID | 传给 start_round 的 group_id |
| learned_count | i32 | 已学单词数量 | |
| total_count | i32 | 词书总单词数量 | |

### Python 示例

```python
def encode_sync_info(book_id):
    return field_header(0, 1, 5) + encode_i32(book_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sync_info", encode_sync_info(1234), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 1234,
  "group_id": 5,
  "learned_count": 48,
  "total_count": 800
}
```

</details>

---

## 第三节：游戏对局

> 对局相关接口是游戏核心流程，请严格按照 `start_round → [游戏中] → finish_round` 的顺序调用。如需中途退出，调用 `discard_round` 放弃当前对局。

---

## start_round

> `https://game.baicizhan.com/rpc/game/start_round/{timestamp_ms}`

*请求方式：POST*

开始一局新的单词游戏对局，服务端返回本局单词列表和对局 ID。**`round_id` 是后续 `finish_round` 必须携带的关键字段。**

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（RoundReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | Thrift field 1 |
| group_id | i32 | 分组 ID | 必须 | Thrift field 2，来自 sync_info |

### 响应字段（RoundRsp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| round_id | string | 对局唯一 ID | 结算时必须传入 |
| words | list\<GameWord\> | 本局单词列表 | 包含单词、释义、选项等 |
| life | i32 | 当前生命值 | 若为 0 则无法继续游戏 |

**GameWord 字段**：

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| word_id | i32 | 单词 ID | |
| word | string | 单词文本 | |
| meaning | string | 中文释义 | |
| options | list\<string\> | 选项列表 | 通常 4 个选项 |

### Python 示例

```python
def encode_round_req(book_id, group_id):
    # 内层 RoundReq struct：field 1=book_id (I32=5)，field 2=group_id (I32=5)
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(book_id)
    inner += field_header(1, 2, 5) + encode_i32(group_id)
    inner += stop()
    # 外层 args struct：field 1 = RoundReq (STRUCT=12)
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
args = encode_round_req(book_id=1234, group_id=5)
resp = call_api(BASE_URL, "start_round", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "round_id": "r-20240315-abcdef123456",
  "words": [
    {
      "word_id": 10001,
      "word": "ephemeral",
      "meaning": "短暂的，瞬息的",
      "options": ["永恒的", "短暂的", "壮观的", "隐秘的"]
    },
    {
      "word_id": 10002,
      "word": "benevolent",
      "meaning": "仁慈的，慈善的",
      "options": ["恶意的", "仁慈的", "冷漠的", "勇敢的"]
    }
  ],
  "life": 5
}
```

</details>

---

## finish_round

> `https://game.baicizhan.com/rpc/game/finish_round/{timestamp_ms}`

*请求方式：POST*

结算当前对局，提交得分和连击信息，获得经验、金币等奖励。必须在 `start_round` 之后调用，并传入对应的 `round_id`。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（FinishRoundReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| round_id | string | 对局 ID | 必须 | Thrift field 1，来自 start_round |
| score | i32 | 本局得分 | 必须 | Thrift field 2 |
| consume_life | bool | 是否消耗生命值 | 必须 | Thrift field 3 |
| combo_info | ComboReq | 连击信息 | 可选 | Thrift field 4，见下方说明 |
| used_time | i32 | 游戏耗时（毫秒） | 可选 | Thrift field 5 |

**ComboReq 字段**：

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| combo_count | i32 | 连击总次数 | 可选 | Thrift field 1 |
| max_combo | i32 | 最大连击数 | 可选 | Thrift field 2 |

### 响应字段（FinishRoundRsp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| exp | i32 | 获得经验值 | |
| gold | i64 | 获得金币数量 | |
| level_up | bool | 是否触发升级 | |
| new_words | list | 新解锁的单词列表 | 可能为空 |

### Python 示例

```python
def encode_finish_round_req(round_id, score, consume_life=False,
                             combo_count=0, max_combo=0, used_time=0):
    """
    构造 FinishRoundReq 的参数字节序列。
    TCompactProtocol 中 BOOL 字段编码在 type nibble 中：
      delta<<4 | 1  → BOOLEAN_TRUE
      delta<<4 | 2  → BOOLEAN_FALSE
    """
    inner = b''
    prev = 0
    # field 1: round_id (BINARY=8)
    inner += field_header(prev, 1, 8) + encode_string(round_id); prev = 1
    # field 2: score (I32=5)
    inner += field_header(prev, 2, 5) + encode_i32(score); prev = 2
    # field 3: consume_life (BOOLEAN, delta=1, type=1或2)
    delta = 3 - prev  # delta=1
    bool_type = 1 if consume_life else 2
    inner += bytes([(delta << 4) | bool_type]); prev = 3
    # field 4: combo_info (STRUCT=12) — 可选
    if combo_count > 0 or max_combo > 0:
        combo_inner = b''
        combo_inner += field_header(0, 1, 5) + encode_i32(combo_count)
        combo_inner += field_header(1, 2, 5) + encode_i32(max_combo)
        combo_inner += stop()
        inner += field_header(prev, 4, 12) + combo_inner; prev = 4
    # field 5: used_time (I32=5) — 可选
    if used_time > 0:
        inner += field_header(prev, 5, 5) + encode_i32(used_time); prev = 5
    inner += stop()

    # 外层 args struct：field 1 = FinishRoundReq (STRUCT=12)
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
args = encode_finish_round_req(
    round_id="r-20240315-abcdef123456",
    score=920,
    consume_life=False,
    combo_count=5,
    max_combo=8,
    used_time=45000
)
resp = call_api(BASE_URL, "finish_round", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "exp": 120,
  "gold": 85,
  "level_up": false,
  "new_words": []
}
```

</details>

---

## discard_round

> `https://game.baicizhan.com/rpc/game/discard_round/{timestamp_ms}`

*请求方式：POST*

主动放弃当前进行中的对局。放弃后不会获得任何奖励，生命值不被扣除。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| round_id | string | 对局 ID | 必须 | 来自 start_round 的返回值 |

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (root) | i64 | 操作结果时间戳 | 单位毫秒 |

### Python 示例

```python
def encode_discard_round(round_id):
    return field_header(0, 1, 8) + encode_string(round_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "discard_round",
                encode_discard_round("r-20240315-abcdef123456"), cookie)
print(resp.hex())
```

---

## sync_combo

> `https://game.baicizhan.com/rpc/game/sync_combo/{timestamp_ms}`

*请求方式：POST*

在游戏进行过程中实时同步连击信息，服务端返回当前连击状态。通常在每次答对题目时调用。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（ComboReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| combo_count | i32 | 当前连击次数 | 必须 | Thrift field 1 |
| max_combo | i32 | 当前最大连击数 | 必须 | Thrift field 2 |

### 响应字段（ComboInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| combo_count | i32 | 服务端确认的连击次数 | |
| max_combo | i32 | 服务端确认的最大连击 | |
| bonus_gold | i64 | 连击额外奖励金币 | |

### Python 示例

```python
def encode_combo_req(combo_count, max_combo):
    # ComboReq 直接作为顶层参数 struct（field 1 = ComboReq STRUCT）
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(combo_count)
    inner += field_header(1, 2, 5) + encode_i32(max_combo)
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sync_combo", encode_combo_req(3, 5), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "combo_count": 3,
  "max_combo": 5,
  "bonus_gold": 15
}
```

</details>

---

## 第四节：道具与购买

---

## buy_life

> `https://game.baicizhan.com/rpc/game/buy_life/{timestamp_ms}`

*请求方式：POST*

使用金币或钻石购买生命值。生命值耗尽后需通过此接口补充才能继续游戏。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（LifeReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| count | i32 | 购买生命值数量 | 必须 | Thrift field 1 |
| currency_type | i32 | 货币类型 | 必须 | Thrift field 2；1=金币，2=钻石 |

### 响应字段

无返回体（void），HTTP 状态码 200 表示成功。

### Python 示例

```python
def encode_buy_life(count, currency_type):
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(count)
    inner += field_header(1, 2, 5) + encode_i32(currency_type)
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
# 用金币购买 1 条命
resp = call_api(BASE_URL, "buy_life", encode_buy_life(count=1, currency_type=1), cookie)
print(resp.hex())
```

---

## cost_compass

> `https://game.baicizhan.com/rpc/game/cost_compass/{timestamp_ms}`

*请求方式：POST*

消耗指南针以跳过当前关卡。消耗后返回剩余数量等信息。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| count | i32 | 消耗指南针数量 | 必须 | 通常为 1 |

### 响应字段（CostCompassRsp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| remaining | i32 | 剩余指南针数量 | |
| next_group_id | i32 | 跳过后的分组 ID | |

### Python 示例

```python
def encode_cost_compass(count):
    return field_header(0, 1, 5) + encode_i32(count)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "cost_compass", encode_cost_compass(1), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "remaining": 1,
  "next_group_id": 6
}
```

</details>

---

## purchase

> `https://game.baicizhan.com/rpc/game/purchase/{timestamp_ms}`

*请求方式：POST*

购买游戏内道具（如指南针、皮肤、特殊道具等）。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（PurchaseReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| item_id | i32 | 道具 ID | 必须 | Thrift field 1 |
| count | i32 | 购买数量 | 必须 | Thrift field 2 |
| currency_type | i32 | 货币类型 | 必须 | Thrift field 3；1=金币，2=钻石 |

### 响应字段（PurchaseRsp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | bool | 是否购买成功 | |
| remaining_currency | i64 | 扣除后剩余货币数量 | |
| item_count | i32 | 购买后道具总数量 | |

### Python 示例

```python
def encode_purchase(item_id, count, currency_type):
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(item_id)
    inner += field_header(1, 2, 5) + encode_i32(count)
    inner += field_header(2, 3, 5) + encode_i32(currency_type)
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "purchase", encode_purchase(item_id=301, count=3, currency_type=1), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "success": true,
  "remaining_currency": 6200,
  "item_count": 3
}
```

</details>

---

## 第五节：学习记录

---

## submit_study_record

> `https://game.baicizhan.com/rpc/game/submit_study_record/{timestamp_ms}`

*请求方式：POST*

提交一次学习记录，用于统计用户的学习进度与数据。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（SubmitRecordReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 必须 | Thrift field 1 |
| group_id | i32 | 分组 ID | 必须 | Thrift field 2 |
| word_count | i32 | 本次学习单词数 | 必须 | Thrift field 3 |
| study_time | i32 | 学习时长（秒） | 可选 | Thrift field 4 |

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (root) | i64 | 记录提交时间戳（毫秒） | |

### Python 示例

```python
def encode_submit_study_record(book_id, group_id, word_count, study_time=0):
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(book_id)
    inner += field_header(1, 2, 5) + encode_i32(group_id)
    inner += field_header(2, 3, 5) + encode_i32(word_count)
    if study_time > 0:
        inner += field_header(3, 4, 5) + encode_i32(study_time)
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "submit_study_record",
                encode_submit_study_record(1234, 5, 10, 180), cookie)
print(resp.hex())
```

---

## submit_ability_record

> `https://game.baicizhan.com/rpc/game/submit_ability_record/{timestamp_ms}`

*请求方式：POST*

提交用户在本次游戏中的能力值表现记录（如答题正确率、速度等）。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（SubmitAbilityReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| round_id | string | 对局 ID | 必须 | Thrift field 1 |
| accuracy | i32 | 答题准确率（百分比） | 必须 | Thrift field 2，如 95 表示 95% |
| avg_time | i32 | 平均答题时间（毫秒） | 可选 | Thrift field 3 |

### 响应字段

无返回体（void），HTTP 状态码 200 表示成功。

### Python 示例

```python
def encode_submit_ability_record(round_id, accuracy, avg_time=0):
    inner = b''
    inner += field_header(0, 1, 8) + encode_string(round_id)
    inner += field_header(1, 2, 5) + encode_i32(accuracy)
    if avg_time > 0:
        inner += field_header(2, 3, 5) + encode_i32(avg_time)
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "submit_ability_record",
                encode_submit_ability_record("r-20240315-abcdef123456", 90, 1200), cookie)
print(resp.hex())
```

---

## get_study_record

> `https://game.baicizhan.com/rpc/game/get_study_record/{timestamp_ms}`

*请求方式：POST*

查询用户的历史学习记录，可按词书和时间范围筛选。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数（StudyRecordReq struct）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书 ID | 可选 | Thrift field 1；不传则查询全部 |
| page | i32 | 页码 | 可选 | Thrift field 2；从 1 开始 |
| page_size | i32 | 每页数量 | 可选 | Thrift field 3；默认 20 |

### 响应字段（StudyRecordRsp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| records | list | 学习记录列表 | 每条包含 book_id、group_id、word_count、study_time、created_at |
| total | i32 | 总记录数 | |
| has_more | bool | 是否还有更多记录 | |

### Python 示例

```python
def encode_get_study_record(book_id=0, page=1, page_size=20):
    inner = b''
    prev = 0
    if book_id > 0:
        inner += field_header(prev, 1, 5) + encode_i32(book_id); prev = 1
    inner += field_header(prev, 2, 5) + encode_i32(page); prev = 2
    inner += field_header(prev, 3, 5) + encode_i32(page_size); prev = 3
    inner += stop()
    args = field_header(0, 1, 12) + inner
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_study_record", encode_get_study_record(book_id=1234), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "records": [
    {"book_id": 1234, "group_id": 5, "word_count": 10, "study_time": 180, "created_at": 1710470400},
    {"book_id": 1234, "group_id": 4, "word_count": 10, "study_time": 210, "created_at": 1710384000}
  ],
  "total": 48,
  "has_more": true
}
```

</details>

---

## 第六节：建筑系统

---

## get_building_map

> `https://game.baicizhan.com/rpc/game/get_building_map/{timestamp_ms}`

*请求方式：POST*

获取指定 SKU（商品）对应的建筑地图，包含各建筑的当前等级、升级条件及所需资源。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| sku_id | i32 | SKU ID | 必须 | |

### 响应字段（BuildingMap）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| sku_id | i32 | SKU ID | |
| buildings | list | 建筑列表 | 每项包含 building_id、name、level、max_level、upgrade_cost 等 |
| total_progress | i32 | 总建设进度（百分比） | |

### Python 示例

```python
def encode_get_building_map(sku_id):
    return field_header(0, 1, 5) + encode_i32(sku_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "get_building_map", encode_get_building_map(1), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "sku_id": 1,
  "buildings": [
    {
      "building_id": 1001,
      "name": "词汇图书馆",
      "level": 2,
      "max_level": 5,
      "upgrade_cost": {"gold": 500}
    },
    {
      "building_id": 1002,
      "name": "练习场",
      "level": 1,
      "max_level": 5,
      "upgrade_cost": {"gold": 300}
    }
  ],
  "total_progress": 35
}
```

</details>

---

## 第七节：句子游戏

> 句子游戏是独立于单词岛的游戏模块，使用能量（energy）作为资源，玩家通过完成句子练习来升级建筑、解锁内容。典型调用流程见本节末尾。

---

## sentence_home

> `https://game.baicizhan.com/rpc/game/sentence_home/{timestamp_ms}`

*请求方式：POST*

获取句子游戏首页数据，包括可用句子包列表和当前能量状态。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段（SentenceGameHome）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| skus | list\<SentenceSku\> | 可用句子包列表 | |
| energy | i32 | 当前能量值 | 每次游戏消耗能量 |
| energy_max | i32 | 能量上限 | |

**SentenceSku 字段**：

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| sku_id | i32 | 句子包 ID | |
| name | string | 句子包名称 | |
| description | string | 描述 | |
| is_selected | bool | 是否为当前选中 | |
| is_unlocked | bool | 是否已解锁 | |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sentence_home", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "skus": [
    {
      "sku_id": 1,
      "name": "日常对话",
      "description": "练习日常英语口语句型",
      "is_selected": true,
      "is_unlocked": true
    },
    {
      "sku_id": 2,
      "name": "商务英语",
      "description": "职场商务英语句型精练",
      "is_selected": false,
      "is_unlocked": false
    }
  ],
  "energy": 80,
  "energy_max": 100
}
```

</details>

---

## sentence_sku_info

> `https://game.baicizhan.com/rpc/game/sentence_sku_info/{timestamp_ms}`

*请求方式：POST*

获取指定句子包的详细信息，包括包含的句子数量、难度和进度等。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| skuId | i32 | 句子包 ID | 必须 | |

### 响应字段（SentenceSkuInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| sku_id | i32 | 句子包 ID | |
| name | string | 名称 | |
| total_sentences | i32 | 句子总数 | |
| learned_sentences | i32 | 已学句子数 | |
| difficulty | i32 | 难度等级（1-5） | |
| buildings | list | 关联建筑列表 | |

### Python 示例

```python
def encode_sentence_sku_info(sku_id):
    return field_header(0, 1, 5) + encode_i32(sku_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sentence_sku_info", encode_sentence_sku_info(1), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "sku_id": 1,
  "name": "日常对话",
  "total_sentences": 200,
  "learned_sentences": 45,
  "difficulty": 2,
  "buildings": [
    {"building_id": 2001, "name": "对话亭", "level": 2}
  ]
}
```

</details>

---

## sentence_current_info

> `https://game.baicizhan.com/rpc/game/sentence_current_info/{timestamp_ms}`

*请求方式：POST*

获取用户在指定句子包中的当前学习进度，包括已完成的句子、当前关卡和建筑状态。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| skuId | i32 | 句子包 ID | 必须 | |

### 响应字段（SentenceCurrentInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| sku_id | i32 | 句子包 ID | |
| current_sentence_id | i32 | 当前句子 ID | |
| progress | i32 | 整体进度（百分比） | |
| stage | i32 | 当前关卡 | |
| building_status | list | 建筑升级状态列表 | |

### Python 示例

```python
def encode_sentence_current_info(sku_id):
    return field_header(0, 1, 5) + encode_i32(sku_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sentence_current_info", encode_sentence_current_info(1), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "sku_id": 1,
  "current_sentence_id": 46,
  "progress": 22,
  "stage": 3,
  "building_status": [
    {"building_id": 2001, "level": 2, "progress_to_next": 60}
  ]
}
```

</details>

---

## sentence_start

> `https://game.baicizhan.com/rpc/game/sentence_start/{timestamp_ms}`

*请求方式：POST*

开始一局句子游戏，消耗一定能量并返回当前能量状态。在此接口返回后即可开始展示句子题目。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

无需参数。

### 响应字段（EnergyInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| energy | i32 | 消耗后剩余能量 | |
| energy_max | i32 | 能量上限 | |
| energy_cost | i32 | 本次消耗量 | |
| recover_time | i32 | 下次能量恢复剩余时间（秒） | |

### Python 示例

```python
cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "sentence_start", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "energy": 70,
  "energy_max": 100,
  "energy_cost": 10,
  "recover_time": 600
}
```

</details>

---

## select_sentence_sku

> `https://game.baicizhan.com/rpc/game/select_sentence_sku/{timestamp_ms}`

*请求方式：POST*

选择当前要学习的句子包。选择后，`sentence_start` 将基于此句子包提供题目。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| sku_id | i32 | 句子包 ID | 必须 | |

### 响应字段

无返回体（void），HTTP 状态码 200 表示成功。

### Python 示例

```python
def encode_select_sentence_sku(sku_id):
    return field_header(0, 1, 5) + encode_i32(sku_id)

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "select_sentence_sku", encode_select_sentence_sku(1), cookie)
print(resp.hex())
```

---

## upgrade_sentence_building

> `https://game.baicizhan.com/rpc/game/upgrade_sentence_building/{timestamp_ms}`

*请求方式：POST*

升级句子游戏中的建筑到指定等级。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| building_id | i32 | 建筑 ID | 必须 | |
| building_level_id | i32 | 目标等级 ID | 必须 | 注意是等级记录 ID，非等级数值 |

### 响应字段（SentenceBuildingProgress）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| building_id | i32 | 建筑 ID | |
| current_level | i32 | 升级后等级 | |
| progress | i32 | 当前升级进度（百分比） | |
| rewards | list | 升级奖励列表 | 可能包含经验、道具等 |

### Python 示例

```python
def encode_upgrade_sentence_building(building_id, building_level_id):
    args = b''
    args += field_header(0, 1, 5) + encode_i32(building_id)
    args += field_header(1, 2, 5) + encode_i32(building_level_id)
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "upgrade_sentence_building",
                encode_upgrade_sentence_building(2001, 3), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "building_id": 2001,
  "current_level": 3,
  "progress": 100,
  "rewards": [
    {"type": "exp", "amount": 50},
    {"type": "gold", "amount": 200}
  ]
}
```

</details>

---

## upgrade_sentence_building_v2

> `https://game.baicizhan.com/rpc/game/upgrade_sentence_building_v2/{timestamp_ms}`

*请求方式：POST*

升级句子建筑的 v2 版本接口，支持跨多个等级直接升级到目标等级，返回更详细的状态信息。

### 认证方式

需在 Cookie 中携带有效的 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| sku_id | i32 | 句子包 ID | 必须 | |
| target_building_id | i32 | 目标建筑 ID | 必须 | |
| target_level | i32 | 目标等级数值 | 必须 | 直接传等级数，如 3 表示升到 3 级 |

### 响应字段（SentenceBuildingStatus）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| building_id | i32 | 建筑 ID | |
| level | i32 | 当前等级 | |
| max_level | i32 | 最大可达等级 | |
| is_max | bool | 是否已达上限 | |
| total_rewards | list | 所有升级奖励汇总 | |
| sku_progress | i32 | 句子包整体进度更新（百分比） | |

### Python 示例

```python
def encode_upgrade_sentence_building_v2(sku_id, target_building_id, target_level):
    args = b''
    args += field_header(0, 1, 5) + encode_i32(sku_id)
    args += field_header(1, 2, 5) + encode_i32(target_building_id)
    args += field_header(2, 3, 5) + encode_i32(target_level)
    return args

cookie = make_cookie(access_token="YOUR_TOKEN")
resp = call_api(BASE_URL, "upgrade_sentence_building_v2",
                encode_upgrade_sentence_building_v2(1, 2001, 4), cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "building_id": 2001,
  "level": 4,
  "max_level": 5,
  "is_max": false,
  "total_rewards": [
    {"type": "exp", "amount": 150},
    {"type": "gold", "amount": 600}
  ],
  "sku_progress": 55
}
```

</details>

---

## 游戏流程

### 单词岛游戏流程

以下是完整的单词岛游戏标准调用序列：

```
1. home()
   → 获取主页信息（生命值、金币、当前词书等）

2. select_game_book(book_id=1234, group_count=10)
   → 选择词书，初始化学习计划，获取起始 group_id

3. sync_info(book_id=1234)
   → 同步当前进度，确认 group_id（避免重复学习已完成分组）

4. start_round(RoundReq(book_id=1234, group_id=5))
   → 开始对局，获取 round_id 和本局单词列表

5. [游戏进行中]
   sync_combo(ComboReq(combo_count=3, max_combo=5))
   → 每次答对时实时上报连击信息

6. finish_round(FinishRoundReq(round_id="r-...", score=850, consume_life=False,
                               combo_count=5, max_combo=8, used_time=42000))
   → 结算本局，获取经验、金币奖励

7. [可选] submit_study_record(book_id=1234, group_id=5, word_count=10, study_time=42)
   → 提交学习统计记录
```

**完整 Python 示例**：

```python
import struct, time, requests

# （此处省略辅助函数定义，参见文件顶部"Python 辅助代码"一节）

BASE_URL = "https://game.baicizhan.com/rpc/game"
cookie = make_cookie(access_token="YOUR_TOKEN")

# Step 1: 获取主页
resp_home = call_api(BASE_URL, "home", b'', cookie)

# Step 2: 选择词书
args_select = b''
args_select += field_header(0, 1, 5) + encode_i32(1234)  # book_id
args_select += field_header(1, 2, 5) + encode_i32(10)    # group_count
resp_select = call_api(BASE_URL, "select_game_book", args_select, cookie)

# Step 3: 同步进度（从响应中解析 group_id，此处假设为 5）
args_sync = field_header(0, 1, 5) + encode_i32(1234)
resp_sync = call_api(BASE_URL, "sync_info", args_sync, cookie)
group_id = 5  # 从 resp_sync 解析

# Step 4: 开始对局
inner = b''
inner += field_header(0, 1, 5) + encode_i32(1234)     # book_id
inner += field_header(1, 2, 5) + encode_i32(group_id) # group_id
inner += stop()
args_start = field_header(0, 1, 12) + inner
resp_start = call_api(BASE_URL, "start_round", args_start, cookie)
round_id = "r-parsed-from-resp"  # 从 resp_start 解析

# Step 5: 同步连击（游戏中途）
combo_inner = b''
combo_inner += field_header(0, 1, 5) + encode_i32(3)  # combo_count
combo_inner += field_header(1, 2, 5) + encode_i32(5)  # max_combo
combo_inner += stop()
args_combo = field_header(0, 1, 12) + combo_inner
resp_combo = call_api(BASE_URL, "sync_combo", args_combo, cookie)

# Step 6: 结算对局
args_finish = encode_finish_round_req(
    round_id=round_id,
    score=850,
    consume_life=False,
    combo_count=5,
    max_combo=8,
    used_time=42000
)
resp_finish = call_api(BASE_URL, "finish_round", args_finish, cookie)
print("对局结算响应:", resp_finish.hex())
```

---

### 句子游戏流程

```
1. sentence_home()
   → 获取可用句子包列表和当前能量

2. sentence_sku_info(skuId=1)
   → 查看目标句子包的详情（句子数、难度、关联建筑）

3. select_sentence_sku(sku_id=1)
   → 选择要学习的句子包

4. sentence_current_info(skuId=1)
   → 获取在该句子包中的当前学习进度和建筑状态

5. sentence_start()
   → 消耗能量，开始本局句子游戏

6. [游戏完成后，若满足升级条件]
   upgrade_sentence_building_v2(sku_id=1, target_building_id=2001, target_level=3)
   → 升级建筑，获取奖励
```

**完整 Python 示例**：

```python
BASE_URL = "https://game.baicizhan.com/rpc/game"
cookie = make_cookie(access_token="YOUR_TOKEN")

# Step 1: 句子游戏首页
resp = call_api(BASE_URL, "sentence_home", b'', cookie)

# Step 2: 查看句子包详情
args = field_header(0, 1, 5) + encode_i32(1)  # skuId=1
resp = call_api(BASE_URL, "sentence_sku_info", args, cookie)

# Step 3: 选择句子包
args = field_header(0, 1, 5) + encode_i32(1)  # sku_id=1
resp = call_api(BASE_URL, "select_sentence_sku", args, cookie)

# Step 4: 获取当前进度
args = field_header(0, 1, 5) + encode_i32(1)  # skuId=1
resp = call_api(BASE_URL, "sentence_current_info", args, cookie)

# Step 5: 开始游戏（消耗能量）
resp = call_api(BASE_URL, "sentence_start", b'', cookie)
print("能量状态:", resp.hex())

# Step 6: 游戏完成后升级建筑
args = b''
args += field_header(0, 1, 5) + encode_i32(1)     # sku_id
args += field_header(1, 2, 5) + encode_i32(2001)  # target_building_id
args += field_header(2, 3, 5) + encode_i32(3)     # target_level
resp = call_api(BASE_URL, "upgrade_sentence_building_v2", args, cookie)
print("建筑升级结果:", resp.hex())
```

---

## 附录：Thrift 类型编码速查

| 类型 | ftype 值 | 编码方式 |
|------|----------|----------|
| BOOLEAN_TRUE | 1 | 编码在字段头 type nibble 中 |
| BOOLEAN_FALSE | 2 | 编码在字段头 type nibble 中 |
| I16 | 3 | ZigZag + varint |
| I32 | 5 | ZigZag + varint |
| I64 | 6 | ZigZag + varint |
| DOUBLE | 7 | 小端序 8 字节 |
| BINARY/STRING | 8 | varint 长度 + UTF-8 字节 |
| LIST | 9 | 元素类型 + varint 元素数 + 各元素 |
| SET | 10 | 同 LIST |
| MAP | 11 | key 类型 + value 类型 + varint 数量 + 键值对 |
| STRUCT | 12 | 递归字段序列 + 0x00 结束 |

> **注意**：字段头使用 delta 编码（短格式）或完整字段 ID（长格式）。详见 [Thrift 客户端指南](thrift_client.md)。

---

*文档最后更新于 BCZ Android v7.8.14 逆向分析。如发现接口变更，请参考 [API 参考 JSON](bcz_api_reference.json) 或提交 issue。*
