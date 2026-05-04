package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58484a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f58485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58486c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58487d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f58488e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f58489f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f58490g;

    public y0(@m80.k String name, @m80.k String desc, int i11, int i12, @m80.k String awardTitle, @m80.k String awardCount, @m80.k String awardDesc) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(desc, "desc");
        kotlin.jvm.internal.g0.p(awardTitle, "awardTitle");
        kotlin.jvm.internal.g0.p(awardCount, "awardCount");
        kotlin.jvm.internal.g0.p(awardDesc, "awardDesc");
        this.f58484a = name;
        this.f58485b = desc;
        this.f58486c = i11;
        this.f58487d = i12;
        this.f58488e = awardTitle;
        this.f58489f = awardCount;
        this.f58490g = awardDesc;
    }

    public static /* synthetic */ y0 i(y0 y0Var, String str, String str2, int i11, int i12, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = y0Var.f58484a;
        }
        if ((i13 & 2) != 0) {
            str2 = y0Var.f58485b;
        }
        if ((i13 & 4) != 0) {
            i11 = y0Var.f58486c;
        }
        if ((i13 & 8) != 0) {
            i12 = y0Var.f58487d;
        }
        if ((i13 & 16) != 0) {
            str3 = y0Var.f58488e;
        }
        if ((i13 & 32) != 0) {
            str4 = y0Var.f58489f;
        }
        if ((i13 & 64) != 0) {
            str5 = y0Var.f58490g;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i14 = i11;
        return y0Var.h(str, str2, i14, i12, str8, str6, str7);
    }

    @m80.k
    public final String a() {
        return this.f58484a;
    }

    @m80.k
    public final String b() {
        return this.f58485b;
    }

    public final int c() {
        return this.f58486c;
    }

    public final int d() {
        return this.f58487d;
    }

    @m80.k
    public final String e() {
        return this.f58488e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.g0.g(this.f58484a, y0Var.f58484a) && kotlin.jvm.internal.g0.g(this.f58485b, y0Var.f58485b) && this.f58486c == y0Var.f58486c && this.f58487d == y0Var.f58487d && kotlin.jvm.internal.g0.g(this.f58488e, y0Var.f58488e) && kotlin.jvm.internal.g0.g(this.f58489f, y0Var.f58489f) && kotlin.jvm.internal.g0.g(this.f58490g, y0Var.f58490g);
    }

    @m80.k
    public final String f() {
        return this.f58489f;
    }

    @m80.k
    public final String g() {
        return this.f58490g;
    }

    @m80.k
    public final y0 h(@m80.k String name, @m80.k String desc, int i11, int i12, @m80.k String awardTitle, @m80.k String awardCount, @m80.k String awardDesc) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(desc, "desc");
        kotlin.jvm.internal.g0.p(awardTitle, "awardTitle");
        kotlin.jvm.internal.g0.p(awardCount, "awardCount");
        kotlin.jvm.internal.g0.p(awardDesc, "awardDesc");
        return new y0(name, desc, i11, i12, awardTitle, awardCount, awardDesc);
    }

    public int hashCode() {
        return (((((((((((this.f58484a.hashCode() * 31) + this.f58485b.hashCode()) * 31) + Integer.hashCode(this.f58486c)) * 31) + Integer.hashCode(this.f58487d)) * 31) + this.f58488e.hashCode()) * 31) + this.f58489f.hashCode()) * 31) + this.f58490g.hashCode();
    }

    @m80.k
    public final String j() {
        return this.f58489f;
    }

    @m80.k
    public final String k() {
        return this.f58490g;
    }

    @m80.k
    public final String l() {
        return this.f58488e;
    }

    public final int m() {
        return this.f58487d;
    }

    public final int n() {
        return this.f58486c;
    }

    @m80.k
    public final String o() {
        return this.f58485b;
    }

    @m80.k
    public final String p() {
        return this.f58484a;
    }

    @m80.k
    public String toString() {
        return "WinStreakMileStone(name=" + this.f58484a + ", desc=" + this.f58485b + ", day=" + this.f58486c + ", awardType=" + this.f58487d + ", awardTitle=" + this.f58488e + ", awardCount=" + this.f58489f + ", awardDesc=" + this.f58490g + ')';
    }

    public /* synthetic */ y0(String str, String str2, int i11, int i12, String str3, String str4, String str5, int i13, kotlin.jvm.internal.v vVar) {
        this(str, str2, (i13 & 4) != 0 ? 0 : i11, i12, str3, str4, str5);
    }
}
