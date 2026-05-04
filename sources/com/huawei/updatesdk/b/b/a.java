package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f36873e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile a f36874f;

    /* renamed from: a, reason: collision with root package name */
    private final b f36875a;

    /* renamed from: b, reason: collision with root package name */
    private String f36876b;

    /* renamed from: c, reason: collision with root package name */
    private String f36877c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36878d = false;

    private a(Context context) {
        this.f36875a = b.a("DeviceSessionUpdateSDK_V1", context);
    }

    public static a d() {
        if (f36874f == null) {
            synchronized (f36873e) {
                try {
                    if (f36874f == null) {
                        f36874f = new a(com.huawei.updatesdk.a.b.a.a.c().a());
                    }
                } finally {
                }
            }
        }
        return f36874f;
    }

    public String a() {
        return this.f36876b;
    }

    public long b() {
        return this.f36875a.a("updatesdk.lastCheckDate", 0L);
    }

    public void c() {
        if (this.f36878d) {
            return;
        }
        b("updatesdk.sign.param");
        b("updatesdk.signkey");
        b("updatesdk.signtime");
        b("updatesdk.lastInitAccountTime" + this.f36877c);
        b("updatesdk.lastAccountZone" + this.f36877c);
        this.f36878d = true;
    }

    public String a(String str) {
        return TextUtils.isEmpty(str) ? "" : this.f36875a.a(str, "");
    }

    public void b(String str) {
        this.f36875a.a(str);
    }

    public void c(String str) {
        this.f36876b = str;
    }

    public void d(String str) {
        this.f36877c = str;
    }

    public void a(long j11) {
        this.f36875a.b("updatesdk.lastCheckDate", j11);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36875a.b(str, str2);
    }
}
