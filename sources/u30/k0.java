package u30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import yz.h1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1580:1\n78#1,22:1581\n112#1,5:1603\n129#1,5:1608\n78#1,22:1613\n106#1:1635\n78#1,22:1636\n112#1,5:1658\n123#1:1663\n112#1,5:1664\n129#1,5:1669\n140#1:1674\n129#1,5:1675\n78#1,22:1680\n112#1,5:1702\n129#1,5:1707\n1069#2,2:1712\n13050#3,2:1714\n13050#3,2:1716\n295#4,2:1718\n295#4,2:1720\n1563#4:1723\n1634#4,3:1724\n1563#4:1727\n1634#4,3:1728\n1#5:1722\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1581,22\n123#1:1603,5\n140#1:1608,5\n145#1:1613,22\n150#1:1635\n150#1:1636,22\n155#1:1658,5\n160#1:1663\n160#1:1664,5\n165#1:1669,5\n170#1:1674\n170#1:1675,5\n175#1:1680,22\n186#1:1702,5\n197#1:1707,5\n310#1:1712,2\n967#1:1714,2\n991#1:1716,2\n1030#1:1718,2\n1036#1:1720,2\n1401#1:1723\n1401#1:1724,3\n1427#1:1727\n1427#1:1728,3\n*E\n"})
/* loaded from: classes8.dex */
public class k0 extends f0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a00.e0 {

        /* renamed from: a, reason: collision with root package name */
        public int f91678a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f91679b;

        public a(CharSequence charSequence) {
            this.f91679b = charSequence;
        }

        @Override // a00.e0
        public char b() {
            CharSequence charSequence = this.f91679b;
            int i11 = this.f91678a;
            this.f91678a = i11 + 1;
            return charSequence.charAt(i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91678a < this.f91679b.length();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,731:1\n1487#2:732\n*E\n"})
    public static final class b implements q30.m<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f91680a;

        public b(CharSequence charSequence) {
            this.f91680a = charSequence;
        }

        @Override // q30.m
        public Iterator<String> iterator() {
            return new k(this.f91680a);
        }
    }

    public static int A3(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @o00.f
    public static final String A4(String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return y4(str, i11, i12).toString();
    }

    public static /* synthetic */ boolean A5(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return x5(charSequence, c11, z11);
    }

    public static final boolean B3(@m80.k CharSequence charSequence, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return i11 >= 0 && i11 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i11)) && Character.isLowSurrogate(charSequence.charAt(i11 + 1));
    }

    @o00.f
    public static final String B4(String str, g10.l range) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        return z4(str, range).toString();
    }

    public static /* synthetic */ boolean B5(CharSequence charSequence, CharSequence charSequence2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return y5(charSequence, charSequence2, i11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @o00.f
    public static final <C extends CharSequence & R, R> R C3(C c11, x00.a<? extends R> defaultValue) {
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return O3(c11) ? defaultValue.invoke() : c11;
    }

    @m80.k
    public static final CharSequence C4(@m80.k CharSequence charSequence, @m80.k CharSequence suffix) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        return t3(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static /* synthetic */ boolean C5(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return z5(charSequence, charSequence2, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @y0(version = "1.3")
    @o00.f
    public static final <C extends CharSequence & R, R> R D3(C c11, x00.a<? extends R> defaultValue) {
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return c11.length() == 0 ? defaultValue.invoke() : c11;
    }

    @m80.k
    public static String D4(@m80.k String str, @m80.k CharSequence suffix) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        if (!t3(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @m80.k
    public static final CharSequence D5(@m80.k CharSequence charSequence, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static final int E3(@m80.k CharSequence charSequence, char c11, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return (z11 || !(charSequence instanceof String)) ? L3(charSequence, new char[]{c11}, i11, z11) : ((String) charSequence).indexOf(c11, i11);
    }

    @m80.k
    public static final CharSequence E4(@m80.k CharSequence charSequence, @m80.k CharSequence delimiter) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        return F4(charSequence, delimiter, delimiter);
    }

    @yz.n(message = "Use parameters named startIndex and endIndex.", replaceWith = @yz.w0(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @o00.f
    public static final CharSequence E5(String str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return str.subSequence(i11, i12);
    }

    public static final int F3(@m80.k CharSequence charSequence, @m80.k String string, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(string, "string");
        return (z11 || !(charSequence instanceof String)) ? H3(charSequence, string, i11, charSequence.length(), z11, false, 16, null) : ((String) charSequence).indexOf(string, i11);
    }

    @m80.k
    public static final CharSequence F4(@m80.k CharSequence charSequence, @m80.k CharSequence prefix, @m80.k CharSequence suffix) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && C5(charSequence, prefix, false, 2, null) && t3(charSequence, suffix, false, 2, null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @o00.f
    public static final String F5(CharSequence charSequence, int i11, int i12) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.subSequence(i11, i12).toString();
    }

    public static final int G3(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        g10.j lVar = !z12 ? new g10.l(g10.u.u(i11, 0), g10.u.B(i12, charSequence.length())) : g10.u.k0(g10.u.B(i11, A3(charSequence)), g10.u.u(i12, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int d11 = lVar.d();
            int f11 = lVar.f();
            int g11 = lVar.g();
            if ((g11 <= 0 || d11 > f11) && (g11 >= 0 || f11 > d11)) {
                return -1;
            }
            int i13 = d11;
            while (true) {
                String str = (String) charSequence2;
                boolean z13 = z11;
                if (f0.s2(str, 0, (String) charSequence, i13, str.length(), z13)) {
                    return i13;
                }
                if (i13 == f11) {
                    return -1;
                }
                i13 += g11;
                z11 = z13;
            }
        } else {
            boolean z14 = z11;
            int d12 = lVar.d();
            int f12 = lVar.f();
            int g12 = lVar.g();
            if ((g12 <= 0 || d12 > f12) && (g12 >= 0 || f12 > d12)) {
                return -1;
            }
            int i14 = d12;
            while (true) {
                boolean z15 = z14;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z14 = z15;
                if (v4(charSequence4, 0, charSequence3, i14, charSequence2.length(), z15)) {
                    return i14;
                }
                if (i14 == f12) {
                    return -1;
                }
                i14 += g12;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @m80.k
    public static String G4(@m80.k String str, @m80.k CharSequence delimiter) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        return H4(str, delimiter, delimiter);
    }

    @m80.k
    public static String G5(@m80.k CharSequence charSequence, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        return G3(charSequence, charSequence2, i11, i12, z11, z12);
    }

    @m80.k
    public static final String H4(@m80.k String str, @m80.k CharSequence prefix, @m80.k CharSequence suffix) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !C5(str, prefix, false, 2, null) || !t3(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @m80.k
    public static String H5(@m80.k String str, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int I3(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return E3(charSequence, c11, i11, z11);
    }

    @o00.f
    public static final String I4(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    public static /* synthetic */ String I5(CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = charSequence.length();
        }
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.subSequence(i11, i12).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return F3(charSequence, str, i11, z11);
    }

    @o00.f
    public static final String J4(CharSequence charSequence, Regex regex, x00.l<? super o, ? extends CharSequence> transform) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        kotlin.jvm.internal.g0.p(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    @m80.k
    public static String J5(@m80.k String str, char c11, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int I3 = I3(str, c11, 0, false, 6, null);
        if (I3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(I3 + 1, str.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final int K3(@m80.k CharSequence charSequence, @m80.k Collection<String> strings, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(strings, "strings");
        Pair<Integer, String> v32 = v3(charSequence, strings, i11, z11, false);
        if (v32 != null) {
            return v32.getFirst().intValue();
        }
        return -1;
    }

    @m80.k
    public static final String K4(@m80.k String str, char c11, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int I3 = I3(str, c11, 0, false, 6, null);
        return I3 == -1 ? missingDelimiterValue : d5(str, I3 + 1, str.length(), replacement).toString();
    }

    @m80.k
    public static String K5(@m80.k String str, @m80.k String delimiter, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int J3 = J3(str, delimiter, 0, false, 6, null);
        if (J3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(J3 + delimiter.length(), str.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final int L3(@m80.k CharSequence charSequence, @m80.k char[] chars, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(a00.a0.qt(chars), i11);
        }
        int u11 = g10.u.u(i11, 0);
        int A3 = A3(charSequence);
        if (u11 > A3) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(u11);
            for (char c11 : chars) {
                if (c.J(c11, charAt, z11)) {
                    return u11;
                }
            }
            if (u11 == A3) {
                return -1;
            }
            u11++;
        }
    }

    @m80.k
    public static final String L4(@m80.k String str, @m80.k String delimiter, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int J3 = J3(str, delimiter, 0, false, 6, null);
        return J3 == -1 ? missingDelimiterValue : d5(str, J3 + delimiter.length(), str.length(), replacement).toString();
    }

    public static /* synthetic */ String L5(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return J5(str, c11, str2);
    }

    public static /* synthetic */ int M3(CharSequence charSequence, Collection collection, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return K3(charSequence, collection, i11, z11);
    }

    public static /* synthetic */ String M4(String str, char c11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = str;
        }
        return K4(str, c11, str2, str3);
    }

    public static /* synthetic */ String M5(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return K5(str, str2, str3);
    }

    public static /* synthetic */ int N3(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return L3(charSequence, cArr, i11, z11);
    }

    public static /* synthetic */ String N4(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str4 = str;
        }
        return L4(str, str2, str3, str4);
    }

    @m80.k
    public static String N5(@m80.k String str, char c11, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int X3 = X3(str, c11, 0, false, 6, null);
        if (X3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(X3 + 1, str.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static boolean O3(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!kotlin.text.a.r(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    @m80.k
    public static final String O4(@m80.k String str, char c11, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int X3 = X3(str, c11, 0, false, 6, null);
        return X3 == -1 ? missingDelimiterValue : d5(str, X3 + 1, str.length(), replacement).toString();
    }

    @m80.k
    public static String O5(@m80.k String str, @m80.k String delimiter, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int Y3 = Y3(str, delimiter, 0, false, 6, null);
        if (Y3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(Y3 + delimiter.length(), str.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @o00.f
    public static final boolean P3(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @m80.k
    public static final String P4(@m80.k String str, @m80.k String delimiter, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int Y3 = Y3(str, delimiter, 0, false, 6, null);
        return Y3 == -1 ? missingDelimiterValue : d5(str, Y3 + delimiter.length(), str.length(), replacement).toString();
    }

    public static /* synthetic */ String P5(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return N5(str, c11, str2);
    }

    @o00.f
    public static final boolean Q3(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return !O3(charSequence);
    }

    public static /* synthetic */ String Q4(String str, char c11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = str;
        }
        return O4(str, c11, str2, str3);
    }

    public static /* synthetic */ String Q5(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return O5(str, str2, str3);
    }

    @o00.f
    public static final boolean R3(CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    public static /* synthetic */ String R4(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str4 = str;
        }
        return P4(str, str2, str3, str4);
    }

    @m80.k
    public static String R5(@m80.k String str, char c11, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int I3 = I3(str, c11, 0, false, 6, null);
        if (I3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, I3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @o00.f
    public static final boolean S3(CharSequence charSequence) {
        return charSequence == null || O3(charSequence);
    }

    @m80.k
    public static final String S4(@m80.k String str, char c11, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int I3 = I3(str, c11, 0, false, 6, null);
        return I3 == -1 ? missingDelimiterValue : d5(str, 0, I3, replacement).toString();
    }

    @m80.k
    public static final String S5(@m80.k String str, @m80.k String delimiter, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int J3 = J3(str, delimiter, 0, false, 6, null);
        if (J3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, J3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @o00.f
    public static final boolean T3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @m80.k
    public static final String T4(@m80.k String str, @m80.k String delimiter, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int J3 = J3(str, delimiter, 0, false, 6, null);
        return J3 == -1 ? missingDelimiterValue : d5(str, 0, J3, replacement).toString();
    }

    public static /* synthetic */ String T5(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return R5(str, c11, str2);
    }

    @m80.k
    public static final a00.e0 U3(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    public static /* synthetic */ String U4(String str, char c11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = str;
        }
        return S4(str, c11, str2, str3);
    }

    public static /* synthetic */ String U5(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return S5(str, str2, str3);
    }

    public static final int V3(@m80.k CharSequence charSequence, char c11, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return (z11 || !(charSequence instanceof String)) ? a4(charSequence, new char[]{c11}, i11, z11) : ((String) charSequence).lastIndexOf(c11, i11);
    }

    public static /* synthetic */ String V4(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str4 = str;
        }
        return T4(str, str2, str3, str4);
    }

    @m80.k
    public static final String V5(@m80.k String str, char c11, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int X3 = X3(str, c11, 0, false, 6, null);
        if (X3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, X3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final int W3(@m80.k CharSequence charSequence, @m80.k String string, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(string, "string");
        return (z11 || !(charSequence instanceof String)) ? G3(charSequence, string, i11, 0, z11, true) : ((String) charSequence).lastIndexOf(string, i11);
    }

    @m80.k
    public static final String W4(@m80.k String str, char c11, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int X3 = X3(str, c11, 0, false, 6, null);
        return X3 == -1 ? missingDelimiterValue : d5(str, 0, X3, replacement).toString();
    }

    @m80.k
    public static String W5(@m80.k String str, @m80.k String delimiter, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int Y3 = Y3(str, delimiter, 0, false, 6, null);
        if (Y3 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, Y3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ int X3(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = A3(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return V3(charSequence, c11, i11, z11);
    }

    @m80.k
    public static final String X4(@m80.k String str, @m80.k String delimiter, @m80.k String replacement, @m80.k String missingDelimiterValue) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(delimiter, "delimiter");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        kotlin.jvm.internal.g0.p(missingDelimiterValue, "missingDelimiterValue");
        int Y3 = Y3(str, delimiter, 0, false, 6, null);
        return Y3 == -1 ? missingDelimiterValue : d5(str, 0, Y3, replacement).toString();
    }

    public static /* synthetic */ String X5(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return V5(str, c11, str2);
    }

    public static /* synthetic */ int Y3(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = A3(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return W3(charSequence, str, i11, z11);
    }

    public static /* synthetic */ String Y4(String str, char c11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = str;
        }
        return W4(str, c11, str2, str3);
    }

    public static /* synthetic */ String Y5(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return W5(str, str2, str3);
    }

    public static final int Z3(@m80.k CharSequence charSequence, @m80.k Collection<String> strings, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(strings, "strings");
        Pair<Integer, String> v32 = v3(charSequence, strings, i11, z11, true);
        if (v32 != null) {
            return v32.getFirst().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String Z4(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str4 = str;
        }
        return X4(str, str2, str3, str4);
    }

    @y0(version = "1.5")
    public static final boolean Z5(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (kotlin.jvm.internal.g0.g(str, n6.m.f74525c)) {
            return true;
        }
        if (kotlin.jvm.internal.g0.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int a4(@m80.k CharSequence charSequence, @m80.k char[] chars, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(a00.a0.qt(chars), i11);
        }
        for (int B = g10.u.B(i11, A3(charSequence)); -1 < B; B--) {
            char charAt = charSequence.charAt(B);
            for (char c11 : chars) {
                if (c.J(c11, charAt, z11)) {
                    return B;
                }
            }
        }
        return -1;
    }

    @o00.f
    public static final String a5(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    @m80.l
    @y0(version = "1.5")
    public static Boolean a6(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        if (kotlin.jvm.internal.g0.g(str, n6.m.f74525c)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.g0.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int b4(CharSequence charSequence, Collection collection, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = A3(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return Z3(charSequence, collection, i11, z11);
    }

    @w00.j(name = "replaceFirstCharWithChar")
    @y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final String b5(String str, x00.l<? super Character, Character> transform) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char charValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return charValue + substring;
    }

    @m80.k
    public static CharSequence b6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean r11 = kotlin.text.a.r(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!r11) {
                    break;
                }
                length--;
            } else if (r11) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static /* synthetic */ int c4(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = A3(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return a4(charSequence, cArr, i11, z11);
    }

    @w00.j(name = "replaceFirstCharWithCharSequence")
    @y0(version = "1.5")
    @yz.p0
    @o00.f
    public static final String c5(String str, x00.l<? super Character, ? extends CharSequence> transform) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    @m80.k
    public static final CharSequence c6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(charSequence.charAt(!z11 ? i11 : length))).booleanValue();
            if (z11) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    @m80.k
    public static q30.m<String> d4(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return new b(charSequence);
    }

    @m80.k
    public static CharSequence d5(@m80.k CharSequence charSequence, int i11, int i12, @m80.k CharSequence replacement) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        if (i12 >= i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i11);
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i12, charSequence.length());
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
    }

    @m80.k
    public static final CharSequence d6(@m80.k CharSequence charSequence, @m80.k char... chars) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean w82 = a00.a0.w8(chars, charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!w82) {
                    break;
                }
                length--;
            } else if (w82) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    @m80.k
    public static List<String> e4(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return q30.k0.I3(d4(charSequence));
    }

    @m80.k
    public static final CharSequence e5(@m80.k CharSequence charSequence, @m80.k g10.l range, @m80.k CharSequence replacement) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return d5(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    @o00.f
    public static final String e6(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return b6(str).toString();
    }

    @m80.k
    public static final String f3(@m80.k CharSequence charSequence, @m80.k CharSequence other, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        int i11 = 0;
        while (i11 < min && c.J(charSequence.charAt(i11), other.charAt(i11), z11)) {
            i11++;
        }
        int i12 = i11 - 1;
        if (B3(charSequence, i12) || B3(other, i12)) {
            i11--;
        }
        return charSequence.subSequence(0, i11).toString();
    }

    @o00.f
    public static final boolean f4(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.matches(charSequence);
    }

    @o00.f
    public static final String f5(String str, int i11, int i12, CharSequence replacement) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return d5(str, i11, i12, replacement).toString();
    }

    @m80.k
    public static final String f6(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean booleanValue = predicate.invoke(Character.valueOf(str.charAt(!z11 ? i11 : length))).booleanValue();
            if (z11) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }

    public static /* synthetic */ String g3(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return f3(charSequence, charSequence2, z11);
    }

    @o00.f
    public static final String g4(String str) {
        return str == null ? "" : str;
    }

    @o00.f
    public static final String g5(String str, g10.l range, CharSequence replacement) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        return e5(str, range, replacement).toString();
    }

    @m80.k
    public static final String g6(@m80.k String str, @m80.k char... chars) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean w82 = a00.a0.w8(chars, str.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!w82) {
                    break;
                }
                length--;
            } else if (w82) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }

    @m80.k
    public static final String h3(@m80.k CharSequence charSequence, @m80.k CharSequence other, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        int length = charSequence.length();
        int min = Math.min(length, other.length());
        int i11 = 0;
        while (i11 < min && c.J(charSequence.charAt((length - i11) - 1), other.charAt((r1 - i11) - 1), z11)) {
            i11++;
        }
        if (B3(charSequence, (length - i11) - 1) || B3(other, (r1 - i11) - 1)) {
            i11--;
        }
        return charSequence.subSequence(length - i11, length).toString();
    }

    @m80.k
    public static final CharSequence h4(@m80.k CharSequence charSequence, int i11, char c11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
        }
        if (i11 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(charSequence);
        int length = i11 - charSequence.length();
        int i12 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c11);
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return sb2;
    }

    public static final void h5(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i11).toString());
    }

    @m80.k
    public static CharSequence h6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i11 = length - 1;
            if (!kotlin.text.a.r(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i11 < 0) {
                return "";
            }
            length = i11;
        }
    }

    public static /* synthetic */ String i3(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return h3(charSequence, charSequence2, z11);
    }

    @m80.k
    public static String i4(@m80.k String str, int i11, char c11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return h4(str, i11, c11).toString();
    }

    @o00.f
    public static final List<String> i5(CharSequence charSequence, Regex regex, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.split(charSequence, i11);
    }

    @m80.k
    public static final CharSequence i6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i11 = length - 1;
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i11 < 0) {
                return "";
            }
            length = i11;
        }
    }

    public static boolean j3(@m80.k CharSequence charSequence, char c11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return I3(charSequence, c11, 0, z11, 2, null) >= 0;
    }

    public static /* synthetic */ CharSequence j4(CharSequence charSequence, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return h4(charSequence, i11, c11);
    }

    @m80.k
    public static final List<String> j5(@m80.k CharSequence charSequence, @m80.k char[] delimiters, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return l5(charSequence, String.valueOf(delimiters[0]), z11, i11);
        }
        Iterable l02 = q30.k0.l0(r4(charSequence, delimiters, 0, z11, i11, 2, null));
        ArrayList arrayList = new ArrayList(a00.i0.d0(l02, 10));
        Iterator it = l02.iterator();
        while (it.hasNext()) {
            arrayList.add(G5(charSequence, (g10.l) it.next()));
        }
        return arrayList;
    }

    @m80.k
    public static final CharSequence j6(@m80.k CharSequence charSequence, @m80.k char... chars) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i11 = length - 1;
            if (!a00.a0.w8(chars, charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i11 < 0) {
                return "";
            }
            length = i11;
        }
    }

    public static boolean k3(@m80.k CharSequence charSequence, @m80.k CharSequence other, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return other instanceof String ? J3(charSequence, (String) other, 0, z11, 2, null) >= 0 : H3(charSequence, other, 0, charSequence.length(), z11, false, 16, null) >= 0;
    }

    public static /* synthetic */ String k4(String str, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return i4(str, i11, c11);
    }

    @m80.k
    public static final List<String> k5(@m80.k CharSequence charSequence, @m80.k String[] delimiters, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return l5(charSequence, str, z11, i11);
            }
        }
        Iterable l02 = q30.k0.l0(s4(charSequence, delimiters, 0, z11, i11, 2, null));
        ArrayList arrayList = new ArrayList(a00.i0.d0(l02, 10));
        Iterator it = l02.iterator();
        while (it.hasNext()) {
            arrayList.add(G5(charSequence, (g10.l) it.next()));
        }
        return arrayList;
    }

    @o00.f
    public static final String k6(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return h6(str).toString();
    }

    @o00.f
    public static final boolean l3(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    @m80.k
    public static final CharSequence l4(@m80.k CharSequence charSequence, int i11, char c11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
        }
        if (i11 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i11);
        int length = i11 - charSequence.length();
        int i12 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c11);
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static final List<String> l5(CharSequence charSequence, String str, boolean z11, int i11) {
        h5(i11);
        int i12 = 0;
        int F3 = F3(charSequence, str, 0, z11);
        if (F3 == -1 || i11 == 1) {
            return a00.g0.l(charSequence.toString());
        }
        boolean z12 = i11 > 0;
        ArrayList arrayList = new ArrayList(z12 ? g10.u.B(i11, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i12, F3).toString());
            i12 = str.length() + F3;
            if (z12 && arrayList.size() == i11 - 1) {
                break;
            }
            F3 = F3(charSequence, str, i12, z11);
        } while (F3 != -1);
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }

    @m80.k
    public static final String l6(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ boolean m3(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return j3(charSequence, c11, z11);
    }

    @m80.k
    public static String m4(@m80.k String str, int i11, char c11) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return l4(str, i11, c11).toString();
    }

    public static /* synthetic */ List m5(CharSequence charSequence, Regex regex, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.split(charSequence, i11);
    }

    @m80.k
    public static final String m6(@m80.k String str, @m80.k char... chars) {
        CharSequence charSequence;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (!a00.a0.w8(chars, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ boolean n3(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return k3(charSequence, charSequence2, z11);
    }

    public static /* synthetic */ CharSequence n4(CharSequence charSequence, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return l4(charSequence, i11, c11);
    }

    public static /* synthetic */ List n5(CharSequence charSequence, char[] cArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return j5(charSequence, cArr, z11, i11);
    }

    @m80.k
    public static CharSequence n6(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!kotlin.text.a.r(charSequence.charAt(i11))) {
                return charSequence.subSequence(i11, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean o3(@m80.l CharSequence charSequence, @m80.l CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return f0.c2((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!c.J(charSequence.charAt(i11), charSequence2.charAt(i11), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String o4(String str, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return m4(str, i11, c11);
    }

    public static /* synthetic */ List o5(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return k5(charSequence, strArr, z11, i11);
    }

    @m80.k
    public static final CharSequence o6(@m80.k CharSequence charSequence, @m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!predicate.invoke(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                return charSequence.subSequence(i11, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean p3(@m80.l CharSequence charSequence, @m80.l CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.g0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static final q30.m<g10.l> p4(CharSequence charSequence, final char[] cArr, int i11, final boolean z11, int i12) {
        h5(i12);
        return new f(charSequence, i11, i12, new x00.p() { // from class: u30.h0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Pair t42;
                t42 = k0.t4(cArr, z11, (CharSequence) obj, ((Integer) obj2).intValue());
                return t42;
            }
        });
    }

    @y0(version = "1.6")
    @o00.f
    public static final q30.m<String> p5(CharSequence charSequence, Regex regex, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.splitToSequence(charSequence, i11);
    }

    @m80.k
    public static final CharSequence p6(@m80.k CharSequence charSequence, @m80.k char... chars) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!a00.a0.w8(chars, charSequence.charAt(i11))) {
                return charSequence.subSequence(i11, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean q3(@m80.k CharSequence charSequence, char c11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() > 0 && c.J(charSequence.charAt(A3(charSequence)), c11, z11);
    }

    public static final q30.m<g10.l> q4(CharSequence charSequence, String[] strArr, int i11, final boolean z11, int i12) {
        h5(i12);
        final List t11 = a00.q.t(strArr);
        return new f(charSequence, i11, i12, new x00.p() { // from class: u30.i0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Pair u42;
                u42 = k0.u4(t11, z11, (CharSequence) obj, ((Integer) obj2).intValue());
                return u42;
            }
        });
    }

    @m80.k
    public static final q30.m<String> q5(@m80.k final CharSequence charSequence, @m80.k char[] delimiters, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(delimiters, "delimiters");
        return q30.k0.N1(r4(charSequence, delimiters, 0, z11, i11, 2, null), new x00.l() { // from class: u30.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                String w52;
                w52 = k0.w5(charSequence, (g10.l) obj);
                return w52;
            }
        });
    }

    @o00.f
    public static final String q6(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return n6(str).toString();
    }

    public static final boolean r3(@m80.k CharSequence charSequence, @m80.k CharSequence suffix, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        return (!z11 && (charSequence instanceof String) && (suffix instanceof String)) ? f0.b2((String) charSequence, (String) suffix, false, 2, null) : v4(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z11);
    }

    public static /* synthetic */ q30.m r4(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return p4(charSequence, cArr, i11, z11, i12);
    }

    @m80.k
    public static final q30.m<String> r5(@m80.k final CharSequence charSequence, @m80.k String[] delimiters, boolean z11, int i11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(delimiters, "delimiters");
        return q30.k0.N1(s4(charSequence, delimiters, 0, z11, i11, 2, null), new x00.l() { // from class: u30.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                String v52;
                v52 = k0.v5(charSequence, (g10.l) obj);
                return v52;
            }
        });
    }

    @m80.k
    public static final String r6(@m80.k String str, @m80.k x00.l<? super Character, Boolean> predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                charSequence = "";
                break;
            }
            if (!predicate.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
                charSequence = str.subSequence(i11, str.length());
                break;
            }
            i11++;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean s3(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return q3(charSequence, c11, z11);
    }

    public static /* synthetic */ q30.m s4(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return q4(charSequence, strArr, i11, z11, i12);
    }

    public static /* synthetic */ q30.m s5(CharSequence charSequence, Regex regex, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(regex, "regex");
        return regex.splitToSequence(charSequence, i11);
    }

    @m80.k
    public static String s6(@m80.k String str, @m80.k char... chars) {
        CharSequence charSequence;
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(chars, "chars");
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                charSequence = "";
                break;
            }
            if (!a00.a0.w8(chars, str.charAt(i11))) {
                charSequence = str.subSequence(i11, str.length());
                break;
            }
            i11++;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean t3(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return r3(charSequence, charSequence2, z11);
    }

    public static final Pair t4(char[] cArr, boolean z11, CharSequence DelimitedRangesSequence, int i11) {
        kotlin.jvm.internal.g0.p(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int L3 = L3(DelimitedRangesSequence, cArr, i11, z11);
        if (L3 < 0) {
            return null;
        }
        return h1.a(Integer.valueOf(L3), 1);
    }

    public static /* synthetic */ q30.m t5(CharSequence charSequence, char[] cArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return q5(charSequence, cArr, z11, i11);
    }

    @m80.l
    public static final Pair<Integer, String> u3(@m80.k CharSequence charSequence, @m80.k Collection<String> strings, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(strings, "strings");
        return v3(charSequence, strings, i11, z11, false);
    }

    public static final Pair u4(List list, boolean z11, CharSequence DelimitedRangesSequence, int i11) {
        kotlin.jvm.internal.g0.p(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> v32 = v3(DelimitedRangesSequence, list, i11, z11, false);
        if (v32 != null) {
            return h1.a(v32.getFirst(), Integer.valueOf(v32.getSecond().length()));
        }
        return null;
    }

    public static /* synthetic */ q30.m u5(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return r5(charSequence, strArr, z11, i11);
    }

    public static final Pair<Integer, String> v3(CharSequence charSequence, Collection<String> collection, int i11, boolean z11, boolean z12) {
        CharSequence charSequence2;
        Object obj;
        boolean z13;
        Object obj2;
        if (!z11 && collection.size() == 1) {
            String str = (String) a00.r0.k5(collection);
            int J3 = !z12 ? J3(charSequence, str, i11, false, 4, null) : Y3(charSequence, str, i11, false, 4, null);
            if (J3 < 0) {
                return null;
            }
            return h1.a(Integer.valueOf(J3), str);
        }
        CharSequence charSequence3 = charSequence;
        g10.j lVar = !z12 ? new g10.l(g10.u.u(i11, 0), charSequence3.length()) : g10.u.k0(g10.u.B(i11, A3(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int d11 = lVar.d();
            int f11 = lVar.f();
            int g11 = lVar.g();
            if ((g11 > 0 && d11 <= f11) || (g11 < 0 && f11 <= d11)) {
                int i12 = d11;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = z11;
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        z13 = z11;
                        if (f0.s2(str2, 0, (String) charSequence3, i12, str2.length(), z13)) {
                            break;
                        }
                        z11 = z13;
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (i12 == f11) {
                            break;
                        }
                        i12 += g11;
                        z11 = z13;
                    } else {
                        return h1.a(Integer.valueOf(i12), str3);
                    }
                }
            }
        } else {
            boolean z14 = z11;
            int d12 = lVar.d();
            int f12 = lVar.f();
            int g12 = lVar.g();
            if ((g12 > 0 && d12 <= f12) || (g12 < 0 && f12 <= d12)) {
                int i13 = d12;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        boolean z15 = z14;
                        charSequence2 = charSequence3;
                        z14 = z15;
                        if (v4(str4, 0, charSequence2, i13, str4.length(), z15)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (i13 == f12) {
                            break;
                        }
                        i13 += g12;
                        charSequence3 = charSequence2;
                    } else {
                        return h1.a(Integer.valueOf(i13), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final boolean v4(@m80.k CharSequence charSequence, int i11, @m80.k CharSequence other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > other.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!c.J(charSequence.charAt(i11 + i14), other.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static final String v5(CharSequence charSequence, g10.l it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return G5(charSequence, it);
    }

    public static /* synthetic */ Pair w3(CharSequence charSequence, Collection collection, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return u3(charSequence, collection, i11, z11);
    }

    @m80.k
    public static final CharSequence w4(@m80.k CharSequence charSequence, @m80.k CharSequence prefix) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return C5(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String w5(CharSequence charSequence, g10.l it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return G5(charSequence, it);
    }

    @m80.l
    public static final Pair<Integer, String> x3(@m80.k CharSequence charSequence, @m80.k Collection<String> strings, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(strings, "strings");
        return v3(charSequence, strings, i11, z11, true);
    }

    @m80.k
    public static String x4(@m80.k String str, @m80.k CharSequence prefix) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        if (!C5(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final boolean x5(@m80.k CharSequence charSequence, char c11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return charSequence.length() > 0 && c.J(charSequence.charAt(0), c11, z11);
    }

    public static /* synthetic */ Pair y3(CharSequence charSequence, Collection collection, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = A3(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return x3(charSequence, collection, i11, z11);
    }

    @m80.k
    public static CharSequence y4(@m80.k CharSequence charSequence, int i11, int i12) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
        }
        if (i12 == i11) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i12 - i11));
        sb2.append(charSequence, 0, i11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append(charSequence, i12, charSequence.length());
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    public static boolean y5(@m80.k CharSequence charSequence, @m80.k CharSequence prefix, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return (!z11 && (charSequence instanceof String) && (prefix instanceof String)) ? f0.I2((String) charSequence, (String) prefix, i11, false, 4, null) : v4(charSequence, i11, prefix, 0, prefix.length(), z11);
    }

    @m80.k
    public static g10.l z3(@m80.k CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        return new g10.l(0, charSequence.length() - 1);
    }

    @m80.k
    public static final CharSequence z4(@m80.k CharSequence charSequence, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(range, "range");
        return y4(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static boolean z5(@m80.k CharSequence charSequence, @m80.k CharSequence prefix, boolean z11) {
        kotlin.jvm.internal.g0.p(charSequence, "<this>");
        kotlin.jvm.internal.g0.p(prefix, "prefix");
        return (!z11 && (charSequence instanceof String) && (prefix instanceof String)) ? f0.J2((String) charSequence, (String) prefix, false, 2, null) : v4(charSequence, 0, prefix, 0, prefix.length(), z11);
    }
}
