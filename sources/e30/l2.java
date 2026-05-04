package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class l2 extends r0 {
    public l2() {
        super(null);
    }

    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return M0().G0();
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return M0().H0();
    }

    @Override // e30.r0
    @m80.k
    public u1 I0() {
        return M0().I0();
    }

    @Override // e30.r0
    public boolean J0() {
        return M0().J0();
    }

    @Override // e30.r0
    @m80.k
    public final k2 L0() {
        r0 M0 = M0();
        while (M0 instanceof l2) {
            M0 = ((l2) M0).M0();
        }
        kotlin.jvm.internal.g0.n(M0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (k2) M0;
    }

    @m80.k
    public abstract r0 M0();

    public boolean N0() {
        return true;
    }

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return M0().r();
    }

    @m80.k
    public String toString() {
        return N0() ? M0().toString() : "<Not computed yet>";
    }
}
