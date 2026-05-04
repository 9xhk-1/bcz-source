package lb0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface c<R, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {
        public static Type b(int i11, ParameterizedType parameterizedType) {
            return d0.g(i11, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return d0.h(type);
        }

        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, z zVar);
    }

    T a(b<R> bVar);

    Type b();
}
