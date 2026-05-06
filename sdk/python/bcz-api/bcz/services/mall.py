"""
Mall, Avatar, and PK services — 商城/头像/PK 接口

Includes:
  MallProxyService  — learn.baicizhan.com   / mall_proxy
  AvatarApiService  — ip-avatar.baicizhan.com / avatar
  PkApiService      — pk.baicizhan.com       / pk
"""

from __future__ import annotations

from .._protocol import TYPE_STRUCT, CompactWriter
from .._session import BczSession
from ._base import _BaseService, _map_fields


# ---------------------------------------------------------------------------
# Result field maps  (verified against mall_proxy/avatar/pk Java sources)
# ---------------------------------------------------------------------------

# mall_proxy.UserAddress
_USER_ADDRESS_FIELDS = {
    1: "id", 2: "name", 3: "mobile", 4: "province",
    5: "city", 6: "district", 7: "detail", 8: "status",
}

# mall_proxy.AddressMatchResp
_ADDRESS_MATCH_RESP_FIELDS = {
    1: "province", 2: "city", 3: "district", 4: "street",
}

# avatar_api.AvatarBasicInfo
_AVATAR_BASIC_INFO_FIELDS = {1: "ip_type", 2: "ip_cn", 3: "ip_en", 4: "ip_tag"}

# avatar_api.AvatarAppHomePageInfo
_AVATAR_APP_HOME_PAGE_INFO_FIELDS = {
    1: "cur_ip_info", 2: "ip_record_info", 3: "travel_is_max",
    4: "ip_has", 5: "unlock_skill_list", 6: "unlock_action_list",
    7: "cur_travel_area_info",
}

# avatar_api.TravelRewardInfo
_TRAVEL_REWARD_INFO_FIELDS = {1: "gift_list", 3: "credit", 4: "level_info"}

# pk_api.RankPkEntry
_RANK_PK_ENTRY_FIELDS = {1: "url", 2: "beginTime", 3: "endTime"}


# ---------------------------------------------------------------------------
# MallProxyService
# ---------------------------------------------------------------------------

class MallProxyService(_BaseService):
    """百词斩商城代理服务（地址管理）/ BCZ Mall Proxy Service (address management)."""

    _host = "https://learn.baicizhan.com"
    _service = "mall_proxy"

    # ------------------------------------------------------------------
    # Address management
    # ------------------------------------------------------------------

    def get_user_address(self, status: int = 0) -> list:
        """获取用户地址列表 / Get user address list."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, status)

        result = self._call("get_user_address", _write)
        return result if isinstance(result, list) else []

    def create_user_address(
        self,
        name: str,
        phone: str,
        province: str,
        city: str,
        district: str,
        address: str,
        is_default: bool = False,
    ) -> dict:
        """创建收货地址 / Create a shipping address."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, name)
            self._write_string(w, 2, phone)
            self._write_string(w, 3, province)
            self._write_string(w, 4, city)
            self._write_string(w, 5, district)
            self._write_string(w, 6, address)
            self._write_bool(w, 7, is_default)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("create_user_address", _write)
        return _map_fields(raw, _USER_ADDRESS_FIELDS)

    def update_user_address(
        self,
        address_id: int,
        name: str,
        phone: str,
        province: str,
        city: str,
        district: str,
        address: str,
        is_default: bool = False,
    ) -> dict:
        """更新收货地址 / Update a shipping address."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, address_id)
            w.write_field_begin(TYPE_STRUCT, 2)
            w.write_struct_begin()
            self._write_string(w, 1, name)
            self._write_string(w, 2, phone)
            self._write_string(w, 3, province)
            self._write_string(w, 4, city)
            self._write_string(w, 5, district)
            self._write_string(w, 6, address)
            self._write_bool(w, 7, is_default)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("update_user_address", _write)
        return _map_fields(raw, _USER_ADDRESS_FIELDS)

    def delete_user_address(self, address_id: int) -> None:
        """删除收货地址 / Delete a shipping address."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, address_id)

        self._call("delete_user_address", _write)

    def choice_address(self, address_id: int) -> None:
        """选择默认收货地址 / Choose default shipping address."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, address_id)

        self._call("choice_address", _write)

    def get_child_address(self, parent_id: int = 0) -> list:
        """获取子区域地址列表 / Get child address area list."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, parent_id)

        result = self._call("get_child_address", _write)
        return result if isinstance(result, list) else []

    def match_address(self, text: str) -> dict:
        """智能匹配地址 / Smart address matching from text."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, text)

        raw = self._call("match_address", _write)
        return _map_fields(raw, _ADDRESS_MATCH_RESP_FIELDS)


# ---------------------------------------------------------------------------
# AvatarApiService
# ---------------------------------------------------------------------------

class AvatarApiService(_BaseService):
    """百词斩 IP 头像服务 / BCZ IP Avatar Service."""

    _host = "https://ip-avatar.baicizhan.com"
    _service = "avatar"

    def get_ip(self) -> dict:
        """获取 IP 头像信息 / Get IP avatar info. Returns AvatarBasicInfo."""
        self._session.require_auth()
        raw = self._call("get_ip", lambda w: None)
        return _map_fields(raw, _AVATAR_BASIC_INFO_FIELDS)

    def get_app_home_page_info(self) -> dict:
        """获取首页 IP 信息 / Get home page IP info. Returns AvatarAppHomePageInfo."""
        self._session.require_auth()
        raw = self._call("get_app_home_page_info", lambda w: None)
        return _map_fields(raw, _AVATAR_APP_HOME_PAGE_INFO_FIELDS)

    def travel(self) -> dict:
        """IP 头像旅行功能 / IP avatar travel action. Returns AvatarAppHomePageInfo."""
        self._session.require_auth()
        raw = self._call("travel", lambda w: None)
        return _map_fields(raw, _AVATAR_APP_HOME_PAGE_INFO_FIELDS)

    def get_gift(self) -> dict:
        """领取 IP 礼物 / Receive IP gift. Returns TravelRewardInfo."""
        self._session.require_auth()
        raw = self._call("get_gift", lambda w: None)
        return _map_fields(raw, _TRAVEL_REWARD_INFO_FIELDS)


# ---------------------------------------------------------------------------
# PkApiService
# ---------------------------------------------------------------------------

class PkApiService(_BaseService):
    """百词斩 PK 服务（匹配对战）/ BCZ PK Service (multiplayer battle)."""

    _host = "https://pk.baicizhan.com"
    _service = "pk"

    def get_pk_address(self) -> str:
        """获取 PK 服务器地址 / Get PK server address."""
        self._session.require_auth()
        result = self._call("get_pk_address", lambda w: None)
        return result if isinstance(result, str) else ""

    def get_rank_pk_address(self) -> dict:
        """获取排名 PK 服务器地址 / Get ranked PK server address. Returns RankPkEntry."""
        self._session.require_auth()
        raw = self._call("get_rank_pk_address", lambda w: None)
        return _map_fields(raw, _RANK_PK_ENTRY_FIELDS)
