package androidx.room.support;

import a00.a0;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import c40.r0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    @m80.k
    private final SupportSQLiteDatabase delegate;

    @m80.k
    private final RoomDatabase.QueryCallback queryCallback;

    @m80.k
    private final r0 queryCallbackScope;

    public QueryInterceptorDatabase(@m80.k SupportSQLiteDatabase delegate, @m80.k r0 queryCallbackScope, @m80.k RoomDatabase.QueryCallback queryCallback) {
        g0.p(delegate, "delegate");
        g0.p(queryCallbackScope, "queryCallbackScope");
        g0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransaction$1(this, null), 3, null);
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransactionNonExclusive$1(this, null), 3, null);
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
        this.delegate.beginTransactionReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@m80.k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransactionWithListener$1(this, null), 3, null);
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@m80.k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1(this, null), 3, null);
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(@m80.k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.k
    public SupportSQLiteStatement compileStatement(@m80.k String sql) {
        g0.p(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@m80.k String table, @m80.l String str, @m80.l Object[] objArr) {
        g0.p(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$endTransaction$1(this, null), 3, null);
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@m80.k String sql, @m80.l @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        g0.p(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@m80.k String sql) {
        g0.p(sql, "sql");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$execSQL$1(this, sql, null), 3, null);
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.l
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.l
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@m80.k String table, int i11, @m80.k ContentValues values) {
        g0.p(table, "table");
        g0.p(values, "values");
        return this.delegate.insert(table, i11, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i11) {
        return this.delegate.needUpgrade(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.k
    public Cursor query(@m80.k String query) {
        g0.p(query, "query");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$1(this, query, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z11) {
        this.delegate.setForeignKeyConstraintsEnabled(z11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@m80.k Locale locale) {
        g0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i11) {
        this.delegate.setMaxSqlCacheSize(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j11) {
        return this.delegate.setMaximumSize(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j11) {
        this.delegate.setPageSize(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$setTransactionSuccessful$1(this, null), 3, null);
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i11) {
        this.delegate.setVersion(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@m80.k String table, int i11, @m80.k ContentValues values, @m80.l String str, @m80.l Object[] objArr) {
        g0.p(table, "table");
        g0.p(values, "values");
        return this.delegate.update(table, i11, values, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j11) {
        return this.delegate.yieldIfContendedSafely(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@m80.k String sql, @m80.k Object[] bindArgs) {
        g0.p(sql, "sql");
        g0.p(bindArgs, "bindArgs");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$execSQL$2(this, sql, a0.dz(bindArgs), null), 3, null);
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.k
    public Cursor query(@m80.k String query, @m80.k Object[] bindArgs) {
        g0.p(query, "query");
        g0.p(bindArgs, "bindArgs");
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$2(this, query, a0.dz(bindArgs), null), 3, null);
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.k
    public Cursor query(@m80.k SupportSQLiteQuery query) {
        g0.p(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$3(this, query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m80.k
    public Cursor query(@m80.k SupportSQLiteQuery query, @m80.l CancellationSignal cancellationSignal) {
        g0.p(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorDatabase$query$4(this, query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }
}
