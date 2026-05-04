package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;

    @Nullable
    private MediaPeriodHolder next;
    public boolean prepareCalled;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    public final long targetPreloadBufferDurationUs;
    private TrackGroupArray trackGroups;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Factory {
        MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j11);
    }

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j11, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult, long j12) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j11;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f4604id;
        this.uid = mediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.targetPreloadBufferDurationUs = j12;
        this.trackGroups = TrackGroupArray.EMPTY;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodId, mediaSourceList, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs, mediaPeriodInfo.isPrecededByTransitionFromSameStream);
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i11 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i11 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i11].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i11)) {
                sampleStreamArr[i11] = new EmptySampleStream();
            }
            i11++;
        }
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList, Allocator allocator, long j11, long j12, boolean z11) {
        MediaPeriod createPeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j11);
        return j12 != C.TIME_UNSET ? new ClippingMediaPeriod(createPeriod, !z11, 0L, j12) : createPeriod;
    }

    private void disableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i11 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i11 >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i11];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.disable();
            }
            i11++;
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i11 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i11 >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i11].getTrackType() == -2) {
                sampleStreamArr[i11] = null;
            }
            i11++;
        }
    }

    private void enableTrackSelectionsInResult() {
        if (!isLoadingMediaPeriod()) {
            return;
        }
        int i11 = 0;
        while (true) {
            TrackSelectorResult trackSelectorResult = this.trackSelectorResult;
            if (i11 >= trackSelectorResult.length) {
                return;
            }
            boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
            ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i11];
            if (isRendererEnabled && exoTrackSelection != null) {
                exoTrackSelection.enable();
            }
            i11++;
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static void releaseMediaPeriod(MediaSourceList mediaSourceList, MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (RuntimeException e11) {
            Log.e(TAG, "Period release failed.", e11);
        }
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j11, boolean z11) {
        return applyTrackSelection(trackSelectorResult, j11, z11, new boolean[this.rendererCapabilities.length]);
    }

    public boolean canBeUsedForMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo) {
        if (!MediaPeriodQueue.areDurationsCompatible(this.info.durationUs, mediaPeriodInfo.durationUs)) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        return mediaPeriodInfo2.startPositionUs == mediaPeriodInfo.startPositionUs && mediaPeriodInfo2.f4604id.equals(mediaPeriodInfo.f4604id);
    }

    public void continueLoading(LoadingInfo loadingInfo) {
        Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(loadingInfo);
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    @Nullable
    public MediaPeriodHolder getNext() {
        return this.next;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void handlePrepared(float f11, Timeline timeline, boolean z11) throws ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        TrackSelectorResult selectTracks = selectTracks(f11, timeline, z11);
        MediaPeriodInfo mediaPeriodInfo = this.info;
        long j11 = mediaPeriodInfo.startPositionUs;
        long j12 = mediaPeriodInfo.durationUs;
        if (j12 != C.TIME_UNSET && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j11, false);
        long j13 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = j13 + (mediaPeriodInfo2.startPositionUs - applyTrackSelection);
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(applyTrackSelection);
    }

    public boolean hasLoadingError() {
        try {
            if (this.prepared) {
                for (SampleStream sampleStream : this.sampleStreams) {
                    if (sampleStream != null) {
                        sampleStream.maybeThrowError();
                    }
                }
            } else {
                this.mediaPeriod.maybeThrowPrepareError();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean isFullyBuffered() {
        if (this.prepared) {
            return !this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean isFullyPreloaded() {
        if (this.prepared) {
            return isFullyBuffered() || getBufferedPositionUs() - this.info.startPositionUs >= this.targetPreloadBufferDurationUs;
        }
        return false;
    }

    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.prepareCalled = true;
        this.mediaPeriod.prepare(callback, j11);
    }

    public void reevaluateBuffer(long j11) {
        Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j11));
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public TrackSelectorResult selectTracks(float f11, Timeline timeline, boolean z11) throws ExoPlaybackException {
        TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.f4604id, timeline);
        for (int i11 = 0; i11 < selectTracks.length; i11++) {
            if (selectTracks.isRendererEnabled(i11)) {
                if (selectTracks.selections[i11] == null && this.rendererCapabilities[i11].getTrackType() != -2) {
                    r3 = false;
                }
                Assertions.checkState(r3);
            } else {
                Assertions.checkState(selectTracks.selections[i11] == null);
            }
        }
        for (ExoTrackSelection exoTrackSelection : selectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f11);
                exoTrackSelection.onPlayWhenReadyChanged(z11);
            }
        }
        return selectTracks;
    }

    public void setNext(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public void setRendererOffset(long j11) {
        this.rendererPositionOffsetUs = j11;
    }

    public long toPeriodTime(long j11) {
        return j11 - getRendererOffset();
    }

    public long toRendererTime(long j11) {
        return j11 + getRendererOffset();
    }

    public void updateClipping() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod instanceof ClippingMediaPeriod) {
            long j11 = this.info.endPositionUs;
            if (j11 == C.TIME_UNSET) {
                j11 = Long.MIN_VALUE;
            }
            ((ClippingMediaPeriod) mediaPeriod).updateClipping(0L, j11);
        }
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult, long j11, boolean z11, boolean[] zArr) {
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z11 || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i11)) {
                z12 = false;
            }
            zArr2[i11] = z12;
            i11++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j11);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i12 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i12 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i12] != null) {
                Assertions.checkState(trackSelectorResult.isRendererEnabled(i12));
                if (this.rendererCapabilities[i12].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectorResult.selections[i12] == null);
            }
            i12++;
        }
    }
}
