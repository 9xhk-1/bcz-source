package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes.dex */
class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    public CameraManagerCompatApi30Impl(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @NonNull
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        try {
            return this.mCameraManager.getConcurrentCameraIds();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        }
    }
}
