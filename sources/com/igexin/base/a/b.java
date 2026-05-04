package com.igexin.base.a;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private static b f37045b;

    /* renamed from: a, reason: collision with root package name */
    final List<c> f37046a = new ArrayList();

    private b() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(this, 5L, 5L, TimeUnit.SECONDS);
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f37045b == null) {
                    f37045b = new b();
                }
                bVar = f37045b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (c cVar : this.f37046a) {
            if (cVar.isEnabled() && (cVar.f37047a.size() >= cVar.f37048b || SystemClock.elapsedRealtime() - cVar.f37050d >= cVar.f37049c)) {
                a(cVar);
                cVar.f37050d = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020f A[Catch: all -> 0x021b, TRY_ENTER, TryCatch #11 {all -> 0x021b, blocks: (B:33:0x020f, B:35:0x0215, B:128:0x0222, B:130:0x0228, B:131:0x022b), top: B:26:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Type inference failed for: r0v36, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.igexin.base.a.c r25) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.base.a.b.a(com.igexin.base.a.c):boolean");
    }
}
