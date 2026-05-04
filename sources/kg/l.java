package kg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.experiment.z3;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final int f66520e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z3 f66521a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f66522b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f66523c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Object f66524d;

    public l(@m80.k z3 tab, @m80.k String title, @m80.k String route, @m80.l Object obj) {
        g0.p(tab, "tab");
        g0.p(title, "title");
        g0.p(route, "route");
        this.f66521a = tab;
        this.f66522b = title;
        this.f66523c = route;
        this.f66524d = obj;
    }

    public static /* synthetic */ l f(l lVar, z3 z3Var, String str, String str2, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            z3Var = lVar.f66521a;
        }
        if ((i11 & 2) != 0) {
            str = lVar.f66522b;
        }
        if ((i11 & 4) != 0) {
            str2 = lVar.f66523c;
        }
        if ((i11 & 8) != 0) {
            obj = lVar.f66524d;
        }
        return lVar.e(z3Var, str, str2, obj);
    }

    @m80.k
    public final z3 a() {
        return this.f66521a;
    }

    @m80.k
    public final String b() {
        return this.f66522b;
    }

    @m80.k
    public final String c() {
        return this.f66523c;
    }

    @m80.l
    public final Object d() {
        return this.f66524d;
    }

    @m80.k
    public final l e(@m80.k z3 tab, @m80.k String title, @m80.k String route, @m80.l Object obj) {
        g0.p(tab, "tab");
        g0.p(title, "title");
        g0.p(route, "route");
        return new l(tab, title, route, obj);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return g0.g(this.f66521a, lVar.f66521a) && g0.g(this.f66522b, lVar.f66522b) && g0.g(this.f66523c, lVar.f66523c) && g0.g(this.f66524d, lVar.f66524d);
    }

    @m80.l
    public final Object g() {
        return this.f66524d;
    }

    @m80.k
    public final String h() {
        return this.f66523c;
    }

    public int hashCode() {
        int hashCode = ((((this.f66521a.hashCode() * 31) + this.f66522b.hashCode()) * 31) + this.f66523c.hashCode()) * 31;
        Object obj = this.f66524d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @m80.k
    public final z3 i() {
        return this.f66521a;
    }

    @m80.k
    public final String j() {
        return this.f66522b;
    }

    @m80.k
    public String toString() {
        return "NavItem(tab=" + this.f66521a + ", title=" + this.f66522b + ", route=" + this.f66523c + ", extra=" + this.f66524d + pn.j.f81007d;
    }

    public /* synthetic */ l(z3 z3Var, String str, String str2, Object obj, int i11, v vVar) {
        this(z3Var, str, str2, (i11 & 8) != 0 ? null : obj);
    }
}
