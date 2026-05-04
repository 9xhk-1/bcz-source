package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class r0 implements q10.a, i30.g {

    /* renamed from: a, reason: collision with root package name */
    public int f48651a;

    public /* synthetic */ r0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public final int F0() {
        return v0.a(this) ? super.hashCode() : (((I0().hashCode() * 31) + G0().hashCode()) * 31) + (J0() ? 1 : 0);
    }

    @m80.k
    public abstract List<a2> G0();

    @m80.k
    public abstract r1 H0();

    @m80.k
    public abstract u1 I0();

    public abstract boolean J0();

    @m80.k
    public abstract r0 K0(@m80.k f30.g gVar);

    @m80.k
    public abstract k2 L0();

    public final boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return J0() == r0Var.J0() && f30.v.f50459a.a(L0(), r0Var.L0());
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        return s.a(H0());
    }

    public final int hashCode() {
        int i11 = this.f48651a;
        if (i11 != 0) {
            return i11;
        }
        int F0 = F0();
        this.f48651a = F0;
        return F0;
    }

    @m80.k
    public abstract x20.k r();

    public r0() {
    }
}
