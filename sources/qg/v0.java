package qg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f82160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82161b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82163d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82164e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82165f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82166g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e f82167h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final String f82168i;

    public v0(long j11, int i11, long j12, int i12, int i13, int i14, int i15, @m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e mode, @m80.l String str) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        this.f82160a = j11;
        this.f82161b = i11;
        this.f82162c = j12;
        this.f82163d = i12;
        this.f82164e = i13;
        this.f82165f = i14;
        this.f82166g = i15;
        this.f82167h = mode;
        this.f82168i = str;
    }

    public static /* synthetic */ v0 k(v0 v0Var, long j11, int i11, long j12, int i12, int i13, int i14, int i15, com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar, String str, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            j11 = v0Var.f82160a;
        }
        long j13 = j11;
        if ((i16 & 2) != 0) {
            i11 = v0Var.f82161b;
        }
        return v0Var.j(j13, i11, (i16 & 4) != 0 ? v0Var.f82162c : j12, (i16 & 8) != 0 ? v0Var.f82163d : i12, (i16 & 16) != 0 ? v0Var.f82164e : i13, (i16 & 32) != 0 ? v0Var.f82165f : i14, (i16 & 64) != 0 ? v0Var.f82166g : i15, (i16 & 128) != 0 ? v0Var.f82167h : eVar, (i16 & 256) != 0 ? v0Var.f82168i : str);
    }

    public final long a() {
        return this.f82160a;
    }

    public final int b() {
        return this.f82161b;
    }

    public final long c() {
        return this.f82162c;
    }

    public final int d() {
        return this.f82163d;
    }

    public final int e() {
        return this.f82164e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f82160a == v0Var.f82160a && this.f82161b == v0Var.f82161b && this.f82162c == v0Var.f82162c && this.f82163d == v0Var.f82163d && this.f82164e == v0Var.f82164e && this.f82165f == v0Var.f82165f && this.f82166g == v0Var.f82166g && kotlin.jvm.internal.g0.g(this.f82167h, v0Var.f82167h) && kotlin.jvm.internal.g0.g(this.f82168i, v0Var.f82168i);
    }

    public final int f() {
        return this.f82165f;
    }

    public final int g() {
        return this.f82166g;
    }

    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e h() {
        return this.f82167h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Long.hashCode(this.f82160a) * 31) + Integer.hashCode(this.f82161b)) * 31) + Long.hashCode(this.f82162c)) * 31) + Integer.hashCode(this.f82163d)) * 31) + Integer.hashCode(this.f82164e)) * 31) + Integer.hashCode(this.f82165f)) * 31) + Integer.hashCode(this.f82166g)) * 31) + this.f82167h.hashCode()) * 31;
        String str = this.f82168i;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.l
    public final String i() {
        return this.f82168i;
    }

    @m80.k
    public final v0 j(long j11, int i11, long j12, int i12, int i13, int i14, int i15, @m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e mode, @m80.l String str) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        return new v0(j11, i11, j12, i12, i13, i14, i15, mode, str);
    }

    public final int l() {
        return this.f82161b;
    }

    public final long m() {
        return this.f82160a;
    }

    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e n() {
        return this.f82167h;
    }

    @m80.l
    public final String o() {
        return this.f82168i;
    }

    public final int p() {
        return this.f82164e;
    }

    public final long q() {
        return this.f82162c;
    }

    public final int r() {
        return this.f82165f;
    }

    public final int s() {
        return this.f82163d;
    }

    public final int t() {
        return this.f82166g;
    }

    @m80.k
    public String toString() {
        return "JsParamSnapshot(jsVersion=" + this.f82160a + ", bookId=" + this.f82161b + ", recordVersion=" + this.f82162c + ", roadMapLength=" + this.f82163d + ", planCount=" + this.f82164e + ", reviewCount=" + this.f82165f + ", wantMore=" + this.f82166g + ", mode=" + this.f82167h + ", param=" + this.f82168i + pn.j.f81007d;
    }
}
