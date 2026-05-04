package uj;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f92232e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f92233a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92234b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92235c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f92236d;

    public a() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a f(a aVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f92233a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f92234b;
        }
        if ((i11 & 4) != 0) {
            str3 = aVar.f92235c;
        }
        if ((i11 & 8) != 0) {
            str4 = aVar.f92236d;
        }
        return aVar.e(str, str2, str3, str4);
    }

    @k
    public final String a() {
        return this.f92233a;
    }

    @k
    public final String b() {
        return this.f92234b;
    }

    @k
    public final String c() {
        return this.f92235c;
    }

    @k
    public final String d() {
        return this.f92236d;
    }

    @k
    public final a e(@k String title, @k String subtitle, @k String negativeStr, @k String positiveStr) {
        g0.p(title, "title");
        g0.p(subtitle, "subtitle");
        g0.p(negativeStr, "negativeStr");
        g0.p(positiveStr, "positiveStr");
        return new a(title, subtitle, negativeStr, positiveStr);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f92233a, aVar.f92233a) && g0.g(this.f92234b, aVar.f92234b) && g0.g(this.f92235c, aVar.f92235c) && g0.g(this.f92236d, aVar.f92236d);
    }

    @k
    public final String g() {
        return this.f92235c;
    }

    @k
    public final String h() {
        return this.f92236d;
    }

    public int hashCode() {
        return (((((this.f92233a.hashCode() * 31) + this.f92234b.hashCode()) * 31) + this.f92235c.hashCode()) * 31) + this.f92236d.hashCode();
    }

    @k
    public final String i() {
        return this.f92234b;
    }

    @k
    public final String j() {
        return this.f92233a;
    }

    @k
    public String toString() {
        return "ActionDialogContent(title=" + this.f92233a + ", subtitle=" + this.f92234b + ", negativeStr=" + this.f92235c + ", positiveStr=" + this.f92236d + pn.j.f81007d;
    }

    public a(@k String title, @k String subtitle, @k String negativeStr, @k String positiveStr) {
        g0.p(title, "title");
        g0.p(subtitle, "subtitle");
        g0.p(negativeStr, "negativeStr");
        g0.p(positiveStr, "positiveStr");
        this.f92233a = title;
        this.f92234b = subtitle;
        this.f92235c = negativeStr;
        this.f92236d = positiveStr;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i11, v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4);
    }
}
