package p80;

import ba0.c2;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.ExecutionMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80295b = b(new Object());

        /* renamed from: a, reason: collision with root package name */
        public final List<Object> f80296a;

        public a(List<Object> parts) {
            this.f80296a = parts;
        }

        public static a b(Object... parts) {
            c2.p(parts, "parts array must not be null or empty");
            c2.i(parts, "individual parts must not be null");
            return new a(new ArrayList(Arrays.asList(parts)));
        }

        @API(since = "5.10", status = API.Status.STABLE)
        public a a(Object... parts) {
            c2.p(parts, "parts array must not be null or empty");
            c2.i(parts, "individual parts must not be null");
            ArrayList arrayList = new ArrayList(this.f80296a.size() + parts.length);
            arrayList.addAll(this.f80296a);
            Collections.addAll(arrayList, parts);
            return new a(arrayList);
        }

        public boolean equals(Object o11) {
            if (this == o11) {
                return true;
            }
            if (o11 == null || getClass() != o11.getClass()) {
                return false;
            }
            return this.f80296a.equals(((a) o11).f80296a);
        }

        public int hashCode() {
            return this.f80296a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @API(since = "5.1", status = API.Status.STABLE)
        public interface a {
            void close() throws Throwable;
        }

        @API(since = "5.5", status = API.Status.STABLE)
        default <V> V b(Object obj, Class<V> cls, V v11) {
            V v12 = (V) e(obj, cls);
            return v12 != null ? v12 : v11;
        }

        <K, V> V c(K key, Function<K, V> defaultCreator, Class<V> requiredType);

        <K, V> Object d(K key, Function<K, V> defaultCreator);

        <V> V e(Object key, Class<V> requiredType);

        <V> V f(Object key, Class<V> requiredType);

        @API(since = "5.1", status = API.Status.STABLE)
        default <V> V g(Class<V> cls) {
            return (V) c(cls, new Function() { // from class: p80.o
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object n11;
                    n11 = z90.i.n((Class) obj, new Object[0]);
                    return n11;
                }
            }, cls);
        }

        Object get(Object key);

        void put(Object key, Object value);

        Object remove(Object key);
    }

    default void C(String key, String value) {
        S(Collections.singletonMap(key, value));
    }

    Optional<Object> E();

    @API(since = "5.11", status = API.Status.STABLE)
    j H();

    @API(since = "5.7", status = API.Status.STABLE)
    Optional<f0> I();

    Optional<Throwable> L();

    void S(Map<String, String> map);

    b U(a namespace);

    @API(since = "5.1", status = API.Status.STABLE)
    Optional<TestInstance.Lifecycle> V();

    default Class<?> Z() {
        return (Class) c2.r(c().orElse(null), "Illegal state: required test class is not present in the current ExtensionContext");
    }

    String a();

    default Method a0() {
        return (Method) c2.r(k().orElse(null), "Illegal state: required test method is not present in the current ExtensionContext");
    }

    Optional<Class<?>> c();

    @API(since = "5.10", status = API.Status.STABLE)
    <T> Optional<T> c0(String key, Function<String, T> transformer);

    Optional<AnnotatedElement> e();

    Set<String> f();

    Optional<n> getParent();

    n getRoot();

    String getUniqueId();

    @API(since = "5.1", status = API.Status.STABLE)
    Optional<String> i(String key);

    @API(since = "5.8.1", status = API.Status.STABLE)
    ExecutionMode j();

    Optional<Method> k();

    @API(since = "5.3", status = API.Status.STABLE)
    default void q(String value) {
        C("value", value);
    }

    @API(since = "5.7", status = API.Status.STABLE)
    default f0 r() {
        return (f0) c2.r(I().orElse(null), "Illegal state: required test instances are not present in the current ExtensionContext");
    }

    default Object w() {
        return c2.r(E().orElse(null), "Illegal state: required test instance is not present in the current ExtensionContext");
    }
}
