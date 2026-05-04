package com.baicizhan.app.biz.synservice;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class SynTaskType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SynTaskType[] $VALUES;
    public static final SynTaskType SYNC_ALL = new SynTaskType("SYNC_ALL", 0);
    public static final SynTaskType SYNC = new SynTaskType("SYNC", 1);

    private static final /* synthetic */ SynTaskType[] $values() {
        return new SynTaskType[]{SYNC_ALL, SYNC};
    }

    static {
        SynTaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SynTaskType(String str, int i11) {
    }

    @k
    public static a<SynTaskType> getEntries() {
        return $ENTRIES;
    }

    public static SynTaskType valueOf(String str) {
        return (SynTaskType) Enum.valueOf(SynTaskType.class, str);
    }

    public static SynTaskType[] values() {
        return (SynTaskType[]) $VALUES.clone();
    }
}
