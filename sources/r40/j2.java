package r40;

import java.time.Month;
import kotlin.DeprecationLevel;

/* loaded from: classes8.dex */
public final class j2 {
    @o00.i
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
    public static final /* synthetic */ Month a(int i11) {
        Month e11;
        e11 = kotlinx.datetime.a.e(b(i11));
        return e11;
    }

    @m80.k
    public static final kotlinx.datetime.Month b(int i11) {
        return l2.a(i11);
    }

    public static final int c(@m80.k Month month) {
        return k2.b(month);
    }

    public static final int d(@m80.k kotlinx.datetime.Month month) {
        return l2.b(month);
    }
}
