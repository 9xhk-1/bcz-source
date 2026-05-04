package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,328:1\n219#2:329\n221#2,5:330\n60#3:335\n70#3:337\n22#4:336\n22#4:338\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n-1#1:329\n147#1:330,5\n149#1:335\n150#1:337\n149#1:336\n150#1:338\n*E\n"})
/* loaded from: classes.dex */
public class Connector {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private final ColorSpace destination;
    private final int renderIntent;

    @m80.k
    private final ColorSpace source;

    @m80.l
    private final float[] transform;

    @m80.k
    private final ColorSpace transformDestination;

    @m80.k
    private final ColorSpace transformSource;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m2933computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i11) {
            if (!RenderIntent.m2939equalsimpl0(i11, RenderIntent.Companion.m2943getAbsoluteuksYyKA())) {
                return null;
            }
            long m2925getModelxdoWZVw = colorSpace.m2925getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean m2916equalsimpl0 = ColorModel.m2916equalsimpl0(m2925getModelxdoWZVw, companion.m2923getRgbxdoWZVw());
            boolean m2916equalsimpl02 = ColorModel.m2916equalsimpl0(colorSpace2.m2925getModelxdoWZVw(), companion.m2923getRgbxdoWZVw());
            if (m2916equalsimpl0 && m2916equalsimpl02) {
                return null;
            }
            if (!m2916equalsimpl0 && !m2916equalsimpl02) {
                return null;
            }
            if (!m2916equalsimpl0) {
                colorSpace = colorSpace2;
            }
            g0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = m2916equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = m2916equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        @m80.k
        public final Connector identity$ui_graphics_release(@m80.k final ColorSpace colorSpace) {
            final int m2945getRelativeuksYyKA = RenderIntent.Companion.m2945getRelativeuksYyKA();
            return new Connector(colorSpace, m2945getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(colorSpace, colorSpace, m2945getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-l2rxGTc$ui_graphics_release */
                public long mo2931transformToColorl2rxGTc$ui_graphics_release(long j11) {
                    return j11;
                }
            };
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n1#1,328:1\n219#2:329\n221#2,5:330\n638#3:335\n653#3:336\n668#3:337\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector$RgbConnector\n*L\n-1#1:329\n185#1:330,5\n189#1:335\n190#1:336\n191#1:337\n*E\n"})
    public static final class RgbConnector extends Connector {

        @m80.k
        private final Rgb mDestination;

        @m80.k
        private final Rgb mSource;

        @m80.k
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i11, kotlin.jvm.internal.v vVar) {
            this(rgb, rgb2, i11);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m2934computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i11) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), xyz$ui_graphics_release, illuminant.newD50Xyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), xyz$ui_graphics_release2, illuminant.newD50Xyz$ui_graphics_release()), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m2939equalsimpl0(i11, RenderIntent.Companion.m2943getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        @m80.k
        public float[] transform(@m80.k float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public long mo2931transformToColorl2rxGTc$ui_graphics_release(long j11) {
            float m2515getRedimpl = Color.m2515getRedimpl(j11);
            float m2514getGreenimpl = Color.m2514getGreenimpl(j11);
            float m2512getBlueimpl = Color.m2512getBlueimpl(j11);
            float m2511getAlphaimpl = Color.m2511getAlphaimpl(j11);
            float invoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(m2515getRedimpl);
            float invoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(m2514getGreenimpl);
            float invoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(m2512getBlueimpl);
            float[] fArr = this.mTransform;
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[0] * invoke) + (fArr[3] * invoke2) + (fArr[6] * invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[1] * invoke) + (fArr[4] * invoke2) + (fArr[7] * invoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[2] * invoke) + (fArr[5] * invoke2) + (fArr[8] * invoke3)), m2511getAlphaimpl, this.mDestination);
        }

        private RgbConnector(Rgb rgb, Rgb rgb2, int i11) {
            super(rgb, rgb2, rgb, rgb2, i11, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m2934computeTransformYBCOT_4(rgb, rgb2, i11);
        }
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i11, kotlin.jvm.internal.v vVar) {
        this(colorSpace, colorSpace2, i11);
    }

    @m80.k
    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m2930getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    @m80.k
    public final ColorSpace getSource() {
        return this.source;
    }

    @Size(3)
    @m80.k
    public final float[] transform(float f11, float f12, float f13) {
        return transform(new float[]{f11, f12, f13});
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo2931transformToColorl2rxGTc$ui_graphics_release(long j11) {
        float m2515getRedimpl = Color.m2515getRedimpl(j11);
        float m2514getGreenimpl = Color.m2514getGreenimpl(j11);
        float m2512getBlueimpl = Color.m2512getBlueimpl(j11);
        float m2511getAlphaimpl = Color.m2511getAlphaimpl(j11);
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(m2515getRedimpl, m2514getGreenimpl, m2512getBlueimpl);
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(m2515getRedimpl, m2514getGreenimpl, m2512getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f11 = intBitsToFloat;
        return this.transformDestination.mo2926xyzaToColorJlNiLsg$ui_graphics_release(f11, intBitsToFloat2, z$ui_graphics_release, m2511getAlphaimpl, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i11, float[] fArr, kotlin.jvm.internal.v vVar) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i11, fArr);
    }

    @Size(min = 3)
    @m80.k
    public float[] transform(@Size(min = 3) @m80.k float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i11, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i11;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r13, androidx.compose.ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.m2925getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m2923getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m2916equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L1e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L1f
        L1e:
            r7 = r13
        L1f:
            long r4 = r14.m2925getModelxdoWZVw()
            long r8 = r2.m2923getRgbxdoWZVw()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.m2916equalsimpl0(r4, r8)
            if (r0 == 0) goto L39
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L3a
        L39:
            r8 = r14
        L3a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = androidx.compose.ui.graphics.colorspace.Connector.Companion
            float[] r10 = androidx.compose.ui.graphics.colorspace.Connector.Companion.m2932access$computeTransformYBCOT_4(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
