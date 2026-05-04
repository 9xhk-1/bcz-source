package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.p1;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@OptIn(markerClass = {ExperimentalRetryPolicy.class})
@MainThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    final CameraRepository mCameraRepository;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final p1<Void> mInitInternalFuture;

    @GuardedBy("mInitializeLock")
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final Handler mSchedulerHandler;

    @Nullable
    private final HandlerThread mSchedulerThread;

    @GuardedBy("mInitializeLock")
    private p1<Void> mShutdownInternalFuture;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraX(@NonNull Context context, @Nullable CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(final androidx.camera.core.CameraX r14, android.content.Context r15, final java.util.concurrent.Executor r16, final int r17, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer r18, final long r19) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.a(androidx.camera.core.CameraX, android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.CallbackToFutureAdapter$Completer, long):void");
    }

    public static /* synthetic */ void b(CameraX cameraX, CallbackToFutureAdapter.Completer completer) {
        if (cameraX.mSchedulerThread != null) {
            Executor executor = cameraX.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            cameraX.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    public static /* synthetic */ Object c(CameraX cameraX, Context context, CallbackToFutureAdapter.Completer completer) {
        cameraX.initAndRetryRecursively(cameraX.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, completer);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) {
        cameraX.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.d
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.b(CameraX.this, completer);
            }
        }, cameraX.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    private static void decreaseMinLogLevelReference(@Nullable Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                int intValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                updateOrResetMinLogLevel();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    private static CameraXConfig.Provider getConfigProvider(@NonNull Context context) {
        ComponentCallbacks2 applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e12) {
            e = e12;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e13) {
            e = e13;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e14) {
            e = e14;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e17) {
            e = e17;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(@Nullable Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                updateOrResetMinLogLevel();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAndRetryRecursively(@NonNull final Executor executor, final long j11, final int i11, @NonNull final Context context, @NonNull final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.a(CameraX.this, context, executor, i11, completer, j11);
            }
        });
    }

    private p1<Void> initInternal(@NonNull final Context context) {
        p1<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.g
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.c(CameraX.this, context, completer);
                }
            });
        }
        return future;
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    @NonNull
    private p1<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            try {
                this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
                int ordinal = this.mInitState.ordinal();
                if (ordinal == 0) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    return Futures.immediateFuture(null);
                }
                if (ordinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (ordinal == 2 || ordinal == 3) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    decreaseMinLogLevelReference(this.mMinLogLevel);
                    this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.h
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CameraX.d(CameraX.this, completer);
                        }
                    });
                }
                return this.mShutdownInternalFuture;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void traceExecutionState(@Nullable RetryPolicy.ExecutionState executionState) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }

    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private static void updateQuirkSettings(@NonNull Context context, @Nullable QuirkSettings quirkSettings, @NonNull Function<Context, QuirkSettings> function) {
        if (quirkSettings != null) {
            Logger.d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = function.apply(context);
            Logger.d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Logger.d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p1<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public boolean isInitialized() {
        boolean z11;
        synchronized (this.mInitializeLock) {
            z11 = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z11;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public p1<Void> shutdown() {
        return shutdownInternal();
    }

    @VisibleForTesting
    public CameraX(@NonNull Context context, @Nullable CameraXConfig.Provider provider, @NonNull Function<Context, QuirkSettings> function) {
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), function);
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mInitInternalFuture = initInternal(context);
    }
}
