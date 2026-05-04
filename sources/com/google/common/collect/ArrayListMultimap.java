package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class ArrayListMultimap<K, V> extends s<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 3;

    @go.d
    @go.c
    private static final long serialVersionUID = 0;

    @go.e
    transient int expectedValuesPerKey;

    private ArrayListMultimap() {
        this(12, 3);
    }

    public static <K, V> ArrayListMultimap<K, V> create() {
        return new ArrayListMultimap<>();
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int h11 = o8.h(stream);
        setMap(z2.w());
        o8.e(this, stream, h11);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        o8.j(this, stream);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
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

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ List get(@t7 Object key) {
        return super.get((ArrayListMultimap<K, V>) key);
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
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
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

    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ List removeAll(@CheckForNull Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ List replaceValues(@t7 Object key, Iterable values) {
        return super.replaceValues((ArrayListMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public void trimToSize() {
        Iterator<Collection<V>> it = backingMap().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private ArrayListMultimap(int expectedKeys, int expectedValuesPerKey) {
        super(v7.d(expectedKeys));
        x2.b(expectedValuesPerKey, "expectedValuesPerKey");
        this.expectedValuesPerKey = expectedValuesPerKey;
    }

    public static <K, V> ArrayListMultimap<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new ArrayListMultimap<>(expectedKeys, expectedValuesPerKey);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e
    public List<V> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(@t7 Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K, V> ArrayListMultimap<K, V> create(d7<? extends K, ? extends V> multimap) {
        return new ArrayListMultimap<>(multimap);
    }

    private ArrayListMultimap(d7<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size(), multimap instanceof ArrayListMultimap ? ((ArrayListMultimap) multimap).expectedValuesPerKey : 3);
        putAll(multimap);
    }
}
