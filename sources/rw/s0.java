package rw;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nHttpRequestRetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n1#2:410\n*E\n"})
/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public x00.q<? super z0, ? super cx.w, ? super ex.c, Boolean> f84756a;

    /* renamed from: b, reason: collision with root package name */
    public x00.q<? super z0, ? super cx.y, ? super Throwable, Boolean> f84757b;

    /* renamed from: c, reason: collision with root package name */
    public x00.p<? super w0, ? super Integer, Long> f84758c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public x00.p<? super y0, ? super cx.y, g2> f84759d = new x00.p() { // from class: rw.n0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 z11;
            z11 = s0.z((y0) obj, (cx.y) obj2);
            return z11;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public x00.p<? super Long, ? super j00.c<? super g2>, ? extends Object> f84760e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public int f84761f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<Long, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84762a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ long f84763b;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f84763b = ((Number) obj).longValue();
            return aVar;
        }

        public final Object i(long j11, j00.c<? super g2> cVar) {
            return ((a) create(Long.valueOf(j11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Long l11, j00.c<? super g2> cVar) {
            return i(l11.longValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84762a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f84763b;
                this.f84762a = 1;
                if (c40.a1.b(j11, this) == l11) {
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

    public s0() {
        L(3);
        q(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public static final boolean B(z0 z0Var, cx.w wVar, ex.c cVar) {
        kotlin.jvm.internal.g0.p(z0Var, "<this>");
        kotlin.jvm.internal.g0.p(wVar, "<unused var>");
        kotlin.jvm.internal.g0.p(cVar, "<unused var>");
        return false;
    }

    public static final boolean C(z0 z0Var, cx.y yVar, Throwable th2) {
        kotlin.jvm.internal.g0.p(z0Var, "<this>");
        kotlin.jvm.internal.g0.p(yVar, "<unused var>");
        kotlin.jvm.internal.g0.p(th2, "<unused var>");
        return false;
    }

    public static /* synthetic */ void F(s0 s0Var, int i11, x00.q qVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        s0Var.E(i11, qVar);
    }

    public static /* synthetic */ void H(s0 s0Var, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        s0Var.G(i11, z11);
    }

    public static final boolean I(boolean z11, z0 retryOnExceptionIf, cx.y yVar, Throwable cause) {
        boolean u11;
        kotlin.jvm.internal.g0.p(retryOnExceptionIf, "$this$retryOnExceptionIf");
        kotlin.jvm.internal.g0.p(yVar, "<unused var>");
        kotlin.jvm.internal.g0.p(cause, "cause");
        u11 = v0.u(cause);
        return u11 ? z11 : !(cause instanceof CancellationException);
    }

    public static /* synthetic */ void K(s0 s0Var, int i11, x00.q qVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        s0Var.J(i11, qVar);
    }

    public static /* synthetic */ void M(s0 s0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        s0Var.L(i11);
    }

    public static /* synthetic */ void O(s0 s0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        s0Var.N(i11);
    }

    public static final boolean P(z0 retryIf, cx.w wVar, ex.c response) {
        kotlin.jvm.internal.g0.p(retryIf, "$this$retryIf");
        kotlin.jvm.internal.g0.p(wVar, "<unused var>");
        kotlin.jvm.internal.g0.p(response, "response");
        int p02 = response.i().p0();
        return 500 <= p02 && p02 < 600;
    }

    public static /* synthetic */ void j(s0 s0Var, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 1000;
        }
        if ((i11 & 2) != 0) {
            j12 = 1000;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        s0Var.i(j11, j12, z11);
    }

    public static final long k(long j11, s0 s0Var, long j12, w0 delayMillis, int i11) {
        kotlin.jvm.internal.g0.p(delayMillis, "$this$delayMillis");
        return j11 + s0Var.D(j12);
    }

    public static /* synthetic */ void n(s0 s0Var, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        s0Var.m(z11, pVar);
    }

    public static final long o(boolean z11, x00.p pVar, w0 w0Var, int i11) {
        ix.q0 a11;
        String str;
        Long r12;
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        if (!z11) {
            return ((Number) pVar.invoke(w0Var, Integer.valueOf(i11))).longValue();
        }
        ex.c c11 = w0Var.c();
        Long valueOf = (c11 == null || (a11 = c11.a()) == null || (str = a11.get(ix.y0.f63006a.r0())) == null || (r12 = u30.e0.r1(str)) == null) ? null : Long.valueOf(r12.longValue() * 1000);
        return Math.max(((Number) pVar.invoke(w0Var, Integer.valueOf(i11))).longValue(), valueOf != null ? valueOf.longValue() : 0L);
    }

    public static /* synthetic */ void q(s0 s0Var, double d11, long j11, long j12, long j13, boolean z11, int i11, Object obj) {
        s0Var.p((i11 & 1) != 0 ? 2.0d : d11, (i11 & 2) != 0 ? 1000L : j11, (i11 & 4) != 0 ? 60000L : j12, (i11 & 8) == 0 ? j13 : 1000L, (i11 & 16) != 0 ? true : z11);
    }

    public static final long r(double d11, long j11, long j12, s0 s0Var, long j13, w0 delayMillis, int i11) {
        kotlin.jvm.internal.g0.p(delayMillis, "$this$delayMillis");
        return Math.min((long) (Math.pow(d11, i11 - 1) * j11), j12) + s0Var.D(j13);
    }

    public static final g2 z(y0 y0Var, cx.y it) {
        kotlin.jvm.internal.g0.p(y0Var, "<this>");
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public final void A() {
        this.f84761f = 0;
        U(new x00.q() { // from class: rw.l0
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean B;
                B = s0.B((z0) obj, (cx.w) obj2, (ex.c) obj3);
                return Boolean.valueOf(B);
            }
        });
        V(new x00.q() { // from class: rw.m0
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean C;
                C = s0.C((z0) obj, (cx.y) obj2, (Throwable) obj3);
                return Boolean.valueOf(C);
            }
        });
    }

    public final long D(long j11) {
        if (j11 == 0) {
            return 0L;
        }
        return Random.Default.nextLong(j11);
    }

    public final void E(int i11, @m80.k x00.q<? super z0, ? super cx.w, ? super ex.c, Boolean> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        if (i11 != -1) {
            this.f84761f = i11;
        }
        U(block);
    }

    public final void G(int i11, final boolean z11) {
        J(i11, new x00.q() { // from class: rw.k0
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean I;
                I = s0.I(z11, (z0) obj, (cx.y) obj2, (Throwable) obj3);
                return Boolean.valueOf(I);
            }
        });
    }

    public final void J(int i11, @m80.k x00.q<? super z0, ? super cx.y, ? super Throwable, Boolean> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        if (i11 != -1) {
            this.f84761f = i11;
        }
        V(block);
    }

    public final void L(int i11) {
        N(i11);
        H(this, i11, false, 2, null);
    }

    public final void N(int i11) {
        E(i11, new x00.q() { // from class: rw.r0
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean P;
                P = s0.P((z0) obj, (cx.w) obj2, (ex.c) obj3);
                return Boolean.valueOf(P);
            }
        });
    }

    public final void Q(@m80.k x00.p<? super Long, ? super j00.c<? super g2>, ? extends Object> pVar) {
        kotlin.jvm.internal.g0.p(pVar, "<set-?>");
        this.f84760e = pVar;
    }

    public final void R(@m80.k x00.p<? super w0, ? super Integer, Long> pVar) {
        kotlin.jvm.internal.g0.p(pVar, "<set-?>");
        this.f84758c = pVar;
    }

    public final void S(int i11) {
        this.f84761f = i11;
    }

    public final void T(@m80.k x00.p<? super y0, ? super cx.y, g2> pVar) {
        kotlin.jvm.internal.g0.p(pVar, "<set-?>");
        this.f84759d = pVar;
    }

    public final void U(@m80.k x00.q<? super z0, ? super cx.w, ? super ex.c, Boolean> qVar) {
        kotlin.jvm.internal.g0.p(qVar, "<set-?>");
        this.f84756a = qVar;
    }

    public final void V(@m80.k x00.q<? super z0, ? super cx.y, ? super Throwable, Boolean> qVar) {
        kotlin.jvm.internal.g0.p(qVar, "<set-?>");
        this.f84757b = qVar;
    }

    public final void i(final long j11, final long j12, boolean z11) {
        if (j11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j12 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        m(z11, new x00.p() { // from class: rw.o0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                long k11;
                k11 = s0.k(j11, this, j12, (w0) obj, ((Integer) obj2).intValue());
                return Long.valueOf(k11);
            }
        });
    }

    public final void l(@m80.k x00.p<? super Long, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84760e = block;
    }

    public final void m(final boolean z11, @m80.k final x00.p<? super w0, ? super Integer, Long> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        R(new x00.p() { // from class: rw.p0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                long o11;
                o11 = s0.o(z11, block, (w0) obj, ((Integer) obj2).intValue());
                return Long.valueOf(o11);
            }
        });
    }

    public final void p(final double d11, final long j11, final long j12, final long j13, boolean z11) {
        if (d11 <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (j11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j12 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j13 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        m(z11, new x00.p() { // from class: rw.q0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                long r11;
                r11 = s0.r(d11, j11, j12, this, j13, (w0) obj, ((Integer) obj2).intValue());
                return Long.valueOf(r11);
            }
        });
    }

    @m80.k
    public final x00.p<Long, j00.c<? super g2>, Object> s() {
        return this.f84760e;
    }

    @m80.k
    public final x00.p<w0, Integer, Long> t() {
        x00.p pVar = this.f84758c;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.g0.S("delayMillis");
        return null;
    }

    public final int u() {
        return this.f84761f;
    }

    @m80.k
    public final x00.p<y0, cx.y, g2> v() {
        return this.f84759d;
    }

    @m80.k
    public final x00.q<z0, cx.w, ex.c, Boolean> w() {
        x00.q qVar = this.f84756a;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.g0.S("shouldRetry");
        return null;
    }

    @m80.k
    public final x00.q<z0, cx.y, Throwable, Boolean> x() {
        x00.q qVar = this.f84757b;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.g0.S("shouldRetryOnException");
        return null;
    }

    public final void y(@m80.k x00.p<? super y0, ? super cx.y, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f84759d = block;
    }
}
