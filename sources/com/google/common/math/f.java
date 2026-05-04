package com.google.common.math;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Preconditions;
import com.huawei.hms.framework.common.ExceptionCode;
import java.math.RoundingMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public static final int f34316a = 1073741824;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public static final int f34317b = -1257966797;

    /* renamed from: f, reason: collision with root package name */
    @go.e
    public static final int f34321f = 46340;

    /* renamed from: c, reason: collision with root package name */
    @go.e
    public static final byte[] f34318c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    @go.e
    public static final int[] f34319d = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    /* renamed from: e, reason: collision with root package name */
    @go.e
    public static final int[] f34320e = {3, 31, TypedValues.AttributesType.TYPE_PATH_ROTATE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f34322g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: h, reason: collision with root package name */
    @go.e
    public static int[] f34323h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34324a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f34324a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34324a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34324a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34324a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34324a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34324a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34324a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34324a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int n11, int k11) {
        i.e("n", n11);
        i.e("k", k11);
        int i11 = 0;
        Preconditions.checkArgument(k11 <= n11, "k (%s) > n (%s)", k11, n11);
        if (k11 > (n11 >> 1)) {
            k11 = n11 - k11;
        }
        int[] iArr = f34323h;
        if (k11 >= iArr.length || n11 > iArr[k11]) {
            return Integer.MAX_VALUE;
        }
        if (k11 == 0) {
            return 1;
        }
        if (k11 == 1) {
            return n11;
        }
        long j11 = 1;
        while (i11 < k11) {
            long j12 = j11 * (n11 - i11);
            i11++;
            j11 = j12 / i11;
        }
        return (int) j11;
    }

    public static int b(int x11) {
        i.h("x", x11);
        if (x11 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(x11 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x11 + ") not representable as an int");
    }

    public static int c(int a11, int b11) {
        long j11 = a11 + b11;
        int i11 = (int) j11;
        i.b(j11 == ((long) i11), "checkedAdd", a11, b11);
        return i11;
    }

    public static int d(int a11, int b11) {
        long j11 = a11 * b11;
        int i11 = (int) j11;
        i.b(j11 == ((long) i11), "checkedMultiply", a11, b11);
        return i11;
    }

    public static int e(int b11, int k11) {
        i.e("exponent", k11);
        if (b11 == -2) {
            i.b(k11 < 32, "checkedPow", b11, k11);
            return (k11 & 1) == 0 ? 1 << k11 : (-1) << k11;
        }
        if (b11 == -1) {
            return (k11 & 1) == 0 ? 1 : -1;
        }
        if (b11 == 0) {
            return k11 == 0 ? 1 : 0;
        }
        if (b11 == 1) {
            return 1;
        }
        if (b11 == 2) {
            i.b(k11 < 31, "checkedPow", b11, k11);
            return 1 << k11;
        }
        int i11 = 1;
        while (k11 != 0) {
            if (k11 == 1) {
                return d(i11, b11);
            }
            if ((k11 & 1) != 0) {
                i11 = d(i11, b11);
            }
            k11 >>= 1;
            if (k11 > 0) {
                i.b((-46340 <= b11) & (b11 <= 46340), "checkedPow", b11, k11);
                b11 *= b11;
            }
        }
        return i11;
    }

    public static int f(int a11, int b11) {
        long j11 = a11 - b11;
        int i11 = (int) j11;
        i.b(j11 == ((long) i11), "checkedSubtract", a11, b11);
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int p11, int q11, RoundingMode mode) {
        Preconditions.checkNotNull(mode);
        if (q11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = p11 / q11;
        int i12 = p11 - (q11 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((p11 ^ q11) >> 31) | 1;
        switch (a.f34324a[mode.ordinal()]) {
            case 1:
                i.k(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                return i11 + i13;
            case 4:
                return i11 + i13;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                return i11 + i13;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i12);
                int abs2 = abs - (Math.abs(q11) - abs);
                if (abs2 == 0) {
                    if (mode != RoundingMode.HALF_UP) {
                        if (!((mode == RoundingMode.HALF_EVEN) & ((i11 & 1) != 0))) {
                            return i11;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i11;
                }
                return i11 + i13;
            default:
                throw new AssertionError();
        }
    }

    public static int h(int n11) {
        i.e("n", n11);
        int[] iArr = f34322g;
        if (n11 < iArr.length) {
            return iArr[n11];
        }
        return Integer.MAX_VALUE;
    }

    public static int i(int x11) {
        i.h("x", x11);
        return Integer.highestOneBit(x11);
    }

    public static int j(int a11, int b11) {
        i.e("a", a11);
        i.e(yr.e.f100279a, b11);
        if (a11 == 0) {
            return b11;
        }
        if (b11 == 0) {
            return a11;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(a11);
        int i11 = a11 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(b11);
        int i12 = b11 >> numberOfTrailingZeros2;
        while (i11 != i12) {
            int i13 = i11 - i12;
            int i14 = (i13 >> 31) & i13;
            int i15 = (i13 - i14) - i14;
            i12 += i14;
            i11 = i15 >> Integer.numberOfTrailingZeros(i15);
        }
        return i11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean k(int x11) {
        return (x11 > 0) & ((x11 & (x11 + (-1))) == 0);
    }

    @go.c
    public static boolean l(int n11) {
        return h.m(n11);
    }

    @go.e
    public static int m(int x11, int y11) {
        return (~(~(x11 - y11))) >>> 31;
    }

    @go.c
    public static int n(int x11, RoundingMode mode) {
        int m11;
        i.h("x", x11);
        int o11 = o(x11);
        int i11 = f34319d[o11];
        switch (a.f34324a[mode.ordinal()]) {
            case 1:
                i.k(x11 == i11);
                return o11;
            case 2:
            case 3:
                return o11;
            case 4:
            case 5:
                m11 = m(i11, x11);
                break;
            case 6:
            case 7:
            case 8:
                m11 = m(f34320e[o11], x11);
                break;
            default:
                throw new AssertionError();
        }
        return o11 + m11;
    }

    public static int o(int x11) {
        byte b11 = f34318c[Integer.numberOfLeadingZeros(x11)];
        return b11 - m(x11, f34319d[b11]);
    }

    public static int p(int x11, RoundingMode mode) {
        i.h("x", x11);
        switch (a.f34324a[mode.ordinal()]) {
            case 1:
                i.k(k(x11));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(x11 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(x11);
                return (31 - numberOfLeadingZeros) + m(f34317b >>> numberOfLeadingZeros, x11);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(x11);
    }

    public static int q(int x11, int y11) {
        return (x11 & y11) + ((x11 ^ y11) >> 1);
    }

    public static int r(int x11, int m11) {
        if (m11 > 0) {
            int i11 = x11 % m11;
            return i11 >= 0 ? i11 : i11 + m11;
        }
        throw new ArithmeticException("Modulus " + m11 + " must be > 0");
    }

    @go.c
    public static int s(int b11, int k11) {
        i.e("exponent", k11);
        if (b11 == -2) {
            if (k11 < 32) {
                return (k11 & 1) == 0 ? 1 << k11 : -(1 << k11);
            }
            return 0;
        }
        if (b11 == -1) {
            return (k11 & 1) == 0 ? 1 : -1;
        }
        if (b11 == 0) {
            return k11 == 0 ? 1 : 0;
        }
        if (b11 == 1) {
            return 1;
        }
        if (b11 == 2) {
            if (k11 < 32) {
                return 1 << k11;
            }
            return 0;
        }
        int i11 = 1;
        while (k11 != 0) {
            if (k11 == 1) {
                return b11 * i11;
            }
            i11 *= (k11 & 1) == 0 ? 1 : b11;
            b11 *= b11;
            k11 >>= 1;
        }
        return i11;
    }

    public static int t(int a11, int b11) {
        return ro.i.A(a11 + b11);
    }

    public static int u(int a11, int b11) {
        return ro.i.A(a11 * b11);
    }

    public static int v(int b11, int k11) {
        i.e("exponent", k11);
        if (b11 == -2) {
            return k11 >= 32 ? (k11 & 1) + Integer.MAX_VALUE : (k11 & 1) == 0 ? 1 << k11 : (-1) << k11;
        }
        if (b11 == -1) {
            return (k11 & 1) == 0 ? 1 : -1;
        }
        if (b11 == 0) {
            return k11 == 0 ? 1 : 0;
        }
        if (b11 == 1) {
            return 1;
        }
        if (b11 == 2) {
            if (k11 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k11;
        }
        int i11 = ((b11 >>> 31) & k11 & 1) + Integer.MAX_VALUE;
        int i12 = 1;
        while (k11 != 0) {
            if (k11 == 1) {
                return u(i12, b11);
            }
            if ((k11 & 1) != 0) {
                i12 = u(i12, b11);
            }
            k11 >>= 1;
            if (k11 > 0) {
                if ((-46340 > b11) || (b11 > 46340)) {
                    return i11;
                }
                b11 *= b11;
            }
        }
        return i12;
    }

    public static int w(int a11, int b11) {
        return ro.i.A(a11 - b11);
    }

    @go.c
    public static int x(int x11, RoundingMode mode) {
        int m11;
        i.e("x", x11);
        int y11 = y(x11);
        switch (a.f34324a[mode.ordinal()]) {
            case 1:
                i.k(y11 * y11 == x11);
                return y11;
            case 2:
            case 3:
                return y11;
            case 4:
            case 5:
                m11 = m(y11 * y11, x11);
                break;
            case 6:
            case 7:
            case 8:
                m11 = m((y11 * y11) + y11, x11);
                break;
            default:
                throw new AssertionError();
        }
        return y11 + m11;
    }

    public static int y(int x11) {
        return (int) Math.sqrt(x11);
    }
}
