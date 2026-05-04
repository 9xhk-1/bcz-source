package w80;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.TestInstance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class v3 {
    public static TestInstance.Lifecycle a(Class<?> testClass, final v80.e0 configuration) {
        ba0.c2.r(testClass, "testClass must not be null");
        ba0.c2.r(configuration, "configuration must not be null");
        Optional map = org.junit.platform.commons.util.a.m(testClass, TestInstance.class).map(new Function() { // from class: w80.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TestInstance) obj).value();
            }
        });
        Objects.requireNonNull(configuration);
        return (TestInstance.Lifecycle) map.orElseGet(new Supplier() { // from class: w80.u3
            @Override // java.util.function.Supplier
            public final Object get() {
                return v80.e0.this.m();
            }
        });
    }
}
