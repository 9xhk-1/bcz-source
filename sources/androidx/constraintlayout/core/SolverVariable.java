package androidx.constraintlayout.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;

    /* renamed from: id, reason: collision with root package name */
    public int f4251id;
    public boolean inGoal;
    public boolean isFinalValue;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    int mDefinitionId;
    float[] mGoalStrengthVector;
    HashSet<ArrayRow> mInRows;
    boolean mIsSynonym;
    private String mName;
    float[] mStrengthVector;
    int mSynonym;
    float mSynonymDelta;
    Type mType;
    public int strength;
    public int usageInRowCount;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.f4251id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            return str + sUniqueErrorId;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("U");
            int i11 = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i11;
            sb2.append(i11);
            return sb2.toString();
        }
        if (ordinal == 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("C");
            int i12 = sUniqueConstantId + 1;
            sUniqueConstantId = i12;
            sb3.append(i12);
            return sb3.toString();
        }
        if (ordinal == 2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(ExifInterface.LATITUDE_SOUTH);
            int i13 = sUniqueSlackId + 1;
            sUniqueSlackId = i13;
            sb4.append(i13);
            return sb4.toString();
        }
        if (ordinal == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("e");
            int i14 = sUniqueErrorId + 1;
            sUniqueErrorId = i14;
            sb5.append(i14);
            return sb5.toString();
        }
        if (ordinal != 4) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        int i15 = sUniqueId + 1;
        sUniqueId = i15;
        sb6.append(i15);
        return sb6.toString();
    }

    public static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i11 = 0;
        while (true) {
            int i12 = this.mClientEquationsCount;
            if (i11 >= i12) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i12 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i13 = this.mClientEquationsCount;
                arrayRowArr2[i13] = arrayRow;
                this.mClientEquationsCount = i13 + 1;
                return;
            }
            if (this.mClientEquations[i11] == arrayRow) {
                return;
            } else {
                i11++;
            }
        }
    }

    public void clearStrengths() {
        for (int i11 = 0; i11 < 9; i11++) {
            this.mStrengthVector[i11] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i11 = this.mClientEquationsCount;
        int i12 = 0;
        while (i12 < i11) {
            if (this.mClientEquations[i12] == arrayRow) {
                while (i12 < i11 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i13 = i12 + 1;
                    arrayRowArr[i12] = arrayRowArr[i13];
                    i12 = i13;
                }
                this.mClientEquationsCount--;
                return;
            }
            i12++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f4251id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i11 = this.mClientEquationsCount;
        for (int i12 = 0; i12 < i11; i12++) {
            this.mClientEquations[i12] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f11) {
        this.computedValue = f11;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i11 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.mClientEquations[i12].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f11) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.f4251id;
        this.mSynonymDelta = f11;
        int i11 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.mClientEquations[i12].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String str = this + "[";
        boolean z11 = false;
        boolean z12 = true;
        for (int i11 = 0; i11 < this.mStrengthVector.length; i11++) {
            String str2 = str + this.mStrengthVector[i11];
            float[] fArr = this.mStrengthVector;
            float f11 = fArr[i11];
            if (f11 > 0.0f) {
                z11 = false;
            } else if (f11 < 0.0f) {
                z11 = true;
            }
            if (f11 != 0.0f) {
                z12 = false;
            }
            str = i11 < fArr.length - 1 ? str2 + j2.O : str2 + "] ";
        }
        if (z11) {
            str = str + " (-)";
        }
        if (!z12) {
            return str;
        }
        return str + " (*)";
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.f4251id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i11 = this.mClientEquationsCount;
        for (int i12 = 0; i12 < i11; i12++) {
            this.mClientEquations[i12].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.f4251id - solverVariable.f4251id;
    }

    public SolverVariable(Type type, String str) {
        this.f4251id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }
}
