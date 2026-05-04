package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import ro.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final int TIMESCALE_UNSET = -1;
    private static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public Mp4TimestampData(long j11, long j12) {
        this.creationTimestampSeconds = j11;
        this.modificationTimestampSeconds = j12;
        this.timescale = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j11) {
        return (j11 / 1000) + 2082844800;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public int hashCode() {
        return ((((527 + k.l(this.creationTimestampSeconds)) * 31) + k.l(this.modificationTimestampSeconds)) * 31) + k.l(this.timescale);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    public Mp4TimestampData(long j11, long j12, long j13) {
        this.creationTimestampSeconds = j11;
        this.modificationTimestampSeconds = j12;
        this.timescale = j13;
    }
}
