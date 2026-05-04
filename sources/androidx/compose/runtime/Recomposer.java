package androidx.compose.runtime;

import a00.h0;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import c40.a0;
import c40.l2;
import c40.n;
import c40.n2;
import c40.r0;
import c40.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l00.f;
import m00.c;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.h1;
import yz.r;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 11 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 13 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 16 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 17 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 18 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n1404#1,3:1906\n1403#1,7:1909\n1411#1:1921\n1404#1,3:1947\n1403#1,7:1950\n1411#1:1962\n1404#1,3:1989\n1403#1,7:1992\n1411#1:2068\n27#2:1792\n33#2,2:1796\n33#2,2:1800\n33#2,2:1804\n33#2,2:1806\n33#2,2:1814\n33#2,2:1816\n33#2,2:1818\n33#2,2:1820\n33#2,2:1837\n33#2,2:1839\n33#2,2:1841\n33#2,2:1843\n33#2,2:1864\n33#2,2:1874\n33#2,2:1876\n33#2,2:1878\n33#2,2:1886\n33#2,2:1898\n33#2,2:1902\n33#2,2:1904\n33#2,2:1922\n33#2,2:1936\n33#2,2:2002\n33#2,2:2055\n33#2,2:2069\n33#2,2:2092\n33#2,2:2096\n33#2,2:2098\n33#2,2:2100\n33#2,2:2104\n33#2,2:2108\n33#2,2:2110\n33#2,2:2112\n33#2,2:2114\n33#2,2:2141\n33#2,2:2143\n33#2,2:2145\n1101#3:1793\n1083#3,2:1794\n519#4:1798\n423#4,9:1828\n519#4:1888\n519#4:2094\n519#4:2095\n646#4,2:2102\n641#4,2:2106\n1#5:1799\n1#5:2052\n1247#6,2:1802\n33#7,6:1808\n33#7,6:1822\n33#7,6:1868\n33#7,6:1880\n90#7,2:1938\n33#7,6:1940\n92#7:1946\n113#7,3:1963\n33#7,4:1966\n116#7,2:1970\n118#7,2:1979\n38#7:1981\n120#7:1982\n81#7,3:2004\n33#7,6:2007\n84#7:2013\n90#7,2:2014\n33#7,6:2016\n92#7:2022\n105#7,2:2027\n33#7,6:2029\n107#7:2035\n105#7,2:2036\n33#7,6:2038\n107#7:2044\n203#7,3:2045\n33#7,4:2048\n38#7:2053\n206#7:2054\n222#7,3:2057\n63#7,6:2060\n225#7:2066\n33#7,6:2147\n287#8,4:1845\n292#8:1851\n287#8,6:1852\n287#8,6:1858\n287#8,4:2073\n292#8:2079\n287#8,6:2081\n1855#9,2:1849\n1549#9:2023\n1620#9,3:2024\n919#10,2:1866\n919#10,2:2077\n314#11,9:1889\n323#11,2:1900\n148#12,5:1916\n148#12,5:1957\n148#12,3:1999\n152#12:2067\n148#12,5:2087\n311#13,6:1924\n311#13,6:1930\n372#14,7:1972\n4665#15:1983\n4643#15,5:1984\n23#16,2:2071\n25#16:2080\n357#17,4:2116\n329#17,6:2120\n339#17,3:2127\n342#17,9:2131\n361#17:2140\n1399#18:2126\n1270#18:2130\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1132#1:1906,3\n1132#1:1909,7\n1132#1:1921\n1258#1:1947,3\n1258#1:1950,7\n1258#1:1962\n1281#1:1989,3\n1281#1:1992,7\n1281#1:2068\n211#1:1792\n315#1:1796,2\n366#1:1800,2\n450#1:1804,2\n456#1:1806,2\n468#1:1814,2\n475#1:1816,2\n478#1:1818,2\n490#1:1820,2\n503#1:1837,2\n511#1:1839,2\n743#1:1841,2\n770#1:1843,2\n815#1:1864,2\n837#1:1874,2\n850#1:1876,2\n866#1:1878,2\n1005#1:1886,2\n1017#1:1898,2\n1102#1:1902,2\n1117#1:1904,2\n1143#1:1922,2\n1222#1:1936,2\n1285#1:2002,2\n1343#1:2055,2\n1365#1:2069,2\n1435#1:2092,2\n1472#1:2096,2\n1485#1:2098,2\n1518#1:2100,2\n1526#1:2104,2\n1536#1:2108,2\n1544#1:2110,2\n1552#1:2112,2\n1575#1:2114,2\n1588#1:2141,2\n1599#1:2143,2\n1228#1:2145,2\n230#1:1793\n230#1:1794,2\n349#1:1798\n501#1:1828,9\n1007#1:1888\n1437#1:2094\n1444#1:2095\n1520#1:2102,2\n1528#1:2106,2\n1340#1:2052\n366#1:1802,2\n460#1:1808,6\n497#1:1822,6\n823#1:1868,6\n867#1:1880,6\n1223#1:1938,2\n1223#1:1940,6\n1223#1:1946\n1278#1:1963,3\n1278#1:1966,4\n1278#1:1970,2\n1278#1:1979,2\n1278#1:1981\n1278#1:1982\n1287#1:2004,3\n1287#1:2007,6\n1287#1:2013\n1299#1:2014,2\n1299#1:2016,6\n1299#1:2022\n1332#1:2027,2\n1332#1:2029,6\n1332#1:2035\n1332#1:2036,2\n1332#1:2038,6\n1332#1:2044\n1340#1:2045,3\n1340#1:2048,4\n1340#1:2053\n1340#1:2054\n1346#1:2057,3\n1346#1:2060,6\n1346#1:2066\n1557#1:2147,6\n787#1:1845,4\n787#1:1851\n800#1:1852,6\n808#1:1858,6\n1372#1:2073,4\n1372#1:2079\n1377#1:2081,6\n788#1:1849,2\n1308#1:2023\n1308#1:2024,3\n822#1:1866,2\n1372#1:2077,2\n1016#1:1889,9\n1016#1:1900,2\n1132#1:1916,5\n1258#1:1957,5\n1281#1:1999,3\n1281#1:2067\n1409#1:2087,5\n1179#1:1924,6\n1196#1:1930,6\n1278#1:1972,7\n1280#1:1983\n1280#1:1984,5\n1372#1:2071,2\n1372#1:2080\n1580#1:2116,4\n1580#1:2120,6\n1580#1:2127,3\n1580#1:2131,9\n1580#1:2140\n1580#1:2126\n1580#1:2130\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {

    @k
    private final List<ControlledComposition> _knownCompositions;

    @l
    private List<? extends ControlledComposition> _knownCompositionsCache;

    @k
    private final y<State> _state;

    @k
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;

    @l
    private Throwable closeCause;

    @k
    private final MutableVector<ControlledComposition> compositionInvalidations;

    @k
    private final List<ControlledComposition> compositionsAwaitingApply;

    @l
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;

    @k
    private final d effectCoroutineContext;

    @k
    private final a0 effectJob;

    @l
    private RecomposerErrorState errorState;

    @l
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;

    @k
    private final List<MovableContentStateReference> movableContentAwaitingInsert;

    @k
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;

    @k
    private final NestedContentMap movableContentNestedStatesAvailable;

    @k
    private final MutableScatterMap<Object, Object> movableContentRemoved;

    @k
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;

    @k
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;

    @k
    private final RecomposerInfoImpl recomposerInfo;

    @l
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;

    @l
    private l2 runnerJob;

    @k
    private MutableScatterSet<Object> snapshotInvalidations;

    @k
    private final Object stateLock;

    @l
    private n<? super g2> workContinuation;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final y<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = o0.a(ExtensionsKt.persistentSetOf());

    @k
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n1360#2:1792\n1446#2,5:1793\n1855#2,2:1798\n1855#2,2:1812\n1855#2,2:1814\n1603#2,9:1816\n1855#2:1825\n1856#2:1827\n1612#2:1828\n1603#2,9:1829\n1855#2:1838\n1856#2:1840\n1612#2:1841\n33#3,6:1800\n33#3,6:1806\n1#4:1826\n1#4:1839\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1654#1:1792\n1654#1:1793,5\n1662#1:1798,2\n1668#1:1812,2\n1673#1:1814,2\n1687#1:1816,9\n1687#1:1825\n1687#1:1827\n1687#1:1828\n1690#1:1829,9\n1690#1:1838\n1690#1:1840\n1690#1:1841\n1665#1:1800,6\n1666#1:1806,6\n1687#1:1826\n1690#1:1839\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.b(persistentSet, remove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState resetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }

        @k
        public final Set<RecomposerInfo> currentRunningRecomposers$runtime_release() {
            return (Set) Recomposer._runningRecomposers.getValue();
        }

        @k
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        @k
        public final m0<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i11) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i11);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(@k Object obj) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            List list2 = list;
            int size = list2.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((HotReloadable) list.get(i11)).resetContent();
            }
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((HotReloadable) list.get(i12)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        @k
        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a00.m0.s0(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z11) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z11));
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HotReloadable {

        @k
        private p<? super Composer, ? super Integer, g2> composable;

        @k
        private final CompositionImpl composition;

        public HotReloadable(@k CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m1889getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        @k
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z11, @k Throwable th2) {
            this.recoverable = z11;
            this.cause = th2;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        @k
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1794\n33#2,2:1812\n203#3,3:1796\n33#3,4:1799\n38#3:1804\n206#3:1805\n33#3,6:1806\n203#3,3:1814\n33#3,4:1817\n38#3:1822\n206#3:1823\n81#3,3:1824\n33#3,4:1827\n38#3:1832\n84#3:1833\n1#4:1803\n1#4:1821\n1#4:1831\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n390#1:1792,2\n394#1:1794,2\n402#1:1812,2\n396#1:1796,3\n396#1:1799,4\n396#1:1804\n396#1:1805\n397#1:1806,6\n404#1:1814,3\n404#1:1817,4\n404#1:1822\n404#1:1823\n405#1:1824,3\n405#1:1827,4\n405#1:1832\n405#1:1833\n396#1:1803\n404#1:1821\n*E\n"})
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        @l
        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        @k
        public i<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i11) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i12 = 0; i12 < size; i12++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i12);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((CompositionImpl) arrayList.get(i13)).invalidateGroupsWithKey(i11);
            }
        }

        @l
        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        @k
        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i11 = 0; i11 < size; i11++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i11);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i12));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private State(String str, int i11) {
        }

        @k
        public static m00.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Recomposer(@k d dVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new x00.a<g2>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                n deriveStateLocked;
                y yVar;
                Throwable th2;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    deriveStateLocked = recomposer.deriveStateLocked();
                    yVar = recomposer._state;
                    if (((Recomposer.State) yVar.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        th2 = recomposer.closeCause;
                        throw t1.a("Recomposer shutdown; frame clock awaiter will never resume", th2);
                    }
                }
                if (deriveStateLocked != null) {
                    Result.a aVar = Result.Companion;
                    deriveStateLocked.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m2030constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m2030constructorimpl$default(null, 1, null);
        this._state = o0.a(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        a0 a11 = n2.a((l2) dVar.get(l2.f7886e0));
        a11.z0(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th2) {
                l2 l2Var;
                n nVar;
                y yVar;
                y yVar2;
                boolean z11;
                n nVar2;
                n nVar3;
                CancellationException a12 = t1.a("Recomposer effect job completed", th2);
                Object obj = Recomposer.this.stateLock;
                final Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    try {
                        l2Var = recomposer.runnerJob;
                        nVar = null;
                        if (l2Var != null) {
                            yVar2 = recomposer._state;
                            yVar2.setValue(Recomposer.State.ShuttingDown);
                            z11 = recomposer.isClosed;
                            if (z11) {
                                nVar2 = recomposer.workContinuation;
                                if (nVar2 != null) {
                                    nVar3 = recomposer.workContinuation;
                                    recomposer.workContinuation = null;
                                    l2Var.z0(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // x00.l
                                        public /* bridge */ /* synthetic */ g2 invoke(Throwable th3) {
                                            invoke2(th3);
                                            return g2.f100423a;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Throwable th3) {
                                            y yVar3;
                                            Object obj2 = Recomposer.this.stateLock;
                                            Recomposer recomposer2 = Recomposer.this;
                                            Throwable th4 = th2;
                                            synchronized (obj2) {
                                                if (th4 == null) {
                                                    th4 = null;
                                                } else if (th3 != null) {
                                                    try {
                                                        if (th3 instanceof CancellationException) {
                                                            th3 = null;
                                                        }
                                                        if (th3 != null) {
                                                            r.a(th4, th3);
                                                        }
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                                recomposer2.closeCause = th4;
                                                yVar3 = recomposer2._state;
                                                yVar3.setValue(Recomposer.State.ShutDown);
                                                g2 g2Var = g2.f100423a;
                                            }
                                        }
                                    });
                                    nVar = nVar3;
                                }
                            } else {
                                l2Var.cancel(a12);
                            }
                            nVar3 = null;
                            recomposer.workContinuation = null;
                            l2Var.z0(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ g2 invoke(Throwable th3) {
                                    invoke2(th3);
                                    return g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th3) {
                                    y yVar3;
                                    Object obj2 = Recomposer.this.stateLock;
                                    Recomposer recomposer2 = Recomposer.this;
                                    Throwable th4 = th2;
                                    synchronized (obj2) {
                                        if (th4 == null) {
                                            th4 = null;
                                        } else if (th3 != null) {
                                            try {
                                                if (th3 instanceof CancellationException) {
                                                    th3 = null;
                                                }
                                                if (th3 != null) {
                                                    r.a(th4, th3);
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                        recomposer2.closeCause = th4;
                                        yVar3 = recomposer2._state;
                                        yVar3.setValue(Recomposer.State.ShutDown);
                                        g2 g2Var = g2.f100423a;
                                    }
                                }
                            });
                            nVar = nVar3;
                        } else {
                            recomposer.closeCause = a12;
                            yVar = recomposer._state;
                            yVar.setValue(Recomposer.State.ShutDown);
                            g2 g2Var = g2.f100423a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (nVar != null) {
                    Result.a aVar = Result.Companion;
                    nVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                }
            }
        });
        this.effectJob = a11;
        this.effectCoroutineContext = dVar.plus(broadcastFrameClock).plus(a11);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i11 = mutableObjectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                ((CompositionRegistrationObserver) objArr[i12]).onCompositionRegistered(this, controlledComposition);
            }
        }
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(j00.c<? super g2> cVar) {
        c40.p pVar;
        if (getHasSchedulingWork()) {
            return g2.f100423a;
        }
        c40.p pVar2 = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar2.y();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                pVar = pVar2;
            } else {
                this.workContinuation = pVar2;
                pVar = null;
            }
        }
        if (pVar != null) {
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
        Object F = pVar2.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F == b.l() ? F : g2.f100423a;
    }

    private final void clearKnownCompositionsLocked() {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i11 = mutableObjectList._size;
            for (int i12 = 0; i12 < i11; i12++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i12];
                Iterator<T> it = getKnownCompositions().iterator();
                while (it.hasNext()) {
                    compositionRegistrationObserver.onCompositionUnregistered(this, (ControlledComposition) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = h0.J();
    }

    private final <T> T composing(ControlledComposition controlledComposition, MutableScatterSet<Object> mutableScatterSet, x00.a<? extends T> aVar) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                return aVar.invoke();
            } finally {
                d0.d(1);
                takeMutableSnapshot.restoreCurrent(makeCurrent);
                d0.c(1);
            }
        } finally {
            d0.d(1);
            applyAndCheck(takeMutableSnapshot);
            d0.c(1);
        }
    }

    private static final void deletedMovableContent$lambda$73$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime_release = movableContentStateReference2.getNestedReferences$runtime_release();
        if (nestedReferences$runtime_release != null) {
            int size = nestedReferences$runtime_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime_release.get(i11);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime_release(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$73$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n<g2> deriveStateLocked() {
        State state;
        int i11 = 0;
        int i12 = 1;
        v vVar = null;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i11, i12, vVar);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            n<? super g2> nVar = this.workContinuation;
            if (nVar != null) {
                n.a.a(nVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i11, i12, vVar);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked()) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        n nVar2 = this.workContinuation;
        this.workContinuation = null;
        return nVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i11;
        ObjectList objectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m2038isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList m2043valuesimpl = MultiValueMap.m2043valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m2028clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m2028clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(m2043valuesimpl.getSize());
                    Object[] objArr = m2043valuesimpl.content;
                    int i12 = m2043valuesimpl._size;
                    for (int i13 = 0; i13 < i12; i13++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i13];
                        mutableObjectList.add(h1.a(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectList = mutableObjectList;
                } else {
                    objectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = objectList.content;
        int i14 = objectList._size;
        for (i11 = 0; i11 < i14; i11++) {
            Pair pair = (Pair) objArr2[i11];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z11;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0) {
                z11 = getHasBroadcastFrameClockAwaitersLocked();
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            List J = list3.isEmpty() ? h0.J() : new ArrayList(list3);
            this._knownCompositionsCache = J;
            list2 = J;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z11;
        synchronized (this.stateLock) {
            z11 = this.isClosed;
        }
        if (!z11) {
            return true;
        }
        Iterator<l2> it = this.effectJob.C().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (g0.g(list.get(i11).getComposition$runtime_release(), controlledComposition)) {
                    g2 g2Var = g2.f100423a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (g0.g(next.getComposition$runtime_release(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        if (r4 >= r3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        if (r10.get(r4).getSecond() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        if (r11.getSecond() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        r11 = r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018b, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018e, code lost:
    
        a00.m0.s0(r16.movableContentAwaitingInsert, r3);
        r3 = yz.g2.f100423a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
    
        if (r11.getSecond() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r17, androidx.collection.MutableScatterSet<java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        Set<ControlledComposition> set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new x00.a<g2>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // x00.a
                            public /* bridge */ /* synthetic */ g2 invoke() {
                                invoke2();
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                                ControlledComposition controlledComposition2 = controlledComposition;
                                Object[] objArr = mutableScatterSet2.elements;
                                long[] jArr = mutableScatterSet2.metadata;
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
                                                controlledComposition2.recordWriteOf(objArr[(i11 << 3) + i13]);
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
                        });
                    }
                } catch (Throwable th2) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th2;
                }
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    private final void processCompositionError(Throwable th2, ControlledComposition controlledComposition, boolean z11) {
        int i11 = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, th2);
                g2 g2Var = g2.f100423a;
            }
            throw th2;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", th2);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i11, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m2028clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z11, th2);
                if (controlledComposition != null) {
                    recordFailedCompositionLocked(controlledComposition);
                }
                deriveStateLocked();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th2, ControlledComposition controlledComposition, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        recomposer.processCompositionError(th2, controlledComposition, z11);
    }

    private final x00.l<Object, g2> readObserverOf(final ControlledComposition controlledComposition) {
        return new x00.l<Object, g2>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                ControlledComposition.this.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(q<? super r0, ? super MonotonicFrameClock, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, qVar, MonotonicFrameClockKt.getMonotonicFrameClock(cVar.getContext()), null), cVar);
        return h11 == b.l() ? h11 : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            v vVar = null;
            int i11 = 1;
            int i12 = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i12, i11, vVar);
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i13 = 0; i13 < size; i13++) {
                    knownCompositions.get(i13).recordModificationsOf(wrapIntoSet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new MutableScatterSet<>(i12, i11, vVar);
                    g2 g2Var = g2.f100423a;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th2) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(wrapIntoSet);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition controlledComposition) {
        List list = this.failedCompositions;
        if (list == null) {
            list = new ArrayList();
            this.failedCompositions = list;
        }
        if (!list.contains(controlledComposition)) {
            list.add(controlledComposition);
        }
        removeKnownCompositionLocked(controlledComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(l2 l2Var) {
        synchronized (this.stateLock) {
            Throwable th2 = this.closeCause;
            if (th2 != null) {
                throw th2;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = l2Var;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        if (this._knownCompositions.remove(controlledComposition)) {
            this._knownCompositionsCache = null;
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
            if (mutableObjectList != null) {
                Object[] objArr = mutableObjectList.content;
                int i11 = mutableObjectList._size;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((CompositionRegistrationObserver) objArr[i12]).onCompositionUnregistered(this, controlledComposition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i11;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i11 = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) a00.m0.Q0(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th2) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            int size = list.size();
                            while (i11 < size) {
                                recordFailedCompositionLocked(list.get(i11));
                                i11++;
                            }
                            g2 g2Var = g2.f100423a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                throw th2;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            try {
                int size2 = list.size();
                while (i11 < size2) {
                    recordFailedCompositionLocked(list.get(i11));
                    i11++;
                }
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        if (r5.withFrameNanos(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a2 -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, j00.c<? super yz.g2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.e.n(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.e.n(r10)
            goto L8d
        L65:
            kotlin.e.n(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            goto La4
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, j00.c):java.lang.Object");
    }

    private final x00.l<Object, g2> writeObserverOf(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        return new x00.l<Object, g2>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                ControlledComposition.this.recordWriteOf(obj);
                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                if (mutableScatterSet2 != null) {
                    mutableScatterSet2.add(obj);
                }
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    @k
    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime_release(@k final CompositionRegistrationObserver compositionRegistrationObserver) {
        synchronized (this.stateLock) {
            try {
                MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
                int i11 = 0;
                if (mutableObjectList == null) {
                    mutableObjectList = new MutableObjectList<>(i11, 1, null);
                    this.registrationObservers = mutableObjectList;
                }
                mutableObjectList.add(compositionRegistrationObserver);
                List<ControlledComposition> list = this._knownCompositions;
                int size = list.size();
                while (i11 < size) {
                    compositionRegistrationObserver.onCompositionRegistered(this, list.get(i11));
                    i11++;
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                MutableObjectList mutableObjectList2;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                CompositionRegistrationObserver compositionRegistrationObserver2 = compositionRegistrationObserver;
                synchronized (obj) {
                    mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver2);
                    }
                }
            }
        };
    }

    @k
    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    @l
    public final Object awaitIdle(@k j00.c<? super g2> cVar) {
        Object z11 = kotlinx.coroutines.flow.k.z(kotlinx.coroutines.flow.k.X1(getCurrentState(), new Recomposer$awaitIdle$2(null)), cVar);
        return z11 == b.l() ? z11 : g2.f100423a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l2.a.b(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                g2 g2Var = g2.f100423a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(@k ControlledComposition controlledComposition, @k p<? super Composer, ? super Integer, g2> pVar) {
        Throwable th2;
        boolean isComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(pVar);
                    g2 g2Var = g2.f100423a;
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    applyAndCheck(takeMutableSnapshot);
                    if (!isComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!getKnownCompositions().contains(controlledComposition)) {
                                        addKnownCompositionLocked(controlledComposition);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(controlledComposition);
                                try {
                                    controlledComposition.applyChanges();
                                    controlledComposition.applyLateChanges();
                                    if (isComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Throwable th4) {
                                    processCompositionError$default(this, th4, null, false, 6, null);
                                }
                            } catch (Throwable th5) {
                                processCompositionError(th5, controlledComposition, true);
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        takeMutableSnapshot.restoreCurrent(makeCurrent);
                        throw th7;
                    } catch (Throwable th8) {
                        th = th8;
                        Throwable th9 = th;
                        try {
                            applyAndCheck(takeMutableSnapshot);
                            throw th9;
                        } catch (Throwable th10) {
                            th = th10;
                            processCompositionError(th, controlledComposition, true);
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    @k
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k p<? super Composer, ? super Integer, g2> pVar) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                composeInitial$runtime_release(controlledComposition, pVar);
                ScatterSet<RecomposeScopeImpl> scatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSet == null) {
                    scatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSet;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m2026addimpl(this.movableContentRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
                if (movableContentStateReference.getNestedReferences$runtime_release() != null) {
                    deletedMovableContent$lambda$73$recordNestedStatesOf(this, movableContentStateReference, movableContentStateReference);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @l
    public Composition getComposition$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @k
    public final m0<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @k
    public d getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z11;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0 && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty()) {
                z11 = getHasBroadcastFrameClockAwaitersLocked();
            }
        }
        return z11;
    }

    @Override // androidx.compose.runtime.CompositionContext
    @k
    public d getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @k
    public final i<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference) {
        n<g2> deriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            deriveStateLocked.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(@k ControlledComposition controlledComposition) {
        n<g2> nVar;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                nVar = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                nVar = deriveStateLocked();
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl) {
        n<g2> deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.a aVar = Result.Companion;
            deriveStateLocked.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    @l
    public final Object join(@k j00.c<? super g2> cVar) {
        Object x02 = kotlinx.coroutines.flow.k.x0(getCurrentState(), new Recomposer$join$2(null), cVar);
        return x02 == b.l() ? x02 : g2.f100423a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(@k MovableContentStateReference movableContentStateReference, @k MovableContentState movableContentState, @k Applier<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.set(movableContentStateReference, movableContentState);
                ObjectList<MovableContentStateReference> m2035getimpl = MultiValueMap.m2035getimpl(this.movableContentNestedExtractionsPending, movableContentStateReference);
                if (m2035getimpl.isNotEmpty()) {
                    ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release = movableContentState.extractNestedStates$runtime_release(applier, m2035getimpl);
                    Object[] objArr = extractNestedStates$runtime_release.keys;
                    Object[] objArr2 = extractNestedStates$runtime_release.values;
                    long[] jArr = extractNestedStates$runtime_release.metadata;
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
                                        Object obj = objArr[i14];
                                        this.movableContentStatesAvailable.set((MovableContentStateReference) obj, (MovableContentState) objArr2[i14]);
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
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @l
    public MovableContentState movableContentStateResolve$runtime_release(@k MovableContentStateReference movableContentStateReference) {
        MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.movableContentStatesAvailable.remove(movableContentStateReference);
        }
        return remove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            g2 g2Var = g2.f100423a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @k
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k ScatterSet<RecomposeScopeImpl> scatterSet) {
        try {
            recordComposerModifications();
            controlledComposition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(scatterSet));
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                ControlledComposition performRecompose = performRecompose(controlledComposition, null);
                if (performRecompose != null) {
                    performInitialMovableContentInserts(controlledComposition);
                    performRecompose.applyChanges();
                    performRecompose.applyLateChanges();
                }
                ScatterSet<RecomposeScopeImpl> scatterSet2 = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSet2 == null) {
                    scatterSet2 = ScatterSetKt.emptyScatterSet();
                }
                return scatterSet2;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSet);
        }
        mutableScatterSet.add(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(@k ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            try {
                Set set = this.compositionsRemoved;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.compositionsRemoved = set;
                }
                set.add(controlledComposition);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        n<g2> nVar;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                nVar = deriveStateLocked();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    @l
    public final Object runRecomposeAndApplyChanges(@k j00.c<? super g2> cVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), cVar);
        return recompositionRunner == b.l() ? recompositionRunner : g2.f100423a;
    }

    @l
    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(@k d dVar, @k j00.c<? super g2> cVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(dVar, this, null), cVar);
        return recompositionRunner == b.l() ? recompositionRunner : g2.f100423a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(@k ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            g2 g2Var = g2.f100423a;
        }
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    @yz.n(message = "Replaced by currentState as a StateFlow", replaceWith = @w0(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(@k Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(@k ControlledComposition controlledComposition) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void recordComposerModifications(x00.l<? super ControlledComposition, g2> lVar) {
        MutableScatterSet mutableScatterSet;
        int i11;
        synchronized (this.stateLock) {
            int i12 = 1;
            try {
                mutableScatterSet = this.snapshotInvalidations;
                i11 = 0;
                if (mutableScatterSet.isNotEmpty()) {
                    this.snapshotInvalidations = new MutableScatterSet(i11, i12, null);
                }
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!wrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((ControlledComposition) knownCompositions.get(i13)).recordModificationsOf(wrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        T[] tArr = mutableVector.content;
        int size2 = mutableVector.getSize();
        while (i11 < size2) {
            lVar.invoke(tArr[i11]);
            i11++;
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            try {
                if (deriveStateLocked() == null) {
                    g2 g2Var = g2.f100423a;
                    d0.d(1);
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th3) {
                d0.d(1);
                d0.c(1);
                throw th3;
            }
        }
        d0.c(1);
    }
}
