# UnifiedUserService — 用户认证与账号管理（完整接口文档）

> 逆向来源：`com/baicizhan/online/unified_user_service/UnifiedUserService.java`（APK 7.8.14）  
> 相关文档：[thrift_client.md](thrift_client.md)、[login.md](login.md)、[flow_study.md](flow_study.md)

---

## 一、服务概览

| 项目 | 说明 |
|------|------|
| **服务名** | `unified_user_service` |
| **主端点** | `https://passport.baicizhan.com/rpc/unified_user_service` |
| **备用端点** | `https://passport.bczeducation.cn/rpc/unified_user_service` |
| **协议** | Apache Thrift TCompactProtocol + TFramedTransport over HTTPS |
| **HTTP 方法** | POST |
| **URL 格式** | `{endpoint}/{method_name}/{timestamp_ms}` |
| **Content-Type** | `application/x-thrift` |
| **认证** | HTTP Cookie（见 [thrift_client.md](thrift_client.md) §二） |

---

## 二、通用说明

### 2.1 Python 客户端基础代码

本文档所有 Python 示例均依赖 [thrift_client.md](thrift_client.md) 中的 `bcz_thrift_client.py`。

```python
from bcz_thrift_client import (
    CompactWriter, CompactReader,
    TYPE_STOP, TYPE_I32, TYPE_I64, TYPE_BINARY,
    TYPE_BOOL_T, TYPE_BOOL_F, TYPE_LIST, TYPE_STRUCT,
    MSG_CALL,
    build_cookie, post_thrift, make_url, BczException,
    check_response,
)

HOST    = "https://passport.baicizhan.com"
SERVICE = "unified_user_service"
DEVICE_ID = "aabbccdd1234abcd"   # 替换为真实 Android ID
```

### 2.2 核心数据结构

**UserLoginResult**（登录/注册方法的统一返回类型）：

| 字段 ID | 字段名 | 类型 | 内容 | 备注 |
|---------|--------|------|------|------|
| 1 | `access_token` | string | **Session 令牌**，后续请求 Cookie 携带 | 必须 |
| 2 | `is_new_user` | i32 | 是否新用户（1=是） | 必须 |
| 3 | `email` | string | 绑定邮箱 | 必须 |
| 4 | `public_key` | string | 公钥 | 必须 |
| 5 | `last_device` | string | 上次登录设备 | 必须 |
| 6 | `unique_id` | i64 | 用户唯一 ID | 必须 |
| 7 | `phone` | string | 绑定手机号 | 可选 |
| 8 | `force_bind_phone` | i32 | 是否强制绑手机（1=是） | 可选 |
| 9 | `role_new` | i32 | 角色（新版） | 可选 |
| 10 | `role` | struct RoleInfo | 角色信息 | 可选 |
| 11 | `game_mode` | i32 | 游戏模式 | 可选 |

**RoleInfo**：

| 字段 ID | 字段名 | 类型 | 内容 | 备注 |
|---------|--------|------|------|------|
| 1 | `role_up` | i32 | 角色身份（1=学生，2=职场人，3=其他） | — |
| 2 | `grade` | i32 | 年级/等级 | — |

**UserProfile**：

| 字段 ID | 字段名 | 类型 | 内容 | 备注 |
|---------|--------|------|------|------|
| 1 | `nickname` | string | 昵称 | 必须 |
| 2 | `gender_id` | i32 | 性别（1=男，2=女） | 必须 |
| 3 | `avatar` | string | 头像 URL | 可选 |
| 4 | `unique_id` | i64 | 用户 ID | 可选 |

**SendCaptchaAction 枚举**：

| 值 | 常量名 | 说明 |
|----|--------|------|
| 0 | `LOGIN` | 登录 |
| 1 | `REGISTER` | 注册 |
| 2 | `RESET_PASSWORD` | 重置密码 |
| 3 | `BIND_PHONE` | 绑定手机 |

---

## 三、登录相关

### `have_a_try` — 游客体验登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/have_a_try/{timestamp_ms}`

*请求方式：POST*

用于无账号用户体验 App 功能。服务端自动创建匿名账户，返回临时 `access_token`。

*认证方式：仅需基础 Cookie（无需 `access_token`）*

**请求参数（Thrift Args）：**

无参数，发送空 args 结构体即可。

**返回值**

`UserLoginResult`，见 §二 通用数据结构。

**Python 示例：**

```python
def have_a_try(device_id: str = DEVICE_ID) -> dict:
    """游客登录，返回 UserLoginResult。"""
    w = CompactWriter()
    w.write_message_begin("have_a_try", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    cookie = build_cookie(device_id=device_id)
    url = make_url(HOST, SERVICE, "have_a_try")
    raw = post_thrift(url, w.getvalue(), cookie)
    return parse_user_login_result(raw)


result = have_a_try()
print(f"access_token: {result['access_token'][:20]}...")
print(f"unique_id: {result['unique_id']}")
```

<details><summary>查看响应示例：</summary>

```
UserLoginResult {
  access_token  = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9..."
  is_new_user   = 1
  email         = ""
  public_key    = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCg..."
  last_device   = ""
  unique_id     = 987654321
  game_mode     = 0
}
```

</details>

---

### `send_sms_verify_code` — 发送短信验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{timestamp_ms}`

*请求方式：POST*

向指定手机号发送短信验证码，用于登录、注册或安全验证。
来源：`SmsCaptcha` 枚举类 + `UnifiedUserService.Iface`。

*认证方式：仅需基础 Cookie（无需 `access_token`）*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `phone` | string | 手机号（如 `13812345678`） | 必须 | — |
| `verify_type` | i32 | 验证码用途枚举值 | 必须 | 见下表 |

**verify_type 枚举（来源：SmsCaptcha.java）：**

| 值 | 含义 |
|----|------|
| 1 | 注册 |
| 5 | **登录/注册（最常用）** |
| 6 | 安全验证 |
| 7 | 新绑定 |

**返回值**

`void`（成功时 HTTP 200，响应体为空结构体）

**Python 示例：**

```python
def send_sms_verify_code(phone: str, verify_type: int = 5, cookie: str = None) -> None:
    """发送短信验证码。verify_type=5 表示登录/注册。"""
    if cookie is None:
        cookie = build_cookie(device_id=DEVICE_ID)

    w = CompactWriter()
    w.write_message_begin("send_sms_verify_code", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_BINARY, 1); w.write_string(phone)
    w.write_field_begin(TYPE_I32, 2);   w.write_i32(verify_type)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(HOST, SERVICE, "send_sms_verify_code")
    post_thrift(url, w.getvalue(), cookie)
    print(f"✓ 验证码已发送至 {phone}")


send_sms_verify_code("13812345678")
```

**curl 示例：**

```shell
# 需提前用 Python 工具生成二进制 body，以下展示 HTTP 层结构
curl -X POST \
  "https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/$(date +%s%3N)" \
  -H "Content-Type: application/x-thrift" \
  -H "Cookie: device_name=android%2FPixel6-Google; version=14; app_name=7081400; channel=official; client_time=$(date +%s); device_id=aabbccdd1234abcd; serial=aabbb1234501120530; time_zone=Asia%2FShanghai" \
  --data-binary @send_sms_body.bin
```

<details><summary>查看响应示例：</summary>

成功时返回空响应（void），HTTP 状态码 200。
失败时 ThriftException 包含错误详情，常见错误：
- `code=1003`：请求过于频繁，请稍后再试
- `code=1005`：手机号格式不正确

</details>

---

### `login_with_phone` — 手机号验证码登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{timestamp_ms}`

*请求方式：POST*

使用手机号 + 短信验证码登录（无账号时自动注册）。完整流程见 [login.md](login.md)。

*认证方式：仅需基础 Cookie（无需 `access_token`）*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `request` | struct PhoneLoginRequest | 登录请求体 | 必须 | 见下方嵌套结构 |

**PhoneLoginRequest 字段：**

| 字段 ID | 字段名 | 类型 | 内容 | 必要性 | 备注 |
|---------|--------|------|------|--------|------|
| 1 | `verify_code_request` | struct PhoneVerifyCodeRequest | 手机号+验证码 | 必须 | — |
| 2 | `free_verify_request` | struct PhoneFreeVerifyRequest | 免密登录 | 可选 | — |
| 3 | `device` | string | 设备 Android ID | 建议 | — |

**PhoneVerifyCodeRequest 字段：**

| 字段 ID | 字段名 | 类型 | 内容 | 必要性 | 备注 |
|---------|--------|------|------|--------|------|
| 1 | `phone` | string | 手机号 | 必须 | — |
| 2 | `verify_code` | string | 短信验证码（6位） | 必须 | — |

**返回值**

`UserLoginResult`，见 §二 通用数据结构。

**Python 示例：**

```python
def login_with_phone(phone: str, verify_code: str, device_id: str = DEVICE_ID) -> dict:
    """手机号 + 验证码登录，返回 UserLoginResult。"""
    w = CompactWriter()
    w.write_message_begin("login_with_phone", MSG_CALL, 0)
    w.write_struct_begin()                          # login_with_phone_args

    w.write_field_begin(TYPE_STRUCT, 1)             # field 1: PhoneLoginRequest
    w.write_struct_begin()

    w.write_field_begin(TYPE_STRUCT, 1)             # .field 1: PhoneVerifyCodeRequest
    w.write_struct_begin()
    w.write_field_begin(TYPE_BINARY, 1); w.write_string(phone)
    w.write_field_begin(TYPE_BINARY, 2); w.write_string(verify_code)
    w.write_field_stop()
    w.write_struct_end()                            # end PhoneVerifyCodeRequest

    w.write_field_begin(TYPE_BINARY, 3); w.write_string(device_id)
    w.write_field_stop()
    w.write_struct_end()                            # end PhoneLoginRequest

    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    cookie = build_cookie(device_id=device_id)
    url = make_url(HOST, SERVICE, "login_with_phone")
    raw = post_thrift(url, w.getvalue(), cookie)
    return parse_user_login_result(raw)


# 完整两步登录流程
send_sms_verify_code("13812345678")
code = input("请输入验证码：")
result = login_with_phone("13812345678", code)
auth_cookie = build_cookie(device_id=DEVICE_ID, access_token=result["access_token"])
print(f"✓ 登录成功！unique_id={result['unique_id']}")
```

<details><summary>查看响应示例：</summary>

```
UserLoginResult {
  access_token    = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjEyMzQ1Njc4OX0..."
  is_new_user     = 0
  email           = "user@example.com"
  public_key      = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA..."
  last_device     = "android/Pixel6-Google"
  unique_id       = 123456789
  phone           = "138****5678"
  force_bind_phone = 0
  role_new        = 1
  role            = RoleInfo { role_up=1, grade=3 }
  game_mode       = 0
}
```

</details>

---

### `have_a_try_v2` — 游客体验 v2

> `POST https://passport.baicizhan.com/rpc/unified_user_service/have_a_try_v2/{timestamp_ms}`

*请求方式：POST*

游客体验接口的 v2 版本，返回 `UserTryResult`（含更多用户信息）。无请求参数。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：** 无参数。

**返回值 `UserTryResult` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] login_result` | struct UserLoginResult | 登录结果 | 同 have_a_try |
| `[2] extra_info` | string | 额外信息（JSON） | — |

---

### `have_a_try_v3` — 游客体验 v3（Watch 端）

> `POST https://passport.baicizhan.com/rpc/unified_user_service/have_a_try_v3/{timestamp_ms}`

*请求方式：POST*

专为 Android Watch 端设计的游客体验接口，返回 `UserTryResultForWatch`。无请求参数。

*认证方式：仅需基础 Cookie*

---

### `third_party_login` — 第三方账号登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/third_party_login/{timestamp_ms}`

*请求方式：POST*

支持微信、QQ 等第三方平台登录。

*认证方式：仅需基础 Cookie*

**请求参数 `ThirdPartyLoginRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `provider` | string | 第三方平台（`wechat`/`qq`） | 必须 | — |
| `openid` | string | 第三方平台 OpenID | 必须 | — |
| `access_token` | string | 第三方平台 Access Token | 必须 | — |
| `unionid` | string | 微信 UnionID | 可选 | 仅微信 |
| `device` | string | 设备 ID | 建议 | — |

**返回值**

`UserLoginResult`，见 §二。

---

### `apple_login` — Apple 账号登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/apple_login/{timestamp_ms}`

*请求方式：POST*

使用 Apple Sign In 登录。

*认证方式：仅需基础 Cookie*

**请求参数 `AppleLoginRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `identity_token` | string | Apple 返回的 identityToken | 必须 | — |
| `authorization_code` | string | Apple 返回的 authorizationCode | 必须 | — |
| `device` | string | 设备 ID | 建议 | — |

**返回值**

`UserLoginResult`，见 §二。

---

### `google_login` — Google 账号登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/google_login/{timestamp_ms}`

*请求方式：POST*

使用 Google 账号登录。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `idToken` | string | Google 返回的 ID Token | 必须 | — |

**返回值**

`UserLoginResult`，见 §二。

---

### `bcz_login` — 账号密码登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/bcz_login/{timestamp_ms}`

*请求方式：POST*

使用百词斩账号（邮箱/手机号）+ 密码登录。

*认证方式：仅需基础 Cookie*

**请求参数 `BczLoginRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `account` | string | 账号（邮箱或手机号） | 必须 | — |
| `password` | string | 密码 | 必须 | — |
| `device` | string | 设备 ID | 建议 | — |

**返回值**

`UserLoginResult`，见 §二。

---

### `register_user` — 注册用户

> `POST https://passport.baicizhan.com/rpc/unified_user_service/register_user/{timestamp_ms}`

*请求方式：POST*

使用邮箱/手机号 + 密码注册新账号。

*认证方式：仅需基础 Cookie*

**请求参数：** 同 `BczLoginRequest`。

**返回值**

`UserLoginResult`，见 §二。

---

### `bcz_bind_try_user` — 绑定游客账号

> `POST https://passport.baicizhan.com/rpc/unified_user_service/bcz_bind_try_user/{timestamp_ms}`

*请求方式：POST*

将游客账号绑定到正式账号（账号密码方式）。

*认证方式：需携带游客 `access_token`*

**请求参数：** 同 `BczLoginRequest`。

**返回值**

`UserLoginResult`，见 §二。

---

### `third_party_bind_try_user` — 绑定第三方到游客账号

> `POST https://passport.baicizhan.com/rpc/unified_user_service/third_party_bind_try_user/{timestamp_ms}`

*请求方式：POST*

将游客账号绑定到第三方平台账号（微信/QQ）。

*认证方式：需携带游客 `access_token`*

**请求参数：** 同 `ThirdPartyLoginRequest`。

**返回值**

`UserLoginResult`，见 §二。

---

### `watch_poll_login` — Watch 轮询登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/watch_poll_login/{timestamp_ms}`

*请求方式：POST*

Android Watch 端轮询等待手机扫码授权，获得 `access_token`。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `watch_uuid` | string | Watch 端生成的 UUID | 必须 | — |

**返回值**

`string`（access_token，未授权时返回空字符串）

---

### `scan_for_watch_login` — 扫码授权 Watch 登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/scan_for_watch_login/{timestamp_ms}`

*请求方式：POST*

手机端扫码后调用，授权 Watch 端登录。

*认证方式：需携带手机端 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `watch_uuid` | string | Watch 端的 UUID | 必须 | — |

**返回值**

`void`

---

## 四、个人资料

### `get_profile` — 获取用户资料

> `POST https://passport.baicizhan.com/rpc/unified_user_service/get_profile/{timestamp_ms}`

*请求方式：POST*

获取当前登录用户的基本资料。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：** 无参数。

**返回值 `UserProfile` 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] nickname` | string | 昵称 | — |
| `[2] gender_id` | i32 | 性别（1=男，2=女，0=未设置） | — |
| `[3] avatar` | string | 头像图片 URL | — |
| `[4] unique_id` | i64 | 用户 ID | — |

**Python 示例：**

```python
def get_profile(cookie: str) -> dict:
    """获取当前用户资料。"""
    w = CompactWriter()
    w.write_message_begin("get_profile", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(HOST, SERVICE, "get_profile")
    raw = post_thrift(url, w.getvalue(), cookie)

    r = CompactReader(raw)
    check_response(r, "get_profile")
    profile = {}
    r.read_struct_begin()
    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid == 0 and ft == TYPE_STRUCT:
            r.read_struct_begin()
            while True:
                ft2, fid2 = r.read_field_begin()
                if ft2 == TYPE_STOP:
                    break
                if fid2 == 1 and ft2 == TYPE_BINARY:
                    profile["nickname"] = r.read_string()
                elif fid2 == 2 and ft2 == TYPE_I32:
                    profile["gender_id"] = r.read_i32()
                elif fid2 == 3 and ft2 == TYPE_BINARY:
                    profile["avatar"] = r.read_string()
                elif fid2 == 4 and ft2 == TYPE_I64:
                    profile["unique_id"] = r.read_i64()
                else:
                    r.skip(ft2)
            r.read_struct_end()
        else:
            r.skip(ft)
    r.read_struct_end()
    return profile


profile = get_profile(auth_cookie)
print(f"昵称: {profile.get('nickname')}")
print(f"性别: {'男' if profile.get('gender_id')==1 else '女'}")
print(f"头像: {profile.get('avatar')}")
```

<details><summary>查看响应示例：</summary>

```
UserProfile {
  nickname  = "百词斩用户"
  gender_id = 1
  avatar    = "https://img.baicizhan.com/avatar/123456.jpg"
  unique_id = 123456789
}
```

</details>

---

### `update_profile` — 更新用户资料

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_profile/{timestamp_ms}`

*请求方式：POST*

同时更新昵称和性别。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `gender_id` | i32 | 性别（1=男，2=女） | 必须 | — |
| `nickname` | string | 新昵称 | 必须 | 最大 16 字符 |

**返回值**

`void`

**Python 示例：**

```python
def update_profile(gender_id: int, nickname: str, cookie: str) -> None:
    """更新用户昵称和性别。"""
    w = CompactWriter()
    w.write_message_begin("update_profile", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_I32, 1);    w.write_i32(gender_id)
    w.write_field_begin(TYPE_BINARY, 2); w.write_string(nickname)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(HOST, SERVICE, "update_profile")
    post_thrift(url, w.getvalue(), cookie)
    print(f"✓ 资料已更新: 昵称={nickname}")


update_profile(gender_id=1, nickname="我的新昵称", cookie=auth_cookie)
```

<details><summary>查看响应示例：</summary>

成功时返回空响应（void），HTTP 200。

</details>

---

### `update_nickname` — 更新昵称

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_nickname/{timestamp_ms}`

*请求方式：POST*

单独更新用户昵称。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `nickname` | string | 新昵称 | 必须 | — |

**返回值**

`void`

**Python 示例（概念）：**

```python
w = CompactWriter()
w.write_message_begin("update_nickname", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_BINARY, 1); w.write_string("新昵称")
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
post_thrift(make_url(HOST, SERVICE, "update_nickname"), w.getvalue(), auth_cookie)
```

---

### `update_gender` — 更新性别

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_gender/{timestamp_ms}`

*请求方式：POST*

单独更新性别。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `gender_id` | i32 | 性别（1=男，2=女） | 必须 | — |

**返回值**

`void`

---

### `update_birthday` — 更新生日

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_birthday/{timestamp_ms}`

*请求方式：POST*

更新用户生日。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `birthday` | i64 | 生日 Unix 时间戳（毫秒） | 必须 | 如 `631152000000` = 1990-01-01 |

**返回值**

`void`

**Python 示例（概念）：**

```python
import datetime
bd = datetime.date(1995, 6, 15)
ts_ms = int(datetime.datetime(bd.year, bd.month, bd.day).timestamp() * 1000)

w = CompactWriter()
w.write_message_begin("update_birthday", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_I64, 1); w.write_i64(ts_ms)
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
post_thrift(make_url(HOST, SERVICE, "update_birthday"), w.getvalue(), auth_cookie)
```

---

## 五、账号绑定

### `bind_phone` — 绑定手机号（含密码）

> `POST https://passport.baicizhan.com/rpc/unified_user_service/bind_phone/{timestamp_ms}`

*请求方式：POST*

将手机号绑定到当前账号（需提供密码）。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `phone` | string | 手机号 | 必须 | — |
| `code` | string | 短信验证码 | 必须 | — |
| `password` | string | 账号密码 | 必须 | — |

**返回值**

`void`

---

### `bind_phone_v2` — 绑定手机号 v2

> `POST https://passport.baicizhan.com/rpc/unified_user_service/bind_phone_v2/{timestamp_ms}`

*请求方式：POST*

绑定手机号简化版（无需密码）。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `phone` | string | 手机号 | 必须 | — |
| `code` | string | 短信验证码 | 必须 | — |

**返回值**

`void`

---

### `bind_phone_v3` — 绑定手机号 v3

> `POST https://passport.baicizhan.com/rpc/unified_user_service/bind_phone_v3/{timestamp_ms}`

*请求方式：POST*

绑定手机号的最新版本，使用 `PhoneLoginRequest` 结构体。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `request` | struct PhoneLoginRequest | 绑定请求（与 login_with_phone 相同结构） | 必须 | — |

**返回值 `BindPhoneResult` 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] access_token` | string | 新的 access_token | — |
| `[2] phone` | string | 已绑定的手机号 | — |

---

### `rebind_phone` — 更换绑定手机号

> `POST https://passport.baicizhan.com/rpc/unified_user_service/rebind_phone/{timestamp_ms}`

*请求方式：POST*

更换账号绑定的手机号。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `oldphone` | string | 旧手机号 | 必须 | — |
| `newphone` | string | 新手机号 | 必须 | — |
| `code` | string | 新手机号收到的验证码 | 必须 | — |
| `password` | string | 账号密码 | 必须 | — |

**返回值**

`void`

---

### `check_verify_code_for_old_phone` — 验证旧手机验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/check_verify_code_for_old_phone/{timestamp_ms}`

*请求方式：POST*

换绑手机号流程中，验证旧手机的验证码。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `phone` | string | 旧手机号 | 必须 | — |
| `verify_code` | string | 旧手机收到的验证码 | 必须 | — |

**返回值**

`void`

---

### `get_bind_info` — 获取账号绑定信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/get_bind_info/{timestamp_ms}`

*请求方式：POST*

获取当前账号的所有第三方绑定信息（微信、QQ 等）。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：** 无参数。

**返回值 `List<UserBindInfo>` 元素字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] provider` | string | 平台标识（`wechat`/`qq`等） | — |
| `[2] openid` | string | 第三方平台 OpenID | — |
| `[3] nickname` | string | 第三方平台昵称 | — |
| `[4] avatar` | string | 第三方平台头像 | — |

---

### `unbind_third_party` — 解绑第三方账号

> `POST https://passport.baicizhan.com/rpc/unified_user_service/unbind_third_party/{timestamp_ms}`

*请求方式：POST*

解除当前账号与第三方平台的绑定关系。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `provider` | string | 平台标识（如 `wechat`） | 必须 | — |
| `openid` | string | 第三方 OpenID | 必须 | — |
| `unionid` | string | 微信 UnionID | 可选 | 仅微信平台 |

**返回值**

`void`

---

### `get_third_party_user_info` — 获取第三方账号信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/get_third_party_user_info/{timestamp_ms}`

*请求方式：POST*

获取当前账号关联的第三方平台用户信息。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：** 无参数。

**返回值 `ThirdPartyUserInfo` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] provider` | string | 第三方平台标识 | — |
| `[2] nickname` | string | 第三方昵称 | — |
| `[3] avatar` | string | 第三方头像 URL | — |

---

## 六、验证码

### `send_email_verify_code` — 发送邮箱验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/send_email_verify_code/{timestamp_ms}`

*请求方式：POST*

向指定邮箱发送验证码。

*认证方式：仅需基础 Cookie 或携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `email` | string | 邮箱地址 | 必须 | — |
| `verify_type` | i32 | 验证码用途 | 必须 | 见 SendCaptchaAction 枚举 |

**返回值**

`void`

---

### `send_captcha` — 发送验证码（通用）

> `POST https://passport.baicizhan.com/rpc/unified_user_service/send_captcha/{timestamp_ms}`

*请求方式：POST*

通用验证码发送接口，支持手机号或邮箱。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `account` | string | 手机号或邮箱 | 必须 | — |
| `action` | i32 | SendCaptchaAction 枚举值 | 必须 | 见 §二 |

**返回值**

`boolean`（`true`=发送成功）

**Python 示例（概念）：**

```python
w = CompactWriter()
w.write_message_begin("send_captcha", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_BINARY, 1); w.write_string("13812345678")
w.write_field_begin(TYPE_I32, 2);   w.write_i32(0)   # action=LOGIN
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
raw = post_thrift(make_url(HOST, SERVICE, "send_captcha"), w.getvalue(), cookie)
```

---

### `get_img_captcha` — 获取图形验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/get_img_captcha/{timestamp_ms}`

*请求方式：POST*

获取图形验证码（某些操作前需先通过图形验证）。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `action` | i32 | SendCaptchaAction 枚举值 | 必须 | — |

**返回值 `ImgCaptcha` 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] trace_id` | string | 验证码追踪 ID | 验证时需要 |
| `[2] captcha_img` | string | Base64 编码的图片 | — |
| `[3] captcha_type` | string | 验证码类型 | — |

---

### `verify_img_captcha` — 验证图形验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/verify_img_captcha/{timestamp_ms}`

*请求方式：POST*

提交用户输入的图形验证码答案。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `answer` | string | 用户输入的验证码答案 | 必须 | — |
| `trace_id` | string | get_img_captcha 返回的 trace_id | 必须 | — |
| `captcha` | string | 验证码类型标识 | 必须 | — |
| `action` | i32 | SendCaptchaAction 枚举值 | 必须 | — |

**返回值**

`boolean`（`true`=验证通过）

---

### `mock_send_captcha` — 模拟发送验证码（测试用）

> `POST https://passport.baicizhan.com/rpc/unified_user_service/mock_send_captcha/{timestamp_ms}`

*请求方式：POST*

**仅用于测试环境**，模拟发送验证码并直接返回验证码内容（不实际发送短信）。生产环境可能不可用。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `account` | string | 手机号或邮箱 | 必须 | — |
| `action` | i32 | SendCaptchaAction 枚举值 | 必须 | — |

**返回值**

`string`（验证码明文，测试环境专用）

---

## 七、学校与角色

### `update_school` — 更新学校信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_school/{timestamp_ms}`

*请求方式：POST*

更新用户的学校信息。

*认证方式：需携带 `access_token`*

**请求参数 `SchoolInfoRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `school_id` | i32 | 学校 ID | 必须 | 来自 search_school |
| `school_name` | string | 学校名称 | 必须 | — |
| `major_id` | i32 | 专业 ID | 可选 | 来自 search_major |
| `major_name` | string | 专业名称 | 可选 | — |
| `grade` | i32 | 年级 | 可选 | 如 2021 |

**返回值**

`void`

---

### `search_school` — 搜索学校

> `POST https://passport.baicizhan.com/rpc/unified_user_service/search_school/{timestamp_ms}`

*请求方式：POST*

按关键词搜索学校列表。

*认证方式：需携带 `access_token`*

**请求参数 `SearchSchoolRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `keyword` | string | 搜索关键词 | 必须 | — |
| `page` | i32 | 页码（从 1 开始） | 可选 | 默认 1 |
| `page_size` | i32 | 每页数量 | 可选 | 默认 20 |

**返回值 `SearchSchoolResult` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] schools` | list\<SchoolInfo\> | 学校列表 | — |
| `[2] total` | i32 | 总数 | — |

---

### `search_major` — 搜索专业

> `POST https://passport.baicizhan.com/rpc/unified_user_service/search_major/{timestamp_ms}`

*请求方式：POST*

按关键词搜索专业。

*认证方式：需携带 `access_token`*

**请求参数 `SchoolMajorRequest` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `keyword` | string | 专业关键词 | 必须 | — |
| `school_id` | i32 | 限定学校 ID | 可选 | — |

**返回值 `SchoolMajorResult` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] majors` | list\<MajorInfo\> | 专业列表 | — |

---

### `report_school` — 上报学校信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/report_school/{timestamp_ms}`

*请求方式：POST*

上报用户提供的学校名称（学校不在搜索结果中时使用）。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `school_name` | string | 学校名称 | 必须 | — |
| `type` | i32 | 上报类型 | 必须 | — |

**返回值**

`void`

---

### `update_role` — 更新用户角色

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_role/{timestamp_ms}`

*请求方式：POST*

设置用户的基本角色标识。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `rule_id` | i32 | 角色 ID | 必须 | 来自角色枚举 |

**返回值**

`void`

---

### `update_role_extra` — 更新角色附加信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_role_extra/{timestamp_ms}`

*请求方式：POST*

更新用户角色的详细信息（身份 + 年级）。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `role_up` | i32 | 角色身份（1=学生，2=职场人，3=其他） | 必须 | — |
| `grade` | i32 | 年级（学生身份时使用） | 必须 | 如 3=大三 |

**返回值**

`string`（返回更新后的角色信息 JSON）

**Python 示例（概念）：**

```python
w = CompactWriter()
w.write_message_begin("update_role_extra", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_I32, 1); w.write_i32(1)   # role_up=学生
w.write_field_begin(TYPE_I32, 2); w.write_i32(3)   # grade=大三
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
raw = post_thrift(make_url(HOST, SERVICE, "update_role_extra"), w.getvalue(), auth_cookie)
```

---

### `post_select_role_action_config` — 提交角色选择行为配置

> `POST https://passport.baicizhan.com/rpc/unified_user_service/post_select_role_action_config/{timestamp_ms}`

*请求方式：POST*

用户选择角色后，提交相关行为配置。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `role` | i32 | 角色枚举值 | 必须 | — |

**返回值**

`string`（JSON 格式配置）

---

### `update_position` — 更新所在地

> `POST https://passport.baicizhan.com/rpc/unified_user_service/update_position/{timestamp_ms}`

*请求方式：POST*

更新用户所在地区。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `position_code` | i32 | 地区代码 | 必须 | 来自 get_position_list |

**返回值**

`void`

---

### `get_position_list` — 获取地区列表

> `POST https://passport.baicizhan.com/rpc/unified_user_service/get_position_list/{timestamp_ms}`

*请求方式：POST*

获取可选地区列表。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：** 无参数。

**返回值 `List<Position>` 元素字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] code` | i32 | 地区代码 | — |
| `[2] name` | string | 地区名称 | — |

---

## 八、账号安全与其他

### `check_access_token` — 验证 access_token

> `POST https://passport.baicizhan.com/rpc/unified_user_service/check_access_token/{timestamp_ms}`

*请求方式：POST*

检查当前 `access_token` 是否有效。

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `device` | string | 设备 Android ID | 必须 | — |

**返回值 `AccessTokenCheckResult` 字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] valid` | bool | token 是否有效 | — |
| `[2] unique_id` | i64 | 用户 ID | valid=true 时有效 |
| `[3] new_token` | string | 如有更新，返回新 token | 可选 |

**Python 示例（概念）：**

```python
w = CompactWriter()
w.write_message_begin("check_access_token", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_BINARY, 1); w.write_string(DEVICE_ID)
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
raw = post_thrift(make_url(HOST, SERVICE, "check_access_token"), w.getvalue(), auth_cookie)
```

---

### `reset_password` — 重置密码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/reset_password/{timestamp_ms}`

*请求方式：POST*

通过验证码重置账号密码。

*认证方式：仅需基础 Cookie*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `account` | string | 手机号或邮箱 | 必须 | — |
| `password` | string | 新密码 | 必须 | — |
| `code` | string | 验证码 | 必须 | 需先调用 send_captcha |

**返回值**

`void`

---

### `delete_account` — 注销账号

> `POST https://passport.baicizhan.com/rpc/unified_user_service/delete_account/{timestamp_ms}`

*请求方式：POST*

永久注销当前账号。**不可逆操作，请谨慎调用。**

*认证方式：需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `account` | string | 账号（手机号或邮箱，用于二次确认） | 必须 | — |

**返回值**

`void`

---

### `save_user_ext_info` — 保存用户扩展信息

> `POST https://passport.baicizhan.com/rpc/unified_user_service/save_user_ext_info/{timestamp_ms}`

*请求方式：POST*

保存用户自定义扩展字段信息（如学习目标、偏好设置等）。

*认证方式：需携带 `access_token`*

**请求参数 `UserExtInfo` 字段：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `[1] key` | string | 扩展字段名 | 必须 | — |
| `[2] value` | string | 扩展字段值 | 必须 | — |

**返回值**

`i32`（状态码，0=成功）

**Python 示例（概念）：**

```python
w = CompactWriter()
w.write_message_begin("save_user_ext_info", MSG_CALL, 0)
w.write_struct_begin()
w.write_field_begin(TYPE_STRUCT, 1)            # field 1: UserExtInfo
w.write_struct_begin()
w.write_field_begin(TYPE_BINARY, 1); w.write_string("study_goal")
w.write_field_begin(TYPE_BINARY, 2); w.write_string("cet4")
w.write_field_stop()
w.write_struct_end()
w.write_field_stop(); w.write_struct_end(); w.write_message_end()
raw = post_thrift(make_url(HOST, SERVICE, "save_user_ext_info"), w.getvalue(), auth_cookie)
```

---

## 九、方法速查表

| 方法名 | 参数摘要 | 返回类型 | 需要登录 | 分组 |
|--------|----------|----------|----------|------|
| `have_a_try` | — | UserLoginResult | ✗ | 登录 |
| `have_a_try_v2` | — | UserTryResult | ✗ | 登录 |
| `have_a_try_v3` | — | UserTryResultForWatch | ✗ | 登录 |
| `send_sms_verify_code` | phone, verify_type | void | ✗ | 验证码 |
| `login_with_phone` | PhoneLoginRequest | UserLoginResult | ✗ | 登录 |
| `bcz_login` | BczLoginRequest | UserLoginResult | ✗ | 登录 |
| `register_user` | BczLoginRequest | UserLoginResult | ✗ | 登录 |
| `bcz_bind_try_user` | BczLoginRequest | UserLoginResult | ✓（游客） | 登录 |
| `third_party_login` | ThirdPartyLoginRequest | UserLoginResult | ✗ | 登录 |
| `third_party_bind_try_user` | ThirdPartyLoginRequest | UserLoginResult | ✓（游客） | 登录 |
| `apple_login` | AppleLoginRequest | UserLoginResult | ✗ | 登录 |
| `google_login` | idToken | UserLoginResult | ✗ | 登录 |
| `watch_poll_login` | watch_uuid | string | ✗ | 登录 |
| `scan_for_watch_login` | watch_uuid | void | ✓ | 登录 |
| `check_access_token` | device | AccessTokenCheckResult | ✓ | 安全 |
| `get_profile` | — | UserProfile | ✓ | 资料 |
| `update_profile` | gender_id, nickname | void | ✓ | 资料 |
| `update_nickname` | nickname | void | ✓ | 资料 |
| `update_gender` | gender_id | void | ✓ | 资料 |
| `update_birthday` | birthday | void | ✓ | 资料 |
| `bind_phone` | phone, code, password | void | ✓ | 绑定 |
| `bind_phone_v2` | phone, code | void | ✓ | 绑定 |
| `bind_phone_v3` | PhoneLoginRequest | BindPhoneResult | ✓ | 绑定 |
| `rebind_phone` | oldphone, newphone, code, password | void | ✓ | 绑定 |
| `check_verify_code_for_old_phone` | phone, verify_code | void | ✓ | 绑定 |
| `get_bind_info` | — | List\<UserBindInfo\> | ✓ | 绑定 |
| `unbind_third_party` | provider, openid, unionid | void | ✓ | 绑定 |
| `get_third_party_user_info` | — | ThirdPartyUserInfo | ✓ | 绑定 |
| `send_captcha` | account, action | boolean | ✗ | 验证码 |
| `mock_send_captcha` | account, action | string | ✗ | 验证码 |
| `send_email_verify_code` | email, verify_type | void | ✗/✓ | 验证码 |
| `get_img_captcha` | action | ImgCaptcha | ✗ | 验证码 |
| `verify_img_captcha` | answer, trace_id, captcha, action | boolean | ✗ | 验证码 |
| `update_school` | SchoolInfoRequest | void | ✓ | 学校 |
| `search_school` | SearchSchoolRequest | SearchSchoolResult | ✓ | 学校 |
| `search_major` | SchoolMajorRequest | SchoolMajorResult | ✓ | 学校 |
| `report_school` | school_name, type | void | ✓ | 学校 |
| `update_role` | rule_id | void | ✓ | 角色 |
| `update_role_extra` | role_up, grade | string | ✓ | 角色 |
| `post_select_role_action_config` | role | string | ✓ | 角色 |
| `update_position` | position_code | void | ✓ | 角色 |
| `get_position_list` | — | List\<Position\> | ✓ | 角色 |
| `reset_password` | account, password, code | void | ✗ | 安全 |
| `delete_account` | account | void | ✓ | 安全 |
| `save_user_ext_info` | UserExtInfo | i32 | ✓ | 其他 |

---

## 十、关键源码位置参考

| 功能 | 源码路径 |
|------|---------|
| Thrift 服务接口定义 | `com/baicizhan/online/unified_user_service/UnifiedUserService.java` |
| HTTP 传输层（THttpClient） | `com/baicizhan/client/business/thrift/k.java` |
| TFramedTransport | `com/baicizhan/client/business/thrift/j.java` |
| URL 构建 | `com/baicizhan/client/business/thrift/a.java` |
| Cookie 构建 | `com/baicizhan/client/business/thrift/b.java` |
| 服务端地址配置 | `com/baicizhan/client/business/thrift/h.java` |
| 服务端路径注册 | `com/baicizhan/client/business/thrift/c.java` |
| 登录流程调用 | `yg/y.java`（`N()`、`T()` 方法） |
| SmsCaptcha 枚举 | `com/baicizhan/main/auth/SmsCaptcha.java` |
| PhoneLoginRequest | `com/baicizhan/online/unified_user_service/PhoneLoginRequest.java` |
| UserLoginResult | `com/baicizhan/online/unified_user_service/UserLoginResult.java` |
| UserProfile | `com/baicizhan/online/unified_user_service/UserProfile.java` |
| SendCaptchaAction 枚举 | `com/baicizhan/online/unified_user_service/SendCaptchaAction.java` |
