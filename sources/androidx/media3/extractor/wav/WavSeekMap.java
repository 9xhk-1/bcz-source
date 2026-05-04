package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WavSeekMap implements SeekMap {
    private final long blockCount;
    private final long durationUs;
    private final long firstBlockPosition;
    private final int framesPerBlock;
    private final WavFormat wavFormat;

    public WavSeekMap(WavFormat wavFormat, int i11, long j11, long j12) {
        this.wavFormat = wavFormat;
        this.framesPerBlock = i11;
        this.firstBlockPosition = j11;
        long j13 = (j12 - j11) / wavFormat.blockSize;
        this.blockCount = j13;
        this.durationUs = blockIndexToTimeUs(j13);
    }

    private long blockIndexToTimeUs(long j11) {
        return Util.scaleLargeTimestamp(j11 * this.framesPerBlock, 1000000L, this.wavFormat.frameRateHz);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        long constrainValue = Util.constrainValue((this.wavFormat.frameRateHz * j11) / (this.framesPerBlock * 1000000), 0L, this.blockCount - 1);
        long j12 = this.firstBlockPosition + (this.wavFormat.blockSize * constrainValue);
        long blockIndexToTimeUs = blockIndexToTimeUs(constrainValue);
        SeekPoint seekPoint = new SeekPoint(blockIndexToTimeUs, j12);
        if (blockIndexToTimeUs >= j11 || constrainValue == this.blockCount - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        long j13 = constrainValue + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(blockIndexToTimeUs(j13), this.firstBlockPosition + (this.wavFormat.blockSize * j13)));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
