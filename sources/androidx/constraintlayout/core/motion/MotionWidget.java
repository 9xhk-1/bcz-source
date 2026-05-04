package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class MotionWidget implements TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    Motion mMotion;
    private float mProgress;
    PropertySet mPropertySet;
    float mTransitionPathRotate;
    WidgetFrame mWidgetFrame;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Motion {
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int SPLINE_STRING = -1;
        public String mAnimateRelativeTo = null;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public MotionWidget() {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
    }

    public MotionWidget findViewById(int i11) {
        return null;
    }

    public float getAlpha() {
        return this.mWidgetFrame.alpha;
    }

    public int getBottom() {
        return this.mWidgetFrame.bottom;
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mWidgetFrame.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mWidgetFrame.getCustomAttributeNames();
    }

    public int getHeight() {
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.bottom - widgetFrame.top;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        int id2 = TypedValues.AttributesType.getId(str);
        return id2 != -1 ? id2 : TypedValues.MotionType.getId(str);
    }

    public int getLeft() {
        return this.mWidgetFrame.left;
    }

    public String getName() {
        return this.mWidgetFrame.getId();
    }

    public MotionWidget getParent() {
        return null;
    }

    public float getPivotX() {
        return this.mWidgetFrame.pivotX;
    }

    public float getPivotY() {
        return this.mWidgetFrame.pivotY;
    }

    public int getRight() {
        return this.mWidgetFrame.right;
    }

    public float getRotationX() {
        return this.mWidgetFrame.rotationX;
    }

    public float getRotationY() {
        return this.mWidgetFrame.rotationY;
    }

    public float getRotationZ() {
        return this.mWidgetFrame.rotationZ;
    }

    public float getScaleX() {
        return this.mWidgetFrame.scaleX;
    }

    public float getScaleY() {
        return this.mWidgetFrame.scaleY;
    }

    public int getTop() {
        return this.mWidgetFrame.top;
    }

    public float getTranslationX() {
        return this.mWidgetFrame.translationX;
    }

    public float getTranslationY() {
        return this.mWidgetFrame.translationY;
    }

    public float getTranslationZ() {
        return this.mWidgetFrame.translationZ;
    }

    public float getValueAttributes(int i11) {
        switch (i11) {
            case 303:
                return this.mWidgetFrame.alpha;
            case 304:
                return this.mWidgetFrame.translationX;
            case 305:
                return this.mWidgetFrame.translationY;
            case 306:
                return this.mWidgetFrame.translationZ;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.mWidgetFrame.rotationX;
            case 309:
                return this.mWidgetFrame.rotationY;
            case 310:
                return this.mWidgetFrame.rotationZ;
            case 311:
                return this.mWidgetFrame.scaleX;
            case 312:
                return this.mWidgetFrame.scaleY;
            case 313:
                return this.mWidgetFrame.pivotX;
            case 314:
                return this.mWidgetFrame.pivotY;
            case 315:
                return this.mProgress;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.mTransitionPathRotate;
        }
    }

    public int getVisibility() {
        return this.mPropertySet.visibility;
    }

    public WidgetFrame getWidgetFrame() {
        return this.mWidgetFrame;
    }

    public int getWidth() {
        WidgetFrame widgetFrame = this.mWidgetFrame;
        return widgetFrame.right - widgetFrame.left;
    }

    public int getX() {
        return this.mWidgetFrame.left;
    }

    public int getY() {
        return this.mWidgetFrame.top;
    }

    public void layout(int i11, int i12, int i13, int i14) {
        setBounds(i11, i12, i13, i14);
    }

    public void setBounds(int i11, int i12, int i13, int i14) {
        if (this.mWidgetFrame == null) {
            this.mWidgetFrame = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.mWidgetFrame;
        widgetFrame.top = i12;
        widgetFrame.left = i11;
        widgetFrame.right = i13;
        widgetFrame.bottom = i14;
    }

    public void setCustomAttribute(String str, int i11, float f11) {
        this.mWidgetFrame.setCustomAttribute(str, i11, f11);
    }

    public void setInterpolatedValue(CustomAttribute customAttribute, float[] fArr) {
        this.mWidgetFrame.setCustomAttribute(customAttribute.mName, 901, fArr[0]);
    }

    public void setPivotX(float f11) {
        this.mWidgetFrame.pivotX = f11;
    }

    public void setPivotY(float f11) {
        this.mWidgetFrame.pivotY = f11;
    }

    public void setRotationX(float f11) {
        this.mWidgetFrame.rotationX = f11;
    }

    public void setRotationY(float f11) {
        this.mWidgetFrame.rotationY = f11;
    }

    public void setRotationZ(float f11) {
        this.mWidgetFrame.rotationZ = f11;
    }

    public void setScaleX(float f11) {
        this.mWidgetFrame.scaleX = f11;
    }

    public void setScaleY(float f11) {
        this.mWidgetFrame.scaleY = f11;
    }

    public void setTranslationX(float f11) {
        this.mWidgetFrame.translationX = f11;
    }

    public void setTranslationY(float f11) {
        this.mWidgetFrame.translationY = f11;
    }

    public void setTranslationZ(float f11) {
        this.mWidgetFrame.translationZ = f11;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, boolean z11) {
        return false;
    }

    public boolean setValueAttributes(int i11, float f11) {
        switch (i11) {
            case 303:
                this.mWidgetFrame.alpha = f11;
                return true;
            case 304:
                this.mWidgetFrame.translationX = f11;
                return true;
            case 305:
                this.mWidgetFrame.translationY = f11;
                return true;
            case 306:
                this.mWidgetFrame.translationZ = f11;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.mWidgetFrame.rotationX = f11;
                return true;
            case 309:
                this.mWidgetFrame.rotationY = f11;
                return true;
            case 310:
                this.mWidgetFrame.rotationZ = f11;
                return true;
            case 311:
                this.mWidgetFrame.scaleX = f11;
                return true;
            case 312:
                this.mWidgetFrame.scaleY = f11;
                return true;
            case 313:
                this.mWidgetFrame.pivotX = f11;
                return true;
            case 314:
                this.mWidgetFrame.pivotY = f11;
                return true;
            case 315:
                this.mProgress = f11;
                return true;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                this.mTransitionPathRotate = f11;
                return true;
        }
    }

    public boolean setValueMotion(int i11, int i12) {
        switch (i11) {
            case TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO /* 606 */:
                this.mMotion.mAnimateCircleAngleTo = i12;
                return true;
            case TypedValues.MotionType.TYPE_PATHMOTION_ARC /* 607 */:
                this.mMotion.mPathMotionArc = i12;
                return true;
            case TypedValues.MotionType.TYPE_DRAW_PATH /* 608 */:
                this.mMotion.mDrawPath = i12;
                return true;
            case TypedValues.MotionType.TYPE_POLAR_RELATIVETO /* 609 */:
                this.mMotion.mPolarRelativeTo = i12;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS /* 610 */:
                this.mMotion.mQuantizeMotionSteps = i12;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE /* 611 */:
                this.mMotion.mQuantizeInterpolatorType = i12;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID /* 612 */:
                this.mMotion.mQuantizeInterpolatorID = i12;
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i11) {
        this.mPropertySet.visibility = i11;
    }

    public String toString() {
        return this.mWidgetFrame.left + j2.O + this.mWidgetFrame.top + j2.O + this.mWidgetFrame.right + j2.O + this.mWidgetFrame.bottom;
    }

    public void updateMotion(TypedValues typedValues) {
        if (this.mWidgetFrame.getMotionProperties() != null) {
            this.mWidgetFrame.getMotionProperties().applyDelta(typedValues);
        }
    }

    public void setCustomAttribute(String str, int i11, int i12) {
        this.mWidgetFrame.setCustomAttribute(str, i11, i12);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, int i12) {
        if (setValueAttributes(i11, i12)) {
            return true;
        }
        return setValueMotion(i11, i12);
    }

    public void setCustomAttribute(String str, int i11, boolean z11) {
        this.mWidgetFrame.setCustomAttribute(str, i11, z11);
    }

    public void setCustomAttribute(String str, int i11, String str2) {
        this.mWidgetFrame.setCustomAttribute(str, i11, str2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, float f11) {
        if (setValueAttributes(i11, f11)) {
            return true;
        }
        return setValueMotion(i11, f11);
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.mWidgetFrame = new WidgetFrame();
        this.mMotion = new Motion();
        this.mPropertySet = new PropertySet();
        this.mWidgetFrame = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i11, String str) {
        if (i11 == 605) {
            this.mMotion.mAnimateRelativeTo = str;
            return true;
        }
        return setValueMotion(i11, str);
    }

    public boolean setValueMotion(int i11, String str) {
        if (i11 == 603) {
            this.mMotion.mTransitionEasing = str;
            return true;
        }
        if (i11 != 604) {
            return false;
        }
        this.mMotion.mQuantizeInterpolatorString = str;
        return true;
    }

    public boolean setValueMotion(int i11, float f11) {
        switch (i11) {
            case 600:
                this.mMotion.mMotionStagger = f11;
                return true;
            case 601:
                this.mMotion.mPathRotate = f11;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE /* 602 */:
                this.mMotion.mQuantizeMotionPhase = f11;
                return true;
            default:
                return false;
        }
    }
}
