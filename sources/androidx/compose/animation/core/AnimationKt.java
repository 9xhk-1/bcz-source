package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.z;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    @k
    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(@k FloatDecayAnimationSpec floatDecayAnimationSpec, float f11, float f12) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(z.f67060a), Float.valueOf(f11), AnimationVectorsKt.AnimationVector(f12));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f11, float f12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f11, f12);
    }

    @k
    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(@k AnimationSpec<T> animationSpec, @k TwoWayConverter<T, V> twoWayConverter, T t11, T t12, T t13) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t11, t12, twoWayConverter.getConvertToVector().invoke(t13));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @k
    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, @k V v11, @k V v12, @k V v13) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$1
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // x00.l
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }, new l<V, V>() { // from class: androidx.compose.animation.core.AnimationKt$createAnimation$2
            /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
            @Override // x00.l
            public final AnimationVector invoke(AnimationVector animationVector) {
                return animationVector;
            }
        }), v11, v12, v13);
    }

    public static final long getDurationMillis(@k Animation<?, ?> animation) {
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(@k Animation<T, V> animation, long j11) {
        return animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j11));
    }
}
