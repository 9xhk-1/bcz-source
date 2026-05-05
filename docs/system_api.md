# BCZ 系统服务 API 文档

> 适用版本：百词斩 Android v7.8.14（版本号 7081400）
> 协议：Apache Thrift TCompact Binary over HTTP

## 目录

- [Python 工具函数](#python-工具函数)
- [BczSystemApiService](#bczsystemapiservice)
  - [check_new_version](#check_new_version)
  - [check_dict_new_version](#check_dict_new_version)
  - [check_ireading_new_version](#check_ireading_new_version)
  - [get_app_new_version_info](#get_app_new_version_info)
  - [get_app_beta_update_info](#get_app_beta_update_info)
  - [check_infos](#check_infos)
  - [check_nav_tabs](#check_nav_tabs)
  - [get_switches](#get_switches)
  - [get_test_flags](#get_test_flags)
  - [get_static_config](#get_static_config)
  - [get_guide_for_new_strategy](#get_guide_for_new_strategy)
  - [get_privacy_agreement_version](#get_privacy_agreement_version)
  - [get_domain_whitelist](#get_domain_whitelist)
  - [get_domain_blacklist](#get_domain_blacklist)
  - [qrcode_scan](#qrcode_scan)
  - [report_event (System)](#report_event-system)
  - [report_event_without_login (System)](#report_event_without_login-system)
  - [get_app_feedback_info](#get_app_feedback_info)
- [NotifyService](#notifyservice)
  - [get_remind_info](#get_remind_info)
  - [set_remind_info](#set_remind_info)
  - [get_latest_notify](#get_latest_notify)
  - [get_latest_notify_v2](#get_latest_notify_v2)
  - [get_remind_msgs](#get_remind_msgs)
  - [push_confirm](#push_confirm)
- [StrategyApiService](#strategyapiservice)
  - [get_user_member_info](#get_user_member_info)
  - [get_user_word_energy_info](#get_user_word_energy_info)
  - [get_user_sentence_energy_info](#get_user_sentence_energy_info)
  - [get_user_entitlement_infos](#get_user_entitlement_infos)
  - [get_user_entitlement_sale_info](#get_user_entitlement_sale_info)
  - [get_member_popup_sale_info](#get_member_popup_sale_info)
  - [get_app_home_page_member_stage_info](#get_app_home_page_member_stage_info)
  - [get_free_member](#get_free_member)
- [BczReportApiService](#bczreportapiservice)
  - [report_event (Report)](#report_event-report)
  - [report_event_without_login (Report)](#report_event_without_login-report)
- [相关文档](#相关文档)

---

## Python 工具函数

以下辅助函数在所有示例中通用，请在脚本顶部引入。

```python
import struct, time, json, requests

def make_cookie(device_id="aabbccdd1234abcd", access_token=None):
    """
    构造百词斩 Cookie 字符串。
    device_id: 16 位十六进制设备 ID
    access_token: 登录后的令牌，部分接口可为 None
    """
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
def encode_i32(n): return varint(zigzag32(n))

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
                      headers={'Content-Type': 'application/x-thrift', 'Cookie': cookie})
    return r.content[4:]

def encode_string_list(strings):
    """TCompact list<string>: 元素类型 BINARY=8"""
    n = len(strings)
    if n < 15:
        hdr = bytes([(n << 4) | 8])
    else:
        hdr = bytes([0xf0 | 8]) + varint(n)
    body = hdr
    for s in strings:
        body += encode_string(s)
    return body
```

> **注意**：关于 Cookie 字段含义及登录流程，请参阅 [login.md](login.md)。
> Thrift TCompact 编码细节请参阅 [thrift_client.md](thrift_client.md)。

---

## BczSystemApiService

> 基础 URL：`https://system.baicizhan.com/rpc/bcz_system`
> 备用 URL：`https://system.bczeducation.cn/rpc/bcz_system`

**认证方式**：系统类接口（版本检查、开关查询等）可**匿名访问**，事件上报类接口视具体方法而定（见各方法说明）。Cookie 中的 `device_id`、`client_time`、`serial` 等字段需始终携带。

---

## check_new_version

> `https://system.baicizhan.com/rpc/bcz_system/check_new_version/{timestamp}`

*请求方式：POST*

检查 App 是否有新版本可更新。

### 认证方式

无需 `access_token`，携带设备 Cookie 即可。

### 请求参数（BczAppInfo）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| version_code | i32 | App 版本号 | 必须 | 如 `7081400` |
| channel | string | 渠道标识 | 必须 | 如 `"official"` |
| platform | string | 平台标识 | 必须 | 固定为 `"android"` |

### 响应字段（BczVersionInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| has_new_version | bool | 是否有新版本 | |
| version_code | i32 | 最新版本号 | |
| version_name | string | 最新版本名 | 如 `"7.8.14"` |
| download_url | string | 下载链接 | |
| description | string | 更新说明 | |
| force_update | bool | 是否强制更新 | 为 `true` 时必须升级 |

### Python 示例

```python
def encode_bcz_app_info(version_code=7081400, channel="official", platform="android"):
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(version_code)
    inner += field_header(1, 2, 8) + encode_string(channel)
    inner += field_header(2, 3, 8) + encode_string(platform)
    inner += stop()
    return field_header(0, 1, 12) + inner

BASE_URL = "https://system.baicizhan.com/rpc/bcz_system"
cookie = make_cookie()

args = encode_bcz_app_info()
resp = call_api(BASE_URL, "check_new_version", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "has_new_version": false,
  "version_code": 7081400,
  "version_name": "7.8.14",
  "download_url": "",
  "description": "",
  "force_update": false
}
```

</details>

---

## check_dict_new_version

> `https://system.baicizhan.com/rpc/bcz_system/check_dict_new_version/{timestamp}`

*请求方式：POST*

检查词典包（离线词典数据）是否有新版本。

### 认证方式

无需 `access_token`。

### 请求参数（BczAppInfo）

与 [check_new_version](#check_new_version) 相同。

### 响应字段（BczVersionInfo）

与 [check_new_version](#check_new_version) 相同。

### Python 示例

```python
args = encode_bcz_app_info()
resp = call_api(BASE_URL, "check_dict_new_version", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "has_new_version": true,
  "version_code": 202403,
  "version_name": "2024.03",
  "download_url": "https://cdn.baicizhan.com/dict/dict_202403.zip",
  "description": "更新词典数据",
  "force_update": false
}
```

</details>

---

## check_ireading_new_version

> `https://system.baicizhan.com/rpc/bcz_system/check_ireading_new_version/{timestamp}`

*请求方式：POST*

检查 iReading（阅读模块）插件包是否有新版本。

### 认证方式

无需 `access_token`。

### 请求参数（BczAppInfo）

与 [check_new_version](#check_new_version) 相同。

### 响应字段（BczVersionInfo）

与 [check_new_version](#check_new_version) 相同。

### Python 示例

```python
args = encode_bcz_app_info()
resp = call_api(BASE_URL, "check_ireading_new_version", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "has_new_version": false,
  "version_code": 10023,
  "version_name": "1.0.23",
  "download_url": "",
  "description": "",
  "force_update": false
}
```

</details>

---

## get_app_new_version_info

> `https://system.baicizhan.com/rpc/bcz_system/get_app_new_version_info/{timestamp}`

*请求方式：POST*

获取 App 新版本的详细信息，支持设备型号匹配。

### 认证方式

无需 `access_token`。

### 请求参数（AppBetaUpdateRequest）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| version_code | i32 | App 版本号 | 必须 | 如 `7081400` |
| channel | string | 渠道标识 | 必须 | 如 `"official"` |
| platform | string | 平台标识 | 必须 | 如 `"android"` |
| device_model | string | 设备型号 | 可选 | 如 `"Pixel 6"` |

### 响应字段（AppNewVersionResult）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| version_info | BczVersionInfo | 版本信息 | 结构见 check_new_version |
| changelog | string | 更新日志 | Markdown 格式 |
| release_notes | list\<string\> | 发布说明列表 | |

### Python 示例

```python
def encode_app_beta_update_request(version_code=7081400, channel="official",
                                    platform="android", device_model="Pixel 6"):
    inner = b''
    inner += field_header(0, 1, 5) + encode_i32(version_code)
    inner += field_header(1, 2, 8) + encode_string(channel)
    inner += field_header(2, 3, 8) + encode_string(platform)
    inner += field_header(3, 4, 8) + encode_string(device_model)
    inner += stop()
    return field_header(0, 1, 12) + inner

args = encode_app_beta_update_request()
resp = call_api(BASE_URL, "get_app_new_version_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "version_info": {
    "has_new_version": false,
    "version_code": 7081400,
    "version_name": "7.8.14"
  },
  "changelog": "## 7.8.14\n- 优化学习体验\n- 修复已知问题",
  "release_notes": ["优化学习体验", "修复已知问题"]
}
```

</details>

---

## get_app_beta_update_info

> `https://system.baicizhan.com/rpc/bcz_system/get_app_beta_update_info/{timestamp}`

*请求方式：POST*

获取 Beta 版本的更新信息，用于内测渠道用户的版本推送。

### 认证方式

无需 `access_token`。

### 请求参数（AppBetaUpdateRequest）

与 [get_app_new_version_info](#get_app_new_version_info) 相同。

### 响应字段（AppBetaUpdateResult）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| has_update | bool | 是否有 Beta 更新 | |
| version_code | i32 | Beta 版本号 | |
| version_name | string | Beta 版本名 | |
| download_url | string | Beta 下载链接 | |
| description | string | Beta 更新描述 | |
| is_force | bool | 是否强制更新 | |

### Python 示例

```python
args = encode_app_beta_update_request(channel="beta")
resp = call_api(BASE_URL, "get_app_beta_update_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "has_update": false,
  "version_code": 7081400,
  "version_name": "7.8.14-beta",
  "download_url": "",
  "description": "",
  "is_force": false
}
```

</details>

---

## check_infos

> `https://system.baicizhan.com/rpc/bcz_system/check_infos/{timestamp}`

*请求方式：POST*

批量检查系统信息，一次性获取版本信息、功能开关和导航栏配置，减少网络请求次数。

### 认证方式

无需 `access_token`。

### 请求参数

无参数，`args_bytes` 传空字节串 `b''`。

### 响应字段（BczSystemInfos）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| version_info | BczVersionInfo | 版本信息 | 结构见 check_new_version |
| switches | BczAppSwitch | 功能开关 | 结构见 get_switches |
| nav_tabs | BczNavTabs | 导航栏配置 | 结构见 check_nav_tabs |

### Python 示例

```python
resp = call_api(BASE_URL, "check_infos", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "version_info": {
    "has_new_version": false,
    "version_code": 7081400,
    "version_name": "7.8.14"
  },
  "switches": {
    "show_pk": true,
    "show_game": true,
    "show_sentence": true,
    "show_activity": true,
    "show_export": false
  },
  "nav_tabs": {
    "tabs": [
      {"id": 1, "name": "学习", "icon_url": "https://cdn.baicizhan.com/icons/study.png", "badge_count": 0},
      {"id": 2, "name": "发现", "icon_url": "https://cdn.baicizhan.com/icons/discover.png", "badge_count": 0},
      {"id": 3, "name": "我的", "icon_url": "https://cdn.baicizhan.com/icons/mine.png", "badge_count": 0}
    ]
  }
}
```

</details>

---

## check_nav_tabs

> `https://system.baicizhan.com/rpc/bcz_system/check_nav_tabs/{timestamp}`

*请求方式：POST*

获取底部导航栏的配置，包括各 Tab 的名称、图标和徽标数量。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段（BczNavTabs）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| tabs | list\<NavTab\> | 导航 Tab 列表 | |

**NavTab 结构：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| id | i32 | Tab ID | |
| name | string | Tab 名称 | 如 `"学习"` |
| icon_url | string | 图标 URL | |
| badge_count | i32 | 徽标数量 | 0 表示不显示 |

### Python 示例

```python
resp = call_api(BASE_URL, "check_nav_tabs", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "tabs": [
    {"id": 1, "name": "学习", "icon_url": "https://cdn.baicizhan.com/icons/study.png", "badge_count": 0},
    {"id": 2, "name": "发现", "icon_url": "https://cdn.baicizhan.com/icons/discover.png", "badge_count": 0},
    {"id": 3, "name": "我的", "icon_url": "https://cdn.baicizhan.com/icons/mine.png", "badge_count": 0}
  ]
}
```

</details>

---

## get_switches

> `https://system.baicizhan.com/rpc/bcz_system/get_switches/{timestamp}`

*请求方式：POST*

获取 App 功能开关配置，用于远程控制各功能模块的显示与隐藏。

### 认证方式

**无需认证**，完全匿名访问。

### 请求参数

无参数。

### 响应字段（BczAppSwitch）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| show_pk | bool | 是否显示 PK 功能 | |
| show_game | bool | 是否显示游戏 | |
| show_sentence | bool | 是否显示句子游戏 | |
| show_activity | bool | 是否显示活动入口 | |
| show_export | bool | 是否显示导出功能 | |

### Python 示例

```python
BASE_URL = "https://system.baicizhan.com/rpc/bcz_system"
cookie = make_cookie()
resp = call_api(BASE_URL, "get_switches", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "show_pk": true,
  "show_game": true,
  "show_sentence": true,
  "show_activity": true,
  "show_export": false
}
```

</details>

---

## get_test_flags

> `https://system.baicizhan.com/rpc/bcz_system/get_test_flags/{timestamp}`

*请求方式：POST*

获取 A/B 测试标志，用于客户端分流实验。返回一个 `Map<String, Integer>` 表示当前设备所在实验分组。

### 认证方式

无需 `access_token`，但 `device_id` 会影响分桶结果。

### 请求参数

无参数。

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (map entry) | Map\<string, i32\> | 实验名 → 分组值 | 值通常为 0 或 1 |

### Python 示例

```python
resp = call_api(BASE_URL, "get_test_flags", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "new_study_flow": 1,
  "home_redesign": 0,
  "member_banner_v2": 1
}
```

</details>

---

## get_static_config

> `https://system.baicizhan.com/rpc/bcz_system/get_static_config/{timestamp}`

*请求方式：POST*

获取静态配置项列表，用于下发客户端可配置的参数（如 URL、阈值等）。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段（List\<StaticConfig\>）

**StaticConfig 结构：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| key | string | 配置键名 | |
| value | string | 配置值（字符串） | 数值类型也以字符串下发 |
| updated_at | i64 | 更新时间戳（毫秒） | |

### Python 示例

```python
resp = call_api(BASE_URL, "get_static_config", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  {"key": "study_daily_goal_min", "value": "20", "updated_at": 1710000000000},
  {"key": "cdn_base_url", "value": "https://cdn.baicizhan.com", "updated_at": 1710000000000},
  {"key": "max_book_count", "value": "10", "updated_at": 1710000000000}
]
```

</details>

---

## get_guide_for_new_strategy

> `https://system.baicizhan.com/rpc/bcz_system/get_guide_for_new_strategy/{timestamp}`

*请求方式：POST*

获取新用户引导策略配置，用于首次启动或更新后的功能引导流程。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段（GuideForNewStrategy）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| show_guide | bool | 是否显示引导 | |
| guide_type | i32 | 引导类型 | 1=新用户，2=版本更新 |
| steps | list\<string\> | 引导步骤描述列表 | |
| guide_url | string | 引导 H5 页面 URL | 可选 |

### Python 示例

```python
resp = call_api(BASE_URL, "get_guide_for_new_strategy", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "show_guide": false,
  "guide_type": 0,
  "steps": [],
  "guide_url": ""
}
```

</details>

---

## get_privacy_agreement_version

> `https://system.baicizhan.com/rpc/bcz_system/get_privacy_agreement_version/{timestamp}`

*请求方式：POST*

获取当前隐私协议版本信息，用于检测用户是否需要重新同意协议。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段（PrivacyAgreementInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| version | string | 协议版本号 | 如 `"2.3.0"` |
| updated_at | string | 更新日期 | 如 `"2024-03-01"` |
| url | string | 协议全文 URL | |

### Python 示例

```python
resp = call_api(BASE_URL, "get_privacy_agreement_version", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "version": "2.3.0",
  "updated_at": "2024-03-01",
  "url": "https://www.baicizhan.com/privacy/v2.3.0.html"
}
```

</details>

---

## get_domain_whitelist

> `https://system.baicizhan.com/rpc/bcz_system/get_domain_whitelist/{timestamp}`

*请求方式：POST*

获取 App 内嵌 WebView 允许访问的域名白名单列表。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (list) | list\<string\> | 白名单域名列表 | 支持通配符，如 `*.baicizhan.com` |

### Python 示例

```python
resp = call_api(BASE_URL, "get_domain_whitelist", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  "*.baicizhan.com",
  "*.bczeducation.cn",
  "baicizhan.com",
  "bczeducation.cn"
]
```

</details>

---

## get_domain_blacklist

> `https://system.baicizhan.com/rpc/bcz_system/get_domain_blacklist/{timestamp}`

*请求方式：POST*

获取 App 内嵌 WebView 禁止访问的域名黑名单列表。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (list) | list\<string\> | 黑名单域名列表 | |

### Python 示例

```python
resp = call_api(BASE_URL, "get_domain_blacklist", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[]
```

</details>

---

## qrcode_scan

> `https://system.baicizhan.com/rpc/bcz_system/qrcode_scan/{timestamp}`

*请求方式：POST*

解析二维码内容，识别其类型（活动/词书/用户）并返回对应数据。

### 认证方式

无需 `access_token`（扫描用户码时建议携带 access_token 以获取更多信息）。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| qrcode | string | 二维码内容字符串 | 必须 | 扫描设备读取的原始字符串 |

### 响应字段（QRCodeResp）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| type | i32 | 二维码类型 | 1=活动，2=词书，3=用户 |
| data | string | JSON 格式的解析数据 | 根据 type 字段结构不同 |

### Python 示例

```python
def encode_qrcode_scan(qrcode_str):
    args = field_header(0, 1, 8) + encode_string(qrcode_str)
    return args

qr_content = "https://www.baicizhan.com/share/book?id=12345"
args = encode_qrcode_scan(qr_content)
resp = call_api(BASE_URL, "qrcode_scan", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "type": 2,
  "data": "{\"book_id\": 12345, \"book_name\": \"四级词汇\", \"word_count\": 2500}"
}
```

</details>

---

## report_event (System)

> `https://system.baicizhan.com/rpc/bcz_system/report_event/{timestamp}`

*请求方式：POST*

上报用户行为埋点事件，**需要登录**。适用于已认证用户的行为追踪。

### 认证方式

需要 Cookie 中包含 `access_token`。请参阅 [login.md](login.md) 获取令牌。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| jsons | list\<string\> | 事件 JSON 字符串列表 | 必须 | 每个字符串是一条事件 |

**事件 JSON 格式：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| event_name | string | 事件名称 | 如 `"app_open"` |
| timestamp | string | 时间戳（毫秒字符串） | |
| user_id | string | 用户 ID | 登录后必填 |
| properties | object | 事件附加属性 | 键值对，值为字符串或数字 |

### Python 示例

```python
def build_event_json(event_name, user_id=None, **props):
    evt = {
        "event_name": event_name,
        "timestamp": str(int(time.time() * 1000)),
        "properties": props
    }
    if user_id:
        evt["user_id"] = str(user_id)
    return json.dumps(evt, ensure_ascii=False)

def encode_report_event(events):
    list_bytes = encode_string_list(events)
    return field_header(0, 1, 9) + list_bytes

events = [
    build_event_json("app_open", user_id=123456, page="study_home"),
    build_event_json("study_start", user_id=123456, book_id=1234, mode="normal"),
]
cookie = make_cookie(access_token="YOUR_ACCESS_TOKEN")
args = encode_report_event(events)
resp = call_api(BASE_URL, "report_event", args, cookie)
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体)
```

</details>

---

## report_event_without_login (System)

> `https://system.baicizhan.com/rpc/bcz_system/report_event_without_login/{timestamp}`

*请求方式：POST*

上报用户行为埋点事件，**无需登录**。适用于未登录用户或启动阶段的匿名事件。

### 认证方式

无需 `access_token`。

### 请求参数

与 [report_event (System)](#report_event-system) 相同，`user_id` 字段可省略。

### Python 示例

```python
events = [
    build_event_json("app_open", page="study_home"),
    build_event_json("study_start", book_id=1234, mode="normal"),
]
BASE_URL_SYSTEM = "https://system.baicizhan.com/rpc/bcz_system"
args = encode_report_event(events)
resp = call_api(BASE_URL_SYSTEM, "report_event_without_login", args, make_cookie())
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体)
```

</details>

---

## get_app_feedback_info

> `https://system.baicizhan.com/rpc/bcz_system/get_app_feedback_info/{timestamp}`

*请求方式：POST*

获取用户反馈功能的配置信息，如反馈邮箱、反馈页面 URL 等。

### 认证方式

无需 `access_token`。

### 请求参数

无参数。

### 响应字段

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| (map entry) | Map\<string, string\> | 配置键 → 配置值 | |

常见键：

| 键名 | 内容 |
|------|------|
| feedback_email | 反馈邮箱地址 |
| feedback_url | 反馈 H5 页面 URL |
| qq_group | 官方 QQ 群号 |

### Python 示例

```python
resp = call_api(BASE_URL, "get_app_feedback_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "feedback_email": "feedback@baicizhan.com",
  "feedback_url": "https://www.baicizhan.com/feedback",
  "qq_group": "123456789"
}
```

</details>

---

## NotifyService

> 基础 URL：`https://notify.baicizhan.com/rpc/notify`

**认证方式**：所有接口均需要在 Cookie 中携带有效的 `access_token`。获取方式请参阅 [login.md](login.md)。

---

## get_remind_info

> `https://notify.baicizhan.com/rpc/notify/get_remind_info/{timestamp}`

*请求方式：POST*

获取当前用户的学习提醒设置。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（UserRemindInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| remind_open | bool | 是否开启提醒 | |
| remind_time | string | 提醒时间 | 格式 `"HH:MM"`，如 `"20:00"` |
| remind_days | list\<i32\> | 提醒日期列表 | 1=周一，7=周日 |
| remind_type | i32 | 提醒类型 | 1=普通，2=强提醒 |

### Python 示例

```python
BASE_URL_NOTIFY = "https://notify.baicizhan.com/rpc/notify"
cookie = make_cookie(access_token="YOUR_TOKEN")

resp = call_api(BASE_URL_NOTIFY, "get_remind_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "remind_open": true,
  "remind_time": "20:00",
  "remind_days": [1, 2, 3, 4, 5, 6, 7],
  "remind_type": 1
}
```

</details>

---

## set_remind_info

> `https://notify.baicizhan.com/rpc/notify/set_remind_info/{timestamp}`

*请求方式：POST*

设置用户的学习提醒配置。

### 认证方式

需要 `access_token`。

### 请求参数（UserRemindInfo）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| remind_open | bool | 是否开启提醒 | 必须 | |
| remind_time | string | 提醒时间 | 必须 | 格式 `"HH:MM"` |
| remind_days | list\<i32\> | 提醒日期 | 必须 | 1-7 对应周一到周日 |
| remind_type | i32 | 提醒类型 | 可选 | 默认 1 |

### 响应字段

无返回值（void）。

### Python 示例

```python
def encode_user_remind_info(remind_open=True, remind_time="20:00",
                             remind_days=None, remind_type=1):
    if remind_days is None:
        remind_days = [1, 2, 3, 4, 5, 6, 7]
    inner = b''
    prev = 0
    # field 1: remind_open (BOOL: type nibble 1=TRUE, 2=FALSE)
    inner += bytes([(1 << 4) | (1 if remind_open else 2)]); prev = 1
    # field 2: remind_time (BINARY=8)
    inner += field_header(prev, 2, 8) + encode_string(remind_time); prev = 2
    # field 3: remind_days (LIST=9, I32=5)
    n = len(remind_days)
    list_hdr = bytes([(n << 4) | 5]) if n < 15 else bytes([0xf5]) + varint(n)
    days_bytes = list_hdr + b''.join(encode_i32(d) for d in remind_days)
    inner += field_header(prev, 3, 9) + days_bytes; prev = 3
    # field 4: remind_type (I32=5)
    inner += field_header(prev, 4, 5) + encode_i32(remind_type); prev = 4
    inner += stop()
    return field_header(0, 1, 12) + inner

args = encode_user_remind_info(remind_open=True, remind_time="21:00",
                                remind_days=[1, 2, 3, 4, 5])
resp = call_api(BASE_URL_NOTIFY, "set_remind_info", args, cookie)
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体，HTTP 200 表示成功)
```

</details>

---

## get_latest_notify

> `https://notify.baicizhan.com/rpc/notify/get_latest_notify/{timestamp}`

*请求方式：POST*

获取用户最新的系统通知/消息列表。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（NotifyResult）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| notifications | list\<Notification\> | 通知列表 | |
| unread_count | i32 | 未读通知数量 | |

**Notification 结构：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| notify_id | i64 | 通知 ID | |
| title | string | 通知标题 | |
| content | string | 通知内容 | |
| notify_type | i32 | 通知类型 | 1=系统，2=活动，3=好友 |
| created_at | i64 | 创建时间戳（毫秒） | |
| is_read | bool | 是否已读 | |
| jump_url | string | 点击跳转 URL | 可选 |

### Python 示例

```python
resp = call_api(BASE_URL_NOTIFY, "get_latest_notify", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "notifications": [
    {
      "notify_id": 987654321,
      "title": "学习提醒",
      "content": "今天还没有学习哦，快来打卡吧！",
      "notify_type": 1,
      "created_at": 1710000000000,
      "is_read": false,
      "jump_url": "bcz://study/home"
    }
  ],
  "unread_count": 1
}
```

</details>

---

## get_latest_notify_v2

> `https://notify.baicizhan.com/rpc/notify/get_latest_notify_v2/{timestamp}`

*请求方式：POST*

获取最新通知的 v2 版本，支持传入设备信息以获取个性化通知（含广告）。

### 认证方式

需要 `access_token`。

### 请求参数（AdDeviceInfo）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| device_id | string | 设备 ID | 必须 | |
| os_version | string | 系统版本 | 可选 | 如 `"14"` |
| app_version | string | App 版本名 | 可选 | 如 `"7.8.14"` |

### 响应字段（NotifyResult）

与 [get_latest_notify](#get_latest_notify) 相同，可能含有广告推送类通知。

### Python 示例

```python
def encode_ad_device_info(device_id, os_version="14", app_version="7.8.14"):
    inner = b''
    inner += field_header(0, 1, 8) + encode_string(device_id)
    inner += field_header(1, 2, 8) + encode_string(os_version)
    inner += field_header(2, 3, 8) + encode_string(app_version)
    inner += stop()
    return field_header(0, 1, 12) + inner

args = encode_ad_device_info("aabbccdd1234abcd")
resp = call_api(BASE_URL_NOTIFY, "get_latest_notify_v2", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "notifications": [
    {
      "notify_id": 123456789,
      "title": "限时特惠",
      "content": "年会员5折优惠，仅限今日！",
      "notify_type": 2,
      "created_at": 1710000000000,
      "is_read": false,
      "jump_url": "bcz://member/purchase"
    }
  ],
  "unread_count": 1
}
```

</details>

---

## get_remind_msgs

> `https://notify.baicizhan.com/rpc/notify/get_remind_msgs/{timestamp}`

*请求方式：POST*

获取用户的提醒消息历史列表，包括系统下发的学习提醒内容。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（List\<UserRemindMsg\>）

**UserRemindMsg 结构：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| msg_id | i64 | 消息 ID | |
| title | string | 消息标题 | |
| content | string | 消息内容 | |
| created_at | i64 | 创建时间戳（毫秒） | |

### Python 示例

```python
resp = call_api(BASE_URL_NOTIFY, "get_remind_msgs", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
[
  {
    "msg_id": 1001,
    "title": "每日提醒",
    "content": "坚持学习，今天已连续打卡 7 天！",
    "created_at": 1710000000000
  }
]
```

</details>

---

## push_confirm

> `https://notify.baicizhan.com/rpc/notify/push_confirm/{timestamp}`

*请求方式：POST*

确认用户已读某条推送消息，用于已读状态同步。

### 认证方式

需要 `access_token`。

### 请求参数（PushConfirmParams）

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| msg_id | i64 | 消息 ID | 必须 | 来自通知列表的 msg_id |
| push_type | i32 | 推送类型 | 必须 | 1=系统通知，2=推送通知 |

### 响应字段

无返回值（void）。

### Python 示例

```python
def encode_push_confirm(msg_id, push_type=1):
    inner = b''
    # field 1: msg_id (I64=6 in TCompact)
    inner += field_header(0, 1, 6) + varint(msg_id)
    # field 2: push_type (I32=5)
    inner += field_header(1, 2, 5) + encode_i32(push_type)
    inner += stop()
    return field_header(0, 1, 12) + inner

args = encode_push_confirm(msg_id=1001, push_type=1)
resp = call_api(BASE_URL_NOTIFY, "push_confirm", args, cookie)
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体，HTTP 200 表示成功)
```

</details>

---

## StrategyApiService

> 基础 URL：`https://learn.baicizhan.com/rpc/strategy`

**认证方式**：所有接口均需要在 Cookie 中携带有效的 `access_token`。
会员信息等敏感数据接口会严格验证身份。

---

## get_user_member_info

> `https://learn.baicizhan.com/rpc/strategy/get_user_member_info/{timestamp}`

*请求方式：POST*

获取当前用户的会员类型和到期时间等会员信息。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（UserEntitlement）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| member_type | i32 | 会员类型 | 0=普通，1=月会员，2=年会员，3=永久会员 |
| expire_at | i64 | 会员过期时间戳（毫秒） | -1 或 0 表示永久/未设置 |
| is_vip | bool | 是否是有效 VIP | |
| privileges | list\<string\> | 已激活特权标识列表 | 如 `["no_ads", "cloud_sync"]` |

### Python 示例

```python
BASE_URL_STRATEGY = "https://learn.baicizhan.com/rpc/strategy"
cookie = make_cookie(access_token="YOUR_TOKEN")

resp = call_api(BASE_URL_STRATEGY, "get_user_member_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "member_type": 2,
  "expire_at": 1740000000000,
  "is_vip": true,
  "privileges": ["no_ads", "cloud_sync", "advanced_stats", "unlimited_books"]
}
```

</details>

---

## get_user_word_energy_info

> `https://learn.baicizhan.com/rpc/strategy/get_user_word_energy_info/{timestamp}`

*请求方式：POST*

获取用户单词能量（Word Energy）的权益状态，用于控制单词学习功能的使用额度。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（UserEntitlement）

与 [get_user_member_info](#get_user_member_info) 结构相同，`privileges` 字段包含单词能量相关特权。

### Python 示例

```python
resp = call_api(BASE_URL_STRATEGY, "get_user_word_energy_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "member_type": 0,
  "expire_at": 0,
  "is_vip": false,
  "privileges": ["basic_word_study"]
}
```

</details>

---

## get_user_sentence_energy_info

> `https://learn.baicizhan.com/rpc/strategy/get_user_sentence_energy_info/{timestamp}`

*请求方式：POST*

获取用户句子能量（Sentence Energy）的权益状态，用于控制句子学习功能的使用额度。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（UserEntitlement）

与 [get_user_member_info](#get_user_member_info) 结构相同，`privileges` 字段包含句子能量相关特权。

### Python 示例

```python
resp = call_api(BASE_URL_STRATEGY, "get_user_sentence_energy_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "member_type": 0,
  "expire_at": 0,
  "is_vip": false,
  "privileges": ["basic_sentence_study"]
}
```

</details>

---

## get_user_entitlement_infos

> `https://learn.baicizhan.com/rpc/strategy/get_user_entitlement_infos/{timestamp}`

*请求方式：POST*

一次性获取用户所有权益信息（会员、单词能量、句子能量），减少接口调用次数。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（UserEntitlementInfos）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| member | UserEntitlement | 会员权益信息 | 结构见 get_user_member_info |
| word_energy | UserEntitlement | 单词能量权益信息 | |
| sentence_energy | UserEntitlement | 句子能量权益信息 | |

### Python 示例

```python
resp = call_api(BASE_URL_STRATEGY, "get_user_entitlement_infos", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "member": {
    "member_type": 2,
    "expire_at": 1740000000000,
    "is_vip": true,
    "privileges": ["no_ads", "cloud_sync"]
  },
  "word_energy": {
    "member_type": 2,
    "expire_at": 1740000000000,
    "is_vip": true,
    "privileges": ["unlimited_words"]
  },
  "sentence_energy": {
    "member_type": 0,
    "expire_at": 0,
    "is_vip": false,
    "privileges": ["basic_sentence_study"]
  }
}
```

</details>

---

## get_user_entitlement_sale_info

> `https://learn.baicizhan.com/rpc/strategy/get_user_entitlement_sale_info/{timestamp}`

*请求方式：POST*

根据来源场景获取权益（会员/能量）的销售信息，用于展示对应购买页面。

### 认证方式

需要 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| source | i32 | 来源场景标识 | 必须 | 如 1=学习页弹窗，2=设置页，3=个人中心 |

### 响应字段（UserEntitlementSaleInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| title | string | 销售标题 | |
| subtitle | string | 销售副标题 | |
| products | list\<ProductInfo\> | 商品列表 | |
| jump_url | string | 购买页面 URL | |

### Python 示例

```python
def encode_sale_info_request(source=1):
    args = field_header(0, 1, 5) + encode_i32(source)
    return args

args = encode_sale_info_request(source=1)
resp = call_api(BASE_URL_STRATEGY, "get_user_entitlement_sale_info", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "title": "解锁无限学习",
  "subtitle": "年会员享全部特权",
  "products": [
    {"product_id": "member_month", "name": "月会员", "price": "18.00", "original_price": "28.00"},
    {"product_id": "member_year", "name": "年会员", "price": "98.00", "original_price": "198.00"}
  ],
  "jump_url": "bcz://member/purchase?source=1"
}
```

</details>

---

## get_member_popup_sale_info

> `https://learn.baicizhan.com/rpc/strategy/get_member_popup_sale_info/{timestamp}`

*请求方式：POST*

获取会员弹窗的销售配置信息，用于在合适时机向用户展示会员购买弹窗。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（MemberPopupSaleInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| show_popup | bool | 是否展示弹窗 | 服务端决策 |
| popup_title | string | 弹窗标题 | |
| popup_content | string | 弹窗内容文案 | |
| button_text | string | 按钮文案 | |
| jump_url | string | 点击跳转 URL | |
| image_url | string | 弹窗图片 URL | |

### Python 示例

```python
resp = call_api(BASE_URL_STRATEGY, "get_member_popup_sale_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "show_popup": false,
  "popup_title": "",
  "popup_content": "",
  "button_text": "",
  "jump_url": "",
  "image_url": ""
}
```

</details>

---

## get_app_home_page_member_stage_info

> `https://learn.baicizhan.com/rpc/strategy/get_app_home_page_member_stage_info/{timestamp}`

*请求方式：POST*

获取首页展示的会员状态信息，用于在学习首页卡片区域展示会员状态和促销信息。

### 认证方式

需要 `access_token`。

### 请求参数

无参数。

### 响应字段（AppHomePageMemberStageInfo）

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| stage | i32 | 展示阶段 | 0=隐藏，1=试用，2=促销，3=续费提醒 |
| title | string | 展示标题 | |
| subtitle | string | 展示副标题 | |
| badge_text | string | 角标文案 | |
| jump_url | string | 跳转 URL | |

### Python 示例

```python
resp = call_api(BASE_URL_STRATEGY, "get_app_home_page_member_stage_info", b'', cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "stage": 0,
  "title": "",
  "subtitle": "",
  "badge_text": "",
  "jump_url": ""
}
```

</details>

---

## get_free_member

> `https://learn.baicizhan.com/rpc/strategy/get_free_member/{timestamp}`

*请求方式：POST*

领取免费会员体验资格，通常用于特定活动或首次使用场景。

### 认证方式

需要 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| member_type | i32 | 申请的会员类型 | 必须 | 1=月会员体验，2=年会员体验 |

### 响应字段（UserEntitlement）

与 [get_user_member_info](#get_user_member_info) 结构相同，返回领取后的最新会员状态。

### Python 示例

```python
def encode_get_free_member(member_type=1):
    return field_header(0, 1, 5) + encode_i32(member_type)

args = encode_get_free_member(member_type=1)
resp = call_api(BASE_URL_STRATEGY, "get_free_member", args, cookie)
print(resp.hex())
```

<details><summary>查看响应示例：</summary>

```json
{
  "member_type": 1,
  "expire_at": 1712678400000,
  "is_vip": true,
  "privileges": ["no_ads", "cloud_sync"]
}
```

</details>

---

## BczReportApiService

> 基础 URL：`https://events.baicizhan.com/rpc/bcz_report`
> 备用 URL：`https://events.bczeducation.cn/rpc/bcz_report`

**认证方式**：
- `report_event` 需要 `access_token`
- `report_event_without_login` 无需认证

> **说明**：BczReportApiService 是专用的事件上报服务，与 BczSystemApiService 中的同名方法功能相同，但使用独立域名 `events.baicizhan.com`，可以独立扩容以应对大量埋点上报流量。两个服务的接口参数和格式完全一致。

---

## report_event (Report)

> `https://events.baicizhan.com/rpc/bcz_report/report_event/{timestamp}`

*请求方式：POST*

上报用户行为埋点事件（需登录）。与系统服务中的 [report_event](#report_event-system) 功能相同，使用专用事件域名。

### 认证方式

需要 `access_token`。

### 请求参数

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| jsons | list\<string\> | 事件 JSON 字符串列表 | 必须 | 单次可批量上报多条事件 |

**事件 JSON 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| event_name | string | 事件名称 | 如 `"word_study_complete"` |
| timestamp | string | 时间戳（毫秒字符串） | |
| user_id | string | 用户 ID | 登录状态下必填 |
| properties | object | 事件附加属性 | 自由键值对 |

### Python 示例

```python
BASE_URL_REPORT = "https://events.baicizhan.com/rpc/bcz_report"
cookie = make_cookie(access_token="YOUR_ACCESS_TOKEN")

def build_event_json(event_name, user_id=None, **props):
    evt = {
        "event_name": event_name,
        "timestamp": str(int(time.time() * 1000)),
        "properties": props
    }
    if user_id:
        evt["user_id"] = str(user_id)
    return json.dumps(evt, ensure_ascii=False)

def encode_report_event(events):
    list_bytes = encode_string_list(events)
    return field_header(0, 1, 9) + list_bytes

events = [
    build_event_json("word_study_complete", user_id=123456,
                     book_id=1234, words_count=20, duration_sec=180),
    build_event_json("daily_checkin", user_id=123456, streak_days=7),
]
args = encode_report_event(events)
resp = call_api(BASE_URL_REPORT, "report_event", args, cookie)
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体，HTTP 200 表示上报成功)
```

</details>

---

## report_event_without_login (Report)

> `https://events.baicizhan.com/rpc/bcz_report/report_event_without_login/{timestamp}`

*请求方式：POST*

上报埋点事件（无需登录），用于匿名用户或 App 启动早期阶段的事件收集。

### 认证方式

无需 `access_token`，仅需携带设备 Cookie。

### 请求参数

与 [report_event (Report)](#report_event-report) 相同，`user_id` 字段可省略。

### Python 示例

```python
BASE_URL_REPORT = "https://events.baicizhan.com/rpc/bcz_report"
cookie = make_cookie()  # 无 access_token

events = [
    build_event_json("app_launch", platform="android", version="7.8.14"),
    build_event_json("onboarding_view", step=1),
]
args = encode_report_event(events)
resp = call_api(BASE_URL_REPORT, "report_event_without_login", args, cookie)
```

<details><summary>查看响应示例：</summary>

```
(void — 空响应体，HTTP 200 表示上报成功)
```

</details>

---

## 相关文档

| 文档 | 内容 |
|------|------|
| [login.md](login.md) | 登录接口、access_token 获取方式、Cookie 字段说明 |
| [user_study_api.md](user_study_api.md) | 学习进度、词书管理、学习记录等用户学习类接口 |
| [thrift_client.md](thrift_client.md) | Thrift TCompact 协议编码详解、字段类型对照表、调试技巧 |

---

*文档生成于 BCZ Android v7.8.14（版本号 7081400）逆向分析结果，仅供学习研究使用。*
