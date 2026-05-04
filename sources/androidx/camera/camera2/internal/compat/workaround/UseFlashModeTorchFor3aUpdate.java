package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class UseFlashModeTorchFor3aUpdate {
    private static final String TAG = "UseFlashModeTorchFor3aUpdate";

    @Nullable
    private final TorchFlashRequiredFor3aUpdateQuirk mTorchFlashRequiredFor3AUpdateQuirk;

    public UseFlashModeTorchFor3aUpdate(@NonNull Quirks quirks) {
        this.mTorchFlashRequiredFor3AUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) quirks.get(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean shouldUseFlashModeTorch() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.mTorchFlashRequiredFor3AUpdateQuirk;
        boolean z11 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.isFlashModeTorchRequired();
        Logger.d(TAG, "shouldUseFlashModeTorch: " + z11);
        return z11;
    }
}
