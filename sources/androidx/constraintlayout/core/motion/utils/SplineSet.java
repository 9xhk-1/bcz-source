package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int mCount;
    protected CurveFit mCurveFit;
    private String mType;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CoreSpline extends SplineSet {
        long mStart;
        String mType;

        public CoreSpline(String str, long j11) {
            this.mType = str;
            this.mStart = j11;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f11) {
            typedValues.setValue(typedValues.getId(this.mType), get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomSet extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(WidgetFrame widgetFrame, float f11) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i12);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i13 = 0;
                while (true) {
                    if (i13 < this.mTempValues.length) {
                        dArr2[i12][i13] = r6[i13];
                        i13++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public void setPoint(int i11, CustomAttribute customAttribute) {
            this.mConstraintAttributeList.append(i11, customAttribute);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomSpline extends SplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mTempValues;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f11) {
            setProperty((MotionWidget) typedValues, f11);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i12);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i13 = 0;
                while (true) {
                    if (i13 < this.mTempValues.length) {
                        dArr2[i12][i13] = r6[i13];
                        i13++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public void setPoint(int i11, CustomVariable customVariable) {
            this.mConstraintAttributeList.append(i11, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f11) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = iArr2[i13 - 1];
                int i15 = i13 - 2;
                int i16 = iArr2[i15];
                if (i14 < i16) {
                    int partition = partition(iArr, fArr, i14, i16);
                    iArr2[i15] = partition - 1;
                    iArr2[i13 - 1] = i14;
                    int i17 = i13 + 1;
                    iArr2[i13] = i16;
                    i13 += 2;
                    iArr2[i17] = partition + 1;
                } else {
                    i13 = i15;
                }
            }
        }

        private static int partition(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    swap(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            swap(iArr, fArr, i14, i12);
            return i14;
        }

        private static void swap(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j11) {
        return new CoreSpline(str, j11);
    }

    public float get(float f11) {
        return (float) this.mCurveFit.getPos(f11, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f11) {
        return (float) this.mCurveFit.getSlope(f11, 0);
    }

    public void setPoint(int i11, float f11) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.mCount + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i12 = this.mCount;
        iArr2[i12] = i11;
        this.mValues[i12] = f11;
        this.mCount = i12 + 1;
    }

    public void setProperty(TypedValues typedValues, float f11) {
        typedValues.setValue(TypedValues.AttributesType.getId(this.mType), get(f11));
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i11) {
        int i12;
        int i13 = this.mCount;
        if (i13 == 0) {
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i13 - 1);
        int i14 = 1;
        for (int i15 = 1; i15 < this.mCount; i15++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i15 - 1] != iArr[i15]) {
                i14++;
            }
        }
        double[] dArr = new double[i14];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i14, 1);
        int i16 = 0;
        for (0; i12 < this.mCount; i12 + 1) {
            if (i12 > 0) {
                int[] iArr2 = this.mTimePoints;
                i12 = iArr2[i12] == iArr2[i12 - 1] ? i12 + 1 : 0;
            }
            dArr[i16] = this.mTimePoints[i12] * 0.01d;
            dArr2[i16][0] = this.mValues[i12];
            i16++;
        }
        this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.mCount; i11++) {
            str = str + "[" + this.mTimePoints[i11] + " , " + decimalFormat.format(this.mValues[i11]) + "] ";
        }
        return str;
    }
}
