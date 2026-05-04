package com.mob.secverify.pure.core;

import android.util.SparseArray;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.e.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference<SparseArray<b>> f40780a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public static AtomicBoolean f40781b = new AtomicBoolean(false);

    public static void b() {
        f40781b.set(false);
        new Thread() { // from class: com.mob.secverify.pure.core.d.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                HashMap hashMap;
                try {
                    try {
                        hashMap = f.a().e();
                    } catch (VerifyException unused) {
                        hashMap = f.a().d();
                    }
                } catch (VerifyException unused2) {
                    d.f40781b.set(true);
                    hashMap = null;
                }
                d.b(hashMap);
            }
        }.start();
    }

    private static void c(HashMap hashMap) {
        SparseArray<b> sparseArray = new SparseArray<>();
        HashMap hashMap2 = (HashMap) hashMap.get("cmccLogin");
        if (hashMap2 != null) {
            sparseArray.append(1, new b(1, String.valueOf(hashMap2.get("clientId")), String.valueOf(hashMap2.get("clientSecret")), false));
        }
        HashMap hashMap3 = (HashMap) hashMap.get("cuccLogin");
        if (hashMap3 != null) {
            sparseArray.append(2, new b(2, String.valueOf(hashMap3.get("clientId")), String.valueOf(hashMap3.get("clientSecret")), false));
        }
        HashMap hashMap4 = (HashMap) hashMap.get("woCuccLogin");
        if (hashMap4 != null) {
            sparseArray.append(3, new b(3, String.valueOf(hashMap4.get("clientId")), String.valueOf(hashMap4.get("clientSecret")), true));
        }
        HashMap hashMap5 = (HashMap) hashMap.get("ctccLogin");
        if (hashMap5 != null) {
            sparseArray.append(4, new b(4, String.valueOf(hashMap5.get("clientId")), String.valueOf(hashMap5.get("clientSecret")), false));
        }
        b.a(sparseArray);
        f40780a.set(sparseArray);
        c.a(sparseArray);
    }

    private static void d(HashMap hashMap) {
        String str;
        String str2;
        Object obj = hashMap.get("cacheType");
        int intValue = obj != null ? ((Integer) obj).intValue() : -1;
        a.a().a(intValue);
        g.b(intValue);
        Object obj2 = hashMap.get("cacheUrl");
        if (obj2 != null) {
            str = (String) obj2;
        } else {
            str = com.mob.secverify.c.c.a(2) + "api/usedMobile";
        }
        a.a().a(str);
        g.e(str);
        Object obj3 = hashMap.get("cdnKey");
        String f11 = obj3 != null ? (String) obj3 : com.mob.secverify.pure.b.c.a().f();
        com.mob.secverify.pure.b.c.a().a(f11);
        g.c(f11);
        Object obj4 = hashMap.get("logUrl");
        if (obj4 != null) {
            str2 = (String) obj4;
        } else {
            str2 = com.mob.secverify.c.c.a(4) + "api/log";
        }
        com.mob.secverify.pure.b.c.a().b(str2);
        g.d(str2);
        Object obj5 = hashMap.get("useWocucc");
        boolean booleanValue = obj5 != null ? ((Boolean) obj5).booleanValue() : false;
        com.mob.secverify.pure.b.c.a().a(booleanValue);
        g.a(booleanValue);
        HashMap hashMap2 = (HashMap) hashMap.get("clientConfig");
        if (hashMap2 == null || hashMap2.isEmpty()) {
            return;
        }
        Object obj6 = hashMap2.get("oppoNet");
        int intValue2 = obj6 != null ? ((Integer) obj6).intValue() : 0;
        com.mob.secverify.pure.b.c.a().a(intValue2);
        g.a(intValue2);
        Object obj7 = hashMap2.get("autoPre");
        boolean booleanValue2 = obj7 != null ? ((Boolean) obj7).booleanValue() : false;
        com.mob.secverify.pure.b.c.a().b(booleanValue2);
        g.b(booleanValue2);
        ArrayList arrayList = (ArrayList) hashMap2.get("notUpload");
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.mob.secverify.pure.b.c.a().a(arrayList);
        g.a((ArrayList<String>) arrayList);
    }

    public static void a() {
        new Thread() { // from class: com.mob.secverify.pure.core.d.1
            /* JADX WARN: Removed duplicated region for block: B:7:0x004c A[Catch: all -> 0x001d, TryCatch #4 {all -> 0x001d, blocks: (B:3:0x0008, B:5:0x0010, B:7:0x004c, B:9:0x005c, B:17:0x0022, B:20:0x002a, B:25:0x003f), top: B:2:0x0008 }] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r11 = this;
                    com.mob.secverify.b.b r1 = new com.mob.secverify.b.b
                    com.mob.secverify.b.d r0 = com.mob.secverify.b.d.INIT
                    r1.<init>(r0)
                    r9 = 0
                    com.mob.secverify.pure.core.f r0 = com.mob.secverify.pure.core.f.a()     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L21
                    java.util.HashMap r0 = r0.e()     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L21
                    java.lang.String r2 = "init"
                    java.lang.String r8 = ""
                    r3 = 1
                    r4 = 1
                    r5 = 1
                    r6 = 0
                    r7 = 1
                    r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L1f
                    goto L4a
                L1d:
                    r0 = move-exception
                    goto L6b
                L1f:
                    r2 = r0
                    goto L22
                L21:
                    r2 = r9
                L22:
                    com.mob.secverify.pure.core.f r0 = com.mob.secverify.pure.core.f.a()     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L3c
                    java.util.HashMap r10 = r0.d()     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L3c
                    java.lang.String r2 = "init"
                    java.lang.String r8 = ""
                    r3 = 1
                    r4 = 0
                    r5 = 1
                    r6 = 0
                    r7 = 1
                    r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1d com.mob.secverify.common.exception.VerifyException -> L38
                    r0 = r10
                    goto L4a
                L38:
                    r0 = move-exception
                    r6 = r0
                    r0 = r10
                    goto L3f
                L3c:
                    r0 = move-exception
                    r6 = r0
                    r0 = r2
                L3f:
                    java.lang.String r2 = "init"
                    java.lang.String r8 = ""
                    r3 = 0
                    r4 = 0
                    r5 = 1
                    r7 = 1
                    r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1d
                L4a:
                    if (r0 == 0) goto L63
                    com.mob.secverify.pure.core.d.a(r0)     // Catch: java.lang.Throwable -> L1d
                    com.mob.secverify.e.f.a()     // Catch: java.lang.Throwable -> L1d
                    com.mob.secverify.pure.b.c r0 = com.mob.secverify.pure.b.c.a()     // Catch: java.lang.Throwable -> L1d
                    boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L1d
                    if (r0 == 0) goto L63
                    com.mob.secverify.pure.core.e r0 = com.mob.secverify.pure.core.e.a()     // Catch: java.lang.Throwable -> L1d
                    r0.a(r9)     // Catch: java.lang.Throwable -> L1d
                L63:
                    com.mob.secverify.pure.core.f r0 = com.mob.secverify.pure.core.f.a()
                    r0.c()
                    goto L87
                L6b:
                    java.lang.String r0 = com.mob.secverify.e.h.a(r0)     // Catch: java.lang.Throwable -> L88
                    com.mob.secverify.common.exception.VerifyException r6 = new com.mob.secverify.common.exception.VerifyException     // Catch: java.lang.Throwable -> L88
                    com.mob.secverify.common.exception.VerifyErr r2 = com.mob.secverify.common.exception.VerifyErr.C_INIT_UNEXPECTED_ERROR     // Catch: java.lang.Throwable -> L88
                    java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L88
                    r3.<init>(r0)     // Catch: java.lang.Throwable -> L88
                    r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L88
                    java.lang.String r2 = "init"
                    java.lang.String r8 = ""
                    r3 = 0
                    r4 = 0
                    r5 = 1
                    r7 = 1
                    r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L88
                    goto L63
                L87:
                    return
                L88:
                    r0 = move-exception
                    com.mob.secverify.pure.core.f r1 = com.mob.secverify.pure.core.f.a()
                    r1.c()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.d.AnonymousClass1.run():void");
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        d(hashMap);
        c(hashMap);
    }
}
