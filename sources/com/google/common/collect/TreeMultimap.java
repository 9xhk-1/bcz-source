package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class TreeMultimap<K, V> extends n<K, V> {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;
    private transient Comparator<? super K> keyComparator;
    private transient Comparator<? super V> valueComparator;

    public TreeMultimap(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        super(new TreeMap(keyComparator));
        this.keyComparator = keyComparator;
        this.valueComparator = valueComparator;
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create() {
        return new TreeMultimap<>(s7.z(), s7.z());
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) stream.readObject();
        Objects.requireNonNull(comparator);
        this.keyComparator = comparator;
        Comparator<? super V> comparator2 = (Comparator) stream.readObject();
        Objects.requireNonNull(comparator2);
        this.valueComparator = comparator2;
        setMap(new TreeMap(this.keyComparator));
        o8.d(this, stream);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(keyComparator());
        stream.writeObject(valueComparator());
        o8.j(this, stream);
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

    @Override // com.google.common.collect.e, com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
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
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @go.c
    public /* bridge */ /* synthetic */ Collection get(@t7 Object key) {
        return get((TreeMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Deprecated
    public Comparator<? super K> keyComparator() {
        return this.keyComparator;
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

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ SortedSet removeAll(@CheckForNull Object key) {
        return super.removeAll(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ SortedSet replaceValues(@t7 Object key, Iterable values) {
        return super.replaceValues((TreeMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.a9
    public Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    @Override // com.google.common.collect.p, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <K, V> TreeMultimap<K, V> create(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator) {
        return new TreeMultimap<>((Comparator) Preconditions.checkNotNull(keyComparator), (Comparator) Preconditions.checkNotNull(valueComparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @go.c
    public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
        return get((TreeMultimap<K, V>) key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(@t7 Object key, Iterable values) {
        return super.putAll(key, values);
    }

    public static <K extends Comparable, V extends Comparable> TreeMultimap<K, V> create(d7<? extends K, ? extends V> multimap) {
        return new TreeMultimap<>(s7.z(), s7.z(), multimap);
    }

    @Override // com.google.common.collect.n, com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public NavigableMap<K, Collection<V>> asMap() {
        return (NavigableMap) super.asMap();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
    public SortedSet<V> createCollection() {
        return new TreeSet(this.valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @go.c
    public /* bridge */ /* synthetic */ SortedSet get(@t7 Object key) {
        return get((TreeMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.n, com.google.common.collect.h, com.google.common.collect.d7
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    private TreeMultimap(Comparator<? super K> keyComparator, Comparator<? super V> valueComparator, d7<? extends K, ? extends V> multimap) {
        this(keyComparator, valueComparator);
        putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e
    public Collection<V> createCollection(@t7 K key) {
        if (key == 0) {
            keyComparator().compare(key, key);
        }
        return super.createCollection(key);
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    @go.c
    public NavigableSet<V> get(@t7 K key) {
        return (NavigableSet) super.get((TreeMultimap<K, V>) key);
    }
}
