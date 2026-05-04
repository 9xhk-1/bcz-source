package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends a<K, V> {

    @go.c
    private static final long serialVersionUID = 0;
    transient Class<K> keyTypeOrObjectUnderJ2cl;

    private EnumHashBiMap(Class<K> keyType) {
        super(new EnumMap(keyType), new HashMap());
        this.keyTypeOrObjectUnderJ2cl = keyType;
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Class<K> keyType) {
        return new EnumHashBiMap<>(keyType);
    }

    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        Objects.requireNonNull(readObject);
        this.keyTypeOrObjectUnderJ2cl = (Class) readObject;
        setDelegates(new EnumMap(this.keyTypeOrObjectUnderJ2cl), new HashMap());
        o8.b(this, stream);
    }

    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        o8.i(this, stream);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object forcePut(Object key, @t7 Object value) {
        return forcePut((EnumHashBiMap<K, V>) key, (Enum) value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.u
    public /* bridge */ /* synthetic */ u inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @go.c
    public Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object put(Object key, @t7 Object value) {
        return put((EnumHashBiMap<K, V>) key, (Enum) value);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object remove(@CheckForNull Object key) {
        return super.remove(key);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(Map<K, ? extends V> map) {
        EnumHashBiMap<K, V> create = create(EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map));
        create.putAll(map);
        return create;
    }

    @Override // com.google.common.collect.a
    public K checkKey(K key) {
        return (K) Preconditions.checkNotNull(key);
    }

    @CheckForNull
    @uo.a
    public V forcePut(K k11, @t7 V v11) {
        return (V) super.forcePut((EnumHashBiMap<K, V>) k11, (K) v11);
    }

    @CheckForNull
    @uo.a
    public V put(K k11, @t7 V v11) {
        return (V) super.put((EnumHashBiMap<K, V>) k11, (K) v11);
    }
}
