package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class GridReference extends HelperReference {
    private static final String SPANS_RESPECT_WIDGET_ORDER_STRING = "spansrespectwidgetorder";
    private static final String SUB_GRID_BY_COL_ROW_STRING = "subgridbycolrow";
    private String mColumnWeights;
    private int mColumnsSet;
    private int mFlags;
    private GridCore mGrid;
    private float mHorizontalGaps;
    private int mOrientation;
    private int mPaddingBottom;
    private int mPaddingEnd;
    private int mPaddingStart;
    private int mPaddingTop;
    private String mRowWeights;
    private int mRowsSet;
    private String mSkips;
    private String mSpans;
    private float mVerticalGaps;

    public GridReference(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.mPaddingStart = 0;
        this.mPaddingEnd = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        if (helper == State.Helper.ROW) {
            this.mRowsSet = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.mColumnsSet = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        this.mGrid.setOrientation(this.mOrientation);
        int i11 = this.mRowsSet;
        if (i11 != 0) {
            this.mGrid.setRows(i11);
        }
        int i12 = this.mColumnsSet;
        if (i12 != 0) {
            this.mGrid.setColumns(i12);
        }
        float f11 = this.mHorizontalGaps;
        if (f11 != 0.0f) {
            this.mGrid.setHorizontalGaps(f11);
        }
        float f12 = this.mVerticalGaps;
        if (f12 != 0.0f) {
            this.mGrid.setVerticalGaps(f12);
        }
        String str = this.mRowWeights;
        if (str != null && !str.isEmpty()) {
            this.mGrid.setRowWeights(this.mRowWeights);
        }
        String str2 = this.mColumnWeights;
        if (str2 != null && !str2.isEmpty()) {
            this.mGrid.setColumnWeights(this.mColumnWeights);
        }
        String str3 = this.mSpans;
        if (str3 != null && !str3.isEmpty()) {
            this.mGrid.setSpans(this.mSpans);
        }
        String str4 = this.mSkips;
        if (str4 != null && !str4.isEmpty()) {
            this.mGrid.setSkips(this.mSkips);
        }
        this.mGrid.setFlags(this.mFlags);
        this.mGrid.setPaddingStart(this.mPaddingStart);
        this.mGrid.setPaddingEnd(this.mPaddingEnd);
        this.mGrid.setPaddingTop(this.mPaddingTop);
        this.mGrid.setPaddingBottom(this.mPaddingBottom);
        applyBase();
    }

    @Nullable
    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    public int getColumnsSet() {
        return this.mColumnsSet;
    }

    public int getFlags() {
        return this.mFlags;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    @NonNull
    public HelperWidget getHelperWidget() {
        if (this.mGrid == null) {
            this.mGrid = new GridCore();
        }
        return this.mGrid;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public int getPaddingEnd() {
        return this.mPaddingEnd;
    }

    public int getPaddingStart() {
        return this.mPaddingStart;
    }

    public int getPaddingTop() {
        return this.mPaddingTop;
    }

    @Nullable
    public String getRowWeights() {
        return this.mRowWeights;
    }

    public int getRowsSet() {
        return this.mRowsSet;
    }

    @Nullable
    public String getSkips() {
        return this.mSkips;
    }

    @Nullable
    public String getSpans() {
        return this.mSpans;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    public void setColumnWeights(@NonNull String str) {
        this.mColumnWeights = str;
    }

    public void setColumnsSet(int i11) {
        if (super.getType() == State.Helper.ROW) {
            return;
        }
        this.mColumnsSet = i11;
    }

    public void setFlags(int i11) {
        this.mFlags = i11;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(@Nullable HelperWidget helperWidget) {
        if (helperWidget instanceof GridCore) {
            this.mGrid = (GridCore) helperWidget;
        } else {
            this.mGrid = null;
        }
    }

    public void setHorizontalGaps(float f11) {
        this.mHorizontalGaps = f11;
    }

    public void setOrientation(int i11) {
        this.mOrientation = i11;
    }

    public void setPaddingBottom(int i11) {
        this.mPaddingBottom = i11;
    }

    public void setPaddingEnd(int i11) {
        this.mPaddingEnd = i11;
    }

    public void setPaddingStart(int i11) {
        this.mPaddingStart = i11;
    }

    public void setPaddingTop(int i11) {
        this.mPaddingTop = i11;
    }

    public void setRowWeights(@NonNull String str) {
        this.mRowWeights = str;
    }

    public void setRowsSet(int i11) {
        if (super.getType() == State.Helper.COLUMN) {
            return;
        }
        this.mRowsSet = i11;
    }

    public void setSkips(@NonNull String str) {
        this.mSkips = str;
    }

    public void setSpans(@NonNull String str) {
        this.mSpans = str;
    }

    public void setVerticalGaps(float f11) {
        this.mVerticalGaps = f11;
    }

    public void setFlags(@NonNull String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] split = str.split("\\|");
        this.mFlags = 0;
        for (String str2 : split) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals(SUB_GRID_BY_COL_ROW_STRING)) {
                this.mFlags |= 1;
            } else if (lowerCase.equals(SPANS_RESPECT_WIDGET_ORDER_STRING)) {
                this.mFlags |= 2;
            }
        }
    }
}
