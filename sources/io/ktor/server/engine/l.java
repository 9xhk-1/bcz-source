package io.ktor.server.engine;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import zx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBaseApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,126:1\n79#2:127\n79#2:128\n25#3:129\n26#3:146\n58#4,16:130\n*S KotlinDebug\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt\n*L\n79#1:127\n81#1:128\n81#1:129\n81#1:146\n81#1:130,16\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$1", f = "BaseApplicationEngine.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.u0({"SMAP\nBaseApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,126:1\n79#2:127\n79#2:128\n79#2:129\n79#2:130\n25#3:131\n26#3:148\n58#4,16:132\n*S KotlinDebug\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1\n*L\n94#1:127\n96#1:128\n97#1:129\n100#1:130\n100#1:131\n100#1:148\n100#1:132,16\n*E\n"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<yz.g2, zx.k0>, yz.g2, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61398a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61399b;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, yz.g2 g2Var, j00.c<? super yz.g2> cVar) {
            a aVar = new a(cVar);
            aVar.f61399b = dVar;
            return aVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h10.r rVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61398a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61399b;
                if (zx.l0.c((zx.k0) dVar.d())) {
                    return yz.g2.f100423a;
                }
                ix.g1 l12 = ((zx.k0) dVar.d()).k().l();
                if (l12 == null && (l12 = (ix.g1) ((zx.k0) dVar.d()).getAttributes().a(io.ktor.server.routing.y1.c())) == null) {
                    l12 = ix.g1.f62797c.z();
                }
                zx.k0 k0Var = (zx.k0) dVar.d();
                h10.d d11 = kotlin.jvm.internal.o0.d(ix.g1.class);
                try {
                    rVar = kotlin.jvm.internal.o0.B(ix.g1.class);
                } catch (Throwable unused) {
                    rVar = null;
                }
                gz.a aVar = new gz.a(d11, rVar);
                this.f61398a = 1;
                if (k0Var.E(l12, aVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$2", f = "BaseApplicationEngine.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<yz.g2, zx.k0>, yz.g2, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61400a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61401b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, yz.g2 g2Var, j00.c<? super yz.g2> cVar) {
            b bVar = new b(cVar);
            bVar.f61401b = dVar;
            return bVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61400a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61401b;
                this.f61400a = 1;
                if (l.f(dVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1", f = "BaseApplicationEngine.kt", i = {0}, l = {112, 128}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nBaseApplicationEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt$installDefaultTransformationChecker$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,126:1\n79#2:127\n25#3:128\n26#3:145\n58#4,16:129\n*S KotlinDebug\n*F\n+ 1 BaseApplicationEngine.kt\nio/ktor/server/engine/BaseApplicationEngineKt$installDefaultTransformationChecker$1\n*L\n114#1:127\n114#1:128\n114#1:145\n114#1:129,16\n*E\n"})
    public static final class c extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<yz.g2, zx.k0>, yz.g2, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61402a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61403b;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, yz.g2 g2Var, j00.c<? super yz.g2> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f61403b = dVar;
            return cVar2.invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        
            if (r8 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        
            if (r8.E(r1, r6, r7) != r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.d] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f61402a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r8)
                goto L5e
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f61403b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r8)     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L35
                goto L5e
            L22:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f61403b
                r1 = r8
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                r7.f61403b = r1     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L35
                r7.f61402a = r3     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L35
                java.lang.Object r8 = r1.h(r7)     // Catch: io.ktor.server.plugins.CannotTransformContentToTypeException -> L35
                if (r8 != r0) goto L5e
                goto L5d
            L35:
                java.lang.Object r8 = r1.d()
                zx.k0 r8 = (zx.k0) r8
                ix.g1$a r1 = ix.g1.f62797c
                ix.g1 r1 = r1.Y()
                java.lang.Class<ix.g1> r3 = ix.g1.class
                h10.d r4 = kotlin.jvm.internal.o0.d(r3)
                r5 = 0
                h10.r r3 = kotlin.jvm.internal.o0.B(r3)     // Catch: java.lang.Throwable -> L4d
                goto L4e
            L4d:
                r3 = r5
            L4e:
                gz.a r6 = new gz.a
                r6.<init>(r4, r3)
                r7.f61403b = r5
                r7.f61402a = r2
                java.lang.Object r8 = r8.E(r1, r6, r7)
                if (r8 != r0) goto L5e
            L5d:
                return r0
            L5e:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$2", f = "BaseApplicationEngine.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, zx.k0>, Object, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61404a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61405b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61406c;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, zx.k0> dVar, Object obj, j00.c<? super yz.g2> cVar) {
            d dVar2 = new d(cVar);
            dVar2.f61405b = dVar;
            dVar2.f61406c = obj;
            return dVar2.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61404a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61405b;
                if (!(this.f61406c instanceof mx.v)) {
                    hy.g gVar = new hy.g(ix.g1.f62797c.y());
                    this.f61405b = null;
                    this.f61404a = 1;
                    if (dVar.i(gVar, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.BaseApplicationEngineKt", f = "BaseApplicationEngine.kt", i = {0}, l = {129}, m = "verifyHostHeader", n = {"$this$verifyHostHeader"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61407a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61408b;

        /* renamed from: c, reason: collision with root package name */
        public int f61409c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61408b = obj;
            this.f61409c |= Integer.MIN_VALUE;
            return l.f(null, this);
        }
    }

    public static final void d(zx.a aVar) {
        c.a aVar2 = zx.c.f103019k;
        aVar.C(aVar2.b(), new a(null));
        aVar.C(aVar2.a(), new b(null));
    }

    public static final void e(zx.a aVar) {
        aVar.C(zx.c.f103019k.f(), new c(null));
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("BodyTransformationCheckPostRender");
        aVar.j0().z(qy.m.f82742h.e(), hVar);
        aVar.j0().C(hVar, new d(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(io.ktor.util.pipeline.d<yz.g2, zx.k0> r7, j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.engine.l.e
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.engine.l$e r0 = (io.ktor.server.engine.l.e) r0
            int r1 = r0.f61409c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61409c = r1
            goto L18
        L13:
            io.ktor.server.engine.l$e r0 = new io.ktor.server.engine.l$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61408b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61409c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f61407a
            io.ktor.util.pipeline.d r7 = (io.ktor.util.pipeline.d) r7
            kotlin.e.n(r8)
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.d()
            zx.k0 r8 = (zx.k0) r8
            py.g r8 = r8.f()
            ix.q0 r8 = r8.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.P()
            java.util.List r8 = r8.a(r2)
            if (r8 != 0) goto L55
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L55:
            int r8 = r8.size()
            if (r8 <= r3) goto L86
            java.lang.Object r8 = r7.d()
            zx.k0 r8 = (zx.k0) r8
            ix.g1$a r2 = ix.g1.f62797c
            ix.g1 r2 = r2.e()
            java.lang.Class<ix.g1> r4 = ix.g1.class
            h10.d r5 = kotlin.jvm.internal.o0.d(r4)
            h10.r r4 = kotlin.jvm.internal.o0.B(r4)     // Catch: java.lang.Throwable -> L72
            goto L73
        L72:
            r4 = 0
        L73:
            gz.a r6 = new gz.a
            r6.<init>(r5, r4)
            r0.f61407a = r7
            r0.f61409c = r3
            java.lang.Object r8 = r8.E(r2, r6, r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            r7.b()
        L86:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.l.f(io.ktor.util.pipeline.d, j00.c):java.lang.Object");
    }
}
