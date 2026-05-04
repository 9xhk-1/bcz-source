package androidx.constraintlayout.core.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class GridEngine {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int VERTICAL = 1;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    private int mNextAvailableIndex = 0;
    private int mNumWidgets;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    private String mStrSkips;
    private String mStrSpans;

    public GridEngine() {
    }

    private void addAllConstraintPositions() {
        for (int i11 = 0; i11 < this.mNumWidgets; i11++) {
            if (leftOfWidget(i11) == -1) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    addConstraintPosition(i11, rowByIndex, colByIndex, 1, 1);
                }
            }
        }
    }

    private void addConstraintPosition(int i11, int i12, int i13, int i14, int i15) {
        int[] iArr = this.mConstraintMatrix[i11];
        iArr[0] = i13;
        iArr[1] = i12;
        iArr[2] = (i13 + i15) - 1;
        iArr[3] = (i12 + i14) - 1;
    }

    private void fillConstraintMatrix(boolean z11) {
        int[][] parseSpans;
        int[][] parseSpans2;
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
            for (int i13 = 0; i13 < this.mConstraintMatrix.length; i13++) {
                int i14 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i14 < iArr[0].length) {
                        iArr[i13][i14] = -1;
                        i14++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mStrSkips;
        if (str != null && !str.trim().isEmpty() && (parseSpans2 = parseSpans(this.mStrSkips)) != null) {
            handleSkips(parseSpans2);
        }
        String str2 = this.mStrSpans;
        if (str2 != null && !str2.trim().isEmpty() && (parseSpans = parseSpans(this.mStrSpans)) != null) {
            handleSpans(parseSpans);
        }
        addAllConstraintPositions();
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

    private void handleSkips(int[][] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int rowByIndex = getRowByIndex(iArr[i11][0]);
            int colByIndex = getColByIndex(iArr[i11][0]);
            int[] iArr2 = iArr[i11];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int rowByIndex = getRowByIndex(iArr[i11][0]);
            int colByIndex = getColByIndex(iArr[i11][0]);
            int[] iArr2 = iArr[i11];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
            int[] iArr3 = iArr[i11];
            addConstraintPosition(i11, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
        }
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i11 = this.mNumWidgets;
        if (i11 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
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
        return charSequence != null;
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
            this.mRows = ((this.mNumWidgets + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.mRows = i12;
            this.mColumns = ((this.mNumWidgets + i12) - 1) / i12;
        } else {
            int sqrt = (int) (Math.sqrt(this.mNumWidgets) + 1.5d);
            this.mRows = sqrt;
            this.mColumns = ((this.mNumWidgets + sqrt) - 1) / sqrt;
        }
    }

    public int bottomOfWidget(int i11) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i11 >= iArr.length) {
            return 0;
        }
        return iArr[i11][3];
    }

    public int leftOfWidget(int i11) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i11 >= iArr.length) {
            return 0;
        }
        return iArr[i11][0];
    }

    public int rightOfWidget(int i11) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i11 >= iArr.length) {
            return 0;
        }
        return iArr[i11][2];
    }

    public void setColumns(int i11) {
        if (i11 <= 50 && this.mColumnsSet != i11) {
            this.mColumnsSet = i11;
            updateActualRowsAndColumns();
        }
    }

    public void setNumWidgets(int i11) {
        if (i11 > this.mRows * this.mColumns) {
            return;
        }
        this.mNumWidgets = i11;
    }

    public void setOrientation(int i11) {
        if ((i11 == 0 || i11 == 1) && this.mOrientation != i11) {
            this.mOrientation = i11;
        }
    }

    public void setRows(int i11) {
        if (i11 <= 50 && this.mRowsSet != i11) {
            this.mRowsSet = i11;
            updateActualRowsAndColumns();
        }
    }

    public void setSkips(String str) {
        String str2 = this.mStrSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mStrSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.mStrSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mStrSpans = charSequence.toString();
        }
    }

    public void setup() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z11 = false;
        if (iArr != null && iArr.length == this.mNumWidgets && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z11 = true;
        }
        if (!z11) {
            initVariables();
        }
        fillConstraintMatrix(z11);
    }

    public int topOfWidget(int i11) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i11 >= iArr.length) {
            return 0;
        }
        return iArr[i11][1];
    }

    public GridEngine(int i11, int i12) {
        this.mRowsSet = i11;
        this.mColumnsSet = i12;
        if (i11 > 50) {
            this.mRowsSet = 3;
        }
        if (i12 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initVariables();
    }

    public GridEngine(int i11, int i12, int i13) {
        this.mRowsSet = i11;
        this.mColumnsSet = i12;
        this.mNumWidgets = i13;
        if (i11 > 50) {
            this.mRowsSet = 3;
        }
        if (i12 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        int i14 = this.mRows;
        int i15 = this.mColumns;
        if (i13 > i14 * i15 || i13 < 1) {
            this.mNumWidgets = i14 * i15;
        }
        initVariables();
        fillConstraintMatrix(false);
    }
}
