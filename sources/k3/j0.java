package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65374a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65375b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f65376c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f65377d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65378e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Integer f65379f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Boolean f65380g;

    public j0(int i11, @m80.k String schoolName, @m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l Integer num3, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(schoolName, "schoolName");
        this.f65374a = i11;
        this.f65375b = schoolName;
        this.f65376c = num;
        this.f65377d = num2;
        this.f65378e = str;
        this.f65379f = num3;
        this.f65380g = bool;
    }

    public static /* synthetic */ j0 i(j0 j0Var, int i11, String str, Integer num, Integer num2, String str2, Integer num3, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = j0Var.f65374a;
        }
        if ((i12 & 2) != 0) {
            str = j0Var.f65375b;
        }
        if ((i12 & 4) != 0) {
            num = j0Var.f65376c;
        }
        if ((i12 & 8) != 0) {
            num2 = j0Var.f65377d;
        }
        if ((i12 & 16) != 0) {
            str2 = j0Var.f65378e;
        }
        if ((i12 & 32) != 0) {
            num3 = j0Var.f65379f;
        }
        if ((i12 & 64) != 0) {
            bool = j0Var.f65380g;
        }
        Integer num4 = num3;
        Boolean bool2 = bool;
        String str3 = str2;
        Integer num5 = num;
        return j0Var.h(i11, str, num5, num2, str3, num4, bool2);
    }

    public final int a() {
        return this.f65374a;
    }

    @m80.k
    public final String b() {
        return this.f65375b;
    }

    @m80.l
    public final Integer c() {
        return this.f65376c;
    }

    @m80.l
    public final Integer d() {
        return this.f65377d;
    }

    @m80.l
    public final String e() {
        return this.f65378e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f65374a == j0Var.f65374a && kotlin.jvm.internal.g0.g(this.f65375b, j0Var.f65375b) && kotlin.jvm.internal.g0.g(this.f65376c, j0Var.f65376c) && kotlin.jvm.internal.g0.g(this.f65377d, j0Var.f65377d) && kotlin.jvm.internal.g0.g(this.f65378e, j0Var.f65378e) && kotlin.jvm.internal.g0.g(this.f65379f, j0Var.f65379f) && kotlin.jvm.internal.g0.g(this.f65380g, j0Var.f65380g);
    }

    @m80.l
    public final Integer f() {
        return this.f65379f;
    }

    @m80.l
    public final Boolean g() {
        return this.f65380g;
    }

    @m80.k
    public final j0 h(int i11, @m80.k String schoolName, @m80.l Integer num, @m80.l Integer num2, @m80.l String str, @m80.l Integer num3, @m80.l Boolean bool) {
        kotlin.jvm.internal.g0.p(schoolName, "schoolName");
        return new j0(i11, schoolName, num, num2, str, num3, bool);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65374a) * 31) + this.f65375b.hashCode()) * 31;
        Integer num = this.f65376c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f65377d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f65378e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f65379f;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f65380g;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @m80.l
    public final Integer j() {
        return this.f65377d;
    }

    @m80.l
    public final String k() {
        return this.f65378e;
    }

    @m80.l
    public final Integer l() {
        return this.f65379f;
    }

    public final int m() {
        return this.f65374a;
    }

    @m80.k
    public final String n() {
        return this.f65375b;
    }

    @m80.l
    public final Integer o() {
        return this.f65376c;
    }

    @m80.l
    public final Boolean p() {
        return this.f65380g;
    }

    @m80.k
    public String toString() {
        return "EducationInfoModel(schoolId=" + this.f65374a + ", schoolName=" + this.f65375b + ", schoolYear=" + this.f65376c + ", majorId=" + this.f65377d + ", majorName=" + this.f65378e + ", schoolBg=" + this.f65379f + ", isUniversity=" + this.f65380g + ')';
    }
}
