package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_Recorder_RecordingRecord extends Recorder.RecordingRecord {
    private final Executor getCallbackExecutor;
    private final Consumer<VideoRecordEvent> getEventListener;
    private final OutputOptions getOutputOptions;
    private final long getRecordingId;
    private final boolean hasAudioEnabled;
    private final boolean isPersistent;

    public AutoValue_Recorder_RecordingRecord(OutputOptions outputOptions, @Nullable Executor executor, @Nullable Consumer<VideoRecordEvent> consumer, boolean z11, boolean z12, long j11) {
        if (outputOptions == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.getOutputOptions = outputOptions;
        this.getCallbackExecutor = executor;
        this.getEventListener = consumer;
        this.hasAudioEnabled = z11;
        this.isPersistent = z12;
        this.getRecordingId = j11;
    }

    public boolean equals(Object obj) {
        Executor executor;
        Consumer<VideoRecordEvent> consumer;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Recorder.RecordingRecord) {
            Recorder.RecordingRecord recordingRecord = (Recorder.RecordingRecord) obj;
            if (this.getOutputOptions.equals(recordingRecord.getOutputOptions()) && ((executor = this.getCallbackExecutor) != null ? executor.equals(recordingRecord.getCallbackExecutor()) : recordingRecord.getCallbackExecutor() == null) && ((consumer = this.getEventListener) != null ? consumer.equals(recordingRecord.getEventListener()) : recordingRecord.getEventListener() == null) && this.hasAudioEnabled == recordingRecord.hasAudioEnabled() && this.isPersistent == recordingRecord.isPersistent() && this.getRecordingId == recordingRecord.getRecordingId()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @Nullable
    public Executor getCallbackExecutor() {
        return this.getCallbackExecutor;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @Nullable
    public Consumer<VideoRecordEvent> getEventListener() {
        return this.getEventListener;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    @NonNull
    public OutputOptions getOutputOptions() {
        return this.getOutputOptions;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    public long getRecordingId() {
        return this.getRecordingId;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    public boolean hasAudioEnabled() {
        return this.hasAudioEnabled;
    }

    public int hashCode() {
        int hashCode = (this.getOutputOptions.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.getCallbackExecutor;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        Consumer<VideoRecordEvent> consumer = this.getEventListener;
        int hashCode3 = (((hashCode2 ^ (consumer != null ? consumer.hashCode() : 0)) * 1000003) ^ (this.hasAudioEnabled ? 1231 : 1237)) * 1000003;
        int i11 = this.isPersistent ? 1231 : 1237;
        long j11 = this.getRecordingId;
        return ((hashCode3 ^ i11) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    public boolean isPersistent() {
        return this.isPersistent;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.getOutputOptions + ", getCallbackExecutor=" + this.getCallbackExecutor + ", getEventListener=" + this.getEventListener + ", hasAudioEnabled=" + this.hasAudioEnabled + ", isPersistent=" + this.isPersistent + ", getRecordingId=" + this.getRecordingId + com.alipay.sdk.m.u.i.f11099d;
    }
}
