package j2;

import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends PrimitiveSpawnShapeValue {
    public a(a aVar) {
        super(aVar);
        d(aVar);
    }

    @Override // j2.k
    public k f() {
        return new a(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        float K;
        float q11 = this.f12198h + (this.f12199i * this.f12195e.q(f11));
        float q12 = this.f12200j + (this.f12201k * this.f12196f.q(f11));
        float q13 = this.f12202l + (this.f12203m * this.f12197g.q(f11));
        float K2 = n.K(q12) - (q12 / 2.0f);
        if (this.f12204n) {
            K = q11 / 2.0f;
        } else {
            K = n.K(q11) / 2.0f;
            q13 = n.K(q13);
        }
        float f12 = q13 / 2.0f;
        float f13 = 0.0f;
        boolean z11 = K == 0.0f;
        boolean z12 = f12 == 0.0f;
        if (!z11 && !z12) {
            f13 = n.K(360.0f);
        } else if (z11) {
            f13 = n.M(1) == 0 ? -90.0f : 90.0f;
        } else if (z12 && n.M(1) != 0) {
            f13 = 180.0f;
        }
        vector3.set(K * n.t(f13), K2, f12 * n.a0(f13));
    }

    public a() {
    }
}
