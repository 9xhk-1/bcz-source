# BCZ Thrift 客户端开发指南

> 本文档基于 APK 版本 7.8.14（versionCode 7081400）逆向分析，为网络安全研究目的编写。  
> 逆向来源：`com/baicizhan/client/business/thrift/` 包、`com/baicizhan/online/unified_user_service/UnifiedUserService.java`

---

## 一、协议概述

百词斩 App 的所有核心 API 均采用 **Apache Thrift** 协议，而非 REST/JSON。

| 层次 | 协议 | 说明 |
|------|------|------|
| 序列化 | **TCompactProtocol** | 紧凑二进制编码，整数使用 Zigzag + Varint |
| 传输 | **TFramedTransport** | 每帧以 4 字节大端整数标识负载长度 |
| 网络 | **HTTPS** | 标准 TLS，HTTP POST |
| Content-Type | `application/x-thrift` | 告知服务器使用 Thrift 格式 |

### 1.1 URL 格式

```
https://{host}/rpc/{service_name}/{method_name}/{timestamp_ms}
```

| 部分 | 示例 | 说明 |
|------|------|------|
| `host` | `passport.baicizhan.com` | 因服务不同而异 |
| `service_name` | `unified_user_service` | Thrift 服务名 |
| `method_name` | `login_with_phone` | Thrift 方法名 |
| `timestamp_ms` | `1716000000000` | 当前毫秒时间戳（防重放） |

### 1.2 请求结构

```
HTTP POST
  Headers:
    Content-Type: application/x-thrift
    Cookie: <设备信息 + 认证 token>
  Body:
    [4字节大端 uint32: payload长度][TCompact编码的Thrift消息]
```

---

## 二、Cookie 构造

Cookie 字段由 `com.baicizhan.client.business.thrift.b` 类生成，是每个请求必须携带的设备指纹与认证信息。

### 2.1 字段说明

| 字段名 | 来源 | 示例值 | 说明 |
|--------|------|--------|------|
| `device_name` | `android/` + 设备型号（去空格） | `android%2FPixel6-Google` | Build.MODEL + Build.MANUFACTURER |
| `version` | Android 系统版本 | `14` | Build.VERSION.RELEASE |
| `app_name` | App versionCode | `7081400` | PackageInfo.versionCode |
| `channel` | APK 渠道 | `official` | Meta-data 中的渠道标识 |
| `client_time` | Unix 秒时间戳 | `1716000000` | System.currentTimeMillis() / 1000 |
| `device_id` | Android ID | `aabbccdd1234abcd` | Settings.Secure.android_id |
| `serial` | 设备ID前5位 + 后5位 + ddHHmmss | `aabbb1234501120530` | 设备指纹 |
| `time_zone` | 时区 ID | `Asia%2FShanghai` | TimeZone.getDefault().getID() |
| `access_token` | 登录后获得 | `eyJxxx...` | 未登录时不携带 |

### 2.2 Python Cookie 构建

```python
import time
import urllib.parse
import uuid
from datetime import datetime


def build_cookie(
    device_id: str = None,
    app_version_code: str = "7081400",
    os_version: str = "14",
    device_model: str = "Pixel6-Google",
    channel: str = "official",
    time_zone: str = "Asia/Shanghai",
    access_token: str = None,
) -> str:
    """
    构造请求 Cookie，模拟 com.baicizhan.client.business.thrift.b 的逻辑。

    参数：
        device_id       Android ID（16位十六进制字符串），None 则随机生成
        access_token    登录后从 UserLoginResult.access_token 获取，未登录时不传
    """
    if device_id is None:
        device_id = uuid.uuid4().hex[:16]

    now = int(time.time())
    date_part = datetime.now().strftime("%d%H%M%S")
    serial = device_id[:5] + device_id[-5:] + date_part

    fields = {
        "device_name": f"android/{device_model.replace(' ', '')}",
        "version": os_version,
        "app_name": app_version_code,
        "channel": channel,
        "client_time": str(now),
        "device_id": device_id,
        "serial": serial,
        "time_zone": time_zone,
    }
    if access_token:
        fields["access_token"] = access_token

    return "; ".join(
        f"{k}={urllib.parse.quote(v, safe='')}" for k, v in fields.items()
    )
```

---

## 三、TCompact 编码规范

TCompactProtocol 使用紧凑的二进制编码，以下是手动编/解码所需的全部规则。

### 3.1 消息头格式

```
[0x82]  ← PROTOCOL_ID（固定）
[0x21 | (msg_type << 5)]  ← 版本(0x01) + 消息类型
[seq_id: zigzag varint]   ← 序列号（通常为 0）
[name_len: varint]        ← 方法名长度
[name: UTF-8 bytes]       ← 方法名
```

**消息类型（msg_type）：**

| 常量 | 值 | 说明 |
|------|----|------|
| `MSG_CALL` | 1 | 客户端调用 |
| `MSG_REPLY` | 2 | 服务端正常响应 |
| `MSG_EXCEPTION` | 3 | 服务端异常响应 |

因此，CALL 消息的第二字节为 `0x21 | (1 << 5) = 0x21 | 0x20 = 0x21`（实际为 `0x21`，version=1，type=CALL 编入高位）。

### 3.2 字段编码

结构体中的每个字段由 **类型标识字节** + **数据** 组成：

**紧凑字段头（delta编码，适用于相邻字段ID差值 1~15）：**
```
[(field_id_delta << 4) | compact_type]
```

**完整字段头（field_id 差值为 0 或 >15 时）：**
```
[0x00 | compact_type]  ← 低4位为类型，高4位为0
[field_id: zigzag varint]
```

**字段终止符：**
```
[0x00]  ← STOP，表示结构体结束
```

**TCompact 字段类型码（线路类型，非 TType）：**

| 常量名 | 线路值 | 对应 Java 类型 |
|--------|--------|----------------|
| `TYPE_BOOL_TRUE` | 1 | boolean (true) |
| `TYPE_BOOL_FALSE` | 2 | boolean (false) |
| `TYPE_I8` | 3 | byte |
| `TYPE_I16` | 4 | short |
| `TYPE_I32` | 5 | int |
| `TYPE_I64` | 6 | long |
| `TYPE_DOUBLE` | 7 | double |
| `TYPE_BINARY` | 8 | string / bytes |
| `TYPE_LIST` | 9 | List |
| `TYPE_SET` | 10 | Set |
| `TYPE_MAP` | 11 | Map |
| `TYPE_STRUCT` | 12 | struct |

> **注意**：string 和 bytes 在线路上均为 `TYPE_BINARY = 8`，前缀为 varint 长度。

### 3.3 Varint 编码（无符号）

每 7 位一组，低位在前，最高位为延续标志（1=还有后续字节）：

```python
def encode_varint(value: int) -> bytes:
    buf = []
    while value > 0x7F:
        buf.append((value & 0x7F) | 0x80)
        value >>= 7
    buf.append(value & 0x7F)
    return bytes(buf)
```

### 3.4 Zigzag 编码（有符号整数）

有符号整数先经 Zigzag 映射为非负整数，再用 Varint 编码：

```python
def zigzag_i32(n: int) -> int:
    return (n << 1) ^ (n >> 31)   # i32

def zigzag_i64(n: int) -> int:
    return (n << 1) ^ (n >> 63)   # i64

def dezigzag(v: int) -> int:
    return (v >> 1) ^ -(v & 1)    # 还原（i32/i64 通用）
```

示例：
- `zigzag_i32(0)` → `0`
- `zigzag_i32(-1)` → `1`
- `zigzag_i32(1)` → `2`
- `zigzag_i32(-2)` → `3`

### 3.5 List/Set 编码

```
[size_and_type: 1字节]  ← 高4位为元素数量（≤14时），低4位为元素类型
（若元素数量 ≥ 15，则高4位为 0xF，后跟 varint 表示数量）
[element_0_data]
[element_1_data]
...
```

### 3.6 Map 编码

```
[size: varint]           ← 键值对数量
（若 size > 0）:
[key_type | val_type: 1字节]  ← 高4位键类型，低4位值类型
[key_0][val_0]
[key_1][val_1]
...
```

---

## 四、完整 Python Thrift 客户端

以下代码可独立运行，无需安装 `thrift` 库，纯手写 TCompactProtocol 编解码。

```python
"""
bcz_thrift_client.py  —  百词斩 Thrift 客户端（纯 Python 实现）

依赖：
    pip install requests
"""

import io
import struct
import time
import uuid
import urllib.parse
from datetime import datetime
from typing import Optional

import requests

# ──────────────────────────────────────────────
# TCompact 类型常量
# ──────────────────────────────────────────────
TYPE_STOP      = 0
TYPE_BOOL_T    = 1
TYPE_BOOL_F    = 2
TYPE_I8        = 3
TYPE_I16       = 4
TYPE_I32       = 5
TYPE_I64       = 6
TYPE_DOUBLE    = 7
TYPE_BINARY    = 8   # string 和 bytes 共用
TYPE_LIST      = 9
TYPE_SET       = 10
TYPE_MAP       = 11
TYPE_STRUCT    = 12

MSG_CALL       = 1
MSG_REPLY      = 2
MSG_EXCEPTION  = 3

PROTOCOL_ID    = 0x82
VERSION        = 0x01


# ──────────────────────────────────────────────
# 基础编码工具函数
# ──────────────────────────────────────────────

def encode_varint(value: int) -> bytes:
    """无符号 Varint 编码（7位一组，低位在前）。"""
    buf = []
    while value > 0x7F:
        buf.append((value & 0x7F) | 0x80)
        value >>= 7
    buf.append(value & 0x7F)
    return bytes(buf)


def decode_varint(buf: bytes, pos: int):
    """返回 (value, new_pos)。"""
    shift, result = 0, 0
    while True:
        b = buf[pos]; pos += 1
        result |= (b & 0x7F) << shift
        if not (b & 0x80):
            break
        shift += 7
    return result, pos


def zigzag_encode_i32(n: int) -> bytes:
    return encode_varint((n << 1) ^ (n >> 31))


def zigzag_encode_i64(n: int) -> bytes:
    return encode_varint((n << 1) ^ (n >> 63))


def zigzag_decode(v: int) -> int:
    return (v >> 1) ^ -(v & 1)


# ──────────────────────────────────────────────
# TCompact 写入器
# ──────────────────────────────────────────────

class CompactWriter:
    """TCompactProtocol 写入器，支持所有基本类型和结构体。"""

    def __init__(self):
        self._buf = io.BytesIO()
        self._last_field_id_stack = [0]   # 每层结构体维护一个最后字段ID

    # ── 底层写入 ──────────────────────────
    def _w(self, data: bytes):
        self._buf.write(data)

    def _write_field_header(self, ftype: int, fid: int):
        last = self._last_field_id_stack[-1]
        delta = fid - last
        if 0 < delta <= 15:
            self._w(bytes([(delta << 4) | ftype]))
        else:
            self._w(bytes([ftype]))                 # 完整形式
            self._w(zigzag_encode_i32(fid))
        self._last_field_id_stack[-1] = fid

    # ── 消息级方法 ────────────────────────
    def write_message_begin(self, name: str, msg_type: int = MSG_CALL, seq_id: int = 0):
        """写入 TCompact 消息头。"""
        self._w(bytes([PROTOCOL_ID]))
        self._w(bytes([VERSION | (msg_type << 5)]))
        self._w(zigzag_encode_i32(seq_id))
        name_b = name.encode("utf-8")
        self._w(encode_varint(len(name_b)))
        self._w(name_b)

    def write_message_end(self):
        pass   # TCompact 无消息尾

    # ── 结构体级方法 ──────────────────────
    def write_struct_begin(self):
        self._last_field_id_stack.append(0)

    def write_struct_end(self):
        if len(self._last_field_id_stack) > 1:
            self._last_field_id_stack.pop()

    def write_field_begin(self, ftype: int, fid: int):
        self._write_field_header(ftype, fid)

    def write_field_stop(self):
        self._w(bytes([TYPE_STOP]))

    # ── 数据类型写入 ──────────────────────
    def write_bool(self, fid: int, value: bool):
        """布尔值直接编入字段头类型位，无需额外数据字节。"""
        self._write_field_header(TYPE_BOOL_T if value else TYPE_BOOL_F, fid)

    def write_i32(self, value: int):
        self._w(zigzag_encode_i32(value))

    def write_i64(self, value: int):
        self._w(zigzag_encode_i64(value))

    def write_string(self, value: str):
        b = value.encode("utf-8")
        self._w(encode_varint(len(b)))
        self._w(b)

    def write_bytes(self, data: bytes):
        self._w(encode_varint(len(data)))
        self._w(data)

    def write_list_begin(self, elem_type: int, size: int):
        """写入 List 头部（size < 15 时紧凑，否则用 varint）。"""
        if size < 15:
            self._w(bytes([(size << 4) | elem_type]))
        else:
            self._w(bytes([0xF0 | elem_type]))
            self._w(encode_varint(size))

    def getvalue(self) -> bytes:
        return self._buf.getvalue()


# ──────────────────────────────────────────────
# TCompact 读取器
# ──────────────────────────────────────────────

class CompactReader:
    """TCompactProtocol 读取器，支持所有基本类型和结构体。"""

    def __init__(self, data: bytes):
        self._buf = data
        self._pos = 0
        self._last_field_id_stack = [0]

    def _read(self, n: int) -> bytes:
        chunk = self._buf[self._pos:self._pos + n]
        if len(chunk) < n:
            raise ValueError(f"Buffer underflow: need {n} at pos {self._pos}")
        self._pos += n
        return chunk

    # ── 消息级方法 ────────────────────────
    def read_message_begin(self):
        """返回 (name, msg_type, seq_id)。"""
        proto = self._buf[self._pos]; self._pos += 1
        if proto != PROTOCOL_ID:
            raise ValueError(f"Invalid protocol id: 0x{proto:02x}")
        ver_type = self._buf[self._pos]; self._pos += 1
        msg_type = (ver_type >> 5) & 0x07
        raw_seq, self._pos = decode_varint(self._buf, self._pos)
        seq_id = zigzag_decode(raw_seq)
        name_len, self._pos = decode_varint(self._buf, self._pos)
        name = self._buf[self._pos:self._pos + name_len].decode("utf-8")
        self._pos += name_len
        return name, msg_type, seq_id

    # ── 结构体级方法 ──────────────────────
    def read_struct_begin(self):
        self._last_field_id_stack.append(0)

    def read_struct_end(self):
        if len(self._last_field_id_stack) > 1:
            self._last_field_id_stack.pop()

    def read_field_begin(self):
        """返回 (field_type, field_id)，field_type==TYPE_STOP 表示结构体结束。"""
        b = self._buf[self._pos]; self._pos += 1
        ftype = b & 0x0F
        if ftype == TYPE_STOP:
            return TYPE_STOP, 0
        delta = (b >> 4) & 0x0F
        if delta == 0:
            raw, self._pos = decode_varint(self._buf, self._pos)
            fid = zigzag_decode(raw)
        else:
            fid = self._last_field_id_stack[-1] + delta
        self._last_field_id_stack[-1] = fid
        return ftype, fid

    # ── 数据类型读取 ──────────────────────
    def read_bool(self, field_type: int) -> bool:
        """布尔值编入字段类型位，直接从 field_type 判断。"""
        return field_type == TYPE_BOOL_T

    def read_i8(self) -> int:
        v = self._buf[self._pos]; self._pos += 1
        return v if v < 0x80 else v - 0x100

    def read_i32(self) -> int:
        raw, self._pos = decode_varint(self._buf, self._pos)
        return zigzag_decode(raw)

    def read_i64(self) -> int:
        raw, self._pos = decode_varint(self._buf, self._pos)
        return zigzag_decode(raw)

    def read_string(self) -> str:
        n, self._pos = decode_varint(self._buf, self._pos)
        s = self._buf[self._pos:self._pos + n].decode("utf-8")
        self._pos += n
        return s

    def read_bytes(self) -> bytes:
        n, self._pos = decode_varint(self._buf, self._pos)
        data = self._buf[self._pos:self._pos + n]
        self._pos += n
        return data

    def read_list_begin(self):
        """返回 (elem_type, size)。"""
        b = self._buf[self._pos]; self._pos += 1
        elem_type = b & 0x0F
        size = (b >> 4) & 0x0F
        if size == 0x0F:
            size, self._pos = decode_varint(self._buf, self._pos)
        return elem_type, size

    def skip(self, ftype: int):
        """跳过一个字段（用于忽略未知字段）。"""
        if ftype in (TYPE_BOOL_T, TYPE_BOOL_F):
            pass
        elif ftype == TYPE_I8:
            self._pos += 1
        elif ftype in (TYPE_I16, TYPE_I32, TYPE_I64):
            _, self._pos = decode_varint(self._buf, self._pos)
        elif ftype == TYPE_DOUBLE:
            self._pos += 8
        elif ftype == TYPE_BINARY:
            n, self._pos = decode_varint(self._buf, self._pos)
            self._pos += n
        elif ftype in (TYPE_LIST, TYPE_SET):
            elem_type, size = self.read_list_begin()
            for _ in range(size):
                self.skip(elem_type)
        elif ftype == TYPE_MAP:
            size, self._pos = decode_varint(self._buf, self._pos)
            if size > 0:
                types = self._buf[self._pos]; self._pos += 1
                kt, vt = (types >> 4) & 0x0F, types & 0x0F
                for _ in range(size):
                    self.skip(kt); self.skip(vt)
        elif ftype == TYPE_STRUCT:
            self.read_struct_begin()
            while True:
                ft, _ = self.read_field_begin()
                if ft == TYPE_STOP:
                    break
                self.skip(ft)
            self.read_struct_end()


# ──────────────────────────────────────────────
# TFramedTransport 工具函数
# ──────────────────────────────────────────────

def framed_encode(payload: bytes) -> bytes:
    """添加 4 字节大端帧长前缀。"""
    return struct.pack(">I", len(payload)) + payload


def framed_decode(data: bytes) -> bytes:
    """去除 4 字节帧长前缀，返回 payload。"""
    if len(data) < 4:
        raise ValueError("Response too short for TFramed header")
    size = struct.unpack(">I", data[:4])[0]
    return data[4:4 + size]


# ──────────────────────────────────────────────
# HTTP 传输
# ──────────────────────────────────────────────

def post_thrift(url: str, payload: bytes, cookie: str, timeout: int = 15) -> bytes:
    """
    发送 TFramedTransport 请求，返回去帧后的 payload。

    参数：
        url      完整请求 URL（含时间戳后缀）
        payload  TCompact 编码的消息体（未加帧）
        cookie   build_cookie() 生成的 Cookie 字符串
    """
    headers = {
        "Content-Type": "application/x-thrift",
        "Cookie": cookie,
    }
    resp = requests.post(url, data=framed_encode(payload), headers=headers, timeout=timeout)
    resp.raise_for_status()
    return framed_decode(resp.content)


def make_url(host: str, service: str, method: str) -> str:
    """构造带毫秒时间戳的请求 URL。"""
    ts = int(time.time() * 1000)
    return f"{host}/rpc/{service}/{method}/{ts}"


# ──────────────────────────────────────────────
# 异常处理
# ──────────────────────────────────────────────

class BczException(Exception):
    def __init__(self, code: int, message: str):
        self.code = code
        self.message = message
        super().__init__(f"[{code}] {message}")


def check_response(reader: CompactReader, method_name: str) -> tuple:
    """
    解析响应消息头，检查是否为异常。

    返回：(msg_type, seq_id)

    若为 MSG_EXCEPTION，抛出 BczException。
    """
    name, msg_type, seq_id = reader.read_message_begin()
    if msg_type == MSG_EXCEPTION:
        # TApplicationException: field 1=message(string), field 2=type(i32)
        reader.read_struct_begin()
        msg, code = "", 0
        while True:
            ft, fid = reader.read_field_begin()
            if ft == TYPE_STOP:
                break
            if fid == 1 and ft == TYPE_BINARY:
                msg = reader.read_string()
            elif fid == 2 and ft == TYPE_I32:
                code = reader.read_i32()
            else:
                reader.skip(ft)
        reader.read_struct_end()
        raise BczException(code, msg)
    return msg_type, seq_id


def read_reply_struct(reader: CompactReader):
    """
    跳过 reply 结构体外层（success 字段在 field 0，异常在其他字段 ID）。
    返回读取器，已定位到返回值结构体内部。

    Thrift 的 reply 结构包装：
        struct login_with_phone_result {
            0: optional UserLoginResult success
            1: optional LogicException e1
            2: optional SystemException e2
        }
    """
    reader.read_struct_begin()  # reply wrapper
    while True:
        ft, fid = reader.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid == 0:
            # 正常返回值
            return ft  # 调用方继续读取
        elif fid == 1:
            # LogicException: field 1=code(i32), field 2=msg(string)
            reader.read_struct_begin()
            code, msg = 0, ""
            while True:
                eft, efid = reader.read_field_begin()
                if eft == TYPE_STOP:
                    break
                if efid == 1 and eft == TYPE_I32:
                    code = reader.read_i32()
                elif efid == 2 and eft == TYPE_BINARY:
                    msg = reader.read_string()
                else:
                    reader.skip(eft)
            reader.read_struct_end()
            raise BczException(code, f"LogicException: {msg}")
        elif fid == 2:
            reader.read_struct_begin()
            code, msg = 0, ""
            while True:
                eft, efid = reader.read_field_begin()
                if eft == TYPE_STOP:
                    break
                if efid == 1 and eft == TYPE_I32:
                    code = reader.read_i32()
                elif efid == 2 and eft == TYPE_BINARY:
                    msg = reader.read_string()
                else:
                    reader.skip(eft)
            reader.read_struct_end()
            raise BczException(code, f"SystemException: {msg}")
        else:
            reader.skip(ft)
    return None  # void 方法正常返回
```

---

## 五、TCompact 响应解析

### 5.1 响应消息结构

```
[4字节帧长] [TCompact 消息]
  消息 = [proto_id=0x82] [ver_type] [seq_id varint] [method_name] [reply struct]
  reply struct = {
      field 0: success（返回值）
      field 1: LogicException（业务异常）
      field 2: SystemException（系统异常）
      field STOP(0x00)
  }
```

### 5.2 LogicException 与 SystemException

| 字段 | 类型 | 说明 |
|------|------|------|
| `[1] code` | i32 | 错误码 |
| `[2] message` | string | 错误描述 |

常见错误码：

| code | 含义 |
|------|------|
| 1001 | 验证码错误或已过期 |
| 1002 | 手机号未注册 |
| 1003 | 频率限制，请稍后再试 |
| 2001 | access_token 无效或已过期 |
| 4001 | 参数错误 |

---

## 六、完整示例：游客登录（have_a_try）

`have_a_try` 是最简单的接口——无参数，可以直接调用，适合测试连接。

```python
# ── 构造请求 ────────────────────────────────
def build_have_a_try() -> bytes:
    """构造 have_a_try 请求（无参数）。"""
    w = CompactWriter()
    w.write_message_begin("have_a_try", MSG_CALL, 0)
    w.write_struct_begin()   # args struct（空）
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()
    return w.getvalue()


# ── 解析响应（UserLoginResult）────────────────
def parse_user_login_result(payload: bytes) -> dict:
    """
    解析 have_a_try / login_with_phone 返回的 UserLoginResult。

    返回字典：
        access_token  (str)   Session 令牌
        is_new_user   (int)   1=新用户
        email         (str)
        public_key    (str)
        last_device   (str)
        unique_id     (int)   用户 ID
        phone         (str, optional)
        force_bind_phone (int, optional)
        role_new      (int, optional)
        game_mode     (int, optional)
    """
    r = CompactReader(payload)
    check_response(r, "have_a_try")  # 或 login_with_phone

    result = {}
    # 进入 reply wrapper
    r.read_struct_begin()
    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break
        if fid != 0:               # fid!=0 → 异常字段，已由 check_response 处理
            r.skip(ft)
            continue
        # fid == 0: UserLoginResult struct
        r.read_struct_begin()
        while True:
            ft2, fid2 = r.read_field_begin()
            if ft2 == TYPE_STOP:
                break
            if fid2 == 1 and ft2 == TYPE_BINARY:
                result["access_token"] = r.read_string()
            elif fid2 == 2 and ft2 == TYPE_I32:
                result["is_new_user"] = r.read_i32()
            elif fid2 == 3 and ft2 == TYPE_BINARY:
                result["email"] = r.read_string()
            elif fid2 == 4 and ft2 == TYPE_BINARY:
                result["public_key"] = r.read_string()
            elif fid2 == 5 and ft2 == TYPE_BINARY:
                result["last_device"] = r.read_string()
            elif fid2 == 6 and ft2 == TYPE_I64:
                result["unique_id"] = r.read_i64()
            elif fid2 == 7 and ft2 == TYPE_BINARY:
                result["phone"] = r.read_string()
            elif fid2 == 8 and ft2 == TYPE_I32:
                result["force_bind_phone"] = r.read_i32()
            elif fid2 == 9 and ft2 == TYPE_I32:
                result["role_new"] = r.read_i32()
            elif fid2 == 10 and ft2 == TYPE_STRUCT:
                # RoleInfo: field 1=role_up(i32), field 2=grade(i32)
                role = {}
                r.read_struct_begin()
                while True:
                    ft3, fid3 = r.read_field_begin()
                    if ft3 == TYPE_STOP:
                        break
                    if fid3 == 1 and ft3 == TYPE_I32:
                        role["role_up"] = r.read_i32()
                    elif fid3 == 2 and ft3 == TYPE_I32:
                        role["grade"] = r.read_i32()
                    else:
                        r.skip(ft3)
                r.read_struct_end()
                result["role"] = role
            elif fid2 == 11 and ft2 == TYPE_I32:
                result["game_mode"] = r.read_i32()
            else:
                r.skip(ft2)
        r.read_struct_end()
    r.read_struct_end()
    return result


# ── 主程序 ──────────────────────────────────
if __name__ == "__main__":
    DEVICE_ID = "aabbccdd1234abcd"   # 替换为真实 Android ID 或随机值
    HOST = "https://passport.baicizhan.com"
    SERVICE = "unified_user_service"

    cookie = build_cookie(device_id=DEVICE_ID)
    url = make_url(HOST, SERVICE, "have_a_try")
    payload = build_have_a_try()

    print(f"POST {url}")
    raw_resp = post_thrift(url, payload, cookie)
    result = parse_user_login_result(raw_resp)

    print("✓ 游客登录成功！")
    print(f"  access_token : {result.get('access_token', '')[:20]}...")
    print(f"  unique_id    : {result.get('unique_id')}")
    print(f"  is_new_user  : {result.get('is_new_user')}")
```

**运行示例：**

```shell
pip install requests
python bcz_thrift_client.py
# ✓ 游客登录成功！
#   access_token : eyJhbGciOiJSUzI1Ni...
#   unique_id    : 12345678
#   is_new_user  : 1
```

---

## 七、错误处理详解

### 7.1 异常类型

| 异常类型 | 字段 ID（reply中） | 说明 |
|----------|--------------------|------|
| `LogicException` | 1 | 业务逻辑错误（如验证码错误） |
| `SystemException` | 2 | 服务端系统错误 |
| `TApplicationException` | — | 协议层错误（消息类型 MSG_EXCEPTION=3） |

### 7.2 推荐错误处理模式

```python
try:
    raw = post_thrift(url, payload, cookie)
    result = parse_user_login_result(raw)
    print(f"登录成功: token={result['access_token']}")
except BczException as e:
    print(f"业务错误 [{e.code}]: {e.message}")
    # 常见处理：
    # code 1001 → 提示用户重新发送验证码
    # code 2001 → 重新登录，刷新 access_token
except requests.HTTPError as e:
    print(f"HTTP 错误: {e.response.status_code}")
except ValueError as e:
    print(f"响应解析失败: {e}")
```

---

## 八、各服务端点汇总

| 服务 | 主端点 | 备用端点 |
|------|--------|----------|
| 用户认证 | `https://passport.baicizhan.com` | `https://passport.bczeducation.cn` |
| 学习核心 | `https://learn.baicizhan.com` | `https://learn.bczeducation.cn` |
| 游戏/词典 | `https://api.baicizhan.com` | `https://api.bczeducation.cn` |

---

## 九、参考文档

- [login.md](login.md) — 短信验证码登录完整流程
- [unified_user_service.md](unified_user_service.md) — 用户服务所有接口
- [flow_study.md](flow_study.md) — 学习流程端到端示例
- [user_study_api.md](user_study_api.md) — 学习服务 API 参考
