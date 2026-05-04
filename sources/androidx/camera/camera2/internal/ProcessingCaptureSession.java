package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.OutputSurfaceConfiguration;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
/* loaded from: classes.dex */
final class ProcessingCaptureSession implements CaptureSessionInterface {
    private static final String TAG = "ProcessingCaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private static List<DeferrableSurface> sHeldProcessorSurfaces = new ArrayList();
    private static int sNextInstanceId = 0;
    private final Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private final CaptureSession mCaptureSession;
    final Executor mExecutor;
    private int mInstanceId;

    @Nullable
    private SessionConfig mProcessorSessionConfig;
    private ProcessorState mProcessorState;

    @Nullable
    private Camera2RequestProcessor mRequestProcessor;
    private final ScheduledExecutorService mScheduledExecutorService;

    @Nullable
    private SessionConfig mSessionConfig;
    private final SessionProcessor mSessionProcessor;
    private final SessionProcessorCaptureCallback mSessionProcessorCaptureCallback;
    private List<DeferrableSurface> mOutputSurfaces = new ArrayList();

    @Nullable
    private volatile List<CaptureConfig> mPendingCaptureConfigs = null;
    private CaptureRequestOptions mSessionOptions = new CaptureRequestOptions.Builder().build();
    private CaptureRequestOptions mStillCaptureOptions = new CaptureRequestOptions.Builder().build();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CaptureCallbackAdapter implements SessionProcessor.CaptureCallback {
        private List<CameraCaptureCallback> mCameraCaptureCallbacks;
        private final int mCaptureConfigId;
        private CameraCaptureResult mCaptureResult;

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j11, int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
            this.mCaptureResult = cameraCaptureResult;
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(this.mCaptureConfigId, new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessProgressed(int i11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(this.mCaptureConfigId, i11);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i11) {
            CameraCaptureResult cameraCaptureResult = this.mCaptureResult;
            if (cameraCaptureResult == null) {
                cameraCaptureResult = new CameraCaptureResult.EmptyCameraCaptureResult();
            }
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(this.mCaptureConfigId, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i11, long j11) {
            Iterator<CameraCaptureCallback> it = this.mCameraCaptureCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(this.mCaptureConfigId);
            }
        }

        private CaptureCallbackAdapter(int i11, List<CameraCaptureCallback> list) {
            this.mCaptureResult = null;
            this.mCaptureConfigId = i11;
            this.mCameraCaptureCallbacks = list;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public ProcessingCaptureSession(@NonNull SessionProcessor sessionProcessor, @NonNull Camera2CameraInfoImpl camera2CameraInfoImpl, @NonNull DynamicRangesCompat dynamicRangesCompat, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.mInstanceId = 0;
        this.mCaptureSession = new CaptureSession(dynamicRangesCompat, DeviceQuirks.get(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.mSessionProcessor = sessionProcessor;
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
        this.mProcessorState = ProcessorState.UNINITIALIZED;
        this.mSessionProcessorCaptureCallback = new SessionProcessorCaptureCallback();
        int i11 = sNextInstanceId;
        sNextInstanceId = i11 + 1;
        this.mInstanceId = i11;
        Logger.d(TAG, "New ProcessingCaptureSession (id=" + this.mInstanceId + pn.j.f81007d);
    }

    public static /* synthetic */ Void a(ProcessingCaptureSession processingCaptureSession, Void r12) {
        processingCaptureSession.onConfigured(processingCaptureSession.mCaptureSession);
        return null;
    }

    public static /* synthetic */ void c(ProcessingCaptureSession processingCaptureSession, DeferrableSurface deferrableSurface) {
        DeferrableSurfaces.decrementAll(processingCaptureSession.mOutputSurfaces);
        if (deferrableSurface != null) {
            deferrableSurface.decrementUseCount();
        }
    }

    private static void cancelRequests(@NonNull List<CaptureConfig> list) {
        for (CaptureConfig captureConfig : list) {
            Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(captureConfig.getId());
            }
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.p1 d(final ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener, List list) {
        OutputSurface outputSurface;
        processingCaptureSession.getClass();
        Logger.d(TAG, "-- getSurfaces done, start init (id=" + processingCaptureSession.mInstanceId + pn.j.f81007d);
        if (processingCaptureSession.mProcessorState == ProcessorState.DE_INITIALIZED) {
            return Futures.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final DeferrableSurface deferrableSurface = null;
        if (list.contains(null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.getSurfaces().get(list.indexOf(null))));
        }
        OutputSurface outputSurface2 = null;
        OutputSurface outputSurface3 = null;
        OutputSurface outputSurface4 = null;
        for (int i11 = 0; i11 < sessionConfig.getSurfaces().size(); i11++) {
            DeferrableSurface deferrableSurface2 = sessionConfig.getSurfaces().get(i11);
            if (isPreview(deferrableSurface2) || isStreamSharing(deferrableSurface2)) {
                outputSurface2 = OutputSurface.create(deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            } else if (isImageCapture(deferrableSurface2)) {
                outputSurface3 = OutputSurface.create(deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            } else if (isImageAnalysis(deferrableSurface2)) {
                outputSurface4 = OutputSurface.create(deferrableSurface2.getSurface().get(), deferrableSurface2.getPrescribedSize(), deferrableSurface2.getPrescribedStreamFormat());
            }
        }
        if (sessionConfig.getPostviewOutputConfig() != null) {
            deferrableSurface = sessionConfig.getPostviewOutputConfig().getSurface();
            outputSurface = OutputSurface.create(deferrableSurface.getSurface().get(), deferrableSurface.getPrescribedSize(), deferrableSurface.getPrescribedStreamFormat());
        } else {
            outputSurface = null;
        }
        processingCaptureSession.mProcessorState = ProcessorState.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(processingCaptureSession.mOutputSurfaces);
            if (deferrableSurface != null) {
                arrayList.add(deferrableSurface);
            }
            DeferrableSurfaces.incrementAll(arrayList);
            Logger.w(TAG, "== initSession (id=" + processingCaptureSession.mInstanceId + pn.j.f81007d);
            try {
                SessionConfig initSession = processingCaptureSession.mSessionProcessor.initSession(processingCaptureSession.mCamera2CameraInfoImpl, OutputSurfaceConfiguration.create(outputSurface2, outputSurface3, outputSurface4, outputSurface));
                processingCaptureSession.mProcessorSessionConfig = initSession;
                initSession.getSurfaces().get(0).getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.f3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingCaptureSession.c(ProcessingCaptureSession.this, deferrableSurface);
                    }
                }, CameraXExecutors.directExecutor());
                for (final DeferrableSurface deferrableSurface3 : processingCaptureSession.mProcessorSessionConfig.getSurfaces()) {
                    sHeldProcessorSurfaces.add(deferrableSurface3);
                    deferrableSurface3.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.g3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessingCaptureSession.sHeldProcessorSurfaces.remove(DeferrableSurface.this);
                        }
                    }, processingCaptureSession.mExecutor);
                }
                SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
                validatingBuilder.add(sessionConfig);
                validatingBuilder.clearSurfaces();
                validatingBuilder.add(processingCaptureSession.mProcessorSessionConfig);
                Preconditions.checkArgument(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.p1<Void> open = processingCaptureSession.mCaptureSession.open(validatingBuilder.build(), (CameraDevice) Preconditions.checkNotNull(cameraDevice), opener);
                Futures.addCallback(open, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.ProcessingCaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(@NonNull Throwable th2) {
                        Logger.e(ProcessingCaptureSession.TAG, "open session failed ", th2);
                        ProcessingCaptureSession.this.close();
                        ProcessingCaptureSession.this.release(false);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(@Nullable Void r12) {
                    }
                }, processingCaptureSession.mExecutor);
                return open;
            } catch (Throwable th2) {
                Logger.e(TAG, "initSession failed", th2);
                DeferrableSurfaces.decrementAll(processingCaptureSession.mOutputSurfaces);
                if (deferrableSurface != null) {
                    deferrableSurface.decrementUseCount();
                }
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e11) {
            return Futures.immediateFailedFuture(e11);
        }
    }

    public static /* synthetic */ void e(ProcessingCaptureSession processingCaptureSession) {
        processingCaptureSession.getClass();
        Logger.d(TAG, "== deInitSession (id=" + processingCaptureSession.mInstanceId + pn.j.f81007d);
        processingCaptureSession.mSessionProcessor.deInitSession();
    }

    private static List<SessionProcessorSurface> getSessionProcessorSurfaceList(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Preconditions.checkArgument(deferrableSurface instanceof SessionProcessorSurface, "Surface must be SessionProcessorSurface");
            arrayList.add((SessionProcessorSurface) deferrableSurface);
        }
        return arrayList;
    }

    private static boolean hasPreviewSurface(@NonNull CaptureConfig captureConfig) {
        for (DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            if (isPreview(deferrableSurface) || isStreamSharing(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isImageAnalysis(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), ImageAnalysis.class);
    }

    private static boolean isImageCapture(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), ImageCapture.class);
    }

    private static boolean isPreview(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), Preview.class);
    }

    private static boolean isStreamSharing(@NonNull DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.getContainerClass(), StreamSharing.class);
    }

    private boolean isTemplateTypeForStillCapture(int i11) {
        return i11 == 2 || i11 == 4;
    }

    private void updateParameters(@NonNull CaptureRequestOptions captureRequestOptions, @NonNull CaptureRequestOptions captureRequestOptions2) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.mSessionProcessor.setParameters(builder.build());
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        Logger.d(TAG, "cancelIssuedCaptureRequests (id=" + this.mInstanceId + pn.j.f81007d);
        if (this.mPendingCaptureConfigs != null) {
            for (CaptureConfig captureConfig : this.mPendingCaptureConfigs) {
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        Logger.d(TAG, "close (id=" + this.mInstanceId + ") state=" + this.mProcessorState);
        if (this.mProcessorState == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            Logger.d(TAG, "== onCaptureSessionEnd (id = " + this.mInstanceId + pn.j.f81007d);
            this.mSessionProcessor.onCaptureSessionEnd();
            Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.close();
            }
            this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.mCaptureSession.close();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public List<CaptureConfig> getCaptureConfigs() {
        return this.mPendingCaptureConfigs != null ? this.mPendingCaptureConfigs : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @Nullable
    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        return this.mCaptureSession.isInOpenState();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(@NonNull List<CaptureConfig> list) {
        if (list.isEmpty()) {
            return;
        }
        Logger.d(TAG, "issueCaptureRequests (id=" + this.mInstanceId + ") + state =" + this.mProcessorState);
        int ordinal = this.mProcessorState.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.mPendingCaptureConfigs == null) {
                this.mPendingCaptureConfigs = list;
                return;
            } else {
                cancelRequests(list);
                Logger.d(TAG, "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (ordinal == 2) {
            for (CaptureConfig captureConfig : list) {
                if (isTemplateTypeForStillCapture(captureConfig.getTemplateType())) {
                    issueStillCaptureRequest(captureConfig);
                } else {
                    issueTriggerRequest(captureConfig);
                }
            }
            return;
        }
        if (ordinal == 3 || ordinal == 4) {
            Logger.d(TAG, "Run issueCaptureRequests in wrong state, state = " + this.mProcessorState);
            cancelRequests(list);
        }
    }

    public void issueStillCaptureRequest(@NonNull CaptureConfig captureConfig) {
        CaptureRequestOptions.Builder from = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions());
        Config implementationOptions = captureConfig.getImplementationOptions();
        Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
        if (implementationOptions.containsOption(option)) {
            from.setCaptureRequestOption(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.getImplementationOptions().retrieveOption(option));
        }
        Config implementationOptions2 = captureConfig.getImplementationOptions();
        Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
        if (implementationOptions2.containsOption(option2)) {
            from.setCaptureRequestOption(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
        }
        CaptureRequestOptions build = from.build();
        this.mStillCaptureOptions = build;
        updateParameters(this.mSessionOptions, build);
        this.mSessionProcessor.startCapture(captureConfig.isPostviewEnabled(), captureConfig.getTagBundle(), new CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
    }

    public void issueTriggerRequest(@NonNull CaptureConfig captureConfig) {
        Logger.d(TAG, "issueTriggerRequest");
        CaptureRequestOptions build = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions()).build();
        Iterator<Config.Option<?>> it = build.listOptions().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().getToken();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.mSessionProcessor.startTrigger(build, captureConfig.getTagBundle(), new CaptureCallbackAdapter(captureConfig.getId(), captureConfig.getCameraCaptureCallbacks()));
                return;
            }
        }
        cancelRequests(Arrays.asList(captureConfig));
    }

    public void onConfigured(@NonNull CaptureSession captureSession) {
        if (this.mProcessorState != ProcessorState.SESSION_INITIALIZED) {
            return;
        }
        this.mRequestProcessor = new Camera2RequestProcessor(captureSession, getSessionProcessorSurfaceList(this.mProcessorSessionConfig.getSurfaces()));
        Logger.d(TAG, "== onCaptureSessinStarted (id = " + this.mInstanceId + pn.j.f81007d);
        this.mSessionProcessor.onCaptureSessionStart(this.mRequestProcessor);
        this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.mSessionConfig;
        if (sessionConfig != null) {
            setSessionConfig(sessionConfig);
        }
        if (this.mPendingCaptureConfigs != null) {
            issueCaptureRequests(this.mPendingCaptureConfigs);
            this.mPendingCaptureConfigs = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public com.google.common.util.concurrent.p1<Void> open(@NonNull final SessionConfig sessionConfig, @NonNull final CameraDevice cameraDevice, @NonNull final SynchronizedCaptureSession.Opener opener) {
        Preconditions.checkArgument(this.mProcessorState == ProcessorState.UNINITIALIZED, "Invalid state state:" + this.mProcessorState);
        Preconditions.checkArgument(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.d(TAG, "open (id=" + this.mInstanceId + pn.j.f81007d);
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.mOutputSurfaces = surfaces;
        return FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, 5000L, this.mExecutor, this.mScheduledExecutorService)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.d3
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.p1 apply(Object obj) {
                return ProcessingCaptureSession.d(ProcessingCaptureSession.this, sessionConfig, cameraDevice, opener, (List) obj);
            }
        }, this.mExecutor).transform(new Function() { // from class: androidx.camera.camera2.internal.e3
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessingCaptureSession.a(ProcessingCaptureSession.this, (Void) obj);
            }
        }, this.mExecutor);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public com.google.common.util.concurrent.p1<Void> release(boolean z11) {
        Logger.d(TAG, "release (id=" + this.mInstanceId + ") mProcessorState=" + this.mProcessorState);
        com.google.common.util.concurrent.p1<Void> release = this.mCaptureSession.release(z11);
        int ordinal = this.mProcessorState.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            release.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.c3
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessingCaptureSession.e(ProcessingCaptureSession.this);
                }
            }, CameraXExecutors.directExecutor());
        }
        this.mProcessorState = ProcessorState.DE_INITIALIZED;
        return release;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(@Nullable SessionConfig sessionConfig) {
        Logger.d(TAG, "setSessionConfig (id=" + this.mInstanceId + pn.j.f81007d);
        this.mSessionConfig = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
        if (camera2RequestProcessor != null) {
            camera2RequestProcessor.updateSessionConfig(sessionConfig);
        }
        if (this.mProcessorState == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            CaptureRequestOptions build = CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions()).build();
            this.mSessionOptions = build;
            updateParameters(build, this.mStillCaptureOptions);
            if (hasPreviewSurface(sessionConfig.getRepeatingCaptureConfig())) {
                this.mSessionProcessor.startRepeating(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), this.mSessionProcessorCaptureCallback);
            } else {
                this.mSessionProcessor.stopRepeating();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SessionProcessorCaptureCallback implements SessionProcessor.CaptureCallback {
        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureFailed(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureProcessStarted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceAborted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureSequenceCompleted(int i11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureStarted(int i11, long j11) {
        }

        @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
        public void onCaptureCompleted(long j11, int i11, @NonNull CameraCaptureResult cameraCaptureResult) {
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(@NonNull Map<DeferrableSurface, Long> map) {
    }
}
