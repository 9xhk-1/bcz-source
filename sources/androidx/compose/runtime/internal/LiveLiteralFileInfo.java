package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@ComposeCompilerApi
@c(AnnotationRetention.RUNTIME)
@d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface LiveLiteralFileInfo {
    String file();
}
