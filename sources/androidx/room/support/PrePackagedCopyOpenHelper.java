package androidx.room.support;

import android.content.Context;
import android.util.Log;
import androidx.room.DatabaseConfiguration;
import androidx.room.DelegatingOpenHelper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import g10.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class PrePackagedCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @m80.k
    private final Context context;

    @m80.l
    private final String copyFromAssetPath;

    @m80.l
    private final File copyFromFile;

    @m80.l
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;

    @m80.k
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public PrePackagedCopyOpenHelper(@m80.k Context context, @m80.l String str, @m80.l File file, @m80.l Callable<InputStream> callable, int i11, @m80.k SupportSQLiteOpenHelper delegate) {
        g0.p(context, "context");
        g0.p(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i11;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File file, boolean z11) throws IOException {
        ReadableByteChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
            } catch (Exception e11) {
                throw new IOException("inputStreamCallable exception on call", e11);
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        g0.m(channel);
        FileUtil.copy(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        g0.m(createTempFile);
        dispatchOnOpenPrepackagedDatabase(createTempFile, z11);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        try {
            final int readVersion = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder name = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            final int u11 = u.u(readVersion, 1);
            return frameworkSQLiteOpenHelperFactory.create(name.callback(new SupportSQLiteOpenHelper.Callback(u11) { // from class: androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase db2) {
                    g0.p(db2, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase db2) {
                    g0.p(db2, "db");
                    int i11 = readVersion;
                    if (i11 < 1) {
                        db2.setVersion(i11);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase db2, int i11, int i12) {
                    g0.p(db2, "db");
                }
            }).build());
        } catch (IOException e11) {
            throw new RuntimeException("Malformed database file, unable to read version.", e11);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z11) {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            g0.S("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            SupportSQLiteDatabase writableDatabase = z11 ? createFrameworkOpenHelper.getWritableDatabase() : createFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                g0.S("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            g0.m(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            g2 g2Var = g2.f100423a;
            r00.b.a(createFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z11) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            g0.S("databaseConfiguration");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    g0.m(databasePath);
                    copyDatabaseFile(databasePath, z11);
                    processLock.unlock();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            }
            try {
                g0.m(databasePath);
                int readVersion = DBUtil.readVersion(databasePath);
                if (readVersion == this.databaseVersion) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    g0.S("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(readVersion, this.databaseVersion)) {
                    processLock.unlock();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z11);
                        g2 g2Var = g2.f100423a;
                    } catch (IOException e12) {
                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e12);
                    }
                } else {
                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (IOException e13) {
                Log.w(Room.LOG_TAG, "Unable to read database version.", e13);
                processLock.unlock();
                return;
            }
        } catch (Throwable th2) {
            processLock.unlock();
            throw th2;
        }
        processLock.unlock();
        throw th2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.l
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @m80.k
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.k
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m80.k
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@m80.k DatabaseConfiguration databaseConfiguration) {
        g0.p(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z11) {
        getDelegate().setWriteAheadLoggingEnabled(z11);
    }
}
