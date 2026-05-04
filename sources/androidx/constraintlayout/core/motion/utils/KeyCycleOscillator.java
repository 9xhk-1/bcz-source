package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CoreSpline extends KeyCycleOscillator {
        String mType;
        int mTypeId;

        public CoreSpline(String str) {
            this.mType = str;
            this.mTypeId = TypedValues.CycleType.getId(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f11) {
            motionWidget.setValue(this.mTypeId, get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        static final int UNSET = -1;
        CurveFit mCurveFit;
        float[] mOffsetArr;
        private final int mOffst;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        private final int mPhase;
        float[] mPhaseArr;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        private final int mValue;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        public CycleOscillator(int i11, String str, int i12, int i13) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.mOffst = 0;
            this.mPhase = 1;
            this.mValue = 2;
            this.mWaveShape = i11;
            this.mVariesBy = i12;
            oscillator.setType(i11, str);
            this.mValues = new float[i13];
            this.mPosition = new double[i13];
            this.mPeriod = new float[i13];
            this.mOffsetArr = new float[i13];
            this.mPhaseArr = new float[i13];
            this.mScale = new float[i13];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f11) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d11 = f11;
                curveFit.getSlope(d11, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d11, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d12 = f11;
            double value = this.mOscillator.getValue(d12, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d12, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return dArr2[0] + (value * dArr2[2]) + (slope * this.mSplineValueCache[2]);
        }

        public double getValues(float f11) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f11, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffsetArr[0];
                dArr[1] = this.mPhaseArr[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue(f11, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i11, int i12, float f11, float f12, float f13, float f14) {
            this.mPosition[i11] = i12 / 100.0d;
            this.mPeriod[i11] = f11;
            this.mOffsetArr[i11] = f12;
            this.mPhaseArr[i11] = f13;
            this.mValues[i11] = f14;
        }

        public void setup(float f11) {
            this.mPathLength = f11;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                double[] dArr3 = dArr[i11];
                dArr3[0] = this.mOffsetArr[i11];
                dArr3[1] = this.mPhaseArr[i11];
                dArr3[2] = this.mValues[i11];
                this.mOscillator.addPoint(this.mPosition[i11], this.mPeriod[i11]);
            }
            this.mOscillator.normalize();
            double[] dArr4 = this.mPosition;
            if (dArr4.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr4, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PathRotateSet extends KeyCycleOscillator {
        String mType;
        int mTypeId;

        public PathRotateSet(String str) {
            this.mType = str;
            this.mTypeId = TypedValues.CycleType.getId(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f11, double d11, double d12) {
            motionWidget.setRotationZ(get(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f11) {
            motionWidget.setValue(this.mTypeId, get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i11, float f11, float f12, float f13, float f14) {
            this.mPosition = i11;
            this.mValue = f14;
            this.mOffset = f12;
            this.mPeriod = f11;
            this.mPhase = f13;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        return str.equals("pathRotate") ? new PathRotateSet(str) : new CoreSpline(str);
    }

    public float get(float f11) {
        return (float) this.mCycleOscillator.getValues(f11);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f11) {
        return (float) this.mCycleOscillator.getSlope(f11);
    }

    public void setPoint(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14, Object obj) {
        this.mWavePoints.add(new WavePoint(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.mVariesBy = i13;
        }
        this.mWaveShape = i12;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f11) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            WavePoint next = it.next();
            float f12 = next.mPeriod;
            dArr[i11] = f12 * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f13 = next.mValue;
            dArr3[0] = f13;
            float f14 = next.mOffset;
            dArr3[1] = f14;
            float f15 = next.mPhase;
            dArr3[2] = f15;
            this.mCycleOscillator.setPoint(i11, next.mPosition, f12, f14, f15, f13);
            i11++;
        }
        this.mCycleOscillator.setup(f11);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().mPosition + " , " + decimalFormat.format(r3.mValue) + "] ";
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    public void setPoint(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14) {
        this.mWavePoints.add(new WavePoint(i11, f11, f12, f13, f14));
        if (i13 != -1) {
            this.mVariesBy = i13;
        }
        this.mWaveShape = i12;
        this.mWaveString = str;
    }

    public void setCustom(Object obj) {
    }

    public void setProperty(MotionWidget motionWidget, float f11) {
    }
}
