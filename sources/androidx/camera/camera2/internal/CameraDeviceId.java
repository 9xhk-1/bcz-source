package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
abstract class CameraDeviceId {
    @NonNull
    public static CameraDeviceId create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        return new AutoValue_CameraDeviceId(str.toLowerCase(), str2.toLowerCase(), str3.toLowerCase(), str4.toLowerCase());
    }

    @NonNull
    public abstract String getBrand();

    @NonNull
    public abstract String getCameraId();

    @NonNull
    public abstract String getDevice();

    @NonNull
    public abstract String getModel();
}
