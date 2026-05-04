package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public class m2 extends r2 implements a0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7890c;

    public m2(@m80.l l2 l2Var) {
        super(true);
        m1(l2Var);
        this.f7890c = Z1();
    }

    @Override // c40.r2
    public boolean Y0() {
        return this.f7890c;
    }

    public final boolean Z1() {
        r2 B;
        u e12 = e1();
        v vVar = e12 instanceof v ? (v) e12 : null;
        if (vVar != null && (B = vVar.B()) != null) {
            while (!B.Y0()) {
                u e13 = B.e1();
                v vVar2 = e13 instanceof v ? (v) e13 : null;
                if (vVar2 != null && (B = vVar2.B()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c40.r2
    public boolean b1() {
        return true;
    }

    @Override // c40.a0
    public boolean complete() {
        return v1(yz.g2.f100423a);
    }

    @Override // c40.a0
    public boolean r(@m80.k Throwable th2) {
        return v1(new c0(th2, false, 2, null));
    }
}
