"""
服务基类与响应解析工具 / Service base-class and generic response-parsing utilities.

All concrete service classes inherit from :class:`_BaseService` which provides:
- ``_call(method, writer_fn)`` – serialise, send, deserialise
- ``_parse_response_result`` – unwrap the outer reply struct
- ``_parse_struct`` / ``_parse_value`` – generic recursive TCompact parsers
"""

from __future__ import annotations

from typing import Any, Callable, Optional

from .._exceptions import BczApiError, BczTransportError
from .._protocol import (
    MSG_CALL,
    MSG_EXCEPTION,
    TYPE_BINARY,
    TYPE_BOOL_F,
    TYPE_BOOL_T,
    TYPE_DOUBLE,
    TYPE_I16,
    TYPE_I32,
    TYPE_I64,
    TYPE_I8,
    TYPE_LIST,
    TYPE_MAP,
    TYPE_SET,
    TYPE_STOP,
    TYPE_STRUCT,
    CompactReader,
    CompactWriter,
    _decode_varint,
)
from .._session import BczSession
from .._transport import make_url, post_thrift


# ---------------------------------------------------------------------------
# Generic response parsers
# ---------------------------------------------------------------------------

def _parse_value(reader: CompactReader, ftype: int) -> Any:
    """Recursively parse a single Thrift value of *ftype*.
    递归解析指定类型的 Thrift 值。"""
    if ftype == TYPE_BOOL_T:
        return True
    if ftype == TYPE_BOOL_F:
        return False
    if ftype == TYPE_I8:
        return reader.read_i8()
    if ftype in (TYPE_I16, TYPE_I32):
        return reader.read_i32()
    if ftype == TYPE_I64:
        return reader.read_i64()
    if ftype == TYPE_DOUBLE:
        return reader.read_double()
    if ftype == TYPE_BINARY:
        return reader.read_string()
    if ftype in (TYPE_LIST, TYPE_SET):
        elem_type, size = reader.read_list_begin()
        return [_parse_value(reader, elem_type) for _ in range(size)]
    if ftype == TYPE_MAP:
        key_type, val_type, size = reader.read_map_begin()
        result: dict = {}
        for _ in range(size):
            k = _parse_value(reader, key_type)
            v = _parse_value(reader, val_type)
            result[k] = v
        return result
    if ftype == TYPE_STRUCT:
        return _parse_struct(reader)
    # Unknown type – skip and return None
    reader.skip(ftype)
    return None


def _parse_struct(reader: CompactReader) -> dict:
    """Parse an arbitrary Thrift struct into ``{field_id: value}``.
    将任意 Thrift struct 解析为 ``{字段序号: 值}`` 字典。"""
    result: dict = {}
    reader.read_struct_begin()
    while True:
        ft, fid = reader.read_field_begin()
        if ft == TYPE_STOP:
            break
        result[fid] = _parse_value(reader, ft)
    reader.read_struct_end()
    return result


def _check_response(reader: CompactReader, method_name: str) -> None:
    """Read the message header and raise :class:`BczApiError` on exceptions.
    读取消息头，遇到异常消息类型时抛出 BczApiError。"""
    name, msg_type, _seq = reader.read_message_begin()
    if msg_type == MSG_EXCEPTION:
        reader.read_struct_begin()
        err_msg, err_code = "", 0
        while True:
            ft, fid = reader.read_field_begin()
            if ft == TYPE_STOP:
                break
            if fid == 1 and ft == TYPE_BINARY:
                err_msg = reader.read_string()
            elif fid == 2 and ft == TYPE_I32:
                err_code = reader.read_i32()
            else:
                reader.skip(ft)
        reader.read_struct_end()
        raise BczApiError(err_code, err_msg or f"Exception in {method_name}")


def _map_fields(raw: Any, field_map: dict) -> dict:
    """Map integer Thrift field IDs to English parameter names.

    将整数 Thrift 字段 ID 映射为英文参数名。
    Only fields present in *raw* **and** listed in *field_map* are included.

    :param raw: Raw ``{field_id: value}`` dict returned by ``_parse_struct``.
    :param field_map: Mapping of ``{int field_id: str field_name}``.
    :returns: ``{str field_name: value}`` dict.
    """
    if not isinstance(raw, dict):
        return {}
    return {field_map[fid]: raw[fid] for fid in field_map if fid in raw}


def _parse_response_result(reader: CompactReader) -> Any:
    """Parse the reply struct.

    解析 Thrift 方法回复结构体。

    Field 0 carries the success return value (may be absent for void methods).
    Fields 1+ carry declared exceptions; if present we raise BczApiError.
    """
    result = _parse_struct(reader)
    if not result:
        return None
    # Declared exceptions are in fields 1 and above
    for fid, val in result.items():
        if fid >= 1:
            if isinstance(val, dict):
                msg = val.get(2) or val.get(1) or "Unknown API error"
                code = val.get(1, 0) if isinstance(val.get(1), int) else 0
                raise BczApiError(code, str(msg))
    return result.get(0)


# ---------------------------------------------------------------------------
# Base service
# ---------------------------------------------------------------------------

class _BaseService:
    """Abstract base for all BCZ service wrappers.
    所有 BCZ 服务封装的抽象基类。"""

    _host: str = ""
    _service: str = ""

    def __init__(self, session: BczSession) -> None:
        self._session = session

    # ------------------------------------------------------------------
    # Core RPC call helper
    # ------------------------------------------------------------------

    def _call(
        self,
        method: str,
        write_args: Callable[[CompactWriter], None],
    ) -> Any:
        """Encode, send, decode a single Thrift RPC call.
        编码、发送并解码单次 Thrift RPC 调用。"""
        w = CompactWriter()
        w.write_message_begin(method, MSG_CALL, 0)
        w.write_struct_begin()
        write_args(w)
        w.write_field_stop()
        w.write_struct_end()
        w.write_message_end()

        url = make_url(self._host, self._service, method)
        raw = post_thrift(
            url, w.getvalue(), self._session.cookie(), self._session.timeout
        )

        r = CompactReader(raw)
        _check_response(r, method)
        return _parse_response_result(r)

    # ------------------------------------------------------------------
    # Convenience field writers
    # ------------------------------------------------------------------

    @staticmethod
    def _write_string(w: CompactWriter, fid: int, value: str) -> None:
        w.write_field_begin(TYPE_BINARY, fid)
        w.write_string(value)

    @staticmethod
    def _write_i32(w: CompactWriter, fid: int, value: int) -> None:
        w.write_field_begin(TYPE_I32, fid)
        w.write_i32(value)

    @staticmethod
    def _write_i64(w: CompactWriter, fid: int, value: int) -> None:
        w.write_field_begin(TYPE_I64, fid)
        w.write_i64(value)

    @staticmethod
    def _write_bool(w: CompactWriter, fid: int, value: bool) -> None:
        w.write_bool(fid, value)

    @staticmethod
    def _write_double(w: CompactWriter, fid: int, value: float) -> None:
        w.write_field_begin(TYPE_DOUBLE, fid)
        w.write_double(value)

    @staticmethod
    def _write_list_i32(w: CompactWriter, fid: int, values: list) -> None:
        w.write_field_begin(TYPE_LIST, fid)
        w.write_list_begin(TYPE_I32, len(values))
        for v in values:
            w.write_i32(v)

    @staticmethod
    def _write_list_string(w: CompactWriter, fid: int, values: list) -> None:
        w.write_field_begin(TYPE_LIST, fid)
        w.write_list_begin(TYPE_BINARY, len(values))
        for v in values:
            w.write_string(str(v))

    @staticmethod
    def _write_list_struct(
        w: CompactWriter, fid: int, items: list, item_writer: Callable
    ) -> None:
        w.write_field_begin(TYPE_LIST, fid)
        w.write_list_begin(TYPE_STRUCT, len(items))
        for item in items:
            w.write_struct_begin()
            item_writer(w, item)
            w.write_field_stop()
            w.write_struct_end()
