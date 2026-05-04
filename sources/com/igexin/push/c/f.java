package com.igexin.push.c;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class f extends com.igexin.push.f.b.f {

    /* renamed from: c, reason: collision with root package name */
    private static f f37478c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37479e;

    /* renamed from: b, reason: collision with root package name */
    private static final String f37477b = b.f37444a + f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f37476a = new AtomicBoolean(false);

    private f() {
        super(10L, (byte) 0);
        this.f37227p = true;
    }

    private void a(long j11) {
        a(j11, TimeUnit.MILLISECONDS);
    }

    public static synchronized f g() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f37478c == null) {
                    f37478c = new f();
                }
                fVar = f37478c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return 20150607;
    }

    @Override // com.igexin.push.f.b.f
    public final void h() {
        long j11 = b.f37446c;
        a(j11, TimeUnit.MILLISECONDS);
        if (this.f37479e) {
            String str = f37477b;
            com.igexin.c.a.c.a.a(str, "detect task already stop");
            com.igexin.c.a.c.a.a(str + "|detect task already stop", new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = f37477b;
        sb2.append(str2);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(j11 / 1000);
        sb2.append("s passed, do task method, start redect ~~~~");
        com.igexin.c.a.c.a.a(sb2.toString(), new Object[0]);
        boolean e11 = com.igexin.push.g.c.e();
        com.igexin.push.core.e.f38037n = e11;
        if (e11) {
            c.a().c();
            return;
        }
        com.igexin.c.a.c.a.a(str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (j11 / 1000) + "s passed, network is unavailable, stop ###", new Object[0]);
    }

    public final void i() {
        this.f37227p = false;
        this.f37479e = true;
        l();
    }
}
