package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class RecordingStats {
    @NonNull
    public static RecordingStats of(long j11, long j12, @NonNull AudioStats audioStats) {
        Preconditions.checkArgument(j11 >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j12 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j11, j12, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
