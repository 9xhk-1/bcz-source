package ix;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import io.ktor.http.URLParserException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLParser.kt\nio/ktor/http/URLParserKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n158#2,6:270\n170#2,6:276\n1#3:282\n*S KotlinDebug\n*F\n+ 1 URLParser.kt\nio/ktor/http/URLParserKt\n*L\n34#1:270,6\n35#1:276,6\n*E\n"})
/* loaded from: classes8.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<String> f62829a = a00.g0.l("");

    public static final int b(String str, int i11, int i12, char c11) {
        int i13 = 0;
        while (true) {
            int i14 = i11 + i13;
            if (i14 >= i12 || str.charAt(i14) != c11) {
                break;
            }
            i13++;
        }
        return i13;
    }

    public static final void c(b2 b2Var, String str, int i11, int i12) {
        int i13;
        Integer valueOf = Integer.valueOf(f(str, i11, i12));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i12;
        String substring = str.substring(i11, intValue);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        b2Var.y(substring);
        int i14 = intValue + 1;
        if (i14 < i12) {
            String substring2 = str.substring(i14, i12);
            kotlin.jvm.internal.g0.o(substring2, "substring(...)");
            i13 = Integer.parseInt(substring2);
        } else {
            i13 = 0;
        }
        b2Var.B(i13);
    }

    public static final int d(String str, int i11, int i12) {
        int i13;
        int i14;
        char charAt = str.charAt(i11);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i13 = i11;
            i14 = i13;
        } else {
            i13 = i11;
            i14 = -1;
        }
        while (i13 < i12) {
            char charAt2 = str.charAt(i13);
            if (charAt2 != ':') {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i14 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i14 = i13;
                }
                i13++;
            } else {
                if (i14 == -1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i14);
            }
        }
        return -1;
    }

    @m80.k
    public static final List<String> e() {
        return f62829a;
    }

    public static final int f(String str, int i11, int i12) {
        boolean z11 = false;
        while (i11 < i12) {
            char charAt = str.charAt(i11);
            if (charAt != ':') {
                if (charAt == '[') {
                    z11 = true;
                } else if (charAt == ']') {
                    z11 = false;
                }
            } else if (!z11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final boolean g(char c11) {
        char lowerCase = Character.toLowerCase(c11);
        return 'a' <= lowerCase && lowerCase < '{';
    }

    public static final void h(b2 b2Var, String str, int i11, int i12, int i13) {
        if (i13 != 2) {
            if (i13 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            b2Var.y("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            String substring = str.substring(i11, i12);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            sb2.append(substring);
            e2.x(b2Var, sb2.toString());
            return;
        }
        int I3 = u30.k0.I3(str, '/', i11, false, 4, null);
        if (I3 == -1 || I3 == i12) {
            String substring2 = str.substring(i11, i12);
            kotlin.jvm.internal.g0.o(substring2, "substring(...)");
            b2Var.y(substring2);
        } else {
            String substring3 = str.substring(i11, I3);
            kotlin.jvm.internal.g0.o(substring3, "substring(...)");
            b2Var.y(substring3);
            String substring4 = str.substring(I3, i12);
            kotlin.jvm.internal.g0.o(substring4, "substring(...)");
            e2.x(b2Var, substring4);
        }
    }

    public static final void i(b2 b2Var, String str, int i11, int i12) {
        if (i11 >= i12 || str.charAt(i11) != '#') {
            return;
        }
        String substring = str.substring(i11 + 1, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        b2Var.s(substring);
    }

    public static final void j(b2 b2Var, String str, int i11, int i12) {
        int J3 = u30.k0.J3(str, EmailAutoCompleteEditText.f17091d, i11, false, 4, null);
        if (J3 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i11, J3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        b2Var.F(f.i(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(J3 + 1, i12);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        b2Var.y(substring2);
    }

    public static final int k(final b2 b2Var, String str, int i11, int i12) {
        int i13 = i11 + 1;
        if (i13 == i12) {
            b2Var.E(true);
            return i12;
        }
        Integer valueOf = Integer.valueOf(u30.k0.I3(str, '#', i13, false, 4, null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i12 = valueOf.intValue();
        }
        String substring = str.substring(i13, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        v1.d(substring, 0, 0, false, 6, null).d(new x00.p() { // from class: ix.f2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 l11;
                l11 = g2.l(b2.this, (String) obj, (List) obj2);
                return l11;
            }
        });
        return i12;
    }

    public static final yz.g2 l(b2 b2Var, String key, List values) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(values, "values");
        b2Var.e().f(key, values);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final b2 m(@m80.k b2 b2Var, @m80.k String urlString) {
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        if (u30.k0.O3(urlString)) {
            return b2Var;
        }
        try {
            return n(b2Var, urlString);
        } catch (Throwable th2) {
            throw new URLParserException(urlString, th2);
        }
    }

    @m80.k
    public static final b2 n(@m80.k b2 b2Var, @m80.k String urlString) {
        int i11;
        int intValue;
        kotlin.jvm.internal.g0.p(b2Var, "<this>");
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        int length = urlString.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (!kotlin.text.a.r(urlString.charAt(i12))) {
                break;
            }
            i12++;
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i13 = length2 - 1;
                if (!kotlin.text.a.r(urlString.charAt(length2))) {
                    i11 = length2;
                    break;
                }
                if (i13 < 0) {
                    break;
                }
                length2 = i13;
            }
        }
        i11 = -1;
        int i14 = i11 + 1;
        int d11 = d(urlString, i12, i14);
        if (d11 > 0) {
            String substring = urlString.substring(i12, i12 + d11);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            b2Var.C(h2.f62830c.a(substring));
            i12 += d11 + 1;
        }
        int b11 = b(urlString, i12, i14, '/');
        int i15 = i12 + b11;
        if (kotlin.jvm.internal.g0.g(b2Var.o().l(), "file")) {
            h(b2Var, urlString, i15, i14, b11);
            return b2Var;
        }
        if (kotlin.jvm.internal.g0.g(b2Var.o().l(), "mailto")) {
            if (b11 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            j(b2Var, urlString, i15, i14);
            return b2Var;
        }
        if (kotlin.jvm.internal.g0.g(b2Var.o().l(), "about")) {
            if (b11 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String substring2 = urlString.substring(i15, i14);
            kotlin.jvm.internal.g0.o(substring2, "substring(...)");
            b2Var.y(substring2);
            return b2Var;
        }
        if (b11 >= 2) {
            while (true) {
                Integer valueOf = Integer.valueOf(u30.k0.N3(urlString, xy.v.b("@/\\?#"), i15, false, 4, null));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : i14;
                if (intValue >= i14 || urlString.charAt(intValue) != '@') {
                    break;
                }
                int f11 = f(urlString, i15, intValue);
                if (f11 != -1) {
                    String substring3 = urlString.substring(i15, f11);
                    kotlin.jvm.internal.g0.o(substring3, "substring(...)");
                    b2Var.w(substring3);
                    String substring4 = urlString.substring(f11 + 1, intValue);
                    kotlin.jvm.internal.g0.o(substring4, "substring(...)");
                    b2Var.u(substring4);
                } else {
                    String substring5 = urlString.substring(i15, intValue);
                    kotlin.jvm.internal.g0.o(substring5, "substring(...)");
                    b2Var.w(substring5);
                }
                i15 = intValue + 1;
            }
            c(b2Var, urlString, i15, intValue);
            i15 = intValue;
        }
        if (i15 >= i14) {
            b2Var.v(urlString.charAt(i11) == '/' ? f62829a : a00.h0.J());
            return b2Var;
        }
        b2Var.v(b11 == 0 ? a00.r0.h2(b2Var.g(), 1) : a00.h0.J());
        Integer valueOf2 = Integer.valueOf(u30.k0.N3(urlString, xy.v.b("?#"), i15, false, 4, null));
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : i14;
        if (intValue2 > i15) {
            String substring6 = urlString.substring(i15, intValue2);
            kotlin.jvm.internal.g0.o(substring6, "substring(...)");
            b2Var.v(a00.r0.I4((b2Var.g().size() == 1 && ((CharSequence) a00.r0.G2(b2Var.g())).length() == 0) ? a00.h0.J() : b2Var.g(), a00.r0.I4(b11 == 1 ? f62829a : a00.h0.J(), kotlin.jvm.internal.g0.g(substring6, "/") ? f62829a : u30.k0.n5(substring6, new char[]{'/'}, false, 0, 6, null))));
            i15 = intValue2;
        }
        if (i15 < i14 && urlString.charAt(i15) == '?') {
            i15 = k(b2Var, urlString, i15, i14);
        }
        i(b2Var, urlString, i15, i14);
        return b2Var;
    }
}
