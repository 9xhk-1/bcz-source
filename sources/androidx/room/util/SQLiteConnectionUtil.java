package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.g0;
import m80.k;
import u00.a;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "SQLiteConnectionUtil")
/* loaded from: classes3.dex */
public final class SQLiteConnectionUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long getLastInsertedRowId(@k SQLiteConnection connection) {
        g0.p(connection, "connection");
        if (getTotalChangedRows(connection) == 0) {
            return -1L;
        }
        SQLiteStatement prepare = connection.prepare("SELECT last_insert_rowid()");
        try {
            prepare.step();
            long j11 = prepare.getLong(0);
            a.c(prepare, null);
            return j11;
        } finally {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getTotalChangedRows(@k SQLiteConnection connection) {
        g0.p(connection, "connection");
        SQLiteStatement prepare = connection.prepare("SELECT changes()");
        try {
            prepare.step();
            int i11 = (int) prepare.getLong(0);
            a.c(prepare, null);
            return i11;
        } finally {
        }
    }
}
