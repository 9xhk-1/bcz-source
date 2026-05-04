package com.baicizhan.client.business.webview.hwpay;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HwProductType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ HwProductType[] $VALUES;
    public static final HwProductType CONSUMED = new HwProductType("CONSUMED", 0, 0);
    public static final HwProductType NON_CONSUMED = new HwProductType("NON_CONSUMED", 1, 1);
    public static final HwProductType SUBSCRIPTION = new HwProductType("SUBSCRIPTION", 2, 2);
    private final int type;

    private static final /* synthetic */ HwProductType[] $values() {
        return new HwProductType[]{CONSUMED, NON_CONSUMED, SUBSCRIPTION};
    }

    static {
        HwProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private HwProductType(String str, int i11, int i12) {
        this.type = i12;
    }

    @k
    public static m00.a<HwProductType> getEntries() {
        return $ENTRIES;
    }

    public static HwProductType valueOf(String str) {
        return (HwProductType) Enum.valueOf(HwProductType.class, str);
    }

    public static HwProductType[] values() {
        return (HwProductType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
