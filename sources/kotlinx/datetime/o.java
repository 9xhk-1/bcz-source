package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.datetime.LocalTime;
import r40.h2;
import s40.e0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class o {
    @m80.k
    public static final LocalDateTime a(@m80.k LocalTime localTime, int i11, int i12, int i13) {
        g0.p(localTime, "<this>");
        return new LocalDateTime(i11, i12, i13, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @w0(expression = "this.atDate(year = year, month = monthNumber, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime b(@m80.k LocalTime localTime, int i11, int i12, int i13, @m80.k g2 fakeArgument) {
        g0.p(localTime, "<this>");
        g0.p(fakeArgument, "fakeArgument");
        return new LocalDateTime(i11, i12, i13, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    @m80.k
    public static final LocalDateTime c(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12) {
        g0.p(localTime, "<this>");
        g0.p(month, "month");
        return new LocalDateTime(i11, month, i12, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @w0(expression = "this.atDate(year = year, month = month, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime d(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12, @m80.k g2 fakeArgument) {
        g0.p(localTime, "<this>");
        g0.p(month, "month");
        g0.p(fakeArgument, "fakeArgument");
        return new LocalDateTime(i11, month, i12, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    @m80.k
    public static final LocalDateTime e(@m80.k LocalTime localTime, @m80.k LocalDate date) {
        g0.p(localTime, "<this>");
        g0.p(date, "date");
        return new LocalDateTime(date, localTime);
    }

    public static /* synthetic */ LocalDateTime f(LocalTime localTime, int i11, int i12, int i13, g2 g2Var, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            g2Var = g2.f100423a;
        }
        return h2.b(localTime, i11, i12, i13, g2Var);
    }

    public static /* synthetic */ LocalDateTime g(LocalTime localTime, int i11, Month month, int i12, g2 g2Var, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            g2Var = g2.f100423a;
        }
        return h2.f(localTime, i11, month, i12, g2Var);
    }

    @m80.k
    public static final String h(@m80.k LocalTime localTime, @m80.k e0<LocalTime> format) {
        g0.p(localTime, "<this>");
        g0.p(format, "format");
        return format.c(localTime);
    }

    @m80.k
    public static final e0<LocalTime> i() {
        return LocalTime.b.f68487a.a();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @w0(expression = "LocalTime.parse(this)", imports = {}))
    @m80.k
    public static final LocalTime j(@m80.k String str) {
        g0.p(str, "<this>");
        return LocalTime.a.i(LocalTime.Companion, str, null, 2, null);
    }
}
