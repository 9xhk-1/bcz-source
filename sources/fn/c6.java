package fn;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f52096a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final double f52097b = 3.0d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        public int f52098a = -1;

        /* renamed from: b, reason: collision with root package name */
        public double f52099b = -1.0d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Double.valueOf(this.f52099b).compareTo(Double.valueOf(aVar.f52099b));
        }
    }

    public static Map<Integer, Integer> a(int[] iArr, int[] iArr2, int i11) {
        boolean z11;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        x5 x5Var = new x5();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            z11 = true;
            if (i12 >= iArr.length) {
                break;
            }
            int i14 = iArr[i12];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i14));
            if (num == null) {
                dArr3[i13] = x5Var.c(i14);
                iArr3[i13] = i14;
                i13++;
                linkedHashMap.put(Integer.valueOf(i14), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i14), Integer.valueOf(num.intValue() + 1));
            }
            i12++;
        }
        int[] iArr4 = new int[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            iArr4[i15] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i15]))).intValue();
        }
        int min = Math.min(i11, i13);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr4 = new double[min][];
        int i16 = 0;
        for (int i17 = 0; i17 < iArr2.length; i17++) {
            dArr4[i17] = x5Var.c(iArr2[i17]);
            i16++;
        }
        int i18 = min - i16;
        if (i18 > 0) {
            for (int i19 = 0; i19 < i18; i19++) {
            }
        }
        int[] iArr5 = new int[i13];
        for (int i21 = 0; i21 < i13; i21++) {
            iArr5[i21] = random.nextInt(min);
        }
        int[][] iArr6 = new int[min][];
        for (int i22 = 0; i22 < min; i22++) {
            iArr6[i22] = new int[min];
        }
        a[][] aVarArr = new a[min][];
        for (int i23 = 0; i23 < min; i23++) {
            aVarArr[i23] = new a[min];
            for (int i24 = 0; i24 < min; i24++) {
                aVarArr[i23][i24] = new a();
            }
        }
        int[] iArr7 = new int[min];
        int i25 = 0;
        while (i25 < 10) {
            int i26 = 0;
            while (i26 < min) {
                int i27 = i26 + 1;
                int i28 = i27;
                while (i28 < min) {
                    int[] iArr8 = iArr4;
                    double b11 = x5Var.b(dArr4[i26], dArr4[i28]);
                    a aVar = aVarArr[i28][i26];
                    aVar.f52099b = b11;
                    aVar.f52098a = i26;
                    a aVar2 = aVarArr[i26][i28];
                    aVar2.f52099b = b11;
                    aVar2.f52098a = i28;
                    i28++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    z11 = z11;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                boolean z12 = z11;
                Arrays.sort(aVarArr[i26]);
                for (int i29 = 0; i29 < min; i29++) {
                    iArr6[i26][i29] = aVarArr[i26][i29].f52098a;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i26 = i27;
                z11 = z12;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            boolean z13 = z11;
            int i31 = 0;
            int i32 = 0;
            while (i31 < i13) {
                double[] dArr5 = dArr3[i31];
                int i33 = iArr12[i31];
                double b12 = x5Var.b(dArr5, dArr4[i33]);
                int i34 = i31;
                double d11 = b12;
                int i35 = -1;
                int i36 = 0;
                while (i36 < min) {
                    int i37 = i32;
                    int[][] iArr13 = iArr6;
                    if (aVarArr[i33][i36].f52099b < 4.0d * b12) {
                        double b13 = x5Var.b(dArr5, dArr4[i36]);
                        if (b13 < d11) {
                            d11 = b13;
                            i35 = i36;
                        }
                    }
                    i36++;
                    iArr6 = iArr13;
                    i32 = i37;
                }
                int i38 = i32;
                int[][] iArr14 = iArr6;
                if (i35 == -1 || Math.abs(Math.sqrt(d11) - Math.sqrt(b12)) <= 3.0d) {
                    i32 = i38;
                } else {
                    i32 = i38 + 1;
                    iArr12[i34] = i35;
                }
                i31 = i34 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i32 == 0 && i25 != 0) {
                break;
            }
            double[] dArr6 = new double[min];
            double[] dArr7 = new double[min];
            double[] dArr8 = new double[min];
            boolean z14 = false;
            Arrays.fill(iArr7, 0);
            int i39 = 0;
            while (i39 < i13) {
                int i41 = iArr12[i39];
                double[] dArr9 = dArr3[i39];
                boolean z15 = z14;
                int i42 = iArr11[i39];
                iArr7[i41] = iArr7[i41] + i42;
                double d12 = i42;
                dArr6[i41] = dArr6[i41] + (dArr9[z15 ? 1 : 0] * d12);
                dArr7[i41] = dArr7[i41] + (dArr9[z13 ? 1 : 0] * d12);
                dArr8[i41] = dArr8[i41] + (dArr9[2] * d12);
                i39++;
                z14 = false;
            }
            int i43 = 0;
            while (i43 < min) {
                int i44 = iArr7[i43];
                if (i44 == 0) {
                    dArr4[i43] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d13 = dArr6[i43];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d14 = i44;
                    double d15 = d13 / d14;
                    double d16 = dArr2[i43] / d14;
                    double d17 = dArr8[i43] / d14;
                    double[] dArr10 = dArr4[i43];
                    dArr10[0] = d15;
                    dArr10[z13 ? 1 : 0] = d16;
                    dArr10[2] = d17;
                }
                i43++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i25++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            z11 = z13 ? 1 : 0;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i45 = 0; i45 < min; i45++) {
            int i46 = iArr7[i45];
            if (i46 != 0) {
                int a11 = x5Var.a(dArr4[i45]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(a11))) {
                    linkedHashMap2.put(Integer.valueOf(a11), Integer.valueOf(i46));
                }
            }
        }
        return linkedHashMap2;
    }
}
