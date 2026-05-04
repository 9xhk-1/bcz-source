package j2;

import com.badlogic.gdx.graphics.g3d.particles.values.PrimitiveSpawnShapeValue;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i extends PrimitiveSpawnShapeValue {
    public i(i iVar) {
        super(iVar);
        d(iVar);
    }

    @Override // j2.k
    public k f() {
        return new i(this);
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        float K;
        float K2;
        float f12;
        float f13;
        float K3;
        float K4;
        float q11 = this.f12198h + (this.f12199i * this.f12195e.q(f11));
        float q12 = this.f12200j + (this.f12201k * this.f12196f.q(f11));
        float q13 = this.f12202l + (this.f12203m * this.f12197g.q(f11));
        if (!this.f12204n) {
            vector3.f12537x = n.K(q11) - (q11 / 2.0f);
            vector3.f12538y = n.K(q12) - (q12 / 2.0f);
            vector3.f12539z = n.K(q13) - (q13 / 2.0f);
            return;
        }
        int N = n.N(-1, 1);
        if (N == -1) {
            f13 = n.M(1) == 0 ? (-q11) / 2.0f : q11 / 2.0f;
            if (f13 == 0.0f) {
                f12 = n.M(1) == 0 ? (-q12) / 2.0f : q12 / 2.0f;
                K2 = n.M(1) == 0 ? (-q13) / 2.0f : q13 / 2.0f;
            } else {
                f12 = n.K(q12) - (q12 / 2.0f);
                K2 = n.K(q13) - (q13 / 2.0f);
            }
        } else if (N == 0) {
            float f14 = n.M(1) == 0 ? (-q13) / 2.0f : q13 / 2.0f;
            if (f14 == 0.0f) {
                if (n.M(1) == 0) {
                    q12 = -q12;
                }
                K3 = q12 / 2.0f;
                if (n.M(1) == 0) {
                    q11 = -q11;
                }
                K4 = q11 / 2.0f;
            } else {
                K3 = n.K(q12) - (q12 / 2.0f);
                K4 = n.K(q11) - (q11 / 2.0f);
            }
            float f15 = K3;
            K2 = f14;
            f13 = K4;
            f12 = f15;
        } else {
            float f16 = n.M(1) == 0 ? (-q12) / 2.0f : q12 / 2.0f;
            if (f16 == 0.0f) {
                if (n.M(1) == 0) {
                    q11 = -q11;
                }
                K = q11 / 2.0f;
                K2 = n.M(1) == 0 ? (-q13) / 2.0f : q13 / 2.0f;
            } else {
                K = n.K(q11) - (q11 / 2.0f);
                K2 = n.K(q13) - (q13 / 2.0f);
            }
            float f17 = K;
            f12 = f16;
            f13 = f17;
        }
        vector3.f12537x = f13;
        vector3.f12538y = f12;
        vector3.f12539z = K2;
    }

    public i() {
    }
}
