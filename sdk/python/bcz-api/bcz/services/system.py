"""
System services — 系统/通知/策略/上报接口

Includes:
  BczSystemApiService  — system.baicizhan.com  / bcz_system
  NotifyService        — notify.baicizhan.com  / notify
  StrategyApiService   — strategy.baicizhan.com / strategy
  BczReportApiService  — events.baicizhan.com   / bcz_report
"""

from __future__ import annotations

from typing import List, Optional

from .._protocol import TYPE_I32, TYPE_LIST, TYPE_MAP, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService


# ---------------------------------------------------------------------------
# BczSystemApiService
# ---------------------------------------------------------------------------

class BczSystemApiService(_BaseService):
    """百词斩系统服务 / BCZ System API Service.

    Handles app versioning, configuration switches, QR scanning,
    domain allow/block lists, and event reporting.
    """

    _host = "https://system.baicizhan.com"
    _service = "bcz_system"

    # ------------------------------------------------------------------
    # Version checks (no auth)
    # ------------------------------------------------------------------

    def check_new_version(self) -> dict:
        """检查 App 更新 / Check for a new app version."""
        raw = self._call("check_new_version", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def check_dict_new_version(self) -> dict:
        """检查词典更新 / Check for dictionary updates."""
        raw = self._call("check_dict_new_version", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_app_new_version_info(self) -> dict:
        """获取新版本信息 / Get new version info."""
        raw = self._call("get_app_new_version_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_app_beta_update_info(self) -> dict:
        """获取 Beta 版更新信息 / Get beta update info."""
        raw = self._call("get_app_beta_update_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def check_ireading_new_version(self) -> dict:
        """检查 iReading 更新 / Check iReading version."""
        raw = self._call("check_ireading_new_version", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Config (no auth)
    # ------------------------------------------------------------------

    def check_infos(self) -> dict:
        """获取系统状态信息 / Check system infos."""
        raw = self._call("check_infos", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def check_nav_tabs(self) -> dict:
        """获取导航栏配置 / Get navigation tab configuration."""
        raw = self._call("check_nav_tabs", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_switches(self) -> dict:
        """获取功能开关配置 / Get feature toggle switches."""
        raw = self._call("get_switches", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_test_flags(self) -> dict:
        """获取测试标志 / Get test/experiment flags."""
        raw = self._call("get_test_flags", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_static_config(self) -> dict:
        """获取静态配置 / Get static app configuration."""
        raw = self._call("get_static_config", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_privacy_agreement_version(self) -> dict:
        """获取隐私协议版本 / Get privacy policy agreement version."""
        raw = self._call("get_privacy_agreement_version", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Domain lists (no auth)
    # ------------------------------------------------------------------

    def get_domain_whitelist(self) -> list:
        """获取域名白名单 / Get domain whitelist."""
        result = self._call("get_domain_whitelist", lambda w: None)
        return result if isinstance(result, list) else []

    def get_domain_blacklist(self) -> list:
        """获取域名黑名单 / Get domain blacklist."""
        result = self._call("get_domain_blacklist", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Auth-required
    # ------------------------------------------------------------------

    def get_guide_for_new_strategy(self) -> dict:
        """获取新策略引导信息 / Get new strategy guide."""
        self._session.require_auth()
        raw = self._call("get_guide_for_new_strategy", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def qrcode_scan(self, qr_content: str) -> dict:
        """扫描二维码 / Scan a QR code."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, qr_content)

        raw = self._call("qrcode_scan", _write)
        return raw if isinstance(raw, dict) else {}

    def get_app_feedback_info(self) -> dict:
        """获取反馈信息 / Get app feedback information."""
        self._session.require_auth()
        raw = self._call("get_app_feedback_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Event reporting
    # ------------------------------------------------------------------

    def report_event(
        self, event_name: str, params: Optional[dict] = None
    ) -> None:
        """上报事件（需登录）/ Report an event (auth required)."""
        self._session.require_auth()
        self._report_event_impl("report_event", event_name, params or {})

    def report_event_without_login(
        self, event_name: str, params: Optional[dict] = None
    ) -> None:
        """上报事件（无需登录）/ Report an event (no auth required)."""
        self._report_event_impl("report_event_without_login", event_name, params or {})

    def _report_event_impl(
        self, method: str, event_name: str, params: dict
    ) -> None:
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, event_name)
            if params:
                w.write_field_begin(TYPE_MAP, 2)
                from .._protocol import TYPE_BINARY
                w.write_map_begin(TYPE_BINARY, TYPE_BINARY, len(params))
                for k, v in params.items():
                    w.write_string(str(k))
                    w.write_string(str(v))

        self._call(method, _write)


# ---------------------------------------------------------------------------
# NotifyService
# ---------------------------------------------------------------------------

class NotifyService(_BaseService):
    """百词斩通知服务 / BCZ Notify Service."""

    _host = "https://notify.baicizhan.com"
    _service = "notify"

    def get_remind_info(self) -> dict:
        """获取提醒设置 / Get reminder settings."""
        self._session.require_auth()
        raw = self._call("get_remind_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def set_remind_info(self, remind_time: str, enabled: bool) -> None:
        """设置提醒时间和开关 / Set reminder time and enable/disable."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, remind_time)
            self._write_bool(w, 2, enabled)

        self._call("set_remind_info", _write)

    def get_latest_notify(self) -> list:
        """获取最新通知列表（v1）/ Get latest notifications (v1)."""
        self._session.require_auth()
        result = self._call("get_latest_notify", lambda w: None)
        return result if isinstance(result, list) else []

    def get_latest_notify_v2(self) -> list:
        """获取最新通知列表（v2）/ Get latest notifications (v2)."""
        self._session.require_auth()
        result = self._call("get_latest_notify_v2", lambda w: None)
        return result if isinstance(result, list) else []

    def get_remind_msgs(self) -> list:
        """获取提醒消息 / Get reminder messages."""
        self._session.require_auth()
        result = self._call("get_remind_msgs", lambda w: None)
        return result if isinstance(result, list) else []

    def push_confirm(self, msg_id: str) -> None:
        """确认推送消息已读 / Confirm push message as read."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, msg_id)

        self._call("push_confirm", _write)


# ---------------------------------------------------------------------------
# StrategyApiService
# ---------------------------------------------------------------------------

class StrategyApiService(_BaseService):
    """百词斩策略服务（会员/权益）/ BCZ Strategy Service (membership & entitlements)."""

    _host = "https://strategy.baicizhan.com"
    _service = "strategy"

    def get_user_member_info(self) -> dict:
        """获取用户会员信息 / Get user membership info."""
        self._session.require_auth()
        raw = self._call("get_user_member_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_user_word_energy_info(self) -> dict:
        """获取单词能量信息 / Get word energy info."""
        self._session.require_auth()
        raw = self._call("get_user_word_energy_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_user_sentence_energy_info(self) -> dict:
        """获取句子能量信息 / Get sentence energy info."""
        self._session.require_auth()
        raw = self._call("get_user_sentence_energy_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_user_entitlement_infos(self) -> list:
        """获取用户权益列表 / Get user entitlement list."""
        self._session.require_auth()
        result = self._call("get_user_entitlement_infos", lambda w: None)
        return result if isinstance(result, list) else []

    def get_user_entitlement_sale_info(self) -> dict:
        """获取权益销售信息 / Get entitlement sale info."""
        self._session.require_auth()
        raw = self._call("get_user_entitlement_sale_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_member_popup_sale_info(self) -> dict:
        """获取会员弹窗销售信息 / Get member popup sale info."""
        self._session.require_auth()
        raw = self._call("get_member_popup_sale_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_app_home_page_member_stage_info(self) -> dict:
        """获取首页会员状态信息 / Get home page member stage info."""
        self._session.require_auth()
        raw = self._call("get_app_home_page_member_stage_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_free_member(self) -> dict:
        """获取免费会员信息 / Get free member details."""
        self._session.require_auth()
        raw = self._call("get_free_member", lambda w: None)
        return raw if isinstance(raw, dict) else {}


# ---------------------------------------------------------------------------
# BczReportApiService
# ---------------------------------------------------------------------------

class BczReportApiService(_BaseService):
    """百词斩事件上报服务 / BCZ Event Report Service."""

    _host = "https://events.baicizhan.com"
    _service = "bcz_report"

    def report_event(self, events: list) -> None:
        """批量上报事件（需登录）/ Batch report events (auth required).

        :param events: list of ``{"event_name": str, "params": dict, "timestamp": int}``
        """
        self._session.require_auth()
        self._send_events("report_event", events)

    def report_event_without_login(self, events: list) -> None:
        """批量上报事件（无需登录）/ Batch report events (no auth).

        :param events: list of ``{"event_name": str, "params": dict, "timestamp": int}``
        """
        self._send_events("report_event_without_login", events)

    def _send_events(self, method: str, events: list) -> None:
        from .._protocol import TYPE_BINARY

        def _write_event(w: CompactWriter, event: dict) -> None:
            self._write_string(w, 1, str(event.get("event_name", "")))
            self._write_i32(w, 2, int(event.get("timestamp", 0)))
            params = event.get("params") or {}
            if params:
                w.write_field_begin(TYPE_MAP, 3)
                w.write_map_begin(TYPE_BINARY, TYPE_BINARY, len(params))
                for k, v in params.items():
                    w.write_string(str(k))
                    w.write_string(str(v))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, events, _write_event)

        self._call(method, _write)
