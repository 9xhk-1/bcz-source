package uy;

import c40.a0;
import c40.p2;
import c40.r0;
import h10.r;
import h10.t;
import io.ktor.websocket.h0;
import io.ktor.websocket.z;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import uy.o;
import x00.q;
import yz.g2;
import zx.c0;
import zx.k0;
import zx.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/server/websocket/WebSockets\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,146:1\n18#2:147\n18#2:164\n58#3,16:148\n58#3,16:165\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/server/websocket/WebSockets\n*L\n112#1:147\n118#1:164\n112#1:148,16\n118#1:165,16\n*E\n"})
/* loaded from: classes8.dex */
public final class o implements r0 {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f92753h = new a(0 == true ? 1 : 0);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final xy.a<o> f92754i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final xy.a<List<z<?>>> f92755j;

    /* renamed from: a, reason: collision with root package name */
    public final long f92756a;

    /* renamed from: b, reason: collision with root package name */
    public final long f92757b;

    /* renamed from: c, reason: collision with root package name */
    public final long f92758c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92759d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final h0 f92760e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final io.ktor.serialization.d f92761f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final a0 f92762g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements s<zx.a, b, o> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.websocket.WebSockets$Plugin$install$1$2", f = "WebSockets.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: uy.o$a$a, reason: collision with other inner class name */
        public static final class C1247a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f92763a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f92764b;

            public C1247a(j00.c<? super C1247a> cVar) {
                super(3, cVar);
            }

            @Override // x00.q
            public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
                C1247a c1247a = new C1247a(cVar);
                c1247a.f92764b = obj;
                return c1247a.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f92763a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return !(this.f92764b instanceof m) ? g2.f100423a : g2.f100423a;
            }
        }

        public /* synthetic */ a(v vVar) {
            this();
        }

        public static final g2 e(o oVar, zx.f it) {
            g0.p(it, "it");
            p.a().trace("Shutdown WebSockets due to application stop");
            oVar.i();
            return g2.f100423a;
        }

        @m80.k
        public final xy.a<List<z<?>>> c() {
            return o.f92755j;
        }

        @Override // zx.m0
        @m80.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o a(@m80.k zx.a pipeline, @m80.k x00.l<? super b, g2> configure) {
            g0.p(pipeline, "pipeline");
            g0.p(configure, "configure");
            b bVar = new b();
            configure.invoke(bVar);
            final o oVar = new o(bVar.f(), bVar.g(), bVar.e(), bVar.d(), bVar.c(), bVar.b(), null);
            pipeline.n0().c(c0.c(), new x00.l() { // from class: uy.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 e11;
                    e11 = o.a.e(o.this, (zx.f) obj);
                    return e11;
                }
            });
            pipeline.j0().C(qy.m.f82742h.g(), new C1247a(null));
            return oVar;
        }

        @Override // zx.m0
        @m80.k
        public xy.a<o> getKey() {
            return o.f92754i;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @io.ktor.utils.io.c0
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public long f92766b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f92769e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public io.ktor.serialization.d f92770f;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final h0 f92765a = new h0();

        /* renamed from: c, reason: collision with root package name */
        public long f92767c = 15000;

        /* renamed from: d, reason: collision with root package name */
        public long f92768d = Long.MAX_VALUE;

        public final void a(@m80.k x00.l<? super h0, g2> block) {
            g0.p(block, "block");
            block.invoke(this.f92765a);
        }

        @m80.l
        public final io.ktor.serialization.d b() {
            return this.f92770f;
        }

        @m80.k
        public final h0 c() {
            return this.f92765a;
        }

        public final boolean d() {
            return this.f92769e;
        }

        public final long e() {
            return this.f92768d;
        }

        public final long f() {
            return this.f92766b;
        }

        public final long g() {
            return this.f92767c;
        }

        public final void h(@m80.l io.ktor.serialization.d dVar) {
            this.f92770f = dVar;
        }

        public final void i(boolean z11) {
            this.f92769e = z11;
        }

        public final void j(long j11) {
            this.f92768d = j11;
        }

        public final void k(long j11) {
            this.f92766b = j11;
        }

        public final void l(long j11) {
            this.f92767c = j11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        r rVar;
        r rVar2 = null;
        h10.d d11 = o0.d(o.class);
        try {
            rVar = o0.B(o.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f92754i = new xy.a<>("WebSockets", new gz.a(d11, rVar));
        h10.d d12 = o0.d(List.class);
        try {
            t.a aVar = t.f57954c;
            rVar2 = o0.C(List.class, aVar.e(o0.C(z.class, aVar.c())));
        } catch (Throwable unused2) {
        }
        f92755j = new xy.a<>("WebSocket extensions", new gz.a(d12, rVar2));
    }

    public /* synthetic */ o(long j11, long j12, long j13, boolean z11, h0 h0Var, io.ktor.serialization.d dVar, v vVar) {
        this(j11, j12, j13, z11, h0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.f92762g.complete();
    }

    public final boolean Q0() {
        return this.f92759d;
    }

    public final long a0() {
        return this.f92757b;
    }

    public final long d0() {
        return this.f92758c;
    }

    @m80.l
    public final io.ktor.serialization.d e() {
        return this.f92761f;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f92762g;
    }

    @m80.k
    public final h0 h() {
        return this.f92760e;
    }

    public final long x0() {
        return this.f92756a;
    }

    public o(long j11, long j12, long j13, boolean z11, h0 h0Var, io.ktor.serialization.d dVar) {
        a0 c11;
        this.f92756a = j11;
        this.f92757b = j12;
        this.f92758c = j13;
        this.f92759d = z11;
        this.f92760e = h0Var;
        this.f92761f = dVar;
        c11 = p2.c(null, 1, null);
        this.f92762g = c11;
        if (j11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j13 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public o(long j11, long j12, long j13, boolean z11) {
        this(j11, j12, j13, z11, new h0(), null);
    }
}
