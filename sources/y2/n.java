package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n extends q {

    /* renamed from: k, reason: collision with root package name */
    public float f99184k;

    /* renamed from: l, reason: collision with root package name */
    public float f99185l;

    public void A(float f11) {
        this.f99185l = f11;
    }

    @Override // y2.q
    public void v(float f11) {
        this.f97056b.f2(this.f99184k * f11, this.f99185l * f11);
    }

    public float w() {
        return this.f99184k;
    }

    public float x() {
        return this.f99185l;
    }

    public void y(float f11, float f12) {
        this.f99184k = f11;
        this.f99185l = f12;
    }

    public void z(float f11) {
        this.f99184k = f11;
    }
}
