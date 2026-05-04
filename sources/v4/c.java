package v4;

import k3.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import v4.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c
/* loaded from: classes3.dex */
public final class c {
    @m80.k
    public final u2 a(@m80.k u2 state, @m80.k a action) {
        u2 v11;
        u2 D;
        u2 z11;
        u2 x11;
        u2 B;
        u2 H;
        u2 F;
        u2 s11;
        u2 u11;
        u2 t11;
        g0.p(state, "state");
        g0.p(action, "action");
        if (action instanceof a.b) {
            t11 = k.t(state, (a.b) action);
            return t11;
        }
        if (action instanceof a.c) {
            u11 = k.u(state, (a.c) action);
            return u11;
        }
        if (action instanceof a.C1250a) {
            s11 = k.s(state, (a.C1250a) action);
            return s11;
        }
        if (action instanceof a.i) {
            F = k.F(state, (a.i) action);
            return F;
        }
        if (action instanceof a.j) {
            H = k.H(state, (a.j) action);
            return H;
        }
        if (action instanceof a.g) {
            B = k.B(state, (a.g) action);
            return B;
        }
        if (action instanceof a.e) {
            x11 = k.x(state, (a.e) action);
            return x11;
        }
        if (action instanceof a.f) {
            z11 = k.z(state, (a.f) action);
            return z11;
        }
        if (action instanceof a.h) {
            D = k.D(state, (a.h) action);
            return D;
        }
        if (!(action instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        v11 = k.v(state, (a.d) action);
        return v11;
    }
}
