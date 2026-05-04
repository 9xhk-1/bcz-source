package com.baicizhan.client.business.webview.hwpay;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HwPayResultStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ HwPayResultStatus[] $VALUES;
    private final int status;
    public static final HwPayResultStatus SUCCESS = new HwPayResultStatus(com.alipay.sdk.m.f0.c.f10532p, 0, 1);
    public static final HwPayResultStatus FAILURE = new HwPayResultStatus("FAILURE", 1, 0);
    public static final HwPayResultStatus CANCEL = new HwPayResultStatus("CANCEL", 2, -1);
    public static final HwPayResultStatus NON_CONSUMED_OWNED = new HwPayResultStatus("NON_CONSUMED_OWNED", 3, 2);

    private static final /* synthetic */ HwPayResultStatus[] $values() {
        return new HwPayResultStatus[]{SUCCESS, FAILURE, CANCEL, NON_CONSUMED_OWNED};
    }

    static {
        HwPayResultStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private HwPayResultStatus(String str, int i11, int i12) {
        this.status = i12;
    }

    @k
    public static m00.a<HwPayResultStatus> getEntries() {
        return $ENTRIES;
    }

    public static HwPayResultStatus valueOf(String str) {
        return (HwPayResultStatus) Enum.valueOf(HwPayResultStatus.class, str);
    }

    public static HwPayResultStatus[] values() {
        return (HwPayResultStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
