package r40;

import java.time.DayOfWeek;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class p {
    public static final int b(@m80.k DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.g0.p(dayOfWeek, "<this>");
        return o.d(kotlinx.datetime.a.l(dayOfWeek));
    }

    @yz.n(message = "Use kotlinx.datetime.DayOfWeek", replaceWith = @yz.w0(expression = "toKotlinDayOfWeek().isoDayNumber", imports = {}))
    public static /* synthetic */ void c(DayOfWeek dayOfWeek) {
    }
}
