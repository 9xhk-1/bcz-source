package org.junit.jupiter.api;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.7", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface k2 {
    @API(since = "5.10", status = API.Status.STABLE)
    String a();

    <A extends Annotation> List<A> d(Class<A> annotationType);

    boolean e(Class<? extends Annotation> annotationType);

    <A extends Annotation> Optional<A> f(Class<A> annotationType);

    Method getMethod();
}
