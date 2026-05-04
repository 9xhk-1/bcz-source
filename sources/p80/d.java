package p80;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public interface d {
    AnnotatedElement a();

    default <A extends Annotation> List<A> d(Class<A> annotationType) {
        return z90.f.p(a(), annotationType);
    }

    default boolean e(Class<? extends Annotation> annotationType) {
        return z90.f.r(a(), annotationType);
    }

    default <A extends Annotation> Optional<A> f(Class<A> annotationType) {
        return z90.f.m(a(), annotationType);
    }
}
