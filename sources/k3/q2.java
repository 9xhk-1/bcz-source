package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65553b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f65554c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f65555d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65556e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f65557f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final String f65558g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final Integer f65559h;

    public q2(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l Integer num) {
        this.f65552a = i11;
        this.f65553b = i12;
        this.f65554c = str;
        this.f65555d = str2;
        this.f65556e = str3;
        this.f65557f = str4;
        this.f65558g = str5;
        this.f65559h = num;
    }

    public static /* synthetic */ q2 j(q2 q2Var, int i11, int i12, String str, String str2, String str3, String str4, String str5, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = q2Var.f65552a;
        }
        if ((i13 & 2) != 0) {
            i12 = q2Var.f65553b;
        }
        if ((i13 & 4) != 0) {
            str = q2Var.f65554c;
        }
        if ((i13 & 8) != 0) {
            str2 = q2Var.f65555d;
        }
        if ((i13 & 16) != 0) {
            str3 = q2Var.f65556e;
        }
        if ((i13 & 32) != 0) {
            str4 = q2Var.f65557f;
        }
        if ((i13 & 64) != 0) {
            str5 = q2Var.f65558g;
        }
        if ((i13 & 128) != 0) {
            num = q2Var.f65559h;
        }
        String str6 = str5;
        Integer num2 = num;
        String str7 = str3;
        String str8 = str4;
        return q2Var.i(i11, i12, str, str2, str7, str8, str6, num2);
    }

    public final int a() {
        return this.f65552a;
    }

    public final int b() {
        return this.f65553b;
    }

    @m80.l
    public final String c() {
        return this.f65554c;
    }

    @m80.l
    public final String d() {
        return this.f65555d;
    }

    @m80.l
    public final String e() {
        return this.f65556e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f65552a == q2Var.f65552a && this.f65553b == q2Var.f65553b && kotlin.jvm.internal.g0.g(this.f65554c, q2Var.f65554c) && kotlin.jvm.internal.g0.g(this.f65555d, q2Var.f65555d) && kotlin.jvm.internal.g0.g(this.f65556e, q2Var.f65556e) && kotlin.jvm.internal.g0.g(this.f65557f, q2Var.f65557f) && kotlin.jvm.internal.g0.g(this.f65558g, q2Var.f65558g) && kotlin.jvm.internal.g0.g(this.f65559h, q2Var.f65559h);
    }

    @m80.l
    public final String f() {
        return this.f65557f;
    }

    @m80.l
    public final String g() {
        return this.f65558g;
    }

    @m80.l
    public final Integer h() {
        return this.f65559h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65552a) * 31) + Integer.hashCode(this.f65553b)) * 31;
        String str = this.f65554c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65555d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65556e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65557f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f65558g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f65559h;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public final q2 i(int i11, int i12, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l Integer num) {
        return new q2(i11, i12, str, str2, str3, str4, str5, num);
    }

    @m80.l
    public final String k() {
        return this.f65556e;
    }

    @m80.l
    public final String l() {
        return this.f65554c;
    }

    @m80.l
    public final String m() {
        return this.f65557f;
    }

    @m80.l
    public final Integer n() {
        return this.f65559h;
    }

    public final int o() {
        return this.f65552a;
    }

    public final int p() {
        return this.f65553b;
    }

    @m80.l
    public final String q() {
        return this.f65555d;
    }

    @m80.l
    public final String r() {
        return this.f65558g;
    }

    @m80.k
    public String toString() {
        return "SearchSchoolReq(pageNum=" + this.f65552a + ", pageSize=" + this.f65553b + ", country=" + this.f65554c + ", province=" + this.f65555d + ", city=" + this.f65556e + ", county=" + this.f65557f + ", schoolKey=" + this.f65558g + ", level=" + this.f65559h + ')';
    }

    public /* synthetic */ q2(int i11, int i12, String str, String str2, String str3, String str4, String str5, Integer num, int i13, kotlin.jvm.internal.v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 20 : i12, str, str2, str3, str4, str5, num);
    }
}
