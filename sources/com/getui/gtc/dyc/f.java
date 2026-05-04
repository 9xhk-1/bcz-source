package com.getui.gtc.dyc;

import com.getui.gtc.dyc.b.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final e f30004a;

    /* renamed from: c, reason: collision with root package name */
    private final g f30005c;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.getui.gtc.dyc.b.c> f30006d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f30007e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f30011a = new f();
    }

    private f() {
        this.f30004a = e.a();
        this.f30005c = g.a();
        this.f30006d = new ArrayList();
        this.f30007e = new ConcurrentHashMap();
    }

    public static f a() {
        return a.f30011a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:3:0x0001, B:5:0x000d, B:11:0x0025, B:14:0x0016), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> a(final com.getui.gtc.dyc.b.b r5) {
        /*
            r4 = this;
            r0 = 0
            com.getui.gtc.dyc.e r1 = r4.f30004a     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r5.b()     // Catch: java.lang.Throwable -> L14
            com.getui.gtc.dyc.h r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            boolean r2 = r4.a(r5, r1)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L22
            goto L16
        L14:
            r5 = move-exception
            goto L2a
        L16:
            com.getui.gtc.base.util.ScheduleQueue r2 = com.getui.gtc.base.util.ScheduleQueue.getInstance()     // Catch: java.lang.Throwable -> L14
            com.getui.gtc.dyc.f$1 r3 = new com.getui.gtc.dyc.f$1     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            r2.addSchedule(r3)     // Catch: java.lang.Throwable -> L14
        L22:
            if (r1 != 0) goto L25
            return r0
        L25:
            java.util.Map r5 = r1.f()     // Catch: java.lang.Throwable -> L14
            return r5
        L2a:
            com.getui.gtc.dyc.a.a.a.a(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dyc.f.a(com.getui.gtc.dyc.b.b):java.util.Map");
    }

    public Map<String, Map<String, String>> c() {
        HashMap<String, h> c11 = this.f30004a.c();
        if (c11 == null || c11.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, h> entry : c11.entrySet()) {
            h value = entry.getValue();
            if (value.f() != null) {
                hashMap.put(entry.getKey(), value.f());
            }
        }
        return hashMap;
    }

    public void c(com.getui.gtc.dyc.b.c cVar) {
        synchronized (this.f30006d) {
            this.f30006d.remove(cVar);
        }
    }

    public Map<String, String> a(String str) {
        h a11 = this.f30004a.a(str);
        if (a11 == null) {
            return null;
        }
        return a11.f();
    }

    public void a(com.getui.gtc.dyc.b.c cVar) {
        synchronized (this.f30006d) {
            try {
                if (!this.f30006d.contains(cVar)) {
                    this.f30006d.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, Map<String, String> map) {
        h a11 = this.f30004a.a(str);
        Map<String, String> f11 = a11.f();
        f11.clear();
        f11.putAll(map);
        this.f30004a.a(str, a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(b bVar, h hVar) {
        return (System.currentTimeMillis() - hVar.c() <= bVar.h() && bVar.g().equals(hVar.a()) && bVar.c().equals(hVar.e())) ? false : true;
    }
}
