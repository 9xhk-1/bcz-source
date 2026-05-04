package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import m80.k;

/* loaded from: classes3.dex */
public final class SQLiteStatementUtil {
    public static final int columnIndexOf(@k SQLiteStatement sQLiteStatement, @k String str) {
        return SQLiteStatementUtil__StatementUtil_androidKt.columnIndexOf(sQLiteStatement, str);
    }

    public static final int columnIndexOfCommon(@k SQLiteStatement sQLiteStatement, @k String str) {
        return SQLiteStatementUtil__StatementUtilKt.columnIndexOfCommon(sQLiteStatement, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndex(@k SQLiteStatement sQLiteStatement, @k String str) {
        return SQLiteStatementUtil__StatementUtilKt.getColumnIndex(sQLiteStatement, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndexOrThrow(@k SQLiteStatement sQLiteStatement, @k String str) {
        return SQLiteStatementUtil__StatementUtilKt.getColumnIndexOrThrow(sQLiteStatement, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final SQLiteStatement wrapMappedColumns(@k SQLiteStatement sQLiteStatement, @k String[] strArr, @k int[] iArr) {
        return SQLiteStatementUtil__StatementUtilKt.wrapMappedColumns(sQLiteStatement, strArr, iArr);
    }
}
