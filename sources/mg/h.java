package mg;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f73263d = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f73264a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f73265b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f73266c;

    public h(@k String title, @k String desc, @k String enter) {
        g0.p(title, "title");
        g0.p(desc, "desc");
        g0.p(enter, "enter");
        this.f73264a = title;
        this.f73265b = desc;
        this.f73266c = enter;
    }

    public static /* synthetic */ h e(h hVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f73264a;
        }
        if ((i11 & 2) != 0) {
            str2 = hVar.f73265b;
        }
        if ((i11 & 4) != 0) {
            str3 = hVar.f73266c;
        }
        return hVar.d(str, str2, str3);
    }

    @k
    public final String a() {
        return this.f73264a;
    }

    @k
    public final String b() {
        return this.f73265b;
    }

    @k
    public final String c() {
        return this.f73266c;
    }

    @k
    public final h d(@k String title, @k String desc, @k String enter) {
        g0.p(title, "title");
        g0.p(desc, "desc");
        g0.p(enter, "enter");
        return new h(title, desc, enter);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f73264a, hVar.f73264a) && g0.g(this.f73265b, hVar.f73265b) && g0.g(this.f73266c, hVar.f73266c);
    }

    @k
    public final String f() {
        return this.f73265b;
    }

    @k
    public final String g() {
        return this.f73266c;
    }

    @k
    public final String h() {
        return this.f73264a;
    }

    public int hashCode() {
        return (((this.f73264a.hashCode() * 31) + this.f73265b.hashCode()) * 31) + this.f73266c.hashCode();
    }

    @k
    public String toString() {
        return "WordLearningExtra(title=" + this.f73264a + ", desc=" + this.f73265b + ", enter=" + this.f73266c + j.f81007d;
    }
}
