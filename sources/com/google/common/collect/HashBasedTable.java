package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public class HashBasedTable<R, C, V> extends d9<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<C, V> implements ho.p0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f32972a;

        public a(int expectedSize) {
            this.f32972a = expectedSize;
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return u6.e0(this.f32972a);
        }
    }

    public HashBasedTable(Map<R, Map<C, V>> backingMap, a<C, V> factory) {
        super(backingMap, factory);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new a(0));
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
        return super.row(rowKey);
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.q, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.d9, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
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

    public static <R, C, V> HashBasedTable<R, C, V> create(int expectedRows, int expectedCellsPerRow) {
        x2.b(expectedCellsPerRow, "expectedCellsPerRow");
        return new HashBasedTable<>(u6.e0(expectedRows), new a(expectedCellsPerRow));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(f9<? extends R, ? extends C, ? extends V> table) {
        HashBasedTable<R, C, V> create = create();
        create.putAll(table);
        return create;
    }
}
