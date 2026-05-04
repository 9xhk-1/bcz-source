package androidx.camera.extensions;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraExtensionsInfo {
    @Nullable
    default LiveData<Integer> getCurrentExtensionMode() {
        return null;
    }

    @Nullable
    default LiveData<Integer> getExtensionStrength() {
        return null;
    }

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    default boolean isExtensionStrengthAvailable() {
        return false;
    }
}
