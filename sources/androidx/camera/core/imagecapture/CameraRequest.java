package androidx.camera.core.imagecapture;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraRequest {
    private final TakePictureCallback mCallback;
    private final List<CaptureConfig> mCaptureConfigs;

    public CameraRequest(@NonNull List<CaptureConfig> list, @NonNull TakePictureCallback takePictureCallback) {
        this.mCaptureConfigs = list;
        this.mCallback = takePictureCallback;
    }

    @NonNull
    public List<CaptureConfig> getCaptureConfigs() {
        return this.mCaptureConfigs;
    }

    public boolean isAborted() {
        return this.mCallback.isAborted();
    }
}
