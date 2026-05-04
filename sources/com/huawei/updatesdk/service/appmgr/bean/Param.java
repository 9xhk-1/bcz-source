package com.huawei.updatesdk.service.appmgr.bean;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.h;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Param extends com.huawei.updatesdk.a.b.c.c.b {
    private String fSha2_;
    private int isPre_;
    private List<String> keySets_;
    private int maple_;
    private String oldVersion_;
    private String package_;

    @SDKNetTransmission
    private int pkgMode;
    private String sSha2_;

    @SDKNetTransmission
    private long shellApkVer;
    private int targetSdkVersion_;
    private int versionCode_;

    public Param() {
    }

    private long getShellApkVer(PackageInfo packageInfo) {
        return packageInfo.baseRevisionCode;
    }

    public String getPackageName() {
        return this.package_;
    }

    public void setApkFileSha256(String str) {
        this.fSha2_ = str;
    }

    public void setApkSignature(String str) {
        String b11 = h.b(com.huawei.updatesdk.a.a.d.a.a(h.c(str)));
        if (TextUtils.isEmpty(b11)) {
            return;
        }
        this.sSha2_ = b11.toLowerCase(Locale.getDefault());
    }

    public void setMapleState(int i11) {
        this.maple_ = i11;
    }

    public void setPackageName(String str) {
        this.package_ = str;
    }

    public void setTargetSdkVersion(int i11) {
        this.targetSdkVersion_ = i11;
    }

    public void setVersionCode(int i11) {
        this.versionCode_ = i11;
    }

    public void setVersionName(String str) {
        this.oldVersion_ = str;
    }

    public Param(PackageInfo packageInfo) {
        this.package_ = packageInfo.packageName;
        this.versionCode_ = packageInfo.versionCode;
        String str = packageInfo.versionName;
        this.oldVersion_ = str == null ? "null" : str;
        this.targetSdkVersion_ = packageInfo.applicationInfo.targetSdkVersion;
        this.isPre_ = com.huawei.updatesdk.b.h.b.a(packageInfo);
        this.maple_ = com.huawei.updatesdk.b.h.b.b(this.package_);
        this.keySets_ = com.huawei.updatesdk.b.a.b.b.a().a(packageInfo);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            setApkSignature(signatureArr[0].toCharsString());
        }
        this.fSha2_ = com.huawei.updatesdk.b.a.a.b.a().a(packageInfo);
        this.shellApkVer = getShellApkVer(packageInfo);
        this.pkgMode = com.huawei.updatesdk.a.a.d.e.d(this.package_) ? 2 : 0;
    }
}
