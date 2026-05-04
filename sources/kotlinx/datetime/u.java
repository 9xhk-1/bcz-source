package kotlinx.datetime;

import kotlin.jvm.internal.g0;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.b;
import s40.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {
    @m80.k
    public static final String a(@m80.k YearMonth yearMonth, @m80.k e0<YearMonth> format) {
        g0.p(yearMonth, "<this>");
        g0.p(format, "format");
        return format.c(yearMonth);
    }

    @m80.k
    public static final YearMonth b(@m80.k YearMonth.a aVar, long j11) {
        g0.p(aVar, "<this>");
        long j12 = 12;
        long j13 = j11 / j12;
        if ((j11 ^ j12) < 0 && j13 * j12 != j11) {
            j13--;
        }
        LocalDate.a aVar2 = LocalDate.Companion;
        int year = aVar2.e().getYear();
        if (j13 <= aVar2.d().getYear() && year <= j13) {
            long j14 = j11 % j12;
            return new YearMonth((int) j13, ((int) (j14 + (j12 & (((j14 ^ j12) & ((-j14) | j14)) >> 63)))) + 1);
        }
        throw new IllegalArgumentException(("Year " + j13 + " is out of range: " + aVar2.e().getYear() + zr.m.f102856e + aVar2.d().getYear()).toString());
    }

    @m80.k
    public static final YearMonth c(@m80.k YearMonth.a aVar) {
        g0.p(aVar, "<this>");
        return f(LocalDate.Companion.d());
    }

    @m80.k
    public static final YearMonth d(@m80.k YearMonth.a aVar) {
        g0.p(aVar, "<this>");
        return f(LocalDate.Companion.e());
    }

    public static final long e(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return (yearMonth.getYear() * 12) + (yearMonth.getMonthNumber$kotlinx_datetime() - 1);
    }

    @m80.k
    public static final YearMonth f(@m80.k LocalDate localDate) {
        g0.p(localDate, "<this>");
        return new YearMonth(localDate.getYear(), localDate.m6324getMonth());
    }

    @m80.k
    public static final YearMonth g(@m80.k YearMonth yearMonth, int i11, @m80.k b.d unit) {
        g0.p(yearMonth, "<this>");
        g0.p(unit, "unit");
        return h(yearMonth, i11, unit);
    }

    @m80.k
    public static final YearMonth h(@m80.k YearMonth yearMonth, long j11, @m80.k b.d unit) {
        g0.p(yearMonth, "<this>");
        g0.p(unit, "unit");
        return j11 != Long.MIN_VALUE ? n(yearMonth, -j11, unit) : m(n(yearMonth, Long.MAX_VALUE, unit), 1, unit);
    }

    @m80.k
    public static final YearMonth i(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return g(yearMonth, 1, b.Companion.g());
    }

    @m80.k
    public static final YearMonth j(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return g(yearMonth, 1, b.Companion.l());
    }

    public static final int k(@m80.k YearMonth yearMonth, @m80.k YearMonth other) {
        g0.p(yearMonth, "<this>");
        g0.p(other, "other");
        return t40.f.a(e(other) - e(yearMonth));
    }

    @m80.k
    public static final LocalDate l(@m80.k YearMonth yearMonth, int i11) {
        g0.p(yearMonth, "<this>");
        return new LocalDate(yearMonth.getYear(), yearMonth.getMonth(), i11);
    }

    @m80.k
    public static final YearMonth m(@m80.k YearMonth yearMonth, int i11, @m80.k b.d unit) {
        g0.p(yearMonth, "<this>");
        g0.p(unit, "unit");
        return n(yearMonth, i11, unit);
    }

    @m80.k
    public static final YearMonth n(@m80.k YearMonth yearMonth, long j11, @m80.k b.d unit) {
        g0.p(yearMonth, "<this>");
        g0.p(unit, "unit");
        try {
            long d11 = t40.e.d(j11, unit.p());
            return d11 == 0 ? yearMonth : b(YearMonth.Companion, t40.e.b(e(yearMonth), d11));
        } catch (ArithmeticException e11) {
            throw new DateTimeArithmeticException("Arithmetic overflow when adding " + j11 + " of " + unit + " to " + yearMonth, e11);
        } catch (IllegalArgumentException e12) {
            throw new DateTimeArithmeticException("Boundaries of YearMonth exceeded when adding " + j11 + " of " + unit + " to " + yearMonth, e12);
        }
    }

    @m80.k
    public static final YearMonth o(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return m(yearMonth, 1, b.Companion.g());
    }

    @m80.k
    public static final YearMonth p(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return m(yearMonth, 1, b.Companion.l());
    }

    public static final long q(@m80.k YearMonth yearMonth, @m80.k YearMonth other, @m80.k b.d unit) {
        g0.p(yearMonth, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        return (e(other) - e(yearMonth)) / unit.p();
    }

    public static final int r(@m80.k YearMonth yearMonth, @m80.k YearMonth other) {
        g0.p(yearMonth, "<this>");
        g0.p(other, "other");
        return (int) ((e(other) - e(yearMonth)) / 12);
    }
}
