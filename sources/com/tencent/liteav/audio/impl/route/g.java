package com.tencent.liteav.audio.impl.route;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f43069a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f43070a;

        /* renamed from: b, reason: collision with root package name */
        public f f43071b;
    }

    public synchronized a a(long j11) {
        a aVar;
        Iterator<a> it = this.f43069a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f43070a == j11) {
                break;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r3.f43069a.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            java.util.List<com.tencent.liteav.audio.impl.route.g$a> r1 = r3.f43069a     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1e
            if (r0 >= r1) goto L23
            java.util.List<com.tencent.liteav.audio.impl.route.g$a> r1 = r3.f43069a     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1e
            com.tencent.liteav.audio.impl.route.g$a r1 = (com.tencent.liteav.audio.impl.route.g.a) r1     // Catch: java.lang.Throwable -> L1e
            long r1 = r1.f43070a     // Catch: java.lang.Throwable -> L1e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L20
            java.util.List<com.tencent.liteav.audio.impl.route.g$a> r4 = r3.f43069a     // Catch: java.lang.Throwable -> L1e
            r4.remove(r0)     // Catch: java.lang.Throwable -> L1e
            goto L23
        L1e:
            r4 = move-exception
            goto L25
        L20:
            int r0 = r0 + 1
            goto L2
        L23:
            monitor-exit(r3)
            return
        L25:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.impl.route.g.b(long):void");
    }

    public synchronized void a(f fVar, long j11) {
        if (a(j11) != null) {
            return;
        }
        a aVar = new a();
        aVar.f43070a = j11;
        aVar.f43071b = fVar;
        this.f43069a.add(aVar);
    }

    public void a(Intent intent) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f43069a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f43071b.a(intent);
        }
    }
}
