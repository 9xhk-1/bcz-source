package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-4f;
    static final int NOT_FOUND = -1;
    GoalVariableAccessor mAccessor;
    private SolverVariable[] mArrayGoals;
    Cache mCache;
    private int mNumGoals;
    private SolverVariable[] mSortArray;
    private int mTableSize;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class GoalVariableAccessor {
        PriorityGoalRow mRow;
        SolverVariable mVariable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.mRow = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f11 = fArr[i11] + solverVariable.mGoalStrengthVector[i11];
                fArr[i11] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i11] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f11) {
            boolean z11 = true;
            if (!this.mVariable.inGoal) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = solverVariable.mGoalStrengthVector[i11];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f11;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        this.mVariable.mGoalStrengthVector[i11] = f13;
                    } else {
                        this.mVariable.mGoalStrengthVector[i11] = 0.0f;
                    }
                }
                return true;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                float f14 = fArr[i12] + (solverVariable.mGoalStrengthVector[i12] * f11);
                fArr[i12] = f14;
                if (Math.abs(f14) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i12] = 0.0f;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                PriorityGoalRow.this.removeGoal(this.mVariable);
            }
            return false;
        }

        public void init(SolverVariable solverVariable) {
            this.mVariable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = this.mVariable.mGoalStrengthVector[i11];
                if (f11 > 0.0f) {
                    return false;
                }
                if (f11 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i11 = 0; i11 < 9; i11++) {
                if (this.mVariable.mGoalStrengthVector[i11] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i11 = 8;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                float f11 = solverVariable.mGoalStrengthVector[i11];
                float f12 = this.mVariable.mGoalStrengthVector[i11];
                if (f12 == f11) {
                    i11--;
                } else if (f12 < f11) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.mVariable.mGoalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.mVariable != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = str + this.mVariable.mGoalStrengthVector[i11] + " ";
                }
            }
            return str + "] " + this.mVariable;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mTableSize = 128;
        this.mArrayGoals = new SolverVariable[128];
        this.mSortArray = new SolverVariable[128];
        this.mNumGoals = 0;
        this.mAccessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private void addToGoal(SolverVariable solverVariable) {
        int i11;
        int i12 = this.mNumGoals + 1;
        SolverVariable[] solverVariableArr = this.mArrayGoals;
        if (i12 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.mArrayGoals = solverVariableArr2;
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.mArrayGoals;
        int i13 = this.mNumGoals;
        solverVariableArr3[i13] = solverVariable;
        int i14 = i13 + 1;
        this.mNumGoals = i14;
        if (i14 > 1 && solverVariableArr3[i13].f4251id > solverVariable.f4251id) {
            int i15 = 0;
            while (true) {
                i11 = this.mNumGoals;
                if (i15 >= i11) {
                    break;
                }
                this.mSortArray[i15] = this.mArrayGoals[i15];
                i15++;
            }
            Arrays.sort(this.mSortArray, 0, i11, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.f4251id - solverVariable3.f4251id;
                }
            });
            for (int i16 = 0; i16 < this.mNumGoals; i16++) {
                this.mArrayGoals[i16] = this.mSortArray[i16];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGoal(SolverVariable solverVariable) {
        int i11 = 0;
        while (i11 < this.mNumGoals) {
            if (this.mArrayGoals[i11] == solverVariable) {
                while (true) {
                    int i12 = this.mNumGoals;
                    if (i11 >= i12 - 1) {
                        this.mNumGoals = i12 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.mArrayGoals;
                        int i13 = i11 + 1;
                        solverVariableArr[i11] = solverVariableArr[i13];
                        i11 = i13;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.mAccessor.init(solverVariable);
        this.mAccessor.reset();
        solverVariable.mGoalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.mNumGoals = 0;
        this.mConstantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.mNumGoals; i12++) {
            SolverVariable solverVariable = this.mArrayGoals[i12];
            if (!zArr[solverVariable.f4251id]) {
                this.mAccessor.init(solverVariable);
                if (i11 == -1) {
                    if (!this.mAccessor.isNegative()) {
                    }
                    i11 = i12;
                } else {
                    if (!this.mAccessor.isSmallerThan(this.mArrayGoals[i11])) {
                    }
                    i11 = i12;
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.mArrayGoals[i11];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mNumGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.mConstantValue + ") : ";
        for (int i11 = 0; i11 < this.mNumGoals; i11++) {
            this.mAccessor.init(this.mArrayGoals[i11]);
            str = str + this.mAccessor + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z11) {
        SolverVariable solverVariable = arrayRow.mVariable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i11 = 0; i11 < currentSize; i11++) {
            SolverVariable variable = arrayRowVariables.getVariable(i11);
            float variableValue = arrayRowVariables.getVariableValue(i11);
            this.mAccessor.init(variable);
            if (this.mAccessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.mConstantValue += arrayRow.mConstantValue * variableValue;
        }
        removeGoal(solverVariable);
    }
}
