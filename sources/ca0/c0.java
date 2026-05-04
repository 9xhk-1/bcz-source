package ca0;

import ba0.u1;
import ba0.x1;
import java.util.Optional;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface c0 {
    TestDescriptor a(q discoveryRequest, UniqueId uniqueId);

    default Optional<String> b() {
        Optional<String> g11 = u1.g(getClass());
        return g11.isPresent() ? g11 : x1.b(getClass(), new Function() { // from class: ca0.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Package) obj).getImplementationTitle();
            }
        });
    }

    void c(s request);

    default Optional<String> getGroupId() {
        return Optional.empty();
    }

    String getId();

    default Optional<String> getVersion() {
        Optional<String> a11 = x1.a(getClass(), "Engine-Version-" + getId());
        return a11.isPresent() ? a11 : Optional.of(x1.c(getClass()).orElse("DEVELOPMENT"));
    }
}
