package s40;

import kotlinx.datetime.LocalDate;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c extends g, g0.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@m80.k c cVar, @m80.k u40.o<? super j3> structure) {
            kotlin.jvm.internal.g0.p(structure, "structure");
            c.super.m(structure);
        }

        @Deprecated
        public static void b(@m80.k c cVar, @m80.k e0<LocalDate> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            c.super.g(format);
        }

        @Deprecated
        public static void c(@m80.k c cVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            c.super.j(padding);
        }

        @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day(padding = padding)", imports = {}))
        @Deprecated
        public static void d(@m80.k c cVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            c.super.W0(padding);
        }

        @Deprecated
        public static void e(@m80.k c cVar, @m80.k m0 names) {
            kotlin.jvm.internal.g0.p(names, "names");
            c.super.p(names);
        }

        @Deprecated
        public static void f(@m80.k c cVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            c.super.o(padding);
        }

        @Deprecated
        public static void g(@m80.k c cVar, @m80.k s1 names) {
            kotlin.jvm.internal.g0.p(names, "names");
            c.super.c(names);
        }

        @Deprecated
        public static void h(@m80.k c cVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            c.super.b(padding);
        }

        @Deprecated
        public static void i(@m80.k c cVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            c.super.v(padding);
        }

        @Deprecated
        public static void j(@m80.k c cVar, @m80.k e0<YearMonth> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            c.super.a(format);
        }

        @Deprecated
        public static void k(@m80.k c cVar, int i11) {
            c.super.q(i11);
        }
    }

    @Override // s40.g0.a
    default void g(@m80.k e0<LocalDate> format) {
        kotlin.jvm.internal.g0.p(format, "format");
        if (format instanceof w0) {
            n(((w0) format).e());
        }
    }

    @Override // s40.g0.a
    default void j(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        n(new u40.e(new k0(padding)));
    }

    @Override // s40.g
    default void m(@m80.k u40.o<? super j3> structure) {
        kotlin.jvm.internal.g0.p(structure, "structure");
        n(structure);
    }

    void n(@m80.k u40.o<? super j> oVar);

    @Override // s40.g0.a
    default void o(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        n(new u40.e(new n0(padding)));
    }

    @Override // s40.g0.a
    default void p(@m80.k m0 names) {
        kotlin.jvm.internal.g0.p(names, "names");
        n(new u40.e(new l0(names)));
    }
}
