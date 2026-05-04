package ro;

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
@go.b
@f
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84466a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final long f84467b = 4611686018427387904L;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f84468a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < 10; i11++) {
                bArr[i11 + 48] = (byte) i11;
            }
            for (int i12 = 0; i12 < 26; i12++) {
                byte b11 = (byte) (i12 + 10);
                bArr[i12 + 65] = b11;
                bArr[i12 + 97] = b11;
            }
            f84468a = bArr;
        }

        public static int a(char c11) {
            if (c11 < 128) {
                return f84468a[c11];
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(long[] left, long[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Long.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class c extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final long[] f84471a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84472b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84473c;

        public c(long[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Long.valueOf(this.f84471a[this.f84472b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long set(int index, Long element) {
            Preconditions.checkElementIndex(index, size());
            long[] jArr = this.f84471a;
            int i11 = this.f84472b;
            long j11 = jArr[i11 + index];
            jArr[i11 + index] = ((Long) Preconditions.checkNotNull(element)).longValue();
            return Long.valueOf(j11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Long) && k.n(this.f84471a, ((Long) target).longValue(), this.f84472b, this.f84473c) != -1;
        }

        public long[] d() {
            return Arrays.copyOfRange(this.f84471a, this.f84472b, this.f84473c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return super.equals(object);
            }
            c cVar = (c) object;
            int size = size();
            if (cVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f84471a[this.f84472b + i11] != cVar.f84471a[cVar.f84472b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84472b; i12 < this.f84473c; i12++) {
                i11 = (i11 * 31) + k.l(this.f84471a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int n11;
            if (!(target instanceof Long) || (n11 = k.n(this.f84471a, ((Long) target).longValue(), this.f84472b, this.f84473c)) < 0) {
                return -1;
            }
            return n11 - this.f84472b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int r11;
            if (!(target instanceof Long) || (r11 = k.r(this.f84471a, ((Long) target).longValue(), this.f84472b, this.f84473c)) < 0) {
                return -1;
            }
            return r11 - this.f84472b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84473c - this.f84472b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.f84471a;
            int i11 = this.f84472b;
            return new c(jArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append('[');
            sb2.append(this.f84471a[this.f84472b]);
            int i11 = this.f84472b;
            while (true) {
                i11++;
                if (i11 >= this.f84473c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append(this.f84471a[i11]);
            }
        }

        public c(long[] array, int start, int end) {
            this.f84471a = array;
            this.f84472b = start;
            this.f84473c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends ho.h<String, Long> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final ho.h<String, Long> f84474c = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f84474c;
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(Long value) {
            return value.toString();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Long h(String value) {
            return Long.decode(value);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static void A(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        w(array, fromIndex, toIndex);
    }

    public static ho.h<String, Long> B() {
        return d.f84474c;
    }

    public static long[] C(Collection<? extends Number> collection) {
        if (collection instanceof c) {
            return ((c) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i11 = 0; i11 < length; i11++) {
            jArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).longValue();
        }
        return jArr;
    }

    public static byte[] D(long value) {
        byte[] bArr = new byte[8];
        for (int i11 = 7; i11 >= 0; i11--) {
            bArr[i11] = (byte) (255 & value);
            value >>= 8;
        }
        return bArr;
    }

    @CheckForNull
    public static Long E(String string) {
        return F(string, 10);
    }

    @CheckForNull
    public static Long F(String string, int radix) {
        if (((String) Preconditions.checkNotNull(string)).isEmpty()) {
            return null;
        }
        if (radix < 2 || radix > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + radix);
        }
        int i11 = string.charAt(0) == '-' ? 1 : 0;
        if (i11 == string.length()) {
            return null;
        }
        int i12 = i11 + 1;
        int a11 = a.a(string.charAt(i11));
        if (a11 < 0 || a11 >= radix) {
            return null;
        }
        long j11 = -a11;
        long j12 = radix;
        long j13 = Long.MIN_VALUE / j12;
        while (i12 < string.length()) {
            int i13 = i12 + 1;
            int a12 = a.a(string.charAt(i12));
            if (a12 < 0 || a12 >= radix || j11 < j13) {
                return null;
            }
            long j14 = j11 * j12;
            long j15 = a12;
            if (j14 < j15 - Long.MIN_VALUE) {
                return null;
            }
            j11 = j14 - j15;
            i12 = i13;
        }
        if (i11 != 0) {
            return Long.valueOf(j11);
        }
        if (j11 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j11);
    }

    public static List<Long> c(long... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new c(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    @uo.l(replacement = "Long.compare(a, b)")
    public static int e(long a11, long b11) {
        return Long.compare(a11, b11);
    }

    public static long[] f(long[]... arrays) {
        long j11 = 0;
        for (long[] jArr : arrays) {
            j11 += jArr.length;
        }
        long[] jArr2 = new long[d(j11)];
        int i11 = 0;
        for (long[] jArr3 : arrays) {
            System.arraycopy(jArr3, 0, jArr2, i11, jArr3.length);
            i11 += jArr3.length;
        }
        return jArr2;
    }

    public static long g(long value, long min, long max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static boolean h(long[] array, long target) {
        for (long j11 : array) {
            if (j11 == target) {
                return true;
            }
        }
        return false;
    }

    public static long[] i(long[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static long j(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 8, "array too small: %s < %s", bytes.length, 8);
        return k(bytes[0], bytes[1], bytes[2], bytes[3], bytes[4], bytes[5], bytes[6], bytes[7]);
    }

    public static long k(byte b12, byte b22, byte b32, byte b42, byte b52, byte b62, byte b72, byte b82) {
        return ((b22 & 255) << 48) | ((b12 & 255) << 56) | ((b32 & 255) << 40) | ((b42 & 255) << 32) | ((b52 & 255) << 24) | ((b62 & 255) << 16) | ((b72 & 255) << 8) | (b82 & 255);
    }

    public static int l(long value) {
        return (int) (value ^ (value >>> 32));
    }

    public static int m(long[] array, long target) {
        return n(array, target, 0, array.length);
    }

    public static int n(long[] array, long target, int start, int end) {
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
    public static int o(long[] r7, long[] r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: ro.k.o(long[], long[]):int");
    }

    public static String p(String separator, long... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 10);
        sb2.append(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(array[i11]);
        }
        return sb2.toString();
    }

    public static int q(long[] array, long target) {
        return r(array, target, 0, array.length);
    }

    public static int r(long[] array, long target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<long[]> s() {
        return b.INSTANCE;
    }

    public static long t(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long j11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            long j12 = array[i11];
            if (j12 > j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static long u(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long j11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            long j12 = array[i11];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    public static void v(long[] array) {
        Preconditions.checkNotNull(array);
        w(array, 0, array.length);
    }

    public static void w(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            long j11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = j11;
            fromIndex++;
        }
    }

    public static void x(long[] array, int distance) {
        y(array, distance, 0, array.length);
    }

    public static void y(long[] array, int distance, int fromIndex, int toIndex) {
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

    public static void z(long[] array) {
        Preconditions.checkNotNull(array);
        A(array, 0, array.length);
    }
}
