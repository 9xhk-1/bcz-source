"""
ResourceService — 词典与媒体资源接口 / Dictionary and media resource API.

Host: https://resource.baicizhan.com
Service: resource_api
"""

from __future__ import annotations

from typing import List

from .._protocol import (
    TYPE_BOOL_T,
    TYPE_BOOL_F,
    TYPE_I32,
    TYPE_LIST,
    TYPE_STRUCT,
    CompactWriter,
)
from .._session import BczSession
from ._base import _BaseService, _map_deep
from ._field_maps import (
    BOOK_RESOURCE_UPDATE_INFO,
    DICT_WIKI,
    TOPIC_RESOURCE_V2,
    TRANS_RESULT_V2,
    WORD_DICT_V2,
    WORD_ROOT_RES,
)

_HOST = "https://resource.baicizhan.com"
_SVC = "resource_api"


class ResourceService(_BaseService):
    """百词斩资源服务 / BCZ Resource Service.

    Provides dictionary lookup, audio/image media, word search,
    translation, and book resource metadata.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Single-word resource
    # ------------------------------------------------------------------

    def get_topic_resource_v2(
        self,
        topic_id: int,
        word_level_id: int,
        channel: str = "",
        need_example: bool = True,
        need_audio: bool = True,
        need_image: bool = True,
        need_root: bool = False,
        need_synonym: bool = False,
    ) -> dict:
        """获取单词资源（v2）/ Get word resource (v2)."""
        def _write(w: CompactWriter) -> None:
            # field 1 = TopicKey struct
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_i32(w, 1, topic_id)
            self._write_i32(w, 2, word_level_id)
            w.write_field_stop()
            w.write_struct_end()
            if channel:
                self._write_string(w, 2, channel)
            self._write_bool(w, 3, need_example)
            self._write_bool(w, 4, need_audio)
            self._write_bool(w, 5, need_image)
            self._write_bool(w, 6, need_root)
            self._write_bool(w, 7, need_synonym)

        raw = self._call("get_topic_resource_v2", _write)
        return _map_deep(raw, TOPIC_RESOURCE_V2)

    def get_topic_resource_v3(self, topic_id: int) -> str:
        """获取单词资源（v3，返回 JSON 字符串）/ Get word resource v3 (JSON)."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)

        result = self._call("get_topic_resource_v3", _write)
        return result if isinstance(result, str) else ""

    # ------------------------------------------------------------------
    # Batch word list metadata
    # ------------------------------------------------------------------

    def get_word_list_word_meta_v2(self, topic_keys: list) -> list:
        """批量获取单词元数据（v2）/ Get word metadata for a list of topic keys (v2).

        :param topic_keys: list of ``{"topic_id": int, "word_level_id": int}``
        """
        def _write_key(w: CompactWriter, key: dict) -> None:
            self._write_i32(w, 1, int(key.get("topic_id", 0)))
            self._write_i32(w, 2, int(key.get("word_level_id", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, topic_keys, _write_key)

        result = self._call("get_word_list_word_meta_v2", _write)
        return result if isinstance(result, list) else []

    def get_word_list_word_meta_v3(self, book_id: int) -> list:
        """批量获取单词元数据（v3，按词书 ID）/ Get word metadata by book ID (v3)."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_word_list_word_meta_v3", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Dictionary
    # ------------------------------------------------------------------

    def get_dict_by_word_v2(self, word: str) -> dict:
        """查词典（v2）/ Dictionary lookup (v2). Returns WordDictV2."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, word)

        raw = self._call("get_dict_by_word_v2", _write)
        return _map_deep(raw, WORD_DICT_V2)

    def get_dict_wiki_by_word(self, word: str) -> dict:
        """获取单词 Wiki 信息 / Get word Wiki information. Returns DictWiki."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, word)

        raw = self._call("get_dict_wiki_by_word", _write)
        return _map_deep(raw, DICT_WIKI)

    # ------------------------------------------------------------------
    # Search / translate
    # ------------------------------------------------------------------

    def search_word_v2(self, query_str: str) -> list:
        """搜索单词（v2）/ Search words (v2)."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, query_str)

        result = self._call("search_word_v2", _write)
        return result if isinstance(result, list) else []

    def translate_v2(self, source: str) -> dict:
        """翻译文本（v2）/ Translate text (v2). Returns TransResultV2."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, source)

        raw = self._call("translate_v2", _write)
        return _map_deep(raw, TRANS_RESULT_V2)

    # ------------------------------------------------------------------
    # Bug reports
    # ------------------------------------------------------------------

    def submit_translate_bug(self, source: str, trans: str, provider: str) -> None:
        """提交翻译错误反馈 / Submit a translation bug report."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, source)
            self._write_string(w, 2, trans)
            self._write_string(w, 3, provider)

        self._call("submit_translate_bug", _write)

    def word_bug_report(
        self, topic_id: int, word_level_id: int, bug_types: list
    ) -> None:
        """提交单词错误反馈 / Submit a word bug report."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)
            self._write_i32(w, 2, word_level_id)
            self._write_list_i32(w, 3, bug_types)

        self._call("word_bug_report", _write)

    # ------------------------------------------------------------------
    # Media
    # ------------------------------------------------------------------

    def get_media_by_topic_ids(self, topic_ids: list) -> list:
        """批量获取单词媒体资源 / Get media assets for multiple topic IDs."""
        def _write(w: CompactWriter) -> None:
            self._write_list_i32(w, 1, topic_ids)

        result = self._call("get_media_by_topic_ids", _write)
        return result if isinstance(result, list) else []

    def get_zpk_infos(self, topic_keys: list) -> list:
        """获取 ZPK 信息 / Get ZPK info for topic keys."""
        def _write_key(w: CompactWriter, key: dict) -> None:
            self._write_i32(w, 1, int(key.get("topic_id", 0)))
            self._write_i32(w, 2, int(key.get("word_level_id", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, topic_keys, _write_key)

        result = self._call("get_zpk_infos", _write)
        return result if isinstance(result, list) else []

    def get_zpk_md5s(self, topic_keys: list) -> list:
        """获取 ZPK MD5 校验值 / Get ZPK MD5 checksums."""
        def _write_key(w: CompactWriter, key: dict) -> None:
            self._write_i32(w, 1, int(key.get("topic_id", 0)))
            self._write_i32(w, 2, int(key.get("word_level_id", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, topic_keys, _write_key)

        result = self._call("get_zpk_md5s", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Word root
    # ------------------------------------------------------------------

    def get_word_root(self, topic_id: int) -> dict:
        """获取词根信息 / Get word root information. Returns WordRootRes."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, topic_id)

        raw = self._call("get_word_root", _write)
        return _map_deep(raw, WORD_ROOT_RES)

    # ------------------------------------------------------------------
    # Update info
    # ------------------------------------------------------------------

    def get_book_resource_update_info(self, word_level_id: int) -> dict:
        """获取词书资源更新信息 / Get book resource update info. Returns BookResourceUpdateInfo."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, word_level_id)

        raw = self._call("get_book_resource_update_info", _write)
        return _map_deep(raw, BOOK_RESOURCE_UPDATE_INFO)

    def get_word_media_update_info(self, book_id: int) -> list:
        """获取单词媒体更新信息 / Get word media update info."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_word_media_update_info", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Game word lists
    # ------------------------------------------------------------------

    def get_game_word_list(self, book_id: int, chapter: int = 0) -> list:
        """获取游戏单词列表 / Get word list for the game mode."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, chapter)

        result = self._call("get_game_word_list", _write)
        return result if isinstance(result, list) else []

    def get_game_word_update_info(self, book_id: int) -> list:
        """获取游戏单词更新信息 / Get game word update info."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        result = self._call("get_game_word_update_info", _write)
        return result if isinstance(result, list) else []
