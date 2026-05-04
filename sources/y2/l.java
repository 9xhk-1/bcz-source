package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public int f99180j;

    /* renamed from: k, reason: collision with root package name */
    public int f99181k;

    /* renamed from: l, reason: collision with root package name */
    public int f99182l;

    public l() {
        this.f99180j = 0;
        this.f99181k = 1;
    }

    public void A(int i11) {
        this.f99182l = i11;
    }

    @Override // y2.d0
    public void i() {
        this.f99182l = this.f99180j;
    }

    @Override // y2.d0
    public void u(float f11) {
        if (f11 == 0.0f) {
            this.f99182l = this.f99180j;
        } else if (f11 == 1.0f) {
            this.f99182l = this.f99181k;
        } else {
            this.f99182l = (int) (this.f99180j + ((this.f99181k - r0) * f11));
        }
    }

    public int v() {
        return this.f99181k;
    }

    public int w() {
        return this.f99180j;
    }

    public int x() {
        return this.f99182l;
    }

    public void y(int i11) {
        this.f99181k = i11;
    }

    public void z(int i11) {
        this.f99180j = i11;
    }

    public l(int i11, int i12) {
        this.f99180j = i11;
        this.f99181k = i12;
    }

    public l(int i11, int i12, float f11) {
        super(f11);
        this.f99180j = i11;
        this.f99181k = i12;
    }

    public l(int i11, int i12, float f11, @a3.d0 com.badlogic.gdx.math.l lVar) {
        super(f11, lVar);
        this.f99180j = i11;
        this.f99181k = i12;
    }
}
