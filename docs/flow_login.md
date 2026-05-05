# 登录方式全流程

> 逆向来源：APK 7.8.14（versionCode 7081400），仅供网络安全研究目的。  
> 所有登录接口均通过 UnifiedUserService 服务，使用 Thrift TCompactProtocol + TFramedTransport 协议。  
> 基础 Python 客户端实现详见 [docs/thrift_client.md](thrift_client.md)。

---

## 目录

- [通用说明](#通用说明)
- [方式一：手机短信验证码登录（最常用）](#方式一手机短信验证码登录)
- [方式二：账号密码登录](#方式二账号密码登录)
- [方式三：游客登录 have_a_try](#方式三游客登录-have_a_try)
- [方式四：第三方登录（微信/QQ）](#方式四第三方登录微信qq)
- [方式五：Apple 登录](#方式五apple-登录)
- [方式六：Google 登录](#方式六google-登录)
- [登录后：access_token 使用说明](#登录后access_token-使用说明)
- [异常说明](#异常说明)

---

## 通用说明

所有登录接口均指向同一服务端点：

```
POST https://passport.baicizhan.com/rpc/unified_user_service/{method_name}/{timestamp_ms}
Content-Type: application/x-thrift
Cookie: device_name=...; version=14; app_name=7081400; channel=official; client_time=...; device_id=...; serial=...; time_zone=Asia/Shanghai
```

**Cookie 构造（无需 access_token，登录前不携带）：**

```python
import time

def make_cookie_pre_login(device_id: str = "aabbccdd1234abcd") -> str:
    """登录前的 Cookie，不包含 access_token"""
    ts = int(time.time())
    serial = device_id[:5] + device_id[-5:] + time.strftime("%d%H%M%S")
    return (
        f"device_name=android%2FPixel6-Google; "
        f"version=14; "
        f"app_name=7081400; "
        f"channel=official; "
        f"client_time={ts}; "
        f"device_id={device_id}; "
        f"serial={serial}; "
        f"time_zone=Asia%2FShanghai"
    )
```

**登录成功后**，所有接口的返回结构均为 `UserLoginResult`，字段说明见 [unified_user_service.md](unified_user_service.md#userloginresult-结构)。

最关键字段：
- `access_token`（字段 1，string）：后续所有请求携带此值作为 Cookie

---

## 方式一：手机短信验证码登录

这是最主要的登录方式，分两步：

```
① send_sms_verify_code(phone, verify_type=5)  → 服务端发送短信
        ↓ 用户收到 6 位验证码
② login_with_phone(PhoneLoginRequest)         ← UserLoginResult
```

### 步骤 1：发送短信验证码

> `POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token，仅需基础 Cookie

**请求参数（Thrift Args）：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `phone` | string | **必须** | `"13800138000"` | 手机号码（不含国际区号 +86） |
| 2 | `verify_type` | i32 | **必须** | `5` | 验证码用途，登录/注册用 `5` |

**`verify_type` 枚举值（来源：`SmsCaptcha.java`）：**

| 值 | 含义 |
|----|------|
| `1` | 注册（REGISTER） |
| `5` | 登录或注册（LOGIN_OR_REG）**← 推荐使用** |
| `6` | 安全验证（SECURITY_VERIFICATION） |
| `7` | 新绑定（NEW_BINDING） |

**返回值：** void（无返回体），服务端成功发送短信即代表成功。失败时抛出 `LogicException`。

**Python 代码：**

```python
import struct, time, requests

BASE_URL = "https://passport.baicizhan.com/rpc/unified_user_service"

def varint(n: int) -> bytes:
    buf = b''
    while True:
        if n & ~0x7f == 0:
            buf += bytes([n]); break
        buf += bytes([(n & 0x7f) | 0x80]); n >>= 7
    return buf

def encode_string(s: str) -> bytes:
    b = s.encode('utf-8')
    return varint(len(b)) + b

def encode_i32(n: int) -> bytes:
    n = (n << 1) ^ (n >> 31)  # zigzag
    return varint(n)

def field_str(fid: int, prev: int = 0) -> bytes:
    """字符串字段头 (type=8 BINARY in TCompact)"""
    delta = fid - prev
    if 1 <= delta <= 15:
        return bytes([(delta << 4) | 8])
    return bytes([8]) + struct.pack('<h', fid)

def field_i32(fid: int, prev: int = 0) -> bytes:
    """i32 字段头 (type=5 in TCompact)"""
    delta = fid - prev
    if 1 <= delta <= 15:
        return bytes([(delta << 4) | 5])
    return bytes([5]) + struct.pack('<h', fid)

def build_call(method: str, args: bytes, seq: int = 0) -> bytes:
    hdr = b'\x82\x21' + varint(seq) + encode_string(method)
    body = hdr + args + b'\x00'   # STOP
    return struct.pack('>I', len(body)) + body

def call_api(method: str, args: bytes, cookie: str) -> bytes:
    url = f"{BASE_URL}/{method}/{int(time.time() * 1000)}"
    r = requests.post(url, data=build_call(method, args),
                      headers={'Content-Type': 'application/x-thrift', 'Cookie': cookie})
    r.raise_for_status()
    return r.content[4:]  # 去掉 4 字节 TFramed 头

def send_sms_verify_code(phone: str, device_id: str = "aabbccdd1234abcd"):
    """发送短信验证码，verify_type=5（登录/注册）"""
    cookie = make_cookie_pre_login(device_id)
    args = b''
    args += field_str(1, 0)     # field 1: phone (string, type=8)
    args += encode_string(phone)
    args += field_i32(2, 1)     # field 2: verify_type (i32, type=5)
    args += encode_i32(5)
    call_api("send_sms_verify_code", args, cookie)
    print(f"短信已发送至 {phone}")

# 使用示例
send_sms_verify_code("13800138000")
```

<details>
<summary>响应说明（void 方法）</summary>

成功时响应体为空 Thrift REPLY 消息（含 STOP 字段），无实际数据。  
失败时服务端返回 `LogicException`，解析后可获取错误码和错误消息。

常见错误：
- 手机号格式错误
- 同一手机号 60 秒内重复请求

</details>

---

### 步骤 2：验证码登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**请求参数（Thrift Args → PhoneLoginRequest）：**

外层 `login_with_phone_args` 只有一个字段：

| 字段 ID | 字段名 | 类型 | 必要性 | 说明 |
|---------|--------|------|--------|------|
| 1 | `request` | struct PhoneLoginRequest | **必须** | 登录请求结构体 |

**PhoneLoginRequest 字段（来源：`PhoneLoginRequest.java`）：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `verify_code_request` | struct PhoneVerifyCodeRequest | 与 `free_verify_request` 二选一 | — | 短信验证码登录结构体 |
| 2 | `free_verify_request` | struct PhoneFreeVerifyRequest | 可选 | — | 免密登录（中国联通 UAID），一般不用 |
| 3 | `device` | string | **必须** | `"aabbccdd1234abcd"` | 设备 ID（android_id） |

**PhoneVerifyCodeRequest 字段（来源：`PhoneVerifyCodeRequest.java`）：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `phone` | string | **必须** | `"13800138000"` | 手机号码 |
| 2 | `verify_code` | string | **必须** | `"123456"` | 短信验证码（6 位） |

**返回值：UserLoginResult**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `access_token` | string | **Session 令牌，后续请求携带此值** |
| 2 | `is_new_user` | i32 | 是否新注册用户（1=是，0=否） |
| 3 | `email` | string | 绑定邮箱（可能为空） |
| 4 | `public_key` | string | 公钥（备用） |
| 5 | `last_device` | string | 上次登录设备 ID |
| 6 | `unique_id` | i64 | 用户唯一 ID（数值型） |
| 7 | `phone` | string | 手机号（可选字段） |
| 8 | `force_bind_phone` | i32 | 是否强制绑定手机（1=需要） |
| 9 | `role_new` | i32 | 用户角色（新版）：1=学生，2=职场人，3=其他 |
| 10 | `role` | struct RoleInfo | 角色详情（含 role_up/grade 字段） |
| 11 | `game_mode` | i32 | 游戏模式标志 |

**Python 代码（完整示例）：**

```python
def read_varint(data: bytes, pos: int):
    result, shift = 0, 0
    while True:
        b = data[pos]; pos += 1
        result |= (b & 0x7f) << shift
        if not (b & 0x80): break
        shift += 7
    return result, pos

def read_string(data: bytes, pos: int):
    length, pos = read_varint(data, pos)
    return data[pos:pos + length].decode('utf-8'), pos + length

def read_i32(data: bytes, pos: int):
    v, pos = read_varint(data, pos)
    return (v >> 1) ^ -(v & 1), pos  # unzigzag

def read_i64(data: bytes, pos: int):
    v, pos = read_varint(data, pos)
    return (v >> 1) ^ -(v & 1), pos

def parse_user_login_result(data: bytes) -> dict:
    """解析 UserLoginResult，返回字典"""
    result = {}
    pos = 0
    prev_fid = 0

    # 跳过 REPLY 消息头
    # 格式: 0x82, type_byte, seq_id(varint), method_name(string), ...
    pos += 2  # 0x82, version|type
    _, pos = read_varint(data, pos)  # seq_id
    method, pos = read_string(data, pos)  # method name

    while pos < len(data):
        b = data[pos]; pos += 1
        if b == 0:  # STOP
            break
        ftype = b & 0x0f
        delta = (b >> 4) & 0x0f
        if delta == 0:
            fid = struct.unpack('<h', data[pos:pos+2])[0]; pos += 2
        else:
            fid = prev_fid + delta
        prev_fid = fid

        if ftype == 8:   # BINARY/string
            v, pos = read_string(data, pos)
        elif ftype == 5: # I32
            v, pos = read_i32(data, pos)
        elif ftype == 6: # I64
            v, pos = read_i64(data, pos)
        elif ftype == 12: # STRUCT — skip (简化处理)
            # 跳过嵌套结构体
            while True:
                sb = data[pos]; pos += 1
                if sb == 0: break
                sftype = sb & 0x0f
                sdelta = (sb >> 4) & 0x0f
                if sdelta == 0: pos += 2
                if sftype == 8:
                    slen, pos = read_varint(data, pos); pos += slen
                elif sftype in (5, 6):
                    _, pos = read_varint(data, pos)
            v = "(struct)"
        else:
            break

        field_map = {
            1: "access_token", 2: "is_new_user", 3: "email",
            4: "public_key", 5: "last_device", 6: "unique_id",
            7: "phone", 8: "force_bind_phone", 9: "role_new",
            10: "role", 11: "game_mode"
        }
        if fid in field_map:
            result[field_map[fid]] = v

    return result

def login_with_phone(phone: str, verify_code: str, device_id: str = "aabbccdd1234abcd") -> dict:
    """使用手机号+验证码登录，返回包含 access_token 的字典"""
    cookie = make_cookie_pre_login(device_id)

    # 构建 PhoneVerifyCodeRequest (struct)
    vcr = b''
    vcr += field_str(1, 0) + encode_string(phone)         # field 1: phone
    vcr += field_str(2, 1) + encode_string(verify_code)   # field 2: verify_code
    vcr += b'\x00'  # STOP

    # 构建 PhoneLoginRequest (struct)
    plr = b''
    # field 1: verify_code_request (STRUCT, type=12)
    plr += bytes([(1 << 4) | 12]) + vcr
    # field 3: device (STRING, type=8)，delta=2
    plr += bytes([(2 << 4) | 8]) + encode_string(device_id)
    plr += b'\x00'  # STOP

    # 构建外层 args：field 1 = PhoneLoginRequest (STRUCT)
    args = bytes([(1 << 4) | 12]) + plr

    resp = call_api("login_with_phone", args, cookie)
    result = parse_user_login_result(resp)
    print(f"登录成功！access_token={result.get('access_token')}, unique_id={result.get('unique_id')}")
    return result

# ========== 完整流程 ==========
DEVICE_ID = "aabbccdd1234abcd"
PHONE = "13800138000"

# 步骤 1：发送短信
send_sms_verify_code(PHONE, DEVICE_ID)

# 步骤 2：等待用户输入验证码
code = input("请输入收到的验证码：")

# 步骤 3：登录
user_info = login_with_phone(PHONE, code, DEVICE_ID)
ACCESS_TOKEN = user_info["access_token"]
print(f"后续请求使用：access_token={ACCESS_TOKEN}")
```

<details>
<summary>查看响应示例：</summary>

```
# TCompact 二进制响应解码后的逻辑值：
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
    "is_new_user": 0,
    "email": "",
    "public_key": "MIGf...",
    "last_device": "aabbccdd1234abcd",
    "unique_id": 123456789,
    "phone": "13800138000",
    "force_bind_phone": 0,
    "role_new": 1,
    "game_mode": 0
}
```

</details>

---

## 方式二：账号密码登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/login/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**请求参数（Thrift Args → BczLoginRequest）：**

来源：`BczLoginRequest.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `account` | string | **必须** | `"13800138000"` | 账号，可以是手机号或邮箱 |
| 2 | `password` | string | **必须** | `"MyPassword123"` | 密码（明文，依赖 HTTPS 保护） |
| 3 | `device` | string | **必须** | `"aabbccdd1234abcd"` | 设备 ID（android_id） |
| 4 | `code` | string | 可选 | `""` | 邀请码（注册时使用） |

**返回值：** `UserLoginResult`（同上，含 `access_token`）

**Python 代码：**

```python
def login_with_password(account: str, password: str, device_id: str = "aabbccdd1234abcd") -> dict:
    """使用账号密码登录"""
    cookie = make_cookie_pre_login(device_id)

    args = b''
    args += field_str(1, 0) + encode_string(account)     # field 1: account
    args += field_str(2, 1) + encode_string(password)    # field 2: password
    args += field_str(3, 2) + encode_string(device_id)   # field 3: device

    resp = call_api("login", args, cookie)
    return parse_user_login_result(resp)

# 使用示例
user_info = login_with_password("13800138000", "MyPassword123")
ACCESS_TOKEN = user_info["access_token"]
```

---

## 方式三：游客登录 have_a_try

游客模式：无需手机号，直接登录获取临时 access_token。适用于不想注册的用户体验阶段。

> `POST https://passport.baicizhan.com/rpc/unified_user_service/have_a_try/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**请求参数：** 无参数（空 args）

**返回值：** `UserLoginResult`（含临时 `access_token`）

> 另有 `have_a_try_v2` 和 `have_a_try_v3` 接口，语义相同，调用方式一致。

**Python 代码：**

```python
def have_a_try(device_id: str = "aabbccdd1234abcd") -> dict:
    """游客登录，无需手机号"""
    cookie = make_cookie_pre_login(device_id)
    # 无参数，直接发送空 args
    resp = call_api("have_a_try", b'', cookie)
    return parse_user_login_result(resp)

# 使用示例
guest_info = have_a_try()
print(f"游客 access_token: {guest_info.get('access_token')}")
print(f"游客 unique_id: {guest_info.get('unique_id')}")
```

<details>
<summary>查看响应示例：</summary>

```
{
    "access_token": "guest_token_xxxxxxxx",
    "is_new_user": 1,
    "unique_id": 987654321,
    "force_bind_phone": 1,
    "role_new": 0
}
```

注意：游客账号 `force_bind_phone=1` 表示需要绑定手机号才能解锁全部功能。

</details>

---

## 方式四：第三方登录（微信/QQ）

> `POST https://passport.baicizhan.com/rpc/unified_user_service/third_party_login/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**流程：**

```
① 调用微信/QQ SDK 获取 OAuth token
        ↓ 得到 uid、nickname、avatar、access_token（第三方的）
② 调用 third_party_login 接口
        ↓ 返回 UserLoginResult（含 BCZ 的 access_token）
```

**请求参数（Thrift Args → ThirdPartyLoginRequest）：**

来源：`ThirdPartyLoginRequest.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `provider` | string | **必须** | `"wechat"` / `"qq"` | 第三方平台标识 |
| 2 | `uid` | string | **必须** | `"wx_openid_xxxx"` | 第三方平台的用户 ID |
| 3 | `nickname` | string | **必须** | `"张三"` | 用户昵称（来自第三方） |
| 4 | `image_url` | string | 可选 | `"https://..."` | 头像 URL（来自第三方） |
| 5 | `gender` | string | 可选 | `"1"` | 性别（"1"=男，"2"=女） |
| 6 | `api_token` | string | **必须** | `"wx_access_token_xxx"` | 第三方平台的 access_token |
| 7 | `token_expire` | string | 可选 | `"7200"` | token 过期时间（秒） |
| 8 | `device` | string | **必须** | `"aabbccdd1234abcd"` | 设备 ID |
| 9 | `unionid` | string | 可选 | `"wx_unionid_xxx"` | 微信 UnionID（跨应用统一 ID） |
| 10 | `openid` | string | 可选 | `"wx_openid_xxx"` | 微信 OpenID |
| 11 | `code` | string | 可选 | `"wx_auth_code"` | OAuth 授权码（可替代 api_token） |

**`provider` 枚举值：**

| 值 | 平台 |
|----|------|
| `"wechat"` | 微信 |
| `"qq"` | QQ |
| `"weibo"` | 微博 |

**返回值：** `UserLoginResult`（同上，含 BCZ `access_token`）

**Python 代码：**

```python
def third_party_login(provider: str, uid: str, nickname: str, api_token: str,
                      image_url: str = "", device_id: str = "aabbccdd1234abcd",
                      unionid: str = "", openid: str = "") -> dict:
    """第三方平台（微信/QQ）登录"""
    cookie = make_cookie_pre_login(device_id)

    args = b''
    args += field_str(1, 0) + encode_string(provider)    # field 1: provider
    args += field_str(2, 1) + encode_string(uid)          # field 2: uid
    args += field_str(3, 2) + encode_string(nickname)     # field 3: nickname
    if image_url:
        args += field_str(4, 3) + encode_string(image_url)   # field 4: image_url (delta=1)
    args += field_str(6, 4) + encode_string(api_token)    # field 6: api_token (delta=2 if no image)
    args += field_str(8, 6) + encode_string(device_id)    # field 8: device (delta=2)
    if unionid:
        args += field_str(9, 8) + encode_string(unionid)  # field 9: unionid
    if openid:
        args += field_str(10, 9) + encode_string(openid)  # field 10: openid

    resp = call_api("third_party_login", args, cookie)
    return parse_user_login_result(resp)
```

> **注意：** 调用此接口前需先通过微信/QQ SDK 完成 OAuth 授权，拿到 `access_token`（即 `api_token`）和 `openid`/`uid`。BCZ 服务端会用这些信息向微信/QQ 服务器验证身份。

---

## 方式五：Apple 登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/apple_login/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**流程（iOS）：**

```
① 调用 Apple Sign In SDK，获取 identityToken 和 authorizationCode
② 调用 apple_login 接口，传入上述 token
③ 返回 UserLoginResult
```

**请求参数（Thrift Args → AppleLoginRequest）：**

来源：`AppleLoginRequest.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `user` | string | **必须** | `"000000.abc123...def.0000"` | Apple 用户唯一标识符（User Identifier） |
| 2 | `identity_token` | string | **必须** | `"eyJr..."` | Apple JWT Identity Token（Base64） |
| 3 | `authorization_code` | string | **必须** | `"c12345.0.rrx..."` | Apple OAuth 授权码 |
| 4 | `name` | string | 可选 | `"张三"` | 用户姓名（仅首次授权时 Apple 提供） |
| 5 | `device` | string | **必须** | `"aabbccdd1234abcd"` | 设备 ID |
| 6 | `bundle_id` | string | **必须** | `"com.baicizhan.app"` | App Bundle ID |

**返回值：** `UserLoginResult`（含 BCZ `access_token`）

**Python 代码：**

```python
def apple_login(user: str, identity_token: str, authorization_code: str,
                device_id: str = "aabbccdd1234abcd", name: str = "",
                bundle_id: str = "com.baicizhan.app") -> dict:
    """Apple ID 登录"""
    cookie = make_cookie_pre_login(device_id)

    args = b''
    args += field_str(1, 0) + encode_string(user)                  # field 1: user
    args += field_str(2, 1) + encode_string(identity_token)        # field 2: identity_token
    args += field_str(3, 2) + encode_string(authorization_code)    # field 3: authorization_code
    if name:
        args += field_str(4, 3) + encode_string(name)              # field 4: name
    args += field_str(5, 4) + encode_string(device_id)             # field 5: device
    args += field_str(6, 5) + encode_string(bundle_id)             # field 6: bundle_id

    resp = call_api("apple_login", args, cookie)
    return parse_user_login_result(resp)
```

---

## 方式六：Google 登录

> `POST https://passport.baicizhan.com/rpc/unified_user_service/google_login/{timestamp_ms}`

*请求方式：POST*

**认证方式：** 不需要 access_token

**流程（Android）：**

```
① 调用 Google Sign-In SDK，获取 idToken（JWT）
② 调用 google_login 接口
③ 返回 UserLoginResult
```

**请求参数（Thrift Args）：**

来源：`UnifiedUserService.java`（async 方法中 `idToken` 参数，字段 1）

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `id_token` | string | **必须** | `"eyJh..."` | Google Sign-In JWT ID Token |

**返回值：** `UserLoginResult`（含 BCZ `access_token`）

**Python 代码：**

```python
def google_login(id_token: str, device_id: str = "aabbccdd1234abcd") -> dict:
    """Google 账号登录"""
    cookie = make_cookie_pre_login(device_id)

    args = b''
    args += field_str(1, 0) + encode_string(id_token)  # field 1: id_token

    resp = call_api("google_login", args, cookie)
    return parse_user_login_result(resp)
```

---

## 登录后：access_token 使用说明

成功登录后，从 `UserLoginResult.access_token` 提取令牌，在后续所有请求的 Cookie 中携带：

```python
def make_cookie_with_token(access_token: str, device_id: str = "aabbccdd1234abcd") -> str:
    """登录后的 Cookie，包含 access_token"""
    ts = int(time.time())
    serial = device_id[:5] + device_id[-5:] + time.strftime("%d%H%M%S")
    return (
        f"device_name=android%2FPixel6-Google; "
        f"version=14; "
        f"app_name=7081400; "
        f"channel=official; "
        f"client_time={ts}; "
        f"device_id={device_id}; "
        f"serial={serial}; "
        f"time_zone=Asia%2FShanghai; "
        f"access_token={access_token}"
    )

# 例：后续调用学习 API
def get_study_home(access_token: str, device_id: str = "aabbccdd1234abcd"):
    cookie = make_cookie_with_token(access_token, device_id)
    url = f"https://learn.baicizhan.com/rpc/user_study/get_study_home_v2/{int(time.time()*1000)}"
    r = requests.post(url, data=build_call("get_study_home_v2", b''),
                      headers={'Content-Type': 'application/x-thrift', 'Cookie': cookie})
    return r.content[4:]
```

**access_token 有效期：** 根据逆向分析，令牌长期有效（无自动过期），但账号退出或密码修改后会失效。可通过 `check_access_token` 接口验证：

```python
def check_access_token(access_token: str, device_id: str = "aabbccdd1234abcd") -> bool:
    """验证 access_token 是否有效，返回 True/False"""
    cookie = make_cookie_with_token(access_token, device_id)
    args = field_str(1, 0) + encode_string(access_token)
    resp = call_api("check_access_token", args, cookie)
    # 解析返回的 bool 值
    pos = 2
    _, pos = read_varint(resp, pos)
    _, pos = read_string(resp, pos)
    # 读取字段头
    b = resp[pos]; ftype = b & 0x0f
    if ftype == 1:  # BOOLEAN_TRUE
        return True
    elif ftype == 2:  # BOOLEAN_FALSE
        return False
    return False
```

---

## 异常说明

所有登录接口失败时返回 Thrift 异常，分两种：

| 异常类型 | Thrift 字段 ID | 说明 |
|----------|---------------|------|
| `LogicException` | 1 | 业务逻辑错误（账号不存在、验证码错误等） |
| `SystemException` | 2 | 系统级错误（服务不可用等） |

**Python 异常解析：**

```python
def check_exception(resp: bytes) -> str:
    """检查响应中是否包含异常，返回错误信息或空字符串"""
    try:
        pos = 0
        pos += 2  # magic + type
        _, pos = read_varint(resp, pos)  # seq_id
        method, pos = read_string(resp, pos)  # method name

        b = resp[pos]; pos += 1
        if b == 0: return ""  # STOP = 正常返回

        ftype = b & 0x0f
        delta = (b >> 4) & 0x0f
        if delta == 0: pos += 2  # full field id
        # fid = 1 = LogicException / fid = 2 = SystemException

        if ftype == 12:  # STRUCT
            # 读取异常 struct 里的 message 字段
            while pos < len(resp):
                sb = resp[pos]; pos += 1
                if sb == 0: break
                sftype = sb & 0x0f
                sdelta = (sb >> 4) & 0x0f
                if sdelta == 0: pos += 2
                if sftype == 8:
                    slen, pos = read_varint(resp, pos)
                    return resp[pos:pos + slen].decode('utf-8')
    except Exception:
        pass
    return ""
```

---

## 相关文档

- [docs/thrift_client.md](thrift_client.md) — Python TCompact 客户端完整实现
- [docs/unified_user_service.md](unified_user_service.md) — UnifiedUserService 全部 45 个接口
- [docs/flow_study.md](flow_study.md) — 登录后的学习流程（选书→学习→打卡）
