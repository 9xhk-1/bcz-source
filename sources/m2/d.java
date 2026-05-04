package m2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends b {
    public static void d(l2.k kVar, float f11, float f12, int i11) {
        float f13 = f11 * 2.0f;
        if (f12 < f13) {
            throw new GdxRuntimeException("Height must be at least twice the radius");
        }
        float f14 = f12 - f13;
        f.f(kVar, f13, f14, f13, i11, 0.0f, 360.0f, false);
        Matrix4 matrix4 = b.f71788w;
        k.g(kVar, matrix4.setToTranslation(0.0f, 0.5f * f14, 0.0f), f13, f13, f13, i11, i11, 0.0f, 360.0f, 0.0f, 90.0f);
        k.g(kVar, matrix4.setToTranslation(0.0f, f14 * (-0.5f), 0.0f), f13, f13, f13, i11, i11, 0.0f, 360.0f, 90.0f, 180.0f);
    }
}
