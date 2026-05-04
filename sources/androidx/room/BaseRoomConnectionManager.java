package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.migration.Migration;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@u0({"SMAP\nRoomConnectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1#2:363\n1863#3,2:364\n1863#3,2:366\n1863#3,2:368\n1863#3,2:370\n1863#3,2:372\n*S KotlinDebug\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n*L\n209#1:364,2\n253#1:366,2\n342#1:368,2\n346#1:370,2\n350#1:372,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class BaseRoomConnectionManager {
    public static final int BUSY_TIMEOUT_MS = 3000;

    @m80.k
    public static final Companion Companion = new Companion(null);
    private boolean isConfigured;
    private boolean isInitializing;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class DriverWrapper implements SQLiteDriver {

        @m80.k
        private final SQLiteDriver actual;
        final /* synthetic */ BaseRoomConnectionManager this$0;

        public DriverWrapper(@m80.k BaseRoomConnectionManager baseRoomConnectionManager, SQLiteDriver actual) {
            g0.p(actual, "actual");
            this.this$0 = baseRoomConnectionManager;
            this.actual = actual;
        }

        private final SQLiteConnection openLocked(final String str) {
            ExclusiveLock exclusiveLock = new ExclusiveLock(str, (this.this$0.isConfigured || this.this$0.isInitializing || g0.g(str, ":memory:")) ? false : true);
            final BaseRoomConnectionManager baseRoomConnectionManager = this.this$0;
            return (SQLiteConnection) exclusiveLock.withLock(new x00.a() { // from class: androidx.room.d
                @Override // x00.a
                public final Object invoke() {
                    SQLiteConnection openLocked$lambda$1;
                    openLocked$lambda$1 = BaseRoomConnectionManager.DriverWrapper.openLocked$lambda$1(BaseRoomConnectionManager.this, this, str);
                    return openLocked$lambda$1;
                }
            }, new x00.l() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                @Override // x00.l
                public final Void invoke(Throwable error) {
                    g0.p(error, "error");
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SQLiteConnection openLocked$lambda$1(BaseRoomConnectionManager baseRoomConnectionManager, DriverWrapper driverWrapper, String str) {
            if (baseRoomConnectionManager.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            SQLiteConnection open = driverWrapper.actual.open(str);
            if (baseRoomConnectionManager.isConfigured) {
                baseRoomConnectionManager.configurationConnection(open);
                return open;
            }
            try {
                baseRoomConnectionManager.isInitializing = true;
                baseRoomConnectionManager.configureDatabase(open);
                return open;
            } finally {
                baseRoomConnectionManager.isInitializing = false;
            }
        }

        @Override // androidx.sqlite.SQLiteDriver
        @m80.k
        public SQLiteConnection open(@m80.k String fileName) {
            g0.p(fileName, "fileName");
            return openLocked(this.this$0.resolveFileName$room_runtime_release(fileName));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void checkIdentity(SQLiteConnection sQLiteConnection) {
        Object m6308constructorimpl;
        RoomOpenDelegate.ValidationResult onValidateSchema;
        if (hasRoomMasterTable(sQLiteConnection)) {
            SQLiteStatement prepare = sQLiteConnection.prepare(RoomMasterTable.READ_QUERY);
            try {
                String text = prepare.step() ? prepare.getText(0) : null;
                u00.a.c(prepare, null);
                if (g0.g(getOpenDelegate().getIdentityHash(), text) || g0.g(getOpenDelegate().getLegacyIdentityHash(), text)) {
                    return;
                }
                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + text).toString());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    u00.a.c(prepare, th2);
                    throw th3;
                }
            }
        }
        SQLite.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            Result.a aVar = Result.Companion;
            onValidateSchema = getOpenDelegate().onValidateSchema(sQLiteConnection);
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th4));
        }
        if (!onValidateSchema.isValid) {
            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg).toString());
        }
        getOpenDelegate().onPostMigrate(sQLiteConnection);
        updateIdentity(sQLiteConnection);
        m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
        if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
            SQLite.execSQL(sQLiteConnection, "END TRANSACTION");
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
        if (m6311exceptionOrNullimpl == null) {
            Result.m6307boximpl(m6308constructorimpl);
        } else {
            SQLite.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
            throw m6311exceptionOrNullimpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurationConnection(SQLiteConnection sQLiteConnection) {
        configureSynchronousFlag(sQLiteConnection);
        configureBusyTimeout(sQLiteConnection);
        getOpenDelegate().onOpen(sQLiteConnection);
    }

    private final void configureBusyTimeout(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA busy_timeout");
        try {
            prepare.step();
            long j11 = prepare.getLong(0);
            u00.a.c(prepare, null);
            if (j11 < 3000) {
                SQLite.execSQL(sQLiteConnection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u00.a.c(prepare, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDatabase(SQLiteConnection sQLiteConnection) {
        Object m6308constructorimpl;
        configureJournalMode(sQLiteConnection);
        configureSynchronousFlag(sQLiteConnection);
        configureBusyTimeout(sQLiteConnection);
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA user_version");
        try {
            prepare.step();
            int i11 = (int) prepare.getLong(0);
            u00.a.c(prepare, null);
            if (i11 != getOpenDelegate().getVersion()) {
                SQLite.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.a aVar = Result.Companion;
                    if (i11 == 0) {
                        onCreate(sQLiteConnection);
                    } else {
                        onMigrate(sQLiteConnection, i11, getOpenDelegate().getVersion());
                    }
                    SQLite.execSQL(sQLiteConnection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                    SQLite.execSQL(sQLiteConnection, "END TRANSACTION");
                }
                Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
                if (m6311exceptionOrNullimpl != null) {
                    SQLite.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
                    throw m6311exceptionOrNullimpl;
                }
            }
            onOpen(sQLiteConnection);
        } finally {
        }
    }

    private final void configureJournalMode(SQLiteConnection sQLiteConnection) {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(sQLiteConnection, "PRAGMA journal_mode = WAL");
        } else {
            SQLite.execSQL(sQLiteConnection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void configureSynchronousFlag(SQLiteConnection sQLiteConnection) {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(sQLiteConnection, "PRAGMA synchronous = NORMAL");
        } else {
            SQLite.execSQL(sQLiteConnection, "PRAGMA synchronous = FULL");
        }
    }

    private final void createMasterTableIfNotExists(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
    }

    private final void dropAllTables(SQLiteConnection sQLiteConnection) {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().dropAllTables(sQLiteConnection);
            return;
        }
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            List j11 = a00.g0.j();
            while (prepare.step()) {
                String text = prepare.getText(0);
                if (!f0.J2(text, "sqlite_", false, 2, null) && !g0.g(text, "android_metadata")) {
                    j11.add(h1.a(text, Boolean.valueOf(g0.g(prepare.getText(1), "view"))));
                }
            }
            List<Pair> b11 = a00.g0.b(j11);
            u00.a.c(prepare, null);
            for (Pair pair : b11) {
                String str = (String) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS " + str);
                } else {
                    SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS " + str);
                }
            }
        } finally {
        }
    }

    private final boolean hasEmptySchema(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (prepare.step()) {
                if (prepare.getLong(0) == 0) {
                    z11 = true;
                }
            }
            u00.a.c(prepare, null);
            return z11;
        } finally {
        }
    }

    private final boolean hasRoomMasterTable(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z11 = false;
            if (prepare.step()) {
                if (prepare.getLong(0) != 0) {
                    z11 = true;
                }
            }
            u00.a.c(prepare, null);
            return z11;
        } finally {
        }
    }

    private final void invokeCreateCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onCreate(sQLiteConnection);
        }
    }

    private final void invokeDestructiveMigrationCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(sQLiteConnection);
        }
    }

    private final void invokeOpenCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onOpen(sQLiteConnection);
        }
    }

    private final void updateIdentity(SQLiteConnection sQLiteConnection) {
        createMasterTableIfNotExists(sQLiteConnection);
        SQLite.execSQL(sQLiteConnection, RoomMasterTable.createInsertQuery(getOpenDelegate().getIdentityHash()));
    }

    @m80.k
    public abstract List<RoomDatabase.Callback> getCallbacks();

    @m80.k
    public abstract DatabaseConfiguration getConfiguration();

    public final int getMaxNumberOfReaders(@m80.k RoomDatabase.JournalMode journalMode) {
        g0.p(journalMode, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + journalMode + '\'').toString());
    }

    public final int getMaxNumberOfWriters(@m80.k RoomDatabase.JournalMode journalMode) {
        g0.p(journalMode, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + journalMode + '\'').toString());
    }

    @m80.k
    public abstract RoomOpenDelegate getOpenDelegate();

    public final void onCreate(@m80.k SQLiteConnection connection) {
        g0.p(connection, "connection");
        boolean hasEmptySchema = hasEmptySchema(connection);
        getOpenDelegate().createAllTables(connection);
        if (!hasEmptySchema) {
            RoomOpenDelegate.ValidationResult onValidateSchema = getOpenDelegate().onValidateSchema(connection);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg).toString());
            }
        }
        updateIdentity(connection);
        getOpenDelegate().onCreate(connection);
        invokeCreateCallback(connection);
    }

    public final void onMigrate(@m80.k SQLiteConnection connection, int i11, int i12) {
        g0.p(connection, "connection");
        List<Migration> findMigrationPath = MigrationUtil.findMigrationPath(getConfiguration().migrationContainer, i11, i12);
        if (findMigrationPath == null) {
            if (!MigrationUtil.isMigrationRequired(getConfiguration(), i11, i12)) {
                dropAllTables(connection);
                invokeDestructiveMigrationCallback(connection);
                getOpenDelegate().createAllTables(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().onPreMigrate(connection);
        Iterator<T> it = findMigrationPath.iterator();
        while (it.hasNext()) {
            ((Migration) it.next()).migrate(connection);
        }
        RoomOpenDelegate.ValidationResult onValidateSchema = getOpenDelegate().onValidateSchema(connection);
        if (onValidateSchema.isValid) {
            getOpenDelegate().onPostMigrate(connection);
            updateIdentity(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg).toString());
        }
    }

    public final void onOpen(@m80.k SQLiteConnection connection) {
        g0.p(connection, "connection");
        checkIdentity(connection);
        getOpenDelegate().onOpen(connection);
        invokeOpenCallback(connection);
        this.isConfigured = true;
    }

    @m80.k
    public String resolveFileName$room_runtime_release(@m80.k String fileName) {
        g0.p(fileName, "fileName");
        return fileName;
    }

    @m80.l
    public abstract <R> Object useConnection(boolean z11, @m80.k x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar);
}
