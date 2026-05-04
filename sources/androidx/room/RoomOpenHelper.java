package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoomOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,278:1\n1863#2,2:279\n1863#2,2:281\n1863#2,2:283\n1863#2,2:285\n146#3:287\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper\n*L\n81#1:279,2\n90#1:281,2\n112#1:283,2\n135#1:285,2\n143#1:287\n*E\n"})
@yz.n(message = "Replaced by RoomConnectionManager and no longer used in generated code.")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.l
    private final List<RoomDatabase.Callback> callbacks;

    @m80.l
    private DatabaseConfiguration configuration;

    @m80.k
    private final Delegate delegate;

    @m80.k
    private final String identityHash;

    @m80.k
    private final String legacyHash;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRoomOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.android.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n146#2:279\n146#2:280\n146#2:281\n1863#3,2:282\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.android.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n242#1:279\n249#1:280\n256#1:281\n268#1:282,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void dropAllTables$room_runtime_release(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            Cursor query = db2.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = query;
                List j11 = a00.g0.j();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    g0.m(string);
                    if (!f0.J2(string, "sqlite_", false, 2, null) && !g0.g(string, "android_metadata")) {
                        j11.add(h1.a(string, Boolean.valueOf(g0.g(cursor.getString(1), "view"))));
                    }
                }
                List<Pair> b11 = a00.g0.b(j11);
                r00.b.a(query, null);
                for (Pair pair : b11) {
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        db2.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        db2.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            Cursor query = db2.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = query;
                boolean z11 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z11 = true;
                    }
                }
                r00.b.a(query, null);
                return z11;
            } finally {
            }
        }

        public final boolean hasRoomMasterTable$room_runtime_release(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            Cursor query = db2.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = query;
                boolean z11 = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z11 = true;
                    }
                }
                r00.b.a(query, null);
                return z11;
            } finally {
            }
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(message = "Replaced by OpenDelegate  and no longer used in generated code.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class Delegate {

        @w00.g
        public final int version;

        public Delegate(int i11) {
            this.version = i11;
        }

        public abstract void createAllTables(@m80.k SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(@m80.k SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(@m80.k SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(@m80.k SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public void onPreMigrate(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        @m80.k
        public ValidationResult onValidateSchema(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            validateMigration(db2);
            return new ValidationResult(true, null);
        }

        @yz.n(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        public void validateMigration(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(message = "Replaced by OpenDelegate.ValidationResult and no longer used in generated code.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ValidationResult {

        @m80.l
        @w00.g
        public final String expectedFoundMsg;

        @w00.g
        public final boolean isValid;

        public ValidationResult(boolean z11, @m80.l String str) {
            this.isValid = z11;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@m80.k DatabaseConfiguration configuration, @m80.k Delegate delegate, @m80.k String identityHash, @m80.k String legacyHash) {
        super(delegate.version);
        g0.p(configuration, "configuration");
        g0.p(delegate, "delegate");
        g0.p(identityHash, "identityHash");
        g0.p(legacyHash, "legacyHash");
        this.callbacks = configuration.callbacks;
        this.configuration = configuration;
        this.delegate = delegate;
        this.identityHash = identityHash;
        this.legacyHash = legacyHash;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (!Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (onValidateSchema.isValid) {
                this.delegate.onPostMigrate(supportSQLiteDatabase);
                updateIdentity(supportSQLiteDatabase);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        Cursor query = supportSQLiteDatabase.query(new SimpleSQLiteQuery(RoomMasterTable.READ_QUERY));
        try {
            Cursor cursor = query;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            r00.b.a(query, null);
            if (g0.g(this.identityHash, string) || g0.g(this.legacyHash, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                r00.b.a(query, th2);
                throw th3;
            }
        }
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(@m80.k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        super.onConfigure(db2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(@m80.k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        boolean hasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(db2);
        this.delegate.createAllTables(db2);
        if (!hasEmptySchema$room_runtime_release) {
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db2);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(db2);
        this.delegate.onCreate(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onCreate(db2);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(@m80.k SupportSQLiteDatabase db2, int i11, int i12) {
        g0.p(db2, "db");
        onUpgrade(db2, i11, i12);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(@m80.k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        super.onOpen(db2);
        checkIdentity(db2);
        this.delegate.onOpen(db2);
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).onOpen(db2);
            }
        }
        this.configuration = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(@m80.k SupportSQLiteDatabase db2, int i11, int i12) {
        List<Migration> findMigrationPath;
        g0.p(db2, "db");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (findMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i11, i12)) != null) {
            this.delegate.onPreMigrate(db2);
            Iterator<T> it = findMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(new SupportSQLiteConnection(db2));
            }
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(db2);
            if (onValidateSchema.isValid) {
                this.delegate.onPostMigrate(db2);
                updateIdentity(db2);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg);
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 == null || databaseConfiguration2.isMigrationRequired(i11, i12)) {
            throw new IllegalStateException("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
            Companion.dropAllTables$room_runtime_release(db2);
        } else {
            this.delegate.dropAllTables(db2);
        }
        List<RoomDatabase.Callback> list = this.callbacks;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).onDestructiveMigration(db2);
            }
        }
        this.delegate.createAllTables(db2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(@m80.k DatabaseConfiguration configuration, @m80.k Delegate delegate, @m80.k String legacyHash) {
        this(configuration, delegate, "", legacyHash);
        g0.p(configuration, "configuration");
        g0.p(delegate, "delegate");
        g0.p(legacyHash, "legacyHash");
    }
}
