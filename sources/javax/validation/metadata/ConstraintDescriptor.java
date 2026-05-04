package javax.validation.metadata;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintTarget;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface ConstraintDescriptor<T extends Annotation> {
    Set<Class<? extends Payload>> a();

    T b();

    Set<Class<?>> c();

    String d();

    Set<ConstraintDescriptor<?>> e();

    boolean f();

    List<Class<? extends ConstraintValidator<T, ?>>> g();

    Map<String, Object> getAttributes();

    ConstraintTarget h();
}
