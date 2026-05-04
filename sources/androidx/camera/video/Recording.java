package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsClosed;
    private final boolean mIsPersistent;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    public Recording(@NonNull Recorder recorder, long j11, @NonNull OutputOptions outputOptions, boolean z11, boolean z12) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsClosed = atomicBoolean;
        CloseGuardHelper create = CloseGuardHelper.create();
        this.mCloseGuard = create;
        this.mRecorder = recorder;
        this.mRecordingId = j11;
        this.mOutputOptions = outputOptions;
        this.mIsPersistent = z11;
        if (z12) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    @NonNull
    public static Recording createFinalizedFrom(@NonNull PendingRecording pendingRecording, long j11) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j11, pendingRecording.getOutputOptions(), pendingRecording.isPersistent(), true);
    }

    @NonNull
    public static Recording from(@NonNull PendingRecording pendingRecording, long j11) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j11, pendingRecording.getOutputOptions(), pendingRecording.isPersistent(), false);
    }

    private void stopWithError(int i11, @Nullable Throwable th2) {
        this.mCloseGuard.close();
        if (this.mIsClosed.getAndSet(true)) {
            return;
        }
        this.mRecorder.stop(this, i11, th2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        stopWithError(0, null);
    }

    public void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stopWithError(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    @NonNull
    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public long getRecordingId() {
        return this.mRecordingId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isClosed() {
        return this.mIsClosed.get();
    }

    @ExperimentalPersistentRecording
    public boolean isPersistent() {
        return this.mIsPersistent;
    }

    public void mute(boolean z11) {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.mute(this, z11);
    }

    public void pause() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.pause(this);
    }

    public void resume() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.resume(this);
    }

    public void stop() {
        close();
    }
}
