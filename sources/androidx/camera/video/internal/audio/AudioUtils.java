package androidx.camera.video.internal.audio;

import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AudioUtils {
    private AudioUtils() {
    }

    public static int channelCountToChannelConfig(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static int channelCountToChannelMask(int i11) {
        return i11 == 1 ? 16 : 12;
    }

    public static long computeInterpolatedTimeNs(int i11, long j11, @NonNull AudioTimestamp audioTimestamp) {
        Preconditions.checkArgument(((long) i11) > 0, "sampleRate must be greater than 0.");
        Preconditions.checkArgument(j11 >= 0, "framePosition must be no less than 0.");
        long frameCountToDurationNs = audioTimestamp.nanoTime + frameCountToDurationNs(j11 - audioTimestamp.framePosition, i11);
        if (frameCountToDurationNs < 0) {
            return 0L;
        }
        return frameCountToDurationNs;
    }

    public static long frameCountToDurationNs(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j11) / j12;
    }

    public static long frameCountToSize(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 * j12;
    }

    public static int getBytesPerFrame(int i11, int i12) {
        Preconditions.checkArgument(i12 > 0, "Invalid channel count: " + i12);
        if (i11 == 2) {
            return i12 * 2;
        }
        if (i11 == 3) {
            return i12;
        }
        if (i11 != 4) {
            if (i11 == 21) {
                return i12 * 3;
            }
            if (i11 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i11);
            }
        }
        return i12 * 4;
    }

    public static long sizeToFrameCount(long j11, int i11) {
        long j12 = i11;
        Preconditions.checkArgument(j12 > 0, "bytesPerFrame must be greater than 0.");
        return j11 / j12;
    }
}
