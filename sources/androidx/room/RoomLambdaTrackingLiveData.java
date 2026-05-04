package androidx.room;

import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoomLambdaTrackingLiveData<T> extends RoomTrackingLiveData<T> {

    @m80.k
    private final x00.l<SQLiteConnection, T> lambdaFunction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomLambdaTrackingLiveData(@m80.k RoomDatabase database, @m80.k InvalidationLiveDataContainer container, boolean z11, @m80.k String[] tableNames, @m80.k x00.l<? super SQLiteConnection, ? extends T> lambdaFunction) {
        super(database, container, z11, tableNames, null);
        g0.p(database, "database");
        g0.p(container, "container");
        g0.p(tableNames, "tableNames");
        g0.p(lambdaFunction, "lambdaFunction");
        this.lambdaFunction = lambdaFunction;
    }

    @Override // androidx.room.RoomTrackingLiveData
    @m80.l
    public Object compute(@m80.k j00.c<? super T> cVar) {
        return DBUtil.performSuspending(getDatabase(), true, getInTransaction(), this.lambdaFunction, cVar);
    }
}
