package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {
    private static final String TAG = "ViewOscillator";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AlphaSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setAlpha(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomSet extends ViewOscillator {
        protected ConstraintAttribute mCustom;
        float[] mValue = new float[1];

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setCustom(Object obj) {
            this.mCustom = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            this.mValue[0] = get(f11);
            CustomSupport.setInterpolatedValue(this.mCustom, view, this.mValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ElevationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setElevation(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ProgressSet extends ViewOscillator {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
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
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e11);
                } catch (InvocationTargetException e12) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e12);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setRotation(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setRotationX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RotationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setRotationY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setScaleX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScaleYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setScaleY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setTranslationX(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setTranslationY(get(f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TranslationZset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
            view.setTranslationZ(get(f11));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
        switch (str) {
            case "rotationX":
                return new RotationXset();
            case "rotationY":
                return new RotationYset();
            case "translationX":
                return new TranslationXset();
            case "translationY":
                return new TranslationYset();
            case "translationZ":
                return new TranslationZset();
            case "progress":
                return new ProgressSet();
            case "scaleX":
                return new ScaleXset();
            case "scaleY":
                return new ScaleYset();
            case "waveVariesBy":
                return new AlphaSet();
            case "rotation":
                return new RotationSet();
            case "elevation":
                return new ElevationSet();
            case "transitionPathRotate":
                return new PathRotateSet();
            case "alpha":
                return new AlphaSet();
            case "waveOffset":
                return new AlphaSet();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f11, double d11, double d12) {
            view.setRotation(get(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f11) {
        }
    }
}
