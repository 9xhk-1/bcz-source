package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class a<K, V> extends w4<K, V> implements u<K, V>, Serializable {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;
    private transient Map<K, V> delegate;

    @CheckForNull
    @vo.b
    private transient Set<Map.Entry<K, V>> entrySet;

    @RetainedWith
    transient a<V, K> inverse;

    @CheckForNull
    @vo.b
    private transient Set<K> keySet;

    @CheckForNull
    @vo.b
    private transient Set<V> valueSet;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.collect.a$a, reason: collision with other inner class name */
    public class C0390a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Map.Entry<K, V> f33227a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f33228b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f33229c;

        public C0390a(final a this$0, final Iterator val$iterator) {
            this.f33228b = val$iterator;
            this.f33229c = this$0;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f33228b.next();
            this.f33227a = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33228b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f33227a;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            V value = entry.getValue();
            this.f33228b.remove();
            this.f33229c.y(value);
            this.f33227a = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends x4<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, V> f33230a;

        public b(Map.Entry<K, V> delegate) {
            this.f33230a = delegate;
        }

        @Override // com.google.common.collect.x4, java.util.Map.Entry
        public V setValue(V value) {
            a.this.checkValue(value);
            Preconditions.checkState(a.this.entrySet().contains(this), "entry no longer in map");
            if (ho.d0.a(value, getValue())) {
                return value;
            }
            Preconditions.checkArgument(!a.this.containsValue(value), "value already present: %s", value);
            V value2 = this.f33230a.setValue(value);
            Preconditions.checkState(ho.d0.a(value, a.this.get(getKey())), "entry no longer in map");
            a.this.z(getKey(), true, value2, value);
            return value2;
        }

        @Override // com.google.common.collect.x4, com.google.common.collect.c5
        /* renamed from: w */
        public Map.Entry<K, V> delegate() {
            return this.f33230a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends e5<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f33232a;

        public c() {
            this.f33232a = a.this.delegate.entrySet();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return u6.p(delegate(), o11);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c11) {
            return standardContainsAll(c11);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return a.this.entrySetIterator();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object object) {
            if (!this.f33232a.contains(object) || !(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            ((a) a.this.inverse).delegate.remove(entry.getValue());
            this.f33232a.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            return standardRemoveAll(c11);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c11) {
            return standardRetainAll(c11);
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ c(a aVar, C0390a c0390a) {
            this();
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<Map.Entry<K, V>> delegate() {
            return this.f33232a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K, V> extends a<K, V> {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        public d(Map<K, V> backward, a<V, K> forward) {
            super(backward, forward, null);
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            setInverse((a) readObject);
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(inverse());
        }

        @Override // com.google.common.collect.a
        @t7
        public K checkKey(@t7 K key) {
            return this.inverse.checkValue(key);
        }

        @Override // com.google.common.collect.a
        @t7
        public V checkValue(@t7 V value) {
            return this.inverse.checkKey(value);
        }

        @Override // com.google.common.collect.a, com.google.common.collect.w4, com.google.common.collect.c5
        public /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        @go.d
        @go.c
        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends e5<K> {
        public e() {
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return u6.S(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object key) {
            if (!contains(key)) {
                return false;
            }
            a.this.x(key);
            return true;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> keysToRemove) {
            return standardRemoveAll(keysToRemove);
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> keysToRetain) {
            return standardRetainAll(keysToRetain);
        }

        public /* synthetic */ e(a aVar, C0390a c0390a) {
            this();
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<K> delegate() {
            return a.this.delegate.keySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends e5<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Set<V> f33235a;

        public f() {
            this.f33235a = a.this.inverse.keySet();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return u6.R0(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.c5
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        public /* synthetic */ f(a aVar, C0390a c0390a) {
            this();
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<V> delegate() {
            return this.f33235a;
        }
    }

    public /* synthetic */ a(Map map, a aVar, C0390a c0390a) {
        this(map, aVar);
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        return this.inverse.containsKey(value);
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.entrySet = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new C0390a(this, this.delegate.entrySet().iterator());
    }

    @CheckForNull
    @uo.a
    public V forcePut(@t7 K key, @t7 V value) {
        return w(key, value, true);
    }

    public u<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.keySet = eVar;
        return eVar;
    }

    public a<V, K> makeInverse(Map<V, K> backward) {
        return new d(backward, this);
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public V put(@t7 K key, @t7 V value) {
        return w(key, value, false);
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.w4, java.util.Map
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object key) {
        if (containsKey(key)) {
            return x(key);
        }
        return null;
    }

    public void setDelegates(Map<K, V> forward, Map<V, K> backward) {
        Preconditions.checkState(this.delegate == null);
        Preconditions.checkState(this.inverse == null);
        Preconditions.checkArgument(forward.isEmpty());
        Preconditions.checkArgument(backward.isEmpty());
        Preconditions.checkArgument(forward != backward);
        this.delegate = forward;
        this.inverse = makeInverse(backward);
    }

    public void setInverse(a<V, K> inverse) {
        this.inverse = inverse;
    }

    @CheckForNull
    public final V w(@t7 K key, @t7 V value, boolean force) {
        checkKey(key);
        checkValue(value);
        boolean containsKey = containsKey(key);
        if (containsKey && ho.d0.a(value, get(key))) {
            return value;
        }
        if (force) {
            inverse().remove(value);
        } else {
            Preconditions.checkArgument(!containsValue(value), "value already present: %s", value);
        }
        V put = this.delegate.put(key, value);
        z(key, containsKey, put, value);
        return put;
    }

    @t7
    @uo.a
    public final V x(@CheckForNull Object obj) {
        V v11 = (V) m7.a(this.delegate.remove(obj));
        y(v11);
        return v11;
    }

    public final void y(@t7 V oldValue) {
        this.inverse.delegate.remove(oldValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(@t7 K key, boolean containedKey, @CheckForNull V oldValue, @t7 V newValue) {
        if (containedKey) {
            y(m7.a(oldValue));
        }
        this.inverse.delegate.put(newValue, key);
    }

    public a(Map<K, V> forward, Map<V, K> backward) {
        setDelegates(forward, backward);
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    public Map<K, V> delegate() {
        return this.delegate;
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        f fVar = new f(this, null);
        this.valueSet = fVar;
        return fVar;
    }

    public a(Map<K, V> backward, a<V, K> forward) {
        this.delegate = backward;
        this.inverse = forward;
    }

    @t7
    @uo.a
    public K checkKey(@t7 K key) {
        return key;
    }

    @t7
    @uo.a
    public V checkValue(@t7 V value) {
        return value;
    }
}
