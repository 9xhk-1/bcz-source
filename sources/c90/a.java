package c90;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.junit.jupiter.api.l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@API(since = "5.7", status = API.Status.STABLE)
@l3
@Documented
@Retention(RetentionPolicy.RUNTIME)
@p80.l({k.class})
/* loaded from: classes9.dex */
public @interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8374a = "{displayName}";

    /* renamed from: b, reason: collision with root package name */
    public static final String f8375b = "{index}";

    /* renamed from: c, reason: collision with root package name */
    public static final String f8376c = "{arguments}";

    /* renamed from: d, reason: collision with root package name */
    public static final String f8377d = "{argumentsWithNames}";

    /* renamed from: e, reason: collision with root package name */
    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static final String f8378e = "{argumentSetName}";

    /* renamed from: f, reason: collision with root package name */
    @API(since = "5.11", status = API.Status.EXPERIMENTAL)
    public static final String f8379f = "{argumentSetNameOrArgumentsWithNames}";

    /* renamed from: g, reason: collision with root package name */
    public static final String f8380g = "[{index}] {argumentSetNameOrArgumentsWithNames}";

    @API(since = "5.10", status = API.Status.STABLE)
    boolean autoCloseArguments() default true;

    String name() default "{default_display_name}";
}
