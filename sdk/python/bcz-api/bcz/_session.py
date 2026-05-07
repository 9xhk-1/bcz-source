"""
会话 / 认证状态管理 / Session and authentication state.
"""

from __future__ import annotations

import secrets
from typing import Optional

from ._exceptions import BczAuthError
from ._transport import build_cookie


def _generate_device_id() -> str:
    """Generate a random 16-character hex device ID. / 生成随机 16 位十六进制设备 ID。"""
    return secrets.token_hex(8)  # 8 bytes → 16 hex chars


class BczSession:
    """Holds authentication state and device configuration for a BCZ client.

    保存 BCZ 客户端的认证状态和设备配置。

    A single :class:`BczSession` instance is shared across all service
    objects that belong to the same :class:`~bcz.client.Bcz` facade.  For
    multi-threaded use create one :class:`~bcz.client.Bcz` per thread.
    """

    def __init__(
        self,
        device_id: Optional[str] = None,
        app_version_code: str = "7081400",
        os_version: str = "14",
        device_model: str = "Pixel6-Google",
        channel: str = "official",
        time_zone: str = "Asia/Shanghai",
        timeout: int = 15,
    ) -> None:
        self.device_id: str = device_id or _generate_device_id()
        self.app_version_code: str = app_version_code
        self.os_version: str = os_version
        self.device_model: str = device_model
        self.channel: str = channel
        self.time_zone: str = time_zone
        self.timeout: int = timeout

        self.access_token: Optional[str] = None
        self.unique_id: Optional[int] = None

    # ------------------------------------------------------------------
    # Cookie helper
    # ------------------------------------------------------------------

    def cookie(self) -> str:
        """Return the full Cookie header string for the current session.
        返回当前会话的完整 Cookie 头字符串。"""
        return build_cookie(
            device_id=self.device_id,
            app_version_code=self.app_version_code,
            os_version=self.os_version,
            device_model=self.device_model,
            channel=self.channel,
            time_zone=self.time_zone,
            access_token=self.access_token,
        )

    # ------------------------------------------------------------------
    # Auth helpers
    # ------------------------------------------------------------------

    def update_from_login_result(self, result: dict) -> None:
        """Persist auth fields returned by a login RPC.
        将登录 RPC 返回的认证字段持久化到会话中。"""
        if not result:
            return
        token = result.get("access_token")
        if token:
            self.access_token = token
        uid = result.get("unique_id")
        if uid:
            self.unique_id = int(uid)

    def require_auth(self) -> None:
        """Raise :class:`~bcz._exceptions.BczAuthError` if not authenticated.
        若未登录则抛出 BczAuthError。"""
        if not self.access_token:
            raise BczAuthError(
                "Not authenticated. Call a login method first, or set "
                "access_token via Bcz.set_access_token()."
            )

    @property
    def is_authenticated(self) -> bool:
        """True if an access token has been set. / 是否已设置访问令牌。"""
        return bool(self.access_token)
