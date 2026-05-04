package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65710a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65711b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65714e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f65715f;

    public y0(int i11, @m80.k String icon, @m80.k String name, int i12, int i13, @m80.k String intent) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(intent, "intent");
        this.f65710a = i11;
        this.f65711b = icon;
        this.f65712c = name;
        this.f65713d = i12;
        this.f65714e = i13;
        this.f65715f = intent;
    }

    public static /* synthetic */ y0 h(y0 y0Var, int i11, String str, String str2, int i12, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = y0Var.f65710a;
        }
        if ((i14 & 2) != 0) {
            str = y0Var.f65711b;
        }
        if ((i14 & 4) != 0) {
            str2 = y0Var.f65712c;
        }
        if ((i14 & 8) != 0) {
            i12 = y0Var.f65713d;
        }
        if ((i14 & 16) != 0) {
            i13 = y0Var.f65714e;
        }
        if ((i14 & 32) != 0) {
            str3 = y0Var.f65715f;
        }
        int i15 = i13;
        String str4 = str3;
        return y0Var.g(i11, str, str2, i12, i15, str4);
    }

    public final int a() {
        return this.f65710a;
    }

    @m80.k
    public final String b() {
        return this.f65711b;
    }

    @m80.k
    public final String c() {
        return this.f65712c;
    }

    public final int d() {
        return this.f65713d;
    }

    public final int e() {
        return this.f65714e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f65710a == y0Var.f65710a && kotlin.jvm.internal.g0.g(this.f65711b, y0Var.f65711b) && kotlin.jvm.internal.g0.g(this.f65712c, y0Var.f65712c) && this.f65713d == y0Var.f65713d && this.f65714e == y0Var.f65714e && kotlin.jvm.internal.g0.g(this.f65715f, y0Var.f65715f);
    }

    @m80.k
    public final String f() {
        return this.f65715f;
    }

    @m80.k
    public final y0 g(int i11, @m80.k String icon, @m80.k String name, int i12, int i13, @m80.k String intent) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(intent, "intent");
        return new y0(i11, icon, name, i12, i13, intent);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f65710a) * 31) + this.f65711b.hashCode()) * 31) + this.f65712c.hashCode()) * 31) + Integer.hashCode(this.f65713d)) * 31) + Integer.hashCode(this.f65714e)) * 31) + this.f65715f.hashCode();
    }

    public final int i() {
        return this.f65710a;
    }

    @m80.k
    public final String j() {
        return this.f65711b;
    }

    @m80.k
    public final String k() {
        return this.f65715f;
    }

    public final int l() {
        return this.f65713d;
    }

    @m80.k
    public final String m() {
        return this.f65712c;
    }

    public final int n() {
        return this.f65714e;
    }

    @m80.k
    public String toString() {
        return "GoldenItem(aid=" + this.f65710a + ", icon=" + this.f65711b + ", name=" + this.f65712c + ", itemType=" + this.f65713d + ", type=" + this.f65714e + ", intent=" + this.f65715f + ')';
    }
}
