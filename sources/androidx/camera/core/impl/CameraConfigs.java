package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CameraConfigs {
    private static final CameraConfig DEFAULT_CAMERA_CONFIG = new DefaultCameraConfig();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultCameraConfig implements CameraConfig {
        private final Identifier mIdentifier = Identifier.create(new Object());

        @Override // androidx.camera.core.impl.CameraConfig
        @NonNull
        public Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        @NonNull
        public Config getConfig() {
            return OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }

    @NonNull
    public static CameraConfig defaultConfig() {
        return DEFAULT_CAMERA_CONFIG;
    }
}
