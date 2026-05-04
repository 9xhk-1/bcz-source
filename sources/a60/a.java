package a60;

import a00.h0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.r0;
import l60.z;
import okhttp3.l;
import okhttp3.m;
import okhttp3.n;
import okhttp3.o;
import t50.n;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t50.i f1995a;

    public a(@m80.k t50.i cookieJar) {
        g0.p(cookieJar, "cookieJar");
        this.f1995a = cookieJar;
    }

    public final String a(List<t50.h> list) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            t50.h hVar = (t50.h) obj;
            if (i11 > 0) {
                sb2.append("; ");
            }
            sb2.append(hVar.s());
            sb2.append('=');
            sb2.append(hVar.z());
            i11 = i12;
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // t50.n
    @m80.k
    public okhttp3.n intercept(@m80.k n.a chain) throws IOException {
        o L;
        g0.p(chain, "chain");
        l request = chain.request();
        l.a n11 = request.n();
        m f11 = request.f();
        if (f11 != null) {
            okhttp3.j b11 = f11.b();
            if (b11 != null) {
                n11.n("Content-Type", b11.toString());
            }
            long a11 = f11.a();
            if (a11 != -1) {
                n11.n("Content-Length", String.valueOf(a11));
                n11.t("Transfer-Encoding");
            } else {
                n11.n("Transfer-Encoding", c80.f.f8329r);
                n11.t("Content-Length");
            }
        }
        boolean z11 = false;
        if (request.i("Host") == null) {
            n11.n("Host", u50.f.g0(request.q(), false, 1, null));
        }
        if (request.i("Connection") == null) {
            n11.n("Connection", "Keep-Alive");
        }
        if (request.i("Accept-Encoding") == null && request.i("Range") == null) {
            n11.n("Accept-Encoding", "gzip");
            z11 = true;
        }
        List<t50.h> a12 = this.f1995a.a(request.q());
        if (!a12.isEmpty()) {
            n11.n("Cookie", a(a12));
        }
        if (request.i("User-Agent") == null) {
            n11.n("User-Agent", u50.f.f91855j);
        }
        okhttp3.n c11 = chain.c(n11.b());
        e.g(this.f1995a, request.q(), c11.k0());
        n.a E = c11.v0().E(request);
        if (z11 && f0.c2("gzip", okhttp3.n.h0(c11, "Content-Encoding", null, 2, null), true) && e.c(c11) && (L = c11.L()) != null) {
            z zVar = new z(L.V());
            E.w(c11.k0().k().l("Content-Encoding").l("Content-Length").i());
            E.b(new h(okhttp3.n.h0(c11, "Content-Type", null, 2, null), -1L, r0.e(zVar)));
        }
        return E.c();
    }
}
