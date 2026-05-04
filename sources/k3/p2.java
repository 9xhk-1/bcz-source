package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65523b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65524c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f65525d;

    public p2(@m80.k String schoolName, int i11, boolean z11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(schoolName, "schoolName");
        this.f65522a = schoolName;
        this.f65523b = i11;
        this.f65524c = z11;
        this.f65525d = str;
    }

    public static /* synthetic */ p2 f(p2 p2Var, String str, int i11, boolean z11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = p2Var.f65522a;
        }
        if ((i12 & 2) != 0) {
            i11 = p2Var.f65523b;
        }
        if ((i12 & 4) != 0) {
            z11 = p2Var.f65524c;
        }
        if ((i12 & 8) != 0) {
            str2 = p2Var.f65525d;
        }
        return p2Var.e(str, i11, z11, str2);
    }

    @m80.k
    public final String a() {
        return this.f65522a;
    }

    public final int b() {
        return this.f65523b;
    }

    public final boolean c() {
        return this.f65524c;
    }

    @m80.l
    public final String d() {
        return this.f65525d;
    }

    @m80.k
    public final p2 e(@m80.k String schoolName, int i11, boolean z11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(schoolName, "schoolName");
        return new p2(schoolName, i11, z11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return kotlin.jvm.internal.g0.g(this.f65522a, p2Var.f65522a) && this.f65523b == p2Var.f65523b && this.f65524c == p2Var.f65524c && kotlin.jvm.internal.g0.g(this.f65525d, p2Var.f65525d);
    }

    @m80.l
    public final String g() {
        return this.f65525d;
    }

    public final int h() {
        return this.f65523b;
    }

    public int hashCode() {
        int hashCode = ((((this.f65522a.hashCode() * 31) + Integer.hashCode(this.f65523b)) * 31) + Boolean.hashCode(this.f65524c)) * 31;
        String str = this.f65525d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public final String i() {
        return this.f65522a;
    }

    public final boolean j() {
        return this.f65524c;
    }

    @m80.k
    public String toString() {
        return "SearchSchoolItem(schoolName=" + this.f65522a + ", schoolId=" + this.f65523b + ", isUniversity=" + this.f65524c + ", descrp=" + this.f65525d + ')';
    }
}
