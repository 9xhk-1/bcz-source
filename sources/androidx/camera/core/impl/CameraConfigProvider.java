package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new CameraConfigProvider() { // from class: androidx.camera.core.impl.a
        @Override // androidx.camera.core.impl.CameraConfigProvider
        public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
            return CameraConfigProvider.a(cameraInfo, context);
        }
    };

    static /* synthetic */ CameraConfig a(CameraInfo cameraInfo, Context context) {
        return null;
    }

    @Nullable
    CameraConfig getConfig(@NonNull CameraInfo cameraInfo, @NonNull Context context);
}
