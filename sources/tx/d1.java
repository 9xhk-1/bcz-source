package tx;

import tx.m;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d1 implements m<d1, p0.f> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final sx.g f91071a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public p0.f f91072b;

    public d1(@m80.k sx.g selector, @m80.k p0.f options) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f91071a = selector;
        this.f91072b = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(d1 d1Var, l0 l0Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l0Var = null;
        }
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: tx.b1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 g11;
                    g11 = d1.g((p0.f) obj2);
                    return g11;
                }
            };
        }
        return d1Var.e(l0Var, lVar, cVar);
    }

    public static final g2 g(p0.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(d1 d1Var, l0 l0Var, l0 l0Var2, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l0Var2 = null;
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: tx.c1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k11;
                    k11 = d1.k((p0.f) obj2);
                    return k11;
                }
            };
        }
        return d1Var.i(l0Var, l0Var2, lVar, cVar);
    }

    public static final g2 k(p0.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        return g2.f100423a;
    }

    @m80.l
    public final Object e(@m80.l l0 l0Var, @m80.k x00.l<? super p0.f, g2> lVar, @m80.k j00.c<? super g> cVar) {
        sx.g gVar = this.f91071a;
        p0.f r11 = getOptions().r();
        lVar.invoke(r11);
        return e1.a(gVar, l0Var, r11);
    }

    @Override // tx.m
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d1 b(@m80.k x00.l<? super p0.f, g2> lVar) {
        return (d1) m.a.a(this, lVar);
    }

    @m80.l
    public final Object i(@m80.k l0 l0Var, @m80.l l0 l0Var2, @m80.k x00.l<? super p0.f, g2> lVar, @m80.k j00.c<? super o> cVar) {
        sx.g gVar = this.f91071a;
        p0.f r11 = getOptions().r();
        lVar.invoke(r11);
        return e1.b(gVar, l0Var, l0Var2, r11);
    }

    @Override // tx.m
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p0.f getOptions() {
        return this.f91072b;
    }

    @Override // tx.m
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k p0.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<set-?>");
        this.f91072b = fVar;
    }
}
