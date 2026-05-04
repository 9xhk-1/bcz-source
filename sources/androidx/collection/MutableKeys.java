package androidx.collection;

import a00.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n329#2,6:1808\n339#2,3:1815\n342#2,9:1819\n555#2:1828\n556#2:1832\n558#2,2:1834\n560#2,4:1837\n564#2:1844\n565#2:1848\n566#2:1850\n567#2,4:1853\n573#2:1858\n574#2,8:1860\n1399#3:1794\n1270#3:1798\n1399#3:1814\n1270#3:1818\n1165#3,3:1829\n1179#3:1833\n1175#3:1836\n1372#3,3:1841\n1386#3,3:1845\n1312#3:1849\n1303#3:1851\n1297#3:1852\n1309#3:1857\n1393#3:1859\n1726#4,3:1868\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableKeys\n*L\n1652#1:1788,6\n1652#1:1795,3\n1652#1:1799,9\n1663#1:1808,6\n1663#1:1815,3\n1663#1:1819,9\n1673#1:1828\n1673#1:1832\n1673#1:1834,2\n1673#1:1837,4\n1673#1:1844\n1673#1:1848\n1673#1:1850\n1673#1:1853,4\n1673#1:1858\n1673#1:1860,8\n1652#1:1794\n1652#1:1798\n1663#1:1814\n1663#1:1818\n1673#1:1829,3\n1673#1:1833\n1673#1:1836\n1673#1:1841,3\n1673#1:1845,3\n1673#1:1849\n1673#1:1851\n1673#1:1852\n1673#1:1857\n1673#1:1859\n1682#1:1868,3\n*E\n"})
/* loaded from: classes.dex */
final class MutableKeys<K, V> implements Set<K>, h {

    @k
    private final MutableScatterMap<K, V> parent;

    public MutableKeys(@k MutableScatterMap<K, V> parent) {
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@k Collection<? extends K> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<K> iterator() {
        return new MutableKeys$iterator$1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r12 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            androidx.collection.MutableScatterMap<K, V> r2 = r0.parent
            if (r1 == 0) goto Ld
            int r4 = r1.hashCode()
            goto Le
        Ld:
            r4 = 0
        Le:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r2._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L1d:
            long[] r8 = r2.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L49:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L6b
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r6
            r18 = 0
            java.lang.Object[] r3 = r2.keys
            r3 = r3[r12]
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r3 == 0) goto L64
            goto L77
        L64:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L49
        L6b:
            r18 = 0
            long r10 = ~r8
            r3 = 6
            long r10 = r10 << r3
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 == 0) goto L80
            r12 = -1
        L77:
            if (r12 < 0) goto L7f
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            r1.removeValueAt(r12)
            return r13
        L7f:
            return r18
        L80:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableKeys.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
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
                        if (r0.a2(elements, this.parent.keys[i14])) {
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

    @Override // java.util.Set, java.util.Collection
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
                        if (!r0.a2(elements, this.parent.keys[i14])) {
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
