package w50;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l60.e1;
import l60.g1;
import l60.i1;
import l60.m;
import l60.r0;
import m80.k;
import m80.l;
import okhttp3.Protocol;
import okhttp3.h;
import okhttp3.n;
import okhttp3.o;
import t50.n;
import u30.f0;
import u50.f;
import w50.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements n {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C1281a f95321c = new C1281a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final okhttp3.b f95322a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: w50.a$a, reason: collision with other inner class name */
    public static final class C1281a {
        public /* synthetic */ C1281a(v vVar) {
            this();
        }

        public final h c(h hVar, h hVar2) {
            h.a aVar = new h.a();
            int size = hVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String h11 = hVar.h(i11);
                String o11 = hVar.o(i11);
                if ((!f0.c2("Warning", h11, true) || !f0.J2(o11, "1", false, 2, null)) && (d(h11) || !e(h11) || hVar2.d(h11) == null)) {
                    aVar.g(h11, o11);
                }
            }
            int size2 = hVar2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String h12 = hVar2.h(i12);
                if (!d(h12) && e(h12)) {
                    aVar.g(h12, hVar2.o(i12));
                }
            }
            return aVar.i();
        }

        public final boolean d(String str) {
            return f0.c2("Content-Length", str, true) || f0.c2("Content-Encoding", str, true) || f0.c2("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return (f0.c2("Connection", str, true) || f0.c2("Keep-Alive", str, true) || f0.c2("Proxy-Authenticate", str, true) || f0.c2("Proxy-Authorization", str, true) || f0.c2("TE", str, true) || f0.c2("Trailers", str, true) || f0.c2("Transfer-Encoding", str, true) || f0.c2("Upgrade", str, true)) ? false : true;
        }

        public final okhttp3.n f(okhttp3.n nVar) {
            return (nVar != null ? nVar.L() : null) != null ? nVar.v0().b(null).c() : nVar;
        }

        public C1281a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f95323a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f95324b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w50.b f95325c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l60.l f95326d;

        public b(m mVar, w50.b bVar, l60.l lVar) {
            this.f95324b = mVar;
            this.f95325c = bVar;
            this.f95326d = lVar;
        }

        @Override // l60.g1
        @k
        public i1 D() {
            return this.f95324b.D();
        }

        @Override // l60.g1
        public long L3(@k l60.k sink, long j11) throws IOException {
            g0.p(sink, "sink");
            try {
                long L3 = this.f95324b.L3(sink, j11);
                if (L3 != -1) {
                    sink.c0(this.f95326d.getBuffer(), sink.size() - L3, L3);
                    this.f95326d.X4();
                    return L3;
                }
                if (!this.f95323a) {
                    this.f95323a = true;
                    this.f95326d.close();
                }
                return -1L;
            } catch (IOException e11) {
                if (this.f95323a) {
                    throw e11;
                }
                this.f95323a = true;
                this.f95325c.abort();
                throw e11;
            }
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f95323a && !f.w(this, 100, TimeUnit.MILLISECONDS)) {
                this.f95323a = true;
                this.f95325c.abort();
            }
            this.f95324b.close();
        }
    }

    public a(@l okhttp3.b bVar) {
        this.f95322a = bVar;
    }

    public final okhttp3.n a(w50.b bVar, okhttp3.n nVar) throws IOException {
        if (bVar == null) {
            return nVar;
        }
        e1 a11 = bVar.a();
        o L = nVar.L();
        g0.m(L);
        b bVar2 = new b(L.V(), bVar, r0.d(a11));
        return nVar.v0().b(new a60.h(okhttp3.n.h0(nVar, "Content-Type", null, 2, null), nVar.L().q(), r0.e(bVar2))).c();
    }

    @l
    public final okhttp3.b b() {
        return this.f95322a;
    }

    @Override // t50.n
    @k
    public okhttp3.n intercept(@k n.a chain) throws IOException {
        t50.m mVar;
        o L;
        o L2;
        g0.p(chain, "chain");
        t50.b call = chain.call();
        okhttp3.b bVar = this.f95322a;
        okhttp3.n k11 = bVar != null ? bVar.k(chain.request()) : null;
        c b11 = new c.b(System.currentTimeMillis(), chain.request(), k11).b();
        okhttp3.l b12 = b11.b();
        okhttp3.n a11 = b11.a();
        okhttp3.b bVar2 = this.f95322a;
        if (bVar2 != null) {
            bVar2.d0(b11);
        }
        z50.e eVar = call instanceof z50.e ? (z50.e) call : null;
        if (eVar == null || (mVar = eVar.n()) == null) {
            mVar = t50.m.f89630b;
        }
        if (k11 != null && a11 == null && (L2 = k11.L()) != null) {
            f.o(L2);
        }
        if (b12 == null && a11 == null) {
            okhttp3.n c11 = new n.a().E(chain.request()).B(Protocol.HTTP_1_1).g(504).y("Unsatisfiable Request (only-if-cached)").b(f.f91848c).F(-1L).C(System.currentTimeMillis()).c();
            mVar.A(call, c11);
            return c11;
        }
        if (b12 == null) {
            g0.m(a11);
            okhttp3.n c12 = a11.v0().d(f95321c.f(a11)).c();
            mVar.b(call, c12);
            return c12;
        }
        if (a11 != null) {
            mVar.a(call, a11);
        } else if (this.f95322a != null) {
            mVar.c(call);
        }
        try {
            okhttp3.n c13 = chain.c(b12);
            if (c13 == null && k11 != null && L != null) {
            }
            if (a11 != null) {
                if (c13 != null && c13.Z() == 304) {
                    n.a v02 = a11.v0();
                    C1281a c1281a = f95321c;
                    okhttp3.n c14 = v02.w(c1281a.c(a11.k0(), c13.k0())).F(c13.C0()).C(c13.z0()).d(c1281a.f(a11)).z(c1281a.f(c13)).c();
                    o L3 = c13.L();
                    g0.m(L3);
                    L3.close();
                    okhttp3.b bVar3 = this.f95322a;
                    g0.m(bVar3);
                    bVar3.c0();
                    this.f95322a.f0(a11, c14);
                    mVar.b(call, c14);
                    return c14;
                }
                o L4 = a11.L();
                if (L4 != null) {
                    f.o(L4);
                }
            }
            g0.m(c13);
            n.a v03 = c13.v0();
            C1281a c1281a2 = f95321c;
            okhttp3.n c15 = v03.d(c1281a2.f(a11)).z(c1281a2.f(c13)).c();
            if (this.f95322a != null) {
                if (a60.e.c(c15) && c.f95327c.a(c15, b12)) {
                    okhttp3.n a12 = a(this.f95322a.S(c15), c15);
                    if (a11 != null) {
                        mVar.c(call);
                    }
                    return a12;
                }
                if (a60.f.f2007a.a(b12.m())) {
                    try {
                        this.f95322a.U(b12);
                    } catch (IOException unused) {
                    }
                }
            }
            return c15;
        } finally {
            if (k11 != null && (L = k11.L()) != null) {
                f.o(L);
            }
        }
    }
}
