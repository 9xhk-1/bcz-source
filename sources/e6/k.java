package e6;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final double f49443a;

    /* renamed from: b, reason: collision with root package name */
    public final double f49444b;

    /* renamed from: c, reason: collision with root package name */
    public final double f49445c;

    /* renamed from: d, reason: collision with root package name */
    public final double f49446d;

    /* renamed from: e, reason: collision with root package name */
    public final double f49447e;

    /* renamed from: f, reason: collision with root package name */
    public final double f49448f;

    /* renamed from: g, reason: collision with root package name */
    public final double f49449g;

    /* renamed from: h, reason: collision with root package name */
    public final double f49450h;

    /* renamed from: i, reason: collision with root package name */
    public final double f49451i;

    /* renamed from: j, reason: collision with root package name */
    public final double f49452j;

    public k() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
    }

    public static /* synthetic */ k l(k kVar, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, int i11, Object obj) {
        double d22;
        double d23;
        double d24 = (i11 & 1) != 0 ? kVar.f49443a : d11;
        double d25 = (i11 & 2) != 0 ? kVar.f49444b : d12;
        double d26 = (i11 & 4) != 0 ? kVar.f49445c : d13;
        double d27 = (i11 & 8) != 0 ? kVar.f49446d : d14;
        double d28 = (i11 & 16) != 0 ? kVar.f49447e : d15;
        double d29 = (i11 & 32) != 0 ? kVar.f49448f : d16;
        double d31 = (i11 & 64) != 0 ? kVar.f49449g : d17;
        double d32 = d24;
        double d33 = (i11 & 128) != 0 ? kVar.f49450h : d18;
        double d34 = (i11 & 256) != 0 ? kVar.f49451i : d19;
        if ((i11 & 512) != 0) {
            d23 = d34;
            d22 = kVar.f49452j;
        } else {
            d22 = d21;
            d23 = d34;
        }
        return kVar.k(d32, d25, d26, d27, d28, d29, d31, d33, d23, d22);
    }

    public final double a() {
        return this.f49443a;
    }

    public final double b() {
        return this.f49452j;
    }

    public final double c() {
        return this.f49444b;
    }

    public final double d() {
        return this.f49445c;
    }

    public final double e() {
        return this.f49446d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(this.f49443a, kVar.f49443a) == 0 && Double.compare(this.f49444b, kVar.f49444b) == 0 && Double.compare(this.f49445c, kVar.f49445c) == 0 && Double.compare(this.f49446d, kVar.f49446d) == 0 && Double.compare(this.f49447e, kVar.f49447e) == 0 && Double.compare(this.f49448f, kVar.f49448f) == 0 && Double.compare(this.f49449g, kVar.f49449g) == 0 && Double.compare(this.f49450h, kVar.f49450h) == 0 && Double.compare(this.f49451i, kVar.f49451i) == 0 && Double.compare(this.f49452j, kVar.f49452j) == 0;
    }

    public final double f() {
        return this.f49447e;
    }

    public final double g() {
        return this.f49448f;
    }

    public final double h() {
        return this.f49449g;
    }

    public int hashCode() {
        return (((((((((((((((((Double.hashCode(this.f49443a) * 31) + Double.hashCode(this.f49444b)) * 31) + Double.hashCode(this.f49445c)) * 31) + Double.hashCode(this.f49446d)) * 31) + Double.hashCode(this.f49447e)) * 31) + Double.hashCode(this.f49448f)) * 31) + Double.hashCode(this.f49449g)) * 31) + Double.hashCode(this.f49450h)) * 31) + Double.hashCode(this.f49451i)) * 31) + Double.hashCode(this.f49452j);
    }

    public final double i() {
        return this.f49450h;
    }

    public final double j() {
        return this.f49451i;
    }

    @m80.k
    public final k k(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        return new k(d11, d12, d13, d14, d15, d16, d17, d18, d19, d21);
    }

    public final double m() {
        return this.f49449g;
    }

    public final double n() {
        return this.f49448f;
    }

    public final double o() {
        return this.f49452j;
    }

    public final double p() {
        return this.f49445c;
    }

    public final double q() {
        return this.f49451i;
    }

    public final double r() {
        return this.f49450h;
    }

    public final double s() {
        return this.f49447e;
    }

    public final double t() {
        return this.f49446d;
    }

    @m80.k
    public String toString() {
        return "WordPoint(evef=" + this.f49443a + ", evcf=" + this.f49444b + ", efcf=" + this.f49445c + ", efu=" + this.f49446d + ", efs=" + this.f49447e + ", cfs=" + this.f49448f + ", cfa=" + this.f49449g + ", efpcf=" + this.f49450h + ", efd=" + this.f49451i + ", efau=" + this.f49452j + ')';
    }

    public final double u() {
        return this.f49444b;
    }

    public final double v() {
        return this.f49443a;
    }

    public k(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        this.f49443a = d11;
        this.f49444b = d12;
        this.f49445c = d13;
        this.f49446d = d14;
        this.f49447e = d15;
        this.f49448f = d16;
        this.f49449g = d17;
        this.f49450h = d18;
        this.f49451i = d19;
        this.f49452j = d21;
    }

    public /* synthetic */ k(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, int i11, v vVar) {
        this((i11 & 1) != 0 ? -1.0d : d11, (i11 & 2) != 0 ? -1.0d : d12, (i11 & 4) != 0 ? -1.0d : d13, (i11 & 8) != 0 ? -1.0d : d14, (i11 & 16) != 0 ? -1.0d : d15, (i11 & 32) != 0 ? -1.0d : d16, (i11 & 64) != 0 ? -1.0d : d17, (i11 & 128) != 0 ? -1.0d : d18, (i11 & 256) != 0 ? -1.0d : d19, (i11 & 512) != 0 ? -1.0d : d21);
    }
}
