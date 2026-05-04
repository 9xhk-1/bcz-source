package com.huawei.updatesdk.service.otaupdate;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static f f36990d = new f();

    /* renamed from: a, reason: collision with root package name */
    private String f36991a;

    /* renamed from: b, reason: collision with root package name */
    private String f36992b;

    /* renamed from: c, reason: collision with root package name */
    private String f36993c;

    private f() {
    }

    public static f e() {
        return f36990d;
    }

    public String a() {
        return !TextUtils.isEmpty(this.f36991a) ? this.f36991a : this.f36992b;
    }

    public String b() {
        return this.f36991a;
    }

    public String c() {
        return this.f36993c;
    }

    public boolean d() {
        String str = this.f36991a;
        if (str != null) {
            return str.equals(this.f36992b);
        }
        return true;
    }

    public void a(String str) {
        this.f36992b = str;
    }

    public void b(String str) {
        this.f36991a = str;
    }

    public void c(String str) {
        this.f36993c = str;
    }
}
