package androidx.room.support;

import androidx.room.DelegatingOpenHelper;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import c40.r0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @m80.k
    private final SupportSQLiteOpenHelper delegate;

    @m80.k
    private final RoomDatabase.QueryCallback queryCallback;

    @m80.k
    private final r0 queryCallbackScope;

    public QueryInterceptorOpenHelper(@m80.k SupportSQLiteOpenHelper delegate, @m80.k r0 queryCallbackScope, @m80.k RoomDatabase.QueryCallback queryCallback) {
        g0.p(delegate, "delegate");
        g0.p(queryCallbackScope, "queryCallbackScope");
        g0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.l
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @m80.k
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.k
    public SupportSQLiteDatabase getReadableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getReadableDatabase(), this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.k
    public SupportSQLiteDatabase getWritableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getWritableDatabase(), this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.delegate.setWriteAheadLoggingEnabled(z11);
    }
}
