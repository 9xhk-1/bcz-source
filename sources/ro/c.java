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
@go.b(emulated = true)
@f
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84437a = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class a extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final char[] f84438a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84439b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84440c;

        public a(char[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Character.valueOf(this.f84438a[this.f84439b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character set(int index, Character element) {
            Preconditions.checkElementIndex(index, size());
            char[] cArr = this.f84438a;
            int i11 = this.f84439b;
            char c11 = cArr[i11 + index];
            cArr[i11 + index] = ((Character) Preconditions.checkNotNull(element)).charValue();
            return Character.valueOf(c11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Character) && c.o(this.f84438a, ((Character) target).charValue(), this.f84439b, this.f84440c) != -1;
        }

        public char[] d() {
            return Arrays.copyOfRange(this.f84438a, this.f84439b, this.f84440c);
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
                if (this.f84438a[this.f84439b + i11] != aVar.f84438a[aVar.f84439b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84439b; i12 < this.f84440c; i12++) {
                i11 = (i11 * 31) + c.m(this.f84438a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int o11;
            if (!(target instanceof Character) || (o11 = c.o(this.f84438a, ((Character) target).charValue(), this.f84439b, this.f84440c)) < 0) {
                return -1;
            }
            return o11 - this.f84439b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int s11;
            if (!(target instanceof Character) || (s11 = c.s(this.f84438a, ((Character) target).charValue(), this.f84439b, this.f84440c)) < 0) {
                return -1;
            }
            return s11 - this.f84439b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84440c - this.f84439b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.f84438a;
            int i11 = this.f84439b;
            return new a(cArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
            sb2.append('[');
            sb2.append(this.f84438a[this.f84439b]);
            int i11 = this.f84439b;
            while (true) {
                i11++;
                if (i11 >= this.f84440c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append(this.f84438a[i11]);
            }
        }

        public a(char[] array, int start, int end) {
            this.f84438a = array;
            this.f84439b = start;
            this.f84440c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(char[] left, char[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Character.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static char A(long value) {
        if (value > j60.g.f63638t) {
            return kotlin.jvm.internal.q.f67020c;
        }
        if (value < 0) {
            return (char) 0;
        }
        return (char) value;
    }

    public static void B(char[] array) {
        Preconditions.checkNotNull(array);
        C(array, 0, array.length);
    }

    public static void C(char[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        x(array, fromIndex, toIndex);
    }

    public static char[] D(Collection<Character> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = ((Character) Preconditions.checkNotNull(array[i11])).charValue();
        }
        return cArr;
    }

    @go.c
    public static byte[] E(char value) {
        return new byte[]{(byte) (value >> '\b'), (byte) value};
    }

    public static List<Character> c(char... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    public static char e(long value) {
        char c11 = (char) value;
        Preconditions.checkArgument(((long) c11) == value, "Out of range: %s", value);
        return c11;
    }

    @uo.l(replacement = "Character.compare(a, b)")
    public static int f(char a11, char b11) {
        return Character.compare(a11, b11);
    }

    public static char[] g(char[]... arrays) {
        long j11 = 0;
        for (char[] cArr : arrays) {
            j11 += cArr.length;
        }
        char[] cArr2 = new char[d(j11)];
        int i11 = 0;
        for (char[] cArr3 : arrays) {
            System.arraycopy(cArr3, 0, cArr2, i11, cArr3.length);
            i11 += cArr3.length;
        }
        return cArr2;
    }

    public static char h(char value, char min, char max) {
        Preconditions.checkArgument(min <= max, "min (%s) must be less than or equal to max (%s)", min, max);
        return value < min ? min : value < max ? value : max;
    }

    public static boolean i(char[] array, char target) {
        for (char c11 : array) {
            if (c11 == target) {
                return true;
            }
        }
        return false;
    }

    public static char[] j(char[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    @go.c
    public static char k(byte[] bytes) {
        Preconditions.checkArgument(bytes.length >= 2, "array too small: %s < %s", bytes.length, 2);
        return l(bytes[0], bytes[1]);
    }

    @go.c
    public static char l(byte b12, byte b22) {
        return (char) ((b12 << 8) | (b22 & 255));
    }

    public static int n(char[] array, char target) {
        return o(array, target, 0, array.length);
    }

    public static int o(char[] array, char target, int start, int end) {
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
    public static int p(char[] r5, char[] r6) {
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
            char r3 = r5[r3]
            char r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: ro.c.p(char[], char[]):int");
    }

    public static String q(String separator, char... array) {
        Preconditions.checkNotNull(separator);
        int length = array.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder((separator.length() * (length - 1)) + length);
        sb2.append(array[0]);
        for (int i11 = 1; i11 < length; i11++) {
            sb2.append(separator);
            sb2.append(array[i11]);
        }
        return sb2.toString();
    }

    public static int r(char[] array, char target) {
        return s(array, target, 0, array.length);
    }

    public static int s(char[] array, char target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<char[]> t() {
        return b.INSTANCE;
    }

    public static char u(char... array) {
        Preconditions.checkArgument(array.length > 0);
        char c11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            char c12 = array[i11];
            if (c12 > c11) {
                c11 = c12;
            }
        }
        return c11;
    }

    public static char v(char... array) {
        Preconditions.checkArgument(array.length > 0);
        char c11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            char c12 = array[i11];
            if (c12 < c11) {
                c11 = c12;
            }
        }
        return c11;
    }

    public static void w(char[] array) {
        Preconditions.checkNotNull(array);
        x(array, 0, array.length);
    }

    public static void x(char[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            char c11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = c11;
            fromIndex++;
        }
    }

    public static void y(char[] array, int distance) {
        z(array, distance, 0, array.length);
    }

    public static void z(char[] array, int distance, int fromIndex, int toIndex) {
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

    public static int m(char value) {
        return value;
    }
}
