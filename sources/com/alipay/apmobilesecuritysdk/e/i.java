package com.alipay.apmobilesecuritysdk.e;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static String f10367a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f10368b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f10369c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f10370d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f10371e = "";

    /* renamed from: f, reason: collision with root package name */
    public static Map<String, String> f10372f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f10372f.containsKey(str2)) {
                String str3 = f10372f.get(str2);
                if (com.alipay.sdk.m.z.a.b(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f10367a;
        }
        return str;
    }

    public static synchronized String c() {
        String str;
        synchronized (i.class) {
            str = f10368b;
        }
        return str;
    }

    public static synchronized String d() {
        String str;
        synchronized (i.class) {
            str = f10370d;
        }
        return str;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = f10371e;
        }
        return str;
    }

    public static synchronized String f() {
        String str;
        synchronized (i.class) {
            str = f10369c;
        }
        return str;
    }

    public static synchronized c g() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f10367a, f10368b, f10369c, f10370d, f10371e);
        }
        return cVar;
    }

    public static void h() {
        f10372f.clear();
        f10367a = "";
        f10368b = "";
        f10370d = "";
        f10371e = "";
        f10369c = "";
    }

    public static synchronized void a() {
        synchronized (i.class) {
        }
    }

    public static void b(String str) {
        f10367a = str;
    }

    public static void c(String str) {
        f10368b = str;
    }

    public static void d(String str) {
        f10369c = str;
    }

    public static void e(String str) {
        f10370d = str;
    }

    public static void f(String str) {
        f10371e = str;
    }

    public static synchronized void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                f10367a = bVar.f10353a;
                f10368b = bVar.f10354b;
                f10369c = bVar.f10355c;
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                f10367a = cVar.f10356a;
                f10368b = cVar.f10357b;
                f10370d = cVar.f10359d;
                f10371e = cVar.f10360e;
                f10369c = cVar.f10358c;
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            try {
                String str3 = "apdidTokenCache" + str;
                if (f10372f.containsKey(str3)) {
                    f10372f.remove(str3);
                }
                f10372f.put(str3, str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r1 < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r0 = com.alipay.apmobilesecuritysdk.e.i.class
            monitor-enter(r0)
            long r1 = com.alipay.apmobilesecuritysdk.e.h.a(r5)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
        Ld:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
        L10:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L24
            long r5 = com.alipay.apmobilesecuritysdk.e.h.h(r5, r6)     // Catch: java.lang.Throwable -> L24
            long r3 = r3 - r5
            long r5 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L24
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L28
            monitor-exit(r0)
            r5 = 1
            return r5
        L24:
            r5 = move-exception
            com.alipay.apmobilesecuritysdk.c.a.a(r5)     // Catch: java.lang.Throwable -> L2b
        L28:
            monitor-exit(r0)
            r5 = 0
            return r5
        L2b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.e.i.a(android.content.Context, java.lang.String):boolean");
    }
}
