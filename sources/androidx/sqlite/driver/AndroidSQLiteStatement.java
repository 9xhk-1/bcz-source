package androidx.sqlite.driver;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.AndroidSQLiteStatement;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class AndroidSQLiteStatement implements SQLiteStatement {

    @k
    public static final Companion Companion = new Companion(null);

    /* renamed from: db, reason: collision with root package name */
    @k
    private final SQLiteDatabase f5387db;
    private boolean isClosed;

    @k
    private final String sql;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private final int getStatementPrefixIndex(String str) {
            String str2;
            int i11;
            int length = str.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i12 = 0;
            while (i12 < length) {
                char charAt = str.charAt(i12);
                if (g0.t(charAt, 32) <= 0) {
                    i12++;
                } else {
                    if (charAt != '-') {
                        str2 = str;
                        if (charAt == '/') {
                            int i13 = i12 + 1;
                            if (str2.charAt(i13) == '*') {
                                do {
                                    String str3 = str2;
                                    i13 = k0.I3(str3, '*', i13 + 1, false, 4, null);
                                    str2 = str3;
                                    if (i13 >= 0) {
                                        i11 = i13 + 1;
                                        if (i11 >= length) {
                                            break;
                                        }
                                    } else {
                                        return -1;
                                    }
                                } while (str2.charAt(i11) != '/');
                                i12 = i13 + 2;
                                str = str2;
                            }
                        }
                        return i12;
                    }
                    if (str.charAt(i12 + 1) != '-') {
                        return i12;
                    }
                    str2 = str;
                    int I3 = k0.I3(str2, '\n', i12 + 2, false, 4, null);
                    if (I3 < 0) {
                        return -1;
                    }
                    i12 = I3 + 1;
                    str = str2;
                }
            }
            return -1;
        }

        private final boolean isRowStatement(String str) {
            int hashCode = str.hashCode();
            return hashCode != 79487 ? hashCode != 81978 ? hashCode == 85954 && str.equals("WIT") : str.equals("SEL") : str.equals("PRA");
        }

        @k
        public final AndroidSQLiteStatement create(@k SQLiteDatabase db2, @k String sql) {
            g0.p(db2, "db");
            g0.p(sql, "sql");
            String upperCase = k0.b6(sql).toString().toUpperCase(Locale.ROOT);
            g0.o(upperCase, "toUpperCase(...)");
            String statementPrefix$sqlite_framework_release = getStatementPrefix$sqlite_framework_release(upperCase);
            return statementPrefix$sqlite_framework_release == null ? new OtherAndroidSQLiteStatement(db2, sql) : isRowStatement(statementPrefix$sqlite_framework_release) ? new SelectAndroidSQLiteStatement(db2, sql) : new OtherAndroidSQLiteStatement(db2, sql);
        }

        @l
        @VisibleForTesting
        public final String getStatementPrefix$sqlite_framework_release(@k String sql) {
            g0.p(sql, "sql");
            int statementPrefixIndex = getStatementPrefixIndex(sql);
            if (statementPrefixIndex < 0 || statementPrefixIndex > sql.length()) {
                return null;
            }
            String substring = sql.substring(statementPrefixIndex, Math.min(statementPrefixIndex + 3, sql.length()));
            g0.o(substring, "substring(...)");
            return substring;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SelectAndroidSQLiteStatement extends AndroidSQLiteStatement {

        @k
        public static final Companion Companion = new Companion(null);

        @k
        private int[] bindingTypes;

        @k
        private byte[][] blobBindings;

        @l
        private Cursor cursor;

        @k
        private double[] doubleBindings;

        @k
        private long[] longBindings;

        @k
        private String[] stringBindings;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int getDataType(Cursor cursor, int i11) {
                int type = cursor.getType(i11);
                int type2 = cursor.getType(i11);
                if (type2 == 0) {
                    return 5;
                }
                int i12 = 1;
                if (type2 != 1) {
                    i12 = 2;
                    if (type2 != 2) {
                        i12 = 3;
                        if (type2 != 3) {
                            if (type2 == 4) {
                                return 4;
                            }
                            throw new IllegalStateException(("Unknown field type: " + type).toString());
                        }
                    }
                }
                return i12;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectAndroidSQLiteStatement(@k SQLiteDatabase db2, @k String sql) {
            super(db2, sql, null);
            g0.p(db2, "db");
            g0.p(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void bindTo(SQLiteProgram sQLiteProgram) {
            int length = this.bindingTypes.length;
            for (int i11 = 1; i11 < length; i11++) {
                int i12 = this.bindingTypes[i11];
                if (i12 == 1) {
                    sQLiteProgram.bindLong(i11, this.longBindings[i11]);
                } else if (i12 == 2) {
                    sQLiteProgram.bindDouble(i11, this.doubleBindings[i11]);
                } else if (i12 == 3) {
                    sQLiteProgram.bindString(i11, this.stringBindings[i11]);
                } else if (i12 == 4) {
                    sQLiteProgram.bindBlob(i11, this.blobBindings[i11]);
                } else if (i12 == 5) {
                    sQLiteProgram.bindNull(i11);
                }
            }
        }

        private final void ensureCapacity(int i11, int i12) {
            int i13 = i12 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i13) {
                int[] copyOf = Arrays.copyOf(iArr, i13);
                g0.o(copyOf, "copyOf(...)");
                this.bindingTypes = copyOf;
            }
            if (i11 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i13) {
                    long[] copyOf2 = Arrays.copyOf(jArr, i13);
                    g0.o(copyOf2, "copyOf(...)");
                    this.longBindings = copyOf2;
                    return;
                }
                return;
            }
            if (i11 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i13) {
                    double[] copyOf3 = Arrays.copyOf(dArr, i13);
                    g0.o(copyOf3, "copyOf(...)");
                    this.doubleBindings = copyOf3;
                    return;
                }
                return;
            }
            if (i11 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i13) {
                    Object[] copyOf4 = Arrays.copyOf(strArr, i13);
                    g0.o(copyOf4, "copyOf(...)");
                    this.stringBindings = (String[]) copyOf4;
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i13) {
                Object[] copyOf5 = Arrays.copyOf(bArr, i13);
                g0.o(copyOf5, "copyOf(...)");
                this.blobBindings = (byte[][]) copyOf5;
            }
        }

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.driver.a
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                        Cursor ensureCursor$lambda$0;
                        ensureCursor$lambda$0 = AndroidSQLiteStatement.SelectAndroidSQLiteStatement.ensureCursor$lambda$0(AndroidSQLiteStatement.SelectAndroidSQLiteStatement.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                        return ensureCursor$lambda$0;
                    }
                }, getSql(), new String[0], null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cursor ensureCursor$lambda$0(SelectAndroidSQLiteStatement selectAndroidSQLiteStatement, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            g0.m(sQLiteQuery);
            selectAndroidSQLiteStatement.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private final void throwIfInvalidColumn(Cursor cursor, int i11) {
            if (i11 < 0 || i11 >= cursor.getColumnCount()) {
                SQLite.throwSQLiteException(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo5620bindBlob(int i11, @k byte[] value) {
            g0.p(value, "value");
            throwIfClosed();
            ensureCapacity(4, i11);
            this.bindingTypes[i11] = 4;
            this.blobBindings[i11] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo5621bindDouble(int i11, double d11) {
            throwIfClosed();
            ensureCapacity(2, i11);
            this.bindingTypes[i11] = 2;
            this.doubleBindings[i11] = d11;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo5622bindLong(int i11, long j11) {
            throwIfClosed();
            ensureCapacity(1, i11);
            this.bindingTypes[i11] = 1;
            this.longBindings[i11] = j11;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo5623bindNull(int i11) {
            throwIfClosed();
            ensureCapacity(5, i11);
            this.bindingTypes[i11] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo5624bindText(int i11, @k String value) {
            g0.p(value, "value");
            throwIfClosed();
            ensureCapacity(3, i11);
            this.bindingTypes[i11] = 3;
            this.stringBindings[i11] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo5625clearBindings() {
            throwIfClosed();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!isClosed()) {
                reset();
            }
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public byte[] getBlob(int i11) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i11);
            byte[] blob = throwIfNoRow.getBlob(i11);
            g0.o(blob, "getBlob(...)");
            return blob;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public String getColumnName(int i11) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i11);
            String columnName = cursor.getColumnName(i11);
            g0.o(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i11) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, i11);
            return Companion.getDataType(cursor, i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i11) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i11);
            return throwIfNoRow.getDouble(i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i11) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i11);
            return throwIfNoRow.getLong(i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public String getText(int i11) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i11);
            String string = throwIfNoRow.getString(i11);
            g0.o(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i11) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i11);
            return throwIfNoRow.isNull(i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public /* synthetic */ AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, v vVar) {
        this(sQLiteDatabase, str);
    }

    @k
    public final SQLiteDatabase getDb() {
        return this.f5387db;
    }

    @k
    public final String getSql() {
        return this.sql;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public final void setClosed(boolean z11) {
        this.isClosed = z11;
    }

    public final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    private AndroidSQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        this.f5387db = sQLiteDatabase;
        this.sql = str;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OtherAndroidSQLiteStatement extends AndroidSQLiteStatement {

        @k
        private final android.database.sqlite.SQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherAndroidSQLiteStatement(@k SQLiteDatabase db2, @k String sql) {
            super(db2, sql, null);
            g0.p(db2, "db");
            g0.p(sql, "sql");
            android.database.sqlite.SQLiteStatement compileStatement = db2.compileStatement(sql);
            g0.o(compileStatement, "compileStatement(...)");
            this.delegate = compileStatement;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindBlob */
        public void mo5620bindBlob(int i11, @k byte[] value) {
            g0.p(value, "value");
            throwIfClosed();
            this.delegate.bindBlob(i11, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindDouble */
        public void mo5621bindDouble(int i11, double d11) {
            throwIfClosed();
            this.delegate.bindDouble(i11, d11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindLong */
        public void mo5622bindLong(int i11, long j11) {
            throwIfClosed();
            this.delegate.bindLong(i11, j11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindNull */
        public void mo5623bindNull(int i11) {
            throwIfClosed();
            this.delegate.bindNull(i11);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: bindText */
        public void mo5624bindText(int i11, @k String value) {
            g0.p(value, "value");
            throwIfClosed();
            this.delegate.bindString(i11, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* renamed from: clearBindings */
        public void mo5625clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public byte[] getBlob(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public String getColumnName(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @k
        public String getText(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int i11) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
        }
    }
}
