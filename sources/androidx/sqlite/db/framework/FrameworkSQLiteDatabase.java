package androidx.sqlite.db.framework;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.r;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFrameworkSQLiteDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.android.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1#2:370\n*E\n"})
/* loaded from: classes3.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    @k
    private static final c0<Method> beginTransactionMethod$delegate;

    @k
    private static final c0<Method> getThreadSessionMethod$delegate;

    @k
    private final SQLiteDatabase delegate;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    @k
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static final class Api30Impl {

        @k
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(@k SQLiteDatabase sQLiteDatabase, @k String sql, @l Object[] objArr) {
            g0.p(sQLiteDatabase, "sQLiteDatabase");
            g0.p(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getBeginTransactionMethod() {
            return (Method) FrameworkSQLiteDatabase.beginTransactionMethod$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetThreadSessionMethod() {
            return (Method) FrameworkSQLiteDatabase.getThreadSessionMethod$delegate.getValue();
        }

        private Companion() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        getThreadSessionMethod$delegate = e0.b(lazyThreadSafetyMode, new x00.a() { // from class: androidx.sqlite.db.framework.d
            @Override // x00.a
            public final Object invoke() {
                Method threadSessionMethod_delegate$lambda$7;
                threadSessionMethod_delegate$lambda$7 = FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
                return threadSessionMethod_delegate$lambda$7;
            }
        });
        beginTransactionMethod$delegate = e0.b(lazyThreadSafetyMode, new x00.a() { // from class: androidx.sqlite.db.framework.e
            @Override // x00.a
            public final Object invoke() {
                Method beginTransactionMethod_delegate$lambda$8;
                beginTransactionMethod_delegate$lambda$8 = FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
                return beginTransactionMethod_delegate$lambda$8;
            }
        });
    }

    public FrameworkSQLiteDatabase(@k SQLiteDatabase delegate) {
        g0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method beginTransactionMethod_delegate$lambda$8() {
        Class<?> returnType;
        try {
            Method getThreadSessionMethod = Companion.getGetThreadSessionMethod();
            if (getThreadSessionMethod == null || (returnType = getThreadSessionMethod.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getThreadSessionMethod_delegate$lambda$7() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final void internalBeginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) {
        Companion companion = Companion;
        if (companion.getBeginTransactionMethod() == null || companion.getGetThreadSessionMethod() == null) {
            if (sQLiteTransactionListener != null) {
                beginTransactionWithListener(sQLiteTransactionListener);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method beginTransactionMethod = companion.getBeginTransactionMethod();
        g0.m(beginTransactionMethod);
        Method getThreadSessionMethod = companion.getGetThreadSessionMethod();
        g0.m(getThreadSessionMethod);
        Object invoke = getThreadSessionMethod.invoke(this.delegate, null);
        if (invoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        beginTransactionMethod.invoke(invoke, 0, sQLiteTransactionListener, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor query$lambda$0(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        g0.m(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$2(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        g0.m(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
        internalBeginTransactionWithListenerReadOnly(null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(@k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        internalBeginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @k
    public SupportSQLiteStatement compileStatement(@k String sql) {
        g0.p(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        g0.o(compileStatement, "compileStatement(...)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@k String table, @l String str, @l Object[] objArr) {
        g0.p(table, "table");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        SupportSQLiteStatement compileStatement = compileStatement(sb2.toString());
        SimpleSQLiteQuery.Companion.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
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
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@k String sql, @l Object[] objArr) {
        g0.p(sql, "sql");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@k String sql) throws SQLException {
        g0.p(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
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
    @l
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
    public long insert(@k String table, int i11, @k ContentValues values) throws SQLException {
        g0.p(table, "table");
        g0.p(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@k SQLiteDatabase sqLiteDatabase) {
        g0.p(sqLiteDatabase, "sqLiteDatabase");
        return g0.g(this.delegate, sqLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
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
    @k
    public Cursor query(@k String query) {
        g0.p(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z11) {
        this.delegate.setForeignKeyConstraintsEnabled(z11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@k Locale locale) {
        g0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i11) {
        this.delegate.setMaxSqlCacheSize(i11);
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m5626setMaximumSize(long j11) {
        this.delegate.setMaximumSize(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j11) {
        this.delegate.setPageSize(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i11) {
        this.delegate.setVersion(i11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@k String table, int i11, @k ContentValues values, @l String str, @l Object[] objArr) {
        g0.p(table, "table");
        g0.p(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(CONFLICT_VALUES[i11]);
        sb2.append(table);
        sb2.append(" SET ");
        int i12 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i12 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i12] = values.get(str2);
            sb2.append(s60.d.f88059c);
            i12++;
        }
        if (objArr != null) {
            for (int i13 = size; i13 < length; i13++) {
                objArr2[i13] = objArr[i13 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        SupportSQLiteStatement compileStatement = compileStatement(sb2.toString());
        SimpleSQLiteQuery.Companion.bind(compileStatement, objArr2);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@k String sql, @k Object[] bindArgs) throws SQLException {
        g0.p(sql, "sql");
        g0.p(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @k
    public Cursor query(@k String query, @k Object[] bindArgs) {
        g0.p(query, "query");
        g0.p(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j11) {
        this.delegate.setMaximumSize(j11);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j11) {
        return this.delegate.yieldIfContendedSafely(j11);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @k
    public Cursor query(@k final SupportSQLiteQuery query) {
        g0.p(query, "query");
        final r rVar = new r() { // from class: androidx.sqlite.db.framework.b
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                SQLiteCursor query$lambda$0;
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0(SupportSQLiteQuery.this, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
                return query$lambda$0;
            }
        };
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.c
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$1;
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1(r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        }, query.getSql(), EMPTY_STRING_ARRAY, null);
        g0.o(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @k
    public Cursor query(@k final SupportSQLiteQuery query, @l CancellationSignal cancellationSignal) {
        g0.p(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$2;
                query$lambda$2 = FrameworkSQLiteDatabase.query$lambda$2(SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$2;
            }
        };
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        g0.m(cancellationSignal);
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, strArr, null, cancellationSignal);
        g0.o(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }
}
