package com.igexin.push.f.b;

import com.igexin.push.core.j;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38560a = -2147483642;

    /* renamed from: b, reason: collision with root package name */
    private static final String f38561b = "HeartBeatTimerTask";

    /* renamed from: c, reason: collision with root package name */
    private static b f38562c;

    public b() {
        super(j.a().b(), (byte) 0);
        this.f37227p = true;
    }

    public static b g() {
        if (f38562c == null) {
            f38562c = new b();
        }
        return f38562c;
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return f38560a;
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d_() {
        super.d_();
        if (this.f37224m) {
            return;
        }
        i();
    }

    @Override // com.igexin.push.f.b.f
    public final void h() {
        com.igexin.push.core.a.b.d();
        com.igexin.push.core.a.b.k();
        com.igexin.push.core.e.P = System.currentTimeMillis();
        if (!com.igexin.push.core.e.f38044u) {
            com.igexin.c.a.c.a.a("HeartBeatTimerTask doTaskMethod isOnline = false, refresh wait time !!!!!!", new Object[0]);
            i();
        } else {
            System.currentTimeMillis();
            com.igexin.c.a.c.a.a("heartbeatReq", new Object[0]);
            com.igexin.push.core.a.b.d();
            com.igexin.push.core.a.b.f();
        }
    }

    public final void i() {
        a(j.a().b(), TimeUnit.MILLISECONDS);
    }

    private static void q() {
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void d() {
    }
}
