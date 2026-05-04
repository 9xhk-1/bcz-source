package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.huawei.updatesdk.a.a.d.i.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends com.huawei.updatesdk.b.b.c {
    public static final String APIMETHOD = "client.updateCheck";
    public static final int DEFAULT_UPGRADE_RESULT = 0;
    public static final int FULL_UPGRADE_RESULT = 1;
    public static final int INSTALL_CHECK_DEFAULT = 0;
    private String agVersion_;

    @SDKNetTransmission
    private String cno;
    private com.huawei.updatesdk.a.a.d.i.b deviceSpecParams_;
    private int getSafeGame_;
    private int gmsSupport_;

    @SDKNetTransmission
    private int hardwareType;

    @SDKNetTransmission
    private String harmonyDeviceType;
    private int installCheck_;
    private int isFullUpgrade_;

    @SDKNetTransmission
    private int isUpdateSdk;

    @SDKNetTransmission
    private String locale;
    private int mapleVer_;
    private String packageName_;

    @SDKNetTransmission
    private int pcEmulator;
    private a pkgInfo_;
    private String serviceCountry_;

    @SDKNetTransmission
    private int serviceType;
    private int supportMaple_;
    private int versionCode_;
    private String version_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends com.huawei.updatesdk.a.b.c.c.b {
        private List<Param> params_;

        public void a(List<Param> list) {
            this.params_ = list;
        }
    }

    public d() {
        this.serviceType = 0;
        this.isUpdateSdk = 1;
        this.installCheck_ = 0;
        this.isFullUpgrade_ = 0;
        this.getSafeGame_ = 1;
        this.supportMaple_ = 0;
        Context a11 = com.huawei.updatesdk.a.b.a.a.c().a();
        a(APIMETHOD);
        b("1.2");
        this.locale = com.huawei.updatesdk.a.a.d.i.c.k();
        h(com.huawei.updatesdk.a.a.d.i.c.g(a11));
        g(com.huawei.updatesdk.a.a.d.i.c.f(a11));
        a(com.huawei.updatesdk.a.a.d.i.c.j(a11) ? 1 : 0);
        f(com.huawei.updatesdk.a.b.a.a.c().a().getPackageName());
        g(com.huawei.updatesdk.b.b.a.d().a());
        f(com.huawei.updatesdk.a.a.d.i.c.f().a());
        c(com.huawei.updatesdk.a.a.d.i.c.f().b());
        this.deviceSpecParams_ = new b.C0451b(a11).a(true).a();
        this.hardwareType = com.huawei.updatesdk.a.a.d.i.c.e();
        this.harmonyDeviceType = com.huawei.updatesdk.a.a.d.e.b();
        d(com.huawei.updatesdk.a.a.d.i.c.f().c());
    }

    public static d a(List<PackageInfo> list) {
        d dVar = new d();
        a aVar = new a();
        dVar.a(aVar);
        ArrayList arrayList = new ArrayList();
        aVar.a(arrayList);
        Iterator<PackageInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Param(it.next()));
        }
        return dVar;
    }

    public void b(int i11) {
        this.installCheck_ = i11;
    }

    public void c(int i11) {
        this.mapleVer_ = i11;
    }

    public void d(int i11) {
        this.pcEmulator = i11;
    }

    public void e(int i11) {
        this.serviceType = i11;
    }

    public void f(int i11) {
        this.supportMaple_ = i11;
    }

    public void g(int i11) {
        this.versionCode_ = i11;
    }

    public void h(String str) {
        this.version_ = str;
    }

    public d(List<Param> list) {
        this();
        a aVar = new a();
        aVar.a(list);
        a(aVar);
    }

    public void a(int i11) {
        this.gmsSupport_ = i11;
    }

    public void d(String str) {
        this.agVersion_ = str;
    }

    public void e(String str) {
        this.cno = str;
    }

    public void f(String str) {
        this.packageName_ = str;
    }

    public void g(String str) {
        this.serviceCountry_ = str;
    }

    public void a(a aVar) {
        this.pkgInfo_ = aVar;
    }
}
