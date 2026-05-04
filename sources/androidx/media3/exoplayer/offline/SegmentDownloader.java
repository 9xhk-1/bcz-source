package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;
    private final ArrayList<StreamKey> streamKeys;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j11, int i11, long j12, int i12) {
            this.progressListener = progressListener;
            this.contentLength = j11;
            this.totalSegments = i11;
            this.bytesDownloaded = j12;
            this.segmentsDownloaded = i12;
        }

        private float getPercentDownloaded() {
            long j11 = this.contentLength;
            if (j11 != -1 && j11 != 0) {
                return (this.bytesDownloaded * 100.0f) / j11;
            }
            int i11 = this.totalSegments;
            if (i11 != 0) {
                return (this.segmentsDownloaded * 100.0f) / i11;
            }
            return -1.0f;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j11, long j12, long j13) {
            long j14 = this.bytesDownloaded + j13;
            this.bytesDownloaded = j14;
            this.progressListener.onProgress(this.contentLength, j14, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j11, DataSpec dataSpec) {
            this.startTimeUs = j11;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.compareLong(this.startTimeUs, segment.startTimeUs);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;

        @Nullable
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, @Nullable ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        public Void doWork() throws IOException {
            this.cacheWriter.cache();
            ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }
    }

    @Deprecated
    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) throws InterruptedException {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(runnableFutureTask);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j11 = dataSpec.length;
        return j11 != -1 && dataSpec.position + j11 == dataSpec2.position && Objects.equals(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    public static DataSpec getCompressibleDataSpec(Uri uri) {
        return new DataSpec.Builder().setUri(uri).setFlags(1).build();
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j11) {
        HashMap hashMap = new HashMap();
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Segment segment = list.get(i12);
            String buildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) hashMap.get(buildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j11 || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                hashMap.put(buildCacheKey, Integer.valueOf(i11));
                list.set(i11, segment);
                i11++;
            } else {
                long j12 = segment.dataSpec.length;
                list.set(((Integer) Assertions.checkNotNull(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.subrange(0L, j12 != -1 ? segment2.dataSpec.length + j12 : -1L)));
            }
        }
        Util.removeRange(list, i11, list.size());
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i11 = 0; i11 < this.activeRunnables.size(); i11++) {
                    this.activeRunnables.get(i11).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void download(@Nullable Downloader.ProgressListener progressListener) throws IOException, InterruptedException {
        CacheDataSource createDataSourceForDownloading;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        try {
            CacheDataSource createDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
            FilterableManifest manifest = getManifest(createDataSourceForDownloading2, this.manifestDataSpec, false);
            if (!this.streamKeys.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(this.streamKeys);
            }
            List<Segment> segments = getSegments(createDataSourceForDownloading2, manifest, false);
            Collections.sort(segments);
            mergeSegments(segments, this.cacheKeyFactory, this.maxMergedSegmentStartTimeDiffUs);
            int size = segments.size();
            int i11 = 0;
            long j11 = 0;
            long j12 = 0;
            for (int size2 = segments.size() - 1; size2 >= 0; size2--) {
                DataSpec dataSpec = segments.get(size2).dataSpec;
                String buildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
                long j13 = dataSpec.length;
                if (j13 == -1) {
                    long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(buildCacheKey));
                    if (contentLength != -1) {
                        j13 = contentLength - dataSpec.position;
                    }
                }
                long j14 = j13;
                long cachedBytes = this.cache.getCachedBytes(buildCacheKey, dataSpec.position, j14);
                j12 += cachedBytes;
                if (j14 != -1) {
                    if (j14 == cachedBytes) {
                        i11++;
                        segments.remove(size2);
                    }
                    if (j11 != -1) {
                        j11 += j14;
                    }
                } else {
                    j11 = -1;
                }
            }
            ProgressNotifier progressNotifier = progressListener != null ? new ProgressNotifier(progressListener, j11, size, j12, i11) : null;
            arrayDeque.addAll(segments);
            while (!this.isCanceled && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                if (arrayDeque2.isEmpty()) {
                    createDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    SegmentDownloadRunnable segmentDownloadRunnable = (SegmentDownloadRunnable) arrayDeque2.removeFirst();
                    createDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                    bArr = segmentDownloadRunnable.temporaryBuffer;
                }
                SegmentDownloadRunnable segmentDownloadRunnable2 = new SegmentDownloadRunnable((Segment) arrayDeque.removeFirst(), createDataSourceForDownloading, progressNotifier, bArr);
                addActiveRunnable(segmentDownloadRunnable2);
                this.executor.execute(segmentDownloadRunnable2);
                for (int size3 = this.activeRunnables.size() - 1; size3 >= 0; size3--) {
                    SegmentDownloadRunnable segmentDownloadRunnable3 = (SegmentDownloadRunnable) this.activeRunnables.get(size3);
                    if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                        try {
                            segmentDownloadRunnable3.get();
                            removeActiveRunnable(size3);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } catch (ExecutionException e11) {
                            Throwable th2 = (Throwable) Assertions.checkNotNull(e11.getCause());
                            if (th2 instanceof PriorityTaskManager.PriorityTooLowException) {
                                arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                                removeActiveRunnable(size3);
                                arrayDeque2.addLast(segmentDownloadRunnable3);
                            } else {
                                if (th2 instanceof IOException) {
                                    throw ((IOException) th2);
                                }
                                Util.sneakyThrow(th2);
                            }
                        }
                    }
                }
                segmentDownloadRunnable2.blockUntilStarted();
            }
            for (int i12 = 0; i12 < this.activeRunnables.size(); i12++) {
                this.activeRunnables.get(i12).cancel(true);
            }
            for (int size4 = this.activeRunnables.size() - 1; size4 >= 0; size4--) {
                this.activeRunnables.get(size4).blockUntilFinished();
                removeActiveRunnable(size4);
            }
            PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
            if (priorityTaskManager3 != null) {
                priorityTaskManager3.remove(-4000);
            }
        } catch (Throwable th3) {
            for (int i13 = 0; i13 < this.activeRunnables.size(); i13++) {
                this.activeRunnables.get(i13).cancel(true);
            }
            for (int size5 = this.activeRunnables.size() - 1; size5 >= 0; size5--) {
                this.activeRunnables.get(size5).blockUntilFinished();
                removeActiveRunnable(size5);
            }
            PriorityTaskManager priorityTaskManager4 = this.priorityTaskManager;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.remove(-4000);
            }
            throw th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|28|29|(2:34|(2:36|37)(3:38|39|40))(2:31|32)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r0 = (java.lang.Throwable) androidx.media3.common.util.Assertions.checkNotNull(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if ((r0 instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        androidx.media3.common.util.Util.sneakyThrow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        r3.blockUntilFinished();
        removeActiveRunnable((androidx.media3.common.util.RunnableFutureTask<?, ?>) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T execute(androidx.media3.common.util.RunnableFutureTask<T, ?> r3, boolean r4) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r2 = this;
            if (r4 == 0) goto L20
            r3.run()
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> La
            return r3
        La:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Object r0 = androidx.media3.common.util.Assertions.checkNotNull(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1d
            androidx.media3.common.util.Util.sneakyThrow(r4)
            goto L20
        L1d:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L20:
            boolean r4 = r2.isCanceled
            if (r4 != 0) goto L6a
            androidx.media3.common.PriorityTaskManager r4 = r2.priorityTaskManager
            if (r4 == 0) goto L2d
            r0 = -4000(0xfffffffffffff060, float:NaN)
            r4.proceed(r0)
        L2d:
            r2.addActiveRunnable(r3)
            java.util.concurrent.Executor r4 = r2.executor
            r4.execute(r3)
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L42
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            return r4
        L40:
            r4 = move-exception
            goto L63
        L42:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = androidx.media3.common.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof androidx.media3.common.PriorityTaskManager.PriorityTooLowException     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L52
            goto L59
        L52:
            boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L60
            androidx.media3.common.util.Util.sneakyThrow(r4)     // Catch: java.lang.Throwable -> L40
        L59:
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            goto L20
        L60:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L63:
            r3.blockUntilFinished()
            r2.removeActiveRunnable(r3)
            throw r4
        L6a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.SegmentDownloader.execute(androidx.media3.common.util.RunnableFutureTask, boolean):java.lang.Object");
    }

    public final M getManifest(final DataSource dataSource, final DataSpec dataSpec, boolean z11) throws InterruptedException, IOException {
        return (M) execute(new RunnableFutureTask<M, IOException>() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() throws IOException {
                return (M) ParsingLoadable.load(dataSource, SegmentDownloader.this.manifestParser, dataSpec, 4);
            }
        }, z11);
    }

    public abstract List<Segment> getSegments(DataSource dataSource, M m11, boolean z11) throws IOException, InterruptedException;

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource createDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                List<Segment> segments = getSegments(createDataSourceForRemovingDownload, getManifest(createDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                for (int i11 = 0; i11 < segments.size(); i11++) {
                    this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i11).dataSpec));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j11) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.cache = (Cache) Assertions.checkNotNull(factory.getCache());
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = Util.msToUs(j11);
    }

    private void removeActiveRunnable(int i11) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i11);
        }
    }
}
