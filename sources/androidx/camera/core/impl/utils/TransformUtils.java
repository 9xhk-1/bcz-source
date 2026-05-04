package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static float calculateSignedAngle(float f11, float f12, float f13, float f14) {
        float f15 = (f11 * f13) + (f12 * f14);
        float f16 = (f11 * f14) - (f12 * f13);
        double sqrt = Math.sqrt((f11 * f11) + (f12 * f12)) * Math.sqrt((f13 * f13) + (f14 * f14));
        return (float) Math.toDegrees(Math.atan2(f16 / sqrt, f15 / sqrt));
    }

    @NonNull
    public static Matrix getExifTransform(int i11, int i12, int i13) {
        Matrix matrix = new Matrix();
        float f11 = i12;
        float f12 = i13;
        RectF rectF = new RectF(0.0f, 0.0f, f11, f12);
        RectF rectF2 = NORMALIZED_RECT;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        switch (i11) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f12, f11);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f12, f11);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f12, f11);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f12, f11);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    @NonNull
    public static Matrix getNormalizedToBuffer(@NonNull Rect rect) {
        return getNormalizedToBuffer(new RectF(rect));
    }

    @NonNull
    public static Matrix getRectToRect(@NonNull RectF rectF, @NonNull RectF rectF2, int i11) {
        return getRectToRect(rectF, rectF2, i11, false);
    }

    @NonNull
    public static Size getRotatedSize(@NonNull Rect rect, int i11) {
        return rotateSize(rectToSize(rect), i11);
    }

    public static int getRotationDegrees(@NonNull Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean hasCropping(@NonNull Rect rect, @NonNull Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean is90or270(int i11) {
        if (i11 == 90 || i11 == 270) {
            return true;
        }
        if (i11 == 0 || i11 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i11);
    }

    public static boolean isAspectRatioMatchingWithRoundingError(@NonNull Size size, @NonNull Size size2) {
        return isAspectRatioMatchingWithRoundingError(size, false, size2, false);
    }

    public static boolean isMirrored(@NonNull Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return calculateSignedAngle(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float max(float f11, float f12, float f13, float f14) {
        return Math.max(Math.max(f11, f12), Math.max(f13, f14));
    }

    public static float min(float f11, float f12, float f13, float f14) {
        return Math.min(Math.min(f11, f12), Math.min(f13, f14));
    }

    @NonNull
    public static Size rectToSize(@NonNull Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    @NonNull
    public static String rectToString(@NonNull Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    @NonNull
    public static float[] rectToVertices(@NonNull RectF rectF) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        return new float[]{f11, f12, f13, f12, f13, f14, f11, f14};
    }

    @NonNull
    public static Size reverseSize(@NonNull Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    @NonNull
    public static SizeF reverseSizeF(@NonNull SizeF sizeF) {
        return new SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    @NonNull
    public static RectF rotateRect(@NonNull RectF rectF, int i11) {
        Preconditions.checkArgument(i11 % 90 == 0, "Invalid rotation degrees: " + i11);
        return is90or270(within360(i11)) ? new RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    @NonNull
    public static Size rotateSize(@NonNull Size size, int i11) {
        Preconditions.checkArgument(i11 % 90 == 0, "Invalid rotation degrees: " + i11);
        return is90or270(within360(i11)) ? reverseSize(size) : size;
    }

    @NonNull
    public static Rect sizeToRect(@NonNull Size size) {
        return sizeToRect(size, 0, 0);
    }

    @NonNull
    public static RectF sizeToRectF(@NonNull Size size) {
        return sizeToRectF(size, 0, 0);
    }

    @NonNull
    public static float[] sizeToVertices(@NonNull Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    @NonNull
    public static Matrix updateSensorToBufferTransform(@NonNull Matrix matrix, @NonNull Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    @NonNull
    public static RectF verticesToRect(@NonNull float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static int within360(int i11) {
        return ((i11 % 360) + 360) % 360;
    }

    @NonNull
    public static Matrix getNormalizedToBuffer(@NonNull RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    @NonNull
    public static Matrix getRectToRect(@NonNull RectF rectF, @NonNull RectF rectF2, int i11, boolean z11) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i11);
        if (z11) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static boolean isAspectRatioMatchingWithRoundingError(@NonNull Size size, boolean z11, @NonNull Size size2, boolean z12) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z11) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z12) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    @NonNull
    public static Rect sizeToRect(@NonNull Size size, int i11, int i12) {
        return new Rect(i11, i12, size.getWidth() + i11, size.getHeight() + i12);
    }

    @NonNull
    public static RectF sizeToRectF(@NonNull Size size, int i11, int i12) {
        return new RectF(i11, i12, i11 + size.getWidth(), i12 + size.getHeight());
    }
}
