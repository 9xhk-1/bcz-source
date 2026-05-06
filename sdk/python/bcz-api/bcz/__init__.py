"""
bcz — 百词斩 Python SDK

Public API surface:

    from bcz import Bcz, BczException, BczAuthError, BczApiError, BczTransportError
"""

from .client import Bcz
from ._exceptions import BczApiError, BczAuthError, BczException, BczTransportError

__all__ = [
    "Bcz",
    "BczException",
    "BczAuthError",
    "BczApiError",
    "BczTransportError",
]

__version__ = "0.1.0"
