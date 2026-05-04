package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class PreloadMediaPeriod implements MediaPeriod {

    @Nullable
    private MediaPeriod.Callback callback;
    public final MediaPeriod mediaPeriod;

    @Nullable
    private PreloadTrackSelectionHolder preloadTrackSelectionHolder;
    private boolean prepareInternalCalled;
    public boolean prepared;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PreloadTrackSelectionHolder {
        public final boolean[] mayRetainStreamFlags;
        public final ExoTrackSelection[] selections;
        public final boolean[] streamResetFlags;
        public final SampleStream[] streams;
        public final long trackSelectionPositionUs;

        public PreloadTrackSelectionHolder(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
            this.selections = exoTrackSelectionArr;
            this.mayRetainStreamFlags = zArr;
            this.streams = sampleStreamArr;
            this.streamResetFlags = zArr2;
            this.trackSelectionPositionUs = j11;
        }
    }

    public PreloadMediaPeriod(MediaPeriod mediaPeriod) {
        this.mediaPeriod = mediaPeriod;
    }

    private static boolean isSameAdaptionSet(ExoTrackSelection exoTrackSelection, ExoTrackSelection exoTrackSelection2) {
        if (!Objects.equals(exoTrackSelection.getTrackGroup(), exoTrackSelection2.getTrackGroup()) || exoTrackSelection.length() != exoTrackSelection2.length()) {
            return false;
        }
        for (int i11 = 0; i11 < exoTrackSelection.length(); i11++) {
            if (exoTrackSelection.getIndexInTrackGroup(i11) != exoTrackSelection2.getIndexInTrackGroup(i11)) {
                return false;
            }
        }
        return true;
    }

    private static boolean maybeUpdatePreloadTrackSelectionHolderForReselection(ExoTrackSelection[] exoTrackSelectionArr, PreloadTrackSelectionHolder preloadTrackSelectionHolder) {
        ExoTrackSelection[] exoTrackSelectionArr2 = ((PreloadTrackSelectionHolder) Assertions.checkNotNull(preloadTrackSelectionHolder)).selections;
        boolean z11 = false;
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr2[i11];
            if (exoTrackSelection != null || exoTrackSelection2 != null) {
                preloadTrackSelectionHolder.mayRetainStreamFlags[i11] = false;
                if (exoTrackSelection == null) {
                    preloadTrackSelectionHolder.selections[i11] = null;
                } else if (exoTrackSelection2 == null) {
                    preloadTrackSelectionHolder.selections[i11] = exoTrackSelection;
                } else if (!isSameAdaptionSet(exoTrackSelection, exoTrackSelection2)) {
                    preloadTrackSelectionHolder.selections[i11] = exoTrackSelection;
                } else if (exoTrackSelection.getTrackGroup().type == 2 || exoTrackSelection.getTrackGroup().type == 1 || exoTrackSelection.getSelectedIndexInTrackGroup() == exoTrackSelection2.getSelectedIndexInTrackGroup()) {
                    preloadTrackSelectionHolder.mayRetainStreamFlags[i11] = true;
                } else {
                    preloadTrackSelectionHolder.selections[i11] = exoTrackSelection;
                }
                z11 = true;
            }
        }
        return z11;
    }

    private void prepareInternal(long j11) {
        this.prepareInternalCalled = true;
        this.mediaPeriod.prepare(new MediaPeriod.Callback() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1
            @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
            public void onPrepared(MediaPeriod mediaPeriod) {
                PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                preloadMediaPeriod.prepared = true;
                ((MediaPeriod.Callback) Assertions.checkNotNull(preloadMediaPeriod.callback)).onPrepared(PreloadMediaPeriod.this);
            }

            @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
            public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                ((MediaPeriod.Callback) Assertions.checkNotNull(PreloadMediaPeriod.this.callback)).onContinueLoadingRequested(PreloadMediaPeriod.this);
            }
        }, j11);
    }

    private long selectTracksInternal(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        PreloadTrackSelectionHolder preloadTrackSelectionHolder = this.preloadTrackSelectionHolder;
        if (preloadTrackSelectionHolder == null) {
            return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j11);
        }
        Assertions.checkState(sampleStreamArr.length == preloadTrackSelectionHolder.streams.length);
        PreloadTrackSelectionHolder preloadTrackSelectionHolder2 = this.preloadTrackSelectionHolder;
        if (j11 == preloadTrackSelectionHolder2.trackSelectionPositionUs) {
            PreloadTrackSelectionHolder preloadTrackSelectionHolder3 = (PreloadTrackSelectionHolder) Assertions.checkNotNull(preloadTrackSelectionHolder2);
            long j12 = preloadTrackSelectionHolder3.trackSelectionPositionUs;
            boolean[] zArr3 = preloadTrackSelectionHolder3.streamResetFlags;
            if (maybeUpdatePreloadTrackSelectionHolderForReselection(exoTrackSelectionArr, preloadTrackSelectionHolder3)) {
                boolean[] zArr4 = new boolean[zArr3.length];
                j12 = this.mediaPeriod.selectTracks(preloadTrackSelectionHolder3.selections, preloadTrackSelectionHolder3.mayRetainStreamFlags, preloadTrackSelectionHolder3.streams, zArr4, preloadTrackSelectionHolder3.trackSelectionPositionUs);
                int i11 = 0;
                while (true) {
                    boolean[] zArr5 = preloadTrackSelectionHolder3.mayRetainStreamFlags;
                    if (i11 >= zArr5.length) {
                        break;
                    }
                    if (zArr5[i11]) {
                        zArr4[i11] = true;
                    }
                    i11++;
                }
                zArr3 = zArr4;
            }
            SampleStream[] sampleStreamArr2 = preloadTrackSelectionHolder3.streams;
            System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, sampleStreamArr2.length);
            System.arraycopy(zArr3, 0, zArr2, 0, zArr3.length);
            this.preloadTrackSelectionHolder = null;
            return j12;
        }
        int i12 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.preloadTrackSelectionHolder.streams;
            if (i12 >= sampleStreamArr3.length) {
                this.preloadTrackSelectionHolder = null;
                return this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j11);
            }
            SampleStream sampleStream = sampleStreamArr3[i12];
            if (sampleStream != null) {
                sampleStreamArr[i12] = sampleStream;
                zArr[i12] = false;
            }
            i12++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        this.mediaPeriod.discardBuffer(j11, z11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j11, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.mediaPeriod.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.mediaPeriod.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    public void maybeThrowStreamError() throws IOException {
        Assertions.checkState(this.prepared);
        PreloadTrackSelectionHolder preloadTrackSelectionHolder = this.preloadTrackSelectionHolder;
        if (preloadTrackSelectionHolder != null) {
            for (SampleStream sampleStream : preloadTrackSelectionHolder.streams) {
                if (sampleStream != null) {
                    sampleStream.maybeThrowError();
                }
            }
        }
    }

    public void preload(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        }
        if (this.prepareInternalCalled) {
            return;
        }
        prepareInternal(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        if (this.prepared) {
            callback.onPrepared(this);
        } else {
            if (this.prepareInternalCalled) {
                return;
            }
            prepareInternal(j11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return this.mediaPeriod.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.mediaPeriod.reevaluateBuffer(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        return this.mediaPeriod.seekToUs(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        return selectTracksInternal(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j11);
    }

    public long selectTracksForPreloading(ExoTrackSelection[] exoTrackSelectionArr, long j11) {
        SampleStream[] sampleStreamArr = new SampleStream[exoTrackSelectionArr.length];
        boolean[] zArr = new boolean[exoTrackSelectionArr.length];
        boolean[] zArr2 = new boolean[exoTrackSelectionArr.length];
        long selectTracksInternal = selectTracksInternal(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, j11);
        this.preloadTrackSelectionHolder = new PreloadTrackSelectionHolder(exoTrackSelectionArr, zArr2, sampleStreamArr, zArr, selectTracksInternal);
        return selectTracksInternal;
    }
}
