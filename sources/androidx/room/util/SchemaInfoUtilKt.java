package androidx.room.util;

import a00.i0;
import a00.k1;
import a00.l1;
import a00.m;
import a00.m0;
import a00.r0;
import a00.v1;
import a00.w1;
import androidx.room.ColumnInfo;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.tencent.open.SocialConstants;
import e00.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import ma.b;
import u00.a;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSchemaInfoUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,378:1\n774#2:379\n865#2,2:380\n1863#2,2:382\n1053#2:384\n1557#2:385\n1628#2,3:386\n1053#2:389\n1557#2:390\n1628#2,3:391\n774#2:420\n865#2:421\n866#2:424\n1188#3,2:394\n1190#3:419\n108#4:396\n80#4,22:397\n12567#5,2:422\n*S KotlinDebug\n*F\n+ 1 SchemaInfoUtil.kt\nandroidx/room/util/SchemaInfoUtilKt\n*L\n94#1:379\n94#1:380,2\n95#1:382,2\n256#1:384\n256#1:385\n256#1:386,3\n257#1:389\n257#1:390\n257#1:391,3\n360#1:420\n360#1:421\n360#1:424\n328#1:394,2\n328#1:419\n348#1:396\n348#1:397,22\n360#1:422,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SchemaInfoUtilKt {

    @k
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @ColumnInfo.SQLiteTypeAffinity
    public static final int findAffinity(@l String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        g0.o(upperCase, "toUpperCase(...)");
        if (k0.n3(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (k0.n3(upperCase, "CHAR", false, 2, null) || k0.n3(upperCase, "CLOB", false, 2, null) || k0.n3(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (k0.n3(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (k0.n3(upperCase, "REAL", false, 2, null) || k0.n3(upperCase, "FLOA", false, 2, null) || k0.n3(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    @k
    public static final Set<String> parseFtsOptions(@k String createStatement) {
        Character ch2;
        g0.p(createStatement, "createStatement");
        if (createStatement.length() == 0) {
            return w1.k();
        }
        String substring = createStatement.substring(k0.I3(createStatement, '(', 0, false, 6, null) + 1, k0.X3(createStatement, ')', 0, false, 6, null));
        g0.o(substring, "substring(...)");
        ArrayList arrayList = new ArrayList();
        m mVar = new m();
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < substring.length()) {
            char charAt = substring.charAt(i12);
            int i14 = i13 + 1;
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!mVar.isEmpty() && (ch2 = (Character) mVar.h()) != null && ch2.charValue() == '[') {
                            m0.Q0(mVar);
                        }
                    } else if (mVar.isEmpty()) {
                        mVar.addFirst(Character.valueOf(charAt));
                    }
                } else if (mVar.isEmpty()) {
                    String substring2 = substring.substring(i11 + 1, i13);
                    g0.o(substring2, "substring(...)");
                    int length = substring2.length() - 1;
                    int i15 = 0;
                    boolean z11 = false;
                    while (i15 <= length) {
                        boolean z12 = g0.t(substring2.charAt(!z11 ? i15 : length), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            }
                            length--;
                        } else if (z12) {
                            i15++;
                        } else {
                            z11 = true;
                        }
                    }
                    arrayList.add(substring2.subSequence(i15, length + 1).toString());
                    i11 = i13;
                }
                i12++;
                i13 = i14;
            }
            if (mVar.isEmpty()) {
                mVar.addFirst(Character.valueOf(charAt));
            } else {
                Character ch3 = (Character) mVar.h();
                if (ch3 != null && ch3.charValue() == charAt) {
                    m0.Q0(mVar);
                }
            }
            i12++;
            i13 = i14;
        }
        String substring3 = substring.substring(i11 + 1);
        g0.o(substring3, "substring(...)");
        arrayList.add(k0.b6(substring3).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            String[] strArr = FTS_OPTIONS;
            int length2 = strArr.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    break;
                }
                if (f0.J2(str, strArr[i16], false, 2, null)) {
                    arrayList2.add(obj);
                    break;
                }
                i16++;
            }
        }
        return r0.f6(arrayList2);
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA table_info(`" + str + "`)");
        try {
            if (!prepare.step()) {
                Map<String, TableInfo.Column> z11 = l1.z();
                a.c(prepare, null);
                return z11;
            }
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "name");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "type");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "notnull");
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, "pk");
            int columnIndexOf5 = SQLiteStatementUtil.columnIndexOf(prepare, "dflt_value");
            Map g11 = k1.g();
            do {
                String text = prepare.getText(columnIndexOf);
                g11.put(text, new TableInfo.Column(text, prepare.getText(columnIndexOf2), prepare.getLong(columnIndexOf3) != 0, (int) prepare.getLong(columnIndexOf4), prepare.isNull(columnIndexOf5) ? null : prepare.getText(columnIndexOf5), 2));
            } while (prepare.step());
            Map<String, TableInfo.Column> d11 = k1.d(g11);
            a.c(prepare, null);
            return d11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.c(prepare, th2);
                throw th3;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int columnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
        int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, b.f72887a);
        int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "from");
        int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "to");
        List j11 = a00.g0.j();
        while (sQLiteStatement.step()) {
            j11.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(columnIndexOf), (int) sQLiteStatement.getLong(columnIndexOf2), sQLiteStatement.getText(columnIndexOf3), sQLiteStatement.getText(columnIndexOf4)));
        }
        return r0.v5(a00.g0.b(j11));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "id");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, b.f72887a);
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "table");
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, "on_delete");
            int columnIndexOf5 = SQLiteStatementUtil.columnIndexOf(prepare, "on_update");
            List<ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(prepare);
            prepare.reset();
            Set d11 = v1.d();
            while (prepare.step()) {
                if (prepare.getLong(columnIndexOf2) == 0) {
                    int i11 = (int) prepare.getLong(columnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i11) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    d11.add(new TableInfo.ForeignKey(prepare.getText(columnIndexOf3), prepare.getText(columnIndexOf4), prepare.getText(columnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> a11 = v1.a(d11);
            a.c(prepare, null);
            return a11;
        } finally {
        }
    }

    @k
    public static final Set<String> readFtsColumns(@k SQLiteConnection connection, @k String tableName) {
        g0.p(connection, "connection");
        g0.p(tableName, "tableName");
        Set d11 = v1.d();
        SQLiteStatement prepare = connection.prepare("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (prepare.step()) {
                int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "name");
                do {
                    d11.add(prepare.getText(columnIndexOf));
                } while (prepare.step());
            }
            g2 g2Var = g2.f100423a;
            a.c(prepare, null);
            return v1.a(d11);
        } finally {
        }
    }

    @k
    public static final Set<String> readFtsOptions(@k SQLiteConnection connection, @k String tableName) {
        g0.p(connection, "connection");
        g0.p(tableName, "tableName");
        SQLiteStatement prepare = connection.prepare("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
        try {
            String text = prepare.step() ? prepare.getText(SQLiteStatementUtil.columnIndexOf(prepare, "sql")) : "";
            a.c(prepare, null);
            return parseFtsOptions(text);
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z11) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "seqno");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "cid");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "name");
            int columnIndexOf4 = SQLiteStatementUtil.columnIndexOf(prepare, SocialConstants.PARAM_APP_DESC);
            if (columnIndexOf != -1 && columnIndexOf2 != -1 && columnIndexOf3 != -1 && columnIndexOf4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (prepare.step()) {
                    if (((int) prepare.getLong(columnIndexOf2)) >= 0) {
                        int i11 = (int) prepare.getLong(columnIndexOf);
                        String text = prepare.getText(columnIndexOf3);
                        String str2 = prepare.getLong(columnIndexOf4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i11), text);
                        linkedHashMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                List z52 = r0.z5(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return g.l((Integer) ((Map.Entry) t11).getKey(), (Integer) ((Map.Entry) t12).getKey());
                    }
                });
                ArrayList arrayList = new ArrayList(i0.d0(z52, 10));
                Iterator it = z52.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List a62 = r0.a6(arrayList);
                List z53 = r0.z5(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return g.l((Integer) ((Map.Entry) t11).getKey(), (Integer) ((Map.Entry) t12).getKey());
                    }
                });
                ArrayList arrayList2 = new ArrayList(i0.d0(z53, 10));
                Iterator it2 = z53.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                TableInfo.Index index = new TableInfo.Index(str, z11, a62, r0.a6(arrayList2));
                a.c(prepare, null);
                return index;
            }
            a.c(prepare, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndexOf = SQLiteStatementUtil.columnIndexOf(prepare, "name");
            int columnIndexOf2 = SQLiteStatementUtil.columnIndexOf(prepare, "origin");
            int columnIndexOf3 = SQLiteStatementUtil.columnIndexOf(prepare, "unique");
            if (columnIndexOf != -1 && columnIndexOf2 != -1 && columnIndexOf3 != -1) {
                Set d11 = v1.d();
                while (prepare.step()) {
                    if (g0.g("c", prepare.getText(columnIndexOf2))) {
                        TableInfo.Index readIndex = readIndex(sQLiteConnection, prepare.getText(columnIndexOf), prepare.getLong(columnIndexOf3) == 1);
                        if (readIndex == null) {
                            a.c(prepare, null);
                            return null;
                        }
                        d11.add(readIndex);
                    }
                }
                Set<TableInfo.Index> a11 = v1.a(d11);
                a.c(prepare, null);
                return a11;
            }
            a.c(prepare, null);
            return null;
        } finally {
        }
    }

    @k
    public static final TableInfo readTableInfo(@k SQLiteConnection connection, @k String tableName) {
        g0.p(connection, "connection");
        g0.p(tableName, "tableName");
        return new TableInfo(tableName, readColumns(connection, tableName), readForeignKeys(connection, tableName), readIndices(connection, tableName));
    }

    @k
    public static final ViewInfo readViewInfo(@k SQLiteConnection connection, @k String viewName) {
        g0.p(connection, "connection");
        g0.p(viewName, "viewName");
        SQLiteStatement prepare = connection.prepare("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + '\'');
        try {
            ViewInfo viewInfo = prepare.step() ? new ViewInfo(prepare.getText(0), prepare.getText(1)) : new ViewInfo(viewName, null);
            a.c(prepare, null);
            return viewInfo;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.c(prepare, th2);
                throw th3;
            }
        }
    }
}
