package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.k6;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MediaPeriodQueueTracker {

        @Nullable
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue = ImmutableList.of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines = ImmutableMap.of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.b<MediaSource.MediaPeriodId, Timeline> bVar, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                bVar.i(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                bVar.i(mediaPeriodId, timeline2);
            }
        }

        @Nullable
        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i11 = 0; i11 < immutableList.size(); i11++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i11);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object obj, boolean z11, int i11, int i12, int i13) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z11 && mediaPeriodId.adGroupIndex == i11 && mediaPeriodId.adIndexInAdGroup == i12) {
                return true;
            }
            return !z11 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i13;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            ImmutableMap.b<MediaSource.MediaPeriodId, Timeline> builder = ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!Objects.equals(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equals(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equals(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i11 = 0; i11 < this.mediaPeriodQueue.size(); i11++) {
                    addTimelineForMediaPeriodId(builder, this.mediaPeriodQueue.get(i11), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.d();
        }

        @Nullable
        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) k6.w(this.mediaPeriodQueue);
        }

        @Nullable
        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        @Nullable
        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        this.clock = (Clock) Assertions.checkNotNull(clock);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.g0
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                DefaultAnalyticsCollector.p0((AnalyticsListener) obj, flagSet);
            }
        });
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    public static /* synthetic */ void G(AnalyticsListener.EventTime eventTime, boolean z11, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z11);
        analyticsListener.onIsLoadingChanged(eventTime, z11);
    }

    public static /* synthetic */ void P(AnalyticsListener.EventTime eventTime, int i11, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i11);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i11);
    }

    public static /* synthetic */ void d(AnalyticsListener.EventTime eventTime, int i11, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i11);
    }

    public static /* synthetic */ void f(AnalyticsListener.EventTime eventTime, String str, long j11, long j12, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j11);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j12, j11);
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i11, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i11 >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i11, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(@Nullable PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    public static /* synthetic */ void o(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    public static /* synthetic */ void p(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i11, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1028, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(AnalyticsListener.EventTime.this);
            }
        });
        this.listeners.release();
    }

    public static /* synthetic */ void z(AnalyticsListener.EventTime eventTime, String str, long j11, long j12, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j11);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j12, j11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long elapsedRealtime = this.clock.elapsedRealtime();
        boolean z11 = timeline.equals(this.player.getCurrentTimeline()) && i11 == this.player.getCurrentMediaItemIndex();
        long j11 = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z11) {
                j11 = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                j11 = timeline.getWindow(i11, this.window).getDefaultPositionMs();
            }
        } else if (z11 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            j11 = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(elapsedRealtime, timeline, i11, mediaPeriodId2, j11, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.z0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekStarted(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 20, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(AnalyticsListener.EventTime.this, audioAttributes);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(final Exception exc) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1029, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioCodecError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final String str, final long j11, final long j12) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.x
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.f(AnalyticsListener.EventTime.this, str, j12, j11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final String str) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1012, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.g
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1013, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDisabled(AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1007, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioEnabled(AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1009, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioInputFormatChanged(AnalyticsListener.EventTime.this, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1010, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.u
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(AnalyticsListener.EventTime.this, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(final int i11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 21, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.w0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(AnalyticsListener.EventTime.this, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(final Exception exc) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1014, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(final AudioSink.AudioTrackConfig audioTrackConfig) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1031, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.u0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioTrackInitialized(AnalyticsListener.EventTime.this, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(final AudioSink.AudioTrackConfig audioTrackConfig) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1032, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioTrackReleased(AnalyticsListener.EventTime.this, audioTrackConfig);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i11, final long j11, final long j12) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1011, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(AnalyticsListener.EventTime.this, i11, j11, j12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(final Player.Commands commands) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAvailableCommandsChanged(AnalyticsListener.EventTime.this, commands);
            }
        });
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i11, final long j11, final long j12) {
        final AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(generateLoadingMediaPeriodEventTime, 1006, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.l
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(AnalyticsListener.EventTime.this, i11, j11, j12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final List<Cue> list) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(AnalyticsListener.EventTime.this, (List<Cue>) list);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 29, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceInfoChanged(AnalyticsListener.EventTime.this, deviceInfo);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(final int i11, final boolean z11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 30, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceVolumeChanged(AnalyticsListener.EventTime.this, i11, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1004, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1023, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1026, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1025, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.v0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i12) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1022, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.d(AnalyticsListener.EventTime.this, i12, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1024, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.q0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1027, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(AnalyticsListener.EventTime.this);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i11, final long j11) {
        final AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1018, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(AnalyticsListener.EventTime.this, i11, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(final boolean z11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.G(AnalyticsListener.EventTime.this, z11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(final boolean z11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.v
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(AnalyticsListener.EventTime.this, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1002, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1001, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z11) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1003, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData, iOException, z11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i12) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1000, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.p(AnalyticsListener.EventTime.this, loadEventInfo, mediaLoadData, i12, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 18, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime.this, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(@Nullable final MediaItem mediaItem, final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(AnalyticsListener.EventTime.this, mediaItem, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 14, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaMetadataChanged(AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 28, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(AnalyticsListener.EventTime.this, metadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z11, final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(AnalyticsListener.EventTime.this, z11, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.a
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(AnalyticsListener.EventTime.this, playbackParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(AnalyticsListener.EventTime.this, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.y
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime.this, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(@Nullable final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerErrorChanged(AnalyticsListener.EventTime.this, playbackException);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(final boolean z11, final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(AnalyticsListener.EventTime.this, z11, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 15, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.x0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(AnalyticsListener.EventTime.this, mediaMetadata);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i11) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i11, final int i12, final boolean z11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1033, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.e0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(AnalyticsListener.EventTime.this, i11, i12, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(final int i11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.f1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(AnalyticsListener.EventTime.this, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(final long j11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 16, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.r1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(AnalyticsListener.EventTime.this, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(final long j11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 17, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.e
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(AnalyticsListener.EventTime.this, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z11) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.p1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(AnalyticsListener.EventTime.this, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 23, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.k
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(AnalyticsListener.EventTime.this, z11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i11, final int i12) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.q1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(AnalyticsListener.EventTime.this, i11, i12);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, final int i11) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(AnalyticsListener.EventTime.this, i11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(final TrackSelectionParameters trackSelectionParameters) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 19, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged(AnalyticsListener.EventTime.this, trackSelectionParameters);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(final Tracks tracks) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.w
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(AnalyticsListener.EventTime.this, tracks);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime generateMediaPeriodEventTime = generateMediaPeriodEventTime(i11, mediaPeriodId);
        sendEvent(generateMediaPeriodEventTime, 1005, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(AnalyticsListener.EventTime.this, mediaLoadData);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(final Exception exc) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1030, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.n
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoCodecError(AnalyticsListener.EventTime.this, exc);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final String str, final long j11, final long j12) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1016, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.z(AnalyticsListener.EventTime.this, str, j12, j11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final String str) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1019, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.z
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(AnalyticsListener.EventTime.this, str);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1020, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.s0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDisabled(AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1015, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoEnabled(AnalyticsListener.EventTime.this, decoderCounters);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j11, final int i11) {
        final AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(generatePlayingMediaPeriodEventTime, 1021, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(AnalyticsListener.EventTime.this, j11, i11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 1017, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.t0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoInputFormatChanged(AnalyticsListener.EventTime.this, format, decoderReuseEvaluation);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(final VideoSize videoSize) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 25, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.y0
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.o(AnalyticsListener.EventTime.this, videoSize, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.m
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(AnalyticsListener.EventTime.this, f11);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void release() {
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.analytics.e1
            @Override // java.lang.Runnable
            public final void run() {
                DefaultAnalyticsCollector.this.releaseInternal();
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i11, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i11, eventTime);
        this.listeners.sendEvent(i11, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    @CallSuper
    public void setPlayer(final Player player, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.exoplayer.analytics.q
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, DefaultAnalyticsCollector.this.eventTimes));
            }
        });
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z11) {
        this.listeners.setThrowsWhenUsingWrongThread(z11);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i11) {
        if (i11 == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.b1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.P(AnalyticsListener.EventTime.this, i11, positionInfo, positionInfo2, (AnalyticsListener) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j11) {
        final AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(generateReadingMediaPeriodEventTime, 26, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.g1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(AnalyticsListener.EventTime.this, obj, j11);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(final CueGroup cueGroup) {
        final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(generateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.d1
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(AnalyticsListener.EventTime.this, cueGroup);
            }
        });
    }

    private AnalyticsListener.EventTime generateEventTime(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z11) {
    }

    public static /* synthetic */ void p0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }
}
