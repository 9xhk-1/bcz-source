package androidx.room;

import a00.h0;
import a00.r0;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.driver.SupportSQLiteDriver;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.AndroidSQLiteDriver;
import java.util.List;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RoomConnectionManager extends BaseRoomConnectionManager {

    @m80.k
    private final List<RoomDatabase.Callback> callbacks;

    @m80.k
    private final DatabaseConfiguration configuration;

    @m80.k
    private final ConnectionPool connectionPool;

    @m80.k
    private final RoomOpenDelegate openDelegate;

    @m80.l
    private SupportSQLiteDatabase supportDatabase;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        @m80.k
        public RoomOpenDelegate.ValidationResult onValidateSchema(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i11) {
            super(i11);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(db2));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(@m80.k SupportSQLiteDatabase db2, int i11, int i12) {
            g0.p(db2, "db");
            onUpgrade(db2, i11, i12);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(db2));
            RoomConnectionManager.this.supportDatabase = db2;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@m80.k SupportSQLiteDatabase db2, int i11, int i12) {
            g0.p(db2, "db");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(db2), i11, i12);
        }
    }

    public RoomConnectionManager(@m80.k DatabaseConfiguration config, @m80.k RoomOpenDelegate openDelegate) {
        ConnectionPool newSingleConnectionPool;
        g0.p(config, "config");
        g0.p(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? h0.J() : list;
        SQLiteDriver sQLiteDriver = config.sqliteDriver;
        if (sQLiteDriver != null) {
            if (sQLiteDriver instanceof AndroidSQLiteDriver) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver);
                String str = config.name;
                newSingleConnectionPool = new AndroidSQLiteDriverConnectionPool(driverWrapper, str != null ? str : ":memory:");
            } else {
                newSingleConnectionPool = config.name == null ? ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), ":memory:") : ConnectionPoolKt.newConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), config.name, getMaxNumberOfReaders(config.journalMode), getMaxNumberOfWriters(config.journalMode));
            }
            this.connectionPool = newSingleConnectionPool;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(config.context).name(config.name).callback(new SupportOpenHelperCallback(openDelegate.getVersion())).build())));
        }
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        roomConnectionManager.supportDatabase = db2;
        return g2.f100423a;
    }

    private final void init() {
        boolean z11 = getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z11);
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final x00.l<? super SupportSQLiteDatabase, g2> lVar) {
        List<RoomDatabase.Callback> list = databaseConfiguration.callbacks;
        if (list == null) {
            list = h0.J();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, r0.J4(list, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase db2) {
                g0.p(db2, "db");
                lVar.invoke(db2);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void close() {
        this.connectionPool.close();
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @m80.k
    public List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @m80.k
    public DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @m80.k
    public RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    @m80.l
    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
        SupportSQLiteDriver supportDriver$room_runtime_release;
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool == null || (supportDriver$room_runtime_release = supportSQLiteConnectionPool.getSupportDriver$room_runtime_release()) == null) {
            return null;
        }
        return supportDriver$room_runtime_release.getOpenHelper();
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @m80.k
    public String resolveFileName$room_runtime_release(@m80.k String fileName) {
        g0.p(fileName, "fileName");
        if (g0.g(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        g0.m(absolutePath);
        return absolutePath;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @m80.l
    public <R> Object useConnection(boolean z11, @m80.k x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return this.connectionPool.useConnection(z11, pVar, cVar);
    }

    public RoomConnectionManager(@m80.k DatabaseConfiguration config, @m80.k x00.l<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper> supportOpenHelperFactory) {
        g0.p(config, "config");
        g0.p(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = config.callbacks;
        this.callbacks = list == null ? h0.J() : list;
        this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(supportOpenHelperFactory.invoke(installOnOpenCallback(config, new x00.l() { // from class: androidx.room.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 _init_$lambda$1;
                _init_$lambda$1 = RoomConnectionManager._init_$lambda$1(RoomConnectionManager.this, (SupportSQLiteDatabase) obj);
                return _init_$lambda$1;
            }
        }))));
        init();
    }
}
