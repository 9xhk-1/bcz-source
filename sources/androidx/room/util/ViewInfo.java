package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class ViewInfo {

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public final String name;

    @l
    @g
    public final String sql;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @n(message = "No longer used by generated code.")
        @k
        public final ViewInfo read(@k SupportSQLiteDatabase database, @k String viewName) {
            g0.p(database, "database");
            g0.p(viewName, "viewName");
            return read(new SupportSQLiteConnection(database), viewName);
        }

        private Companion() {
        }

        @o
        @k
        public final ViewInfo read(@k SQLiteConnection connection, @k String viewName) {
            g0.p(connection, "connection");
            g0.p(viewName, "viewName");
            return SchemaInfoUtilKt.readViewInfo(connection, viewName);
        }
    }

    public ViewInfo(@k String name, @l String str) {
        g0.p(name, "name");
        this.name = name;
        this.sql = str;
    }

    @o
    @k
    public static final ViewInfo read(@k SQLiteConnection sQLiteConnection, @k String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(@l Object obj) {
        return ViewInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return ViewInfoKt.hashCodeCommon(this);
    }

    @k
    public String toString() {
        return ViewInfoKt.toStringCommon(this);
    }

    @o
    @n(message = "No longer used by generated code.")
    @k
    public static final ViewInfo read(@k SupportSQLiteDatabase supportSQLiteDatabase, @k String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }
}
