package u30;

import androidx.media3.common.C;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e0 extends d0 {
    @m80.k
    public static final Void m1(@m80.k String input) {
        kotlin.jvm.internal.g0.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @m80.l
    @y0(version = "1.1")
    public static final Byte n1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return o1(str, 10);
    }

    @m80.l
    @y0(version = "1.1")
    public static final Byte o1(@m80.k String str, int i11) {
        int intValue;
        kotlin.jvm.internal.g0.p(str, "<this>");
        Integer q12 = q1(str, i11);
        if (q12 == null || (intValue = q12.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @m80.l
    @y0(version = "1.1")
    public static Integer p1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return q1(str, 10);
    }

    @m80.l
    @y0(version = "1.1")
    public static final Integer q1(@m80.k String str, int i11) {
        boolean z11;
        int i12;
        int i13;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.text.a.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char charAt = str.charAt(0);
        int t11 = kotlin.jvm.internal.g0.t(charAt, 48);
        int i15 = C.RATE_UNSET_INT;
        if (t11 < 0) {
            i12 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z11 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i15 = Integer.MIN_VALUE;
                z11 = true;
            }
        } else {
            z11 = false;
            i12 = 0;
        }
        int i16 = -59652323;
        while (i12 < length) {
            int b11 = kotlin.text.a.b(str.charAt(i12), i11);
            if (b11 < 0) {
                return null;
            }
            if ((i14 < i16 && (i16 != -59652323 || i14 < (i16 = i15 / i11))) || (i13 = i14 * i11) < i15 + b11) {
                return null;
            }
            i14 = i13 - b11;
            i12++;
        }
        return z11 ? Integer.valueOf(i14) : Integer.valueOf(-i14);
    }

    @m80.l
    @y0(version = "1.1")
    public static Long r1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return s1(str, 10);
    }

    @m80.l
    @y0(version = "1.1")
    public static final Long s1(@m80.k String str, int i11) {
        boolean z11;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.text.a.a(i11);
        int length = str.length();
        Long l11 = null;
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int t11 = kotlin.jvm.internal.g0.t(charAt, 48);
        long j11 = C.TIME_UNSET;
        if (t11 < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z11 = false;
                i12 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j11 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z11 = false;
        }
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int b11 = kotlin.text.a.b(str.charAt(i12), i11);
            if (b11 < 0) {
                return l11;
            }
            if (j12 < j13) {
                if (j13 != -256204778801521550L) {
                    return l11;
                }
                j13 = j11 / i11;
                if (j12 < j13) {
                    return l11;
                }
            }
            Long l12 = l11;
            int i13 = i12;
            long j14 = j12 * i11;
            long j15 = b11;
            if (j14 < j11 + j15) {
                return l12;
            }
            j12 = j14 - j15;
            i12 = i13 + 1;
            l11 = l12;
        }
        return z11 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    @m80.l
    @y0(version = "1.1")
    public static final Short t1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return u1(str, 10);
    }

    @m80.l
    @y0(version = "1.1")
    public static final Short u1(@m80.k String str, int i11) {
        int intValue;
        kotlin.jvm.internal.g0.p(str, "<this>");
        Integer q12 = q1(str, i11);
        if (q12 == null || (intValue = q12.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
