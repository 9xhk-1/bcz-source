"""
UserStudyApiService — 学习核心接口 / Core study API.

Host: https://learn.baicizhan.com
Service: user_study
"""

from __future__ import annotations

from typing import List, Optional

from .._protocol import TYPE_I32, TYPE_I64, TYPE_LIST, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_fields

_HOST = "https://learn.baicizhan.com"
_SVC = "user_study"

# ---------------------------------------------------------------------------
# Result field maps  (verified against user_study_api Java source)
# ---------------------------------------------------------------------------

# user_study_api.StudyHome
_STUDY_HOME_FIELDS = {
    1: "progress", 2: "today_progresss", 3: "learning_button", 4: "review_button",
}


class UserStudyApiService(_BaseService):
    """百词斩学习服务 / BCZ User Study Service.

    Covers daily study plan, word lists, progress synchronisation,
    checkpoint submission, and statistics.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Study home / plan
    # ------------------------------------------------------------------

    def get_study_home(self) -> dict:
        """获取学习首页数据 / Get study home page data. Returns StudyHome."""
        self._session.require_auth()
        raw = self._call("get_study_home", lambda w: None)
        return _map_fields(raw, _STUDY_HOME_FIELDS)

    def get_study_plan(self) -> dict:
        """获取当前学习计划 / Get current study plan."""
        self._session.require_auth()
        raw = self._call("get_study_plan", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def update_study_plan(self, new_count: int, review_count: int) -> None:
        """更新学习计划（每日新词数和复习数）/ Update study plan."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, new_count)
            self._write_i32(w, 2, review_count)

        self._call("update_study_plan", _write)

    # ------------------------------------------------------------------
    # Books
    # ------------------------------------------------------------------

    def get_book_list(self) -> list:
        """获取可选词书列表 / Get list of available books."""
        self._session.require_auth()
        result = self._call("get_book_list", lambda w: None)
        return result if isinstance(result, list) else []

    def get_all_books(self) -> list:
        """获取所有词书（无需登录）/ Get all books (no auth required)."""
        result = self._call("get_all_books", lambda w: None)
        return result if isinstance(result, list) else []

    def select_book(self, book_id: int) -> None:
        """选择学习词书 / Select a book to study."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("select_book", _write)

    def get_book_detail(self, book_id: int) -> dict:
        """获取词书详情 / Get book details."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        raw = self._call("get_book_detail", _write)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Daily words
    # ------------------------------------------------------------------

    def get_today_words(self) -> dict:
        """获取今日学习单词 / Get today's study words."""
        self._session.require_auth()
        raw = self._call("get_today_words", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_review_words(self) -> list:
        """获取复习单词列表 / Get words due for review."""
        self._session.require_auth()
        result = self._call("get_review_words", lambda w: None)
        return result if isinstance(result, list) else []

    def get_new_words(self) -> list:
        """获取新单词列表 / Get new words to learn."""
        self._session.require_auth()
        result = self._call("get_new_words", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Word actions
    # ------------------------------------------------------------------

    def skip_word(self, topic_id: int) -> None:
        """跳过单词 / Skip a word."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)

        self._call("skip_word", _write)

    def mark_word_known(self, topic_id: int) -> None:
        """标记单词为已知 / Mark a word as already known."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)

        self._call("mark_word_known", _write)

    # ------------------------------------------------------------------
    # Progress sync
    # ------------------------------------------------------------------

    def sync_study_progress(self, progress_list: list) -> dict:
        """同步学习进度 / Synchronise word learning progress.

        :param progress_list: List of progress dicts, each with keys
            ``topic_id`` (int), ``status`` (int), ``study_time`` (int).
        """
        self._session.require_auth()

        def _write_item(w: CompactWriter, item: dict) -> None:
            self._write_i32(w, 1, int(item.get("topic_id", 0)))
            self._write_i32(w, 2, int(item.get("status", 0)))
            self._write_i32(w, 3, int(item.get("study_time", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, progress_list, _write_item)

        raw = self._call("sync_study_progress", _write)
        return raw if isinstance(raw, dict) else {}

    def submit_study_result(self, results: list) -> dict:
        """提交学习结果 / Submit study session results.

        :param results: List of result dicts with ``topic_id`` and ``correct`` keys.
        """
        self._session.require_auth()

        def _write_item(w: CompactWriter, item: dict) -> None:
            self._write_i32(w, 1, int(item.get("topic_id", 0)))
            self._write_i32(w, 2, int(item.get("correct", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, results, _write_item)

        raw = self._call("submit_study_result", _write)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Checkpoint / 打卡
    # ------------------------------------------------------------------

    def submit_checkpoint(self, checkpoint_data: dict) -> None:
        """提交打卡数据 / Submit a daily checkpoint (打卡)."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            for fid, key in [(1, "study_time"), (2, "new_count"), (3, "review_count")]:
                val = checkpoint_data.get(key)
                if val is not None:
                    self._write_i32(w, fid, int(val))
            w.write_field_stop()
            w.write_struct_end()

        self._call("submit_checkpoint", _write)

    def get_checkpoint_info(self) -> dict:
        """获取打卡信息 / Get checkpoint information."""
        self._session.require_auth()
        raw = self._call("get_checkpoint_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Statistics
    # ------------------------------------------------------------------

    def get_study_statistics(self) -> dict:
        """获取学习统计数据 / Get study statistics."""
        self._session.require_auth()
        raw = self._call("get_study_statistics", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_user_book_progress(self) -> dict:
        """获取当前词书学习进度 / Get progress for current book."""
        self._session.require_auth()
        raw = self._call("get_user_book_progress", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_study_record(self) -> dict:
        """获取学习记录 / Get study record."""
        self._session.require_auth()
        raw = self._call("get_study_record", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_streak_info(self) -> dict:
        """获取连续学习天数信息 / Get streak (consecutive days) info."""
        self._session.require_auth()
        raw = self._call("get_streak_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}
