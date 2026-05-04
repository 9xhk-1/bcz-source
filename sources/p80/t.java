package p80;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Executable;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface t extends d {
    @Override // p80.d
    @API(since = "5.10", status = API.Status.EXPERIMENTAL)
    default AnnotatedElement a() {
        return b();
    }

    Parameter b();

    default Executable c() {
        Executable declaringExecutable;
        declaringExecutable = b().getDeclaringExecutable();
        return declaringExecutable;
    }

    @Override // p80.d
    @API(since = "5.10", status = API.Status.STABLE)
    default <A extends Annotation> List<A> d(Class<A> annotationType) {
        return super.d(annotationType);
    }

    @Override // p80.d
    @API(since = "5.10", status = API.Status.STABLE)
    default boolean e(Class<? extends Annotation> annotationType) {
        return super.e(annotationType);
    }

    @Override // p80.d
    @API(since = "5.10", status = API.Status.STABLE)
    default <A extends Annotation> Optional<A> f(Class<A> annotationType) {
        return super.f(annotationType);
    }

    int getIndex();

    Optional<Object> getTarget();
}
