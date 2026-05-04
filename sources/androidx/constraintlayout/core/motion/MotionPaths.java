package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", "width", "height", "pathRotate"};
    int mAnimateCircleAngleTo;
    String mAnimateRelativeTo;
    HashMap<String, CustomVariable> mCustomAttributes;
    int mDrawPath;
    float mHeight;
    public String mId;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mPosition;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;
    float mX;
    float mY;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    private static float xRotate(float f11, float f12, float f13, float f14, float f15, float f16) {
        return (((f15 - f13) * f12) - ((f16 - f14) * f11)) + f13;
    }

    private static float yRotate(float f11, float f12, float f13, float f14, float f15, float f16) {
        return ((f15 - f13) * f11) + ((f16 - f14) * f12) + f14;
    }

    public void applyParameters(MotionWidget motionWidget) {
        ConstraintWidget constraintWidget;
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.mMotion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.mMotion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.mPropertySet.mProgress;
        WidgetFrame widgetFrame = motionWidget.mWidgetFrame;
        if (widgetFrame != null && (constraintWidget = widgetFrame.widget) != null) {
            this.mRelativeAngle = constraintWidget.mCircleConstraintAngle;
        }
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z11) {
        boolean diff = diff(this.mX, motionPaths.mX);
        boolean diff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        zArr[1] = zArr[1] | (diff || diff2 || z11);
        zArr[2] = zArr[2] | (diff || diff2 || z11);
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < 6) {
                dArr[i11] = fArr[r1];
                i11++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f13 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 3) {
                f11 = f13;
            } else if (i13 == 4) {
                f12 = f13;
            }
        }
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
    }

    public void getCenter(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.mX;
        float f12 = this.mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d11, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d12 = f16;
            double d13 = f11;
            double d14 = f12;
            f11 = (float) ((d12 + (Math.sin(d14) * d13)) - (f13 / 2.0f));
            f12 = (float) ((f17 - (d13 * Math.cos(d14))) - (f14 / 2.0f));
        }
        fArr[i11] = f11 + (f13 / 2.0f) + 0.0f;
        fArr[i11 + 1] = f12 + (f14 / 2.0f) + 0.0f;
    }

    public void getCenterVelocity(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.mX;
        float f12 = this.mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d11, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d12 = f16;
            double d13 = f11;
            double d14 = f12;
            f11 = (float) ((d12 + (Math.sin(d14) * d13)) - (f13 / 2.0f));
            f12 = (float) ((f17 - (d13 * Math.cos(d14))) - (f14 / 2.0f));
        }
        fArr[i11] = f11 + (f13 / 2.0f) + 0.0f;
        fArr[i11 + 1] = f12 + (f14 / 2.0f) + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i11) {
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        int i12 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i11] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i12 < numberOfInterpolatedValues) {
            dArr[i11] = r2[i12];
            i12++;
            i11++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.mCustomAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.mX;
        float f12 = this.mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d11 = f11;
            double d12 = f12;
            float sin = (float) ((centerX + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            f12 = (float) ((centerY - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            f11 = sin;
        }
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i11] = f11 + 0.0f;
        fArr[i11 + 1] = f12 + 0.0f;
        fArr[i11 + 2] = f16 + 0.0f;
        fArr[i11 + 3] = f12 + 0.0f;
        fArr[i11 + 4] = f16 + 0.0f;
        fArr[i11 + 5] = f17 + 0.0f;
        fArr[i11 + 6] = f11 + 0.0f;
        fArr[i11 + 7] = f17 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.mCustomAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f12 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f11 : motionKeyPosition.mPercentWidth;
        float f13 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f11 : motionKeyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f18 = motionPaths.mX;
        float f19 = motionPaths.mY;
        float f21 = f11;
        float f22 = (motionPaths2.mX + (f14 / 2.0f)) - ((f15 / 2.0f) + f18);
        float f23 = (motionPaths2.mY + (f16 / 2.0f)) - (f19 + (f17 / 2.0f));
        float f24 = ((f14 - f15) * f12) / 2.0f;
        this.mX = (int) ((f18 + (f22 * f21)) - f24);
        float f25 = ((f16 - f17) * f13) / 2.0f;
        this.mY = (int) ((f19 + (f23 * f21)) - f25);
        this.mWidth = (int) (f15 + r9);
        this.mHeight = (int) (f17 + r12);
        float f26 = Float.isNaN(motionKeyPosition.mPercentX) ? f21 : motionKeyPosition.mPercentX;
        float f27 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f21 = motionKeyPosition.mPercentY;
        }
        float f28 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f26 * f22)) + (f28 * f23)) - f24);
        this.mY = (int) (((motionPaths.mY + (f22 * f27)) + (f23 * f21)) - f25);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f12 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f11 : motionKeyPosition.mPercentWidth;
        float f13 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f11 : motionKeyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth - motionPaths.mWidth;
        float f15 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f11 = motionKeyPosition.mPercentX;
        }
        float f16 = motionPaths.mX;
        float f17 = motionPaths.mWidth;
        float f18 = motionPaths.mY;
        float f19 = motionPaths.mHeight;
        float f21 = f11;
        float f22 = (motionPaths2.mX + (motionPaths2.mWidth / 2.0f)) - ((f17 / 2.0f) + f16);
        float f23 = (motionPaths2.mY + (motionPaths2.mHeight / 2.0f)) - ((f19 / 2.0f) + f18);
        float f24 = f22 * f21;
        float f25 = (f14 * f12) / 2.0f;
        this.mX = (int) ((f16 + f24) - f25);
        float f26 = f23 * f21;
        float f27 = (f15 * f13) / 2.0f;
        this.mY = (int) ((f18 + f26) - f27);
        this.mWidth = (int) (f17 + r7);
        this.mHeight = (int) (f19 + r8);
        float f28 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f29 = (int) ((motionPaths.mX + f24) - f25);
        float f31 = (int) ((motionPaths.mY + f26) - f27);
        this.mX = f29 + ((-f23) * f28);
        this.mY = f31 + (f22 * f28);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPolar(int i11, int i12, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float min;
        float f11;
        float f12 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f12;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f13 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f12 : motionKeyPosition.mPercentWidth;
        float f14 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f12 : motionKeyPosition.mPercentHeight;
        float f15 = motionPaths2.mWidth;
        float f16 = motionPaths.mWidth;
        float f17 = motionPaths2.mHeight;
        float f18 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f16 + ((f15 - f16) * f13));
        this.mHeight = (int) (f18 + ((f17 - f18) * f14));
        int i13 = motionKeyPosition.mPositionType;
        if (i13 == 1) {
            float f19 = Float.isNaN(motionKeyPosition.mPercentX) ? f12 : motionKeyPosition.mPercentX;
            float f21 = motionPaths2.mX;
            float f22 = motionPaths.mX;
            this.mX = (f19 * (f21 - f22)) + f22;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f12 = motionKeyPosition.mPercentY;
            }
            float f23 = motionPaths2.mY;
            float f24 = motionPaths.mY;
            this.mY = (f12 * (f23 - f24)) + f24;
        } else if (i13 != 2) {
            float f25 = Float.isNaN(motionKeyPosition.mPercentX) ? f12 : motionKeyPosition.mPercentX;
            float f26 = motionPaths2.mX;
            float f27 = motionPaths.mX;
            this.mX = (f25 * (f26 - f27)) + f27;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f12 = motionKeyPosition.mPercentY;
            }
            float f28 = motionPaths2.mY;
            float f29 = motionPaths.mY;
            this.mY = (f12 * (f28 - f29)) + f29;
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f31 = motionPaths2.mX;
                float f32 = motionPaths.mX;
                min = ((f31 - f32) * f12) + f32;
            } else {
                min = Math.min(f14, f13) * motionKeyPosition.mPercentX;
            }
            this.mX = min;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f33 = motionPaths2.mY;
                float f34 = motionPaths.mY;
                f11 = (f12 * (f33 - f34)) + f34;
            } else {
                f11 = motionKeyPosition.mPercentY;
            }
            this.mY = f11;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initScreen(int i11, int i12, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f11 = motionKeyPosition.mFramePosition / 100.0f;
        this.mTime = f11;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f12 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f11 : motionKeyPosition.mPercentWidth;
        float f13 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f11 : motionKeyPosition.mPercentHeight;
        float f14 = motionPaths2.mWidth;
        float f15 = motionPaths.mWidth;
        float f16 = motionPaths2.mHeight;
        float f17 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f18 = motionPaths.mX;
        float f19 = motionPaths.mY;
        float f21 = motionPaths2.mX + (f14 / 2.0f);
        float f22 = motionPaths2.mY + (f16 / 2.0f);
        float f23 = (f14 - f15) * f12;
        this.mX = (int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f11)) - (f23 / 2.0f));
        float f24 = (f16 - f17) * f13;
        this.mY = (int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f11)) - (f24 / 2.0f));
        this.mWidth = (int) (f15 + f23);
        this.mHeight = (int) (f17 + f24);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.mX = (int) (motionKeyPosition.mPercentX * (i11 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.mY = (int) (motionKeyPosition.mPercentY * (i12 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f11, float f12, float f13, float f14) {
        this.mX = f11;
        this.mY = f12;
        this.mWidth = f13;
        this.mHeight = f14;
    }

    public void setDpDt(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((0.0f * f14) / 2.0f);
        float f19 = f15 - ((0.0f * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + 0.0f;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + 0.0f;
    }

    public void setView(float f11, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f12;
        float f13 = this.mX;
        float f14 = this.mY;
        float f15 = this.mWidth;
        float f16 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i11 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i11];
            this.mTempDelta = new double[i11];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            double[] dArr4 = this.mTempValue;
            int i13 = iArr[i12];
            dArr4[i13] = dArr[i12];
            this.mTempDelta[i13] = dArr2[i12];
        }
        float f17 = Float.NaN;
        int i14 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i14 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i14]) && (dArr3 == null || dArr3[i14] == 0.0d)) {
                f12 = f17;
            } else {
                double d11 = dArr3 != null ? dArr3[i14] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i14])) {
                    d11 = this.mTempValue[i14] + d11;
                }
                f12 = f17;
                float f23 = (float) d11;
                float f24 = (float) this.mTempDelta[i14];
                if (i14 == 1) {
                    f17 = f12;
                    f18 = f24;
                    f13 = f23;
                } else if (i14 == 2) {
                    f17 = f12;
                    f19 = f24;
                    f14 = f23;
                } else if (i14 == 3) {
                    f17 = f12;
                    f21 = f24;
                    f15 = f23;
                } else if (i14 == 4) {
                    f17 = f12;
                    f22 = f24;
                    f16 = f23;
                } else if (i14 == 5) {
                    f17 = f23;
                }
                i14++;
            }
            f17 = f12;
            i14++;
        }
        float f25 = f17;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f11, fArr, fArr2);
            float f26 = fArr[0];
            float f27 = fArr[1];
            float f28 = fArr2[0];
            float f29 = fArr2[1];
            double d12 = f26;
            double d13 = f13;
            double d14 = f14;
            f13 = (float) ((d12 + (Math.sin(d14) * d13)) - (f15 / 2.0f));
            f14 = (float) ((f27 - (Math.cos(d14) * d13)) - (f16 / 2.0f));
            double d15 = f28;
            double d16 = f18;
            double sin = d15 + (Math.sin(d14) * d16);
            double cos = Math.cos(d14) * d13;
            double d17 = f19;
            float f31 = (float) (sin + (cos * d17));
            float cos2 = (float) ((f29 - (d16 * Math.cos(d14))) + (Math.sin(d14) * d13 * d17));
            if (dArr2.length >= 2) {
                dArr2[0] = f31;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f25)) {
                motionWidget.setRotationZ((float) (f25 + Math.toDegrees(Math.atan2(cos2, f31))));
            }
        } else if (!Float.isNaN(f25)) {
            motionWidget.setRotationZ(((float) (f25 + Math.toDegrees(Math.atan2(f19 + (f22 / 2.0f), f18 + (f21 / 2.0f))))) + 0.0f);
        }
        float f32 = f13 + 0.5f;
        float f33 = f14 + 0.5f;
        motionWidget.layout((int) f32, (int) f33, (int) (f32 + f15), (int) (f33 + f16));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d11 = ((this.mX + (this.mWidth / 2.0f)) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d12 = ((this.mY + (this.mHeight / 2.0f)) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motion;
        this.mX = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    public MotionPaths(int i11, int i12, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = null;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mCustomAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != null) {
            initPolar(i11, i12, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i13 = motionKeyPosition.mPositionType;
        if (i13 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i13 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i11, i12, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    public void getCenter(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        float f12 = this.mX;
        float f13 = this.mY;
        float f14 = this.mWidth;
        float f15 = this.mHeight;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f21 = (float) dArr[i11];
            float f22 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f21;
                f16 = f22;
            } else if (i12 == 2) {
                f13 = f21;
                f18 = f22;
            } else if (i12 == 3) {
                f14 = f21;
                f17 = f22;
            } else if (i12 == 4) {
                f15 = f21;
                f19 = f22;
            }
        }
        float f23 = (f17 / 2.0f) + f16;
        float f24 = (f19 / 2.0f) + f18;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d11, fArr3, fArr4);
            float f25 = fArr3[0];
            float f26 = fArr3[1];
            float f27 = fArr4[0];
            float f28 = fArr4[1];
            f11 = 2.0f;
            double d12 = f12;
            double d13 = f13;
            f12 = (float) ((f25 + (Math.sin(d13) * d12)) - (f14 / 2.0f));
            f13 = (float) ((f26 - (Math.cos(d13) * d12)) - (f15 / 2.0f));
            double d14 = f16;
            double sin = f27 + (Math.sin(d13) * d14);
            double d15 = f18;
            float cos = (float) (sin + (Math.cos(d13) * d15));
            f24 = (float) ((f28 - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f23 = cos;
        } else {
            f11 = 2.0f;
        }
        fArr[0] = f12 + (f14 / f11) + 0.0f;
        fArr[1] = f13 + (f15 / f11) + 0.0f;
        fArr2[0] = f23;
        fArr2[1] = f24;
    }
}
