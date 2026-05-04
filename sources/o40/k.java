package o40;

import a00.x1;
import c40.l2;
import c40.l3;
import c40.x0;
import c40.y1;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.test.UncompletedCoroutinesError;
import o40.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1", f = "TestBuildersDeprecated.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75758a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<d0, j00.c<? super g2>, Object> f75759b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f75760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar, d0 d0Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f75759b = pVar;
            this.f75760c = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f75759b, this.f75760c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75758a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.p<d0, j00.c<? super g2>, Object> pVar = this.f75759b;
                d0 d0Var = this.f75760c;
                this.f75758a = 1;
                if (pVar.invoke(d0Var, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1", f = "TestBuildersDeprecated.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<q0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75761a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<n0, j00.c<? super g2>, Object> f75762b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0 f75763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar, q0 q0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f75762b = pVar;
            this.f75763c = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f75762b, this.f75763c, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q0 q0Var, j00.c<? super g2> cVar) {
            return ((b) create(q0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75761a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.p<n0, j00.c<? super g2>, Object> pVar = this.f75762b;
                q0 q0Var = this.f75763c;
                this.f75761a = 1;
                if (pVar.invoke(q0Var, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1", f = "TestBuildersDeprecated.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75764a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75765b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f75766c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f75767d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.p<d0, j00.c<? super g2>, Object> f75768e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<g, Throwable> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f75769a = new a();

            public a() {
                super(1, g.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Throwable invoke(g gVar) {
                return gVar.g2();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(g gVar, long j11, x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f75766c = gVar;
            this.f75767d = j11;
            this.f75768e = pVar;
        }

        public static final List j(g gVar) {
            try {
                gVar.e2();
                return a00.h0.J();
            } catch (UncompletedCoroutinesError e11) {
                throw e11;
            } catch (Throwable th2) {
                return a00.g0.l(th2);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f75766c, this.f75767d, this.f75768e, cVar);
            cVar2.f75765b = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75764a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.r0 r0Var = (c40.r0) this.f75765b;
                g gVar = this.f75766c;
                e.a aVar = kotlin.time.e.f67757b;
                long x11 = kotlin.time.f.x(this.f75767d, DurationUnit.MILLISECONDS);
                a aVar2 = a.f75769a;
                x00.p<d0, j00.c<? super g2>, Object> pVar = this.f75768e;
                final g gVar2 = this.f75766c;
                x00.a aVar3 = new x00.a() { // from class: o40.l
                    @Override // x00.a
                    public final Object invoke() {
                        List j11;
                        j11 = k.c.j(g.this);
                        return j11;
                    }
                };
                this.f75764a = 1;
                if (i.r(r0Var, gVar, x11, aVar2, pVar, aVar3, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void b(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        x0 b11;
        d0 g11 = h0.g(new u(null, 1, null).plus(l3.c(null, 1, null)).plus(dVar));
        b0 I = g11.I();
        b11 = c40.k.b(g11, null, null, new a(pVar, g11, null), 3, null);
        I.U();
        Throwable v02 = b11.v0();
        if (v02 != null) {
            throw v02;
        }
        g11.F0();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void c(@m80.k u uVar, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        i.a(uVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers. Please see the migration guide for details: https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/MIGRATION.md")
    public static final void d(@m80.k d0 d0Var, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        i.a(d0Var.getCoroutineContext(), pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void e(@m80.k n0 n0Var, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        i.f(n0Var.getCoroutineContext(), pVar);
    }

    public static /* synthetic */ void f(kotlin.coroutines.d dVar, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        i.a(dVar, pVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead to support completing from other dispatchers.")
    public static final void g(@m80.k kotlin.coroutines.d dVar, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        Throwable th2;
        List<Throwable> J;
        kotlin.coroutines.d plus = new u(null, 1, null).plus(l3.c(null, 1, null)).plus(dVar);
        Set<l2> d11 = h0.d(plus);
        q0 f11 = r0.f(r0.a(plus));
        f11.h2();
        f11.d2(CoroutineStart.UNDISPATCHED, f11, new b(pVar, f11, null));
        f11.I().U();
        try {
            th2 = f11.v0();
        } catch (IllegalStateException unused) {
            th2 = null;
        }
        c40.s0.f(f11.f0(), null, 1, null);
        f11.I().d0(new x00.a() { // from class: o40.j
            @Override // x00.a
            public final Object invoke() {
                boolean i11;
                i11 = k.i();
                return Boolean.valueOf(i11);
            }
        });
        if (th2 != null) {
            try {
                J = f11.j2();
            } catch (UncompletedCoroutinesError unused2) {
                J = a00.h0.J();
            }
            i.u(th2, J);
            return;
        }
        i.u(null, f11.j2());
        Set x11 = x1.x(h0.d(plus), d11);
        if (x11.isEmpty()) {
            return;
        }
        throw new UncompletedCoroutinesError("Some jobs were not completed at the end of the test: " + x11);
    }

    public static /* synthetic */ void h(kotlin.coroutines.d dVar, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        i.f(dVar, pVar);
    }

    public static final boolean i() {
        return false;
    }

    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Use `TestScope.runTest` instead.")
    public static final void j(@m80.k d0 d0Var, long j11, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        i.s(d0Var.getCoroutineContext(), j11, pVar);
    }

    public static /* synthetic */ void k(d0 d0Var, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 60000;
        }
        i.i(d0Var, j11, pVar);
    }

    @y1
    @yz.n(level = DeprecationLevel.ERROR, message = "Use `runTest` instead.")
    public static final void l(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super d0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        d dVar2 = d.f75734a;
        if (dVar.get(dVar2) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        h.b(new c(new g(h0.g(dVar.plus(dVar2))), j11, pVar, null));
    }

    public static /* synthetic */ void m(kotlin.coroutines.d dVar, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = 60000;
        }
        i.s(dVar, j11, pVar);
    }
}
