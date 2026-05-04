package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.e;
import com.google.common.collect.g7;
import com.google.common.collect.h;
import com.google.common.collect.j7;
import com.google.common.collect.k7;
import com.google.common.collect.q8;
import com.google.common.collect.u6;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class g7 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> extends u6.r0<K, Collection<V>> {

        /* renamed from: d, reason: collision with root package name */
        @Weak
        public final d7<K, V> f33496d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.collect.g7$a$a, reason: collision with other inner class name */
        public class C0398a extends u6.s<K, Collection<V>> {
            public C0398a() {
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, Collection<V>> g() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return u6.m(a.this.f33496d.keySet(), new ho.r() { // from class: com.google.common.collect.f7
                    @Override // ho.r
                    public final Object apply(Object obj) {
                        Collection collection;
                        collection = g7.a.this.f33496d.get(obj);
                        return collection;
                    }
                });
            }

            @Override // com.google.common.collect.u6.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object o11) {
                if (!contains(o11)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) o11;
                Objects.requireNonNull(entry);
                a.this.k(entry.getKey());
                return true;
            }
        }

        public a(d7<K, V> multimap) {
            this.f33496d = (d7) Preconditions.checkNotNull(multimap);
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, Collection<V>>> b() {
            return new C0398a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f33496d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33496d.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@CheckForNull Object key) {
            if (containsKey(key)) {
                return this.f33496d.get(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f33496d.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@CheckForNull Object key) {
            if (containsKey(key)) {
                return this.f33496d.removeAll(key);
            }
            return null;
        }

        public void k(@CheckForNull Object key) {
            this.f33496d.keySet().remove(key);
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: keySet */
        public Set<K> l() {
            return this.f33496d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33496d.keySet().size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K, V> extends com.google.common.collect.d<K, V> {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient ho.p0<? extends List<V>> f33498a;

        public b(Map<K, Collection<V>> map, ho.p0<? extends List<V>> factory) {
            super(map);
            this.f33498a = (ho.p0) Preconditions.checkNotNull(factory);
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            this.f33498a = (ho.p0) readObject;
            Object readObject2 = stream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f33498a);
            stream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.d, com.google.common.collect.e
        public List<V> createCollection() {
            return this.f33498a.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K, V> extends com.google.common.collect.e<K, V> {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient ho.p0<? extends Collection<V>> f33499a;

        public c(Map<K, Collection<V>> map, ho.p0<? extends Collection<V>> factory) {
            super(map);
            this.f33499a = (ho.p0) Preconditions.checkNotNull(factory);
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            this.f33499a = (ho.p0) readObject;
            Object readObject2 = stream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f33499a);
            stream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.e
        public Collection<V> createCollection() {
            return this.f33499a.get();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.e
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? q8.P((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.e
        public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
            return collection instanceof List ? wrapList(key, (List) collection, null) : collection instanceof NavigableSet ? new e.m(key, (NavigableSet) collection, null) : collection instanceof SortedSet ? new e.o(key, (SortedSet) collection, null) : collection instanceof Set ? new e.n(key, (Set) collection) : new e.k(key, collection, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K, V> extends com.google.common.collect.m<K, V> {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient ho.p0<? extends Set<V>> f33500a;

        public d(Map<K, Collection<V>> map, ho.p0<? extends Set<V>> factory) {
            super(map);
            this.f33500a = (ho.p0) Preconditions.checkNotNull(factory);
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            this.f33500a = (ho.p0) readObject;
            Object readObject2 = stream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f33500a);
            stream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
            return collection instanceof NavigableSet ? q8.P((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        public Collection<V> wrapCollection(@t7 K key, Collection<V> collection) {
            return collection instanceof NavigableSet ? new e.m(key, (NavigableSet) collection, null) : collection instanceof SortedSet ? new e.o(key, (SortedSet) collection, null) : new e.n(key, (Set) collection);
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        public Set<V> createCollection() {
            return this.f33500a.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public abstract d7<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            if (!(o11 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o11;
            return a().containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object o11) {
            if (!(o11 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o11;
            return a().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<K, V> extends com.google.common.collect.i<K> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final d7<K, V> f33503a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends v9<Map.Entry<K, Collection<V>>, j7.a<K>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.g7$g$a$a, reason: collision with other inner class name */
            public class C0399a extends k7.f<K> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f33505a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f33506b;

                public C0399a(final a this$1, final Map.Entry val$backingEntry) {
                    this.f33505a = val$backingEntry;
                    this.f33506b = this$1;
                }

                @Override // com.google.common.collect.j7.a
                @t7
                public K e() {
                    return (K) this.f33505a.getKey();
                }

                @Override // com.google.common.collect.j7.a
                public int getCount() {
                    return ((Collection) this.f33505a.getValue()).size();
                }
            }

            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public j7.a<K> a(final Map.Entry<K, Collection<V>> backingEntry) {
                return new C0399a(this, backingEntry);
            }
        }

        public g(d7<K, V> multimap) {
            this.f33503a = multimap;
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f33503a.clear();
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public boolean contains(@CheckForNull Object element) {
            return this.f33503a.containsKey(element);
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object element) {
            Collection collection = (Collection) u6.p0(this.f33503a.asMap(), element);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.i
        public int distinctElements() {
            return this.f33503a.asMap().size();
        }

        @Override // com.google.common.collect.i
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.i, com.google.common.collect.j7
        public Set<K> elementSet() {
            return this.f33503a.keySet();
        }

        @Override // com.google.common.collect.i
        public Iterator<j7.a<K>> entryIterator() {
            return new a(this.f33503a.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.j7
        public Iterator<K> iterator() {
            return u6.S(this.f33503a.entries().iterator());
        }

        @Override // com.google.common.collect.i, com.google.common.collect.j7
        public int remove(@CheckForNull Object element, int occurrences) {
            x2.b(occurrences, "occurrences");
            if (occurrences == 0) {
                return count(element);
            }
            Collection collection = (Collection) u6.p0(this.f33503a.asMap(), element);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (occurrences >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i11 = 0; i11 < occurrences; i11++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.j7
        public int size() {
            return this.f33503a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<K, V> extends com.google.common.collect.h<K, V> implements p8<K, V>, Serializable {
        private static final long serialVersionUID = 7845222491160860175L;

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f33507a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends q8.k<V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f33508a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f33509b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.g7$h$a$a, reason: collision with other inner class name */
            public class C0400a implements Iterator<V> {

                /* renamed from: a, reason: collision with root package name */
                public int f33510a;

                public C0400a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f33510a != 0) {
                        return false;
                    }
                    a aVar = a.this;
                    return aVar.f33509b.f33507a.containsKey(aVar.f33508a);
                }

                @Override // java.util.Iterator
                @t7
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f33510a++;
                    a aVar = a.this;
                    return (V) m7.a(aVar.f33509b.f33507a.get(aVar.f33508a));
                }

                @Override // java.util.Iterator
                public void remove() {
                    x2.e(this.f33510a == 1);
                    this.f33510a = -1;
                    a aVar = a.this;
                    aVar.f33509b.f33507a.remove(aVar.f33508a);
                }
            }

            public a(final h this$0, final Object val$key) {
                this.f33508a = val$key;
                this.f33509b = this$0;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0400a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f33509b.f33507a.containsKey(this.f33508a) ? 1 : 0;
            }
        }

        public h(Map<K, V> map) {
            this.f33507a = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.collect.d7
        public void clear() {
            this.f33507a.clear();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
            return this.f33507a.entrySet().contains(u6.O(key, value));
        }

        @Override // com.google.common.collect.d7
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33507a.containsKey(key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean containsValue(@CheckForNull Object value) {
            return this.f33507a.containsValue(value);
        }

        @Override // com.google.common.collect.h
        public Map<K, Collection<V>> createAsMap() {
            return new a(this);
        }

        @Override // com.google.common.collect.h
        public Collection<Map.Entry<K, V>> createEntries() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.h
        public Set<K> createKeySet() {
            return this.f33507a.keySet();
        }

        @Override // com.google.common.collect.h
        public j7<K> createKeys() {
            return new g(this);
        }

        @Override // com.google.common.collect.h
        public Collection<V> createValues() {
            return this.f33507a.values();
        }

        @Override // com.google.common.collect.h
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return this.f33507a.entrySet().iterator();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(@t7 final Object key) {
            return get((h<K, V>) key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public int hashCode() {
            return this.f33507a.hashCode();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean put(@t7 K key, @t7 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean putAll(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
            return this.f33507a.entrySet().remove(u6.O(key, value));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((h<K, V>) key, values);
        }

        @Override // com.google.common.collect.d7
        public int size() {
            return this.f33507a.size();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public Set<Map.Entry<K, V>> entries() {
            return this.f33507a.entrySet();
        }

        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> get(@t7 final K key) {
            return new a(this, key);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean putAll(d7<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> removeAll(@CheckForNull Object key) {
            HashSet hashSet = new HashSet(2);
            if (!this.f33507a.containsKey(key)) {
                return hashSet;
            }
            hashSet.add(this.f33507a.remove(key));
            return hashSet;
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<K, V1, V2> extends j<K, V1, V2> implements p6<K, V2> {
        public i(p6<K, V1> fromMultimap, u6.t<? super K, ? super V1, V2> transformer) {
            super(fromMultimap, transformer);
        }

        @Override // com.google.common.collect.g7.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<V2> c(@t7 K key, Collection<V1> values) {
            return q6.D((List) values, u6.n(this.f33513b, key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.j, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
            return get((i<K, V1, V2>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.j, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((i<K, V1, V2>) key, values);
        }

        @Override // com.google.common.collect.g7.j, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V2> get(@t7 K key) {
            return c(key, this.f33512a.get(key));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.j, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V2> removeAll(@CheckForNull Object key) {
            return c(key, this.f33512a.removeAll(key));
        }

        @Override // com.google.common.collect.g7.j, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V2> replaceValues(@t7 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j<K, V1, V2> extends com.google.common.collect.h<K, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final d7<K, V1> f33512a;

        /* renamed from: b, reason: collision with root package name */
        public final u6.t<? super K, ? super V1, V2> f33513b;

        public j(d7<K, V1> fromMultimap, final u6.t<? super K, ? super V1, V2> transformer) {
            this.f33512a = (d7) Preconditions.checkNotNull(fromMultimap);
            this.f33513b = (u6.t) Preconditions.checkNotNull(transformer);
        }

        public Collection<V2> c(@t7 K key, Collection<V1> values) {
            ho.r n11 = u6.n(this.f33513b, key);
            return values instanceof List ? q6.D((List) values, n11) : y2.m(values, n11);
        }

        @Override // com.google.common.collect.d7
        public void clear() {
            this.f33512a.clear();
        }

        @Override // com.google.common.collect.d7
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33512a.containsKey(key);
        }

        @Override // com.google.common.collect.h
        public Map<K, Collection<V2>> createAsMap() {
            return u6.z0(this.f33512a.asMap(), new u6.t() { // from class: com.google.common.collect.h7
                @Override // com.google.common.collect.u6.t
                public final Object a(Object obj, Object obj2) {
                    Collection c11;
                    c11 = g7.j.this.c(obj, (Collection) obj2);
                    return c11;
                }
            });
        }

        @Override // com.google.common.collect.h
        public Collection<Map.Entry<K, V2>> createEntries() {
            return new h.a();
        }

        @Override // com.google.common.collect.h
        public Set<K> createKeySet() {
            return this.f33512a.keySet();
        }

        @Override // com.google.common.collect.h
        public j7<K> createKeys() {
            return this.f33512a.keys();
        }

        @Override // com.google.common.collect.h
        public Collection<V2> createValues() {
            return y2.m(this.f33512a.entries(), u6.h(this.f33513b));
        }

        @Override // com.google.common.collect.h
        public Iterator<Map.Entry<K, V2>> entryIterator() {
            return l6.b0(this.f33512a.entries().iterator(), u6.g(this.f33513b));
        }

        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V2> get(@t7 final K key) {
            return c(key, this.f33512a.get(key));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean isEmpty() {
            return this.f33512a.isEmpty();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean put(@t7 K key, @t7 V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean putAll(@t7 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
            return get(key).remove(value);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V2> removeAll(@CheckForNull Object key) {
            return c(key, this.f33512a.removeAll(key));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V2> replaceValues(@t7 K key, Iterable<? extends V2> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d7
        public int size() {
            return this.f33512a.size();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.d7
        public boolean putAll(d7<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k<K, V> extends l<K, V> implements p6<K, V> {
        private static final long serialVersionUID = 0;

        public k(p6<K, V> delegate) {
            super(delegate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
            return get((k<K, V>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((k<K, V>) key, values);
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public p6<K, V> delegate() {
            return (p6) super.delegate();
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> get(@t7 K key) {
            return Collections.unmodifiableList(delegate().get((p6<K, V>) key));
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> removeAll(@CheckForNull Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l<K, V> extends y4<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final d7<K, V> f33514a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Collection<Map.Entry<K, V>> f33515b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient j7<K> f33516c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<K> f33517d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Collection<V> f33518e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Map<K, Collection<V>> f33519f;

        public l(final d7<K, V> delegate) {
            this.f33514a = (d7) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.f33519f;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(u6.D0(this.f33514a.asMap(), new ho.r() { // from class: com.google.common.collect.i7
                @Override // ho.r
                public final Object apply(Object obj) {
                    Collection Q;
                    Q = g7.Q((Collection) obj);
                    return Q;
                }
            }));
            this.f33519f = unmodifiableMap;
            return unmodifiableMap;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.f33515b;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> I = g7.I(this.f33514a.entries());
            this.f33515b = I;
            return I;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V> get(@t7 K key) {
            return g7.Q(this.f33514a.get(key));
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public Set<K> keySet() {
            Set<K> set = this.f33517d;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.f33514a.keySet());
            this.f33517d = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public j7<K> keys() {
            j7<K> j7Var = this.f33516c;
            if (j7Var != null) {
                return j7Var;
            }
            j7<K> B = k7.B(this.f33514a.keys());
            this.f33516c = B;
            return B;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public boolean put(@t7 K key, @t7 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public boolean putAll(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V> removeAll(@CheckForNull Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Collection<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public Collection<V> values() {
            Collection<V> collection = this.f33518e;
            if (collection != null) {
                return collection;
            }
            Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.f33514a.values());
            this.f33518e = unmodifiableCollection;
            return unmodifiableCollection;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.c5
        /* renamed from: w */
        public d7<K, V> delegate() {
            return this.f33514a;
        }

        @Override // com.google.common.collect.y4, com.google.common.collect.d7
        public boolean putAll(d7<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<K, V> extends l<K, V> implements p8<K, V> {
        private static final long serialVersionUID = 0;

        public m(p8<K, V> delegate) {
            super(delegate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
            return get((m<K, V>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((m<K, V>) key, values);
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public p8<K, V> delegate() {
            return (p8) super.delegate();
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7
        public Set<Map.Entry<K, V>> entries() {
            return u6.M0(delegate().entries());
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> get(@t7 K key) {
            return Collections.unmodifiableSet(delegate().get((p8<K, V>) key));
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> removeAll(@CheckForNull Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n<K, V> extends m<K, V> implements a9<K, V> {
        private static final long serialVersionUID = 0;

        public n(a9<K, V> delegate) {
            super(delegate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
            return get((n<K, V>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((n<K, V>) key, values);
        }

        @Override // com.google.common.collect.a9
        @CheckForNull
        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }

        @Override // com.google.common.collect.g7.m
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public a9<K, V> delegate() {
            return (a9) super.delegate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
            return get((n<K, V>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Set replaceValues(@t7 Object key, Iterable values) {
            return replaceValues((n<K, V>) key, values);
        }

        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> get(@t7 K key) {
            return Collections.unmodifiableSortedSet(delegate().get((a9<K, V>) key));
        }

        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> removeAll(@CheckForNull Object key) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g7.m, com.google.common.collect.g7.l, com.google.common.collect.y4, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            throw new UnsupportedOperationException();
        }
    }

    @go.d
    public static <K, V> d7<K, V> A(d7<K, V> multimap) {
        return e9.m(multimap, null);
    }

    @go.d
    public static <K, V> p8<K, V> B(p8<K, V> multimap) {
        return e9.v(multimap, null);
    }

    @go.d
    public static <K, V> a9<K, V> C(a9<K, V> multimap) {
        return e9.y(multimap, null);
    }

    @p5
    public static <T, K, V, M extends d7<K, V>> Collector<T, ?, M> D(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, Supplier<M> multimapSupplier) {
        return v2.X(keyFunction, valueFunction, multimapSupplier);
    }

    public static <K, V1, V2> p6<K, V2> E(p6<K, V1> fromMap, u6.t<? super K, ? super V1, V2> transformer) {
        return new i(fromMap, transformer);
    }

    public static <K, V1, V2> d7<K, V2> F(d7<K, V1> fromMap, u6.t<? super K, ? super V1, V2> transformer) {
        return new j(fromMap, transformer);
    }

    public static <K, V1, V2> p6<K, V2> G(p6<K, V1> fromMultimap, final ho.r<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return E(fromMultimap, u6.i(function));
    }

    public static <K, V1, V2> d7<K, V2> H(d7<K, V1> fromMultimap, final ho.r<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return F(fromMultimap, u6.i(function));
    }

    public static <K, V> Collection<Map.Entry<K, V>> I(Collection<Map.Entry<K, V>> entries) {
        return entries instanceof Set ? u6.M0((Set) entries) : new u6.m0(Collections.unmodifiableCollection(entries));
    }

    @Deprecated
    public static <K, V> p6<K, V> J(ImmutableListMultimap<K, V> delegate) {
        return (p6) Preconditions.checkNotNull(delegate);
    }

    public static <K, V> p6<K, V> K(p6<K, V> delegate) {
        return !(delegate instanceof k) ? delegate instanceof ImmutableListMultimap ? delegate : new k(delegate) : delegate;
    }

    @Deprecated
    public static <K, V> d7<K, V> L(ImmutableMultimap<K, V> delegate) {
        return (d7) Preconditions.checkNotNull(delegate);
    }

    public static <K, V> d7<K, V> M(d7<K, V> delegate) {
        return !(delegate instanceof l) ? delegate instanceof ImmutableMultimap ? delegate : new l(delegate) : delegate;
    }

    @Deprecated
    public static <K, V> p8<K, V> N(ImmutableSetMultimap<K, V> delegate) {
        return (p8) Preconditions.checkNotNull(delegate);
    }

    public static <K, V> p8<K, V> O(p8<K, V> delegate) {
        return !(delegate instanceof m) ? delegate instanceof ImmutableSetMultimap ? delegate : new m(delegate) : delegate;
    }

    public static <K, V> a9<K, V> P(a9<K, V> delegate) {
        return delegate instanceof n ? delegate : new n(delegate);
    }

    public static <V> Collection<V> Q(Collection<V> collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> Map<K, List<V>> c(p6<K, V> p6Var) {
        return p6Var.asMap();
    }

    public static <K, V> Map<K, Collection<V>> d(d7<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V> Map<K, Set<V>> e(p8<K, V> p8Var) {
        return p8Var.asMap();
    }

    public static <K, V> Map<K, SortedSet<V>> f(a9<K, V> a9Var) {
        return a9Var.asMap();
    }

    public static boolean g(d7<?, ?> multimap, @CheckForNull Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof d7) {
            return multimap.asMap().equals(((d7) object).asMap());
        }
        return false;
    }

    public static <K, V> d7<K, V> h(d7<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof p8 ? i((p8) unfiltered, entryPredicate) : unfiltered instanceof f4 ? j((f4) unfiltered, entryPredicate) : new z3((d7) Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> p8<K, V> i(p8<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof h4 ? k((h4) unfiltered, entryPredicate) : new b4((p8) Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V> d7<K, V> j(f4<K, V> multimap, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new z3(multimap.b(), ho.j0.d(multimap.m(), entryPredicate));
    }

    public static <K, V> p8<K, V> k(h4<K, V> multimap, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new b4(multimap.b(), ho.j0.d(multimap.m(), entryPredicate));
    }

    public static <K, V> p6<K, V> l(p6<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        if (!(unfiltered instanceof c4)) {
            return new c4(unfiltered, keyPredicate);
        }
        c4 c4Var = (c4) unfiltered;
        return new c4(c4Var.b(), ho.j0.d(c4Var.f33322b, keyPredicate));
    }

    public static <K, V> d7<K, V> m(d7<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        if (unfiltered instanceof p8) {
            return n((p8) unfiltered, keyPredicate);
        }
        if (unfiltered instanceof p6) {
            return l((p6) unfiltered, keyPredicate);
        }
        if (!(unfiltered instanceof d4)) {
            return unfiltered instanceof f4 ? j((f4) unfiltered, u6.U(keyPredicate)) : new d4(unfiltered, keyPredicate);
        }
        d4 d4Var = (d4) unfiltered;
        return new d4(d4Var.f33321a, ho.j0.d(d4Var.f33322b, keyPredicate));
    }

    public static <K, V> p8<K, V> n(p8<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        if (!(unfiltered instanceof e4)) {
            return unfiltered instanceof h4 ? k((h4) unfiltered, u6.U(keyPredicate)) : new e4(unfiltered, keyPredicate);
        }
        e4 e4Var = (e4) unfiltered;
        return new e4(e4Var.b(), ho.j0.d(e4Var.f33322b, keyPredicate));
    }

    public static <K, V> d7<K, V> o(d7<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return h(unfiltered, u6.T0(valuePredicate));
    }

    public static <K, V> p8<K, V> p(p8<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return i(unfiltered, u6.T0(valuePredicate));
    }

    @p5
    public static <T, K, V, M extends d7<K, V>> Collector<T, ?, M> q(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends Stream<? extends V>> valueFunction, Supplier<M> multimapSupplier) {
        return v2.F(keyFunction, valueFunction, multimapSupplier);
    }

    public static <K, V> p8<K, V> r(Map<K, V> map) {
        return new h(map);
    }

    public static <K, V> ImmutableListMultimap<K, V> s(Iterable<V> values, ho.r<? super V, K> keyFunction) {
        return t(values.iterator(), keyFunction);
    }

    public static <K, V> ImmutableListMultimap<K, V> t(Iterator<V> values, ho.r<? super V, K> keyFunction) {
        Preconditions.checkNotNull(keyFunction);
        ImmutableListMultimap.a builder = ImmutableListMultimap.builder();
        while (values.hasNext()) {
            V next = values.next();
            Preconditions.checkNotNull(next, values);
            builder.i(keyFunction.apply(next), next);
        }
        return builder.a();
    }

    @uo.a
    public static <K, V, M extends d7<K, V>> M u(d7<? extends V, ? extends K> source, M dest) {
        Preconditions.checkNotNull(dest);
        for (Map.Entry<? extends V, ? extends K> entry : source.entries()) {
            dest.put(entry.getValue(), entry.getKey());
        }
        return dest;
    }

    public static <K, V> p6<K, V> v(Map<K, Collection<V>> map, final ho.p0<? extends List<V>> factory) {
        return new b(map, factory);
    }

    public static <K, V> d7<K, V> w(Map<K, Collection<V>> map, final ho.p0<? extends Collection<V>> factory) {
        return new c(map, factory);
    }

    public static <K, V> p8<K, V> x(Map<K, Collection<V>> map, final ho.p0<? extends Set<V>> factory) {
        return new d(map, factory);
    }

    public static <K, V> a9<K, V> y(Map<K, Collection<V>> map, final ho.p0<? extends SortedSet<V>> factory) {
        return new e(map, factory);
    }

    @go.d
    public static <K, V> p6<K, V> z(p6<K, V> multimap) {
        return e9.k(multimap, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<K, V> extends p<K, V> {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient ho.p0<? extends SortedSet<V>> f33501a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public transient Comparator<? super V> f33502b;

        public e(Map<K, Collection<V>> map, ho.p0<? extends SortedSet<V>> factory) {
            super(map);
            this.f33501a = (ho.p0) Preconditions.checkNotNull(factory);
            this.f33502b = factory.get().comparator();
        }

        @go.d
        @go.c
        private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            Object readObject = stream.readObject();
            Objects.requireNonNull(readObject);
            ho.p0<? extends SortedSet<V>> p0Var = (ho.p0) readObject;
            this.f33501a = p0Var;
            this.f33502b = p0Var.get().comparator();
            Object readObject2 = stream.readObject();
            Objects.requireNonNull(readObject2);
            setMap((Map) readObject2);
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(this.f33501a);
            stream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.a9
        @CheckForNull
        public Comparator<? super V> valueComparator() {
            return this.f33502b;
        }

        @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
        public SortedSet<V> createCollection() {
            return this.f33501a.get();
        }
    }
}
