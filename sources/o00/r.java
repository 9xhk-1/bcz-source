package o00;

import java.io.InvalidObjectException;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {
    @f
    public static final Void a() {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @f
    public static final void b(x00.a<g2> action) {
        g0.p(action, "action");
        try {
            action.invoke();
        } catch (Throwable th2) {
            Throwable initCause = new InvalidObjectException(th2.getMessage()).initCause(th2);
            g0.o(initCause, "initCause(...)");
            throw initCause;
        }
    }
}
