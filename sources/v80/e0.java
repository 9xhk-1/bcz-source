package v80;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.f1;
import org.junit.jupiter.api.io.CleanupMode;
import org.junit.jupiter.api.l2;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.z1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.4", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public interface e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f93628a = "junit.jupiter.conditions.deactivate";

    /* renamed from: b, reason: collision with root package name */
    public static final String f93629b = "junit.jupiter.execution.parallel.enabled";

    /* renamed from: c, reason: collision with root package name */
    public static final String f93630c = "junit.jupiter.execution.parallel.mode.default";

    /* renamed from: d, reason: collision with root package name */
    public static final String f93631d = "junit.jupiter.execution.parallel.mode.classes.default";

    /* renamed from: e, reason: collision with root package name */
    public static final String f93632e = "junit.jupiter.extensions.autodetection.enabled";

    /* renamed from: f, reason: collision with root package name */
    public static final String f93633f = "junit.jupiter.testinstance.lifecycle.default";

    /* renamed from: g, reason: collision with root package name */
    public static final String f93634g = "junit.jupiter.displayname.generator.default";

    /* renamed from: h, reason: collision with root package name */
    public static final String f93635h = "junit.jupiter.testmethod.order.default";

    /* renamed from: i, reason: collision with root package name */
    public static final String f93636i = "junit.jupiter.testclass.order.default";

    ExecutionMode a();

    <T> Optional<T> b(String key, Function<String, T> transformer);

    z1 c();

    boolean d();

    Optional<f1> e();

    Predicate<p80.k> f();

    CleanupMode g();

    Optional<String> h(String key);

    Optional<l2> i();

    ExecutionMode j();

    boolean k();

    Supplier<s80.b> l();

    TestInstance.Lifecycle m();
}
