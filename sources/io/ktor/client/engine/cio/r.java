package io.ktor.client.engine.cio;

import c40.a1;
import c40.l2;
import c40.q0;
import c40.r0;
import com.jiongji.andriod.card.R;
import com.tencent.open.SocialConstants;
import cx.f0;
import e40.l0;
import io.ktor.client.engine.cio.r;
import io.ktor.utils.io.g;
import java.io.Closeable;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import rw.c1;
import rw.d1;
import rw.f1;
import tx.k0;
import tx.p0;
import ux.d0;
import ux.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r implements r0, Closeable {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f60930m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f60931n = AtomicIntegerFieldUpdater.newUpdater(r.class, "connections");

    /* renamed from: o, reason: collision with root package name */
    public static final long f60932o = 1000;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f60933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60934b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Proxy f60935c;

    @m80.k
    private volatile /* synthetic */ int connections;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f60936d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final io.ktor.client.engine.cio.e f60937e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final io.ktor.client.engine.cio.i f60938f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60939g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final x00.a<g2> f60940h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final e40.o<z> f60941i;

    /* renamed from: j, reason: collision with root package name */
    public final long f60942j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public tx.a0 f60943k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final l2 f60944l;

    @m80.k
    volatile /* synthetic */ long lastActivity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}, l = {218, R.styleable.Theme_drawable_share, R.styleable.Theme_drawable_tab_lecture_new, 240}, m = "connect", n = {"this", "requestData", "address", "this", "requestData", "timeoutFails", "address", "connectAttempts", "connectTimeout", "socketTimeout", "this", "requestData", "address", "socket", c60.c.f8163j, "this", "address", "socket"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60945a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60946b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60947c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60948d;

        /* renamed from: e, reason: collision with root package name */
        public Object f60949e;

        /* renamed from: f, reason: collision with root package name */
        public int f60950f;

        /* renamed from: g, reason: collision with root package name */
        public int f60951g;

        /* renamed from: h, reason: collision with root package name */
        public long f60952h;

        /* renamed from: i, reason: collision with root package name */
        public long f60953i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f60954j;

        /* renamed from: l, reason: collision with root package name */
        public int f60956l;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60954j = obj;
            this.f60956l |= Integer.MIN_VALUE;
            return r.this.y0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", f = "Endpoint.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nEndpoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Endpoint.kt\nio/ktor/client/engine/cio/Endpoint$connect$2$connect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n1#2:344\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super k0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60957a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ tx.a0 f60959c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f60960d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tx.a0 a0Var, long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f60959c = a0Var;
            this.f60960d = j11;
        }

        public static final g2 j(long j11, p0.e eVar) {
            eVar.A(j11);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return r.this.new c(this.f60959c, this.f60960d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super k0> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f60957a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.client.engine.cio.i iVar = r.this.f60938f;
                tx.a0 a0Var = this.f60959c;
                final long j11 = this.f60960d;
                x00.l<? super p0.e, g2> lVar = new x00.l() { // from class: io.ktor.client.engine.cio.s
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 j12;
                        j12 = r.c.j(j11, (p0.e) obj2);
                        return j12;
                    }
                };
                this.f60957a = 1;
                obj = iVar.c(a0Var, lVar, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            r.this.f60943k = this.f60959c;
            return obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0}, l = {185}, m = "createPipeline", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60961a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f60962b;

        /* renamed from: d, reason: collision with root package name */
        public int f60964d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60962b = obj;
            this.f60964d |= Integer.MIN_VALUE;
            return r.this.C0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {1, 1, 2}, l = {67, 73, 74}, m = "execute", n = {"response", "task", "task"}, s = {"L$0", "L$1", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60965a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60966b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f60967c;

        /* renamed from: e, reason: collision with root package name */
        public int f60969e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60967c = obj;
            this.f60969e |= Integer.MIN_VALUE;
            return r.this.G0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0, 0, 1, 2, 2, 2, 2, 2, 3}, l = {103, 132, 134, 135}, m = "makeDedicatedRequest", n = {"this", SocialConstants.TYPE_REQUEST, "callContext", SocialConstants.TYPE_REQUEST, SocialConstants.TYPE_REQUEST, "callContext", "input", "originOutput", "requestTime", SocialConstants.TYPE_REQUEST}, s = {"L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60970a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60971b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60972c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60973d;

        /* renamed from: e, reason: collision with root package name */
        public Object f60974e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f60975f;

        /* renamed from: h, reason: collision with root package name */
        public int f60977h;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60975f = obj;
            this.f60977h |= Integer.MIN_VALUE;
            return r.this.K0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", i = {0, 0}, l = {87, 94}, m = "makePipelineRequest", n = {"this", "task"}, s = {"L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60978a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60979b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f60980c;

        /* renamed from: e, reason: collision with root package name */
        public int f60982e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60980c = obj;
            this.f60982e |= Integer.MIN_VALUE;
            return r.this.R0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2", f = "Endpoint.kt", i = {5}, l = {151, 153, 158, 165, 169, 173, 178, 181}, m = "invokeSuspend", n = {"response"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60983a;

        /* renamed from: b, reason: collision with root package name */
        public int f60984b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ cx.z f60985c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60986d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f60987e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ bz.b f60988f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f60989g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.m f60990h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f60991i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2$responseReady$1", f = "Endpoint.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f60992a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ io.ktor.utils.io.g f60993b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(io.ktor.utils.io.g gVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f60993b = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f60993b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f60992a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                io.ktor.utils.io.g gVar = this.f60993b;
                this.f60992a = 1;
                Object a11 = g.b.a(gVar, 0, this, 1, null);
                return a11 == l11 ? l11 : a11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(cx.z zVar, io.ktor.utils.io.m mVar, boolean z11, bz.b bVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar2, kotlin.coroutines.d dVar, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f60985c = zVar;
            this.f60986d = mVar;
            this.f60987e = z11;
            this.f60988f = bVar;
            this.f60989g = gVar;
            this.f60990h = mVar2;
            this.f60991i = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f60985c, this.f60986d, this.f60987e, this.f60988f, this.f60989g, this.f60990h, this.f60991i, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super f0> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
        
            if (io.ktor.client.engine.cio.c0.v(r1, r2, r3, r4, false, r9, 16, null) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
        
            if (io.ktor.client.engine.cio.c0.q(r1, r2, r3, false, r5, 8, null) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            if (r10 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
        
            if (io.ktor.client.engine.cio.c0.q(r1, r2, r3, false, r5, 8, null) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        
            if (r10 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0047, code lost:
        
            if (io.ktor.client.engine.cio.c0.s(r1, r2, r3, false, r5, 8, null) == r0) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.Endpoint$timeout$1", f = "Endpoint.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60994a;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return r.this.new i(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f60994a;
            if (i11 == 0) {
                kotlin.e.n(obj);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    kotlin.e.n(obj);
                } catch (Throwable unused) {
                }
            }
            do {
                d11 = (r.this.lastActivity + r.this.f60942j) - io.ktor.util.date.a.d();
                if (d11 <= 0) {
                    l0.a.a(r.this.f60941i, null, 1, null);
                    r.this.f60940h.invoke();
                    return g2.f100423a;
                }
                this.f60994a = 1;
            } while (a1.b(d11, this) != l11);
            return l11;
        }
    }

    public r(@m80.k String host, int i11, @m80.l Proxy proxy, boolean z11, @m80.k io.ktor.client.engine.cio.e config, @m80.k io.ktor.client.engine.cio.i connectionFactory, @m80.k kotlin.coroutines.d coroutineContext, @m80.k x00.a<g2> onDone) {
        l2 f11;
        g0.p(host, "host");
        g0.p(config, "config");
        g0.p(connectionFactory, "connectionFactory");
        g0.p(coroutineContext, "coroutineContext");
        g0.p(onDone, "onDone");
        this.f60933a = host;
        this.f60934b = i11;
        this.f60935c = proxy;
        this.f60936d = z11;
        this.f60937e = config;
        this.f60938f = connectionFactory;
        this.f60939g = coroutineContext;
        this.f60940h = onDone;
        this.lastActivity = io.ktor.util.date.a.d();
        this.connections = 0;
        this.f60941i = e40.r.d(0, null, null, 7, null);
        this.f60942j = 2 * config.j().c();
        f11 = c40.k.f(this, getCoroutineContext().plus(new q0("Endpoint timeout(" + host + ':' + i11 + ')')), null, new i(null), 2, null);
        this.f60944l = f11;
    }

    public static final g2 D0(r rVar, Throwable th2) {
        rVar.Y0();
        return g2.f100423a;
    }

    public static final g2 P0(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, tx.p pVar, r rVar, Throwable th2) {
        Throwable a11 = th2 != null ? fx.i.a(th2) : null;
        try {
            gVar.a(a11);
            io.ktor.utils.io.q.e(mVar, a11);
            pVar.c().close();
        } finally {
            try {
                return g2.f100423a;
            } finally {
            }
        }
        return g2.f100423a;
    }

    private final void Y0() {
        tx.a0 a0Var = this.f60943k;
        if (a0Var == null) {
            return;
        }
        this.f60938f.g(a0Var);
        f60931n.decrementAndGet(this);
    }

    public static final g2 z0(r rVar, tx.a0 a0Var, d0 tls) {
        g0.p(tls, "$this$tls");
        e0.f(tls, rVar.f60937e.k());
        String e11 = tls.e();
        if (e11 == null) {
            e11 = a0Var.g();
        }
        tls.i(e11);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(cx.z r13, j00.c<? super yz.g2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof io.ktor.client.engine.cio.r.d
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.client.engine.cio.r$d r0 = (io.ktor.client.engine.cio.r.d) r0
            int r1 = r0.f60964d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60964d = r1
            goto L18
        L13:
            io.ktor.client.engine.cio.r$d r0 = new io.ktor.client.engine.cio.r$d
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f60962b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60964d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r13 = r0.f60961a
            io.ktor.client.engine.cio.r r13 = (io.ktor.client.engine.cio.r) r13
            kotlin.e.n(r14)
            goto L44
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.e.n(r14)
            r0.f60961a = r12
            r0.f60964d = r3
            java.lang.Object r14 = r12.y0(r13, r0)
            if (r14 != r1) goto L43
            return r1
        L43:
            r13 = r12
        L44:
            r8 = r14
            tx.p r8 = (tx.p) r8
            io.ktor.client.engine.cio.j r4 = new io.ktor.client.engine.cio.j
            io.ktor.client.engine.cio.e r14 = r13.f60937e
            io.ktor.client.engine.cio.t r14 = r14.j()
            long r5 = r14.d()
            io.ktor.client.engine.cio.e r14 = r13.f60937e
            io.ktor.client.engine.cio.t r14 = r14.j()
            int r7 = r14.f()
            java.net.Proxy r14 = r13.f60935c
            if (r14 == 0) goto L63
        L61:
            r9 = r3
            goto L65
        L63:
            r3 = 0
            goto L61
        L65:
            e40.o<io.ktor.client.engine.cio.z> r10 = r13.f60941i
            kotlin.coroutines.d r11 = r13.getCoroutineContext()
            r4.<init>(r5, r7, r8, r9, r10, r11)
            c40.l2 r14 = r4.h()
            io.ktor.client.engine.cio.o r0 = new io.ktor.client.engine.cio.o
            r0.<init>()
            r14.z0(r0)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.C0(cx.z, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(@m80.k cx.z r10, @m80.k kotlin.coroutines.d r11, @m80.k j00.c<? super cx.f0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.ktor.client.engine.cio.r.e
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.client.engine.cio.r$e r0 = (io.ktor.client.engine.cio.r.e) r0
            int r1 = r0.f60969e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60969e = r1
            goto L18
        L13:
            io.ktor.client.engine.cio.r$e r0 = new io.ktor.client.engine.cio.r$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f60967c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60969e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r0.f60965a
            io.ktor.client.engine.cio.z r10 = (io.ktor.client.engine.cio.z) r10
            kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L34
            return r12
        L34:
            r11 = move-exception
            goto L8e
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.f60966b
            io.ktor.client.engine.cio.z r10 = (io.ktor.client.engine.cio.z) r10
            java.lang.Object r11 = r0.f60965a
            c40.x r11 = (c40.x) r11
            kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L34
            goto L7e
        L4a:
            kotlin.e.n(r12)
            return r12
        L4e:
            kotlin.e.n(r12)
            long r7 = io.ktor.util.date.a.d()
            r9.lastActivity = r7
            io.ktor.client.engine.cio.e r12 = r9.f60937e
            boolean r12 = r12.b()
            if (r12 == 0) goto L96
            boolean r12 = io.ktor.client.engine.cio.w.b(r10)
            if (r12 == 0) goto L66
            goto L96
        L66:
            c40.x r12 = c40.z.c(r5, r6, r5)
            io.ktor.client.engine.cio.z r2 = new io.ktor.client.engine.cio.z
            r2.<init>(r10, r12, r11)
            r0.f60965a = r12     // Catch: java.lang.Throwable -> L8c
            r0.f60966b = r2     // Catch: java.lang.Throwable -> L8c
            r0.f60969e = r4     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r9.R0(r2, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L7c
            goto L9e
        L7c:
            r11 = r12
            r10 = r2
        L7e:
            r0.f60965a = r10     // Catch: java.lang.Throwable -> L34
            r0.f60966b = r5     // Catch: java.lang.Throwable -> L34
            r0.f60969e = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r10 = r11.i(r0)     // Catch: java.lang.Throwable -> L34
            if (r10 != r1) goto L8b
            goto L9e
        L8b:
            return r10
        L8c:
            r11 = move-exception
            r10 = r2
        L8e:
            c40.x r10 = r10.h()
            r10.r(r11)
            throw r11
        L96:
            r0.f60969e = r6
            java.lang.Object r10 = r9.K0(r10, r11, r0)
            if (r10 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.G0(cx.z, kotlin.coroutines.d, j00.c):java.lang.Object");
    }

    public final Exception H0(int i11, int i12, cx.z zVar) {
        return i12 == i11 ? f1.d(zVar, null, 2, null) : new FailToConnectException();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|8|(3:(1:(1:(1:(4:14|15|16|17)(2:19|20))(9:21|22|23|24|25|26|(3:28|16|17)|29|30))(4:37|38|39|40))(4:41|42|43|44)|35|36)(4:62|63|(1:65)|30)|45|(1:47)(1:60)|48|(7:50|51|52|53|(3:55|39|40)|29|30)(4:56|57|(5:59|25|26|(0)|29)|30)))|70|6|7|8|(0)(0)|45|(0)(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0040, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0041, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011c, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #3 {all -> 0x008c, blocks: (B:43:0x0083, B:45:0x00a8, B:48:0x00e7, B:50:0x00ff, B:57:0x0123), top: B:42:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008f  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(cx.z r18, kotlin.coroutines.d r19, j00.c<? super cx.f0> r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.K0(cx.z, kotlin.coroutines.d, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r7.b(r6, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (C0(r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(io.ktor.client.engine.cio.z r6, j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.engine.cio.r.g
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.engine.cio.r$g r0 = (io.ktor.client.engine.cio.r.g) r0
            int r1 = r0.f60982e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60982e = r1
            goto L18
        L13:
            io.ktor.client.engine.cio.r$g r0 = new io.ktor.client.engine.cio.r$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f60980c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60982e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L8c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f60979b
            io.ktor.client.engine.cio.z r6 = (io.ktor.client.engine.cio.z) r6
            java.lang.Object r2 = r0.f60978a
            io.ktor.client.engine.cio.r r2 = (io.ktor.client.engine.cio.r) r2
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L40
            goto L7c
        L40:
            r7 = move-exception
            goto L73
        L42:
            kotlin.e.n(r7)
            e40.o<io.ktor.client.engine.cio.z> r7 = r5.f60941i
            java.lang.Object r7 = r7.m(r6)
            boolean r7 = e40.s.m(r7)
            if (r7 == 0) goto L54
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L54:
            int r7 = r5.connections
            io.ktor.client.engine.cio.e r2 = r5.f60937e
            io.ktor.client.engine.cio.t r2 = r2.j()
            int r2 = r2.e()
            if (r7 >= r2) goto L7b
            cx.z r7 = r6.g()     // Catch: java.lang.Throwable -> L40
            r0.f60978a = r5     // Catch: java.lang.Throwable -> L40
            r0.f60979b = r6     // Catch: java.lang.Throwable -> L40
            r0.f60982e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r5.C0(r7, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L7b
            goto L8b
        L73:
            c40.x r6 = r6.h()
            r6.r(r7)
            throw r7
        L7b:
            r2 = r5
        L7c:
            e40.o<io.ktor.client.engine.cio.z> r7 = r2.f60941i
            r2 = 0
            r0.f60978a = r2
            r0.f60979b = r2
            r0.f60982e = r3
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L8c
        L8b:
            return r1
        L8c:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.R0(io.ktor.client.engine.cio.z, j00.c):java.lang.Object");
    }

    public final Object W0(cx.z zVar, io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, io.ktor.utils.io.m mVar2, kotlin.coroutines.d dVar, bz.b bVar, boolean z11, j00.c<? super f0> cVar) {
        return c40.i.h(dVar, new h(zVar, mVar, z11, bVar, gVar, mVar2, dVar, null), cVar);
    }

    public final Pair<Long, Long> Z0(cx.z zVar) {
        Pair<Long, Long> a11 = h1.a(Long.valueOf(this.f60937e.j().c()), Long.valueOf(this.f60937e.j().g()));
        d1 d1Var = (d1) zVar.c(c1.f84603a);
        if (d1Var == null) {
            return a11;
        }
        Long e11 = d1Var.e();
        long longValue = e11 != null ? e11.longValue() : this.f60937e.j().g();
        Long c11 = d1Var.c();
        return h1.a(Long.valueOf(c11 != null ? c11.longValue() : this.f60937e.j().c()), Long.valueOf(longValue));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l2.a.b(this.f60944l, null, 1, null);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60939g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a2 A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:38:0x019c, B:41:0x01b7, B:48:0x01a2, B:73:0x0165, B:75:0x0169, B:76:0x0174, B:78:0x0178), top: B:72:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147 A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:56:0x0143, B:58:0x0147, B:61:0x00e1, B:63:0x00fa, B:85:0x011e), top: B:55:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1 A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #5 {all -> 0x011a, blocks: (B:56:0x0143, B:58:0x0147, B:61:0x00e1, B:63:0x00fa, B:85:0x011e), top: B:55:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0139 -> B:55:0x0143). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(cx.z r22, j00.c<? super tx.p> r23) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.r.y0(cx.z, j00.c):java.lang.Object");
    }
}
