package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import com.google.common.util.concurrent.p1;
import com.google.common.util.concurrent.t1;
import com.google.common.util.concurrent.w1;
import ho.p0;
import ho.r0;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final p0<t1> DEFAULT_EXECUTOR_SERVICE = r0.b(new p0() { // from class: androidx.media3.datasource.d
        @Override // ho.p0
        public final Object get() {
            t1 j11;
            j11 = w1.j(Executors.newSingleThreadExecutor());
            return j11;
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final t1 listeningExecutorService;
    private final int maximumOutputDimension;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((t1) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    public static /* synthetic */ Bitmap a(DataSourceBitmapLoader dataSourceBitmapLoader, byte[] bArr) {
        dataSourceBitmapLoader.getClass();
        return BitmapUtil.decode(bArr, bArr.length, dataSourceBitmapLoader.options, dataSourceBitmapLoader.maximumOutputDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options, int i11) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] readToEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(readToEnd, readToEnd.length, options, i11);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public p1<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DataSourceBitmapLoader.a(DataSourceBitmapLoader.this, bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public p1<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap load;
                load = DataSourceBitmapLoader.load(r0.dataSourceFactory.createDataSource(), uri, r0.options, DataSourceBitmapLoader.this.maximumOutputDimension);
                return load;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(t1 t1Var, DataSource.Factory factory) {
        this(t1Var, factory, null);
    }

    public DataSourceBitmapLoader(t1 t1Var, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this(t1Var, factory, options, -1);
    }

    public DataSourceBitmapLoader(t1 t1Var, DataSource.Factory factory, @Nullable BitmapFactory.Options options, int i11) {
        this.listeningExecutorService = t1Var;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i11;
    }
}
