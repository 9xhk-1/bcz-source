package com.baicizhan.main.home.plan.winningStreak;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BarType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BarType[] $VALUES;
    public static final BarType Light = new BarType("Light", 0);
    public static final BarType Dark = new BarType("Dark", 1);
    public static final BarType Normal = new BarType("Normal", 2);

    private static final /* synthetic */ BarType[] $values() {
        return new BarType[]{Light, Dark, Normal};
    }

    static {
        BarType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private BarType(String str, int i11) {
    }

    @k
    public static m00.a<BarType> getEntries() {
        return $ENTRIES;
    }

    public static BarType valueOf(String str) {
        return (BarType) Enum.valueOf(BarType.class, str);
    }

    public static BarType[] values() {
        return (BarType[]) $VALUES.clone();
    }
}
