package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    public ArrayRowVariables variables;
    SolverVariable mVariable = null;
    float mConstantValue = 0.0f;
    boolean mUsed = false;
    ArrayList<SolverVariable> mVariablesToUpdate = new ArrayList<>();
    boolean mIsSimpleDefinition = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f11, boolean z11);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f11);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i11);

        float getVariableValue(int i11);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f11);

        float remove(SolverVariable solverVariable, boolean z11);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z11);
    }

    public ArrayRow() {
    }

    private boolean isNew(SolverVariable solverVariable, LinearSystem linearSystem) {
        return solverVariable.usageInRowCount <= 1;
    }

    private SolverVariable pickPivotInVariables(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < currentSize; i11++) {
            float variableValue = this.variables.getVariableValue(i11);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i11);
                if ((zArr == null || !zArr[variable.f4251id]) && variable != solverVariable && (((type = variable.mType) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f11)) {
                    f11 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i11) {
        this.variables.put(linearSystem.createErrorVariable(i11, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i11, "em"), -1.0f);
        return this;
    }

    public ArrayRow addSingleError(SolverVariable solverVariable, int i11) {
        this.variables.put(solverVariable, i11);
        return this;
    }

    public boolean chooseSubject(LinearSystem linearSystem) {
        boolean z11;
        SolverVariable chooseSubjectInVariables = chooseSubjectInVariables(linearSystem);
        if (chooseSubjectInVariables == null) {
            z11 = true;
        } else {
            pivot(chooseSubjectInVariables);
            z11 = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
        }
        return z11;
    }

    public SolverVariable chooseSubjectInVariables(LinearSystem linearSystem) {
        boolean isNew;
        boolean isNew2;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        SolverVariable solverVariable2 = null;
        for (int i11 = 0; i11 < currentSize; i11++) {
            float variableValue = this.variables.getVariableValue(i11);
            SolverVariable variable = this.variables.getVariable(i11);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (f11 > variableValue) {
                    isNew2 = isNew(variable, linearSystem);
                } else if (!z11 && isNew(variable, linearSystem)) {
                    f11 = variableValue;
                    solverVariable = variable;
                    z11 = true;
                }
                z11 = isNew2;
                f11 = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    isNew = isNew(variable, linearSystem);
                } else if (f12 > variableValue) {
                    isNew = isNew(variable, linearSystem);
                } else if (!z12 && isNew(variable, linearSystem)) {
                    f12 = variableValue;
                    solverVariable2 = variable;
                    z12 = true;
                }
                z12 = isNew;
                f12 = variableValue;
                solverVariable2 = variable;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.mVariable = null;
        this.mConstantValue = 0.0f;
    }

    public ArrayRow createRowCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, float f11, SolverVariable solverVariable3, SolverVariable solverVariable4, int i12) {
        if (solverVariable2 == solverVariable3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable2, -2.0f);
            return this;
        }
        if (f11 == 0.5f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            if (i11 > 0 || i12 > 0) {
                this.mConstantValue = (-i11) + i12;
                return this;
            }
        } else {
            if (f11 <= 0.0f) {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
                this.mConstantValue = i11;
                return this;
            }
            if (f11 >= 1.0f) {
                this.variables.put(solverVariable4, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                this.mConstantValue = -i12;
                return this;
            }
            float f12 = 1.0f - f11;
            this.variables.put(solverVariable, f12 * 1.0f);
            this.variables.put(solverVariable2, f12 * (-1.0f));
            this.variables.put(solverVariable3, (-1.0f) * f11);
            this.variables.put(solverVariable4, 1.0f * f11);
            if (i11 > 0 || i12 > 0) {
                this.mConstantValue = ((-i11) * f12) + (i12 * f11);
                return this;
            }
        }
        return this;
    }

    public ArrayRow createRowDefinition(SolverVariable solverVariable, int i11) {
        this.mVariable = solverVariable;
        float f11 = i11;
        solverVariable.computedValue = f11;
        this.mConstantValue = f11;
        this.mIsSimpleDefinition = true;
        return this;
    }

    public ArrayRow createRowDimensionPercent(SolverVariable solverVariable, SolverVariable solverVariable2, float f11) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, f11);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f11);
        this.variables.put(solverVariable4, -f11);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f11, float f12, float f13, SolverVariable solverVariable, int i11, SolverVariable solverVariable2, int i12, SolverVariable solverVariable3, int i13, SolverVariable solverVariable4, int i14) {
        if (f12 == 0.0f || f11 == f13) {
            this.mConstantValue = ((-i11) - i12) + i13 + i14;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        float f14 = (f11 / f12) / (f13 / f12);
        this.mConstantValue = ((-i11) - i12) + (i13 * f14) + (i14 * f14);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f14);
        this.variables.put(solverVariable3, -f14);
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f11, float f12, float f13, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.mConstantValue = 0.0f;
        if (f12 == 0.0f || f11 == f13) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        if (f11 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            return this;
        }
        if (f13 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
            return this;
        }
        float f14 = (f11 / f12) / (f13 / f12);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f14);
        this.variables.put(solverVariable3, -f14);
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i11) {
        if (i11 < 0) {
            this.mConstantValue = i11 * (-1);
            this.variables.put(solverVariable, 1.0f);
            return this;
        }
        this.mConstantValue = i11;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.mConstantValue = i11;
        }
        if (z11) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, 1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.mConstantValue = i11;
        }
        if (z11) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable3, 1.0f);
            return this;
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, -1.0f);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.mConstantValue = -f11;
        return this;
    }

    public void ensurePositiveConstant() {
        float f11 = this.mConstantValue;
        if (f11 < 0.0f) {
            this.mConstantValue = f11 * (-1.0f);
            this.variables.invert();
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getKey() {
        return this.mVariable;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return pickPivotInVariables(zArr, null);
    }

    public boolean hasKeyVariable() {
        SolverVariable solverVariable = this.mVariable;
        if (solverVariable != null) {
            return solverVariable.mType == SolverVariable.Type.UNRESTRICTED || this.mConstantValue >= 0.0f;
        }
        return false;
    }

    public boolean hasVariable(SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) row;
            this.mVariable = null;
            this.variables.clear();
            for (int i11 = 0; i11 < arrayRow.variables.getCurrentSize(); i11++) {
                this.variables.add(arrayRow.variables.getVariable(i11), arrayRow.variables.getVariableValue(i11), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return pickPivotInVariables(null, solverVariable);
    }

    public void pivot(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.mVariable;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.mVariable = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.mConstantValue /= remove;
        this.variables.divideByAmount(remove);
    }

    public void reset() {
        this.mVariable = null;
        this.variables.clear();
        this.mConstantValue = 0.0f;
        this.mIsSimpleDefinition = false;
    }

    public int sizeInBytes() {
        return (this.mVariable != null ? 4 : 0) + 8 + this.variables.sizeInBytes();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toReadableString() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.ArrayRow.toReadableString():java.lang.String");
    }

    public String toString() {
        return toReadableString();
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z11) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.mConstantValue += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z11);
        if (z11) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z11) {
        this.mConstantValue += arrayRow.mConstantValue * this.variables.use(arrayRow, z11);
        if (z11) {
            arrayRow.mVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z11) {
        if (solverVariable == null || !solverVariable.mIsSynonym) {
            return;
        }
        float f11 = this.variables.get(solverVariable);
        this.mConstantValue += solverVariable.mSynonymDelta * f11;
        this.variables.remove(solverVariable, z11);
        if (z11) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.mCache.mIndexedVariables[solverVariable.mSynonym], f11, z11);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromSystem(LinearSystem linearSystem) {
        if (linearSystem.mRows.length == 0) {
            return;
        }
        boolean z11 = false;
        while (!z11) {
            int currentSize = this.variables.getCurrentSize();
            for (int i11 = 0; i11 < currentSize; i11++) {
                SolverVariable variable = this.variables.getVariable(i11);
                if (variable.mDefinitionId != -1 || variable.isFinalValue || variable.mIsSynonym) {
                    this.mVariablesToUpdate.add(variable);
                }
            }
            int size = this.mVariablesToUpdate.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    SolverVariable solverVariable = this.mVariablesToUpdate.get(i12);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.mIsSynonym) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.mRows[solverVariable.mDefinitionId], true);
                    }
                }
                this.mVariablesToUpdate.clear();
            } else {
                z11 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        int i11 = solverVariable.strength;
        float f11 = 1.0f;
        if (i11 != 1) {
            if (i11 == 2) {
                f11 = 1000.0f;
            } else if (i11 == 3) {
                f11 = 1000000.0f;
            } else if (i11 == 4) {
                f11 = 1.0E9f;
            } else if (i11 == 5) {
                f11 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f11);
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.mConstantValue = i11;
        }
        if (!z11) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            return this;
        }
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i11, SolverVariable solverVariable2) {
        this.mConstantValue = i11;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
