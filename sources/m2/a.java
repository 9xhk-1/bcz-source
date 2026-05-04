package m2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends b {
    public static void d(l2.k kVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11) {
        Vector3 vector3 = b.c().set(f11, f12, f13);
        Vector3 vector32 = b.c().set(f14, f15, f16);
        float dst = vector3.dst(vector32);
        float f19 = dst * f17;
        float sqrt = ((float) (f19 * Math.sqrt(0.3333333432674408d))) * 2.0f;
        float f21 = dst - f19;
        float f22 = sqrt * f18;
        Vector3 nor = b.c().set(vector32).sub(vector3).nor();
        Vector3 crs = b.c().set(nor).crs(Vector3.Z);
        if (crs.isZero()) {
            crs.set(Vector3.X);
        }
        crs.crs(nor).nor();
        Vector3 nor2 = b.c().set(nor).crs(crs).nor();
        Vector3 nor3 = b.c().set(vector32).sub(vector3).nor();
        Matrix4 t02 = kVar.t0(b.b());
        Matrix4 b11 = b.b();
        float[] fArr = b11.val;
        fArr[0] = nor2.f12537x;
        fArr[4] = nor.f12537x;
        fArr[8] = crs.f12537x;
        fArr[1] = nor2.f12538y;
        fArr[5] = nor.f12538y;
        fArr[9] = crs.f12538y;
        fArr[2] = nor2.f12539z;
        fArr[6] = nor.f12539z;
        fArr[10] = crs.f12539z;
        Matrix4 b12 = b.b();
        b11.setTranslation(b.c().set(nor3).scl(f21 / 2.0f).add(f11, f12, f13));
        kVar.K0(b12.set(b11).mul(t02));
        f.d(kVar, f22, f21, f22, i11);
        b11.setTranslation(b.c().set(nor3).scl(f21).add(f11, f12, f13));
        kVar.K0(b12.set(b11).mul(t02));
        e.d(kVar, sqrt, f19, sqrt, i11);
        kVar.K0(t02);
        b.a();
    }
}
