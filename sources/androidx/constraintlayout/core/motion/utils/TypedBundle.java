package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class TypedBundle {
    private static final int INITIAL_BOOLEAN = 4;
    private static final int INITIAL_FLOAT = 10;
    private static final int INITIAL_INT = 10;
    private static final int INITIAL_STRING = 5;
    int[] mTypeInt = new int[10];
    int[] mValueInt = new int[10];
    int mCountInt = 0;
    int[] mTypeFloat = new int[10];
    float[] mValueFloat = new float[10];
    int mCountFloat = 0;
    int[] mTypeString = new int[5];
    String[] mValueString = new String[5];
    int mCountString = 0;
    int[] mTypeBoolean = new int[4];
    boolean[] mValueBoolean = new boolean[4];
    int mCountBoolean = 0;

    public void add(int i11, int i12) {
        int i13 = this.mCountInt;
        int[] iArr = this.mTypeInt;
        if (i13 >= iArr.length) {
            this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.mValueInt;
            this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.mTypeInt;
        int i14 = this.mCountInt;
        iArr3[i14] = i11;
        int[] iArr4 = this.mValueInt;
        this.mCountInt = i14 + 1;
        iArr4[i14] = i12;
    }

    public void addIfNotNull(int i11, String str) {
        if (str != null) {
            add(i11, str);
        }
    }

    public void applyDelta(TypedValues typedValues) {
        for (int i11 = 0; i11 < this.mCountInt; i11++) {
            typedValues.setValue(this.mTypeInt[i11], this.mValueInt[i11]);
        }
        for (int i12 = 0; i12 < this.mCountFloat; i12++) {
            typedValues.setValue(this.mTypeFloat[i12], this.mValueFloat[i12]);
        }
        for (int i13 = 0; i13 < this.mCountString; i13++) {
            typedValues.setValue(this.mTypeString[i13], this.mValueString[i13]);
        }
        for (int i14 = 0; i14 < this.mCountBoolean; i14++) {
            typedValues.setValue(this.mTypeBoolean[i14], this.mValueBoolean[i14]);
        }
    }

    public void clear() {
        this.mCountBoolean = 0;
        this.mCountString = 0;
        this.mCountFloat = 0;
        this.mCountInt = 0;
    }

    public int getInteger(int i11) {
        for (int i12 = 0; i12 < this.mCountInt; i12++) {
            if (this.mTypeInt[i12] == i11) {
                return this.mValueInt[i12];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.mCountInt + ", mCountFloat=" + this.mCountFloat + ", mCountString=" + this.mCountString + ", mCountBoolean=" + this.mCountBoolean + b.f69928j;
    }

    public void add(int i11, float f11) {
        int i12 = this.mCountFloat;
        int[] iArr = this.mTypeFloat;
        if (i12 >= iArr.length) {
            this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValueFloat;
            this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTypeFloat;
        int i13 = this.mCountFloat;
        iArr2[i13] = i11;
        float[] fArr2 = this.mValueFloat;
        this.mCountFloat = i13 + 1;
        fArr2[i13] = f11;
    }

    public void applyDelta(TypedBundle typedBundle) {
        for (int i11 = 0; i11 < this.mCountInt; i11++) {
            typedBundle.add(this.mTypeInt[i11], this.mValueInt[i11]);
        }
        for (int i12 = 0; i12 < this.mCountFloat; i12++) {
            typedBundle.add(this.mTypeFloat[i12], this.mValueFloat[i12]);
        }
        for (int i13 = 0; i13 < this.mCountString; i13++) {
            typedBundle.add(this.mTypeString[i13], this.mValueString[i13]);
        }
        for (int i14 = 0; i14 < this.mCountBoolean; i14++) {
            typedBundle.add(this.mTypeBoolean[i14], this.mValueBoolean[i14]);
        }
    }

    public void add(int i11, String str) {
        int i12 = this.mCountString;
        int[] iArr = this.mTypeString;
        if (i12 >= iArr.length) {
            this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.mValueString;
            this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.mTypeString;
        int i13 = this.mCountString;
        iArr2[i13] = i11;
        String[] strArr2 = this.mValueString;
        this.mCountString = i13 + 1;
        strArr2[i13] = str;
    }

    public void add(int i11, boolean z11) {
        int i12 = this.mCountBoolean;
        int[] iArr = this.mTypeBoolean;
        if (i12 >= iArr.length) {
            this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.mValueBoolean;
            this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.mTypeBoolean;
        int i13 = this.mCountBoolean;
        iArr2[i13] = i11;
        boolean[] zArr2 = this.mValueBoolean;
        this.mCountBoolean = i13 + 1;
        zArr2[i13] = z11;
    }
}
