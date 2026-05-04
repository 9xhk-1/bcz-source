package com.alipay.sdk.m.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.m.u.e;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final String f11030g = "alipay_tid_storage";

    /* renamed from: h, reason: collision with root package name */
    public static final String f11031h = "tidinfo";

    /* renamed from: i, reason: collision with root package name */
    public static final String f11032i = "tid";

    /* renamed from: j, reason: collision with root package name */
    public static final String f11033j = "client_key";

    /* renamed from: k, reason: collision with root package name */
    public static final String f11034k = "timestamp";

    /* renamed from: l, reason: collision with root package name */
    public static final String f11035l = "vimei";

    /* renamed from: m, reason: collision with root package name */
    public static final String f11036m = "vimsi";

    /* renamed from: n, reason: collision with root package name */
    public static Context f11037n;

    /* renamed from: o, reason: collision with root package name */
    public static a f11038o;

    /* renamed from: a, reason: collision with root package name */
    public String f11039a;

    /* renamed from: b, reason: collision with root package name */
    public String f11040b;

    /* renamed from: c, reason: collision with root package name */
    public long f11041c;

    /* renamed from: d, reason: collision with root package name */
    public String f11042d;

    /* renamed from: e, reason: collision with root package name */
    public String f11043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11044f = false;

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f11038o == null) {
                    f11038o = new a();
                }
                if (f11037n == null) {
                    f11038o.b(context);
                }
                aVar = f11038o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void b(Context context) {
        if (context != null) {
            f11037n = context.getApplicationContext();
        }
        if (this.f11044f) {
            return;
        }
        this.f11044f = true;
        l();
    }

    private String k() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            java.lang.String r3 = "alipay_tid_storage"
            java.lang.String r4 = "tidinfo"
            r5 = 1
            java.lang.String r3 = com.alipay.sdk.m.t.a.C0176a.a(r3, r4, r5)     // Catch: java.lang.Exception -> L51
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L51
            if (r4 != 0) goto L55
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L51
            r4.<init>(r3)     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = "tid"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = "client_key"
            java.lang.String r5 = r4.optString(r5, r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r6 = "timestamp"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4a
            long r6 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L4a
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L4a
            java.lang.String r6 = "vimei"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L4a
            java.lang.String r7 = "vimsi"
            java.lang.String r2 = r4.optString(r7, r0)     // Catch: java.lang.Exception -> L48
        L45:
            r0 = r2
            r2 = r3
            goto L5d
        L48:
            r0 = move-exception
            goto L59
        L4a:
            r0 = move-exception
            r6 = r2
            goto L59
        L4d:
            r0 = move-exception
            r5 = r2
        L4f:
            r6 = r5
            goto L59
        L51:
            r0 = move-exception
            r3 = r2
            r5 = r3
            goto L4f
        L55:
            r0 = r2
            r5 = r0
            r6 = r5
            goto L5d
        L59:
            com.alipay.sdk.m.u.e.a(r0)
            goto L45
        L5d:
            java.lang.String r3 = "mspl"
            java.lang.String r4 = "tid_str: load"
            com.alipay.sdk.m.u.e.b(r3, r4)
            boolean r3 = r9.a(r2, r5, r6, r0)
            if (r3 == 0) goto L6e
            r9.m()
            goto L7c
        L6e:
            r9.f11039a = r2
            r9.f11040b = r5
            long r1 = r1.longValue()
            r9.f11041c = r1
            r9.f11042d = r6
            r9.f11043e = r0
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.t.a.l():void");
    }

    private void m() {
        this.f11039a = "";
        this.f11040b = b();
        this.f11041c = System.currentTimeMillis();
        this.f11042d = k();
        this.f11043e = k();
        C0176a.b(f11030g, f11031h);
    }

    private void n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f11039a);
            jSONObject.put(f11033j, this.f11040b);
            jSONObject.put(f11034k, this.f11041c);
            jSONObject.put(f11035l, this.f11042d);
            jSONObject.put(f11036m, this.f11043e);
            C0176a.a(f11030g, f11031h, jSONObject.toString(), true);
        } catch (Exception e11) {
            e.a(e11);
        }
    }

    public String c() {
        return this.f11040b;
    }

    public String d() {
        return this.f11039a;
    }

    public Long e() {
        return Long.valueOf(this.f11041c);
    }

    public String f() {
        return this.f11042d;
    }

    public String g() {
        return this.f11043e;
    }

    public boolean h() {
        return i();
    }

    public boolean i() {
        return TextUtils.isEmpty(this.f11039a) || TextUtils.isEmpty(this.f11040b) || TextUtils.isEmpty(this.f11042d) || TextUtils.isEmpty(this.f11043e);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.t.a$a, reason: collision with other inner class name */
    public static class C0176a {
        public static boolean a(String str, String str2) {
            if (a.f11037n == null) {
                return false;
            }
            return a.f11037n.getSharedPreferences(str, 0).contains(str2);
        }

        public static void b(String str, String str2) {
            if (a.f11037n == null) {
                return;
            }
            a.f11037n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static boolean c(String str, String str2) {
            if (a.f11037n == null) {
                return false;
            }
            return a.f11037n.getSharedPreferences(str, 0).contains(str2);
        }

        public static String d(String str, String str2) {
            return a(str, str2, true);
        }

        public static String a(String str, String str2, boolean z11) {
            if (a.f11037n == null) {
                return null;
            }
            String string = a.f11037n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z11) {
                string = com.alipay.sdk.m.n.e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    e.b(com.alipay.sdk.m.l.a.A, "tid_str: pref failed");
                }
            }
            e.b(com.alipay.sdk.m.l.a.A, "tid_str: from local");
            return string;
        }

        public static void a(String str, String str2, String str3) {
            a(str, str2, str3, true);
        }

        public static void a(String str, String str2, String str3, boolean z11) {
            if (a.f11037n == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.f11037n.getSharedPreferences(str, 0);
            if (z11) {
                String a11 = a();
                String b11 = com.alipay.sdk.m.n.e.b(a11, str3, str3);
                if (TextUtils.isEmpty(b11)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, a11);
                }
                str3 = b11;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static String a() {
            String str;
            try {
                str = a.f11037n.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                e.a(th2);
                str = "";
            }
            return (str + "0000000000000000000000000000").substring(0, 24);
        }
    }

    public String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    private boolean a(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public void a() {
        e.b(com.alipay.sdk.m.l.a.A, "tid_str: del");
        m();
    }

    public void a(String str, String str2) {
        e.b(com.alipay.sdk.m.l.a.A, "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f11039a = str;
        this.f11040b = str2;
        this.f11041c = System.currentTimeMillis();
        n();
        o();
    }

    private void a(String str, String str2, String str3, String str4, Long l11) {
        if (a(str, str2, str3, str4)) {
            return;
        }
        this.f11039a = str;
        this.f11040b = str2;
        this.f11042d = str3;
        this.f11043e = str4;
        if (l11 == null) {
            this.f11041c = System.currentTimeMillis();
        } else {
            this.f11041c = l11.longValue();
        }
        n();
    }

    private void o() {
    }
}
