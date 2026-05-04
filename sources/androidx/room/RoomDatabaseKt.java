package androidx.room;

import java.util.Set;
import yz.w0;

/* loaded from: classes3.dex */
public final class RoomDatabaseKt {
    @yz.n(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @w0(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    @m80.k
    public static final kotlinx.coroutines.flow.i<Set<String>> invalidationTrackerFlow(@m80.k RoomDatabase roomDatabase, @m80.k String[] strArr, boolean z11) {
        return RoomDatabaseKt__RoomDatabase_androidKt.invalidationTrackerFlow(roomDatabase, strArr, z11);
    }

    @m80.l
    public static final <R> Object useReaderConnection(@m80.k RoomDatabase roomDatabase, @m80.k x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return RoomDatabaseKt__RoomDatabaseKt.useReaderConnection(roomDatabase, pVar, cVar);
    }

    @m80.l
    public static final <R> Object useWriterConnection(@m80.k RoomDatabase roomDatabase, @m80.k x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(roomDatabase, pVar, cVar);
    }

    public static final void validateAutoMigrations(@m80.k RoomDatabase roomDatabase, @m80.k DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(roomDatabase, databaseConfiguration);
    }

    public static final void validateMigrationsNotRequired(@m80.k Set<Integer> set, @m80.k Set<Integer> set2) {
        RoomDatabaseKt__RoomDatabaseKt.validateMigrationsNotRequired(set, set2);
    }

    public static final void validateTypeConverters(@m80.k RoomDatabase roomDatabase, @m80.k DatabaseConfiguration databaseConfiguration) {
        RoomDatabaseKt__RoomDatabaseKt.validateTypeConverters(roomDatabase, databaseConfiguration);
    }

    @m80.l
    public static final <R> Object withTransaction(@m80.k RoomDatabase roomDatabase, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransaction(roomDatabase, lVar, cVar);
    }

    @m80.l
    public static final <R> Object withTransactionContext(@m80.k RoomDatabase roomDatabase, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar) {
        return RoomDatabaseKt__RoomDatabase_androidKt.withTransactionContext(roomDatabase, lVar, cVar);
    }
}
