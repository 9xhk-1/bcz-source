package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Constant extends CurveFit {
        double mTime;
        double[] mValue;

        public Constant(double d11, double[] dArr) {
            this.mTime = d11;
            this.mValue = dArr;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d11, double[] dArr) {
            double[] dArr2 = this.mValue;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getSlope(double d11, int i11) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] getTimePoints() {
            return new double[]{this.mTime};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getPos(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.mValue;
                if (i11 >= dArr.length) {
                    return;
                }
                fArr[i11] = (float) dArr[i11];
                i11++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void getSlope(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.mValue.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double getPos(double d11, int i11) {
            return this.mValue[i11];
        }
    }

    public static CurveFit get(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        return i11 != 0 ? i11 != 2 ? new LinearCurveFit(dArr, dArr2) : new Constant(dArr[0], dArr2[0]) : new MonotonicCurveFit(dArr, dArr2);
    }

    public static CurveFit getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new ArcCurveFit(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d11, int i11);

    public abstract void getPos(double d11, double[] dArr);

    public abstract void getPos(double d11, float[] fArr);

    public abstract double getSlope(double d11, int i11);

    public abstract void getSlope(double d11, double[] dArr);

    public abstract double[] getTimePoints();
}
