package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setAlpha(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            this.mCurveFit.getPos(f11, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f14 = (float) ((this.mLastCycle + ((j12 * 1.0E-9d) * f12)) % 1.0d);
            this.mLastCycle = f14;
            this.mLastTime = j11;
            float calcWave = calcWave(f14);
            this.mContinue = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.mContinue;
                float f15 = this.mTempValues[i11];
                this.mContinue = z11 | (((double) f15) != 0.0d);
                fArr2[i11] = (f15 * calcWave) + f13;
                i11++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f12 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i11) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i12 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i12];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i13);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i13);
                float[] valueAt2 = this.mWaveProperties.valueAt(i13);
                dArr[i13] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i14 = 0;
                while (true) {
                    if (i14 < this.mTempValues.length) {
                        dArr2[i13][i14] = r8[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i11, dArr, dArr2);
        }

        public void setPoint(int i11, ConstraintAttribute constraintAttribute, float f11, int i12, float f12) {
            this.mConstraintAttributeList.append(i11, constraintAttribute);
            this.mWaveProperties.append(i11, new float[]{f11, f12});
            this.mWaveShape = Math.max(this.mWaveShape, i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setElevation(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f11, long j11, double d11, double d12) {
            view.setRotation(get(f11, j11, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            ProgressSet progressSet;
            Method method;
            if (view instanceof MotionLayout) {
                progressSet = this;
                ((MotionLayout) view).setProgress(get(f11, j11, view, keyCache));
            } else {
                progressSet = this;
                if (progressSet.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    progressSet.mNoMethod = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(progressSet.get(f11, j11, view, keyCache)));
                    } catch (IllegalAccessException e11) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e12);
                    }
                }
            }
            return progressSet.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setRotation(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setRotationX(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setRotationY(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setScaleX(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setScaleY(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setTranslationX(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setTranslationY(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f11, long j11, KeyCache keyCache) {
            view.setTranslationZ(get(f11, j11, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j11) {
        ViewTimeCycle rotationXset;
        str.getClass();
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                rotationXset = new ProgressSet();
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j11);
        return rotationXset;
    }

    public float get(float f11, long j11, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f11, this.mCache);
        float[] fArr = this.mCache;
        float f12 = fArr[1];
        if (f12 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f13 = (float) ((this.mLastCycle + (((j11 - this.mLastTime) * 1.0E-9d) * f12)) % 1.0d);
        this.mLastCycle = f13;
        keyCache.setFloatValue(view, this.mType, 0, f13);
        this.mLastTime = j11;
        float f14 = this.mCache[0];
        float calcWave = (calcWave(this.mLastCycle) * f14) + this.mCache[2];
        this.mContinue = (f14 == 0.0f && f12 == 0.0f) ? false : true;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f11, long j11, KeyCache keyCache);
}
