package ba0;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.6", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class b4 {
    public static /* synthetic */ boolean b(String str) {
        return str.startsWith("-agentlib:jdwp") || str.startsWith("-Xrunjdwp");
    }

    public static Optional<List<String>> c() {
        Optional<Class<?>> q11 = ReflectionUtils.X1("java.lang.management.ManagementFactory").q();
        if (!q11.isPresent()) {
            return Optional.empty();
        }
        try {
            return Optional.of((List) ReflectionUtils.X1("java.lang.management.RuntimeMXBean").i().getMethod("getInputArguments", null).invoke(q11.get().getMethod("getRuntimeMXBean", null).invoke(null, null), null));
        } catch (Exception unused) {
            return Optional.empty();
        }
    }

    public static boolean d() {
        return ((Boolean) c().map(new Function() { // from class: ba0.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((List) obj).stream().anyMatch(new Predicate() { // from class: ba0.a4
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return b4.b((String) obj2);
                    }
                }));
                return valueOf;
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }
}
