package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class MatrixUtils {
    static final Matrix IDENTITY_MATRIX = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        public void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11, float f12, float f13) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12, float f13, float f14) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12, float f13, float f14) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11, float f12, float f13) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12, float f13, float f14) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12, float f13, float f14) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            oops();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            oops();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i11, float[] fArr2, int i12, int i13) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11, float f12, float f13) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12, float f13, float f14) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12, float f13, float f14) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12, float f13, float f14) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f11, float f12) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            oops();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12) {
            oops();
        }
    };

    private MatrixUtils() {
    }
}
