package androidx.camera.lifecycle;

import a00.a0;
import a00.h0;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ExperimentalCameraInfo;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w0;
import m80.k;
import m80.l;
import w00.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nProcessCameraProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider\n+ 2 Trace.kt\nandroidx/tracing/TraceKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,995:1\n27#2,5:996\n27#2,3:1001\n31#2:1006\n27#2,3:1007\n31#2:1016\n27#2,3:1017\n31#2:1022\n27#2,5:1023\n27#2,5:1028\n27#2,5:1033\n27#2,5:1038\n27#2,5:1043\n27#2,5:1048\n27#2,5:1053\n37#3,2:1004\n37#3,2:1010\n37#3,2:1012\n37#3,2:1014\n1855#4,2:1020\n*S KotlinDebug\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider\n*L\n204#1:996,5\n244#1:1001,3\n244#1:1006\n327#1:1007,3\n327#1:1016\n557#1:1017,3\n557#1:1022\n665#1:1023,5\n679#1:1028,5\n687#1:1033,5\n711#1:1038,5\n736#1:1043,5\n761#1:1048,5\n830#1:1053,5\n261#1:1004,2\n388#1:1010,2\n453#1:1012,2\n467#1:1014,2\n589#1:1020,2\n*E\n"})
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();

    @GuardedBy("mLock")
    @k
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;

    @l
    private CameraX mCameraX;

    @l
    @GuardedBy("mLock")
    private CameraXConfig.Provider mCameraXConfigProvider;

    @l
    @GuardedBy("mLock")
    private p1<CameraX> mCameraXInitializeFuture;

    @GuardedBy("mLock")
    @k
    private p1<Void> mCameraXShutdownFuture;

    @l
    private Context mContext;

    @k
    private final LifecycleCameraRepository mLifecycleCameraRepository;

    @k
    private final Object mLock = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nProcessCameraProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider$Companion\n+ 2 Trace.kt\nandroidx/tracing/TraceKt\n*L\n1#1,995:1\n27#2,5:996\n*S KotlinDebug\n*F\n+ 1 ProcessCameraProvider.kt\nandroidx/camera/lifecycle/ProcessCameraProvider$Companion\n*L\n992#1:996,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(x00.l tmp0, Object obj) {
            g0.p(tmp0, "$tmp0");
            return (ProcessCameraProvider) tmp0.invoke(obj);
        }

        @ExperimentalCameraProviderConfiguration
        @o
        public final void configureInstance(@k CameraXConfig cameraXConfig) {
            g0.p(cameraXConfig, "cameraXConfig");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
                g2 g2Var = g2.f100423a;
            } finally {
                Trace.endSection();
            }
        }

        @o
        @k
        public final p1<ProcessCameraProvider> getInstance(@k final Context context) {
            g0.p(context, "context");
            Preconditions.checkNotNull(context);
            p1 orCreateCameraXInstance = ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context);
            final x00.l<CameraX, ProcessCameraProvider> lVar = new x00.l<CameraX, ProcessCameraProvider>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$getInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final ProcessCameraProvider invoke(CameraX cameraX) {
                    ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                    g0.o(cameraX, "cameraX");
                    processCameraProvider.setCameraX(cameraX);
                    ProcessCameraProvider processCameraProvider2 = ProcessCameraProvider.sAppInstance;
                    Context applicationContext = ContextUtil.getApplicationContext(context);
                    g0.o(applicationContext, "getApplicationContext(context)");
                    processCameraProvider2.setContext(applicationContext);
                    return ProcessCameraProvider.sAppInstance;
                }
            };
            p1<ProcessCameraProvider> transform = Futures.transform(orCreateCameraXInstance, new Function() { // from class: androidx.camera.lifecycle.d
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    ProcessCameraProvider instance$lambda$0;
                    instance$lambda$0 = ProcessCameraProvider.Companion.getInstance$lambda$0(x00.l.this, obj);
                    return instance$lambda$0;
                }
            }, CameraXExecutors.directExecutor());
            g0.o(transform, "context: Context): Liste…tExecutor()\n            )");
            return transform;
        }

        private Companion() {
        }
    }

    private ProcessCameraProvider() {
        p1<Void> immediateFuture = Futures.immediateFuture(null);
        g0.o(immediateFuture, "immediateFuture<Void>(null)");
        this.mCameraXShutdownFuture = immediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    @ExperimentalCameraProviderConfiguration
    @o
    public static final void configureInstance(@k CameraXConfig cameraXConfig) {
        Companion.configureInstance(cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final CameraXConfig cameraXConfig) {
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.mLock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    @k
                    public final CameraXConfig getCameraXConfig() {
                        return CameraXConfig.this;
                    }
                };
                g2 g2Var = g2.f100423a;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        g0.m(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        g0.o(activeConcurrentCameraInfos, "mCameraX!!.cameraFactory…tiveConcurrentCameraInfos");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            g0.o(next, "cameraSelector.cameraFilterSet");
            CameraFilter cameraFilter = next;
            if (!g0.g(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.mContext;
                g0.m(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        g0.m(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    @o
    @k
    public static final p1<ProcessCameraProvider> getInstance(@k Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p1<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            p1<CameraX> p1Var = this.mCameraXInitializeFuture;
            if (p1Var != null) {
                g0.n(p1Var, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return p1Var;
            }
            final CameraX cameraX = new CameraX(context, this.mCameraXConfigProvider);
            p1<CameraX> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.a
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    Object orCreateCameraXInstance$lambda$18$lambda$17;
                    orCreateCameraXInstance$lambda$18$lambda$17 = ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider.this, cameraX, completer);
                    return orCreateCameraXInstance$lambda$18$lambda$17;
                }
            });
            this.mCameraXInitializeFuture = future;
            g0.n(future, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider this$0, final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        g0.p(this$0, "this$0");
        g0.p(cameraX, "$cameraX");
        g0.p(completer, "completer");
        synchronized (this$0.mLock) {
            FutureChain from = FutureChain.from(this$0.mCameraXShutdownFuture);
            final x00.l<Void, p1<Void>> lVar = new x00.l<Void, p1<Void>>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1
                {
                    super(1);
                }

                @Override // x00.l
                @k
                public final p1<Void> invoke(@l Void r12) {
                    return CameraX.this.getInitializeFuture();
                }
            };
            FutureChain transformAsync = from.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final p1 apply(Object obj) {
                    p1 orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15;
                    orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15 = ProcessCameraProvider.getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(x00.l.this, obj);
                    return orCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15;
                }
            }, CameraXExecutors.directExecutor());
            g0.o(transformAsync, "cameraX = CameraX(contex…                        )");
            Futures.addCallback(transformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(@k Throwable t11) {
                    g0.p(t11, "t");
                    completer.setException(t11);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(@l Void r22) {
                    completer.set(cameraX);
                }
            }, CameraXExecutors.directExecutor());
            g2 g2Var = g2.f100423a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p1 getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(x00.l tmp0, Object obj) {
        g0.p(tmp0, "$tmp0");
        return (p1) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        g0.m(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i11) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        g0.m(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(ProcessCameraProvider this$0) {
        g0.p(this$0, "this$0");
        this$0.unbindAll();
        this$0.mLifecycleCameraRepository.clear();
    }

    @MainThread
    @k
    public final Camera bindToLifecycle(@k LifecycleOwner lifecycleOwner, @k CameraSelector cameraSelector, @k UseCase... useCases) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(cameraSelector, "cameraSelector");
        g0.p(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
            g0.o(DEFAULT, "DEFAULT");
            g0.o(DEFAULT, "DEFAULT");
            Camera bindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, null, h0.J(), (UseCase[]) Arrays.copyOf(useCases, useCases.length));
            Trace.endSection();
            return bindToLifecycle$camera_lifecycle_release;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    @k
    public final Camera bindToLifecycle$camera_lifecycle_release(@k LifecycleOwner lifecycleOwner, @k CameraSelector primaryCameraSelector, @l CameraSelector cameraSelector, @k LayoutSettings primaryLayoutSettings, @k LayoutSettings secondaryLayoutSettings, @l ViewPort viewPort, @k List<? extends CameraEffect> effects, @k UseCase... useCases) {
        CameraInternal cameraInternal;
        RestrictedCameraInfo restrictedCameraInfo;
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(primaryCameraSelector, "primaryCameraSelector");
        g0.p(primaryLayoutSettings, "primaryLayoutSettings");
        g0.p(secondaryLayoutSettings, "secondaryLayoutSettings");
        g0.p(effects, "effects");
        g0.p(useCases, "useCases");
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            g0.m(cameraX);
            CameraInternal select = primaryCameraSelector.select(cameraX.getCameraRepository().getCameras());
            g0.o(select, "primaryCameraSelector.se…cameraRepository.cameras)");
            select.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(primaryCameraSelector);
            g0.n(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            if (cameraSelector != null) {
                CameraX cameraX2 = this.mCameraX;
                g0.m(cameraX2);
                CameraInternal select2 = cameraSelector.select(cameraX2.getCameraRepository().getCameras());
                select2.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(cameraSelector);
                g0.n(cameraInfo2, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                cameraInternal = select2;
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternal = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : a0.lb(useCases)) {
                for (LifecycleCamera lifecycleCameras2 : lifecycleCameras) {
                    g0.o(lifecycleCameras2, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera2 = lifecycleCameras2;
                    if (lifecycleCamera2.isBound(useCase) && !g0.g(lifecycleCamera2, lifecycleCamera)) {
                        w0 w0Var = w0.f67050a;
                        String format = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase}, 1));
                        g0.o(format, "format(format, *args)");
                        throw new IllegalStateException(format);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                g0.m(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                g0.m(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                g0.m(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(select, cameraInternal, restrictedCameraInfo2, restrictedCameraInfo, primaryLayoutSettings, secondaryLayoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            LifecycleCamera lifecycleCamera3 = lifecycleCamera;
            if (useCases.length == 0) {
                g0.m(lifecycleCamera3);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                g0.m(lifecycleCamera3);
                List Q = h0.Q(Arrays.copyOf(useCases, useCases.length));
                CameraX cameraX6 = this.mCameraX;
                g0.m(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera3, viewPort, effects, Q, cameraX6.getCameraFactory().getCameraCoordinator());
            }
            Trace.endSection();
            return lifecycleCamera3;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @k
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            g0.m(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            g0.o(cameras, "mCameraX!!.cameraRepository.cameras");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                g0.o(cameraInfo, "camera.cameraInfo");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @OptIn(markerClass = {ExperimentalCameraInfo.class})
    @k
    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            g0.m(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            g0.m(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            g0.o(concurrentCameraSelectors, "mCameraX!!.cameraFactory…concurrentCameraSelectors");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        g0.o(cameraSelector, "cameraSelector");
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @ExperimentalCameraInfo
    @k
    public CameraInfo getCameraInfo(@k CameraSelector cameraSelector) {
        Object obj;
        g0.p(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.mCameraX;
            g0.m(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            g0.o(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId create = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            g0.o(create, "create(\n                …ilityId\n                )");
            synchronized (this.mLock) {
                try {
                    obj = this.mCameraInfoMap.get(create);
                    if (obj == null) {
                        obj = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                        this.mCameraInfoMap.put(create, obj);
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (RestrictedCameraInfo) obj;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(@k CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        boolean z11;
        g0.p(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.mCameraX;
            g0.m(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z11 = true;
        } catch (IllegalArgumentException unused) {
            z11 = false;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        Trace.endSection();
        return z11;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(@k UseCase useCase) {
        g0.p(useCase, "useCase");
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            g0.o(lifecycleCamera, "mLifecycleCameraRepository.lifecycleCameras");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @MainThread
    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    @VisibleForTesting
    @k
    public final p1<Void> shutdownAsync() {
        p1<Void> immediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ProcessCameraProvider.shutdownAsync$lambda$0(ProcessCameraProvider.this);
            }
        });
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            g0.m(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        if (cameraX2 != null) {
            g0.m(cameraX2);
            immediateFuture = cameraX2.shutdown();
        } else {
            immediateFuture = Futures.immediateFuture(null);
        }
        g0.o(immediateFuture, "if (mCameraX != null) mC…mediateFuture<Void>(null)");
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = immediateFuture;
            this.mCameraInfoMap.clear();
            g2 g2Var = g2.f100423a;
        }
        this.mCameraX = null;
        this.mContext = null;
        return immediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbind(@k UseCase... useCases) {
        g0.p(useCases, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.mLifecycleCameraRepository.unbind(h0.Q(Arrays.copyOf(useCases, useCases.length)));
            g2 g2Var = g2.f100423a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    @MainThread
    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.mLifecycleCameraRepository.unbindAll();
            g2 g2Var = g2.f100423a;
        } finally {
            Trace.endSection();
        }
    }

    @MainThread
    @k
    public final Camera bindToLifecycle(@k LifecycleOwner lifecycleOwner, @k CameraSelector cameraSelector, @k UseCaseGroup useCaseGroup) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(cameraSelector, "cameraSelector");
        g0.p(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings DEFAULT = LayoutSettings.DEFAULT;
                g0.o(DEFAULT, "DEFAULT");
                g0.o(DEFAULT, "DEFAULT");
                ViewPort viewPort = useCaseGroup.getViewPort();
                List<CameraEffect> effects = useCaseGroup.getEffects();
                g0.o(effects, "useCaseGroup.effects");
                List<UseCase> useCases = useCaseGroup.getUseCases();
                g0.o(useCases, "useCaseGroup.useCases");
                UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
                Camera bindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, DEFAULT, DEFAULT, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
                Trace.endSection();
                return bindToLifecycle$camera_lifecycle_release;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f8, code lost:
    
        if (isPreview(r3) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0209, code lost:
    
        r2 = r2.getLifecycleOwner();
        kotlin.jvm.internal.g0.o(r2, "firstCameraConfig.lifecycleOwner");
        r3 = r2.getCameraSelector();
        kotlin.jvm.internal.g0.o(r3, "firstCameraConfig.cameraSelector");
        r4 = r5.getCameraSelector();
        r5 = r2.getLayoutSettings();
        kotlin.jvm.internal.g0.o(r5, "firstCameraConfig.layoutSettings");
        r0 = r5.getLayoutSettings();
        kotlin.jvm.internal.g0.o(r0, "secondCameraConfig.layoutSettings");
        r8 = r2.getUseCaseGroup().getViewPort();
        r9 = r2.getUseCaseGroup().getEffects();
        kotlin.jvm.internal.g0.o(r9, "firstCameraConfig.useCaseGroup.effects");
        r6 = r2.getUseCaseGroup().getUseCases();
        kotlin.jvm.internal.g0.o(r6, "firstCameraConfig.useCaseGroup.useCases");
        r6 = (androidx.camera.core.UseCase[]) r6.toArray(new androidx.camera.core.UseCase[0]);
        r11.add(bindToLifecycle$camera_lifecycle_release(r2, r3, r4, r5, r0, r8, r9, (androidx.camera.core.UseCase[]) java.util.Arrays.copyOf(r6, r6.length)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0207, code lost:
    
        if (isVideoCapture(r3) != false) goto L61;
     */
    @androidx.annotation.OptIn(markerClass = {androidx.camera.core.ExperimentalCameraInfo.class})
    @androidx.annotation.MainThread
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.ConcurrentCamera bindToLifecycle(@m80.k java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r17) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.ProcessCameraProvider.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }
}
