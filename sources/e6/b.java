package e6;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final double f49215a;

    /* renamed from: b, reason: collision with root package name */
    public final double f49216b;

    /* renamed from: c, reason: collision with root package name */
    public final double f49217c;

    /* renamed from: d, reason: collision with root package name */
    public final double f49218d;

    /* renamed from: e, reason: collision with root package name */
    public final double f49219e;

    /* renamed from: f, reason: collision with root package name */
    public final double f49220f;

    /* renamed from: g, reason: collision with root package name */
    public final double f49221g;

    /* renamed from: h, reason: collision with root package name */
    public final double f49222h;

    /* renamed from: i, reason: collision with root package name */
    public final double f49223i;

    /* renamed from: j, reason: collision with root package name */
    public final double f49224j;

    public b() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
    }

    public static /* synthetic */ b l(b bVar, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, int i11, Object obj) {
        double d22;
        double d23;
        double d24 = (i11 & 1) != 0 ? bVar.f49215a : d11;
        double d25 = (i11 & 2) != 0 ? bVar.f49216b : d12;
        double d26 = (i11 & 4) != 0 ? bVar.f49217c : d13;
        double d27 = (i11 & 8) != 0 ? bVar.f49218d : d14;
        double d28 = (i11 & 16) != 0 ? bVar.f49219e : d15;
        double d29 = (i11 & 32) != 0 ? bVar.f49220f : d16;
        double d31 = (i11 & 64) != 0 ? bVar.f49221g : d17;
        double d32 = d24;
        double d33 = (i11 & 128) != 0 ? bVar.f49222h : d18;
        double d34 = (i11 & 256) != 0 ? bVar.f49223i : d19;
        if ((i11 & 512) != 0) {
            d23 = d34;
            d22 = bVar.f49224j;
        } else {
            d22 = d21;
            d23 = d34;
        }
        return bVar.k(d32, d25, d26, d27, d28, d29, d31, d33, d23, d22);
    }

    public final double a() {
        return this.f49215a;
    }

    public final double b() {
        return this.f49224j;
    }

    public final double c() {
        return this.f49216b;
    }

    public final double d() {
        return this.f49217c;
    }

    public final double e() {
        return this.f49218d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f49215a, bVar.f49215a) == 0 && Double.compare(this.f49216b, bVar.f49216b) == 0 && Double.compare(this.f49217c, bVar.f49217c) == 0 && Double.compare(this.f49218d, bVar.f49218d) == 0 && Double.compare(this.f49219e, bVar.f49219e) == 0 && Double.compare(this.f49220f, bVar.f49220f) == 0 && Double.compare(this.f49221g, bVar.f49221g) == 0 && Double.compare(this.f49222h, bVar.f49222h) == 0 && Double.compare(this.f49223i, bVar.f49223i) == 0 && Double.compare(this.f49224j, bVar.f49224j) == 0;
    }

    public final double f() {
        return this.f49219e;
    }

    public final double g() {
        return this.f49220f;
    }

    public final double h() {
        return this.f49221g;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.f49215a) * 31) + Double.hashCode(this.f49216b)) * 31) + Double.hashCode(this.f49217c)) * 31) + Double.hashCode(this.f49218d)) * 31) + Double.hashCode(this.f49219e)) * 31) + Double.hashCode(this.f49220f)) * 31) + Double.hashCode(this.f49221g)) * 31) + Double.hashCode(this.f49222h)) * 31) + Double.hashCode(this.f49223i)) * 31) + Double.hashCode(this.f49224j);
    }

    public final double i() {
        return this.f49222h;
    }

    public final double j() {
        return this.f49223i;
    }

    @m80.k
    public final b k(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        return new b(d11, d12, d13, d14, d15, d16, d17, d18, d19, d21);
    }

    public final double m() {
        return this.f49221g;
    }

    public final double n() {
        return this.f49220f;
    }

    public final double o() {
        return this.f49224j;
    }

    public final double p() {
        return this.f49217c;
    }

    public final double q() {
        return this.f49223i;
    }

    public final double r() {
        return this.f49222h;
    }

    public final double s() {
        return this.f49219e;
    }

    public final double t() {
        return this.f49218d;
    }

    @m80.k
    public String toString() {
        return "AbilityFactor(evef=" + this.f49215a + ", evcf=" + this.f49216b + ", efcf=" + this.f49217c + ", efu=" + this.f49218d + ", efs=" + this.f49219e + ", cfs=" + this.f49220f + ", cfa=" + this.f49221g + ", efpcf=" + this.f49222h + ", efd=" + this.f49223i + ", efau=" + this.f49224j + ')';
    }

    public final double u() {
        return this.f49216b;
    }

    public final double v() {
        return this.f49215a;
    }

    public b(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        this.f49215a = d11;
        this.f49216b = d12;
        this.f49217c = d13;
        this.f49218d = d14;
        this.f49219e = d15;
        this.f49220f = d16;
        this.f49221g = d17;
        this.f49222h = d18;
        this.f49223i = d19;
        this.f49224j = d21;
    }

    public /* synthetic */ b(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, int i11, v vVar) {
        this((i11 & 1) != 0 ? -1.0d : d11, (i11 & 2) != 0 ? -1.0d : d12, (i11 & 4) != 0 ? -1.0d : d13, (i11 & 8) != 0 ? -1.0d : d14, (i11 & 16) != 0 ? -1.0d : d15, (i11 & 32) != 0 ? -1.0d : d16, (i11 & 64) != 0 ? -1.0d : d17, (i11 & 128) != 0 ? -1.0d : d18, (i11 & 256) != 0 ? -1.0d : d19, (i11 & 512) != 0 ? -1.0d : d21);
    }
}
