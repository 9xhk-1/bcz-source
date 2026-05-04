package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65282a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f65283b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final d2 f65284c;

    public e2(int i11, @m80.l String str, @m80.l d2 d2Var) {
        this.f65282a = i11;
        this.f65283b = str;
        this.f65284c = d2Var;
    }

    public static /* synthetic */ e2 e(e2 e2Var, int i11, String str, d2 d2Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = e2Var.f65282a;
        }
        if ((i12 & 2) != 0) {
            str = e2Var.f65283b;
        }
        if ((i12 & 4) != 0) {
            d2Var = e2Var.f65284c;
        }
        return e2Var.d(i11, str, d2Var);
    }

    public final int a() {
        return this.f65282a;
    }

    @m80.l
    public final String b() {
        return this.f65283b;
    }

    @m80.l
    public final d2 c() {
        return this.f65284c;
    }

    @m80.k
    public final e2 d(int i11, @m80.l String str, @m80.l d2 d2Var) {
        return new e2(i11, str, d2Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f65282a == e2Var.f65282a && kotlin.jvm.internal.g0.g(this.f65283b, e2Var.f65283b) && kotlin.jvm.internal.g0.g(this.f65284c, e2Var.f65284c);
    }

    public final int f() {
        return this.f65282a;
    }

    @m80.l
    public final String g() {
        return this.f65283b;
    }

    @m80.l
    public final d2 h() {
        return this.f65284c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f65282a) * 31;
        String str = this.f65283b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        d2 d2Var = this.f65284c;
        return hashCode2 + (d2Var != null ? d2Var.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "QRRsp(action=" + this.f65282a + ", message=" + this.f65283b + ", redirectInfo=" + this.f65284c + ')';
    }
}
