package com.google.common.collect;

import com.google.common.collect.f9;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class k5<R, C, V> extends c5 implements f9<R, C, V> {
    @Override // com.google.common.collect.f9
    public Set<f9.a<R, C, V>> cellSet() {
        return delegate().cellSet();
    }

    @Override // com.google.common.collect.f9
    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.f9
    public Map<R, V> column(@t7 C columnKey) {
        return delegate().column(columnKey);
    }

    @Override // com.google.common.collect.f9
    public Set<C> columnKeySet() {
        return delegate().columnKeySet();
    }

    @Override // com.google.common.collect.f9
    public Map<C, Map<R, V>> columnMap() {
        return delegate().columnMap();
    }

    @Override // com.google.common.collect.f9
    public boolean contains(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return delegate().contains(rowKey, columnKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsColumn(@CheckForNull Object columnKey) {
        return delegate().containsColumn(columnKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsRow(@CheckForNull Object rowKey) {
        return delegate().containsRow(rowKey);
    }

    @Override // com.google.common.collect.f9
    public boolean containsValue(@CheckForNull Object value) {
        return delegate().containsValue(value);
    }

    @Override // com.google.common.collect.f9
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    public V get(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return delegate().get(rowKey, columnKey);
    }

    @Override // com.google.common.collect.f9
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.f9
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V put(@t7 R rowKey, @t7 C columnKey, @t7 V value) {
        return delegate().put(rowKey, columnKey, value);
    }

    @Override // com.google.common.collect.f9
    public void putAll(f9<? extends R, ? extends C, ? extends V> table) {
        delegate().putAll(table);
    }

    @Override // com.google.common.collect.f9
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object rowKey, @CheckForNull Object columnKey) {
        return delegate().remove(rowKey, columnKey);
    }

    @Override // com.google.common.collect.f9
    public Map<C, V> row(@t7 R rowKey) {
        return delegate().row(rowKey);
    }

    @Override // com.google.common.collect.f9
    public Set<R> rowKeySet() {
        return delegate().rowKeySet();
    }

    @Override // com.google.common.collect.f9
    public Map<R, Map<C, V>> rowMap() {
        return delegate().rowMap();
    }

    @Override // com.google.common.collect.f9
    public int size() {
        return delegate().size();
    }

    @Override // com.google.common.collect.f9
    public Collection<V> values() {
        return delegate().values();
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract f9<R, C, V> delegate();
}
