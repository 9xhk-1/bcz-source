package com.google.gson.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    final e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    int modCount;
    e<K, V> root;
    int size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.findByEntry((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = LinkedTreeMap.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends AbstractSet<K> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends LinkedTreeMap<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f34986f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LinkedTreeMap.this.removeInternalByKey(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.size;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public e<K, V> f34977a;

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f34978b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f34979c;

        public d() {
            this.f34977a = LinkedTreeMap.this.header.f34984d;
            this.f34979c = LinkedTreeMap.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f34977a;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.f34979c) {
                throw new ConcurrentModificationException();
            }
            this.f34977a = eVar.f34984d;
            this.f34978b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f34977a != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f34978b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(eVar, true);
            this.f34978b = null;
            this.f34979c = LinkedTreeMap.this.modCount;
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void rebalance(e<K, V> eVar, boolean z11) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f34982b;
            e<K, V> eVar3 = eVar.f34983c;
            int i11 = eVar2 != null ? eVar2.f34988h : 0;
            int i12 = eVar3 != null ? eVar3.f34988h : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f34982b;
                e<K, V> eVar5 = eVar3.f34983c;
                int i14 = (eVar4 != null ? eVar4.f34988h : 0) - (eVar5 != null ? eVar5.f34988h : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    rotateLeft(eVar);
                } else {
                    rotateRight(eVar3);
                    rotateLeft(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f34982b;
                e<K, V> eVar7 = eVar2.f34983c;
                int i15 = (eVar6 != null ? eVar6.f34988h : 0) - (eVar7 != null ? eVar7.f34988h : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    rotateRight(eVar);
                } else {
                    rotateLeft(eVar2);
                    rotateRight(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f34988h = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f34988h = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f34981a;
        }
    }

    private void replaceInParent(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f34981a;
        eVar.f34981a = null;
        if (eVar2 != null) {
            eVar2.f34981a = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f34982b == eVar) {
            eVar3.f34982b = eVar2;
        } else {
            eVar3.f34983c = eVar2;
        }
    }

    private void rotateLeft(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f34982b;
        e<K, V> eVar3 = eVar.f34983c;
        e<K, V> eVar4 = eVar3.f34982b;
        e<K, V> eVar5 = eVar3.f34983c;
        eVar.f34983c = eVar4;
        if (eVar4 != null) {
            eVar4.f34981a = eVar;
        }
        replaceInParent(eVar, eVar3);
        eVar3.f34982b = eVar;
        eVar.f34981a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f34988h : 0, eVar4 != null ? eVar4.f34988h : 0) + 1;
        eVar.f34988h = max;
        eVar3.f34988h = Math.max(max, eVar5 != null ? eVar5.f34988h : 0) + 1;
    }

    private void rotateRight(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f34982b;
        e<K, V> eVar3 = eVar.f34983c;
        e<K, V> eVar4 = eVar2.f34982b;
        e<K, V> eVar5 = eVar2.f34983c;
        eVar.f34982b = eVar5;
        if (eVar5 != null) {
            eVar5.f34981a = eVar;
        }
        replaceInParent(eVar, eVar2);
        eVar2.f34983c = eVar;
        eVar.f34981a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f34988h : 0, eVar5 != null ? eVar5.f34988h : 0) + 1;
        eVar.f34988h = max;
        eVar2.f34988h = Math.max(max, eVar4 != null ? eVar4.f34988h : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f34985e = eVar;
        eVar.f34984d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public e<K, V> find(K k11, boolean z11) {
        int i11;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k11 : null;
            while (true) {
                i11 = comparable != null ? comparable.compareTo(eVar2.f34986f) : comparator.compare(k11, eVar2.f34986f);
                if (i11 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i11 < 0 ? eVar2.f34982b : eVar2.f34983c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i11 = 0;
        }
        if (!z11) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k11, eVar4, eVar4.f34985e);
            if (i11 < 0) {
                eVar2.f34982b = eVar;
            } else {
                eVar2.f34983c = eVar;
            }
            rebalance(eVar2, true);
        } else {
            if (comparator == NATURAL_ORDER && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k11, eVar4, eVar4.f34985e);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    public e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        e<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f34987g, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> findByObject(Object obj) {
        if (obj != 0) {
            try {
                return find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f34987g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> find = find(k11, true);
        V v12 = find.f34987g;
        find.f34987g = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f34987g;
        }
        return null;
    }

    public void removeInternal(e<K, V> eVar, boolean z11) {
        int i11;
        if (z11) {
            e<K, V> eVar2 = eVar.f34985e;
            eVar2.f34984d = eVar.f34984d;
            eVar.f34984d.f34985e = eVar2;
        }
        e<K, V> eVar3 = eVar.f34982b;
        e<K, V> eVar4 = eVar.f34983c;
        e<K, V> eVar5 = eVar.f34981a;
        int i12 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                replaceInParent(eVar, eVar3);
                eVar.f34982b = null;
            } else if (eVar4 != null) {
                replaceInParent(eVar, eVar4);
                eVar.f34983c = null;
            } else {
                replaceInParent(eVar, null);
            }
            rebalance(eVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        e<K, V> b11 = eVar3.f34988h > eVar4.f34988h ? eVar3.b() : eVar4.a();
        removeInternal(b11, false);
        e<K, V> eVar6 = eVar.f34982b;
        if (eVar6 != null) {
            i11 = eVar6.f34988h;
            b11.f34982b = eVar6;
            eVar6.f34981a = b11;
            eVar.f34982b = null;
        } else {
            i11 = 0;
        }
        e<K, V> eVar7 = eVar.f34983c;
        if (eVar7 != null) {
            i12 = eVar7.f34988h;
            b11.f34983c = eVar7;
            eVar7.f34981a = b11;
            eVar.f34983c = null;
        }
        b11.f34988h = Math.max(i11, i12) + 1;
        replaceInParent(eVar, b11);
    }

    public e<K, V> removeInternalByKey(Object obj) {
        e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.header = new e<>();
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public e<K, V> f34981a;

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f34982b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f34983c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f34984d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f34985e;

        /* renamed from: f, reason: collision with root package name */
        public final K f34986f;

        /* renamed from: g, reason: collision with root package name */
        public V f34987g;

        /* renamed from: h, reason: collision with root package name */
        public int f34988h;

        public e() {
            this.f34986f = null;
            this.f34985e = this;
            this.f34984d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f34982b; eVar2 != null; eVar2 = eVar2.f34982b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f34983c; eVar2 != null; eVar2 = eVar2.f34983c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f34986f;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f34987g;
                    if (v11 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v11.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f34986f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f34987g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f34986f;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f34987g;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f34987g;
            this.f34987g = v11;
            return v12;
        }

        public String toString() {
            return this.f34986f + ContainerUtils.KEY_VALUE_DELIMITER + this.f34987g;
        }

        public e(e<K, V> eVar, K k11, e<K, V> eVar2, e<K, V> eVar3) {
            this.f34981a = eVar;
            this.f34986f = k11;
            this.f34988h = 1;
            this.f34984d = eVar2;
            this.f34985e = eVar3;
            eVar3.f34984d = this;
            eVar2.f34985e = this;
        }
    }
}
