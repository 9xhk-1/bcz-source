package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65459a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65460b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f65461c;

    public n2(int i11, int i12, @m80.l String str) {
        this.f65459a = i11;
        this.f65460b = i12;
        this.f65461c = str;
    }

    public static /* synthetic */ n2 e(n2 n2Var, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = n2Var.f65459a;
        }
        if ((i13 & 2) != 0) {
            i12 = n2Var.f65460b;
        }
        if ((i13 & 4) != 0) {
            str = n2Var.f65461c;
        }
        return n2Var.d(i11, i12, str);
    }

    public final int a() {
        return this.f65459a;
    }

    public final int b() {
        return this.f65460b;
    }

    @m80.l
    public final String c() {
        return this.f65461c;
    }

    @m80.k
    public final n2 d(int i11, int i12, @m80.l String str) {
        return new n2(i11, i12, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f65459a == n2Var.f65459a && this.f65460b == n2Var.f65460b && kotlin.jvm.internal.g0.g(this.f65461c, n2Var.f65461c);
    }

    @m80.l
    public final String f() {
        return this.f65461c;
    }

    public final int g() {
        return this.f65459a;
    }

    public final int h() {
        return this.f65460b;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f65459a) * 31) + Integer.hashCode(this.f65460b)) * 31;
        String str = this.f65461c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "SchoolMajorReq(pageNum=" + this.f65459a + ", pageSize=" + this.f65460b + ", majorKey=" + this.f65461c + ')';
    }
}
