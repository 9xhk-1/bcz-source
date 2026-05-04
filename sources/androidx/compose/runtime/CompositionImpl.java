package androidx.compose.runtime;

import a00.a0;
import a00.q;
import a00.r0;
import a00.w1;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import m80.o;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 18 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 19 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1354:1\n1110#1,2:1407\n1294#1,3:1409\n1100#1,6:1414\n1298#1,4:1421\n1112#1,4:1425\n1100#1,6:1431\n1110#1,2:1934\n1294#1,3:1936\n1100#1,6:1939\n1298#1,4:1946\n1112#1,4:1950\n1110#1,2:1969\n1294#1,3:1971\n1298#1,4:1975\n1112#1,4:1979\n1110#1,2:2075\n1294#1,3:2077\n1298#1,4:2081\n1112#1,4:2085\n1110#1,2:2091\n1294#1,3:2093\n1298#1,4:2097\n1112#1,4:2101\n1110#1,2:2107\n1294#1,3:2109\n1298#1,4:2113\n1112#1,4:2117\n1294#1,3:2121\n1298#1,4:2125\n27#2:1355\n33#2,2:1357\n33#2,2:1394\n33#2,2:1396\n33#2,2:1412\n33#2,2:1429\n33#2,2:1437\n33#2,2:1452\n33#2,2:1454\n33#2,2:1895\n33#2,2:1932\n33#2,2:2073\n33#2,2:2089\n33#2,2:2105\n33#2,2:2129\n33#2,2:2133\n33#2,2:2135\n33#2,2:2137\n33#2,2:2202\n1#3:1356\n1#3:1420\n1#3:1448\n1#3:1945\n1#3:1974\n1#3:1987\n1#3:1998\n1#3:2080\n1#3:2096\n1#3:2112\n1#3:2124\n1#3:2189\n1#3:2211\n48#4,5:1359\n48#4,5:1364\n48#4,5:1369\n48#4,5:1374\n48#4,5:1379\n48#4,5:1384\n48#4,5:1389\n48#4,5:1439\n48#4,5:2196\n90#5,2:1398\n33#5,6:1400\n92#5:1406\n105#5,2:1954\n33#5,6:1956\n107#5:1962\n33#5,4:2192\n38#5:2201\n174#6,4:1444\n179#6,3:1449\n174#6,4:1983\n179#6,3:1988\n174#6,4:1994\n179#6,3:1999\n174#6,4:2207\n179#6,3:2212\n41#7,3:1456\n46#7:1484\n48#7:1487\n41#7,3:1523\n46#7:1585\n48#7:1613\n231#8,3:1459\n200#8,7:1462\n211#8,3:1470\n214#8,9:1474\n234#8:1483\n231#8,3:1494\n200#8,7:1497\n211#8,3:1505\n214#8,9:1509\n234#8:1518\n231#8,3:1526\n200#8,7:1529\n211#8,3:1537\n214#8,2:1541\n231#8,3:1549\n200#8,7:1552\n211#8,3:1560\n214#8,9:1564\n234#8:1573\n217#8,6:1578\n234#8:1584\n231#8,3:1587\n200#8,7:1590\n211#8,3:1598\n214#8,9:1602\n234#8:1611\n200#8,7:1636\n211#8,3:1644\n214#8,2:1648\n217#8,6:1654\n200#8,7:1700\n211#8,3:1708\n214#8,2:1712\n217#8,6:1718\n200#8,16:1764\n217#8,6:1784\n200#8,7:1810\n211#8,3:1818\n214#8,2:1822\n217#8,6:1828\n231#8,3:1866\n200#8,7:1869\n211#8,3:1877\n214#8,9:1881\n234#8:1890\n231#8,3:1903\n200#8,7:1906\n211#8,3:1914\n214#8,9:1918\n234#8:1927\n200#8,16:2028\n217#8,6:2048\n231#8,3:2146\n200#8,7:2149\n211#8,3:2157\n214#8,9:2161\n234#8:2170\n1399#9:1469\n1270#9:1473\n1399#9:1504\n1270#9:1508\n1399#9:1536\n1270#9:1540\n1399#9:1559\n1270#9:1563\n1399#9:1597\n1270#9:1601\n1399#9:1622\n1270#9:1626\n1399#9:1643\n1270#9:1647\n1399#9:1686\n1270#9:1690\n1399#9:1707\n1270#9:1711\n1399#9:1750\n1270#9:1754\n1399#9:1817\n1270#9:1821\n1399#9:1845\n1270#9:1849\n1399#9:1876\n1270#9:1880\n1399#9:1913\n1270#9:1917\n1399#9:2014\n1270#9:2018\n1399#9:2156\n1270#9:2160\n1855#10,2:1485\n1855#10:1586\n1856#10:1612\n67#11,6:1488\n75#11,4:1519\n67#11,6:1543\n75#11,4:1574\n123#11:1614\n124#11,4:1630\n128#11,6:1661\n135#11:1677\n123#11:1678\n124#11,4:1694\n128#11,6:1725\n135#11:1741\n123#11:1742\n124#11,4:1758\n128#11,6:1791\n135#11:1807\n67#11,6:1860\n75#11,4:1891\n67#11,6:1897\n75#11,4:1928\n123#11:2006\n124#11,4:2022\n128#11,6:2055\n135#11:2071\n81#11:2139\n67#11,6:2140\n75#11,8:2171\n842#12:1615\n844#12:1629\n845#12,3:1667\n848#12:1676\n842#12:1679\n844#12:1693\n845#12,3:1731\n848#12:1740\n842#12:1743\n844#12:1757\n845#12,3:1797\n848#12:1806\n842#12:2007\n844#12:2021\n845#12,3:2061\n848#12:2070\n329#13,6:1616\n339#13,3:1623\n342#13,2:1627\n345#13,6:1670\n329#13,6:1680\n339#13,3:1687\n342#13,2:1691\n345#13,6:1734\n329#13,6:1744\n339#13,3:1751\n342#13,2:1755\n345#13,6:1800\n329#13,6:2008\n339#13,3:2015\n342#13,2:2019\n345#13,6:2064\n809#14,2:1634\n812#14,4:1650\n816#14:1660\n809#14,2:1698\n812#14,4:1714\n816#14:1724\n809#14,2:1762\n812#14,4:1780\n816#14:1790\n809#14,2:1808\n812#14,4:1824\n816#14:1834\n809#14,2:2026\n812#14,4:2044\n816#14:2054\n54#15:1835\n54#15:1852\n403#16,3:1836\n367#16,6:1839\n377#16,3:1846\n380#16,2:1850\n383#16,6:1853\n406#16:1859\n4665#17:1963\n4643#17,5:1964\n45#18,3:1991\n49#18:2002\n45#18,3:2003\n49#18:2072\n45#18,3:2204\n49#18:2215\n13309#19,2:2131\n11383#19,9:2179\n13309#19:2188\n13310#19:2190\n11392#19:2191\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n780#1:1407,2\n780#1:1409,3\n783#1:1414,6\n780#1:1421,4\n780#1:1425,4\n802#1:1431,6\n994#1:1934,2\n994#1:1936,3\n995#1:1939,6\n994#1:1946,4\n994#1:1950,4\n1015#1:1969,2\n1015#1:1971,3\n1015#1:1975,4\n1015#1:1979,4\n1066#1:2075,2\n1066#1:2077,3\n1066#1:2081,4\n1066#1:2085,4\n1075#1:2091,2\n1075#1:2093,3\n1075#1:2097,4\n1075#1:2101,4\n1085#1:2107,2\n1085#1:2109,3\n1085#1:2113,4\n1085#1:2117,4\n1111#1:2121,3\n1111#1:2125,4\n452#1:1355\n610#1:1357,2\n682#1:1394,2\n699#1:1396,2\n781#1:1412,2\n800#1:1429,2\n809#1:1437,2\n854#1:1452,2\n877#1:1454,2\n983#1:1895,2\n992#1:1932,2\n1065#1:2073,2\n1074#1:2089,2\n1084#1:2105,2\n1128#1:2129,2\n1132#1:2133,2\n1175#1:2135,2\n1203#1:2137,2\n1320#1:2202,2\n780#1:1420\n840#1:1448\n994#1:1945\n1015#1:1974\n1021#1:1987\n1035#1:1998\n1066#1:2080\n1075#1:2096\n1085#1:2112\n1111#1:2124\n1281#1:2189\n1327#1:2211\n613#1:1359,5\n620#1:1364,5\n631#1:1369,5\n632#1:1374,5\n651#1:1379,5\n652#1:1384,5\n675#1:1389,5\n810#1:1439,5\n1284#1:2196,5\n706#1:1398,2\n706#1:1400,6\n706#1:1406\n1014#1:1954,2\n1014#1:1956,6\n1014#1:1962\n1282#1:2192,4\n1282#1:2201\n840#1:1444,4\n840#1:1449,3\n1021#1:1983,4\n1021#1:1988,3\n1035#1:1994,4\n1035#1:1999,3\n1327#1:2207,4\n1327#1:2212,3\n885#1:1456,3\n885#1:1484\n885#1:1487\n909#1:1523,3\n909#1:1585\n909#1:1613\n885#1:1459,3\n885#1:1462,7\n885#1:1470,3\n885#1:1474,9\n885#1:1483\n894#1:1494,3\n894#1:1497,7\n894#1:1505,3\n894#1:1509,9\n894#1:1518\n909#1:1526,3\n909#1:1529,7\n909#1:1537,3\n909#1:1541,2\n914#1:1549,3\n914#1:1552,7\n914#1:1560,3\n914#1:1564,9\n914#1:1573\n909#1:1578,6\n909#1:1584\n914#1:1587,3\n914#1:1590,7\n914#1:1598,3\n914#1:1602,9\n914#1:1611\n923#1:1636,7\n923#1:1644,3\n923#1:1648,2\n923#1:1654,6\n929#1:1700,7\n929#1:1708,3\n929#1:1712,2\n929#1:1718,6\n936#1:1764,16\n936#1:1784,6\n938#1:1810,7\n938#1:1818,3\n938#1:1822,2\n938#1:1828,6\n974#1:1866,3\n974#1:1869,7\n974#1:1877,3\n974#1:1881,9\n974#1:1890\n988#1:1903,3\n988#1:1906,7\n988#1:1914,3\n988#1:1918,9\n988#1:1927\n1050#1:2028,16\n1050#1:2048,6\n1239#1:2146,3\n1239#1:2149,7\n1239#1:2157,3\n1239#1:2161,9\n1239#1:2170\n885#1:1469\n885#1:1473\n894#1:1504\n894#1:1508\n909#1:1536\n909#1:1540\n914#1:1559\n914#1:1563\n914#1:1597\n914#1:1601\n923#1:1622\n923#1:1626\n923#1:1643\n923#1:1647\n929#1:1686\n929#1:1690\n929#1:1707\n929#1:1711\n936#1:1750\n936#1:1754\n938#1:1817\n938#1:1821\n959#1:1845\n959#1:1849\n974#1:1876\n974#1:1880\n988#1:1913\n988#1:1917\n1050#1:2014\n1050#1:2018\n1239#1:2156\n1239#1:2160\n885#1:1485,2\n909#1:1586\n909#1:1612\n894#1:1488,6\n894#1:1519,4\n914#1:1543,6\n914#1:1574,4\n923#1:1614\n923#1:1630,4\n923#1:1661,6\n923#1:1677\n929#1:1678\n929#1:1694,4\n929#1:1725,6\n929#1:1741\n936#1:1742\n936#1:1758,4\n936#1:1791,6\n936#1:1807\n974#1:1860,6\n974#1:1891,4\n988#1:1897,6\n988#1:1928,4\n1050#1:2006\n1050#1:2022,4\n1050#1:2055,6\n1050#1:2071\n1239#1:2139\n1239#1:2140,6\n1239#1:2171,8\n923#1:1615\n923#1:1629\n923#1:1667,3\n923#1:1676\n929#1:1679\n929#1:1693\n929#1:1731,3\n929#1:1740\n936#1:1743\n936#1:1757\n936#1:1797,3\n936#1:1806\n1050#1:2007\n1050#1:2021\n1050#1:2061,3\n1050#1:2070\n923#1:1616,6\n923#1:1623,3\n923#1:1627,2\n923#1:1670,6\n929#1:1680,6\n929#1:1687,3\n929#1:1691,2\n929#1:1734,6\n936#1:1744,6\n936#1:1751,3\n936#1:1755,2\n936#1:1800,6\n1050#1:2008,6\n1050#1:2015,3\n1050#1:2019,2\n1050#1:2064,6\n923#1:1634,2\n923#1:1650,4\n923#1:1660\n929#1:1698,2\n929#1:1714,4\n929#1:1724\n936#1:1762,2\n936#1:1780,4\n936#1:1790\n938#1:1808,2\n938#1:1824,4\n938#1:1834\n1050#1:2026,2\n1050#1:2044,4\n1050#1:2054\n950#1:1835\n961#1:1852\n959#1:1836,3\n959#1:1839,6\n959#1:1846,3\n959#1:1850,2\n959#1:1853,6\n959#1:1859\n1014#1:1963\n1014#1:1964,5\n1029#1:1991,3\n1029#1:2002\n1048#1:2003,3\n1048#1:2072\n1323#1:2204,3\n1323#1:2215\n1128#1:2131,2\n1281#1:2179,9\n1281#1:2188\n1281#1:2190\n1281#1:2191\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {
    public static final int $stable = 8;

    @l
    private final d _recomposeContext;

    @k
    private final Set<RememberObserver> abandonSet;

    @k
    private final Applier<?> applier;

    @k
    private final ChangeList changes;

    @k
    private p<? super Composer, ? super Integer, g2> composable;

    @k
    private final ComposerImpl composer;

    @k
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @k
    private final MutableScatterMap<Object, Object> derivedStates;
    private boolean disposed;

    @k
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;

    @l
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @k
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;

    @k
    private final ChangeList lateChanges;

    @k
    private final Object lock;

    @k
    private final MutableScatterMap<Object, Object> observations;

    @k
    private final MutableScatterMap<Object, Object> observationsProcessed;

    @k
    private final CompositionObserverHolder observerHolder;

    @k
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @k
    private final AtomicReference<Object> pendingModifications;

    @l
    private PausedCompositionImpl pendingPausedComposition;

    @l
    private ShouldPauseCallback shouldPause;

    @k
    private final SlotTable slotTable;

    public CompositionImpl(@k CompositionContext compositionContext, @k Applier<?> applier, @l d dVar) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> asMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = asMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m2051constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = ScopeMap.m2051constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m2051constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m2051constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, asMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = dVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1887getLambda1$runtime_release();
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z11) {
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (ScopeMap.m2058removeimpl(this.observationsProcessed, obj, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || z11) {
                this.invalidatedScopes.add(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i11 << 3) + i13];
                        if (!ScopeMap.m2058removeimpl(this.observationsProcessed, obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || z11) {
                                this.invalidatedScopes.add(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                            }
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

    private final void applyChangesInLocked(ChangeList changeList) {
        Applier<?> applier;
        RememberEventDispatcher rememberEventDispatcher;
        RememberEventDispatcher rememberEventDispatcher2;
        long[] jArr;
        RememberEventDispatcher rememberEventDispatcher3;
        long[] jArr2;
        int i11;
        long j11;
        char c11;
        long j12;
        int i12;
        boolean z11;
        long j13;
        RememberEventDispatcher rememberEventDispatcher4 = new RememberEventDispatcher(this.abandonSet);
        try {
            if (changeList.isEmpty()) {
                if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                    rememberEventDispatcher4.dispatchAbandons();
                    return;
                }
                return;
            }
            try {
                Trace trace = Trace.INSTANCE;
                Object beginSection = trace.beginSection("Compose:applyChanges");
                try {
                    PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
                    if (pausedCompositionImpl == null || (applier = pausedCompositionImpl.getPausableApplier$runtime_release()) == null) {
                        applier = this.applier;
                    }
                    PausedCompositionImpl pausedCompositionImpl2 = this.pendingPausedComposition;
                    if (pausedCompositionImpl2 == null || (rememberEventDispatcher = pausedCompositionImpl2.getRememberManager$runtime_release()) == null) {
                        rememberEventDispatcher = rememberEventDispatcher4;
                    }
                    applier.onBeginChanges();
                    SlotWriter openWriter = this.slotTable.openWriter();
                    int i13 = 0;
                    try {
                        changeList.executeAndFlushAllPendingChanges(applier, openWriter, rememberEventDispatcher);
                        g2 g2Var = g2.f100423a;
                        openWriter.close(true);
                        applier.onEndChanges();
                        trace.endSection(beginSection);
                        rememberEventDispatcher4.dispatchRememberObservers();
                        rememberEventDispatcher4.dispatchSideEffects();
                        if (this.pendingInvalidScopes) {
                            Object beginSection2 = trace.beginSection("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
                                long[] jArr3 = mutableScatterMap.metadata;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j14 = jArr3[i14];
                                        char c12 = 7;
                                        long j15 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = i13;
                                            while (i17 < i16) {
                                                if ((j14 & 255) < 128) {
                                                    c11 = c12;
                                                    int i18 = (i14 << 3) + i17;
                                                    j12 = j15;
                                                    Object obj = mutableScatterMap.keys[i18];
                                                    Object obj2 = mutableScatterMap.values[i18];
                                                    if (obj2 instanceof MutableScatterSet) {
                                                        g0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                        Object[] objArr = mutableScatterSet.elements;
                                                        long[] jArr4 = mutableScatterSet.metadata;
                                                        int i19 = i15;
                                                        int length2 = jArr4.length - 2;
                                                        rememberEventDispatcher3 = rememberEventDispatcher4;
                                                        jArr2 = jArr3;
                                                        i11 = i17;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j16 = jArr4[i21];
                                                                    j11 = j14;
                                                                    if ((((~j16) << c11) & j16 & j12) != j12) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j16 & 255) < 128) {
                                                                                j13 = j16;
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((RecomposeScopeImpl) objArr[i24]).getValid()) {
                                                                                    mutableScatterSet.removeElementAt(i24);
                                                                                }
                                                                            } else {
                                                                                j13 = j16;
                                                                            }
                                                                            j16 = j13 >> i19;
                                                                        }
                                                                        if (i22 != i19) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    j14 = j11;
                                                                    i19 = 8;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.INSTANCE.endSection(beginSection2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j11 = j14;
                                                        }
                                                        z11 = mutableScatterSet.isEmpty();
                                                    } else {
                                                        rememberEventDispatcher3 = rememberEventDispatcher4;
                                                        jArr2 = jArr3;
                                                        i11 = i17;
                                                        j11 = j14;
                                                        g0.n(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        z11 = !((RecomposeScopeImpl) obj2).getValid();
                                                    }
                                                    if (z11) {
                                                        mutableScatterMap.removeValueAt(i18);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    rememberEventDispatcher3 = rememberEventDispatcher4;
                                                    jArr2 = jArr3;
                                                    i11 = i17;
                                                    j11 = j14;
                                                    c11 = c12;
                                                    j12 = j15;
                                                    i12 = i15;
                                                }
                                                j14 = j11 >> i12;
                                                i17 = i11 + 1;
                                                i15 = i12;
                                                c12 = c11;
                                                j15 = j12;
                                                rememberEventDispatcher4 = rememberEventDispatcher3;
                                                jArr3 = jArr2;
                                            }
                                            rememberEventDispatcher2 = rememberEventDispatcher4;
                                            jArr = jArr3;
                                            if (i16 != i15) {
                                                break;
                                            }
                                        } else {
                                            rememberEventDispatcher2 = rememberEventDispatcher4;
                                            jArr = jArr3;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        rememberEventDispatcher4 = rememberEventDispatcher2;
                                        jArr3 = jArr;
                                        i13 = 0;
                                    }
                                } else {
                                    rememberEventDispatcher2 = rememberEventDispatcher4;
                                }
                                cleanUpDerivedStateObservations();
                                g2 g2Var2 = g2.f100423a;
                                Trace.INSTANCE.endSection(beginSection2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            rememberEventDispatcher2 = rememberEventDispatcher4;
                        }
                        if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                            rememberEventDispatcher2.dispatchAbandons();
                        }
                    } catch (Throwable th4) {
                        try {
                            openWriter.close(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.INSTANCE.endSection(beginSection);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                    rememberEventDispatcher4.dispatchAbandons();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    private final void cleanUpDerivedStateObservations() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        int i11;
        char c12;
        long j15;
        long j16;
        int i12;
        boolean z11;
        long[] jArr3;
        int i13;
        int i14;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c13 = 7;
        long j17 = -9187201950435737472L;
        int i15 = 8;
        if (length >= 0) {
            int i16 = 0;
            long j18 = 128;
            while (true) {
                long j19 = jArr4[i16];
                j12 = 255;
                if ((((~j19) << c13) & j19 & j17) != j17) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j19 & 255) < j18) {
                            c12 = c13;
                            int i19 = (i16 << 3) + i18;
                            j15 = j17;
                            Object obj = mutableScatterMap.keys[i19];
                            Object obj2 = mutableScatterMap.values[i19];
                            if (obj2 instanceof MutableScatterSet) {
                                g0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j16 = j18;
                                    int i21 = 0;
                                    int i22 = i15;
                                    while (true) {
                                        int i23 = length2;
                                        long j21 = jArr5[i21];
                                        j14 = j19;
                                        if ((((~j21) << c12) & j21 & j15) != j15) {
                                            int i24 = 8 - ((~(i21 - i23)) >>> 31);
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                if ((j21 & 255) < j16) {
                                                    jArr3 = jArr4;
                                                    int i26 = (i21 << 3) + i25;
                                                    i13 = i25;
                                                    i14 = i18;
                                                    if (!ScopeMap.m2052containsimpl(this.observations, (DerivedState) objArr[i26])) {
                                                        mutableScatterSet.removeElementAt(i26);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i13 = i25;
                                                    i14 = i18;
                                                }
                                                j21 >>= i22;
                                                i25 = i13 + 1;
                                                i18 = i14;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i11 = i18;
                                            if (i24 != i22) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i11 = i18;
                                        }
                                        length2 = i23;
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        j19 = j14;
                                        i18 = i11;
                                        jArr4 = jArr2;
                                        i22 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j14 = j19;
                                    i11 = i18;
                                    j16 = j18;
                                }
                                z11 = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j14 = j19;
                                i11 = i18;
                                j16 = j18;
                                g0.n(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z11 = !ScopeMap.m2052containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (z11) {
                                mutableScatterMap.removeValueAt(i19);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr4;
                            j14 = j19;
                            i11 = i18;
                            c12 = c13;
                            j15 = j17;
                            j16 = j18;
                            i12 = i15;
                        }
                        j19 = j14 >> i12;
                        i18 = i11 + 1;
                        i15 = i12;
                        c13 = c12;
                        j17 = j15;
                        j18 = j16;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c11 = c13;
                    j11 = j17;
                    j13 = j18;
                    if (i17 != i15) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c11 = c13;
                    j11 = j17;
                    j13 = j18;
                }
                if (i16 == length) {
                    break;
                }
                i16++;
                c13 = c11;
                j17 = j11;
                j18 = j13;
                jArr4 = jArr;
                i15 = 8;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 255;
            j13 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j22 = jArr6[i27];
            if ((((~j22) << c11) & j22 & j11) != j11) {
                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                for (int i29 = 0; i29 < i28; i29++) {
                    if ((j22 & j12) < j13) {
                        int i31 = (i27 << 3) + i29;
                        if (!((RecomposeScopeImpl) objArr2[i31]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i31);
                        }
                    }
                    j22 >>= 8;
                }
                if (i28 != 8) {
                    return;
                }
            }
            if (i27 == length3) {
                return;
            } else {
                i27++;
            }
        }
    }

    private final void composeInitial(p<? super Composer, ? super Integer, g2> pVar) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = pVar;
        this.parent.composeInitial$runtime_release(this, pVar);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (g0.g(andSet, obj2)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (g0.g(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(w1.k());
        obj = CompositionKt.PendingApplyNoModifications;
        if (g0.g(andSet, obj) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(x00.a<? extends T> aVar) {
        try {
            try {
                T invoke = aVar.invoke();
                d0.d(1);
                d0.c(1);
                return invoke;
            } catch (Throwable th2) {
                d0.d(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                d0.c(1);
                throw th2;
            }
        } catch (Exception e11) {
            abandonChanges();
            throw e11;
        }
    }

    private final <T> T guardInvalidationsLocked(x00.l<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> lVar) {
        MutableScatterMap<Object, Object> m1895takeInvalidationsafanTW4 = m1895takeInvalidationsafanTW4();
        try {
            return lVar.invoke(ScopeMap.m2048boximpl(m1895takeInvalidationsafanTW4));
        } catch (Exception e11) {
            this.invalidations = m1895takeInvalidationsafanTW4;
            throw e11;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        int i11;
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (tryImminentInvalidation(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    CompositionObserver observer = observer();
                    if (obj == null) {
                        ScopeMap.m2061setimpl(this.invalidations, recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                    } else if (observer != null || (obj instanceof DerivedState)) {
                        Object obj2 = this.invalidations.get(recomposeScopeImpl);
                        if (obj2 != null) {
                            if (obj2 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    loop0: while (true) {
                                        long j11 = jArr[i12];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j11 & 255) < 128) {
                                                    i11 = i13;
                                                    if (objArr[(i12 << 3) + i15] == ScopeInvalidated.INSTANCE) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i11 = i13;
                                                }
                                                j11 >>= i11;
                                                i15++;
                                                i13 = i11;
                                            }
                                            if (i14 != i13) {
                                                break;
                                            }
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else if (obj2 == ScopeInvalidated.INSTANCE) {
                            }
                        }
                        ScopeMap.m2045addimpl(this.invalidations, recomposeScopeImpl, obj);
                    } else {
                        ScopeMap.m2061setimpl(this.invalidations, recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.invalidateChecked(recomposeScopeImpl, anchor, obj);
                }
                this.parent.invalidate$runtime_release(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                ScopeMap.m2045addimpl(this.observationsProcessed, obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i11 << 3) + i13];
                        if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                            ScopeMap.m2045addimpl(this.observationsProcessed, obj, recomposeScopeImpl2);
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

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!g0.g(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m1895takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m2051constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final <T> T trackAbandonedValues(x00.a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            d0.d(1);
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            d0.c(1);
            throw th2;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i11);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + a0.bg(slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        abandonChanges();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        abandonChanges();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th2;
                    } catch (Exception e11) {
                        abandonChanges();
                        throw e11;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@k p<? super Composer, ? super Integer, g2> pVar) {
        MutableScatterMap<Object, Object> m1895takeInvalidationsafanTW4;
        try {
            synchronized (this.lock) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    m1895takeInvalidationsafanTW4 = m1895takeInvalidationsafanTW4();
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScope, ? extends Set<? extends Object>> m2047asMapimpl = ScopeMap.m2047asMapimpl(m1895takeInvalidationsafanTW4);
                        g0.n(m2047asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                        observer.onBeginComposition(this, m2047asMapimpl);
                    }
                    this.composer.m1892composeContentZbOJvo$runtime_release(m1895takeInvalidationsafanTW4, pVar, this.shouldPause);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        g2 g2Var = g2.f100423a;
                    }
                } catch (Exception e11) {
                    this.invalidations = m1895takeInvalidationsafanTW4;
                    throw e11;
                } finally {
                }
            }
        } finally {
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        Trace trace;
        Object beginSection;
        synchronized (this.lock) {
            try {
                boolean z11 = this.slotTable.getGroupsSize() > 0;
                try {
                    if (!z11) {
                        if (!this.abandonSet.isEmpty()) {
                        }
                        ScopeMap.m2049clearimpl(this.observations);
                        ScopeMap.m2049clearimpl(this.derivedStates);
                        ScopeMap.m2049clearimpl(this.invalidations);
                        this.changes.clear();
                        this.lateChanges.clear();
                        this.composer.deactivate$runtime_release();
                        g2 g2Var = g2.f100423a;
                    }
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z11) {
                        this.applier.onBeginChanges();
                        SlotWriter openWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                            g2 g2Var2 = g2.f100423a;
                            openWriter.close(true);
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th2) {
                            openWriter.close(false);
                            throw th2;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                    g2 g2Var3 = g2.f100423a;
                    trace.endSection(beginSection);
                    ScopeMap.m2049clearimpl(this.observations);
                    ScopeMap.m2049clearimpl(this.derivedStates);
                    ScopeMap.m2049clearimpl(this.invalidations);
                    this.changes.clear();
                    this.lateChanges.clear();
                    this.composer.deactivate$runtime_release();
                    g2 g2Var4 = g2.f100423a;
                } catch (Throwable th3) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th3;
                }
                trace = Trace.INSTANCE;
                beginSection = trace.beginSection("Compose:deactivate");
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@l ControlledComposition controlledComposition, int i11, @k x00.a<? extends R> aVar) {
        if (controlledComposition == null || g0.g(controlledComposition, this) || i11 < 0) {
            return aVar.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i11;
        try {
            return aVar.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.isComposing$runtime_release()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1888getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    boolean z11 = this.slotTable.getGroupsSize() > 0;
                    if (z11 || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z11) {
                            this.applier.onBeginChanges();
                            SlotWriter openWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                                g2 g2Var = g2.f100423a;
                                openWriter.close(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th2) {
                                openWriter.close(false);
                                throw th2;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@k MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            g2 g2Var = g2.f100423a;
            openWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th2) {
            openWriter.close(false);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    @l
    public ShouldPauseCallback getAndSetShouldPauseCallback(@l ShouldPauseCallback shouldPauseCallback) {
        ShouldPauseCallback shouldPauseCallback2 = this.shouldPause;
        this.shouldPause = shouldPauseCallback;
        return shouldPauseCallback2;
    }

    @k
    public final p<Composer, Integer, g2> getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    @l
    public <T> T getCompositionService(@k CompositionServiceKey<T> compositionServiceKey) {
        if (g0.g(compositionServiceKey, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    @k
    @o
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return r0.a6(this.conditionallyInvalidatedScopes.asSet());
    }

    @k
    @o
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z11;
        synchronized (this.lock) {
            z11 = ScopeMap.m2056getSizeimpl(this.invalidations) > 0;
        }
        return z11;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @k
    @o
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.asMap().keySet();
    }

    @k
    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    @k
    @o
    public final CompositionContext getParent() {
        return this.parent;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    @k
    public final d getRecomposeContext() {
        d dVar = this._recomposeContext;
        return dVar == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : dVar;
    }

    @k
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@k List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!g0.g(list.get(i11).getFirst().getComposition$runtime_release(), this)) {
                break;
            } else {
                i11++;
            }
        }
        if (!z11) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(list);
            g2 g2Var = g2.f100423a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @k
    public InvalidationResult invalidate(@k RecomposeScopeImpl recomposeScopeImpl, @l Object obj) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            return !recomposeScopeImpl.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(recomposeScopeImpl, anchor, obj);
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i11) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i11);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (invalidateGroupsWithKey$runtime_release.get(i12).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    @k
    public final CompositionObserverHandle observe$runtime_release(@k final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
            g2 g2Var = g2.f100423a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    try {
                        if (g0.g(compositionImpl.getObserverHolder$runtime_release().getObserver(), compositionObserver2)) {
                            compositionImpl.getObserverHolder$runtime_release().setObserver(null);
                            compositionImpl.getObserverHolder$runtime_release().setRoot(false);
                        }
                        g2 g2Var2 = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(@m80.k java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            androidx.compose.runtime.collection.ScatterSetWrapper r15 = (androidx.compose.runtime.collection.ScatterSetWrapper) r15
            androidx.collection.ScatterSet r15 = r15.getSet$runtime_release()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.observations
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.m2052containsimpl(r11, r10)
            if (r11 != 0) goto L50
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.derivedStates
            boolean r10 = androidx.compose.runtime.collection.ScopeMap.m2052containsimpl(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.observations
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.m2052containsimpl(r3, r0)
            if (r3 != 0) goto L7c
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.derivedStates
            boolean r0 = androidx.compose.runtime.collection.ScopeMap.m2052containsimpl(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime_release() {
        this.pendingPausedComposition = null;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@k x00.a<g2> aVar) {
        this.composer.prepareCompose$runtime_release(aVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean m1893recomposeaFTiNEg$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    MutableScatterMap<Object, Object> m1895takeInvalidationsafanTW4 = m1895takeInvalidationsafanTW4();
                    try {
                        CompositionObserver observer = observer();
                        if (observer != null) {
                            Map<RecomposeScope, ? extends Set<? extends Object>> m2047asMapimpl = ScopeMap.m2047asMapimpl(m1895takeInvalidationsafanTW4);
                            g0.n(m2047asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                            observer.onBeginComposition(this, m2047asMapimpl);
                        }
                        m1893recomposeaFTiNEg$runtime_release = this.composer.m1893recomposeaFTiNEg$runtime_release(m1895takeInvalidationsafanTW4, this.shouldPause);
                        if (!m1893recomposeaFTiNEg$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (observer != null) {
                            observer.onEndComposition(this);
                        }
                    } catch (Exception e11) {
                        this.invalidations = m1895takeInvalidationsafanTW4;
                        throw e11;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1893recomposeaFTiNEg$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@k RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@k Set<? extends Object> set) {
        Object obj;
        Object obj2;
        boolean g11;
        Set<? extends Object> set2;
        do {
            obj = this.pendingModifications.get();
            if (obj == null) {
                g11 = true;
            } else {
                obj2 = CompositionKt.PendingApplyNoModifications;
                g11 = g0.g(obj, obj2);
            }
            if (g11) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set2 = q.w3((Set[]) obj, set);
            }
        } while (!androidx.camera.view.q.a(this.pendingModifications, obj, set2));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                g2 g2Var = g2.f100423a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@k Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        int i11;
        int i12;
        int i13;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        int i14 = 1;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(obj)) {
            return;
        }
        if (obj instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.Companion;
            ((StateObjectImpl) obj).m2084recordReadInh_f27i8$runtime_release(ReaderKind.m2071constructorimpl(1));
        }
        ScopeMap.m2045addimpl(this.observations, obj, currentRecomposeScope$runtime_release);
        if (obj instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) obj;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m2059removeScopeimpl(this.derivedStates, obj);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr[i15];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j11 & 255) < 128) {
                                i12 = i14;
                                StateObject stateObject = (StateObject) objArr[(i15 << 3) + i18];
                                if (stateObject instanceof StateObjectImpl) {
                                    ReaderKind.Companion companion2 = ReaderKind.Companion;
                                    i13 = i16;
                                    ((StateObjectImpl) stateObject).m2084recordReadInh_f27i8$runtime_release(ReaderKind.m2071constructorimpl(i12));
                                } else {
                                    i13 = i16;
                                }
                                ScopeMap.m2045addimpl(this.derivedStates, stateObject, obj);
                            } else {
                                i12 = i14;
                                i13 = i16;
                            }
                            j11 >>= i13;
                            i18++;
                            i14 = i12;
                            i16 = i13;
                        }
                        i11 = i14;
                        if (i17 != i16) {
                            break;
                        }
                    } else {
                        i11 = i14;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    i14 = i11;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@k Object obj) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(obj);
                Object obj2 = this.derivedStates.get(obj);
                if (obj2 != null) {
                    if (obj2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j11 = jArr[i11];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((255 & j11) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i11 << 3) + i13]);
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i12 != 8) {
                                        break;
                                    }
                                }
                                if (i11 == length) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        invalidateScopeOfLocked((DerivedState) obj2);
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@k DerivedState<?> derivedState) {
        if (ScopeMap.m2052containsimpl(this.observations, derivedState)) {
            return;
        }
        ScopeMap.m2059removeScopeimpl(this.derivedStates, derivedState);
    }

    public final void removeObservation$runtime_release(@k Object obj, @k RecomposeScopeImpl recomposeScopeImpl) {
        ScopeMap.m2058removeimpl(this.observations, obj, recomposeScopeImpl);
    }

    public final void setComposable(@k p<? super Composer, ? super Integer, g2> pVar) {
        this.composable = pVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@k p<? super Composer, ? super Integer, g2> pVar) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        composeInitial(pVar);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@k p<? super Composer, ? super Integer, g2> pVar) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        this.composer.startReuseFromRoot();
        composeInitial(pVar);
        this.composer.endReuseFromRoot();
    }

    @Override // androidx.compose.runtime.PausableComposition
    @k
    public PausedComposition setPausableContent(@k p<? super Composer, ? super Integer, g2> pVar) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, pVar, false, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    @Override // androidx.compose.runtime.PausableComposition
    @k
    public PausedComposition setPausableContentWithReuse(@k p<? super Composer, ? super Integer, g2> pVar) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, pVar, true, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z11) {
        this.pendingInvalidScopes = z11;
    }

    public final void updateMovingInvalidations$runtime_release() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> m1895takeInvalidationsafanTW4 = m1895takeInvalidationsafanTW4();
            try {
                this.composer.m1894updateComposerInvalidationsRY85e9Y(m1895takeInvalidationsafanTW4);
                g2 g2Var = g2.f100423a;
            } catch (Exception e11) {
                this.invalidations = m1895takeInvalidationsafanTW4;
                throw e11;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> set, boolean z11) {
        char c11;
        long j11;
        long j12;
        long j13;
        int i11;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j14;
        boolean contains;
        long j15;
        long[] jArr3;
        int i12;
        long[] jArr4;
        int i13;
        int i14;
        long j16;
        boolean z12;
        int i15;
        long j17;
        long j18;
        char c12;
        long j19;
        int i16;
        int i17;
        int i18;
        Object obj = null;
        char c13 = 7;
        long j21 = -9187201950435737472L;
        int i19 = 8;
        if (set instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr5 = set$runtime_release.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i21 = 0;
                j12 = 128;
                while (true) {
                    long j22 = jArr5[i21];
                    j13 = 255;
                    if ((((~j22) << c13) & j22 & j21) != j21) {
                        int i22 = 8 - ((~(i21 - length)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j22 & 255) < 128) {
                                c12 = c13;
                                Object obj2 = objArr[(i21 << 3) + i23];
                                j19 = j21;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                                } else {
                                    addPendingInvalidationsLocked(obj2, z11);
                                    Object obj3 = this.derivedStates.get(obj2);
                                    if (obj3 != null) {
                                        if (obj3 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                                            Object[] objArr2 = mutableScatterSet.elements;
                                            long[] jArr6 = mutableScatterSet.metadata;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j18 = j22;
                                                int i24 = 0;
                                                while (true) {
                                                    long j23 = jArr6[i24];
                                                    int i25 = i19;
                                                    i16 = length;
                                                    if ((((~j23) << c12) & j23 & j19) != j19) {
                                                        int i26 = 8 - ((~(i24 - length2)) >>> 31);
                                                        int i27 = 0;
                                                        while (i27 < i26) {
                                                            if ((j23 & 255) < 128) {
                                                                i18 = i25;
                                                                addPendingInvalidationsLocked((DerivedState) objArr2[(i24 << 3) + i27], z11);
                                                            } else {
                                                                i18 = i25;
                                                            }
                                                            j23 >>= i18;
                                                            i27++;
                                                            i25 = i18;
                                                        }
                                                        if (i26 != i25) {
                                                            break;
                                                        }
                                                    }
                                                    if (i24 == length2) {
                                                        break;
                                                    }
                                                    i24++;
                                                    length = i16;
                                                    i19 = 8;
                                                }
                                            }
                                        } else {
                                            j18 = j22;
                                            i16 = length;
                                            addPendingInvalidationsLocked((DerivedState) obj3, z11);
                                        }
                                        i17 = 8;
                                    }
                                }
                                j18 = j22;
                                i16 = length;
                                i17 = 8;
                            } else {
                                j18 = j22;
                                c12 = c13;
                                j19 = j21;
                                i16 = length;
                                i17 = i19;
                            }
                            i23++;
                            length = i16;
                            i19 = i17;
                            c13 = c12;
                            j21 = j19;
                            j22 = j18 >> i17;
                            obj = null;
                        }
                        c11 = c13;
                        j11 = j21;
                        int i28 = length;
                        if (i22 != i19) {
                            break;
                        } else {
                            length = i28;
                        }
                    } else {
                        c11 = c13;
                        j11 = j21;
                    }
                    if (i21 == length) {
                        break;
                    }
                    i21++;
                    c13 = c11;
                    j21 = j11;
                    obj = null;
                    i19 = 8;
                }
            } else {
                c11 = 7;
                j11 = -9187201950435737472L;
                j12 = 128;
                j13 = 255;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
            for (Object obj4 : set) {
                if (obj4 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj4, z11);
                    Object obj5 = this.derivedStates.get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj5;
                            Object[] objArr3 = mutableScatterSet2.elements;
                            long[] jArr7 = mutableScatterSet2.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j24 = jArr7[i11];
                                    if ((((~j24) << 7) & j24 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i11 - length3)) >>> 31);
                                        for (int i31 = 0; i31 < i29; i31++) {
                                            if ((j24 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr3[(i11 << 3) + i31], z11);
                                            }
                                            j24 >>= 8;
                                        }
                                        if (i29 != 8) {
                                            break;
                                        }
                                    }
                                    i11 = i11 != length3 ? i11 + 1 : 0;
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj5, z11);
                        }
                    }
                }
            }
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet3 = this.conditionallyInvalidatedScopes;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet4 = this.invalidatedScopes;
        String str3 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (z11 && mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap = this.observations;
            long[] jArr8 = mutableScatterMap.metadata;
            int length4 = jArr8.length - 2;
            if (length4 >= 0) {
                int i32 = 0;
                while (true) {
                    long j25 = jArr8[i32];
                    if ((((~j25) << c11) & j25 & j11) != j11) {
                        int i33 = 8 - ((~(i32 - length4)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j25 & j13) < j12) {
                                int i35 = (i32 << 3) + i34;
                                Object obj6 = mutableScatterMap.keys[i35];
                                Object obj7 = mutableScatterMap.values[i35];
                                if (obj7 instanceof MutableScatterSet) {
                                    g0.n(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                    MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj7;
                                    Object[] objArr4 = mutableScatterSet5.elements;
                                    long[] jArr9 = mutableScatterSet5.metadata;
                                    jArr4 = jArr8;
                                    int length5 = jArr9.length - 2;
                                    if (length5 >= 0) {
                                        j16 = j25;
                                        int i36 = 0;
                                        while (true) {
                                            long j26 = jArr9[i36];
                                            i13 = length4;
                                            i14 = i32;
                                            if ((((~j26) << c11) & j26 & j11) != j11) {
                                                int i37 = 8 - ((~(i36 - length5)) >>> 31);
                                                for (int i38 = 0; i38 < i37; i38 = i15 + 1) {
                                                    if ((j26 & j13) < j12) {
                                                        i15 = i38;
                                                        int i39 = (i36 << 3) + i15;
                                                        j17 = j26;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr4[i39];
                                                        if (mutableScatterSet3.contains(recomposeScopeImpl) || mutableScatterSet4.contains(recomposeScopeImpl)) {
                                                            mutableScatterSet5.removeElementAt(i39);
                                                        }
                                                    } else {
                                                        i15 = i38;
                                                        j17 = j26;
                                                    }
                                                    j26 = j17 >> 8;
                                                }
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i36 == length5) {
                                                break;
                                            }
                                            i36++;
                                            length4 = i13;
                                            i32 = i14;
                                        }
                                    } else {
                                        i13 = length4;
                                        i14 = i32;
                                        j16 = j25;
                                    }
                                    z12 = mutableScatterSet5.isEmpty();
                                } else {
                                    jArr4 = jArr8;
                                    i13 = length4;
                                    i14 = i32;
                                    j16 = j25;
                                    g0.n(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj7;
                                    z12 = mutableScatterSet3.contains(recomposeScopeImpl2) || mutableScatterSet4.contains(recomposeScopeImpl2);
                                }
                                if (z12) {
                                    mutableScatterMap.removeValueAt(i35);
                                }
                            } else {
                                jArr4 = jArr8;
                                i13 = length4;
                                i14 = i32;
                                j16 = j25;
                            }
                            j25 = j16 >> 8;
                            i34++;
                            length4 = i13;
                            jArr8 = jArr4;
                            i32 = i14;
                        }
                        jArr3 = jArr8;
                        int i41 = length4;
                        int i42 = i32;
                        if (i33 != 8) {
                            break;
                        }
                        length4 = i41;
                        i12 = i42;
                    } else {
                        jArr3 = jArr8;
                        i12 = i32;
                    }
                    if (i12 == length4) {
                        break;
                    }
                    i32 = i12 + 1;
                    jArr8 = jArr3;
                }
            }
            mutableScatterSet3.clear();
            cleanUpDerivedStateObservations();
            return;
        }
        if (mutableScatterSet4.isNotEmpty()) {
            MutableScatterMap<Object, Object> mutableScatterMap2 = this.observations;
            long[] jArr10 = mutableScatterMap2.metadata;
            int length6 = jArr10.length - 2;
            if (length6 >= 0) {
                int i43 = 0;
                while (true) {
                    long j27 = jArr10[i43];
                    if ((((~j27) << c11) & j27 & j11) != j11) {
                        int i44 = 8 - ((~(i43 - length6)) >>> 31);
                        int i45 = 0;
                        while (i45 < i44) {
                            if ((j27 & j13) < j12) {
                                int i46 = (i43 << 3) + i45;
                                Object obj8 = mutableScatterMap2.keys[i46];
                                Object obj9 = mutableScatterMap2.values[i46];
                                if (obj9 instanceof MutableScatterSet) {
                                    g0.n(obj9, str3);
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj9;
                                    Object[] objArr5 = mutableScatterSet6.elements;
                                    long[] jArr11 = mutableScatterSet6.metadata;
                                    int length7 = jArr11.length - 2;
                                    jArr2 = jArr10;
                                    str2 = str3;
                                    if (length7 >= 0) {
                                        int i47 = 0;
                                        while (true) {
                                            long j28 = jArr11[i47];
                                            j14 = j27;
                                            if ((((~j28) << c11) & j28 & j11) != j11) {
                                                int i48 = 8 - ((~(i47 - length7)) >>> 31);
                                                int i49 = 0;
                                                while (i49 < i48) {
                                                    if ((j28 & j13) < j12) {
                                                        j15 = j28;
                                                        int i51 = (i47 << 3) + i49;
                                                        if (mutableScatterSet4.contains((RecomposeScopeImpl) objArr5[i51])) {
                                                            mutableScatterSet6.removeElementAt(i51);
                                                        }
                                                    } else {
                                                        j15 = j28;
                                                    }
                                                    i49++;
                                                    j28 = j15 >> 8;
                                                }
                                                if (i48 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i47 == length7) {
                                                break;
                                            }
                                            i47++;
                                            j27 = j14;
                                        }
                                    } else {
                                        j14 = j27;
                                    }
                                    contains = mutableScatterSet6.isEmpty();
                                } else {
                                    jArr2 = jArr10;
                                    str2 = str3;
                                    j14 = j27;
                                    g0.n(obj9, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    contains = mutableScatterSet4.contains((RecomposeScopeImpl) obj9);
                                }
                                if (contains) {
                                    mutableScatterMap2.removeValueAt(i46);
                                }
                            } else {
                                jArr2 = jArr10;
                                str2 = str3;
                                j14 = j27;
                            }
                            j27 = j14 >> 8;
                            i45++;
                            jArr10 = jArr2;
                            str3 = str2;
                        }
                        jArr = jArr10;
                        str = str3;
                        if (i44 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr10;
                        str = str3;
                    }
                    if (i43 == length6) {
                        break;
                    }
                    i43++;
                    jArr10 = jArr;
                    str3 = str;
                }
            }
            cleanUpDerivedStateObservations();
            mutableScatterSet4.clear();
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, d dVar, int i11, v vVar) {
        this(compositionContext, applier, (i11 & 4) != 0 ? null : dVar);
    }
}
