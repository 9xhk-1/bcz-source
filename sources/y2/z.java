package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class z extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99210j;

    /* renamed from: k, reason: collision with root package name */
    public float f99211k;

    /* renamed from: l, reason: collision with root package name */
    public float f99212l;

    /* renamed from: m, reason: collision with root package name */
    public float f99213m;

    public void A(float f11) {
        this.f99213m = f11;
    }

    @Override // y2.d0
    public void i() {
        this.f99210j = this.f97056b.D1();
        this.f99211k = this.f97056b.E1();
    }

    @Override // y2.d0
    public void u(float f11) {
        float f12;
        float f13;
        if (f11 == 0.0f) {
            f13 = this.f99210j;
            f12 = this.f99211k;
        } else if (f11 == 1.0f) {
            f13 = this.f99212l;
            f12 = this.f99213m;
        } else {
            float f14 = this.f99210j;
            float f15 = f14 + ((this.f99212l - f14) * f11);
            float f16 = this.f99211k;
            f12 = f16 + ((this.f99213m - f16) * f11);
            f13 = f15;
        }
        this.f97056b.G2(f13, f12);
    }

    public float v() {
        return this.f99212l;
    }

    public float w() {
        return this.f99213m;
    }

    public void x(float f11) {
        this.f99212l = f11;
        this.f99213m = f11;
    }

    public void y(float f11, float f12) {
        this.f99212l = f11;
        this.f99213m = f12;
    }

    public void z(float f11) {
        this.f99212l = f11;
    }
}
