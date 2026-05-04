package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class ViewUtilsApi19 {
    private static final String TAG = "ViewUtilsApi19";
    private static final int VISIBILITY_MASK = 12;
    private static boolean sSetFrameFetched = false;
    private static Method sSetFrameMethod = null;
    private static boolean sTryHiddenTransitionAlpha = true;
    private static Field sViewFlagsField;
    private static boolean sViewFlagsFieldFetched;
    private float[] mMatrixValues;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static float getTransitionAlpha(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        @DoNotInline
        public static void setTransitionAlpha(View view, float f11) {
            view.setTransitionAlpha(f11);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void fetchSetFrame() {
        if (sSetFrameFetched) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            sSetFrameMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i(TAG, "Failed to retrieve setFrame method", e11);
        }
        sSetFrameFetched = true;
    }

    @SuppressLint({"NewApi"})
    public float getTransitionAlpha(@NonNull View view) {
        if (sTryHiddenTransitionAlpha) {
            try {
                return Api29Impl.getTransitionAlpha(view);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        return view.getAlpha();
    }

    public void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX(view.getWidth() / 2);
            view.setPivotY(view.getHeight() / 2);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.mMatrixValues;
        if (fArr == null) {
            fArr = new float[9];
            this.mMatrixValues = fArr;
        }
        matrix.getValues(fArr);
        float f11 = fArr[3];
        float sqrt = ((float) Math.sqrt(1.0f - (f11 * f11))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) Math.toDegrees(Math.atan2(f11, sqrt));
        float f12 = fArr[0] / sqrt;
        float f13 = fArr[4] / sqrt;
        float f14 = fArr[2];
        float f15 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        view.setRotation(degrees);
        view.setScaleX(f12);
        view.setScaleY(f13);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void setLeftTopRightBottom(@NonNull View view, int i11, int i12, int i13, int i14) {
        fetchSetFrame();
        Method method = sSetFrameMethod;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void setTransitionAlpha(@NonNull View view, float f11) {
        if (sTryHiddenTransitionAlpha) {
            try {
                Api29Impl.setTransitionAlpha(view, f11);
                return;
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        view.setAlpha(f11);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void setTransitionVisibility(@NonNull View view, int i11) {
        if (!sViewFlagsFieldFetched) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                sViewFlagsField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(TAG, "fetchViewFlagsField: ");
            }
            sViewFlagsFieldFetched = true;
        }
        Field field = sViewFlagsField;
        if (field != null) {
            try {
                sViewFlagsField.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToGlobal((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToLocal((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void clearNonTransitionAlpha(@NonNull View view) {
    }

    public void saveNonTransitionAlpha(@NonNull View view) {
    }
}
