package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.f9;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public class s8<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: a, reason: collision with root package name */
    public final R f33847a;

    /* renamed from: b, reason: collision with root package name */
    public final C f33848b;

    /* renamed from: c, reason: collision with root package name */
    public final V f33849c;

    public s8(R r11, C c11, V v11) {
        this.f33847a = (R) Preconditions.checkNotNull(r11);
        this.f33848b = (C) Preconditions.checkNotNull(c11);
        this.f33849c = (V) Preconditions.checkNotNull(v11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public /* bridge */ /* synthetic */ Map column(Object columnKey) {
        return column((s8<R, C, V>) columnKey);
    }

    @Override // com.google.common.collect.f9
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    @go.d
    @go.c
    public Object writeReplace() {
        return ImmutableTable.b.a(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<R, V> column(C columnKey) {
        Preconditions.checkNotNull(columnKey);
        return containsColumn(columnKey) ? ImmutableMap.of(this.f33847a, (Object) this.f33849c) : ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.f33848b, ImmutableMap.of(this.f33847a, (Object) this.f33849c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q
    public ImmutableSet<f9.a<R, C, V>> createCellSet() {
        return ImmutableSet.of(ImmutableTable.cellOf(this.f33847a, this.f33848b, this.f33849c));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.of(this.f33849c);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.f9
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.f33847a, ImmutableMap.of(this.f33848b, (Object) this.f33849c));
    }

    public s8(f9.a<R, C, V> cell) {
        this(cell.b(), cell.a(), cell.getValue());
    }
}
