package z30;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.q0;
import z30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@zz.b
@zz.c(AnnotationRetention.SOURCE)
@zz.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes8.dex */
public @interface e<T, P extends b<? super T>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE})
    @zz.c(AnnotationRetention.SOURCE)
    @zz.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    @Retention(RetentionPolicy.SOURCE)
    @q0
    public @interface a {
        e[] value();
    }
}
