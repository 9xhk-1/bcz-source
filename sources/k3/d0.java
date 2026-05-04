package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0[] f65264a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65265b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65266c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65267d;

    public d0(@m80.k c0[] categoryInfo, @m80.k String logo, @m80.k String title, @m80.k String qrImage) {
        kotlin.jvm.internal.g0.p(categoryInfo, "categoryInfo");
        kotlin.jvm.internal.g0.p(logo, "logo");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(qrImage, "qrImage");
        this.f65264a = categoryInfo;
        this.f65265b = logo;
        this.f65266c = title;
        this.f65267d = qrImage;
    }

    public static /* synthetic */ d0 f(d0 d0Var, c0[] c0VarArr, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c0VarArr = d0Var.f65264a;
        }
        if ((i11 & 2) != 0) {
            str = d0Var.f65265b;
        }
        if ((i11 & 4) != 0) {
            str2 = d0Var.f65266c;
        }
        if ((i11 & 8) != 0) {
            str3 = d0Var.f65267d;
        }
        return d0Var.e(c0VarArr, str, str2, str3);
    }

    @m80.k
    public final c0[] a() {
        return this.f65264a;
    }

    @m80.k
    public final String b() {
        return this.f65265b;
    }

    @m80.k
    public final String c() {
        return this.f65266c;
    }

    @m80.k
    public final String d() {
        return this.f65267d;
    }

    @m80.k
    public final d0 e(@m80.k c0[] categoryInfo, @m80.k String logo, @m80.k String title, @m80.k String qrImage) {
        kotlin.jvm.internal.g0.p(categoryInfo, "categoryInfo");
        kotlin.jvm.internal.g0.p(logo, "logo");
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(qrImage, "qrImage");
        return new d0(categoryInfo, logo, title, qrImage);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Arrays.equals(this.f65264a, d0Var.f65264a) && kotlin.jvm.internal.g0.g(this.f65265b, d0Var.f65265b) && kotlin.jvm.internal.g0.g(this.f65266c, d0Var.f65266c) && kotlin.jvm.internal.g0.g(this.f65267d, d0Var.f65267d);
    }

    @m80.k
    public final c0[] g() {
        return this.f65264a;
    }

    @m80.k
    public final String h() {
        return this.f65265b;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.f65264a) * 31) + this.f65265b.hashCode()) * 31) + this.f65266c.hashCode()) * 31) + this.f65267d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f65267d;
    }

    @m80.k
    public final String j() {
        return this.f65266c;
    }

    @m80.k
    public String toString() {
        return "DakaBackgroundModel(categoryInfo=" + Arrays.toString(this.f65264a) + ", logo=" + this.f65265b + ", title=" + this.f65266c + ", qrImage=" + this.f65267d + ')';
    }
}
