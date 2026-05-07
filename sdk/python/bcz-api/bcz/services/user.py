"""
UnifiedUserService — 用户认证与个人资料接口 / User authentication & profile API.

Host: https://passport.baicizhan.com
Service: unified_user_service
"""

from __future__ import annotations

from typing import Optional

from .._protocol import (
    TYPE_I32,
    TYPE_LIST,
    TYPE_STRUCT,
    CompactWriter,
)
from .._session import BczSession
from ._base import _BaseService, _map_deep
from ._field_maps import USER_LOGIN_RESULT, USER_PROFILE, USER_TRY_RESULT, USER_TRY_RESULT_WATCH

_HOST = "https://passport.baicizhan.com"
_SVC = "unified_user_service"


def _map_login_result(raw) -> dict:
    return _map_deep(raw, USER_LOGIN_RESULT)


class UnifiedUserService(_BaseService):
    """百词斩统一用户服务 / BCZ Unified User Service.

    Covers registration, login (phone / password / third-party / guest),
    and profile management.
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
        """以游客身份登录（v2）/ Guest login (v2). Returns UserTryResult {email}."""
        raw = self._call("have_a_try_v2", lambda w: None)
        return _map_deep(raw, USER_TRY_RESULT)

    def have_a_try_v3(self) -> dict:
        """以游客身份登录（v3）/ Guest login (v3). Returns UserTryResultForWatch {token}."""
        raw = self._call("have_a_try_v3", lambda w: None)
        return _map_deep(raw, USER_TRY_RESULT_WATCH)

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

    def send_email_verify_code(self, email: str) -> None:
        """发送邮箱验证码 / Send email verification code."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, email)

        self._call("send_email_verify_code", _write)

    def get_img_captcha(self, phone: str) -> dict:
        """获取图形验证码 / Get image captcha."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)

        raw = self._call("get_img_captcha", _write)
        return raw if isinstance(raw, dict) else {}

    def verify_img_captcha(self, phone: str, code: str) -> None:
        """验证图形验证码 / Verify image captcha."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, code)

        self._call("verify_img_captcha", _write)

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
    # Token check
    # ------------------------------------------------------------------

    def check_access_token(self) -> bool:
        """验证当前访问令牌是否有效 / Check if the current access token is valid."""
        self._session.require_auth()
        result = self._call("check_access_token", lambda w: None)
        return bool(result)

    # ------------------------------------------------------------------
    # Profile
    # ------------------------------------------------------------------

    def get_profile(self) -> dict:
        """获取当前用户的公开资料 / Get current user's public profile.

        Returns UserProfile: {nickname, gender_id, unique_id}
        """
        self._session.require_auth()
        raw = self._call("get_profile", lambda w: None)
        return _map_deep(raw, USER_PROFILE)

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

    def update_nickname(self, nickname: str) -> None:
        """更新昵称 / Update nickname."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, nickname)

        self._call("update_nickname", _write)

    def update_gender(self, gender_id: int) -> None:
        """更新性别 / Update gender."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_i32(w, 1, gender_id)

        self._call("update_gender", _write)

    # ------------------------------------------------------------------
    # Account management
    # ------------------------------------------------------------------

    def reset_password(self, phone: str, captcha: str, new_password: str) -> None:
        """重置密码 / Reset password using captcha."""
        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, captcha)
            self._write_string(w, 3, new_password)

        self._call("reset_password", _write)

    def bind_phone(self, phone: str, captcha: str) -> None:
        """绑定手机号 / Bind a phone number to the account."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, phone)
            self._write_string(w, 2, captcha)

        self._call("bind_phone", _write)

    def unbind_third_party(self, provider: str) -> None:
        """解绑第三方账号 / Unbind third-party account."""
        self._session.require_auth()

        def _write(w: CompactWriter) -> None:
            self._write_string(w, 1, provider)

        self._call("unbind_third_party", _write)

    def delete_account(self) -> None:
        """注销账号 / Delete account."""
        self._session.require_auth()
        self._call("delete_account", lambda w: None)
