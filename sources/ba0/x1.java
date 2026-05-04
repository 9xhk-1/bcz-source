package ba0;

import java.io.File;
import java.util.Optional;
import java.util.function.Function;
import java.util.jar.JarFile;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6628a = "";

    public static Optional<String> a(Class<?> type, String name) {
        c2.r(type, "type must not be null");
        c2.k(name, "name must not be blank");
        try {
            JarFile jarFile = new JarFile(new File(type.getProtectionDomain().getCodeSource().getLocation().toURI()));
            try {
                Optional<String> ofNullable = Optional.ofNullable(jarFile.getManifest().getMainAttributes().getValue(name));
                jarFile.close();
                return ofNullable;
            } finally {
            }
        } catch (Exception unused) {
            return Optional.empty();
        }
    }

    public static Optional<String> b(Class<?> type, Function<Package, String> function) {
        c2.r(type, "type must not be null");
        c2.r(function, "function must not be null");
        return Optional.ofNullable(type.getPackage()).map(function);
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static Optional<String> c(Class<?> type) {
        Optional<String> h11 = u1.h(type);
        return h11.isPresent() ? h11 : b(type, new Function() { // from class: ba0.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Package) obj).getImplementationVersion();
            }
        });
    }
}
