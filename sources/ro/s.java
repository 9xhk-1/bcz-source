package ro;

import com.google.common.base.Preconditions;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final long f84502a = 4294967295L;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(int[] left, int[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                int i12 = left[i11];
                int i13 = right[i11];
                if (i12 != i13) {
                    return s.b(i12, i13);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    public static int a(long value) {
        Preconditions.checkArgument((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int b(int a11, int b11) {
        return i.f(e(a11), e(b11));
    }

    @uo.a
    public static int c(String stringValue) {
        m a11 = m.a(stringValue);
        try {
            return k(a11.f84475a, a11.f84476b);
        } catch (NumberFormatException e11) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e11);
            throw numberFormatException;
        }
    }

    public static int d(int dividend, int divisor) {
        return (int) (r(dividend) / r(divisor));
    }

    public static int e(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static String f(String separator, int... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(s(array[0]));
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(s(array[i11]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> g() {
        return a.INSTANCE;
    }

    public static int h(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int e11 = e(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            int e12 = e(array[i11]);
            if (e12 > e11) {
                e11 = e12;
            }
        }
        return e(e11);
    }

    public static int i(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int e11 = e(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            int e12 = e(array[i11]);
            if (e12 < e11) {
                e11 = e12;
            }
        }
        return e(e11);
    }

    @uo.a
    public static int j(String s11) {
        return k(s11, 10);
    }

    @uo.a
    public static int k(String string, int radix) {
        Preconditions.checkNotNull(string);
        long parseLong = Long.parseLong(string, radix);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        throw new NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static int l(int dividend, int divisor) {
        return (int) (r(dividend) % r(divisor));
    }

    public static int m(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            return -1;
        }
        return (int) value;
    }

    public static void n(int[] array) {
        Preconditions.checkNotNull(array);
        o(array, 0, array.length);
    }

    public static void o(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = e(array[i11]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = e(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void p(int[] array) {
        Preconditions.checkNotNull(array);
        q(array, 0, array.length);
    }

    public static void q(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = Integer.MAX_VALUE ^ array[i11];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }

    public static long r(int value) {
        return value & 4294967295L;
    }

    public static String s(int x11) {
        return t(x11, 10);
    }

    public static String t(int x11, int radix) {
        return Long.toString(x11 & 4294967295L, radix);
    }
}
