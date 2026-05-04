package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n65#2,10:134\n65#2,10:144\n65#2,10:154\n65#2,10:164\n65#2,10:174\n65#2,10:187\n65#2,10:197\n65#2,10:207\n65#2,10:217\n65#2,10:227\n65#2,10:237\n65#2,10:247\n65#2,10:257\n53#3,3:184\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n39#1:134,10\n40#1:144,10\n41#1:154,10\n58#1:164,10\n59#1:174,10\n70#1:187,10\n71#1:197,10\n98#1:207,10\n99#1:217,10\n100#1:227,10\n119#1:237,10\n120#1:247,10\n121#1:257,10\n66#1:184,3\n*E\n"})
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public Lab(@m80.k String str, int i11) {
        super(str, ColorModel.Companion.m2922getLabxdoWZVw(), i11, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] fromXyz(@m80.k float[] fArr) {
        float f11 = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f12 = f11 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f13 = fArr[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f14 = fArr[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float cbrt = f12 > A ? (float) Math.cbrt(f12) : (f12 * B) + C;
        float cbrt2 = f13 > A ? (float) Math.cbrt(f13) : (f13 * B) + C;
        float cbrt3 = f14 > A ? (float) Math.cbrt(f14) : (f14 * B) + C;
        float f15 = (116.0f * cbrt2) - 16.0f;
        float f16 = (cbrt - cbrt2) * 500.0f;
        float f17 = (cbrt2 - cbrt3) * 200.0f;
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > 100.0f) {
            f15 = 100.0f;
        }
        fArr[0] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        if (f16 > 128.0f) {
            f16 = 128.0f;
        }
        fArr[1] = f16;
        if (f17 < -128.0f) {
            f17 = -128.0f;
        }
        fArr[2] = f17 <= 128.0f ? f17 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i11) {
        return i11 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i11) {
        return i11 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f11, float f12, float f13) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f14 = (f11 + 16.0f) / 116.0f;
        float f15 = (f12 * 0.002f) + f14;
        float f16 = f15 > D ? f15 * f15 * f15 : (f15 - C) * 0.12841855f;
        float f17 = f14 > D ? f14 * f14 * f14 : (f14 - C) * 0.12841855f;
        float f18 = f16 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f17 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] toXyz(@m80.k float[] fArr) {
        float f11 = fArr[0];
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        fArr[0] = f11;
        float f12 = fArr[1];
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        fArr[1] = f12;
        float f13 = fArr[2];
        float f14 = f13 >= -128.0f ? f13 : -128.0f;
        float f15 = f14 <= 128.0f ? f14 : 128.0f;
        fArr[2] = f15;
        float f16 = (f11 + 16.0f) / 116.0f;
        float f17 = (f12 * 0.002f) + f16;
        float f18 = f16 - (f15 * 0.005f);
        float f19 = f17 > D ? f17 * f17 * f17 : (f17 - C) * 0.12841855f;
        float f21 = f16 > D ? f16 * f16 * f16 : (f16 - C) * 0.12841855f;
        float f22 = f18 > D ? f18 * f18 * f18 : (f18 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f19 * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f21 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f22 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f11, float f12, float f13) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        if (f13 < -128.0f) {
            f13 = -128.0f;
        }
        if (f13 > 128.0f) {
            f13 = 128.0f;
        }
        float f14 = ((f11 + 16.0f) / 116.0f) - (f13 * 0.005f);
        return (f14 > D ? f14 * f14 * f14 : 0.12841855f * (f14 - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2926xyzaToColorJlNiLsg$ui_graphics_release(float f11, float f12, float f13, float f14, @m80.k ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f15 = f11 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f16 = f12 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f17 = f13 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float cbrt = f15 > A ? (float) Math.cbrt(f15) : (f15 * B) + C;
        float cbrt2 = f16 > A ? (float) Math.cbrt(f16) : (f16 * B) + C;
        float f18 = (116.0f * cbrt2) - 16.0f;
        float f19 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f17 > A ? (float) Math.cbrt(f17) : (f17 * B) + C)) * 200.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        if (f18 > 100.0f) {
            f18 = 100.0f;
        }
        if (f19 < -128.0f) {
            f19 = -128.0f;
        }
        if (f19 > 128.0f) {
            f19 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        return ColorKt.Color(f18, f19, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f14, colorSpace);
    }
}
