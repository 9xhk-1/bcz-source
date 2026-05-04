package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface AudioStream {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(@NonNull String str) {
            super(str);
        }

        public AudioStreamException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }

        public AudioStreamException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class PacketInfo {
        @NonNull
        public static PacketInfo of(int i11, long j11) {
            return new AutoValue_AudioStream_PacketInfo(i11, j11);
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    @NonNull
    PacketInfo read(@NonNull ByteBuffer byteBuffer);

    void release();

    void setCallback(@Nullable AudioStreamCallback audioStreamCallback, @Nullable Executor executor);

    void start() throws AudioStreamException, IllegalStateException;

    void stop() throws IllegalStateException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AudioStreamCallback {
        default void onSilenceStateChanged(boolean z11) {
        }
    }
}
