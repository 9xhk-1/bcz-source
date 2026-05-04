package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.ui.geometry.Offset;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {

    @k
    public static final AnimationDataConverter INSTANCE = new AnimationDataConverter();

    private AnimationDataConverter() {
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @k
    public l<AnimationVector4D, AnimationData> getConvertFromVector() {
        return new l<AnimationVector4D, AnimationData>() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertFromVector$1
            @Override // x00.l
            public final AnimationData invoke(AnimationVector4D animationVector4D) {
                float v12 = animationVector4D.getV1();
                float v22 = animationVector4D.getV2();
                float v32 = animationVector4D.getV3();
                return new AnimationData(v12, Offset.m2260constructorimpl((Float.floatToRawIntBits(v32) & 4294967295L) | (Float.floatToRawIntBits(v22) << 32)), animationVector4D.getV4(), null);
            }
        };
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    @k
    public l<AnimationData, AnimationVector4D> getConvertToVector() {
        return new l<AnimationData, AnimationVector4D>() { // from class: androidx.compose.foundation.gestures.AnimationDataConverter$convertToVector$1
            @Override // x00.l
            public final AnimationVector4D invoke(AnimationData animationData) {
                return new AnimationVector4D(animationData.getZoom(), Float.intBitsToFloat((int) (animationData.m403getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (animationData.m403getOffsetF1C5BW0() & 4294967295L)), animationData.getDegrees());
            }
        };
    }
}
