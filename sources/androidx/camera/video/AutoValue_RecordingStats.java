package androidx.camera.video;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    private final AudioStats audioStats;
    private final long numBytesRecorded;
    private final long recordedDurationNanos;

    public AutoValue_RecordingStats(long j11, long j12, AudioStats audioStats) {
        this.recordedDurationNanos = j11;
        this.numBytesRecorded = j12;
        if (audioStats == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.audioStats = audioStats;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecordingStats) {
            RecordingStats recordingStats = (RecordingStats) obj;
            if (this.recordedDurationNanos == recordingStats.getRecordedDurationNanos() && this.numBytesRecorded == recordingStats.getNumBytesRecorded() && this.audioStats.equals(recordingStats.getAudioStats())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.RecordingStats
    @NonNull
    public AudioStats getAudioStats() {
        return this.audioStats;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getNumBytesRecorded() {
        return this.numBytesRecorded;
    }

    @Override // androidx.camera.video.RecordingStats
    public long getRecordedDurationNanos() {
        return this.recordedDurationNanos;
    }

    public int hashCode() {
        long j11 = this.recordedDurationNanos;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.numBytesRecorded;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.audioStats.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.recordedDurationNanos + ", numBytesRecorded=" + this.numBytesRecorded + ", audioStats=" + this.audioStats + com.alipay.sdk.m.u.i.f11099d;
    }
}
