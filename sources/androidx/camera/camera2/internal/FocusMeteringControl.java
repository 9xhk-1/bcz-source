package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
class FocusMeteringControl {
    static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;
    private static final MeteringRectangle[] EMPTY_RECTANGLES = new MeteringRectangle[0];
    private static final String TAG = "FocusMeteringControl";
    private MeteringRectangle[] mAeRects;
    private MeteringRectangle[] mAfRects;
    private ScheduledFuture<?> mAutoCancelHandle;
    private ScheduledFuture<?> mAutoFocusTimeoutHandle;
    private MeteringRectangle[] mAwbRects;
    private final Camera2CameraControlImpl mCameraControl;
    final Executor mExecutor;
    private boolean mIsExternalFlashAeModeEnabled;

    @NonNull
    private final MeteringRegionCorrection mMeteringRegionCorrection;
    CallbackToFutureAdapter.Completer<FocusMeteringResult> mRunningActionCompleter;
    CallbackToFutureAdapter.Completer<Void> mRunningCancelCompleter;
    private final ScheduledExecutorService mScheduler;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForAeMode;
    private volatile boolean mIsActive = false;
    private volatile Rational mPreviewAspectRatio = null;
    private boolean mIsInAfAutoMode = false;

    @NonNull
    Integer mCurrentAfState = 0;
    long mFocusTimeoutCounter = 0;
    boolean mIsAutoFocusCompleted = false;
    boolean mIsFocusSuccessful = false;
    private int mTemplate = 1;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus = null;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel = null;

    public FocusMeteringControl(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mRunningActionCompleter = null;
        this.mRunningCancelCompleter = null;
        this.mIsExternalFlashAeModeEnabled = false;
        this.mSessionListenerForAeMode = null;
        this.mCameraControl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mMeteringRegionCorrection = new MeteringRegionCorrection(quirks);
    }

    public static /* synthetic */ boolean a(FocusMeteringControl focusMeteringControl, int i11, long j11, TotalCaptureResult totalCaptureResult) {
        focusMeteringControl.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i11 || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j11)) {
            return false;
        }
        focusMeteringControl.completeCancelFuture();
        return true;
    }

    public static /* synthetic */ void b(FocusMeteringControl focusMeteringControl, boolean z11, CallbackToFutureAdapter.Completer completer) {
        focusMeteringControl.mCameraControl.removeCaptureResultListener(focusMeteringControl.mSessionListenerForAeMode);
        focusMeteringControl.mIsExternalFlashAeModeEnabled = z11;
        focusMeteringControl.enableExternalFlashAeMode((CallbackToFutureAdapter.Completer<Void>) completer);
    }

    public static /* synthetic */ Object c(final FocusMeteringControl focusMeteringControl, final FocusMeteringAction focusMeteringAction, final long j11, final CallbackToFutureAdapter.Completer completer) {
        focusMeteringControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s2
            @Override // java.lang.Runnable
            public final void run() {
                FocusMeteringControl.this.startFocusAndMeteringInternal(completer, focusMeteringAction, j11);
            }
        });
        return "startFocusAndMetering";
    }

    private void clearAutoFocusTimeoutHandle() {
        ScheduledFuture<?> scheduledFuture = this.mAutoFocusTimeoutHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoFocusTimeoutHandle = null;
        }
    }

    private void completeCancelFuture() {
        CallbackToFutureAdapter.Completer<Void> completer = this.mRunningCancelCompleter;
        if (completer != null) {
            completer.set(null);
            this.mRunningCancelCompleter = null;
        }
    }

    private void disableAutoCancel() {
        ScheduledFuture<?> scheduledFuture = this.mAutoCancelHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoCancelHandle = null;
        }
    }

    private void executeMeteringAction(@NonNull MeteringRectangle[] meteringRectangleArr, @NonNull MeteringRectangle[] meteringRectangleArr2, @NonNull MeteringRectangle[] meteringRectangleArr3, FocusMeteringAction focusMeteringAction, long j11) {
        final long updateSessionConfigSynchronous;
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr2;
        this.mAwbRects = meteringRectangleArr3;
        if (shouldTriggerAF()) {
            this.mIsInAfAutoMode = true;
            this.mIsAutoFocusCompleted = false;
            this.mIsFocusSuccessful = false;
            updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            triggerAf(null, true);
        } else {
            this.mIsInAfAutoMode = false;
            this.mIsAutoFocusCompleted = true;
            this.mIsFocusSuccessful = false;
            updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        }
        this.mCurrentAfState = 0;
        final boolean isAfModeSupported = isAfModeSupported();
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.x2
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return FocusMeteringControl.l(FocusMeteringControl.this, isAfModeSupported, updateSessionConfigSynchronous, totalCaptureResult);
            }
        };
        this.mSessionListenerForFocus = captureResultListener;
        this.mCameraControl.addCaptureResultListener(captureResultListener);
        final long j12 = this.mFocusTimeoutCounter + 1;
        this.mFocusTimeoutCounter = j12;
        Runnable runnable = new Runnable() { // from class: androidx.camera.camera2.internal.y2
            @Override // java.lang.Runnable
            public final void run() {
                r0.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        FocusMeteringControl.k(FocusMeteringControl.this, r2);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.mScheduler;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mAutoFocusTimeoutHandle = scheduledExecutorService.schedule(runnable, j11, timeUnit);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            this.mAutoCancelHandle = this.mScheduler.schedule(new Runnable() { // from class: androidx.camera.camera2.internal.z2
                @Override // java.lang.Runnable
                public final void run() {
                    r0.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l2
                        @Override // java.lang.Runnable
                        public final void run() {
                            FocusMeteringControl.m(FocusMeteringControl.this, r2);
                        }
                    });
                }
            }, focusMeteringAction.getAutoCancelDurationInMillis(), timeUnit);
        }
    }

    public static /* synthetic */ Object f(final FocusMeteringControl focusMeteringControl, final boolean z11, final CallbackToFutureAdapter.Completer completer) {
        focusMeteringControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o2
            @Override // java.lang.Runnable
            public final void run() {
                FocusMeteringControl.b(FocusMeteringControl.this, z11, completer);
            }
        });
        return "enableExternalFlashAeMode";
    }

    private void failActionFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        CallbackToFutureAdapter.Completer<FocusMeteringResult> completer = this.mRunningActionCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException(str));
            this.mRunningActionCompleter = null;
        }
    }

    private void failCancelFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForCancel);
        CallbackToFutureAdapter.Completer<Void> completer = this.mRunningCancelCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException(str));
            this.mRunningCancelCompleter = null;
        }
    }

    private Rational getDefaultAspectRatio() {
        if (this.mPreviewAspectRatio != null) {
            return this.mPreviewAspectRatio;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        return new Rational(cropSensorRegion.width(), cropSensorRegion.height());
    }

    private static PointF getFovAdjustedPoint(@NonNull MeteringPoint meteringPoint, @NonNull Rational rational, @NonNull Rational rational2, int i11, MeteringRegionCorrection meteringRegionCorrection) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i11);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                correctedPoint.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + correctedPoint.y) * (1.0f / doubleValue);
                return correctedPoint;
            }
            float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            correctedPoint.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + correctedPoint.x) * (1.0f / doubleValue2);
        }
        return correctedPoint;
    }

    private static MeteringRectangle getMeteringRect(MeteringPoint meteringPoint, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int size = ((int) (meteringPoint.getSize() * rect.width())) / 2;
        int size2 = ((int) (meteringPoint.getSize() * rect.height())) / 2;
        Rect rect2 = new Rect(width - size, height - size2, width + size, height + size2);
        rect2.left = rangeLimit(rect2.left, rect.right, rect.left);
        rect2.right = rangeLimit(rect2.right, rect.right, rect.left);
        rect2.top = rangeLimit(rect2.top, rect.bottom, rect.top);
        rect2.bottom = rangeLimit(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    @NonNull
    private List<MeteringRectangle> getMeteringRectangles(@NonNull List<MeteringPoint> list, int i11, @NonNull Rational rational, @NonNull Rect rect, int i12) {
        if (list.isEmpty() || i11 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (MeteringPoint meteringPoint : list) {
            if (arrayList.size() == i11) {
                break;
            }
            if (isValid(meteringPoint)) {
                MeteringRectangle meteringRect = getMeteringRect(meteringPoint, getFovAdjustedPoint(meteringPoint, rational2, rational, i12, this.mMeteringRegionCorrection), rect);
                if (meteringRect.getWidth() != 0 && meteringRect.getHeight() != 0) {
                    arrayList.add(meteringRect);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean i(FocusMeteringControl focusMeteringControl, long j11, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        focusMeteringControl.getClass();
        boolean z11 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        Logger.d(TAG, "enableExternalFlashAeMode: isAeModeExternalFlash = " + z11);
        if (z11 != focusMeteringControl.mIsExternalFlashAeModeEnabled || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j11)) {
            return false;
        }
        Logger.d(TAG, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z11);
        if (completer != null) {
            completer.set(null);
        }
        return true;
    }

    private boolean isAfModeSupported() {
        return this.mCameraControl.getSupportedAfMode(1) == 1;
    }

    private static boolean isValid(@NonNull MeteringPoint meteringPoint) {
        return meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f;
    }

    public static /* synthetic */ Object j(final FocusMeteringControl focusMeteringControl, final CallbackToFutureAdapter.Completer completer) {
        focusMeteringControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u2
            @Override // java.lang.Runnable
            public final void run() {
                FocusMeteringControl.this.triggerAePrecapture(completer);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void k(FocusMeteringControl focusMeteringControl, long j11) {
        if (j11 == focusMeteringControl.mFocusTimeoutCounter) {
            focusMeteringControl.mIsFocusSuccessful = false;
            focusMeteringControl.completeActionFuture(false);
        }
    }

    public static /* synthetic */ boolean l(FocusMeteringControl focusMeteringControl, boolean z11, long j11, TotalCaptureResult totalCaptureResult) {
        focusMeteringControl.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (focusMeteringControl.shouldTriggerAF()) {
            if (!z11 || num == null) {
                focusMeteringControl.mIsFocusSuccessful = true;
                focusMeteringControl.mIsAutoFocusCompleted = true;
            } else if (focusMeteringControl.mCurrentAfState.intValue() == 3) {
                if (num.intValue() == 4) {
                    focusMeteringControl.mIsFocusSuccessful = true;
                    focusMeteringControl.mIsAutoFocusCompleted = true;
                } else if (num.intValue() == 5) {
                    focusMeteringControl.mIsFocusSuccessful = false;
                    focusMeteringControl.mIsAutoFocusCompleted = true;
                }
            }
        }
        if (focusMeteringControl.mIsAutoFocusCompleted && Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j11)) {
            focusMeteringControl.completeActionFuture(focusMeteringControl.mIsFocusSuccessful);
            return true;
        }
        if (!focusMeteringControl.mCurrentAfState.equals(num) && num != null) {
            focusMeteringControl.mCurrentAfState = num;
        }
        return false;
    }

    public static /* synthetic */ void m(FocusMeteringControl focusMeteringControl, long j11) {
        if (j11 == focusMeteringControl.mFocusTimeoutCounter) {
            focusMeteringControl.cancelFocusAndMeteringWithoutAsyncResult();
        }
    }

    public static /* synthetic */ Object n(final FocusMeteringControl focusMeteringControl, final CallbackToFutureAdapter.Completer completer) {
        focusMeteringControl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.r2
            @Override // java.lang.Runnable
            public final void run() {
                FocusMeteringControl.this.cancelFocusAndMeteringInternal(completer);
            }
        });
        return "cancelFocusAndMetering";
    }

    private static int rangeLimit(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i13), i12);
    }

    private boolean shouldTriggerAF() {
        return this.mAfRects.length > 0;
    }

    public void addFocusMeteringOptions(@NonNull Camera2ImplConfig.Builder builder) {
        int defaultAfMode = this.mIsInAfAutoMode ? 1 : getDefaultAfMode();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer valueOf = Integer.valueOf(this.mCameraControl.getSupportedAfMode(defaultAfMode));
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, valueOf, optionPriority);
        MeteringRectangle[] meteringRectangleArr = this.mAfRects;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, optionPriority);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.mAeRects;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, optionPriority);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.mAwbRects;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, optionPriority);
        }
    }

    public void cancelAfAeTrigger(boolean z11, boolean z12) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.mTemplate);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z11) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z12) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.addImplementationOptions(builder2.build());
            this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
    }

    public com.google.common.util.concurrent.p1<Void> cancelFocusAndMetering() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.n2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return FocusMeteringControl.n(FocusMeteringControl.this, completer);
            }
        });
    }

    public void cancelFocusAndMeteringInternal(@Nullable CallbackToFutureAdapter.Completer<Void> completer) {
        failCancelFuture("Cancelled by another cancelFocusAndMetering()");
        failActionFuture("Cancelled by cancelFocusAndMetering()");
        this.mRunningCancelCompleter = completer;
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        if (shouldTriggerAF()) {
            cancelAfAeTrigger(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mIsInAfAutoMode = false;
        final long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        if (this.mRunningCancelCompleter != null) {
            final int supportedAfMode = this.mCameraControl.getSupportedAfMode(getDefaultAfMode());
            Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.w2
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    return FocusMeteringControl.a(FocusMeteringControl.this, supportedAfMode, updateSessionConfigSynchronous, totalCaptureResult);
                }
            };
            this.mSessionListenerForCancel = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }

    public void cancelFocusAndMeteringWithoutAsyncResult() {
        cancelFocusAndMeteringInternal(null);
    }

    public void completeActionFuture(boolean z11) {
        clearAutoFocusTimeoutHandle();
        CallbackToFutureAdapter.Completer<FocusMeteringResult> completer = this.mRunningActionCompleter;
        if (completer != null) {
            completer.set(FocusMeteringResult.create(z11));
            this.mRunningActionCompleter = null;
        }
    }

    public com.google.common.util.concurrent.p1<Void> enableExternalFlashAeMode(final boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            Log.d(TAG, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i11);
            return Futures.immediateFuture(null);
        }
        if (this.mCameraControl.getSupportedAeMode(5) != 5) {
            Log.d(TAG, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return Futures.immediateFuture(null);
        }
        Log.d(TAG, "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.m2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return FocusMeteringControl.f(FocusMeteringControl.this, z11, completer);
            }
        });
    }

    @VisibleForTesting
    public int getDefaultAfMode() {
        return this.mTemplate != 3 ? 4 : 3;
    }

    public boolean isExternalFlashAeModeEnabled() {
        return this.mIsExternalFlashAeModeEnabled;
    }

    public boolean isFocusMeteringSupported(@NonNull FocusMeteringAction focusMeteringAction) {
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        return (getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4).isEmpty()) ? false : true;
    }

    public void setActive(boolean z11) {
        if (z11 == this.mIsActive) {
            return;
        }
        this.mIsActive = z11;
        if (this.mIsActive) {
            return;
        }
        cancelFocusAndMeteringWithoutAsyncResult();
    }

    public void setPreviewAspectRatio(@Nullable Rational rational) {
        this.mPreviewAspectRatio = rational;
    }

    public void setTemplate(int i11) {
        this.mTemplate = i11;
    }

    @NonNull
    public com.google.common.util.concurrent.p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return startFocusAndMetering(focusMeteringAction, 5000L);
    }

    public void startFocusAndMeteringInternal(@NonNull CallbackToFutureAdapter.Completer<FocusMeteringResult> completer, @NonNull FocusMeteringAction focusMeteringAction, long j11) {
        if (!this.mIsActive) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        List<MeteringRectangle> meteringRectangles = getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1);
        List<MeteringRectangle> meteringRectangles2 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2);
        List<MeteringRectangle> meteringRectangles3 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4);
        if (meteringRectangles.isEmpty() && meteringRectangles2.isEmpty() && meteringRectangles3.isEmpty()) {
            completer.setException(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        failActionFuture("Cancelled by another startFocusAndMetering()");
        failCancelFuture("Cancelled by another startFocusAndMetering()");
        disableAutoCancel();
        this.mRunningActionCompleter = completer;
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        executeMeteringAction((MeteringRectangle[]) meteringRectangles.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles2.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles3.toArray(meteringRectangleArr), focusMeteringAction, j11);
    }

    public com.google.common.util.concurrent.p1<Void> triggerAePrecapture() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.v2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return FocusMeteringControl.j(FocusMeteringControl.this, completer);
            }
        });
    }

    public void triggerAf(@Nullable final CallbackToFutureAdapter.Completer<CameraCaptureResult> completer, boolean z11) {
        if (!this.mIsActive) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z11) {
            builder2.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mCameraControl.getSupportedAeMode(1)), Config.OptionPriority.HIGH_PRIORITY_REQUIRED);
        }
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i11) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.setException(new CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.set(cameraCaptureResult);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.setException(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
    }

    @NonNull
    @VisibleForTesting
    public com.google.common.util.concurrent.p1<FocusMeteringResult> startFocusAndMetering(@NonNull final FocusMeteringAction focusMeteringAction, final long j11) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.t2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return FocusMeteringControl.c(FocusMeteringControl.this, focusMeteringAction, j11, completer);
            }
        });
    }

    public void triggerAePrecapture(@Nullable final CallbackToFutureAdapter.Completer<Void> completer) {
        Logger.d(TAG, "triggerAePrecapture");
        if (!this.mIsActive) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.2
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i11) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.setException(new CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
                if (completer != null) {
                    Logger.d(FocusMeteringControl.TAG, "triggerAePrecapture: triggering capture request completed");
                    completer.set(null);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                if (completer2 != null) {
                    completer2.setException(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
    }

    @RequiresApi(28)
    private void enableExternalFlashAeMode(@Nullable final CallbackToFutureAdapter.Completer<Void> completer) {
        if (!this.mIsActive) {
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            final long updateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.p2
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    return FocusMeteringControl.i(FocusMeteringControl.this, updateSessionConfigSynchronous, completer, totalCaptureResult);
                }
            };
            this.mSessionListenerForAeMode = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }
}
