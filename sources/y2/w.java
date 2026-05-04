package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99203j;

    /* renamed from: k, reason: collision with root package name */
    public float f99204k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f99205l;

    public w() {
        this.f99205l = false;
    }

    @Override // y2.d0
    public void i() {
        this.f99203j = this.f97056b.C1();
    }

    @Override // y2.d0
    public void u(float f11) {
        float f12;
        if (f11 == 0.0f) {
            f12 = this.f99203j;
        } else if (f11 == 1.0f) {
            f12 = this.f99204k;
        } else if (this.f99205l) {
            f12 = com.badlogic.gdx.math.n.D(this.f99203j, this.f99204k, f11);
        } else {
            float f13 = this.f99203j;
            f12 = f13 + ((this.f99204k - f13) * f11);
        }
        this.f97056b.E2(f12);
    }

    public float v() {
        return this.f99204k;
    }

    public boolean w() {
        return this.f99205l;
    }

    public void x(float f11) {
        this.f99204k = f11;
    }

    public void y(boolean z11) {
        this.f99205l = z11;
    }

    public w(boolean z11) {
        this.f99205l = z11;
    }
}
