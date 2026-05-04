package androidx.room;

import a00.l1;
import a00.r0;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n*L\n1#1,592:1\n827#2:593\n855#2,2:594\n1863#2,2:617\n1863#2,2:624\n1#3:596\n28#4,5:597\n28#4,5:602\n28#4,5:607\n28#4,5:612\n28#4,5:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n*L\n186#1:593\n186#1:594,2\n351#1:617,2\n365#1:624,2\n274#1:597,5\n318#1:602,5\n322#1:607,5\n350#1:612,5\n364#1:619,5\n*E\n"})
/* loaded from: classes3.dex */
public class InvalidationTracker {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.l
    private AutoCloser autoCloser;

    @m80.k
    private final RoomDatabase database;

    @m80.k
    private final TriggerBasedInvalidationTracker implementation;

    @m80.k
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;

    @m80.l
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;

    @m80.l
    private Intent multiInstanceInvalidationIntent;

    @m80.k
    private final Map<Observer, ObserverWrapper> observerMap;

    @m80.k
    private final ReentrantLock observerMapLock;

    @m80.k
    private final x00.a<g2> onRefreshCompleted;

    @m80.k
    private final x00.a<g2> onRefreshScheduled;

    @m80.k
    private final Map<String, String> shadowTablesMap;

    @m80.k
    private final String[] tableNames;

    @m80.k
    private final Object trackerLock;

    @m80.k
    private final Map<String, Set<String>> viewTables;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MultiInstanceClientInitState {

        @m80.k
        private final Context context;

        @m80.k
        private final String name;

        @m80.k
        private final Intent serviceIntent;

        public MultiInstanceClientInitState(@m80.k Context context, @m80.k String name, @m80.k Intent serviceIntent) {
            g0.p(context, "context");
            g0.p(name, "name");
            g0.p(serviceIntent, "serviceIntent");
            this.context = context;
            this.name = name;
            this.serviceIntent = serviceIntent;
        }

        public static /* synthetic */ MultiInstanceClientInitState copy$default(MultiInstanceClientInitState multiInstanceClientInitState, Context context, String str, Intent intent, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                context = multiInstanceClientInitState.context;
            }
            if ((i11 & 2) != 0) {
                str = multiInstanceClientInitState.name;
            }
            if ((i11 & 4) != 0) {
                intent = multiInstanceClientInitState.serviceIntent;
            }
            return multiInstanceClientInitState.copy(context, str, intent);
        }

        @m80.k
        public final Context component1() {
            return this.context;
        }

        @m80.k
        public final String component2() {
            return this.name;
        }

        @m80.k
        public final Intent component3() {
            return this.serviceIntent;
        }

        @m80.k
        public final MultiInstanceClientInitState copy(@m80.k Context context, @m80.k String name, @m80.k Intent serviceIntent) {
            g0.p(context, "context");
            g0.p(name, "name");
            g0.p(serviceIntent, "serviceIntent");
            return new MultiInstanceClientInitState(context, name, serviceIntent);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) obj;
            return g0.g(this.context, multiInstanceClientInitState.context) && g0.g(this.name, multiInstanceClientInitState.name) && g0.g(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        @m80.k
        public final Context getContext() {
            return this.context;
        }

        @m80.k
        public final String getName() {
            return this.name;
        }

        @m80.k
        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.name.hashCode()) * 31) + this.serviceIntent.hashCode();
        }

        @m80.k
        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Observer {

        @m80.k
        private final String[] tables;

        public Observer(@m80.k String[] tables) {
            g0.p(tables, "tables");
            this.tables = tables;
        }

        @m80.k
        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@m80.k Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Observer(@m80.k java.lang.String r3, @m80.k java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.jvm.internal.v0 r0 = new kotlin.jvm.internal.v0
                r1 = 2
                r0.<init>(r1)
                r0.a(r3)
                r0.b(r4)
                int r3 = r0.c()
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.Object[] r3 = r0.d(r3)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@m80.k RoomDatabase database, @m80.k Map<String, String> shadowTablesMap, @m80.k Map<String, Set<String>> viewTables, @m80.k String... tableNames) {
        g0.p(database, "database");
        g0.p(shadowTablesMap, "shadowTablesMap");
        g0.p(viewTables, "viewTables");
        g0.p(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable$room_runtime_release(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new x00.a() { // from class: androidx.room.f
            @Override // x00.a
            public final Object invoke() {
                g2 onRefreshScheduled$lambda$0;
                onRefreshScheduled$lambda$0 = InvalidationTracker.onRefreshScheduled$lambda$0(InvalidationTracker.this);
                return onRefreshScheduled$lambda$0;
            }
        };
        this.onRefreshCompleted = new x00.a() { // from class: androidx.room.g
            @Override // x00.a
            public final Object invoke() {
                g2 onRefreshCompleted$lambda$1;
                onRefreshCompleted$lambda$1 = InvalidationTracker.onRefreshCompleted$lambda$1(InvalidationTracker.this);
                return onRefreshCompleted$lambda$1;
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime_release(new x00.a() { // from class: androidx.room.h
            @Override // x00.a
            public final Object invoke() {
                boolean _init_$lambda$2;
                _init_$lambda$2 = InvalidationTracker._init_$lambda$2(InvalidationTracker.this);
                return Boolean.valueOf(_init_$lambda$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode$room_runtime_release() || invalidationTracker.database.isOpenInternal();
    }

    private final boolean addObserverOnly(Observer observer) {
        Pair<String[], int[]> validateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(observer.getTables$room_runtime_release());
        String[] component1 = validateTableNames$room_runtime_release.component1();
        int[] component2 = validateTableNames$room_runtime_release.component2();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, component2, component1);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper put = this.observerMap.containsKey(observer) ? (ObserverWrapper) l1.K(this.observerMap, observer) : this.observerMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            return put == null && this.implementation.onObserverAdded$room_runtime_release(component2);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFlow");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return invalidationTracker.createFlow(strArr, z11);
    }

    private final List<Observer> getAllObservers() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return r0.a6(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> set) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List a62 = r0.a6(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = a62.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime_release(set);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    List<Observer> allObservers = getAllObservers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : allObservers) {
                        if (!((Observer) obj).isRemote$room_runtime_release()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.stop();
                    }
                }
                this.implementation.resetSync$room_runtime_release();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return g2.f100423a;
    }

    private final boolean removeObserverOnly(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper remove = this.observerMap.remove(observer);
            return remove != null && this.implementation.onObserverRemoved$room_runtime_release(remove.getTableIds$room_runtime_release());
        } finally {
            reentrantLock.unlock();
        }
    }

    @WorkerThread
    public void addObserver(@m80.k Observer observer) {
        g0.p(observer, "observer");
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$addObserver$1(this, null));
        }
    }

    public final void addRemoteObserver$room_runtime_release(@m80.k Observer observer) {
        g0.p(observer, "observer");
        if (!observer.isRemote$room_runtime_release()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        addObserverOnly(observer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void addWeakObserver(@m80.k Observer observer) {
        g0.p(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @w00.k
    @m80.k
    public final kotlinx.coroutines.flow.i<Set<String>> createFlow(@m80.k String... tables) {
        g0.p(tables, "tables");
        return createFlow$default(this, tables, false, 2, null);
    }

    @yz.n(message = "Replaced with overload that takes 'inTransaction 'parameter.", replaceWith = @w0(expression = "createLiveData(tableNames, false, computeFunction", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public <T> LiveData<T> createLiveData(@m80.k String[] tableNames, @m80.k Callable<T> computeFunction) {
        g0.p(tableNames, "tableNames");
        g0.p(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, (Callable) computeFunction);
    }

    @m80.k
    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    @m80.k
    public final String[] getTableNames$room_runtime_release() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(@m80.k Context context, @m80.k String name, @m80.k Intent serviceIntent) {
        g0.p(context, "context");
        g0.p(name, "name");
        g0.p(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, this);
    }

    public final void internalInit$room_runtime_release(@m80.k SQLiteConnection connection) {
        g0.p(connection, "connection");
        this.implementation.configureConnection(connection);
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.start(intent);
                    g2 g2Var = g2.f100423a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime_release(@m80.k Set<String> tables) {
        g0.p(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> a62 = r0.a6(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : a62) {
                if (!observerWrapper.getObserver$room_runtime_release().isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @m80.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Object refresh(@m80.k String[] strArr, @m80.k j00.c<? super Boolean> cVar) {
        return this.implementation.refreshInvalidation$room_runtime_release(strArr, this.onRefreshScheduled, this.onRefreshCompleted, cVar);
    }

    public final void refreshAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$refreshVersionsSync$1(this, null));
    }

    @WorkerThread
    public void removeObserver(@m80.k Observer observer) {
        g0.p(observer, "observer");
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$removeObserver$1(this, null));
        }
    }

    public final void setAutoCloser$room_runtime_release(@m80.k AutoCloser autoCloser) {
        g0.p(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    @m80.l
    public final Object sync$room_runtime_release(@m80.k j00.c<? super g2> cVar) {
        if (this.database.inCompatibilityMode$room_runtime_release() && !this.database.isOpenInternal()) {
            return g2.f100423a;
        }
        Object syncTriggers$room_runtime_release = this.implementation.syncTriggers$room_runtime_release(cVar);
        return syncTriggers$room_runtime_release == kotlin.coroutines.intrinsics.b.l() ? syncTriggers$room_runtime_release : g2.f100423a;
    }

    @WorkerThread
    public final void syncBlocking$room_runtime_release() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }

    @w00.k
    @m80.k
    public final kotlinx.coroutines.flow.i<Set<String>> createFlow(@m80.k String[] tables, boolean z11) {
        g0.p(tables, "tables");
        Pair<String[], int[]> validateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(tables);
        String[] component1 = validateTableNames$room_runtime_release.component1();
        kotlinx.coroutines.flow.i<Set<String>> createFlow$room_runtime_release = this.implementation.createFlow$room_runtime_release(component1, validateTableNames$room_runtime_release.component2(), z11);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        kotlinx.coroutines.flow.i<Set<String>> createFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(component1) : null;
        return createFlow != null ? kotlinx.coroutines.flow.k.c1(createFlow$room_runtime_release, createFlow) : createFlow$room_runtime_release;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public <T> LiveData<T> createLiveData(@m80.k String[] tableNames, boolean z11, @m80.k Callable<T> computeFunction) {
        g0.p(tableNames, "tableNames");
        g0.p(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z11, computeFunction);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public final <T> LiveData<T> createLiveData(@m80.k String[] tableNames, boolean z11, @m80.k x00.l<? super SQLiteConnection, ? extends T> computeFunction) {
        g0.p(tableNames, "tableNames");
        g0.p(computeFunction, "computeFunction");
        this.implementation.validateTableNames$room_runtime_release(tableNames);
        return this.invalidationLiveDataContainer.create(tableNames, z11, computeFunction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "No longer called by generated implementation")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@m80.k RoomDatabase database, @m80.k String... tableNames) {
        this(database, l1.z(), l1.z(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        g0.p(database, "database");
        g0.p(tableNames, "tableNames");
    }
}
