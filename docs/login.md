# 百词斩 App 验证码登录接口逆向文档

> 本文档为网络安全研究目的，基于 APK（版本 7.8.14，versionCode 7081400）逆向分析。

---

## 一、技术概述

| 项目 | 说明 |
|------|------|
| 协议 | Apache Thrift（非 REST/JSON） |
| 序列化格式 | **TCompactProtocol** |
| 传输层 | **TFramedTransport** over HTTP |
| HTTP 方法 | POST |
| Content-Type | `application/x-thrift` |
| 服务端点 | `https://passport.baicizhan.com/rpc/unified_user_service` |
| 备用端点 | `https://passport.bczeducation.cn/rpc/unified_user_service` |

---

## 二、HTTP 请求详解

### 2.1 URL 格式

```
https://passport.baicizhan.com/rpc/unified_user_service/{method_name}/{timestamp_ms}
```

- `{method_name}`：Thrift 方法名，如 `send_sms_verify_code`、`login_with_phone`
- `{timestamp_ms}`：当前时间毫秒时间戳（`System.currentTimeMillis()`）

示例：
```
https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/1716000000000
```

来源：`com.baicizhan.client.business.thrift.a#a(int, int)` — `String.format("%s%s/%s/%d", base_url, domain, method, ts_ms)`

### 2.2 请求头

| 头部 | 值 | 说明 |
|------|----|------|
| `Content-Type` | `application/x-thrift` | Thrift 二进制内容类型 |
| `Cookie` | 见下方 Cookie 详解 | 携带设备信息和鉴权 token |

### 2.3 Cookie 字段说明

Cookie 为 `key=URLEncoded(value)` 键值对，以 `; ` 分隔。

来源：`com.baicizhan.client.business.thrift.b` 类

| 字段 | 来源 / 示例值 | 说明 |
|------|--------------|------|
| `device_name` | `android/Pixel6-Google`（空格替换为空） | `android/` + `Build.MODEL + " - " + Build.MANUFACTURER`（去空格） |
| `version` | `14`（Android 版本） | `Build.VERSION.RELEASE`，Android 系统版本号 |
| `app_name` | `7081400` | App versionCode（整数字符串），来自 `PackageInfo.versionCode` |
| `channel` | `official` | 渠道号，从 APK Meta-data 获取 |
| `client_time` | `1716000000` | Unix 时间戳（秒），`System.currentTimeMillis() / 1000` |
| `device_id` | `aabbccdd1234abcd` | Android ID，`Settings.Secure.getString(resolver, "android_id")` |
| `serial` | `aabbb12345` + `16000000`（日期 ddHHmmss） | 前5位 device_id + 后5位 device_id + 当前时间 `ddHHmmss` 格式 |
| `time_zone` | `Asia/Shanghai` | `TimeZone.getDefault().getID()` |
| `access_token` | `xxxxxxxx`（登录后才有） | 登录成功后从 `UserLoginResult.access_token` 获得，未登录时不携带 |

Cookie 示例（URLDecoded 展示）：
```
device_name=android/Pixel6-Google; version=14; app_name=7081400; channel=official; client_time=1716000000; device_id=aabbccdd1234abcd; serial=aabbb1234516000000; time_zone=Asia/Shanghai
```

### 2.4 请求体格式（TFramedTransport + TCompactProtocol）

```
[4 字节大端 uint32: payload 长度][TCompact 编码的 Thrift 消息体]
```

来源：`com.baicizhan.client.business.thrift.j`（TFramedTransport）`flush()` 方法

---

## 三、登录流程（三步）

```
① 发送短信验证码（send_sms_verify_code）
       ↓
② 使用手机号 + 验证码登录（login_with_phone）
       ↓
③ 从响应中提取 access_token（即 Session ID）
```

---

## 四、接口一：发送短信验证码

### 4.1 Thrift 方法签名

```thrift
void send_sms_verify_code(1: string phone, 2: i32 verify_type)
```

来源：`UnifiedUserService.Iface.send_sms_verify_code(String phone, int verify_type)`

### 4.2 HTTP 请求

```
POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{timestamp_ms}
Content-Type: application/x-thrift
Cookie: device_name=...; version=...; app_name=7081400; channel=...; client_time=...; device_id=...; serial=...; time_zone=...
```

请求体：TFramedTransport + TCompactProtocol 编码如下消息：

| 项目 | 值 |
|------|----|
| Message 名称 | `send_sms_verify_code` |
| Message 类型 | `CALL (1)` |
| SeqId | `0` |

**Args 字段：**

| 字段 ID | 字段名 | Thrift 类型 | 示例值 | 说明 |
|---------|--------|-------------|--------|------|
| 1 | `phone` | string (type=11) | `"13812345678"` | 手机号 |
| 2 | `verify_type` | i32 (type=8) | `5` | 验证码类型：LOGIN=5，REGISTER=1 |

**`verify_type` 枚举值（来源：`SmsCaptcha` 枚举类）：**

| SmsCaptcha 枚举 | verify_type 值 | 含义 |
|-----------------|---------------|------|
| `LOGIN_OR_REG` | `5` | **登录/注册**（常用） |
| `SECURITY_VERIFICATION` | `6` | 安全验证 |
| `NEW_BINDING` | `7` | 新绑定 |

### 4.3 响应

成功：HTTP 200，响应体为 TFramedTransport + TCompactProtocol 编码，void 返回（无内容字段）。

失败：通过 `LogicException` / `SystemException` Thrift 异常返回。

---

## 五、接口二：验证码登录

### 5.1 Thrift 方法签名

```thrift
UserLoginResult login_with_phone(1: PhoneLoginRequest request)

struct PhoneLoginRequest {
    1: optional PhoneVerifyCodeRequest verify_code_request,
    2: optional PhoneFreeVerifyRequest free_verify_request,
    3: optional string device,
}

struct PhoneVerifyCodeRequest {
    1: required string phone,
    2: required string verify_code,
}
```

来源：`yg.y#N(...)` 方法中的实际调用逻辑

### 5.2 HTTP 请求

```
POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{timestamp_ms}
Content-Type: application/x-thrift
Cookie: device_name=...; version=...; app_name=7081400; channel=...; client_time=...; device_id=...; serial=...; time_zone=...
```

请求体：TFramedTransport + TCompactProtocol 编码如下消息：

| 项目 | 值 |
|------|----|
| Message 名称 | `login_with_phone` |
| Message 类型 | `CALL (1)` |
| SeqId | `0` |

**Args → PhoneLoginRequest 字段：**

| 字段 ID | 字段名 | Thrift 类型 | 示例值 | 说明 |
|---------|--------|-------------|--------|------|
| 1 | `verify_code_request` | struct (type=12) | 见下 | 手机号+验证码结构体 |
| 3 | `device` | string (type=11) | `"aabbccdd1234abcd"` | 设备唯一ID（android_id） |

**PhoneVerifyCodeRequest 字段（嵌套在 field 1）：**

| 字段 ID | 字段名 | Thrift 类型 | 示例值 | 说明 |
|---------|--------|-------------|--------|------|
| 1 | `phone` | string (type=11) | `"13812345678"` | 手机号 |
| 2 | `verify_code` | string (type=11) | `"123456"` | 短信验证码 |

### 5.3 响应：UserLoginResult

成功后，服务端返回 TFramedTransport + TCompactProtocol 编码的 `UserLoginResult`：

| 字段 ID | 字段名 | Thrift 类型 | 说明 |
|---------|--------|-------------|------|
| 1 | `access_token` | string | **Session ID / 登录令牌**（后续请求放 Cookie） |
| 2 | `is_new_user` | i32 | 是否为新用户（1=是） |
| 3 | `email` | string | 绑定邮箱 |
| 4 | `public_key` | string | 公钥 |
| 5 | `last_device` | string | 上次登录设备 |
| 6 | `unique_id` | i64 | 用户唯一 ID |
| 7 | `phone` | string | 手机号 |
| 8 | `force_bind_phone` | i32 | 是否强制绑手机 |
| 9 | `role_new` | i32 | 角色新版字段 |
| 10 | `role` | struct RoleInfo | 角色信息 |
| 11 | `game_mode` | i32 | 游戏模式 |

**获取 Session ID：** 从 `UserLoginResult.access_token` 字段取值，后续请求在 Cookie 中携带 `access_token={value}`。

---

## 六、签名与加密说明

| 项目 | 说明 |
|------|------|
| 数据签名 | **无独立签名字段**，通过 Thrift TCompactProtocol 序列化后以二进制形式传输，不含 HMAC/RSA 签名 |
| 数据加密 | **无传输层额外加密**（仅 HTTPS TLS），Thrift 二进制本身非对称加密 |
| 防重放 | URL 末尾附带毫秒时间戳（`/send_sms_verify_code/1716000000000`），服务端可通过时间戳校验 |
| 设备绑定 | Cookie 中 `device_id`（Android ID）+ `serial` 用于设备识别 |
| AES 加密 | 仅用于中国联通免密登录（UAID）模块（`f1.java`），与短信验证码登录无关 |

---

## 七、完整登录流程示意

```
1. 构造 Cookie 头（device_name, version, app_name, channel, client_time, device_id, serial, time_zone）
2. POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{ts}
   Body: TFramed + TCompact{ send_sms_verify_code(phone="138xxxx", verify_type=5) }
   → 服务端向手机发送短信，返回 void

3. 用户输入收到的 6 位验证码

4. POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{ts}
   Body: TFramed + TCompact{ login_with_phone(PhoneLoginRequest{
       verify_code_request: { phone="138xxxx", verify_code="123456" },
       device: "android_id"
   }) }
   → 返回 UserLoginResult{ access_token="eyJ...", unique_id=123456789, ... }

5. 后续请求在 Cookie 中添加 access_token={value} 即为已登录状态
```

---

## 八、关键源码位置参考

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
| PhoneLoginRequest 结构 | `com/baicizhan/online/unified_user_service/PhoneLoginRequest.java` |
| UserLoginResult 结构 | `com/baicizhan/online/unified_user_service/UserLoginResult.java` |
