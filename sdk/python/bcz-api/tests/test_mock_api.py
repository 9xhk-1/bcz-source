"""
Mock HTTP 集成测试 / Mock HTTP integration tests.

Intercepts requests.post to verify:
  1. Cookie format (version=14, app_name=7081400, device_id, access_token, …)
  2. URL path uses snake_case method name
  3. Thrift message header encodes the correct (snake_case) method name
  4. Response parsing correctly converts binary → Python values

No real network access is required.
"""
from __future__ import annotations

import struct
import sys
import os
import unittest
from unittest.mock import MagicMock, patch

sys.path.insert(0, os.path.join(os.path.dirname(__file__), ".."))

from bcz._protocol import (
    MSG_CALL, MSG_REPLY, MSG_EXCEPTION,
    TYPE_BINARY, TYPE_BOOL_F, TYPE_BOOL_T, TYPE_I32, TYPE_I64, TYPE_LIST,
    TYPE_STOP, TYPE_STRUCT,
    CompactReader, CompactWriter,
)
from bcz._exceptions import BczApiError, BczAuthError


# ---------------------------------------------------------------------------
# Helpers to build fake server responses
# ---------------------------------------------------------------------------

def _thrift_reply(method: str, field0_writer=None) -> bytes:
    """Build a framed TCompact REPLY message."""
    w = CompactWriter()
    w.write_message_begin(method, MSG_REPLY, 0)
    w.write_struct_begin()
    if field0_writer:
        field0_writer(w)
    w.write_field_stop()
    w.write_struct_end()
    w.write_message_end()
    payload = w.getvalue()
    return struct.pack(">I", len(payload)) + payload


def _void_reply(method: str) -> bytes:
    return _thrift_reply(method)


def _i32_reply(method: str, value: int) -> bytes:
    def writer(w):
        w.write_field_begin(TYPE_I32, 0)
        w.write_i32(value)
    return _thrift_reply(method, writer)


def _string_reply(method: str, value: str) -> bytes:
    def writer(w):
        w.write_field_begin(TYPE_BINARY, 0)
        w.write_string(value)
    return _thrift_reply(method, writer)


def _struct_reply(method: str, fields: dict) -> bytes:
    """Build a reply where field 0 is a struct with the given {fid: value} mapping.
    Supports str, int, and bool values."""
    def writer(w):
        w.write_field_begin(TYPE_STRUCT, 0)
        w.write_struct_begin()
        for fid, value in fields.items():
            if isinstance(value, bool):
                w.write_bool(fid, value)
            elif isinstance(value, str):
                w.write_field_begin(TYPE_BINARY, fid)
                w.write_string(value)
            elif isinstance(value, int):
                w.write_field_begin(TYPE_I32, fid)
                w.write_i32(value)
        w.write_field_stop()
        w.write_struct_end()
    return _thrift_reply(method, writer)


def _list_i32_reply(method: str, values: list) -> bytes:
    def writer(w):
        w.write_field_begin(TYPE_LIST, 0)
        w.write_list_begin(TYPE_I32, len(values))
        for v in values:
            w.write_i32(v)
    return _thrift_reply(method, writer)


# ---------------------------------------------------------------------------
# Mock requests.post infrastructure
# ---------------------------------------------------------------------------

class MockResponse:
    def __init__(self, content: bytes):
        self.content = content
        self.status_code = 200

    def raise_for_status(self):
        pass


def _make_mock_post(response_content: bytes):
    """Return a mock for requests.post that captures the call and returns *response_content*."""
    mock = MagicMock(return_value=MockResponse(response_content))
    return mock


def _extract_request_info(mock_post_call):
    """Extract URL, cookie, and decoded method name from a captured mock call."""
    args, kwargs = mock_post_call.call_args
    url = args[0] if args else kwargs.get("url", "")
    headers = kwargs.get("headers", {})
    data = kwargs.get("data", b"")
    cookie = headers.get("Cookie", "")

    # The first 4 bytes are the frame length; skip them to get the payload
    payload = data[4:]
    r = CompactReader(payload)
    name, msg_type, seq_id = r.read_message_begin()

    return {"url": url, "cookie": cookie, "method_name": name, "msg_type": msg_type}


# ---------------------------------------------------------------------------
# Base test class
# ---------------------------------------------------------------------------

class _MockApiTestBase(unittest.TestCase):
    def setUp(self):
        from bcz.client import Bcz
        self.bcz = Bcz(device_id="aabbccdd1234abcd")
        # Pre-set access token so auth-required methods don't raise
        self.bcz.set_access_token("test_access_token_123")

    def _call_with_mock(self, service_method_callable, response_content: bytes):
        """Call a method with a mocked requests.post; return info dict."""
        with patch("bcz._transport.requests.post", _make_mock_post(response_content)) as mock_post:
            service_method_callable()
            info = _extract_request_info(mock_post)
        return info

    def _assert_snake_case(self, method_name: str):
        """Assert the method name is snake_case (no camelCase)."""
        import re
        self.assertFalse(
            bool(re.search(r'[a-z][A-Z]', method_name)),
            f"Method name should be snake_case, got: {method_name!r}"
        )

    def _assert_cookie_fields(self, cookie: str):
        """Assert the cookie has the correct field values."""
        parts = {}
        for part in cookie.split("; "):
            if "=" in part:
                k, v = part.split("=", 1)
                parts[k] = v
        self.assertEqual(parts.get("version"), "14",
                         f"version should be '14', got {parts.get('version')!r}")
        self.assertEqual(parts.get("app_name"), "7081400",
                         f"app_name should be '7081400', got {parts.get('app_name')!r}")
        self.assertIn("device_id", parts)
        self.assertIn("channel", parts)
        self.assertIn("client_time", parts)


# ---------------------------------------------------------------------------
# User service tests
# ---------------------------------------------------------------------------

class TestUserService(_MockApiTestBase):

    def test_have_a_try(self):
        resp = _struct_reply("have_a_try", {1: "tok123", 6: 999})
        info = self._call_with_mock(lambda: self.bcz.user.have_a_try(), resp)
        self.assertEqual(info["method_name"], "have_a_try")
        self.assertIn("/rpc/unified_user_service/have_a_try/", info["url"])
        self._assert_snake_case(info["method_name"])
        self._assert_cookie_fields(info["cookie"])

    def test_send_sms_verify_code(self):
        info = self._call_with_mock(
            lambda: self.bcz.send_sms("13934561111"),
            _void_reply("send_sms_verify_code")
        )
        self.assertEqual(info["method_name"], "send_sms_verify_code")
        self.assertIn("send_sms_verify_code", info["url"])
        self._assert_snake_case(info["method_name"])
        self._assert_cookie_fields(info["cookie"])

    def test_login_with_phone(self):
        resp = _struct_reply("login_with_phone", {1: "mytoken", 6: 12345})
        info = self._call_with_mock(
            lambda: self.bcz.login("13934561111", "123456"),
            resp
        )
        self.assertEqual(info["method_name"], "login_with_phone")
        self.assertIn("login_with_phone", info["url"])

    def test_have_a_try_v2(self):
        resp = _struct_reply("have_a_try_v2", {1: "tok_v2"})
        info = self._call_with_mock(lambda: self.bcz.user.have_a_try_v2(), resp)
        self.assertEqual(info["method_name"], "have_a_try_v2")

    def test_have_a_try_v3(self):
        resp = _struct_reply("have_a_try_v3", {1: "tok_v3"})
        info = self._call_with_mock(lambda: self.bcz.user.have_a_try_v3(), resp)
        self.assertEqual(info["method_name"], "have_a_try_v3")

    def test_get_profile(self):
        resp = _struct_reply("get_profile", {1: "TestUser", 2: 1, 3: "https://img.example.com/avatar.jpg"})
        info = self._call_with_mock(lambda: self.bcz.get_profile(), resp)
        self.assertEqual(info["method_name"], "get_profile")
        self.assertIn("get_profile", info["url"])

    def test_logout(self):
        info = self._call_with_mock(lambda: self.bcz.user.logout(), _void_reply("logout"))
        self.assertEqual(info["method_name"], "logout")

    def test_get_user_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_user_info(),
            _struct_reply("get_user_info", {1: "user_info"})
        )
        self.assertEqual(info["method_name"], "get_user_info")

    def test_get_user_info_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_user_info_v2(),
            _struct_reply("get_user_info_v2", {1: "user_info_v2"})
        )
        self.assertEqual(info["method_name"], "get_user_info_v2")

    def test_get_follower_list(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_follower_list(),
            _list_i32_reply("get_follower_list", [1, 2, 3])
        )
        self.assertEqual(info["method_name"], "get_follower_list")

    def test_get_following_list(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_following_list(),
            _list_i32_reply("get_following_list", [4, 5])
        )
        self.assertEqual(info["method_name"], "get_following_list")

    def test_get_rank_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_rank_info(),
            _struct_reply("get_rank_info", {1: 100})
        )
        self.assertEqual(info["method_name"], "get_rank_info")

    def test_get_sign_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.user.get_sign_info(),
            _struct_reply("get_sign_info", {1: 7})
        )
        self.assertEqual(info["method_name"], "get_sign_info")

    def test_uaid_login(self):
        resp = _struct_reply("uaid_login", {1: "uaid_tok"})
        info = self._call_with_mock(
            lambda: self.bcz.user.uaid_login("13900001111", "UAID_XXXXX"),
            resp
        )
        self.assertEqual(info["method_name"], "uaid_login")

    def test_bcz_login(self):
        resp = _struct_reply("bcz_login", {1: "bcz_tok"})
        info = self._call_with_mock(
            lambda: self.bcz.login_with_password("user@example.com", "password123"),
            resp
        )
        self.assertEqual(info["method_name"], "bcz_login")

    def test_third_party_login(self):
        resp = _struct_reply("third_party_login", {1: "3p_tok"})
        info = self._call_with_mock(
            lambda: self.bcz.login_with_third_party("wechat", "openid_123", "access_tok_123"),
            resp
        )
        self.assertEqual(info["method_name"], "third_party_login")


# ---------------------------------------------------------------------------
# Study service tests
# ---------------------------------------------------------------------------

class TestStudyService(_MockApiTestBase):

    def test_get_study_home(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_study_home(),
            _struct_reply("get_study_home", {1: 5, 2: 3})
        )
        self.assertEqual(info["method_name"], "get_study_home")
        self.assertIn("/rpc/user_study/", info["url"])

    def test_get_book_list(self):
        info = self._call_with_mock(
            lambda: self.bcz.get_book_list(),
            _list_i32_reply("get_book_list", [1, 2, 3])
        )
        self.assertEqual(info["method_name"], "get_book_list")

    def test_select_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.select_book(1),
            _void_reply("select_book")
        )
        self.assertEqual(info["method_name"], "select_book")

    def test_get_today_words(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_today_words(),
            _struct_reply("get_today_words", {1: 10})
        )
        self.assertEqual(info["method_name"], "get_today_words")

    def test_get_review_words(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_review_words(),
            _list_i32_reply("get_review_words", [101, 102])
        )
        self.assertEqual(info["method_name"], "get_review_words")

    def test_skip_word(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.skip_word(10001),
            _void_reply("skip_word")
        )
        self.assertEqual(info["method_name"], "skip_word")

    def test_mark_word_known(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.mark_word_known(10001),
            _void_reply("mark_word_known")
        )
        self.assertEqual(info["method_name"], "mark_word_known")

    def test_get_study_statistics(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_study_statistics(),
            _struct_reply("get_study_statistics", {1: 100})
        )
        self.assertEqual(info["method_name"], "get_study_statistics")

    def test_get_streak_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_streak_info(),
            _struct_reply("get_streak_info", {1: 7})
        )
        self.assertEqual(info["method_name"], "get_streak_info")

    def test_get_study_plan(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_study_plan(),
            _struct_reply("get_study_plan", {1: 20, 2: 30})
        )
        self.assertEqual(info["method_name"], "get_study_plan")

    def test_update_study_plan(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.update_study_plan(20, 30),
            _void_reply("update_study_plan")
        )
        self.assertEqual(info["method_name"], "update_study_plan")

    def test_get_checkpoint_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_checkpoint_info(),
            _struct_reply("get_checkpoint_info", {1: 1})
        )
        self.assertEqual(info["method_name"], "get_checkpoint_info")

    def test_get_user_book_progress(self):
        info = self._call_with_mock(
            lambda: self.bcz.study.get_user_book_progress(),
            _struct_reply("get_user_book_progress", {1: 50})
        )
        self.assertEqual(info["method_name"], "get_user_book_progress")


# ---------------------------------------------------------------------------
# Resource service tests
# ---------------------------------------------------------------------------

class TestResourceService(_MockApiTestBase):

    def test_search_word_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.search_word("abandon"),
            _list_i32_reply("search_word_v2", [10001, 10002])
        )
        self.assertEqual(info["method_name"], "search_word_v2")
        self.assertIn("/rpc/resource_api/", info["url"])

    def test_translate_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.translate("Hello world"),
            _struct_reply("translate_v2", {1: "你好，世界"})
        )
        self.assertEqual(info["method_name"], "translate_v2")

    def test_get_dict_by_word_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.get_word("abandon"),
            _struct_reply("get_dict_by_word_v2", {1: "abandon", 2: "放弃"})
        )
        self.assertEqual(info["method_name"], "get_dict_by_word_v2")

    def test_get_topic_resource_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.resource.get_topic_resource_v2(10001, 1),
            _struct_reply("get_topic_resource_v2", {1: 10001})
        )
        self.assertEqual(info["method_name"], "get_topic_resource_v2")

    def test_get_topic_resource_v3(self):
        info = self._call_with_mock(
            lambda: self.bcz.resource.get_topic_resource_v3(10001),
            _string_reply("get_topic_resource_v3", '{"word": "abandon"}')
        )
        self.assertEqual(info["method_name"], "get_topic_resource_v3")

    def test_get_word_root(self):
        info = self._call_with_mock(
            lambda: self.bcz.resource.get_word_root(10001),
            _struct_reply("get_word_root", {1: "ab-"})
        )
        self.assertEqual(info["method_name"], "get_word_root")

    def test_get_dict_wiki_by_word(self):
        info = self._call_with_mock(
            lambda: self.bcz.resource.get_dict_wiki_by_word("abandon"),
            _struct_reply("get_dict_wiki_by_word", {1: "abandon (wiki)"})
        )
        self.assertEqual(info["method_name"], "get_dict_wiki_by_word")

    def test_get_book_resource_update_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.resource.get_book_resource_update_info(1),
            _struct_reply("get_book_resource_update_info", {1: 1000})
        )
        self.assertEqual(info["method_name"], "get_book_resource_update_info")


# ---------------------------------------------------------------------------
# Game service tests
# ---------------------------------------------------------------------------

class TestGameService(_MockApiTestBase):

    def test_home(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.home(),
            _struct_reply("home", {1: 100})
        )
        self.assertEqual(info["method_name"], "home")
        self.assertIn("/rpc/game/", info["url"])

    def test_game_home(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.game_home(),
            _struct_reply("game_home", {1: 200})
        )
        self.assertEqual(info["method_name"], "game_home")
        self._assert_snake_case(info["method_name"])

    def test_get_game_config(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.get_game_config(),
            _struct_reply("get_game_config", {1: 1})
        )
        self.assertEqual(info["method_name"], "get_game_config")

    def test_get_equipments(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.get_equipments(),
            _list_i32_reply("get_equipments", [1, 2])
        )
        self.assertEqual(info["method_name"], "get_equipments")

    def test_select_game_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.select_game_book(1),
            _void_reply("select_game_book")
        )
        self.assertEqual(info["method_name"], "select_game_book")

    def test_get_roadmap(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.get_roadmap(),
            _struct_reply("get_roadmap", {1: 5})
        )
        self.assertEqual(info["method_name"], "get_roadmap")

    def test_buy_life(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.buy_life(1),
            _struct_reply("buy_life", {1: 3})
        )
        self.assertEqual(info["method_name"], "buy_life")

    def test_sync_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.sync_info(),
            _struct_reply("sync_info", {1: 1})
        )
        self.assertEqual(info["method_name"], "sync_info")

    def test_upgrade_sentence_building_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.game.upgrade_sentence_building_v2(),
            _struct_reply("upgrade_sentence_building_v2", {1: 5})
        )
        self.assertEqual(info["method_name"], "upgrade_sentence_building_v2")
        self._assert_snake_case(info["method_name"])


# ---------------------------------------------------------------------------
# Book service tests
# ---------------------------------------------------------------------------

class TestBookService(_MockApiTestBase):

    def test_get_user_book_list(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.get_user_book_list(),
            _list_i32_reply("get_user_book_list", [1, 2])
        )
        self.assertEqual(info["method_name"], "get_user_book_list")
        self.assertIn("/rpc/user_book/", info["url"])

    def test_create_user_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.create_user_book("My Vocab"),
            _struct_reply("create_user_book", {1: 101, 2: "My Vocab"})
        )
        self.assertEqual(info["method_name"], "create_user_book")

    def test_delete_user_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.delete_user_book(101),
            _void_reply("delete_user_book")
        )
        self.assertEqual(info["method_name"], "delete_user_book")

    def test_get_book_words(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.get_book_words(101),
            _list_i32_reply("get_book_words", [10001, 10002])
        )
        self.assertEqual(info["method_name"], "get_book_words")

    def test_add_word_to_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.add_word_to_book(101, "abandon"),
            _void_reply("add_word_to_book")
        )
        self.assertEqual(info["method_name"], "add_word_to_book")

    def test_star_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.star_book(999),
            _void_reply("star_book")
        )
        self.assertEqual(info["method_name"], "star_book")

    def test_search_books(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.search_books("考研"),
            _list_i32_reply("search_books", [1, 2, 3])
        )
        self.assertEqual(info["method_name"], "search_books")

    def test_import_shared_book(self):
        info = self._call_with_mock(
            lambda: self.bcz.book.import_shared_book("SHARECODE"),
            _struct_reply("import_shared_book", {1: 123})
        )
        self.assertEqual(info["method_name"], "import_shared_book")


# ---------------------------------------------------------------------------
# System service tests
# ---------------------------------------------------------------------------

class TestSystemService(_MockApiTestBase):

    def test_check_new_version(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.check_new_version(),
            _struct_reply("check_new_version", {1: "8.0.0"})
        )
        self.assertEqual(info["method_name"], "check_new_version")
        self.assertIn("/rpc/bcz_system/", info["url"])

    def test_get_switches(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.get_switches(),
            _struct_reply("get_switches", {1: 1})
        )
        self.assertEqual(info["method_name"], "get_switches")

    def test_get_privacy_agreement_version(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.get_privacy_agreement_version(),
            _struct_reply("get_privacy_agreement_version", {1: "2.0"})
        )
        self.assertEqual(info["method_name"], "get_privacy_agreement_version")

    def test_get_domain_whitelist(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.get_domain_whitelist(),
            _list_i32_reply("get_domain_whitelist", [])
        )
        self.assertEqual(info["method_name"], "get_domain_whitelist")

    def test_check_nav_tabs(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.check_nav_tabs(),
            _struct_reply("check_nav_tabs", {1: 1})
        )
        self.assertEqual(info["method_name"], "check_nav_tabs")

    def test_qrcode_scan(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.qrcode_scan("qrtext"),
            _struct_reply("qrcode_scan", {1: 1})
        )
        self.assertEqual(info["method_name"], "qrcode_scan")

    def test_report_event(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.report_event("page_view", {"page": "home"}),
            _void_reply("report_event")
        )
        self.assertEqual(info["method_name"], "report_event")

    def test_report_event_without_login(self):
        info = self._call_with_mock(
            lambda: self.bcz.system.report_event_without_login("app_launch"),
            _void_reply("report_event_without_login")
        )
        self.assertEqual(info["method_name"], "report_event_without_login")

    def test_notify_get_remind_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.notify.get_remind_info(),
            _struct_reply("get_remind_info", {1: "08:00"})
        )
        self.assertEqual(info["method_name"], "get_remind_info")
        self.assertIn("/rpc/notify/", info["url"])

    def test_notify_push_confirm(self):
        info = self._call_with_mock(
            lambda: self.bcz.notify.push_confirm("msg_001"),
            _void_reply("push_confirm")
        )
        self.assertEqual(info["method_name"], "push_confirm")

    def test_strategy_get_user_member_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.strategy.get_user_member_info(),
            _struct_reply("get_user_member_info", {1: 1})
        )
        self.assertEqual(info["method_name"], "get_user_member_info")
        self.assertIn("/rpc/strategy/", info["url"])

    def test_strategy_get_free_member(self):
        info = self._call_with_mock(
            lambda: self.bcz.strategy.get_free_member(),
            _struct_reply("get_free_member", {1: 0})
        )
        self.assertEqual(info["method_name"], "get_free_member")

    def test_bcz_report_report_event(self):
        info = self._call_with_mock(
            lambda: self.bcz.report.report_event([{"event_name": "e", "params": {}, "timestamp": 0}]),
            _void_reply("report_event")
        )
        self.assertEqual(info["method_name"], "report_event")
        self.assertIn("/rpc/bcz_report/", info["url"])

    def test_bcz_report_without_login(self):
        info = self._call_with_mock(
            lambda: self.bcz.report.report_event_without_login([]),
            _void_reply("report_event_without_login")
        )
        self.assertEqual(info["method_name"], "report_event_without_login")


# ---------------------------------------------------------------------------
# Advertise service tests
# ---------------------------------------------------------------------------

class TestAdvertiseService(_MockApiTestBase):

    def test_get_launch_ad(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_launch_ad(),
            _struct_reply("get_launch_ad", {1: "https://ad.example.com"})
        )
        self.assertEqual(info["method_name"], "get_launch_ad")
        self.assertIn("/rpc/advertise/", info["url"])

    def test_get_startup_ad_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_startup_ad_v2(),
            _list_i32_reply("get_startup_ad_v2", [1])
        )
        self.assertEqual(info["method_name"], "get_startup_ad_v2")

    def test_get_books_ad_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_books_ad_v2(),
            _struct_reply("get_books_ad_v2", {1: "url"})
        )
        self.assertEqual(info["method_name"], "get_books_ad_v2")

    def test_get_loading_imgs(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_loading_imgs(),
            _list_i32_reply("get_loading_imgs", [])
        )
        self.assertEqual(info["method_name"], "get_loading_imgs")

    def test_get_live_streaming_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_live_streaming_info(),
            _struct_reply("get_live_streaming_info", {1: 0})
        )
        self.assertEqual(info["method_name"], "get_live_streaming_info")

    def test_get_promotion_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.advertise.get_promotion_info(),
            _struct_reply("get_promotion_info", {1: "promo"})
        )
        self.assertEqual(info["method_name"], "get_promotion_info")


# ---------------------------------------------------------------------------
# Mall / Avatar / PK service tests
# ---------------------------------------------------------------------------

class TestMallService(_MockApiTestBase):

    def test_get_user_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.mall.get_user_address(),
            _list_i32_reply("get_user_address", [1001])
        )
        self.assertEqual(info["method_name"], "get_user_address")
        self.assertIn("/rpc/mall_proxy/", info["url"])

    def test_get_child_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.mall.get_child_address(0),
            _list_i32_reply("get_child_address", [1, 2])
        )
        self.assertEqual(info["method_name"], "get_child_address")

    def test_choice_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.mall.choice_address(1001),
            _void_reply("choice_address")
        )
        self.assertEqual(info["method_name"], "choice_address")

    def test_delete_user_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.mall.delete_user_address(1001),
            _void_reply("delete_user_address")
        )
        self.assertEqual(info["method_name"], "delete_user_address")

    def test_avatar_get_ip(self):
        info = self._call_with_mock(
            lambda: self.bcz.avatar.get_ip(),
            _struct_reply("get_ip", {1: 1, 2: "MyAvatar"})
        )
        self.assertEqual(info["method_name"], "get_ip")
        self.assertIn("/rpc/avatar/", info["url"])

    def test_avatar_travel(self):
        info = self._call_with_mock(
            lambda: self.bcz.avatar.travel(),
            _struct_reply("travel", {1: 1})
        )
        self.assertEqual(info["method_name"], "travel")

    def test_pk_get_pk_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.pk.get_pk_address(),
            _string_reply("get_pk_address", "wss://pk-ws.baicizhan.com/ws?token=abc")
        )
        self.assertEqual(info["method_name"], "get_pk_address")
        self.assertIn("/rpc/pk/", info["url"])

    def test_pk_get_rank_pk_address(self):
        info = self._call_with_mock(
            lambda: self.bcz.pk.get_rank_pk_address(),
            _struct_reply("get_rank_pk_address", {1: "wss://rank.example.com"})
        )
        self.assertEqual(info["method_name"], "get_rank_pk_address")


# ---------------------------------------------------------------------------
# Assistant / Activity service tests
# ---------------------------------------------------------------------------

class TestAssistantService(_MockApiTestBase):

    def test_get_exploration_items(self):
        info = self._call_with_mock(
            lambda: self.bcz.assistant.get_exploration_items(),
            _list_i32_reply("get_exploration_items", [1, 2])
        )
        self.assertEqual(info["method_name"], "get_exploration_items")
        self.assertIn("/rpc/assistant/", info["url"])

    def test_analyze_clipboard(self):
        info = self._call_with_mock(
            lambda: self.bcz.assistant.analyze_clipboard("abandon"),
            _struct_reply("analyze_clipboard", {1: 1, 2: "abandon"})
        )
        self.assertEqual(info["method_name"], "analyze_clipboard")

    def test_get_credit(self):
        info = self._call_with_mock(
            lambda: self.bcz.assistant.get_credit(),
            _i32_reply("get_credit", 2580)
        )
        self.assertEqual(info["method_name"], "get_credit")

    def test_done_word_stat(self):
        logs = [{"topic_id": 10001, "stat_type": 1, "value": 1}]
        info = self._call_with_mock(
            lambda: self.bcz.assistant.done_word_stat(123, logs),
            _i32_reply("done_word_stat", 1)
        )
        self.assertEqual(info["method_name"], "done_word_stat")

    def test_check_feedback_msg(self):
        info = self._call_with_mock(
            lambda: self.bcz.assistant.check_feedback_msg("device_abc"),
            _i32_reply("check_feedback_msg", 0)
        )
        self.assertEqual(info["method_name"], "check_feedback_msg")

    def test_get_beta_user_types_v2(self):
        info = self._call_with_mock(
            lambda: self.bcz.assistant.get_beta_user_types_v2(),
            _struct_reply("get_beta_user_types_v2", {1: 0})
        )
        self.assertEqual(info["method_name"], "get_beta_user_types_v2")

    def test_activity_get_export_activity_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.activity.get_export_activity_info(),
            _struct_reply("get_export_activity_info", {1: True})
        )
        self.assertEqual(info["method_name"], "get_export_activity_info")
        self.assertIn("/rpc/activity/", info["url"])

    def test_activity_buy_export_quota(self):
        info = self._call_with_mock(
            lambda: self.bcz.activity.buy_export_quota(),
            _struct_reply("buy_export_quota", {1: 3})
        )
        self.assertEqual(info["method_name"], "buy_export_quota")

    def test_activity_export_words(self):
        info = self._call_with_mock(
            lambda: self.bcz.activity.export_words("user@example.com", 1, 1),
            _void_reply("export_words")
        )
        self.assertEqual(info["method_name"], "export_words")


# ---------------------------------------------------------------------------
# Course service tests
# ---------------------------------------------------------------------------

class TestCourseService(_MockApiTestBase):

    def test_get_vocab_live_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.get_vocab_live_info(1001, 2001),
            _struct_reply("get_vocab_live_info", {1: "teacher_name"})
        )
        self.assertEqual(info["method_name"], "get_vocab_live_info")
        self.assertIn("/rpc/course/", info["url"])

    def test_polling_info(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.polling_info(1001, 2001),
            _struct_reply("polling_info", {1: "content"})
        )
        self.assertEqual(info["method_name"], "polling_info")

    def test_livedone(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.livedone(1001, 2001),
            _void_reply("livedone")
        )
        self.assertEqual(info["method_name"], "livedone")

    def test_get_mark_book_list(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.get_mark_book_list(5001),
            _list_i32_reply("get_mark_book_list", [10001, 10002])
        )
        self.assertEqual(info["method_name"], "get_mark_book_list")

    def test_delete_mark_word(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.delete_mark_word(10001, 5001),
            _void_reply("delete_mark_word")
        )
        self.assertEqual(info["method_name"], "delete_mark_word")

    def test_get_improve_video_info(self):
        """chapter_id should be encoded as i64 not i32."""
        captured_payload = []

        def mock_post(url, data, headers, timeout):
            captured_payload.append(data)
            content = _struct_reply("get_improve_video_info", {1: "video_url"})
            return MockResponse(content)

        with patch("bcz._transport.requests.post", side_effect=mock_post):
            self.bcz.course.get_improve_video_info(100001)

        payload = captured_payload[0][4:]  # strip 4-byte frame header
        r = CompactReader(payload)
        name, _, _ = r.read_message_begin()
        self.assertEqual(name, "get_improve_video_info")

        # Parse the args struct — field 1 should be i64 (type=6)
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_I64, f"chapter_id should be encoded as TYPE_I64 (6), got {ft}")
        val = r.read_i64()
        self.assertEqual(val, 100001)

    def test_submit_improve_chapter_done_i64(self):
        """chapter_id in submit_improve_chapter_done should be i64."""
        captured_payload = []

        def mock_post(url, data, headers, timeout):
            captured_payload.append(data)
            return MockResponse(_void_reply("submit_improve_chapter_done"))

        with patch("bcz._transport.requests.post", side_effect=mock_post):
            self.bcz.course.submit_improve_chapter_done(200002, 100)

        payload = captured_payload[0][4:]
        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_I64, "chapter_id should be i64")
        val = r.read_i64()
        self.assertEqual(val, 200002)

    def test_feedback(self):
        info = self._call_with_mock(
            lambda: self.bcz.course.feedback(2001, 3001, 2),
            _void_reply("feedback")
        )
        self.assertEqual(info["method_name"], "feedback")

    def test_submit_ugc(self):
        """submitugc is the server-side name (all lowercase, no underscore)."""
        info = self._call_with_mock(
            lambda: self.bcz.course.submit_ugc(1001, 2001, "Great lesson!"),
            _void_reply("submitugc")
        )
        self.assertEqual(info["method_name"], "submitugc")


# ---------------------------------------------------------------------------
# Auth guard tests
# ---------------------------------------------------------------------------

class TestAuthGuard(unittest.TestCase):

    def setUp(self):
        from bcz.client import Bcz
        self.bcz = Bcz()  # No access token set

    def test_get_profile_requires_auth(self):
        with self.assertRaises(BczAuthError):
            self.bcz.get_profile()

    def test_get_study_home_requires_auth(self):
        with self.assertRaises(BczAuthError):
            self.bcz.study.get_study_home()

    def test_select_book_requires_auth(self):
        with self.assertRaises(BczAuthError):
            self.bcz.select_book(1)

    def test_send_sms_does_not_require_auth(self):
        """send_sms_verify_code should work without authentication."""
        with patch("bcz._transport.requests.post", _make_mock_post(_void_reply("send_sms_verify_code"))):
            # Should NOT raise BczAuthError
            try:
                self.bcz.send_sms("13900001111")
            except BczAuthError:
                self.fail("send_sms should not require authentication")


# ---------------------------------------------------------------------------
# Argument encoding spot-checks
# ---------------------------------------------------------------------------

class TestArgumentEncoding(unittest.TestCase):
    """Verify that method arguments are correctly encoded in the Thrift payload."""

    def setUp(self):
        from bcz.client import Bcz
        self.bcz = Bcz(device_id="aabbccdd1234abcd")
        self.bcz.set_access_token("tok")

    def _capture_payload(self, method_call):
        captured = []

        def mock_post(url, data, headers, timeout):
            captured.append(data)
            return MockResponse(_void_reply("any"))

        with patch("bcz._transport.requests.post", side_effect=mock_post):
            try:
                method_call()
            except Exception:
                pass  # We only care about what was sent

        if not captured:
            return None
        return captured[0][4:]  # strip frame header

    def test_send_sms_encodes_phone(self):
        """send_sms_verify_code must encode phone as field 1 (string)."""
        payload = self._capture_payload(lambda: self.bcz.send_sms("13934561111"))
        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_BINARY)
        self.assertEqual(r.read_string(), "13934561111")

    def test_select_book_encodes_book_id(self):
        """select_book must encode book_id as field 1 (i32)."""
        payload = self._capture_payload(lambda: self.bcz.select_book(999))
        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_I32)
        self.assertEqual(r.read_i32(), 999)

    def test_skip_word_encodes_topic_id(self):
        """skip_word must encode topic_id as field 1 (i32)."""
        payload = self._capture_payload(lambda: self.bcz.study.skip_word(10042))
        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_I32)
        self.assertEqual(r.read_i32(), 10042)

    def test_translate_v2_encodes_source(self):
        """translate_v2 must encode source string as field 1."""
        payload = self._capture_payload(lambda: self.bcz.translate("Hello"))
        r = CompactReader(payload)
        r.read_message_begin()
        r.read_struct_begin()
        ft, fid = r.read_field_begin()
        self.assertEqual(fid, 1)
        self.assertEqual(ft, TYPE_BINARY)
        self.assertEqual(r.read_string(), "Hello")

    def test_login_result_auto_sets_access_token(self):
        """After login(), the session access_token should be updated."""
        resp = _struct_reply("login_with_phone", {1: "new_access_token_ABC", 6: 99999})
        from bcz.client import Bcz
        bcz = Bcz()
        self.assertFalse(bcz.is_authenticated)

        with patch("bcz._transport.requests.post", _make_mock_post(resp)):
            result = bcz.login("13912345678", "654321")

        self.assertTrue(bcz.is_authenticated)
        self.assertEqual(bcz.access_token, "new_access_token_ABC")
        self.assertEqual(bcz.unique_id, 99999)
        self.assertEqual(result["access_token"], "new_access_token_ABC")


        self.assertTrue(bcz.is_authenticated)
        self.assertEqual(bcz.access_token, "new_access_token_ABC")
        self.assertEqual(bcz.unique_id, 99999)
        self.assertEqual(result["access_token"], "new_access_token_ABC")


# ---------------------------------------------------------------------------
# Field mapping tests — verify all response keys are English strings
# ---------------------------------------------------------------------------

class TestFieldMapping(_MockApiTestBase):
    """Verify that API response dicts have English string keys, not integer IDs."""

    def _call_and_return(self, callable_, response_content: bytes):
        """Call a service method with a mocked response; return the method's return value."""
        with patch("bcz._transport.requests.post", _make_mock_post(response_content)):
            return callable_()

    def _assert_string_keys(self, result: dict):
        """Assert every key in *result* is a str."""
        self.assertIsInstance(result, dict)
        for k in result:
            self.assertIsInstance(k, str, f"Key {k!r} is {type(k).__name__}, expected str")

    # ------------------------------------------------------------------
    # User service
    # ------------------------------------------------------------------

    def test_login_keys_are_strings(self):
        resp = _struct_reply("login_with_phone", {1: "tok", 2: 0, 6: 12345, 10: 1, 11: 0})
        result = self._call_and_return(
            lambda: self.bcz.login("13900000000", "123456"), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["access_token"], "tok")
        self.assertEqual(result["unique_id"], 12345)
        self.assertEqual(result["role"], 1)
        self.assertNotIn("public_key", result)

    def test_have_a_try_v2_keys_are_strings(self):
        resp = _struct_reply("have_a_try_v2", {1: "user@example.com"})
        result = self._call_and_return(lambda: self.bcz.user.have_a_try_v2(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["email"], "user@example.com")

    def test_have_a_try_v3_keys_are_strings(self):
        resp = _struct_reply("have_a_try_v3", {1: "watch_token_xyz"})
        result = self._call_and_return(lambda: self.bcz.user.have_a_try_v3(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["token"], "watch_token_xyz")

    def test_get_profile_keys_are_strings(self):
        resp = _struct_reply("get_profile", {1: "Alice", 2: 1, 4: 999})
        result = self._call_and_return(lambda: self.bcz.get_profile(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["nickname"], "Alice")
        self.assertEqual(result["gender_id"], 1)
        self.assertEqual(result["unique_id"], 999)
        # field 3 (avatar) does not exist in UserProfile
        self.assertNotIn("avatar", result)

    # ------------------------------------------------------------------
    # Study service
    # ------------------------------------------------------------------

    def test_get_study_home_keys_are_strings(self):
        resp = _struct_reply("get_study_home", {1: 10, 2: 5, 3: 1, 4: 0})
        result = self._call_and_return(lambda: self.bcz.study.get_study_home(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["progress"], 10)
        self.assertEqual(result["today_progresss"], 5)

    # ------------------------------------------------------------------
    # Resource service
    # ------------------------------------------------------------------

    def test_translate_v2_keys_are_strings(self):
        resp = _struct_reply("translate_v2", {1: 1, 2: "你好", 4: "baidu"})
        result = self._call_and_return(lambda: self.bcz.translate("Hello"), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["type"], 1)
        self.assertEqual(result["trans"], "你好")
        self.assertEqual(result["trans_provider"], "baidu")

    def test_get_dict_by_word_v2_keys_are_strings(self):
        resp = _struct_reply("get_dict_by_word_v2", {1: "abandon", 2: "放弃"})
        result = self._call_and_return(lambda: self.bcz.get_word("abandon"), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["word_basic_info"], "abandon")

    def test_get_word_root_keys_are_strings(self):
        resp = _struct_reply("get_word_root", {1: "ab-", 4: "pack"})
        result = self._call_and_return(
            lambda: self.bcz.resource.get_word_root(10001), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["roots"], "ab-")
        self.assertEqual(result["word_pack_list"], "pack")

    def test_get_book_resource_update_info_keys_are_strings(self):
        resp = _struct_reply("get_book_resource_update_info", {1: 42, 2: 1234567890})
        result = self._call_and_return(
            lambda: self.bcz.resource.get_book_resource_update_info(1), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["book_id"], 42)
        self.assertEqual(result["zpk_updated_at"], 1234567890)

    # ------------------------------------------------------------------
    # Game service
    # ------------------------------------------------------------------

    def test_game_home_keys_are_strings(self):
        resp = _struct_reply("game_home", {1: 100, 2: 200, 3: 300})
        result = self._call_and_return(lambda: self.bcz.game.game_home(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["user_data_info"], 100)
        self.assertEqual(result["plan_info"], 200)
        self.assertEqual(result["basic_info"], 300)

    def test_sync_info_keys_are_strings(self):
        resp = _struct_reply("sync_info", {1: 7, 2: 3, 5: 1700000000, 6: 999})
        result = self._call_and_return(lambda: self.bcz.game.sync_info(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["island_version"], 7)
        self.assertEqual(result["server_time"], 1700000000)
        self.assertEqual(result["current_book_id"], 999)

    def test_get_worth_keys_are_strings(self):
        resp = _struct_reply("get_worth", {1: 30, 2: 100, 3: 500, 4: 10, 5: 2})
        result = self._call_and_return(lambda: self.bcz.game.get_worth(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["win_streak_days"], 30)
        self.assertEqual(result["word_done_count"], 500)

    def test_upgrade_sentence_building_v2_keys_are_strings(self):
        resp = _struct_reply("upgrade_sentence_building_v2", {1: 50, 2: 30, 3: 1})
        result = self._call_and_return(
            lambda: self.bcz.game.upgrade_sentence_building_v2(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["totalCoin"], 50)
        self.assertEqual(result["spentCoin"], 30)

    # ------------------------------------------------------------------
    # System service
    # ------------------------------------------------------------------

    def test_check_new_version_keys_are_strings(self):
        resp = _struct_reply("check_new_version", {1: 1, 2: "8.0.1", 5: "New features"})
        result = self._call_and_return(
            lambda: self.bcz.system.check_new_version(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["has_new_version"], 1)
        self.assertEqual(result["new_version"], "8.0.1")
        self.assertEqual(result["version_description"], "New features")

    def test_get_switches_keys_are_strings(self):
        resp = _struct_reply("get_switches", {1: 1, 2: 0})
        result = self._call_and_return(lambda: self.bcz.system.get_switches(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["allow_try_user"], 1)
        self.assertEqual(result["allow_fast_login"], 0)

    def test_get_remind_info_keys_are_strings(self):
        resp = _struct_reply("get_remind_info", {2: 8, 5: 1})
        result = self._call_and_return(lambda: self.bcz.notify.get_remind_info(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["hour"], 8)
        self.assertEqual(result["task_enable"], 1)

    def test_get_user_member_info_keys_are_strings(self):
        resp = _struct_reply("get_user_member_info", {1: "word_energy", 4: 50})
        result = self._call_and_return(
            lambda: self.bcz.strategy.get_user_member_info(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["entitlement_key"], "word_energy")
        self.assertEqual(result["current_value"], 50)

    def test_qrcode_scan_keys_are_strings(self):
        resp = _struct_reply("qrcode_scan", {1: 1, 2: "OK"})
        result = self._call_and_return(
            lambda: self.bcz.system.qrcode_scan("qr_text"), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["action"], 1)
        self.assertEqual(result["message"], "OK")

    # ------------------------------------------------------------------
    # Advertise service
    # ------------------------------------------------------------------

    def test_get_launch_ad_keys_are_strings(self):
        resp = _struct_reply("get_launch_ad", {1: "own_ad_data", 2: "third_ad_data"})
        result = self._call_and_return(
            lambda: self.bcz.advertise.get_launch_ad(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["own_ad"], "own_ad_data")
        self.assertEqual(result["third_ad"], "third_ad_data")

    def test_get_live_streaming_info_keys_are_strings(self):
        resp = _struct_reply("get_live_streaming_info", {1: 1700000000, 2: 1700001000})
        result = self._call_and_return(
            lambda: self.bcz.advertise.get_live_streaming_info(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["current_timestamp"], 1700000000)
        self.assertEqual(result["start_timestamp"], 1700001000)

    # ------------------------------------------------------------------
    # Mall / Avatar service
    # ------------------------------------------------------------------

    def test_get_ip_keys_are_strings(self):
        resp = _struct_reply("get_ip", {1: 2, 2: "长安", 3: "Chang'an", 4: "古城"})
        result = self._call_and_return(lambda: self.bcz.avatar.get_ip(), resp)
        self._assert_string_keys(result)
        self.assertEqual(result["ip_type"], 2)
        self.assertEqual(result["ip_cn"], "长安")
        self.assertEqual(result["ip_en"], "Chang'an")

    def test_get_rank_pk_address_keys_are_strings(self):
        resp = _struct_reply("get_rank_pk_address", {1: "wss://rank.example.com", 2: 1000, 3: 2000})
        result = self._call_and_return(
            lambda: self.bcz.pk.get_rank_pk_address(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["url"], "wss://rank.example.com")
        self.assertEqual(result["beginTime"], 1000)

    # ------------------------------------------------------------------
    # Assistant / Activity service
    # ------------------------------------------------------------------

    def test_analyze_clipboard_keys_are_strings(self):
        resp = _struct_reply("analyze_clipboard", {1: 3, 2: '{"word":"abandon"}'})
        result = self._call_and_return(
            lambda: self.bcz.assistant.analyze_clipboard("abandon"), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["style"], 3)
        self.assertEqual(result["json"], '{"word":"abandon"}')

    def test_buy_export_quota_keys_are_strings(self):
        resp = _struct_reply("buy_export_quota", {1: 5})
        result = self._call_and_return(
            lambda: self.bcz.activity.buy_export_quota(), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["balance"], 5)

    # ------------------------------------------------------------------
    # Course service
    # ------------------------------------------------------------------

    def test_get_vocab_live_info_keys_are_strings(self):
        resp = _struct_reply("get_vocab_live_info", {1: "Teacher Li", 3: 3600, 4: "Lesson 1"})
        result = self._call_and_return(
            lambda: self.bcz.course.get_vocab_live_info(1001, 2001), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["nickname"], "Teacher Li")
        self.assertEqual(result["duration"], 3600)
        self.assertEqual(result["title"], "Lesson 1")

    def test_polling_info_keys_are_strings(self):
        resp = _struct_reply("polling_info", {1: 1, 2: "pro", 3: "user"})
        result = self._call_and_return(
            lambda: self.bcz.course.polling_info(1001, 2001), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["heart_beat"], 1)
        self.assertEqual(result["pro_contents"], "pro")

    def test_get_improve_video_info_keys_are_strings(self):
        resp = _struct_reply("get_improve_video_info", {1: "https://video.example.com/v.mp4", 2: 120})
        result = self._call_and_return(
            lambda: self.bcz.course.get_improve_video_info(100001), resp
        )
        self._assert_string_keys(result)
        self.assertEqual(result["video_url"], "https://video.example.com/v.mp4")
        self.assertEqual(result["duration"], 120)


if __name__ == "__main__":
    unittest.main(verbosity=2)
