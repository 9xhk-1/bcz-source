package ix;

import java.net.URI;
import java.net.URL;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtilsJvm.kt\nio/ktor/http/URLUtilsJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: classes8.dex */
public final class j2 {
    @m80.k
    public static final t2 a(@m80.k URI uri) {
        kotlin.jvm.internal.g0.p(uri, "uri");
        return b(new b2(null, null, 0, null, null, null, null, null, false, 511, null), uri).b();
    }

    @m80.k
    public static final b2 b(@m80.k b2 b2Var, @m80.k URI uri) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme != null) {
            b2Var.C(h2.f62830c.a(scheme));
            b2Var.B(b2Var.o().k());
        }
        if (uri.getPort() > 0) {
            b2Var.B(uri.getPort());
        } else {
            String scheme2 = uri.getScheme();
            if (kotlin.jvm.internal.g0.g(scheme2, "http")) {
                b2Var.B(80);
            } else if (kotlin.jvm.internal.g0.g(scheme2, "https")) {
                b2Var.B(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            String rawUserInfo = uri.getRawUserInfo();
            kotlin.jvm.internal.g0.o(rawUserInfo, "getRawUserInfo(...)");
            if (rawUserInfo.length() > 0) {
                String rawUserInfo2 = uri.getRawUserInfo();
                kotlin.jvm.internal.g0.o(rawUserInfo2, "getRawUserInfo(...)");
                List o52 = u30.k0.o5(rawUserInfo2, new String[]{":"}, false, 0, 6, null);
                b2Var.w((String) a00.r0.G2(o52));
                b2Var.u((String) a00.r0.b3(o52, 1));
            }
        }
        String host = uri.getHost();
        if (host != null) {
            b2Var.y(host);
        }
        e2.x(b2Var, uri.getRawPath());
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            q1 b11 = t1.b(0, 1, null);
            b11.j(v1.d(rawQuery, 0, 0, false, 6, null));
            b2Var.t(b11);
        }
        String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            b2Var.E(true);
        }
        String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            b2Var.s(rawFragment);
        }
        return b2Var;
    }

    @m80.k
    public static final b2 c(@m80.k b2 b2Var, @m80.k URL url) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(url, "url");
        String host = url.getHost();
        kotlin.jvm.internal.g0.o(host, "getHost(...)");
        if (u30.k0.m3(host, '_', false, 2, null)) {
            String url2 = url.toString();
            kotlin.jvm.internal.g0.o(url2, "toString(...)");
            return g2.m(b2Var, url2);
        }
        URI uri = url.toURI();
        kotlin.jvm.internal.g0.o(uri, "toURI(...)");
        return b(b2Var, uri);
    }

    @m80.k
    public static final URI d(@m80.k t2 t2Var) {
        kotlin.jvm.internal.g0.p(t2Var, "<this>");
        return new URI(t2Var.toString());
    }
}
