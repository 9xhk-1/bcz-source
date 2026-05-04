package lb0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface f<F, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {
        public static Type a(int i11, ParameterizedType parameterizedType) {
            return d0.g(i11, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return d0.h(type);
        }

        @Nullable
        public f<?, okhttp3.m> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, z zVar) {
            return null;
        }

        @Nullable
        public f<okhttp3.o, ?> d(Type type, Annotation[] annotationArr, z zVar) {
            return null;
        }

        @Nullable
        public f<?, String> e(Type type, Annotation[] annotationArr, z zVar) {
            return null;
        }
    }

    @Nullable
    T convert(F f11) throws IOException;
}
