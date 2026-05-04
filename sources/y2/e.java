package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99155j;

    /* renamed from: k, reason: collision with root package name */
    public float f99156k;

    /* renamed from: l, reason: collision with root package name */
    @a3.d0
    public com.badlogic.gdx.graphics.b f99157l;

    @Override // y2.d0
    public void i() {
        if (this.f99157l == null) {
            this.f99157l = this.f97056b.e();
        }
        this.f99155j = this.f99157l.f11547d;
    }

    @Override // y2.d0, x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99157l = null;
    }

    @Override // y2.d0
    public void u(float f11) {
        if (f11 == 0.0f) {
            this.f99157l.f11547d = this.f99155j;
        } else if (f11 == 1.0f) {
            this.f99157l.f11547d = this.f99156k;
        } else {
            com.badlogic.gdx.graphics.b bVar = this.f99157l;
            float f12 = this.f99155j;
            bVar.f11547d = f12 + ((this.f99156k - f12) * f11);
        }
    }

    public float v() {
        return this.f99156k;
    }

    @a3.d0
    public com.badlogic.gdx.graphics.b w() {
        return this.f99157l;
    }

    public void x(float f11) {
        this.f99156k = f11;
    }

    public void y(@a3.d0 com.badlogic.gdx.graphics.b bVar) {
        this.f99157l = bVar;
    }
}
