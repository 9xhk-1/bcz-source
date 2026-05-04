package ba0;

import java.net.URL;
import java.security.CodeSource;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class m {
    public static ClassLoader a(Class<?> clazz) {
        c2.r(clazz, "Class must not be null");
        ClassLoader classLoader = clazz.getClassLoader();
        return classLoader != null ? classLoader : b();
    }

    public static ClassLoader b() {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader;
            }
        } catch (Throwable th2) {
            h4.a(th2);
        }
        return ClassLoader.getSystemClassLoader();
    }

    public static Optional<URL> c(Object object) {
        c2.r(object, "object must not be null");
        ClassLoader classLoader = object.getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
            while (classLoader != null && classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
        }
        if (classLoader != null) {
            try {
                return Optional.ofNullable(classLoader.getResource(object.getClass().getName().replace(".", "/") + ".class"));
            } catch (Throwable th2) {
                h4.a(th2);
            }
        }
        try {
            CodeSource codeSource = object.getClass().getProtectionDomain().getCodeSource();
            if (codeSource != null) {
                return Optional.ofNullable(codeSource.getLocation());
            }
        } catch (SecurityException unused) {
        }
        return Optional.empty();
    }
}
