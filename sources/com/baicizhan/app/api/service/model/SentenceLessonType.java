package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SentenceLessonType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SentenceLessonType[] $VALUES;
    public static final SentenceLessonType Learning = new SentenceLessonType("Learning", 0);
    public static final SentenceLessonType Review = new SentenceLessonType("Review", 1);
    public static final SentenceLessonType Journal = new SentenceLessonType("Journal", 2);

    private static final /* synthetic */ SentenceLessonType[] $values() {
        return new SentenceLessonType[]{Learning, Review, Journal};
    }

    static {
        SentenceLessonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SentenceLessonType(String str, int i11) {
    }

    @k
    public static a<SentenceLessonType> getEntries() {
        return $ENTRIES;
    }

    public static SentenceLessonType valueOf(String str) {
        return (SentenceLessonType) Enum.valueOf(SentenceLessonType.class, str);
    }

    public static SentenceLessonType[] values() {
        return (SentenceLessonType[]) $VALUES.clone();
    }
}
