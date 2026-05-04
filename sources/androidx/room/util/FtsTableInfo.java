package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class FtsTableInfo {

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public final Set<String> columns;

    @g
    @k
    public final String name;

    @g
    @k
    public final Set<String> options;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final FtsTableInfo read(@k SupportSQLiteDatabase database, @k String tableName) {
            g0.p(database, "database");
            g0.p(tableName, "tableName");
            return read(new SupportSQLiteConnection(database), tableName);
        }

        private Companion() {
        }

        @o
        @k
        public final FtsTableInfo read(@k SQLiteConnection connection, @k String tableName) {
            g0.p(connection, "connection");
            g0.p(tableName, "tableName");
            return new FtsTableInfo(tableName, SchemaInfoUtilKt.readFtsColumns(connection, tableName), SchemaInfoUtilKt.readFtsOptions(connection, tableName));
        }
    }

    public FtsTableInfo(@k String name, @k Set<String> columns, @k Set<String> options) {
        g0.p(name, "name");
        g0.p(columns, "columns");
        g0.p(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @o
    @k
    public static final FtsTableInfo read(@k SQLiteConnection sQLiteConnection, @k String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(@l Object obj) {
        return FtsTableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return FtsTableInfoKt.hashCodeCommon(this);
    }

    @k
    public String toString() {
        return FtsTableInfoKt.toStringCommon(this);
    }

    @o
    @k
    public static final FtsTableInfo read(@k SupportSQLiteDatabase supportSQLiteDatabase, @k String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(@k String name, @k Set<String> columns, @k String createSql) {
        this(name, columns, SchemaInfoUtilKt.parseFtsOptions(createSql));
        g0.p(name, "name");
        g0.p(columns, "columns");
        g0.p(createSql, "createSql");
    }
}
