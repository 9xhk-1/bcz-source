package androidx.room;

import a00.h0;
import a00.i0;
import a00.k1;
import a00.l1;
import a00.w1;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.DBUtil;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import c40.r0;
import c40.s0;
import c40.x1;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2151:1\n357#1,15:2152\n357#1,15:2167\n477#2:2182\n423#2:2183\n1246#3,4:2184\n1187#3,2:2188\n1261#3,2:2190\n1557#3:2192\n1628#3,3:2193\n1264#3:2196\n1557#3:2197\n1628#3,3:2198\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n*L\n271#1:2152,15\n275#1:2167,15\n343#1:2182\n343#1:2183\n343#1:2184,4\n452#1:2188,2\n452#1:2190,2\n453#1:2192\n453#1:2193,3\n452#1:2196\n478#1:2197\n478#1:2198,3\n*E\n"})
/* loaded from: classes3.dex */
public abstract class RoomDatabase {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @m80.l
    private AutoCloser autoCloser;
    private RoomConnectionManager connectionManager;
    private r0 coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;

    @m80.l
    @w00.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected List<? extends Callback> mCallbacks;

    @m80.l
    @w00.g
    protected volatile SupportSQLiteDatabase mDatabase;
    private kotlin.coroutines.d transactionContext;

    @m80.k
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));

    @m80.k
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    @m80.k
    private final Map<h10.d<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;

        @m80.l
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;

        @m80.k
        private final List<AutoMigrationSpec> autoMigrationSpecs;

        @m80.k
        private final List<Callback> callbacks;

        @m80.k
        private final Context context;

        @m80.l
        private String copyFromAssetPath;

        @m80.l
        private File copyFromFile;

        @m80.l
        private Callable<InputStream> copyFromInputStream;

        @m80.l
        private SQLiteDriver driver;

        @m80.l
        private final x00.a<T> factory;
        private boolean inMemoryTrackingTableMode;

        @m80.k
        private JournalMode journalMode;

        @m80.k
        private final h10.d<T> klass;

        @m80.k
        private final MigrationContainer migrationContainer;

        @m80.k
        private final Set<Integer> migrationStartAndEndVersions;

        @m80.k
        private Set<Integer> migrationsNotRequiredFrom;

        @m80.l
        private Intent multiInstanceInvalidationIntent;

        @m80.l
        private final String name;

        @m80.l
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;

        @m80.l
        private QueryCallback queryCallback;

        @m80.l
        private kotlin.coroutines.d queryCallbackCoroutineContext;

        @m80.l
        private Executor queryCallbackExecutor;

        @m80.l
        private kotlin.coroutines.d queryCoroutineContext;

        @m80.l
        private Executor queryExecutor;
        private boolean requireMigration;

        @m80.l
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;

        @m80.l
        private Executor transactionExecutor;

        @m80.k
        private final List<Object> typeConverters;

        /* JADX WARN: Multi-variable type inference failed */
        @v0
        public Builder(@m80.k h10.d<T> klass, @m80.l String str, @m80.l x00.a<? extends T> aVar, @m80.k Context context) {
            g0.p(klass, "klass");
            g0.p(context, "context");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = klass;
            this.context = context;
            this.name = str;
            this.factory = aVar;
        }

        @m80.k
        public Builder<T> addAutoMigrationSpec(@m80.k AutoMigrationSpec autoMigrationSpec) {
            g0.p(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @m80.k
        public Builder<T> addCallback(@m80.k Callback callback) {
            g0.p(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @m80.k
        public Builder<T> addMigrations(@m80.k Migration... migrations) {
            g0.p(migrations, "migrations");
            for (Migration migration : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @m80.k
        public Builder<T> addTypeConverter(@m80.k Object typeConverter) {
            g0.p(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @m80.k
        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @m80.k
        public T build() {
            SupportSQLiteOpenHelper.Factory factory;
            SupportSQLiteOpenHelper.Factory factory2;
            T t11;
            kotlin.coroutines.d dVar;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                factory = new FrameworkSQLiteOpenHelperFactory();
            } else if (sQLiteDriver == null) {
                factory = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                factory = null;
            }
            boolean z11 = this.autoCloseTimeout > 0;
            boolean z12 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z13 = this.queryCallback != null;
            if (factory != null) {
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j11 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    factory = new AutoClosingRoomOpenHelperFactory(factory, new AutoCloser(j11, timeUnit, null, 4, null));
                }
                if (z12) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i11 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i12 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i11 + i12 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    factory = new PrePackagedCopyOpenHelperFactory(str, file, callable, factory);
                }
                if (z13) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if ((executor2 == null || (dVar = x1.c(executor2)) == null) && (dVar = this.queryCallbackCoroutineContext) == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    r0 a11 = s0.a(dVar);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    factory = new QueryInterceptorOpenHelperFactory(factory, a11, queryCallback);
                }
                factory2 = factory;
            } else {
                factory2 = null;
            }
            if (factory2 == null) {
                if (z11) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z12) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
                if (z13) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z14 = this.allowMainThreadQueries;
            JournalMode resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory2, migrationContainer, list, z14, resolve$room_runtime_release, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.setUseTempTrackingTable$room_runtime_release(this.inMemoryTrackingTableMode);
            x00.a<T> aVar = this.factory;
            if (aVar == null || (t11 = aVar.invoke()) == null) {
                t11 = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(w00.b.d(this.klass), null, 2, null);
            }
            t11.init(databaseConfiguration);
            return t11;
        }

        @m80.k
        public Builder<T> createFromAsset(@m80.k String databaseFilePath) {
            g0.p(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @m80.k
        public Builder<T> createFromFile(@m80.k File databaseFile) {
            g0.p(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @m80.k
        public Builder<T> createFromInputStream(@m80.k Callable<InputStream> inputStreamCallable) {
            g0.p(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @m80.k
        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @yz.n(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @w0(expression = "fallbackToDestructiveMigration(false)", imports = {}))
        @m80.k
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @yz.n(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @w0(expression = "fallbackToDestructiveMigrationFrom(false, startVersions)", imports = {}))
        @m80.k
        public Builder<T> fallbackToDestructiveMigrationFrom(@m80.k int... startVersions) {
            g0.p(startVersions, "startVersions");
            for (int i11 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i11));
            }
            return this;
        }

        @yz.n(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @w0(expression = "fallbackToDestructiveMigrationOnDowngrade(false)", imports = {}))
        @m80.k
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @m80.k
        public Builder<T> openHelperFactory(@m80.l SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @ExperimentalRoomApi
        @m80.k
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long j11, @m80.k TimeUnit autoCloseTimeUnit) {
            g0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j11 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = j11;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        @m80.k
        public final Builder<T> setDriver(@m80.k SQLiteDriver driver) {
            g0.p(driver, "driver");
            this.driver = driver;
            return this;
        }

        @ExperimentalRoomApi
        @m80.k
        public final Builder<T> setInMemoryTrackingMode(boolean z11) {
            this.inMemoryTrackingTableMode = z11;
            return this;
        }

        @m80.k
        public Builder<T> setJournalMode(@m80.k JournalMode journalMode) {
            g0.p(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        @m80.k
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@m80.k Intent invalidationServiceIntent) {
            g0.p(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @m80.k
        public Builder<T> setQueryCallback(@m80.k QueryCallback queryCallback, @m80.k Executor executor) {
            g0.p(queryCallback, "queryCallback");
            g0.p(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        @m80.k
        public final Builder<T> setQueryCoroutineContext(@m80.k kotlin.coroutines.d context) {
            g0.p(context, "context");
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            }
            if (context.get(kotlin.coroutines.c.f66933w0) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
            }
            this.queryCoroutineContext = context;
            return this;
        }

        @m80.k
        public Builder<T> setQueryExecutor(@m80.k Executor executor) {
            g0.p(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }

        @m80.k
        public Builder<T> setTransactionExecutor(@m80.k Executor executor) {
            g0.p(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @m80.k
        public Builder<T> createFromAsset(@m80.k String databaseFilePath, @m80.k PrepackagedDatabaseCallback callback) {
            g0.p(databaseFilePath, "databaseFilePath");
            g0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @m80.k
        public Builder<T> createFromFile(@m80.k File databaseFile, @m80.k PrepackagedDatabaseCallback callback) {
            g0.p(databaseFile, "databaseFile");
            g0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @m80.k
        public Builder<T> createFromInputStream(@m80.k Callable<InputStream> inputStreamCallable, @m80.k PrepackagedDatabaseCallback callback) {
            g0.p(inputStreamCallable, "inputStreamCallable");
            g0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @m80.k
        public final Builder<T> fallbackToDestructiveMigration(boolean z11) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z11;
            return this;
        }

        @m80.k
        public Builder<T> fallbackToDestructiveMigrationFrom(boolean z11, @m80.k int... startVersions) {
            g0.p(startVersions, "startVersions");
            for (int i11 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i11));
            }
            this.allowDestructiveMigrationForAllTables = z11;
            return this;
        }

        @m80.k
        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean z11) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z11;
            return this;
        }

        @m80.k
        public final Builder<T> setQueryCallback(@m80.k kotlin.coroutines.d context, @m80.k QueryCallback queryCallback) {
            g0.p(context, "context");
            g0.p(queryCallback, "queryCallback");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = context;
            return this;
        }

        public Builder(@m80.k Context context, @m80.k Class<T> klass, @m80.l String str) {
            g0.p(context, "context");
            g0.p(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = w00.b.i(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Callback {
        public void onCreate(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public void onDestructiveMigration(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public void onOpen(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }

        public void onCreate(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onDestructiveMigration(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onOpen(@m80.k SQLiteConnection connection) {
            g0.p(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) connection).getDb());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class JournalMode {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC = new JournalMode("AUTOMATIC", 0);
        public static final JournalMode TRUNCATE = new JournalMode("TRUNCATE", 1);
        public static final JournalMode WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] $values() {
            return new JournalMode[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            JournalMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private JournalMode(String str, int i11) {
        }

        @m80.k
        public static m00.a<JournalMode> getEntries() {
            return $ENTRIES;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        @m80.k
        public final JournalMode resolve$room_runtime_release(@m80.k Context context) {
            g0.p(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@m80.k SupportSQLiteDatabase db2) {
            g0.p(db2, "db");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface QueryCallback {
        void onQuery(@m80.k String str, @m80.k List<? extends Object> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 beginTransaction$lambda$8(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        g0.p(it, "it");
        roomDatabase.internalBeginTransaction();
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper createConnectionManager$lambda$1(RoomDatabase roomDatabase, DatabaseConfiguration config) {
        g0.p(config, "config");
        return roomDatabase.createOpenHelper(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 endTransaction$lambda$9(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        g0.p(it, "it");
        roomDatabase.internalEndTransaction();
        return g2.f100423a;
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime_release();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        r0 r0Var = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (r0Var == null) {
            g0.S("coroutineScope");
            r0Var = null;
        }
        s0.f(r0Var, null, 1, null);
        getInvalidationTracker().stop$room_runtime_release();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            g0.S("connectionManager");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.close();
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i11 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(x00.a aVar, SQLiteConnection it) {
        g0.p(it, "it");
        return aVar.invoke();
    }

    private final /* synthetic */ <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (supportSQLiteOpenHelper == null) {
            return null;
        }
        while (true) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (supportSQLiteOpenHelper != null) {
                return (T) supportSQLiteOpenHelper;
            }
            if (!(supportSQLiteOpenHelper instanceof DelegatingOpenHelper)) {
                return null;
            }
            supportSQLiteOpenHelper = (T) ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate();
        }
    }

    public final void addTypeConverter$room_runtime_release(@m80.k h10.d<?> kclass, @m80.k Object converter) {
        g0.p(kclass, "kclass");
        g0.p(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @yz.n(message = "beginTransaction() is deprecated", replaceWith = @w0(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new x00.l() { // from class: androidx.room.o
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 beginTransaction$lambda$8;
                    beginTransaction$lambda$8 = RoomDatabase.beginTransaction$lambda$8(RoomDatabase.this, (SupportSQLiteDatabase) obj);
                    return beginTransaction$lambda$8;
                }
            });
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.close$room_runtime_release();
    }

    @m80.k
    public SupportSQLiteStatement compileStatement(@m80.k String sql) {
        g0.p(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public List<Migration> createAutoMigrations(@m80.k Map<h10.d<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(w00.b.d((h10.d) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    @m80.k
    public final RoomConnectionManager createConnectionManager$room_runtime_release(@m80.k DatabaseConfiguration configuration) {
        RoomOpenDelegate roomOpenDelegate;
        g0.p(configuration, "configuration");
        try {
            RoomOpenDelegateMarker createOpenDelegate = createOpenDelegate();
            g0.n(createOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            roomOpenDelegate = (RoomOpenDelegate) createOpenDelegate;
        } catch (NotImplementedError unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(configuration, (x00.l<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper>) new x00.l() { // from class: androidx.room.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                SupportSQLiteOpenHelper createConnectionManager$lambda$1;
                createConnectionManager$lambda$1 = RoomDatabase.createConnectionManager$lambda$1(RoomDatabase.this, (DatabaseConfiguration) obj);
                return createConnectionManager$lambda$1;
            }
        }) : new RoomConnectionManager(configuration, roomOpenDelegate);
    }

    @m80.k
    public abstract InvalidationTracker createInvalidationTracker();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public RoomOpenDelegateMarker createOpenDelegate() {
        throw new NotImplementedError(null, 1, null);
    }

    @yz.n(message = "No longer implemented by generated")
    @m80.k
    public SupportSQLiteOpenHelper createOpenHelper(@m80.k DatabaseConfiguration config) {
        g0.p(config, "config");
        throw new NotImplementedError(null, 1, null);
    }

    @yz.n(message = "endTransaction() is deprecated", replaceWith = @w0(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new x00.l() { // from class: androidx.room.k
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 endTransaction$lambda$9;
                    endTransaction$lambda$9 = RoomDatabase.endTransaction$lambda$9(RoomDatabase.this, (SupportSQLiteDatabase) obj);
                    return endTransaction$lambda$9;
                }
            });
        }
    }

    @w00.p
    @m80.k
    @yz.n(message = "No longer implemented by generated")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public List<Migration> getAutoMigrations(@m80.k Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
        return h0.J();
    }

    @m80.k
    public final CloseBarrier getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m80.k
    public final r0 getCoroutineScope() {
        r0 r0Var = this.coroutineScope;
        if (r0Var != null) {
            return r0Var;
        }
        g0.S("coroutineScope");
        return null;
    }

    @m80.k
    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        g0.S("internalTracker");
        return null;
    }

    @m80.k
    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            g0.S("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m80.k
    public final kotlin.coroutines.d getQueryContext() {
        r0 r0Var = this.coroutineScope;
        if (r0Var == null) {
            g0.S("coroutineScope");
            r0Var = null;
        }
        return r0Var.getCoroutineContext();
    }

    @m80.k
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        g0.S("internalQueryExecutor");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public Set<h10.d<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(i0.d0(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(w00.b.i((Class) it.next()));
        }
        return a00.r0.f6(arrayList);
    }

    @yz.n(message = "No longer implemented by generated")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return w1.k();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public Map<h10.d<?>, List<h10.d<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            h10.d i11 = w00.b.i(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(w00.b.i((Class) it2.next()));
            }
            Pair a11 = h1.a(i11, arrayList);
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        return linkedHashMap;
    }

    @m80.k
    public final Map<h10.d<?>, List<h10.d<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return l1.z();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m80.k
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @m80.k
    public final kotlin.coroutines.d getTransactionContext$room_runtime_release() {
        kotlin.coroutines.d dVar = this.transactionContext;
        if (dVar != null) {
            return dVar;
        }
        g0.S("transactionContext");
        return null;
    }

    @m80.k
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        g0.S("internalTransactionExecutor");
        return null;
    }

    @m80.l
    @yz.n(message = "No longer called by generated implementation")
    public <T> T getTypeConverter(@m80.k Class<T> klass) {
        g0.p(klass, "klass");
        return (T) this.typeConverters.get(w00.b.i(klass));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            g0.S("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.getSupportOpenHelper$room_runtime_release() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[LOOP:0: B:45:0x010d->B:49:0x0116, LOOP_START, PHI: r0
      0x010d: PHI (r0v29 androidx.sqlite.db.SupportSQLiteOpenHelper) = (r0v28 androidx.sqlite.db.SupportSQLiteOpenHelper), (r0v31 androidx.sqlite.db.SupportSQLiteOpenHelper) binds: [B:26:0x0109, B:49:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(@m80.k androidx.room.DatabaseConfiguration r8) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.init(androidx.room.DatabaseConfiguration):void");
    }

    @yz.n(message = "No longer called by generated")
    public void internalInitInvalidationTracker(@m80.k SupportSQLiteDatabase db2) {
        g0.p(db2, "db");
        internalInitInvalidationTracker(new SupportSQLiteConnection(db2));
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            g0.S("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            g0.S("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void performClear(boolean z11, @m80.k String... tableNames) {
        g0.p(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new RoomDatabase$performClear$1(this, z11, tableNames, null));
    }

    @w00.k
    @m80.k
    public final Cursor query(@m80.k SupportSQLiteQuery query) {
        g0.p(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@m80.k final Runnable body) {
        g0.p(body, "body");
        runInTransaction(new x00.a() { // from class: androidx.room.j
            @Override // x00.a
            public final Object invoke() {
                g2 runInTransaction$lambda$10;
                runInTransaction$lambda$10 = RoomDatabase.runInTransaction$lambda$10(body);
                return runInTransaction$lambda$10;
            }
        });
    }

    @yz.n(message = "setTransactionSuccessful() is deprecated", replaceWith = @w0(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z11) {
        this.useTempTrackingTable = z11;
    }

    @m80.l
    public final <R> Object useConnection$room_runtime_release(boolean z11, @m80.k x00.p<? super Transactor, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            g0.S("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.useConnection(z11, pVar, cVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @m80.k
    public final <T> T getTypeConverter(@m80.k h10.d<T> klass) {
        g0.p(klass, "klass");
        T t11 = (T) this.typeConverters.get(klass);
        g0.n(t11, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void internalInitInvalidationTracker(@m80.k SQLiteConnection connection) {
        g0.p(connection, "connection");
        getInvalidationTracker().internalInit$room_runtime_release(connection);
    }

    @m80.k
    public Cursor query(@m80.k String query, @m80.l Object[] objArr) {
        g0.p(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    public <V> V runInTransaction(@m80.k final Callable<V> body) {
        g0.p(body, "body");
        return (V) runInTransaction(new x00.a() { // from class: androidx.room.l
            @Override // x00.a
            public final Object invoke() {
                Object call;
                call = body.call();
                return call;
            }
        });
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2151:1\n13402#2,2:2152\n1863#3,2:2154\n381#4,7:2156\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1788#1:2152,2\n1798#1:2154,2\n1811#1:2156,7\n*E\n"})
    public static class MigrationContainer {

        @m80.k
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void addMigration(@m80.k Migration migration) {
            g0.p(migration, "migration");
            int i11 = migration.startVersion;
            int i12 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i11);
            TreeMap<Integer, Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i12))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i12)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i12), migration);
        }

        public void addMigrations(@m80.k List<? extends Migration> migrations) {
            g0.p(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i11, int i12) {
            return MigrationUtil.contains(this, i11, i12);
        }

        @m80.l
        public List<Migration> findMigrationPath(int i11, int i12) {
            return MigrationUtil.findMigrationPath(this, i11, i12);
        }

        @m80.k
        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        @m80.l
        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedDescendingNodes$room_runtime_release(int i11) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i11));
            if (treeMap == null) {
                return null;
            }
            return h1.a(treeMap, treeMap.descendingKeySet());
        }

        @m80.l
        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedNodes$room_runtime_release(int i11) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i11));
            if (treeMap == null) {
                return null;
            }
            return h1.a(treeMap, treeMap.keySet());
        }

        public void addMigrations(@m80.k Migration... migrations) {
            g0.p(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    private final <T> T runInTransaction(final x00.a<? extends T> aVar) {
        if (inCompatibilityMode$room_runtime_release()) {
            beginTransaction();
            try {
                T invoke = aVar.invoke();
                setTransactionSuccessful();
                return invoke;
            } finally {
                endTransaction();
            }
        }
        return (T) DBUtil.performBlocking(this, false, true, new x00.l() { // from class: androidx.room.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object runInTransaction$lambda$12;
                runInTransaction$lambda$12 = RoomDatabase.runInTransaction$lambda$12(x00.a.this, (SQLiteConnection) obj);
                return runInTransaction$lambda$12;
            }
        });
    }

    @w00.k
    @m80.k
    public Cursor query(@m80.k SupportSQLiteQuery query, @m80.l CancellationSignal cancellationSignal) {
        g0.p(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    public static /* synthetic */ void getMDatabase$annotations() {
    }
}
