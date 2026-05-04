package ro;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f84487a = 64;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] left, byte[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int compare = Byte.compare(left[i11], right[i11]);
                if (compare != 0) {
                    return compare;
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    public static byte a(long value) {
        byte b11 = (byte) value;
        Preconditions.checkArgument(((long) b11) == value, "Out of range: %s", value);
        return b11;
    }

    public static int b(byte a11, byte b11) {
        return Byte.compare(a11, b11);
    }

    public static String c(String separator, byte... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append((int) array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append((int) array[i11]);
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> d() {
        return a.INSTANCE;
    }

    public static byte e(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        byte b11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            byte b12 = array[i11];
            if (b12 > b11) {
                b11 = b12;
            }
        }
        return b11;
    }

    public static byte f(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        byte b11 = array[0];
        for (int i11 = 1; i11 < array.length; i11++) {
            byte b12 = array[i11];
            if (b12 < b11) {
                b11 = b12;
            }
        }
        return b11;
    }

    public static byte g(long value) {
        if (value > 127) {
            return Byte.MAX_VALUE;
        }
        if (value < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) value;
    }

    public static void h(byte[] array) {
        Preconditions.checkNotNull(array);
        i(array, 0, array.length);
    }

    public static void i(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        Arrays.sort(array, fromIndex, toIndex);
        b.o(array, fromIndex, toIndex);
    }
}
