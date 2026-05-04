package kotlinx.datetime;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import kotlin.jvm.internal.g0;
import kotlinx.datetime.YearMonth;
import r40.c4;
import r40.g3;
import r40.m3;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f68529a = e0.c(new x00.a() { // from class: r40.i4
        @Override // x00.a
        public final Object invoke() {
            DateTimeFormatter e11;
            e11 = kotlinx.datetime.t.e();
            return e11;
        }
    });

    @m80.k
    public static final YearMonth c(@m80.k YearMonth.a aVar, long j11) {
        g0.p(aVar, "<this>");
        long j12 = 12;
        long j13 = j11 / j12;
        if ((j11 ^ j12) < 0 && j13 * j12 != j11) {
            j13--;
        }
        long j14 = j11 % j12;
        return new YearMonth((int) (j13 + 1970), ((int) (j14 + (j12 & (((j14 ^ j12) & ((-j14) | j14)) >> 63)))) + 1);
    }

    public static final DateTimeFormatter d() {
        return g3.a(f68529a.getValue());
    }

    public static final DateTimeFormatter e() {
        DateTimeFormatterBuilder parseCaseInsensitive;
        ChronoField chronoField;
        SignStyle signStyle;
        DateTimeFormatterBuilder appendValue;
        DateTimeFormatterBuilder appendLiteral;
        ChronoField chronoField2;
        DateTimeFormatterBuilder appendValue2;
        DateTimeFormatter formatter;
        parseCaseInsensitive = m3.a().parseCaseInsensitive();
        chronoField = ChronoField.YEAR;
        TemporalField a11 = c4.a(chronoField);
        signStyle = SignStyle.EXCEEDS_PAD;
        appendValue = parseCaseInsensitive.appendValue(a11, 4, 10, signStyle);
        appendLiteral = appendValue.appendLiteral('-');
        chronoField2 = ChronoField.MONTH_OF_YEAR;
        appendValue2 = appendLiteral.appendValue(c4.a(chronoField2), 2);
        formatter = appendValue2.toFormatter();
        return formatter;
    }

    public static final long f(@m80.k YearMonth yearMonth) {
        g0.p(yearMonth, "<this>");
        return (((yearMonth.getYear() - 1970) * 12) + yearMonth.getMonthNumber$kotlinx_datetime()) - 1;
    }
}
