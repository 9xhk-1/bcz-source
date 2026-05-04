package q80;

import ba0.c2;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import p80.n;
import p80.t;
import p80.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public abstract class c<T> implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Type f81916a = M();

    public final Type M() {
        ParameterizedType N = N(getClass());
        c2.s(N, new Supplier() { // from class: q80.b
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Failed to discover parameter type supported by %s; potentially caused by lacking parameterized type in class declaration.", c.this.getClass().getName());
                return format;
            }
        });
        return N.getActualTypeArguments()[0];
    }

    public final ParameterizedType N(Class<?> clazz) {
        Class<? super Object> superclass = clazz.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Type genericSuperclass = clazz.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == c.class) {
                return parameterizedType;
            }
        }
        return N(superclass);
    }

    public final Type O(t parameterContext) {
        Type parameterizedType;
        parameterizedType = parameterContext.b().getParameterizedType();
        return parameterizedType;
    }

    @Override // p80.u
    public final boolean a(t parameterContext, n extensionContext) {
        return this.f81916a.equals(O(parameterContext));
    }

    @Override // p80.u
    public abstract T u(t parameterContext, n extensionContext) throws ParameterResolutionException;
}
