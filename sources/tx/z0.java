package tx;

import tx.m;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z0 implements m<z0, p0.d> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final sx.g f91229a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public p0.d f91230b;

    public z0(@m80.k sx.g selector, @m80.k p0.d options) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f91229a = selector;
        this.f91230b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object i(z0 z0Var, String str, int i11, x00.l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            lVar = new x00.l() { // from class: tx.y0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k11;
                    k11 = z0.k((p0.a) obj2);
                    return k11;
                }
            };
        }
        return z0Var.g(str, i11, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(z0 z0Var, l0 l0Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l0Var = null;
        }
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: tx.w0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 l11;
                    l11 = z0.l((p0.a) obj2);
                    return l11;
                }
            };
        }
        return z0Var.h(l0Var, lVar, cVar);
    }

    public static final g2 k(p0.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 l(p0.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object p(z0 z0Var, String str, int i11, x00.l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            lVar = new x00.l() { // from class: tx.v0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 r11;
                    r11 = z0.r((p0.e) obj2);
                    return r11;
                }
            };
        }
        return z0Var.n(str, i11, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object q(z0 z0Var, l0 l0Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: tx.x0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 s11;
                    s11 = z0.s((p0.e) obj2);
                    return s11;
                }
            };
        }
        return z0Var.o(l0Var, lVar, cVar);
    }

    public static final g2 r(p0.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return g2.f100423a;
    }

    public static final g2 s(p0.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return g2.f100423a;
    }

    @m80.l
    public final Object g(@m80.k String str, int i11, @m80.k x00.l<? super p0.a, g2> lVar, @m80.k j00.c<? super i0> cVar) {
        return h(new a0(str, i11), lVar, cVar);
    }

    @m80.l
    public final Object h(@m80.l l0 l0Var, @m80.k x00.l<? super p0.a, g2> lVar, @m80.k j00.c<? super i0> cVar) {
        sx.g gVar = this.f91229a;
        p0.a a11 = getOptions().a();
        lVar.invoke(a11);
        return n.a(gVar, l0Var, a11);
    }

    @Override // tx.m
    @m80.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public z0 b(@m80.k x00.l<? super p0.d, g2> lVar) {
        return (z0) m.a.a(this, lVar);
    }

    @m80.l
    public final Object n(@m80.k String str, int i11, @m80.k x00.l<? super p0.e, g2> lVar, @m80.k j00.c<? super k0> cVar) {
        return o(new a0(str, i11), lVar, cVar);
    }

    @m80.l
    public final Object o(@m80.k l0 l0Var, @m80.k x00.l<? super p0.e, g2> lVar, @m80.k j00.c<? super k0> cVar) {
        sx.g gVar = this.f91229a;
        p0.e q11 = getOptions().q();
        lVar.invoke(q11);
        return n.b(gVar, l0Var, q11, cVar);
    }

    @Override // tx.m
    @m80.k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public p0.d getOptions() {
        return this.f91230b;
    }

    @Override // tx.m
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k p0.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<set-?>");
        this.f91230b = dVar;
    }
}
