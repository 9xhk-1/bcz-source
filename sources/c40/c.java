package c40;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public static b f7825a;

    @o00.f
    public static final long c() {
        b bVar = f7825a;
        return bVar != null ? bVar.a() : System.currentTimeMillis();
    }

    public static final void d(@m80.l b bVar) {
        f7825a = bVar;
    }

    @o00.f
    public static final long e() {
        b bVar = f7825a;
        return bVar != null ? bVar.b() : System.nanoTime();
    }

    @o00.f
    public static final void f(Object obj, long j11) {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.c(obj, j11);
        } else {
            LockSupport.parkNanos(obj, j11);
        }
    }

    @o00.f
    public static final void g() {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.d();
        }
    }

    @o00.f
    public static final void h() {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @o00.f
    public static final void i() {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.f();
        }
    }

    @o00.f
    public static final void j(Thread thread) {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.g(thread);
        } else {
            LockSupport.unpark(thread);
        }
    }

    @o00.f
    public static final void k() {
        b bVar = f7825a;
        if (bVar != null) {
            bVar.h();
        }
    }

    @o00.f
    public static final Runnable l(Runnable runnable) {
        Runnable i11;
        b bVar = f7825a;
        return (bVar == null || (i11 = bVar.i(runnable)) == null) ? runnable : i11;
    }
}
