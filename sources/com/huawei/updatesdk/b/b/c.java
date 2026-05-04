package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.os.Build;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends com.huawei.updatesdk.a.b.c.c.c {

    @SDKNetTransmission
    private String brand;

    @SDKNetTransmission
    private String buildNumber;

    @SDKNetTransmission
    private String density;

    @SDKNetTransmission
    private int emuiApiLevel;

    @SDKNetTransmission
    private String firmwareVersion;

    @SDKNetTransmission
    private int harmonyApiLevel;

    @SDKNetTransmission
    private int magicApiLevel;

    @SDKNetTransmission
    private String magicVer;

    @SDKNetTransmission
    private String manufacturer;

    @SDKNetTransmission
    private int odm;

    @SDKNetTransmission
    private String osBrand;

    @SDKNetTransmission
    private String phoneType;

    @SDKNetTransmission
    private String resolution;

    @SDKNetTransmission
    private String sdkVersion;

    /* renamed from: ts, reason: collision with root package name */
    @SDKNetTransmission
    private long f36880ts;

    public c() {
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        this.f36880ts = System.currentTimeMillis();
        this.firmwareVersion = Build.VERSION.RELEASE.trim();
        this.buildNumber = com.huawei.updatesdk.a.a.d.i.c.d();
        com.huawei.updatesdk.b.c.c a12 = com.huawei.updatesdk.b.c.b.a();
        this.phoneType = a12.e();
        this.density = com.huawei.updatesdk.a.a.d.i.c.e(a11);
        this.resolution = com.huawei.updatesdk.a.a.d.i.c.d(a11);
        this.emuiApiLevel = com.huawei.updatesdk.b.h.a.f().a();
        this.manufacturer = a12.d();
        this.brand = com.huawei.updatesdk.a.a.d.i.c.f36827d;
        this.odm = com.huawei.updatesdk.a.a.d.i.c.f36831h ? 1 : 0;
        this.sdkVersion = "4.0.5.300";
        this.harmonyApiLevel = com.huawei.updatesdk.a.a.d.i.c.f36832i;
        this.osBrand = com.huawei.updatesdk.a.a.d.i.c.f36833j;
        this.magicApiLevel = com.huawei.updatesdk.b.h.a.f().b();
        this.magicVer = com.huawei.updatesdk.b.h.a.f().c();
    }
}
