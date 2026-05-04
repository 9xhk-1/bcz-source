package com.igexin.push.f.b;

import com.igexin.push.d.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38563a = 20160629;

    /* renamed from: b, reason: collision with root package name */
    public static final long f38564b = 604800000;

    /* renamed from: c, reason: collision with root package name */
    private static final String f38565c = "PollingTimerTask";

    /* renamed from: e, reason: collision with root package name */
    private long f38566e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f38567f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f38568a = new d();

        private a() {
        }
    }

    public d() {
        super(604800000L, (byte) 0);
        this.f38566e = com.igexin.push.config.d.f37605y;
        this.f38567f = new AtomicBoolean(false);
        this.f37227p = true;
    }

    private void a(long j11) {
        a(j11, TimeUnit.MILLISECONDS);
    }

    private static d q() {
        return a.f38568a;
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return f38563a;
    }

    public final void g() {
        if (!this.f38567f.getAndSet(true)) {
            com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) this, false, true);
        }
        a(this.f38566e);
    }

    @Override // com.igexin.push.f.b.f
    public final void h() {
        com.igexin.push.d.b bVar;
        a(this.f38566e, TimeUnit.MILLISECONDS);
        if (!com.igexin.push.core.e.f38044u && com.igexin.push.core.e.f38037n && com.igexin.push.core.e.f38039p && com.igexin.push.core.e.f38042s && com.igexin.push.g.c.a()) {
            com.igexin.c.a.c.a.a("PollingTimerTask|run = true", new Object[0]);
            com.igexin.push.d.c cVar = c.b.f38428a;
            if (cVar.f38397b && (bVar = cVar.f38400e) != null && !(bVar instanceof com.igexin.push.d.d)) {
                cVar.f38400e = new com.igexin.push.d.d();
            }
            com.igexin.push.core.e.b(100L);
            e.g().a(com.igexin.push.core.e.O);
        }
    }

    public final void i() {
        a(604800000L, TimeUnit.MILLISECONDS);
    }
}
