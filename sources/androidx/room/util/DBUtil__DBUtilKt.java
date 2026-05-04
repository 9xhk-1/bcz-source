package androidx.room.util;

import android.database.SQLException;
import androidx.annotation.RestrictTo;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import j00.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u00.a;
import u30.f0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1863#2,2:169\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n106#1:169,2\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class DBUtil__DBUtilKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void dropFtsSyncTriggers(@k SQLiteConnection connection) {
        g0.p(connection, "connection");
        List j11 = a00.g0.j();
        SQLiteStatement prepare = connection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (prepare.step()) {
            try {
                j11.add(prepare.getText(0));
            } finally {
            }
        }
        g2 g2Var = g2.f100423a;
        a.c(prepare, null);
        for (String str : a00.g0.b(j11)) {
            if (f0.J2(str, "room_fts_content_sync_", false, 2, null)) {
                SQLite.execSQL(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final void foreignKeyCheck(@k SQLiteConnection db2, @k String tableName) {
        g0.p(db2, "db");
        g0.p(tableName, "tableName");
        SQLiteStatement prepare = db2.prepare("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (prepare.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(prepare));
            }
            g2 g2Var = g2.f100423a;
            a.c(prepare, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.c(prepare, th2);
                throw th3;
            }
        }
    }

    @l
    public static final <R> Object internalPerform(@k RoomDatabase roomDatabase, boolean z11, boolean z12, @k p<? super PooledConnection, ? super c<? super R>, ? extends Object> pVar, @k c<? super R> cVar) {
        return roomDatabase.useConnection$room_runtime_release(z11, new DBUtil__DBUtilKt$internalPerform$2(z12, z11, roomDatabase, pVar, null), cVar);
    }

    private static final <R> Object internalPerform$$forInline(RoomDatabase roomDatabase, boolean z11, boolean z12, p<? super PooledConnection, ? super c<? super R>, ? extends Object> pVar, c<? super R> cVar) {
        DBUtil__DBUtilKt$internalPerform$2 dBUtil__DBUtilKt$internalPerform$2 = new DBUtil__DBUtilKt$internalPerform$2(z12, z11, roomDatabase, pVar, null);
        d0.e(0);
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z11, dBUtil__DBUtilKt$internalPerform$2, cVar);
        d0.e(1);
        return useConnection$room_runtime_release;
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        do {
            if (i11 == 0) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(sQLiteStatement.getText(0));
                sb2.append("'.\n");
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i11++;
        } while (sQLiteStatement.step());
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\n");
        sb2.append("Number of rows in violation: ");
        sb2.append(i11);
        sb2.append("\n");
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append("\tParent Table = ");
            sb2.append(str2);
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append(str);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
