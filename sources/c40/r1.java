package c40;

import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r1 {
    @m80.k
    public static final o1 a() {
        return new h(Thread.currentThread());
    }

    @c1
    @g2
    @yz.v0
    public static final boolean b(@m80.k Thread thread) {
        if (thread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) thread).m();
        }
        return false;
    }

    public static final void c(@m80.k x00.a<yz.g2> aVar) {
        aVar.invoke();
    }

    @g2
    public static final long d() {
        o1 a11 = o3.f7899a.a();
        if (a11 != null) {
            return a11.h0();
        }
        return Long.MAX_VALUE;
    }

    @c1
    @g2
    @yz.v0
    public static final long e() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) currentThread).q();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + currentThread);
    }
}
