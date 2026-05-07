"""
bcz.services — service sub-package exports.
"""

from .user import UnifiedUserService
from .study import UserStudyApiService
from .resource import ResourceService
from .game import GameApiService
from .book import UserBookService
from .system import (
    BczSystemApiService,
    NotifyService,
    StrategyApiService,
    BczReportApiService,
)
from .advertise import AdvertiseApiService
from .mall import MallProxyService, AvatarApiService, PkApiService
from .assistant import UserAssistantApiService, UserActivityApiService
from .course import CourseApiService

__all__ = [
    "UnifiedUserService",
    "UserStudyApiService",
    "ResourceService",
    "GameApiService",
    "UserBookService",
    "BczSystemApiService",
    "NotifyService",
    "StrategyApiService",
    "BczReportApiService",
    "AdvertiseApiService",
    "MallProxyService",
    "AvatarApiService",
    "PkApiService",
    "UserAssistantApiService",
    "UserActivityApiService",
    "CourseApiService",
]
