package com.baicizhan.main.vld.model;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WifiFreqType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WifiFreqType[] $VALUES;
    public static final WifiFreqType TYPE_24G = new WifiFreqType("TYPE_24G", 0);
    public static final WifiFreqType TYPE_5G = new WifiFreqType("TYPE_5G", 1);
    public static final WifiFreqType TYPE_24G_5G = new WifiFreqType("TYPE_24G_5G", 2);
    public static final WifiFreqType UNKNOWN = new WifiFreqType("UNKNOWN", 3);

    private static final /* synthetic */ WifiFreqType[] $values() {
        return new WifiFreqType[]{TYPE_24G, TYPE_5G, TYPE_24G_5G, UNKNOWN};
    }

    static {
        WifiFreqType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private WifiFreqType(String str, int i11) {
    }

    @k
    public static a<WifiFreqType> getEntries() {
        return $ENTRIES;
    }

    public static WifiFreqType valueOf(String str) {
        return (WifiFreqType) Enum.valueOf(WifiFreqType.class, str);
    }

    public static WifiFreqType[] values() {
        return (WifiFreqType[]) $VALUES.clone();
    }
}
