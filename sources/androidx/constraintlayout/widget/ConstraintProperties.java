package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    ConstraintLayout.LayoutParams mParams;
    View mView;

    public ConstraintProperties(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.mParams = (ConstraintLayout.LayoutParams) layoutParams;
        this.mView = view;
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

    public ConstraintProperties addToHorizontalChain(int i11, int i12) {
        connect(1, i11, i11 == 0 ? 1 : 2, 0);
        connect(2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i11)).connect(2, this.mView.getId(), 1, 0);
        }
        if (i12 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i12)).connect(1, this.mView.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperties addToHorizontalChainRTL(int i11, int i12) {
        connect(6, i11, i11 == 0 ? 6 : 7, 0);
        connect(7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i11)).connect(7, this.mView.getId(), 6, 0);
        }
        if (i12 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i12)).connect(6, this.mView.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperties addToVerticalChain(int i11, int i12) {
        connect(3, i11, i11 == 0 ? 3 : 4, 0);
        connect(4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i11)).connect(4, this.mView.getId(), 3, 0);
        }
        if (i12 != 0) {
            new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i12)).connect(3, this.mView.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperties alpha(float f11) {
        this.mView.setAlpha(f11);
        return this;
    }

    public ConstraintProperties center(int i11, int i12, int i13, int i14, int i15, int i16, float f11) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f11 <= 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i12 == 1 || i12 == 2) {
            connect(1, i11, i12, i13);
            connect(2, i14, i15, i16);
            this.mParams.horizontalBias = f11;
            return this;
        }
        if (i12 == 6 || i12 == 7) {
            connect(6, i11, i12, i13);
            connect(7, i14, i15, i16);
            this.mParams.horizontalBias = f11;
            return this;
        }
        connect(3, i11, i12, i13);
        connect(4, i14, i15, i16);
        this.mParams.verticalBias = f11;
        return this;
    }

    public ConstraintProperties centerHorizontally(int i11, int i12, int i13, int i14, int i15, int i16, float f11) {
        connect(1, i11, i12, i13);
        connect(2, i14, i15, i16);
        this.mParams.horizontalBias = f11;
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i11, int i12, int i13, int i14, int i15, int i16, float f11) {
        connect(6, i11, i12, i13);
        connect(7, i14, i15, i16);
        this.mParams.horizontalBias = f11;
        return this;
    }

    public ConstraintProperties centerVertically(int i11, int i12, int i13, int i14, int i15, int i16, float f11) {
        connect(3, i11, i12, i13);
        connect(4, i14, i15, i16);
        this.mParams.verticalBias = f11;
        return this;
    }

    public ConstraintProperties connect(int i11, int i12, int i13, int i14) {
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.mParams;
                    layoutParams.leftToLeft = i12;
                    layoutParams.leftToRight = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                    layoutParams2.leftToRight = i12;
                    layoutParams2.leftToLeft = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i14;
                return this;
            case 2:
                if (i13 == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                    layoutParams3.rightToLeft = i12;
                    layoutParams3.rightToRight = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                    layoutParams4.rightToRight = i12;
                    layoutParams4.rightToLeft = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i14;
                return this;
            case 3:
                if (i13 == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                    layoutParams5.topToTop = i12;
                    layoutParams5.topToBottom = -1;
                    layoutParams5.baselineToBaseline = -1;
                    layoutParams5.baselineToTop = -1;
                    layoutParams5.baselineToBottom = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                    layoutParams6.topToBottom = i12;
                    layoutParams6.topToTop = -1;
                    layoutParams6.baselineToBaseline = -1;
                    layoutParams6.baselineToTop = -1;
                    layoutParams6.baselineToBottom = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i14;
                return this;
            case 4:
                if (i13 == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.mParams;
                    layoutParams7.bottomToBottom = i12;
                    layoutParams7.bottomToTop = -1;
                    layoutParams7.baselineToBaseline = -1;
                    layoutParams7.baselineToTop = -1;
                    layoutParams7.baselineToBottom = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = this.mParams;
                    layoutParams8.bottomToTop = i12;
                    layoutParams8.bottomToBottom = -1;
                    layoutParams8.baselineToBaseline = -1;
                    layoutParams8.baselineToTop = -1;
                    layoutParams8.baselineToBottom = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i14;
                return this;
            case 5:
                if (i13 == 5) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.mParams;
                    layoutParams9.baselineToBaseline = i12;
                    layoutParams9.bottomToBottom = -1;
                    layoutParams9.bottomToTop = -1;
                    layoutParams9.topToTop = -1;
                    layoutParams9.topToBottom = -1;
                } else if (i13 == 3) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.mParams;
                    layoutParams10.baselineToTop = i12;
                    layoutParams10.bottomToBottom = -1;
                    layoutParams10.bottomToTop = -1;
                    layoutParams10.topToTop = -1;
                    layoutParams10.topToBottom = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.mParams;
                    layoutParams11.baselineToBottom = i12;
                    layoutParams11.bottomToBottom = -1;
                    layoutParams11.bottomToTop = -1;
                    layoutParams11.topToTop = -1;
                    layoutParams11.topToBottom = -1;
                }
                this.mParams.baselineMargin = i14;
                return this;
            case 6:
                if (i13 == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.mParams;
                    layoutParams12.startToStart = i12;
                    layoutParams12.startToEnd = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = this.mParams;
                    layoutParams13.startToEnd = i12;
                    layoutParams13.startToStart = -1;
                }
                this.mParams.setMarginStart(i14);
                return this;
            case 7:
                if (i13 == 7) {
                    ConstraintLayout.LayoutParams layoutParams14 = this.mParams;
                    layoutParams14.endToEnd = i12;
                    layoutParams14.endToStart = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + sideToString(i13) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams15 = this.mParams;
                    layoutParams15.endToStart = i12;
                    layoutParams15.endToEnd = -1;
                }
                this.mParams.setMarginEnd(i14);
                return this;
            default:
                throw new IllegalArgumentException(sideToString(i11) + " to " + sideToString(i13) + " unknown");
        }
    }

    public ConstraintProperties constrainDefaultHeight(int i11) {
        this.mParams.matchConstraintDefaultHeight = i11;
        return this;
    }

    public ConstraintProperties constrainDefaultWidth(int i11) {
        this.mParams.matchConstraintDefaultWidth = i11;
        return this;
    }

    public ConstraintProperties constrainHeight(int i11) {
        ((ViewGroup.MarginLayoutParams) this.mParams).height = i11;
        return this;
    }

    public ConstraintProperties constrainMaxHeight(int i11) {
        this.mParams.matchConstraintMaxHeight = i11;
        return this;
    }

    public ConstraintProperties constrainMaxWidth(int i11) {
        this.mParams.matchConstraintMaxWidth = i11;
        return this;
    }

    public ConstraintProperties constrainMinHeight(int i11) {
        this.mParams.matchConstraintMinHeight = i11;
        return this;
    }

    public ConstraintProperties constrainMinWidth(int i11) {
        this.mParams.matchConstraintMinWidth = i11;
        return this;
    }

    public ConstraintProperties constrainWidth(int i11) {
        ((ViewGroup.MarginLayoutParams) this.mParams).width = i11;
        return this;
    }

    public ConstraintProperties dimensionRatio(String str) {
        this.mParams.dimensionRatio = str;
        return this;
    }

    public ConstraintProperties elevation(float f11) {
        this.mView.setElevation(f11);
        return this;
    }

    public ConstraintProperties goneMargin(int i11, int i12) {
        switch (i11) {
            case 1:
                this.mParams.goneLeftMargin = i12;
                return this;
            case 2:
                this.mParams.goneRightMargin = i12;
                return this;
            case 3:
                this.mParams.goneTopMargin = i12;
                return this;
            case 4:
                this.mParams.goneBottomMargin = i12;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.goneStartMargin = i12;
                return this;
            case 7:
                this.mParams.goneEndMargin = i12;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties horizontalBias(float f11) {
        this.mParams.horizontalBias = f11;
        return this;
    }

    public ConstraintProperties horizontalChainStyle(int i11) {
        this.mParams.horizontalChainStyle = i11;
        return this;
    }

    public ConstraintProperties horizontalWeight(float f11) {
        this.mParams.horizontalWeight = f11;
        return this;
    }

    public ConstraintProperties margin(int i11, int i12) {
        switch (i11) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.mParams).leftMargin = i12;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.mParams).rightMargin = i12;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.mParams).topMargin = i12;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.mParams).bottomMargin = i12;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.mParams.setMarginStart(i12);
                return this;
            case 7:
                this.mParams.setMarginEnd(i12);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties removeConstraints(int i11) {
        switch (i11) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.mParams;
                layoutParams.leftToRight = -1;
                layoutParams.leftToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.goneLeftMargin = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
                layoutParams2.rightToRight = -1;
                layoutParams2.rightToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.goneRightMargin = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
                layoutParams3.topToBottom = -1;
                layoutParams3.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.goneTopMargin = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.mParams;
                layoutParams4.bottomToTop = -1;
                layoutParams4.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.goneBottomMargin = Integer.MIN_VALUE;
                return this;
            case 5:
                this.mParams.baselineToBaseline = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.mParams;
                layoutParams5.startToEnd = -1;
                layoutParams5.startToStart = -1;
                layoutParams5.setMarginStart(-1);
                this.mParams.goneStartMargin = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.mParams;
                layoutParams6.endToStart = -1;
                layoutParams6.endToEnd = -1;
                layoutParams6.setMarginEnd(-1);
                this.mParams.goneEndMargin = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties removeFromHorizontalChain() {
        ConstraintLayout.LayoutParams layoutParams = this.mParams;
        int i11 = layoutParams.leftToRight;
        int i12 = layoutParams.rightToLeft;
        if (i11 != -1 || i12 != -1) {
            ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i11));
            ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i12));
            ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
            if (i11 != -1 && i12 != -1) {
                constraintProperties.connect(2, i12, 1, 0);
                constraintProperties2.connect(1, i11, 2, 0);
            } else if (i11 != -1 || i12 != -1) {
                int i13 = layoutParams2.rightToRight;
                if (i13 != -1) {
                    constraintProperties.connect(2, i13, 2, 0);
                } else {
                    int i14 = layoutParams2.leftToLeft;
                    if (i14 != -1) {
                        constraintProperties2.connect(1, i14, 1, 0);
                    }
                }
            }
            removeConstraints(1);
            removeConstraints(2);
            return this;
        }
        int i15 = layoutParams.startToEnd;
        int i16 = layoutParams.endToStart;
        if (i15 != -1 || i16 != -1) {
            ConstraintProperties constraintProperties3 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i15));
            ConstraintProperties constraintProperties4 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i16));
            ConstraintLayout.LayoutParams layoutParams3 = this.mParams;
            if (i15 != -1 && i16 != -1) {
                constraintProperties3.connect(7, i16, 6, 0);
                constraintProperties4.connect(6, i11, 7, 0);
            } else if (i11 != -1 || i16 != -1) {
                int i17 = layoutParams3.rightToRight;
                if (i17 != -1) {
                    constraintProperties3.connect(7, i17, 7, 0);
                } else {
                    int i18 = layoutParams3.leftToLeft;
                    if (i18 != -1) {
                        constraintProperties4.connect(6, i18, 6, 0);
                    }
                }
            }
        }
        removeConstraints(6);
        removeConstraints(7);
        return this;
    }

    public ConstraintProperties removeFromVerticalChain() {
        ConstraintLayout.LayoutParams layoutParams = this.mParams;
        int i11 = layoutParams.topToBottom;
        int i12 = layoutParams.bottomToTop;
        if (i11 != -1 || i12 != -1) {
            ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i11));
            ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) this.mView.getParent()).findViewById(i12));
            ConstraintLayout.LayoutParams layoutParams2 = this.mParams;
            if (i11 != -1 && i12 != -1) {
                constraintProperties.connect(4, i12, 3, 0);
                constraintProperties2.connect(3, i11, 4, 0);
            } else if (i11 != -1 || i12 != -1) {
                int i13 = layoutParams2.bottomToBottom;
                if (i13 != -1) {
                    constraintProperties.connect(4, i13, 4, 0);
                } else {
                    int i14 = layoutParams2.topToTop;
                    if (i14 != -1) {
                        constraintProperties2.connect(3, i14, 3, 0);
                    }
                }
            }
        }
        removeConstraints(3);
        removeConstraints(4);
        return this;
    }

    public ConstraintProperties rotation(float f11) {
        this.mView.setRotation(f11);
        return this;
    }

    public ConstraintProperties rotationX(float f11) {
        this.mView.setRotationX(f11);
        return this;
    }

    public ConstraintProperties rotationY(float f11) {
        this.mView.setRotationY(f11);
        return this;
    }

    public ConstraintProperties scaleX(float f11) {
        this.mView.setScaleY(f11);
        return this;
    }

    public ConstraintProperties transformPivot(float f11, float f12) {
        this.mView.setPivotX(f11);
        this.mView.setPivotY(f12);
        return this;
    }

    public ConstraintProperties transformPivotX(float f11) {
        this.mView.setPivotX(f11);
        return this;
    }

    public ConstraintProperties transformPivotY(float f11) {
        this.mView.setPivotY(f11);
        return this;
    }

    public ConstraintProperties translation(float f11, float f12) {
        this.mView.setTranslationX(f11);
        this.mView.setTranslationY(f12);
        return this;
    }

    public ConstraintProperties translationX(float f11) {
        this.mView.setTranslationX(f11);
        return this;
    }

    public ConstraintProperties translationY(float f11) {
        this.mView.setTranslationY(f11);
        return this;
    }

    public ConstraintProperties translationZ(float f11) {
        this.mView.setTranslationZ(f11);
        return this;
    }

    public ConstraintProperties verticalBias(float f11) {
        this.mParams.verticalBias = f11;
        return this;
    }

    public ConstraintProperties verticalChainStyle(int i11) {
        this.mParams.verticalChainStyle = i11;
        return this;
    }

    public ConstraintProperties verticalWeight(float f11) {
        this.mParams.verticalWeight = f11;
        return this;
    }

    public ConstraintProperties visibility(int i11) {
        this.mView.setVisibility(i11);
        return this;
    }

    public ConstraintProperties centerHorizontally(int i11) {
        if (i11 == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        center(i11, 2, 0, i11, 1, 0, 0.5f);
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i11) {
        if (i11 == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        center(i11, 7, 0, i11, 6, 0, 0.5f);
        return this;
    }

    public ConstraintProperties centerVertically(int i11) {
        if (i11 == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        center(i11, 4, 0, i11, 3, 0, 0.5f);
        return this;
    }

    public void apply() {
    }

    public ConstraintProperties scaleY(float f11) {
        return this;
    }
}
