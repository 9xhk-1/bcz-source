package r40;

import kotlin.time.Instant;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.UtcOffset;

/* loaded from: classes8.dex */
public final class t2 {
    @m80.k
    public static final Instant a(@m80.k LocalDate localDate, @m80.k kotlinx.datetime.q qVar, @m80.k kotlinx.datetime.p pVar) {
        return kotlinx.datetime.r.b(localDate, qVar, pVar);
    }

    @m80.k
    public static final UtcOffset c(@m80.k kotlinx.datetime.q qVar, @m80.k Instant instant) {
        return kotlinx.datetime.r.e(qVar, instant);
    }

    @m80.k
    public static final UtcOffset d(@m80.k Instant instant, @m80.k kotlinx.datetime.q qVar) {
        return z2.b(instant, qVar);
    }

    @m80.k
    public static final Instant e(@m80.k LocalDateTime localDateTime, @m80.k kotlinx.datetime.q qVar, @m80.k kotlinx.datetime.p pVar) {
        return kotlinx.datetime.r.f(localDateTime, qVar, pVar);
    }

    @m80.k
    public static final Instant f(@m80.k LocalDateTime localDateTime, @m80.k UtcOffset utcOffset, @m80.k kotlinx.datetime.p pVar) {
        return kotlinx.datetime.r.g(localDateTime, utcOffset, pVar);
    }

    @m80.k
    public static final LocalDateTime i(@m80.k Instant instant, @m80.k kotlinx.datetime.q qVar) {
        return kotlinx.datetime.r.j(instant, qVar);
    }

    @m80.k
    public static final LocalDateTime j(@m80.k Instant instant, @m80.k UtcOffset utcOffset) {
        return kotlinx.datetime.r.k(instant, utcOffset);
    }
}
