# 百词斩 (BCZ) App API 文档

> 本文档基于 APK 版本 **7.8.14**（versionCode: 7081400）逆向分析整理，仅供网络安全研究目的。

<p align="center">
  <b>百词斩 Android App 全量 API 接口文档</b>
</p>

---

## 协议说明

| 项目 | 说明 |
|------|------|
| **协议** | Apache Thrift |
| **序列化格式** | TCompactProtocol |
| **传输层** | TFramedTransport over HTTPS |
| **HTTP 方法** | POST |
| **Content-Type** | `application/x-thrift` |
| **URL 格式** | `https://{host}/rpc/{service}/{method}/{timestamp_ms}` |

> 仅 `PlaygroundApiService` 使用 Retrofit REST 协议，其余所有服务均使用 Thrift 二进制协议。

---

## 通用请求头

所有 Thrift 请求均需携带以下 Cookie：

| Cookie 字段 | 示例值 | 说明 |
|-------------|--------|------|
| `device_name` | `android/Pixel6-Google` | `android/` + 设备型号-厂商（去空格） |
| `version` | `14` | Android 系统版本号 |
| `app_name` | `7081400` | App versionCode |
| `channel` | `official` | 渠道号 |
| `client_time` | `1716000000` | Unix 时间戳（秒） |
| `device_id` | `aabbccdd1234abcd` | Android ID |
| `serial` | `aabbb1234516000000` | 设备序列号（device_id前5位+后5位+ddHHmmss） |
| `time_zone` | `Asia/Shanghai` | 时区 |
| `access_token` | `xxxxxxxx` | 登录令牌（登录后携带） |

---

## 请求体格式

```
[4字节大端uint32: payload长度][TCompactProtocol编码的Thrift消息体]
```

---

## 服务列表

| 服务 | 端点 | 备用端点 | 方法数 | 文档 |
|------|------|----------|--------|------|
| **UnifiedUserService** | `https://passport.baicizhan.com/rpc/unified_user_service` | `passport.bczeducation.cn` | 45 | [📄 文档](docs/unified_user_service.md) |
| **UserStudyApiService** | `https://learn.baicizhan.com/rpc/user_study` | `learn.bczeducation.cn` | 82 | [📄 文档](docs/user_study_api.md) |
| **ResourceService** | `https://resource.baicizhan.com/rpc/resource_api` | `resource.bczeducation.cn` | 18 | [📄 文档](docs/resource_api.md) |
| **GameApiService** | `https://game.baicizhan.com/rpc/game` | — | 27 | [📄 文档](docs/game_api.md) |
| **CourseApiService** | `https://learn.baicizhan.com/rpc/course` | `learn.bczeducation.cn` | 9 | [📄 文档](docs/other_services.md#courseapiservice) |
| **UserBookService** | `https://booklist.baicizhan.com/rpc/user_book` | `booklist.bczeducation.cn` | 28 | [📄 文档](docs/other_services.md#userbookservice) |
| **BczSystemApiService** | `https://system.baicizhan.com/rpc/bcz_system` | `system.bczeducation.cn` | 18 | [📄 文档](docs/other_services.md#bczsystemapiservice) |
| **AdvertiseApiService** | `https://advertise.baicizhan.com/rpc/advertise` | `advertise.bczeducation.cn` | 26 | [📄 文档](docs/other_services.md#advertiseapiservice) |
| **NotifyService** | `https://notify.baicizhan.com/rpc/notify` | `notify.bczeducation.cn` | 6 | [📄 文档](docs/other_services.md#notifyservice) |
| **StrategyApiService** | `https://strategy.baicizhan.com/rpc/strategy` | — | 8 | [📄 文档](docs/other_services.md#strategyapiservice) |
| **UserAssistantApiService** | `https://assistant.baicizhan.com/rpc/assistant` | `assistant.bczeducation.cn` | 9 | [📄 文档](docs/other_services.md#userassistantapiservice) |
| **MallProxyService** | `https://learn.baicizhan.com/rpc/mall/proxy` | — | 7 | [📄 文档](docs/other_services.md#mallproxyservice) |
| **AvatarApiService** | `https://ip-avatar.baicizhan.com/rpc/avatar` | — | 4 | [📄 文档](docs/other_services.md#avatarapiservice) |
| **PkApiService** | `https://pk.baicizhan.com/rpc/pk` | `pk.bczeducation.cn` | 2 | [📄 文档](docs/other_services.md#pkapiservice) |
| **UserActivityApiService** | `https://activity.baicizhan.com/rpc/activity` | `activity.bczeducation.cn` | 3 | [📄 文档](docs/other_services.md#useractivityapiservice) |
| **BczReportApiService** | `https://events.baicizhan.com/rpc/bcz_report` | `events.bczeducation.cn` | 2 | [📄 文档](docs/other_services.md#bczreportapiservice) |

> 另有 `docs/login.md` 提供登录流程的详细说明（含完整 Python 示例代码）。

---

## 认证流程

详见 [docs/login.md](docs/login.md)

```
① 发送短信验证码
   POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{ts}
   → send_sms_verify_code(phone, verify_type=5)

② 使用验证码登录
   POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{ts}
   → login_with_phone(PhoneLoginRequest)
   ← UserLoginResult{ access_token, unique_id, ... }

③ 后续请求在 Cookie 中携带 access_token
```

---

## 加密与安全说明

| 项目 | 说明 |
|------|------|
| **传输加密** | HTTPS TLS，无额外加密 |
| **数据签名** | 无独立签名字段，Thrift 二进制序列化 |
| **防重放** | URL 末尾附带毫秒时间戳 |
| **设备绑定** | Cookie 中 `device_id` + `serial` |
| **AES 加密** | 仅联通免密登录（UAID）模块使用，与常规登录无关 |

---

## 关键源码位置

| 功能 | 路径 |
|------|------|
| Thrift 服务路径注册 | `com/baicizhan/client/business/thrift/c.java` |
| 服务端地址配置 | `com/baicizhan/client/business/thrift/h.java` |
| Cookie 构建 | `com/baicizhan/client/business/thrift/b.java` |
| URL 构建 | `com/baicizhan/client/business/thrift/a.java` |
| TFramedTransport | `com/baicizhan/client/business/thrift/j.java` |
| THttpClient | `com/baicizhan/client/business/thrift/k.java` |
| 登录流程调用 | `yg/y.java` |
