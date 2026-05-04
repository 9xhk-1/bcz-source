package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import androidx.media3.common.C;
import com.tencent.ijk.media.player.IjkMediaMeta;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TimestampAdjuster {
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;

    @GuardedBy("this")
    private long firstSampleTimestampUs;

    @GuardedBy("this")
    private long lastUnadjustedTimestampUs;
    private final ThreadLocal<Long> nextSampleTimestampUs = new ThreadLocal<>();

    @GuardedBy("this")
    private long timestampOffsetUs;

    public TimestampAdjuster(long j11) {
        reset(j11);
    }

    public static long ptsToUs(long j11) {
        return Util.scaleLargeTimestamp(j11, 1000000L, 90000L);
    }

    public static long usToNonWrappedPts(long j11) {
        return Util.scaleLargeTimestamp(j11, 90000L, 1000000L);
    }

    public static long usToWrappedPts(long j11) {
        return usToNonWrappedPts(j11) % 8589934592L;
    }

    public synchronized long adjustSampleTimestamp(long j11) {
        if (j11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!isInitialized()) {
                long j12 = this.firstSampleTimestampUs;
                if (j12 == MODE_SHARED) {
                    j12 = ((Long) Assertions.checkNotNull(this.nextSampleTimestampUs.get())).longValue();
                }
                this.timestampOffsetUs = j12 - j11;
                notifyAll();
            }
            this.lastUnadjustedTimestampUs = j11;
            return j11 + this.timestampOffsetUs;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestamp(long j11) {
        if (j11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j12 = this.lastUnadjustedTimestampUs;
            if (j12 != C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j12);
                long j13 = (IjkMediaMeta.AV_CH_WIDE_RIGHT + usToNonWrappedPts) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                j11 += j13 * 8589934592L;
                if (Math.abs(j14 - usToNonWrappedPts) < Math.abs(j11 - usToNonWrappedPts)) {
                    j11 = j14;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j11) {
        if (j11 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j12 = this.lastUnadjustedTimestampUs;
            if (j12 != C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j12);
                long j13 = usToNonWrappedPts / 8589934592L;
                long j14 = (j13 * 8589934592L) + j11;
                j11 += (j13 + 1) * 8589934592L;
                if (j14 >= usToNonWrappedPts) {
                    j11 = j14;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long getFirstSampleTimestampUs() {
        long j11;
        j11 = this.firstSampleTimestampUs;
        if (j11 == Long.MAX_VALUE || j11 == MODE_SHARED) {
            j11 = C.TIME_UNSET;
        }
        return j11;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j11;
        try {
            j11 = this.lastUnadjustedTimestampUs;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != C.TIME_UNSET ? j11 + this.timestampOffsetUs : getFirstSampleTimestampUs();
    }

    public synchronized long getTimestampOffsetUs() {
        return this.timestampOffsetUs;
    }

    public synchronized boolean isInitialized() {
        return this.timestampOffsetUs != C.TIME_UNSET;
    }

    public synchronized void reset(long j11) {
        this.firstSampleTimestampUs = j11;
        this.timestampOffsetUs = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = C.TIME_UNSET;
    }

    public synchronized void sharedInitializeOrWait(boolean z11, long j11, long j12) throws InterruptedException, TimeoutException {
        try {
            Assertions.checkState(this.firstSampleTimestampUs == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z11) {
                this.nextSampleTimestampUs.set(Long.valueOf(j11));
            } else {
                long j13 = 0;
                long j14 = j12;
                while (!isInitialized()) {
                    if (j12 == 0) {
                        wait();
                    } else {
                        Assertions.checkState(j14 > 0);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        wait(j14);
                        j13 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j13 >= j12 && !isInitialized()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j12 + " milliseconds");
                        }
                        j14 = j12 - j13;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
