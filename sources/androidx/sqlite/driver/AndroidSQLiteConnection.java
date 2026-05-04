package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class AndroidSQLiteConnection implements SQLiteConnection {

    /* renamed from: db, reason: collision with root package name */
    @k
    private final SQLiteDatabase f5386db;

    public AndroidSQLiteConnection(@k SQLiteDatabase db2) {
        g0.p(db2, "db");
        this.f5386db = db2;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.f5386db.close();
    }

    @k
    public final SQLiteDatabase getDb() {
        return this.f5386db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    @k
    public SQLiteStatement prepare(@k String sql) {
        g0.p(sql, "sql");
        if (this.f5386db.isOpen()) {
            return AndroidSQLiteStatement.Companion.create(this.f5386db, sql);
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new KotlinNothingValueException();
    }
}
