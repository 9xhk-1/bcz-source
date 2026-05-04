package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.g;
import x00.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n+ 2 SieveCache.kt\nandroidx/collection/SieveCacheKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1511:1\n301#1,7:1512\n308#1,4:1520\n301#1,7:1524\n308#1,4:1532\n301#1,7:1536\n308#1,4:1544\n321#1,7:1548\n328#1,4:1556\n321#1,7:1560\n328#1,4:1568\n321#1,7:1572\n328#1,4:1580\n269#1,7:1589\n280#1,3:1597\n283#1,9:1601\n301#1,7:1610\n308#1,4:1618\n341#1,3:1622\n269#1,7:1625\n280#1,3:1633\n283#1,9:1637\n344#1:1646\n341#1,3:1647\n269#1,7:1650\n280#1,3:1658\n283#1,9:1662\n344#1:1671\n341#1,3:1672\n269#1,7:1675\n280#1,3:1683\n283#1,9:1687\n344#1:1696\n510#1:1697\n511#1:1701\n513#1,2:1703\n515#1,3:1706\n518#1:1712\n519#1:1716\n520#1:1718\n521#1,4:1721\n527#1:1726\n528#1,8:1728\n301#1,7:1736\n308#1,4:1744\n341#1,3:1748\n269#1,7:1751\n280#1,3:1759\n283#1,9:1763\n344#1:1772\n341#1,3:1773\n269#1,7:1776\n280#1,3:1784\n283#1,9:1788\n344#1:1797\n1123#2:1519\n1123#2:1531\n1123#2:1543\n1127#2:1555\n1127#2:1567\n1127#2:1579\n1123#2:1584\n1123#2:1587\n1127#2:1588\n1123#2:1617\n1123#2:1743\n1399#3:1585\n1270#3:1586\n1399#3:1596\n1270#3:1600\n1399#3:1632\n1270#3:1636\n1399#3:1657\n1270#3:1661\n1399#3:1682\n1270#3:1686\n1165#3,3:1698\n1179#3:1702\n1175#3:1705\n1372#3,3:1709\n1386#3,3:1713\n1312#3:1717\n1303#3:1719\n1297#3:1720\n1309#3:1725\n1393#3:1727\n1399#3:1758\n1270#3:1762\n1399#3:1783\n1270#3:1787\n1165#3,3:1798\n1179#3:1801\n1175#3:1802\n1372#3,3:1803\n1386#3,3:1806\n1312#3:1809\n1303#3:1810\n1297#3:1811\n1309#3:1812\n1393#3:1813\n*S KotlinDebug\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSet\n*L\n178#1:1512,7\n178#1:1520,4\n195#1:1524,7\n195#1:1532,4\n209#1:1536,7\n209#1:1544,4\n219#1:1548,7\n219#1:1556,4\n236#1:1560,7\n236#1:1568,4\n250#1:1572,7\n250#1:1580,4\n343#1:1589,7\n343#1:1597,3\n343#1:1601,9\n349#1:1610,7\n349#1:1618,4\n363#1:1622,3\n363#1:1625,7\n363#1:1633,3\n363#1:1637,9\n363#1:1646\n376#1:1647,3\n376#1:1650,7\n376#1:1658,3\n376#1:1662,9\n376#1:1671\n394#1:1672,3\n394#1:1675,7\n394#1:1683,3\n394#1:1687,9\n394#1:1696\n403#1:1697\n403#1:1701\n403#1:1703,2\n403#1:1706,3\n403#1:1712\n403#1:1716\n403#1:1718\n403#1:1721,4\n403#1:1726\n403#1:1728,8\n426#1:1736,7\n426#1:1744,4\n453#1:1748,3\n453#1:1751,7\n453#1:1759,3\n453#1:1763,9\n453#1:1772\n483#1:1773,3\n483#1:1776,7\n483#1:1784,3\n483#1:1788,9\n483#1:1797\n178#1:1519\n195#1:1531\n209#1:1543\n219#1:1555\n236#1:1567\n250#1:1579\n260#1:1584\n307#1:1587\n327#1:1588\n349#1:1617\n426#1:1743\n275#1:1585\n282#1:1586\n343#1:1596\n343#1:1600\n363#1:1632\n363#1:1636\n376#1:1657\n376#1:1661\n394#1:1682\n394#1:1686\n403#1:1698,3\n403#1:1702\n403#1:1705\n403#1:1709,3\n403#1:1713,3\n403#1:1717\n403#1:1719\n403#1:1720\n403#1:1725\n403#1:1727\n453#1:1758\n453#1:1762\n483#1:1783\n483#1:1787\n510#1:1798,3\n511#1:1801\n514#1:1802\n517#1:1803,3\n518#1:1806,3\n519#1:1809\n520#1:1810\n520#1:1811\n524#1:1812\n527#1:1813\n*E\n"})
/* loaded from: classes.dex */
public abstract class OrderedScatterSet<E> {

    @g
    public int _capacity;

    @g
    public int _size;

    @g
    @k
    public Object[] elements;

    @g
    public int head;

    @g
    @k
    public long[] metadata;

    @g
    @k
    public long[] nodes;

    @g
    public int tail;

    public /* synthetic */ OrderedScatterSet(v vVar) {
        this();
    }

    public static /* synthetic */ String joinToString$default(OrderedScatterSet orderedScatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = j2.O;
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return orderedScatterSet.joinToString(charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public final boolean all(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128 && !predicate.invoke(objArr[(i11 << 3) + i13]).booleanValue()) {
                        return false;
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    @k
    public final Set<E> asSet() {
        return new OrderedSetWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(E r18) {
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
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.contains(java.lang.Object):boolean");
    }

    @IntRange(from = 0)
    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@m80.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderedScatterSet)) {
            return false;
        }
        OrderedScatterSet orderedScatterSet = (OrderedScatterSet) obj;
        if (orderedScatterSet.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && !orderedScatterSet.contains(objArr[(i11 << 3) + i13])) {
                            return false;
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
        return true;
    }

    public final int findElementIndex$collection(E e11) {
        int i11 = 0;
        int hashCode = (e11 != null ? e11.hashCode() : 0) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this._capacity;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.metadata;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j11 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j12 = (i13 * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i14;
                if (g0.g(this.elements[numberOfTrailingZeros], e11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i11 += 8;
            i15 = i16 + i11;
        }
    }

    public final E first() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.tail;
        if (i11 != Integer.MAX_VALUE) {
            long j11 = jArr[i11];
            return (E) objArr[i11];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    @m80.l
    public final E firstOrNull(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i11];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i11 = i12;
        }
        return null;
    }

    public final void forEach(@k l<? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i11]);
            i11 = i12;
        }
    }

    public final void forEachIndex$collection(@k l<? super Integer, g2> block) {
        g0.p(block, "block");
        long[] jArr = this.nodes;
        int i11 = this.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(Integer.valueOf(i11));
            i11 = i12;
        }
    }

    public final void forEachReverse(@k l<? super E, g2> block) {
        g0.p(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.head;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) (jArr[i11] & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i11]);
            i11 = i12;
        }
    }

    @IntRange(from = 0)
    public final int getCapacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i11 = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
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
                            Object obj = objArr[(i12 << 3) + i14];
                            if (!g0.g(obj, this)) {
                                i11 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return i11;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @w00.k
    @k
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.head;
        if (i11 != Integer.MAX_VALUE) {
            long j11 = jArr[i11];
            return (E) objArr[i11];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    @m80.l
    public final E lastOrNull(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.head;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) (jArr[i11] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i11];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i11 = i12;
        }
        return null;
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final List<E> toList() {
        ArrayList arrayList = new ArrayList(getSize());
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            arrayList.add(objArr[i11]);
            i11 = i12;
        }
        return arrayList;
    }

    @k
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new l<E, CharSequence>(this) { // from class: androidx.collection.OrderedScatterSet$toString$1
            final /* synthetic */ OrderedScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
                return invoke((OrderedScatterSet$toString$1<E>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final CharSequence invoke(E e11) {
                return e11 == this.this$0 ? "(this)" : String.valueOf(e11);
            }
        }, 25, null);
    }

    @v0
    public final void unorderedForEach(@k l<? super E, g2> block) {
        g0.p(block, "block");
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
                        block.invoke(objArr[(i11 << 3) + i13]);
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

    @v0
    public final void unorderedForEachIndex(@k l<? super Integer, g2> block) {
        g0.p(block, "block");
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
                        block.invoke(Integer.valueOf((i11 << 3) + i13));
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

    private OrderedScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
    }

    public final boolean any(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && predicate.invoke(objArr[(i11 << 3) + i13]).booleanValue()) {
                            return true;
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

    @IntRange(from = 0)
    public final int count(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128 && predicate.invoke(objArr[(i11 << 3) + i14]).booleanValue()) {
                        i12++;
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator) {
        g0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i11, null, null, 48, null);
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i11, truncated, null, 32, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E first(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.tail;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i11];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i11 = i12;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }

    @w00.k
    @k
    public final String joinToString(@k CharSequence separator, @k CharSequence prefix, @k CharSequence postfix, int i11, @k CharSequence truncated, @m80.l l<? super E, ? extends CharSequence> lVar) {
        g0.p(separator, "separator");
        g0.p(prefix, "prefix");
        g0.p(postfix, "postfix");
        g0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i12 = this.tail;
        int i13 = 0;
        while (true) {
            if (i12 != Integer.MAX_VALUE) {
                int i14 = (int) ((jArr[i12] >> 31) & SieveCacheKt.NodeLinkMask);
                Object obj = objArr[i12];
                if (i13 == i11) {
                    sb2.append(truncated);
                    break;
                }
                if (i13 != 0) {
                    sb2.append(separator);
                }
                if (lVar == null) {
                    sb2.append(obj);
                } else {
                    sb2.append(lVar.invoke(obj));
                }
                i13++;
                i12 = i14;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E last(@k l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i11 = this.head;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) (jArr[i11] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i11];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i11 = i12;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new KotlinNothingValueException();
    }

    @v0
    public static /* synthetic */ void getElements$annotations() {
    }

    @v0
    public static /* synthetic */ void getHead$annotations() {
    }

    @v0
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @v0
    public static /* synthetic */ void getNodes$annotations() {
    }

    @v0
    public static /* synthetic */ void getTail$annotations() {
    }
}
