package com.google.common.collect;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public class r5<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    @t7
    public final K f33810a;

    /* renamed from: b, reason: collision with root package name */
    @t7
    public final V f33811b;

    public r5(@t7 K key, @t7 V value) {
        this.f33810a = key;
        this.f33811b = value;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @t7
    public final K getKey() {
        return this.f33810a;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @t7
    public final V getValue() {
        return this.f33811b;
    }

    @Override // com.google.common.collect.g, java.util.Map.Entry
    @t7
    public final V setValue(@t7 V value) {
        throw new UnsupportedOperationException();
    }
}
