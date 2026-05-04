package javax.validation;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ConstraintValidator<A extends Annotation, T> {
    void a(A a11);

    boolean b(T t11, ConstraintValidatorContext constraintValidatorContext);
}
