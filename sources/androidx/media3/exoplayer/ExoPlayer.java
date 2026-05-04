package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import ho.r;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        r<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        ho.p0<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        ho.p0<LoadControl> loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        ho.p0<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        ho.p0<RenderersFactory> renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        ho.p0<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, (ho.p0<RenderersFactory>) new ho.p0() { // from class: androidx.media3.exoplayer.j0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.b(context);
                }
            }, (ho.p0<MediaSource.Factory>) new ho.p0() { // from class: androidx.media3.exoplayer.k0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.e(context);
                }
            });
        }

        public static /* synthetic */ RenderersFactory b(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ MediaSource.Factory d(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ MediaSource.Factory e(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ RenderersFactory k(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ TrackSelector u(Context context) {
            return new DefaultTrackSelector(context);
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @UnstableApi
        @uo.a
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder experimentalSetForegroundModeTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new r() { // from class: androidx.media3.exoplayer.i0
                @Override // ho.r
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.r(AnalyticsCollector.this, (Clock) obj);
                }
            };
            return this;
        }

        @uo.a
        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new ho.p0() { // from class: androidx.media3.exoplayer.s0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.t(BandwidthMeter.this);
                }
            };
            return this;
        }

        @VisibleForTesting
        @UnstableApi
        @uo.a
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setDetachSurfaceTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setDeviceVolumeControlEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z11;
            return this;
        }

        @uo.a
        public Builder setHandleAudioBecomingNoisy(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new ho.p0() { // from class: androidx.media3.exoplayer.h0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.g(LoadControl.this);
                }
            };
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setMaxSeekToPreviousPositionMs(@IntRange(from = 0) long j11) {
            Assertions.checkArgument(j11 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j11;
            return this;
        }

        @uo.a
        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new ho.p0() { // from class: androidx.media3.exoplayer.e1
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.h(MediaSource.Factory.this);
                }
            };
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setPauseAtEndOfMediaItems(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        @uo.a
        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setPriority(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setReleaseTimeoutMs(long j11) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new ho.p0() { // from class: androidx.media3.exoplayer.l0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.a(RenderersFactory.this);
                }
            };
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setSeekBackIncrementMs(@IntRange(from = 1) long j11) {
            Assertions.checkArgument(j11 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setSeekForwardIncrementMs(@IntRange(from = 1) long j11) {
            Assertions.checkArgument(j11 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setSkipSilenceEnabled(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z11;
            return this;
        }

        @VisibleForTesting
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @UnstableApi
        @uo.a
        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            Assertions.checkState(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new ho.p0() { // from class: androidx.media3.exoplayer.d1
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.m(TrackSelector.this);
                }
            };
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setUseLazyPreparation(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setUsePlatformDiagnostics(boolean z11) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setVideoChangeFrameRateStrategy(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i11;
            return this;
        }

        @UnstableApi
        @uo.a
        public Builder setVideoScalingMode(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i11;
            return this;
        }

        @uo.a
        public Builder setWakeMode(int i11) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i11;
            return this;
        }

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (ho.p0<RenderersFactory>) new ho.p0() { // from class: androidx.media3.exoplayer.o0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.q(RenderersFactory.this);
                }
            }, (ho.p0<MediaSource.Factory>) new ho.p0() { // from class: androidx.media3.exoplayer.p0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.d(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (ho.p0<RenderersFactory>) new ho.p0() { // from class: androidx.media3.exoplayer.b1
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.k(context);
                }
            }, (ho.p0<MediaSource.Factory>) new ho.p0() { // from class: androidx.media3.exoplayer.c1
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.c(MediaSource.Factory.this);
                }
            });
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (ho.p0<RenderersFactory>) new ho.p0() { // from class: androidx.media3.exoplayer.m0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.f(RenderersFactory.this);
                }
            }, (ho.p0<MediaSource.Factory>) new ho.p0() { // from class: androidx.media3.exoplayer.n0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.j(MediaSource.Factory.this);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (ho.p0<RenderersFactory>) new ho.p0() { // from class: androidx.media3.exoplayer.q0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.n(RenderersFactory.this);
                }
            }, (ho.p0<MediaSource.Factory>) new ho.p0() { // from class: androidx.media3.exoplayer.r0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.p(MediaSource.Factory.this);
                }
            }, (ho.p0<TrackSelector>) new ho.p0() { // from class: androidx.media3.exoplayer.t0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.s(TrackSelector.this);
                }
            }, (ho.p0<LoadControl>) new ho.p0() { // from class: androidx.media3.exoplayer.u0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.v(LoadControl.this);
                }
            }, (ho.p0<BandwidthMeter>) new ho.p0() { // from class: androidx.media3.exoplayer.v0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.i(BandwidthMeter.this);
                }
            }, (r<Clock, AnalyticsCollector>) new r() { // from class: androidx.media3.exoplayer.w0
                @Override // ho.r
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.o(AnalyticsCollector.this, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, ho.p0<RenderersFactory> p0Var, ho.p0<MediaSource.Factory> p0Var2) {
            this(context, p0Var, p0Var2, (ho.p0<TrackSelector>) new ho.p0() { // from class: androidx.media3.exoplayer.x0
                @Override // ho.p0
                public final Object get() {
                    return ExoPlayer.Builder.u(context);
                }
            }, new y0(), (ho.p0<BandwidthMeter>) new ho.p0() { // from class: androidx.media3.exoplayer.z0
                @Override // ho.p0
                public final Object get() {
                    BandwidthMeter singletonInstance;
                    singletonInstance = DefaultBandwidthMeter.getSingletonInstance(context);
                    return singletonInstance;
                }
            }, (r<Clock, AnalyticsCollector>) new r() { // from class: androidx.media3.exoplayer.a1
                @Override // ho.r
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, ho.p0<RenderersFactory> p0Var, ho.p0<MediaSource.Factory> p0Var2, ho.p0<TrackSelector> p0Var3, ho.p0<LoadControl> p0Var4, ho.p0<BandwidthMeter> p0Var5, r<Clock, AnalyticsCollector> rVar) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = p0Var;
            this.mediaSourceFactorySupplier = p0Var2;
            this.trackSelectorSupplier = p0Var3;
            this.loadControlSupplier = p0Var4;
            this.bandwidthMeterSupplier = p0Var5;
            this.analyticsCollectorFunction = rVar;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
        }

        public static /* synthetic */ RenderersFactory a(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ MediaSource.Factory c(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory f(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ LoadControl g(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ MediaSource.Factory h(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ BandwidthMeter i(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ MediaSource.Factory j(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ TrackSelector m(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ RenderersFactory n(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ MediaSource.Factory p(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory q(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ TrackSelector s(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ BandwidthMeter t(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ LoadControl v(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ AnalyticsCollector o(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ AnalyticsCollector r(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j11) {
            this.targetPreloadDurationUs = j11;
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i11, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i11, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i11);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i11);

    @Nullable
    @UnstableApi
    default Renderer getSecondaryRenderer(int i11) {
        return null;
    }

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z11, boolean z12);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i11, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i11, int i12, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i11);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z11);

    void setHandleAudioBecomingNoisy(boolean z11);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j11);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z11);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i11, long j11);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z11);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z11);

    @RequiresApi(23)
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i11);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z11);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i11);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i11);

    void setWakeMode(int i11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z11) {
        }

        default void onSleepingForOffloadChanged(boolean z11) {
        }
    }
}
