package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ExternalLoader;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.util.concurrent.a1;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.p1;
import com.google.common.util.concurrent.w1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ExternallyLoadedMediaPeriod implements MediaPeriod {
    private final ExternalLoader externalLoader;
    private final AtomicBoolean loadingFinished;
    private p1<?> loadingFuture;
    private final AtomicReference<Throwable> loadingThrowable;
    private final byte[] sampleData;
    private final TrackGroupArray tracks;
    private final Uri uri;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class SampleStreamImpl implements SampleStream {
        private static final int STREAM_STATE_END_OF_STREAM = 2;
        private static final int STREAM_STATE_SEND_FORMAT = 0;
        private static final int STREAM_STATE_SEND_SAMPLE = 1;
        private int streamState = 0;

        public SampleStreamImpl() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ExternallyLoadedMediaPeriod.this.loadingFinished.get();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws IOException {
            Throwable th2 = (Throwable) ExternallyLoadedMediaPeriod.this.loadingThrowable.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            int i12 = this.streamState;
            if (i12 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i11 & 2) != 0 || i12 == 0) {
                formatHolder.format = ExternallyLoadedMediaPeriod.this.tracks.get(0).getFormat(0);
                this.streamState = 1;
                return -5;
            }
            if (!ExternallyLoadedMediaPeriod.this.loadingFinished.get()) {
                return -3;
            }
            int length = ExternallyLoadedMediaPeriod.this.sampleData.length;
            decoderInputBuffer.addFlag(1);
            decoderInputBuffer.timeUs = 0L;
            if ((i11 & 4) == 0) {
                decoderInputBuffer.ensureSpaceForWrite(length);
                decoderInputBuffer.data.put(ExternallyLoadedMediaPeriod.this.sampleData, 0, length);
            }
            if ((i11 & 1) == 0) {
                this.streamState = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j11) {
            return 0;
        }
    }

    public ExternallyLoadedMediaPeriod(Uri uri, String str, ExternalLoader externalLoader) {
        this.uri = uri;
        Format build = new Format.Builder().setSampleMimeType(str).build();
        this.externalLoader = externalLoader;
        this.tracks = new TrackGroupArray(new TrackGroup(build));
        this.sampleData = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.loadingFinished = new AtomicBoolean();
        this.loadingThrowable = new AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return !this.loadingFinished.get();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.loadingFinished.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.tracks;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished.get();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j11) {
        callback.onPrepared(this);
        p1<?> load = this.externalLoader.load(new ExternalLoader.LoadRequest(this.uri));
        this.loadingFuture = load;
        d1.c(load, new a1<Object>() { // from class: androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod.1
            @Override // com.google.common.util.concurrent.a1
            public void onFailure(Throwable th2) {
                ExternallyLoadedMediaPeriod.this.loadingThrowable.set(th2);
            }

            @Override // com.google.common.util.concurrent.a1
            public void onSuccess(@Nullable Object obj) {
                ExternallyLoadedMediaPeriod.this.loadingFinished.set(true);
            }
        }, w1.c());
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    public void releasePeriod() {
        p1<?> p1Var = this.loadingFuture;
        if (p1Var != null) {
            p1Var.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            if (sampleStreamArr[i11] != null && (exoTrackSelectionArr[i11] == null || !zArr[i11])) {
                sampleStreamArr[i11] = null;
            }
            if (sampleStreamArr[i11] == null && exoTrackSelectionArr[i11] != null) {
                sampleStreamArr[i11] = new SampleStreamImpl();
                zArr2[i11] = true;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j11) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j11) {
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j11, boolean z11) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j11, SeekParameters seekParameters) {
        return j11;
    }
}
