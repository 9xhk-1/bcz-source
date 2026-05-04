package e6;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f49395a;

    /* renamed from: b, reason: collision with root package name */
    public final long f49396b;

    /* renamed from: c, reason: collision with root package name */
    public final long f49397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49398d;

    /* renamed from: e, reason: collision with root package name */
    public final long f49399e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49400f;

    /* renamed from: g, reason: collision with root package name */
    public final long f49401g;

    /* renamed from: h, reason: collision with root package name */
    public final long f49402h;

    /* renamed from: i, reason: collision with root package name */
    public final int f49403i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f49404j;

    /* renamed from: k, reason: collision with root package name */
    public final long f49405k;

    /* renamed from: l, reason: collision with root package name */
    public final long f49406l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f49407m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f49408n;

    /* renamed from: o, reason: collision with root package name */
    public final long f49409o;

    public i() {
        this(null, 0L, 0L, false, 0L, false, 0L, 0L, 0, false, 0L, 0L, false, false, 0L, 32767, null);
    }

    public static /* synthetic */ i q(i iVar, String str, long j11, long j12, boolean z11, long j13, boolean z12, long j14, long j15, int i11, boolean z13, long j16, long j17, boolean z14, boolean z15, long j18, int i12, Object obj) {
        long j19;
        boolean z16;
        String str2 = (i12 & 1) != 0 ? iVar.f49395a : str;
        long j21 = (i12 & 2) != 0 ? iVar.f49396b : j11;
        long j22 = (i12 & 4) != 0 ? iVar.f49397c : j12;
        boolean z17 = (i12 & 8) != 0 ? iVar.f49398d : z11;
        long j23 = (i12 & 16) != 0 ? iVar.f49399e : j13;
        boolean z18 = (i12 & 32) != 0 ? iVar.f49400f : z12;
        long j24 = (i12 & 64) != 0 ? iVar.f49401g : j14;
        long j25 = (i12 & 128) != 0 ? iVar.f49402h : j15;
        int i13 = (i12 & 256) != 0 ? iVar.f49403i : i11;
        String str3 = str2;
        boolean z19 = (i12 & 512) != 0 ? iVar.f49404j : z13;
        long j26 = j21;
        long j27 = (i12 & 1024) != 0 ? iVar.f49405k : j16;
        long j28 = (i12 & 2048) != 0 ? iVar.f49406l : j17;
        boolean z21 = (i12 & 4096) != 0 ? iVar.f49407m : z14;
        long j29 = j28;
        boolean z22 = (i12 & 8192) != 0 ? iVar.f49408n : z15;
        if ((i12 & 16384) != 0) {
            z16 = z22;
            j19 = iVar.f49409o;
        } else {
            j19 = j18;
            z16 = z22;
        }
        return iVar.p(str3, j26, j22, z17, j23, z18, j24, j25, i13, z19, j27, j29, z21, z16, j19);
    }

    public final long A() {
        return this.f49399e;
    }

    public final boolean B() {
        return this.f49408n;
    }

    public final long C() {
        return this.f49397c;
    }

    public final int D() {
        return this.f49403i;
    }

    public final boolean E() {
        return this.f49407m;
    }

    public final long F() {
        return this.f49406l;
    }

    @m80.k
    public final String a() {
        return this.f49395a;
    }

    public final boolean b() {
        return this.f49404j;
    }

    public final long c() {
        return this.f49405k;
    }

    public final long d() {
        return this.f49406l;
    }

    public final boolean e() {
        return this.f49407m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return g0.g(this.f49395a, iVar.f49395a) && this.f49396b == iVar.f49396b && this.f49397c == iVar.f49397c && this.f49398d == iVar.f49398d && this.f49399e == iVar.f49399e && this.f49400f == iVar.f49400f && this.f49401g == iVar.f49401g && this.f49402h == iVar.f49402h && this.f49403i == iVar.f49403i && this.f49404j == iVar.f49404j && this.f49405k == iVar.f49405k && this.f49406l == iVar.f49406l && this.f49407m == iVar.f49407m && this.f49408n == iVar.f49408n && this.f49409o == iVar.f49409o;
    }

    public final boolean f() {
        return this.f49408n;
    }

    public final long g() {
        return this.f49409o;
    }

    public final long h() {
        return this.f49396b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f49395a.hashCode() * 31) + Long.hashCode(this.f49396b)) * 31) + Long.hashCode(this.f49397c)) * 31) + Boolean.hashCode(this.f49398d)) * 31) + Long.hashCode(this.f49399e)) * 31) + Boolean.hashCode(this.f49400f)) * 31) + Long.hashCode(this.f49401g)) * 31) + Long.hashCode(this.f49402h)) * 31) + Integer.hashCode(this.f49403i)) * 31) + Boolean.hashCode(this.f49404j)) * 31) + Long.hashCode(this.f49405k)) * 31) + Long.hashCode(this.f49406l)) * 31) + Boolean.hashCode(this.f49407m)) * 31) + Boolean.hashCode(this.f49408n)) * 31) + Long.hashCode(this.f49409o);
    }

    public final long i() {
        return this.f49397c;
    }

    public final boolean j() {
        return this.f49398d;
    }

    public final long k() {
        return this.f49399e;
    }

    public final boolean l() {
        return this.f49400f;
    }

    public final long m() {
        return this.f49401g;
    }

    public final long n() {
        return this.f49402h;
    }

    public final int o() {
        return this.f49403i;
    }

    @m80.k
    public final i p(@m80.k String gameId, long j11, long j12, boolean z11, long j13, boolean z12, long j14, long j15, int i11, boolean z13, long j16, long j17, boolean z14, boolean z15, long j18) {
        g0.p(gameId, "gameId");
        return new i(gameId, j11, j12, z11, j13, z12, j14, j15, i11, z13, j16, j17, z14, z15, j18);
    }

    public final long r() {
        return this.f49409o;
    }

    public final long s() {
        return this.f49401g;
    }

    public final long t() {
        return this.f49402h;
    }

    @m80.k
    public String toString() {
        return "SubmitStudyVo(gameId=" + this.f49395a + ", stage=" + this.f49396b + ", topicId=" + this.f49397c + ", right=" + this.f49398d + ", step=" + this.f49399e + ", skip=" + this.f49400f + ", cost=" + this.f49401g + ", errorTimes=" + this.f49402h + ", type=" + this.f49403i + ", pic=" + this.f49404j + ", optionType=" + this.f49405k + ", wiki=" + this.f49406l + ", view=" + this.f49407m + ", tip=" + this.f49408n + ", bookId=" + this.f49409o + ')';
    }

    @m80.k
    public final String u() {
        return this.f49395a;
    }

    public final long v() {
        return this.f49405k;
    }

    public final boolean w() {
        return this.f49404j;
    }

    public final boolean x() {
        return this.f49398d;
    }

    public final boolean y() {
        return this.f49400f;
    }

    public final long z() {
        return this.f49396b;
    }

    public i(@m80.k String gameId, long j11, long j12, boolean z11, long j13, boolean z12, long j14, long j15, int i11, boolean z13, long j16, long j17, boolean z14, boolean z15, long j18) {
        g0.p(gameId, "gameId");
        this.f49395a = gameId;
        this.f49396b = j11;
        this.f49397c = j12;
        this.f49398d = z11;
        this.f49399e = j13;
        this.f49400f = z12;
        this.f49401g = j14;
        this.f49402h = j15;
        this.f49403i = i11;
        this.f49404j = z13;
        this.f49405k = j16;
        this.f49406l = j17;
        this.f49407m = z14;
        this.f49408n = z15;
        this.f49409o = j18;
    }

    public /* synthetic */ i(String str, long j11, long j12, boolean z11, long j13, boolean z12, long j14, long j15, int i11, boolean z13, long j16, long j17, boolean z14, boolean z15, long j18, int i12, v vVar) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? 0L : j13, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? 0L : j14, (i12 & 128) != 0 ? 0L : j15, (i12 & 256) != 0 ? -1 : i11, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? 0L : j16, (i12 & 2048) != 0 ? 0L : j17, (i12 & 4096) != 0 ? false : z14, (i12 & 8192) != 0 ? false : z15, (i12 & 16384) != 0 ? 0L : j18);
    }
}
