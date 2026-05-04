package o80;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.junit.jupiter.api.condition.JRE;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE, ElementType.METHOD})
@API(since = "5.1", status = API.Status.STABLE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@p80.l({e1.class})
/* loaded from: classes9.dex */
public @interface c1 {
    @API(since = "5.7", status = API.Status.STABLE)
    String disabledReason() default "";

    JRE[] value();
}
