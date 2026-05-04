package r40;

import java.time.Month;
import kotlin.DeprecationLevel;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class i2 {
    @yz.n(message = "Use kotlinx.datetime.Month", replaceWith = @yz.w0(expression = "atDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime a(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12) {
        kotlin.jvm.internal.g0.p(localTime, "<this>");
        kotlin.jvm.internal.g0.p(month, "month");
        return h2.e(localTime, i11, kotlinx.datetime.a.q(month), i12);
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that accepts a 'month' and a 'day' instead", replaceWith = @yz.w0(expression = "this.atDate(year = year, month = month.toKotlinMonth(), day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDateTime b(@m80.k LocalTime localTime, int i11, @m80.k Month month, int i12, @m80.k yz.g2 fakeArgument) {
        kotlin.jvm.internal.g0.p(localTime, "<this>");
        kotlin.jvm.internal.g0.p(month, "month");
        kotlin.jvm.internal.g0.p(fakeArgument, "fakeArgument");
        return new LocalDateTime(i11, kotlinx.datetime.a.q(month), i12, localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNanosecond());
    }

    public static /* synthetic */ LocalDateTime c(LocalTime localTime, int i11, Month month, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return h2.c(localTime, i11, month, i12);
    }

    public static /* synthetic */ LocalDateTime d(LocalTime localTime, int i11, Month month, int i12, yz.g2 g2Var, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            g2Var = yz.g2.f100423a;
        }
        return h2.d(localTime, i11, month, i12, g2Var);
    }
}
