package s40;

import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.format.Padding;
import s40.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e extends g0.e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static void a(@m80.k e eVar, @m80.k e0<UtcOffset> format) {
            kotlin.jvm.internal.g0.p(format, "format");
            e.super.h(format);
        }

        @Deprecated
        public static void b(@m80.k e eVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            e.super.x(padding);
        }

        @Deprecated
        public static void c(@m80.k e eVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            e.super.r(padding);
        }

        @Deprecated
        public static void d(@m80.k e eVar, @m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            e.super.y(padding);
        }
    }

    void F0(@m80.k u40.o<? super h2> oVar);

    @Override // s40.g0.e
    default void h(@m80.k e0<UtcOffset> format) {
        kotlin.jvm.internal.g0.p(format, "format");
        if (format instanceof i2) {
            F0(((i2) format).e());
        }
    }

    @Override // s40.g0.e
    default void r(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        F0(new u40.e(new f3(padding)));
    }

    @Override // s40.g0.e
    default void x(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        F0(new u40.a0(new u40.e(new h3(padding)), true));
    }

    @Override // s40.g0.e
    default void y(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "padding");
        F0(new u40.e(new g3(padding)));
    }
}
