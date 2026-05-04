package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private final boolean mCanUseMultiResolutionImageReader;

    @GuardedBy("mSessionLock")
    private final List<CaptureConfig> mCaptureConfigs;

    @GuardedBy("mSessionLock")
    private final StateCallback mCaptureSessionStateCallback;

    @GuardedBy("mSessionLock")
    List<DeferrableSurface> mConfiguredDeferrableSurfaces;

    @GuardedBy("mSessionLock")
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    private final DynamicRangesCompat mDynamicRangesCompat;

    @GuardedBy("mSessionLock")
    CallbackToFutureAdapter.Completer<Void> mReleaseCompleter;

    @GuardedBy("mSessionLock")
    com.google.common.util.concurrent.p1<Void> mReleaseFuture;
    private final RequestMonitor mRequestMonitor;

    @Nullable
    @GuardedBy("mSessionLock")
    SessionConfig mSessionConfig;
    final Object mSessionLock;

    @Nullable
    @GuardedBy("mSessionLock")
    SynchronizedCaptureSession.Opener mSessionOpener;

    @GuardedBy("mSessionLock")
    State mState;
    private final StillCaptureFlow mStillCaptureFlow;

    @NonNull
    @GuardedBy("mSessionLock")
    private Map<DeferrableSurface, Long> mStreamUseCaseMap;

    @Nullable
    @GuardedBy("mSessionLock")
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    private final TemplateParamsOverride mTemplateParamsOverride;
    private final TorchStateReset mTorchStateReset;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            CaptureSession.this.finishClose();
                            break;
                        case RELEASED:
                            Logger.d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    Logger.e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                        case OPENING:
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.mState = State.OPENED;
                            captureSession.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            Logger.d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                            CaptureSession captureSession2 = CaptureSession.this;
                            captureSession2.issueRepeatingCaptureRequests(captureSession2.mSessionConfig);
                            CaptureSession.this.issuePendingCaptureRequest();
                            break;
                        case CLOSED:
                            CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            break;
                        case RELEASING:
                            synchronizedCaptureSession.close();
                            break;
                    }
                    Logger.d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* renamed from: onSessionFinished */
        public void e(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState == State.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.d(CaptureSession.TAG, "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CaptureSession(@NonNull DynamicRangesCompat dynamicRangesCompat) {
        this(dynamicRangesCompat, false);
    }

    public static /* synthetic */ void a(CaptureSession captureSession) {
        synchronized (captureSession.mSessionLock) {
            if (captureSession.mCaptureConfigs.isEmpty()) {
                return;
            }
            try {
                captureSession.issueBurstCaptureRequest(captureSession.mCaptureConfigs);
            } finally {
                captureSession.mCaptureConfigs.clear();
            }
        }
    }

    public static /* synthetic */ Object b(CaptureSession captureSession, CallbackToFutureAdapter.Completer completer) {
        String str;
        synchronized (captureSession.mSessionLock) {
            Preconditions.checkState(captureSession.mReleaseCompleter == null, "Release completer expected to be null");
            captureSession.mReleaseCompleter = completer;
            str = "Release[session=" + captureSession + "]";
        }
        return str;
    }

    @GuardedBy("mSessionLock")
    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<CameraCaptureCallback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    @Nullable
    @RequiresApi(35)
    @SuppressLint({"BanUncheckedReflection"})
    private static List<OutputConfiguration> createInstancesForMultiResolutionOutput(@NonNull List<MultiResolutionStreamInfo> list, int i11) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i11));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
            Logger.e(TAG, "Failed to create instances for multi-resolution output, " + e11.getMessage());
            return null;
        }
    }

    @NonNull
    @RequiresApi(35)
    private static Map<SessionConfig.OutputConfig, OutputConfigurationCompat> createMultiResolutionOutputConfigurationCompats(@NonNull Map<Integer, List<SessionConfig.OutputConfig>> map, @NonNull Map<DeferrableSurface, Surface> map2) {
        HashMap hashMap = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (SessionConfig.OutputConfig outputConfig : map.get(num)) {
                SurfaceUtil.SurfaceInfo surfaceInfo = SurfaceUtil.getSurfaceInfo(map2.get(outputConfig.getSurface()));
                if (i11 == 0) {
                    i11 = surfaceInfo.format;
                }
                b2.a();
                int i12 = surfaceInfo.width;
                int i13 = surfaceInfo.height;
                String physicalCameraId = outputConfig.getPhysicalCameraId();
                Objects.requireNonNull(physicalCameraId);
                arrayList.add(a2.a(i12, i13, physicalCameraId));
            }
            if (i11 == 0 || arrayList.isEmpty()) {
                Logger.e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i11 + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> createInstancesForMultiResolutionOutput = createInstancesForMultiResolutionOutput(arrayList, i11);
                if (createInstancesForMultiResolutionOutput != null) {
                    for (SessionConfig.OutputConfig outputConfig2 : map.get(num)) {
                        OutputConfiguration remove = createInstancesForMultiResolutionOutput.remove(0);
                        remove.addSurface(map2.get(outputConfig2.getSurface()));
                        hashMap.put(outputConfig2, new OutputConfigurationCompat(remove));
                    }
                }
            }
        }
        return hashMap;
    }

    public static /* synthetic */ void d(CaptureSession captureSession, CameraCaptureSession cameraCaptureSession, int i11, boolean z11) {
        synchronized (captureSession.mSessionLock) {
            try {
                if (captureSession.mState == State.OPENED) {
                    captureSession.issueRepeatingCaptureRequests(captureSession.mSessionConfig);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private OutputConfigurationCompat getOutputConfigurationCompat(@NonNull SessionConfig.OutputConfig outputConfig, @NonNull Map<DeferrableSurface, Surface> map, @Nullable String str) {
        long j11;
        DynamicRangeProfiles dynamicRangeProfiles;
        Surface surface = map.get(outputConfig.getSurface());
        Preconditions.checkNotNull(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (outputConfig.getMirrorMode() == 0) {
            outputConfigurationCompat.setMirrorMode(1);
        } else if (outputConfig.getMirrorMode() == 1) {
            outputConfigurationCompat.setMirrorMode(2);
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            Iterator<DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                Preconditions.checkNotNull(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = this.mDynamicRangesCompat.toDynamicRangeProfiles()) != null) {
            DynamicRange dynamicRange = outputConfig.getDynamicRange();
            Long dynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (dynamicRangeToFirstSupportedProfile != null) {
                j11 = dynamicRangeToFirstSupportedProfile.longValue();
                outputConfigurationCompat.setDynamicRangeProfile(j11);
                return outputConfigurationCompat;
            }
            Logger.e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
        }
        j11 = 1;
        outputConfigurationCompat.setDynamicRangeProfile(j11);
        return outputConfigurationCompat;
    }

    @NonNull
    private List<OutputConfigurationCompat> getUniqueOutputConfigurations(@NonNull List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    @NonNull
    private static Map<Integer, List<SessionConfig.OutputConfig>> groupMrirOutputConfigs(@NonNull Collection<SessionConfig.OutputConfig> collection) {
        HashMap hashMap = new HashMap();
        for (SessionConfig.OutputConfig outputConfig : collection) {
            if (outputConfig.getSurfaceGroupId() > 0 && outputConfig.getSharedSurfaces().isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(outputConfig.getSurfaceGroupId()));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(outputConfig.getSurfaceGroupId()), list);
                }
                list.add(outputConfig);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.intValue();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public com.google.common.util.concurrent.p1<Void> openCaptureSession(@NonNull List<Surface> list, @NonNull SessionConfig sessionConfig, @NonNull CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            try {
                int ordinal = this.mState.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        this.mConfiguredSurfaceMap.clear();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i11), list.get(i11));
                        }
                        this.mState = State.OPENING;
                        Logger.d(TAG, "Opening capture session.");
                        SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                        CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                        Map hashMap = new HashMap();
                        if (this.mCanUseMultiResolutionImageReader && Build.VERSION.SDK_INT >= 35) {
                            hashMap = createMultiResolutionOutputConfigurationCompats(groupMrirOutputConfigs(sessionConfig.getOutputConfigs()), this.mConfiguredSurfaceMap);
                        }
                        ArrayList arrayList = new ArrayList();
                        String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                        for (SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                            OutputConfigurationCompat outputConfigurationCompat = (!this.mCanUseMultiResolutionImageReader || Build.VERSION.SDK_INT < 35) ? null : (OutputConfigurationCompat) hashMap.get(outputConfig);
                            if (outputConfigurationCompat == null) {
                                outputConfigurationCompat = getOutputConfigurationCompat(outputConfig, this.mConfiguredSurfaceMap, physicalCameraId);
                                if (this.mStreamUseCaseMap.containsKey(outputConfig.getSurface())) {
                                    outputConfigurationCompat.setStreamUseCase(this.mStreamUseCaseMap.get(outputConfig.getSurface()).longValue());
                                }
                            }
                            arrayList.add(outputConfigurationCompat);
                        }
                        SessionConfigurationCompat createSessionConfigurationCompat = this.mSessionOpener.createSessionConfigurationCompat(sessionConfig.getSessionType(), getUniqueOutputConfigurations(arrayList), createComboCallback);
                        if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                            createSessionConfigurationCompat.setInputConfiguration(InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                        }
                        try {
                            CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice, this.mTemplateParamsOverride);
                            if (buildWithoutTarget != null) {
                                createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                            }
                            return this.mSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                        } catch (CameraAccessException e11) {
                            return Futures.immediateFailedFuture(e11);
                        }
                    }
                    if (ordinal != 4) {
                        return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                    }
                }
                return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                try {
                    this.mSynchronizedCaptureSession.abortCaptures();
                } catch (CameraAccessException e11) {
                    Logger.e(TAG, "Unable to abort captures.", e11);
                }
            } else {
                Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            try {
                if (this.mCaptureConfigs.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.mCaptureConfigs);
                    this.mCaptureConfigs.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig captureConfig : arrayList) {
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            try {
                int ordinal = this.mState.ordinal();
                if (ordinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.mState);
                }
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSessionOpener.stop();
                    } else if (ordinal == 3 || ordinal == 4) {
                        Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSessionOpener.stop();
                        this.mState = State.CLOSED;
                        this.mRequestMonitor.stop();
                        this.mSessionConfig = null;
                    }
                }
                this.mState = State.RELEASED;
            } finally {
            }
        }
    }

    @GuardedBy("mSessionLock")
    public void finishClose() {
        State state = this.mState;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = state2;
        this.mSynchronizedCaptureSession = null;
        CallbackToFutureAdapter.Completer<Void> completer = this.mReleaseCompleter;
        if (completer != null) {
            completer.set(null);
            this.mReleaseCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @Nullable
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        boolean z11;
        synchronized (this.mSessionLock) {
            try {
                State state = this.mState;
                z11 = state == State.OPENED || state == State.OPENING;
            } finally {
            }
        }
        return z11;
    }

    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList;
        boolean z11;
        synchronized (this.mSessionLock) {
            try {
                if (this.mState != State.OPENED) {
                    Logger.d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                    arrayList = new ArrayList();
                    Logger.d(TAG, "Issuing capture request.");
                    z11 = false;
                    for (CaptureConfig captureConfig : list) {
                        if (captureConfig.getSurfaces().isEmpty()) {
                            Logger.d(TAG, "Skipping issuing empty capture request.");
                        } else {
                            Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    DeferrableSurface next = it.next();
                                    if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                        Logger.d(TAG, "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (captureConfig.getTemplateType() == 2) {
                                        z11 = true;
                                    }
                                    CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                                    if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                        from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                    }
                                    SessionConfig sessionConfig = this.mSessionConfig;
                                    if (sessionConfig != null) {
                                        from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                    }
                                    from.addImplementationOptions(captureConfig.getImplementationOptions());
                                    CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, false, this.mTemplateParamsOverride);
                                    if (build == null) {
                                        Logger.d(TAG, "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<CameraCaptureCallback> it2 = captureConfig.getCameraCaptureCallbacks().iterator();
                                    while (it2.hasNext()) {
                                        CaptureCallbackConverter.toCaptureCallback(it2.next(), arrayList2);
                                    }
                                    cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                                    arrayList.add(build);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e11) {
                    Logger.e(TAG, "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z11)) {
                    this.mSynchronizedCaptureSession.stopRepeating();
                    cameraBurstCaptureCallback.setCaptureSequenceCallback(new CameraBurstCaptureCallback.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.c2
                        @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
                        public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i11, boolean z12) {
                            CaptureSession.d(CaptureSession.this, cameraCaptureSession, i11, z12);
                        }
                    });
                }
                if (this.mTorchStateReset.isTorchResetRequired(arrayList, z11)) {
                    cameraBurstCaptureCallback.addCamera2Callbacks((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                            synchronized (CaptureSession.this.mSessionLock) {
                                try {
                                    SessionConfig sessionConfig2 = CaptureSession.this.mSessionConfig;
                                    if (sessionConfig2 == null) {
                                        return;
                                    }
                                    CaptureConfig repeatingCaptureConfig = sessionConfig2.getRepeatingCaptureConfig();
                                    Logger.d(CaptureSession.TAG, "Submit FLASH_MODE_OFF request");
                                    CaptureSession captureSession = CaptureSession.this;
                                    captureSession.issueCaptureRequests(Collections.singletonList(captureSession.mTorchStateReset.createTorchResetRequest(repeatingCaptureConfig)));
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }));
                }
                return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(@NonNull List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mCaptureConfigs.addAll(list);
                        break;
                    case OPENED:
                        this.mCaptureConfigs.addAll(list);
                        issuePendingCaptureRequest();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @GuardedBy("mSessionLock")
    public void issuePendingCaptureRequest() {
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.f2
            @Override // java.lang.Runnable
            public final void run() {
                CaptureSession.a(CaptureSession.this);
            }
        }, CameraXExecutors.directExecutor());
    }

    public int issueRepeatingCaptureRequests(@Nullable SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (sessionConfig == null) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.mState != State.OPENED) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e11) {
                    Logger.e(TAG, "Unable to access camera: " + e11.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                Logger.d(TAG, "Issuing request for session.");
                CaptureRequest build = Camera2CaptureRequestBuilder.build(repeatingCaptureConfig, this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, true, this.mTemplateParamsOverride);
                if (build == null) {
                    Logger.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, this.mRequestMonitor.createMonitorListener(createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e12) {
                Logger.e(TAG, "Unable to access camera: " + e12.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th2;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public com.google.common.util.concurrent.p1<Void> open(@NonNull final SessionConfig sessionConfig, @NonNull final CameraDevice cameraDevice, @NonNull SynchronizedCaptureSession.Opener opener) {
        synchronized (this.mSessionLock) {
            try {
                if (this.mState.ordinal() == 1) {
                    this.mState = State.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                    this.mConfiguredDeferrableSurfaces = arrayList;
                    this.mSessionOpener = opener;
                    FutureChain transformAsync = FutureChain.from(opener.startWithDeferrableSurface(arrayList, 5000L)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.e2
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final com.google.common.util.concurrent.p1 apply(Object obj) {
                            com.google.common.util.concurrent.p1 openCaptureSession;
                            openCaptureSession = CaptureSession.this.openCaptureSession((List) obj, sessionConfig, cameraDevice);
                            return openCaptureSession;
                        }
                    }, this.mSessionOpener.getExecutor());
                    Futures.addCallback(transformAsync, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onFailure(@NonNull Throwable th2) {
                            synchronized (CaptureSession.this.mSessionLock) {
                                try {
                                    CaptureSession.this.mSessionOpener.stop();
                                    int ordinal = CaptureSession.this.mState.ordinal();
                                    if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th2 instanceof CancellationException)) {
                                        Logger.w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th2);
                                        CaptureSession.this.finishClose();
                                    }
                                } finally {
                                }
                            }
                        }

                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onSuccess(@Nullable Void r12) {
                        }
                    }, this.mSessionOpener.getExecutor());
                    return Futures.nonCancellationPropagating(transformAsync);
                }
                Logger.e(TAG, "Open not allowed in state: " + this.mState);
                return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    @NonNull
    public com.google.common.util.concurrent.p1<Void> release(boolean z11) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.mState);
                case GET_SURFACE:
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                case INITIALIZED:
                    this.mState = State.RELEASED;
                    return Futures.immediateFuture(null);
                case OPENED:
                case CLOSED:
                    SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
                    if (synchronizedCaptureSession != null) {
                        if (z11) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (CameraAccessException e11) {
                                Logger.e(TAG, "Unable to abort captures.", e11);
                            }
                        }
                        this.mSynchronizedCaptureSession.close();
                    }
                case OPENING:
                    this.mState = State.RELEASING;
                    this.mRequestMonitor.stop();
                    Preconditions.checkNotNull(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSessionOpener.stop()) {
                        finishClose();
                        return Futures.immediateFuture(null);
                    }
                case RELEASING:
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.d2
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return CaptureSession.b(CaptureSession.this, completer);
                            }
                        });
                    }
                    return this.mReleaseFuture;
                default:
                    return Futures.immediateFuture(null);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(@Nullable SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mSessionConfig = sessionConfig;
                        break;
                    case OPENED:
                        this.mSessionConfig = sessionConfig;
                        if (sessionConfig != null) {
                            if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                                Logger.e(TAG, "Does not have the proper configured lists");
                                return;
                            } else {
                                Logger.d(TAG, "Attempting to submit CaptureRequest after setting");
                                issueRepeatingCaptureRequests(this.mSessionConfig);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(@NonNull Map<DeferrableSurface, Long> map) {
        synchronized (this.mSessionLock) {
            this.mStreamUseCaseMap = map;
        }
    }

    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e11) {
                    Logger.e(TAG, "Unable to stop repeating.", e11);
                }
            } else {
                Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
            }
        }
    }

    public CaptureSession(@NonNull DynamicRangesCompat dynamicRangesCompat, boolean z11) {
        this(dynamicRangesCompat, new Quirks(Collections.EMPTY_LIST), z11);
    }

    public CaptureSession(@NonNull DynamicRangesCompat dynamicRangesCompat, @NonNull Quirks quirks) {
        this(dynamicRangesCompat, quirks, false);
    }

    public CaptureSession(@NonNull DynamicRangesCompat dynamicRangesCompat, @NonNull Quirks quirks, boolean z11) {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.EMPTY_LIST;
        this.mState = State.UNINITIALIZED;
        this.mStreamUseCaseMap = new HashMap();
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mTorchStateReset = new TorchStateReset();
        this.mState = State.INITIALIZED;
        this.mDynamicRangesCompat = dynamicRangesCompat;
        this.mCaptureSessionStateCallback = new StateCallback();
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureNoResponseQuirk.class));
        this.mTemplateParamsOverride = new TemplateParamsOverride(quirks);
        this.mCanUseMultiResolutionImageReader = z11;
    }
}
