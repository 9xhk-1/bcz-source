package androidx.compose.runtime;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD})
@zz.a
@c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ReadOnlyComposable {
}
