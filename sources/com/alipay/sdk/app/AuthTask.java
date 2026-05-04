package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.u.l;
import com.alipay.sdk.m.u.n;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AuthTask {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10400c = h.class;

    /* renamed from: a, reason: collision with root package name */
    public Activity f10401a;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.m.x.a f10402b;

    public AuthTask(Activity activity) {
        this.f10401a = activity;
        b.d().a(this.f10401a);
        this.f10402b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.f11148k);
    }

    private h.g b() {
        return new a();
    }

    private void c() {
        com.alipay.sdk.m.x.a aVar = this.f10402b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public synchronized String auth(String str, boolean z11) {
        return innerAuth(new com.alipay.sdk.m.s.a(this.f10401a, str, com.alipay.sdk.m.k.b.f10657n), str, z11);
    }

    public synchronized Map<String, String> authV2(String str, boolean z11) {
        com.alipay.sdk.m.s.a aVar;
        aVar = new com.alipay.sdk.m.s.a(this.f10401a, str, "authV2");
        return l.a(aVar, innerAuth(aVar, str, z11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c5, code lost:
    
        com.alipay.sdk.m.m.a.D().a(r7, r6.f10401a, false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (com.alipay.sdk.m.m.a.D().s() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006f, code lost:
    
        if (com.alipay.sdk.m.m.a.D().s() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ce, code lost:
    
        a();
        com.alipay.sdk.m.k.a.b(r6.f10401a, r7, r8, r7.f11016d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String innerAuth(com.alipay.sdk.m.s.a r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(com.alipay.sdk.m.s.a, java.lang.String, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.alipay.sdk.m.x.a aVar = this.f10402b;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(android.app.Activity r4, java.lang.String r5, com.alipay.sdk.m.s.a r6) {
        /*
            r3 = this;
            r3.c()
            r0 = 0
            com.alipay.sdk.m.q.a r1 = new com.alipay.sdk.m.q.a     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            com.alipay.sdk.m.p.b r4 = r1.a(r6, r4, r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            org.json.JSONObject r4 = r4.c()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r5 = "form"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r5 = "onload"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.util.List r4 = com.alipay.sdk.m.r.b.a(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r3.a()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r5 = 0
        L25:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            if (r5 >= r1) goto L4e
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            com.alipay.sdk.m.r.b r1 = (com.alipay.sdk.m.r.b) r1     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            com.alipay.sdk.m.r.a r1 = r1.a()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            com.alipay.sdk.m.r.a r2 = com.alipay.sdk.m.r.a.WapPay     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            if (r1 != r2) goto L4b
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            com.alipay.sdk.m.r.b r4 = (com.alipay.sdk.m.r.b) r4     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            java.lang.String r4 = r3.a(r6, r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r3.a()
            return r4
        L47:
            r4 = move-exception
            goto L52
        L49:
            r4 = move-exception
            goto L5c
        L4b:
            int r5 = r5 + 1
            goto L25
        L4e:
            r3.a()
            goto L6e
        L52:
            java.lang.String r5 = "biz"
            java.lang.String r1 = "H5AuthDataAnalysisError"
            com.alipay.sdk.m.k.a.a(r6, r5, r1, r4)     // Catch: java.lang.Throwable -> L5a
            goto L6b
        L5a:
            r4 = move-exception
            goto L89
        L5c:
            com.alipay.sdk.m.j.c r5 = com.alipay.sdk.m.j.c.NETWORK_ERROR     // Catch: java.lang.Throwable -> L5a
            int r5 = r5.b()     // Catch: java.lang.Throwable -> L5a
            com.alipay.sdk.m.j.c r0 = com.alipay.sdk.m.j.c.b(r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "net"
            com.alipay.sdk.m.k.a.a(r6, r5, r4)     // Catch: java.lang.Throwable -> L5a
        L6b:
            r3.a()
        L6e:
            if (r0 != 0) goto L7a
            com.alipay.sdk.m.j.c r4 = com.alipay.sdk.m.j.c.FAILED
            int r4 = r4.b()
            com.alipay.sdk.m.j.c r0 = com.alipay.sdk.m.j.c.b(r4)
        L7a:
            int r4 = r0.b()
            java.lang.String r5 = r0.a()
            java.lang.String r6 = ""
            java.lang.String r4 = com.alipay.sdk.m.j.b.a(r4, r5, r6)
            return r4
        L89:
            r3.a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.b(android.app.Activity, java.lang.String, com.alipay.sdk.m.s.a):java.lang.String");
    }

    private String a(Activity activity, String str, com.alipay.sdk.m.s.a aVar) {
        String a11 = aVar.a(str);
        List<a.b> l11 = com.alipay.sdk.m.m.a.D().l();
        if (!com.alipay.sdk.m.m.a.D().f10810h || l11 == null) {
            l11 = com.alipay.sdk.m.j.a.f10605d;
        }
        if (n.a(aVar, (Context) this.f10401a, l11, true)) {
            h hVar = new h(activity, aVar, b());
            String a12 = hVar.a(a11, false);
            hVar.a();
            if (!TextUtils.equals(a12, "failed") && !TextUtils.equals(a12, h.f11075k)) {
                return TextUtils.isEmpty(a12) ? com.alipay.sdk.m.j.b.a() : a12;
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10649i0);
            return b(activity, a11, aVar);
        }
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10650j0);
        return b(activity, a11, aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements h.g {
        public a() {
        }

        @Override // com.alipay.sdk.m.u.h.g
        public void a() {
            AuthTask.this.a();
        }

        @Override // com.alipay.sdk.m.u.h.g
        public void b() {
        }
    }

    private String a(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.r.b bVar) {
        String[] c11 = bVar.c();
        Bundle bundle = new Bundle();
        bundle.putString("url", c11[0]);
        Intent intent = new Intent(this.f10401a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C0175a.a(aVar, intent);
        this.f10401a.startActivity(intent);
        Object obj = f10400c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String d11 = com.alipay.sdk.m.j.b.d();
        return TextUtils.isEmpty(d11) ? com.alipay.sdk.m.j.b.a() : d11;
    }
}
