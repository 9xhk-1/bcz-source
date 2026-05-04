package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f11, float f12) {
        Matrix.translateM(fArr, 0, -f11, -f12, 0.0f);
    }

    private static void normalize(float[] fArr, float f11, float f12) {
        Matrix.translateM(fArr, 0, f11, f12, 0.0f);
    }

    public static void postRotate(@NonNull float[] fArr, float f11, float f12, float f13) {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            try {
                Matrix.setIdentityM(fArr2, 0);
                normalize(fArr2, f12, f13);
                Matrix.rotateM(fArr2, 0, f11, 0.0f, 0.0f, 1.0f);
                denormalize(fArr2, f12, f13);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
            } catch (Throwable th3) {
                th = th3;
                fArr2 = fArr2;
                Throwable th4 = th;
                throw th4;
            }
        }
    }

    public static void preRotate(@NonNull float[] fArr, float f11, float f12, float f13) {
        normalize(fArr, f12, f13);
        Matrix.rotateM(fArr, 0, f11, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f12, f13);
    }

    public static void preVerticalFlip(@NonNull float[] fArr, float f11) {
        normalize(fArr, 0.0f, f11);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f11);
    }

    public static void setRotate(@NonNull float[] fArr, float f11, float f12, float f13) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f11, f12, f13);
    }

    @NonNull
    public static String toString(@NonNull float[] fArr, int i11) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i11]), Float.valueOf(fArr[i11 + 4]), Float.valueOf(fArr[i11 + 8]), Float.valueOf(fArr[i11 + 12]), Float.valueOf(fArr[i11 + 1]), Float.valueOf(fArr[i11 + 5]), Float.valueOf(fArr[i11 + 9]), Float.valueOf(fArr[i11 + 13]), Float.valueOf(fArr[i11 + 2]), Float.valueOf(fArr[i11 + 6]), Float.valueOf(fArr[i11 + 10]), Float.valueOf(fArr[i11 + 14]), Float.valueOf(fArr[i11 + 3]), Float.valueOf(fArr[i11 + 7]), Float.valueOf(fArr[i11 + 11]), Float.valueOf(fArr[i11 + 15]));
    }
}
