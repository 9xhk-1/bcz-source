package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CamUtils {
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static int intFromLStar(float f11) {
        if (f11 < 1.0f) {
            return -16777216;
        }
        if (f11 > 99.0f) {
            return -1;
        }
        float f12 = (f11 + 16.0f) / 116.0f;
        float f13 = f11 > 8.0f ? f12 * f12 * f12 : f11 / 903.2963f;
        float f14 = f12 * f12 * f12;
        boolean z11 = f14 > 0.008856452f;
        float f15 = z11 ? f14 : ((f12 * 116.0f) - 16.0f) / 903.2963f;
        if (!z11) {
            f14 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f15 * fArr[0], f13 * fArr[1], f14 * fArr[2]);
    }

    public static float lStarFromInt(int i11) {
        return lStarFromY(yFromInt(i11));
    }

    public static float lStarFromY(float f11) {
        float f12 = f11 / 100.0f;
        return f12 <= 0.008856452f ? f12 * 903.2963f : (((float) Math.cbrt(f12)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    public static float linearized(int i11) {
        float f11 = i11 / 255.0f;
        return (f11 <= 0.04045f ? f11 / 12.92f : (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void xyzFromInt(int i11, @NonNull float[] fArr) {
        float linearized = linearized(Color.red(i11));
        float linearized2 = linearized(Color.green(i11));
        float linearized3 = linearized(Color.blue(i11));
        float[][] fArr2 = SRGB_TO_XYZ;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * linearized) + (fArr3[1] * linearized2) + (fArr3[2] * linearized3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * linearized) + (fArr4[1] * linearized2) + (fArr4[2] * linearized3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (linearized * fArr5[0]) + (linearized2 * fArr5[1]) + (linearized3 * fArr5[2]);
    }

    public static float yFromInt(int i11) {
        float linearized = linearized(Color.red(i11));
        float linearized2 = linearized(Color.green(i11));
        float linearized3 = linearized(Color.blue(i11));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized * fArr[0]) + (linearized2 * fArr[1]) + (linearized3 * fArr[2]);
    }

    public static float yFromLStar(float f11) {
        return (f11 > 8.0f ? (float) Math.pow((f11 + 16.0d) / 116.0d, 3.0d) : f11 / 903.2963f) * 100.0f;
    }
}
