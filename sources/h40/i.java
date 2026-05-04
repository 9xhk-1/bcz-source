package h40;

import java.util.Collection;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Collection<c40.n0> f58228a = q30.k0.I3(q30.x.j(ServiceLoader.load(c40.n0.class, c40.n0.class.getClassLoader()).iterator()));

    public static final void a(@m80.k c40.n0 n0Var) {
        if (!f58228a.contains(n0Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @m80.k
    public static final Collection<c40.n0> b() {
        return f58228a;
    }

    public static final void c(@m80.k Throwable th2) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
