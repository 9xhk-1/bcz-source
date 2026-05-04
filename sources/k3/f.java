package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a0 f65293a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final a0 f65294b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final a0 f65295c;

    public f(@m80.k a0 province, @m80.l a0 a0Var, @m80.l a0 a0Var2) {
        kotlin.jvm.internal.g0.p(province, "province");
        this.f65293a = province;
        this.f65294b = a0Var;
        this.f65295c = a0Var2;
    }

    public static /* synthetic */ f e(f fVar, a0 a0Var, a0 a0Var2, a0 a0Var3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = fVar.f65293a;
        }
        if ((i11 & 2) != 0) {
            a0Var2 = fVar.f65294b;
        }
        if ((i11 & 4) != 0) {
            a0Var3 = fVar.f65295c;
        }
        return fVar.d(a0Var, a0Var2, a0Var3);
    }

    @m80.k
    public final a0 a() {
        return this.f65293a;
    }

    @m80.l
    public final a0 b() {
        return this.f65294b;
    }

    @m80.l
    public final a0 c() {
        return this.f65295c;
    }

    @m80.k
    public final f d(@m80.k a0 province, @m80.l a0 a0Var, @m80.l a0 a0Var2) {
        kotlin.jvm.internal.g0.p(province, "province");
        return new f(province, a0Var, a0Var2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.g0.g(this.f65293a, fVar.f65293a) && kotlin.jvm.internal.g0.g(this.f65294b, fVar.f65294b) && kotlin.jvm.internal.g0.g(this.f65295c, fVar.f65295c);
    }

    @m80.l
    public final a0 f() {
        return this.f65294b;
    }

    @m80.l
    public final a0 g() {
        return this.f65295c;
    }

    @m80.k
    public final a0 h() {
        return this.f65293a;
    }

    public int hashCode() {
        int hashCode = this.f65293a.hashCode() * 31;
        a0 a0Var = this.f65294b;
        int hashCode2 = (hashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        a0 a0Var2 = this.f65295c;
        return hashCode2 + (a0Var2 != null ? a0Var2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "AddressMatchResult(province=" + this.f65293a + ", city=" + this.f65294b + ", district=" + this.f65295c + ')';
    }
}
