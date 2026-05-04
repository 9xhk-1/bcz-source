package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.f9;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class s9 {

    /* renamed from: a, reason: collision with root package name */
    public static final ho.r<? extends Map<?, ?>, ? extends Map<?, ?>> f33850a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ho.r<Map<Object, Object>, Map<Object, Object>> {
        @Override // ho.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> input) {
            return Collections.unmodifiableMap(input);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<R, C, V> implements f9.a<R, C, V> {
        @Override // com.google.common.collect.f9.a
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof f9.a) {
                f9.a aVar = (f9.a) obj;
                if (ho.d0.a(b(), aVar.b()) && ho.d0.a(a(), aVar.a()) && ho.d0.a(getValue(), aVar.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.f9.a
        public int hashCode() {
            return ho.d0.b(b(), a(), getValue());
        }

        public String toString() {
            return pn.j.f81006c + b() + "," + a() + ")=" + getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<R, C, V> extends b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final R f33851a;

        /* renamed from: b, reason: collision with root package name */
        @t7
        public final C f33852b;

        /* renamed from: c, reason: collision with root package name */
        @t7
        public final V f33853c;

        public c(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
            this.f33851a = rowKey;
            this.f33852b = columnKey;
            this.f33853c = value;
        }

        @Override // com.google.common.collect.f9.a
        @t7
        public C a() {
            return this.f33852b;
        }

        @Override // com.google.common.collect.f9.a
        @t7
        public R b() {
            return this.f33851a;
        }

        @Override // com.google.common.collect.f9.a
        @t7
        public V getValue() {
            return this.f33853c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<R, C, V1, V2> extends q<R, C, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final f9<R, C, V1> f33854a;

        /* renamed from: b, reason: collision with root package name */
        public final ho.r<? super V1, V2> f33855b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements ho.r<f9.a<R, C, V1>, f9.a<R, C, V2>> {
            public a() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f9.a<R, C, V2> apply(f9.a<R, C, V1> cell) {
                return s9.d(cell.b(), cell.a(), d.this.f33855b.apply(cell.getValue()));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements ho.r<Map<C, V1>, Map<C, V2>> {
            public b() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V2> apply(Map<C, V1> row) {
                return u6.D0(row, d.this.f33855b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements ho.r<Map<R, V1>, Map<R, V2>> {
            public c() {
            }

            @Override // ho.r
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V2> apply(Map<R, V1> column) {
                return u6.D0(column, d.this.f33855b);
            }
        }

        public d(f9<R, C, V1> fromTable, ho.r<? super V1, V2> function) {
            this.f33854a = (f9) Preconditions.checkNotNull(fromTable);
            this.f33855b = (ho.r) Preconditions.checkNotNull(function);
        }

        public ho.r<f9.a<R, C, V1>, f9.a<R, C, V2>> a() {
            return new a();
        }

        @Override // com.google.common.collect.q
        public Iterator<f9.a<R, C, V2>> cellIterator() {
            return l6.b0(this.f33854a.cellSet().iterator(), a());
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public void clear() {
            this.f33854a.clear();
        }

        @Override // com.google.common.collect.f9
        public Map<R, V2> column(@t7 C columnKey) {
            return u6.D0(this.f33854a.column(columnKey), this.f33855b);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public Set<C> columnKeySet() {
            return this.f33854a.columnKeySet();
        }

        @Override // com.google.common.collect.f9
        public Map<C, Map<R, V2>> columnMap() {
            return u6.D0(this.f33854a.columnMap(), new c());
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.f33854a.contains(rowKey, columnKey);
        }

        @Override // com.google.common.collect.q
        public Collection<V2> createValues() {
            return y2.m(this.f33854a.values(), this.f33855b);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V2 get(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (contains(obj, obj2)) {
                return this.f33855b.apply((Object) m7.a(this.f33854a.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V2 put(@t7 R rowKey, @t7 C columnKey, @t7 V2 value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public void putAll(f9<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V2 remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
            if (contains(obj, obj2)) {
                return this.f33855b.apply((Object) m7.a(this.f33854a.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.f9
        public Map<C, V2> row(@t7 R rowKey) {
            return u6.D0(this.f33854a.row(rowKey), this.f33855b);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public Set<R> rowKeySet() {
            return this.f33854a.rowKeySet();
        }

        @Override // com.google.common.collect.f9
        public Map<R, Map<C, V2>> rowMap() {
            return u6.D0(this.f33854a.rowMap(), new b());
        }

        @Override // com.google.common.collect.f9
        public int size() {
            return this.f33854a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<C, R, V> extends q<C, R, V> {

        /* renamed from: a, reason: collision with root package name */
        public final f9<R, C, V> f33859a;

        public e(f9<R, C, V> original) {
            this.f33859a = (f9) Preconditions.checkNotNull(original);
        }

        @Override // com.google.common.collect.q
        public Iterator<f9.a<C, R, V>> cellIterator() {
            return l6.b0(this.f33859a.cellSet().iterator(), new ho.r() { // from class: com.google.common.collect.t9
                @Override // ho.r
                public final Object apply(Object obj) {
                    f9.a k11;
                    k11 = s9.k((f9.a) obj);
                    return k11;
                }
            });
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public void clear() {
            this.f33859a.clear();
        }

        @Override // com.google.common.collect.f9
        public Map<C, V> column(@t7 R columnKey) {
            return this.f33859a.row(columnKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public Set<R> columnKeySet() {
            return this.f33859a.rowKeySet();
        }

        @Override // com.google.common.collect.f9
        public Map<R, Map<C, V>> columnMap() {
            return this.f33859a.rowMap();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.f33859a.contains(columnKey, rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public boolean containsColumn(@CheckForNull Object columnKey) {
            return this.f33859a.containsRow(columnKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public boolean containsRow(@CheckForNull Object rowKey) {
            return this.f33859a.containsColumn(rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public boolean containsValue(@CheckForNull Object value) {
            return this.f33859a.containsValue(value);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.f33859a.get(columnKey, rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V put(@t7 C rowKey, @t7 R columnKey, @t7 V value) {
            return this.f33859a.put(columnKey, rowKey, value);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public void putAll(f9<? extends C, ? extends R, ? extends V> table) {
            this.f33859a.putAll(s9.j(table));
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        @CheckForNull
        public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            return this.f33859a.remove(columnKey, rowKey);
        }

        @Override // com.google.common.collect.f9
        public Map<R, V> row(@t7 C rowKey) {
            return this.f33859a.column(rowKey);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public Set<C> rowKeySet() {
            return this.f33859a.columnKeySet();
        }

        @Override // com.google.common.collect.f9
        public Map<C, Map<R, V>> rowMap() {
            return this.f33859a.columnMap();
        }

        @Override // com.google.common.collect.f9
        public int size() {
            return this.f33859a.size();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.f9
        public Collection<V> values() {
            return this.f33859a.values();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<R, C, V> extends g<R, C, V> implements n8<R, C, V> {
        private static final long serialVersionUID = 0;

        public f(n8<R, ? extends C, ? extends V> delegate) {
            super(delegate);
        }

        @Override // com.google.common.collect.s9.g, com.google.common.collect.k5
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public n8<R, C, V> delegate() {
            return (n8) super.delegate();
        }

        @Override // com.google.common.collect.s9.g, com.google.common.collect.k5, com.google.common.collect.f9
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }

        @Override // com.google.common.collect.s9.g, com.google.common.collect.k5, com.google.common.collect.f9
        public SortedMap<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableSortedMap(u6.F0(delegate().rowMap(), s9.n()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<R, C, V> extends k5<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final f9<? extends R, ? extends C, ? extends V> f33860a;

        public g(f9<? extends R, ? extends C, ? extends V> delegate) {
            this.f33860a = (f9) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Set<f9.a<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Map<R, V> column(@t7 C columnKey) {
            return Collections.unmodifiableMap(super.column(columnKey));
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(u6.D0(super.columnMap(), s9.n()));
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        @CheckForNull
        public V put(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public void putAll(f9<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        @CheckForNull
        public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Map<C, V> row(@t7 R rowKey) {
            return Collections.unmodifiableMap(super.row(rowKey));
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(u6.D0(super.rowMap(), s9.n()));
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.f9
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }

        @Override // com.google.common.collect.k5, com.google.common.collect.c5
        /* renamed from: w */
        public f9<R, C, V> delegate() {
            return this.f33860a;
        }
    }

    public static boolean c(f9<?, ?, ?> table, @CheckForNull Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof f9) {
            return table.cellSet().equals(((f9) obj).cellSet());
        }
        return false;
    }

    public static <R, C, V> f9.a<R, C, V> d(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
        return new c(rowKey, columnKey, value);
    }

    public static <R, C, V> f9<R, C, V> e(Map<R, Map<C, V>> backingMap, ho.p0<? extends Map<C, V>> factory) {
        Preconditions.checkArgument(backingMap.isEmpty());
        Preconditions.checkNotNull(factory);
        return new d9(backingMap, factory);
    }

    @go.d
    public static <R, C, V> f9<R, C, V> f(f9<R, C, V> table) {
        return e9.z(table, null);
    }

    @p5
    public static <T, R, C, V, I extends f9<R, C, V>> Collector<T, ?, I> g(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier) {
        return r9.l(rowFunction, columnFunction, valueFunction, mergeFunction, tableSupplier);
    }

    @p5
    public static <T, R, C, V, I extends f9<R, C, V>> Collector<T, ?, I> h(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, Supplier<I> tableSupplier) {
        return r9.m(rowFunction, columnFunction, valueFunction, tableSupplier);
    }

    public static <R, C, V1, V2> f9<R, C, V2> i(f9<R, C, V1> fromTable, ho.r<? super V1, V2> function) {
        return new d(fromTable, function);
    }

    public static <R, C, V> f9<C, R, V> j(f9<R, C, V> f9Var) {
        return f9Var instanceof e ? ((e) f9Var).f33859a : new e(f9Var);
    }

    public static <R, C, V> f9.a<C, R, V> k(f9.a<R, C, V> cell) {
        return d(cell.a(), cell.b(), cell.getValue());
    }

    public static <R, C, V> n8<R, C, V> l(n8<R, ? extends C, ? extends V> table) {
        return new f(table);
    }

    public static <R, C, V> f9<R, C, V> m(f9<? extends R, ? extends C, ? extends V> table) {
        return new g(table);
    }

    public static <K, V> ho.r<Map<K, V>, Map<K, V>> n() {
        return (ho.r<Map<K, V>, Map<K, V>>) f33850a;
    }
}
