package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.u6;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public class TreeBasedTable<R, C, V> extends c9<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.common.collect.c<C> {

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public C f33165c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Iterator f33166d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Comparator f33167e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TreeBasedTable f33168f;

        public a(final TreeBasedTable this$0, final Iterator val$merged, final Comparator val$comparator) {
            this.f33166d = val$merged;
            this.f33167e = val$comparator;
            this.f33168f = this$0;
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        public C a() {
            while (this.f33166d.hasNext()) {
                C c11 = (C) this.f33166d.next();
                C c12 = this.f33165c;
                if (c12 == null || this.f33167e.compare(c11, c12) != 0) {
                    this.f33165c = c11;
                    return c11;
                }
            }
            this.f33165c = null;
            return b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<C, V> implements ho.p0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super C> f33169a;

        public b(Comparator<? super C> comparator) {
            this.f33169a = comparator;
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return new TreeMap(this.f33169a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends d9<R, C, V>.g implements SortedMap<C, V> {

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public final C f33170d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public final C f33171e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public transient SortedMap<C, V> f33172f;

        public c(final TreeBasedTable this$0, R rowKey) {
            this(rowKey, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.d9.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return m(key) && super.containsKey(key);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            h();
            Map<C, V> map = this.f33354b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.d9.g
        public void g() {
            n();
            SortedMap<C, V> sortedMap = this.f33172f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.backingMap.remove(this.f33353a);
            this.f33172f = null;
            this.f33354b = null;
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C toKey) {
            Preconditions.checkArgument(m(Preconditions.checkNotNull(toKey)));
            return new c(this.f33353a, this.f33170d, toKey);
        }

        public int j(Object a11, Object b11) {
            return comparator().compare(a11, b11);
        }

        @Override // com.google.common.collect.d9.g
        @CheckForNull
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> d() {
            n();
            SortedMap<C, V> sortedMap = this.f33172f;
            if (sortedMap == null) {
                return null;
            }
            C c11 = this.f33170d;
            if (c11 != null) {
                sortedMap = sortedMap.tailMap(c11);
            }
            C c12 = this.f33171e;
            return c12 != null ? sortedMap.headMap(c12) : sortedMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new u6.g0(this);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            h();
            Map<C, V> map = this.f33354b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        public boolean m(@CheckForNull Object o11) {
            if (o11 == null) {
                return false;
            }
            C c11 = this.f33170d;
            if (c11 != null && j(c11, o11) > 0) {
                return false;
            }
            C c12 = this.f33171e;
            return c12 == null || j(c12, o11) > 0;
        }

        public void n() {
            SortedMap<C, V> sortedMap = this.f33172f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f33353a))) {
                this.f33172f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f33353a);
            }
        }

        @Override // com.google.common.collect.d9.g, java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c11, V v11) {
            Preconditions.checkArgument(m(Preconditions.checkNotNull(c11)));
            return (V) super.put(c11, v11);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C fromKey, C toKey) {
            Preconditions.checkArgument(m(Preconditions.checkNotNull(fromKey)) && m(Preconditions.checkNotNull(toKey)));
            return new c(this.f33353a, fromKey, toKey);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C fromKey) {
            Preconditions.checkArgument(m(Preconditions.checkNotNull(fromKey)));
            return new c(this.f33353a, fromKey, this.f33171e);
        }

        public c(R rowKey, @CheckForNull C lowerBound, @CheckForNull C upperBound) {
            super(rowKey);
            this.f33170d = lowerBound;
            this.f33171e = upperBound;
            Preconditions.checkArgument(lowerBound == null || upperBound == null || j(lowerBound, upperBound) <= 0);
        }
    }

    public TreeBasedTable(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        super(new TreeMap(rowComparator), new b(columnComparator));
        this.columnComparator = columnComparator;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(s7.z(), s7.z());
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map column(Object columnKey) {
        return super.column(columnKey);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return super.contains(rowKey, columnKey);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.d9
    public Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> columnComparator = columnComparator();
        return new a(this, l6.N(k6.T(this.backingMap.values(), new ho.r() { // from class: com.google.common.collect.x9
            @Override // ho.r
            public final Object apply(Object obj) {
                Iterator it;
                it = ((Map) obj).keySet().iterator();
                return it;
            }
        }), columnComparator), columnComparator);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object put(Object rowKey, Object columnKey, Object value) {
        return super.put(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ void putAll(f9 table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return super.remove(rowKey, columnKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map row(Object rowKey) {
        return row((TreeBasedTable<R, C, V>) rowKey);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator) {
        Preconditions.checkNotNull(rowComparator);
        Preconditions.checkNotNull(columnComparator);
        return new TreeBasedTable<>(rowComparator, columnComparator);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public SortedMap<C, V> row(R rowKey) {
        return new c(this, rowKey);
    }

    @Override // com.google.common.collect.c9, com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.c9, com.google.common.collect.d9, com.google.common.collect.f9
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> table) {
        TreeBasedTable<R, C, V> treeBasedTable = new TreeBasedTable<>(table.rowComparator(), table.columnComparator());
        treeBasedTable.putAll(table);
        return treeBasedTable;
    }
}
