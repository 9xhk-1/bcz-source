package com.huawei.hms.hatool;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    private s0 f35860a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f35861b;

    /* renamed from: c, reason: collision with root package name */
    private s0 f35862c;

    /* renamed from: d, reason: collision with root package name */
    private s0 f35863d;

    public l1(String str) {
    }

    public s0 a() {
        return this.f35862c;
    }

    public s0 b() {
        return this.f35860a;
    }

    public s0 c() {
        return this.f35861b;
    }

    public s0 d() {
        return this.f35863d;
    }

    public s0 a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        v.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void b(s0 s0Var) {
        this.f35861b = s0Var;
    }

    public void a(s0 s0Var) {
        this.f35860a = s0Var;
    }
}
