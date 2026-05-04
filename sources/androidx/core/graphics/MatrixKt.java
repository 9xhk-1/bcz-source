package androidx.core.graphics;

import android.graphics.Matrix;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/core/graphics/MatrixKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* loaded from: classes2.dex */
public final class MatrixKt {
    @m80.k
    public static final Matrix rotationMatrix(float f11, float f12, float f13) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f11, f12, f13);
        return matrix;
    }

    public static /* synthetic */ Matrix rotationMatrix$default(float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        return rotationMatrix(f11, f12, f13);
    }

    @m80.k
    public static final Matrix scaleMatrix(float f11, float f12) {
        Matrix matrix = new Matrix();
        matrix.setScale(f11, f12);
        return matrix;
    }

    public static /* synthetic */ Matrix scaleMatrix$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        return scaleMatrix(f11, f12);
    }

    @m80.k
    public static final Matrix times(@m80.k Matrix matrix, @m80.k Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @m80.k
    public static final Matrix translationMatrix(float f11, float f12) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f11, f12);
        return matrix;
    }

    public static /* synthetic */ Matrix translationMatrix$default(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        return translationMatrix(f11, f12);
    }

    @m80.k
    public static final float[] values(@m80.k Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
