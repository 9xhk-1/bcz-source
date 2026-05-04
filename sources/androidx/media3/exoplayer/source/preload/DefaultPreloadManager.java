package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.PlaybackLooperProvider;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.y0;
import ho.i0;
import ho.p0;
import ho.r0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultPreloadManager extends BasePreloadManager<Integer> {
    private final boolean deprecatedConstructorCalled;
    private final Handler preloadHandler;
    private final PlaybackLooperProvider preloadLooperProvider;
    private final PreloadMediaSource.Factory preloadMediaSourceFactory;
    private final RendererCapabilitiesList rendererCapabilitiesList;
    private final TrackSelector trackSelector;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder extends BasePreloadManager.BuilderBase<Integer> {
        private p0<BandwidthMeter> bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private final Context context;
        private p0<LoadControl> loadControlSupplier;
        private PlaybackLooperProvider preloadLooperProvider;
        private p0<RenderersFactory> renderersFactorySupplier;
        private TrackSelector.Factory trackSelectorFactory;

        public Builder(final Context context, TargetPreloadStatusControl<Integer> targetPreloadStatusControl) {
            super(new RankingDataComparator(), targetPreloadStatusControl, r0.b(new p0() { // from class: androidx.media3.exoplayer.source.preload.l
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.d(context);
                }
            }));
            this.context = context;
            this.preloadLooperProvider = new PlaybackLooperProvider();
            this.trackSelectorFactory = new TrackSelector.Factory() { // from class: androidx.media3.exoplayer.source.preload.m
                @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
                public final TrackSelector createTrackSelector(Context context2) {
                    return new DefaultTrackSelector(context2);
                }
            };
            this.bandwidthMeterSupplier = new p0() { // from class: androidx.media3.exoplayer.source.preload.n
                @Override // ho.p0
                public final Object get() {
                    BandwidthMeter singletonInstance;
                    singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            };
            this.renderersFactorySupplier = r0.b(new p0() { // from class: androidx.media3.exoplayer.source.preload.o
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.e(context);
                }
            });
            this.loadControlSupplier = r0.b(new y0());
        }

        public static /* synthetic */ MediaSource.Factory d(Context context) {
            return new DefaultMediaSourceFactory(context);
        }

        public static /* synthetic */ RenderersFactory e(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new ExoPlayer.Builder(this.context));
        }

        @uo.a
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.bandwidthMeterSupplier = new p0() { // from class: androidx.media3.exoplayer.source.preload.k
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.a(BandwidthMeter.this);
                }
            };
            return this;
        }

        @uo.a
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new p0() { // from class: androidx.media3.exoplayer.source.preload.i
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.f(LoadControl.this);
                }
            };
            return this;
        }

        @uo.a
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new p0() { // from class: androidx.media3.exoplayer.source.preload.p
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.c(MediaSource.Factory.this);
                }
            };
            return this;
        }

        @uo.a
        public Builder setPreloadLooper(Looper looper) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.preloadLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @uo.a
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new p0() { // from class: androidx.media3.exoplayer.source.preload.j
                @Override // ho.p0
                public final Object get() {
                    return DefaultPreloadManager.Builder.g(RenderersFactory.this);
                }
            };
            return this;
        }

        @uo.a
        public Builder setTrackSelectorFactory(TrackSelector.Factory factory) {
            Assertions.checkState((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public BasePreloadManager<Integer> build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new DefaultPreloadManager(this);
        }

        public ExoPlayer buildExoPlayer(ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory(this.mediaSourceFactorySupplier.get()).setBandwidthMeter(this.bandwidthMeterSupplier.get()).setRenderersFactory(this.renderersFactorySupplier.get()).setLoadControl(this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }

        public static /* synthetic */ BandwidthMeter a(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ MediaSource.Factory c(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ LoadControl f(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ RenderersFactory g(RenderersFactory renderersFactory) {
            return renderersFactory;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RankingDataComparator implements Comparator<Integer> {
        public int currentPlayingIndex = -1;

        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue() - this.currentPlayingIndex), Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
        private SourcePreloadControl() {
        }

        public static /* synthetic */ boolean a(long j11, Status status) {
            return status.getStage() == 2 && status.getValue() > Util.usToMs(j11);
        }

        public static /* synthetic */ boolean b(Status status) {
            return status.getStage() > 1;
        }

        public static /* synthetic */ boolean c(Status status) {
            return status.getStage() > 0;
        }

        private boolean continueOrCompletePreloading(PreloadMediaSource preloadMediaSource, i0<Status> i0Var, boolean z11) {
            TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = DefaultPreloadManager.this.getTargetPreloadStatus(preloadMediaSource);
            if (targetPreloadStatus == null) {
                DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
                return false;
            }
            if (i0Var.apply((Status) Assertions.checkNotNull((Status) targetPreloadStatus))) {
                return true;
            }
            if (z11) {
                DefaultPreloadManager.this.clearSourceInternal(preloadMediaSource);
            }
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
            return false;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, final long j11) {
            return continueOrCompletePreloading(preloadMediaSource, new i0() { // from class: androidx.media3.exoplayer.source.preload.s
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.a(j11, (DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadCompleted(preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(PreloadException preloadException, PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadError(preloadException, preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new i0() { // from class: androidx.media3.exoplayer.source.preload.r
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.c((DefaultPreloadManager.Status) obj);
                }
            }, true);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new i0() { // from class: androidx.media3.exoplayer.source.preload.q
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return DefaultPreloadManager.SourcePreloadControl.b((DefaultPreloadManager.Status) obj);
                }
            }, false);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(PreloadMediaSource preloadMediaSource) {
            DefaultPreloadManager.this.onPreloadSkipped(preloadMediaSource);
        }
    }

    public static /* synthetic */ void h(DefaultPreloadManager defaultPreloadManager) {
        defaultPreloadManager.rendererCapabilitiesList.release();
        if (!defaultPreloadManager.deprecatedConstructorCalled) {
            defaultPreloadManager.trackSelector.release();
        }
        defaultPreloadManager.preloadLooperProvider.releaseLooper();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void clearSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).clear();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return this.preloadMediaSourceFactory.createMediaSource(mediaSource);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadSourceInternal(MediaSource mediaSource, long j11) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).preload(j11);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseInternal() {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.g
            @Override // java.lang.Runnable
            public final void run() {
                DefaultPreloadManager.h(DefaultPreloadManager.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseSourceInternal(MediaSource mediaSource) {
        Assertions.checkArgument(mediaSource instanceof PreloadMediaSource);
        ((PreloadMediaSource) mediaSource).releasePreloadMediaSource();
    }

    public void setCurrentPlayingIndex(int i11) {
        ((RankingDataComparator) this.rankingDataComparator).currentPlayingIndex = i11;
    }

    private DefaultPreloadManager(Builder builder) {
        super(new RankingDataComparator(), builder.targetPreloadStatusControl, builder.mediaSourceFactorySupplier.get());
        DefaultRendererCapabilitiesList createRendererCapabilitiesList = new DefaultRendererCapabilitiesList.Factory((RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = createRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        TrackSelector createTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = createTrackSelector;
        BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
        createTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: androidx.media3.exoplayer.source.preload.h
            @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DefaultPreloadManager.g();
            }
        }, bandwidthMeter);
        Looper obtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(builder.mediaSourceFactorySupplier.get(), new SourcePreloadControl(), createTrackSelector, bandwidthMeter, createRendererCapabilitiesList.getRendererCapabilities(), ((LoadControl) builder.loadControlSupplier.get()).getAllocator(), obtainLooper);
        this.preloadHandler = Util.createHandler(obtainLooper, null);
        this.deprecatedConstructorCalled = false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Status implements TargetPreloadStatusControl.PreloadStatus {
        public static final int STAGE_LOADED_FOR_DURATION_MS = 2;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_TRACKS_SELECTED = 1;
        private final int stage;
        private final long value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        public Status(int i11, long j11) {
            this.stage = i11;
            this.value = j11;
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public int getStage() {
            return this.stage;
        }

        @Override // androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus
        public long getValue() {
            return this.value;
        }

        public Status(int i11) {
            this(i11, C.TIME_UNSET);
        }
    }

    public static /* synthetic */ void g() {
    }

    @Deprecated
    public DefaultPreloadManager(TargetPreloadStatusControl<Integer> targetPreloadStatusControl, MediaSource.Factory factory, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilitiesList.Factory factory2, Allocator allocator, Looper looper) {
        super(new RankingDataComparator(), targetPreloadStatusControl, factory);
        RendererCapabilitiesList createRendererCapabilitiesList = factory2.createRendererCapabilitiesList();
        this.rendererCapabilitiesList = createRendererCapabilitiesList;
        PlaybackLooperProvider playbackLooperProvider = new PlaybackLooperProvider(looper);
        this.preloadLooperProvider = playbackLooperProvider;
        this.trackSelector = trackSelector;
        Looper obtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new PreloadMediaSource.Factory(factory, new SourcePreloadControl(), trackSelector, bandwidthMeter, createRendererCapabilitiesList.getRendererCapabilities(), allocator, obtainLooper);
        this.preloadHandler = Util.createHandler(obtainLooper, null);
        this.deprecatedConstructorCalled = true;
    }
}
