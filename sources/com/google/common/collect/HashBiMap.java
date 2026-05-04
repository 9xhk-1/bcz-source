package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements u<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @vo.b
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @CheckForNull
    @vo.b
    private transient u<V, K> inverse;

    @vo.b
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @vo.b
    private transient Set<V> valueSet;
    transient V[] values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends com.google.common.collect.g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f32973a;

        /* renamed from: b, reason: collision with root package name */
        public int f32974b;

        public a(int i11) {
            this.f32973a = (K) m7.a(HashBiMap.this.keys[i11]);
            this.f32974b = i11;
        }

        public void c() {
            int i11 = this.f32974b;
            if (i11 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i11 <= hashBiMap.size && ho.d0.a(hashBiMap.keys[i11], this.f32973a)) {
                    return;
                }
            }
            this.f32974b = HashBiMap.this.findEntryByKey(this.f32973a);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getKey() {
            return this.f32973a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V getValue() {
            c();
            int i11 = this.f32974b;
            return i11 == -1 ? (V) m7.b() : (V) m7.a(HashBiMap.this.values[i11]);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V setValue(@t7 V v11) {
            c();
            int i11 = this.f32974b;
            if (i11 == -1) {
                HashBiMap.this.put(this.f32973a, v11);
                return (V) m7.b();
            }
            V v12 = (V) m7.a(HashBiMap.this.values[i11]);
            if (ho.d0.a(v12, v11)) {
                return v11;
            }
            HashBiMap.this.replaceValueInEntry(this.f32974b, v11, false);
            return v12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends com.google.common.collect.g<V, K> {

        /* renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f32976a;

        /* renamed from: b, reason: collision with root package name */
        @t7
        public final V f32977b;

        /* renamed from: c, reason: collision with root package name */
        public int f32978c;

        public b(HashBiMap<K, V> hashBiMap, int i11) {
            this.f32976a = hashBiMap;
            this.f32977b = (V) m7.a(hashBiMap.values[i11]);
            this.f32978c = i11;
        }

        private void c() {
            int i11 = this.f32978c;
            if (i11 != -1) {
                HashBiMap<K, V> hashBiMap = this.f32976a;
                if (i11 <= hashBiMap.size && ho.d0.a(this.f32977b, hashBiMap.values[i11])) {
                    return;
                }
            }
            this.f32978c = this.f32976a.findEntryByValue(this.f32977b);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V getKey() {
            return this.f32977b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getValue() {
            c();
            int i11 = this.f32978c;
            return i11 == -1 ? (K) m7.b() : (K) m7.a(this.f32976a.keys[i11]);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K setValue(@t7 K k11) {
            c();
            int i11 = this.f32978c;
            if (i11 == -1) {
                this.f32976a.putInverse(this.f32977b, k11, false);
                return (K) m7.b();
            }
            K k12 = (K) m7.a(this.f32976a.keys[i11]);
            if (ho.d0.a(k12, k11)) {
                return k11;
            }
            this.f32976a.replaceKeyInEntry(this.f32978c, k11, false);
            return k12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends h<K, V, Map.Entry<K, V>> {
        public c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int entry) {
            return new a(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o11;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int findEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (findEntryByKey != -1 && ho.d0.a(value, HashBiMap.this.values[findEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @uo.a
        public boolean remove(@CheckForNull Object o11) {
            if (!(o11 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o11;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d11 = o5.d(key);
            int findEntryByKey = HashBiMap.this.findEntryByKey(key, d11);
            if (findEntryByKey == -1 || !ho.d0.a(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, d11);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<K, V> extends AbstractMap<V, K> implements u<V, K>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f32980a;

        /* renamed from: b, reason: collision with root package name */
        public transient Set<Map.Entry<V, K>> f32981b;

        public d(HashBiMap<K, V> forward) {
            this.f32980a = forward;
        }

        @go.c("serialization")
        private void readObject(ObjectInputStream in2) throws ClassNotFoundException, IOException {
            in2.defaultReadObject();
            ((HashBiMap) this.f32980a).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f32980a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object key) {
            return this.f32980a.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object value) {
            return this.f32980a.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f32981b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f32980a);
            this.f32981b = eVar;
            return eVar;
        }

        @Override // com.google.common.collect.u
        @CheckForNull
        @uo.a
        public K forcePut(@t7 V value, @t7 K key) {
            return this.f32980a.putInverse(value, key, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object key) {
            return this.f32980a.getInverse(key);
        }

        @Override // com.google.common.collect.u
        public u<K, V> inverse() {
            return this.f32980a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f32980a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.u
        @CheckForNull
        @uo.a
        public K put(@t7 V value, @t7 K key) {
            return this.f32980a.putInverse(value, key, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        @uo.a
        public K remove(@CheckForNull Object value) {
            return this.f32980a.removeInverse(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f32980a.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.u
        public Set<K> values() {
            return this.f32980a.keySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        public e(HashBiMap<K, V> biMap) {
            super(biMap);
        }

        @Override // com.google.common.collect.HashBiMap.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int entry) {
            return new b(this.f32984a, entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            if (o11 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) o11;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int findEntryByValue = this.f32984a.findEntryByValue(key);
                if (findEntryByValue != -1 && ho.d0.a(this.f32984a.keys[findEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            if (!(o11 instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o11;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d11 = o5.d(key);
            int findEntryByValue = this.f32984a.findEntryByValue(key, d11);
            if (findEntryByValue == -1 || !ho.d0.a(this.f32984a.keys[findEntryByValue], value)) {
                return false;
            }
            this.f32984a.removeEntryValueHashKnown(findEntryByValue, d11);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends h<K, V, K> {
        public f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        @t7
        public K a(int i11) {
            return (K) m7.a(HashBiMap.this.keys[i11]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return HashBiMap.this.containsKey(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            int d11 = o5.d(o11);
            int findEntryByKey = HashBiMap.this.findEntryByKey(o11, d11);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, d11);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends h<K, V, V> {
        public g() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.h
        @t7
        public V a(int i11) {
            return (V) m7.a(HashBiMap.this.values[i11]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            return HashBiMap.this.containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            int d11 = o5.d(o11);
            int findEntryByValue = HashBiMap.this.findEntryByValue(o11, d11);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, d11);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashBiMap<K, V> f32984a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public int f32985a;

            /* renamed from: b, reason: collision with root package name */
            public int f32986b = -1;

            /* renamed from: c, reason: collision with root package name */
            public int f32987c;

            /* renamed from: d, reason: collision with root package name */
            public int f32988d;

            public a() {
                this.f32985a = ((HashBiMap) h.this.f32984a).firstInInsertionOrder;
                HashBiMap<K, V> hashBiMap = h.this.f32984a;
                this.f32987c = hashBiMap.modCount;
                this.f32988d = hashBiMap.size;
            }

            public final void a() {
                if (h.this.f32984a.modCount != this.f32987c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f32985a != -2 && this.f32988d > 0;
            }

            @Override // java.util.Iterator
            @t7
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t11 = (T) h.this.a(this.f32985a);
                this.f32986b = this.f32985a;
                this.f32985a = ((HashBiMap) h.this.f32984a).nextInInsertionOrder[this.f32985a];
                this.f32988d--;
                return t11;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                x2.e(this.f32986b != -1);
                h.this.f32984a.removeEntry(this.f32986b);
                int i11 = this.f32985a;
                HashBiMap<K, V> hashBiMap = h.this.f32984a;
                if (i11 == hashBiMap.size) {
                    this.f32985a = this.f32986b;
                }
                this.f32986b = -1;
                this.f32987c = hashBiMap.modCount;
            }
        }

        public h(HashBiMap<K, V> biMap) {
            this.f32984a = biMap;
        }

        @t7
        public abstract T a(int entry);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f32984a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f32984a.size;
        }
    }

    private HashBiMap(int expectedSize) {
        init(expectedSize);
    }

    private int bucket(int hash) {
        return hash & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int bucket = bucket(keyHash);
        int[] iArr = this.hashTableKToV;
        int i11 = iArr[bucket];
        if (i11 == entry) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i12 = this.nextInBucketKToV[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.keys[entry]);
            }
            if (i11 == entry) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i13] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i12 = this.nextInBucketKToV[i11];
        }
    }

    private void deleteFromTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int bucket = bucket(valueHash);
        int[] iArr = this.hashTableVToK;
        int i11 = iArr[bucket];
        if (i11 == entry) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i12 = this.nextInBucketVToK[i11];
        while (true) {
            int i13 = i11;
            i11 = i12;
            if (i11 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.values[entry]);
            }
            if (i11 == entry) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i13] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i12 = this.nextInBucketVToK[i11];
        }
    }

    private void ensureCapacity(int i11) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i11) {
            int f11 = ImmutableCollection.b.f(iArr.length, i11);
            this.keys = (K[]) Arrays.copyOf(this.keys, f11);
            this.values = (V[]) Arrays.copyOf(this.values, f11);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, f11);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, f11);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, f11);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, f11);
        }
        if (this.hashTableKToV.length < i11) {
            int a11 = o5.a(i11, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(a11);
            this.hashTableVToK = createFilledWithAbsent(a11);
            for (int i12 = 0; i12 < this.size; i12++) {
                int bucket = bucket(o5.d(this.keys[i12]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i12] = iArr3[bucket];
                iArr3[bucket] = i12;
                int bucket2 = bucket(o5.d(this.values[i12]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i12] = iArr5[bucket2];
                iArr5[bucket2] = i12;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] array, int newSize) {
        int length = array.length;
        int[] copyOf = Arrays.copyOf(array, newSize);
        Arrays.fill(copyOf, length, newSize, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int entry, int keyHash) {
        Preconditions.checkArgument(entry != -1);
        int bucket = bucket(keyHash);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[entry] = iArr2[bucket];
        iArr2[bucket] = entry;
    }

    private void insertIntoTableVToK(int entry, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        int bucket = bucket(valueHash);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[entry] = iArr2[bucket];
        iArr2[bucket] = entry;
    }

    private void moveEntryToIndex(int src, int dest) {
        int i11;
        int i12;
        if (src == dest) {
            return;
        }
        int i13 = this.prevInInsertionOrder[src];
        int i14 = this.nextInInsertionOrder[src];
        setSucceeds(i13, dest);
        setSucceeds(dest, i14);
        K[] kArr = this.keys;
        K k11 = kArr[src];
        V[] vArr = this.values;
        V v11 = vArr[src];
        kArr[dest] = k11;
        vArr[dest] = v11;
        int bucket = bucket(o5.d(k11));
        int[] iArr = this.hashTableKToV;
        int i15 = iArr[bucket];
        if (i15 == src) {
            iArr[bucket] = dest;
        } else {
            int i16 = this.nextInBucketKToV[i15];
            while (true) {
                i11 = i15;
                i15 = i16;
                if (i15 == src) {
                    break;
                } else {
                    i16 = this.nextInBucketKToV[i15];
                }
            }
            this.nextInBucketKToV[i11] = dest;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int bucket2 = bucket(o5.d(v11));
        int[] iArr3 = this.hashTableVToK;
        int i17 = iArr3[bucket2];
        if (i17 == src) {
            iArr3[bucket2] = dest;
        } else {
            int i18 = this.nextInBucketVToK[i17];
            while (true) {
                i12 = i17;
                i17 = i18;
                if (i17 == src) {
                    break;
                } else {
                    i18 = this.nextInBucketVToK[i17];
                }
            }
            this.nextInBucketVToK[i12] = dest;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int h11 = o8.h(stream);
        init(16);
        o8.c(this, stream, h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int entry, @t7 K newKey, boolean force) {
        int i11;
        Preconditions.checkArgument(entry != -1);
        int d11 = o5.d(newKey);
        int findEntryByKey = findEntryByKey(newKey, d11);
        int i12 = this.lastInInsertionOrder;
        if (findEntryByKey == -1) {
            i11 = -2;
        } else {
            if (!force) {
                throw new IllegalArgumentException("Key already present in map: " + newKey);
            }
            i12 = this.prevInInsertionOrder[findEntryByKey];
            i11 = this.nextInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, d11);
            if (entry == this.size) {
                entry = findEntryByKey;
            }
        }
        if (i12 == entry) {
            i12 = this.prevInInsertionOrder[entry];
        } else if (i12 == this.size) {
            i12 = findEntryByKey;
        }
        if (i11 == entry) {
            findEntryByKey = this.nextInInsertionOrder[entry];
        } else if (i11 != this.size) {
            findEntryByKey = i11;
        }
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        deleteFromTableKToV(entry, o5.d(this.keys[entry]));
        this.keys[entry] = newKey;
        insertIntoTableKToV(entry, o5.d(newKey));
        setSucceeds(i12, entry);
        setSucceeds(entry, findEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int entry, @t7 V newValue, boolean force) {
        Preconditions.checkArgument(entry != -1);
        int d11 = o5.d(newValue);
        int findEntryByValue = findEntryByValue(newValue, d11);
        if (findEntryByValue != -1) {
            if (!force) {
                throw new IllegalArgumentException("Value already present in map: " + newValue);
            }
            removeEntryValueHashKnown(findEntryByValue, d11);
            if (entry == this.size) {
                entry = findEntryByValue;
            }
        }
        deleteFromTableVToK(entry, o5.d(this.values[entry]));
        this.values[entry] = newValue;
        insertIntoTableVToK(entry, d11);
    }

    private void setSucceeds(int prev, int next) {
        if (prev == -2) {
            this.firstInInsertionOrder = next;
        } else {
            this.nextInInsertionOrder[prev] = next;
        }
        if (next == -2) {
            this.lastInInsertionOrder = prev;
        } else {
            this.prevInInsertionOrder[next] = prev;
        }
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        o8.i(this, stream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return findEntryByKey(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object value) {
        return findEntryByValue(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.entrySet = cVar;
        return cVar;
    }

    public int findEntry(@CheckForNull Object o11, int oHash, int[] hashTable, int[] nextInBucket, Object[] array) {
        int i11 = hashTable[bucket(oHash)];
        while (i11 != -1) {
            if (ho.d0.a(array[i11], o11)) {
                return i11;
            }
            i11 = nextInBucket[i11];
        }
        return -1;
    }

    public int findEntryByKey(@CheckForNull Object key) {
        return findEntryByKey(key, o5.d(key));
    }

    public int findEntryByValue(@CheckForNull Object value) {
        return findEntryByValue(value, o5.d(value));
    }

    @Override // com.google.common.collect.u
    @CheckForNull
    @uo.a
    public V forcePut(@t7 K key, @t7 V value) {
        return put(key, value, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        int findEntryByKey = findEntryByKey(key);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    @CheckForNull
    public K getInverse(@CheckForNull Object value) {
        int findEntryByValue = findEntryByValue(value);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    public void init(int i11) {
        x2.b(i11, "expectedSize");
        int a11 = o5.a(i11, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i11];
        this.values = (V[]) new Object[i11];
        this.hashTableKToV = createFilledWithAbsent(a11);
        this.hashTableVToK = createFilledWithAbsent(a11);
        this.nextInBucketKToV = createFilledWithAbsent(i11);
        this.nextInBucketVToK = createFilledWithAbsent(i11);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i11);
        this.nextInInsertionOrder = createFilledWithAbsent(i11);
    }

    @Override // com.google.common.collect.u
    public u<V, K> inverse() {
        u<V, K> uVar = this.inverse;
        if (uVar != null) {
            return uVar;
        }
        d dVar = new d(this);
        this.inverse = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.keySet = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public V put(@t7 K key, @t7 V value) {
        return put(key, value, false);
    }

    @CheckForNull
    @uo.a
    public K putInverse(@t7 V value, @t7 K key, boolean force) {
        int d11 = o5.d(value);
        int findEntryByValue = findEntryByValue(value, d11);
        if (findEntryByValue != -1) {
            K k11 = this.keys[findEntryByValue];
            if (ho.d0.a(k11, key)) {
                return key;
            }
            replaceKeyInEntry(findEntryByValue, key, force);
            return k11;
        }
        int i11 = this.lastInInsertionOrder;
        int d12 = o5.d(key);
        int findEntryByKey = findEntryByKey(key, d12);
        if (!force) {
            Preconditions.checkArgument(findEntryByKey == -1, "Key already present: %s", key);
        } else if (findEntryByKey != -1) {
            i11 = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, d12);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i12 = this.size;
        kArr[i12] = key;
        this.values[i12] = value;
        insertIntoTableKToV(i12, d12);
        insertIntoTableVToK(this.size, d11);
        int i13 = i11 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i11];
        setSucceeds(i11, this.size);
        setSucceeds(this.size, i13);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object key) {
        int d11 = o5.d(key);
        int findEntryByKey = findEntryByKey(key, d11);
        if (findEntryByKey == -1) {
            return null;
        }
        V v11 = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, d11);
        return v11;
    }

    public void removeEntry(int entry) {
        removeEntryKeyHashKnown(entry, o5.d(this.keys[entry]));
    }

    public void removeEntryKeyHashKnown(int entry, int keyHash) {
        removeEntry(entry, keyHash, o5.d(this.values[entry]));
    }

    public void removeEntryValueHashKnown(int entry, int valueHash) {
        removeEntry(entry, o5.d(this.keys[entry]), valueHash);
    }

    @CheckForNull
    public K removeInverse(@CheckForNull Object value) {
        int d11 = o5.d(value);
        int findEntryByValue = findEntryByValue(value, d11);
        if (findEntryByValue == -1) {
            return null;
        }
        K k11 = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, d11);
        return k11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int expectedSize) {
        return new HashBiMap<>(expectedSize);
    }

    private void removeEntry(int entry, int keyHash, int valueHash) {
        Preconditions.checkArgument(entry != -1);
        deleteFromTableKToV(entry, keyHash);
        deleteFromTableVToK(entry, valueHash);
        setSucceeds(this.prevInInsertionOrder[entry], this.nextInInsertionOrder[entry]);
        moveEntryToIndex(this.size - 1, entry);
        K[] kArr = this.keys;
        int i11 = this.size;
        kArr[i11 - 1] = null;
        this.values[i11 - 1] = null;
        this.size = i11 - 1;
        this.modCount++;
    }

    public int findEntryByKey(@CheckForNull Object key, int keyHash) {
        return findEntry(key, keyHash, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(@CheckForNull Object value, int valueHash) {
        return findEntry(value, valueHash, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @CheckForNull
    public V put(@t7 K key, @t7 V value, boolean force) {
        int d11 = o5.d(key);
        int findEntryByKey = findEntryByKey(key, d11);
        if (findEntryByKey != -1) {
            V v11 = this.values[findEntryByKey];
            if (ho.d0.a(v11, value)) {
                return value;
            }
            replaceValueInEntry(findEntryByKey, value, force);
            return v11;
        }
        int d12 = o5.d(value);
        int findEntryByValue = findEntryByValue(value, d12);
        if (!force) {
            Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", value);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, d12);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i11 = this.size;
        kArr[i11] = key;
        this.values[i11] = value;
        insertIntoTableKToV(i11, d11);
        insertIntoTableVToK(this.size, d12);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.u
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.valueSet = gVar;
        return gVar;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}
