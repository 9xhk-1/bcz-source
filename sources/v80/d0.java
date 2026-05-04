package v80;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.jupiter.api.t1;
import org.junit.platform.commons.util.ReflectionUtils;
import x90.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d0<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final y90.e f93624c = y90.g.c(d0.class);

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f93625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93626b;

    public d0(Class<T> clazz, String name) {
        this.f93625a = clazz;
        this.f93626b = name;
    }

    public static /* synthetic */ boolean b(String str) {
        return !str.isEmpty();
    }

    public static /* synthetic */ Optional e(final d0 d0Var, x90.b bVar, final String str, final String str2) {
        d0Var.getClass();
        x90.b e11 = bVar.e(new b.d() { // from class: v80.z
            @Override // x90.b.d
            public final Object apply(Object obj) {
                Object x12;
                x12 = ReflectionUtils.x1((Class) obj, new Object[0]);
                return x12;
            }
        });
        final Class<T> cls = d0Var.f93625a;
        Objects.requireNonNull(cls);
        return e11.e(new b.d() { // from class: v80.a0
            @Override // x90.b.d
            public final Object apply(Object obj) {
                return cls.cast(obj);
            }
        }).l(new Consumer() { // from class: v80.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d0.this.k(str, str2);
            }
        }).k(new Consumer() { // from class: v80.c0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d0.this.j(str, str2, (Exception) obj);
            }
        }).q();
    }

    public Optional<T> i(ca0.j configurationParameters, String key) {
        return m(configurationParameters, key).get();
    }

    public final void j(final String className, final String key, Exception cause) {
        f93624c.b(cause, new Supplier() { // from class: v80.x
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Failed to load default %s class '%s' set via the '%s' configuration parameter. Falling back to default behavior.", d0.this.f93626b, className, key);
                return format;
            }
        });
    }

    public final void k(final String className, final String key) {
        f93624c.j(new Supplier() { // from class: v80.t
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Using default %s '%s' set via the '%s' configuration parameter.", d0.this.f93626b, className, key);
                return format;
            }
        });
    }

    public final Supplier<Optional<T>> l(final String className, final String key) {
        final x90.b<Class<?>> X1 = ReflectionUtils.X1(className);
        return new Supplier() { // from class: v80.y
            @Override // java.util.function.Supplier
            public final Object get() {
                return d0.e(d0.this, X1, className, key);
            }
        };
    }

    public Supplier<Optional<T>> m(ca0.j configurationParameters, final String key) {
        return (Supplier) configurationParameters.get(key).map(new t1()).filter(new Predicate() { // from class: v80.u
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return d0.b((String) obj);
            }
        }).map(new Function() { // from class: v80.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Supplier l11;
                l11 = d0.this.l((String) obj, key);
                return l11;
            }
        }).orElse(new Supplier() { // from class: v80.w
            @Override // java.util.function.Supplier
            public final Object get() {
                return Optional.empty();
            }
        });
    }
}
