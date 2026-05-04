package com.baicizhan.main.home.plan.data;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class DataType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DataType[] $VALUES;
    public static final DataType PNG = new DataType("PNG", 0);
    public static final DataType LOTTERY = new DataType("LOTTERY", 1);

    private static final /* synthetic */ DataType[] $values() {
        return new DataType[]{PNG, LOTTERY};
    }

    static {
        DataType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private DataType(String str, int i11) {
    }

    @k
    public static a<DataType> getEntries() {
        return $ENTRIES;
    }

    public static DataType valueOf(String str) {
        return (DataType) Enum.valueOf(DataType.class, str);
    }

    public static DataType[] values() {
        return (DataType[]) $VALUES.clone();
    }
}
