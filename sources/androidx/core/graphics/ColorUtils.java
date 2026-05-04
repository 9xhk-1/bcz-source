package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.CamColor;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static Color compositeColors(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + pn.j.f81007d);
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = color2.alpha() * (1.0f - alpha);
            int componentCount = color2.getComponentCount() - 1;
            float f11 = alpha + alpha2;
            components2[componentCount] = f11;
            if (f11 > 0.0f) {
                alpha /= f11;
                alpha2 /= f11;
            }
            for (int i11 = 0; i11 < componentCount; i11++) {
                components2[i11] = (components[i11] * alpha) + (components2[i11] * alpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] fArr) {
        int round;
        int round2;
        int round3;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float abs = (1.0f - Math.abs((f13 * 2.0f) - 1.0f)) * f12;
        float f14 = f13 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f11 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f11) / 60) {
            case 0:
                round = Math.round((abs + f14) * 255.0f);
                round2 = Math.round((abs2 + f14) * 255.0f);
                round3 = Math.round(f14 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f14) * 255.0f);
                round2 = Math.round((abs + f14) * 255.0f);
                round3 = Math.round(f14 * 255.0f);
                break;
            case 2:
                round = Math.round(f14 * 255.0f);
                round2 = Math.round((abs + f14) * 255.0f);
                round3 = Math.round((abs2 + f14) * 255.0f);
                break;
            case 3:
                round = Math.round(f14 * 255.0f);
                round2 = Math.round((abs2 + f14) * 255.0f);
                round3 = Math.round((abs + f14) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f14) * 255.0f);
                round2 = Math.round(f14 * 255.0f);
                round3 = Math.round((abs + f14) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f14) * 255.0f);
                round2 = Math.round(f14 * 255.0f);
                round3 = Math.round((abs2 + f14) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(constrain(round, 0, 255), constrain(round2, 0, 255), constrain(round3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d11, @FloatRange(from = -128.0d, to = 127.0d) double d12, @FloatRange(from = -128.0d, to = 127.0d) double d13) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d11, d12, d13, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d11, @FloatRange(from = -128.0d, to = 127.0d) double d12, @FloatRange(from = -128.0d, to = 127.0d) double d13, @NonNull double[] dArr) {
        double d14 = (d11 + 16.0d) / 116.0d;
        double d15 = (d12 / 500.0d) + d14;
        double d16 = d14 - (d13 / 200.0d);
        double pow = Math.pow(d15, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d15 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        double pow2 = d11 > 7.9996247999999985d ? Math.pow(d14, 3.0d) : d11 / XYZ_KAPPA;
        double pow3 = Math.pow(d16, 3.0d);
        if (pow3 <= XYZ_EPSILON) {
            pow3 = ((d16 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = pow2 * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = pow3 * XYZ_WHITE_REFERENCE_Z;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0d, to = 360.0d, toInclusive = false) float f11, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, to = 100.0d) float f13) {
        return CamColor.toColor(f11, f12, f13);
    }

    public static void RGBToHSL(@IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @IntRange(from = 0, to = 255) int i13, @NonNull float[] fArr) {
        float f11;
        float abs;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float f14 = i13 / 255.0f;
        float max = Math.max(f12, Math.max(f13, f14));
        float min = Math.min(f12, Math.min(f13, f14));
        float f15 = max - min;
        float f16 = (max + min) / 2.0f;
        if (max == min) {
            f11 = 0.0f;
            abs = 0.0f;
        } else {
            f11 = max == f12 ? ((f13 - f14) / f15) % 6.0f : max == f13 ? ((f14 - f12) / f15) + 2.0f : 4.0f + ((f12 - f13) / f15);
            abs = f15 / (1.0f - Math.abs((2.0f * f16) - 1.0f));
        }
        float f17 = (f11 * 60.0f) % 360.0f;
        if (f17 < 0.0f) {
            f17 += 360.0f;
        }
        fArr[0] = constrain(f17, 0.0f, 360.0f);
        fArr[1] = constrain(abs, 0.0f, 1.0f);
        fArr[2] = constrain(f16, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @IntRange(from = 0, to = 255) int i13, @NonNull double[] dArr) {
        RGBToXYZ(i11, i12, i13, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @IntRange(from = 0, to = 255) int i13, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d11 = i11 / 255.0d;
        double pow = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = i12 / 255.0d;
        double pow2 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        double d13 = i13 / 255.0d;
        double pow3 = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * XYZ_WHITE_REFERENCE_Y;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * XYZ_WHITE_REFERENCE_Y;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d11, @FloatRange(from = 0.0d, to = 100.0d) double d12, @FloatRange(from = 0.0d, to = 108.883d) double d13) {
        double d14 = (((3.2406d * d11) + ((-1.5372d) * d12)) + ((-0.4986d) * d13)) / XYZ_WHITE_REFERENCE_Y;
        double d15 = ((((-0.9689d) * d11) + (1.8758d * d12)) + (0.0415d * d13)) / XYZ_WHITE_REFERENCE_Y;
        double d16 = (((0.0557d * d11) + ((-0.204d) * d12)) + (1.057d * d13)) / XYZ_WHITE_REFERENCE_Y;
        return Color.rgb(constrain((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d11, @FloatRange(from = 0.0d, to = 100.0d) double d12, @FloatRange(from = 0.0d, to = 108.883d) double d13, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double pivotXyzComponent = pivotXyzComponent(d11 / XYZ_WHITE_REFERENCE_X);
        double pivotXyzComponent2 = pivotXyzComponent(d12 / XYZ_WHITE_REFERENCE_Y);
        double pivotXyzComponent3 = pivotXyzComponent(d13 / XYZ_WHITE_REFERENCE_Z);
        dArr[0] = Math.max(0.0d, (116.0d * pivotXyzComponent2) - 16.0d);
        dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
        dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i11, @ColorInt int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        float f12 = 1.0f - f11;
        return Color.argb((int) ((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), (int) ((Color.red(i11) * f12) + (Color.red(i12) * f11)), (int) ((Color.green(i11) * f12) + (Color.green(i12) * f11)), (int) ((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f11, @NonNull float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f12 = 1.0f - f11;
        fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f11);
        fArr3[1] = (fArr[1] * f12) + (fArr2[1] * f11);
        fArr3[2] = (fArr[2] * f12) + (fArr2[2] * f11);
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d11, @NonNull double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d12 = 1.0d - d11;
        dArr3[0] = (dArr[0] * d12) + (dArr2[0] * d11);
        dArr3[1] = (dArr[1] * d12) + (dArr2[1] * d11);
        dArr3[2] = (dArr[2] * d12) + (dArr2[2] * d11);
    }

    public static double calculateContrast(@ColorInt int i11, @ColorInt int i12) {
        if (Color.alpha(i12) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i12));
        }
        if (Color.alpha(i11) < 255) {
            i11 = compositeColors(i11, i12);
        }
        double calculateLuminance = calculateLuminance(i11) + 0.05d;
        double calculateLuminance2 = calculateLuminance(i12) + 0.05d;
        return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i11) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i11, tempDouble3Array);
        return tempDouble3Array[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static int calculateMinimumAlpha(@ColorInt int i11, @ColorInt int i12, float f11) {
        int i13 = 255;
        if (Color.alpha(i12) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i12));
        }
        double d11 = f11;
        if (calculateContrast(setAlphaComponent(i11, 255), i12) < d11) {
            return -1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 <= 10 && i13 - i14 > 1; i15++) {
            int i16 = (i14 + i13) / 2;
            if (calculateContrast(setAlphaComponent(i11, i16), i12) < d11) {
                i14 = i16;
            } else {
                i13 = i16;
            }
        }
        return i13;
    }

    @VisibleForTesting
    public static float circularInterpolate(float f11, float f12, float f13) {
        if (Math.abs(f12 - f11) > 180.0f) {
            if (f12 > f11) {
                f11 += 360.0f;
            } else {
                f12 += 360.0f;
            }
        }
        return (f11 + ((f12 - f11) * f13)) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i11, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i11), Color.green(i11), Color.blue(i11), fArr);
    }

    public static void colorToLAB(@ColorInt int i11, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i11), Color.green(i11), Color.blue(i11), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i11, @NonNull @Size(3) float[] fArr) {
        CamColor.getM3HCTfromColor(i11, fArr);
    }

    public static void colorToXYZ(@ColorInt int i11, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i11), Color.green(i11), Color.blue(i11), dArr);
    }

    private static int compositeAlpha(int i11, int i12) {
        return 255 - (((255 - i12) * (255 - i11)) / 255);
    }

    public static int compositeColors(@ColorInt int i11, @ColorInt int i12) {
        int alpha = Color.alpha(i12);
        int alpha2 = Color.alpha(i11);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i11), alpha2, Color.red(i12), alpha, compositeAlpha), compositeComponent(Color.green(i11), alpha2, Color.green(i12), alpha, compositeAlpha), compositeComponent(Color.blue(i11), alpha2, Color.blue(i12), alpha, compositeAlpha));
    }

    private static int compositeComponent(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((i11 * 255) * i12) + ((i13 * i14) * (255 - i12))) / (i15 * 255);
    }

    private static float constrain(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : Math.min(f11, f13);
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d11) {
        return d11 > XYZ_EPSILON ? Math.pow(d11, 0.3333333333333333d) : ((d11 * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i11, @IntRange(from = 0, to = 255) int i12) {
        if (i12 < 0 || i12 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i11 & 16777215) | (i12 << 24);
    }

    private static int constrain(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : Math.min(i11, i13);
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }
}
