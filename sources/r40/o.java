package r40;

import java.time.DayOfWeek;
import kotlin.DeprecationLevel;

/* loaded from: classes8.dex */
public final class o {
    @o00.i
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
    public static final /* synthetic */ DayOfWeek a(int i11) {
        DayOfWeek a11;
        a11 = kotlinx.datetime.a.a(b(i11));
        return a11;
    }

    @m80.k
    public static final kotlinx.datetime.DayOfWeek b(int i11) {
        return q.a(i11);
    }

    public static final int c(@m80.k DayOfWeek dayOfWeek) {
        return p.b(dayOfWeek);
    }

    public static final int d(@m80.k kotlinx.datetime.DayOfWeek dayOfWeek) {
        return q.b(dayOfWeek);
    }
}
