package androidx.media3.common.util;

import androidx.media3.common.C;
import androidx.media3.common.audio.SpeedProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j11) {
        long j12 = 0;
        double d11 = 0.0d;
        while (j12 < j11) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j12);
            if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            d11 += (Math.min(nextSpeedChangeTimeUs, j11) - j12) / speedProvider.getSpeed(j12);
            j12 = nextSpeedChangeTimeUs;
        }
        return (long) Math.floor(d11);
    }

    public static long getNextSpeedChangeSamplePosition(SpeedProvider speedProvider, long j11, int i11) {
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(i11 > 0);
        long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(Util.sampleCountToDurationUs(j11, i11));
        if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
            return -1L;
        }
        return Util.durationUsToSampleCount(nextSpeedChangeTimeUs, i11);
    }

    public static float getSampleAlignedSpeed(SpeedProvider speedProvider, long j11, int i11) {
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(i11 > 0);
        return speedProvider.getSpeed(Util.sampleCountToDurationUs(j11, i11));
    }
}
