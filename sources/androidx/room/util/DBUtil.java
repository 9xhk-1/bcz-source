package androidx.room.util;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import j00.c;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;
import yz.n;
import yz.w0;

/* loaded from: classes3.dex */
public final class DBUtil {
    @n(message = "Use constructor", replaceWith = @w0(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final CancellationSignal createCancellationSignal() {
        return DBUtil__DBUtil_androidKt.createCancellationSignal();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@k SQLiteConnection sQLiteConnection) {
        DBUtil__DBUtilKt.dropFtsSyncTriggers(sQLiteConnection);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@k SQLiteConnection sQLiteConnection, @k String str) {
        DBUtil__DBUtilKt.foreignKeyCheck(sQLiteConnection, str);
    }

    @l
    public static final Object getCoroutineContext(@k RoomDatabase roomDatabase, boolean z11, @k c<? super d> cVar) {
        return DBUtil__DBUtil_androidKt.getCoroutineContext(roomDatabase, z11, cVar);
    }

    @l
    public static final <R> Object internalPerform(@k RoomDatabase roomDatabase, boolean z11, boolean z12, @k p<? super PooledConnection, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return DBUtil__DBUtilKt.internalPerform(roomDatabase, z11, z12, pVar, cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@k RoomDatabase roomDatabase, boolean z11, boolean z12, @k x00.l<? super SQLiteConnection, ? extends R> lVar) {
        return (R) DBUtil__DBUtil_androidKt.performBlocking(roomDatabase, z11, z12, lVar);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(@k RoomDatabase roomDatabase, @k x00.l<? super c<? super R>, ? extends Object> lVar, @k c<? super R> cVar) {
        return DBUtil__DBUtil_androidKt.performInTransactionSuspending(roomDatabase, lVar, cVar);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performSuspending(@k RoomDatabase roomDatabase, boolean z11, boolean z12, @k x00.l<? super SQLiteConnection, ? extends R> lVar, @k c<? super R> cVar) {
        return DBUtil__DBUtil_androidKt.performSuspending(roomDatabase, z11, z12, lVar, cVar);
    }

    @n(message = "This is only used in the generated code and shouldn't be called directly.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final Cursor query(@k RoomDatabase roomDatabase, @k SupportSQLiteQuery supportSQLiteQuery, boolean z11) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@k File file) throws IOException {
        return DBUtil__DBUtil_androidKt.readVersion(file);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final SQLiteConnection toSQLiteConnection(@k SupportSQLiteDatabase supportSQLiteDatabase) {
        return DBUtil__DBUtil_androidKt.toSQLiteConnection(supportSQLiteDatabase);
    }

    @n(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@k SupportSQLiteDatabase supportSQLiteDatabase) {
        DBUtil__DBUtil_androidKt.dropFtsSyncTriggers(supportSQLiteDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@k SupportSQLiteDatabase supportSQLiteDatabase, @k String str) {
        DBUtil__DBUtil_androidKt.foreignKeyCheck(supportSQLiteDatabase, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final Cursor query(@k RoomDatabase roomDatabase, @k SupportSQLiteQuery supportSQLiteQuery, boolean z11, @l CancellationSignal cancellationSignal) {
        return DBUtil__DBUtil_androidKt.query(roomDatabase, supportSQLiteQuery, z11, cancellationSignal);
    }
}
