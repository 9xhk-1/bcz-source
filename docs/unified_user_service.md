# UnifiedUserService — 用户认证与账号管理

> 逆向来源：`com/baicizhan/online/unified_user_service/UnifiedUserService.java`（APK 7.8.14）

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
| **认证** | Cookie（见主文档通用请求头说明） |

---

## 二、方法一览

| 方法名 | 参数 | 返回类型 | 说明 |
|--------|------|----------|------|
| `send_sms_verify_code` | `phone: String, verify_type: int` | `void` | 发送短信验证码 |
| `login_with_phone` | `request: PhoneLoginRequest` | `UserLoginResult` | 手机号验证码登录 |
| `have_a_try` | — | `UserLoginResult` | 游客体验（匿名登录） |
| `have_a_try_v2` | — | `UserTryResult` | 游客体验 v2 |
| `have_a_try_v3` | — | `UserTryResultForWatch` | 游客体验 v3（Watch端） |
| `register_user` | `param: BczLoginRequest` | `UserLoginResult` | 注册用户 |
| `bcz_login` | `param: BczLoginRequest` | `UserLoginResult` | 账号密码登录 |
| `bcz_bind_try_user` | `param: BczLoginRequest` | `UserLoginResult` | 绑定游客账号 |
| `apple_login` | `request: AppleLoginRequest` | `UserLoginResult` | Apple 账号登录 |
| `google_login` | `idToken: String` | `UserLoginResult` | Google 账号登录 |
| `third_party_login` | `param: ThirdPartyLoginRequest` | `UserLoginResult` | 第三方账号登录（微信/QQ等） |
| `third_party_bind_try_user` | `param: ThirdPartyLoginRequest` | `UserLoginResult` | 绑定第三方到游客账号 |
| `check_access_token` | `device: String` | `AccessTokenCheckResult` | 验证 access_token 有效性 |
| `watch_poll_login` | `watch_uuid: String` | `String` | Watch 轮询登录，返回 access_token |
| `scan_for_watch_login` | `watch_uuid: String` | `void` | 扫码授权 Watch 登录 |
| `get_profile` | — | `UserProfile` | 获取用户资料 |
| `update_profile` | `gender_id: int, nickname: String` | `void` | 更新用户资料 |
| `update_nickname` | `nickname: String` | `void` | 更新昵称 |
| `update_gender` | `gender_id: int` | `void` | 更新性别 |
| `update_birthday` | `birthday: long` | `void` | 更新生日（时间戳） |
| `update_role` | `rule_id: int` | `void` | 更新用户角色 |
| `update_role_extra` | `role_up: int, grade: int` | `String` | 更新角色附加信息 |
| `post_select_role_action_config` | `role: int` | `String` | 提交角色选择行为配置 |
| `update_position` | `position_code: int` | `void` | 更新所在地 |
| `get_position_list` | — | `List<Position>` | 获取地区列表 |
| `update_school` | `param: SchoolInfoRequest` | `void` | 更新学校信息 |
| `search_school` | `param: SearchSchoolRequest` | `SearchSchoolResult` | 搜索学校 |
| `search_major` | `param: SchoolMajorRequest` | `SchoolMajorResult` | 搜索专业 |
| `report_school` | `school_name: String, type: int` | `void` | 上报学校信息 |
| `save_user_ext_info` | `ext_info: UserExtInfo` | `int` | 保存用户扩展信息 |
| `bind_phone` | `phone: String, code: String, password: String` | `void` | 绑定手机号（含密码） |
| `bind_phone_v2` | `phone: String, code: String` | `void` | 绑定手机号 v2 |
| `bind_phone_v3` | `request: PhoneLoginRequest` | `BindPhoneResult` | 绑定手机号 v3 |
| `rebind_phone` | `oldphone: String, newphone: String, code: String, password: String` | `void` | 重新绑定手机号 |
| `check_verify_code_for_old_phone` | `phone: String, verify_code: String` | `void` | 验证旧手机验证码 |
| `send_email_verify_code` | `email: String, verify_type: int` | `void` | 发送邮箱验证码 |
| `get_bind_info` | — | `List<UserBindInfo>` | 获取账号绑定信息 |
| `unbind_third_party` | `provider: String, openid: String, unionid: String` | `void` | 解绑第三方账号 |
| `get_third_party_user_info` | — | `ThirdPartyUserInfo` | 获取第三方账号信息 |
| `reset_password` | `account: String, password: String, code: String` | `void` | 重置密码 |
| `delete_account` | `account: String` | `void` | 注销账号 |
| `send_captcha` | `account: String, action: SendCaptchaAction` | `boolean` | 发送验证码 |
| `mock_send_captcha` | `account: String, action: SendCaptchaAction` | `String` | 模拟发送验证码（测试用） |
| `get_img_captcha` | `action: SendCaptchaAction` | `ImgCaptcha` | 获取图形验证码 |
| `verify_img_captcha` | `answer: String, trace_id: String, captcha: String, action: SendCaptchaAction` | `boolean` | 验证图形验证码 |

---

## 三、核心流程：短信验证码登录

详见 [login.md](login.md)，快速参考如下：

### 3.1 发送验证码

```
POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{timestamp_ms}
Content-Type: application/x-thrift
Cookie: device_name=...; version=14; app_name=7081400; ...
```

**请求参数（Thrift）：**

| 字段 ID | 字段名 | 类型 | 示例 | 说明 |
|---------|--------|------|------|------|
| 1 | `phone` | string | `"13812345678"` | 手机号 |
| 2 | `verify_type` | i32 | `5` | 验证码类型（LOGIN=5，REGISTER=1） |

**`verify_type` 枚举：**

| 值 | 含义 |
|----|------|
| `1` | 注册 |
| `5` | 登录/注册 |
| `6` | 安全验证 |
| `7` | 新绑定 |

**响应：** `void`（成功则短信发送，失败抛出 LogicException/SystemException）

---

### 3.2 验证码登录

```
POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{timestamp_ms}
```

**请求结构（PhoneLoginRequest）：**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `verify_code_request` | PhoneVerifyCodeRequest | 手机号+验证码 |
| 3 | `device` | string | android_id（设备唯一ID） |

**PhoneVerifyCodeRequest：**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `phone` | string | 手机号 |
| 2 | `verify_code` | string | 短信验证码 |

**响应（UserLoginResult）：**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `access_token` | string | **Session ID / 登录令牌** |
| 2 | `is_new_user` | i32 | 是否新用户（1=是） |
| 3 | `email` | string | 绑定邮箱 |
| 4 | `public_key` | string | 公钥 |
| 5 | `last_device` | string | 上次登录设备 |
| 6 | `unique_id` | i64 | 用户唯一ID |
| 7 | `phone` | string | 手机号 |
| 8 | `force_bind_phone` | i32 | 是否强制绑手机 |
| 9 | `role_new` | i32 | 角色新版字段 |
| 10 | `role` | RoleInfo | 角色信息 |
| 11 | `game_mode` | i32 | 游戏模式 |

---

## 四、游客登录

```
POST https://passport.baicizhan.com/rpc/unified_user_service/have_a_try/{timestamp_ms}
```

无需参数，直接调用即可获得临时 `access_token`，可用于未登录状态下体验功能。

---

## 五、第三方登录

### Apple 登录

**方法：** `apple_login(AppleLoginRequest request)`

AppleLoginRequest 包含 Apple 授权信息（idToken 等）。

### Google 登录

**方法：** `google_login(String idToken)`

传入 Google 返回的 ID Token。

### 微信/QQ 等第三方

**方法：** `third_party_login(ThirdPartyLoginRequest param)`

ThirdPartyLoginRequest 包含 `provider`（提供商名称）、`openid`、`access_token`（第三方平台 token）等字段。

---

## 六、access_token 校验

**方法：** `check_access_token(String device)`

返回 `AccessTokenCheckResult`，用于验证当前 token 是否有效及绑定设备是否一致。

---

## 七、异常说明

所有方法均可能抛出：

| 异常类型 | 说明 |
|----------|------|
| `SystemException` | 系统级错误 |
| `LogicException` | 业务逻辑错误（如验证码错误、手机号已注册等） |
| `TException` | Thrift 传输/协议错误 |
