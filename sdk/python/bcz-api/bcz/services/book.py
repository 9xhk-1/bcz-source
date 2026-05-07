"""
UserBookService — 用户词书管理接口 / User word-book management API.

Host: https://booklist.baicizhan.com
Service: user_book
"""

from __future__ import annotations

from typing import List, Optional

from .._protocol import TYPE_I32, TYPE_LIST, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService

_HOST = "https://booklist.baicizhan.com"
_SVC = "user_book"


class UserBookService(_BaseService):
    """百词斩用户词书服务 / BCZ User Book Service.

    Covers creation, editing, sharing, and syncing of personal word books.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Personal book CRUD
    # ------------------------------------------------------------------

    def get_user_book_list(self) -> list:
        """获取用户词书列表 / Get personal book list."""
        self._session.require_auth()
        result = self._call("get_user_books", lambda w: None)
        return result if isinstance(result, list) else []

    def create_user_book(self, name: str, description: str = "") -> dict:
        """创建用户词书 / Create a new personal word book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, name)
            self._write_string(w, 2, description)

        raw = self._call("add_user_book", _write)
        return raw if isinstance(raw, dict) else {}

    def delete_user_book(self, book_id: int) -> None:
        """删除用户词书 / Delete a personal word book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("delete_user_book", _write)

    def update_user_book(
        self,
        book_id: int,
        name: Optional[str] = None,
        description: Optional[str] = None,
    ) -> None:
        """更新用户词书信息 / Update personal word book metadata."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            if name is not None:
                self._write_string(w, 2, name)
            if description is not None:
                self._write_string(w, 3, description)

        self._call("update_user_book_info", _write)

    def select_user_book(self, book_id: int) -> None:
        """选择用户词书 / Select a user book as current."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("select_user_book", _write)

    def get_user_plan_book(self) -> dict:
        """获取用户计划词书 / Get the user's planned book."""
        self._session.require_auth()
        raw = self._call("get_user_plan_book", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Words within a book
    # ------------------------------------------------------------------

    def add_word_to_book(self, book_id: int, topic_id: int) -> None:
        """向词书添加单词 / Add a word (by topic_id) to a personal book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, topic_id)

        self._call("add_word_to_books", _write)

    def delete_word_from_book(self, book_id: int, topic_id: int) -> None:
        """从词书删除单词 / Delete a word from a personal book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, topic_id)

        self._call("delete_user_book_words", _write)

    def get_book_words(self, book_id: int) -> list:
        """获取词书中的单词列表 / Get all words in a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_user_book_words", _write)
        return result if isinstance(result, list) else []

    def batch_add_words(self, book_id: int, topic_ids: list) -> dict:
        """批量向词书添加单词 / Batch-add words (topic IDs) to a book.

        :param topic_ids: list of int topic IDs
        """
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_list_i32(w, 2, topic_ids)

        raw = self._call("add_words_to_books", _write)
        return raw if isinstance(raw, dict) else {}

    def add_words_to_book(self, book_id: int, topic_ids: list) -> dict:
        """批量添加单词到词书 / Add multiple words (topic IDs) to a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_list_i32(w, 2, topic_ids)

        raw = self._call("add_words_to_books", _write)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # OCR
    # ------------------------------------------------------------------

    def ocr_match_words(self, image_data: bytes) -> list:
        """OCR 识别图片中的单词 / Recognize words in an image via OCR."""
        self._session.require_auth()

        from .._protocol import TYPE_BINARY

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_BINARY, 1)
            w.write_bytes(image_data)

        result = self._call("match_words_ocr", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Smart device
    # ------------------------------------------------------------------

    def unbind_smart_device(self, device_sn: str) -> None:
        """解绑智能设备 / Unbind a smart device."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, device_sn)

        self._call("remove_bind_machine", _write)

    def get_smart_device_list(self) -> list:
        """获取已绑定智能设备列表 / Get list of bound smart devices."""
        self._session.require_auth()
        result = self._call("get_user_machine_infos", lambda w: None)
        return result if isinstance(result, list) else []

    def get_device_sku_info(self) -> dict:
        """获取设备 SKU 信息 / Get device SKU info."""
        self._session.require_auth()
        raw = self._call("get_device_sku_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Sharing
    # ------------------------------------------------------------------

    def share_book(self, book_id: int) -> dict:
        """分享词书，返回分享码信息 / Share a book and return share code info."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        raw = self._call("get_user_book_share_code", _write)
        return raw if isinstance(raw, dict) else {}

    def import_shared_book(self, share_code: str) -> dict:
        """导入分享的词书 / Import a shared book by share code."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, share_code)

        raw = self._call("add_user_book_by_code", _write)
        return raw if isinstance(raw, dict) else {}

    def get_share_code_info(self, share_code: str) -> dict:
        """获取分享码对应的词书信息 / Get book info by share code."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, share_code)

        raw = self._call("get_share_code_info", _write)
        return raw if isinstance(raw, dict) else {}
