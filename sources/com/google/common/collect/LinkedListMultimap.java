package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.g7;
import com.google.common.collect.q8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public class LinkedListMultimap<K, V> extends com.google.common.collect.h<K, V> implements p6<K, V>, Serializable {

    @go.d
    @go.c
    private static final long serialVersionUID = 0;

    @CheckForNull
    private transient g<K, V> head;
    private transient Map<K, f<K, V>> keyToKeyList;
    private transient int modCount;
    private transient int size;

    @CheckForNull
    private transient g<K, V> tail;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AbstractSequentialList<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f33126a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedListMultimap f33127b;

        public a(final LinkedListMultimap this$0, final Object val$key) {
            this.f33126a = val$key;
            this.f33127b = this$0;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            return new i(this.f33126a, index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f fVar = (f) this.f33127b.keyToKeyList.get(this.f33126a);
            if (fVar == null) {
                return 0;
            }
            return fVar.f33140c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AbstractSequentialList<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int index) {
            return new h(index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends q8.k<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object key) {
            return LinkedListMultimap.this.containsKey(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new e(LinkedListMultimap.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object o11) {
            return !LinkedListMultimap.this.removeAll(o11).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AbstractSequentialList<V> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends w9<Map.Entry<K, V>, V> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f33131b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f33132c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final d this$1, ListIterator backingIterator, final h val$nodeItr) {
                super(backingIterator);
                this.f33131b = val$nodeItr;
                this.f33132c = this$1;
            }

            @Override // com.google.common.collect.v9
            @t7
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public V a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }

            @Override // com.google.common.collect.w9, java.util.ListIterator
            public void set(@t7 V value) {
                this.f33131b.f(value);
            }
        }

        public d() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int index) {
            h hVar = new h(index);
            return new a(this, hVar, hVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return LinkedListMultimap.this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f33138a;

        /* renamed from: b, reason: collision with root package name */
        public g<K, V> f33139b;

        /* renamed from: c, reason: collision with root package name */
        public int f33140c;

        public f(g<K, V> firstNode) {
            this.f33138a = firstNode;
            this.f33139b = firstNode;
            firstNode.f33146f = null;
            firstNode.f33145e = null;
            this.f33140c = 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<K, V> extends com.google.common.collect.g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33141a;

        /* renamed from: b, reason: collision with root package name */
        @t7
        public V f33142b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33143c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33144d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33145e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33146f;

        public g(@t7 K key, @t7 V value) {
            this.f33141a = key;
            this.f33142b = value;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public K getKey() {
            return this.f33141a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V getValue() {
            return this.f33142b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @t7
        public V setValue(@t7 V newValue) {
            V v11 = this.f33142b;
            this.f33142b = newValue;
            return v11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements ListIterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f33147a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33148b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33149c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33150d;

        /* renamed from: e, reason: collision with root package name */
        public int f33151e;

        public h(int index) {
            this.f33151e = LinkedListMultimap.this.modCount;
            int size = LinkedListMultimap.this.size();
            Preconditions.checkPositionIndex(index, size);
            if (index < size / 2) {
                this.f33148b = LinkedListMultimap.this.head;
                while (true) {
                    int i11 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i11;
                }
            } else {
                this.f33150d = LinkedListMultimap.this.tail;
                this.f33147a = size;
                while (true) {
                    int i12 = index + 1;
                    if (index >= size) {
                        break;
                    }
                    previous();
                    index = i12;
                }
            }
            this.f33149c = null;
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> e11) {
            throw new UnsupportedOperationException();
        }

        public final void b() {
            if (LinkedListMultimap.this.modCount != this.f33151e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @uo.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g<K, V> next() {
            b();
            g<K, V> gVar = this.f33148b;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f33149c = gVar;
            this.f33150d = gVar;
            this.f33148b = gVar.f33143c;
            this.f33147a++;
            return gVar;
        }

        @Override // java.util.ListIterator
        @uo.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g<K, V> previous() {
            b();
            g<K, V> gVar = this.f33150d;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f33149c = gVar;
            this.f33148b = gVar;
            this.f33150d = gVar.f33144d;
            this.f33147a--;
            return gVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> e11) {
            throw new UnsupportedOperationException();
        }

        public void f(@t7 V value) {
            Preconditions.checkState(this.f33149c != null);
            this.f33149c.f33142b = value;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f33148b != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            return this.f33150d != null;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f33147a;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f33147a - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            Preconditions.checkState(this.f33149c != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f33149c;
            if (gVar != this.f33148b) {
                this.f33150d = gVar.f33144d;
                this.f33147a--;
            } else {
                this.f33148b = gVar.f33143c;
            }
            LinkedListMultimap.this.removeNode(gVar);
            this.f33149c = null;
            this.f33151e = LinkedListMultimap.this.modCount;
        }
    }

    public LinkedListMultimap() {
        this(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @uo.a
    public g<K, V> addNode(@t7 K key, @t7 V value, @CheckForNull g<K, V> nextSibling) {
        g<K, V> gVar = new g<>(key, value);
        if (this.head == null) {
            this.tail = gVar;
            this.head = gVar;
            this.keyToKeyList.put(key, new f<>(gVar));
            this.modCount++;
        } else if (nextSibling == null) {
            g<K, V> gVar2 = this.tail;
            Objects.requireNonNull(gVar2);
            gVar2.f33143c = gVar;
            gVar.f33144d = this.tail;
            this.tail = gVar;
            f<K, V> fVar = this.keyToKeyList.get(key);
            if (fVar == null) {
                this.keyToKeyList.put(key, new f<>(gVar));
                this.modCount++;
            } else {
                fVar.f33140c++;
                g<K, V> gVar3 = fVar.f33139b;
                gVar3.f33145e = gVar;
                gVar.f33146f = gVar3;
                fVar.f33139b = gVar;
            }
        } else {
            f<K, V> fVar2 = this.keyToKeyList.get(key);
            Objects.requireNonNull(fVar2);
            fVar2.f33140c++;
            gVar.f33144d = nextSibling.f33144d;
            gVar.f33146f = nextSibling.f33146f;
            gVar.f33143c = nextSibling;
            gVar.f33145e = nextSibling;
            g<K, V> gVar4 = nextSibling.f33146f;
            if (gVar4 == null) {
                fVar2.f33138a = gVar;
            } else {
                gVar4.f33145e = gVar;
            }
            g<K, V> gVar5 = nextSibling.f33144d;
            if (gVar5 == null) {
                this.head = gVar;
            } else {
                gVar5.f33143c = gVar;
            }
            nextSibling.f33144d = gVar;
            nextSibling.f33146f = gVar;
        }
        this.size++;
        return gVar;
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    private List<V> getCopy(@t7 K key) {
        return Collections.unmodifiableList(q6.s(new i(key)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.d
    @go.c
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.keyToKeyList = c3.k0();
        int readInt = stream.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllNodes(@t7 K key) {
        l6.g(new i(key));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNode(g<K, V> node) {
        g<K, V> gVar = node.f33144d;
        if (gVar != null) {
            gVar.f33143c = node.f33143c;
        } else {
            this.head = node.f33143c;
        }
        g<K, V> gVar2 = node.f33143c;
        if (gVar2 != null) {
            gVar2.f33144d = gVar;
        } else {
            this.tail = gVar;
        }
        if (node.f33146f == null && node.f33145e == null) {
            f<K, V> remove = this.keyToKeyList.remove(node.f33141a);
            Objects.requireNonNull(remove);
            remove.f33140c = 0;
            this.modCount++;
        } else {
            f<K, V> fVar = this.keyToKeyList.get(node.f33141a);
            Objects.requireNonNull(fVar);
            fVar.f33140c--;
            g<K, V> gVar3 = node.f33146f;
            if (gVar3 == null) {
                g<K, V> gVar4 = node.f33145e;
                Objects.requireNonNull(gVar4);
                fVar.f33138a = gVar4;
            } else {
                gVar3.f33145e = node.f33145e;
            }
            g<K, V> gVar5 = node.f33145e;
            if (gVar5 == null) {
                g<K, V> gVar6 = node.f33146f;
                Objects.requireNonNull(gVar6);
                fVar.f33139b = gVar6;
            } else {
                gVar5.f33146f = node.f33146f;
            }
        }
        this.size--;
    }

    @go.d
    @go.c
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.d7
    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object key, @CheckForNull Object value) {
        return super.containsEntry(key, value);
    }

    @Override // com.google.common.collect.d7
    public boolean containsKey(@CheckForNull Object key) {
        return this.keyToKeyList.containsKey(key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    @Override // com.google.common.collect.h
    public Map<K, Collection<V>> createAsMap() {
        return new g7.a(this);
    }

    @Override // com.google.common.collect.h
    public Set<K> createKeySet() {
        return new c();
    }

    @Override // com.google.common.collect.h
    public j7<K> createKeys() {
        return new g7.g(this);
    }

    @Override // com.google.common.collect.h
    public Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public /* bridge */ /* synthetic */ Collection get(@t7 final Object key) {
        return get((LinkedListMultimap<K, V>) key);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public /* bridge */ /* synthetic */ j7 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public boolean put(@t7 K key, @t7 V value) {
        addNode(key, value, null);
        return true;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public /* bridge */ /* synthetic */ Collection replaceValues(@t7 Object key, Iterable values) {
        return replaceValues((LinkedListMultimap<K, V>) key, values);
    }

    @Override // com.google.common.collect.d7
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private LinkedListMultimap(int expectedKeys) {
        this.keyToKeyList = v7.d(expectedKeys);
    }

    public static <K, V> LinkedListMultimap<K, V> create(int expectedKeys) {
        return new LinkedListMultimap<>(expectedKeys);
    }

    @Override // com.google.common.collect.h
    public List<Map.Entry<K, V>> createEntries() {
        return new b();
    }

    @Override // com.google.common.collect.h
    public List<V> createValues() {
        return new d();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    public List<V> get(@t7 final K key) {
        return new a(this, key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.d7
    @uo.a
    public /* bridge */ /* synthetic */ boolean putAll(@t7 Object key, Iterable values) {
        return super.putAll(key, values);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public List<V> removeAll(@CheckForNull Object key) {
        List<V> copy = getCopy(key);
        removeAllNodes(key);
        return copy;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7, com.google.common.collect.p6
    @uo.a
    public List<V> replaceValues(@t7 K key, Iterable<? extends V> values) {
        List<V> copy = getCopy(key);
        i iVar = new i(key);
        Iterator<? extends V> it = values.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return copy;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.d7
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> LinkedListMultimap<K, V> create(d7<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Iterator<K> {

        /* renamed from: a, reason: collision with root package name */
        public final Set<K> f33133a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33134b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33135c;

        /* renamed from: d, reason: collision with root package name */
        public int f33136d;

        public e() {
            this.f33133a = q8.y(LinkedListMultimap.this.keySet().size());
            this.f33134b = LinkedListMultimap.this.head;
            this.f33136d = LinkedListMultimap.this.modCount;
        }

        public final void a() {
            if (LinkedListMultimap.this.modCount != this.f33136d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f33134b != null;
        }

        @Override // java.util.Iterator
        @t7
        public K next() {
            g<K, V> gVar;
            a();
            g<K, V> gVar2 = this.f33134b;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            this.f33135c = gVar2;
            this.f33133a.add(gVar2.f33141a);
            do {
                gVar = this.f33134b.f33143c;
                this.f33134b = gVar;
                if (gVar == null) {
                    break;
                }
            } while (!this.f33133a.add(gVar.f33141a));
            return this.f33135c.f33141a;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            Preconditions.checkState(this.f33135c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.removeAllNodes(this.f33135c.f33141a);
            this.f33135c = null;
            this.f33136d = LinkedListMultimap.this.modCount;
        }

        public /* synthetic */ e(LinkedListMultimap linkedListMultimap, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements ListIterator<V> {

        /* renamed from: a, reason: collision with root package name */
        @t7
        public final K f33153a;

        /* renamed from: b, reason: collision with root package name */
        public int f33154b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33155c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33156d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public g<K, V> f33157e;

        public i(@t7 K key) {
            this.f33153a = key;
            f fVar = (f) LinkedListMultimap.this.keyToKeyList.get(key);
            this.f33155c = fVar == null ? null : fVar.f33138a;
        }

        @Override // java.util.ListIterator
        public void add(@t7 V value) {
            this.f33157e = LinkedListMultimap.this.addNode(this.f33153a, value, this.f33155c);
            this.f33154b++;
            this.f33156d = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f33155c != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f33157e != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @t7
        @uo.a
        public V next() {
            g<K, V> gVar = this.f33155c;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f33156d = gVar;
            this.f33157e = gVar;
            this.f33155c = gVar.f33145e;
            this.f33154b++;
            return gVar.f33142b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f33154b;
        }

        @Override // java.util.ListIterator
        @t7
        @uo.a
        public V previous() {
            g<K, V> gVar = this.f33157e;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            this.f33156d = gVar;
            this.f33155c = gVar;
            this.f33157e = gVar.f33146f;
            this.f33154b--;
            return gVar.f33142b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f33154b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f33156d != null, "no calls to next() since the last call to remove()");
            g<K, V> gVar = this.f33156d;
            if (gVar != this.f33155c) {
                this.f33157e = gVar.f33146f;
                this.f33154b--;
            } else {
                this.f33155c = gVar.f33145e;
            }
            LinkedListMultimap.this.removeNode(gVar);
            this.f33156d = null;
        }

        @Override // java.util.ListIterator
        public void set(@t7 V value) {
            Preconditions.checkState(this.f33156d != null);
            this.f33156d.f33142b = value;
        }

        public i(@t7 K key, int index) {
            f fVar = (f) LinkedListMultimap.this.keyToKeyList.get(key);
            int i11 = fVar == null ? 0 : fVar.f33140c;
            Preconditions.checkPositionIndex(index, i11);
            if (index >= i11 / 2) {
                this.f33157e = fVar == null ? null : fVar.f33139b;
                this.f33154b = i11;
                while (true) {
                    int i12 = index + 1;
                    if (index >= i11) {
                        break;
                    }
                    previous();
                    index = i12;
                }
            } else {
                this.f33155c = fVar == null ? null : fVar.f33138a;
                while (true) {
                    int i13 = index - 1;
                    if (index <= 0) {
                        break;
                    }
                    next();
                    index = i13;
                }
            }
            this.f33153a = key;
            this.f33156d = null;
        }
    }

    private LinkedListMultimap(d7<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }
}
