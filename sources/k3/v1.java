package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65660a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65661b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65662c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65663d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f65664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65665f;

    public v1(int i11, @m80.k String title, @m80.k String jump, @m80.k String contentImage, @m80.l String str, int i12) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(jump, "jump");
        kotlin.jvm.internal.g0.p(contentImage, "contentImage");
        this.f65660a = i11;
        this.f65661b = title;
        this.f65662c = jump;
        this.f65663d = contentImage;
        this.f65664e = str;
        this.f65665f = i12;
    }

    public static /* synthetic */ v1 h(v1 v1Var, int i11, String str, String str2, String str3, String str4, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = v1Var.f65660a;
        }
        if ((i13 & 2) != 0) {
            str = v1Var.f65661b;
        }
        if ((i13 & 4) != 0) {
            str2 = v1Var.f65662c;
        }
        if ((i13 & 8) != 0) {
            str3 = v1Var.f65663d;
        }
        if ((i13 & 16) != 0) {
            str4 = v1Var.f65664e;
        }
        if ((i13 & 32) != 0) {
            i12 = v1Var.f65665f;
        }
        String str5 = str4;
        int i14 = i12;
        return v1Var.g(i11, str, str2, str3, str5, i14);
    }

    public final int a() {
        return this.f65660a;
    }

    @m80.k
    public final String b() {
        return this.f65661b;
    }

    @m80.k
    public final String c() {
        return this.f65662c;
    }

    @m80.k
    public final String d() {
        return this.f65663d;
    }

    @m80.l
    public final String e() {
        return this.f65664e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f65660a == v1Var.f65660a && kotlin.jvm.internal.g0.g(this.f65661b, v1Var.f65661b) && kotlin.jvm.internal.g0.g(this.f65662c, v1Var.f65662c) && kotlin.jvm.internal.g0.g(this.f65663d, v1Var.f65663d) && kotlin.jvm.internal.g0.g(this.f65664e, v1Var.f65664e) && this.f65665f == v1Var.f65665f;
    }

    public final int f() {
        return this.f65665f;
    }

    @m80.k
    public final v1 g(int i11, @m80.k String title, @m80.k String jump, @m80.k String contentImage, @m80.l String str, int i12) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(jump, "jump");
        kotlin.jvm.internal.g0.p(contentImage, "contentImage");
        return new v1(i11, title, jump, contentImage, str, i12);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f65660a) * 31) + this.f65661b.hashCode()) * 31) + this.f65662c.hashCode()) * 31) + this.f65663d.hashCode()) * 31;
        String str = this.f65664e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f65665f);
    }

    @m80.k
    public final String i() {
        return this.f65663d;
    }

    public final int j() {
        return this.f65660a;
    }

    @m80.k
    public final String k() {
        return this.f65662c;
    }

    public final int l() {
        return this.f65665f;
    }

    @m80.l
    public final String m() {
        return this.f65664e;
    }

    @m80.k
    public final String n() {
        return this.f65661b;
    }

    @m80.k
    public String toString() {
        return "MyDevice(deviceType=" + this.f65660a + ", title=" + this.f65661b + ", jump=" + this.f65662c + ", contentImage=" + this.f65663d + ", tipImage=" + this.f65664e + ", timeStamp=" + this.f65665f + ')';
    }
}
