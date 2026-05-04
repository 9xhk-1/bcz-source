package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.InitializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface UseCaseConfigFactory {
    public static final UseCaseConfigFactory EMPTY_INSTANCE = new UseCaseConfigFactory() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        @Nullable
        public Config getConfig(@NonNull CaptureType captureType, int i11) {
            return null;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Provider {
        @NonNull
        UseCaseConfigFactory newInstance(@NonNull Context context) throws InitializationException;
    }

    @Nullable
    Config getConfig(@NonNull CaptureType captureType, int i11);
}
