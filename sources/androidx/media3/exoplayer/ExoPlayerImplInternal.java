package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.AudioFocusManager;
import androidx.media3.exoplayer.DefaultMediaClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender, AudioFocusManager.PlayerControl {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = Util.usToMs(10000);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_AUDIO_FOCUS_PLAYER_COMMAND = 33;
    private static final int MSG_AUDIO_FOCUS_VOLUME_MULTIPLIER = 34;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_AUDIO_ATTRIBUTES = 31;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SET_VIDEO_OUTPUT = 30;
    private static final int MSG_SET_VOLUME = 32;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper applicationLooperHandler;
    private final AudioFocusManager audioFocusManager;
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final boolean hasSecondaryRenderers;
    private boolean isPrewarmingDisabledUntilNextTransition;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;

    @Nullable
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;

    @Nullable
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final PlaybackLooperProvider playbackLooperProvider;
    private final PlayerId playerId;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final RendererHolder[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;
    private long prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
    private float volume = 1.0f;
    private long playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
    private long lastRebufferRealtimeMs = C.TIME_UNSET;
    private Timeline lastPreloadPoolInvalidationTimeline = Timeline.EMPTY;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i11, long j11) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i11;
            this.positionUs = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i11, int i12, int i13, ShuffleOrder shuffleOrder) {
            this.fromIndex = i11;
            this.toIndex = i12;
            this.newFromIndex = i13;
            this.shuffleOrder = shuffleOrder;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;

        @Nullable
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i11, long j11, Object obj) {
            this.resolvedPeriodIndex = i11;
            this.resolvedPeriodTimeUs = j11;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i11 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i11 != 0 ? i11 : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i11) {
            this.hasPendingChange |= i11 > 0;
            this.operationAcks += i11;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i11) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i11 == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j11;
            this.requestedContentPositionUs = j12;
            this.forceBufferingState = z11;
            this.endPlayback = z12;
            this.setTargetLiveOffset = z13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i11, long j11) {
            this.timeline = timeline;
            this.windowIndex = i11;
            this.windowPositionUs = j11;
        }
    }

    public ExoPlayerImplInternal(Context context, Renderer[] rendererArr, Renderer[] rendererArr2, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i11, boolean z11, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j11, boolean z12, boolean z13, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId, @Nullable PlaybackLooperProvider playbackLooperProvider, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i11;
        this.shuffleModeEnabled = z11;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j11;
        this.setForegroundModeTimeoutMs = j11;
        this.pauseAtEndOfWindow = z12;
        this.dynamicSchedulingEnabled = z13;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        PlaybackInfo createDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = createDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(createDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        this.renderers = new RendererHolder[rendererArr.length];
        boolean z14 = false;
        for (int i12 = 0; i12 < rendererArr.length; i12++) {
            rendererArr[i12].init(i12, playerId, clock);
            this.rendererCapabilities[i12] = rendererArr[i12].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i12].setListener(rendererCapabilitiesListener);
            }
            Renderer renderer = rendererArr2[i12];
            if (renderer != null) {
                renderer.init(rendererArr.length + i12, playerId, clock);
                z14 = true;
            }
            this.renderers[i12] = new RendererHolder(rendererArr[i12], rendererArr2[i12], i12);
        }
        this.hasSecondaryRenderers = z14;
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        HandlerWrapper createHandler = clock.createHandler(looper, null);
        this.applicationLooperHandler = createHandler;
        this.queue = new MediaPeriodQueue(analyticsCollector, createHandler, new MediaPeriodHolder.Factory() { // from class: androidx.media3.exoplayer.x2
            @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
            public final MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j12) {
                MediaPeriodHolder createMediaPeriodHolder;
                createMediaPeriodHolder = ExoPlayerImplInternal.this.createMediaPeriodHolder(mediaPeriodInfo, j12);
                return createMediaPeriodHolder;
            }
        }, preloadConfiguration);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, createHandler, playerId);
        PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        Looper obtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = obtainLooper;
        this.handler = clock.createHandler(obtainLooper, this);
        this.audioFocusManager = new AudioFocusManager(context, obtainLooper, this);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i11) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i11 == -1) {
            i11 = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i11, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                this.renderers[i11].enableMayRenderStartOfStream();
            }
        }
    }

    private boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (RendererHolder rendererHolder : this.renderers) {
            if (rendererHolder.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
        reselectTracksInternalAndSeek();
    }

    public static /* synthetic */ void c(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        exoPlayerImplInternal.getClass();
        try {
            exoPlayerImplInternal.deliverMessage(playerMessage);
        } catch (ExoPlaybackException e11) {
            Log.e(TAG, "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaPeriodHolder createMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, long j11) {
        return new MediaPeriodHolder(this.rendererCapabilities, j11, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs);
    }

    private void deliverMessage(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableAndResetPrewarmingRenderers() {
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (RendererHolder rendererHolder : this.renderers) {
                int enabledRendererCount = rendererHolder.getEnabledRendererCount();
                rendererHolder.disablePrewarming(this.mediaClock);
                this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            }
            this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
        }
    }

    private void disableRenderer(int i11) throws ExoPlaybackException {
        int enabledRendererCount = this.renderers[i11].getEnabledRendererCount();
        this.renderers[i11].disable(this.mediaClock);
        maybeTriggerOnRendererReadyChanged(i11, false);
        this.enabledRendererCount -= enabledRendererCount;
    }

    private void disableRenderers() throws ExoPlaybackException {
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            disableRenderer(i11);
        }
        this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r11 <= r17.playbackInfo.positionUs) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doSomeWork() throws androidx.media3.exoplayer.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.doSomeWork():void");
    }

    private void enableRenderer(MediaPeriodHolder mediaPeriodHolder, int i11, boolean z11, long j11) throws ExoPlaybackException {
        RendererHolder rendererHolder = this.renderers[i11];
        if (rendererHolder.isRendererEnabled()) {
            return;
        }
        boolean z12 = mediaPeriodHolder == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i11];
        ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i11];
        boolean z13 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z14 = !z11 && z13;
        this.enabledRendererCount++;
        rendererHolder.enable(rendererConfiguration, exoTrackSelection, mediaPeriodHolder.sampleStreams[i11], this.rendererPositionUs, z14, z12, j11, mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.f4604id, this.mediaClock);
        rendererHolder.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (ExoPlayerImplInternal.this.dynamicSchedulingEnabled || ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        }, mediaPeriodHolder);
        if (z13 && z12) {
            rendererHolder.start();
        }
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z11 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    aVar.g(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.g(metadata);
                    z11 = true;
                }
            }
        }
        return z11 ? aVar.e() : ImmutableList.of();
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j11) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (j11 + this.period.getPositionInWindowUs());
            }
        }
        return C.TIME_UNSET;
    }

    private long getMaxRendererReadPositionUs(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long rendererOffset = mediaPeriodHolder.getRendererOffset();
        if (!mediaPeriodHolder.prepared) {
            return rendererOffset;
        }
        int i11 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i11 >= rendererHolderArr.length) {
                return rendererOffset;
            }
            if (rendererHolderArr[i11].isReadingFromPeriod(mediaPeriodHolder)) {
                long readingPositionUs = this.renderers[i11].getReadingPositionUs(mediaPeriodHolder);
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i11++;
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long longValue = ((Long) periodPositionUs.second).longValue();
        if (resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            longValue = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(resolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return Pair.create(resolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(longValue));
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handleAudioFocusPlayerCommandInternal(int i11) throws ExoPlaybackException {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, i11, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void handleAudioFocusVolumeMultiplierChange() throws ExoPlaybackException {
        setVolumeInternal(this.volume);
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (this.queue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handleIoException(IOException iOException, int i11) {
        ExoPlaybackException createForSource = ExoPlaybackException.createForSource(iOException, i11);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            createForSource = createForSource.copyWithMediaPeriodId(playingPeriod.info.f4604id);
        }
        Log.e(TAG, "Playback error", createForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z11) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f4604id;
        boolean equals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!equals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!equals || z11) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.f4604id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleLoadingPeriodPrepared(MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        if (!mediaPeriodHolder.prepared) {
            float f11 = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.f4604id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs);
            enableRenderers();
            mediaPeriodHolder.allRenderersInCorrectState = true;
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j11 = mediaPeriodHolder.info.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, playbackInfo2.requestedContentPositionUs, j11, false, 5);
        }
        maybeContinueLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c8  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline r29, boolean r30) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline, boolean):void");
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.queue.isLoading(mediaPeriod)) {
            handleLoadingPeriodPrepared((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod()));
            return;
        }
        MediaPeriodHolder preloadHolderByMediaPeriod = this.queue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            Assertions.checkState(!preloadHolderByMediaPeriod.prepared);
            float f11 = this.mediaClock.getPlaybackParameters().speed;
            PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z11) throws ExoPlaybackException {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z11);
    }

    @CheckResult
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, long j13, boolean z11, int i11) {
        List list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j11 == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            TrackGroupArray trackGroups = playingPeriod == null ? TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            List extractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j12) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j12);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = extractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                list2 = ImmutableList.of();
            }
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z11) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i11);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j11, j12, j13, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i11 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i11 >= rendererHolderArr.length) {
                return true;
            }
            if (!rendererHolderArr[i11].hasFinishedReadingFromPeriod(readingPeriod)) {
                return false;
            }
            i11++;
        }
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z11, MediaSource.MediaPeriodId mediaPeriodId, long j11, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j12) {
        if (!z11 && j11 == j12 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLoadingPossible(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j11 = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j11 == C.TIME_UNSET || this.playbackInfo.positionUs < j11 || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
            mediaPeriodHolder.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(mediaPeriodHolder.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playbackInfo.timeline, preloadingPeriod.info.f4604id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.prepareCalled) {
                        preloadingPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    }
                }
            }
        }
    }

    private void maybeHandlePrewarmingTransition() throws ExoPlaybackException {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.maybeHandlePrewarmingTransition();
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void maybePrewarmRenderers() throws ExoPlaybackException {
        MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
        if (prewarmingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = prewarmingPeriod.getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11) && this.renderers[i11].hasSecondary() && !this.renderers[i11].isPrewarming()) {
                this.renderers[i11].startPrewarming();
                enableRenderer(prewarmingPeriod, i11, false, prewarmingPeriod.getStartPositionRendererTime());
            }
        }
        if (areRenderersPrewarming()) {
            this.prewarmingMediaPeriodDiscontinuity = prewarmingPeriod.mediaPeriod.readDiscontinuity();
            if (prewarmingPeriod.isFullyBuffered()) {
                return;
            }
            this.queue.removeAfter(prewarmingPeriod);
            handleLoadingMediaPeriodChanged(false);
            maybeContinueLoading();
        }
    }

    private void maybeThrowRendererStreamError(int i11) throws IOException, ExoPlaybackException {
        RendererHolder rendererHolder = this.renderers[i11];
        try {
            rendererHolder.maybeThrowStreamError((MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod()));
        } catch (IOException | RuntimeException e11) {
            int trackType = rendererHolder.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e11;
            }
            TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
            Log.e(TAG, "Disabling track due to error: " + Format.toLogString(trackSelectorResult.selections[i11].getSelectedFormat()), e11);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i11] = null;
            trackSelectorResult2.selections[i11] = null;
            disableRenderer(i11);
            this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i11, final boolean z11) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i11] != z11) {
            zArr[i11] = z11;
            this.applicationLooperHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.w2
                @Override // java.lang.Runnable
                public final void run() {
                    r0.analyticsCollector.onRendererReadyChanged(r1, ExoPlayerImplInternal.this.renderers[i11].getTrackType(), z11);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeTriggerPendingMessages(long r9, long r11) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.maybeTriggerPendingMessages(long, long):void");
    }

    private boolean maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z11 = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder enqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!enqueueNextMediaPeriodHolder.prepareCalled) {
                enqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (enqueueNextMediaPeriodHolder.prepared) {
                this.handler.obtainMessage(8, enqueueNextMediaPeriodHolder.mediaPeriod).sendToTarget();
            }
            if (this.queue.getPlayingPeriod() == enqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
            z11 = true;
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z11;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
        updateIsLoading();
        return z11;
    }

    private void maybeUpdateOffloadScheduling() {
        MediaPeriodHolder playingPeriod;
        boolean z11;
        if (this.queue.getPlayingPeriod() == this.queue.getReadingPeriod() && (playingPeriod = this.queue.getPlayingPeriod()) != null) {
            TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z12 = false;
            int i11 = 0;
            boolean z13 = false;
            while (true) {
                if (i11 >= this.renderers.length) {
                    z11 = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i11)) {
                    if (this.renderers[i11].getTrackType() != 1) {
                        z11 = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i11].offloadModePreferred != 0) {
                        z13 = true;
                    }
                }
                i11++;
            }
            if (z13 && z11) {
                z12 = true;
            }
            setOffloadSchedulingEnabled(z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void maybeUpdatePlayingPeriod() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.shouldAdvancePlayingPeriod()
            if (r2 == 0) goto L81
            if (r1 == 0) goto Ld
            r15.maybeNotifyPlaybackInfoChanged()
        Ld:
            r15.isPrewarmingDisabledUntilNextTransition = r0
            androidx.media3.exoplayer.MediaPeriodQueue r1 = r15.queue
            androidx.media3.exoplayer.MediaPeriodHolder r1 = r1.advancePlayingPeriod()
            java.lang.Object r1 = androidx.media3.common.util.Assertions.checkNotNull(r1)
            androidx.media3.exoplayer.MediaPeriodHolder r1 = (androidx.media3.exoplayer.MediaPeriodHolder) r1
            androidx.media3.exoplayer.PlaybackInfo r2 = r15.playbackInfo
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r2 = r2.periodId
            java.lang.Object r2 = r2.periodUid
            androidx.media3.exoplayer.MediaPeriodInfo r3 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = r3.f4604id
            java.lang.Object r3 = r3.periodUid
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            androidx.media3.exoplayer.PlaybackInfo r2 = r15.playbackInfo
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r2 = r2.periodId
            int r4 = r2.adGroupIndex
            r5 = -1
            if (r4 != r5) goto L47
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r4 = r4.f4604id
            int r6 = r4.adGroupIndex
            if (r6 != r5) goto L47
            int r2 = r2.nextAdGroupIndex
            int r4 = r4.nextAdGroupIndex
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            androidx.media3.exoplayer.MediaPeriodInfo r4 = r1.info
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r6 = r4.f4604id
            long r7 = r4.startPositionUs
            long r9 = r4.requestedContentPositionUs
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.PlaybackInfo r2 = r5.handlePositionDiscontinuity(r6, r7, r9, r11, r13, r14)
            r5.playbackInfo = r2
            r15.resetPendingPauseAtEndOfPeriod()
            r15.updatePlaybackPositions()
            boolean r2 = r15.areRenderersPrewarming()
            if (r2 == 0) goto L72
            androidx.media3.exoplayer.MediaPeriodQueue r2 = r5.queue
            androidx.media3.exoplayer.MediaPeriodHolder r2 = r2.getPrewarmingPeriod()
            if (r1 != r2) goto L72
            r15.maybeHandlePrewarmingTransition()
        L72:
            androidx.media3.exoplayer.PlaybackInfo r1 = r5.playbackInfo
            int r1 = r1.playbackState
            r2 = 3
            if (r1 != r2) goto L7c
            r15.startRenderers()
        L7c:
            r15.allowRenderersToRenderStartOfStreams()
            r1 = r3
            goto L2
        L81:
            r5 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.maybeUpdatePlayingPeriod():void");
    }

    private void maybeUpdatePreloadPeriods(boolean z11) {
        if (this.preloadConfiguration.targetPreloadDurationUs == C.TIME_UNSET) {
            return;
        }
        if (z11 || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            Timeline timeline = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = timeline;
            this.queue.invalidatePreloadPool(timeline);
        }
        maybeContinuePreloading();
    }

    private void maybeUpdatePrewarmingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder prewarmingPeriod;
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition || areRenderersPrewarming() || (prewarmingPeriod = this.queue.getPrewarmingPeriod()) == null || prewarmingPeriod != this.queue.getReadingPeriod() || prewarmingPeriod.getNext() == null || !prewarmingPeriod.getNext().prepared) {
            return;
        }
        this.queue.advancePrewarmingPeriod();
        maybePrewarmRenderers();
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i11 = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                RendererHolder[] rendererHolderArr = this.renderers;
                int length = rendererHolderArr.length;
                while (i11 < length) {
                    RendererHolder rendererHolder = rendererHolderArr[i11];
                    if (rendererHolder.isReadingFromPeriod(readingPeriod) && rendererHolder.hasReadPeriodToEnd(readingPeriod)) {
                        long j11 = readingPeriod.info.durationUs;
                        rendererHolder.setCurrentStreamFinal(readingPeriod, (j11 == C.TIME_UNSET || j11 == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                    }
                    i11++;
                }
                return;
            }
            return;
        }
        if (hasReadingPeriodFinishedReading()) {
            if (areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == this.queue.getReadingPeriod()) {
                return;
            }
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                MediaPeriodHolder advanceReadingPeriod = this.queue.advanceReadingPeriod();
                TrackSelectorResult trackSelectorResult2 = advanceReadingPeriod.getTrackSelectorResult();
                Timeline timeline = this.playbackInfo.timeline;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, advanceReadingPeriod.info.f4604id, timeline, readingPeriod.info.f4604id, C.TIME_UNSET, false);
                if (advanceReadingPeriod.prepared && ((this.hasSecondaryRenderers && this.prewarmingMediaPeriodDiscontinuity != C.TIME_UNSET) || advanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET)) {
                    this.prewarmingMediaPeriodDiscontinuity = C.TIME_UNSET;
                    boolean z11 = this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition;
                    if (z11) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= this.renderers.length) {
                                break;
                            }
                            if (trackSelectorResult2.isRendererEnabled(i12) && !MimeTypes.allSamplesAreSyncSamples(trackSelectorResult2.selections[i12].getSelectedFormat().sampleMimeType, trackSelectorResult2.selections[i12].getSelectedFormat().codecs) && !this.renderers[i12].isPrewarming()) {
                                z11 = false;
                                break;
                            }
                            i12++;
                        }
                    }
                    if (!z11) {
                        setAllNonPrewarmingRendererStreamsFinal(advanceReadingPeriod.getStartPositionRendererTime());
                        if (advanceReadingPeriod.isFullyBuffered()) {
                            return;
                        }
                        this.queue.removeAfter(advanceReadingPeriod);
                        handleLoadingMediaPeriodChanged(false);
                        maybeContinueLoading();
                        return;
                    }
                }
                RendererHolder[] rendererHolderArr2 = this.renderers;
                int length2 = rendererHolderArr2.length;
                while (i11 < length2) {
                    rendererHolderArr2[i11].maybeSetOldStreamToFinal(trackSelectorResult, trackSelectorResult2, advanceReadingPeriod.getStartPositionRendererTime());
                    i11++;
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !updateRenderersForTransition()) {
            return;
        }
        this.queue.getReadingPeriod().allRenderersInCorrectState = true;
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z11) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z11);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        updatePlayWhenReadyWithAudioFocus();
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            this.audioFocusManager.release();
            this.trackSelector.release();
            setState(1);
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.playbackLooperProvider.releaseLooper();
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void releaseRenderers() {
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            this.rendererCapabilities[i11].clearListener();
            this.renderers[i11].release();
        }
    }

    private void removeMediaItemsInternal(int i11, int i12, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i11, i12, shuffleOrder), false);
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
        float f11 = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = null;
        boolean z11 = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            TrackSelectorResult selectTracks = playingPeriod.selectTracks(f11, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (playingPeriod == this.queue.getPlayingPeriod()) {
                trackSelectorResult = selectTracks;
            }
            if (!selectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z11) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean z12 = (this.queue.removeAfter(playingPeriod2) & 1) != 0;
                    boolean[] zArr = new boolean[this.renderers.length];
                    long applyTrackSelection = playingPeriod2.applyTrackSelection((TrackSelectorResult) Assertions.checkNotNull(trackSelectorResult), this.playbackInfo.positionUs, z12, zArr);
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z13 = (playbackInfo2.playbackState == 4 || applyTrackSelection == playbackInfo2.positionUs) ? false : true;
                    PlaybackInfo playbackInfo3 = this.playbackInfo;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, applyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z13, 5);
                    if (z13) {
                        resetRendererPosition(applyTrackSelection);
                    }
                    disableAndResetPrewarmingRenderers();
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i11 = 0;
                    while (true) {
                        RendererHolder[] rendererHolderArr = this.renderers;
                        if (i11 >= rendererHolderArr.length) {
                            break;
                        }
                        int enabledRendererCount = rendererHolderArr[i11].getEnabledRendererCount();
                        zArr2[i11] = this.renderers[i11].isRendererEnabled();
                        this.renderers[i11].maybeDisableOrResetPosition(playingPeriod2.sampleStreams[i11], this.mediaClock, this.rendererPositionUs, zArr[i11]);
                        if (enabledRendererCount - this.renderers[i11].getEnabledRendererCount() > 0) {
                            maybeTriggerOnRendererReadyChanged(i11, false);
                        }
                        this.enabledRendererCount -= enabledRendererCount - this.renderers[i11].getEnabledRendererCount();
                        i11++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                    playingPeriod2.allRenderersInCorrectState = true;
                } else {
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        long max = Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs));
                        if (this.hasSecondaryRenderers && areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == playingPeriod) {
                            disableAndResetPrewarmingRenderers();
                        }
                        playingPeriod.applyTrackSelection(selectTracks, max, false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z11 = false;
            }
        }
    }

    private void reselectTracksInternalAndSeek() throws ExoPlaybackException {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void resetInternal(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.resetInternal(boolean, boolean, boolean, boolean):void");
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j11) throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j11 + 1000000000000L : playingPeriod.toRendererTime(j11);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.resetPosition(playingPeriod, this.rendererPositionUs);
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i11 = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i11, period, true).uid;
        long j11 = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i11, j11 != C.TIME_UNSET ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i11, boolean z11, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i11, z11, window, period);
            if (resolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(resolveSeekPositionUs.first), ((Long) resolveSeekPositionUs.second).longValue(), resolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, pendingMessageInfo.resolvedPeriodTimeUs + period.getPositionInWindowUs());
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (size >= 0) {
            Timeline timeline3 = timeline;
            Timeline timeline4 = timeline2;
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline3, timeline4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
        Collections.sort(this.pendingMessages);
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, @Nullable SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i11, boolean z11, Timeline.Window window, Timeline.Period period) {
        int i12;
        long j11;
        long j12;
        int i13;
        long j13;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        boolean z15;
        Timeline timeline2;
        Timeline.Period period2;
        long j14;
        int i15;
        long longValue;
        int i16;
        boolean z16;
        boolean z17;
        boolean z18;
        if (timeline.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, C.TIME_UNSET, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Object obj = mediaPeriodId.periodUid;
        boolean isUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        long j15 = (playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod) ? playbackInfo.requestedContentPositionUs : playbackInfo.positionUs;
        if (seekPosition != null) {
            i12 = -1;
            j11 = C.TIME_UNSET;
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i11, z11, window, period);
            if (resolveSeekPositionUs == null) {
                i16 = timeline.getFirstWindowIndex(z11);
                longValue = j15;
                z16 = false;
                z17 = false;
                z18 = true;
            } else {
                if (seekPosition.windowPositionUs == C.TIME_UNSET) {
                    i16 = timeline.getPeriodByUid(resolveSeekPositionUs.first, period).windowIndex;
                    longValue = j15;
                    z16 = false;
                } else {
                    obj = resolveSeekPositionUs.first;
                    longValue = ((Long) resolveSeekPositionUs.second).longValue();
                    i16 = -1;
                    z16 = true;
                }
                z17 = playbackInfo.playbackState == 4;
                z18 = false;
            }
            i13 = i16;
            j12 = longValue;
            z14 = z16;
            z12 = z17;
            z13 = z18;
        } else {
            i12 = -1;
            j11 = C.TIME_UNSET;
            if (playbackInfo.timeline.isEmpty()) {
                i13 = timeline.getFirstWindowIndex(z11);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                int resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i11, z11, obj, playbackInfo.timeline, timeline);
                if (resolveSubsequentPeriod == -1) {
                    i14 = timeline.getFirstWindowIndex(z11);
                    z15 = true;
                } else {
                    i14 = resolveSubsequentPeriod;
                    z15 = false;
                }
                i13 = i14;
                obj = obj;
                j12 = j15;
                z13 = z15;
                z12 = false;
                z14 = false;
            } else if (j15 == C.TIME_UNSET) {
                i13 = timeline.getPeriodByUid(obj, period).windowIndex;
                obj = obj;
            } else if (isUsingPlaceholderPeriod) {
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, period.getPositionInWindowUs() + j15);
                    obj = periodPositionUs.first;
                    j13 = ((Long) periodPositionUs.second).longValue();
                } else {
                    obj = obj;
                    j13 = j15;
                }
                j12 = j13;
                i13 = -1;
                z12 = false;
                z13 = false;
                z14 = true;
            } else {
                obj = obj;
                j12 = j15;
                i13 = -1;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            j12 = j15;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (i13 != i12) {
            period2 = period;
            Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period2, i13, C.TIME_UNSET);
            timeline2 = timeline;
            obj = periodPositionUs2.first;
            j12 = ((Long) periodPositionUs2.second).longValue();
            j14 = j11;
        } else {
            timeline2 = timeline;
            period2 = period;
            j14 = j12;
        }
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline2, obj, j12);
        int i17 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z19 = mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !resolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && (i17 == i12 || ((i15 = mediaPeriodId.nextAdGroupIndex) != i12 && i17 >= i15));
        long j16 = j14;
        MediaSource.MediaPeriodId mediaPeriodId2 = resolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        boolean isIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, mediaPeriodId, j15, mediaPeriodId2, timeline2.getPeriodByUid(obj, period2), j16);
        if (z19 || isIgnorableServerSideAdInsertionPeriodChange) {
            mediaPeriodId2 = mediaPeriodId;
        }
        if (mediaPeriodId2.isAd()) {
            if (mediaPeriodId2.equals(mediaPeriodId)) {
                j12 = playbackInfo.positionUs;
            } else {
                timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2);
                j12 = mediaPeriodId2.adIndexInAdGroup == period2.getFirstAdIndexToPlay(mediaPeriodId2.adGroupIndex) ? period2.getAdResumePositionUs() : 0L;
            }
        }
        return new PositionUpdateForPlaylistChange(mediaPeriodId2, j12, j16, z12, z13, z14);
    }

    @Nullable
    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z11, int i11, boolean z12, Timeline.Window window, Timeline.Period period) {
        Pair<Object, Long> periodPositionUs;
        Timeline timeline2;
        int resolveSubsequentPeriod;
        Timeline timeline3 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline3.isEmpty()) {
            timeline3 = timeline;
        }
        try {
            periodPositionUs = timeline3.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            timeline2 = timeline3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline2)) {
            return periodPositionUs;
        }
        if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
            return (timeline2.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
        }
        if (z11 && (resolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i11, z12, periodPositionUs.first, timeline2, timeline)) != -1) {
            return timeline.getPeriodPositionUs(window, period, resolveSubsequentPeriod, C.TIME_UNSET);
        }
        return null;
    }

    public static int resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i11, boolean z11, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline.Period period2;
        Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        int i12 = 0;
        for (int i13 = 0; i13 < timeline2.getWindowCount(); i13++) {
            if (timeline2.getWindow(i13, window).uid.equals(obj2)) {
                return i13;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i14 = indexOfPeriod;
        int i15 = -1;
        while (i12 < periodCount && i15 == -1) {
            Timeline.Window window2 = window;
            period2 = period;
            int i16 = i11;
            boolean z12 = z11;
            Timeline timeline3 = timeline;
            i14 = timeline3.getNextPeriodIndex(i14, period2, window2, i16, z12);
            if (i14 == -1) {
                break;
            }
            i15 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(i14));
            i12++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i11 = i16;
            z11 = z12;
        }
        period2 = period;
        if (i15 == -1) {
            return -1;
        }
        return timeline2.getPeriod(i15, period2).windowIndex;
    }

    private void scheduleNextWork(long j11) {
        long j12 = (this.playbackInfo.playbackState != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (RendererHolder rendererHolder : this.renderers) {
                j12 = Math.min(j12, Util.usToMs(rendererHolder.getMinDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
            }
            if ((this.queue.getPlayingPeriod() != null ? this.queue.getPlayingPeriod().getNext() : null) != null && this.rendererPositionUs + (Util.msToUs(j12) * this.playbackInfo.playbackParameters.speed) >= r2.getStartPositionRendererTime()) {
                j12 = Math.min(j12, BUFFERING_MAXIMUM_INTERVAL_MS);
            }
        }
        this.handler.sendEmptyMessageAtTime(2, j11 + j12);
    }

    private void seekToCurrentPosition(boolean z11) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f4604id;
        long seekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (seekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, seekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z11, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00ad, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:55:0x00d0, B:59:0x00d8), top: B:5:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition r20) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal$SeekPosition):void");
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j11, boolean z11) throws ExoPlaybackException {
        return seekToPeriodPosition(mediaPeriodId, j11, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z11);
    }

    private void sendMessageInternal(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        Timeline timeline = this.playbackInfo.timeline;
        if (!resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) throws ExoPlaybackException {
        if (playerMessage.getLooper() != this.playbackLooper) {
            this.handler.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        deliverMessage(playerMessage);
        int i11 = this.playbackInfo.playbackState;
        if (i11 == 3 || i11 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(final PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (looper.getThread().isAlive()) {
            this.clock.createHandler(looper, null).post(new Runnable() { // from class: androidx.media3.exoplayer.z2
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.c(ExoPlayerImplInternal.this, playerMessage);
                }
            });
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void setAllNonPrewarmingRendererStreamsFinal(long j11) {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setAllNonPrewarmingRendererStreamsFinal(j11);
        }
    }

    private void setAudioAttributesInternal(AudioAttributes audioAttributes, boolean z11) throws ExoPlaybackException {
        this.trackSelector.setAudioAttributes(audioAttributes);
        AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (!z11) {
            audioAttributes = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes);
        updatePlayWhenReadyWithAudioFocus();
    }

    private void setForegroundModeInternal(boolean z11, @Nullable AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z11) {
            this.foregroundMode = z11;
            if (!z11) {
                for (RendererHolder rendererHolder : this.renderers) {
                    rendererHolder.reset();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaClockPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabled(boolean z11) {
        if (z11 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z11;
        if (z11 || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z11) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z11;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z11, int i11, boolean z12, int i12) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z12 ? 1 : 0);
        updatePlayWhenReadyWithAudioFocus(z11, i11, i12);
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setPreloadConfigurationInternal(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void setRepeatModeInternal(int i11) throws ExoPlaybackException {
        this.repeatMode = i11;
        int updateRepeatMode = this.queue.updateRepeatMode(this.playbackInfo.timeline, i11);
        if ((updateRepeatMode & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateRepeatMode & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z11) throws ExoPlaybackException {
        this.shuffleModeEnabled = z11;
        int updateShuffleModeEnabled = this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z11);
        if ((updateShuffleModeEnabled & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((updateShuffleModeEnabled & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i11) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i11) {
            if (i11 != 2) {
                this.playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i11);
        }
    }

    private void setVideoOutputInternal(@Nullable Object obj, @Nullable AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoOutput(obj);
        }
        int i11 = this.playbackInfo.playbackState;
        if (i11 == 3 || i11 == 2) {
            this.handler.sendEmptyMessage(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setVolumeInternal(float f11) throws ExoPlaybackException {
        this.volume = f11;
        float volumeMultiplier = f11 * this.audioFocusManager.getVolumeMultiplier();
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVolume(volumeMultiplier);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        LoadControl.Parameters parameters = new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.f4604id, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.f4604id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET, this.lastRebufferRealtimeMs);
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (shouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return shouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return shouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z11) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z12 = false;
        if (!z11) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.f4604id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z13 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.f4604id.isAd() && !loadingPeriod.prepared) {
            z12 = true;
        }
        if (z13 || z12) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.f4604id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs, this.lastRebufferRealtimeMs));
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (trackSelectorResult.isRendererEnabled(i11)) {
                this.renderers[i11].start();
            }
        }
    }

    private void stopInternal(boolean z11, boolean z12) {
        resetInternal(z11 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z12 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        this.audioFocusManager.updateAudioFocus(this.playbackInfo.playWhenReady, 1);
        setState(1);
    }

    private void stopRenderers() throws ExoPlaybackException {
        this.mediaClock.stop();
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.stop();
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z11 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z11 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z11);
        }
    }

    private void updateLoadControlTrackSelection(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getLoadingPeriod());
        this.loadControl.onTracksSelected(new LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, mediaPeriodHolder == this.queue.getPlayingPeriod() ? mediaPeriodHolder.toPeriodTime(this.rendererPositionUs) : mediaPeriodHolder.toPeriodTime(this.rendererPositionUs) - mediaPeriodHolder.info.startPositionUs, getTotalBufferedDurationUs(mediaPeriodHolder.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, mediaPeriodHolder.info.f4604id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET, this.lastRebufferRealtimeMs), trackGroupArray, trackSelectorResult.selections);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i11, int i12, List<MediaItem> list) throws ExoPlaybackException {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i11, i12, list), false);
    }

    private void updatePeriods() throws ExoPlaybackException {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean maybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdatePrewarmingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(maybeUpdateLoadingPeriod);
    }

    private static int updatePlayWhenReadyChangeReason(int i11, int i12) {
        if (i11 == -1) {
            return 2;
        }
        if (i12 == 2) {
            return 1;
        }
        return i12;
    }

    private void updatePlayWhenReadyWithAudioFocus() throws ExoPlaybackException {
        PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long readDiscontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (readDiscontinuity != C.TIME_UNSET) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(readDiscontinuity);
            if (readDiscontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                long j11 = readDiscontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j11, playbackInfo.requestedContentPositionUs, j11, true, 5);
            }
        } else {
            long syncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = syncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(syncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z11 = !this.playbackInfoUpdate.positionDiscontinuity;
                PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z11, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j11, boolean z11) throws ExoPlaybackException {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j11 != C.TIME_UNSET) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j11));
            return;
        }
        if (!Objects.equals(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z11) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
        }
    }

    private static int updatePlaybackSuppressionReason(int i11, int i12) {
        if (i11 == 0) {
            return 1;
        }
        if (i12 == 1) {
            return 0;
        }
        return i12;
    }

    private void updateRebufferingState(boolean z11, boolean z12) {
        this.isRebuffering = z11;
        this.lastRebufferRealtimeMs = (!z11 || z12) ? C.TIME_UNSET : this.clock.elapsedRealtime();
    }

    private boolean updateRenderersForTransition() throws ExoPlaybackException {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        boolean z11 = true;
        int i11 = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.renderers;
            if (i11 >= rendererHolderArr.length) {
                break;
            }
            int enabledRendererCount = rendererHolderArr[i11].getEnabledRendererCount();
            int replaceStreamsOrDisableRendererForTransition = this.renderers[i11].replaceStreamsOrDisableRendererForTransition(readingPeriod, trackSelectorResult, this.mediaClock);
            if ((replaceStreamsOrDisableRendererForTransition & 2) != 0 && this.offloadSchedulingEnabled) {
                setOffloadSchedulingEnabled(false);
            }
            this.enabledRendererCount -= enabledRendererCount - this.renderers[i11].getEnabledRendererCount();
            z11 &= (replaceStreamsOrDisableRendererForTransition & 1) != 0;
            i11++;
        }
        if (z11) {
            for (int i12 = 0; i12 < this.renderers.length; i12++) {
                if (trackSelectorResult.isRendererEnabled(i12) && !this.renderers[i12].isReadingFromPeriod(readingPeriod)) {
                    enableRenderer(readingPeriod, i12, false, readingPeriod.getStartPositionRendererTime());
                }
            }
        }
        return z11;
    }

    private void updateTrackSelectionPlaybackSpeed(float f11) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f11);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(ho.p0<Boolean> p0Var, long j11) {
        long elapsedRealtime = this.clock.elapsedRealtime() + j11;
        boolean z11 = false;
        while (!p0Var.get().booleanValue() && j11 > 0) {
            try {
                this.clock.onThreadBlocked();
                wait(j11);
            } catch (InterruptedException unused) {
                z11 = true;
            }
            j11 = elapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i11, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i11, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, C.TIME_UNSET)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
    public void executePlayerCommand(int i11) {
        this.handler.obtainMessage(33, i11, 0).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j11) {
        this.setForegroundModeTimeoutMs = j11;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i11;
        MediaPeriodHolder readingPeriod;
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i12 = message.arg2;
                    setPlayWhenReadyInternal(z11, i12 >> 4, true, i12 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    setVideoOutputInternal(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((AudioAttributes) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
            }
        } catch (ParserException e11) {
            int i13 = e11.dataType;
            if (i13 == 1) {
                r2 = e11.contentIsMalformed ? 3001 : 3003;
            } else if (i13 == 4) {
                r2 = e11.contentIsMalformed ? 3002 : 3004;
            }
            handleIoException(e11, r2);
        } catch (DataSourceException e12) {
            handleIoException(e12, e12.reason);
        } catch (ExoPlaybackException e13) {
            e = e13;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                RendererHolder[] rendererHolderArr = this.renderers;
                int i14 = e.rendererIndex;
                e = e.copyWithMediaPeriodId((!rendererHolderArr[i14 % rendererHolderArr.length].isRendererPrewarming(i14) || readingPeriod.getNext() == null) ? readingPeriod.info.f4604id : readingPeriod.getNext().info.f4604id);
            }
            if (e.type == 1) {
                RendererHolder[] rendererHolderArr2 = this.renderers;
                int i15 = e.rendererIndex;
                if (rendererHolderArr2[i15 % rendererHolderArr2.length].isRendererPrewarming(i15)) {
                    this.isPrewarmingDisabledUntilNextTransition = true;
                    disableAndResetPrewarmingRenderers();
                    MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
                    MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                    if (this.queue.getPlayingPeriod() != prewarmingPeriod) {
                        while (playingPeriod != null && playingPeriod.getNext() != prewarmingPeriod) {
                            playingPeriod = playingPeriod.getNext();
                        }
                    }
                    this.queue.removeAfter(playingPeriod);
                    if (this.playbackInfo.playbackState != 4) {
                        maybeContinueLoading();
                        this.handler.sendEmptyMessage(2);
                    }
                }
            }
            ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
            if (exoPlaybackException != null) {
                exoPlaybackException.addSuppressed(e);
                e = this.pendingRecoverableRendererError;
            }
            if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    this.queue.advancePlayingPeriod();
                }
                MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.getPlayingPeriod());
                maybeNotifyPlaybackInfoChanged();
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
                MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f4604id;
                long j11 = mediaPeriodInfo.startPositionUs;
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j11, mediaPeriodInfo.requestedContentPositionUs, j11, true, 0);
            }
            if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i11 = e.errorCode) == 5004 || i11 == 5003)) {
                Log.w(TAG, "Recoverable renderer error", e);
                if (this.pendingRecoverableRendererError == null) {
                    this.pendingRecoverableRendererError = e;
                }
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                Log.e(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (DrmSession.DrmSessionException e14) {
            handleIoException(e14, e14.errorCode);
        } catch (BehindLiveWindowException e15) {
            handleIoException(e15, 1002);
        } catch (IOException e16) {
            handleIoException(e16, 2000);
        } catch (RuntimeException e17) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e(TAG, "Playback error", createForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(createForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i11, int i12, int i13, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i11, i12, i13, shuffleOrder)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new ho.p0() { // from class: androidx.media3.exoplayer.v2
                @Override // ho.p0
                public final Object get() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(ExoPlayerImplInternal.this.released);
                    return valueOf;
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    public void removeMediaSources(int i11, int i12, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i11, i12, shuffleOrder).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i11, long j11) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i11, j11)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z11) {
        this.handler.obtainMessage(31, z11 ? 1 : 0, 0, audioAttributes).sendToTarget();
    }

    public synchronized boolean setForegroundMode(boolean z11) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z11) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new y2(atomicBoolean), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i11, long j11, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i11, j11)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z11) {
        this.handler.obtainMessage(23, z11 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z11, int i11, int i12) {
        this.handler.obtainMessage(1, z11 ? 1 : 0, i11 | (i12 << 4)).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void setRepeatMode(int i11) {
        this.handler.obtainMessage(11, i11, 0).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z11) {
        this.handler.obtainMessage(12, z11 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public synchronized boolean setVideoOutput(@Nullable Object obj, long j11) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(30, new Pair(obj, atomicBoolean)).sendToTarget();
            if (j11 == C.TIME_UNSET) {
                return true;
            }
            waitUninterruptibly(new y2(atomicBoolean), j11);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setVolume(float f11) {
        this.handler.obtainMessage(32, Float.valueOf(f11)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
    public void setVolumeMultiplier(float f11) {
        this.handler.sendEmptyMessage(34);
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i11, int i12, List<MediaItem> list) {
        this.handler.obtainMessage(27, i11, i12, list).sendToTarget();
    }

    private long getTotalBufferedDurationUs(long j11) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j11 - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f11, boolean z11, boolean z12) throws ExoPlaybackException {
        if (z11) {
            if (z12) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setPlaybackSpeed(f11, playbackParameters.speed);
        }
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z11, int i11, int i12) throws ExoPlaybackException {
        updatePlayWhenReadyWithAudioFocus(z11, this.audioFocusManager.updateAudioFocus(z11, this.playbackInfo.playbackState), i11, i12);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    private void enableRenderers(boolean[] zArr, long j11) throws ExoPlaybackException {
        long j12;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i11 = 0; i11 < this.renderers.length; i11++) {
            if (!trackSelectorResult.isRendererEnabled(i11)) {
                this.renderers[i11].reset();
            }
        }
        int i12 = 0;
        while (i12 < this.renderers.length) {
            if (!trackSelectorResult.isRendererEnabled(i12) || this.renderers[i12].isReadingFromPeriod(readingPeriod)) {
                j12 = j11;
            } else {
                j12 = j11;
                enableRenderer(readingPeriod, i12, zArr[i12], j12);
            }
            i12++;
            j11 = j12;
        }
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j11, boolean z11, boolean z12) throws ExoPlaybackException {
        stopRenderers();
        updateRebufferingState(false, true);
        if (z12 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder mediaPeriodHolder = playingPeriod;
        while (mediaPeriodHolder != null && !mediaPeriodId.equals(mediaPeriodHolder.info.f4604id)) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        if (z11 || playingPeriod != mediaPeriodHolder || (mediaPeriodHolder != null && mediaPeriodHolder.toRendererTime(j11) < 0)) {
            disableRenderers();
            if (mediaPeriodHolder != null) {
                while (this.queue.getPlayingPeriod() != mediaPeriodHolder) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(mediaPeriodHolder);
                mediaPeriodHolder.setRendererOffset(1000000000000L);
                enableRenderers();
                mediaPeriodHolder.allRenderersInCorrectState = true;
            }
        }
        disableAndResetPrewarmingRenderers();
        if (mediaPeriodHolder != null) {
            this.queue.removeAfter(mediaPeriodHolder);
            if (!mediaPeriodHolder.prepared) {
                mediaPeriodHolder.info = mediaPeriodHolder.info.copyWithStartPositionUs(j11);
            } else if (mediaPeriodHolder.hasEnabledTracks) {
                j11 = mediaPeriodHolder.mediaPeriod.seekToUs(j11);
                mediaPeriodHolder.mediaPeriod.discardBuffer(j11 - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j11);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j11);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j11;
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z11, int i11, int i12, int i13) throws ExoPlaybackException {
        boolean z12 = z11 && i11 != -1;
        int updatePlayWhenReadyChangeReason = updatePlayWhenReadyChangeReason(i11, i13);
        int updatePlaybackSuppressionReason = updatePlaybackSuppressionReason(i11, i12);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z12 && playbackInfo.playbackSuppressionReason == updatePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == updatePlayWhenReadyChangeReason) {
            return;
        }
        this.playbackInfo = playbackInfo.copyWithPlayWhenReady(z12, updatePlayWhenReadyChangeReason, updatePlaybackSuppressionReason);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z12);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            return;
        }
        int i14 = this.playbackInfo.playbackState;
        if (i14 == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i14 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }
}
