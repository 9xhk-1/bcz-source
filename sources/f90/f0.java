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
@API(since = "5.7", status = API.Status.STABLE)
@f(n.class)
@Documented
@Repeatable(g0.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface f0 {
    char delimiter() default 0;

    String delimiterString() default "";

    String emptyValue() default "";

    @API(since = "5.10", status = API.Status.STABLE)
    boolean ignoreLeadingAndTrailingWhitespace() default true;

    @API(since = "5.10", status = API.Status.STABLE)
    int maxCharsPerColumn() default 4096;

    String[] nullValues() default {};

    @API(since = "5.10", status = API.Status.STABLE)
    char quoteCharacter() default '\'';

    @API(since = "5.10", status = API.Status.STABLE)
    String textBlock() default "";

    @API(since = "5.10", status = API.Status.STABLE)
    boolean useHeadersInDisplayName() default false;

    String[] value() default {};
}
