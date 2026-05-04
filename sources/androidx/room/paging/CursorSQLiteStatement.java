package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class CursorSQLiteStatement implements SQLiteStatement {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final Cursor cursor;

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

    public CursorSQLiteStatement(@k Cursor cursor) {
        g0.p(cursor, "cursor");
        this.cursor = cursor;
    }

    @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
    public void close() {
        this.cursor.close();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public byte[] getBlob(int i11) {
        byte[] blob = this.cursor.getBlob(i11);
        g0.o(blob, "getBlob(...)");
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnCount() {
        return this.cursor.getColumnCount();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public String getColumnName(int i11) {
        String columnName = this.cursor.getColumnName(i11);
        g0.o(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public int getColumnType(int i11) {
        return Companion.getDataType(this.cursor, i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public double getDouble(int i11) {
        return this.cursor.getDouble(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public long getLong(int i11) {
        return this.cursor.getLong(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    public String getText(int i11) {
        String string = this.cursor.getString(i11);
        g0.o(string, "getString(...)");
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean isNull(int i11) {
        return this.cursor.isNull(i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public void reset() {
        this.cursor.moveToPosition(-1);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean step() {
        return this.cursor.moveToNext();
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: bindBlob, reason: merged with bridge method [inline-methods] */
    public Void mo5620bindBlob(int i11, @k byte[] value) {
        g0.p(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: bindDouble, reason: merged with bridge method [inline-methods] */
    public Void mo5621bindDouble(int i11, double d11) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: bindLong, reason: merged with bridge method [inline-methods] */
    public Void mo5622bindLong(int i11, long j11) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: bindNull, reason: merged with bridge method [inline-methods] */
    public Void mo5623bindNull(int i11) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: bindText, reason: merged with bridge method [inline-methods] */
    public Void mo5624bindText(int i11, @k String value) {
        g0.p(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.SQLiteStatement
    @k
    /* renamed from: clearBindings, reason: merged with bridge method [inline-methods] */
    public Void mo5625clearBindings() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }
}
