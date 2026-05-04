package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Motion implements TypedValues {
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
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    public String mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    Motion mRelativeMotion;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = 0;
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
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
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

    private static DifferentialInterpolator getInterpolator(int i11, String str, int i12) {
        if (i11 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f11) {
                this.mX = f11;
                return (float) Easing.this.get(f11);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
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
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        MotionPaths motionPaths2 = null;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            if (motionPaths.mPosition == next.mPosition) {
                motionPaths2 = next;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.mPosition + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i11) {
        float f11 = 1.0f / (i11 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
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

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
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
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                iArr2[i12] = (int) (it2.next().mPosition * 100.0f);
                i12++;
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < timePoints.length; i14++) {
            this.mSpline[0].getPos(timePoints[i14], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i14], this.mInterpolateVariables, this.mInterpolateData, fArr, i13);
            i13 += 2;
        }
        return i13 / 2;
    }

    public void buildPath(float[] fArr, int i11) {
        int i12 = i11;
        float f11 = 1.0f;
        float f12 = 1.0f / (i12 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
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
            if (keyCycleOscillator != null) {
                fArr[i14] = fArr[i14] + keyCycleOscillator.get(f13);
            } else if (splineSet != null) {
                fArr[i14] = fArr[i14] + splineSet.get(f13);
            }
            if (keyCycleOscillator2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + keyCycleOscillator2.get(f13);
            } else if (splineSet2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + splineSet2.get(f13);
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

    public String getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i11) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i12 = 0; i12 < fArr.length; i12++) {
            fArr[i12] = splineSet.get(i12 / (fArr.length - 1));
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

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i11) {
        return this.mMotionPaths.get(i11);
    }

    public int getKeyFrameInfo(int i11, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
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
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    iArr[i13 + 5] = motionKeyPosition.mPositionType;
                    iArr[i13 + 6] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i16 = i13 + 7;
                    iArr[i16] = Float.floatToIntBits(motionKeyPosition.mPercentY);
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
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
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

    public float getMotionStagger() {
        return this.mMotionStagger;
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

    public MotionKeyPosition getPositionKeyframe(int i11, int i12, float f11, float f12) {
        int i13;
        int i14;
        float f13;
        float f14;
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f15 = motionPaths.mX;
        floatRect.left = f15;
        float f16 = motionPaths.mY;
        floatRect.top = f16;
        floatRect.right = f15 + motionPaths.mWidth;
        floatRect.bottom = f16 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f17 = motionPaths2.mX;
        floatRect2.left = f17;
        float f18 = motionPaths2.mY;
        floatRect2.top = f18;
        floatRect2.right = f17 + motionPaths2.mWidth;
        floatRect2.bottom = f18 + motionPaths2.mHeight;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey next = it.next();
            if (next instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                i13 = i11;
                i14 = i12;
                f13 = f11;
                f14 = f12;
                if (motionKeyPosition.intersects(i13, i14, floatRect, floatRect2, f13, f14)) {
                    return motionKeyPosition;
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
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
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
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
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

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f11, long j11, KeyCache keyCache) {
        MotionWidget motionWidget2 = motionWidget;
        float adjustedPosition = getAdjustedPosition(f11, null);
        int i11 = this.mQuantizeMotionSteps;
        if (i11 != -1) {
            float f12 = 1.0f / i11;
            float floor = ((float) Math.floor(adjustedPosition / f12)) * f12;
            float f13 = (adjustedPosition % f12) / f12;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f13 = (f13 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f13) : ((double) f13) > 0.5d ? 1.0f : 0.0f) * f12) + floor;
        }
        float f14 = adjustedPosition;
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget2, f14);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d11 = f14;
            curveFitArr[0].getPos(d11, this.mInterpolateData);
            this.mSpline[0].getSlope(d11, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d11, dArr);
                    this.mArcSpline.getSlope(d11, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(f14, motionWidget2, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
                f14 = f14;
                motionWidget2 = motionWidget2;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget2.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget2.getRight() - motionWidget2.getLeft() > 0 && motionWidget2.getBottom() - motionWidget2.getTop() > 0) {
                        motionWidget2.setPivotX(left - motionWidget2.getLeft());
                        motionWidget2.setPivotY(top - motionWidget2.getTop());
                    }
                }
            }
            int i12 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i12 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i12].getPos(d11, this.mValuesBuff);
                this.mStartMotionPath.mCustomAttributes.get(this.mAttributeNames[i12 - 1]).setInterpolatedValue(motionWidget2, this.mValuesBuff);
                i12++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f14 <= 0.0f) {
                    motionWidget2.setVisibility(motionConstrainedPoint.mVisibility);
                } else if (f14 >= 1.0f) {
                    motionWidget2.setVisibility(this.mEndPoint.mVisibility);
                } else if (this.mEndPoint.mVisibility != motionConstrainedPoint.mVisibility) {
                    motionWidget2.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i13 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i13 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i13].conditionallyFire(f14, motionWidget2);
                    i13++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f15 = motionPaths.mX;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f16 = f15 + ((motionPaths2.mX - f15) * f14);
            float f17 = motionPaths.mY;
            float f18 = f17 + ((motionPaths2.mY - f17) * f14);
            float f19 = motionPaths.mWidth;
            float f21 = f19 + ((motionPaths2.mWidth - f19) * f14);
            float f22 = motionPaths.mHeight;
            float f23 = f16 + 0.5f;
            float f24 = f18 + 0.5f;
            motionWidget2.layout((int) f23, (int) f24, (int) (f23 + f21), (int) (f24 + f22 + ((motionPaths2.mHeight - f22) * f14)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget2, f14, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget2, f14);
                }
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f11, float f12, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f13 = motionPaths.mX;
        floatRect.left = f13;
        float f14 = motionPaths.mY;
        floatRect.top = f14;
        floatRect.right = f13 + motionPaths.mWidth;
        floatRect.bottom = f14 + motionPaths.mHeight;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f15 = motionPaths2.mX;
        floatRect2.left = f15;
        float f16 = motionPaths2.mY;
        floatRect2.top = f16;
        floatRect2.right = f15 + motionPaths2.mWidth;
        floatRect2.bottom = f16 + motionPaths2.mHeight;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f11, f12, strArr, fArr);
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

    public void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i11) {
        this.mStartMotionPath.mDrawPath = i11;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.mTime = 1.0f;
        motionPaths.mPosition = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setIdString(String str) {
        this.mId = str;
        this.mStartMotionPath.mId = str;
    }

    public void setPathMotionArc(int i11) {
        this.mPathMotionArc = i11;
    }

    public void setStaggerOffset(float f11) {
        this.mStaggerOffset = f11;
    }

    public void setStaggerScale(float f11) {
        this.mStaggerScale = f11;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.mTime = 0.0f;
        motionPaths.mPosition = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
        TypedBundle motionProperties = motionWidget.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i11, int i12, int i13) {
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
        this.mStartPoint.setState(rect, motionWidget, i11, viewState.rotation);
    }

    public void setTransformPivotTarget(int i11) {
        this.mTransformPivotTarget = i11;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setup(int i11, int i12, float f11, long j11) {
        ArrayList arrayList;
        int i13;
        String[] strArr;
        int i14;
        int i15;
        CustomVariable customVariable;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        Integer num;
        int i16;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        setupRelative();
        int i17 = this.mPathMotionArc;
        if (i17 != -1) {
            MotionPaths motionPaths = this.mStartMotionPath;
            if (motionPaths.mPathMotionArc == -1) {
                motionPaths.mPathMotionArc = i17;
            }
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<MotionKey> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                MotionKey next = it.next();
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    insertKey(new MotionPaths(i11, i12, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i18 = motionKeyPosition.mCurveFit;
                    if (i18 != -1) {
                        this.mCurveFitType = i18;
                    }
                } else if (next instanceof MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        int i19 = 1;
        if (hashSet2.isEmpty()) {
            i13 = 1;
        } else {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next2.split(",")[i19];
                    i16 = i19;
                    Iterator<MotionKey> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        MotionKey next3 = it3.next();
                        HashMap<String, CustomVariable> hashMap2 = next3.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(next3.mFramePosition, customVariable3);
                        }
                    }
                    makeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    i16 = i19;
                    makeSpline2 = SplineSet.makeSpline(next2, j11);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                i19 = i16;
            }
            i13 = i19;
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<MotionKey> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    MotionKey next4 = it4.next();
                    if (next4 instanceof MotionKeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(intValue);
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
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next5.split(",")[i13];
                        Iterator<MotionKey> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            MotionKey next6 = it6.next();
                            HashMap<String, CustomVariable> hashMap3 = next6.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(next6.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next5, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next5, j11);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<MotionKey> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    MotionKey next7 = it7.next();
                    if (next7 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i21 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i21];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i22 = i13;
        while (it8.hasNext()) {
            motionPathsArr[i22] = it8.next();
            i22++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.mCustomAttributes.keySet()) {
            if (this.mStartMotionPath.mCustomAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i23 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i23 >= strArr.length) {
                break;
            }
            String str6 = strArr[i23];
            this.mAttributeInterpolatorCount[i23] = 0;
            int i24 = 0;
            while (true) {
                if (i24 >= i21) {
                    break;
                }
                if (motionPathsArr[i24].mCustomAttributes.containsKey(str6) && (customVariable = motionPathsArr[i24].mCustomAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i23] = iArr[i23] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i24++;
            }
            i23++;
        }
        boolean z11 = motionPathsArr[0].mPathMotionArc != -1 ? i13 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i25 = i13; i25 < i21; i25++) {
            motionPathsArr[i25].different(motionPathsArr[i25 - 1], zArr, this.mAttributeNames, z11);
        }
        int i26 = 0;
        for (int i27 = i13; i27 < length; i27++) {
            if (zArr[i27]) {
                i26++;
            }
        }
        this.mInterpolateVariables = new int[i26];
        int i28 = 2;
        int max = Math.max(2, i26);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i29 = 0;
        for (int i31 = i13; i31 < length; i31++) {
            if (zArr[i31]) {
                this.mInterpolateVariables[i29] = i31;
                i29++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i13] = this.mInterpolateVariables.length;
        iArr2[0] = i21;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i21];
        for (int i32 = 0; i32 < i21; i32++) {
            motionPathsArr[i32].fillStandard(dArr[i32], this.mInterpolateVariables);
            dArr2[i32] = motionPathsArr[i32].mTime;
        }
        int i33 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i33 >= iArr3.length) {
                break;
            }
            if (iArr3[i33] < MotionPaths.sNames.length) {
                String str7 = MotionPaths.sNames[this.mInterpolateVariables[i33]] + " [";
                for (int i34 = 0; i34 < i21; i34++) {
                    str7 = str7 + dArr[i34][i33];
                }
            }
            i33++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i35 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i35 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i35];
            int i36 = 0;
            int i37 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i36 < i21) {
                if (motionPathsArr[i36].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i21];
                        int[] iArr4 = new int[i28];
                        iArr4[i13] = motionPathsArr[i36].getCustomDataCount(str8);
                        i15 = 0;
                        iArr4[0] = i21;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i15 = 0;
                    }
                    MotionPaths motionPaths2 = motionPathsArr[i36];
                    i14 = i35;
                    dArr3[i37] = motionPaths2.mTime;
                    motionPaths2.getCustomData(str8, dArr4[i37], i15);
                    i37++;
                } else {
                    i14 = i35;
                }
                i36++;
                i35 = i14;
                i28 = 2;
            }
            int i38 = i35 + 1;
            this.mSpline[i38] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i37), (double[][]) Arrays.copyOf(dArr4, i37));
            i35 = i38;
            i28 = 2;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr5 = new int[i21];
            double[] dArr5 = new double[i21];
            int[] iArr6 = new int[2];
            iArr6[i13] = 2;
            iArr6[0] = i21;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i39 = 0; i39 < i21; i39++) {
                iArr5[i39] = motionPathsArr[i39].mPathMotionArc;
                dArr5[i39] = r7.mTime;
                double[] dArr7 = dArr6[i39];
                dArr7[0] = r7.mX;
                dArr7[i13] = r7.mY;
            }
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f12 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next8);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f12)) {
                        f12 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next8);
                    this.mCycleMap.put(next8, makeWidgetCycle);
                }
            }
            Iterator<MotionKey> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                MotionKey next9 = it10.next();
                if (next9 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f12);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mRelativeMotion = motion;
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.mX + " y: " + this.mStartMotionPath.mY + " end: x: " + this.mEndMotionPath.mX + " y: " + this.mEndMotionPath.mY;
    }

    private void setupRelative() {
        Motion motion = this.mRelativeMotion;
        if (motion == null) {
            return;
        }
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        MotionPaths motionPaths = this.mEndMotionPath;
        Motion motion2 = this.mRelativeMotion;
        motionPaths.setupRelative(motion2, motion2.mEndMotionPath);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (i11 == 509) {
            setPathMotionArc(i12);
            return true;
        }
        if (i11 != 610) {
            return i11 == 704;
        }
        this.mQuantizeMotionSteps = i12;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        if (602 == i11) {
            this.mQuantizeMotionPhase = f11;
            return true;
        }
        if (600 != i11) {
            return false;
        }
        this.mMotionStagger = f11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (705 == i11 || 611 == i11) {
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
            return true;
        }
        if (605 != i11) {
            return false;
        }
        this.mStartMotionPath.mAnimateRelativeTo = str;
        return true;
    }

    public void endTrigger(boolean z11) {
    }
}
