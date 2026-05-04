package androidx.room.driver;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.driver.SupportSQLiteStatement;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class SupportSQLiteStatement implements SQLiteStatement {

    @k
    public static final Companion Companion = new Companion(null);

    /* renamed from: db, reason: collision with root package name */
    @k
    private final SupportSQLiteDatabase f5335db;
    private boolean isClosed;

    @k
    private final String sql;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private final boolean isRowStatement(String str) {
            String obj = k0.b6(str).toString();
            if (obj.length() < 3) {
                return false;
            }
            String substring = obj.substring(0, 3);
            g0.o(substring, "substring(...)");
            String upperCase = substring.toUpperCase(Locale.ROOT);
            g0.o(upperCase, "toUpperCase(...)");
            int hashCode = upperCase.hashCode();
            if (hashCode != 79487) {
                if (hashCode != 81978) {
                    if (hashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        @k
        public final SupportSQLiteStatement create(@k SupportSQLiteDatabase db2, @k String sql) {
            g0.p(db2, "db");
            g0.p(sql, "sql");
            return isRowStatement(sql) ? new SupportAndroidSQLiteStatement(db2, sql) : new SupportOtherAndroidSQLiteStatement(db2, sql);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SupportAndroidSQLiteStatement extends SupportSQLiteStatement {

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
        public SupportAndroidSQLiteStatement(@k SupportSQLiteDatabase db2, @k String sql) {
            super(db2, sql, null);
            g0.p(db2, "db");
            g0.p(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
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
                this.cursor = getDb().query(new SupportSQLiteQuery() { // from class: androidx.room.driver.SupportSQLiteStatement$SupportAndroidSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public void bindTo(SupportSQLiteProgram statement) {
                        int[] iArr;
                        int[] iArr2;
                        long[] jArr;
                        double[] dArr;
                        String[] strArr;
                        byte[][] bArr;
                        g0.p(statement, "statement");
                        iArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.bindingTypes;
                        int length = iArr.length;
                        for (int i11 = 1; i11 < length; i11++) {
                            iArr2 = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.bindingTypes;
                            int i12 = iArr2[i11];
                            if (i12 == 1) {
                                jArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.longBindings;
                                statement.bindLong(i11, jArr[i11]);
                            } else if (i12 == 2) {
                                dArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.doubleBindings;
                                statement.bindDouble(i11, dArr[i11]);
                            } else if (i12 == 3) {
                                strArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.stringBindings;
                                String str = strArr[i11];
                                g0.m(str);
                                statement.bindString(i11, str);
                            } else if (i12 == 4) {
                                bArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.blobBindings;
                                byte[] bArr2 = bArr[i11];
                                g0.m(bArr2);
                                statement.bindBlob(i11, bArr2);
                            } else if (i12 == 5) {
                                statement.bindNull(i11);
                            }
                        }
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public int getArgCount() {
                        int[] iArr;
                        iArr = SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.bindingTypes;
                        return iArr.length;
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public String getSql() {
                        return SupportSQLiteStatement.SupportAndroidSQLiteStatement.this.getSql();
                    }
                });
            }
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
                mo5625clearBindings();
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

    public /* synthetic */ SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, v vVar) {
        this(supportSQLiteDatabase, str);
    }

    @k
    public final SupportSQLiteDatabase getDb() {
        return this.f5335db;
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

    private SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.f5335db = supportSQLiteDatabase;
        this.sql = str;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SupportOtherAndroidSQLiteStatement extends SupportSQLiteStatement {

        @k
        private final androidx.sqlite.db.SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportOtherAndroidSQLiteStatement(@k SupportSQLiteDatabase db2, @k String sql) {
            super(db2, sql, null);
            g0.p(db2, "db");
            g0.p(sql, "sql");
            this.delegate = db2.compileStatement(sql);
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
