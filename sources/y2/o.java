package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99186j;

    /* renamed from: k, reason: collision with root package name */
    public float f99187k;

    /* renamed from: l, reason: collision with root package name */
    public float f99188l;

    /* renamed from: m, reason: collision with root package name */
    public float f99189m;

    /* renamed from: n, reason: collision with root package name */
    public int f99190n = 12;

    public void A(int i11) {
        this.f99190n = i11;
    }

    public void B(float f11, float f12) {
        this.f99188l = f11;
        this.f99189m = f12;
    }

    public void C(float f11, float f12, int i11) {
        this.f99188l = f11;
        this.f99189m = f12;
        this.f99190n = i11;
    }

    public void D(float f11, float f12) {
        this.f99186j = f11;
        this.f99187k = f12;
    }

    public void E(float f11) {
        this.f99188l = f11;
    }

    public void F(float f11) {
        this.f99189m = f11;
    }

    @Override // y2.d0
    public void i() {
        this.f99186j = this.f97056b.L1(this.f99190n);
        this.f99187k = this.f97056b.N1(this.f99190n);
    }

    @Override // y2.d0, x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99190n = 12;
    }

    @Override // y2.d0
    public void u(float f11) {
        float f12;
        float f13;
        if (f11 == 0.0f) {
            f13 = this.f99186j;
            f12 = this.f99187k;
        } else if (f11 == 1.0f) {
            f13 = this.f99188l;
            f12 = this.f99189m;
        } else {
            float f14 = this.f99186j;
            float f15 = f14 + ((this.f99188l - f14) * f11);
            float f16 = this.f99187k;
            f12 = f16 + ((this.f99189m - f16) * f11);
            f13 = f15;
        }
        this.f97056b.D2(f13, f12, this.f99190n);
    }

    public int v() {
        return this.f99190n;
    }

    public float w() {
        return this.f99186j;
    }

    public float x() {
        return this.f99187k;
    }

    public float y() {
        return this.f99188l;
    }

    public float z() {
        return this.f99189m;
    }
}
