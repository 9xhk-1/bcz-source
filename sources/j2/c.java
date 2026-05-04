package j2;

import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c extends PrimitiveSpawnShapeValue {
    public c(c cVar) {
        super(cVar);
        d(cVar);
    }

    @Override // j2.k
    public k f() {
        return new c(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        float q11 = this.f12198h + (this.f12199i * this.f12195e.q(f11));
        float q12 = this.f12200j + (this.f12201k * this.f12196f.q(f11));
        float q13 = this.f12202l + (this.f12203m * this.f12197g.q(f11));
        float J = n.J();
        vector3.f12537x = q11 * J;
        vector3.f12538y = q12 * J;
        vector3.f12539z = J * q13;
    }

    public c() {
    }
}
