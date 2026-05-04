package kotlin.time;

import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.e;
import u30.f0;
import u30.k0;
import u30.r0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n1015#1,6:1064\n1018#1,3:1070\n1015#1,6:1073\n1015#1,6:1079\n1018#1,3:1085\n1#2:1063\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n930#1:1064,6\n964#1:1070,3\n967#1:1073,6\n970#1:1079,6\n1015#1:1085,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f67762a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f67763b = 4611686018426999999L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f67764c = 4611686018427387903L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f67765d = 4611686018426L;

    public static final long i(long j11, int i11) {
        return e.k((j11 << 1) + i11);
    }

    public static final long j(long j11) {
        return e.k((j11 << 1) + 1);
    }

    public static final long k(long j11) {
        return (-4611686018426L > j11 || j11 >= 4611686018427L) ? j(u.K(j11, -4611686018427387903L, 4611686018427387903L)) : l(n(j11));
    }

    public static final long l(long j11) {
        return e.k(j11 << 1);
    }

    public static final long m(long j11) {
        return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? j(o(j11)) : l(j11);
    }

    public static final long n(long j11) {
        return j11 * 1000000;
    }

    public static final long o(long j11) {
        return j11 / 1000000;
    }

    public static final long p(String str, boolean z11) {
        int i11;
        char charAt;
        char charAt2;
        int i12;
        boolean z12;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        e.a aVar = e.f67757b;
        long T = aVar.T();
        char charAt3 = str.charAt(0);
        int i13 = (charAt3 == '+' || charAt3 == '-') ? 1 : 0;
        boolean z13 = i13 > 0;
        boolean z14 = z13 && k0.A5(str, '-', false, 2, null);
        if (length <= i13) {
            throw new IllegalArgumentException("No components");
        }
        char c11 = ':';
        char c12 = '0';
        if (str.charAt(i13) == 'P') {
            int i14 = i13 + 1;
            if (i14 == length) {
                throw new IllegalArgumentException();
            }
            boolean z15 = false;
            DurationUnit durationUnit = null;
            while (i14 < length) {
                if (str.charAt(i14) != 'T') {
                    int i15 = i14;
                    while (true) {
                        if (i15 >= str.length()) {
                            i12 = length;
                            break;
                        }
                        char charAt4 = str.charAt(i15);
                        if (c12 > charAt4 || charAt4 >= c11) {
                            i12 = length;
                            if (!k0.m3("+-.", charAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i12 = length;
                        }
                        i15++;
                        length = i12;
                        c12 = '0';
                        c11 = ':';
                    }
                    g0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(i14, i15);
                    g0.o(substring, "substring(...)");
                    if (substring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = i14 + substring.length();
                    if (length2 < 0 || length2 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt5 = str.charAt(length2);
                    i14 = length2 + 1;
                    DurationUnit f11 = w30.g.f(charAt5, z15);
                    if (durationUnit != null && durationUnit.compareTo(f11) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int I3 = k0.I3(substring, '.', 0, false, 6, null);
                    if (f11 != DurationUnit.SECONDS || I3 <= 0) {
                        z12 = z15;
                        T = e.T(T, x(q(substring), f11));
                    } else {
                        g0.n(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = substring.substring(0, I3);
                        g0.o(substring2, "substring(...)");
                        z12 = z15;
                        long T2 = e.T(T, x(q(substring2), f11));
                        g0.n(substring, "null cannot be cast to non-null type java.lang.String");
                        String substring3 = substring.substring(I3);
                        g0.o(substring3, "substring(...)");
                        T = e.T(T2, v(Double.parseDouble(substring3), f11));
                    }
                    z15 = z12;
                    durationUnit = f11;
                    length = i12;
                    c12 = '0';
                    c11 = ':';
                } else {
                    if (z15 || (i14 = i14 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z15 = true;
                }
            }
        } else {
            if (z11) {
                throw new IllegalArgumentException();
            }
            char c13 = '0';
            if (f0.s2(str, i13, "Infinity", 0, Math.max(length - i13, 8), true)) {
                T = aVar.n();
            } else {
                boolean z16 = !z13;
                if (z13 && str.charAt(i13) == '(' && r0.W7(str) == ')') {
                    i13++;
                    int i16 = length - 1;
                    if (i13 == i16) {
                        throw new IllegalArgumentException("No components");
                    }
                    i11 = i16;
                    z16 = true;
                } else {
                    i11 = length;
                }
                boolean z17 = false;
                DurationUnit durationUnit2 = null;
                while (i13 < i11) {
                    if (z17 && z16) {
                        while (i13 < str.length() && str.charAt(i13) == ' ') {
                            i13++;
                        }
                    }
                    int i17 = i13;
                    while (i17 < str.length() && ((c13 <= (charAt2 = str.charAt(i17)) && charAt2 < ':') || charAt2 == '.')) {
                        i17++;
                    }
                    g0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String substring4 = str.substring(i13, i17);
                    g0.o(substring4, "substring(...)");
                    if (substring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i13 + substring4.length();
                    int i18 = length3;
                    while (i18 < str.length() && 'a' <= (charAt = str.charAt(i18)) && charAt < '{') {
                        i18++;
                    }
                    g0.n(str, "null cannot be cast to non-null type java.lang.String");
                    String substring5 = str.substring(length3, i18);
                    g0.o(substring5, "substring(...)");
                    i13 = length3 + substring5.length();
                    DurationUnit g11 = w30.g.g(substring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(g11) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int I32 = k0.I3(substring4, '.', 0, false, 6, null);
                    if (I32 > 0) {
                        g0.n(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring6 = substring4.substring(0, I32);
                        g0.o(substring6, "substring(...)");
                        long T3 = e.T(T, x(Long.parseLong(substring6), g11));
                        g0.n(substring4, "null cannot be cast to non-null type java.lang.String");
                        String substring7 = substring4.substring(I32);
                        g0.o(substring7, "substring(...)");
                        T = e.T(T3, v(Double.parseDouble(substring7), g11));
                        if (i13 < i11) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        T = e.T(T, x(Long.parseLong(substring4), g11));
                    }
                    durationUnit2 = g11;
                    z17 = true;
                    c13 = '0';
                }
            }
        }
        return z14 ? e.j0(T) : T;
    }

    public static final long q(String str) {
        char charAt;
        int length = str.length();
        int i11 = (length <= 0 || !k0.m3("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i11 > 16) {
            int i12 = i11;
            while (true) {
                if (i11 < length) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i12 == i11) {
                        i12++;
                    }
                    i11++;
                } else if (length - i12 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!f0.J2(str, "+", false, 2, null) || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(r0.d7(str, 1));
    }

    public static final int r(String str, int i11, x00.l<? super Character, Boolean> lVar) {
        while (i11 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        return i11;
    }

    public static final String s(String str, int i11, x00.l<? super Character, Boolean> lVar) {
        int i12 = i11;
        while (i12 < str.length() && lVar.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12++;
        }
        g0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i11, i12);
        g0.o(substring, "substring(...)");
        return substring;
    }

    @y0(version = "1.6")
    @o00.f
    public static final long t(double d11, long j11) {
        return e.U(j11, d11);
    }

    @y0(version = "1.6")
    @o00.f
    public static final long u(int i11, long j11) {
        return e.V(j11, i11);
    }

    @y0(version = "1.6")
    public static final long v(double d11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        double a11 = w30.f.a(d11, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(a11)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long M0 = c10.d.M0(a11);
        return (-4611686018426999999L > M0 || M0 >= 4611686018427000000L) ? k(c10.d.M0(w30.f.a(d11, unit, DurationUnit.MILLISECONDS))) : l(M0);
    }

    @y0(version = "1.6")
    public static final long w(int i11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? l(w30.f.c(i11, unit, DurationUnit.NANOSECONDS)) : x(i11, unit);
    }

    @y0(version = "1.6")
    public static final long x(long j11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long c11 = w30.f.c(f67763b, durationUnit, unit);
        return ((-c11) > j11 || j11 > c11) ? j(u.K(w30.f.b(j11, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(w30.f.c(j11, unit, durationUnit));
    }
}
