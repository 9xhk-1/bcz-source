package androidx.media3.extractor.avi;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private int chunkCount;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private long firstIndexChunkOffset;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final AviStreamHeaderChunk streamHeaderChunk;
    private final TrackOutput trackOutput;

    public ChunkReader(int i11, AviStreamHeaderChunk aviStreamHeaderChunk, TrackOutput trackOutput) {
        this.streamHeaderChunk = aviStreamHeaderChunk;
        int trackType = aviStreamHeaderChunk.getTrackType();
        boolean z11 = true;
        if (trackType != 1 && trackType != 2) {
            z11 = false;
        }
        Assertions.checkArgument(z11);
        this.chunkId = getChunkIdFourCc(i11, trackType == 2 ? CHUNK_TYPE_VIDEO_COMPRESSED : CHUNK_TYPE_AUDIO);
        this.durationUs = aviStreamHeaderChunk.getDurationUs();
        this.trackOutput = trackOutput;
        this.alternativeChunkId = trackType == 2 ? getChunkIdFourCc(i11, CHUNK_TYPE_VIDEO_UNCOMPRESSED) : -1;
        this.firstIndexChunkOffset = -1L;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
        this.chunkCount = aviStreamHeaderChunk.length;
    }

    private static int getChunkIdFourCc(int i11, int i12) {
        return (((i11 % 10) + 48) << 8) | ((i11 / 10) + 48) | i12;
    }

    private long getChunkTimestampUs(int i11) {
        return (this.durationUs * i11) / this.chunkCount;
    }

    private SeekPoint getSeekPoint(int i11) {
        return new SeekPoint(this.keyFrameIndices[i11] * getFrameDurationUs(), this.keyFrameOffsets[i11]);
    }

    public void advanceCurrentChunk() {
        this.currentChunkIndex++;
    }

    public void appendIndexChunk(long j11, boolean z11) {
        if (this.firstIndexChunkOffset == -1) {
            this.firstIndexChunkOffset = j11;
        }
        if (z11) {
            if (this.indexSize == this.keyFrameIndices.length) {
                long[] jArr = this.keyFrameOffsets;
                this.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.keyFrameIndices;
                this.keyFrameIndices = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.keyFrameOffsets;
            int i11 = this.indexSize;
            jArr2[i11] = j11;
            this.keyFrameIndices[i11] = this.indexChunkCount;
            this.indexSize = i11 + 1;
        }
        this.indexChunkCount++;
    }

    public void commitIndex() {
        int i11;
        this.keyFrameOffsets = Arrays.copyOf(this.keyFrameOffsets, this.indexSize);
        this.keyFrameIndices = Arrays.copyOf(this.keyFrameIndices, this.indexSize);
        if (!isAudio() || this.streamHeaderChunk.sampleSize == 0 || (i11 = this.indexSize) <= 0) {
            return;
        }
        this.chunkCount = i11;
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.currentChunkIndex);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public SeekMap.SeekPoints getSeekPoints(long j11) {
        if (this.indexSize == 0) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstIndexChunkOffset));
        }
        int frameDurationUs = (int) (j11 / getFrameDurationUs());
        int binarySearchFloor = Util.binarySearchFloor(this.keyFrameIndices, frameDurationUs, true, true);
        if (this.keyFrameIndices[binarySearchFloor] == frameDurationUs) {
            return new SeekMap.SeekPoints(getSeekPoint(binarySearchFloor));
        }
        SeekPoint seekPoint = getSeekPoint(binarySearchFloor);
        int i11 = binarySearchFloor + 1;
        return i11 < this.keyFrameOffsets.length ? new SeekMap.SeekPoints(seekPoint, getSeekPoint(i11)) : new SeekMap.SeekPoints(seekPoint);
    }

    public boolean handlesChunkId(int i11) {
        return this.chunkId == i11 || this.alternativeChunkId == i11;
    }

    public boolean isAudio() {
        return (this.chunkId & CHUNK_TYPE_AUDIO) == CHUNK_TYPE_AUDIO;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.keyFrameIndices, this.currentChunkIndex) >= 0;
    }

    public boolean isVideo() {
        return (this.chunkId & CHUNK_TYPE_VIDEO_COMPRESSED) == CHUNK_TYPE_VIDEO_COMPRESSED;
    }

    public boolean onChunkData(ExtractorInput extractorInput) throws IOException {
        int i11 = this.bytesRemainingInCurrentChunk;
        int sampleData = i11 - this.trackOutput.sampleData((DataReader) extractorInput, i11, false);
        this.bytesRemainingInCurrentChunk = sampleData;
        boolean z11 = sampleData == 0;
        if (z11) {
            if (this.currentChunkSize > 0) {
                this.trackOutput.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.currentChunkSize, 0, null);
            }
            advanceCurrentChunk();
        }
        return z11;
    }

    public void onChunkStart(int i11) {
        this.currentChunkSize = i11;
        this.bytesRemainingInCurrentChunk = i11;
    }

    public void seekToPosition(long j11) {
        if (this.indexSize == 0) {
            this.currentChunkIndex = 0;
        } else {
            this.currentChunkIndex = this.keyFrameIndices[Util.binarySearchFloor(this.keyFrameOffsets, j11, true, true)];
        }
    }
}
