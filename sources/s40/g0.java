package s40;

import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a extends f {
        static /* synthetic */ void W(a aVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: day");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            aVar.j(padding);
        }

        static /* synthetic */ void r0(a aVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            aVar.W0(padding);
        }

        static /* synthetic */ void u0(a aVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfYear");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            aVar.o(padding);
        }

        @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day(padding = padding)", imports = {}))
        default void W0(@m80.k Padding padding) {
            kotlin.jvm.internal.g0.p(padding, "padding");
            j(padding);
        }

        void g(@m80.k e0<LocalDate> e0Var);

        void j(@m80.k Padding padding);

        void o(@m80.k Padding padding);

        void p(@m80.k m0 m0Var);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b extends a, d {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day(padding = padding)", imports = {}))
            @Deprecated
            public static void a(@m80.k b bVar, @m80.k Padding padding) {
                kotlin.jvm.internal.g0.p(padding, "padding");
                b.super.W0(padding);
            }

            @Deprecated
            public static void b(@m80.k b bVar, int i11) {
                b.super.N(i11);
            }
        }

        void s(@m80.k e0<LocalDateTime> e0Var);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c extends b, e {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day(padding = padding)", imports = {}))
            @Deprecated
            public static void a(@m80.k c cVar, @m80.k Padding padding) {
                kotlin.jvm.internal.g0.p(padding, "padding");
                c.super.W0(padding);
            }

            @Deprecated
            public static void b(@m80.k c cVar, int i11) {
                c.super.N(i11);
            }
        }

        void C();

        void h0(@m80.k e0<l> e0Var);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d extends g0 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            @Deprecated
            public static void e(@m80.k d dVar, int i11) {
                d.super.N(i11);
            }
        }

        static /* synthetic */ void A(d dVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            dVar.u(padding);
        }

        static /* synthetic */ void G(d dVar, int i11, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: secondFraction");
            }
            if ((i13 & 1) != 0) {
                i11 = 1;
            }
            if ((i13 & 2) != 0) {
                i12 = 9;
            }
            dVar.k(i11, i12);
        }

        static /* synthetic */ void N0(d dVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            dVar.w(padding);
        }

        static /* synthetic */ void i0(d dVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            dVar.t(padding);
        }

        static /* synthetic */ void j0(d dVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: amPmHour");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            dVar.f(padding);
        }

        default void N(int i11) {
            k(i11, i11);
        }

        void d(@m80.k String str, @m80.k String str2);

        void e(@m80.k e0<LocalTime> e0Var);

        void f(@m80.k Padding padding);

        void k(int i11, int i12);

        void t(@m80.k Padding padding);

        void u(@m80.k Padding padding);

        void w(@m80.k Padding padding);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e extends g0 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
        }

        static /* synthetic */ void J(e eVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            eVar.y(padding);
        }

        static /* synthetic */ void L0(e eVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            eVar.r(padding);
        }

        static /* synthetic */ void R(e eVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            eVar.x(padding);
        }

        void h(@m80.k e0<UtcOffset> e0Var);

        void r(@m80.k Padding padding);

        void x(@m80.k Padding padding);

        void y(@m80.k Padding padding);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f extends g0 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
        }

        static /* synthetic */ void I(f fVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            fVar.b(padding);
        }

        static /* synthetic */ void P0(f fVar, Padding padding, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
            }
            if ((i11 & 1) != 0) {
                padding = Padding.ZERO;
            }
            fVar.v(padding);
        }

        void a(@m80.k e0<YearMonth> e0Var);

        void b(@m80.k Padding padding);

        void c(@m80.k s1 s1Var);

        void q(int i11);

        void v(@m80.k Padding padding);
    }

    void i(@m80.k String str);
}
