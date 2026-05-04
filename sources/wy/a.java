package wy;

import c40.h1;
import c40.i;
import c40.m0;
import c40.r0;
import j00.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.f;
import l00.d;
import m80.k;
import o40.n0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.test.dispatcher.TestCommonKt$runTestWithRealTime$1", f = "TestCommon.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: wy.a$a, reason: collision with other inner class name */
    public static final class C1301a extends SuspendLambda implements p<n0, c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96964a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<r0, c<? super g2>, Object> f96965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1301a(p<? super r0, ? super c<? super g2>, ? extends Object> pVar, c<? super C1301a> cVar) {
            super(2, cVar);
            this.f96965b = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new C1301a(this.f96965b, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n0 n0Var, c<? super g2> cVar) {
            return ((C1301a) create(n0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96964a;
            if (i11 == 0) {
                e.n(obj);
                m0 limitedParallelism$default = m0.limitedParallelism$default(h1.a(), 1, null, 2, null);
                p<r0, c<? super g2>, Object> pVar = this.f96965b;
                this.f96964a = 1;
                if (i.h(limitedParallelism$default, pVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public static final void a(@k kotlin.coroutines.d context, long j11, @k p<? super r0, ? super c<? super g2>, ? extends Object> testBody) {
        g0.p(context, "context");
        g0.p(testBody, "testBody");
        o40.i.n(context, j11, new C1301a(testBody, null));
    }

    public static /* synthetic */ void b(kotlin.coroutines.d dVar, long j11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            e.a aVar = kotlin.time.e.f67757b;
            j11 = f.w(60, DurationUnit.SECONDS);
        }
        a(dVar, j11, pVar);
    }
}
