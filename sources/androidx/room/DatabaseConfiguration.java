package androidx.room;

import a00.h0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class DatabaseConfiguration {

    @w00.g
    public final boolean allowDestructiveMigrationForAllTables;

    @w00.g
    public final boolean allowDestructiveMigrationOnDowngrade;

    @w00.g
    public final boolean allowMainThreadQueries;

    @w00.g
    @m80.k
    public final List<AutoMigrationSpec> autoMigrationSpecs;

    @m80.l
    @w00.g
    public final List<RoomDatabase.Callback> callbacks;

    @w00.g
    @m80.k
    public final Context context;

    @m80.l
    @w00.g
    public final String copyFromAssetPath;

    @m80.l
    @w00.g
    public final File copyFromFile;

    @m80.l
    @w00.g
    public final Callable<InputStream> copyFromInputStream;

    @w00.g
    @m80.k
    public final RoomDatabase.JournalMode journalMode;

    @w00.g
    @m80.k
    public final RoomDatabase.MigrationContainer migrationContainer;

    @m80.l
    private final Set<Integer> migrationNotRequiredFrom;

    @w00.g
    public final boolean multiInstanceInvalidation;

    @m80.l
    @w00.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;

    @m80.l
    @w00.g
    public final String name;

    @m80.l
    @w00.g
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

    @m80.l
    @w00.g
    public final kotlin.coroutines.d queryCoroutineContext;

    @w00.g
    @m80.k
    public final Executor queryExecutor;

    @w00.g
    public final boolean requireMigration;

    @m80.l
    @w00.g
    public final SQLiteDriver sqliteDriver;

    @m80.l
    @w00.g
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    @w00.g
    @m80.k
    public final Executor transactionExecutor;

    @w00.g
    @m80.k
    public final List<Object> typeConverters;
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.l SupportSQLiteOpenHelper.Factory factory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, @m80.l Intent intent, boolean z12, boolean z13, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters, @m80.k List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z14, @m80.l SQLiteDriver sQLiteDriver, @m80.l kotlin.coroutines.d dVar) {
        g0.p(context, "context");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z11;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z12;
        this.allowDestructiveMigrationOnDowngrade = z13;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z14;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = dVar;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
    }

    public static /* synthetic */ DatabaseConfiguration copy$default(DatabaseConfiguration databaseConfiguration, Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z11, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z12, boolean z13, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List list2, List list3, boolean z14, SQLiteDriver sQLiteDriver, kotlin.coroutines.d dVar, int i11, Object obj) {
        kotlin.coroutines.d dVar2;
        SQLiteDriver sQLiteDriver2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i11 & 1) != 0 ? databaseConfiguration.context : context;
        String str3 = (i11 & 2) != 0 ? databaseConfiguration.name : str;
        SupportSQLiteOpenHelper.Factory factory2 = (i11 & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory;
        RoomDatabase.MigrationContainer migrationContainer2 = (i11 & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer;
        List list4 = (i11 & 16) != 0 ? databaseConfiguration.callbacks : list;
        boolean z15 = (i11 & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z11;
        RoomDatabase.JournalMode journalMode2 = (i11 & 64) != 0 ? databaseConfiguration.journalMode : journalMode;
        Executor executor3 = (i11 & 128) != 0 ? databaseConfiguration.queryExecutor : executor;
        Executor executor4 = (i11 & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2;
        Intent intent2 = (i11 & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent;
        boolean z16 = (i11 & 1024) != 0 ? databaseConfiguration.requireMigration : z12;
        boolean z17 = (i11 & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z13;
        Set set2 = (i11 & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set;
        String str4 = (i11 & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i11 & 16384) != 0 ? databaseConfiguration.copyFromFile : file;
        Callable callable2 = (i11 & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable;
        RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2 = (i11 & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback;
        List list5 = (i11 & 131072) != 0 ? databaseConfiguration.typeConverters : list2;
        List list6 = (i11 & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3;
        boolean z18 = (i11 & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z14;
        SQLiteDriver sQLiteDriver3 = (i11 & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver;
        if ((i11 & 2097152) != 0) {
            sQLiteDriver2 = sQLiteDriver3;
            dVar2 = databaseConfiguration.queryCoroutineContext;
        } else {
            dVar2 = dVar;
            sQLiteDriver2 = sQLiteDriver3;
        }
        return databaseConfiguration.copy(context3, str3, factory2, migrationContainer2, list4, z15, journalMode2, executor3, executor4, intent2, z16, z17, set2, str4, file2, callable2, prepackagedDatabaseCallback2, list5, list6, z18, sQLiteDriver2, dVar2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m80.k
    public final DatabaseConfiguration copy(@m80.k Context context, @m80.l String str, @m80.l SupportSQLiteOpenHelper.Factory factory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, @m80.l Intent intent, boolean z12, boolean z13, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters, @m80.k List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z14, @m80.l SQLiteDriver sQLiteDriver, @m80.l kotlin.coroutines.d dVar) {
        g0.p(context, "context");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
        return new DatabaseConfiguration(context, str, factory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, intent, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, z14, sQLiteDriver, dVar);
    }

    @m80.l
    public final Set<Integer> getMigrationNotRequiredFrom$room_runtime_release() {
        return this.migrationNotRequiredFrom;
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public boolean isMigrationRequired(int i11, int i12) {
        return MigrationUtil.isMigrationRequired(this, i11, i12);
    }

    @yz.n(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @w0(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int i11) {
        return isMigrationRequired(i11, i11 + 1);
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z11) {
        this.useTempTrackingTable = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, boolean z12, @m80.l Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, queryExecutor, null, z12, false, set, null, null, null, null, h0.J(), h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, null, null, null, null, h0.J(), h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, str2, file, null, null, h0.J(), h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, str2, file, callable, null, h0.J(), h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, str2, file, callable, prepackagedDatabaseCallback, h0.J(), h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, h0.J(), false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, boolean z12, boolean z13, boolean z14, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters, @m80.k List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, z12 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z13, z14, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, @m80.l Intent intent, boolean z12, boolean z13, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters, @m80.k List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, intent, z12, z13, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.n(message = "This constructor is deprecated.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@m80.k Context context, @m80.l String str, @m80.k SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @m80.k RoomDatabase.MigrationContainer migrationContainer, @m80.l List<? extends RoomDatabase.Callback> list, boolean z11, @m80.k RoomDatabase.JournalMode journalMode, @m80.k Executor queryExecutor, @m80.k Executor transactionExecutor, @m80.l Intent intent, boolean z12, boolean z13, @m80.l Set<Integer> set, @m80.l String str2, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.l RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @m80.k List<? extends Object> typeConverters, @m80.k List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z14) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z11, journalMode, queryExecutor, transactionExecutor, intent, z12, z13, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, z14, null, null);
        g0.p(context, "context");
        g0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        g0.p(migrationContainer, "migrationContainer");
        g0.p(journalMode, "journalMode");
        g0.p(queryExecutor, "queryExecutor");
        g0.p(transactionExecutor, "transactionExecutor");
        g0.p(typeConverters, "typeConverters");
        g0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
