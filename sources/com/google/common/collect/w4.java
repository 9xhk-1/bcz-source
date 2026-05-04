package com.google.common.collect;

import com.google.common.collect.u6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class w4<K, V> extends c5 implements Map<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a extends u6.s<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.u6.s
        public Map<K, V> g() {
            return w4.this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends u6.b0<K, V> {
        public b() {
            super(w4.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends u6.q0<K, V> {
        public c() {
            super(w4.this);
        }
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@CheckForNull Object key) {
        return delegate().containsKey(key);
    }

    public boolean containsValue(@CheckForNull Object value) {
        return delegate().containsValue(value);
    }

    @Override // com.google.common.collect.c5
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@CheckForNull Object object) {
        return object == this || delegate().equals(object);
    }

    @CheckForNull
    public V get(@CheckForNull Object key) {
        return delegate().get(key);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CheckForNull
    @uo.a
    public V put(@t7 K key, @t7 V value) {
        return delegate().put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object key) {
        return delegate().remove(key);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        l6.g(entrySet().iterator());
    }

    public boolean standardContainsKey(@CheckForNull Object key) {
        return u6.q(this, key);
    }

    public boolean standardContainsValue(@CheckForNull Object value) {
        return u6.r(this, value);
    }

    public boolean standardEquals(@CheckForNull Object object) {
        return u6.w(this, object);
    }

    public int standardHashCode() {
        return q8.k(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        u6.j0(this, map);
    }

    @CheckForNull
    public V standardRemove(@CheckForNull Object key) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (ho.d0.a(next.getKey(), key)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return u6.y0(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
