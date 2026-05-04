package oa0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@zz.c(AnnotationRetention.BINARY)
@RequiresOptIn(level = RequiresOptIn.Level.ERROR, message = "API marked as @KoinInternalAPI and is intended for internal framework use only. It may change or be removed in future releases without notice. External usage is strongly discouraged.")
@zz.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPEALIAS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes9.dex */
public @interface g {
}
