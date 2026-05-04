package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import yz.n;
import yz.w0;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE})
@c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@n(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @w0(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
/* loaded from: classes.dex */
public @interface Experimental {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
