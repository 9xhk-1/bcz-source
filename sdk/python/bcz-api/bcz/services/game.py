"""
GameApiService — 游戏模式接口 / Game mode API.

Host: https://game.baicizhan.com
Service: game
"""

from __future__ import annotations

from .._protocol import TYPE_I32, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_fields

_HOST = "https://game.baicizhan.com"
_SVC = "game"

# ---------------------------------------------------------------------------
# Result field maps  (verified against game_api Java source)
# ---------------------------------------------------------------------------

# game_api.StudyHomeInfo
_STUDY_HOME_INFO_FIELDS = {1: "book", 2: "learn_info", 3: "mascot"}

# game_api.GameHomeInfo
_GAME_HOME_INFO_FIELDS = {1: "user_data_info", 2: "plan_info", 3: "basic_info"}

# game_api.UserWorth
_USER_WORTH_FIELDS = {
    1: "win_streak_days", 2: "total_daka_days", 3: "word_done_count",
    4: "listen_count", 5: "reading_count",
}

# game_api.RoadmapInfo
_ROADMAP_INFO_FIELDS = {1: "topic_ids", 2: "version", 3: "cake_modules"}

# game_api.IslandInfo
_ISLAND_INFO_FIELDS = {1: "islands", 2: "version"}

# game_api.SyncInfo
_SYNC_INFO_FIELDS = {
    1: "island_version", 2: "roadmap_version", 3: "study_record_version",
    4: "plan_version", 5: "server_time", 6: "current_book_id",
    7: "user_data_info", 8: "sentenceSkuId", 9: "resource_version",
}

# game_api.RoundRsp
_ROUND_RSP_FIELDS = {
    1: "round_info", 2: "plan_version", 3: "round_contiue", 4: "energy_info",
}

# game_api.FinishRoundRsp
_FINISH_ROUND_RSP_FIELDS = {
    2: "award_box", 3: "study_record_versin", 4: "plan_version",
    5: "user_data_info", 6: "plan_info", 7: "lava_quest",
}

# game_api.CostCompassRsp
_COST_COMPASS_RSP_FIELDS = {1: "plan_version", 2: "compass_info"}

# game_api.PurchaseRsp
_PURCHASE_RSP_FIELDS = {1: "copper_before", 2: "copper_after"}

# game_api.StudyRecrodRsp  (note: typo is in the original IDL)
_STUDY_RECORD_RSP_FIELDS = {1: "study_records", 2: "ability", 4: "version"}

# game_api.BuildingMap
_BUILDING_MAP_FIELDS = {1: "skuId", 2: "buildings"}

# game_api.SentenceGameHome
_SENTENCE_GAME_HOME_FIELDS = {1: "energy_info", 2: "building_progress", 3: "lesson_info"}

# game_api.SentenceSkuInfo
_SENTENCE_SKU_INFO_FIELDS = {
    1: "skuId", 2: "chapters", 3: "lessons", 4: "version", 5: "languageType",
}

# game_api.SentenceCurrentInfo
_SENTENCE_CURRENT_INFO_FIELDS = {
    1: "skuId", 2: "buildingStatus", 3: "latestContentVersion",
    4: "energy_info", 5: "finishedLessonIds", 6: "hideLessonIds",
}

# game_api.EnergyInfo
_ENERGY_INFO_FIELDS = {1: "energy_cost", 2: "energy_count"}

# game_api.SentenceBuildingProgress
_SENTENCE_BUILDING_PROGRESS_FIELDS = {
    1: "building_id", 2: "building_level_id", 3: "hammer_remain", 4: "hammer_used",
}

# game_api.SentenceBuildingStatus
_SENTENCE_BUILDING_STATUS_FIELDS = {
    1: "totalCoin", 2: "spentCoin", 3: "userBuildingLevels",
}

# game_api.ComboInfo
_COMBO_INFO_FIELDS = {
    1: "current_combo", 2: "updateAt", 3: "props", 4: "max_combo",
}


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
        return _map_fields(raw, _STUDY_HOME_INFO_FIELDS)

    def game_home(self) -> dict:
        """获取游戏主界面数据 / Get game main view data. Returns GameHomeInfo."""
        self._session.require_auth()
        raw = self._call("game_home", lambda w: None)
        return _map_fields(raw, _GAME_HOME_INFO_FIELDS)

    def get_game_config(self) -> dict:
        """获取游戏配置 / Get game configuration. Returns Map<String, String>."""
        self._session.require_auth()
        raw = self._call("get_game_config", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_worth(self) -> dict:
        """获取游戏价值/货币信息 / Get player worth and currency. Returns UserWorth."""
        self._session.require_auth()
        raw = self._call("get_worth", lambda w: None)
        return _map_fields(raw, _USER_WORTH_FIELDS)

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
        return _map_fields(raw, _ROADMAP_INFO_FIELDS)

    def get_island_roadmap(self) -> dict:
        """获取岛屿关卡地图 / Get island roadmap. Returns IslandInfo."""
        self._session.require_auth()
        raw = self._call("get_island_roadmap", lambda w: None)
        return _map_fields(raw, _ISLAND_INFO_FIELDS)

    def sync_info(self) -> dict:
        """同步游戏信息 / Sync game information. Returns SyncInfo."""
        self._session.require_auth()
        raw = self._call("sync_info", lambda w: None)
        return _map_fields(raw, _SYNC_INFO_FIELDS)

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
        return _map_fields(raw, _ROUND_RSP_FIELDS)

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
        return _map_fields(raw, _FINISH_ROUND_RSP_FIELDS)

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
        return _map_fields(raw, _COST_COMPASS_RSP_FIELDS)

    def purchase(self, item_id: str) -> dict:
        """购买游戏道具 / Purchase an in-game item. Returns PurchaseRsp."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, item_id)

        raw = self._call("purchase", _write)
        return _map_fields(raw, _PURCHASE_RSP_FIELDS)

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
        return _map_fields(raw, _STUDY_RECORD_RSP_FIELDS)

    # ------------------------------------------------------------------
    # Building map
    # ------------------------------------------------------------------

    def get_building_map(self) -> dict:
        """获取建筑地图 / Get building map data. Returns BuildingMap."""
        self._session.require_auth()
        raw = self._call("get_building_map", lambda w: None)
        return _map_fields(raw, _BUILDING_MAP_FIELDS)

    # ------------------------------------------------------------------
    # Sentence game
    # ------------------------------------------------------------------

    def sentence_home(self) -> dict:
        """获取句子游戏首页 / Get sentence game home. Returns SentenceGameHome."""
        self._session.require_auth()
        raw = self._call("sentence_home", lambda w: None)
        return _map_fields(raw, _SENTENCE_GAME_HOME_FIELDS)

    def sentence_sku_info(self) -> dict:
        """获取句子游戏 SKU 信息 / Get sentence game SKU info. Returns SentenceSkuInfo."""
        self._session.require_auth()
        raw = self._call("sentence_sku_info", lambda w: None)
        return _map_fields(raw, _SENTENCE_SKU_INFO_FIELDS)

    def sentence_current_info(self) -> dict:
        """获取当前句子游戏信息 / Get current sentence game info. Returns SentenceCurrentInfo."""
        self._session.require_auth()
        raw = self._call("sentence_current_info", lambda w: None)
        return _map_fields(raw, _SENTENCE_CURRENT_INFO_FIELDS)

    def sentence_start(self) -> dict:
        """开始句子游戏 / Start a sentence game session. Returns EnergyInfo."""
        self._session.require_auth()
        raw = self._call("sentence_start", lambda w: None)
        return _map_fields(raw, _ENERGY_INFO_FIELDS)

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
        return _map_fields(raw, _SENTENCE_BUILDING_PROGRESS_FIELDS)

    def upgrade_sentence_building_v2(self) -> dict:
        """升级句子建筑（v2）/ Upgrade sentence building (v2). Returns SentenceBuildingStatus."""
        self._session.require_auth()
        raw = self._call("upgrade_sentence_building_v2", lambda w: None)
        return _map_fields(raw, _SENTENCE_BUILDING_STATUS_FIELDS)
