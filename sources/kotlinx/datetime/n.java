package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.datetime.LocalDateTime;
import r40.q1;
import s40.e0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class n {
    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'month' and a 'day'", replaceWith = @w0(expression = "LocalDateTime(year = year, month = monthNumber, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime a(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return new LocalDateTime(i11, i12, i13, i14, i15, i16, i17);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @w0(expression = "LocalDateTime(year = year, month = month, day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime b(int i11, @m80.k Month month, int i12, int i13, int i14, int i15, int i16) {
        g0.p(month, "month");
        return new LocalDateTime(i11, month, i12, i13, i14, i15, i16);
    }

    public static /* synthetic */ LocalDateTime c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 32) != 0) {
            i16 = 0;
        }
        if ((i18 & 64) != 0) {
            i17 = 0;
        }
        return q1.a(i11, i12, i13, i14, i15, i16, i17);
    }

    public static /* synthetic */ LocalDateTime d(int i11, Month month, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            i15 = 0;
        }
        if ((i17 & 64) != 0) {
            i16 = 0;
        }
        return q1.c(i11, month, i12, i13, i14, i15, i16);
    }

    @m80.k
    public static final String e(@m80.k LocalDateTime localDateTime, @m80.k e0<LocalDateTime> format) {
        g0.p(localDateTime, "<this>");
        g0.p(format, "format");
        return format.c(localDateTime);
    }

    @m80.k
    public static final e0<LocalDateTime> f() {
        return LocalDateTime.b.f68485a.a();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @w0(expression = "LocalDateTime.parse(this)", imports = {}))
    @m80.k
    public static final LocalDateTime g(@m80.k String str) {
        g0.p(str, "<this>");
        return LocalDateTime.a.f(LocalDateTime.Companion, str, null, 2, null);
    }
}
