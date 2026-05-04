package hx;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    public static final <T> void a(@k c cVar, @k a<T> definition, T t11, @l Logger logger) {
        g0.p(cVar, "<this>");
        g0.p(definition, "definition");
        try {
            cVar.b(definition, t11);
        } catch (Throwable th2) {
            if (logger != null) {
                logger.error("Some handlers have thrown an exception", th2);
            }
        }
    }

    public static /* synthetic */ void b(c cVar, a aVar, Object obj, Logger logger, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            logger = null;
        }
        a(cVar, aVar, obj, logger);
    }
}
