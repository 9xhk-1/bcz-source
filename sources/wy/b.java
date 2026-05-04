package wy;

import c40.i;
import c40.r0;
import c40.v3;
import j00.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.test.dispatcher.TestJvmKt$testSuspend$1", f = "TestJvm.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<r0, c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96966a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f96967b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<r0, c<? super g2>, Object> f96968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, p<? super r0, ? super c<? super g2>, ? extends Object> pVar, c<? super a> cVar) {
            super(2, cVar);
            this.f96967b = j11;
            this.f96968c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new a(this.f96967b, this.f96968c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96966a;
            if (i11 == 0) {
                e.n(obj);
                long j11 = this.f96967b;
                p<r0, c<? super g2>, Object> pVar = this.f96968c;
                this.f96966a = 1;
                if (v3.c(j11, pVar, this) == l11) {
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

    public static final void a(@k kotlin.coroutines.d context, long j11, @k p<? super r0, ? super c<? super g2>, ? extends Object> block) {
        g0.p(context, "context");
        g0.p(block, "block");
        i.f(context, new a(j11, block, null));
    }

    public static /* synthetic */ void b(kotlin.coroutines.d dVar, long j11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = 60000;
        }
        a(dVar, j11, pVar);
    }
}
