package com.huawei.hms.hatool;

import com.heytap.mcssdk.constant.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m1 {

    /* renamed from: b, reason: collision with root package name */
    private static m1 f35869b = new m1();

    /* renamed from: a, reason: collision with root package name */
    private a f35870a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f35871a;

        /* renamed from: b, reason: collision with root package name */
        String f35872b;

        /* renamed from: c, reason: collision with root package name */
        long f35873c = 0;

        public a() {
        }

        public void a(long j11) {
            m1.this.f35870a.f35873c = j11;
        }

        public void b(String str) {
            m1.this.f35870a.f35871a = str;
        }

        public void a(String str) {
            m1.this.f35870a.f35872b = str;
        }
    }

    public static m1 d() {
        return f35869b;
    }

    public long b() {
        return this.f35870a.f35873c;
    }

    public String c() {
        return this.f35870a.f35871a;
    }

    public String a() {
        return this.f35870a.f35872b;
    }

    public void a(String str, String str2) {
        long b11 = b();
        String c11 = w0.c(str, str2);
        if (c11 == null || c11.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b11 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String e11 = ur.c.e(16);
            String a11 = h0.a(c11, e11);
            this.f35870a.a(currentTimeMillis);
            this.f35870a.b(e11);
            this.f35870a.a(a11);
            return;
        }
        if (System.currentTimeMillis() - b11 > Constants.MILLS_OF_LAUNCH_INTERVAL) {
            String e12 = ur.c.e(16);
            String a12 = h0.a(c11, e12);
            this.f35870a.a(b11);
            this.f35870a.b(e12);
            this.f35870a.a(a12);
        }
    }
}
