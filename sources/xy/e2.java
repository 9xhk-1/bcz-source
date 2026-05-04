package xy;

import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nio/ktor/util/TextKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,122:1\n158#2,6:123\n158#2,6:129\n*S KotlinDebug\n*F\n+ 1 Text.kt\nio/ktor/util/TextKt\n*L\n48#1:123,6\n71#1:129,6\n*E\n"})
/* loaded from: classes8.dex */
public final class e2 {
    @m80.k
    public static final u a(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return new u(str);
    }

    @m80.k
    public static final Pair<String, String> b(@m80.k String str, @m80.k String separator, @m80.k x00.a<Pair<String, String>> onMissingDelimiter) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(separator, "separator");
        kotlin.jvm.internal.g0.p(onMissingDelimiter, "onMissingDelimiter");
        int J3 = u30.k0.J3(str, separator, 0, false, 6, null);
        if (J3 == -1) {
            return onMissingDelimiter.invoke();
        }
        String substring = str.substring(0, J3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        String substring2 = str.substring(J3 + separator.length());
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        return yz.h1.a(substring, substring2);
    }

    @m80.k
    public static final String c(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\"') {
                sb2.append("&quot;");
            } else if (charAt == '<') {
                sb2.append("&lt;");
            } else if (charAt == '>') {
                sb2.append("&gt;");
            } else if (charAt == '&') {
                sb2.append("&amp;");
            } else if (charAt != '\'') {
                sb2.append(charAt);
            } else {
                sb2.append("&#x27;");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final char d(char c11) {
        return ('A' > c11 || c11 >= '[') ? (c11 < 0 || c11 >= 128) ? Character.toLowerCase(c11) : c11 : (char) (c11 + ' ');
    }

    @m80.k
    public static final String e(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char charAt = str.charAt(i11);
            if (d(charAt) != charAt) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i11);
        int A3 = u30.k0.A3(str);
        if (i11 <= A3) {
            while (true) {
                sb2.append(d(str.charAt(i11)));
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    public static final char f(char c11) {
        return ('a' > c11 || c11 >= '{') ? (c11 < 0 || c11 >= 128) ? Character.toLowerCase(c11) : c11 : (char) (c11 - ' ');
    }

    @m80.k
    public static final String g(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char charAt = str.charAt(i11);
            if (f(charAt) != charAt) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i11);
        int A3 = u30.k0.A3(str);
        if (i11 <= A3) {
            while (true) {
                sb2.append(f(str.charAt(i11)));
                if (i11 == A3) {
                    break;
                }
                i11++;
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }
}
