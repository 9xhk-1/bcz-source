package g20;

import e30.h2;
import e30.j2;
import e30.k2;
import e30.r1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends e30.z implements e30.z0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e30.c1 f52615b;

    public i(@m80.k e30.c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f52615b = delegate;
    }

    @Override // e30.v
    @m80.k
    public e30.r0 C(@m80.k e30.r0 replacement) {
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        k2 L0 = replacement.L0();
        if (!j30.e.z(L0) && !h2.l(L0)) {
            return L0;
        }
        if (L0 instanceof e30.c1) {
            return U0((e30.c1) L0);
        }
        if (L0 instanceof e30.i0) {
            e30.i0 i0Var = (e30.i0) L0;
            return j2.d(e30.u0.e(U0(i0Var.Q0()), U0(i0Var.R0())), j2.a(L0));
        }
        throw new IllegalStateException(("Incorrect type: " + L0).toString());
    }

    @Override // e30.v
    public boolean E0() {
        return true;
    }

    @Override // e30.z, e30.r0
    public boolean J0() {
        return false;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public e30.c1 M0(boolean z11) {
        return z11 ? R0().M0(true) : this;
    }

    @Override // e30.z
    @m80.k
    public e30.c1 R0() {
        return this.f52615b;
    }

    public final e30.c1 U0(e30.c1 c1Var) {
        e30.c1 M0 = c1Var.M0(false);
        return !j30.e.z(c1Var) ? M0 : new i(M0);
    }

    @Override // e30.c1
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public i O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return new i(R0().O0(newAttributes));
    }

    @Override // e30.z
    @m80.k
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public i T0(@m80.k e30.c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return new i(delegate);
    }
}
