package com.google.common.collect;

import a00.a0;
import com.baicizhan.client.business.dataset.provider.a;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.q8;
import com.google.common.collect.r6;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class u6 {

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<V1, V2> implements ho.r<V1, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f33950a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f33951b;

        public a(final t val$transformer, final Object val$key) {
            this.f33950a = val$transformer;
            this.f33951b = val$key;
        }

        @Override // ho.r
        @t7
        public V2 apply(@t7 V1 v12) {
            return (V2) this.f33950a.a(this.f33951b, v12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a0<K, V> extends AbstractMap<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, V> g() {
                return a0.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a0.this.b();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> b();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            l6.g(b());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<K, V1, V2> implements ho.r<Map.Entry<K, V1>, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f33953a;

        public b(final t val$transformer) {
            this.f33953a = val$transformer;
        }

        @Override // ho.r
        @t7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.f33953a.a(entry.getKey(), entry.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0<K, V> extends q8.k<K> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final Map<K, V> f33954a;

        public b0(Map<K, V> map) {
            this.f33954a = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return h().containsKey(o11);
        }

        /* renamed from: g */
        public Map<K, V> h() {
            return this.f33954a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return u6.S(h().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            if (!contains(o11)) {
                return false;
            }
            h().remove(o11);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<K, V2> extends com.google.common.collect.g<K, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f33955a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f33956b;

        public c(final Map.Entry val$entry, final t val$transformer) {
            this.f33955a = val$entry;
            this.f33956b = val$transformer;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getKey() {
            return (K) this.f33955a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V2 getValue() {
            return (V2) this.f33956b.a(this.f33955a.getKey(), this.f33955a.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c0<K, V> implements r6<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f33957a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V> f33958b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<K, V> f33959c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<K, r6.a<V>> f33960d;

        public c0(Map<K, V> onlyOnLeft, Map<K, V> onlyOnRight, Map<K, V> onBoth, Map<K, r6.a<V>> differences) {
            this.f33957a = u6.N0(onlyOnLeft);
            this.f33958b = u6.N0(onlyOnRight);
            this.f33959c = u6.N0(onBoth);
            this.f33960d = u6.N0(differences);
        }

        @Override // com.google.common.collect.r6
        public Map<K, r6.a<V>> a() {
            return this.f33960d;
        }

        @Override // com.google.common.collect.r6
        public Map<K, V> b() {
            return this.f33958b;
        }

        @Override // com.google.common.collect.r6
        public Map<K, V> c() {
            return this.f33957a;
        }

        @Override // com.google.common.collect.r6
        public Map<K, V> d() {
            return this.f33959c;
        }

        @Override // com.google.common.collect.r6
        public boolean e() {
            return this.f33957a.isEmpty() && this.f33958b.isEmpty() && this.f33960d.isEmpty();
        }

        @Override // com.google.common.collect.r6
        public boolean equals(@CheckForNull Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof r6) {
                r6 r6Var = (r6) object;
                if (c().equals(r6Var.c()) && b().equals(r6Var.b()) && d().equals(r6Var.d()) && a().equals(r6Var.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.r6
        public int hashCode() {
            return ho.d0.b(c(), b(), d(), a());
        }

        public String toString() {
            if (e()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f33957a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f33957a);
            }
            if (!this.f33958b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f33958b);
            }
            if (!this.f33960d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f33960d);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<K, V1, V2> implements ho.r<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f33961a;

        public d(final t val$transformer) {
            this.f33961a = val$transformer;
        }

        @Override // ho.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(final Map.Entry<K, V1> entry) {
            return u6.C0(this.f33961a, entry);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static final class d0<K, V> extends com.google.common.collect.j<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableSet<K> f33962a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.r<? super K, V> f33963b;

        public d0(NavigableSet<K> ks2, ho.r<? super K, V> vFunction) {
            this.f33962a = (NavigableSet) Preconditions.checkNotNull(ks2);
            this.f33963b = (ho.r) Preconditions.checkNotNull(vFunction);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<K, V>> b() {
            return u6.m(this.f33962a, this.f33963b);
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f33962a.clear();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return this.f33962a.comparator();
        }

        @Override // com.google.common.collect.j
        public Iterator<Map.Entry<K, V>> d() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return u6.k(this.f33962a.descendingSet(), this.f33963b);
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            if (y2.j(this.f33962a, key)) {
                return this.f33963b.apply(key);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@t7 K toKey, boolean inclusive) {
            return u6.k(this.f33962a.headSet(toKey, inclusive), this.f33963b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return u6.l0(this.f33962a);
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33962a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return u6.k(this.f33962a.subSet(fromKey, fromInclusive, toKey, toInclusive), this.f33963b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@t7 K fromKey, boolean inclusive) {
            return u6.k(this.f33962a.tailSet(fromKey, inclusive), this.f33963b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<K, V> extends v9<Map.Entry<K, V>, K> {
        public e(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // com.google.common.collect.v9
        @t7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class e0<K, V> extends g0<K, V> implements NavigableSet<K> {
        public e0(NavigableMap<K, V> map) {
            super(map);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K ceiling(@t7 K e11) {
            return g().ceilingKey(e11);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return g().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K floor(@t7 K e11) {
            return g().floorKey(e11);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@t7 K toElement, boolean inclusive) {
            return g().headMap(toElement, inclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K higher(@t7 K e11) {
            return g().higherKey(e11);
        }

        @Override // com.google.common.collect.u6.g0
        /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> h() {
            return (NavigableMap) this.f33954a;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K lower(@t7 K e11) {
            return g().lowerKey(e11);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollFirst() {
            return (K) u6.T(g().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public K pollLast() {
            return (K) u6.T(g().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@t7 K fromElement, boolean fromInclusive, @t7 K toElement, boolean toInclusive) {
            return g().subMap(fromElement, fromInclusive, toElement, toInclusive).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@t7 K fromElement, boolean inclusive) {
            return g().tailMap(fromElement, inclusive).navigableKeySet();
        }

        @Override // com.google.common.collect.u6.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@t7 K toElement) {
            return headSet(toElement, false);
        }

        @Override // com.google.common.collect.u6.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@t7 K fromElement, @t7 K toElement) {
            return subSet(fromElement, true, toElement, false);
        }

        @Override // com.google.common.collect.u6.g0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@t7 K fromElement) {
            return tailSet(fromElement, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<K, V> extends v9<Map.Entry<K, V>, V> {
        public f(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // com.google.common.collect.v9
        @t7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f0<K, V> extends o<K, V> implements SortedMap<K, V> {
        public f0(SortedSet<K> set, ho.r<? super K, V> function) {
            super(set, function);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedMap
        @t7
        public K firstKey() {
            return h().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@t7 K toKey) {
            return u6.l(h().headSet(toKey), this.f33981e);
        }

        @Override // com.google.common.collect.u6.o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> h() {
            return (SortedSet) super.h();
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: keySet */
        public Set<K> l() {
            return u6.n0(h());
        }

        @Override // java.util.SortedMap
        @t7
        public K lastKey() {
            return h().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
            return u6.l(h().subSet(fromKey, toKey), this.f33981e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@t7 K fromKey) {
            return u6.l(h().tailSet(fromKey), this.f33981e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g<K, V> extends v9<K, Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ho.r f33964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Iterator backingIterator, final ho.r val$function) {
            super(backingIterator);
            this.f33964b = val$function;
        }

        @Override // com.google.common.collect.v9
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(@t7 final K key) {
            return u6.O(key, this.f33964b.apply(key));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g0<K, V> extends b0<K, V> implements SortedSet<K> {
        public g0(SortedMap<K, V> map) {
            super(map);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        @Override // java.util.SortedSet
        @t7
        public K first() {
            return h().firstKey();
        }

        @Override // com.google.common.collect.u6.b0
        public SortedMap<K, V> h() {
            return (SortedMap) super.h();
        }

        public SortedSet<K> headSet(@t7 K toElement) {
            return new g0(h().headMap(toElement));
        }

        @Override // java.util.SortedSet
        @t7
        public K last() {
            return h().lastKey();
        }

        public SortedSet<K> subSet(@t7 K fromElement, @t7 K toElement) {
            return new g0(h().subMap(fromElement, toElement));
        }

        public SortedSet<K> tailSet(@t7 K fromElement) {
            return new g0(h().tailMap(fromElement));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h0<K, V> extends c0<K, V> implements w8<K, V> {
        public h0(SortedMap<K, V> onlyOnLeft, SortedMap<K, V> onlyOnRight, SortedMap<K, V> onBoth, SortedMap<K, r6.a<V>> differences) {
            super(onlyOnLeft, onlyOnRight, onBoth, differences);
        }

        @Override // com.google.common.collect.u6.c0, com.google.common.collect.r6
        public SortedMap<K, r6.a<V>> a() {
            return (SortedMap) super.a();
        }

        @Override // com.google.common.collect.u6.c0, com.google.common.collect.r6
        public SortedMap<K, V> b() {
            return (SortedMap) super.b();
        }

        @Override // com.google.common.collect.u6.c0, com.google.common.collect.r6
        public SortedMap<K, V> c() {
            return (SortedMap) super.c();
        }

        @Override // com.google.common.collect.u6.c0, com.google.common.collect.r6
        public SortedMap<K, V> d() {
            return (SortedMap) super.d();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i<E> extends i5<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SortedSet f33966a;

        public i(final SortedSet val$set) {
            this.f33966a = val$set;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends E> es2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> headSet(@t7 E toElement) {
            return u6.n0(super.headSet(toElement));
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
            return u6.n0(super.subSet(fromElement, toElement));
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> tailSet(@t7 E fromElement) {
            return u6.n0(super.tailSet(fromElement));
        }

        @Override // com.google.common.collect.i5, com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> delegate() {
            return this.f33966a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i0<K, V1, V2> extends a0<K, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V1> f33967a;

        /* renamed from: b, reason: collision with root package name */
        public final t<? super K, ? super V1, V2> f33968b;

        public i0(Map<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            this.f33967a = (Map) Preconditions.checkNotNull(fromMap);
            this.f33968b = (t) Preconditions.checkNotNull(transformer);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<K, V2>> b() {
            return l6.b0(this.f33967a.entrySet().iterator(), u6.g(this.f33968b));
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f33967a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33967a.containsKey(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V2 get(@CheckForNull Object obj) {
            V1 v12 = this.f33967a.get(obj);
            if (v12 != null || this.f33967a.containsKey(obj)) {
                return this.f33968b.a(obj, (Object) m7.a(v12));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f33967a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V2 remove(@CheckForNull Object obj) {
            if (this.f33967a.containsKey(obj)) {
                return this.f33968b.a(obj, (Object) m7.a(this.f33967a.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33967a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new q0(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j<E> extends b5<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavigableSet f33969a;

        public j(final NavigableSet val$set) {
            this.f33969a = val$set;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends E> es2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return u6.l0(super.descendingSet());
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> headSet(@t7 E toElement) {
            return u6.n0(super.headSet(toElement));
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> subSet(@t7 E fromElement, @t7 E toElement) {
            return u6.n0(super.subSet(fromElement, toElement));
        }

        @Override // com.google.common.collect.i5, java.util.SortedSet
        public SortedSet<E> tailSet(@t7 E fromElement) {
            return u6.n0(super.tailSet(fromElement));
        }

        @Override // com.google.common.collect.b5, com.google.common.collect.i5
        /* renamed from: y */
        public NavigableSet<E> delegate() {
            return this.f33969a;
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> headSet(@t7 E toElement, boolean inclusive) {
            return u6.l0(super.headSet(toElement, inclusive));
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> subSet(@t7 E fromElement, boolean fromInclusive, @t7 E toElement, boolean toInclusive) {
            return u6.l0(super.subSet(fromElement, fromInclusive, toElement, toInclusive));
        }

        @Override // com.google.common.collect.b5, java.util.NavigableSet
        public NavigableSet<E> tailSet(@t7 E fromElement, boolean inclusive) {
            return u6.l0(super.tailSet(fromElement, inclusive));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class j0<K, V1, V2> extends k0<K, V1, V2> implements NavigableMap<K, V2> {
        public j0(NavigableMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> ceilingEntry(@t7 K key) {
            return k(d().ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@t7 K key) {
            return d().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return d().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return u6.A0(d().descendingMap(), this.f33968b);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> firstEntry() {
            return k(d().firstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> floorEntry(@t7 K key) {
            return k(d().floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@t7 K key) {
            return d().floorKey(key);
        }

        @Override // com.google.common.collect.u6.k0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> d() {
            return (NavigableMap) super.d();
        }

        @Override // com.google.common.collect.u6.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(@t7 K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> higherEntry(@t7 K key) {
            return k(d().higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@t7 K key) {
            return d().higherKey(key);
        }

        @Override // com.google.common.collect.u6.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(@t7 K fromKey, @t7 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.u6.k0, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(@t7 K fromKey) {
            return tailMap(fromKey, true);
        }

        @CheckForNull
        public final Map.Entry<K, V2> k(@CheckForNull Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return u6.C0(this.f33968b, entry);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> lastEntry() {
            return k(d().lastEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> lowerEntry(@t7 K key) {
            return k(d().lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@t7 K key) {
            return d().lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return d().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> pollFirstEntry() {
            return k(d().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V2> pollLastEntry() {
            return k(d().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@t7 K toKey, boolean inclusive) {
            return u6.A0(d().headMap(toKey, inclusive), this.f33968b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return u6.A0(d().subMap(fromKey, fromInclusive, toKey, toInclusive), this.f33968b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@t7 K fromKey, boolean inclusive) {
            return u6.A0(d().tailMap(fromKey, inclusive), this.f33968b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k<K, V> extends com.google.common.collect.g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f33970a;

        public k(final Map.Entry val$entry) {
            this.f33970a = val$entry;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getKey() {
            return (K) this.f33970a.getKey();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V getValue() {
            return (V) this.f33970a.getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k0<K, V1, V2> extends i0<K, V1, V2> implements SortedMap<K, V2> {
        public k0(SortedMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
            super(fromMap, transformer);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, V1> d() {
            return (SortedMap) this.f33967a;
        }

        @Override // java.util.SortedMap
        @t7
        public K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, V2> headMap(@t7 K toKey) {
            return u6.B0(d().headMap(toKey), this.f33968b);
        }

        @Override // java.util.SortedMap
        @t7
        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, V2> subMap(@t7 K fromKey, @t7 K toKey) {
            return u6.B0(d().subMap(fromKey, toKey), this.f33968b);
        }

        public SortedMap<K, V2> tailMap(@t7 K fromKey) {
            return u6.B0(d().tailMap(fromKey), this.f33968b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l<K, V> extends aa<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f33971a;

        public l(final Iterator val$entryIterator) {
            this.f33971a = val$entryIterator;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return u6.K0((Map.Entry) this.f33971a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33971a.hasNext();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l0<K, V> extends w4<K, V> implements com.google.common.collect.u<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f33972a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.common.collect.u<? extends K, ? extends V> f33973b;

        /* renamed from: c, reason: collision with root package name */
        @RetainedWith
        @CheckForNull
        @vo.b
        public com.google.common.collect.u<V, K> f33974c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<V> f33975d;

        public l0(com.google.common.collect.u<? extends K, ? extends V> delegate, @CheckForNull com.google.common.collect.u<V, K> inverse) {
            this.f33972a = Collections.unmodifiableMap(delegate);
            this.f33973b = delegate;
            this.f33974c = inverse;
        }

        @Override // com.google.common.collect.u
        @CheckForNull
        public V forcePut(@t7 K key, @t7 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.u
        public com.google.common.collect.u<V, K> inverse() {
            com.google.common.collect.u<V, K> uVar = this.f33974c;
            if (uVar != null) {
                return uVar;
            }
            l0 l0Var = new l0(this.f33973b.inverse(), this);
            this.f33974c = l0Var;
            return l0Var;
        }

        @Override // com.google.common.collect.w4, com.google.common.collect.c5
        public Map<K, V> delegate() {
            return this.f33972a;
        }

        @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
        public Set<V> values() {
            Set<V> set = this.f33975d;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.f33973b.values());
            this.f33975d = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m<K, V1, V2> implements t<K, V1, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ho.r f33976a;

        public m(final ho.r val$function) {
            this.f33976a = val$function;
        }

        @Override // com.google.common.collect.u6.t
        @t7
        public V2 a(@t7 K k11, @t7 V1 v12) {
            return (V2) this.f33976a.apply(v12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m0<K, V> extends l4<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Collection<Map.Entry<K, V>> f33977a;

        public m0(Collection<Map.Entry<K, V>> entries) {
            this.f33977a = entries;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return u6.L0(this.f33977a.iterator());
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.l4, com.google.common.collect.c5
        public Collection<Map.Entry<K, V>> delegate() {
            return this.f33977a;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class n<K, V> extends r0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public final Map<K, V> f33978d;

        /* renamed from: e, reason: collision with root package name */
        public final ho.i0<? super Map.Entry<K, V>> f33979e;

        public n(Map<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> predicate) {
            this.f33978d = unfiltered;
            this.f33979e = predicate;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33978d.containsKey(key) && h(key, this.f33978d.get(key));
        }

        @Override // com.google.common.collect.u6.r0
        public Collection<V> g() {
            return new z(this, this.f33978d, this.f33979e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            V v11 = this.f33978d.get(key);
            if (v11 == null || !h(key, v11)) {
                return null;
            }
            return v11;
        }

        public boolean h(@CheckForNull Object key, @t7 V value) {
            return this.f33979e.apply(u6.O(key, value));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(@t7 K key, @t7 V value) {
            Preconditions.checkArgument(h(key, value));
            return this.f33978d.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.checkArgument(h(entry.getKey(), entry.getValue()));
            }
            this.f33978d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object key) {
            if (containsKey(key)) {
                return this.f33978d.remove(key);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n0<K, V> extends m0<K, V> implements Set<Map.Entry<K, V>> {
        public n0(Set<Map.Entry<K, V>> entries) {
            super(entries);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object object) {
            return q8.g(this, object);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return q8.k(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o<K, V> extends r0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public final Set<K> f33980d;

        /* renamed from: e, reason: collision with root package name */
        public final ho.r<? super K, V> f33981e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, V> g() {
                return o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return u6.m(o.this.h(), o.this.f33981e);
            }
        }

        public o(Set<K> set, ho.r<? super K, V> function) {
            this.f33980d = (Set) Preconditions.checkNotNull(set);
            this.f33981e = (ho.r) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, V>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            h().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return h().contains(key);
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: d */
        public Set<K> k() {
            return u6.m0(h());
        }

        @Override // com.google.common.collect.u6.r0
        public Collection<V> g() {
            return y2.m(this.f33980d, this.f33981e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            if (y2.j(h(), key)) {
                return this.f33981e.apply(key);
            }
            return null;
        }

        public Set<K> h() {
            return this.f33980d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object key) {
            if (h().remove(key)) {
                return this.f33981e.apply(key);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return h().size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class o0<K, V> extends g5<K, V> implements NavigableMap<K, V>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<K, ? extends V> f33983a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient o0<K, V> f33984b;

        public o0(NavigableMap<K, ? extends V> delegate) {
            this.f33983a = delegate;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(@t7 K key) {
            return u6.P0(this.f33983a.ceilingEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@t7 K key) {
            return this.f33983a.ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return q8.P(this.f33983a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            o0<K, V> o0Var = this.f33984b;
            if (o0Var != null) {
                return o0Var;
            }
            o0<K, V> o0Var2 = new o0<>(this.f33983a.descendingMap(), this);
            this.f33984b = o0Var2;
            return o0Var2;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return u6.P0(this.f33983a.firstEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(@t7 K key) {
            return u6.P0(this.f33983a.floorEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@t7 K key) {
            return this.f33983a.floorKey(key);
        }

        @Override // com.google.common.collect.g5, java.util.SortedMap
        public SortedMap<K, V> headMap(@t7 K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(@t7 K key) {
            return u6.P0(this.f33983a.higherEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@t7 K key) {
            return this.f33983a.higherKey(key);
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return u6.P0(this.f33983a.lastEntry());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(@t7 K key) {
            return u6.P0(this.f33983a.lowerEntry(key));
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@t7 K key) {
            return this.f33983a.lowerKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return q8.P(this.f33983a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.g5, java.util.SortedMap
        public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // com.google.common.collect.g5, java.util.SortedMap
        public SortedMap<K, V> tailMap(@t7 K fromKey) {
            return tailMap(fromKey, true);
        }

        @Override // com.google.common.collect.g5, com.google.common.collect.w4, com.google.common.collect.c5
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.f33983a);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@t7 K toKey, boolean inclusive) {
            return u6.O0(this.f33983a.headMap(toKey, inclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return u6.O0(this.f33983a.subMap(fromKey, fromInclusive, toKey, toInclusive));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@t7 K fromKey, boolean inclusive) {
            return u6.O0(this.f33983a.tailMap(fromKey, inclusive));
        }

        public o0(NavigableMap<K, ? extends V> delegate, o0<K, V> descendingMap) {
            this.f33983a = delegate;
            this.f33984b = descendingMap;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p<A, B> extends ho.h<A, B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.collect.u<A, B> f33985c;

        public p(com.google.common.collect.u<A, B> bimap) {
            this.f33985c = (com.google.common.collect.u) Preconditions.checkNotNull(bimap);
        }

        public static <X, Y> Y n(com.google.common.collect.u<X, Y> bimap, X input) {
            Y y11 = bimap.get(input);
            Preconditions.checkArgument(y11 != null, "No non-null mapping present for input: %s", input);
            return y11;
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof p) {
                return this.f33985c.equals(((p) object).f33985c);
            }
            return false;
        }

        @Override // ho.h
        public A g(B b11) {
            return (A) n(this.f33985c.inverse(), b11);
        }

        @Override // ho.h
        public B h(A a11) {
            return (B) n(this.f33985c, a11);
        }

        public int hashCode() {
            return this.f33985c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f33985c + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p0<V> implements r6.a<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final V f33986a;

        /* renamed from: b, reason: collision with root package name */
        @t7
        public final V f33987b;

        public p0(@t7 V left, @t7 V right) {
            this.f33986a = left;
            this.f33987b = right;
        }

        public static <V> r6.a<V> c(@t7 V left, @t7 V right) {
            return new p0(left, right);
        }

        @Override // com.google.common.collect.r6.a
        @t7
        public V a() {
            return this.f33986a;
        }

        @Override // com.google.common.collect.r6.a
        @t7
        public V b() {
            return this.f33987b;
        }

        @Override // com.google.common.collect.r6.a
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof r6.a) {
                r6.a aVar = (r6.a) object;
                if (ho.d0.a(this.f33986a, aVar.a()) && ho.d0.a(this.f33987b, aVar.b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.r6.a
        public int hashCode() {
            return ho.d0.b(this.f33986a, this.f33987b);
        }

        public String toString() {
            return pn.j.f81006c + this.f33986a + org.junit.jupiter.api.j2.O + this.f33987b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static abstract class q<K, V> extends w4<K, V> implements NavigableMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Comparator<? super K> f33988a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<Map.Entry<K, V>> f33989b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient NavigableSet<K> f33990c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.u6.s
            public Map<K, V> g() {
                return q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return q.this.x();
            }
        }

        private static <T> s7<T> z(Comparator<T> forward) {
            return s7.i(forward).F();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> ceilingEntry(@t7 K key) {
            return y().floorEntry(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K ceilingKey(@t7 K key) {
            return y().floorKey(key);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f33988a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = y().comparator();
            if (comparator2 == null) {
                comparator2 = s7.z();
            }
            s7 z11 = z(comparator2);
            this.f33988a = z11;
            return z11;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return y().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return y();
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f33989b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> w11 = w();
            this.f33989b = w11;
            return w11;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> firstEntry() {
            return y().lastEntry();
        }

        @Override // java.util.SortedMap
        @t7
        public K firstKey() {
            return y().lastKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> floorEntry(@t7 K key) {
            return y().ceilingEntry(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K floorKey(@t7 K key) {
            return y().ceilingKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@t7 K toKey, boolean inclusive) {
            return y().tailMap(toKey, inclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> higherEntry(@t7 K key) {
            return y().lowerEntry(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K higherKey(@t7 K key) {
            return y().lowerKey(key);
        }

        @Override // com.google.common.collect.w4, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lastEntry() {
            return y().firstEntry();
        }

        @Override // java.util.SortedMap
        @t7
        public K lastKey() {
            return y().firstKey();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> lowerEntry(@t7 K key) {
            return y().higherEntry(key);
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public K lowerKey(@t7 K key) {
            return y().higherKey(key);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f33990c;
            if (navigableSet != null) {
                return navigableSet;
            }
            e0 e0Var = new e0(this);
            this.f33990c = e0Var;
            return e0Var;
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            return y().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            return y().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return y().subMap(toKey, toInclusive, fromKey, fromInclusive).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@t7 K fromKey, boolean inclusive) {
            return y().headMap(fromKey, inclusive).descendingMap();
        }

        @Override // com.google.common.collect.c5
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
        public Collection<V> values() {
            return new q0(this);
        }

        public Set<Map.Entry<K, V>> w() {
            return new a();
        }

        public abstract Iterator<Map.Entry<K, V>> x();

        public abstract NavigableMap<K, V> y();

        @Override // com.google.common.collect.w4, com.google.common.collect.c5
        public final Map<K, V> delegate() {
            return y();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@t7 K toKey) {
            return headMap(toKey, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
            return subMap(fromKey, true, toKey, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@t7 K fromKey) {
            return tailMap(fromKey, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q0<K, V> extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final Map<K, V> f33992a;

        public q0(Map<K, V> map) {
            this.f33992a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map<K, V> a() {
            return this.f33992a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            return a().containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return u6.R0(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object o11) {
            try {
                return super.remove(o11);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (ho.d0.a(o11, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> c11) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(c11));
            } catch (UnsupportedOperationException unused) {
                HashSet u11 = q8.u();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (c11.contains(entry.getValue())) {
                        u11.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(u11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> c11) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(c11));
            } catch (UnsupportedOperationException unused) {
                HashSet u11 = q8.u();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (c11.contains(entry.getValue())) {
                        u11.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(u11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class r implements ho.r<Map.Entry<?, ?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f33993a = new a(a.h.C0249a.f16196a, 0);

        /* renamed from: b, reason: collision with root package name */
        public static final r f33994b = new b(a.h.C0249a.f16197b, 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ r[] f33995c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends r {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.r
            @CheckForNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends r {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.r
            @CheckForNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public r(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ r[] a() {
            return new r[]{f33993a, f33994b};
        }

        public static r valueOf(String name) {
            return (r) Enum.valueOf(r.class, name);
        }

        public static r[] values() {
            return (r[]) f33995c.clone();
        }

        public /* synthetic */ r(String str, int i11, e eVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.b
    public static abstract class r0<K, V> extends AbstractMap<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<Map.Entry<K, V>> f33996a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Set<K> f33997b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public transient Collection<V> f33998c;

        public abstract Set<Map.Entry<K, V>> b();

        /* renamed from: d */
        public Set<K> k() {
            return new b0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f33996a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> b11 = b();
            this.f33996a = b11;
            return b11;
        }

        public Collection<V> g() {
            return new q0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: keySet */
        public Set<K> l() {
            Set<K> set = this.f33997b;
            if (set != null) {
                return set;
            }
            Set<K> k11 = k();
            this.f33997b = k11;
            return k11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f33998c;
            if (collection != null) {
                return collection;
            }
            Collection<V> g11 = g();
            this.f33998c = g11;
            return g11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class s<K, V> extends q8.k<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o11;
                Object key = entry.getKey();
                Object p02 = u6.p0(g(), key);
                if (ho.d0.a(p02, entry.getValue()) && (p02 != null || g().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        public abstract Map<K, V> g();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return g().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            if (contains(o11) && (o11 instanceof Map.Entry)) {
                return g().keySet().remove(((Map.Entry) o11).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c11) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(c11));
            } catch (UnsupportedOperationException unused) {
                return q8.J(this, c11.iterator());
            }
        }

        @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c11) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(c11));
            } catch (UnsupportedOperationException unused) {
                HashSet y11 = q8.y(c11.size());
                for (Object obj : c11) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        y11.add(((Map.Entry) obj).getKey());
                    }
                }
                return g().keySet().retainAll(y11);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g().size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface t<K, V1, V2> {
        @t7
        V2 a(@t7 K key, @t7 V1 value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u<K, V> extends v<K, V> implements com.google.common.collect.u<K, V> {

        /* renamed from: g, reason: collision with root package name */
        @RetainedWith
        public final com.google.common.collect.u<V, K> f33999g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ho.i0<Map.Entry<V, K>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ho.i0 f34000a;

            public a(final ho.i0 val$forwardPredicate) {
                this.f34000a = val$forwardPredicate;
            }

            @Override // ho.i0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> input) {
                return this.f34000a.apply(u6.O(input.getValue(), input.getKey()));
            }
        }

        public u(com.google.common.collect.u<K, V> delegate, ho.i0<? super Map.Entry<K, V>> predicate) {
            super(delegate, predicate);
            this.f33999g = new u(delegate.inverse(), k(predicate), this);
        }

        public static <K, V> ho.i0<Map.Entry<V, K>> k(final ho.i0<? super Map.Entry<K, V>> forwardPredicate) {
            return new a(forwardPredicate);
        }

        @Override // com.google.common.collect.u
        @CheckForNull
        public V forcePut(@t7 K key, @t7 V value) {
            Preconditions.checkArgument(h(key, value));
            return l().forcePut(key, value);
        }

        @Override // com.google.common.collect.u
        public com.google.common.collect.u<V, K> inverse() {
            return this.f33999g;
        }

        public com.google.common.collect.u<K, V> l() {
            return (com.google.common.collect.u) this.f33978d;
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.f33999g.keySet();
        }

        public u(com.google.common.collect.u<K, V> delegate, ho.i0<? super Map.Entry<K, V>> predicate, com.google.common.collect.u<V, K> inverse) {
            super(delegate, predicate);
            this.f33999g = inverse;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v<K, V> extends n<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public final Set<Map.Entry<K, V>> f34001f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends e5<Map.Entry<K, V>> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.google.common.collect.u6$v$a$a, reason: collision with other inner class name */
            public class C0405a extends v9<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                /* renamed from: com.google.common.collect.u6$v$a$a$a, reason: collision with other inner class name */
                public class C0406a extends x4<K, V> {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Map.Entry f34004a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C0405a f34005b;

                    public C0406a(final C0405a this$2, final Map.Entry val$entry) {
                        this.f34004a = val$entry;
                        this.f34005b = this$2;
                    }

                    @Override // com.google.common.collect.x4, java.util.Map.Entry
                    @t7
                    public V setValue(@t7 V v11) {
                        Preconditions.checkArgument(v.this.h(getKey(), v11));
                        return (V) super.setValue(v11);
                    }

                    @Override // com.google.common.collect.x4, com.google.common.collect.c5
                    /* renamed from: w */
                    public Map.Entry<K, V> delegate() {
                        return this.f34004a;
                    }
                }

                public C0405a(Iterator backingIterator) {
                    super(backingIterator);
                }

                @Override // com.google.common.collect.v9
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> a(final Map.Entry<K, V> entry) {
                    return new C0406a(this, entry);
                }
            }

            public a() {
            }

            @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0405a(v.this.f34001f.iterator());
            }

            public /* synthetic */ a(v vVar, e eVar) {
                this();
            }

            @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
            public Set<Map.Entry<K, V>> delegate() {
                return v.this.f34001f;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends b0<K, V> {
            public b() {
                super(v.this);
            }

            @Override // com.google.common.collect.u6.b0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object o11) {
                if (!v.this.containsKey(o11)) {
                    return false;
                }
                v.this.f33978d.remove(o11);
                return true;
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                v vVar = v.this;
                return v.i(vVar.f33978d, vVar.f33979e, collection);
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                v vVar = v.this;
                return v.j(vVar.f33978d, vVar.f33979e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return q6.s(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) q6.s(iterator()).toArray(tArr);
            }
        }

        public v(Map<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f34001f = q8.i(unfiltered.entrySet(), this.f33979e);
        }

        public static <K, V> boolean i(Map<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && keyCollection.contains(next.getKey())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        public static <K, V> boolean j(Map<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate, Collection<?> keyCollection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (entryPredicate.apply(next) && !keyCollection.contains(next.getKey())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, V>> b() {
            return new a(this, null);
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: d */
        public Set<K> k() {
            return new b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class w<K, V> extends com.google.common.collect.j<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final NavigableMap<K, V> f34007a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.i0<? super Map.Entry<K, V>> f34008b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<K, V> f34009c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends e0<K, V> {
            public a(NavigableMap map) {
                super(map);
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return v.i(w.this.f34007a, w.this.f34008b, collection);
            }

            @Override // com.google.common.collect.q8.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return v.j(w.this.f34007a, w.this.f34008b, collection);
            }
        }

        public w(NavigableMap<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
            this.f34007a = (NavigableMap) Preconditions.checkNotNull(unfiltered);
            this.f34008b = entryPredicate;
            this.f34009c = new v(unfiltered, entryPredicate);
        }

        @Override // com.google.common.collect.u6.a0
        public Iterator<Map.Entry<K, V>> b() {
            return l6.w(this.f34007a.entrySet().iterator(), this.f34008b);
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f34009c.clear();
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return this.f34007a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f34009c.containsKey(key);
        }

        @Override // com.google.common.collect.j
        public Iterator<Map.Entry<K, V>> d() {
            return l6.w(this.f34007a.descendingMap().entrySet().iterator(), this.f34008b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return u6.z(this.f34007a.descendingMap(), this.f34008b);
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f34009c.entrySet();
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object key) {
            return this.f34009c.get(key);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@t7 K toKey, boolean inclusive) {
            return u6.z(this.f34007a.headMap(toKey, inclusive), this.f34008b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !k6.c(this.f34007a.entrySet(), this.f34008b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) k6.I(this.f34007a.entrySet(), this.f34008b);
        }

        @Override // com.google.common.collect.j, java.util.NavigableMap
        @CheckForNull
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) k6.I(this.f34007a.descendingMap().entrySet(), this.f34008b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(@t7 K key, @t7 V value) {
            return this.f34009c.put(key, value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> m11) {
            this.f34009c.putAll(m11);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object key) {
            return this.f34009c.remove(key);
        }

        @Override // com.google.common.collect.u6.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f34009c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@t7 K fromKey, boolean fromInclusive, @t7 K toKey, boolean toInclusive) {
            return u6.z(this.f34007a.subMap(fromKey, fromInclusive, toKey, toInclusive), this.f34008b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@t7 K fromKey, boolean inclusive) {
            return u6.z(this.f34007a.tailMap(fromKey, inclusive), this.f34008b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new z(this, this.f34007a, this.f34008b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x<K, V> extends v<K, V> implements SortedMap<K, V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends v<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            @CheckForNull
            public Comparator<? super K> comparator() {
                return x.this.m().comparator();
            }

            @Override // java.util.SortedSet
            @t7
            public K first() {
                return (K) x.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@t7 K toElement) {
                return (SortedSet) x.this.headMap(toElement).keySet();
            }

            @Override // java.util.SortedSet
            @t7
            public K last() {
                return (K) x.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@t7 K fromElement, @t7 K toElement) {
                return (SortedSet) x.this.subMap(fromElement, toElement).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@t7 K fromElement) {
                return (SortedSet) x.this.tailMap(fromElement).keySet();
            }
        }

        public x(SortedMap<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
        }

        @Override // java.util.SortedMap
        @CheckForNull
        public Comparator<? super K> comparator() {
            return m().comparator();
        }

        @Override // java.util.SortedMap
        @t7
        public K firstKey() {
            return l().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@t7 K toKey) {
            return new x(m().headMap(toKey), this.f33979e);
        }

        @Override // com.google.common.collect.u6.v, com.google.common.collect.u6.r0
        public SortedSet<K> k() {
            return new a();
        }

        @Override // com.google.common.collect.u6.r0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<K> l() {
            return (SortedSet) super.l();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        @t7
        public K lastKey() {
            SortedMap<K, V> m11 = m();
            while (true) {
                K lastKey = m11.lastKey();
                if (h(lastKey, m7.a(this.f33978d.get(lastKey)))) {
                    return lastKey;
                }
                m11 = m().headMap(lastKey);
            }
        }

        public SortedMap<K, V> m() {
            return (SortedMap) this.f33978d;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@t7 K fromKey, @t7 K toKey) {
            return new x(m().subMap(fromKey, toKey), this.f33979e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@t7 K fromKey) {
            return new x(m().tailMap(fromKey), this.f33979e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class y<K, V> extends n<K, V> {

        /* renamed from: f, reason: collision with root package name */
        public final ho.i0<? super K> f34012f;

        public y(Map<K, V> unfiltered, ho.i0<? super K> keyPredicate, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
            super(unfiltered, entryPredicate);
            this.f34012f = keyPredicate;
        }

        @Override // com.google.common.collect.u6.r0
        public Set<Map.Entry<K, V>> b() {
            return q8.i(this.f33978d.entrySet(), this.f33979e);
        }

        @Override // com.google.common.collect.u6.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f33978d.containsKey(key) && this.f34012f.apply(key);
        }

        @Override // com.google.common.collect.u6.r0
        /* renamed from: d */
        public Set<K> k() {
            return q8.i(this.f33978d.keySet(), this.f34012f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class z<K, V> extends q0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final Map<K, V> f34013b;

        /* renamed from: c, reason: collision with root package name */
        public final ho.i0<? super Map.Entry<K, V>> f34014c;

        public z(Map<K, V> filteredMap, Map<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> predicate) {
            super(filteredMap);
            this.f34013b = unfiltered;
            this.f34014c = predicate;
        }

        @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(@CheckForNull Object o11) {
            Iterator<Map.Entry<K, V>> it = this.f34013b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f34014c.apply(next) && ho.d0.a(next.getValue(), o11)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f34013b.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f34014c.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // com.google.common.collect.u6.q0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f34013b.entrySet().iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f34014c.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z11 = true;
                }
            }
            return z11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return q6.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) q6.s(iterator()).toArray(tArr);
        }
    }

    public static <K, V> SortedMap<K, V> A(SortedMap<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof x ? E((x) unfiltered, entryPredicate) : new x((SortedMap) Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    @go.c
    public static <K, V1, V2> NavigableMap<K, V2> A0(NavigableMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new j0(fromMap, transformer);
    }

    public static <K, V> com.google.common.collect.u<K, V> B(u<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new u(map.l(), ho.j0.d(map.f33979e, entryPredicate));
    }

    public static <K, V1, V2> SortedMap<K, V2> B0(SortedMap<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new k0(fromMap, transformer);
    }

    public static <K, V> Map<K, V> C(n<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new v(map.f33978d, ho.j0.d(map.f33979e, entryPredicate));
    }

    public static <V2, K, V1> Map.Entry<K, V2> C0(final t<? super K, ? super V1, V2> transformer, final Map.Entry<K, V1> entry) {
        Preconditions.checkNotNull(transformer);
        Preconditions.checkNotNull(entry);
        return new c(entry, transformer);
    }

    @go.c
    public static <K, V> NavigableMap<K, V> D(w<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new w(map.f34007a, ho.j0.d(map.f34008b, entryPredicate));
    }

    public static <K, V1, V2> Map<K, V2> D0(Map<K, V1> fromMap, ho.r<? super V1, V2> function) {
        return z0(fromMap, i(function));
    }

    public static <K, V> SortedMap<K, V> E(x<K, V> map, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        return new x(map.m(), ho.j0.d(map.f33979e, entryPredicate));
    }

    @go.c
    public static <K, V1, V2> NavigableMap<K, V2> E0(NavigableMap<K, V1> fromMap, ho.r<? super V1, V2> function) {
        return A0(fromMap, i(function));
    }

    public static <K, V> com.google.common.collect.u<K, V> F(com.google.common.collect.u<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        Preconditions.checkNotNull(keyPredicate);
        return x(unfiltered, U(keyPredicate));
    }

    public static <K, V1, V2> SortedMap<K, V2> F0(SortedMap<K, V1> fromMap, ho.r<? super V1, V2> function) {
        return B0(fromMap, i(function));
    }

    public static <K, V> Map<K, V> G(Map<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        Preconditions.checkNotNull(keyPredicate);
        ho.i0 U = U(keyPredicate);
        return unfiltered instanceof n ? C((n) unfiltered, U) : new y((Map) Preconditions.checkNotNull(unfiltered), keyPredicate, U);
    }

    @uo.a
    public static <K, V> ImmutableMap<K, V> G0(Iterable<V> values, ho.r<? super V, K> keyFunction) {
        return values instanceof Collection ? I0(values.iterator(), keyFunction, ImmutableMap.builderWithExpectedSize(((Collection) values).size())) : H0(values.iterator(), keyFunction);
    }

    @go.c
    public static <K, V> NavigableMap<K, V> H(NavigableMap<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        return z(unfiltered, U(keyPredicate));
    }

    @uo.a
    public static <K, V> ImmutableMap<K, V> H0(Iterator<V> values, ho.r<? super V, K> keyFunction) {
        return I0(values, keyFunction, ImmutableMap.builder());
    }

    public static <K, V> SortedMap<K, V> I(SortedMap<K, V> unfiltered, final ho.i0<? super K> keyPredicate) {
        return A(unfiltered, U(keyPredicate));
    }

    public static <K, V> ImmutableMap<K, V> I0(Iterator<V> values, ho.r<? super V, K> keyFunction, ImmutableMap.b<K, V> builder) {
        Preconditions.checkNotNull(keyFunction);
        while (values.hasNext()) {
            V next = values.next();
            builder.i(keyFunction.apply(next), next);
        }
        try {
            return builder.d();
        } catch (IllegalArgumentException e11) {
            throw new IllegalArgumentException(e11.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    public static <K, V> com.google.common.collect.u<K, V> J(com.google.common.collect.u<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return x(unfiltered, T0(valuePredicate));
    }

    public static <K, V> com.google.common.collect.u<K, V> J0(com.google.common.collect.u<? extends K, ? extends V> bimap) {
        return new l0(bimap, null);
    }

    public static <K, V> Map<K, V> K(Map<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return y(unfiltered, T0(valuePredicate));
    }

    public static <K, V> Map.Entry<K, V> K0(final Map.Entry<? extends K, ? extends V> entry) {
        Preconditions.checkNotNull(entry);
        return new k(entry);
    }

    @go.c
    public static <K, V> NavigableMap<K, V> L(NavigableMap<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return z(unfiltered, T0(valuePredicate));
    }

    public static <K, V> aa<Map.Entry<K, V>> L0(final Iterator<Map.Entry<K, V>> entryIterator) {
        return new l(entryIterator);
    }

    public static <K, V> SortedMap<K, V> M(SortedMap<K, V> unfiltered, final ho.i0<? super V> valuePredicate) {
        return A(unfiltered, T0(valuePredicate));
    }

    public static <K, V> Set<Map.Entry<K, V>> M0(Set<Map.Entry<K, V>> entrySet) {
        return new n0(Collections.unmodifiableSet(entrySet));
    }

    @go.d
    @go.c
    public static ImmutableMap<String, String> N(Properties properties) {
        ImmutableMap.b builder = ImmutableMap.builder();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            Object nextElement = propertyNames.nextElement();
            Objects.requireNonNull(nextElement);
            String str = (String) nextElement;
            String property = properties.getProperty(str);
            Objects.requireNonNull(property);
            builder.i(str, property);
        }
        return builder.d();
    }

    public static <K, V> Map<K, V> N0(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    @go.b(serializable = true)
    public static <K, V> Map.Entry<K, V> O(@t7 K key, @t7 V value) {
        return new r5(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.c
    public static <K, V> NavigableMap<K, V> O0(NavigableMap<K, ? extends V> map) {
        Preconditions.checkNotNull(map);
        return map instanceof o0 ? map : new o0(map);
    }

    @go.b(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> P(Map<K, ? extends V> map) {
        if (map instanceof s5) {
            return (s5) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        x2.a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            x2.a(key2, value2);
            enumMap.put((EnumMap) key2, (K) value2);
        }
        return s5.d(enumMap);
    }

    @CheckForNull
    public static <K, V> Map.Entry<K, V> P0(@CheckForNull Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return K0(entry);
    }

    public static <E> ImmutableMap<E, Integer> Q(Collection<E> list) {
        ImmutableMap.b bVar = new ImmutableMap.b(list.size());
        Iterator<E> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            bVar.i(it.next(), Integer.valueOf(i11));
            i11++;
        }
        return bVar.d();
    }

    public static <V> ho.r<Map.Entry<?, V>, V> Q0() {
        return r.f33994b;
    }

    public static <K> ho.r<Map.Entry<K, ?>, K> R() {
        return r.f33993a;
    }

    public static <K, V> Iterator<V> R0(Iterator<Map.Entry<K, V>> entryIterator) {
        return new f(entryIterator);
    }

    public static <K, V> Iterator<K> S(Iterator<Map.Entry<K, V>> entryIterator) {
        return new e(entryIterator);
    }

    @CheckForNull
    public static <V> V S0(@CheckForNull Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @CheckForNull
    public static <K> K T(@CheckForNull Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <V> ho.i0<Map.Entry<?, V>> T0(ho.i0<? super V> valuePredicate) {
        return ho.j0.h(valuePredicate, Q0());
    }

    public static <K> ho.i0<Map.Entry<K, ?>> U(ho.i0<? super K> keyPredicate) {
        return ho.j0.h(keyPredicate, R());
    }

    public static <K, V> ConcurrentMap<K, V> V() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> W(Class<K> type) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(type));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> X(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> Y() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> Z(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a0(int expectedSize) {
        return new HashMap<>(o(expectedSize));
    }

    public static <K, V> IdentityHashMap<K, V> b0() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> c0() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> d0(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> e0(int expectedSize) {
        return new LinkedHashMap<>(o(expectedSize));
    }

    public static <A, B> ho.h<A, B> f(final com.google.common.collect.u<A, B> bimap) {
        return new p(bimap);
    }

    public static <K extends Comparable, V> TreeMap<K, V> f0() {
        return new TreeMap<>();
    }

    public static <K, V1, V2> ho.r<Map.Entry<K, V1>, Map.Entry<K, V2>> g(final t<? super K, ? super V1, V2> transformer) {
        Preconditions.checkNotNull(transformer);
        return new d(transformer);
    }

    public static <C, K extends C, V> TreeMap<K, V> g0(@CheckForNull Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K, V1, V2> ho.r<Map.Entry<K, V1>, V2> h(final t<? super K, ? super V1, V2> transformer) {
        Preconditions.checkNotNull(transformer);
        return new b(transformer);
    }

    public static <K, V> TreeMap<K, V> h0(SortedMap<K, ? extends V> map) {
        return new TreeMap<>((SortedMap) map);
    }

    public static <K, V1, V2> t<K, V1, V2> i(final ho.r<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return new m(function);
    }

    public static <E> Comparator<? super E> i0(@CheckForNull Comparator<? super E> comparator) {
        return comparator != null ? comparator : s7.z();
    }

    public static <K, V> Map<K, V> j(Set<K> set, ho.r<? super K, V> function) {
        return new o(set, function);
    }

    public static <K, V> void j0(Map<K, V> self, Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            self.put(entry.getKey(), entry.getValue());
        }
    }

    @go.c
    public static <K, V> NavigableMap<K, V> k(NavigableSet<K> set, ho.r<? super K, V> function) {
        return new d0(set, function);
    }

    public static <K, V> boolean k0(Collection<Map.Entry<K, V>> c11, @CheckForNull Object o11) {
        if (o11 instanceof Map.Entry) {
            return c11.remove(K0((Map.Entry) o11));
        }
        return false;
    }

    public static <K, V> SortedMap<K, V> l(SortedSet<K> set, ho.r<? super K, V> function) {
        return new f0(set, function);
    }

    @go.c
    public static <E> NavigableSet<E> l0(final NavigableSet<E> set) {
        return new j(set);
    }

    public static <K, V> Iterator<Map.Entry<K, V>> m(Set<K> set, final ho.r<? super K, V> function) {
        return new g(set.iterator(), function);
    }

    public static <E> Set<E> m0(final Set<E> set) {
        return new h(set);
    }

    public static <K, V1, V2> ho.r<V1, V2> n(final t<? super K, V1, V2> transformer, @t7 final K key) {
        Preconditions.checkNotNull(transformer);
        return new a(transformer, key);
    }

    public static <E> SortedSet<E> n0(final SortedSet<E> set) {
        return new i(set);
    }

    public static int o(int expectedSize) {
        if (expectedSize < 3) {
            x2.b(expectedSize, "expectedSize");
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) Math.ceil(expectedSize / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean o0(Map<?, ?> map, @CheckForNull Object key) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <K, V> boolean p(Collection<Map.Entry<K, V>> c11, @CheckForNull Object o11) {
        if (o11 instanceof Map.Entry) {
            return c11.contains(K0((Map.Entry) o11));
        }
        return false;
    }

    @CheckForNull
    public static <V> V p0(Map<?, V> map, @CheckForNull Object key) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean q(Map<?, ?> map, @CheckForNull Object key) {
        return l6.p(S(map.entrySet().iterator()), key);
    }

    @CheckForNull
    public static <V> V q0(Map<?, V> map, @CheckForNull Object key) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean r(Map<?, ?> map, @CheckForNull Object value) {
        return l6.p(R0(map.entrySet().iterator()), value);
    }

    @go.c
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> r0(NavigableMap<K, V> map, Range<K> range) {
        if (map.comparator() != null && map.comparator() != s7.z() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(map.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            K lowerEndpoint = range.lowerEndpoint();
            BoundType lowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return map.subMap(lowerEndpoint, lowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return map.tailMap(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return map.headMap(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableMap) Preconditions.checkNotNull(map);
    }

    public static <K, V> r6<K, V> s(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right) {
        return left instanceof SortedMap ? u((SortedMap) left, right) : t(left, right, Equivalence.c());
    }

    @go.d
    public static <K, V> com.google.common.collect.u<K, V> s0(com.google.common.collect.u<K, V> bimap) {
        return e9.g(bimap, null);
    }

    public static <K, V> r6<K, V> t(Map<? extends K, ? extends V> left, Map<? extends K, ? extends V> right, Equivalence<? super V> valueEquivalence) {
        Preconditions.checkNotNull(valueEquivalence);
        LinkedHashMap c02 = c0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(right);
        LinkedHashMap c03 = c0();
        LinkedHashMap c04 = c0();
        v(left, right, valueEquivalence, c02, linkedHashMap, c03, c04);
        return new c0(c02, linkedHashMap, c03, c04);
    }

    @go.d
    @go.c
    public static <K, V> NavigableMap<K, V> t0(NavigableMap<K, V> navigableMap) {
        return e9.o(navigableMap);
    }

    public static <K, V> w8<K, V> u(SortedMap<K, ? extends V> left, Map<? extends K, ? extends V> right) {
        Preconditions.checkNotNull(left);
        Preconditions.checkNotNull(right);
        Comparator i02 = i0(left.comparator());
        TreeMap g02 = g0(i02);
        TreeMap g03 = g0(i02);
        g03.putAll(right);
        TreeMap g04 = g0(i02);
        TreeMap g05 = g0(i02);
        v(left, right, Equivalence.c(), g02, g03, g04, g05);
        return new h0(g02, g03, g04, g05);
    }

    @p5
    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> u0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction) {
        return v2.H(keyFunction, valueFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void v(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, r6.a<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                a0.d dVar = (Object) m7.a(map4.remove(key));
                if (equivalence.d(value, dVar)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, p0.c(value, dVar));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    @p5
    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> v0(Function<? super T, ? extends K> keyFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return v2.I(keyFunction, valueFunction, mergeFunction);
    }

    public static boolean w(Map<?, ?> map, @CheckForNull Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            return map.entrySet().equals(((Map) object).entrySet());
        }
        return false;
    }

    public static <K, V> ImmutableMap<K, V> w0(Iterable<K> keys, ho.r<? super K, V> valueFunction) {
        return x0(keys.iterator(), valueFunction);
    }

    public static <K, V> com.google.common.collect.u<K, V> x(com.google.common.collect.u<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof u ? B((u) unfiltered, entryPredicate) : new u(unfiltered, entryPredicate);
    }

    public static <K, V> ImmutableMap<K, V> x0(Iterator<K> keys, ho.r<? super K, V> valueFunction) {
        Preconditions.checkNotNull(valueFunction);
        ImmutableMap.b builder = ImmutableMap.builder();
        while (keys.hasNext()) {
            K next = keys.next();
            builder.i(next, valueFunction.apply(next));
        }
        return builder.c();
    }

    public static <K, V> Map<K, V> y(Map<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof n ? C((n) unfiltered, entryPredicate) : new v((Map) Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static String y0(Map<?, ?> map) {
        StringBuilder f11 = y2.f(map.size());
        f11.append(l50.b.f69927i);
        boolean z11 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z11) {
                f11.append(org.junit.jupiter.api.j2.O);
            }
            f11.append(entry.getKey());
            f11.append('=');
            f11.append(entry.getValue());
            z11 = false;
        }
        f11.append(l50.b.f69928j);
        return f11.toString();
    }

    @go.c
    public static <K, V> NavigableMap<K, V> z(NavigableMap<K, V> unfiltered, ho.i0<? super Map.Entry<K, V>> entryPredicate) {
        Preconditions.checkNotNull(entryPredicate);
        return unfiltered instanceof w ? D((w) unfiltered, entryPredicate) : new w((NavigableMap) Preconditions.checkNotNull(unfiltered), entryPredicate);
    }

    public static <K, V1, V2> Map<K, V2> z0(Map<K, V1> fromMap, t<? super K, ? super V1, V2> transformer) {
        return new i0(fromMap, transformer);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h<E> extends e5<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f33965a;

        public h(final Set val$set) {
            this.f33965a = val$set;
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Queue
        public boolean add(@t7 E element) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public boolean addAll(Collection<? extends E> es2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<E> delegate() {
            return this.f33965a;
        }
    }
}
