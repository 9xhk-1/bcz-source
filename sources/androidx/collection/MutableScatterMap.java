package androidx.collection;

import a00.a0;
import a00.q;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.m;
import x00.p;
import yz.v0;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1787:1\n59#2,5:1788\n1254#3,6:1793\n1399#3:1812\n1270#3:1816\n1165#3,3:1828\n1179#3:1832\n1175#3:1835\n1372#3,3:1840\n1386#3,3:1844\n1312#3:1848\n1303#3:1850\n1297#3:1851\n1309#3:1856\n1393#3:1858\n1165#3,3:1868\n1179#3:1872\n1175#3:1875\n1372#3,3:1880\n1386#3,3:1884\n1312#3:1888\n1303#3:1890\n1297#3:1891\n1309#3:1896\n1393#3:1898\n1399#3:1913\n1270#3:1917\n1399#3:1937\n1270#3:1941\n1230#3:1958\n1254#3,6:1959\n1242#3:1965\n1241#3,4:1966\n1254#3,6:1970\n1165#3,3:1976\n1175#3:1979\n1179#3:1980\n1372#3,3:1981\n1386#3,3:1984\n1312#3:1987\n1303#3:1988\n1297#3:1989\n1309#3:1990\n1393#3:1991\n1265#3:1992\n1220#3:1993\n1262#3:1994\n1220#3:1995\n1230#3:1996\n1254#3,6:1997\n1242#3:2003\n1241#3,4:2004\n1372#3,3:2008\n1399#3:2011\n1297#3:2012\n1144#3,14:2013\n1220#3:2027\n1165#3,3:2028\n1175#3:2031\n1179#3:2032\n1254#3,6:2033\n1220#3:2039\n1179#3:2040\n1254#3,6:2041\n1254#3,6:2047\n1179#3:2053\n1254#3,6:2054\n1268#3:2060\n1220#3:2061\n1165#3,3:2062\n1175#3:2065\n1179#3:2066\n1230#3:2067\n1254#3,6:2068\n1242#3:2074\n1241#3,4:2075\n1#4:1799\n215#5,2:1800\n357#6,4:1802\n329#6,6:1806\n339#6,3:1813\n342#6,9:1817\n361#6:1826\n555#6:1827\n556#6:1831\n558#6,2:1833\n560#6,4:1836\n564#6:1843\n565#6:1847\n566#6:1849\n567#6,4:1852\n573#6:1857\n574#6,8:1859\n555#6:1867\n556#6:1871\n558#6,2:1873\n560#6,4:1876\n564#6:1883\n565#6:1887\n566#6:1889\n567#6,4:1892\n573#6:1897\n574#6,8:1899\n329#6,6:1907\n339#6,3:1914\n342#6,9:1918\n231#7,3:1927\n200#7,7:1930\n211#7,3:1938\n214#7,9:1942\n234#7:1951\n287#8,6:1952\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n639#1:1788,5\n667#1:1793,6\n776#1:1812\n776#1:1816\n818#1:1828,3\n818#1:1832\n818#1:1835\n818#1:1840,3\n818#1:1844,3\n818#1:1848\n818#1:1850\n818#1:1851\n818#1:1856\n818#1:1858\n830#1:1868,3\n830#1:1872\n830#1:1875\n830#1:1880,3\n830#1:1884,3\n830#1:1888\n830#1:1890\n830#1:1891\n830#1:1896\n830#1:1898\n842#1:1913\n842#1:1917\n878#1:1937\n878#1:1941\n892#1:1958\n892#1:1959,6\n892#1:1965\n892#1:1966,4\n905#1:1970,6\n920#1:1976,3\n921#1:1979\n922#1:1980\n929#1:1981,3\n930#1:1984,3\n931#1:1987\n932#1:1988\n932#1:1989\n936#1:1990\n939#1:1991\n948#1:1992\n948#1:1993\n954#1:1994\n954#1:1995\n955#1:1996\n955#1:1997,6\n955#1:2003\n955#1:2004,4\n970#1:2008,3\n971#1:2011\n973#1:2012\n1019#1:2013,14\n1025#1:2027\n1039#1:2028,3\n1040#1:2031\n1051#1:2032\n1052#1:2033,6\n1061#1:2039\n1064#1:2040\n1065#1:2041,6\n1066#1:2047,6\n1076#1:2053\n1077#1:2054,6\n1116#1:2060\n1116#1:2061\n1118#1:2062,3\n1119#1:2065\n1121#1:2066\n1121#1:2067\n1121#1:2068,6\n1121#1:2074\n1121#1:2075,4\n771#1:1800,2\n776#1:1802,4\n776#1:1806,6\n776#1:1813,3\n776#1:1817,9\n776#1:1826\n818#1:1827\n818#1:1831\n818#1:1833,2\n818#1:1836,4\n818#1:1843\n818#1:1847\n818#1:1849\n818#1:1852,4\n818#1:1857\n818#1:1859,8\n830#1:1867\n830#1:1871\n830#1:1873,2\n830#1:1876,4\n830#1:1883\n830#1:1887\n830#1:1889\n830#1:1892,4\n830#1:1897\n830#1:1899,8\n842#1:1907,6\n842#1:1914,3\n842#1:1918,9\n878#1:1927,3\n878#1:1930,7\n878#1:1938,3\n878#1:1942,9\n878#1:1951\n883#1:1952,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final int findFirstAvailableSlot(int i11) {
        int i12 = this._capacity;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = j11 & ((~j11) << 7) & (-9187201950435737472L);
            if (j12 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j12) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i11) {
        long[] jArr;
        if (i11 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i11 + 15) & (-8)) >> 3];
            q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int i11) {
        int max = i11 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i11)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.keys = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        this.values = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
    }

    public final void adjustStorage$collection() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(w1.i(w1.i(this._size) * 32) ^ Long.MIN_VALUE, w1.i(w1.i(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    @k
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper(this);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i11 = this._capacity;
            int i12 = i11 >> 3;
            long j11 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j11)) | j11;
        }
        q.M1(this.values, null, 0, this._capacity);
        q.M1(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K k11, @k p<? super K, ? super V, ? extends V> computeBlock) {
        g0.p(computeBlock, "computeBlock");
        int findInsertIndex = findInsertIndex(k11);
        boolean z11 = findInsertIndex < 0;
        V invoke = computeBlock.invoke(k11, z11 ? null : this.values[findInsertIndex]);
        if (!z11) {
            this.values[findInsertIndex] = invoke;
            return invoke;
        }
        int i11 = ~findInsertIndex;
        this.keys[i11] = k11;
        this.values[i11] = invoke;
        return invoke;
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i11 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i12 = (i11 + 7) >> 3;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int Ne = a0.Ne(jArr);
        int i15 = Ne - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[Ne] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int hashCode = (obj != null ? obj.hashCode() : i13) * (-862048943);
                int i19 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i19);
                int i21 = i19 & i11;
                int i22 = i13;
                if (((findFirstAvailableSlot - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = ((r8 & 127) << i18) | ((~(255 << i18)) & jArr[i17]);
                    jArr[a0.Ne(jArr)] = jArr[i22];
                } else {
                    int i23 = findFirstAvailableSlot >> 3;
                    long j13 = jArr[i23];
                    int i24 = (findFirstAvailableSlot & 7) << 3;
                    if (((j13 >> i24) & 255) == 128) {
                        jArr[i23] = ((r8 & 127) << i24) | (j13 & (~(255 << i24)));
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[findFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
                        objArr2[findFirstAvailableSlot] = objArr2[i16];
                        objArr2[i16] = null;
                    } else {
                        jArr[i23] = ((r8 & 127) << i24) | (j13 & (~(255 << i24)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
                        Object obj3 = objArr2[findFirstAvailableSlot];
                        objArr2[findFirstAvailableSlot] = objArr2[i16];
                        objArr2[i16] = obj3;
                        i16--;
                    }
                    jArr[a0.Ne(jArr)] = jArr[i22];
                }
                i16++;
                i13 = i22;
            } else {
                i16++;
            }
        }
        initializeGrowth();
    }

    @v0
    public final int findInsertIndex(K k11) {
        int hashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this._capacity;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * ScatterMapKt.BitmaskLsb);
            for (long j14 = (~j13) & (j13 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (g0.g(this.keys[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i12);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i12);
                }
                this._size++;
                int i21 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i22 = findFirstAvailableSlot >> 3;
                long j15 = jArr2[i22];
                int i23 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i21 - (((j15 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this._capacity;
                long j16 = ((~(255 << i23)) & j15) | (j12 << i23);
                jArr2[i22] = j16;
                jArr2[(((findFirstAvailableSlot - 7) & i24) + (i24 & 7)) >> 3] = j16;
                return ~findFirstAvailableSlot;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    public final V getOrPut(K k11, @k x00.a<? extends V> defaultValue) {
        g0.p(defaultValue, "defaultValue");
        V v11 = get(k11);
        if (v11 != null) {
            return v11;
        }
        V invoke = defaultValue.invoke();
        set(k11, invoke);
        return invoke;
    }

    public final void minusAssign(K k11) {
        remove(k11);
    }

    public final void plusAssign(@k Pair<? extends K, ? extends V> pair) {
        g0.p(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @l
    public final V put(K k11, V v11) {
        int findInsertIndex = findInsertIndex(k11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        V v12 = (V) objArr[findInsertIndex];
        this.keys[findInsertIndex] = k11;
        objArr[findInsertIndex] = v11;
        return v12;
    }

    public final void putAll(@k Pair<? extends K, ? extends V>[] pairs) {
        g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.g0.g(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.removeValueAt(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(@k p<? super K, ? super V, Boolean> predicate) {
        g0.p(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        if (predicate.invoke(this.keys[i14], this.values[i14]).booleanValue()) {
                            removeValueAt(i14);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @l
    @v0
    public final V removeValueAt(int i11) {
        this._size--;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.keys[i11] = null;
        Object[] objArr = this.values;
        V v11 = (V) objArr[i11];
        objArr[i11] = null;
        return v11;
    }

    public final void resizeStorage$collection(int i11) {
        int i12;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i13 = this._capacity;
        initializeStorage(i11);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i14 = this._capacity;
        int i15 = 0;
        while (i15 < i13) {
            if (((jArr[i15 >> 3] >> ((i15 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i15];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i16 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i16 >>> 7);
                i12 = i15;
                long j11 = i16 & 127;
                int i17 = findFirstAvailableSlot >> 3;
                int i18 = (findFirstAvailableSlot & 7) << 3;
                long j12 = (j11 << i18) | (jArr2[i17] & (~(255 << i18)));
                jArr2[i17] = j12;
                jArr2[(((findFirstAvailableSlot - 7) & i14) + (i14 & 7)) >> 3] = j12;
                objArr3[findFirstAvailableSlot] = obj;
                objArr4[findFirstAvailableSlot] = objArr2[i12];
            } else {
                i12 = i15;
            }
            i15 = i12 + 1;
        }
    }

    public final void set(K k11, V v11) {
        int findInsertIndex = findInsertIndex(k11);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = k11;
        this.values[findInsertIndex] = v11;
    }

    public final int trim() {
        int i11 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i11 - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public final void minusAssign(@k K[] keys) {
        g0.p(keys, "keys");
        for (K k11 : keys) {
            remove(k11);
        }
    }

    public final void plusAssign(@k Pair<? extends K, ? extends V>[] pairs) {
        g0.p(pairs, "pairs");
        putAll(pairs);
    }

    public MutableScatterMap(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    public final void plusAssign(@k Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        g0.p(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@k Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@k Iterable<? extends K> keys) {
        g0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@k m<? extends Pair<? extends K, ? extends V>> pairs) {
        g0.p(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@k Map<K, ? extends V> from) {
        g0.p(from, "from");
        putAll(from);
    }

    public final void putAll(@k m<? extends Pair<? extends K, ? extends V>> pairs) {
        g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@k m<? extends K> keys) {
        g0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@k ScatterMap<K, V> from) {
        g0.p(from, "from");
        putAll(from);
    }

    public final void putAll(@k Map<K, ? extends V> from) {
        g0.p(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ScatterSet<K> keys) {
        g0.p(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        remove(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(K r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.g0.g(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L84
            r11 = -1
        L71:
            if (r11 < 0) goto L83
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r7)
            if (r1 == 0) goto L83
            r0.removeValueAt(r11)
            return r12
        L83:
            return r2
        L84:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@k ScatterMap<K, V> from) {
        g0.p(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        set(objArr[i14], objArr2[i14]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ObjectList<K> keys) {
        g0.p(keys, "keys");
        Object[] objArr = keys.content;
        int i11 = keys._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(objArr[i12]);
        }
    }
}
