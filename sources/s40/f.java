package s40;

import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.Padding;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface f extends g0.d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@m80.k f fVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            f.super.f(padding);
        }

        @Deprecated
        public static void b(@m80.k f fVar, @m80.k String am2, @m80.k String pm2) {
            kotlin.jvm.internal.g0.p(am2, "am");
            kotlin.jvm.internal.g0.p(pm2, "pm");
            f.super.d(am2, pm2);
        }

        @Deprecated
        public static void c(@m80.k f fVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            f.super.w(padding);
        }

        @Deprecated
        public static void d(@m80.k f fVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            f.super.t(padding);
        }

        @Deprecated
        public static void e(@m80.k f fVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            f.super.u(padding);
        }

        @Deprecated
        public static void f(@m80.k f fVar, int i11) {
            f.super.N(i11);
        }

        @Deprecated
        public static void g(@m80.k f fVar, int i11, int i12) {
            f.super.k(i11, i12);
        }

        @Deprecated
        public static void h(@m80.k f fVar, @m80.k e0<LocalTime> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            f.super.e(format);
        }
    }

    @Override // s40.g0.d
    default void d(@m80.k String am2, @m80.k String pm2) {
        kotlin.jvm.internal.g0.p(am2, "am");
        kotlin.jvm.internal.g0.p(pm2, "pm");
        l(new u40.e(new i(am2, pm2)));
    }

    @Override // s40.g0.d
    default void e(@m80.k e0<LocalTime> format) {
        kotlin.jvm.internal.g0.p(format, "format");
        if (format instanceof i1) {
            l(((i1) format).e());
        }
    }

    @Override // s40.g0.d
    default void f(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        l(new u40.e(new h(padding)));
    }

    @Override // s40.g0.d
    default void k(int i11, int i12) {
        l(new u40.e(new p0(i11, i12, null, 4, null)));
    }

    void l(@m80.k u40.o<? super y1> oVar);

    @Override // s40.g0.d
    default void t(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        l(new u40.e(new p1(padding)));
    }

    @Override // s40.g0.d
    default void u(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        l(new u40.e(new w1(padding)));
    }

    @Override // s40.g0.d
    default void w(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        l(new u40.e(new q0(padding)));
    }
}
