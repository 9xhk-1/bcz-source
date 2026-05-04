package s80;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.junit.jupiter.api.io.CleanupMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.PARAMETER})
@API(since = "5.10", status = API.Status.STABLE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface a {

    /* renamed from: i0, reason: collision with root package name */
    @API(since = "5.10", status = API.Status.EXPERIMENTAL)
    public static final String f88132i0 = "junit.jupiter.tempdir.factory.default";

    /* renamed from: j0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.DEPRECATED)
    @Deprecated
    public static final String f88133j0 = "junit.jupiter.tempdir.scope";

    /* renamed from: k0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.EXPERIMENTAL)
    public static final String f88134k0 = "junit.jupiter.tempdir.cleanup.mode.default";

    @API(since = "5.11", status = API.Status.STABLE)
    CleanupMode cleanup() default CleanupMode.DEFAULT;

    @API(since = "5.10", status = API.Status.EXPERIMENTAL)
    Class<? extends b> factory() default b.class;
}
