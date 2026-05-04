package u30;

import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes8.dex */
public class c extends kotlin.text.a {
    @y0(version = "1.5")
    public static final char D(int i11) {
        if (i11 >= 0 && i11 < 10) {
            return (char) (i11 + 48);
        }
        throw new IllegalArgumentException("Int " + i11 + " is not a decimal digit");
    }

    @y0(version = "1.5")
    public static final char E(int i11, int i12) {
        if (2 > i12 || i12 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i12 + ". Valid radix values are in range 2..36");
        }
        if (i11 >= 0 && i11 < i12) {
            return (char) (i11 < 10 ? i11 + 48 : ((char) (i11 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i11 + " does not represent a valid digit in radix " + i12);
    }

    @y0(version = "1.5")
    public static final int F(char c11) {
        int b11 = kotlin.text.a.b(c11, 10);
        if (b11 >= 0) {
            return b11;
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a decimal digit");
    }

    @y0(version = "1.5")
    public static final int G(char c11, int i11) {
        Integer I = I(c11, i11);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a digit in the given radix=" + i11);
    }

    @m80.l
    @y0(version = "1.5")
    public static final Integer H(char c11) {
        Integer valueOf = Integer.valueOf(kotlin.text.a.b(c11, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @m80.l
    @y0(version = "1.5")
    public static final Integer I(char c11, int i11) {
        kotlin.text.a.a(i11);
        Integer valueOf = Integer.valueOf(kotlin.text.a.b(c11, i11));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c11, char c12, boolean z11) {
        if (c11 == c12) {
            return true;
        }
        if (!z11) {
            return false;
        }
        char upperCase = Character.toUpperCase(c11);
        char upperCase2 = Character.toUpperCase(c12);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return J(c11, c12, z11);
    }

    public static boolean L(char c11) {
        return 55296 <= c11 && c11 < 57344;
    }

    @o00.f
    public static final String M(char c11, String other) {
        kotlin.jvm.internal.g0.p(other, "other");
        return c11 + other;
    }

    @y0(version = "1.5")
    @m80.k
    public static String N(char c11) {
        return x0.a(c11);
    }
}
