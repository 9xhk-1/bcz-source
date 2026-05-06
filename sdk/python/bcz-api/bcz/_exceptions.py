"""
异常定义 / Exception definitions for the BCZ SDK.
"""

from __future__ import annotations


class BczException(Exception):
    """Base exception for all BCZ SDK errors. / BCZ SDK 基础异常类。"""


class BczAuthError(BczException):
    """Raised when an operation requires authentication but no token is set.
    / 未登录时调用需要认证的接口抛出此异常。"""


class BczApiError(BczException):
    """Raised when the server returns an application-level error.
    / 服务器返回应用层错误时抛出此异常。"""

    def __init__(self, code: int, message: str) -> None:
        super().__init__(f"[{code}] {message}")
        self.code = code
        self.message = message

    def __repr__(self) -> str:  # pragma: no cover
        return f"BczApiError(code={self.code!r}, message={self.message!r})"


class BczTransportError(BczException):
    """Raised on HTTP / network-level failures.
    / HTTP 或网络层异常。"""
