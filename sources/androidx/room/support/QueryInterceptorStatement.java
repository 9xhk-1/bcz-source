package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import c40.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nQueryInterceptorStatement.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorStatement.android.kt\nandroidx/room/support/QueryInterceptorStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    @m80.k
    private final List<Object> bindArgsCache;

    @m80.k
    private final SupportSQLiteStatement delegate;

    @m80.k
    private final RoomDatabase.QueryCallback queryCallback;

    @m80.k
    private final r0 queryCallbackScope;

    @m80.k
    private final String sqlStatement;

    public QueryInterceptorStatement(@m80.k SupportSQLiteStatement delegate, @m80.k String sqlStatement, @m80.k r0 queryCallbackScope, @m80.k RoomDatabase.QueryCallback queryCallback) {
        g0.p(delegate, "delegate");
        g0.p(sqlStatement, "sqlStatement");
        g0.p(queryCallbackScope, "queryCallbackScope");
        g0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    private final void saveArgsToCache(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.bindArgsCache.size()) {
            int size = (i12 - this.bindArgsCache.size()) + 1;
            for (int i13 = 0; i13 < size; i13++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i12, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i11, @m80.k byte[] value) {
        g0.p(value, "value");
        saveArgsToCache(i11, value);
        this.delegate.bindBlob(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i11, double d11) {
        saveArgsToCache(i11, Double.valueOf(d11));
        this.delegate.bindDouble(i11, d11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i11, long j11) {
        saveArgsToCache(i11, Long.valueOf(j11));
        this.delegate.bindLong(i11, j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i11) {
        saveArgsToCache(i11, null);
        this.delegate.bindNull(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i11, @m80.k String value) {
        g0.p(value, "value");
        saveArgsToCache(i11, value);
        this.delegate.bindString(i11, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorStatement$execute$1(this, a00.r0.a6(this.bindArgsCache), null), 3, null);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorStatement$executeInsert$1(this, a00.r0.a6(this.bindArgsCache), null), 3, null);
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorStatement$executeUpdateDelete$1(this, a00.r0.a6(this.bindArgsCache), null), 3, null);
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorStatement$simpleQueryForLong$1(this, a00.r0.a6(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @m80.l
    public String simpleQueryForString() {
        c40.k.f(this.queryCallbackScope, null, null, new QueryInterceptorStatement$simpleQueryForString$1(this, a00.r0.a6(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForString();
    }
}
