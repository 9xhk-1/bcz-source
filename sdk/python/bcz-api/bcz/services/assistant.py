"""
Assistant and Activity services — 助手/活动接口

Includes:
  UserAssistantApiService  — assistant.baicizhan.com / assistant
  UserActivityApiService   — activity.baicizhan.com  / activity
"""

from __future__ import annotations

from typing import List

from .._protocol import TYPE_I32, TYPE_LIST, TYPE_MAP, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_fields


# ---------------------------------------------------------------------------
# Result field maps  (verified against assistant/activity Java sources)
# ---------------------------------------------------------------------------

# assistant_api.ClipboardResp
_CLIPBOARD_RESP_FIELDS = {1: "style", 2: "json"}

# assistant_api.UserBetaInfo
_USER_BETA_INFO_FIELDS = {
    1: "beta_types", 2: "high_level_book_ids", 3: "daka_poster_book_ids",
}

# assistant_api.PayResp
_PAY_RESP_FIELDS = {
    1: "order_id", 2: "step_pay_order_id", 3: "no_need_pay",
    4: "pay_id", 5: "pay_url", 6: "pay_json", 7: "pay_type",
}

# activity_api.ExportActivityInfo
_EXPORT_ACTIVITY_INFO_FIELDS = {1: "template_infos", 2: "balance", 4: "banner"}

# activity_api.ExportQuota
_EXPORT_QUOTA_FIELDS = {1: "balance"}


# ---------------------------------------------------------------------------
# UserAssistantApiService
# ---------------------------------------------------------------------------

class UserAssistantApiService(_BaseService):
    """百词斩用户助手服务 / BCZ User Assistant Service.

    Covers clipboard analysis, credit management, beta feature access,
    word statistics, and Huawei in-app purchases.
    """

    _host = "https://assistant.baicizhan.com"
    _service = "assistant"

    def get_exploration_items(self) -> list:
        """获取探索功能项 / Get exploration feature items."""
        self._session.require_auth()
        result = self._call("get_exploration_items", lambda w: None)
        return result if isinstance(result, list) else []

    def analyze_clipboard(self, code: str) -> dict:
        """分析剪贴板内容 / Analyze clipboard code/content. Returns ClipboardResp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, code)

        raw = self._call("analyze_clipboard", _write)
        return _map_fields(raw, _CLIPBOARD_RESP_FIELDS)

    def get_beta_user_types_v2(self) -> dict:
        """获取 Beta 用户类型（v2）/ Get beta user types (v2). Returns UserBetaInfo."""
        self._session.require_auth()
        raw = self._call("get_beta_user_types_v2", lambda w: None)
        return _map_fields(raw, _USER_BETA_INFO_FIELDS)

    def get_activity_updated_time(self) -> int:
        """获取活动更新时间戳 / Get activity updated timestamp."""
        self._session.require_auth()
        result = self._call("get_activity_updated_time", lambda w: None)
        return int(result) if result is not None else 0

    def check_feedback_msg(self, device_id: str) -> int:
        """检查反馈消息状态 / Check feedback message status."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, device_id)

        result = self._call("check_feedback_msg", _write)
        return int(result) if result is not None else 0

    def done_word_stat(self, book_id: int, stat_logs: list) -> int:
        """上报单词学习统计 / Report word study statistics.

        :param stat_logs: list of ``{"topic_id": int, "stat_type": int, "value": int}``
        """
        self._session.require_auth()

        def _write_log(w: CompactWriter, log: dict) -> None:
            self._write_i32(w, 1, int(log.get("topic_id", 0)))
            self._write_i32(w, 2, int(log.get("stat_type", 0)))
            self._write_i32(w, 3, int(log.get("value", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_list_struct(w, 2, stat_logs, _write_log)

        result = self._call("done_word_stat", _write)
        return int(result) if result is not None else 0

    def get_credit(self) -> int:
        """获取用户积分 / Get user credit balance."""
        self._session.require_auth()
        result = self._call("get_credit", lambda w: None)
        return int(result) if result is not None else 0

    def huawei_pay(
        self, order_id: str, purchase_token: str, product_id: str
    ) -> dict:
        """华为支付回调 / Huawei in-app purchase callback."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, order_id)
            self._write_string(w, 2, purchase_token)
            self._write_string(w, 3, product_id)

        raw = self._call("huawei_pay", _write)
        return _map_fields(raw, _PAY_RESP_FIELDS)

    def get_learning_stats(self) -> dict:
        """获取学习统计数据 / Get detailed learning statistics."""
        self._session.require_auth()
        raw = self._call("get_learning_stats", lambda w: None)
        return raw if isinstance(raw, dict) else {}


# ---------------------------------------------------------------------------
# UserActivityApiService
# ---------------------------------------------------------------------------

class UserActivityApiService(_BaseService):
    """百词斩用户活动服务（导出等）/ BCZ User Activity Service (export, etc.)."""

    _host = "https://activity.baicizhan.com"
    _service = "activity"

    def get_export_activity_info(self) -> dict:
        """获取导出活动信息 / Get export activity info. Returns ExportActivityInfo."""
        self._session.require_auth()
        raw = self._call("get_export_activity_info", lambda w: None)
        return _map_fields(raw, _EXPORT_ACTIVITY_INFO_FIELDS)

    def buy_export_quota(self) -> dict:
        """购买导出配额 / Purchase export quota. Returns ExportQuota."""
        self._session.require_auth()
        raw = self._call("buy_export_quota", lambda w: None)
        return _map_fields(raw, _EXPORT_QUOTA_FIELDS)

    def export_words(self, email: str, book_id: int, fmt: int = 1) -> None:
        """导出单词到邮箱 / Export words to email.

        :param email: Recipient email / 收件邮箱
        :param book_id: Book ID to export / 词书 ID
        :param fmt: Export format (1=default) / 导出格式
        """
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, email)
            self._write_i32(w, 2, book_id)
            self._write_i32(w, 3, fmt)

        self._call("export_words", _write)
