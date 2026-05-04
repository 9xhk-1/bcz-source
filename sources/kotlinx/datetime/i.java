package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.b;
import s40.e0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLocalDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDate.kt\nkotlinx/datetime/LocalDateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,548:1\n1#2:549\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'month' and a 'day'", replaceWith = @w0(expression = "LocalDate(year = year, month = monthNumber, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDate a(int i11, int i12, int i13) {
        return new LocalDate(i11, i12, i13);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @w0(expression = "LocalDate(year = year, month = month, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDate b(int i11, @m80.k Month month, int i12) {
        g0.p(month, "month");
        return new LocalDate(i11, month, i12);
    }

    @m80.k
    public static final LocalDateTime c(@m80.k LocalDate localDate, int i11, int i12, int i13, int i14) {
        g0.p(localDate, "<this>");
        return new LocalDateTime(localDate.getYear(), localDate.m6324getMonth(), localDate.getDay(), i11, i12, i13, i14);
    }

    @m80.k
    public static final LocalDateTime d(@m80.k LocalDate localDate, @m80.k LocalTime time) {
        g0.p(localDate, "<this>");
        g0.p(time, "time");
        return new LocalDateTime(localDate, time);
    }

    public static /* synthetic */ LocalDateTime e(LocalDate localDate, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return c(localDate, i11, i12, i13, i14);
    }

    @m80.k
    public static final String f(@m80.k LocalDate localDate, @m80.k e0<LocalDate> format) {
        g0.p(localDate, "<this>");
        g0.p(format, "format");
        return format.c(localDate);
    }

    @m80.k
    public static final e0<LocalDate> g() {
        return LocalDate.b.f68483a.a();
    }

    @m80.k
    public static final LocalDate h(@m80.k LocalDate localDate, int i11, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h.h(localDate, -i11, unit);
    }

    @m80.k
    public static final LocalDate i(@m80.k LocalDate localDate, long j11, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h.h(localDate, -j11, unit);
    }

    @yz.n(message = "Use the minus overload with an explicit number of units", replaceWith = @w0(expression = "this.minus(1, unit)", imports = {}))
    @m80.k
    public static final LocalDate j(@m80.k LocalDate localDate, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return m(localDate, -1, unit);
    }

    @m80.k
    public static final LocalDate k(@m80.k LocalDate localDate, @m80.k r40.k period) {
        g0.p(localDate, "<this>");
        g0.p(period, "period");
        if (period.b() != Integer.MIN_VALUE && period.e() != Integer.MIN_VALUE) {
            return h.j(localDate, new r40.k(-period.j(), -period.e(), -period.b()));
        }
        int j11 = period.j();
        b.a aVar = b.Companion;
        return h(h(h(localDate, j11, aVar.l()), period.e(), aVar.g()), period.b(), aVar.b());
    }

    @m80.k
    public static final r40.k l(@m80.k LocalDate localDate, @m80.k LocalDate other) {
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        return h.f(other, localDate);
    }

    @m80.k
    public static final LocalDate m(@m80.k LocalDate localDate, int i11, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h.h(localDate, i11, unit);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @w0(expression = "LocalDate.parse(this)", imports = {}))
    @m80.k
    public static final LocalDate n(@m80.k String str) {
        g0.p(str, "<this>");
        return LocalDate.a.h(LocalDate.Companion, str, null, 2, null);
    }
}
