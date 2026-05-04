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
@f(u.class)
@Documented
@Repeatable(b0.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface a0 {
    char delimiter() default 0;

    String delimiterString() default "";

    String emptyValue() default "";

    String encoding() default "UTF-8";

    String[] files() default {};

    @API(since = "5.10", status = API.Status.STABLE)
    boolean ignoreLeadingAndTrailingWhitespace() default true;

    String lineSeparator() default "\n";

    @API(since = "5.10", status = API.Status.STABLE)
    int maxCharsPerColumn() default 4096;

    String[] nullValues() default {};

    int numLinesToSkip() default 0;

    @API(since = "5.10", status = API.Status.STABLE)
    char quoteCharacter() default '\"';

    String[] resources() default {};

    @API(since = "5.10", status = API.Status.STABLE)
    boolean useHeadersInDisplayName() default false;
}
