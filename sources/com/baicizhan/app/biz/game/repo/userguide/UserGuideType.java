package com.baicizhan.app.biz.game.repo.userguide;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class UserGuideType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserGuideType[] $VALUES;

    @k
    private final String value;
    public static final UserGuideType NewUserSentenceStory = new UserGuideType("NewUserSentenceStory", 0, "new_user_sentence_story");
    public static final UserGuideType NewUserWordsReviewGuide = new UserGuideType("NewUserWordsReviewGuide", 1, "new_user_words_review_guide");
    public static final UserGuideType ForgettingCurveGuide = new UserGuideType("ForgettingCurveGuide", 2, "forgetting_curve_guide");
    public static final UserGuideType NewUserScheduleGuide = new UserGuideType("NewUserScheduleGuide", 3, "new_user_schedule_guide");
    public static final UserGuideType NewUserWinningLocked = new UserGuideType("NewUserWinningLocked", 4, "new_user_winning_locked");
    public static final UserGuideType NewUserRankLocked = new UserGuideType("NewUserRankLocked", 5, "new_user_rank_locked");
    public static final UserGuideType NewUserTasksLocked = new UserGuideType("NewUserTasksLocked", 6, "new_user_task_locked");
    public static final UserGuideType NewUserLavaQuestLocked = new UserGuideType("NewUserLavaQuestLocked", 7, "new_user_lava_quest_locked");
    public static final UserGuideType NewUserCheckBadgeGuide = new UserGuideType("NewUserCheckBadgeGuide", 8, "new_user_check_badge_guide");
    public static final UserGuideType GetStudyBuddyGuide = new UserGuideType("GetStudyBuddyGuide", 9, "get_study_buddy_guide");
    public static final UserGuideType SendBuddyTravelGuide = new UserGuideType("SendBuddyTravelGuide", 10, "send_buddy_travel_guide");
    public static final UserGuideType PetCookieEarningGuide = new UserGuideType("PetCookieEarningGuide", 11, "pet_cookie_earning_guide");
    public static final UserGuideType OldUserUpgradeGuide = new UserGuideType("OldUserUpgradeGuide", 12, "old_user_upgrade_guide");

    private static final /* synthetic */ UserGuideType[] $values() {
        return new UserGuideType[]{NewUserSentenceStory, NewUserWordsReviewGuide, ForgettingCurveGuide, NewUserScheduleGuide, NewUserWinningLocked, NewUserRankLocked, NewUserTasksLocked, NewUserLavaQuestLocked, NewUserCheckBadgeGuide, GetStudyBuddyGuide, SendBuddyTravelGuide, PetCookieEarningGuide, OldUserUpgradeGuide};
    }

    static {
        UserGuideType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UserGuideType(String str, int i11, String str2) {
        this.value = str2;
    }

    @k
    public static a<UserGuideType> getEntries() {
        return $ENTRIES;
    }

    public static UserGuideType valueOf(String str) {
        return (UserGuideType) Enum.valueOf(UserGuideType.class, str);
    }

    public static UserGuideType[] values() {
        return (UserGuideType[]) $VALUES.clone();
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
