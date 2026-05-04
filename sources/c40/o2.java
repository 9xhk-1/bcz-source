package c40;

import java.util.concurrent.Future;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class o2 {
    @yz.n(level = DeprecationLevel.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @yz.w0(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void a(@m80.k n<?> nVar, @m80.k Future<?> future) {
        r.c(nVar, new c3(future));
    }
}
