package s40;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import s40.c2;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUnicode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Unicode.kt\nkotlinx/datetime/format/UnicodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,659:1\n1869#2,2:660\n*S KotlinDebug\n*F\n+ 1 Unicode.kt\nkotlinx/datetime/format/UnicodeKt\n*L\n113#1:660,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<Character> f87670a = a00.r0.I4(a00.r0.E4(new g10.c('a', io.ktor.util.date.b.f62003i), new g10.c('A', 'Z')), a00.h0.Q('[', Character.valueOf(l50.b.f69930l), '\''));

    @o0
    public static final void i(@m80.k g0 g0Var, @m80.k String pattern) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(pattern, "pattern");
        j(g0Var, c2.f87586a.a(pattern));
    }

    public static final void j(g0 g0Var, final c2 c2Var) {
        if (c2Var instanceof c2.e) {
            g0Var.i(((c2.e) c2Var).d());
            return;
        }
        if (c2Var instanceof c2.d) {
            Iterator<T> it = ((c2.d) c2Var).d().iterator();
            while (it.hasNext()) {
                j(g0Var, (c2) it.next());
            }
            return;
        }
        if (c2Var instanceof c2.c) {
            h0.a(g0Var, new x00.l[]{new x00.l() { // from class: s40.d2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 k11;
                    k11 = f2.k((g0) obj);
                    return k11;
                }
            }}, new x00.l() { // from class: s40.e2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 l11;
                    l11 = f2.l(c2.this, (g0) obj);
                    return l11;
                }
            });
            return;
        }
        if (!(c2Var instanceof c2.b)) {
            throw new NoWhenBranchMatchedException();
        }
        c2.b bVar = (c2.b) c2Var;
        if (bVar instanceof c2.b.c) {
            if (g0Var instanceof g0.d) {
                ((c2.b.c) c2Var).c((g0.d) g0Var);
                return;
            }
            throw new IllegalArgumentException(("A time-based directive " + c2Var + " was used in a format builder that doesn't support time components").toString());
        }
        if (bVar instanceof c2.b.d) {
            if (g0Var instanceof g0.f) {
                ((c2.b.d) c2Var).d((g0.f) g0Var);
                return;
            }
            throw new IllegalArgumentException(("A year-month-based directive " + c2Var + " was used in a format builder that doesn't support year-month components").toString());
        }
        if (bVar instanceof c2.b.a) {
            if (g0Var instanceof g0.a) {
                ((c2.b.a) c2Var).c((g0.a) g0Var);
                return;
            }
            throw new IllegalArgumentException(("A date-based directive " + c2Var + " was used in a format builder that doesn't support date components").toString());
        }
        if (bVar instanceof c2.b.e) {
            if (g0Var instanceof g0.c) {
                ((c2.b.e) c2Var).c((g0.c) g0Var);
                return;
            }
            throw new IllegalArgumentException(("A time-zone-based directive " + c2Var + " was used in a format builder that doesn't support time-zone components").toString());
        }
        if (!(bVar instanceof c2.b.AbstractC1131b)) {
            if (!(bVar instanceof g2)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("The meaning of the directive '" + c2Var + "' is unknown");
        }
        if (g0Var instanceof g0.e) {
            ((c2.b.AbstractC1131b) c2Var).c((g0.e) g0Var);
            return;
        }
        throw new IllegalArgumentException(("A UTC-offset-based directive " + c2Var + " was used in a format builder that doesn't support UTC offset components").toString());
    }

    public static final yz.g2 k(g0 alternativeParsing) {
        kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
        return yz.g2.f100423a;
    }

    public static final yz.g2 l(c2 c2Var, g0 alternativeParsing) {
        kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
        j(alternativeParsing, ((c2.c) c2Var).d());
        return yz.g2.f100423a;
    }

    public static final Void m(c2.b bVar, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The directive '");
        sb2.append(bVar);
        sb2.append("' is locale-dependent, but locales are not supported in Kotlin");
        if (str != null) {
            str2 = ". " + str;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ Void n(c2.b bVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return m(bVar, str);
    }

    public static final c2 o(char c11, int i11) {
        switch (c11) {
            case 'A':
                return new c2.b.c.f.C1135b(i11);
            case 'B':
            case 'C':
            case 'I':
            case 'J':
            case 'K':
            case 'P':
            case 'R':
            case 'T':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'b':
            case 'f':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'o':
            case 'p':
            case 't':
            default:
                return new g2(c11, i11);
            case 'D':
                return new c2.b.a.d(i11);
            case 'E':
                return new c2.b.a.C1130b(i11);
            case 'F':
                return new c2.b.a.c(i11);
            case 'G':
                return new c2.b.d.C1137b(i11);
            case 'H':
                return new c2.b.c.C1134c(i11);
            case 'L':
                return new c2.b.d.f(i11);
            case 'M':
                return new c2.b.d.c(i11);
            case 'N':
                return new c2.b.c.f.C1136c(i11);
            case 'O':
                return new c2.b.AbstractC1131b.a(i11);
            case 'Q':
                return new c2.b.d.C1138d(i11);
            case 'S':
                return new c2.b.c.f.a(i11);
            case 'U':
                return new c2.b.d.a(i11);
            case 'V':
                return new c2.b.e.C1139b(i11);
            case 'W':
                return new c2.b.a.i(i11);
            case 'X':
                return new c2.b.AbstractC1131b.C1132b(i11);
            case 'Y':
                return new c2.b.a.h(i11);
            case 'Z':
                return new c2.b.AbstractC1131b.d(i11);
            case 'a':
                return new c2.b.c.C1133b(i11);
            case 'c':
                return new c2.b.a.g(i11);
            case 'd':
                return new c2.b.a.C1129a(i11);
            case 'e':
                return new c2.b.a.e(i11);
            case 'g':
                return new c2.b.a.f(i11);
            case 'h':
                return new c2.b.c.a(i11);
            case 'm':
                return new c2.b.c.d(i11);
            case 'n':
                return new c2.b.c.f.d(i11);
            case 'q':
                return new c2.b.d.g(i11);
            case 'r':
                return new c2.b.d.e(i11);
            case 's':
                return new c2.b.c.e.a(i11);
            case 'u':
                return new c2.b.d.h(i11);
            case 'v':
                return new c2.b.e.a(i11);
            case 'w':
                return new c2.b.a.j(i11);
            case 'x':
                return new c2.b.AbstractC1131b.c(i11);
            case 'y':
                return new c2.b.d.i(i11);
            case 'z':
                return new c2.b.e.c(i11);
        }
    }

    public static final Void p(c2.b bVar) {
        throw new IllegalArgumentException("Unknown length " + bVar.a() + " for the " + bVar.b() + " directive");
    }

    public static final Void q(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("kotlinx.datetime formatting does not support the ");
        sb2.append(str);
        sb2.append(" field. ");
        if (str2 != null) {
            str3 = str2 + ' ';
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append("Please report your use case to https://github.com/Kotlin/kotlinx-datetime/issues");
        throw new UnsupportedOperationException(sb2.toString());
    }

    public static /* synthetic */ Void r(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return q(str, str2);
    }

    public static final Void s(c2.b bVar, int i11) {
        throw new UnsupportedOperationException("Padding do " + i11 + " digits is not supported for the " + bVar.b() + " directive");
    }
}
