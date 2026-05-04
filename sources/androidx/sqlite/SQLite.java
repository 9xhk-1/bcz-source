package androidx.sqlite;

import android.database.SQLException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u00.a;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "SQLite")
@u0({"SMAP\nSQLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLite.kt\nandroidx/sqlite/SQLite\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/* loaded from: classes3.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(@k SQLiteConnection sQLiteConnection, @k String sql) {
        g0.p(sQLiteConnection, "<this>");
        g0.p(sql, "sql");
        SQLiteStatement prepare = sQLiteConnection.prepare(sql);
        try {
            prepare.step();
            a.c(prepare, null);
        } finally {
        }
    }

    @k
    public static final Void throwSQLiteException(int i11, @l String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i11);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
