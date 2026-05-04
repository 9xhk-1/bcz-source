package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Integer f65268a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Integer f65269b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f65270c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f65271d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Integer f65272e;

    public d2(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l String str, @m80.l Integer num4) {
        this.f65268a = num;
        this.f65269b = num2;
        this.f65270c = num3;
        this.f65271d = str;
        this.f65272e = num4;
    }

    public static /* synthetic */ d2 g(d2 d2Var, Integer num, Integer num2, Integer num3, String str, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = d2Var.f65268a;
        }
        if ((i11 & 2) != 0) {
            num2 = d2Var.f65269b;
        }
        if ((i11 & 4) != 0) {
            num3 = d2Var.f65270c;
        }
        if ((i11 & 8) != 0) {
            str = d2Var.f65271d;
        }
        if ((i11 & 16) != 0) {
            num4 = d2Var.f65272e;
        }
        Integer num5 = num4;
        Integer num6 = num3;
        return d2Var.f(num, num2, num6, str, num5);
    }

    @m80.l
    public final Integer a() {
        return this.f65268a;
    }

    @m80.l
    public final Integer b() {
        return this.f65269b;
    }

    @m80.l
    public final Integer c() {
        return this.f65270c;
    }

    @m80.l
    public final String d() {
        return this.f65271d;
    }

    @m80.l
    public final Integer e() {
        return this.f65272e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.g0.g(this.f65268a, d2Var.f65268a) && kotlin.jvm.internal.g0.g(this.f65269b, d2Var.f65269b) && kotlin.jvm.internal.g0.g(this.f65270c, d2Var.f65270c) && kotlin.jvm.internal.g0.g(this.f65271d, d2Var.f65271d) && kotlin.jvm.internal.g0.g(this.f65272e, d2Var.f65272e);
    }

    @m80.k
    public final d2 f(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l String str, @m80.l Integer num4) {
        return new d2(num, num2, num3, str, num4);
    }

    @m80.l
    public final Integer h() {
        return this.f65270c;
    }

    public int hashCode() {
        Integer num = this.f65268a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f65269b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f65270c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f65271d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.f65272e;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f65269b;
    }

    @m80.l
    public final Integer j() {
        return this.f65272e;
    }

    @m80.l
    public final String k() {
        return this.f65271d;
    }

    @m80.l
    public final Integer l() {
        return this.f65268a;
    }

    @m80.k
    public String toString() {
        return "QRRedirect(wordLevelId=" + this.f65268a + ", examId=" + this.f65269b + ", examCategoryId=" + this.f65270c + ", url=" + this.f65271d + ", readingPlanId=" + this.f65272e + ')';
    }
}
