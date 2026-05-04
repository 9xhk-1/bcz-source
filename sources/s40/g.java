package s40;

import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g extends g0.f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@m80.k g gVar, @m80.k s1 names) {
            kotlin.jvm.internal.g0.p(names, "names");
            g.super.c(names);
        }

        @Deprecated
        public static void b(@m80.k g gVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            g.super.b(padding);
        }

        @Deprecated
        public static void c(@m80.k g gVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            g.super.v(padding);
        }

        @Deprecated
        public static void d(@m80.k g gVar, @m80.k e0<YearMonth> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            g.super.a(format);
        }

        @Deprecated
        public static void e(@m80.k g gVar, int i11) {
            g.super.q(i11);
        }
    }

    @Override // s40.g0.f
    default void a(@m80.k e0<YearMonth> format) {
        kotlin.jvm.internal.g0.p(format, "format");
        if (format instanceof l3) {
            m(((l3) format).e());
        }
    }

    @Override // s40.g0.f
    default void b(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        m(new u40.e(new q1(padding)));
    }

    @Override // s40.g0.f
    default void c(@m80.k s1 names) {
        kotlin.jvm.internal.g0.p(names, "names");
        m(new u40.e(new r1(names)));
    }

    void m(@m80.k u40.o<? super j3> oVar);

    @Override // s40.g0.f
    default void q(int i11) {
        m(new u40.e(new v1(i11, false, 2, null)));
    }

    @Override // s40.g0.f
    default void v(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        m(new u40.e(new i3(padding, false, 2, null)));
    }
}
