package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
public class Camera2CameraControlImpl implements CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final String TAG = "Camera2CameraControlImp";
    static final String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final AeFpsRange mAeFpsRange;
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final Camera2CapturePipeline mCamera2CapturePipeline;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;

    @NonNull
    private volatile com.google.common.util.concurrent.p1<Void> mFlashModeChangeSessionUpdateFuture;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final Object mLock;
    private final AtomicLong mNextSessionUpdateId;
    private ImageCapture.ScreenFlash mScreenFlash;

    @VisibleForTesting
    final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;

    @GuardedBy("mLock")
    private int mUseCount;
    private final VideoUsageControl mVideoUsageControl;
    private final ZoomControl mZoomControl;

    @VisibleForTesting
    ZslControl mZslControl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        Set<CameraCaptureCallback> mCallbacks = new HashSet();
        Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();

        public void addCaptureCallback(@NonNull Executor executor, @NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(final int i11) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraCaptureCallback.this.onCaptureCancelled(i11);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(final int i11, @NonNull final CameraCaptureResult cameraCaptureResult) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraCaptureCallback.this.onCaptureCompleted(i11, cameraCaptureResult);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e11);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final int i11, @NonNull final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraCaptureCallback.this.onCaptureFailed(i11, cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e11);
                }
            }
        }

        public void removeCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(@NonNull Executor executor) {
            this.mExecutor = executor;
        }

        public static /* synthetic */ void a(CameraControlSessionCallback cameraControlSessionCallback, TotalCaptureResult totalCaptureResult) {
            cameraControlSessionCallback.getClass();
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : cameraControlSessionCallback.mResultListeners) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            cameraControlSessionCallback.mResultListeners.removeAll(hashSet);
        }

        public void addListener(@NonNull CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraControlImpl.CameraControlSessionCallback.a(Camera2CameraControlImpl.CameraControlSessionCallback.this, totalCaptureResult);
                }
            });
        }

        public void removeListener(@NonNull CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CaptureResultListener {
        boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);
    }

    @VisibleForTesting
    public Camera2CameraControlImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new Quirks(new ArrayList()));
    }

    public static /* synthetic */ Object f(Camera2CameraControlImpl camera2CameraControlImpl, final long j11, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.getClass();
        camera2CameraControlImpl.addCaptureResultListener(new CaptureResultListener() { // from class: androidx.camera.camera2.internal.c
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.j(j11, completer, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j11;
    }

    public static /* synthetic */ Object g(final Camera2CameraControlImpl camera2CameraControlImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraControlImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                Futures.propagate(r0.waitForSessionUpdateId(Camera2CameraControlImpl.this.updateSessionConfigSynchronous()), completer);
            }
        });
        return "updateSessionConfigAsync";
    }

    private int getSupportedAwbMode(int i11) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i11, iArr) ? i11 : isModeInList(1, iArr) ? 1 : 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private static boolean isModeInList(int i11, int[] iArr) {
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSessionUpdated(@NonNull TotalCaptureResult totalCaptureResult, long j11) {
        Long l11;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof TagBundle) && (l11 = (Long) ((TagBundle) tag).getTag(TAG_SESSION_UPDATE_ID)) != null && l11.longValue() >= j11;
    }

    public static /* synthetic */ boolean j(long j11, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        if (!isSessionUpdated(totalCaptureResult, j11)) {
            return false;
        }
        completer.set(null);
        return true;
    }

    @NonNull
    private com.google.common.util.concurrent.p1<Void> waitForSessionUpdateId(final long j11) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.f(Camera2CameraControlImpl.this, j11, completer);
            }
        });
    }

    public void addCaptureResultListener(@NonNull CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(@NonNull Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.h
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.a();
            }
        }, CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(@NonNull final Executor executor, @NonNull final CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(@NonNull SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<Void> cancelFocusAndMetering() {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.b();
            }
        }, CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i11 = this.mUseCount;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.mUseCount = i11 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mVideoUsageControl.decrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<Void> enableTorch(boolean z11) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z11));
    }

    public void enableTorchInternal(boolean z11) {
        this.mIsTorchOn = z11;
        if (!z11) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    @NonNull
    public Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.p1<CameraCapturePipeline> getCameraCapturePipelineAsync(final int i11, final int i12) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.i
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 immediateFuture;
                    immediateFuture = Futures.immediateFuture(Camera2CameraControlImpl.this.mCamera2CapturePipeline.getCameraCapturePipeline(i11, flashMode, i12));
                    return immediateFuture;
                }
            }, this.mExecutor);
        }
        Logger.w(TAG, "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    @NonNull
    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    @VisibleForTesting
    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    @NonNull
    public ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mFlashMode;
    }

    @NonNull
    public FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Nullable
    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) Preconditions.checkNotNull(rect);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    @VisibleForTesting
    public Config getSessionOptions() {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, 1, optionPriority);
        this.mFocusMeteringControl.addFocusMeteringOptions(builder);
        this.mAeFpsRange.addAeFpsRangeOptions(builder);
        this.mZoomControl.addZoomOption(builder);
        int i11 = this.mFocusMeteringControl.isExternalFlashAeModeEnabled() ? 5 : 1;
        if (this.mIsTorchOn) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.FLASH_MODE, 2, optionPriority);
        } else {
            int i12 = this.mFlashMode;
            if (i12 == 0) {
                i11 = this.mAutoFlashAEModeDisabler.getCorrectedAeMode(2);
            } else if (i12 == 1) {
                i11 = 3;
            } else if (i12 == 2) {
                i11 = 1;
            }
        }
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(i11)), optionPriority);
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(getSupportedAwbMode(1)), optionPriority);
        this.mExposureControl.setCaptureRequestOption(builder);
        this.mCamera2CameraControl.applyOptionsToBuilder(builder);
        return builder.build();
    }

    public int getSupportedAeMode(int i11) {
        return getSupportedAeMode(this.mCameraCharacteristics, i11);
    }

    public int getSupportedAfMode(int i11) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i11, iArr)) {
            return i11;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    @NonNull
    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    @VisibleForTesting
    public int getUseCount() {
        int i11;
        synchronized (this.mLock) {
            i11 = this.mUseCount;
        }
        return i11;
    }

    @NonNull
    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    @NonNull
    public ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mVideoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        int usage = this.mVideoUsageControl.getUsage();
        Logger.d(TAG, "isInVideoUsage: mVideoUsageControl value = " + usage);
        return usage > 0;
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mZslControl.isZslDisabledByUserCaseConfig();
    }

    public void removeCaptureResultListener(@NonNull CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(@NonNull final CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
            }
        });
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z11) {
        Logger.d(TAG, "setActive: isActive = " + z11);
        this.mFocusMeteringControl.setActive(z11);
        this.mZoomControl.setActive(z11);
        this.mTorchControl.setActive(z11);
        this.mExposureControl.setActive(z11);
        this.mCamera2CameraControl.setActive(z11);
        if (z11) {
            return;
        }
        this.mScreenFlash = null;
        this.mVideoUsageControl.resetDirectly();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<Integer> setExposureCompensationIndex(int i11) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : this.mExposureControl.setExposureCompensationIndex(i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i11) {
        if (!isControlInUse()) {
            Logger.w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i11;
        Logger.d(TAG, "setFlashMode: mFlashMode = " + this.mFlashMode);
        ZslControl zslControl = this.mZslControl;
        boolean z11 = true;
        if (this.mFlashMode != 1 && this.mFlashMode != 0) {
            z11 = false;
        }
        zslControl.setZslDisabledByFlashMode(z11);
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<Void> setLinearZoom(float f11) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f11));
    }

    public void setPreviewAspectRatio(@Nullable Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(@Nullable ImageCapture.ScreenFlash screenFlash) {
        this.mScreenFlash = screenFlash;
    }

    public void setTemplate(int i11) {
        this.mTemplate = i11;
        this.mFocusMeteringControl.setTemplate(i11);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<Void> setZoomRatio(float f11) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f11));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z11) {
        this.mZslControl.setZslDisabledByUserCaseConfig(z11);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.p1<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.p1<List<Void>> submitStillCaptureRequests(@NonNull final List<CaptureConfig> list, final int i11, final int i12) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.f
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 submitStillCaptures;
                    submitStillCaptures = Camera2CameraControlImpl.this.mCamera2CapturePipeline.submitStillCaptures(list, i11, flashMode, i12);
                    return submitStillCaptures;
                }
            }, this.mExecutor);
        }
        Logger.w(TAG, "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.updateSessionConfigSynchronous();
            }
        });
    }

    @NonNull
    public com.google.common.util.concurrent.p1<Void> updateSessionConfigAsync() {
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.l
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraControlImpl.g(Camera2CameraControlImpl.this, completer);
            }
        }));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    public Camera2CameraControlImpl(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Executor executor, @NonNull CameraControlInternal.ControlUpdateCallback controlUpdateCallback, @NonNull Quirks quirks) {
        this.mLock = new Object();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mNextSessionUpdateId = new AtomicLong(0L);
        this.mFlashModeChangeSessionUpdateFuture = Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0L;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        this.mVideoUsageControl = new VideoUsageControl(executor);
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mZslControl = new ZslControlImpl(cameraCharacteristicsCompat);
        this.mAeFpsRange = new AeFpsRange(quirks);
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor, scheduledExecutorService);
    }

    public static int getSupportedAeMode(@NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, int i11) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i11, iArr) ? i11 : isModeInList(1, iArr) ? 1 : 0;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }
}
