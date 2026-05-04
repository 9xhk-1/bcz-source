package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i11 = (int) (length / 0.002f);
        int i12 = i11 + 1;
        this.mX = new float[i12];
        this.mY = new float[i12];
        float[] fArr = new float[2];
        for (int i13 = 0; i13 < i12; i13++) {
            pathMeasure.getPosTan((i13 * length) / i11, fArr, null);
            this.mX[i13] = fArr[0];
            this.mY[i13] = fArr[1];
        }
    }

    private static Path createCubic(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f11, f12, f13, f14, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f11, float f12) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f11, f12, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i11 = 0;
        while (length - i11 > 1) {
            int i12 = (i11 + length) / 2;
            if (f11 < this.mX[i12]) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        float[] fArr = this.mX;
        float f12 = fArr[length];
        float f13 = fArr[i11];
        float f14 = f12 - f13;
        if (f14 == 0.0f) {
            return this.mY[i11];
        }
        float f15 = (f11 - f13) / f14;
        float[] fArr2 = this.mY;
        float f16 = fArr2[i11];
        return f16 + (f15 * (fArr2[length] - f16));
    }

    public PathInterpolatorApi14(float f11, float f12) {
        this(createQuad(f11, f12));
    }

    public PathInterpolatorApi14(float f11, float f12, float f13, float f14) {
        this(createCubic(f11, f12, f13, f14));
    }
}
