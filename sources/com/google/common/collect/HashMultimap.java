package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class HashMultimap<K, V> extends n5<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 2;

    @go.d
    @go.c
    private static final long serialVersionUID = 0;

    @go.e
    transient int expectedValuesPerKey;

    private HashMultimap() {
        this(12, 2);
    }

    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap<>();
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int h11 = o8.h(stream);
        setMap(v7.d(12));
        o8.e(this, stream, h11);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        o8.j(this, stream);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object key) {
        return super.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object value) {
        return super.containsValue(value);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
        return super.get((HashMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ j7 keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean put(@t7 Object key, @t7 Object value) {
        return super.put(key, value);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(d7 multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        return super.remove(key, value);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Set removeAll(@CheckForNull Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Set replaceValues(@t7 Object key, Iterable values) {
        return super.replaceValues((HashMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private HashMultimap(int expectedKeys, int expectedValuesPerKey) {
        super(v7.d(expectedKeys));
        this.expectedValuesPerKey = 2;
        Preconditions.checkArgument(expectedValuesPerKey >= 0);
        this.expectedValuesPerKey = expectedValuesPerKey;
    }

    public static <K, V> HashMultimap<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new HashMultimap<>(expectedKeys, expectedValuesPerKey);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public Set<V> createCollection() {
        return v7.e(this.expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(@t7 Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K, V> HashMultimap<K, V> create(d7<? extends K, ? extends V> multimap) {
        return new HashMultimap<>(multimap);
    }

    private HashMultimap(d7<? extends K, ? extends V> multimap) {
        super(v7.d(multimap.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(multimap);
    }
}
