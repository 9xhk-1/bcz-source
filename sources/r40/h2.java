package r40;

import java.time.Month;
import kotlin.DeprecationLevel;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;

/* loaded from: classes8.dex */
public final class h2 {
    @m80.k
    public static final LocalDateTime a(@m80.k LocalTime localTime, int i11, int i12, int i13) {
        return kotlinx.datetime.o.a(localTime, i11, i12, i13);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @yz.w0(expression = "this.atDate(year = year, month = monthNumber, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime b(@m80.k LocalTime localTime, int i11, int i12, int i13, @m80.k yz.g2 g2Var) {
        return kotlinx.datetime.o.b(localTime, i11, i12, i13, g2Var);
    }

    @yz.n(message = "Use kotlinx.datetime.Month", replaceWith = @yz.w0(expression = "atDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime c(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12) {
        return i2.a(localTime, i11, month, i12);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @yz.w0(expression = "this.atDate(year = year, month = month.toKotlinMonth(), day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime d(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12, @m80.k yz.g2 g2Var) {
        return i2.b(localTime, i11, month, i12, g2Var);
    }

    @m80.k
    public static final LocalDateTime e(@m80.k LocalTime localTime, int i11, @m80.k kotlinx.datetime.Month month, int i12) {
        return kotlinx.datetime.o.c(localTime, i11, month, i12);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @yz.w0(expression = "this.atDate(year = year, month = month, day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime f(@m80.k LocalTime localTime, int i11, @m80.k kotlinx.datetime.Month month, int i12, @m80.k yz.g2 g2Var) {
        return kotlinx.datetime.o.d(localTime, i11, month, i12, g2Var);
    }

    @m80.k
    public static final LocalDateTime g(@m80.k LocalTime localTime, @m80.k LocalDate localDate) {
        return kotlinx.datetime.o.e(localTime, localDate);
    }

    @m80.k
    public static final String l(@m80.k LocalTime localTime, @m80.k s40.e0<LocalTime> e0Var) {
        return kotlinx.datetime.o.h(localTime, e0Var);
    }

    @m80.k
    public static final s40.e0<LocalTime> m() {
        return kotlinx.datetime.o.i();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @yz.w0(expression = "LocalTime.parse(this)", imports = {}))
    @m80.k
    public static final LocalTime n(@m80.k String str) {
        return kotlinx.datetime.o.j(str);
    }
}
