package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21 = 0.0f;
        int i12 = 0;
        float f22 = 0.0f;
        while (true) {
            float f23 = 1.0f;
            if (i12 >= i11) {
                fArr2[i11] = 1.0f;
                fArr[i11] = 1.0f;
                return;
            }
            float f24 = i12 / i11;
            float f25 = 1.0f;
            while (true) {
                f11 = ((f25 - f21) / 2.0f) + f21;
                f12 = f23 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f26 = (((f12 * P1) + (f11 * P2)) * f13) + f14;
                f15 = f23;
                if (Math.abs(f26 - f24) < 1.0E-5d) {
                    break;
                }
                if (f26 > f24) {
                    f25 = f11;
                } else {
                    f21 = f11;
                }
                f23 = f15;
            }
            float f27 = 0.5f;
            fArr[i12] = (f13 * ((f12 * 0.5f) + f11)) + f14;
            float f28 = f15;
            while (true) {
                f16 = ((f28 - f22) / 2.0f) + f22;
                f17 = f15 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f29 = (((f17 * f27) + f16) * f18) + f19;
                float f31 = f24;
                if (Math.abs(f29 - f24) >= 1.0E-5d) {
                    if (f29 > f31) {
                        f28 = f16;
                    } else {
                        f22 = f16;
                    }
                    f24 = f31;
                    f27 = 0.5f;
                }
            }
            fArr2[i12] = (f18 * ((f17 * P1) + (f16 * P2))) + f19;
            i12++;
        }
    }

    @k
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@k Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
