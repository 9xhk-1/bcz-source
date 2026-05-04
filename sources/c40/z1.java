package c40;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "Inheriting from this kotlinx.coroutines API is unstable. Either new methods may be added in the future, which would break the inheritance, or correctly inheriting from it requires fulfilling contracts that may change in the future.")
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface z1 {
}
