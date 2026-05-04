package androidx.compose.ui.input.pointer.util;

import a00.q;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,706:1\n662#1:719\n669#1,2:720\n665#1,6:722\n662#1:728\n662#1:729\n657#1:730\n644#1:732\n644#1:733\n34#2,6:707\n34#2,6:713\n69#3:731\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n481#1:719\n483#1:720,2\n485#1:722,6\n492#1:728\n494#1:729\n507#1:730\n629#1:732\n635#1:733\n383#1:707,6\n418#1:713,6\n507#1:731\n*E\n"})
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse;

    private static final float[][] Matrix(int i11, int i12) {
        float[][] fArr = new float[i11][];
        for (int i13 = 0; i13 < i11; i13++) {
            fArr[i13] = new float[i12];
        }
        return fArr;
    }

    public static final void addPointerInputChange(@k VelocityTracker velocityTracker, @k PointerInputChange pointerInputChange) {
        if (VelocityTrackerAddPointsFix) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m3832setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m3732getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m3733getPreviousPositionF1C5BW0 = pointerInputChange.m3733getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i11 = 0;
        while (i11 < size) {
            HistoricalChange historicalChange = historical.get(i11);
            long m2272minusMKHz9U = Offset.m2272minusMKHz9U(historicalChange.m3656getPositionF1C5BW0(), m3733getPreviousPositionF1C5BW0);
            long m3656getPositionF1C5BW0 = historicalChange.m3656getPositionF1C5BW0();
            velocityTracker.m3832setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2273plusMKHz9U(velocityTracker.m3831getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m2272minusMKHz9U));
            velocityTracker.m3828addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m3831getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i11++;
            m3733getPreviousPositionF1C5BW0 = m3656getPositionF1C5BW0;
        }
        velocityTracker.m3832setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2273plusMKHz9U(velocityTracker.m3831getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m2272minusMKHz9U(pointerInputChange.m3732getPositionF1C5BW0(), m3733getPreviousPositionF1C5BW0)));
        velocityTracker.m3828addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m3831getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i11 = 0; i11 < size; i11++) {
                HistoricalChange historicalChange = historical.get(i11);
                velocityTracker.m3828addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m3655getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m3828addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m3731getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i11, boolean z11) {
        int i12 = i11 - 1;
        float f11 = fArr2[i12];
        float f12 = 0.0f;
        int i13 = i12;
        while (i13 > 0) {
            int i14 = i13 - 1;
            float f13 = fArr2[i14];
            if (f11 != f13) {
                float f14 = (z11 ? -fArr[i14] : fArr[i13] - fArr[i14]) / (f11 - f13);
                f12 += (f14 - (Math.signum(f12) * ((float) Math.sqrt(2 * Math.abs(f12))))) * Math.abs(f14);
                if (i13 == i12) {
                    f12 *= 0.5f;
                }
            }
            i13--;
            f11 = f13;
        }
        return Math.signum(f12) * ((float) Math.sqrt(2 * Math.abs(f12)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            f11 += fArr[i11] * fArr2[i11];
        }
        return f11;
    }

    private static final float get(float[][] fArr, int i11, int i12) {
        return fArr[i11][i12];
    }

    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    @ExperimentalVelocityTrackerApi
    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return VelocityTrackerStrategyUseImpulse;
    }

    private static final float kineticEnergyToVelocity(float f11) {
        return Math.signum(f11) * ((float) Math.sqrt(2 * Math.abs(f11)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    @k
    public static final float[] polyFitLeastSquares(@k float[] fArr, @k float[] fArr2, int i11, int i12, @k float[] fArr3) {
        int i13 = i12;
        if (i13 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i11 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i13 >= i11) {
            i13 = i11 - 1;
        }
        int i14 = i13 + 1;
        float[][] fArr4 = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = new float[i11];
        }
        for (int i16 = 0; i16 < i11; i16++) {
            fArr4[0][i16] = 1.0f;
            for (int i17 = 1; i17 < i14; i17++) {
                fArr4[i17][i16] = fArr4[i17 - 1][i16] * fArr[i16];
            }
        }
        float[][] fArr5 = new float[i14][];
        for (int i18 = 0; i18 < i14; i18++) {
            fArr5[i18] = new float[i11];
        }
        float[][] fArr6 = new float[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            fArr6[i19] = new float[i14];
        }
        int i21 = 0;
        while (i21 < i14) {
            float[] fArr7 = fArr5[i21];
            q.y0(fArr4[i21], fArr7, 0, 0, i11);
            for (int i22 = 0; i22 < i21; i22++) {
                float[] fArr8 = fArr5[i22];
                float dot = dot(fArr7, fArr8);
                for (int i23 = 0; i23 < i11; i23++) {
                    fArr7[i23] = fArr7[i23] - (fArr8[i23] * dot);
                }
            }
            float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f11 = 1.0f / sqrt;
            for (int i24 = 0; i24 < i11; i24++) {
                fArr7[i24] = fArr7[i24] * f11;
            }
            float[] fArr9 = fArr6[i21];
            int i25 = 0;
            while (i25 < i14) {
                fArr9[i25] = i25 < i21 ? 0.0f : dot(fArr7, fArr4[i25]);
                i25++;
            }
            i21++;
        }
        for (int i26 = i13; -1 < i26; i26--) {
            float dot2 = dot(fArr5[i26], fArr2);
            float[] fArr10 = fArr6[i26];
            int i27 = i26 + 1;
            if (i27 <= i13) {
                int i28 = i13;
                while (true) {
                    dot2 -= fArr10[i28] * fArr3[i28];
                    if (i28 != i27) {
                        i28--;
                    }
                }
            }
            fArr3[i26] = dot2 / fArr10[i26];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i11, int i12, float[] fArr3, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            fArr3 = new float[u.u(i12 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i11, i12, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i11, long j11, float f11) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i11];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i11] = new DataPointAtTime(j11, f11);
        } else {
            dataPointAtTime.setTime(j11);
            dataPointAtTime.setDataPoint(f11);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z11) {
        VelocityTrackerAddPointsFix = z11;
    }

    @ExperimentalVelocityTrackerApi
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z11) {
        VelocityTrackerStrategyUseImpulse = z11;
    }

    private static final void set(float[][] fArr, int i11, int i12, float f11) {
        fArr[i11][i12] = f11;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    @ExperimentalVelocityTrackerApi
    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }
}
