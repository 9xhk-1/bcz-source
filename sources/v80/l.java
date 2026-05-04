package v80;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
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
public class l implements e0 {

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f93643j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    public final e0 f93644k;

    public l(e0 delegate) {
        this.f93644k = delegate;
    }

    @Override // v80.e0
    public ExecutionMode a() {
        return (ExecutionMode) this.f93643j.computeIfAbsent("junit.jupiter.execution.parallel.mode.default", new Function() { // from class: v80.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object a11;
                a11 = l.this.f93644k.a();
                return a11;
            }
        });
    }

    @Override // v80.e0
    public <T> Optional<T> b(String key, Function<String, T> transformer) {
        return this.f93644k.b(key, transformer);
    }

    @Override // v80.e0
    public z1 c() {
        return (z1) this.f93643j.computeIfAbsent("junit.jupiter.displayname.generator.default", new Function() { // from class: v80.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object c11;
                c11 = l.this.f93644k.c();
                return c11;
            }
        });
    }

    @Override // v80.e0
    public boolean d() {
        return ((Boolean) this.f93643j.computeIfAbsent("junit.jupiter.execution.parallel.enabled", new Function() { // from class: v80.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object valueOf;
                valueOf = Boolean.valueOf(l.this.f93644k.d());
                return valueOf;
            }
        })).booleanValue();
    }

    @Override // v80.e0
    public Optional<f1> e() {
        return (Optional) this.f93643j.computeIfAbsent("junit.jupiter.testclass.order.default", new Function() { // from class: v80.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object e11;
                e11 = l.this.f93644k.e();
                return e11;
            }
        });
    }

    @Override // v80.e0
    public Predicate<p80.k> f() {
        return (Predicate) this.f93643j.computeIfAbsent("junit.jupiter.conditions.deactivate", new Function() { // from class: v80.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object f11;
                f11 = l.this.f93644k.f();
                return f11;
            }
        });
    }

    @Override // v80.e0
    public CleanupMode g() {
        return (CleanupMode) this.f93643j.computeIfAbsent(s80.a.f88134k0, new Function() { // from class: v80.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object g11;
                g11 = l.this.f93644k.g();
                return g11;
            }
        });
    }

    @Override // v80.e0
    public Optional<String> h(String key) {
        return this.f93644k.h(key);
    }

    @Override // v80.e0
    public Optional<l2> i() {
        return (Optional) this.f93643j.computeIfAbsent("junit.jupiter.testmethod.order.default", new Function() { // from class: v80.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object i11;
                i11 = l.this.f93644k.i();
                return i11;
            }
        });
    }

    @Override // v80.e0
    public ExecutionMode j() {
        return (ExecutionMode) this.f93643j.computeIfAbsent("junit.jupiter.execution.parallel.mode.classes.default", new Function() { // from class: v80.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object j11;
                j11 = l.this.f93644k.j();
                return j11;
            }
        });
    }

    @Override // v80.e0
    public boolean k() {
        return ((Boolean) this.f93643j.computeIfAbsent("junit.jupiter.extensions.autodetection.enabled", new Function() { // from class: v80.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object valueOf;
                valueOf = Boolean.valueOf(l.this.f93644k.k());
                return valueOf;
            }
        })).booleanValue();
    }

    @Override // v80.e0
    public Supplier<s80.b> l() {
        return (Supplier) this.f93643j.computeIfAbsent("junit.jupiter.tempdir.factory.default", new Function() { // from class: v80.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object l11;
                l11 = l.this.f93644k.l();
                return l11;
            }
        });
    }

    @Override // v80.e0
    public TestInstance.Lifecycle m() {
        return (TestInstance.Lifecycle) this.f93643j.computeIfAbsent("junit.jupiter.testinstance.lifecycle.default", new Function() { // from class: v80.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object m11;
                m11 = l.this.f93644k.m();
                return m11;
            }
        });
    }
}
