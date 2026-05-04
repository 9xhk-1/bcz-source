package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    static final int NONE = -1;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    int mCurrentSize = 0;
    private int mRowSize = 8;
    private SolverVariable mCandidate = null;
    private int[] mArrayIndices = new int[8];
    private int[] mArrayNextIndices = new int[8];
    private float[] mArrayValues = new float[8];
    private int mHead = -1;
    private int mLast = -1;
    private boolean mDidFillOnce = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f11, boolean z11) {
        float f12 = sEpsilon;
        if (f11 <= (-f12) || f11 >= f12) {
            int i11 = this.mHead;
            if (i11 == -1) {
                this.mHead = 0;
                this.mArrayValues[0] = f11;
                this.mArrayIndices[0] = solverVariable.f4251id;
                this.mArrayNextIndices[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.mRow);
                this.mCurrentSize++;
                if (this.mDidFillOnce) {
                    return;
                }
                int i12 = this.mLast + 1;
                this.mLast = i12;
                int[] iArr = this.mArrayIndices;
                if (i12 >= iArr.length) {
                    this.mDidFillOnce = true;
                    this.mLast = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.mCurrentSize; i14++) {
                int i15 = this.mArrayIndices[i11];
                int i16 = solverVariable.f4251id;
                if (i15 == i16) {
                    float[] fArr = this.mArrayValues;
                    float f13 = fArr[i11] + f11;
                    float f14 = sEpsilon;
                    if (f13 > (-f14) && f13 < f14) {
                        f13 = 0.0f;
                    }
                    fArr[i11] = f13;
                    if (f13 == 0.0f) {
                        if (i11 == this.mHead) {
                            this.mHead = this.mArrayNextIndices[i11];
                        } else {
                            int[] iArr2 = this.mArrayNextIndices;
                            iArr2[i13] = iArr2[i11];
                        }
                        if (z11) {
                            solverVariable.removeFromRow(this.mRow);
                        }
                        if (this.mDidFillOnce) {
                            this.mLast = i11;
                        }
                        solverVariable.usageInRowCount--;
                        this.mCurrentSize--;
                        return;
                    }
                    return;
                }
                if (i15 < i16) {
                    i13 = i11;
                }
                i11 = this.mArrayNextIndices[i11];
            }
            int i17 = this.mLast;
            int i18 = i17 + 1;
            if (this.mDidFillOnce) {
                int[] iArr3 = this.mArrayIndices;
                if (iArr3[i17] != -1) {
                    i17 = iArr3.length;
                }
            } else {
                i17 = i18;
            }
            int[] iArr4 = this.mArrayIndices;
            if (i17 >= iArr4.length && this.mCurrentSize < iArr4.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr5 = this.mArrayIndices;
                    if (i19 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i19] == -1) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
            }
            int[] iArr6 = this.mArrayIndices;
            if (i17 >= iArr6.length) {
                i17 = iArr6.length;
                int i21 = this.mRowSize * 2;
                this.mRowSize = i21;
                this.mDidFillOnce = false;
                this.mLast = i17 - 1;
                this.mArrayValues = Arrays.copyOf(this.mArrayValues, i21);
                this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
                this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
            }
            this.mArrayIndices[i17] = solverVariable.f4251id;
            this.mArrayValues[i17] = f11;
            if (i13 != -1) {
                int[] iArr7 = this.mArrayNextIndices;
                iArr7[i17] = iArr7[i13];
                iArr7[i13] = i17;
            } else {
                this.mArrayNextIndices[i17] = this.mHead;
                this.mHead = i17;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (!this.mDidFillOnce) {
                this.mLast++;
            }
            int i22 = this.mLast;
            int[] iArr8 = this.mArrayIndices;
            if (i22 >= iArr8.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i11 = this.mHead;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[this.mArrayIndices[i11]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.mRow);
            }
            i11 = this.mArrayNextIndices[i11];
        }
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mCurrentSize = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i11 = this.mHead;
        if (i11 == -1) {
            return false;
        }
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            if (this.mArrayIndices[i11] == solverVariable.f4251id) {
                return true;
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i11 = this.mCurrentSize;
        System.out.print("{ ");
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable variable = getVariable(i12);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i12) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f11) {
        int i11 = this.mHead;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            float[] fArr = this.mArrayValues;
            fArr[i11] = fArr[i11] / f11;
            i11 = this.mArrayNextIndices[i11];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i11 = this.mHead;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            if (this.mArrayIndices[i11] == solverVariable.f4251id) {
                return this.mArrayValues[i11];
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCurrentSize;
    }

    public int getHead() {
        return this.mHead;
    }

    public final int getId(int i11) {
        return this.mArrayIndices[i11];
    }

    public final int getNextIndice(int i11) {
        return this.mArrayNextIndices[i11];
    }

    public SolverVariable getPivotCandidate() {
        SolverVariable solverVariable = this.mCandidate;
        if (solverVariable != null) {
            return solverVariable;
        }
        int i11 = this.mHead;
        SolverVariable solverVariable2 = null;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            if (this.mArrayValues[i11] < 0.0f) {
                SolverVariable solverVariable3 = this.mCache.mIndexedVariables[this.mArrayIndices[i11]];
                if (solverVariable2 == null || solverVariable2.strength < solverVariable3.strength) {
                    solverVariable2 = solverVariable3;
                }
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return solverVariable2;
    }

    public final float getValue(int i11) {
        return this.mArrayValues[i11];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i11) {
        int i12 = this.mHead;
        for (int i13 = 0; i12 != -1 && i13 < this.mCurrentSize; i13++) {
            if (i13 == i11) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[i12]];
            }
            i12 = this.mArrayNextIndices[i12];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i11) {
        int i12 = this.mHead;
        for (int i13 = 0; i12 != -1 && i13 < this.mCurrentSize; i13++) {
            if (i13 == i11) {
                return this.mArrayValues[i12];
            }
            i12 = this.mArrayNextIndices[i12];
        }
        return 0.0f;
    }

    public boolean hasAtLeastOnePositiveVariable() {
        int i11 = this.mHead;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            if (this.mArrayValues[i11] > 0.0f) {
                return true;
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i11 = this.mHead;
        if (i11 == -1) {
            return -1;
        }
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            if (this.mArrayIndices[i11] == solverVariable.f4251id) {
                return i11;
            }
            i11 = this.mArrayNextIndices[i11];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i11 = this.mHead;
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            float[] fArr = this.mArrayValues;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.mArrayNextIndices[i11];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f11) {
        if (f11 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i11 = this.mHead;
        if (i11 == -1) {
            this.mHead = 0;
            this.mArrayValues[0] = f11;
            this.mArrayIndices[0] = solverVariable.f4251id;
            this.mArrayNextIndices[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.mRow);
            this.mCurrentSize++;
            if (this.mDidFillOnce) {
                return;
            }
            int i12 = this.mLast + 1;
            this.mLast = i12;
            int[] iArr = this.mArrayIndices;
            if (i12 >= iArr.length) {
                this.mDidFillOnce = true;
                this.mLast = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.mCurrentSize; i14++) {
            int i15 = this.mArrayIndices[i11];
            int i16 = solverVariable.f4251id;
            if (i15 == i16) {
                this.mArrayValues[i11] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.mArrayNextIndices[i11];
        }
        int i17 = this.mLast;
        int i18 = i17 + 1;
        if (this.mDidFillOnce) {
            int[] iArr2 = this.mArrayIndices;
            if (iArr2[i17] != -1) {
                i17 = iArr2.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr3 = this.mArrayIndices;
        if (i17 >= iArr3.length && this.mCurrentSize < iArr3.length) {
            int i19 = 0;
            while (true) {
                int[] iArr4 = this.mArrayIndices;
                if (i19 >= iArr4.length) {
                    break;
                }
                if (iArr4[i19] == -1) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
        }
        int[] iArr5 = this.mArrayIndices;
        if (i17 >= iArr5.length) {
            i17 = iArr5.length;
            int i21 = this.mRowSize * 2;
            this.mRowSize = i21;
            this.mDidFillOnce = false;
            this.mLast = i17 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, i21);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.mRowSize);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.mRowSize);
        }
        this.mArrayIndices[i17] = solverVariable.f4251id;
        this.mArrayValues[i17] = f11;
        if (i13 != -1) {
            int[] iArr6 = this.mArrayNextIndices;
            iArr6[i17] = iArr6[i13];
            iArr6[i13] = i17;
        } else {
            this.mArrayNextIndices[i17] = this.mHead;
            this.mHead = i17;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.mRow);
        int i22 = this.mCurrentSize + 1;
        this.mCurrentSize = i22;
        if (!this.mDidFillOnce) {
            this.mLast++;
        }
        int[] iArr7 = this.mArrayIndices;
        if (i22 >= iArr7.length) {
            this.mDidFillOnce = true;
        }
        if (this.mLast >= iArr7.length) {
            this.mDidFillOnce = true;
            this.mLast = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z11) {
        if (this.mCandidate == solverVariable) {
            this.mCandidate = null;
        }
        int i11 = this.mHead;
        if (i11 == -1) {
            return 0.0f;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.mCurrentSize) {
            if (this.mArrayIndices[i11] == solverVariable.f4251id) {
                if (i11 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[i11];
                } else {
                    int[] iArr = this.mArrayNextIndices;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    solverVariable.removeFromRow(this.mRow);
                }
                solverVariable.usageInRowCount--;
                this.mCurrentSize--;
                this.mArrayIndices[i11] = -1;
                if (this.mDidFillOnce) {
                    this.mLast = i11;
                }
                return this.mArrayValues[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.mArrayNextIndices[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.mArrayIndices.length * 12) + 36;
    }

    public String toString() {
        int i11 = this.mHead;
        String str = "";
        for (int i12 = 0; i11 != -1 && i12 < this.mCurrentSize; i12++) {
            str = ((str + " -> ") + this.mArrayValues[i11] + " : ") + this.mCache.mIndexedVariables[this.mArrayIndices[i11]];
            i11 = this.mArrayNextIndices[i11];
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z11) {
        float f11 = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z11);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i11 = 0; i11 < currentSize; i11++) {
            SolverVariable variable = arrayRowVariables.getVariable(i11);
            add(variable, arrayRowVariables.get(variable) * f11, z11);
        }
        return f11;
    }
}
