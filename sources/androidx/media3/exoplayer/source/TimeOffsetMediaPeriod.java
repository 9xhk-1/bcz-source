package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private final MediaPeriod mediaPeriod;
    private final long timeOffsetUs;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream sampleStream;
        private final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j11) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j11;
        }

        public SampleStream getChildStream() {
            return this.sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.sampleStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            int readData = this.sampleStream.readData(formatHolder, decoderInputBuffer, i11);
            if (readData == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return readData;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            return this.sampleStream.skipData(j11 - this.timeOffsetUs);
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j11) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo.buildUpon().setPlaybackPositionUs(loadingInfo.playbackPositionUs - this.timeOffsetUs).build());
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
        this.mediaPeriod.discardBuffer(j11 - this.timeOffsetUs, z11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        return this.mediaPeriod.getAdjustedSeekPositionUs(j11 - this.timeOffsetUs, seekParameters) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public MediaPeriod getWrappedMediaPeriod() {
        return this.mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j11 - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long readDiscontinuity = this.mediaPeriod.readDiscontinuity();
        return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : readDiscontinuity + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.mediaPeriod.reevaluateBuffer(j11 - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        return this.mediaPeriod.seekToUs(j11 - this.timeOffsetUs) + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i11 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i11 >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i11];
            if (timeOffsetSampleStream != null) {
                sampleStream = timeOffsetSampleStream.getChildStream();
            }
            sampleStreamArr2[i11] = sampleStream;
            i11++;
        }
        long selectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j11 - this.timeOffsetUs);
        for (int i12 = 0; i12 < sampleStreamArr.length; i12++) {
            SampleStream sampleStream2 = sampleStreamArr2[i12];
            if (sampleStream2 == null) {
                sampleStreamArr[i12] = null;
            } else {
                SampleStream sampleStream3 = sampleStreamArr[i12];
                if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).getChildStream() != sampleStream2) {
                    sampleStreamArr[i12] = new TimeOffsetSampleStream(sampleStream2, this.timeOffsetUs);
                }
            }
        }
        return selectTracks + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}
