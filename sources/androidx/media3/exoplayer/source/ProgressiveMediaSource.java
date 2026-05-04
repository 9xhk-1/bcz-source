package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.SeekMap;
import ho.p0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final DataSource.Factory dataSourceFactory;

    @Nullable
    private final p0<ReleasableExecutor> downloadExecutorSupplier;
    private final DrmSessionManager drmSessionManager;

    @Nullable
    private Listener listener;
    private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

    @Nullable
    private final Format singleTrackFormat;
    private final int singleTrackId;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;

    @Nullable
    private TransferListener transferListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory implements MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private final DataSource.Factory dataSourceFactory;

        @Nullable
        private p0<ReleasableExecutor> downloadExecutorSupplier;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;

        @Nullable
        private Format singleTrackFormat;
        private int singleTrackId;

        public Factory(DataSource.Factory factory) {
            this(factory, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ ProgressiveMediaExtractor a(ExtractorsFactory extractorsFactory, PlayerId playerId) {
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        @uo.a
        public Factory enableLazyLoadingWithSingleTrack(int i11, Format format) {
            this.singleTrackId = i11;
            this.singleTrackFormat = (Format) Assertions.checkNotNull(format);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @uo.a
        public Factory setContinueLoadingCheckIntervalBytes(int i11) {
            this.continueLoadingCheckIntervalBytes = i11;
            return this;
        }

        @uo.a
        public <T extends Executor> Factory setDownloadExecutor(final p0<T> p0Var, final Consumer<T> consumer) {
            this.downloadExecutorSupplier = new p0() { // from class: androidx.media3.exoplayer.source.g0
                @Override // ho.p0
                public final Object get() {
                    ReleasableExecutor from;
                    from = ReleasableExecutor.from((Executor) p0.this.get(), consumer);
                    return from;
                }
            };
            return this;
        }

        public Factory(DataSource.Factory factory, final ExtractorsFactory extractorsFactory) {
            this(factory, new ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.f0
                @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
                    return ProgressiveMediaSource.Factory.a(ExtractorsFactory.this, playerId);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ProgressiveMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            return new ProgressiveMediaSource(mediaItem, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes, this.singleTrackId, this.singleTrackFormat, this.downloadExecutorSupplier);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @uo.a
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @uo.a
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2) {
            this(factory, factory2, new DefaultDrmSessionManagerProvider(), new DefaultLoadErrorHandlingPolicy(), 1048576);
        }

        public Factory(DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManagerProvider drmSessionManagerProvider, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i11) {
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = factory2;
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            this.continueLoadingCheckIntervalBytes = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onSeekMap(MediaSource mediaSource, SeekMap seekMap);
    }

    private MediaItem.LocalConfiguration getLocalConfiguration() {
        return (MediaItem.LocalConfiguration) Assertions.checkNotNull(getMediaItem().localConfiguration);
    }

    private void notifySourceInfoRefreshed() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (Object) null, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new ForwardingTimeline(singlePeriodTimeline) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource.1
                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
                    super.getPeriod(i11, period, z11);
                    period.isPlaceholder = true;
                    return period;
                }

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
                    super.getWindow(i11, window, j11);
                    window.isPlaceholder = true;
                    return window;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        return localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.imageDurationMs == localConfiguration.imageDurationMs && Objects.equals(localConfiguration2.customCacheKey, localConfiguration.customCacheKey);
    }

    public void clearListener() {
        this.listener = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        DataSource createDataSource = this.dataSourceFactory.createDataSource();
        TransferListener transferListener = this.transferListener;
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        MediaItem.LocalConfiguration localConfiguration = getLocalConfiguration();
        Uri uri = localConfiguration.uri;
        ProgressiveMediaExtractor createProgressiveMediaExtractor = this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(getPlayerId());
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        DrmSessionEventListener.EventDispatcher createDrmEventDispatcher = createDrmEventDispatcher(mediaPeriodId);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadableLoadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId);
        String str = localConfiguration.customCacheKey;
        int i11 = this.continueLoadingCheckIntervalBytes;
        int i12 = this.singleTrackId;
        Format format = this.singleTrackFormat;
        long msToUs = Util.msToUs(localConfiguration.imageDurationMs);
        p0<ReleasableExecutor> p0Var = this.downloadExecutorSupplier;
        return new ProgressiveMediaPeriod(uri, createDataSource, createProgressiveMediaExtractor, drmSessionManager, createDrmEventDispatcher, loadErrorHandlingPolicy, createEventDispatcher, this, allocator, str, i11, i12, format, msToUs, p0Var != null ? p0Var.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j11, SeekMap seekMap, boolean z11) {
        if (j11 == C.TIME_UNSET) {
            j11 = this.timelineDurationUs;
        }
        boolean isSeekable = seekMap.isSeekable();
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j11 && this.timelineIsSeekable == isSeekable && this.timelineIsLive == z11) {
            return;
        }
        this.timelineDurationUs = j11;
        this.timelineIsSeekable = isSeekable;
        this.timelineIsLive = z11;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSeekMap(this, seekMap);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.transferListener = transferListener;
        this.drmSessionManager.setPlayer((Looper) Assertions.checkNotNull(Looper.myLooper()), getPlayerId());
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private ProgressiveMediaSource(MediaItem mediaItem, DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i11, int i12, @Nullable Format format, @Nullable p0<ReleasableExecutor> p0Var) {
        this.mediaItem = mediaItem;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i11;
        this.singleTrackFormat = format;
        this.singleTrackId = i12;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = C.TIME_UNSET;
        this.downloadExecutorSupplier = p0Var;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }
}
