package r40;

import kotlin.time.Instant;
import kotlinx.datetime.UtcOffset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class z2 {
    @m80.k
    public static final UtcOffset b(@m80.k Instant instant, @m80.k kotlinx.datetime.q timeZone) {
        kotlin.jvm.internal.g0.p(instant, "<this>");
        kotlin.jvm.internal.g0.p(timeZone, "timeZone");
        return t2.c(timeZone, instant);
    }

    @yz.n(message = "Use FixedOffsetTimeZone or UtcOffset instead", replaceWith = @yz.w0(expression = "FixedOffsetTimeZone", imports = {}))
    public static /* synthetic */ void a() {
    }
}
