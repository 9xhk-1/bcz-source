package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import kotlin.jvm.internal.z;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(@k DecayAnimationSpec<T> decayAnimationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, T t12) {
        return twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue(twoWayConverter.getConvertToVector().invoke(t11), twoWayConverter.getConvertToVector().invoke(t12)));
    }

    @k
    public static final <T> DecayAnimationSpec<T> exponentialDecay(@FloatRange(from = 0.0d, fromInclusive = false) float f11, @FloatRange(from = 0.0d, fromInclusive = false) float f12) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f11, f12));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.1f;
        }
        return exponentialDecay(f11, f12);
    }

    @k
    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(@k FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(@k DecayAnimationSpec<Float> decayAnimationSpec, float f11, float f12) {
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(z.f67060a)).getTargetValue(AnimationVectorsKt.AnimationVector(f11), AnimationVectorsKt.AnimationVector(f12))).getValue();
    }
}
