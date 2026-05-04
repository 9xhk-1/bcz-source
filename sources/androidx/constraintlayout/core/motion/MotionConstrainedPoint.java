package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    private float mHeight;
    private Easing mKeyFrameEasing;
    private float mPosition;
    int mVisibility;
    private float mWidth;
    private float mX;
    private float mY;
    private float mAlpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean mApplyElevation = false;
    private float mElevation = 0.0f;
    private float mRotation = 0.0f;
    private float mRotationX = 0.0f;
    public float rotationY = 0.0f;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTranslationX = 0.0f;
    private float mTranslationY = 0.0f;
    private float mTranslationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

    private boolean diff(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, SplineSet> hashMap, int i11) {
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            str.getClass();
            char c11 = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c11 = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c11 = '\f';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    splineSet.setPoint(i11, Float.isNaN(this.mRotationX) ? 0.0f : this.mRotationX);
                    break;
                case 1:
                    splineSet.setPoint(i11, Float.isNaN(this.rotationY) ? 0.0f : this.rotationY);
                    break;
                case 2:
                    splineSet.setPoint(i11, Float.isNaN(this.mRotation) ? 0.0f : this.mRotation);
                    break;
                case 3:
                    splineSet.setPoint(i11, Float.isNaN(this.mTranslationX) ? 0.0f : this.mTranslationX);
                    break;
                case 4:
                    splineSet.setPoint(i11, Float.isNaN(this.mTranslationY) ? 0.0f : this.mTranslationY);
                    break;
                case 5:
                    splineSet.setPoint(i11, Float.isNaN(this.mTranslationZ) ? 0.0f : this.mTranslationZ);
                    break;
                case 6:
                    splineSet.setPoint(i11, Float.isNaN(this.mProgress) ? 0.0f : this.mProgress);
                    break;
                case 7:
                    splineSet.setPoint(i11, Float.isNaN(this.mPivotX) ? 0.0f : this.mPivotX);
                    break;
                case '\b':
                    splineSet.setPoint(i11, Float.isNaN(this.mPivotY) ? 0.0f : this.mPivotY);
                    break;
                case '\t':
                    splineSet.setPoint(i11, Float.isNaN(this.mScaleX) ? 1.0f : this.mScaleX);
                    break;
                case '\n':
                    splineSet.setPoint(i11, Float.isNaN(this.mScaleY) ? 1.0f : this.mScaleY);
                    break;
                case 11:
                    splineSet.setPoint(i11, Float.isNaN(this.mAlpha) ? 1.0f : this.mAlpha);
                    break;
                case '\f':
                    splineSet.setPoint(i11, Float.isNaN(this.mPathRotate) ? 0.0f : this.mPathRotate);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.mCustomVariable.containsKey(str2)) {
                            CustomVariable customVariable = this.mCustomVariable.get(str2);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i11, customVariable);
                                break;
                            } else {
                                Utils.loge("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i11 + ", value" + customVariable.getValueToInterpolate() + splineSet);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Utils.loge("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mVisibility = motionWidget.getVisibility();
        this.mAlpha = motionWidget.getVisibility() != 4 ? 0.0f : motionWidget.getAlpha();
        this.mApplyElevation = false;
        this.mRotation = motionWidget.getRotationZ();
        this.mRotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.mScaleX = motionWidget.getScaleX();
        this.mScaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.mTranslationX = motionWidget.getTranslationX();
        this.mTranslationY = motionWidget.getTranslationY();
        this.mTranslationZ = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(str, customAttribute);
            }
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.mAlpha, motionConstrainedPoint.mAlpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("translationZ");
        }
        int i11 = this.mVisibility;
        int i12 = motionConstrainedPoint.mVisibility;
        if (i11 != i12 && this.mVisibilityMode == 0 && (i11 == 4 || i12 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.mRotation, motionConstrainedPoint.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.mRotationX, motionConstrainedPoint.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
        }
        if (diff(this.mScaleX, motionConstrainedPoint.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.mScaleY, motionConstrainedPoint.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.mTranslationX, motionConstrainedPoint.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.mTranslationY, motionConstrainedPoint.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.mTranslationZ, motionConstrainedPoint.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (diff(this.mElevation, motionConstrainedPoint.mElevation)) {
            hashSet.add("elevation");
        }
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        int i11 = 0;
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mAlpha, this.mElevation, this.mRotation, this.mRotationX, this.rotationY, this.mScaleX, this.mScaleY, this.mPivotX, this.mPivotY, this.mTranslationX, this.mTranslationY, this.mTranslationZ, this.mPathRotate};
        for (int i12 : iArr) {
            if (i12 < 18) {
                dArr[i11] = fArr[r4];
                i11++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i11) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i11] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i12 = 0;
        while (i12 < numberOfInterpolatedValues) {
            dArr[i11] = r1[i12];
            i12++;
            i11++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    public void setBounds(float f11, float f12, float f13, float f14) {
        this.mX = f11;
        this.mY = f12;
        this.mWidth = f13;
        this.mHeight = f14;
    }

    public void setState(MotionWidget motionWidget) {
        setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.mPosition, motionConstrainedPoint.mPosition);
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i11, float f11) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(motionWidget);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i11 == 1) {
            this.mRotation = f11 - 90.0f;
        } else {
            if (i11 != 2) {
                return;
            }
            this.mRotation = f11 + 90.0f;
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.mPosition, motionConstrainedPoint.mPosition);
        zArr[1] = zArr[1] | diff(this.mX, motionConstrainedPoint.mX);
        zArr[2] = zArr[2] | diff(this.mY, motionConstrainedPoint.mY);
        zArr[3] = zArr[3] | diff(this.mWidth, motionConstrainedPoint.mWidth);
        zArr[4] = diff(this.mHeight, motionConstrainedPoint.mHeight) | zArr[4];
    }
}
