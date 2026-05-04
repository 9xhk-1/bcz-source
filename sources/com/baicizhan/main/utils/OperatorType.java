package com.baicizhan.main.utils;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class OperatorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OperatorType[] $VALUES;
    public static final OperatorType CMCC = new OperatorType("CMCC", 0);
    public static final OperatorType CUCC = new OperatorType("CUCC", 1);
    public static final OperatorType CTCC = new OperatorType("CTCC", 2);
    public static final OperatorType UNKNOWN = new OperatorType("UNKNOWN", 3);

    private static final /* synthetic */ OperatorType[] $values() {
        return new OperatorType[]{CMCC, CUCC, CTCC, UNKNOWN};
    }

    static {
        OperatorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private OperatorType(String str, int i11) {
    }

    @k
    public static a<OperatorType> getEntries() {
        return $ENTRIES;
    }

    public static OperatorType valueOf(String str) {
        return (OperatorType) Enum.valueOf(OperatorType.class, str);
    }

    public static OperatorType[] values() {
        return (OperatorType[]) $VALUES.clone();
    }
}
