package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.TransactionElement;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import c40.i;
import j00.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import r00.b;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n108#1,2:247\n111#1:251\n48#2:249\n67#2:250\n1#3:252\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n52#1:247,2\n52#1:251\n53#1:249\n53#1:250\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtil_androidKt {
    private static final <R> Object compatCoroutineExecute$DBUtil__DBUtil_androidKt(RoomDatabase roomDatabase, boolean z11, l<? super c<? super R>, ? extends Object> lVar, c<? super R> cVar) {
        if (roomDatabase.inCompatibilityMode$room_runtime_release() && roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
            return lVar.invoke(cVar);
        }
        d0.e(0);
        Object coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z11, cVar);
        d0.e(1);
        DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 dBUtil__DBUtil_androidKt$compatCoroutineExecute$2 = new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(lVar, null);
        d0.e(0);
        Object h11 = i.h((d) coroutineContext, dBUtil__DBUtil_androidKt$compatCoroutineExecute$2, cVar);
        d0.e(1);
        return h11;
    }

    @n(message = "Use constructor", replaceWith = @w0(expression = "CancellationSignal()", imports = {"android.os.CancellationSignal"}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final CancellationSignal createCancellationSignal() {
        return new CancellationSignal();
    }

    @n(message = "Replaced by dropFtsSyncTriggers(connection: SQLiteConnection)")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        DBUtil.dropFtsSyncTriggers(new SupportSQLiteConnection(db2));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@k SupportSQLiteDatabase db2, @k String tableName) {
        g0.p(db2, "db");
        g0.p(tableName, "tableName");
        DBUtil.foreignKeyCheck(new SupportSQLiteConnection(db2), tableName);
    }

    @m80.l
    public static final Object getCoroutineContext(@k RoomDatabase roomDatabase, boolean z11, @k c<? super d> cVar) {
        kotlin.coroutines.c transactionDispatcher$room_runtime_release;
        d plus;
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            return roomDatabase.getCoroutineScope().getCoroutineContext();
        }
        TransactionElement transactionElement = (TransactionElement) cVar.getContext().get(TransactionElement.Key);
        return (transactionElement == null || (transactionDispatcher$room_runtime_release = transactionElement.getTransactionDispatcher$room_runtime_release()) == null || (plus = roomDatabase.getQueryContext().plus(transactionDispatcher$room_runtime_release)) == null) ? z11 ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : plus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> R performBlocking(@k RoomDatabase db2, boolean z11, boolean z12, @k l<? super SQLiteConnection, ? extends R> block) {
        g0.p(db2, "db");
        g0.p(block, "block");
        db2.assertNotMainThread();
        db2.assertNotSuspendingTransaction();
        return (R) RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new DBUtil__DBUtil_androidKt$performBlocking$1(db2, z12, z11, block, null));
    }

    @m80.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> Object performInTransactionSuspending(@k RoomDatabase roomDatabase, @k l<? super c<? super R>, ? extends Object> lVar, @k c<? super R> cVar) {
        return roomDatabase.inCompatibilityMode$room_runtime_release() ? RoomDatabaseKt.withTransactionContext(roomDatabase, new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(roomDatabase, lVar, null), cVar) : i.h(roomDatabase.getCoroutineScope().getCoroutineContext(), new DBUtil__DBUtil_androidKt$performInTransactionSuspending$3(roomDatabase, lVar, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @m80.l
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object performSuspending(@m80.k androidx.room.RoomDatabase r14, boolean r15, boolean r16, @m80.k x00.l<? super androidx.sqlite.SQLiteConnection, ? extends R> r17, @m80.k j00.c<? super R> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = (androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1 r1 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            kotlin.e.n(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.Z$1
            boolean r15 = r6.Z$0
            java.lang.Object r1 = r6.L$1
            x00.l r1 = (x00.l) r1
            java.lang.Object r3 = r6.L$0
            androidx.room.RoomDatabase r3 = (androidx.room.RoomDatabase) r3
            kotlin.e.n(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            kotlin.e.n(r0)
            return r0
        L53:
            kotlin.e.n(r0)
            boolean r0 = r14.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L7f
            boolean r0 = r14.isOpenInternal()
            if (r0 == 0) goto L7f
            boolean r0 = r14.inTransaction()
            if (r0 == 0) goto L7f
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 r0 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.label = r8
            java.lang.Object r14 = r14.useConnection$room_runtime_release(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.L$0 = r14
            r5 = r17
            r6.L$1 = r5
            r6.Z$0 = r15
            r6.Z$1 = r4
            r6.label = r3
            java.lang.Object r3 = androidx.room.util.DBUtil.getCoroutineContext(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.d r0 = (kotlin.coroutines.d) r0
            androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 r8 = new androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.L$0 = r14
            r6.L$1 = r14
            r6.label = r2
            java.lang.Object r14 = c40.i.h(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt.performSuspending(androidx.room.RoomDatabase, boolean, boolean, x00.l, j00.c):java.lang.Object");
    }

    @n(message = "This is only used in the generated code and shouldn't be called directly.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final Cursor query(@k RoomDatabase db2, @k SupportSQLiteQuery sqLiteQuery, boolean z11) {
        g0.p(db2, "db");
        g0.p(sqLiteQuery, "sqLiteQuery");
        return DBUtil.query(db2, sqLiteQuery, z11, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int readVersion(@k File databaseFile) throws IOException {
        g0.p(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i11 = allocate.getInt();
            b.a(channel, null);
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(channel, th2);
                throw th3;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final SQLiteConnection toSQLiteConnection(@k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        return new SupportSQLiteConnection(db2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final Cursor query(@k RoomDatabase db2, @k SupportSQLiteQuery sqLiteQuery, boolean z11, @m80.l CancellationSignal cancellationSignal) {
        g0.p(db2, "db");
        g0.p(sqLiteQuery, "sqLiteQuery");
        Cursor query = db2.query(sqLiteQuery, cancellationSignal);
        if (!z11 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(query) : query;
    }
}
