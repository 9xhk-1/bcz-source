package kotlinx.datetime;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.datetime.UtcOffset;
import s40.e0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {
    @yz.n(level = DeprecationLevel.ERROR, message = "Use UtcOffset.ZERO instead", replaceWith = @w0(expression = "UtcOffset.ZERO", imports = {}))
    @m80.k
    public static final UtcOffset a() {
        return UtcOffset.Companion.b();
    }

    @m80.k
    public static final c b(@m80.k UtcOffset utcOffset) {
        g0.p(utcOffset, "<this>");
        return new c(utcOffset);
    }

    @m80.k
    public static final String c(@m80.k UtcOffset utcOffset, @m80.k e0<UtcOffset> format) {
        g0.p(utcOffset, "<this>");
        g0.p(format, "format");
        return format.c(utcOffset);
    }

    @m80.k
    public static final e0<UtcOffset> d() {
        return UtcOffset.b.f68488a.b();
    }
}
