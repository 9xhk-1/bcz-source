package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheDataSource;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private static final SparseArray<Constructor<? extends Downloader>> CONSTRUCTORS = createDownloaderConstructors();
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
        this(factory, new a());
    }

    private static SparseArray<Constructor<? extends Downloader>> createDownloaderConstructors() {
        SparseArray<Constructor<? extends Downloader>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, getDownloaderConstructor(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, getDownloaderConstructor(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, getDownloaderConstructor(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(MediaItem.class, CacheDataSource.Factory.class, Executor.class);
        } catch (NoSuchMethodException e11) {
            throw new IllegalStateException("Downloader constructor missing", e11);
        }
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (inferContentTypeForUriAndMimeType == 0 || inferContentTypeForUriAndMimeType == 1 || inferContentTypeForUriAndMimeType == 2) {
            return createDownloader(downloadRequest, inferContentTypeForUriAndMimeType);
        }
        if (inferContentTypeForUriAndMimeType == 4) {
            return new ProgressiveDownloader(new MediaItem.Builder().setUri(downloadRequest.uri).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor);
        }
        throw new IllegalArgumentException("Unsupported type: " + inferContentTypeForUriAndMimeType);
    }

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
        this.cacheDataSourceFactory = (CacheDataSource.Factory) Assertions.checkNotNull(factory);
        this.executor = (Executor) Assertions.checkNotNull(executor);
    }

    private Downloader createDownloader(DownloadRequest downloadRequest, int i11) {
        Constructor<? extends Downloader> constructor = CONSTRUCTORS.get(i11);
        if (constructor != null) {
            try {
                return constructor.newInstance(new MediaItem.Builder().setUri(downloadRequest.uri).setStreamKeys(downloadRequest.streamKeys).setCustomCacheKey(downloadRequest.customCacheKey).build(), this.cacheDataSourceFactory, this.executor);
            } catch (Exception e11) {
                throw new IllegalStateException("Failed to instantiate downloader for content type " + i11, e11);
            }
        }
        throw new IllegalStateException("Module missing for content type " + i11);
    }
}
