package androidx.compose.runtime.snapshots;

import a00.h0;
import a00.r0;
import androidx.camera.view.q;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import m80.o;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,597:1\n183#1:604\n184#1:616\n187#1:652\n188#1:670\n187#1:671\n188#1:689\n183#1:690\n184#1:702\n1101#2:598\n1083#2,2:599\n27#3:601\n33#3,2:602\n33#3,2:605\n33#3,2:617\n33#3,2:628\n33#3,2:645\n33#3,2:653\n33#3,2:672\n33#3,2:691\n423#4,9:607\n423#4,9:619\n740#4,15:630\n740#4,15:655\n740#4,15:674\n423#4,9:693\n347#4,8:703\n641#4,2:711\n33#5,5:647\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n71#1:604\n71#1:616\n278#1:652\n278#1:670\n289#1:671\n289#1:689\n316#1:690\n316#1:702\n174#1:598\n174#1:599,2\n175#1:601\n65#1:602,2\n71#1:605,2\n183#1:617,2\n187#1:628,2\n222#1:645,2\n278#1:653,2\n289#1:672,2\n316#1:691,2\n71#1:607,9\n183#1:619,9\n187#1:630,15\n278#1:655,15\n289#1:674,15\n316#1:693,9\n327#1:703,8\n330#1:711,2\n229#1:647,5\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @l
    private ObserverHandle applyUnsubscribe;

    @l
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @k
    private final x00.l<x00.a<g2>, g2> onChangedExecutor;
    private boolean sendingNotifications;

    @k
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    @k
    private final p<Set<? extends Object>, Snapshot, g2> applyObserver = new p<Set<? extends Object>, Snapshot, g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            boolean drainChanges;
            SnapshotStateObserver.this.addChanges(set);
            drainChanges = SnapshotStateObserver.this.drainChanges();
            if (drainChanges) {
                SnapshotStateObserver.this.sendNotifications();
            }
        }
    };

    @k
    private final x00.l<Object, g2> readObserver = new x00.l<Object, g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
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
            boolean z11;
            Object obj2;
            SnapshotStateObserver.ObservedScopeMap observedScopeMap;
            z11 = SnapshotStateObserver.this.isPaused;
            if (z11) {
                return;
            }
            obj2 = SnapshotStateObserver.this.observedScopeMapsLock;
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (obj2) {
                observedScopeMap = snapshotStateObserver.currentMap;
                g0.m(observedScopeMap);
                observedScopeMap.recordRead(obj);
                g2 g2Var = g2.f100423a;
            }
        }
    };

    @k
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);

    @k
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@k x00.l<? super x00.a<g2>, g2> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List I4;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                I4 = set;
            } else if (obj instanceof Set) {
                I4 = h0.Q(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                I4 = r0.I4((Collection) obj, a00.g0.l(set));
            }
        } while (!q.a(this.pendingChanges, obj, I4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z11;
        synchronized (this.observedScopeMapsLock) {
            z11 = this.sendingNotifications;
        }
        if (z11) {
            return false;
        }
        boolean z12 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z12;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (!observedScopeMapArr[i11].recordInvalidation(removeChanges) && !z12) {
                            z12 = false;
                        }
                        z12 = true;
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(x00.l<? super T, g2> lVar) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i11];
            if (observedScopeMap.getOnChanged() == lVar) {
                break;
            }
            i11++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        g0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((x00.l) x0.q(lVar, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(x00.l<? super ObservedScopeMap, g2> lVar) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    lVar.invoke(observedScopeMapArr[i11]);
                }
                g2 g2Var = g2.f100423a;
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!q.a(this.pendingChanges, obj, obj2));
        return set;
    }

    private final void removeScopeMapIf(x00.l<? super ObservedScopeMap, Boolean> lVar) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    if (lVar.invoke(mutableVector.content[i12]).booleanValue()) {
                        i11++;
                    } else if (i11 > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i12 - i11] = observedScopeMapArr[i12];
                    }
                }
                int i13 = size - i11;
                a00.q.M1(mutableVector.content, null, i13, size);
                mutableVector.setSize(i13);
                g2 g2Var = g2.f100423a;
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new x00.a<g2>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
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
                Object obj;
                boolean z11;
                boolean drainChanges;
                MutableVector mutableVector;
                do {
                    obj = SnapshotStateObserver.this.observedScopeMapsLock;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (obj) {
                        try {
                            z11 = snapshotStateObserver.sendingNotifications;
                            if (!z11) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    mutableVector = snapshotStateObserver.observedScopeMaps;
                                    Object[] objArr = mutableVector.content;
                                    int size = mutableVector.getSize();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((SnapshotStateObserver.ObservedScopeMap) objArr[i11]).notifyInvalidatedScopes();
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            g2 g2Var = g2.f100423a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    drainChanges = SnapshotStateObserver.this.drainChanges();
                } while (drainChanges);
            }
        });
    }

    public final void clear(@k Object obj) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i12];
                    observedScopeMap.clearScopeObservations(obj);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i11++;
                    } else if (i11 > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i12 - i11] = observedScopeMapArr[i12];
                    }
                }
                int i13 = size - i11;
                a00.q.M1(mutableVector.content, null, i13, size);
                mutableVector.setSize(i13);
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clearIf(@k x00.l<Object, Boolean> lVar) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i12];
                    observedScopeMap.removeScopeIf(lVar);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i11++;
                    } else if (i11 > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i12 - i11] = observedScopeMapArr[i12];
                    }
                }
                int i13 = size - i11;
                a00.q.M1(mutableVector.content, null, i13, size);
                mutableVector.setSize(i13);
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @o
    public final void notifyChanges(@k Set<? extends Object> set, @k Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    public final <T> void observeReads(@k T t11, @k x00.l<? super T, g2> lVar, @k x00.a<g2> aVar) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMapsLock) {
            ensureMap = ensureMap(lVar);
        }
        boolean z11 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j11 = this.currentMapThreadId;
        if (j11 != -1) {
            if (!(j11 == Thread_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j11 + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            ensureMap.observe(t11, this.readObserver, aVar);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z11;
            this.currentMapThreadId = j11;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @n(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @w0(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@k x00.a<g2> aVar) {
        boolean z11 = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,597:1\n1101#2:598\n1083#2,2:599\n403#3,3:601\n367#3,6:604\n377#3,3:611\n380#3,2:615\n383#3,6:618\n406#3:624\n367#3,6:636\n377#3,3:643\n380#3,2:647\n383#3,6:653\n395#3,4:660\n367#3,6:664\n377#3,3:671\n380#3,9:675\n399#3:684\n395#3,4:700\n367#3,6:704\n377#3,3:711\n380#3,9:715\n399#3:724\n1399#4:610\n1270#4:614\n1399#4:642\n1270#4:646\n1399#4:670\n1270#4:674\n1399#4:692\n1270#4:696\n1399#4:710\n1270#4:714\n1399#4:748\n1270#4:752\n1399#4:772\n1270#4:776\n1399#4:795\n1270#4:799\n1399#4:838\n1270#4:842\n1399#4:874\n1270#4:878\n1399#4:912\n1270#4:916\n1399#4:935\n1270#4:939\n1399#4:978\n1270#4:982\n1399#4:1014\n1270#4:1018\n1399#4:1061\n1270#4:1065\n1399#4:1090\n1270#4:1094\n57#5:617\n57#5:625\n57#5:755\n393#6,6:626\n399#6,2:633\n44#7:632\n519#7:1035\n423#7,9:1036\n775#8:635\n777#8,4:649\n781#8:659\n842#9:685\n844#9:699\n845#9,3:725\n848#9:734\n329#10,6:686\n339#10,3:693\n342#10,2:697\n345#10,6:728\n41#11,3:735\n46#11:900\n48#11:1034\n231#12,3:738\n200#12,7:741\n211#12,3:749\n214#12,2:753\n231#12,3:762\n200#12,7:765\n211#12,3:773\n214#12,2:777\n231#12,3:785\n200#12,7:788\n211#12,3:796\n214#12,9:800\n234#12:809\n217#12,6:814\n234#12:820\n231#12,3:828\n200#12,7:831\n211#12,3:839\n214#12,9:843\n234#12:852\n231#12,3:864\n200#12,7:867\n211#12,3:875\n214#12,9:879\n234#12:888\n217#12,6:893\n234#12:899\n231#12,3:902\n200#12,7:905\n211#12,3:913\n214#12,2:917\n231#12,3:925\n200#12,7:928\n211#12,3:936\n214#12,9:940\n234#12:949\n217#12,6:954\n234#12:960\n231#12,3:968\n200#12,7:971\n211#12,3:979\n214#12,9:983\n234#12:992\n231#12,3:1004\n200#12,7:1007\n211#12,3:1015\n214#12,9:1019\n234#12:1028\n231#12,3:1051\n200#12,7:1054\n211#12,3:1062\n214#12,2:1066\n217#12,6:1069\n234#12:1075\n231#12,3:1080\n200#12,7:1083\n211#12,3:1091\n214#12,9:1095\n234#12:1104\n67#13,6:756\n67#13,6:779\n75#13,4:810\n75#13:821\n67#13,6:822\n75#13,4:853\n78#13:857\n67#13,6:858\n75#13,4:889\n67#13,6:919\n75#13,4:950\n75#13:961\n67#13,6:962\n75#13,4:993\n78#13:997\n67#13,6:998\n75#13,4:1029\n67#13,6:1045\n75#13,4:1076\n1855#14:901\n1856#14:1033\n1#15:1068\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n365#1:598\n365#1:599,2\n431#1:601,3\n431#1:604,6\n431#1:611,3\n431#1:615,2\n431#1:618,6\n431#1:624\n472#1:636,6\n472#1:643,3\n472#1:647,2\n472#1:653,6\n484#1:660,4\n484#1:664,6\n484#1:671,3\n484#1:675,9\n484#1:684\n492#1:700,4\n492#1:704,6\n492#1:711,3\n492#1:715,9\n492#1:724\n431#1:610\n431#1:614\n472#1:642\n472#1:646\n484#1:670\n484#1:674\n489#1:692\n489#1:696\n492#1:710\n492#1:714\n529#1:748\n529#1:752\n536#1:772\n536#1:776\n548#1:795\n548#1:799\n548#1:838\n548#1:842\n559#1:874\n559#1:878\n536#1:912\n536#1:916\n548#1:935\n548#1:939\n548#1:978\n548#1:982\n559#1:1014\n559#1:1018\n577#1:1061\n577#1:1065\n592#1:1090\n592#1:1094\n433#1:617\n441#1:625\n530#1:755\n459#1:626,6\n459#1:633,2\n459#1:632\n565#1:1035\n566#1:1036,9\n472#1:635\n472#1:649,4\n472#1:659\n489#1:685\n489#1:699\n489#1:725,3\n489#1:734\n489#1:686,6\n489#1:693,3\n489#1:697,2\n489#1:728,6\n529#1:735,3\n529#1:900\n529#1:1034\n529#1:738,3\n529#1:741,7\n529#1:749,3\n529#1:753,2\n536#1:762,3\n536#1:765,7\n536#1:773,3\n536#1:777,2\n548#1:785,3\n548#1:788,7\n548#1:796,3\n548#1:800,9\n548#1:809\n536#1:814,6\n536#1:820\n548#1:828,3\n548#1:831,7\n548#1:839,3\n548#1:843,9\n548#1:852\n559#1:864,3\n559#1:867,7\n559#1:875,3\n559#1:879,9\n559#1:888\n529#1:893,6\n529#1:899\n536#1:902,3\n536#1:905,7\n536#1:913,3\n536#1:917,2\n548#1:925,3\n548#1:928,7\n548#1:936,3\n548#1:940,9\n548#1:949\n536#1:954,6\n536#1:960\n548#1:968,3\n548#1:971,7\n548#1:979,3\n548#1:983,9\n548#1:992\n559#1:1004,3\n559#1:1007,7\n559#1:1015,3\n559#1:1019,9\n559#1:1028\n577#1:1051,3\n577#1:1054,7\n577#1:1062,3\n577#1:1066,2\n577#1:1069,6\n577#1:1075\n592#1:1080,3\n592#1:1083,7\n592#1:1091,3\n592#1:1095,9\n592#1:1104\n536#1:756,6\n548#1:779,6\n548#1:810,4\n536#1:821\n548#1:822,6\n548#1:853,4\n536#1:857\n559#1:858,6\n559#1:889,4\n548#1:919,6\n548#1:950,4\n536#1:961\n548#1:962,6\n548#1:993,4\n536#1:997\n559#1:998,6\n559#1:1029,4\n577#1:1045,6\n577#1:1076,4\n529#1:901\n529#1:1033\n*E\n"})
    public static final class ObservedScopeMap {

        @l
        private Object currentScope;

        @l
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;

        @k
        private final MutableScatterSet<Object> invalidated;

        @k
        private final x00.l<Object, g2> onChanged;

        @k
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;

        @k
        private final MutableScatterMap<Object, Object> valueToScopes = ScopeMap.m2051constructorimpl$default(null, 1, null);

        @k
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);

        @k
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i11;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i11 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i11 - 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i11;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i11 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i11 + 1;
            }
        };

        @k
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates = ScopeMap.m2051constructorimpl$default(null, 1, null);

        @k
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(@k x00.l<Object, g2> lVar) {
            this.onChanged = lVar;
            v vVar = null;
            int i11 = 1;
            int i12 = 0;
            this.scopeToValues = new MutableScatterMap<>(i12, i11, vVar);
            this.invalidated = new MutableScatterSet<>(i12, i11, vVar);
        }

        private final void clearObsoleteStateReads(Object obj) {
            int i11 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj2 = mutableObjectIntMap.keys[i15];
                            boolean z11 = mutableObjectIntMap.values[i15] != i11;
                            if (z11) {
                                removeObservation(obj, obj2);
                            }
                            if (z11) {
                                mutableObjectIntMap.removeValueAt(i15);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            ScopeMap.m2058removeimpl(this.valueToScopes, obj2, obj);
            if (!(obj2 instanceof DerivedState) || ScopeMap.m2052containsimpl(this.valueToScopes, obj2)) {
                return;
            }
            ScopeMap.m2059removeScopeimpl(this.dependencyToDerivedStates, obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            ScopeMap.m2049clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m2049clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(@k Object obj) {
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(obj);
            if (remove == null) {
                return;
            }
            Object[] objArr = remove.keys;
            int[] iArr = remove.values;
            long[] jArr = remove.metadata;
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
                            Object obj2 = objArr[i14];
                            int i15 = iArr[i14];
                            removeObservation(obj, obj2);
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

        @k
        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        @k
        public final x00.l<Object, g2> getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            x00.l<Object, g2> lVar = this.onChanged;
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
                                lVar.invoke(objArr[(i11 << 3) + i13]);
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
            mutableScatterSet.clear();
        }

        public final void observe(@k Object obj, @k x00.l<Object, g2> lVar, @k x00.a<g2> aVar) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i11 = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(lVar, null, aVar);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                g0.m(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i11;
            } catch (Throwable th2) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:234:0x04dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(@m80.k java.util.Set<? extends java.lang.Object> r44) {
            /*
                Method dump skipped, instructions count: 1368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(@k Object obj) {
            Object obj2 = this.currentScope;
            g0.m(obj2);
            int i11 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
                g2 g2Var = g2.f100423a;
            }
            recordRead(obj, i11, obj2, mutableObjectIntMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void removeScopeIf(@m80.k x00.l<java.lang.Object, java.lang.Boolean> r34) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.removeScopeIf(x00.l):void");
        }

        public final void rereadDerivedState(@k DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i11;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int hashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            v vVar = null;
            int i12 = 1;
            int i13 = 0;
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(i13, i12, vVar);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    g2 g2Var = g2.f100423a;
                }
                recordRead(derivedState, hashCode, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j11 = jArr3[i14];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            i11 = i15;
                            Object obj2 = objArr[(i14 << 3) + i17];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(i13, i12, vVar);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                g2 g2Var2 = g2.f100423a;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, hashCode, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            i11 = i15;
                        }
                        j11 >>= i11;
                        i17++;
                        i15 = i11;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i16 != i15) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i14 == length) {
                    return;
                }
                i14++;
                jArr3 = jArr;
            }
        }

        private final void recordRead(Object obj, int i11, Object obj2, MutableObjectIntMap<Object> mutableObjectIntMap) {
            int i12;
            int i13;
            int i14;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = mutableObjectIntMap.put(obj, i11, -1);
            int i15 = 2;
            if (!(obj instanceof DerivedState) || put == i11) {
                i12 = 2;
                i13 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                MutableScatterMap<Object, Object> mutableScatterMap = this.dependencyToDerivedStates;
                ScopeMap.m2059removeScopeimpl(mutableScatterMap, obj);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j11 = jArr[i16];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j11 & 255) < 128) {
                                    i14 = i15;
                                    StateObject stateObject = (StateObject) objArr[(i16 << 3) + i18];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.Companion;
                                        ((StateObjectImpl) stateObject).m2084recordReadInh_f27i8$runtime_release(ReaderKind.m2071constructorimpl(i14));
                                    }
                                    ScopeMap.m2045addimpl(mutableScatterMap, stateObject, obj);
                                } else {
                                    i14 = i15;
                                }
                                j11 >>= 8;
                                i18++;
                                i15 = i14;
                            }
                            i12 = i15;
                            if (i17 != 8) {
                                break;
                            }
                        } else {
                            i12 = i15;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        i15 = i12;
                    }
                } else {
                    i12 = 2;
                }
                i13 = -1;
            }
            if (put == i13) {
                if (obj instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.Companion;
                    ((StateObjectImpl) obj).m2084recordReadInh_f27i8$runtime_release(ReaderKind.m2071constructorimpl(i12));
                }
                ScopeMap.m2045addimpl(this.valueToScopes, obj, obj2);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    observedScopeMapArr[i11].clear();
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
