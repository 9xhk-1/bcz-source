package androidx.media3.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultDatabaseProvider implements DatabaseProvider {
    private final SQLiteOpenHelper sqliteOpenHelper;

    public DefaultDatabaseProvider(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqliteOpenHelper = sQLiteOpenHelper;
    }

    @Override // androidx.media3.database.DatabaseProvider
    public SQLiteDatabase getReadableDatabase() {
        return this.sqliteOpenHelper.getReadableDatabase();
    }

    @Override // androidx.media3.database.DatabaseProvider
    public SQLiteDatabase getWritableDatabase() {
        return this.sqliteOpenHelper.getWritableDatabase();
    }
}
