package ro;

import androidx.collection.SieveCacheKt;
import com.google.common.base.Preconditions;
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
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84458a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f84459b = 1073741824;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int[] f84460a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84461b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84462c;

        public a(int[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Integer.valueOf(this.f84460a[this.f84461b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int index, Integer element) {
            Preconditions.checkElementIndex(index, size());
            int[] iArr = this.f84460a;
            int i11 = this.f84461b;
            int i12 = iArr[i11 + index];
            iArr[i11 + index] = ((Integer) Preconditions.checkNotNull(element)).intValue();
            return Integer.valueOf(i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Integer) && i.o(this.f84460a, ((Integer) target).intValue(), this.f84461b, this.f84462c) != -1;
        }

        public int[] d() {
            return Arrays.copyOfRange(this.f84460a, this.f84461b, this.f84462c);
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
                if (this.f84460a[this.f84461b + i11] != aVar.f84460a[aVar.f84461b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84461b; i12 < this.f84462c; i12++) {
                i11 = (i11 * 31) + i.m(this.f84460a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int o11;
            if (!(target instanceof Integer) || (o11 = i.o(this.f84460a, ((Integer) target).intValue(), this.f84461b, this.f84462c)) < 0) {
                return -1;
            }
            return o11 - this.f84461b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int s11;
            if (!(target instanceof Integer) || (s11 = i.s(this.f84460a, ((Integer) target).intValue(), this.f84461b, this.f84462c)) < 0) {
                return -1;
            }
            return s11 - this.f84461b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84462c - this.f84461b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f84460a;
            int i11 = this.f84461b;
            return new a(iArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f84460a[this.f84461b]);
            int i11 = this.f84461b;
            while (true) {
                i11++;
                if (i11 >= this.f84462c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append(this.f84460a[i11]);
            }
        }

        public a(int[] array, int start, int end) {
            this.f84460a = array;
            this.f84461b = start;
            this.f84462c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ho.h<String, Integer> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final ho.h<String, Integer> f84463c = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f84463c;
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(Integer value) {
            return value.toString();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer h(String value) {
            return Integer.decode(value);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(int[] left, int[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Integer.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    public static int A(long value) {
        if (value > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (value < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }

    public static void B(int[] array) {
        Preconditions.checkNotNull(array);
        C(array, 0, array.length);
    }

    public static void C(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static ho.h<String, Integer> D() {
        return b.f84463c;
    }

    public static int[] E(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).intValue();
        }
        return iArr;
    }

    public static byte[] F(int value) {
        return new byte[]{(byte) (value >> 24), (byte) (value >> 16), (byte) (value >> 8), (byte) value};
    }

    @CheckForNull
    public static Integer G(String string) {
        return H(string, 10);
    }

    @CheckForNull
    public static Integer H(String string, int radix) {
        Long F = k.F(string, radix);
        if (F == null || F.longValue() != F.intValue()) {
            return null;
        }
        return Integer.valueOf(F.intValue());
    }

    public static List<Integer> c(int... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    public static int e(long value) {
        int i11 = (int) value;
        Preconditions.checkArgument(((long) i11) == value, "Out of range: %s", value);
        return i11;
    }

    @uo.l(replacement = "Integer.compare(a, b)")
    public static int f(int a11, int b11) {
        return Integer.compare(a11, b11);
    }

    public static int[] g(int[]... arrays) {
        long j11 = 0;
        for (int[] iArr : arrays) {
            j11 += iArr.length;
        }
        int[] iArr2 = new int[d(j11)];
        int i11 = 0;
        for (int[] iArr3 : arrays) {
            System.arraycopy(iArr3, 0, iArr2, i11, iArr3.length);
            i11 += iArr3.length;
        }
        return iArr2;
    }

    public static int h(int value, int min, int max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean i(int[] array, int target) {
        for (int i11 : array) {
            if (i11 == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] j(int[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int k(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 4, "array too small: %s < %s", bytes.length, 4);
        return l(bytes[0], bytes[1], bytes[2], bytes[3]);
    }

    public static int l(byte b12, byte b22, byte b32, byte b42) {
        return (b12 << ho.c.B) | ((b22 & 255) << 16) | ((b32 & 255) << 8) | (b42 & 255);
    }

    public static int n(int[] array, int target) {
        return o(array, target, 0, array.length);
    }

    public static int o(int[] array, int target, int start, int end) {
        while (start < end) {
            if (array[start] == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int p(int[] r5, int[] r6) {
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
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.i.p(int[], int[]):int");
    }

    public static String q(String separator, int... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(array[i11]);
        }
        return sb2.toString();
    }

    public static int r(int[] array, int target) {
        return s(array, target, 0, array.length);
    }

    public static int s(int[] array, int target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<int[]> t() {
        return c.INSTANCE;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int u(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int i11 = array[0];
        for (int i12 = 1; i12 < array.length; i12++) {
            int i13 = array[i12];
            if (i13 > i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int v(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int i11 = array[0];
        for (int i12 = 1; i12 < array.length; i12++) {
            int i13 = array[i12];
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    public static void w(int[] array) {
        Preconditions.checkNotNull(array);
        x(array, 0, array.length);
    }

    public static void x(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            int i12 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = i12;
            fromIndex++;
        }
    }

    public static void y(int[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(int[] array, int distance, int fromIndex, int toIndex) {
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
        x(array, fromIndex, i13);
        x(array, i13, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static int m(int value) {
        return value;
    }
}
