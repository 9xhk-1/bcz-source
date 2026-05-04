package javax.validation;

import javax.validation.metadata.ConstraintDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ConstraintViolation<T> {
    ConstraintDescriptor<?> a();

    String d();

    Object e();

    Object[] f();

    Class<T> g();

    String getMessage();

    Object h();

    Object i();

    Path j();

    T k();

    <U> U unwrap(Class<U> cls);
}
