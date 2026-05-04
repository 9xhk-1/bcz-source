package com.baicizhan.main.home.plan.learncard;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class UiType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UiType[] $VALUES;
    public static final UiType Pic = new UiType("Pic", 0);
    public static final UiType Exam = new UiType("Exam", 1);
    public static final UiType Ain1 = new UiType("Ain1", 2);

    private static final /* synthetic */ UiType[] $values() {
        return new UiType[]{Pic, Exam, Ain1};
    }

    static {
        UiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private UiType(String str, int i11) {
    }

    @k
    public static a<UiType> getEntries() {
        return $ENTRIES;
    }

    public static UiType valueOf(String str) {
        return (UiType) Enum.valueOf(UiType.class, str);
    }

    public static UiType[] values() {
        return (UiType[]) $VALUES.clone();
    }
}
