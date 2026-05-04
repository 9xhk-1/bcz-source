package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class z extends c1 {
    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return R0().G0();
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return R0().H0();
    }

    @Override // e30.r0
    @m80.k
    public u1 I0() {
        return R0().I0();
    }

    @Override // e30.r0
    public boolean J0() {
        return R0().J0();
    }

    @m80.k
    public abstract c1 R0();

    @Override // e30.k2
    @m80.k
    public c1 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(R0());
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return T0((c1) a11);
    }

    @m80.k
    public abstract z T0(@m80.k c1 c1Var);

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return R0().r();
    }
}
