package nm;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f75179d = new a(0.0f, 0.0f, 0.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final a f75180e = new a(1.0f, 0.0f, 0.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final a f75181f = new a(0.0f, 1.0f, 0.0f);

    /* renamed from: g, reason: collision with root package name */
    public static final a f75182g = new a(0.0f, 0.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public float f75183a;

    /* renamed from: b, reason: collision with root package name */
    public float f75184b;

    /* renamed from: c, reason: collision with root package name */
    public float f75185c;

    public a() {
    }

    public final void a(float f11, float f12, float f13) {
        this.f75183a += f11;
        this.f75184b += f12;
        this.f75185c += f13;
    }

    public final void b(a aVar) {
        this.f75183a += aVar.f75183a;
        this.f75184b += aVar.f75184b;
        this.f75185c += aVar.f75185c;
    }

    public final a c(a aVar) {
        float f11 = this.f75184b;
        float f12 = aVar.f75185c;
        float f13 = this.f75185c;
        float f14 = aVar.f75184b;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = aVar.f75183a;
        float f17 = this.f75183a;
        return new a(f15, (f13 * f16) - (f12 * f17), (f17 * f14) - (f11 * f16));
    }

    public final float d(a aVar) {
        float f11 = this.f75183a - aVar.f75183a;
        float f12 = this.f75184b - aVar.f75184b;
        float f13 = this.f75185c - aVar.f75185c;
        return (f11 * f11) + (f12 * f12) + (f13 * f13);
    }

    public final void e(float f11) {
        if (f11 != 0.0f) {
            this.f75183a /= f11;
            this.f75184b /= f11;
            this.f75185c /= f11;
        }
    }

    public final float f(a aVar) {
        return (this.f75183a * aVar.f75183a) + (this.f75184b * aVar.f75184b) + (this.f75185c * aVar.f75185c);
    }

    public final float g() {
        return (float) Math.sqrt(h());
    }

    public final float h() {
        float f11 = this.f75183a;
        float f12 = this.f75184b;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = this.f75185c;
        return f13 + (f14 * f14);
    }

    public final void i(float f11) {
        this.f75183a *= f11;
        this.f75184b *= f11;
        this.f75185c *= f11;
    }

    public final void j(a aVar) {
        this.f75183a *= aVar.f75183a;
        this.f75184b *= aVar.f75184b;
        this.f75185c *= aVar.f75185c;
    }

    public final float k() {
        float g11 = g();
        if (g11 != 0.0f) {
            this.f75183a /= g11;
            this.f75184b /= g11;
            this.f75185c /= g11;
        }
        return g11;
    }

    public final boolean l(a aVar) {
        return f(aVar) > 0.0f;
    }

    public final void m(float f11, float f12, float f13) {
        this.f75183a = f11;
        this.f75184b = f12;
        this.f75185c = f13;
    }

    public final void n(a aVar) {
        this.f75183a = aVar.f75183a;
        this.f75184b = aVar.f75184b;
        this.f75185c = aVar.f75185c;
    }

    public final void o(a aVar) {
        this.f75183a -= aVar.f75183a;
        this.f75184b -= aVar.f75184b;
        this.f75185c -= aVar.f75185c;
    }

    public final void p(a aVar, float f11) {
        this.f75183a -= aVar.f75183a * f11;
        this.f75184b -= aVar.f75184b * f11;
        this.f75185c -= aVar.f75185c * f11;
    }

    public final void q() {
        m(0.0f, 0.0f, 0.0f);
    }

    public a(float[] fArr) {
        m(fArr[0], fArr[1], fArr[2]);
    }

    public a(float f11, float f12, float f13) {
        m(f11, f12, f13);
    }

    public a(a aVar) {
        n(aVar);
    }
}
