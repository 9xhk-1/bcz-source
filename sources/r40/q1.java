package r40;

import java.time.Month;
import kotlin.DeprecationLevel;
import kotlinx.datetime.LocalDateTime;

/* loaded from: classes8.dex */
public final class q1 {
    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'month' and a 'day'", replaceWith = @yz.w0(expression = "LocalDateTime(year = year, month = monthNumber, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime a(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return kotlinx.datetime.n.a(i11, i12, i13, i14, i15, i16, i17);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @yz.w0(expression = "LocalDateTime(year = year, month = month.toKotlinMonth(), day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime b(int i11, @m80.k Month month, int i12, int i13, int i14, int i15, int i16) {
        return r1.a(i11, month, i12, i13, i14, i15, i16);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @yz.w0(expression = "LocalDateTime(year = year, month = month, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime c(int i11, @m80.k kotlinx.datetime.Month month, int i12, int i13, int i14, int i15, int i16) {
        return kotlinx.datetime.n.b(i11, month, i12, i13, i14, i15, i16);
    }

    @m80.k
    public static final String g(@m80.k LocalDateTime localDateTime, @m80.k s40.e0<LocalDateTime> e0Var) {
        return kotlinx.datetime.n.e(localDateTime, e0Var);
    }

    @m80.k
    public static final s40.e0<LocalDateTime> h() {
        return kotlinx.datetime.n.f();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @yz.w0(expression = "LocalDateTime.parse(this)", imports = {}))
    @m80.k
    public static final LocalDateTime i(@m80.k String str) {
        return kotlinx.datetime.n.g(str);
    }
}
