package p80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.11", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface j {
    <T> T a(Constructor<T> constructor, Object outerInstance);

    default <T> T b(Constructor<T> constructor) {
        return (T) a(constructor, null);
    }

    default Object c(Method method) {
        return d(method, null);
    }

    Object d(Method method, Object target);
}
