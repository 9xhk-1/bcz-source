package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ANTICIPATE = "cubic(0.36, 0, 0.66, -0.56)";
    private static final String ANTICIPATE_NAME = "anticipate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String OVERSHOOT = "cubic(0.34, 1.56, 0.64, 1)";
    private static final String OVERSHOOT_NAME = "overshoot";
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    String mStr = "identity";
    static Easing sDefault = new Easing();
    private static final String STANDARD_NAME = "standard";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new CubicEasing(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        switch (str) {
            case "accelerate":
                return new CubicEasing(ACCELERATE);
            case "decelerate":
                return new CubicEasing(DECELERATE);
            case "anticipate":
                return new CubicEasing(ANTICIPATE);
            case "linear":
                return new CubicEasing(LINEAR);
            case "overshoot":
                return new CubicEasing(OVERSHOOT);
            case "standard":
                return new CubicEasing(STANDARD);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return sDefault;
        }
    }

    public double getDiff(double d11) {
        return 1.0d;
    }

    public String toString() {
        return this.mStr;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CubicEasing extends Easing {
        private static double sDError = 1.0E-4d;
        private static double sError = 0.01d;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public CubicEasing(String str) {
            this.mStr = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.mX1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i11 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i11);
            this.mY1 = Double.parseDouble(str.substring(i11, indexOf3).trim());
            int i12 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i12);
            this.mX2 = Double.parseDouble(str.substring(i12, indexOf4).trim());
            int i13 = indexOf4 + 1;
            this.mY2 = Double.parseDouble(str.substring(i13, str.indexOf(41, i13)).trim());
        }

        private double getDiffX(double d11) {
            double d12 = 1.0d - d11;
            double d13 = this.mX1;
            double d14 = this.mX2;
            return (d12 * 3.0d * d12 * d13) + (d12 * 6.0d * d11 * (d14 - d13)) + (3.0d * d11 * d11 * (1.0d - d14));
        }

        private double getDiffY(double d11) {
            double d12 = 1.0d - d11;
            double d13 = this.mY1;
            double d14 = this.mY2;
            return (d12 * 3.0d * d12 * d13) + (d12 * 6.0d * d11 * (d14 - d13)) + (3.0d * d11 * d11 * (1.0d - d14));
        }

        private double getX(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            return (this.mX1 * d12 * d13 * d11) + (this.mX2 * d13 * d11 * d11) + (d11 * d11 * d11);
        }

        private double getY(double d11) {
            double d12 = 1.0d - d11;
            double d13 = 3.0d * d12;
            return (this.mY1 * d12 * d13 * d11) + (this.mY2 * d13 * d11 * d11) + (d11 * d11 * d11);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > sError) {
                d12 *= 0.5d;
                d13 = getX(d13) < d11 ? d13 + d12 : d13 - d12;
            }
            double d14 = d13 - d12;
            double x11 = getX(d14);
            double d15 = d13 + d12;
            double x12 = getX(d15);
            double y11 = getY(d14);
            return (((getY(d15) - y11) * (d11 - x11)) / (x12 - x11)) + y11;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d11) {
            double d12 = 0.5d;
            double d13 = 0.5d;
            while (d12 > sDError) {
                d12 *= 0.5d;
                d13 = getX(d13) < d11 ? d13 + d12 : d13 - d12;
            }
            double d14 = d13 - d12;
            double d15 = d13 + d12;
            return (getY(d15) - getY(d14)) / (getX(d15) - getX(d14));
        }

        public void setup(double d11, double d12, double d13, double d14) {
            this.mX1 = d11;
            this.mY1 = d12;
            this.mX2 = d13;
            this.mY2 = d14;
        }

        public CubicEasing(double d11, double d12, double d13, double d14) {
            setup(d11, d12, d13, d14);
        }
    }

    public double get(double d11) {
        return d11;
    }
}
