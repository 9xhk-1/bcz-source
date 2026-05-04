package u30;

import kotlin.KotlinNothingValueException;
import yz.c2;
import yz.i2;
import yz.j1;
import yz.m1;
import yz.o1;
import yz.s1;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "UStringsKt")
/* loaded from: classes8.dex */
public final class w0 {
    @y0(version = "1.5")
    @m80.k
    public static final String a(long j11, int i11) {
        return i2.t(j11, kotlin.text.a.a(i11));
    }

    @y0(version = "1.5")
    @m80.k
    public static final String b(byte b11, int i11) {
        String num = Integer.toString(b11 & 255, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(num, "toString(...)");
        return num;
    }

    @y0(version = "1.5")
    @m80.k
    public static final String c(int i11, int i12) {
        return i2.t(i11 & 4294967295L, kotlin.text.a.a(i12));
    }

    @y0(version = "1.5")
    @m80.k
    public static final String d(short s11, int i11) {
        String num = Integer.toString(s11 & c2.f100412d, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(num, "toString(...)");
        return num;
    }

    @y0(version = "1.5")
    public static final byte e(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        o1 g11 = g(str);
        if (g11 != null) {
            return g11.k0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @y0(version = "1.5")
    public static final byte f(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        o1 h11 = h(str, i11);
        if (h11 != null) {
            return h11.k0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @m80.l
    @y0(version = "1.5")
    public static final o1 g(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return h(str, 10);
    }

    @m80.l
    @y0(version = "1.5")
    public static final o1 h(@m80.k String str, int i11) {
        int compare;
        kotlin.jvm.internal.g0.p(str, "<this>");
        s1 l11 = l(str, i11);
        if (l11 == null) {
            return null;
        }
        int m02 = l11.m0();
        compare = Integer.compare(m02 ^ Integer.MIN_VALUE, s1.i(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return o1.b(o1.i((byte) m02));
    }

    @y0(version = "1.5")
    public static final int i(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        s1 k11 = k(str);
        if (k11 != null) {
            return k11.m0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @y0(version = "1.5")
    public static final int j(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        s1 l11 = l(str, i11);
        if (l11 != null) {
            return l11.m0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @m80.l
    @y0(version = "1.5")
    public static final s1 k(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return l(str, 10);
    }

    @m80.l
    @y0(version = "1.5")
    public static final s1 l(@m80.k String str, int i11) {
        int i12;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.text.a.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.g0.t(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i12 = 0;
        }
        int i14 = s1.i(i11);
        int i15 = 119304647;
        while (i12 < length) {
            int b11 = kotlin.text.a.b(str.charAt(i12), i11);
            if (b11 < 0) {
                return null;
            }
            compare = Integer.compare(i13 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i15 == 119304647) {
                    i15 = j1.a(-1, i14);
                    compare3 = Integer.compare(i13 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int i16 = s1.i(i13 * i14);
            int i17 = s1.i(s1.i(b11) + i16);
            compare2 = Integer.compare(i17 ^ Integer.MIN_VALUE, i16 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i12++;
            i13 = i17;
        }
        return s1.b(i13);
    }

    @y0(version = "1.5")
    public static final long m(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        w1 o11 = o(str);
        if (o11 != null) {
            return o11.m0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @y0(version = "1.5")
    public static final long n(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        w1 p11 = p(str, i11);
        if (p11 != null) {
            return p11.m0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @m80.l
    @y0(version = "1.5")
    public static final w1 o(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return p(str, 10);
    }

    @m80.l
    @y0(version = "1.5")
    public static final w1 p(@m80.k String str, int i11) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.text.a.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.g0.t(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long i13 = w1.i(i11);
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i12 < length) {
            if (kotlin.text.a.b(str.charAt(i12), i11) < 0) {
                return null;
            }
            compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j12 == 512409557603043100L) {
                    j12 = m1.a(-1L, i13);
                    compare3 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long i14 = w1.i(j11 * i13);
            long i15 = w1.i(w1.i(s1.i(r13) & 4294967295L) + i14);
            compare2 = Long.compare(i15 ^ Long.MIN_VALUE, i14 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i12++;
            j11 = i15;
        }
        return w1.b(j11);
    }

    @y0(version = "1.5")
    public static final short q(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        c2 s11 = s(str);
        if (s11 != null) {
            return s11.k0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @y0(version = "1.5")
    public static final short r(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        c2 t11 = t(str, i11);
        if (t11 != null) {
            return t11.k0();
        }
        e0.m1(str);
        throw new KotlinNothingValueException();
    }

    @m80.l
    @y0(version = "1.5")
    public static final c2 s(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return t(str, 10);
    }

    @m80.l
    @y0(version = "1.5")
    public static final c2 t(@m80.k String str, int i11) {
        int compare;
        kotlin.jvm.internal.g0.p(str, "<this>");
        s1 l11 = l(str, i11);
        if (l11 == null) {
            return null;
        }
        int m02 = l11.m0();
        compare = Integer.compare(m02 ^ Integer.MIN_VALUE, s1.i(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return c2.b(c2.i((short) m02));
    }
}
