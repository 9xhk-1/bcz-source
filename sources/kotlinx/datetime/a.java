package kotlinx.datetime;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.jvm.internal.g0;
import r40.j2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final java.time.DayOfWeek a(@m80.k DayOfWeek dayOfWeek) {
        java.time.DayOfWeek of2;
        g0.p(dayOfWeek, "<this>");
        of2 = java.time.DayOfWeek.of(r40.o.d(dayOfWeek));
        g0.o(of2, "of(...)");
        return of2;
    }

    @m80.k
    public static final java.time.LocalDate b(@m80.k LocalDate localDate) {
        g0.p(localDate, "<this>");
        return localDate.getValue$kotlinx_datetime();
    }

    @m80.k
    public static final java.time.LocalDateTime c(@m80.k LocalDateTime localDateTime) {
        g0.p(localDateTime, "<this>");
        return localDateTime.getValue$kotlinx_datetime();
    }

    @m80.k
    public static final java.time.LocalTime d(@m80.k LocalTime localTime) {
        g0.p(localTime, "<this>");
        return localTime.getValue$kotlinx_datetime();
    }

    @m80.k
    public static final java.time.Month e(@m80.k Month month) {
        java.time.Month of2;
        g0.p(month, "<this>");
        of2 = java.time.Month.of(j2.d(month));
        g0.o(of2, "of(...)");
        return of2;
    }

    @m80.k
    public static final Period f(@m80.k r40.k kVar) {
        Period of2;
        g0.p(kVar, "<this>");
        of2 = Period.of(kVar.j(), kVar.e(), kVar.b());
        g0.o(of2, "of(...)");
        return of2;
    }

    @m80.k
    public static final java.time.YearMonth g(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return yearMonth.getValue$kotlinx_datetime();
    }

    @m80.k
    public static final ZoneId h(@m80.k q qVar) {
        g0.p(qVar, "<this>");
        return qVar.c();
    }

    @m80.k
    public static final ZoneOffset i(@m80.k c cVar) {
        g0.p(cVar, "<this>");
        return cVar.g().getZoneOffset$kotlinx_datetime();
    }

    @m80.k
    public static final ZoneOffset j(@m80.k UtcOffset utcOffset) {
        g0.p(utcOffset, "<this>");
        return utcOffset.getZoneOffset$kotlinx_datetime();
    }

    @m80.k
    public static final r40.k k(@m80.k Period period) {
        int years;
        int months;
        int days;
        g0.p(period, "<this>");
        years = period.getYears();
        months = period.getMonths();
        days = period.getDays();
        return new r40.k(years, months, days);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final DayOfWeek l(@m80.k java.time.DayOfWeek dayOfWeek) {
        int value;
        g0.p(dayOfWeek, "<this>");
        m00.a<DayOfWeek> entries = DayOfWeek.getEntries();
        value = dayOfWeek.getValue();
        return (DayOfWeek) entries.get(value - 1);
    }

    @m80.k
    public static final c m(@m80.k ZoneOffset zoneOffset) {
        g0.p(zoneOffset, "<this>");
        return new c(new UtcOffset(zoneOffset));
    }

    @m80.k
    public static final LocalDate n(@m80.k java.time.LocalDate localDate) {
        g0.p(localDate, "<this>");
        return new LocalDate(localDate);
    }

    @m80.k
    public static final LocalDateTime o(@m80.k java.time.LocalDateTime localDateTime) {
        g0.p(localDateTime, "<this>");
        return new LocalDateTime(localDateTime);
    }

    @m80.k
    public static final LocalTime p(@m80.k java.time.LocalTime localTime) {
        g0.p(localTime, "<this>");
        return new LocalTime(localTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final Month q(@m80.k java.time.Month month) {
        int value;
        g0.p(month, "<this>");
        m00.a<Month> entries = Month.getEntries();
        value = month.getValue();
        return (Month) entries.get(value - 1);
    }

    @m80.k
    public static final q r(@m80.k ZoneId zoneId) {
        g0.p(zoneId, "<this>");
        return q.Companion.e(zoneId);
    }

    @m80.k
    public static final UtcOffset s(@m80.k ZoneOffset zoneOffset) {
        g0.p(zoneOffset, "<this>");
        return new UtcOffset(zoneOffset);
    }

    @m80.k
    public static final YearMonth t(@m80.k java.time.YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return new YearMonth(yearMonth);
    }

    @yz.n(message = "Use toKotlinFixedOffsetTimeZone() instead.", replaceWith = @w0(expression = "this.toKotlinFixedOffsetTimeZone()", imports = {}))
    @m80.k
    public static final c u(@m80.k ZoneOffset zoneOffset) {
        g0.p(zoneOffset, "<this>");
        return m(zoneOffset);
    }
}
