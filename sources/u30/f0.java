package u30;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1179#2,2:886\n1#3:888\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:886,2\n*E\n"})
/* loaded from: classes8.dex */
public class f0 extends e0 {
    @o00.f
    public static final String A1(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return new String(bytes, charset);
    }

    @m80.k
    public static final String A2(@m80.k String str, char c11, char c12, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        int I3 = k0.I3(str, c11, 0, z11, 2, null);
        return I3 < 0 ? str : k0.d5(str, I3, I3 + 1, String.valueOf(c12)).toString();
    }

    @o00.f
    public static final String B1(char[] chars) {
        kotlin.jvm.internal.g0.p(chars, "chars");
        return new String(chars);
    }

    @m80.k
    public static final String B2(@m80.k String str, @m80.k String oldValue, @m80.k String newValue, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(oldValue, "oldValue");
        kotlin.jvm.internal.g0.p(newValue, "newValue");
        int J3 = k0.J3(str, oldValue, 0, z11, 2, null);
        return J3 < 0 ? str : k0.d5(str, J3, oldValue.length() + J3, newValue).toString();
    }

    @o00.f
    public static final String C1(char[] chars, int i11, int i12) {
        kotlin.jvm.internal.g0.p(chars, "chars");
        return new String(chars, i11, i12);
    }

    public static /* synthetic */ String C2(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return A2(str, c11, c12, z11);
    }

    @o00.f
    public static final String D1(int[] codePoints, int i11, int i12) {
        kotlin.jvm.internal.g0.p(codePoints, "codePoints");
        return new String(codePoints, i11, i12);
    }

    public static /* synthetic */ String D2(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return B2(str, str2, str3, z11);
    }

    @yz.n(message = "Use replaceFirstChar instead.", replaceWith = @yz.w0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @m80.k
    @yz.o(warningSince = "1.5")
    public static final String E1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.g0.o(locale, "getDefault(...)");
        return F1(str, locale);
    }

    @m80.k
    public static final List<String> E2(@m80.k CharSequence charSequence, @m80.k Pattern regex, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        k0.h5(i11);
        if (i11 == 0) {
            i11 = -1;
        }
        String[] split = regex.split(charSequence, i11);
        kotlin.jvm.internal.g0.o(split, "split(...)");
        return a00.q.t(split);
    }

    @o00.i
    @y0(version = "1.4")
    @m80.k
    @yz.n(message = "Use replaceFirstChar instead.", replaceWith = @yz.w0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final String F1(@m80.k String str, @m80.k Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb2.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            kotlin.jvm.internal.g0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String substring2 = str.substring(1);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static /* synthetic */ List F2(CharSequence charSequence, Pattern pattern, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return E2(charSequence, pattern, i11);
    }

    @o00.f
    public static final int G1(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.codePointAt(i11);
    }

    public static boolean G2(@m80.k String str, @m80.k String prefix, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return !z11 ? str.startsWith(prefix, i11) : s2(str, i11, prefix, 0, prefix.length(), z11);
    }

    @o00.f
    public static final int H1(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.codePointBefore(i11);
    }

    public static boolean H2(@m80.k String str, @m80.k String prefix, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return !z11 ? str.startsWith(prefix) : s2(str, 0, prefix, 0, prefix.length(), z11);
    }

    @o00.f
    public static final int I1(String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.codePointCount(i11, i12);
    }

    public static /* synthetic */ boolean I2(String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return G2(str, str2, i11, z11);
    }

    public static int J1(@m80.k String str, @m80.k String other, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return z11 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ boolean J2(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return H2(str, str2, z11);
    }

    public static /* synthetic */ int K1(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return J1(str, str2, z11);
    }

    @o00.f
    public static final String K2(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String substring = str.substring(i11);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @y0(version = "1.4")
    @m80.k
    public static String L1(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return new String(cArr);
    }

    @o00.f
    public static final String L2(String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String substring = str.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @y0(version = "1.4")
    @m80.k
    public static String M1(@m80.k char[] cArr, int i11, int i12) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        a00.d.Companion.a(i11, i12, cArr.length);
        return new String(cArr, i11, i12 - i11);
    }

    @o00.f
    public static final byte[] M2(String str, Charset charset) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ String N1(char[] cArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = cArr.length;
        }
        return M1(cArr, i11, i12);
    }

    public static /* synthetic */ byte[] N2(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = d.f91599b;
        }
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @y0(version = "1.5")
    public static boolean O1(@m80.l CharSequence charSequence, @m80.l CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? k0.p3(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @o00.f
    public static final char[] O2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.g0.o(charArray, "toCharArray(...)");
        return charArray;
    }

    @y0(version = "1.5")
    public static final boolean P1(@m80.l CharSequence charSequence, @m80.l CharSequence charSequence2, boolean z11) {
        return z11 ? k0.o3(charSequence, charSequence2) : O1(charSequence, charSequence2);
    }

    @y0(version = "1.4")
    @m80.k
    public static final char[] P2(@m80.k String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        a00.d.Companion.a(i11, i12, str.length());
        char[] cArr = new char[i12 - i11];
        str.getChars(i11, i12, cArr, 0);
        return cArr;
    }

    @o00.f
    public static final boolean Q1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @o00.f
    public static final char[] Q2(String str, char[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        str.getChars(i12, i13, destination, i11);
        return destination;
    }

    @o00.f
    public static final boolean R1(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static /* synthetic */ char[] R2(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return P2(str, i11, i12);
    }

    @yz.n(message = "Use replaceFirstChar instead.", replaceWith = @yz.w0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @m80.k
    @yz.o(warningSince = "1.5")
    public static final String S1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.g0.o(locale, "getDefault(...)");
        kotlin.jvm.internal.g0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static /* synthetic */ char[] S2(String str, char[] destination, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = str.length();
        }
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        str.getChars(i12, i13, destination, i11);
        return destination;
    }

    @o00.i
    @y0(version = "1.4")
    @m80.k
    @yz.n(message = "Use replaceFirstChar instead.", replaceWith = @yz.w0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @yz.o(warningSince = "1.5")
    public static final String T1(@m80.k String str, @m80.k Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        kotlin.jvm.internal.g0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @yz.n(message = "Use lowercase() instead.", replaceWith = @yz.w0(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.5")
    public static final String T2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @y0(version = "1.4")
    @m80.k
    public static String U1(@m80.k byte[] bArr) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return new String(bArr, d.f91599b);
    }

    @yz.n(message = "Use lowercase() instead.", replaceWith = @yz.w0(expression = "lowercase(locale)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.5")
    public static final String U2(String str, Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @y0(version = "1.4")
    @m80.k
    public static final String V1(@m80.k byte[] bArr, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        a00.d.Companion.a(i11, i12, bArr.length);
        if (!z11) {
            return new String(bArr, i11, i12 - i11, d.f91599b);
        }
        CharsetDecoder newDecoder = d.f91599b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i11, i12 - i11)).toString();
        kotlin.jvm.internal.g0.o(charBuffer, "toString(...)");
        return charBuffer;
    }

    @o00.f
    public static final Pattern V2(String str, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i11);
        kotlin.jvm.internal.g0.o(compile, "compile(...)");
        return compile;
    }

    public static /* synthetic */ String W1(byte[] bArr, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return V1(bArr, i11, i12, z11);
    }

    public static /* synthetic */ Pattern W2(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.g0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i11);
        kotlin.jvm.internal.g0.o(compile, "compile(...)");
        return compile;
    }

    @y0(version = "1.4")
    @m80.k
    public static byte[] X1(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        byte[] bytes = str.getBytes(d.f91599b);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @yz.n(message = "Use uppercase() instead.", replaceWith = @yz.w0(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.5")
    public static final String X2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @y0(version = "1.4")
    @m80.k
    public static final byte[] Y1(@m80.k String str, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        a00.d.Companion.a(i11, i12, str.length());
        if (!z11) {
            String substring = str.substring(i11, i12);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            Charset charset = d.f91599b;
            kotlin.jvm.internal.g0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder newEncoder = d.f91599b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i11, i12));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.g0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.g0.m(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @yz.n(message = "Use uppercase() instead.", replaceWith = @yz.w0(expression = "uppercase(locale)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.5")
    public static final String Y2(String str, Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] Z1(String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return Y1(str, i11, i12, z11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final String Z2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean a2(@m80.k String str, @m80.k String suffix, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        return !z11 ? str.endsWith(suffix) : s2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    @y0(version = "1.5")
    @o00.f
    public static final String a3(String str, Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean b2(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a2(str, str2, z11);
    }

    public static boolean c2(@m80.l String str, @m80.l String str2, boolean z11) {
        return str == null ? str2 == null : !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean d2(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c2(str, str2, z11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final String e2(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(args, "args");
        String format = String.format(locale, str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    @o00.f
    public static final String f2(String str, Object... args) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(args, "args");
        String format = String.format(str, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        return format;
    }

    @o00.f
    public static final String g2(kotlin.jvm.internal.w0 w0Var, String format, Object... args) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        kotlin.jvm.internal.g0.p(args, "args");
        String format2 = String.format(format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.g0.o(format2, "format(...)");
        return format2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final String h2(kotlin.jvm.internal.w0 w0Var, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        kotlin.jvm.internal.g0.p(args, "args");
        String format2 = String.format(locale, format, Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.g0.o(format2, "format(...)");
        return format2;
    }

    @m80.k
    public static Comparator<String> i2(@m80.k kotlin.jvm.internal.w0 w0Var) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.g0.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @o00.f
    public static final String j2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String intern = str.intern();
        kotlin.jvm.internal.g0.o(intern, "intern(...)");
        return intern;
    }

    @y0(version = "1.5")
    @o00.f
    public static final String k2(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @y0(version = "1.5")
    @o00.f
    public static final String l2(String str, Locale locale) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @o00.f
    public static final int m2(String str, char c11, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.indexOf(c11, i11);
    }

    @o00.f
    public static final int n2(String str, String str2, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(str2, "str");
        return str.indexOf(str2, i11);
    }

    @o00.f
    public static final int o2(String str, char c11, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.lastIndexOf(c11, i11);
    }

    @o00.f
    public static final int p2(String str, String str2, int i11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(str2, "str");
        return str.lastIndexOf(str2, i11);
    }

    @o00.f
    public static final int q2(String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.offsetByCodePoints(i11, i12);
    }

    public static final boolean r2(@m80.k CharSequence charSequence, int i11, @m80.k CharSequence other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? s2((String) charSequence, i11, (String) other, i12, i13, z11) : k0.v4(charSequence, i11, other, i12, i13, z11);
    }

    public static boolean s2(@m80.k String str, int i11, @m80.k String other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return !z11 ? str.regionMatches(i11, other, i12, i13) : str.regionMatches(z11, i11, other, i12, i13);
    }

    public static /* synthetic */ boolean t2(CharSequence charSequence, int i11, CharSequence charSequence2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return r2(charSequence, i11, charSequence2, i12, i13, z11);
    }

    public static /* synthetic */ boolean u2(String str, int i11, String str2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return s2(str, i11, str2, i12, i13, z11);
    }

    @o00.f
    public static final String v1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.g0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @m80.k
    public static String v2(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i11 + '.').toString());
        }
        if (i11 == 0) {
            return "";
        }
        int i12 = 1;
        if (i11 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                cArr[i13] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i11);
        if (1 <= i11) {
            while (true) {
                sb2.append(charSequence);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.m(sb3);
        return sb3;
    }

    @o00.f
    public static final String w1(StringBuilder stringBuilder) {
        kotlin.jvm.internal.g0.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @m80.k
    public static final String w2(@m80.k String str, char c11, char c12, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (!z11) {
            String replace = str.replace(c11, c12);
            kotlin.jvm.internal.g0.o(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (c.J(charAt, c11, z11)) {
                charAt = c12;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    @o00.f
    public static final String x1(byte[] bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return new String(bytes, d.f91599b);
    }

    @m80.k
    public static final String x2(@m80.k String str, @m80.k String oldValue, @m80.k String newValue, boolean z11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(oldValue, "oldValue");
        kotlin.jvm.internal.g0.p(newValue, "newValue");
        int i11 = 0;
        int F3 = k0.F3(str, oldValue, 0, z11);
        if (F3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int u11 = g10.u.u(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i11, F3);
            sb2.append(newValue);
            i11 = F3 + length;
            if (F3 >= str.length()) {
                break;
            }
            F3 = k0.F3(str, oldValue, F3 + u11, z11);
        } while (F3 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @o00.f
    public static final String y1(byte[] bytes, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return new String(bytes, i11, i12, d.f91599b);
    }

    public static /* synthetic */ String y2(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return w2(str, c11, c12, z11);
    }

    @o00.f
    public static final String z1(byte[] bytes, int i11, int i12, Charset charset) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return new String(bytes, i11, i12, charset);
    }

    public static /* synthetic */ String z2(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return x2(str, str2, str3, z11);
    }
}
