package javax.validation.executable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Set;
import javax.validation.ConstraintViolation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ExecutableValidator {
    <T> Set<ConstraintViolation<T>> a(Constructor<? extends T> constructor, Object[] objArr, Class<?>... clsArr);

    <T> Set<ConstraintViolation<T>> b(T t11, Method method, Object obj, Class<?>... clsArr);

    <T> Set<ConstraintViolation<T>> c(T t11, Method method, Object[] objArr, Class<?>... clsArr);

    <T> Set<ConstraintViolation<T>> d(Constructor<? extends T> constructor, T t11, Class<?>... clsArr);
}
