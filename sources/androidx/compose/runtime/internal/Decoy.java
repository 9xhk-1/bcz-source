package androidx.compose.runtime.internal;

import androidx.compose.runtime.ExperimentalComposeApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@ExperimentalComposeApi
/* loaded from: classes.dex */
public @interface Decoy {
    String[] signature();

    String targetName();
}
