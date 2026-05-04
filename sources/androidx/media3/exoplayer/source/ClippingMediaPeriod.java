package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {

    @Nullable
    private MediaPeriod.Callback callback;

    @Nullable
    private ClippingMediaSource.IllegalClippingException clippingError;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = ClippingMediaPeriod.this.getBufferedPositionUs();
            int readData = this.childStream.readData(formatHolder, decoderInputBuffer, i11);
            if (readData == -5) {
                Format format = (Format) Assertions.checkNotNull(formatHolder.format);
                int i12 = format.encoderDelay;
                if (i12 != 0 || format.encoderPadding != 0) {
                    ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                    if (clippingMediaPeriod.startUs != 0) {
                        i12 = 0;
                    }
                    formatHolder.format = format.buildUpon().setEncoderDelay(i12).setEncoderPadding(clippingMediaPeriod.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            long j11 = ClippingMediaPeriod.this.endUs;
            if (j11 == Long.MIN_VALUE || ((readData != -4 || decoderInputBuffer.timeUs < j11) && !(readData == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return readData;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j11);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z11, long j11, long j12) {
        this.mediaPeriod = mediaPeriod;
        this.pendingInitialDiscontinuityPositionUs = z11 ? j11 : C.TIME_UNSET;
        this.startUs = j11;
        this.endUs = j12;
    }

    private SeekParameters clipSeekParameters(long j11, SeekParameters seekParameters) {
        long constrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j11 - this.startUs);
        long j12 = seekParameters.toleranceAfterUs;
        long j13 = this.endUs;
        long constrainValue2 = Util.constrainValue(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j11);
        return (constrainValue == seekParameters.toleranceBeforeUs && constrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(constrainValue, constrainValue2);
    }

    private static long enforceClippingRange(long j11, long j12, long j13) {
        long max = Math.max(j11, j12);
        return j13 != Long.MIN_VALUE ? Math.min(max, j13) : max;
    }

    private static boolean shouldKeepInitialDiscontinuity(long j11, long j12, ExoTrackSelection[] exoTrackSelectionArr) {
        if (j11 < j12) {
            return true;
        }
        if (j11 != 0) {
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        long j12 = this.startUs;
        if (j11 == j12) {
            return j12;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j11, clipSeekParameters(j11, seekParameters));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j11 = this.endUs;
            if (j11 == Long.MIN_VALUE || bufferedPositionUs < j11) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j11 = this.endUs;
            if (j11 == Long.MIN_VALUE || nextLoadPositionUs < j11) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (!isPendingInitialDiscontinuity()) {
            long readDiscontinuity = this.mediaPeriod.readDiscontinuity();
            return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : enforceClippingRange(readDiscontinuity, this.startUs, this.endUs);
        }
        long j11 = this.pendingInitialDiscontinuityPositionUs;
        this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
        long readDiscontinuity2 = readDiscontinuity();
        return readDiscontinuity2 != C.TIME_UNSET ? readDiscontinuity2 : j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
        this.mediaPeriod.reevaluateBuffer(j11);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        return enforceClippingRange(this.mediaPeriod.seekToUs(j11), this.startUs, this.endUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        this.sampleStreams = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i11 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i11 >= sampleStreamArr.length) {
                break;
            }
            ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i11];
            clippingSampleStreamArr[i11] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.childStream;
            }
            sampleStreamArr2[i11] = sampleStream;
            i11++;
        }
        long selectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j11);
        long enforceClippingRange = enforceClippingRange(selectTracks, j11, this.endUs);
        this.pendingInitialDiscontinuityPositionUs = (isPendingInitialDiscontinuity() && shouldKeepInitialDiscontinuity(selectTracks, j11, exoTrackSelectionArr)) ? enforceClippingRange : C.TIME_UNSET;
        for (int i12 = 0; i12 < sampleStreamArr.length; i12++) {
            SampleStream sampleStream2 = sampleStreamArr2[i12];
            if (sampleStream2 == null) {
                this.sampleStreams[i12] = null;
            } else {
                ClippingSampleStream[] clippingSampleStreamArr2 = this.sampleStreams;
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i12];
                if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStream2) {
                    clippingSampleStreamArr2[i12] = new ClippingSampleStream(sampleStream2);
                }
            }
            sampleStreamArr[i12] = this.sampleStreams[i12];
        }
        return enforceClippingRange;
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    public void updateClipping(long j11, long j12) {
        this.startUs = j11;
        this.endUs = j12;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }
}
