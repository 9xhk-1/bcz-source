package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@DrawScopeMarker
@u0({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1008:1\n30#2:1009\n30#2:1011\n80#3:1010\n80#3:1012\n60#3:1014\n70#3:1018\n53#3,3:1021\n57#4:1013\n61#4:1017\n22#5:1015\n65#6:1016\n69#6:1019\n33#7:1020\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n*L\n521#1:1009\n558#1:1011\n521#1:1010\n558#1:1012\n920#1:1014\n920#1:1018\n920#1:1021,3\n920#1:1013\n920#1:1017\n920#1:1015\n920#1:1016\n920#1:1019\n920#1:1020\n*E\n"})
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m2451getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m2608getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m3062getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m3063getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m3069drawImageAZ2fEMs(@k DrawScope drawScope, @k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11, int i12) {
            DrawScope.super.mo2962drawImageAZ2fEMs(imageBitmap, j11, j12, j13, j14, f11, drawStyle, colorFilter, i11, i12);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3084getCenterF1C5BW0(@k DrawScope drawScope) {
            return DrawScope.super.mo3059getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m3085getSizeNHjbRc(@k DrawScope drawScope) {
            return DrawScope.super.mo3060getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m3086recordJVtK1S4(@k DrawScope drawScope, @k GraphicsLayer graphicsLayer, long j11, @k x00.l<? super DrawScope, g2> lVar) {
            DrawScope.super.mo3061recordJVtK1S4(graphicsLayer, j11, lVar);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3088roundToPxR2X_6o(@k DrawScope drawScope, long j11) {
            return DrawScope.super.mo370roundToPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3089roundToPx0680j_4(@k DrawScope drawScope, float f11) {
            return DrawScope.super.mo371roundToPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3090toDpGaN1DYA(@k DrawScope drawScope, long j11) {
            return DrawScope.super.mo372toDpGaN1DYA(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3091toDpu2uoSUM(@k DrawScope drawScope, float f11) {
            return DrawScope.super.mo373toDpu2uoSUM(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3093toDpSizekrfVVM(@k DrawScope drawScope, long j11) {
            return DrawScope.super.mo375toDpSizekrfVVM(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3094toPxR2X_6o(@k DrawScope drawScope, long j11) {
            return DrawScope.super.mo376toPxR2X_6o(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3095toPx0680j_4(@k DrawScope drawScope, float f11) {
            return DrawScope.super.mo377toPx0680j_4(f11);
        }

        @Stable
        @Deprecated
        @k
        public static Rect toRect(@k DrawScope drawScope, @k DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3096toSizeXkaWNTQ(@k DrawScope drawScope, long j11) {
            return DrawScope.super.mo378toSizeXkaWNTQ(j11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3097toSp0xMU5do(@k DrawScope drawScope, float f11) {
            return DrawScope.super.mo379toSp0xMU5do(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3098toSpkPz2Gy4(@k DrawScope drawScope, float f11) {
            return DrawScope.super.mo380toSpkPz2Gy4(f11);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3092toDpu2uoSUM(@k DrawScope drawScope, int i11) {
            return DrawScope.super.mo374toDpu2uoSUM(i11);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3099toSpkPz2Gy4(@k DrawScope drawScope, int i11) {
            return DrawScope.super.mo381toSpkPz2Gy4(i11);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m3038drawArcillE91I$default(DrawScope drawScope, Brush brush, float f11, float f12, boolean z11, long j11, long j12, float f13, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        DrawScope drawScope2;
        long j13;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long m2284getZeroF1C5BW0 = (i12 & 16) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11;
        if ((i12 & 32) != 0) {
            drawScope2 = drawScope;
            j13 = drawScope2.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j13 = j12;
        }
        drawScope2.mo2957drawArcillE91I(brush, f11, f12, z11, m2284getZeroF1C5BW0, j13, (i12 & 64) != 0 ? 1.0f : f13, (i12 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 256) != 0 ? null : colorFilter, (i12 & 512) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m3039drawArcyD3GUKo$default(DrawScope drawScope, long j11, float f11, float f12, boolean z11, long j12, long j13, float f13, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        DrawScope drawScope2;
        long j14;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long m2284getZeroF1C5BW0 = (i12 & 16) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12;
        if ((i12 & 32) != 0) {
            drawScope2 = drawScope;
            j14 = drawScope2.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j14 = j13;
        }
        drawScope2.mo2958drawArcyD3GUKo(j11, f11, f12, z11, m2284getZeroF1C5BW0, j14, (i12 & 64) != 0 ? 1.0f : f13, (i12 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 256) != 0 ? null : colorFilter, (i12 & 512) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m3040drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f11, long j11, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo2959drawCircleV9BoPsw(brush, (i12 & 2) != 0 ? Size.m2336getMinDimensionimpl(drawScope.mo3060getSizeNHjbRc()) / 2.0f : f11, (i12 & 4) != 0 ? drawScope.mo3059getCenterF1C5BW0() : j11, (i12 & 8) != 0 ? 1.0f : f12, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m3041drawCircleVaOC9Bg$default(DrawScope drawScope, long j11, float f11, long j12, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i12 & 2) != 0) {
            f11 = Size.m2336getMinDimensionimpl(drawScope.mo3060getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo2960drawCircleVaOC9Bg(j11, f11, (i12 & 4) != 0 ? drawScope.mo3059getCenterF1C5BW0() : j12, (i12 & 8) != 0 ? 1.0f : f12, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m3042drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long m5254getZeronOccac = (i12 & 2) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j11;
        long m5281constructorimpl = (i12 & 4) != 0 ? IntSize.m5281constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j12;
        drawScope.mo2961drawImage9jGpkUE(imageBitmap, m5254getZeronOccac, m5281constructorimpl, (i12 & 8) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j13, (i12 & 16) != 0 ? m5281constructorimpl : j14, (i12 & 32) != 0 ? 1.0f : f11, (i12 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m3043drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long m5254getZeronOccac = (i13 & 2) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j11;
        long m5281constructorimpl = (i13 & 4) != 0 ? IntSize.m5281constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j12;
        drawScope.mo2962drawImageAZ2fEMs(imageBitmap, m5254getZeronOccac, m5281constructorimpl, (i13 & 8) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j13, (i13 & 16) != 0 ? m5281constructorimpl : j14, (i13 & 32) != 0 ? 1.0f : f11, (i13 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11, (i13 & 512) != 0 ? Companion.m3063getDefaultFilterQualityfv9h1I() : i12);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m3044drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo2963drawImagegbVJVH8(imageBitmap, (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11, (i12 & 4) != 0 ? 1.0f : f11, (i12 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 16) != 0 ? null : colorFilter, (i12 & 32) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m3045drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j11, long j12, float f11, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo2964drawLine1RTmtNc(brush, j11, j12, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? Stroke.Companion.m3131getDefaultCapKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f12, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m3046drawLineNGM6Ib0$default(DrawScope drawScope, long j11, long j12, long j13, float f11, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo2965drawLineNGM6Ib0(j11, j12, j13, (i13 & 8) != 0 ? 0.0f : f11, (i13 & 16) != 0 ? Stroke.Companion.m3131getDefaultCapKaPHkGw() : i11, (i13 & 32) != 0 ? null : pathEffect, (i13 & 64) != 0 ? 1.0f : f12, (i13 & 128) != 0 ? null : colorFilter, (i13 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i12);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m3047drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j11, long j12, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11;
        drawScope.mo2966drawOvalAsUm42w(brush, m2284getZeroF1C5BW0, (i12 & 4) != 0 ? drawScope.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0) : j12, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m3048drawOvalnJ9OG0$default(DrawScope drawScope, long j11, long j12, long j13, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12;
        drawScope.mo2967drawOvalnJ9OG0(j11, m2284getZeroF1C5BW0, (i12 & 4) != 0 ? drawScope.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0) : j13, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m3049drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i12 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i12 & 32) != 0) {
            i11 = Companion.m3062getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo2968drawPathGBMwjPU(path, brush, f12, drawStyle2, colorFilter2, i11);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m3050drawPathLG529CI$default(DrawScope drawScope, Path path, long j11, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i12 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo2969drawPathLG529CI(path, j11, f12, drawStyle2, colorFilter, (i12 & 32) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m3051drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i11, long j11, float f11, int i12, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo2970drawPointsF8ZwMP8(list, i11, j11, (i14 & 8) != 0 ? 0.0f : f11, (i14 & 16) != 0 ? StrokeCap.Companion.m2862getButtKaPHkGw() : i12, (i14 & 32) != 0 ? null : pathEffect, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? null : colorFilter, (i14 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i13);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m3052drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i11, Brush brush, float f11, int i12, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo2971drawPointsGsft0Ws(list, i11, brush, (i14 & 8) != 0 ? 0.0f : f11, (i14 & 16) != 0 ? StrokeCap.Companion.m2862getButtKaPHkGw() : i12, (i14 & 32) != 0 ? null : pathEffect, (i14 & 64) != 0 ? 1.0f : f12, (i14 & 128) != 0 ? null : colorFilter, (i14 & 256) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i13);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m3053drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j11, long j12, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11;
        drawScope.mo2972drawRectAsUm42w(brush, m2284getZeroF1C5BW0, (i12 & 4) != 0 ? drawScope.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0) : j12, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m3054drawRectnJ9OG0$default(DrawScope drawScope, long j11, long j12, long j13, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12;
        drawScope.mo2973drawRectnJ9OG0(j11, m2284getZeroF1C5BW0, (i12 & 4) != 0 ? drawScope.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0) : j13, (i12 & 8) != 0 ? 1.0f : f11, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? null : colorFilter, (i12 & 64) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m3055drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j11, long j12, long j13, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j11;
        drawScope.mo2974drawRoundRectZuiqVtQ(brush, m2284getZeroF1C5BW0, (i12 & 4) != 0 ? drawScope.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0) : j12, (i12 & 8) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j13, (i12 & 16) != 0 ? 1.0f : f11, (i12 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 64) != 0 ? null : colorFilter, (i12 & 128) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m3056drawRoundRectuAw5IA$default(DrawScope drawScope, long j11, long j12, long j13, long j14, DrawStyle drawStyle, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        DrawScope drawScope2;
        long j15;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long m2284getZeroF1C5BW0 = (i12 & 2) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12;
        if ((i12 & 4) != 0) {
            drawScope2 = drawScope;
            j15 = drawScope2.m3057offsetSizePENXr5M(drawScope.mo3060getSizeNHjbRc(), m2284getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j15 = j13;
        }
        drawScope2.mo2975drawRoundRectuAw5IA(j11, m2284getZeroF1C5BW0, j15, (i12 & 8) != 0 ? CornerRadius.Companion.m2240getZerokKHJgLs() : j14, (i12 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i12 & 32) != 0 ? 1.0f : f11, (i12 & 64) != 0 ? null : colorFilter, (i12 & 128) != 0 ? Companion.m3062getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m3057offsetSizePENXr5M(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m3058recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j11, x00.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i11 & 1) != 0) {
            j11 = IntSizeKt.m5297toIntSizeuvyYCjk(drawScope.mo3060getSizeNHjbRc());
        }
        drawScope.mo3061recordJVtK1S4(graphicsLayer, j11, lVar);
    }

    /* renamed from: drawArc-illE91I */
    void mo2957drawArcillE91I(@k Brush brush, float f11, float f12, boolean z11, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawArc-yD3GUKo */
    void mo2958drawArcyD3GUKo(long j11, float f11, float f12, boolean z11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawCircle-V9BoPsw */
    void mo2959drawCircleV9BoPsw(@k Brush brush, float f11, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo2960drawCircleVaOC9Bg(long j11, float f11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    @n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @w0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo2961drawImage9jGpkUE(ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo2962drawImageAZ2fEMs(@k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11, int i12) {
        m3043drawImageAZ2fEMs$default(this, imageBitmap, j11, j12, j13, j14, f11, drawStyle, colorFilter, i11, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo2963drawImagegbVJVH8(@k ImageBitmap imageBitmap, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawLine-1RTmtNc */
    void mo2964drawLine1RTmtNc(@k Brush brush, long j11, long j12, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo2965drawLineNGM6Ib0(long j11, long j12, long j13, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12);

    /* renamed from: drawOval-AsUm42w */
    void mo2966drawOvalAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawOval-n-J9OG0 */
    void mo2967drawOvalnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawPath-GBMwjPU */
    void mo2968drawPathGBMwjPU(@k Path path, @k Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawPath-LG529CI */
    void mo2969drawPathLG529CI(@k Path path, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo2970drawPointsF8ZwMP8(@k List<Offset> list, int i11, long j11, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo2971drawPointsGsft0Ws(@k List<Offset> list, int i11, @k Brush brush, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13);

    /* renamed from: drawRect-AsUm42w */
    void mo2972drawRectAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawRect-n-J9OG0 */
    void mo2973drawRectnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo2974drawRoundRectZuiqVtQ(@k Brush brush, long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo2975drawRoundRectuAw5IA(long j11, long j12, long j13, long j14, @k DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f11, @l ColorFilter colorFilter, int i11);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo3059getCenterF1C5BW0() {
        return SizeKt.m2347getCenteruvyYCjk(getDrawContext().mo2981getSizeNHjbRc());
    }

    @k
    DrawContext getDrawContext();

    @k
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo3060getSizeNHjbRc() {
        return getDrawContext().mo2981getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo3061recordJVtK1S4(@k GraphicsLayer graphicsLayer, long j11, @k final x00.l<? super DrawScope, g2> lVar) {
        graphicsLayer.m3154recordmLhObY(this, getLayoutDirection(), j11, new x00.l<DrawScope, g2>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                DrawScope drawScope2 = DrawScope.this;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long mo2981getSizeNHjbRc = drawScope.getDrawContext().mo2981getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                x00.l<DrawScope, g2> lVar2 = lVar;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long mo2981getSizeNHjbRc2 = drawScope2.getDrawContext().mo2981getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    lVar2.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
