package a90;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d2 {

    /* renamed from: e, reason: collision with root package name */
    public static final y90.e f2366e = y90.g.c(d2.class);

    /* renamed from: a, reason: collision with root package name */
    public final m2 f2367a = new m2();

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Optional<k2>> f2368b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<Optional<Timeout.ThreadMode>> f2369c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public final p80.n f2370d;

    public d2(p80.n extensionContext) {
        this.f2370d = extensionContext;
    }

    public static /* synthetic */ Timeout.ThreadMode a(final String str) {
        try {
            Timeout.ThreadMode valueOf = Timeout.ThreadMode.valueOf(str.toUpperCase());
            if (valueOf != Timeout.ThreadMode.INFERRED) {
                return valueOf;
            }
            f2366e.f(new Supplier() { // from class: a90.a2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Invalid timeout thread mode '%s', only %s and %s can be used as configuration parameter for %s.", str, Timeout.ThreadMode.SAME_THREAD, Timeout.ThreadMode.SEPARATE_THREAD, "junit.jupiter.execution.timeout.thread.mode.default");
                    return format;
                }
            });
            return null;
        } catch (Exception e11) {
            f2366e.b(e11, new Supplier() { // from class: a90.b2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Invalid timeout thread mode '%s' set via the '%s' configuration parameter.", str, "junit.jupiter.execution.timeout.thread.mode.default");
                    return format;
                }
            });
            return null;
        }
    }

    public static /* synthetic */ k2 d(d2 d2Var, final String str, final String str2) {
        d2Var.getClass();
        try {
            return d2Var.f2367a.a(str2);
        } catch (Exception e11) {
            f2366e.b(e11, new Supplier() { // from class: a90.w1
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Ignored invalid timeout '%s' set via the '%s' configuration parameter.", str2, str);
                    return format;
                }
            });
            return null;
        }
    }

    public Optional<k2> j() {
        return u("junit.jupiter.execution.timeout.afterall.method.default", new x1(this));
    }

    public Optional<k2> k() {
        return u("junit.jupiter.execution.timeout.aftereach.method.default", new x1(this));
    }

    public Optional<k2> l() {
        return u("junit.jupiter.execution.timeout.beforeall.method.default", new x1(this));
    }

    public Optional<k2> m() {
        return u("junit.jupiter.execution.timeout.beforeeach.method.default", new x1(this));
    }

    public final Optional<k2> n() {
        return u("junit.jupiter.execution.timeout.lifecycle.method.default", new y1(this));
    }

    public Optional<k2> o() {
        return u("junit.jupiter.execution.timeout.testfactory.method.default", new u1(this));
    }

    public Optional<k2> p() {
        return u("junit.jupiter.execution.timeout.test.method.default", new u1(this));
    }

    public Optional<k2> q() {
        return u("junit.jupiter.execution.timeout.testtemplate.method.default", new u1(this));
    }

    public final Optional<k2> r() {
        return u("junit.jupiter.execution.timeout.testable.method.default", new y1(this));
    }

    public final Optional<k2> s() {
        return v("junit.jupiter.execution.timeout.default");
    }

    public Optional<Timeout.ThreadMode> t() {
        if (this.f2369c.get() != null) {
            return this.f2369c.get();
        }
        Optional<Timeout.ThreadMode> w11 = w();
        this.f2369c.set(w11);
        return w11;
    }

    public final Optional<k2> u(String propertyName, Supplier<Optional<k2>> defaultSupplier) {
        Optional<k2> v11 = v(propertyName);
        return v11.isPresent() ? v11 : defaultSupplier.get();
    }

    public final Optional<k2> v(String propertyName) {
        return this.f2368b.computeIfAbsent(propertyName, new Function() { // from class: a90.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional map;
                map = r0.f2370d.i(r2).map(new Function() { // from class: a90.v1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return d2.d(d2.this, r2, (String) obj2);
                    }
                });
                return map;
            }
        });
    }

    public final Optional<Timeout.ThreadMode> w() {
        return this.f2370d.i("junit.jupiter.execution.timeout.thread.mode.default").map(new Function() { // from class: a90.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d2.a((String) obj);
            }
        });
    }
}
