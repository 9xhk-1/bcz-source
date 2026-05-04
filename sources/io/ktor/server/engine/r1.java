package io.ktor.server.engine;

import c40.l2;
import c40.n2;
import c40.p2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.EngineContextCancellationHelperKt$launchOnCancellation$1", f = "EngineContextCancellationHelper.kt", i = {0}, l = {38, 44}, m = "invokeSuspend", n = {"cancelled"}, s = {"I$0"})
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61426a;

        /* renamed from: b, reason: collision with root package name */
        public int f61427b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c40.a0 f61428c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super yz.g2>, Object> f61429d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c40.a0 a0Var, x00.l<? super j00.c<? super yz.g2>, ? extends Object> lVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f61428c = a0Var;
            this.f61429d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f61428c, this.f61429d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            if (r5.invoke(r4) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
        
            if (r5.K0(r4) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f61427b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L47
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                int r1 = r4.f61426a
                kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L32
            L1f:
                r3 = r1
                goto L32
            L21:
                kotlin.e.n(r5)
                c40.a0 r5 = r4.f61428c     // Catch: java.lang.Throwable -> L32
                r1 = 0
                r4.f61426a = r1     // Catch: java.lang.Throwable -> L32
                r4.f61427b = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Object r5 = r5.K0(r4)     // Catch: java.lang.Throwable -> L32
                if (r5 != r0) goto L1f
                goto L46
            L32:
                if (r3 != 0) goto L3c
                c40.a0 r5 = r4.f61428c
                boolean r5 = r5.isCancelled()
                if (r5 == 0) goto L47
            L3c:
                x00.l<j00.c<? super yz.g2>, java.lang.Object> r5 = r4.f61429d
                r4.f61427b = r2
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.r1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.EngineContextCancellationHelperKt$stopServerOnCancellation$1", f = "EngineContextCancellationHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61430a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ io.ktor.server.engine.a f61431b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f61432c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f61433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.ktor.server.engine.a aVar, long j11, long j12, j00.c<? super b> cVar) {
            super(1, cVar);
            this.f61431b = aVar;
            this.f61432c = j11;
            this.f61433d = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new b(this.f61431b, this.f61432c, this.f61433d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super yz.g2> cVar) {
            return ((b) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f61431b.d(this.f61432c, this.f61433d);
            return yz.g2.f100423a;
        }
    }

    @io.ktor.utils.io.b0
    @m80.k
    public static final c40.a0 a(@m80.k l2 l2Var, @m80.k x00.l<? super j00.c<? super yz.g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(l2Var, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        c40.a0 a11 = n2.a(l2Var);
        c40.k.f(c40.b2.f7824a, l2Var.plus(fy.b.e(c40.h1.f7863a)), null, new a(a11, block, null), 2, null);
        return a11;
    }

    @m80.k
    public static final c40.a0 b(@m80.k io.ktor.server.engine.a aVar, @m80.k zx.a application, long j11, long j12) {
        c40.a0 c11;
        c40.a0 a11;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(application, "application");
        l2 l2Var = (l2) application.o0().get(l2.f7886e0);
        if (l2Var != null && (a11 = a(l2Var, new b(aVar, j11, j12, null))) != null) {
            return a11;
        }
        c11 = p2.c(null, 1, null);
        return c11;
    }

    public static /* synthetic */ c40.a0 c(io.ktor.server.engine.a aVar, zx.a aVar2, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 50;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = 5000;
        }
        return b(aVar, aVar2, j13, j12);
    }
}
