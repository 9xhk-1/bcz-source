package x7;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import t50.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r {
    @m80.k
    public static final lw.c i(@m80.k final x00.l<? super lw.j<?>, g2> block) {
        g0.p(block, "block");
        return lw.p.d(pw.a.f81203a, new x00.l() { // from class: x7.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l11;
                l11 = r.l(x00.l.this, (lw.j) obj);
                return l11;
            }
        });
    }

    public static /* synthetic */ lw.c j(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: x7.q
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k11;
                    k11 = r.k((lw.j) obj2);
                    return k11;
                }
            };
        }
        return i(lVar);
    }

    public static final g2 k(lw.j jVar) {
        g0.p(jVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 l(x00.l lVar, lw.j HttpClient) {
        g0.p(HttpClient, "$this$HttpClient");
        HttpClient.h(new x00.l() { // from class: x7.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m11;
                m11 = r.m((pw.g) obj);
                return m11;
            }
        });
        lVar.invoke(HttpClient);
        return g2.f100423a;
    }

    public static final g2 m(pw.g engine) {
        g0.p(engine, "$this$engine");
        engine.r(new x00.l() { // from class: x7.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = r.n((q.a) obj);
                return n11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 n(q.a config) {
        g0.p(config, "$this$config");
        config.t(false);
        return g2.f100423a;
    }

    @m80.k
    public static final lw.c o(@m80.k final x00.l<? super lw.j<?>, g2> block) {
        g0.p(block, "block");
        return lw.p.d(pw.a.f81203a, new x00.l() { // from class: x7.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = r.r(x00.l.this, (lw.j) obj);
                return r11;
            }
        });
    }

    public static /* synthetic */ lw.c p(x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: x7.m
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 q11;
                    q11 = r.q((lw.j) obj2);
                    return q11;
                }
            };
        }
        return o(lVar);
    }

    public static final g2 q(lw.j jVar) {
        g0.p(jVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 r(x00.l lVar, lw.j HttpClient) {
        g0.p(HttpClient, "$this$HttpClient");
        HttpClient.h(new x00.l() { // from class: x7.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s11;
                s11 = r.s((pw.g) obj);
                return s11;
            }
        });
        lVar.invoke(HttpClient);
        return g2.f100423a;
    }

    public static final g2 s(pw.g engine) {
        g0.p(engine, "$this$engine");
        engine.r(new x00.l() { // from class: x7.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t11;
                t11 = r.t((q.a) obj);
                return t11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 t(q.a config) {
        g0.p(config, "$this$config");
        config.t(false);
        config.m(new t50.g(20, 30L, TimeUnit.SECONDS));
        return g2.f100423a;
    }
}
