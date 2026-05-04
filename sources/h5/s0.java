package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h8.j f58449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58450b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f58451c;

    public s0(@m80.k h8.j rewardInfo, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(rewardInfo, "rewardInfo");
        this.f58449a = rewardInfo;
        this.f58450b = i11;
        this.f58451c = str;
    }

    public static /* synthetic */ s0 e(s0 s0Var, h8.j jVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            jVar = s0Var.f58449a;
        }
        if ((i12 & 2) != 0) {
            i11 = s0Var.f58450b;
        }
        if ((i12 & 4) != 0) {
            str = s0Var.f58451c;
        }
        return s0Var.d(jVar, i11, str);
    }

    @m80.k
    public final h8.j a() {
        return this.f58449a;
    }

    public final int b() {
        return this.f58450b;
    }

    @m80.l
    public final String c() {
        return this.f58451c;
    }

    @m80.k
    public final s0 d(@m80.k h8.j rewardInfo, int i11, @m80.l String str) {
        kotlin.jvm.internal.g0.p(rewardInfo, "rewardInfo");
        return new s0(rewardInfo, i11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return kotlin.jvm.internal.g0.g(this.f58449a, s0Var.f58449a) && this.f58450b == s0Var.f58450b && kotlin.jvm.internal.g0.g(this.f58451c, s0Var.f58451c);
    }

    @m80.l
    public final String f() {
        return this.f58451c;
    }

    public final int g() {
        return this.f58450b;
    }

    @m80.k
    public final h8.j h() {
        return this.f58449a;
    }

    public int hashCode() {
        int hashCode = ((this.f58449a.hashCode() * 31) + Integer.hashCode(this.f58450b)) * 31;
        String str = this.f58451c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "TravelRewardResult(rewardInfo=" + this.f58449a + ", areaId=" + this.f58450b + ", actionResourceId=" + this.f58451c + ')';
    }
}
