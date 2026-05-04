package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.Quirks;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class TemplateParamsOverride {
    private final boolean mWorkaroundByCaptureIntentPreview;
    private final boolean mWorkaroundByCaptureIntentStillCapture;

    public TemplateParamsOverride(@NonNull Quirks quirks) {
        this.mWorkaroundByCaptureIntentPreview = CaptureIntentPreviewQuirk.workaroundByCaptureIntentPreview(quirks);
        this.mWorkaroundByCaptureIntentStillCapture = quirks.contains(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @NonNull
    public Map<CaptureRequest.Key<?>, Object> getOverrideParams(int i11) {
        if (i11 == 3 && this.mWorkaroundByCaptureIntentPreview) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(hashMap);
        }
        if (i11 != 4 || !this.mWorkaroundByCaptureIntentStillCapture) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(hashMap2);
    }
}
