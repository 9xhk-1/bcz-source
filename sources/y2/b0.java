package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b0 extends q {

    /* renamed from: k, reason: collision with root package name */
    public float f99140k;

    /* renamed from: l, reason: collision with root package name */
    public float f99141l;

    public void A(float f11) {
        this.f99140k = f11;
    }

    @Override // y2.q
    public void v(float f11) {
        this.f97056b.V2(this.f99140k * f11, this.f99141l * f11);
    }

    public float w() {
        return this.f99141l;
    }

    public float x() {
        return this.f99140k;
    }

    public void y(float f11, float f12) {
        this.f99140k = f11;
        this.f99141l = f12;
    }

    public void z(float f11) {
        this.f99141l = f11;
    }
}
