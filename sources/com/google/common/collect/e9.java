package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.f9;
import com.google.common.collect.j7;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class e9 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends k<K, Collection<V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public transient Set<Map.Entry<K, Collection<V>>> f33447f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public transient Collection<Collection<V>> f33448g;

        public b(Map<K, Collection<V>> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        public boolean containsValue(@CheckForNull Object o11) {
            return values().contains(o11);
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33447f == null) {
                        this.f33447f = new c(g().entrySet(), this.f33470b);
                    }
                    set = this.f33447f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f33470b) {
                try {
                    if (this.f33448g == null) {
                        this.f33448g = new d(g().values(), this.f33470b);
                    }
                    collection = this.f33448g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        @CheckForNull
        public Collection<V> get(@CheckForNull Object key) {
            Collection<V> A;
            synchronized (this.f33470b) {
                Collection collection = (Collection) super.get(key);
                A = collection == null ? null : e9.A(collection, this.f33470b);
            }
            return A;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<V> extends f<Collection<V>> {
        private static final long serialVersionUID = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends v9<Collection<V>, Collection<V>> {
            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> a(Collection<V> from) {
                return e9.A(from, d.this.f33470b);
            }
        }

        public d(Collection<Collection<V>> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<K, V> extends k<K, V> implements com.google.common.collect.u<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public transient Set<V> f33453f;

        /* renamed from: g, reason: collision with root package name */
        @RetainedWith
        @CheckForNull
        public transient com.google.common.collect.u<V, K> f33454g;

        @Override // com.google.common.collect.u
        @CheckForNull
        public V forcePut(@t7 K key, @t7 V value) {
            V forcePut;
            synchronized (this.f33470b) {
                forcePut = d().forcePut(key, value);
            }
            return forcePut;
        }

        @Override // com.google.common.collect.e9.k
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.google.common.collect.u<K, V> g() {
            return (com.google.common.collect.u) super.g();
        }

        @Override // com.google.common.collect.u
        public com.google.common.collect.u<V, K> inverse() {
            com.google.common.collect.u<V, K> uVar;
            synchronized (this.f33470b) {
                try {
                    if (this.f33454g == null) {
                        this.f33454g = new e(d().inverse(), this.f33470b, this);
                    }
                    uVar = this.f33454g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return uVar;
        }

        public e(com.google.common.collect.u<K, V> delegate, @CheckForNull Object mutex, @CheckForNull com.google.common.collect.u<V, K> inverse) {
            super(delegate, mutex);
            this.f33454g = inverse;
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33453f == null) {
                        this.f33453f = e9.u(d().values(), this.f33470b);
                    }
                    set = this.f33453f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class f<E> extends p implements Collection<E> {
        private static final long serialVersionUID = 0;

        @Override // java.util.Collection
        public boolean add(E e11) {
            boolean add;
            synchronized (this.f33470b) {
                add = h().add(e11);
            }
            return add;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> c11) {
            boolean addAll;
            synchronized (this.f33470b) {
                addAll = h().addAll(c11);
            }
            return addAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f33470b) {
                h().clear();
            }
        }

        public boolean contains(@CheckForNull Object o11) {
            boolean contains;
            synchronized (this.f33470b) {
                contains = h().contains(o11);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> c11) {
            boolean containsAll;
            synchronized (this.f33470b) {
                containsAll = h().containsAll(c11);
            }
            return containsAll;
        }

        @Override // com.google.common.collect.e9.p
        /* renamed from: g */
        public Collection<E> g() {
            return (Collection) super.g();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f33470b) {
                isEmpty = h().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return h().iterator();
        }

        public boolean remove(@CheckForNull Object o11) {
            boolean remove;
            synchronized (this.f33470b) {
                remove = h().remove(o11);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> c11) {
            boolean removeAll;
            synchronized (this.f33470b) {
                removeAll = h().removeAll(c11);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> c11) {
            boolean retainAll;
            synchronized (this.f33470b) {
                retainAll = h().retainAll(c11);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f33470b) {
                size = h().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f33470b) {
                array = h().toArray();
            }
            return array;
        }

        public f(Collection<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f33470b) {
                tArr2 = (T[]) h().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<E> extends q<E> implements Deque<E> {
        private static final long serialVersionUID = 0;

        public g(Deque<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Deque
        public void addFirst(E e11) {
            synchronized (this.f33470b) {
                g().addFirst(e11);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e11) {
            synchronized (this.f33470b) {
                g().addLast(e11);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.f33470b) {
                descendingIterator = g().descendingIterator();
            }
            return descendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E first;
            synchronized (this.f33470b) {
                first = g().getFirst();
            }
            return first;
        }

        @Override // java.util.Deque
        public E getLast() {
            E last;
            synchronized (this.f33470b) {
                last = g().getLast();
            }
            return last;
        }

        @Override // com.google.common.collect.e9.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque<E> h() {
            return (Deque) super.h();
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e11) {
            boolean offerFirst;
            synchronized (this.f33470b) {
                offerFirst = g().offerFirst(e11);
            }
            return offerFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e11) {
            boolean offerLast;
            synchronized (this.f33470b) {
                offerLast = g().offerLast(e11);
            }
            return offerLast;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E peekFirst() {
            E peekFirst;
            synchronized (this.f33470b) {
                peekFirst = g().peekFirst();
            }
            return peekFirst;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E peekLast() {
            E peekLast;
            synchronized (this.f33470b) {
                peekLast = g().peekLast();
            }
            return peekLast;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E pollFirst() {
            E pollFirst;
            synchronized (this.f33470b) {
                pollFirst = g().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.Deque
        @CheckForNull
        public E pollLast() {
            E pollLast;
            synchronized (this.f33470b) {
                pollLast = g().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.Deque
        public E pop() {
            E pop;
            synchronized (this.f33470b) {
                pop = g().pop();
            }
            return pop;
        }

        @Override // java.util.Deque
        public void push(E e11) {
            synchronized (this.f33470b) {
                g().push(e11);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E removeFirst;
            synchronized (this.f33470b) {
                removeFirst = g().removeFirst();
            }
            return removeFirst;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@CheckForNull Object o11) {
            boolean removeFirstOccurrence;
            synchronized (this.f33470b) {
                removeFirstOccurrence = g().removeFirstOccurrence(o11);
            }
            return removeFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E removeLast;
            synchronized (this.f33470b) {
                removeLast = g().removeLast();
            }
            return removeLast;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@CheckForNull Object o11) {
            boolean removeLastOccurrence;
            synchronized (this.f33470b) {
                removeLastOccurrence = g().removeLastOccurrence(o11);
            }
            return removeLastOccurrence;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static final class h<K, V> extends p implements Map.Entry<K, V> {
        private static final long serialVersionUID = 0;

        public h(Map.Entry<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            boolean equals;
            synchronized (this.f33470b) {
                equals = g().equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.p
        public Map.Entry<K, V> g() {
            return (Map.Entry) super.g();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f33470b) {
                key = g().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f33470b) {
                value = g().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map.Entry
        public V setValue(V value) {
            V value2;
            synchronized (this.f33470b) {
                value2 = g().setValue(value);
            }
            return value2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i<E> extends f<E> implements List<E> {
        private static final long serialVersionUID = 0;

        public i(List<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.List
        public void add(int index, E element) {
            synchronized (this.f33470b) {
                g().add(index, element);
            }
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends E> c11) {
            boolean addAll;
            synchronized (this.f33470b) {
                addAll = g().addAll(index, c11);
            }
            return addAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object o11) {
            boolean equals;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = g().equals(o11);
            }
            return equals;
        }

        @Override // java.util.List
        public E get(int index) {
            E e11;
            synchronized (this.f33470b) {
                e11 = g().get(index);
            }
            return e11;
        }

        @Override // com.google.common.collect.e9.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public List<E> h() {
            return (List) super.h();
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.List
        public int indexOf(@CheckForNull Object o11) {
            int indexOf;
            synchronized (this.f33470b) {
                indexOf = g().indexOf(o11);
            }
            return indexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@CheckForNull Object o11) {
            int lastIndexOf;
            synchronized (this.f33470b) {
                lastIndexOf = g().lastIndexOf(o11);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return g().listIterator();
        }

        @Override // java.util.List
        public E remove(int index) {
            E remove;
            synchronized (this.f33470b) {
                remove = g().remove(index);
            }
            return remove;
        }

        @Override // java.util.List
        public E set(int index, E element) {
            E e11;
            synchronized (this.f33470b) {
                e11 = g().set(index, element);
            }
            return e11;
        }

        @Override // java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            List<E> j11;
            synchronized (this.f33470b) {
                j11 = e9.j(g().subList(fromIndex, toIndex), this.f33470b);
            }
            return j11;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int index) {
            return g().listIterator(index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<K, V> extends l<K, V> implements p6<K, V> {
        private static final long serialVersionUID = 0;

        public j(p6<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(Object key) {
            return get((j<K, V>) key);
        }

        @Override // com.google.common.collect.e9.l
        public p6<K, V> g() {
            return (p6) super.g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
            return replaceValues((j<K, V>) key, values);
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> get(K key) {
            List<V> j11;
            synchronized (this.f33470b) {
                j11 = e9.j(h().get((p6<K, V>) key), this.f33470b);
            }
            return j11;
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> removeAll(@CheckForNull Object key) {
            List<V> removeAll;
            synchronized (this.f33470b) {
                removeAll = h().removeAll(key);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public List<V> replaceValues(K key, Iterable<? extends V> values) {
            List<V> replaceValues;
            synchronized (this.f33470b) {
                replaceValues = h().replaceValues((p6<K, V>) key, (Iterable) values);
            }
            return replaceValues;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k<K, V> extends p implements Map<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public transient Set<K> f33455c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public transient Collection<V> f33456d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public transient Set<Map.Entry<K, V>> f33457e;

        public k(Map<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f33470b) {
                g().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            boolean containsKey;
            synchronized (this.f33470b) {
                containsKey = g().containsKey(key);
            }
            return containsKey;
        }

        public boolean containsValue(@CheckForNull Object value) {
            boolean containsValue;
            synchronized (this.f33470b) {
                containsValue = g().containsValue(value);
            }
            return containsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33457e == null) {
                        this.f33457e = e9.u(g().entrySet(), this.f33470b);
                    }
                    set = this.f33457e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@CheckForNull Object o11) {
            boolean equals;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = g().equals(o11);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.p
        public Map<K, V> g() {
            return (Map) super.g();
        }

        @CheckForNull
        public V get(@CheckForNull Object key) {
            V v11;
            synchronized (this.f33470b) {
                v11 = g().get(key);
            }
            return v11;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f33470b) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33455c == null) {
                        this.f33455c = e9.u(g().keySet(), this.f33470b);
                    }
                    set = this.f33455c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        @CheckForNull
        public V put(K key, V value) {
            V put;
            synchronized (this.f33470b) {
                put = g().put(key, value);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f33470b) {
                g().putAll(map);
            }
        }

        @Override // java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object key) {
            V remove;
            synchronized (this.f33470b) {
                remove = g().remove(key);
            }
            return remove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f33470b) {
                size = g().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f33470b) {
                try {
                    if (this.f33456d == null) {
                        this.f33456d = e9.h(g().values(), this.f33470b);
                    }
                    collection = this.f33456d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p implements Serializable {

        @go.d
        @go.c
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f33469a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f33470b;

        public p(Object delegate, @CheckForNull Object mutex) {
            this.f33469a = Preconditions.checkNotNull(delegate);
            this.f33470b = mutex == null ? this : mutex;
        }

        @go.d
        @go.c
        private void writeObject(ObjectOutputStream stream) throws IOException {
            synchronized (this.f33470b) {
                stream.defaultWriteObject();
            }
        }

        /* renamed from: d */
        public Object g() {
            return this.f33469a;
        }

        public String toString() {
            String obj;
            synchronized (this.f33470b) {
                obj = this.f33469a.toString();
            }
            return obj;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q<E> extends f<E> implements Queue<E> {
        private static final long serialVersionUID = 0;

        public q(Queue<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.Queue
        public E element() {
            E element;
            synchronized (this.f33470b) {
                element = h().element();
            }
            return element;
        }

        @Override // com.google.common.collect.e9.f
        public Queue<E> h() {
            return (Queue) super.h();
        }

        @Override // java.util.Queue
        public boolean offer(E e11) {
            boolean offer;
            synchronized (this.f33470b) {
                offer = h().offer(e11);
            }
            return offer;
        }

        @Override // java.util.Queue
        @CheckForNull
        public E peek() {
            E peek;
            synchronized (this.f33470b) {
                peek = h().peek();
            }
            return peek;
        }

        @Override // java.util.Queue
        @CheckForNull
        public E poll() {
            E poll;
            synchronized (this.f33470b) {
                poll = h().poll();
            }
            return poll;
        }

        @Override // java.util.Queue
        public E remove() {
            E remove;
            synchronized (this.f33470b) {
                remove = h().remove();
            }
            return remove;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r<E> extends i<E> implements RandomAccess {
        private static final long serialVersionUID = 0;

        public r(List<E> list, @CheckForNull Object mutex) {
            super(list, mutex);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s<E> extends f<E> implements Set<E> {
        private static final long serialVersionUID = 0;

        public s(Set<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        public boolean equals(@CheckForNull Object o11) {
            boolean equals;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = h().equals(o11);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.f
        public Set<E> h() {
            return (Set) super.h();
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = h().hashCode();
            }
            return hashCode;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class t<K, V> extends l<K, V> implements p8<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        public transient Set<Map.Entry<K, V>> f33471h;

        public t(p8<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(Object key) {
            return get((t<K, V>) key);
        }

        @Override // com.google.common.collect.e9.l
        public p8<K, V> g() {
            return (p8) super.g();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
            return replaceValues((t<K, V>) key, values);
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33471h == null) {
                        this.f33471h = e9.u(h().entries(), this.f33470b);
                    }
                    set = this.f33471h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> get(K key) {
            Set<V> u11;
            synchronized (this.f33470b) {
                u11 = e9.u(h().get((p8<K, V>) key), this.f33470b);
            }
            return u11;
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> removeAll(@CheckForNull Object key) {
            Set<V> removeAll;
            synchronized (this.f33470b) {
                removeAll = h().removeAll(key);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public Set<V> replaceValues(K key, Iterable<? extends V> values) {
            Set<V> replaceValues;
            synchronized (this.f33470b) {
                replaceValues = h().replaceValues((p8<K, V>) key, (Iterable) values);
            }
            return replaceValues;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u<K, V> extends k<K, V> implements SortedMap<K, V> {
        private static final long serialVersionUID = 0;

        public u(SortedMap<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f33470b) {
                comparator = g().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K firstKey;
            synchronized (this.f33470b) {
                firstKey = g().firstKey();
            }
            return firstKey;
        }

        @Override // com.google.common.collect.e9.k
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> g() {
            return (SortedMap) super.g();
        }

        public SortedMap<K, V> headMap(K toKey) {
            SortedMap<K, V> w11;
            synchronized (this.f33470b) {
                w11 = e9.w(g().headMap(toKey), this.f33470b);
            }
            return w11;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K lastKey;
            synchronized (this.f33470b) {
                lastKey = g().lastKey();
            }
            return lastKey;
        }

        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            SortedMap<K, V> w11;
            synchronized (this.f33470b) {
                w11 = e9.w(g().subMap(fromKey, toKey), this.f33470b);
            }
            return w11;
        }

        public SortedMap<K, V> tailMap(K fromKey) {
            SortedMap<K, V> w11;
            synchronized (this.f33470b) {
                w11 = e9.w(g().tailMap(fromKey), this.f33470b);
            }
            return w11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v<E> extends s<E> implements SortedSet<E> {
        private static final long serialVersionUID = 0;

        public v(SortedSet<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f33470b) {
                comparator = g().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E first;
            synchronized (this.f33470b) {
                first = g().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E toElement) {
            SortedSet<E> x11;
            synchronized (this.f33470b) {
                x11 = e9.x(g().headSet(toElement), this.f33470b);
            }
            return x11;
        }

        @Override // com.google.common.collect.e9.s
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet<E> h() {
            return (SortedSet) super.h();
        }

        @Override // java.util.SortedSet
        public E last() {
            E last;
            synchronized (this.f33470b) {
                last = g().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E fromElement, E toElement) {
            SortedSet<E> x11;
            synchronized (this.f33470b) {
                x11 = e9.x(g().subSet(fromElement, toElement), this.f33470b);
            }
            return x11;
        }

        public SortedSet<E> tailSet(E fromElement) {
            SortedSet<E> x11;
            synchronized (this.f33470b) {
                x11 = e9.x(g().tailSet(fromElement), this.f33470b);
            }
            return x11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class w<K, V> extends t<K, V> implements a9<K, V> {
        private static final long serialVersionUID = 0;

        public w(a9<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection get(Object key) {
            return get((w<K, V>) key);
        }

        @Override // com.google.common.collect.e9.t
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a9<K, V> h() {
            return (a9) super.h();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Collection replaceValues(Object key, Iterable values) {
            return replaceValues((w<K, V>) key, values);
        }

        @Override // com.google.common.collect.a9
        @CheckForNull
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> valueComparator;
            synchronized (this.f33470b) {
                valueComparator = h().valueComparator();
            }
            return valueComparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Set get(Object key) {
            return get((w<K, V>) key);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public /* bridge */ /* synthetic */ Set replaceValues(Object key, Iterable values) {
            return replaceValues((w<K, V>) key, values);
        }

        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> get(K key) {
            SortedSet<V> x11;
            synchronized (this.f33470b) {
                x11 = e9.x(h().get((a9<K, V>) key), this.f33470b);
            }
            return x11;
        }

        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> removeAll(@CheckForNull Object key) {
            SortedSet<V> removeAll;
            synchronized (this.f33470b) {
                removeAll = h().removeAll(key);
            }
            return removeAll;
        }

        @Override // com.google.common.collect.e9.t, com.google.common.collect.e9.l, com.google.common.collect.d7, com.google.common.collect.p6
        public SortedSet<V> replaceValues(K key, Iterable<? extends V> values) {
            SortedSet<V> replaceValues;
            synchronized (this.f33470b) {
                replaceValues = h().replaceValues((a9<K, V>) key, (Iterable) values);
            }
            return replaceValues;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x<R, C, V> extends p implements f9<R, C, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ho.r<Map<C, V>, Map<C, V>> {
            public a() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> t11) {
                return e9.l(t11, x.this.f33470b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements ho.r<Map<R, V>, Map<R, V>> {
            public b() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> t11) {
                return e9.l(t11, x.this.f33470b);
            }
        }

        public x(f9<R, C, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.f9
        public Set<f9.a<R, C, V>> cellSet() {
            Set<f9.a<R, C, V>> u11;
            synchronized (this.f33470b) {
                u11 = e9.u(g().cellSet(), this.f33470b);
            }
            return u11;
        }

        @Override // com.google.common.collect.f9
        public void clear() {
            synchronized (this.f33470b) {
                g().clear();
            }
        }

        @Override // com.google.common.collect.f9
        public Map<R, V> column(@t7 C columnKey) {
            Map<R, V> l11;
            synchronized (this.f33470b) {
                l11 = e9.l(g().column(columnKey), this.f33470b);
            }
            return l11;
        }

        @Override // com.google.common.collect.f9
        public Set<C> columnKeySet() {
            Set<C> u11;
            synchronized (this.f33470b) {
                u11 = e9.u(g().columnKeySet(), this.f33470b);
            }
            return u11;
        }

        @Override // com.google.common.collect.f9
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> l11;
            synchronized (this.f33470b) {
                l11 = e9.l(u6.D0(g().columnMap(), new b()), this.f33470b);
            }
            return l11;
        }

        @Override // com.google.common.collect.f9
        public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            boolean contains;
            synchronized (this.f33470b) {
                contains = g().contains(rowKey, columnKey);
            }
            return contains;
        }

        @Override // com.google.common.collect.f9
        public boolean containsColumn(@CheckForNull Object columnKey) {
            boolean containsColumn;
            synchronized (this.f33470b) {
                containsColumn = g().containsColumn(columnKey);
            }
            return containsColumn;
        }

        @Override // com.google.common.collect.f9
        public boolean containsRow(@CheckForNull Object rowKey) {
            boolean containsRow;
            synchronized (this.f33470b) {
                containsRow = g().containsRow(rowKey);
            }
            return containsRow;
        }

        @Override // com.google.common.collect.f9
        public boolean containsValue(@CheckForNull Object value) {
            boolean containsValue;
            synchronized (this.f33470b) {
                containsValue = g().containsValue(value);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.f9
        public boolean equals(@CheckForNull Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = g().equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.p
        public f9<R, C, V> g() {
            return (f9) super.g();
        }

        @Override // com.google.common.collect.f9
        @CheckForNull
        public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            V v11;
            synchronized (this.f33470b) {
                v11 = g().get(rowKey, columnKey);
            }
            return v11;
        }

        @Override // com.google.common.collect.f9
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.f9
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f33470b) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.f9
        @CheckForNull
        public V put(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
            V put;
            synchronized (this.f33470b) {
                put = g().put(rowKey, columnKey, value);
            }
            return put;
        }

        @Override // com.google.common.collect.f9
        public void putAll(f9<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.f33470b) {
                g().putAll(table);
            }
        }

        @Override // com.google.common.collect.f9
        @CheckForNull
        public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            V remove;
            synchronized (this.f33470b) {
                remove = g().remove(rowKey, columnKey);
            }
            return remove;
        }

        @Override // com.google.common.collect.f9
        public Map<C, V> row(@t7 R rowKey) {
            Map<C, V> l11;
            synchronized (this.f33470b) {
                l11 = e9.l(g().row(rowKey), this.f33470b);
            }
            return l11;
        }

        @Override // com.google.common.collect.f9
        public Set<R> rowKeySet() {
            Set<R> u11;
            synchronized (this.f33470b) {
                u11 = e9.u(g().rowKeySet(), this.f33470b);
            }
            return u11;
        }

        @Override // com.google.common.collect.f9
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> l11;
            synchronized (this.f33470b) {
                l11 = e9.l(u6.D0(g().rowMap(), new a()), this.f33470b);
            }
            return l11;
        }

        @Override // com.google.common.collect.f9
        public int size() {
            int size;
            synchronized (this.f33470b) {
                size = g().size();
            }
            return size;
        }

        @Override // com.google.common.collect.f9
        public Collection<V> values() {
            Collection<V> h11;
            synchronized (this.f33470b) {
                h11 = e9.h(g().values(), this.f33470b);
            }
            return h11;
        }
    }

    public static <E> Collection<E> A(Collection<E> collection, @CheckForNull Object mutex) {
        return collection instanceof SortedSet ? x((SortedSet) collection, mutex) : collection instanceof Set ? u((Set) collection, mutex) : collection instanceof List ? j((List) collection, mutex) : h(collection, mutex);
    }

    public static <E> Set<E> B(Set<E> set, @CheckForNull Object mutex) {
        return set instanceof SortedSet ? x((SortedSet) set, mutex) : u(set, mutex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> com.google.common.collect.u<K, V> g(com.google.common.collect.u<K, V> uVar, @CheckForNull Object obj) {
        return !(uVar instanceof e) ? uVar instanceof ImmutableBiMap ? uVar : new e(uVar, obj, null) : uVar;
    }

    public static <E> Collection<E> h(Collection<E> collection, @CheckForNull Object mutex) {
        return new f(collection, mutex);
    }

    public static <E> Deque<E> i(Deque<E> deque, @CheckForNull Object mutex) {
        return new g(deque, mutex);
    }

    public static <E> List<E> j(List<E> list, @CheckForNull Object mutex) {
        return list instanceof RandomAccess ? new r(list, mutex) : new i(list, mutex);
    }

    public static <K, V> p6<K, V> k(p6<K, V> multimap, @CheckForNull Object mutex) {
        return !(multimap instanceof j) ? multimap instanceof com.google.common.collect.t ? multimap : new j(multimap, mutex) : multimap;
    }

    @go.e
    public static <K, V> Map<K, V> l(Map<K, V> map, @CheckForNull Object mutex) {
        return new k(map, mutex);
    }

    public static <K, V> d7<K, V> m(d7<K, V> multimap, @CheckForNull Object mutex) {
        return !(multimap instanceof l) ? multimap instanceof com.google.common.collect.t ? multimap : new l(multimap, mutex) : multimap;
    }

    public static <E> j7<E> n(j7<E> multiset, @CheckForNull Object mutex) {
        return !(multiset instanceof m) ? multiset instanceof ImmutableMultiset ? multiset : new m(multiset, mutex) : multiset;
    }

    @go.c
    public static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return p(navigableMap, null);
    }

    @go.c
    public static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @CheckForNull Object mutex) {
        return new n(navigableMap, mutex);
    }

    @go.c
    public static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return r(navigableSet, null);
    }

    @go.c
    public static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @CheckForNull Object mutex) {
        return new o(navigableSet, mutex);
    }

    @go.c
    @CheckForNull
    public static <K, V> Map.Entry<K, V> s(@CheckForNull Map.Entry<K, V> entry, @CheckForNull Object mutex) {
        if (entry == null) {
            return null;
        }
        return new h(entry, mutex);
    }

    public static <E> Queue<E> t(Queue<E> queue, @CheckForNull Object mutex) {
        return queue instanceof q ? queue : new q(queue, mutex);
    }

    @go.e
    public static <E> Set<E> u(Set<E> set, @CheckForNull Object mutex) {
        return new s(set, mutex);
    }

    public static <K, V> p8<K, V> v(p8<K, V> multimap, @CheckForNull Object mutex) {
        return !(multimap instanceof t) ? multimap instanceof com.google.common.collect.t ? multimap : new t(multimap, mutex) : multimap;
    }

    public static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @CheckForNull Object mutex) {
        return new u(sortedMap, mutex);
    }

    public static <E> SortedSet<E> x(SortedSet<E> set, @CheckForNull Object mutex) {
        return new v(set, mutex);
    }

    public static <K, V> a9<K, V> y(a9<K, V> multimap, @CheckForNull Object mutex) {
        return multimap instanceof w ? multimap : new w(multimap, mutex);
    }

    public static <R, C, V> f9<R, C, V> z(f9<R, C, V> table, @CheckForNull Object mutex) {
        return new x(table, mutex);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<K, V> extends s<Map.Entry<K, Collection<V>>> {
        private static final long serialVersionUID = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends v9<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.e9$c$a$a, reason: collision with other inner class name */
            public class C0397a extends x4<K, Collection<V>> {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f33450a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f33451b;

                public C0397a(final a this$1, final Map.Entry val$entry) {
                    this.f33450a = val$entry;
                    this.f33451b = this$1;
                }

                @Override // com.google.common.collect.x4, com.google.common.collect.c5
                /* renamed from: w */
                public Map.Entry<K, Collection<V>> delegate() {
                    return this.f33450a;
                }

                @Override // com.google.common.collect.x4, java.util.Map.Entry
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return e9.A((Collection) this.f33450a.getValue(), c.this.f33470b);
                }
            }

            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> a(final Map.Entry<K, Collection<V>> entry) {
                return new C0397a(this, entry);
            }
        }

        public c(Set<Map.Entry<K, Collection<V>>> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            boolean p11;
            synchronized (this.f33470b) {
                p11 = u6.p(h(), o11);
            }
            return p11;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c11) {
            boolean b11;
            synchronized (this.f33470b) {
                b11 = y2.b(h(), c11);
            }
            return b11;
        }

        @Override // com.google.common.collect.e9.s, java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object o11) {
            boolean g11;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                g11 = q8.g(h(), o11);
            }
            return g11;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            boolean k02;
            synchronized (this.f33470b) {
                k02 = u6.k0(h(), o11);
            }
            return k02;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            boolean U;
            synchronized (this.f33470b) {
                U = l6.U(h().iterator(), c11);
            }
            return U;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c11) {
            boolean W;
            synchronized (this.f33470b) {
                W = l6.W(h().iterator(), c11);
            }
            return W;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] l11;
            synchronized (this.f33470b) {
                l11 = p7.l(h());
            }
            return l11;
        }

        @Override // com.google.common.collect.e9.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f33470b) {
                tArr2 = (T[]) p7.m(h(), tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l<K, V> extends p implements d7<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public transient Set<K> f33458c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public transient Collection<V> f33459d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public transient Collection<Map.Entry<K, V>> f33460e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public transient Map<K, Collection<V>> f33461f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public transient j7<K> f33462g;

        public l(d7<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.f33470b) {
                try {
                    if (this.f33461f == null) {
                        this.f33461f = new b(g().asMap(), this.f33470b);
                    }
                    map = this.f33461f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }

        @Override // com.google.common.collect.d7
        public void clear() {
            synchronized (this.f33470b) {
                g().clear();
            }
        }

        @Override // com.google.common.collect.d7
        public boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
            boolean containsEntry;
            synchronized (this.f33470b) {
                containsEntry = g().containsEntry(key, value);
            }
            return containsEntry;
        }

        @Override // com.google.common.collect.d7
        public boolean containsKey(@CheckForNull Object key) {
            boolean containsKey;
            synchronized (this.f33470b) {
                containsKey = g().containsKey(key);
            }
            return containsKey;
        }

        @Override // com.google.common.collect.d7
        public boolean containsValue(@CheckForNull Object value) {
            boolean containsValue;
            synchronized (this.f33470b) {
                containsValue = g().containsValue(value);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.d7
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f33470b) {
                try {
                    if (this.f33460e == null) {
                        this.f33460e = e9.A(g().entries(), this.f33470b);
                    }
                    collection = this.f33460e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.d7, com.google.common.collect.p6
        public boolean equals(@CheckForNull Object o11) {
            boolean equals;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = g().equals(o11);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.p
        public d7<K, V> g() {
            return (d7) super.g();
        }

        public Collection<V> get(@t7 K key) {
            Collection<V> A;
            synchronized (this.f33470b) {
                A = e9.A(g().get(key), this.f33470b);
            }
            return A;
        }

        @Override // com.google.common.collect.d7
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.d7
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f33470b) {
                isEmpty = g().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.d7
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33458c == null) {
                        this.f33458c = e9.B(g().keySet(), this.f33470b);
                    }
                    set = this.f33458c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.d7
        public j7<K> keys() {
            j7<K> j7Var;
            synchronized (this.f33470b) {
                try {
                    if (this.f33462g == null) {
                        this.f33462g = e9.n(g().keys(), this.f33470b);
                    }
                    j7Var = this.f33462g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j7Var;
        }

        @Override // com.google.common.collect.d7
        public boolean put(@t7 K key, @t7 V value) {
            boolean put;
            synchronized (this.f33470b) {
                put = g().put(key, value);
            }
            return put;
        }

        @Override // com.google.common.collect.d7
        public boolean putAll(@t7 K key, Iterable<? extends V> values) {
            boolean putAll;
            synchronized (this.f33470b) {
                putAll = g().putAll(key, values);
            }
            return putAll;
        }

        @Override // com.google.common.collect.d7
        public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
            boolean remove;
            synchronized (this.f33470b) {
                remove = g().remove(key, value);
            }
            return remove;
        }

        public Collection<V> removeAll(@CheckForNull Object key) {
            Collection<V> removeAll;
            synchronized (this.f33470b) {
                removeAll = g().removeAll(key);
            }
            return removeAll;
        }

        public Collection<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
            Collection<V> replaceValues;
            synchronized (this.f33470b) {
                replaceValues = g().replaceValues(key, values);
            }
            return replaceValues;
        }

        @Override // com.google.common.collect.d7
        public int size() {
            int size;
            synchronized (this.f33470b) {
                size = g().size();
            }
            return size;
        }

        @Override // com.google.common.collect.d7
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f33470b) {
                try {
                    if (this.f33459d == null) {
                        this.f33459d = e9.h(g().values(), this.f33470b);
                    }
                    collection = this.f33459d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.d7
        public boolean putAll(d7<? extends K, ? extends V> multimap) {
            boolean putAll;
            synchronized (this.f33470b) {
                putAll = g().putAll(multimap);
            }
            return putAll;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m<E> extends f<E> implements j7<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public transient Set<E> f33463c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public transient Set<j7.a<E>> f33464d;

        public m(j7<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // com.google.common.collect.j7
        public int add(@t7 E e11, int n11) {
            int add;
            synchronized (this.f33470b) {
                add = g().add(e11, n11);
            }
            return add;
        }

        @Override // com.google.common.collect.j7
        public int count(@CheckForNull Object o11) {
            int count;
            synchronized (this.f33470b) {
                count = g().count(o11);
            }
            return count;
        }

        @Override // com.google.common.collect.j7
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33463c == null) {
                        this.f33463c = e9.B(g().elementSet(), this.f33470b);
                    }
                    set = this.f33463c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.j7
        public Set<j7.a<E>> entrySet() {
            Set<j7.a<E>> set;
            synchronized (this.f33470b) {
                try {
                    if (this.f33464d == null) {
                        this.f33464d = e9.B(g().entrySet(), this.f33470b);
                    }
                    set = this.f33464d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.j7
        public boolean equals(@CheckForNull Object o11) {
            boolean equals;
            if (o11 == this) {
                return true;
            }
            synchronized (this.f33470b) {
                equals = g().equals(o11);
            }
            return equals;
        }

        @Override // com.google.common.collect.e9.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public j7<E> h() {
            return (j7) super.h();
        }

        @Override // java.util.Collection, com.google.common.collect.j7
        public int hashCode() {
            int hashCode;
            synchronized (this.f33470b) {
                hashCode = g().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.j7
        public int remove(@CheckForNull Object o11, int n11) {
            int remove;
            synchronized (this.f33470b) {
                remove = g().remove(o11, n11);
            }
            return remove;
        }

        @Override // com.google.common.collect.j7
        public int setCount(@t7 E element, int count) {
            int count2;
            synchronized (this.f33470b) {
                count2 = g().setCount(element, count);
            }
            return count2;
        }

        @Override // com.google.common.collect.j7
        public boolean setCount(@t7 E element, int oldCount, int newCount) {
            boolean count;
            synchronized (this.f33470b) {
                count = g().setCount(element, oldCount, newCount);
            }
            return count;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    @go.e
    public static final class n<K, V> extends u<K, V> implements NavigableMap<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public transient NavigableSet<K> f33465f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public transient NavigableMap<K, V> f33466g;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        public transient NavigableSet<K> f33467h;

        public n(NavigableMap<K, V> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(K key) {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().ceilingEntry(key), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(K key) {
            K ceilingKey;
            synchronized (this.f33470b) {
                ceilingKey = h().ceilingKey(key);
            }
            return ceilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f33470b) {
                try {
                    NavigableSet<K> navigableSet = this.f33465f;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> r11 = e9.r(h().descendingKeySet(), this.f33470b);
                    this.f33465f = r11;
                    return r11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f33470b) {
                try {
                    NavigableMap<K, V> navigableMap = this.f33466g;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> p11 = e9.p(h().descendingMap(), this.f33470b);
                    this.f33466g = p11;
                    return p11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().firstEntry(), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(K key) {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().floorEntry(key), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(K key) {
            K floorKey;
            synchronized (this.f33470b) {
                floorKey = h().floorKey(key);
            }
            return floorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
            NavigableMap<K, V> p11;
            synchronized (this.f33470b) {
                p11 = e9.p(h().headMap(toKey, inclusive), this.f33470b);
            }
            return p11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(K key) {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().higherEntry(key), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(K key) {
            K higherKey;
            synchronized (this.f33470b) {
                higherKey = h().higherKey(key);
            }
            return higherKey;
        }

        @Override // com.google.common.collect.e9.u
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> g() {
            return (NavigableMap) super.g();
        }

        @Override // com.google.common.collect.e9.k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().lastEntry(), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(K key) {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().lowerEntry(key), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(K key) {
            K lowerKey;
            synchronized (this.f33470b) {
                lowerKey = h().lowerKey(key);
            }
            return lowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f33470b) {
                try {
                    NavigableSet<K> navigableSet = this.f33467h;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> r11 = e9.r(h().navigableKeySet(), this.f33470b);
                    this.f33467h = r11;
                    return r11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().pollFirstEntry(), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> s11;
            synchronized (this.f33470b) {
                s11 = e9.s(h().pollLastEntry(), this.f33470b);
            }
            return s11;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
            NavigableMap<K, V> p11;
            synchronized (this.f33470b) {
                p11 = e9.p(h().subMap(fromKey, fromInclusive, toKey, toInclusive), this.f33470b);
            }
            return p11;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
            NavigableMap<K, V> p11;
            synchronized (this.f33470b) {
                p11 = e9.p(h().tailMap(fromKey, inclusive), this.f33470b);
            }
            return p11;
        }

        @Override // com.google.common.collect.e9.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K toKey) {
            return headMap(toKey, false);
        }

        @Override // com.google.common.collect.e9.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K fromKey, K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.e9.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    @go.e
    public static final class o<E> extends v<E> implements NavigableSet<E> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public transient NavigableSet<E> f33468c;

        public o(NavigableSet<E> delegate, @CheckForNull Object mutex) {
            super(delegate, mutex);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(E e11) {
            E ceiling;
            synchronized (this.f33470b) {
                ceiling = g().ceiling(e11);
            }
            return ceiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return g().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f33470b) {
                try {
                    NavigableSet<E> navigableSet = this.f33468c;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> r11 = e9.r(g().descendingSet(), this.f33470b);
                    this.f33468c = r11;
                    return r11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(E e11) {
            E floor;
            synchronized (this.f33470b) {
                floor = g().floor(e11);
            }
            return floor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E toElement, boolean inclusive) {
            NavigableSet<E> r11;
            synchronized (this.f33470b) {
                r11 = e9.r(g().headSet(toElement, inclusive), this.f33470b);
            }
            return r11;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(E e11) {
            E higher;
            synchronized (this.f33470b) {
                higher = g().higher(e11);
            }
            return higher;
        }

        @Override // com.google.common.collect.e9.v
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(E e11) {
            E lower;
            synchronized (this.f33470b) {
                lower = g().lower(e11);
            }
            return lower;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            E pollFirst;
            synchronized (this.f33470b) {
                pollFirst = g().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            E pollLast;
            synchronized (this.f33470b) {
                pollLast = g().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
            NavigableSet<E> r11;
            synchronized (this.f33470b) {
                r11 = e9.r(g().subSet(fromElement, fromInclusive, toElement, toInclusive), this.f33470b);
            }
            return r11;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
            NavigableSet<E> r11;
            synchronized (this.f33470b) {
                r11 = e9.r(g().tailSet(fromElement, inclusive), this.f33470b);
            }
            return r11;
        }

        @Override // com.google.common.collect.e9.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E toElement) {
            return headSet(toElement, false);
        }

        @Override // com.google.common.collect.e9.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E fromElement) {
            return tailSet(fromElement, true);
        }

        @Override // com.google.common.collect.e9.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E fromElement, E toElement) {
            return subSet(fromElement, true, toElement, false);
        }
    }
}
