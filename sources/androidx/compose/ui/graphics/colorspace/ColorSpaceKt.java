package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n326#2:718\n679#3:719\n1#4:720\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n401#1:718\n401#1:719\n401#1:720\n*E\n"})
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(rcpResponse(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    public static final double absResponse(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(response(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    @w00.k
    @m80.k
    public static final ColorSpace adapt(@m80.k ColorSpace colorSpace, @m80.k WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @m80.k
    public static final float[] chromaticAdaptation(@m80.k float[] fArr, @m80.k float[] fArr2, @m80.k float[] fArr3) {
        float[] mul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] mul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(@m80.k TransferParameters transferParameters, @m80.l TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    @m80.k
    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m2927connectYBCOT_4(@m80.k ColorSpace colorSpace, @m80.k ColorSpace colorSpace2, int i11) {
        int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
        int id$ui_graphics_release2 = colorSpace2.getId$ui_graphics_release();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m2929createConnectorYBCOT_4(colorSpace, colorSpace2, i11);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i12 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i11 << 12);
        Connector connector = connectors.get(i12);
        if (connector == null) {
            connector = m2929createConnectorYBCOT_4(colorSpace, colorSpace2, i11);
            connectors.set(i12, connector);
        }
        return connector;
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m2928connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i12 & 2) != 0) {
            i11 = RenderIntent.Companion.m2944getPerceptualuksYyKA();
        }
        return m2927connectYBCOT_4(colorSpace, colorSpace2, i11);
    }

    /* renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m2929createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i11) {
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace);
        }
        long m2925getModelxdoWZVw = colorSpace.m2925getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        kotlin.jvm.internal.v vVar = null;
        if (!ColorModel.m2916equalsimpl0(m2925getModelxdoWZVw, companion.m2923getRgbxdoWZVw()) || !ColorModel.m2916equalsimpl0(colorSpace2.m2925getModelxdoWZVw(), companion.m2923getRgbxdoWZVw())) {
            return new Connector(colorSpace, colorSpace2, i11, vVar);
        }
        g0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        g0.n(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i11, vVar);
    }

    @m80.k
    public static final float[] inverse3x3(@m80.k float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[6];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[7];
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f21 = (f15 * f19) - (f16 * f18);
        float f22 = (f16 * f17) - (f14 * f19);
        float f23 = (f14 * f18) - (f15 * f17);
        float f24 = (f11 * f21) + (f12 * f22) + (f13 * f23);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f21 / f24;
        fArr2[1] = f22 / f24;
        fArr2[2] = f23 / f24;
        fArr2[3] = ((f13 * f18) - (f12 * f19)) / f24;
        fArr2[4] = ((f19 * f11) - (f13 * f17)) / f24;
        fArr2[5] = ((f17 * f12) - (f18 * f11)) / f24;
        fArr2[6] = ((f12 * f16) - (f13 * f15)) / f24;
        fArr2[7] = ((f13 * f14) - (f16 * f11)) / f24;
        fArr2[8] = ((f11 * f15) - (f12 * f14)) / f24;
        return fArr2;
    }

    @m80.k
    public static final float[] mul3x3(@m80.k float[] fArr, @m80.k float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f11 = fArr[0] * fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        fArr3[0] = f11 + (f12 * f13) + (f14 * f15);
        float f16 = fArr[1];
        float f17 = fArr2[0];
        float f18 = fArr[4];
        float f19 = fArr[7];
        fArr3[1] = (f16 * f17) + (f13 * f18) + (f19 * f15);
        float f21 = fArr[2] * f17;
        float f22 = fArr[5];
        float f23 = f21 + (fArr2[1] * f22);
        float f24 = fArr[8];
        fArr3[2] = f23 + (f15 * f24);
        float f25 = fArr[0];
        float f26 = fArr2[3] * f25;
        float f27 = fArr2[4];
        float f28 = f26 + (f12 * f27);
        float f29 = fArr2[5];
        fArr3[3] = f28 + (f14 * f29);
        float f31 = fArr[1];
        float f32 = fArr2[3];
        fArr3[4] = (f31 * f32) + (f18 * f27) + (f19 * f29);
        float f33 = fArr[2];
        fArr3[5] = (f32 * f33) + (f22 * fArr2[4]) + (f29 * f24);
        float f34 = f25 * fArr2[6];
        float f35 = fArr[3];
        float f36 = fArr2[7];
        float f37 = f34 + (f35 * f36);
        float f38 = fArr2[8];
        fArr3[6] = f37 + (f14 * f38);
        float f39 = fArr2[6];
        fArr3[7] = (f31 * f39) + (fArr[4] * f36) + (f19 * f38);
        fArr3[8] = (f33 * f39) + (fArr[5] * fArr2[7]) + (f24 * f38);
        return fArr3;
    }

    @m80.k
    public static final float[] mul3x3Diag(@m80.k float[] fArr, @m80.k float[] fArr2) {
        float f11 = fArr[0];
        float f12 = fArr2[0] * f11;
        float f13 = fArr[1];
        float f14 = fArr2[1] * f13;
        float f15 = fArr[2];
        return new float[]{f12, f14, fArr2[2] * f15, fArr2[3] * f11, fArr2[4] * f13, fArr2[5] * f15, f11 * fArr2[6], f13 * fArr2[7], f15 * fArr2[8]};
    }

    @m80.k
    public static final float[] mul3x3Float3(@m80.k float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length < 9) {
            return fArr2;
        }
        if (fArr2.length < 3) {
            return fArr2;
        }
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[2];
        fArr2[0] = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13);
        fArr2[1] = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13);
        fArr2[2] = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13);
        return fArr2;
    }

    public static final float mul3x3Float3_0(@m80.k float[] fArr, float f11, float f12, float f13) {
        return (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13);
    }

    public static final float mul3x3Float3_1(@m80.k float[] fArr, float f11, float f12, float f13) {
        return (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13);
    }

    public static final float mul3x3Float3_2(@m80.k float[] fArr, float f11, float f12, float f13) {
        return (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13);
    }

    public static final double rcpResponse(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 * d14 ? (Math.pow(d11, 1.0d / d16) - d13) / d12 : d11 / d14;
    }

    public static final double response(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d16) : d14 * d11;
    }

    @w00.k
    @m80.k
    public static final ColorSpace adapt(@m80.k ColorSpace colorSpace, @m80.k WhitePoint whitePoint, @m80.k Adaptation adaptation) {
        if (ColorModel.m2916equalsimpl0(colorSpace.m2925getModelxdoWZVw(), ColorModel.Companion.m2923getRgbxdoWZVw())) {
            g0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 * d14 ? (Math.pow(d11 - d16, 1.0d / d18) - d13) / d12 : (d11 - d17) / d14;
    }

    public static final double response(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d18) + d16 : (d14 * d11) + d17;
    }

    public static final boolean compare(@m80.k WhitePoint whitePoint, @m80.k WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(@m80.k float[] fArr, @m80.k float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (Float.compare(fArr[i11], fArr2[i11]) != 0 && Math.abs(fArr[i11] - fArr2[i11]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
