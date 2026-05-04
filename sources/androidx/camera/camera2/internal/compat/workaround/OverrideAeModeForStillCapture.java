package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class OverrideAeModeForStillCapture {
    private boolean mAePrecaptureStarted = false;
    private final boolean mHasAutoFlashUnderExposedQuirk;

    public OverrideAeModeForStillCapture(@NonNull Quirks quirks) {
        this.mHasAutoFlashUnderExposedQuirk = quirks.get(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void onAePrecaptureFinished() {
        this.mAePrecaptureStarted = false;
    }

    public void onAePrecaptureStarted() {
        this.mAePrecaptureStarted = true;
    }

    public boolean shouldSetAeModeAlwaysFlash(int i11) {
        return this.mAePrecaptureStarted && i11 == 0 && this.mHasAutoFlashUnderExposedQuirk;
    }
}
