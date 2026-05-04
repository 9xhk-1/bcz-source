package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double mPI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d11, float f11) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d11;
        this.mPeriod[binarySearch] = f11;
        this.mNormalized = false;
    }

    public double getDP(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f11 = fArr[binarySearch];
        int i11 = binarySearch - 1;
        float f12 = fArr[i11];
        double d12 = f11 - f12;
        double[] dArr = this.mPosition;
        double d13 = dArr[binarySearch];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return (d11 * d15) + (f12 - (d15 * d14));
    }

    public double getP(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f11 = fArr[binarySearch];
        int i11 = binarySearch - 1;
        float f12 = fArr[i11];
        double d12 = f11 - f12;
        double[] dArr = this.mPosition;
        double d13 = dArr[binarySearch];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return this.mArea[i11] + ((f12 - (d15 * d14)) * (d11 - d14)) + ((d15 * ((d11 * d11) - (d14 * d14))) / 2.0d);
    }

    public double getSlope(double d11, double d12, double d13) {
        double p11 = d12 + getP(d11);
        double dp2 = getDP(d11) + d13;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                return dp2 * 4.0d * Math.signum((((p11 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp2 * 2.0d;
            case 4:
                return (-dp2) * 2.0d;
            case 5:
                double d14 = this.mPI2;
                return (-d14) * dp2 * Math.sin(d14 * p11);
            case 6:
                return dp2 * 4.0d * ((((p11 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p11 % 1.0d, 0);
            default:
                double d15 = this.mPI2;
                return dp2 * d15 * Math.cos(d15 * p11);
        }
    }

    public double getValue(double d11, double d12) {
        double abs;
        double p11 = getP(d11) + d12;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p11 % 1.0d));
            case 2:
                abs = Math.abs((((p11 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p11 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p11 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.mPI2 * (d12 + p11));
            case 6:
                double abs2 = 1.0d - Math.abs(((p11 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p11 % 1.0d, 0);
            default:
                return Math.sin(this.mPI2 * p11);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            if (i11 >= this.mPeriod.length) {
                break;
            }
            d11 += r6[i11];
            i11++;
        }
        double d12 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i12 >= fArr.length) {
                break;
            }
            int i13 = i12 - 1;
            float f11 = (fArr[i13] + fArr[i12]) / 2.0f;
            double[] dArr = this.mPosition;
            d12 += (dArr[i12] - dArr[i13]) * f11;
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i14 >= fArr2.length) {
                break;
            }
            fArr2[i14] = fArr2[i14] * ((float) (d11 / d12));
            i14++;
        }
        this.mArea[0] = 0.0d;
        int i15 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i15 >= fArr3.length) {
                this.mNormalized = true;
                return;
            }
            int i16 = i15 - 1;
            float f12 = (fArr3[i16] + fArr3[i15]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d13 = dArr2[i15] - dArr2[i16];
            double[] dArr3 = this.mArea;
            dArr3[i15] = dArr3[i16] + (d13 * f12);
            i15++;
        }
    }

    public void setType(int i11, String str) {
        this.mType = i11;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
