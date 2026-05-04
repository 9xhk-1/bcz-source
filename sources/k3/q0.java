package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65538a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65539b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65540c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65541d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65542e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65543f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65544g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65545h;

    /* renamed from: i, reason: collision with root package name */
    public final int f65546i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65547j;

    public q0(int i11, @m80.k String bookName, @m80.k String bookImg, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        this.f65538a = i11;
        this.f65539b = bookName;
        this.f65540c = bookImg;
        this.f65541d = i12;
        this.f65542e = i13;
        this.f65543f = i14;
        this.f65544g = i15;
        this.f65545h = i16;
        this.f65546i = i17;
        this.f65547j = i18;
    }

    public static /* synthetic */ q0 l(q0 q0Var, int i11, String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i11 = q0Var.f65538a;
        }
        if ((i19 & 2) != 0) {
            str = q0Var.f65539b;
        }
        if ((i19 & 4) != 0) {
            str2 = q0Var.f65540c;
        }
        if ((i19 & 8) != 0) {
            i12 = q0Var.f65541d;
        }
        if ((i19 & 16) != 0) {
            i13 = q0Var.f65542e;
        }
        if ((i19 & 32) != 0) {
            i14 = q0Var.f65543f;
        }
        if ((i19 & 64) != 0) {
            i15 = q0Var.f65544g;
        }
        if ((i19 & 128) != 0) {
            i16 = q0Var.f65545h;
        }
        if ((i19 & 256) != 0) {
            i17 = q0Var.f65546i;
        }
        if ((i19 & 512) != 0) {
            i18 = q0Var.f65547j;
        }
        int i21 = i17;
        int i22 = i18;
        int i23 = i15;
        int i24 = i16;
        int i25 = i13;
        int i26 = i14;
        return q0Var.k(i11, str, str2, i12, i25, i26, i23, i24, i21, i22);
    }

    public final int a() {
        return this.f65538a;
    }

    public final int b() {
        return this.f65547j;
    }

    @m80.k
    public final String c() {
        return this.f65539b;
    }

    @m80.k
    public final String d() {
        return this.f65540c;
    }

    public final int e() {
        return this.f65541d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f65538a == q0Var.f65538a && kotlin.jvm.internal.g0.g(this.f65539b, q0Var.f65539b) && kotlin.jvm.internal.g0.g(this.f65540c, q0Var.f65540c) && this.f65541d == q0Var.f65541d && this.f65542e == q0Var.f65542e && this.f65543f == q0Var.f65543f && this.f65544g == q0Var.f65544g && this.f65545h == q0Var.f65545h && this.f65546i == q0Var.f65546i && this.f65547j == q0Var.f65547j;
    }

    public final int f() {
        return this.f65542e;
    }

    public final int g() {
        return this.f65543f;
    }

    public final int h() {
        return this.f65544g;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f65538a) * 31) + this.f65539b.hashCode()) * 31) + this.f65540c.hashCode()) * 31) + Integer.hashCode(this.f65541d)) * 31) + Integer.hashCode(this.f65542e)) * 31) + Integer.hashCode(this.f65543f)) * 31) + Integer.hashCode(this.f65544g)) * 31) + Integer.hashCode(this.f65545h)) * 31) + Integer.hashCode(this.f65546i)) * 31) + Integer.hashCode(this.f65547j);
    }

    public final int i() {
        return this.f65545h;
    }

    public final int j() {
        return this.f65546i;
    }

    @m80.k
    public final q0 k(int i11, @m80.k String bookName, @m80.k String bookImg, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        return new q0(i11, bookName, bookImg, i12, i13, i14, i15, i16, i17, i18);
    }

    public final int m() {
        return this.f65538a;
    }

    @m80.k
    public final String n() {
        return this.f65540c;
    }

    @m80.k
    public final String o() {
        return this.f65539b;
    }

    public final int p() {
        return this.f65542e;
    }

    public final int q() {
        return this.f65546i;
    }

    public final int r() {
        return this.f65547j;
    }

    public final int s() {
        return this.f65544g;
    }

    public final int t() {
        return this.f65543f;
    }

    @m80.k
    public String toString() {
        return "GameScheduleInfo(bookId=" + this.f65538a + ", bookName=" + this.f65539b + ", bookImg=" + this.f65540c + ", remainDay=" + this.f65541d + ", costPerDayInMinutes=" + this.f65542e + ", newLearned=" + this.f65543f + ", mastered=" + this.f65544g + ", totalCount=" + this.f65545h + ", countPerGroup=" + this.f65546i + ", currentGroupCount=" + this.f65547j + ')';
    }

    public final int u() {
        return this.f65541d;
    }

    public final int v() {
        return this.f65545h;
    }
}
