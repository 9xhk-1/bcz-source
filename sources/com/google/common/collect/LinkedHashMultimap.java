package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.q8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class LinkedHashMultimap<K, V> extends o6<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;

    @go.e
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;

    @go.d
    @go.c
    private static final long serialVersionUID = 1;
    private transient b<K, V> multimapHeaderEntry;

    @go.e
    transient int valueSetCapacity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public b<K, V> f33106a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f33107b;

        public a() {
            this.f33106a = LinkedHashMultimap.this.multimapHeaderEntry.e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f33106a;
            this.f33107b = bVar;
            this.f33106a = bVar.e();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33106a != LinkedHashMultimap.this.multimapHeaderEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f33107b != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f33107b.getKey(), this.f33107b.getValue());
            this.f33107b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class b<K, V> extends r5<K, V> implements d<K, V> {

        /* renamed from: c, reason: collision with root package name */
        public final int f33109c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f33110d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f33111e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public d<K, V> f33112f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f33113g;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        public b<K, V> f33114h;

        public b(@t7 K key, @t7 V value, int smearedValueHash, @CheckForNull b<K, V> nextInValueBucket) {
            super(key, value);
            this.f33109c = smearedValueHash;
            this.f33110d = nextInValueBucket;
        }

        public static <K, V> b<K, V> h() {
            return new b<>(null, null, 0, null);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> a() {
            d<K, V> dVar = this.f33111e;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void b(d<K, V> entry) {
            this.f33112f = entry;
        }

        public b<K, V> c() {
            b<K, V> bVar = this.f33113g;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void d(d<K, V> entry) {
            this.f33111e = entry;
        }

        public b<K, V> e() {
            b<K, V> bVar = this.f33114h;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> f() {
            d<K, V> dVar = this.f33112f;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        public boolean g(@CheckForNull Object v11, int smearedVHash) {
            return this.f33109c == smearedVHash && ho.d0.a(getValue(), v11);
        }

        public void i(b<K, V> multimapPredecessor) {
            this.f33113g = multimapPredecessor;
        }

        public void j(b<K, V> multimapSuccessor) {
            this.f33114h = multimapSuccessor;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public final class c extends q8.k<V> implements d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33115a;

        /* renamed from: b, reason: collision with root package name */
        @go.e
        public b<K, V>[] f33116b;

        /* renamed from: c, reason: collision with root package name */
        public int f33117c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f33118d = 0;

        /* renamed from: e, reason: collision with root package name */
        public d<K, V> f33119e = this;

        /* renamed from: f, reason: collision with root package name */
        public d<K, V> f33120f = this;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            public d<K, V> f33122a;

            /* renamed from: b, reason: collision with root package name */
            @CheckForNull
            public b<K, V> f33123b;

            /* renamed from: c, reason: collision with root package name */
            public int f33124c;

            public a() {
                this.f33122a = c.this.f33119e;
                this.f33124c = c.this.f33118d;
            }

            public final void a() {
                if (c.this.f33118d != this.f33124c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f33122a != c.this;
            }

            @Override // java.util.Iterator
            @t7
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.f33122a;
                V value = bVar.getValue();
                this.f33123b = bVar;
                this.f33122a = bVar.f();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                Preconditions.checkState(this.f33123b != null, "no calls to next() since the last call to remove()");
                c.this.remove(this.f33123b.getValue());
                this.f33124c = c.this.f33118d;
                this.f33123b = null;
            }
        }

        public c(@t7 K key, int expectedValues) {
            this.f33115a = key;
            this.f33116b = new b[o5.a(expectedValues, 1.0d)];
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> a() {
            return this.f33120f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@t7 V value) {
            int d11 = o5.d(value);
            int j11 = j() & d11;
            b<K, V> bVar = this.f33116b[j11];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f33110d) {
                if (bVar2.g(value, d11)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.f33115a, value, d11, bVar);
            LinkedHashMultimap.succeedsInValueSet(this.f33120f, bVar3);
            LinkedHashMultimap.succeedsInValueSet(bVar3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.c(), bVar3);
            LinkedHashMultimap.succeedsInMultimap(bVar3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f33116b[j11] = bVar3;
            this.f33117c++;
            this.f33118d++;
            k();
            return true;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void b(d<K, V> entry) {
            this.f33119e = entry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f33116b, (Object) null);
            this.f33117c = 0;
            for (d<K, V> dVar = this.f33119e; dVar != this; dVar = dVar.f()) {
                LinkedHashMultimap.deleteFromMultimap((b) dVar);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f33118d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object o11) {
            int d11 = o5.d(o11);
            for (b<K, V> bVar = this.f33116b[j() & d11]; bVar != null; bVar = bVar.f33110d) {
                if (bVar.g(o11, d11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void d(d<K, V> entry) {
            this.f33120f = entry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> f() {
            return this.f33119e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        public final int j() {
            return this.f33116b.length - 1;
        }

        public final void k() {
            if (o5.b(this.f33117c, this.f33116b.length, 1.0d)) {
                int length = this.f33116b.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.f33116b = bVarArr;
                int i11 = length - 1;
                for (d<K, V> dVar = this.f33119e; dVar != this; dVar = dVar.f()) {
                    b<K, V> bVar = (b) dVar;
                    int i12 = bVar.f33109c & i11;
                    bVar.f33110d = bVarArr[i12];
                    bVarArr[i12] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @uo.a
        public boolean remove(@CheckForNull Object o11) {
            int d11 = o5.d(o11);
            int j11 = j() & d11;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.f33116b[j11]; bVar2 != null; bVar2 = bVar2.f33110d) {
                if (bVar2.g(o11, d11)) {
                    if (bVar == null) {
                        this.f33116b[j11] = bVar2.f33110d;
                    } else {
                        bVar.f33110d = bVar2.f33110d;
                    }
                    LinkedHashMultimap.deleteFromValueSet(bVar2);
                    LinkedHashMultimap.deleteFromMultimap(bVar2);
                    this.f33117c--;
                    this.f33118d++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33117c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<K, V> {
        d<K, V> a();

        void b(d<K, V> entry);

        void d(d<K, V> entry);

        d<K, V> f();
    }

    private LinkedHashMultimap(int keyCapacity, int valueSetCapacity) {
        super(v7.f(keyCapacity));
        this.valueSetCapacity = 2;
        x2.b(valueSetCapacity, "expectedValuesPerKey");
        this.valueSetCapacity = valueSetCapacity;
        b<K, V> h11 = b.h();
        this.multimapHeaderEntry = h11;
        succeedsInMultimap(h11, h11);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(b<K, V> entry) {
        succeedsInMultimap(entry.c(), entry.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(d<K, V> entry) {
        succeedsInValueSet(entry.a(), entry.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        b<K, V> h11 = b.h();
        this.multimapHeaderEntry = h11;
        succeedsInMultimap(h11, h11);
        this.valueSetCapacity = 2;
        int readInt = stream.readInt();
        Map f11 = v7.f(12);
        for (int i11 = 0; i11 < readInt; i11++) {
            Object readObject = stream.readObject();
            f11.put(readObject, createCollection(readObject));
        }
        int readInt2 = stream.readInt();
        for (int i12 = 0; i12 < readInt2; i12++) {
            Object readObject2 = stream.readObject();
            Object readObject3 = stream.readObject();
            Collection collection = (Collection) f11.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        setMap(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(b<K, V> pred, b<K, V> succ) {
        pred.j(succ);
        succ.i(pred);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(d<K, V> pred, d<K, V> succ) {
        pred.b(succ);
        succ.d(pred);
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public void clear() {
        super.clear();
        b<K, V> bVar = this.multimapHeaderEntry;
        succeedsInMultimap(bVar, bVar);
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
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new a();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Set get(@t7 Object key) {
        return super.get((LinkedHashMultimap<K, V>) key);
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
    public Set<K> keySet() {
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
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((LinkedHashMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    public Iterator<V> valueIterator() {
        return u6.R0(entryIterator());
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int expectedKeys, int expectedValuesPerKey) {
        return new LinkedHashMultimap<>(u6.o(expectedKeys), u6.o(expectedValuesPerKey));
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    public Set<V> createCollection() {
        return v7.g(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(@t7 Object key, Iterable values) {
        return super.putAll(key, values);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public Set<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        return super.replaceValues((LinkedHashMultimap<K, V>) key, (Iterable) values);
    }

    @Override // com.google.common.collect.e
    public Collection<V> createCollection(@t7 K key) {
        return new c(key, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(d7<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> create = create(multimap.keySet().size(), 2);
        create.putAll(multimap);
        return create;
    }
}
