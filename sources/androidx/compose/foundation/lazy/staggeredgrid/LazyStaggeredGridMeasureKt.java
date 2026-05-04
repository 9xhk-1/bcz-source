package androidx.compose.foundation.lazy.staggeredgrid;

import a00.h0;
import a00.m;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import c40.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 7 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1475:1\n63#1,9:1477\n84#1,4:1492\n1139#1:1509\n1140#1,3:1514\n84#1,4:1517\n84#1,4:1521\n84#1,4:1525\n1139#1:1536\n1140#1,3:1541\n84#1,4:1552\n84#1,4:1556\n1139#1:1577\n1140#1,3:1582\n84#1,4:1587\n84#1,4:1593\n84#1,4:1597\n1139#1:1618\n1140#1,3:1623\n84#1,4:1626\n84#1,4:1630\n1197#1,4:1636\n84#1,4:1640\n84#1,4:1644\n84#1,4:1648\n1103#1,3:1652\n1121#1:1655\n1106#1:1660\n1107#1,9:1663\n1122#1:1679\n1117#1:1680\n84#1,4:1681\n1050#1,25:1685\n1075#1,4:1719\n1079#1:1732\n1076#1,9:1733\n1089#1,7:1743\n1103#1,3:1750\n1121#1:1753\n1106#1:1758\n1107#1,9:1770\n1122#1:1794\n1117#1:1795\n84#1,4:1796\n84#1,4:1800\n62#1:1820\n73#1:1821\n1170#1,11:1825\n1139#1:1836\n1140#1,3:1841\n1121#1:1862\n1122#1:1875\n1139#1:1904\n1140#1,3:1909\n26#2:1476\n26#2:1634\n26#2:1635\n54#3:1486\n59#3:1488\n54#3:1804\n59#3:1806\n85#4:1487\n90#4:1489\n80#4:1491\n90#4:1500\n85#4:1502\n90#4:1506\n85#4:1508\n85#4:1511\n90#4:1513\n90#4:1533\n85#4:1535\n85#4:1538\n90#4:1540\n85#4:1545\n90#4:1549\n85#4:1551\n90#4:1568\n85#4:1570\n90#4:1574\n85#4:1576\n85#4:1579\n90#4:1581\n85#4:1586\n90#4:1609\n85#4:1611\n90#4:1615\n85#4:1617\n85#4:1620\n90#4:1622\n85#4:1805\n90#4:1807\n80#4:1819\n85#4:1838\n90#4:1840\n85#4:1901\n90#4:1903\n85#4:1906\n90#4:1908\n30#5:1490\n30#5:1818\n264#6:1496\n261#6:1497\n261#6:1503\n264#6:1529\n261#6:1530\n261#6:1546\n264#6:1564\n261#6:1565\n261#6:1571\n264#6:1605\n261#6:1606\n261#6:1612\n1135#7:1498\n1132#7:1499\n1129#7:1501\n1135#7:1504\n1132#7:1505\n1129#7:1507\n1129#7:1510\n1132#7:1512\n1135#7:1531\n1132#7:1532\n1129#7:1534\n1129#7:1537\n1132#7:1539\n1129#7:1544\n1135#7:1547\n1132#7:1548\n1129#7:1550\n1135#7:1566\n1132#7:1567\n1129#7:1569\n1135#7:1572\n1132#7:1573\n1129#7:1575\n1129#7:1578\n1132#7:1580\n1129#7:1585\n1135#7:1607\n1132#7:1608\n1129#7:1610\n1135#7:1613\n1132#7:1614\n1129#7:1616\n1129#7:1619\n1132#7:1621\n1129#7:1837\n1132#7:1839\n1129#7:1900\n1132#7:1902\n1129#7:1905\n1132#7:1907\n12504#8,2:1560\n12271#8,2:1562\n12504#8,2:1591\n12313#8,2:1601\n12504#8,2:1603\n12271#8,2:1661\n12313#8,2:1768\n12504#8,2:1814\n12313#8,2:1816\n12474#8,2:1823\n52#9,4:1656\n57#9:1672\n34#9,6:1673\n102#9,2:1710\n34#9,6:1712\n104#9:1718\n117#9,2:1723\n34#9,6:1725\n119#9:1731\n52#9,4:1754\n102#9,2:1759\n34#9,6:1761\n104#9:1767\n57#9:1779\n34#9,4:1780\n102#9,2:1784\n34#9,6:1786\n104#9:1792\n39#9:1793\n34#9,6:1808\n102#9,2:1844\n34#9,6:1846\n104#9:1852\n117#9,2:1853\n34#9,6:1855\n119#9:1861\n52#9,6:1863\n34#9,6:1869\n52#9,6:1876\n34#9,6:1882\n52#9,6:1888\n34#9,6:1894\n1#10:1742\n1#10:1822\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n274#1:1477,9\n366#1:1492,4\n409#1:1509\n409#1:1514,3\n421#1:1517,4\n462#1:1521,4\n496#1:1525,4\n521#1:1536\n521#1:1541,3\n545#1:1552,4\n546#1:1556,4\n579#1:1577\n579#1:1582,3\n600#1:1587,4\n621#1:1593,4\n622#1:1597,4\n689#1:1618\n689#1:1623,3\n727#1:1626,4\n728#1:1630,4\n755#1:1636,4\n759#1:1640,4\n782#1:1644,4\n813#1:1648,4\n817#1:1652,3\n817#1:1655\n817#1:1660\n817#1:1663,9\n817#1:1679\n817#1:1680\n845#1:1681,4\n861#1:1685,25\n861#1:1719,4\n861#1:1732\n861#1:1733,9\n861#1:1743,7\n875#1:1750,3\n875#1:1753\n875#1:1758\n875#1:1770,9\n875#1:1794\n875#1:1795\n906#1:1796,4\n918#1:1800,4\n274#1:1820\n274#1:1821\n1010#1:1825,11\n1032#1:1836\n1032#1:1841,3\n1105#1:1862\n1105#1:1875\n1152#1:1904\n1152#1:1909,3\n185#1:1476\n739#1:1634\n740#1:1635\n300#1:1486\n301#1:1488\n942#1:1804\n944#1:1806\n300#1:1487\n301#1:1489\n314#1:1491\n403#1:1500\n403#1:1502\n408#1:1506\n408#1:1508\n409#1:1511\n409#1:1513\n519#1:1533\n519#1:1535\n521#1:1538\n521#1:1540\n529#1:1545\n538#1:1549\n538#1:1551\n569#1:1568\n569#1:1570\n574#1:1574\n574#1:1576\n579#1:1579\n579#1:1581\n591#1:1586\n683#1:1609\n683#1:1611\n688#1:1615\n688#1:1617\n689#1:1620\n689#1:1622\n942#1:1805\n944#1:1807\n986#1:1819\n1032#1:1838\n1032#1:1840\n1139#1:1901\n1139#1:1903\n1152#1:1906\n1152#1:1908\n314#1:1490\n986#1:1818\n403#1:1496\n403#1:1497\n408#1:1503\n519#1:1529\n519#1:1530\n538#1:1546\n569#1:1564\n569#1:1565\n574#1:1571\n683#1:1605\n683#1:1606\n688#1:1612\n403#1:1498\n403#1:1499\n403#1:1501\n408#1:1504\n408#1:1505\n408#1:1507\n409#1:1510\n409#1:1512\n519#1:1531\n519#1:1532\n519#1:1534\n521#1:1537\n521#1:1539\n529#1:1544\n538#1:1547\n538#1:1548\n538#1:1550\n569#1:1566\n569#1:1567\n569#1:1569\n574#1:1572\n574#1:1573\n574#1:1575\n579#1:1578\n579#1:1580\n591#1:1585\n683#1:1607\n683#1:1608\n683#1:1610\n688#1:1613\n688#1:1614\n688#1:1616\n689#1:1619\n689#1:1621\n1032#1:1837\n1032#1:1839\n1139#1:1900\n1139#1:1902\n1152#1:1905\n1152#1:1907\n555#1:1560,2\n557#1:1562,2\n617#1:1591,2\n630#1:1601,2\n637#1:1603,2\n831#1:1661,2\n896#1:1768,2\n956#1:1814,2\n957#1:1816,2\n1008#1:1823,2\n817#1:1656,4\n817#1:1672\n817#1:1673,6\n861#1:1710,2\n861#1:1712,6\n861#1:1718\n861#1:1723,2\n861#1:1725,6\n861#1:1731\n875#1:1754,4\n889#1:1759,2\n889#1:1761,6\n889#1:1767\n875#1:1779\n875#1:1780,4\n889#1:1784,2\n889#1:1786,6\n889#1:1792\n875#1:1793\n947#1:1808,6\n1074#1:1844,2\n1074#1:1846,6\n1074#1:1852\n1078#1:1853,2\n1078#1:1855,6\n1078#1:1861\n1105#1:1863,6\n1105#1:1869,6\n1121#1:1876,6\n1121#1:1882,6\n1121#1:1888,6\n1121#1:1894,6\n861#1:1742\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, l<? super LazyStaggeredGridMeasuredItem, g2> lVar, l<? super Integer, Boolean> lVar2, boolean z11) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z11) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i11 = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (lVar2.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long m939getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m939getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m948getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m948getAndMeasurejy6DScQ(intValue, m939getSpanRangelOCCd4c);
                        lVar.invoke(m948getAndMeasurejy6DScQ);
                        arrayList.add(m948getAndMeasurejy6DScQ);
                    }
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int intValue2 = pinnedItems.get(i12).intValue();
                if (lVar2.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long m939getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m939getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m948getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m948getAndMeasurejy6DScQ(intValue2, m939getSpanRangelOCCd4c2);
                    lVar.invoke(m948getAndMeasurejy6DScQ2);
                    arrayList.add(m948getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? h0.J() : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, m<LazyStaggeredGridMeasuredItem>[] mVarArr, int[] iArr, int i11, int i12, int i13) {
        int i14 = 0;
        for (m<LazyStaggeredGridMeasuredItem> mVar : mVarArr) {
            i14 += mVar.size();
        }
        ArrayList arrayList = new ArrayList(i14);
        while (true) {
            for (m<LazyStaggeredGridMeasuredItem> mVar2 : mVarArr) {
                if (!mVar2.isEmpty()) {
                    int length = mVarArr.length;
                    int i15 = -1;
                    int i16 = Integer.MAX_VALUE;
                    for (int i17 = 0; i17 < length; i17++) {
                        LazyStaggeredGridMeasuredItem h11 = mVarArr[i17].h();
                        int index = h11 != null ? h11.getIndex() : Integer.MAX_VALUE;
                        if (i16 > index) {
                            i15 = i17;
                            i16 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = mVarArr[i15].removeFirst();
                    if (removeFirst.getLane() == i15) {
                        long m954constructorimpl = SpanRange.m954constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m943maxInRangejy6DScQ = m943maxInRangejy6DScQ(iArr, m954constructorimpl);
                        int i18 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i15];
                        if (removeFirst.getMainAxisSize() + m943maxInRangejy6DScQ >= i12 && m943maxInRangejy6DScQ <= i13) {
                            removeFirst.position(m943maxInRangejy6DScQ, i18, i11);
                            arrayList.add(removeFirst);
                        }
                        int i19 = (int) (m954constructorimpl & 4294967295L);
                        for (int i21 = (int) (m954constructorimpl >> 32); i21 < i19; i21++) {
                            iArr[i21] = removeFirst.getMainAxisSizeWithSpacings() + m943maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final String debugRender(m<LazyStaggeredGridMeasuredItem>[] mVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i11) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i12 = length - 1;
            while (true) {
                if (iArr[length] < i11 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i12 < 0) {
                return;
            } else {
                length = i12;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z11, l<? super T, g2> lVar) {
        if (!z11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                lVar.invoke(list.get(i11));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i12 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i12 < 0) {
                return;
            } else {
                size2 = i12;
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if (!z11) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                lVar.invoke(list.get(i12));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i13 = size2 - 1;
            lVar.invoke(list.get(size2));
            if (i13 < 0) {
                return;
            } else {
                size2 = i13;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i11, int i12) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i11, i12);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m942forEachnIS5qE8(long j11, l<? super Integer, g2> lVar) {
        int i11 = (int) (j11 & 4294967295L);
        for (int i12 = (int) (j11 >> 32); i12 < i11; i12++) {
            lVar.invoke(Integer.valueOf(i12));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i11 = -1;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i12 < i14) {
                i11 = i13;
                i12 = i14;
            }
        }
        return i11;
    }

    private static final <T> int indexOfMinBy(T[] tArr, l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i11 = -1;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < length; i13++) {
            int intValue = lVar.invoke(tArr[i13]).intValue();
            if (i12 > intValue) {
                i11 = i13;
                i12 = intValue;
            }
        }
        return i11;
    }

    public static final int indexOfMinValue(@k int[] iArr, int i11) {
        int length = iArr.length;
        int i12 = -1;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i11 + 1;
            int i16 = iArr[i14];
            if (i15 <= i16 && i16 < i13) {
                i12 = i14;
                i13 = i16;
            }
        }
        return i12;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r8 = r10.get(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r7, int r8, int r9, boolean r10, x00.p<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem, ? super java.lang.Integer, yz.g2> r11) {
        /*
            r0 = 0
            if (r10 == 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            if (r10 == 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lf1
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            int r1 = r10.size()
            int r1 = r1 + (-1)
        L27:
            r2 = -1
            if (r2 >= r1) goto L50
            java.lang.Object r2 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 <= r8) goto L4d
            if (r1 == 0) goto L46
            int r2 = r1 + (-1)
            java.lang.Object r2 = r10.get(r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r2
            int r2 = r2.getIndex()
            if (r2 > r8) goto L4d
        L46:
            java.lang.Object r8 = r10.get(r1)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r8
            goto L51
        L4d:
            int r1 = r1 + (-1)
            goto L27
        L50:
            r8 = r0
        L51:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r10 = r7.getApproachLayoutInfo()
            java.util.List r10 = r10.getVisibleItemsInfo()
            java.lang.Object r10 = a00.r0.u3(r10)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r10 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r10
            if (r8 == 0) goto Lf1
            int r8 = r8.getIndex()
            int r10 = r10.getIndex()
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.min(r10, r9)
            if (r8 > r9) goto Lf1
            r10 = r0
        L72:
            r1 = 0
            if (r10 == 0) goto L8f
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = r1
        L7d:
            if (r3 >= r2) goto L8f
            java.lang.Object r4 = r10.get(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) r4
            int r4 = r4.getIndex()
            if (r4 != r8) goto L8c
            goto Leb
        L8c:
            int r3 = r3 + 1
            goto L7d
        L8f:
            if (r10 != 0) goto L96
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L96:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo r2 = r7.getApproachLayoutInfo()
            java.util.List r2 = r2.getVisibleItemsInfo()
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r1
        La6:
            if (r4 >= r3) goto Lb9
            java.lang.Object r5 = r2.get(r4)
            r6 = r5
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r6
            int r6 = r6.getIndex()
            if (r6 != r8) goto Lb6
            goto Lba
        Lb6:
            int r4 = r4 + 1
            goto La6
        Lb9:
            r5 = r0
        Lba:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r5
            if (r5 == 0) goto Lc3
            int r2 = r5.getLane()
            goto Lc4
        Lc3:
            r2 = r1
        Lc4:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider r3 = r7.getItemProvider()
            long r3 = r7.m939getSpanRangelOCCd4c(r3, r8, r2)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r5 = r7.getMeasuredItemProvider()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem r3 = r5.m948getAndMeasurejy6DScQ(r8, r3)
            r10.add(r3)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots r4 = r7.getResolvedSlots()
            int[] r4 = r4.getPositions()
            int r5 = r4.length
            if (r5 <= r2) goto Le4
            r1 = r4[r2]
        Le4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r3, r1)
        Leb:
            if (r8 == r9) goto Lf0
            int r8 = r8 + 1
            goto L72
        Lf0:
            return r10
        Lf1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.itemsRetainedForLookahead(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int, boolean, x00.p):java.util.List");
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m943maxInRangejy6DScQ(int[] iArr, long j11) {
        int i11 = (int) (j11 & 4294967295L);
        int i12 = Integer.MIN_VALUE;
        for (int i13 = (int) (j11 >> 32); i13 < i11; i13++) {
            i12 = Math.max(i12, iArr[i13]);
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x022a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023e, code lost:
    
        r4 = indexOfMinValue$default(r14, 0, 1, null);
        r1 = a00.a0.ql(r9) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0247, code lost:
    
        if (r1 < r12) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x094b, code lost:
    
        r27 = r3;
        r7 = r14;
        r8 = r24;
        r11 = r29;
        r43 = r30;
        r29 = r5;
        r5 = r0;
        r0 = r48;
        r2 = r5.m939getSpanRangelOCCd4c(r5.getItemProvider(), r1, r4);
        r4 = r5.getLaneInfo();
        r13 = (int) (r2 & 4294967295L);
        r5 = (int) (r2 >> 32);
        r6 = r13 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0970, code lost:
    
        if (r6 == 1) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0972, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0977, code lost:
    
        if (r20 == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0979, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x097c, code lost:
    
        r4.setLane(r1, r14);
        r4 = r45.getMeasuredItemProvider().m948getAndMeasurejy6DScQ(r1, r2);
        r2 = m943maxInRangejy6DScQ(r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x098c, code lost:
    
        if (r6 == 1) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x098e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0991, code lost:
    
        if (r3 == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0993, code lost:
    
        r3 = r45.getLaneInfo().getGaps(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x099b, code lost:
    
        if (r3 != null) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x099d, code lost:
    
        r3 = new int[r45.getLaneCount()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x09a5, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x09a6, code lost:
    
        if (r6 >= r13) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x09a8, code lost:
    
        if (r3 == null) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x09aa, code lost:
    
        r3[r6] = r2 - r7[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x09b0, code lost:
    
        r9[r6] = r1;
        r7[r6] = r2 + r4.getMainAxisSizeWithSpacings();
        r0[r6].addLast(r4);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x09c3, code lost:
    
        r45.getLaneInfo().setGaps(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x09ca, code lost:
    
        if (r2 >= r15) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x09ce, code lost:
    
        if (r7[r5] > r15) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x09d0, code lost:
    
        r4.setVisible(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x09a4, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0990, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x097b, code lost:
    
        r14 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0975, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0560, code lost:
    
        if ((r3 != null ? r3.getIndex() : -1) > r2) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x079a, code lost:
    
        if (r9[r4] < r7) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02f2, code lost:
    
        r4 = indexOfMinValue$default(r7, 0, 1, null);
        r6 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02fd, code lost:
    
        if (r4 == r6) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0303, code lost:
    
        if (r7[r4] != r7[r6]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0305, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0307, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0308, code lost:
    
        r6 = r28[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x030b, code lost:
    
        if (r6 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x030d, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x030e, code lost:
    
        r6 = findPreviousItemIndex(r0, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0312, code lost:
    
        if (r6 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0351, code lost:
    
        r8 = r28;
        r11 = r29;
        r25 = r14;
        r13 = r0.m939getSpanRangelOCCd4c(r0.getItemProvider(), r6, r4);
        r4 = r0.getLaneInfo();
        r15 = r1;
        r46 = r2;
        r1 = (int) (r13 & 4294967295L);
        r27 = r3;
        r2 = (int) (r13 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0373, code lost:
    
        if (r3 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0375, code lost:
    
        r2 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0379, code lost:
    
        r4.setLane(r6, r2);
        r2 = r0.getMeasuredItemProvider().m948getAndMeasurejy6DScQ(r6, r13);
        r4 = m943maxInRangejy6DScQ(r7, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0389, code lost:
    
        if (r3 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x038b, code lost:
    
        r3 = r0.getLaneInfo().getGaps(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0395, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0397, code lost:
    
        if (r14 >= r1) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x039b, code lost:
    
        if (r7[r14] == r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x039d, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x039e, code lost:
    
        r48[r14].addFirst(r2);
        r8[r14] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x03a5, code lost:
    
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x03a7, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x03ab, code lost:
    
        r7[r14] = (r4 + r2.getMainAxisSizeWithSpacings()) + r13;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x03a9, code lost:
    
        r13 = r3[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0394, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0377, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0314, code lost:
    
        r8 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0316, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x031c, code lost:
    
        if (measure$lambda$43$misalignedStart(r8, r0, r7, r4) == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x031e, code lost:
    
        if (r49 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0320, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r8.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x032b, code lost:
    
        if (r3 >= r1) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x032d, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0334, code lost:
    
        r1 = r7.length;
        r3 = new int[r1];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0338, code lost:
    
        if (r5 >= r1) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x033a, code lost:
    
        r3[r5] = r7[r4];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0348, code lost:
    
        return measure(r0, r29, r2, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0723 A[LOOP:21: B:287:0x066e->B:319:0x0723, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0735 A[EDGE_INSN: B:320:0x0735->B:321:0x0735 BREAK  A[LOOP:21: B:287:0x066e->B:319:0x0723], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x071b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r45, int r46, int[] r47, int[] r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 2773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$43$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            if (iArr2[i11] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i12 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$43$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i11) {
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i12], i12) == -1 && iArr2[i12] != iArr2[i11]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i13 = 0; i13 < length2; i13++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i13], i13) != -1 && iArr2[i13] >= iArr2[i11]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    @k
    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m944measureStaggeredGridC6celF4(@k LazyLayoutMeasureScope lazyLayoutMeasureScope, @k LazyStaggeredGridState lazyStaggeredGridState, @k List<Integer> list, @k LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, @k LazyStaggeredGridSlots lazyStaggeredGridSlots, long j11, boolean z11, boolean z12, long j12, int i11, int i12, int i13, int i14, @k r0 r0Var, boolean z13, boolean z14, @m80.l LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, @k GraphicsContext graphicsContext) {
        int m943maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j11, z11, lazyLayoutMeasureScope, i11, j12, i13, i14, z12, i12, r0Var, z13, z14, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i15 = 0;
            while (i15 < laneCount) {
                if (i15 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m943maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i15]) == -1) {
                    m943maxInRangejy6DScQ = i15 == 0 ? 0 : m943maxInRangejy6DScQ(iArr, SpanRange.m954constructorimpl(0, i15)) + 1;
                }
                iArr[i15] = m943maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i15], i15);
                i15++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i16 = 0;
            while (i16 < laneCount2) {
                iArr2[i16] = i16 < scrollOffsets.length ? scrollOffsets[i16] : i16 == 0 ? 0 : iArr2[i16 - 1];
                i16++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation_release(z14)), updateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i11) {
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = iArr[i12] + i11;
        }
    }

    private static final int[] transform(int[] iArr, l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = lVar.invoke(Integer.valueOf(iArr[i11])).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, l<? super LazyLayoutMeasureScope, ? extends T> lVar) {
        return lVar.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
