package androidx.compose.runtime.snapshots;

import a00.r0;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#2,2:2488\n1894#2,2:2497\n33#3,2:2490\n33#3,2:2499\n48#4,5:2492\n33#4,5:2501\n1#5:2506\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n112#1:2488,2\n244#1:2497,2\n112#1:2490,2\n244#1:2499,2\n189#1:2492,5\n273#1:2501,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;

    @k
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2487:1\n546#1:2493\n546#1:2499\n549#1:2500\n148#2,5:2488\n148#2,5:2494\n1894#3,2:2501\n1894#3,2:2505\n1894#3,2:2509\n1894#3,2:2513\n1894#3,2:2517\n33#4,2:2503\n33#4,2:2507\n33#4,2:2511\n33#4,2:2515\n33#4,2:2519\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n492#1:2493\n554#1:2499\n558#1:2500\n455#1:2488,5\n527#1:2494,5\n623#1:2501,2\n644#1:2505,2\n678#1:2509,2\n624#1:2513,2\n647#1:2517,2\n623#1:2503,2\n644#1:2507,2\n678#1:2511,2\n624#1:2515,2\n647#1:2519,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, l lVar, l lVar2, x00.a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = null;
            }
            if ((i11 & 2) != 0) {
                lVar2 = null;
            }
            return companion.observe(lVar, lVar2, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$4(p pVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = r0.v4(list, pVar);
                g2 g2Var = g2.f100423a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$7(l lVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = r0.v4(list, lVar);
                g2 g2Var = g2.f100423a;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, l lVar, l lVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = null;
            }
            if ((i11 & 2) != 0) {
                lVar2 = null;
            }
            return companion.takeMutableSnapshot(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = null;
            }
            return companion.takeSnapshot(lVar);
        }

        @v0
        @k
        public final Snapshot createNonObservableSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) snapshotThreadLocal.get(), null, false, 6, null);
        }

        @k
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        @m80.l
        public final Snapshot getCurrentThreadSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return (Snapshot) snapshotThreadLocal.get();
        }

        public final <T> T global(@k x00.a<? extends T> aVar) {
            Snapshot removeCurrent = removeCurrent();
            try {
                return aVar.invoke();
            } finally {
                d0.d(1);
                restoreCurrent(removeCurrent);
                d0.c(1);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            AtomicInt atomicInt;
            atomicInt = SnapshotKt.pendingApplyObserverCount;
            return atomicInt.get() > 0;
        }

        public final boolean isInSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return snapshotThreadLocal.get() != null;
        }

        @v0
        @k
        public final Snapshot makeCurrentNonObservable(@m80.l Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            Snapshot createTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            createTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return createTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@m80.l l<Object, g2> lVar, @m80.l l<Object, g2> lVar2, @k x00.a<? extends T> aVar) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            l<Object, g2> mergedWriteObserver;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    l<Object, g2> readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                    l<Object, g2> writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(lVar, readObserver, false, 4, null));
                        mergedWriteObserver = SnapshotKt.mergedWriteObserver(lVar2, writeObserver$runtime_release);
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(mergedWriteObserver);
                        return aVar.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(lVar);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T invoke = aVar.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return invoke;
                } catch (Throwable th2) {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th2;
                }
            } catch (Throwable th3) {
                transparentObserverMutableSnapshot.dispose();
                throw th3;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            SnapshotIdSet snapshotIdSet;
            snapshotIdSet = SnapshotKt.openSnapshots;
            return r0.a6(snapshotIdSet).size();
        }

        @k
        public final ObserverHandle registerApplyObserver(@k final p<? super Set<? extends Object>, ? super Snapshot, g2> pVar) {
            l lVar;
            List list;
            lVar = SnapshotKt.emptyLambda;
            SnapshotKt.advanceGlobalSnapshot(lVar);
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = r0.J4(list, pVar);
                g2 g2Var = g2.f100423a;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$4(p.this);
                }
            };
        }

        @k
        public final ObserverHandle registerGlobalWriteObserver(@k final l<Object, g2> lVar) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = r0.J4(list, lVar);
                g2 g2Var = g2.f100423a;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$7(l.this);
                }
            };
        }

        @m80.l
        @v0
        public final Snapshot removeCurrent() {
            SnapshotThreadLocal snapshotThreadLocal;
            SnapshotThreadLocal snapshotThreadLocal2;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot != null) {
                snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
                snapshotThreadLocal2.set(null);
            }
            return snapshot;
        }

        @v0
        public final void restoreCurrent(@m80.l Snapshot snapshot) {
            SnapshotThreadLocal snapshotThreadLocal;
            if (snapshot != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                snapshotThreadLocal.set(snapshot);
            }
        }

        @v0
        public final void restoreNonObservable(@m80.l Snapshot snapshot, @k Snapshot snapshot2, @m80.l l<Object, g2> lVar) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(lVar);
            } else {
                if (snapshot instanceof TransparentObserverSnapshot) {
                    ((TransparentObserverSnapshot) snapshot).setReadObserver(lVar);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        public final void sendApplyNotifications() {
            GlobalSnapshot globalSnapshot;
            boolean hasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                globalSnapshot = SnapshotKt.globalSnapshot;
                hasPendingChanges = globalSnapshot.hasPendingChanges();
            }
            if (hasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        @k
        public final MutableSnapshot takeMutableSnapshot(@m80.l l<Object, g2> lVar, @m80.l l<Object, g2> lVar2) {
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return takeNestedMutableSnapshot;
        }

        @k
        public final Snapshot takeSnapshot(@m80.l l<Object, g2> lVar) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(lVar);
        }

        public final <R> R withMutableSnapshot(@k x00.a<? extends R> aVar) {
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    R invoke = aVar.invoke();
                    d0.d(1);
                    takeMutableSnapshot$default.apply().check();
                    takeMutableSnapshot$default.dispose();
                    d0.c(1);
                    return invoke;
                } finally {
                    d0.d(1);
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    d0.c(1);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(@k x00.a<? extends T> aVar) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return aVar.invoke();
            } finally {
                d0.d(1);
                restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                d0.c(1);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }

        @v0
        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }
    }

    public /* synthetic */ Snapshot(int i11, SnapshotIdSet snapshotIdSet, v vVar) {
        this(i11, snapshotIdSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        return snapshot.takeNestedSnapshot(lVar);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            g2 g2Var = g2.f100423a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            g2 g2Var = g2.f100423a;
        }
    }

    public final <T> T enter(@k x00.a<? extends T> aVar) {
        Snapshot makeCurrent = makeCurrent();
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            restoreCurrent(makeCurrent);
            d0.c(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    @k
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    @m80.l
    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    @m80.l
    public abstract l<Object, g2> getReadObserver();

    public abstract boolean getReadOnly();

    @k
    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @m80.l
    public abstract l<Object, g2> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    @m80.l
    @v0
    public Snapshot makeCurrent() {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo2067nestedActivated$runtime_release(@k Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo2068nestedDeactivated$runtime_release(@k Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo2069recordModified$runtime_release(@k StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i11 = this.pinningTrackingHandle;
        if (i11 >= 0) {
            SnapshotKt.releasePinningLocked(i11);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    @v0
    public void restoreCurrent(@m80.l Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z11) {
        this.disposed = z11;
    }

    public void setInvalid$runtime_release(@k SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime_release(long j11) {
        this.snapshotId = j11;
    }

    public void setWriteCount$runtime_release(int i11) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @k
    public abstract Snapshot takeNestedSnapshot(@m80.l l<Object, g2> lVar);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i11 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i11;
    }

    @m80.l
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(@m80.l Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        if (!(snapshotThreadLocal.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public /* synthetic */ Snapshot(long j11, SnapshotIdSet snapshotIdSet, v vVar) {
        this(j11, snapshotIdSet);
    }

    private Snapshot(long j11, SnapshotIdSet snapshotIdSet) {
        long j12;
        this.invalid = snapshotIdSet;
        this.snapshotId = j11;
        j12 = SnapshotKt.INVALID_SNAPSHOT;
        this.pinningTrackingHandle = j11 != j12 ? SnapshotKt.trackPinning(j11, getInvalid$runtime_release()) : -1;
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Use id: Long constructor instead")
    private /* synthetic */ Snapshot(int i11, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i11), snapshotIdSet, (v) null);
    }

    @n(message = "Use snapshotId instead", replaceWith = @w0(expression = "snapshotId", imports = {}))
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    @v0
    public static /* synthetic */ void getReadObserver$annotations() {
    }
}
