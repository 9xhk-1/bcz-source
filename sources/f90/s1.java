package f90;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@API(since = "5.11", status = API.Status.EXPERIMENTAL)
@f(r1.class)
@Documented
@Repeatable(t1.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface s1 {
    String[] value() default {};
}
