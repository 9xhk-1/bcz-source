package w00;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.DeprecationLevel;
import kotlin.annotation.AnnotationTarget;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD})
@y0(version = "1.2")
@zz.d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.RUNTIME)
@yz.n(level = DeprecationLevel.HIDDEN, message = "Switch to new -jvm-default modes: `enable` or `no-compatibility`")
/* loaded from: classes8.dex */
public @interface c {
}
