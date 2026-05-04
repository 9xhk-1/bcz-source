package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ViewSpline extends SplineSet {
    private static final String TAG = "ViewSpline";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AlphaSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setAlpha(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomSet extends ViewSpline {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i11, float f11) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i12);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i13 = 0;
                while (true) {
                    if (i13 < this.mTempValues.length) {
                        dArr2[i12][i13] = r6[i13];
                        i13++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public void setPoint(int i11, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i11, constraintAttribute);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ElevationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setElevation(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PivotXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setPivotX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PivotYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setPivotY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProgressSet extends ViewSpline {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f11));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f11)));
                } catch (IllegalAccessException e11) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e12);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotation(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotationX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setRotationY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setScaleX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setScaleY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationZset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
            view.setTranslationZ(get(f11));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline makeSpline(String str) {
        str.getClass();
        switch (str) {
        }
        return new AlphaSet();
    }

    public abstract void setProperty(View view, float f11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f11, double d11, double d12) {
            view.setRotation(get(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f11) {
        }
    }
}
