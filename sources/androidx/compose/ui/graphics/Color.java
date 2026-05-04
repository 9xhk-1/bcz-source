package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n+ 3 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,659:1\n360#2:660\n578#3,12:661\n590#3,17:674\n578#3,12:691\n590#3,17:704\n578#3,12:721\n590#3,17:734\n22#4:673\n22#4:703\n22#4:733\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n156#1:661,12\n156#1:674,17\n177#1:691,12\n177#1:704,17\n198#1:721,12\n198#1:734,17\n156#1:673\n177#1:703\n198#1:733\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,659:1\n33#2,5:660\n33#2,5:665\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color$Companion\n*L\n310#1:660,5\n343#1:665,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2533hslJlNiLsg$default(Companion companion, float f11, float f12, float f13, float f14, Rgb rgb, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                f14 = 1.0f;
            }
            float f15 = f14;
            if ((i11 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2548hslJlNiLsg(f11, f12, f13, f15, rgb);
        }

        private final float hslToRgbComponent(int i11, float f11, float f12, float f13) {
            float f14 = (i11 + (f11 / 30.0f)) % 12.0f;
            return f13 - ((f12 * Math.min(f13, 1.0f - f13)) * Math.max(-1.0f, Math.min(f14 - 3, Math.min(9 - f14, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2534hsvJlNiLsg$default(Companion companion, float f11, float f12, float f13, float f14, Rgb rgb, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                f14 = 1.0f;
            }
            float f15 = f14;
            if ((i11 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2549hsvJlNiLsg(f11, f12, f13, f15, rgb);
        }

        private final float hsvToRgbComponent(int i11, float f11, float f12, float f13) {
            float f14 = (i11 + (f11 / 60.0f)) % 6.0f;
            return f13 - ((f12 * f13) * Math.max(0.0f, Math.min(f14, Math.min(4 - f14, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m2535getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m2536getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m2537getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m2538getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m2539getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m2540getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m2541getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m2542getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m2543getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m2544getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m2545getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m2546getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m2547getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m2548hslJlNiLsg(float f11, float f12, float f13, float f14, @m80.k Rgb rgb) {
            if (!(0.0f <= f11 && f11 <= 360.0f && 0.0f <= f12 && f12 <= 1.0f && 0.0f <= f13 && f13 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f11 + org.junit.jupiter.api.j2.O + f12 + org.junit.jupiter.api.j2.O + f13 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f11, f12, f13), hslToRgbComponent(8, f11, f12, f13), hslToRgbComponent(4, f11, f12, f13), f14, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m2549hsvJlNiLsg(float f11, float f12, float f13, float f14, @m80.k Rgb rgb) {
            if (!(0.0f <= f11 && f11 <= 360.0f && 0.0f <= f12 && f12 <= 1.0f && 0.0f <= f13 && f13 <= 1.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + f11 + org.junit.jupiter.api.j2.O + f12 + org.junit.jupiter.api.j2.O + f13 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, f11, f12, f13), hsvToRgbComponent(3, f11, f12, f13), hsvToRgbComponent(1, f11, f12, f13), f14, rgb);
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2520getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2521getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2522getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2523getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2524getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2525getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2526getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2527getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2528getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2529getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2530getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2531getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2532getYellow0d7_KjU$annotations() {
        }
    }

    private /* synthetic */ Color(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m2499boximpl(long j11) {
        return new Color(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2500component1impl(long j11) {
        return m2515getRedimpl(j11);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2501component2impl(long j11) {
        return m2514getGreenimpl(j11);
    }

    @Stable
    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m2502component3impl(long j11) {
        return m2512getBlueimpl(j11);
    }

    @Stable
    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m2503component4impl(long j11) {
        return m2511getAlphaimpl(j11);
    }

    @Stable
    @m80.k
    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m2504component5impl(long j11) {
        return m2513getColorSpaceimpl(j11);
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m2506convertvNxB06k(long j11, @m80.k ColorSpace colorSpace) {
        return ColorSpaceKt.m2928connectYBCOT_4$default(m2513getColorSpaceimpl(j11), colorSpace, 0, 2, null).mo2931transformToColorl2rxGTc$ui_graphics_release(j11);
    }

    @Stable
    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m2507copywmQWz5c(long j11, float f11, float f12, float f13, float f14) {
        return ColorKt.Color(f12, f13, f14, f11, m2513getColorSpaceimpl(j11));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m2508copywmQWz5c$default(long j11, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = m2511getAlphaimpl(j11);
        }
        float f15 = f11;
        if ((i11 & 2) != 0) {
            f12 = m2515getRedimpl(j11);
        }
        float f16 = f12;
        if ((i11 & 4) != 0) {
            f13 = m2514getGreenimpl(j11);
        }
        float f17 = f13;
        if ((i11 & 8) != 0) {
            f14 = m2512getBlueimpl(j11);
        }
        return m2507copywmQWz5c(j11, f15, f16, f17, f14);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2509equalsimpl(long j11, Object obj) {
        return (obj instanceof Color) && j11 == ((Color) obj).m2519unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2510equalsimpl0(long j11, long j12) {
        return yz.w1.r(j11, j12);
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m2511getAlphaimpl(long j11) {
        float q11;
        float f11;
        if (yz.w1.i(63 & j11) == 0) {
            q11 = (float) yz.i2.q(yz.w1.i(yz.w1.i(j11 >>> 56) & 255));
            f11 = 255.0f;
        } else {
            q11 = (float) yz.i2.q(yz.w1.i(yz.w1.i(j11 >>> 6) & 1023));
            f11 = 1023.0f;
        }
        return q11 / f11;
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m2512getBlueimpl(long j11) {
        int i11;
        int i12;
        int i13;
        if (yz.w1.i(63 & j11) == 0) {
            return ((float) yz.i2.q(yz.w1.i(yz.w1.i(j11 >>> 32) & 255))) / 255.0f;
        }
        short i14 = (short) yz.w1.i(yz.w1.i(j11 >>> 16) & j60.g.f63638t);
        int i15 = 32768 & i14;
        int i16 = ((65535 & i14) >>> 10) & 31;
        int i17 = i14 & 1023;
        if (i16 != 0) {
            int i18 = i17 << 13;
            if (i16 == 31) {
                i11 = 255;
                if (i18 != 0) {
                    i18 |= 4194304;
                }
            } else {
                i11 = i16 + 112;
            }
            int i19 = i11;
            i12 = i18;
            i13 = i19;
        } else {
            if (i17 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i17 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i15 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i15 << 16) | i12);
    }

    @m80.k
    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m2513getColorSpaceimpl(long j11) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) yz.w1.i(j11 & 63)];
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m2514getGreenimpl(long j11) {
        int i11;
        int i12;
        int i13;
        if (yz.w1.i(63 & j11) == 0) {
            return ((float) yz.i2.q(yz.w1.i(yz.w1.i(j11 >>> 40) & 255))) / 255.0f;
        }
        short i14 = (short) yz.w1.i(yz.w1.i(j11 >>> 32) & j60.g.f63638t);
        int i15 = 32768 & i14;
        int i16 = ((65535 & i14) >>> 10) & 31;
        int i17 = i14 & 1023;
        if (i16 != 0) {
            int i18 = i17 << 13;
            if (i16 == 31) {
                i11 = 255;
                if (i18 != 0) {
                    i18 |= 4194304;
                }
            } else {
                i11 = i16 + 112;
            }
            int i19 = i11;
            i12 = i18;
            i13 = i19;
        } else {
            if (i17 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i17 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i15 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i15 << 16) | i12);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m2515getRedimpl(long j11) {
        int i11;
        int i12;
        int i13;
        if (yz.w1.i(63 & j11) == 0) {
            return ((float) yz.i2.q(yz.w1.i(yz.w1.i(j11 >>> 48) & 255))) / 255.0f;
        }
        short i14 = (short) yz.w1.i(yz.w1.i(j11 >>> 48) & j60.g.f63638t);
        int i15 = 32768 & i14;
        int i16 = ((65535 & i14) >>> 10) & 31;
        int i17 = i14 & 1023;
        if (i16 != 0) {
            int i18 = i17 << 13;
            if (i16 == 31) {
                i11 = 255;
                if (i18 != 0) {
                    i18 |= 4194304;
                }
            } else {
                i11 = i16 + 112;
            }
            int i19 = i11;
            i12 = i18;
            i13 = i19;
        } else {
            if (i17 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i17 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i15 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i15 << 16) | i12);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2516hashCodeimpl(long j11) {
        return yz.w1.x(j11);
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2517toStringimpl(long j11) {
        return "Color(" + m2515getRedimpl(j11) + org.junit.jupiter.api.j2.O + m2514getGreenimpl(j11) + org.junit.jupiter.api.j2.O + m2512getBlueimpl(j11) + org.junit.jupiter.api.j2.O + m2511getAlphaimpl(j11) + org.junit.jupiter.api.j2.O + m2513getColorSpaceimpl(j11).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m2509equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m2518getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m2516hashCodeimpl(this.value);
    }

    @m80.k
    public String toString() {
        return m2517toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2519unboximpl() {
        return this.value;
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2505constructorimpl(long j11) {
        return j11;
    }
}
