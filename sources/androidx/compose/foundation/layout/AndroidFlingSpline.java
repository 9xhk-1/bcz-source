package androidx.compose.foundation.layout;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,708:1\n53#2,3:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline\n*L\n686#1:709,3\n*E\n"})
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;

    @m80.k
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();

    @m80.k
    private static final float[] SplinePositions = new float[101];

    @m80.k
    private static final float[] SplineTimes = new float[101];

    static {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        float f22 = 0.0f;
        int i11 = 0;
        float f23 = 0.0f;
        while (true) {
            float f24 = 1.0f;
            if (i11 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f25 = i11 / 100;
            float f26 = 1.0f;
            while (true) {
                f11 = ((f26 - f22) / 2.0f) + f22;
                f12 = f24 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f27 = (((f12 * 0.175f) + (f11 * 0.35000002f)) * f13) + f14;
                f15 = f24;
                f16 = f25;
                if (Math.abs(f27 - f25) < 1.0E-5d) {
                    break;
                }
                if (f27 > f16) {
                    f26 = f11;
                } else {
                    f22 = f11;
                }
                f24 = f15;
                f25 = f16;
            }
            SplinePositions[i11] = (f13 * ((f12 * 0.5f) + f11)) + f14;
            float f28 = f15;
            while (true) {
                f17 = ((f28 - f23) / 2.0f) + f23;
                f18 = f15 - f17;
                f19 = f17 * 3.0f * f18;
                f21 = f17 * f17 * f17;
                float f29 = (((f18 * 0.5f) + f17) * f19) + f21;
                if (Math.abs(f29 - f16) >= 1.0E-5d) {
                    if (f29 > f16) {
                        f28 = f17;
                    } else {
                        f23 = f17;
                    }
                }
            }
            SplineTimes[i11] = (f19 * ((f18 * 0.175f) + (f17 * 0.35000002f))) + f21;
            i11++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f11, float f12) {
        return Math.log((Math.abs(f11) * 0.35f) / f12);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m597flingPositionLfoxSSI(float f11) {
        float f12;
        float f13;
        float f14 = 100;
        int i11 = (int) (f14 * f11);
        if (i11 < 100) {
            float f15 = i11 / f14;
            int i12 = i11 + 1;
            float f16 = i12 / f14;
            float[] fArr = SplinePositions;
            float f17 = fArr[i11];
            f13 = (fArr[i12] - f17) / (f16 - f15);
            f12 = f17 + ((f11 - f15) * f13);
        } else {
            f12 = 1.0f;
            f13 = 0.0f;
        }
        return FlingResult.m599constructorimpl((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @w00.h
    @u0({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,708:1\n60#2:709\n70#2:711\n22#3:710\n22#3:712\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult\n*L\n698#1:709\n705#1:711\n698#1:710\n705#1:712\n*E\n"})
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j11) {
            this.packedValue = j11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m598boximpl(long j11) {
            return new FlingResult(j11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m600equalsimpl(long j11, Object obj) {
            return (obj instanceof FlingResult) && j11 == ((FlingResult) obj).m606unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m601equalsimpl0(long j11, long j12) {
            return j11 == j12;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m602getDistanceCoefficientimpl(long j11) {
            return Float.intBitsToFloat((int) (j11 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m603getVelocityCoefficientimpl(long j11) {
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m604hashCodeimpl(long j11) {
            return Long.hashCode(j11);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m605toStringimpl(long j11) {
            return "FlingResult(packedValue=" + j11 + ')';
        }

        public boolean equals(Object obj) {
            return m600equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m604hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m605toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m606unboximpl() {
            return this.packedValue;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m599constructorimpl(long j11) {
            return j11;
        }
    }
}
