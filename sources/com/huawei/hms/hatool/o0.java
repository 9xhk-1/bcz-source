package com.huawei.hms.hatool;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class o0 {

    /* renamed from: c, reason: collision with root package name */
    private static o0 f35878c;

    /* renamed from: a, reason: collision with root package name */
    private String f35879a;

    /* renamed from: b, reason: collision with root package name */
    private String f35880b;

    private String b(String str) {
        return f() ? rr.b.g("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a11 = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a11)) {
            return a(a11);
        }
        String e11 = ur.c.e(16);
        c(b(e11));
        return e11;
    }

    public static o0 d() {
        if (f35878c == null) {
            g();
        }
        return f35878c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.f35880b)) {
            this.f35880b = new x().a();
        }
        return this.f35880b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (f35878c == null) {
                f35878c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f35879a)) {
            this.f35879a = c();
        }
        return this.f35879a;
    }

    private String a(String str) {
        String d11 = f() ? rr.b.d("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(d11)) {
            return d11;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String a11 = n.a(str, e());
        if (!TextUtils.isEmpty(a11)) {
            if (f()) {
                c(b(a11));
                x.c();
            }
            return a11;
        }
        String e11 = ur.c.e(16);
        c(b(e11));
        if (f()) {
            x.c();
        }
        return e11;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public void b() {
        String e11 = ur.c.e(16);
        if (c(b(e11))) {
            this.f35879a = e11;
        }
    }
}
