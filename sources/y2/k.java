package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99177j;

    /* renamed from: k, reason: collision with root package name */
    public float f99178k;

    /* renamed from: l, reason: collision with root package name */
    public float f99179l;

    public k() {
        this.f99177j = 0.0f;
        this.f99178k = 1.0f;
    }

    public void A(float f11) {
        this.f99179l = f11;
    }

    @Override // y2.d0
    public void i() {
        this.f99179l = this.f99177j;
    }

    @Override // y2.d0
    public void u(float f11) {
        if (f11 == 0.0f) {
            this.f99179l = this.f99177j;
        } else if (f11 == 1.0f) {
            this.f99179l = this.f99178k;
        } else {
            float f12 = this.f99177j;
            this.f99179l = f12 + ((this.f99178k - f12) * f11);
        }
    }

    public float v() {
        return this.f99178k;
    }

    public float w() {
        return this.f99177j;
    }

    public float x() {
        return this.f99179l;
    }

    public void y(float f11) {
        this.f99178k = f11;
    }

    public void z(float f11) {
        this.f99177j = f11;
    }

    public k(float f11, float f12) {
        this.f99177j = f11;
        this.f99178k = f12;
    }

    public k(float f11, float f12, float f13) {
        super(f13);
        this.f99177j = f11;
        this.f99178k = f12;
    }

    public k(float f11, float f12, float f13, @a3.d0 com.badlogic.gdx.math.l lVar) {
        super(f13, lVar);
        this.f99177j = f11;
        this.f99178k = f12;
    }
}
