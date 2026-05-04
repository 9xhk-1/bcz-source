package ro;

import com.google.common.base.Preconditions;
import ho.o0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84451a = 4;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final float[] f84452a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84453b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84454c;

        public a(float[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Float.valueOf(this.f84452a[this.f84453b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float set(int index, Float element) {
            Preconditions.checkElementIndex(index, size());
            float[] fArr = this.f84452a;
            int i11 = this.f84453b;
            float f11 = fArr[i11 + index];
            fArr[i11 + index] = ((Float) Preconditions.checkNotNull(element)).floatValue();
            return Float.valueOf(f11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Float) && g.l(this.f84452a, ((Float) target).floatValue(), this.f84453b, this.f84454c) != -1;
        }

        public float[] d() {
            return Arrays.copyOfRange(this.f84452a, this.f84453b, this.f84454c);
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
                if (this.f84452a[this.f84453b + i11] != aVar.f84452a[aVar.f84453b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84453b; i12 < this.f84454c; i12++) {
                i11 = (i11 * 31) + g.j(this.f84452a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int l11;
            if (!(target instanceof Float) || (l11 = g.l(this.f84452a, ((Float) target).floatValue(), this.f84453b, this.f84454c)) < 0) {
                return -1;
            }
            return l11 - this.f84453b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int q11;
            if (!(target instanceof Float) || (q11 = g.q(this.f84452a, ((Float) target).floatValue(), this.f84453b, this.f84454c)) < 0) {
                return -1;
            }
            return q11 - this.f84453b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84454c - this.f84453b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.f84452a;
            int i11 = this.f84453b;
            return new a(fArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f84452a[this.f84453b]);
            int i11 = this.f84453b;
            while (true) {
                i11++;
                if (i11 >= this.f84454c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append(this.f84452a[i11]);
            }
        }

        public a(float[] array, int start, int end) {
            this.f84452a = array;
            this.f84453b = start;
            this.f84454c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ho.h<String, Float> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final ho.h<String, Float> f84455c = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f84455c;
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(Float value) {
            return value.toString();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Float h(String value) {
            return Float.valueOf(value);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(float[] left, float[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Float.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    public static ho.h<String, Float> A() {
        return b.f84455c;
    }

    public static float[] B(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < length; i11++) {
            fArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).floatValue();
        }
        return fArr;
    }

    @go.c
    @CheckForNull
    public static Float C(String string) {
        if (!d.f84444b.matcher(string).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static List<Float> c(float... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    @uo.l(replacement = "Float.compare(a, b)")
    public static int e(float a11, float b11) {
        return Float.compare(a11, b11);
    }

    public static float[] f(float[]... arrays) {
        long j11 = 0;
        for (float[] fArr : arrays) {
            j11 += fArr.length;
        }
        float[] fArr2 = new float[d(j11)];
        int i11 = 0;
        for (float[] fArr3 : arrays) {
            System.arraycopy(fArr3, 0, fArr2, i11, fArr3.length);
            i11 += fArr3.length;
        }
        return fArr2;
    }

    public static float g(float value, float min, float max) {
        if (min <= max) {
            return Math.min(Math.max(value, min), max);
        }
        throw new IllegalArgumentException(o0.e("min (%s) must be less than or equal to max (%s)", Float.valueOf(min), Float.valueOf(max)));
    }

    public static boolean h(float[] array, float target) {
        for (float f11 : array) {
            if (f11 == target) {
                return true;
            }
        }
        return false;
    }

    public static float[] i(float[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int j(float value) {
        return Float.valueOf(value).hashCode();
    }

    public static int k(float[] array, float target) {
        return l(array, target, 0, array.length);
    }

    public static int l(float[] array, float target, int start, int end) {
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
    public static int m(float[] r5, float[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.g.m(float[], float[]):int");
    }

    public static boolean n(float value) {
        return Float.NEGATIVE_INFINITY < value && value < Float.POSITIVE_INFINITY;
    }

    public static String o(String separator, float... array) {
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

    public static int p(float[] array, float target) {
        return q(array, target, 0, array.length);
    }

    public static int q(float[] array, float target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<float[]> r() {
        return c.INSTANCE;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float s(float... array) {
        Preconditions.checkArgument(array.length > 0);
        float f11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            f11 = Math.max(f11, array[i11]);
        }
        return f11;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float t(float... array) {
        Preconditions.checkArgument(array.length > 0);
        float f11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            f11 = Math.min(f11, array[i11]);
        }
        return f11;
    }

    public static void u(float[] array) {
        Preconditions.checkNotNull(array);
        v(array, 0, array.length);
    }

    public static void v(float[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            float f11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = f11;
            fromIndex++;
        }
    }

    public static void w(float[] array, int distance) {
        x(array, distance, 0, array.length);
    }

    public static void x(float[] array, int distance, int fromIndex, int toIndex) {
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
        v(array, fromIndex, i13);
        v(array, i13, toIndex);
        v(array, fromIndex, toIndex);
    }

    public static void y(float[] array) {
        Preconditions.checkNotNull(array);
        z(array, 0, array.length);
    }

    public static void z(float[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        v(array, fromIndex, toIndex);
    }
}
