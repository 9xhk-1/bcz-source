package com.baicizhan.main.home.plan.data;

import e80.j;
import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LearningState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LearningState[] $VALUES;
    private final int state;
    public static final LearningState UNAVAILABLE = new LearningState(j.f49590f, 0, -2);
    public static final LearningState ALL_DONE = new LearningState("ALL_DONE", 1, -1);
    public static final LearningState UNDONE = new LearningState("UNDONE", 2, 0);
    public static final LearningState DONE = new LearningState("DONE", 3, 1);
    public static final LearningState DONE_EXTRA_ONGOING = new LearningState("DONE_EXTRA_ONGOING", 4, 2);

    private static final /* synthetic */ LearningState[] $values() {
        return new LearningState[]{UNAVAILABLE, ALL_DONE, UNDONE, DONE, DONE_EXTRA_ONGOING};
    }

    static {
        LearningState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private LearningState(String str, int i11, int i12) {
        this.state = i12;
    }

    @k
    public static a<LearningState> getEntries() {
        return $ENTRIES;
    }

    public static LearningState valueOf(String str) {
        return (LearningState) Enum.valueOf(LearningState.class, str);
    }

    public static LearningState[] values() {
        return (LearningState[]) $VALUES.clone();
    }

    public final int getState() {
        return this.state;
    }
}
