package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.huawei.updatesdk.b.b.c {
    public static final String APIMETHOD = "client.getMarketInfo";

    @SDKNetTransmission
    private int deviceType;

    @SDKNetTransmission
    private int international;

    @SDKNetTransmission
    private String lang;

    @SDKNetTransmission
    private String marketPkg;

    @SDKNetTransmission
    private int net;

    @SDKNetTransmission
    private int sysBits;

    @SDKNetTransmission
    private String version;

    @SDKNetTransmission
    private String subsystem = "updatesdk";

    @SDKNetTransmission
    private String code = "0200";

    public a(String str) {
        a(APIMETHOD);
        this.marketPkg = str;
        this.sysBits = com.huawei.updatesdk.a.a.d.i.c.j();
        this.lang = com.huawei.updatesdk.a.a.d.i.c.g();
        b("8.0");
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        this.version = com.huawei.updatesdk.a.a.d.i.c.g(a11);
        this.deviceType = com.huawei.updatesdk.a.a.d.i.c.e();
        this.international = com.huawei.updatesdk.a.a.d.i.d.a();
        this.net = com.huawei.updatesdk.a.a.d.j.a.c(a11);
    }
}
