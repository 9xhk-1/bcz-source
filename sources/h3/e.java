package h3;

import com.badlogic.gdx.graphics.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends g {

    /* renamed from: i, reason: collision with root package name */
    public float f58170i;

    public e() {
        this(new k());
    }

    @Override // h3.g
    public void I(int i11, int i12, boolean z11) {
        u(0, 0, i11, i12);
        float f11 = this.f58170i;
        C(i11 * f11, i12 * f11);
        b(z11);
    }

    public float J() {
        return this.f58170i;
    }

    public void K(float f11) {
        this.f58170i = f11;
    }

    public e(com.badlogic.gdx.graphics.a aVar) {
        this.f58170i = 1.0f;
        t(aVar);
    }
}
