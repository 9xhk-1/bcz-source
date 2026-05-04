package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {

    @k
    private static final l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = new l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // x00.l
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.TwoWayConverter(new l<Color, AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // x00.l
                public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
                    return m74invoke8_81llA(color.m2519unboximpl());
                }

                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final AnimationVector4D m74invoke8_81llA(long j11) {
                    long m2506convertvNxB06k = Color.m2506convertvNxB06k(j11, ColorSpaces.INSTANCE.getOklab());
                    return new AnimationVector4D(Color.m2511getAlphaimpl(m2506convertvNxB06k), Color.m2515getRedimpl(m2506convertvNxB06k), Color.m2514getGreenimpl(m2506convertvNxB06k), Color.m2512getBlueimpl(m2506convertvNxB06k));
                }
            }, new l<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
                    return Color.m2499boximpl(m75invokevNxB06k(animationVector4D));
                }

                /* renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m75invokevNxB06k(AnimationVector4D animationVector4D) {
                    float v22 = animationVector4D.getV2();
                    if (v22 < 0.0f) {
                        v22 = 0.0f;
                    }
                    if (v22 > 1.0f) {
                        v22 = 1.0f;
                    }
                    float v32 = animationVector4D.getV3();
                    if (v32 < -0.5f) {
                        v32 = -0.5f;
                    }
                    if (v32 > 0.5f) {
                        v32 = 0.5f;
                    }
                    float v42 = animationVector4D.getV4();
                    float f11 = v42 >= -0.5f ? v42 : -0.5f;
                    float f12 = f11 <= 0.5f ? f11 : 0.5f;
                    float v12 = animationVector4D.getV1();
                    float f13 = v12 >= 0.0f ? v12 : 0.0f;
                    return Color.m2506convertvNxB06k(ColorKt.Color(v22, v32, f12, f13 <= 1.0f ? f13 : 1.0f, ColorSpaces.INSTANCE.getOklab()), ColorSpace.this);
                }
            });
        }
    };

    @k
    public static final l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(@k Color.Companion companion) {
        return ColorToVector;
    }
}
