package r40;

import java.time.Month;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class k2 {
    public static final int b(@m80.k Month month) {
        kotlin.jvm.internal.g0.p(month, "<this>");
        return j2.d(kotlinx.datetime.a.q(month));
    }

    @yz.n(message = "Use kotlinx.datetime.Month", replaceWith = @yz.w0(expression = "toKotlinMonth().number", imports = {}))
    public static /* synthetic */ void c(Month month) {
    }
}
