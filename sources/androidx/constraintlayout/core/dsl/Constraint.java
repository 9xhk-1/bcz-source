package androidx.constraintlayout.core.dsl;

import com.badlogic.gdx.scenes.scene2d.ui.q;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Constraint {
    public static final Constraint PARENT = new Constraint(q.a.f13044u);
    static int UNSET = Integer.MIN_VALUE;
    static Map<ChainMode, String> chainModeMap;
    private float mCircleAngle;
    private String mCircleConstraint;
    private int mCircleRadius;
    private boolean mConstrainedHeight;
    private boolean mConstrainedWidth;
    private String mDimensionRatio;
    private int mEditorAbsoluteX;
    private int mEditorAbsoluteY;
    private int mHeight;
    private Behaviour mHeightDefault;
    private int mHeightMax;
    private int mHeightMin;
    private float mHeightPercent;
    private float mHorizontalBias;
    private ChainMode mHorizontalChainStyle;
    private float mHorizontalWeight;
    private final String mId;
    private String[] mReferenceIds;
    private float mVerticalBias;
    private ChainMode mVerticalChainStyle;
    private float mVerticalWeight;
    private int mWidth;
    private Behaviour mWidthDefault;
    private int mWidthMax;
    private int mWidthMin;
    private float mWidthPercent;
    String helperType = null;
    String helperJason = null;
    private HAnchor mLeft = new HAnchor(HSide.LEFT);
    private HAnchor mRight = new HAnchor(HSide.RIGHT);
    private VAnchor mTop = new VAnchor(VSide.TOP);
    private VAnchor mBottom = new VAnchor(VSide.BOTTOM);
    private HAnchor mStart = new HAnchor(HSide.START);
    private HAnchor mEnd = new HAnchor(HSide.END);
    private VAnchor mBaseline = new VAnchor(VSide.BASELINE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class Anchor {
        Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Side mSide;

        public Anchor(Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb2) {
            if (this.mConnection != null) {
                sb2.append(this.mSide.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String getId() {
            return Constraint.this.mId;
        }

        public Constraint getParent() {
            return Constraint.this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            if (this.mConnection != null) {
                sb2.append("'");
                sb2.append(this.mConnection.getId());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.mConnection.mSide.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.mMargin != 0) {
                sb2.append(",");
                sb2.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb2.append(",0,");
                    sb2.append(this.mGoneMargin);
                } else {
                    sb2.append(",");
                    sb2.append(this.mGoneMargin);
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class HAnchor extends Anchor {
        public HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class VAnchor extends Anchor {
        public VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap hashMap = new HashMap();
        chainModeMap = hashMap;
        hashMap.put(ChainMode.SPREAD, "spread");
        chainModeMap.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        chainModeMap.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i11 = UNSET;
        this.mWidth = i11;
        this.mHeight = i11;
        this.mHorizontalBias = Float.NaN;
        this.mVerticalBias = Float.NaN;
        this.mDimensionRatio = null;
        this.mCircleConstraint = null;
        this.mCircleRadius = Integer.MIN_VALUE;
        this.mCircleAngle = Float.NaN;
        this.mEditorAbsoluteX = Integer.MIN_VALUE;
        this.mEditorAbsoluteY = Integer.MIN_VALUE;
        this.mVerticalWeight = Float.NaN;
        this.mHorizontalWeight = Float.NaN;
        this.mHorizontalChainStyle = null;
        this.mVerticalChainStyle = null;
        this.mWidthDefault = null;
        this.mHeightDefault = null;
        this.mWidthMax = i11;
        this.mHeightMax = i11;
        this.mWidthMin = i11;
        this.mHeightMin = i11;
        this.mWidthPercent = Float.NaN;
        this.mHeightPercent = Float.NaN;
        this.mReferenceIds = null;
        this.mConstrainedWidth = false;
        this.mConstrainedHeight = false;
        this.mId = str;
    }

    public void append(StringBuilder sb2, String str, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(f11);
        sb2.append(",\n");
    }

    public String convertStringArrayToString(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("[");
        int i11 = 0;
        while (i11 < strArr.length) {
            sb2.append(i11 == 0 ? "'" : ",'");
            sb2.append(strArr[i11]);
            sb2.append("'");
            i11++;
        }
        sb2.append("]");
        return sb2.toString();
    }

    public VAnchor getBaseline() {
        return this.mBaseline;
    }

    public VAnchor getBottom() {
        return this.mBottom;
    }

    public float getCircleAngle() {
        return this.mCircleAngle;
    }

    public String getCircleConstraint() {
        return this.mCircleConstraint;
    }

    public int getCircleRadius() {
        return this.mCircleRadius;
    }

    public String getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getEditorAbsoluteX() {
        return this.mEditorAbsoluteX;
    }

    public int getEditorAbsoluteY() {
        return this.mEditorAbsoluteY;
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Behaviour getHeightDefault() {
        return this.mHeightDefault;
    }

    public int getHeightMax() {
        return this.mHeightMax;
    }

    public int getHeightMin() {
        return this.mHeightMin;
    }

    public float getHeightPercent() {
        return this.mHeightPercent;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalWeight() {
        return this.mHorizontalWeight;
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public String[] getReferenceIds() {
        return this.mReferenceIds;
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public VAnchor getTop() {
        return this.mTop;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public ChainMode getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public float getVerticalWeight() {
        return this.mVerticalWeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public Behaviour getWidthDefault() {
        return this.mWidthDefault;
    }

    public int getWidthMax() {
        return this.mWidthMax;
    }

    public int getWidthMin() {
        return this.mWidthMin;
    }

    public float getWidthPercent() {
        return this.mWidthPercent;
    }

    public boolean isConstrainedHeight() {
        return this.mConstrainedHeight;
    }

    public boolean isConstrainedWidth() {
        return this.mConstrainedWidth;
    }

    public void linkToBaseline(VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBottom(VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToEnd(HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToTop(VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void setCircleAngle(float f11) {
        this.mCircleAngle = f11;
    }

    public void setCircleConstraint(String str) {
        this.mCircleConstraint = str;
    }

    public void setCircleRadius(int i11) {
        this.mCircleRadius = i11;
    }

    public void setConstrainedHeight(boolean z11) {
        this.mConstrainedHeight = z11;
    }

    public void setConstrainedWidth(boolean z11) {
        this.mConstrainedWidth = z11;
    }

    public void setDimensionRatio(String str) {
        this.mDimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i11) {
        this.mEditorAbsoluteX = i11;
    }

    public void setEditorAbsoluteY(int i11) {
        this.mEditorAbsoluteY = i11;
    }

    public void setHeight(int i11) {
        this.mHeight = i11;
    }

    public void setHeightDefault(Behaviour behaviour) {
        this.mHeightDefault = behaviour;
    }

    public void setHeightMax(int i11) {
        this.mHeightMax = i11;
    }

    public void setHeightMin(int i11) {
        this.mHeightMin = i11;
    }

    public void setHeightPercent(float f11) {
        this.mHeightPercent = f11;
    }

    public void setHorizontalBias(float f11) {
        this.mHorizontalBias = f11;
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        this.mHorizontalChainStyle = chainMode;
    }

    public void setHorizontalWeight(float f11) {
        this.mHorizontalWeight = f11;
    }

    public void setReferenceIds(String[] strArr) {
        this.mReferenceIds = strArr;
    }

    public void setVerticalBias(float f11) {
        this.mVerticalBias = f11;
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        this.mVerticalChainStyle = chainMode;
    }

    public void setVerticalWeight(float f11) {
        this.mVerticalWeight = f11;
    }

    public void setWidth(int i11) {
        this.mWidth = i11;
    }

    public void setWidthDefault(Behaviour behaviour) {
        this.mWidthDefault = behaviour;
    }

    public void setWidthMax(int i11) {
        this.mWidthMax = i11;
    }

    public void setWidthMin(int i11) {
        this.mWidthMin = i11;
    }

    public void setWidthPercent(float f11) {
        this.mWidthPercent = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.mId + ":{\n");
        this.mLeft.build(sb2);
        this.mRight.build(sb2);
        this.mTop.build(sb2);
        this.mBottom.build(sb2);
        this.mStart.build(sb2);
        this.mEnd.build(sb2);
        this.mBaseline.build(sb2);
        if (this.mWidth != UNSET) {
            sb2.append("width:");
            sb2.append(this.mWidth);
            sb2.append(",\n");
        }
        if (this.mHeight != UNSET) {
            sb2.append("height:");
            sb2.append(this.mHeight);
            sb2.append(",\n");
        }
        append(sb2, "horizontalBias", this.mHorizontalBias);
        append(sb2, "verticalBias", this.mVerticalBias);
        if (this.mDimensionRatio != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.mDimensionRatio);
            sb2.append("',\n");
        }
        if (this.mCircleConstraint != null && (!Float.isNaN(this.mCircleAngle) || this.mCircleRadius != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.mCircleConstraint);
            sb2.append("'");
            if (!Float.isNaN(this.mCircleAngle)) {
                sb2.append(",");
                sb2.append(this.mCircleAngle);
            }
            if (this.mCircleRadius != Integer.MIN_VALUE) {
                if (Float.isNaN(this.mCircleAngle)) {
                    sb2.append(",0,");
                    sb2.append(this.mCircleRadius);
                } else {
                    sb2.append(",");
                    sb2.append(this.mCircleRadius);
                }
            }
            sb2.append("],\n");
        }
        append(sb2, "verticalWeight", this.mVerticalWeight);
        append(sb2, "horizontalWeight", this.mHorizontalWeight);
        if (this.mHorizontalChainStyle != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append(chainModeMap.get(this.mHorizontalChainStyle));
            sb2.append("',\n");
        }
        if (this.mVerticalChainStyle != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append(chainModeMap.get(this.mVerticalChainStyle));
            sb2.append("',\n");
        }
        if (this.mWidthDefault != null) {
            int i11 = this.mWidthMax;
            int i12 = UNSET;
            if (i11 == i12 && this.mWidthMin == i12) {
                sb2.append("width:'");
                sb2.append(this.mWidthDefault.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.mWidthDefault.toString().toLowerCase());
                sb2.append("'");
                if (this.mWidthMax != UNSET) {
                    sb2.append(",max:");
                    sb2.append(this.mWidthMax);
                }
                if (this.mWidthMin != UNSET) {
                    sb2.append(",min:");
                    sb2.append(this.mWidthMin);
                }
                sb2.append("},\n");
            }
        }
        if (this.mHeightDefault != null) {
            int i13 = this.mHeightMax;
            int i14 = UNSET;
            if (i13 == i14 && this.mHeightMin == i14) {
                sb2.append("height:'");
                sb2.append(this.mHeightDefault.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.mHeightDefault.toString().toLowerCase());
                sb2.append("'");
                if (this.mHeightMax != UNSET) {
                    sb2.append(",max:");
                    sb2.append(this.mHeightMax);
                }
                if (this.mHeightMin != UNSET) {
                    sb2.append(",min:");
                    sb2.append(this.mHeightMin);
                }
                sb2.append("},\n");
            }
        }
        if (!Double.isNaN(this.mWidthPercent)) {
            sb2.append("width:'");
            sb2.append((int) this.mWidthPercent);
            sb2.append("%',\n");
        }
        if (!Double.isNaN(this.mHeightPercent)) {
            sb2.append("height:'");
            sb2.append((int) this.mHeightPercent);
            sb2.append("%',\n");
        }
        if (this.mReferenceIds != null) {
            sb2.append("referenceIds:");
            sb2.append(convertStringArrayToString(this.mReferenceIds));
            sb2.append(",\n");
        }
        if (this.mConstrainedWidth) {
            sb2.append("constrainedWidth:");
            sb2.append(this.mConstrainedWidth);
            sb2.append(",\n");
        }
        if (this.mConstrainedHeight) {
            sb2.append("constrainedHeight:");
            sb2.append(this.mConstrainedHeight);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public void linkToBaseline(VAnchor vAnchor, int i11) {
        linkToBaseline(vAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor vAnchor, int i11) {
        linkToBottom(vAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor hAnchor, int i11) {
        linkToEnd(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor hAnchor, int i11) {
        linkToLeft(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor hAnchor, int i11) {
        linkToRight(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor hAnchor, int i11) {
        linkToStart(hAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor vAnchor, int i11) {
        linkToTop(vAnchor, i11, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor vAnchor, int i11, int i12) {
        VAnchor vAnchor2 = this.mBaseline;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i11;
        vAnchor2.mGoneMargin = i12;
    }

    public void linkToBottom(VAnchor vAnchor, int i11, int i12) {
        VAnchor vAnchor2 = this.mBottom;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i11;
        vAnchor2.mGoneMargin = i12;
    }

    public void linkToEnd(HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mEnd;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
    }

    public void linkToLeft(HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mLeft;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
    }

    public void linkToRight(HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mRight;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
    }

    public void linkToStart(HAnchor hAnchor, int i11, int i12) {
        HAnchor hAnchor2 = this.mStart;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i11;
        hAnchor2.mGoneMargin = i12;
    }

    public void linkToTop(VAnchor vAnchor, int i11, int i12) {
        VAnchor vAnchor2 = this.mTop;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i11;
        vAnchor2.mGoneMargin = i12;
    }
}
