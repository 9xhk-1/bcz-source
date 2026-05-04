package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: l, reason: collision with root package name */
    private static final String f35673l = "c";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f35674a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35675b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f35676c;

    /* renamed from: d, reason: collision with root package name */
    private d f35677d;

    /* renamed from: i, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.g.j.c f35682i;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Future<d>> f35678e = new ConcurrentHashMap(16);

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f35679f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final JSONArray f35680g = new JSONArray();

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f35681h = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private String f35683j = "";

    /* renamed from: k, reason: collision with root package name */
    private long f35684k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f35682i = cVar;
        this.f35674a = cVar.b();
        this.f35675b = cVar.a();
        this.f35676c = aVar;
        b();
        c();
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.f35678e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                e = e11;
                str = f35673l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(f35673l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e12) {
                e = e12;
                str = f35673l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(f35673l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void c() {
        String grsParasKey = this.f35674a.getGrsParasKey(true, true, this.f35675b);
        this.f35683j = this.f35676c.a().a(grsParasKey + "ETag", "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.f.b a11 = com.huawei.hms.framework.network.grs.f.b.a(this.f35675b.getPackageName());
        com.huawei.hms.framework.network.grs.local.model.a a12 = a11 != null ? a11.a() : null;
        if (a12 == null) {
            return "";
        }
        String a13 = a12.a();
        Logger.v(f35673l, "get appName from local assets is{%s}", a13);
        return a13;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.f35681h.isEmpty()) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a11 = a(executorService, this.f35681h, str, cVar);
        Logger.i(f35673l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(a11 == null ? 0 : a11.b()));
        e.a(new ArrayList(this.f35679f), SystemClock.elapsedRealtime() - elapsedRealtime, this.f35680g, this.f35675b);
        this.f35679f.clear();
        return a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[LOOP:0: B:2:0x0004->B:13:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r12, java.util.List<java.lang.String> r13, java.lang.String r14, com.huawei.hms.framework.network.grs.e.c r15) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r5 = r1
        L4:
            int r0 = r13.size()
            if (r5 >= r0) goto L9a
            java.lang.Object r0 = r13.get(r5)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L86
            com.huawei.hms.framework.network.grs.g.a r3 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r7 = r11.f35675b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r9 = r11.f35674a
            r6 = r11
            r8 = r14
            r10 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Callable r14 = r3.g()
            java.util.concurrent.Future r14 = r12.submit(r14)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r15 = r6.f35678e
            r15.put(r4, r14)
            r15 = 1
            long r3 = r6.f35684k     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            java.lang.Object r14 = r14.get(r3, r0)     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            com.huawei.hms.framework.network.grs.g.d r14 = (com.huawei.hms.framework.network.grs.g.d) r14     // Catch: java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63 java.util.concurrent.TimeoutException -> L66 java.util.concurrent.CancellationException -> L7e
            if (r14 == 0) goto L5e
            boolean r0 = r14.o()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 != 0) goto L51
            boolean r0 = r14.m()     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            if (r0 == 0) goto L5e
            goto L51
        L4a:
            r0 = move-exception
            r2 = r14
            goto L6e
        L4d:
            r0 = move-exception
            r15 = r0
            r2 = r14
            goto L76
        L51:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f35673l     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            java.lang.String r2 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r2)     // Catch: java.lang.InterruptedException -> L4a java.util.concurrent.ExecutionException -> L4d java.util.concurrent.TimeoutException -> L5a java.util.concurrent.CancellationException -> L5c
            r2 = r14
            goto L8a
        L5a:
            r2 = r14
            goto L66
        L5c:
            r2 = r14
            goto L7e
        L5e:
            r2 = r14
        L5f:
            r15 = r1
            goto L8a
        L61:
            r0 = move-exception
            goto L6e
        L63:
            r0 = move-exception
            r15 = r0
            goto L76
        L66:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.f35673l
            java.lang.String r15 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r14, r15)
            goto L5f
        L6e:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.f35673l
            java.lang.String r3 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r14, r3, r0)
            goto L8a
        L76:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.f35673l
            java.lang.String r0 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r14, r0, r15)
            goto L5f
        L7e:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.g.c.f35673l
            java.lang.String r0 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r14, r0)
            goto L8a
        L86:
            r6 = r11
            r8 = r14
            r10 = r15
            goto L5f
        L8a:
            if (r15 == 0) goto L94
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.c.f35673l
            java.lang.String r13 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r12, r13)
            goto L9b
        L94:
            int r5 = r5 + 1
            r14 = r8
            r15 = r10
            goto L4
        L9a:
            r6 = r11
        L9b:
            com.huawei.hms.framework.network.grs.g.d r12 = r11.b(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d a11 = com.huawei.hms.framework.network.grs.g.i.a.a(this.f35675b);
        if (a11 == null) {
            Logger.w(f35673l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a11);
        List<String> a12 = a11.a();
        if (a12 == null || a12.size() <= 0) {
            Logger.v(f35673l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a12.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String b11 = a11.b();
        if (a12.size() > 0) {
            for (String str : a12) {
                if (str.startsWith("https://")) {
                    a(b11, str);
                } else {
                    Logger.w(f35673l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(f35673l, "request to GRS server url is {%s}", this.f35681h);
    }

    public String a() {
        return this.f35683j;
    }

    public synchronized void a(d dVar) {
        try {
            this.f35679f.add(dVar);
            d dVar2 = this.f35677d;
            if (dVar2 == null || (!dVar2.o() && !this.f35677d.m())) {
                if (dVar.n()) {
                    Logger.i(f35673l, "GRS server open 503 limiting strategy.");
                    com.huawei.hms.framework.network.grs.h.d.a(this.f35674a.getGrsParasKey(true, true, this.f35675b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (dVar.m()) {
                    Logger.i(f35673l, "GRS server open 304 Not Modified.");
                }
                if (!dVar.o() && !dVar.m()) {
                    Logger.v(f35673l, "grsResponseResult has exception so need return");
                    return;
                }
                this.f35677d = dVar;
                this.f35676c.a(this.f35674a, dVar, this.f35675b, this.f35682i);
                for (Map.Entry<String, Future<d>> entry : this.f35678e.entrySet()) {
                    if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                        Logger.i(f35673l, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.v(f35673l, "grsResponseResult is ok");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }

    private void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        String grsReqParamJoint = this.f35674a.getGrsReqParamJoint(false, false, d(), this.f35675b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb2.append("?");
            sb2.append(grsReqParamJoint);
        }
        this.f35681h.add(sb2.toString());
    }
}
