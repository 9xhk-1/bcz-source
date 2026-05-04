package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_PREWARMING_PERIOD = 2;
    static final int UPDATE_PERIOD_QUEUE_ALTERED_READING_PERIOD = 1;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;

    @Nullable
    private MediaPeriodHolder loading;
    private final MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;

    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;

    @Nullable
    private MediaPeriodHolder playing;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;

    @Nullable
    private MediaPeriodHolder preloading;

    @Nullable
    private MediaPeriodHolder prewarming;

    @Nullable
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private List<MediaPeriodHolder> preloadPriorityList = new ArrayList();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper, MediaPeriodHolder.Factory factory, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
    }

    public static boolean areDurationsCompatible(long j11, long j12) {
        return j11 == C.TIME_UNSET || j11 == j12;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.f4604id.equals(mediaPeriodInfo2.f4604id);
    }

    @Nullable
    private Pair<Object, Long> getDefaultPeriodPositionOfNextWindow(Timeline timeline, Object obj, long j11) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, C.TIME_UNSET, j11);
        }
        return null;
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        Object obj;
        long j12;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.f4604id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i11 = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object checkNotNull = Assertions.checkNotNull(this.period.uid);
        long j13 = mediaPeriodInfo.f4604id.windowSequenceNumber;
        long j14 = 0;
        if (timeline.getWindow(i11, this.window).firstPeriodIndex == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i11, C.TIME_UNSET, Math.max(0L, j11));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj2 = periodPositionUs.first;
            long longValue = ((Long) periodPositionUs.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj2)) {
                long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
                j13 = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            } else {
                j13 = next.info.f4604id.windowSequenceNumber;
            }
            obj = obj2;
            j12 = longValue;
            j14 = -9223372036854775807L;
        } else {
            obj = checkNotNull;
            j12 = 0;
        }
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j12, j13, this.window, this.period);
        if (j14 != C.TIME_UNSET && mediaPeriodInfo.requestedContentPositionUs != C.TIME_UNSET) {
            boolean hasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.f4604id.periodUid, timeline);
            if (resolveMediaPeriodIdForAds.isAd() && hasServerSideInsertedAds) {
                j14 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (hasServerSideInsertedAds) {
                j12 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j14, j12);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j11;
        return mediaPeriodInfo.isLastInTimelinePeriod ? getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset) : getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j11) {
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f4604id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        boolean z11 = mediaPeriodInfo.isFollowedByTransitionToSameStream;
        if (!mediaPeriodId.isAd()) {
            int i11 = mediaPeriodId.nextAdGroupIndex;
            if (i11 != -1 && this.period.isLivePostrollPlaceholder(i11)) {
                return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j11);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
            boolean z12 = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z12) {
                return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber, false);
            }
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber, z11);
        }
        int i12 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i12);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i12, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i12, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber, z11);
        }
        long j12 = mediaPeriodInfo.requestedContentPositionUs;
        if (j12 == C.TIME_UNSET) {
            Timeline.Window window = this.window;
            Timeline.Period period = this.period;
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, C.TIME_UNSET, Math.max(0L, j11));
            if (periodPositionUs == null) {
                return null;
            }
            j12 = ((Long) periodPositionUs.second).longValue();
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), j12), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber, z11);
    }

    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j11, mediaPeriodId.windowSequenceNumber, false) : getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j12, j11, mediaPeriodId.windowSequenceNumber, false);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i11, int i12, long j11, long j12, boolean z11) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i11, i12, j12);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i12 == this.period.getFirstAdIndexToPlay(i11) ? this.period.getAdResumePositionUs() : 0L;
        boolean isServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, adResumePositionUs, j11, C.TIME_UNSET, adDurationUs, z11, isServerSideInsertedAdGroup, false, false, false);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object obj, long j11, long j12, long j13, boolean z11) {
        boolean z12;
        long j14;
        long j15;
        long j16;
        long j17 = j11;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j17);
        boolean z13 = adGroupIndexAfterPositionUs != -1 && this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                Timeline.Period period = this.period;
                if (period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
                    z12 = true;
                }
            }
            z12 = false;
        } else {
            if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs)) {
                long adGroupTimeUs = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
                Timeline.Period period2 = this.period;
                if (adGroupTimeUs == period2.durationUs && period2.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                    z12 = true;
                    adGroupIndexAfterPositionUs = -1;
                }
            }
            z12 = false;
        }
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j13, adGroupIndexAfterPositionUs);
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        boolean z14 = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || z13) ? false : true;
        if (adGroupIndexAfterPositionUs != -1 && !z13) {
            j15 = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        } else {
            if (!z12) {
                j14 = -9223372036854775807L;
                j16 = (j14 != C.TIME_UNSET || j14 == Long.MIN_VALUE) ? this.period.durationUs : j14;
                if (j16 != C.TIME_UNSET && j17 >= j16) {
                    j17 = Math.max(0L, j16 - ((isLastInTimeline && z12) ? 0 : 1));
                }
                return new MediaPeriodInfo(mediaPeriodId, j17, j12, j14, j16, z11, z14, isLastInPeriod, isLastInWindow, isLastInTimeline);
            }
            j15 = this.period.durationUs;
        }
        j14 = j15;
        if (j14 != C.TIME_UNSET) {
        }
        if (j16 != C.TIME_UNSET) {
            j17 = Math.max(0L, j16 - ((isLastInTimeline && z12) ? 0 : 1));
        }
        return new MediaPeriodInfo(mediaPeriodId, j17, j12, j14, j16, z11, z14, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    private MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(Timeline timeline, Object obj, long j11, long j12) {
        MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j11, j12, this.window, this.period);
        return resolveMediaPeriodIdForAds.isAd() ? getMediaPeriodInfoForAd(timeline, resolveMediaPeriodIdForAds.periodUid, resolveMediaPeriodIdForAds.adGroupIndex, resolveMediaPeriodIdForAds.adIndexInAdGroup, j11, resolveMediaPeriodIdForAds.windowSequenceNumber, false) : getMediaPeriodInfoForContent(timeline, resolveMediaPeriodIdForAds.periodUid, j11, C.TIME_UNSET, resolveMediaPeriodIdForAds.windowSequenceNumber, false);
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i11) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i11);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.durationUs : adGroupTimeUs + this.period.getContentResumeOffsetUs(i11);
    }

    private boolean hasServerSideInsertedAds(Object obj, Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        if (adGroupCount <= 0 || !this.period.isServerSideInsertedAdGroup(removedAdGroupCount)) {
            return false;
        }
        return adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE;
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z11) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z11;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private static boolean isSkippableAdPeriod(Timeline.Period period) {
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount != 0 && ((adGroupCount != 1 || !period.isLivePostrollPlaceholder(0)) && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()))) {
            long j11 = 0;
            if (period.getAdGroupIndexForPositionUs(0L) == -1) {
                if (period.durationUs == 0) {
                    return true;
                }
                int i11 = adGroupCount - (period.isLivePostrollPlaceholder(adGroupCount + (-1)) ? 2 : 1);
                for (int i12 = 0; i12 <= i11; i12++) {
                    j11 += period.getContentResumeOffsetUs(i12);
                }
                if (period.durationUs <= j11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void notifyQueueUpdate() {
        final ImmutableList.a builder = ImmutableList.builder();
        for (MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            builder.g(mediaPeriodHolder.info.f4604id);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        final MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.info.f4604id;
        this.analyticsCollectorHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.e3
            @Override // java.lang.Runnable
            public final void run() {
                MediaPeriodQueue.this.analyticsCollector.updateMediaPeriodQueueInfo(builder.e(), mediaPeriodId);
            }
        });
    }

    private void releaseAndResetPreloadPriorityList(List<MediaPeriodHolder> list) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            this.preloadPriorityList.get(i11).release();
        }
        this.preloadPriorityList = list;
        this.preloading = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    @Nullable
    private MediaPeriodHolder removePreloadedMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            if (this.preloadPriorityList.get(i11).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i11);
            }
        }
        return null;
    }

    private long resolvePeriodUidToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i11 = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i11) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.f4604id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i11) {
                return mediaPeriodHolder2.info.f4604id.windowSequenceNumber;
            }
        }
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j11 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j11;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j11;
        }
        return j11;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(Object obj) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i11);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.f4604id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private int updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return 0;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodHolder.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (((MediaPeriodHolder) Assertions.checkNotNull(mediaPeriodHolder)).getNext() != null && !mediaPeriodHolder.info.isLastInTimelinePeriod) {
                mediaPeriodHolder = mediaPeriodHolder.getNext();
            }
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (indexOfPeriod == -1 || next == null || timeline2.getIndexOfPeriod(next.uid) != indexOfPeriod) {
                break;
            }
            mediaPeriodHolder = next;
            timeline = timeline2;
        }
        int removeAfter = removeAfter(mediaPeriodHolder);
        mediaPeriodHolder.info = getUpdatedMediaPeriodInfo(timeline2, mediaPeriodHolder.info);
        return removeAfter;
    }

    @Nullable
    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.playing;
        if (mediaPeriodHolder2 == this.prewarming) {
            this.prewarming = mediaPeriodHolder2.getNext();
        }
        this.playing.release();
        int i11 = this.length - 1;
        this.length = i11;
        if (i11 == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder3 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder3.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder3.info.f4604id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public MediaPeriodHolder advancePrewarmingPeriod() {
        this.prewarming = ((MediaPeriodHolder) Assertions.checkStateNotNull(this.prewarming)).getNext();
        notifyQueueUpdate();
        return (MediaPeriodHolder) Assertions.checkStateNotNull(this.prewarming);
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.prewarming;
        MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        if (mediaPeriodHolder == mediaPeriodHolder2) {
            this.prewarming = ((MediaPeriodHolder) Assertions.checkStateNotNull(mediaPeriodHolder2)).getNext();
        }
        this.reading = ((MediaPeriodHolder) Assertions.checkStateNotNull(this.reading)).getNext();
        notifyQueueUpdate();
        return (MediaPeriodHolder) Assertions.checkStateNotNull(this.reading);
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = mediaPeriodHolder.uid;
        this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.f4604id.windowSequenceNumber;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.release();
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.prewarming = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? 1000000000000L : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        MediaPeriodHolder removePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (removePreloadedMediaPeriodHolder == null) {
            removePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            removePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            removePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(removePreloadedMediaPeriodHolder);
        } else {
            this.playing = removePreloadedMediaPeriodHolder;
            this.reading = removePreloadedMediaPeriodHolder;
            this.prewarming = removePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = removePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return removePreloadedMediaPeriodHolder;
    }

    @Nullable
    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    @Nullable
    public MediaPeriodInfo getNextMediaPeriodInfo(long j11, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j11);
    }

    @Nullable
    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    @Nullable
    public MediaPeriodHolder getPreloadHolderByMediaPeriod(MediaPeriod mediaPeriod) {
        for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
            MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i11);
            if (mediaPeriodHolder.mediaPeriod == mediaPeriod) {
                return mediaPeriodHolder;
            }
        }
        return null;
    }

    @Nullable
    public MediaPeriodHolder getPreloadingPeriod() {
        return this.preloading;
    }

    @Nullable
    public MediaPeriodHolder getPrewarmingPeriod() {
        return this.prewarming;
    }

    @Nullable
    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.MediaPeriodInfo getUpdatedMediaPeriodInfo(androidx.media3.common.Timeline r18, androidx.media3.exoplayer.MediaPeriodInfo r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = r2.f4604id
            boolean r13 = r0.isLastInPeriod(r3)
            boolean r14 = r0.isLastInWindow(r1, r3)
            boolean r15 = r0.isLastInTimeline(r1, r3, r13)
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r4 = r2.f4604id
            java.lang.Object r4 = r4.periodUid
            androidx.media3.common.Timeline$Period r5 = r0.period
            r1.getPeriodByUid(r4, r5)
            boolean r1 = r3.isAd()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.nextAdGroupIndex
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            androidx.media3.common.Timeline$Period r7 = r0.period
            long r7 = r7.getAdGroupTimeUs(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L48
            androidx.media3.common.Timeline$Period r1 = r0.period
            int r4 = r3.adGroupIndex
            int r5 = r3.adIndexInAdGroup
            long r4 = r1.getAdDurationUs(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            androidx.media3.common.Timeline$Period r1 = r0.period
            long r4 = r1.getDurationUs()
            goto L46
        L5c:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L6c
            androidx.media3.common.Timeline$Period r1 = r0.period
            int r4 = r3.adGroupIndex
            boolean r1 = r1.isServerSideInsertedAdGroup(r4)
        L6a:
            r12 = r1
            goto L7c
        L6c:
            int r1 = r3.nextAdGroupIndex
            if (r1 == r6) goto L7a
            androidx.media3.common.Timeline$Period r4 = r0.period
            boolean r1 = r4.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            androidx.media3.exoplayer.MediaPeriodInfo r1 = new androidx.media3.exoplayer.MediaPeriodInfo
            r5 = r3
            long r3 = r2.startPositionUs
            r11 = r5
            long r5 = r2.requestedContentPositionUs
            boolean r2 = r2.isPrecededByTransitionFromSameStream
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.MediaPeriodQueue.getUpdatedMediaPeriodInfo(androidx.media3.common.Timeline, androidx.media3.exoplayer.MediaPeriodInfo):androidx.media3.exoplayer.MediaPeriodInfo");
    }

    public void invalidatePreloadPool(Timeline timeline) {
        MediaPeriodHolder mediaPeriodHolder;
        if (this.preloadConfiguration.targetPreloadDurationUs == C.TIME_UNSET || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, mediaPeriodHolder.info.f4604id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            MediaPeriodInfo mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((Long) defaultPeriodPositionOfNextWindow.second).longValue(), resolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            MediaPeriodHolder removePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (removePreloadedMediaPeriodHolder == null) {
                removePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(removePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public boolean isPreloading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        MediaPeriodHolder mediaPeriodHolder = this.preloading;
        if (mediaPeriodHolder == null || mediaPeriodHolder.isFullyPreloaded()) {
            this.preloading = null;
            for (int i11 = 0; i11 < this.preloadPriorityList.size(); i11++) {
                MediaPeriodHolder mediaPeriodHolder2 = this.preloadPriorityList.get(i11);
                if (!mediaPeriodHolder2.isFullyPreloaded()) {
                    this.preloading = mediaPeriodHolder2;
                    return;
                }
            }
        }
    }

    public void reevaluateBuffer(long j11) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j11);
        }
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new ArrayList());
    }

    public int removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        Assertions.checkStateNotNull(mediaPeriodHolder);
        int i11 = 0;
        if (mediaPeriodHolder.equals(this.loading)) {
            return 0;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(mediaPeriodHolder.getNext());
            if (mediaPeriodHolder == this.reading) {
                MediaPeriodHolder mediaPeriodHolder2 = this.playing;
                this.reading = mediaPeriodHolder2;
                this.prewarming = mediaPeriodHolder2;
                i11 = 3;
            }
            if (mediaPeriodHolder == this.prewarming) {
                this.prewarming = this.reading;
                i11 |= 2;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        ((MediaPeriodHolder) Assertions.checkNotNull(this.loading)).setNext(null);
        notifyQueueUpdate();
        return i11;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j11) {
        return resolveMediaPeriodIdForAds(timeline, obj, j11, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Timeline timeline, Object obj, long j11) {
        long resolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z11 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z12 = this.period.getAdGroupCount() > 0;
            z11 |= z12;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = Assertions.checkNotNull(this.period.uid);
            }
            if (z11 && (!z12 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j11, resolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != C.TIME_UNSET && this.length < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(Timeline timeline, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    public int updateQueuedPeriods(Timeline timeline, long j11, long j12, long j13) {
        MediaPeriodInfo mediaPeriodInfo;
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        MediaPeriodHolder mediaPeriodHolder2 = null;
        while (true) {
            boolean z11 = false;
            if (mediaPeriodHolder == null) {
                return 0;
            }
            MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
            if (mediaPeriodHolder2 == null) {
                mediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo2);
            } else {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder2, j11);
                if (followingMediaPeriodInfo == null || !canKeepMediaPeriodHolder(mediaPeriodInfo2, followingMediaPeriodInfo)) {
                    break;
                }
                mediaPeriodInfo = followingMediaPeriodInfo;
            }
            mediaPeriodHolder.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo2.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo2.durationUs, mediaPeriodInfo.durationUs)) {
                mediaPeriodHolder.updateClipping();
                long j14 = mediaPeriodInfo.durationUs;
                long rendererTime = j14 == C.TIME_UNSET ? Long.MAX_VALUE : mediaPeriodHolder.toRendererTime(j14);
                int i11 = (mediaPeriodHolder != this.reading || mediaPeriodHolder.info.isFollowedByTransitionToSameStream || (j12 != Long.MIN_VALUE && j12 < rendererTime)) ? 0 : 1;
                if (mediaPeriodHolder == this.prewarming && (j13 == Long.MIN_VALUE || j13 >= rendererTime)) {
                    z11 = true;
                }
                int removeAfter = removeAfter(mediaPeriodHolder);
                return removeAfter != 0 ? removeAfter : z11 ? i11 | 2 : i11;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        return removeAfter(mediaPeriodHolder2);
    }

    public int updateRepeatMode(Timeline timeline, int i11) {
        this.repeatMode = i11;
        return updateForPlaybackModeChange(timeline);
    }

    public int updateShuffleModeEnabled(Timeline timeline, boolean z11) {
        this.shuffleModeEnabled = z11;
        return updateForPlaybackModeChange(timeline);
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j11, long j12, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            obj = Assertions.checkNotNull(period.uid);
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j11);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(obj, j12, period.getAdGroupIndexAfterPositionUs(j11));
        }
        return new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j12);
    }
}
