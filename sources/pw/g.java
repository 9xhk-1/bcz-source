package pw;

import kotlin.jvm.internal.g0;
import t50.q;
import t50.s;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g extends ow.j {

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public t50.q f81211f;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public s.a f81213h;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public x00.l<? super q.a, g2> f81210e = new x00.l() { // from class: pw.c
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 s11;
            s11 = g.s((q.a) obj);
            return s11;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public int f81212g = 10;

    public static final g2 o(t50.n nVar, q.a config) {
        g0.p(config, "$this$config");
        config.c(nVar);
        return g2.f100423a;
    }

    public static final g2 q(t50.n nVar, q.a config) {
        g0.p(config, "$this$config");
        config.d(nVar);
        return g2.f100423a;
    }

    public static final g2 s(q.a aVar) {
        g0.p(aVar, "<this>");
        aVar.t(false);
        aVar.u(false);
        aVar.l0(true);
        return g2.f100423a;
    }

    public static final g2 t(x00.l lVar, x00.l lVar2, q.a aVar) {
        g0.p(aVar, "<this>");
        lVar.invoke(aVar);
        lVar2.invoke(aVar);
        return g2.f100423a;
    }

    public final void A(@m80.l t50.q qVar) {
        this.f81211f = qVar;
    }

    public final void B(@m80.l s.a aVar) {
        this.f81213h = aVar;
    }

    public final void n(@m80.k final t50.n interceptor) {
        g0.p(interceptor, "interceptor");
        r(new x00.l() { // from class: pw.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = g.o(t50.n.this, (q.a) obj);
                return o11;
            }
        });
    }

    public final void p(@m80.k final t50.n interceptor) {
        g0.p(interceptor, "interceptor");
        r(new x00.l() { // from class: pw.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = g.q(t50.n.this, (q.a) obj);
                return q11;
            }
        });
    }

    public final void r(@m80.k final x00.l<? super q.a, g2> block) {
        g0.p(block, "block");
        final x00.l<? super q.a, g2> lVar = this.f81210e;
        this.f81210e = new x00.l() { // from class: pw.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t11;
                t11 = g.t(x00.l.this, block, (q.a) obj);
                return t11;
            }
        };
    }

    public final int u() {
        return this.f81212g;
    }

    @m80.k
    public final x00.l<q.a, g2> v() {
        return this.f81210e;
    }

    @m80.l
    public final t50.q w() {
        return this.f81211f;
    }

    @m80.l
    public final s.a x() {
        return this.f81213h;
    }

    public final void y(int i11) {
        this.f81212g = i11;
    }

    public final void z(@m80.k x00.l<? super q.a, g2> lVar) {
        g0.p(lVar, "<set-?>");
        this.f81210e = lVar;
    }
}
