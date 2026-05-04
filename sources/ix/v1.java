package ix;

import ix.p1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nQuery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Query.kt\nio/ktor/http/QueryKt\n+ 2 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,95:1\n24#2:96\n*S KotlinDebug\n*F\n+ 1 Query.kt\nio/ktor/http/QueryKt\n*L\n14#1:96\n*E\n"})
/* loaded from: classes8.dex */
public final class v1 {
    public static final void a(q1 q1Var, String str, int i11, int i12, int i13, boolean z11) {
        String substring;
        String substring2;
        String substring3;
        if (i12 == -1) {
            int f11 = f(i11, i13, str);
            int e11 = e(f11, i13, str);
            if (e11 > f11) {
                if (z11) {
                    substring3 = f.k(str, f11, e11, false, null, 12, null);
                } else {
                    substring3 = str.substring(f11, e11);
                    kotlin.jvm.internal.g0.o(substring3, "substring(...)");
                }
                q1Var.f(substring3, a00.h0.J());
                return;
            }
            return;
        }
        int f12 = f(i11, i12, str);
        int e12 = e(f12, i12, str);
        if (e12 > f12) {
            if (z11) {
                substring = f.k(str, f12, e12, false, null, 12, null);
            } else {
                substring = str.substring(f12, e12);
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
            }
            int f13 = f(i12 + 1, i13, str);
            int e13 = e(f13, i13, str);
            if (z11) {
                substring2 = f.k(str, f13, e13, true, null, 8, null);
            } else {
                substring2 = str.substring(f13, e13);
                kotlin.jvm.internal.g0.o(substring2, "substring(...)");
            }
            q1Var.k(substring, substring2);
        }
    }

    public static final void b(q1 q1Var, String str, int i11, int i12, boolean z11) {
        int i13;
        int i14;
        int A3 = u30.k0.A3(str);
        int i15 = 0;
        if (i11 <= A3) {
            int i16 = -1;
            int i17 = i11;
            int i18 = i17;
            while (i15 != i12) {
                char charAt = str.charAt(i18);
                if (charAt == '&') {
                    a(q1Var, str, i17, i16, i18, z11);
                    i15++;
                    i16 = -1;
                    i17 = i18 + 1;
                } else if (charAt == '=' && i16 == -1) {
                    i16 = i18;
                }
                if (i18 != A3) {
                    i18++;
                } else {
                    i14 = i17;
                    i13 = i16;
                }
            }
            return;
        }
        i13 = -1;
        i14 = i11;
        if (i15 == i12) {
            return;
        }
        a(q1Var, str, i14, i13, str.length(), z11);
    }

    @m80.k
    public static final p1 c(@m80.k String query, int i11, int i12, boolean z11) {
        kotlin.jvm.internal.g0.p(query, "query");
        if (i11 > u30.k0.A3(query)) {
            return p1.f62972b.b();
        }
        p1.a aVar = p1.f62972b;
        q1 b11 = t1.b(0, 1, null);
        b(b11, query, i11, i12, z11);
        return b11.build();
    }

    public static /* synthetic */ p1 d(String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 1000;
        }
        if ((i13 & 8) != 0) {
            z11 = true;
        }
        return c(str, i11, i12, z11);
    }

    public static final int e(int i11, int i12, CharSequence charSequence) {
        while (i12 > i11 && kotlin.text.a.r(charSequence.charAt(i12 - 1))) {
            i12--;
        }
        return i12;
    }

    public static final int f(int i11, int i12, CharSequence charSequence) {
        while (i11 < i12 && kotlin.text.a.r(charSequence.charAt(i11))) {
            i11++;
        }
        return i11;
    }
}
