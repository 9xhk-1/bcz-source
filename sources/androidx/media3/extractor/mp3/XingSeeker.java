package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j11, int i11, long j12, int i12) {
        this(j11, i11, j12, i12, -1L, null);
    }

    @Nullable
    public static XingSeeker create(XingFrame xingFrame, long j11) {
        long[] jArr;
        long computeDurationUs = xingFrame.computeDurationUs();
        if (computeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j12 = xingFrame.dataSize;
        if (j12 == -1 || (jArr = xingFrame.tableOfContents) == null) {
            MpegAudioUtil.Header header = xingFrame.header;
            return new XingSeeker(j11, header.frameSize, computeDurationUs, header.bitrate);
        }
        MpegAudioUtil.Header header2 = xingFrame.header;
        return new XingSeeker(j11, header2.frameSize, computeDurationUs, header2.bitrate, j12, jArr);
    }

    private long getTimeUsForTableIndex(int i11) {
        return (this.durationUs * i11) / 100;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + this.xingFrameSize));
        }
        long constrainValue = Util.constrainValue(j11, 0L, this.durationUs);
        double d11 = (constrainValue * 100.0d) / this.durationUs;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i11 = (int) d11;
                double d13 = ((long[]) Assertions.checkStateNotNull(this.tableOfContents))[i11];
                d12 = d13 + ((d11 - i11) * ((i11 == 99 ? 256.0d : r3[i11 + 1]) - d13));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d12 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        long j12 = j11 - this.dataStartPosition;
        if (!isSeekable() || j12 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d11 = (j12 * 256.0d) / this.dataSize;
        int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d11, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
        long j13 = jArr[binarySearchFloor];
        int i11 = binarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i11);
        return timeUsForTableIndex + Math.round((j13 == (binarySearchFloor == 99 ? 256L : jArr[i11]) ? 0.0d : (d11 - j13) / (r0 - j13)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j11, int i11, long j12, int i12, long j13, @Nullable long[] jArr) {
        this.dataStartPosition = j11;
        this.xingFrameSize = i11;
        this.durationUs = j12;
        this.bitrate = i12;
        this.dataSize = j13;
        this.tableOfContents = jArr;
        this.dataEndPosition = j13 != -1 ? j11 + j13 : -1L;
    }
}
