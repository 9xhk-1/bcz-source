"""
Bcz — 百词斩 Python SDK 主入口 / Main Bcz facade class.

Usage::

    from bcz import Bcz

    bcz = Bcz()
    bcz.send_sms("13934561111")
    result = bcz.login("13934561111", "123456")
    print(bcz.get_profile())
"""

from __future__ import annotations

from typing import Optional

from ._exceptions import BczAuthError, BczException
from ._session import BczSession
from .services import (
    AdvertiseApiService,
    AvatarApiService,
    BczReportApiService,
    BczSystemApiService,
    CourseApiService,
    GameApiService,
    MallProxyService,
    NotifyService,
    PkApiService,
    ResourceService,
    StrategyApiService,
    UnifiedUserService,
    UserActivityApiService,
    UserAssistantApiService,
    UserBookService,
    UserStudyApiService,
)


class Bcz:
    """百词斩 SDK 主入口 / BCZ SDK main facade.

    All service methods are accessible via convenience proxy methods and
    via typed service accessors (``bcz.user``, ``bcz.study``, etc.).

    Quick start::

        bcz = Bcz()
        bcz.send_sms("13912345678")        # request SMS code
        bcz.login("13912345678", "5201")   # login, auto-sets access_token
        profile = bcz.get_profile()
        words = bcz.search_word("apple")

    For full API access use service accessors::

        bcz.game.start_round(book_id=1, chapter=1)
        bcz.study.update_study_plan(new_count=20, review_count=30)
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
        """初始化 SDK / Initialise the SDK.

        :param device_id: 16-char hex device ID; auto-generated if omitted.
        :param app_version_code: App version code string.
        :param os_version: Android OS version string.
        :param device_model: Device model string.
        :param channel: Distribution channel.
        :param time_zone: IANA time-zone name.
        :param timeout: HTTP request timeout in seconds.
        """
        self._session = BczSession(
            device_id=device_id,
            app_version_code=app_version_code,
            os_version=os_version,
            device_model=device_model,
            channel=channel,
            time_zone=time_zone,
            timeout=timeout,
        )
        self._user = UnifiedUserService(self._session)
        self._study = UserStudyApiService(self._session)
        self._resource = ResourceService(self._session)
        self._game = GameApiService(self._session)
        self._book = UserBookService(self._session)
        self._system = BczSystemApiService(self._session)
        self._notify = NotifyService(self._session)
        self._strategy = StrategyApiService(self._session)
        self._report = BczReportApiService(self._session)
        self._advertise = AdvertiseApiService(self._session)
        self._mall = MallProxyService(self._session)
        self._avatar = AvatarApiService(self._session)
        self._pk = PkApiService(self._session)
        self._assistant = UserAssistantApiService(self._session)
        self._activity = UserActivityApiService(self._session)
        self._course = CourseApiService(self._session)

    # ------------------------------------------------------------------
    # Session properties
    # ------------------------------------------------------------------

    @property
    def access_token(self) -> Optional[str]:
        """当前访问令牌 / Current access token."""
        return self._session.access_token

    @property
    def unique_id(self) -> Optional[int]:
        """当前用户 unique_id / Current user unique ID."""
        return self._session.unique_id

    @property
    def device_id(self) -> str:
        """设备 ID / Device ID."""
        return self._session.device_id

    @property
    def is_authenticated(self) -> bool:
        """是否已登录 / Whether the session is authenticated."""
        return self._session.is_authenticated

    # ------------------------------------------------------------------
    # Auth methods
    # ------------------------------------------------------------------

    def send_sms(self, phone: str, verify_type: int = 5) -> None:
        """发送短信验证码 / Send an SMS verification code.

        :param phone: Mobile phone number / 手机号
        :param verify_type: Verification type (default 5)
        """
        return self._user.send_sms_verify_code(phone, verify_type)

    def login(self, phone: str, code: str) -> dict:
        """手机号+验证码登录 / Login with phone + SMS code.

        Automatically stores the returned access_token in the session.
        自动将返回的 access_token 存入会话。

        :returns: UserLoginResult dict
        """
        result = self._user.login_with_phone(phone, code)
        self._session.update_from_login_result(result)
        return result

    def login_with_password(self, account: str, password: str) -> dict:
        """账号密码登录 / Login with account and password.

        自动存储访问令牌 / Auto-stores access token.
        """
        result = self._user.bcz_login(account, password)
        self._session.update_from_login_result(result)
        return result

    def login_as_guest(self) -> dict:
        """游客登录 / Login as a guest (no credentials).

        自动存储访问令牌 / Auto-stores access token.
        """
        result = self._user.have_a_try()
        self._session.update_from_login_result(result)
        return result

    def login_with_apple(self, identity_token: str, authorization_code: str) -> dict:
        """Apple ID 登录 / Login with Apple ID.

        自动存储访问令牌 / Auto-stores access token.
        """
        result = self._user.apple_login(identity_token, authorization_code)
        self._session.update_from_login_result(result)
        return result

    def login_with_google(self, id_token: str) -> dict:
        """Google 账号登录 / Login with Google ID token.

        自动存储访问令牌 / Auto-stores access token.
        """
        result = self._user.google_login(id_token)
        self._session.update_from_login_result(result)
        return result

    def login_with_third_party(
        self,
        provider: str,
        openid: str,
        access_token_3p: str,
        unionid: str = "",
    ) -> dict:
        """第三方平台登录 / Login via third-party OAuth.

        自动存储访问令牌 / Auto-stores access token.
        """
        result = self._user.third_party_login(
            provider, openid, access_token_3p, unionid
        )
        self._session.update_from_login_result(result)
        return result

    def set_access_token(
        self, access_token: str, unique_id: Optional[int] = None
    ) -> None:
        """手动设置访问令牌（已有 token 的用户使用）/ Manually set access token.

        Useful when you already have a valid token from a previous session.
        如果已有有效 token 可直接设置，跳过登录流程。
        """
        self._session.access_token = access_token
        if unique_id is not None:
            self._session.unique_id = unique_id

    def logout(self) -> None:
        """登出当前账号并清除本地令牌 / Logout and clear local token."""
        self._session.access_token = None
        self._session.unique_id = None

    # ------------------------------------------------------------------
    # Convenience proxy methods
    # ------------------------------------------------------------------

    def get_profile(self) -> dict:
        """获取当前用户资料 / Get current user's profile."""
        return self._user.get_profile()

    def get_study_home(self) -> dict:
        """获取学习首页 / Get study home page data."""
        return self._study.get_study_home()

    def get_book_list(self) -> list:
        """获取可选词书列表 / Get list of available study books."""
        return self._study.get_all_books_basic_info()

    def select_book(self, book_id: int) -> None:
        """选择学习词书 / Select a study book."""
        return self._study.select_book(book_id)

    def search_word(self, query: str) -> list:
        """搜索单词 / Search words by query string."""
        return self._resource.search_word_v2(query)

    def translate(self, text: str) -> dict:
        """翻译文本 / Translate text."""
        return self._resource.translate_v2(text)

    def get_word(self, word: str) -> dict:
        """查词典 / Look up a word in the dictionary."""
        return self._resource.get_dict_by_word_v2(word)

    # ------------------------------------------------------------------
    # Service accessors
    # ------------------------------------------------------------------

    @property
    def user(self) -> UnifiedUserService:
        """用户服务 / User service accessor."""
        return self._user

    @property
    def study(self) -> UserStudyApiService:
        """学习服务 / Study service accessor."""
        return self._study

    @property
    def resource(self) -> ResourceService:
        """资源服务 / Resource service accessor."""
        return self._resource

    @property
    def game(self) -> GameApiService:
        """游戏服务 / Game service accessor."""
        return self._game

    @property
    def book(self) -> UserBookService:
        """词书服务 / User book service accessor."""
        return self._book

    @property
    def system(self) -> BczSystemApiService:
        """系统服务 / System service accessor."""
        return self._system

    @property
    def notify(self) -> NotifyService:
        """通知服务 / Notify service accessor."""
        return self._notify

    @property
    def strategy(self) -> StrategyApiService:
        """策略服务（会员/权益）/ Strategy service accessor."""
        return self._strategy

    @property
    def report(self) -> BczReportApiService:
        """事件上报服务 / Report service accessor."""
        return self._report

    @property
    def advertise(self) -> AdvertiseApiService:
        """广告服务 / Advertise service accessor."""
        return self._advertise

    @property
    def mall(self) -> MallProxyService:
        """商城服务 / Mall service accessor."""
        return self._mall

    @property
    def avatar(self) -> AvatarApiService:
        """头像服务 / Avatar service accessor."""
        return self._avatar

    @property
    def pk(self) -> PkApiService:
        """PK 服务 / PK service accessor."""
        return self._pk

    @property
    def assistant(self) -> UserAssistantApiService:
        """助手服务 / Assistant service accessor."""
        return self._assistant

    @property
    def activity(self) -> UserActivityApiService:
        """活动服务 / Activity service accessor."""
        return self._activity

    @property
    def course(self) -> CourseApiService:
        """课程服务 / Course service accessor."""
        return self._course
