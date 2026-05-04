package androidx.collection;

import a00.r0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import y00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n329#2,6:1828\n339#2,3:1835\n342#2,9:1839\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1399#3:1834\n1270#3:1838\n1726#4,3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableValues\n*L\n1726#1:1788,6\n1726#1:1795,3\n1726#1:1799,9\n1737#1:1808,6\n1737#1:1815,3\n1737#1:1819,9\n1747#1:1828,6\n1747#1:1835,3\n1747#1:1839,9\n1726#1:1794\n1726#1:1798\n1737#1:1814\n1737#1:1818\n1747#1:1834\n1747#1:1838\n1757#1:1848,3\n*E\n"})
/* loaded from: classes.dex */
final class MutableValues<K, V> implements Collection<V>, b {

    @k
    private final MutableScatterMap<K, V> parent;

    public MutableValues(@k MutableScatterMap<K, V> parent) {
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(@k Collection<? extends V> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public Iterator<V> iterator() {
        return new MutableValues$iterator$1(this);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (g0.g(this.parent.values[i14], obj)) {
                                this.parent.removeValueAt(i14);
                                return true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        if (r0.a2(elements, this.parent.values[i14])) {
                            this.parent.removeValueAt(i14);
                            z11 = true;
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return z11;
                }
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        if (!r0.a2(elements, this.parent.values[i14])) {
                            this.parent.removeValueAt(i14);
                            z11 = true;
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return z11;
                }
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
