"""
百词斩 App 验证码登录 Python 实现

协议：Apache Thrift TCompactProtocol + TFramedTransport over HTTP
服务：https://passport.baicizhan.com/rpc/unified_user_service

逆向来源：APK 版本 7.8.14 (versionCode=7081400)
         核心类：yg.y / com.baicizhan.client.business.thrift.*
                com.baicizhan.online.unified_user_service.UnifiedUserService

用法示例：
    python login.py --phone 13812345678

依赖：
    pip install thrift requests
"""

import io
import struct
import time
import uuid
import urllib.parse
from datetime import datetime
import argparse

import requests


# ────────────────────────────────────────────────
# Thrift TCompactProtocol 编码/解码（纯 Python 手写）
# 避免依赖 thrift IDL 自动生成，便于独立运行
# ────────────────────────────────────────────────

TYPE_STOP   = 0
TYPE_BOOL_T = 1
TYPE_BOOL_F = 2
TYPE_I8     = 3
TYPE_I16    = 4
TYPE_I32    = 5
TYPE_I64    = 6
TYPE_DOUBLE = 7
TYPE_BINARY = 8
TYPE_LIST   = 9
TYPE_SET    = 10
TYPE_MAP    = 11
TYPE_STRUCT = 12

MSG_CALL  = 1
MSG_REPLY = 2
MSG_EXCEPTION = 3


def _encode_varint(value: int) -> bytes:
    """Encode unsigned varint."""
    buf = []
    while value > 0x7F:
        buf.append((value & 0x7F) | 0x80)
        value >>= 7
    buf.append(value & 0x7F)
    return bytes(buf)


def _encode_zigzag_i32(value: int) -> bytes:
    return _encode_varint((value << 1) ^ (value >> 31))


def _encode_zigzag_i64(value: int) -> bytes:
    return _encode_varint((value << 1) ^ (value >> 63))


def _decode_varint(buf: bytes, pos: int):
    """Return (value, new_pos)."""
    shift = 0
    result = 0
    while True:
        b = buf[pos]
        pos += 1
        result |= (b & 0x7F) << shift
        if not (b & 0x80):
            break
        shift += 7
    return result, pos


def _decode_zigzag_i32(v: int) -> int:
    return (v >> 1) ^ -(v & 1)


def _decode_zigzag_i64(v: int) -> int:
    return (v >> 1) ^ -(v & 1)


class CompactWriter:
    """Simple TCompactProtocol writer."""

    def __init__(self):
        self._buf = io.BytesIO()
        self._last_field_id_stack = [0]

    def _write(self, data: bytes):
        self._buf.write(data)

    def _write_type_and_field(self, field_type: int, field_id: int):
        last_id = self._last_field_id_stack[-1]
        delta = field_id - last_id
        if 0 < delta <= 15:
            self._write(bytes([(delta << 4) | field_type]))
        else:
            self._write(bytes([field_type]))
            self._write(_encode_zigzag_i32(field_id))
        self._last_field_id_stack[-1] = field_id

    def write_message_begin(self, name: str, msg_type: int, seq_id: int):
        """TCompact message header: protocol_id(0x82) | version(0x21) | msg_type_shifted | seq_id | name"""
        self._write(bytes([0x82]))  # protocol id
        self._write(bytes([0x21 | (msg_type << 5)]))  # version + type
        self._write(_encode_zigzag_i32(seq_id))
        name_bytes = name.encode("utf-8")
        self._write(_encode_varint(len(name_bytes)))
        self._write(name_bytes)

    def write_struct_begin(self):
        self._last_field_id_stack.append(0)

    def write_struct_end(self):
        if len(self._last_field_id_stack) > 1:
            self._last_field_id_stack.pop()

    def write_field_begin(self, field_type: int, field_id: int):
        self._write_type_and_field(field_type, field_id)

    def write_field_stop(self):
        self._write(bytes([TYPE_STOP]))

    def write_string(self, value: str):
        encoded = value.encode("utf-8")
        self._write(_encode_varint(len(encoded)))
        self._write(encoded)

    def write_i32(self, value: int):
        self._write(_encode_zigzag_i32(value))

    def write_i64(self, value: int):
        self._write(_encode_zigzag_i64(value))

    def write_message_end(self):
        pass  # no-op in compact

    def getvalue(self) -> bytes:
        return self._buf.getvalue()


class CompactReader:
    """Simple TCompactProtocol reader."""

    def __init__(self, data: bytes):
        self._buf = data
        self._pos = 0
        self._last_field_id_stack = [0]

    def _read(self, n: int) -> bytes:
        if self._pos + n > len(self._buf):
            raise ValueError(
                f"Unexpected end of buffer: need {n} bytes at pos {self._pos}, "
                f"buf len {len(self._buf)}"
            )
        chunk = self._buf[self._pos:self._pos + n]
        self._pos += n
        return chunk

    def read_message_begin(self):
        proto_id = self._buf[self._pos]; self._pos += 1
        if proto_id != 0x82:
            raise ValueError(f"Bad protocol id: 0x{proto_id:02x}")
        ver_type = self._buf[self._pos]; self._pos += 1
        msg_type = (ver_type >> 5) & 0x07
        seq_id_raw, self._pos = _decode_varint(self._buf, self._pos)
        seq_id = _decode_zigzag_i32(seq_id_raw)
        name_len, self._pos = _decode_varint(self._buf, self._pos)
        name = self._buf[self._pos:self._pos + name_len].decode("utf-8")
        self._pos += name_len
        return name, msg_type, seq_id

    def read_struct_begin(self):
        self._last_field_id_stack.append(0)

    def read_struct_end(self):
        if len(self._last_field_id_stack) > 1:
            self._last_field_id_stack.pop()

    def read_field_begin(self):
        """Return (field_type, field_id). field_type=0 means STOP."""
        b = self._buf[self._pos]; self._pos += 1
        field_type = b & 0x0F
        if field_type == TYPE_STOP:
            return TYPE_STOP, 0
        delta = (b >> 4) & 0x0F
        if delta == 0:
            field_id_raw, self._pos = _decode_varint(self._buf, self._pos)
            field_id = _decode_zigzag_i32(field_id_raw)
        else:
            field_id = self._last_field_id_stack[-1] + delta
        self._last_field_id_stack[-1] = field_id
        return field_type, field_id

    def skip(self, field_type: int):
        """Skip a field of given type."""
        if field_type == TYPE_BOOL_T or field_type == TYPE_BOOL_F:
            pass  # already consumed in read_field_begin for bool
        elif field_type == TYPE_I8:
            self._pos += 1
        elif field_type in (TYPE_I16, TYPE_I32, TYPE_I64):
            _, self._pos = _decode_varint(self._buf, self._pos)
        elif field_type == TYPE_DOUBLE:
            self._pos += 8
        elif field_type == TYPE_BINARY:
            length, self._pos = _decode_varint(self._buf, self._pos)
            self._pos += length
        elif field_type == TYPE_LIST or field_type == TYPE_SET:
            b = self._buf[self._pos]; self._pos += 1
            elem_type = b & 0x0F
            size = (b >> 4) & 0x0F
            if size == 15:
                size, self._pos = _decode_varint(self._buf, self._pos)
            for _ in range(size):
                self.skip(elem_type)
        elif field_type == TYPE_MAP:
            size, self._pos = _decode_varint(self._buf, self._pos)
            if size > 0:
                types = self._buf[self._pos]; self._pos += 1
                key_type = (types >> 4) & 0x0F
                val_type = types & 0x0F
                for _ in range(size):
                    self.skip(key_type)
                    self.skip(val_type)
        elif field_type == TYPE_STRUCT:
            self.read_struct_begin()
            while True:
                ft, _ = self.read_field_begin()
                if ft == TYPE_STOP:
                    break
                self.skip(ft)
            self.read_struct_end()

    def read_string(self) -> str:
        length, self._pos = _decode_varint(self._buf, self._pos)
        data = self._buf[self._pos:self._pos + length]
        self._pos += length
        return data.decode("utf-8")

    def read_i32(self) -> int:
        raw, self._pos = _decode_varint(self._buf, self._pos)
        return _decode_zigzag_i32(raw)

    def read_i64(self) -> int:
        raw, self._pos = _decode_varint(self._buf, self._pos)
        return _decode_zigzag_i64(raw)

    def read_exception(self):
        """Read SystemException or LogicException struct fields."""
        self.read_struct_begin()
        code = None
        message = None
        while True:
            ft, fid = self.read_field_begin()
            if ft == TYPE_STOP:
                break
            if fid == 1 and ft == TYPE_I32:
                code = self.read_i32()
            elif fid == 2 and ft == TYPE_BINARY:
                message = self.read_string()
            else:
                self.skip(ft)
        self.read_struct_end()
        return code, message


# ────────────────────────────────────────────────
# TFramedTransport 封装
# ────────────────────────────────────────────────

def framed_encode(payload: bytes) -> bytes:
    """Prepend 4-byte big-endian frame length (TFramedTransport)."""
    return struct.pack(">I", len(payload)) + payload


def framed_decode(data: bytes) -> bytes:
    """Strip 4-byte big-endian frame length and return payload."""
    if len(data) < 4:
        raise ValueError("Response too short")
    frame_size = struct.unpack(">I", data[:4])[0]
    return data[4:4 + frame_size]


# ────────────────────────────────────────────────
# Cookie 构建
# ────────────────────────────────────────────────

def build_cookie(device_id: str = None,
                 app_version_code: str = "7081400",
                 os_version: str = "14",
                 device_model: str = "Pixel6-Google",
                 channel: str = "official",
                 time_zone: str = "Asia/Shanghai",
                 access_token: str = None) -> str:
    """
    构造 Cookie 字符串，模拟 com.baicizhan.client.business.thrift.b 的逻辑。

    来源字段：
        device_name  = "android/" + Build.MODEL + " - " + Build.MANUFACTURER（去空格）
        version      = Build.VERSION.RELEASE（Android 系统版本）
        app_name     = PackageInfo.versionCode
        channel      = APK 渠道号
        client_time  = System.currentTimeMillis() / 1000
        device_id    = Settings.Secure.android_id
        serial       = 前5位+后5位 device_id + 日期 ddHHmmss
        time_zone    = TimeZone.getDefault().getID()
        access_token = 登录成功后携带（可选）
    """
    if device_id is None:
        device_id = uuid.uuid4().hex[:16]

    now = int(time.time())
    dt = datetime.now()
    date_part = dt.strftime("%d%H%M%S")

    if len(device_id) >= 10:
        serial = device_id[:5] + device_id[-5:] + date_part
    else:
        serial = device_id + date_part

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

    pairs = []
    for k, v in fields.items():
        pairs.append(f"{k}={urllib.parse.quote(v, safe='')}")
    return "; ".join(pairs)


# ────────────────────────────────────────────────
# Thrift 消息构建
# ────────────────────────────────────────────────

def build_send_sms_verify_code(phone: str, verify_type: int = 5) -> bytes:
    """
    构造 send_sms_verify_code 请求体（TCompactProtocol 编码）。

    参数：
        phone        手机号，如 "13812345678"
        verify_type  验证码用途（5 = LOGIN_OR_REG）
    """
    w = CompactWriter()
    w.write_message_begin("send_sms_verify_code", MSG_CALL, 0)
    w.write_struct_begin()               # send_sms_verify_code_args

    # field 1: phone (string)
    w.write_field_begin(TYPE_BINARY, 1)
    w.write_string(phone)

    # field 2: verify_type (i32)
    w.write_field_begin(TYPE_I32, 2)
    w.write_i32(verify_type)

    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()
    return w.getvalue()


def build_login_with_phone(phone: str, verify_code: str, device_id: str) -> bytes:
    """
    构造 login_with_phone 请求体（TCompactProtocol 编码）。

    参数：
        phone        手机号
        verify_code  短信验证码（6位数字字符串）
        device_id    设备 android_id
    """
    w = CompactWriter()
    w.write_message_begin("login_with_phone", MSG_CALL, 0)
    w.write_struct_begin()               # login_with_phone_args

    # field 1: request (PhoneLoginRequest struct)
    w.write_field_begin(TYPE_STRUCT, 1)
    w.write_struct_begin()               # PhoneLoginRequest

    # PhoneLoginRequest.field 1: verify_code_request (PhoneVerifyCodeRequest struct)
    w.write_field_begin(TYPE_STRUCT, 1)
    w.write_struct_begin()               # PhoneVerifyCodeRequest

    # PhoneVerifyCodeRequest.field 1: phone
    w.write_field_begin(TYPE_BINARY, 1)
    w.write_string(phone)

    # PhoneVerifyCodeRequest.field 2: verify_code
    w.write_field_begin(TYPE_BINARY, 2)
    w.write_string(verify_code)

    w.write_field_stop()
    w.write_struct_end()                 # end PhoneVerifyCodeRequest

    # PhoneLoginRequest.field 3: device
    w.write_field_begin(TYPE_BINARY, 3)
    w.write_string(device_id)

    w.write_field_stop()
    w.write_struct_end()                 # end PhoneLoginRequest

    w.write_field_stop()
    w.write_struct_end()                 # end login_with_phone_args
    w.write_message_end()
    return w.getvalue()


# ────────────────────────────────────────────────
# 响应解析
# ────────────────────────────────────────────────

def parse_user_login_result(payload: bytes) -> dict:
    """
    解析 login_with_phone 响应。

    UserLoginResult 字段：
        1: access_token   (string)  ← Session ID
        2: is_new_user    (i32)
        3: email          (string)
        4: public_key     (string)
        5: last_device    (string)
        6: unique_id      (i64)
        7: phone          (string)
        8: force_bind_phone (i32)
        9: role_new       (i32)
       10: role           (struct)
       11: game_mode      (i32)
    """
    r = CompactReader(payload)
    name, msg_type, seq_id = r.read_message_begin()

    if msg_type == MSG_EXCEPTION:
        # TApplicationException
        r.read_struct_begin()
        msg = None
        code = None
        while True:
            ft, fid = r.read_field_begin()
            if ft == TYPE_STOP:
                break
            if fid == 1 and ft == TYPE_BINARY:
                msg = r.read_string()
            elif fid == 2 and ft == TYPE_I32:
                code = r.read_i32()
            else:
                r.skip(ft)
        r.read_struct_end()
        raise RuntimeError(f"TApplicationException code={code} msg={msg}")

    r.read_struct_begin()   # result struct
    result = {}
    exception_code = None
    exception_msg = None

    while True:
        ft, fid = r.read_field_begin()
        if ft == TYPE_STOP:
            break

        if fid == 0:
            # success: UserLoginResult struct
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
                    # skip role struct
                    r.skip(TYPE_STRUCT)
                elif fid2 == 11 and ft2 == TYPE_I32:
                    result["game_mode"] = r.read_i32()
                else:
                    r.skip(ft2)
            r.read_struct_end()

        elif fid == 1:
            # SystemException (field 1)
            code, msg = r.read_exception()
            exception_code = code
            exception_msg = f"SystemException: code={code} msg={msg}"

        elif fid == 2:
            # LogicException (field 2)
            code, msg = r.read_exception()
            exception_code = code
            exception_msg = f"LogicException: code={code} msg={msg}"

        else:
            r.skip(ft)

    r.read_struct_end()

    if exception_msg:
        raise RuntimeError(exception_msg)
    return result


# ────────────────────────────────────────────────
# HTTP 请求封装
# ────────────────────────────────────────────────

BASE_URL = "https://passport.baicizhan.com"
RPC_PATH = "/rpc/unified_user_service"


def thrift_post(method_name: str, payload: bytes, cookie: str,
                base_url: str = BASE_URL) -> bytes:
    """
    发送一次 Thrift HTTP 请求。

    URL 格式：{base_url}{rpc_path}/{method_name}/{timestamp_ms}
    Body 格式：[4字节大端帧长度][TCompact编码数据]
    """
    ts_ms = int(time.time() * 1000)
    url = f"{base_url}{RPC_PATH}/{method_name}/{ts_ms}"

    body = framed_encode(payload)

    headers = {
        "Content-Type": "application/x-thrift",
        "Cookie": cookie,
        "User-Agent": "okhttp/4.9.3",
    }

    resp = requests.post(url, data=body, headers=headers, timeout=15)
    resp.raise_for_status()
    return framed_decode(resp.content)


# ────────────────────────────────────────────────
# 主登录流程
# ────────────────────────────────────────────────

class BczPhoneLogin:
    """
    百词斩手机验证码登录客户端。

    usage:
        client = BczPhoneLogin()
        client.send_sms_code("13812345678")
        result = client.login("13812345678", "123456")
        print(result["access_token"])   # Session ID
    """

    def __init__(self,
                 device_id: str = None,
                 app_version_code: str = "7081400",
                 os_version: str = "14",
                 device_model: str = "Pixel6-Google",
                 channel: str = "official",
                 time_zone: str = "Asia/Shanghai"):

        self.device_id = device_id or uuid.uuid4().hex[:16]
        self.app_version_code = app_version_code
        self.os_version = os_version
        self.device_model = device_model
        self.channel = channel
        self.time_zone = time_zone
        self.access_token = None

    def _cookie(self) -> str:
        return build_cookie(
            device_id=self.device_id,
            app_version_code=self.app_version_code,
            os_version=self.os_version,
            device_model=self.device_model,
            channel=self.channel,
            time_zone=self.time_zone,
            access_token=self.access_token,
        )

    def send_sms_code(self, phone: str, verify_type: int = 5) -> bool:
        """
        步骤一：发送短信验证码。

        参数：
            phone        手机号（如 "13812345678"）
            verify_type  5 = 登录/注册（默认），其他：1=注册, 2=重置密码

        返回：
            True 表示成功（HTTP 200 + 无 Thrift 异常）
        """
        payload = build_send_sms_verify_code(phone, verify_type)
        print(f"[1/2] 发送验证码到 {phone}（verify_type={verify_type}）...")

        resp_bytes = thrift_post("send_sms_verify_code", payload, self._cookie())

        # 解析响应：send_sms_verify_code 返回 void，只检查是否有异常
        r = CompactReader(resp_bytes)
        name, msg_type, seq_id = r.read_message_begin()
        if msg_type == MSG_EXCEPTION:
            r.read_struct_begin()
            msg = None
            while True:
                ft, fid = r.read_field_begin()
                if ft == TYPE_STOP:
                    break
                if fid == 1 and ft == TYPE_BINARY:
                    msg = r.read_string()
                else:
                    r.skip(ft)
            r.read_struct_end()
            raise RuntimeError(f"发送验证码失败（TApplicationException）：{msg}")

        r.read_struct_begin()
        while True:
            ft, fid = r.read_field_begin()
            if ft == TYPE_STOP:
                break
            if fid == 1:
                code, msg = r.read_exception()
                raise RuntimeError(f"发送验证码失败（SystemException）：code={code} msg={msg}")
            elif fid == 2:
                code, msg = r.read_exception()
                raise RuntimeError(f"发送验证码失败（LogicException）：code={code} msg={msg}")
            else:
                r.skip(ft)
        r.read_struct_end()

        print("[1/2] 验证码发送成功，请查收短信。")
        return True

    def login(self, phone: str, verify_code: str) -> dict:
        """
        步骤二：使用手机号和验证码登录。

        参数：
            phone        手机号
            verify_code  收到的短信验证码（6位数字字符串）

        返回：
            dict，包含 access_token、unique_id、phone 等字段
            其中 access_token 即为 Session ID，后续请求在 Cookie 携带即可
        """
        payload = build_login_with_phone(phone, verify_code, self.device_id)
        print(f"[2/2] 使用验证码 {verify_code} 登录 {phone}...")

        resp_bytes = thrift_post("login_with_phone", payload, self._cookie())
        result = parse_user_login_result(resp_bytes)

        self.access_token = result.get("access_token")
        print("[2/2] 登录成功！")
        print(f"  access_token : {result.get('access_token')}")
        print(f"  unique_id    : {result.get('unique_id')}")
        print(f"  phone        : {result.get('phone')}")
        print(f"  email        : {result.get('email')}")
        print(f"  is_new_user  : {result.get('is_new_user')}")
        return result


# ────────────────────────────────────────────────
# 命令行入口
# ────────────────────────────────────────────────

def main():
    parser = argparse.ArgumentParser(description="百词斩手机验证码登录")
    parser.add_argument("--phone", required=True, help="手机号，如 13812345678")
    parser.add_argument("--device-id", default=None,
                        help="设备 ID（Android ID），随机生成则留空")
    parser.add_argument("--channel", default="official", help="渠道号（默认 official）")
    parser.add_argument("--time-zone", default="Asia/Shanghai", help="时区（默认 Asia/Shanghai）")
    parser.add_argument("--verify-type", type=int, default=5,
                        help="验证码类型：5=登录（默认），1=注册，2=重置密码")
    args = parser.parse_args()

    client = BczPhoneLogin(
        device_id=args.device_id,
        channel=args.channel,
        time_zone=args.time_zone,
    )

    # 第一步：发送验证码
    client.send_sms_code(args.phone, args.verify_type)

    # 第二步：输入验证码并登录
    verify_code = input("请输入收到的短信验证码：").strip()
    result = client.login(args.phone, verify_code)

    print("\n========== 登录结果 ==========")
    for k, v in result.items():
        print(f"  {k}: {v}")
    print("================================")
    print(f"\nSession ID (access_token):\n{result.get('access_token')}")


if __name__ == "__main__":
    main()
