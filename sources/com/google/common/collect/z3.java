package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.g7;
import com.google.common.collect.j7;
import com.google.common.collect.k7;
import com.google.common.collect.u6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public class z3<K, V> extends h<K, V> implements f4<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final d7<K, V> f34148a;

    /* renamed from: b, reason: collision with root package name */
    public final ho.i0<? super Map.Entry<K, V>> f34149b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends u6.r0<K, Collection<V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.z3$a$a, reason: collision with other inner class name */
        public class C0412a extends u6.s<K, Collection<V>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.z3$a$a$a, reason: collision with other inner class name */
            public class C0413a extends com.google.common.collect.c<Map.Entry<K, Collection<V>>> {

                /* renamed from: c, reason: collision with root package name */
                public final Iterator<Map.Entry<K, Collection<V>>> f34152c;

                public C0413a() {
                    this.f34152c = z3.this.f34148a.asMap().entrySet().iterator();
                }

                @Override // com.google.common.collect.c
                @CheckForNull
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, Collection<V>> a() {
                    while (this.f34152c.hasNext()) {
                        Map.Entry<K, Collection<V>> next = this.f34152c.next();
                        K key = next.getKey();
                        Collection c11 = z3.c(next.getValue(), new c(key));
                        if (!c11.isEmpty()) {
                            return u6.O(key, c11);
                        }
                    }
                    return b();
                }
            }

            public C0412a() {
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, Collection<V>> g() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0413a();
            }

            @Override // com.google.common.collect.u6.s, com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c11) {
                return z3.this.d(ho.j0.n(c11));
            }

            @Override // com.google.common.collect.u6.s, com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c11) {
                return z3.this.d(ho.j0.q(ho.j0.n(c11)));
            }

            @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return l6.Y(iterator());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends u6.b0<K, Collection<V>> {
            public b() {
                super(a.this);
            }

            @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object o11) {
                return a.this.remove(o11) != null;
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c11) {
                return z3.this.d(u6.U(ho.j0.n(c11)));
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c11) {
                return z3.this.d(u6.U(ho.j0.q(ho.j0.n(c11))));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends u6.q0<K, Collection<V>> {
            public c() {
                super(a.this);
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object o11) {
                if (!(o11 instanceof Collection)) {
                    return false;
                }
                Collection collection = (Collection) o11;
                Iterator<Map.Entry<K, Collection<V>>> it = z3.this.f34148a.asMap().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<K, Collection<V>> next = it.next();
                    Collection c11 = z3.c(next.getValue(), new c(next.getKey()));
                    if (!c11.isEmpty() && collection.equals(c11)) {
                        if (c11.size() == next.getValue().size()) {
                            it.remove();
                            return true;
                        }
                        c11.clear();
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> c11) {
                return z3.this.d(u6.T0(ho.j0.n(c11)));
            }

            @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> c11) {
                return z3.this.d(u6.T0(ho.j0.q(ho.j0.n(c11))));
            }
        }

        public a() {
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, Collection<V>>> b() {
            return new C0412a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            z3.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return get(key) != null;
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: d */
        public Set<K> k() {
            return new b();
        }

        @Override // com.google.common.collect.u6.r0
        public Collection<Collection<V>> g() {
            return new c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object key) {
            Collection<V> collection = z3.this.f34148a.asMap().get(key);
            if (collection == null) {
                return null;
            }
            Collection<V> c11 = z3.c(collection, new c(key));
            if (c11.isEmpty()) {
                return null;
            }
            return c11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object key) {
            Collection<V> collection = z3.this.f34148a.asMap().get(key);
            if (collection == null) {
                return null;
            }
            ArrayList q11 = q6.q();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (z3.this.e(key, next)) {
                    it.remove();
                    q11.add(next);
                }
            }
            if (q11.isEmpty()) {
                return null;
            }
            return z3.this.f34148a instanceof p8 ? Collections.unmodifiableSet(q8.B(q11)) : Collections.unmodifiableList(q11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g7.g<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends k7.i<K> {
            public a() {
            }

            @Override // com.google.common.collect.k7.i
            public j7<K> g() {
                return b.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<j7.a<K>> iterator() {
                return b.this.entryIterator();
            }

            public final boolean j(final ho.i0<? super j7.a<K>> predicate) {
                return z3.this.d(new ho.i0() { // from class: com.google.common.collect.a4
                    @Override // ho.i0
                    public final boolean apply(Object obj) {
                        boolean apply;
                        apply = ho.i0.this.apply(k7.k(r2.getKey(), ((Collection) ((Map.Entry) obj).getValue()).size()));
                        return apply;
                    }
                });
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> c11) {
                return j(ho.j0.n(c11));
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> c11) {
                return j(ho.j0.q(ho.j0.n(c11)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return z3.this.keySet().size();
            }
        }

        public b() {
            super(z3.this);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.j7
        public Set<j7.a<K>> entrySet() {
            return new a();
        }

        @Override // com.google.common.collect.g7.g, com.google.common.collect.i, com.google.common.collect.j7
        public int remove(@CheckForNull Object key, int occurrences) {
            x2.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(key);
            }
            Collection<V> collection = z3.this.f34148a.asMap().get(key);
            int i11 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (z3.this.e(key, it.next()) && (i11 = i11 + 1) <= occurrences) {
                    it.remove();
                }
            }
            return i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c implements ho.i0<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f34158a;

        public c(@t7 K key) {
            this.f34158a = key;
        }

        @Override // ho.i0
        public boolean apply(@t7 V value) {
            return z3.this.e(this.f34158a, value);
        }
    }

    public z3(d7<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> predicate) {
        this.f34148a = (d7) Preconditions.checkNotNull(unfiltered);
        this.f34149b = (ho.i0) Preconditions.checkNotNull(predicate);
    }

    public static <E> Collection<E> c(Collection<E> collection, ho.i0<? super E> predicate) {
        return collection instanceof Set ? q8.i((Set) collection, predicate) : y2.d(collection, predicate);
    }

    public d7<K, V> b() {
        return this.f34148a;
    }

    @Override // com.google.common.collect.d7
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        return asMap().get(key) != null;
    }

    @Override // com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        return new a();
    }

    @Override // com.google.common.collect.h
    public Collection<Map.Entry<K, V>> createEntries() {
        return c(this.f34148a.entries(), this.f34149b);
    }

    @Override // com.google.common.collect.h
    public Set<K> createKeySet() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.h
    public j7<K> createKeys() {
        return new b();
    }

    @Override // com.google.common.collect.h
    public Collection<V> createValues() {
        return new g4(this);
    }

    public boolean d(ho.i0<? super Map.Entry<K, Collection<V>>> predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f34148a.asMap().entrySet().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection c11 = c(next.getValue(), new c(key));
            if (!c11.isEmpty() && predicate.apply(u6.O(key, c11))) {
                if (c11.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    c11.clear();
                }
                z11 = true;
            }
        }
        return z11;
    }

    public final boolean e(@t7 K key, @t7 V value) {
        return this.f34149b.apply(u6.O(key, value));
    }

    @Override // com.google.common.collect.h
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public Collection<V> f() {
        return this.f34148a instanceof p8 ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> get(@t7 K key) {
        return c(this.f34148a.get(key), new c(key));
    }

    @Override // com.google.common.collect.f4
    public ho.i0<? super Map.Entry<K, V>> m() {
        return this.f34149b;
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public Collection<V> removeAll(@CheckForNull Object key) {
        return (Collection) ho.b0.a(asMap().remove(key), f());
    }

    @Override // com.google.common.collect.d7
    public int size() {
        return entries().size();
    }
}
