package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class EnumBiMap<K extends Enum<K>, V extends Enum<V>> extends a<K, V> {

    @go.c
    private static final long serialVersionUID = 0;
    transient Class<K> keyTypeOrObjectUnderJ2cl;
    transient Class<V> valueTypeOrObjectUnderJ2cl;

    private EnumBiMap(Class<K> keyTypeOrObjectUnderJ2cl, Class<V> valueTypeOrObjectUnderJ2cl) {
        super(new EnumMap(keyTypeOrObjectUnderJ2cl), new EnumMap(valueTypeOrObjectUnderJ2cl));
        this.keyTypeOrObjectUnderJ2cl = keyTypeOrObjectUnderJ2cl;
        this.valueTypeOrObjectUnderJ2cl = valueTypeOrObjectUnderJ2cl;
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Class<K> keyType, Class<V> valueType) {
        return new EnumBiMap<>(keyType, valueType);
    }

    public static <K extends Enum<K>> Class<K> inferKeyTypeOrObjectUnderJ2cl(Map<K, ?> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        if (map instanceof EnumHashBiMap) {
            return ((EnumHashBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        Preconditions.checkArgument(!map.isEmpty());
        return v7.b(map.keySet().iterator().next());
    }

    private static <V extends Enum<V>> Class<V> inferValueTypeOrObjectUnderJ2cl(Map<?, V> map) {
        if (map instanceof EnumBiMap) {
            return ((EnumBiMap) map).valueTypeOrObjectUnderJ2cl;
        }
        Preconditions.checkArgument(!map.isEmpty());
        return v7.b(map.values().iterator().next());
    }

    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        Objects.requireNonNull(readObject);
        this.keyTypeOrObjectUnderJ2cl = (Class) readObject;
        Object readObject2 = stream.readObject();
        Objects.requireNonNull(readObject2);
        this.valueTypeOrObjectUnderJ2cl = (Class) readObject2;
        setDelegates(new EnumMap(this.keyTypeOrObjectUnderJ2cl), new EnumMap(this.valueTypeOrObjectUnderJ2cl));
        o8.b(this, stream);
    }

    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        stream.writeObject(this.valueTypeOrObjectUnderJ2cl);
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

    @Override // com.google.common.collect.a, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object forcePut(@t7 Object key, @t7 Object value) {
        return super.forcePut(key, value);
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

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object put(@t7 Object key, @t7 Object value) {
        return super.put(key, value);
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

    @go.c
    public Class<V> valueType() {
        return this.valueTypeOrObjectUnderJ2cl;
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }

    public static <K extends Enum<K>, V extends Enum<V>> EnumBiMap<K, V> create(Map<K, V> map) {
        EnumBiMap<K, V> create = create(inferKeyTypeOrObjectUnderJ2cl(map), inferValueTypeOrObjectUnderJ2cl(map));
        create.putAll(map);
        return create;
    }

    @Override // com.google.common.collect.a
    public K checkKey(K key) {
        return (K) Preconditions.checkNotNull(key);
    }

    @Override // com.google.common.collect.a
    public V checkValue(V value) {
        return (V) Preconditions.checkNotNull(value);
    }
}
