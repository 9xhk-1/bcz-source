"""
UserStudyApiService — 学习核心接口 / Core study API.

Host: https://learn.baicizhan.com
Service: user_study
"""

from __future__ import annotations

from .._protocol import TYPE_I32, TYPE_LIST, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_deep
from ._field_maps import STUDY_HOME

_HOST = "https://learn.baicizhan.com"
_SVC = "user_study"


class UserStudyApiService(_BaseService):
    """百词斩学习服务 / BCZ User Study Service."""

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Study home
    # ------------------------------------------------------------------

    def get_study_home(self) -> dict:
        """获取学习首页数据 / Get study home page data. Returns StudyHome."""
        self._session.require_auth()
        raw = self._call("get_study_home", lambda w: None)
        return _map_deep(raw, STUDY_HOME)

    # ------------------------------------------------------------------
    # Book selection
    # ------------------------------------------------------------------

    def select_book(self, book_id: int) -> None:
        """选择学习词书 / Select a book to study."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("select_book", _write)

    # ------------------------------------------------------------------
    # Book info
    # ------------------------------------------------------------------

    def get_all_books_basic_info(self) -> list:
        """获取所有词书基本信息 / Get basic info for all books."""
        result = self._call("get_all_books_basic_info", lambda w: None)
        return result if isinstance(result, list) else []

    def get_all_books_basic_info_v2(self) -> list:
        """获取所有词书基本信息（v2）/ Get basic info for all books (v2)."""
        result = self._call("get_all_books_basic_info_v2", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Rank / stats
    # ------------------------------------------------------------------

    def get_rank_info(self) -> dict:
        """获取排行榜信息 / Get rank information."""
        self._session.require_auth()
        raw = self._call("get_rank_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_daka_base_info(self) -> dict:
        """获取打卡基础信息 / Get daka (check-in) base information."""
        self._session.require_auth()
        raw = self._call("get_daka_base_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_daily_task(self) -> dict:
        """获取每日任务信息 / Get daily task info."""
        self._session.require_auth()
        raw = self._call("get_daily_task", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def win_streak_status(self) -> dict:
        """获取连胜状态 / Get win streak status."""
        self._session.require_auth()
        raw = self._call("win_streak_status", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # User basic info
    # ------------------------------------------------------------------

    def user_basic_info(self) -> dict:
        """获取用户基础信息 / Get user basic info."""
        self._session.require_auth()
        raw = self._call("user_basic_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def user_basic_info_v2(self) -> dict:
        """获取用户基础信息（v2）/ Get user basic info (v2)."""
        self._session.require_auth()
        raw = self._call("user_basic_info_v2", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Calendar / recommendation
    # ------------------------------------------------------------------

    def get_calendar_daily_info(self, yyyyMMdd: str) -> dict:
        """获取指定日期的日历信息 / Get calendar daily info for a date (yyyyMMdd)."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, yyyyMMdd)

        raw = self._call("get_calendar_daily_info", _write)
        return raw if isinstance(raw, dict) else {}

    def get_recommendation(self) -> dict:
        """获取推荐信息 / Get recommendation."""
        self._session.require_auth()
        raw = self._call("get_recommendation", lambda w: None)
        return raw if isinstance(raw, dict) else {}
