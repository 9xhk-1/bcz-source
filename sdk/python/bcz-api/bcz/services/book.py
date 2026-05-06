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

    Covers creation, editing, sharing, and syncing of personal word books,
    as well as browsing public and recommended books.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Personal book CRUD
    # ------------------------------------------------------------------

    def get_user_book_list(self) -> list:
        """获取用户词书列表 / Get personal book list."""
        self._session.require_auth()
        result = self._call("get_user_book_list", lambda w: None)
        return result if isinstance(result, list) else []

    def create_user_book(self, name: str, description: str = "") -> dict:
        """创建用户词书 / Create a new personal word book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, name)
            self._write_string(w, 2, description)

        raw = self._call("create_user_book", _write)
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

        self._call("update_user_book", _write)

    # ------------------------------------------------------------------
    # Words within a book
    # ------------------------------------------------------------------

    def add_word_to_book(self, book_id: int, word: str, meaning: str = "") -> None:
        """向词书添加单词 / Add a word to a personal book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_string(w, 2, word)
            self._write_string(w, 3, meaning)

        self._call("add_word_to_book", _write)

    def delete_word_from_book(self, book_id: int, topic_id: int) -> None:
        """从词书删除单词 / Delete a word from a personal book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, topic_id)

        self._call("delete_word_from_book", _write)

    def get_book_words(self, book_id: int) -> list:
        """获取词书中的单词列表 / Get all words in a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_book_words", _write)
        return result if isinstance(result, list) else []

    def batch_add_words(self, book_id: int, words: list) -> dict:
        """批量向词书添加单词 / Batch-add words to a book.

        :param words: list of ``{"word": str, "meaning": str}``
        """
        self._session.require_auth()

        def _write_word(w: CompactWriter, item: dict) -> None:
            self._write_string(w, 1, str(item.get("word", "")))
            self._write_string(w, 2, str(item.get("meaning", "")))

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_list_struct(w, 2, words, _write_word)

        raw = self._call("batch_add_words", _write)
        return raw if isinstance(raw, dict) else {}

    def reorder_words(self, book_id: int, topic_ids: list) -> None:
        """重新排列词书中的单词顺序 / Reorder words in a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_list_i32(w, 2, topic_ids)

        self._call("reorder_words", _write)

    def get_word_count(self, book_id: int) -> int:
        """获取词书中的单词数量 / Get word count in a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_word_count", _write)
        return int(result) if result is not None else 0

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

        result = self._call("ocr_match_words", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Smart device
    # ------------------------------------------------------------------

    def bind_smart_device(self, device_sn: str, device_type: int) -> None:
        """绑定智能设备 / Bind a smart device."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, device_sn)
            self._write_i32(w, 2, device_type)

        self._call("bind_smart_device", _write)

    def unbind_smart_device(self, device_sn: str) -> None:
        """解绑智能设备 / Unbind a smart device."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, device_sn)

        self._call("unbind_smart_device", _write)

    def get_smart_device_list(self) -> list:
        """获取已绑定智能设备列表 / Get list of bound smart devices."""
        self._session.require_auth()
        result = self._call("get_smart_device_list", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Sharing
    # ------------------------------------------------------------------

    def share_book(self, book_id: int) -> str:
        """分享词书，返回分享 URL / Share a book and return the share URL."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("share_book", _write)
        return result if isinstance(result, str) else ""

    def import_shared_book(self, share_code: str) -> dict:
        """导入分享的词书 / Import a shared book by share code."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, share_code)

        raw = self._call("import_shared_book", _write)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Public book browsing
    # ------------------------------------------------------------------

    def get_public_book_list(self, category: int = 0, page: int = 1) -> list:
        """获取公开词书列表 / Get public word books."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, category)
            self._write_i32(w, 2, page)

        result = self._call("get_public_book_list", _write)
        return result if isinstance(result, list) else []

    def get_book_detail(self, book_id: int) -> dict:
        """获取词书详情 / Get book detail."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        raw = self._call("get_book_detail", _write)
        return raw if isinstance(raw, dict) else {}

    def search_books(self, keyword: str) -> list:
        """搜索词书 / Search public books."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, keyword)

        result = self._call("search_books", _write)
        return result if isinstance(result, list) else []

    def get_book_categories(self) -> list:
        """获取词书分类列表 / Get book category list."""
        result = self._call("get_book_categories", lambda w: None)
        return result if isinstance(result, list) else []

    def get_recommended_books(self, book_type: int = 0) -> list:
        """获取推荐词书 / Get recommended books."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_type)

        result = self._call("get_recommended_books", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Star / unstar
    # ------------------------------------------------------------------

    def star_book(self, book_id: int) -> None:
        """收藏词书 / Star a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("star_book", _write)

    def unstar_book(self, book_id: int) -> None:
        """取消收藏词书 / Unstar a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("unstar_book", _write)

    def get_starred_books(self) -> list:
        """获取已收藏词书列表 / Get starred books."""
        self._session.require_auth()
        result = self._call("get_starred_books", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Import / export
    # ------------------------------------------------------------------

    def export_book_words(self, book_id: int) -> list:
        """导出词书单词 / Export words from a book."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("export_book_words", _write)
        return result if isinstance(result, list) else []

    def import_words_from_csv(self, book_id: int, csv_data: str) -> dict:
        """从 CSV 导入单词 / Import words from CSV data."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_string(w, 2, csv_data)

        raw = self._call("import_words_from_csv", _write)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Sync
    # ------------------------------------------------------------------

    def get_book_sync_info(self, book_id: int) -> dict:
        """获取词书同步信息 / Get book sync metadata."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        raw = self._call("get_book_sync_info", _write)
        return raw if isinstance(raw, dict) else {}

    def sync_book_progress(self, book_id: int, progress: dict) -> None:
        """同步词书学习进度 / Sync book learning progress."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            w.write_field_begin(TYPE_STRUCT, 2)
            w.write_struct_begin()
            for fid, key in [(1, "current_index"), (2, "total"), (3, "learned")]:
                val = progress.get(key)
                if val is not None:
                    self._write_i32(w, fid, int(val))
            w.write_field_stop()
            w.write_struct_end()

        self._call("sync_book_progress", _write)
