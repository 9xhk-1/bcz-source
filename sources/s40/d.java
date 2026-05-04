package s40;

import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface d extends c, f, g0.b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@m80.k d dVar, @m80.k u40.o<? super j> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            d.super.n(structure);
        }

        @Deprecated
        public static void b(@m80.k d dVar, @m80.k u40.o<? super y1> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            d.super.l(structure);
        }

        @Deprecated
        public static void c(@m80.k d dVar, @m80.k u40.o<? super j3> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            d.super.m(structure);
        }

        @Deprecated
        public static void d(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.f(padding);
        }

        @Deprecated
        public static void e(@m80.k d dVar, @m80.k String am2, @m80.k String pm2) {
            kotlin.jvm.internal.g0.p(am2, "am");
            kotlin.jvm.internal.g0.p(pm2, "pm");
            d.super.d(am2, pm2);
        }

        @Deprecated
        public static void f(@m80.k d dVar, @m80.k e0<LocalDate> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            d.super.g(format);
        }

        @Deprecated
        public static void g(@m80.k d dVar, @m80.k e0<LocalDateTime> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            d.super.s(format);
        }

        @Deprecated
        public static void h(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.j(padding);
        }

        @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day(padding = padding)", imports = {}))
        @Deprecated
        public static void i(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.W0(padding);
        }

        @Deprecated
        public static void j(@m80.k d dVar, @m80.k m0 names) {
            kotlin.jvm.internal.g0.p(names, "names");
            d.super.p(names);
        }

        @Deprecated
        public static void k(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.o(padding);
        }

        @Deprecated
        public static void l(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.w(padding);
        }

        @Deprecated
        public static void m(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.t(padding);
        }

        @Deprecated
        public static void n(@m80.k d dVar, @m80.k s1 names) {
            kotlin.jvm.internal.g0.p(names, "names");
            d.super.c(names);
        }

        @Deprecated
        public static void o(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.b(padding);
        }

        @Deprecated
        public static void p(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.u(padding);
        }

        @Deprecated
        public static void q(@m80.k d dVar, int i11) {
            d.super.N(i11);
        }

        @Deprecated
        public static void r(@m80.k d dVar, int i11, int i12) {
            d.super.k(i11, i12);
        }

        @Deprecated
        public static void s(@m80.k d dVar, @m80.k e0<LocalTime> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            d.super.e(format);
        }

        @Deprecated
        public static void t(@m80.k d dVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            d.super.v(padding);
        }

        @Deprecated
        public static void u(@m80.k d dVar, @m80.k e0<YearMonth> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            d.super.a(format);
        }

        @Deprecated
        public static void v(@m80.k d dVar, int i11) {
            d.super.q(i11);
        }
    }

    void X(@m80.k u40.o<? super d0> oVar);

    @Override // s40.f
    default void l(@m80.k u40.o<? super y1> structure) {
        kotlin.jvm.internal.g0.p(structure, "structure");
        X(structure);
    }

    @Override // s40.c
    default void n(@m80.k u40.o<? super j> structure) {
        kotlin.jvm.internal.g0.p(structure, "structure");
        X(structure);
    }

    @Override // s40.g0.b
    default void s(@m80.k e0<LocalDateTime> format) {
        kotlin.jvm.internal.g0.p(format, "format");
        if (format instanceof c1) {
            X(((c1) format).e());
        }
    }
}
