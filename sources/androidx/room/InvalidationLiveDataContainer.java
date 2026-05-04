package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.sqlite.SQLiteConnection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class InvalidationLiveDataContainer {

    @m80.k
    private final RoomDatabase database;

    @m80.k
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(@m80.k RoomDatabase database) {
        g0.p(database, "database");
        this.database = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        g0.o(newSetFromMap, "newSetFromMap(...)");
        this.liveDataSet = newSetFromMap;
    }

    @m80.k
    public final <T> LiveData<T> create(@m80.k String[] tableNames, boolean z11, @m80.k Callable<T> callableFunction) {
        g0.p(tableNames, "tableNames");
        g0.p(callableFunction, "callableFunction");
        return new RoomCallableTrackingLiveData(this.database, this, z11, tableNames, callableFunction);
    }

    @m80.k
    public final Set<LiveData<?>> getLiveDataSet$room_runtime_release() {
        return this.liveDataSet;
    }

    public final void onActive(@m80.k LiveData<?> liveData) {
        g0.p(liveData, "liveData");
        this.liveDataSet.add(liveData);
    }

    public final void onInactive(@m80.k LiveData<?> liveData) {
        g0.p(liveData, "liveData");
        this.liveDataSet.remove(liveData);
    }

    @m80.k
    public final <T> LiveData<T> create(@m80.k String[] tableNames, boolean z11, @m80.k x00.l<? super SQLiteConnection, ? extends T> lambdaFunction) {
        g0.p(tableNames, "tableNames");
        g0.p(lambdaFunction, "lambdaFunction");
        return new RoomLambdaTrackingLiveData(this.database, this, z11, tableNames, lambdaFunction);
    }
}
