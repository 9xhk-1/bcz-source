package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99159j;

    /* renamed from: k, reason: collision with root package name */
    public float f99160k;

    /* renamed from: l, reason: collision with root package name */
    public float f99161l;

    /* renamed from: m, reason: collision with root package name */
    public float f99162m;

    /* renamed from: n, reason: collision with root package name */
    @a3.d0
    public com.badlogic.gdx.graphics.b f99163n;

    /* renamed from: o, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f99164o = new com.badlogic.gdx.graphics.b();

    @Override // y2.d0
    public void i() {
        if (this.f99163n == null) {
            this.f99163n = this.f97056b.e();
        }
        com.badlogic.gdx.graphics.b bVar = this.f99163n;
        this.f99159j = bVar.f11544a;
        this.f99160k = bVar.f11545b;
        this.f99161l = bVar.f11546c;
        this.f99162m = bVar.f11547d;
    }

    @Override // y2.d0, x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99163n = null;
    }

    @Override // y2.d0
    public void u(float f11) {
        if (f11 == 0.0f) {
            this.f99163n.F(this.f99159j, this.f99160k, this.f99161l, this.f99162m);
            return;
        }
        if (f11 == 1.0f) {
            this.f99163n.H(this.f99164o);
            return;
        }
        float f12 = this.f99159j;
        com.badlogic.gdx.graphics.b bVar = this.f99164o;
        float f13 = f12 + ((bVar.f11544a - f12) * f11);
        float f14 = this.f99160k;
        float f15 = f14 + ((bVar.f11545b - f14) * f11);
        float f16 = this.f99161l;
        float f17 = f16 + ((bVar.f11546c - f16) * f11);
        float f18 = this.f99162m;
        this.f99163n.F(f13, f15, f17, f18 + ((bVar.f11547d - f18) * f11));
    }

    @a3.d0
    public com.badlogic.gdx.graphics.b v() {
        return this.f99163n;
    }

    public com.badlogic.gdx.graphics.b w() {
        return this.f99164o;
    }

    public void x(@a3.d0 com.badlogic.gdx.graphics.b bVar) {
        this.f99163n = bVar;
    }

    public void y(com.badlogic.gdx.graphics.b bVar) {
        this.f99164o.H(bVar);
    }
}
