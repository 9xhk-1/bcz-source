package com.baicizhan.app.biz.game.model;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ComboPropsType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ComboPropsType[] $VALUES;
    public static final ComboPropsType COMBO_PROTECT = new ComboPropsType("COMBO_PROTECT", 0, 1);
    public static final ComboPropsType IP_PROTECT = new ComboPropsType("IP_PROTECT", 1, 2);
    private final int value;

    private static final /* synthetic */ ComboPropsType[] $values() {
        return new ComboPropsType[]{COMBO_PROTECT, IP_PROTECT};
    }

    static {
        ComboPropsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ComboPropsType(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<ComboPropsType> getEntries() {
        return $ENTRIES;
    }

    public static ComboPropsType valueOf(String str) {
        return (ComboPropsType) Enum.valueOf(ComboPropsType.class, str);
    }

    public static ComboPropsType[] values() {
        return (ComboPropsType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
