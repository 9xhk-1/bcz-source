package z80;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface l0 {
    default p80.f0 a(a90.b0 extensionRegistry, org.junit.platform.engine.support.hierarchical.m throwableCollector) {
        return b(extensionRegistry, extensionRegistry, throwableCollector);
    }

    p80.f0 b(a90.o extensionRegistry, a90.n extensionRegistrar, org.junit.platform.engine.support.hierarchical.m throwableCollector);
}
