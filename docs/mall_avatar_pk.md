# MallProxyService / AvatarApiService / PkApiService API 文档

> 逆向来源：APK 7.8.14，仅供网络安全研究目的。

---

## MallProxyService（商城地址管理）

**端点：** `https://learn.baicizhan.com/rpc/mall_proxy`  
> 注意：由于逆向信息有限，端点路径可能是 `/rpc/mall_proxy` 或 `/rpc/mall/proxy`，请根据实际响应选择。

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## get_user_address

> `https://learn.baicizhan.com/rpc/mall_proxy/get_user_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取用户收货地址列表。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `status` | `i32` | 地址状态过滤 | 必须 | 字段序号 1；0=全部 |

**响应字段：** 返回 `List<UserAddress>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `address_id` | `i32` | 地址ID | |
| `name` | `string` | 收件人姓名 | |
| `phone` | `string` | 手机号 | |
| `province` | `string` | 省 | |
| `city` | `string` | 市 | |
| `district` | `string` | 区/县 | |
| `address` | `string` | 详细地址 | |
| `is_default` | `bool` | 是否默认地址 | |

**Python 示例：**

```python
import time, struct, requests
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol

def call_mall(method, write_fn, token):
    url = f"https://learn.baicizhan.com/rpc/mall_proxy/{method}/{int(time.time()*1000)}"
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

def write_get_user_address(proto, status=0):
    proto.writeStructBegin("get_user_address_args")
    proto.writeFieldBegin("status", 8, 1)
    proto.writeI32(status)
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

proto = call_mall("get_user_address",
                  lambda p: write_get_user_address(p, 0),
                  token="YOUR_TOKEN_HERE")
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "address_id": 1001,
    "name": "张三",
    "phone": "13800138000",
    "province": "广东省",
    "city": "深圳市",
    "district": "南山区",
    "address": "科技园路1号",
    "is_default": true
  }
]
```

</details>

---

## create_user_address

> `https://learn.baicizhan.com/rpc/mall_proxy/create_user_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

创建新的收货地址。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `req` | `UserAddressReq` | 地址信息 | 必须 | 字段序号 1 |

**UserAddressReq 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `name` | `string` | 收件人姓名 | 必须 | 字段序号 1 |
| `phone` | `string` | 手机号 | 必须 | 字段序号 2 |
| `province` | `string` | 省 | 必须 | 字段序号 3 |
| `city` | `string` | 市 | 必须 | 字段序号 4 |
| `district` | `string` | 区/县 | 必须 | 字段序号 5 |
| `address` | `string` | 详细地址 | 必须 | 字段序号 6 |
| `is_default` | `bool` | 是否设为默认 | 可选 | 字段序号 7 |

**响应字段：** 返回 `UserAddress`（字段同上）

---

## update_user_address

> `https://learn.baicizhan.com/rpc/mall_proxy/update_user_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

更新已有收货地址信息。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `req` | `UserAddressReq` | 更新后的地址信息（需含 address_id） | 必须 | 字段序号 1 |

**响应字段：** 返回更新后的 `UserAddress`

---

## delete_user_address

> `https://learn.baicizhan.com/rpc/mall_proxy/delete_user_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

删除指定收货地址。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `address_id` | `i32` | 地址ID | 必须 | 字段序号 1 |

**响应字段：** `void`

---

## choice_address

> `https://learn.baicizhan.com/rpc/mall_proxy/choice_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

设置指定地址为默认收货地址。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `address_id` | `i32` | 地址ID | 必须 | 字段序号 1 |

**响应字段：** `void`

---

## get_child_address

> `https://learn.baicizhan.com/rpc/mall_proxy/get_child_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取指定父级地区的子地区列表，用于省市区三级联动。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `parent_id` | `i32` | 父级地区ID | 必须 | 字段序号 1；0=获取省级列表 |

**响应字段：** 返回 `List<ChildAddress>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `id` | `i32` | 地区ID | |
| `name` | `string` | 地区名称 | |
| `parent_id` | `i32` | 父级地区ID | |

---

## match_address

> `https://learn.baicizhan.com/rpc/mall_proxy/match_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

智能解析地址文本，自动提取省市区等字段。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `req` | `AddressMatchReq` | 地址解析请求 | 必须 | 字段序号 1 |

**AddressMatchReq 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `text` | `string` | 原始地址文本 | 必须 | 字段序号 1 |

**响应字段：** 返回 `AddressMatchResp`（结构同 `UserAddressReq`）

---

## AvatarApiService（IP 形象 / 旅行）

**端点：** `https://ip-avatar.baicizhan.com/rpc/avatar`

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## get_ip

> `https://ip-avatar.baicizhan.com/rpc/avatar/get_ip/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取用户当前 IP 形象的基础信息。

**请求参数：** 无

**响应字段：** 返回 `AvatarBasicInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `avatar_id` | `i32` | 形象ID | |
| `avatar_name` | `string` | 形象名称 | |
| `avatar_url` | `string` | 形象图片地址 | |
| `level` | `i32` | 当前等级 | |
| `exp` | `i64` | 经验值 | |

---

## get_app_home_page_info

> `https://ip-avatar.baicizhan.com/rpc/avatar/get_app_home_page_info/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取首页 IP 形象展示数据，包括旅行状态、位置等信息。

**请求参数：** 无

**响应字段：** 返回 `AvatarAppHomePageInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `avatar_info` | `AvatarBasicInfo` | 基础形象信息 | |
| `travel_status` | `i32` | 旅行状态 | 0=未旅行，1=旅行中，2=已到达 |
| `location_name` | `string` | 当前地点名称 | |
| `location_img` | `string` | 地点图片地址 | |
| `can_travel` | `bool` | 今日是否可旅行 | |

---

## travel

> `https://ip-avatar.baicizhan.com/rpc/avatar/travel/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

触发 IP 形象旅行（每日一次），完成旅行可能获得奖励。

**请求参数：** 无

**响应字段：** 返回 `AvatarAppHomePageInfo`（旅行后的最新状态）

---

## get_gift

> `https://ip-avatar.baicizhan.com/rpc/avatar/get_gift/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

领取旅行奖励（需先完成旅行）。

**请求参数：** 无

**响应字段：** 返回 `TravelRewardInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `reward_type` | `i32` | 奖励类型 | 1=金币，2=道具，3=经验 |
| `reward_amount` | `i32` | 奖励数量 | |
| `reward_desc` | `string` | 奖励描述文字 | |

---

## PkApiService（PK 对战）

**端点：** `https://pk.baicizhan.com/rpc/pk`  
**备用：** `https://pk.bczeducation.cn/rpc/pk`

**认证方式：** 需在 Cookie 中携带 `access_token`

---

## get_pk_address

> `https://pk.baicizhan.com/rpc/pk/get_pk_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取 PK 对战 WebSocket 服务器连接地址。

**请求参数：** 无

**响应字段：** 返回 `string`，即 WebSocket URL

<details><summary>查看响应示例：</summary>

```json
"wss://pk-ws.baicizhan.com/ws?token=xxxxx"
```

</details>

---

## get_rank_pk_address

> `https://pk.baicizhan.com/rpc/pk/get_rank_pk_address/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取排行榜 PK 入口信息，包含 WebSocket 地址及当前活动状态。

**请求参数：** 无

**响应字段：** 返回 `RankPkEntry`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `ws_url` | `string` | WebSocket 服务器地址 | |
| `status` | `i32` | 活动状态 | 0=未开始，1=进行中，2=已结束 |
| `start_time` | `i64` | 开始时间 | Unix秒 |
| `end_time` | `i64` | 结束时间 | Unix秒 |

<details><summary>查看响应示例：</summary>

```json
{
  "ws_url": "wss://rank-pk-ws.baicizhan.com/ws",
  "status": 1,
  "start_time": 1716000000,
  "end_time": 1716086400
}
```

</details>
