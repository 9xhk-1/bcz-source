package ha0;

import ba0.c2;
import da0.j1;
import da0.k0;
import da0.k1;
import da0.p1;
import da0.r1;
import da0.t1;
import da0.u1;
import da0.v1;
import da0.y0;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public interface a {
        <T extends TestDescriptor> Optional<T> a(Supplier<ca0.l> parentSelectorSupplier, Function<TestDescriptor, Optional<T>> creator);

        Optional<TestDescriptor> b(ca0.l selector);

        <T extends TestDescriptor> Optional<T> c(Function<TestDescriptor, Optional<T>> creator);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final TestDescriptor f59133a;

        /* renamed from: b, reason: collision with root package name */
        public final Supplier<Set<? extends ca0.l>> f59134b;

        /* renamed from: c, reason: collision with root package name */
        public final a f59135c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a {
            EXACT,
            PARTIAL
        }

        public b(TestDescriptor testDescriptor, Supplier<Set<? extends ca0.l>> childSelectorsSupplier, a type) {
            this.f59133a = (TestDescriptor) c2.r(testDescriptor, "testDescriptor must not be null");
            this.f59134b = (Supplier) c2.r(childSelectorsSupplier, "childSelectorsSupplier must not be null");
            this.f59135c = type;
        }

        public static b a(TestDescriptor testDescriptor) {
            return b(testDescriptor, new v());
        }

        public static b b(TestDescriptor testDescriptor, Supplier<Set<? extends ca0.l>> childSelectorsSupplier) {
            return new b(testDescriptor, childSelectorsSupplier, a.EXACT);
        }

        public static b f(TestDescriptor testDescriptor) {
            return g(testDescriptor, new v());
        }

        public static b g(TestDescriptor testDescriptor, Supplier<Set<? extends ca0.l>> childSelectorsSupplier) {
            return new b(testDescriptor, childSelectorsSupplier, a.PARTIAL);
        }

        public Set<? extends ca0.l> c() {
            return this.f59134b.get();
        }

        public TestDescriptor d() {
            return this.f59133a;
        }

        public boolean e() {
            return this.f59135c == a.EXACT;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public static class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f59139c;

        /* renamed from: a, reason: collision with root package name */
        public final Set<b> f59140a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<? extends ca0.l> f59141b;

        static {
            Set set = Collections.EMPTY_SET;
            f59139c = new c(set, set);
        }

        public c(Set<b> matches, Set<? extends ca0.l> selectors) {
            this.f59140a = matches;
            this.f59141b = selectors;
        }

        public static c d(b match) {
            return new c(Collections.singleton(match), Collections.EMPTY_SET);
        }

        public static c e(Set<b> matches) {
            c2.g(matches, "matches must not contain null elements");
            c2.m(matches, "matches must not be empty");
            return new c(matches, Collections.EMPTY_SET);
        }

        public static c f(Set<? extends ca0.l> selectors) {
            c2.g(selectors, "selectors must not contain null elements");
            c2.m(selectors, "selectors must not be empty");
            return new c(Collections.EMPTY_SET, selectors);
        }

        public static c g() {
            return f59139c;
        }

        public Set<b> a() {
            return this.f59140a;
        }

        public Set<? extends ca0.l> b() {
            return this.f59141b;
        }

        public boolean c() {
            return this != f59139c;
        }
    }

    default c a(p1 selector, a context) {
        return n(selector, context);
    }

    default c b(v1 selector, a context) {
        return n(selector, context);
    }

    default c c(da0.i selector, a context) {
        return n(selector, context);
    }

    default c d(da0.h selector, a context) {
        return n(selector, context);
    }

    default c e(da0.e selector, a context) {
        return n(selector, context);
    }

    @API(since = "1.9", status = API.Status.EXPERIMENTAL)
    default c f(y0 selector, a context) {
        return n(selector, context);
    }

    default c g(t1 selector, a context) {
        return n(selector, context);
    }

    default c h(k0 selector, a context) {
        return n(selector, context);
    }

    default c i(j1 selector, a context) {
        return n(selector, context);
    }

    default c j(k1 selector, a context) {
        return n(selector, context);
    }

    default c k(r1 selector, a context) {
        return n(selector, context);
    }

    default c l(u1 selector, a context) {
        return n(selector, context);
    }

    default c m(da0.j selector, a context) {
        return n(selector, context);
    }

    default c n(ca0.l selector, a context) {
        return c.g();
    }
}
