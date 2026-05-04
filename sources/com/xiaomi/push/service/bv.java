package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.am;
import com.xiaomi.push.dv;
import com.xiaomi.push.dw;
import com.xiaomi.push.gy;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class bv {

    /* renamed from: a, reason: collision with root package name */
    private static bv f46341a = new bv();

    /* renamed from: a, reason: collision with other field name */
    private static String f982a;

    /* renamed from: a, reason: collision with other field name */
    private am.b f983a;

    /* renamed from: a, reason: collision with other field name */
    private dv.a f984a;

    /* renamed from: a, reason: collision with other field name */
    private List<a> f985a = new ArrayList();

    public static abstract class a {
        public void a(dv.a aVar) {
        }

        public void a(dw.b bVar) {
        }
    }

    private bv() {
    }

    private void b() {
        if (this.f984a == null) {
            d();
        }
    }

    private void c() {
        if (this.f983a != null) {
            return;
        }
        bw bwVar = new bw(this);
        this.f983a = bwVar;
        gy.a(bwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.s.m6183a()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            com.xiaomi.push.b r0 = com.xiaomi.push.b.a(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            com.xiaomi.push.dv$a r0 = com.xiaomi.push.dv.a.b(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r4.f984a = r0     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            r2.close()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
        L1d:
            com.xiaomi.push.y.a(r2)
            goto L45
        L21:
            r0 = move-exception
            goto L51
        L23:
            r0 = move-exception
            goto L2c
        L25:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L51
        L29:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "load config failure: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L21
            r1.append(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L21
            com.xiaomi.channel.commonutils.logger.b.m5639a(r0)     // Catch: java.lang.Throwable -> L21
            goto L1d
        L45:
            com.xiaomi.push.dv$a r0 = r4.f984a
            if (r0 != 0) goto L50
            com.xiaomi.push.dv$a r0 = new com.xiaomi.push.dv$a
            r0.<init>()
            r4.f984a = r0
        L50:
            return
        L51:
            com.xiaomi.push.y.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bv.d():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f984a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(com.xiaomi.push.s.m6183a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.c a11 = com.xiaomi.push.c.a(bufferedOutputStream);
                this.f984a.a(a11);
                a11.m5768a();
                bufferedOutputStream.close();
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("save config failure: " + e11.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m6268a() {
        b();
        dv.a aVar = this.f984a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public dv.a m6269a() {
        b();
        return this.f984a;
    }

    public static bv a() {
        return f46341a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized String m6265a() {
        String str;
        synchronized (bv.class) {
            try {
                if (f982a == null) {
                    SharedPreferences sharedPreferences = com.xiaomi.push.s.m6183a().getSharedPreferences("XMPushServiceConfig", 0);
                    String string = sharedPreferences.getString("DeviceUUID", null);
                    f982a = string;
                    if (string == null) {
                        String a11 = com.xiaomi.push.i.a(com.xiaomi.push.s.m6183a(), false);
                        f982a = a11;
                        if (a11 != null) {
                            sharedPreferences.edit().putString("DeviceUUID", f982a).commit();
                        }
                    }
                }
                str = f982a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6270a() {
        this.f985a.clear();
    }

    public void a(dw.b bVar) {
        a[] aVarArr;
        if (bVar.m5853d() && bVar.d() > m6268a()) {
            c();
        }
        synchronized (this) {
            List<a> list = this.f985a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    public synchronized void a(a aVar) {
        this.f985a.add(aVar);
    }
}
