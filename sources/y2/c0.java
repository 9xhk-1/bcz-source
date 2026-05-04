package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c0 extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99144j;

    /* renamed from: k, reason: collision with root package name */
    public float f99145k;

    /* renamed from: l, reason: collision with root package name */
    public float f99146l;

    /* renamed from: m, reason: collision with root package name */
    public float f99147m;

    @Override // y2.d0
    public void i() {
        this.f99144j = this.f97056b.J1();
        this.f99145k = this.f97056b.v1();
    }

    @Override // y2.d0
    public void u(float f11) {
        float f12;
        float f13;
        if (f11 == 0.0f) {
            f13 = this.f99144j;
            f12 = this.f99145k;
        } else if (f11 == 1.0f) {
            f13 = this.f99146l;
            f12 = this.f99147m;
        } else {
            float f14 = this.f99144j;
            float f15 = f14 + ((this.f99146l - f14) * f11);
            float f16 = this.f99145k;
            f12 = f16 + ((this.f99147m - f16) * f11);
            f13 = f15;
        }
        this.f97056b.J2(f13, f12);
    }

    public float v() {
        return this.f99147m;
    }

    public float w() {
        return this.f99146l;
    }

    public void x(float f11) {
        this.f99147m = f11;
    }

    public void y(float f11, float f12) {
        this.f99146l = f11;
        this.f99147m = f12;
    }

    public void z(float f11) {
        this.f99146l = f11;
    }
}
