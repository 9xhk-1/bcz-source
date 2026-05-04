package ix;

import io.ktor.http.InvalidCookieDateException;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieDateParser\n+ 2 CookieUtils.kt\nio/ktor/http/StringLexer\n*L\n1#1,349:1\n56#2,3:350\n*S KotlinDebug\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/CookieDateParser\n*L\n294#1:350,3\n*E\n"})
/* loaded from: classes8.dex */
public final class y {
    public static final boolean m(char c11) {
        return d0.b(c11);
    }

    public static final boolean n(char c11) {
        return d0.d(c11);
    }

    public static final boolean o(char c11) {
        return d0.d(c11);
    }

    public static final boolean p(char c11) {
        return d0.b(c11);
    }

    public static final String q() {
        return "day-of-month not in [1,31]";
    }

    public static final String r() {
        return "year >= 1601";
    }

    public static final String s() {
        return "hours > 23";
    }

    public static final String t() {
        return "minutes > 59";
    }

    public static final String u() {
        return "seconds > 59";
    }

    public final <T> void j(String str, String str2, T t11) {
        if (t11 != null) {
            return;
        }
        throw new InvalidCookieDateException(str, "Could not find " + str2);
    }

    public final void k(String str, boolean z11, x00.a<String> aVar) {
        if (!z11) {
            throw new InvalidCookieDateException(str, aVar.invoke());
        }
    }

    @m80.k
    public final bz.b l(@m80.k String source) {
        kotlin.jvm.internal.g0.p(source, "source");
        a2 a2Var = new a2(source);
        o oVar = new o();
        a2Var.b(new x00.l() { // from class: ix.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean m11;
                m11 = y.m(((Character) obj).charValue());
                return Boolean.valueOf(m11);
            }
        });
        while (a2Var.d()) {
            if (a2Var.h(new x00.l() { // from class: ix.q
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean n11;
                    n11 = y.n(((Character) obj).charValue());
                    return Boolean.valueOf(n11);
                }
            })) {
                int e11 = a2Var.e();
                a2Var.b(new x00.l() { // from class: ix.r
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        boolean o11;
                        o11 = y.o(((Character) obj).charValue());
                        return Boolean.valueOf(o11);
                    }
                });
                String substring = a2Var.f().substring(e11, a2Var.e());
                kotlin.jvm.internal.g0.o(substring, "substring(...)");
                d0.a(oVar, substring);
                a2Var.b(new x00.l() { // from class: ix.s
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        boolean p11;
                        p11 = y.p(((Character) obj).charValue());
                        return Boolean.valueOf(p11);
                    }
                });
            }
        }
        Integer g11 = oVar.g();
        g10.l lVar = new g10.l(70, 99);
        if (g11 == null || !lVar.k(g11.intValue())) {
            g10.l lVar2 = new g10.l(0, 69);
            if (g11 != null && lVar2.k(g11.intValue())) {
                Integer g12 = oVar.g();
                kotlin.jvm.internal.g0.m(g12);
                oVar.m(Integer.valueOf(g12.intValue() + 2000));
            }
        } else {
            Integer g13 = oVar.g();
            kotlin.jvm.internal.g0.m(g13);
            oVar.m(Integer.valueOf(g13.intValue() + 1900));
        }
        j(source, "day-of-month", oVar.b());
        j(source, n.r.f98260b, oVar.e());
        j(source, n.r.f98259a, oVar.g());
        j(source, "time", oVar.c());
        j(source, "time", oVar.d());
        j(source, "time", oVar.f());
        g10.l lVar3 = new g10.l(1, 31);
        Integer b11 = oVar.b();
        k(source, b11 != null && lVar3.k(b11.intValue()), new x00.a() { // from class: ix.t
            @Override // x00.a
            public final Object invoke() {
                String q11;
                q11 = y.q();
                return q11;
            }
        });
        Integer g14 = oVar.g();
        kotlin.jvm.internal.g0.m(g14);
        k(source, g14.intValue() >= 1601, new x00.a() { // from class: ix.u
            @Override // x00.a
            public final Object invoke() {
                String r11;
                r11 = y.r();
                return r11;
            }
        });
        Integer c11 = oVar.c();
        kotlin.jvm.internal.g0.m(c11);
        k(source, c11.intValue() <= 23, new x00.a() { // from class: ix.v
            @Override // x00.a
            public final Object invoke() {
                String s11;
                s11 = y.s();
                return s11;
            }
        });
        Integer d11 = oVar.d();
        kotlin.jvm.internal.g0.m(d11);
        k(source, d11.intValue() <= 59, new x00.a() { // from class: ix.w
            @Override // x00.a
            public final Object invoke() {
                String t11;
                t11 = y.t();
                return t11;
            }
        });
        Integer f11 = oVar.f();
        kotlin.jvm.internal.g0.m(f11);
        k(source, f11.intValue() <= 59, new x00.a() { // from class: ix.x
            @Override // x00.a
            public final Object invoke() {
                String u11;
                u11 = y.u();
                return u11;
            }
        });
        return oVar.a();
    }
}
