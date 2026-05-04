package ji;

import androidx.compose.runtime.internal.StabilityInferred;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f64168e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f64169a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f64170b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f64171c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x00.a<g2> f64172d;

    public n1(@m80.k String title, @m80.k String description, @m80.k String alert, @m80.l x00.a<g2> aVar) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(alert, "alert");
        this.f64169a = title;
        this.f64170b = description;
        this.f64171c = alert;
        this.f64172d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n1 f(n1 n1Var, String str, String str2, String str3, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = n1Var.f64169a;
        }
        if ((i11 & 2) != 0) {
            str2 = n1Var.f64170b;
        }
        if ((i11 & 4) != 0) {
            str3 = n1Var.f64171c;
        }
        if ((i11 & 8) != 0) {
            aVar = n1Var.f64172d;
        }
        return n1Var.e(str, str2, str3, aVar);
    }

    @m80.k
    public final String a() {
        return this.f64169a;
    }

    @m80.k
    public final String b() {
        return this.f64170b;
    }

    @m80.k
    public final String c() {
        return this.f64171c;
    }

    @m80.l
    public final x00.a<g2> d() {
        return this.f64172d;
    }

    @m80.k
    public final n1 e(@m80.k String title, @m80.k String description, @m80.k String alert, @m80.l x00.a<g2> aVar) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(alert, "alert");
        return new n1(title, description, alert, aVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.g0.g(this.f64169a, n1Var.f64169a) && kotlin.jvm.internal.g0.g(this.f64170b, n1Var.f64170b) && kotlin.jvm.internal.g0.g(this.f64171c, n1Var.f64171c) && kotlin.jvm.internal.g0.g(this.f64172d, n1Var.f64172d);
    }

    @m80.k
    public final String g() {
        return this.f64171c;
    }

    @m80.k
    public final String h() {
        return this.f64170b;
    }

    public int hashCode() {
        int hashCode = ((((this.f64169a.hashCode() * 31) + this.f64170b.hashCode()) * 31) + this.f64171c.hashCode()) * 31;
        x00.a<g2> aVar = this.f64172d;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @m80.l
    public final x00.a<g2> i() {
        return this.f64172d;
    }

    @m80.k
    public final String j() {
        return this.f64169a;
    }

    @m80.k
    public String toString() {
        return "PreferenceInfo(title=" + this.f64169a + ", description=" + this.f64170b + ", alert=" + this.f64171c + ", onClick=" + this.f64172d + pn.j.f81007d;
    }

    public /* synthetic */ n1(String str, String str2, String str3, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : aVar);
    }
}
