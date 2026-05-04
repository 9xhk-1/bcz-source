package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Transition implements TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    int mParentEndHeight;
    int mParentEndWidth;
    int mParentInterpolateHeight;
    int mParentInterpolatedWidth;
    int mParentStartHeight;
    int mParentStartWidth;
    final CorePixelDp mToPixel;
    boolean mWrap;
    private HashMap<Integer, HashMap<String, KeyPosition>> mKeyPositions = new HashMap<>();
    private HashMap<String, WidgetState> mState = new HashMap<>();
    private TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private OnSwipe mOnSwipe = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class KeyPosition {
        int mFrame;
        String mTarget;
        int mType;
        float mX;
        float mY;

        public KeyPosition(String str, int i11, int i12, float f11, float f12) {
            this.mTarget = str;
            this.mFrame = i11;
            this.mType = i12;
            this.mX = f11;
            this.mY = f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OnSwipe {
        public static final int ANCHOR_SIDE_BOTTOM = 3;
        public static final int ANCHOR_SIDE_END = 6;
        public static final int ANCHOR_SIDE_LEFT = 1;
        public static final int ANCHOR_SIDE_MIDDLE = 4;
        public static final int ANCHOR_SIDE_RIGHT = 2;
        public static final int ANCHOR_SIDE_START = 5;
        public static final int ANCHOR_SIDE_TOP = 0;
        public static final int BOUNDARY_BOUNCE_BOTH = 3;
        public static final int BOUNDARY_BOUNCE_END = 2;
        public static final int BOUNDARY_BOUNCE_START = 1;
        public static final int BOUNDARY_OVERSHOOT = 0;
        public static final int DRAG_ANTICLOCKWISE = 7;
        public static final int DRAG_CLOCKWISE = 6;
        public static final int DRAG_DOWN = 1;
        public static final int DRAG_END = 5;
        public static final int DRAG_LEFT = 2;
        public static final int DRAG_RIGHT = 3;
        public static final int DRAG_START = 4;
        public static final int DRAG_UP = 0;
        public static final int MODE_CONTINUOUS_VELOCITY = 0;
        public static final int MODE_SPRING = 1;
        public static final int ON_UP_AUTOCOMPLETE = 0;
        public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
        public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
        public static final int ON_UP_DECELERATE = 4;
        public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
        public static final int ON_UP_NEVER_COMPLETE_TO_END = 7;
        public static final int ON_UP_NEVER_COMPLETE_TO_START = 6;
        public static final int ON_UP_STOP = 3;
        String mAnchorId;
        private int mAnchorSide;
        private StopEngine mEngine;
        String mLimitBoundsTo;
        private String mRotationCenterId;
        private long mStart;
        public static final String[] SIDES = {"top", TtmlNode.LEFT, TtmlNode.RIGHT, "bottom", "middle", TtmlNode.START, TtmlNode.END};
        private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] DIRECTIONS = {"up", "down", TtmlNode.LEFT, TtmlNode.RIGHT, TtmlNode.START, TtmlNode.END, "clockwise", "anticlockwise"};
        public static final String[] MODE = {"velocity", "spring"};
        public static final String[] TOUCH_UP = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] BOUNDARY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private boolean mDragVertical = true;
        private int mDragDirection = 0;
        private float mDragScale = 1.0f;
        private float mDragThreshold = 10.0f;
        private int mAutoCompleteMode = 0;
        private float mMaxVelocity = 4.0f;
        private float mMaxAcceleration = 1.2f;
        private int mOnTouchUp = 0;
        private float mSpringMass = 1.0f;
        private float mSpringStiffness = 400.0f;
        private float mSpringDamping = 10.0f;
        private float mSpringStopThreshold = 0.01f;
        private float mDestination = 0.0f;
        private int mSpringBoundary = 0;

        public void config(float f11, float f12, long j11, float f13) {
            SpringStopEngine springStopEngine;
            StopLogicEngine stopLogicEngine;
            StopLogicEngine.Decelerate decelerate;
            this.mStart = j11;
            float abs = Math.abs(f12);
            float f14 = this.mMaxVelocity;
            if (abs > f14) {
                f12 = Math.signum(f12) * f14;
            }
            float f15 = f12;
            float destinationPosition = getDestinationPosition(f11, f15, f13);
            this.mDestination = destinationPosition;
            if (destinationPosition == f11) {
                this.mEngine = null;
                return;
            }
            if (this.mOnTouchUp == 4 && this.mAutoCompleteMode == 0) {
                StopEngine stopEngine = this.mEngine;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    this.mEngine = decelerate;
                }
                decelerate.config(f11, this.mDestination, f15);
                return;
            }
            if (this.mAutoCompleteMode == 0) {
                StopEngine stopEngine2 = this.mEngine;
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    this.mEngine = stopLogicEngine;
                }
                stopLogicEngine.config(f11, this.mDestination, f15, f13, this.mMaxAcceleration, this.mMaxVelocity);
                return;
            }
            StopEngine stopEngine3 = this.mEngine;
            if (stopEngine3 instanceof SpringStopEngine) {
                springStopEngine = (SpringStopEngine) stopEngine3;
            } else {
                springStopEngine = new SpringStopEngine();
                this.mEngine = springStopEngine;
            }
            springStopEngine.springConfig(f11, this.mDestination, f15, this.mSpringMass, this.mSpringStiffness, this.mSpringDamping, this.mSpringStopThreshold, this.mSpringBoundary);
        }

        public float getDestinationPosition(float f11, float f12, float f13) {
            float abs = (((Math.abs(f12) * 0.5f) * f12) / this.mMaxAcceleration) + f11;
            switch (this.mOnTouchUp) {
                case 1:
                    return f11 >= 1.0f ? 1.0f : 0.0f;
                case 2:
                    return f11 <= 0.0f ? 0.0f : 1.0f;
                case 3:
                    return Float.NaN;
                case 4:
                    return Math.max(0.0f, Math.min(1.0f, abs));
                case 5:
                    return (abs <= 0.2f || abs >= 0.8f) ? abs > 0.5f ? 1.0f : 0.0f : abs;
                case 6:
                    return 1.0f;
                default:
                    if (abs > 0.5d) {
                        return 1.0f;
                    }
                case 7:
                    return 0.0f;
            }
        }

        public float[] getDirection() {
            return TOUCH_DIRECTION[this.mDragDirection];
        }

        public float getScale() {
            return this.mDragScale;
        }

        public float[] getSide() {
            return TOUCH_SIDES[this.mAnchorSide];
        }

        public float getTouchUpProgress(long j11) {
            return this.mEngine.isStopped() ? this.mDestination : this.mEngine.getInterpolation((j11 - this.mStart) * 1.0E-9f);
        }

        public boolean isNotDone(float f11) {
            StopEngine stopEngine;
            return (this.mOnTouchUp == 3 || (stopEngine = this.mEngine) == null || stopEngine.isStopped()) ? false : true;
        }

        public void printInfo() {
            if (this.mAutoCompleteMode == 0) {
                System.out.println("velocity = " + this.mEngine.getVelocity());
                System.out.println("mMaxAcceleration = " + this.mMaxAcceleration);
                System.out.println("mMaxVelocity = " + this.mMaxVelocity);
                return;
            }
            System.out.println("mSpringMass          = " + this.mSpringMass);
            System.out.println("mSpringStiffness     = " + this.mSpringStiffness);
            System.out.println("mSpringDamping       = " + this.mSpringDamping);
            System.out.println("mSpringStopThreshold = " + this.mSpringStopThreshold);
            System.out.println("mSpringBoundary      = " + this.mSpringBoundary);
        }

        public void setAnchorId(String str) {
            this.mAnchorId = str;
        }

        public void setAnchorSide(int i11) {
            this.mAnchorSide = i11;
        }

        public void setAutoCompleteMode(int i11) {
            this.mAutoCompleteMode = i11;
        }

        public void setDragDirection(int i11) {
            this.mDragDirection = i11;
            this.mDragVertical = i11 < 2;
        }

        public void setDragScale(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mDragScale = f11;
        }

        public void setDragThreshold(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mDragThreshold = f11;
        }

        public void setLimitBoundsTo(String str) {
            this.mLimitBoundsTo = str;
        }

        public void setMaxAcceleration(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mMaxAcceleration = f11;
        }

        public void setMaxVelocity(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mMaxVelocity = f11;
        }

        public void setOnTouchUp(int i11) {
            this.mOnTouchUp = i11;
        }

        public void setRotationCenterId(String str) {
            this.mRotationCenterId = str;
        }

        public void setSpringBoundary(int i11) {
            this.mSpringBoundary = i11;
        }

        public void setSpringDamping(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mSpringDamping = f11;
        }

        public void setSpringMass(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mSpringMass = f11;
        }

        public void setSpringStiffness(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mSpringStiffness = f11;
        }

        public void setSpringStopThreshold(float f11) {
            if (Float.isNaN(f11)) {
                return;
            }
            this.mSpringStopThreshold = f11;
        }
    }

    public Transition(@NonNull CorePixelDp corePixelDp) {
        this.mToPixel = corePixelDp;
    }

    public static /* synthetic */ float a(float f11) {
        return (float) Easing.getInterpolator("standard").get(f11);
    }

    public static /* synthetic */ float b(float f11) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f11);
    }

    public static /* synthetic */ float c(float f11) {
        return (float) Easing.getInterpolator("anticipate").get(f11);
    }

    private void calculateParentDimensions(float f11) {
        this.mParentInterpolatedWidth = (int) (this.mParentStartWidth + 0.5f + ((this.mParentEndWidth - r0) * f11));
        this.mParentInterpolateHeight = (int) (this.mParentStartHeight + 0.5f + ((this.mParentEndHeight - r0) * f11));
    }

    public static /* synthetic */ float d(String str, float f11) {
        return (float) Easing.getInterpolator(str).get(f11);
    }

    public static /* synthetic */ float e(float f11) {
        return (float) Easing.getInterpolator("linear").get(f11);
    }

    public static /* synthetic */ float f(float f11) {
        return (float) Easing.getInterpolator("decelerate").get(f11);
    }

    public static /* synthetic */ float g(float f11) {
        return (float) Easing.getInterpolator("overshoot").get(f11);
    }

    public static Interpolator getInterpolator(int i11, final String str) {
        switch (i11) {
            case -1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.a
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.d(str, f11);
                    }
                };
            case 0:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.b
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.a(f11);
                    }
                };
            case 1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.c
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.h(f11);
                    }
                };
            case 2:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.d
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.f(f11);
                    }
                };
            case 3:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.e
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.e(f11);
                    }
                };
            case 4:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.h
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.b(f11);
                    }
                };
            case 5:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.g
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.g(f11);
                    }
                };
            case 6:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.f
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f11) {
                        return Transition.c(f11);
                    }
                };
            default:
                return null;
        }
    }

    private WidgetState getWidgetState(String str) {
        return this.mState.get(str);
    }

    public static /* synthetic */ float h(float f11) {
        return (float) Easing.getInterpolator("accelerate").get(f11);
    }

    public void addCustomColor(int i11, String str, String str2, int i12) {
        getWidgetState(str, null, i11).getFrame(i11).addCustomColor(str2, i12);
    }

    public void addCustomFloat(int i11, String str, String str2, float f11) {
        getWidgetState(str, null, i11).getFrame(i11).addCustomFloat(str2, f11);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }

    public void calcStagger() {
        float f11;
        float f12;
        float f13 = this.mStagger;
        if (f13 == 0.0f) {
            return;
        }
        boolean z11 = ((double) f13) < 0.0d;
        float abs = Math.abs(f13);
        Iterator<String> it = this.mState.keySet().iterator();
        do {
            f11 = Float.MAX_VALUE;
            f12 = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator<String> it2 = this.mState.keySet().iterator();
                while (it2.hasNext()) {
                    Motion motion = this.mState.get(it2.next()).mMotionControl;
                    float finalX = motion.getFinalX() + motion.getFinalY();
                    f11 = Math.min(f11, finalX);
                    f12 = Math.max(f12, finalX);
                }
                Iterator<String> it3 = this.mState.keySet().iterator();
                while (it3.hasNext()) {
                    Motion motion2 = this.mState.get(it3.next()).mMotionControl;
                    float finalX2 = motion2.getFinalX() + motion2.getFinalY();
                    float f14 = f12 - f11;
                    float f15 = abs - (((finalX2 - f11) * abs) / f14);
                    if (z11) {
                        f15 = abs - (((f12 - finalX2) / f14) * abs);
                    }
                    motion2.setStaggerScale(1.0f / (1.0f - abs));
                    motion2.setStaggerOffset(f15);
                }
                return;
            }
        } while (Float.isNaN(this.mState.get(it.next()).mMotionControl.getMotionStagger()));
        Iterator<String> it4 = this.mState.keySet().iterator();
        while (it4.hasNext()) {
            float motionStagger = this.mState.get(it4.next()).mMotionControl.getMotionStagger();
            if (!Float.isNaN(motionStagger)) {
                f11 = Math.min(f11, motionStagger);
                f12 = Math.max(f12, motionStagger);
            }
        }
        Iterator<String> it5 = this.mState.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion3 = this.mState.get(it5.next()).mMotionControl;
            float motionStagger2 = motion3.getMotionStagger();
            if (!Float.isNaN(motionStagger2)) {
                float f16 = 1.0f / (1.0f - abs);
                float f17 = f12 - f11;
                float f18 = abs - (((motionStagger2 - f11) * abs) / f17);
                if (z11) {
                    f18 = abs - (((f12 - motionStagger2) / f17) * abs);
                }
                motion3.setStaggerScale(f16);
                motion3.setStaggerOffset(f18);
            }
        }
    }

    public void clear() {
        this.mState.clear();
    }

    public boolean contains(String str) {
        return this.mState.containsKey(str);
    }

    public OnSwipe createOnSwipe() {
        OnSwipe onSwipe = new OnSwipe();
        this.mOnSwipe = onSwipe;
        return onSwipe;
    }

    public float dragToProgress(float f11, int i11, int i12, float f12, float f13) {
        float abs;
        float scale;
        Iterator<WidgetState> it = this.mState.values().iterator();
        WidgetState next = it.hasNext() ? it.next() : null;
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null || next == null) {
            if (next != null) {
                return (-f13) / next.mParentHeight;
            }
            return 1.0f;
        }
        String str = onSwipe.mAnchorId;
        if (str == null) {
            float[] direction = onSwipe.getDirection();
            int i13 = next.mParentHeight;
            float f14 = i13;
            float f15 = i13;
            float f16 = direction[0];
            abs = f16 != 0.0f ? (f12 * Math.abs(f16)) / f14 : (f13 * Math.abs(direction[1])) / f15;
            scale = this.mOnSwipe.getScale();
        } else {
            WidgetState widgetState = this.mState.get(str);
            float[] direction2 = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            float[] fArr = new float[2];
            widgetState.interpolate(i11, i12, f11, this);
            widgetState.mMotionControl.getDpDt(f11, side[0], side[1], fArr);
            float f17 = direction2[0];
            abs = f17 != 0.0f ? (f12 * Math.abs(f17)) / fArr[0] : (f13 * Math.abs(direction2[1])) / fArr[1];
            scale = this.mOnSwipe.getScale();
        }
        return abs * scale;
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        int i11 = 0;
        for (int i12 = 0; i12 <= 100; i12++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i12));
            if (hashMap != null && (keyPosition = hashMap.get(widgetFrame.widget.stringId)) != null) {
                fArr[i11] = keyPosition.mX;
                fArr2[i11] = keyPosition.mY;
                fArr3[i11] = keyPosition.mFrame;
                i11++;
            }
        }
    }

    public KeyPosition findNextPosition(String str, int i11) {
        KeyPosition keyPosition;
        while (i11 <= 100) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i11));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i11++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i11) {
        KeyPosition keyPosition;
        while (i11 >= 0) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i11));
            if (hashMap != null && (keyPosition = hashMap.get(str)) != null) {
                return keyPosition;
            }
            i11--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mEnd;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mInterpolated;
    }

    public int getInterpolatedHeight() {
        return this.mParentInterpolateHeight;
    }

    public int getInterpolatedWidth() {
        return this.mParentInterpolatedWidth;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.mState.get(str).mMotionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).mMotionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i11 = 0;
        for (int i12 = 0; i12 <= 100; i12++) {
            HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i12));
            if (hashMap != null && hashMap.get(widgetFrame.widget.stringId) != null) {
                i11++;
            }
        }
        return i11;
    }

    public float[] getPath(String str) {
        float[] fArr = new float[124];
        this.mState.get(str).mMotionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mStart;
    }

    public float getTouchUpProgress(long j11) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            return onSwipe.getTouchUpProgress(j11);
        }
        return 0.0f;
    }

    public boolean hasOnSwipe() {
        return this.mOnSwipe != null;
    }

    public boolean hasPositionKeyframes() {
        return this.mKeyPositions.size() > 0;
    }

    public void interpolate(int i11, int i12, float f11) {
        if (this.mWrap) {
            calculateParentDimensions(f11);
        }
        Easing easing = this.mEasing;
        if (easing != null) {
            f11 = (float) easing.get(f11);
        }
        Iterator<String> it = this.mState.keySet().iterator();
        while (it.hasNext()) {
            this.mState.get(it.next()).interpolate(i11, i12, f11, this);
        }
    }

    public boolean isEmpty() {
        return this.mState.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isFirstDownAccepted(float f11, float f12) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null) {
            return false;
        }
        String str = onSwipe.mLimitBoundsTo;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = widgetState.getFrame(2);
        return f11 >= ((float) frame.left) && f11 < ((float) frame.right) && f12 >= ((float) frame.top) && f12 < ((float) frame.bottom);
    }

    public boolean isTouchNotDone(float f11) {
        return this.mOnSwipe.isNotDone(f11);
    }

    public void resetProperties() {
        this.mOnSwipe = null;
        this.mBundle.clear();
    }

    public void setTouchUp(float f11, long j11, float f12, float f13) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            WidgetState widgetState = this.mState.get(onSwipe.mAnchorId);
            float[] fArr = new float[2];
            float[] direction = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            widgetState.mMotionControl.getDpDt(f11, side[0], side[1], fArr);
            if (Math.abs((direction[0] * fArr[0]) + (direction[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.mOnSwipe.config(f11, (direction[0] != 0.0f ? f12 / fArr[0] : f13 / fArr[1]) * this.mOnSwipe.getScale(), j11, this.mDuration * 0.001f);
        }
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i11) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidgetContainer.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z11 = dimensionBehaviour == dimensionBehaviour2;
        this.mWrap = z11;
        this.mWrap = z11 | (dimensionBehaviourArr[1] == dimensionBehaviour2);
        if (i11 == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.mParentStartWidth = width;
            this.mParentInterpolatedWidth = width;
            int height = constraintWidgetContainer.getHeight();
            this.mParentStartHeight = height;
            this.mParentInterpolateHeight = height;
        } else {
            this.mParentEndWidth = constraintWidgetContainer.getWidth();
            this.mParentEndHeight = constraintWidgetContainer.getHeight();
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = children.get(i12);
            WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i11);
            widgetStateArr[i12] = widgetState;
            widgetState.update(constraintWidget, i11);
            String pathRelativeId = widgetState.getPathRelativeId();
            if (pathRelativeId != null) {
                widgetState.setPathRelative(getWidgetState(pathRelativeId, null, i11));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
    }

    public void addKeyPosition(String str, int i11, int i12, float f11, float f12) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, 2);
        typedBundle.add(100, i11);
        typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, f11);
        typedBundle.add(507, f12);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i11, i12, f11, f12);
        HashMap<String, KeyPosition> hashMap = this.mKeyPositions.get(Integer.valueOf(i11));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.mKeyPositions.put(Integer.valueOf(i11), hashMap);
        }
        hashMap.put(str, keyPosition);
    }

    public WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i11) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.mMotionControl);
            widgetState.mMotionWidgetStart.updateMotion(widgetState.mMotionControl);
            this.mState.put(str, widgetState);
            if (constraintWidget != null) {
                widgetState.update(constraintWidget, i11);
            }
        }
        return widgetState;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WidgetState {
        Motion mMotionControl;
        boolean mNeedSetup = true;
        KeyCache mKeyCache = new KeyCache();
        int mParentHeight = -1;
        int mParentWidth = -1;
        WidgetFrame mStart = new WidgetFrame();
        WidgetFrame mEnd = new WidgetFrame();
        WidgetFrame mInterpolated = new WidgetFrame();
        MotionWidget mMotionWidgetStart = new MotionWidget(this.mStart);
        MotionWidget mMotionWidgetEnd = new MotionWidget(this.mEnd);
        MotionWidget mMotionWidgetInterpolated = new MotionWidget(this.mInterpolated);

        public WidgetState() {
            Motion motion = new Motion(this.mMotionWidgetStart);
            this.mMotionControl = motion;
            motion.setStart(this.mMotionWidgetStart);
            this.mMotionControl.setEnd(this.mMotionWidgetEnd);
        }

        public WidgetFrame getFrame(int i11) {
            return i11 == 0 ? this.mStart : i11 == 1 ? this.mEnd : this.mInterpolated;
        }

        public String getPathRelativeId() {
            return this.mMotionControl.getAnimateRelativeTo();
        }

        public void interpolate(int i11, int i12, float f11, Transition transition) {
            this.mParentHeight = i12;
            this.mParentWidth = i11;
            if (this.mNeedSetup) {
                this.mMotionControl.setup(i11, i12, 1.0f, System.nanoTime());
                this.mNeedSetup = false;
            }
            WidgetFrame.interpolate(i11, i12, this.mInterpolated, this.mStart, this.mEnd, transition, f11);
            this.mInterpolated.interpolatedPos = f11;
            this.mMotionControl.interpolate(this.mMotionWidgetInterpolated, f11, System.nanoTime(), this.mKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.mMotionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.mMotionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.mMotionControl.addKey(motionKeyPosition);
        }

        public void setPathRelative(WidgetState widgetState) {
            this.mMotionControl.setupRelative(widgetState.mMotionControl);
        }

        public void update(ConstraintWidget constraintWidget, int i11) {
            if (i11 == 0) {
                this.mStart.update(constraintWidget);
                MotionWidget motionWidget = this.mMotionWidgetStart;
                motionWidget.updateMotion(motionWidget);
                this.mMotionControl.setStart(this.mMotionWidgetStart);
                this.mNeedSetup = true;
            } else if (i11 == 1) {
                this.mEnd.update(constraintWidget);
                this.mMotionControl.setEnd(this.mMotionWidgetEnd);
                this.mNeedSetup = true;
            }
            this.mParentWidth = -1;
        }

        public void setKeyAttribute(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i11 = 0; i11 < customVariableArr.length; i11++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i11].getName(), customVariableArr[i11]);
                }
            }
            this.mMotionControl.addKey(motionKeyAttributes);
        }
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).mEnd;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).mInterpolated;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).mStart;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        if (i11 != 706) {
            return false;
        }
        this.mStagger = f11;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (i11 != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = Easing.getInterpolator(str);
        return false;
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }
}
