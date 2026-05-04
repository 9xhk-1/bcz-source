package v80;

import ba0.c2;
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
import s80.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.4", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class o implements e0 {

    /* renamed from: k, reason: collision with root package name */
    public static final s<ExecutionMode> f93646k = new s<>(ExecutionMode.class, "parallel execution mode");

    /* renamed from: l, reason: collision with root package name */
    public static final s<TestInstance.Lifecycle> f93647l = new s<>(TestInstance.Lifecycle.class, "test instance lifecycle mode");

    /* renamed from: m, reason: collision with root package name */
    public static final d0<z1> f93648m = new d0<>(z1.class, "display name generator");

    /* renamed from: n, reason: collision with root package name */
    public static final d0<l2> f93649n = new d0<>(l2.class, "method orderer");

    /* renamed from: o, reason: collision with root package name */
    public static final d0<f1> f93650o = new d0<>(f1.class, "class orderer");

    /* renamed from: p, reason: collision with root package name */
    public static final s<CleanupMode> f93651p = new s<>(CleanupMode.class, "cleanup mode");

    /* renamed from: q, reason: collision with root package name */
    public static final d0<s80.b> f93652q = new d0<>(s80.b.class, "temp dir factory");

    /* renamed from: j, reason: collision with root package name */
    public final ca0.j f93653j;

    public o(ca0.j configurationParameters) {
        this.f93653j = (ca0.j) c2.r(configurationParameters, "ConfigurationParameters must not be null");
    }

    public static /* synthetic */ s80.b n(Supplier supplier) {
        return (s80.b) ((Optional) supplier.get()).orElse(b.a.f88135a);
    }

    @Override // v80.e0
    public ExecutionMode a() {
        return f93646k.c(this.f93653j, "junit.jupiter.execution.parallel.mode.default", ExecutionMode.SAME_THREAD);
    }

    @Override // v80.e0
    public <T> Optional<T> b(String key, Function<String, T> transformer) {
        return this.f93653j.b(key, transformer);
    }

    @Override // v80.e0
    public z1 c() {
        return f93648m.i(this.f93653j, "junit.jupiter.displayname.generator.default").orElseGet(new Supplier() { // from class: v80.m
            @Override // java.util.function.Supplier
            public final Object get() {
                z1 c11;
                c11 = z1.c(z1.d.class);
                return c11;
            }
        });
    }

    @Override // v80.e0
    public boolean d() {
        return this.f93653j.getBoolean("junit.jupiter.execution.parallel.enabled").orElse(Boolean.FALSE).booleanValue();
    }

    @Override // v80.e0
    public Optional<f1> e() {
        return f93650o.i(this.f93653j, "junit.jupiter.testclass.order.default");
    }

    @Override // v80.e0
    public Predicate<p80.k> f() {
        return ba0.w.k(this.f93653j.get("junit.jupiter.conditions.deactivate").orElse(null));
    }

    @Override // v80.e0
    public CleanupMode g() {
        return f93651p.c(this.f93653j, s80.a.f88134k0, CleanupMode.ALWAYS);
    }

    @Override // v80.e0
    public Optional<String> h(String key) {
        return this.f93653j.get(key);
    }

    @Override // v80.e0
    public Optional<l2> i() {
        return f93649n.i(this.f93653j, "junit.jupiter.testmethod.order.default");
    }

    @Override // v80.e0
    public ExecutionMode j() {
        return f93646k.c(this.f93653j, "junit.jupiter.execution.parallel.mode.classes.default", a());
    }

    @Override // v80.e0
    public boolean k() {
        return this.f93653j.getBoolean("junit.jupiter.extensions.autodetection.enabled").orElse(Boolean.FALSE).booleanValue();
    }

    @Override // v80.e0
    public Supplier<s80.b> l() {
        final Supplier<Optional<s80.b>> m11 = f93652q.m(this.f93653j, "junit.jupiter.tempdir.factory.default");
        return new Supplier() { // from class: v80.n
            @Override // java.util.function.Supplier
            public final Object get() {
                return o.n(m11);
            }
        };
    }

    @Override // v80.e0
    public TestInstance.Lifecycle m() {
        return f93647l.c(this.f93653j, "junit.jupiter.testinstance.lifecycle.default", TestInstance.Lifecycle.PER_METHOD);
    }
}
