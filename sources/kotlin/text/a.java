package kotlin.text;

import g10.l;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import m80.k;
import o00.f;
import yz.n;
import yz.o;
import yz.v0;
import yz.w0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a {
    @y0(version = "1.5")
    @f
    public static final String A(char c11) {
        String valueOf = String.valueOf(c11);
        g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @y0(version = "1.5")
    @k
    public static final String B(char c11, @k Locale locale) {
        g0.p(locale, "locale");
        String valueOf = String.valueOf(c11);
        g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @y0(version = "1.5")
    @f
    public static final char C(char c11) {
        return Character.toUpperCase(c11);
    }

    @v0
    public static int a(int i11) {
        if (2 <= i11 && i11 < 37) {
            return i11;
        }
        throw new IllegalArgumentException("radix " + i11 + " was not in valid range " + new l(2, 36));
    }

    public static final int b(char c11, int i11) {
        return Character.digit((int) c11, i11);
    }

    @k
    public static final CharCategory c(char c11) {
        return CharCategory.Companion.a(Character.getType(c11));
    }

    @k
    public static final CharDirectionality d(char c11) {
        return CharDirectionality.Companion.b(Character.getDirectionality(c11));
    }

    @f
    public static final boolean e(char c11) {
        return Character.isDefined(c11);
    }

    @f
    public static final boolean f(char c11) {
        return Character.isDigit(c11);
    }

    @f
    public static final boolean g(char c11) {
        return Character.isHighSurrogate(c11);
    }

    @f
    public static final boolean h(char c11) {
        return Character.isISOControl(c11);
    }

    @f
    public static final boolean i(char c11) {
        return Character.isIdentifierIgnorable(c11);
    }

    @f
    public static final boolean j(char c11) {
        return Character.isJavaIdentifierPart(c11);
    }

    @f
    public static final boolean k(char c11) {
        return Character.isJavaIdentifierStart(c11);
    }

    @f
    public static final boolean l(char c11) {
        return Character.isLetter(c11);
    }

    @f
    public static final boolean m(char c11) {
        return Character.isLetterOrDigit(c11);
    }

    @f
    public static final boolean n(char c11) {
        return Character.isLowSurrogate(c11);
    }

    @f
    public static final boolean o(char c11) {
        return Character.isLowerCase(c11);
    }

    @f
    public static final boolean p(char c11) {
        return Character.isTitleCase(c11);
    }

    @f
    public static final boolean q(char c11) {
        return Character.isUpperCase(c11);
    }

    public static boolean r(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }

    @y0(version = "1.5")
    @f
    public static final String s(char c11) {
        String valueOf = String.valueOf(c11);
        g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @y0(version = "1.5")
    @k
    public static String t(char c11, @k Locale locale) {
        g0.p(locale, "locale");
        String valueOf = String.valueOf(c11);
        g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @y0(version = "1.5")
    @f
    public static final char u(char c11) {
        return Character.toLowerCase(c11);
    }

    @y0(version = "1.5")
    @k
    public static String v(char c11, @k Locale locale) {
        g0.p(locale, "locale");
        String B = B(c11, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c11);
            g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            g0.o(upperCase, "toUpperCase(...)");
            if (g0.g(B, upperCase)) {
                return String.valueOf(Character.toTitleCase(c11));
            }
        } else if (c11 != 329) {
            char charAt = B.charAt(0);
            g0.n(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            g0.o(substring, "substring(...)");
            g0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            g0.o(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
        return B;
    }

    @y0(version = "1.5")
    @f
    public static final char w(char c11) {
        return Character.toTitleCase(c11);
    }

    @n(message = "Use lowercaseChar() instead.", replaceWith = @w0(expression = "lowercaseChar()", imports = {}))
    @f
    @o(errorSince = "2.1", warningSince = "1.5")
    public static final char x(char c11) {
        return Character.toLowerCase(c11);
    }

    @n(message = "Use titlecaseChar() instead.", replaceWith = @w0(expression = "titlecaseChar()", imports = {}))
    @f
    @o(errorSince = "2.1", warningSince = "1.5")
    public static final char y(char c11) {
        return Character.toTitleCase(c11);
    }

    @n(message = "Use uppercaseChar() instead.", replaceWith = @w0(expression = "uppercaseChar()", imports = {}))
    @f
    @o(errorSince = "2.1", warningSince = "1.5")
    public static final char z(char c11) {
        return Character.toUpperCase(c11);
    }
}
