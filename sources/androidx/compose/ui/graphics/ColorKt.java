package androidx.compose.ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:988\n583#1:989\n583#1:990\n635#1:1006\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:710\n65#2,10:758\n65#2,10:806\n65#2,10:854\n65#2,10:978\n65#2,10:996\n33#3,5:700\n33#3,5:705\n33#3,5:991\n535#4,38:720\n535#4,38:768\n535#4,38:816\n535#4,38:864\n535#4,38:902\n535#4,38:940\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:988\n569#1:989\n570#1:990\n646#1:1006\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:710,10\n404#1:758,10\n405#1:806,10\n406#1:854,10\n537#1:978,10\n617#1:996,10\n394#1:700,5\n399#1:705,5\n607#1:991,5\n403#1:720,38\n404#1:768,38\n405#1:816,38\n441#1:864,38\n442#1:902,38\n443#1:940,38\n*E\n"})
/* loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018a  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, @m80.k androidx.compose.ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f11, float f12, float f13, float f14, ColorSpace colorSpace, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f14 = 1.0f;
        }
        if ((i11 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f11, f12, f13, f14, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, @m80.k androidx.compose.ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f11, float f12, float f13, float f14, ColorSpace colorSpace, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            f14 = 1.0f;
        }
        if ((i11 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f11, f12, f13, f14, colorSpace);
    }

    private static final float compositeComponent(float f11, float f12, float f13, float f14, float f15) {
        if (f15 == 0.0f) {
            return 0.0f;
        }
        return ((f11 * f13) + ((f12 * f14) * (1.0f - f13))) / f15;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m2554compositeOverOWjLjI(long j11, long j12) {
        long m2506convertvNxB06k = Color.m2506convertvNxB06k(j11, Color.m2513getColorSpaceimpl(j12));
        float m2511getAlphaimpl = Color.m2511getAlphaimpl(j12);
        float m2511getAlphaimpl2 = Color.m2511getAlphaimpl(m2506convertvNxB06k);
        float f11 = 1.0f - m2511getAlphaimpl2;
        float f12 = (m2511getAlphaimpl * f11) + m2511getAlphaimpl2;
        return UncheckedColor(f12 == 0.0f ? 0.0f : ((Color.m2515getRedimpl(m2506convertvNxB06k) * m2511getAlphaimpl2) + ((Color.m2515getRedimpl(j12) * m2511getAlphaimpl) * f11)) / f12, f12 == 0.0f ? 0.0f : ((Color.m2514getGreenimpl(m2506convertvNxB06k) * m2511getAlphaimpl2) + ((Color.m2514getGreenimpl(j12) * m2511getAlphaimpl) * f11)) / f12, f12 != 0.0f ? ((Color.m2512getBlueimpl(m2506convertvNxB06k) * m2511getAlphaimpl2) + ((Color.m2512getBlueimpl(j12) * m2511getAlphaimpl) * f11)) / f12 : 0.0f, f12, Color.m2513getColorSpaceimpl(j12));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m2555getComponents8_81llA(long j11) {
        return new float[]{Color.m2515getRedimpl(j11), Color.m2514getGreenimpl(j11), Color.m2512getBlueimpl(j11), Color.m2511getAlphaimpl(j11)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m2556isSpecified8_81llA(long j11) {
        return j11 != 16;
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m2558isUnspecified8_81llA(long j11) {
        return j11 == 16;
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m2560lerpjxsXWHM(long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m2506convertvNxB06k = Color.m2506convertvNxB06k(j11, oklab);
        long m2506convertvNxB06k2 = Color.m2506convertvNxB06k(j12, oklab);
        float m2511getAlphaimpl = Color.m2511getAlphaimpl(m2506convertvNxB06k);
        float m2515getRedimpl = Color.m2515getRedimpl(m2506convertvNxB06k);
        float m2514getGreenimpl = Color.m2514getGreenimpl(m2506convertvNxB06k);
        float m2512getBlueimpl = Color.m2512getBlueimpl(m2506convertvNxB06k);
        float m2511getAlphaimpl2 = Color.m2511getAlphaimpl(m2506convertvNxB06k2);
        float m2515getRedimpl2 = Color.m2515getRedimpl(m2506convertvNxB06k2);
        float m2514getGreenimpl2 = Color.m2514getGreenimpl(m2506convertvNxB06k2);
        float m2512getBlueimpl2 = Color.m2512getBlueimpl(m2506convertvNxB06k2);
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        return Color.m2506convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m2515getRedimpl, m2515getRedimpl2, f11), MathHelpersKt.lerp(m2514getGreenimpl, m2514getGreenimpl2, f11), MathHelpersKt.lerp(m2512getBlueimpl, m2512getBlueimpl2, f11), MathHelpersKt.lerp(m2511getAlphaimpl, m2511getAlphaimpl2, f11), oklab), Color.m2513getColorSpaceimpl(j12));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m2561luminance8_81llA(long j11) {
        ColorSpace m2513getColorSpaceimpl = Color.m2513getColorSpaceimpl(j11);
        if (!ColorModel.m2916equalsimpl0(m2513getColorSpaceimpl.m2925getModelxdoWZVw(), ColorModel.Companion.m2923getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2919toStringimpl(m2513getColorSpaceimpl.m2925getModelxdoWZVw())));
        }
        kotlin.jvm.internal.g0.n(m2513getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) m2513getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        float invoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m2515getRedimpl(j11)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m2514getGreenimpl(j11)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m2512getBlueimpl(j11)) * 0.0722d));
        if (invoke < 0.0f) {
            invoke = 0.0f;
        }
        if (invoke > 1.0f) {
            return 1.0f;
        }
        return invoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m2562takeOrElseDxMtmZc(long j11, @m80.k x00.a<Color> aVar) {
        return j11 != 16 ? j11 : aVar.invoke().m2519unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m2563toArgb8_81llA(long j11) {
        return (int) yz.w1.i(Color.m2506convertvNxB06k(j11, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = 255;
        }
        return Color(i11, i12, i13, i14);
    }

    @yz.v0
    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    @Stable
    public static final long Color(@ColorInt int i11) {
        return Color.m2505constructorimpl(yz.w1.i(yz.w1.i(i11) << 32));
    }

    @Stable
    public static final long Color(long j11) {
        return Color.m2505constructorimpl(yz.w1.i(j11 << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @IntRange(from = 0, to = 255) int i13, @IntRange(from = 0, to = 255) int i14) {
        return Color(((i11 & 255) << 16) | ((i14 & 255) << 24) | ((i12 & 255) << 8) | (i13 & 255));
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2557isSpecified8_81llA$annotations(long j11) {
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2559isUnspecified8_81llA$annotations(long j11) {
    }
}
