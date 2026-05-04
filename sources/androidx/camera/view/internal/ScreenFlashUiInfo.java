package androidx.camera.view.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCapture;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ScreenFlashUiInfo {

    @NonNull
    private final ProviderType mProviderType;

    @Nullable
    private final ImageCapture.ScreenFlash mScreenFlash;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ProviderType {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public ScreenFlashUiInfo(@NonNull ProviderType providerType, @Nullable ImageCapture.ScreenFlash screenFlash) {
        this.mProviderType = providerType;
        this.mScreenFlash = screenFlash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenFlashUiInfo)) {
            return false;
        }
        ScreenFlashUiInfo screenFlashUiInfo = (ScreenFlashUiInfo) obj;
        return this.mProviderType == screenFlashUiInfo.mProviderType && Objects.equals(this.mScreenFlash, screenFlashUiInfo.mScreenFlash);
    }

    @NonNull
    public ProviderType getProviderType() {
        return this.mProviderType;
    }

    @Nullable
    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    public int hashCode() {
        return Objects.hash(this.mProviderType, this.mScreenFlash);
    }
}
