package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({})
@zz.c(AnnotationRetention.BINARY)
@zz.d(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface Junction {
    String entityColumn() default "";

    String parentColumn() default "";

    Class<?> value();
}
