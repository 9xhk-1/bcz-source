package tv;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n<V> implements Map<Class<?>, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, V> f90968a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<V> implements h<Map<Class<?>, V>> {

        /* renamed from: a, reason: collision with root package name */
        public h<Map<String, V>> f90969a;

        public a(h<Map<String, V>> delegate) {
            this.f90969a = delegate;
        }

        public static <V> a<V> b(h<Map<String, V>> delegate) {
            return new a<>(delegate);
        }

        @Override // javax.inject.Provider, vz.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Class<?>, V> get() {
            return n.b(this.f90969a.get());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<V> implements h<Map<Class<?>, t<V>>> {

        /* renamed from: a, reason: collision with root package name */
        public h<Map<String, t<V>>> f90970a;

        public b(h<Map<String, t<V>>> delegate) {
            this.f90970a = delegate;
        }

        public static <V> b<V> b(h<Map<String, t<V>>> delegate) {
            return new b<>(delegate);
        }

        @Override // javax.inject.Provider, vz.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Class<?>, t<V>> get() {
            return n.b(this.f90970a.get());
        }
    }

    public n(Map<String, V> delegate) {
        this.f90968a = delegate;
    }

    public static <V> Map<Class<?>, V> b(Map<String, V> delegate) {
        return new n(delegate);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (key instanceof Class) {
            return this.f90968a.containsKey(((Class) key).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.f90968a.containsValue(value);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public V put(Class<?> key, V value) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public V get(Object key) {
        if (key instanceof Class) {
            return this.f90968a.get(((Class) key).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f90968a.isEmpty();
    }

    @Override // java.util.Map
    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public V remove(Object key) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f90968a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f90968a.values();
    }
}
