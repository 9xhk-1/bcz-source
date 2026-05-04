package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget mBiggest = null;
        int mBiggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i11, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i12) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i11;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i12;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.mBiggest = null;
            this.mBiggestDimension = 0;
            int i11 = this.mCount;
            for (int i12 = 0; i12 < i11 && this.mStartIndex + i12 < Flow.this.mDisplayedWidgetsCount; i12++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i12];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i13 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i13 = 0;
                    }
                    this.mWidth += width + i13;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i14 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i14 = 0;
                    }
                    this.mHeight += widgetHeight2 + i14;
                    if (this.mBiggest == null || this.mBiggestDimension < widgetWidth) {
                        this.mBiggest = constraintWidget;
                        this.mBiggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth += widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0);
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.mBiggest == null || this.mBiggestDimension < widgetHeight) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight += widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0);
                if (this.mBiggest == null || this.mBiggestDimension < widgetWidth2) {
                    this.mBiggest = constraintWidget;
                    this.mBiggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.mBiggestDimension = 0;
            this.mBiggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        public void createConstraints(boolean z11, int i11, boolean z12) {
            ConstraintWidget constraintWidget;
            int i12;
            char c11;
            float f11;
            float f12;
            int i13 = this.mCount;
            for (int i14 = 0; i14 < i13 && this.mStartIndex + i14 < Flow.this.mDisplayedWidgetsCount; i14++) {
                ConstraintWidget constraintWidget2 = Flow.this.mDisplayedWidgets[this.mStartIndex + i14];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i13 == 0 || this.mBiggest == null) {
                return;
            }
            boolean z13 = z12 && i11 == 0;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = z11 ? (i13 - 1) - i17 : i17;
                if (this.mStartIndex + i18 >= Flow.this.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.mDisplayedWidgets[this.mStartIndex + i18];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i15 == -1) {
                        i15 = i17;
                    }
                    i16 = i17;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation != 0) {
                ConstraintWidget constraintWidget5 = this.mBiggest;
                constraintWidget5.setHorizontalChainStyle(Flow.this.mHorizontalStyle);
                int i19 = this.mPaddingLeft;
                if (i11 > 0) {
                    i19 += Flow.this.mHorizontalGap;
                }
                if (z11) {
                    constraintWidget5.mRight.connect(this.mRight, i19);
                    if (z12) {
                        constraintWidget5.mLeft.connect(this.mLeft, this.mPaddingRight);
                    }
                    if (i11 > 0) {
                        this.mRight.mOwner.mLeft.connect(constraintWidget5.mRight, 0);
                    }
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, i19);
                    if (z12) {
                        constraintWidget5.mRight.connect(this.mRight, this.mPaddingRight);
                    }
                    if (i11 > 0) {
                        this.mLeft.mOwner.mRight.connect(constraintWidget5.mLeft, 0);
                    }
                }
                for (int i21 = 0; i21 < i13 && this.mStartIndex + i21 < Flow.this.mDisplayedWidgetsCount; i21++) {
                    ConstraintWidget constraintWidget6 = Flow.this.mDisplayedWidgets[this.mStartIndex + i21];
                    if (constraintWidget6 != null) {
                        if (i21 == 0) {
                            constraintWidget6.connect(constraintWidget6.mTop, this.mTop, this.mPaddingTop);
                            int i22 = Flow.this.mVerticalStyle;
                            float f13 = Flow.this.mVerticalBias;
                            if (this.mStartIndex == 0 && Flow.this.mFirstVerticalStyle != -1) {
                                i22 = Flow.this.mFirstVerticalStyle;
                                f13 = Flow.this.mFirstVerticalBias;
                            } else if (z12 && Flow.this.mLastVerticalStyle != -1) {
                                i22 = Flow.this.mLastVerticalStyle;
                                f13 = Flow.this.mLastVerticalBias;
                            }
                            constraintWidget6.setVerticalChainStyle(i22);
                            constraintWidget6.setVerticalBiasPercent(f13);
                        }
                        if (i21 == i13 - 1) {
                            constraintWidget6.connect(constraintWidget6.mBottom, this.mBottom, this.mPaddingBottom);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mTop.connect(constraintWidget4.mBottom, Flow.this.mVerticalGap);
                            if (i21 == i15) {
                                constraintWidget6.mTop.setGoneMargin(this.mPaddingTop);
                            }
                            constraintWidget4.mBottom.connect(constraintWidget6.mTop, 0);
                            if (i21 == i16 + 1) {
                                constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z11) {
                                int i23 = Flow.this.mHorizontalAlign;
                                if (i23 == 0) {
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                } else if (i23 == 1) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                } else if (i23 == 2) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                }
                            } else {
                                int i24 = Flow.this.mHorizontalAlign;
                                if (i24 == 0) {
                                    constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                } else if (i24 == 1) {
                                    constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                } else if (i24 == 2) {
                                    if (z13) {
                                        constraintWidget6.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                        constraintWidget6.mRight.connect(this.mRight, this.mPaddingRight);
                                    } else {
                                        constraintWidget6.mLeft.connect(constraintWidget5.mLeft, 0);
                                        constraintWidget6.mRight.connect(constraintWidget5.mRight, 0);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.mBiggest;
            constraintWidget7.setVerticalChainStyle(Flow.this.mVerticalStyle);
            int i25 = this.mPaddingTop;
            if (i11 > 0) {
                i25 += Flow.this.mVerticalGap;
            }
            constraintWidget7.mTop.connect(this.mTop, i25);
            if (z12) {
                constraintWidget7.mBottom.connect(this.mBottom, this.mPaddingBottom);
            }
            if (i11 > 0) {
                this.mTop.mOwner.mBottom.connect(constraintWidget7.mTop, 0);
            }
            char c12 = 3;
            if (Flow.this.mVerticalAlign == 3 && !constraintWidget7.hasBaseline()) {
                for (int i26 = 0; i26 < i13; i26++) {
                    int i27 = z11 ? (i13 - 1) - i26 : i26;
                    if (this.mStartIndex + i27 >= Flow.this.mDisplayedWidgetsCount) {
                        break;
                    }
                    constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i27];
                    if (constraintWidget.hasBaseline()) {
                        break;
                    }
                }
            }
            constraintWidget = constraintWidget7;
            int i28 = 0;
            while (i28 < i13) {
                int i29 = z11 ? (i13 - 1) - i28 : i28;
                if (this.mStartIndex + i29 >= Flow.this.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = Flow.this.mDisplayedWidgets[this.mStartIndex + i29];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c11 = c12;
                } else {
                    if (i28 == 0) {
                        i12 = 1;
                        constraintWidget8.connect(constraintWidget8.mLeft, this.mLeft, this.mPaddingLeft);
                    } else {
                        i12 = 1;
                    }
                    if (i29 == 0) {
                        int i31 = Flow.this.mHorizontalStyle;
                        float f14 = Flow.this.mHorizontalBias;
                        if (z11) {
                            f14 = 1.0f - f14;
                        }
                        if (this.mStartIndex == 0 && Flow.this.mFirstHorizontalStyle != -1) {
                            i31 = Flow.this.mFirstHorizontalStyle;
                            if (z11) {
                                f12 = Flow.this.mFirstHorizontalBias;
                                f11 = 1.0f - f12;
                                f14 = f11;
                            } else {
                                f11 = Flow.this.mFirstHorizontalBias;
                                f14 = f11;
                            }
                        } else if (z12 && Flow.this.mLastHorizontalStyle != -1) {
                            i31 = Flow.this.mLastHorizontalStyle;
                            if (z11) {
                                f12 = Flow.this.mLastHorizontalBias;
                                f11 = 1.0f - f12;
                                f14 = f11;
                            } else {
                                f11 = Flow.this.mLastHorizontalBias;
                                f14 = f11;
                            }
                        }
                        constraintWidget8.setHorizontalChainStyle(i31);
                        constraintWidget8.setHorizontalBiasPercent(f14);
                    }
                    if (i28 == i13 - 1) {
                        constraintWidget8.connect(constraintWidget8.mRight, this.mRight, this.mPaddingRight);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mLeft.connect(constraintWidget4.mRight, Flow.this.mHorizontalGap);
                        if (i28 == i15) {
                            constraintWidget8.mLeft.setGoneMargin(this.mPaddingLeft);
                        }
                        constraintWidget4.mRight.connect(constraintWidget8.mLeft, 0);
                        if (i28 == i16 + 1) {
                            constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c11 = 3;
                        if (Flow.this.mVerticalAlign == 3 && constraintWidget.hasBaseline() && constraintWidget8 != constraintWidget && constraintWidget8.hasBaseline()) {
                            constraintWidget8.mBaseline.connect(constraintWidget.mBaseline, 0);
                        } else {
                            int i32 = Flow.this.mVerticalAlign;
                            if (i32 == 0) {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                            } else if (i32 == i12) {
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            } else if (z13) {
                                constraintWidget8.mTop.connect(this.mTop, this.mPaddingTop);
                                constraintWidget8.mBottom.connect(this.mBottom, this.mPaddingBottom);
                            } else {
                                constraintWidget8.mTop.connect(constraintWidget7.mTop, 0);
                                constraintWidget8.mBottom.connect(constraintWidget7.mBottom, 0);
                            }
                        }
                    } else {
                        c11 = 3;
                    }
                }
                i28++;
                c12 = c11;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i11) {
            int i12 = this.mNbMatchConstraintsWidgets;
            if (i12 == 0) {
                return;
            }
            int i13 = this.mCount;
            int i14 = i11 / i12;
            for (int i15 = 0; i15 < i13 && this.mStartIndex + i15 < Flow.this.mDisplayedWidgetsCount; i15++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i15];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i14, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    int i16 = i14;
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i16);
                    i14 = i16;
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i11) {
            this.mStartIndex = i11;
        }

        public void setup(int i11, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i12, int i13, int i14, int i15, int i16) {
            this.mOrientation = i11;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i12;
            this.mPaddingTop = i13;
            this.mPaddingRight = i14;
            this.mPaddingBottom = i15;
            this.mMax = i16;
        }
    }

    private void createAlignedConstraints(boolean z11) {
        ConstraintWidget constraintWidget;
        float f11;
        int i11;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i12 = 0; i12 < this.mDisplayedWidgetsCount; i12++) {
            this.mDisplayedWidgets[i12].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i13 = iArr[0];
        int i14 = iArr[1];
        float f12 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i15 = 0;
        while (i15 < i13) {
            if (z11) {
                i11 = (i13 - i15) - 1;
                f11 = 1.0f - this.mHorizontalBias;
            } else {
                f11 = f12;
                i11 = i15;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i11];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i15 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f11);
                }
                if (i15 == i13 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i15 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i15++;
            f12 = f11;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i16];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i16 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i16 == i14 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i16 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i17 = 0; i17 < i13; i17++) {
            for (int i18 = 0; i18 < i14; i18++) {
                int i19 = (i18 * i13) + i17;
                if (this.mOrientation == 1) {
                    i19 = (i17 * i14) + i18;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i19 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i19]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i17];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i18];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetHeight(ConstraintWidget constraintWidget, int i11) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i12 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (constraintWidget.mMatchConstraintPercentHeight * i11);
                if (i13 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i13);
                }
                return i13;
            }
            constraintWidget2 = constraintWidget;
            if (i12 == 1) {
                return constraintWidget2.getHeight();
            }
            if (i12 == 3) {
                return (int) ((constraintWidget2.getWidth() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWidgetWidth(ConstraintWidget constraintWidget, int i11) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i12 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (constraintWidget.mMatchConstraintPercentWidth * i11);
                if (i13 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i13;
            }
            constraintWidget2 = constraintWidget;
            if (i12 == 1) {
                return constraintWidget2.getWidth();
            }
            if (i12 == 3) {
                return (int) ((constraintWidget2.getHeight() * constraintWidget2.mDimensionRatio) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        Flow flow;
        int i15;
        ConstraintAnchor constraintAnchor;
        int i16;
        Flow flow2 = this;
        if (i11 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i17 = i13;
        WidgetsList widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
        flow2.mChainList.add(widgetsList);
        if (i12 == 0) {
            i14 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i11) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i19];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i17);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i21 = i14;
                boolean z11 = (i18 == i17 || (flow2.mHorizontalGap + i18) + widgetWidth > i17) && widgetsList.mBiggest != null;
                if (!z11 && i19 > 0 && (i16 = flow2.mMaxElementsWrap) > 0 && i19 % i16 == 0) {
                    z11 = true;
                }
                if (z11) {
                    widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
                    widgetsList.setStartIndex(i19);
                    flow2.mChainList.add(widgetsList);
                } else if (i19 > 0) {
                    i18 += flow2.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i19++;
                    i14 = i21;
                }
                i18 = widgetWidth;
                widgetsList.add(constraintWidget);
                i19++;
                i14 = i21;
            }
        } else {
            i14 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i11) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i23];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i17);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i24 = i14;
                boolean z12 = (i22 == i17 || (flow2.mVerticalGap + i22) + widgetHeight > i17) && widgetsList.mBiggest != null;
                if (!z12 && i23 > 0 && (i15 = flow2.mMaxElementsWrap) > 0 && i23 % i15 == 0) {
                    z12 = true;
                }
                if (z12) {
                    widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
                    flow = flow2;
                    widgetsList.setStartIndex(i23);
                    flow.mChainList.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i23 > 0) {
                        i22 += flow.mVerticalGap + widgetHeight;
                        widgetsList.add(constraintWidget2);
                        i23++;
                        i17 = i13;
                        i14 = i24;
                        flow2 = flow;
                    }
                }
                i22 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i23++;
                i17 = i13;
                i14 = i24;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z13 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i14 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i25);
                if (i12 == 0) {
                    widgetsList2.measureMatchConstraints(i13 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i13 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int i26 = paddingBottom;
        int i27 = 0;
        int i28 = paddingRight;
        int i29 = paddingTop;
        int i31 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i32 = 0;
        for (int i33 = 0; i33 < size; i33++) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i33);
            if (i12 == 0) {
                if (i33 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i33 + 1).mBiggest.mTop;
                    i26 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    i26 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                int i34 = i32;
                widgetsList3.setup(i12, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i31, i29, i28, i26, i13);
                int max = Math.max(i27, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i34;
                if (i33 > 0) {
                    height += flow3.mVerticalGap;
                }
                i32 = height;
                i27 = max;
                constraintAnchor9 = constraintAnchor10;
                i29 = 0;
            } else {
                int i35 = i27;
                int i36 = i32;
                if (i33 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i33 + 1).mBiggest.mLeft;
                    i28 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    i28 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i12, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i31, i29, i28, i26, i13);
                int width = widgetsList3.getWidth() + i35;
                int max2 = Math.max(i36, widgetsList3.getHeight());
                if (i33 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i37 = width;
                i32 = max2;
                i27 = i37;
                i31 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i27;
        iArr[1] = i32;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i11, int i12, int i13, int[] iArr) {
        int i14;
        Flow flow;
        int i15;
        boolean z11;
        ConstraintAnchor constraintAnchor;
        int i16;
        Flow flow2 = this;
        if (i11 == 0) {
            return;
        }
        flow2.mChainList.clear();
        int i17 = i13;
        WidgetsList widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
        flow2.mChainList.add(widgetsList);
        boolean z12 = true;
        if (i12 == 0) {
            int i18 = 0;
            i14 = 0;
            int i19 = 0;
            int i21 = 0;
            while (i21 < i11) {
                i18++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i21];
                int widgetWidth = flow2.getWidgetWidth(constraintWidget, i17);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i22 = i14;
                boolean z13 = (i19 == i17 || (flow2.mHorizontalGap + i19) + widgetWidth > i17) && widgetsList.mBiggest != null;
                if (!z13 && i21 > 0 && (i16 = flow2.mMaxElementsWrap) > 0 && i18 > i16) {
                    z13 = true;
                }
                if (z13) {
                    widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
                    widgetsList.setStartIndex(i21);
                    flow2.mChainList.add(widgetsList);
                    i18 = 1;
                } else if (i21 > 0) {
                    i19 += flow2.mHorizontalGap + widgetWidth;
                    widgetsList.add(constraintWidget);
                    i21++;
                    i14 = i22;
                }
                i19 = widgetWidth;
                widgetsList.add(constraintWidget);
                i21++;
                i14 = i22;
            }
        } else {
            int i23 = 0;
            i14 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i25 < i11) {
                i23++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i25];
                int widgetHeight = flow2.getWidgetHeight(constraintWidget2, i17);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i14++;
                }
                int i26 = i14;
                boolean z14 = (i24 == i17 || (flow2.mVerticalGap + i24) + widgetHeight > i17) && widgetsList.mBiggest != null;
                if (!z14 && i25 > 0 && (i15 = flow2.mMaxElementsWrap) > 0 && i23 > i15) {
                    z14 = true;
                }
                if (z14) {
                    widgetsList = flow2.new WidgetsList(i12, flow2.mLeft, flow2.mTop, flow2.mRight, flow2.mBottom, i17);
                    flow = flow2;
                    widgetsList.setStartIndex(i25);
                    flow.mChainList.add(widgetsList);
                    i23 = 1;
                } else {
                    flow = flow2;
                    if (i25 > 0) {
                        i24 += flow.mVerticalGap + widgetHeight;
                        widgetsList.add(constraintWidget2);
                        i25++;
                        i17 = i13;
                        i14 = i26;
                        flow2 = flow;
                    }
                }
                i24 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i25++;
                i17 = i13;
                i14 = i26;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.mChainList.size();
        ConstraintAnchor constraintAnchor2 = flow3.mLeft;
        ConstraintAnchor constraintAnchor3 = flow3.mTop;
        ConstraintAnchor constraintAnchor4 = flow3.mRight;
        ConstraintAnchor constraintAnchor5 = flow3.mBottom;
        int paddingLeft = flow3.getPaddingLeft();
        int paddingTop = flow3.getPaddingTop();
        int paddingRight = flow3.getPaddingRight();
        int paddingBottom = flow3.getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = flow3.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z15 = horizontalDimensionBehaviour == dimensionBehaviour || flow3.getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i14 > 0 && z15) {
            for (int i27 = 0; i27 < size; i27++) {
                WidgetsList widgetsList2 = flow3.mChainList.get(i27);
                if (i12 == 0) {
                    widgetsList2.measureMatchConstraints(i13 - widgetsList2.getWidth());
                } else {
                    widgetsList2.measureMatchConstraints(i13 - widgetsList2.getHeight());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int i28 = paddingBottom;
        int i29 = 0;
        int i31 = 0;
        int i32 = paddingRight;
        int i33 = paddingTop;
        int i34 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i35 = 0;
        while (i31 < size) {
            WidgetsList widgetsList3 = flow3.mChainList.get(i31);
            if (i12 == 0) {
                if (i31 < size - 1) {
                    constraintAnchor7 = flow3.mChainList.get(i31 + 1).mBiggest.mTop;
                    i28 = 0;
                } else {
                    constraintAnchor7 = flow3.mBottom;
                    i28 = flow3.getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.mBiggest.mBottom;
                z11 = z12;
                int i36 = i29;
                widgetsList3.setup(i12, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i34, i33, i32, i28, i13);
                int max = Math.max(i35, widgetsList3.getWidth());
                int height = widgetsList3.getHeight() + i36;
                if (i31 > 0) {
                    height += flow3.mVerticalGap;
                }
                i29 = height;
                i35 = max;
                constraintAnchor6 = constraintAnchor10;
                i33 = 0;
            } else {
                int i37 = i29;
                z11 = z12;
                int i38 = i35;
                if (i31 < size - 1) {
                    constraintAnchor = flow3.mChainList.get(i31 + 1).mBiggest.mLeft;
                    i32 = 0;
                } else {
                    constraintAnchor = flow3.mRight;
                    i32 = flow3.getPaddingRight();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.mBiggest.mRight;
                widgetsList3.setup(i12, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i34, i33, i32, i28, i13);
                int width = widgetsList3.getWidth() + i38;
                int max2 = Math.max(i37, widgetsList3.getHeight());
                if (i31 > 0) {
                    width += flow3.mHorizontalGap;
                }
                int i39 = width;
                i29 = max2;
                i35 = i39;
                i34 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i31++;
            z12 = z11;
        }
        iArr[0] = i35;
        iArr[z12 ? 1 : 0] = i29;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i11, int i12, int i13, int[] iArr) {
        WidgetsList widgetsList;
        if (i11 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i12, this.mLeft, this.mTop, this.mRight, this.mBottom, i13);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList2.setup(i12, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i13);
            widgetsList = widgetsList2;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            widgetsList.add(constraintWidgetArr[i14]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        super.addToSolver(linearSystem, z11);
        boolean z12 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i11 = this.mWrapMode;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = this.mChainList.size();
                int i12 = 0;
                while (i12 < size) {
                    this.mChainList.get(i12).createConstraints(z12, i12, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 == 2) {
                createAlignedConstraints(z12);
            } else if (i11 == 3) {
                int size2 = this.mChainList.size();
                int i13 = 0;
                while (i13 < size2) {
                    this.mChainList.get(i13).createConstraints(z12, i13, i13 == size2 + (-1));
                    i13++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z12, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i11, int i12, int i13, int i14) {
        int i15;
        ConstraintWidget[] constraintWidgetArr;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr = new int[2];
        int i16 = (i12 - paddingLeft) - paddingRight;
        int i17 = this.mOrientation;
        if (i17 == 1) {
            i16 = (i14 - paddingTop) - paddingBottom;
        }
        int i18 = i16;
        if (i17 == 0) {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        } else {
            if (this.mHorizontalStyle == -1) {
                this.mHorizontalStyle = 0;
            }
            if (this.mVerticalStyle == -1) {
                this.mVerticalStyle = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i19 = 0;
        int i21 = 0;
        while (true) {
            i15 = this.mWidgetsCount;
            if (i19 >= i15) {
                break;
            }
            if (this.mWidgets[i19].getVisibility() == 8) {
                i21++;
            }
            i19++;
        }
        if (i21 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i15 - i21];
            int i22 = 0;
            i15 = 0;
            while (i22 < this.mWidgetsCount) {
                ConstraintWidget constraintWidget = this.mWidgets[i22];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.getVisibility() != 8) {
                    constraintWidgetArr4[i15] = constraintWidget;
                    i15++;
                }
                i22++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i23 = i15;
        this.mDisplayedWidgets = constraintWidgetArr;
        this.mDisplayedWidgetsCount = i23;
        int i24 = this.mWrapMode;
        if (i24 == 0) {
            measureNoWrap(constraintWidgetArr, i23, this.mOrientation, i18, iArr);
        } else if (i24 == 1) {
            measureChainWrap(constraintWidgetArr, i23, this.mOrientation, i18, iArr);
        } else if (i24 == 2) {
            measureAligned(constraintWidgetArr, i23, this.mOrientation, i18, iArr);
        } else if (i24 == 3) {
            measureChainWrap_new(constraintWidgetArr, i23, this.mOrientation, i18, iArr);
        }
        int i25 = iArr[0] + paddingLeft + paddingRight;
        int i26 = iArr[1] + paddingTop + paddingBottom;
        if (i11 == 1073741824) {
            i25 = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            i25 = Math.min(i25, i12);
        } else if (i11 != 0) {
            i25 = 0;
        }
        if (i13 == 1073741824) {
            i26 = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            i26 = Math.min(i26, i14);
        } else if (i13 != 0) {
            i26 = 0;
        }
        setMeasure(i25, i26);
        setWidth(i25);
        setHeight(i26);
        needsCallbackFromSolver(this.mWidgetsCount > 0);
    }

    public void setFirstHorizontalBias(float f11) {
        this.mFirstHorizontalBias = f11;
    }

    public void setFirstHorizontalStyle(int i11) {
        this.mFirstHorizontalStyle = i11;
    }

    public void setFirstVerticalBias(float f11) {
        this.mFirstVerticalBias = f11;
    }

    public void setFirstVerticalStyle(int i11) {
        this.mFirstVerticalStyle = i11;
    }

    public void setHorizontalAlign(int i11) {
        this.mHorizontalAlign = i11;
    }

    public void setHorizontalBias(float f11) {
        this.mHorizontalBias = f11;
    }

    public void setHorizontalGap(int i11) {
        this.mHorizontalGap = i11;
    }

    public void setHorizontalStyle(int i11) {
        this.mHorizontalStyle = i11;
    }

    public void setLastHorizontalBias(float f11) {
        this.mLastHorizontalBias = f11;
    }

    public void setLastHorizontalStyle(int i11) {
        this.mLastHorizontalStyle = i11;
    }

    public void setLastVerticalBias(float f11) {
        this.mLastVerticalBias = f11;
    }

    public void setLastVerticalStyle(int i11) {
        this.mLastVerticalStyle = i11;
    }

    public void setMaxElementsWrap(int i11) {
        this.mMaxElementsWrap = i11;
    }

    public void setOrientation(int i11) {
        this.mOrientation = i11;
    }

    public void setVerticalAlign(int i11) {
        this.mVerticalAlign = i11;
    }

    public void setVerticalBias(float f11) {
        this.mVerticalBias = f11;
    }

    public void setVerticalGap(int i11) {
        this.mVerticalGap = i11;
    }

    public void setVerticalStyle(int i11) {
        this.mVerticalStyle = i11;
    }

    public void setWrapMode(int i11) {
        this.mWrapMode = i11;
    }
}
