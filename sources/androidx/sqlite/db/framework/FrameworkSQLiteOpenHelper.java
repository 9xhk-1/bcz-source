package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;

    @k
    private final SupportSQLiteOpenHelper.Callback callback;

    @k
    private final Context context;

    @k
    private final c0<OpenHelper> lazyDelegate;

    @l
    private final String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DBRefHolder {

        /* renamed from: db, reason: collision with root package name */
        @l
        private FrameworkSQLiteDatabase f5379db;

        public DBRefHolder(@l FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f5379db = frameworkSQLiteDatabase;
        }

        @l
        public final FrameworkSQLiteDatabase getDb() {
            return this.f5379db;
        }

        public final void setDb(@l FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f5379db = frameworkSQLiteDatabase;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OpenHelper extends SQLiteOpenHelper {

        @k
        public static final Companion Companion = new Companion(null);
        private final boolean allowDataLossOnRecovery;

        @k
        private final SupportSQLiteOpenHelper.Callback callback;

        @k
        private final Context context;

        @k
        private final DBRefHolder dbRef;

        @k
        private final ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class CallbackException extends RuntimeException {

            @k
            private final CallbackName callbackName;

            @k
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(@k CallbackName callbackName, @k Throwable cause) {
                super(cause);
                g0.p(callbackName, "callbackName");
                g0.p(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @k
            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @k
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class CallbackName {
            private static final /* synthetic */ m00.a $ENTRIES;
            private static final /* synthetic */ CallbackName[] $VALUES;
            public static final CallbackName ON_CONFIGURE = new CallbackName("ON_CONFIGURE", 0);
            public static final CallbackName ON_CREATE = new CallbackName("ON_CREATE", 1);
            public static final CallbackName ON_UPGRADE = new CallbackName("ON_UPGRADE", 2);
            public static final CallbackName ON_DOWNGRADE = new CallbackName("ON_DOWNGRADE", 3);
            public static final CallbackName ON_OPEN = new CallbackName("ON_OPEN", 4);

            private static final /* synthetic */ CallbackName[] $values() {
                return new CallbackName[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
            }

            static {
                CallbackName[] $values = $values();
                $VALUES = $values;
                $ENTRIES = m00.c.c($values);
            }

            private CallbackName(String str, int i11) {
            }

            @k
            public static m00.a<CallbackName> getEntries() {
                return $ENTRIES;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) $VALUES.clone();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nFrameworkSQLiteOpenHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.android.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            @k
            public final FrameworkSQLiteDatabase getWrappedDb(@k DBRefHolder refHolder, @k SQLiteDatabase sqLiteDatabase) {
                g0.p(refHolder, "refHolder");
                g0.p(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase db2 = refHolder.getDb();
                if (db2 != null && db2.isDelegate(sqLiteDatabase)) {
                    return db2;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.setDb(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@k Context context, @l String str, @k final DBRefHolder dbRef, @k final SupportSQLiteOpenHelper.Callback callback, boolean z11) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.g
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(SupportSQLiteOpenHelper.Callback.this, dbRef, sQLiteDatabase);
                }
            });
            String str2;
            g0.p(context, "context");
            g0.p(dbRef, "dbRef");
            g0.p(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z11;
            if (str == null) {
                str2 = UUID.randomUUID().toString();
                g0.o(str2, "toString(...)");
            } else {
                str2 = str;
            }
            this.lock = new ProcessLock(str2, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SupportSQLiteOpenHelper.Callback callback, DBRefHolder dBRefHolder, SQLiteDatabase sQLiteDatabase) {
            Companion companion = Companion;
            g0.m(sQLiteDatabase);
            callback.onCorruption(companion.getWrappedDb(dBRefHolder, sQLiteDatabase));
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z11) {
            if (z11) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                g0.m(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            g0.m(readableDatabase);
            return readableDatabase;
        }

        private final SQLiteDatabase innerGetDatabase(boolean z11) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z12 = this.opened;
            if (databaseName != null && !z12 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w(FrameworkSQLiteOpenHelper.TAG, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(z11);
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z11);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = (CallbackException) th;
                        Throwable cause = callbackException.getCause();
                        int i11 = WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
                        if (i11 == 1) {
                            throw cause;
                        }
                        if (i11 == 2) {
                            throw cause;
                        }
                        if (i11 == 3) {
                            throw cause;
                        }
                        if (i11 == 4) {
                            throw cause;
                        }
                        if (i11 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(z11);
                    } catch (CallbackException e11) {
                        throw e11.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        @k
        public final SupportSQLiteOpenHelper.Callback getCallback() {
            return this.callback;
        }

        @k
        public final Context getContext() {
            return this.context;
        }

        @k
        public final DBRefHolder getDbRef() {
            return this.dbRef;
        }

        @k
        public final SupportSQLiteDatabase getSupportDatabase(boolean z11) {
            SupportSQLiteDatabase wrappedDb;
            try {
                this.lock.lock((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase innerGetDatabase = innerGetDatabase(z11);
                if (this.migrated) {
                    close();
                    wrappedDb = getSupportDatabase(z11);
                } else {
                    wrappedDb = getWrappedDb(innerGetDatabase);
                }
                this.lock.unlock();
                return wrappedDb;
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }

        @k
        public final FrameworkSQLiteDatabase getWrappedDb(@k SQLiteDatabase sqLiteDatabase) {
            g0.p(sqLiteDatabase, "sqLiteDatabase");
            return Companion.getWrappedDb(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@k SQLiteDatabase db2) {
            g0.p(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.onConfigure(getWrappedDb(db2));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@k SQLiteDatabase sqLiteDatabase) {
            g0.p(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@k SQLiteDatabase db2, int i11, int i12) {
            g0.p(db2, "db");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(db2), i11, i12);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@k SQLiteDatabase db2) {
            g0.p(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(db2));
                } catch (Throwable th2) {
                    throw new CallbackException(CallbackName.ON_OPEN, th2);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@k SQLiteDatabase sqLiteDatabase, int i11, int i12) {
            g0.p(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sqLiteDatabase), i11, i12);
            } catch (Throwable th2) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public FrameworkSQLiteOpenHelper(@k Context context, @l String str, @k SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        g0.p(context, "context");
        g0.p(callback, "callback");
    }

    private final OpenHelper getDelegate() {
        return this.lazyDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenHelper lazyDelegate$lambda$0(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        OpenHelper openHelper;
        if (frameworkSQLiteOpenHelper.name == null || !frameworkSQLiteOpenHelper.useNoBackupDirectory) {
            openHelper = new OpenHelper(frameworkSQLiteOpenHelper.context, frameworkSQLiteOpenHelper.name, new DBRefHolder(null), frameworkSQLiteOpenHelper.callback, frameworkSQLiteOpenHelper.allowDataLossOnRecovery);
        } else {
            openHelper = new OpenHelper(frameworkSQLiteOpenHelper.context, new File(SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(frameworkSQLiteOpenHelper.context), frameworkSQLiteOpenHelper.name).getAbsolutePath(), new DBRefHolder(null), frameworkSQLiteOpenHelper.callback, frameworkSQLiteOpenHelper.allowDataLossOnRecovery);
        }
        openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.writeAheadLoggingEnabled);
        return openHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public String getDatabaseName() {
        return this.name;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @k
    public SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @k
    public SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z11) {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().setWriteAheadLoggingEnabled(z11);
        }
        this.writeAheadLoggingEnabled = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public FrameworkSQLiteOpenHelper(@k Context context, @l String str, @k SupportSQLiteOpenHelper.Callback callback, boolean z11) {
        this(context, str, callback, z11, false, 16, null);
        g0.p(context, "context");
        g0.p(callback, "callback");
    }

    @w00.k
    public FrameworkSQLiteOpenHelper(@k Context context, @l String str, @k SupportSQLiteOpenHelper.Callback callback, boolean z11, boolean z12) {
        g0.p(context, "context");
        g0.p(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z11;
        this.allowDataLossOnRecovery = z12;
        this.lazyDelegate = e0.c(new x00.a() { // from class: androidx.sqlite.db.framework.f
            @Override // x00.a
            public final Object invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper lazyDelegate$lambda$0;
                lazyDelegate$lambda$0 = FrameworkSQLiteOpenHelper.lazyDelegate$lambda$0(FrameworkSQLiteOpenHelper.this);
                return lazyDelegate$lambda$0;
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z11, boolean z12, int i11, v vVar) {
        this(context, str, callback, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }
}
