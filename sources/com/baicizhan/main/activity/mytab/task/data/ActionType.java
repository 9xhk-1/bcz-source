package com.baicizhan.main.activity.mytab.task.data;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ActionType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType H5 = new ActionType("H5", 0);
    public static final ActionType NATIVE = new ActionType("NATIVE", 1);
    public static final ActionType SIGN_IN = new ActionType("SIGN_IN", 2);
    public static final ActionType GET_AWARD = new ActionType("GET_AWARD", 3);
    public static final ActionType NONE = new ActionType("NONE", 4);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{H5, NATIVE, SIGN_IN, GET_AWARD, NONE};
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ActionType(String str, int i11) {
    }

    @k
    public static m00.a<ActionType> getEntries() {
        return $ENTRIES;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
