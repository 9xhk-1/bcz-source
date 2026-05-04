package y4;

import k3.o4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;
import y4.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c
/* loaded from: classes3.dex */
public final class c {
    @m80.k
    public final o4 a(@m80.k o4 state, @m80.k a action) {
        o4 P;
        o4 B;
        o4 L;
        o4 D;
        o4 F;
        o4 N;
        o4 H;
        o4 J;
        o4 T;
        o4 R;
        o4 y11;
        o4 A;
        o4 z11;
        g0.p(state, "state");
        g0.p(action, "action");
        z6.b.j(z6.b.f101032b, n.f99273a, "current state " + (state instanceof o4.c) + j2.O + (state instanceof o4.b) + " , action " + action, null, 4, null);
        if (action instanceof a.b) {
            z11 = n.z(state, (a.b) action);
            return z11;
        }
        if (action instanceof a.c) {
            A = n.A(state, (a.c) action);
            return A;
        }
        if (action instanceof a.C1343a) {
            y11 = n.y(state, (a.C1343a) action);
            return y11;
        }
        if (action instanceof a.l) {
            R = n.R(state, (a.l) action);
            return R;
        }
        if (action instanceof a.m) {
            T = n.T(state, (a.m) action);
            return T;
        }
        if (action instanceof a.h) {
            J = n.J(state, (a.h) action);
            return J;
        }
        if (action instanceof a.g) {
            H = n.H(state, (a.g) action);
            return H;
        }
        if (action instanceof a.j) {
            N = n.N(state, (a.j) action);
            return N;
        }
        if (action instanceof a.f) {
            F = n.F(state, (a.f) action);
            return F;
        }
        if (action instanceof a.e) {
            D = n.D(state, (a.e) action);
            return D;
        }
        if (action instanceof a.i) {
            L = n.L(state, (a.i) action);
            return L;
        }
        if (action instanceof a.d) {
            B = n.B(state, (a.d) action);
            return B;
        }
        if (!(action instanceof a.k)) {
            throw new NoWhenBranchMatchedException();
        }
        P = n.P(state, (a.k) action);
        return P;
    }
}
