package rw;

import androidx.collection.SieveCacheKt;
import c40.l2;
import c40.n2;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import ix.i2;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.slf4j.Logger;
import rw.f1;
import sw.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84644a = ez.a.a("io.ktor.client.plugins.HttpTimeout");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<d1> f84645b = sw.i.b("HttpTimeout", a.f84646a, new x00.l() { // from class: rw.e1
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 f11;
            f11 = f1.f((sw.d) obj);
            return f11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends AdaptedFunctionReference implements x00.a<d1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84646a = new a();

        public a() {
            super(0, d1.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1 invoke() {
            return new d1(null, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1", f = "HttpTimeout.kt", i = {}, l = {144, 175}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<q.a, cx.y, j00.c<? super mw.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84647a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84648b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84649c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f84650d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f84651e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Long f84652f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1$1$killer$1", f = "HttpTimeout.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f84653a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Long f84654b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ cx.y f84655c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l2 f84656d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Long l11, cx.y yVar, l2 l2Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f84654b = l11;
                this.f84655c = yVar;
                this.f84656d = l2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f84654b, this.f84655c, this.f84656d, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f84653a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    long longValue = this.f84654b.longValue();
                    this.f84653a = 1;
                    if (c40.a1.b(longValue, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.f84655c);
                f1.f84644a.trace("Request timeout: " + this.f84655c.j());
                l2 l2Var = this.f84656d;
                String message = httpRequestTimeoutException.getMessage();
                kotlin.jvm.internal.g0.m(message);
                n2.e(l2Var, message, httpRequestTimeoutException);
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Long l11, Long l12, Long l13, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f84650d = l11;
            this.f84651e = l12;
            this.f84652f = l13;
        }

        public static final g2 k(l2 l2Var, Throwable th2) {
            l2.a.b(l2Var, null, 1, null);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final l2 f11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84647a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.e.n(obj);
                    return obj;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            q.a aVar = (q.a) this.f84648b;
            cx.y yVar = (cx.y) this.f84649c;
            if (i2.b(yVar.j().o()) || (yVar.e() instanceof cx.u) || (yVar.e() instanceof zw.t)) {
                this.f84648b = null;
                this.f84647a = 1;
                Object a11 = aVar.a(yVar, this);
                if (a11 != l11) {
                    return a11;
                }
            } else {
                c1 c1Var = c1.f84603a;
                d1 d1Var = (d1) yVar.g(c1Var);
                if (d1Var == null && f1.g(this.f84650d, this.f84651e, this.f84652f)) {
                    d1 d1Var2 = new d1(null, null, null, 7, null);
                    yVar.n(c1Var, d1Var2);
                    d1Var = d1Var2;
                }
                if (d1Var != null) {
                    Long l12 = this.f84651e;
                    Long l13 = this.f84652f;
                    Long l14 = this.f84650d;
                    Long c11 = d1Var.c();
                    if (c11 != null) {
                        l12 = c11;
                    }
                    d1Var.f(l12);
                    Long e11 = d1Var.e();
                    if (e11 != null) {
                        l13 = e11;
                    }
                    d1Var.h(l13);
                    Long d11 = d1Var.d();
                    if (d11 != null) {
                        l14 = d11;
                    }
                    d1Var.g(l14);
                    Long d12 = d1Var.d();
                    if (d12 != null && d12.longValue() != Long.MAX_VALUE) {
                        f11 = c40.k.f(aVar, null, null, new a(d12, yVar, yVar.h(), null), 3, null);
                        yVar.h().z0(new x00.l() { // from class: rw.g1
                            @Override // x00.l
                            public final Object invoke(Object obj2) {
                                g2 k11;
                                k11 = f1.b.k(l2.this, (Throwable) obj2);
                                return k11;
                            }
                        });
                    }
                }
                this.f84648b = null;
                this.f84647a = 2;
                Object a12 = aVar.a(yVar, this);
                if (a12 != l11) {
                    return a12;
                }
            }
            return l11;
        }

        @Override // x00.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.a aVar, cx.y yVar, j00.c<? super mw.a> cVar) {
            b bVar = new b(this.f84650d, this.f84651e, this.f84652f, cVar);
            bVar.f84648b = aVar;
            bVar.f84649c = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }
    }

    @m80.k
    public static final ConnectTimeoutException b(@m80.k cx.z request, @m80.l Throwable th2) {
        Object obj;
        kotlin.jvm.internal.g0.p(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", connect_timeout=");
        d1 d1Var = (d1) request.c(c1.f84603a);
        if (d1Var == null || (obj = d1Var.c()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new ConnectTimeoutException(sb2.toString(), th2);
    }

    @m80.k
    public static final ConnectTimeoutException c(@m80.k String url, @m80.l Long l11, @m80.l Throwable th2) {
        kotlin.jvm.internal.g0.p(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(url);
        sb2.append(", connect_timeout=");
        Object obj = l11;
        if (l11 == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new ConnectTimeoutException(sb2.toString(), th2);
    }

    public static /* synthetic */ ConnectTimeoutException d(cx.z zVar, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return b(zVar, th2);
    }

    public static /* synthetic */ ConnectTimeoutException e(String str, Long l11, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        return c(str, l11, th2);
    }

    public static final g2 f(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(sw.q.f88973a, new b(((d1) createClientPlugin.f()).d(), ((d1) createClientPlugin.f()).c(), ((d1) createClientPlugin.f()).e(), null));
        return g2.f100423a;
    }

    public static final boolean g(Long l11, Long l12, Long l13) {
        return (l11 == null && l12 == null && l13 == null) ? false : true;
    }

    @m80.k
    public static final SocketTimeoutException h(@m80.k cx.z request, @m80.l Throwable th2) {
        Object obj;
        kotlin.jvm.internal.g0.p(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", socket_timeout=");
        d1 d1Var = (d1) request.c(c1.f84603a);
        if (d1Var == null || (obj = d1Var.e()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        return qw.a.a(sb2.toString(), th2);
    }

    public static /* synthetic */ SocketTimeoutException i(cx.z zVar, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return h(zVar, th2);
    }

    @io.ktor.utils.io.b0
    public static final int l(long j11) {
        if (j11 == Long.MAX_VALUE) {
            return 0;
        }
        if (j11 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        if (j11 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j11;
    }

    @io.ktor.utils.io.b0
    public static final long m(long j11) {
        if (j11 == Long.MAX_VALUE) {
            return 0L;
        }
        return j11;
    }

    @m80.k
    public static final sw.b<d1> n() {
        return f84645b;
    }

    public static final void p(@m80.k cx.y yVar, @m80.k x00.l<? super d1, g2> block) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        c1 c1Var = c1.f84603a;
        d1 d1Var = new d1(null, null, null, 7, null);
        block.invoke(d1Var);
        yVar.n(c1Var, d1Var);
    }

    @yz.v0
    public static final <T> T q(@m80.k x00.a<? extends T> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            return block.invoke();
        } catch (CancellationException e11) {
            throw fx.i.a(e11);
        }
    }

    public static /* synthetic */ void o() {
    }
}
