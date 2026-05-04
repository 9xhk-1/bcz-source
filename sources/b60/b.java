package b60;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.e1;
import l60.g1;
import l60.i1;
import l60.m;
import l60.x;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.i;
import okhttp3.n;
import t50.q;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
/* loaded from: classes8.dex */
public final class b implements a60.d {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final d f6155j = new d(null);

    /* renamed from: k, reason: collision with root package name */
    public static final long f6156k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f6157l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f6158m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f6159n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f6160o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final int f6161p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f6162q = 5;

    /* renamed from: r, reason: collision with root package name */
    public static final int f6163r = 6;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final q f6164c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final z50.f f6165d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final m f6166e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l60.l f6167f;

    /* renamed from: g, reason: collision with root package name */
    public int f6168g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final b60.a f6169h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public h f6170i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a implements g1 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final x f6171a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6172b;

        public a() {
            this.f6171a = new x(b.this.f6166e.D());
        }

        @Override // l60.g1
        @k
        public i1 D() {
            return this.f6171a;
        }

        @Override // l60.g1
        public long L3(@k l60.k sink, long j11) {
            g0.p(sink, "sink");
            try {
                return b.this.f6166e.L3(sink, j11);
            } catch (IOException e11) {
                b.this.getConnection().E();
                e();
                throw e11;
            }
        }

        public final boolean a() {
            return this.f6172b;
        }

        @k
        public final x c() {
            return this.f6171a;
        }

        public final void e() {
            if (b.this.f6168g == 6) {
                return;
            }
            if (b.this.f6168g == 5) {
                b.this.r(this.f6171a);
                b.this.f6168g = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f6168g);
            }
        }

        public final void f(boolean z11) {
            this.f6172b = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    /* renamed from: b60.b$b, reason: collision with other inner class name */
    public final class C0109b implements e1 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final x f6174a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6175b;

        public C0109b() {
            this.f6174a = new x(b.this.f6167f.D());
        }

        @Override // l60.e1
        @k
        public i1 D() {
            return this.f6174a;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f6175b) {
                return;
            }
            this.f6175b = true;
            b.this.f6167f.n5("0\r\n\r\n");
            b.this.r(this.f6174a);
            b.this.f6168g = 3;
        }

        @Override // l60.e1, java.io.Flushable
        public synchronized void flush() {
            if (this.f6175b) {
                return;
            }
            b.this.f6167f.flush();
        }

        @Override // l60.e1
        public void y8(@k l60.k source, long j11) {
            g0.p(source, "source");
            if (this.f6175b) {
                throw new IllegalStateException("closed");
            }
            if (j11 == 0) {
                return;
            }
            b.this.f6167f.p3(j11);
            b.this.f6167f.n5("\r\n");
            b.this.f6167f.y8(source, j11);
            b.this.f6167f.n5("\r\n");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final i f6177d;

        /* renamed from: e, reason: collision with root package name */
        public long f6178e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6179f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f6180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@k b bVar, i url) {
            super();
            g0.p(url, "url");
            this.f6180g = bVar;
            this.f6177d = url;
            this.f6178e = -1L;
            this.f6179f = true;
        }

        @Override // b60.b.a, l60.g1
        public long L3(@k l60.k sink, long j11) {
            g0.p(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f6179f) {
                return -1L;
            }
            long j12 = this.f6178e;
            if (j12 == 0 || j12 == -1) {
                j();
                if (!this.f6179f) {
                    return -1L;
                }
            }
            long L3 = super.L3(sink, Math.min(j11, this.f6178e));
            if (L3 != -1) {
                this.f6178e -= L3;
                return L3;
            }
            this.f6180g.getConnection().E();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            e();
            throw protocolException;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f6179f && !u50.f.w(this, 100, TimeUnit.MILLISECONDS)) {
                this.f6180g.getConnection().E();
                e();
            }
            f(true);
        }

        public final void j() {
            if (this.f6178e != -1) {
                this.f6180g.f6166e.L5();
            }
            try {
                this.f6178e = this.f6180g.f6166e.m4();
                String obj = k0.b6(this.f6180g.f6166e.L5()).toString();
                if (this.f6178e < 0 || (obj.length() > 0 && !f0.J2(obj, com.alipay.sdk.m.u.i.f11097b, false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6178e + obj + '\"');
                }
                if (this.f6178e == 0) {
                    this.f6179f = false;
                    b bVar = this.f6180g;
                    bVar.f6170i = bVar.f6169h.b();
                    q qVar = this.f6180g.f6164c;
                    g0.m(qVar);
                    t50.i X = qVar.X();
                    i iVar = this.f6177d;
                    h hVar = this.f6180g.f6170i;
                    g0.m(hVar);
                    a60.e.g(X, iVar, hVar);
                    e();
                }
            } catch (NumberFormatException e11) {
                throw new ProtocolException(e11.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {
        public /* synthetic */ d(v vVar) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class e extends a {

        /* renamed from: d, reason: collision with root package name */
        public long f6181d;

        public e(long j11) {
            super();
            this.f6181d = j11;
            if (j11 == 0) {
                e();
            }
        }

        @Override // b60.b.a, l60.g1
        public long L3(@k l60.k sink, long j11) {
            g0.p(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f6181d;
            if (j12 == 0) {
                return -1L;
            }
            long L3 = super.L3(sink, Math.min(j12, j11));
            if (L3 == -1) {
                b.this.getConnection().E();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
            long j13 = this.f6181d - L3;
            this.f6181d = j13;
            if (j13 == 0) {
                e();
            }
            return L3;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f6181d != 0 && !u50.f.w(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.getConnection().E();
                e();
            }
            f(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class f implements e1 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final x f6183a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6184b;

        public f() {
            this.f6183a = new x(b.this.f6167f.D());
        }

        @Override // l60.e1
        @k
        public i1 D() {
            return this.f6183a;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f6184b) {
                return;
            }
            this.f6184b = true;
            b.this.r(this.f6183a);
            b.this.f6168g = 3;
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() {
            if (this.f6184b) {
                return;
            }
            b.this.f6167f.flush();
        }

        @Override // l60.e1
        public void y8(@k l60.k source, long j11) {
            g0.p(source, "source");
            if (this.f6184b) {
                throw new IllegalStateException("closed");
            }
            u50.f.n(source.size(), 0L, j11);
            b.this.f6167f.y8(source, j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHttp1ExchangeCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http1ExchangeCodec.kt\nokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n1#2:506\n*E\n"})
    public final class g extends a {

        /* renamed from: d, reason: collision with root package name */
        public boolean f6186d;

        public g() {
            super();
        }

        @Override // b60.b.a, l60.g1
        public long L3(@k l60.k sink, long j11) {
            g0.p(sink, "sink");
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f6186d) {
                return -1L;
            }
            long L3 = super.L3(sink, j11);
            if (L3 != -1) {
                return L3;
            }
            this.f6186d = true;
            e();
            return -1L;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f6186d) {
                e();
            }
            f(true);
        }
    }

    public b(@l q qVar, @k z50.f connection, @k m source, @k l60.l sink) {
        g0.p(connection, "connection");
        g0.p(source, "source");
        g0.p(sink, "sink");
        this.f6164c = qVar;
        this.f6165d = connection;
        this.f6166e = source;
        this.f6167f = sink;
        this.f6169h = new b60.a(source);
    }

    public final void A(@k n response) {
        g0.p(response, "response");
        long A = u50.f.A(response);
        if (A == -1) {
            return;
        }
        g1 x11 = x(A);
        u50.f.X(x11, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        x11.close();
    }

    public final void B(@k h headers, @k String requestLine) {
        g0.p(headers, "headers");
        g0.p(requestLine, "requestLine");
        if (this.f6168g != 0) {
            throw new IllegalStateException(("state: " + this.f6168g).toString());
        }
        this.f6167f.n5(requestLine).n5("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6167f.n5(headers.h(i11)).n5(": ").n5(headers.o(i11)).n5("\r\n");
        }
        this.f6167f.n5("\r\n");
        this.f6168g = 1;
    }

    @Override // a60.d
    @k
    public g1 a(@k n response) {
        g0.p(response, "response");
        if (!a60.e.c(response)) {
            return x(0L);
        }
        if (t(response)) {
            return w(response.A0().q());
        }
        long A = u50.f.A(response);
        return A != -1 ? x(A) : z();
    }

    @Override // a60.d
    @k
    public e1 b(@k okhttp3.l request, long j11) {
        g0.p(request, "request");
        if (request.f() != null && request.f().p()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return v();
        }
        if (j11 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // a60.d
    public void c() {
        this.f6167f.flush();
    }

    @Override // a60.d
    public void cancel() {
        getConnection().i();
    }

    @Override // a60.d
    public void d() {
        this.f6167f.flush();
    }

    @Override // a60.d
    public long e(@k n response) {
        g0.p(response, "response");
        if (!a60.e.c(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return u50.f.A(response);
    }

    @Override // a60.d
    public void f(@k okhttp3.l request) {
        g0.p(request, "request");
        a60.i iVar = a60.i.f2020a;
        Proxy.Type type = getConnection().b().e().type();
        g0.o(type, "connection.route().proxy.type()");
        B(request.k(), iVar.a(request, type));
    }

    @Override // a60.d
    @l
    public n.a g(boolean z11) {
        int i11 = this.f6168g;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            throw new IllegalStateException(("state: " + this.f6168g).toString());
        }
        try {
            a60.k b11 = a60.k.f2024d.b(this.f6169h.c());
            n.a w11 = new n.a().B(b11.f2029a).g(b11.f2030b).y(b11.f2031c).w(this.f6169h.b());
            if (z11 && b11.f2030b == 100) {
                return null;
            }
            int i12 = b11.f2030b;
            if (i12 == 100) {
                this.f6168g = 3;
                return w11;
            }
            if (102 > i12 || i12 >= 200) {
                this.f6168g = 4;
                return w11;
            }
            this.f6168g = 3;
            return w11;
        } catch (EOFException e11) {
            throw new IOException("unexpected end of stream on " + getConnection().b().d().w().V(), e11);
        }
    }

    @Override // a60.d
    @k
    public z50.f getConnection() {
        return this.f6165d;
    }

    @Override // a60.d
    @k
    public h h() {
        if (this.f6168g != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        h hVar = this.f6170i;
        return hVar == null ? u50.f.f91847b : hVar;
    }

    public final void r(x xVar) {
        i1 n11 = xVar.n();
        xVar.o(i1.f70438f);
        n11.c();
        n11.d();
    }

    public final boolean s(okhttp3.l lVar) {
        return f0.c2(c80.f.f8329r, lVar.i("Transfer-Encoding"), true);
    }

    public final boolean t(n nVar) {
        return f0.c2(c80.f.f8329r, n.h0(nVar, "Transfer-Encoding", null, 2, null), true);
    }

    public final boolean u() {
        return this.f6168g == 6;
    }

    public final e1 v() {
        if (this.f6168g == 1) {
            this.f6168g = 2;
            return new C0109b();
        }
        throw new IllegalStateException(("state: " + this.f6168g).toString());
    }

    public final g1 w(i iVar) {
        if (this.f6168g == 4) {
            this.f6168g = 5;
            return new c(this, iVar);
        }
        throw new IllegalStateException(("state: " + this.f6168g).toString());
    }

    public final g1 x(long j11) {
        if (this.f6168g == 4) {
            this.f6168g = 5;
            return new e(j11);
        }
        throw new IllegalStateException(("state: " + this.f6168g).toString());
    }

    public final e1 y() {
        if (this.f6168g == 1) {
            this.f6168g = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f6168g).toString());
    }

    public final g1 z() {
        if (this.f6168g == 4) {
            this.f6168g = 5;
            getConnection().E();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f6168g).toString());
    }
}
