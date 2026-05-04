package h40;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {
    public static final void a(@m80.k kotlin.coroutines.d dVar, @m80.k Throwable th2) {
        Iterator<c40.n0> it = i.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(dVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                i.c(c40.o0.c(th2, th3));
            }
        }
        try {
            yz.r.a(th2, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        i.c(th2);
    }
}
