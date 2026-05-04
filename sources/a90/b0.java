package a90;

import a90.b0;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.5", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class b0 implements o, n {

    /* renamed from: d, reason: collision with root package name */
    public static final y90.e f2321d = y90.g.c(b0.class);

    /* renamed from: e, reason: collision with root package name */
    public static final List<p80.m> f2322e = Collections.unmodifiableList(Arrays.asList(new m(), new j(), new c3(), new k0(), new r1(), new t1()));

    /* renamed from: a, reason: collision with root package name */
    public final Set<Class<? extends p80.m>> f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, d> f2325c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f2326a;

        /* renamed from: b, reason: collision with root package name */
        public final Function<Object, ? extends p80.m> f2327b;

        /* renamed from: c, reason: collision with root package name */
        public Optional<p80.m> f2328c = Optional.empty();

        public c(Class<?> testClass, Function<Object, ? extends p80.m> initializer) {
            this.f2326a = testClass;
            this.f2327b = initializer;
        }

        @Override // a90.b0.b
        public Optional<p80.m> c() {
            return this.f2328c;
        }

        public c d() {
            ba0.c2.e(!this.f2328c.isPresent(), "Extension already initialized");
            return new c(this.f2326a, this.f2327b);
        }

        public Class<?> e() {
            return this.f2326a;
        }

        public void f(Object testInstance) {
            ba0.c2.e(!this.f2328c.isPresent(), "Extension already initialized");
            this.f2328c = Optional.of(this.f2327b.apply(testInstance));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final List<c> f2329a;

        public d() {
            this.f2329a = new ArrayList();
        }

        public c b(c entry) {
            this.f2329a.add(entry);
            return entry;
        }

        public void c(final Object testInstance) {
            this.f2329a.forEach(new Consumer() { // from class: a90.d0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((b0.c) obj).f(testInstance);
                }
            });
        }
    }

    public b0() {
        this(Collections.EMPTY_SET, Collections.EMPTY_LIST);
    }

    public static /* synthetic */ d h(Class cls) {
        return new d();
    }

    public static /* synthetic */ void k(final b0 b0Var, b bVar) {
        if (bVar instanceof c) {
            b0Var.getClass();
            final c cVar = (c) bVar;
            bVar = (b) cVar.c().map(new Function() { // from class: a90.u
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return b0.b.b((p80.m) obj);
                }
            }).orElseGet(new Supplier() { // from class: a90.v
                @Override // java.util.function.Supplier
                public final Object get() {
                    return b0.o(b0.this, cVar);
                }
            });
        }
        b0Var.f2324b.add(bVar);
    }

    public static /* synthetic */ String m(b0 b0Var, Field field) {
        b0Var.getClass();
        return String.format("Registering local extension (late-init) for [%s]%s", field.getType().getName(), b0Var.p(field));
    }

    public static /* synthetic */ b o(b0 b0Var, c cVar) {
        b0Var.getClass();
        return b0Var.s(cVar.e()).b(cVar.d());
    }

    public static b0 q(b0 parentRegistry, Stream<Class<? extends p80.m>> extensionTypes) {
        ba0.c2.r(parentRegistry, "parentRegistry must not be null");
        final b0 b0Var = new b0(parentRegistry);
        extensionTypes.forEach(new Consumer() { // from class: a90.z
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b0.this.b((Class) obj);
            }
        });
        return b0Var;
    }

    public static b0 r(v80.e0 configuration) {
        final b0 b0Var = new b0();
        f2322e.forEach(new Consumer() { // from class: a90.r
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b0.this.w((p80.m) obj);
            }
        });
        b0Var.w(new d1(configuration));
        if (configuration.k()) {
            v(b0Var);
        }
        return b0Var;
    }

    public static void v(final b0 extensionRegistry) {
        ServiceLoader load = ServiceLoader.load(p80.m.class, ba0.m.b());
        Objects.requireNonNull(extensionRegistry);
        load.forEach(new Consumer() { // from class: a90.y
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b0.this.u((p80.m) obj);
            }
        });
    }

    @Override // a90.o
    public <E extends p80.m> Stream<E> a(final Class<E> extensionType) {
        Stream<R> map = this.f2324b.stream().map(new Function() { // from class: a90.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                p80.m orElse;
                orElse = ((b0.b) obj).c().orElse(null);
                return orElse;
            }
        });
        Objects.requireNonNull(extensionType);
        return map.filter(new Predicate() { // from class: a90.s
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return extensionType.isInstance((p80.m) obj);
            }
        }).map(new Function() { // from class: a90.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (p80.m) extensionType.cast((p80.m) obj);
            }
        });
    }

    @Override // a90.n
    public void b(Class<? extends p80.m> extensionType) {
        if (t(extensionType)) {
            return;
        }
        z((p80.m) ReflectionUtils.x1(extensionType, new Object[0]));
    }

    @Override // a90.n
    public void d(Class<?> testClass, Object testInstance) {
        ba0.c2.r(testClass, "testClass must not be null");
        ba0.c2.r(testInstance, "testInstance must not be null");
        d remove = this.f2325c.remove(testClass);
        if (remove != null) {
            remove.c(testInstance);
        }
    }

    @Override // a90.n
    public void e(p80.m extension, Object source) {
        ba0.c2.r(source, "source must not be null");
        y("local", extension, source);
    }

    @Override // a90.n
    public void f(p80.m extension, Object source) {
        y("synthetic", extension, source);
    }

    @Override // a90.n
    public void g(Class<?> testClass, final Field source, Function<Object, ? extends p80.m> initializer) {
        ba0.c2.r(testClass, "testClass must not be null");
        ba0.c2.r(source, "source must not be null");
        ba0.c2.r(initializer, "initializer must not be null");
        f2321d.l(new Supplier() { // from class: a90.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                return b0.m(b0.this, source);
            }
        });
        this.f2324b.add(s(testClass).b(new c(testClass, initializer)));
    }

    public final String p(Object source) {
        if (source == null) {
            return "";
        }
        if (source instanceof Member) {
            Member member = (Member) source;
            source = String.format("%s %s.%s", member instanceof Method ? "method" : "field", member.getDeclaringClass().getName(), member.getName());
        }
        return " from source [" + source + "]";
    }

    public final d s(Class<?> testClass) {
        return this.f2325c.computeIfAbsent(testClass, new Function() { // from class: a90.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b0.h((Class) obj);
            }
        });
    }

    public final boolean t(Class<? extends p80.m> extensionType) {
        return this.f2323a.contains(extensionType);
    }

    public final void u(p80.m extension) {
        x("auto-detected", extension);
    }

    public final void w(p80.m extension) {
        x("default", extension);
    }

    public final void x(String category, p80.m extension) {
        y(category, extension, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(final String category, final p80.m extension, final Object source) {
        ba0.c2.k(category, "category must not be null or blank");
        ba0.c2.r(extension, "extension must not be null");
        f2321d.l(new Supplier() { // from class: a90.q
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Registering %s extension [%s]%s", category, extension, b0.this.p(source));
                return format;
            }
        });
        this.f2324b.add(b.b(extension));
        this.f2323a.add(extension.getClass());
    }

    public final void z(p80.m extension) {
        x("local", extension);
    }

    public b0(b0 parent) {
        this(parent.f2323a, parent.f2324b);
    }

    public b0(Set<Class<? extends p80.m>> registeredExtensionTypes, List<b> registeredExtensions) {
        this.f2323a = new LinkedHashSet(registeredExtensionTypes);
        this.f2324b = new ArrayList(registeredExtensions.size());
        this.f2325c = new LinkedHashMap();
        registeredExtensions.forEach(new Consumer() { // from class: a90.w
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b0.k(b0.this, (b0.b) obj);
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        static b b(p80.m extension) {
            final Optional of2 = Optional.of(extension);
            return new b() { // from class: a90.c0
                @Override // a90.b0.b
                public final Optional c() {
                    return b0.b.a(of2);
                }
            };
        }

        Optional<p80.m> c();

        static /* synthetic */ Optional a(Optional optional) {
            return optional;
        }
    }
}
