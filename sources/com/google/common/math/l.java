package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.d
@go.c
/* loaded from: classes7.dex */
public final class l {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f34351a;

        public c a(int index) {
            return new c(this.f34351a, index);
        }

        public d b(Collection<Integer> indexes) {
            return new d(this.f34351a, ro.i.E(indexes));
        }

        public d c(int... indexes) {
            return new d(this.f34351a, (int[]) indexes.clone());
        }

        public b(int scale) {
            Preconditions.checkArgument(scale > 0, "Quantile scale must be positive");
            this.f34351a = scale;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f34352a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34353b;

        public double a(Collection<? extends Number> dataset) {
            return e(ro.d.C(dataset));
        }

        public double b(double... dataset) {
            return e((double[]) dataset.clone());
        }

        public double c(int... dataset) {
            return e(l.l(dataset));
        }

        public double d(long... dataset) {
            return e(l.m(dataset));
        }

        public double e(double... dataset) {
            Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (l.j(dataset)) {
                return Double.NaN;
            }
            long length = this.f34353b * (dataset.length - 1);
            int g11 = (int) h.g(length, this.f34352a, RoundingMode.DOWN);
            int i11 = (int) (length - (g11 * this.f34352a));
            l.u(g11, dataset, 0, dataset.length - 1);
            if (i11 == 0) {
                return dataset[g11];
            }
            int i12 = g11 + 1;
            l.u(i12, dataset, i12, dataset.length - 1);
            return l.k(dataset[g11], dataset[i12], i11, this.f34352a);
        }

        public c(int scale, int index) {
            l.h(index, scale);
            this.f34352a = scale;
            this.f34353b = index;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f34354a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f34355b;

        public Map<Integer, Double> a(Collection<? extends Number> dataset) {
            return e(ro.d.C(dataset));
        }

        public Map<Integer, Double> b(double... dataset) {
            return e((double[]) dataset.clone());
        }

        public Map<Integer, Double> c(int... dataset) {
            return e(l.l(dataset));
        }

        public Map<Integer, Double> d(long... dataset) {
            return e(l.m(dataset));
        }

        public Map<Integer, Double> e(double... dataset) {
            int i11 = 0;
            Preconditions.checkArgument(dataset.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (l.j(dataset)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.f34355b;
                int length = iArr.length;
                while (i11 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i11]), Double.valueOf(Double.NaN));
                    i11++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.f34355b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= this.f34355b.length) {
                    break;
                }
                long length2 = r6[i12] * (dataset.length - 1);
                int g11 = (int) h.g(length2, this.f34354a, RoundingMode.DOWN);
                int i14 = (int) (length2 - (g11 * this.f34354a));
                iArr3[i12] = g11;
                iArr4[i12] = i14;
                iArr5[i13] = g11;
                int i15 = i13 + 1;
                if (i14 != 0) {
                    iArr5[i15] = g11 + 1;
                    i13 += 2;
                } else {
                    i13 = i15;
                }
                i12++;
            }
            Arrays.sort(iArr5, 0, i13);
            l.t(iArr5, 0, i13 - 1, dataset, 0, dataset.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr6 = this.f34355b;
                if (i11 >= iArr6.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i16 = iArr3[i11];
                int i17 = iArr4[i11];
                if (i17 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i11]), Double.valueOf(dataset[i16]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i11]), Double.valueOf(l.k(dataset[i16], dataset[i16 + 1], i17, this.f34354a)));
                }
                i11++;
            }
        }

        public d(int scale, int[] indexes) {
            for (int i11 : indexes) {
                l.h(i11, scale);
            }
            Preconditions.checkArgument(indexes.length > 0, "Indexes must be a non empty array");
            this.f34354a = scale;
            this.f34355b = indexes;
        }
    }

    public static void h(int index, int scale) {
        if (index < 0 || index > scale) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + scale);
        }
    }

    public static int i(int[] allRequired, int requiredFrom, int requiredTo, int from, int to2) {
        if (requiredFrom == requiredTo) {
            return requiredFrom;
        }
        int i11 = from + to2;
        int i12 = i11 >>> 1;
        while (requiredTo > requiredFrom + 1) {
            int i13 = (requiredFrom + requiredTo) >>> 1;
            int i14 = allRequired[i13];
            if (i14 > i12) {
                requiredTo = i13;
            } else {
                if (i14 >= i12) {
                    return i13;
                }
                requiredFrom = i13;
            }
        }
        return (i11 - allRequired[requiredFrom]) - allRequired[requiredTo] > 0 ? requiredTo : requiredFrom;
    }

    public static boolean j(double... dataset) {
        for (double d11 : dataset) {
            if (Double.isNaN(d11)) {
                return true;
            }
        }
        return false;
    }

    public static double k(double lower, double upper, double remainder, double scale) {
        if (lower == Double.NEGATIVE_INFINITY) {
            return upper == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (upper == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return lower + (((upper - lower) * remainder) / scale);
    }

    public static double[] l(int[] ints) {
        int length = ints.length;
        double[] dArr = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr[i11] = ints[i11];
        }
        return dArr;
    }

    public static double[] m(long[] longs) {
        int length = longs.length;
        double[] dArr = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr[i11] = longs[i11];
        }
        return dArr;
    }

    public static c n() {
        return s(2).a(1);
    }

    public static void o(double[] array, int from, int to2) {
        int i11 = (from + to2) >>> 1;
        double d11 = array[to2];
        double d12 = array[i11];
        boolean z11 = d11 < d12;
        double d13 = array[from];
        boolean z12 = d12 < d13;
        boolean z13 = d11 < d13;
        if (z11 == z12) {
            v(array, i11, from);
        } else if (z11 != z13) {
            v(array, from, to2);
        }
    }

    public static int p(double[] array, int from, int to2) {
        o(array, from, to2);
        double d11 = array[from];
        int i11 = to2;
        while (to2 > from) {
            if (array[to2] > d11) {
                v(array, i11, to2);
                i11--;
            }
            to2--;
        }
        v(array, from, i11);
        return i11;
    }

    public static b q() {
        return s(100);
    }

    public static b r() {
        return s(4);
    }

    public static b s(int scale) {
        return new b(scale);
    }

    public static void t(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to2) {
        int i11 = i(allRequired, requiredFrom, requiredTo, from, to2);
        int i12 = allRequired[i11];
        u(i12, array, from, to2);
        int i13 = i11 - 1;
        while (i13 >= requiredFrom && allRequired[i13] == i12) {
            i13--;
        }
        if (i13 >= requiredFrom) {
            t(allRequired, requiredFrom, i13, array, from, i12 - 1);
        }
        int i14 = i11 + 1;
        while (i14 <= requiredTo && allRequired[i14] == i12) {
            i14++;
        }
        if (i14 <= requiredTo) {
            t(allRequired, i14, requiredTo, array, i12 + 1, to2);
        }
    }

    public static void u(int required, double[] array, int from, int to2) {
        if (required != from) {
            while (to2 > from) {
                int p11 = p(array, from, to2);
                if (p11 >= required) {
                    to2 = p11 - 1;
                }
                if (p11 <= required) {
                    from = p11 + 1;
                }
            }
            return;
        }
        int i11 = from;
        for (int i12 = from + 1; i12 <= to2; i12++) {
            if (array[i11] > array[i12]) {
                i11 = i12;
            }
        }
        if (i11 != from) {
            v(array, i11, from);
        }
    }

    public static void v(double[] array, int i11, int j11) {
        double d11 = array[i11];
        array[i11] = array[j11];
        array[j11] = d11;
    }
}
