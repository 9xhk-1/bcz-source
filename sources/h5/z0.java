package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58495a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y0 f58496b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final y0 f58497c;

    public z0(int i11, @m80.k y0 curMileStone, @m80.l y0 y0Var) {
        kotlin.jvm.internal.g0.p(curMileStone, "curMileStone");
        this.f58495a = i11;
        this.f58496b = curMileStone;
        this.f58497c = y0Var;
    }

    public static /* synthetic */ z0 e(z0 z0Var, int i11, y0 y0Var, y0 y0Var2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = z0Var.f58495a;
        }
        if ((i12 & 2) != 0) {
            y0Var = z0Var.f58496b;
        }
        if ((i12 & 4) != 0) {
            y0Var2 = z0Var.f58497c;
        }
        return z0Var.d(i11, y0Var, y0Var2);
    }

    public final int a() {
        return this.f58495a;
    }

    @m80.k
    public final y0 b() {
        return this.f58496b;
    }

    @m80.l
    public final y0 c() {
        return this.f58497c;
    }

    @m80.k
    public final z0 d(int i11, @m80.k y0 curMileStone, @m80.l y0 y0Var) {
        kotlin.jvm.internal.g0.p(curMileStone, "curMileStone");
        return new z0(i11, curMileStone, y0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f58495a == z0Var.f58495a && kotlin.jvm.internal.g0.g(this.f58496b, z0Var.f58496b) && kotlin.jvm.internal.g0.g(this.f58497c, z0Var.f58497c);
    }

    public final int f() {
        return this.f58495a;
    }

    @m80.k
    public final y0 g() {
        return this.f58496b;
    }

    @m80.l
    public final y0 h() {
        return this.f58497c;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f58495a) * 31) + this.f58496b.hashCode()) * 31;
        y0 y0Var = this.f58497c;
        return hashCode + (y0Var == null ? 0 : y0Var.hashCode());
    }

    @m80.k
    public String toString() {
        return "WinningStreakJourney(curDay=" + this.f58495a + ", curMileStone=" + this.f58496b + ", nextMileStone=" + this.f58497c + ')';
    }
}
