# UserStudyApiService — 学习核心服务 API 文档

> 逆向来源：`com/baicizhan/online/user_study_api/UserStudyApiService.java`（APK 7.8.14）
>
> 相关文档：[登录认证](login.md) · [资源服务](resource_api.md) · [游戏服务](game_api.md) · [统一用户服务](unified_user_service.md) · [其他服务](other_services.md) · [Thrift 客户端](thrift_client.md)

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

## 二、Python 公共工具代码

以下辅助函数在所有接口的 Python 示例中通用，请在使用前引入：

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
def encode_bool(v): return bytes([1]) if v else bytes([2])
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
```

> **TCompact 字段类型速查：**
> `BOOL_TRUE=1, BOOL_FALSE=2, BYTE=3, I16=4, I32=5, I64=6, DOUBLE=7, BINARY/STRING=8, LIST=9, SET=10, MAP=11, STRUCT=12`

---

## 第一节：学习首页与基本信息

本节接口用于获取学习主页展示数据、用户基本信息及限制信息，通常在应用启动或进入学习模块时调用。

---

## get_study_home

> `https://learn.baicizhan.com/rpc/user_study/get_study_home/{timestamp_ms}`

*请求方式：POST*

获取学习首页数据，包含今日学习计划、进度统计、选中词书等信息。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| today_new_count | i32 | 今日计划新学单词数 | |
| today_review_count | i32 | 今日计划复习单词数 | |
| done_new_count | i32 | 今日已完成新学单词数 | |
| done_review_count | i32 | 今日已完成复习单词数 | |
| book_id | i32 | 当前选中词书ID | |
| streak_days | i32 | 连续打卡天数 | |
| total_learned | i32 | 累计已学单词总数 | |

**Python 示例：**

```python
BASE_URL = "https://learn.baicizhan.com/rpc/user_study"
cookie = make_cookie(access_token="YOUR_TOKEN")

# get_study_home 无参数，args_bytes 直接为空
resp = call_api(BASE_URL, "get_study_home", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "today_new_count": 20,
  "today_review_count": 30,
  "done_new_count": 10,
  "done_review_count": 15,
  "book_id": 12345,
  "streak_days": 7,
  "total_learned": 500
}
```

</details>

---

## get_study_home_v2

> `https://learn.baicizhan.com/rpc/user_study/get_study_home_v2/{timestamp_ms}`

*请求方式：POST*

获取学习首页数据（V2版本），支持按词书ID查询，返回数据更完整。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| today_new_count | i32 | 今日计划新学单词数 | |
| today_review_count | i32 | 今日计划复习单词数 | |
| done_new_count | i32 | 今日已完成新学数 | |
| done_review_count | i32 | 今日已完成复习数 | |
| book_id | i32 | 词书ID | |
| streak_days | i32 | 连续打卡天数 | |
| total_learned | i32 | 累计已学总数 | |
| word_level_id | i32 | 当前词组ID | V2新增 |

**Python 示例：**

```python
BASE_URL = "https://learn.baicizhan.com/rpc/user_study"
cookie = make_cookie(access_token="YOUR_TOKEN")

book_id = 12345
args = field_header(0, 1, 5) + encode_i32(book_id)  # field 1, I32
resp = call_api(BASE_URL, "get_study_home_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "today_new_count": 20,
  "today_review_count": 30,
  "done_new_count": 0,
  "done_review_count": 0,
  "book_id": 12345,
  "streak_days": 7,
  "total_learned": 500,
  "word_level_id": 101
}
```

</details>

---

## user_basic_info

> `https://learn.baicizhan.com/rpc/user_study/user_basic_info/{timestamp_ms}`

*请求方式：POST*

获取用户学习基本信息，包括选书记录、学习统计等。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| user_id | i64 | 用户ID | |
| book_id | i32 | 当前词书ID | |
| total_learned | i32 | 累计已学单词数 | |
| total_days | i32 | 累计学习天数 | |
| created_at | i64 | 账号创建时间戳 | Unix 毫秒 |

**Python 示例：**

```python
resp = call_api(BASE_URL, "user_basic_info", b'', cookie)
print(resp.hex())
```

---

## user_basic_info_v2

> `https://learn.baicizhan.com/rpc/user_study/user_basic_info_v2/{timestamp_ms}`

*请求方式：POST*

获取用户学习基本信息（V2版本），返回更详细的词书与进度信息。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| user_id | i64 | 用户ID | |
| book_id | i32 | 当前词书ID | |
| total_learned | i32 | 累计已学单词数 | |
| total_days | i32 | 累计学习天数 | |
| selected_books | list | 已选词书列表 | 含多本词书信息 |
| daily_plan_count | i32 | 每日学习计划数 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "user_basic_info_v2", b'', cookie)
print(resp.hex())
```

---

## user_limit_info

> `https://learn.baicizhan.com/rpc/user_study/user_limit_info/{timestamp_ms}`

*请求方式：POST*

获取用户功能限制信息（如免费版与付费版的功能差异）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| is_vip | i32 | 是否为VIP | 0=否，1=是 |
| vip_expire_at | i64 | VIP过期时间戳 | Unix 毫秒 |
| daily_limit | i32 | 每日学习上限 | 非VIP用户 |
| review_limit | i32 | 复习功能限制 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "user_limit_info", b'', cookie)
print(resp.hex())
```

---

## user_limit_info_v2

> `https://learn.baicizhan.com/rpc/user_study/user_limit_info_v2/{timestamp_ms}`

*请求方式：POST*

获取用户功能限制信息（V2版本），包含更多限制项目。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| is_vip | i32 | 是否为VIP | 0=否，1=是 |
| vip_expire_at | i64 | VIP过期时间戳 | Unix 毫秒 |
| daily_limit | i32 | 每日学习上限 | |
| features | list | 功能权限列表 | V2新增 |
| book_limit | i32 | 词书选择上限 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "user_limit_info_v2", b'', cookie)
print(resp.hex())
```

---

## 第二节：词书管理

本节接口用于选书、查询词书信息、管理已选词书内容等操作。

---

## select_book

> `https://learn.baicizhan.com/rpc/user_study/select_book/{timestamp_ms}`

*请求方式：POST*

选择/切换学习词书，设置每日学习计划。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |
| daily_plan_count | i32 | 每日新学单词数 | 必须 | 字段ID=2 |
| review_plan_count | i32 | 每日复习单词数 | 必须 | 字段ID=3 |
| mode | i32 | 学习模式 | 必须 | 字段ID=4，0=普通 |
| group_count | i32 | 词组数量 | 必须 | 字段ID=5 |

**响应字段（UserSelectedBookInfo）：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书ID | 字段ID=1 |
| selected_end_time | i64 | 选书结束时间戳 | 字段ID=2，Unix 毫秒 |
| learned_words_count | i32 | 已学单词数 | 字段ID=3 |
| last_touch_at | i64 | 上次学习时间戳 | 字段ID=4，Unix 毫秒 |
| roadmap_version | i64 | 路线图版本号 | 字段ID=5 |
| word_fm_updated_at | i64 | 词频更新时间戳 | 字段ID=6 |
| group_id | i32 | 词组ID | 字段ID=7 |
| daily_plan_count | i32 | 每日学习数 | 字段ID=8 |
| poster_updated_at | i64 | 海报更新时间戳 | 字段ID=9 |
| need_merge_count | i32 | 待合并计数 | 字段ID=10 |
| review_plan_count | i32 | 每日复习数 | 字段ID=11 |
| exam_preparation | i32 | 考试备考标识 | 字段ID=12 |
| mode_switch_url | string | 模式切换URL | 字段ID=13 |
| game_mode | i32 | 游戏模式标识 | 字段ID=14 |

**Python 示例：**

```python
BASE_URL = "https://learn.baicizhan.com/rpc/user_study"
cookie = make_cookie(access_token="YOUR_TOKEN")

I32 = 5
book_id = 12345
daily_plan_count = 20
review_plan_count = 40
mode = 0
group_count = 5

args = b''
args += field_header(0, 1, I32) + encode_i32(book_id)
args += field_header(1, 2, I32) + encode_i32(daily_plan_count)
args += field_header(2, 3, I32) + encode_i32(review_plan_count)
args += field_header(3, 4, I32) + encode_i32(mode)
args += field_header(4, 5, I32) + encode_i32(group_count)

resp = call_api(BASE_URL, "select_book", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "book_id": 12345,
  "selected_end_time": 1733011200000,
  "learned_words_count": 500,
  "last_touch_at": 1732924800000,
  "roadmap_version": 1001,
  "word_fm_updated_at": 1732000000000,
  "group_id": 7,
  "daily_plan_count": 20,
  "poster_updated_at": 1731000000000,
  "need_merge_count": 0,
  "review_plan_count": 40,
  "exam_preparation": 0,
  "mode_switch_url": "",
  "game_mode": 0
}
```

</details>

---

## get_all_books_basic_info_v3

> `https://learn.baicizhan.com/rpc/user_study/get_all_books_basic_info_v3/{timestamp_ms}`

*请求方式：POST*

获取所有词书的基本信息列表（V3版本）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| books | list | 词书信息列表 | 每项含下方字段 |
| book_id | i32 | 词书ID | |
| book_name | string | 词书名称 | |
| total_count | i32 | 词书总词数 | |
| cover_img | string | 封面图片URL | |
| category | string | 分类名称 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_all_books_basic_info_v3", b'', cookie)
print(resp.hex())
```

---

## get_book_description

> `https://learn.baicizhan.com/rpc/user_study/get_book_description/{timestamp_ms}`

*请求方式：POST*

获取指定词书的详细描述信息。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| book_id | i32 | 词书ID | |
| description | string | 词书详细描述 | |
| total_count | i32 | 词书总词数 | |
| difficulty | i32 | 难度等级 | |
| tags | list | 标签列表 | |

**Python 示例：**

```python
book_id = 12345
args = field_header(0, 1, 5) + encode_i32(book_id)
resp = call_api(BASE_URL, "get_book_description", args, cookie)
```

---

## book_mode_list

> `https://learn.baicizhan.com/rpc/user_study/book_mode_list/{timestamp_ms}`

*请求方式：POST*

获取词书支持的学习模式列表。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| modes | list | 模式列表 | |
| mode_id | i32 | 模式ID | |
| mode_name | string | 模式名称 | |
| description | string | 模式说明 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "book_mode_list", b'', cookie)
```

---

## get_payed_books

> `https://learn.baicizhan.com/rpc/user_study/get_payed_books/{timestamp_ms}`

*请求方式：POST*

获取用户已购买的词书列表。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| books | list | 已购词书列表 | |
| book_id | i32 | 词书ID | |
| book_name | string | 词书名称 | |
| expire_at | i64 | 到期时间戳 | Unix 毫秒，-1为永久 |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_payed_books", b'', cookie)
```

---

## get_word_list_status

> `https://learn.baicizhan.com/rpc/user_study/get_word_list_status/{timestamp_ms}`

*请求方式：POST*

获取词书中各词组的学习状态。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| word_lists | list | 词组状态列表 | |
| topic_id | i32 | 单词ID | |
| status | i32 | 学习状态 | 0=未学，1=已学，2=掌握 |
| score | i32 | 当前分数 | 0-100 |

**Python 示例：**

```python
book_id = 12345
args = field_header(0, 1, 5) + encode_i32(book_id)
resp = call_api(BASE_URL, "get_word_list_status", args, cookie)
```

---

## cut_word_list

> `https://learn.baicizhan.com/rpc/user_study/cut_word_list/{timestamp_ms}`

*请求方式：POST*

将指定单词ID从当前词书的学习列表中删除（裁剪词表）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |
| topic_ids | list\<i32\> | 要删除的单词ID列表 | 必须 | 字段ID=2 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |
| cut_count | i32 | 实际删除数量 | |

**Python 示例：**

```python
I32, LIST = 5, 9
book_id = 12345
topic_ids = [10001, 10002, 10003]

args = field_header(0, 1, I32) + encode_i32(book_id)
# LIST 字段头 + 列表内容
list_header = bytes([((len(topic_ids) & 0x0f) << 4) | I32]) if len(topic_ids) < 15 else bytes([0xf0 | I32]) + varint(len(topic_ids))
list_body = b''.join(encode_i32(tid) for tid in topic_ids)
args += field_header(1, 2, LIST) + list_header + list_body
resp = call_api(BASE_URL, "cut_word_list", args, cookie)
```

---

## cancel_cut_word_list

> `https://learn.baicizhan.com/rpc/user_study/cancel_cut_word_list/{timestamp_ms}`

*请求方式：POST*

恢复之前被裁剪删除的单词，将其重新加入学习列表。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |
| topic_ids | list\<i32\> | 要恢复的单词ID列表 | 必须 | 字段ID=2 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |
| restored_count | i32 | 实际恢复数量 | |

**Python 示例：**

```python
I32, LIST = 5, 9
book_id = 12345
topic_ids = [10001, 10002]

args = field_header(0, 1, I32) + encode_i32(book_id)
list_header = bytes([((len(topic_ids) & 0x0f) << 4) | I32])
list_body = b''.join(encode_i32(tid) for tid in topic_ids)
args += field_header(1, 2, LIST) + list_header + list_body
resp = call_api(BASE_URL, "cancel_cut_word_list", args, cookie)
```

---

## get_learned_words_list

> `https://learn.baicizhan.com/rpc/user_study/get_learned_words_list/{timestamp_ms}`

*请求方式：POST*

获取词书中已学过的单词列表。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| learned_words | list | 已学单词列表 | |
| topic_id | i32 | 单词ID | |
| score | i32 | 当前掌握分数 | 0-100 |
| learned_at | i64 | 最后学习时间戳 | |

**Python 示例：**

```python
book_id = 12345
args = field_header(0, 1, 5) + encode_i32(book_id)
resp = call_api(BASE_URL, "get_learned_words_list", args, cookie)
```

---

## roadmap_by_word_level_v2

> `https://learn.baicizhan.com/rpc/user_study/roadmap_by_word_level_v2/{timestamp_ms}`

*请求方式：POST*

获取词书按难度级别划分的学习路线图（V2版本）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| levels | list | 词级列表 | |
| level_id | i32 | 词级ID | |
| level_name | string | 词级名称 | |
| word_count | i32 | 该级词数 | |
| learned_count | i32 | 已学词数 | |
| is_unlocked | i32 | 是否解锁 | 0=锁定，1=解锁 |

**Python 示例：**

```python
book_id = 12345
args = field_header(0, 1, 5) + encode_i32(book_id)
resp = call_api(BASE_URL, "roadmap_by_word_level_v2", args, cookie)
```

---

## 第三节：学习进度同步（核心接口）

**本节为最核心的接口**，负责将用户完成的学习数据上报至服务器，以及配置学习模式。

---

## update_done_data

> `https://learn.baicizhan.com/rpc/user_study/update_done_data/{timestamp_ms}`

*请求方式：POST*

**【最重要接口】** 同步用户已完成学习的单词记录到服务器。每次学习单元结束后调用，将本次学习的每个单词分数、用时等数据上报。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| last_sync_at | i64 | 上次同步时间戳 | 必须 | 字段ID=1，Unix 毫秒 |
| arr_done_records | list\<UserDoneWordRecord\> | 已完成单词记录列表 | 必须 | 字段ID=2 |
| current_word_level_id | i32 | 当前词组ID | 必须 | 字段ID=3 |
| is_today_completed | bool | 今日学习是否完成 | 必须 | 字段ID=4 |

**UserDoneWordRecord 结构字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| word_topic_id | i32 | 单词ID | 必须 | 字段ID=1 |
| current_score | i32 | 当前分数(0-100) | 必须 | 字段ID=2 |
| span_days | i32 | 距上次学习天数 | 必须 | 字段ID=3 |
| used_time | i32 | 学习耗时（毫秒） | 必须 | 字段ID=4 |
| done_times | i32 | 累计已学次数 | 必须 | 字段ID=5 |
| wrong_times | i32 | 本次答错次数 | 必须 | 字段ID=6 |
| is_first_do_at_today | i32 | 今日首次学习(0/1) | 必须 | 字段ID=7 |
| tag_id | i32 | 词表标签ID | 必须 | 字段ID=8 |
| spell_score | i32 | 拼写分数 | 可选 | 字段ID=9 |
| listening_score | i32 | 听力分数 | 可选 | 字段ID=10 |
| chn_score | i32 | 中文分数 | 可选 | 字段ID=11 |
| review_round | i32 | 复习轮次 | 可选 | 字段ID=12 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| sync_at | i64 | 服务器同步时间戳 | Unix 毫秒 |
| success_count | i32 | 成功同步数量 | |
| word_level_id | i32 | 更新后的词组ID | |

**Python 完整示例：**

```python
BASE_URL = "https://learn.baicizhan.com/rpc/user_study"
cookie = make_cookie(access_token="YOUR_TOKEN")

# TCompact 类型常量
I32    = 5
I64    = 6
BOOL   = 1   # BOOL_TRUE=1; encode_bool() 返回 0x01 或 0x02
LIST   = 9
STRUCT = 12

def encode_done_word_record(word_topic_id, current_score, span_days,
                             used_time, done_times, wrong_times,
                             is_first_do_at_today, tag_id,
                             spell_score=None, listening_score=None,
                             chn_score=None, review_round=None):
    """将 UserDoneWordRecord 编码为 TCompact 二进制（含结构体结束符）"""
    body = b''
    prev = 0

    # 必须字段 (field 1-8, 类型均为 I32=5)
    body += field_header(prev, 1, I32) + encode_i32(word_topic_id);  prev = 1
    body += field_header(prev, 2, I32) + encode_i32(current_score);  prev = 2
    body += field_header(prev, 3, I32) + encode_i32(span_days);      prev = 3
    body += field_header(prev, 4, I32) + encode_i32(used_time);      prev = 4
    body += field_header(prev, 5, I32) + encode_i32(done_times);     prev = 5
    body += field_header(prev, 6, I32) + encode_i32(wrong_times);    prev = 6
    body += field_header(prev, 7, I32) + encode_i32(is_first_do_at_today); prev = 7
    body += field_header(prev, 8, I32) + encode_i32(tag_id);         prev = 8

    # 可选字段
    if spell_score is not None:
        body += field_header(prev, 9, I32) + encode_i32(spell_score);    prev = 9
    if listening_score is not None:
        body += field_header(prev, 10, I32) + encode_i32(listening_score); prev = 10
    if chn_score is not None:
        body += field_header(prev, 11, I32) + encode_i32(chn_score);     prev = 11
    if review_round is not None:
        body += field_header(prev, 12, I32) + encode_i32(review_round);  prev = 12

    body += stop()   # 结构体结束符 0x00
    return body


def encode_update_done_data(last_sync_at, records, current_word_level_id,
                             is_today_completed):
    """
    编码 update_done_data 的完整参数体。

    TCompact 列表头编码规则：
      - 元素数 < 15: 单字节 ((size & 0x0f) << 4) | elem_type
      - 元素数 >= 15: 0xf0 | elem_type, 后跟 varint(size)
    结构体元素类型 STRUCT = 12
    """
    args = b''
    prev = 0

    # field 1: last_sync_at (I64=6)
    args += field_header(prev, 1, I64) + encode_i64(last_sync_at)
    prev = 1

    # field 2: arr_done_records (LIST=9)
    n = len(records)
    if n < 15:
        list_hdr = bytes([(n << 4) | STRUCT])
    else:
        list_hdr = bytes([0xf0 | STRUCT]) + varint(n)

    list_body = b''.join(
        encode_done_word_record(**r) if isinstance(r, dict)
        else encode_done_word_record(*r)
        for r in records
    )
    args += field_header(prev, 2, LIST) + list_hdr + list_body
    prev = 2

    # field 3: current_word_level_id (I32=5)
    args += field_header(prev, 3, I32) + encode_i32(current_word_level_id)
    prev = 3

    # field 4: is_today_completed (BOOL)
    # TCompact BOOL 字段头将 True/False 编码在类型字节中
    bool_type = 1 if is_today_completed else 2   # 1=BOOL_TRUE, 2=BOOL_FALSE
    args += field_header(prev, 4, bool_type)
    # BOOL 类型无附加值字节

    return args


# ── 使用示例 ──────────────────────────────────────────────
records = [
    dict(word_topic_id=100001, current_score=80, span_days=1,
         used_time=3200, done_times=3, wrong_times=1,
         is_first_do_at_today=1, tag_id=501,
         spell_score=80, listening_score=None, chn_score=None, review_round=2),
    dict(word_topic_id=100002, current_score=60, span_days=0,
         used_time=5100, done_times=1, wrong_times=2,
         is_first_do_at_today=1, tag_id=501),
]

import time
last_sync_at = int(time.time() * 1000) - 60000   # 1 分钟前
current_word_level_id = 7
is_today_completed = False

args = encode_update_done_data(last_sync_at, records,
                                current_word_level_id, is_today_completed)
resp = call_api(BASE_URL, "update_done_data", args, cookie)
print("响应（hex）:", resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "sync_at": 1733011200000,
  "success_count": 2,
  "word_level_id": 7
}
```

</details>

---

## study_addition

> `https://learn.baicizhan.com/rpc/user_study/study_addition/{timestamp_ms}`

*请求方式：POST*

增加今日额外学习数量（追加计划）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| add_count | i32 | 追加单词数 | 必须 | 字段ID=1 |
| add_type | i32 | 追加类型 | 必须 | 字段ID=2，1=新学，2=复习 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| new_plan_count | i32 | 更新后今日计划总数 | |
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
I32 = 5
add_count = 10
add_type = 1   # 1=新学

args = field_header(0, 1, I32) + encode_i32(add_count)
args += field_header(1, 2, I32) + encode_i32(add_type)
resp = call_api(BASE_URL, "study_addition", args, cookie)
```

---

## set_study_spell_mode

> `https://learn.baicizhan.com/rpc/user_study/set_study_spell_mode/{timestamp_ms}`

*请求方式：POST*

设置拼写练习模式开关。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| spell_mode | i32 | 拼写模式 | 必须 | 字段ID=1，0=关，1=开 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
args = field_header(0, 1, 5) + encode_i32(1)  # 1=开启拼写
resp = call_api(BASE_URL, "set_study_spell_mode", args, cookie)
```

---

## set_study_fast_mode

> `https://learn.baicizhan.com/rpc/user_study/set_study_fast_mode/{timestamp_ms}`

*请求方式：POST*

设置快速学习模式开关（跳过部分练习环节）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| fast_mode | i32 | 快速模式 | 必须 | 字段ID=1，0=关，1=开 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
args = field_header(0, 1, 5) + encode_i32(1)  # 1=开启快速
resp = call_api(BASE_URL, "set_study_fast_mode", args, cookie)
```

---

## set_study_listening_mode

> `https://learn.baicizhan.com/rpc/user_study/set_study_listening_mode/{timestamp_ms}`

*请求方式：POST*

设置听力练习模式开关。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| listening_mode | i32 | 听力模式 | 必须 | 字段ID=1，0=关，1=开 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
args = field_header(0, 1, 5) + encode_i32(1)  # 1=开启听力
resp = call_api(BASE_URL, "set_study_listening_mode", args, cookie)
```

---

## set_study_chn_mode

> `https://learn.baicizhan.com/rpc/user_study/set_study_chn_mode/{timestamp_ms}`

*请求方式：POST*

设置中文释义练习模式开关。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| chn_mode | i32 | 中文模式 | 必须 | 字段ID=1，0=关，1=开 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
args = field_header(0, 1, 5) + encode_i32(1)  # 1=开启中文模式
resp = call_api(BASE_URL, "set_study_chn_mode", args, cookie)
```

---

## set_study_extra_config

> `https://learn.baicizhan.com/rpc/user_study/set_study_extra_config/{timestamp_ms}`

*请求方式：POST*

设置学习扩展配置（JSON 字符串格式）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| extra_config | string | 扩展配置 JSON 字符串 | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
import json
config = json.dumps({"show_phonetic": 1, "auto_play_audio": 1})
args = field_header(0, 1, 8) + encode_string(config)   # 字段类型 STRING=8
resp = call_api(BASE_URL, "set_study_extra_config", args, cookie)
```

---

## 第四节：打卡

本节接口负责每日打卡记录的创建、查询与补救，是连续打卡功能的核心。

---

## user_daka_v2

> `https://learn.baicizhan.com/rpc/user_study/user_daka_v2/{timestamp_ms}`

*请求方式：POST*

提交今日打卡记录（V2版本），支持附带海报词汇ID等扩展信息。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数（UserDakaRequest 结构体）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| book_id | i32 | 词书ID | 必须 | 字段ID=1 |
| count | i32 | 今日新学单词数 | 必须 | 字段ID=2 |
| daka_dates | list\<UserDakaDate\> | 打卡日期列表 | 必须 | 字段ID=3 |
| timezone | string | 时区字符串 | 必须 | 字段ID=4，如 "Asia/Shanghai" |
| client_date | i32 | 客户端日期 yyyyMMdd | 必须 | 字段ID=5，如 20241201 |
| poster_topic_ids | list\<i32\> | 海报展示单词ID列表 | 可选 | 字段ID=6 |

**UserDakaDate 结构字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| year | i32 | 年 | 必须 | 字段ID=1 |
| month | i32 | 月 | 必须 | 字段ID=2 |
| day | i32 | 日 | 必须 | 字段ID=3 |
| timestamp | i64 | 当天零点时间戳 | 必须 | 字段ID=4，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| streak_days | i32 | 连续打卡天数 | |
| total_daka_days | i32 | 历史总打卡天数 | |
| daka_at | i64 | 打卡时间戳 | Unix 毫秒 |
| reward | i32 | 本次打卡奖励积分 | |

**Python 完整示例：**

```python
BASE_URL = "https://learn.baicizhan.com/rpc/user_study"
cookie = make_cookie(access_token="YOUR_TOKEN")

I32 = 5; I64 = 6; STRING = 8; LIST = 9; STRUCT = 12

def encode_daka_date(year, month, day, timestamp_ms):
    """将 UserDakaDate 编码为 TCompact 结构体二进制"""
    body = b''
    body += field_header(0, 1, I32) + encode_i32(year)
    body += field_header(1, 2, I32) + encode_i32(month)
    body += field_header(2, 3, I32) + encode_i32(day)
    body += field_header(3, 4, I64) + encode_i64(timestamp_ms)
    body += stop()
    return body


def encode_user_daka_request(book_id, count, daka_dates,
                              timezone, client_date,
                              poster_topic_ids=None):
    """
    将 UserDakaRequest 编码为 TCompact 参数字节。
    daka_dates: list of (year, month, day, timestamp_ms) tuples
    poster_topic_ids: optional list of i32
    """
    args = b''
    prev = 0

    # field 1: book_id (I32)
    args += field_header(prev, 1, I32) + encode_i32(book_id);  prev = 1

    # field 2: count (I32)
    args += field_header(prev, 2, I32) + encode_i32(count);    prev = 2

    # field 3: daka_dates (LIST of STRUCT)
    n = len(daka_dates)
    list_hdr = bytes([(n << 4) | STRUCT]) if n < 15 else bytes([0xf0 | STRUCT]) + varint(n)
    list_body = b''.join(encode_daka_date(*d) for d in daka_dates)
    args += field_header(prev, 3, LIST) + list_hdr + list_body; prev = 3

    # field 4: timezone (STRING=8)
    args += field_header(prev, 4, STRING) + encode_string(timezone); prev = 4

    # field 5: client_date (I32)
    args += field_header(prev, 5, I32) + encode_i32(client_date); prev = 5

    # field 6: poster_topic_ids (LIST of I32，可选)
    if poster_topic_ids:
        n2 = len(poster_topic_ids)
        lhdr2 = bytes([(n2 << 4) | I32]) if n2 < 15 else bytes([0xf0 | I32]) + varint(n2)
        lbody2 = b''.join(encode_i32(tid) for tid in poster_topic_ids)
        args += field_header(prev, 6, LIST) + lhdr2 + lbody2

    return args


# ── 使用示例 ──────────────────────────────────────────────
import datetime, calendar

today = datetime.date.today()
# 今日零点时间戳（毫秒）
midnight_ts = int(datetime.datetime(today.year, today.month, today.day).timestamp() * 1000)

daka_dates = [
    (today.year, today.month, today.day, midnight_ts)
]

args = encode_user_daka_request(
    book_id=12345,
    count=20,
    daka_dates=daka_dates,
    timezone="Asia/Shanghai",
    client_date=int(today.strftime("%Y%m%d")),
    poster_topic_ids=[100001, 100002, 100003]
)

resp = call_api(BASE_URL, "user_daka_v2", args, cookie)
print("打卡响应（hex）:", resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "streak_days": 8,
  "total_daka_days": 45,
  "daka_at": 1733011200000,
  "reward": 10
}
```

</details>

---

## daka_rescue

> `https://learn.baicizhan.com/rpc/user_study/daka_rescue/{timestamp_ms}`

*请求方式：POST*

使用时间戳补救（恢复）历史某天的打卡记录，适用于漏打卡的情况。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| timestamp | i64 | 要补救的日期时间戳 | 必须 | 字段ID=1，Unix 毫秒 |
| minute_timezone | i64 | 时区偏移（分钟） | 必须 | 字段ID=2，如东八区=480 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 补救结果 | 1=成功 |
| streak_days | i32 | 更新后连续天数 | |
| cost | i32 | 消耗道具数量 | |

**Python 示例：**

```python
import datetime

yesterday = datetime.date.today() - datetime.timedelta(days=1)
ts = int(datetime.datetime(yesterday.year, yesterday.month, yesterday.day).timestamp() * 1000)

args = field_header(0, 1, 6) + encode_i64(ts)
args += field_header(1, 2, 6) + encode_i64(480)   # 东八区 +8h = 480分钟
resp = call_api(BASE_URL, "daka_rescue", args, cookie)
```

---

## daka_rescue_by_str

> `https://learn.baicizhan.com/rpc/user_study/daka_rescue_by_str/{timestamp_ms}`

*请求方式：POST*

通过日期字符串（yyyyMMdd格式）补救历史打卡记录。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| yyyyMMdd | string | 要补救的日期字符串 | 必须 | 字段ID=1，如"20241130" |
| minute_timezone | i64 | 时区偏移（分钟） | 必须 | 字段ID=2，东八区=480 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 补救结果 | 1=成功 |
| streak_days | i32 | 更新后连续天数 | |
| cost | i32 | 消耗道具数量 | |

**Python 示例：**

```python
date_str = "20241130"
args = field_header(0, 1, 8) + encode_string(date_str)
args += field_header(1, 2, 6) + encode_i64(480)
resp = call_api(BASE_URL, "daka_rescue_by_str", args, cookie)
```

---

## get_daka_base_info

> `https://learn.baicizhan.com/rpc/user_study/get_daka_base_info/{timestamp_ms}`

*请求方式：POST*

获取指定时间范围内的打卡基本信息（月历视图用）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| begin_date | UserDakaDate | 查询起始日期 | 必须 | 字段ID=1，结构体 |
| end_date | UserDakaDate | 查询结束日期 | 必须 | 字段ID=2，结构体 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| daka_records | list | 打卡记录列表 | |
| date | i32 | 打卡日期 yyyyMMdd | |
| count | i32 | 当天学习词数 | |
| streak_days | i32 | 连续打卡天数 | |
| total_days | i32 | 总打卡天数 | |

**Python 示例：**

```python
import datetime
STRUCT = 12

def encode_daka_date_inline(year, month, day, ts_ms):
    b = b''
    b += field_header(0, 1, 5) + encode_i32(year)
    b += field_header(1, 2, 5) + encode_i32(month)
    b += field_header(2, 3, 5) + encode_i32(day)
    b += field_header(3, 4, 6) + encode_i64(ts_ms)
    b += stop()
    return b

today = datetime.date.today()
first_day = today.replace(day=1)
first_ts = int(datetime.datetime(first_day.year, first_day.month, 1).timestamp() * 1000)
today_ts = int(datetime.datetime(today.year, today.month, today.day).timestamp() * 1000)

args = field_header(0, 1, STRUCT) + encode_daka_date_inline(
    first_day.year, first_day.month, 1, first_ts)
args += field_header(1, 2, STRUCT) + encode_daka_date_inline(
    today.year, today.month, today.day, today_ts)
resp = call_api(BASE_URL, "get_daka_base_info", args, cookie)
```

---

## share_bonus_v2

> `https://learn.baicizhan.com/rpc/user_study/share_bonus_v2/{timestamp_ms}`

*请求方式：POST*

分享打卡海报后领取奖励（V2版本）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数（DakaShareBonusReq 结构体）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| share_type | i32 | 分享平台类型 | 必须 | 字段ID=1，1=微信，2=朋友圈 |
| client_date | i32 | 客户端日期 yyyyMMdd | 必须 | 字段ID=2 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| bonus | i32 | 获得奖励积分 | |
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
import datetime
today_int = int(datetime.date.today().strftime("%Y%m%d"))

args = field_header(0, 1, 5) + encode_i32(1)             # share_type=1（微信）
args += field_header(1, 2, 5) + encode_i32(today_int)     # client_date
resp = call_api(BASE_URL, "share_bonus_v2", args, cookie)
```

---

## 第五节：日历

本节接口用于获取学习日历数据及复学（续签）相关信息。

---

## get_calendar_daily_info

> `https://learn.baicizhan.com/rpc/user_study/get_calendar_daily_info/{timestamp_ms}`

*请求方式：POST*

获取指定日期附近的日历学习数据（分页）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| date | i32 | 查询基准日期 yyyyMMdd | 必须 | 字段ID=1 |
| page_offset | i32 | 页偏移量 | 必须 | 字段ID=2，0为当前页 |
| page_size | i32 | 每页天数 | 必须 | 字段ID=3，建议 30 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| daily_records | list | 每日记录列表 | |
| date | i32 | 日期 yyyyMMdd | |
| new_count | i32 | 当天新学词数 | |
| review_count | i32 | 当天复习词数 | |
| is_daka | i32 | 是否打卡 | 0=否，1=是 |
| study_time | i32 | 当天学习时长（秒） | |

**Python 示例：**

```python
import datetime
today_int = int(datetime.date.today().strftime("%Y%m%d"))

args = field_header(0, 1, 5) + encode_i32(today_int)
args += field_header(1, 2, 5) + encode_i32(0)    # page_offset=0
args += field_header(2, 3, 5) + encode_i32(30)   # page_size=30
resp = call_api(BASE_URL, "get_calendar_daily_info", args, cookie)
```

<details><summary>查看响应示例：</summary>

```json
{
  "daily_records": [
    {"date": 20241201, "new_count": 20, "review_count": 30, "is_daka": 1, "study_time": 600},
    {"date": 20241130, "new_count": 20, "review_count": 28, "is_daka": 1, "study_time": 540}
  ]
}
```

</details>

---

## get_calendar_resign_info

> `https://learn.baicizhan.com/rpc/user_study/get_calendar_resign_info/{timestamp_ms}`

*请求方式：POST*

获取日历补签（续签）相关信息，包括可补签次数及费用。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| remain_rescue_count | i32 | 剩余补签次数 | |
| rescue_cost | i32 | 每次补签消耗道具数 | |
| max_rescue_days | i32 | 最多可补签天数 | |
| rescuable_dates | list | 可补签日期列表（yyyyMMdd） | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_calendar_resign_info", b'', cookie)
```

---

## 第六节：收藏单词

本节接口用于管理用户手动收藏的单词（生词本）。

---

## add_collect_words

> `https://learn.baicizhan.com/rpc/user_study/add_collect_words/{timestamp_ms}`

*请求方式：POST*

添加单词到收藏列表（生词本）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| words | list\<UserCollectWord\> | 要收藏的单词列表 | 必须 | 字段ID=1 |
| last_updated_at | i64 | 客户端最后更新时间戳 | 必须 | 字段ID=2，Unix 毫秒 |

**UserCollectWord 结构字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| topic_id | i32 | 单词ID | 必须 | 字段ID=1 |
| book_id | i32 | 所属词书ID | 必须 | 字段ID=2 |
| collected_at | i64 | 收藏时间戳 | 必须 | 字段ID=3，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success_count | i32 | 成功添加数量 | |
| updated_at | i64 | 服务端更新时间戳 | |

**Python 示例：**

```python
I32 = 5; I64 = 6; LIST = 9; STRUCT = 12

def encode_collect_word(topic_id, book_id, collected_at_ms):
    b = field_header(0, 1, I32) + encode_i32(topic_id)
    b += field_header(1, 2, I32) + encode_i32(book_id)
    b += field_header(2, 3, I64) + encode_i64(collected_at_ms)
    b += stop()
    return b

import time
words = [(100001, 12345, int(time.time()*1000))]
n = len(words)
list_hdr = bytes([(n << 4) | STRUCT])
list_body = b''.join(encode_collect_word(*w) for w in words)

args = field_header(0, 1, LIST) + list_hdr + list_body
args += field_header(1, 2, I64) + encode_i64(int(time.time()*1000))
resp = call_api(BASE_URL, "add_collect_words", args, cookie)
```

---

## delete_collect_words

> `https://learn.baicizhan.com/rpc/user_study/delete_collect_words/{timestamp_ms}`

*请求方式：POST*

从收藏列表中删除指定单词。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| words | list\<UserCollectWord\> | 要删除的单词列表 | 必须 | 字段ID=1 |
| last_updated_at | i64 | 客户端最后更新时间戳 | 必须 | 字段ID=2，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success_count | i32 | 成功删除数量 | |
| updated_at | i64 | 服务端更新时间戳 | |

**Python 示例：**

```python
# 与 add_collect_words 编码方式相同，替换方法名即可
args = field_header(0, 1, LIST) + list_hdr + list_body
args += field_header(1, 2, I64) + encode_i64(int(time.time()*1000))
resp = call_api(BASE_URL, "delete_collect_words", args, cookie)
```

---

## get_all_collect_words_v2

> `https://learn.baicizhan.com/rpc/user_study/get_all_collect_words_v2/{timestamp_ms}`

*请求方式：POST*

获取用户全部收藏单词列表（V2版本，支持增量同步）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| words | list | 收藏单词列表 | |
| topic_id | i32 | 单词ID | |
| book_id | i32 | 所属词书ID | |
| collected_at | i64 | 收藏时间戳 | Unix 毫秒 |
| updated_at | i64 | 最后同步时间戳 | Unix 毫秒 |
| total_count | i32 | 收藏总数 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_all_collect_words_v2", b'', cookie)
print(resp.hex())
```

---

## 第七节：单词笔记

本节接口用于管理用户为单词添加的个人笔记。

---

## get_word_note

> `https://learn.baicizhan.com/rpc/user_study/get_word_note/{timestamp_ms}`

*请求方式：POST*

批量获取指定单词的用户笔记。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| topic_ids | list\<i32\> | 单词ID列表 | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| notes | list | 笔记列表 | |
| topic_id | i32 | 单词ID | |
| content | string | 笔记内容 | |
| updated_at | i64 | 最后更新时间戳 | Unix 毫秒 |

**Python 示例：**

```python
I32 = 5; LIST = 9
topic_ids = [100001, 100002]
n = len(topic_ids)
list_hdr = bytes([(n << 4) | I32])
list_body = b''.join(encode_i32(tid) for tid in topic_ids)

args = field_header(0, 1, LIST) + list_hdr + list_body
resp = call_api(BASE_URL, "get_word_note", args, cookie)
```

---

## update_word_note

> `https://learn.baicizhan.com/rpc/user_study/update_word_note/{timestamp_ms}`

*请求方式：POST*

新增或更新指定单词的用户笔记。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数（WordNote 结构体）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| topic_id | i32 | 单词ID | 必须 | 字段ID=1 |
| content | string | 笔记内容 | 必须 | 字段ID=2 |
| updated_at | i64 | 客户端更新时间戳 | 必须 | 字段ID=3，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |
| server_updated_at | i64 | 服务端更新时间戳 | |

**Python 示例：**

```python
import time
I32 = 5; I64 = 6; STRING = 8; STRUCT = 12

def encode_word_note(topic_id, content, updated_at_ms):
    b = field_header(0, 1, I32) + encode_i32(topic_id)
    b += field_header(1, 2, STRING) + encode_string(content)
    b += field_header(2, 3, I64) + encode_i64(updated_at_ms)
    b += stop()
    return b

note_bytes = encode_word_note(100001, "这个单词表示'苹果'，常见搭配 apple pie", int(time.time()*1000))
# update_word_note 参数为单个 WordNote（直接以 field 1=STRUCT 传入）
args = field_header(0, 1, STRUCT) + note_bytes
resp = call_api(BASE_URL, "update_word_note", args, cookie)
```

---

## delete_word_note

> `https://learn.baicizhan.com/rpc/user_study/delete_word_note/{timestamp_ms}`

*请求方式：POST*

删除指定单词的用户笔记。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| topic_id | i32 | 要删除笔记的单词ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |

**Python 示例：**

```python
args = field_header(0, 1, 5) + encode_i32(100001)
resp = call_api(BASE_URL, "delete_word_note", args, cookie)
```

---

## 第八节：任务与积分

本节接口用于查询和领取每日任务奖励、开宝箱及积分任务中心。

---

## get_daily_task

> `https://learn.baicizhan.com/rpc/user_study/get_daily_task/{timestamp_ms}`

*请求方式：POST*

获取今日所有任务列表及完成状态。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| tasks | list | 任务列表 | |
| task_id | i32 | 任务ID | |
| task_name | string | 任务名称 | |
| task_type | i32 | 任务类型 | |
| target | i32 | 完成目标值 | |
| progress | i32 | 当前进度 | |
| reward | i32 | 奖励积分/道具数 | |
| is_completed | i32 | 是否已完成 | 0=否，1=是 |
| is_received | i32 | 是否已领取 | 0=否，1=是 |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_daily_task", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "tasks": [
    {
      "task_id": 1001,
      "task_name": "今日学习20个单词",
      "task_type": 1,
      "target": 20,
      "progress": 10,
      "reward": 50,
      "is_completed": 0,
      "is_received": 0
    },
    {
      "task_id": 1002,
      "task_name": "连续打卡7天",
      "task_type": 2,
      "target": 7,
      "progress": 4,
      "reward": 100,
      "is_completed": 0,
      "is_received": 0
    }
  ]
}
```

</details>

---

## receive_task_award

> `https://learn.baicizhan.com/rpc/user_study/receive_task_award/{timestamp_ms}`

*请求方式：POST*

领取已完成任务的奖励。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| task_id | i32 | 任务ID | 必须 | 字段ID=1 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 领取结果 | 1=成功 |
| reward_type | i32 | 奖励类型 | 1=积分，2=道具 |
| reward_amount | i32 | 获得奖励数量 | |
| total_credit | i32 | 领取后总积分 | |

**Python 示例：**

```python
task_id = 1001
args = field_header(0, 1, 5) + encode_i32(task_id)
resp = call_api(BASE_URL, "receive_task_award", args, cookie)
```

---

## open_box

> `https://learn.baicizhan.com/rpc/user_study/open_box/{timestamp_ms}`

*请求方式：POST*

开启宝箱，获取随机奖励。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| client_timestamp_ms | i64 | 客户端开箱时间戳 | 必须 | 字段ID=1，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 开箱结果 | 1=成功 |
| reward_type | i32 | 奖励类型 | |
| reward_amount | i32 | 奖励数量 | |
| next_box_at | i64 | 下次可开箱时间戳 | Unix 毫秒 |

**Python 示例：**

```python
import time
args = field_header(0, 1, 6) + encode_i64(int(time.time()*1000))
resp = call_api(BASE_URL, "open_box", args, cookie)
```

---

## can_open_box

> `https://learn.baicizhan.com/rpc/user_study/can_open_box/{timestamp_ms}`

*请求方式：POST*

查询当前是否可以开宝箱（CD冷却查询）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| client_timestamp_ms | i64 | 客户端查询时间戳 | 必须 | 字段ID=1，Unix 毫秒 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| can_open | i32 | 是否可开箱 | 0=不可，1=可以 |
| next_box_at | i64 | 下次可开箱时间戳 | Unix 毫秒；can_open=0 时有效 |
| remaining_ms | i64 | 距下次开箱剩余毫秒 | |

**Python 示例：**

```python
import time
args = field_header(0, 1, 6) + encode_i64(int(time.time()*1000))
resp = call_api(BASE_URL, "can_open_box", args, cookie)
```

---

## credit_task_center

> `https://learn.baicizhan.com/rpc/user_study/credit_task_center/{timestamp_ms}`

*请求方式：POST*

获取积分任务中心数据，包含所有可做任务及当前积分余额。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| total_credit | i32 | 当前积分总量 | |
| tasks | list | 积分任务列表 | |
| task_id | i32 | 任务ID | |
| task_name | string | 任务名称 | |
| credit_reward | i32 | 任务积分奖励 | |
| is_completed | i32 | 是否已完成 | |
| repeat_type | i32 | 重复类型 | 1=每日，2=每周，0=一次性 |

**Python 示例：**

```python
resp = call_api(BASE_URL, "credit_task_center", b'', cookie)
print(resp.hex())
```

---

## 第九节：其他

本节包含错题订正、体验记录上报、图片上传及排行榜查询等辅助接口。

---

## submit_experience_record

> `https://learn.baicizhan.com/rpc/user_study/submit_experience_record/{timestamp_ms}`

*请求方式：POST*

批量上报用户学习体验记录（埋点数据），用于后台分析学习行为。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| records | list\<StudyExperienceRecord\> | 体验记录列表 | 必须 | 字段ID=1 |

**StudyExperienceRecord 结构字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| event_type | i32 | 事件类型 | 必须 | 字段ID=1 |
| topic_id | i32 | 相关单词ID | 可选 | 字段ID=2 |
| timestamp_ms | i64 | 事件时间戳 | 必须 | 字段ID=3，Unix 毫秒 |
| extra | string | 额外JSON参数 | 可选 | 字段ID=4 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 操作结果 | 1=成功 |
| received_count | i32 | 服务端接收数量 | |

**Python 示例：**

```python
import time
I32 = 5; I64 = 6; STRING = 8; LIST = 9; STRUCT = 12

def encode_experience_record(event_type, timestamp_ms, topic_id=None, extra=None):
    b = field_header(0, 1, I32) + encode_i32(event_type); prev = 1
    if topic_id is not None:
        b += field_header(prev, 2, I32) + encode_i32(topic_id); prev = 2
    b += field_header(prev, 3, I64) + encode_i64(timestamp_ms); prev = 3
    if extra is not None:
        b += field_header(prev, 4, STRING) + encode_string(extra)
    b += stop()
    return b

records_data = [
    encode_experience_record(1, int(time.time()*1000), topic_id=100001)
]
n = len(records_data)
list_hdr = bytes([(n << 4) | STRUCT])
list_body = b''.join(records_data)

args = field_header(0, 1, LIST) + list_hdr + list_body
resp = call_api(BASE_URL, "submit_experience_record", args, cookie)
```

---

## submit_topic_correction

> `https://learn.baicizhan.com/rpc/user_study/submit_topic_correction/{timestamp_ms}`

*请求方式：POST*

提交单词内容纠错请求，反馈词书中的错误（如错别字、错误释义）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数（TopicCorrectionReq 结构体）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| topic_id | i32 | 单词ID | 必须 | 字段ID=1 |
| correction_type | i32 | 纠错类型 | 必须 | 字段ID=2，1=拼写，2=释义，3=例句 |
| description | string | 错误描述 | 必须 | 字段ID=3 |
| contact | string | 联系方式（可选） | 可选 | 字段ID=4 |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| success | i32 | 提交结果 | 1=成功 |
| correction_id | i64 | 纠错单ID | 用于追踪处理状态 |

**Python 示例：**

```python
I32 = 5; STRING = 8; STRUCT = 12

def encode_correction_req(topic_id, correction_type, description, contact=None):
    b = field_header(0, 1, I32) + encode_i32(topic_id)
    b += field_header(1, 2, I32) + encode_i32(correction_type)
    b += field_header(2, 3, STRING) + encode_string(description)
    if contact:
        b += field_header(3, 4, STRING) + encode_string(contact)
    b += stop()
    return b

req_bytes = encode_correction_req(100001, 2, "该单词的中文释义有误，应为'苹果'而非'橘子'")
args = field_header(0, 1, STRUCT) + req_bytes
resp = call_api(BASE_URL, "submit_topic_correction", args, cookie)
```

---

## upload_img

> `https://learn.baicizhan.com/rpc/user_study/upload_img/{timestamp_ms}`

*请求方式：POST*

上传图片至服务器（如打卡分享海报图片）。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| img | binary | 图片二进制数据 | 必须 | 字段ID=1，ByteBuffer |

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| img_url | string | 上传后的图片URL | |
| success | i32 | 上传结果 | 1=成功 |

**Python 示例：**

```python
BINARY = 8  # 二进制类型与 STRING 共用类型码 8

with open("share_poster.png", "rb") as f:
    img_bytes = f.read()

# binary 字段：varint(长度) + 原始字节
img_field = varint(len(img_bytes)) + img_bytes
args = field_header(0, 1, BINARY) + img_field
resp = call_api(BASE_URL, "upload_img", args, cookie)
```

---

## get_rank_info

> `https://learn.baicizhan.com/rpc/user_study/get_rank_info/{timestamp_ms}`

*请求方式：POST*

获取用户在好友/全服排行榜中的学习排名信息。

**认证方式：** Cookie（需携带 `access_token`）

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| my_rank | i32 | 当前用户排名 | |
| my_score | i32 | 当前用户积分/学习数 | |
| rank_list | list | 排行榜列表（前N名） | |
| rank | i32 | 名次 | |
| user_id | i64 | 用户ID | |
| nickname | string | 用户昵称 | |
| avatar_url | string | 头像URL | |
| score | i32 | 得分 | |
| total_learned | i32 | 累计学习词数 | |

**Python 示例：**

```python
resp = call_api(BASE_URL, "get_rank_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "my_rank": 5,
  "my_score": 350,
  "rank_list": [
    {"rank": 1, "user_id": 88001, "nickname": "学霸A", "avatar_url": "https://...", "score": 500, "total_learned": 2000},
    {"rank": 2, "user_id": 88002, "nickname": "学霸B", "avatar_url": "https://...", "score": 480, "total_learned": 1950},
    {"rank": 5, "user_id": 12345, "nickname": "我", "avatar_url": "https://...", "score": 350, "total_learned": 1200}
  ]
}
```

</details>

---

## 附录：TCompact 编码速查

### 字段类型常量

| 常量名 | 值 | 说明 |
|--------|----|------|
| BOOL_TRUE | 1 | 布尔 true（编码在字段头类型位中） |
| BOOL_FALSE | 2 | 布尔 false |
| BYTE | 3 | 单字节整数 |
| I16 | 4 | 16位整数（ZigZag + Varint） |
| I32 | 5 | 32位整数（ZigZag + Varint） |
| I64 | 6 | 64位整数（ZigZag + Varint） |
| DOUBLE | 7 | 64位浮点数（小端序） |
| BINARY/STRING | 8 | 字节串/字符串（varint长度前缀） |
| LIST | 9 | 列表 |
| SET | 10 | 集合 |
| MAP | 11 | 映射 |
| STRUCT | 12 | 结构体（以 0x00 结束） |

### 列表编码规则

```
元素数 n < 15：  单字节 [(n & 0x0f) << 4 | elem_type]
元素数 n >= 15： 字节 [0xf0 | elem_type] + varint(n)
```

### 请求帧格式

```
[4字节大端帧长] [0x82][0x21] [varint(seq)] [varint(method_len)][method_bytes]
[args_bytes] [0x00 (stop)]
```

---

> 文档版本：BCZ APK 7.8.14 · 最后更新：2024年
>
> 相关文档：[登录认证](login.md) · [资源服务](resource_api.md) · [游戏服务](game_api.md) · [统一用户服务](unified_user_service.md) · [其他服务](other_services.md) · [Thrift 客户端](thrift_client.md) · [学习流程](flow_study.md)
