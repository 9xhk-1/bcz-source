package c40;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "This is a kotlinx.coroutines API that is not intended to be inherited from, as the library may handle predefined instances of this in a special manner. This will be an error in a future release. If you need to inherit from this, please describe your use case in https://github.com/Kotlin/kotlinx.coroutines/issues, so that we can provide a stable API for inheritance. ")
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface h2 {
}
