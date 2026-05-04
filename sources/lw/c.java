package lw;

import androidx.core.app.NotificationCompat;
import c40.a0;
import c40.l2;
import c40.n2;
import c40.r0;
import c40.s0;
import cx.e0;
import cx.g0;
import cx.y;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import rw.a1;
import rw.c0;
import rw.f0;
import rw.j0;
import rw.z;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1377:1\n1863#2,2:1378\n*S KotlinDebug\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient\n*L\n1360#1:1378,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements r0, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71605n = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ow.a f71606a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j<? extends ow.j> f71607b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f71608c;

    @m80.k
    private volatile /* synthetic */ int closed;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a0 f71609d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f71610e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final e0 f71611f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ex.f f71612g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final g0 f71613h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final ex.b f71614i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final xy.b f71615j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final ow.j f71616k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final hx.c f71617l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final j<ow.j> f71618m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", i = {0, 0}, l = {com.badlogic.gdx.graphics.f.f11624m0, com.badlogic.gdx.graphics.i.f12418se}, m = "invokeSuspend", n = {"$this$intercept", NotificationCompat.CATEGORY_CALL}, s = {"L$0", "L$1"})
    @u0({"SMAP\nHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClient.kt\nio/ktor/client/HttpClient$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1377:1\n1#2:1378\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f71619a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f71620b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f71621c;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = c.this.new a(cVar);
            aVar.f71620b = dVar;
            aVar.f71621c = obj;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        
            if (r3.i(r1, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f71619a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r9)
                goto L66
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f71621c
                java.lang.Object r3 = r8.f71620b
                io.ktor.util.pipeline.d r3 = (io.ktor.util.pipeline.d) r3
                kotlin.e.n(r9)
                goto L50
            L24:
                kotlin.e.n(r9)
                java.lang.Object r9 = r8.f71620b
                io.ktor.util.pipeline.d r9 = (io.ktor.util.pipeline.d) r9
                java.lang.Object r1 = r8.f71621c
                boolean r4 = r1 instanceof mw.a
                if (r4 == 0) goto L69
                lw.c r4 = lw.c.this
                ex.b r4 = r4.c0()
                yz.g2 r5 = yz.g2.f100423a
                r6 = r1
                mw.a r6 = (mw.a) r6
                ex.c r6 = r6.i()
                r8.f71620b = r9
                r8.f71621c = r1
                r8.f71619a = r3
                java.lang.Object r3 = r4.p(r5, r6, r8)
                if (r3 != r0) goto L4d
                goto L65
            L4d:
                r7 = r3
                r3 = r9
                r9 = r7
            L50:
                ex.c r9 = (ex.c) r9
                r4 = r1
                mw.a r4 = (mw.a) r4
                r4.r(r9)
                r9 = 0
                r8.f71620b = r9
                r8.f71621c = r9
                r8.f71619a = r2
                java.lang.Object r9 = r3.i(r1, r8)
                if (r9 != r0) goto L66
            L65:
                return r0
            L66:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            L69:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Error: HttpClientCall expected, but found "
                r9.append(r0)
                r9.append(r1)
                r0 = 40
                r9.append(r0)
                java.lang.Class r0 = r1.getClass()
                h10.d r0 = kotlin.jvm.internal.o0.d(r0)
                r9.append(r0)
                java.lang.String r0 = ")."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lw.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", i = {0}, l = {1315}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.d<ex.d, mw.a>, ex.d, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f71623a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f71624b;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.d, mw.a> dVar, ex.d dVar2, j00.c<? super g2> cVar) {
            b bVar = c.this.new b(cVar);
            bVar.f71624b = dVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.ktor.util.pipeline.d dVar;
            Throwable th2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f71623a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar2 = (io.ktor.util.pipeline.d) this.f71624b;
                try {
                    this.f71624b = dVar2;
                    this.f71623a = 1;
                    Object h11 = dVar2.h(this);
                    if (h11 == l11) {
                        return l11;
                    }
                    dVar = dVar2;
                    obj = h11;
                } catch (Throwable th3) {
                    dVar = dVar2;
                    th2 = th3;
                    c.this.Z().b(fx.e.d(), new fx.l(((mw.a) dVar.d()).i(), th2));
                    throw th2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (io.ktor.util.pipeline.d) this.f71624b;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    c.this.Z().b(fx.e.d(), new fx.l(((mw.a) dVar.d()).i(), th2));
                    throw th2;
                }
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {1329}, m = "execute$ktor_client_core", n = {}, s = {})
    /* renamed from: lw.c$c, reason: collision with other inner class name */
    public static final class C0864c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f71626a;

        /* renamed from: c, reason: collision with root package name */
        public int f71628c;

        public C0864c(j00.c<? super C0864c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f71626a = obj;
            this.f71628c |= Integer.MIN_VALUE;
            return c.this.C(null, this);
        }
    }

    public c(@m80.k ow.a engine, @m80.k j<? extends ow.j> userConfig) {
        kotlin.jvm.internal.g0.p(engine, "engine");
        kotlin.jvm.internal.g0.p(userConfig, "userConfig");
        this.f71606a = engine;
        this.f71607b = userConfig;
        boolean z11 = false;
        this.closed = 0;
        a0 a11 = n2.a((l2) engine.getCoroutineContext().get(l2.f7886e0));
        this.f71609d = a11;
        this.f71610e = engine.getCoroutineContext().plus(a11);
        int i11 = 1;
        v vVar = null;
        this.f71611f = new e0(z11, i11, vVar);
        ex.f fVar = new ex.f(z11, i11, vVar);
        this.f71612g = fVar;
        g0 g0Var = new g0(z11, i11, vVar);
        this.f71613h = g0Var;
        this.f71614i = new ex.b(z11, i11, vVar);
        this.f71615j = xy.d.a(true);
        this.f71616k = engine.getConfig();
        this.f71617l = new hx.c();
        j<ow.j> jVar = new j<>();
        this.f71618m = jVar;
        if (this.f71608c) {
            a11.z0(new x00.l() { // from class: lw.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 i12;
                    i12 = c.i(c.this, (Throwable) obj);
                    return i12;
                }
            });
        }
        engine.z5(this);
        g0Var.C(g0.f46880h.d(), new a(null));
        j.t(jVar, j0.i(), null, 2, null);
        j.t(jVar, rw.d.e(), null, 2, null);
        j.t(jVar, rw.p.e(), null, 2, null);
        if (userConfig.p()) {
            jVar.q("DefaultTransformers", new x00.l() { // from class: lw.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    return c.e((c) obj);
                }
            });
        }
        j.t(jVar, a1.f84565c, null, 2, null);
        j.t(jVar, rw.v.l(), null, 2, null);
        if (userConfig.o()) {
            j.t(jVar, f0.f(), null, 2, null);
        }
        jVar.y(userConfig);
        if (userConfig.p()) {
            j.t(jVar, c0.j(), null, 2, null);
        }
        rw.k.d(jVar);
        jVar.r(this);
        fVar.C(ex.f.f50195h.c(), new b(null));
    }

    public static g2 e(c install) {
        kotlin.jvm.internal.g0.p(install, "$this$install");
        rw.l.b(install);
        return g2.f100423a;
    }

    public static final g2 i(c cVar, Throwable th2) {
        if (th2 != null) {
            s0.f(cVar.f71606a, null, 1, null);
        }
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(@m80.k cx.y r5, @m80.k j00.c<? super mw.a> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lw.c.C0864c
            if (r0 == 0) goto L13
            r0 = r6
            lw.c$c r0 = (lw.c.C0864c) r0
            int r1 = r0.f71628c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71628c = r1
            goto L18
        L13:
            lw.c$c r0 = new lw.c$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f71626a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f71628c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            hx.c r6 = r4.f71617l
            hx.a r2 = fx.e.a()
            r6.b(r2, r5)
            cx.e0 r6 = r4.f71611f
            java.lang.Object r2 = r5.e()
            r0.f71628c = r3
            java.lang.Object r6 = r6.p(r5, r2, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.g0.n(r6, r5)
            mw.a r6 = (mw.a) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.c.C(cx.y, j00.c):java.lang.Object");
    }

    @m80.k
    public final j<ow.j> H() {
        return this.f71618m;
    }

    @m80.k
    public final ow.a S() {
        return this.f71606a;
    }

    @m80.k
    public final ow.j V() {
        return this.f71616k;
    }

    @m80.k
    public final hx.c Z() {
        return this.f71617l;
    }

    @m80.k
    public final ex.b c0() {
        return this.f71614i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f71605n.compareAndSet(this, 0, 1)) {
            xy.b bVar = (xy.b) this.f71615j.g(z.a());
            Iterator<T> it = bVar.f().iterator();
            while (it.hasNext()) {
                xy.a aVar = (xy.a) it.next();
                kotlin.jvm.internal.g0.n(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object g11 = bVar.g(aVar);
                if (g11 instanceof Closeable) {
                    ((Closeable) g11).close();
                }
            }
            this.f71609d.complete();
            if (this.f71608c) {
                this.f71606a.close();
            }
        }
    }

    @m80.k
    public final xy.b getAttributes() {
        return this.f71615j;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f71610e;
    }

    @m80.k
    public final e0 m0() {
        return this.f71611f;
    }

    @m80.k
    public final ex.f o0() {
        return this.f71612g;
    }

    @m80.k
    public final c r(@m80.k x00.l<? super j<?>, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        ow.a aVar = this.f71606a;
        j jVar = new j();
        jVar.y(this.f71607b);
        block.invoke(jVar);
        return new c(aVar, jVar, this.f71608c);
    }

    @m80.k
    public String toString() {
        return "HttpClient[" + this.f71606a + l50.b.f69930l;
    }

    @m80.k
    public final g0 v0() {
        return this.f71613h;
    }

    public final boolean y0(@m80.k ow.h<?> capability) {
        kotlin.jvm.internal.g0.p(capability, "capability");
        return this.f71606a.D2().contains(capability);
    }

    public /* synthetic */ c(ow.a aVar, j jVar, int i11, v vVar) {
        this(aVar, (i11 & 2) != 0 ? new j() : jVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@m80.k ow.a engine, @m80.k j<? extends ow.j> userConfig, boolean z11) {
        this(engine, userConfig);
        kotlin.jvm.internal.g0.p(engine, "engine");
        kotlin.jvm.internal.g0.p(userConfig, "userConfig");
        this.f71608c = z11;
    }
}
