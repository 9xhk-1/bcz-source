package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,74:1\n71#1:75\n71#1:86\n71#1:97\n71#1:108\n71#1:122\n71#1:133\n71#1:144\n71#1:155\n71#1:166\n65#2,10:76\n65#2,10:87\n65#2,10:98\n65#2,10:109\n65#2,10:123\n65#2,10:134\n65#2,10:145\n65#2,10:156\n65#2,10:167\n65#2,10:177\n53#3,3:119\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n38#1:75\n39#1:86\n40#1:97\n45#1:108\n49#1:122\n59#1:133\n63#1:144\n64#1:155\n65#1:166\n38#1:76,10\n39#1:87,10\n40#1:98,10\n45#1:109,10\n49#1:123,10\n59#1:134,10\n63#1:145,10\n64#1:156,10\n65#1:167,10\n71#1:177,10\n45#1:119,3\n*E\n"})
/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    public Xyz(@m80.k String str, int i11) {
        super(str, ColorModel.Companion.m2924getXyzxdoWZVw(), i11, null);
    }

    private final float clamp(float f11) {
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            return 2.0f;
        }
        return f11;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] fromXyz(@m80.k float[] fArr) {
        float f11 = fArr[0];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[0] = f11;
        float f12 = fArr[1];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        fArr[1] = f12;
        float f13 = fArr[2];
        float f14 = f13 >= -2.0f ? f13 : -2.0f;
        fArr[2] = f14 <= 2.0f ? f14 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i11) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i11) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f11, float f12, float f13) {
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12 <= 2.0f ? f12 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] toXyz(@m80.k float[] fArr) {
        float f11 = fArr[0];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[0] = f11;
        float f12 = fArr[1];
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        fArr[1] = f12;
        float f13 = fArr[2];
        float f14 = f13 >= -2.0f ? f13 : -2.0f;
        fArr[2] = f14 <= 2.0f ? f14 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f11, float f12, float f13) {
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            return 2.0f;
        }
        return f13;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2926xyzaToColorJlNiLsg$ui_graphics_release(float f11, float f12, float f13, float f14, @m80.k ColorSpace colorSpace) {
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            f12 = 2.0f;
        }
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        return ColorKt.Color(f11, f12, f13 <= 2.0f ? f13 : 2.0f, f14, colorSpace);
    }
}
