"""
纯 Python TCompactProtocol 编解码器 / Pure-Python TCompactProtocol encoder/decoder.

Implements the Apache Thrift Compact binary encoding without any dependency on
the official thrift library.

Reference:
  https://github.com/apache/thrift/blob/master/doc/specs/thrift-compact-protocol.md
"""

from __future__ import annotations

import struct
from typing import List, Optional, Tuple

# ---------------------------------------------------------------------------
# Type constants
# ---------------------------------------------------------------------------
TYPE_STOP = 0
TYPE_BOOL_T = 1
TYPE_BOOL_F = 2
TYPE_I8 = 3
TYPE_I16 = 4
TYPE_I32 = 5
TYPE_I64 = 6
TYPE_DOUBLE = 7
TYPE_BINARY = 8   # string and bytes share this wire type
TYPE_LIST = 9
TYPE_SET = 10
TYPE_MAP = 11
TYPE_STRUCT = 12

# Message types
MSG_CALL = 1
MSG_REPLY = 2
MSG_EXCEPTION = 3
MSG_ONEWAY = 4

# Protocol framing
PROTOCOL_ID = 0x82
VERSION = 0x01


# ---------------------------------------------------------------------------
# Varint helpers
# ---------------------------------------------------------------------------

def _encode_varint(value: int) -> bytes:
    """Unsigned LEB-128 (little-endian base-128) encoding."""
    buf: List[int] = []
    value = value & 0xFFFFFFFFFFFFFFFF  # treat as unsigned 64-bit
    while True:
        byte = value & 0x7F
        value >>= 7
        if value:
            buf.append(byte | 0x80)
        else:
            buf.append(byte)
            break
    return bytes(buf)


def _decode_varint(buf: bytes, pos: int) -> Tuple[int, int]:
    """Decode unsigned LEB-128 from *buf* starting at *pos*.
    Returns (value, new_pos)."""
    result = 0
    shift = 0
    while True:
        byte = buf[pos]
        pos += 1
        result |= (byte & 0x7F) << shift
        if not (byte & 0x80):
            break
        shift += 7
    return result, pos


def _zigzag_encode_i32(n: int) -> int:
    return ((n << 1) ^ (n >> 31)) & 0xFFFFFFFF


def _zigzag_encode_i64(n: int) -> int:
    return ((n << 1) ^ (n >> 63)) & 0xFFFFFFFFFFFFFFFF


def _zigzag_decode(v: int) -> int:
    return (v >> 1) ^ -(v & 1)


# ---------------------------------------------------------------------------
# CompactWriter
# ---------------------------------------------------------------------------

class CompactWriter:
    """Serialise values into TCompact binary format.

    Usage::

        w = CompactWriter()
        w.write_message_begin("myMethod", MSG_CALL, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_I32, 1)
        w.write_i32(42)
        w.write_field_stop()
        w.write_struct_end()
        w.write_message_end()
        payload = w.getvalue()
    """

    def __init__(self) -> None:
        self._buf: bytearray = bytearray()
        # Stack of last field IDs for delta encoding
        self._last_field_ids: List[int] = [0]

    # ------------------------------------------------------------------
    # Message framing
    # ------------------------------------------------------------------

    def write_message_begin(self, name: str, msg_type: int, seq_id: int) -> None:
        name_bytes = name.encode("utf-8")
        self._buf.append(PROTOCOL_ID)
        self._buf.append(VERSION | (msg_type << 5))
        self._buf.extend(_encode_varint(_zigzag_encode_i32(seq_id)))
        self._buf.extend(_encode_varint(len(name_bytes)))
        self._buf.extend(name_bytes)

    def write_message_end(self) -> None:
        pass  # no-op in compact protocol

    # ------------------------------------------------------------------
    # Struct
    # ------------------------------------------------------------------

    def write_struct_begin(self) -> None:
        self._last_field_ids.append(0)

    def write_struct_end(self) -> None:
        self._last_field_ids.pop()

    def write_field_begin(self, ftype: int, fid: int) -> None:
        last = self._last_field_ids[-1]
        delta = fid - last
        if 0 < delta <= 15:
            self._buf.append((delta << 4) | ftype)
        else:
            self._buf.append(ftype)
            self._buf.extend(_encode_varint(_zigzag_encode_i32(fid)))
        self._last_field_ids[-1] = fid

    def write_field_stop(self) -> None:
        self._buf.append(TYPE_STOP)

    # ------------------------------------------------------------------
    # Boolean (special: type is encoded in field header)
    # ------------------------------------------------------------------

    def write_bool(self, fid: int, value: bool) -> None:
        ftype = TYPE_BOOL_T if value else TYPE_BOOL_F
        self.write_field_begin(ftype, fid)
        # No additional byte needed; value is in the type nibble.

    # ------------------------------------------------------------------
    # Numeric types
    # ------------------------------------------------------------------

    def write_i8(self, value: int) -> None:
        self._buf.append(value & 0xFF)

    def write_i16(self, value: int) -> None:
        self._buf.extend(_encode_varint(_zigzag_encode_i32(value)))

    def write_i32(self, value: int) -> None:
        self._buf.extend(_encode_varint(_zigzag_encode_i32(value)))

    def write_i64(self, value: int) -> None:
        self._buf.extend(_encode_varint(_zigzag_encode_i64(value)))

    def write_double(self, value: float) -> None:
        self._buf.extend(struct.pack("<d", value))

    # ------------------------------------------------------------------
    # Binary / String
    # ------------------------------------------------------------------

    def write_bytes(self, data: bytes) -> None:
        self._buf.extend(_encode_varint(len(data)))
        self._buf.extend(data)

    def write_string(self, value: str) -> None:
        self.write_bytes(value.encode("utf-8"))

    # ------------------------------------------------------------------
    # Collections
    # ------------------------------------------------------------------

    def write_list_begin(self, elem_type: int, size: int) -> None:
        if size < 15:
            self._buf.append((size << 4) | elem_type)
        else:
            self._buf.append(0xF0 | elem_type)
            self._buf.extend(_encode_varint(size))

    def write_set_begin(self, elem_type: int, size: int) -> None:
        self.write_list_begin(elem_type, size)

    def write_map_begin(self, key_type: int, val_type: int, size: int) -> None:
        if size == 0:
            self._buf.append(0)
        else:
            self._buf.extend(_encode_varint(size))
            self._buf.append((key_type << 4) | val_type)

    # ------------------------------------------------------------------
    # Output
    # ------------------------------------------------------------------

    def getvalue(self) -> bytes:
        return bytes(self._buf)


# ---------------------------------------------------------------------------
# CompactReader
# ---------------------------------------------------------------------------

class CompactReader:
    """Deserialise values from TCompact binary data.

    Usage::

        r = CompactReader(raw_bytes)
        name, msg_type, seq_id = r.read_message_begin()
        r.read_struct_begin()
        ftype, fid = r.read_field_begin()
        value = r.read_i32()
        r.read_struct_end()
    """

    def __init__(self, data: bytes) -> None:
        self._buf = data
        self._pos = 0
        # Stack of last field IDs for delta-field decoding
        self._last_field_ids: List[int] = [0]
        # Pending bool value (bool is encoded in the field-type nibble)
        self._bool_value: Optional[bool] = None

    # ------------------------------------------------------------------
    # Low-level helpers
    # ------------------------------------------------------------------

    def _read_byte(self) -> int:
        b = self._buf[self._pos]
        self._pos += 1
        return b

    def _read_varint(self) -> int:
        v, self._pos = _decode_varint(self._buf, self._pos)
        return v

    def _read_zigzag_i32(self) -> int:
        return _zigzag_decode(self._read_varint())

    def _read_zigzag_i64(self) -> int:
        return _zigzag_decode(self._read_varint())

    # ------------------------------------------------------------------
    # Message framing
    # ------------------------------------------------------------------

    def read_message_begin(self) -> Tuple[str, int, int]:
        proto_id = self._read_byte()
        if proto_id != PROTOCOL_ID:
            raise ValueError(f"Bad protocol id: 0x{proto_id:02x}")
        version_type = self._read_byte()
        msg_type = (version_type >> 5) & 0x07
        seq_id = self._read_zigzag_i32()
        name_len = self._read_varint()
        name = self._buf[self._pos:self._pos + name_len].decode("utf-8")
        self._pos += name_len
        return name, msg_type, seq_id

    def read_message_end(self) -> None:
        pass

    # ------------------------------------------------------------------
    # Struct
    # ------------------------------------------------------------------

    def read_struct_begin(self) -> None:
        self._last_field_ids.append(0)

    def read_struct_end(self) -> None:
        if self._last_field_ids:
            self._last_field_ids.pop()

    def read_field_begin(self) -> Tuple[int, int]:
        """Returns (field_type, field_id). field_type==TYPE_STOP → end of struct."""
        byte = self._read_byte()
        ftype = byte & 0x0F
        if ftype == TYPE_STOP:
            return TYPE_STOP, 0
        delta = (byte >> 4) & 0x0F
        if delta == 0:
            fid = self._read_zigzag_i32()
        else:
            fid = self._last_field_ids[-1] + delta
        self._last_field_ids[-1] = fid
        if ftype in (TYPE_BOOL_T, TYPE_BOOL_F):
            self._bool_value = (ftype == TYPE_BOOL_T)
        return ftype, fid

    # ------------------------------------------------------------------
    # Boolean
    # ------------------------------------------------------------------

    def read_bool(self, ftype: int) -> bool:
        if self._bool_value is not None:
            v = self._bool_value
            self._bool_value = None
            return v
        b = self._read_byte()
        return b == 1

    # ------------------------------------------------------------------
    # Numeric
    # ------------------------------------------------------------------

    def read_i8(self) -> int:
        b = self._read_byte()
        return b if b < 128 else b - 256

    def read_i16(self) -> int:
        return self._read_zigzag_i32()

    def read_i32(self) -> int:
        return self._read_zigzag_i32()

    def read_i64(self) -> int:
        return self._read_zigzag_i64()

    def read_double(self) -> float:
        v = struct.unpack_from("<d", self._buf, self._pos)[0]
        self._pos += 8
        return v

    # ------------------------------------------------------------------
    # Binary / String
    # ------------------------------------------------------------------

    def read_bytes(self) -> bytes:
        length = self._read_varint()
        data = self._buf[self._pos:self._pos + length]
        self._pos += length
        return bytes(data)

    def read_string(self) -> str:
        return self.read_bytes().decode("utf-8", errors="replace")

    # ------------------------------------------------------------------
    # Collections
    # ------------------------------------------------------------------

    def read_list_begin(self) -> Tuple[int, int]:
        """Returns (elem_type, size)."""
        byte = self._read_byte()
        size = (byte >> 4) & 0x0F
        elem_type = byte & 0x0F
        if size == 15:
            size = self._read_varint()
        return elem_type, size

    def read_set_begin(self) -> Tuple[int, int]:
        return self.read_list_begin()

    def read_map_begin(self) -> Tuple[int, int, int]:
        """Returns (key_type, val_type, size)."""
        size = self._read_varint()
        if size == 0:
            return 0, 0, 0
        types = self._read_byte()
        key_type = (types >> 4) & 0x0F
        val_type = types & 0x0F
        return key_type, val_type, size

    # ------------------------------------------------------------------
    # Skip (consume and discard a value of the given type)
    # ------------------------------------------------------------------

    def skip(self, ftype: int) -> None:
        if ftype in (TYPE_BOOL_T, TYPE_BOOL_F):
            if self._bool_value is not None:
                self._bool_value = None
            else:
                self._pos += 1
        elif ftype == TYPE_I8:
            self._pos += 1
        elif ftype in (TYPE_I16, TYPE_I32, TYPE_I64):
            self._read_varint()
        elif ftype == TYPE_DOUBLE:
            self._pos += 8
        elif ftype == TYPE_BINARY:
            length = self._read_varint()
            self._pos += length
        elif ftype in (TYPE_LIST, TYPE_SET):
            elem_type, size = self.read_list_begin()
            for _ in range(size):
                self.skip(elem_type)
        elif ftype == TYPE_MAP:
            key_type, val_type, size = self.read_map_begin()
            for _ in range(size):
                self.skip(key_type)
                self.skip(val_type)
        elif ftype == TYPE_STRUCT:
            self.read_struct_begin()
            while True:
                ft, _ = self.read_field_begin()
                if ft == TYPE_STOP:
                    break
                self.skip(ft)
            self.read_struct_end()
