package androidx.collection;

import a00.a0;
import a00.q;
import a00.r0;
import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.google.common.collect.q7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import q30.m;
import x00.l;
import yz.v0;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 9 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 10 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 11 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1511:1\n1033#1:1524\n1035#1,2:1526\n1038#1,6:1529\n1033#1:1535\n1035#1,2:1537\n1038#1,6:1540\n1046#1,3:1839\n1049#1:1843\n1051#1,2:1845\n1054#1,5:1848\n1060#1,5:1854\n59#2,5:1512\n1#3:1517\n1254#4,6:1518\n1399#4:1574\n1270#4:1578\n1165#4,3:1596\n1179#4:1600\n1175#4:1603\n1372#4,3:1607\n1386#4,3:1611\n1312#4:1615\n1303#4:1617\n1297#4:1618\n1309#4:1623\n1393#4:1625\n1165#4,3:1635\n1179#4:1639\n1175#4:1642\n1372#4,3:1646\n1386#4,3:1650\n1312#4:1654\n1303#4:1656\n1297#4:1657\n1309#4:1662\n1393#4:1664\n1399#4:1701\n1270#4:1705\n1399#4:1729\n1270#4:1733\n1399#4:1750\n1270#4:1754\n1399#4:1771\n1270#4:1775\n1399#4:1792\n1270#4:1796\n1399#4:1813\n1270#4:1817\n1230#4:1827\n1254#4,6:1828\n1242#4:1834\n1241#4,4:1835\n1254#4,6:1865\n1165#4,3:1871\n1175#4:1874\n1179#4:1875\n1372#4,3:1876\n1386#4,3:1879\n1312#4:1882\n1303#4:1883\n1297#4:1884\n1309#4:1885\n1393#4:1886\n1265#4:1887\n1220#4:1888\n1262#4:1889\n1220#4:1890\n1230#4:1891\n1254#4,6:1892\n1242#4:1898\n1241#4,4:1899\n1372#4,3:1903\n1399#4:1906\n1297#4:1907\n1144#4,14:1909\n1220#4:1923\n1165#4,3:1924\n1175#4:1927\n1179#4:1928\n1254#4,6:1929\n1220#4:1936\n1179#4:1937\n1254#4,6:1938\n1254#4,6:1944\n1179#4:1955\n1254#4,6:1956\n1268#4:1967\n1220#4:1968\n1165#4,3:1969\n1175#4:1972\n1179#4:1973\n1230#4:1974\n1254#4,6:1975\n1242#4:1981\n1241#4,4:1982\n1111#5:1525\n1114#5:1528\n1111#5:1536\n1114#5:1539\n1123#5:1559\n1123#5:1686\n1123#5:1842\n1127#5:1844\n1117#5:1847\n1114#5:1853\n1111#5:1859\n1114#5:1860\n1123#5:1861\n1127#5:1862\n1117#5:1863\n1114#5:1864\n1127#5:1908\n1132#5:1935\n1144#5:1950\n1138#5:1951\n1141#5:1952\n1132#5:1953\n1132#5:1954\n1144#5:1962\n1138#5:1963\n1135#5:1964\n1132#5:1965\n1132#5:1966\n1123#5:1986\n1127#5:1987\n1096#5,2:1988\n1147#5:1990\n1098#5,2:1991\n1147#5:1993\n1147#5:1994\n1147#5:1995\n1123#5:1996\n1127#5:1997\n1103#5,4:1998\n13309#6,2:1546\n13309#6,2:1673\n1855#7,2:1548\n1855#7,2:1677\n1313#8,2:1550\n1313#8,2:1675\n301#9,7:1552\n308#9,4:1560\n510#9:1595\n511#9:1599\n513#9,2:1601\n515#9,3:1604\n518#9:1610\n519#9:1614\n520#9:1616\n521#9,4:1619\n527#9:1624\n528#9,8:1626\n510#9:1634\n511#9:1638\n513#9,2:1640\n515#9,3:1643\n518#9:1649\n519#9:1653\n520#9:1655\n521#9,4:1658\n527#9:1663\n528#9,8:1665\n301#9,7:1679\n308#9,4:1687\n269#9,7:1722\n280#9,3:1730\n283#9,9:1734\n269#9,7:1743\n280#9,3:1751\n283#9,9:1755\n269#9,7:1764\n280#9,3:1772\n283#9,9:1776\n269#9,7:1785\n280#9,3:1793\n283#9,9:1797\n269#9,7:1806\n280#9,3:1814\n283#9,9:1818\n231#10,3:1564\n200#10,7:1567\n211#10,3:1575\n214#10,9:1579\n234#10:1588\n231#10,3:1691\n200#10,7:1694\n211#10,3:1702\n214#10,9:1706\n234#10:1715\n287#11,6:1589\n287#11,6:1716\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/MutableOrderedScatterSet\n*L\n635#1:1524\n635#1:1526,2\n635#1:1529,6\n647#1:1535\n647#1:1537,2\n647#1:1540,6\n1029#1:1839,3\n1029#1:1843\n1029#1:1845,2\n1029#1:1848,5\n1029#1:1854,5\n587#1:1512,5\n616#1:1518,6\n770#1:1574\n770#1:1578\n790#1:1596,3\n790#1:1600\n790#1:1603\n790#1:1607,3\n790#1:1611,3\n790#1:1615\n790#1:1617\n790#1:1618\n790#1:1623\n790#1:1625\n804#1:1635,3\n804#1:1639\n804#1:1642\n804#1:1646,3\n804#1:1650,3\n804#1:1654\n804#1:1656\n804#1:1657\n804#1:1662\n804#1:1664\n924#1:1701\n924#1:1705\n939#1:1729\n939#1:1733\n956#1:1750\n956#1:1754\n973#1:1771\n973#1:1775\n991#1:1792\n991#1:1796\n1011#1:1813\n1011#1:1817\n1026#1:1827\n1026#1:1828,6\n1026#1:1834\n1026#1:1835,4\n1071#1:1865,6\n1087#1:1871,3\n1088#1:1874\n1089#1:1875\n1096#1:1876,3\n1097#1:1879,3\n1098#1:1882\n1099#1:1883\n1099#1:1884\n1103#1:1885\n1106#1:1886\n1115#1:1887\n1115#1:1888\n1121#1:1889\n1121#1:1890\n1122#1:1891\n1122#1:1892,6\n1122#1:1898\n1122#1:1899,4\n1136#1:1903,3\n1137#1:1906\n1139#1:1907\n1250#1:1909,14\n1256#1:1923\n1270#1:1924,3\n1271#1:1927\n1282#1:1928\n1283#1:1929,6\n1297#1:1936\n1300#1:1937\n1301#1:1938,6\n1302#1:1944,6\n1321#1:1955\n1322#1:1956,6\n1377#1:1967\n1377#1:1968\n1379#1:1969,3\n1380#1:1972\n1382#1:1973\n1382#1:1974\n1382#1:1975,6\n1382#1:1981\n1382#1:1982,4\n635#1:1525\n635#1:1528\n647#1:1536\n647#1:1539\n761#1:1559\n915#1:1686\n1029#1:1842\n1029#1:1844\n1029#1:1847\n1029#1:1853\n1033#1:1859\n1036#1:1860\n1048#1:1861\n1049#1:1862\n1052#1:1863\n1058#1:1864\n1173#1:1908\n1287#1:1935\n1311#1:1950\n1313#1:1951\n1314#1:1952\n1316#1:1953\n1318#1:1954\n1333#1:1962\n1335#1:1963\n1336#1:1964\n1338#1:1965\n1342#1:1966\n1397#1:1986\n1398#1:1987\n1399#1:1988,2\n1399#1:1990\n1399#1:1991,2\n1399#1:1993\n1401#1:1994\n1402#1:1995\n1409#1:1996\n1410#1:1997\n1411#1:1998,4\n734#1:1546,2\n888#1:1673,2\n743#1:1548,2\n906#1:1677,2\n752#1:1550,2\n897#1:1675,2\n761#1:1552,7\n761#1:1560,4\n790#1:1595\n790#1:1599\n790#1:1601,2\n790#1:1604,3\n790#1:1610\n790#1:1614\n790#1:1616\n790#1:1619,4\n790#1:1624\n790#1:1626,8\n804#1:1634\n804#1:1638\n804#1:1640,2\n804#1:1643,3\n804#1:1649\n804#1:1653\n804#1:1655\n804#1:1658,4\n804#1:1663\n804#1:1665,8\n915#1:1679,7\n915#1:1687,4\n939#1:1722,7\n939#1:1730,3\n939#1:1734,9\n956#1:1743,7\n956#1:1751,3\n956#1:1755,9\n973#1:1764,7\n973#1:1772,3\n973#1:1776,9\n991#1:1785,7\n991#1:1793,3\n991#1:1797,9\n1011#1:1806,7\n1011#1:1814,3\n1011#1:1818,9\n770#1:1564,3\n770#1:1567,7\n770#1:1575,3\n770#1:1579,9\n770#1:1588\n924#1:1691,3\n924#1:1694,7\n924#1:1702,3\n924#1:1706,9\n924#1:1715\n779#1:1589,6\n933#1:1716,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(E e11) {
        int hashCode = (e11 != null ? e11.hashCode() : 0) * (-862048943);
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
                if (g0.g(this.elements[numberOfTrailingZeros], e11)) {
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
                return findFirstAvailableSlot;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
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

    private final void fixupNodes(long[] jArr) {
        long[] jArr2 = this.nodes;
        int length = jArr2.length;
        int i11 = 0;
        while (true) {
            int i12 = Integer.MAX_VALUE;
            if (i11 >= length) {
                break;
            }
            long j11 = jArr2[i11];
            int i13 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
            int i14 = (int) (j11 & SieveCacheKt.NodeLinkMask);
            long j12 = ((j11 & (-4611686018427387904L)) | (i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i13] & 4294967295L))) << 31;
            if (i14 != Integer.MAX_VALUE) {
                i12 = (int) (4294967295L & jArr[i14]);
            }
            jArr2[i11] = i12 | j12;
            i11++;
        }
        int i15 = this.head;
        if (i15 != Integer.MAX_VALUE) {
            this.head = (int) (jArr[i15] & 4294967295L);
        }
        int i16 = this.tail;
        if (i16 != Integer.MAX_VALUE) {
            this.tail = (int) (jArr[i16] & 4294967295L);
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
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i12 = i11 >> 3;
        long j11 = 255 << ((i11 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j11)) | j11;
        initializeGrowth();
    }

    private final void initializeStorage(int i11) {
        long[] jArr;
        int max = i11 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i11)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.elements = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        if (max == 0) {
            jArr = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr2 = new long[max];
            q.U1(jArr2, 4611686018427387903L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.nodes = jArr;
    }

    private final void moveNodeToHead(int i11) {
        long[] jArr = this.nodes;
        int i12 = this.head;
        jArr[i11] = (i12 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((i11 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i12] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = i11;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = i11;
        }
    }

    private final void removeNode(int i11) {
        long[] jArr = this.nodes;
        long j11 = jArr[i11];
        int i12 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
        int i13 = (int) (j11 & SieveCacheKt.NodeLinkMask);
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = (jArr[i12] & SieveCacheKt.NodeMetaAndPreviousMask) | (i13 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i13;
        }
        if (i13 != Integer.MAX_VALUE) {
            jArr[i13] = ((i12 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i13] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i12;
        }
        jArr[i11] = 4611686018427387903L;
    }

    public final boolean add(E e11) {
        int size = getSize();
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(e11);
        this.elements[findAbsoluteInsertIndex] = e11;
        long[] jArr = this.nodes;
        int i11 = this.head;
        jArr[findAbsoluteInsertIndex] = (i11 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((findAbsoluteInsertIndex & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
        return getSize() != size;
    }

    public final boolean addAll(@k E[] elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((Object[]) elements);
        return size != getSize();
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
    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
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
        q.M1(this.elements, null, 0, this._capacity);
        q.U1(this.nodes, 4611686018427387903L, 0, 0, 6, null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        int i11;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i12 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i12];
        long j11 = 9223372034707292159L;
        int i13 = 0;
        q.L1(jArr3, 9223372034707292159L, 0, i12);
        int i14 = (i12 + 7) >> 3;
        for (int i15 = 0; i15 < i14; i15++) {
            long j12 = jArr[i15] & (-9187201950435737472L);
            jArr[i15] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
        }
        int Ne = a0.Ne(jArr);
        int i16 = Ne - 1;
        jArr[i16] = (jArr[i16] & 72057594037927935L) | (-72057594037927936L);
        jArr[Ne] = jArr[0];
        int i17 = 0;
        while (i17 != i12) {
            int i18 = i17 >> 3;
            int i19 = (i17 & 7) << 3;
            long j13 = (jArr[i18] >> i19) & 255;
            if (j13 != 128 && j13 == 254) {
                Object obj = objArr[i17];
                int hashCode = (obj != null ? obj.hashCode() : i13) * (-862048943);
                int i21 = (hashCode ^ (hashCode << 16)) >>> 7;
                long j14 = j11;
                int findFirstAvailableSlot = findFirstAvailableSlot(i21);
                int i22 = i21 & i12;
                if (((findFirstAvailableSlot - i22) & i12) / 8 == ((i17 - i22) & i12) / 8) {
                    jArr[i18] = ((r11 & 127) << i19) | (jArr[i18] & (~(255 << i19)));
                    if (jArr3[i17] == j14) {
                        long j15 = i17;
                        jArr3[i17] = j15 | (j15 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i13];
                    i17++;
                    j11 = j14;
                } else {
                    int i23 = findFirstAvailableSlot >> 3;
                    long j16 = jArr[i23];
                    int i24 = (findFirstAvailableSlot & 7) << 3;
                    int i25 = i13;
                    if (((j16 >> i24) & 255) == 128) {
                        int i26 = i17;
                        jArr[i23] = (j16 & (~(255 << i24))) | ((r11 & 127) << i24);
                        jArr[i18] = (jArr[i18] & (~(255 << i19))) | (128 << i19);
                        objArr[findFirstAvailableSlot] = objArr[i26];
                        objArr[i26] = null;
                        jArr2[findFirstAvailableSlot] = jArr2[i26];
                        jArr2[i26] = 4611686018427387903L;
                        int i27 = (int) ((jArr3[i26] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            jArr3[i27] = (jArr3[i27] & q7.f33754l) | findFirstAvailableSlot;
                            jArr3[i26] = (jArr3[i26] & 4294967295L) | q7.f33754l;
                        } else {
                            jArr3[i26] = (Integer.MAX_VALUE << 32) | findFirstAvailableSlot;
                        }
                        i11 = i26;
                        jArr3[findFirstAvailableSlot] = Integer.MAX_VALUE | (i11 << 32);
                    } else {
                        jArr[i23] = ((r11 & 127) << i24) | (j16 & (~(255 << i24)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i17];
                        objArr[i17] = obj2;
                        long j17 = jArr2[findFirstAvailableSlot];
                        jArr2[findFirstAvailableSlot] = jArr2[i17];
                        jArr2[i17] = j17;
                        int i28 = (int) ((jArr3[i17] >> 32) & 4294967295L);
                        if (i28 != Integer.MAX_VALUE) {
                            long j18 = findFirstAvailableSlot;
                            jArr3[i28] = (jArr3[i28] & q7.f33754l) | j18;
                            jArr3[i17] = (jArr3[i17] & 4294967295L) | (j18 << 32);
                        } else {
                            long j19 = findFirstAvailableSlot;
                            jArr3[i17] = j19 | (j19 << 32);
                            i28 = i17;
                        }
                        jArr3[findFirstAvailableSlot] = (i28 << 32) | i17;
                        i11 = i17 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i25];
                    i17 = i11 + 1;
                    j11 = j14;
                    i13 = i25;
                }
            } else {
                i17++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r14) {
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
            java.lang.Object[] r11 = r13.elements
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
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e11) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(e11);
        this.elements[findAbsoluteInsertIndex] = e11;
        long[] jArr = this.nodes;
        int i11 = this.head;
        jArr[findAbsoluteInsertIndex] = (i11 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((findAbsoluteInsertIndex & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
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
            java.lang.Object[] r15 = r0.elements
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
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@k E[] elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((Object[]) elements);
        return size != getSize();
    }

    @v0
    public final void removeElementAt(int i11) {
        this._size--;
        long[] jArr = this.metadata;
        int i12 = this._capacity;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j11 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j11;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j11;
        this.elements[i11] = null;
        long[] jArr2 = this.nodes;
        long j12 = jArr2[i11];
        int i15 = (int) ((j12 >> 31) & SieveCacheKt.NodeLinkMask);
        int i16 = (int) (j12 & SieveCacheKt.NodeLinkMask);
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = (jArr2[i15] & SieveCacheKt.NodeMetaAndPreviousMask) | (i16 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i16;
        }
        if (i16 != Integer.MAX_VALUE) {
            jArr2[i16] = ((i15 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i16] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i15;
        }
        jArr2[i11] = 4611686018427387903L;
    }

    public final void removeIf(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
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
                        if (predicate.invoke(objArr[i14]).booleanValue()) {
                            removeElementAt(i14);
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

    public final void resizeStorage$collection(int i11) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i12 = this._capacity;
        int[] iArr = new int[i12];
        initializeStorage(i11);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i13 = this._capacity;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr2[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i14];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i15 >>> 7);
                long j11 = i15 & 127;
                int i16 = findFirstAvailableSlot >> 3;
                int i17 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j12 = (jArr4[i16] & (~(255 << i17))) | (j11 << i17);
                jArr4[i16] = j12;
                jArr4[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j12;
                objArr3[findFirstAvailableSlot] = obj;
                jArr5[findFirstAvailableSlot] = jArr3[i14];
                iArr[i14] = findFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i14++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final boolean retainAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = this.elements;
        int i11 = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            if (!r0.a2(elements, objArr[i15])) {
                                removeElementAt(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return i11 != this._size;
    }

    @IntRange(from = 0)
    public final int trim() {
        int i11 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i11) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i11 - this._capacity;
    }

    public final void trimToSize(int i11) {
        int i12;
        long[] jArr = this.nodes;
        int i13 = this.head;
        while (i13 != Integer.MAX_VALUE && (i12 = this._size) > i11 && i12 != 0) {
            int i14 = (int) (jArr[i13] & SieveCacheKt.NodeLinkMask);
            removeElementAt(i13);
            i13 = i14;
        }
    }

    public /* synthetic */ MutableOrderedScatterSet(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 6 : i11);
    }

    public MutableOrderedScatterSet(int i11) {
        super(null);
        if (!(i11 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    public final boolean addAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean removeAll(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((m) elements);
        return size != getSize();
    }

    public final boolean addAll(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((m) elements);
        return size != getSize();
    }

    public final boolean removeAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((Iterable) elements);
        return size != getSize();
    }

    public final void minusAssign(@k E[] elements) {
        g0.p(elements, "elements");
        for (E e11 : elements) {
            minusAssign((MutableOrderedScatterSet<E>) e11);
        }
    }

    private final void fixupNodes(int[] iArr) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i11 = 0;
        while (true) {
            int i12 = Integer.MAX_VALUE;
            if (i11 >= length) {
                break;
            }
            long j11 = jArr[i11];
            int i13 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
            int i14 = (int) (j11 & SieveCacheKt.NodeLinkMask);
            long j12 = ((j11 & (-4611686018427387904L)) | (i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i13])) << 31;
            if (i14 != Integer.MAX_VALUE) {
                i12 = iArr[i14];
            }
            jArr[i11] = j12 | i12;
            i11++;
        }
        int i15 = this.head;
        if (i15 != Integer.MAX_VALUE) {
            this.head = iArr[i15];
        }
        int i16 = this.tail;
        if (i16 != Integer.MAX_VALUE) {
            this.tail = iArr[i16];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@k OrderedScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = this.elements;
        int i11 = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            if (!elements.contains(objArr[i15])) {
                                removeElementAt(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@k OrderedScatterSet<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((OrderedScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(@k E[] elements) {
        g0.p(elements, "elements");
        for (E e11 : elements) {
            plusAssign((MutableOrderedScatterSet<E>) e11);
        }
    }

    public final boolean removeAll(@k OrderedScatterSet<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((OrderedScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final boolean removeAll(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((ScatterSet) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k OrderedScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i11 = elements.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign((MutableOrderedScatterSet<E>) objArr[i11]);
            i11 = i12;
        }
    }

    public final void plusAssign(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        plusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@k OrderedScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i11 = elements.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign((MutableOrderedScatterSet<E>) objArr[i11]);
            i11 = i12;
        }
    }

    public final boolean removeAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        int size = getSize();
        minusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = this.elements;
        int i11 = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            if (!elements.contains(objArr[i15])) {
                                removeElementAt(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return i11 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign((MutableOrderedScatterSet<E>) objArr[(i11 << 3) + i13]);
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
    public final void plusAssign(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign((MutableOrderedScatterSet<E>) objArr[(i11 << 3) + i13]);
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

    public final boolean retainAll(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        int size = getSize();
        long[] jArr = this.metadata;
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
                            if (!predicate.invoke(objArr[i14]).booleanValue()) {
                                removeElementAt(i14);
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
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            minusAssign((MutableOrderedScatterSet<E>) objArr[i12]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            plusAssign((MutableOrderedScatterSet<E>) objArr[i12]);
        }
    }
}
