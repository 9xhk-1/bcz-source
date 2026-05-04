package javax.validation;

import java.util.Set;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface Validator {
    ExecutableValidator a();

    <T> Set<ConstraintViolation<T>> b(Class<T> cls, String str, Object obj, Class<?>... clsArr);

    <T> Set<ConstraintViolation<T>> c(T t11, Class<?>... clsArr);

    <T> Set<ConstraintViolation<T>> d(T t11, String str, Class<?>... clsArr);

    BeanDescriptor e(Class<?> cls);

    <T> T unwrap(Class<T> cls);
}
