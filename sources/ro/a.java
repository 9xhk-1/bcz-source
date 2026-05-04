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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    /* renamed from: ro.a$a, reason: collision with other inner class name */
    public static class C1053a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final boolean[] f84424a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84425b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84426c;

        public C1053a(boolean[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Boolean.valueOf(this.f84424a[this.f84425b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean set(int index, Boolean element) {
            Preconditions.checkElementIndex(index, size());
            boolean[] zArr = this.f84424a;
            int i11 = this.f84425b;
            boolean z11 = zArr[i11 + index];
            zArr[i11 + index] = ((Boolean) Preconditions.checkNotNull(element)).booleanValue();
            return Boolean.valueOf(z11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Boolean) && a.m(this.f84424a, ((Boolean) target).booleanValue(), this.f84425b, this.f84426c) != -1;
        }

        public boolean[] d() {
            return Arrays.copyOfRange(this.f84424a, this.f84425b, this.f84426c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof C1053a)) {
                return super.equals(object);
            }
            C1053a c1053a = (C1053a) object;
            int size = size();
            if (c1053a.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f84424a[this.f84425b + i11] != c1053a.f84424a[c1053a.f84425b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84425b; i12 < this.f84426c; i12++) {
                i11 = (i11 * 31) + a.k(this.f84424a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int m11;
            if (!(target instanceof Boolean) || (m11 = a.m(this.f84424a, ((Boolean) target).booleanValue(), this.f84425b, this.f84426c)) < 0) {
                return -1;
            }
            return m11 - this.f84425b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int q11;
            if (!(target instanceof Boolean) || (q11 = a.q(this.f84424a, ((Boolean) target).booleanValue(), this.f84425b, this.f84426c)) < 0) {
                return -1;
            }
            return q11 - this.f84425b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84426c - this.f84425b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.f84424a;
            int i11 = this.f84425b;
            return new C1053a(zArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f84424a[this.f84425b] ? "[true" : "[false");
            int i11 = this.f84425b;
            while (true) {
                i11++;
                if (i11 >= this.f84426c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(this.f84424a[i11] ? ", true" : ", false");
            }
        }

        public C1053a(boolean[] array, int start, int end) {
            this.f84424a = array;
            this.f84425b = start;
            this.f84426c = end;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* renamed from: a, reason: collision with root package name */
        public final int f84430a;

        /* renamed from: b, reason: collision with root package name */
        public final String f84431b;

        b(int trueValue, String toString) {
            this.f84430a = trueValue;
            this.f84431b = toString;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Boolean a11, Boolean b11) {
            return (b11.booleanValue() ? this.f84430a : 0) - (a11.booleanValue() ? this.f84430a : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f84431b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(boolean[] left, boolean[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Boolean.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    public static List<Boolean> c(boolean... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new C1053a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    @uo.l(replacement = "Boolean.compare(a, b)")
    public static int e(boolean a11, boolean b11) {
        return Boolean.compare(a11, b11);
    }

    public static boolean[] f(boolean[]... arrays) {
        long j11 = 0;
        for (boolean[] zArr : arrays) {
            j11 += zArr.length;
        }
        boolean[] zArr2 = new boolean[d(j11)];
        int i11 = 0;
        for (boolean[] zArr3 : arrays) {
            System.arraycopy(zArr3, 0, zArr2, i11, zArr3.length);
            i11 += zArr3.length;
        }
        return zArr2;
    }

    public static boolean g(boolean[] array, boolean target) {
        for (boolean z11 : array) {
            if (z11 == target) {
                return true;
            }
        }
        return false;
    }

    public static int h(boolean... values) {
        int i11 = 0;
        for (boolean z11 : values) {
            if (z11) {
                i11++;
            }
        }
        return i11;
    }

    public static boolean[] i(boolean[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static Comparator<Boolean> j() {
        return b.FALSE_FIRST;
    }

    public static int k(boolean value) {
        return value ? 1231 : 1237;
    }

    public static int l(boolean[] array, boolean target) {
        return m(array, target, 0, array.length);
    }

    public static int m(boolean[] array, boolean target, int start, int end) {
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
    public static int n(boolean[] r5, boolean[] r6) {
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: ro.a.n(boolean[], boolean[]):int");
    }

    public static String o(String separator, boolean... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 7);
        sb2.append(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(array[i11]);
        }
        return sb2.toString();
    }

    public static int p(boolean[] array, boolean target) {
        return q(array, target, 0, array.length);
    }

    public static int q(boolean[] array, boolean target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> r() {
        return c.INSTANCE;
    }

    public static void s(boolean[] array) {
        Preconditions.checkNotNull(array);
        t(array, 0, array.length);
    }

    public static void t(boolean[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            boolean z11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = z11;
            fromIndex++;
        }
    }

    public static void u(boolean[] array, int distance) {
        v(array, distance, 0, array.length);
    }

    public static void v(boolean[] array, int distance, int fromIndex, int toIndex) {
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
        t(array, fromIndex, i13);
        t(array, i13, toIndex);
        t(array, fromIndex, toIndex);
    }

    public static boolean[] w(Collection<Boolean> collection) {
        if (collection instanceof C1053a) {
            return ((C1053a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zArr[i11] = ((Boolean) Preconditions.checkNotNull(array[i11])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> x() {
        return b.TRUE_FIRST;
    }
}
