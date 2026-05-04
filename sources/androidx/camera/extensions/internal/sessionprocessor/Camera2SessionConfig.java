package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
interface Camera2SessionConfig {
    @NonNull
    List<Camera2OutputConfig> getOutputConfigs();

    @NonNull
    Map<CaptureRequest.Key<?>, Object> getSessionParameters();

    int getSessionTemplateId();

    default int getSessionType() {
        return 0;
    }
}
