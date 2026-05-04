package s40;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.time.Instant;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DayOfWeek;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.Month;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.AmPmMarker;
import kotlinx.datetime.format.Padding;
import s40.b0;
import s40.g0;
import s40.l;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimeComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeComponents.kt\nkotlinx/datetime/format/DateTimeComponents\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,673:1\n1#2:674\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a0 f87713a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b2 f87714b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b2 f87715c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final b2 f87716d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x1 f87717e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final b2 f87718f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final b2 f87719g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final b2 f87720h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final b2 f87721i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final b2 f87722j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final b2 f87723k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final b2 f87724l;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f87712n = {kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "day", "getDay()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, n.r.f98261c, "getDayOfMonth()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "hour", "getHour()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, n.r.f98263e, "getMinute()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, n.r.f98264f, "getSecond()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0)), kotlin.jvm.internal.o0.k(new MutablePropertyReference1Impl(l.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0))};

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f87711m = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final e0<l> a(@m80.k x00.l<? super g0.c, yz.g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            b0.a aVar = new b0.a(new u40.d());
            block.invoke(aVar);
            return new b0(aVar.build());
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f87725a = new b();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final e0<l> f87726b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final e0<l> f87727c;

        static {
            a aVar = l.f87711m;
            f87726b = aVar.a(new x00.l() { // from class: s40.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 o11;
                    o11 = l.b.o((g0.c) obj);
                    return o11;
                }
            });
            f87727c = aVar.a(new x00.l() { // from class: s40.r
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 u11;
                    u11 = l.b.u((g0.c) obj);
                    return u11;
                }
            });
        }

        public static final yz.g2 A(g0.c optional) {
            kotlin.jvm.internal.g0.p(optional, "$this$optional");
            h0.c(optional, ':');
            g0.d.A(optional, null, 1, null);
            return yz.g2.f100423a;
        }

        public static final yz.g2 B(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            alternativeParsing.i("UT");
            return yz.g2.f100423a;
        }

        public static final yz.g2 o(g0.c Format) {
            kotlin.jvm.internal.g0.p(Format, "$this$Format");
            Format.g(b1.k());
            h0.a(Format, new x00.l[]{new x00.l() { // from class: s40.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 p11;
                    p11 = l.b.p((g0.c) obj);
                    return p11;
                }
            }}, new x00.l() { // from class: s40.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 q11;
                    q11 = l.b.q((g0.c) obj);
                    return q11;
                }
            });
            g0.d.N0(Format, null, 1, null);
            h0.c(Format, ':');
            g0.d.i0(Format, null, 1, null);
            h0.c(Format, ':');
            g0.d.A(Format, null, 1, null);
            h0.e(Format, null, new x00.l() { // from class: s40.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 r11;
                    r11 = l.b.r((g0.c) obj);
                    return r11;
                }
            }, 1, null);
            h0.a(Format, new x00.l[]{new x00.l() { // from class: s40.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 s11;
                    s11 = l.b.s((g0.c) obj);
                    return s11;
                }
            }}, new x00.l() { // from class: s40.w
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 t11;
                    t11 = l.b.t((g0.c) obj);
                    return t11;
                }
            });
            return yz.g2.f100423a;
        }

        public static final yz.g2 p(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            h0.c(alternativeParsing, 't');
            return yz.g2.f100423a;
        }

        public static final yz.g2 q(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            h0.c(alternativeParsing, 'T');
            return yz.g2.f100423a;
        }

        public static final yz.g2 r(g0.c optional) {
            kotlin.jvm.internal.g0.p(optional, "$this$optional");
            h0.c(optional, '.');
            optional.k(1, 9);
            return yz.g2.f100423a;
        }

        public static final yz.g2 s(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            g0.e.R(alternativeParsing, null, 1, null);
            return yz.g2.f100423a;
        }

        public static final yz.g2 t(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            alternativeParsing.h(UtcOffset.b.f68488a.b());
            return yz.g2.f100423a;
        }

        public static final yz.g2 u(g0.c Format) {
            kotlin.jvm.internal.g0.p(Format, "$this$Format");
            h0.a(Format, new x00.l[]{new x00.l() { // from class: s40.y
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 y11;
                    y11 = l.b.y((g0.c) obj);
                    return y11;
                }
            }}, new x00.l() { // from class: s40.z
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 z11;
                    z11 = l.b.z((g0.c) obj);
                    return z11;
                }
            });
            Format.j(Padding.NONE);
            h0.c(Format, ' ');
            Format.c(s1.f87766b.a());
            h0.c(Format, ' ');
            g0.f.P0(Format, null, 1, null);
            h0.c(Format, ' ');
            g0.d.N0(Format, null, 1, null);
            h0.c(Format, ':');
            g0.d.i0(Format, null, 1, null);
            h0.e(Format, null, new x00.l() { // from class: s40.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 A;
                    A = l.b.A((g0.c) obj);
                    return A;
                }
            }, 1, null);
            Format.i(" ");
            h0.a(Format, new x00.l[]{new x00.l() { // from class: s40.o
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 B;
                    B = l.b.B((g0.c) obj);
                    return B;
                }
            }, new x00.l() { // from class: s40.p
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 v11;
                    v11 = l.b.v((g0.c) obj);
                    return v11;
                }
            }}, new x00.l() { // from class: s40.q
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 w11;
                    w11 = l.b.w((g0.c) obj);
                    return w11;
                }
            });
            return yz.g2.f100423a;
        }

        public static final yz.g2 v(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            alternativeParsing.i("Z");
            return yz.g2.f100423a;
        }

        public static final yz.g2 w(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            h0.d(alternativeParsing, "GMT", new x00.l() { // from class: s40.x
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 x11;
                    x11 = l.b.x((g0.c) obj);
                    return x11;
                }
            });
            return yz.g2.f100423a;
        }

        public static final yz.g2 x(g0.c optional) {
            kotlin.jvm.internal.g0.p(optional, "$this$optional");
            optional.h(UtcOffset.b.f68488a.a());
            return yz.g2.f100423a;
        }

        public static final yz.g2 y(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            return yz.g2.f100423a;
        }

        public static final yz.g2 z(g0.c alternativeParsing) {
            kotlin.jvm.internal.g0.p(alternativeParsing, "$this$alternativeParsing");
            alternativeParsing.p(m0.f87732b.a());
            alternativeParsing.i(org.junit.jupiter.api.j2.O);
            return yz.g2.f100423a;
        }

        @m80.k
        public final e0<l> C() {
            return f87726b;
        }

        @m80.k
        public final e0<l> D() {
            return f87727c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Instant Y(l lVar, kotlinx.datetime.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pVar = kotlinx.datetime.p.f68525a.a();
        }
        return lVar.X(pVar);
    }

    public static Object b(l lVar) {
        return kotlin.jvm.internal.o0.j(new MutablePropertyReference0Impl(lVar.f87713a.M(), t0.class, "amPm", "getAmPm()Lkotlinx/datetime/format/AmPmMarker;", 0));
    }

    public static Object q(l lVar) {
        return kotlin.jvm.internal.o0.j(new MutablePropertyReference0Impl(lVar.f87713a.L(), u0.class, "offsetIsNegative", "getOffsetIsNegative()Ljava/lang/Boolean;", 0));
    }

    public static Object v(l lVar) {
        return kotlin.jvm.internal.o0.j(new MutablePropertyReference0Impl(lVar.f87713a, a0.class, "timeZoneId", "getTimeZoneId()Ljava/lang/String;", 0));
    }

    public static Object x(l lVar) {
        return kotlin.jvm.internal.o0.j(new MutablePropertyReference0Impl(lVar.f87713a.K(), r0.class, n.r.f98259a, "getYear()Ljava/lang/Integer;", 0));
    }

    public final void A(@m80.k LocalDateTime localDateTime) {
        kotlin.jvm.internal.g0.p(localDateTime, "localDateTime");
        this.f87713a.K().e(localDateTime.getDate());
        this.f87713a.M().c(localDateTime.getTime());
    }

    public final void B(@m80.k Instant instant, @m80.k UtcOffset utcOffset) {
        kotlin.jvm.internal.g0.p(instant, "instant");
        kotlin.jvm.internal.g0.p(utcOffset, "utcOffset");
        A(r40.t2.j(Instant.Companion.b(instant.getEpochSeconds() % t40.b.f89495m, instant.getNanosecondsOfSecond()), utcOffset));
        N(utcOffset);
        Integer w11 = w();
        kotlin.jvm.internal.g0.m(w11);
        V(Integer.valueOf(w11.intValue() + ((int) ((instant.getEpochSeconds() / t40.b.f89495m) * 10000))));
    }

    public final void C(@m80.k LocalDateTime localDateTime, @m80.k UtcOffset utcOffset) {
        kotlin.jvm.internal.g0.p(localDateTime, "localDateTime");
        kotlin.jvm.internal.g0.p(utcOffset, "utcOffset");
        A(localDateTime);
        N(utcOffset);
    }

    public final void D(@m80.l Integer num) {
        this.f87715c.b(this, f87712n[1], num);
    }

    public final void E(@m80.l Integer num) {
        this.f87716d.b(this, f87712n[2], num);
    }

    public final void F(@m80.l DayOfWeek dayOfWeek) {
        this.f87713a.K().t(dayOfWeek != null ? Integer.valueOf(r40.o.d(dayOfWeek)) : null);
    }

    public final void G(@m80.l Integer num) {
        this.f87717e.b(this, f87712n[3], num);
    }

    public final void H(@m80.l Integer num) {
        this.f87718f.b(this, f87712n[4], num);
    }

    public final void I(@m80.l Integer num) {
        this.f87719g.b(this, f87712n[5], num);
    }

    public final void J(@m80.l Integer num) {
        this.f87720h.b(this, f87712n[6], num);
    }

    public final void K(@m80.l Month month) {
        L(month != null ? Integer.valueOf(r40.j2.d(month)) : null);
    }

    public final void L(@m80.l Integer num) {
        this.f87714b.b(this, f87712n[0], num);
    }

    public final void M(@m80.l Integer num) {
        if (num != null && !new g10.l(0, 999999999).k(num.intValue())) {
            throw new IllegalArgumentException("Nanosecond must be in the range [0, 999_999_999].");
        }
        this.f87713a.M().k(num);
    }

    public final void N(@m80.k UtcOffset utcOffset) {
        kotlin.jvm.internal.g0.p(utcOffset, "utcOffset");
        this.f87713a.L().c(utcOffset);
    }

    public final void O(@m80.l Integer num) {
        this.f87722j.b(this, f87712n[8], num);
    }

    public final void P(@m80.l Boolean bool) {
        this.f87713a.L().B(bool);
    }

    public final void Q(@m80.l Integer num) {
        this.f87723k.b(this, f87712n[9], num);
    }

    public final void R(@m80.l Integer num) {
        this.f87724l.b(this, f87712n[10], num);
    }

    public final void S(@m80.l Integer num) {
        this.f87721i.b(this, f87712n[7], num);
    }

    public final void T(@m80.k LocalTime localTime) {
        kotlin.jvm.internal.g0.p(localTime, "localTime");
        this.f87713a.M().c(localTime);
    }

    public final void U(@m80.l String str) {
        this.f87713a.O(str);
    }

    public final void V(@m80.l Integer num) {
        this.f87713a.K().F(num);
    }

    public final void W(@m80.k YearMonth yearMonth) {
        kotlin.jvm.internal.g0.p(yearMonth, "yearMonth");
        this.f87713a.K().d().d(yearMonth);
    }

    @m80.k
    public final Instant X(@m80.k kotlinx.datetime.p youShallNotPass) {
        kotlin.jvm.internal.g0.p(youShallNotPass, "youShallNotPass");
        UtcOffset c02 = c0();
        LocalTime b02 = b0();
        r0 copy = this.f87713a.K().copy();
        copy.F(Integer.valueOf(((Number) o3.h(copy.getYear(), n.r.f98259a)).intValue() % 10000));
        try {
            kotlin.jvm.internal.g0.m(w());
            long b11 = t40.e.b(t40.e.d(r3.intValue() / 10000, t40.b.f89495m), ((copy.f().m6325toEpochDays() * 86400) + b02.toSecondOfDay()) - c02.getTotalSeconds());
            Instant.a aVar = Instant.Companion;
            Integer n11 = n();
            Instant b12 = aVar.b(b11, n11 != null ? n11.intValue() : 0);
            if (b12.getEpochSeconds() == b11) {
                return b12;
            }
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant");
        } catch (ArithmeticException e11) {
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant", e11);
        }
    }

    @m80.k
    public final LocalDate Z() {
        return this.f87713a.K().f();
    }

    @m80.l
    public final AmPmMarker a() {
        return this.f87713a.M().h();
    }

    @m80.k
    public final LocalDateTime a0() {
        return kotlinx.datetime.i.d(Z(), b0());
    }

    @m80.k
    public final LocalTime b0() {
        return this.f87713a.M().f();
    }

    @m80.k
    public final a0 c() {
        return this.f87713a;
    }

    @m80.k
    public final UtcOffset c0() {
        return this.f87713a.L().d();
    }

    @m80.l
    public final Integer d() {
        return this.f87715c.a(this, f87712n[1]);
    }

    @m80.k
    public final YearMonth d0() {
        return this.f87713a.K().d().e();
    }

    @m80.l
    public final Integer e() {
        return this.f87716d.a(this, f87712n[2]);
    }

    @m80.l
    public final DayOfWeek g() {
        Integer c11 = this.f87713a.K().c();
        if (c11 != null) {
            return r40.o.b(c11.intValue());
        }
        return null;
    }

    @m80.l
    public final Integer h() {
        return this.f87717e.a(this, f87712n[3]);
    }

    @m80.l
    public final Integer i() {
        return this.f87718f.a(this, f87712n[4]);
    }

    @m80.l
    public final Integer j() {
        return this.f87719g.a(this, f87712n[5]);
    }

    @m80.l
    public final Integer k() {
        return this.f87720h.a(this, f87712n[6]);
    }

    @m80.l
    public final Month l() {
        Integer m11 = m();
        if (m11 != null) {
            return r40.j2.b(m11.intValue());
        }
        return null;
    }

    @m80.l
    public final Integer m() {
        return this.f87714b.a(this, f87712n[0]);
    }

    @m80.l
    public final Integer n() {
        return this.f87713a.M().d();
    }

    @m80.l
    public final Integer o() {
        return this.f87722j.a(this, f87712n[8]);
    }

    @m80.l
    public final Boolean p() {
        return this.f87713a.L().I();
    }

    @m80.l
    public final Integer r() {
        return this.f87723k.a(this, f87712n[9]);
    }

    @m80.l
    public final Integer s() {
        return this.f87724l.a(this, f87712n[10]);
    }

    @m80.l
    public final Integer t() {
        return this.f87721i.a(this, f87712n[7]);
    }

    @m80.l
    public final String u() {
        return this.f87713a.N();
    }

    @m80.l
    public final Integer w() {
        return this.f87713a.K().getYear();
    }

    public final void y(@m80.l AmPmMarker amPmMarker) {
        this.f87713a.M().o(amPmMarker);
    }

    public final void z(@m80.k LocalDate localDate) {
        kotlin.jvm.internal.g0.p(localDate, "localDate");
        this.f87713a.K().e(localDate);
    }

    public l(@m80.k a0 contents) {
        kotlin.jvm.internal.g0.p(contents, "contents");
        this.f87713a = contents;
        contents.K();
        this.f87714b = new b2(new MutablePropertyReference0Impl(contents.K()) { // from class: s40.l.i
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((r0) this.receiver).m();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((r0) this.receiver).x((Integer) obj);
            }
        });
        this.f87715c = new b2(new MutablePropertyReference0Impl(contents.K()) { // from class: s40.l.c
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((r0) this.receiver).l();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((r0) this.receiver).s((Integer) obj);
            }
        });
        this.f87716d = new b2(new MutablePropertyReference0Impl(contents.K()) { // from class: s40.l.d
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((r0) this.receiver).l();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((r0) this.receiver).s((Integer) obj);
            }
        });
        this.f87717e = new x1(new MutablePropertyReference0Impl(contents.K()) { // from class: s40.l.e
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((r0) this.receiver).E();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((r0) this.receiver).v((Integer) obj);
            }
        });
        this.f87718f = new b2(new MutablePropertyReference0Impl(contents.M()) { // from class: s40.l.f
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((t0) this.receiver).n();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((t0) this.receiver).H((Integer) obj);
            }
        });
        this.f87719g = new b2(new MutablePropertyReference0Impl(contents.M()) { // from class: s40.l.g
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((t0) this.receiver).e();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((t0) this.receiver).j((Integer) obj);
            }
        });
        contents.M();
        this.f87720h = new b2(new MutablePropertyReference0Impl(contents.M()) { // from class: s40.l.h
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((t0) this.receiver).y();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((t0) this.receiver).z((Integer) obj);
            }
        });
        this.f87721i = new b2(new MutablePropertyReference0Impl(contents.M()) { // from class: s40.l.m
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((t0) this.receiver).u();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((t0) this.receiver).g((Integer) obj);
            }
        });
        contents.L();
        this.f87722j = new b2(new MutablePropertyReference0Impl(contents.L()) { // from class: s40.l.j
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((u0) this.receiver).f();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((u0) this.receiver).r((Integer) obj);
            }
        });
        this.f87723k = new b2(new MutablePropertyReference0Impl(contents.L()) { // from class: s40.l.k
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((u0) this.receiver).G();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((u0) this.receiver).b((Integer) obj);
            }
        });
        this.f87724l = new b2(new MutablePropertyReference0Impl(contents.L()) { // from class: s40.l.l
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.o
            public Object get() {
                return ((u0) this.receiver).p();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, h10.k
            public void set(Object obj) {
                ((u0) this.receiver).i((Integer) obj);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ l(s40.a0 r8, int r9, kotlin.jvm.internal.v r10) {
        /*
            r7 = this;
            r9 = r9 & 1
            if (r9 == 0) goto L11
            s40.a0 r0 = new s40.a0
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = r0
        L11:
            r7.<init>(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s40.l.<init>(s40.a0, int, kotlin.jvm.internal.v):void");
    }

    @yz.n(message = "Use 'day' instead", replaceWith = @yz.w0(expression = "day", imports = {}))
    public static /* synthetic */ void f() {
    }
}
