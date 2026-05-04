package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyFrameArray {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i11, CustomAttribute customAttribute) {
            if (this.mValues[i11] != null) {
                remove(i11);
            }
            this.mValues[i11] = customAttribute;
            int[] iArr = this.mKeys;
            int i12 = this.mCount;
            this.mCount = i12 + 1;
            iArr[i12] = i11;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i11 = 0;
            while (i11 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 == 0 ? "" : j2.O);
                sb2.append(valueAt(i11));
                printStream.print(sb2.toString());
                i11++;
            }
            System.out.println("]");
        }

        public int keyAt(int i11) {
            return this.mKeys[i11];
        }

        public void remove(int i11) {
            this.mValues[i11] = null;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.mCount;
                if (i12 >= i14) {
                    this.mCount = i14 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i11 == iArr[i12]) {
                    iArr[i12] = 999;
                    i13++;
                }
                if (i12 != i13) {
                    iArr[i12] = iArr[i13];
                }
                i13++;
                i12++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i11) {
            return this.mValues[this.mKeys[i11]];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i11, CustomVariable customVariable) {
            if (this.mValues[i11] != null) {
                remove(i11);
            }
            this.mValues[i11] = customVariable;
            int[] iArr = this.mKeys;
            int i12 = this.mCount;
            this.mCount = i12 + 1;
            iArr[i12] = i11;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i11 = 0;
            while (i11 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 == 0 ? "" : j2.O);
                sb2.append(valueAt(i11));
                printStream.print(sb2.toString());
                i11++;
            }
            System.out.println("]");
        }

        public int keyAt(int i11) {
            return this.mKeys[i11];
        }

        public void remove(int i11) {
            this.mValues[i11] = null;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.mCount;
                if (i12 >= i14) {
                    this.mCount = i14 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i11 == iArr[i12]) {
                    iArr[i12] = 999;
                    i13++;
                }
                if (i12 != i13) {
                    iArr[i12] = iArr[i13];
                }
                i13++;
                i12++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i11) {
            return this.mValues[this.mKeys[i11]];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        float[][] mValues = new float[101][];

        public FloatArray() {
            clear();
        }

        public void append(int i11, float[] fArr) {
            if (this.mValues[i11] != null) {
                remove(i11);
            }
            this.mValues[i11] = fArr;
            int[] iArr = this.mKeys;
            int i12 = this.mCount;
            this.mCount = i12 + 1;
            iArr[i12] = i11;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, 999);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            System.out.print("K: [");
            int i11 = 0;
            while (i11 < this.mCount) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 == 0 ? "" : j2.O);
                sb2.append(Arrays.toString(valueAt(i11)));
                printStream.print(sb2.toString());
                i11++;
            }
            System.out.println("]");
        }

        public int keyAt(int i11) {
            return this.mKeys[i11];
        }

        public void remove(int i11) {
            this.mValues[i11] = null;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.mCount;
                if (i12 >= i14) {
                    this.mCount = i14 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i11 == iArr[i12]) {
                    iArr[i12] = 999;
                    i13++;
                }
                if (i12 != i13) {
                    iArr[i12] = iArr[i13];
                }
                i13++;
                i12++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i11) {
            return this.mValues[this.mKeys[i11]];
        }
    }
}
