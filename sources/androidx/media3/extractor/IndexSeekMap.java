package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class IndexSeekMap implements SeekMap {
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j11) {
        Assertions.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.positions = new LongArray(length);
            this.timesUs = new LongArray(length);
        } else {
            int i11 = length + 1;
            LongArray longArray = new LongArray(i11);
            this.positions = longArray;
            LongArray longArray2 = new LongArray(i11);
            this.timesUs = longArray2;
            longArray.add(0L);
            longArray2.add(0L);
        }
        this.positions.addAll(jArr);
        this.timesUs.addAll(jArr2);
        this.durationUs = j11;
    }

    public void addSeekPoint(long j11, long j12) {
        if (this.timesUs.size() == 0 && j11 > 0) {
            this.positions.add(0L);
            this.timesUs.add(0L);
        }
        this.positions.add(j12);
        this.timesUs.add(j11);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        if (this.timesUs.size() == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j11, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs.get(binarySearchFloor), this.positions.get(binarySearchFloor));
        if (seekPoint.timeUs == j11 || binarySearchFloor == this.timesUs.size() - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i11 = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs.get(i11), this.positions.get(i11)));
    }

    public long getTimeUs(long j11) {
        if (this.timesUs.size() == 0) {
            return C.TIME_UNSET;
        }
        return this.timesUs.get(Util.binarySearchFloor(this.positions, j11, true, true));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.timesUs.size() > 0;
    }

    public boolean isTimeUsInIndex(long j11, long j12) {
        if (this.timesUs.size() == 0) {
            return false;
        }
        LongArray longArray = this.timesUs;
        return j11 - longArray.get(longArray.size() - 1) < j12;
    }

    public void setDurationUs(long j11) {
        this.durationUs = j11;
    }
}
