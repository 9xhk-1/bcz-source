package l80;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes9.dex */
public @interface a {
    public static final String J = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String K = "this";
    public static final String L = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    public static final String M = "The return value of this method";
    public static final String N = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
