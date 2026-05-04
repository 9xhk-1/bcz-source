package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    private static final boolean DO_NOT_USE = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    final Cache mCache;
    private Row mGoal;
    private Row mTempGoal;
    private int mPoolSize = 1000;
    public boolean hasSimpleDefinition = false;
    int mVariablesID = 0;
    private HashMap<String, SolverVariable> mVariables = null;
    private int mTableSize = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    int mNumColumns = 1;
    int mNumRows = 0;
    private int mMaxRows = 32;
    private SolverVariable[] mPoolVariables = new SolverVariable[1000];
    private int mPoolVariablesCount = 0;
    ArrayRow[] mRows = new ArrayRow[32];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z11);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z11);

        void updateFromSystem(LinearSystem linearSystem);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ValuesRow extends ArrayRow {
        public ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        releaseRows();
        Cache cache = new Cache();
        this.mCache = cache;
        this.mGoal = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(cache);
        } else {
            this.mTempGoal = new ArrayRow(cache);
        }
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String str) {
        SolverVariable acquire = this.mCache.mSolverVariablePool.acquire();
        if (acquire == null) {
            acquire = new SolverVariable(type, str);
            acquire.setType(type, str);
        } else {
            acquire.reset();
            acquire.setType(type, str);
        }
        int i11 = this.mPoolVariablesCount;
        int i12 = this.mPoolSize;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.mPoolSize = i13;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, i13);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i14 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i14 + 1;
        solverVariableArr[i14] = acquire;
        return acquire;
    }

    private void addRow(ArrayRow arrayRow) {
        int i11;
        if (SIMPLIFY_SYNONYMS && arrayRow.mIsSimpleDefinition) {
            arrayRow.mVariable.setFinalValue(this, arrayRow.mConstantValue);
        } else {
            ArrayRow[] arrayRowArr = this.mRows;
            int i12 = this.mNumRows;
            arrayRowArr[i12] = arrayRow;
            SolverVariable solverVariable = arrayRow.mVariable;
            solverVariable.mDefinitionId = i12;
            this.mNumRows = i12 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i13 = 0;
            while (i13 < this.mNumRows) {
                if (this.mRows[i13] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.mRows[i13];
                if (arrayRow2 != null && arrayRow2.mIsSimpleDefinition) {
                    arrayRow2.mVariable.setFinalValue(this, arrayRow2.mConstantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.mOptimizedArrayRowPool.release(arrayRow2);
                    } else {
                        this.mCache.mArrayRowPool.release(arrayRow2);
                    }
                    this.mRows[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.mNumRows;
                        if (i14 >= i11) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.mRows;
                        int i16 = i14 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i14];
                        arrayRowArr2[i16] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.mVariable;
                        if (solverVariable2.mDefinitionId == i14) {
                            solverVariable2.mDefinitionId = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.mRows[i15] = null;
                    }
                    this.mNumRows = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    private void computeValues() {
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            arrayRow.mVariable.computedValue = arrayRow.mConstantValue;
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f11) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f11);
    }

    private SolverVariable createVariable(String str, SolverVariable.Type type) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(type, null);
        acquireSolverVariable.setName(str);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        acquireSolverVariable.f4251id = i11;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(str, acquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    private void displayRows() {
        displaySolverVariables();
        String str = "";
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            str = (str + this.mRows[i11]) + "\n";
        }
        System.out.println(str + this.mGoal + "\n");
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private int enforceBFS(Row row) throws Exception {
        float f11;
        long j11;
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            ArrayRow arrayRow = this.mRows[i11];
            if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED) {
                float f12 = 0.0f;
                if (arrayRow.mConstantValue < 0.0f) {
                    boolean z11 = false;
                    int i12 = 0;
                    while (!z11) {
                        Metrics metrics = sMetrics;
                        long j12 = 1;
                        if (metrics != null) {
                            metrics.bfs++;
                        }
                        i12++;
                        float f13 = Float.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        int i15 = -1;
                        int i16 = 0;
                        while (true) {
                            if (i13 >= this.mNumRows) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.mRows[i13];
                            if (arrayRow2.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow2.mIsSimpleDefinition && arrayRow2.mConstantValue < f12) {
                                if (SKIP_COLUMNS) {
                                    int currentSize = arrayRow2.variables.getCurrentSize();
                                    int i17 = 0;
                                    while (i17 < currentSize) {
                                        float f14 = f12;
                                        SolverVariable variable = arrayRow2.variables.getVariable(i17);
                                        long j13 = j12;
                                        float f15 = arrayRow2.variables.get(variable);
                                        if (f15 > f14) {
                                            for (int i18 = 0; i18 < 9; i18++) {
                                                float f16 = variable.mStrengthVector[i18] / f15;
                                                if ((f16 < f13 && i18 == i16) || i18 > i16) {
                                                    i16 = i18;
                                                    i15 = variable.f4251id;
                                                    i14 = i13;
                                                    f13 = f16;
                                                }
                                            }
                                        }
                                        i17++;
                                        f12 = f14;
                                        j12 = j13;
                                    }
                                } else {
                                    f11 = f12;
                                    j11 = j12;
                                    for (int i19 = 1; i19 < this.mNumColumns; i19++) {
                                        SolverVariable solverVariable = this.mCache.mIndexedVariables[i19];
                                        float f17 = arrayRow2.variables.get(solverVariable);
                                        if (f17 > f11) {
                                            for (int i21 = 0; i21 < 9; i21++) {
                                                float f18 = solverVariable.mStrengthVector[i21] / f17;
                                                if ((f18 < f13 && i21 == i16) || i21 > i16) {
                                                    i16 = i21;
                                                    f13 = f18;
                                                    i14 = i13;
                                                    i15 = i19;
                                                }
                                            }
                                        }
                                    }
                                    i13++;
                                    f12 = f11;
                                    j12 = j11;
                                }
                            }
                            f11 = f12;
                            j11 = j12;
                            i13++;
                            f12 = f11;
                            j12 = j11;
                        }
                        float f19 = f12;
                        long j14 = j12;
                        if (i14 != -1) {
                            ArrayRow arrayRow3 = this.mRows[i14];
                            arrayRow3.mVariable.mDefinitionId = -1;
                            Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots += j14;
                            }
                            arrayRow3.pivot(this.mCache.mIndexedVariables[i15]);
                            SolverVariable solverVariable2 = arrayRow3.mVariable;
                            solverVariable2.mDefinitionId = i14;
                            solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                        } else {
                            z11 = true;
                        }
                        if (i12 > this.mNumColumns / 2) {
                            z11 = true;
                        }
                        f12 = f19;
                    }
                    return i12;
                }
            }
        }
        return 0;
    }

    private String getDisplaySize(int i11) {
        int i12 = i11 * 4;
        int i13 = i12 / 1024;
        int i14 = i13 / 1024;
        if (i14 > 0) {
            return "" + i14 + " Mb";
        }
        if (i13 > 0) {
            return "" + i13 + " Kb";
        }
        return "" + i12 + " bytes";
    }

    private String getDisplayStrength(int i11) {
        return i11 == 1 ? "LOW" : i11 == 2 ? "MEDIUM" : i11 == 3 ? "HIGH" : i11 == 4 ? "HIGHEST" : i11 == 5 ? "EQUALITY" : i11 == 8 ? "FIXED" : i11 == 6 ? "BARRIER" : "NONE";
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i11 = this.mTableSize * 2;
        this.mTableSize = i11;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, i11);
        Cache cache = this.mCache;
        cache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(cache.mIndexedVariables, this.mTableSize);
        int i12 = this.mTableSize;
        this.mAlreadyTestedCandidates = new boolean[i12];
        this.mMaxColumns = i12;
        this.mMaxRows = i12;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i12);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    private int optimize(Row row, boolean z11) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i11 = 0; i11 < this.mNumColumns; i11++) {
            this.mAlreadyTestedCandidates[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i12++;
            if (i12 < this.mNumColumns * 2) {
                if (row.getKey() != null) {
                    this.mAlreadyTestedCandidates[row.getKey().f4251id] = true;
                }
                SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
                if (pivotCandidate != null) {
                    boolean[] zArr = this.mAlreadyTestedCandidates;
                    int i13 = pivotCandidate.f4251id;
                    if (!zArr[i13]) {
                        zArr[i13] = true;
                    }
                }
                if (pivotCandidate != null) {
                    float f11 = Float.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < this.mNumRows; i15++) {
                        ArrayRow arrayRow = this.mRows[i15];
                        if (arrayRow.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !arrayRow.mIsSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                            float f12 = arrayRow.variables.get(pivotCandidate);
                            if (f12 < 0.0f) {
                                float f13 = (-arrayRow.mConstantValue) / f12;
                                if (f13 < f11) {
                                    i14 = i15;
                                    f11 = f13;
                                }
                            }
                        }
                    }
                    if (i14 > -1) {
                        ArrayRow arrayRow2 = this.mRows[i14];
                        arrayRow2.mVariable.mDefinitionId = -1;
                        Metrics metrics3 = sMetrics;
                        if (metrics3 != null) {
                            metrics3.pivots++;
                        }
                        arrayRow2.pivot(pivotCandidate);
                        SolverVariable solverVariable = arrayRow2.mVariable;
                        solverVariable.mDefinitionId = i14;
                        solverVariable.updateReferencesWithNewDefinition(this, arrayRow2);
                    }
                } else {
                    z12 = true;
                }
            }
            return i12;
        }
        return i12;
    }

    private void releaseRows() {
        int i11 = 0;
        if (OPTIMIZED_ENGINE) {
            while (i11 < this.mNumRows) {
                ArrayRow arrayRow = this.mRows[i11];
                if (arrayRow != null) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.mNumRows) {
            ArrayRow arrayRow2 = this.mRows[i11];
            if (arrayRow2 != null) {
                this.mCache.mArrayRowPool.release(arrayRow2);
            }
            this.mRows[i11] = null;
            i11++;
        }
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f11, int i11) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable createObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable createObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable createObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable createObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable createObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable createObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable createObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable createObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow createRow = createRow();
        double d11 = f11;
        double d12 = i11;
        createRow.createRowWithAngle(createObjectVariable2, createObjectVariable4, createObjectVariable6, createObjectVariable8, (float) (Math.sin(d11) * d12));
        addConstraint(createRow);
        ArrayRow createRow2 = createRow();
        createRow2.createRowWithAngle(createObjectVariable, createObjectVariable3, createObjectVariable5, createObjectVariable7, (float) (Math.cos(d11) * d12));
        addConstraint(createRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, float f11, SolverVariable solverVariable3, SolverVariable solverVariable4, int i12, int i13) {
        ArrayRow createRow = createRow();
        createRow.createRowCentering(solverVariable, solverVariable2, i11, f11, solverVariable3, solverVariable4, i12);
        if (i13 != 8) {
            createRow.addError(this, i13);
        }
        addConstraint(createRow);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            goto La8
        L4:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L18
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r8.mIsSimpleDefinition
            if (r3 == 0) goto L18
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L18:
            int r0 = r7.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.mMaxRows
            if (r0 >= r4) goto L27
            int r0 = r7.mNumColumns
            int r0 = r0 + r3
            int r4 = r7.mMaxColumns
            if (r0 < r4) goto L2a
        L27:
            r7.increaseTableSize()
        L2a:
            boolean r0 = r8.mIsSimpleDefinition
            r4 = 0
            if (r0 != 0) goto La3
            r8.updateFromSystem(r7)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L3a
            goto La8
        L3a:
            r8.ensurePositiveConstant()
            boolean r0 = r8.chooseSubject(r7)
            if (r0 == 0) goto L9a
            androidx.constraintlayout.core.SolverVariable r0 = r7.createExtraVariable()
            r8.mVariable = r0
            int r5 = r7.mNumRows
            r7.addRow(r8)
            int r6 = r7.mNumRows
            int r5 = r5 + r3
            if (r6 != r5) goto L9a
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r4.initFromRow(r8)
            androidx.constraintlayout.core.LinearSystem$Row r4 = r7.mTempGoal
            r7.optimize(r4, r3)
            int r4 = r0.mDefinitionId
            r5 = -1
            if (r4 != r5) goto L9b
            androidx.constraintlayout.core.SolverVariable r4 = r8.mVariable
            if (r4 != r0) goto L78
            androidx.constraintlayout.core.SolverVariable r0 = r8.pickPivot(r0)
            if (r0 == 0) goto L78
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L75
            long r5 = r4.pivots
            long r5 = r5 + r1
            r4.pivots = r5
        L75:
            r8.pivot(r0)
        L78:
            boolean r0 = r8.mIsSimpleDefinition
            if (r0 != 0) goto L81
            androidx.constraintlayout.core.SolverVariable r0 = r8.mVariable
            r0.updateReferencesWithNewDefinition(r7, r8)
        L81:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L8d
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.mOptimizedArrayRowPool
            r0.release(r8)
            goto L94
        L8d:
            androidx.constraintlayout.core.Cache r0 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.mArrayRowPool
            r0.release(r8)
        L94:
            int r0 = r7.mNumRows
            int r0 = r0 - r3
            r7.mNumRows = r0
            goto L9b
        L9a:
            r3 = r4
        L9b:
            boolean r0 = r8.hasKeyVariable()
            if (r0 != 0) goto La2
            goto La8
        La2:
            r4 = r3
        La3:
            if (r4 != 0) goto La8
            r7.addRow(r8)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.LinearSystem.addConstraint(androidx.constraintlayout.core.ArrayRow):void");
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && i12 == 8 && solverVariable2.isFinalValue && solverVariable.mDefinitionId == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i11);
            return null;
        }
        ArrayRow createRow = createRow();
        createRow.createRowEquals(solverVariable, solverVariable2, i11);
        if (i12 != 8) {
            createRow.addError(this, i12);
        }
        addConstraint(createRow);
        return createRow;
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i11);
        addConstraint(createRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowGreaterThan(solverVariable, solverVariable2, createSlackVariable, i11);
        if (i12 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i12);
        }
        addConstraint(createRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, boolean z11) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i11);
        addConstraint(createRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i11, int i12) {
        ArrayRow createRow = createRow();
        SolverVariable createSlackVariable = createSlackVariable();
        createSlackVariable.strength = 0;
        createRow.createRowLowerThan(solverVariable, solverVariable2, createSlackVariable, i11);
        if (i12 != 8) {
            addSingleError(createRow, (int) (createRow.variables.get(createSlackVariable) * (-1.0f)), i12);
        }
        addConstraint(createRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f11, int i11) {
        ArrayRow createRow = createRow();
        createRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f11);
        if (i11 != 8) {
            createRow.addError(this, i11);
        }
        addConstraint(createRow);
    }

    public void addSingleError(ArrayRow arrayRow, int i11, int i12) {
        arrayRow.addSingleError(createErrorVariable(i12, null), i11);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i11) {
        if (solverVariable.mDefinitionId != -1 || i11 != 0) {
            addEquality(solverVariable, solverVariable2, i11, 8);
            return;
        }
        if (solverVariable2.mIsSynonym) {
            solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.mSynonym];
        }
        if (solverVariable.mIsSynonym) {
            SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.mSynonym];
        } else {
            solverVariable.setSynonym(this, solverVariable2, 0.0f);
        }
    }

    public final void cleanupRows() {
        int i11;
        int i12 = 0;
        while (i12 < this.mNumRows) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.mIsSimpleDefinition = true;
            }
            if (arrayRow.mIsSimpleDefinition) {
                SolverVariable solverVariable = arrayRow.mVariable;
                solverVariable.computedValue = arrayRow.mConstantValue;
                solverVariable.removeFromRow(arrayRow);
                int i13 = i12;
                while (true) {
                    i11 = this.mNumRows;
                    if (i13 >= i11 - 1) {
                        break;
                    }
                    ArrayRow[] arrayRowArr = this.mRows;
                    int i14 = i13 + 1;
                    arrayRowArr[i13] = arrayRowArr[i14];
                    i13 = i14;
                }
                this.mRows[i11 - 1] = null;
                this.mNumRows = i11 - 1;
                i12--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.mOptimizedArrayRowPool.release(arrayRow);
                } else {
                    this.mCache.mArrayRowPool.release(arrayRow);
                }
            }
            i12++;
        }
    }

    public SolverVariable createErrorVariable(int i11, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.ERROR, str);
        int i12 = this.mVariablesID + 1;
        this.mVariablesID = i12;
        this.mNumColumns++;
        acquireSolverVariable.f4251id = i12;
        acquireSolverVariable.strength = i11;
        this.mCache.mIndexedVariables[i12] = acquireSolverVariable;
        this.mGoal.addError(acquireSolverVariable);
        return acquireSolverVariable;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        acquireSolverVariable.f4251id = i11;
        this.mCache.mIndexedVariables[i11] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i11 = solverVariable.f4251id;
            if (i11 != -1 && i11 <= this.mVariablesID && this.mCache.mIndexedVariables[i11] != null) {
                return solverVariable;
            }
            if (i11 != -1) {
                solverVariable.reset();
            }
            int i12 = this.mVariablesID + 1;
            this.mVariablesID = i12;
            this.mNumColumns++;
            solverVariable.f4251id = i12;
            solverVariable.mType = SolverVariable.Type.UNRESTRICTED;
            this.mCache.mIndexedVariables[i12] = solverVariable;
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        ArrayRow acquire;
        if (OPTIMIZED_ENGINE) {
            acquire = this.mCache.mOptimizedArrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                acquire.reset();
            }
        } else {
            acquire = this.mCache.mArrayRowPool.acquire();
            if (acquire == null) {
                acquire = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                acquire.reset();
            }
        }
        SolverVariable.increaseErrorId();
        return acquire;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable acquireSolverVariable = acquireSolverVariable(SolverVariable.Type.SLACK, null);
        int i11 = this.mVariablesID + 1;
        this.mVariablesID = i11;
        this.mNumColumns++;
        acquireSolverVariable.f4251id = i11;
        this.mCache.mIndexedVariables[i11] = acquireSolverVariable;
        return acquireSolverVariable;
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String str = " num vars " + this.mVariablesID + "\n";
        for (int i11 = 0; i11 < this.mVariablesID + 1; i11++) {
            SolverVariable solverVariable = this.mCache.mIndexedVariables[i11];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i11 + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i12 = 0; i12 < this.mVariablesID + 1; i12++) {
            SolverVariable[] solverVariableArr = this.mCache.mIndexedVariables;
            SolverVariable solverVariable2 = solverVariableArr[i12];
            if (solverVariable2 != null && solverVariable2.mIsSynonym) {
                str2 = str2 + " ~[" + i12 + "] => " + solverVariable2 + " = " + solverVariableArr[solverVariable2.mSynonym] + " + " + solverVariable2.mSynonymDelta + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i13 = 0; i13 < this.mNumRows; i13++) {
            str3 = (str3 + this.mRows[i13].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str3 = str3 + "Goal: " + this.mGoal + "\n";
        }
        System.out.println(str3);
    }

    public void displaySystemInformation() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.mTableSize; i12++) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow != null) {
                i11 += arrayRow.sizeInBytes();
            }
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.mNumRows; i14++) {
            ArrayRow arrayRow2 = this.mRows[i14];
            if (arrayRow2 != null) {
                i13 += arrayRow2.sizeInBytes();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.mTableSize);
        sb2.append(" (");
        int i15 = this.mTableSize;
        sb2.append(getDisplaySize(i15 * i15));
        sb2.append(") -- row sizes: ");
        sb2.append(getDisplaySize(i11));
        sb2.append(", actual size: ");
        sb2.append(getDisplaySize(i13));
        sb2.append(" rows: ");
        sb2.append(this.mNumRows);
        sb2.append("/");
        sb2.append(this.mMaxRows);
        sb2.append(" cols: ");
        sb2.append(this.mNumColumns);
        sb2.append("/");
        sb2.append(this.mMaxColumns);
        sb2.append(" ");
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(getDisplaySize(0));
        printStream.println(sb2.toString());
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String str = "";
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            if (this.mRows[i11].mVariable.mType == SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i11].toReadableString()) + "\n";
            }
        }
        System.out.println(str + this.mGoal + "\n");
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public Cache getCache() {
        return this.mCache;
    }

    public Row getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.mNumRows; i12++) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow != null) {
                i11 += arrayRow.sizeInBytes();
            }
        }
        return i11;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public ArrayRow getRow(int i11) {
        return this.mRows[i11];
    }

    public float getValueFor(String str) {
        SolverVariable variable = getVariable(str, SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public SolverVariable getVariable(String str, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (!this.graphOptimizer && !this.newgraphOptimizer) {
            minimizeGoal(this.mGoal);
            return;
        }
        Metrics metrics2 = sMetrics;
        if (metrics2 != null) {
            metrics2.graphOptimizer++;
        }
        for (int i11 = 0; i11 < this.mNumRows; i11++) {
            if (!this.mRows[i11].mIsSimpleDefinition) {
                minimizeGoal(this.mGoal);
                return;
            }
        }
        Metrics metrics3 = sMetrics;
        if (metrics3 != null) {
            metrics3.fullySolved++;
        }
        computeValues();
    }

    public void minimizeGoal(Row row) throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.mNumColumns);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i11;
        if (!arrayRow.mIsSimpleDefinition || (solverVariable = arrayRow.mVariable) == null) {
            return;
        }
        int i12 = solverVariable.mDefinitionId;
        if (i12 != -1) {
            while (true) {
                i11 = this.mNumRows;
                if (i12 >= i11 - 1) {
                    break;
                }
                ArrayRow[] arrayRowArr = this.mRows;
                int i13 = i12 + 1;
                ArrayRow arrayRow2 = arrayRowArr[i13];
                SolverVariable solverVariable2 = arrayRow2.mVariable;
                if (solverVariable2.mDefinitionId == i13) {
                    solverVariable2.mDefinitionId = i12;
                }
                arrayRowArr[i12] = arrayRow2;
                i12 = i13;
            }
            this.mNumRows = i11 - 1;
        }
        SolverVariable solverVariable3 = arrayRow.mVariable;
        if (!solverVariable3.isFinalValue) {
            solverVariable3.setFinalValue(this, arrayRow.mConstantValue);
        }
        if (OPTIMIZED_ENGINE) {
            this.mCache.mOptimizedArrayRowPool.release(arrayRow);
        } else {
            this.mCache.mArrayRowPool.release(arrayRow);
        }
    }

    public void reset() {
        Cache cache;
        int i11 = 0;
        while (true) {
            cache = this.mCache;
            SolverVariable[] solverVariableArr = cache.mIndexedVariables;
            if (i11 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i11];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i11++;
        }
        cache.mSolverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.mVariables;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i12 = 0; i12 < this.mNumRows; i12++) {
            ArrayRow arrayRow = this.mRows[i12];
            if (arrayRow != null) {
                arrayRow.mUsed = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    public void addEquality(SolverVariable solverVariable, int i11) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && solverVariable.mDefinitionId == -1) {
            float f11 = i11;
            solverVariable.setFinalValue(this, f11);
            for (int i12 = 0; i12 < this.mVariablesID + 1; i12++) {
                SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i12];
                if (solverVariable2 != null && solverVariable2.mIsSynonym && solverVariable2.mSynonym == solverVariable.f4251id) {
                    solverVariable2.setFinalValue(this, solverVariable2.mSynonymDelta + f11);
                }
            }
            return;
        }
        int i13 = solverVariable.mDefinitionId;
        if (i13 != -1) {
            ArrayRow arrayRow = this.mRows[i13];
            if (arrayRow.mIsSimpleDefinition) {
                arrayRow.mConstantValue = i11;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.mIsSimpleDefinition = true;
                arrayRow.mConstantValue = i11;
                return;
            } else {
                ArrayRow createRow = createRow();
                createRow.createRowEquals(solverVariable, i11);
                addConstraint(createRow);
                return;
            }
        }
        ArrayRow createRow2 = createRow();
        createRow2.createRowDefinition(solverVariable, i11);
        addConstraint(createRow2);
    }
}
