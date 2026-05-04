package okhttp3;

import a00.h0;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.open.SocialConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.h;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f77496a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Protocol f77497b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f77498c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77499d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final g f77500e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final h f77501f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final o f77502g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final n f77503h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final n f77504i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public final n f77505j;

    /* renamed from: k, reason: collision with root package name */
    public final long f77506k;

    /* renamed from: l, reason: collision with root package name */
    public final long f77507l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final z50.c f77508m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public c f77509n;

    public n(@m80.k l request, @m80.k Protocol protocol, @m80.k String message, int i11, @m80.l g gVar, @m80.k h headers, @m80.l o oVar, @m80.l n nVar, @m80.l n nVar2, @m80.l n nVar3, long j11, long j12, @m80.l z50.c cVar) {
        g0.p(request, "request");
        g0.p(protocol, "protocol");
        g0.p(message, "message");
        g0.p(headers, "headers");
        this.f77496a = request;
        this.f77497b = protocol;
        this.f77498c = message;
        this.f77499d = i11;
        this.f77500e = gVar;
        this.f77501f = headers;
        this.f77502g = oVar;
        this.f77503h = nVar;
        this.f77504i = nVar2;
        this.f77505j = nVar3;
        this.f77506k = j11;
        this.f77507l = j12;
        this.f77508m = cVar;
    }

    public static /* synthetic */ String h0(n nVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return nVar.f0(str, str2);
    }

    @w00.j(name = SocialConstants.TYPE_REQUEST)
    @m80.k
    public final l A0() {
        return this.f77496a;
    }

    @w00.j(name = "-deprecated_protocol")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "protocol", imports = {}))
    @m80.k
    public final Protocol C() {
        return this.f77497b;
    }

    @w00.j(name = "sentRequestAtMillis")
    public final long C0() {
        return this.f77506k;
    }

    @m80.k
    public final h D0() throws IOException {
        z50.c cVar = this.f77508m;
        if (cVar != null) {
            return cVar.v();
        }
        throw new IllegalStateException("trailers not available");
    }

    @w00.j(name = "-deprecated_receivedResponseAtMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "receivedResponseAtMillis", imports = {}))
    public final long E() {
        return this.f77507l;
    }

    @w00.j(name = "-deprecated_request")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = SocialConstants.TYPE_REQUEST, imports = {}))
    @m80.k
    public final l H() {
        return this.f77496a;
    }

    @w00.j(name = "-deprecated_sentRequestAtMillis")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "sentRequestAtMillis", imports = {}))
    public final long I() {
        return this.f77506k;
    }

    @m80.l
    @w00.j(name = TtmlNode.TAG_BODY)
    public final o L() {
        return this.f77502g;
    }

    @w00.j(name = "cacheControl")
    @m80.k
    public final c S() {
        c cVar = this.f77509n;
        if (cVar != null) {
            return cVar;
        }
        c c11 = c.f77156n.c(this.f77501f);
        this.f77509n = c11;
        return c11;
    }

    public final boolean S5() {
        int i11 = this.f77499d;
        return 200 <= i11 && i11 < 300;
    }

    @m80.l
    @w00.j(name = "cacheResponse")
    public final n U() {
        return this.f77504i;
    }

    @m80.k
    public final List<t50.e> V() {
        String str;
        h hVar = this.f77501f;
        int i11 = this.f77499d;
        if (i11 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i11 != 407) {
                return h0.J();
            }
            str = "Proxy-Authenticate";
        }
        return a60.e.b(hVar, str);
    }

    @w00.j(name = "code")
    public final int Z() {
        return this.f77499d;
    }

    @m80.l
    @w00.j(name = "-deprecated_body")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = TtmlNode.TAG_BODY, imports = {}))
    public final o a() {
        return this.f77502g;
    }

    @m80.l
    @w00.j(name = "exchange")
    public final z50.c a0() {
        return this.f77508m;
    }

    @w00.j(name = "-deprecated_cacheControl")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cacheControl", imports = {}))
    @m80.k
    public final c c() {
        return S();
    }

    @m80.l
    @w00.j(name = "handshake")
    public final g c0() {
        return this.f77500e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o oVar = this.f77502g;
        if (oVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        oVar.close();
    }

    @m80.l
    @w00.k
    public final String d0(@m80.k String name) {
        g0.p(name, "name");
        return h0(this, name, null, 2, null);
    }

    @m80.l
    @w00.j(name = "-deprecated_cacheResponse")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "cacheResponse", imports = {}))
    public final n e() {
        return this.f77504i;
    }

    @w00.j(name = "-deprecated_code")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "code", imports = {}))
    public final int f() {
        return this.f77499d;
    }

    @m80.l
    @w00.k
    public final String f0(@m80.k String name, @m80.l String str) {
        g0.p(name, "name");
        String d11 = this.f77501f.d(name);
        return d11 == null ? str : d11;
    }

    @m80.k
    public final List<String> i0(@m80.k String name) {
        g0.p(name, "name");
        return this.f77501f.p(name);
    }

    @m80.l
    @w00.j(name = "-deprecated_handshake")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "handshake", imports = {}))
    public final g j() {
        return this.f77500e;
    }

    @w00.j(name = "-deprecated_headers")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "headers", imports = {}))
    @m80.k
    public final h k() {
        return this.f77501f;
    }

    @w00.j(name = "headers")
    @m80.k
    public final h k0() {
        return this.f77501f;
    }

    public final boolean m0() {
        int i11 = this.f77499d;
        if (i11 == 307 || i11 == 308) {
            return true;
        }
        switch (i11) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    @w00.j(name = "message")
    @m80.k
    public final String o0() {
        return this.f77498c;
    }

    @w00.j(name = "-deprecated_message")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "message", imports = {}))
    @m80.k
    public final String q() {
        return this.f77498c;
    }

    @m80.l
    @w00.j(name = "-deprecated_networkResponse")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "networkResponse", imports = {}))
    public final n r() {
        return this.f77503h;
    }

    @m80.l
    @w00.j(name = "networkResponse")
    public final n s0() {
        return this.f77503h;
    }

    @m80.k
    public String toString() {
        return "Response{protocol=" + this.f77497b + ", code=" + this.f77499d + ", message=" + this.f77498c + ", url=" + this.f77496a.q() + l50.b.f69928j;
    }

    @m80.k
    public final a v0() {
        return new a(this);
    }

    @m80.l
    @w00.j(name = "-deprecated_priorResponse")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "priorResponse", imports = {}))
    public final n w() {
        return this.f77505j;
    }

    @m80.k
    public final o w0(long j11) throws IOException {
        o oVar = this.f77502g;
        g0.m(oVar);
        l60.m peek = oVar.V().peek();
        l60.k kVar = new l60.k();
        peek.request(j11);
        kVar.d8(peek, Math.min(j11, peek.getBuffer().size()));
        return o.f77523b.b(kVar, this.f77502g.r(), kVar.size());
    }

    @m80.l
    @w00.j(name = "priorResponse")
    public final n x0() {
        return this.f77505j;
    }

    @w00.j(name = "protocol")
    @m80.k
    public final Protocol y0() {
        return this.f77497b;
    }

    @w00.j(name = "receivedResponseAtMillis")
    public final long z0() {
        return this.f77507l;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public l f77510a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Protocol f77511b;

        /* renamed from: c, reason: collision with root package name */
        public int f77512c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f77513d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public g f77514e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public h.a f77515f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public o f77516g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public n f77517h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public n f77518i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public n f77519j;

        /* renamed from: k, reason: collision with root package name */
        public long f77520k;

        /* renamed from: l, reason: collision with root package name */
        public long f77521l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public z50.c f77522m;

        public a() {
            this.f77512c = -1;
            this.f77515f = new h.a();
        }

        @m80.k
        public a A(@m80.l n nVar) {
            e(nVar);
            this.f77519j = nVar;
            return this;
        }

        @m80.k
        public a B(@m80.k Protocol protocol) {
            g0.p(protocol, "protocol");
            this.f77511b = protocol;
            return this;
        }

        @m80.k
        public a C(long j11) {
            this.f77521l = j11;
            return this;
        }

        @m80.k
        public a D(@m80.k String name) {
            g0.p(name, "name");
            this.f77515f.l(name);
            return this;
        }

        @m80.k
        public a E(@m80.k l request) {
            g0.p(request, "request");
            this.f77510a = request;
            return this;
        }

        @m80.k
        public a F(long j11) {
            this.f77520k = j11;
            return this;
        }

        public final void G(@m80.l o oVar) {
            this.f77516g = oVar;
        }

        public final void H(@m80.l n nVar) {
            this.f77518i = nVar;
        }

        public final void I(int i11) {
            this.f77512c = i11;
        }

        public final void J(@m80.l z50.c cVar) {
            this.f77522m = cVar;
        }

        public final void K(@m80.l g gVar) {
            this.f77514e = gVar;
        }

        public final void L(@m80.k h.a aVar) {
            g0.p(aVar, "<set-?>");
            this.f77515f = aVar;
        }

        public final void M(@m80.l String str) {
            this.f77513d = str;
        }

        public final void N(@m80.l n nVar) {
            this.f77517h = nVar;
        }

        public final void O(@m80.l n nVar) {
            this.f77519j = nVar;
        }

        public final void P(@m80.l Protocol protocol) {
            this.f77511b = protocol;
        }

        public final void Q(long j11) {
            this.f77521l = j11;
        }

        public final void R(@m80.l l lVar) {
            this.f77510a = lVar;
        }

        public final void S(long j11) {
            this.f77520k = j11;
        }

        @m80.k
        public a a(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            this.f77515f.b(name, value);
            return this;
        }

        @m80.k
        public a b(@m80.l o oVar) {
            this.f77516g = oVar;
            return this;
        }

        @m80.k
        public n c() {
            int i11 = this.f77512c;
            if (i11 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f77512c).toString());
            }
            l lVar = this.f77510a;
            if (lVar == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f77511b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f77513d;
            if (str != null) {
                return new n(lVar, protocol, str, i11, this.f77514e, this.f77515f.i(), this.f77516g, this.f77517h, this.f77518i, this.f77519j, this.f77520k, this.f77521l, this.f77522m);
            }
            throw new IllegalStateException("message == null");
        }

        @m80.k
        public a d(@m80.l n nVar) {
            f("cacheResponse", nVar);
            this.f77518i = nVar;
            return this;
        }

        public final void e(n nVar) {
            if (nVar != null && nVar.L() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, n nVar) {
            if (nVar != null) {
                if (nVar.L() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (nVar.s0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (nVar.U() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (nVar.x0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @m80.k
        public a g(int i11) {
            this.f77512c = i11;
            return this;
        }

        @m80.l
        public final o h() {
            return this.f77516g;
        }

        @m80.l
        public final n i() {
            return this.f77518i;
        }

        public final int j() {
            return this.f77512c;
        }

        @m80.l
        public final z50.c k() {
            return this.f77522m;
        }

        @m80.l
        public final g l() {
            return this.f77514e;
        }

        @m80.k
        public final h.a m() {
            return this.f77515f;
        }

        @m80.l
        public final String n() {
            return this.f77513d;
        }

        @m80.l
        public final n o() {
            return this.f77517h;
        }

        @m80.l
        public final n p() {
            return this.f77519j;
        }

        @m80.l
        public final Protocol q() {
            return this.f77511b;
        }

        public final long r() {
            return this.f77521l;
        }

        @m80.l
        public final l s() {
            return this.f77510a;
        }

        public final long t() {
            return this.f77520k;
        }

        @m80.k
        public a u(@m80.l g gVar) {
            this.f77514e = gVar;
            return this;
        }

        @m80.k
        public a v(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            this.f77515f.m(name, value);
            return this;
        }

        @m80.k
        public a w(@m80.k h headers) {
            g0.p(headers, "headers");
            this.f77515f = headers.k();
            return this;
        }

        public final void x(@m80.k z50.c deferredTrailers) {
            g0.p(deferredTrailers, "deferredTrailers");
            this.f77522m = deferredTrailers;
        }

        @m80.k
        public a y(@m80.k String message) {
            g0.p(message, "message");
            this.f77513d = message;
            return this;
        }

        @m80.k
        public a z(@m80.l n nVar) {
            f("networkResponse", nVar);
            this.f77517h = nVar;
            return this;
        }

        public a(@m80.k n response) {
            g0.p(response, "response");
            this.f77512c = -1;
            this.f77510a = response.A0();
            this.f77511b = response.y0();
            this.f77512c = response.Z();
            this.f77513d = response.o0();
            this.f77514e = response.c0();
            this.f77515f = response.k0().k();
            this.f77516g = response.L();
            this.f77517h = response.s0();
            this.f77518i = response.U();
            this.f77519j = response.x0();
            this.f77520k = response.C0();
            this.f77521l = response.z0();
            this.f77522m = response.a0();
        }
    }
}
