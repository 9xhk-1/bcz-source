package pw;

import a00.w1;
import ax.y;
import c40.b2;
import c40.l2;
import c40.r0;
import com.baicizhan.client.business.webview.JsonParams;
import cx.f0;
import ix.g1;
import java.net.Proxy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import rw.c1;
import rw.d1;
import t50.q;
import xy.a0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOkHttpEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpEngine.kt\nio/ktor/client/engine/okhttp/OkHttpEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
/* loaded from: classes8.dex */
public final class k extends ow.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f81215j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final c0<t50.q> f81216k = e0.c(new x00.a() { // from class: pw.h
        @Override // x00.a
        public final Object invoke() {
            t50.q W0;
            W0 = k.W0();
            return W0;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final pw.g f81217e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<?>> f81218f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f81219g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f81220h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final Map<d1, t50.q> f81221i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nOkHttpEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpEngine.kt\nio/ktor/client/engine/okhttp/OkHttpEngine$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,248:1\n216#2,2:249\n*S KotlinDebug\n*F\n+ 1 OkHttpEngine.kt\nio/ktor/client/engine/okhttp/OkHttpEngine$1\n*L\n52#1:249,2\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f81222a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return k.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81222a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    d.b bVar = k.this.f81219g.get(l2.f7886e0);
                    g0.m(bVar);
                    this.f81222a = 1;
                    if (((l2) bVar).K0(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                while (it.hasNext()) {
                    t50.q qVar = (t50.q) ((Map.Entry) it.next()).getValue();
                    qVar.T().b();
                    qVar.Y().e().shutdown();
                }
                return g2.f100423a;
            } finally {
                it = k.this.f81221i.entrySet().iterator();
                while (it.hasNext()) {
                    t50.q qVar2 = (t50.q) ((Map.Entry) it.next()).getValue();
                    qVar2.T().b();
                    qVar2.Y().e().shutdown();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @m80.k
        public final t50.q a() {
            return (t50.q) k.f81216k.getValue();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements x00.l<d1, t50.q> {
        public c(Object obj) {
            super(1, obj, k.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t50.q invoke(d1 d1Var) {
            return ((k) this.receiver).D0(d1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0}, l = {61, 68, 69, 70}, m = "execute", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81224a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81225b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f81226c;

        /* renamed from: e, reason: collision with root package name */
        public int f81228e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81226c = obj;
            this.f81228e |= Integer.MIN_VALUE;
            return k.this.B0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {119}, m = "executeHttpRequest", n = {"this", "callContext", "requestData", "requestTime"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81229a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81230b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81231c;

        /* renamed from: d, reason: collision with root package name */
        public Object f81232d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81233e;

        /* renamed from: g, reason: collision with root package name */
        public int f81235g;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81233e = obj;
            this.f81235g |= Integer.MIN_VALUE;
            return k.this.G0(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {108}, m = "executeServerSendEventsRequest", n = {"this", "callContext", "requestTime", JsonParams.ShareResultO.CHANNEL_WEIXIN}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81236a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81237b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81238c;

        /* renamed from: d, reason: collision with root package name */
        public Object f81239d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81240e;

        /* renamed from: g, reason: collision with root package name */
        public int f81242g;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81240e = obj;
            this.f81242g |= Integer.MIN_VALUE;
            return k.this.K0(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0, 0, 0, 0}, l = {92}, m = "executeWebSocketRequest", n = {"this", "callContext", "requestTime", JsonParams.ShareResultO.CHANNEL_WEIXIN}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f81243a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81244b;

        /* renamed from: c, reason: collision with root package name */
        public Object f81245c;

        /* renamed from: d, reason: collision with root package name */
        public Object f81246d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f81247e;

        /* renamed from: g, reason: collision with root package name */
        public int f81249g;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81247e = obj;
            this.f81249g |= Integer.MIN_VALUE;
            return k.this.P0(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k pw.g config) {
        super("ktor-okhttp");
        g0.p(config, "config");
        this.f81217e = config;
        this.f81218f = w1.u(c1.f84603a, y.f5554a, zw.s.f102985a);
        this.f81221i = xy.n.a(new c(this), new x00.l() { // from class: pw.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 C0;
                C0 = k.C0((t50.q) obj);
                return C0;
            }
        }, getConfig().u());
        d.b bVar = super.getCoroutineContext().get(l2.f7886e0);
        g0.m(bVar);
        kotlin.coroutines.d a11 = a0.a((l2) bVar);
        this.f81219g = a11;
        this.f81220h = super.getCoroutineContext().plus(a11);
        c40.i.d(b2.f7824a, super.getCoroutineContext(), CoroutineStart.ATOMIC, new a(null));
    }

    public static final g2 C0(t50.q it) {
        g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 H0(okhttp3.o oVar, Throwable th2) {
        if (oVar != null) {
            oVar.close();
        }
        return g2.f100423a;
    }

    public static final t50.q W0() {
        return new q.a().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // ow.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k cx.z r11, @m80.k j00.c<? super cx.f0> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pw.k.d
            if (r0 == 0) goto L14
            r0 = r12
            pw.k$d r0 = (pw.k.d) r0
            int r1 = r0.f81228e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f81228e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            pw.k$d r0 = new pw.k$d
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f81226c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f81228e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L51
            if (r1 == r5) goto L44
            if (r1 == r4) goto L40
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            kotlin.e.n(r12)
            return r12
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            kotlin.e.n(r12)
            return r12
        L40:
            kotlin.e.n(r12)
            return r12
        L44:
            java.lang.Object r11 = r6.f81225b
            cx.z r11 = (cx.z) r11
            java.lang.Object r1 = r6.f81224a
            pw.k r1 = (pw.k) r1
            kotlin.e.n(r12)
        L4f:
            r5 = r11
            goto L63
        L51:
            kotlin.e.n(r12)
            r6.f81224a = r10
            r6.f81225b = r11
            r6.f81228e = r5
            java.lang.Object r12 = ow.u.e(r6)
            if (r12 != r0) goto L61
            goto Lb1
        L61:
            r1 = r10
            goto L4f
        L63:
            kotlin.coroutines.d r12 = (kotlin.coroutines.d) r12
            r11 = r3
            okhttp3.l r3 = pw.o.d(r5, r12)
            java.util.Map<rw.d1, t50.q> r7 = r1.f81221i
            rw.c1 r8 = rw.c1.f84603a
            java.lang.Object r8 = r5.c(r8)
            java.lang.Object r7 = r7.get(r8)
            t50.q r7 = (t50.q) r7
            if (r7 == 0) goto Lb3
            boolean r8 = cx.d0.k(r5)
            r9 = 0
            if (r8 == 0) goto L8f
            r6.f81224a = r9
            r6.f81225b = r9
            r6.f81228e = r4
            java.lang.Object r11 = r1.P0(r7, r3, r12, r6)
            if (r11 != r0) goto L8e
            goto Lb1
        L8e:
            return r11
        L8f:
            boolean r4 = cx.d0.j(r5)
            if (r4 == 0) goto La3
            r6.f81224a = r9
            r6.f81225b = r9
            r6.f81228e = r11
            java.lang.Object r11 = r1.K0(r7, r3, r12, r6)
            if (r11 != r0) goto La2
            goto Lb1
        La2:
            return r11
        La3:
            r6.f81224a = r9
            r6.f81225b = r9
            r6.f81228e = r2
            r4 = r12
            r2 = r7
            java.lang.Object r11 = r1.G0(r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            return r11
        Lb3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "OkHttpClient can't be constructed because HttpTimeout plugin is not installed"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.k.B0(cx.z, j00.c):java.lang.Object");
    }

    public final t50.q D0(d1 d1Var) {
        t50.q w11 = getConfig().w();
        if (w11 == null) {
            w11 = f81215j.a();
        }
        q.a l02 = w11.l0();
        l02.p(new t50.k());
        getConfig().v().invoke(l02);
        Proxy c11 = getConfig().c();
        if (c11 != null) {
            l02.g0(c11);
        }
        if (d1Var != null) {
            o.n(l02, d1Var);
        }
        return l02.f();
    }

    @Override // ow.e, ow.a
    @m80.k
    public Set<ow.h<?>> D2() {
        return this.f81218f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        r8 = pw.o.o(r0, r7, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(t50.q r5, okhttp3.l r6, kotlin.coroutines.d r7, cx.z r8, j00.c<? super cx.f0> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof pw.k.e
            if (r0 == 0) goto L13
            r0 = r9
            pw.k$e r0 = (pw.k.e) r0
            int r1 = r0.f81235g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81235g = r1
            goto L18
        L13:
            pw.k$e r0 = new pw.k$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f81233e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81235g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.f81232d
            bz.b r5 = (bz.b) r5
            java.lang.Object r6 = r0.f81231c
            r8 = r6
            cx.z r8 = (cx.z) r8
            java.lang.Object r6 = r0.f81230b
            r7 = r6
            kotlin.coroutines.d r7 = (kotlin.coroutines.d) r7
            java.lang.Object r6 = r0.f81229a
            pw.k r6 = (pw.k) r6
            kotlin.e.n(r9)
            goto L60
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.e.n(r9)
            r9 = 0
            bz.b r9 = io.ktor.util.date.a.c(r9, r3, r9)
            r0.f81229a = r4
            r0.f81230b = r7
            r0.f81231c = r8
            r0.f81232d = r9
            r0.f81235g = r3
            java.lang.Object r5 = pw.t.b(r5, r6, r8, r7, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L60:
            okhttp3.n r9 = (okhttp3.n) r9
            okhttp3.o r0 = r9.L()
            c40.l2$b r1 = c40.l2.f7886e0
            kotlin.coroutines.d$b r1 = r7.get(r1)
            kotlin.jvm.internal.g0.m(r1)
            c40.l2 r1 = (c40.l2) r1
            pw.i r2 = new pw.i
            r2.<init>()
            r1.z0(r2)
            if (r0 == 0) goto L87
            l60.m r0 = r0.V()
            if (r0 == 0) goto L87
            io.ktor.utils.io.g r8 = pw.o.g(r0, r7, r8)
            if (r8 != 0) goto L8d
        L87:
            io.ktor.utils.io.g$a r8 = io.ktor.utils.io.g.f62105a
            io.ktor.utils.io.g r8 = r8.a()
        L8d:
            cx.f0 r5 = r6.z0(r9, r5, r8, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.k.G0(t50.q, okhttp3.l, kotlin.coroutines.d, cx.z, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(t50.q r5, okhttp3.l r6, kotlin.coroutines.d r7, j00.c<? super cx.f0> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof pw.k.f
            if (r0 == 0) goto L13
            r0 = r8
            pw.k$f r0 = (pw.k.f) r0
            int r1 = r0.f81242g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81242g = r1
            goto L18
        L13:
            pw.k$f r0 = new pw.k$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f81240e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81242g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f81239d
            pw.q r5 = (pw.q) r5
            java.lang.Object r6 = r0.f81238c
            bz.b r6 = (bz.b) r6
            java.lang.Object r7 = r0.f81237b
            kotlin.coroutines.d r7 = (kotlin.coroutines.d) r7
            java.lang.Object r0 = r0.f81236a
            pw.k r0 = (pw.k) r0
            kotlin.e.n(r8)
            goto L67
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.e.n(r8)
            r8 = 0
            bz.b r8 = io.ktor.util.date.a.c(r8, r3, r8)
            pw.q r2 = new pw.q
            r2.<init>(r5, r6, r7)
            c40.x r5 = r2.h()
            r0.f81236a = r4
            r0.f81237b = r7
            r0.f81238c = r8
            r0.f81239d = r2
            r0.f81242g = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
            r6 = r8
            r8 = r5
            r5 = r2
        L67:
            okhttp3.n r8 = (okhttp3.n) r8
            cx.f0 r5 = r0.z0(r8, r6, r5, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.k.K0(t50.q, okhttp3.l, kotlin.coroutines.d, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(t50.q r6, okhttp3.l r7, kotlin.coroutines.d r8, j00.c<? super cx.f0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof pw.k.g
            if (r0 == 0) goto L13
            r0 = r9
            pw.k$g r0 = (pw.k.g) r0
            int r1 = r0.f81249g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81249g = r1
            goto L18
        L13:
            pw.k$g r0 = new pw.k$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f81247e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81249g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f81246d
            pw.r r6 = (pw.r) r6
            java.lang.Object r7 = r0.f81245c
            bz.b r7 = (bz.b) r7
            java.lang.Object r8 = r0.f81244b
            kotlin.coroutines.d r8 = (kotlin.coroutines.d) r8
            java.lang.Object r0 = r0.f81243a
            pw.k r0 = (pw.k) r0
            kotlin.e.n(r9)
            goto L75
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.e.n(r9)
            r9 = 0
            bz.b r9 = io.ktor.util.date.a.c(r9, r3, r9)
            pw.r r2 = new pw.r
            pw.g r4 = r5.getConfig()
            t50.s$a r4 = r4.x()
            if (r4 != 0) goto L56
            r4 = r6
        L56:
            r2.<init>(r6, r4, r7, r8)
            r2.p()
            c40.x r6 = r2.n()
            r0.f81243a = r5
            r0.f81244b = r8
            r0.f81245c = r9
            r0.f81246d = r2
            r0.f81249g = r3
            java.lang.Object r6 = r6.i(r0)
            if (r6 != r1) goto L71
            return r1
        L71:
            r0 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L75:
            okhttp3.n r9 = (okhttp3.n) r9
            cx.f0 r6 = r0.z0(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.k.P0(t50.q, okhttp3.l, kotlin.coroutines.d, j00.c):java.lang.Object");
    }

    @Override // ow.a
    @m80.k
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public pw.g getConfig() {
        return this.f81217e;
    }

    @Override // ow.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        d.b bVar = this.f81219g.get(l2.f7886e0);
        g0.n(bVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((c40.a0) bVar).complete();
    }

    @Override // ow.e, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f81220h;
    }

    public final f0 z0(okhttp3.n nVar, bz.b bVar, Object obj, kotlin.coroutines.d dVar) {
        return new f0(new g1(nVar.Z(), nVar.o0()), bVar, t.c(nVar.k0()), t.d(nVar.y0()), obj, dVar);
    }
}
