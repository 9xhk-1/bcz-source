package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f36182a = {"url", "app", "cosa", "rp"};

    /* renamed from: b, reason: collision with root package name */
    public Context f36183b;

    /* renamed from: c, reason: collision with root package name */
    public k f36184c;

    public j(Context context, k kVar) {
        this.f36183b = context;
        this.f36184c = kVar;
    }

    public static boolean a(String str) {
        for (String str2 : f36182a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bd, code lost:
    
        if (com.huawei.hms.push.q.a(r6.f36183b, r6.f36184c.d(), r2).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8 A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x001c, B:17:0x00c4, B:20:0x00c8, B:22:0x00d3, B:23:0x00de, B:25:0x00d9, B:10:0x009a, B:12:0x00a2, B:33:0x007f, B:35:0x0086, B:27:0x0044, B:29:0x0059), top: B:2:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            java.lang.String r0 = "run into launchCosaApp"
            java.lang.String r1 = "PushSelfShowLog"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = "enter launchExistApp cosa, appPackageName ="
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = ",and msg.intentUri is "
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L98
            r0.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L98
            com.huawei.hms.support.log.HMSLog.i(r1, r0)     // Catch: java.lang.Exception -> L98
            android.content.Context r0 = r6.f36183b     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            android.content.Intent r0 = com.huawei.hms.push.q.b(r0, r2)     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L98
            r3 = 0
            if (r2 == 0) goto L9a
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = r2.n()     // Catch: java.lang.Exception -> L7e
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch: java.lang.Exception -> L7e
            r4 = 0
            r2.setSelector(r4)     // Catch: java.lang.Exception -> L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r4.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = "Intent.parseUri(msg.intentUri, 0), action:"
            r4.append(r5)     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r2.getAction()     // Catch: java.lang.Exception -> L7e
            r4.append(r5)     // Catch: java.lang.Exception -> L7e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L7e
            com.huawei.hms.support.log.HMSLog.i(r1, r4)     // Catch: java.lang.Exception -> L7e
            android.content.Context r4 = r6.f36183b     // Catch: java.lang.Exception -> L7e
            com.huawei.hms.push.k r5 = r6.f36184c     // Catch: java.lang.Exception -> L7e
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L7e
            java.lang.Boolean r4 = com.huawei.hms.push.q.a(r4, r5, r2)     // Catch: java.lang.Exception -> L7e
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Exception -> L7e
            if (r3 == 0) goto Lc0
        L7c:
            r0 = r2
            goto Lc0
        L7e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r4.<init>()     // Catch: java.lang.Exception -> L98
            java.lang.String r5 = "intentUri error."
            r4.append(r5)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L98
            r4.append(r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L98
            com.huawei.hms.support.log.HMSLog.w(r1, r2)     // Catch: java.lang.Exception -> L98
            goto Lc0
        L98:
            r0 = move-exception
            goto Le4
        L9a:
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto Lc0
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r4 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> L98
            r2.<init>(r4)     // Catch: java.lang.Exception -> L98
            android.content.Context r4 = r6.f36183b     // Catch: java.lang.Exception -> L98
            com.huawei.hms.push.k r5 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L98
            java.lang.Boolean r4 = com.huawei.hms.push.q.a(r4, r5, r2)     // Catch: java.lang.Exception -> L98
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L98
            if (r4 == 0) goto Lc0
            goto L7c
        Lc0:
            if (r0 != 0) goto Lc8
            java.lang.String r0 = "launchCosaApp,intent == null"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)     // Catch: java.lang.Exception -> L98
            goto Lfc
        Lc8:
            com.huawei.hms.push.k r2 = r6.f36184c     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r2.d()     // Catch: java.lang.Exception -> L98
            r0.setPackage(r2)     // Catch: java.lang.Exception -> L98
            if (r3 == 0) goto Ld9
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)     // Catch: java.lang.Exception -> L98
            goto Lde
        Ld9:
            r2 = 805437440(0x30020000, float:4.7293724E-10)
            r0.setFlags(r2)     // Catch: java.lang.Exception -> L98
        Lde:
            android.content.Context r2 = r6.f36183b     // Catch: java.lang.Exception -> L98
            r2.startActivity(r0)     // Catch: java.lang.Exception -> L98
            goto Lfc
        Le4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "launch Cosa App exception."
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r0)
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.push.j.b():void");
    }

    public void c() {
        k kVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f36183b == null || (kVar = this.f36184c) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(kVar.i())) {
            a();
            return;
        }
        if ("cosa".equals(this.f36184c.i())) {
            b();
            return;
        }
        if ("rp".equals(this.f36184c.i())) {
            HMSLog.w("PushSelfShowLog", this.f36184c.i() + " not support rich message.");
            return;
        }
        if ("url".equals(this.f36184c.i())) {
            HMSLog.w("PushSelfShowLog", this.f36184c.i() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", this.f36184c.i() + " is not exist in hShowType");
    }

    public final void a() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enter launchApp, appPackageName =");
            sb2.append(this.f36184c.d());
            HMSLog.i("PushSelfShowLog", sb2.toString());
            if (q.c(this.f36183b, this.f36184c.d())) {
                b();
            }
        } catch (Exception e11) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e11.toString());
        }
    }
}
