package androidx.room.util;

import a00.r0;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/SQLiteStatementUtil__StatementUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtilKt {
    public static final int columnIndexOfCommon(@k SQLiteStatement sQLiteStatement, @k String name) {
        g0.p(sQLiteStatement, "<this>");
        g0.p(name, "name");
        if (sQLiteStatement instanceof MappedColumnsSQLiteStatementWrapper) {
            return ((MappedColumnsSQLiteStatementWrapper) sQLiteStatement).getColumnIndex(name);
        }
        int columnCount = sQLiteStatement.getColumnCount();
        for (int i11 = 0; i11 < columnCount; i11++) {
            if (g0.g(name, sQLiteStatement.getColumnName(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndex(@k SQLiteStatement stmt, @k String name) {
        g0.p(stmt, "stmt");
        g0.p(name, "name");
        return SQLiteStatementUtil.columnIndexOf(stmt, name);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int getColumnIndexOrThrow(@k SQLiteStatement stmt, @k String name) {
        g0.p(stmt, "stmt");
        g0.p(name, "name");
        int columnIndexOf = SQLiteStatementUtil.columnIndexOf(stmt, name);
        if (columnIndexOf >= 0) {
            return columnIndexOf;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i11 = 0; i11 < columnCount; i11++) {
            arrayList.add(stmt.getColumnName(i11));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + r0.r3(arrayList, null, null, null, 0, null, null, 63, null) + b.f69930l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @k
    public static final SQLiteStatement wrapMappedColumns(@k SQLiteStatement statement, @k String[] columnNames, @k int[] mapping) {
        g0.p(statement, "statement");
        g0.p(columnNames, "columnNames");
        g0.p(mapping, "mapping");
        return new MappedColumnsSQLiteStatementWrapper(statement, columnNames, mapping);
    }
}
