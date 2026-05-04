package y2;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d0 extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public float f99149d;

    /* renamed from: e, reason: collision with root package name */
    public float f99150e;

    /* renamed from: f, reason: collision with root package name */
    @a3.d0
    public com.badlogic.gdx.math.l f99151f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99152g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99153h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f99154i;

    public d0() {
    }

    @Override // x2.a
    public boolean a(float f11) {
        boolean z11 = true;
        if (this.f99154i) {
            return true;
        }
        j0 c11 = c();
        g(null);
        try {
            if (!this.f99153h) {
                i();
                this.f99153h = true;
            }
            float f12 = this.f99150e + f11;
            this.f99150e = f12;
            float f13 = this.f99149d;
            if (f12 < f13) {
                z11 = false;
            }
            this.f99154i = z11;
            float f14 = z11 ? 1.0f : f12 / f13;
            com.badlogic.gdx.math.l lVar = this.f99151f;
            if (lVar != null) {
                f14 = lVar.a(f14);
            }
            if (this.f99152g) {
                f14 = 1.0f - f14;
            }
            u(f14);
            if (this.f99154i) {
                j();
            }
            boolean z12 = this.f99154i;
            g(c11);
            return z12;
        } catch (Throwable th2) {
            g(c11);
            throw th2;
        }
    }

    @Override // x2.a
    public void e() {
        this.f99150e = 0.0f;
        this.f99153h = false;
        this.f99154i = false;
    }

    public void k() {
        this.f99150e = this.f99149d;
    }

    public float l() {
        return this.f99149d;
    }

    @a3.d0
    public com.badlogic.gdx.math.l m() {
        return this.f99151f;
    }

    public float n() {
        return this.f99150e;
    }

    public boolean o() {
        return this.f99154i;
    }

    public boolean p() {
        return this.f99152g;
    }

    public void q(float f11) {
        this.f99149d = f11;
    }

    public void r(@a3.d0 com.badlogic.gdx.math.l lVar) {
        this.f99151f = lVar;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99152g = false;
        this.f99151f = null;
    }

    public void s(boolean z11) {
        this.f99152g = z11;
    }

    public void t(float f11) {
        this.f99150e = f11;
    }

    public abstract void u(float f11);

    public d0(float f11) {
        this.f99149d = f11;
    }

    public d0(float f11, @a3.d0 com.badlogic.gdx.math.l lVar) {
        this.f99149d = f11;
        this.f99151f = lVar;
    }

    public void i() {
    }

    public void j() {
    }
}
