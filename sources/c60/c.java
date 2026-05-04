package c60;

import a60.i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l60.e1;
import l60.g1;
import l60.i1;
import m80.k;
import m80.l;
import okhttp3.Protocol;
import okhttp3.h;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.n;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements a60.d {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final String f8164k = "host";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z50.f f8173c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a60.g f8174d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final okhttp3.internal.http2.b f8175e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public volatile d f8176f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Protocol f8177g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f8178h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f8162i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f8163j = "connection";

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f8165l = "keep-alive";

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f8166m = "proxy-connection";

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final String f8168o = "te";

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final String f8167n = "transfer-encoding";

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final String f8169p = "encoding";

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final String f8170q = "upgrade";

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final List<String> f8171r = u50.f.C(f8163j, "host", f8165l, f8166m, f8168o, f8167n, f8169p, f8170q, c60.a.f8126g, c60.a.f8127h, c60.a.f8128i, c60.a.f8129j);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final List<String> f8172s = u50.f.C(f8163j, "host", f8165l, f8166m, f8168o, f8167n, f8169p, f8170q);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final List<c60.a> a(@k okhttp3.l request) {
            g0.p(request, "request");
            h k11 = request.k();
            ArrayList arrayList = new ArrayList(k11.size() + 4);
            arrayList.add(new c60.a(c60.a.f8131l, request.m()));
            arrayList.add(new c60.a(c60.a.f8132m, i.f2020a.c(request.q())));
            String i11 = request.i("Host");
            if (i11 != null) {
                arrayList.add(new c60.a(c60.a.f8134o, i11));
            }
            arrayList.add(new c60.a(c60.a.f8133n, request.q().X()));
            int size = k11.size();
            for (int i12 = 0; i12 < size; i12++) {
                String h11 = k11.h(i12);
                Locale US = Locale.US;
                g0.o(US, "US");
                String lowerCase = h11.toLowerCase(US);
                g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!c.f8171r.contains(lowerCase) || (g0.g(lowerCase, c.f8168o) && g0.g(k11.o(i12), "trailers"))) {
                    arrayList.add(new c60.a(lowerCase, k11.o(i12)));
                }
            }
            return arrayList;
        }

        @k
        public final n.a b(@k h headerBlock, @k Protocol protocol) {
            g0.p(headerBlock, "headerBlock");
            g0.p(protocol, "protocol");
            h.a aVar = new h.a();
            int size = headerBlock.size();
            a60.k kVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                String h11 = headerBlock.h(i11);
                String o11 = headerBlock.o(i11);
                if (g0.g(h11, c60.a.f8125f)) {
                    kVar = a60.k.f2024d.b("HTTP/1.1 " + o11);
                } else if (!c.f8172s.contains(h11)) {
                    aVar.g(h11, o11);
                }
            }
            if (kVar != null) {
                return new n.a().B(protocol).g(kVar.f2030b).y(kVar.f2031c).w(aVar.i());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public a() {
        }
    }

    public c(@k q client, @k z50.f connection, @k a60.g chain, @k okhttp3.internal.http2.b http2Connection) {
        g0.p(client, "client");
        g0.p(connection, "connection");
        g0.p(chain, "chain");
        g0.p(http2Connection, "http2Connection");
        this.f8173c = connection;
        this.f8174d = chain;
        this.f8175e = http2Connection;
        List<Protocol> n02 = client.n0();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f8177g = n02.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // a60.d
    @k
    public g1 a(@k n response) {
        g0.p(response, "response");
        d dVar = this.f8176f;
        g0.m(dVar);
        return dVar.r();
    }

    @Override // a60.d
    @k
    public e1 b(@k okhttp3.l request, long j11) {
        g0.p(request, "request");
        d dVar = this.f8176f;
        g0.m(dVar);
        return dVar.o();
    }

    @Override // a60.d
    public void c() {
        this.f8175e.flush();
    }

    @Override // a60.d
    public void cancel() {
        this.f8178h = true;
        d dVar = this.f8176f;
        if (dVar != null) {
            dVar.f(ErrorCode.CANCEL);
        }
    }

    @Override // a60.d
    public void d() {
        d dVar = this.f8176f;
        g0.m(dVar);
        dVar.o().close();
    }

    @Override // a60.d
    public long e(@k n response) {
        g0.p(response, "response");
        if (a60.e.c(response)) {
            return u50.f.A(response);
        }
        return 0L;
    }

    @Override // a60.d
    public void f(@k okhttp3.l request) {
        g0.p(request, "request");
        if (this.f8176f != null) {
            return;
        }
        this.f8176f = this.f8175e.G0(f8162i.a(request), request.f() != null);
        if (this.f8178h) {
            d dVar = this.f8176f;
            g0.m(dVar);
            dVar.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        d dVar2 = this.f8176f;
        g0.m(dVar2);
        i1 x11 = dVar2.x();
        long m11 = this.f8174d.m();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x11.k(m11, timeUnit);
        d dVar3 = this.f8176f;
        g0.m(dVar3);
        dVar3.L().k(this.f8174d.o(), timeUnit);
    }

    @Override // a60.d
    @l
    public n.a g(boolean z11) {
        d dVar = this.f8176f;
        if (dVar == null) {
            throw new IOException("stream wasn't created");
        }
        n.a b11 = f8162i.b(dVar.H(), this.f8177g);
        if (z11 && b11.j() == 100) {
            return null;
        }
        return b11;
    }

    @Override // a60.d
    @k
    public z50.f getConnection() {
        return this.f8173c;
    }

    @Override // a60.d
    @k
    public h h() {
        d dVar = this.f8176f;
        g0.m(dVar);
        return dVar.I();
    }
}
