# bcz-api — 百词斩 Python SDK

[![Python 3.8+](https://img.shields.io/badge/python-3.8+-blue.svg)](https://www.python.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A production-ready Python SDK for the 百词斩 (BCZ / Baicizhan) mobile app API.

> 百词斩 App 的纯 Python SDK，无需 thrift 库，仅依赖 `requests`。

---

## Features / 特性

- **No Thrift dependency** — pure hand-written TCompactProtocol encoder/decoder
  （无需安装 thrift 库，纯 Python 实现 TCompact 协议编解码）
- **Auto-auth** — login methods auto-store `access_token` for subsequent calls
  （登录后自动保存令牌，后续调用无需手动传入）
- **Synchronous API** — simple blocking calls, easy to integrate
  （同步 API，简单易用）
- **Full service coverage** — 10+ services, 200+ methods
  （覆盖全部主要服务，200+ 个接口方法）
- **Type hints** — Python 3.8+ compatible type annotations throughout
  （全量 Python 3.8+ 类型注解）

---

## Installation / 安装

```bash
pip install requests        # only dependency
pip install bcz-api         # or install this package
```

Or directly from source:

```bash
git clone https://github.com/9xhk-1/bcz-source.git
cd bcz-source/sdk/python/bcz-api
pip install -e .
```

---

## Quick Start / 快速开始

```python
from bcz import Bcz

# 1. 创建客户端 / Create client
bcz = Bcz()

# 2. 发送短信验证码 / Send SMS verification code
bcz.send_sms("13912345678")

# 3. 登录（自动保存 token）/ Login (auto-stores token)
result = bcz.login("13912345678", "1234")
print(result["access_token"])
print(result["unique_id"])

# 4. 使用需要登录的接口 / Use authenticated APIs
profile = bcz.get_profile()
print(profile["nickname"])

# 5. 查词 / Look up a word
word_info = bcz.get_word("apple")
print(word_info)

# 6. 搜索单词 / Search words
results = bcz.search_word("abandon")
for r in results:
    print(r)
```

---

## Login Flow / 登录流程

### SMS code login / 短信验证码登录

```python
from bcz import Bcz

bcz = Bcz()
bcz.send_sms("13912345678")          # 发送验证码
bcz.login("13912345678", "6-digit code")  # 登录
```

### Password login / 账号密码登录

```python
bcz.login_with_password("myaccount@qq.com", "mypassword")
```

### Guest login / 游客登录

```python
bcz.login_as_guest()
```

### Third-party login / 第三方登录

```python
# WeChat / 微信
bcz.login_with_third_party("wechat", openid, access_token)

# Apple
bcz.login_with_apple(identity_token, authorization_code)

# Google
bcz.login_with_google(id_token)
```

### Use an existing token / 使用已有 token

```python
bcz = Bcz()
bcz.set_access_token("your_access_token", unique_id=12345678)
```

---

## Common Use Cases / 常用场景

### Study / 学习

```python
bcz.get_study_home()                    # 学习首页
bcz.get_book_list()                     # 词书列表
bcz.select_book(1)                      # 选择词书
bcz.study.get_today_words()             # 今日单词
bcz.study.update_study_plan(20, 30)     # 更新学习计划
bcz.study.get_streak_info()             # 连续学习信息
```

### Dictionary / 词典

```python
bcz.get_word("ephemeral")              # 查词
bcz.search_word("temp")               # 搜索
bcz.translate("Hello world")          # 翻译
bcz.resource.get_dict_wiki_by_word("apple")  # Wiki 词条
```

### Game mode / 游戏模式

```python
bcz.game.home()
bcz.game.start_round(book_id=1, chapter=1)
bcz.game.finish_round("round_id", score=100, correct_count=10, total_count=10)
```

### Profile & social / 资料与社交

```python
bcz.get_profile()
bcz.user.update_profile(nickname="新昵称")
bcz.user.get_follower_list()
bcz.user.follow_user(12345678)
```

### System checks / 系统检查

```python
bcz.system.check_new_version()
bcz.system.get_switches()
bcz.advertise.get_launch_ad()
```

---

## Service Accessors / 服务访问器

Each service can be accessed via a named property on the `Bcz` object:

| Property | Service | Host |
|---|---|---|
| `bcz.user` | UnifiedUserService | passport.baicizhan.com |
| `bcz.study` | UserStudyApiService | learn.baicizhan.com |
| `bcz.resource` | ResourceService | resource.baicizhan.com |
| `bcz.game` | GameApiService | game.baicizhan.com |
| `bcz.book` | UserBookService | booklist.baicizhan.com |
| `bcz.system` | BczSystemApiService | system.baicizhan.com |
| `bcz.notify` | NotifyService | notify.baicizhan.com |
| `bcz.strategy` | StrategyApiService | strategy.baicizhan.com |
| `bcz.report` | BczReportApiService | events.baicizhan.com |
| `bcz.advertise` | AdvertiseApiService | advertise.baicizhan.com |
| `bcz.mall` | MallProxyService | learn.baicizhan.com |
| `bcz.avatar` | AvatarApiService | ip-avatar.baicizhan.com |
| `bcz.pk` | PkApiService | pk.baicizhan.com |
| `bcz.assistant` | UserAssistantApiService | assistant.baicizhan.com |
| `bcz.activity` | UserActivityApiService | activity.baicizhan.com |
| `bcz.course` | CourseApiService | learn.baicizhan.com |

---

## Error Handling / 错误处理

```python
from bcz import Bcz, BczAuthError, BczApiError, BczTransportError

bcz = Bcz()
try:
    bcz.get_profile()
except BczAuthError as e:
    print("Not logged in:", e)
except BczApiError as e:
    print(f"API error [{e.code}]: {e.message}")
except BczTransportError as e:
    print("Network error:", e)
```

---

## Architecture / 架构说明

```
bcz/
├── __init__.py        — public exports (Bcz, exceptions)
├── client.py          — Bcz facade (convenience methods + service accessors)
├── _protocol.py       — TCompactProtocol encoder/decoder (no thrift dependency)
├── _transport.py      — HTTP transport (TFramedTransport over HTTPS)
├── _session.py        — Session/auth state (BczSession)
├── _exceptions.py     — BczException hierarchy
└── services/
    ├── _base.py       — _BaseService + generic parsers
    ├── user.py        — UnifiedUserService
    ├── study.py       — UserStudyApiService
    ├── resource.py    — ResourceService
    ├── game.py        — GameApiService
    ├── book.py        — UserBookService
    ├── system.py      — BczSystemApiService + Notify + Strategy + Report
    ├── advertise.py   — AdvertiseApiService
    ├── mall.py        — MallProxyService + AvatarApiService + PkApiService
    ├── assistant.py   — UserAssistantApiService + UserActivityApiService
    └── course.py      — CourseApiService
```

Protocol: Apache Thrift TCompactProtocol over HTTPS with TFramedTransport.
All serialisation is implemented from scratch in `_protocol.py`.

---

## Thread Safety / 线程安全

Each `Bcz` instance is **not thread-safe** because `BczSession` holds mutable
auth state. For concurrent use, create one `Bcz` instance per thread.

每个 `Bcz` 实例非线程安全，多线程场景请每个线程使用独立实例。

---

## License / 许可证

MIT
