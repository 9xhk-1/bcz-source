package io.ktor.server.routing;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nRoutingRoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingRoot.kt\nio/ktor/server/routing/RoutingRoot\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 Pipeline.kt\nio/ktor/util/pipeline/PipelineKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,167:1\n111#1,10:171\n111#1,10:182\n79#2:168\n79#2:169\n79#2:170\n79#2:181\n79#2:192\n487#3,4:193\n18#4:197\n58#5,16:198\n*S KotlinDebug\n*F\n+ 1 RoutingRoot.kt\nio/ktor/server/routing/RoutingRoot\n*L\n79#1:171,10\n84#1:182,10\n63#1:168\n69#1:169\n80#1:170\n85#1:181\n90#1:192\n100#1:193,4\n139#1:197\n139#1:198,16\n*E\n"})
/* loaded from: classes8.dex */
public final class RoutingRoot extends d1 implements k0 {

    @m80.k
    public static final xy.a<RoutingRoot> B;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final zx.a f61553w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final List<x00.l<u1, g2>> f61554x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final a f61551y = new a(0 == true ? 1 : 0);

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final hx.a<b1> f61552z = new hx.a<>();

    @m80.k
    public static final hx.a<b1> A = new hx.a<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements zx.s<zx.a, k0, RoutingRoot> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.routing.RoutingRoot$Plugin$install$1", f = "RoutingRoot.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.server.routing.RoutingRoot$a$a, reason: collision with other inner class name */
        public static final class C0714a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<g2, zx.k0>, g2, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61555a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f61556b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RoutingRoot f61557c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0714a(RoutingRoot routingRoot, j00.c<? super C0714a> cVar) {
                super(3, cVar);
                this.f61557c = routingRoot;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<g2, zx.k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
                C0714a c0714a = new C0714a(this.f61557c, cVar);
                c0714a.f61556b = dVar;
                return c0714a.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61555a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d<g2, zx.k0> dVar = (io.ktor.util.pipeline.d) this.f61556b;
                    RoutingRoot routingRoot = this.f61557c;
                    this.f61555a = 1;
                    if (routingRoot.I0(dVar, this) == l11) {
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

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final hx.a<b1> b() {
            return RoutingRoot.A;
        }

        @m80.k
        public final hx.a<b1> c() {
            return RoutingRoot.f61552z;
        }

        @Override // zx.m0
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public RoutingRoot a(@m80.k zx.a pipeline, @m80.k x00.l<? super k0, g2> configure) {
            kotlin.jvm.internal.g0.p(pipeline, "pipeline");
            kotlin.jvm.internal.g0.p(configure, "configure");
            RoutingRoot routingRoot = new RoutingRoot(pipeline);
            configure.invoke(routingRoot);
            pipeline.C(zx.c.f103019k.a(), new C0714a(routingRoot, null));
            return routingRoot;
        }

        @Override // zx.m0
        @m80.k
        public xy.a<RoutingRoot> getKey() {
            return RoutingRoot.B;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.RoutingRoot", f = "RoutingRoot.kt", i = {0, 0}, l = {191}, m = "executeResult", n = {"this", "routingCall"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61558a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61559b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61560c;

        /* renamed from: e, reason: collision with root package name */
        public int f61562e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61560c = obj;
            this.f61562e |= Integer.MIN_VALUE;
            return RoutingRoot.this.H0(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.RoutingRoot", f = "RoutingRoot.kt", i = {0, 0}, l = {64, 66}, m = "interceptor", n = {"this", c90.k.f8409a}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61563a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61564b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61565c;

        /* renamed from: e, reason: collision with root package name */
        public int f61567e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61565c = obj;
            this.f61567e |= Integer.MIN_VALUE;
            return RoutingRoot.this.I0(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = kotlin.jvm.internal.o0.d(RoutingRoot.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(RoutingRoot.class);
        } catch (Throwable unused) {
        }
        B = new xy.a<>("Routing", new gz.a(d11, rVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingRoot(@m80.k zx.a application) {
        super(null, new e0(application.p0()), application.u(), application.a());
        kotlin.jvm.internal.g0.p(application, "application");
        this.f61553w = application;
        this.f61554x = new ArrayList();
        D0();
    }

    public static final g2 G0(u1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (y1.b().isTraceEnabled()) {
            y1.b().trace(it.e());
        }
        return g2.f100423a;
    }

    public final void D0() {
        this.f61554x.add(new x00.l() { // from class: io.ktor.server.routing.x1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 G0;
                G0 = RoutingRoot.G0((u1) obj);
                return G0;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(io.ktor.util.pipeline.d<yz.g2, zx.k0> r17, io.ktor.server.routing.d1 r18, ix.p1 r19, j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.RoutingRoot.H0(io.ktor.util.pipeline.d, io.ktor.server.routing.d1, ix.p1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r2.H0(r7, r4, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(@m80.k io.ktor.util.pipeline.d<yz.g2, zx.k0> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.server.routing.RoutingRoot.c
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.routing.RoutingRoot$c r0 = (io.ktor.server.routing.RoutingRoot.c) r0
            int r1 = r0.f61567e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61567e = r1
            goto L18
        L13:
            io.ktor.server.routing.RoutingRoot$c r0 = new io.ktor.server.routing.RoutingRoot$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61565c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61567e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            goto L7c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f61564b
            io.ktor.util.pipeline.d r7 = (io.ktor.util.pipeline.d) r7
            java.lang.Object r2 = r0.f61563a
            io.ktor.server.routing.RoutingRoot r2 = (io.ktor.server.routing.RoutingRoot) r2
            kotlin.e.n(r8)
            goto L5e
        L40:
            kotlin.e.n(r8)
            io.ktor.server.routing.p1 r8 = new io.ktor.server.routing.p1
            java.lang.Object r2 = r7.d()
            zx.k0 r2 = (zx.k0) r2
            java.util.List<x00.l<io.ktor.server.routing.u1, yz.g2>> r5 = r6.f61554x
            r8.<init>(r6, r2, r5)
            r0.f61563a = r6
            r0.f61564b = r7
            r0.f61567e = r4
            java.lang.Object r8 = r8.j(r0)
            if (r8 != r1) goto L5d
            goto L7b
        L5d:
            r2 = r6
        L5e:
            io.ktor.server.routing.r1 r8 = (io.ktor.server.routing.r1) r8
            boolean r4 = r8 instanceof io.ktor.server.routing.r1.b
            if (r4 == 0) goto L7f
            io.ktor.server.routing.d1 r4 = r8.b()
            io.ktor.server.routing.r1$b r8 = (io.ktor.server.routing.r1.b) r8
            ix.p1 r8 = r8.a()
            r5 = 0
            r0.f61563a = r5
            r0.f61564b = r5
            r0.f61567e = r3
            java.lang.Object r7 = r2.H0(r7, r4, r8, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L7f:
            boolean r0 = r8 instanceof io.ktor.server.routing.r1.a
            if (r0 == 0) goto L9d
            java.lang.Object r7 = r7.d()
            zx.k0 r7 = (zx.k0) r7
            xy.b r7 = r7.getAttributes()
            xy.a r0 = io.ktor.server.routing.y1.c()
            io.ktor.server.routing.r1$a r8 = (io.ktor.server.routing.r1.a) r8
            ix.g1 r8 = r8.c()
            r7.e(r0, r8)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L9d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.RoutingRoot.I0(io.ktor.util.pipeline.d, j00.c):java.lang.Object");
    }

    public final <Subject, Context, P extends io.ktor.util.pipeline.c<Subject, Context>> P J0(P p11, P p12, x00.a<? extends P> aVar) {
        if (p11.G()) {
            return p12;
        }
        if (p12.G()) {
            return p11;
        }
        P invoke = aVar.invoke();
        invoke.H(p11);
        invoke.H(p12);
        return invoke;
    }

    @Override // io.ktor.server.routing.k0
    public void i(@m80.k x00.l<? super u1, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        this.f61554x.add(block);
    }

    @m80.k
    public final zx.a w0() {
        return this.f61553w;
    }
}
