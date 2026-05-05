# CourseApiService API 文档

> 逆向来源：APK 7.8.14 逆向分析，仅供网络安全研究目的。  
> 协议：Apache Thrift TCompactProtocol + TFramedTransport over HTTPS  
> Python 客户端基础实现见 [thrift_client.md](thrift_client.md)

**服务端点：** `https://learn.baicizhan.com/rpc/course`  
**备用端点：** `https://learn.bczeducation.cn/rpc/course`

> **其他服务文档：**
> - UserBookService → [user_book.md](user_book.md)
> - AdvertiseApiService → [advertise_api.md](advertise_api.md)
> - MallProxyService / AvatarApiService / PkApiService → [mall_avatar_pk.md](mall_avatar_pk.md)
> - UserAssistantApiService / UserActivityApiService → [user_assistant_activity.md](user_assistant_activity.md)
> - BczSystemApiService / NotifyService / StrategyApiService / BczReportApiService → [system_api.md](system_api.md)

---

## 接口概览

| 方法名 | 说明 |
|--------|------|
| [get_vocab_live_info](#get_vocab_live_info) | 获取词汇直播课程信息 |
| [polling_info](#polling_info) | 轮询直播课程最新状态 |
| [livedone](#livedone) | 标记直播课程已完成 |
| [get_mark_book_list](#get_mark_book_list) | 获取标记词书（收藏单词）列表 |
| [delete_mark_word](#delete_mark_word) | 从标记词书删除单词 |
| [get_improve_video_info](#get_improve_video_info) | 获取提升视频课程信息 |
| [submit_improve_chapter_done](#submit_improve_chapter_done) | 提交提升章节完成状态 |
| [feedback](#feedback) | 提交课程反馈答题 |
| [submitugc](#submitugc) | 提交用户评论（UGC） |

---

## 通用 Python 工具函数

以下辅助函数在本文档所有示例中使用：

```python
import struct, time, requests

COURSE_URL = "https://learn.baicizhan.com/rpc/course"

def make_cookie(access_token: str, device_id: str = "aabbccdd1234abcd") -> str:
    ts = int(time.time())
    serial = device_id[:5] + device_id[-5:] + time.strftime("%d%H%M%S")
    return (
        f"device_name=android%2FPixel6-Google; version=14; app_name=7081400; "
        f"channel=official; client_time={ts}; device_id={device_id}; "
        f"serial={serial}; time_zone=Asia%2FShanghai; access_token={access_token}"
    )

def varint(n):
    buf = b''
    while True:
        if n & ~0x7f == 0: buf += bytes([n]); break
        buf += bytes([(n & 0x7f) | 0x80]); n >>= 7
    return buf

def encode_string(s):
    b = s.encode('utf-8'); return varint(len(b)) + b

def encode_i32(n):
    n = (n << 1) ^ (n >> 31); return varint(n)

def encode_i64(n):
    n = (n << 1) ^ (n >> 63); return varint(n)

def fhdr(fid, prev, ftype):
    """字段头：delta 编码"""
    d = fid - prev
    if 1 <= d <= 15: return bytes([(d << 4) | ftype])
    return bytes([ftype]) + struct.pack('<h', fid)

def build_call(method, args, seq=0):
    hdr = b'\x82\x21' + varint(seq) + encode_string(method)
    body = hdr + args + b'\x00'
    return struct.pack('>I', len(body)) + body

def call_course(method, args, access_token, device_id="aabbccdd1234abcd"):
    url = f"{COURSE_URL}/{method}/{int(time.time()*1000)}"
    cookie = make_cookie(access_token, device_id)
    r = requests.post(url, data=build_call(method, args),
                      headers={'Content-Type': 'application/x-thrift', 'Cookie': cookie})
    return r.content[4:]

# 简单响应解析
def read_varint(data, pos):
    r, s = 0, 0
    while True:
        b = data[pos]; pos += 1
        r |= (b & 0x7f) << s
        if not (b & 0x80): break
        s += 7
    return r, pos

def read_string(data, pos):
    l, pos = read_varint(data, pos)
    return data[pos:pos+l].decode('utf-8'), pos+l

def read_i32(data, pos):
    v, pos = read_varint(data, pos); return (v >> 1) ^ -(v & 1), pos

def read_i64(data, pos):
    v, pos = read_varint(data, pos); return (v >> 1) ^ -(v & 1), pos
```

---

## get_vocab_live_info

> `POST https://learn.baicizhan.com/rpc/course/get_vocab_live_info/{timestamp_ms}`

*请求方式：POST*

**作用：** 获取指定词汇直播课程的完整信息，包括课程讲师昵称、课程标题、内容文本行、答题选项、课程时长等。在直播/录播页面中用于加载课程内容。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `course_id` | i32 | **必须** | `1001` | 课程 ID，由课程列表接口获取 |
| 2 | `article_id` | i32 | **必须** | `2001` | 文章/章节 ID |

**返回值：VocabLiveInfo 结构体**

来源：`VocabLiveInfo.java`

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `nickname` | string | 讲师昵称 |
| 2 | `line_infos` | list\<LineInfo\> | 课程内容文本行列表 |
| 3 | `duration` | i32 | 课程时长（秒） |
| 4 | `title` | string | 课程标题 |
| 5 | `discount_coupon` | struct DiscountCoupon | 优惠券信息（可选） |
| 6 | `answers` | list\<LiveAnswerItem\> | 课程答题选项列表 |
| 7 | `sents` | list\<string\> | 课程例句列表 |
| 8 | `study_done` | i32 | 是否已完成学习（1=已完成，0=未完成） |
| 9 | `emojis` | list\<string\> | 互动 emoji 列表 |

**Python 代码：**

```python
def get_vocab_live_info(course_id: int, article_id: int, access_token: str) -> bytes:
    """获取词汇直播课程信息"""
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(course_id)   # field 1: course_id (i32)
    args += fhdr(2, 1, 5) + encode_i32(article_id)  # field 2: article_id (i32)
    return call_course("get_vocab_live_info", args, access_token)

# 使用示例
resp = get_vocab_live_info(course_id=1001, article_id=2001, access_token="your_token")
# resp 为 TCompact 编码的 VocabLiveInfo，需进一步解析
```

<details>
<summary>查看响应结构示例：</summary>

响应为 TCompact 二进制，解码后逻辑结构如下：

```
VocabLiveInfo {
    nickname: "英语老师小王",
    title: "高频词汇 Day 1",
    duration: 1200,        // 20分钟
    study_done: 0,         // 未完成
    line_infos: [
        LineInfo { content: "abandon 抛弃，放弃" },
        ...
    ],
    answers: [
        LiveAnswerItem { ... },
    ],
    sents: ["She abandoned her old car.", ...]
}
```

</details>

---

## polling_info

> `POST https://learn.baicizhan.com/rpc/course/polling_info/{timestamp_ms}`

*请求方式：POST*

**作用：** 轮询直播课程的实时状态更新，例如新弹幕消息、互动内容等。在直播过程中客户端定期调用此接口获取最新内容，实现类似长轮询的效果。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `course_id` | i32 | **必须** | `1001` | 课程 ID |
| 2 | `article_id` | i32 | **必须** | `2001` | 文章/章节 ID |

**返回值：Message 结构体**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| — | `content` | string | 最新消息内容（JSON 格式的互动数据） |

**Python 代码：**

```python
def polling_info(course_id: int, article_id: int, access_token: str) -> bytes:
    """轮询课程直播状态（建议每 3-5 秒调用一次）"""
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(course_id)
    args += fhdr(2, 1, 5) + encode_i32(article_id)
    return call_course("polling_info", args, access_token)

# 轮询示例
import time as time_module
while True:
    resp = polling_info(1001, 2001, access_token="your_token")
    # 解析 resp 获取新消息
    time_module.sleep(3)
```

---

## livedone

> `POST https://learn.baicizhan.com/rpc/course/livedone/{timestamp_ms}`

*请求方式：POST*

**作用：** 通知服务端用户已完成直播课程的观看，服务端会记录学习完成状态，并可能触发学习积分奖励。在用户看完直播/录播后调用。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `course_id` | i32 | **必须** | `1001` | 课程 ID |
| 2 | `article_id` | i32 | **必须** | `2001` | 文章/章节 ID |

**返回值：** void（无返回体）

**Python 代码：**

```python
def livedone(course_id: int, article_id: int, access_token: str):
    """标记直播课程已完成"""
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(course_id)
    args += fhdr(2, 1, 5) + encode_i32(article_id)
    call_course("livedone", args, access_token)
    print(f"课程 {course_id}-{article_id} 已标记完成")
```

---

## get_mark_book_list

> `POST https://learn.baicizhan.com/rpc/course/get_mark_book_list/{timestamp_ms}`

*请求方式：POST*

**作用：** 获取指定课程试卷（paper）中被用户标记收藏的单词列表。在课程学习完成后，用户可将课程中的生词加入标记词书，此接口用于查看这些已标记的单词。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `paper_id` | i32 | **必须** | `5001` | 试卷/课程资源 ID |

**返回值：** list\<MarkTopicInfo\>

**MarkTopicInfo 字段（来源：`MarkTopicInfo.java`）：**

| 字段 ID | 字段名 | 类型 | 说明 |
|---------|--------|------|------|
| 1 | `topic_id` | i32 | 单词 topic ID |
| 2 | `word` | string | 英文单词 |
| 3 | `meaning` | string | 中文释义 |

**Python 代码：**

```python
def get_mark_book_list(paper_id: int, access_token: str) -> bytes:
    """获取课程标记词书中的单词列表"""
    args = fhdr(1, 0, 5) + encode_i32(paper_id)
    return call_course("get_mark_book_list", args, access_token)

resp = get_mark_book_list(paper_id=5001, access_token="your_token")
```

<details>
<summary>查看响应结构示例：</summary>

```
List<MarkTopicInfo> = [
    { topic_id: 10001, word: "abandon",   meaning: "抛弃，放弃" },
    { topic_id: 10002, word: "abolish",   meaning: "废除，废止" },
    { topic_id: 10003, word: "abrupt",    meaning: "突然的，意外的" },
]
```

</details>

---

## delete_mark_word

> `POST https://learn.baicizhan.com/rpc/course/delete_mark_word/{timestamp_ms}`

*请求方式：POST*

**作用：** 从课程标记词书中删除指定单词。用户在课程标记词书管理页中可批量删除不需要的单词。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `topic_id` | i32 | **必须** | `10001` | 要删除的单词 topic ID |
| 2 | `paper_id` | i32 | **必须** | `5001` | 所属试卷/课程资源 ID |

**返回值：** void

**Python 代码：**

```python
def delete_mark_word(topic_id: int, paper_id: int, access_token: str):
    """从课程标记词书删除单词"""
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(topic_id)
    args += fhdr(2, 1, 5) + encode_i32(paper_id)
    call_course("delete_mark_word", args, access_token)
    print(f"已删除单词 topic_id={topic_id} 从 paper_id={paper_id}")
```

---

## get_improve_video_info

> `POST https://learn.baicizhan.com/rpc/course/get_improve_video_info/{timestamp_ms}`

*请求方式：POST*

**作用：** 获取"提升"功能中视频课程的详细信息，包括视频 URL、课程大纲、学习进度等。百词斩 App 中的"提升"模块提供视频教学内容，此接口获取指定章节的视频课程数据。

**认证方式：** 需要 `access_token` Cookie

**请求参数：**

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `chapter_id` | i64 | **必须** | `100001` | 视频课程章节 ID（64位整数） |

**返回值：ImproveVideoInfo 结构体**

| 字段 | 类型 | 说明 |
|------|------|------|
| 视频URL | string | 视频播放地址 |
| 章节标题 | string | 视频章节标题 |
| 时长 | i32 | 视频时长（秒） |
| 进度 | i32 | 学习进度（0-100） |

**Python 代码：**

```python
def get_improve_video_info(chapter_id: int, access_token: str) -> bytes:
    """获取提升视频课程信息"""
    args = fhdr(1, 0, 6) + encode_i64(chapter_id)  # i64, type=6
    return call_course("get_improve_video_info", args, access_token)
```

---

## submit_improve_chapter_done

> `POST https://learn.baicizhan.com/rpc/course/submit_improve_chapter_done/{timestamp_ms}`

*请求方式：POST*

**作用：** 提交视频课程章节的完成状态和学习进度。用户观看完一个视频章节后调用，服务端记录进度并可能发放学习奖励。

**认证方式：** 需要 `access_token` Cookie

**请求参数（Thrift Args → ImproveChapterDoneReq）：**

来源：`ImproveChapterDoneReq.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `chapter_id` | i64 | **必须** | `100001` | 章节 ID（与 get_improve_video_info 一致） |
| 2 | `progress` | i32 | **必须** | `100` | 完成进度（0-100，100 表示完整观看） |

**返回值：** void

**Python 代码：**

```python
def submit_improve_chapter_done(chapter_id: int, progress: int, access_token: str):
    """提交视频章节学习进度（progress=100表示看完）"""
    args = b''
    args += fhdr(1, 0, 6) + encode_i64(chapter_id)  # field 1: chapter_id (i64, type=6)
    args += fhdr(2, 1, 5) + encode_i32(progress)    # field 2: progress (i32, type=5)
    call_course("submit_improve_chapter_done", args, access_token)
    print(f"已提交章节 {chapter_id} 进度 {progress}%")

# 使用示例：观看完整视频后提交
submit_improve_chapter_done(chapter_id=100001, progress=100, access_token="your_token")
```

---

## feedback

> `POST https://learn.baicizhan.com/rpc/course/feedback/{timestamp_ms}`

*请求方式：POST*

**作用：** 提交课程中随堂测验/答题的反馈结果。课程中穿插答题环节，用户作答后通过此接口提交答案，服务端会记录答题情况。

**认证方式：** 需要 `access_token` Cookie

**请求参数（Thrift Args → FeedBackReq）：**

来源：`FeedBackReq.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `article_id` | i32 | **必须** | `2001` | 文章/章节 ID |
| 2 | `qs_id` | i32 | **必须** | `3001` | 题目 ID（question ID） |
| 3 | `choice` | i32 | **必须** | `2` | 用户选择的选项编号（从 1 开始） |

**返回值：** void

**Python 代码：**

```python
def feedback(article_id: int, qs_id: int, choice: int, access_token: str):
    """
    提交课程随堂测验答案
    
    :param article_id: 文章/章节 ID
    :param qs_id: 题目 ID
    :param choice: 用户选择的选项（1、2、3 或 4）
    """
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(article_id)  # field 1: article_id
    args += fhdr(2, 1, 5) + encode_i32(qs_id)       # field 2: qs_id
    args += fhdr(3, 2, 5) + encode_i32(choice)      # field 3: choice
    call_course("feedback", args, access_token)
    print(f"已提交题目 {qs_id} 答案：选项 {choice}")

# 使用示例
feedback(article_id=2001, qs_id=3001, choice=2, access_token="your_token")
```

---

## submitugc

> `POST https://learn.baicizhan.com/rpc/course/submitugc/{timestamp_ms}`

*请求方式：POST*

**作用：** 提交用户对课程的评论（UGC = User Generated Content）。用户在课程页面发表的评论或笔记通过此接口上传至服务端。

**认证方式：** 需要 `access_token` Cookie

**请求参数（Thrift Args → CommentReq）：**

来源：`CommentReq.java`

| 字段 ID | 字段名 | 类型 | 必要性 | 示例值 | 说明 |
|---------|--------|------|--------|--------|------|
| 1 | `course_id` | i32 | **必须** | `1001` | 课程 ID |
| 2 | `article_id` | i32 | **必须** | `2001` | 文章/章节 ID |
| 3 | `content` | string | **必须** | `"很好的课程！"` | 评论内容文本（UTF-8） |
| 4 | `time` | i64 | **必须** | `1716000000000` | 客户端发评论的时间（毫秒时间戳） |

**返回值：** void

**Python 代码：**

```python
def submitugc(course_id: int, article_id: int, content: str, access_token: str):
    """
    提交课程用户评论
    
    :param course_id: 课程 ID
    :param article_id: 文章/章节 ID
    :param content: 评论内容
    :param access_token: 登录令牌
    """
    ts_ms = int(time.time() * 1000)
    args = b''
    args += fhdr(1, 0, 5) + encode_i32(course_id)      # field 1: course_id
    args += fhdr(2, 1, 5) + encode_i32(article_id)     # field 2: article_id
    args += fhdr(3, 2, 8) + encode_string(content)     # field 3: content (string, type=8)
    args += fhdr(4, 3, 6) + encode_i64(ts_ms)          # field 4: time (i64, type=6)
    call_course("submitugc", args, access_token)
    print(f"评论已提交：{content[:20]}...")

# 使用示例
submitugc(
    course_id=1001,
    article_id=2001,
    content="这个单词解析很到位，学到了很多！",
    access_token="your_token"
)
```

---

## 完整调用流程示例

以下展示从进入课程到完成学习的完整流程：

```python
import time

ACCESS_TOKEN = "your_access_token"
COURSE_ID = 1001
ARTICLE_ID = 2001

# 步骤 1：加载课程内容
resp = get_vocab_live_info(COURSE_ID, ARTICLE_ID, ACCESS_TOKEN)
print("课程内容已加载")

# 步骤 2：课程进行中，轮询新内容（每 5 秒）
for _ in range(3):
    resp = polling_info(COURSE_ID, ARTICLE_ID, ACCESS_TOKEN)
    time.sleep(5)

# 步骤 3：遇到答题环节，提交答案
feedback(article_id=ARTICLE_ID, qs_id=3001, choice=2, access_token=ACCESS_TOKEN)

# 步骤 4：课程结束，标记完成
livedone(COURSE_ID, ARTICLE_ID, ACCESS_TOKEN)
print("课程已完成！")

# 步骤 5（可选）：提交评论
submitugc(COURSE_ID, ARTICLE_ID, "讲得很好，受益匪浅！", ACCESS_TOKEN)
```

---

## 异常说明

| 异常类型 | 说明 |
|----------|------|
| `LogicException` | 业务错误（课程 ID 不存在、无权限访问等） |
| `SystemException` | 系统级错误（服务不可用） |
| `TException` | Thrift 传输/协议错误 |

---

## 相关文档

- [thrift_client.md](thrift_client.md) — Python TCompact 客户端实现
- [unified_user_service.md](unified_user_service.md) — 登录认证
- [user_study_api.md](user_study_api.md) — 主要学习进度 API

---

