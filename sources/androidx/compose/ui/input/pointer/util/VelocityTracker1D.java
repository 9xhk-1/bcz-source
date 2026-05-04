package androidx.compose.ui.input.pointer.util;

import a00.q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m00.a;
import m00.c;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,706:1\n56#2,5:707\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n290#1:707,5\n*E\n"})
/* loaded from: classes.dex */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;

    @k
    private final float[] reusableDataPointsArray;

    @k
    private final float[] reusableTimeArray;

    @k
    private final float[] reusableVelocityCoefficients;

    @k
    private final DataPointAtTime[] samples;

    @k
    private final Strategy strategy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Strategy {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Lsq2 = new Strategy("Lsq2", 0);
        public static final Strategy Impulse = new Strategy("Impulse", 1);

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{Lsq2, Impulse};
        }

        static {
            Strategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private Strategy(String str, int i11) {
        }

        @k
        public static a<Strategy> getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i11) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i11, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j11, float f11) {
        int i11 = (this.index + 1) % 20;
        this.index = i11;
        VelocityTrackerKt.set(this.samples, i11, j11, f11);
    }

    public final float calculateVelocity() {
        float calculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i11 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i11];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i12 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i11];
            if (dataPointAtTime3 != null) {
                float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
                float abs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                DataPointAtTime dataPointAtTime4 = (this.strategy == Strategy.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i12] = dataPointAtTime3.getDataPoint();
                fArr2[i12] = -time;
                if (i11 == 0) {
                    i11 = 20;
                }
                i11--;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime4;
            } else {
                break;
            }
        }
        if (i12 < this.minSampleSize) {
            return 0.0f;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i13 == 1) {
            calculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i12, this.isDataDifferential);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            calculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i12);
        }
        return calculateImpulseVelocity * 1000;
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        q.V1(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z11, @k Strategy strategy) {
        this.isDataDifferential = z11;
        this.strategy = strategy;
        if (z11 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 3;
        }
        this.minSampleSize = i12;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z11, Strategy strategy, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final float calculateVelocity(float f11) {
        if (!(f11 > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f11);
        }
        float calculateVelocity = calculateVelocity();
        if (calculateVelocity == 0.0f || Float.isNaN(calculateVelocity)) {
            return 0.0f;
        }
        if (calculateVelocity > 0.0f) {
            return u.A(calculateVelocity, f11);
        }
        return u.t(calculateVelocity, -f11);
    }

    public VelocityTracker1D(boolean z11) {
        this(z11, Strategy.Impulse);
    }
}
