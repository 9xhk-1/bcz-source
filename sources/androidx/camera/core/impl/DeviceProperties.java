package androidx.camera.core.impl;

import android.os.Build;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@eo.c
/* loaded from: classes.dex */
public abstract class DeviceProperties {
    @NonNull
    public static DeviceProperties create() {
        return create(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    @NonNull
    public abstract String manufacturer();

    @NonNull
    public abstract String model();

    public abstract int sdkVersion();

    @NonNull
    public static DeviceProperties create(@NonNull String str, @NonNull String str2, int i11) {
        return new AutoValue_DeviceProperties(str, str2, i11);
    }
}
