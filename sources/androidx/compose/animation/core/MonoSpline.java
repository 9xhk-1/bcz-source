package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;

    @k
    private final float[] slopeTemp;

    @k
    private final float[][] tangents;

    @k
    private final float[] timePoints;

    @k
    private final float[][] values;

    public MonoSpline(@k float[] fArr, @k float[][] fArr2, float f11) {
        int i11;
        int length = fArr.length;
        int i12 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i13 = length - 1;
        float[][] makeFloatArray = makeFloatArray(i13, length2);
        float[][] makeFloatArray2 = makeFloatArray(length, length2);
        for (int i14 = 0; i14 < length2; i14++) {
            int i15 = 0;
            while (i15 < i13) {
                int i16 = i15 + 1;
                float f12 = fArr[i16] - fArr[i15];
                float[] fArr3 = makeFloatArray[i15];
                float f13 = (fArr2[i16][i14] - fArr2[i15][i14]) / f12;
                fArr3[i14] = f13;
                if (i15 == 0) {
                    makeFloatArray2[i15][i14] = f13;
                } else {
                    makeFloatArray2[i15][i14] = (makeFloatArray[i15 - 1][i14] + f13) * 0.5f;
                }
                i15 = i16;
            }
            makeFloatArray2[i13][i14] = makeFloatArray[length - 2][i14];
        }
        if (!Float.isNaN(f11)) {
            for (int i17 = 0; i17 < length2; i17++) {
                float[] fArr4 = makeFloatArray[length - 2];
                float f14 = fArr4[i17] * (1 - f11);
                float[] fArr5 = makeFloatArray[0];
                float f15 = f14 + (fArr5[i17] * f11);
                fArr5[i17] = f15;
                fArr4[i17] = f15;
                makeFloatArray2[i13][i17] = f15;
                makeFloatArray2[0][i17] = f15;
            }
        }
        int i18 = 0;
        while (i18 < i13) {
            int i19 = i12;
            while (i19 < length2) {
                float f16 = makeFloatArray[i18][i19];
                if (f16 == 0.0f) {
                    makeFloatArray2[i18][i19] = 0.0f;
                    makeFloatArray2[i18 + 1][i19] = 0.0f;
                    i11 = length2;
                } else {
                    float f17 = makeFloatArray2[i18][i19] / f16;
                    int i21 = i18 + 1;
                    float f18 = makeFloatArray2[i21][i19] / f16;
                    i11 = length2;
                    float hypot = (float) Math.hypot(f17, f18);
                    if (hypot > 9.0d) {
                        float f19 = 3.0f / hypot;
                        float[] fArr6 = makeFloatArray2[i18];
                        float[] fArr7 = makeFloatArray[i18];
                        fArr6[i19] = f17 * f19 * fArr7[i19];
                        makeFloatArray2[i21][i19] = f19 * f18 * fArr7[i19];
                    }
                }
                i19++;
                length2 = i11;
            }
            i18++;
            i12 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = makeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f11, AnimationVector animationVector, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        monoSpline.getPos(f11, animationVector, i11);
    }

    private final void getSlope(float f11, float[] fArr) {
        int length = this.values[0].length;
        float[] fArr2 = this.timePoints;
        int length2 = fArr2.length;
        float f12 = fArr2[0];
        int i11 = length2 - 1;
        float f13 = fArr2[i11];
        if (f11 < f12) {
            f11 = f12;
        }
        if (f11 <= f13) {
            f13 = f11;
        }
        if (fArr.length < length) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            float[] fArr3 = this.timePoints;
            int i13 = i12 + 1;
            float f14 = fArr3[i13];
            if (f13 <= f14) {
                float f15 = fArr3[i12];
                float f16 = f14 - f15;
                float f17 = (f13 - f15) / f16;
                for (int i14 = 0; i14 < length; i14++) {
                    float[][] fArr4 = this.values;
                    float f18 = fArr4[i12][i14];
                    float f19 = fArr4[i13][i14];
                    float[][] fArr5 = this.tangents;
                    fArr[i14] = MonoSplineKt.hermiteDifferential(f16, f17, f18, f19, fArr5[i12][i14], fArr5[i13][i14]) / f16;
                }
                return;
            }
            i12 = i13;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f11, AnimationVector animationVector, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        monoSpline.getSlope(f11, animationVector, i11);
    }

    private final float[][] makeFloatArray(int i11, int i12) {
        float[][] fArr = new float[i11][];
        for (int i13 = 0; i13 < i11; i13++) {
            fArr[i13] = new float[i12];
        }
        return fArr;
    }

    public final float getPos(float f11, int i11) {
        int i12;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i13 = 0;
        if (f11 <= fArr3[0]) {
            i12 = 0;
        } else {
            i12 = length - 1;
            if (f11 < fArr3[i12]) {
                i12 = -1;
            }
        }
        if (i12 != -1) {
            float f12 = fArr[i12][i11];
            float f13 = fArr3[i12];
            return f12 + ((f11 - f13) * getSlope(f13, i11));
        }
        int i14 = length - 1;
        while (i13 < i14) {
            float[] fArr4 = this.timePoints;
            float f14 = fArr4[i13];
            if (f11 == f14) {
                return fArr[i13][i11];
            }
            int i15 = i13 + 1;
            float f15 = fArr4[i15];
            if (f11 < f15) {
                float f16 = f15 - f14;
                return MonoSplineKt.hermiteInterpolate(f16, (f11 - f14) / f16, fArr[i13][i11], fArr[i15][i11], fArr2[i13][i11], fArr2[i15][i11]);
            }
            i13 = i15;
        }
        return 0.0f;
    }

    public final void getSlope(float f11, @k AnimationVector animationVector, int i11) {
        int i12;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i13 = 0;
        int length2 = fArr2[0].length;
        if (f11 <= fArr[0]) {
            i12 = 0;
        } else {
            i12 = length - 1;
            if (f11 < fArr[i12]) {
                i12 = -1;
            }
        }
        if (i12 != -1) {
            float[] fArr4 = fArr3[i12];
            if (fArr4.length < length2) {
                return;
            }
            while (i13 < length2) {
                animationVector.set$animation_core_release(i13, fArr4[i13]);
                i13++;
            }
            return;
        }
        int i14 = length - 1;
        int i15 = i11;
        while (i15 < i14) {
            int i16 = i15 + 1;
            float f12 = fArr[i16];
            if (f11 <= f12) {
                float f13 = fArr[i15];
                float f14 = f12 - f13;
                float f15 = (f11 - f13) / f14;
                while (i13 < length2) {
                    animationVector.set$animation_core_release(i13, MonoSplineKt.hermiteDifferential(f14, f15, fArr2[i15][i13], fArr2[i16][i13], fArr3[i15][i13], fArr3[i16][i13]) / f14);
                    i13++;
                }
                return;
            }
            i15 = i16;
        }
    }

    public final void getPos(float f11, @k AnimationVector animationVector, int i11) {
        int i12;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i13 = 0;
        int length2 = this.values[0].length;
        if (f11 <= fArr[0]) {
            i12 = 0;
        } else {
            i12 = length - 1;
            if (f11 < fArr[i12]) {
                i12 = -1;
            }
        }
        if (i12 != -1) {
            getSlope(fArr[i12], this.slopeTemp);
            while (i13 < length2) {
                animationVector.set$animation_core_release(i13, this.values[i12][i13] + ((f11 - this.timePoints[i12]) * this.slopeTemp[i13]));
                i13++;
            }
            return;
        }
        int i14 = length - 1;
        int i15 = i11;
        while (i15 < i14) {
            float[] fArr2 = this.timePoints;
            float f12 = fArr2[i15];
            if (f11 == f12) {
                while (i13 < length2) {
                    animationVector.set$animation_core_release(i13, this.values[i15][i13]);
                    i13++;
                }
                return;
            }
            int i16 = i15 + 1;
            float f13 = fArr2[i16];
            if (f11 < f13) {
                float f14 = f13 - f12;
                float f15 = (f11 - f12) / f14;
                while (i13 < length2) {
                    float[][] fArr3 = this.values;
                    float f16 = fArr3[i15][i13];
                    float f17 = fArr3[i16][i13];
                    float[][] fArr4 = this.tangents;
                    animationVector.set$animation_core_release(i13, MonoSplineKt.hermiteInterpolate(f14, f15, f16, f17, fArr4[i15][i13], fArr4[i16][i13]));
                    i13++;
                }
                return;
            }
            i15 = i16;
        }
    }

    private final float getSlope(float f11, int i11) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i12 = 0;
        float f12 = fArr[0];
        int i13 = length - 1;
        float f13 = fArr[i13];
        if (f11 < f12) {
            f11 = f12;
        }
        if (f11 <= f13) {
            f13 = f11;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            float f14 = fArr[i14];
            if (f13 <= f14) {
                float f15 = fArr2[i12][i11];
                float f16 = fArr2[i14][i11];
                float f17 = fArr3[i12][i11];
                float f18 = fArr3[i14][i11];
                float f19 = fArr[i12];
                float f21 = f14 - f19;
                return MonoSplineKt.hermiteDifferential(f21, (f13 - f19) / f21, f15, f16, f17, f18) / f21;
            }
            i12 = i14;
        }
        return 0.0f;
    }
}
