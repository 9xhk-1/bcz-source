package uo;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
/* loaded from: classes7.dex */
public @interface s {
    String allowedOnPath() default "";

    Class<? extends Annotation>[] allowlistAnnotations() default {};

    Class<? extends Annotation>[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link();
}
