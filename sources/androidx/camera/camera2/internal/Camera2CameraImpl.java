package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class Camera2CameraImpl implements CameraInternal {
    private static final int ERROR_NONE = 0;
    private static final String TAG = "Camera2CameraImpl";

    @NonNull
    final CameraAvailability mCameraAvailability;

    @NonNull
    private final CameraCharacteristicsCompat mCameraCharacteristicsCompat;

    @NonNull
    private CameraConfig mCameraConfig;

    @NonNull
    final CameraConfigureAvailable mCameraConfigureAvailable;
    private final Camera2CameraControlImpl mCameraControlInternal;

    @NonNull
    final CameraCoordinator mCameraCoordinator;

    @Nullable
    CameraDevice mCameraDevice;
    int mCameraDeviceError;

    @NonNull
    final Camera2CameraInfoImpl mCameraInfoInternal;
    private final CameraManagerCompat mCameraManager;
    private final CameraStateMachine mCameraStateMachine;

    @NonNull
    final CameraStateRegistry mCameraStateRegistry;
    CaptureSessionInterface mCaptureSession;

    @NonNull
    private final SynchronizedCaptureSession.OpenerBuilder mCaptureSessionOpenerBuilder;

    @NonNull
    private final CaptureSessionRepository mCaptureSessionRepository;
    private final boolean mCloseCameraBeforeCreateNewSessionQuirk;
    private final boolean mConfigAndCloseQuirk;

    @NonNull
    private final DisplayInfoManager mDisplayInfoManager;

    @NonNull
    private final DynamicRangesCompat mDynamicRangesCompat;
    private final ErrorTimeoutReopenScheduler mErrorTimeoutReopenScheduler;
    private final Executor mExecutor;
    boolean mIsActiveResumingMode;
    private boolean mIsConfigAndCloseRequired;
    private boolean mIsConfiguringForClose;
    private boolean mIsPrimary;
    final Object mLock;
    private MeteringRepeatingSession mMeteringRepeatingSession;
    private final Set<String> mNotifyStateAttachedSet;
    private final LiveDataObservable<CameraInternal.State> mObservableState;
    final AtomicInteger mReleaseRequestCount;
    final Map<CaptureSessionInterface, com.google.common.util.concurrent.p1<Void>> mReleasedCaptureSessions;
    private final ScheduledExecutorService mScheduledExecutorService;

    @Nullable
    @GuardedBy("mLock")
    private SessionProcessor mSessionProcessor;
    volatile InternalState mState = InternalState.INITIALIZED;
    private final StateCallback mStateCallback;

    @NonNull
    private final SupportedSurfaceCombination mSupportedSurfaceCombination;
    private int mTraceStateErrorCount;
    private final UseCaseAttachState mUseCaseAttachState;
    com.google.common.util.concurrent.p1<Void> mUserReleaseFuture;
    CallbackToFutureAdapter.Completer<Void> mUserReleaseNotifier;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class CameraAvailability extends CameraManager.AvailabilityCallback implements CameraStateRegistry.OnOpenAvailableListener {
        private boolean mCameraAvailable = true;
        private final String mCameraId;

        public CameraAvailability(String str) {
            this.mCameraId = str;
        }

        public boolean isCameraAvailable() {
            return this.mCameraAvailable;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@NonNull String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = true;
                if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                    Camera2CameraImpl.this.tryOpenCameraDevice(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@NonNull String str) {
            if (this.mCameraId.equals(str)) {
                this.mCameraAvailable = false;
            }
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnOpenAvailableListener
        public void onOpenAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.PENDING_OPEN) {
                Camera2CameraImpl.this.tryOpenCameraDevice(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class CameraConfigureAvailable implements CameraStateRegistry.OnConfigureAvailableListener {
        public CameraConfigureAvailable() {
        }

        @Override // androidx.camera.core.impl.CameraStateRegistry.OnConfigureAvailableListener
        public void onConfigureAvailable() {
            if (Camera2CameraImpl.this.mState == InternalState.OPENED) {
                Camera2CameraImpl.this.openCaptureSession();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ControlUpdateListenerInternal implements CameraControlInternal.ControlUpdateCallback {
        public ControlUpdateListenerInternal() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlCaptureRequests(@NonNull List<CaptureConfig> list) {
            Camera2CameraImpl.this.submitCaptureRequests((List) Preconditions.checkNotNull(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
        public void onCameraControlUpdateSessionConfig() {
            Camera2CameraImpl.this.updateCaptureSessionConfig();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ErrorTimeoutReopenScheduler {
        private static final long ERROR_TIMEOUT_MILLIS = 2000;

        @Nullable
        private ScheduleNode mScheduleNode;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class ScheduleNode {
            private final AtomicBoolean mIsDone = new AtomicBoolean(false);
            private final ScheduledFuture<?> mScheduledFuture;

            public ScheduleNode() {
                this.mScheduledFuture = Camera2CameraImpl.this.mScheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.camera2.internal.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.execute();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void execute() {
                if (this.mIsDone.getAndSet(true)) {
                    return;
                }
                Camera2CameraImpl.this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode.this.executeInternal();
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void executeInternal() {
                if (Camera2CameraImpl.this.mState == InternalState.OPENING) {
                    Camera2CameraImpl.this.debugLog("Camera onError timeout, reopen it.");
                    Camera2CameraImpl.this.setState(InternalState.REOPENING);
                    Camera2CameraImpl.this.mStateCallback.scheduleCameraReopen();
                } else {
                    Camera2CameraImpl.this.debugLog("Camera skip reopen at state: " + Camera2CameraImpl.this.mState);
                }
            }

            public void cancel() {
                this.mIsDone.set(true);
                this.mScheduledFuture.cancel(true);
            }

            public boolean isDone() {
                return this.mIsDone.get();
            }
        }

        private ErrorTimeoutReopenScheduler() {
            this.mScheduleNode = null;
        }

        public void cancel() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            if (scheduleNode != null) {
                scheduleNode.cancel();
            }
            this.mScheduleNode = null;
        }

        public void deviceOnError() {
            Camera2CameraImpl.this.debugLog("Camera receive onErrorCallback");
            cancel();
        }

        public boolean isErrorHandling() {
            ScheduleNode scheduleNode = this.mScheduleNode;
            return (scheduleNode == null || scheduleNode.isDone()) ? false : true;
        }

        public void start() {
            if (Camera2CameraImpl.this.mState != InternalState.OPENING) {
                Camera2CameraImpl.this.debugLog("Don't need the onError timeout handler.");
                return;
            }
            Camera2CameraImpl.this.debugLog("Camera waiting for onError.");
            cancel();
            this.mScheduleNode = new ScheduleNode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum InternalState {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class StateCallback extends CameraDevice.StateCallback {

        @NonNull
        private final CameraReopenMonitor mCameraReopenMonitor;
        private final Executor mExecutor;
        ScheduledFuture<?> mScheduledReopenHandle;
        private ScheduledReopen mScheduledReopenRunnable;
        private final ScheduledExecutorService mScheduler;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class CameraReopenMonitor {
            static final int ACTIVE_REOPEN_DELAY_BASE_MS = 1000;
            static final int ACTIVE_REOPEN_LIMIT_MS = 1800000;
            static final int INVALID_TIME = -1;
            static final int REOPEN_DELAY_MS = 700;
            static final int REOPEN_LIMIT_MS = 10000;
            private final long mCameraOpenRetryMaxTimeoutInMs;
            private long mFirstReopenTime = -1;

            public CameraReopenMonitor(long j11) {
                this.mCameraOpenRetryMaxTimeoutInMs = j11;
            }

            public boolean canScheduleCameraReopen() {
                if (getElapsedTime() < getReopenLimitMs()) {
                    return true;
                }
                reset();
                return false;
            }

            public long getElapsedTime() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.mFirstReopenTime == -1) {
                    this.mFirstReopenTime = uptimeMillis;
                }
                return uptimeMillis - this.mFirstReopenTime;
            }

            public int getReopenDelayMs() {
                if (!StateCallback.this.shouldActiveResume()) {
                    return 700;
                }
                long elapsedTime = getElapsedTime();
                if (elapsedTime <= com.igexin.push.config.c.f37553l) {
                    return 1000;
                }
                return elapsedTime <= 300000 ? 2000 : 4000;
            }

            public int getReopenLimitMs() {
                if (StateCallback.this.shouldActiveResume()) {
                    long j11 = this.mCameraOpenRetryMaxTimeoutInMs;
                    return j11 > 0 ? Math.min((int) j11, ACTIVE_REOPEN_LIMIT_MS) : ACTIVE_REOPEN_LIMIT_MS;
                }
                long j12 = this.mCameraOpenRetryMaxTimeoutInMs;
                if (j12 > 0) {
                    return Math.min((int) j12, 10000);
                }
                return 10000;
            }

            public void reset() {
                this.mFirstReopenTime = -1L;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class ScheduledReopen implements Runnable {
            private boolean mCancelled = false;
            private Executor mExecutor;

            public ScheduledReopen(@NonNull Executor executor) {
                this.mExecutor = executor;
            }

            public static /* synthetic */ void a(ScheduledReopen scheduledReopen) {
                if (scheduledReopen.mCancelled) {
                    return;
                }
                Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK);
                if (StateCallback.this.shouldActiveResume()) {
                    Camera2CameraImpl.this.tryForceOpenCameraDevice(true);
                } else {
                    Camera2CameraImpl.this.tryOpenCameraDevice(true);
                }
            }

            public void cancel() {
                this.mCancelled = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.StateCallback.ScheduledReopen.a(Camera2CameraImpl.StateCallback.ScheduledReopen.this);
                    }
                });
            }
        }

        public StateCallback(@NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, long j11) {
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraReopenMonitor = new CameraReopenMonitor(j11);
        }

        private void handleErrorOnOpen(@NonNull CameraDevice cameraDevice, int i11) {
            Preconditions.checkState(Camera2CameraImpl.this.mState == InternalState.OPENING || Camera2CameraImpl.this.mState == InternalState.OPENED || Camera2CameraImpl.this.mState == InternalState.CONFIGURED || Camera2CameraImpl.this.mState == InternalState.REOPENING || Camera2CameraImpl.this.mState == InternalState.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + Camera2CameraImpl.this.mState);
            if (i11 == 1 || i11 == 2 || i11 == 4) {
                Logger.d(Camera2CameraImpl.TAG, String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11)));
                reopenCameraAfterError(i11);
                return;
            }
            Logger.e(Camera2CameraImpl.TAG, "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + Camera2CameraImpl.getErrorMessage(i11) + " closing camera.");
            Camera2CameraImpl.this.setState(InternalState.CLOSING, CameraState.StateError.create(i11 == 3 ? 5 : 6));
            Camera2CameraImpl.this.closeCamera(false);
        }

        private void reopenCameraAfterError(int i11) {
            int i12 = 1;
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDeviceError != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i11 == 1) {
                i12 = 2;
            } else if (i11 != 2) {
                i12 = 3;
            }
            Camera2CameraImpl.this.setState(InternalState.REOPENING, CameraState.StateError.create(i12));
            Camera2CameraImpl.this.closeCamera(false);
        }

        public boolean cancelScheduledReopen() {
            if (this.mScheduledReopenHandle == null) {
                return false;
            }
            Camera2CameraImpl.this.debugLog("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
            this.mScheduledReopenRunnable.cancel();
            this.mScheduledReopenRunnable = null;
            this.mScheduledReopenHandle.cancel(false);
            this.mScheduledReopenHandle = null;
            return true;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onClosed()");
            Preconditions.checkState(Camera2CameraImpl.this.mCameraDevice == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.configAndCloseIfNeeded();
                return;
            }
            if (ordinal != 5 && ordinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + Camera2CameraImpl.this.mState);
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (camera2CameraImpl.mCameraDeviceError == 0) {
                camera2CameraImpl.tryOpenCameraDevice(false);
                return;
            }
            camera2CameraImpl.debugLog("Camera closed due to error: " + Camera2CameraImpl.getErrorMessage(Camera2CameraImpl.this.mCameraDeviceError));
            scheduleCameraReopen();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i11) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = i11;
            camera2CameraImpl.mErrorTimeoutReopenScheduler.deviceOnError();
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        Logger.d(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11), Camera2CameraImpl.this.mState.name()));
                        handleErrorOnOpen(cameraDevice, i11);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
            }
            Logger.e(Camera2CameraImpl.TAG, String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.getErrorMessage(i11), Camera2CameraImpl.this.mState.name()));
            Camera2CameraImpl.this.closeCamera(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
            Camera2CameraImpl.this.debugLog("CameraDevice.onOpened()");
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.mCameraDevice = cameraDevice;
            camera2CameraImpl.mCameraDeviceError = 0;
            resetReopenMonitor();
            int ordinal = Camera2CameraImpl.this.mState.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                Preconditions.checkState(Camera2CameraImpl.this.isSessionCloseComplete());
                Camera2CameraImpl.this.mCameraDevice.close();
                Camera2CameraImpl.this.mCameraDevice = null;
            } else {
                if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + Camera2CameraImpl.this.mState);
                }
                Camera2CameraImpl.this.setState(InternalState.OPENED);
                CameraStateRegistry cameraStateRegistry = Camera2CameraImpl.this.mCameraStateRegistry;
                String id2 = cameraDevice.getId();
                Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
                if (cameraStateRegistry.tryOpenCaptureSession(id2, camera2CameraImpl2.mCameraCoordinator.getPairedConcurrentCameraId(camera2CameraImpl2.mCameraDevice.getId()))) {
                    Camera2CameraImpl.this.openCaptureSession();
                }
            }
        }

        public void resetReopenMonitor() {
            this.mCameraReopenMonitor.reset();
        }

        public void scheduleCameraReopen() {
            Preconditions.checkState(this.mScheduledReopenRunnable == null);
            Preconditions.checkState(this.mScheduledReopenHandle == null);
            if (!this.mCameraReopenMonitor.canScheduleCameraReopen()) {
                Logger.e(Camera2CameraImpl.TAG, "Camera reopening attempted for " + this.mCameraReopenMonitor.getReopenLimitMs() + "ms without success.");
                Camera2CameraImpl.this.setState(InternalState.PENDING_OPEN, null, false);
                return;
            }
            this.mScheduledReopenRunnable = new ScheduledReopen(this.mExecutor);
            Camera2CameraImpl.this.debugLog("Attempting camera re-open in " + this.mCameraReopenMonitor.getReopenDelayMs() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + Camera2CameraImpl.this.mIsActiveResumingMode);
            this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, (long) this.mCameraReopenMonitor.getReopenDelayMs(), TimeUnit.MILLISECONDS);
        }

        public boolean shouldActiveResume() {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            if (!camera2CameraImpl.mIsActiveResumingMode) {
                return false;
            }
            int i11 = camera2CameraImpl.mCameraDeviceError;
            return i11 == 1 || i11 == 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class UseCaseInfo {
        @NonNull
        public static UseCaseInfo create(@NonNull String str, @NonNull Class<?> cls, @NonNull SessionConfig sessionConfig, @NonNull UseCaseConfig<?> useCaseConfig, @Nullable Size size, @Nullable StreamSpec streamSpec, @Nullable List<UseCaseConfigFactory.CaptureType> list) {
            return new AutoValue_Camera2CameraImpl_UseCaseInfo(str, cls, sessionConfig, useCaseConfig, size, streamSpec, list);
        }

        @NonNull
        public static UseCaseInfo from(@NonNull UseCase useCase, boolean z11) {
            return create(Camera2CameraImpl.getUseCaseId(useCase), useCase.getClass(), z11 ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedSurfaceResolution(), useCase.getAttachedStreamSpec(), Camera2CameraImpl.getCaptureTypes(useCase));
        }

        @Nullable
        public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

        @NonNull
        public abstract SessionConfig getSessionConfig();

        @Nullable
        public abstract StreamSpec getStreamSpec();

        @Nullable
        public abstract Size getSurfaceResolution();

        @NonNull
        public abstract UseCaseConfig<?> getUseCaseConfig();

        @NonNull
        public abstract String getUseCaseId();

        @NonNull
        public abstract Class<?> getUseCaseType();
    }

    public Camera2CameraImpl(@NonNull Context context, @NonNull CameraManagerCompat cameraManagerCompat, @NonNull String str, @NonNull Camera2CameraInfoImpl camera2CameraInfoImpl, @NonNull CameraCoordinator cameraCoordinator, @NonNull CameraStateRegistry cameraStateRegistry, @NonNull Executor executor, @NonNull Handler handler, @NonNull DisplayInfoManager displayInfoManager, long j11) throws CameraUnavailableException {
        LiveDataObservable<CameraInternal.State> liveDataObservable = new LiveDataObservable<>();
        this.mObservableState = liveDataObservable;
        this.mCameraDeviceError = 0;
        this.mReleaseRequestCount = new AtomicInteger(0);
        this.mReleasedCaptureSessions = new LinkedHashMap();
        this.mTraceStateErrorCount = 0;
        this.mIsConfigAndCloseRequired = false;
        this.mIsConfiguringForClose = false;
        this.mIsPrimary = true;
        this.mNotifyStateAttachedSet = new HashSet();
        this.mCameraConfig = CameraConfigs.defaultConfig();
        this.mLock = new Object();
        this.mIsActiveResumingMode = false;
        this.mErrorTimeoutReopenScheduler = new ErrorTimeoutReopenScheduler();
        this.mCameraManager = cameraManagerCompat;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraStateRegistry = cameraStateRegistry;
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(handler);
        this.mScheduledExecutorService = newHandlerExecutor;
        Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mExecutor = newSequentialExecutor;
        this.mStateCallback = new StateCallback(newSequentialExecutor, newHandlerExecutor, j11);
        this.mUseCaseAttachState = new UseCaseAttachState(str);
        liveDataObservable.postValue(CameraInternal.State.CLOSED);
        CameraStateMachine cameraStateMachine = new CameraStateMachine(cameraStateRegistry);
        this.mCameraStateMachine = cameraStateMachine;
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(newSequentialExecutor);
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mDisplayInfoManager = displayInfoManager;
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraCharacteristicsCompat, newHandlerExecutor, newSequentialExecutor, new ControlUpdateListenerInternal(), camera2CameraInfoImpl.getCameraQuirks());
            this.mCameraControlInternal = camera2CameraControlImpl;
            this.mCameraInfoInternal = camera2CameraInfoImpl;
            camera2CameraInfoImpl.linkWithCameraControl(camera2CameraControlImpl);
            camera2CameraInfoImpl.setCameraStateSource(cameraStateMachine.getStateLiveData());
            this.mDynamicRangesCompat = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
            this.mCaptureSession = newCaptureSession();
            this.mCaptureSessionOpenerBuilder = new SynchronizedCaptureSession.OpenerBuilder(newSequentialExecutor, newHandlerExecutor, handler, captureSessionRepository, camera2CameraInfoImpl.getCameraQuirks(), DeviceQuirks.getAll());
            this.mCloseCameraBeforeCreateNewSessionQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.mConfigAndCloseQuirk = camera2CameraInfoImpl.getCameraQuirks().contains(LegacyCameraSurfaceCleanupQuirk.class);
            CameraAvailability cameraAvailability = new CameraAvailability(str);
            this.mCameraAvailability = cameraAvailability;
            CameraConfigureAvailable cameraConfigureAvailable = new CameraConfigureAvailable();
            this.mCameraConfigureAvailable = cameraConfigureAvailable;
            cameraStateRegistry.registerCamera(this, newSequentialExecutor, cameraConfigureAvailable, cameraAvailability);
            cameraManagerCompat.registerAvailabilityCallback(newSequentialExecutor, cameraAvailability);
            this.mSupportedSurfaceCombination = new SupportedSurfaceCombination(context, str, cameraManagerCompat, new CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.1
                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public CamcorderProfile get(int i11, int i12) {
                    return CamcorderProfile.get(i11, i12);
                }

                @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
                public boolean hasProfile(int i11, int i12) {
                    return CamcorderProfile.hasProfile(i11, i12);
                }
            });
        } catch (CameraAccessExceptionCompat e11) {
            throw CameraUnavailableExceptionHelper.createFrom(e11);
        }
    }

    public static /* synthetic */ Object a(Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            ArrayList arrayList = new ArrayList(camera2CameraImpl.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
            arrayList.add(camera2CameraImpl.mCaptureSessionRepository.getCameraStateCallback());
            arrayList.add(new CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.2
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onClosed(@NonNull CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera closed");
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(@NonNull CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera disconnected");
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(@NonNull CameraDevice cameraDevice, int i11) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera error " + i11);
                    completer.set(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(@NonNull final CameraDevice cameraDevice) {
                    Camera2CameraImpl.this.debugLog("openCameraConfigAndClose camera opened");
                    com.google.common.util.concurrent.p1 configAndClose = Camera2CameraImpl.this.configAndClose(cameraDevice);
                    Objects.requireNonNull(cameraDevice);
                    configAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraDevice.close();
                        }
                    }, Camera2CameraImpl.this.mExecutor);
                }
            });
            camera2CameraImpl.mCameraManager.openCamera(camera2CameraImpl.mCameraInfoInternal.getCameraId(), camera2CameraImpl.mExecutor, CameraDeviceStateCallbacks.createComboCallback(arrayList));
            return "configAndCloseTask";
        } catch (CameraAccessExceptionCompat | SecurityException e11) {
            camera2CameraImpl.debugLog("Unable to open camera for configAndClose: " + e11.getMessage(), e11);
            completer.setException(e11);
            return "configAndCloseTask";
        }
    }

    private void addMeteringRepeating() {
        MeteringRepeatingSession meteringRepeatingSession = this.mMeteringRepeatingSession;
        if (meteringRepeatingSession != null) {
            String meteringRepeatingId = getMeteringRepeatingId(meteringRepeatingSession);
            UseCaseAttachState useCaseAttachState = this.mUseCaseAttachState;
            SessionConfig sessionConfig = this.mMeteringRepeatingSession.getSessionConfig();
            UseCaseConfig<?> useCaseConfig = this.mMeteringRepeatingSession.getUseCaseConfig();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            useCaseAttachState.setUseCaseAttached(meteringRepeatingId, sessionConfig, useCaseConfig, null, Collections.singletonList(captureType));
            this.mUseCaseAttachState.setUseCaseActive(meteringRepeatingId, this.mMeteringRepeatingSession.getSessionConfig(), this.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(captureType));
        }
    }

    private void addOrRemoveMeteringRepeatingUseCase() {
        SessionConfig build = this.mUseCaseAttachState.getAttachedBuilder().build();
        CaptureConfig repeatingCaptureConfig = build.getRepeatingCaptureConfig();
        int size = repeatingCaptureConfig.getSurfaces().size();
        int size2 = build.getSurfaces().size();
        if (build.getSurfaces().isEmpty()) {
            return;
        }
        if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
            if (this.mMeteringRepeatingSession == null) {
                this.mMeteringRepeatingSession = new MeteringRepeatingSession(this.mCameraInfoInternal.getCameraCharacteristicsCompat(), this.mDisplayInfoManager, new MeteringRepeatingSession.SurfaceResetCallback() { // from class: androidx.camera.camera2.internal.u
                    @Override // androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback
                    public final void onSurfaceReset() {
                        Camera2CameraImpl.l(Camera2CameraImpl.this);
                    }
                });
            }
            if (isSurfaceCombinationWithMeteringRepeatingSupported()) {
                addMeteringRepeating();
                return;
            } else {
                Logger.e(TAG, "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
        }
        if (size2 == 1 && size == 1) {
            removeMeteringRepeating();
            return;
        }
        if (size >= 2) {
            removeMeteringRepeating();
            return;
        }
        if (this.mMeteringRepeatingSession != null && !isSurfaceCombinationWithMeteringRepeatingSupported()) {
            removeMeteringRepeating();
            return;
        }
        Logger.d(TAG, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
    }

    public static /* synthetic */ Object b(final Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.m(Camera2CameraImpl.this, completer);
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void c(Camera2CameraImpl camera2CameraImpl) {
        camera2CameraImpl.mIsConfiguringForClose = false;
        camera2CameraImpl.mIsConfigAndCloseRequired = false;
        camera2CameraImpl.debugLog("OpenCameraConfigAndClose is done, state: " + camera2CameraImpl.mState);
        int ordinal = camera2CameraImpl.mState.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            Preconditions.checkState(camera2CameraImpl.isSessionCloseComplete());
            camera2CameraImpl.finishClose();
            return;
        }
        if (ordinal != 6) {
            camera2CameraImpl.debugLog("OpenCameraConfigAndClose finished while in state: " + camera2CameraImpl.mState);
            return;
        }
        if (camera2CameraImpl.mCameraDeviceError == 0) {
            camera2CameraImpl.tryOpenCameraDevice(false);
            return;
        }
        camera2CameraImpl.debugLog("OpenCameraConfigAndClose in error: " + getErrorMessage(camera2CameraImpl.mCameraDeviceError));
        camera2CameraImpl.mStateCallback.scheduleCameraReopen();
    }

    private boolean checkAndAttachRepeatingSurface(CaptureConfig.Builder builder) {
        if (!builder.getSurfaces().isEmpty()) {
            Logger.w(TAG, "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<SessionConfig> it = this.mUseCaseAttachState.getActiveAndAttachedSessionConfigs().iterator();
        while (it.hasNext()) {
            CaptureConfig repeatingCaptureConfig = it.next().getRepeatingCaptureConfig();
            List<DeferrableSurface> surfaces = repeatingCaptureConfig.getSurfaces();
            if (!surfaces.isEmpty()) {
                if (repeatingCaptureConfig.getPreviewStabilizationMode() != 0) {
                    builder.setPreviewStabilization(repeatingCaptureConfig.getPreviewStabilizationMode());
                }
                if (repeatingCaptureConfig.getVideoStabilizationMode() != 0) {
                    builder.setVideoStabilization(repeatingCaptureConfig.getVideoStabilizationMode());
                }
                Iterator<DeferrableSurface> it2 = surfaces.iterator();
                while (it2.hasNext()) {
                    builder.addSurface(it2.next());
                }
            }
        }
        if (!builder.getSurfaces().isEmpty()) {
            return true;
        }
        Logger.w(TAG, "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInternal() {
        debugLog("Closing camera.");
        switch (this.mState.ordinal()) {
            case 3:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.INITIALIZED);
                break;
            case 4:
            default:
                debugLog("close() ignored due to being in state: " + this.mState);
                break;
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r1 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.CLOSING);
                if (r1) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                    break;
                }
                break;
            case 8:
            case 9:
                setState(InternalState.CLOSING);
                closeCamera(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.common.util.concurrent.p1<Void> configAndClose(@NonNull CameraDevice cameraDevice) {
        final CaptureSession captureSession = new CaptureSession(this.mDynamicRangesCompat);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.b0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.d(surface, surfaceTexture);
            }
        }, CameraXExecutors.directExecutor());
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.addNonRepeatingSurface(immediateSurface);
        builder.setTemplateType(1);
        debugLog("Start configAndClose.");
        return FutureChain.from(Futures.transformAsyncOnCompletion(captureSession.open(builder.build(), cameraDevice, this.mCaptureSessionOpenerBuilder.build()))).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.d0
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.p1 apply(Object obj) {
                return Camera2CameraImpl.j(CaptureSession.this, immediateSurface, (Void) obj);
            }
        }, this.mExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configAndCloseIfNeeded() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        if (!this.mIsConfigAndCloseRequired) {
            finishClose();
            return;
        }
        if (this.mIsConfiguringForClose) {
            debugLog("Ignored since configAndClose is processing");
            return;
        }
        if (!this.mCameraAvailability.isCameraAvailable()) {
            this.mIsConfigAndCloseRequired = false;
            finishClose();
            debugLog("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            debugLog("Open camera to configAndClose");
            com.google.common.util.concurrent.p1<Void> openCameraConfigAndClose = openCameraConfigAndClose();
            this.mIsConfiguringForClose = true;
            openCameraConfigAndClose.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.c(Camera2CameraImpl.this);
                }
            }, this.mExecutor);
        }
    }

    private CameraDevice.StateCallback createDeviceStateCallback() {
        ArrayList arrayList = new ArrayList(this.mUseCaseAttachState.getAttachedBuilder().build().getDeviceStateCallbacks());
        arrayList.add(this.mCaptureSessionRepository.getCameraStateCallback());
        arrayList.add(this.mStateCallback);
        return CameraDeviceStateCallbacks.createComboCallback(arrayList);
    }

    public static /* synthetic */ void d(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void e(Camera2CameraImpl camera2CameraImpl, String str) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " INACTIVE");
        camera2CameraImpl.mUseCaseAttachState.setUseCaseInactive(str);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    public static /* synthetic */ void g(Camera2CameraImpl camera2CameraImpl, boolean z11) {
        camera2CameraImpl.mIsActiveResumingMode = z11;
        if (z11 && camera2CameraImpl.mState == InternalState.PENDING_OPEN) {
            camera2CameraImpl.tryForceOpenCameraDevice(false);
        }
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            try {
                return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public static List<UseCaseConfigFactory.CaptureType> getCaptureTypes(@NonNull UseCase useCase) {
        if (useCase.getCamera() == null) {
            return null;
        }
        return StreamSharing.getCaptureTypes(useCase);
    }

    public static String getErrorMessage(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    @NonNull
    public static String getMeteringRepeatingId(@NonNull MeteringRepeatingSession meteringRepeatingSession) {
        return meteringRepeatingSession.getName() + meteringRepeatingSession.hashCode();
    }

    private com.google.common.util.concurrent.p1<Void> getOrCreateUserReleaseFuture() {
        if (this.mUserReleaseFuture == null) {
            if (this.mState != InternalState.RELEASED) {
                this.mUserReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.w
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CameraImpl.v(Camera2CameraImpl.this, completer);
                    }
                });
            } else {
                this.mUserReleaseFuture = Futures.immediateFuture(null);
            }
        }
        return this.mUserReleaseFuture;
    }

    @NonNull
    public static String getUseCaseId(@NonNull UseCase useCase) {
        return useCase.getName() + useCase.hashCode();
    }

    public static /* synthetic */ void h(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " UPDATED");
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    private boolean isSurfaceCombinationWithMeteringRepeatingSupported() {
        ArrayList arrayList = new ArrayList();
        int cameraMode = getCameraMode();
        for (UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo : this.mUseCaseAttachState.getAttachedUseCaseInfo()) {
            if (useCaseAttachInfo.getCaptureTypes() == null || useCaseAttachInfo.getCaptureTypes().get(0) != UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                if (useCaseAttachInfo.getStreamSpec() == null || useCaseAttachInfo.getCaptureTypes() == null) {
                    Logger.w(TAG, "Invalid stream spec or capture types in " + useCaseAttachInfo);
                    return false;
                }
                SessionConfig sessionConfig = useCaseAttachInfo.getSessionConfig();
                UseCaseConfig<?> useCaseConfig = useCaseAttachInfo.getUseCaseConfig();
                for (DeferrableSurface deferrableSurface : sessionConfig.getSurfaces()) {
                    arrayList.add(AttachedSurfaceInfo.create(this.mSupportedSurfaceCombination.transformSurfaceConfig(cameraMode, useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize()), useCaseConfig.getInputFormat(), deferrableSurface.getPrescribedSize(), useCaseAttachInfo.getStreamSpec().getDynamicRange(), useCaseAttachInfo.getCaptureTypes(), useCaseAttachInfo.getStreamSpec().getImplementationOptions(), useCaseConfig.getTargetFrameRate(null)));
                }
            }
        }
        Preconditions.checkNotNull(this.mMeteringRepeatingSession);
        HashMap hashMap = new HashMap();
        hashMap.put(this.mMeteringRepeatingSession.getUseCaseConfig(), Collections.singletonList(this.mMeteringRepeatingSession.getMeteringRepeatingSize()));
        try {
            this.mSupportedSurfaceCombination.getSuggestedStreamSpecifications(cameraMode, arrayList, hashMap, false, false);
            debugLog("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e11) {
            debugLog("Surface combination with metering repeating  not supported!", e11);
            return false;
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.p1 j(CaptureSession captureSession, DeferrableSurface deferrableSurface, Void r22) {
        captureSession.close();
        deferrableSurface.close();
        return captureSession.release(false);
    }

    public static /* synthetic */ void l(Camera2CameraImpl camera2CameraImpl) {
        if (camera2CameraImpl.isMeteringRepeatingAttached()) {
            camera2CameraImpl.resetUseCase(getMeteringRepeatingId(camera2CameraImpl.mMeteringRepeatingSession), camera2CameraImpl.mMeteringRepeatingSession.getSessionConfig(), camera2CameraImpl.mMeteringRepeatingSession.getUseCaseConfig(), null, Collections.singletonList(UseCaseConfigFactory.CaptureType.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void m(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        MeteringRepeatingSession meteringRepeatingSession = camera2CameraImpl.mMeteringRepeatingSession;
        if (meteringRepeatingSession == null) {
            completer.set(Boolean.FALSE);
        } else {
            completer.set(Boolean.valueOf(camera2CameraImpl.mUseCaseAttachState.isUseCaseAttached(getMeteringRepeatingId(meteringRepeatingSession))));
        }
    }

    public static /* synthetic */ void n(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " ACTIVE");
        camera2CameraImpl.mUseCaseAttachState.setUseCaseActive(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.updateCaptureSessionConfig();
    }

    @NonNull
    private CaptureSessionInterface newCaptureSession() {
        synchronized (this.mLock) {
            try {
                if (this.mSessionProcessor == null) {
                    return new CaptureSession(this.mDynamicRangesCompat, this.mCameraInfoInternal.getCameraQuirks());
                }
                return new ProcessingCaptureSession(this.mSessionProcessor, this.mCameraInfoInternal, this.mDynamicRangesCompat, this.mExecutor, this.mScheduledExecutorService);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void notifyStateAttachedAndCameraControlReady(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (!this.mNotifyStateAttachedSet.contains(useCaseId)) {
                this.mNotifyStateAttachedSet.add(useCaseId);
                useCase.onStateAttached();
                useCase.onCameraControlReady();
            }
        }
    }

    private void notifyStateDetachedToUseCases(List<UseCase> list) {
        for (UseCase useCase : list) {
            String useCaseId = getUseCaseId(useCase);
            if (this.mNotifyStateAttachedSet.contains(useCaseId)) {
                useCase.onStateDetached();
                this.mNotifyStateAttachedSet.remove(useCaseId);
            }
        }
    }

    public static /* synthetic */ Object o(final Camera2CameraImpl camera2CameraImpl, final String str, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    completer.set(Boolean.valueOf(Camera2CameraImpl.this.mUseCaseAttachState.isUseCaseAttached(str)));
                }
            });
            return "isUseCaseAttached";
        } catch (RejectedExecutionException unused) {
            completer.setException(new RuntimeException("Unable to check if use case is attached. Camera executor shut down."));
            return "isUseCaseAttached";
        }
    }

    @NonNull
    @SuppressLint({"MissingPermission"})
    private com.google.common.util.concurrent.p1<Void> openCameraConfigAndClose() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.f0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.a(Camera2CameraImpl.this, completer);
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    private void openCameraDevice(boolean z11) {
        if (!z11) {
            this.mStateCallback.resetReopenMonitor();
        }
        this.mStateCallback.cancelScheduledReopen();
        this.mErrorTimeoutReopenScheduler.cancel();
        debugLog("Opening camera.");
        setState(InternalState.OPENING);
        try {
            this.mCameraManager.openCamera(this.mCameraInfoInternal.getCameraId(), this.mExecutor, createDeviceStateCallback());
        } catch (CameraAccessExceptionCompat e11) {
            debugLog("Unable to open camera due to " + e11.getMessage());
            if (e11.getReason() != 10001) {
                this.mErrorTimeoutReopenScheduler.start();
            } else {
                setState(InternalState.INITIALIZED, CameraState.StateError.create(7, e11));
            }
        } catch (SecurityException e12) {
            debugLog("Unable to open camera due to " + e12.getMessage());
            setState(InternalState.REOPENING);
            this.mStateCallback.scheduleCameraReopen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternal() {
        int ordinal = this.mState.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            tryForceOpenCameraDevice(false);
            return;
        }
        if (ordinal != 4) {
            debugLog("open() ignored due to being in state: " + this.mState);
            return;
        }
        setState(InternalState.REOPENING);
        if (isSessionCloseComplete() || this.mIsConfiguringForClose || this.mCameraDeviceError != 0) {
            return;
        }
        Preconditions.checkState(this.mCameraDevice != null, "Camera Device should be open if session close is not complete");
        setState(InternalState.OPENED);
        openCaptureSession();
    }

    public static /* synthetic */ void q(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        camera2CameraImpl.getClass();
        camera2CameraImpl.debugLog("Use case " + str + " RESET");
        camera2CameraImpl.mUseCaseAttachState.updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
        camera2CameraImpl.addOrRemoveMeteringRepeatingUseCase();
        camera2CameraImpl.resetCaptureSession(false);
        camera2CameraImpl.updateCaptureSessionConfig();
        if (camera2CameraImpl.mState == InternalState.OPENED) {
            camera2CameraImpl.openCaptureSession();
        }
    }

    public static /* synthetic */ Object r(final Camera2CameraImpl camera2CameraImpl, final CallbackToFutureAdapter.Completer completer) {
        camera2CameraImpl.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0
            @Override // java.lang.Runnable
            public final void run() {
                Futures.propagate(Camera2CameraImpl.this.releaseInternal(), completer);
            }
        });
        return "Release[request=" + camera2CameraImpl.mReleaseRequestCount.getAndIncrement() + "]";
    }

    private com.google.common.util.concurrent.p1<Void> releaseInternal() {
        com.google.common.util.concurrent.p1<Void> orCreateUserReleaseFuture = getOrCreateUserReleaseFuture();
        switch (this.mState.ordinal()) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!this.mStateCallback.cancelScheduledReopen() && !this.mErrorTimeoutReopenScheduler.isErrorHandling()) {
                    r2 = false;
                }
                this.mErrorTimeoutReopenScheduler.cancel();
                setState(InternalState.RELEASING);
                if (r2) {
                    Preconditions.checkState(isSessionCloseComplete());
                    configAndCloseIfNeeded();
                    break;
                }
                break;
            case 2:
            case 3:
                Preconditions.checkState(this.mCameraDevice == null);
                setState(InternalState.RELEASING);
                Preconditions.checkState(isSessionCloseComplete());
                configAndCloseIfNeeded();
                break;
            case 8:
            case 9:
                setState(InternalState.RELEASING);
                closeCamera(false);
                break;
            default:
                debugLog("release() ignored due to being in state: " + this.mState);
                break;
        }
        return orCreateUserReleaseFuture;
    }

    private void removeMeteringRepeating() {
        if (this.mMeteringRepeatingSession != null) {
            this.mUseCaseAttachState.setUseCaseDetached(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mUseCaseAttachState.setUseCaseInactive(this.mMeteringRepeatingSession.getName() + this.mMeteringRepeatingSession.hashCode());
            this.mMeteringRepeatingSession.clear();
            this.mMeteringRepeatingSession = null;
        }
    }

    private void resetUseCase(@NonNull final String str, @NonNull final SessionConfig sessionConfig, @NonNull final UseCaseConfig<?> useCaseConfig, @Nullable final StreamSpec streamSpec, @Nullable final List<UseCaseConfigFactory.CaptureType> list) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.y
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.q(Camera2CameraImpl.this, str, sessionConfig, useCaseConfig, streamSpec, list);
            }
        });
    }

    @NonNull
    private Collection<UseCaseInfo> toUseCaseInfos(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(UseCaseInfo.from(it.next(), this.mIsPrimary));
        }
        return arrayList;
    }

    private void tryAttachUseCases(@NonNull Collection<UseCaseInfo> collection) {
        Size surfaceResolution;
        boolean isEmpty = this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (UseCaseInfo useCaseInfo : collection) {
            if (!this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.setUseCaseAttached(useCaseInfo.getUseCaseId(), useCaseInfo.getSessionConfig(), useCaseInfo.getUseCaseConfig(), useCaseInfo.getStreamSpec(), useCaseInfo.getCaptureTypes());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class && (surfaceResolution = useCaseInfo.getSurfaceResolution()) != null) {
                    rational = new Rational(surfaceResolution.getWidth(), surfaceResolution.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(org.junit.jupiter.api.j2.O, arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.mCameraControlInternal.setActive(true);
            this.mCameraControlInternal.incrementUseCount();
        }
        addOrRemoveMeteringRepeatingUseCase();
        updateZslDisabledByUseCaseConfigStatus();
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        } else {
            openInternal();
        }
        if (rational != null) {
            this.mCameraControlInternal.setPreviewAspectRatio(rational);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDetachUseCases(@NonNull Collection<UseCaseInfo> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (UseCaseInfo useCaseInfo : collection) {
            if (this.mUseCaseAttachState.isUseCaseAttached(useCaseInfo.getUseCaseId())) {
                this.mUseCaseAttachState.removeUseCase(useCaseInfo.getUseCaseId());
                arrayList.add(useCaseInfo.getUseCaseId());
                if (useCaseInfo.getUseCaseType() == Preview.class) {
                    z11 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        debugLog("Use cases [" + TextUtils.join(org.junit.jupiter.api.j2.O, arrayList) + "] now DETACHED for camera");
        if (z11) {
            this.mCameraControlInternal.setPreviewAspectRatio(null);
        }
        addOrRemoveMeteringRepeatingUseCase();
        if (this.mUseCaseAttachState.getAttachedUseCaseConfigs().isEmpty()) {
            this.mCameraControlInternal.setZslDisabledByUserCaseConfig(false);
        } else {
            updateZslDisabledByUseCaseConfigStatus();
        }
        if (this.mUseCaseAttachState.getAttachedSessionConfigs().isEmpty()) {
            this.mCameraControlInternal.decrementUseCount();
            resetCaptureSession(false);
            this.mCameraControlInternal.setActive(false);
            this.mCaptureSession = newCaptureSession();
            closeInternal();
            return;
        }
        updateCaptureSessionConfig();
        resetCaptureSession(false);
        if (this.mState == InternalState.OPENED) {
            openCaptureSession();
        }
    }

    public static /* synthetic */ void u(Camera2CameraImpl camera2CameraImpl, List list) {
        camera2CameraImpl.getClass();
        try {
            camera2CameraImpl.tryAttachUseCases(list);
        } finally {
            camera2CameraImpl.mCameraControlInternal.decrementUseCount();
        }
    }

    private void updateZslDisabledByUseCaseConfigStatus() {
        Iterator<UseCaseConfig<?>> it = this.mUseCaseAttachState.getAttachedUseCaseConfigs().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= it.next().isZslDisabled(false);
        }
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z11);
    }

    public static /* synthetic */ Object v(Camera2CameraImpl camera2CameraImpl, CallbackToFutureAdapter.Completer completer) {
        Preconditions.checkState(camera2CameraImpl.mUserReleaseNotifier == null, "Camera can only be released once, so release completer should be null on creation.");
        camera2CameraImpl.mUserReleaseNotifier = completer;
        return "Release[camera=" + camera2CameraImpl + "]";
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.mCameraControlInternal.incrementUseCount();
        notifyStateAttachedAndCameraControlReady(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.i0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl.u(Camera2CameraImpl.this, arrayList2);
                }
            });
        } catch (RejectedExecutionException e11) {
            debugLog("Unable to attach use cases.", e11);
            this.mCameraControlInternal.decrementUseCount();
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.closeInternal();
            }
        });
    }

    public void closeCamera(boolean z11) {
        Preconditions.checkState(this.mState == InternalState.CLOSING || this.mState == InternalState.RELEASING || (this.mState == InternalState.REOPENING && this.mCameraDeviceError != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.mState + " (error: " + getErrorMessage(this.mCameraDeviceError) + pn.j.f81007d);
        resetCaptureSession(z11);
        this.mCaptureSession.cancelIssuedCaptureRequests();
    }

    public void debugLog(@NonNull String str) {
        debugLog(str, null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(@NonNull Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(toUseCaseInfos(arrayList));
        notifyStateDetachedToUseCases(new ArrayList(arrayList));
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.tryDetachUseCases(arrayList2);
            }
        });
    }

    @Nullable
    public SessionConfig findSessionConfigForSurface(@NonNull DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.mUseCaseAttachState.getAttachedSessionConfigs()) {
            if (sessionConfig.getSurfaces().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    public void finishClose() {
        Preconditions.checkState(this.mState == InternalState.RELEASING || this.mState == InternalState.CLOSING);
        Preconditions.checkState(this.mReleasedCaptureSessions.isEmpty());
        this.mCameraDevice = null;
        if (this.mState == InternalState.CLOSING) {
            setState(InternalState.INITIALIZED);
            return;
        }
        this.mCameraManager.unregisterAvailabilityCallback(this.mCameraAvailability);
        setState(InternalState.RELEASED);
        CallbackToFutureAdapter.Completer<Void> completer = this.mUserReleaseNotifier;
        if (completer != null) {
            completer.set(null);
            this.mUserReleaseNotifier = null;
        }
    }

    @NonNull
    @VisibleForTesting
    public CameraAvailability getCameraAvailability() {
        return this.mCameraAvailability;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraControlInternal getCameraControlInternal() {
        return this.mCameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mCameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public Observable<CameraInternal.State> getCameraState() {
        return this.mObservableState;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    @NonNull
    public CameraConfig getExtendedConfig() {
        return this.mCameraConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public boolean isMeteringRepeatingAttached() {
        try {
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.j0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.b(Camera2CameraImpl.this, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e11);
        }
    }

    public boolean isSessionCloseComplete() {
        return this.mReleasedCaptureSessions.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public boolean isUseCaseAttached(@NonNull UseCase useCase) {
        try {
            final String useCaseId = getUseCaseId(useCase);
            return ((Boolean) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.v
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CameraImpl.o(Camera2CameraImpl.this, useCaseId, completer);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e11) {
            throw new RuntimeException("Unable to check if use case is attached.", e11);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.n(Camera2CameraImpl.this, useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.e(Camera2CameraImpl.this, useCaseId);
            }
        });
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        resetUseCase(getUseCaseId(useCase), this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig(), useCase.getCurrentConfig(), useCase.getAttachedStreamSpec(), getCaptureTypes(useCase));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(@NonNull UseCase useCase) {
        Preconditions.checkNotNull(useCase);
        final String useCaseId = getUseCaseId(useCase);
        final SessionConfig sessionConfig = this.mIsPrimary ? useCase.getSessionConfig() : useCase.getSecondarySessionConfig();
        final UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
        final StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
        final List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.h(Camera2CameraImpl.this, useCaseId, sessionConfig, currentConfig, attachedStreamSpec, captureTypes);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.this.openInternal();
            }
        });
    }

    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public void openCaptureSession() {
        Preconditions.checkState(this.mState == InternalState.OPENED);
        SessionConfig.ValidatingBuilder attachedBuilder = this.mUseCaseAttachState.getAttachedBuilder();
        if (!attachedBuilder.isValid()) {
            debugLog("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.mCameraStateRegistry.tryOpenCaptureSession(this.mCameraDevice.getId(), this.mCameraCoordinator.getPairedConcurrentCameraId(this.mCameraDevice.getId()))) {
            debugLog("Unable to create capture session in camera operating mode = " + this.mCameraCoordinator.getCameraOperatingMode());
            return;
        }
        HashMap hashMap = new HashMap();
        StreamUseCaseUtil.populateSurfaceToStreamUseCaseMapping(this.mUseCaseAttachState.getAttachedSessionConfigs(), this.mUseCaseAttachState.getAttachedUseCaseConfigs(), hashMap);
        this.mCaptureSession.setStreamUseCaseMap(hashMap);
        final CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        Futures.addCallback(captureSessionInterface.open(attachedBuilder.build(), (CameraDevice) Preconditions.checkNotNull(this.mCameraDevice), this.mCaptureSessionOpenerBuilder.build()), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.4
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                    SessionConfig findSessionConfigForSurface = Camera2CameraImpl.this.findSessionConfigForSurface(((DeferrableSurface.SurfaceClosedException) th2).getDeferrableSurface());
                    if (findSessionConfigForSurface != null) {
                        Camera2CameraImpl.this.postSurfaceClosedError(findSessionConfigForSurface);
                        return;
                    }
                    return;
                }
                if (th2 instanceof CancellationException) {
                    Camera2CameraImpl.this.debugLog("Unable to configure camera cancelled");
                    return;
                }
                InternalState internalState = Camera2CameraImpl.this.mState;
                InternalState internalState2 = InternalState.OPENED;
                if (internalState == internalState2) {
                    Camera2CameraImpl.this.setState(internalState2, CameraState.StateError.create(4, th2));
                }
                Logger.e(Camera2CameraImpl.TAG, "Unable to configure camera " + Camera2CameraImpl.this, th2);
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                if (camera2CameraImpl.mCaptureSession == captureSessionInterface) {
                    camera2CameraImpl.resetCaptureSession(false);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r22) {
                if (Camera2CameraImpl.this.mCameraCoordinator.getCameraOperatingMode() == 2 && Camera2CameraImpl.this.mState == InternalState.OPENED) {
                    Camera2CameraImpl.this.setState(InternalState.CONFIGURED);
                }
            }
        }, this.mExecutor);
    }

    public void postSurfaceClosedError(@NonNull final SessionConfig sessionConfig) {
        ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
        final SessionConfig.ErrorListener errorListener = sessionConfig.getErrorListener();
        if (errorListener != null) {
            debugLog("Posting surface closed", new Throwable());
            mainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    SessionConfig.ErrorListener.this.onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    @NonNull
    public com.google.common.util.concurrent.p1<Void> release() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.s
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CameraImpl.r(Camera2CameraImpl.this, completer);
            }
        });
    }

    public com.google.common.util.concurrent.p1<Void> releaseSession(@NonNull final CaptureSessionInterface captureSessionInterface, boolean z11) {
        captureSessionInterface.close();
        com.google.common.util.concurrent.p1<Void> release = captureSessionInterface.release(z11);
        debugLog("Releasing session in state " + this.mState.name());
        this.mReleasedCaptureSessions.put(captureSessionInterface, release);
        Futures.addCallback(release, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r22) {
                Camera2CameraImpl.this.mReleasedCaptureSessions.remove(captureSessionInterface);
                int ordinal = Camera2CameraImpl.this.mState.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal != 5 && (ordinal != 6 || Camera2CameraImpl.this.mCameraDeviceError == 0)) {
                        return;
                    } else {
                        Camera2CameraImpl.this.debugLog("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (Camera2CameraImpl.this.isSessionCloseComplete()) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.mCameraDevice != null) {
                        camera2CameraImpl.debugLog("closing camera");
                        ApiCompat.Api21Impl.close(Camera2CameraImpl.this.mCameraDevice);
                        Camera2CameraImpl.this.mCameraDevice = null;
                    }
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
            }
        }, CameraXExecutors.directExecutor());
        return release;
    }

    public void resetCaptureSession(boolean z11) {
        Preconditions.checkState(this.mCaptureSession != null);
        debugLog("Resetting Capture Session");
        CaptureSessionInterface captureSessionInterface = this.mCaptureSession;
        SessionConfig sessionConfig = captureSessionInterface.getSessionConfig();
        List<CaptureConfig> captureConfigs = captureSessionInterface.getCaptureConfigs();
        CaptureSessionInterface newCaptureSession = newCaptureSession();
        this.mCaptureSession = newCaptureSession;
        newCaptureSession.setSessionConfig(sessionConfig);
        this.mCaptureSession.issueCaptureRequests(captureConfigs);
        if (this.mState.ordinal() != 8) {
            debugLog("Skipping Capture Session state check due to current camera state: " + this.mState + " and previous session status: " + captureSessionInterface.isInOpenState());
        } else if (this.mCloseCameraBeforeCreateNewSessionQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("Close camera before creating new session");
            setState(InternalState.REOPENING_QUIRK);
        }
        if (this.mConfigAndCloseQuirk && captureSessionInterface.isInOpenState()) {
            debugLog("ConfigAndClose is required when close the camera.");
            this.mIsConfigAndCloseRequired = true;
        }
        releaseSession(captureSessionInterface, z11);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(final boolean z11) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl.g(Camera2CameraImpl.this, z11);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(@Nullable CameraConfig cameraConfig) {
        if (cameraConfig == null) {
            cameraConfig = CameraConfigs.defaultConfig();
        }
        SessionProcessor sessionProcessor = cameraConfig.getSessionProcessor(null);
        this.mCameraConfig = cameraConfig;
        synchronized (this.mLock) {
            this.mSessionProcessor = sessionProcessor;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z11) {
        this.mIsPrimary = z11;
    }

    public void setState(@NonNull InternalState internalState) {
        setState(internalState, null);
    }

    public void submitCaptureRequests(@NonNull List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig captureConfig : list) {
            CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
            }
            if (!captureConfig.getSurfaces().isEmpty() || !captureConfig.isUseRepeatingSurface() || checkAndAttachRepeatingSurface(from)) {
                arrayList.add(from.build());
            }
        }
        debugLog("Issue capture request");
        this.mCaptureSession.issueCaptureRequests(arrayList);
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.mCameraInfoInternal.getCameraId());
    }

    public void traceInternalState(@NonNull InternalState internalState, @Nullable CameraState.StateError stateError) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:C2State[" + this + "]", internalState.ordinal());
            if (stateError != null) {
                this.mTraceStateErrorCount++;
            }
            if (this.mTraceStateErrorCount > 0) {
                Trace.setCounter("CX:C2StateErrorCode[" + this + "]", stateError != null ? stateError.getCode() : 0);
            }
        }
    }

    public void tryForceOpenCameraDevice(boolean z11) {
        debugLog("Attempting to force open the camera.");
        if (this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z11);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void tryOpenCameraDevice(boolean z11) {
        debugLog("Attempting to open the camera.");
        if (this.mCameraAvailability.isCameraAvailable() && this.mCameraStateRegistry.tryOpenCamera(this)) {
            openCameraDevice(z11);
        } else {
            debugLog("No cameras available. Waiting for available camera before opening camera.");
            setState(InternalState.PENDING_OPEN);
        }
    }

    public void updateCaptureSessionConfig() {
        SessionConfig.ValidatingBuilder activeAndAttachedBuilder = this.mUseCaseAttachState.getActiveAndAttachedBuilder();
        if (!activeAndAttachedBuilder.isValid()) {
            this.mCameraControlInternal.resetTemplate();
            this.mCaptureSession.setSessionConfig(this.mCameraControlInternal.getSessionConfig());
            return;
        }
        this.mCameraControlInternal.setTemplate(activeAndAttachedBuilder.build().getTemplateType());
        activeAndAttachedBuilder.add(this.mCameraControlInternal.getSessionConfig());
        this.mCaptureSession.setSessionConfig(activeAndAttachedBuilder.build());
    }

    private void debugLog(@NonNull String str, @Nullable Throwable th2) {
        Logger.d(TAG, String.format("{%s} %s", toString(), str), th2);
    }

    public void setState(@NonNull InternalState internalState, @Nullable CameraState.StateError stateError) {
        setState(internalState, stateError, true);
    }

    public void setState(@NonNull InternalState internalState, @Nullable CameraState.StateError stateError, boolean z11) {
        CameraInternal.State state;
        debugLog("Transitioning camera internal state: " + this.mState + " --> " + internalState);
        traceInternalState(internalState, stateError);
        this.mState = internalState;
        switch (internalState) {
            case RELEASED:
                state = CameraInternal.State.RELEASED;
                break;
            case RELEASING:
                state = CameraInternal.State.RELEASING;
                break;
            case INITIALIZED:
                state = CameraInternal.State.CLOSED;
                break;
            case PENDING_OPEN:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case CLOSING:
            case REOPENING_QUIRK:
                state = CameraInternal.State.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                state = CameraInternal.State.OPENING;
                break;
            case OPENED:
                state = CameraInternal.State.OPEN;
                break;
            case CONFIGURED:
                state = CameraInternal.State.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + internalState);
        }
        this.mCameraStateRegistry.markCameraState(this, state, z11);
        this.mObservableState.postValue(state);
        this.mCameraStateMachine.updateState(state, stateError);
    }
}
