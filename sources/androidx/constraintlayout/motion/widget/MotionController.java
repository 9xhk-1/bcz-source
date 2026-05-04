package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ma.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MotionController {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    String[] mAttributeTable;
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int mMaxDimension = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();

    public MotionController(View view) {
        int i11 = Key.UNSET;
        this.mPathMotionArc = i11;
        this.mTransformPivotTarget = i11;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i11;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
    }

    private float getAdjustedPosition(float f11, float[] fArr) {
        float f12 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.mStaggerScale;
            if (f13 != 1.0d) {
                float f14 = this.mStaggerOffset;
                if (f11 < f14) {
                    f11 = 0.0f;
                }
                if (f11 > f14 && f11 < 1.0d) {
                    f11 = Math.min((f11 - f14) * f13, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        float f15 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f16 = next.mTime;
                if (f16 < f11) {
                    easing = easing2;
                    f12 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.mTime;
                }
            }
        }
        if (easing != null) {
            float f17 = (Float.isNaN(f15) ? 1.0f : f15) - f12;
            double d11 = (f11 - f12) / f17;
            f11 = (((float) easing.get(d11)) * f17) + f12;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d11);
            }
        }
        return f11;
    }

    private static Interpolator getInterpolator(Context context, int i11, String str, int i12) {
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, i12);
        }
        if (i11 == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f11) {
                    return (float) Easing.this.get(f11);
                }
            };
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f11 = 1.0f / 99;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        float f12 = 0.0f;
        while (i11 < 100) {
            float f13 = i11 * f11;
            double d13 = f13;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f14 = Float.NaN;
            float f15 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f16 = next.mTime;
                    if (f16 < f13) {
                        easing = easing2;
                        f15 = f16;
                    } else if (Float.isNaN(f14)) {
                        f14 = next.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f14)) {
                    f14 = 1.0f;
                }
                d13 = (((float) easing.get((f13 - f15) / r17)) * (f14 - f15)) + f15;
            }
            double d14 = d13;
            this.mSpline[0].getPos(d14, this.mInterpolateData);
            int i12 = i11;
            this.mStartMotionPath.getCenter(d14, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i12 > 0) {
                f12 += (float) Math.hypot(d12 - fArr[1], d11 - fArr[0]);
            }
            d11 = fArr[0];
            d12 = fArr[1];
            i11 = i12 + 1;
        }
        return f12;
    }

    private void insertKey(MotionPaths motionPaths) {
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Log.e(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i11) {
        float f11 = 1.0f / (i11 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            float f12 = i12 * f11;
            float f13 = this.mStaggerScale;
            float f14 = 0.0f;
            if (f13 != 1.0f) {
                float f15 = this.mStaggerOffset;
                if (f12 < f15) {
                    f12 = 0.0f;
                }
                if (f12 > f15 && f12 < 1.0d) {
                    f12 = Math.min((f12 - f15) * f13, 1.0f);
                }
            }
            double d11 = f12;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f16 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f17 = next.mTime;
                    if (f17 < f12) {
                        easing = easing2;
                        f14 = f17;
                    } else if (Float.isNaN(f16)) {
                        f16 = next.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f16)) {
                    f16 = 1.0f;
                }
                d11 = (((float) easing.get((f12 - f14) / r12)) * (f16 - f14)) + f14;
            }
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i12 * 2);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().mMode;
                i11++;
            }
        }
        int i12 = 0;
        for (double d11 : timePoints) {
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = it.next().mMode;
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < timePoints.length; i13++) {
            this.mSpline[0].getPos(timePoints[i13], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i13], this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void buildPath(float[] fArr, int i11) {
        int i12 = i11;
        float f11 = 1.0f;
        float f12 = 1.0f / (i12 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i13 = 0;
        while (i13 < i12) {
            float f13 = i13 * f12;
            float f14 = this.mStaggerScale;
            float f15 = 0.0f;
            if (f14 != f11) {
                float f16 = this.mStaggerOffset;
                if (f13 < f16) {
                    f13 = 0.0f;
                }
                if (f13 > f16 && f13 < 1.0d) {
                    f13 = Math.min((f13 - f16) * f14, f11);
                }
            }
            double d11 = f13;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f17 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f18 = next.mTime;
                    if (f18 < f13) {
                        f15 = f18;
                        easing = easing2;
                    } else if (Float.isNaN(f17)) {
                        f17 = next.mTime;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f17)) {
                    f17 = 1.0f;
                }
                d11 = (((float) easing.get((f13 - f15) / r16)) * (f17 - f15)) + f15;
            }
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                }
            }
            int i14 = i13 * 2;
            this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, i14);
            if (viewOscillator != null) {
                fArr[i14] = fArr[i14] + viewOscillator.get(f13);
            } else if (viewSpline != null) {
                fArr[i14] = fArr[i14] + viewSpline.get(f13);
            }
            if (viewOscillator2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + viewOscillator2.get(f13);
            } else if (viewSpline2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + viewSpline2.get(f13);
            }
            i13++;
            i12 = i11;
            f11 = 1.0f;
        }
    }

    public void buildRect(float f11, float[] fArr, int i11) {
        this.mSpline[0].getPos(getAdjustedPosition(f11, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i11);
    }

    public void buildRectangles(float[] fArr, int i11) {
        float f11 = 1.0f / (i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            this.mSpline[0].getPos(getAdjustedPosition(i12 * f11, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i12 * 8);
        }
    }

    public void endTrigger(boolean z11) {
        if (!b.f72893b1.equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i11 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i11].conditionallyFire(z11 ? -100.0f : 100.0f, this.mView);
            i11++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i11) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i12 = 0; i12 < fArr.length; i12++) {
            fArr[i12] = viewSpline.get(i12 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d11, dArr);
        this.mSpline[0].getSlope(d11, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f11, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i11 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f14 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f15 = f14 - motionPaths2.mX;
            float f16 = motionPaths.mY - motionPaths2.mY;
            float f17 = (motionPaths.mWidth - motionPaths2.mWidth) + f15;
            float f18 = (motionPaths.mHeight - motionPaths2.mHeight) + f16;
            fArr[0] = (f15 * (1.0f - f12)) + (f17 * f12);
            fArr[1] = (f16 * (1.0f - f13)) + (f18 * f13);
            return;
        }
        double d11 = adjustedPosition;
        curveFitArr[0].getSlope(d11, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d11, this.mInterpolateData);
        float f19 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i11 >= dArr.length) {
                break;
            }
            dArr[i11] = dArr[i11] * f19;
            i11++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d11, dArr2);
            this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int i11 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, it.next().mDrawPath);
        }
        return Math.max(i11, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.mHeight;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.mWidth;
    }

    public float getFinalX() {
        return this.mEndMotionPath.mX;
    }

    public float getFinalY() {
        return this.mEndMotionPath.mY;
    }

    public MotionPaths getKeyFrame(int i11) {
        return this.mMotionPaths.get(i11);
    }

    public int getKeyFrameInfo(int i11, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i14 = next.mType;
            if (i14 == i11 || i11 != -1) {
                iArr[i13] = 0;
                iArr[i13 + 1] = i14;
                int i15 = next.mFramePosition;
                iArr[i13 + 2] = i15;
                double d11 = i15 / 100.0f;
                this.mSpline[0].getPos(d11, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i13 + 3] = Float.floatToIntBits(fArr[0]);
                int i16 = i13 + 4;
                iArr[i16] = Float.floatToIntBits(fArr[1]);
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    iArr[i13 + 5] = keyPosition.mPositionType;
                    iArr[i13 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i16 = i13 + 7;
                    iArr[i16] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i17 = i16 + 1;
                iArr[i13] = i17 - i13;
                i12++;
                i13 = i17;
            }
        }
        return i12;
    }

    public float getKeyFrameParameter(int i11, float f11, float f12) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f13 = motionPaths.mX;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f14 = motionPaths2.mX;
        float f15 = f13 - f14;
        float f16 = motionPaths.mY;
        float f17 = motionPaths2.mY;
        float f18 = f16 - f17;
        float f19 = f14 + (motionPaths2.mWidth / 2.0f);
        float f21 = f17 + (motionPaths2.mHeight / 2.0f);
        float hypot = (float) Math.hypot(f15, f18);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f22 = f11 - f19;
        float f23 = f12 - f21;
        if (((float) Math.hypot(f22, f23)) == 0.0f) {
            return 0.0f;
        }
        float f24 = (f22 * f15) + (f23 * f18);
        if (i11 == 0) {
            return f24 / hypot;
        }
        if (i11 == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f24 * f24));
        }
        if (i11 == 2) {
            return f22 / f15;
        }
        if (i11 == 3) {
            return f23 / f15;
        }
        if (i11 == 4) {
            return f22 / f18;
        }
        if (i11 != 5) {
            return 0.0f;
        }
        return f23 / f18;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<Key> it = this.mKeyList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            Key next = it.next();
            int i13 = next.mFramePosition;
            iArr[i11] = (next.mType * 1000) + i13;
            double d11 = i13 / 100.0f;
            this.mSpline[0].getPos(d11, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d11, this.mInterpolateVariables, this.mInterpolateData, fArr, i12);
            i12 += 2;
            i11++;
        }
        return i11;
    }

    public double[] getPos(double d11) {
        this.mSpline[0].getPos(d11, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d11, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public KeyPositionBase getPositionKeyframe(int i11, int i12, float f11, float f12) {
        int i13;
        int i14;
        float f13;
        float f14;
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f15 = motionPaths.mX;
        rectF.left = f15;
        float f16 = motionPaths.mY;
        rectF.top = f16;
        rectF.right = f15 + motionPaths.mWidth;
        rectF.bottom = f16 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f17 = motionPaths2.mX;
        rectF2.left = f17;
        float f18 = motionPaths2.mY;
        rectF2.top = f18;
        rectF2.right = f17 + motionPaths2.mWidth;
        rectF2.bottom = f18 + motionPaths2.mHeight;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                i13 = i11;
                i14 = i12;
                f13 = f11;
                f14 = f12;
                if (keyPositionBase.intersects(i13, i14, rectF, rectF2, f13, f14)) {
                    return keyPositionBase;
                }
            } else {
                i13 = i11;
                i14 = i12;
                f13 = f11;
                f14 = f12;
            }
            i11 = i13;
            i12 = i14;
            f11 = f13;
            f12 = f14;
        }
        return null;
    }

    public void getPostLayoutDvDp(float f11, int i11, int i12, float f12, float f13, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f11, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        ViewSpline viewSpline3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        ViewSpline viewSpline4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        ViewSpline viewSpline5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d11 = adjustedPosition;
                curveFit.getPos(d11, dArr);
                this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
            return;
        }
        int i13 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f14 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f15 = f14 - motionPaths2.mX;
            float f16 = motionPaths.mY - motionPaths2.mY;
            float f17 = (motionPaths.mWidth - motionPaths2.mWidth) + f15;
            float f18 = f16 + (motionPaths.mHeight - motionPaths2.mHeight);
            fArr[0] = (f15 * (1.0f - f12)) + (f17 * f12);
            fArr[1] = (f16 * (1.0f - f13)) + (f18 * f13);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f19 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i13 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f12, f13, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f12, f13, i11, i12, fArr);
                return;
            } else {
                dArr2[i13] = dArr2[i13] * f19;
                i13++;
            }
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.mHeight;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.mWidth;
    }

    public float getStartX() {
        return this.mStartMotionPath.mX;
    }

    public float getStartY() {
        return this.mStartMotionPath.mY;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f11, long j11, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z11;
        View view2;
        View view3;
        float f12;
        float f13;
        double d11;
        View view4 = view;
        float adjustedPosition = getAdjustedPosition(f11, null);
        int i11 = this.mQuantizeMotionSteps;
        if (i11 != Key.UNSET) {
            float f14 = 1.0f / i11;
            float floor = ((float) Math.floor(adjustedPosition / f14)) * f14;
            float f15 = (adjustedPosition % f14) / f14;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f15 = (f15 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f15) : ((double) f15) > 0.5d ? 1.0f : 0.0f) * f14) + floor;
        }
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<ViewSpline> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view4, adjustedPosition);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z12 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z12 |= viewTimeCycle.setProperty(view4, adjustedPosition, j11, keyCache);
                    view4 = view;
                }
            }
            z11 = z12;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z11 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d12 = adjustedPosition;
            curveFitArr[0].getPos(d12, this.mInterpolateData);
            this.mSpline[0].getSlope(d12, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d12, dArr);
                    this.mArcSpline.getSlope(d12, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                view3 = view;
                f12 = 1.0f;
                f13 = 0.0f;
                d11 = d12;
            } else {
                float f16 = adjustedPosition;
                f12 = 1.0f;
                d11 = d12;
                f13 = 0.0f;
                this.mStartMotionPath.setView(f16, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                adjustedPosition = f16;
                view3 = view;
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view3.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view3, adjustedPosition, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                view2 = view;
                float f17 = adjustedPosition;
                adjustedPosition = f17;
                z11 |= pathRotate.setPathRotate(view2, keyCache, f17, j11, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i12 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i12 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i12].getPos(d11, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.mAttributes.get(this.mAttributeNames[i12 - 1]), view2, this.mValuesBuff);
                i12++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= f13) {
                    view2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (adjustedPosition >= f12) {
                    view2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    view2.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i13 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i13 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i13].conditionallyFire(adjustedPosition, view2);
                    i13++;
                }
            }
        } else {
            view2 = view;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f18 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f19 = f18 + ((motionPaths2.mX - f18) * adjustedPosition);
            float f21 = motionPaths.mY;
            float f22 = f21 + ((motionPaths2.mY - f21) * adjustedPosition);
            float f23 = motionPaths.mWidth;
            float f24 = motionPaths2.mWidth;
            float f25 = motionPaths.mHeight;
            float f26 = motionPaths2.mHeight;
            float f27 = f19 + 0.5f;
            int i14 = (int) f27;
            float f28 = f22 + 0.5f;
            int i15 = (int) f28;
            int i16 = (int) (f27 + ((f24 - f23) * adjustedPosition) + f23);
            int i17 = (int) (f28 + ((f26 - f25) * adjustedPosition) + f25);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f24 != f23 || f26 != f25 || this.mForceMeasure) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.mForceMeasure = false;
            }
            view2.layout(i14, i15, i16, i17);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view2, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view2, adjustedPosition);
                }
            }
        }
        return z11;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f11, float f12, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f13 = motionPaths.mX;
        rectF.left = f13;
        float f14 = motionPaths.mY;
        rectF.top = f14;
        rectF.right = f13 + motionPaths.mWidth;
        rectF.bottom = f14 + motionPaths.mHeight;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f15 = motionPaths2.mX;
        rectF2.left = f15;
        float f16 = motionPaths2.mY;
        rectF2.top = f16;
        rectF2.right = f15 + motionPaths2.mWidth;
        rectF2.bottom = f16 + motionPaths2.mHeight;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f11, f12, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    public void rotate(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((i16 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i11) {
        this.mStartMotionPath.mDrawPath = i11;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i11, int i12) {
        MotionController motionController;
        int i13 = constraintSet.mRotate;
        if (i13 != 0) {
            motionController = this;
            motionController.rotate(rect, this.mTempRect, i13, i11, i12);
            rect = motionController.mTempRect;
        } else {
            motionController = this;
        }
        MotionPaths motionPaths = motionController.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        motionController.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        motionController.mEndMotionPath.applyParameters(constraintSet.getParameters(motionController.mId));
        motionController.mEndPoint.setState(rect, constraintSet, i13, motionController.mId);
    }

    public void setPathMotionArc(int i11) {
        this.mPathMotionArc = i11;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ViewState viewState, View view, int i11, int i12, int i13) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        Rect rect = new Rect();
        if (i11 == 1) {
            int i14 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i12 - ((i14 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        } else if (i11 == 2) {
            int i15 = viewState.left + viewState.right;
            rect.left = i13 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
            rect.top = (i15 - viewState.height()) / 2;
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i11, viewState.rotation);
    }

    public void setTransformPivotTarget(int i11) {
        this.mTransformPivotTarget = i11;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i11, int i12, float f11, long j11) {
        ArrayList arrayList;
        String[] strArr;
        MotionPaths[] motionPathsArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i13 = this.mPathMotionArc;
        if (i13 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i13;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i11, i12, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i14 = keyPosition.mCurveFit;
                    if (i14 != Key.UNSET) {
                        this.mCurveFitType = i14;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i15 = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        boolean z11 = true;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(next2, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(next5, j11);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i16 = size + 2;
        MotionPaths[] motionPathsArr2 = new MotionPaths[i16];
        motionPathsArr2[0] = this.mStartMotionPath;
        motionPathsArr2[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i17 = 1;
        while (it8.hasNext()) {
            motionPathsArr2[i17] = it8.next();
            i17++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.mAttributes.keySet()) {
            if (this.mStartMotionPath.mAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i18 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i18 >= strArr.length) {
                break;
            }
            String str6 = strArr[i18];
            this.mAttributeInterpolatorCount[i18] = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= i16) {
                    break;
                }
                if (motionPathsArr2[i19].mAttributes.containsKey(str6) && (constraintAttribute = motionPathsArr2[i19].mAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i18] = iArr[i18] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i19++;
            }
            i18++;
        }
        boolean z12 = motionPathsArr2[0].mPathMotionArc != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i21 = 1; i21 < i16; i21++) {
            motionPathsArr2[i21].different(motionPathsArr2[i21 - 1], zArr, this.mAttributeNames, z12);
        }
        int i22 = 0;
        for (int i23 = 1; i23 < length; i23++) {
            if (zArr[i23]) {
                i22++;
            }
        }
        this.mInterpolateVariables = new int[i22];
        int i24 = 2;
        int max = Math.max(2, i22);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i25 = 0;
        for (int i26 = 1; i26 < length; i26++) {
            if (zArr[i26]) {
                this.mInterpolateVariables[i25] = i26;
                i25++;
            }
        }
        int[] iArr2 = {i16, this.mInterpolateVariables.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i16];
        for (int i27 = 0; i27 < i16; i27++) {
            motionPathsArr2[i27].fillStandard(dArr[i27], this.mInterpolateVariables);
            dArr2[i27] = motionPathsArr2[i27].mTime;
        }
        int i28 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i28 >= iArr3.length) {
                break;
            }
            if (iArr3[i28] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i28]] + " [";
                for (int i29 = 0; i29 < i16; i29++) {
                    str7 = str7 + dArr[i29][i28];
                }
            }
            i28++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i31 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i31 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i31];
            int i32 = i15;
            int i33 = i32;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i32 < i16) {
                boolean z13 = z11;
                if (motionPathsArr2[i32].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i16];
                        int[] iArr4 = new int[i24];
                        iArr4[z13 ? 1 : 0] = motionPathsArr2[i32].getCustomDataCount(str8);
                        iArr4[i15] = i16;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    MotionPaths motionPaths = motionPathsArr2[i32];
                    motionPathsArr = motionPathsArr2;
                    dArr3[i33] = motionPaths.mTime;
                    motionPaths.getCustomData(str8, dArr4[i33], 0);
                    i33++;
                } else {
                    motionPathsArr = motionPathsArr2;
                }
                i32++;
                z11 = z13 ? 1 : 0;
                motionPathsArr2 = motionPathsArr;
                i24 = 2;
                i15 = 0;
            }
            i31++;
            this.mSpline[i31] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i33), (double[][]) Arrays.copyOf(dArr4, i33));
            z11 = z11;
            motionPathsArr2 = motionPathsArr2;
            i24 = 2;
            i15 = 0;
        }
        MotionPaths[] motionPathsArr3 = motionPathsArr2;
        boolean z14 = z11;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr3[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i16];
            double[] dArr5 = new double[i16];
            int[] iArr6 = new int[2];
            iArr6[z14 ? 1 : 0] = 2;
            iArr6[0] = i16;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i34 = 0; i34 < i16; i34++) {
                iArr5[i34] = motionPathsArr3[i34].mPathMotionArc;
                dArr5[i34] = r7.mTime;
                double[] dArr7 = dArr6[i34];
                dArr7[0] = r7.mX;
                dArr7[z14 ? 1 : 0] = r7.mY;
            }
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f12 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f12)) {
                        f12 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next8);
                    this.mCycleMap.put(next8, makeSpline3);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f12);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i11, int i12) {
        MotionController motionController;
        Rect rect2;
        int i13 = constraintSet.mRotate;
        if (i13 != 0) {
            motionController = this;
            rect2 = rect;
            motionController.rotate(rect2, this.mTempRect, i13, i11, i12);
        } else {
            motionController = this;
            rect2 = rect;
        }
        MotionPaths motionPaths = motionController.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        readView(motionPaths);
        motionController.mStartMotionPath.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(motionController.mId);
        motionController.mStartMotionPath.applyParameters(parameters);
        motionController.mMotionStagger = parameters.motion.mMotionStagger;
        motionController.mStartPoint.setState(rect2, constraintSet, i13, motionController.mId);
        motionController.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        motionController.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        motionController.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = motionController.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        motionController.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }
}
