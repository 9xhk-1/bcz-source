package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n1726#2,3:1788\n329#3,6:1791\n339#3,3:1798\n342#3,9:1802\n329#3,6:1811\n339#3,3:1818\n342#3,9:1822\n555#3:1831\n556#3:1835\n558#3,2:1837\n560#3,4:1840\n564#3:1847\n565#3:1851\n566#3:1853\n567#3,4:1856\n573#3:1861\n574#3,8:1863\n1399#4:1797\n1270#4:1801\n1399#4:1817\n1270#4:1821\n1165#4,3:1832\n1179#4:1836\n1175#4:1839\n1372#4,3:1844\n1386#4,3:1848\n1312#4:1852\n1303#4:1854\n1297#4:1855\n1309#4:1860\n1393#4:1862\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n*L\n1558#1:1788,3\n1574#1:1791,6\n1574#1:1798,3\n1574#1:1802,9\n1592#1:1811,6\n1592#1:1818,3\n1592#1:1822,9\n1605#1:1831\n1605#1:1835\n1605#1:1837,2\n1605#1:1840,4\n1605#1:1847\n1605#1:1851\n1605#1:1853\n1605#1:1856,4\n1605#1:1861\n1605#1:1863,8\n1574#1:1797\n1574#1:1801\n1592#1:1817\n1592#1:1821\n1605#1:1832,3\n1605#1:1836\n1605#1:1839\n1605#1:1844,3\n1605#1:1848,3\n1605#1:1852\n1605#1:1854\n1605#1:1855\n1605#1:1860\n1605#1:1862\n*E\n"})
/* loaded from: classes.dex */
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, h {

    @k
    private final MutableScatterMap<K, V> parent;

    public MutableEntries(@k MutableScatterMap<K, V> parent) {
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@k Collection<? extends Map.Entry<K, V>> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (x0.I(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
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
            Map.Entry entry = (Map.Entry) it.next();
            if (!g0.g(this.parent.get(entry.getKey()), entry.getValue())) {
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
    public Iterator<Map.Entry<K, V>> iterator() {
        return new MutableEntries$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (x0.I(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
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
                        Iterator<? extends Object> it = elements.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (g0.g(entry.getKey(), this.parent.keys[i14]) && g0.g(entry.getValue(), this.parent.values[i14])) {
                                this.parent.removeValueAt(i14);
                                z11 = true;
                                break;
                            }
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
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                this.parent.removeValueAt(i14);
                                z11 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!g0.g(entry.getKey(), this.parent.keys[i14]) || !g0.g(entry.getValue(), this.parent.values[i14])) {
                            }
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
    public boolean add(@k Map.Entry<K, V> element) {
        g0.p(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(@k Map.Entry<K, V> element) {
        g0.p(element, "element");
        return g0.g(this.parent.get(element.getKey()), element.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (((r4 & ((~r4) << 6)) & r11) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(@m80.k java.util.Map.Entry<K, V> r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "element"
            r2 = r22
            kotlin.jvm.internal.g0.p(r2, r1)
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L16
            int r5 = r3.hashCode()
            goto L17
        L16:
            r5 = 0
        L17:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r1._capacity
            int r5 = r5 >>> 7
            r5 = r5 & r7
            r8 = 0
        L26:
            long[] r9 = r1.metadata
            int r10 = r5 >> 3
            r11 = r5 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r5
            r15 = 0
            long r4 = (long) r11
            long r4 = -r4
            r11 = 63
            long r4 = r4 >> r11
            long r4 = r4 & r9
            long r4 = r4 | r12
            long r9 = (long) r6
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r4
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L55:
            r17 = 0
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 == 0) goto L79
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r16 + r13
            r13 = r13 & r7
            r19 = r11
            java.lang.Object[] r11 = r1.keys
            r11 = r11[r13]
            boolean r11 = kotlin.jvm.internal.g0.g(r11, r3)
            if (r11 == 0) goto L71
            goto L86
        L71:
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            r11 = r19
            goto L55
        L79:
            r19 = r11
            long r9 = ~r4
            r11 = 6
            long r9 = r9 << r11
            long r4 = r4 & r9
            long r4 = r4 & r19
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L9f
            r13 = -1
        L86:
            if (r13 < 0) goto L9e
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            java.lang.Object[] r1 = r1.values
            r1 = r1[r13]
            java.lang.Object r2 = r2.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L9e
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            r1.removeValueAt(r13)
            return r14
        L9e:
            return r15
        L9f:
            int r8 = r8 + 8
            int r5 = r16 + r8
            r5 = r5 & r7
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.remove(java.util.Map$Entry):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
