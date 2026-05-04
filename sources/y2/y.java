package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y extends q {

    /* renamed from: k, reason: collision with root package name */
    public float f99208k;

    /* renamed from: l, reason: collision with root package name */
    public float f99209l;

    public void A(float f11) {
        this.f99208k = f11;
    }

    public void B(float f11) {
        this.f99209l = f11;
    }

    @Override // y2.q
    public void v(float f11) {
        this.f97056b.q2(this.f99208k * f11, this.f99209l * f11);
    }

    public float w() {
        return this.f99208k;
    }

    public float x() {
        return this.f99209l;
    }

    public void y(float f11) {
        this.f99208k = f11;
        this.f99209l = f11;
    }

    public void z(float f11, float f12) {
        this.f99208k = f11;
        this.f99209l = f12;
    }
}
