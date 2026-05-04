package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraManagerCompat {

    @GuardedBy("mCameraCharacteristicsMap")
    private final Map<String, CameraCharacteristicsCompat> mCameraCharacteristicsMap = new ArrayMap(4);
    private final CameraManagerCompatImpl mImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        private final Executor mExecutor;
        final CameraManager.AvailabilityCallback mWrappedCallback;
        private final Object mLock = new Object();

        @GuardedBy("mLock")
        private boolean mDisabled = false;

        public AvailabilityCallbackExecutorWrapper(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @RequiresApi(29)
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@NonNull final String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.w
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@NonNull final String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.mWrappedCallback.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CameraManagerCompatImpl {
        @NonNull
        static CameraManagerCompatImpl from(@NonNull Context context, @NonNull Handler handler) {
            int i11 = Build.VERSION.SDK_INT;
            return i11 >= 30 ? new CameraManagerCompatApi30Impl(context) : i11 >= 29 ? new CameraManagerCompatApi29Impl(context) : i11 >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
        }

        @NonNull
        CameraCharacteristics getCameraCharacteristics(@NonNull String str) throws CameraAccessExceptionCompat;

        @NonNull
        String[] getCameraIdList() throws CameraAccessExceptionCompat;

        @NonNull
        CameraManager getCameraManager();

        @NonNull
        Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat;

        @RequiresPermission("android.permission.CAMERA")
        void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
    }

    private CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    @NonNull
    public static CameraManagerCompat from(@NonNull Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    @NonNull
    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(@NonNull String str) throws CameraAccessExceptionCompat {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str), str);
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e11) {
                    throw new CameraAccessExceptionCompat(10002, e11.getMessage(), e11);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    @NonNull
    public String[] getCameraIdList() throws CameraAccessExceptionCompat {
        return this.mImpl.getCameraIdList();
    }

    @NonNull
    public Set<Set<String>> getConcurrentCameraIds() throws CameraAccessExceptionCompat {
        return this.mImpl.getConcurrentCameraIds();
    }

    @RequiresPermission("android.permission.CAMERA")
    public void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    @NonNull
    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    @NonNull
    public static CameraManagerCompat from(@NonNull Context context, @NonNull Handler handler) {
        return new CameraManagerCompat(CameraManagerCompatImpl.from(context, handler));
    }

    @NonNull
    @VisibleForTesting
    public static CameraManagerCompat from(@NonNull CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }
}
