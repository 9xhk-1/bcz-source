package c6;

import g10.u;
import h5.g;
import h5.v0;
import h5.x;
import h5.y;
import kotlin.jvm.internal.g0;
import m80.k;
import p8.g1;
import p8.i1;
import p8.n;
import u8.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final g a(@k i1 i1Var, int i11) {
        g0.p(i1Var, "<this>");
        long j11 = i1Var.f79930c;
        long j12 = i1Var.f79929b;
        n nVar = i1Var.f79932e;
        long j13 = nVar.f80004a;
        return new g(i11, new x(j11, j12, j13, nVar.f80005b, i1Var.f79931d - j13), new v0(i1Var.f79928a));
    }

    @k
    public static final y b(@k j jVar) {
        g0.p(jVar, "<this>");
        Integer num = jVar.f91957h;
        int intValue = num != null ? num.intValue() : 0;
        Long l11 = jVar.f91951b;
        return new y(intValue, l11 != null ? l11.longValue() : 0L);
    }

    @k
    public static final y c(@k g1 g1Var) {
        g0.p(g1Var, "<this>");
        return new y(g1Var.f79834a, g1Var.f79835b);
    }

    @k
    public static final g d(@k g gVar) {
        g0.p(gVar, "<this>");
        long n11 = w3.g.n();
        x h11 = gVar.h();
        long j11 = n11 - h11.j();
        if (j11 > 0 && h11.p() > 0) {
            long p11 = j11 / h11.p();
            if (p11 > 0) {
                return g.e(gVar, 0, x.g(h11, Math.max(h11.h(), u.C(h11.h() + (h11.n() * p11), h11.l())), 0L, 0L, 0, h11.j() + (p11 * h11.p()), 14, null), null, 5, null);
            }
        }
        return gVar;
    }
}
