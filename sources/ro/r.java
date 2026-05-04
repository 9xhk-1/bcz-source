package ro;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@f
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f84490a = Byte.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f84491b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f84492c = 255;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f84493a = a.class.getName() + "$UnsafeComparator";

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<byte[]> f84494b = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ro.r$a$a, reason: collision with other inner class name */
        public enum EnumC1054a implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] left, byte[] right) {
                int min = Math.min(left.length, right.length);
                for (int i11 = 0; i11 < min; i11++) {
                    int b11 = r.b(left[i11], right[i11]);
                    if (b11 != 0) {
                        return b11;
                    }
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @go.e
        public enum b implements Comparator<byte[]> {
            INSTANCE;


            /* renamed from: b, reason: collision with root package name */
            public static final boolean f84498b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* renamed from: c, reason: collision with root package name */
            public static final Unsafe f84499c;

            /* renamed from: d, reason: collision with root package name */
            public static final int f84500d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: ro.r$a$b$a, reason: collision with other inner class name */
            public class C1055a implements PrivilegedExceptionAction<Unsafe> {
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            }

            static {
                Unsafe c11 = c();
                f84499c = c11;
                int arrayBaseOffset = c11.arrayBaseOffset(byte[].class);
                f84500d = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || c11.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            public static Unsafe c() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e11) {
                        throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new C1055a());
                }
            }

            @Override // java.util.Comparator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] left, byte[] right) {
                int compare;
                int min = Math.min(left.length, right.length);
                int i11 = min & (-8);
                int i12 = 0;
                while (i12 < i11) {
                    Unsafe unsafe = f84499c;
                    int i13 = f84500d;
                    long j11 = i12;
                    long j12 = unsafe.getLong(left, i13 + j11);
                    long j13 = unsafe.getLong(right, i13 + j11);
                    if (j12 != j13) {
                        if (f84498b) {
                            compare = Long.compare(j12 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
                            return compare;
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j12 ^ j13) & (-8);
                        return ((int) ((j12 >>> numberOfTrailingZeros) & 255)) - ((int) ((j13 >>> numberOfTrailingZeros) & 255));
                    }
                    i12 += 8;
                }
                while (i12 < min) {
                    int b11 = r.b(left[i12], right[i12]);
                    if (b11 != 0) {
                        return b11;
                    }
                    i12++;
                }
                return left.length - right.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        public static Comparator<byte[]> a() {
            try {
                Object[] enumConstants = Class.forName(f84493a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return r.f();
            }
        }
    }

    @uo.a
    public static byte a(long value) {
        Preconditions.checkArgument((value >> 8) == 0, "out of range: %s", value);
        return (byte) value;
    }

    public static int b(byte a11, byte b11) {
        return p(a11) - p(b11);
    }

    public static byte c(byte b11) {
        return (byte) (b11 ^ 128);
    }

    public static String d(String separator, byte... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(array.length * (separator.length() + 3));
        sb2.append(p(array[0]));
        for (int i11 = 1; i11 < array.length; i11++) {
            sb2.append(separator);
            sb2.append(q(array[i11]));
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> e() {
        return a.f84494b;
    }

    @go.e
    public static Comparator<byte[]> f() {
        return a.EnumC1054a.INSTANCE;
    }

    public static byte g(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        int p11 = p(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            int p12 = p(array[i11]);
            if (p12 > p11) {
                p11 = p12;
            }
        }
        return (byte) p11;
    }

    public static byte h(byte... array) {
        Preconditions.checkArgument(array.length > 0);
        int p11 = p(array[0]);
        for (int i11 = 1; i11 < array.length; i11++) {
            int p12 = p(array[i11]);
            if (p12 < p11) {
                p11 = p12;
            }
        }
        return (byte) p11;
    }

    @uo.a
    public static byte i(String string) {
        return j(string, 10);
    }

    @uo.a
    public static byte j(String string, int radix) {
        int parseInt = Integer.parseInt((String) Preconditions.checkNotNull(string), radix);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        throw new NumberFormatException("out of range: " + parseInt);
    }

    public static byte k(long value) {
        if (value > p((byte) -1)) {
            return (byte) -1;
        }
        if (value < 0) {
            return (byte) 0;
        }
        return (byte) value;
    }

    public static void l(byte[] array) {
        Preconditions.checkNotNull(array);
        m(array, 0, array.length);
    }

    public static void m(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = c(array[i11]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = c(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void n(byte[] array) {
        Preconditions.checkNotNull(array);
        o(array, 0, array.length);
    }

    public static void o(byte[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i11 = fromIndex; i11 < toIndex; i11++) {
            array[i11] = (byte) (array[i11] ^ Byte.MAX_VALUE);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = (byte) (array[fromIndex] ^ Byte.MAX_VALUE);
            fromIndex++;
        }
    }

    public static int p(byte value) {
        return value & 255;
    }

    public static String q(byte x11) {
        return r(x11, 10);
    }

    public static String r(byte x11, int radix) {
        Preconditions.checkArgument(radix >= 2 && radix <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", radix);
        return Integer.toString(p(x11), radix);
    }
}
