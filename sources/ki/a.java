package ki;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f66533c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f66534a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f66535b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ a d(a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f66534a;
        }
        if ((i11 & 2) != 0) {
            str2 = aVar.f66535b;
        }
        return aVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f66534a;
    }

    @m80.k
    public final String b() {
        return this.f66535b;
    }

    @m80.k
    public final a c(@m80.k String description, @m80.k String tip) {
        g0.p(description, "description");
        g0.p(tip, "tip");
        return new a(description, tip);
    }

    @m80.k
    public final String e() {
        return this.f66534a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f66534a, aVar.f66534a) && g0.g(this.f66535b, aVar.f66535b);
    }

    @m80.k
    public final String f() {
        return this.f66535b;
    }

    public int hashCode() {
        return (this.f66534a.hashCode() * 31) + this.f66535b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BondingTip(description=" + this.f66534a + ", tip=" + this.f66535b + pn.j.f81007d;
    }

    public a(@m80.k String description, @m80.k String tip) {
        g0.p(description, "description");
        g0.p(tip, "tip");
        this.f66534a = description;
        this.f66535b = tip;
    }

    public /* synthetic */ a(String str, String str2, int i11, v vVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
