package androidx.room.util;

import a00.w1;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;
import yz.n;
import zz.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public final Map<String, Column> columns;

    @g
    @k
    public final Set<ForeignKey> foreignKeys;

    @l
    @g
    public final Set<Index> indices;

    @g
    @k
    public final String name;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @n(message = "No longer used by generated code.")
        @k
        public final TableInfo read(@k SupportSQLiteDatabase database, @k String tableName) {
            g0.p(database, "database");
            g0.p(tableName, "tableName");
            return read(new SupportSQLiteConnection(database), tableName);
        }

        private Companion() {
        }

        @o
        @k
        public final TableInfo read(@k SQLiteConnection connection, @k String tableName) {
            g0.p(connection, "connection");
            g0.p(tableName, "tableName");
            return SchemaInfoUtilKt.readTableInfo(connection, tableName);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface CreatedFrom {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ForeignKey {

        @g
        @k
        public final List<String> columnNames;

        @g
        @k
        public final String onDelete;

        @g
        @k
        public final String onUpdate;

        @g
        @k
        public final List<String> referenceColumnNames;

        @g
        @k
        public final String referenceTable;

        public ForeignKey(@k String referenceTable, @k String onDelete, @k String onUpdate, @k List<String> columnNames, @k List<String> referenceColumnNames) {
            g0.p(referenceTable, "referenceTable");
            g0.p(onDelete, "onDelete");
            g0.p(onUpdate, "onUpdate");
            g0.p(columnNames, "columnNames");
            g0.p(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@l Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        @k
        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }
    }

    public TableInfo(@k String name, @k Map<String, Column> columns, @k Set<ForeignKey> foreignKeys, @l Set<Index> set) {
        g0.p(name, "name");
        g0.p(columns, "columns");
        g0.p(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    @o
    @k
    public static final TableInfo read(@k SQLiteConnection sQLiteConnection, @k String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(@l Object obj) {
        return TableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return TableInfoKt.hashCodeCommon(this);
    }

    @k
    public String toString() {
        return TableInfoKt.toStringCommon(this);
    }

    @o
    @n(message = "No longer used by generated code.")
    @k
    public static final TableInfo read(@k SupportSQLiteDatabase supportSQLiteDatabase, @k String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTableInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.android.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Index {

        @k
        public static final Companion Companion = new Companion(null);

        @k
        public static final String DEFAULT_PREFIX = "index_";

        @g
        @k
        public final List<String> columns;

        @g
        @k
        public final String name;

        @g
        @k
        public List<String> orders;

        @g
        public final boolean unique;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(@k String name, boolean z11, @k List<String> columns, @k List<String> orders) {
            g0.p(name, "name");
            g0.p(columns, "columns");
            g0.p(orders, "orders");
            this.name = name;
            this.unique = z11;
            this.columns = columns;
            this.orders = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    list.add("ASC");
                }
            }
            this.orders = (List) list;
        }

        public boolean equals(@l Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        @k
        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @yz.n(message = "No longer used by generated code.")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Index(@m80.k java.lang.String r5, boolean r6, @m80.k java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.g0.p(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L1e
                java.lang.String r3 = "ASC"
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Index.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i11, v vVar) {
        this(str, map, set, (i11 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @n(message = "No longer used by generated code.")
    public TableInfo(@k String name, @k Map<String, Column> columns, @k Set<ForeignKey> foreignKeys) {
        this(name, columns, foreignKeys, w1.k());
        g0.p(name, "name");
        g0.p(columns, "columns");
        g0.p(foreignKeys, "foreignKeys");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Column {

        @k
        public static final Companion Companion = new Companion(null);

        @g
        public final int affinity;

        @g
        public final int createdFrom;

        @l
        @g
        public final String defaultValue;

        @g
        @k
        public final String name;

        @g
        public final boolean notNull;

        @g
        public final int primaryKeyPosition;

        @g
        @k
        public final String type;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @o
            public final boolean defaultValueEquals(@k String current, @l String str) {
                g0.p(current, "current");
                return TableInfoKt.defaultValueEqualsCommon(current, str);
            }

            private Companion() {
            }
        }

        public Column(@k String name, @k String type, boolean z11, int i11, @l String str, int i12) {
            g0.p(name, "name");
            g0.p(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z11;
            this.primaryKeyPosition = i11;
            this.defaultValue = str;
            this.createdFrom = i12;
            this.affinity = SchemaInfoUtilKt.findAffinity(type);
        }

        @o
        public static final boolean defaultValueEquals(@k String str, @l String str2) {
            return Companion.defaultValueEquals(str, str2);
        }

        public boolean equals(@l Object obj) {
            return TableInfoKt.equalsCommon(this, obj);
        }

        public int hashCode() {
            return TableInfoKt.hashCodeCommon(this);
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        @k
        public String toString() {
            return TableInfoKt.toStringCommon(this);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @n(message = "No longer used by generated code.")
        public Column(@k String name, @k String type, boolean z11, int i11) {
            this(name, type, z11, i11, null, 0);
            g0.p(name, "name");
            g0.p(type, "type");
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }
    }
}
