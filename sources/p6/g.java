package p6;

import m3.g1;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f79189a = "CalculateRankScoreUC";

    public static final int b(g1 g1Var) {
        int k11 = g1Var.k() - g1Var.m();
        int m11 = g1Var.m() - k11;
        int m12 = m11 <= 0 ? g1Var.m() : (m11 <= 0 || m11 > g1Var.m()) ? g1Var.m() * 2 : (m11 * 2) + (g1Var.m() - m11);
        z6.b.d(z6.b.f101032b, f79189a, "[a,c, e, p, s] [" + g1Var.k() + j2.O + g1Var.m() + j2.O + k11 + j2.O + m11 + j2.O + m12 + l50.b.f69930l, null, 4, null);
        return m12;
    }
}
