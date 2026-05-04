package io.ktor.server.testing;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationKt", f = "TestApplication.kt", i = {0, 1}, l = {393, 396}, m = "runTestApplication", n = {"builder", "testApplication"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61913a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61914b;

        /* renamed from: c, reason: collision with root package name */
        public int f61915c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61914b = obj;
            this.f61915c |= Integer.MIN_VALUE;
            return q0.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationKt$runTestApplication$2$2", f = "TestApplication.kt", i = {}, l = {393}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61916a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<f, j00.c<? super g2>, Object> f61917b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f61918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.p<? super f, ? super j00.c<? super g2>, ? extends Object> pVar, f fVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61917b = pVar;
            this.f61918c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f61917b, this.f61918c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61916a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.p<f, j00.c<? super g2>, Object> pVar = this.f61917b;
                f fVar = this.f61918c;
                this.f61916a = 1;
                if (pVar.invoke(fVar, this) == l11) {
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
    @l00.d(c = "io.ktor.server.testing.TestApplicationKt$testApplication$1", f = "TestApplication.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f61920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<f, j00.c<? super g2>, Object> f61921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(kotlin.coroutines.d dVar, x00.p<? super f, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f61920b = dVar;
            this.f61921c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f61920b, this.f61921c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61919a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlin.coroutines.d dVar = this.f61920b;
                x00.p<f, j00.c<? super g2>, Object> pVar = this.f61921c;
                this.f61919a = 1;
                if (q0.c(dVar, pVar, this) == l11) {
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

    @io.ktor.utils.io.c0
    @m80.k
    public static final TestApplication b(@m80.k x00.l<? super e0, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        f fVar = new f();
        TestApplication testApplication = new TestApplication(fVar);
        block.invoke(fVar);
        return testApplication;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r6.l(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    @io.ktor.utils.io.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k final kotlin.coroutines.d r6, @m80.k x00.p<? super io.ktor.server.testing.f, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.testing.q0.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.testing.q0$a r0 = (io.ktor.server.testing.q0.a) r0
            int r1 = r0.f61915c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61915c = r1
            goto L18
        L13:
            io.ktor.server.testing.q0$a r0 = new io.ktor.server.testing.q0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61914b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61915c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f61913a
            io.ktor.server.testing.TestApplication r6 = (io.ktor.server.testing.TestApplication) r6
            kotlin.e.n(r8)
            goto L79
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f61913a
            io.ktor.server.testing.f r6 = (io.ktor.server.testing.f) r6
            kotlin.e.n(r8)
            goto L6a
        L40:
            kotlin.e.n(r8)
            io.ktor.server.testing.f r8 = new io.ktor.server.testing.f
            r8.<init>()
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            boolean r2 = kotlin.jvm.internal.g0.g(r6, r2)
            if (r2 != 0) goto L58
            io.ktor.server.testing.p0 r2 = new io.ktor.server.testing.p0
            r2.<init>()
            r8.U(r2)
        L58:
            io.ktor.server.testing.q0$b r2 = new io.ktor.server.testing.q0$b
            r5 = 0
            r2.<init>(r7, r8, r5)
            r0.f61913a = r8
            r0.f61915c = r4
            java.lang.Object r6 = c40.i.h(r6, r2, r0)
            if (r6 != r1) goto L69
            goto L78
        L69:
            r6 = r8
        L6a:
            io.ktor.server.testing.TestApplication r6 = r6.j0()
            r0.f61913a = r6
            r0.f61915c = r3
            java.lang.Object r7 = r6.l(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            r6.m()
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.q0.c(kotlin.coroutines.d, x00.p, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object d(kotlin.coroutines.d dVar, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return c(dVar, pVar, cVar);
    }

    public static final g2 e(kotlin.coroutines.d dVar, zx.w0 serverConfig) {
        kotlin.jvm.internal.g0.p(serverConfig, "$this$serverConfig");
        serverConfig.j(dVar);
        return g2.f100423a;
    }

    @io.ktor.utils.io.c0
    public static final void f(@m80.k kotlin.coroutines.d parentCoroutineContext, @m80.k x00.p<? super f, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.g0.p(block, "block");
        wy.a.b(null, 0L, new c(parentCoroutineContext, block, null), 3, null);
    }

    @io.ktor.utils.io.c0
    public static final void g(@m80.k x00.p<? super f, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        f(EmptyCoroutineContext.INSTANCE, block);
    }

    public static /* synthetic */ void h(kotlin.coroutines.d dVar, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        f(dVar, pVar);
    }
}
