package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bg extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public bf f42463a;

    /* renamed from: g, reason: collision with root package name */
    private a f42469g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42465c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42466d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42467e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f42468f = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42464b = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
    }

    public final boolean a() {
        this.f42465c = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e11) {
            al.b(e11);
        }
        al.d("MainHandlerChecker is reset to null.", new Object[0]);
        this.f42463a = null;
        return true;
    }

    public final boolean b() {
        Handler handler = new Handler(Looper.getMainLooper());
        bf bfVar = this.f42463a;
        if (bfVar != null) {
            bfVar.f42457b = 5000L;
        } else {
            this.f42463a = new bf(handler, handler.getLooper().getThread().getName());
        }
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e11) {
            al.b(e11);
            return false;
        }
    }

    public final synchronized void c() {
        this.f42466d = false;
        al.c("Record stack trace is disabled.", new Object[0]);
    }

    public final synchronized void d() {
        this.f42467e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        r2.d();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
        L4:
            boolean r2 = r8.f42465c
            if (r2 != 0) goto L9d
            com.tencent.bugly.proguard.bf r2 = r8.f42463a     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r3 = 0
            if (r2 != 0) goto L1c
            java.lang.String r2 = "Main handler checker is null. Stop thread monitor."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            goto L9d
        L16:
            r2 = move-exception
            goto L93
        L19:
            r2 = move-exception
            goto L98
        L1c:
            boolean r4 = r2.f42458c     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 == 0) goto L2d
            r2.f42458c = r3     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r2.f42459d = r4     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            android.os.Handler r4 = r2.f42456a     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r4.post(r2)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L2d:
            r8.a(r2)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            boolean r4 = r8.f42464b     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 == 0) goto L72
            boolean r4 = r8.f42466d     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r4 != 0) goto L39
            goto L72
        L39:
            long r4 = r2.b()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r6 = 1510(0x5e6, double:7.46E-321)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L72
            r6 = 199990(0x30d36, double:9.8808E-319)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L4b
            goto L72
        L4b:
            r6 = 5010(0x1392, double:2.4753E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 > 0) goto L5d
            r8.f42468f = r5     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            java.lang.String r4 = "timeSinceMsgSent in [2s, 5s], record stack"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r4, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L5b:
            r3 = r5
            goto L72
        L5d:
            int r4 = r8.f42468f     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            int r6 = r4 + 1
            r8.f42468f = r6     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r4 = r4 & r6
            if (r4 != 0) goto L67
            goto L68
        L67:
            r5 = r3
        L68:
            if (r5 == 0) goto L5b
            java.lang.String r4 = "timeSinceMsgSent in (5s, 200s), should record stack:true"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            com.tencent.bugly.proguard.al.c(r4, r3)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            goto L5b
        L72:
            if (r3 == 0) goto L77
            r2.d()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L77:
            com.tencent.bugly.proguard.bg$a r3 = r8.f42469g     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r3 == 0) goto L85
            boolean r3 = r8.f42466d     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            if (r3 == 0) goto L85
            r2.a()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            r2.b()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
        L85:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            long r2 = r2 - r0
            r4 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 % r4
            long r4 = r4 - r2
            com.tencent.bugly.proguard.ap.b(r4)     // Catch: java.lang.OutOfMemoryError -> L16 java.lang.Exception -> L19
            goto L4
        L93:
            com.tencent.bugly.proguard.al.b(r2)
            goto L4
        L98:
            com.tencent.bugly.proguard.al.b(r2)
            goto L4
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.bg.run():void");
    }

    private synchronized void a(bf bfVar) {
        if (this.f42466d) {
            return;
        }
        if (this.f42467e && !bfVar.a()) {
            al.c("Restart getting main stack trace.", new Object[0]);
            this.f42466d = true;
            this.f42467e = false;
        }
    }
}
