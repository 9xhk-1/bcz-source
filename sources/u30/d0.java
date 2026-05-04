package u30;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n267#1,7:513\n267#1,7:520\n267#1,7:527\n267#1,7:534\n1#2:541\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:513,7\n173#1:520,7\n253#1:527,7\n264#1:534,7\n*E\n"})
/* loaded from: classes8.dex */
public class d0 extends c0 {
    @o00.f
    public static final int E0(String str, int i11, int i12, boolean z11, x00.l<? super Character, Boolean> lVar) {
        boolean z12;
        int i13 = i11;
        while (i13 <= i12 && lVar.invoke(Character.valueOf(str.charAt(i13))).booleanValue()) {
            i13++;
        }
        boolean z13 = i11 != i13;
        if (i13 > i12) {
            if (z11) {
                return -1;
            }
            return i13;
        }
        if (str.charAt(i13) == '.') {
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 <= i12 && lVar.invoke(Character.valueOf(str.charAt(i15))).booleanValue()) {
                i15++;
            }
            z12 = i14 != i15;
            i13 = i15;
        } else {
            z12 = false;
        }
        if (z13 || z12) {
            return i13;
        }
        if (z11) {
            return -1;
        }
        String str2 = i12 == i13 + 2 ? "NaN" : i12 == i13 + 7 ? "Infinity" : null;
        if (str2 != null && k0.F3(str, str2, i13, false) == i13) {
            return i12 + 1;
        }
        return -1;
    }

    @o00.f
    public static final int F0(String str, int i11, int i12, x00.l<? super Character, Boolean> lVar) {
        while (i11 <= i12 && lVar.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        return i11;
    }

    @o00.f
    public static final int G0(char c11) {
        return c11 | ' ';
    }

    @o00.f
    public static final int H0(String str, int i11, int i12, x00.l<? super Character, Boolean> lVar) {
        while (i12 > i11 && lVar.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12--;
        }
        return i12;
    }

    @o00.f
    public static final String I0(int i11, int i12) {
        if (i12 == i11 + 2) {
            return "NaN";
        }
        if (i12 == i11 + 7) {
            return "Infinity";
        }
        return null;
    }

    @o00.f
    public static final boolean J0(char c11) {
        return ((c11 + 65488) & 65535) < 10;
    }

    @o00.f
    public static final boolean K0(char c11) {
        return (((c11 | ' ') + (-97)) & 65535) < 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean L0(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u30.d0.L0(java.lang.String):boolean");
    }

    public static final <T> T M0(String str, x00.l<? super String, ? extends T> lVar) {
        try {
            if (L0(str)) {
                return lVar.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal N0(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigDecimal O0(String str, MathContext mathContext) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @m80.l
    @y0(version = "1.2")
    public static BigDecimal P0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        try {
            if (L0(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @m80.l
    @y0(version = "1.2")
    public static final BigDecimal Q0(@m80.k String str, @m80.k MathContext mathContext) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(mathContext, "mathContext");
        try {
            if (L0(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger R0(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return new BigInteger(str);
    }

    @y0(version = "1.2")
    @o00.f
    public static final BigInteger S0(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return new BigInteger(str, kotlin.text.a.a(i11));
    }

    @m80.l
    @y0(version = "1.2")
    public static final BigInteger T0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return U0(str, 10);
    }

    @m80.l
    @y0(version = "1.2")
    public static final BigInteger U0(@m80.k String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.text.a.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i12 = str.charAt(0) == '-' ? 1 : 0; i12 < length; i12++) {
                if (kotlin.text.a.b(str.charAt(i12), i11) < 0) {
                    return null;
                }
            }
        } else if (kotlin.text.a.b(str.charAt(0), i11) < 0) {
            return null;
        }
        return new BigInteger(str, kotlin.text.a.a(i11));
    }

    @y0(version = "1.4")
    @o00.f
    public static final boolean V0(String str) {
        return Boolean.parseBoolean(str);
    }

    @o00.f
    public static final byte W0(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @y0(version = "1.1")
    @o00.f
    public static final byte X0(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Byte.parseByte(str, kotlin.text.a.a(i11));
    }

    @o00.f
    public static final double Y0(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @m80.l
    @y0(version = "1.1")
    public static Double Z0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        try {
            if (L0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @o00.f
    public static final float a1(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @m80.l
    @y0(version = "1.1")
    public static Float b1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        try {
            if (L0(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @o00.f
    public static final int c1(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @y0(version = "1.1")
    @o00.f
    public static final int d1(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Integer.parseInt(str, kotlin.text.a.a(i11));
    }

    @o00.f
    public static final long e1(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @y0(version = "1.1")
    @o00.f
    public static final long f1(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Long.parseLong(str, kotlin.text.a.a(i11));
    }

    @o00.f
    public static final short g1(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @y0(version = "1.1")
    @o00.f
    public static final short h1(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return Short.parseShort(str, kotlin.text.a.a(i11));
    }

    @y0(version = "1.1")
    @o00.f
    public static final String i1(byte b11, int i11) {
        String num = Integer.toString(b11, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(num, "toString(...)");
        return num;
    }

    @y0(version = "1.1")
    @o00.f
    public static final String j1(int i11, int i12) {
        String num = Integer.toString(i11, kotlin.text.a.a(i12));
        kotlin.jvm.internal.g0.o(num, "toString(...)");
        return num;
    }

    @y0(version = "1.1")
    @o00.f
    public static final String k1(long j11, int i11) {
        String l11 = Long.toString(j11, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(l11, "toString(...)");
        return l11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final String l1(short s11, int i11) {
        String num = Integer.toString(s11, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(num, "toString(...)");
        return num;
    }
}
