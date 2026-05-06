"""
GameApiService — 游戏模式接口 / Game mode API.

Host: https://game.baicizhan.com
Service: game
"""

from __future__ import annotations

from .._protocol import TYPE_I32, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService

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
        """获取游戏首页 / Get game home page data."""
        self._session.require_auth()
        raw = self._call("home", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def game_home(self) -> dict:
        """获取游戏主界面数据 / Get game main view data."""
        self._session.require_auth()
        raw = self._call("gameHome", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_game_config(self) -> dict:
        """获取游戏配置 / Get game configuration."""
        self._session.require_auth()
        raw = self._call("getGameConfig", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_worth(self) -> dict:
        """获取游戏价值/货币信息 / Get player worth and currency."""
        self._session.require_auth()
        raw = self._call("getWorth", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_equipments(self) -> list:
        """获取装备列表 / Get equipment list."""
        self._session.require_auth()
        result = self._call("getEquipments", lambda w: None)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Book / mode selection
    # ------------------------------------------------------------------

    def select_game_book(self, book_id: int) -> None:
        """选择游戏词书 / Select book for game mode."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)

        self._call("selectGameBook", _write)

    def switch_game_mode(self, mode: int) -> None:
        """切换游戏模式 / Switch game mode."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, mode)

        self._call("switchGameMode", _write)

    # ------------------------------------------------------------------
    # Roadmap
    # ------------------------------------------------------------------

    def get_roadmap(self) -> dict:
        """获取游戏关卡地图 / Get game roadmap."""
        self._session.require_auth()
        raw = self._call("getRoadmap", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_island_roadmap(self) -> dict:
        """获取岛屿关卡地图 / Get island roadmap."""
        self._session.require_auth()
        raw = self._call("getIslandRoadmap", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def sync_info(self) -> dict:
        """同步游戏信息 / Sync game information."""
        self._session.require_auth()
        raw = self._call("syncInfo", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Rounds
    # ------------------------------------------------------------------

    def start_round(self, book_id: int, chapter: int) -> dict:
        """开始一局游戏 / Start a game round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, book_id)
            self._write_i32(w, 2, chapter)

        raw = self._call("startRound", _write)
        return raw if isinstance(raw, dict) else {}

    def finish_round(
        self,
        round_id: str,
        score: int,
        correct_count: int,
        total_count: int,
    ) -> dict:
        """完成一局游戏 / Finish a game round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)
            self._write_i32(w, 2, score)
            self._write_i32(w, 3, correct_count)
            self._write_i32(w, 4, total_count)

        raw = self._call("finishRound", _write)
        return raw if isinstance(raw, dict) else {}

    def discard_round(self, round_id: str) -> None:
        """放弃一局游戏 / Discard / abandon a game round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)

        self._call("discardRound", _write)

    def sync_combo(self, round_id: str, combo: int) -> None:
        """同步连击数 / Sync combo count during a round."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, round_id)
            self._write_i32(w, 2, combo)

        self._call("syncCombo", _write)

    # ------------------------------------------------------------------
    # In-game purchases
    # ------------------------------------------------------------------

    def buy_life(self, count: int = 1) -> dict:
        """购买生命值 / Buy extra lives."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, count)

        raw = self._call("buyLife", _write)
        return raw if isinstance(raw, dict) else {}

    def cost_compass(self, count: int = 1) -> dict:
        """消耗指南针 / Spend compass items."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, count)

        raw = self._call("costCompass", _write)
        return raw if isinstance(raw, dict) else {}

    def purchase(self, item_id: str) -> dict:
        """购买游戏道具 / Purchase an in-game item."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, item_id)

        raw = self._call("purchase", _write)
        return raw if isinstance(raw, dict) else {}

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

        self._call("submitStudyRecord", _write)

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

        self._call("submitAbilityRecord", _write)

    def get_study_record(self) -> dict:
        """获取游戏学习记录 / Get game study record."""
        self._session.require_auth()
        raw = self._call("getStudyRecord", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Building map
    # ------------------------------------------------------------------

    def get_building_map(self) -> dict:
        """获取建筑地图 / Get building map data."""
        self._session.require_auth()
        raw = self._call("getBuildingMap", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Sentence game
    # ------------------------------------------------------------------

    def sentence_home(self) -> dict:
        """获取句子游戏首页 / Get sentence game home."""
        self._session.require_auth()
        raw = self._call("sentenceHome", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def sentence_sku_info(self) -> dict:
        """获取句子游戏 SKU 信息 / Get sentence game SKU info."""
        self._session.require_auth()
        raw = self._call("sentenceSkuInfo", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def sentence_current_info(self) -> dict:
        """获取当前句子游戏信息 / Get current sentence game info."""
        self._session.require_auth()
        raw = self._call("sentenceCurrentInfo", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def sentence_start(self) -> dict:
        """开始句子游戏 / Start a sentence game session."""
        self._session.require_auth()
        raw = self._call("sentenceStart", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def select_sentence_sku(self, sku_id: str) -> None:
        """选择句子游戏 SKU / Select sentence game SKU."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, sku_id)

        self._call("selectSentenceSku", _write)

    def upgrade_sentence_building(self) -> dict:
        """升级句子建筑（v1）/ Upgrade sentence building (v1)."""
        self._session.require_auth()
        raw = self._call("upgradeSentenceBuilding", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def upgrade_sentence_building_v2(self) -> dict:
        """升级句子建筑（v2）/ Upgrade sentence building (v2)."""
        self._session.require_auth()
        raw = self._call("upgradeSentenceBuildingV2", lambda w: None)
        return raw if isinstance(raw, dict) else {}
