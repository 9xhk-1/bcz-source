package com.baicizhan.client.business.webview.hwpay.db;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HwPayDatabaseKt {

    @k
    public static final String DB_HW_PAY = "hw_pay";

    @k
    private static final HwPayDatabase hwPayDB = new HwPayDBDelegate().getValue();

    @k
    public static final HwPayDatabase getHwPayDB() {
        return hwPayDB;
    }
}
