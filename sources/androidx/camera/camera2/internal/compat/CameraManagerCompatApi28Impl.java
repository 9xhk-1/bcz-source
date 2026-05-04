package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes.dex */
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    public CameraManagerCompatApi28Impl(@NonNull Context context) {
        super(context, null);
    }

    public static CameraManagerCompatApi28Impl create(@NonNull Context context) {
        return new CameraManagerCompatApi28Impl(context);
    }

    private boolean isDndFailCase(@NonNull Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && isDndRuntimeException(th2);
    }

    private static boolean isDndRuntimeException(@NonNull Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void throwDndException(@NonNull Throwable th2) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @NonNull
    public CameraCharacteristics getCameraCharacteristics(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e11) {
            if (isDndFailCase(e11)) {
                throwDndException(e11);
            }
            throw e11;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e11);
        } catch (IllegalArgumentException e12) {
        } catch (SecurityException e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (isDndFailCase(e14)) {
                throwDndException(e14);
            }
            throw e14;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallback);
    }
}
