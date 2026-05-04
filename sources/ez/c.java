package ez;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {
    public static final void a(@k Logger logger, @k Throwable exception) {
        g0.p(logger, "<this>");
        g0.p(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "Exception of type " + o0.d(exception.getClass());
        }
        logger.error(message, exception);
    }

    public static final void b(@k Logger logger, @k x00.a<String> message) {
        g0.p(logger, "<this>");
        g0.p(message, "message");
        if (b.a(logger)) {
            logger.trace(message.invoke());
        }
    }
}
