# 百词斩 (BCZ) Android App API 文档

> 本文档基于 APK 版本 **7.8.14**（versionCode: 7081400）逆向分析整理，仅供网络安全研究目的。  
> 所有 API 采用 Apache Thrift 二进制协议（TCompactProtocol + TFramedTransport over HTTPS）。  
> 除 `PlaygroundApiService` 使用 REST/JSON 外，其余服务均使用 Thrift 协议。

---

## 快速开始

以下是使用短信验证码登录并获取 access_token 的最小示例：

```python
import time, struct, requests
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol

BASE_COOKIES = {
    "device_id":   "aabbccdd1234abcd",
    "app_name":    "7081400",
    "channel":     "official",
    "version":     "14",
    "client_time": str(int(time.time())),
    "time_zone":   "Asia/Shanghai",
    "serial":      "aabbb12345" + time.strftime("%d%H%M%S"),
    "device_name": "android/Pixel6-Google",
}

def thrift_call(host, service, method, write_fn, extra_cookies=None):
    url = f"https://{host}/rpc/{service}/{method}/{int(time.time()*1000)}"
    buf = TTransport.TMemoryBuffer()
    proto = TCompactProtocol.TCompactProtocol(buf)
    proto.writeMessageBegin(method, 1, 0)
    write_fn(proto)
    proto.writeMessageEnd()
    payload = buf.getvalue()
    body = struct.pack(">I", len(payload)) + payload
    cookies = {**BASE_COOKIES, **(extra_cookies or {})}
    r = requests.post(url, data=body, cookies=cookies,
                      headers={"Content-Type": "application/x-thrift"})
    rbuf = TTransport.TMemoryBuffer(r.content[4:])
    rproto = TCompactProtocol.TCompactProtocol(rbuf)
    rproto.readMessageBegin()
    return rproto

# 步骤1：发送短信验证码
def send_sms(phone: str):
    def write(p):
        p.writeStructBegin("send_sms_verify_code_args")
        p.writeFieldBegin("phone", 11, 1); p.writeString(phone.encode()); p.writeFieldEnd()
        p.writeFieldBegin("verify_type", 8, 2); p.writeI32(5); p.writeFieldEnd()
        p.writeFieldStop(); p.writeStructEnd()
    thrift_call("passport.baicizhan.com", "unified_user_service", "send_sms_verify_code", write)

# 步骤2：使用验证码登录，获取 access_token
# 详见 docs/login.md
send_sms("13800138000")
```

> 完整登录流程见 [docs/login.md](docs/login.md)

---

## 文档目录

### 基础文档（必读）

| 文档 | 说明 |
|------|------|
| [docs/thrift_client.md](docs/thrift_client.md) | ⭐ **必读！** Python Thrift 客户端完整实现，含 Cookie 构造、序列化、调用封装 |

### 流程文档

| 文档 | 说明 |
|------|------|
| [docs/login.md](docs/login.md) | 完整登录流程（短信/手机号登录、access_token 获取） |
| [docs/flow_study.md](docs/flow_study.md) | 完整学习流程（选书、开始学习、提交结果） |

### 服务文档

| 服务名 | 端点 | 方法数 | 主要用途 | 文档链接 |
|--------|------|--------|----------|----------|
| **UnifiedUserService** | `https://passport.baicizhan.com/rpc/unified_user_service` | 45 | 注册、登录、用户信息、第三方授权 | [📄 文档](docs/unified_user_service.md) |
| **UserStudyApiService** | `https://learn.baicizhan.com/rpc/user_study` | 82 | 学习计划、进度、打卡、词书选择 | [📄 文档](docs/user_study_api.md) |
| **ResourceService** | `https://resource.baicizhan.com/rpc/resource_api` | 18 | 单词详情、例句、音频、词书资源 | [📄 文档](docs/resource_api.md) |
| **GameApiService** | `https://game.baicizhan.com/rpc/game` | 27 | 单词游戏、排行榜、游戏奖励 | [📄 文档](docs/game_api.md) |
| **UserBookService** | `https://booklist.baicizhan.com/rpc/user_book` | 28 | 自建词书、OCR匹配、智能设备绑定 | [📄 文档](docs/user_book.md) |
| **BczSystemApiService** | `https://system.baicizhan.com/rpc/bcz_system` | 18 | 版本检查、功能开关、导航配置 | [📄 文档](docs/system_api.md) |
| **NotifyService** | `https://notify.baicizhan.com/rpc/notify` | 6 | 推送通知注册、消息拉取 | [📄 文档](docs/system_api.md) |
| **StrategyApiService** | `https://strategy.baicizhan.com/rpc/strategy` | 8 | 学习策略、记忆算法配置 | [📄 文档](docs/system_api.md) |
| **BczReportApiService** | `https://events.baicizhan.com/rpc/bcz_report` | 2 | 行为埋点上报 | [📄 文档](docs/system_api.md) |
| **AdvertiseApiService** | `https://advertise.baicizhan.com/rpc/advertise` | 26 | 开屏广告、首页横幅、个性化广告配置 | [📄 文档](docs/advertise_api.md) |
| **MallProxyService** | `https://learn.baicizhan.com/rpc/mall_proxy` | 7 | 商城收货地址管理、地区级联 | [📄 文档](docs/mall_avatar_pk.md#mallproxyservice商城地址管理) |
| **AvatarApiService** | `https://ip-avatar.baicizhan.com/rpc/avatar` | 4 | IP形象展示、旅行、奖励领取 | [📄 文档](docs/mall_avatar_pk.md#avatarapiserviceip-形象--旅行) |
| **PkApiService** | `https://pk.baicizhan.com/rpc/pk` | 2 | PK对战WebSocket地址获取 | [📄 文档](docs/mall_avatar_pk.md#pkapiservicepk-对战) |
| **UserAssistantApiService** | `https://assistant.baicizhan.com/rpc/assistant` | 9 | 探索页内容、积分、Beta权限、学习统计 | [📄 文档](docs/user_assistant_activity.md#userassistantapiservice用户助手) |
| **UserActivityApiService** | `https://activity.baicizhan.com/rpc/activity` | 3 | 单词导出活动、配额购买 | [📄 文档](docs/user_assistant_activity.md#useractivityapiservice活动--导出) |
| **CourseApiService** | `https://learn.baicizhan.com/rpc/course` | 9 | 词汇直播、课程反馈、UGC评论 | [📄 文档](docs/other_services.md#courseapiservice) |

---

## 通用请求格式

### URL 格式

```
https://{host}/rpc/{service_name}/{method_name}/{timestamp_ms}
```

### HTTP 请求

```
POST https://{host}/rpc/{service}/{method}/{ts}
Content-Type: application/x-thrift
Cookie: device_id=xxx; app_name=7081400; ...

Body: [4字节大端uint32: payload长度][TCompactProtocol编码的Thrift消息体]
```

### Cookie 字段说明

| Cookie 字段 | 示例值 | 必要性 | 说明 |
|-------------|--------|--------|------|
| `device_name` | `android/Pixel6-Google` | 必须 | `android/` + 设备型号-厂商（去空格） |
| `version` | `14` | 必须 | Android 系统版本号 |
| `app_name` | `7081400` | 必须 | App versionCode |
| `channel` | `official` | 必须 | 渠道号 |
| `client_time` | `1716000000` | 必须 | Unix 时间戳（秒） |
| `device_id` | `aabbccdd1234abcd` | 必须 | Android ID（16位hex） |
| `serial` | `aabbb1234516120530` | 必须 | device_id前5位+后5位+ddHHmmss |
| `time_zone` | `Asia/Shanghai` | 必须 | 时区ID |
| `access_token` | `xxxxxxxx` | 登录后必须 | 登录令牌，登录后携带 |

---

## 认证流程摘要

```
① 发送短信验证码
   send_sms_verify_code(phone, verify_type=5)
   → POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{ts}

② 使用验证码登录
   login_with_phone(PhoneLoginRequest{phone, code, ...})
   → POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{ts}
   ← UserLoginResult{ access_token, unique_id, ... }

③ 后续所有请求在 Cookie 中携带 access_token
```

详见 [docs/login.md](docs/login.md)

---

## 关键源码位置索引

| 功能 | 路径 |
|------|------|
| Thrift 服务路径注册 | `com/baicizhan/client/business/thrift/c.java` |
| 服务端地址配置 | `com/baicizhan/client/business/thrift/h.java` |
| Cookie 构建逻辑 | `com/baicizhan/client/business/thrift/b.java` |
| URL 构建（含时间戳） | `com/baicizhan/client/business/thrift/a.java` |
| TFramedTransport 实现 | `com/baicizhan/client/business/thrift/j.java` |
| THttpClient 实现 | `com/baicizhan/client/business/thrift/k.java` |
| 登录流程调用入口 | `yg/y.java` |
| UnifiedUserService 接口定义 | `com/baicizhan/online/unified_user_service/UnifiedUserService.java` |

---

## 加密与安全说明

| 项目 | 说明 |
|------|------|
| **传输加密** | HTTPS TLS，无额外加密 |
| **数据签名** | 无独立签名字段，依赖 Thrift 二进制序列化 |
| **防重放** | URL 末尾附带毫秒时间戳 |
| **设备绑定** | Cookie 中 `device_id` + `serial` 组合指纹 |
| **AES 加密** | 仅联通免密登录（UAID）模块使用，与常规登录无关 |
