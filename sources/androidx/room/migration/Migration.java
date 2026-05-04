package androidx.room.migration;

import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class Migration {

    @g
    public final int endVersion;

    @g
    public final int startVersion;

    public Migration(int i11, int i12) {
        this.startVersion = i11;
        this.endVersion = i12;
    }

    public void migrate(@k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(@k SQLiteConnection connection) {
        g0.p(connection, "connection");
        if (connection instanceof SupportSQLiteConnection) {
            migrate(((SupportSQLiteConnection) connection).getDb());
            return;
        }
        throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
