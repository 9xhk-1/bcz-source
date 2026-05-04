package a90;

import java.lang.reflect.Field;
import java.util.function.Function;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.5", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public interface n {
    void b(Class<? extends p80.m> extensionType);

    void d(Class<?> testClass, Object testInstance);

    void e(p80.m extension, Object source);

    void f(p80.m extension, Object source);

    void g(Class<?> testClass, Field source, Function<Object, ? extends p80.m> initializer);
}
