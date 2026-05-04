package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    @NonNull
    public static CameraUnavailableException createFrom(@NonNull CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i11 = 1;
        if (reason != 1) {
            i11 = 2;
            if (reason != 2) {
                i11 = 3;
                if (reason != 3) {
                    i11 = 4;
                    if (reason != 4) {
                        i11 = 5;
                        if (reason != 5) {
                            i11 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i11, cameraAccessExceptionCompat);
    }
}
