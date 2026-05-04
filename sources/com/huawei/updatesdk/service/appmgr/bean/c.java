package com.huawei.updatesdk.service.appmgr.bean;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends com.huawei.updatesdk.a.b.c.c.b {

    @SDKNetTransmission
    private String appName;

    @SDKNetTransmission
    private String downUrl;

    @SDKNetTransmission
    private long fileSize;

    @SDKNetTransmission
    private String pkgName;

    @SDKNetTransmission
    private String sha256;

    @SDKNetTransmission
    private long versionCode;

    @SDKNetTransmission
    private String versionName;

    public String a() {
        return this.appName;
    }

    public String b() {
        return this.downUrl;
    }

    public long c() {
        return this.fileSize;
    }

    public String d() {
        return this.pkgName;
    }

    public String e() {
        return this.sha256;
    }

    public boolean f() {
        return (TextUtils.isEmpty(this.sha256) || TextUtils.isEmpty(this.downUrl) || this.fileSize <= 0) ? false : true;
    }
}
