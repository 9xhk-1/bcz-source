package u50;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import okhttp3.h;
import okhttp3.i;
import okhttp3.n;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Internal")
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final h.a a(@k h.a builder, @k String line) {
        g0.p(builder, "builder");
        g0.p(line, "line");
        return builder.f(line);
    }

    @k
    public static final h.a b(@k h.a builder, @k String name, @k String value) {
        g0.p(builder, "builder");
        g0.p(name, "name");
        g0.p(value, "value");
        return builder.g(name, value);
    }

    public static final void c(@k okhttp3.e connectionSpec, @k SSLSocket sslSocket, boolean z11) {
        g0.p(connectionSpec, "connectionSpec");
        g0.p(sslSocket, "sslSocket");
        connectionSpec.f(sslSocket, z11);
    }

    @l
    public static final n d(@k okhttp3.b cache, @k okhttp3.l request) {
        g0.p(cache, "cache");
        g0.p(request, "request");
        return cache.k(request);
    }

    @k
    public static final String e(@k t50.h cookie, boolean z11) {
        g0.p(cookie, "cookie");
        return cookie.y(z11);
    }

    @l
    public static final t50.h f(long j11, @k i url, @k String setCookie) {
        g0.p(url, "url");
        g0.p(setCookie, "setCookie");
        return t50.h.f89592j.f(j11, url, setCookie);
    }
}
