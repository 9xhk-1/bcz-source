package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExposureControl {
    private static final int DEFAULT_EXPOSURE_COMPENSATION = 0;

    @NonNull
    private final Camera2CameraControlImpl mCameraControl;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final ExposureStateImpl mExposureStateImpl;
    private boolean mIsActive = false;

    @Nullable
    private Camera2CameraControlImpl.CaptureResultListener mRunningCaptureResultListener;

    @Nullable
    private CallbackToFutureAdapter.Completer<Integer> mRunningCompleter;

    public ExposureControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Executor executor) {
        this.mCameraControl = camera2CameraControlImpl;
        this.mExposureStateImpl = new ExposureStateImpl(cameraCharacteristicsCompat, 0);
        this.mExecutor = executor;
    }

    public static /* synthetic */ void a(ExposureControl exposureControl, final CallbackToFutureAdapter.Completer completer, final int i11) {
        if (!exposureControl.mIsActive) {
            exposureControl.mExposureStateImpl.setExposureCompensationIndex(0);
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        exposureControl.clearRunningTask();
        Preconditions.checkState(exposureControl.mRunningCompleter == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
        Preconditions.checkState(exposureControl.mRunningCaptureResultListener == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.i2
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return ExposureControl.c(i11, completer, totalCaptureResult);
            }
        };
        exposureControl.mRunningCaptureResultListener = captureResultListener;
        exposureControl.mRunningCompleter = completer;
        exposureControl.mCameraControl.addCaptureResultListener(captureResultListener);
        exposureControl.mCameraControl.updateSessionConfigSynchronous();
    }

    public static /* synthetic */ Object b(final ExposureControl exposureControl, final int i11, final CallbackToFutureAdapter.Completer completer) {
        exposureControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.j2
            @Override // java.lang.Runnable
            public final void run() {
                ExposureControl.a(ExposureControl.this, completer, i11);
            }
        });
        return "setExposureCompensationIndex[" + i11 + "]";
    }

    public static /* synthetic */ boolean c(int i11, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i11) {
                return false;
            }
            completer.set(Integer.valueOf(i11));
            return true;
        }
        int intValue = num.intValue();
        if ((intValue != 2 && intValue != 3 && intValue != 4) || num2.intValue() != i11) {
            return false;
        }
        completer.set(Integer.valueOf(i11));
        return true;
    }

    private void clearRunningTask() {
        CallbackToFutureAdapter.Completer<Integer> completer = this.mRunningCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.mRunningCompleter = null;
        }
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = this.mRunningCaptureResultListener;
        if (captureResultListener != null) {
            this.mCameraControl.removeCaptureResultListener(captureResultListener);
            this.mRunningCaptureResultListener = null;
        }
    }

    public static ExposureState getDefaultExposureState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return new ExposureStateImpl(cameraCharacteristicsCompat, 0);
    }

    @NonNull
    public ExposureState getExposureState() {
        return this.mExposureStateImpl;
    }

    public void setActive(boolean z11) {
        if (z11 == this.mIsActive) {
            return;
        }
        this.mIsActive = z11;
        if (z11) {
            return;
        }
        this.mExposureStateImpl.setExposureCompensationIndex(0);
        clearRunningTask();
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void setCaptureRequestOption(@NonNull Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.mExposureStateImpl.getExposureCompensationIndex()), Config.OptionPriority.REQUIRED);
    }

    @NonNull
    public com.google.common.util.concurrent.p1<Integer> setExposureCompensationIndex(final int i11) {
        if (!this.mExposureStateImpl.isExposureCompensationSupported()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> exposureCompensationRange = this.mExposureStateImpl.getExposureCompensationRange();
        if (exposureCompensationRange.contains((Range<Integer>) Integer.valueOf(i11))) {
            this.mExposureStateImpl.setExposureCompensationIndex(i11);
            return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.k2
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return ExposureControl.b(ExposureControl.this, i11, completer);
                }
            }));
        }
        return Futures.immediateFailedFuture(new IllegalArgumentException("Requested ExposureCompensation " + i11 + " is not within valid range [" + exposureCompensationRange.getUpper() + zr.m.f102856e + exposureCompensationRange.getLower() + "]"));
    }
}
