# AdvertiseApiService API 文档

> 逆向来源：APK 7.8.14，仅供网络安全研究目的。  
> **端点：** `https://advertise.baicizhan.com/rpc/advertise`  
> **备用：** `https://advertise.bczeducation.cn/rpc/advertise`

**认证方式：** 部分接口无需登录；个性化广告配置接口需 access_token Cookie

---

## 第一节：启动与开屏广告

---

## get_launch_ad

> `https://advertise.baicizhan.com/rpc/advertise/get_launch_ad/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取 App 启动页广告图信息。

**请求参数：** 无

**响应字段：** 返回 `BczLaunchAd`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `image_url` | `string` | 广告图片地址 | |
| `click_url` | `string` | 点击跳转链接 | |
| `duration` | `i32` | 展示时长（秒） | |

---

## get_startup_ad_v2

> `https://advertise.baicizhan.com/rpc/advertise/get_startup_ad_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取开屏广告列表，支持按屏幕尺寸适配。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `request` | `StartupAdRequest` | 请求信息 | 必须 | 字段序号 1 |
| `device_info` | `AdDeviceInfo` | 设备屏幕信息 | 必须 | 字段序号 2 |

**StartupAdRequest 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `source` | `i32` | 广告来源 | 必须 | 字段序号 1；0=冷启动，1=热启动 |

**AdDeviceInfo 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `screen_width` | `i32` | 屏幕宽度（px） | 必须 | 字段序号 1 |
| `screen_height` | `i32` | 屏幕高度（px） | 必须 | 字段序号 2 |
| `pixel_ratio` | `double` | 像素密度比 | 必须 | 字段序号 3 |

**响应字段：** 返回 `List<StartupAd>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `ad_id` | `string` | 广告ID | |
| `image_url` | `string` | 广告图片地址 | |
| `click_url` | `string` | 点击跳转链接 | |
| `duration` | `i32` | 展示时长（秒） | |
| `ad_type` | `i32` | 广告类型 | 1=图片，2=视频 |

**Python 示例：**

```python
import time, struct, requests
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol

def call_advertise(method, write_fn):
    url = f"https://advertise.baicizhan.com/rpc/advertise/{method}/{int(time.time()*1000)}"
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
        "client_time": str(int(time.time())), "time_zone": "Asia/Shanghai"
    }
    r = requests.post(url, data=body, cookies=cookies,
                      headers={"Content-Type": "application/x-thrift"})
    rbuf = TTransport.TMemoryBuffer(r.content[4:])
    rproto = TCompactProtocol.TCompactProtocol(rbuf)
    rproto.readMessageBegin()
    return rproto

def write_get_startup_ad_v2(proto, source=0, width=1080, height=2340, ratio=2.75):
    proto.writeStructBegin("get_startup_ad_v2_args")
    # StartupAdRequest
    proto.writeFieldBegin("request", 12, 1)
    proto.writeStructBegin("StartupAdRequest")
    proto.writeFieldBegin("source", 8, 1)
    proto.writeI32(source)
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()
    proto.writeFieldEnd()
    # AdDeviceInfo
    proto.writeFieldBegin("device_info", 12, 2)
    proto.writeStructBegin("AdDeviceInfo")
    proto.writeFieldBegin("screen_width", 8, 1)
    proto.writeI32(width)
    proto.writeFieldEnd()
    proto.writeFieldBegin("screen_height", 8, 2)
    proto.writeI32(height)
    proto.writeFieldEnd()
    proto.writeFieldBegin("pixel_ratio", 4, 3)  # 4 = TType.DOUBLE
    proto.writeDouble(ratio)
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

proto = call_advertise("get_startup_ad_v2",
                       lambda p: write_get_startup_ad_v2(p, source=0))
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "ad_id": "startup_001",
    "image_url": "https://cdn.baicizhan.com/ads/startup_2024.jpg",
    "click_url": "https://baicizhan.com/vip",
    "duration": 5,
    "ad_type": 1
  }
]
```

</details>

---

## report_launch_ad

> `https://advertise.baicizhan.com/rpc/advertise/report_launch_ad/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

上报启动页广告展示行为。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `rp2` | `BczLaunchAdReport` | 广告上报数据 | 必须 | 字段序号 1 |

**BczLaunchAdReport 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `ad_id` | `string` | 广告ID | 必须 | 字段序号 1 |
| `action` | `i32` | 行为类型 | 必须 | 字段序号 2；1=展示，2=点击，3=跳过 |

**响应字段：** `void`

---

## report_startup_ad_event

> `https://advertise.baicizhan.com/rpc/advertise/report_startup_ad_event/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

批量上报开屏广告交互事件。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `events` | `List<AdEvent>` | 事件列表 | 必须 | 字段序号 1 |

**AdEvent 字段：**

| 字段 | 类型 | 内容 | 必要性 | 备注 |
|------|------|------|--------|------|
| `ad_id` | `string` | 广告ID | 必须 | 字段序号 1 |
| `event_type` | `i32` | 事件类型 | 必须 | 字段序号 2；1=展示，2=点击，3=跳过 |
| `timestamp` | `i64` | 事件时间 | 必须 | 字段序号 3；Unix毫秒 |

**响应字段：** `void`

**Python 示例：**

```python
def write_report_startup_ad_event(proto, events: list):
    """events: [{"ad_id": str, "event_type": int, "timestamp": int}]"""
    proto.writeStructBegin("report_startup_ad_event_args")
    proto.writeFieldBegin("events", 15, 1)  # 15 = TType.LIST
    proto.writeListBegin(12, len(events))   # 12 = TType.STRUCT
    for ev in events:
        proto.writeStructBegin("AdEvent")
        proto.writeFieldBegin("ad_id", 11, 1)
        proto.writeString(ev["ad_id"].encode())
        proto.writeFieldEnd()
        proto.writeFieldBegin("event_type", 8, 2)
        proto.writeI32(ev["event_type"])
        proto.writeFieldEnd()
        proto.writeFieldBegin("timestamp", 10, 3)  # 10 = TType.I64
        proto.writeI64(ev["timestamp"])
        proto.writeFieldEnd()
        proto.writeFieldStop()
        proto.writeStructEnd()
    proto.writeListEnd()
    proto.writeFieldEnd()
    proto.writeFieldStop()
    proto.writeStructEnd()

events = [{"ad_id": "startup_001", "event_type": 1, "timestamp": int(time.time()*1000)}]
proto = call_advertise("report_startup_ad_event",
                       lambda p: write_report_startup_ad_event(p, events))
```

---

## 第二节：首页横幅与弹窗

---

## get_main_view_top_banner_advs

> `https://advertise.baicizhan.com/rpc/advertise/get_main_view_top_banner_advs/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取 App 首页顶部横幅广告列表。

**请求参数：** 无

**响应字段：** 返回 `List<MainViewTopBannerAdv>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `banner_id` | `string` | 横幅ID | |
| `image_url` | `string` | 图片地址 | |
| `click_url` | `string` | 跳转链接 | |
| `title` | `string` | 标题 | |

---

## get_main_view_bottom_advs_v3

> `https://advertise.baicizhan.com/rpc/advertise/get_main_view_bottom_advs_v3/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取首页底部广告区域内容。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device_info` | `AdDeviceInfo` | 设备屏幕信息 | 必须 | 字段序号 1 |

**响应字段：** 返回 `BottomAdvInfos`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `items` | `List<BottomAdvItem>` | 底部广告条目列表 | |
| `background_color` | `string` | 背景色 | Hex色值 |

---

## get_main_game_top_banner

> `https://advertise.baicizhan.com/rpc/advertise/get_main_game_top_banner/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取游戏首页顶部横幅广告信息。

**请求参数：** 无

**响应字段：** 返回 `MainViewGameTopAdv`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `image_url` | `string` | 图片地址 | |
| `click_url` | `string` | 跳转链接 | |

---

## get_practice_banner_adv

> `https://advertise.baicizhan.com/rpc/advertise/get_practice_banner_adv/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取练习页面横幅广告。

**请求参数：** 无

**响应字段：** 返回 `PracticeBannerAdv`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `image_url` | `string` | 图片地址 | |
| `click_url` | `string` | 跳转链接 | |
| `show_type` | `i32` | 展示类型 | |

---

## get_practice_popup_adv

> `https://advertise.baicizhan.com/rpc/advertise/get_practice_popup_adv/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取练习页弹窗广告内容。

**请求参数：** 无

**响应字段：** 返回 `PracticePopupAdv`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `image_url` | `string` | 弹窗图片 | |
| `click_url` | `string` | 跳转链接 | |
| `show_frequency` | `i32` | 展示频率（天） | |

---

## get_explore_popup_adv

> `https://advertise.baicizhan.com/rpc/advertise/get_explore_popup_adv/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取探索页弹窗广告内容。

**请求参数：** 无

**响应字段：** 返回 `ExplorePopupAdv`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `image_url` | `string` | 弹窗图片 | |
| `click_url` | `string` | 跳转链接 | |

---

## 第三节：词书推广

---

## get_books_ad_v2

> `https://advertise.baicizhan.com/rpc/advertise/get_books_ad_v2/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取词书推广广告信息。

**请求参数：** 无

**响应字段：** 返回 `BookAdV2`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `items` | `List<BookAdItem>` | 推广词书列表 | |
| `background_url` | `string` | 背景图片地址 | |

---

## get_mall_tab_icon_info

> `https://advertise.baicizhan.com/rpc/advertise/get_mall_tab_icon_info/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取商城 Tab 图标展示信息（如角标、动效）。

**请求参数：** 无

**响应字段：** 返回 `MallTabInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `icon_url` | `string` | 图标地址 | |
| `badge_text` | `string` | 角标文字 | 如"新" |
| `show_animation` | `bool` | 是否显示动效 | |

---

## get_promotion_info

> `https://advertise.baicizhan.com/rpc/advertise/get_promotion_info/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取当前促销活动信息。

**请求参数：** 无

**响应字段：** 返回 `AdvertisePromotionInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `title` | `string` | 促销标题 | |
| `description` | `string` | 促销描述 | |
| `end_time` | `i64` | 截止时间 | Unix秒 |
| `click_url` | `string` | 跳转链接 | |

---

## 第四节：加载与其他

---

## get_loading_ad_items

> `https://advertise.baicizhan.com/rpc/advertise/get_loading_ad_items/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取加载中界面的广告条目列表。

**请求参数：** 无

**响应字段：** 返回 `List<AdvertiseLoadingItem>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `item_id` | `string` | 条目ID | |
| `image_url` | `string` | 图片地址 | |
| `title` | `string` | 标题 | |
| `click_url` | `string` | 跳转链接 | |

---

## get_loading_imgs

> `https://advertise.baicizhan.com/rpc/advertise/get_loading_imgs/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取 App 加载阶段展示的图片列表。

**请求参数：** 无

**响应字段：** 返回 `List<LoadingImgInfo>`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `img_url` | `string` | 图片地址 | |
| `duration` | `i32` | 展示时长（毫秒） | |

---

## get_live_streaming_info

> `https://advertise.baicizhan.com/rpc/advertise/get_live_streaming_info/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取当前直播活动信息。

**请求参数：** 无

**响应字段：** 返回 `LiveStreamingInfo`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `is_live` | `bool` | 是否正在直播 | |
| `stream_url` | `string` | 直播地址 | |
| `cover_url` | `string` | 封面图片 | |
| `title` | `string` | 直播标题 | |

---

## get_third_ad

> `https://advertise.baicizhan.com/rpc/advertise/get_third_ad/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 无需登录

获取第三方广告配置信息。

**请求参数：** 无

**响应字段：** 返回 `ThirdAd`

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `ad_provider` | `string` | 广告提供商 | 如穿山甲、优量汇 |
| `app_id` | `string` | 第三方广告平台AppID | |
| `placement_id` | `string` | 广告位ID | |

---

## get_custom_ads_config

> `https://advertise.baicizhan.com/rpc/advertise/get_custom_ads_config/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

获取当前用户的个性化广告配置状态。

**请求参数：** 无

**响应字段：** 返回 `int`

| 值 | 含义 |
|----|------|
| `0` | 个性化广告已关闭 |
| `1` | 个性化广告已开启 |

---

## set_custom_ads_config

> `https://advertise.baicizhan.com/rpc/advertise/set_custom_ads_config/{timestamp_ms}`

*请求方式：POST*

**认证方式：** access_token Cookie 必须

设置当前用户的个性化广告开关状态。

**请求参数：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `state` | `int` | 状态 | 必须 | 字段序号 1；0=关闭，1=开启 |

**响应字段：** `void`
