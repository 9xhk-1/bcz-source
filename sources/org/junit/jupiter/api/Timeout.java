package org.junit.jupiter.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE, ElementType.METHOD})
@API(since = "5.7", status = API.Status.STABLE)
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface Timeout {

    @API(since = "5.9", status = API.Status.STABLE)
    public static final String W = "junit.jupiter.execution.timeout.default";

    @API(since = "5.9", status = API.Status.STABLE)
    public static final String X = "junit.jupiter.execution.timeout.testable.method.default";

    @API(since = "5.9", status = API.Status.STABLE)
    public static final String Y = "junit.jupiter.execution.timeout.test.method.default";

    @API(since = "5.9", status = API.Status.STABLE)
    public static final String Z = "junit.jupiter.execution.timeout.testtemplate.method.default";

    /* renamed from: a0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77926a0 = "junit.jupiter.execution.timeout.testfactory.method.default";

    /* renamed from: b0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77927b0 = "junit.jupiter.execution.timeout.lifecycle.method.default";

    /* renamed from: c0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77928c0 = "junit.jupiter.execution.timeout.beforeall.method.default";

    /* renamed from: d0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77929d0 = "junit.jupiter.execution.timeout.beforeeach.method.default";

    /* renamed from: e0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77930e0 = "junit.jupiter.execution.timeout.aftereach.method.default";

    /* renamed from: f0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77931f0 = "junit.jupiter.execution.timeout.afterall.method.default";

    /* renamed from: g0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.STABLE)
    public static final String f77932g0 = "junit.jupiter.execution.timeout.mode";

    /* renamed from: h0, reason: collision with root package name */
    @API(since = "5.9", status = API.Status.EXPERIMENTAL)
    public static final String f77933h0 = "junit.jupiter.execution.timeout.thread.mode.default";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.11", status = API.Status.STABLE)
    public enum ThreadMode {
        INFERRED,
        SAME_THREAD,
        SEPARATE_THREAD
    }

    @API(since = "5.11", status = API.Status.STABLE)
    ThreadMode threadMode() default ThreadMode.INFERRED;

    TimeUnit unit() default TimeUnit.SECONDS;

    long value();
}
