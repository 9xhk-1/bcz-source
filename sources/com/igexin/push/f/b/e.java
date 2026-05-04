package com.igexin.push.f.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.Constants;
import com.igexin.push.core.e.f.AnonymousClass13;
import com.igexin.push.core.k;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final int f38569b = -2147483641;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38570c = "RNTT";

    /* renamed from: e, reason: collision with root package name */
    private static e f38571e;

    /* renamed from: a, reason: collision with root package name */
    public long f38572a;

    /* renamed from: f, reason: collision with root package name */
    private long f38573f;

    private e() {
        super(com.igexin.push.config.c.f37548g, (byte) 0);
        this.f37227p = true;
        this.f38573f = System.currentTimeMillis();
        this.f38572a = SystemClock.elapsedRealtime();
    }

    public static synchronized e g() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f38571e == null) {
                    f38571e = new e();
                }
                eVar = f38571e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    private void i() {
        a(com.igexin.push.core.e.O);
    }

    public final void a(long j11) {
        com.igexin.c.a.c.a.a("RNTT|refreshDelayTime, delay = ".concat(String.valueOf(j11)), new Object[0]);
        a(j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return f38569b;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d_() {
        super.d_();
    }

    @Override // com.igexin.push.f.b.f
    public final void h() {
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.k();
        boolean a11 = com.igexin.push.g.c.a();
        com.igexin.push.core.e.f38037n = com.igexin.push.g.c.e();
        boolean z11 = com.igexin.push.core.e.f38044u;
        boolean z12 = com.igexin.push.core.e.f38039p;
        boolean z13 = com.igexin.push.core.e.f38042s;
        com.igexin.c.a.c.a.a("RNTT|networkAvailable = " + com.igexin.push.core.e.f38037n + "|,sdkOnline = " + com.igexin.push.core.e.f38044u + ", sdkOn= " + com.igexin.push.core.e.f38039p + ", pushOn =" + com.igexin.push.core.e.f38042s + ", blockEndTime= " + a11, new Object[0]);
        if (!com.igexin.push.core.e.f38037n || !com.igexin.push.core.e.f38039p || !com.igexin.push.core.e.f38042s || com.igexin.push.core.e.f38044u || !a11) {
            com.igexin.c.a.c.a.a("RNTT reconnect timer task stop, connect interval = 20min #######", new Object[0]);
            a(com.igexin.push.config.c.f37548g, TimeUnit.MILLISECONDS);
            return;
        }
        if (!com.igexin.push.g.c.f() && TextUtils.isEmpty(com.igexin.push.core.e.A)) {
            a(Constants.MILLS_OF_CONNECT_SUCCESS, TimeUnit.MILLISECONDS);
            com.igexin.c.a.c.a.a(f38570c, "date is error, set connect interval = 15min");
            com.igexin.c.a.c.a.a("RNTT|date is error, set connect interval = 15min", new Object[0]);
            return;
        }
        com.igexin.c.a.c.a.a("RNTT reconnect timer task isOnline = false, try login...", new Object[0]);
        if (System.currentTimeMillis() - this.f38573f < 2500) {
            com.igexin.push.core.e.f38041r++;
        }
        if (com.igexin.push.core.e.f38041r > 30 && Math.abs(SystemClock.elapsedRealtime() - this.f38572a) < 72000.0d) {
            com.igexin.push.core.e.f.a();
            String str = com.igexin.push.core.e.A;
            com.igexin.c.a.c.a.a(com.igexin.push.core.e.f.f38080a + "| found a duplicate cid " + com.igexin.push.core.e.A, new Object[0]);
            com.igexin.push.core.e.L = null;
            com.igexin.push.core.e.f.d();
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.core.e.f.a().new AnonymousClass13(com.igexin.push.core.e.L), false, true);
            com.igexin.push.core.e.f.a().b();
            com.igexin.push.core.e.f38041r = 0;
            g().f38572a = SystemClock.elapsedRealtime();
        }
        this.f38573f = System.currentTimeMillis();
        k.a();
        k.b();
        a(1800000L, TimeUnit.MILLISECONDS);
    }

    private void c(long j11) {
        this.f38572a = j11;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
    }
}
