package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final Format FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final MediaItem MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;

    @GuardedBy("this")
    private MediaItem mediaItem;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory {
        private long durationUs;

        @Nullable
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            Assertions.checkState(this.durationUs > 0);
            return new SilenceMediaSource(this.durationUs, SilenceMediaSource.MEDIA_ITEM.buildUpon().setTag(this.tag).build());
        }

        @uo.a
        public Factory setDurationUs(@IntRange(from = 1) long j11) {
            this.durationUs = j11;
            return this;
        }

        @uo.a
        public Factory setTag(@Nullable Object obj) {
            this.tag = obj;
            return this;
        }
    }

    static {
        Format build = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(2).setSampleRate(44100).setPcmEncoding(2).build();
        FORMAT = build;
        MEDIA_ITEM = new MediaItem.Builder().setMediaId(MEDIA_ID).setUri(Uri.EMPTY).setMimeType(build.sampleMimeType).build();
        SILENCE_SAMPLE = new byte[Util.getPcmFrameSize(2, 2) * 1024];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j11) {
        return Util.getPcmFrameSize(2, 2) * ((j11 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j11) {
        return ((j11 / Util.getPcmFrameSize(2, 2)) * 1000000) / 44100;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        return new SilenceMediaPeriod(this.durationUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    public SilenceMediaSource(long j11) {
        this(j11, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j11, MediaItem mediaItem) {
        Assertions.checkArgument(j11 >= 0);
        this.durationUs = j11;
        this.mediaItem = mediaItem;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SilenceMediaPeriod implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new TrackGroup(SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        public SilenceMediaPeriod(long j11) {
            this.durationUs = j11;
        }

        private long constrainSeekPosition(long j11) {
            return Util.constrainValue(j11, 0L, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
            return constrainSeekPosition(j11);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j11) {
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j11) {
            long constrainSeekPosition = constrainSeekPosition(j11);
            for (int i11 = 0; i11 < this.sampleStreams.size(); i11++) {
                ((SilenceSampleStream) this.sampleStreams.get(i11)).seekTo(constrainSeekPosition);
            }
            return constrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
            long constrainSeekPosition = constrainSeekPosition(j11);
            for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
                SampleStream sampleStream = sampleStreamArr[i11];
                if (sampleStream != null && (exoTrackSelectionArr[i11] == null || !zArr[i11])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i11] = null;
                }
                if (sampleStreamArr[i11] == null && exoTrackSelectionArr[i11] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(constrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i11] = silenceSampleStream;
                    zArr2[i11] = true;
                }
            }
            return constrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j11) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j11, boolean z11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SilenceSampleStream implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long j11) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j11);
            seekTo(0L);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            if (!this.sentFormat || (i11 & 2) != 0) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j11 = this.durationBytes;
            long j12 = this.positionBytes;
            long j13 = j11 - j12;
            if (j13 == 0) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            decoderInputBuffer.timeUs = SilenceMediaSource.getAudioPositionUs(j12);
            decoderInputBuffer.addFlag(1);
            int min = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j13);
            if ((i11 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(min);
                decoderInputBuffer.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, min);
            }
            if ((i11 & 1) == 0) {
                this.positionBytes += min;
            }
            return -4;
        }

        public void seekTo(long j11) {
            this.positionBytes = Util.constrainValue(SilenceMediaSource.getAudioByteCount(j11), 0L, this.durationBytes);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            long j12 = this.positionBytes;
            seekTo(j11);
            return (int) ((this.positionBytes - j12) / SilenceMediaSource.SILENCE_SAMPLE.length);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }
}
