package oa0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE, ElementType.METHOD})
@zz.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface r {
    Class<?>[] binds() default {g2.class};

    boolean createdAtStart() default false;
}
