package z50;

import j60.e;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.e1;
import l60.g1;
import l60.r0;
import l60.v;
import l60.w;
import m80.k;
import okhttp3.l;
import okhttp3.n;
import okhttp3.o;
import t50.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f100935a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f100936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f100937c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a60.d f100938d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100939e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100940f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f100941g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$RequestBodySink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class a extends v {

        /* renamed from: b, reason: collision with root package name */
        public final long f100942b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f100943c;

        /* renamed from: d, reason: collision with root package name */
        public long f100944d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f100945e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c f100946f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k c cVar, e1 delegate, long j11) {
            super(delegate);
            g0.p(delegate, "delegate");
            this.f100946f = cVar;
            this.f100942b = j11;
        }

        private final <E extends IOException> E e(E e11) {
            if (this.f100943c) {
                return e11;
            }
            this.f100943c = true;
            return (E) this.f100946f.a(this.f100944d, false, true, e11);
        }

        @Override // l60.v, l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f100945e) {
                return;
            }
            this.f100945e = true;
            long j11 = this.f100942b;
            if (j11 != -1 && this.f100944d != j11) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                e(null);
            } catch (IOException e11) {
                throw e(e11);
            }
        }

        @Override // l60.v, l60.e1, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e11) {
                throw e(e11);
            }
        }

        @Override // l60.v, l60.e1
        public void y8(@k l60.k source, long j11) throws IOException {
            g0.p(source, "source");
            if (this.f100945e) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f100942b;
            if (j12 == -1 || this.f100944d + j11 <= j12) {
                try {
                    super.y8(source, j11);
                    this.f100944d += j11;
                    return;
                } catch (IOException e11) {
                    throw e(e11);
                }
            }
            throw new ProtocolException("expected " + this.f100942b + " bytes but received " + (this.f100944d + j11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exchange.kt\nokhttp3/internal/connection/Exchange$ResponseBodySource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
    public final class b extends w {

        /* renamed from: b, reason: collision with root package name */
        public final long f100947b;

        /* renamed from: c, reason: collision with root package name */
        public long f100948c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f100949d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f100950e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f100951f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f100952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k c cVar, g1 delegate, long j11) {
            super(delegate);
            g0.p(delegate, "delegate");
            this.f100952g = cVar;
            this.f100947b = j11;
            this.f100949d = true;
            if (j11 == 0) {
                e(null);
            }
        }

        @Override // l60.w, l60.g1
        public long L3(@k l60.k sink, long j11) throws IOException {
            g0.p(sink, "sink");
            if (this.f100951f) {
                throw new IllegalStateException("closed");
            }
            try {
                long L3 = c().L3(sink, j11);
                if (this.f100949d) {
                    this.f100949d = false;
                    this.f100952g.i().w(this.f100952g.g());
                }
                if (L3 == -1) {
                    e(null);
                    return -1L;
                }
                long j12 = this.f100948c + L3;
                long j13 = this.f100947b;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f100947b + " bytes but received " + j12);
                }
                this.f100948c = j12;
                if (j12 == j13) {
                    e(null);
                }
                return L3;
            } catch (IOException e11) {
                throw e(e11);
            }
        }

        @Override // l60.w, l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f100951f) {
                return;
            }
            this.f100951f = true;
            try {
                super.close();
                e(null);
            } catch (IOException e11) {
                throw e(e11);
            }
        }

        public final <E extends IOException> E e(E e11) {
            if (this.f100950e) {
                return e11;
            }
            this.f100950e = true;
            if (e11 == null && this.f100949d) {
                this.f100949d = false;
                this.f100952g.i().w(this.f100952g.g());
            }
            return (E) this.f100952g.a(this.f100948c, true, false, e11);
        }
    }

    public c(@k e call, @k m eventListener, @k d finder, @k a60.d codec) {
        g0.p(call, "call");
        g0.p(eventListener, "eventListener");
        g0.p(finder, "finder");
        g0.p(codec, "codec");
        this.f100935a = call;
        this.f100936b = eventListener;
        this.f100937c = finder;
        this.f100938d = codec;
        this.f100941g = codec.getConnection();
    }

    public final <E extends IOException> E a(long j11, boolean z11, boolean z12, E e11) {
        if (e11 != null) {
            u(e11);
        }
        if (z12) {
            if (e11 != null) {
                this.f100936b.s(this.f100935a, e11);
            } else {
                this.f100936b.q(this.f100935a, j11);
            }
        }
        if (z11) {
            if (e11 != null) {
                this.f100936b.x(this.f100935a, e11);
            } else {
                this.f100936b.v(this.f100935a, j11);
            }
        }
        return (E) this.f100935a.u(this, z12, z11, e11);
    }

    public final void b() {
        this.f100938d.cancel();
    }

    @k
    public final e1 c(@k l request, boolean z11) throws IOException {
        g0.p(request, "request");
        this.f100939e = z11;
        okhttp3.m f11 = request.f();
        g0.m(f11);
        long a11 = f11.a();
        this.f100936b.r(this.f100935a);
        return new a(this, this.f100938d.b(request, a11), a11);
    }

    public final void d() {
        this.f100938d.cancel();
        this.f100935a.u(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.f100938d.d();
        } catch (IOException e11) {
            this.f100936b.s(this.f100935a, e11);
            u(e11);
            throw e11;
        }
    }

    public final void f() throws IOException {
        try {
            this.f100938d.c();
        } catch (IOException e11) {
            this.f100936b.s(this.f100935a, e11);
            u(e11);
            throw e11;
        }
    }

    @k
    public final e g() {
        return this.f100935a;
    }

    @k
    public final f h() {
        return this.f100941g;
    }

    @k
    public final m i() {
        return this.f100936b;
    }

    @k
    public final d j() {
        return this.f100937c;
    }

    public final boolean k() {
        return this.f100940f;
    }

    public final boolean l() {
        return !g0.g(this.f100937c.d().w().F(), this.f100941g.b().d().w().F());
    }

    public final boolean m() {
        return this.f100939e;
    }

    @k
    public final e.d n() throws SocketException {
        this.f100935a.B();
        return this.f100938d.getConnection().C(this);
    }

    public final void o() {
        this.f100938d.getConnection().E();
    }

    public final void p() {
        this.f100935a.u(this, true, false, null);
    }

    @k
    public final o q(@k n response) throws IOException {
        g0.p(response, "response");
        try {
            String h02 = n.h0(response, "Content-Type", null, 2, null);
            long e11 = this.f100938d.e(response);
            return new a60.h(h02, e11, r0.e(new b(this, this.f100938d.a(response), e11)));
        } catch (IOException e12) {
            this.f100936b.x(this.f100935a, e12);
            u(e12);
            throw e12;
        }
    }

    @m80.l
    public final n.a r(boolean z11) throws IOException {
        try {
            n.a g11 = this.f100938d.g(z11);
            if (g11 == null) {
                return g11;
            }
            g11.x(this);
            return g11;
        } catch (IOException e11) {
            this.f100936b.x(this.f100935a, e11);
            u(e11);
            throw e11;
        }
    }

    public final void s(@k n response) {
        g0.p(response, "response");
        this.f100936b.y(this.f100935a, response);
    }

    public final void t() {
        this.f100936b.z(this.f100935a);
    }

    public final void u(IOException iOException) {
        this.f100940f = true;
        this.f100937c.h(iOException);
        this.f100938d.getConnection().L(this.f100935a, iOException);
    }

    @k
    public final okhttp3.h v() throws IOException {
        return this.f100938d.h();
    }

    public final void w() {
        a(-1L, true, true, null);
    }

    public final void x(@k l request) throws IOException {
        g0.p(request, "request");
        try {
            this.f100936b.u(this.f100935a);
            this.f100938d.f(request);
            this.f100936b.t(this.f100935a, request);
        } catch (IOException e11) {
            this.f100936b.s(this.f100935a, e11);
            u(e11);
            throw e11;
        }
    }
}
