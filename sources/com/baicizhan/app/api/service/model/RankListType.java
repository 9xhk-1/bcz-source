package com.baicizhan.app.api.service.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RankListType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RankListType[] $VALUES;
    public static final RankListType Normal = new RankListType("Normal", 0);
    public static final RankListType Up = new RankListType("Up", 1);
    public static final RankListType Down = new RankListType("Down", 2);

    private static final /* synthetic */ RankListType[] $values() {
        return new RankListType[]{Normal, Up, Down};
    }

    static {
        RankListType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RankListType(String str, int i11) {
    }

    @k
    public static a<RankListType> getEntries() {
        return $ENTRIES;
    }

    public static RankListType valueOf(String str) {
        return (RankListType) Enum.valueOf(RankListType.class, str);
    }

    public static RankListType[] values() {
        return (RankListType[]) $VALUES.clone();
    }
}
