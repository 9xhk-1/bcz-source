package j2;

import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g extends PrimitiveSpawnShapeValue {
    public g(g gVar) {
        super(gVar);
        d(gVar);
    }

    @Override // j2.k
    public k f() {
        return new g(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        vector3.f12537x = this.f12198h + (this.f12199i * this.f12195e.q(f11));
        vector3.f12538y = this.f12200j + (this.f12201k * this.f12196f.q(f11));
        vector3.f12539z = this.f12202l + (this.f12203m * this.f12197g.q(f11));
    }

    public g() {
    }
}
