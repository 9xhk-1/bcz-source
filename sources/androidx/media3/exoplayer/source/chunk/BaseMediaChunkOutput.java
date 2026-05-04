package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.TrackOutput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i11 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i11 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i11] = sampleQueueArr[i11].getWriteIndex();
            i11++;
        }
    }

    public void setSampleOffsetUs(long j11) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j11);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i11, int i12) {
        int i13 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i13 >= iArr.length) {
                Log.e(TAG, "Unmatched track of type: " + i12);
                return new DiscardingTrackOutput();
            }
            if (i12 == iArr[i13]) {
                return this.sampleQueues[i13];
            }
            i13++;
        }
    }
}
