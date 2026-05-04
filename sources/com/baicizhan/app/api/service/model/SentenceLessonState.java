package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SentenceLessonState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SentenceLessonState[] $VALUES;
    public static final SentenceLessonState UnCompleted = new SentenceLessonState("UnCompleted", 0);
    public static final SentenceLessonState Completed = new SentenceLessonState("Completed", 1);
    public static final SentenceLessonState Current = new SentenceLessonState("Current", 2);

    private static final /* synthetic */ SentenceLessonState[] $values() {
        return new SentenceLessonState[]{UnCompleted, Completed, Current};
    }

    static {
        SentenceLessonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SentenceLessonState(String str, int i11) {
    }

    @k
    public static a<SentenceLessonState> getEntries() {
        return $ENTRIES;
    }

    public static SentenceLessonState valueOf(String str) {
        return (SentenceLessonState) Enum.valueOf(SentenceLessonState.class, str);
    }

    public static SentenceLessonState[] values() {
        return (SentenceLessonState[]) $VALUES.clone();
    }
}
