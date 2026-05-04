package rw;

import c40.l2;
import com.tencent.open.SocialConstants;
import h10.t;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.net.SocketTimeoutException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.slf4j.Logger;
import sw.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpRequestRetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,409:1\n18#2:410\n18#2:427\n18#2:444\n18#2:461\n18#2:478\n58#3,16:411\n58#3,16:428\n58#3,16:445\n58#3,16:462\n58#3,16:479\n*S KotlinDebug\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryKt\n*L\n381#1:410\n384#1:427\n389#1:444\n394#1:461\n399#1:478\n381#1:411,16\n384#1:428,16\n389#1:445,16\n394#1:462,16\n399#1:479,16\n*E\n"})
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84807a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final hx.a<x0> f84808b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final sw.b<s0> f84809c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final xy.a<Integer> f84810d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final xy.a<x00.q<z0, cx.w, ex.c, Boolean>> f84811e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final xy.a<x00.q<z0, cx.y, Throwable, Boolean>> f84812f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final xy.a<x00.p<y0, cx.y, g2>> f84813g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final xy.a<x00.p<w0, Integer, Long>> f84814h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<s0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84815a = new a();

        public a() {
            super(0, s0.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            return new s0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {296, 313}, m = "invokeSuspend", n = {"$this$on", SocialConstants.TYPE_REQUEST, "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$on", SocialConstants.TYPE_REQUEST, "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
    public static final class b extends SuspendLambda implements x00.q<q.a, cx.y, j00.c<? super mw.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84816a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84817b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84818c;

        /* renamed from: d, reason: collision with root package name */
        public Object f84819d;

        /* renamed from: e, reason: collision with root package name */
        public Object f84820e;

        /* renamed from: f, reason: collision with root package name */
        public int f84821f;

        /* renamed from: g, reason: collision with root package name */
        public int f84822g;

        /* renamed from: h, reason: collision with root package name */
        public int f84823h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f84824i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f84825j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x00.q<z0, cx.w, ex.c, Boolean> f84826k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x00.q<z0, cx.y, Throwable, Boolean> f84827l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f84828m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ x00.p<w0, Integer, Long> f84829n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ x00.p<y0, cx.y, g2> f84830o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ sw.d<s0> f84831p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ x00.p<Long, j00.c<? super g2>, Object> f84832q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super z0, ? super cx.w, ? super ex.c, Boolean> qVar, x00.q<? super z0, ? super cx.y, ? super Throwable, Boolean> qVar2, int i11, x00.p<? super w0, ? super Integer, Long> pVar, x00.p<? super y0, ? super cx.y, g2> pVar2, sw.d<s0> dVar, x00.p<? super Long, ? super j00.c<? super g2>, ? extends Object> pVar3, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f84826k = qVar;
            this.f84827l = qVar2;
            this.f84828m = i11;
            this.f84829n = pVar;
            this.f84830o = pVar2;
            this.f84831p = dVar;
            this.f84832q = pVar3;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.a aVar, cx.y yVar, j00.c<? super mw.a> cVar) {
            b bVar = new b(this.f84826k, this.f84827l, this.f84828m, this.f84829n, this.f84830o, this.f84831p, this.f84832q, cVar);
            bVar.f84824i = aVar;
            bVar.f84825j = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00f3 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:10:0x00f3, B:11:0x0107, B:16:0x0123, B:19:0x012c, B:35:0x006f), top: B:34:0x006f }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x012b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x012c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:10:0x00f3, B:11:0x0107, B:16:0x0123, B:19:0x012c, B:35:0x006f), top: B:34:0x006f }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x019a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x019a -> B:6:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.v0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        h10.r rVar;
        h10.r rVar2;
        h10.r rVar3;
        h10.r rVar4;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        f84807a = ez.a.a("io.ktor.client.plugins.HttpRequestRetry");
        f84808b = new hx.a<>();
        f84809c = sw.i.b("RetryFeature", a.f84815a, new x00.l() { // from class: rw.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c11;
                c11 = v0.c((sw.d) obj);
                return c11;
            }
        });
        h10.d d11 = kotlin.jvm.internal.o0.d(Integer.class);
        h10.r rVar5 = null;
        try {
            rVar = kotlin.jvm.internal.o0.B(cls2);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84810d = new xy.a<>("MaxRetriesPerRequestAttributeKey", new gz.a(d11, rVar));
        h10.d d12 = kotlin.jvm.internal.o0.d(x00.q.class);
        try {
            t.a aVar = h10.t.f57954c;
            rVar2 = kotlin.jvm.internal.o0.E(x00.q.class, aVar.e(kotlin.jvm.internal.o0.B(z0.class)), aVar.e(kotlin.jvm.internal.o0.B(cx.w.class)), aVar.e(kotlin.jvm.internal.o0.B(ex.c.class)), aVar.e(kotlin.jvm.internal.o0.B(cls)));
        } catch (Throwable unused2) {
            rVar2 = null;
        }
        f84811e = new xy.a<>("ShouldRetryPerRequestAttributeKey", new gz.a(d12, rVar2));
        h10.d d13 = kotlin.jvm.internal.o0.d(x00.q.class);
        try {
            t.a aVar2 = h10.t.f57954c;
            rVar3 = kotlin.jvm.internal.o0.E(x00.q.class, aVar2.e(kotlin.jvm.internal.o0.B(z0.class)), aVar2.e(kotlin.jvm.internal.o0.B(cx.y.class)), aVar2.e(kotlin.jvm.internal.o0.B(Throwable.class)), aVar2.e(kotlin.jvm.internal.o0.B(cls)));
        } catch (Throwable unused3) {
            rVar3 = null;
        }
        f84812f = new xy.a<>("ShouldRetryOnExceptionPerRequestAttributeKey", new gz.a(d13, rVar3));
        h10.d d14 = kotlin.jvm.internal.o0.d(x00.p.class);
        try {
            t.a aVar3 = h10.t.f57954c;
            rVar4 = kotlin.jvm.internal.o0.E(x00.p.class, aVar3.e(kotlin.jvm.internal.o0.B(y0.class)), aVar3.e(kotlin.jvm.internal.o0.B(cx.y.class)), aVar3.e(kotlin.jvm.internal.o0.B(g2.class)));
        } catch (Throwable unused4) {
            rVar4 = null;
        }
        f84813g = new xy.a<>("ModifyRequestPerRequestAttributeKey", new gz.a(d14, rVar4));
        h10.d d15 = kotlin.jvm.internal.o0.d(x00.p.class);
        try {
            t.a aVar4 = h10.t.f57954c;
            rVar5 = kotlin.jvm.internal.o0.E(x00.p.class, aVar4.e(kotlin.jvm.internal.o0.B(w0.class)), aVar4.e(kotlin.jvm.internal.o0.B(cls2)), aVar4.e(kotlin.jvm.internal.o0.B(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        f84814h = new xy.a<>("RetryDelayPerRequestAttributeKey", new gz.a(d15, rVar5));
    }

    public static final g2 c(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        x00.q<z0, cx.w, ex.c, Boolean> w11 = ((s0) createClientPlugin.f()).w();
        x00.q<z0, cx.y, Throwable, Boolean> x11 = ((s0) createClientPlugin.f()).x();
        x00.p<w0, Integer, Long> t11 = ((s0) createClientPlugin.f()).t();
        x00.p<Long, j00.c<? super g2>, Object> s11 = ((s0) createClientPlugin.f()).s();
        createClientPlugin.g(sw.q.f88973a, new b(w11, x11, ((s0) createClientPlugin.f()).u(), t11, ((s0) createClientPlugin.f()).v(), createClientPlugin, s11, null));
        return g2.f100423a;
    }

    public static final cx.y d(cx.y yVar) {
        final cx.y r11 = new cx.y().r(yVar);
        yVar.h().z0(new x00.l() { // from class: rw.u0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = v0.e(cx.y.this, (Throwable) obj);
                return e11;
            }
        });
        return r11;
    }

    public static final g2 e(cx.y yVar, Throwable th2) {
        l2 h11 = yVar.h();
        kotlin.jvm.internal.g0.n(h11, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        c40.a0 a0Var = (c40.a0) h11;
        if (th2 == null) {
            a0Var.complete();
        } else {
            a0Var.r(th2);
        }
        return g2.f100423a;
    }

    public static final boolean f(int i11, int i12, x00.q<? super z0, ? super cx.w, ? super ex.c, Boolean> qVar, mw.a aVar) {
        return i11 < i12 && qVar.invoke(new z0(i11 + 1), aVar.h(), aVar.i()).booleanValue();
    }

    public static final boolean g(int i11, int i12, x00.q<? super z0, ? super cx.y, ? super Throwable, Boolean> qVar, cx.y yVar, Throwable th2) {
        return i11 < i12 && qVar.invoke(new z0(i11 + 1), yVar, th2).booleanValue();
    }

    @m80.k
    public static final sw.b<s0> r() {
        return f84809c;
    }

    @m80.k
    public static final hx.a<x0> t() {
        return f84808b;
    }

    public static final boolean u(Throwable th2) {
        Throwable a11 = fx.i.a(th2);
        return (a11 instanceof HttpRequestTimeoutException) || (a11 instanceof ConnectTimeoutException) || (a11 instanceof SocketTimeoutException);
    }

    public static final void v(@m80.k cx.y yVar, @m80.k x00.l<? super s0, g2> block) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        s0 s0Var = new s0();
        block.invoke(s0Var);
        yVar.d().e(f84811e, s0Var.w());
        yVar.d().e(f84812f, s0Var.x());
        yVar.d().e(f84814h, s0Var.t());
        yVar.d().e(f84810d, Integer.valueOf(s0Var.u()));
        yVar.d().e(f84813g, s0Var.v());
    }

    public static /* synthetic */ void s() {
    }
}
