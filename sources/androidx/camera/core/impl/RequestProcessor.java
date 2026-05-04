package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface RequestProcessor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Request {
        @NonNull
        Config getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(@NonNull Request request, @NonNull Callback callback);

    void stopRepeating();

    int submit(@NonNull Request request, @NonNull Callback callback);

    int submit(@NonNull List<Request> list, @NonNull Callback callback);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureCompleted(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(@NonNull Request request, @NonNull CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceCompleted(int i11, long j11) {
        }

        default void onCaptureBufferLost(@NonNull Request request, long j11, int i11) {
        }

        default void onCaptureStarted(@NonNull Request request, long j11, long j12) {
        }
    }
}
