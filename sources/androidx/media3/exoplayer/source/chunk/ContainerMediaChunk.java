package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import uo.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ContainerMediaChunk extends BaseMediaChunk {
    private final int chunkCount;
    private final ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, long j11, long j12, long j13, long j14, long j15, int i12, long j16, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i11, obj, j11, j12, j13, j14, j15);
        this.chunkCount = i12;
        this.sampleOffsetUs = j16;
        this.chunkExtractor = chunkExtractor;
    }

    private void maybeWriteEmptySamples(BaseMediaChunkOutput baseMediaChunkOutput) {
        if (MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            Format format = this.trackFormat;
            int i11 = format.tileCountHorizontal;
            if ((i11 <= 1 && format.tileCountVertical <= 1) || i11 == -1 || format.tileCountVertical == -1) {
                return;
            }
            TrackOutput track = baseMediaChunkOutput.track(0, 4);
            Format format2 = this.trackFormat;
            int i12 = format2.tileCountHorizontal * format2.tileCountVertical;
            long j11 = (this.endTimeUs - this.startTimeUs) / i12;
            for (int i13 = 1; i13 < i12; i13++) {
                track.sampleData(new ParsableByteArray(), 0);
                track.sampleMetadata(i13 * j11, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    public final long getNextLoadPosition() {
        return this.nextLoadPosition;
    }

    public final boolean isLoadCanceled() {
        return this.loadCanceled;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws IOException {
        BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            ChunkExtractor chunkExtractor = this.chunkExtractor;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j11 = this.clippedStartTimeUs;
            long j12 = C.TIME_UNSET;
            long j13 = j11 == C.TIME_UNSET ? -9223372036854775807L : j11 - this.sampleOffsetUs;
            long j14 = this.clippedEndTimeUs;
            if (j14 != C.TIME_UNSET) {
                j12 = j14 - this.sampleOffsetUs;
            }
            chunkExtractor.init(trackOutputProvider, j13, j12);
        }
        try {
            DataSpec subrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, subrange.position, statsDataSource.open(subrange));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } finally {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                }
            } while (this.chunkExtractor.read(defaultExtractorInput));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            onLoadEnded();
            DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (Throwable th2) {
            onLoadEnded();
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }

    @g
    public void onLoadEnded() {
    }

    public ChunkExtractor.TrackOutputProvider getTrackOutputProvider(BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }
}
