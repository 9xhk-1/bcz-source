# UserBookService API 文档

> 逆向来源：APK 7.8.14，仅供网络安全研究目的。  
> **端点：** `https://booklist.baicizhan.com/rpc/user_book`  
> **备用：** `https://booklist.bczeducation.cn/rpc/user_book`

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## 第一节：自建词书管理

---

## get_user_books

> `https://booklist.baicizhan.com/rpc/user_book/get_user_books/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取当前用户所有自建词书列表。

**请求参数：** 无

**响应字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `user_books` | `List<UserBookItem>` | 词书列表 | 可为空列表 |

**UserBookItem 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `user_book_id` | `i64` | 词书ID | |
| `book_name` | `string` | 词书名称 | |
| `word_count` | `i32` | 单词数量 | |
| `create_time` | `i64` | 创建时间 | Unix秒 |

**Python 示例：**

```python
import time, struct, requests
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol

def call(host, service, method, write_fn):
    url = f"https://{host}/rpc/{service}/{method}/{int(time.time()*1000)}"
    buf = TTransport.TMemoryBuffer()
    proto = TCompactProtocol.TCompactProtocol(buf)
    proto.writeMessageBegin(method, 1, 0)
    write_fn(proto)
    proto.writeMessageEnd()
    payload = buf.getvalue()
    body = struct.pack(">I", len(payload)) + payload
    cookies = {
        "device_id": "aabbccdd1234abcd", "app_name": "7081400",
        "channel": "official", "version": "14",
        "client_time": str(int(time.time())), "time_zone": "Asia/Shanghai",
        "access_token": "YOUR_TOKEN_HERE"
    }
    r = requests.post(url, data=body, cookies=cookies,
                      headers={"Content-Type": "application/x-thrift"})
    rbuf = TTransport.TMemoryBuffer(r.content[4:])
    rproto = TCompactProtocol.TCompactProtocol(rbuf)
    rproto.readMessageBegin()
    return rproto

proto = call("booklist.baicizhan.com", "user_book", "get_user_books",
             lambda p: (p.writeStructBegin(""), p.writeFieldStop(), p.writeStructEnd()))
# 解析响应...
```

<details><summary>查看响应示例：</summary>

```json
{
  "user_books": [
    {
      "user_book_id": 123456789,
      "book_name": "我的单词书",
      "word_count": 42,
      "create_time": 1716000000
    }
  ]
}
```

</details>

---

## add_user_book

> `https://booklist.baicizhan.com/rpc/user_book/add_user_book/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

创建新的自建词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_name` | `string` | 词书名称 | 必须 | 字段序号 1 |

**响应字段：** 返回新创建的 `UserBookItem`（字段同上）

**Python 示例：**

```python
def write_add_user_book(proto, book_name: str):
    proto.writeStructBegin("add_user_book_args")
    proto.writeFieldBegin("book_name", 11, 1)  # 11 = TType.STRING
    proto.writeString(book_name.encode())
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

proto = call("booklist.baicizhan.com", "user_book", "add_user_book",
             lambda p: write_add_user_book(p, "四六级词汇"))
```

<details><summary>查看响应示例：</summary>

```json
{
  "user_book_id": 987654321,
  "book_name": "四六级词汇",
  "word_count": 0,
  "create_time": 1716001000
}
```

</details>

---

## add_user_book_by_code

> `https://booklist.baicizhan.com/rpc/user_book/add_user_book_by_code/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

通过分享码添加他人的词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `share_code` | `string` | 词书分享码 | 必须 | 字段序号 1 |

**响应字段：** 返回 `UserBookItem`

<details><summary>查看响应示例：</summary>

```json
{
  "user_book_id": 112233445,
  "book_name": "好友分享的词书",
  "word_count": 100,
  "create_time": 1716002000
}
```

</details>

---

## delete_user_book

> `https://booklist.baicizhan.com/rpc/user_book/delete_user_book/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

删除指定自建词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 1 |

**响应字段：** 返回被删除的 `user_book_id`（`i64`）

---

## update_user_book_name

> `https://booklist.baicizhan.com/rpc/user_book/update_user_book_name/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

重命名词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_name` | `string` | 新词书名称 | 必须 | 字段序号 1 |
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 2 |

**响应字段：** 返回更新后的 `UserBookItem`

---

## get_user_book_words

> `https://booklist.baicizhan.com/rpc/user_book/get_user_book_words/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取词书中所有单词详情。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 1 |

**响应字段：** 返回 `List<UserBookWordDetail>`

**UserBookWordDetail 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `topic_id` | `i32` | 单词主题ID | |
| `word` | `string` | 单词 | |
| `translation` | `string` | 翻译 | |
| `word_level_id` | `i32` | 词级ID | |

<details><summary>查看响应示例：</summary>

```json
[
  { "topic_id": 10001, "word": "abandon", "translation": "放弃", "word_level_id": 2 },
  { "topic_id": 10002, "word": "ability", "translation": "能力", "word_level_id": 1 }
]
```

</details>

---

## add_word_to_books

> `https://booklist.baicizhan.com/rpc/user_book/add_word_to_books/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

将单个单词添加到多个词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `word` | `UserBookWord` | 单词信息 | 必须 | 字段序号 1 |
| `user_book_ids` | `List<i64>` | 目标词书ID列表 | 必须 | 字段序号 2 |

**UserBookWord 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `topic_id` | `i32` | 单词主题ID | 必须 | 字段序号 1 |
| `word_level_id` | `i32` | 词级ID | 可选 | 字段序号 2 |

**响应字段：** 返回 `AddSingleWordRsp`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `success_book_ids` | `List<i64>` | 添加成功的词书ID | |
| `fail_book_ids` | `List<i64>` | 添加失败的词书ID | |

**Python 示例：**

```python
def write_add_word_to_books(proto, topic_id: int, word_level_id: int, book_ids: list):
    proto.writeStructBegin("add_word_to_books_args")
    # word 参数
    proto.writeFieldBegin("word", 12, 1)  # 12 = TType.STRUCT
    proto.writeStructBegin("UserBookWord")
    proto.writeFieldBegin("topic_id", 8, 1)   # 8 = TType.I32
    proto.writeI32(topic_id)
    proto.writeFieldEnd()
    proto.writeFieldBegin("word_level_id", 8, 2)
    proto.writeI32(word_level_id)
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()
    proto.writeFieldEnd()
    # user_book_ids 参数
    proto.writeFieldBegin("user_book_ids", 15, 2)  # 15 = TType.LIST
    proto.writeListBegin(10, len(book_ids))  # 10 = TType.I64
    for bid in book_ids:
        proto.writeI64(bid)
    proto.writeListEnd()
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

proto = call("booklist.baicizhan.com", "user_book", "add_word_to_books",
             lambda p: write_add_word_to_books(p, 10001, 2, [123456789, 987654321]))
```

<details><summary>查看响应示例：</summary>

```json
{
  "success_book_ids": [123456789, 987654321],
  "fail_book_ids": []
}
```

</details>

---

## add_words_to_book

> `https://booklist.baicizhan.com/rpc/user_book/add_words_to_book/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

批量添加单词到指定词书。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 1 |
| `words` | `List<UserBookWord>` | 单词列表 | 必须 | 字段序号 2 |

**响应字段：** 返回 `AddWordsRsp`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `success_count` | `i32` | 成功添加数量 | |
| `fail_count` | `i32` | 失败数量 | |

---

## delete_user_book_words

> `https://booklist.baicizhan.com/rpc/user_book/delete_user_book_words/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

从词书中删除指定单词。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 1 |
| `topic_ids` | `List<i32>` | 要删除的单词主题ID列表 | 必须 | 字段序号 2 |

**响应字段：** 返回更新后的 `UserBookItem`

---

## get_user_book_share_code

> `https://booklist.baicizhan.com/rpc/user_book/get_user_book_share_code/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取词书的分享码，可分享给他人使用 `add_user_book_by_code` 导入。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 1 |

**响应字段：** 返回 `string` 分享码

<details><summary>查看响应示例：</summary>

```json
"BCZ-SHARE-ABCD1234"
```

</details>

---

## 第二节：单词匹配（OCR 与文本识别）

---

## match_words

> `https://booklist.baicizhan.com/rpc/user_book/match_words/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

从纯文本内容中识别英文单词并返回匹配的词库单词列表。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `content` | `string` | 文本内容 | 必须 | 字段序号 1 |

**响应字段：** 返回 `List<UserBookWord>`

---

## match_words_v2

> `https://booklist.baicizhan.com/rpc/user_book/match_words_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

文本单词匹配 v2，使用结构体封装请求。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `req` | `MatchWordReq` | 请求结构体 | 必须 | 字段序号 1 |

**MatchWordReq 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `content` | `string` | 文本内容 | 必须 | 字段序号 1 |

**响应字段：** 返回 `List<UserBookWord>`

---

## match_words_ocr

> `https://booklist.baicizhan.com/rpc/user_book/match_words_ocr/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

OCR 识别图片中的单词，返回匹配词库中的单词列表。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `img` | `binary` | 图片二进制数据 | 必须 | 字段序号 1，支持 JPG/PNG |

**响应字段：** 返回 `List<UserBookWord>`

---

## 第三节：设备绑定（智能硬件同步）

---

## get_user_machine_infos_v2

> `https://booklist.baicizhan.com/rpc/user_book/get_user_machine_infos_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取用户已绑定的智能学习机等硬件设备列表。

**请求参数：** 无

**响应字段：** 返回 `List<UserMachineInfo>`

**UserMachineInfo 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `device_id` | `i64` | 设备ID | |
| `device_name` | `string` | 设备显示名称 | |
| `device_type` | `i32` | 设备类型 | 如：1=学习机 |
| `bind_time` | `i64` | 绑定时间 | Unix秒 |

<details><summary>查看响应示例：</summary>

```json
[
  {
    "device_id": 555666777,
    "device_name": "我的学习机",
    "device_type": 1,
    "bind_time": 1716000000
  }
]
```

</details>

---

## select_user_book

> `https://booklist.baicizhan.com/rpc/user_book/select_user_book/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

为指定硬件设备设置当前学习词书及每日学习计划数量。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device_id` | `i64` | 设备ID | 必须 | 字段序号 1 |
| `user_book_id` | `i64` | 词书ID | 必须 | 字段序号 2 |
| `daily_plan_count` | `i32` | 每日计划单词数 | 必须 | 字段序号 3 |

**响应字段：** `void`

---

## remove_bind_machine_v2

> `https://booklist.baicizhan.com/rpc/user_book/remove_bind_machine_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

解除绑定指定设备。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device_id` | `i64` | 设备ID | 必须 | 字段序号 1 |
| `device_type` | `i32` | 设备类型 | 必须 | 字段序号 2 |

**响应字段：** `void`

---

## rename_machine_v2

> `https://booklist.baicizhan.com/rpc/user_book/rename_machine_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

重命名已绑定设备的显示名称。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device_id` | `i64` | 设备ID | 必须 | 字段序号 1 |
| `device_name` | `string` | 新设备名称 | 必须 | 字段序号 2 |
| `device_type` | `i32` | 设备类型 | 必须 | 字段序号 3 |

**响应字段：** `void`
