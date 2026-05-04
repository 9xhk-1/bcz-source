package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65666a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final j0 f65667b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65668c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65669d;

    public v3(int i11, @m80.l j0 j0Var, @m80.k String ipDesc, @m80.k String position) {
        kotlin.jvm.internal.g0.p(ipDesc, "ipDesc");
        kotlin.jvm.internal.g0.p(position, "position");
        this.f65666a = i11;
        this.f65667b = j0Var;
        this.f65668c = ipDesc;
        this.f65669d = position;
    }

    public static /* synthetic */ v3 f(v3 v3Var, int i11, j0 j0Var, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = v3Var.f65666a;
        }
        if ((i12 & 2) != 0) {
            j0Var = v3Var.f65667b;
        }
        if ((i12 & 4) != 0) {
            str = v3Var.f65668c;
        }
        if ((i12 & 8) != 0) {
            str2 = v3Var.f65669d;
        }
        return v3Var.e(i11, j0Var, str, str2);
    }

    public final int a() {
        return this.f65666a;
    }

    @m80.l
    public final j0 b() {
        return this.f65667b;
    }

    @m80.k
    public final String c() {
        return this.f65668c;
    }

    @m80.k
    public final String d() {
        return this.f65669d;
    }

    @m80.k
    public final v3 e(int i11, @m80.l j0 j0Var, @m80.k String ipDesc, @m80.k String position) {
        kotlin.jvm.internal.g0.p(ipDesc, "ipDesc");
        kotlin.jvm.internal.g0.p(position, "position");
        return new v3(i11, j0Var, ipDesc, position);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return this.f65666a == v3Var.f65666a && kotlin.jvm.internal.g0.g(this.f65667b, v3Var.f65667b) && kotlin.jvm.internal.g0.g(this.f65668c, v3Var.f65668c) && kotlin.jvm.internal.g0.g(this.f65669d, v3Var.f65669d);
    }

    public final int g() {
        return this.f65666a;
    }

    @m80.l
    public final j0 h() {
        return this.f65667b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f65666a) * 31;
        j0 j0Var = this.f65667b;
        return ((((hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + this.f65668c.hashCode()) * 31) + this.f65669d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f65668c;
    }

    @m80.k
    public final String j() {
        return this.f65669d;
    }

    @m80.k
    public String toString() {
        return "UserInfoModel(birthday=" + this.f65666a + ", educationInfo=" + this.f65667b + ", ipDesc=" + this.f65668c + ", position=" + this.f65669d + ')';
    }
}
