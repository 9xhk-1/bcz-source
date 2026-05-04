package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65416a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Integer f65417b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f65418c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f65419d;

    public l2(int i11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        this.f65416a = i11;
        this.f65417b = num;
        this.f65418c = num2;
        this.f65419d = num3;
    }

    public static /* synthetic */ l2 f(l2 l2Var, int i11, Integer num, Integer num2, Integer num3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = l2Var.f65416a;
        }
        if ((i12 & 2) != 0) {
            num = l2Var.f65417b;
        }
        if ((i12 & 4) != 0) {
            num2 = l2Var.f65418c;
        }
        if ((i12 & 8) != 0) {
            num3 = l2Var.f65419d;
        }
        return l2Var.e(i11, num, num2, num3);
    }

    public final int a() {
        return this.f65416a;
    }

    @m80.l
    public final Integer b() {
        return this.f65417b;
    }

    @m80.l
    public final Integer c() {
        return this.f65418c;
    }

    @m80.l
    public final Integer d() {
        return this.f65419d;
    }

    @m80.k
    public final l2 e(int i11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        return new l2(i11, num, num2, num3);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f65416a == l2Var.f65416a && kotlin.jvm.internal.g0.g(this.f65417b, l2Var.f65417b) && kotlin.jvm.internal.g0.g(this.f65418c, l2Var.f65418c) && kotlin.jvm.internal.g0.g(this.f65419d, l2Var.f65419d);
    }

    @m80.l
    public final Integer g() {
        return this.f65418c;
    }

    @m80.l
    public final Integer h() {
        return this.f65419d;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f65416a) * 31;
        Integer num = this.f65417b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f65418c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f65419d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final int i() {
        return this.f65416a;
    }

    @m80.l
    public final Integer j() {
        return this.f65417b;
    }

    @m80.k
    public String toString() {
        return "SchoolInfoReq(schoolId=" + this.f65416a + ", schoolYear=" + this.f65417b + ", majorId=" + this.f65418c + ", schoolBg=" + this.f65419d + ')';
    }
}
