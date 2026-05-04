package z50;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import t50.m;
import t50.q;
import t50.r;
import z50.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f100953a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final okhttp3.a f100954b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f100955c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m f100956d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public i.b f100957e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public i f100958f;

    /* renamed from: g, reason: collision with root package name */
    public int f100959g;

    /* renamed from: h, reason: collision with root package name */
    public int f100960h;

    /* renamed from: i, reason: collision with root package name */
    public int f100961i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public r f100962j;

    public d(@k g connectionPool, @k okhttp3.a address, @k e call, @k m eventListener) {
        g0.p(connectionPool, "connectionPool");
        g0.p(address, "address");
        g0.p(call, "call");
        g0.p(eventListener, "eventListener");
        this.f100953a = connectionPool;
        this.f100954b = address;
        this.f100955c = call;
        this.f100956d = eventListener;
    }

    @k
    public final a60.d a(@k q client, @k a60.g chain) {
        g0.p(client, "client");
        g0.p(chain, "chain");
        try {
        } catch (IOException e11) {
            e = e11;
        } catch (RouteException e12) {
            e = e12;
        }
        try {
            return c(chain.k(), chain.m(), chain.o(), client.m0(), client.s0(), !g0.g(chain.n().m(), "GET")).B(client, chain);
        } catch (IOException e13) {
            e = e13;
            IOException iOException = e;
            h(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e14) {
            e = e14;
            RouteException routeException = e;
            h(routeException.getLastConnectException());
            throw routeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z50.f b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z50.d.b(int, int, int, int, boolean):z50.f");
    }

    public final f c(int i11, int i12, int i13, int i14, boolean z11, boolean z12) throws IOException {
        while (true) {
            f b11 = b(i11, i12, i13, i14, z11);
            boolean z13 = z11;
            int i15 = i14;
            int i16 = i13;
            int i17 = i12;
            int i18 = i11;
            if (b11.z(z12)) {
                return b11;
            }
            b11.E();
            if (this.f100962j == null) {
                i.b bVar = this.f100957e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    i iVar = this.f100958f;
                    if (!(iVar != null ? iVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i11 = i18;
            i12 = i17;
            i13 = i16;
            i14 = i15;
            z11 = z13;
        }
    }

    @k
    public final okhttp3.a d() {
        return this.f100954b;
    }

    public final boolean e() {
        i iVar;
        if (this.f100959g == 0 && this.f100960h == 0 && this.f100961i == 0) {
            return false;
        }
        if (this.f100962j != null) {
            return true;
        }
        r f11 = f();
        if (f11 != null) {
            this.f100962j = f11;
            return true;
        }
        i.b bVar = this.f100957e;
        if ((bVar == null || !bVar.b()) && (iVar = this.f100958f) != null) {
            return iVar.a();
        }
        return true;
    }

    public final r f() {
        f l11;
        if (this.f100959g > 1 || this.f100960h > 1 || this.f100961i > 0 || (l11 = this.f100955c.l()) == null) {
            return null;
        }
        synchronized (l11) {
            if (l11.w() != 0) {
                return null;
            }
            if (u50.f.l(l11.b().d().w(), this.f100954b.w())) {
                return l11.b();
            }
            return null;
        }
    }

    public final boolean g(@k okhttp3.i url) {
        g0.p(url, "url");
        okhttp3.i w11 = this.f100954b.w();
        return url.N() == w11.N() && g0.g(url.F(), w11.F());
    }

    public final void h(@k IOException e11) {
        g0.p(e11, "e");
        this.f100962j = null;
        if ((e11 instanceof StreamResetException) && ((StreamResetException) e11).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f100959g++;
        } else if (e11 instanceof ConnectionShutdownException) {
            this.f100960h++;
        } else {
            this.f100961i++;
        }
    }
}
