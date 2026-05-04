package io.ktor.client.engine.apache;

import c40.a0;
import c40.b2;
import c40.h1;
import c40.p2;
import c40.r0;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.io.g;
import io.ktor.utils.io.m0;
import ix.e1;
import ix.j2;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import u30.k0;
import w70.z;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApacheRequestProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApacheRequestProducer.kt\nio/ktor/client/engine/apache/ApacheRequestProducer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes8.dex */
public final class p implements z, r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final cx.z f60767a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final j f60768b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final HttpUriRequest f60769c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final HttpHost f60770d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final v f60771e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final a0 f60772f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60773g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f60774h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.apache.ApacheRequestProducer$getChannel$1", f = "ApacheRequestProducer.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60775a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f60776b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mx.v f60777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mx.v vVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f60777c = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f60777c, cVar);
            aVar.f60776b = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f60775a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                m0 m0Var = (m0) this.f60776b;
                v.f fVar = (v.f) this.f60777c;
                io.ktor.utils.io.m a11 = m0Var.a();
                this.f60775a = 1;
                if (fVar.m(a11, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.apache.ApacheRequestProducer$produceContent$3", f = "ApacheRequestProducer.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60778a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return p.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f60778a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.utils.io.g gVar = p.this.f60774h;
                    this.f60778a = 1;
                    obj = g.b.a(gVar, 0, this, 1, null);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                ((Boolean) obj).getClass();
                p.this.f60771e.d();
                return g2.f100423a;
            } catch (Throwable th2) {
                p.this.f60771e.d();
                throw th2;
            }
        }
    }

    public p(@m80.k cx.z requestData, @m80.k j config, @m80.k kotlin.coroutines.d callContext) {
        a0 c11;
        g0.p(requestData, "requestData");
        g0.p(config, "config");
        g0.p(callContext, "callContext");
        this.f60767a = requestData;
        this.f60768b = config;
        HttpUriRequest c02 = c0();
        this.f60769c = c02;
        HttpHost extractHost = URIUtils.extractHost(c02.getURI());
        if (extractHost == null) {
            throw new IllegalArgumentException("Cannot extract host from URL " + c02.getURI());
        }
        this.f60770d = extractHost;
        this.f60771e = new v();
        c11 = p2.c(null, 1, null);
        this.f60772f = c11;
        this.f60773g = callContext.plus(c11);
        this.f60774h = S(callContext, requestData.b());
        c11.z0(new x00.l() { // from class: io.ktor.client.engine.apache.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = p.r(p.this, (Throwable) obj);
                return r11;
            }
        });
    }

    public static final int Z(m70.c cVar, ByteBuffer buffer) {
        g0.p(buffer, "buffer");
        return cVar.write(buffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 m0(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, RequestBuilder requestBuilder, String key, String value) {
        g0.p(key, "key");
        g0.p(value, "value");
        if (g0.g(key, "Content-Length")) {
            objectRef.element = value;
        } else if (g0.g(key, "Content-Type")) {
            objectRef2.element = value;
        } else {
            requestBuilder.addHeader(key, value);
        }
        return g2.f100423a;
    }

    public static final g2 r(p pVar, Throwable th2) {
        pVar.f60774h.a(th2);
        return g2.f100423a;
    }

    @Override // w70.z
    @m80.k
    public HttpRequest G() {
        return this.f60769c;
    }

    public final io.ktor.utils.io.g S(kotlin.coroutines.d dVar, mx.v vVar) {
        if (vVar instanceof v.a) {
            return io.ktor.utils.io.c.e(((v.a) vVar).m(), 0, 0, 6, null);
        }
        if (vVar instanceof v.d) {
            throw new UnsupportedContentTypeException(vVar);
        }
        if (vVar instanceof v.c) {
            return io.ktor.utils.io.g.f62105a.a();
        }
        if (vVar instanceof v.e) {
            return ((v.e) vVar).m();
        }
        if (vVar instanceof v.f) {
            return io.ktor.utils.io.q.C(b2.f7824a, dVar, true, new a(vVar, null)).b();
        }
        if (vVar instanceof v.b) {
            return S(dVar, ((v.b) vVar).n());
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public final cx.z V() {
        return this.f60767a;
    }

    @Override // w70.z, w70.b0
    public void b(@m80.k Exception cause) {
        g0.p(cause, "cause");
        Exception a11 = l.a(cause, this.f60767a);
        this.f60774h.a(a11);
        this.f60772f.r(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HttpUriRequest c0() {
        RequestConfig.Builder b11;
        cx.z zVar = this.f60767a;
        final RequestBuilder create = RequestBuilder.create(zVar.f().l());
        g0.m(create);
        create.setUri(j2.d(zVar.h()));
        mx.v b12 = this.f60767a.b();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ow.u.h(zVar.e(), b12, new x00.p() { // from class: io.ktor.client.engine.apache.o
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 m02;
                m02 = p.m0(Ref.ObjectRef.this, objectRef2, create, (String) obj, (String) obj2);
                return m02;
            }
        });
        e1 f11 = zVar.f();
        e1.a aVar = e1.f62753b;
        if ((!g0.g(f11, aVar.c()) && !g0.g(zVar.f(), aVar.d())) || !(zVar.b() instanceof v.c)) {
            w60.b bVar = new w60.b();
            String str = (String) objectRef.element;
            if (str == null || k0.O3(str)) {
                bVar.c(true);
            } else {
                bVar.h0(Long.parseLong(str));
            }
            bVar.i((String) objectRef2.element);
            create.setEntity(bVar);
        }
        j jVar = this.f60768b;
        x00.l<RequestConfig.Builder, RequestConfig.Builder> w11 = jVar.w();
        RequestConfig.Builder connectionRequestTimeout = RequestConfig.custom().setRedirectsEnabled(jVar.x()).setSocketTimeout(jVar.y()).setConnectTimeout(jVar.t()).setConnectionRequestTimeout(jVar.u());
        g0.o(connectionRequestTimeout, "setConnectionRequestTimeout(...)");
        b11 = q.b(w11.invoke(connectionRequestTimeout), this.f60767a);
        create.setConfig(b11.build());
        HttpUriRequest build = create.build();
        g0.o(build, "build(...)");
        return build;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.h.a(this.f60774h);
        this.f60772f.complete();
    }

    @Override // w70.z
    public void d(@m80.k final m70.c encoder, @m80.k m70.g ioctrl) {
        int j11;
        g0.p(encoder, "encoder");
        g0.p(ioctrl, "ioctrl");
        if (this.f60771e.b()) {
            return;
        }
        do {
            j11 = io.ktor.utils.io.l.j(this.f60774h, new x00.l() { // from class: io.ktor.client.engine.apache.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    int Z;
                    Z = p.Z(m70.c.this, (ByteBuffer) obj);
                    return Integer.valueOf(Z);
                }
            });
        } while (j11 > 0);
        if (this.f60774h.f()) {
            Throwable b11 = this.f60774h.b();
            if (b11 != null) {
                throw b11;
            }
            encoder.complete();
            return;
        }
        if (j11 == -1) {
            this.f60771e.f(ioctrl);
            c40.k.f(this, h1.g(), null, new b(null), 2, null);
        }
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60773g;
    }

    @Override // w70.z
    @m80.k
    public HttpHost getTarget() {
        return this.f60770d;
    }

    @Override // w70.z
    public boolean n() {
        return true;
    }

    @Override // w70.z
    public void s(@m80.k HttpContext context) {
        g0.p(context, "context");
    }

    @Override // w70.z
    public void g0() {
    }
}
