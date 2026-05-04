package com.google.common.collect;

import com.google.common.collect.f9;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class q<R, C, V> implements f9<R, C, V> {

    @CheckForNull
    @vo.b
    private transient Set<f9.a<R, C, V>> cellSet;

    @CheckForNull
    @vo.b
    private transient Collection<V> values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends v9<f9.a<R, C, V>, V> {
        public a(Iterator backingIterator) {
            super(backingIterator);
        }

        @Override // com.google.common.collect.v9
        @t7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(f9.a<R, C, V> cell) {
            return cell.getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AbstractSet<f9.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof f9.a) {
                f9.a aVar = (f9.a) o11;
                Map map = (Map) u6.p0(q.this.rowMap(), aVar.b());
                if (map != null && y2.j(map.entrySet(), u6.O(aVar.a(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<f9.a<R, C, V>> iterator() {
            return q.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            if (o11 instanceof f9.a) {
                f9.a aVar = (f9.a) o11;
                Map map = (Map) u6.p0(q.this.rowMap(), aVar.b());
                if (map != null && y2.k(map.entrySet(), u6.O(aVar.a(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            q.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object o11) {
            return q.this.containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return q.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return q.this.size();
        }
    }

    public abstract Iterator<f9.a<R, C, V>> cellIterator();

    @Override // com.google.common.collect.f9
    public Set<f9.a<R, C, V>> cellSet() {
        Set<f9.a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<f9.a<R, C, V>> createCellSet = createCellSet();
        this.cellSet = createCellSet;
        return createCellSet;
    }

    @Override // com.google.common.collect.f9
    public void clear() {
        l6.g(cellSet().iterator());
    }

    @Override // com.google.common.collect.f9
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.f9
    public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        Map map = (Map) u6.p0(rowMap(), rowKey);
        return map != null && u6.o0(map, columnKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsColumn(@CheckForNull Object columnKey) {
        return u6.o0(columnMap(), columnKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsRow(@CheckForNull Object rowKey) {
        return u6.o0(rowMap(), rowKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsValue(@CheckForNull Object value) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    public Set<f9.a<R, C, V>> createCellSet() {
        return new b();
    }

    public Collection<V> createValues() {
        return new c();
    }

    @Override // com.google.common.collect.f9
    public boolean equals(@CheckForNull Object obj) {
        return s9.c(this, obj);
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) u6.p0(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) u6.p0(map, obj2);
    }

    @Override // com.google.common.collect.f9
    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // com.google.common.collect.f9
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V put(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
        return row(rowKey).put(columnKey, value);
    }

    @Override // com.google.common.collect.f9
    public void putAll(f9<? extends R, ? extends C, ? extends V> table) {
        for (f9.a<? extends R, ? extends C, ? extends V> aVar : table.cellSet()) {
            put(aVar.b(), aVar.a(), aVar.getValue());
        }
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) u6.p0(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) u6.q0(map, obj2);
    }

    @Override // com.google.common.collect.f9
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.f9
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public Iterator<V> valuesIterator() {
        return new a(cellSet().iterator());
    }
}
