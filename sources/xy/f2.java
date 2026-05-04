package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f2 {
    @m80.l
    public static final Throwable a(@m80.k Throwable th2) {
        kotlin.jvm.internal.g0.p(th2, "<this>");
        while (true) {
            if ((th2 != null ? th2.getCause() : null) == null) {
                return th2;
            }
            th2 = th2.getCause();
        }
    }

    @io.ktor.utils.io.b0
    public static /* synthetic */ void b(Throwable th2) {
    }
}
