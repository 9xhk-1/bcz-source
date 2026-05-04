package ro;

import com.google.common.base.Preconditions;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import ho.o0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84443a = 8;

    /* renamed from: b, reason: collision with root package name */
    @go.c
    public static final Pattern f84444b = j();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final double[] f84445a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84446b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84447c;

        public a(double[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Double.valueOf(this.f84445a[this.f84446b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double set(int index, Double element) {
            Preconditions.checkElementIndex(index, size());
            double[] dArr = this.f84445a;
            int i11 = this.f84446b;
            double d11 = dArr[i11 + index];
            dArr[i11 + index] = ((Double) Preconditions.checkNotNull(element)).doubleValue();
            return Double.valueOf(d11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Double) && d.m(this.f84445a, ((Double) target).doubleValue(), this.f84446b, this.f84447c) != -1;
        }

        public double[] d() {
            return Arrays.copyOfRange(this.f84445a, this.f84446b, this.f84447c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof a)) {
                return super.equals(object);
            }
            a aVar = (a) object;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f84445a[this.f84446b + i11] != aVar.f84445a[aVar.f84446b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84446b; i12 < this.f84447c; i12++) {
                i11 = (i11 * 31) + d.k(this.f84445a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int m11;
            if (!(target instanceof Double) || (m11 = d.m(this.f84445a, ((Double) target).doubleValue(), this.f84446b, this.f84447c)) < 0) {
                return -1;
            }
            return m11 - this.f84446b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int r11;
            if (!(target instanceof Double) || (r11 = d.r(this.f84445a, ((Double) target).doubleValue(), this.f84446b, this.f84447c)) < 0) {
                return -1;
            }
            return r11 - this.f84446b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84447c - this.f84446b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.f84445a;
            int i11 = this.f84446b;
            return new a(dArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f84445a[this.f84446b]);
            int i11 = this.f84446b;
            while (true) {
                i11++;
                if (i11 >= this.f84447c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append(this.f84445a[i11]);
            }
        }

        public a(double[] array, int start, int end) {
            this.f84445a = array;
            this.f84446b = start;
            this.f84447c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ho.h<String, Double> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final ho.h<String, Double> f84448c = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f84448c;
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(Double value) {
            return value.toString();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Double h(String value) {
            return Double.valueOf(value);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(double[] left, double[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Double.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    public static void A(double[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static ho.h<String, Double> B() {
        return b.f84448c;
    }

    public static double[] C(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).doubleValue();
        }
        return dArr;
    }

    @go.c
    @CheckForNull
    public static Double D(String string) {
        if (!f84444b.matcher(string).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<Double> c(double... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    @uo.l(replacement = "Double.compare(a, b)")
    public static int e(double a11, double b11) {
        return Double.compare(a11, b11);
    }

    public static double[] f(double[]... arrays) {
        long j11 = 0;
        for (double[] dArr : arrays) {
            j11 += dArr.length;
        }
        double[] dArr2 = new double[d(j11)];
        int i11 = 0;
        for (double[] dArr3 : arrays) {
            System.arraycopy(dArr3, 0, dArr2, i11, dArr3.length);
            i11 += dArr3.length;
        }
        return dArr2;
    }

    public static double g(double value, double min, double max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(o0.e("min (%s) must be less than or equal to max (%s)", Double.valueOf(min), Double.valueOf(max)));
    }

    public static boolean h(double[] array, double target) {
        for (double d11 : array) {
            if (d11 == target) {
                return true;
            }
        }
        return false;
    }

    public static double[] i(double[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @go.c
    public static Pattern j() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + pn.j.f81007d).replace("#", "+"));
    }

    public static int k(double value) {
        return Double.valueOf(value).hashCode();
    }

    public static int l(double[] array, double target) {
        return m(array, target, 0, array.length);
    }

    public static int m(double[] array, double target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n(double[] r7, double[] r8) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.d.n(double[], double[]):int");
    }

    public static boolean o(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }

    public static String p(String separator, double... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 12);
        sb2.append(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(array[i11]);
        }
        return sb2.toString();
    }

    public static int q(double[] array, double target) {
        return r(array, target, 0, array.length);
    }

    public static int r(double[] array, double target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<double[]> s() {
        return c.INSTANCE;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double t(double... array) {
        Preconditions.checkArgument(array.length > 0);
        double d11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            d11 = Math.max(d11, array[i11]);
        }
        return d11;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double u(double... array) {
        Preconditions.checkArgument(array.length > 0);
        double d11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            d11 = Math.min(d11, array[i11]);
        }
        return d11;
    }

    public static void v(double[] array) {
        Preconditions.checkNotNull(array);
        w(array, 0, array.length);
    }

    public static void w(double[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            double d11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = d11;
            fromIndex++;
        }
    }

    public static void x(double[] array, int distance) {
        y(array, distance, 0, array.length);
    }

    public static void y(double[] array, int distance, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        if (array.length <= 1) {
            return;
        }
        int i11 = toIndex - fromIndex;
        int i12 = (-distance) % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        int i13 = i12 + fromIndex;
        if (i13 == fromIndex) {
            return;
        }
        w(array, fromIndex, i13);
        w(array, i13, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static void z(double[] array) {
        Preconditions.checkNotNull(array);
        A(array, 0, array.length);
    }
}
