package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface EncoderCallback {
    public static final EncoderCallback EMPTY = new EncoderCallback() { // from class: androidx.camera.video.internal.encoder.EncoderCallback.1
        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStart() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeStop() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodeError(@NonNull EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onEncodedData(@NonNull EncodedData encodedData) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public void onOutputConfigUpdate(@NonNull OutputConfig outputConfig) {
        }
    };

    void onEncodeError(@NonNull EncodeException encodeException);

    void onEncodeStart();

    void onEncodeStop();

    void onEncodedData(@NonNull EncodedData encodedData);

    void onOutputConfigUpdate(@NonNull OutputConfig outputConfig);

    default void onEncodePaused() {
    }
}
