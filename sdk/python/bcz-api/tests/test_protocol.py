"""
TCompactProtocol 编解码单元测试 / TCompactProtocol encoder-decoder unit tests.

Tests are fully offline — no network access required.
"""
from __future__ import annotations

import struct
import sys
import os

sys.path.insert(0, os.path.join(os.path.dirname(__file__), ".."))

import unittest

from bcz._protocol import (
    MSG_CALL, MSG_REPLY,
    TYPE_BINARY, TYPE_BOOL_F, TYPE_BOOL_T, TYPE_DOUBLE,
    TYPE_I32, TYPE_I64, TYPE_I8, TYPE_LIST, TYPE_MAP, TYPE_STOP, TYPE_STRUCT,
    CompactReader, CompactWriter,
    _decode_varint, _encode_varint, _zigzag_decode, _zigzag_encode_i32, _zigzag_encode_i64,
)


class TestVarint(unittest.TestCase):
    """Test unsigned LEB-128 varint encoding/decoding."""

    def _round_trip(self, n: int) -> int:
        encoded = _encode_varint(n)
        decoded, pos = _decode_varint(encoded, 0)
        self.assertEqual(pos, len(encoded), f"Didn't consume all bytes for {n}")
        return decoded

    def test_zero(self):
        self.assertEqual(self._round_trip(0), 0)

    def test_small(self):
        for v in range(128):
            self.assertEqual(self._round_trip(v), v)
            self.assertEqual(len(_encode_varint(v)), 1)  # 0-127 = 1 byte

    def test_128(self):
        self.assertEqual(self._round_trip(128), 128)
        self.assertEqual(len(_encode_varint(128)), 2)

    def test_large_values(self):
        for v in [127, 128, 255, 256, 16383, 16384, 2**21 - 1, 2**21, 2**28 - 1, 2**35]:
            self.assertEqual(self._round_trip(v), v)

    def test_max_i64(self):
        v = 2**63 - 1
        self.assertEqual(self._round_trip(v), v)


class TestZigzag(unittest.TestCase):
    """Test ZigZag encoding/decoding."""

    def test_zero(self):
        self.assertEqual(_zigzag_encode_i32(0), 0)
        self.assertEqual(_zigzag_decode(0), 0)

    def test_positive(self):
        for n in [1, 2, 100, 1000, 2**30 - 1]:
            encoded = _zigzag_encode_i32(n)
            decoded = _zigzag_decode(encoded)
            self.assertEqual(decoded, n, f"ZigZag round-trip failed for {n}")

    def test_negative(self):
        for n in [-1, -2, -100, -1000, -(2**31)]:
            encoded = _zigzag_encode_i32(n)
            decoded = _zigzag_decode(encoded)
            self.assertEqual(decoded, n, f"ZigZag i32 round-trip failed for {n}")

    def test_i64_positive(self):
        for n in [1, 2**31, 2**62]:
            encoded = _zigzag_encode_i64(n)
            decoded = _zigzag_decode(encoded)
            self.assertEqual(decoded, n)

    def test_i64_negative(self):
        for n in [-1, -(2**31), -(2**62)]:
            encoded = _zigzag_encode_i64(n)
            decoded = _zigzag_decode(encoded)
            self.assertEqual(decoded, n)


class TestWriterReader(unittest.TestCase):
    """Test round-trips through CompactWriter → CompactReader."""

    def _make_reply_with_field(self, method: str, ftype: int, fid: int, write_value_fn):
        """Build a fake REPLY message with a single field."""
        w = CompactWriter()
        w.write_message_begin(method, MSG_REPLY, 0)
        w.write_struct_begin()
        if ftype in (TYPE_BOOL_T, TYPE_BOOL_F):
            # Bool is encoded in the field header directly
            w.write_bool(fid, ftype == TYPE_BOOL_T)
        else:
            w.write_field_begin(ftype, fid)
            write_value_fn(w)
        w.write_field_stop()
        w.write_struct_end()
        w.write_message_end()
        return w.getvalue()

    def test_message_header_round_trip(self):
        w = CompactWriter()
        w.write_message_begin("test_method", MSG_CALL, 0)
        w.write_struct_begin()
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        name, msg_type, seq_id = r.read_message_begin()
        self.assertEqual(name, "test_method")
        self.assertEqual(msg_type, MSG_CALL)
        self.assertEqual(seq_id, 0)

    def test_method_name_in_header(self):
        """Verify that the method name written in the Thrift header is snake_case."""
        for method in ["get_profile", "send_sms_verify_code", "have_a_try",
                        "login_with_phone", "get_dict_by_word_v2", "translate_v2"]:
            w = CompactWriter()
            w.write_message_begin(method, MSG_CALL, 0)
            w.write_struct_begin()
            w.write_field_stop()
            w.write_struct_end()
            payload = w.getvalue()

            r = CompactReader(payload)
            name, _, _ = r.read_message_begin()
            self.assertEqual(name, method, f"Method name mismatch: expected {method!r}, got {name!r}")

    def test_i32_round_trip(self):
        for v in [0, 1, -1, 100, -100, 127, -128, 32767, -32768, 2**30, -(2**30)]:
            payload = self._make_reply_with_field("m", TYPE_I32, 0, lambda w, v=v: w.write_i32(v))
            r = CompactReader(payload)
            r.read_message_begin()
            r.read_struct_begin()
            ft, fid = r.read_field_begin()
            self.assertEqual(ft, TYPE_I32)
            self.assertEqual(fid, 0)
            self.assertEqual(r.read_i32(), v)

    def test_i64_round_trip(self):
        for v in [0, 1, -1, 2**32, -(2**32), 2**62, -(2**62)]:
            payload = self._make_reply_with_field("m", TYPE_I64, 0, lambda w, v=v: w.write_i64(v))
            r = CompactReader(payload)
            r.read_message_begin()
            r.read_struct_begin()
            ft, fid = r.read_field_begin()
            self.assertEqual(ft, TYPE_I64)
            self.assertEqual(fid, 0)
            self.assertEqual(r.read_i64(), v)

    def test_string_round_trip(self):
        for s in ["", "hello", "百词斩", "test_method_name", "a" * 200]:
            payload = self._make_reply_with_field("m", TYPE_BINARY, 0, lambda w, s=s: w.write_string(s))
            r = CompactReader(payload)
            r.read_message_begin()
            r.read_struct_begin()
            ft, fid = r.read_field_begin()
            self.assertEqual(ft, TYPE_BINARY)
            self.assertEqual(r.read_string(), s)

    def test_bool_true(self):
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_bool(1, True)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(ft, TYPE_BOOL_T)
        self.assertEqual(fid, 1)
        self.assertTrue(r.read_bool(ft))

    def test_bool_false(self):
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_bool(2, False)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(ft, TYPE_BOOL_F)
        self.assertEqual(fid, 2)
        self.assertFalse(r.read_bool(ft))

    def test_double_round_trip(self):
        for v in [0.0, 1.5, -1.5, 3.14159, 1e100, -1e-100]:
            payload = self._make_reply_with_field("m", TYPE_DOUBLE, 0, lambda w, v=v: w.write_double(v))
            r = CompactReader(payload)
            r.read_message_begin()
            r.read_struct_begin()
            ft, fid = r.read_field_begin()
            self.assertEqual(ft, TYPE_DOUBLE)
            self.assertAlmostEqual(r.read_double(), v, places=10)

    def test_list_i32_round_trip(self):
        values = [1, 2, 3, 100, -100, 0]
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_LIST, 0)
        w.write_list_begin(TYPE_I32, len(values))
        for v in values:
            w.write_i32(v)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(ft, TYPE_LIST)
        elem_type, size = r.read_list_begin()
        self.assertEqual(elem_type, TYPE_I32)
        self.assertEqual(size, len(values))
        result = [r.read_i32() for _ in range(size)]
        self.assertEqual(result, values)

    def test_list_large_size(self):
        """Test list with size >= 15 (uses extended header)."""
        values = list(range(20))
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_LIST, 0)
        w.write_list_begin(TYPE_I32, len(values))
        for v in values:
            w.write_i32(v)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        elem_type, size = r.read_list_begin()
        self.assertEqual(size, 20)
        result = [r.read_i32() for _ in range(size)]
        self.assertEqual(result, values)

    def test_nested_struct_round_trip(self):
        """Test nested struct encode/decode."""
        # Write: outer struct {field1: inner struct {field1: "hello", field2: 42}}
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_STRUCT, 0)  # outer field 0 = success
        w.write_struct_begin()               # inner struct
        w.write_field_begin(TYPE_STRUCT, 1)  # inner field 1
        w.write_struct_begin()               # nested inner
        w.write_field_begin(TYPE_BINARY, 1)
        w.write_string("hello")
        w.write_field_begin(TYPE_I32, 2)
        w.write_i32(42)
        w.write_field_stop()
        w.write_struct_end()
        w.write_field_stop()
        w.write_struct_end()
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        from bcz.services._base import _parse_struct
        r = CompactReader(payload)
        r.read_message_begin()
        result = _parse_struct(r)
        self.assertIn(0, result)
        inner = result[0]
        self.assertIsInstance(inner, dict)
        nested = inner.get(1, {})
        self.assertEqual(nested.get(1), "hello")
        self.assertEqual(nested.get(2), 42)

    def test_field_delta_encoding(self):
        """Test that field IDs are encoded with delta optimization."""
        w = CompactWriter()
        w.write_message_begin("m", MSG_CALL, 0)
        w.write_struct_begin()
        # Fields 1, 2, 3 in sequence — all should use delta encoding
        w.write_field_begin(TYPE_I32, 1)
        w.write_i32(10)
        w.write_field_begin(TYPE_I32, 2)
        w.write_i32(20)
        w.write_field_begin(TYPE_I32, 3)
        w.write_i32(30)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        results = {}
        while True:
            ft, fid = r.read_field_begin()
            if ft == TYPE_STOP:
                break
            results[fid] = r.read_i32()
        self.assertEqual(results, {1: 10, 2: 20, 3: 30})

    def test_map_round_trip(self):
        """Test map (string→string) encoding/decoding."""
        data = {"key1": "val1", "key2": "val2"}
        w = CompactWriter()
        w.write_message_begin("m", MSG_REPLY, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_MAP, 0)
        w.write_map_begin(TYPE_BINARY, TYPE_BINARY, len(data))
        for k, v in data.items():
            w.write_string(k)
            w.write_string(v)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(ft, TYPE_MAP)
        key_type, val_type, size = r.read_map_begin()
        self.assertEqual(size, len(data))
        result = {}
        for _ in range(size):
            k = r.read_string()
            v = r.read_string()
            result[k] = v
        self.assertEqual(result, data)


class TestCookieConstruction(unittest.TestCase):
    """Test that the Cookie header is built correctly."""

    def test_app_name_is_version_code(self):
        """app_name should be 7081400, NOT 'baicizhan'."""
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd")
        self.assertIn("app_name=7081400", cookie)
        self.assertNotIn("app_name=baicizhan", cookie)

    def test_version_is_os_version(self):
        """version should be '14' (OS version), not the app versionCode."""
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd")
        self.assertIn("version=14", cookie)
        # Should NOT contain 7081400 as version
        parts = {p.split("=")[0]: p.split("=")[1] for p in cookie.split("; ") if "=" in p}
        self.assertEqual(parts.get("version"), "14")

    def test_all_required_fields_present(self):
        """Cookie must contain all required fields."""
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd", access_token="mytoken123")
        self.assertIn("device_id=", cookie)
        self.assertIn("device_name=", cookie)
        self.assertIn("channel=", cookie)
        self.assertIn("client_time=", cookie)
        self.assertIn("serial=", cookie)
        self.assertIn("time_zone=", cookie)
        self.assertIn("access_token=mytoken123", cookie)

    def test_no_access_token_when_not_set(self):
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd")
        self.assertNotIn("access_token=", cookie)

    def test_device_name_format(self):
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd", device_model="Pixel6-Google")
        self.assertIn("android", cookie)

    def test_custom_version_code(self):
        from bcz._transport import build_cookie
        cookie = build_cookie("aabbccdd1234abcd", app_version_code="9000000", os_version="15")
        self.assertIn("app_name=9000000", cookie)
        self.assertIn("version=15", cookie)


class TestUrlConstruction(unittest.TestCase):
    """Test that URL paths use snake_case method names."""

    def test_make_url_format(self):
        from bcz._transport import make_url
        url = make_url("https://passport.baicizhan.com", "unified_user_service", "send_sms_verify_code")
        self.assertIn("send_sms_verify_code", url)
        self.assertIn("/rpc/unified_user_service/", url)
        self.assertIn("passport.baicizhan.com", url)
        # Should end with a timestamp
        parts = url.split("/")
        ts = parts[-1]
        self.assertTrue(ts.isdigit(), f"Expected timestamp, got: {ts}")

    def test_url_uses_snake_case(self):
        """Verify that the method name in URL is snake_case, not camelCase."""
        from bcz._transport import make_url
        url = make_url("https://learn.baicizhan.com", "user_study", "get_study_home")
        self.assertIn("get_study_home", url)
        self.assertNotIn("getStudyHome", url)


class TestResponseParsing(unittest.TestCase):
    """Test _parse_response_result with synthetic Thrift reply data."""

    def _build_reply(self, method: str, field0_writer=None):
        """Build a REPLY message. field0_writer(w) writes the success result field."""
        w = CompactWriter()
        w.write_message_begin(method, MSG_REPLY, 0)
        w.write_struct_begin()
        if field0_writer:
            field0_writer(w)
        w.write_field_stop()
        w.write_struct_end()
        w.write_message_end()
        return w.getvalue()

    def _parse(self, data: bytes):
        from bcz.services._base import _check_response, _parse_response_result
        r = CompactReader(data)
        _check_response(r, "test")
        return _parse_response_result(r)

    def test_void_response(self):
        """void methods return None."""
        data = self._build_reply("test_method")
        result = self._parse(data)
        self.assertIsNone(result)

    def test_i32_response(self):
        """i32 return value is parsed correctly."""
        def writer(w):
            w.write_field_begin(TYPE_I32, 0)
            w.write_i32(42)
        data = self._build_reply("test", writer)
        result = self._parse(data)
        self.assertEqual(result, 42)

    def test_string_response(self):
        """String return value is parsed correctly."""
        def writer(w):
            w.write_field_begin(TYPE_BINARY, 0)
            w.write_string("hello world")
        data = self._build_reply("test", writer)
        result = self._parse(data)
        self.assertEqual(result, "hello world")

    def test_struct_response(self):
        """Struct return value is parsed as dict keyed by field ID."""
        def writer(w):
            w.write_field_begin(TYPE_STRUCT, 0)
            w.write_struct_begin()
            w.write_field_begin(TYPE_BINARY, 1)
            w.write_string("token_xyz")
            w.write_field_begin(TYPE_I64, 6)
            w.write_i64(123456789)
            w.write_field_stop()
            w.write_struct_end()
        data = self._build_reply("test", writer)
        result = self._parse(data)
        self.assertIsInstance(result, dict)
        self.assertEqual(result[1], "token_xyz")
        self.assertEqual(result[6], 123456789)

    def test_list_response(self):
        """List return value is parsed as Python list."""
        def writer(w):
            w.write_field_begin(TYPE_LIST, 0)
            w.write_list_begin(TYPE_I32, 3)
            for v in [10, 20, 30]:
                w.write_i32(v)
        data = self._build_reply("test", writer)
        result = self._parse(data)
        self.assertEqual(result, [10, 20, 30])

    def test_exception_response(self):
        """Exception message raises BczApiError."""
        from bcz._exceptions import BczApiError
        # Build an EXCEPTION message
        w = CompactWriter()
        from bcz._protocol import MSG_EXCEPTION
        w.write_message_begin("test", MSG_EXCEPTION, 0)
        w.write_struct_begin()
        w.write_field_begin(TYPE_BINARY, 1)
        w.write_string("Unknown function test")
        w.write_field_begin(TYPE_I32, 2)
        w.write_i32(1)
        w.write_field_stop()
        w.write_struct_end()
        payload = w.getvalue()

        from bcz.services._base import _check_response, _parse_response_result
        r = CompactReader(payload)
        with self.assertRaises(BczApiError) as ctx:
            _check_response(r, "test")
        self.assertIn("Unknown function", str(ctx.exception))


if __name__ == "__main__":
    unittest.main(verbosity=2)
