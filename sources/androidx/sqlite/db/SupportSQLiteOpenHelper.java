package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u30.f0;
import w00.g;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,366:1\n1#2:367\n1863#3,2:368\n108#4:370\n80#4,22:371\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n220#1:368,2\n228#1:370\n228#1:371,22\n*E\n"})
    public static abstract class Callback {

        @k
        public static final Companion Companion = new Companion(null);

        @k
        private static final String TAG = "SupportSQLite";

        @g
        public final int version;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            private Companion() {
            }
        }

        public Callback(int i11) {
            this.version = i11;
        }

        private final void deleteDatabaseFile(String str) {
            if (f0.c2(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = g0.t(str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e11) {
                Log.w(TAG, "delete failed: ", e11);
            }
        }

        public void onConfigure(@k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public void onCorruption(@k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String path = db2.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db2.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object second = ((Pair) it.next()).second;
                        g0.o(second, "second");
                        deleteDatabaseFile((String) second);
                    }
                } else {
                    String path2 = db2.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                    }
                }
            }
        }

        public abstract void onCreate(@k SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(@k SupportSQLiteDatabase db2, int i11, int i12) {
            g0.p(db2, "db");
            throw new SQLiteException("Can't downgrade database from version " + i11 + " to " + i12);
        }

        public void onOpen(@k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public abstract void onUpgrade(@k SupportSQLiteDatabase supportSQLiteDatabase, int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {
        @k
        SupportSQLiteOpenHelper create(@k Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @l
    String getDatabaseName();

    @k
    SupportSQLiteDatabase getReadableDatabase();

    @k
    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Configuration {

        @k
        public static final Companion Companion = new Companion(null);

        @g
        public final boolean allowDataLossOnRecovery;

        @g
        @k
        public final Callback callback;

        @g
        @k
        public final Context context;

        @l
        @g
        public final String name;

        @g
        public final boolean useNoBackupDirectory;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nSupportSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,366:1\n1#2:367\n*E\n"})
        public static class Builder {
            private boolean allowDataLossOnRecovery;

            @l
            private Callback callback;

            @k
            private final Context context;

            @l
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(@k Context context) {
                g0.p(context, "context");
                this.context = context;
            }

            @k
            public Builder allowDataLossOnRecovery(boolean z11) {
                this.allowDataLossOnRecovery = z11;
                return this;
            }

            @k
            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }

            @k
            public Builder callback(@k Callback callback) {
                g0.p(callback, "callback");
                this.callback = callback;
                return this;
            }

            @k
            public Builder name(@l String str) {
                this.name = str;
                return this;
            }

            @k
            public Builder noBackupDirectory(boolean z11) {
                this.useNoBackupDirectory = z11;
                return this;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @o
            @k
            public final Builder builder(@k Context context) {
                g0.p(context, "context");
                return new Builder(context);
            }

            private Companion() {
            }
        }

        public Configuration(@k Context context, @l String str, @k Callback callback, boolean z11, boolean z12) {
            g0.p(context, "context");
            g0.p(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z11;
            this.allowDataLossOnRecovery = z12;
        }

        @o
        @k
        public static final Builder builder(@k Context context) {
            return Companion.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z11, boolean z12, int i11, v vVar) {
            this(context, str, callback, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
        }
    }
}
