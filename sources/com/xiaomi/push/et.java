package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.XMJobService;

/* loaded from: classes8.dex */
public final class et {

    /* renamed from: a, reason: collision with other field name */
    private static a f359a;

    /* renamed from: a, reason: collision with other field name */
    private static final String f360a = XMJobService.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    private static int f45490a = 0;

    public interface a {
        void a();

        void a(boolean z11);

        /* renamed from: a, reason: collision with other method in class */
        boolean mo5928a();
    }

    public static synchronized void a() {
        synchronized (et.class) {
            if (f359a == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] stop alarm.");
            f359a.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r6.equals(com.xiaomi.push.s.a(r9, r5.name).getSuperclass().getCanonicalName()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r9) {
        /*
            java.lang.String r0 = "android.permission.BIND_JOB_SERVICE"
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r1 = "com.xiaomi.xmsf"
            java.lang.String r2 = r9.getPackageName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            com.xiaomi.push.eu r0 = new com.xiaomi.push.eu
            r0.<init>(r9)
        L17:
            com.xiaomi.push.et.f359a = r0
            return
        L1a:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r2 = 0
            java.lang.String r3 = r9.getPackageName()     // Catch: java.lang.Exception -> L7a
            r4 = 4
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch: java.lang.Exception -> L7a
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch: java.lang.Exception -> L7a
            if (r1 == 0) goto L93
            int r3 = r1.length     // Catch: java.lang.Exception -> L7a
            r4 = r2
        L2e:
            if (r2 >= r3) goto L5e
            r5 = r1[r2]     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r5.permission     // Catch: java.lang.Exception -> L60
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L60
            r7 = 1
            if (r6 == 0) goto L63
            java.lang.String r6 = com.xiaomi.push.et.f360a     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L60
            boolean r8 = r6.equals(r8)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L47
        L45:
            r4 = r7
            goto L5c
        L47:
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L5c
            java.lang.Class r8 = com.xiaomi.push.s.a(r9, r8)     // Catch: java.lang.Exception -> L5c
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Exception -> L5c
            java.lang.String r8 = r8.getCanonicalName()     // Catch: java.lang.Exception -> L5c
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L5c
            if (r6 == 0) goto L5c
            goto L45
        L5c:
            if (r4 != r7) goto L63
        L5e:
            r2 = r4
            goto L93
        L60:
            r1 = move-exception
            r2 = r4
            goto L7b
        L63:
            java.lang.String r6 = com.xiaomi.push.et.f360a     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = r5.name     // Catch: java.lang.Exception -> L60
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L60
            if (r6 == 0) goto L77
            java.lang.String r5 = r5.permission     // Catch: java.lang.Exception -> L60
            boolean r5 = r0.equals(r5)     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L77
            r2 = r7
            goto L93
        L77:
            int r2 = r2 + 1
            goto L2e
        L7a:
            r1 = move-exception
        L7b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "check service err : "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.m5639a(r1)
        L93:
            if (r2 != 0) goto Lc2
            boolean r1 = com.xiaomi.push.s.m6186a(r9)
            if (r1 != 0) goto L9c
            goto Lc2
        L9c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Should export service: "
            r1.append(r2)
            java.lang.String r2 = com.xiaomi.push.et.f360a
            r1.append(r2)
            java.lang.String r2 = " with permission "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in AndroidManifest.xml file"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        Lc2:
            com.xiaomi.push.eu r0 = new com.xiaomi.push.eu
            r0.<init>(r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.et.a(android.content.Context):void");
    }

    public static synchronized void a(Context context, int i11) {
        synchronized (et.class) {
            try {
                int i12 = f45490a;
                if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                    if (i11 == 2) {
                        f45490a = 2;
                    } else {
                        f45490a = 0;
                    }
                }
                int i13 = f45490a;
                if (i12 != i13 && i13 == 2) {
                    a();
                    f359a = new ew(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void a(boolean z11) {
        synchronized (et.class) {
            if (f359a == null) {
                com.xiaomi.channel.commonutils.logger.b.m5639a("timer is not initialized");
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] register alarm. (" + z11 + pn.j.f81007d);
            f359a.a(z11);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized boolean m5927a() {
        synchronized (et.class) {
            a aVar = f359a;
            if (aVar == null) {
                return false;
            }
            return aVar.mo5928a();
        }
    }
}
