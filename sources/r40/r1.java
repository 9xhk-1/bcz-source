package r40;

import java.time.Month;
import kotlin.DeprecationLevel;
import kotlinx.datetime.LocalDateTime;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class r1 {
    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @yz.w0(expression = "LocalDateTime(year = year, month = month.toKotlinMonth(), day = dayOfMonth, hour = hour, minute = minute, second = second, nanosecond = nanosecond)", imports = {}))
    @m80.k
    public static final LocalDateTime a(int i11, @m80.k Month month, int i12, int i13, int i14, int i15, int i16) {
        kotlin.jvm.internal.g0.p(month, "month");
        return new LocalDateTime(i11, kotlinx.datetime.a.q(month), i12, i13, i14, i15, i16);
    }

    public static /* synthetic */ LocalDateTime b(int i11, Month month, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            i15 = 0;
        }
        if ((i17 & 64) != 0) {
            i16 = 0;
        }
        return q1.b(i11, month, i12, i13, i14, i15, i16);
    }
}
