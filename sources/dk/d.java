package dk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface d {
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
