package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";

    @NonNull
    private final Camera2CameraControlImpl mCameraControl;

    @NonNull
    private final Quirks mCameraQuirk;

    @NonNull
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;

    @NonNull
    private final ScheduledExecutorService mScheduler;
    private int mTemplate = 1;

    @NonNull
    private final UseTorchAsFlash mUseTorchAsFlash;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i11, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i11;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        public static /* synthetic */ Object b(AePreCaptureTask aePreCaptureTask, CallbackToFutureAdapter.Completer completer) {
            aePreCaptureTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture(completer);
            aePreCaptureTask.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.u0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.AePreCaptureTask.b(Camera2CapturePipeline.AePreCaptureTask.this, completer);
                }
            })).transform(new Function() { // from class: androidx.camera.camera2.internal.v0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Boolean bool;
                    bool = Boolean.TRUE;
                    return bool;
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Integer num;
            int intValue;
            com.google.common.util.concurrent.p1<Boolean> immediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
                Logger.d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return immediateFuture;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {
        private final Executor mExecutor;
        private int mFlashMode;
        private final Pipeline mPipelineDelegate;

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i11) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i11;
        }

        public static /* synthetic */ Object a(CameraCapturePipelineImpl cameraCapturePipelineImpl, CallbackToFutureAdapter.Completer completer) {
            cameraCapturePipelineImpl.mPipelineDelegate.executePostCapture();
            completer.set(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void b(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public com.google.common.util.concurrent.p1<Void> invokePostCapture() {
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.w0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.a(Camera2CapturePipeline.CameraCapturePipelineImpl.this, completer);
                }
            });
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        @NonNull
        public com.google.common.util.concurrent.p1<Void> invokePreCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "invokePreCapture");
            return FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new Function() { // from class: androidx.camera.camera2.internal.x0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return Camera2CapturePipeline.CameraCapturePipelineImpl.b((TotalCaptureResult) obj);
                }
            }, this.mExecutor);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new AnonymousClass1();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        public class AnonymousClass1 implements PipelineTask {
            public AnonymousClass1() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            @NonNull
            public com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Function() { // from class: androidx.camera.camera2.internal.e1
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                        return valueOf;
                    }
                }, CameraXExecutors.directExecutor());
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i11, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, boolean z11, @NonNull OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i11;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z11;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        public static /* synthetic */ com.google.common.util.concurrent.p1 a(Pipeline pipeline, int i11, TotalCaptureResult totalCaptureResult) {
            pipeline.getClass();
            if (Camera2CapturePipeline.isFlashRequired(i11, totalCaptureResult)) {
                pipeline.setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return pipeline.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        @OptIn(markerClass = {ExperimentalCamera2Interop.class})
        private void applyAeModeQuirk(@NonNull CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(@NonNull CaptureConfig.Builder builder, @NonNull CaptureConfig captureConfig) {
            int i11 = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i11 != -1) {
                builder.setTemplateType(i11);
            }
        }

        public static /* synthetic */ com.google.common.util.concurrent.p1 d(Pipeline pipeline, Boolean bool) {
            pipeline.getClass();
            return Boolean.TRUE.equals(bool) ? Camera2CapturePipeline.waitForResult(pipeline.mTimeout3A, pipeline.mScheduler, pipeline.mCameraControl, new ResultListener.Checker() { // from class: androidx.camera.camera2.internal.d1
                @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                public final boolean check(TotalCaptureResult totalCaptureResult) {
                    boolean is3AConverged;
                    is3AConverged = Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
                    return is3AConverged;
                }
            }) : Futures.immediateFuture(null);
        }

        public static /* synthetic */ Object e(Pipeline pipeline, CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) {
            pipeline.getClass();
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i11) {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i11, @NonNull CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j11) {
            this.mTimeout3A = j11;
        }

        public void addTask(@NonNull PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        @NonNull
        public com.google.common.util.concurrent.p1<List<Void>> executeCapture(@NonNull final List<CaptureConfig> list, final int i11) {
            FutureChain transformAsync = FutureChain.from(executePreCapture(i11)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.z0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 submitConfigsInternal;
                    submitConfigsInternal = Camera2CapturePipeline.Pipeline.this.submitConfigsInternal(list, i11);
                    return submitConfigsInternal;
                }
            }, this.mExecutor);
            transformAsync.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.a1
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.Pipeline.this.executePostCapture();
                }
            }, this.mExecutor);
            return transformAsync;
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        @NonNull
        public com.google.common.util.concurrent.p1<TotalCaptureResult> executePreCapture(final int i11) {
            com.google.common.util.concurrent.p1<TotalCaptureResult> immediateFuture = Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return immediateFuture;
            }
            return FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.b1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.a(Camera2CapturePipeline.Pipeline.this, i11, (TotalCaptureResult) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.c1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.d(Camera2CapturePipeline.Pipeline.this, (Boolean) obj);
                }
            }, this.mExecutor);
        }

        @NonNull
        public com.google.common.util.concurrent.p1<List<Void>> submitConfigsInternal(@NonNull List<CaptureConfig> list, int i11) {
            ImageProxy dequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult retrieveCameraCaptureResult = (captureConfig.getTemplateType() != 5 || this.mCameraControl.getZslControl().isZslDisabledByFlashMode() || this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig() || (dequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer()) == null || !this.mCameraControl.getZslControl().enqueueImageToImageWriter(dequeueImageFromBuffer)) ? null : CameraCaptureResults.retrieveCameraCaptureResult(dequeueImageFromBuffer.getImageInfo());
                if (retrieveCameraCaptureResult != null) {
                    from.setCameraCaptureResult(retrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(from, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i11)) {
                    applyAeModeQuirk(from);
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.y0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CapturePipeline.Pipeline.e(Camera2CapturePipeline.Pipeline.this, from, completer);
                    }
                }));
                arrayList2.add(from.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        @NonNull
        com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final com.google.common.util.concurrent.p1<TotalCaptureResult> mFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.f1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CapturePipeline.ResultListener.a(Camera2CapturePipeline.ResultListener.this, completer);
            }
        });

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface Checker {
            boolean check(@NonNull TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(@Nullable Checker checker) {
            this.mChecker = checker;
        }

        public static /* synthetic */ Object a(ResultListener resultListener, CallbackToFutureAdapter.Completer completer) {
            resultListener.mCompleter = completer;
            return "waitFor3AResult";
        }

        @NonNull
        public com.google.common.util.concurrent.p1<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
            Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.set(totalCaptureResult);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScreenFlashTask implements PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduler;
        private final ImageCapture.ScreenFlash mScreenFlash;
        private final UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        public ScreenFlashTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        public static /* synthetic */ void a(ScreenFlashTask screenFlashTask, AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            screenFlashTask.mScreenFlash.apply(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (ImageCapture.ScreenFlashListener) atomicReference.get());
            completer.set(null);
        }

        public static /* synthetic */ com.google.common.util.concurrent.p1 e(final ScreenFlashTask screenFlashTask, Void r12) {
            screenFlashTask.getClass();
            return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.g1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.i(Camera2CapturePipeline.ScreenFlashTask.this, completer);
                }
            });
        }

        public static /* synthetic */ Object g(final ScreenFlashTask screenFlashTask, final AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            screenFlashTask.getClass();
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.camera2.internal.l1
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.ScreenFlashTask.a(Camera2CapturePipeline.ScreenFlashTask.this, atomicReference, completer);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void h(CallbackToFutureAdapter.Completer completer) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            completer.set(null);
        }

        public static /* synthetic */ Object i(ScreenFlashTask screenFlashTask, CallbackToFutureAdapter.Completer completer) {
            if (!screenFlashTask.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                completer.set(null);
                return "EnableTorchInternal";
            }
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            screenFlashTask.mCameraControl.enableTorchInternal(true);
            completer.set(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object k(AtomicReference atomicReference, final CallbackToFutureAdapter.Completer completer) {
            atomicReference.set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.n1
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    Camera2CapturePipeline.ScreenFlashTask.h(CallbackToFutureAdapter.Completer.this);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ com.google.common.util.concurrent.p1 m(ScreenFlashTask screenFlashTask, com.google.common.util.concurrent.p1 p1Var, Object obj) {
            screenFlashTask.getClass();
            return Futures.makeTimeoutFuture(TimeUnit.SECONDS.toMillis(3L), screenFlashTask.mScheduler, null, true, p1Var);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(false);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.j1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d(Camera2CapturePipeline.TAG, "enableExternalFlashAeMode disabled");
                }
            }, this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            ScheduledExecutorService mainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            final ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            Objects.requireNonNull(screenFlash);
            mainThreadExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCapture.ScreenFlash.this.clear();
                }
            });
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final com.google.common.util.concurrent.p1 future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.o1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.k(atomicReference, completer);
                }
            });
            return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.p1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return Camera2CapturePipeline.ScreenFlashTask.g(Camera2CapturePipeline.ScreenFlashTask.this, atomicReference, completer);
                }
            })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.q1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 enableExternalFlashAeMode;
                    enableExternalFlashAeMode = Camera2CapturePipeline.ScreenFlashTask.this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
                    return enableExternalFlashAeMode;
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.r1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.e(Camera2CapturePipeline.ScreenFlashTask.this, (Void) obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.s1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    return Camera2CapturePipeline.ScreenFlashTask.m(Camera2CapturePipeline.ScreenFlashTask.this, future, obj);
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.t1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 triggerAePrecapture;
                    triggerAePrecapture = Camera2CapturePipeline.ScreenFlashTask.this.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
                    return triggerAePrecapture;
                }
            }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.h1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.p1 apply(Object obj) {
                    com.google.common.util.concurrent.p1 waitForResult;
                    waitForResult = Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.ScreenFlashTask.CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, r0.mScheduler, Camera2CapturePipeline.ScreenFlashTask.this.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.m1
                        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                        public final boolean check(TotalCaptureResult totalCaptureResult2) {
                            boolean is3AConverged;
                            is3AConverged = Camera2CapturePipeline.is3AConverged(totalCaptureResult2, false);
                            return is3AConverged;
                        }
                    });
                    return waitForResult;
                }
            }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.i1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Boolean bool;
                    bool = Boolean.FALSE;
                    return bool;
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        public TorchTask(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, int i11, @NonNull Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z11) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i11;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z11;
        }

        public static /* synthetic */ com.google.common.util.concurrent.p1 a(TorchTask torchTask, Void r12) {
            return torchTask.mTriggerAePrecapture ? torchTask.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : Futures.immediateFuture(null);
        }

        public static /* synthetic */ Object b(TorchTask torchTask, CallbackToFutureAdapter.Completer completer) {
            torchTask.mCameraControl.getTorchControl().enableTorchInternal(completer, true);
            return "TorchOn";
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().enableTorchInternal(null, false);
                Logger.d(Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        @NonNull
        public com.google.common.util.concurrent.p1<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    Logger.d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.v1
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return Camera2CapturePipeline.TorchTask.b(Camera2CapturePipeline.TorchTask.this, completer);
                        }
                    })).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.w1
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final com.google.common.util.concurrent.p1 apply(Object obj) {
                            return Camera2CapturePipeline.TorchTask.a(Camera2CapturePipeline.TorchTask.this, (Void) obj);
                        }
                    }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.x1
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final com.google.common.util.concurrent.p1 apply(Object obj) {
                            com.google.common.util.concurrent.p1 waitForResult;
                            waitForResult = Camera2CapturePipeline.waitForResult(Camera2CapturePipeline.TorchTask.CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, r0.mScheduler, Camera2CapturePipeline.TorchTask.this.mCameraControl, new Camera2CapturePipeline.ResultListener.Checker() { // from class: androidx.camera.camera2.internal.u1
                                @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                                public final boolean check(TotalCaptureResult totalCaptureResult2) {
                                    boolean is3AConverged;
                                    is3AConverged = Camera2CapturePipeline.is3AConverged(totalCaptureResult2, true);
                                    return is3AConverged;
                                }
                            });
                            return waitForResult;
                        }
                    }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.y1
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            Boolean bool;
                            bool = Boolean.FALSE;
                            return bool;
                        }
                    }, CameraXExecutors.directExecutor());
                }
                Logger.d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(@NonNull Camera2CameraControlImpl camera2CameraControlImpl, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat, @NonNull Quirks quirks, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new r0(cameraCharacteristicsCompat));
    }

    public static boolean is3AConverged(@Nullable TotalCaptureResult totalCaptureResult, boolean z11) {
        if (totalCaptureResult == null) {
            return false;
        }
        return ConvergenceUtils.is3AConverged(new Camera2CameraCaptureResult(totalCaptureResult), z11);
    }

    public static boolean isFlashRequired(int i11, @Nullable TotalCaptureResult totalCaptureResult) {
        Logger.d(TAG, "isFlashRequired: flashMode = " + i11);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return false;
                }
                if (i11 != 3) {
                    throw new AssertionError(i11);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        Logger.d(TAG, "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    private boolean isTorchAsFlash(int i11) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i11 == 1;
    }

    @NonNull
    public static com.google.common.util.concurrent.p1<TotalCaptureResult> waitForResult(long j11, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        return Futures.makeTimeoutFuture(TimeUnit.NANOSECONDS.toMillis(j11), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    @VisibleForTesting
    public Pipeline createPipeline(int i11, int i12, int i13) {
        int i14;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i11 == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (i12 == 3) {
            pipeline.addTask(new ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        } else if (this.mHasFlashUnit) {
            if (isTorchAsFlash(i13)) {
                i14 = i12;
                pipeline.addTask(new TorchTask(this.mCameraControl, i14, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
            } else {
                i14 = i12;
                pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i14, overrideAeModeForStillCapture));
            }
            Logger.d(TAG, "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + pipeline.mTasks);
            return pipeline;
        }
        i14 = i12;
        Logger.d(TAG, "createPipeline: captureMode = " + i11 + ", flashMode = " + i14 + ", flashType = " + i13 + ", pipeline tasks = " + pipeline.mTasks);
        return pipeline;
    }

    @NonNull
    public CameraCapturePipeline getCameraCapturePipeline(int i11, int i12, int i13) {
        return new CameraCapturePipelineImpl(createPipeline(i11, i12, i13), this.mExecutor, i12);
    }

    public void setTemplate(int i11) {
        this.mTemplate = i11;
    }

    @NonNull
    public com.google.common.util.concurrent.p1<List<Void>> submitStillCaptures(@NonNull List<CaptureConfig> list, int i11, int i12, int i13) {
        return Futures.nonCancellationPropagating(createPipeline(i11, i12, i13).executeCapture(list, i12));
    }

    @NonNull
    public static com.google.common.util.concurrent.p1<TotalCaptureResult> waitForResult(@NonNull final Camera2CameraControlImpl camera2CameraControlImpl, @Nullable ResultListener.Checker checker) {
        final ResultListener resultListener = new ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        com.google.common.util.concurrent.p1<TotalCaptureResult> future = resultListener.getFuture();
        future.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraControlImpl.this.removeCaptureResultListener(resultListener);
            }
        }, camera2CameraControlImpl.mExecutor);
        return future;
    }
}
