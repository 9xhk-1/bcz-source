package androidx.room.util;

import a00.h0;
import a00.r0;
import androidx.room.util.TableInfo;
import e00.g;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import u30.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,397:1\n1053#2:398\n1053#2:399\n1188#3,3:400\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n192#1:398\n194#1:399\n261#1:400,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            int i14 = i13 + 1;
            if (i13 == 0 && charAt != '(') {
                return false;
            }
            if (charAt == '(') {
                i12++;
            } else if (charAt == ')' && i12 - 1 == 0 && i13 != str.length() - 1) {
                return false;
            }
            i11++;
            i13 = i14;
        }
        return i12 == 0;
    }

    public static final boolean defaultValueEqualsCommon(@k String current, @l String str) {
        g0.p(current, "current");
        if (g0.g(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String substring = current.substring(1, current.length() - 1);
        g0.o(substring, "substring(...)");
        return g0.g(k0.b6(substring).toString(), str);
    }

    public static final boolean equalsCommon(@k TableInfo tableInfo, @l Object obj) {
        Set<TableInfo.Index> set;
        g0.p(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!g0.g(tableInfo.name, tableInfo2.name) || !g0.g(tableInfo.columns, tableInfo2.columns) || !g0.g(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return g0.g(set2, set);
    }

    @k
    public static final String formatString(@k Collection<?> collection) {
        g0.p(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return y.o(r0.r3(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int hashCodeCommon(@k TableInfo tableInfo) {
        g0.p(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    private static final void joinToStringEndWithIndent(Collection<?> collection) {
        y.o(r0.r3(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        y.o(" }", null, 1, null);
    }

    private static final void joinToStringMiddleWithIndent(Collection<?> collection) {
        y.o(r0.r3(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        y.o("},", null, 1, null);
    }

    @k
    public static final String toStringCommon(@k TableInfo tableInfo) {
        List J;
        g0.p(tableInfo, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(tableInfo.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(formatString(r0.z5(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(((TableInfo.Column) t11).name, ((TableInfo.Column) t12).name);
            }
        })));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(formatString(tableInfo.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (J = r0.z5(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(((TableInfo.Index) t11).name, ((TableInfo.Index) t12).name);
            }
        })) == null) {
            J = h0.J();
        }
        sb2.append(formatString(J));
        sb2.append("\n            |}\n        ");
        return y.x(sb2.toString(), null, 1, null);
    }

    public static final int hashCodeCommon(@k TableInfo.Column column) {
        g0.p(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean equalsCommon(@k TableInfo.Column column, @l Object obj) {
        g0.p(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !g0.g(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !defaultValueEqualsCommon(str2, str)) {
            return false;
        }
        int i11 = column.createdFrom;
        return (i11 == 0 || i11 != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
    }

    public static final int hashCodeCommon(@k TableInfo.ForeignKey foreignKey) {
        g0.p(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final int hashCodeCommon(@k TableInfo.Index index) {
        g0.p(index, "<this>");
        return ((((((f0.J2(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final boolean equalsCommon(@k TableInfo.ForeignKey foreignKey, @l Object obj) {
        g0.p(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (g0.g(foreignKey.referenceTable, foreignKey2.referenceTable) && g0.g(foreignKey.onDelete, foreignKey2.onDelete) && g0.g(foreignKey.onUpdate, foreignKey2.onUpdate) && g0.g(foreignKey.columnNames, foreignKey2.columnNames)) {
            return g0.g(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    @k
    public static final String toStringCommon(@k TableInfo.Column column) {
        g0.p(column, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(column.name);
        sb2.append("',\n            |   type = '");
        sb2.append(column.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(column.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(column.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(column.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return y.o(y.x(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(@k TableInfo.Index index, @l Object obj) {
        g0.p(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !g0.g(index.columns, index2.columns) || !g0.g(index.orders, index2.orders)) {
            return false;
        }
        if (f0.J2(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null)) {
            return f0.J2(index2.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null);
        }
        return g0.g(index.name, index2.name);
    }

    @k
    public static final String toStringCommon(@k TableInfo.ForeignKey foreignKey) {
        g0.p(foreignKey, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(foreignKey.referenceTable);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(foreignKey.onDelete);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(foreignKey.onUpdate);
        sb2.append("',\n            |   columnNames = {");
        joinToStringMiddleWithIndent(r0.v5(foreignKey.columnNames));
        g2 g2Var = g2.f100423a;
        sb2.append(g2Var);
        sb2.append("\n            |   referenceColumnNames = {");
        joinToStringEndWithIndent(r0.v5(foreignKey.referenceColumnNames));
        sb2.append(g2Var);
        sb2.append("\n            |}\n        ");
        return y.o(y.x(sb2.toString(), null, 1, null), null, 1, null);
    }

    @k
    public static final String toStringCommon(@k TableInfo.Index index) {
        g0.p(index, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Index {\n            |   name = '");
        sb2.append(index.name);
        sb2.append("',\n            |   unique = '");
        sb2.append(index.unique);
        sb2.append("',\n            |   columns = {");
        joinToStringMiddleWithIndent(index.columns);
        g2 g2Var = g2.f100423a;
        sb2.append(g2Var);
        sb2.append("\n            |   orders = {");
        joinToStringEndWithIndent(index.orders);
        sb2.append(g2Var);
        sb2.append("\n            |}\n        ");
        return y.o(y.x(sb2.toString(), null, 1, null), null, 1, null);
    }
}
