package com.baicizhan.main.home.plan.data;

import com.baicizhan.client.business.util.Standard_extKt;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LearnCardStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LearnCardStatus[] $VALUES;
    public static final LearnCardStatus LOADING = new LearnCardStatus("LOADING", 0);
    public static final LearnCardStatus LEARNING = new LearnCardStatus("LEARNING", 1);
    public static final LearnCardStatus CAKE_LEARNING = new LearnCardStatus("CAKE_LEARNING", 2);
    public static final LearnCardStatus FINISHING_LEARNING_TOADY = new LearnCardStatus("FINISHING_LEARNING_TOADY", 3);
    public static final LearnCardStatus CAKE_FINISHING_LEARNING_TODAY = new LearnCardStatus("CAKE_FINISHING_LEARNING_TODAY", 4);
    public static final LearnCardStatus QUIZZER_LEARNING = new LearnCardStatus("QUIZZER_LEARNING", 5);
    public static final LearnCardStatus REVIEWING = new LearnCardStatus("REVIEWING", 6);
    public static final LearnCardStatus FINISHING_REVIEW_TODAY = new LearnCardStatus("FINISHING_REVIEW_TODAY", 7);
    public static final LearnCardStatus QUIZZER_REVIEWING = new LearnCardStatus("QUIZZER_REVIEWING", 8);
    public static final LearnCardStatus ALL_FINISHING_LEARNING_TODAY = new LearnCardStatus("ALL_FINISHING_LEARNING_TODAY", 9);
    public static final LearnCardStatus CAKE_ALL_FINISHING_LEARNING_TODAY = new LearnCardStatus("CAKE_ALL_FINISHING_LEARNING_TODAY", 10);
    public static final LearnCardStatus ALL_FINISH_REVIEW_TODAY = new LearnCardStatus("ALL_FINISH_REVIEW_TODAY", 11);
    public static final LearnCardStatus ALL_KILLED_TODAY = new LearnCardStatus("ALL_KILLED_TODAY", 12);
    public static final LearnCardStatus CAKE_ALL_KILL_TODAY = new LearnCardStatus("CAKE_ALL_KILL_TODAY", 13);
    public static final LearnCardStatus ALL_KILL_NEXT_DAY = new LearnCardStatus("ALL_KILL_NEXT_DAY", 14);
    public static final LearnCardStatus QUIZZER_ALL_KILL_NEXT_DAY = new LearnCardStatus("QUIZZER_ALL_KILL_NEXT_DAY", 15);
    public static final LearnCardStatus ERROR = new LearnCardStatus("ERROR", 16);

    private static final /* synthetic */ LearnCardStatus[] $values() {
        return new LearnCardStatus[]{LOADING, LEARNING, CAKE_LEARNING, FINISHING_LEARNING_TOADY, CAKE_FINISHING_LEARNING_TODAY, QUIZZER_LEARNING, REVIEWING, FINISHING_REVIEW_TODAY, QUIZZER_REVIEWING, ALL_FINISHING_LEARNING_TODAY, CAKE_ALL_FINISHING_LEARNING_TODAY, ALL_FINISH_REVIEW_TODAY, ALL_KILLED_TODAY, CAKE_ALL_KILL_TODAY, ALL_KILL_NEXT_DAY, QUIZZER_ALL_KILL_NEXT_DAY, ERROR};
    }

    static {
        LearnCardStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LearnCardStatus(String str, int i11) {
    }

    @k
    public static a<LearnCardStatus> getEntries() {
        return $ENTRIES;
    }

    public static LearnCardStatus valueOf(String str) {
        return (LearnCardStatus) Enum.valueOf(LearnCardStatus.class, str);
    }

    public static LearnCardStatus[] values() {
        return (LearnCardStatus[]) $VALUES.clone();
    }

    public final boolean isAllDoneNormal() {
        return compareTo(CAKE_ALL_KILL_TODAY) <= 0 && compareTo(ALL_FINISHING_LEARNING_TODAY) >= 0;
    }

    public final boolean isAllDoneReview() {
        return this == ALL_FINISH_REVIEW_TODAY;
    }

    public final boolean isAllKill() {
        return compareTo(QUIZZER_ALL_KILL_NEXT_DAY) <= 0 && compareTo(ALL_KILLED_TODAY) >= 0;
    }

    public final boolean isDoing() {
        return compareTo(QUIZZER_REVIEWING) <= 0 && compareTo(LEARNING) >= 0;
    }

    public final boolean isDone() {
        return compareTo(QUIZZER_ALL_KILL_NEXT_DAY) <= 0 && compareTo(ALL_FINISHING_LEARNING_TODAY) >= 0;
    }

    public final boolean isDoneOfToday() {
        return Standard_extKt.anyOf(this, new LearnCardStatus[]{FINISHING_LEARNING_TOADY, CAKE_FINISHING_LEARNING_TODAY, FINISHING_REVIEW_TODAY});
    }

    public final boolean isNewLearnDoneOfToday() {
        return this == ALL_FINISHING_LEARNING_TODAY || this == CAKE_ALL_FINISHING_LEARNING_TODAY;
    }

    public final boolean isNormal() {
        return compareTo(QUIZZER_ALL_KILL_NEXT_DAY) <= 0 && compareTo(LEARNING) >= 0;
    }

    public final boolean isNormalLearning() {
        return (!isNormal() || isReviewing() || isQuizzer()) ? false : true;
    }

    public final boolean isQuizzer() {
        return this == QUIZZER_LEARNING || this == QUIZZER_REVIEWING || this == QUIZZER_ALL_KILL_NEXT_DAY;
    }

    public final boolean isQuizzerReviewing() {
        return this == QUIZZER_REVIEWING;
    }

    public final boolean isReviewing() {
        return this == REVIEWING || this == FINISHING_REVIEW_TODAY || this == QUIZZER_REVIEWING;
    }
}
