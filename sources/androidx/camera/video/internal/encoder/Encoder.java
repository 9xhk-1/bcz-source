package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.BufferProvider;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface EncoderInput {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SurfaceInput extends EncoderInput {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(@NonNull Surface surface);
        }

        void setOnSurfaceUpdateListener(@NonNull Executor executor, @NonNull OnSurfaceUpdateListener onSurfaceUpdateListener);
    }

    int getConfiguredBitrate();

    @NonNull
    EncoderInfo getEncoderInfo();

    @NonNull
    EncoderInput getInput();

    @NonNull
    p1<Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor);

    void start();

    void stop();

    void stop(long j11);
}
