# BCZ 学习流程完整指南

> 本文档基于 APK 版本 7.8.14 逆向分析，描述从登录到打卡的完整学习工作流。  
> 相关文档：[thrift_client.md](thrift_client.md)、[unified_user_service.md](unified_user_service.md)、[user_study_api.md](user_study_api.md)

---

## 一、流程总览

```
┌─────────────────────────────────────────────────────────────────┐
│                      百词斩学习完整流程                          │
└─────────────────────────────────────────────────────────────────┘

  passport.baicizhan.com                  learn.baicizhan.com
  ────────────────────                    ───────────────────
  ① send_sms_verify_code    →  发送短信验证码
  ② login_with_phone        →  手机号+验证码登录  →  获得 access_token
                                                         │
  ③                              get_study_home_v2  ←───┘  查询当前学习状态
                                       │
                                       ▼
  ④                              select_book            选择/切换词书
                                       │
                                       ▼
  ⑤                              get_word_list_status   获取词表状态列表
                                       │
                                       ▼
  ⑥                              roadmap_by_word_level_v2  获取学习路线图
                                       │
                                  ┌────┘
                                  │  循环学习每组单词
                                  ▼
  ⑦                              update_done_data       同步学习记录（核心）
                                  │
                                  └──► 全部完成？
                                              │ 是
                                              ▼
  ⑧                              user_daka_v2           每日打卡
```

---

## 二、环境准备

```python
"""
study_flow.py  —  百词斩学习流程端到端示例

依赖：
    pip install requests

前置：将 thrift_client.py 中的 CompactWriter / CompactReader /
      build_cookie / post_thrift / make_url / BczException 等工具类
      复制或 import 进来。
"""

import time
from bcz_thrift_client import (   # 或直接 copy 代码
    CompactWriter, CompactReader,
    TYPE_STOP, TYPE_I32, TYPE_I64, TYPE_BINARY, TYPE_BOOL_T, TYPE_BOOL_F,
    TYPE_LIST, TYPE_STRUCT,
    MSG_CALL,
    build_cookie, post_thrift, make_url, BczException,
    framed_decode, check_response, parse_user_login_result,
)

# ── 服务端点 ──────────────────────────────────
PASSPORT_HOST = "https://passport.baicizhan.com"
LEARN_HOST    = "https://learn.baicizhan.com"
USER_SVC      = "unified_user_service"
STUDY_SVC     = "user_study"

DEVICE_ID = "aabbccdd1234abcd"   # 替换为真实 Android ID
```

---

## 三、步骤一：用户登录

### 3.1 方法说明

登录分两步：先通过 `send_sms_verify_code` 发送短信，再通过 `login_with_phone` 验证。  
完整流程详见 [login.md](login.md)，此处仅展示代码。

### 3.2 API 参考

**send_sms_verify_code**

> `POST https://passport.baicizhan.com/rpc/unified_user_service/send_sms_verify_code/{timestamp_ms}`

| 字段名 | 类型 | 说明 | 必要性 |
|--------|------|------|--------|
| `phone` | string | 手机号 | 必须 |
| `verify_type` | i32 | 验证码类型（5=登录/注册） | 必须 |

**login_with_phone**

> `POST https://passport.baicizhan.com/rpc/unified_user_service/login_with_phone/{timestamp_ms}`

| 字段名 | 类型 | 说明 | 必要性 |
|--------|------|------|--------|
| `verify_code_request.phone` | string | 手机号 | 必须 |
| `verify_code_request.verify_code` | string | 短信验证码 | 必须 |
| `device` | string | Android ID | 建议 |

### 3.3 Python 代码

```python
def step1_send_sms(phone: str, cookie: str):
    """发送短信验证码（verify_type=5 表示登录/注册）。"""
    from bcz_thrift_client import CompactWriter, MSG_CALL, TYPE_BINARY, TYPE_I32

    w = CompactWriter()
    w.write_message_begin("send_sms_verify_code", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_BINARY, 1); w.write_string(phone)
    w.write_field_begin(TYPE_I32, 2);   w.write_i32(5)   # LOGIN_OR_REG
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(PASSPORT_HOST, USER_SVC, "send_sms_verify_code")
    post_thrift(url, w.getvalue(), cookie)
    print(f"✓ 验证码已发送至 {phone}")


def step1_login(phone: str, verify_code: str, cookie: str) -> dict:
    """使用手机号+验证码登录，返回 UserLoginResult 字典。"""
    w = CompactWriter()
    w.write_message_begin("login_with_phone", MSG_CALL, 0)
    w.write_struct_begin()                         # login_with_phone_args

    w.write_field_begin(TYPE_STRUCT, 1)            # field 1: PhoneLoginRequest
    w.write_struct_begin()

    w.write_field_begin(TYPE_STRUCT, 1)            # .field 1: PhoneVerifyCodeRequest
    w.write_struct_begin()
    w.write_field_begin(TYPE_BINARY, 1); w.write_string(phone)
    w.write_field_begin(TYPE_BINARY, 2); w.write_string(verify_code)
    w.write_field_stop()
    w.write_struct_end()                           # end PhoneVerifyCodeRequest

    w.write_field_begin(TYPE_BINARY, 3); w.write_string(DEVICE_ID)  # .field 3: device
    w.write_field_stop()
    w.write_struct_end()                           # end PhoneLoginRequest

    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(PASSPORT_HOST, USER_SVC, "login_with_phone")
    raw = post_thrift(url, w.getvalue(), cookie)
    return parse_user_login_result(raw)


# ── 使用示例 ──────────────────────────────────
cookie = build_cookie(device_id=DEVICE_ID)
step1_send_sms("13812345678", cookie)
code = input("请输入收到的验证码：")
login_result = step1_login("13812345678", code, cookie)
access_token = login_result["access_token"]
print(f"✓ 登录成功！access_token = {access_token[:20]}...")
print(f"  unique_id = {login_result['unique_id']}")

# 更新 cookie 加入 access_token
auth_cookie = build_cookie(device_id=DEVICE_ID, access_token=access_token)
```

### 3.4 从响应中提取

| 字段 | 用途 |
|------|------|
| `access_token` | **最重要**：后续所有请求的认证 Cookie |
| `unique_id` | 用户 ID（i64），部分接口需要 |
| `is_new_user` | 判断是否需要引导新用户流程 |

---

## 四、步骤二：获取学习首页状态

### 4.1 方法说明

`get_study_home_v2` 返回用户当前词书、今日学习计划、完成情况等概览信息。

### 4.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/get_study_home_v2/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 当前词书 ID | 必须 | 传 0 获取默认词书状态 |

**返回值 `StudyHomeV2` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `book_id` | i32 | 当前词书 ID | — |
| `today_new_count` | i32 | 今日新学数 | — |
| `today_review_count` | i32 | 今日复习数 | — |
| `today_done_count` | i32 | 今日已完成 | — |
| `daily_plan_count` | i32 | 每日计划量 | — |
| `total_learned` | i32 | 累计已学单词数 | — |

### 4.3 Python 代码

```python
def step2_get_study_home(book_id: int, cookie: str) -> dict:
    """获取学习首页状态。"""
    w = CompactWriter()
    w.write_message_begin("get_study_home_v2", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_I32, 1); w.write_i32(book_id)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "get_study_home_v2")
    raw = post_thrift(url, w.getvalue(), cookie)

    # 解析 StudyHomeV2
    r = CompactReader(raw)
    check_response(r, "get_study_home_v2")
    home = {}
    r.read_struct_begin()  # reply wrapper
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
                if ft2 == TYPE_I32:
                    home[fid2] = r.read_i32()
                elif ft2 == TYPE_I64:
                    home[fid2] = r.read_i64()
                else:
                    r.skip(ft2)
            r.read_struct_end()
        else:
            r.skip(ft)
    r.read_struct_end()
    return home


# 使用示例
home_info = step2_get_study_home(book_id=0, cookie=auth_cookie)
print(f"当前词书 ID: {home_info.get(1)}")
print(f"今日计划: {home_info.get(3)} 个单词")
print(f"今日已完成: {home_info.get(4)} 个")
```

---

## 五、步骤三：选择词书

### 5.1 方法说明

`select_book` 用于切换词书或设置学习计划参数（每日新学量、每日复习量等）。

### 5.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/select_book/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必须 | 参见词书列表 |
| `daily_plan_count` | i32 | 每日新学单词数 | 必须 | 推荐 10~50 |
| `review_plan_count` | i32 | 每日复习单词数 | 必须 | 通常为新学的 2~3 倍 |
| `mode` | i32 | 学习模式 | 必须 | 0=标准，1=快速 |
| `group_count` | i32 | 每组单词数 | 必须 | 通常 10 |

**返回值 `UserSelectedBookInfo` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `book_id` | i32 | 选中词书 ID | — |
| `daily_plan_count` | i32 | 实际设置的每日计划量 | 服务端可能修正 |
| `word_level_id` | i32 | 当前词表 ID | 用于后续接口 |

### 5.3 Python 代码

```python
def step3_select_book(book_id: int, daily: int, review: int,
                      mode: int, group: int, cookie: str) -> dict:
    """选择词书并设置学习计划。"""
    w = CompactWriter()
    w.write_message_begin("select_book", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_I32, 1); w.write_i32(book_id)
    w.write_field_begin(TYPE_I32, 2); w.write_i32(daily)
    w.write_field_begin(TYPE_I32, 3); w.write_i32(review)
    w.write_field_begin(TYPE_I32, 4); w.write_i32(mode)
    w.write_field_begin(TYPE_I32, 5); w.write_i32(group)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "select_book")
    raw = post_thrift(url, w.getvalue(), cookie)

    r = CompactReader(raw)
    check_response(r, "select_book")
    result = {}
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
                if ft2 == TYPE_I32:
                    result[fid2] = r.read_i32()
                else:
                    r.skip(ft2)
            r.read_struct_end()
        else:
            r.skip(ft)
    r.read_struct_end()
    return result


# 选择四级真题词书（示例 book_id=2）
book_result = step3_select_book(
    book_id=2, daily=20, review=40, mode=0, group=10,
    cookie=auth_cookie
)
print(f"✓ 已选词书 {book_result.get(1)}，word_level_id={book_result.get(3)}")
```

---

## 六、步骤四：获取词表状态

### 6.1 方法说明

`get_word_list_status` 返回当前词书各词表的学习状态（已学/未学/需复习等），用于确定接下来要学习的词表。

### 6.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/get_word_list_status/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必须 | — |

**返回值 `List<WordListItem>` 元素字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] word_level_id` | i32 | 词表 ID | — |
| `[2] status` | i32 | 词表状态 | 0=未学, 1=学习中, 2=已完成 |
| `[3] total_count` | i32 | 总单词数 | — |
| `[4] done_count` | i32 | 已完成单词数 | — |
| `[5] name` | string | 词表名称 | — |

### 6.3 Python 代码

```python
def step4_get_word_list_status(book_id: int, cookie: str) -> list:
    """获取词表状态列表。"""
    w = CompactWriter()
    w.write_message_begin("get_word_list_status", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_I32, 1); w.write_i32(book_id)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "get_word_list_status")
    raw = post_thrift(url, w.getvalue(), cookie)

    r = CompactReader(raw)
    check_response(r, "get_word_list_status")
    items = []
    r.read_struct_begin()
    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid == 0 and ft == TYPE_LIST:
            elem_type, size = r.read_list_begin()
            for _ in range(size):
                item = {}
                r.read_struct_begin()
                while True:
                    ft2, fid2 = r.read_field_begin()
                    if ft2 == TYPE_STOP:
                        break
                    if fid2 == 1 and ft2 == TYPE_I32:
                        item["word_level_id"] = r.read_i32()
                    elif fid2 == 2 and ft2 == TYPE_I32:
                        item["status"] = r.read_i32()
                    elif fid2 == 3 and ft2 == TYPE_I32:
                        item["total_count"] = r.read_i32()
                    elif fid2 == 4 and ft2 == TYPE_I32:
                        item["done_count"] = r.read_i32()
                    elif fid2 == 5 and ft2 == TYPE_BINARY:
                        item["name"] = r.read_string()
                    else:
                        r.skip(ft2)
                r.read_struct_end()
                items.append(item)
        else:
            r.skip(ft)
    r.read_struct_end()
    return items


word_lists = step4_get_word_list_status(book_id=2, cookie=auth_cookie)
for wl in word_lists:
    print(f"  词表 {wl['word_level_id']}: {wl.get('name','?')} "
          f"[{wl.get('done_count',0)}/{wl.get('total_count',0)}]")
```

---

## 七、步骤五：获取学习路线图

### 7.1 方法说明

`roadmap_by_word_level_v2` 返回词书的学习路线图，包含每个词表的详细信息和学习顺序，用于确定今日学习内容。

### 7.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/roadmap_by_word_level_v2/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `book_id` | i32 | 词书 ID | 必须 | — |

**返回值 `List<UserRoadMapElementV2>` 元素字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] word_level_id` | i32 | 词表 ID | — |
| `[2] is_current` | i32 | 是否当前学习中（1=是） | — |
| `[3] new_count` | i32 | 今日新学数 | — |
| `[4] review_count` | i32 | 今日复习数 | — |
| `[5] topic_ids` | list\<i32\> | 今日待学单词 ID 列表 | — |
| `[6] review_topic_ids` | list\<i32\> | 今日待复习单词 ID 列表 | — |

### 7.3 Python 代码

```python
def step5_get_roadmap(book_id: int, cookie: str) -> list:
    """获取学习路线图，提取今日学习的 topic_ids。"""
    w = CompactWriter()
    w.write_message_begin("roadmap_by_word_level_v2", MSG_CALL, 0)
    w.write_struct_begin()
    w.write_field_begin(TYPE_I32, 1); w.write_i32(book_id)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "roadmap_by_word_level_v2")
    raw = post_thrift(url, w.getvalue(), cookie)

    r = CompactReader(raw)
    check_response(r, "roadmap_by_word_level_v2")
    elements = []
    r.read_struct_begin()
    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid == 0 and ft == TYPE_LIST:
            elem_type, size = r.read_list_begin()
            for _ in range(size):
                el = {}
                r.read_struct_begin()
                while True:
                    ft2, fid2 = r.read_field_begin()
                    if ft2 == TYPE_STOP:
                        break
                    if fid2 == 1 and ft2 == TYPE_I32:
                        el["word_level_id"] = r.read_i32()
                    elif fid2 == 2 and ft2 == TYPE_I32:
                        el["is_current"] = r.read_i32()
                    elif fid2 == 3 and ft2 == TYPE_I32:
                        el["new_count"] = r.read_i32()
                    elif fid2 == 4 and ft2 == TYPE_I32:
                        el["review_count"] = r.read_i32()
                    elif fid2 in (5, 6) and ft2 == TYPE_LIST:
                        et2, sz2 = r.read_list_begin()
                        ids = [r.read_i32() for _ in range(sz2)]
                        key = "topic_ids" if fid2 == 5 else "review_topic_ids"
                        el[key] = ids
                    else:
                        r.skip(ft2)
                r.read_struct_end()
                elements.append(el)
        else:
            r.skip(ft)
    r.read_struct_end()
    return elements


roadmap = step5_get_roadmap(book_id=2, cookie=auth_cookie)
current = next((e for e in roadmap if e.get("is_current") == 1), None)
if current:
    print(f"当前词表: {current['word_level_id']}")
    print(f"今日新学 {current.get('new_count',0)} 个，复习 {current.get('review_count',0)} 个")
    topic_ids = current.get("topic_ids", [])
    print(f"待学单词 IDs: {topic_ids[:5]}...")  # 取前5个展示
```

---

## 八、步骤六：同步学习记录（核心接口）

### 8.1 方法说明

`update_done_data` 是最重要的接口，用于将本地学习结果同步到服务器。每完成一组学习（通常 10 个单词）后调用一次。

### 8.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/update_done_data/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数（Thrift Args）：**

| 字段名 | 类型 | 内容 | 必要性 | 备注 |
|--------|------|------|--------|------|
| `last_sync_at` | i64 | 上次同步时间戳（毫秒） | 必须 | 首次传 0 |
| `arr_done_records` | list\<UserDoneWordRecord\> | 学习完成单词记录列表 | 必须 | 见下方结构 |
| `current_word_level_id` | i32 | 当前词表 ID | 必须 | 从路线图获取 |
| `is_today_completed` | bool | 今日学习是否已全部完成 | 必须 | 最后一批传 true |

**UserDoneWordRecord 结构体字段：**

| 字段名 | 字段 ID | 类型 | 内容 | 必要性 | 备注 |
|--------|---------|------|------|--------|------|
| `word_topic_id` | 1 | i32 | 单词 ID | **必须** | 来自路线图 topic_ids |
| `current_score` | 2 | i32 | 当前掌握分数 | 必须 | 0~100，答对 100，答错 0 |
| `span_days` | 3 | i32 | 距上次学习的天数 | 必须 | 新单词传 0 |
| `used_time` | 4 | i32 | 学习耗时（毫秒） | 必须 | 如 3000（3秒） |
| `done_times` | 5 | i32 | 已学次数 | 必须 | 首次为 1 |
| `wrong_times` | 6 | i32 | 答错次数 | 必须 | 0 或正整数 |
| `is_first_do_at_today` | 7 | i32 | 今天是否第一次学 | 必须 | 0=否，1=是 |
| `tag_id` | 8 | i32 | 词表标签 ID | 必须 | 来自 word_level_id |
| `spell_score` | 9 | i32 | 拼写分数 | 可选 | 0~100，未测试传 0 |
| `listening_score` | 10 | i32 | 听力分数 | 可选 | 0~100，未测试传 0 |
| `chn_score` | 11 | i32 | 中文分数 | 可选 | 0~100，未测试传 0 |
| `review_round` | 12 | i32 | 复习轮次 | 可选 | 0=初学，1=第一轮复习 |

**返回值：**

| 类型 | 内容 |
|------|------|
| i32 | 同步状态码（0=成功） |

### 8.3 Python 代码

```python
def build_done_record(w: CompactWriter, record: dict):
    """
    将单个 UserDoneWordRecord 编码进 CompactWriter。

    record 字段说明（均为 int）：
        word_topic_id, current_score, span_days, used_time,
        done_times, wrong_times, is_first_do_at_today, tag_id,
        spell_score(可选), listening_score(可选), chn_score(可选), review_round(可选)
    """
    w.write_struct_begin()
    fields = [
        (1,  record.get("word_topic_id", 0)),
        (2,  record.get("current_score", 100)),
        (3,  record.get("span_days", 0)),
        (4,  record.get("used_time", 3000)),
        (5,  record.get("done_times", 1)),
        (6,  record.get("wrong_times", 0)),
        (7,  record.get("is_first_do_at_today", 1)),
        (8,  record.get("tag_id", 0)),
        (9,  record.get("spell_score", 0)),
        (10, record.get("listening_score", 0)),
        (11, record.get("chn_score", 0)),
        (12, record.get("review_round", 0)),
    ]
    for fid, val in fields:
        w.write_field_begin(TYPE_I32, fid)
        w.write_i32(val)
    w.write_field_stop()
    w.write_struct_end()


def step6_update_done_data(
    last_sync_at: int,
    records: list,
    word_level_id: int,
    is_completed: bool,
    cookie: str,
) -> int:
    """
    同步学习记录到服务器。

    参数：
        last_sync_at   上次同步时间戳（毫秒），首次传 0
        records        UserDoneWordRecord 字典列表
        word_level_id  当前词表 ID
        is_completed   今日是否全部学完
    返回：
        int 状态码
    """
    w = CompactWriter()
    w.write_message_begin("update_done_data", MSG_CALL, 0)
    w.write_struct_begin()                                   # update_done_data_args

    # field 1: last_sync_at (i64)
    w.write_field_begin(TYPE_I64, 1)
    w.write_i64(last_sync_at)

    # field 2: arr_done_records (list<UserDoneWordRecord>)
    w.write_field_begin(TYPE_LIST, 2)
    w.write_list_begin(TYPE_STRUCT, len(records))
    for rec in records:
        build_done_record(w, rec)

    # field 3: current_word_level_id (i32)
    w.write_field_begin(TYPE_I32, 3)
    w.write_i32(word_level_id)

    # field 4: is_today_completed (bool)
    w.write_bool(4, is_completed)

    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "update_done_data")
    raw = post_thrift(url, w.getvalue(), cookie)

    # 解析返回值 i32
    r = CompactReader(raw)
    check_response(r, "update_done_data")
    status = 0
    r.read_struct_begin()
    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid == 0 and ft == TYPE_I32:
            status = r.read_i32()
        else:
            r.skip(ft)
    r.read_struct_end()
    return status


# ── 使用示例：模拟学习 10 个单词后同步 ─────────────
topic_ids = [10001, 10002, 10003, 10004, 10005,
             10006, 10007, 10008, 10009, 10010]  # 来自路线图
word_level_id = 101  # 来自路线图

records = []
for tid in topic_ids:
    records.append({
        "word_topic_id":       tid,
        "current_score":       100,    # 全部答对
        "span_days":           0,      # 新单词
        "used_time":           4000,   # 4秒每词
        "done_times":          1,
        "wrong_times":         0,
        "is_first_do_at_today": 1,
        "tag_id":              word_level_id,
        "spell_score":         0,
        "listening_score":     0,
        "chn_score":           0,
        "review_round":        0,
    })

last_sync = int(time.time() * 1000)
status = step6_update_done_data(
    last_sync_at=0,
    records=records,
    word_level_id=word_level_id,
    is_completed=True,
    cookie=auth_cookie,
)
print(f"✓ 学习记录同步完成，状态码: {status}")
```

---

## 九、步骤七：每日打卡

### 9.1 方法说明

`user_daka_v2` 在完成今日学习后调用，记录打卡信息并返回打卡分享卡片数据。  
**必须在 `update_done_data` 成功后才调用。**

### 9.2 API 参考

> `POST https://learn.baicizhan.com/rpc/user_study/user_daka_v2/{timestamp_ms}`

*请求方式：POST*  
*认证方式：Cookie 需携带 `access_token`*

**请求参数 `UserDakaRequest` 字段：**

| 字段名 | 字段 ID | 类型 | 内容 | 必要性 | 备注 |
|--------|---------|------|------|--------|------|
| `book_id` | 1 | i32 | 词书 ID | 必须 | — |
| `count` | 2 | i32 | 今日学习单词数 | 必须 | — |
| `daka_dates` | 3 | list\<UserDakaDate\> | 打卡日期列表 | 必须 | 见下方结构 |
| `timezone` | 4 | string | 时区标识 | 必须 | 如 `"Asia/Shanghai"` |
| `client_date` | 5 | i32 | 客户端日期 | 必须 | yyyyMMdd 格式，如 20241201 |
| `poster_topic_ids` | 6 | list\<UserDakaTopic\> | 打卡海报单词 | 可选 | 可传空列表 |

**UserDakaDate 结构体字段：**

| 字段名 | 字段 ID | 类型 | 内容 | 必要性 | 备注 |
|--------|---------|------|------|--------|------|
| `year` | 1 | i32 | 年份 | 必须 | 如 2024 |
| `month` | 2 | i32 | 月份 | 必须 | 1~12 |
| `day` | 3 | i32 | 日期 | 必须 | 1~31 |
| `timestamp` | 4 | i64 | 当天 0 时 Unix 时间戳（秒） | 必须 | — |

**返回值 `UserDakaShareInfo` 主要字段：**

| 字段 | 类型 | 内容 | 备注 |
|------|------|------|------|
| `[1] streak_days` | i32 | 连续打卡天数 | — |
| `[2] total_daka_days` | i32 | 累计打卡天数 | — |
| `[3] today_count` | i32 | 今日学词数 | — |
| `[4] share_url` | string | 分享链接 | — |

### 9.3 Python 代码

```python
import datetime as dt


def step7_user_daka(book_id: int, count: int, cookie: str) -> dict:
    """
    每日打卡。

    参数：
        book_id  词书 ID
        count    今日学习的单词总数
    返回：
        UserDakaShareInfo 字典
    """
    now = dt.datetime.now()
    # 当天 0:00:00 的时间戳
    day_start = dt.datetime(now.year, now.month, now.day)
    day_ts = int(day_start.timestamp())
    client_date = int(now.strftime("%Y%m%d"))

    w = CompactWriter()
    w.write_message_begin("user_daka_v2", MSG_CALL, 0)
    w.write_struct_begin()                               # update_done_data_args → UserDakaRequest

    # field 1: book_id (i32)
    w.write_field_begin(TYPE_I32, 1); w.write_i32(book_id)

    # field 2: count (i32)
    w.write_field_begin(TYPE_I32, 2); w.write_i32(count)

    # field 3: daka_dates (list<UserDakaDate>)
    w.write_field_begin(TYPE_LIST, 3)
    w.write_list_begin(TYPE_STRUCT, 1)           # 今天一条
    w.write_struct_begin()                       # UserDakaDate
    w.write_field_begin(TYPE_I32, 1); w.write_i32(now.year)
    w.write_field_begin(TYPE_I32, 2); w.write_i32(now.month)
    w.write_field_begin(TYPE_I32, 3); w.write_i32(now.day)
    w.write_field_begin(TYPE_I64, 4); w.write_i64(day_ts)
    w.write_field_stop()
    w.write_struct_end()                         # end UserDakaDate

    # field 4: timezone (string)
    w.write_field_begin(TYPE_BINARY, 4); w.write_string("Asia/Shanghai")

    # field 5: client_date (i32)
    w.write_field_begin(TYPE_I32, 5); w.write_i32(client_date)

    # field 6: poster_topic_ids (list<UserDakaTopic>) — 传空列表
    w.write_field_begin(TYPE_LIST, 6)
    w.write_list_begin(TYPE_STRUCT, 0)

    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()

    url = make_url(LEARN_HOST, STUDY_SVC, "user_daka_v2")
    raw = post_thrift(url, w.getvalue(), cookie)

    r = CompactReader(raw)
    check_response(r, "user_daka_v2")
    result = {}
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
                if ft2 == TYPE_I32:
                    result[fid2] = r.read_i32()
                elif ft2 == TYPE_BINARY:
                    result[fid2] = r.read_string()
                elif ft2 == TYPE_I64:
                    result[fid2] = r.read_i64()
                else:
                    r.skip(ft2)
            r.read_struct_end()
        else:
            r.skip(ft)
    r.read_struct_end()
    return result


# 使用示例
daka_result = step7_user_daka(book_id=2, count=len(topic_ids), cookie=auth_cookie)
print(f"✓ 打卡成功！连续打卡 {daka_result.get(1, 0)} 天")
print(f"  累计打卡: {daka_result.get(2, 0)} 天")
print(f"  今日学词: {daka_result.get(3, 0)} 个")
```

---

## 十、完整流程串联示例

```python
"""
完整学习流程示例（无人工干预版，适合自动打卡脚本）。
注：此脚本使用 have_a_try 游客登录，适合测试。
"""

import time, datetime as dt
from bcz_thrift_client import *   # 引入所有工具函数

DEVICE_ID = "aabbccdd1234abcd"
BOOK_ID   = 2   # 替换为实际词书 ID

# ① 游客登录（测试用；生产环境替换为 login_with_phone）
cookie = build_cookie(device_id=DEVICE_ID)
w = CompactWriter()
w.write_message_begin("have_a_try", MSG_CALL, 0)
w.write_struct_begin(); w.write_field_stop(); w.write_struct_end()
w.write_message_end()
raw = post_thrift(make_url(PASSPORT_HOST, USER_SVC, "have_a_try"), w.getvalue(), cookie)
login = parse_user_login_result(raw)
auth_cookie = build_cookie(device_id=DEVICE_ID, access_token=login["access_token"])
print(f"① 登录: unique_id={login['unique_id']}")

# ② 查询学习首页
home = step2_get_study_home(BOOK_ID, auth_cookie)
print(f"② 首页: book_id={home.get(1)}, 今日计划={home.get(3)}")

# ③ 选择词书（已选则跳过）
book = step3_select_book(BOOK_ID, 20, 40, 0, 10, auth_cookie)
word_level_id = book.get(3, 0)
print(f"③ 选书: word_level_id={word_level_id}")

# ④ 获取词表状态
word_lists = step4_get_word_list_status(BOOK_ID, auth_cookie)
print(f"④ 词表数量: {len(word_lists)}")

# ⑤ 获取路线图
roadmap = step5_get_roadmap(BOOK_ID, auth_cookie)
current_el = next((e for e in roadmap if e.get("is_current") == 1), None)
topic_ids = current_el.get("topic_ids", []) if current_el else []
word_level_id = current_el.get("word_level_id", word_level_id) if current_el else word_level_id
print(f"⑤ 今日待学 {len(topic_ids)} 个单词")

# ⑥ 模拟学习并同步
if topic_ids:
    records = [{
        "word_topic_id": tid, "current_score": 100, "span_days": 0,
        "used_time": 3500, "done_times": 1, "wrong_times": 0,
        "is_first_do_at_today": 1, "tag_id": word_level_id,
    } for tid in topic_ids]
    status = step6_update_done_data(0, records, word_level_id, True, auth_cookie)
    print(f"⑥ 同步完成，状态: {status}")

# ⑦ 打卡
daka = step7_user_daka(BOOK_ID, len(topic_ids), auth_cookie)
print(f"⑦ 打卡！连续 {daka.get(1,0)} 天 🎉")
```

---

## 十一、注意事项与最佳实践

### 11.1 最小必填字段

进行 `update_done_data` 时，以下字段为服务端验证**必须字段**，缺少会导致 400 错误或数据异常：

| 字段 | 原因 |
|------|------|
| `word_topic_id` | 标识具体单词，缺少无法记录 |
| `current_score` | 影响下次复习间隔计算 |
| `tag_id` | 关联到词表，用于进度统计 |
| `is_first_do_at_today` | 影响今日计划完成统计 |
| `current_word_level_id`（参数层） | 确定更新哪个词表的进度 |

### 11.2 时间戳处理

```python
# last_sync_at：传入上次调用 update_done_data 的时间戳（毫秒）
# 首次调用传 0，后续传上次的时间戳
last_sync_at = 0   # 或 int(time.time() * 1000)

# client_date：yyyyMMdd 格式整数
client_date = int(datetime.now().strftime("%Y%m%d"))  # 如 20241201

# UserDakaDate.timestamp：当天 0:00:00 的 Unix 秒时间戳
from datetime import datetime
today = datetime.now().replace(hour=0, minute=0, second=0, microsecond=0)
day_ts = int(today.timestamp())
```

### 11.3 防频率限制

- 相邻两次请求间隔建议 ≥ 500ms
- `send_sms_verify_code` 每分钟最多 1 次
- 自动化脚本中每步骤之间建议 `time.sleep(1)`

### 11.4 access_token 有效期

- 长期有效，但换设备或主动退出会失效
- 收到 `BczException(code=2001)` 时需重新登录
