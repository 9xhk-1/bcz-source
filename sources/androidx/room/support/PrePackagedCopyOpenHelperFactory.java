package androidx.room.support;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class PrePackagedCopyOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    @m80.l
    private final String copyFromAssetPath;

    @m80.l
    private final File copyFromFile;

    @m80.l
    private final Callable<InputStream> copyFromInputStream;

    @m80.k
    private final SupportSQLiteOpenHelper.Factory delegate;

    public PrePackagedCopyOpenHelperFactory(@m80.l String str, @m80.l File file, @m80.l Callable<InputStream> callable, @m80.k SupportSQLiteOpenHelper.Factory delegate) {
        g0.p(delegate, "delegate");
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.delegate = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @m80.k
    public SupportSQLiteOpenHelper create(@m80.k SupportSQLiteOpenHelper.Configuration configuration) {
        g0.p(configuration, "configuration");
        return new PrePackagedCopyOpenHelper(configuration.context, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, configuration.callback.version, this.delegate.create(configuration));
    }
}
