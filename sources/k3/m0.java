package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65438a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65439b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65441d;

    public m0(int i11, @m80.k String imgUrl, @m80.k String title, int i12) {
        kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
        kotlin.jvm.internal.g0.p(title, "title");
        this.f65438a = i11;
        this.f65439b = imgUrl;
        this.f65440c = title;
        this.f65441d = i12;
    }

    public static /* synthetic */ m0 f(m0 m0Var, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = m0Var.f65438a;
        }
        if ((i13 & 2) != 0) {
            str = m0Var.f65439b;
        }
        if ((i13 & 4) != 0) {
            str2 = m0Var.f65440c;
        }
        if ((i13 & 8) != 0) {
            i12 = m0Var.f65441d;
        }
        return m0Var.e(i11, str, str2, i12);
    }

    public final int a() {
        return this.f65438a;
    }

    @m80.k
    public final String b() {
        return this.f65439b;
    }

    @m80.k
    public final String c() {
        return this.f65440c;
    }

    public final int d() {
        return this.f65441d;
    }

    @m80.k
    public final m0 e(int i11, @m80.k String imgUrl, @m80.k String title, int i12) {
        kotlin.jvm.internal.g0.p(imgUrl, "imgUrl");
        kotlin.jvm.internal.g0.p(title, "title");
        return new m0(i11, imgUrl, title, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f65438a == m0Var.f65438a && kotlin.jvm.internal.g0.g(this.f65439b, m0Var.f65439b) && kotlin.jvm.internal.g0.g(this.f65440c, m0Var.f65440c) && this.f65441d == m0Var.f65441d;
    }

    public final int g() {
        return this.f65441d;
    }

    @m80.k
    public final String h() {
        return this.f65439b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f65438a) * 31) + this.f65439b.hashCode()) * 31) + this.f65440c.hashCode()) * 31) + Integer.hashCode(this.f65441d);
    }

    public final int i() {
        return this.f65438a;
    }

    @m80.k
    public final String j() {
        return this.f65440c;
    }

    @m80.k
    public String toString() {
        return "ExportTemplateModel(tId=" + this.f65438a + ", imgUrl=" + this.f65439b + ", title=" + this.f65440c + ", cost=" + this.f65441d + ')';
    }
}
