# UserAssistantApiService / UserActivityApiService API 文档

> 逆向来源：APK 7.8.14，仅供网络安全研究目的。

---

## UserAssistantApiService（用户助手）

**端点：** `https://assistant.baicizhan.com/rpc/assistant`  
**备用：** `https://assistant.bczeducation.cn/rpc/assistant`

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## get_exploration_items

> `https://assistant.baicizhan.com/rpc/assistant/get_exploration_items/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取"探索"页面的内容列表，包含推荐词书、活动入口等。

**请求参数：** 无

**响应字段：** 返回 `List<ExplorationItem>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `item_id` | `string` | 条目ID | |
| `title` | `string` | 标题 | |
| `subtitle` | `string` | 副标题 | |
| `image_url` | `string` | 封面图片 | |
| `click_url` | `string` | 跳转链接 | |
| `item_type` | `i32` | 条目类型 | 1=词书，2=活动，3=广告 |

---

## analyze_clipboard

> `https://assistant.baicizhan.com/rpc/assistant/analyze_clipboard/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

分析剪贴板内容，识别其中的英文单词、邀请码、分享链接等。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `code` | `string` | 剪贴板文本内容 | 必须 | 字段序号 1 |

**响应字段：** 返回 `ClipboardResp`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `type` | `i32` | 识别类型 | 0=无，1=单词，2=邀请码，3=分享码 |
| `content` | `string` | 解析后的内容 | |
| `action_url` | `string` | 建议跳转地址 | |

---

## get_beta_user_types_v2

> `https://assistant.baicizhan.com/rpc/assistant/get_beta_user_types_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取当前用户的 Beta 功能权限标记，用于灰度功能放量控制。

**请求参数：** 无

**响应字段：** 返回 `UserBetaInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `beta_types` | `List<string>` | 已开启的Beta功能标识列表 | |
| `is_beta_user` | `bool` | 是否为Beta用户 | |

---

## get_activity_updated_time

> `https://assistant.baicizhan.com/rpc/assistant/get_activity_updated_time/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取活动内容的最后更新时间，用于客户端缓存失效判断。

**请求参数：** 无

**响应字段：** 返回 `int`（Unix 秒时间戳）

<details><summary>查看响应示例：</summary>

```json
1716050000
```

</details>

---

## check_feedback_msg

> `https://assistant.baicizhan.com/rpc/assistant/check_feedback_msg/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

检查是否有未读的用户反馈回复消息。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device_id` | `string` | 设备ID | 必须 | 字段序号 1 |

**响应字段：** 返回 `int`（未读反馈消息数量）

---

## done_word_stat

> `https://assistant.baicizhan.com/rpc/assistant/done_word_stat/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

上报单词学习统计数据，用于后台分析和记忆算法优化。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | `i32` | 词书ID | 必须 | 字段序号 1 |
| `stat_logs` | `List<DoneWordStatLog>` | 统计日志列表 | 必须 | 字段序号 2 |

**DoneWordStatLog 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `topic_id` | `i32` | 单词主题ID | 必须 | 字段序号 1 |
| `stat_type` | `i32` | 统计类型 | 必须 | 字段序号 2；1=正确，2=错误，3=跳过 |
| `value` | `i32` | 统计值 | 必须 | 字段序号 3 |

**响应字段：** 返回 `int`（成功处理的记录数）

**Python 示例：**

```python
import time, struct, requests
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol

def call_assistant(method, write_fn, token):
    url = f"https://assistant.baicizhan.com/rpc/assistant/{method}/{int(time.time()*1000)}"
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
        "access_token": token
    }
    r = requests.post(url, data=body, cookies=cookies,
                      headers={"Content-Type": "application/x-thrift"})
    rbuf = TTransport.TMemoryBuffer(r.content[4:])
    rproto = TCompactProtocol.TCompactProtocol(rbuf)
    rproto.readMessageBegin()
    return rproto

def write_done_word_stat(proto, book_id: int, stat_logs: list):
    """stat_logs: [{"topic_id": int, "stat_type": int, "value": int}]"""
    proto.writeStructBegin("done_word_stat_args")
    proto.writeFieldBegin("book_id", 8, 1)
    proto.writeI32(book_id)
    proto.writeFieldEnd()
    proto.writeFieldBegin("stat_logs", 15, 2)
    proto.writeListBegin(12, len(stat_logs))
    for log in stat_logs:
        proto.writeStructBegin("DoneWordStatLog")
        proto.writeFieldBegin("topic_id", 8, 1)
        proto.writeI32(log["topic_id"])
        proto.writeFieldEnd()
        proto.writeFieldBegin("stat_type", 8, 2)
        proto.writeI32(log["stat_type"])
        proto.writeFieldEnd()
        proto.writeFieldBegin("value", 8, 3)
        proto.writeI32(log["value"])
        proto.writeFieldEnd()
        proto.writeFieldStop()
        proto.writeStructEnd()
    proto.writeListEnd()
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

logs = [
    {"topic_id": 10001, "stat_type": 1, "value": 1},
    {"topic_id": 10002, "stat_type": 2, "value": 1},
]
proto = call_assistant("done_word_stat",
                       lambda p: write_done_word_stat(p, 123, logs),
                       token="YOUR_TOKEN_HERE")
```

---

## get_credit

> `https://assistant.baicizhan.com/rpc/assistant/get_credit/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取当前用户的积分数量。

**请求参数：** 无

**响应字段：** 返回 `int`（积分数量）

**Python 示例：**

```python
proto = call_assistant(
    "get_credit",
    lambda p: (p.writeStructBegin(""), p.writeFieldStop(), p.writeStructEnd()),
    token="YOUR_TOKEN_HERE"
)
# 解析响应中的 i32 字段即为积分值
```

<details><summary>查看响应示例：</summary>

```json
2580
```

</details>

---

## huawei_pay

> `https://assistant.baicizhan.com/rpc/assistant/huawei_pay/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

华为应用内支付回调接口，由客户端在完成华为支付后调用服务端核验。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `pay_info` | `HuaweiPayInfo` | 华为支付信息 | 必须 | 字段序号 1 |

**HuaweiPayInfo 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `order_id` | `string` | 百词斩订单ID | 必须 | 字段序号 1 |
| `purchase_token` | `string` | 华为支付凭证Token | 必须 | 字段序号 2 |
| `product_id` | `string` | 商品ID | 必须 | 字段序号 3 |

**响应字段：** 返回 `PayResp`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `success` | `bool` | 支付是否核验成功 | |
| `msg` | `string` | 结果描述 | |

---

## UserActivityApiService（活动 / 导出）

**端点：** `https://activity.baicizhan.com/rpc/activity`  
**备用：** `https://activity.bczeducation.cn/rpc/activity`

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## get_export_activity_info

> `https://activity.baicizhan.com/rpc/activity/get_export_activity_info/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取单词导出活动信息，包括用户是否有资格、剩余免费名额等。

**请求参数：** 无

**响应字段：** 返回 `ExportActivityInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `is_eligible` | `bool` | 是否有导出资格 | |
| `free_quota` | `i32` | 剩余免费导出次数 | |
| `activity_end_time` | `i64` | 活动截止时间 | Unix秒 |
| `description` | `string` | 活动说明 | |

<details><summary>查看响应示例：</summary>

```json
{
  "is_eligible": true,
  "free_quota": 3,
  "activity_end_time": 1717200000,
  "description": "限时活动：免费导出生词本，名额有限！"
}
```

</details>

---

## buy_export_quota

> `https://activity.baicizhan.com/rpc/activity/buy_export_quota/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

购买额外的单词导出配额。

**请求参数：** 无

**响应字段：** 返回 `ExportQuota`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `remaining_quota` | `i32` | 购买后剩余配额 | |
| `expire_time` | `i64` | 配额有效期 | Unix秒 |

---

## export_words

> `https://activity.baicizhan.com/rpc/activity/export_words/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

将用户单词本导出到邮箱或其他目标。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `param` | `ExportParam` | 导出参数 | 必须 | 字段序号 1 |

**ExportParam 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `email` | `string` | 接收邮箱地址 | 必须 | 字段序号 1 |
| `book_id` | `i32` | 要导出的词书ID | 必须 | 字段序号 2 |
| `format` | `i32` | 导出格式 | 必须 | 字段序号 3；1=CSV，2=TXT，3=Excel |

**响应字段：** `void`（导出任务异步执行，邮件将发送到指定邮箱）
