package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i11, @Nullable Object obj, long j11, long j12, long j13) {
        super(dataSource, dataSpec, 1, format, i11, obj, j11, j12);
        Assertions.checkNotNull(format);
        this.chunkIndex = j13;
    }

    public long getNextChunkIndex() {
        long j11 = this.chunkIndex;
        if (j11 != -1) {
            return j11 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
