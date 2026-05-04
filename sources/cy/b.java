package cy;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements d0<q<? super zx.b, ? super Throwable, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f46947a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final io.ktor.util.pipeline.h f46948b = new io.ktor.util.pipeline.h("BeforeSetup");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.CallFailed$install$1", f = "CommonHooks.kt", i = {0, 1, 1}, l = {44, 48}, m = "invokeSuspend", n = {"$this$intercept", "$this$intercept", "cause"}, s = {"L$0", "L$0", "L$1"})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/CallFailed$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n79#2:161\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/CallFailed$install$1\n*L\n48#1:160\n49#1:161\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<g2, k0>, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f46949a;

        /* renamed from: b, reason: collision with root package name */
        public int f46950b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46951c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<zx.b, Throwable, j00.c<? super g2>, Object> f46952d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.application.hooks.CallFailed$install$1$1", f = "CommonHooks.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: cy.b$a$a, reason: collision with other inner class name */
        public static final class C0542a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f46953a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.util.pipeline.d<g2, k0> f46954b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0542a(io.ktor.util.pipeline.d<g2, k0> dVar, j00.c<? super C0542a> cVar) {
                super(2, cVar);
                this.f46954b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0542a(this.f46954b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0542a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f46953a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d<g2, k0> dVar = this.f46954b;
                    this.f46953a = 1;
                    if (dVar.h(this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super zx.b, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f46952d = qVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<g2, k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
            a aVar = new a(this.f46952d, cVar);
            aVar.f46951c = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        
            if (c40.s0.g(r1, r6) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f46950b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r6.f46949a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r1 = r6.f46951c
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r7)
                goto L5f
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                java.lang.Object r1 = r6.f46951c
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2a
                goto L6f
            L2a:
                r7 = move-exception
                r5 = r1
                r1 = r7
                r7 = r5
                goto L48
            L2f:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f46951c
                io.ktor.util.pipeline.d r7 = (io.ktor.util.pipeline.d) r7
                cy.b$a$a r1 = new cy.b$a$a     // Catch: java.lang.Throwable -> L47
                r4 = 0
                r1.<init>(r7, r4)     // Catch: java.lang.Throwable -> L47
                r6.f46951c = r7     // Catch: java.lang.Throwable -> L47
                r6.f46950b = r3     // Catch: java.lang.Throwable -> L47
                java.lang.Object r7 = c40.s0.g(r1, r6)     // Catch: java.lang.Throwable -> L47
                if (r7 != r0) goto L6f
                goto L5c
            L47:
                r1 = move-exception
            L48:
                x00.q<zx.b, java.lang.Throwable, j00.c<? super yz.g2>, java.lang.Object> r3 = r6.f46952d
                java.lang.Object r4 = r7.d()
                zx.k0 r4 = (zx.k0) r4
                r6.f46951c = r7
                r6.f46949a = r1
                r6.f46950b = r2
                java.lang.Object r2 = r3.invoke(r4, r1, r6)
                if (r2 != r0) goto L5d
            L5c:
                return r0
            L5d:
                r0 = r1
                r1 = r7
            L5f:
                java.lang.Object r7 = r1.d()
                zx.k0 r7 = (zx.k0) r7
                qy.o r7 = r7.k()
                boolean r7 = r7.e()
                if (r7 == 0) goto L72
            L6f:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L72:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cy.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // zx.d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@k zx.c pipeline, @k q<? super zx.b, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        io.ktor.util.pipeline.h g11 = zx.c.f103019k.g();
        io.ktor.util.pipeline.h hVar = f46948b;
        pipeline.A(g11, hVar);
        pipeline.C(hVar, new a(handler, null));
    }
}
