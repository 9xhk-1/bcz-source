package androidx.room.util;

import android.os.Build;
import androidx.sqlite.SQLiteStatement;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(@k SQLiteStatement sQLiteStatement, @k String name) {
        g0.p(sQLiteStatement, "<this>");
        g0.p(name, "name");
        int columnIndexOfCommon = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, name);
        if (columnIndexOfCommon >= 0) {
            return columnIndexOfCommon;
        }
        int columnIndexOfCommon2 = SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, '`' + name + '`');
        return columnIndexOfCommon2 >= 0 ? columnIndexOfCommon2 : findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(sQLiteStatement, name);
    }

    private static final int findColumnIndexBySuffix$SQLiteStatementUtil__StatementUtil_androidKt(SQLiteStatement sQLiteStatement, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = sQLiteStatement.getColumnCount();
            String str2 = '.' + str;
            String str3 = '.' + str + '`';
            for (int i11 = 0; i11 < columnCount; i11++) {
                String columnName = sQLiteStatement.getColumnName(i11);
                if (columnName.length() >= str.length() + 2 && (f0.b2(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && f0.b2(columnName, str3, false, 2, null)))) {
                    return i11;
                }
            }
        }
        return -1;
    }
}
