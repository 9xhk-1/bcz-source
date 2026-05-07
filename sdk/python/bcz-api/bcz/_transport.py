"""
HTTP 传输层 / HTTP transport layer.

Wraps POST requests with TFramedTransport framing (4-byte big-endian length
prefix) over HTTPS.
"""

from __future__ import annotations

import struct
import time
from datetime import datetime
from typing import Optional
from urllib.parse import quote

import requests

from ._exceptions import BczTransportError


def build_cookie(
    device_id: str,
    app_version_code: str = "7081400",
    os_version: str = "14",
    device_model: str = "Pixel6-Google",
    channel: str = "official",
    time_zone: str = "Asia/Shanghai",
    access_token: Optional[str] = None,
) -> str:
    """Build the Cookie header expected by BCZ servers.

    构造 BCZ 服务器所需的 Cookie 头。

    The serial is derived from the device_id and current time so that each
    request carries a fresh value without requiring round-trips to a server.
    """
    now = datetime.now()
    serial = device_id[:5] + device_id[-5:] + now.strftime("%d%H%M%S")
    client_time = str(int(time.time()))

    def _enc(v: str) -> str:
        return quote(str(v), safe="")

    parts = [
        f"device_name={_enc('android/' + device_model)}",
        f"version={_enc(os_version)}",
        f"app_name={_enc(app_version_code)}",
        f"channel={_enc(channel)}",
        f"client_time={_enc(client_time)}",
        f"device_id={_enc(device_id)}",
        f"serial={_enc(serial)}",
        f"time_zone={_enc(time_zone)}",
    ]
    if access_token:
        parts.append(f"access_token={_enc(access_token)}")
    return "; ".join(parts)


def post_thrift(url: str, payload: bytes, cookie: str, timeout: int = 15) -> bytes:
    """Send *payload* as a TFramedTransport Thrift request and return the body.

    发送 TFramedTransport 格式的 Thrift 请求并返回响应体（已去除帧头）。

    The frame format is: 4-byte big-endian length + payload.
    The response is stripped of its own 4-byte header before returning.
    """
    framed = struct.pack(">I", len(payload)) + payload
    headers = {
        "Content-Type": "application/x-thrift",
        "Cookie": cookie,
        "User-Agent": "okhttp/4.10.0",
        "Accept": "application/x-thrift",
    }
    try:
        resp = requests.post(url, data=framed, headers=headers, timeout=timeout)
        resp.raise_for_status()
    except requests.exceptions.HTTPError as exc:
        raise BczTransportError(f"HTTP error: {exc}") from exc
    except requests.exceptions.RequestException as exc:
        raise BczTransportError(f"Network error: {exc}") from exc

    body = resp.content
    if len(body) < 4:
        raise BczTransportError("Response too short (no frame header)")
    return body[4:]


def make_url(host: str, service: str, method: str) -> str:
    """Construct the RPC endpoint URL with a millisecond timestamp suffix.

    构造包含毫秒时间戳后缀的 RPC 请求 URL。
    """
    ts = int(time.time() * 1000)
    return f"{host}/rpc/{service}/{method}/{ts}"
