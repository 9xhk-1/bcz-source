package io.ktor.server.engine;

import io.ktor.server.engine.d2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nShutDownUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl\n+ 2 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,106:1\n25#2:107\n26#2:124\n58#3,16:108\n*S KotlinDebug\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl\n*L\n46#1:107\n46#1:124\n46#1:108,16\n*E\n"})
/* loaded from: classes8.dex */
public final class d2 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f61342c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final zx.s<zx.a, d, zx.q0> f61343d = zx.b0.i("shutdown.url", a.f61346a, new x00.l() { // from class: io.ktor.server.engine.c2
        @Override // x00.l
        public final Object invoke(Object obj) {
            yz.g2 b11;
            b11 = d2.b((zx.o0) obj);
            return b11;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61344a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<zx.b, Integer> f61345b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f61346a = new a();

        public a() {
            super(0, d.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.ShutDownUrl$Companion$ApplicationCallPlugin$2$1", f = "ShutDownUrl.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<zx.h0<d>, zx.k0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61347a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61348b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.h0<d> h0Var, zx.k0 k0Var, j00.c<? super yz.g2> cVar) {
            b bVar = d2.this.new b(cVar);
            bVar.f61348b = k0Var;
            return bVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61347a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                zx.k0 k0Var = (zx.k0) this.f61348b;
                if (kotlin.jvm.internal.g0.g(py.e.q(k0Var.f()), d2.this.f())) {
                    d2 d2Var = d2.this;
                    this.f61347a = 1;
                    if (d2Var.d(k0Var, this) == l11) {
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
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final zx.s<zx.a, d, zx.q0> a() {
            return d2.f61343d;
        }

        public c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @io.ktor.utils.io.c0
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public String f61350a = "/ktor/application/shutdown";

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public x00.l<? super zx.b, Integer> f61351b = new x00.l() { // from class: io.ktor.server.engine.e2
            @Override // x00.l
            public final Object invoke(Object obj) {
                int b11;
                b11 = d2.d.b((zx.b) obj);
                return Integer.valueOf(b11);
            }
        };

        public static final int b(zx.b bVar) {
            kotlin.jvm.internal.g0.p(bVar, "<this>");
            return 0;
        }

        @m80.k
        public final x00.l<zx.b, Integer> c() {
            return this.f61351b;
        }

        @m80.k
        public final String d() {
            return this.f61350a;
        }

        public final void e(@m80.k x00.l<? super zx.b, Integer> lVar) {
            kotlin.jvm.internal.g0.p(lVar, "<set-?>");
            this.f61351b = lVar;
        }

        public final void f(@m80.k String str) {
            kotlin.jvm.internal.g0.p(str, "<set-?>");
            this.f61350a = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nShutDownUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl$EnginePlugin\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,106:1\n18#2:107\n58#3,16:108\n*S KotlinDebug\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl$EnginePlugin\n*L\n56#1:107\n56#1:108,16\n*E\n"})
    public static final class e implements zx.s<s1, d, d2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final e f61352a = new e();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final xy.a<d2> f61353b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.engine.ShutDownUrl$EnginePlugin$install$1", f = "ShutDownUrl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.jvm.internal.u0({"SMAP\nShutDownUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,106:1\n79#2:107\n79#2:108\n*S KotlinDebug\n*F\n+ 1 ShutDownUrl.kt\nio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1\n*L\n64#1:107\n65#1:108\n*E\n"})
        public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<yz.g2, zx.k0>, yz.g2, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61354a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f61355b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d2 f61356c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d2 d2Var, j00.c<? super a> cVar) {
                super(3, cVar);
                this.f61356c = d2Var;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<yz.g2, zx.k0> dVar, yz.g2 g2Var, j00.c<? super yz.g2> cVar) {
                a aVar = new a(this.f61356c, cVar);
                aVar.f61355b = dVar;
                return aVar.invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61354a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61355b;
                    if (kotlin.jvm.internal.g0.g(py.e.q(((zx.k0) dVar.d()).f()), this.f61356c.f())) {
                        d2 d2Var = this.f61356c;
                        zx.k0 k0Var = (zx.k0) dVar.d();
                        this.f61354a = 1;
                        if (d2Var.d(k0Var, this) == l11) {
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

        static {
            h10.r rVar;
            h10.d d11 = kotlin.jvm.internal.o0.d(d2.class);
            try {
                rVar = kotlin.jvm.internal.o0.B(d2.class);
            } catch (Throwable unused) {
                rVar = null;
            }
            f61353b = new xy.a<>("shutdown.url", new gz.a(d11, rVar));
        }

        @Override // zx.m0
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d2 a(@m80.k s1 pipeline, @m80.k x00.l<? super d, yz.g2> configure) {
            kotlin.jvm.internal.g0.p(pipeline, "pipeline");
            kotlin.jvm.internal.g0.p(configure, "configure");
            d dVar = new d();
            configure.invoke(dVar);
            d2 d2Var = new d2(dVar.d(), dVar.c());
            pipeline.C(s1.f61434j.a(), new a(d2Var, null));
            return d2Var;
        }

        @Override // zx.m0
        @m80.k
        public xy.a<d2> getKey() {
            return f61353b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.ShutDownUrl", f = "ShutDownUrl.kt", i = {0}, l = {107}, m = "doShutdown", n = {"latch"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61357a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61358b;

        /* renamed from: d, reason: collision with root package name */
        public int f61360d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61358b = obj;
            this.f61360d |= Integer.MIN_VALUE;
            return d2.this.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.ShutDownUrl$doShutdown$2", f = "ShutDownUrl.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61361a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.x f61362b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zx.a f61363c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zx.f f61364d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f61365e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c40.x xVar, zx.a aVar, zx.f fVar, int i11, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f61362b = xVar;
            this.f61363c = aVar;
            this.f61364d = fVar;
            this.f61365e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f61362b, this.f61363c, this.f61364d, this.f61365e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61361a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.x xVar = this.f61362b;
                this.f61361a = 1;
                if (xVar.K0(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f61363c.n0().b(zx.c0.c(), this.f61364d);
            this.f61363c.l0();
            System.exit(this.f61365e);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d2(@m80.k String url, @m80.k x00.l<? super zx.b, Integer> exitCode) {
        kotlin.jvm.internal.g0.p(url, "url");
        kotlin.jvm.internal.g0.p(exitCode, "exitCode");
        this.f61344a = url;
        this.f61345b = exitCode;
    }

    public static final yz.g2 b(zx.o0 createApplicationPlugin) {
        kotlin.jvm.internal.g0.p(createApplicationPlugin, "$this$createApplicationPlugin");
        createApplicationPlugin.o(new d2(((d) createApplicationPlugin.l()).d(), ((d) createApplicationPlugin.l()).c()).new b(null));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k zx.b r21, @m80.k j00.c<? super yz.g2> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            java.lang.Class<ix.g1> r3 = ix.g1.class
            boolean r4 = r2 instanceof io.ktor.server.engine.d2.f
            if (r4 == 0) goto L1b
            r4 = r2
            io.ktor.server.engine.d2$f r4 = (io.ktor.server.engine.d2.f) r4
            int r5 = r4.f61360d
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f61360d = r5
            goto L20
        L1b:
            io.ktor.server.engine.d2$f r4 = new io.ktor.server.engine.d2$f
            r4.<init>(r2)
        L20:
            java.lang.Object r2 = r4.f61358b
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            int r6 = r4.f61360d
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L41
            if (r6 != r7) goto L39
            java.lang.Object r0 = r4.f61357a
            r3 = r0
            c40.x r3 = (c40.x) r3
            kotlin.e.n(r2)     // Catch: java.lang.Throwable -> L37
            goto La1
        L37:
            r0 = move-exception
            goto La9
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L41:
            kotlin.e.n(r2)
            zx.a r2 = r0.w0()
            org.slf4j.Logger r2 = zx.j.c(r2)
            java.lang.String r6 = "Shutdown URL was called: server is going down"
            r2.warn(r6)
            zx.a r11 = r0.w0()
            zx.f r12 = r11.a()
            x00.l<zx.b, java.lang.Integer> r2 = r1.f61345b
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.Number r2 = (java.lang.Number) r2
            int r13 = r2.intValue()
            c40.x r10 = c40.z.c(r8, r7, r8)
            zx.a r2 = r0.w0()
            io.ktor.server.engine.d2$g r17 = new io.ktor.server.engine.d2$g
            r14 = 0
            r9 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r18 = 3
            r19 = 0
            r15 = 0
            r16 = 0
            r14 = r2
            c40.i.e(r14, r15, r16, r17, r18, r19)
            ix.g1$a r2 = ix.g1.f62797c     // Catch: java.lang.Throwable -> La7
            ix.g1 r2 = r2.n()     // Catch: java.lang.Throwable -> La7
            h10.d r6 = kotlin.jvm.internal.o0.d(r3)     // Catch: java.lang.Throwable -> La7
            h10.r r3 = kotlin.jvm.internal.o0.B(r3)     // Catch: java.lang.Throwable -> L8f
            goto L90
        L8f:
            r3 = r8
        L90:
            gz.a r9 = new gz.a     // Catch: java.lang.Throwable -> La7
            r9.<init>(r6, r3)     // Catch: java.lang.Throwable -> La7
            r4.f61357a = r10     // Catch: java.lang.Throwable -> La7
            r4.f61360d = r7     // Catch: java.lang.Throwable -> La7
            java.lang.Object r0 = r0.E(r2, r9, r4)     // Catch: java.lang.Throwable -> La7
            if (r0 != r5) goto La0
            return r5
        La0:
            r3 = r10
        La1:
            c40.l2.a.b(r3, r8, r7, r8)
            yz.g2 r0 = yz.g2.f100423a
            return r0
        La7:
            r0 = move-exception
            r3 = r10
        La9:
            c40.l2.a.b(r3, r8, r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.d2.d(zx.b, j00.c):java.lang.Object");
    }

    @m80.k
    public final x00.l<zx.b, Integer> e() {
        return this.f61345b;
    }

    @m80.k
    public final String f() {
        return this.f61344a;
    }
}
