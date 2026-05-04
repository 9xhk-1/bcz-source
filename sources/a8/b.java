package a8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.q0;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE})
@zz.b
@c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Repeatable(a.class)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.ANNOTATION_TYPE})
    @c(AnnotationRetention.BINARY)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
    @Retention(RetentionPolicy.CLASS)
    @q0
    public @interface a {
        b[] value();
    }

    String method();

    boolean withMethodName() default false;
}
