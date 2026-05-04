package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.f9;
import com.google.common.collect.s9;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class ImmutableTable<R, C, V> extends q<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @uo.f
    public static final class a<R, C, V> {

        /* renamed from: a, reason: collision with root package name */
        public final List<f9.a<R, C, V>> f33098a = q6.q();

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public Comparator<? super R> f33099b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public Comparator<? super C> f33100c;

        public ImmutableTable<R, C, V> a() {
            return b();
        }

        public ImmutableTable<R, C, V> b() {
            int size = this.f33098a.size();
            return size != 0 ? size != 1 ? k8.d(this.f33098a, this.f33099b, this.f33100c) : new s8((f9.a) k6.z(this.f33098a)) : ImmutableTable.of();
        }

        @uo.a
        public a<R, C, V> c(a<R, C, V> other) {
            this.f33098a.addAll(other.f33098a);
            return this;
        }

        @uo.a
        public a<R, C, V> d(Comparator<? super C> columnComparator) {
            this.f33100c = (Comparator) Preconditions.checkNotNull(columnComparator, "columnComparator");
            return this;
        }

        @uo.a
        public a<R, C, V> e(Comparator<? super R> rowComparator) {
            this.f33099b = (Comparator) Preconditions.checkNotNull(rowComparator, "rowComparator");
            return this;
        }

        @uo.a
        public a<R, C, V> f(f9.a<? extends R, ? extends C, ? extends V> cell) {
            if (!(cell instanceof s9.c)) {
                g(cell.b(), cell.a(), cell.getValue());
                return this;
            }
            Preconditions.checkNotNull(cell.b(), "row");
            Preconditions.checkNotNull(cell.a(), "column");
            Preconditions.checkNotNull(cell.getValue(), "value");
            this.f33098a.add(cell);
            return this;
        }

        @uo.a
        public a<R, C, V> g(R rowKey, C columnKey, V value) {
            this.f33098a.add(ImmutableTable.cellOf(rowKey, columnKey, value));
            return this;
        }

        @uo.a
        public a<R, C, V> h(f9<? extends R, ? extends C, ? extends V> table) {
            Iterator<f9.a<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f33101a;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f33102b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f33103c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f33104d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f33105e;

        public b(Object[] rowKeys, Object[] columnKeys, Object[] cellValues, int[] cellRowIndices, int[] cellColumnIndices) {
            this.f33101a = rowKeys;
            this.f33102b = columnKeys;
            this.f33103c = cellValues;
            this.f33104d = cellRowIndices;
            this.f33105e = cellColumnIndices;
        }

        public static b a(ImmutableTable<?, ?, ?> table, int[] cellRowIndices, int[] cellColumnIndices) {
            return new b(table.rowKeySet().toArray(), table.columnKeySet().toArray(), table.values().toArray(), cellRowIndices, cellColumnIndices);
        }

        public Object readResolve() {
            Object[] objArr = this.f33103c;
            if (objArr.length == 0) {
                return ImmutableTable.of();
            }
            int i11 = 0;
            if (objArr.length == 1) {
                return ImmutableTable.of(this.f33101a[0], this.f33102b[0], objArr[0]);
            }
            ImmutableList.a aVar = new ImmutableList.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f33103c;
                if (i11 >= objArr2.length) {
                    return k8.f(aVar.e(), ImmutableSet.copyOf(this.f33101a), ImmutableSet.copyOf(this.f33102b));
                }
                aVar.g(ImmutableTable.cellOf(this.f33101a[this.f33104d[i11]], this.f33102b[this.f33105e[i11]], objArr2[i11]));
                i11++;
            }
        }
    }

    public static <R, C, V> a<R, C, V> builder() {
        return new a<>();
    }

    public static <R, C, V> f9.a<R, C, V> cellOf(R rowKey, C columnKey, V value) {
        return s9.d(Preconditions.checkNotNull(rowKey, "rowKey"), Preconditions.checkNotNull(columnKey, "columnKey"), Preconditions.checkNotNull(value, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(f9<? extends R, ? extends C, ? extends V> table) {
        return table instanceof ImmutableTable ? (ImmutableTable) table : copyOf(table.cellSet());
    }

    public static <R, C, V> ImmutableTable<R, C, V> of() {
        return (ImmutableTable<R, C, V>) b9.f33284e;
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @p5
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction) {
        return r9.j(rowFunction, columnFunction, valueFunction);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map column(Object columnKey) {
        return column((ImmutableTable<R, C, V>) columnKey);
    }

    @Override // com.google.common.collect.f9
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return get(rowKey, columnKey) != null;
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object columnKey) {
        return super.containsColumn(columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object rowKey) {
        return super.containsRow(rowKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.q
    public abstract ImmutableSet<f9.a<R, C, V>> createCellSet();

    @Override // com.google.common.collect.q
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return super.get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final V put(R rowKey, C columnKey, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public final void putAll(f9<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public final V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map row(Object rowKey) {
        return row((ImmutableTable<R, C, V>) rowKey);
    }

    @Override // com.google.common.collect.f9
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.q
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    @go.d
    @go.c
    public abstract Object writeReplace();

    public static <R, C, V> ImmutableTable<R, C, V> of(R rowKey, C columnKey, V value) {
        return new s8(rowKey, columnKey, value);
    }

    @p5
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction) {
        return r9.k(rowFunction, columnFunction, valueFunction, mergeFunction);
    }

    @Override // com.google.common.collect.q
    public final aa<f9.a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableSet<f9.a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // com.google.common.collect.f9
    public ImmutableMap<R, V> column(C columnKey) {
        Preconditions.checkNotNull(columnKey, "columnKey");
        return (ImmutableMap) ho.b0.a((ImmutableMap) columnMap().get(columnKey), ImmutableMap.of());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.f9
    public ImmutableMap<C, V> row(R rowKey) {
        Preconditions.checkNotNull(rowKey, "rowKey");
        return (ImmutableMap) ho.b0.a((ImmutableMap) rowMap().get(rowKey), ImmutableMap.of());
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.q, com.google.common.collect.f9
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends f9.a<? extends R, ? extends C, ? extends V>> cells) {
        a builder = builder();
        Iterator<? extends f9.a<? extends R, ? extends C, ? extends V>> it = cells.iterator();
        while (it.hasNext()) {
            builder.f(it.next());
        }
        return builder.a();
    }
}
