package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteConnection implements SQLiteConnection {

    /* renamed from: db, reason: collision with root package name */
    @k
    private final SupportSQLiteDatabase f5334db;

    public SupportSQLiteConnection(@k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        this.f5334db = db2;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.f5334db.close();
    }

    @k
    public final SupportSQLiteDatabase getDb() {
        return this.f5334db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    @k
    public SupportSQLiteStatement prepare(@k String sql) {
        g0.p(sql, "sql");
        return SupportSQLiteStatement.Companion.create(this.f5334db, sql);
    }
}
