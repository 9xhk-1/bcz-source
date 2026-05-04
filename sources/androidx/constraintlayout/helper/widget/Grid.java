package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Grid extends VirtualLayout {
    private static final boolean DEBUG_BOXES = false;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "Grid";
    public static final int VERTICAL = 1;
    private int[] mBoxViewIds;
    private View[] mBoxViews;
    private int mColumns;
    private int mColumnsSet;
    ConstraintLayout mContainer;
    private float mHorizontalGaps;
    private final int mMaxColumns;
    private final int mMaxRows;
    private int mNextAvailableIndex;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    Set<Integer> mSpanIds;
    private String mStrColumnWeights;
    private String mStrRowWeights;
    private String mStrSkips;
    private String mStrSpans;
    private boolean mUseRtl;
    private boolean mValidateInputs;
    private float mVerticalGaps;

    public Grid(Context context) {
        super(context);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }

    private boolean arrangeWidgets() {
        View[] views = getViews(this.mContainer);
        for (int i11 = 0; i11 < this.mCount; i11++) {
            if (!this.mSpanIds.contains(Integer.valueOf(this.mIds[i11]))) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                connectView(views[i11], rowByIndex, colByIndex, 1, 1);
            }
        }
        return true;
    }

    private void buildBoxes() {
        int max = Math.max(this.mRows, this.mColumns);
        View[] viewArr = this.mBoxViews;
        int i11 = 0;
        if (viewArr == null) {
            this.mBoxViews = new View[max];
            int i12 = 0;
            while (true) {
                View[] viewArr2 = this.mBoxViews;
                if (i12 >= viewArr2.length) {
                    break;
                }
                viewArr2[i12] = makeNewView();
                i12++;
            }
        } else if (max != viewArr.length) {
            View[] viewArr3 = new View[max];
            for (int i13 = 0; i13 < max; i13++) {
                View[] viewArr4 = this.mBoxViews;
                if (i13 < viewArr4.length) {
                    viewArr3[i13] = viewArr4[i13];
                } else {
                    viewArr3[i13] = makeNewView();
                }
            }
            int i14 = max;
            while (true) {
                View[] viewArr5 = this.mBoxViews;
                if (i14 >= viewArr5.length) {
                    break;
                }
                this.mContainer.removeView(viewArr5[i14]);
                i14++;
            }
            this.mBoxViews = viewArr3;
        }
        this.mBoxViewIds = new int[max];
        while (true) {
            View[] viewArr6 = this.mBoxViews;
            if (i11 >= viewArr6.length) {
                setBoxViewVerticalChains();
                setBoxViewHorizontalChains();
                return;
            } else {
                this.mBoxViewIds[i11] = viewArr6[i11].getId();
                i11++;
            }
        }
    }

    private void clearHParams(View view) {
        ConstraintLayout.LayoutParams params = params(view);
        params.horizontalWeight = -1.0f;
        params.leftToRight = -1;
        params.leftToLeft = -1;
        params.rightToLeft = -1;
        params.rightToRight = -1;
        ((ViewGroup.MarginLayoutParams) params).leftMargin = -1;
        view.setLayoutParams(params);
    }

    private void clearVParams(View view) {
        ConstraintLayout.LayoutParams params = params(view);
        params.verticalWeight = -1.0f;
        params.topToBottom = -1;
        params.topToTop = -1;
        params.bottomToTop = -1;
        params.bottomToBottom = -1;
        ((ViewGroup.MarginLayoutParams) params).topMargin = -1;
        view.setLayoutParams(params);
    }

    private void connectView(View view, int i11, int i12, int i13, int i14) {
        ConstraintLayout.LayoutParams params = params(view);
        int[] iArr = this.mBoxViewIds;
        params.leftToLeft = iArr[i12];
        params.topToTop = iArr[i11];
        params.rightToRight = iArr[(i12 + i14) - 1];
        params.bottomToBottom = iArr[(i11 + i13) - 1];
        view.setLayoutParams(params);
    }

    private boolean generateGrid(boolean z11) {
        int[][] parseSpans;
        int[][] parseSpans2;
        if (this.mContainer == null || this.mRows < 1 || this.mColumns < 1) {
            return false;
        }
        if (z11) {
            for (int i11 = 0; i11 < this.mPositionMatrix.length; i11++) {
                int i12 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i12 < zArr[0].length) {
                        zArr[i11][i12] = true;
                        i12++;
                    }
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        buildBoxes();
        String str = this.mStrSkips;
        boolean handleSkips = (str == null || str.trim().isEmpty() || (parseSpans2 = parseSpans(this.mStrSkips)) == null) ? true : handleSkips(parseSpans2);
        String str2 = this.mStrSpans;
        if (str2 != null && !str2.trim().isEmpty() && (parseSpans = parseSpans(this.mStrSpans)) != null) {
            handleSkips &= handleSpans(this.mIds, parseSpans);
        }
        return (handleSkips && arrangeWidgets()) || !this.mValidateInputs;
    }

    private int getColByIndex(int i11) {
        return this.mOrientation == 1 ? i11 / this.mRows : i11 % this.mColumns;
    }

    private int getNextPosition() {
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11 = this.mNextAvailableIndex;
            if (i11 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i11);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z11 = true;
            }
            this.mNextAvailableIndex++;
        }
        return i11;
    }

    private int getRowByIndex(int i11) {
        return this.mOrientation == 1 ? i11 % this.mRows : i11 / this.mColumns;
    }

    private boolean handleSkips(int[][] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int rowByIndex = getRowByIndex(iArr[i11][0]);
            int colByIndex = getColByIndex(iArr[i11][0]);
            int[] iArr2 = iArr[i11];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    private boolean handleSpans(int[] iArr, int[][] iArr2) {
        View[] views = getViews(this.mContainer);
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            int rowByIndex = getRowByIndex(iArr2[i11][0]);
            int colByIndex = getColByIndex(iArr2[i11][0]);
            int[] iArr3 = iArr2[i11];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = views[i11];
            int[] iArr4 = iArr2[i11];
            connectView(view, rowByIndex, colByIndex, iArr4[1], iArr4[2]);
            this.mSpanIds.add(Integer.valueOf(iArr[i11]));
        }
        return true;
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    private boolean invalidatePositions(int i11, int i12, int i13, int i14) {
        for (int i15 = i11; i15 < i11 + i13; i15++) {
            for (int i16 = i12; i16 < i12 + i14; i16++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i15 < zArr.length && i16 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i15];
                    if (zArr2[i16]) {
                        zArr2[i16] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansValid(CharSequence charSequence) {
        return true;
    }

    private boolean isWeightsValid(String str) {
        return true;
    }

    private View makeNewView() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.mContainer.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    private ConstraintLayout.LayoutParams params(View view) {
        return (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    private int[][] parseSpans(String str) {
        if (!isSpansValid(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
        for (int i11 = 0; i11 < split.length; i11++) {
            String[] split2 = split[i11].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i11][0] = Integer.parseInt(split2[0]);
            iArr[i11][1] = Integer.parseInt(split3[0]);
            iArr[i11][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    private float[] parseWeights(int i11, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] split = str.split(",");
            if (split.length != i11) {
                return null;
            }
            fArr = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr[i12] = Float.parseFloat(split[i12].trim());
            }
        }
        return fArr;
    }

    private void setBoxViewHorizontalChains() {
        int i11;
        int id2 = getId();
        int max = Math.max(this.mRows, this.mColumns);
        float[] parseWeights = parseWeights(this.mColumns, this.mStrColumnWeights);
        int i12 = 0;
        ConstraintLayout.LayoutParams params = params(this.mBoxViews[0]);
        if (this.mColumns == 1) {
            clearHParams(this.mBoxViews[0]);
            params.leftToLeft = id2;
            params.rightToRight = id2;
            this.mBoxViews[0].setLayoutParams(params);
            return;
        }
        while (true) {
            i11 = this.mColumns;
            if (i12 >= i11) {
                break;
            }
            ConstraintLayout.LayoutParams params2 = params(this.mBoxViews[i12]);
            clearHParams(this.mBoxViews[i12]);
            if (parseWeights != null) {
                params2.horizontalWeight = parseWeights[i12];
            }
            if (i12 > 0) {
                params2.leftToRight = this.mBoxViewIds[i12 - 1];
            } else {
                params2.leftToLeft = id2;
            }
            if (i12 < this.mColumns - 1) {
                params2.rightToLeft = this.mBoxViewIds[i12 + 1];
            } else {
                params2.rightToRight = id2;
            }
            if (i12 > 0) {
                ((ViewGroup.MarginLayoutParams) params2).leftMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i12].setLayoutParams(params2);
            i12++;
        }
        while (i11 < max) {
            ConstraintLayout.LayoutParams params3 = params(this.mBoxViews[i11]);
            clearHParams(this.mBoxViews[i11]);
            params3.leftToLeft = id2;
            params3.rightToRight = id2;
            this.mBoxViews[i11].setLayoutParams(params3);
            i11++;
        }
    }

    private void setBoxViewVerticalChains() {
        int i11;
        int id2 = getId();
        int max = Math.max(this.mRows, this.mColumns);
        float[] parseWeights = parseWeights(this.mRows, this.mStrRowWeights);
        int i12 = 0;
        if (this.mRows == 1) {
            ConstraintLayout.LayoutParams params = params(this.mBoxViews[0]);
            clearVParams(this.mBoxViews[0]);
            params.topToTop = id2;
            params.bottomToBottom = id2;
            this.mBoxViews[0].setLayoutParams(params);
            return;
        }
        while (true) {
            i11 = this.mRows;
            if (i12 >= i11) {
                break;
            }
            ConstraintLayout.LayoutParams params2 = params(this.mBoxViews[i12]);
            clearVParams(this.mBoxViews[i12]);
            if (parseWeights != null) {
                params2.verticalWeight = parseWeights[i12];
            }
            if (i12 > 0) {
                params2.topToBottom = this.mBoxViewIds[i12 - 1];
            } else {
                params2.topToTop = id2;
            }
            if (i12 < this.mRows - 1) {
                params2.bottomToTop = this.mBoxViewIds[i12 + 1];
            } else {
                params2.bottomToBottom = id2;
            }
            if (i12 > 0) {
                ((ViewGroup.MarginLayoutParams) params2).topMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i12].setLayoutParams(params2);
            i12++;
        }
        while (i11 < max) {
            ConstraintLayout.LayoutParams params3 = params(this.mBoxViews[i11]);
            clearVParams(this.mBoxViews[i11]);
            params3.topToTop = id2;
            params3.bottomToBottom = id2;
            this.mBoxViews[i11].setLayoutParams(params3);
            i11++;
        }
    }

    private void updateActualRowsAndColumns() {
        int i11;
        int i12 = this.mRowsSet;
        if (i12 != 0 && (i11 = this.mColumnsSet) != 0) {
            this.mRows = i12;
            this.mColumns = i11;
            return;
        }
        int i13 = this.mColumnsSet;
        if (i13 > 0) {
            this.mColumns = i13;
            this.mRows = ((this.mCount + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.mRows = i12;
            this.mColumns = ((this.mCount + i12) - 1) / i12;
        } else {
            int sqrt = (int) (Math.sqrt(this.mCount) + 1.5d);
            this.mRows = sqrt;
            this.mColumns = ((this.mCount + sqrt) - 1) / sqrt;
        }
    }

    public String getColumnWeights() {
        return this.mStrColumnWeights;
    }

    public int getColumns() {
        return this.mColumnsSet;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public String getRowWeights() {
        return this.mStrRowWeights;
    }

    public int getRows() {
        return this.mRowsSet;
    }

    public String getSkips() {
        return this.mStrSkips;
    }

    public String getSpans() {
        return this.mStrSpans;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Grid);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.Grid_grid_rows) {
                    this.mRowsSet = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Grid_grid_columns) {
                    this.mColumnsSet = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Grid_grid_spans) {
                    this.mStrSpans = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_skips) {
                    this.mStrSkips = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_rowWeights) {
                    this.mStrRowWeights = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_columnWeights) {
                    this.mStrColumnWeights = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_orientation) {
                    this.mOrientation = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.Grid_grid_horizontalGaps) {
                    this.mHorizontalGaps = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.Grid_grid_verticalGaps) {
                    this.mVerticalGaps = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.Grid_grid_validateInputs) {
                    this.mValidateInputs = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == R.styleable.Grid_grid_useRtl) {
                    this.mUseRtl = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            updateActualRowsAndColumns();
            initVariables();
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        generateGrid(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.mBoxViews) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        if (isWeightsValid(str)) {
            String str2 = this.mStrColumnWeights;
            if (str2 == null || !str2.equals(str)) {
                this.mStrColumnWeights = str;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public void setColumns(int i11) {
        if (i11 <= 50 && this.mColumnsSet != i11) {
            this.mColumnsSet = i11;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f11) {
        if (f11 >= 0.0f && this.mHorizontalGaps != f11) {
            this.mHorizontalGaps = f11;
            generateGrid(true);
            invalidate();
        }
    }

    public void setOrientation(int i11) {
        if ((i11 == 0 || i11 == 1) && this.mOrientation != i11) {
            this.mOrientation = i11;
            generateGrid(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        if (isWeightsValid(str)) {
            String str2 = this.mStrRowWeights;
            if (str2 == null || !str2.equals(str)) {
                this.mStrRowWeights = str;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public void setRows(int i11) {
        if (i11 <= 50 && this.mRowsSet != i11) {
            this.mRowsSet = i11;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (isSpansValid(str)) {
            String str2 = this.mStrSkips;
            if (str2 == null || !str2.equals(str)) {
                this.mStrSkips = str;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (isSpansValid(charSequence)) {
            String str = this.mStrSpans;
            if (str == null || !str.contentEquals(charSequence)) {
                this.mStrSpans = charSequence.toString();
                generateGrid(true);
                invalidate();
            }
        }
    }

    public void setVerticalGaps(float f11) {
        if (f11 >= 0.0f && this.mVerticalGaps != f11) {
            this.mVerticalGaps = f11;
            generateGrid(true);
            invalidate();
        }
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mMaxRows = 50;
        this.mMaxColumns = 50;
        this.mNextAvailableIndex = 0;
        this.mSpanIds = new HashSet();
    }
}
