package androidx.compose.ui.graphics.colorspace;

import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.Rgb;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1259:1\n638#2:1260\n653#2:1261\n668#2:1265\n638#2:1266\n653#2:1267\n668#2:1268\n53#3,3:1262\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n788#1:1260\n789#1:1261\n799#1:1265\n811#1:1266\n812#1:1267\n813#1:1268\n791#1:1262,3\n*E\n"})
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.i
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d11) {
            double DoubleIdentity$lambda$8;
            DoubleIdentity$lambda$8 = Rgb.DoubleIdentity$lambda$8(d11);
            return DoubleIdentity$lambda$8;
        }
    };

    @m80.k
    private final x00.l<Double, Double> eotf;

    @m80.k
    private final DoubleFunction eotfFunc;

    @m80.k
    private final DoubleFunction eotfOrig;

    @m80.k
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;

    @m80.k
    private final x00.l<Double, Double> oetf;

    @m80.k
    private final DoubleFunction oetfFunc;

    @m80.k
    private final DoubleFunction oetfOrig;

    @m80.k
    private final float[] primaries;

    @m80.l
    private final TransferParameters transferParameters;

    @m80.k
    private final float[] transform;

    @m80.k
    private final WhitePoint whitePoint;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1#1,1259:1\n977#1:1260\n977#1:1261\n977#1:1262\n977#1:1263\n977#1:1264\n977#1:1265\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb$Companion\n*L\n1050#1:1260\n1051#1:1261\n1057#1:1262\n1058#1:1263\n1063#1:1264\n1064#1:1265\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private final float area(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float f17 = ((((((f11 * f14) + (f12 * f15)) + (f13 * f16)) - (f14 * f15)) - (f12 * f13)) - (f11 * f16)) * 0.5f;
            return f17 < 0.0f ? -f17 : f17;
        }

        private final boolean compare(double d11, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d11) - doubleFunction2.invoke(d11)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f11 = mul3x3Float3[0];
            float f12 = mul3x3Float3[1];
            float f13 = f11 + f12 + mul3x3Float3[2];
            return new WhitePoint(f11 / f13, f12 / f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float x11 = whitePoint.getX();
            float y11 = whitePoint.getY();
            float f17 = 1;
            float f18 = (f17 - f11) / f12;
            float f19 = (f17 - f13) / f14;
            float f21 = (f17 - f15) / f16;
            float f22 = (f17 - x11) / y11;
            float f23 = f11 / f12;
            float f24 = (f13 / f14) - f23;
            float f25 = (x11 / y11) - f23;
            float f26 = f19 - f18;
            float f27 = (f15 / f16) - f23;
            float f28 = (((f22 - f18) * f24) - (f25 * f26)) / (((f21 - f18) * f24) - (f26 * f27));
            float f29 = (f25 - (f27 * f28)) / f24;
            float f31 = (1.0f - f29) - f28;
            float f32 = f31 / f12;
            float f33 = f29 / f14;
            float f34 = f28 / f16;
            return new float[]{f32 * f11, f31, f32 * ((1.0f - f11) - f12), f33 * f13, f29, f33 * ((1.0f - f13) - f14), f34 * f15, f28, f34 * ((1.0f - f15) - f16)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f11 = fArr[0];
            float f12 = fArr2[0];
            float f13 = fArr[1];
            float f14 = fArr2[1];
            float f15 = fArr[2];
            float f16 = fArr2[2];
            float f17 = fArr[3];
            float f18 = fArr2[3];
            float f19 = fArr[4];
            float f21 = fArr2[4];
            float f22 = fArr[5];
            float f23 = fArr2[5];
            float[] fArr3 = {f11 - f12, f13 - f14, f15 - f16, f17 - f18, f19 - f21, f22 - f23};
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            if (((f14 - f23) * f24) - ((f12 - f21) * f25) >= 0.0f && ((f12 - f16) * f25) - ((f14 - f18) * f24) >= 0.0f) {
                float f26 = fArr3[2];
                float f27 = fArr3[3];
                if (((f18 - f14) * f26) - ((f16 - f12) * f27) >= 0.0f && ((f16 - f21) * f27) - ((f18 - f23) * f26) >= 0.0f) {
                    float f28 = fArr3[4];
                    float f29 = fArr3[5];
                    if (((f23 - f18) * f28) - ((f21 - f16) * f29) >= 0.0f && ((f21 - f12) * f29) - ((f23 - f14) * f28) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.p
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateEotf$lambda$4;
                    generateEotf$lambda$4 = Rgb.Companion.generateEotf$lambda$4(TransferParameters.this, d11);
                    return generateEotf$lambda$4;
                }
            } : transferParameters.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.q
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateEotf$lambda$5;
                    generateEotf$lambda$5 = Rgb.Companion.generateEotf$lambda$5(TransferParameters.this, d11);
                    return generateEotf$lambda$5;
                }
            } : (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.r
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateEotf$lambda$6;
                    generateEotf$lambda$6 = Rgb.Companion.generateEotf$lambda$6(TransferParameters.this, d11);
                    return generateEotf$lambda$6;
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.s
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateEotf$lambda$7;
                    generateEotf$lambda$7 = Rgb.Companion.generateEotf$lambda$7(TransferParameters.this, d11);
                    return generateEotf$lambda$7;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$4(TransferParameters transferParameters, double d11) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release(transferParameters, d11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$5(TransferParameters transferParameters, double d11) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release(transferParameters, d11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$6(TransferParameters transferParameters, double d11) {
            return ColorSpaceKt.response(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$7(TransferParameters transferParameters, double d11) {
            return ColorSpaceKt.response(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.t
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateOetf$lambda$0;
                    generateOetf$lambda$0 = Rgb.Companion.generateOetf$lambda$0(TransferParameters.this, d11);
                    return generateOetf$lambda$0;
                }
            } : transferParameters.isPQish$ui_graphics_release() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.u
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateOetf$lambda$1;
                    generateOetf$lambda$1 = Rgb.Companion.generateOetf$lambda$1(TransferParameters.this, d11);
                    return generateOetf$lambda$1;
                }
            } : (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.v
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateOetf$lambda$2;
                    generateOetf$lambda$2 = Rgb.Companion.generateOetf$lambda$2(TransferParameters.this, d11);
                    return generateOetf$lambda$2;
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.w
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d11) {
                    double generateOetf$lambda$3;
                    generateOetf$lambda$3 = Rgb.Companion.generateOetf$lambda$3(TransferParameters.this, d11);
                    return generateOetf$lambda$3;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d11) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release(transferParameters, d11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d11) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release(transferParameters, d11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d11) {
            return ColorSpaceKt.rcpResponse(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d11) {
            return ColorSpaceKt.rcpResponse(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f11, float f12, int i11) {
            if (i11 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f11 != 0.0f || f12 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d11 = 0.0d; d11 <= 1.0d; d11 += 0.00392156862745098d) {
                if (!compare(d11, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !compare(d11, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f11, float f12) {
            float area = area(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (area / area(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) {
                return f11 < 0.0f && f12 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                a00.q.H0(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = f11 + f12 + fArr[2];
            fArr2[0] = f11 / f13;
            fArr2[1] = f12 / f13;
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = f14 + f15 + fArr[5];
            fArr2[2] = f14 / f16;
            fArr2[3] = f15 / f16;
            float f17 = fArr[6];
            float f18 = fArr[7];
            float f19 = f17 + f18 + fArr[8];
            fArr2[4] = f17 / f19;
            fArr2[5] = f18 / f19;
            return fArr2;
        }

        @m80.k
        public final float[] computePrimaries$ui_graphics_release(@m80.k float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{0.0f, 0.0f, 1.0f});
            float f11 = mul3x3Float3[0];
            float f12 = mul3x3Float3[1];
            float f13 = f11 + f12 + mul3x3Float3[2];
            float f14 = mul3x3Float32[0];
            float f15 = mul3x3Float32[1];
            float f16 = f14 + f15 + mul3x3Float32[2];
            float f17 = mul3x3Float33[0];
            float f18 = mul3x3Float33[1];
            float f19 = f17 + f18 + mul3x3Float33[2];
            return new float[]{f11 / f13, f12 / f13, f14 / f16, f15 / f16, f17 / f19, f18 / f19};
        }

        private Companion() {
        }
    }

    public Rgb(@m80.k String str, @m80.k float[] fArr, @m80.k WhitePoint whitePoint, @m80.l float[] fArr2, @m80.k DoubleFunction doubleFunction, @m80.k DoubleFunction doubleFunction2, float f11, float f12, @m80.l TransferParameters transferParameters, int i11) {
        super(str, ColorModel.Companion.m2923getRgbxdoWZVw(), i11, null);
        this.whitePoint = whitePoint;
        this.min = f11;
        this.max = f12;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new x00.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            public final Double invoke(double d11) {
                float f13;
                float f14;
                double invoke = Rgb.this.getOetfOrig$ui_graphics_release().invoke(d11);
                f13 = Rgb.this.min;
                double d12 = f13;
                f14 = Rgb.this.max;
                return Double.valueOf(g10.u.G(invoke, d12, f14));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return invoke(d11.doubleValue());
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.g
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d11) {
                double oetfFunc$lambda$0;
                oetfFunc$lambda$0 = Rgb.oetfFunc$lambda$0(Rgb.this, d11);
                return oetfFunc$lambda$0;
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new x00.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            public final Double invoke(double d11) {
                float f13;
                float f14;
                DoubleFunction eotfOrig$ui_graphics_release = Rgb.this.getEotfOrig$ui_graphics_release();
                f13 = Rgb.this.min;
                double d12 = f13;
                f14 = Rgb.this.max;
                return Double.valueOf(eotfOrig$ui_graphics_release.invoke(g10.u.G(d11, d12, f14)));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Double invoke(Double d11) {
                return invoke(d11.doubleValue());
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.h
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d11) {
                double eotfFunc$lambda$1;
                eotfFunc$lambda$1 = Rgb.eotfFunc$lambda$1(Rgb.this, d11);
                return eotfFunc$lambda$1;
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Invalid range: min=" + f11 + ", max=" + f12 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] xyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = xyPrimaries;
        if (fArr2 == null) {
            this.transform = companion.computeXYZMatrix(xyPrimaries, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(xyPrimaries, f11, f12);
        this.isSrgb = companion.isSrgb(xyPrimaries, whitePoint, doubleFunction, doubleFunction2, f11, f12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(x00.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(x00.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(x00.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(x00.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(double d11, double d12) {
        if (d12 < 0.0d) {
            d12 = 0.0d;
        }
        return Math.pow(d12, 1.0d / d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(double d11, double d12) {
        if (d12 < 0.0d) {
            d12 = 0.0d;
        }
        return Math.pow(d12, d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d11) {
        return rgb.eotfOrig.invoke(g10.u.G(d11, rgb.min, rgb.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d11) {
        return g10.u.G(rgb.oetfOrig.invoke(d11), rgb.min, rgb.max);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !g0.g(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return g0.g(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (g0.g(this.oetfOrig, rgb.oetfOrig)) {
            return g0.g(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Size(3)
    @m80.k
    public final float[] fromLinear(float f11, float f12, float f13) {
        return fromLinear(new float[]{f11, f12, f13});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] fromXyz(@m80.k float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @m80.k
    public final x00.l<Double, Double> getEotf() {
        return this.eotf;
    }

    @m80.k
    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.eotfFunc;
    }

    @m80.k
    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    @Size(9)
    @m80.k
    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.k
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i11) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i11) {
        return this.min;
    }

    @m80.k
    public final x00.l<Double, Double> getOetf() {
        return this.oetf;
    }

    @m80.k
    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.oetfFunc;
    }

    @m80.k
    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    @Size(MediaDescriptionCompat.f2812q)
    @m80.k
    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.k
    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    @m80.l
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    @Size(9)
    @m80.k
    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @m80.k
    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    @m80.k
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f11 = this.min;
        int floatToIntBits = (hashCode + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        float f12 = this.max;
        int floatToIntBits2 = (floatToIntBits + (f12 == 0.0f ? 0 : Float.floatToIntBits(f12))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int hashCode2 = floatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((hashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : hashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    @Size(3)
    @m80.k
    public final float[] toLinear(float f11, float f12, float f13) {
        return toLinear(new float[]{f11, f12, f13});
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f11, float f12, float f13) {
        float invoke = (float) this.eotfFunc.invoke(f11);
        float invoke2 = (float) this.eotfFunc.invoke(f12);
        float invoke3 = (float) this.eotfFunc.invoke(f13);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f14 = (fArr[0] * invoke) + (fArr[3] * invoke2) + (fArr[6] * invoke3);
        float f15 = (fArr[1] * invoke) + (fArr[4] * invoke2) + (fArr[7] * invoke3);
        return (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @m80.k
    public float[] toXyz(@m80.k float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f11, float f12, float f13) {
        float invoke = (float) this.eotfFunc.invoke(f11);
        float invoke2 = (float) this.eotfFunc.invoke(f12);
        float invoke3 = (float) this.eotfFunc.invoke(f13);
        float[] fArr = this.transform;
        return (fArr[2] * invoke) + (fArr[5] * invoke2) + (fArr[8] * invoke3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo2926xyzaToColorJlNiLsg$ui_graphics_release(float f11, float f12, float f13, float f14, @m80.k ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13)), (float) this.oetfFunc.invoke((fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13)), (float) this.oetfFunc.invoke((fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13)), f14, colorSpace);
    }

    @Size(min = 3)
    @m80.k
    public final float[] fromLinear(@Size(min = 3) @m80.k float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Size(min = 9)
    @m80.k
    public final float[] getInverseTransform(@Size(min = 9) @m80.k float[] fArr) {
        return a00.q.H0(this.inverseTransform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = MediaDescriptionCompat.f2812q)
    @m80.k
    public final float[] getPrimaries(@Size(min = 6) @m80.k float[] fArr) {
        return a00.q.H0(this.primaries, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 9)
    @m80.k
    public final float[] getTransform(@Size(min = 9) @m80.k float[] fArr) {
        return a00.q.H0(this.transform, fArr, 0, 0, 0, 14, null);
    }

    @Size(min = 3)
    @m80.k
    public final float[] toLinear(@Size(min = 3) @m80.k float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$8(double d11) {
        return d11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@androidx.annotation.Size(min = 1) @m80.k java.lang.String r13, @androidx.annotation.Size(9) @m80.k float[] r14, @m80.k final x00.l<? super java.lang.Double, java.lang.Double> r15, @m80.k final x00.l<? super java.lang.Double, java.lang.Double> r16) {
        /*
            r12 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r14)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r14)
            androidx.compose.ui.graphics.colorspace.j r6 = new androidx.compose.ui.graphics.colorspace.j
            r6.<init>()
            androidx.compose.ui.graphics.colorspace.k r7 = new androidx.compose.ui.graphics.colorspace.k
            r14 = r16
            r7.<init>()
            r10 = 0
            r11 = -1
            r5 = 0
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r1 = r12
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], x00.l, x00.l):void");
    }

    public Rgb(@Size(min = 1) @m80.k String str, @Size(max = 9, min = 6) @m80.k float[] fArr, @m80.k WhitePoint whitePoint, @m80.k final x00.l<? super Double, Double> lVar, @m80.k final x00.l<? super Double, Double> lVar2, float f11, float f12) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.n
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d11) {
                double _init_$lambda$4;
                _init_$lambda$4 = Rgb._init_$lambda$4(x00.l.this, d11);
                return _init_$lambda$4;
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d11) {
                double _init_$lambda$5;
                _init_$lambda$5 = Rgb._init_$lambda$5(x00.l.this, d11);
                return _init_$lambda$5;
            }
        }, f11, f12, null, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@androidx.annotation.Size(min = 1) @m80.k java.lang.String r8, @androidx.annotation.Size(9) @m80.k float[] r9, @m80.k androidx.compose.ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    public Rgb(@Size(min = 1) @m80.k String str, @Size(max = 9, min = 6) @m80.k float[] fArr, @m80.k WhitePoint whitePoint, @m80.k TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@m80.k java.lang.String r12, @m80.k float[] r13, @m80.k androidx.compose.ui.graphics.colorspace.WhitePoint r14, @m80.k androidx.compose.ui.graphics.colorspace.TransferParameters r15, int r16) {
        /*
            r11 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            androidx.compose.ui.graphics.colorspace.DoubleFunction r5 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$generateOetf(r0, r15)
            androidx.compose.ui.graphics.colorspace.DoubleFunction r6 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$generateEotf(r0, r15)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@androidx.annotation.Size(min = 1) @m80.k java.lang.String r11, @androidx.annotation.Size(9) @m80.k float[] r12, double r13) {
        /*
            r10 = this;
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r12)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r7 = 0
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    public Rgb(@Size(min = 1) @m80.k String str, @Size(max = 9, min = 6) @m80.k float[] fArr, @m80.k WhitePoint whitePoint, double d11) {
        this(str, fArr, whitePoint, d11, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Rgb(@m80.k java.lang.String r20, @m80.k float[] r21, @m80.k androidx.compose.ui.graphics.colorspace.WhitePoint r22, final double r23, float r25, float r26, int r27) {
        /*
            r19 = this;
            r1 = r23
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
        La:
            r17 = r3
            goto L13
        Ld:
            androidx.compose.ui.graphics.colorspace.l r3 = new androidx.compose.ui.graphics.colorspace.l
            r3.<init>()
            goto La
        L13:
            if (r0 != 0) goto L1a
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = androidx.compose.ui.graphics.colorspace.Rgb.DoubleIdentity
        L17:
            r18 = r0
            goto L20
        L1a:
            androidx.compose.ui.graphics.colorspace.m r0 = new androidx.compose.ui.graphics.colorspace.m
            r0.<init>()
            goto L17
        L20:
            androidx.compose.ui.graphics.colorspace.TransferParameters r13 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r0 = r13
            r13 = 0
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r11 = r25
            r12 = r26
            r14 = r27
            r13 = r0
            r9 = r17
            r10 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    public Rgb(@m80.k Rgb rgb, @m80.k float[] fArr, @m80.k WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }
}
