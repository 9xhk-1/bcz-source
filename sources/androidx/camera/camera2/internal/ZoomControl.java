package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.FloatRange;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final String TAG = "ZoomControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;

    @GuardedBy("mCurrentZoomState")
    private final ZoomStateImpl mCurrentZoomState;
    private final Executor mExecutor;

    @NonNull
    final ZoomImpl mZoomImpl;
    private final MutableLiveData<ZoomState> mZoomStateLiveData;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ZoomImpl {
        void addRequestOption(@NonNull Camera2ImplConfig.Builder builder);

        @NonNull
        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f11, @NonNull CallbackToFutureAdapter.Completer<Void> completer);
    }

    public ZoomControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = createZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new MutableLiveData<>(ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    public static /* synthetic */ Object c(final ZoomControl zoomControl, final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) {
        zoomControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z3
            @Override // java.lang.Runnable
            public final void run() {
                ZoomControl.this.submitCameraZoomRatio(completer, zoomState);
            }
        });
        return "setLinearZoom";
    }

    private static ZoomImpl createZoomImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAndroidRZoomSupported(cameraCharacteristicsCompat) ? new AndroidRZoomImpl(cameraCharacteristicsCompat) : new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    public static /* synthetic */ Object d(final ZoomControl zoomControl, final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) {
        zoomControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.y3
            @Override // java.lang.Runnable
            public final void run() {
                ZoomControl.this.submitCameraZoomRatio(completer, zoomState);
            }
        });
        return "setZoomRatio";
    }

    public static ZoomState getDefaultZoomState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return ImmutableZoomState.create(zoomStateImpl);
    }

    @RequiresApi(30)
    private static Range<Float> getZoomRatioRange(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) cameraCharacteristicsCompat.get(key);
        } catch (AssertionError e11) {
            Logger.w(TAG, "AssertionError, fail to get camera characteristic.", e11);
            return null;
        }
    }

    @VisibleForTesting
    public static boolean isAndroidRZoomSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.VERSION.SDK_INT >= 30 && getZoomRatioRange(cameraCharacteristicsCompat) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void submitCameraZoomRatio(@NonNull CallbackToFutureAdapter.Completer<Void> completer, @NonNull ZoomState zoomState) {
        ZoomState create;
        if (this.mIsActive) {
            this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), completer);
            this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    private void updateLiveData(ZoomState zoomState) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    public void addZoomOption(@NonNull Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    @NonNull
    public Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    public LiveData<ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }

    public void setActive(boolean z11) {
        ZoomState create;
        if (this.mIsActive == z11) {
            return;
        }
        this.mIsActive = z11;
        if (z11) {
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        this.mZoomImpl.resetZoom();
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    @NonNull
    public com.google.common.util.concurrent.p1<Void> setLinearZoom(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        final ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f11);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e11) {
                return Futures.immediateFailedFuture(e11);
            }
        }
        updateLiveData(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.a4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ZoomControl.c(ZoomControl.this, create, completer);
            }
        });
    }

    @NonNull
    public com.google.common.util.concurrent.p1<Void> setZoomRatio(float f11) {
        final ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f11);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e11) {
                return Futures.immediateFailedFuture(e11);
            }
        }
        updateLiveData(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.x3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ZoomControl.d(ZoomControl.this, create, completer);
            }
        });
    }
}
