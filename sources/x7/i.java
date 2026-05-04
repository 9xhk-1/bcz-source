package x7;

import cx.k0;
import io.ktor.client.plugins.logging.LogLevel;
import kotlin.jvm.internal.g0;
import rw.d1;
import rw.f1;
import rw.g;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f97664a = e0.c(new x00.a() { // from class: x7.a
        @Override // x00.a
        public final Object invoke() {
            lw.c p11;
            p11 = i.p();
            return p11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c0 f97665b = e0.c(new x00.a() { // from class: x7.b
        @Override // x00.a
        public final Object invoke() {
            lw.c i11;
            i11 = i.i();
            return i11;
        }
    });

    public static final lw.c i() {
        return r.o(new x00.l() { // from class: x7.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = i.j((lw.j) obj);
                return j11;
            }
        });
    }

    public static final g2 j(lw.j createKtorDownloadClient) {
        g0.p(createKtorDownloadClient, "$this$createKtorDownloadClient");
        createKtorDownloadClient.s(f1.n(), new x00.l() { // from class: x7.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k11;
                k11 = i.k((d1) obj);
                return k11;
            }
        });
        createKtorDownloadClient.s(xw.m.u(), new x00.l() { // from class: x7.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = i.l((xw.i) obj);
                return l11;
            }
        });
        rw.i.c(createKtorDownloadClient, new x00.l() { // from class: x7.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m11;
                m11 = i.m((g.a) obj);
                return m11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 k(d1 install) {
        g0.p(install, "$this$install");
        install.g(15000L);
        install.f(5000L);
        install.h(5000L);
        return g2.f100423a;
    }

    public static final g2 l(xw.i install) {
        g0.p(install, "$this$install");
        install.i(LogLevel.INFO);
        return g2.f100423a;
    }

    public static final g2 m(g.a defaultRequest) {
        g0.p(defaultRequest, "$this$defaultRequest");
        k0.h(defaultRequest, "User-Agent", "KMP-FileDownloader-Android/1.0");
        k0.h(defaultRequest, "Accept-Encoding", "gzip, deflate");
        return g2.f100423a;
    }

    @m80.k
    public static final lw.c n() {
        return (lw.c) f97665b.getValue();
    }

    @m80.k
    public static final lw.c o() {
        return (lw.c) f97664a.getValue();
    }

    public static final lw.c p() {
        return r.i(new x00.l() { // from class: x7.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = i.q((lw.j) obj);
                return q11;
            }
        });
    }

    public static final g2 q(lw.j createKtorClient) {
        g0.p(createKtorClient, "$this$createKtorClient");
        lw.j.t(createKtorClient, f1.n(), null, 2, null);
        createKtorClient.s(xw.m.u(), new x00.l() { // from class: x7.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = i.r((xw.i) obj);
                return r11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 r(xw.i install) {
        g0.p(install, "$this$install");
        install.i(LogLevel.INFO);
        return g2.f100423a;
    }
}
