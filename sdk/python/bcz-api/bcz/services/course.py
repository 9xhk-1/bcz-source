"""
CourseApiService — 课程接口 / Course API.

Host: https://learn.baicizhan.com
Service: course
"""

from __future__ import annotations

from .._protocol import TYPE_I32, CompactWriter
from .._session import BczSession
from ._base import _BaseService

_HOST = "https://learn.baicizhan.com"
_SVC = "course"


class CourseApiService(_BaseService):
    """百词斩课程服务 / BCZ Course Service.

    Covers live vocabulary lessons, mark-word books, improve-video
    chapters, and UGC content submission.
    """

    _host = _HOST
    _service = _SVC

    def get_vocab_live_info(self, course_id: int, article_id: int) -> dict:
        """获取词汇直播课信息 / Get vocab live course info."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, course_id)
            self._write_i32(w, 2, article_id)

        raw = self._call("getVocabLiveInfo", _write)
        return raw if isinstance(raw, dict) else {}

    def polling_info(self, course_id: int, article_id: int) -> dict:
        """轮询课程信息 / Poll for course progress info."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, course_id)
            self._write_i32(w, 2, article_id)

        raw = self._call("pollingInfo", _write)
        return raw if isinstance(raw, dict) else {}

    def livedone(self, course_id: int, article_id: int) -> None:
        """标记直播课已完成 / Mark a live course as done."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, course_id)
            self._write_i32(w, 2, article_id)

        self._call("livedone", _write)

    def get_mark_book_list(self, paper_id: int) -> list:
        """获取标记词书列表 / Get mark-word book list for a paper."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, paper_id)

        result = self._call("getMarkBookList", _write)
        return result if isinstance(result, list) else []

    def delete_mark_word(self, topic_id: int, paper_id: int) -> None:
        """删除标记单词 / Delete a marked word from a paper."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)
            self._write_i32(w, 2, paper_id)

        self._call("deleteMarkWord", _write)

    def get_improve_video_info(self, chapter_id: int) -> dict:
        """获取强化视频章节信息 / Get improve video chapter info."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, chapter_id)

        raw = self._call("getImproveVideoInfo", _write)
        return raw if isinstance(raw, dict) else {}

    def submit_improve_chapter_done(self, chapter_id: int, progress: int) -> None:
        """提交强化章节完成状态 / Submit improve chapter completion."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, chapter_id)
            self._write_i32(w, 2, progress)

        self._call("submitImproveChapterDone", _write)

    def feedback(self, article_id: int, qs_id: int, choice: int) -> None:
        """提交课程反馈 / Submit course feedback."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, article_id)
            self._write_i32(w, 2, qs_id)
            self._write_i32(w, 3, choice)

        self._call("feedback", _write)

    def submit_ugc(self, course_id: int, article_id: int, content: str) -> None:
        """提交 UGC 内容 / Submit user-generated content."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, course_id)
            self._write_i32(w, 2, article_id)
            self._write_string(w, 3, content)

        self._call("submitugc", _write)
