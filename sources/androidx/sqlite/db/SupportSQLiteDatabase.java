package androidx.sqlite.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    void beginTransactionWithListener(@k SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(@k SQLiteTransactionListener sQLiteTransactionListener);

    default void beginTransactionWithListenerReadOnly(@k SQLiteTransactionListener transactionListener) {
        g0.p(transactionListener, "transactionListener");
        beginTransactionWithListener(transactionListener);
    }

    @k
    SupportSQLiteStatement compileStatement(@k String str);

    int delete(@k String str, @l String str2, @l Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(@k String sql, @l @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        g0.p(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(@k String str) throws SQLException;

    void execSQL(@k String str, @k Object[] objArr) throws SQLException;

    @l
    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @l
    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(@k String str, int i11, @k ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i11);

    @k
    Cursor query(@k SupportSQLiteQuery supportSQLiteQuery);

    @k
    Cursor query(@k SupportSQLiteQuery supportSQLiteQuery, @l CancellationSignal cancellationSignal);

    @k
    Cursor query(@k String str);

    @k
    Cursor query(@k String str, @k Object[] objArr);

    void setForeignKeyConstraintsEnabled(boolean z11);

    void setLocale(@k Locale locale);

    void setMaxSqlCacheSize(int i11);

    long setMaximumSize(long j11);

    void setPageSize(long j11);

    void setTransactionSuccessful();

    void setVersion(int i11);

    int update(@k String str, int i11, @k ContentValues contentValues, @l String str2, @l Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j11);
}
