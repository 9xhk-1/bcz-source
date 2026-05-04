package g90;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Inherited
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface l {
    boolean applyDefaultConversion() default true;

    String defaultNullRead() default "null";

    String defaultNullWrite() default "null";

    String[] field() default {};

    int index() default -1;
}
