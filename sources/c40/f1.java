package c40;

import kotlin.Result;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n184#1,17:238\n1#2:221\n236#3:222\n237#3,2:233\n239#3:237\n103#4,10:223\n114#4,2:235\n57#5,2:255\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n174#1:238,17\n162#1:222\n162#1:233,2\n162#1:237\n162#1:223,10\n162#1:235,2\n204#1:255,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7852b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7853c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7854d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7855e = -1;

    public static final <T> void a(@m80.k e1<? super T> e1Var, int i11) {
        j00.c<? super T> d11 = e1Var.d();
        boolean z11 = i11 == 4;
        if (z11 || !(d11 instanceof h40.l) || c(i11) != c(e1Var.f7841c)) {
            e(e1Var, d11, z11);
            return;
        }
        h40.l lVar = (h40.l) d11;
        m0 m0Var = lVar.f58240d;
        kotlin.coroutines.d context = lVar.getContext();
        if (h40.m.f(m0Var, context)) {
            h40.m.e(m0Var, context, e1Var);
        } else {
            f(e1Var);
        }
    }

    public static final boolean c(int i11) {
        return i11 == 1 || i11 == 2;
    }

    public static final boolean d(int i11) {
        return i11 == 2;
    }

    public static final <T> void e(@m80.k e1<? super T> e1Var, @m80.k j00.c<? super T> cVar, boolean z11) {
        Object g11;
        Object i11 = e1Var.i();
        Throwable f11 = e1Var.f(i11);
        if (f11 != null) {
            Result.a aVar = Result.Companion;
            g11 = kotlin.e.a(f11);
        } else {
            Result.a aVar2 = Result.Companion;
            g11 = e1Var.g(i11);
        }
        Object m6308constructorimpl = Result.m6308constructorimpl(g11);
        if (!z11) {
            cVar.resumeWith(m6308constructorimpl);
            return;
        }
        kotlin.jvm.internal.g0.n(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        h40.l lVar = (h40.l) cVar;
        j00.c<T> cVar2 = lVar.f58241e;
        Object obj = lVar.f58243g;
        kotlin.coroutines.d context = cVar2.getContext();
        Object i12 = h40.g1.i(context, obj);
        x3<?> m11 = i12 != h40.g1.f58220a ? k0.m(cVar2, context, i12) : null;
        try {
            lVar.f58241e.resumeWith(m6308constructorimpl);
            yz.g2 g2Var = yz.g2.f100423a;
            if (m11 == null || m11.f2()) {
                h40.g1.f(context, i12);
            }
        } catch (Throwable th2) {
            if (m11 == null || m11.f2()) {
                h40.g1.f(context, i12);
            }
            throw th2;
        }
    }

    public static final void f(e1<?> e1Var) {
        o1 b11 = o3.f7899a.b();
        if (b11.d0()) {
            b11.H(e1Var);
            return;
        }
        b11.L(true);
        try {
            e(e1Var, e1Var.d(), true);
            do {
            } while (b11.i0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@m80.k j00.c<?> cVar, @m80.k Throwable th2) {
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(th2)));
    }

    public static final void h(@m80.k e1<?> e1Var, @m80.k o1 o1Var, @m80.k x00.a<yz.g2> aVar) {
        o1Var.L(true);
        try {
            aVar.invoke();
            do {
            } while (o1Var.i0());
            kotlin.jvm.internal.d0.d(1);
        } catch (Throwable th2) {
            try {
                e1Var.h(th2);
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.d0.d(1);
                o1Var.q(true);
                kotlin.jvm.internal.d0.c(1);
                throw th3;
            }
        }
        o1Var.q(true);
        kotlin.jvm.internal.d0.c(1);
    }

    @yz.v0
    public static /* synthetic */ void b() {
    }
}
