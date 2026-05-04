package androidx.camera.core.impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraCaptureMetaData {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AeMode {
        UNKNOWN,
        OFF,
        ON,
        ON_AUTO_FLASH,
        ON_ALWAYS_FLASH,
        ON_AUTO_FLASH_REDEYE,
        ON_EXTERNAL_FLASH
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AeState {
        UNKNOWN,
        INACTIVE,
        SEARCHING,
        FLASH_REQUIRED,
        CONVERGED,
        LOCKED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AfMode {
        UNKNOWN,
        OFF,
        ON_MANUAL_AUTO,
        ON_CONTINUOUS_AUTO
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AfState {
        UNKNOWN,
        INACTIVE,
        SCANNING,
        PASSIVE_FOCUSED,
        PASSIVE_NOT_FOCUSED,
        LOCKED_FOCUSED,
        LOCKED_NOT_FOCUSED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AwbMode {
        UNKNOWN,
        OFF,
        AUTO,
        INCANDESCENT,
        FLUORESCENT,
        WARM_FLUORESCENT,
        DAYLIGHT,
        CLOUDY_DAYLIGHT,
        TWILIGHT,
        SHADE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AwbState {
        UNKNOWN,
        INACTIVE,
        METERING,
        CONVERGED,
        LOCKED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum FlashState {
        UNKNOWN,
        NONE,
        READY,
        FIRED
    }

    private CameraCaptureMetaData() {
    }
}
