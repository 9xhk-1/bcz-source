package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.j2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final String KEY_PERCENT_PARENT = "parent";
    private static final String KEY_RATIO = "ratio";
    private static final String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    public String mIdString;
    private boolean mValidate;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static SparseIntArray sMapToConstant = new SparseIntArray();
    private static SparseIntArray sOverrideMapToConstant = new SparseIntArray();
    public String derivedState = "";
    private String[] mMatchLabels = new String[0];
    public int mRotate = 0;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Constraint {
        Delta mDelta;
        String mTargetString;
        int mViewId;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int i11, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i11;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.baselineMargin = layoutParams.baselineMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper constraintHelper, int i11, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i11, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.getType().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(String str, int i11) {
            get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(String str, float f11) {
            get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(String str, int i11) {
            get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str, String str2) {
            get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void applyDelta(Constraint constraint) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.applyDelta(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout.mWrapBehavior;
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        public void printDelta(String str) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.printDelta(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Constraint m5600clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            constraint.mDelta = this.mDelta;
            return constraint;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            int[] mTypeInt = new int[10];
            int[] mValueInt = new int[10];
            int mCountInt = 0;
            int[] mTypeFloat = new int[10];
            float[] mValueFloat = new float[10];
            int mCountFloat = 0;
            int[] mTypeString = new int[5];
            String[] mValueString = new String[5];
            int mCountString = 0;
            int[] mTypeBoolean = new int[4];
            boolean[] mValueBoolean = new boolean[4];
            int mCountBoolean = 0;

            public void add(int i11, int i12) {
                int i13 = this.mCountInt;
                int[] iArr = this.mTypeInt;
                if (i13 >= iArr.length) {
                    this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.mValueInt;
                    this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.mTypeInt;
                int i14 = this.mCountInt;
                iArr3[i14] = i11;
                int[] iArr4 = this.mValueInt;
                this.mCountInt = i14 + 1;
                iArr4[i14] = i12;
            }

            public void applyDelta(Constraint constraint) {
                for (int i11 = 0; i11 < this.mCountInt; i11++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeInt[i11], this.mValueInt[i11]);
                }
                for (int i12 = 0; i12 < this.mCountFloat; i12++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeFloat[i12], this.mValueFloat[i12]);
                }
                for (int i13 = 0; i13 < this.mCountString; i13++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeString[i13], this.mValueString[i13]);
                }
                for (int i14 = 0; i14 < this.mCountBoolean; i14++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeBoolean[i14], this.mValueBoolean[i14]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void printDelta(String str) {
                Log.v(str, "int");
                for (int i11 = 0; i11 < this.mCountInt; i11++) {
                    Log.v(str, this.mTypeInt[i11] + " = " + this.mValueInt[i11]);
                }
                Log.v(str, TypedValues.Custom.S_FLOAT);
                for (int i12 = 0; i12 < this.mCountFloat; i12++) {
                    Log.v(str, this.mTypeFloat[i12] + " = " + this.mValueFloat[i12]);
                }
                Log.v(str, "strings");
                for (int i13 = 0; i13 < this.mCountString; i13++) {
                    Log.v(str, this.mTypeString[i13] + " = " + this.mValueString[i13]);
                }
                Log.v(str, TypedValues.Custom.S_BOOLEAN);
                for (int i14 = 0; i14 < this.mCountBoolean; i14++) {
                    Log.v(str, this.mTypeBoolean[i14] + " = " + this.mValueBoolean[i14]);
                }
            }

            public void add(int i11, float f11) {
                int i12 = this.mCountFloat;
                int[] iArr = this.mTypeFloat;
                if (i12 >= iArr.length) {
                    this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.mValueFloat;
                    this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i13 = this.mCountFloat;
                iArr2[i13] = i11;
                float[] fArr2 = this.mValueFloat;
                this.mCountFloat = i13 + 1;
                fArr2[i13] = f11;
            }

            public void add(int i11, String str) {
                int i12 = this.mCountString;
                int[] iArr = this.mTypeString;
                if (i12 >= iArr.length) {
                    this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.mValueString;
                    this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.mTypeString;
                int i13 = this.mCountString;
                iArr2[i13] = i11;
                String[] strArr2 = this.mValueString;
                this.mCountString = i13 + 1;
                strArr2[i13] = str;
            }

            public void add(int i11, boolean z11) {
                int i12 = this.mCountBoolean;
                int[] iArr = this.mTypeBoolean;
                if (i12 >= iArr.length) {
                    this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.mValueBoolean;
                    this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i13 = this.mCountBoolean;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.mValueBoolean;
                this.mCountBoolean = i13 + 1;
                zArr2[i13] = z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int i11, Constraints.LayoutParams layoutParams) {
            fillFrom(i11, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray sMapToConstant;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            sMapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            sMapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            SparseIntArray sparseIntArray2 = sMapToConstant;
            int i11 = R.styleable.Layout_guidelineUseRtl;
            sparseIntArray2.append(i11, 90);
            sMapToConstant.append(R.styleable.Layout_android_orientation, 26);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            sMapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sMapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
            sMapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            sMapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            sMapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            sMapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            sMapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
            sMapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
            sMapToConstant.append(R.styleable.Layout_android_layout_width, 22);
            sMapToConstant.append(R.styleable.Layout_android_layout_height, 21);
            SparseIntArray sparseIntArray3 = sMapToConstant;
            int i12 = R.styleable.Layout_layout_constraintWidth;
            sparseIntArray3.append(i12, 41);
            SparseIntArray sparseIntArray4 = sMapToConstant;
            int i13 = R.styleable.Layout_layout_constraintHeight;
            sparseIntArray4.append(i13, 42);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedWidth, 87);
            sMapToConstant.append(R.styleable.Layout_layout_constrainedHeight, 88);
            sMapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            sMapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            sMapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
            sMapToConstant.append(R.styleable.Layout_barrierDirection, 72);
            sMapToConstant.append(R.styleable.Layout_barrierMargin, 73);
            sMapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
            sMapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
            SparseIntArray sparseIntArray5 = sMapToConstant;
            int i14 = R.styleable.Layout_layout_constraintWidth_max;
            sparseIntArray5.append(i14, 84);
            sMapToConstant.append(R.styleable.Layout_layout_constraintWidth_min, 86);
            sMapToConstant.append(i14, 83);
            sMapToConstant.append(R.styleable.Layout_layout_constraintHeight_min, 85);
            sMapToConstant.append(i12, 87);
            sMapToConstant.append(i13, 88);
            sMapToConstant.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 89);
            sMapToConstant.append(i11, 90);
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr == null || layout.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object lookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(lookUpConstraintName == null ? num : lookUpConstraintName);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f11 = (Float) obj;
                            if (f11.floatValue() != -1.0f) {
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f11);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e11) {
                        Log.e(ConstraintSet.TAG, "Error accessing ConstraintSet field", e11);
                    }
                }
            }
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = sMapToConstant.get(index);
                switch (i12) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = obtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = obtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = obtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = obtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.circleConstraint = ConstraintSet.lookupID(obtainStyledAttributes, index, this.circleConstraint);
                                break;
                            case 62:
                                this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                break;
                            case 63:
                                this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle);
                                break;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.mBarrierDirection = obtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        break;
                                    case 73:
                                        this.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        break;
                                    case 74:
                                        this.mReferenceIdString = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        break;
                                    case 76:
                                        this.mWrapBehavior = obtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        break;
                                    case 77:
                                        this.baselineToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToTop);
                                        break;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToBottom);
                                        break;
                                    case 79:
                                        this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        break;
                                    case 80:
                                        this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        break;
                                    case 81:
                                        this.widthDefault = obtainStyledAttributes.getInt(index, this.widthDefault);
                                        break;
                                    case 82:
                                        this.heightDefault = obtainStyledAttributes.getInt(index, this.heightDefault);
                                        break;
                                    case 83:
                                        this.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        break;
                                    case 84:
                                        this.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        break;
                                    case 85:
                                        this.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        break;
                                    case 86:
                                        this.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        break;
                                    case 87:
                                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        break;
                                    case 88:
                                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        break;
                                    case 89:
                                        this.mConstraintTag = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                    case 91:
                                        Log.w(ConstraintSet.TAG, "unused attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                                        break;
                                    default:
                                        Log.w(ConstraintSet.TAG, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray sMapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
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

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            sMapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
            sMapToConstant.append(R.styleable.Motion_transitionEasing, 3);
            sMapToConstant.append(R.styleable.Motion_drawPath, 4);
            sMapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
            sMapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
            sMapToConstant.append(R.styleable.Motion_motionStagger, 7);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
            sMapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = obtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.mTransitionEasing = Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(obtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = obtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = obtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = obtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = obtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf("/") > 0) {
                                this.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                this.mQuantizeInterpolatorType = -1;
                                break;
                            }
                        } else {
                            this.mQuantizeInterpolatorType = obtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = obtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = obtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray sMapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sMapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            sMapToConstant.append(R.styleable.Transform_android_rotationX, 2);
            sMapToConstant.append(R.styleable.Transform_android_rotationY, 3);
            sMapToConstant.append(R.styleable.Transform_android_scaleX, 4);
            sMapToConstant.append(R.styleable.Transform_android_scaleY, 5);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
            sMapToConstant.append(R.styleable.Transform_android_translationX, 8);
            sMapToConstant.append(R.styleable.Transform_android_translationY, 9);
            sMapToConstant.append(R.styleable.Transform_android_translationZ, 10);
            sMapToConstant.append(R.styleable.Transform_android_elevation, 11);
            sMapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = obtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = obtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = obtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = obtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = obtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = obtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.lookupID(obtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class WriteXmlEngine {
        private static final String SPACE = "\n       ";
        Context mContext;
        int mFlags;
        ConstraintLayout mLayout;
        Writer mWriter;
        int mUnknownCount = 0;
        final String mLEFT = "'left'";
        final String mRIGHT = "'right'";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        final String mTOP = "'top'";
        final String mSTART = "'start'";
        final String mEND = "'end'";
        HashMap<Integer, String> mIdMap = new HashMap<>();

        public WriteXmlEngine(Writer writer, ConstraintLayout constraintLayout, int i11) throws IOException {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i11;
        }

        private void writeBaseDimension(String str, int i11, int i12) throws IOException {
            if (i11 != i12) {
                if (i11 == -2) {
                    this.mWriter.write(SPACE + str + "=\"wrap_content\"");
                    return;
                }
                if (i11 == -1) {
                    this.mWriter.write(SPACE + str + "=\"match_parent\"");
                    return;
                }
                this.mWriter.write(SPACE + str + "=\"" + i11 + "dp\"");
            }
        }

        private void writeBoolen(String str, boolean z11, boolean z12) throws IOException {
            if (z11 != z12) {
                this.mWriter.write(SPACE + str + "=\"" + z11 + "dp\"");
            }
        }

        private void writeDimension(String str, int i11, int i12) throws IOException {
            if (i11 != i12) {
                this.mWriter.write(SPACE + str + "=\"" + i11 + "dp\"");
            }
        }

        private void writeEnum(String str, int i11, String[] strArr, int i12) throws IOException {
            if (i11 != i12) {
                this.mWriter.write(SPACE + str + "=\"" + strArr[i11] + "\"");
            }
        }

        public String getName(int i11) {
            if (this.mIdMap.containsKey(Integer.valueOf(i11))) {
                return "@+id/" + this.mIdMap.get(Integer.valueOf(i11)) + "";
            }
            if (i11 == 0) {
                return "parent";
            }
            String lookup = lookup(i11);
            this.mIdMap.put(Integer.valueOf(i11), lookup);
            return "@+id/" + lookup + "";
        }

        public String lookup(int i11) {
            try {
                if (i11 != -1) {
                    return this.mContext.getResources().getResourceEntryName(i11);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i12 = this.mUnknownCount + 1;
                this.mUnknownCount = i12;
                sb2.append(i12);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i13 = this.mUnknownCount + 1;
                this.mUnknownCount = i13;
                sb3.append(i13);
                return sb3.toString();
            }
        }

        public void writeCircle(int i11, float f11, int i12) throws IOException {
            if (i11 == -1) {
                return;
            }
            this.mWriter.write("circle");
            this.mWriter.write(":[");
            this.mWriter.write(getName(i11));
            this.mWriter.write(j2.O + f11);
            this.mWriter.write(i12 + "]");
        }

        public void writeConstraint(String str, int i11, String str2, int i12, int i13) throws IOException {
            if (i11 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(":[");
            this.mWriter.write(getName(i11));
            this.mWriter.write(" , ");
            this.mWriter.write(str2);
            if (i12 != 0) {
                this.mWriter.write(" , " + i12);
            }
            this.mWriter.write("],\n");
        }

        public void writeLayout() throws IOException {
            this.mWriter.write("\n<ConstraintSet>\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                String name = getName(num.intValue());
                this.mWriter.write("  <Constraint");
                this.mWriter.write("\n       android:id=\"" + name + "\"");
                Layout layout = constraint.layout;
                writeBaseDimension("android:layout_width", layout.mWidth, -5);
                writeBaseDimension("android:layout_height", layout.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", (float) layout.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", layout.dimensionRatio, (String) null);
                writeXmlConstraint("app:layout_constraintCircle", layout.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeVariable("android:orientation", layout.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", layout.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", layout.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", layout.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", layout.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", layout.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", layout.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", layout.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", layout.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", layout.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", layout.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", layout.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", layout.topToTop);
                String[] strArr = {"spread", "wrap", "percent"};
                writeEnum("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                writeVariable("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeVariable("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeEnum("app:barrierDirection", layout.mBarrierDirection, new String[]{TtmlNode.LEFT, TtmlNode.RIGHT, "top", "bottom", TtmlNode.START, TtmlNode.END}, -1);
                writeVariable("app:layout_constraintTag", layout.mConstraintTag, (String) null);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write(" />\n");
            }
            this.mWriter.write("</ConstraintSet>\n");
        }

        public void writeVariable(String str, int i11) throws IOException {
            if (i11 == 0 || i11 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str + "=\"" + i11 + "\"\n");
        }

        public void writeXmlConstraint(String str, int i11) throws IOException {
            if (i11 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write("=\"" + getName(i11) + "\"");
        }

        public void writeVariable(String str, float f11, float f12) throws IOException {
            if (f11 == f12) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write("=\"" + f11 + "\"");
        }

        public void writeVariable(String str, String str2, String str3) throws IOException {
            if (str2 == null || str2.equals(str3)) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write("=\"" + str2 + "\"");
        }

        public void writeVariable(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(":");
            int i11 = 0;
            while (i11 < iArr.length) {
                Writer writer = this.mWriter;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 == 0 ? "[" : j2.O);
                sb2.append(getName(iArr[i11]));
                writer.write(sb2.toString());
                i11++;
            }
            this.mWriter.write("],\n");
        }

        public void writeVariable(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.mWriter.write(str);
            this.mWriter.write(":");
            this.mWriter.write(j2.O + str2);
            this.mWriter.write("\n");
        }
    }

    static {
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        sMapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        sMapToConstant.append(R.styleable.Constraint_guidelineUseRtl, 99);
        sMapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        sMapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
        sMapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        sMapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
        sMapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth, 95);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight, 96);
        sMapToConstant.append(R.styleable.Constraint_android_visibility, 22);
        sMapToConstant.append(R.styleable.Constraint_android_alpha, 43);
        sMapToConstant.append(R.styleable.Constraint_android_elevation, 44);
        sMapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
        sMapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
        sMapToConstant.append(R.styleable.Constraint_android_rotation, 60);
        sMapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
        sMapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
        sMapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
        sMapToConstant.append(R.styleable.Constraint_android_translationX, 51);
        sMapToConstant.append(R.styleable.Constraint_android_translationY, 52);
        sMapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        sMapToConstant.append(R.styleable.Constraint_animateRelativeTo, 64);
        sMapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
        sMapToConstant.append(R.styleable.Constraint_drawPath, 66);
        sMapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
        sMapToConstant.append(R.styleable.Constraint_motionStagger, 79);
        sMapToConstant.append(R.styleable.Constraint_android_id, 38);
        sMapToConstant.append(R.styleable.Constraint_motionProgress, 68);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        sMapToConstant.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        sMapToConstant.append(R.styleable.Constraint_chainUseRtl, 71);
        sMapToConstant.append(R.styleable.Constraint_barrierDirection, 72);
        sMapToConstant.append(R.styleable.Constraint_barrierMargin, 73);
        sMapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        sMapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sMapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
        sMapToConstant.append(R.styleable.Constraint_layout_constraintTag, 77);
        sMapToConstant.append(R.styleable.Constraint_visibilityMode, 78);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        sMapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        sMapToConstant.append(R.styleable.Constraint_polarRelativeTo, 82);
        sMapToConstant.append(R.styleable.Constraint_transformPivotTarget, 83);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        sMapToConstant.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = sOverrideMapToConstant;
        int i11 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i11, 6);
        sOverrideMapToConstant.append(i11, 7);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_visibility, 22);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_alpha, 43);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_elevation, 44);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotation, 60);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationX, 51);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationY, 52);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_drawPath, 66);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionStagger, 79);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_id, 38);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionTarget, 98);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_motionProgress, 68);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (this.mSavedAttributes.containsKey(strArr[i11])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i11]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(strArr[i11], new ConstraintAttribute(strArr[i11], attributeType));
            }
        }
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        populateOverride(constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private int[] convertReferenceString(View view, String str) {
        int i11;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i11 = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i11 = 0;
            }
            if (i11 == 0) {
                i11 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i11 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i11 = ((Integer) designInformation).intValue();
            }
            iArr[i13] = i11;
            i12++;
            i13++;
        }
        return i13 != split.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet, boolean z11) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        populateConstraint(constraint, obtainStyledAttributes, z11);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i11) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i11))) {
            this.mConstraints.put(Integer.valueOf(i11), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i11));
    }

    public static String getDebugName(int i11) {
        for (Field field : ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i11) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e11) {
                    Log.e(TAG, "Error accessing ConstraintSet field", e11);
                }
            }
        }
        return "UNKNOWN";
    }

    public static String getLine(Context context, int i11, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i11) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseDimensionConstraints(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.constrainedWidth = r5
            return
        L3d:
            r4.height = r2
            r4.constrainedHeight = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r4
            if (r7 != 0) goto L4f
            r4.mWidth = r2
            r4.constrainedWidth = r5
            return
        L4f:
            r4.mHeight = r2
            r4.constrainedHeight = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.add(r6, r2)
            r6 = 80
            r4.add(r6, r5)
            return
        L67:
            r6 = 21
            r4.add(r6, r2)
            r6 = 81
            r4.add(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            parseDimensionConstraintsString(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void parseDimensionConstraintsString(Object obj, String str, int i11) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if (KEY_RATIO.equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    parseDimensionRatioString(layoutParams, trim2);
                    return;
                }
                if (obj instanceof Layout) {
                    ((Layout) obj).dimensionRatio = trim2;
                    return;
                } else {
                    if (obj instanceof Constraint.Delta) {
                        ((Constraint.Delta) obj).add(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if (KEY_WEIGHT.equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.horizontalWeight = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.verticalWeight = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout = (Layout) obj;
                        if (i11 == 0) {
                            layout.mWidth = 0;
                            layout.horizontalWeight = parseFloat;
                            return;
                        } else {
                            layout.mHeight = 0;
                            layout.verticalWeight = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta = (Constraint.Delta) obj;
                        if (i11 == 0) {
                            delta.add(23, 0);
                            delta.add(39, parseFloat);
                            return;
                        } else {
                            delta.add(21, 0);
                            delta.add(40, parseFloat);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.matchConstraintPercentWidth = max;
                            layoutParams3.matchConstraintDefaultWidth = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.matchConstraintPercentHeight = max;
                            layoutParams3.matchConstraintDefaultHeight = 2;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout2 = (Layout) obj;
                        if (i11 == 0) {
                            layout2.mWidth = 0;
                            layout2.widthPercent = max;
                            layout2.widthDefault = 2;
                            return;
                        } else {
                            layout2.mHeight = 0;
                            layout2.heightPercent = max;
                            layout2.heightDefault = 2;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta2 = (Constraint.Delta) obj;
                        if (i11 == 0) {
                            delta2.add(23, 0);
                            delta2.add(54, 2);
                        } else {
                            delta2.add(21, 0);
                            delta2.add(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void parseDimensionRatioString(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f11 = Float.NaN;
        int i11 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i12);
                    if (substring2.length() > 0) {
                        f11 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i12, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f11 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.mDimensionRatioValue = f11;
        layoutParams.mDimensionRatioSide = i11;
    }

    private void populateConstraint(Constraint constraint, TypedArray typedArray, boolean z11) {
        if (z11) {
            populateOverride(constraint, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (sMapToConstant.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                    break;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    break;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                    break;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                    break;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    break;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    break;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    break;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                    break;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                    break;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    break;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    break;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    break;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    break;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    break;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    break;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    break;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    break;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    break;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    break;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    break;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                    break;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    break;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    break;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                    break;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                    break;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    break;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    break;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                    break;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                    break;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    break;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                    break;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                    break;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    break;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                    break;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                    break;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    break;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    break;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    break;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    break;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    break;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    break;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    break;
                case 44:
                    Transform transform = constraint.transform;
                    transform.applyElevation = true;
                    transform.elevation = typedArray.getDimension(index, transform.elevation);
                    break;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    break;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    break;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    break;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    break;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    break;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    break;
                case 51:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    break;
                case 52:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    break;
                case 53:
                    Transform transform10 = constraint.transform;
                    transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    break;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    break;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    break;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    break;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    break;
                case 58:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    break;
                case 59:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    break;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    break;
                case 61:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                    break;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    break;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    break;
                case 64:
                    Motion motion = constraint.motion;
                    motion.mAnimateRelativeTo = lookupID(typedArray, index, motion.mAnimateRelativeTo);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        constraint.motion.mTransitionEasing = typedArray.getString(index);
                        break;
                    } else {
                        constraint.motion.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    break;
                case 67:
                    Motion motion2 = constraint.motion;
                    motion2.mPathRotate = typedArray.getFloat(index, motion2.mPathRotate);
                    break;
                case 68:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    break;
                case 69:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    break;
                case 73:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    break;
                case 74:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    break;
                case 75:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    Motion motion3 = constraint.motion;
                    motion3.mPathMotionArc = typedArray.getInt(index, motion3.mPathMotionArc);
                    break;
                case 77:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    break;
                case 78:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    break;
                case 79:
                    Motion motion4 = constraint.motion;
                    motion4.mMotionStagger = typedArray.getFloat(index, motion4.mMotionStagger);
                    break;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    break;
                case 81:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    break;
                case 82:
                    Motion motion5 = constraint.motion;
                    motion5.mAnimateCircleAngleTo = typedArray.getInteger(index, motion5.mAnimateCircleAngleTo);
                    break;
                case 83:
                    Transform transform12 = constraint.transform;
                    transform12.transformPivotTarget = lookupID(typedArray, index, transform12.transformPivotTarget);
                    break;
                case 84:
                    Motion motion6 = constraint.motion;
                    motion6.mQuantizeMotionSteps = typedArray.getInteger(index, motion6.mQuantizeMotionSteps);
                    break;
                case 85:
                    Motion motion7 = constraint.motion;
                    motion7.mQuantizeMotionPhase = typedArray.getFloat(index, motion7.mQuantizeMotionPhase);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        Motion motion8 = constraint.motion;
                        if (motion8.mQuantizeInterpolatorID != -1) {
                            motion8.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            break;
                        }
                    } else {
                        Motion motion9 = constraint.motion;
                        motion9.mQuantizeInterpolatorType = typedArray.getInteger(index, motion9.mQuantizeInterpolatorID);
                        break;
                    }
                case 87:
                    Log.w(TAG, "unused attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w(TAG, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                    break;
                case 91:
                    Layout layout54 = constraint.layout;
                    layout54.baselineToTop = lookupID(typedArray, index, layout54.baselineToTop);
                    break;
                case 92:
                    Layout layout55 = constraint.layout;
                    layout55.baselineToBottom = lookupID(typedArray, index, layout55.baselineToBottom);
                    break;
                case 93:
                    Layout layout56 = constraint.layout;
                    layout56.baselineMargin = typedArray.getDimensionPixelSize(index, layout56.baselineMargin);
                    break;
                case 94:
                    Layout layout57 = constraint.layout;
                    layout57.goneBaselineMargin = typedArray.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                    break;
                case 95:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 1);
                    break;
                case 97:
                    Layout layout58 = constraint.layout;
                    layout58.mWrapBehavior = typedArray.getInt(index, layout58.mWrapBehavior);
                    break;
            }
        }
        Layout layout59 = constraint.layout;
        if (layout59.mReferenceIdString != null) {
            layout59.mReferenceIds = null;
        }
    }

    private static void populateOverride(Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        constraint.mDelta = delta;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            switch (sOverrideMapToConstant.get(index)) {
                case 2:
                    delta.add(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w(TAG, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                    break;
                case 5:
                    delta.add(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.add(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.add(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.add(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    delta.add(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.add(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    delta.add(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.add(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    delta.add(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    delta.add(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    delta.add(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    delta.add(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    delta.add(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    delta.add(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    delta.add(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    delta.add(22, VISIBILITY_FLAGS[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    delta.add(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    delta.add(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    delta.add(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    delta.add(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    delta.add(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    delta.add(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    delta.add(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.mViewId);
                    constraint.mViewId = resourceId;
                    delta.add(38, resourceId);
                    break;
                case 39:
                    delta.add(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    delta.add(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    delta.add(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.add(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.add(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    delta.add(44, true);
                    delta.add(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    delta.add(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    delta.add(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    delta.add(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    delta.add(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    delta.add(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    delta.add(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case 51:
                    delta.add(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case 52:
                    delta.add(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case 53:
                    delta.add(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    delta.add(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    delta.add(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    delta.add(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    delta.add(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case 58:
                    delta.add(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case 59:
                    delta.add(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    delta.add(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    delta.add(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    delta.add(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    delta.add(64, lookupID(typedArray, index, constraint.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.add(65, typedArray.getString(index));
                        break;
                    } else {
                        delta.add(65, Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    delta.add(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    delta.add(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case 68:
                    delta.add(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case 69:
                    delta.add(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.add(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    delta.add(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    delta.add(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    delta.add(74, typedArray.getString(index));
                    break;
                case 75:
                    delta.add(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.add(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case 77:
                    delta.add(77, typedArray.getString(index));
                    break;
                case 78:
                    delta.add(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    delta.add(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    delta.add(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case 81:
                    delta.add(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case 82:
                    delta.add(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    delta.add(83, lookupID(typedArray, index, constraint.transform.transformPivotTarget));
                    break;
                case 84:
                    delta.add(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    delta.add(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                        Motion motion = constraint.motion;
                        if (motion.mQuantizeInterpolatorID != -1) {
                            motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        delta.add(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            delta.add(88, -1);
                            break;
                        }
                    } else {
                        Motion motion2 = constraint.motion;
                        motion2.mQuantizeInterpolatorType = typedArray.getInteger(index, motion2.mQuantizeInterpolatorID);
                        delta.add(88, constraint.motion.mQuantizeInterpolatorType);
                        break;
                    }
                case 87:
                    Log.w(TAG, "unused attribute 0x" + Integer.toHexString(index) + "   " + sMapToConstant.get(index));
                    break;
                case 93:
                    delta.add(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    delta.add(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    parseDimensionConstraints(delta, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(delta, typedArray, index, 1);
                    break;
                case 97:
                    delta.add(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId2 = typedArray.getResourceId(index, constraint.mViewId);
                        constraint.mViewId = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.mTargetString = typedArray.getString(index);
                        break;
                    } else {
                        constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                        break;
                    }
                case 99:
                    delta.add(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i11, float f11) {
        if (i11 == 19) {
            constraint.layout.guidePercent = f11;
            return;
        }
        if (i11 == 20) {
            constraint.layout.horizontalBias = f11;
            return;
        }
        if (i11 == 37) {
            constraint.layout.verticalBias = f11;
            return;
        }
        if (i11 == 60) {
            constraint.transform.rotation = f11;
            return;
        }
        if (i11 == 63) {
            constraint.layout.circleAngle = f11;
            return;
        }
        if (i11 == 79) {
            constraint.motion.mMotionStagger = f11;
            return;
        }
        if (i11 == 85) {
            constraint.motion.mQuantizeMotionPhase = f11;
            return;
        }
        if (i11 != 87) {
            if (i11 == 39) {
                constraint.layout.horizontalWeight = f11;
                return;
            }
            if (i11 == 40) {
                constraint.layout.verticalWeight = f11;
                return;
            }
            switch (i11) {
                case 43:
                    constraint.propertySet.alpha = f11;
                    break;
                case 44:
                    Transform transform = constraint.transform;
                    transform.elevation = f11;
                    transform.applyElevation = true;
                    break;
                case 45:
                    constraint.transform.rotationX = f11;
                    break;
                case 46:
                    constraint.transform.rotationY = f11;
                    break;
                case 47:
                    constraint.transform.scaleX = f11;
                    break;
                case 48:
                    constraint.transform.scaleY = f11;
                    break;
                case 49:
                    constraint.transform.transformPivotX = f11;
                    break;
                case 50:
                    constraint.transform.transformPivotY = f11;
                    break;
                case 51:
                    constraint.transform.translationX = f11;
                    break;
                case 52:
                    constraint.transform.translationY = f11;
                    break;
                case 53:
                    constraint.transform.translationZ = f11;
                    break;
                default:
                    switch (i11) {
                        case 67:
                            constraint.motion.mPathRotate = f11;
                            break;
                        case 68:
                            constraint.propertySet.mProgress = f11;
                            break;
                        case 69:
                            constraint.layout.widthPercent = f11;
                            break;
                        case 70:
                            constraint.layout.heightPercent = f11;
                            break;
                        default:
                            Log.w(TAG, "Unknown attribute 0x");
                            break;
                    }
            }
        }
    }

    private String sideToString(int i11) {
        switch (i11) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    private static String[] splitString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < charArray.length; i12++) {
            char c11 = charArray[i12];
            if (c11 == ',' && !z11) {
                arrayList.add(new String(charArray, i11, i12 - i11));
                i11 = i12 + 1;
            } else if (c11 == '\"') {
                z11 = !z11;
            }
        }
        arrayList.add(new String(charArray, i11, charArray.length - i11));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i11, int i12, int i13) {
        connect(i11, 1, i12, i12 == 0 ? 1 : 2, 0);
        connect(i11, 2, i13, i13 == 0 ? 2 : 1, 0);
        if (i12 != 0) {
            connect(i12, 2, i11, 1, 0);
        }
        if (i13 != 0) {
            connect(i13, 1, i11, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i11, int i12, int i13) {
        connect(i11, 6, i12, i12 == 0 ? 6 : 7, 0);
        connect(i11, 7, i13, i13 == 0 ? 7 : 6, 0);
        if (i12 != 0) {
            connect(i12, 7, i11, 6, 0);
        }
        if (i13 != 0) {
            connect(i13, 6, i11, 7, 0);
        }
    }

    public void addToVerticalChain(int i11, int i12, int i13) {
        connect(i11, 3, i12, i12 == 0 ? 3 : 4, 0);
        connect(i11, 4, i13, i13 == 0 ? 4 : 3, 0);
        if (i12 != 0) {
            connect(i12, 4, i11, 3, 0);
        }
        if (i13 != 0) {
            connect(i13, 3, i11, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id2))) {
                Log.w(TAG, "id unknown " + Debug.getName(childAt));
            } else {
                if (this.mForceId && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(Integer.valueOf(id2)) && (constraint = this.mConstraints.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.mConstraints.values()) {
            if (constraint.mDelta != null) {
                if (constraint.mTargetString == null) {
                    constraint.mDelta.applyDelta(getConstraint(constraint.mViewId));
                } else {
                    Iterator<Integer> it = this.mConstraints.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraint2 = getConstraint(it.next().intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.mTargetString.matches(str)) {
                            constraint.mDelta.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        int id2 = constraintHelper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id2)) && (constraint = this.mConstraints.get(Integer.valueOf(id2))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z11) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id2))) {
                Log.w(TAG, "id unknown " + Debug.getName(childAt));
            } else {
                if (this.mForceId && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.mConstraints.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        Constraint constraint = this.mConstraints.get(Integer.valueOf(id2));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.layout.mHelperType = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(constraint.layout.mBarrierDirection);
                                barrier.setMargin(constraint.layout.mBarrierMargin);
                                barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                                Layout layout = constraint.layout;
                                int[] iArr = layout.mReferenceIds;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.mReferenceIdString;
                                    if (str != null) {
                                        layout.mReferenceIds = convertReferenceString(barrier, str);
                                        barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.validate();
                            constraint.applyTo(layoutParams);
                            if (z11) {
                                ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.propertySet;
                            if (propertySet.mVisibilityMode == 0) {
                                childAt.setVisibility(propertySet.visibility);
                            }
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            Transform transform = constraint.transform;
                            if (transform.transformPivotTarget != -1) {
                                if (((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.transformPivotX)) {
                                    childAt.setPivotX(constraint.transform.transformPivotX);
                                }
                                if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                    childAt.setPivotY(constraint.transform.transformPivotY);
                                }
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            childAt.setTranslationZ(constraint.transform.translationZ);
                            Transform transform2 = constraint.transform;
                            if (transform2.applyElevation) {
                                childAt.setElevation(transform2.elevation);
                            }
                        }
                    } else {
                        Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void applyToLayoutParams(int i11, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        if (!this.mConstraints.containsKey(Integer.valueOf(i11)) || (constraint = this.mConstraints.get(Integer.valueOf(i11))) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11) {
        if (i14 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i17 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f11 <= 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i13 == 1 || i13 == 2) {
            connect(i11, 1, i12, i13, i14);
            connect(i11, 2, i15, i16, i17);
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
            if (constraint != null) {
                constraint.layout.horizontalBias = f11;
                return;
            }
            return;
        }
        if (i13 == 6 || i13 == 7) {
            connect(i11, 6, i12, i13, i14);
            connect(i11, 7, i15, i16, i17);
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(i11));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f11;
                return;
            }
            return;
        }
        connect(i11, 3, i12, i13, i14);
        connect(i11, 4, i15, i16, i17);
        Constraint constraint3 = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint3 != null) {
            constraint3.layout.verticalBias = f11;
        }
    }

    public void centerHorizontally(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11) {
        connect(i11, 1, i12, i13, i14);
        connect(i11, 2, i15, i16, i17);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint != null) {
            constraint.layout.horizontalBias = f11;
        }
    }

    public void centerHorizontallyRtl(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11) {
        connect(i11, 6, i12, i13, i14);
        connect(i11, 7, i15, i16, i17);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint != null) {
            constraint.layout.horizontalBias = f11;
        }
    }

    public void centerVertically(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11) {
        connect(i11, 3, i12, i13, i14);
        connect(i11, 4, i15, i16, i17);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint != null) {
            constraint.layout.verticalBias = f11;
        }
    }

    public void clear(int i11) {
        this.mConstraints.remove(Integer.valueOf(i11));
    }

    public void clone(Context context, int i11) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i11, (ViewGroup) null));
    }

    public void connect(int i11, int i12, int i13, int i14, int i15) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i11))) {
            this.mConstraints.put(Integer.valueOf(i11), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint == null) {
            return;
        }
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i13;
                    layout.leftToRight = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("Left to " + sideToString(i14) + " undefined");
                    }
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i13;
                    layout2.leftToLeft = -1;
                }
                constraint.layout.leftMargin = i15;
                return;
            case 2:
                if (i14 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i13;
                    layout3.rightToRight = -1;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i13;
                    layout4.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i15;
                return;
            case 3:
                if (i14 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i13;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                } else {
                    if (i14 != 4) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i13;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                }
                constraint.layout.topMargin = i15;
                return;
            case 4:
                if (i14 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i13;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                } else {
                    if (i14 != 3) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i13;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                }
                constraint.layout.bottomMargin = i15;
                return;
            case 5:
                if (i14 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i13;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i14 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i13;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                }
                Layout layout11 = constraint.layout;
                layout11.baselineToBottom = i13;
                layout11.bottomToBottom = -1;
                layout11.bottomToTop = -1;
                layout11.topToTop = -1;
                layout11.topToBottom = -1;
                return;
            case 6:
                if (i14 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i13;
                    layout12.startToEnd = -1;
                } else {
                    if (i14 != 7) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i13;
                    layout13.startToStart = -1;
                }
                constraint.layout.startMargin = i15;
                return;
            case 7:
                if (i14 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i13;
                    layout14.endToStart = -1;
                } else {
                    if (i14 != 6) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i13;
                    layout15.endToEnd = -1;
                }
                constraint.layout.endMargin = i15;
                return;
            default:
                throw new IllegalArgumentException(sideToString(i12) + " to " + sideToString(i14) + " unknown");
        }
    }

    public void constrainCircle(int i11, int i12, int i13, float f11) {
        Layout layout = get(i11).layout;
        layout.circleConstraint = i12;
        layout.circleRadius = i13;
        layout.circleAngle = f11;
    }

    public void constrainDefaultHeight(int i11, int i12) {
        get(i11).layout.heightDefault = i12;
    }

    public void constrainDefaultWidth(int i11, int i12) {
        get(i11).layout.widthDefault = i12;
    }

    public void constrainHeight(int i11, int i12) {
        get(i11).layout.mHeight = i12;
    }

    public void constrainMaxHeight(int i11, int i12) {
        get(i11).layout.heightMax = i12;
    }

    public void constrainMaxWidth(int i11, int i12) {
        get(i11).layout.widthMax = i12;
    }

    public void constrainMinHeight(int i11, int i12) {
        get(i11).layout.heightMin = i12;
    }

    public void constrainMinWidth(int i11, int i12) {
        get(i11).layout.widthMin = i12;
    }

    public void constrainPercentHeight(int i11, float f11) {
        get(i11).layout.heightPercent = f11;
    }

    public void constrainPercentWidth(int i11, float f11) {
        get(i11).layout.widthPercent = f11;
    }

    public void constrainWidth(int i11, int i12) {
        get(i11).layout.mWidth = i12;
    }

    public void constrainedHeight(int i11, boolean z11) {
        get(i11).layout.constrainedHeight = z11;
    }

    public void constrainedWidth(int i11, boolean z11) {
        get(i11).layout.constrainedWidth = z11;
    }

    public void create(int i11, int i12) {
        Layout layout = get(i11).layout;
        layout.mIsGuideline = true;
        layout.orientation = i12;
    }

    public void createBarrier(int i11, int i12, int i13, int... iArr) {
        Layout layout = get(i11).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i12;
        layout.mBarrierMargin = i13;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i11, int i12, int i13, int i14, int[] iArr, float[] fArr, int i15) {
        createHorizontalChain(i11, i12, i13, i14, iArr, fArr, i15, 1, 2);
    }

    public void createHorizontalChainRtl(int i11, int i12, int i13, int i14, int[] iArr, float[] fArr, int i15) {
        createHorizontalChain(i11, i12, i13, i14, iArr, fArr, i15, 6, 7);
    }

    public void createVerticalChain(int i11, int i12, int i13, int i14, int[] iArr, float[] fArr, int i15) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.verticalWeight = fArr[0];
        }
        get(iArr[0]).layout.verticalChainStyle = i15;
        connect(iArr[0], 3, i11, i12, 0);
        for (int i16 = 1; i16 < iArr.length; i16++) {
            int i17 = i16 - 1;
            connect(iArr[i16], 3, iArr[i17], 4, 0);
            connect(iArr[i17], 4, iArr[i16], 3, 0);
            if (fArr != null) {
                get(iArr[i16]).layout.verticalWeight = fArr[i16];
            }
        }
        connect(iArr[iArr.length - 1], 4, i13, i14, 0);
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i11 : iArr) {
                hashSet.add(Integer.valueOf(i11));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(num);
            if (constraint != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                constraint.layout.dump(motionScene, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public boolean getApplyElevation(int i11) {
        return get(i11).transform.applyElevation;
    }

    public Constraint getConstraint(int i11) {
        if (this.mConstraints.containsKey(Integer.valueOf(i11))) {
            return this.mConstraints.get(Integer.valueOf(i11));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public int getHeight(int i11) {
        return get(i11).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i11) {
        return get(i11);
    }

    public int[] getReferencedIds(int i11) {
        int[] iArr = get(i11).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public String[] getStateLabels() {
        String[] strArr = this.mMatchLabels;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public int getVisibility(int i11) {
        return get(i11).propertySet.visibility;
    }

    public int getVisibilityMode(int i11) {
        return get(i11).propertySet.mVisibilityMode;
    }

    public int getWidth(int i11) {
        return get(i11).layout.mWidth;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public boolean isValidateOnParse() {
        return this.mValidate;
    }

    public void load(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint fillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        fillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(fillFromAttributeList.mViewId), fillFromAttributeList);
                }
            }
        } catch (IOException e11) {
            Log.e(TAG, "Error parsing resource: " + i11, e11);
        } catch (XmlPullParserException e12) {
            Log.e(TAG, "Error parsing resource: " + i11, e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean matchesLabels(java.lang.String... r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1c
            r3 = r9[r2]
            java.lang.String[] r4 = r8.mMatchLabels
            int r5 = r4.length
            r6 = r1
        Lb:
            if (r6 >= r5) goto L1b
            r7 = r4[r6]
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L18
            int r2 = r2 + 1
            goto L3
        L18:
            int r6 = r6 + 1
            goto Lb
        L1b:
            return r1
        L1c:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.matchesLabels(java.lang.String[]):boolean");
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i11 = 0; i11 < split.length; i11++) {
            String[] split2 = split[i11].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split2.length != 2) {
                Log.w(TAG, " Unable to parse " + split[i11]);
            } else {
                constraint.setColorValue(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i11 = 0; i11 < split.length; i11++) {
            String[] split2 = split[i11].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split2.length != 2) {
                Log.w(TAG, " Unable to parse " + split[i11]);
            } else {
                constraint.setFloatValue(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i11 = 0; i11 < split.length; i11++) {
            String[] split2 = split[i11].split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split2.length != 2) {
                Log.w(TAG, " Unable to parse " + split[i11]);
            } else {
                constraint.setFloatValue(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] splitString = splitString(str);
        for (int i11 = 0; i11 < splitString.length; i11++) {
            String[] split = splitString[i11].split(ContainerUtils.KEY_VALUE_DELIMITER);
            Log.w(TAG, " Unable to parse " + splitString[i11]);
            constraint.setStringValue(split[0], split[1]);
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.mConstraints.keySet()) {
            num.intValue();
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(num)) {
                this.mConstraints.put(num, new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.mSavedAttributes.remove(str);
    }

    public void removeFromHorizontalChain(int i11) {
        Constraint constraint;
        if (!this.mConstraints.containsKey(Integer.valueOf(i11)) || (constraint = this.mConstraints.get(Integer.valueOf(i11))) == null) {
            return;
        }
        Layout layout = constraint.layout;
        int i12 = layout.leftToRight;
        int i13 = layout.rightToLeft;
        if (i12 != -1 || i13 != -1) {
            if (i12 == -1 || i13 == -1) {
                int i14 = layout.rightToRight;
                if (i14 != -1) {
                    connect(i12, 2, i14, 2, 0);
                } else {
                    int i15 = layout.leftToLeft;
                    if (i15 != -1) {
                        connect(i13, 1, i15, 1, 0);
                    }
                }
            } else {
                connect(i12, 2, i13, 1, 0);
                connect(i13, 1, i12, 2, 0);
            }
            clear(i11, 1);
            clear(i11, 2);
            return;
        }
        int i16 = layout.startToEnd;
        int i17 = layout.endToStart;
        if (i16 != -1 || i17 != -1) {
            if (i16 != -1 && i17 != -1) {
                connect(i16, 7, i17, 6, 0);
                connect(i17, 6, i12, 7, 0);
            } else if (i17 != -1) {
                int i18 = layout.rightToRight;
                if (i18 != -1) {
                    connect(i12, 7, i18, 7, 0);
                } else {
                    int i19 = layout.leftToLeft;
                    if (i19 != -1) {
                        connect(i17, 6, i19, 6, 0);
                        clear(i11, 6);
                        clear(i11, 7);
                    }
                }
            }
        }
        clear(i11, 6);
        clear(i11, 7);
    }

    public void removeFromVerticalChain(int i11) {
        if (this.mConstraints.containsKey(Integer.valueOf(i11))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
            if (constraint == null) {
                return;
            }
            Layout layout = constraint.layout;
            int i12 = layout.topToBottom;
            int i13 = layout.bottomToTop;
            if (i12 != -1 || i13 != -1) {
                if (i12 == -1 || i13 == -1) {
                    int i14 = layout.bottomToBottom;
                    if (i14 != -1) {
                        connect(i12, 4, i14, 4, 0);
                    } else {
                        int i15 = layout.topToTop;
                        if (i15 != -1) {
                            connect(i13, 3, i15, 3, 0);
                        }
                    }
                } else {
                    connect(i12, 4, i13, 3, 0);
                    connect(i13, 3, i12, 4, 0);
                }
                clear(i11, 3);
                clear(i11, 4);
            }
        }
        clear(i11, 3);
        clear(i11, 4);
    }

    public void setAlpha(int i11, float f11) {
        get(i11).propertySet.alpha = f11;
    }

    public void setApplyElevation(int i11, boolean z11) {
        get(i11).transform.applyElevation = z11;
    }

    public void setBarrierType(int i11, int i12) {
        get(i11).layout.mHelperType = i12;
    }

    public void setColorValue(int i11, String str, int i12) {
        get(i11).setColorValue(str, i12);
    }

    public void setDimensionRatio(int i11, String str) {
        get(i11).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i11, int i12) {
        get(i11).layout.editorAbsoluteX = i12;
    }

    public void setEditorAbsoluteY(int i11, int i12) {
        get(i11).layout.editorAbsoluteY = i12;
    }

    public void setElevation(int i11, float f11) {
        get(i11).transform.elevation = f11;
        get(i11).transform.applyElevation = true;
    }

    public void setFloatValue(int i11, String str, float f11) {
        get(i11).setFloatValue(str, f11);
    }

    public void setForceId(boolean z11) {
        this.mForceId = z11;
    }

    public void setGoneMargin(int i11, int i12, int i13) {
        Constraint constraint = get(i11);
        switch (i12) {
            case 1:
                constraint.layout.goneLeftMargin = i13;
                return;
            case 2:
                constraint.layout.goneRightMargin = i13;
                return;
            case 3:
                constraint.layout.goneTopMargin = i13;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i13;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = i13;
                return;
            case 6:
                constraint.layout.goneStartMargin = i13;
                return;
            case 7:
                constraint.layout.goneEndMargin = i13;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i11, int i12) {
        get(i11).layout.guideBegin = i12;
        get(i11).layout.guideEnd = -1;
        get(i11).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i11, int i12) {
        get(i11).layout.guideEnd = i12;
        get(i11).layout.guideBegin = -1;
        get(i11).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i11, float f11) {
        get(i11).layout.guidePercent = f11;
        get(i11).layout.guideEnd = -1;
        get(i11).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i11, float f11) {
        get(i11).layout.horizontalBias = f11;
    }

    public void setHorizontalChainStyle(int i11, int i12) {
        get(i11).layout.horizontalChainStyle = i12;
    }

    public void setHorizontalWeight(int i11, float f11) {
        get(i11).layout.horizontalWeight = f11;
    }

    public void setIntValue(int i11, String str, int i12) {
        get(i11).setIntValue(str, i12);
    }

    public void setLayoutWrapBehavior(int i11, int i12) {
        if (i12 < 0 || i12 > 3) {
            return;
        }
        get(i11).layout.mWrapBehavior = i12;
    }

    public void setMargin(int i11, int i12, int i13) {
        Constraint constraint = get(i11);
        switch (i12) {
            case 1:
                constraint.layout.leftMargin = i13;
                return;
            case 2:
                constraint.layout.rightMargin = i13;
                return;
            case 3:
                constraint.layout.topMargin = i13;
                return;
            case 4:
                constraint.layout.bottomMargin = i13;
                return;
            case 5:
                constraint.layout.baselineMargin = i13;
                return;
            case 6:
                constraint.layout.startMargin = i13;
                return;
            case 7:
                constraint.layout.endMargin = i13;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i11, int... iArr) {
        get(i11).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i11, float f11) {
        get(i11).transform.rotation = f11;
    }

    public void setRotationX(int i11, float f11) {
        get(i11).transform.rotationX = f11;
    }

    public void setRotationY(int i11, float f11) {
        get(i11).transform.rotationY = f11;
    }

    public void setScaleX(int i11, float f11) {
        get(i11).transform.scaleX = f11;
    }

    public void setScaleY(int i11, float f11) {
        get(i11).transform.scaleY = f11;
    }

    public void setStateLabels(String str) {
        this.mMatchLabels = str.split(",");
        int i11 = 0;
        while (true) {
            String[] strArr = this.mMatchLabels;
            if (i11 >= strArr.length) {
                return;
            }
            strArr[i11] = strArr[i11].trim();
            i11++;
        }
    }

    public void setStateLabelsList(String... strArr) {
        this.mMatchLabels = strArr;
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.mMatchLabels;
            if (i11 >= strArr2.length) {
                return;
            }
            strArr2[i11] = strArr2[i11].trim();
            i11++;
        }
    }

    public void setStringValue(int i11, String str, String str2) {
        get(i11).setStringValue(str, str2);
    }

    public void setTransformPivot(int i11, float f11, float f12) {
        Transform transform = get(i11).transform;
        transform.transformPivotY = f12;
        transform.transformPivotX = f11;
    }

    public void setTransformPivotX(int i11, float f11) {
        get(i11).transform.transformPivotX = f11;
    }

    public void setTransformPivotY(int i11, float f11) {
        get(i11).transform.transformPivotY = f11;
    }

    public void setTranslation(int i11, float f11, float f12) {
        Transform transform = get(i11).transform;
        transform.translationX = f11;
        transform.translationY = f12;
    }

    public void setTranslationX(int i11, float f11) {
        get(i11).transform.translationX = f11;
    }

    public void setTranslationY(int i11, float f11) {
        get(i11).transform.translationY = f11;
    }

    public void setTranslationZ(int i11, float f11) {
        get(i11).transform.translationZ = f11;
    }

    public void setValidateOnParse(boolean z11) {
        this.mValidate = z11;
    }

    public void setVerticalBias(int i11, float f11) {
        get(i11).layout.verticalBias = f11;
    }

    public void setVerticalChainStyle(int i11, int i12) {
        get(i11).layout.verticalChainStyle = i12;
    }

    public void setVerticalWeight(int i11, float f11) {
        get(i11).layout.verticalWeight = f11;
    }

    public void setVisibility(int i11, int i12) {
        get(i11).propertySet.visibility = i12;
    }

    public void setVisibilityMode(int i11, int i12) {
        get(i11).propertySet.mVisibilityMode = i12;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i11) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i11 & 1) == 1) {
            new WriteXmlEngine(writer, constraintLayout, i11).writeLayout();
        } else {
            new WriteJsonEngine(writer, constraintLayout, i11).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }

    private void createHorizontalChain(int i11, int i12, int i13, int i14, int[] iArr, float[] fArr, int i15, int i16, int i17) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        get(iArr[0]).layout.horizontalChainStyle = i15;
        connect(iArr[0], i16, i11, i12, -1);
        for (int i18 = 1; i18 < iArr.length; i18++) {
            int i19 = i18 - 1;
            connect(iArr[i18], i16, iArr[i19], i17, -1);
            connect(iArr[i19], i17, iArr[i18], i16, -1);
            if (fArr != null) {
                get(iArr[i18]).layout.horizontalWeight = fArr[i18];
            }
        }
        connect(iArr[iArr.length - 1], i17, i13, i14, -1);
    }

    public void clear(int i11, int i12) {
        Constraint constraint;
        if (!this.mConstraints.containsKey(Integer.valueOf(i11)) || (constraint = this.mConstraints.get(Integer.valueOf(i11))) == null) {
            return;
        }
        switch (i12) {
            case 1:
                Layout layout = constraint.layout;
                layout.leftToRight = -1;
                layout.leftToLeft = -1;
                layout.leftMargin = -1;
                layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                Layout layout2 = constraint.layout;
                layout2.rightToRight = -1;
                layout2.rightToLeft = -1;
                layout2.rightMargin = -1;
                layout2.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                Layout layout3 = constraint.layout;
                layout3.topToBottom = -1;
                layout3.topToTop = -1;
                layout3.topMargin = 0;
                layout3.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                Layout layout4 = constraint.layout;
                layout4.bottomToTop = -1;
                layout4.bottomToBottom = -1;
                layout4.bottomMargin = 0;
                layout4.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                Layout layout5 = constraint.layout;
                layout5.baselineToBaseline = -1;
                layout5.baselineToTop = -1;
                layout5.baselineToBottom = -1;
                layout5.baselineMargin = 0;
                layout5.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                Layout layout6 = constraint.layout;
                layout6.startToEnd = -1;
                layout6.startToStart = -1;
                layout6.startMargin = 0;
                layout6.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                Layout layout7 = constraint.layout;
                layout7.endToStart = -1;
                layout7.endToEnd = -1;
                layout7.endMargin = 0;
                layout7.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                Layout layout8 = constraint.layout;
                layout8.circleAngle = -1.0f;
                layout8.circleRadius = -1;
                layout8.circleConstraint = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (constraint != null) {
                this.mConstraints.put(num, constraint.m5600clone());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class WriteJsonEngine {
        private static final String SPACE = "       ";
        Context mContext;
        int mFlags;
        ConstraintLayout mLayout;
        Writer mWriter;
        int mUnknownCount = 0;
        final String mLEFT = "'left'";
        final String mRIGHT = "'right'";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        final String mTOP = "'top'";
        final String mSTART = "'start'";
        final String mEND = "'end'";
        HashMap<Integer, String> mIdMap = new HashMap<>();

        public WriteJsonEngine(Writer writer, ConstraintLayout constraintLayout, int i11) throws IOException {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i11;
        }

        private void writeDimension(String str, int i11, int i12, float f11, int i13, int i14, boolean z11) throws IOException {
            if (i11 != 0) {
                if (i11 == -2) {
                    this.mWriter.write(SPACE + str + ": 'wrap'\n");
                    return;
                }
                if (i11 == -1) {
                    this.mWriter.write(SPACE + str + ": 'parent'\n");
                    return;
                }
                this.mWriter.write(SPACE + str + ": " + i11 + ",\n");
                return;
            }
            if (i14 == -1 && i13 == -1) {
                if (i12 == 1) {
                    this.mWriter.write(SPACE + str + ": '???????????',\n");
                    return;
                }
                if (i12 != 2) {
                    return;
                }
                this.mWriter.write(SPACE + str + ": '" + f11 + "%',\n");
                return;
            }
            if (i12 == 0) {
                this.mWriter.write(SPACE + str + ": {'spread' ," + i13 + j2.O + i14 + "}\n");
                return;
            }
            if (i12 == 1) {
                this.mWriter.write(SPACE + str + ": {'wrap' ," + i13 + j2.O + i14 + "}\n");
                return;
            }
            if (i12 != 2) {
                return;
            }
            this.mWriter.write(SPACE + str + ": {'" + f11 + "'% ," + i13 + j2.O + i14 + "}\n");
        }

        private void writeGuideline(int i11, int i12, int i13, float f11) throws IOException {
            writeVariable("'orientation'", i11);
            writeVariable("'guideBegin'", i12);
            writeVariable("'guideEnd'", i13);
            writeVariable("'guidePercent'", f11);
        }

        public String getName(int i11) {
            if (this.mIdMap.containsKey(Integer.valueOf(i11))) {
                return "'" + this.mIdMap.get(Integer.valueOf(i11)) + "'";
            }
            if (i11 == 0) {
                return "'parent'";
            }
            String lookup = lookup(i11);
            this.mIdMap.put(Integer.valueOf(i11), lookup);
            return "'" + lookup + "'";
        }

        public String lookup(int i11) {
            try {
                if (i11 != -1) {
                    return this.mContext.getResources().getResourceEntryName(i11);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i12 = this.mUnknownCount + 1;
                this.mUnknownCount = i12;
                sb2.append(i12);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i13 = this.mUnknownCount + 1;
                this.mUnknownCount = i13;
                sb3.append(i13);
                return sb3.toString();
            }
        }

        public void writeCircle(int i11, float f11, int i12) throws IOException {
            if (i11 == -1) {
                return;
            }
            this.mWriter.write("       circle");
            this.mWriter.write(":[");
            this.mWriter.write(getName(i11));
            this.mWriter.write(j2.O + f11);
            this.mWriter.write(i12 + "]");
        }

        public void writeConstraint(String str, int i11, String str2, int i12, int i13) throws IOException {
            if (i11 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(":[");
            this.mWriter.write(getName(i11));
            this.mWriter.write(" , ");
            this.mWriter.write(str2);
            if (i12 != 0) {
                this.mWriter.write(" , " + i12);
            }
            this.mWriter.write("],\n");
        }

        public void writeLayout() throws IOException {
            this.mWriter.write("\n'ConstraintSet':{\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                String name = getName(num.intValue());
                this.mWriter.write(name + ":{\n");
                Layout layout = constraint.layout;
                writeDimension("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                writeDimension("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                writeConstraint("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                writeConstraint("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                writeConstraint("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                writeVariable("'horizontalBias'", layout.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", layout.verticalBias, 0.5f);
                writeCircle(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                writeGuideline(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                writeVariable("'dimensionRatio'", layout.dimensionRatio);
                writeVariable("'barrierMargin'", layout.mBarrierMargin);
                writeVariable("'type'", layout.mHelperType);
                writeVariable("'ReferenceId'", layout.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", layout.mWrapBehavior);
                writeVariable("'verticalWeight'", layout.verticalWeight);
                writeVariable("'horizontalWeight'", layout.horizontalWeight);
                writeVariable("'horizontalChainStyle'", layout.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", layout.verticalChainStyle);
                writeVariable("'barrierDirection'", layout.mBarrierDirection);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write("}\n");
            }
            this.mWriter.write("}\n");
        }

        public void writeVariable(String str, int i11) throws IOException {
            if (i11 == 0 || i11 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(":");
            this.mWriter.write(j2.O + i11);
            this.mWriter.write("\n");
        }

        public void writeVariable(String str, float f11) throws IOException {
            if (f11 == -1.0f) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(": " + f11);
            this.mWriter.write(",\n");
        }

        public void writeVariable(String str, float f11, float f12) throws IOException {
            if (f11 == f12) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(": " + f11);
            this.mWriter.write(",\n");
        }

        public void writeVariable(String str, boolean z11) throws IOException {
            if (z11) {
                this.mWriter.write(SPACE + str);
                this.mWriter.write(": " + z11);
                this.mWriter.write(",\n");
            }
        }

        public void writeVariable(String str, boolean z11, boolean z12) throws IOException {
            if (z11 == z12) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(": " + z11);
            this.mWriter.write(",\n");
        }

        public void writeVariable(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(": ");
            int i11 = 0;
            while (i11 < iArr.length) {
                Writer writer = this.mWriter;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 == 0 ? "[" : j2.O);
                sb2.append(getName(iArr[i11]));
                writer.write(sb2.toString());
                i11++;
            }
            this.mWriter.write("],\n");
        }

        public void writeVariable(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.mWriter.write(SPACE + str);
            this.mWriter.write(":");
            this.mWriter.write(j2.O + str2);
            this.mWriter.write("\n");
        }
    }

    public void centerHorizontally(int i11, int i12) {
        if (i12 == 0) {
            center(i11, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i11, i12, 2, 0, i12, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i11, int i12) {
        if (i12 == 0) {
            center(i11, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i11, i12, 7, 0, i12, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i11, int i12) {
        if (i12 == 0) {
            center(i11, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i11, i12, 4, 0, i12, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.mForceId && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id2))) {
                this.mConstraints.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id2));
            if (constraint != null) {
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                constraint.fillFrom(id2, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ae, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.mForceId && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id2))) {
                this.mConstraints.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id2));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.fillFrom(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i11, int i12) {
        if (i11 == 6) {
            constraint.layout.editorAbsoluteX = i12;
            return;
        }
        if (i11 == 7) {
            constraint.layout.editorAbsoluteY = i12;
            return;
        }
        if (i11 == 8) {
            constraint.layout.endMargin = i12;
            return;
        }
        if (i11 == 27) {
            constraint.layout.orientation = i12;
            return;
        }
        if (i11 == 28) {
            constraint.layout.rightMargin = i12;
            return;
        }
        if (i11 == 41) {
            constraint.layout.horizontalChainStyle = i12;
            return;
        }
        if (i11 == 42) {
            constraint.layout.verticalChainStyle = i12;
            return;
        }
        if (i11 == 61) {
            constraint.layout.circleConstraint = i12;
            return;
        }
        if (i11 == 62) {
            constraint.layout.circleRadius = i12;
            return;
        }
        if (i11 == 72) {
            constraint.layout.mBarrierDirection = i12;
            return;
        }
        if (i11 != 73) {
            switch (i11) {
                case 2:
                    constraint.layout.bottomMargin = i12;
                    break;
                case 11:
                    constraint.layout.goneBottomMargin = i12;
                    break;
                case 12:
                    constraint.layout.goneEndMargin = i12;
                    break;
                case 13:
                    constraint.layout.goneLeftMargin = i12;
                    break;
                case 14:
                    constraint.layout.goneRightMargin = i12;
                    break;
                case 15:
                    constraint.layout.goneStartMargin = i12;
                    break;
                case 16:
                    constraint.layout.goneTopMargin = i12;
                    break;
                case 17:
                    constraint.layout.guideBegin = i12;
                    break;
                case 18:
                    constraint.layout.guideEnd = i12;
                    break;
                case 31:
                    constraint.layout.startMargin = i12;
                    break;
                case 34:
                    constraint.layout.topMargin = i12;
                    break;
                case 38:
                    constraint.mViewId = i12;
                    break;
                case 64:
                    constraint.motion.mAnimateRelativeTo = i12;
                    break;
                case 66:
                    constraint.motion.mDrawPath = i12;
                    break;
                case 76:
                    constraint.motion.mPathMotionArc = i12;
                    break;
                case 78:
                    constraint.propertySet.mVisibilityMode = i12;
                    break;
                case 93:
                    constraint.layout.baselineMargin = i12;
                    break;
                case 94:
                    constraint.layout.goneBaselineMargin = i12;
                    break;
                case 97:
                    constraint.layout.mWrapBehavior = i12;
                    break;
                default:
                    switch (i11) {
                        case 21:
                            constraint.layout.mHeight = i12;
                            break;
                        case 22:
                            constraint.propertySet.visibility = i12;
                            break;
                        case 23:
                            constraint.layout.mWidth = i12;
                            break;
                        case 24:
                            constraint.layout.leftMargin = i12;
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    constraint.layout.widthDefault = i12;
                                    break;
                                case 55:
                                    constraint.layout.heightDefault = i12;
                                    break;
                                case 56:
                                    constraint.layout.widthMax = i12;
                                    break;
                                case 57:
                                    constraint.layout.heightMax = i12;
                                    break;
                                case 58:
                                    constraint.layout.widthMin = i12;
                                    break;
                                case 59:
                                    constraint.layout.heightMin = i12;
                                    break;
                                default:
                                    switch (i11) {
                                        case 82:
                                            constraint.motion.mAnimateCircleAngleTo = i12;
                                            break;
                                        case 83:
                                            constraint.transform.transformPivotTarget = i12;
                                            break;
                                        case 84:
                                            constraint.motion.mQuantizeMotionSteps = i12;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 87:
                                                    break;
                                                case 88:
                                                    constraint.motion.mQuantizeInterpolatorType = i12;
                                                    break;
                                                case 89:
                                                    constraint.motion.mQuantizeInterpolatorID = i12;
                                                    break;
                                                default:
                                                    Log.w(TAG, "Unknown attribute 0x");
                                                    break;
                                            }
                                    }
                            }
                    }
            }
            return;
        }
        constraint.layout.mBarrierMargin = i12;
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraints.getChildAt(i11);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.mForceId && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id2))) {
                this.mConstraints.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id2));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    constraint.fillFromConstraints((ConstraintHelper) childAt, id2, layoutParams);
                }
                constraint.fillFromConstraints(id2, layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i11, String str) {
        if (i11 == 5) {
            constraint.layout.dimensionRatio = str;
            return;
        }
        if (i11 == 65) {
            constraint.motion.mTransitionEasing = str;
            return;
        }
        if (i11 == 74) {
            Layout layout = constraint.layout;
            layout.mReferenceIdString = str;
            layout.mReferenceIds = null;
        } else if (i11 == 77) {
            constraint.layout.mConstraintTag = str;
        } else if (i11 != 87) {
            if (i11 != 90) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.motion.mQuantizeInterpolatorString = str;
            }
        }
    }

    public void connect(int i11, int i12, int i13, int i14) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i11))) {
            this.mConstraints.put(Integer.valueOf(i11), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i11));
        if (constraint == null) {
            return;
        }
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i13;
                    layout.leftToRight = -1;
                    return;
                } else if (i14 == 2) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i13;
                    layout2.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + sideToString(i14) + " undefined");
                }
            case 2:
                if (i14 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i13;
                    layout3.rightToRight = -1;
                    return;
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i13;
                    layout4.rightToLeft = -1;
                    return;
                }
            case 3:
                if (i14 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i13;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                }
                Layout layout6 = constraint.layout;
                layout6.topToBottom = i13;
                layout6.topToTop = -1;
                layout6.baselineToBaseline = -1;
                layout6.baselineToTop = -1;
                layout6.baselineToBottom = -1;
                return;
            case 4:
                if (i14 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i13;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                    return;
                }
                if (i14 != 3) {
                    throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                }
                Layout layout8 = constraint.layout;
                layout8.bottomToTop = i13;
                layout8.bottomToBottom = -1;
                layout8.baselineToBaseline = -1;
                layout8.baselineToTop = -1;
                layout8.baselineToBottom = -1;
                return;
            case 5:
                if (i14 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i13;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i14 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i13;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i14 != 4) {
                    throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                }
                Layout layout11 = constraint.layout;
                layout11.baselineToBottom = i13;
                layout11.bottomToBottom = -1;
                layout11.bottomToTop = -1;
                layout11.topToTop = -1;
                layout11.topToBottom = -1;
                return;
            case 6:
                if (i14 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i13;
                    layout12.startToEnd = -1;
                    return;
                } else {
                    if (i14 != 7) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i13;
                    layout13.startToStart = -1;
                    return;
                }
            case 7:
                if (i14 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i13;
                    layout14.endToStart = -1;
                    return;
                } else {
                    if (i14 != 6) {
                        throw new IllegalArgumentException("right to " + sideToString(i14) + " undefined");
                    }
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i13;
                    layout15.endToEnd = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(sideToString(i12) + " to " + sideToString(i14) + " unknown");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i11, boolean z11) {
        if (i11 == 44) {
            constraint.transform.applyElevation = z11;
            return;
        }
        if (i11 == 75) {
            constraint.layout.mBarrierAllowsGoneWidgets = z11;
            return;
        }
        if (i11 != 87) {
            if (i11 == 80) {
                constraint.layout.constrainedWidth = z11;
            } else if (i11 != 81) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.layout.constrainedHeight = z11;
            }
        }
    }
}
