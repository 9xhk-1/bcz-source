"""
GameApiService — 游戏模式接口 / Game mode API.

Host: https://game.baicizhan.com
Service: game
"""

from __future__ import annotations

from .._protocol import TYPE_I32, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_deep
from ._field_maps import (
    BUILDING_MAP,
    COMBO_INFO,
    COST_COMPASS_RSP,
    ENERGY_INFO,
    FINISH_ROUND_RSP,
    GAME_HOME_INFO,
    ISLAND_INFO,
    PURCHASE_RSP,
    ROADMAP_INFO,
    ROUND_RSP,
    SENTENCE_BUILDING_PROGRESS,
    SENTENCE_BUILDING_STATUS,
    SENTENCE_CURRENT_INFO,
    SENTENCE_GAME_HOME,
    SENTENCE_SKU_INFO,
    STUDY_HOME_INFO,
    STUDY_RECORD_RSP,
    SYNC_INFO,
    USER_WORTH,
)

_HOST = "https://game.baicizhan.com"
_SVC = "game"


class GameApiService(_BaseService):
    """百词斩游戏服务 / BCZ Game Service.

    Covers the PK / battle game mode: home, roadmap, rounds,
    equipment, currency, and sentence-building features.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Home / config
    # ------------------------------------------------------------------

    def home(self) -> dict:
        """获取游戏首页 / Get game home page data. Returns StudyHomeInfo."""
        self._session.require_auth()
        raw = self._call("home", lambda w: None)
        return _map_deep(raw, STUDY_HOME_INFO)

    def game_home(self) -> dict:
        """获取游戏主界面数据 / Get game main view data. Returns GameHomeInfo."""
        self._session.require_auth()
        raw = self._call("game_home", lambda w: None)
        return _map_deep(raw, GAME_HOME_INFO)

    def get_game_config(self) -> dict:
        """获取游戏配置 / Get game configuration. Returns Map<String, String>."""
        self._session.require_auth()
        raw = self._call("get_game_config", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_worth(self) -> dict:
        """获取游戏价值/货币信息 / Get player worth and currency. Returns UserWorth."""
        self._session.require_auth()
        raw = self._call("get_worth", lambda w: None)
        return _map_deep(raw, USER_WORTH)

    def get_equipments(self) -> list:
        """获取装备列表 / Get equipment list."""
        self._session.require_auth()
        result = self._call("get_equipments", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Book / mode selection
    # ------------------------------------------------------------------

    def select_game_book(self, book_id: int) -> None:
        """选择游戏词书 / Select book for game mode."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("select_game_book", _write)

    def switch_game_mode(self, mode: int) -> None:
        """切换游戏模式 / Switch game mode."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, mode)

        self._call("switch_game_mode", _write)

    # ------------------------------------------------------------------
    # Roadmap
    # ------------------------------------------------------------------

    def get_roadmap(self) -> dict:
        """获取游戏关卡地图 / Get game roadmap. Returns RoadmapInfo."""
        self._session.require_auth()
        raw = self._call("get_roadmap", lambda w: None)
        return _map_deep(raw, ROADMAP_INFO)

    def get_island_roadmap(self) -> dict:
        """获取岛屿关卡地图 / Get island roadmap. Returns IslandInfo."""
        self._session.require_auth()
        raw = self._call("get_island_roadmap", lambda w: None)
        return _map_deep(raw, ISLAND_INFO)

    def sync_info(self) -> dict:
        """同步游戏信息 / Sync game information. Returns SyncInfo."""
        self._session.require_auth()
        raw = self._call("sync_info", lambda w: None)
        return _map_deep(raw, SYNC_INFO)

    # ------------------------------------------------------------------
    # Rounds
    # ------------------------------------------------------------------

    def start_round(self, book_id: int, chapter: int) -> dict:
        """开始一局游戏 / Start a game round. Returns RoundRsp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, chapter)

        raw = self._call("start_round", _write)
        return _map_deep(raw, ROUND_RSP)

    def finish_round(
        self,
        round_id: str,
        score: int,
        correct_count: int,
        total_count: int,
    ) -> dict:
        """完成一局游戏 / Finish a game round. Returns FinishRoundRsp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)
            self._write_i32(w, 2, score)
            self._write_i32(w, 3, correct_count)
            self._write_i32(w, 4, total_count)

        raw = self._call("finish_round", _write)
        return _map_deep(raw, FINISH_ROUND_RSP)

    def discard_round(self, round_id: str) -> None:
        """放弃一局游戏 / Discard / abandon a game round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)

        self._call("discard_round", _write)

    def sync_combo(self, round_id: str, combo: int) -> None:
        """同步连击数 / Sync combo count during a round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)
            self._write_i32(w, 2, combo)

        self._call("sync_combo", _write)

    # ------------------------------------------------------------------
    # In-game purchases
    # ------------------------------------------------------------------

    def buy_life(self, count: int = 1) -> dict:
        """购买生命值 / Buy extra lives."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, count)

        raw = self._call("buy_life", _write)
        return raw if isinstance(raw, dict) else {}

    def cost_compass(self, count: int = 1) -> dict:
        """消耗指南针 / Spend compass items. Returns CostCompassRsp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, count)

        raw = self._call("cost_compass", _write)
        return _map_deep(raw, COST_COMPASS_RSP)

    def purchase(self, item_id: str) -> dict:
        """购买游戏道具 / Purchase an in-game item. Returns PurchaseRsp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, item_id)

        raw = self._call("purchase", _write)
        return _map_deep(raw, PURCHASE_RSP)

    # ------------------------------------------------------------------
    # Study / ability records
    # ------------------------------------------------------------------

    def submit_study_record(self, study_data: dict) -> None:
        """提交游戏学习记录 / Submit study record from game session."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            for fid, key in [(1, "book_id"), (2, "chapter"), (3, "score")]:
                val = study_data.get(key)
                if val is not None:
                    self._write_i32(w, fid, int(val))
            w.write_field_stop()
            w.write_struct_end()

        self._call("submit_study_record", _write)

    def submit_ability_record(self, ability_data: dict) -> None:
        """提交能力值记录 / Submit ability record."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            for fid, key in [(1, "ability_type"), (2, "value"), (3, "delta")]:
                val = ability_data.get(key)
                if val is not None:
                    self._write_i32(w, fid, int(val))
            w.write_field_stop()
            w.write_struct_end()

        self._call("submit_ability_record", _write)

    def get_study_record(self) -> dict:
        """获取游戏学习记录 / Get game study record. Returns StudyRecrodRsp."""
        self._session.require_auth()
        raw = self._call("get_study_record", lambda w: None)
        return _map_deep(raw, STUDY_RECORD_RSP)

    # ------------------------------------------------------------------
    # Building map
    # ------------------------------------------------------------------

    def get_building_map(self) -> dict:
        """获取建筑地图 / Get building map data. Returns BuildingMap."""
        self._session.require_auth()
        raw = self._call("get_building_map", lambda w: None)
        return _map_deep(raw, BUILDING_MAP)

    # ------------------------------------------------------------------
    # Sentence game
    # ------------------------------------------------------------------

    def sentence_home(self) -> dict:
        """获取句子游戏首页 / Get sentence game home. Returns SentenceGameHome."""
        self._session.require_auth()
        raw = self._call("sentence_home", lambda w: None)
        return _map_deep(raw, SENTENCE_GAME_HOME)

    def sentence_sku_info(self) -> dict:
        """获取句子游戏 SKU 信息 / Get sentence game SKU info. Returns SentenceSkuInfo."""
        self._session.require_auth()
        raw = self._call("sentence_sku_info", lambda w: None)
        return _map_deep(raw, SENTENCE_SKU_INFO)

    def sentence_current_info(self) -> dict:
        """获取当前句子游戏信息 / Get current sentence game info. Returns SentenceCurrentInfo."""
        self._session.require_auth()
        raw = self._call("sentence_current_info", lambda w: None)
        return _map_deep(raw, SENTENCE_CURRENT_INFO)

    def sentence_start(self) -> dict:
        """开始句子游戏 / Start a sentence game session. Returns EnergyInfo."""
        self._session.require_auth()
        raw = self._call("sentence_start", lambda w: None)
        return _map_deep(raw, ENERGY_INFO)

    def select_sentence_sku(self, sku_id: str) -> None:
        """选择句子游戏 SKU / Select sentence game SKU."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, sku_id)

        self._call("select_sentence_sku", _write)

    def upgrade_sentence_building(self) -> dict:
        """升级句子建筑（v1）/ Upgrade sentence building (v1). Returns SentenceBuildingProgress."""
        self._session.require_auth()
        raw = self._call("upgrade_sentence_building", lambda w: None)
        return _map_deep(raw, SENTENCE_BUILDING_PROGRESS)

    def upgrade_sentence_building_v2(self) -> dict:
        """升级句子建筑（v2）/ Upgrade sentence building (v2). Returns SentenceBuildingStatus."""
        self._session.require_auth()
        raw = self._call("upgrade_sentence_building_v2", lambda w: None)
        return _map_deep(raw, SENTENCE_BUILDING_STATUS)

    def get_combo_info(self) -> dict:
        """获取连击信息 / Get combo info. Returns ComboInfo."""
        self._session.require_auth()
        raw = self._call("get_combo_info", lambda w: None)
        return _map_deep(raw, COMBO_INFO)
