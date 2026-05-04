package r40;

import kotlin.DeprecationLevel;
import kotlin.time.Instant;
import kotlin.time.n;
import kotlinx.datetime.LocalDate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @m80.k
    public static final w30.b a(@m80.k kotlin.time.n nVar, @m80.k Instant instant) {
        return b.a(nVar, instant);
    }

    @w30.h
    @yz.n(level = DeprecationLevel.WARNING, message = "This function is deprecated because Clock.System.asTimeSource can be confused with TimeSource.Monotonic, which are very different. See https://github.com/Kotlin/kotlinx-datetime/issues/372")
    @m80.k
    public static final n.c b(@m80.k w30.b bVar) {
        return b.b(bVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use Clock.todayIn instead", replaceWith = @yz.w0(expression = "this.todayIn(timeZone)", imports = {}))
    @m80.k
    public static final LocalDate c(@m80.k w30.b bVar, @m80.k kotlinx.datetime.q qVar) {
        return b.c(bVar, qVar);
    }

    @m80.k
    public static final LocalDate d(@m80.k w30.b bVar, @m80.k kotlinx.datetime.q qVar) {
        return b.d(bVar, qVar);
    }
}
