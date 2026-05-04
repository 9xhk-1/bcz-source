package androidx.media3.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.SeekMap;
import java.math.RoundingMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class IndexSeeker implements Seeker {

    @VisibleForTesting
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final IndexSeekMap indexSeekMap;

    public IndexSeeker(long j11, long j12, long j13) {
        this.indexSeekMap = new IndexSeekMap(new long[]{j12}, new long[]{0}, j11);
        this.dataEndPosition = j13;
        int i11 = C.RATE_UNSET_INT;
        if (j11 == C.TIME_UNSET) {
            this.averageBitrate = C.RATE_UNSET_INT;
            return;
        }
        long scaleLargeValue = Util.scaleLargeValue(j12 - j13, 8L, j11, RoundingMode.HALF_UP);
        if (scaleLargeValue > 0 && scaleLargeValue <= SieveCacheKt.NodeLinkMask) {
            i11 = (int) scaleLargeValue;
        }
        this.averageBitrate = i11;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        return this.indexSeekMap.getSeekPoints(j11);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return this.indexSeekMap.getTimeUs(j11);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j11) {
        return this.indexSeekMap.isTimeUsInIndex(j11, 100000L);
    }

    public void maybeAddSeekPoint(long j11, long j12) {
        if (isTimeUsInIndex(j11)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j11, j12);
    }

    public void setDurationUs(long j11) {
        this.indexSeekMap.setDurationUs(j11);
    }
}
