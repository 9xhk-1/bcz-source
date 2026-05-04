package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.z;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class VectorConvertersKt {

    @k
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(new l<Float, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final AnimationVector1D invoke(float f11) {
            return new AnimationVector1D(f11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f11) {
            return invoke(f11.floatValue());
        }
    }, new l<AnimationVector1D, Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // x00.l
        public final Float invoke(AnimationVector1D animationVector1D) {
            return Float.valueOf(animationVector1D.getValue());
        }
    });

    @k
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(new l<Integer, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final AnimationVector1D invoke(int i11) {
            return new AnimationVector1D(i11);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Integer num) {
            return invoke(num.intValue());
        }
    }, new l<AnimationVector1D, Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // x00.l
        public final Integer invoke(AnimationVector1D animationVector1D) {
            return Integer.valueOf((int) animationVector1D.getValue());
        }
    });

    @k
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(new l<Dp, AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector1D invoke(Dp dp2) {
            return m187invoke0680j_4(dp2.m5129unboximpl());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final AnimationVector1D m187invoke0680j_4(float f11) {
            return new AnimationVector1D(f11);
        }
    }, new l<AnimationVector1D, Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ Dp invoke(AnimationVector1D animationVector1D) {
            return Dp.m5113boximpl(m188invokeu2uoSUM(animationVector1D));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m188invokeu2uoSUM(AnimationVector1D animationVector1D) {
            return Dp.m5115constructorimpl(animationVector1D.getValue());
        }
    });

    @k
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(new l<DpOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
            return m185invokejoFl9I(dpOffset.m5184unboximpl());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final AnimationVector2D m185invokejoFl9I(long j11) {
            return new AnimationVector2D(DpOffset.m5176getXD9Ej5fM(j11), DpOffset.m5178getYD9Ej5fM(j11));
        }
    }, new l<AnimationVector2D, DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
            return DpOffset.m5170boximpl(m186invokegVRvYmI(animationVector2D));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m186invokegVRvYmI(AnimationVector2D animationVector2D) {
            float m5115constructorimpl = Dp.m5115constructorimpl(animationVector2D.getV1());
            float m5115constructorimpl2 = Dp.m5115constructorimpl(animationVector2D.getV2());
            return DpOffset.m5171constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L));
        }
    });

    @k
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(new l<Size, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Size size) {
            return m195invokeuvyYCjk(size.m2342unboximpl());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final AnimationVector2D m195invokeuvyYCjk(long j11) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }, new l<AnimationVector2D, Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ Size invoke(AnimationVector2D animationVector2D) {
            return Size.m2325boximpl(m196invoke7Ah8Wj8(animationVector2D));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m196invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Size.m2328constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });

    @k
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(new l<Offset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
            return m193invokek4lQ0M(offset.m2278unboximpl());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final AnimationVector2D m193invokek4lQ0M(long j11) {
            return new AnimationVector2D(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
    }, new l<AnimationVector2D, Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
            return Offset.m2257boximpl(m194invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m194invoketuRUvjQ(AnimationVector2D animationVector2D) {
            float v12 = animationVector2D.getV1();
            float v22 = animationVector2D.getV2();
            return Offset.m2260constructorimpl((Float.floatToRawIntBits(v12) << 32) | (Float.floatToRawIntBits(v22) & 4294967295L));
        }
    });

    @k
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(new l<IntOffset, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
            return m189invokegyyYBs(intOffset.m5252unboximpl());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final AnimationVector2D m189invokegyyYBs(long j11) {
            return new AnimationVector2D(IntOffset.m5243getXimpl(j11), IntOffset.m5244getYimpl(j11));
        }
    }, new l<AnimationVector2D, IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
            return IntOffset.m5234boximpl(m190invokeBjo55l4(animationVector2D));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m190invokeBjo55l4(AnimationVector2D animationVector2D) {
            return IntOffset.m5237constructorimpl((Math.round(animationVector2D.getV1()) << 32) | (Math.round(animationVector2D.getV2()) & 4294967295L));
        }
    });

    @k
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(new l<IntSize, AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntSize intSize) {
            return m191invokeozmzZPI(intSize.m5290unboximpl());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final AnimationVector2D m191invokeozmzZPI(long j11) {
            return new AnimationVector2D((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
    }, new l<AnimationVector2D, IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
            return IntSize.m5278boximpl(m192invokeYEO4UFw(animationVector2D));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m192invokeYEO4UFw(AnimationVector2D animationVector2D) {
            int round = Math.round(animationVector2D.getV1());
            if (round < 0) {
                round = 0;
            }
            return IntSize.m5281constructorimpl(((Math.round(animationVector2D.getV2()) >= 0 ? r7 : 0) & 4294967295L) | (round << 32));
        }
    });

    @k
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(new l<Rect, AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // x00.l
        public final AnimationVector4D invoke(Rect rect) {
            return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new l<AnimationVector4D, Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // x00.l
        public final Rect invoke(AnimationVector4D animationVector4D) {
            return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    @k
    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@k l<? super T, ? extends V> lVar, @k l<? super V, ? extends T> lVar2) {
        return new TwoWayConverterImpl(lVar, lVar2);
    }

    @k
    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@k z zVar) {
        return FloatToVector;
    }

    public static final float lerp(float f11, float f12, float f13) {
        return (f11 * (1 - f13)) + (f12 * f13);
    }

    @k
    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@k e0 e0Var) {
        return IntToVector;
    }

    @k
    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@k Rect.Companion companion) {
        return RectToVector;
    }

    @k
    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(@k Dp.Companion companion) {
        return DpToVector;
    }

    @k
    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@k DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    @k
    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@k Size.Companion companion) {
        return SizeToVector;
    }

    @k
    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@k Offset.Companion companion) {
        return OffsetToVector;
    }

    @k
    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@k IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    @k
    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@k IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
