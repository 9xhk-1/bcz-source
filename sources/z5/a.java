package z5;

import f4.w2;
import kotlin.jvm.internal.g0;
import p8.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @m80.k
    public static final w2 a(@m80.k v0 v0Var, long j11) {
        g0.p(v0Var, "<this>");
        return new w2(j11, v0Var.f80204a, v0Var.f80205b, v0Var.f80206c ? 1L : 0L, v0Var.f80207d, v0Var.f80208e, v0Var.f80209f, v0Var.f80210g);
    }

    @m80.k
    public static final v0 b(@m80.k w2 w2Var, int i11, int i12, int i13) {
        g0.p(w2Var, "<this>");
        return new v0.a().j((int) w2Var.q()).d((int) w2Var.l()).i((int) w2Var.p()).e(i.e(w2Var)).f(w2Var.m()).h((int) w2Var.o()).g((int) w2Var.n()).a(Integer.valueOf(i11)).c(Integer.valueOf(i12)).k(Integer.valueOf(i13)).build();
    }

    public static /* synthetic */ v0 c(w2 w2Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return b(w2Var, i11, i12, i13);
    }
}
