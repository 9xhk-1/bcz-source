package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.metadata.id3.MlltFrame;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] jArr, long[] jArr2, long j11) {
        this.referencePositions = jArr;
        this.referenceTimesMs = jArr2;
        this.durationUs = j11 == C.TIME_UNSET ? Util.msToUs(jArr2[jArr2.length - 1]) : j11;
    }

    public static MlltSeeker create(long j11, MlltFrame mlltFrame, long j12) {
        int length = mlltFrame.bytesDeviations.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i13];
            j13 += mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i13];
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new MlltSeeker(jArr, jArr2, j12);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j11, long[] jArr, long[] jArr2) {
        int binarySearchFloor = Util.binarySearchFloor(jArr, j11, true, true);
        long j12 = jArr[binarySearchFloor];
        long j13 = jArr2[binarySearchFloor];
        int i11 = binarySearchFloor + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((jArr[i11] == j12 ? 0.0d : (j11 - j12) / (r6 - j12)) * (jArr2[i11] - j13))) + j13));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return C.RATE_UNSET_INT;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        Pair<Long, Long> linearlyInterpolate = linearlyInterpolate(Util.usToMs(Util.constrainValue(j11, 0L, this.durationUs)), this.referenceTimesMs, this.referencePositions);
        return new SeekMap.SeekPoints(new SeekPoint(Util.msToUs(((Long) linearlyInterpolate.first).longValue()), ((Long) linearlyInterpolate.second).longValue()));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return Util.msToUs(((Long) linearlyInterpolate(j11, this.referencePositions, this.referenceTimesMs).second).longValue());
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
