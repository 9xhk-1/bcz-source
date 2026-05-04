package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n65#2,10:173\n65#2,10:183\n65#2,10:193\n65#2,10:203\n65#2,10:213\n65#2,10:223\n65#2,10:241\n65#2,10:251\n65#2,10:261\n638#3:233\n653#3:234\n668#3:235\n638#3:236\n653#3:237\n638#3:271\n653#3:272\n668#3:273\n668#3:274\n638#3:275\n653#3:276\n668#3:277\n638#3:278\n653#3:279\n668#3:280\n53#4,3:238\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n39#1:173,10\n40#1:183,10\n41#1:193,10\n53#1:203,10\n54#1:213,10\n55#1:223,10\n72#1:241,10\n73#1:251,10\n74#1:261,10\n57#1:233\n58#1:234\n59#1:235\n65#1:236\n66#1:237\n76#1:271\n77#1:272\n78#1:273\n84#1:274\n96#1:275\n97#1:276\n98#1:277\n104#1:278\n105#1:279\n106#1:280\n68#1:238,3\n*E\n"})
/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final float[] InverseM1;

    @m80.k
    private static final float[] InverseM2;

    @m80.k
    private static final float[] M1;

    @m80.k
    private static final float[] M2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(@m80.k String str, int i11) {
        super(str, ColorModel.Companion.m2922getLabxdoWZVw(), i11, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] fromXyz(@m80.k float[] fArr) {
        ColorSpaceKt.mul3x3Float3(M1, fArr);
        fArr[0] = MathHelpersKt.fastCbrt(fArr[0]);
        fArr[1] = MathHelpersKt.fastCbrt(fArr[1]);
        fArr[2] = MathHelpersKt.fastCbrt(fArr[2]);
        ColorSpaceKt.mul3x3Float3(M2, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i11) {
        return i11 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i11) {
        return i11 == 0 ? 0.0f : -0.5f;
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
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        float f14 = f13 <= 0.5f ? f13 : 0.5f;
        float[] fArr = InverseM2;
        float f15 = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f14);
        float f16 = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f14);
        float f17 = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f14);
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float f21 = f17 * f17 * f17;
        float[] fArr2 = InverseM1;
        return (Float.floatToRawIntBits(((fArr2[0] * f18) + (fArr2[3] * f19)) + (fArr2[6] * f21)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f18) + (fArr2[4] * f19) + (fArr2[7] * f21)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] toXyz(@m80.k float[] fArr) {
        float f11 = fArr[0];
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        fArr[0] = f11;
        float f12 = fArr[1];
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        fArr[1] = f12;
        float f13 = fArr[2];
        float f14 = f13 >= -0.5f ? f13 : -0.5f;
        fArr[2] = f14 <= 0.5f ? f14 : 0.5f;
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f15 = fArr[0];
        fArr[0] = f15 * f15 * f15;
        float f16 = fArr[1];
        fArr[1] = f16 * f16 * f16;
        float f17 = fArr[2];
        fArr[2] = f17 * f17 * f17;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f11, float f12, float f13) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        float f14 = f13 <= 0.5f ? f13 : 0.5f;
        float[] fArr = InverseM2;
        float f15 = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f14);
        float f16 = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f14);
        float f17 = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f14);
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = InverseM1;
        return (fArr2[2] * f18) + (fArr2[5] * f19) + (fArr2[8] * f17 * f17 * f17);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2926xyzaToColorJlNiLsg$ui_graphics_release(float f11, float f12, float f13, float f14, @m80.k ColorSpace colorSpace) {
        float[] fArr = M1;
        float f15 = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13);
        float f16 = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13);
        float f17 = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13);
        float fastCbrt = MathHelpersKt.fastCbrt(f15);
        float fastCbrt2 = MathHelpersKt.fastCbrt(f16);
        float fastCbrt3 = MathHelpersKt.fastCbrt(f17);
        float[] fArr2 = M2;
        return ColorKt.Color((fArr2[0] * fastCbrt) + (fArr2[3] * fastCbrt2) + (fArr2[6] * fastCbrt3), (fArr2[1] * fastCbrt) + (fArr2[4] * fastCbrt2) + (fArr2[7] * fastCbrt3), (fArr2[2] * fastCbrt) + (fArr2[5] * fastCbrt2) + (fArr2[8] * fastCbrt3), f14, colorSpace);
    }
}
