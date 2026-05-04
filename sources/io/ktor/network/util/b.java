package io.ktor.network.util;

import c40.a1;
import c40.b4;
import c40.l2;
import c40.q0;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f61124a;

    /* renamed from: b, reason: collision with root package name */
    public final long f61125b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x00.a<Long> f61126c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r0 f61127d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<j00.c<? super g2>, Object> f61128e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public l2 f61129f;

    @k
    volatile /* synthetic */ int isStarted;

    @k
    volatile /* synthetic */ long lastActivityTime;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", i = {}, l = {55, 57, 58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61130a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61130a;
            if (i11 == 0) {
                e.n(obj);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.n(obj);
                        return g2.f100423a;
                    }
                    e.n(obj);
                    l lVar = b.this.f61128e;
                    this.f61130a = 3;
                    if (lVar.invoke(this) == l11) {
                        return l11;
                    }
                    return g2.f100423a;
                }
                e.n(obj);
            }
            while (true) {
                if (b.this.isStarted == 0) {
                    b bVar = b.this;
                    bVar.lastActivityTime = ((Number) bVar.f61126c.invoke()).longValue();
                }
                long longValue = (b.this.lastActivityTime + b.this.f61125b) - ((Number) b.this.f61126c.invoke()).longValue();
                if (longValue > 0 || b.this.isStarted == 0) {
                    this.f61130a = 1;
                    if (a1.b(longValue, this) == l11) {
                        break;
                    }
                } else {
                    this.f61130a = 2;
                    if (b4.a(this) == l11) {
                    }
                }
            }
            return l11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String name, long j11, @k x00.a<Long> clock, @k r0 scope, @k l<? super j00.c<? super g2>, ? extends Object> onTimeout) {
        g0.p(name, "name");
        g0.p(clock, "clock");
        g0.p(scope, "scope");
        g0.p(onTimeout, "onTimeout");
        this.f61124a = name;
        this.f61125b = j11;
        this.f61126c = clock;
        this.f61127d = scope;
        this.f61128e = onTimeout;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.f61129f = e();
    }

    public final void d() {
        l2 l2Var = this.f61129f;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
    }

    public final l2 e() {
        l2 f11;
        if (this.f61125b == Long.MAX_VALUE) {
            return null;
        }
        r0 r0Var = this.f61127d;
        f11 = c40.k.f(r0Var, r0Var.getCoroutineContext().plus(new q0("Timeout " + this.f61124a)), null, new a(null), 2, null);
        return f11;
    }

    public final void f() {
        this.lastActivityTime = this.f61126c.invoke().longValue();
        this.isStarted = 1;
    }

    public final void g() {
        this.isStarted = 0;
    }
}
