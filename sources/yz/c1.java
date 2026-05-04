package yz;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@y0(version = "2.1")
@j2(markerClass = {t.class})
@zz.c(AnnotationRetention.BINARY)
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes8.dex */
public @interface c1 {
    Class<? extends Annotation>[] markerClass();
}
