package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65225a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65227c;

    public b0(int i11, @m80.k String json, int i12) {
        kotlin.jvm.internal.g0.p(json, "json");
        this.f65225a = i11;
        this.f65226b = json;
        this.f65227c = i12;
    }

    public static /* synthetic */ b0 e(b0 b0Var, int i11, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = b0Var.f65225a;
        }
        if ((i13 & 2) != 0) {
            str = b0Var.f65226b;
        }
        if ((i13 & 4) != 0) {
            i12 = b0Var.f65227c;
        }
        return b0Var.d(i11, str, i12);
    }

    public final int a() {
        return this.f65225a;
    }

    @m80.k
    public final String b() {
        return this.f65226b;
    }

    public final int c() {
        return this.f65227c;
    }

    @m80.k
    public final b0 d(int i11, @m80.k String json, int i12) {
        kotlin.jvm.internal.g0.p(json, "json");
        return new b0(i11, json, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f65225a == b0Var.f65225a && kotlin.jvm.internal.g0.g(this.f65226b, b0Var.f65226b) && this.f65227c == b0Var.f65227c;
    }

    public final int f() {
        return this.f65227c;
    }

    @m80.k
    public final String g() {
        return this.f65226b;
    }

    public final int h() {
        return this.f65225a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f65225a) * 31) + this.f65226b.hashCode()) * 31) + Integer.hashCode(this.f65227c);
    }

    @m80.k
    public String toString() {
        return "ClipboardResp(style=" + this.f65225a + ", json=" + this.f65226b + ", businessId=" + this.f65227c + ')';
    }
}
