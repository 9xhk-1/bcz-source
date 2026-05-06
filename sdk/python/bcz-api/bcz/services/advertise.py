"""
AdvertiseApiService — 广告接口 / Advertising API.

Host: https://advertise.baicizhan.com
Service: advertise
"""

from __future__ import annotations

from typing import List

from .._protocol import TYPE_I32, TYPE_LIST, TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_fields

_HOST = "https://advertise.baicizhan.com"
_SVC = "advertise"

# ---------------------------------------------------------------------------
# Result field maps  (verified against advertise_api Java source)
# ---------------------------------------------------------------------------

# advertise_api.BczLaunchAd
_BCZ_LAUNCH_AD_FIELDS = {1: "own_ad", 2: "third_ad"}

# advertise_api.BottomAdvInfos
_BOTTOM_ADV_INFOS_FIELDS = {
    1: "carousel_banner", 2: "horizontal_banner", 3: "grid_ad",
}

# advertise_api.MainViewGameTopAdv
_MAIN_VIEW_GAME_TOP_ADV_FIELDS = {1: "top_ad"}

# advertise_api.PracticeBannerAdv
_PRACTICE_BANNER_ADV_FIELDS = {1: "id"}

# advertise_api.PracticePopupAdv
_PRACTICE_POPUP_ADV_FIELDS = {1: "id"}

# advertise_api.ExplorePopupAdv
_EXPLORE_POPUP_ADV_FIELDS = {1: "id"}

# advertise_api.BookAdV2
_BOOK_AD_V2_FIELDS = {1: "homepage", 2: "wordlist"}

# advertise_api.MallTabInfo
_MALL_TAB_INFO_FIELDS = {1: "recommendType"}

# advertise_api.AdvertisePromotionInfo
_ADVERTISE_PROMOTION_INFO_FIELDS = {
    1: "start_time", 2: "end_time", 4: "redirect_info",
    5: "btn_x", 6: "btn_y", 7: "btn_w", 8: "btn_h",
}

# advertise_api.LiveStreamingInfo
_LIVE_STREAMING_INFO_FIELDS = {
    1: "current_timestamp", 2: "start_timestamp", 3: "end_timestamp",
}

# advertise_api.ThirdAd
_THIRD_AD_FIELDS = {1: "showTimes"}


class AdvertiseApiService(_BaseService):
    """百词斩广告服务 / BCZ Advertise Service.

    Retrieves ad creatives for launch screen, banners, popups, and
    handles impression/click reporting.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Launch / startup
    # ------------------------------------------------------------------

    def get_launch_ad(self) -> dict:
        """获取启动广告（v1）/ Get launch screen ad (v1). Returns BczLaunchAd."""
        raw = self._call("get_launch_ad", lambda w: None)
        return _map_fields(raw, _BCZ_LAUNCH_AD_FIELDS)

    def get_startup_ad_v2(
        self,
        source: int = 0,
        screen_width: int = 1080,
        screen_height: int = 2340,
        pixel_ratio: float = 2.75,
    ) -> list:
        """获取启动广告（v2）/ Get startup ad (v2)."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, source)
            self._write_i32(w, 2, screen_width)
            self._write_i32(w, 3, screen_height)
            self._write_double(w, 4, pixel_ratio)

        result = self._call("get_startup_ad_v2", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Reporting
    # ------------------------------------------------------------------

    def report_launch_ad(self, ad_id: str, action: int) -> None:
        """上报启动广告事件 / Report a launch ad event."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, ad_id)
            self._write_i32(w, 2, action)

        self._call("report_launch_ad", _write)

    def report_startup_ad_event(self, events: list) -> None:
        """批量上报启动广告事件 / Batch report startup ad events.

        :param events: list of ``{"ad_id": str, "event_type": int, "timestamp": int}``
        """
        def _write_event(w: CompactWriter, ev: dict) -> None:
            self._write_string(w, 1, str(ev.get("ad_id", "")))
            self._write_i32(w, 2, int(ev.get("event_type", 0)))
            self._write_i32(w, 3, int(ev.get("timestamp", 0)))

        def _write(w: CompactWriter) -> None:
            self._write_list_struct(w, 1, events, _write_event)

        self._call("report_startup_ad_event", _write)

    # ------------------------------------------------------------------
    # Banners / popups (no auth)
    # ------------------------------------------------------------------

    def get_main_view_top_banner_advs(self) -> list:
        """获取首页顶部横幅广告 / Get main view top banner ads."""
        result = self._call("get_main_view_top_banner_advs", lambda w: None)
        return result if isinstance(result, list) else []

    def get_main_view_bottom_advs_v3(
        self,
        screen_width: int = 1080,
        screen_height: int = 2340,
        pixel_ratio: float = 2.75,
    ) -> dict:
        """获取首页底部广告（v3）/ Get main view bottom ads (v3)."""
        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, screen_width)
            self._write_i32(w, 2, screen_height)
            self._write_double(w, 3, pixel_ratio)

        raw = self._call("get_main_view_bottom_advs_v3", _write)
        return _map_fields(raw, _BOTTOM_ADV_INFOS_FIELDS)

    def get_main_game_top_banner(self) -> dict:
        """获取游戏首页顶部横幅 / Get main game top banner. Returns MainViewGameTopAdv."""
        raw = self._call("get_main_game_top_banner", lambda w: None)
        return _map_fields(raw, _MAIN_VIEW_GAME_TOP_ADV_FIELDS)

    def get_practice_banner_adv(self) -> dict:
        """获取练习页横幅广告 / Get practice page banner ad. Returns PracticeBannerAdv."""
        raw = self._call("get_practice_banner_adv", lambda w: None)
        return _map_fields(raw, _PRACTICE_BANNER_ADV_FIELDS)

    def get_practice_popup_adv(self) -> dict:
        """获取练习页弹窗广告 / Get practice page popup ad. Returns PracticePopupAdv."""
        raw = self._call("get_practice_popup_adv", lambda w: None)
        return _map_fields(raw, _PRACTICE_POPUP_ADV_FIELDS)

    def get_explore_popup_adv(self) -> dict:
        """获取探索页弹窗广告 / Get explore page popup ad. Returns ExplorePopupAdv."""
        raw = self._call("get_explore_popup_adv", lambda w: None)
        return _map_fields(raw, _EXPLORE_POPUP_ADV_FIELDS)

    def get_books_ad_v2(self) -> dict:
        """获取词书页广告（v2）/ Get books page ad (v2). Returns BookAdV2."""
        raw = self._call("get_books_ad_v2", lambda w: None)
        return _map_fields(raw, _BOOK_AD_V2_FIELDS)

    def get_mall_tab_icon_info(self) -> dict:
        """获取商城图标信息 / Get mall tab icon info. Returns MallTabInfo."""
        raw = self._call("get_mall_tab_icon_info", lambda w: None)
        return _map_fields(raw, _MALL_TAB_INFO_FIELDS)

    def get_promotion_info(self) -> dict:
        """获取促销信息 / Get promotion info. Returns AdvertisePromotionInfo."""
        raw = self._call("get_promotion_info", lambda w: None)
        return _map_fields(raw, _ADVERTISE_PROMOTION_INFO_FIELDS)

    def get_loading_ad_items(self) -> list:
        """获取加载页广告列表 / Get loading screen ad items."""
        result = self._call("get_loading_ad_items", lambda w: None)
        return result if isinstance(result, list) else []

    def get_loading_imgs(self) -> list:
        """获取加载图片列表 / Get loading screen images."""
        result = self._call("get_loading_imgs", lambda w: None)
        return result if isinstance(result, list) else []

    def get_live_streaming_info(self) -> dict:
        """获取直播信息 / Get live streaming info. Returns LiveStreamingInfo."""
        raw = self._call("get_live_streaming_info", lambda w: None)
        return _map_fields(raw, _LIVE_STREAMING_INFO_FIELDS)

    def get_third_ad(self) -> dict:
        """获取第三方广告 / Get third-party ad. Returns ThirdAd."""
        raw = self._call("get_third_ad", lambda w: None)
        return _map_fields(raw, _THIRD_AD_FIELDS)

    # ------------------------------------------------------------------
    # Custom ads config (auth required)
    # ------------------------------------------------------------------

    def get_custom_ads_config(self) -> int:
        """获取自定义广告配置状态 / Get custom ads config state."""
        self._session.require_auth()
        result = self._call("get_custom_ads_config", lambda w: None)
        return int(result) if result is not None else 0

    def set_custom_ads_config(self, state: int) -> None:
        """设置自定义广告配置 / Set custom ads config state."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, state)

        self._call("set_custom_ads_config", _write)
