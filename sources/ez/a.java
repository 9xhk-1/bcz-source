package ez;

import kotlin.jvm.internal.g0;
import m80.k;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final Logger a(@k String name) {
        g0.p(name, "name");
        Logger logger = LoggerFactory.getLogger(name);
        g0.o(logger, "getLogger(...)");
        return logger;
    }
}
