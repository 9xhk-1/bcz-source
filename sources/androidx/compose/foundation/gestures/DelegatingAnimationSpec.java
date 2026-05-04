package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.z;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {

    @k
    private final AnimationSpec<Offset> offsetAnimationSpec;

    @k
    private final AnimationSpec<Float> rotationAnimationSpec;

    @k
    private final AnimationSpec<Float> zoomAnimationSpec;

    public DelegatingAnimationSpec(@k AnimationSpec<Float> animationSpec, @k AnimationSpec<Offset> animationSpec2, @k AnimationSpec<Float> animationSpec3) {
        this.zoomAnimationSpec = animationSpec;
        this.offsetAnimationSpec = animationSpec2;
        this.rotationAnimationSpec = animationSpec3;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@k final TwoWayConverter<AnimationData, V> twoWayConverter) {
        AnimationSpec<Float> animationSpec = this.zoomAnimationSpec;
        z zVar = z.f67060a;
        final VectorizedAnimationSpec<V> vectorize = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(zVar));
        final VectorizedAnimationSpec<V> vectorize2 = this.offsetAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(Offset.Companion));
        final VectorizedAnimationSpec<V> vectorize3 = this.rotationAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(zVar));
        return new VectorizedFiniteAnimationSpec<V>() { // from class: androidx.compose.foundation.gestures.DelegatingAnimationSpec$vectorize$1
            private final AnimationVector1D degreesVector(AnimationData animationData) {
                return VectorConvertersKt.getVectorConverter(z.f67060a).getConvertToVector().invoke(Float.valueOf(animationData.getDegrees()));
            }

            private final AnimationVector2D offsetVector(AnimationData animationData) {
                l<Offset, AnimationVector2D> convertToVector = VectorConvertersKt.getVectorConverter(Offset.Companion).getConvertToVector();
                float intBitsToFloat = Float.intBitsToFloat((int) (animationData.m403getOffsetF1C5BW0() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (animationData.m403getOffsetF1C5BW0() & 4294967295L));
                return convertToVector.invoke(Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/animation/core/AnimationVector1D;Landroidx/compose/animation/core/AnimationVector2D;Landroidx/compose/animation/core/AnimationVector1D;)TV; */
            private final AnimationVector packToAnimationVector(AnimationVector1D animationVector1D, AnimationVector2D animationVector2D, AnimationVector1D animationVector1D2) {
                l<AnimationData, V> convertToVector = twoWayConverter.getConvertToVector();
                float value = animationVector1D.getValue();
                float v12 = animationVector2D.getV1();
                float v22 = animationVector2D.getV2();
                return (AnimationVector) convertToVector.invoke(new AnimationData(value, Offset.m2260constructorimpl((Float.floatToRawIntBits(v22) & 4294967295L) | (Float.floatToRawIntBits(v12) << 32)), animationVector1D2.getValue(), null));
            }

            private final AnimationVector1D zoomVector(AnimationData animationData) {
                return VectorConvertersKt.getVectorConverter(z.f67060a).getConvertToVector().invoke(Float.valueOf(animationData.getZoom()));
            }

            /* JADX WARN: Incorrect types in method signature: (TV;TV;TV;)J */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData invoke = twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData invoke2 = twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData invoke3 = twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return Math.max(vectorize.getDurationNanos(zoomVector(invoke), zoomVector(invoke2), zoomVector(invoke3)), Math.max(vectorize2.getDurationNanos(offsetVector(invoke), offsetVector(invoke2), offsetVector(invoke3)), vectorize3.getDurationNanos(degreesVector(invoke), degreesVector(invoke2), degreesVector(invoke3))));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getValueFromNanos(long j11, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData invoke = twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData invoke2 = twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData invoke3 = twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector(vectorize.getValueFromNanos(j11, zoomVector(invoke), zoomVector(invoke2), zoomVector(invoke3)), vectorize2.getValueFromNanos(j11, offsetVector(invoke), offsetVector(invoke2), offsetVector(invoke3)), vectorize3.getValueFromNanos(j11, degreesVector(invoke), degreesVector(invoke2), degreesVector(invoke3)));
            }

            /* JADX WARN: Incorrect return type in method signature: (JTV;TV;TV;)TV; */
            @Override // androidx.compose.animation.core.VectorizedAnimationSpec
            public AnimationVector getVelocityFromNanos(long j11, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
                AnimationData invoke = twoWayConverter.getConvertFromVector().invoke(animationVector);
                AnimationData invoke2 = twoWayConverter.getConvertFromVector().invoke(animationVector2);
                AnimationData invoke3 = twoWayConverter.getConvertFromVector().invoke(animationVector3);
                return packToAnimationVector(vectorize.getVelocityFromNanos(j11, zoomVector(invoke), zoomVector(invoke2), zoomVector(invoke3)), vectorize2.getVelocityFromNanos(j11, offsetVector(invoke), offsetVector(invoke2), offsetVector(invoke3)), vectorize3.getVelocityFromNanos(j11, degreesVector(invoke), degreesVector(invoke2), degreesVector(invoke3)));
            }
        };
    }
}
