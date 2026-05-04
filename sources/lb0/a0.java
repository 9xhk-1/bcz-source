package lb0;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a0<T> {
    public static <T> a0<T> b(z zVar, Method method) {
        x b11 = x.b(zVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (d0.j(genericReturnType)) {
            throw d0.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return j.f(zVar, method, b11);
        }
        throw d0.m(method, "Service methods cannot return void.", new Object[0]);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
