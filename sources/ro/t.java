package ro;

import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final long f84505a = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(long[] left, long[] right) {
            int min = Math.min(left.length, right.length);
            for (int i11 = 0; i11 < min; i11++) {
                long j11 = left[i11];
                long j12 = right[i11];
                if (j11 != j12) {
                    return t.a(j11, j12);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final long[] f84508a = new long[37];

        /* renamed from: b, reason: collision with root package name */
        public static final int[] f84509b = new int[37];

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f84510c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i11 = 2; i11 <= 36; i11++) {
                long j11 = i11;
                f84508a[i11] = t.c(-1L, j11);
                f84509b[i11] = (int) t.k(-1L, j11);
                f84510c[i11] = bigInteger.toString(i11).length() - 1;
            }
        }

        public static boolean a(long current, int digit, int radix) {
            if (current < 0) {
                return true;
            }
            long j11 = f84508a[radix];
            if (current < j11) {
                return false;
            }
            return current > j11 || digit > f84509b[radix];
        }
    }

    public static int a(long a11, long b11) {
        return k.e(d(a11), d(b11));
    }

    @uo.a
    public static long b(String stringValue) {
        m a11 = m.a(stringValue);
        try {
            return j(a11.f84475a, a11.f84476b);
        } catch (NumberFormatException e11) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e11);
            throw numberFormatException;
        }
    }

    public static long c(long dividend, long divisor) {
        if (divisor < 0) {
            return a(dividend, divisor) < 0 ? 0L : 1L;
        }
        if (dividend >= 0) {
            return dividend / divisor;
        }
        long j11 = ((dividend >>> 1) / divisor) << 1;
        return j11 + (a(dividend - (j11 * divisor), divisor) < 0 ? 0 : 1);
    }

    public static long d(long a11) {
        return a11 ^ Long.MIN_VALUE;
    }

    public static String e(String separator, long... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * 5);
        sb2.append(p(array[0]));
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(p(array[i11]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> f() {
        return a.INSTANCE;
    }

    public static long g(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long d11 = d(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            long d12 = d(array[i11]);
            if (d12 > d11) {
                d11 = d12;
            }
        }
        return d(d11);
    }

    public static long h(long... array) {
        Preconditions.checkArgument(array.length > 0);
        long d11 = d(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            long d12 = d(array[i11]);
            if (d12 < d11) {
                d11 = d12;
            }
        }
        return d(d11);
    }

    @uo.a
    public static long i(String string) {
        return j(string, 10);
    }

    @uo.a
    public static long j(String string, int radix) {
        Preconditions.checkNotNull(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (radix < 2 || radix > 36) {
            throw new NumberFormatException("illegal radix: " + radix);
        }
        int i11 = b.f84510c[radix] - 1;
        long j11 = 0;
        for (int i12 = 0; i12 < string.length(); i12++) {
            int digit = Character.digit(string.charAt(i12), radix);
            if (digit == -1) {
                throw new NumberFormatException(string);
            }
            if (i12 > i11 && b.a(j11, digit, radix)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            j11 = (j11 * radix) + digit;
        }
        return j11;
    }

    public static long k(long dividend, long divisor) {
        if (divisor < 0) {
            return a(dividend, divisor) < 0 ? dividend : dividend - divisor;
        }
        if (dividend >= 0) {
            return dividend % divisor;
        }
        long j11 = dividend - ((((dividend >>> 1) / divisor) << 1) * divisor);
        if (a(j11, divisor) < 0) {
            divisor = 0;
        }
        return j11 - divisor;
    }

    public static void l(long[] array) {
        Preconditions.checkNotNull(array);
        m(array, 0, array.length);
    }

    public static void m(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = d(array[i11]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = d(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void n(long[] array) {
        Preconditions.checkNotNull(array);
        o(array, 0, array.length);
    }

    public static void o(long[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = Long.MAX_VALUE ^ array[i11];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Long.MAX_VALUE;
            fromIndex++;
        }
    }

    public static String p(long x11) {
        return q(x11, 10);
    }

    public static String q(long x11, int radix) {
        Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        if (x11 == 0) {
            return "0";
        }
        if (x11 > 0) {
            return Long.toString(x11, radix);
        }
        int i11 = 64;
        char[] cArr = new char[64];
        int i12 = radix - 1;
        if ((radix & i12) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(radix);
            do {
                i11--;
                cArr[i11] = Character.forDigit(((int) x11) & i12, radix);
                x11 >>>= numberOfTrailingZeros;
            } while (x11 != 0);
        } else {
            long c11 = (radix & 1) == 0 ? (x11 >>> 1) / (radix >>> 1) : c(x11, radix);
            long j11 = radix;
            int i13 = 63;
            cArr[63] = Character.forDigit((int) (x11 - (c11 * j11)), radix);
            while (c11 > 0) {
                i13--;
                cArr[i13] = Character.forDigit((int) (c11 % j11), radix);
                c11 /= j11;
            }
            i11 = i13;
        }
        return new String(cArr, i11, 64 - i11);
    }
}
