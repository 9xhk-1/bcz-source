"""
UnifiedUserService — 用户认证与个人资料接口 / User authentication & profile API.

Host: https://passport.baicizhan.com
Service: unified_user_service
"""

from __future__ import annotations

from typing import List, Optional

from .._protocol import (
    TYPE_BINARY,
    TYPE_I32,
    TYPE_I64,
    TYPE_LIST,
    TYPE_STRUCT,
    CompactWriter,
)
from .._session import BczSession
from ._base import _BaseService

_HOST = "https://passport.baicizhan.com"
_SVC = "unified_user_service"

# ---------------------------------------------------------------------------
# Result field maps
# ---------------------------------------------------------------------------

_LOGIN_RESULT_FIELDS = {
    1: "access_token",
    2: "is_new_user",
    3: "email",
    4: "public_key",
    5: "last_device",
    6: "unique_id",
    7: "phone",
    8: "force_bind_phone",
    9: "role_new",
    11: "game_mode",
}


def _map_login_result(raw: Optional[dict]) -> dict:
    if not isinstance(raw, dict):
        return {}
    return {name: raw[fid] for fid, name in _LOGIN_RESULT_FIELDS.items() if fid in raw}


class UnifiedUserService(_BaseService):
    """百词斩统一用户服务 / BCZ Unified User Service.

    Covers registration, login (phone / password / third-party / guest),
    profile management, social graph, and SMS verification.
    """

    _host = _HOST
    _service = _SVC

    # ------------------------------------------------------------------
    # Guest / anonymous login
    # ------------------------------------------------------------------

    def have_a_try(self) -> dict:
        """以游客身份登录（v1）/ Guest login (v1)."""
        raw = self._call("have_a_try", lambda w: None)
        return _map_login_result(raw)

    def have_a_try_v2(self) -> dict:
        """以游客身份登录（v2）/ Guest login (v2)."""
        raw = self._call("have_a_try_v2", lambda w: None)
        return _map_login_result(raw)

    def have_a_try_v3(self) -> dict:
        """以游客身份登录（v3）/ Guest login (v3)."""
        raw = self._call("have_a_try_v3", lambda w: None)
        return _map_login_result(raw)

    # ------------------------------------------------------------------
    # SMS / captcha
    # ------------------------------------------------------------------

    def send_sms_verify_code(self, phone: str, verify_type: int = 5) -> None:
        """发送短信验证码 / Send SMS verification code.

        :param phone: Mobile phone number / 手机号
        :param verify_type: Verification type (default 5) / 验证类型
        """
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_i32(w, 2, verify_type)

        self._call("send_sms_verify_code", _write)

    def send_captcha(self, phone: str, action: int = 0) -> None:
        """发送图形验证码 / Send captcha.

        action: 0=LOGIN, 1=REGISTER, 2=RESET_PASSWORD, 3=BIND_PHONE
        """
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_i32(w, 2, action)

        self._call("send_captcha", _write)

    # ------------------------------------------------------------------
    # Phone login
    # ------------------------------------------------------------------

    def login_with_phone(self, phone: str, verify_code: str) -> dict:
        """使用手机号+验证码登录 / Login with phone number and SMS code.

        :param phone: Mobile phone number / 手机号
        :param verify_code: SMS verification code / 短信验证码
        :returns: UserLoginResult dict
        """
        device_id = self._session.device_id

        def _write(w: CompactWriter) -> None:
            # field 1 = PhoneLoginRequest
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            # field 1 = PhoneVerifyCodeRequest
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, phone)
            self._write_string(w, 2, verify_code)
            w.write_field_stop()
            w.write_struct_end()
            # field 3 = device_id
            self._write_string(w, 3, device_id)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("login_with_phone", _write)
        return _map_login_result(raw)

    # ------------------------------------------------------------------
    # Password login / register
    # ------------------------------------------------------------------

    def bcz_login(self, account: str, password: str) -> dict:
        """使用账号密码登录 / Login with account and password."""
        device_id = self._session.device_id

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, account)
            self._write_string(w, 2, password)
            self._write_string(w, 3, device_id)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("bcz_login", _write)
        return _map_login_result(raw)

    def register_user(self, account: str, password: str) -> dict:
        """注册新用户 / Register a new user."""
        device_id = self._session.device_id

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, account)
            self._write_string(w, 2, password)
            self._write_string(w, 3, device_id)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("register_user", _write)
        return _map_login_result(raw)

    # ------------------------------------------------------------------
    # Third-party login
    # ------------------------------------------------------------------

    def third_party_login(
        self,
        provider: str,
        openid: str,
        access_token_3p: str,
        unionid: str = "",
        device: str = "",
    ) -> dict:
        """第三方平台登录 / Third-party OAuth login."""
        device = device or self._session.device_id

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, provider)
            self._write_string(w, 2, openid)
            self._write_string(w, 3, access_token_3p)
            self._write_string(w, 4, unionid)
            self._write_string(w, 5, device)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("third_party_login", _write)
        return _map_login_result(raw)

    def apple_login(self, identity_token: str, authorization_code: str) -> dict:
        """Apple ID 登录 / Apple ID login."""
        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, identity_token)
            self._write_string(w, 2, authorization_code)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("apple_login", _write)
        return _map_login_result(raw)

    def google_login(self, id_token: str) -> dict:
        """Google 账号登录 / Google account login."""
        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, id_token)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("google_login", _write)
        return _map_login_result(raw)

    # ------------------------------------------------------------------
    # Bind guest account to real credentials
    # ------------------------------------------------------------------

    def bcz_bind_try_user(self, account: str, password: str) -> dict:
        """将游客账号绑定到真实账号 / Bind guest account to real credentials."""
        self._session.require_auth()
        device_id = self._session.device_id

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, account)
            self._write_string(w, 2, password)
            self._write_string(w, 3, device_id)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("bcz_bind_try_user", _write)
        return _map_login_result(raw)

    def third_party_bind_try_user(
        self,
        provider: str,
        openid: str,
        access_token_3p: str,
        unionid: str = "",
        device: str = "",
    ) -> dict:
        """将游客账号绑定到第三方平台账号 / Bind guest to third-party account."""
        self._session.require_auth()
        device = device or self._session.device_id

        def _write(w: CompactWriter) -> None:
            w.write_field_begin(TYPE_STRUCT, 1)
            w.write_struct_begin()
            self._write_string(w, 1, provider)
            self._write_string(w, 2, openid)
            self._write_string(w, 3, access_token_3p)
            self._write_string(w, 4, unionid)
            self._write_string(w, 5, device)
            w.write_field_stop()
            w.write_struct_end()

        raw = self._call("third_party_bind_try_user", _write)
        return _map_login_result(raw)

    # ------------------------------------------------------------------
    # Watch (wearable) login
    # ------------------------------------------------------------------

    def watch_poll_login(self, watch_uuid: str) -> str:
        """轮询手表扫码登录结果 / Poll for watch QR-code login result."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, watch_uuid)

        result = self._call("watch_poll_login", _write)
        return result if isinstance(result, str) else ""

    def scan_for_watch_login(self, watch_uuid: str) -> None:
        """手机扫描手表二维码授权登录 / Confirm watch login via phone scan."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, watch_uuid)

        self._call("scan_for_watch_login", _write)

    # ------------------------------------------------------------------
    # Profile
    # ------------------------------------------------------------------

    def get_profile(self) -> dict:
        """获取当前用户的公开资料 / Get current user's public profile."""
        self._session.require_auth()
        raw = self._call("get_profile", lambda w: None)
        if not isinstance(raw, dict):
            return {}
        return {
            "nickname": raw.get(1, ""),
            "gender_id": raw.get(2, 0),
            "avatar": raw.get(3, ""),
            "unique_id": raw.get(4, 0),
        }

    def update_profile(
        self,
        nickname: Optional[str] = None,
        gender_id: Optional[int] = None,
        avatar: Optional[str] = None,
    ) -> None:
        """更新用户资料 / Update user profile fields."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            if nickname is not None:
                self._write_string(w, 1, nickname)
            if gender_id is not None:
                self._write_i32(w, 2, gender_id)
            if avatar is not None:
                self._write_string(w, 3, avatar)

        self._call("update_profile", _write)

    def get_user_info(self) -> dict:
        """获取用户详细信息（v1）/ Get detailed user info (v1)."""
        self._session.require_auth()
        raw = self._call("get_user_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_user_info_v2(self) -> dict:
        """获取用户详细信息（v2）/ Get detailed user info (v2)."""
        self._session.require_auth()
        raw = self._call("get_user_info_v2", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # Logout
    # ------------------------------------------------------------------

    def logout(self) -> None:
        """登出当前账号 / Logout current account."""
        self._session.require_auth()
        self._call("logout", lambda w: None)

    # ------------------------------------------------------------------
    # Password management
    # ------------------------------------------------------------------

    def reset_password(self, phone: str, captcha: str, new_password: str) -> None:
        """重置密码 / Reset password using captcha."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, captcha)
            self._write_string(w, 3, new_password)

        self._call("reset_password", _write)

    def change_password(self, old_password: str, new_password: str) -> None:
        """修改密码 / Change password."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, old_password)
            self._write_string(w, 2, new_password)

        self._call("change_password", _write)

    # ------------------------------------------------------------------
    # Phone / email binding
    # ------------------------------------------------------------------

    def bind_phone(self, phone: str, captcha: str) -> None:
        """绑定手机号 / Bind a phone number to the account."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, captcha)

        self._call("bind_phone", _write)

    def bind_email(self, email: str, captcha: str) -> None:
        """绑定邮箱 / Bind an email address to the account."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, email)
            self._write_string(w, 2, captcha)

        self._call("bind_email", _write)

    def unbind_third_party(self, provider: str) -> None:
        """解绑第三方账号 / Unbind third-party account."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, provider)

        self._call("unbind_third_party", _write)

    # ------------------------------------------------------------------
    # Username check
    # ------------------------------------------------------------------

    def check_username(self, username: str) -> bool:
        """检查用户名是否可用 / Check whether a username is available."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, username)

        result = self._call("check_username", _write)
        return bool(result)

    # ------------------------------------------------------------------
    # Social graph
    # ------------------------------------------------------------------

    def get_follower_list(self, page: int = 1, page_size: int = 20) -> list:
        """获取粉丝列表 / Get followers list."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, page)
            self._write_i32(w, 2, page_size)

        result = self._call("get_follower_list", _write)
        return result if isinstance(result, list) else []

    def get_following_list(self, page: int = 1, page_size: int = 20) -> list:
        """获取关注列表 / Get following list."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, page)
            self._write_i32(w, 2, page_size)

        result = self._call("get_following_list", _write)
        return result if isinstance(result, list) else []

    def follow_user(self, target_uid: int) -> None:
        """关注用户 / Follow a user."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i64(w, 1, target_uid)

        self._call("follow_user", _write)

    def unfollow_user(self, target_uid: int) -> None:
        """取消关注用户 / Unfollow a user."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i64(w, 1, target_uid)

        self._call("unfollow_user", _write)

    def get_user_public_info(self, unique_id: int) -> dict:
        """获取用户公开信息 / Get public info for a user by unique_id."""
        def _write(w: CompactWriter) -> None:
            self._write_i64(w, 1, unique_id)

        raw = self._call("get_user_public_info", _write)
        return raw if isinstance(raw, dict) else {}

    def search_user(self, keyword: str) -> list:
        """搜索用户 / Search users by keyword."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, keyword)

        result = self._call("search_user", _write)
        return result if isinstance(result, list) else []

    # ------------------------------------------------------------------
    # Rank / sign info
    # ------------------------------------------------------------------

    def get_rank_info(self) -> dict:
        """获取排行榜信息 / Get rank information."""
        self._session.require_auth()
        raw = self._call("get_rank_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    def get_sign_info(self) -> dict:
        """获取签到信息 / Get sign-in information."""
        self._session.require_auth()
        raw = self._call("get_sign_info", lambda w: None)
        return raw if isinstance(raw, dict) else {}

    # ------------------------------------------------------------------
    # UAID (免密登录 / Passwordless login)
    # ------------------------------------------------------------------

    def uaid_login(self, phone: str, uaid: str) -> dict:
        """UAID 免密登录 / Passwordless login via UAID."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, uaid)

        raw = self._call("uaid_login", _write)
        return _map_login_result(raw)

    def uaid_send_sms(self, phone: str) -> None:
        """通过 UAID 发送短信 / Send SMS via UAID."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)

        self._call("uaid_send_sms", _write)
