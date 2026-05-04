package androidx.room;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoomCallableTrackingLiveData<T> extends RoomTrackingLiveData<T> {

    @m80.k
    private final Callable<T> callableFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomCallableTrackingLiveData(@m80.k RoomDatabase database, @m80.k InvalidationLiveDataContainer container, boolean z11, @m80.k String[] tableNames, @m80.k Callable<T> callableFunction) {
        super(database, container, z11, tableNames, null);
        g0.p(database, "database");
        g0.p(container, "container");
        g0.p(tableNames, "tableNames");
        g0.p(callableFunction, "callableFunction");
        this.callableFunction = callableFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    @m80.l
    public Object compute(@m80.k j00.c<? super T> cVar) {
        return this.callableFunction.call();
    }
}
