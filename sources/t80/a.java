package t80;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.junit.jupiter.api.parallel.ExecutionMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE, ElementType.METHOD})
@API(since = "5.10", status = API.Status.STABLE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface a {

    /* renamed from: l0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.EXPERIMENTAL)
    public static final String f90344l0 = "junit.jupiter.execution.parallel.mode.default";

    /* renamed from: m0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.EXPERIMENTAL)
    public static final String f90345m0 = "junit.jupiter.execution.parallel.mode.classes.default";

    @API(since = "5.10", status = API.Status.STABLE)
    String reason() default "";

    ExecutionMode value();
}
