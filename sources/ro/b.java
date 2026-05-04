package ro;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static class a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f84434a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84435b;

        /* renamed from: c, reason: collision with root package name */
        public final int f84436c;

        public a(byte[] array) {
            this(array, 0, array.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte get(int index) {
            Preconditions.checkElementIndex(index, size());
            return Byte.valueOf(this.f84434a[this.f84435b + index]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte set(int index, Byte element) {
            Preconditions.checkElementIndex(index, size());
            byte[] bArr = this.f84434a;
            int i11 = this.f84435b;
            byte b11 = bArr[i11 + index];
            bArr[i11 + index] = ((Byte) Preconditions.checkNotNull(element)).byteValue();
            return Byte.valueOf(b11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object target) {
            return (target instanceof Byte) && b.j(this.f84434a, ((Byte) target).byteValue(), this.f84435b, this.f84436c) != -1;
        }

        public byte[] d() {
            return Arrays.copyOfRange(this.f84434a, this.f84435b, this.f84436c);
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
                if (this.f84434a[this.f84435b + i11] != aVar.f84434a[aVar.f84435b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f84435b; i12 < this.f84436c; i12++) {
                i11 = (i11 * 31) + b.h(this.f84434a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object target) {
            int j11;
            if (!(target instanceof Byte) || (j11 = b.j(this.f84434a, ((Byte) target).byteValue(), this.f84435b, this.f84436c)) < 0) {
                return -1;
            }
            return j11 - this.f84435b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object target) {
            int m11;
            if (!(target instanceof Byte) || (m11 = b.m(this.f84434a, ((Byte) target).byteValue(), this.f84435b, this.f84436c)) < 0) {
                return -1;
            }
            return m11 - this.f84435b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f84436c - this.f84435b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int fromIndex, int toIndex) {
            Preconditions.checkPositionIndexes(fromIndex, toIndex, size());
            if (fromIndex == toIndex) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.f84434a;
            int i11 = this.f84435b;
            return new a(bArr, fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append((int) this.f84434a[this.f84435b]);
            int i11 = this.f84435b;
            while (true) {
                i11++;
                if (i11 >= this.f84436c) {
                    sb2.append(l50.b.f69930l);
                    return sb2.toString();
                }
                sb2.append(j2.O);
                sb2.append((int) this.f84434a[i11]);
            }
        }

        public a(byte[] array, int start, int end) {
            this.f84434a = array;
            this.f84435b = start;
            this.f84436c = end;
        }
    }

    public static List<Byte> c(byte... backingArray) {
        return backingArray.length == 0 ? Collections.EMPTY_LIST : new a(backingArray);
    }

    public static int d(long result) {
        int i11 = (int) result;
        Preconditions.checkArgument(result == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", result);
        return i11;
    }

    public static byte[] e(byte[]... arrays) {
        long j11 = 0;
        for (byte[] bArr : arrays) {
            j11 += bArr.length;
        }
        byte[] bArr2 = new byte[d(j11)];
        int i11 = 0;
        for (byte[] bArr3 : arrays) {
            System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
            i11 += bArr3.length;
        }
        return bArr2;
    }

    public static boolean f(byte[] array, byte target) {
        for (byte b11 : array) {
            if (b11 == target) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g(byte[] array, int minLength, int padding) {
        Preconditions.checkArgument(minLength >= 0, "Invalid minLength: %s", minLength);
        Preconditions.checkArgument(padding >= 0, "Invalid padding: %s", padding);
        return array.length < minLength ? Arrays.copyOf(array, minLength + padding) : array;
    }

    public static int i(byte[] array, byte target) {
        return j(array, target, 0, array.length);
    }

    public static int j(byte[] array, byte target, int start, int end) {
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
    public static int k(byte[] r5, byte[] r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: ro.b.k(byte[], byte[]):int");
    }

    public static int l(byte[] array, byte target) {
        return m(array, target, 0, array.length);
    }

    public static int m(byte[] array, byte target, int start, int end) {
        for (int i11 = end - 1; i11 >= start; i11--) {
            if (array[i11] == target) {
                return i11;
            }
        }
        return -1;
    }

    public static void n(byte[] array) {
        Preconditions.checkNotNull(array);
        o(array, 0, array.length);
    }

    public static void o(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = toIndex - 1; fromIndex < i11; i11--) {
            byte b11 = array[fromIndex];
            array[fromIndex] = array[i11];
            array[i11] = b11;
            fromIndex++;
        }
    }

    public static void p(byte[] array, int distance) {
        q(array, distance, 0, array.length);
    }

    public static void q(byte[] array, int distance, int fromIndex, int toIndex) {
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
        o(array, fromIndex, i13);
        o(array, i13, toIndex);
        o(array, fromIndex, toIndex);
    }

    public static byte[] r(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = ((Number) Preconditions.checkNotNull(array[i11])).byteValue();
        }
        return bArr;
    }

    public static int h(byte value) {
        return value;
    }
}
