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
import kotlin.jvm.internal.s0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84479a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final short f84480b = 16384;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(short[] left, short[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Short.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class b extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final short[] f84483a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84484b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84485c;

        public b(short[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Short.valueOf(this.f84483a[this.f84484b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short set(int index, Short element) {
            Preconditions.checkElementIndex(index, size());
            short[] sArr = this.f84483a;
            int i11 = this.f84484b;
            short s11 = sArr[i11 + index];
            sArr[i11 + index] = ((Short) Preconditions.checkNotNull(element)).shortValue();
            return Short.valueOf(s11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Short) && o.o(this.f84483a, ((Short) target).shortValue(), this.f84484b, this.f84485c) != -1;
        }

        public short[] d() {
            return Arrays.copyOfRange(this.f84483a, this.f84484b, this.f84485c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof b)) {
                return super.equals(object);
            }
            b bVar = (b) object;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f84483a[this.f84484b + i11] != bVar.f84483a[bVar.f84484b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84484b; i12 < this.f84485c; i12++) {
                i11 = (i11 * 31) + o.m(this.f84483a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int o11;
            if (!(target instanceof Short) || (o11 = o.o(this.f84483a, ((Short) target).shortValue(), this.f84484b, this.f84485c)) < 0) {
                return -1;
            }
            return o11 - this.f84484b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int s11;
            if (!(target instanceof Short) || (s11 = o.s(this.f84483a, ((Short) target).shortValue(), this.f84484b, this.f84485c)) < 0) {
                return -1;
            }
            return s11 - this.f84484b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84485c - this.f84484b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.f84483a;
            int i11 = this.f84484b;
            return new b(sArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append('[');
            sb2.append((int) this.f84483a[this.f84484b]);
            int i11 = this.f84484b;
            while (true) {
                i11++;
                if (i11 >= this.f84485c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append((int) this.f84483a[i11]);
            }
        }

        public b(short[] array, int start, int end) {
            this.f84483a = array;
            this.f84484b = start;
            this.f84485c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends ho.h<String, Short> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final ho.h<String, Short> f84486c = new c();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return f84486c;
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(Short value) {
            return value.toString();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public Short h(String value) {
            return Short.decode(value);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    public static short A(long value) {
        return value > 32767 ? s0.f67032c : value < -32768 ? s0.f67031b : (short) value;
    }

    public static void B(short[] array) {
        Preconditions.checkNotNull(array);
        C(array, 0, array.length);
    }

    public static void C(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static ho.h<String, Short> D() {
        return c.f84486c;
    }

    public static short[] E(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).shortValue();
        }
        return sArr;
    }

    @go.c
    public static byte[] F(short value) {
        return new byte[]{(byte) (value >> 8), (byte) value};
    }

    public static List<Short> c(short... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new b(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    public static short e(long value) {
        short s11 = (short) value;
        Preconditions.checkArgument(((long) s11) == value, "Out of range: %s", value);
        return s11;
    }

    @uo.l(replacement = "Short.compare(a, b)")
    public static int f(short a11, short b11) {
        return Short.compare(a11, b11);
    }

    public static short[] g(short[]... arrays) {
        long j11 = 0;
        for (short[] sArr : arrays) {
            j11 += sArr.length;
        }
        short[] sArr2 = new short[d(j11)];
        int i11 = 0;
        for (short[] sArr3 : arrays) {
            System.arraycopy(sArr3, 0, sArr2, i11, sArr3.length);
            i11 += sArr3.length;
        }
        return sArr2;
    }

    public static short h(short value, short min, short max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", (int) min, (int) max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean i(short[] array, short target) {
        for (short s11 : array) {
            if (s11 == target) {
                return true;
            }
        }
        return false;
    }

    public static short[] j(short[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @go.c
    public static short k(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return l(bytes[0], bytes[1]);
    }

    @go.c
    public static short l(byte b12, byte b22) {
        return (short) ((b12 << 8) | (b22 & 255));
    }

    public static int n(short[] array, short target) {
        return o(array, target, 0, array.length);
    }

    public static int o(short[] array, short target, int start, int end) {
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
    public static int p(short[] r5, short[] r6) {
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
            short r3 = r5[r3]
            short r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: ro.o.p(short[], short[]):int");
    }

    public static String q(String separator, short... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 6);
        sb2.append((int) array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append((int) array[i11]);
        }
        return sb2.toString();
    }

    public static int r(short[] array, short target) {
        return s(array, target, 0, array.length);
    }

    public static int s(short[] array, short target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<short[]> t() {
        return a.INSTANCE;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short u(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            short s12 = array[i11];
            if (s12 > s11) {
                s11 = s12;
            }
        }
        return s11;
    }

    @go.c("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short v(short... array) {
        Preconditions.checkArgument(array.length > 0);
        short s11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            short s12 = array[i11];
            if (s12 < s11) {
                s11 = s12;
            }
        }
        return s11;
    }

    public static void w(short[] array) {
        Preconditions.checkNotNull(array);
        x(array, 0, array.length);
    }

    public static void x(short[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            short s11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = s11;
            fromIndex++;
        }
    }

    public static void y(short[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(short[] array, int distance, int fromIndex, int toIndex) {
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

    public static int m(short value) {
        return value;
    }
}
