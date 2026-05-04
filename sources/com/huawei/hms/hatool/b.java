package com.huawei.hms.hatool;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    s0 f35755a;

    /* renamed from: b, reason: collision with root package name */
    s0 f35756b;

    /* renamed from: c, reason: collision with root package name */
    Context f35757c;

    /* renamed from: d, reason: collision with root package name */
    String f35758d;

    public b(Context context) {
        if (context != null) {
            this.f35757c = context.getApplicationContext();
        }
        this.f35755a = new s0();
        this.f35756b = new s0();
    }

    public b a(int i11, String str) {
        v.c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i11);
        if (!p1.b(str)) {
            str = "";
        }
        if (i11 == 0) {
            this.f35755a.b(str);
            return this;
        }
        if (i11 != 1) {
            v.f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        }
        this.f35756b.b(str);
        return this;
    }

    @Deprecated
    public b b(boolean z11) {
        v.c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f35755a.j().b(z11);
        this.f35756b.j().b(z11);
        return this;
    }

    @Deprecated
    public b c(boolean z11) {
        v.c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f35755a.j().c(z11);
        this.f35756b.j().c(z11);
        return this;
    }

    public b a(String str) {
        v.c("hmsSdk", "Builder.setAppID is execute");
        this.f35758d = str;
        return this;
    }

    @Deprecated
    public b a(boolean z11) {
        v.c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f35755a.j().a(z11);
        this.f35756b.j().a(z11);
        return this;
    }

    public void a() {
        if (this.f35757c == null) {
            v.b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        v.c("hmsSdk", "Builder.create() is execute.");
        z0 z0Var = new z0("_hms_config_tag");
        z0Var.b(new s0(this.f35755a));
        z0Var.a(new s0(this.f35756b));
        m.a().a(this.f35757c);
        g0.a().a(this.f35757c);
        q.c().a(z0Var);
        m.a().a(this.f35758d);
    }
}
