package com.google.common.collect;

import com.google.common.collect.e8;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class c8<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final c8<Object, Object> f33308f = new c8<>();

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    public final transient Object f33309a;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public final transient Object[] f33310b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f33311c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f33312d;

    /* renamed from: e, reason: collision with root package name */
    public final transient c8<V, K> f33313e;

    /* JADX WARN: Multi-variable type inference failed */
    public c8() {
        this.f33309a = null;
        this.f33310b = new Object[0];
        this.f33311c = 0;
        this.f33312d = 0;
        this.f33313e = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new e8.a(this, this.f33310b, this.f33311c, this.f33312d);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new e8.b(this, new e8.c(this.f33310b, this.f33311c, this.f33312d));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v11 = (V) e8.i(this.f33309a, this.f33310b, this.f33312d, this.f33311c, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f33312d;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    @go.d
    @go.c
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.u
    public ImmutableBiMap<V, K> inverse() {
        return this.f33313e;
    }

    public c8(Object[] alternatingKeysAndValues, int size) {
        this.f33310b = alternatingKeysAndValues;
        this.f33312d = size;
        this.f33311c = 0;
        int chooseTableSize = size >= 2 ? ImmutableSet.chooseTableSize(size) : 0;
        this.f33309a = e8.h(alternatingKeysAndValues, size, chooseTableSize, 0);
        this.f33313e = new c8<>(e8.h(alternatingKeysAndValues, size, chooseTableSize, 1), alternatingKeysAndValues, size, this);
    }

    public c8(@CheckForNull Object valueHashTable, Object[] alternatingKeysAndValues, int size, c8<V, K> inverse) {
        this.f33309a = valueHashTable;
        this.f33310b = alternatingKeysAndValues;
        this.f33311c = 1;
        this.f33312d = size;
        this.f33313e = inverse;
    }
}
